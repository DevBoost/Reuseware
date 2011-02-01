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
 * A representation of the model object '<em><b>Source Cell Range Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.SourceCellRangeType#getFilter <em>Filter</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.SourceCellRangeType#getCellRangeAddress <em>Cell Range Address</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getSourceCellRangeType()
 * @model extendedMetaData="name='source-cell-range_._type' kind='elementOnly'"
 * @generated
 */
public interface SourceCellRangeType extends EObject {
	/**
	 * Returns the value of the '<em><b>Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Filter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filter</em>' containment reference.
	 * @see #setFilter(FilterType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getSourceCellRangeType_Filter()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='filter' namespace='##targetNamespace'"
	 * @generated
	 */
	FilterType getFilter();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.SourceCellRangeType#getFilter <em>Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filter</em>' containment reference.
	 * @see #getFilter()
	 * @generated
	 */
	void setFilter(FilterType value);

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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getSourceCellRangeType_CellRangeAddress()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.CellRangeAddress" required="true"
	 *        extendedMetaData="kind='attribute' name='cell-range-address' namespace='##targetNamespace'"
	 * @generated
	 */
	String getCellRangeAddress();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.SourceCellRangeType#getCellRangeAddress <em>Cell Range Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cell Range Address</em>' attribute.
	 * @see #getCellRangeAddress()
	 * @generated
	 */
	void setCellRangeAddress(String value);

} // SourceCellRangeType
