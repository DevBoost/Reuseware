/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.table.impl;

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
import org.oasisopen.names.tc.opendocument.xmlns.table.SortByType;
import org.oasisopen.names.tc.opendocument.xmlns.table.SortType;
import org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sort Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.SortTypeImpl#getSortBy <em>Sort By</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.SortTypeImpl#getAlgorithm <em>Algorithm</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.SortTypeImpl#getBindStylesToContent <em>Bind Styles To Content</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.SortTypeImpl#getCaseSensitive <em>Case Sensitive</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.SortTypeImpl#getCountry <em>Country</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.SortTypeImpl#getLanguage <em>Language</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.SortTypeImpl#getTargetRangeAddress <em>Target Range Address</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SortTypeImpl extends EObjectImpl implements SortType {
	/**
	 * The cached value of the '{@link #getSortBy() <em>Sort By</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSortBy()
	 * @generated
	 * @ordered
	 */
	protected EList<SortByType> sortBy;

	/**
	 * The default value of the '{@link #getAlgorithm() <em>Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlgorithm()
	 * @generated
	 * @ordered
	 */
	protected static final String ALGORITHM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAlgorithm() <em>Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlgorithm()
	 * @generated
	 * @ordered
	 */
	protected String algorithm = ALGORITHM_EDEFAULT;

	/**
	 * The default value of the '{@link #getBindStylesToContent() <em>Bind Styles To Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBindStylesToContent()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean BIND_STYLES_TO_CONTENT_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getBindStylesToContent() <em>Bind Styles To Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBindStylesToContent()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean bindStylesToContent = BIND_STYLES_TO_CONTENT_EDEFAULT;

	/**
	 * This is true if the Bind Styles To Content attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean bindStylesToContentESet;

	/**
	 * The default value of the '{@link #getCaseSensitive() <em>Case Sensitive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaseSensitive()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean CASE_SENSITIVE_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getCaseSensitive() <em>Case Sensitive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaseSensitive()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean caseSensitive = CASE_SENSITIVE_EDEFAULT;

	/**
	 * This is true if the Case Sensitive attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean caseSensitiveESet;

	/**
	 * The default value of the '{@link #getCountry() <em>Country</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountry()
	 * @generated
	 * @ordered
	 */
	protected static final String COUNTRY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCountry() <em>Country</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountry()
	 * @generated
	 * @ordered
	 */
	protected String country = COUNTRY_EDEFAULT;

	/**
	 * The default value of the '{@link #getLanguage() <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected static final String LANGUAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLanguage() <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected String language = LANGUAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTargetRangeAddress() <em>Target Range Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetRangeAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_RANGE_ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetRangeAddress() <em>Target Range Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetRangeAddress()
	 * @generated
	 * @ordered
	 */
	protected String targetRangeAddress = TARGET_RANGE_ADDRESS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SortTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TablePackage.eINSTANCE.getSortType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SortByType> getSortBy() {
		if (sortBy == null) {
			sortBy = new EObjectContainmentEList<SortByType>(SortByType.class, this, TablePackage.SORT_TYPE__SORT_BY);
		}
		return sortBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAlgorithm() {
		return algorithm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlgorithm(String newAlgorithm) {
		String oldAlgorithm = algorithm;
		algorithm = newAlgorithm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.SORT_TYPE__ALGORITHM, oldAlgorithm, algorithm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getBindStylesToContent() {
		return bindStylesToContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBindStylesToContent(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newBindStylesToContent) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldBindStylesToContent = bindStylesToContent;
		bindStylesToContent = newBindStylesToContent == null ? BIND_STYLES_TO_CONTENT_EDEFAULT : newBindStylesToContent;
		boolean oldBindStylesToContentESet = bindStylesToContentESet;
		bindStylesToContentESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.SORT_TYPE__BIND_STYLES_TO_CONTENT, oldBindStylesToContent, bindStylesToContent, !oldBindStylesToContentESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetBindStylesToContent() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldBindStylesToContent = bindStylesToContent;
		boolean oldBindStylesToContentESet = bindStylesToContentESet;
		bindStylesToContent = BIND_STYLES_TO_CONTENT_EDEFAULT;
		bindStylesToContentESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TablePackage.SORT_TYPE__BIND_STYLES_TO_CONTENT, oldBindStylesToContent, BIND_STYLES_TO_CONTENT_EDEFAULT, oldBindStylesToContentESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetBindStylesToContent() {
		return bindStylesToContentESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getCaseSensitive() {
		return caseSensitive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCaseSensitive(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newCaseSensitive) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldCaseSensitive = caseSensitive;
		caseSensitive = newCaseSensitive == null ? CASE_SENSITIVE_EDEFAULT : newCaseSensitive;
		boolean oldCaseSensitiveESet = caseSensitiveESet;
		caseSensitiveESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.SORT_TYPE__CASE_SENSITIVE, oldCaseSensitive, caseSensitive, !oldCaseSensitiveESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCaseSensitive() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldCaseSensitive = caseSensitive;
		boolean oldCaseSensitiveESet = caseSensitiveESet;
		caseSensitive = CASE_SENSITIVE_EDEFAULT;
		caseSensitiveESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TablePackage.SORT_TYPE__CASE_SENSITIVE, oldCaseSensitive, CASE_SENSITIVE_EDEFAULT, oldCaseSensitiveESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCaseSensitive() {
		return caseSensitiveESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCountry(String newCountry) {
		String oldCountry = country;
		country = newCountry;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.SORT_TYPE__COUNTRY, oldCountry, country));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLanguage() {
		return language;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLanguage(String newLanguage) {
		String oldLanguage = language;
		language = newLanguage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.SORT_TYPE__LANGUAGE, oldLanguage, language));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTargetRangeAddress() {
		return targetRangeAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetRangeAddress(String newTargetRangeAddress) {
		String oldTargetRangeAddress = targetRangeAddress;
		targetRangeAddress = newTargetRangeAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.SORT_TYPE__TARGET_RANGE_ADDRESS, oldTargetRangeAddress, targetRangeAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TablePackage.SORT_TYPE__SORT_BY:
				return ((InternalEList<?>)getSortBy()).basicRemove(otherEnd, msgs);
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
			case TablePackage.SORT_TYPE__SORT_BY:
				return getSortBy();
			case TablePackage.SORT_TYPE__ALGORITHM:
				return getAlgorithm();
			case TablePackage.SORT_TYPE__BIND_STYLES_TO_CONTENT:
				return getBindStylesToContent();
			case TablePackage.SORT_TYPE__CASE_SENSITIVE:
				return getCaseSensitive();
			case TablePackage.SORT_TYPE__COUNTRY:
				return getCountry();
			case TablePackage.SORT_TYPE__LANGUAGE:
				return getLanguage();
			case TablePackage.SORT_TYPE__TARGET_RANGE_ADDRESS:
				return getTargetRangeAddress();
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
			case TablePackage.SORT_TYPE__SORT_BY:
				getSortBy().clear();
				getSortBy().addAll((Collection<? extends SortByType>)newValue);
				return;
			case TablePackage.SORT_TYPE__ALGORITHM:
				setAlgorithm((String)newValue);
				return;
			case TablePackage.SORT_TYPE__BIND_STYLES_TO_CONTENT:
				setBindStylesToContent((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case TablePackage.SORT_TYPE__CASE_SENSITIVE:
				setCaseSensitive((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case TablePackage.SORT_TYPE__COUNTRY:
				setCountry((String)newValue);
				return;
			case TablePackage.SORT_TYPE__LANGUAGE:
				setLanguage((String)newValue);
				return;
			case TablePackage.SORT_TYPE__TARGET_RANGE_ADDRESS:
				setTargetRangeAddress((String)newValue);
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
			case TablePackage.SORT_TYPE__SORT_BY:
				getSortBy().clear();
				return;
			case TablePackage.SORT_TYPE__ALGORITHM:
				setAlgorithm(ALGORITHM_EDEFAULT);
				return;
			case TablePackage.SORT_TYPE__BIND_STYLES_TO_CONTENT:
				unsetBindStylesToContent();
				return;
			case TablePackage.SORT_TYPE__CASE_SENSITIVE:
				unsetCaseSensitive();
				return;
			case TablePackage.SORT_TYPE__COUNTRY:
				setCountry(COUNTRY_EDEFAULT);
				return;
			case TablePackage.SORT_TYPE__LANGUAGE:
				setLanguage(LANGUAGE_EDEFAULT);
				return;
			case TablePackage.SORT_TYPE__TARGET_RANGE_ADDRESS:
				setTargetRangeAddress(TARGET_RANGE_ADDRESS_EDEFAULT);
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
			case TablePackage.SORT_TYPE__SORT_BY:
				return sortBy != null && !sortBy.isEmpty();
			case TablePackage.SORT_TYPE__ALGORITHM:
				return ALGORITHM_EDEFAULT == null ? algorithm != null : !ALGORITHM_EDEFAULT.equals(algorithm);
			case TablePackage.SORT_TYPE__BIND_STYLES_TO_CONTENT:
				return isSetBindStylesToContent();
			case TablePackage.SORT_TYPE__CASE_SENSITIVE:
				return isSetCaseSensitive();
			case TablePackage.SORT_TYPE__COUNTRY:
				return COUNTRY_EDEFAULT == null ? country != null : !COUNTRY_EDEFAULT.equals(country);
			case TablePackage.SORT_TYPE__LANGUAGE:
				return LANGUAGE_EDEFAULT == null ? language != null : !LANGUAGE_EDEFAULT.equals(language);
			case TablePackage.SORT_TYPE__TARGET_RANGE_ADDRESS:
				return TARGET_RANGE_ADDRESS_EDEFAULT == null ? targetRangeAddress != null : !TARGET_RANGE_ADDRESS_EDEFAULT.equals(targetRangeAddress);
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
		result.append(" (algorithm: ");
		result.append(algorithm);
		result.append(", bindStylesToContent: ");
		if (bindStylesToContentESet) result.append(bindStylesToContent); else result.append("<unset>");
		result.append(", caseSensitive: ");
		if (caseSensitiveESet) result.append(caseSensitive); else result.append("<unset>");
		result.append(", country: ");
		result.append(country);
		result.append(", language: ");
		result.append(language);
		result.append(", targetRangeAddress: ");
		result.append(targetRangeAddress);
		result.append(')');
		return result.toString();
	}

} //SortTypeImpl
