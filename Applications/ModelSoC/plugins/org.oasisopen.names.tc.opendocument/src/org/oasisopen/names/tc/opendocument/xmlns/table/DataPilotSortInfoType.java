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
 * A representation of the model object '<em><b>Data Pilot Sort Info Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotSortInfoType#getDataField <em>Data Field</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotSortInfoType#getOrder <em>Order</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotSortInfoType#getSortMode <em>Sort Mode</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDataPilotSortInfoType()
 * @model extendedMetaData="name='data-pilot-sort-info_._type' kind='empty'"
 * @generated
 */
public interface DataPilotSortInfoType extends EObject {
	/**
	 * Returns the value of the '<em><b>Data Field</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Field</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Field</em>' attribute.
	 * @see #setDataField(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDataPilotSortInfoType_DataField()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='data-field' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDataField();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotSortInfoType#getDataField <em>Data Field</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Field</em>' attribute.
	 * @see #getDataField()
	 * @generated
	 */
	void setDataField(String value);

	/**
	 * Returns the value of the '<em><b>Order</b></em>' attribute.
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDataPilotSortInfoType_Order()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='order' namespace='##targetNamespace'"
	 * @generated
	 */
	OrderType getOrder();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotSortInfoType#getOrder <em>Order</em>}' attribute.
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
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotSortInfoType#getOrder <em>Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetOrder()
	 * @see #getOrder()
	 * @see #setOrder(OrderType)
	 * @generated
	 */
	void unsetOrder();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotSortInfoType#getOrder <em>Order</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Order</em>' attribute is set.
	 * @see #unsetOrder()
	 * @see #getOrder()
	 * @see #setOrder(OrderType)
	 * @generated
	 */
	boolean isSetOrder();

	/**
	 * Returns the value of the '<em><b>Sort Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.table.SortModeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sort Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sort Mode</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.SortModeType
	 * @see #isSetSortMode()
	 * @see #unsetSortMode()
	 * @see #setSortMode(SortModeType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDataPilotSortInfoType_SortMode()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='sort-mode' namespace='##targetNamespace'"
	 * @generated
	 */
	SortModeType getSortMode();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotSortInfoType#getSortMode <em>Sort Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sort Mode</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.SortModeType
	 * @see #isSetSortMode()
	 * @see #unsetSortMode()
	 * @see #getSortMode()
	 * @generated
	 */
	void setSortMode(SortModeType value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotSortInfoType#getSortMode <em>Sort Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSortMode()
	 * @see #getSortMode()
	 * @see #setSortMode(SortModeType)
	 * @generated
	 */
	void unsetSortMode();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotSortInfoType#getSortMode <em>Sort Mode</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Sort Mode</em>' attribute is set.
	 * @see #unsetSortMode()
	 * @see #getSortMode()
	 * @see #setSortMode(SortModeType)
	 * @generated
	 */
	boolean isSetSortMode();

} // DataPilotSortInfoType
