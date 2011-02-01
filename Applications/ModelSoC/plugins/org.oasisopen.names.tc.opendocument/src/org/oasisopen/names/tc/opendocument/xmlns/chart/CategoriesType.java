/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.chart;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Categories Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.CategoriesType#getCellRangeAddress <em>Cell Range Address</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.ChartPackage#getCategoriesType()
 * @model extendedMetaData="name='categories_._type' kind='empty'"
 * @generated
 */
public interface CategoriesType extends EObject {
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.ChartPackage#getCategoriesType_CellRangeAddress()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.CellRangeAddress"
	 *        extendedMetaData="kind='attribute' name='cell-range-address' namespace='urn:oasis:names:tc:opendocument:xmlns:table:1.0'"
	 * @generated
	 */
	String getCellRangeAddress();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.CategoriesType#getCellRangeAddress <em>Cell Range Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cell Range Address</em>' attribute.
	 * @see #getCellRangeAddress()
	 * @generated
	 */
	void setCellRangeAddress(String value);

} // CategoriesType
