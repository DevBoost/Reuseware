/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.text;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.oasisopen.names.tc.opendocument.xmlns.form.ConnectionResourceType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Database Row Number Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.DatabaseRowNumberType#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.DatabaseRowNumberType#getConnectionResource <em>Connection Resource</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.DatabaseRowNumberType#getDatabaseName <em>Database Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.DatabaseRowNumberType#getNumFormat <em>Num Format</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.DatabaseRowNumberType#getNumLetterSync <em>Num Letter Sync</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.DatabaseRowNumberType#getTableName <em>Table Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.DatabaseRowNumberType#getTableType <em>Table Type</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.DatabaseRowNumberType#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getDatabaseRowNumberType()
 * @model extendedMetaData="name='database-row-number_._type' kind='mixed'"
 * @generated
 */
public interface DatabaseRowNumberType extends EObject {
	/**
	 * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mixed</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mixed</em>' attribute list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getDatabaseRowNumberType_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':mixed'"
	 * @generated
	 */
	FeatureMap getMixed();

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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getDatabaseRowNumberType_ConnectionResource()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='connection-resource' namespace='urn:oasis:names:tc:opendocument:xmlns:form:1.0'"
	 * @generated
	 */
	ConnectionResourceType getConnectionResource();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.DatabaseRowNumberType#getConnectionResource <em>Connection Resource</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connection Resource</em>' containment reference.
	 * @see #getConnectionResource()
	 * @generated
	 */
	void setConnectionResource(ConnectionResourceType value);

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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getDatabaseRowNumberType_DatabaseName()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='database-name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDatabaseName();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.DatabaseRowNumberType#getDatabaseName <em>Database Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Database Name</em>' attribute.
	 * @see #getDatabaseName()
	 * @generated
	 */
	void setDatabaseName(String value);

	/**
	 * Returns the value of the '<em><b>Num Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Num Format</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Num Format</em>' attribute.
	 * @see #setNumFormat(Object)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getDatabaseRowNumberType_NumFormat()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.style.NumFormatType"
	 *        extendedMetaData="kind='attribute' name='num-format' namespace='urn:oasis:names:tc:opendocument:xmlns:style:1.0'"
	 * @generated
	 */
	Object getNumFormat();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.DatabaseRowNumberType#getNumFormat <em>Num Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num Format</em>' attribute.
	 * @see #getNumFormat()
	 * @generated
	 */
	void setNumFormat(Object value);

	/**
	 * Returns the value of the '<em><b>Num Letter Sync</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Num Letter Sync</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Num Letter Sync</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetNumLetterSync()
	 * @see #unsetNumLetterSync()
	 * @see #setNumLetterSync(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getDatabaseRowNumberType_NumLetterSync()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='num-letter-sync' namespace='urn:oasis:names:tc:opendocument:xmlns:style:1.0'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getNumLetterSync();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.DatabaseRowNumberType#getNumLetterSync <em>Num Letter Sync</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num Letter Sync</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetNumLetterSync()
	 * @see #unsetNumLetterSync()
	 * @see #getNumLetterSync()
	 * @generated
	 */
	void setNumLetterSync(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.DatabaseRowNumberType#getNumLetterSync <em>Num Letter Sync</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNumLetterSync()
	 * @see #getNumLetterSync()
	 * @see #setNumLetterSync(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetNumLetterSync();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.DatabaseRowNumberType#getNumLetterSync <em>Num Letter Sync</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Num Letter Sync</em>' attribute is set.
	 * @see #unsetNumLetterSync()
	 * @see #getNumLetterSync()
	 * @see #setNumLetterSync(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetNumLetterSync();

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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getDatabaseRowNumberType_TableName()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String" required="true"
	 *        extendedMetaData="kind='attribute' name='table-name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getTableName();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.DatabaseRowNumberType#getTableName <em>Table Name</em>}' attribute.
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getDatabaseRowNumberType_TableType()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='table-type' namespace='##targetNamespace'"
	 * @generated
	 */
	TableTypeType getTableType();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.DatabaseRowNumberType#getTableType <em>Table Type</em>}' attribute.
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
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.DatabaseRowNumberType#getTableType <em>Table Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTableType()
	 * @see #getTableType()
	 * @see #setTableType(TableTypeType)
	 * @generated
	 */
	void unsetTableType();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.DatabaseRowNumberType#getTableType <em>Table Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Table Type</em>' attribute is set.
	 * @see #unsetTableType()
	 * @see #getTableType()
	 * @see #setTableType(TableTypeType)
	 * @generated
	 */
	boolean isSetTableType();

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(BigInteger)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getDatabaseRowNumberType_Value()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.NonNegativeInteger"
	 *        extendedMetaData="kind='attribute' name='value' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getValue();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.DatabaseRowNumberType#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(BigInteger value);

} // DatabaseRowNumberType
