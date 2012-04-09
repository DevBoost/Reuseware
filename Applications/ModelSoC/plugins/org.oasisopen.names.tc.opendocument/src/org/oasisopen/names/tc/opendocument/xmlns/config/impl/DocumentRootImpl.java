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
package org.oasisopen.names.tc.opendocument.xmlns.config.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl;
import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;
import org.oasisopen.names.tc.opendocument.xmlns.config.ConfigItemMapEntryType;
import org.oasisopen.names.tc.opendocument.xmlns.config.ConfigItemMapIndexedType;
import org.oasisopen.names.tc.opendocument.xmlns.config.ConfigItemMapNamedType;
import org.oasisopen.names.tc.opendocument.xmlns.config.ConfigItemSetType;
import org.oasisopen.names.tc.opendocument.xmlns.config.ConfigItemType;
import org.oasisopen.names.tc.opendocument.xmlns.config.ConfigPackage;
import org.oasisopen.names.tc.opendocument.xmlns.config.DocumentRoot;
import org.oasisopen.names.tc.opendocument.xmlns.config.TypeType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.config.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.config.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.config.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.config.impl.DocumentRootImpl#getConfigItem <em>Config Item</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.config.impl.DocumentRootImpl#getConfigItemMapEntry <em>Config Item Map Entry</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.config.impl.DocumentRootImpl#getConfigItemMapIndexed <em>Config Item Map Indexed</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.config.impl.DocumentRootImpl#getConfigItemMapNamed <em>Config Item Map Named</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.config.impl.DocumentRootImpl#getConfigItemSet <em>Config Item Set</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.config.impl.DocumentRootImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.config.impl.DocumentRootImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DocumentRootImpl extends EObjectImpl implements DocumentRoot {
	/**
	 * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMixed()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap mixed;

	/**
	 * The cached value of the '{@link #getXMLNSPrefixMap() <em>XMLNS Prefix Map</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXMLNSPrefixMap()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xMLNSPrefixMap;

	/**
	 * The cached value of the '{@link #getXSISchemaLocation() <em>XSI Schema Location</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXSISchemaLocation()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xSISchemaLocation;

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
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final TypeType TYPE_EDEFAULT = TypeType.BOOLEAN;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected TypeType type = TYPE_EDEFAULT;

	/**
	 * This is true if the Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConfigPackage.Literals.DOCUMENT_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, ConfigPackage.DOCUMENT_ROOT__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getXMLNSPrefixMap() {
		if (xMLNSPrefixMap == null) {
			xMLNSPrefixMap = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, ConfigPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		}
		return xMLNSPrefixMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getXSISchemaLocation() {
		if (xSISchemaLocation == null) {
			xSISchemaLocation = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, ConfigPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		}
		return xSISchemaLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigItemType getConfigItem() {
		return (ConfigItemType)getMixed().get(ConfigPackage.Literals.DOCUMENT_ROOT__CONFIG_ITEM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConfigItem(ConfigItemType newConfigItem, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ConfigPackage.Literals.DOCUMENT_ROOT__CONFIG_ITEM, newConfigItem, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfigItem(ConfigItemType newConfigItem) {
		((FeatureMap.Internal)getMixed()).set(ConfigPackage.Literals.DOCUMENT_ROOT__CONFIG_ITEM, newConfigItem);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigItemMapEntryType getConfigItemMapEntry() {
		return (ConfigItemMapEntryType)getMixed().get(ConfigPackage.Literals.DOCUMENT_ROOT__CONFIG_ITEM_MAP_ENTRY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConfigItemMapEntry(ConfigItemMapEntryType newConfigItemMapEntry, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ConfigPackage.Literals.DOCUMENT_ROOT__CONFIG_ITEM_MAP_ENTRY, newConfigItemMapEntry, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfigItemMapEntry(ConfigItemMapEntryType newConfigItemMapEntry) {
		((FeatureMap.Internal)getMixed()).set(ConfigPackage.Literals.DOCUMENT_ROOT__CONFIG_ITEM_MAP_ENTRY, newConfigItemMapEntry);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigItemMapIndexedType getConfigItemMapIndexed() {
		return (ConfigItemMapIndexedType)getMixed().get(ConfigPackage.Literals.DOCUMENT_ROOT__CONFIG_ITEM_MAP_INDEXED, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConfigItemMapIndexed(ConfigItemMapIndexedType newConfigItemMapIndexed, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ConfigPackage.Literals.DOCUMENT_ROOT__CONFIG_ITEM_MAP_INDEXED, newConfigItemMapIndexed, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfigItemMapIndexed(ConfigItemMapIndexedType newConfigItemMapIndexed) {
		((FeatureMap.Internal)getMixed()).set(ConfigPackage.Literals.DOCUMENT_ROOT__CONFIG_ITEM_MAP_INDEXED, newConfigItemMapIndexed);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigItemMapNamedType getConfigItemMapNamed() {
		return (ConfigItemMapNamedType)getMixed().get(ConfigPackage.Literals.DOCUMENT_ROOT__CONFIG_ITEM_MAP_NAMED, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConfigItemMapNamed(ConfigItemMapNamedType newConfigItemMapNamed, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ConfigPackage.Literals.DOCUMENT_ROOT__CONFIG_ITEM_MAP_NAMED, newConfigItemMapNamed, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfigItemMapNamed(ConfigItemMapNamedType newConfigItemMapNamed) {
		((FeatureMap.Internal)getMixed()).set(ConfigPackage.Literals.DOCUMENT_ROOT__CONFIG_ITEM_MAP_NAMED, newConfigItemMapNamed);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigItemSetType getConfigItemSet() {
		return (ConfigItemSetType)getMixed().get(ConfigPackage.Literals.DOCUMENT_ROOT__CONFIG_ITEM_SET, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConfigItemSet(ConfigItemSetType newConfigItemSet, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ConfigPackage.Literals.DOCUMENT_ROOT__CONFIG_ITEM_SET, newConfigItemSet, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfigItemSet(ConfigItemSetType newConfigItemSet) {
		((FeatureMap.Internal)getMixed()).set(ConfigPackage.Literals.DOCUMENT_ROOT__CONFIG_ITEM_SET, newConfigItemSet);
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
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigPackage.DOCUMENT_ROOT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(TypeType newType) {
		TypeType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		boolean oldTypeESet = typeESet;
		typeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigPackage.DOCUMENT_ROOT__TYPE, oldType, type, !oldTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetType() {
		TypeType oldType = type;
		boolean oldTypeESet = typeESet;
		type = TYPE_EDEFAULT;
		typeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ConfigPackage.DOCUMENT_ROOT__TYPE, oldType, TYPE_EDEFAULT, oldTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetType() {
		return typeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ConfigPackage.DOCUMENT_ROOT__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case ConfigPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return ((InternalEList<?>)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
			case ConfigPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return ((InternalEList<?>)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
			case ConfigPackage.DOCUMENT_ROOT__CONFIG_ITEM:
				return basicSetConfigItem(null, msgs);
			case ConfigPackage.DOCUMENT_ROOT__CONFIG_ITEM_MAP_ENTRY:
				return basicSetConfigItemMapEntry(null, msgs);
			case ConfigPackage.DOCUMENT_ROOT__CONFIG_ITEM_MAP_INDEXED:
				return basicSetConfigItemMapIndexed(null, msgs);
			case ConfigPackage.DOCUMENT_ROOT__CONFIG_ITEM_MAP_NAMED:
				return basicSetConfigItemMapNamed(null, msgs);
			case ConfigPackage.DOCUMENT_ROOT__CONFIG_ITEM_SET:
				return basicSetConfigItemSet(null, msgs);
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
			case ConfigPackage.DOCUMENT_ROOT__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case ConfigPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				if (coreType) return getXMLNSPrefixMap();
				else return getXMLNSPrefixMap().map();
			case ConfigPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				if (coreType) return getXSISchemaLocation();
				else return getXSISchemaLocation().map();
			case ConfigPackage.DOCUMENT_ROOT__CONFIG_ITEM:
				return getConfigItem();
			case ConfigPackage.DOCUMENT_ROOT__CONFIG_ITEM_MAP_ENTRY:
				return getConfigItemMapEntry();
			case ConfigPackage.DOCUMENT_ROOT__CONFIG_ITEM_MAP_INDEXED:
				return getConfigItemMapIndexed();
			case ConfigPackage.DOCUMENT_ROOT__CONFIG_ITEM_MAP_NAMED:
				return getConfigItemMapNamed();
			case ConfigPackage.DOCUMENT_ROOT__CONFIG_ITEM_SET:
				return getConfigItemSet();
			case ConfigPackage.DOCUMENT_ROOT__NAME:
				return getName();
			case ConfigPackage.DOCUMENT_ROOT__TYPE:
				return getType();
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
			case ConfigPackage.DOCUMENT_ROOT__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case ConfigPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
				return;
			case ConfigPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
				return;
			case ConfigPackage.DOCUMENT_ROOT__CONFIG_ITEM:
				setConfigItem((ConfigItemType)newValue);
				return;
			case ConfigPackage.DOCUMENT_ROOT__CONFIG_ITEM_MAP_ENTRY:
				setConfigItemMapEntry((ConfigItemMapEntryType)newValue);
				return;
			case ConfigPackage.DOCUMENT_ROOT__CONFIG_ITEM_MAP_INDEXED:
				setConfigItemMapIndexed((ConfigItemMapIndexedType)newValue);
				return;
			case ConfigPackage.DOCUMENT_ROOT__CONFIG_ITEM_MAP_NAMED:
				setConfigItemMapNamed((ConfigItemMapNamedType)newValue);
				return;
			case ConfigPackage.DOCUMENT_ROOT__CONFIG_ITEM_SET:
				setConfigItemSet((ConfigItemSetType)newValue);
				return;
			case ConfigPackage.DOCUMENT_ROOT__NAME:
				setName((String)newValue);
				return;
			case ConfigPackage.DOCUMENT_ROOT__TYPE:
				setType((TypeType)newValue);
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
			case ConfigPackage.DOCUMENT_ROOT__MIXED:
				getMixed().clear();
				return;
			case ConfigPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				getXMLNSPrefixMap().clear();
				return;
			case ConfigPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				getXSISchemaLocation().clear();
				return;
			case ConfigPackage.DOCUMENT_ROOT__CONFIG_ITEM:
				setConfigItem((ConfigItemType)null);
				return;
			case ConfigPackage.DOCUMENT_ROOT__CONFIG_ITEM_MAP_ENTRY:
				setConfigItemMapEntry((ConfigItemMapEntryType)null);
				return;
			case ConfigPackage.DOCUMENT_ROOT__CONFIG_ITEM_MAP_INDEXED:
				setConfigItemMapIndexed((ConfigItemMapIndexedType)null);
				return;
			case ConfigPackage.DOCUMENT_ROOT__CONFIG_ITEM_MAP_NAMED:
				setConfigItemMapNamed((ConfigItemMapNamedType)null);
				return;
			case ConfigPackage.DOCUMENT_ROOT__CONFIG_ITEM_SET:
				setConfigItemSet((ConfigItemSetType)null);
				return;
			case ConfigPackage.DOCUMENT_ROOT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ConfigPackage.DOCUMENT_ROOT__TYPE:
				unsetType();
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
			case ConfigPackage.DOCUMENT_ROOT__MIXED:
				return mixed != null && !mixed.isEmpty();
			case ConfigPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
			case ConfigPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
			case ConfigPackage.DOCUMENT_ROOT__CONFIG_ITEM:
				return getConfigItem() != null;
			case ConfigPackage.DOCUMENT_ROOT__CONFIG_ITEM_MAP_ENTRY:
				return getConfigItemMapEntry() != null;
			case ConfigPackage.DOCUMENT_ROOT__CONFIG_ITEM_MAP_INDEXED:
				return getConfigItemMapIndexed() != null;
			case ConfigPackage.DOCUMENT_ROOT__CONFIG_ITEM_MAP_NAMED:
				return getConfigItemMapNamed() != null;
			case ConfigPackage.DOCUMENT_ROOT__CONFIG_ITEM_SET:
				return getConfigItemSet() != null;
			case ConfigPackage.DOCUMENT_ROOT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ConfigPackage.DOCUMENT_ROOT__TYPE:
				return isSetType();
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
		result.append(" (mixed: ");
		result.append(mixed);
		result.append(", name: ");
		result.append(name);
		result.append(", type: ");
		if (typeESet) result.append(type); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //DocumentRootImpl
