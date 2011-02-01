/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.config.impl;

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
import org.oasisopen.names.tc.opendocument.xmlns.config.ConfigItemMapEntryType;
import org.oasisopen.names.tc.opendocument.xmlns.config.ConfigItemMapNamedType;
import org.oasisopen.names.tc.opendocument.xmlns.config.ConfigPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Item Map Named Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.config.impl.ConfigItemMapNamedTypeImpl#getConfigItemMapEntry <em>Config Item Map Entry</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.config.impl.ConfigItemMapNamedTypeImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConfigItemMapNamedTypeImpl extends EObjectImpl implements ConfigItemMapNamedType {
	/**
	 * The cached value of the '{@link #getConfigItemMapEntry() <em>Config Item Map Entry</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigItemMapEntry()
	 * @generated
	 * @ordered
	 */
	protected EList<ConfigItemMapEntryType> configItemMapEntry;

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
	protected ConfigItemMapNamedTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConfigPackage.Literals.CONFIG_ITEM_MAP_NAMED_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConfigItemMapEntryType> getConfigItemMapEntry() {
		if (configItemMapEntry == null) {
			configItemMapEntry = new EObjectContainmentEList<ConfigItemMapEntryType>(ConfigItemMapEntryType.class, this, ConfigPackage.CONFIG_ITEM_MAP_NAMED_TYPE__CONFIG_ITEM_MAP_ENTRY);
		}
		return configItemMapEntry;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigPackage.CONFIG_ITEM_MAP_NAMED_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ConfigPackage.CONFIG_ITEM_MAP_NAMED_TYPE__CONFIG_ITEM_MAP_ENTRY:
				return ((InternalEList<?>)getConfigItemMapEntry()).basicRemove(otherEnd, msgs);
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
			case ConfigPackage.CONFIG_ITEM_MAP_NAMED_TYPE__CONFIG_ITEM_MAP_ENTRY:
				return getConfigItemMapEntry();
			case ConfigPackage.CONFIG_ITEM_MAP_NAMED_TYPE__NAME:
				return getName();
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
			case ConfigPackage.CONFIG_ITEM_MAP_NAMED_TYPE__CONFIG_ITEM_MAP_ENTRY:
				getConfigItemMapEntry().clear();
				getConfigItemMapEntry().addAll((Collection<? extends ConfigItemMapEntryType>)newValue);
				return;
			case ConfigPackage.CONFIG_ITEM_MAP_NAMED_TYPE__NAME:
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
			case ConfigPackage.CONFIG_ITEM_MAP_NAMED_TYPE__CONFIG_ITEM_MAP_ENTRY:
				getConfigItemMapEntry().clear();
				return;
			case ConfigPackage.CONFIG_ITEM_MAP_NAMED_TYPE__NAME:
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
			case ConfigPackage.CONFIG_ITEM_MAP_NAMED_TYPE__CONFIG_ITEM_MAP_ENTRY:
				return configItemMapEntry != null && !configItemMapEntry.isEmpty();
			case ConfigPackage.CONFIG_ITEM_MAP_NAMED_TYPE__NAME:
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ConfigItemMapNamedTypeImpl
