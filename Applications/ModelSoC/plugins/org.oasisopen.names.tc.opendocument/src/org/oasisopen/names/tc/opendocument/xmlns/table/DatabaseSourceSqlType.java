/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.table;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Database Source Sql Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DatabaseSourceSqlType#getDatabaseName <em>Database Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DatabaseSourceSqlType#getParseSqlStatement <em>Parse Sql Statement</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DatabaseSourceSqlType#getSqlStatement <em>Sql Statement</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDatabaseSourceSqlType()
 * @model extendedMetaData="name='database-source-sql_._type' kind='empty'"
 * @generated
 */
public interface DatabaseSourceSqlType extends EObject {
	/**
	 * Returns the value of the '<em><b>Database Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Database Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Database Name</em>' attribute.
	 * @see #setDatabaseName(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDatabaseSourceSqlType_DatabaseName()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String" required="true"
	 *        extendedMetaData="kind='attribute' name='database-name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDatabaseName();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DatabaseSourceSqlType#getDatabaseName <em>Database Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Database Name</em>' attribute.
	 * @see #getDatabaseName()
	 * @generated
	 */
	void setDatabaseName(String value);

	/**
	 * Returns the value of the '<em><b>Parse Sql Statement</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parse Sql Statement</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parse Sql Statement</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetParseSqlStatement()
	 * @see #unsetParseSqlStatement()
	 * @see #setParseSqlStatement(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDatabaseSourceSqlType_ParseSqlStatement()
	 * @model default="false" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='parse-sql-statement' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getParseSqlStatement();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DatabaseSourceSqlType#getParseSqlStatement <em>Parse Sql Statement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parse Sql Statement</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetParseSqlStatement()
	 * @see #unsetParseSqlStatement()
	 * @see #getParseSqlStatement()
	 * @generated
	 */
	void setParseSqlStatement(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DatabaseSourceSqlType#getParseSqlStatement <em>Parse Sql Statement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetParseSqlStatement()
	 * @see #getParseSqlStatement()
	 * @see #setParseSqlStatement(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetParseSqlStatement();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DatabaseSourceSqlType#getParseSqlStatement <em>Parse Sql Statement</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Parse Sql Statement</em>' attribute is set.
	 * @see #unsetParseSqlStatement()
	 * @see #getParseSqlStatement()
	 * @see #setParseSqlStatement(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetParseSqlStatement();

	/**
	 * Returns the value of the '<em><b>Sql Statement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sql Statement</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sql Statement</em>' attribute.
	 * @see #setSqlStatement(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDatabaseSourceSqlType_SqlStatement()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String" required="true"
	 *        extendedMetaData="kind='attribute' name='sql-statement' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSqlStatement();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DatabaseSourceSqlType#getSqlStatement <em>Sql Statement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sql Statement</em>' attribute.
	 * @see #getSqlStatement()
	 * @generated
	 */
	void setSqlStatement(String value);

} // DatabaseSourceSqlType
