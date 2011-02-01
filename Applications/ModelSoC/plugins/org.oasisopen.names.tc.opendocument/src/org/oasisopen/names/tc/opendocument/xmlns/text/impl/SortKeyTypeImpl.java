/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.text.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.oasisopen.names.tc.opendocument.xmlns.text.KeyType;
import org.oasisopen.names.tc.opendocument.xmlns.text.SortKeyType;
import org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sort Key Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.SortKeyTypeImpl#getKey <em>Key</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.SortKeyTypeImpl#getSortAscending <em>Sort Ascending</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SortKeyTypeImpl extends EObjectImpl implements SortKeyType {
	/**
	 * The default value of the '{@link #getKey() <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKey()
	 * @generated
	 * @ordered
	 */
	protected static final KeyType KEY_EDEFAULT = KeyType.ADDRESS;

	/**
	 * The cached value of the '{@link #getKey() <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKey()
	 * @generated
	 * @ordered
	 */
	protected KeyType key = KEY_EDEFAULT;

	/**
	 * This is true if the Key attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean keyESet;

	/**
	 * The default value of the '{@link #getSortAscending() <em>Sort Ascending</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSortAscending()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean SORT_ASCENDING_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getSortAscending() <em>Sort Ascending</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSortAscending()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean sortAscending = SORT_ASCENDING_EDEFAULT;

	/**
	 * This is true if the Sort Ascending attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean sortAscendingESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SortKeyTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TextPackage.eINSTANCE.getSortKeyType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KeyType getKey() {
		return key;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKey(KeyType newKey) {
		KeyType oldKey = key;
		key = newKey == null ? KEY_EDEFAULT : newKey;
		boolean oldKeyESet = keyESet;
		keyESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.SORT_KEY_TYPE__KEY, oldKey, key, !oldKeyESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetKey() {
		KeyType oldKey = key;
		boolean oldKeyESet = keyESet;
		key = KEY_EDEFAULT;
		keyESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TextPackage.SORT_KEY_TYPE__KEY, oldKey, KEY_EDEFAULT, oldKeyESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetKey() {
		return keyESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getSortAscending() {
		return sortAscending;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSortAscending(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newSortAscending) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldSortAscending = sortAscending;
		sortAscending = newSortAscending == null ? SORT_ASCENDING_EDEFAULT : newSortAscending;
		boolean oldSortAscendingESet = sortAscendingESet;
		sortAscendingESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.SORT_KEY_TYPE__SORT_ASCENDING, oldSortAscending, sortAscending, !oldSortAscendingESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSortAscending() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldSortAscending = sortAscending;
		boolean oldSortAscendingESet = sortAscendingESet;
		sortAscending = SORT_ASCENDING_EDEFAULT;
		sortAscendingESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TextPackage.SORT_KEY_TYPE__SORT_ASCENDING, oldSortAscending, SORT_ASCENDING_EDEFAULT, oldSortAscendingESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSortAscending() {
		return sortAscendingESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TextPackage.SORT_KEY_TYPE__KEY:
				return getKey();
			case TextPackage.SORT_KEY_TYPE__SORT_ASCENDING:
				return getSortAscending();
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
			case TextPackage.SORT_KEY_TYPE__KEY:
				setKey((KeyType)newValue);
				return;
			case TextPackage.SORT_KEY_TYPE__SORT_ASCENDING:
				setSortAscending((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
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
			case TextPackage.SORT_KEY_TYPE__KEY:
				unsetKey();
				return;
			case TextPackage.SORT_KEY_TYPE__SORT_ASCENDING:
				unsetSortAscending();
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
			case TextPackage.SORT_KEY_TYPE__KEY:
				return isSetKey();
			case TextPackage.SORT_KEY_TYPE__SORT_ASCENDING:
				return isSetSortAscending();
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
		result.append(" (key: ");
		if (keyESet) result.append(key); else result.append("<unset>");
		result.append(", sortAscending: ");
		if (sortAscendingESet) result.append(sortAscending); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //SortKeyTypeImpl
