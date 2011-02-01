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
import org.oasisopen.names.tc.opendocument.xmlns.text.AlphabeticalIndexEntryTemplateType;
import org.oasisopen.names.tc.opendocument.xmlns.text.AlphabeticalIndexSourceType;
import org.oasisopen.names.tc.opendocument.xmlns.text.IndexScopeType;
import org.oasisopen.names.tc.opendocument.xmlns.text.IndexTitleTemplateType;
import org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Alphabetical Index Source Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.AlphabeticalIndexSourceTypeImpl#getIndexTitleTemplate <em>Index Title Template</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.AlphabeticalIndexSourceTypeImpl#getAlphabeticalIndexEntryTemplate <em>Alphabetical Index Entry Template</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.AlphabeticalIndexSourceTypeImpl#getAlphabeticalSeparators <em>Alphabetical Separators</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.AlphabeticalIndexSourceTypeImpl#getCapitalizeEntries <em>Capitalize Entries</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.AlphabeticalIndexSourceTypeImpl#getCombineEntries <em>Combine Entries</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.AlphabeticalIndexSourceTypeImpl#getCombineEntriesWithDash <em>Combine Entries With Dash</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.AlphabeticalIndexSourceTypeImpl#getCombineEntriesWithPp <em>Combine Entries With Pp</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.AlphabeticalIndexSourceTypeImpl#getCommaSeparated <em>Comma Separated</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.AlphabeticalIndexSourceTypeImpl#getCountry <em>Country</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.AlphabeticalIndexSourceTypeImpl#getIgnoreCase <em>Ignore Case</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.AlphabeticalIndexSourceTypeImpl#getIndexScope <em>Index Scope</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.AlphabeticalIndexSourceTypeImpl#getLanguage <em>Language</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.AlphabeticalIndexSourceTypeImpl#getMainEntryStyleName <em>Main Entry Style Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.AlphabeticalIndexSourceTypeImpl#getRelativeTabStopPosition <em>Relative Tab Stop Position</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.AlphabeticalIndexSourceTypeImpl#getSortAlgorithm <em>Sort Algorithm</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.AlphabeticalIndexSourceTypeImpl#getUseKeysAsEntries <em>Use Keys As Entries</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AlphabeticalIndexSourceTypeImpl extends EObjectImpl implements AlphabeticalIndexSourceType {
	/**
	 * The cached value of the '{@link #getIndexTitleTemplate() <em>Index Title Template</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndexTitleTemplate()
	 * @generated
	 * @ordered
	 */
	protected IndexTitleTemplateType indexTitleTemplate;

	/**
	 * The cached value of the '{@link #getAlphabeticalIndexEntryTemplate() <em>Alphabetical Index Entry Template</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlphabeticalIndexEntryTemplate()
	 * @generated
	 * @ordered
	 */
	protected EList<AlphabeticalIndexEntryTemplateType> alphabeticalIndexEntryTemplate;

	/**
	 * The default value of the '{@link #getAlphabeticalSeparators() <em>Alphabetical Separators</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlphabeticalSeparators()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean ALPHABETICAL_SEPARATORS_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getAlphabeticalSeparators() <em>Alphabetical Separators</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlphabeticalSeparators()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean alphabeticalSeparators = ALPHABETICAL_SEPARATORS_EDEFAULT;

	/**
	 * This is true if the Alphabetical Separators attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean alphabeticalSeparatorsESet;

	/**
	 * The default value of the '{@link #getCapitalizeEntries() <em>Capitalize Entries</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapitalizeEntries()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean CAPITALIZE_ENTRIES_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getCapitalizeEntries() <em>Capitalize Entries</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapitalizeEntries()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean capitalizeEntries = CAPITALIZE_ENTRIES_EDEFAULT;

	/**
	 * This is true if the Capitalize Entries attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean capitalizeEntriesESet;

	/**
	 * The default value of the '{@link #getCombineEntries() <em>Combine Entries</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCombineEntries()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean COMBINE_ENTRIES_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getCombineEntries() <em>Combine Entries</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCombineEntries()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean combineEntries = COMBINE_ENTRIES_EDEFAULT;

	/**
	 * This is true if the Combine Entries attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean combineEntriesESet;

	/**
	 * The default value of the '{@link #getCombineEntriesWithDash() <em>Combine Entries With Dash</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCombineEntriesWithDash()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean COMBINE_ENTRIES_WITH_DASH_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getCombineEntriesWithDash() <em>Combine Entries With Dash</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCombineEntriesWithDash()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean combineEntriesWithDash = COMBINE_ENTRIES_WITH_DASH_EDEFAULT;

	/**
	 * This is true if the Combine Entries With Dash attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean combineEntriesWithDashESet;

	/**
	 * The default value of the '{@link #getCombineEntriesWithPp() <em>Combine Entries With Pp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCombineEntriesWithPp()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean COMBINE_ENTRIES_WITH_PP_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getCombineEntriesWithPp() <em>Combine Entries With Pp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCombineEntriesWithPp()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean combineEntriesWithPp = COMBINE_ENTRIES_WITH_PP_EDEFAULT;

	/**
	 * This is true if the Combine Entries With Pp attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean combineEntriesWithPpESet;

	/**
	 * The default value of the '{@link #getCommaSeparated() <em>Comma Separated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommaSeparated()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean COMMA_SEPARATED_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getCommaSeparated() <em>Comma Separated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommaSeparated()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean commaSeparated = COMMA_SEPARATED_EDEFAULT;

	/**
	 * This is true if the Comma Separated attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean commaSeparatedESet;

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
	 * The default value of the '{@link #getIgnoreCase() <em>Ignore Case</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIgnoreCase()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean IGNORE_CASE_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getIgnoreCase() <em>Ignore Case</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIgnoreCase()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean ignoreCase = IGNORE_CASE_EDEFAULT;

	/**
	 * This is true if the Ignore Case attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean ignoreCaseESet;

	/**
	 * The default value of the '{@link #getIndexScope() <em>Index Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndexScope()
	 * @generated
	 * @ordered
	 */
	protected static final IndexScopeType INDEX_SCOPE_EDEFAULT = IndexScopeType.DOCUMENT;

	/**
	 * The cached value of the '{@link #getIndexScope() <em>Index Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndexScope()
	 * @generated
	 * @ordered
	 */
	protected IndexScopeType indexScope = INDEX_SCOPE_EDEFAULT;

	/**
	 * This is true if the Index Scope attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean indexScopeESet;

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
	 * The default value of the '{@link #getMainEntryStyleName() <em>Main Entry Style Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMainEntryStyleName()
	 * @generated
	 * @ordered
	 */
	protected static final String MAIN_ENTRY_STYLE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMainEntryStyleName() <em>Main Entry Style Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMainEntryStyleName()
	 * @generated
	 * @ordered
	 */
	protected String mainEntryStyleName = MAIN_ENTRY_STYLE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getRelativeTabStopPosition() <em>Relative Tab Stop Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelativeTabStopPosition()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean RELATIVE_TAB_STOP_POSITION_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getRelativeTabStopPosition() <em>Relative Tab Stop Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelativeTabStopPosition()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean relativeTabStopPosition = RELATIVE_TAB_STOP_POSITION_EDEFAULT;

	/**
	 * This is true if the Relative Tab Stop Position attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean relativeTabStopPositionESet;

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
	 * The default value of the '{@link #getUseKeysAsEntries() <em>Use Keys As Entries</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseKeysAsEntries()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean USE_KEYS_AS_ENTRIES_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getUseKeysAsEntries() <em>Use Keys As Entries</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseKeysAsEntries()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean useKeysAsEntries = USE_KEYS_AS_ENTRIES_EDEFAULT;

	/**
	 * This is true if the Use Keys As Entries attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean useKeysAsEntriesESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AlphabeticalIndexSourceTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TextPackage.eINSTANCE.getAlphabeticalIndexSourceType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndexTitleTemplateType getIndexTitleTemplate() {
		return indexTitleTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIndexTitleTemplate(IndexTitleTemplateType newIndexTitleTemplate, NotificationChain msgs) {
		IndexTitleTemplateType oldIndexTitleTemplate = indexTitleTemplate;
		indexTitleTemplate = newIndexTitleTemplate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TextPackage.ALPHABETICAL_INDEX_SOURCE_TYPE__INDEX_TITLE_TEMPLATE, oldIndexTitleTemplate, newIndexTitleTemplate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIndexTitleTemplate(IndexTitleTemplateType newIndexTitleTemplate) {
		if (newIndexTitleTemplate != indexTitleTemplate) {
			NotificationChain msgs = null;
			if (indexTitleTemplate != null)
				msgs = ((InternalEObject)indexTitleTemplate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TextPackage.ALPHABETICAL_INDEX_SOURCE_TYPE__INDEX_TITLE_TEMPLATE, null, msgs);
			if (newIndexTitleTemplate != null)
				msgs = ((InternalEObject)newIndexTitleTemplate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TextPackage.ALPHABETICAL_INDEX_SOURCE_TYPE__INDEX_TITLE_TEMPLATE, null, msgs);
			msgs = basicSetIndexTitleTemplate(newIndexTitleTemplate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.ALPHABETICAL_INDEX_SOURCE_TYPE__INDEX_TITLE_TEMPLATE, newIndexTitleTemplate, newIndexTitleTemplate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AlphabeticalIndexEntryTemplateType> getAlphabeticalIndexEntryTemplate() {
		if (alphabeticalIndexEntryTemplate == null) {
			alphabeticalIndexEntryTemplate = new EObjectContainmentEList<AlphabeticalIndexEntryTemplateType>(AlphabeticalIndexEntryTemplateType.class, this, TextPackage.ALPHABETICAL_INDEX_SOURCE_TYPE__ALPHABETICAL_INDEX_ENTRY_TEMPLATE);
		}
		return alphabeticalIndexEntryTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getAlphabeticalSeparators() {
		return alphabeticalSeparators;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlphabeticalSeparators(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newAlphabeticalSeparators) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldAlphabeticalSeparators = alphabeticalSeparators;
		alphabeticalSeparators = newAlphabeticalSeparators == null ? ALPHABETICAL_SEPARATORS_EDEFAULT : newAlphabeticalSeparators;
		boolean oldAlphabeticalSeparatorsESet = alphabeticalSeparatorsESet;
		alphabeticalSeparatorsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.ALPHABETICAL_INDEX_SOURCE_TYPE__ALPHABETICAL_SEPARATORS, oldAlphabeticalSeparators, alphabeticalSeparators, !oldAlphabeticalSeparatorsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAlphabeticalSeparators() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldAlphabeticalSeparators = alphabeticalSeparators;
		boolean oldAlphabeticalSeparatorsESet = alphabeticalSeparatorsESet;
		alphabeticalSeparators = ALPHABETICAL_SEPARATORS_EDEFAULT;
		alphabeticalSeparatorsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TextPackage.ALPHABETICAL_INDEX_SOURCE_TYPE__ALPHABETICAL_SEPARATORS, oldAlphabeticalSeparators, ALPHABETICAL_SEPARATORS_EDEFAULT, oldAlphabeticalSeparatorsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAlphabeticalSeparators() {
		return alphabeticalSeparatorsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getCapitalizeEntries() {
		return capitalizeEntries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCapitalizeEntries(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newCapitalizeEntries) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldCapitalizeEntries = capitalizeEntries;
		capitalizeEntries = newCapitalizeEntries == null ? CAPITALIZE_ENTRIES_EDEFAULT : newCapitalizeEntries;
		boolean oldCapitalizeEntriesESet = capitalizeEntriesESet;
		capitalizeEntriesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.ALPHABETICAL_INDEX_SOURCE_TYPE__CAPITALIZE_ENTRIES, oldCapitalizeEntries, capitalizeEntries, !oldCapitalizeEntriesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCapitalizeEntries() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldCapitalizeEntries = capitalizeEntries;
		boolean oldCapitalizeEntriesESet = capitalizeEntriesESet;
		capitalizeEntries = CAPITALIZE_ENTRIES_EDEFAULT;
		capitalizeEntriesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TextPackage.ALPHABETICAL_INDEX_SOURCE_TYPE__CAPITALIZE_ENTRIES, oldCapitalizeEntries, CAPITALIZE_ENTRIES_EDEFAULT, oldCapitalizeEntriesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCapitalizeEntries() {
		return capitalizeEntriesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getCombineEntries() {
		return combineEntries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCombineEntries(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newCombineEntries) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldCombineEntries = combineEntries;
		combineEntries = newCombineEntries == null ? COMBINE_ENTRIES_EDEFAULT : newCombineEntries;
		boolean oldCombineEntriesESet = combineEntriesESet;
		combineEntriesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.ALPHABETICAL_INDEX_SOURCE_TYPE__COMBINE_ENTRIES, oldCombineEntries, combineEntries, !oldCombineEntriesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCombineEntries() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldCombineEntries = combineEntries;
		boolean oldCombineEntriesESet = combineEntriesESet;
		combineEntries = COMBINE_ENTRIES_EDEFAULT;
		combineEntriesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TextPackage.ALPHABETICAL_INDEX_SOURCE_TYPE__COMBINE_ENTRIES, oldCombineEntries, COMBINE_ENTRIES_EDEFAULT, oldCombineEntriesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCombineEntries() {
		return combineEntriesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getCombineEntriesWithDash() {
		return combineEntriesWithDash;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCombineEntriesWithDash(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newCombineEntriesWithDash) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldCombineEntriesWithDash = combineEntriesWithDash;
		combineEntriesWithDash = newCombineEntriesWithDash == null ? COMBINE_ENTRIES_WITH_DASH_EDEFAULT : newCombineEntriesWithDash;
		boolean oldCombineEntriesWithDashESet = combineEntriesWithDashESet;
		combineEntriesWithDashESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.ALPHABETICAL_INDEX_SOURCE_TYPE__COMBINE_ENTRIES_WITH_DASH, oldCombineEntriesWithDash, combineEntriesWithDash, !oldCombineEntriesWithDashESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCombineEntriesWithDash() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldCombineEntriesWithDash = combineEntriesWithDash;
		boolean oldCombineEntriesWithDashESet = combineEntriesWithDashESet;
		combineEntriesWithDash = COMBINE_ENTRIES_WITH_DASH_EDEFAULT;
		combineEntriesWithDashESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TextPackage.ALPHABETICAL_INDEX_SOURCE_TYPE__COMBINE_ENTRIES_WITH_DASH, oldCombineEntriesWithDash, COMBINE_ENTRIES_WITH_DASH_EDEFAULT, oldCombineEntriesWithDashESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCombineEntriesWithDash() {
		return combineEntriesWithDashESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getCombineEntriesWithPp() {
		return combineEntriesWithPp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCombineEntriesWithPp(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newCombineEntriesWithPp) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldCombineEntriesWithPp = combineEntriesWithPp;
		combineEntriesWithPp = newCombineEntriesWithPp == null ? COMBINE_ENTRIES_WITH_PP_EDEFAULT : newCombineEntriesWithPp;
		boolean oldCombineEntriesWithPpESet = combineEntriesWithPpESet;
		combineEntriesWithPpESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.ALPHABETICAL_INDEX_SOURCE_TYPE__COMBINE_ENTRIES_WITH_PP, oldCombineEntriesWithPp, combineEntriesWithPp, !oldCombineEntriesWithPpESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCombineEntriesWithPp() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldCombineEntriesWithPp = combineEntriesWithPp;
		boolean oldCombineEntriesWithPpESet = combineEntriesWithPpESet;
		combineEntriesWithPp = COMBINE_ENTRIES_WITH_PP_EDEFAULT;
		combineEntriesWithPpESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TextPackage.ALPHABETICAL_INDEX_SOURCE_TYPE__COMBINE_ENTRIES_WITH_PP, oldCombineEntriesWithPp, COMBINE_ENTRIES_WITH_PP_EDEFAULT, oldCombineEntriesWithPpESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCombineEntriesWithPp() {
		return combineEntriesWithPpESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getCommaSeparated() {
		return commaSeparated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommaSeparated(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newCommaSeparated) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldCommaSeparated = commaSeparated;
		commaSeparated = newCommaSeparated == null ? COMMA_SEPARATED_EDEFAULT : newCommaSeparated;
		boolean oldCommaSeparatedESet = commaSeparatedESet;
		commaSeparatedESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.ALPHABETICAL_INDEX_SOURCE_TYPE__COMMA_SEPARATED, oldCommaSeparated, commaSeparated, !oldCommaSeparatedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCommaSeparated() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldCommaSeparated = commaSeparated;
		boolean oldCommaSeparatedESet = commaSeparatedESet;
		commaSeparated = COMMA_SEPARATED_EDEFAULT;
		commaSeparatedESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TextPackage.ALPHABETICAL_INDEX_SOURCE_TYPE__COMMA_SEPARATED, oldCommaSeparated, COMMA_SEPARATED_EDEFAULT, oldCommaSeparatedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCommaSeparated() {
		return commaSeparatedESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.ALPHABETICAL_INDEX_SOURCE_TYPE__COUNTRY, oldCountry, country));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getIgnoreCase() {
		return ignoreCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIgnoreCase(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newIgnoreCase) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldIgnoreCase = ignoreCase;
		ignoreCase = newIgnoreCase == null ? IGNORE_CASE_EDEFAULT : newIgnoreCase;
		boolean oldIgnoreCaseESet = ignoreCaseESet;
		ignoreCaseESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.ALPHABETICAL_INDEX_SOURCE_TYPE__IGNORE_CASE, oldIgnoreCase, ignoreCase, !oldIgnoreCaseESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIgnoreCase() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldIgnoreCase = ignoreCase;
		boolean oldIgnoreCaseESet = ignoreCaseESet;
		ignoreCase = IGNORE_CASE_EDEFAULT;
		ignoreCaseESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TextPackage.ALPHABETICAL_INDEX_SOURCE_TYPE__IGNORE_CASE, oldIgnoreCase, IGNORE_CASE_EDEFAULT, oldIgnoreCaseESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIgnoreCase() {
		return ignoreCaseESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndexScopeType getIndexScope() {
		return indexScope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIndexScope(IndexScopeType newIndexScope) {
		IndexScopeType oldIndexScope = indexScope;
		indexScope = newIndexScope == null ? INDEX_SCOPE_EDEFAULT : newIndexScope;
		boolean oldIndexScopeESet = indexScopeESet;
		indexScopeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.ALPHABETICAL_INDEX_SOURCE_TYPE__INDEX_SCOPE, oldIndexScope, indexScope, !oldIndexScopeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIndexScope() {
		IndexScopeType oldIndexScope = indexScope;
		boolean oldIndexScopeESet = indexScopeESet;
		indexScope = INDEX_SCOPE_EDEFAULT;
		indexScopeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TextPackage.ALPHABETICAL_INDEX_SOURCE_TYPE__INDEX_SCOPE, oldIndexScope, INDEX_SCOPE_EDEFAULT, oldIndexScopeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIndexScope() {
		return indexScopeESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.ALPHABETICAL_INDEX_SOURCE_TYPE__LANGUAGE, oldLanguage, language));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMainEntryStyleName() {
		return mainEntryStyleName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMainEntryStyleName(String newMainEntryStyleName) {
		String oldMainEntryStyleName = mainEntryStyleName;
		mainEntryStyleName = newMainEntryStyleName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.ALPHABETICAL_INDEX_SOURCE_TYPE__MAIN_ENTRY_STYLE_NAME, oldMainEntryStyleName, mainEntryStyleName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getRelativeTabStopPosition() {
		return relativeTabStopPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelativeTabStopPosition(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newRelativeTabStopPosition) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldRelativeTabStopPosition = relativeTabStopPosition;
		relativeTabStopPosition = newRelativeTabStopPosition == null ? RELATIVE_TAB_STOP_POSITION_EDEFAULT : newRelativeTabStopPosition;
		boolean oldRelativeTabStopPositionESet = relativeTabStopPositionESet;
		relativeTabStopPositionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.ALPHABETICAL_INDEX_SOURCE_TYPE__RELATIVE_TAB_STOP_POSITION, oldRelativeTabStopPosition, relativeTabStopPosition, !oldRelativeTabStopPositionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRelativeTabStopPosition() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldRelativeTabStopPosition = relativeTabStopPosition;
		boolean oldRelativeTabStopPositionESet = relativeTabStopPositionESet;
		relativeTabStopPosition = RELATIVE_TAB_STOP_POSITION_EDEFAULT;
		relativeTabStopPositionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TextPackage.ALPHABETICAL_INDEX_SOURCE_TYPE__RELATIVE_TAB_STOP_POSITION, oldRelativeTabStopPosition, RELATIVE_TAB_STOP_POSITION_EDEFAULT, oldRelativeTabStopPositionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRelativeTabStopPosition() {
		return relativeTabStopPositionESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.ALPHABETICAL_INDEX_SOURCE_TYPE__SORT_ALGORITHM, oldSortAlgorithm, sortAlgorithm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getUseKeysAsEntries() {
		return useKeysAsEntries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUseKeysAsEntries(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newUseKeysAsEntries) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldUseKeysAsEntries = useKeysAsEntries;
		useKeysAsEntries = newUseKeysAsEntries == null ? USE_KEYS_AS_ENTRIES_EDEFAULT : newUseKeysAsEntries;
		boolean oldUseKeysAsEntriesESet = useKeysAsEntriesESet;
		useKeysAsEntriesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.ALPHABETICAL_INDEX_SOURCE_TYPE__USE_KEYS_AS_ENTRIES, oldUseKeysAsEntries, useKeysAsEntries, !oldUseKeysAsEntriesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetUseKeysAsEntries() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldUseKeysAsEntries = useKeysAsEntries;
		boolean oldUseKeysAsEntriesESet = useKeysAsEntriesESet;
		useKeysAsEntries = USE_KEYS_AS_ENTRIES_EDEFAULT;
		useKeysAsEntriesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TextPackage.ALPHABETICAL_INDEX_SOURCE_TYPE__USE_KEYS_AS_ENTRIES, oldUseKeysAsEntries, USE_KEYS_AS_ENTRIES_EDEFAULT, oldUseKeysAsEntriesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetUseKeysAsEntries() {
		return useKeysAsEntriesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TextPackage.ALPHABETICAL_INDEX_SOURCE_TYPE__INDEX_TITLE_TEMPLATE:
				return basicSetIndexTitleTemplate(null, msgs);
			case TextPackage.ALPHABETICAL_INDEX_SOURCE_TYPE__ALPHABETICAL_INDEX_ENTRY_TEMPLATE:
				return ((InternalEList<?>)getAlphabeticalIndexEntryTemplate()).basicRemove(otherEnd, msgs);
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
			case TextPackage.ALPHABETICAL_INDEX_SOURCE_TYPE__INDEX_TITLE_TEMPLATE:
				return getIndexTitleTemplate();
			case TextPackage.ALPHABETICAL_INDEX_SOURCE_TYPE__ALPHABETICAL_INDEX_ENTRY_TEMPLATE:
				return getAlphabeticalIndexEntryTemplate();
			case TextPackage.ALPHABETICAL_INDEX_SOURCE_TYPE__ALPHABETICAL_SEPARATORS:
				return getAlphabeticalSeparators();
			case TextPackage.ALPHABETICAL_INDEX_SOURCE_TYPE__CAPITALIZE_ENTRIES:
				return getCapitalizeEntries();
			case TextPackage.ALPHABETICAL_INDEX_SOURCE_TYPE__COMBINE_ENTRIES:
				return getCombineEntries();
			case TextPackage.ALPHABETICAL_INDEX_SOURCE_TYPE__COMBINE_ENTRIES_WITH_DASH:
				return getCombineEntriesWithDash();
			case TextPackage.ALPHABETICAL_INDEX_SOURCE_TYPE__COMBINE_ENTRIES_WITH_PP:
				return getCombineEntriesWithPp();
			case TextPackage.ALPHABETICAL_INDEX_SOURCE_TYPE__COMMA_SEPARATED:
				return getCommaSeparated();
			case TextPackage.ALPHABETICAL_INDEX_SOURCE_TYPE__COUNTRY:
				return getCountry();
			case TextPackage.ALPHABETICAL_INDEX_SOURCE_TYPE__IGNORE_CASE:
				return getIgnoreCase();
			case TextPackage.ALPHABETICAL_INDEX_SOURCE_TYPE__INDEX_SCOPE:
				return getIndexScope();
			case TextPackage.ALPHABETICAL_INDEX_SOURCE_TYPE__LANGUAGE:
				return getLanguage();
			case TextPackage.ALPHABETICAL_INDEX_SOURCE_TYPE__MAIN_ENTRY_STYLE_NAME:
				return getMainEntryStyleName();
			case TextPackage.ALPHABETICAL_INDEX_SOURCE_TYPE__RELATIVE_TAB_STOP_POSITION:
				return getRelativeTabStopPosition();
			case TextPackage.ALPHABETICAL_INDEX_SOURCE_TYPE__SORT_ALGORITHM:
				return getSortAlgorithm();
			case TextPackage.ALPHABETICAL_INDEX_SOURCE_TYPE__USE_KEYS_AS_ENTRIES:
				return getUseKeysAsEntries();
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
			case TextPackage.ALPHABETICAL_INDEX_SOURCE_TYPE__INDEX_TITLE_TEMPLATE:
				setIndexTitleTemplate((IndexTitleTemplateType)newValue);
				return;
			case TextPackage.ALPHABETICAL_INDEX_SOURCE_TYPE__ALPHABETICAL_INDEX_ENTRY_TEMPLATE:
				getAlphabeticalIndexEntryTemplate().clear();
				getAlphabeticalIndexEntryTemplate().addAll((Collection<? extends AlphabeticalIndexEntryTemplateType>)newValue);
				return;
			case TextPackage.ALPHABETICAL_INDEX_SOURCE_TYPE__ALPHABETICAL_SEPARATORS:
				setAlphabeticalSeparators((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case TextPackage.ALPHABETICAL_INDEX_SOURCE_TYPE__CAPITALIZE_ENTRIES:
				setCapitalizeEntries((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case TextPackage.ALPHABETICAL_INDEX_SOURCE_TYPE__COMBINE_ENTRIES:
				setCombineEntries((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case TextPackage.ALPHABETICAL_INDEX_SOURCE_TYPE__COMBINE_ENTRIES_WITH_DASH:
				setCombineEntriesWithDash((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case TextPackage.ALPHABETICAL_INDEX_SOURCE_TYPE__COMBINE_ENTRIES_WITH_PP:
				setCombineEntriesWithPp((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case TextPackage.ALPHABETICAL_INDEX_SOURCE_TYPE__COMMA_SEPARATED:
				setCommaSeparated((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case TextPackage.ALPHABETICAL_INDEX_SOURCE_TYPE__COUNTRY:
				setCountry((String)newValue);
				return;
			case TextPackage.ALPHABETICAL_INDEX_SOURCE_TYPE__IGNORE_CASE:
				setIgnoreCase((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case TextPackage.ALPHABETICAL_INDEX_SOURCE_TYPE__INDEX_SCOPE:
				setIndexScope((IndexScopeType)newValue);
				return;
			case TextPackage.ALPHABETICAL_INDEX_SOURCE_TYPE__LANGUAGE:
				setLanguage((String)newValue);
				return;
			case TextPackage.ALPHABETICAL_INDEX_SOURCE_TYPE__MAIN_ENTRY_STYLE_NAME:
				setMainEntryStyleName((String)newValue);
				return;
			case TextPackage.ALPHABETICAL_INDEX_SOURCE_TYPE__RELATIVE_TAB_STOP_POSITION:
				setRelativeTabStopPosition((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case TextPackage.ALPHABETICAL_INDEX_SOURCE_TYPE__SORT_ALGORITHM:
				setSortAlgorithm((String)newValue);
				return;
			case TextPackage.ALPHABETICAL_INDEX_SOURCE_TYPE__USE_KEYS_AS_ENTRIES:
				setUseKeysAsEntries((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
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
			case TextPackage.ALPHABETICAL_INDEX_SOURCE_TYPE__INDEX_TITLE_TEMPLATE:
				setIndexTitleTemplate((IndexTitleTemplateType)null);
				return;
			case TextPackage.ALPHABETICAL_INDEX_SOURCE_TYPE__ALPHABETICAL_INDEX_ENTRY_TEMPLATE:
				getAlphabeticalIndexEntryTemplate().clear();
				return;
			case TextPackage.ALPHABETICAL_INDEX_SOURCE_TYPE__ALPHABETICAL_SEPARATORS:
				unsetAlphabeticalSeparators();
				return;
			case TextPackage.ALPHABETICAL_INDEX_SOURCE_TYPE__CAPITALIZE_ENTRIES:
				unsetCapitalizeEntries();
				return;
			case TextPackage.ALPHABETICAL_INDEX_SOURCE_TYPE__COMBINE_ENTRIES:
				unsetCombineEntries();
				return;
			case TextPackage.ALPHABETICAL_INDEX_SOURCE_TYPE__COMBINE_ENTRIES_WITH_DASH:
				unsetCombineEntriesWithDash();
				return;
			case TextPackage.ALPHABETICAL_INDEX_SOURCE_TYPE__COMBINE_ENTRIES_WITH_PP:
				unsetCombineEntriesWithPp();
				return;
			case TextPackage.ALPHABETICAL_INDEX_SOURCE_TYPE__COMMA_SEPARATED:
				unsetCommaSeparated();
				return;
			case TextPackage.ALPHABETICAL_INDEX_SOURCE_TYPE__COUNTRY:
				setCountry(COUNTRY_EDEFAULT);
				return;
			case TextPackage.ALPHABETICAL_INDEX_SOURCE_TYPE__IGNORE_CASE:
				unsetIgnoreCase();
				return;
			case TextPackage.ALPHABETICAL_INDEX_SOURCE_TYPE__INDEX_SCOPE:
				unsetIndexScope();
				return;
			case TextPackage.ALPHABETICAL_INDEX_SOURCE_TYPE__LANGUAGE:
				setLanguage(LANGUAGE_EDEFAULT);
				return;
			case TextPackage.ALPHABETICAL_INDEX_SOURCE_TYPE__MAIN_ENTRY_STYLE_NAME:
				setMainEntryStyleName(MAIN_ENTRY_STYLE_NAME_EDEFAULT);
				return;
			case TextPackage.ALPHABETICAL_INDEX_SOURCE_TYPE__RELATIVE_TAB_STOP_POSITION:
				unsetRelativeTabStopPosition();
				return;
			case TextPackage.ALPHABETICAL_INDEX_SOURCE_TYPE__SORT_ALGORITHM:
				setSortAlgorithm(SORT_ALGORITHM_EDEFAULT);
				return;
			case TextPackage.ALPHABETICAL_INDEX_SOURCE_TYPE__USE_KEYS_AS_ENTRIES:
				unsetUseKeysAsEntries();
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
			case TextPackage.ALPHABETICAL_INDEX_SOURCE_TYPE__INDEX_TITLE_TEMPLATE:
				return indexTitleTemplate != null;
			case TextPackage.ALPHABETICAL_INDEX_SOURCE_TYPE__ALPHABETICAL_INDEX_ENTRY_TEMPLATE:
				return alphabeticalIndexEntryTemplate != null && !alphabeticalIndexEntryTemplate.isEmpty();
			case TextPackage.ALPHABETICAL_INDEX_SOURCE_TYPE__ALPHABETICAL_SEPARATORS:
				return isSetAlphabeticalSeparators();
			case TextPackage.ALPHABETICAL_INDEX_SOURCE_TYPE__CAPITALIZE_ENTRIES:
				return isSetCapitalizeEntries();
			case TextPackage.ALPHABETICAL_INDEX_SOURCE_TYPE__COMBINE_ENTRIES:
				return isSetCombineEntries();
			case TextPackage.ALPHABETICAL_INDEX_SOURCE_TYPE__COMBINE_ENTRIES_WITH_DASH:
				return isSetCombineEntriesWithDash();
			case TextPackage.ALPHABETICAL_INDEX_SOURCE_TYPE__COMBINE_ENTRIES_WITH_PP:
				return isSetCombineEntriesWithPp();
			case TextPackage.ALPHABETICAL_INDEX_SOURCE_TYPE__COMMA_SEPARATED:
				return isSetCommaSeparated();
			case TextPackage.ALPHABETICAL_INDEX_SOURCE_TYPE__COUNTRY:
				return COUNTRY_EDEFAULT == null ? country != null : !COUNTRY_EDEFAULT.equals(country);
			case TextPackage.ALPHABETICAL_INDEX_SOURCE_TYPE__IGNORE_CASE:
				return isSetIgnoreCase();
			case TextPackage.ALPHABETICAL_INDEX_SOURCE_TYPE__INDEX_SCOPE:
				return isSetIndexScope();
			case TextPackage.ALPHABETICAL_INDEX_SOURCE_TYPE__LANGUAGE:
				return LANGUAGE_EDEFAULT == null ? language != null : !LANGUAGE_EDEFAULT.equals(language);
			case TextPackage.ALPHABETICAL_INDEX_SOURCE_TYPE__MAIN_ENTRY_STYLE_NAME:
				return MAIN_ENTRY_STYLE_NAME_EDEFAULT == null ? mainEntryStyleName != null : !MAIN_ENTRY_STYLE_NAME_EDEFAULT.equals(mainEntryStyleName);
			case TextPackage.ALPHABETICAL_INDEX_SOURCE_TYPE__RELATIVE_TAB_STOP_POSITION:
				return isSetRelativeTabStopPosition();
			case TextPackage.ALPHABETICAL_INDEX_SOURCE_TYPE__SORT_ALGORITHM:
				return SORT_ALGORITHM_EDEFAULT == null ? sortAlgorithm != null : !SORT_ALGORITHM_EDEFAULT.equals(sortAlgorithm);
			case TextPackage.ALPHABETICAL_INDEX_SOURCE_TYPE__USE_KEYS_AS_ENTRIES:
				return isSetUseKeysAsEntries();
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
		result.append(" (alphabeticalSeparators: ");
		if (alphabeticalSeparatorsESet) result.append(alphabeticalSeparators); else result.append("<unset>");
		result.append(", capitalizeEntries: ");
		if (capitalizeEntriesESet) result.append(capitalizeEntries); else result.append("<unset>");
		result.append(", combineEntries: ");
		if (combineEntriesESet) result.append(combineEntries); else result.append("<unset>");
		result.append(", combineEntriesWithDash: ");
		if (combineEntriesWithDashESet) result.append(combineEntriesWithDash); else result.append("<unset>");
		result.append(", combineEntriesWithPp: ");
		if (combineEntriesWithPpESet) result.append(combineEntriesWithPp); else result.append("<unset>");
		result.append(", commaSeparated: ");
		if (commaSeparatedESet) result.append(commaSeparated); else result.append("<unset>");
		result.append(", country: ");
		result.append(country);
		result.append(", ignoreCase: ");
		if (ignoreCaseESet) result.append(ignoreCase); else result.append("<unset>");
		result.append(", indexScope: ");
		if (indexScopeESet) result.append(indexScope); else result.append("<unset>");
		result.append(", language: ");
		result.append(language);
		result.append(", mainEntryStyleName: ");
		result.append(mainEntryStyleName);
		result.append(", relativeTabStopPosition: ");
		if (relativeTabStopPositionESet) result.append(relativeTabStopPosition); else result.append("<unset>");
		result.append(", sortAlgorithm: ");
		result.append(sortAlgorithm);
		result.append(", useKeysAsEntries: ");
		if (useKeysAsEntriesESet) result.append(useKeysAsEntries); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //AlphabeticalIndexSourceTypeImpl
