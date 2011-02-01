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
import org.oasisopen.names.tc.opendocument.xmlns.text.BibliographyConfigurationType;
import org.oasisopen.names.tc.opendocument.xmlns.text.SortKeyType;
import org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bibliography Configuration Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.BibliographyConfigurationTypeImpl#getSortKey <em>Sort Key</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.BibliographyConfigurationTypeImpl#getCountry <em>Country</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.BibliographyConfigurationTypeImpl#getLanguage <em>Language</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.BibliographyConfigurationTypeImpl#getNumberedEntries <em>Numbered Entries</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.BibliographyConfigurationTypeImpl#getPrefix <em>Prefix</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.BibliographyConfigurationTypeImpl#getSortAlgorithm <em>Sort Algorithm</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.BibliographyConfigurationTypeImpl#getSortByPosition <em>Sort By Position</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.BibliographyConfigurationTypeImpl#getSuffix <em>Suffix</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BibliographyConfigurationTypeImpl extends EObjectImpl implements BibliographyConfigurationType {
	/**
	 * The cached value of the '{@link #getSortKey() <em>Sort Key</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSortKey()
	 * @generated
	 * @ordered
	 */
	protected EList<SortKeyType> sortKey;

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
	 * The default value of the '{@link #getNumberedEntries() <em>Numbered Entries</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberedEntries()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean NUMBERED_ENTRIES_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getNumberedEntries() <em>Numbered Entries</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberedEntries()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean numberedEntries = NUMBERED_ENTRIES_EDEFAULT;

	/**
	 * This is true if the Numbered Entries attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean numberedEntriesESet;

	/**
	 * The default value of the '{@link #getPrefix() <em>Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrefix()
	 * @generated
	 * @ordered
	 */
	protected static final String PREFIX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrefix() <em>Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrefix()
	 * @generated
	 * @ordered
	 */
	protected String prefix = PREFIX_EDEFAULT;

	/**
	 * The default value of the '{@link #getSortAlgorithm() <em>Sort Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSortAlgorithm()
	 * @generated
	 * @ordered
	 */
	protected static final String SORT_ALGORITHM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSortAlgorithm() <em>Sort Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSortAlgorithm()
	 * @generated
	 * @ordered
	 */
	protected String sortAlgorithm = SORT_ALGORITHM_EDEFAULT;

	/**
	 * The default value of the '{@link #getSortByPosition() <em>Sort By Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSortByPosition()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean SORT_BY_POSITION_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getSortByPosition() <em>Sort By Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSortByPosition()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean sortByPosition = SORT_BY_POSITION_EDEFAULT;

	/**
	 * This is true if the Sort By Position attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean sortByPositionESet;

	/**
	 * The default value of the '{@link #getSuffix() <em>Suffix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuffix()
	 * @generated
	 * @ordered
	 */
	protected static final String SUFFIX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSuffix() <em>Suffix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuffix()
	 * @generated
	 * @ordered
	 */
	protected String suffix = SUFFIX_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BibliographyConfigurationTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TextPackage.eINSTANCE.getBibliographyConfigurationType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SortKeyType> getSortKey() {
		if (sortKey == null) {
			sortKey = new EObjectContainmentEList<SortKeyType>(SortKeyType.class, this, TextPackage.BIBLIOGRAPHY_CONFIGURATION_TYPE__SORT_KEY);
		}
		return sortKey;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.BIBLIOGRAPHY_CONFIGURATION_TYPE__COUNTRY, oldCountry, country));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.BIBLIOGRAPHY_CONFIGURATION_TYPE__LANGUAGE, oldLanguage, language));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getNumberedEntries() {
		return numberedEntries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberedEntries(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newNumberedEntries) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldNumberedEntries = numberedEntries;
		numberedEntries = newNumberedEntries == null ? NUMBERED_ENTRIES_EDEFAULT : newNumberedEntries;
		boolean oldNumberedEntriesESet = numberedEntriesESet;
		numberedEntriesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.BIBLIOGRAPHY_CONFIGURATION_TYPE__NUMBERED_ENTRIES, oldNumberedEntries, numberedEntries, !oldNumberedEntriesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNumberedEntries() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldNumberedEntries = numberedEntries;
		boolean oldNumberedEntriesESet = numberedEntriesESet;
		numberedEntries = NUMBERED_ENTRIES_EDEFAULT;
		numberedEntriesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TextPackage.BIBLIOGRAPHY_CONFIGURATION_TYPE__NUMBERED_ENTRIES, oldNumberedEntries, NUMBERED_ENTRIES_EDEFAULT, oldNumberedEntriesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNumberedEntries() {
		return numberedEntriesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPrefix() {
		return prefix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrefix(String newPrefix) {
		String oldPrefix = prefix;
		prefix = newPrefix;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.BIBLIOGRAPHY_CONFIGURATION_TYPE__PREFIX, oldPrefix, prefix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSortAlgorithm() {
		return sortAlgorithm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSortAlgorithm(String newSortAlgorithm) {
		String oldSortAlgorithm = sortAlgorithm;
		sortAlgorithm = newSortAlgorithm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.BIBLIOGRAPHY_CONFIGURATION_TYPE__SORT_ALGORITHM, oldSortAlgorithm, sortAlgorithm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getSortByPosition() {
		return sortByPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSortByPosition(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newSortByPosition) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldSortByPosition = sortByPosition;
		sortByPosition = newSortByPosition == null ? SORT_BY_POSITION_EDEFAULT : newSortByPosition;
		boolean oldSortByPositionESet = sortByPositionESet;
		sortByPositionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.BIBLIOGRAPHY_CONFIGURATION_TYPE__SORT_BY_POSITION, oldSortByPosition, sortByPosition, !oldSortByPositionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSortByPosition() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldSortByPosition = sortByPosition;
		boolean oldSortByPositionESet = sortByPositionESet;
		sortByPosition = SORT_BY_POSITION_EDEFAULT;
		sortByPositionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TextPackage.BIBLIOGRAPHY_CONFIGURATION_TYPE__SORT_BY_POSITION, oldSortByPosition, SORT_BY_POSITION_EDEFAULT, oldSortByPositionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSortByPosition() {
		return sortByPositionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSuffix() {
		return suffix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuffix(String newSuffix) {
		String oldSuffix = suffix;
		suffix = newSuffix;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.BIBLIOGRAPHY_CONFIGURATION_TYPE__SUFFIX, oldSuffix, suffix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TextPackage.BIBLIOGRAPHY_CONFIGURATION_TYPE__SORT_KEY:
				return ((InternalEList<?>)getSortKey()).basicRemove(otherEnd, msgs);
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
			case TextPackage.BIBLIOGRAPHY_CONFIGURATION_TYPE__SORT_KEY:
				return getSortKey();
			case TextPackage.BIBLIOGRAPHY_CONFIGURATION_TYPE__COUNTRY:
				return getCountry();
			case TextPackage.BIBLIOGRAPHY_CONFIGURATION_TYPE__LANGUAGE:
				return getLanguage();
			case TextPackage.BIBLIOGRAPHY_CONFIGURATION_TYPE__NUMBERED_ENTRIES:
				return getNumberedEntries();
			case TextPackage.BIBLIOGRAPHY_CONFIGURATION_TYPE__PREFIX:
				return getPrefix();
			case TextPackage.BIBLIOGRAPHY_CONFIGURATION_TYPE__SORT_ALGORITHM:
				return getSortAlgorithm();
			case TextPackage.BIBLIOGRAPHY_CONFIGURATION_TYPE__SORT_BY_POSITION:
				return getSortByPosition();
			case TextPackage.BIBLIOGRAPHY_CONFIGURATION_TYPE__SUFFIX:
				return getSuffix();
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
			case TextPackage.BIBLIOGRAPHY_CONFIGURATION_TYPE__SORT_KEY:
				getSortKey().clear();
				getSortKey().addAll((Collection<? extends SortKeyType>)newValue);
				return;
			case TextPackage.BIBLIOGRAPHY_CONFIGURATION_TYPE__COUNTRY:
				setCountry((String)newValue);
				return;
			case TextPackage.BIBLIOGRAPHY_CONFIGURATION_TYPE__LANGUAGE:
				setLanguage((String)newValue);
				return;
			case TextPackage.BIBLIOGRAPHY_CONFIGURATION_TYPE__NUMBERED_ENTRIES:
				setNumberedEntries((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case TextPackage.BIBLIOGRAPHY_CONFIGURATION_TYPE__PREFIX:
				setPrefix((String)newValue);
				return;
			case TextPackage.BIBLIOGRAPHY_CONFIGURATION_TYPE__SORT_ALGORITHM:
				setSortAlgorithm((String)newValue);
				return;
			case TextPackage.BIBLIOGRAPHY_CONFIGURATION_TYPE__SORT_BY_POSITION:
				setSortByPosition((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case TextPackage.BIBLIOGRAPHY_CONFIGURATION_TYPE__SUFFIX:
				setSuffix((String)newValue);
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
			case TextPackage.BIBLIOGRAPHY_CONFIGURATION_TYPE__SORT_KEY:
				getSortKey().clear();
				return;
			case TextPackage.BIBLIOGRAPHY_CONFIGURATION_TYPE__COUNTRY:
				setCountry(COUNTRY_EDEFAULT);
				return;
			case TextPackage.BIBLIOGRAPHY_CONFIGURATION_TYPE__LANGUAGE:
				setLanguage(LANGUAGE_EDEFAULT);
				return;
			case TextPackage.BIBLIOGRAPHY_CONFIGURATION_TYPE__NUMBERED_ENTRIES:
				unsetNumberedEntries();
				return;
			case TextPackage.BIBLIOGRAPHY_CONFIGURATION_TYPE__PREFIX:
				setPrefix(PREFIX_EDEFAULT);
				return;
			case TextPackage.BIBLIOGRAPHY_CONFIGURATION_TYPE__SORT_ALGORITHM:
				setSortAlgorithm(SORT_ALGORITHM_EDEFAULT);
				return;
			case TextPackage.BIBLIOGRAPHY_CONFIGURATION_TYPE__SORT_BY_POSITION:
				unsetSortByPosition();
				return;
			case TextPackage.BIBLIOGRAPHY_CONFIGURATION_TYPE__SUFFIX:
				setSuffix(SUFFIX_EDEFAULT);
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
			case TextPackage.BIBLIOGRAPHY_CONFIGURATION_TYPE__SORT_KEY:
				return sortKey != null && !sortKey.isEmpty();
			case TextPackage.BIBLIOGRAPHY_CONFIGURATION_TYPE__COUNTRY:
				return COUNTRY_EDEFAULT == null ? country != null : !COUNTRY_EDEFAULT.equals(country);
			case TextPackage.BIBLIOGRAPHY_CONFIGURATION_TYPE__LANGUAGE:
				return LANGUAGE_EDEFAULT == null ? language != null : !LANGUAGE_EDEFAULT.equals(language);
			case TextPackage.BIBLIOGRAPHY_CONFIGURATION_TYPE__NUMBERED_ENTRIES:
				return isSetNumberedEntries();
			case TextPackage.BIBLIOGRAPHY_CONFIGURATION_TYPE__PREFIX:
				return PREFIX_EDEFAULT == null ? prefix != null : !PREFIX_EDEFAULT.equals(prefix);
			case TextPackage.BIBLIOGRAPHY_CONFIGURATION_TYPE__SORT_ALGORITHM:
				return SORT_ALGORITHM_EDEFAULT == null ? sortAlgorithm != null : !SORT_ALGORITHM_EDEFAULT.equals(sortAlgorithm);
			case TextPackage.BIBLIOGRAPHY_CONFIGURATION_TYPE__SORT_BY_POSITION:
				return isSetSortByPosition();
			case TextPackage.BIBLIOGRAPHY_CONFIGURATION_TYPE__SUFFIX:
				return SUFFIX_EDEFAULT == null ? suffix != null : !SUFFIX_EDEFAULT.equals(suffix);
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
		result.append(" (country: ");
		result.append(country);
		result.append(", language: ");
		result.append(language);
		result.append(", numberedEntries: ");
		if (numberedEntriesESet) result.append(numberedEntries); else result.append("<unset>");
		result.append(", prefix: ");
		result.append(prefix);
		result.append(", sortAlgorithm: ");
		result.append(sortAlgorithm);
		result.append(", sortByPosition: ");
		if (sortByPositionESet) result.append(sortByPosition); else result.append("<unset>");
		result.append(", suffix: ");
		result.append(suffix);
		result.append(')');
		return result.toString();
	}

} //BibliographyConfigurationTypeImpl
