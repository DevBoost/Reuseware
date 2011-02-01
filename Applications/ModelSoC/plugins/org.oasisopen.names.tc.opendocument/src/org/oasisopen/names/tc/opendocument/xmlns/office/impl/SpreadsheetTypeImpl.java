/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.office.impl;

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
import org.oasisopen.names.tc.opendocument.xmlns.office.OfficePackage;
import org.oasisopen.names.tc.opendocument.xmlns.office.SpreadsheetType;
import org.oasisopen.names.tc.opendocument.xmlns.table.CalculationSettingsType;
import org.oasisopen.names.tc.opendocument.xmlns.table.ConsolidationType;
import org.oasisopen.names.tc.opendocument.xmlns.table.ContentValidationsType;
import org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotTablesType;
import org.oasisopen.names.tc.opendocument.xmlns.table.DatabaseRangesType;
import org.oasisopen.names.tc.opendocument.xmlns.table.DdeLinksType;
import org.oasisopen.names.tc.opendocument.xmlns.table.LabelRangesType;
import org.oasisopen.names.tc.opendocument.xmlns.table.NamedExpressionsType;
import org.oasisopen.names.tc.opendocument.xmlns.table.TableType;
import org.oasisopen.names.tc.opendocument.xmlns.table.TrackedChangesType;
import org.oasisopen.names.tc.opendocument.xmlns.text.AlphabeticalIndexAutoMarkFileType;
import org.oasisopen.names.tc.opendocument.xmlns.text.DdeConnectionDeclsType;
import org.oasisopen.names.tc.opendocument.xmlns.text.SequenceDeclsType;
import org.oasisopen.names.tc.opendocument.xmlns.text.UserFieldDeclsType;
import org.oasisopen.names.tc.opendocument.xmlns.text.VariableDeclsType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Spreadsheet Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.SpreadsheetTypeImpl#getTrackedChanges <em>Tracked Changes</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.SpreadsheetTypeImpl#getVariableDecls <em>Variable Decls</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.SpreadsheetTypeImpl#getSequenceDecls <em>Sequence Decls</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.SpreadsheetTypeImpl#getUserFieldDecls <em>User Field Decls</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.SpreadsheetTypeImpl#getDdeConnectionDecls <em>Dde Connection Decls</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.SpreadsheetTypeImpl#getAlphabeticalIndexAutoMarkFile <em>Alphabetical Index Auto Mark File</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.SpreadsheetTypeImpl#getCalculationSettings <em>Calculation Settings</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.SpreadsheetTypeImpl#getContentValidations <em>Content Validations</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.SpreadsheetTypeImpl#getLabelRanges <em>Label Ranges</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.SpreadsheetTypeImpl#getTable <em>Table</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.SpreadsheetTypeImpl#getNamedExpressions <em>Named Expressions</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.SpreadsheetTypeImpl#getDatabaseRanges <em>Database Ranges</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.SpreadsheetTypeImpl#getDataPilotTables <em>Data Pilot Tables</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.SpreadsheetTypeImpl#getConsolidation <em>Consolidation</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.SpreadsheetTypeImpl#getDdeLinks <em>Dde Links</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.SpreadsheetTypeImpl#getProtectionKey <em>Protection Key</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.SpreadsheetTypeImpl#getStructureProtected <em>Structure Protected</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SpreadsheetTypeImpl extends EObjectImpl implements SpreadsheetType {
	/**
	 * The cached value of the '{@link #getTrackedChanges() <em>Tracked Changes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrackedChanges()
	 * @generated
	 * @ordered
	 */
	protected TrackedChangesType trackedChanges;

	/**
	 * The cached value of the '{@link #getVariableDecls() <em>Variable Decls</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariableDecls()
	 * @generated
	 * @ordered
	 */
	protected VariableDeclsType variableDecls;

	/**
	 * The cached value of the '{@link #getSequenceDecls() <em>Sequence Decls</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequenceDecls()
	 * @generated
	 * @ordered
	 */
	protected SequenceDeclsType sequenceDecls;

	/**
	 * The cached value of the '{@link #getUserFieldDecls() <em>User Field Decls</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserFieldDecls()
	 * @generated
	 * @ordered
	 */
	protected UserFieldDeclsType userFieldDecls;

	/**
	 * The cached value of the '{@link #getDdeConnectionDecls() <em>Dde Connection Decls</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDdeConnectionDecls()
	 * @generated
	 * @ordered
	 */
	protected DdeConnectionDeclsType ddeConnectionDecls;

	/**
	 * The cached value of the '{@link #getAlphabeticalIndexAutoMarkFile() <em>Alphabetical Index Auto Mark File</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlphabeticalIndexAutoMarkFile()
	 * @generated
	 * @ordered
	 */
	protected AlphabeticalIndexAutoMarkFileType alphabeticalIndexAutoMarkFile;

	/**
	 * The cached value of the '{@link #getCalculationSettings() <em>Calculation Settings</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalculationSettings()
	 * @generated
	 * @ordered
	 */
	protected CalculationSettingsType calculationSettings;

	/**
	 * The cached value of the '{@link #getContentValidations() <em>Content Validations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentValidations()
	 * @generated
	 * @ordered
	 */
	protected ContentValidationsType contentValidations;

	/**
	 * The cached value of the '{@link #getLabelRanges() <em>Label Ranges</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabelRanges()
	 * @generated
	 * @ordered
	 */
	protected LabelRangesType labelRanges;

	/**
	 * The cached value of the '{@link #getTable() <em>Table</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTable()
	 * @generated
	 * @ordered
	 */
	protected EList<TableType> table;

	/**
	 * The cached value of the '{@link #getNamedExpressions() <em>Named Expressions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamedExpressions()
	 * @generated
	 * @ordered
	 */
	protected NamedExpressionsType namedExpressions;

	/**
	 * The cached value of the '{@link #getDatabaseRanges() <em>Database Ranges</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatabaseRanges()
	 * @generated
	 * @ordered
	 */
	protected DatabaseRangesType databaseRanges;

	/**
	 * The cached value of the '{@link #getDataPilotTables() <em>Data Pilot Tables</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataPilotTables()
	 * @generated
	 * @ordered
	 */
	protected DataPilotTablesType dataPilotTables;

	/**
	 * The cached value of the '{@link #getConsolidation() <em>Consolidation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsolidation()
	 * @generated
	 * @ordered
	 */
	protected ConsolidationType consolidation;

	/**
	 * The cached value of the '{@link #getDdeLinks() <em>Dde Links</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDdeLinks()
	 * @generated
	 * @ordered
	 */
	protected DdeLinksType ddeLinks;

	/**
	 * The default value of the '{@link #getProtectionKey() <em>Protection Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtectionKey()
	 * @generated
	 * @ordered
	 */
	protected static final String PROTECTION_KEY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProtectionKey() <em>Protection Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtectionKey()
	 * @generated
	 * @ordered
	 */
	protected String protectionKey = PROTECTION_KEY_EDEFAULT;

	/**
	 * The default value of the '{@link #getStructureProtected() <em>Structure Protected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStructureProtected()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean STRUCTURE_PROTECTED_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getStructureProtected() <em>Structure Protected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStructureProtected()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean structureProtected = STRUCTURE_PROTECTED_EDEFAULT;

	/**
	 * This is true if the Structure Protected attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean structureProtectedESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpreadsheetTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OfficePackage.Literals.SPREADSHEET_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrackedChangesType getTrackedChanges() {
		return trackedChanges;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTrackedChanges(TrackedChangesType newTrackedChanges, NotificationChain msgs) {
		TrackedChangesType oldTrackedChanges = trackedChanges;
		trackedChanges = newTrackedChanges;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OfficePackage.SPREADSHEET_TYPE__TRACKED_CHANGES, oldTrackedChanges, newTrackedChanges);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrackedChanges(TrackedChangesType newTrackedChanges) {
		if (newTrackedChanges != trackedChanges) {
			NotificationChain msgs = null;
			if (trackedChanges != null)
				msgs = ((InternalEObject)trackedChanges).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OfficePackage.SPREADSHEET_TYPE__TRACKED_CHANGES, null, msgs);
			if (newTrackedChanges != null)
				msgs = ((InternalEObject)newTrackedChanges).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OfficePackage.SPREADSHEET_TYPE__TRACKED_CHANGES, null, msgs);
			msgs = basicSetTrackedChanges(newTrackedChanges, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OfficePackage.SPREADSHEET_TYPE__TRACKED_CHANGES, newTrackedChanges, newTrackedChanges));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableDeclsType getVariableDecls() {
		return variableDecls;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVariableDecls(VariableDeclsType newVariableDecls, NotificationChain msgs) {
		VariableDeclsType oldVariableDecls = variableDecls;
		variableDecls = newVariableDecls;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OfficePackage.SPREADSHEET_TYPE__VARIABLE_DECLS, oldVariableDecls, newVariableDecls);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariableDecls(VariableDeclsType newVariableDecls) {
		if (newVariableDecls != variableDecls) {
			NotificationChain msgs = null;
			if (variableDecls != null)
				msgs = ((InternalEObject)variableDecls).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OfficePackage.SPREADSHEET_TYPE__VARIABLE_DECLS, null, msgs);
			if (newVariableDecls != null)
				msgs = ((InternalEObject)newVariableDecls).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OfficePackage.SPREADSHEET_TYPE__VARIABLE_DECLS, null, msgs);
			msgs = basicSetVariableDecls(newVariableDecls, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OfficePackage.SPREADSHEET_TYPE__VARIABLE_DECLS, newVariableDecls, newVariableDecls));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SequenceDeclsType getSequenceDecls() {
		return sequenceDecls;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSequenceDecls(SequenceDeclsType newSequenceDecls, NotificationChain msgs) {
		SequenceDeclsType oldSequenceDecls = sequenceDecls;
		sequenceDecls = newSequenceDecls;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OfficePackage.SPREADSHEET_TYPE__SEQUENCE_DECLS, oldSequenceDecls, newSequenceDecls);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSequenceDecls(SequenceDeclsType newSequenceDecls) {
		if (newSequenceDecls != sequenceDecls) {
			NotificationChain msgs = null;
			if (sequenceDecls != null)
				msgs = ((InternalEObject)sequenceDecls).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OfficePackage.SPREADSHEET_TYPE__SEQUENCE_DECLS, null, msgs);
			if (newSequenceDecls != null)
				msgs = ((InternalEObject)newSequenceDecls).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OfficePackage.SPREADSHEET_TYPE__SEQUENCE_DECLS, null, msgs);
			msgs = basicSetSequenceDecls(newSequenceDecls, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OfficePackage.SPREADSHEET_TYPE__SEQUENCE_DECLS, newSequenceDecls, newSequenceDecls));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserFieldDeclsType getUserFieldDecls() {
		return userFieldDecls;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUserFieldDecls(UserFieldDeclsType newUserFieldDecls, NotificationChain msgs) {
		UserFieldDeclsType oldUserFieldDecls = userFieldDecls;
		userFieldDecls = newUserFieldDecls;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OfficePackage.SPREADSHEET_TYPE__USER_FIELD_DECLS, oldUserFieldDecls, newUserFieldDecls);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserFieldDecls(UserFieldDeclsType newUserFieldDecls) {
		if (newUserFieldDecls != userFieldDecls) {
			NotificationChain msgs = null;
			if (userFieldDecls != null)
				msgs = ((InternalEObject)userFieldDecls).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OfficePackage.SPREADSHEET_TYPE__USER_FIELD_DECLS, null, msgs);
			if (newUserFieldDecls != null)
				msgs = ((InternalEObject)newUserFieldDecls).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OfficePackage.SPREADSHEET_TYPE__USER_FIELD_DECLS, null, msgs);
			msgs = basicSetUserFieldDecls(newUserFieldDecls, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OfficePackage.SPREADSHEET_TYPE__USER_FIELD_DECLS, newUserFieldDecls, newUserFieldDecls));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DdeConnectionDeclsType getDdeConnectionDecls() {
		return ddeConnectionDecls;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDdeConnectionDecls(DdeConnectionDeclsType newDdeConnectionDecls, NotificationChain msgs) {
		DdeConnectionDeclsType oldDdeConnectionDecls = ddeConnectionDecls;
		ddeConnectionDecls = newDdeConnectionDecls;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OfficePackage.SPREADSHEET_TYPE__DDE_CONNECTION_DECLS, oldDdeConnectionDecls, newDdeConnectionDecls);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDdeConnectionDecls(DdeConnectionDeclsType newDdeConnectionDecls) {
		if (newDdeConnectionDecls != ddeConnectionDecls) {
			NotificationChain msgs = null;
			if (ddeConnectionDecls != null)
				msgs = ((InternalEObject)ddeConnectionDecls).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OfficePackage.SPREADSHEET_TYPE__DDE_CONNECTION_DECLS, null, msgs);
			if (newDdeConnectionDecls != null)
				msgs = ((InternalEObject)newDdeConnectionDecls).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OfficePackage.SPREADSHEET_TYPE__DDE_CONNECTION_DECLS, null, msgs);
			msgs = basicSetDdeConnectionDecls(newDdeConnectionDecls, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OfficePackage.SPREADSHEET_TYPE__DDE_CONNECTION_DECLS, newDdeConnectionDecls, newDdeConnectionDecls));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlphabeticalIndexAutoMarkFileType getAlphabeticalIndexAutoMarkFile() {
		return alphabeticalIndexAutoMarkFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAlphabeticalIndexAutoMarkFile(AlphabeticalIndexAutoMarkFileType newAlphabeticalIndexAutoMarkFile, NotificationChain msgs) {
		AlphabeticalIndexAutoMarkFileType oldAlphabeticalIndexAutoMarkFile = alphabeticalIndexAutoMarkFile;
		alphabeticalIndexAutoMarkFile = newAlphabeticalIndexAutoMarkFile;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OfficePackage.SPREADSHEET_TYPE__ALPHABETICAL_INDEX_AUTO_MARK_FILE, oldAlphabeticalIndexAutoMarkFile, newAlphabeticalIndexAutoMarkFile);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlphabeticalIndexAutoMarkFile(AlphabeticalIndexAutoMarkFileType newAlphabeticalIndexAutoMarkFile) {
		if (newAlphabeticalIndexAutoMarkFile != alphabeticalIndexAutoMarkFile) {
			NotificationChain msgs = null;
			if (alphabeticalIndexAutoMarkFile != null)
				msgs = ((InternalEObject)alphabeticalIndexAutoMarkFile).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OfficePackage.SPREADSHEET_TYPE__ALPHABETICAL_INDEX_AUTO_MARK_FILE, null, msgs);
			if (newAlphabeticalIndexAutoMarkFile != null)
				msgs = ((InternalEObject)newAlphabeticalIndexAutoMarkFile).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OfficePackage.SPREADSHEET_TYPE__ALPHABETICAL_INDEX_AUTO_MARK_FILE, null, msgs);
			msgs = basicSetAlphabeticalIndexAutoMarkFile(newAlphabeticalIndexAutoMarkFile, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OfficePackage.SPREADSHEET_TYPE__ALPHABETICAL_INDEX_AUTO_MARK_FILE, newAlphabeticalIndexAutoMarkFile, newAlphabeticalIndexAutoMarkFile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalculationSettingsType getCalculationSettings() {
		return calculationSettings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCalculationSettings(CalculationSettingsType newCalculationSettings, NotificationChain msgs) {
		CalculationSettingsType oldCalculationSettings = calculationSettings;
		calculationSettings = newCalculationSettings;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OfficePackage.SPREADSHEET_TYPE__CALCULATION_SETTINGS, oldCalculationSettings, newCalculationSettings);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCalculationSettings(CalculationSettingsType newCalculationSettings) {
		if (newCalculationSettings != calculationSettings) {
			NotificationChain msgs = null;
			if (calculationSettings != null)
				msgs = ((InternalEObject)calculationSettings).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OfficePackage.SPREADSHEET_TYPE__CALCULATION_SETTINGS, null, msgs);
			if (newCalculationSettings != null)
				msgs = ((InternalEObject)newCalculationSettings).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OfficePackage.SPREADSHEET_TYPE__CALCULATION_SETTINGS, null, msgs);
			msgs = basicSetCalculationSettings(newCalculationSettings, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OfficePackage.SPREADSHEET_TYPE__CALCULATION_SETTINGS, newCalculationSettings, newCalculationSettings));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContentValidationsType getContentValidations() {
		return contentValidations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContentValidations(ContentValidationsType newContentValidations, NotificationChain msgs) {
		ContentValidationsType oldContentValidations = contentValidations;
		contentValidations = newContentValidations;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OfficePackage.SPREADSHEET_TYPE__CONTENT_VALIDATIONS, oldContentValidations, newContentValidations);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContentValidations(ContentValidationsType newContentValidations) {
		if (newContentValidations != contentValidations) {
			NotificationChain msgs = null;
			if (contentValidations != null)
				msgs = ((InternalEObject)contentValidations).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OfficePackage.SPREADSHEET_TYPE__CONTENT_VALIDATIONS, null, msgs);
			if (newContentValidations != null)
				msgs = ((InternalEObject)newContentValidations).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OfficePackage.SPREADSHEET_TYPE__CONTENT_VALIDATIONS, null, msgs);
			msgs = basicSetContentValidations(newContentValidations, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OfficePackage.SPREADSHEET_TYPE__CONTENT_VALIDATIONS, newContentValidations, newContentValidations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LabelRangesType getLabelRanges() {
		return labelRanges;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLabelRanges(LabelRangesType newLabelRanges, NotificationChain msgs) {
		LabelRangesType oldLabelRanges = labelRanges;
		labelRanges = newLabelRanges;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OfficePackage.SPREADSHEET_TYPE__LABEL_RANGES, oldLabelRanges, newLabelRanges);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabelRanges(LabelRangesType newLabelRanges) {
		if (newLabelRanges != labelRanges) {
			NotificationChain msgs = null;
			if (labelRanges != null)
				msgs = ((InternalEObject)labelRanges).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OfficePackage.SPREADSHEET_TYPE__LABEL_RANGES, null, msgs);
			if (newLabelRanges != null)
				msgs = ((InternalEObject)newLabelRanges).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OfficePackage.SPREADSHEET_TYPE__LABEL_RANGES, null, msgs);
			msgs = basicSetLabelRanges(newLabelRanges, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OfficePackage.SPREADSHEET_TYPE__LABEL_RANGES, newLabelRanges, newLabelRanges));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TableType> getTable() {
		if (table == null) {
			table = new EObjectContainmentEList<TableType>(TableType.class, this, OfficePackage.SPREADSHEET_TYPE__TABLE);
		}
		return table;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedExpressionsType getNamedExpressions() {
		return namedExpressions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNamedExpressions(NamedExpressionsType newNamedExpressions, NotificationChain msgs) {
		NamedExpressionsType oldNamedExpressions = namedExpressions;
		namedExpressions = newNamedExpressions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OfficePackage.SPREADSHEET_TYPE__NAMED_EXPRESSIONS, oldNamedExpressions, newNamedExpressions);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNamedExpressions(NamedExpressionsType newNamedExpressions) {
		if (newNamedExpressions != namedExpressions) {
			NotificationChain msgs = null;
			if (namedExpressions != null)
				msgs = ((InternalEObject)namedExpressions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OfficePackage.SPREADSHEET_TYPE__NAMED_EXPRESSIONS, null, msgs);
			if (newNamedExpressions != null)
				msgs = ((InternalEObject)newNamedExpressions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OfficePackage.SPREADSHEET_TYPE__NAMED_EXPRESSIONS, null, msgs);
			msgs = basicSetNamedExpressions(newNamedExpressions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OfficePackage.SPREADSHEET_TYPE__NAMED_EXPRESSIONS, newNamedExpressions, newNamedExpressions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatabaseRangesType getDatabaseRanges() {
		return databaseRanges;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDatabaseRanges(DatabaseRangesType newDatabaseRanges, NotificationChain msgs) {
		DatabaseRangesType oldDatabaseRanges = databaseRanges;
		databaseRanges = newDatabaseRanges;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OfficePackage.SPREADSHEET_TYPE__DATABASE_RANGES, oldDatabaseRanges, newDatabaseRanges);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatabaseRanges(DatabaseRangesType newDatabaseRanges) {
		if (newDatabaseRanges != databaseRanges) {
			NotificationChain msgs = null;
			if (databaseRanges != null)
				msgs = ((InternalEObject)databaseRanges).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OfficePackage.SPREADSHEET_TYPE__DATABASE_RANGES, null, msgs);
			if (newDatabaseRanges != null)
				msgs = ((InternalEObject)newDatabaseRanges).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OfficePackage.SPREADSHEET_TYPE__DATABASE_RANGES, null, msgs);
			msgs = basicSetDatabaseRanges(newDatabaseRanges, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OfficePackage.SPREADSHEET_TYPE__DATABASE_RANGES, newDatabaseRanges, newDatabaseRanges));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataPilotTablesType getDataPilotTables() {
		return dataPilotTables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataPilotTables(DataPilotTablesType newDataPilotTables, NotificationChain msgs) {
		DataPilotTablesType oldDataPilotTables = dataPilotTables;
		dataPilotTables = newDataPilotTables;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OfficePackage.SPREADSHEET_TYPE__DATA_PILOT_TABLES, oldDataPilotTables, newDataPilotTables);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataPilotTables(DataPilotTablesType newDataPilotTables) {
		if (newDataPilotTables != dataPilotTables) {
			NotificationChain msgs = null;
			if (dataPilotTables != null)
				msgs = ((InternalEObject)dataPilotTables).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OfficePackage.SPREADSHEET_TYPE__DATA_PILOT_TABLES, null, msgs);
			if (newDataPilotTables != null)
				msgs = ((InternalEObject)newDataPilotTables).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OfficePackage.SPREADSHEET_TYPE__DATA_PILOT_TABLES, null, msgs);
			msgs = basicSetDataPilotTables(newDataPilotTables, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OfficePackage.SPREADSHEET_TYPE__DATA_PILOT_TABLES, newDataPilotTables, newDataPilotTables));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConsolidationType getConsolidation() {
		return consolidation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConsolidation(ConsolidationType newConsolidation, NotificationChain msgs) {
		ConsolidationType oldConsolidation = consolidation;
		consolidation = newConsolidation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OfficePackage.SPREADSHEET_TYPE__CONSOLIDATION, oldConsolidation, newConsolidation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConsolidation(ConsolidationType newConsolidation) {
		if (newConsolidation != consolidation) {
			NotificationChain msgs = null;
			if (consolidation != null)
				msgs = ((InternalEObject)consolidation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OfficePackage.SPREADSHEET_TYPE__CONSOLIDATION, null, msgs);
			if (newConsolidation != null)
				msgs = ((InternalEObject)newConsolidation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OfficePackage.SPREADSHEET_TYPE__CONSOLIDATION, null, msgs);
			msgs = basicSetConsolidation(newConsolidation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OfficePackage.SPREADSHEET_TYPE__CONSOLIDATION, newConsolidation, newConsolidation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DdeLinksType getDdeLinks() {
		return ddeLinks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDdeLinks(DdeLinksType newDdeLinks, NotificationChain msgs) {
		DdeLinksType oldDdeLinks = ddeLinks;
		ddeLinks = newDdeLinks;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OfficePackage.SPREADSHEET_TYPE__DDE_LINKS, oldDdeLinks, newDdeLinks);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDdeLinks(DdeLinksType newDdeLinks) {
		if (newDdeLinks != ddeLinks) {
			NotificationChain msgs = null;
			if (ddeLinks != null)
				msgs = ((InternalEObject)ddeLinks).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OfficePackage.SPREADSHEET_TYPE__DDE_LINKS, null, msgs);
			if (newDdeLinks != null)
				msgs = ((InternalEObject)newDdeLinks).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OfficePackage.SPREADSHEET_TYPE__DDE_LINKS, null, msgs);
			msgs = basicSetDdeLinks(newDdeLinks, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OfficePackage.SPREADSHEET_TYPE__DDE_LINKS, newDdeLinks, newDdeLinks));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProtectionKey() {
		return protectionKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProtectionKey(String newProtectionKey) {
		String oldProtectionKey = protectionKey;
		protectionKey = newProtectionKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OfficePackage.SPREADSHEET_TYPE__PROTECTION_KEY, oldProtectionKey, protectionKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getStructureProtected() {
		return structureProtected;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStructureProtected(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newStructureProtected) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldStructureProtected = structureProtected;
		structureProtected = newStructureProtected == null ? STRUCTURE_PROTECTED_EDEFAULT : newStructureProtected;
		boolean oldStructureProtectedESet = structureProtectedESet;
		structureProtectedESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OfficePackage.SPREADSHEET_TYPE__STRUCTURE_PROTECTED, oldStructureProtected, structureProtected, !oldStructureProtectedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetStructureProtected() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldStructureProtected = structureProtected;
		boolean oldStructureProtectedESet = structureProtectedESet;
		structureProtected = STRUCTURE_PROTECTED_EDEFAULT;
		structureProtectedESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OfficePackage.SPREADSHEET_TYPE__STRUCTURE_PROTECTED, oldStructureProtected, STRUCTURE_PROTECTED_EDEFAULT, oldStructureProtectedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetStructureProtected() {
		return structureProtectedESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OfficePackage.SPREADSHEET_TYPE__TRACKED_CHANGES:
				return basicSetTrackedChanges(null, msgs);
			case OfficePackage.SPREADSHEET_TYPE__VARIABLE_DECLS:
				return basicSetVariableDecls(null, msgs);
			case OfficePackage.SPREADSHEET_TYPE__SEQUENCE_DECLS:
				return basicSetSequenceDecls(null, msgs);
			case OfficePackage.SPREADSHEET_TYPE__USER_FIELD_DECLS:
				return basicSetUserFieldDecls(null, msgs);
			case OfficePackage.SPREADSHEET_TYPE__DDE_CONNECTION_DECLS:
				return basicSetDdeConnectionDecls(null, msgs);
			case OfficePackage.SPREADSHEET_TYPE__ALPHABETICAL_INDEX_AUTO_MARK_FILE:
				return basicSetAlphabeticalIndexAutoMarkFile(null, msgs);
			case OfficePackage.SPREADSHEET_TYPE__CALCULATION_SETTINGS:
				return basicSetCalculationSettings(null, msgs);
			case OfficePackage.SPREADSHEET_TYPE__CONTENT_VALIDATIONS:
				return basicSetContentValidations(null, msgs);
			case OfficePackage.SPREADSHEET_TYPE__LABEL_RANGES:
				return basicSetLabelRanges(null, msgs);
			case OfficePackage.SPREADSHEET_TYPE__TABLE:
				return ((InternalEList<?>)getTable()).basicRemove(otherEnd, msgs);
			case OfficePackage.SPREADSHEET_TYPE__NAMED_EXPRESSIONS:
				return basicSetNamedExpressions(null, msgs);
			case OfficePackage.SPREADSHEET_TYPE__DATABASE_RANGES:
				return basicSetDatabaseRanges(null, msgs);
			case OfficePackage.SPREADSHEET_TYPE__DATA_PILOT_TABLES:
				return basicSetDataPilotTables(null, msgs);
			case OfficePackage.SPREADSHEET_TYPE__CONSOLIDATION:
				return basicSetConsolidation(null, msgs);
			case OfficePackage.SPREADSHEET_TYPE__DDE_LINKS:
				return basicSetDdeLinks(null, msgs);
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
			case OfficePackage.SPREADSHEET_TYPE__TRACKED_CHANGES:
				return getTrackedChanges();
			case OfficePackage.SPREADSHEET_TYPE__VARIABLE_DECLS:
				return getVariableDecls();
			case OfficePackage.SPREADSHEET_TYPE__SEQUENCE_DECLS:
				return getSequenceDecls();
			case OfficePackage.SPREADSHEET_TYPE__USER_FIELD_DECLS:
				return getUserFieldDecls();
			case OfficePackage.SPREADSHEET_TYPE__DDE_CONNECTION_DECLS:
				return getDdeConnectionDecls();
			case OfficePackage.SPREADSHEET_TYPE__ALPHABETICAL_INDEX_AUTO_MARK_FILE:
				return getAlphabeticalIndexAutoMarkFile();
			case OfficePackage.SPREADSHEET_TYPE__CALCULATION_SETTINGS:
				return getCalculationSettings();
			case OfficePackage.SPREADSHEET_TYPE__CONTENT_VALIDATIONS:
				return getContentValidations();
			case OfficePackage.SPREADSHEET_TYPE__LABEL_RANGES:
				return getLabelRanges();
			case OfficePackage.SPREADSHEET_TYPE__TABLE:
				return getTable();
			case OfficePackage.SPREADSHEET_TYPE__NAMED_EXPRESSIONS:
				return getNamedExpressions();
			case OfficePackage.SPREADSHEET_TYPE__DATABASE_RANGES:
				return getDatabaseRanges();
			case OfficePackage.SPREADSHEET_TYPE__DATA_PILOT_TABLES:
				return getDataPilotTables();
			case OfficePackage.SPREADSHEET_TYPE__CONSOLIDATION:
				return getConsolidation();
			case OfficePackage.SPREADSHEET_TYPE__DDE_LINKS:
				return getDdeLinks();
			case OfficePackage.SPREADSHEET_TYPE__PROTECTION_KEY:
				return getProtectionKey();
			case OfficePackage.SPREADSHEET_TYPE__STRUCTURE_PROTECTED:
				return getStructureProtected();
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
			case OfficePackage.SPREADSHEET_TYPE__TRACKED_CHANGES:
				setTrackedChanges((TrackedChangesType)newValue);
				return;
			case OfficePackage.SPREADSHEET_TYPE__VARIABLE_DECLS:
				setVariableDecls((VariableDeclsType)newValue);
				return;
			case OfficePackage.SPREADSHEET_TYPE__SEQUENCE_DECLS:
				setSequenceDecls((SequenceDeclsType)newValue);
				return;
			case OfficePackage.SPREADSHEET_TYPE__USER_FIELD_DECLS:
				setUserFieldDecls((UserFieldDeclsType)newValue);
				return;
			case OfficePackage.SPREADSHEET_TYPE__DDE_CONNECTION_DECLS:
				setDdeConnectionDecls((DdeConnectionDeclsType)newValue);
				return;
			case OfficePackage.SPREADSHEET_TYPE__ALPHABETICAL_INDEX_AUTO_MARK_FILE:
				setAlphabeticalIndexAutoMarkFile((AlphabeticalIndexAutoMarkFileType)newValue);
				return;
			case OfficePackage.SPREADSHEET_TYPE__CALCULATION_SETTINGS:
				setCalculationSettings((CalculationSettingsType)newValue);
				return;
			case OfficePackage.SPREADSHEET_TYPE__CONTENT_VALIDATIONS:
				setContentValidations((ContentValidationsType)newValue);
				return;
			case OfficePackage.SPREADSHEET_TYPE__LABEL_RANGES:
				setLabelRanges((LabelRangesType)newValue);
				return;
			case OfficePackage.SPREADSHEET_TYPE__TABLE:
				getTable().clear();
				getTable().addAll((Collection<? extends TableType>)newValue);
				return;
			case OfficePackage.SPREADSHEET_TYPE__NAMED_EXPRESSIONS:
				setNamedExpressions((NamedExpressionsType)newValue);
				return;
			case OfficePackage.SPREADSHEET_TYPE__DATABASE_RANGES:
				setDatabaseRanges((DatabaseRangesType)newValue);
				return;
			case OfficePackage.SPREADSHEET_TYPE__DATA_PILOT_TABLES:
				setDataPilotTables((DataPilotTablesType)newValue);
				return;
			case OfficePackage.SPREADSHEET_TYPE__CONSOLIDATION:
				setConsolidation((ConsolidationType)newValue);
				return;
			case OfficePackage.SPREADSHEET_TYPE__DDE_LINKS:
				setDdeLinks((DdeLinksType)newValue);
				return;
			case OfficePackage.SPREADSHEET_TYPE__PROTECTION_KEY:
				setProtectionKey((String)newValue);
				return;
			case OfficePackage.SPREADSHEET_TYPE__STRUCTURE_PROTECTED:
				setStructureProtected((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
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
			case OfficePackage.SPREADSHEET_TYPE__TRACKED_CHANGES:
				setTrackedChanges((TrackedChangesType)null);
				return;
			case OfficePackage.SPREADSHEET_TYPE__VARIABLE_DECLS:
				setVariableDecls((VariableDeclsType)null);
				return;
			case OfficePackage.SPREADSHEET_TYPE__SEQUENCE_DECLS:
				setSequenceDecls((SequenceDeclsType)null);
				return;
			case OfficePackage.SPREADSHEET_TYPE__USER_FIELD_DECLS:
				setUserFieldDecls((UserFieldDeclsType)null);
				return;
			case OfficePackage.SPREADSHEET_TYPE__DDE_CONNECTION_DECLS:
				setDdeConnectionDecls((DdeConnectionDeclsType)null);
				return;
			case OfficePackage.SPREADSHEET_TYPE__ALPHABETICAL_INDEX_AUTO_MARK_FILE:
				setAlphabeticalIndexAutoMarkFile((AlphabeticalIndexAutoMarkFileType)null);
				return;
			case OfficePackage.SPREADSHEET_TYPE__CALCULATION_SETTINGS:
				setCalculationSettings((CalculationSettingsType)null);
				return;
			case OfficePackage.SPREADSHEET_TYPE__CONTENT_VALIDATIONS:
				setContentValidations((ContentValidationsType)null);
				return;
			case OfficePackage.SPREADSHEET_TYPE__LABEL_RANGES:
				setLabelRanges((LabelRangesType)null);
				return;
			case OfficePackage.SPREADSHEET_TYPE__TABLE:
				getTable().clear();
				return;
			case OfficePackage.SPREADSHEET_TYPE__NAMED_EXPRESSIONS:
				setNamedExpressions((NamedExpressionsType)null);
				return;
			case OfficePackage.SPREADSHEET_TYPE__DATABASE_RANGES:
				setDatabaseRanges((DatabaseRangesType)null);
				return;
			case OfficePackage.SPREADSHEET_TYPE__DATA_PILOT_TABLES:
				setDataPilotTables((DataPilotTablesType)null);
				return;
			case OfficePackage.SPREADSHEET_TYPE__CONSOLIDATION:
				setConsolidation((ConsolidationType)null);
				return;
			case OfficePackage.SPREADSHEET_TYPE__DDE_LINKS:
				setDdeLinks((DdeLinksType)null);
				return;
			case OfficePackage.SPREADSHEET_TYPE__PROTECTION_KEY:
				setProtectionKey(PROTECTION_KEY_EDEFAULT);
				return;
			case OfficePackage.SPREADSHEET_TYPE__STRUCTURE_PROTECTED:
				unsetStructureProtected();
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
			case OfficePackage.SPREADSHEET_TYPE__TRACKED_CHANGES:
				return trackedChanges != null;
			case OfficePackage.SPREADSHEET_TYPE__VARIABLE_DECLS:
				return variableDecls != null;
			case OfficePackage.SPREADSHEET_TYPE__SEQUENCE_DECLS:
				return sequenceDecls != null;
			case OfficePackage.SPREADSHEET_TYPE__USER_FIELD_DECLS:
				return userFieldDecls != null;
			case OfficePackage.SPREADSHEET_TYPE__DDE_CONNECTION_DECLS:
				return ddeConnectionDecls != null;
			case OfficePackage.SPREADSHEET_TYPE__ALPHABETICAL_INDEX_AUTO_MARK_FILE:
				return alphabeticalIndexAutoMarkFile != null;
			case OfficePackage.SPREADSHEET_TYPE__CALCULATION_SETTINGS:
				return calculationSettings != null;
			case OfficePackage.SPREADSHEET_TYPE__CONTENT_VALIDATIONS:
				return contentValidations != null;
			case OfficePackage.SPREADSHEET_TYPE__LABEL_RANGES:
				return labelRanges != null;
			case OfficePackage.SPREADSHEET_TYPE__TABLE:
				return table != null && !table.isEmpty();
			case OfficePackage.SPREADSHEET_TYPE__NAMED_EXPRESSIONS:
				return namedExpressions != null;
			case OfficePackage.SPREADSHEET_TYPE__DATABASE_RANGES:
				return databaseRanges != null;
			case OfficePackage.SPREADSHEET_TYPE__DATA_PILOT_TABLES:
				return dataPilotTables != null;
			case OfficePackage.SPREADSHEET_TYPE__CONSOLIDATION:
				return consolidation != null;
			case OfficePackage.SPREADSHEET_TYPE__DDE_LINKS:
				return ddeLinks != null;
			case OfficePackage.SPREADSHEET_TYPE__PROTECTION_KEY:
				return PROTECTION_KEY_EDEFAULT == null ? protectionKey != null : !PROTECTION_KEY_EDEFAULT.equals(protectionKey);
			case OfficePackage.SPREADSHEET_TYPE__STRUCTURE_PROTECTED:
				return isSetStructureProtected();
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
		result.append(" (protectionKey: ");
		result.append(protectionKey);
		result.append(", structureProtected: ");
		if (structureProtectedESet) result.append(structureProtected); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //SpreadsheetTypeImpl
