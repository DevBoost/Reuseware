/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.text.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;
import org.oasisopen.names.tc.opendocument.xmlns.config.ConfigItemMapIndexedType;
import org.oasisopen.names.tc.opendocument.xmlns.config.ConfigItemMapNamedType;
import org.oasisopen.names.tc.opendocument.xmlns.config.ConfigItemSetType;
import org.oasisopen.names.tc.opendocument.xmlns.config.ConfigItemType;
import org.oasisopen.names.tc.opendocument.xmlns.text.ConfigItems;
import org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Config Items</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.ConfigItemsImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.ConfigItemsImpl#getConfigItem <em>Config Item</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.ConfigItemsImpl#getConfigItemSet <em>Config Item Set</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.ConfigItemsImpl#getConfigItemMapNamed <em>Config Item Map Named</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.ConfigItemsImpl#getConfigItemMapIndexed <em>Config Item Map Indexed</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConfigItemsImpl extends EObjectImpl implements ConfigItems {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConfigItemsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TextPackage.eINSTANCE.getConfigItems();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, TextPackage.CONFIG_ITEMS__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConfigItemType> getConfigItem() {
		return getGroup().list(TextPackage.eINSTANCE.getConfigItems_ConfigItem());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConfigItemSetType> getConfigItemSet() {
		return getGroup().list(TextPackage.eINSTANCE.getConfigItems_ConfigItemSet());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConfigItemMapNamedType> getConfigItemMapNamed() {
		return getGroup().list(TextPackage.eINSTANCE.getConfigItems_ConfigItemMapNamed());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConfigItemMapIndexedType> getConfigItemMapIndexed() {
		return getGroup().list(TextPackage.eINSTANCE.getConfigItems_ConfigItemMapIndexed());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TextPackage.CONFIG_ITEMS__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case TextPackage.CONFIG_ITEMS__CONFIG_ITEM:
				return ((InternalEList<?>)getConfigItem()).basicRemove(otherEnd, msgs);
			case TextPackage.CONFIG_ITEMS__CONFIG_ITEM_SET:
				return ((InternalEList<?>)getConfigItemSet()).basicRemove(otherEnd, msgs);
			case TextPackage.CONFIG_ITEMS__CONFIG_ITEM_MAP_NAMED:
				return ((InternalEList<?>)getConfigItemMapNamed()).basicRemove(otherEnd, msgs);
			case TextPackage.CONFIG_ITEMS__CONFIG_ITEM_MAP_INDEXED:
				return ((InternalEList<?>)getConfigItemMapIndexed()).basicRemove(otherEnd, msgs);
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
			case TextPackage.CONFIG_ITEMS__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case TextPackage.CONFIG_ITEMS__CONFIG_ITEM:
				return getConfigItem();
			case TextPackage.CONFIG_ITEMS__CONFIG_ITEM_SET:
				return getConfigItemSet();
			case TextPackage.CONFIG_ITEMS__CONFIG_ITEM_MAP_NAMED:
				return getConfigItemMapNamed();
			case TextPackage.CONFIG_ITEMS__CONFIG_ITEM_MAP_INDEXED:
				return getConfigItemMapIndexed();
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
			case TextPackage.CONFIG_ITEMS__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case TextPackage.CONFIG_ITEMS__CONFIG_ITEM:
				getConfigItem().clear();
				getConfigItem().addAll((Collection<? extends ConfigItemType>)newValue);
				return;
			case TextPackage.CONFIG_ITEMS__CONFIG_ITEM_SET:
				getConfigItemSet().clear();
				getConfigItemSet().addAll((Collection<? extends ConfigItemSetType>)newValue);
				return;
			case TextPackage.CONFIG_ITEMS__CONFIG_ITEM_MAP_NAMED:
				getConfigItemMapNamed().clear();
				getConfigItemMapNamed().addAll((Collection<? extends ConfigItemMapNamedType>)newValue);
				return;
			case TextPackage.CONFIG_ITEMS__CONFIG_ITEM_MAP_INDEXED:
				getConfigItemMapIndexed().clear();
				getConfigItemMapIndexed().addAll((Collection<? extends ConfigItemMapIndexedType>)newValue);
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
			case TextPackage.CONFIG_ITEMS__GROUP:
				getGroup().clear();
				return;
			case TextPackage.CONFIG_ITEMS__CONFIG_ITEM:
				getConfigItem().clear();
				return;
			case TextPackage.CONFIG_ITEMS__CONFIG_ITEM_SET:
				getConfigItemSet().clear();
				return;
			case TextPackage.CONFIG_ITEMS__CONFIG_ITEM_MAP_NAMED:
				getConfigItemMapNamed().clear();
				return;
			case TextPackage.CONFIG_ITEMS__CONFIG_ITEM_MAP_INDEXED:
				getConfigItemMapIndexed().clear();
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
			case TextPackage.CONFIG_ITEMS__GROUP:
				return group != null && !group.isEmpty();
			case TextPackage.CONFIG_ITEMS__CONFIG_ITEM:
				return !getConfigItem().isEmpty();
			case TextPackage.CONFIG_ITEMS__CONFIG_ITEM_SET:
				return !getConfigItemSet().isEmpty();
			case TextPackage.CONFIG_ITEMS__CONFIG_ITEM_MAP_NAMED:
				return !getConfigItemMapNamed().isEmpty();
			case TextPackage.CONFIG_ITEMS__CONFIG_ITEM_MAP_INDEXED:
				return !getConfigItemMapIndexed().isEmpty();
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
		result.append(" (group: ");
		result.append(group);
		result.append(')');
		return result.toString();
	}

} //ConfigItemsImpl
