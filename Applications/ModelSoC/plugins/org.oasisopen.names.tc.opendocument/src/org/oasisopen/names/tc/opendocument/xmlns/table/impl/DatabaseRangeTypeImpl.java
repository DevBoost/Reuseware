/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.table.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.oasisopen.names.tc.opendocument.xmlns.table.DatabaseRangeType;
import org.oasisopen.names.tc.opendocument.xmlns.table.DatabaseSourceQueryType;
import org.oasisopen.names.tc.opendocument.xmlns.table.DatabaseSourceSqlType;
import org.oasisopen.names.tc.opendocument.xmlns.table.DatabaseSourceTableType;
import org.oasisopen.names.tc.opendocument.xmlns.table.FilterType;
import org.oasisopen.names.tc.opendocument.xmlns.table.OrientationType1;
import org.oasisopen.names.tc.opendocument.xmlns.table.SortType;
import org.oasisopen.names.tc.opendocument.xmlns.table.SubtotalRulesType;
import org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Database Range Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DatabaseRangeTypeImpl#getDatabaseSourceSql <em>Database Source Sql</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DatabaseRangeTypeImpl#getDatabaseSourceQuery <em>Database Source Query</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DatabaseRangeTypeImpl#getDatabaseSourceTable <em>Database Source Table</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DatabaseRangeTypeImpl#getFilter <em>Filter</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DatabaseRangeTypeImpl#getSort <em>Sort</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DatabaseRangeTypeImpl#getSubtotalRules <em>Subtotal Rules</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DatabaseRangeTypeImpl#getContainsHeader <em>Contains Header</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DatabaseRangeTypeImpl#getDisplayFilterButtons <em>Display Filter Buttons</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DatabaseRangeTypeImpl#getHasPersistentData <em>Has Persistent Data</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DatabaseRangeTypeImpl#getIsSelection <em>Is Selection</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DatabaseRangeTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DatabaseRangeTypeImpl#getOnUpdateKeepSize <em>On Update Keep Size</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DatabaseRangeTypeImpl#getOnUpdateKeepStyles <em>On Update Keep Styles</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DatabaseRangeTypeImpl#getOrientation <em>Orientation</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DatabaseRangeTypeImpl#getRefreshDelay <em>Refresh Delay</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DatabaseRangeTypeImpl#getTargetRangeAddress <em>Target Range Address</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DatabaseRangeTypeImpl extends EObjectImpl implements DatabaseRangeType {
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
	 * The cached value of the '{@link #getFilter() <em>Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilter()
	 * @generated
	 * @ordered
	 */
	protected FilterType filter;

	/**
	 * The cached value of the '{@link #getSort() <em>Sort</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSort()
	 * @generated
	 * @ordered
	 */
	protected SortType sort;

	/**
	 * The cached value of the '{@link #getSubtotalRules() <em>Subtotal Rules</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubtotalRules()
	 * @generated
	 * @ordered
	 */
	protected SubtotalRulesType subtotalRules;

	/**
	 * The default value of the '{@link #getContainsHeader() <em>Contains Header</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainsHeader()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean CONTAINS_HEADER_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getContainsHeader() <em>Contains Header</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainsHeader()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean containsHeader = CONTAINS_HEADER_EDEFAULT;

	/**
	 * This is true if the Contains Header attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean containsHeaderESet;

	/**
	 * The default value of the '{@link #getDisplayFilterButtons() <em>Display Filter Buttons</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayFilterButtons()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean DISPLAY_FILTER_BUTTONS_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getDisplayFilterButtons() <em>Display Filter Buttons</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayFilterButtons()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean displayFilterButtons = DISPLAY_FILTER_BUTTONS_EDEFAULT;

	/**
	 * This is true if the Display Filter Buttons attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean displayFilterButtonsESet;

	/**
	 * The default value of the '{@link #getHasPersistentData() <em>Has Persistent Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasPersistentData()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean HAS_PERSISTENT_DATA_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getHasPersistentData() <em>Has Persistent Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasPersistentData()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean hasPersistentData = HAS_PERSISTENT_DATA_EDEFAULT;

	/**
	 * This is true if the Has Persistent Data attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean hasPersistentDataESet;

	/**
	 * The default value of the '{@link #getIsSelection() <em>Is Selection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsSelection()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean IS_SELECTION_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getIsSelection() <em>Is Selection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsSelection()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean isSelection = IS_SELECTION_EDEFAULT;

	/**
	 * This is true if the Is Selection attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isSelectionESet;

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
	 * The default value of the '{@link #getOnUpdateKeepSize() <em>On Update Keep Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnUpdateKeepSize()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean ON_UPDATE_KEEP_SIZE_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getOnUpdateKeepSize() <em>On Update Keep Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnUpdateKeepSize()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean onUpdateKeepSize = ON_UPDATE_KEEP_SIZE_EDEFAULT;

	/**
	 * This is true if the On Update Keep Size attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean onUpdateKeepSizeESet;

	/**
	 * The default value of the '{@link #getOnUpdateKeepStyles() <em>On Update Keep Styles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnUpdateKeepStyles()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean ON_UPDATE_KEEP_STYLES_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getOnUpdateKeepStyles() <em>On Update Keep Styles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnUpdateKeepStyles()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean onUpdateKeepStyles = ON_UPDATE_KEEP_STYLES_EDEFAULT;

	/**
	 * This is true if the On Update Keep Styles attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean onUpdateKeepStylesESet;

	/**
	 * The default value of the '{@link #getOrientation() <em>Orientation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrientation()
	 * @generated
	 * @ordered
	 */
	protected static final OrientationType1 ORIENTATION_EDEFAULT = OrientationType1.COLUMN;

	/**
	 * The cached value of the '{@link #getOrientation() <em>Orientation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrientation()
	 * @generated
	 * @ordered
	 */
	protected OrientationType1 orientation = ORIENTATION_EDEFAULT;

	/**
	 * This is true if the Orientation attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean orientationESet;

	/**
	 * The default value of the '{@link #getRefreshDelay() <em>Refresh Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefreshDelay()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean REFRESH_DELAY_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getRefreshDelay() <em>Refresh Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefreshDelay()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean refreshDelay = REFRESH_DELAY_EDEFAULT;

	/**
	 * This is true if the Refresh Delay attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean refreshDelayESet;

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
	protected DatabaseRangeTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TablePackage.eINSTANCE.getDatabaseRangeType();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TablePackage.DATABASE_RANGE_TYPE__DATABASE_SOURCE_SQL, oldDatabaseSourceSql, newDatabaseSourceSql);
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
				msgs = ((InternalEObject)databaseSourceSql).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TablePackage.DATABASE_RANGE_TYPE__DATABASE_SOURCE_SQL, null, msgs);
			if (newDatabaseSourceSql != null)
				msgs = ((InternalEObject)newDatabaseSourceSql).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TablePackage.DATABASE_RANGE_TYPE__DATABASE_SOURCE_SQL, null, msgs);
			msgs = basicSetDatabaseSourceSql(newDatabaseSourceSql, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DATABASE_RANGE_TYPE__DATABASE_SOURCE_SQL, newDatabaseSourceSql, newDatabaseSourceSql));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TablePackage.DATABASE_RANGE_TYPE__DATABASE_SOURCE_QUERY, oldDatabaseSourceQuery, newDatabaseSourceQuery);
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
				msgs = ((InternalEObject)databaseSourceQuery).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TablePackage.DATABASE_RANGE_TYPE__DATABASE_SOURCE_QUERY, null, msgs);
			if (newDatabaseSourceQuery != null)
				msgs = ((InternalEObject)newDatabaseSourceQuery).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TablePackage.DATABASE_RANGE_TYPE__DATABASE_SOURCE_QUERY, null, msgs);
			msgs = basicSetDatabaseSourceQuery(newDatabaseSourceQuery, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DATABASE_RANGE_TYPE__DATABASE_SOURCE_QUERY, newDatabaseSourceQuery, newDatabaseSourceQuery));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TablePackage.DATABASE_RANGE_TYPE__DATABASE_SOURCE_TABLE, oldDatabaseSourceTable, newDatabaseSourceTable);
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
				msgs = ((InternalEObject)databaseSourceTable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TablePackage.DATABASE_RANGE_TYPE__DATABASE_SOURCE_TABLE, null, msgs);
			if (newDatabaseSourceTable != null)
				msgs = ((InternalEObject)newDatabaseSourceTable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TablePackage.DATABASE_RANGE_TYPE__DATABASE_SOURCE_TABLE, null, msgs);
			msgs = basicSetDatabaseSourceTable(newDatabaseSourceTable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DATABASE_RANGE_TYPE__DATABASE_SOURCE_TABLE, newDatabaseSourceTable, newDatabaseSourceTable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilterType getFilter() {
		return filter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFilter(FilterType newFilter, NotificationChain msgs) {
		FilterType oldFilter = filter;
		filter = newFilter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TablePackage.DATABASE_RANGE_TYPE__FILTER, oldFilter, newFilter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFilter(FilterType newFilter) {
		if (newFilter != filter) {
			NotificationChain msgs = null;
			if (filter != null)
				msgs = ((InternalEObject)filter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TablePackage.DATABASE_RANGE_TYPE__FILTER, null, msgs);
			if (newFilter != null)
				msgs = ((InternalEObject)newFilter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TablePackage.DATABASE_RANGE_TYPE__FILTER, null, msgs);
			msgs = basicSetFilter(newFilter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DATABASE_RANGE_TYPE__FILTER, newFilter, newFilter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SortType getSort() {
		return sort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSort(SortType newSort, NotificationChain msgs) {
		SortType oldSort = sort;
		sort = newSort;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TablePackage.DATABASE_RANGE_TYPE__SORT, oldSort, newSort);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSort(SortType newSort) {
		if (newSort != sort) {
			NotificationChain msgs = null;
			if (sort != null)
				msgs = ((InternalEObject)sort).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TablePackage.DATABASE_RANGE_TYPE__SORT, null, msgs);
			if (newSort != null)
				msgs = ((InternalEObject)newSort).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TablePackage.DATABASE_RANGE_TYPE__SORT, null, msgs);
			msgs = basicSetSort(newSort, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DATABASE_RANGE_TYPE__SORT, newSort, newSort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubtotalRulesType getSubtotalRules() {
		return subtotalRules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubtotalRules(SubtotalRulesType newSubtotalRules, NotificationChain msgs) {
		SubtotalRulesType oldSubtotalRules = subtotalRules;
		subtotalRules = newSubtotalRules;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TablePackage.DATABASE_RANGE_TYPE__SUBTOTAL_RULES, oldSubtotalRules, newSubtotalRules);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubtotalRules(SubtotalRulesType newSubtotalRules) {
		if (newSubtotalRules != subtotalRules) {
			NotificationChain msgs = null;
			if (subtotalRules != null)
				msgs = ((InternalEObject)subtotalRules).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TablePackage.DATABASE_RANGE_TYPE__SUBTOTAL_RULES, null, msgs);
			if (newSubtotalRules != null)
				msgs = ((InternalEObject)newSubtotalRules).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TablePackage.DATABASE_RANGE_TYPE__SUBTOTAL_RULES, null, msgs);
			msgs = basicSetSubtotalRules(newSubtotalRules, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DATABASE_RANGE_TYPE__SUBTOTAL_RULES, newSubtotalRules, newSubtotalRules));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getContainsHeader() {
		return containsHeader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainsHeader(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newContainsHeader) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldContainsHeader = containsHeader;
		containsHeader = newContainsHeader == null ? CONTAINS_HEADER_EDEFAULT : newContainsHeader;
		boolean oldContainsHeaderESet = containsHeaderESet;
		containsHeaderESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DATABASE_RANGE_TYPE__CONTAINS_HEADER, oldContainsHeader, containsHeader, !oldContainsHeaderESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetContainsHeader() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldContainsHeader = containsHeader;
		boolean oldContainsHeaderESet = containsHeaderESet;
		containsHeader = CONTAINS_HEADER_EDEFAULT;
		containsHeaderESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TablePackage.DATABASE_RANGE_TYPE__CONTAINS_HEADER, oldContainsHeader, CONTAINS_HEADER_EDEFAULT, oldContainsHeaderESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetContainsHeader() {
		return containsHeaderESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getDisplayFilterButtons() {
		return displayFilterButtons;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisplayFilterButtons(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newDisplayFilterButtons) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldDisplayFilterButtons = displayFilterButtons;
		displayFilterButtons = newDisplayFilterButtons == null ? DISPLAY_FILTER_BUTTONS_EDEFAULT : newDisplayFilterButtons;
		boolean oldDisplayFilterButtonsESet = displayFilterButtonsESet;
		displayFilterButtonsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DATABASE_RANGE_TYPE__DISPLAY_FILTER_BUTTONS, oldDisplayFilterButtons, displayFilterButtons, !oldDisplayFilterButtonsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDisplayFilterButtons() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldDisplayFilterButtons = displayFilterButtons;
		boolean oldDisplayFilterButtonsESet = displayFilterButtonsESet;
		displayFilterButtons = DISPLAY_FILTER_BUTTONS_EDEFAULT;
		displayFilterButtonsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TablePackage.DATABASE_RANGE_TYPE__DISPLAY_FILTER_BUTTONS, oldDisplayFilterButtons, DISPLAY_FILTER_BUTTONS_EDEFAULT, oldDisplayFilterButtonsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDisplayFilterButtons() {
		return displayFilterButtonsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getHasPersistentData() {
		return hasPersistentData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasPersistentData(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newHasPersistentData) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldHasPersistentData = hasPersistentData;
		hasPersistentData = newHasPersistentData == null ? HAS_PERSISTENT_DATA_EDEFAULT : newHasPersistentData;
		boolean oldHasPersistentDataESet = hasPersistentDataESet;
		hasPersistentDataESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DATABASE_RANGE_TYPE__HAS_PERSISTENT_DATA, oldHasPersistentData, hasPersistentData, !oldHasPersistentDataESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetHasPersistentData() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldHasPersistentData = hasPersistentData;
		boolean oldHasPersistentDataESet = hasPersistentDataESet;
		hasPersistentData = HAS_PERSISTENT_DATA_EDEFAULT;
		hasPersistentDataESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TablePackage.DATABASE_RANGE_TYPE__HAS_PERSISTENT_DATA, oldHasPersistentData, HAS_PERSISTENT_DATA_EDEFAULT, oldHasPersistentDataESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetHasPersistentData() {
		return hasPersistentDataESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getIsSelection() {
		return isSelection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsSelection(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newIsSelection) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldIsSelection = isSelection;
		isSelection = newIsSelection == null ? IS_SELECTION_EDEFAULT : newIsSelection;
		boolean oldIsSelectionESet = isSelectionESet;
		isSelectionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DATABASE_RANGE_TYPE__IS_SELECTION, oldIsSelection, isSelection, !oldIsSelectionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIsSelection() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldIsSelection = isSelection;
		boolean oldIsSelectionESet = isSelectionESet;
		isSelection = IS_SELECTION_EDEFAULT;
		isSelectionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TablePackage.DATABASE_RANGE_TYPE__IS_SELECTION, oldIsSelection, IS_SELECTION_EDEFAULT, oldIsSelectionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIsSelection() {
		return isSelectionESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DATABASE_RANGE_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getOnUpdateKeepSize() {
		return onUpdateKeepSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnUpdateKeepSize(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newOnUpdateKeepSize) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldOnUpdateKeepSize = onUpdateKeepSize;
		onUpdateKeepSize = newOnUpdateKeepSize == null ? ON_UPDATE_KEEP_SIZE_EDEFAULT : newOnUpdateKeepSize;
		boolean oldOnUpdateKeepSizeESet = onUpdateKeepSizeESet;
		onUpdateKeepSizeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DATABASE_RANGE_TYPE__ON_UPDATE_KEEP_SIZE, oldOnUpdateKeepSize, onUpdateKeepSize, !oldOnUpdateKeepSizeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetOnUpdateKeepSize() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldOnUpdateKeepSize = onUpdateKeepSize;
		boolean oldOnUpdateKeepSizeESet = onUpdateKeepSizeESet;
		onUpdateKeepSize = ON_UPDATE_KEEP_SIZE_EDEFAULT;
		onUpdateKeepSizeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TablePackage.DATABASE_RANGE_TYPE__ON_UPDATE_KEEP_SIZE, oldOnUpdateKeepSize, ON_UPDATE_KEEP_SIZE_EDEFAULT, oldOnUpdateKeepSizeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOnUpdateKeepSize() {
		return onUpdateKeepSizeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getOnUpdateKeepStyles() {
		return onUpdateKeepStyles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnUpdateKeepStyles(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newOnUpdateKeepStyles) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldOnUpdateKeepStyles = onUpdateKeepStyles;
		onUpdateKeepStyles = newOnUpdateKeepStyles == null ? ON_UPDATE_KEEP_STYLES_EDEFAULT : newOnUpdateKeepStyles;
		boolean oldOnUpdateKeepStylesESet = onUpdateKeepStylesESet;
		onUpdateKeepStylesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DATABASE_RANGE_TYPE__ON_UPDATE_KEEP_STYLES, oldOnUpdateKeepStyles, onUpdateKeepStyles, !oldOnUpdateKeepStylesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetOnUpdateKeepStyles() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldOnUpdateKeepStyles = onUpdateKeepStyles;
		boolean oldOnUpdateKeepStylesESet = onUpdateKeepStylesESet;
		onUpdateKeepStyles = ON_UPDATE_KEEP_STYLES_EDEFAULT;
		onUpdateKeepStylesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TablePackage.DATABASE_RANGE_TYPE__ON_UPDATE_KEEP_STYLES, oldOnUpdateKeepStyles, ON_UPDATE_KEEP_STYLES_EDEFAULT, oldOnUpdateKeepStylesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOnUpdateKeepStyles() {
		return onUpdateKeepStylesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrientationType1 getOrientation() {
		return orientation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrientation(OrientationType1 newOrientation) {
		OrientationType1 oldOrientation = orientation;
		orientation = newOrientation == null ? ORIENTATION_EDEFAULT : newOrientation;
		boolean oldOrientationESet = orientationESet;
		orientationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DATABASE_RANGE_TYPE__ORIENTATION, oldOrientation, orientation, !oldOrientationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetOrientation() {
		OrientationType1 oldOrientation = orientation;
		boolean oldOrientationESet = orientationESet;
		orientation = ORIENTATION_EDEFAULT;
		orientationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TablePackage.DATABASE_RANGE_TYPE__ORIENTATION, oldOrientation, ORIENTATION_EDEFAULT, oldOrientationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOrientation() {
		return orientationESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getRefreshDelay() {
		return refreshDelay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefreshDelay(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newRefreshDelay) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldRefreshDelay = refreshDelay;
		refreshDelay = newRefreshDelay == null ? REFRESH_DELAY_EDEFAULT : newRefreshDelay;
		boolean oldRefreshDelayESet = refreshDelayESet;
		refreshDelayESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DATABASE_RANGE_TYPE__REFRESH_DELAY, oldRefreshDelay, refreshDelay, !oldRefreshDelayESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRefreshDelay() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldRefreshDelay = refreshDelay;
		boolean oldRefreshDelayESet = refreshDelayESet;
		refreshDelay = REFRESH_DELAY_EDEFAULT;
		refreshDelayESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TablePackage.DATABASE_RANGE_TYPE__REFRESH_DELAY, oldRefreshDelay, REFRESH_DELAY_EDEFAULT, oldRefreshDelayESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRefreshDelay() {
		return refreshDelayESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DATABASE_RANGE_TYPE__TARGET_RANGE_ADDRESS, oldTargetRangeAddress, targetRangeAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TablePackage.DATABASE_RANGE_TYPE__DATABASE_SOURCE_SQL:
				return basicSetDatabaseSourceSql(null, msgs);
			case TablePackage.DATABASE_RANGE_TYPE__DATABASE_SOURCE_QUERY:
				return basicSetDatabaseSourceQuery(null, msgs);
			case TablePackage.DATABASE_RANGE_TYPE__DATABASE_SOURCE_TABLE:
				return basicSetDatabaseSourceTable(null, msgs);
			case TablePackage.DATABASE_RANGE_TYPE__FILTER:
				return basicSetFilter(null, msgs);
			case TablePackage.DATABASE_RANGE_TYPE__SORT:
				return basicSetSort(null, msgs);
			case TablePackage.DATABASE_RANGE_TYPE__SUBTOTAL_RULES:
				return basicSetSubtotalRules(null, msgs);
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
			case TablePackage.DATABASE_RANGE_TYPE__DATABASE_SOURCE_SQL:
				return getDatabaseSourceSql();
			case TablePackage.DATABASE_RANGE_TYPE__DATABASE_SOURCE_QUERY:
				return getDatabaseSourceQuery();
			case TablePackage.DATABASE_RANGE_TYPE__DATABASE_SOURCE_TABLE:
				return getDatabaseSourceTable();
			case TablePackage.DATABASE_RANGE_TYPE__FILTER:
				return getFilter();
			case TablePackage.DATABASE_RANGE_TYPE__SORT:
				return getSort();
			case TablePackage.DATABASE_RANGE_TYPE__SUBTOTAL_RULES:
				return getSubtotalRules();
			case TablePackage.DATABASE_RANGE_TYPE__CONTAINS_HEADER:
				return getContainsHeader();
			case TablePackage.DATABASE_RANGE_TYPE__DISPLAY_FILTER_BUTTONS:
				return getDisplayFilterButtons();
			case TablePackage.DATABASE_RANGE_TYPE__HAS_PERSISTENT_DATA:
				return getHasPersistentData();
			case TablePackage.DATABASE_RANGE_TYPE__IS_SELECTION:
				return getIsSelection();
			case TablePackage.DATABASE_RANGE_TYPE__NAME:
				return getName();
			case TablePackage.DATABASE_RANGE_TYPE__ON_UPDATE_KEEP_SIZE:
				return getOnUpdateKeepSize();
			case TablePackage.DATABASE_RANGE_TYPE__ON_UPDATE_KEEP_STYLES:
				return getOnUpdateKeepStyles();
			case TablePackage.DATABASE_RANGE_TYPE__ORIENTATION:
				return getOrientation();
			case TablePackage.DATABASE_RANGE_TYPE__REFRESH_DELAY:
				return getRefreshDelay();
			case TablePackage.DATABASE_RANGE_TYPE__TARGET_RANGE_ADDRESS:
				return getTargetRangeAddress();
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
			case TablePackage.DATABASE_RANGE_TYPE__DATABASE_SOURCE_SQL:
				setDatabaseSourceSql((DatabaseSourceSqlType)newValue);
				return;
			case TablePackage.DATABASE_RANGE_TYPE__DATABASE_SOURCE_QUERY:
				setDatabaseSourceQuery((DatabaseSourceQueryType)newValue);
				return;
			case TablePackage.DATABASE_RANGE_TYPE__DATABASE_SOURCE_TABLE:
				setDatabaseSourceTable((DatabaseSourceTableType)newValue);
				return;
			case TablePackage.DATABASE_RANGE_TYPE__FILTER:
				setFilter((FilterType)newValue);
				return;
			case TablePackage.DATABASE_RANGE_TYPE__SORT:
				setSort((SortType)newValue);
				return;
			case TablePackage.DATABASE_RANGE_TYPE__SUBTOTAL_RULES:
				setSubtotalRules((SubtotalRulesType)newValue);
				return;
			case TablePackage.DATABASE_RANGE_TYPE__CONTAINS_HEADER:
				setContainsHeader((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case TablePackage.DATABASE_RANGE_TYPE__DISPLAY_FILTER_BUTTONS:
				setDisplayFilterButtons((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case TablePackage.DATABASE_RANGE_TYPE__HAS_PERSISTENT_DATA:
				setHasPersistentData((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case TablePackage.DATABASE_RANGE_TYPE__IS_SELECTION:
				setIsSelection((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case TablePackage.DATABASE_RANGE_TYPE__NAME:
				setName((String)newValue);
				return;
			case TablePackage.DATABASE_RANGE_TYPE__ON_UPDATE_KEEP_SIZE:
				setOnUpdateKeepSize((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case TablePackage.DATABASE_RANGE_TYPE__ON_UPDATE_KEEP_STYLES:
				setOnUpdateKeepStyles((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case TablePackage.DATABASE_RANGE_TYPE__ORIENTATION:
				setOrientation((OrientationType1)newValue);
				return;
			case TablePackage.DATABASE_RANGE_TYPE__REFRESH_DELAY:
				setRefreshDelay((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case TablePackage.DATABASE_RANGE_TYPE__TARGET_RANGE_ADDRESS:
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
			case TablePackage.DATABASE_RANGE_TYPE__DATABASE_SOURCE_SQL:
				setDatabaseSourceSql((DatabaseSourceSqlType)null);
				return;
			case TablePackage.DATABASE_RANGE_TYPE__DATABASE_SOURCE_QUERY:
				setDatabaseSourceQuery((DatabaseSourceQueryType)null);
				return;
			case TablePackage.DATABASE_RANGE_TYPE__DATABASE_SOURCE_TABLE:
				setDatabaseSourceTable((DatabaseSourceTableType)null);
				return;
			case TablePackage.DATABASE_RANGE_TYPE__FILTER:
				setFilter((FilterType)null);
				return;
			case TablePackage.DATABASE_RANGE_TYPE__SORT:
				setSort((SortType)null);
				return;
			case TablePackage.DATABASE_RANGE_TYPE__SUBTOTAL_RULES:
				setSubtotalRules((SubtotalRulesType)null);
				return;
			case TablePackage.DATABASE_RANGE_TYPE__CONTAINS_HEADER:
				unsetContainsHeader();
				return;
			case TablePackage.DATABASE_RANGE_TYPE__DISPLAY_FILTER_BUTTONS:
				unsetDisplayFilterButtons();
				return;
			case TablePackage.DATABASE_RANGE_TYPE__HAS_PERSISTENT_DATA:
				unsetHasPersistentData();
				return;
			case TablePackage.DATABASE_RANGE_TYPE__IS_SELECTION:
				unsetIsSelection();
				return;
			case TablePackage.DATABASE_RANGE_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case TablePackage.DATABASE_RANGE_TYPE__ON_UPDATE_KEEP_SIZE:
				unsetOnUpdateKeepSize();
				return;
			case TablePackage.DATABASE_RANGE_TYPE__ON_UPDATE_KEEP_STYLES:
				unsetOnUpdateKeepStyles();
				return;
			case TablePackage.DATABASE_RANGE_TYPE__ORIENTATION:
				unsetOrientation();
				return;
			case TablePackage.DATABASE_RANGE_TYPE__REFRESH_DELAY:
				unsetRefreshDelay();
				return;
			case TablePackage.DATABASE_RANGE_TYPE__TARGET_RANGE_ADDRESS:
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
			case TablePackage.DATABASE_RANGE_TYPE__DATABASE_SOURCE_SQL:
				return databaseSourceSql != null;
			case TablePackage.DATABASE_RANGE_TYPE__DATABASE_SOURCE_QUERY:
				return databaseSourceQuery != null;
			case TablePackage.DATABASE_RANGE_TYPE__DATABASE_SOURCE_TABLE:
				return databaseSourceTable != null;
			case TablePackage.DATABASE_RANGE_TYPE__FILTER:
				return filter != null;
			case TablePackage.DATABASE_RANGE_TYPE__SORT:
				return sort != null;
			case TablePackage.DATABASE_RANGE_TYPE__SUBTOTAL_RULES:
				return subtotalRules != null;
			case TablePackage.DATABASE_RANGE_TYPE__CONTAINS_HEADER:
				return isSetContainsHeader();
			case TablePackage.DATABASE_RANGE_TYPE__DISPLAY_FILTER_BUTTONS:
				return isSetDisplayFilterButtons();
			case TablePackage.DATABASE_RANGE_TYPE__HAS_PERSISTENT_DATA:
				return isSetHasPersistentData();
			case TablePackage.DATABASE_RANGE_TYPE__IS_SELECTION:
				return isSetIsSelection();
			case TablePackage.DATABASE_RANGE_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case TablePackage.DATABASE_RANGE_TYPE__ON_UPDATE_KEEP_SIZE:
				return isSetOnUpdateKeepSize();
			case TablePackage.DATABASE_RANGE_TYPE__ON_UPDATE_KEEP_STYLES:
				return isSetOnUpdateKeepStyles();
			case TablePackage.DATABASE_RANGE_TYPE__ORIENTATION:
				return isSetOrientation();
			case TablePackage.DATABASE_RANGE_TYPE__REFRESH_DELAY:
				return isSetRefreshDelay();
			case TablePackage.DATABASE_RANGE_TYPE__TARGET_RANGE_ADDRESS:
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
		result.append(" (containsHeader: ");
		if (containsHeaderESet) result.append(containsHeader); else result.append("<unset>");
		result.append(", displayFilterButtons: ");
		if (displayFilterButtonsESet) result.append(displayFilterButtons); else result.append("<unset>");
		result.append(", hasPersistentData: ");
		if (hasPersistentDataESet) result.append(hasPersistentData); else result.append("<unset>");
		result.append(", isSelection: ");
		if (isSelectionESet) result.append(isSelection); else result.append("<unset>");
		result.append(", name: ");
		result.append(name);
		result.append(", onUpdateKeepSize: ");
		if (onUpdateKeepSizeESet) result.append(onUpdateKeepSize); else result.append("<unset>");
		result.append(", onUpdateKeepStyles: ");
		if (onUpdateKeepStylesESet) result.append(onUpdateKeepStyles); else result.append("<unset>");
		result.append(", orientation: ");
		if (orientationESet) result.append(orientation); else result.append("<unset>");
		result.append(", refreshDelay: ");
		if (refreshDelayESet) result.append(refreshDelay); else result.append("<unset>");
		result.append(", targetRangeAddress: ");
		result.append(targetRangeAddress);
		result.append(')');
		return result.toString();
	}

} //DatabaseRangeTypeImpl
