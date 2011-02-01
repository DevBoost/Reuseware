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
 * A representation of the model object '<em><b>Cell Address Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.CellAddressType#getColumn <em>Column</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.CellAddressType#getRow <em>Row</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.CellAddressType#getTable <em>Table</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getCellAddressType()
 * @model extendedMetaData="name='cell-address_._type' kind='empty'"
 * @generated
 */
public interface CellAddressType extends EObject {
	/**
	 * Returns the value of the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Column</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Column</em>' attribute.
	 * @see #setColumn(BigInteger)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getCellAddressType_Column()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Integer" required="true"
	 *        extendedMetaData="kind='attribute' name='column' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getColumn();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.CellAddressType#getColumn <em>Column</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Column</em>' attribute.
	 * @see #getColumn()
	 * @generated
	 */
	void setColumn(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Row</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Row</em>' attribute.
	 * @see #setRow(BigInteger)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getCellAddressType_Row()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Integer" required="true"
	 *        extendedMetaData="kind='attribute' name='row' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getRow();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.CellAddressType#getRow <em>Row</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Row</em>' attribute.
	 * @see #getRow()
	 * @generated
	 */
	void setRow(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table</em>' attribute.
	 * @see #setTable(BigInteger)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getCellAddressType_Table()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Integer" required="true"
	 *        extendedMetaData="kind='attribute' name='table' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getTable();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.CellAddressType#getTable <em>Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table</em>' attribute.
	 * @see #getTable()
	 * @generated
	 */
	void setTable(BigInteger value);

} // CellAddressType
