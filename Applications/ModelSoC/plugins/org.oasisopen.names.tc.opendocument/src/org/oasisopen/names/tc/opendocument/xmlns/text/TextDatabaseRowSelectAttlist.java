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
package org.oasisopen.names.tc.opendocument.xmlns.text;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;
import org.oasisopen.names.tc.opendocument.xmlns.form.ConnectionResourceType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Database Row Select Attlist</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.TextDatabaseRowSelectAttlist#getConnectionResource <em>Connection Resource</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.TextDatabaseRowSelectAttlist#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.TextDatabaseRowSelectAttlist#getDatabaseName <em>Database Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.TextDatabaseRowSelectAttlist#getRowNumber <em>Row Number</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.TextDatabaseRowSelectAttlist#getTableName <em>Table Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.TextDatabaseRowSelectAttlist#getTableType <em>Table Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getTextDatabaseRowSelectAttlist()
 * @model extendedMetaData="name='text-database-row-select-attlist' kind='elementOnly'"
 * @generated
 */
public interface TextDatabaseRowSelectAttlist extends EObject {
	/**
	 * Returns the value of the '<em><b>Connection Resource</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connection Resource</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connection Resource</em>' containment reference.
	 * @see #setConnectionResource(ConnectionResourceType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getTextDatabaseRowSelectAttlist_ConnectionResource()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='connection-resource' namespace='urn:oasis:names:tc:opendocument:xmlns:form:1.0'"
	 * @generated
	 */
	ConnectionResourceType getConnectionResource();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.TextDatabaseRowSelectAttlist#getConnectionResource <em>Connection Resource</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connection Resource</em>' containment reference.
	 * @see #getConnectionResource()
	 * @generated
	 */
	void setConnectionResource(ConnectionResourceType value);

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' attribute.
	 * @see #setCondition(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getTextDatabaseRowSelectAttlist_Condition()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Formula"
	 *        extendedMetaData="kind='attribute' name='condition' namespace='##targetNamespace'"
	 * @generated
	 */
	String getCondition();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.TextDatabaseRowSelectAttlist#getCondition <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' attribute.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(String value);

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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getTextDatabaseRowSelectAttlist_DatabaseName()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='database-name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDatabaseName();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.TextDatabaseRowSelectAttlist#getDatabaseName <em>Database Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Database Name</em>' attribute.
	 * @see #getDatabaseName()
	 * @generated
	 */
	void setDatabaseName(String value);

	/**
	 * Returns the value of the '<em><b>Row Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Row Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Row Number</em>' attribute.
	 * @see #setRowNumber(BigInteger)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getTextDatabaseRowSelectAttlist_RowNumber()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.NonNegativeInteger"
	 *        extendedMetaData="kind='attribute' name='row-number' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getRowNumber();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.TextDatabaseRowSelectAttlist#getRowNumber <em>Row Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Row Number</em>' attribute.
	 * @see #getRowNumber()
	 * @generated
	 */
	void setRowNumber(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Table Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table Name</em>' attribute.
	 * @see #setTableName(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getTextDatabaseRowSelectAttlist_TableName()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String" required="true"
	 *        extendedMetaData="kind='attribute' name='table-name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getTableName();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.TextDatabaseRowSelectAttlist#getTableName <em>Table Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table Name</em>' attribute.
	 * @see #getTableName()
	 * @generated
	 */
	void setTableName(String value);

	/**
	 * Returns the value of the '<em><b>Table Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.TableTypeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table Type</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TableTypeType
	 * @see #isSetTableType()
	 * @see #unsetTableType()
	 * @see #setTableType(TableTypeType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getTextDatabaseRowSelectAttlist_TableType()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='table-type' namespace='##targetNamespace'"
	 * @generated
	 */
	TableTypeType getTableType();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.TextDatabaseRowSelectAttlist#getTableType <em>Table Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table Type</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TableTypeType
	 * @see #isSetTableType()
	 * @see #unsetTableType()
	 * @see #getTableType()
	 * @generated
	 */
	void setTableType(TableTypeType value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.TextDatabaseRowSelectAttlist#getTableType <em>Table Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTableType()
	 * @see #getTableType()
	 * @see #setTableType(TableTypeType)
	 * @generated
	 */
	void unsetTableType();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.TextDatabaseRowSelectAttlist#getTableType <em>Table Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Table Type</em>' attribute is set.
	 * @see #unsetTableType()
	 * @see #getTableType()
	 * @see #setTableType(TableTypeType)
	 * @generated
	 */
	boolean isSetTableType();

} // TextDatabaseRowSelectAttlist
