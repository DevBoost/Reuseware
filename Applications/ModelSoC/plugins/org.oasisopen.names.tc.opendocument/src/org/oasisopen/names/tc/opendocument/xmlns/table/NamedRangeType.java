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
 * A representation of the model object '<em><b>Named Range Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.NamedRangeType#getBaseCellAddress <em>Base Cell Address</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.NamedRangeType#getCellRangeAddress <em>Cell Range Address</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.NamedRangeType#getName <em>Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.NamedRangeType#getRangeUsableAs <em>Range Usable As</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getNamedRangeType()
 * @model extendedMetaData="name='named-range_._type' kind='empty'"
 * @generated
 */
public interface NamedRangeType extends EObject {
	/**
	 * Returns the value of the '<em><b>Base Cell Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Cell Address</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Cell Address</em>' attribute.
	 * @see #setBaseCellAddress(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getNamedRangeType_BaseCellAddress()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.CellAddress"
	 *        extendedMetaData="kind='attribute' name='base-cell-address' namespace='##targetNamespace'"
	 * @generated
	 */
	String getBaseCellAddress();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.NamedRangeType#getBaseCellAddress <em>Base Cell Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Cell Address</em>' attribute.
	 * @see #getBaseCellAddress()
	 * @generated
	 */
	void setBaseCellAddress(String value);

	/**
	 * Returns the value of the '<em><b>Cell Range Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cell Range Address</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cell Range Address</em>' attribute.
	 * @see #setCellRangeAddress(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getNamedRangeType_CellRangeAddress()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.CellRangeAddress" required="true"
	 *        extendedMetaData="kind='attribute' name='cell-range-address' namespace='##targetNamespace'"
	 * @generated
	 */
	String getCellRangeAddress();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.NamedRangeType#getCellRangeAddress <em>Cell Range Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cell Range Address</em>' attribute.
	 * @see #getCellRangeAddress()
	 * @generated
	 */
	void setCellRangeAddress(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getNamedRangeType_Name()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String" required="true"
	 *        extendedMetaData="kind='attribute' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.NamedRangeType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Range Usable As</b></em>' attribute.
	 * The default value is <code>"none"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Range Usable As</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Range Usable As</em>' attribute.
	 * @see #isSetRangeUsableAs()
	 * @see #unsetRangeUsableAs()
	 * @see #setRangeUsableAs(Object)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getNamedRangeType_RangeUsableAs()
	 * @model default="none" unsettable="true" dataType="org.oasisopen.names.tc.opendocument.xmlns.table.RangeUsableAsType"
	 *        extendedMetaData="kind='attribute' name='range-usable-as' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getRangeUsableAs();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.NamedRangeType#getRangeUsableAs <em>Range Usable As</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Range Usable As</em>' attribute.
	 * @see #isSetRangeUsableAs()
	 * @see #unsetRangeUsableAs()
	 * @see #getRangeUsableAs()
	 * @generated
	 */
	void setRangeUsableAs(Object value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.NamedRangeType#getRangeUsableAs <em>Range Usable As</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRangeUsableAs()
	 * @see #getRangeUsableAs()
	 * @see #setRangeUsableAs(Object)
	 * @generated
	 */
	void unsetRangeUsableAs();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.NamedRangeType#getRangeUsableAs <em>Range Usable As</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Range Usable As</em>' attribute is set.
	 * @see #unsetRangeUsableAs()
	 * @see #getRangeUsableAs()
	 * @see #setRangeUsableAs(Object)
	 * @generated
	 */
	boolean isSetRangeUsableAs();

} // NamedRangeType
