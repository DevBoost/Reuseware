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
 * A representation of the model object '<em><b>Target Range Address Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.TargetRangeAddressType#getColumn <em>Column</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.TargetRangeAddressType#getEndColumn <em>End Column</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.TargetRangeAddressType#getEndRow <em>End Row</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.TargetRangeAddressType#getEndTable <em>End Table</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.TargetRangeAddressType#getRow <em>Row</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.TargetRangeAddressType#getStartColumn <em>Start Column</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.TargetRangeAddressType#getStartRow <em>Start Row</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.TargetRangeAddressType#getStartTable <em>Start Table</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.TargetRangeAddressType#getTable <em>Table</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getTargetRangeAddressType()
 * @model extendedMetaData="name='target-range-address_._type' kind='empty'"
 * @generated
 */
public interface TargetRangeAddressType extends EObject {
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getTargetRangeAddressType_Column()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Integer"
	 *        extendedMetaData="kind='attribute' name='column' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getColumn();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TargetRangeAddressType#getColumn <em>Column</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Column</em>' attribute.
	 * @see #getColumn()
	 * @generated
	 */
	void setColumn(BigInteger value);

	/**
	 * Returns the value of the '<em><b>End Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Column</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Column</em>' attribute.
	 * @see #setEndColumn(BigInteger)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getTargetRangeAddressType_EndColumn()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Integer"
	 *        extendedMetaData="kind='attribute' name='end-column' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getEndColumn();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TargetRangeAddressType#getEndColumn <em>End Column</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Column</em>' attribute.
	 * @see #getEndColumn()
	 * @generated
	 */
	void setEndColumn(BigInteger value);

	/**
	 * Returns the value of the '<em><b>End Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Row</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Row</em>' attribute.
	 * @see #setEndRow(BigInteger)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getTargetRangeAddressType_EndRow()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Integer"
	 *        extendedMetaData="kind='attribute' name='end-row' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getEndRow();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TargetRangeAddressType#getEndRow <em>End Row</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Row</em>' attribute.
	 * @see #getEndRow()
	 * @generated
	 */
	void setEndRow(BigInteger value);

	/**
	 * Returns the value of the '<em><b>End Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Table</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Table</em>' attribute.
	 * @see #setEndTable(BigInteger)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getTargetRangeAddressType_EndTable()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Integer"
	 *        extendedMetaData="kind='attribute' name='end-table' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getEndTable();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TargetRangeAddressType#getEndTable <em>End Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Table</em>' attribute.
	 * @see #getEndTable()
	 * @generated
	 */
	void setEndTable(BigInteger value);

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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getTargetRangeAddressType_Row()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Integer"
	 *        extendedMetaData="kind='attribute' name='row' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getRow();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TargetRangeAddressType#getRow <em>Row</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Row</em>' attribute.
	 * @see #getRow()
	 * @generated
	 */
	void setRow(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Start Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Column</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Column</em>' attribute.
	 * @see #setStartColumn(BigInteger)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getTargetRangeAddressType_StartColumn()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Integer"
	 *        extendedMetaData="kind='attribute' name='start-column' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getStartColumn();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TargetRangeAddressType#getStartColumn <em>Start Column</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Column</em>' attribute.
	 * @see #getStartColumn()
	 * @generated
	 */
	void setStartColumn(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Start Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Row</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Row</em>' attribute.
	 * @see #setStartRow(BigInteger)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getTargetRangeAddressType_StartRow()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Integer"
	 *        extendedMetaData="kind='attribute' name='start-row' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getStartRow();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TargetRangeAddressType#getStartRow <em>Start Row</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Row</em>' attribute.
	 * @see #getStartRow()
	 * @generated
	 */
	void setStartRow(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Start Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Table</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Table</em>' attribute.
	 * @see #setStartTable(BigInteger)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getTargetRangeAddressType_StartTable()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Integer"
	 *        extendedMetaData="kind='attribute' name='start-table' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getStartTable();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TargetRangeAddressType#getStartTable <em>Start Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Table</em>' attribute.
	 * @see #getStartTable()
	 * @generated
	 */
	void setStartTable(BigInteger value);

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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getTargetRangeAddressType_Table()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Integer"
	 *        extendedMetaData="kind='attribute' name='table' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getTable();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TargetRangeAddressType#getTable <em>Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table</em>' attribute.
	 * @see #getTable()
	 * @generated
	 */
	void setTable(BigInteger value);

} // TargetRangeAddressType
