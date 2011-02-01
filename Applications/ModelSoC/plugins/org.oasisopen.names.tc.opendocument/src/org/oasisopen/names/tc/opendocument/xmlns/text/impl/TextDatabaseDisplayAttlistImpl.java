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
import org.oasisopen.names.tc.opendocument.xmlns.form.ConnectionResourceType;
import org.oasisopen.names.tc.opendocument.xmlns.text.TableTypeType;
import org.oasisopen.names.tc.opendocument.xmlns.text.TextDatabaseDisplayAttlist;
import org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Database Display Attlist</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.TextDatabaseDisplayAttlistImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.TextDatabaseDisplayAttlistImpl#getConnectionResource <em>Connection Resource</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.TextDatabaseDisplayAttlistImpl#getColumnName <em>Column Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.TextDatabaseDisplayAttlistImpl#getDatabaseName <em>Database Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.TextDatabaseDisplayAttlistImpl#getDataStyleName <em>Data Style Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.TextDatabaseDisplayAttlistImpl#getTableName <em>Table Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.TextDatabaseDisplayAttlistImpl#getTableType <em>Table Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TextDatabaseDisplayAttlistImpl extends EObjectImpl implements TextDatabaseDisplayAttlist {
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
	 * The default value of the '{@link #getColumnName() <em>Column Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumnName()
	 * @generated
	 * @ordered
	 */
	protected static final String COLUMN_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getColumnName() <em>Column Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumnName()
	 * @generated
	 * @ordered
	 */
	protected String columnName = COLUMN_NAME_EDEFAULT;

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
	 * The default value of the '{@link #getDataStyleName() <em>Data Style Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataStyleName()
	 * @generated
	 * @ordered
	 */
	protected static final String DATA_STYLE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDataStyleName() <em>Data Style Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataStyleName()
	 * @generated
	 * @ordered
	 */
	protected String dataStyleName = DATA_STYLE_NAME_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TextDatabaseDisplayAttlistImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TextPackage.eINSTANCE.getTextDatabaseDisplayAttlist();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, TextPackage.TEXT_DATABASE_DISPLAY_ATTLIST__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionResourceType getConnectionResource() {
		return (ConnectionResourceType)getMixed().get(TextPackage.eINSTANCE.getTextDatabaseDisplayAttlist_ConnectionResource(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConnectionResource(ConnectionResourceType newConnectionResource, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TextPackage.eINSTANCE.getTextDatabaseDisplayAttlist_ConnectionResource(), newConnectionResource, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnectionResource(ConnectionResourceType newConnectionResource) {
		((FeatureMap.Internal)getMixed()).set(TextPackage.eINSTANCE.getTextDatabaseDisplayAttlist_ConnectionResource(), newConnectionResource);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getColumnName() {
		return columnName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColumnName(String newColumnName) {
		String oldColumnName = columnName;
		columnName = newColumnName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.TEXT_DATABASE_DISPLAY_ATTLIST__COLUMN_NAME, oldColumnName, columnName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.TEXT_DATABASE_DISPLAY_ATTLIST__DATABASE_NAME, oldDatabaseName, databaseName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDataStyleName() {
		return dataStyleName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataStyleName(String newDataStyleName) {
		String oldDataStyleName = dataStyleName;
		dataStyleName = newDataStyleName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.TEXT_DATABASE_DISPLAY_ATTLIST__DATA_STYLE_NAME, oldDataStyleName, dataStyleName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.TEXT_DATABASE_DISPLAY_ATTLIST__TABLE_NAME, oldTableName, tableName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.TEXT_DATABASE_DISPLAY_ATTLIST__TABLE_TYPE, oldTableType, tableType, !oldTableTypeESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, TextPackage.TEXT_DATABASE_DISPLAY_ATTLIST__TABLE_TYPE, oldTableType, TABLE_TYPE_EDEFAULT, oldTableTypeESet));
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
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TextPackage.TEXT_DATABASE_DISPLAY_ATTLIST__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case TextPackage.TEXT_DATABASE_DISPLAY_ATTLIST__CONNECTION_RESOURCE:
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
			case TextPackage.TEXT_DATABASE_DISPLAY_ATTLIST__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case TextPackage.TEXT_DATABASE_DISPLAY_ATTLIST__CONNECTION_RESOURCE:
				return getConnectionResource();
			case TextPackage.TEXT_DATABASE_DISPLAY_ATTLIST__COLUMN_NAME:
				return getColumnName();
			case TextPackage.TEXT_DATABASE_DISPLAY_ATTLIST__DATABASE_NAME:
				return getDatabaseName();
			case TextPackage.TEXT_DATABASE_DISPLAY_ATTLIST__DATA_STYLE_NAME:
				return getDataStyleName();
			case TextPackage.TEXT_DATABASE_DISPLAY_ATTLIST__TABLE_NAME:
				return getTableName();
			case TextPackage.TEXT_DATABASE_DISPLAY_ATTLIST__TABLE_TYPE:
				return getTableType();
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
			case TextPackage.TEXT_DATABASE_DISPLAY_ATTLIST__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case TextPackage.TEXT_DATABASE_DISPLAY_ATTLIST__CONNECTION_RESOURCE:
				setConnectionResource((ConnectionResourceType)newValue);
				return;
			case TextPackage.TEXT_DATABASE_DISPLAY_ATTLIST__COLUMN_NAME:
				setColumnName((String)newValue);
				return;
			case TextPackage.TEXT_DATABASE_DISPLAY_ATTLIST__DATABASE_NAME:
				setDatabaseName((String)newValue);
				return;
			case TextPackage.TEXT_DATABASE_DISPLAY_ATTLIST__DATA_STYLE_NAME:
				setDataStyleName((String)newValue);
				return;
			case TextPackage.TEXT_DATABASE_DISPLAY_ATTLIST__TABLE_NAME:
				setTableName((String)newValue);
				return;
			case TextPackage.TEXT_DATABASE_DISPLAY_ATTLIST__TABLE_TYPE:
				setTableType((TableTypeType)newValue);
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
			case TextPackage.TEXT_DATABASE_DISPLAY_ATTLIST__MIXED:
				getMixed().clear();
				return;
			case TextPackage.TEXT_DATABASE_DISPLAY_ATTLIST__CONNECTION_RESOURCE:
				setConnectionResource((ConnectionResourceType)null);
				return;
			case TextPackage.TEXT_DATABASE_DISPLAY_ATTLIST__COLUMN_NAME:
				setColumnName(COLUMN_NAME_EDEFAULT);
				return;
			case TextPackage.TEXT_DATABASE_DISPLAY_ATTLIST__DATABASE_NAME:
				setDatabaseName(DATABASE_NAME_EDEFAULT);
				return;
			case TextPackage.TEXT_DATABASE_DISPLAY_ATTLIST__DATA_STYLE_NAME:
				setDataStyleName(DATA_STYLE_NAME_EDEFAULT);
				return;
			case TextPackage.TEXT_DATABASE_DISPLAY_ATTLIST__TABLE_NAME:
				setTableName(TABLE_NAME_EDEFAULT);
				return;
			case TextPackage.TEXT_DATABASE_DISPLAY_ATTLIST__TABLE_TYPE:
				unsetTableType();
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
			case TextPackage.TEXT_DATABASE_DISPLAY_ATTLIST__MIXED:
				return mixed != null && !mixed.isEmpty();
			case TextPackage.TEXT_DATABASE_DISPLAY_ATTLIST__CONNECTION_RESOURCE:
				return getConnectionResource() != null;
			case TextPackage.TEXT_DATABASE_DISPLAY_ATTLIST__COLUMN_NAME:
				return COLUMN_NAME_EDEFAULT == null ? columnName != null : !COLUMN_NAME_EDEFAULT.equals(columnName);
			case TextPackage.TEXT_DATABASE_DISPLAY_ATTLIST__DATABASE_NAME:
				return DATABASE_NAME_EDEFAULT == null ? databaseName != null : !DATABASE_NAME_EDEFAULT.equals(databaseName);
			case TextPackage.TEXT_DATABASE_DISPLAY_ATTLIST__DATA_STYLE_NAME:
				return DATA_STYLE_NAME_EDEFAULT == null ? dataStyleName != null : !DATA_STYLE_NAME_EDEFAULT.equals(dataStyleName);
			case TextPackage.TEXT_DATABASE_DISPLAY_ATTLIST__TABLE_NAME:
				return TABLE_NAME_EDEFAULT == null ? tableName != null : !TABLE_NAME_EDEFAULT.equals(tableName);
			case TextPackage.TEXT_DATABASE_DISPLAY_ATTLIST__TABLE_TYPE:
				return isSetTableType();
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
		result.append(", columnName: ");
		result.append(columnName);
		result.append(", databaseName: ");
		result.append(databaseName);
		result.append(", dataStyleName: ");
		result.append(dataStyleName);
		result.append(", tableName: ");
		result.append(tableName);
		result.append(", tableType: ");
		if (tableTypeESet) result.append(tableType); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TextDatabaseDisplayAttlistImpl
