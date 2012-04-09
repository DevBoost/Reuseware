/*******************************************************************************
 * Copyright (c) 2006-2012
 * Software Technology Group, Dresden University of Technology
 * DevBoost GmbH, Berlin, Amtsgericht Charlottenburg, HRB 140026
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *   Software Technology Group - TU Dresden, Germany;
 *   DevBoost GmbH - Berlin, Germany
 *      - initial API and implementation
 ******************************************************************************/
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.chart;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Series Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.SeriesType#getDomain <em>Domain</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.SeriesType#getMeanValue <em>Mean Value</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.SeriesType#getRegressionCurve <em>Regression Curve</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.SeriesType#getErrorIndicator <em>Error Indicator</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.SeriesType#getDataPoint <em>Data Point</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.SeriesType#getAttachedAxis <em>Attached Axis</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.SeriesType#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.SeriesType#getLabelCellAddress <em>Label Cell Address</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.SeriesType#getStyleName <em>Style Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.SeriesType#getValuesCellRangeAddress <em>Values Cell Range Address</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.ChartPackage#getSeriesType()
 * @model extendedMetaData="name='series_._type' kind='elementOnly'"
 * @generated
 */
public interface SeriesType extends EObject {
	/**
	 * Returns the value of the '<em><b>Domain</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.chart.DomainType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.ChartPackage#getSeriesType_Domain()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='domain' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DomainType> getDomain();

	/**
	 * Returns the value of the '<em><b>Mean Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mean Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mean Value</em>' containment reference.
	 * @see #setMeanValue(MeanValueType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.ChartPackage#getSeriesType_MeanValue()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mean-value' namespace='##targetNamespace'"
	 * @generated
	 */
	MeanValueType getMeanValue();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.SeriesType#getMeanValue <em>Mean Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mean Value</em>' containment reference.
	 * @see #getMeanValue()
	 * @generated
	 */
	void setMeanValue(MeanValueType value);

	/**
	 * Returns the value of the '<em><b>Regression Curve</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Regression Curve</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Regression Curve</em>' containment reference.
	 * @see #setRegressionCurve(RegressionCurveType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.ChartPackage#getSeriesType_RegressionCurve()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='regression-curve' namespace='##targetNamespace'"
	 * @generated
	 */
	RegressionCurveType getRegressionCurve();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.SeriesType#getRegressionCurve <em>Regression Curve</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Regression Curve</em>' containment reference.
	 * @see #getRegressionCurve()
	 * @generated
	 */
	void setRegressionCurve(RegressionCurveType value);

	/**
	 * Returns the value of the '<em><b>Error Indicator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Error Indicator</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Error Indicator</em>' containment reference.
	 * @see #setErrorIndicator(ErrorIndicatorType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.ChartPackage#getSeriesType_ErrorIndicator()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='error-indicator' namespace='##targetNamespace'"
	 * @generated
	 */
	ErrorIndicatorType getErrorIndicator();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.SeriesType#getErrorIndicator <em>Error Indicator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Error Indicator</em>' containment reference.
	 * @see #getErrorIndicator()
	 * @generated
	 */
	void setErrorIndicator(ErrorIndicatorType value);

	/**
	 * Returns the value of the '<em><b>Data Point</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.chart.DataPointType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Point</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Point</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.ChartPackage#getSeriesType_DataPoint()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='data-point' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DataPointType> getDataPoint();

	/**
	 * Returns the value of the '<em><b>Attached Axis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attached Axis</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attached Axis</em>' attribute.
	 * @see #setAttachedAxis(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.ChartPackage#getSeriesType_AttachedAxis()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='attached-axis' namespace='##targetNamespace'"
	 * @generated
	 */
	String getAttachedAxis();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.SeriesType#getAttachedAxis <em>Attached Axis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attached Axis</em>' attribute.
	 * @see #getAttachedAxis()
	 * @generated
	 */
	void setAttachedAxis(String value);

	/**
	 * Returns the value of the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class</em>' attribute.
	 * @see #setClass(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.ChartPackage#getSeriesType_Class()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.NamespacedToken" required="true"
	 *        extendedMetaData="kind='attribute' name='class' namespace='##targetNamespace'"
	 * @generated
	 */
	String getClass_();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.SeriesType#getClass_ <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class</em>' attribute.
	 * @see #getClass_()
	 * @generated
	 */
	void setClass(String value);

	/**
	 * Returns the value of the '<em><b>Label Cell Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label Cell Address</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label Cell Address</em>' attribute.
	 * @see #setLabelCellAddress(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.ChartPackage#getSeriesType_LabelCellAddress()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.CellAddress"
	 *        extendedMetaData="kind='attribute' name='label-cell-address' namespace='##targetNamespace'"
	 * @generated
	 */
	String getLabelCellAddress();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.SeriesType#getLabelCellAddress <em>Label Cell Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label Cell Address</em>' attribute.
	 * @see #getLabelCellAddress()
	 * @generated
	 */
	void setLabelCellAddress(String value);

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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.ChartPackage#getSeriesType_StyleName()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.chart.StyleNameType"
	 *        extendedMetaData="kind='attribute' name='style-name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getStyleName();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.SeriesType#getStyleName <em>Style Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style Name</em>' attribute.
	 * @see #getStyleName()
	 * @generated
	 */
	void setStyleName(String value);

	/**
	 * Returns the value of the '<em><b>Values Cell Range Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Values Cell Range Address</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values Cell Range Address</em>' attribute.
	 * @see #setValuesCellRangeAddress(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.ChartPackage#getSeriesType_ValuesCellRangeAddress()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.CellRangeAddress"
	 *        extendedMetaData="kind='attribute' name='values-cell-range-address' namespace='##targetNamespace'"
	 * @generated
	 */
	String getValuesCellRangeAddress();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.SeriesType#getValuesCellRangeAddress <em>Values Cell Range Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Values Cell Range Address</em>' attribute.
	 * @see #getValuesCellRangeAddress()
	 * @generated
	 */
	void setValuesCellRangeAddress(String value);

} // SeriesType
