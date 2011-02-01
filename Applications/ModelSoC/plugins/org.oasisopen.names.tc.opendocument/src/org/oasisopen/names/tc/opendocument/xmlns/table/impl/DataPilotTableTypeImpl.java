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
import org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotFieldType;
import org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotTableType;
import org.oasisopen.names.tc.opendocument.xmlns.table.DatabaseSourceQueryType;
import org.oasisopen.names.tc.opendocument.xmlns.table.DatabaseSourceSqlType;
import org.oasisopen.names.tc.opendocument.xmlns.table.DatabaseSourceTableType;
import org.oasisopen.names.tc.opendocument.xmlns.table.GrandTotalType;
import org.oasisopen.names.tc.opendocument.xmlns.table.SourceCellRangeType;
import org.oasisopen.names.tc.opendocument.xmlns.table.SourceServiceType;
import org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Pilot Table Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DataPilotTableTypeImpl#getDatabaseSourceSql <em>Database Source Sql</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DataPilotTableTypeImpl#getDatabaseSourceQuery <em>Database Source Query</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DataPilotTableTypeImpl#getDatabaseSourceTable <em>Database Source Table</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DataPilotTableTypeImpl#getSourceService <em>Source Service</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DataPilotTableTypeImpl#getSourceCellRange <em>Source Cell Range</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DataPilotTableTypeImpl#getDataPilotField <em>Data Pilot Field</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DataPilotTableTypeImpl#getApplicationData <em>Application Data</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DataPilotTableTypeImpl#getButtons <em>Buttons</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DataPilotTableTypeImpl#getDrillDownOnDoubleClick <em>Drill Down On Double Click</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DataPilotTableTypeImpl#getGrandTotal <em>Grand Total</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DataPilotTableTypeImpl#getIdentifyCategories <em>Identify Categories</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DataPilotTableTypeImpl#getIgnoreEmptyRows <em>Ignore Empty Rows</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DataPilotTableTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DataPilotTableTypeImpl#getShowFilterButton <em>Show Filter Button</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DataPilotTableTypeImpl#getTargetRangeAddress <em>Target Range Address</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DataPilotTableTypeImpl extends EObjectImpl implements DataPilotTableType {
	/**
	 * The cached value of the '{@link #getDatabaseSourceSql() <em>Database Source Sql</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatabaseSourceSql()
	 * @generated
	 * @ordered
	 */
	protected DatabaseSourceSqlType databaseSourceSql;

	/**
	 * The cached value of the '{@link #getDatabaseSourceQuery() <em>Database Source Query</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatabaseSourceQuery()
	 * @generated
	 * @ordered
	 */
	protected DatabaseSourceQueryType databaseSourceQuery;

	/**
	 * The cached value of the '{@link #getDatabaseSourceTable() <em>Database Source Table</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatabaseSourceTable()
	 * @generated
	 * @ordered
	 */
	protected DatabaseSourceTableType databaseSourceTable;

	/**
	 * The cached value of the '{@link #getSourceService() <em>Source Service</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceService()
	 * @generated
	 * @ordered
	 */
	protected SourceServiceType sourceService;

	/**
	 * The cached value of the '{@link #getSourceCellRange() <em>Source Cell Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceCellRange()
	 * @generated
	 * @ordered
	 */
	protected SourceCellRangeType sourceCellRange;

	/**
	 * The cached value of the '{@link #getDataPilotField() <em>Data Pilot Field</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataPilotField()
	 * @generated
	 * @ordered
	 */
	protected EList<DataPilotFieldType> dataPilotField;

	/**
	 * The default value of the '{@link #getApplicationData() <em>Application Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplicationData()
	 * @generated
	 * @ordered
	 */
	protected static final String APPLICATION_DATA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getApplicationData() <em>Application Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplicationData()
	 * @generated
	 * @ordered
	 */
	protected String applicationData = APPLICATION_DATA_EDEFAULT;

	/**
	 * The default value of the '{@link #getButtons() <em>Buttons</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getButtons()
	 * @generated
	 * @ordered
	 */
	protected static final String BUTTONS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getButtons() <em>Buttons</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getButtons()
	 * @generated
	 * @ordered
	 */
	protected String buttons = BUTTONS_EDEFAULT;

	/**
	 * The default value of the '{@link #getDrillDownOnDoubleClick() <em>Drill Down On Double Click</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDrillDownOnDoubleClick()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean DRILL_DOWN_ON_DOUBLE_CLICK_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getDrillDownOnDoubleClick() <em>Drill Down On Double Click</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDrillDownOnDoubleClick()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean drillDownOnDoubleClick = DRILL_DOWN_ON_DOUBLE_CLICK_EDEFAULT;

	/**
	 * This is true if the Drill Down On Double Click attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean drillDownOnDoubleClickESet;

	/**
	 * The default value of the '{@link #getGrandTotal() <em>Grand Total</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGrandTotal()
	 * @generated
	 * @ordered
	 */
	protected static final GrandTotalType GRAND_TOTAL_EDEFAULT = GrandTotalType.BOTH;

	/**
	 * The cached value of the '{@link #getGrandTotal() <em>Grand Total</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGrandTotal()
	 * @generated
	 * @ordered
	 */
	protected GrandTotalType grandTotal = GRAND_TOTAL_EDEFAULT;

	/**
	 * This is true if the Grand Total attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean grandTotalESet;

	/**
	 * The default value of the '{@link #getIdentifyCategories() <em>Identify Categories</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifyCategories()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean IDENTIFY_CATEGORIES_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getIdentifyCategories() <em>Identify Categories</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifyCategories()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean identifyCategories = IDENTIFY_CATEGORIES_EDEFAULT;

	/**
	 * This is true if the Identify Categories attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean identifyCategoriesESet;

	/**
	 * The default value of the '{@link #getIgnoreEmptyRows() <em>Ignore Empty Rows</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIgnoreEmptyRows()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean IGNORE_EMPTY_ROWS_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getIgnoreEmptyRows() <em>Ignore Empty Rows</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIgnoreEmptyRows()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean ignoreEmptyRows = IGNORE_EMPTY_ROWS_EDEFAULT;

	/**
	 * This is true if the Ignore Empty Rows attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean ignoreEmptyRowsESet;

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
	 * The default value of the '{@link #getShowFilterButton() <em>Show Filter Button</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShowFilterButton()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean SHOW_FILTER_BUTTON_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getShowFilterButton() <em>Show Filter Button</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShowFilterButton()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean showFilterButton = SHOW_FILTER_BUTTON_EDEFAULT;

	/**
	 * This is true if the Show Filter Button attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean showFilterButtonESet;

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
	protected DataPilotTableTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TablePackage.eINSTANCE.getDataPilotTableType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatabaseSourceSqlType getDatabaseSourceSql() {
		return databaseSourceSql;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDatabaseSourceSql(DatabaseSourceSqlType newDatabaseSourceSql, NotificationChain msgs) {
		DatabaseSourceSqlType oldDatabaseSourceSql = databaseSourceSql;
		databaseSourceSql = newDatabaseSourceSql;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TablePackage.DATA_PILOT_TABLE_TYPE__DATABASE_SOURCE_SQL, oldDatabaseSourceSql, newDatabaseSourceSql);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatabaseSourceSql(DatabaseSourceSqlType newDatabaseSourceSql) {
		if (newDatabaseSourceSql != databaseSourceSql) {
			NotificationChain msgs = null;
			if (databaseSourceSql != null)
				msgs = ((InternalEObject)databaseSourceSql).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TablePackage.DATA_PILOT_TABLE_TYPE__DATABASE_SOURCE_SQL, null, msgs);
			if (newDatabaseSourceSql != null)
				msgs = ((InternalEObject)newDatabaseSourceSql).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TablePackage.DATA_PILOT_TABLE_TYPE__DATABASE_SOURCE_SQL, null, msgs);
			msgs = basicSetDatabaseSourceSql(newDatabaseSourceSql, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DATA_PILOT_TABLE_TYPE__DATABASE_SOURCE_SQL, newDatabaseSourceSql, newDatabaseSourceSql));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatabaseSourceQueryType getDatabaseSourceQuery() {
		return databaseSourceQuery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDatabaseSourceQuery(DatabaseSourceQueryType newDatabaseSourceQuery, NotificationChain msgs) {
		DatabaseSourceQueryType oldDatabaseSourceQuery = databaseSourceQuery;
		databaseSourceQuery = newDatabaseSourceQuery;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TablePackage.DATA_PILOT_TABLE_TYPE__DATABASE_SOURCE_QUERY, oldDatabaseSourceQuery, newDatabaseSourceQuery);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatabaseSourceQuery(DatabaseSourceQueryType newDatabaseSourceQuery) {
		if (newDatabaseSourceQuery != databaseSourceQuery) {
			NotificationChain msgs = null;
			if (databaseSourceQuery != null)
				msgs = ((InternalEObject)databaseSourceQuery).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TablePackage.DATA_PILOT_TABLE_TYPE__DATABASE_SOURCE_QUERY, null, msgs);
			if (newDatabaseSourceQuery != null)
				msgs = ((InternalEObject)newDatabaseSourceQuery).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TablePackage.DATA_PILOT_TABLE_TYPE__DATABASE_SOURCE_QUERY, null, msgs);
			msgs = basicSetDatabaseSourceQuery(newDatabaseSourceQuery, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DATA_PILOT_TABLE_TYPE__DATABASE_SOURCE_QUERY, newDatabaseSourceQuery, newDatabaseSourceQuery));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatabaseSourceTableType getDatabaseSourceTable() {
		return databaseSourceTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDatabaseSourceTable(DatabaseSourceTableType newDatabaseSourceTable, NotificationChain msgs) {
		DatabaseSourceTableType oldDatabaseSourceTable = databaseSourceTable;
		databaseSourceTable = newDatabaseSourceTable;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TablePackage.DATA_PILOT_TABLE_TYPE__DATABASE_SOURCE_TABLE, oldDatabaseSourceTable, newDatabaseSourceTable);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatabaseSourceTable(DatabaseSourceTableType newDatabaseSourceTable) {
		if (newDatabaseSourceTable != databaseSourceTable) {
			NotificationChain msgs = null;
			if (databaseSourceTable != null)
				msgs = ((InternalEObject)databaseSourceTable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TablePackage.DATA_PILOT_TABLE_TYPE__DATABASE_SOURCE_TABLE, null, msgs);
			if (newDatabaseSourceTable != null)
				msgs = ((InternalEObject)newDatabaseSourceTable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TablePackage.DATA_PILOT_TABLE_TYPE__DATABASE_SOURCE_TABLE, null, msgs);
			msgs = basicSetDatabaseSourceTable(newDatabaseSourceTable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DATA_PILOT_TABLE_TYPE__DATABASE_SOURCE_TABLE, newDatabaseSourceTable, newDatabaseSourceTable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourceServiceType getSourceService() {
		return sourceService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSourceService(SourceServiceType newSourceService, NotificationChain msgs) {
		SourceServiceType oldSourceService = sourceService;
		sourceService = newSourceService;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TablePackage.DATA_PILOT_TABLE_TYPE__SOURCE_SERVICE, oldSourceService, newSourceService);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceService(SourceServiceType newSourceService) {
		if (newSourceService != sourceService) {
			NotificationChain msgs = null;
			if (sourceService != null)
				msgs = ((InternalEObject)sourceService).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TablePackage.DATA_PILOT_TABLE_TYPE__SOURCE_SERVICE, null, msgs);
			if (newSourceService != null)
				msgs = ((InternalEObject)newSourceService).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TablePackage.DATA_PILOT_TABLE_TYPE__SOURCE_SERVICE, null, msgs);
			msgs = basicSetSourceService(newSourceService, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DATA_PILOT_TABLE_TYPE__SOURCE_SERVICE, newSourceService, newSourceService));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourceCellRangeType getSourceCellRange() {
		return sourceCellRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSourceCellRange(SourceCellRangeType newSourceCellRange, NotificationChain msgs) {
		SourceCellRangeType oldSourceCellRange = sourceCellRange;
		sourceCellRange = newSourceCellRange;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TablePackage.DATA_PILOT_TABLE_TYPE__SOURCE_CELL_RANGE, oldSourceCellRange, newSourceCellRange);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceCellRange(SourceCellRangeType newSourceCellRange) {
		if (newSourceCellRange != sourceCellRange) {
			NotificationChain msgs = null;
			if (sourceCellRange != null)
				msgs = ((InternalEObject)sourceCellRange).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TablePackage.DATA_PILOT_TABLE_TYPE__SOURCE_CELL_RANGE, null, msgs);
			if (newSourceCellRange != null)
				msgs = ((InternalEObject)newSourceCellRange).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TablePackage.DATA_PILOT_TABLE_TYPE__SOURCE_CELL_RANGE, null, msgs);
			msgs = basicSetSourceCellRange(newSourceCellRange, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DATA_PILOT_TABLE_TYPE__SOURCE_CELL_RANGE, newSourceCellRange, newSourceCellRange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataPilotFieldType> getDataPilotField() {
		if (dataPilotField == null) {
			dataPilotField = new EObjectContainmentEList<DataPilotFieldType>(DataPilotFieldType.class, this, TablePackage.DATA_PILOT_TABLE_TYPE__DATA_PILOT_FIELD);
		}
		return dataPilotField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getApplicationData() {
		return applicationData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApplicationData(String newApplicationData) {
		String oldApplicationData = applicationData;
		applicationData = newApplicationData;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DATA_PILOT_TABLE_TYPE__APPLICATION_DATA, oldApplicationData, applicationData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getButtons() {
		return buttons;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setButtons(String newButtons) {
		String oldButtons = buttons;
		buttons = newButtons;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DATA_PILOT_TABLE_TYPE__BUTTONS, oldButtons, buttons));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getDrillDownOnDoubleClick() {
		return drillDownOnDoubleClick;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDrillDownOnDoubleClick(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newDrillDownOnDoubleClick) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldDrillDownOnDoubleClick = drillDownOnDoubleClick;
		drillDownOnDoubleClick = newDrillDownOnDoubleClick == null ? DRILL_DOWN_ON_DOUBLE_CLICK_EDEFAULT : newDrillDownOnDoubleClick;
		boolean oldDrillDownOnDoubleClickESet = drillDownOnDoubleClickESet;
		drillDownOnDoubleClickESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DATA_PILOT_TABLE_TYPE__DRILL_DOWN_ON_DOUBLE_CLICK, oldDrillDownOnDoubleClick, drillDownOnDoubleClick, !oldDrillDownOnDoubleClickESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDrillDownOnDoubleClick() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldDrillDownOnDoubleClick = drillDownOnDoubleClick;
		boolean oldDrillDownOnDoubleClickESet = drillDownOnDoubleClickESet;
		drillDownOnDoubleClick = DRILL_DOWN_ON_DOUBLE_CLICK_EDEFAULT;
		drillDownOnDoubleClickESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TablePackage.DATA_PILOT_TABLE_TYPE__DRILL_DOWN_ON_DOUBLE_CLICK, oldDrillDownOnDoubleClick, DRILL_DOWN_ON_DOUBLE_CLICK_EDEFAULT, oldDrillDownOnDoubleClickESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDrillDownOnDoubleClick() {
		return drillDownOnDoubleClickESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GrandTotalType getGrandTotal() {
		return grandTotal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGrandTotal(GrandTotalType newGrandTotal) {
		GrandTotalType oldGrandTotal = grandTotal;
		grandTotal = newGrandTotal == null ? GRAND_TOTAL_EDEFAULT : newGrandTotal;
		boolean oldGrandTotalESet = grandTotalESet;
		grandTotalESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DATA_PILOT_TABLE_TYPE__GRAND_TOTAL, oldGrandTotal, grandTotal, !oldGrandTotalESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetGrandTotal() {
		GrandTotalType oldGrandTotal = grandTotal;
		boolean oldGrandTotalESet = grandTotalESet;
		grandTotal = GRAND_TOTAL_EDEFAULT;
		grandTotalESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TablePackage.DATA_PILOT_TABLE_TYPE__GRAND_TOTAL, oldGrandTotal, GRAND_TOTAL_EDEFAULT, oldGrandTotalESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetGrandTotal() {
		return grandTotalESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getIdentifyCategories() {
		return identifyCategories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdentifyCategories(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newIdentifyCategories) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldIdentifyCategories = identifyCategories;
		identifyCategories = newIdentifyCategories == null ? IDENTIFY_CATEGORIES_EDEFAULT : newIdentifyCategories;
		boolean oldIdentifyCategoriesESet = identifyCategoriesESet;
		identifyCategoriesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DATA_PILOT_TABLE_TYPE__IDENTIFY_CATEGORIES, oldIdentifyCategories, identifyCategories, !oldIdentifyCategoriesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIdentifyCategories() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldIdentifyCategories = identifyCategories;
		boolean oldIdentifyCategoriesESet = identifyCategoriesESet;
		identifyCategories = IDENTIFY_CATEGORIES_EDEFAULT;
		identifyCategoriesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TablePackage.DATA_PILOT_TABLE_TYPE__IDENTIFY_CATEGORIES, oldIdentifyCategories, IDENTIFY_CATEGORIES_EDEFAULT, oldIdentifyCategoriesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIdentifyCategories() {
		return identifyCategoriesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getIgnoreEmptyRows() {
		return ignoreEmptyRows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIgnoreEmptyRows(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newIgnoreEmptyRows) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldIgnoreEmptyRows = ignoreEmptyRows;
		ignoreEmptyRows = newIgnoreEmptyRows == null ? IGNORE_EMPTY_ROWS_EDEFAULT : newIgnoreEmptyRows;
		boolean oldIgnoreEmptyRowsESet = ignoreEmptyRowsESet;
		ignoreEmptyRowsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DATA_PILOT_TABLE_TYPE__IGNORE_EMPTY_ROWS, oldIgnoreEmptyRows, ignoreEmptyRows, !oldIgnoreEmptyRowsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIgnoreEmptyRows() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldIgnoreEmptyRows = ignoreEmptyRows;
		boolean oldIgnoreEmptyRowsESet = ignoreEmptyRowsESet;
		ignoreEmptyRows = IGNORE_EMPTY_ROWS_EDEFAULT;
		ignoreEmptyRowsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TablePackage.DATA_PILOT_TABLE_TYPE__IGNORE_EMPTY_ROWS, oldIgnoreEmptyRows, IGNORE_EMPTY_ROWS_EDEFAULT, oldIgnoreEmptyRowsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIgnoreEmptyRows() {
		return ignoreEmptyRowsESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DATA_PILOT_TABLE_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getShowFilterButton() {
		return showFilterButton;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShowFilterButton(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newShowFilterButton) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldShowFilterButton = showFilterButton;
		showFilterButton = newShowFilterButton == null ? SHOW_FILTER_BUTTON_EDEFAULT : newShowFilterButton;
		boolean oldShowFilterButtonESet = showFilterButtonESet;
		showFilterButtonESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DATA_PILOT_TABLE_TYPE__SHOW_FILTER_BUTTON, oldShowFilterButton, showFilterButton, !oldShowFilterButtonESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetShowFilterButton() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldShowFilterButton = showFilterButton;
		boolean oldShowFilterButtonESet = showFilterButtonESet;
		showFilterButton = SHOW_FILTER_BUTTON_EDEFAULT;
		showFilterButtonESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TablePackage.DATA_PILOT_TABLE_TYPE__SHOW_FILTER_BUTTON, oldShowFilterButton, SHOW_FILTER_BUTTON_EDEFAULT, oldShowFilterButtonESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetShowFilterButton() {
		return showFilterButtonESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DATA_PILOT_TABLE_TYPE__TARGET_RANGE_ADDRESS, oldTargetRangeAddress, targetRangeAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TablePackage.DATA_PILOT_TABLE_TYPE__DATABASE_SOURCE_SQL:
				return basicSetDatabaseSourceSql(null, msgs);
			case TablePackage.DATA_PILOT_TABLE_TYPE__DATABASE_SOURCE_QUERY:
				return basicSetDatabaseSourceQuery(null, msgs);
			case TablePackage.DATA_PILOT_TABLE_TYPE__DATABASE_SOURCE_TABLE:
				return basicSetDatabaseSourceTable(null, msgs);
			case TablePackage.DATA_PILOT_TABLE_TYPE__SOURCE_SERVICE:
				return basicSetSourceService(null, msgs);
			case TablePackage.DATA_PILOT_TABLE_TYPE__SOURCE_CELL_RANGE:
				return basicSetSourceCellRange(null, msgs);
			case TablePackage.DATA_PILOT_TABLE_TYPE__DATA_PILOT_FIELD:
				return ((InternalEList<?>)getDataPilotField()).basicRemove(otherEnd, msgs);
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
			case TablePackage.DATA_PILOT_TABLE_TYPE__DATABASE_SOURCE_SQL:
				return getDatabaseSourceSql();
			case TablePackage.DATA_PILOT_TABLE_TYPE__DATABASE_SOURCE_QUERY:
				return getDatabaseSourceQuery();
			case TablePackage.DATA_PILOT_TABLE_TYPE__DATABASE_SOURCE_TABLE:
				return getDatabaseSourceTable();
			case TablePackage.DATA_PILOT_TABLE_TYPE__SOURCE_SERVICE:
				return getSourceService();
			case TablePackage.DATA_PILOT_TABLE_TYPE__SOURCE_CELL_RANGE:
				return getSourceCellRange();
			case TablePackage.DATA_PILOT_TABLE_TYPE__DATA_PILOT_FIELD:
				return getDataPilotField();
			case TablePackage.DATA_PILOT_TABLE_TYPE__APPLICATION_DATA:
				return getApplicationData();
			case TablePackage.DATA_PILOT_TABLE_TYPE__BUTTONS:
				return getButtons();
			case TablePackage.DATA_PILOT_TABLE_TYPE__DRILL_DOWN_ON_DOUBLE_CLICK:
				return getDrillDownOnDoubleClick();
			case TablePackage.DATA_PILOT_TABLE_TYPE__GRAND_TOTAL:
				return getGrandTotal();
			case TablePackage.DATA_PILOT_TABLE_TYPE__IDENTIFY_CATEGORIES:
				return getIdentifyCategories();
			case TablePackage.DATA_PILOT_TABLE_TYPE__IGNORE_EMPTY_ROWS:
				return getIgnoreEmptyRows();
			case TablePackage.DATA_PILOT_TABLE_TYPE__NAME:
				return getName();
			case TablePackage.DATA_PILOT_TABLE_TYPE__SHOW_FILTER_BUTTON:
				return getShowFilterButton();
			case TablePackage.DATA_PILOT_TABLE_TYPE__TARGET_RANGE_ADDRESS:
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
			case TablePackage.DATA_PILOT_TABLE_TYPE__DATABASE_SOURCE_SQL:
				setDatabaseSourceSql((DatabaseSourceSqlType)newValue);
				return;
			case TablePackage.DATA_PILOT_TABLE_TYPE__DATABASE_SOURCE_QUERY:
				setDatabaseSourceQuery((DatabaseSourceQueryType)newValue);
				return;
			case TablePackage.DATA_PILOT_TABLE_TYPE__DATABASE_SOURCE_TABLE:
				setDatabaseSourceTable((DatabaseSourceTableType)newValue);
				return;
			case TablePackage.DATA_PILOT_TABLE_TYPE__SOURCE_SERVICE:
				setSourceService((SourceServiceType)newValue);
				return;
			case TablePackage.DATA_PILOT_TABLE_TYPE__SOURCE_CELL_RANGE:
				setSourceCellRange((SourceCellRangeType)newValue);
				return;
			case TablePackage.DATA_PILOT_TABLE_TYPE__DATA_PILOT_FIELD:
				getDataPilotField().clear();
				getDataPilotField().addAll((Collection<? extends DataPilotFieldType>)newValue);
				return;
			case TablePackage.DATA_PILOT_TABLE_TYPE__APPLICATION_DATA:
				setApplicationData((String)newValue);
				return;
			case TablePackage.DATA_PILOT_TABLE_TYPE__BUTTONS:
				setButtons((String)newValue);
				return;
			case TablePackage.DATA_PILOT_TABLE_TYPE__DRILL_DOWN_ON_DOUBLE_CLICK:
				setDrillDownOnDoubleClick((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case TablePackage.DATA_PILOT_TABLE_TYPE__GRAND_TOTAL:
				setGrandTotal((GrandTotalType)newValue);
				return;
			case TablePackage.DATA_PILOT_TABLE_TYPE__IDENTIFY_CATEGORIES:
				setIdentifyCategories((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case TablePackage.DATA_PILOT_TABLE_TYPE__IGNORE_EMPTY_ROWS:
				setIgnoreEmptyRows((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case TablePackage.DATA_PILOT_TABLE_TYPE__NAME:
				setName((String)newValue);
				return;
			case TablePackage.DATA_PILOT_TABLE_TYPE__SHOW_FILTER_BUTTON:
				setShowFilterButton((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case TablePackage.DATA_PILOT_TABLE_TYPE__TARGET_RANGE_ADDRESS:
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
			case TablePackage.DATA_PILOT_TABLE_TYPE__DATABASE_SOURCE_SQL:
				setDatabaseSourceSql((DatabaseSourceSqlType)null);
				return;
			case TablePackage.DATA_PILOT_TABLE_TYPE__DATABASE_SOURCE_QUERY:
				setDatabaseSourceQuery((DatabaseSourceQueryType)null);
				return;
			case TablePackage.DATA_PILOT_TABLE_TYPE__DATABASE_SOURCE_TABLE:
				setDatabaseSourceTable((DatabaseSourceTableType)null);
				return;
			case TablePackage.DATA_PILOT_TABLE_TYPE__SOURCE_SERVICE:
				setSourceService((SourceServiceType)null);
				return;
			case TablePackage.DATA_PILOT_TABLE_TYPE__SOURCE_CELL_RANGE:
				setSourceCellRange((SourceCellRangeType)null);
				return;
			case TablePackage.DATA_PILOT_TABLE_TYPE__DATA_PILOT_FIELD:
				getDataPilotField().clear();
				return;
			case TablePackage.DATA_PILOT_TABLE_TYPE__APPLICATION_DATA:
				setApplicationData(APPLICATION_DATA_EDEFAULT);
				return;
			case TablePackage.DATA_PILOT_TABLE_TYPE__BUTTONS:
				setButtons(BUTTONS_EDEFAULT);
				return;
			case TablePackage.DATA_PILOT_TABLE_TYPE__DRILL_DOWN_ON_DOUBLE_CLICK:
				unsetDrillDownOnDoubleClick();
				return;
			case TablePackage.DATA_PILOT_TABLE_TYPE__GRAND_TOTAL:
				unsetGrandTotal();
				return;
			case TablePackage.DATA_PILOT_TABLE_TYPE__IDENTIFY_CATEGORIES:
				unsetIdentifyCategories();
				return;
			case TablePackage.DATA_PILOT_TABLE_TYPE__IGNORE_EMPTY_ROWS:
				unsetIgnoreEmptyRows();
				return;
			case TablePackage.DATA_PILOT_TABLE_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case TablePackage.DATA_PILOT_TABLE_TYPE__SHOW_FILTER_BUTTON:
				unsetShowFilterButton();
				return;
			case TablePackage.DATA_PILOT_TABLE_TYPE__TARGET_RANGE_ADDRESS:
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
			case TablePackage.DATA_PILOT_TABLE_TYPE__DATABASE_SOURCE_SQL:
				return databaseSourceSql != null;
			case TablePackage.DATA_PILOT_TABLE_TYPE__DATABASE_SOURCE_QUERY:
				return databaseSourceQuery != null;
			case TablePackage.DATA_PILOT_TABLE_TYPE__DATABASE_SOURCE_TABLE:
				return databaseSourceTable != null;
			case TablePackage.DATA_PILOT_TABLE_TYPE__SOURCE_SERVICE:
				return sourceService != null;
			case TablePackage.DATA_PILOT_TABLE_TYPE__SOURCE_CELL_RANGE:
				return sourceCellRange != null;
			case TablePackage.DATA_PILOT_TABLE_TYPE__DATA_PILOT_FIELD:
				return dataPilotField != null && !dataPilotField.isEmpty();
			case TablePackage.DATA_PILOT_TABLE_TYPE__APPLICATION_DATA:
				return APPLICATION_DATA_EDEFAULT == null ? applicationData != null : !APPLICATION_DATA_EDEFAULT.equals(applicationData);
			case TablePackage.DATA_PILOT_TABLE_TYPE__BUTTONS:
				return BUTTONS_EDEFAULT == null ? buttons != null : !BUTTONS_EDEFAULT.equals(buttons);
			case TablePackage.DATA_PILOT_TABLE_TYPE__DRILL_DOWN_ON_DOUBLE_CLICK:
				return isSetDrillDownOnDoubleClick();
			case TablePackage.DATA_PILOT_TABLE_TYPE__GRAND_TOTAL:
				return isSetGrandTotal();
			case TablePackage.DATA_PILOT_TABLE_TYPE__IDENTIFY_CATEGORIES:
				return isSetIdentifyCategories();
			case TablePackage.DATA_PILOT_TABLE_TYPE__IGNORE_EMPTY_ROWS:
				return isSetIgnoreEmptyRows();
			case TablePackage.DATA_PILOT_TABLE_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case TablePackage.DATA_PILOT_TABLE_TYPE__SHOW_FILTER_BUTTON:
				return isSetShowFilterButton();
			case TablePackage.DATA_PILOT_TABLE_TYPE__TARGET_RANGE_ADDRESS:
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
		result.append(" (applicationData: ");
		result.append(applicationData);
		result.append(", buttons: ");
		result.append(buttons);
		result.append(", drillDownOnDoubleClick: ");
		if (drillDownOnDoubleClickESet) result.append(drillDownOnDoubleClick); else result.append("<unset>");
		result.append(", grandTotal: ");
		if (grandTotalESet) result.append(grandTotal); else result.append("<unset>");
		result.append(", identifyCategories: ");
		if (identifyCategoriesESet) result.append(identifyCategories); else result.append("<unset>");
		result.append(", ignoreEmptyRows: ");
		if (ignoreEmptyRowsESet) result.append(ignoreEmptyRows); else result.append("<unset>");
		result.append(", name: ");
		result.append(name);
		result.append(", showFilterButton: ");
		if (showFilterButtonESet) result.append(showFilterButton); else result.append("<unset>");
		result.append(", targetRangeAddress: ");
		result.append(targetRangeAddress);
		result.append(')');
		return result.toString();
	}

} //DataPilotTableTypeImpl
