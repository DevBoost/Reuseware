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
 * A representation of the model object '<em><b>Database Source Table Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DatabaseSourceTableType#getDatabaseName <em>Database Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DatabaseSourceTableType#getDatabaseTableName <em>Database Table Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDatabaseSourceTableType()
 * @model extendedMetaData="name='database-source-table_._type' kind='empty'"
 * @generated
 */
public interface DatabaseSourceTableType extends EObject {
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDatabaseSourceTableType_DatabaseName()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String" required="true"
	 *        extendedMetaData="kind='attribute' name='database-name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDatabaseName();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DatabaseSourceTableType#getDatabaseName <em>Database Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Database Name</em>' attribute.
	 * @see #getDatabaseName()
	 * @generated
	 */
	void setDatabaseName(String value);

	/**
	 * Returns the value of the '<em><b>Database Table Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Database Table Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Database Table Name</em>' attribute.
	 * @see #setDatabaseTableName(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDatabaseSourceTableType_DatabaseTableName()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String" required="true"
	 *        extendedMetaData="kind='attribute' name='database-table-name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDatabaseTableName();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DatabaseSourceTableType#getDatabaseTableName <em>Database Table Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Database Table Name</em>' attribute.
	 * @see #getDatabaseTableName()
	 * @generated
	 */
	void setDatabaseTableName(String value);

} // DatabaseSourceTableType
