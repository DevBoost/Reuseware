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
import org.oasisopen.names.tc.opendocument.xmlns.text.PageContinuationType;
import org.oasisopen.names.tc.opendocument.xmlns.text.SelectPageType;
import org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Page Continuation Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.PageContinuationTypeImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.PageContinuationTypeImpl#getSelectPage <em>Select Page</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.PageContinuationTypeImpl#getStringValue <em>String Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PageContinuationTypeImpl extends EObjectImpl implements PageContinuationType {
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
	 * The default value of the '{@link #getSelectPage() <em>Select Page</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectPage()
	 * @generated
	 * @ordered
	 */
	protected static final SelectPageType SELECT_PAGE_EDEFAULT = SelectPageType.PREVIOUS;

	/**
	 * The cached value of the '{@link #getSelectPage() <em>Select Page</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectPage()
	 * @generated
	 * @ordered
	 */
	protected SelectPageType selectPage = SELECT_PAGE_EDEFAULT;

	/**
	 * This is true if the Select Page attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean selectPageESet;

	/**
	 * The default value of the '{@link #getStringValue() <em>String Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStringValue()
	 * @generated
	 * @ordered
	 */
	protected static final String STRING_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStringValue() <em>String Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStringValue()
	 * @generated
	 * @ordered
	 */
	protected String stringValue = STRING_VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PageContinuationTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TextPackage.eINSTANCE.getPageContinuationType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, TextPackage.PAGE_CONTINUATION_TYPE__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SelectPageType getSelectPage() {
		return selectPage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelectPage(SelectPageType newSelectPage) {
		SelectPageType oldSelectPage = selectPage;
		selectPage = newSelectPage == null ? SELECT_PAGE_EDEFAULT : newSelectPage;
		boolean oldSelectPageESet = selectPageESet;
		selectPageESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.PAGE_CONTINUATION_TYPE__SELECT_PAGE, oldSelectPage, selectPage, !oldSelectPageESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSelectPage() {
		SelectPageType oldSelectPage = selectPage;
		boolean oldSelectPageESet = selectPageESet;
		selectPage = SELECT_PAGE_EDEFAULT;
		selectPageESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TextPackage.PAGE_CONTINUATION_TYPE__SELECT_PAGE, oldSelectPage, SELECT_PAGE_EDEFAULT, oldSelectPageESet));
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
	public String getStringValue() {
		return stringValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStringValue(String newStringValue) {
		String oldStringValue = stringValue;
		stringValue = newStringValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.PAGE_CONTINUATION_TYPE__STRING_VALUE, oldStringValue, stringValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TextPackage.PAGE_CONTINUATION_TYPE__MIXED:
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
			case TextPackage.PAGE_CONTINUATION_TYPE__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case TextPackage.PAGE_CONTINUATION_TYPE__SELECT_PAGE:
				return getSelectPage();
			case TextPackage.PAGE_CONTINUATION_TYPE__STRING_VALUE:
				return getStringValue();
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
			case TextPackage.PAGE_CONTINUATION_TYPE__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case TextPackage.PAGE_CONTINUATION_TYPE__SELECT_PAGE:
				setSelectPage((SelectPageType)newValue);
				return;
			case TextPackage.PAGE_CONTINUATION_TYPE__STRING_VALUE:
				setStringValue((String)newValue);
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
			case TextPackage.PAGE_CONTINUATION_TYPE__MIXED:
				getMixed().clear();
				return;
			case TextPackage.PAGE_CONTINUATION_TYPE__SELECT_PAGE:
				unsetSelectPage();
				return;
			case TextPackage.PAGE_CONTINUATION_TYPE__STRING_VALUE:
				setStringValue(STRING_VALUE_EDEFAULT);
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
			case TextPackage.PAGE_CONTINUATION_TYPE__MIXED:
				return mixed != null && !mixed.isEmpty();
			case TextPackage.PAGE_CONTINUATION_TYPE__SELECT_PAGE:
				return isSetSelectPage();
			case TextPackage.PAGE_CONTINUATION_TYPE__STRING_VALUE:
				return STRING_VALUE_EDEFAULT == null ? stringValue != null : !STRING_VALUE_EDEFAULT.equals(stringValue);
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
		result.append(", selectPage: ");
		if (selectPageESet) result.append(selectPage); else result.append("<unset>");
		result.append(", stringValue: ");
		result.append(stringValue);
		result.append(')');
		return result.toString();
	}

} //PageContinuationTypeImpl
