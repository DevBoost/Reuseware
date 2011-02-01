/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.table.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.oasisopen.names.tc.opendocument.xmlns.table.DatabaseSourceTableType;
import org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Database Source Table Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DatabaseSourceTableTypeImpl#getDatabaseName <em>Database Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DatabaseSourceTableTypeImpl#getDatabaseTableName <em>Database Table Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DatabaseSourceTableTypeImpl extends EObjectImpl implements DatabaseSourceTableType {
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
	 * The default value of the '{@link #getDatabaseTableName() <em>Database Table Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatabaseTableName()
	 * @generated
	 * @ordered
	 */
	protected static final String DATABASE_TABLE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDatabaseTableName() <em>Database Table Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatabaseTableName()
	 * @generated
	 * @ordered
	 */
	protected String databaseTableName = DATABASE_TABLE_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DatabaseSourceTableTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TablePackage.eINSTANCE.getDatabaseSourceTableType();
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
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DATABASE_SOURCE_TABLE_TYPE__DATABASE_NAME, oldDatabaseName, databaseName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDatabaseTableName() {
		return databaseTableName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatabaseTableName(String newDatabaseTableName) {
		String oldDatabaseTableName = databaseTableName;
		databaseTableName = newDatabaseTableName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DATABASE_SOURCE_TABLE_TYPE__DATABASE_TABLE_NAME, oldDatabaseTableName, databaseTableName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TablePackage.DATABASE_SOURCE_TABLE_TYPE__DATABASE_NAME:
				return getDatabaseName();
			case TablePackage.DATABASE_SOURCE_TABLE_TYPE__DATABASE_TABLE_NAME:
				return getDatabaseTableName();
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
			case TablePackage.DATABASE_SOURCE_TABLE_TYPE__DATABASE_NAME:
				setDatabaseName((String)newValue);
				return;
			case TablePackage.DATABASE_SOURCE_TABLE_TYPE__DATABASE_TABLE_NAME:
				setDatabaseTableName((String)newValue);
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
			case TablePackage.DATABASE_SOURCE_TABLE_TYPE__DATABASE_NAME:
				setDatabaseName(DATABASE_NAME_EDEFAULT);
				return;
			case TablePackage.DATABASE_SOURCE_TABLE_TYPE__DATABASE_TABLE_NAME:
				setDatabaseTableName(DATABASE_TABLE_NAME_EDEFAULT);
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
			case TablePackage.DATABASE_SOURCE_TABLE_TYPE__DATABASE_NAME:
				return DATABASE_NAME_EDEFAULT == null ? databaseName != null : !DATABASE_NAME_EDEFAULT.equals(databaseName);
			case TablePackage.DATABASE_SOURCE_TABLE_TYPE__DATABASE_TABLE_NAME:
				return DATABASE_TABLE_NAME_EDEFAULT == null ? databaseTableName != null : !DATABASE_TABLE_NAME_EDEFAULT.equals(databaseTableName);
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
		result.append(" (databaseName: ");
		result.append(databaseName);
		result.append(", databaseTableName: ");
		result.append(databaseTableName);
		result.append(')');
		return result.toString();
	}

} //DatabaseSourceTableTypeImpl
