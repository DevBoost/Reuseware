/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.text.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;
import org.oasisopen.names.tc.opendocument.xmlns.text.PageCountType;
import org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Page Count Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.PageCountTypeImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.PageCountTypeImpl#getNumFormat <em>Num Format</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.PageCountTypeImpl#getNumLetterSync <em>Num Letter Sync</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PageCountTypeImpl extends EObjectImpl implements PageCountType {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PageCountTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TextPackage.eINSTANCE.getPageCountType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, TextPackage.PAGE_COUNT_TYPE__MIXED);
		}
		return mixed;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.PAGE_COUNT_TYPE__NUM_FORMAT, oldNumFormat, numFormat));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.PAGE_COUNT_TYPE__NUM_LETTER_SYNC, oldNumLetterSync, numLetterSync, !oldNumLetterSyncESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, TextPackage.PAGE_COUNT_TYPE__NUM_LETTER_SYNC, oldNumLetterSync, NUM_LETTER_SYNC_EDEFAULT, oldNumLetterSyncESet));
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
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TextPackage.PAGE_COUNT_TYPE__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
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
			case TextPackage.PAGE_COUNT_TYPE__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case TextPackage.PAGE_COUNT_TYPE__NUM_FORMAT:
				return getNumFormat();
			case TextPackage.PAGE_COUNT_TYPE__NUM_LETTER_SYNC:
				return getNumLetterSync();
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
			case TextPackage.PAGE_COUNT_TYPE__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case TextPackage.PAGE_COUNT_TYPE__NUM_FORMAT:
				setNumFormat(newValue);
				return;
			case TextPackage.PAGE_COUNT_TYPE__NUM_LETTER_SYNC:
				setNumLetterSync((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
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
			case TextPackage.PAGE_COUNT_TYPE__MIXED:
				getMixed().clear();
				return;
			case TextPackage.PAGE_COUNT_TYPE__NUM_FORMAT:
				setNumFormat(NUM_FORMAT_EDEFAULT);
				return;
			case TextPackage.PAGE_COUNT_TYPE__NUM_LETTER_SYNC:
				unsetNumLetterSync();
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
			case TextPackage.PAGE_COUNT_TYPE__MIXED:
				return mixed != null && !mixed.isEmpty();
			case TextPackage.PAGE_COUNT_TYPE__NUM_FORMAT:
				return NUM_FORMAT_EDEFAULT == null ? numFormat != null : !NUM_FORMAT_EDEFAULT.equals(numFormat);
			case TextPackage.PAGE_COUNT_TYPE__NUM_LETTER_SYNC:
				return isSetNumLetterSync();
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
		result.append(", numFormat: ");
		result.append(numFormat);
		result.append(", numLetterSync: ");
		if (numLetterSyncESet) result.append(numLetterSync); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //PageCountTypeImpl
