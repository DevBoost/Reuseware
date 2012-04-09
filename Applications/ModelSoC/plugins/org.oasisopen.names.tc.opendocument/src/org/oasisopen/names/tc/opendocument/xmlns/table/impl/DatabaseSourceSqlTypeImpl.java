/*******************************************************************************
 * Copyright (c) 2006-2012
 * Software Technology Group, Dresden University of Technology
 * DevBoost GmbH, Berlin, Amtsgericht Charlottenburg, HRB 140026
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *   Software Technology Group - TU Dresden, Germany;
 *   DevBoost GmbH - Berlin, Germany
 *      - initial API and implementation
 ******************************************************************************/
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
import org.oasisopen.names.tc.opendocument.xmlns.table.DatabaseSourceSqlType;
import org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Database Source Sql Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DatabaseSourceSqlTypeImpl#getDatabaseName <em>Database Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DatabaseSourceSqlTypeImpl#getParseSqlStatement <em>Parse Sql Statement</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DatabaseSourceSqlTypeImpl#getSqlStatement <em>Sql Statement</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DatabaseSourceSqlTypeImpl extends EObjectImpl implements DatabaseSourceSqlType {
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
	 * The default value of the '{@link #getParseSqlStatement() <em>Parse Sql Statement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParseSqlStatement()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean PARSE_SQL_STATEMENT_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getParseSqlStatement() <em>Parse Sql Statement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParseSqlStatement()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean parseSqlStatement = PARSE_SQL_STATEMENT_EDEFAULT;

	/**
	 * This is true if the Parse Sql Statement attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean parseSqlStatementESet;

	/**
	 * The default value of the '{@link #getSqlStatement() <em>Sql Statement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSqlStatement()
	 * @generated
	 * @ordered
	 */
	protected static final String SQL_STATEMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSqlStatement() <em>Sql Statement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSqlStatement()
	 * @generated
	 * @ordered
	 */
	protected String sqlStatement = SQL_STATEMENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DatabaseSourceSqlTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TablePackage.eINSTANCE.getDatabaseSourceSqlType();
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
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DATABASE_SOURCE_SQL_TYPE__DATABASE_NAME, oldDatabaseName, databaseName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getParseSqlStatement() {
		return parseSqlStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParseSqlStatement(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newParseSqlStatement) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldParseSqlStatement = parseSqlStatement;
		parseSqlStatement = newParseSqlStatement == null ? PARSE_SQL_STATEMENT_EDEFAULT : newParseSqlStatement;
		boolean oldParseSqlStatementESet = parseSqlStatementESet;
		parseSqlStatementESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DATABASE_SOURCE_SQL_TYPE__PARSE_SQL_STATEMENT, oldParseSqlStatement, parseSqlStatement, !oldParseSqlStatementESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetParseSqlStatement() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldParseSqlStatement = parseSqlStatement;
		boolean oldParseSqlStatementESet = parseSqlStatementESet;
		parseSqlStatement = PARSE_SQL_STATEMENT_EDEFAULT;
		parseSqlStatementESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TablePackage.DATABASE_SOURCE_SQL_TYPE__PARSE_SQL_STATEMENT, oldParseSqlStatement, PARSE_SQL_STATEMENT_EDEFAULT, oldParseSqlStatementESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetParseSqlStatement() {
		return parseSqlStatementESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSqlStatement() {
		return sqlStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSqlStatement(String newSqlStatement) {
		String oldSqlStatement = sqlStatement;
		sqlStatement = newSqlStatement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DATABASE_SOURCE_SQL_TYPE__SQL_STATEMENT, oldSqlStatement, sqlStatement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TablePackage.DATABASE_SOURCE_SQL_TYPE__DATABASE_NAME:
				return getDatabaseName();
			case TablePackage.DATABASE_SOURCE_SQL_TYPE__PARSE_SQL_STATEMENT:
				return getParseSqlStatement();
			case TablePackage.DATABASE_SOURCE_SQL_TYPE__SQL_STATEMENT:
				return getSqlStatement();
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
			case TablePackage.DATABASE_SOURCE_SQL_TYPE__DATABASE_NAME:
				setDatabaseName((String)newValue);
				return;
			case TablePackage.DATABASE_SOURCE_SQL_TYPE__PARSE_SQL_STATEMENT:
				setParseSqlStatement((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case TablePackage.DATABASE_SOURCE_SQL_TYPE__SQL_STATEMENT:
				setSqlStatement((String)newValue);
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
			case TablePackage.DATABASE_SOURCE_SQL_TYPE__DATABASE_NAME:
				setDatabaseName(DATABASE_NAME_EDEFAULT);
				return;
			case TablePackage.DATABASE_SOURCE_SQL_TYPE__PARSE_SQL_STATEMENT:
				unsetParseSqlStatement();
				return;
			case TablePackage.DATABASE_SOURCE_SQL_TYPE__SQL_STATEMENT:
				setSqlStatement(SQL_STATEMENT_EDEFAULT);
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
			case TablePackage.DATABASE_SOURCE_SQL_TYPE__DATABASE_NAME:
				return DATABASE_NAME_EDEFAULT == null ? databaseName != null : !DATABASE_NAME_EDEFAULT.equals(databaseName);
			case TablePackage.DATABASE_SOURCE_SQL_TYPE__PARSE_SQL_STATEMENT:
				return isSetParseSqlStatement();
			case TablePackage.DATABASE_SOURCE_SQL_TYPE__SQL_STATEMENT:
				return SQL_STATEMENT_EDEFAULT == null ? sqlStatement != null : !SQL_STATEMENT_EDEFAULT.equals(sqlStatement);
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
		result.append(", parseSqlStatement: ");
		if (parseSqlStatementESet) result.append(parseSqlStatement); else result.append("<unset>");
		result.append(", sqlStatement: ");
		result.append(sqlStatement);
		result.append(')');
		return result.toString();
	}

} //DatabaseSourceSqlTypeImpl
