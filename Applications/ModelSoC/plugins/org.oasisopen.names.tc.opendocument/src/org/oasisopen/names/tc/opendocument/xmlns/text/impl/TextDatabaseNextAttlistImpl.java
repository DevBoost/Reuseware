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
import org.oasisopen.names.tc.opendocument.xmlns.form.ConnectionResourceType;
import org.oasisopen.names.tc.opendocument.xmlns.text.TableTypeType;
import org.oasisopen.names.tc.opendocument.xmlns.text.TextDatabaseNextAttlist;
import org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Database Next Attlist</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.TextDatabaseNextAttlistImpl#getConnectionResource <em>Connection Resource</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.TextDatabaseNextAttlistImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.TextDatabaseNextAttlistImpl#getDatabaseName <em>Database Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.TextDatabaseNextAttlistImpl#getTableName <em>Table Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.TextDatabaseNextAttlistImpl#getTableType <em>Table Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TextDatabaseNextAttlistImpl extends EObjectImpl implements TextDatabaseNextAttlist {
	/**
	 * The cached value of the '{@link #getConnectionResource() <em>Connection Resource</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectionResource()
	 * @generated
	 * @ordered
	 */
	protected ConnectionResourceType connectionResource;

	/**
	 * The default value of the '{@link #getCondition() <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected static final String CONDITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected String condition = CONDITION_EDEFAULT;

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
	protected TextDatabaseNextAttlistImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TextPackage.eINSTANCE.getTextDatabaseNextAttlist();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionResourceType getConnectionResource() {
		return connectionResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConnectionResource(ConnectionResourceType newConnectionResource, NotificationChain msgs) {
		ConnectionResourceType oldConnectionResource = connectionResource;
		connectionResource = newConnectionResource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TextPackage.TEXT_DATABASE_NEXT_ATTLIST__CONNECTION_RESOURCE, oldConnectionResource, newConnectionResource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnectionResource(ConnectionResourceType newConnectionResource) {
		if (newConnectionResource != connectionResource) {
			NotificationChain msgs = null;
			if (connectionResource != null)
				msgs = ((InternalEObject)connectionResource).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TextPackage.TEXT_DATABASE_NEXT_ATTLIST__CONNECTION_RESOURCE, null, msgs);
			if (newConnectionResource != null)
				msgs = ((InternalEObject)newConnectionResource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TextPackage.TEXT_DATABASE_NEXT_ATTLIST__CONNECTION_RESOURCE, null, msgs);
			msgs = basicSetConnectionResource(newConnectionResource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.TEXT_DATABASE_NEXT_ATTLIST__CONNECTION_RESOURCE, newConnectionResource, newConnectionResource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCondition() {
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCondition(String newCondition) {
		String oldCondition = condition;
		condition = newCondition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.TEXT_DATABASE_NEXT_ATTLIST__CONDITION, oldCondition, condition));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.TEXT_DATABASE_NEXT_ATTLIST__DATABASE_NAME, oldDatabaseName, databaseName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.TEXT_DATABASE_NEXT_ATTLIST__TABLE_NAME, oldTableName, tableName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.TEXT_DATABASE_NEXT_ATTLIST__TABLE_TYPE, oldTableType, tableType, !oldTableTypeESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, TextPackage.TEXT_DATABASE_NEXT_ATTLIST__TABLE_TYPE, oldTableType, TABLE_TYPE_EDEFAULT, oldTableTypeESet));
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
			case TextPackage.TEXT_DATABASE_NEXT_ATTLIST__CONNECTION_RESOURCE:
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
			case TextPackage.TEXT_DATABASE_NEXT_ATTLIST__CONNECTION_RESOURCE:
				return getConnectionResource();
			case TextPackage.TEXT_DATABASE_NEXT_ATTLIST__CONDITION:
				return getCondition();
			case TextPackage.TEXT_DATABASE_NEXT_ATTLIST__DATABASE_NAME:
				return getDatabaseName();
			case TextPackage.TEXT_DATABASE_NEXT_ATTLIST__TABLE_NAME:
				return getTableName();
			case TextPackage.TEXT_DATABASE_NEXT_ATTLIST__TABLE_TYPE:
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
			case TextPackage.TEXT_DATABASE_NEXT_ATTLIST__CONNECTION_RESOURCE:
				setConnectionResource((ConnectionResourceType)newValue);
				return;
			case TextPackage.TEXT_DATABASE_NEXT_ATTLIST__CONDITION:
				setCondition((String)newValue);
				return;
			case TextPackage.TEXT_DATABASE_NEXT_ATTLIST__DATABASE_NAME:
				setDatabaseName((String)newValue);
				return;
			case TextPackage.TEXT_DATABASE_NEXT_ATTLIST__TABLE_NAME:
				setTableName((String)newValue);
				return;
			case TextPackage.TEXT_DATABASE_NEXT_ATTLIST__TABLE_TYPE:
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
			case TextPackage.TEXT_DATABASE_NEXT_ATTLIST__CONNECTION_RESOURCE:
				setConnectionResource((ConnectionResourceType)null);
				return;
			case TextPackage.TEXT_DATABASE_NEXT_ATTLIST__CONDITION:
				setCondition(CONDITION_EDEFAULT);
				return;
			case TextPackage.TEXT_DATABASE_NEXT_ATTLIST__DATABASE_NAME:
				setDatabaseName(DATABASE_NAME_EDEFAULT);
				return;
			case TextPackage.TEXT_DATABASE_NEXT_ATTLIST__TABLE_NAME:
				setTableName(TABLE_NAME_EDEFAULT);
				return;
			case TextPackage.TEXT_DATABASE_NEXT_ATTLIST__TABLE_TYPE:
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
			case TextPackage.TEXT_DATABASE_NEXT_ATTLIST__CONNECTION_RESOURCE:
				return connectionResource != null;
			case TextPackage.TEXT_DATABASE_NEXT_ATTLIST__CONDITION:
				return CONDITION_EDEFAULT == null ? condition != null : !CONDITION_EDEFAULT.equals(condition);
			case TextPackage.TEXT_DATABASE_NEXT_ATTLIST__DATABASE_NAME:
				return DATABASE_NAME_EDEFAULT == null ? databaseName != null : !DATABASE_NAME_EDEFAULT.equals(databaseName);
			case TextPackage.TEXT_DATABASE_NEXT_ATTLIST__TABLE_NAME:
				return TABLE_NAME_EDEFAULT == null ? tableName != null : !TABLE_NAME_EDEFAULT.equals(tableName);
			case TextPackage.TEXT_DATABASE_NEXT_ATTLIST__TABLE_TYPE:
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
		result.append(" (condition: ");
		result.append(condition);
		result.append(", databaseName: ");
		result.append(databaseName);
		result.append(", tableName: ");
		result.append(tableName);
		result.append(", tableType: ");
		if (tableTypeESet) result.append(tableType); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TextDatabaseNextAttlistImpl
