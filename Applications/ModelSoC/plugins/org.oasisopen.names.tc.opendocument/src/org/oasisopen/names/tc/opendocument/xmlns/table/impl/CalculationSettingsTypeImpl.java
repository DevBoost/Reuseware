/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.table.impl;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.oasisopen.names.tc.opendocument.xmlns.table.CalculationSettingsType;
import org.oasisopen.names.tc.opendocument.xmlns.table.IterationType;
import org.oasisopen.names.tc.opendocument.xmlns.table.NullDateType;
import org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Calculation Settings Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.CalculationSettingsTypeImpl#getNullDate <em>Null Date</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.CalculationSettingsTypeImpl#getIteration <em>Iteration</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.CalculationSettingsTypeImpl#getAutomaticFindLabels <em>Automatic Find Labels</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.CalculationSettingsTypeImpl#getCaseSensitive <em>Case Sensitive</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.CalculationSettingsTypeImpl#getNullYear <em>Null Year</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.CalculationSettingsTypeImpl#getPrecisionAsShown <em>Precision As Shown</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.CalculationSettingsTypeImpl#getSearchCriteriaMustApplyToWholeCell <em>Search Criteria Must Apply To Whole Cell</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.CalculationSettingsTypeImpl#getUseRegularExpressions <em>Use Regular Expressions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CalculationSettingsTypeImpl extends EObjectImpl implements CalculationSettingsType {
	/**
	 * The cached value of the '{@link #getNullDate() <em>Null Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNullDate()
	 * @generated
	 * @ordered
	 */
	protected NullDateType nullDate;

	/**
	 * The cached value of the '{@link #getIteration() <em>Iteration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIteration()
	 * @generated
	 * @ordered
	 */
	protected IterationType iteration;

	/**
	 * The default value of the '{@link #getAutomaticFindLabels() <em>Automatic Find Labels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutomaticFindLabels()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean AUTOMATIC_FIND_LABELS_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getAutomaticFindLabels() <em>Automatic Find Labels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutomaticFindLabels()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean automaticFindLabels = AUTOMATIC_FIND_LABELS_EDEFAULT;

	/**
	 * This is true if the Automatic Find Labels attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean automaticFindLabelsESet;

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
	 * The default value of the '{@link #getNullYear() <em>Null Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNullYear()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger NULL_YEAR_EDEFAULT = new BigInteger("1930");

	/**
	 * The cached value of the '{@link #getNullYear() <em>Null Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNullYear()
	 * @generated
	 * @ordered
	 */
	protected BigInteger nullYear = NULL_YEAR_EDEFAULT;

	/**
	 * This is true if the Null Year attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nullYearESet;

	/**
	 * The default value of the '{@link #getPrecisionAsShown() <em>Precision As Shown</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecisionAsShown()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean PRECISION_AS_SHOWN_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getPrecisionAsShown() <em>Precision As Shown</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecisionAsShown()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean precisionAsShown = PRECISION_AS_SHOWN_EDEFAULT;

	/**
	 * This is true if the Precision As Shown attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean precisionAsShownESet;

	/**
	 * The default value of the '{@link #getSearchCriteriaMustApplyToWholeCell() <em>Search Criteria Must Apply To Whole Cell</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSearchCriteriaMustApplyToWholeCell()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean SEARCH_CRITERIA_MUST_APPLY_TO_WHOLE_CELL_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getSearchCriteriaMustApplyToWholeCell() <em>Search Criteria Must Apply To Whole Cell</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSearchCriteriaMustApplyToWholeCell()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean searchCriteriaMustApplyToWholeCell = SEARCH_CRITERIA_MUST_APPLY_TO_WHOLE_CELL_EDEFAULT;

	/**
	 * This is true if the Search Criteria Must Apply To Whole Cell attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean searchCriteriaMustApplyToWholeCellESet;

	/**
	 * The default value of the '{@link #getUseRegularExpressions() <em>Use Regular Expressions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseRegularExpressions()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean USE_REGULAR_EXPRESSIONS_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getUseRegularExpressions() <em>Use Regular Expressions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseRegularExpressions()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean useRegularExpressions = USE_REGULAR_EXPRESSIONS_EDEFAULT;

	/**
	 * This is true if the Use Regular Expressions attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean useRegularExpressionsESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CalculationSettingsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TablePackage.eINSTANCE.getCalculationSettingsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NullDateType getNullDate() {
		return nullDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNullDate(NullDateType newNullDate, NotificationChain msgs) {
		NullDateType oldNullDate = nullDate;
		nullDate = newNullDate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TablePackage.CALCULATION_SETTINGS_TYPE__NULL_DATE, oldNullDate, newNullDate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNullDate(NullDateType newNullDate) {
		if (newNullDate != nullDate) {
			NotificationChain msgs = null;
			if (nullDate != null)
				msgs = ((InternalEObject)nullDate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TablePackage.CALCULATION_SETTINGS_TYPE__NULL_DATE, null, msgs);
			if (newNullDate != null)
				msgs = ((InternalEObject)newNullDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TablePackage.CALCULATION_SETTINGS_TYPE__NULL_DATE, null, msgs);
			msgs = basicSetNullDate(newNullDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.CALCULATION_SETTINGS_TYPE__NULL_DATE, newNullDate, newNullDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IterationType getIteration() {
		return iteration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIteration(IterationType newIteration, NotificationChain msgs) {
		IterationType oldIteration = iteration;
		iteration = newIteration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TablePackage.CALCULATION_SETTINGS_TYPE__ITERATION, oldIteration, newIteration);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIteration(IterationType newIteration) {
		if (newIteration != iteration) {
			NotificationChain msgs = null;
			if (iteration != null)
				msgs = ((InternalEObject)iteration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TablePackage.CALCULATION_SETTINGS_TYPE__ITERATION, null, msgs);
			if (newIteration != null)
				msgs = ((InternalEObject)newIteration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TablePackage.CALCULATION_SETTINGS_TYPE__ITERATION, null, msgs);
			msgs = basicSetIteration(newIteration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.CALCULATION_SETTINGS_TYPE__ITERATION, newIteration, newIteration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getAutomaticFindLabels() {
		return automaticFindLabels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAutomaticFindLabels(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newAutomaticFindLabels) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldAutomaticFindLabels = automaticFindLabels;
		automaticFindLabels = newAutomaticFindLabels == null ? AUTOMATIC_FIND_LABELS_EDEFAULT : newAutomaticFindLabels;
		boolean oldAutomaticFindLabelsESet = automaticFindLabelsESet;
		automaticFindLabelsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.CALCULATION_SETTINGS_TYPE__AUTOMATIC_FIND_LABELS, oldAutomaticFindLabels, automaticFindLabels, !oldAutomaticFindLabelsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAutomaticFindLabels() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldAutomaticFindLabels = automaticFindLabels;
		boolean oldAutomaticFindLabelsESet = automaticFindLabelsESet;
		automaticFindLabels = AUTOMATIC_FIND_LABELS_EDEFAULT;
		automaticFindLabelsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TablePackage.CALCULATION_SETTINGS_TYPE__AUTOMATIC_FIND_LABELS, oldAutomaticFindLabels, AUTOMATIC_FIND_LABELS_EDEFAULT, oldAutomaticFindLabelsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAutomaticFindLabels() {
		return automaticFindLabelsESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.CALCULATION_SETTINGS_TYPE__CASE_SENSITIVE, oldCaseSensitive, caseSensitive, !oldCaseSensitiveESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, TablePackage.CALCULATION_SETTINGS_TYPE__CASE_SENSITIVE, oldCaseSensitive, CASE_SENSITIVE_EDEFAULT, oldCaseSensitiveESet));
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
	public BigInteger getNullYear() {
		return nullYear;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNullYear(BigInteger newNullYear) {
		BigInteger oldNullYear = nullYear;
		nullYear = newNullYear;
		boolean oldNullYearESet = nullYearESet;
		nullYearESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.CALCULATION_SETTINGS_TYPE__NULL_YEAR, oldNullYear, nullYear, !oldNullYearESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNullYear() {
		BigInteger oldNullYear = nullYear;
		boolean oldNullYearESet = nullYearESet;
		nullYear = NULL_YEAR_EDEFAULT;
		nullYearESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TablePackage.CALCULATION_SETTINGS_TYPE__NULL_YEAR, oldNullYear, NULL_YEAR_EDEFAULT, oldNullYearESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNullYear() {
		return nullYearESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getPrecisionAsShown() {
		return precisionAsShown;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrecisionAsShown(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newPrecisionAsShown) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldPrecisionAsShown = precisionAsShown;
		precisionAsShown = newPrecisionAsShown == null ? PRECISION_AS_SHOWN_EDEFAULT : newPrecisionAsShown;
		boolean oldPrecisionAsShownESet = precisionAsShownESet;
		precisionAsShownESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.CALCULATION_SETTINGS_TYPE__PRECISION_AS_SHOWN, oldPrecisionAsShown, precisionAsShown, !oldPrecisionAsShownESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPrecisionAsShown() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldPrecisionAsShown = precisionAsShown;
		boolean oldPrecisionAsShownESet = precisionAsShownESet;
		precisionAsShown = PRECISION_AS_SHOWN_EDEFAULT;
		precisionAsShownESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TablePackage.CALCULATION_SETTINGS_TYPE__PRECISION_AS_SHOWN, oldPrecisionAsShown, PRECISION_AS_SHOWN_EDEFAULT, oldPrecisionAsShownESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPrecisionAsShown() {
		return precisionAsShownESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getSearchCriteriaMustApplyToWholeCell() {
		return searchCriteriaMustApplyToWholeCell;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSearchCriteriaMustApplyToWholeCell(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newSearchCriteriaMustApplyToWholeCell) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldSearchCriteriaMustApplyToWholeCell = searchCriteriaMustApplyToWholeCell;
		searchCriteriaMustApplyToWholeCell = newSearchCriteriaMustApplyToWholeCell == null ? SEARCH_CRITERIA_MUST_APPLY_TO_WHOLE_CELL_EDEFAULT : newSearchCriteriaMustApplyToWholeCell;
		boolean oldSearchCriteriaMustApplyToWholeCellESet = searchCriteriaMustApplyToWholeCellESet;
		searchCriteriaMustApplyToWholeCellESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.CALCULATION_SETTINGS_TYPE__SEARCH_CRITERIA_MUST_APPLY_TO_WHOLE_CELL, oldSearchCriteriaMustApplyToWholeCell, searchCriteriaMustApplyToWholeCell, !oldSearchCriteriaMustApplyToWholeCellESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSearchCriteriaMustApplyToWholeCell() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldSearchCriteriaMustApplyToWholeCell = searchCriteriaMustApplyToWholeCell;
		boolean oldSearchCriteriaMustApplyToWholeCellESet = searchCriteriaMustApplyToWholeCellESet;
		searchCriteriaMustApplyToWholeCell = SEARCH_CRITERIA_MUST_APPLY_TO_WHOLE_CELL_EDEFAULT;
		searchCriteriaMustApplyToWholeCellESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TablePackage.CALCULATION_SETTINGS_TYPE__SEARCH_CRITERIA_MUST_APPLY_TO_WHOLE_CELL, oldSearchCriteriaMustApplyToWholeCell, SEARCH_CRITERIA_MUST_APPLY_TO_WHOLE_CELL_EDEFAULT, oldSearchCriteriaMustApplyToWholeCellESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSearchCriteriaMustApplyToWholeCell() {
		return searchCriteriaMustApplyToWholeCellESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getUseRegularExpressions() {
		return useRegularExpressions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUseRegularExpressions(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newUseRegularExpressions) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldUseRegularExpressions = useRegularExpressions;
		useRegularExpressions = newUseRegularExpressions == null ? USE_REGULAR_EXPRESSIONS_EDEFAULT : newUseRegularExpressions;
		boolean oldUseRegularExpressionsESet = useRegularExpressionsESet;
		useRegularExpressionsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.CALCULATION_SETTINGS_TYPE__USE_REGULAR_EXPRESSIONS, oldUseRegularExpressions, useRegularExpressions, !oldUseRegularExpressionsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetUseRegularExpressions() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldUseRegularExpressions = useRegularExpressions;
		boolean oldUseRegularExpressionsESet = useRegularExpressionsESet;
		useRegularExpressions = USE_REGULAR_EXPRESSIONS_EDEFAULT;
		useRegularExpressionsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TablePackage.CALCULATION_SETTINGS_TYPE__USE_REGULAR_EXPRESSIONS, oldUseRegularExpressions, USE_REGULAR_EXPRESSIONS_EDEFAULT, oldUseRegularExpressionsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetUseRegularExpressions() {
		return useRegularExpressionsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TablePackage.CALCULATION_SETTINGS_TYPE__NULL_DATE:
				return basicSetNullDate(null, msgs);
			case TablePackage.CALCULATION_SETTINGS_TYPE__ITERATION:
				return basicSetIteration(null, msgs);
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
			case TablePackage.CALCULATION_SETTINGS_TYPE__NULL_DATE:
				return getNullDate();
			case TablePackage.CALCULATION_SETTINGS_TYPE__ITERATION:
				return getIteration();
			case TablePackage.CALCULATION_SETTINGS_TYPE__AUTOMATIC_FIND_LABELS:
				return getAutomaticFindLabels();
			case TablePackage.CALCULATION_SETTINGS_TYPE__CASE_SENSITIVE:
				return getCaseSensitive();
			case TablePackage.CALCULATION_SETTINGS_TYPE__NULL_YEAR:
				return getNullYear();
			case TablePackage.CALCULATION_SETTINGS_TYPE__PRECISION_AS_SHOWN:
				return getPrecisionAsShown();
			case TablePackage.CALCULATION_SETTINGS_TYPE__SEARCH_CRITERIA_MUST_APPLY_TO_WHOLE_CELL:
				return getSearchCriteriaMustApplyToWholeCell();
			case TablePackage.CALCULATION_SETTINGS_TYPE__USE_REGULAR_EXPRESSIONS:
				return getUseRegularExpressions();
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
			case TablePackage.CALCULATION_SETTINGS_TYPE__NULL_DATE:
				setNullDate((NullDateType)newValue);
				return;
			case TablePackage.CALCULATION_SETTINGS_TYPE__ITERATION:
				setIteration((IterationType)newValue);
				return;
			case TablePackage.CALCULATION_SETTINGS_TYPE__AUTOMATIC_FIND_LABELS:
				setAutomaticFindLabels((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case TablePackage.CALCULATION_SETTINGS_TYPE__CASE_SENSITIVE:
				setCaseSensitive((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case TablePackage.CALCULATION_SETTINGS_TYPE__NULL_YEAR:
				setNullYear((BigInteger)newValue);
				return;
			case TablePackage.CALCULATION_SETTINGS_TYPE__PRECISION_AS_SHOWN:
				setPrecisionAsShown((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case TablePackage.CALCULATION_SETTINGS_TYPE__SEARCH_CRITERIA_MUST_APPLY_TO_WHOLE_CELL:
				setSearchCriteriaMustApplyToWholeCell((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case TablePackage.CALCULATION_SETTINGS_TYPE__USE_REGULAR_EXPRESSIONS:
				setUseRegularExpressions((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
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
			case TablePackage.CALCULATION_SETTINGS_TYPE__NULL_DATE:
				setNullDate((NullDateType)null);
				return;
			case TablePackage.CALCULATION_SETTINGS_TYPE__ITERATION:
				setIteration((IterationType)null);
				return;
			case TablePackage.CALCULATION_SETTINGS_TYPE__AUTOMATIC_FIND_LABELS:
				unsetAutomaticFindLabels();
				return;
			case TablePackage.CALCULATION_SETTINGS_TYPE__CASE_SENSITIVE:
				unsetCaseSensitive();
				return;
			case TablePackage.CALCULATION_SETTINGS_TYPE__NULL_YEAR:
				unsetNullYear();
				return;
			case TablePackage.CALCULATION_SETTINGS_TYPE__PRECISION_AS_SHOWN:
				unsetPrecisionAsShown();
				return;
			case TablePackage.CALCULATION_SETTINGS_TYPE__SEARCH_CRITERIA_MUST_APPLY_TO_WHOLE_CELL:
				unsetSearchCriteriaMustApplyToWholeCell();
				return;
			case TablePackage.CALCULATION_SETTINGS_TYPE__USE_REGULAR_EXPRESSIONS:
				unsetUseRegularExpressions();
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
			case TablePackage.CALCULATION_SETTINGS_TYPE__NULL_DATE:
				return nullDate != null;
			case TablePackage.CALCULATION_SETTINGS_TYPE__ITERATION:
				return iteration != null;
			case TablePackage.CALCULATION_SETTINGS_TYPE__AUTOMATIC_FIND_LABELS:
				return isSetAutomaticFindLabels();
			case TablePackage.CALCULATION_SETTINGS_TYPE__CASE_SENSITIVE:
				return isSetCaseSensitive();
			case TablePackage.CALCULATION_SETTINGS_TYPE__NULL_YEAR:
				return isSetNullYear();
			case TablePackage.CALCULATION_SETTINGS_TYPE__PRECISION_AS_SHOWN:
				return isSetPrecisionAsShown();
			case TablePackage.CALCULATION_SETTINGS_TYPE__SEARCH_CRITERIA_MUST_APPLY_TO_WHOLE_CELL:
				return isSetSearchCriteriaMustApplyToWholeCell();
			case TablePackage.CALCULATION_SETTINGS_TYPE__USE_REGULAR_EXPRESSIONS:
				return isSetUseRegularExpressions();
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
		result.append(" (automaticFindLabels: ");
		if (automaticFindLabelsESet) result.append(automaticFindLabels); else result.append("<unset>");
		result.append(", caseSensitive: ");
		if (caseSensitiveESet) result.append(caseSensitive); else result.append("<unset>");
		result.append(", nullYear: ");
		if (nullYearESet) result.append(nullYear); else result.append("<unset>");
		result.append(", precisionAsShown: ");
		if (precisionAsShownESet) result.append(precisionAsShown); else result.append("<unset>");
		result.append(", searchCriteriaMustApplyToWholeCell: ");
		if (searchCriteriaMustApplyToWholeCellESet) result.append(searchCriteriaMustApplyToWholeCell); else result.append("<unset>");
		result.append(", useRegularExpressions: ");
		if (useRegularExpressionsESet) result.append(useRegularExpressions); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //CalculationSettingsTypeImpl
