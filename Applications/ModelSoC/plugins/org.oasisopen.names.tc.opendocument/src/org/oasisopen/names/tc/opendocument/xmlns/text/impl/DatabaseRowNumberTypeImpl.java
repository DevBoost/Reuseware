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
import org.oasisopen.names.tc.opendocument.xmlns.form.ConnectionResourceType;
import org.oasisopen.names.tc.opendocument.xmlns.text.DatabaseRowNumberType;
import org.oasisopen.names.tc.opendocument.xmlns.text.TableTypeType;
import org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Database Row Number Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DatabaseRowNumberTypeImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DatabaseRowNumberTypeImpl#getConnectionResource <em>Connection Resource</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DatabaseRowNumberTypeImpl#getDatabaseName <em>Database Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DatabaseRowNumberTypeImpl#getNumFormat <em>Num Format</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DatabaseRowNumberTypeImpl#getNumLetterSync <em>Num Letter Sync</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DatabaseRowNumberTypeImpl#getTableName <em>Table Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DatabaseRowNumberTypeImpl#getTableType <em>Table Type</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DatabaseRowNumberTypeImpl#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DatabaseRowNumberTypeImpl extends EObjectImpl implements DatabaseRowNumberType {
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
	 * The default value of the '{@link #getDatabaseName() <em>Database Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatabaseName()
	 * @generated
	 * @ordered
	 */
	protected static final String DATABASE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDatabaseName() <em>Database Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatabaseName()
	 * @generated
	 * @ordered
	 */
	protected String databaseName = DATABASE_NAME_EDEFAULT;

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
	 * The default value of the '{@link #getTableName() <em>Table Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTableName()
	 * @generated
	 * @ordered
	 */
	protected static final String TABLE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTableName() <em>Table Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTableName()
	 * @generated
	 * @ordered
	 */
	protected String tableName = TABLE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getTableType() <em>Table Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTableType()
	 * @generated
	 * @ordered
	 */
	protected static final TableTypeType TABLE_TYPE_EDEFAULT = TableTypeType.TABLE;

	/**
	 * The cached value of the '{@link #getTableType() <em>Table Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTableType()
	 * @generated
	 * @ordered
	 */
	protected TableTypeType tableType = TABLE_TYPE_EDEFAULT;

	/**
	 * This is true if the Table Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean tableTypeESet;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected BigInteger value = VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DatabaseRowNumberTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TextPackage.eINSTANCE.getDatabaseRowNumberType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, TextPackage.DATABASE_ROW_NUMBER_TYPE__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionResourceType getConnectionResource() {
		return (ConnectionResourceType)getMixed().get(TextPackage.eINSTANCE.getDatabaseRowNumberType_ConnectionResource(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConnectionResource(ConnectionResourceType newConnectionResource, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getDatabaseRowNumberType_ConnectionResource(), newConnectionResource, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnectionResource(ConnectionResourceType newConnectionResource) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getDatabaseRowNumberType_ConnectionResource(), newConnectionResource);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDatabaseName() {
		return databaseName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatabaseName(String newDatabaseName) {
		String oldDatabaseName = databaseName;
		databaseName = newDatabaseName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.DATABASE_ROW_NUMBER_TYPE__DATABASE_NAME, oldDatabaseName, databaseName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.DATABASE_ROW_NUMBER_TYPE__NUM_FORMAT, oldNumFormat, numFormat));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.DATABASE_ROW_NUMBER_TYPE__NUM_LETTER_SYNC, oldNumLetterSync, numLetterSync, !oldNumLetterSyncESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, TextPackage.DATABASE_ROW_NUMBER_TYPE__NUM_LETTER_SYNC, oldNumLetterSync, NUM_LETTER_SYNC_EDEFAULT, oldNumLetterSyncESet));
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
	public String getTableName() {
		return tableName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTableName(String newTableName) {
		String oldTableName = tableName;
		tableName = newTableName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.DATABASE_ROW_NUMBER_TYPE__TABLE_NAME, oldTableName, tableName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TableTypeType getTableType() {
		return tableType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTableType(TableTypeType newTableType) {
		TableTypeType oldTableType = tableType;
		tableType = newTableType == null ? TABLE_TYPE_EDEFAULT : newTableType;
		boolean oldTableTypeESet = tableTypeESet;
		tableTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.DATABASE_ROW_NUMBER_TYPE__TABLE_TYPE, oldTableType, tableType, !oldTableTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTableType() {
		TableTypeType oldTableType = tableType;
		boolean oldTableTypeESet = tableTypeESet;
		tableType = TABLE_TYPE_EDEFAULT;
		tableTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TextPackage.DATABASE_ROW_NUMBER_TYPE__TABLE_TYPE, oldTableType, TABLE_TYPE_EDEFAULT, oldTableTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTableType() {
		return tableTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(BigInteger newValue) {
		BigInteger oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.DATABASE_ROW_NUMBER_TYPE__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TextPackage.DATABASE_ROW_NUMBER_TYPE__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case TextPackage.DATABASE_ROW_NUMBER_TYPE__CONNECTION_RESOURCE:
				return basicSetConnectionResource(null, msgs);
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
			case TextPackage.DATABASE_ROW_NUMBER_TYPE__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case TextPackage.DATABASE_ROW_NUMBER_TYPE__CONNECTION_RESOURCE:
				return getConnectionResource();
			case TextPackage.DATABASE_ROW_NUMBER_TYPE__DATABASE_NAME:
				return getDatabaseName();
			case TextPackage.DATABASE_ROW_NUMBER_TYPE__NUM_FORMAT:
				return getNumFormat();
			case TextPackage.DATABASE_ROW_NUMBER_TYPE__NUM_LETTER_SYNC:
				return getNumLetterSync();
			case TextPackage.DATABASE_ROW_NUMBER_TYPE__TABLE_NAME:
				return getTableName();
			case TextPackage.DATABASE_ROW_NUMBER_TYPE__TABLE_TYPE:
				return getTableType();
			case TextPackage.DATABASE_ROW_NUMBER_TYPE__VALUE:
				return getValue();
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
			case TextPackage.DATABASE_ROW_NUMBER_TYPE__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case TextPackage.DATABASE_ROW_NUMBER_TYPE__CONNECTION_RESOURCE:
				setConnectionResource((ConnectionResourceType)newValue);
				return;
			case TextPackage.DATABASE_ROW_NUMBER_TYPE__DATABASE_NAME:
				setDatabaseName((String)newValue);
				return;
			case TextPackage.DATABASE_ROW_NUMBER_TYPE__NUM_FORMAT:
				setNumFormat(newValue);
				return;
			case TextPackage.DATABASE_ROW_NUMBER_TYPE__NUM_LETTER_SYNC:
				setNumLetterSync((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case TextPackage.DATABASE_ROW_NUMBER_TYPE__TABLE_NAME:
				setTableName((String)newValue);
				return;
			case TextPackage.DATABASE_ROW_NUMBER_TYPE__TABLE_TYPE:
				setTableType((TableTypeType)newValue);
				return;
			case TextPackage.DATABASE_ROW_NUMBER_TYPE__VALUE:
				setValue((BigInteger)newValue);
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
			case TextPackage.DATABASE_ROW_NUMBER_TYPE__MIXED:
				getMixed().clear();
				return;
			case TextPackage.DATABASE_ROW_NUMBER_TYPE__CONNECTION_RESOURCE:
				setConnectionResource((ConnectionResourceType)null);
				return;
			case TextPackage.DATABASE_ROW_NUMBER_TYPE__DATABASE_NAME:
				setDatabaseName(DATABASE_NAME_EDEFAULT);
				return;
			case TextPackage.DATABASE_ROW_NUMBER_TYPE__NUM_FORMAT:
				setNumFormat(NUM_FORMAT_EDEFAULT);
				return;
			case TextPackage.DATABASE_ROW_NUMBER_TYPE__NUM_LETTER_SYNC:
				unsetNumLetterSync();
				return;
			case TextPackage.DATABASE_ROW_NUMBER_TYPE__TABLE_NAME:
				setTableName(TABLE_NAME_EDEFAULT);
				return;
			case TextPackage.DATABASE_ROW_NUMBER_TYPE__TABLE_TYPE:
				unsetTableType();
				return;
			case TextPackage.DATABASE_ROW_NUMBER_TYPE__VALUE:
				setValue(VALUE_EDEFAULT);
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
			case TextPackage.DATABASE_ROW_NUMBER_TYPE__MIXED:
				return mixed != null && !mixed.isEmpty();
			case TextPackage.DATABASE_ROW_NUMBER_TYPE__CONNECTION_RESOURCE:
				return getConnectionResource() != null;
			case TextPackage.DATABASE_ROW_NUMBER_TYPE__DATABASE_NAME:
				return DATABASE_NAME_EDEFAULT == null ? databaseName != null : !DATABASE_NAME_EDEFAULT.equals(databaseName);
			case TextPackage.DATABASE_ROW_NUMBER_TYPE__NUM_FORMAT:
				return NUM_FORMAT_EDEFAULT == null ? numFormat != null : !NUM_FORMAT_EDEFAULT.equals(numFormat);
			case TextPackage.DATABASE_ROW_NUMBER_TYPE__NUM_LETTER_SYNC:
				return isSetNumLetterSync();
			case TextPackage.DATABASE_ROW_NUMBER_TYPE__TABLE_NAME:
				return TABLE_NAME_EDEFAULT == null ? tableName != null : !TABLE_NAME_EDEFAULT.equals(tableName);
			case TextPackage.DATABASE_ROW_NUMBER_TYPE__TABLE_TYPE:
				return isSetTableType();
			case TextPackage.DATABASE_ROW_NUMBER_TYPE__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
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
		result.append(", databaseName: ");
		result.append(databaseName);
		result.append(", numFormat: ");
		result.append(numFormat);
		result.append(", numLetterSync: ");
		if (numLetterSyncESet) result.append(numLetterSync); else result.append("<unset>");
		result.append(", tableName: ");
		result.append(tableName);
		result.append(", tableType: ");
		if (tableTypeESet) result.append(tableType); else result.append("<unset>");
		result.append(", value: ");
		result.append(value);
		result.append(')');
		return result.toString();
	}

} //DatabaseRowNumberTypeImpl
