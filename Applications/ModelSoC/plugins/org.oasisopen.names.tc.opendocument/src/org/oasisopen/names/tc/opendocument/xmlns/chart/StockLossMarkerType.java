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
 * A representation of the model object '<em><b>Stock Loss Marker Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.StockLossMarkerType#getStyleName <em>Style Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.ChartPackage#getStockLossMarkerType()
 * @model extendedMetaData="name='stock-loss-marker_._type' kind='empty'"
 * @generated
 */
public interface StockLossMarkerType extends EObject {
	/**
	 * Returns the value of the '<em><b>Style Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Style Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Style Name</em>' attribute.
	 * @see #setStyleName(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.ChartPackage#getStockLossMarkerType_StyleName()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.chart.StyleNameType"
	 *        extendedMetaData="kind='attribute' name='style-name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getStyleName();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.StockLossMarkerType#getStyleName <em>Style Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style Name</em>' attribute.
	 * @see #getStyleName()
	 * @generated
	 */
	void setStyleName(String value);

} // StockLossMarkerType
