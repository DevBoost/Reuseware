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
 * A representation of the model object '<em><b>Sort By Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.SortByType#getDataType <em>Data Type</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.SortByType#getFieldNumber <em>Field Number</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.SortByType#getOrder <em>Order</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getSortByType()
 * @model extendedMetaData="name='sort-by_._type' kind='empty'"
 * @generated
 */
public interface SortByType extends EObject {
	/**
	 * Returns the value of the '<em><b>Data Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Type</em>' attribute.
	 * @see #setDataType(Object)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getSortByType_DataType()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.table.DataTypeType" required="true"
	 *        extendedMetaData="kind='attribute' name='data-type' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getDataType();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.SortByType#getDataType <em>Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Type</em>' attribute.
	 * @see #getDataType()
	 * @generated
	 */
	void setDataType(Object value);

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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getSortByType_FieldNumber()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.NonNegativeInteger" required="true"
	 *        extendedMetaData="kind='attribute' name='field-number' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getFieldNumber();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.SortByType#getFieldNumber <em>Field Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Field Number</em>' attribute.
	 * @see #getFieldNumber()
	 * @generated
	 */
	void setFieldNumber(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Order</b></em>' attribute.
	 * The default value is <code>"ascending"</code>.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.table.OrderType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Order</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.OrderType
	 * @see #isSetOrder()
	 * @see #unsetOrder()
	 * @see #setOrder(OrderType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getSortByType_Order()
	 * @model default="ascending" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='order' namespace='##targetNamespace'"
	 * @generated
	 */
	OrderType getOrder();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.SortByType#getOrder <em>Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.OrderType
	 * @see #isSetOrder()
	 * @see #unsetOrder()
	 * @see #getOrder()
	 * @generated
	 */
	void setOrder(OrderType value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.SortByType#getOrder <em>Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetOrder()
	 * @see #getOrder()
	 * @see #setOrder(OrderType)
	 * @generated
	 */
	void unsetOrder();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.SortByType#getOrder <em>Order</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Order</em>' attribute is set.
	 * @see #unsetOrder()
	 * @see #getOrder()
	 * @see #setOrder(OrderType)
	 * @generated
	 */
	boolean isSetOrder();

} // SortByType
