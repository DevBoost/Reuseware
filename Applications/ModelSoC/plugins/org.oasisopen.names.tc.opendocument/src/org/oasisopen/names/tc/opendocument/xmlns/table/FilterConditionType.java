/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.table;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Filter Condition Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.FilterConditionType#getCaseSensitive <em>Case Sensitive</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.FilterConditionType#getDataType <em>Data Type</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.FilterConditionType#getFieldNumber <em>Field Number</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.FilterConditionType#getOperator <em>Operator</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.FilterConditionType#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getFilterConditionType()
 * @model extendedMetaData="name='filter-condition_._type' kind='empty'"
 * @generated
 */
public interface FilterConditionType extends EObject {
	/**
	 * Returns the value of the '<em><b>Case Sensitive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Case Sensitive</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Case Sensitive</em>' attribute.
	 * @see #setCaseSensitive(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getFilterConditionType_CaseSensitive()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String" required="true"
	 *        extendedMetaData="kind='attribute' name='case-sensitive' namespace='##targetNamespace'"
	 * @generated
	 */
	String getCaseSensitive();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.FilterConditionType#getCaseSensitive <em>Case Sensitive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Case Sensitive</em>' attribute.
	 * @see #getCaseSensitive()
	 * @generated
	 */
	void setCaseSensitive(String value);

	/**
	 * Returns the value of the '<em><b>Data Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.table.DataTypeType1}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Type</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DataTypeType1
	 * @see #isSetDataType()
	 * @see #unsetDataType()
	 * @see #setDataType(DataTypeType1)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getFilterConditionType_DataType()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='data-type' namespace='##targetNamespace'"
	 * @generated
	 */
	DataTypeType1 getDataType();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.FilterConditionType#getDataType <em>Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Type</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DataTypeType1
	 * @see #isSetDataType()
	 * @see #unsetDataType()
	 * @see #getDataType()
	 * @generated
	 */
	void setDataType(DataTypeType1 value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.FilterConditionType#getDataType <em>Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDataType()
	 * @see #getDataType()
	 * @see #setDataType(DataTypeType1)
	 * @generated
	 */
	void unsetDataType();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.FilterConditionType#getDataType <em>Data Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Data Type</em>' attribute is set.
	 * @see #unsetDataType()
	 * @see #getDataType()
	 * @see #setDataType(DataTypeType1)
	 * @generated
	 */
	boolean isSetDataType();

	/**
	 * Returns the value of the '<em><b>Field Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Field Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Field Number</em>' attribute.
	 * @see #setFieldNumber(BigInteger)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getFilterConditionType_FieldNumber()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.NonNegativeInteger" required="true"
	 *        extendedMetaData="kind='attribute' name='field-number' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getFieldNumber();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.FilterConditionType#getFieldNumber <em>Field Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Field Number</em>' attribute.
	 * @see #getFieldNumber()
	 * @generated
	 */
	void setFieldNumber(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see #setOperator(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getFilterConditionType_Operator()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String" required="true"
	 *        extendedMetaData="kind='attribute' name='operator' namespace='##targetNamespace'"
	 * @generated
	 */
	String getOperator();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.FilterConditionType#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getFilterConditionType_Value()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String" required="true"
	 *        extendedMetaData="kind='attribute' name='value' namespace='##targetNamespace'"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.FilterConditionType#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // FilterConditionType
