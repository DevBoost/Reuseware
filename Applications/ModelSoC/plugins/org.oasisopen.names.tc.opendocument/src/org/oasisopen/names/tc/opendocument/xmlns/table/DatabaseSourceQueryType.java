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
 * A representation of the model object '<em><b>Database Source Query Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DatabaseSourceQueryType#getDatabaseName <em>Database Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DatabaseSourceQueryType#getQueryName <em>Query Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDatabaseSourceQueryType()
 * @model extendedMetaData="name='database-source-query_._type' kind='empty'"
 * @generated
 */
public interface DatabaseSourceQueryType extends EObject {
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDatabaseSourceQueryType_DatabaseName()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String" required="true"
	 *        extendedMetaData="kind='attribute' name='database-name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDatabaseName();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DatabaseSourceQueryType#getDatabaseName <em>Database Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Database Name</em>' attribute.
	 * @see #getDatabaseName()
	 * @generated
	 */
	void setDatabaseName(String value);

	/**
	 * Returns the value of the '<em><b>Query Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Query Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Query Name</em>' attribute.
	 * @see #setQueryName(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDatabaseSourceQueryType_QueryName()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String" required="true"
	 *        extendedMetaData="kind='attribute' name='query-name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getQueryName();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DatabaseSourceQueryType#getQueryName <em>Query Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Query Name</em>' attribute.
	 * @see #getQueryName()
	 * @generated
	 */
	void setQueryName(String value);

} // DatabaseSourceQueryType
