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
import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;
import org.oasisopen.names.tc.opendocument.xmlns.text.PageNumberType;
import org.oasisopen.names.tc.opendocument.xmlns.text.SelectPageType1;
import org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Page Number Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.PageNumberTypeImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.PageNumberTypeImpl#getFixed <em>Fixed</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.PageNumberTypeImpl#getNumFormat <em>Num Format</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.PageNumberTypeImpl#getNumLetterSync <em>Num Letter Sync</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.PageNumberTypeImpl#getPageAdjust <em>Page Adjust</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.PageNumberTypeImpl#getSelectPage <em>Select Page</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PageNumberTypeImpl extends EObjectImpl implements PageNumberType {
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
	 * The default value of the '{@link #getFixed() <em>Fixed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixed()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean FIXED_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getFixed() <em>Fixed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixed()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean fixed = FIXED_EDEFAULT;

	/**
	 * This is true if the Fixed attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean fixedESet;

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
	 * The default value of the '{@link #getPageAdjust() <em>Page Adjust</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPageAdjust()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger PAGE_ADJUST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPageAdjust() <em>Page Adjust</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPageAdjust()
	 * @generated
	 * @ordered
	 */
	protected BigInteger pageAdjust = PAGE_ADJUST_EDEFAULT;

	/**
	 * The default value of the '{@link #getSelectPage() <em>Select Page</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectPage()
	 * @generated
	 * @ordered
	 */
	protected static final SelectPageType1 SELECT_PAGE_EDEFAULT = SelectPageType1.PREVIOUS;

	/**
	 * The cached value of the '{@link #getSelectPage() <em>Select Page</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectPage()
	 * @generated
	 * @ordered
	 */
	protected SelectPageType1 selectPage = SELECT_PAGE_EDEFAULT;

	/**
	 * This is true if the Select Page attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean selectPageESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PageNumberTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TextPackage.eINSTANCE.getPageNumberType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, TextPackage.PAGE_NUMBER_TYPE__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getFixed() {
		return fixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFixed(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newFixed) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldFixed = fixed;
		fixed = newFixed == null ? FIXED_EDEFAULT : newFixed;
		boolean oldFixedESet = fixedESet;
		fixedESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.PAGE_NUMBER_TYPE__FIXED, oldFixed, fixed, !oldFixedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFixed() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldFixed = fixed;
		boolean oldFixedESet = fixedESet;
		fixed = FIXED_EDEFAULT;
		fixedESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TextPackage.PAGE_NUMBER_TYPE__FIXED, oldFixed, FIXED_EDEFAULT, oldFixedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFixed() {
		return fixedESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.PAGE_NUMBER_TYPE__NUM_FORMAT, oldNumFormat, numFormat));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.PAGE_NUMBER_TYPE__NUM_LETTER_SYNC, oldNumLetterSync, numLetterSync, !oldNumLetterSyncESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, TextPackage.PAGE_NUMBER_TYPE__NUM_LETTER_SYNC, oldNumLetterSync, NUM_LETTER_SYNC_EDEFAULT, oldNumLetterSyncESet));
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
	public BigInteger getPageAdjust() {
		return pageAdjust;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPageAdjust(BigInteger newPageAdjust) {
		BigInteger oldPageAdjust = pageAdjust;
		pageAdjust = newPageAdjust;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.PAGE_NUMBER_TYPE__PAGE_ADJUST, oldPageAdjust, pageAdjust));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SelectPageType1 getSelectPage() {
		return selectPage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelectPage(SelectPageType1 newSelectPage) {
		SelectPageType1 oldSelectPage = selectPage;
		selectPage = newSelectPage == null ? SELECT_PAGE_EDEFAULT : newSelectPage;
		boolean oldSelectPageESet = selectPageESet;
		selectPageESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.PAGE_NUMBER_TYPE__SELECT_PAGE, oldSelectPage, selectPage, !oldSelectPageESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSelectPage() {
		SelectPageType1 oldSelectPage = selectPage;
		boolean oldSelectPageESet = selectPageESet;
		selectPage = SELECT_PAGE_EDEFAULT;
		selectPageESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TextPackage.PAGE_NUMBER_TYPE__SELECT_PAGE, oldSelectPage, SELECT_PAGE_EDEFAULT, oldSelectPageESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSelectPage() {
		return selectPageESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TextPackage.PAGE_NUMBER_TYPE__MIXED:
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
			case TextPackage.PAGE_NUMBER_TYPE__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case TextPackage.PAGE_NUMBER_TYPE__FIXED:
				return getFixed();
			case TextPackage.PAGE_NUMBER_TYPE__NUM_FORMAT:
				return getNumFormat();
			case TextPackage.PAGE_NUMBER_TYPE__NUM_LETTER_SYNC:
				return getNumLetterSync();
			case TextPackage.PAGE_NUMBER_TYPE__PAGE_ADJUST:
				return getPageAdjust();
			case TextPackage.PAGE_NUMBER_TYPE__SELECT_PAGE:
				return getSelectPage();
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
			case TextPackage.PAGE_NUMBER_TYPE__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case TextPackage.PAGE_NUMBER_TYPE__FIXED:
				setFixed((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case TextPackage.PAGE_NUMBER_TYPE__NUM_FORMAT:
				setNumFormat(newValue);
				return;
			case TextPackage.PAGE_NUMBER_TYPE__NUM_LETTER_SYNC:
				setNumLetterSync((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case TextPackage.PAGE_NUMBER_TYPE__PAGE_ADJUST:
				setPageAdjust((BigInteger)newValue);
				return;
			case TextPackage.PAGE_NUMBER_TYPE__SELECT_PAGE:
				setSelectPage((SelectPageType1)newValue);
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
			case TextPackage.PAGE_NUMBER_TYPE__MIXED:
				getMixed().clear();
				return;
			case TextPackage.PAGE_NUMBER_TYPE__FIXED:
				unsetFixed();
				return;
			case TextPackage.PAGE_NUMBER_TYPE__NUM_FORMAT:
				setNumFormat(NUM_FORMAT_EDEFAULT);
				return;
			case TextPackage.PAGE_NUMBER_TYPE__NUM_LETTER_SYNC:
				unsetNumLetterSync();
				return;
			case TextPackage.PAGE_NUMBER_TYPE__PAGE_ADJUST:
				setPageAdjust(PAGE_ADJUST_EDEFAULT);
				return;
			case TextPackage.PAGE_NUMBER_TYPE__SELECT_PAGE:
				unsetSelectPage();
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
			case TextPackage.PAGE_NUMBER_TYPE__MIXED:
				return mixed != null && !mixed.isEmpty();
			case TextPackage.PAGE_NUMBER_TYPE__FIXED:
				return isSetFixed();
			case TextPackage.PAGE_NUMBER_TYPE__NUM_FORMAT:
				return NUM_FORMAT_EDEFAULT == null ? numFormat != null : !NUM_FORMAT_EDEFAULT.equals(numFormat);
			case TextPackage.PAGE_NUMBER_TYPE__NUM_LETTER_SYNC:
				return isSetNumLetterSync();
			case TextPackage.PAGE_NUMBER_TYPE__PAGE_ADJUST:
				return PAGE_ADJUST_EDEFAULT == null ? pageAdjust != null : !PAGE_ADJUST_EDEFAULT.equals(pageAdjust);
			case TextPackage.PAGE_NUMBER_TYPE__SELECT_PAGE:
				return isSetSelectPage();
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
		result.append(", fixed: ");
		if (fixedESet) result.append(fixed); else result.append("<unset>");
		result.append(", numFormat: ");
		result.append(numFormat);
		result.append(", numLetterSync: ");
		if (numLetterSyncESet) result.append(numLetterSync); else result.append("<unset>");
		result.append(", pageAdjust: ");
		result.append(pageAdjust);
		result.append(", selectPage: ");
		if (selectPageESet) result.append(selectPage); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //PageNumberTypeImpl
