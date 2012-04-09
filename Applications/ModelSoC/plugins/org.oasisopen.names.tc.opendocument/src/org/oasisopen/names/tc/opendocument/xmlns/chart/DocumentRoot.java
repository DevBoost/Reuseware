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

import java.math.BigInteger;

import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.oasisopen.names.tc.opendocument.xmlns.text.OfficeChartContentMainType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getAxis <em>Axis</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getCategories <em>Categories</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getChart <em>Chart</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getDataPoint <em>Data Point</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getDomain <em>Domain</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getErrorIndicator <em>Error Indicator</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getFloor <em>Floor</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getFooter <em>Footer</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getGrid <em>Grid</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getLegend <em>Legend</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getMeanValue <em>Mean Value</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getPlotArea <em>Plot Area</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getRegressionCurve <em>Regression Curve</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getSeries <em>Series</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getStockGainMarker <em>Stock Gain Marker</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getStockLossMarker <em>Stock Loss Marker</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getStockRangeLine <em>Stock Range Line</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getSubtitle <em>Subtitle</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getSymbolImage <em>Symbol Image</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getTitle <em>Title</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getWall <em>Wall</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getAttachedAxis <em>Attached Axis</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getColumnMapping <em>Column Mapping</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getConnectBars <em>Connect Bars</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getDataLabelNumber <em>Data Label Number</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getDataLabelSymbol <em>Data Label Symbol</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getDataLabelText <em>Data Label Text</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getDataSourceHasLabels <em>Data Source Has Labels</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getDeep <em>Deep</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getDimension <em>Dimension</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getDisplayLabel <em>Display Label</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getErrorCategory <em>Error Category</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getErrorLowerIndicator <em>Error Lower Indicator</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getErrorLowerLimit <em>Error Lower Limit</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getErrorMargin <em>Error Margin</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getErrorPercentage <em>Error Percentage</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getErrorUpperIndicator <em>Error Upper Indicator</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getErrorUpperLimit <em>Error Upper Limit</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getGapWidth <em>Gap Width</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getInterpolation <em>Interpolation</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getIntervalMajor <em>Interval Major</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getIntervalMinorDivisor <em>Interval Minor Divisor</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getJapaneseCandleStick <em>Japanese Candle Stick</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getLabelArrangement <em>Label Arrangement</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getLabelCellAddress <em>Label Cell Address</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getLegendAlign <em>Legend Align</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getLegendPosition <em>Legend Position</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getLines <em>Lines</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getLinkDataStyleToSource <em>Link Data Style To Source</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getLogarithmic <em>Logarithmic</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getMaximum <em>Maximum</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getMeanValue1 <em>Mean Value1</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getMinimum <em>Minimum</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getName <em>Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getOrigin <em>Origin</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getOverlap <em>Overlap</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getPercentage <em>Percentage</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getPieOffset <em>Pie Offset</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getRegressionType <em>Regression Type</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getRepeated <em>Repeated</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getRowMapping <em>Row Mapping</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getScaleText <em>Scale Text</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getSeriesSource <em>Series Source</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getSolidType <em>Solid Type</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getSplineOrder <em>Spline Order</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getSplineResolution <em>Spline Resolution</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getStacked <em>Stacked</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getStyleName <em>Style Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getSymbolHeight <em>Symbol Height</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getSymbolName <em>Symbol Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getSymbolType <em>Symbol Type</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getSymbolWidth <em>Symbol Width</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getTextOverlap <em>Text Overlap</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getThreeDimensional <em>Three Dimensional</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getTickMarksMajorInner <em>Tick Marks Major Inner</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getTickMarksMajorOuter <em>Tick Marks Major Outer</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getTickMarksMinorInner <em>Tick Marks Minor Inner</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getTickMarksMinorOuter <em>Tick Marks Minor Outer</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getValuesCellRangeAddress <em>Values Cell Range Address</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getVertical <em>Vertical</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getVisible <em>Visible</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.ChartPackage#getDocumentRoot()
 * @model extendedMetaData="name='' kind='mixed'"
 * @generated
 */
public interface DocumentRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mixed</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mixed</em>' attribute list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.ChartPackage#getDocumentRoot_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':mixed'"
	 * @generated
	 */
	FeatureMap getMixed();

	/**
	 * Returns the value of the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XMLNS Prefix Map</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XMLNS Prefix Map</em>' map.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.ChartPackage#getDocumentRoot_XMLNSPrefixMap()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" transient="true"
	 *        extendedMetaData="kind='attribute' name='xmlns:prefix'"
	 * @generated
	 */
	EMap<String, String> getXMLNSPrefixMap();

	/**
	 * Returns the value of the '<em><b>XSI Schema Location</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XSI Schema Location</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XSI Schema Location</em>' map.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.ChartPackage#getDocumentRoot_XSISchemaLocation()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" transient="true"
	 *        extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
	 * @generated
	 */
	EMap<String, String> getXSISchemaLocation();

	/**
	 * Returns the value of the '<em><b>Axis</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Axis</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Axis</em>' containment reference.
	 * @see #setAxis(AxisType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.ChartPackage#getDocumentRoot_Axis()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='axis' namespace='##targetNamespace'"
	 * @generated
	 */
	AxisType getAxis();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getAxis <em>Axis</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Axis</em>' containment reference.
	 * @see #getAxis()
	 * @generated
	 */
	void setAxis(AxisType value);

	/**
	 * Returns the value of the '<em><b>Categories</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categories</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categories</em>' containment reference.
	 * @see #setCategories(CategoriesType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.ChartPackage#getDocumentRoot_Categories()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='categories' namespace='##targetNamespace'"
	 * @generated
	 */
	CategoriesType getCategories();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getCategories <em>Categories</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Categories</em>' containment reference.
	 * @see #getCategories()
	 * @generated
	 */
	void setCategories(CategoriesType value);

	/**
	 * Returns the value of the '<em><b>Chart</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Chart</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Chart</em>' containment reference.
	 * @see #setChart(OfficeChartContentMainType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.ChartPackage#getDocumentRoot_Chart()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='chart' namespace='##targetNamespace' affiliation='urn:oasis:names:tc:opendocument:xmlns:text:1.0#office-chart-content-main'"
	 * @generated
	 */
	OfficeChartContentMainType getChart();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getChart <em>Chart</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Chart</em>' containment reference.
	 * @see #getChart()
	 * @generated
	 */
	void setChart(OfficeChartContentMainType value);

	/**
	 * Returns the value of the '<em><b>Data Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Point</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Point</em>' containment reference.
	 * @see #setDataPoint(DataPointType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.ChartPackage#getDocumentRoot_DataPoint()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='data-point' namespace='##targetNamespace'"
	 * @generated
	 */
	DataPointType getDataPoint();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getDataPoint <em>Data Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Point</em>' containment reference.
	 * @see #getDataPoint()
	 * @generated
	 */
	void setDataPoint(DataPointType value);

	/**
	 * Returns the value of the '<em><b>Domain</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain</em>' containment reference.
	 * @see #setDomain(DomainType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.ChartPackage#getDocumentRoot_Domain()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='domain' namespace='##targetNamespace'"
	 * @generated
	 */
	DomainType getDomain();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getDomain <em>Domain</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain</em>' containment reference.
	 * @see #getDomain()
	 * @generated
	 */
	void setDomain(DomainType value);

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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.ChartPackage#getDocumentRoot_ErrorIndicator()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='error-indicator' namespace='##targetNamespace'"
	 * @generated
	 */
	ErrorIndicatorType getErrorIndicator();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getErrorIndicator <em>Error Indicator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Error Indicator</em>' containment reference.
	 * @see #getErrorIndicator()
	 * @generated
	 */
	void setErrorIndicator(ErrorIndicatorType value);

	/**
	 * Returns the value of the '<em><b>Floor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Floor</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Floor</em>' containment reference.
	 * @see #setFloor(FloorType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.ChartPackage#getDocumentRoot_Floor()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='floor' namespace='##targetNamespace'"
	 * @generated
	 */
	FloorType getFloor();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getFloor <em>Floor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Floor</em>' containment reference.
	 * @see #getFloor()
	 * @generated
	 */
	void setFloor(FloorType value);

	/**
	 * Returns the value of the '<em><b>Footer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Footer</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Footer</em>' containment reference.
	 * @see #setFooter(FooterType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.ChartPackage#getDocumentRoot_Footer()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='footer' namespace='##targetNamespace'"
	 * @generated
	 */
	FooterType getFooter();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getFooter <em>Footer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Footer</em>' containment reference.
	 * @see #getFooter()
	 * @generated
	 */
	void setFooter(FooterType value);

	/**
	 * Returns the value of the '<em><b>Grid</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Grid</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grid</em>' containment reference.
	 * @see #setGrid(GridType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.ChartPackage#getDocumentRoot_Grid()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='grid' namespace='##targetNamespace'"
	 * @generated
	 */
	GridType getGrid();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getGrid <em>Grid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grid</em>' containment reference.
	 * @see #getGrid()
	 * @generated
	 */
	void setGrid(GridType value);

	/**
	 * Returns the value of the '<em><b>Legend</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Legend</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Legend</em>' containment reference.
	 * @see #setLegend(LegendType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.ChartPackage#getDocumentRoot_Legend()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='legend' namespace='##targetNamespace'"
	 * @generated
	 */
	LegendType getLegend();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getLegend <em>Legend</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Legend</em>' containment reference.
	 * @see #getLegend()
	 * @generated
	 */
	void setLegend(LegendType value);

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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.ChartPackage#getDocumentRoot_MeanValue()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='mean-value' namespace='##targetNamespace'"
	 * @generated
	 */
	MeanValueType getMeanValue();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getMeanValue <em>Mean Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mean Value</em>' containment reference.
	 * @see #getMeanValue()
	 * @generated
	 */
	void setMeanValue(MeanValueType value);

	/**
	 * Returns the value of the '<em><b>Plot Area</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Plot Area</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plot Area</em>' containment reference.
	 * @see #setPlotArea(PlotAreaType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.ChartPackage#getDocumentRoot_PlotArea()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='plot-area' namespace='##targetNamespace'"
	 * @generated
	 */
	PlotAreaType getPlotArea();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getPlotArea <em>Plot Area</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Plot Area</em>' containment reference.
	 * @see #getPlotArea()
	 * @generated
	 */
	void setPlotArea(PlotAreaType value);

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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.ChartPackage#getDocumentRoot_RegressionCurve()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='regression-curve' namespace='##targetNamespace'"
	 * @generated
	 */
	RegressionCurveType getRegressionCurve();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getRegressionCurve <em>Regression Curve</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Regression Curve</em>' containment reference.
	 * @see #getRegressionCurve()
	 * @generated
	 */
	void setRegressionCurve(RegressionCurveType value);

	/**
	 * Returns the value of the '<em><b>Series</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Series</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Series</em>' containment reference.
	 * @see #setSeries(SeriesType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.ChartPackage#getDocumentRoot_Series()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='series' namespace='##targetNamespace'"
	 * @generated
	 */
	SeriesType getSeries();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getSeries <em>Series</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Series</em>' containment reference.
	 * @see #getSeries()
	 * @generated
	 */
	void setSeries(SeriesType value);

	/**
	 * Returns the value of the '<em><b>Stock Gain Marker</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stock Gain Marker</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stock Gain Marker</em>' containment reference.
	 * @see #setStockGainMarker(StockGainMarkerType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.ChartPackage#getDocumentRoot_StockGainMarker()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='stock-gain-marker' namespace='##targetNamespace'"
	 * @generated
	 */
	StockGainMarkerType getStockGainMarker();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getStockGainMarker <em>Stock Gain Marker</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stock Gain Marker</em>' containment reference.
	 * @see #getStockGainMarker()
	 * @generated
	 */
	void setStockGainMarker(StockGainMarkerType value);

	/**
	 * Returns the value of the '<em><b>Stock Loss Marker</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stock Loss Marker</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stock Loss Marker</em>' containment reference.
	 * @see #setStockLossMarker(StockLossMarkerType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.ChartPackage#getDocumentRoot_StockLossMarker()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='stock-loss-marker' namespace='##targetNamespace'"
	 * @generated
	 */
	StockLossMarkerType getStockLossMarker();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getStockLossMarker <em>Stock Loss Marker</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stock Loss Marker</em>' containment reference.
	 * @see #getStockLossMarker()
	 * @generated
	 */
	void setStockLossMarker(StockLossMarkerType value);

	/**
	 * Returns the value of the '<em><b>Stock Range Line</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stock Range Line</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stock Range Line</em>' containment reference.
	 * @see #setStockRangeLine(StockRangeLineType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.ChartPackage#getDocumentRoot_StockRangeLine()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='stock-range-line' namespace='##targetNamespace'"
	 * @generated
	 */
	StockRangeLineType getStockRangeLine();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getStockRangeLine <em>Stock Range Line</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stock Range Line</em>' containment reference.
	 * @see #getStockRangeLine()
	 * @generated
	 */
	void setStockRangeLine(StockRangeLineType value);

	/**
	 * Returns the value of the '<em><b>Subtitle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subtitle</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subtitle</em>' containment reference.
	 * @see #setSubtitle(SubtitleType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.ChartPackage#getDocumentRoot_Subtitle()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='subtitle' namespace='##targetNamespace'"
	 * @generated
	 */
	SubtitleType getSubtitle();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getSubtitle <em>Subtitle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subtitle</em>' containment reference.
	 * @see #getSubtitle()
	 * @generated
	 */
	void setSubtitle(SubtitleType value);

	/**
	 * Returns the value of the '<em><b>Symbol Image</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Symbol Image</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Symbol Image</em>' containment reference.
	 * @see #setSymbolImage(SymbolImageType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.ChartPackage#getDocumentRoot_SymbolImage()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='symbol-image' namespace='##targetNamespace'"
	 * @generated
	 */
	SymbolImageType getSymbolImage();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getSymbolImage <em>Symbol Image</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Symbol Image</em>' containment reference.
	 * @see #getSymbolImage()
	 * @generated
	 */
	void setSymbolImage(SymbolImageType value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' containment reference.
	 * @see #setTitle(TitleType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.ChartPackage#getDocumentRoot_Title()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='title' namespace='##targetNamespace'"
	 * @generated
	 */
	TitleType getTitle();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getTitle <em>Title</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' containment reference.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(TitleType value);

	/**
	 * Returns the value of the '<em><b>Wall</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wall</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wall</em>' containment reference.
	 * @see #setWall(WallType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.ChartPackage#getDocumentRoot_Wall()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='wall' namespace='##targetNamespace'"
	 * @generated
	 */
	WallType getWall();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getWall <em>Wall</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wall</em>' containment reference.
	 * @see #getWall()
	 * @generated
	 */
	void setWall(WallType value);

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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.ChartPackage#getDocumentRoot_AttachedAxis()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='attached-axis' namespace='##targetNamespace'"
	 * @generated
	 */
	String getAttachedAxis();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getAttachedAxis <em>Attached Axis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attached Axis</em>' attribute.
	 * @see #getAttachedAxis()
	 * @generated
	 */
	void setAttachedAxis(String value);

	/**
	 * Returns the value of the '<em><b>Column Mapping</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Column Mapping</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Column Mapping</em>' attribute.
	 * @see #setColumnMapping(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.ChartPackage#getDocumentRoot_ColumnMapping()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='column-mapping' namespace='##targetNamespace'"
	 * @generated
	 */
	String getColumnMapping();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getColumnMapping <em>Column Mapping</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Column Mapping</em>' attribute.
	 * @see #getColumnMapping()
	 * @generated
	 */
	void setColumnMapping(String value);

	/**
	 * Returns the value of the '<em><b>Connect Bars</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connect Bars</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connect Bars</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetConnectBars()
	 * @see #unsetConnectBars()
	 * @see #setConnectBars(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.ChartPackage#getDocumentRoot_ConnectBars()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='connect-bars' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getConnectBars();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getConnectBars <em>Connect Bars</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connect Bars</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetConnectBars()
	 * @see #unsetConnectBars()
	 * @see #getConnectBars()
	 * @generated
	 */
	void setConnectBars(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getConnectBars <em>Connect Bars</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetConnectBars()
	 * @see #getConnectBars()
	 * @see #setConnectBars(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetConnectBars();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getConnectBars <em>Connect Bars</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Connect Bars</em>' attribute is set.
	 * @see #unsetConnectBars()
	 * @see #getConnectBars()
	 * @see #setConnectBars(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetConnectBars();

	/**
	 * Returns the value of the '<em><b>Data Label Number</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.chart.DataLabelNumberType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Label Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Label Number</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.DataLabelNumberType
	 * @see #isSetDataLabelNumber()
	 * @see #unsetDataLabelNumber()
	 * @see #setDataLabelNumber(DataLabelNumberType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.ChartPackage#getDocumentRoot_DataLabelNumber()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='data-label-number' namespace='##targetNamespace'"
	 * @generated
	 */
	DataLabelNumberType getDataLabelNumber();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getDataLabelNumber <em>Data Label Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Label Number</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.DataLabelNumberType
	 * @see #isSetDataLabelNumber()
	 * @see #unsetDataLabelNumber()
	 * @see #getDataLabelNumber()
	 * @generated
	 */
	void setDataLabelNumber(DataLabelNumberType value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getDataLabelNumber <em>Data Label Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDataLabelNumber()
	 * @see #getDataLabelNumber()
	 * @see #setDataLabelNumber(DataLabelNumberType)
	 * @generated
	 */
	void unsetDataLabelNumber();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getDataLabelNumber <em>Data Label Number</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Data Label Number</em>' attribute is set.
	 * @see #unsetDataLabelNumber()
	 * @see #getDataLabelNumber()
	 * @see #setDataLabelNumber(DataLabelNumberType)
	 * @generated
	 */
	boolean isSetDataLabelNumber();

	/**
	 * Returns the value of the '<em><b>Data Label Symbol</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Label Symbol</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Label Symbol</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetDataLabelSymbol()
	 * @see #unsetDataLabelSymbol()
	 * @see #setDataLabelSymbol(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.ChartPackage#getDocumentRoot_DataLabelSymbol()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='data-label-symbol' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getDataLabelSymbol();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getDataLabelSymbol <em>Data Label Symbol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Label Symbol</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetDataLabelSymbol()
	 * @see #unsetDataLabelSymbol()
	 * @see #getDataLabelSymbol()
	 * @generated
	 */
	void setDataLabelSymbol(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getDataLabelSymbol <em>Data Label Symbol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDataLabelSymbol()
	 * @see #getDataLabelSymbol()
	 * @see #setDataLabelSymbol(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetDataLabelSymbol();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getDataLabelSymbol <em>Data Label Symbol</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Data Label Symbol</em>' attribute is set.
	 * @see #unsetDataLabelSymbol()
	 * @see #getDataLabelSymbol()
	 * @see #setDataLabelSymbol(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetDataLabelSymbol();

	/**
	 * Returns the value of the '<em><b>Data Label Text</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Label Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Label Text</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetDataLabelText()
	 * @see #unsetDataLabelText()
	 * @see #setDataLabelText(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.ChartPackage#getDocumentRoot_DataLabelText()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='data-label-text' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getDataLabelText();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getDataLabelText <em>Data Label Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Label Text</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetDataLabelText()
	 * @see #unsetDataLabelText()
	 * @see #getDataLabelText()
	 * @generated
	 */
	void setDataLabelText(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getDataLabelText <em>Data Label Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDataLabelText()
	 * @see #getDataLabelText()
	 * @see #setDataLabelText(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetDataLabelText();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getDataLabelText <em>Data Label Text</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Data Label Text</em>' attribute is set.
	 * @see #unsetDataLabelText()
	 * @see #getDataLabelText()
	 * @see #setDataLabelText(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetDataLabelText();

	/**
	 * Returns the value of the '<em><b>Data Source Has Labels</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.chart.DataSourceHasLabelsType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Source Has Labels</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Source Has Labels</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.DataSourceHasLabelsType
	 * @see #isSetDataSourceHasLabels()
	 * @see #unsetDataSourceHasLabels()
	 * @see #setDataSourceHasLabels(DataSourceHasLabelsType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.ChartPackage#getDocumentRoot_DataSourceHasLabels()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='data-source-has-labels' namespace='##targetNamespace'"
	 * @generated
	 */
	DataSourceHasLabelsType getDataSourceHasLabels();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getDataSourceHasLabels <em>Data Source Has Labels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Source Has Labels</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.DataSourceHasLabelsType
	 * @see #isSetDataSourceHasLabels()
	 * @see #unsetDataSourceHasLabels()
	 * @see #getDataSourceHasLabels()
	 * @generated
	 */
	void setDataSourceHasLabels(DataSourceHasLabelsType value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getDataSourceHasLabels <em>Data Source Has Labels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDataSourceHasLabels()
	 * @see #getDataSourceHasLabels()
	 * @see #setDataSourceHasLabels(DataSourceHasLabelsType)
	 * @generated
	 */
	void unsetDataSourceHasLabels();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getDataSourceHasLabels <em>Data Source Has Labels</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Data Source Has Labels</em>' attribute is set.
	 * @see #unsetDataSourceHasLabels()
	 * @see #getDataSourceHasLabels()
	 * @see #setDataSourceHasLabels(DataSourceHasLabelsType)
	 * @generated
	 */
	boolean isSetDataSourceHasLabels();

	/**
	 * Returns the value of the '<em><b>Deep</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deep</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deep</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetDeep()
	 * @see #unsetDeep()
	 * @see #setDeep(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.ChartPackage#getDocumentRoot_Deep()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='deep' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getDeep();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getDeep <em>Deep</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deep</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetDeep()
	 * @see #unsetDeep()
	 * @see #getDeep()
	 * @generated
	 */
	void setDeep(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getDeep <em>Deep</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDeep()
	 * @see #getDeep()
	 * @see #setDeep(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetDeep();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getDeep <em>Deep</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Deep</em>' attribute is set.
	 * @see #unsetDeep()
	 * @see #getDeep()
	 * @see #setDeep(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetDeep();

	/**
	 * Returns the value of the '<em><b>Dimension</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.chart.DimensionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dimension</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dimension</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.DimensionType
	 * @see #isSetDimension()
	 * @see #unsetDimension()
	 * @see #setDimension(DimensionType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.ChartPackage#getDocumentRoot_Dimension()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='dimension' namespace='##targetNamespace'"
	 * @generated
	 */
	DimensionType getDimension();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getDimension <em>Dimension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dimension</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.DimensionType
	 * @see #isSetDimension()
	 * @see #unsetDimension()
	 * @see #getDimension()
	 * @generated
	 */
	void setDimension(DimensionType value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getDimension <em>Dimension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDimension()
	 * @see #getDimension()
	 * @see #setDimension(DimensionType)
	 * @generated
	 */
	void unsetDimension();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getDimension <em>Dimension</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Dimension</em>' attribute is set.
	 * @see #unsetDimension()
	 * @see #getDimension()
	 * @see #setDimension(DimensionType)
	 * @generated
	 */
	boolean isSetDimension();

	/**
	 * Returns the value of the '<em><b>Display Label</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Display Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Display Label</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetDisplayLabel()
	 * @see #unsetDisplayLabel()
	 * @see #setDisplayLabel(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.ChartPackage#getDocumentRoot_DisplayLabel()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='display-label' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getDisplayLabel();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getDisplayLabel <em>Display Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Display Label</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetDisplayLabel()
	 * @see #unsetDisplayLabel()
	 * @see #getDisplayLabel()
	 * @generated
	 */
	void setDisplayLabel(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getDisplayLabel <em>Display Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDisplayLabel()
	 * @see #getDisplayLabel()
	 * @see #setDisplayLabel(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetDisplayLabel();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getDisplayLabel <em>Display Label</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Display Label</em>' attribute is set.
	 * @see #unsetDisplayLabel()
	 * @see #getDisplayLabel()
	 * @see #setDisplayLabel(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetDisplayLabel();

	/**
	 * Returns the value of the '<em><b>Error Category</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.chart.ErrorCategoryType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Error Category</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Error Category</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.ErrorCategoryType
	 * @see #isSetErrorCategory()
	 * @see #unsetErrorCategory()
	 * @see #setErrorCategory(ErrorCategoryType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.ChartPackage#getDocumentRoot_ErrorCategory()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='error-category' namespace='##targetNamespace'"
	 * @generated
	 */
	ErrorCategoryType getErrorCategory();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getErrorCategory <em>Error Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Error Category</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.ErrorCategoryType
	 * @see #isSetErrorCategory()
	 * @see #unsetErrorCategory()
	 * @see #getErrorCategory()
	 * @generated
	 */
	void setErrorCategory(ErrorCategoryType value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getErrorCategory <em>Error Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetErrorCategory()
	 * @see #getErrorCategory()
	 * @see #setErrorCategory(ErrorCategoryType)
	 * @generated
	 */
	void unsetErrorCategory();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getErrorCategory <em>Error Category</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Error Category</em>' attribute is set.
	 * @see #unsetErrorCategory()
	 * @see #getErrorCategory()
	 * @see #setErrorCategory(ErrorCategoryType)
	 * @generated
	 */
	boolean isSetErrorCategory();

	/**
	 * Returns the value of the '<em><b>Error Lower Indicator</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Error Lower Indicator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Error Lower Indicator</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetErrorLowerIndicator()
	 * @see #unsetErrorLowerIndicator()
	 * @see #setErrorLowerIndicator(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.ChartPackage#getDocumentRoot_ErrorLowerIndicator()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='error-lower-indicator' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getErrorLowerIndicator();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getErrorLowerIndicator <em>Error Lower Indicator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Error Lower Indicator</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetErrorLowerIndicator()
	 * @see #unsetErrorLowerIndicator()
	 * @see #getErrorLowerIndicator()
	 * @generated
	 */
	void setErrorLowerIndicator(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getErrorLowerIndicator <em>Error Lower Indicator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetErrorLowerIndicator()
	 * @see #getErrorLowerIndicator()
	 * @see #setErrorLowerIndicator(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetErrorLowerIndicator();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getErrorLowerIndicator <em>Error Lower Indicator</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Error Lower Indicator</em>' attribute is set.
	 * @see #unsetErrorLowerIndicator()
	 * @see #getErrorLowerIndicator()
	 * @see #setErrorLowerIndicator(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetErrorLowerIndicator();

	/**
	 * Returns the value of the '<em><b>Error Lower Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Error Lower Limit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Error Lower Limit</em>' attribute.
	 * @see #isSetErrorLowerLimit()
	 * @see #unsetErrorLowerLimit()
	 * @see #setErrorLowerLimit(double)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.ChartPackage#getDocumentRoot_ErrorLowerLimit()
	 * @model unsettable="true" dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Double"
	 *        extendedMetaData="kind='attribute' name='error-lower-limit' namespace='##targetNamespace'"
	 * @generated
	 */
	double getErrorLowerLimit();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getErrorLowerLimit <em>Error Lower Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Error Lower Limit</em>' attribute.
	 * @see #isSetErrorLowerLimit()
	 * @see #unsetErrorLowerLimit()
	 * @see #getErrorLowerLimit()
	 * @generated
	 */
	void setErrorLowerLimit(double value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getErrorLowerLimit <em>Error Lower Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetErrorLowerLimit()
	 * @see #getErrorLowerLimit()
	 * @see #setErrorLowerLimit(double)
	 * @generated
	 */
	void unsetErrorLowerLimit();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getErrorLowerLimit <em>Error Lower Limit</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Error Lower Limit</em>' attribute is set.
	 * @see #unsetErrorLowerLimit()
	 * @see #getErrorLowerLimit()
	 * @see #setErrorLowerLimit(double)
	 * @generated
	 */
	boolean isSetErrorLowerLimit();

	/**
	 * Returns the value of the '<em><b>Error Margin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Error Margin</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Error Margin</em>' attribute.
	 * @see #isSetErrorMargin()
	 * @see #unsetErrorMargin()
	 * @see #setErrorMargin(double)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.ChartPackage#getDocumentRoot_ErrorMargin()
	 * @model unsettable="true" dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Double"
	 *        extendedMetaData="kind='attribute' name='error-margin' namespace='##targetNamespace'"
	 * @generated
	 */
	double getErrorMargin();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getErrorMargin <em>Error Margin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Error Margin</em>' attribute.
	 * @see #isSetErrorMargin()
	 * @see #unsetErrorMargin()
	 * @see #getErrorMargin()
	 * @generated
	 */
	void setErrorMargin(double value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getErrorMargin <em>Error Margin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetErrorMargin()
	 * @see #getErrorMargin()
	 * @see #setErrorMargin(double)
	 * @generated
	 */
	void unsetErrorMargin();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getErrorMargin <em>Error Margin</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Error Margin</em>' attribute is set.
	 * @see #unsetErrorMargin()
	 * @see #getErrorMargin()
	 * @see #setErrorMargin(double)
	 * @generated
	 */
	boolean isSetErrorMargin();

	/**
	 * Returns the value of the '<em><b>Error Percentage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Error Percentage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Error Percentage</em>' attribute.
	 * @see #isSetErrorPercentage()
	 * @see #unsetErrorPercentage()
	 * @see #setErrorPercentage(double)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.ChartPackage#getDocumentRoot_ErrorPercentage()
	 * @model unsettable="true" dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Double"
	 *        extendedMetaData="kind='attribute' name='error-percentage' namespace='##targetNamespace'"
	 * @generated
	 */
	double getErrorPercentage();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getErrorPercentage <em>Error Percentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Error Percentage</em>' attribute.
	 * @see #isSetErrorPercentage()
	 * @see #unsetErrorPercentage()
	 * @see #getErrorPercentage()
	 * @generated
	 */
	void setErrorPercentage(double value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getErrorPercentage <em>Error Percentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetErrorPercentage()
	 * @see #getErrorPercentage()
	 * @see #setErrorPercentage(double)
	 * @generated
	 */
	void unsetErrorPercentage();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getErrorPercentage <em>Error Percentage</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Error Percentage</em>' attribute is set.
	 * @see #unsetErrorPercentage()
	 * @see #getErrorPercentage()
	 * @see #setErrorPercentage(double)
	 * @generated
	 */
	boolean isSetErrorPercentage();

	/**
	 * Returns the value of the '<em><b>Error Upper Indicator</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Error Upper Indicator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Error Upper Indicator</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetErrorUpperIndicator()
	 * @see #unsetErrorUpperIndicator()
	 * @see #setErrorUpperIndicator(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.ChartPackage#getDocumentRoot_ErrorUpperIndicator()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='error-upper-indicator' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getErrorUpperIndicator();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getErrorUpperIndicator <em>Error Upper Indicator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Error Upper Indicator</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetErrorUpperIndicator()
	 * @see #unsetErrorUpperIndicator()
	 * @see #getErrorUpperIndicator()
	 * @generated
	 */
	void setErrorUpperIndicator(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getErrorUpperIndicator <em>Error Upper Indicator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetErrorUpperIndicator()
	 * @see #getErrorUpperIndicator()
	 * @see #setErrorUpperIndicator(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetErrorUpperIndicator();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getErrorUpperIndicator <em>Error Upper Indicator</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Error Upper Indicator</em>' attribute is set.
	 * @see #unsetErrorUpperIndicator()
	 * @see #getErrorUpperIndicator()
	 * @see #setErrorUpperIndicator(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetErrorUpperIndicator();

	/**
	 * Returns the value of the '<em><b>Error Upper Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Error Upper Limit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Error Upper Limit</em>' attribute.
	 * @see #isSetErrorUpperLimit()
	 * @see #unsetErrorUpperLimit()
	 * @see #setErrorUpperLimit(double)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.ChartPackage#getDocumentRoot_ErrorUpperLimit()
	 * @model unsettable="true" dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Double"
	 *        extendedMetaData="kind='attribute' name='error-upper-limit' namespace='##targetNamespace'"
	 * @generated
	 */
	double getErrorUpperLimit();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getErrorUpperLimit <em>Error Upper Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Error Upper Limit</em>' attribute.
	 * @see #isSetErrorUpperLimit()
	 * @see #unsetErrorUpperLimit()
	 * @see #getErrorUpperLimit()
	 * @generated
	 */
	void setErrorUpperLimit(double value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getErrorUpperLimit <em>Error Upper Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetErrorUpperLimit()
	 * @see #getErrorUpperLimit()
	 * @see #setErrorUpperLimit(double)
	 * @generated
	 */
	void unsetErrorUpperLimit();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getErrorUpperLimit <em>Error Upper Limit</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Error Upper Limit</em>' attribute is set.
	 * @see #unsetErrorUpperLimit()
	 * @see #getErrorUpperLimit()
	 * @see #setErrorUpperLimit(double)
	 * @generated
	 */
	boolean isSetErrorUpperLimit();

	/**
	 * Returns the value of the '<em><b>Gap Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gap Width</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gap Width</em>' attribute.
	 * @see #setGapWidth(BigInteger)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.ChartPackage#getDocumentRoot_GapWidth()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Integer"
	 *        extendedMetaData="kind='attribute' name='gap-width' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getGapWidth();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getGapWidth <em>Gap Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gap Width</em>' attribute.
	 * @see #getGapWidth()
	 * @generated
	 */
	void setGapWidth(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Interpolation</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.chart.InterpolationType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interpolation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interpolation</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.InterpolationType
	 * @see #isSetInterpolation()
	 * @see #unsetInterpolation()
	 * @see #setInterpolation(InterpolationType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.ChartPackage#getDocumentRoot_Interpolation()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='interpolation' namespace='##targetNamespace'"
	 * @generated
	 */
	InterpolationType getInterpolation();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getInterpolation <em>Interpolation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interpolation</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.InterpolationType
	 * @see #isSetInterpolation()
	 * @see #unsetInterpolation()
	 * @see #getInterpolation()
	 * @generated
	 */
	void setInterpolation(InterpolationType value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getInterpolation <em>Interpolation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetInterpolation()
	 * @see #getInterpolation()
	 * @see #setInterpolation(InterpolationType)
	 * @generated
	 */
	void unsetInterpolation();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getInterpolation <em>Interpolation</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Interpolation</em>' attribute is set.
	 * @see #unsetInterpolation()
	 * @see #getInterpolation()
	 * @see #setInterpolation(InterpolationType)
	 * @generated
	 */
	boolean isSetInterpolation();

	/**
	 * Returns the value of the '<em><b>Interval Major</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interval Major</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interval Major</em>' attribute.
	 * @see #isSetIntervalMajor()
	 * @see #unsetIntervalMajor()
	 * @see #setIntervalMajor(double)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.ChartPackage#getDocumentRoot_IntervalMajor()
	 * @model unsettable="true" dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Double"
	 *        extendedMetaData="kind='attribute' name='interval-major' namespace='##targetNamespace'"
	 * @generated
	 */
	double getIntervalMajor();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getIntervalMajor <em>Interval Major</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interval Major</em>' attribute.
	 * @see #isSetIntervalMajor()
	 * @see #unsetIntervalMajor()
	 * @see #getIntervalMajor()
	 * @generated
	 */
	void setIntervalMajor(double value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getIntervalMajor <em>Interval Major</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIntervalMajor()
	 * @see #getIntervalMajor()
	 * @see #setIntervalMajor(double)
	 * @generated
	 */
	void unsetIntervalMajor();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getIntervalMajor <em>Interval Major</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Interval Major</em>' attribute is set.
	 * @see #unsetIntervalMajor()
	 * @see #getIntervalMajor()
	 * @see #setIntervalMajor(double)
	 * @generated
	 */
	boolean isSetIntervalMajor();

	/**
	 * Returns the value of the '<em><b>Interval Minor Divisor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interval Minor Divisor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interval Minor Divisor</em>' attribute.
	 * @see #setIntervalMinorDivisor(BigInteger)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.ChartPackage#getDocumentRoot_IntervalMinorDivisor()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.PositiveInteger"
	 *        extendedMetaData="kind='attribute' name='interval-minor-divisor' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getIntervalMinorDivisor();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getIntervalMinorDivisor <em>Interval Minor Divisor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interval Minor Divisor</em>' attribute.
	 * @see #getIntervalMinorDivisor()
	 * @generated
	 */
	void setIntervalMinorDivisor(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Japanese Candle Stick</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Japanese Candle Stick</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Japanese Candle Stick</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetJapaneseCandleStick()
	 * @see #unsetJapaneseCandleStick()
	 * @see #setJapaneseCandleStick(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.ChartPackage#getDocumentRoot_JapaneseCandleStick()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='japanese-candle-stick' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getJapaneseCandleStick();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getJapaneseCandleStick <em>Japanese Candle Stick</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Japanese Candle Stick</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetJapaneseCandleStick()
	 * @see #unsetJapaneseCandleStick()
	 * @see #getJapaneseCandleStick()
	 * @generated
	 */
	void setJapaneseCandleStick(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getJapaneseCandleStick <em>Japanese Candle Stick</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetJapaneseCandleStick()
	 * @see #getJapaneseCandleStick()
	 * @see #setJapaneseCandleStick(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetJapaneseCandleStick();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getJapaneseCandleStick <em>Japanese Candle Stick</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Japanese Candle Stick</em>' attribute is set.
	 * @see #unsetJapaneseCandleStick()
	 * @see #getJapaneseCandleStick()
	 * @see #setJapaneseCandleStick(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetJapaneseCandleStick();

	/**
	 * Returns the value of the '<em><b>Label Arrangement</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.chart.LabelArrangementType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label Arrangement</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label Arrangement</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.LabelArrangementType
	 * @see #isSetLabelArrangement()
	 * @see #unsetLabelArrangement()
	 * @see #setLabelArrangement(LabelArrangementType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.ChartPackage#getDocumentRoot_LabelArrangement()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='label-arrangement' namespace='##targetNamespace'"
	 * @generated
	 */
	LabelArrangementType getLabelArrangement();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getLabelArrangement <em>Label Arrangement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label Arrangement</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.LabelArrangementType
	 * @see #isSetLabelArrangement()
	 * @see #unsetLabelArrangement()
	 * @see #getLabelArrangement()
	 * @generated
	 */
	void setLabelArrangement(LabelArrangementType value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getLabelArrangement <em>Label Arrangement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLabelArrangement()
	 * @see #getLabelArrangement()
	 * @see #setLabelArrangement(LabelArrangementType)
	 * @generated
	 */
	void unsetLabelArrangement();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getLabelArrangement <em>Label Arrangement</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Label Arrangement</em>' attribute is set.
	 * @see #unsetLabelArrangement()
	 * @see #getLabelArrangement()
	 * @see #setLabelArrangement(LabelArrangementType)
	 * @generated
	 */
	boolean isSetLabelArrangement();

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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.ChartPackage#getDocumentRoot_LabelCellAddress()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.CellAddress"
	 *        extendedMetaData="kind='attribute' name='label-cell-address' namespace='##targetNamespace'"
	 * @generated
	 */
	String getLabelCellAddress();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getLabelCellAddress <em>Label Cell Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label Cell Address</em>' attribute.
	 * @see #getLabelCellAddress()
	 * @generated
	 */
	void setLabelCellAddress(String value);

	/**
	 * Returns the value of the '<em><b>Legend Align</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.chart.LegendAlignType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Legend Align</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Legend Align</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.LegendAlignType
	 * @see #isSetLegendAlign()
	 * @see #unsetLegendAlign()
	 * @see #setLegendAlign(LegendAlignType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.ChartPackage#getDocumentRoot_LegendAlign()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='legend-align' namespace='##targetNamespace'"
	 * @generated
	 */
	LegendAlignType getLegendAlign();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getLegendAlign <em>Legend Align</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Legend Align</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.LegendAlignType
	 * @see #isSetLegendAlign()
	 * @see #unsetLegendAlign()
	 * @see #getLegendAlign()
	 * @generated
	 */
	void setLegendAlign(LegendAlignType value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getLegendAlign <em>Legend Align</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLegendAlign()
	 * @see #getLegendAlign()
	 * @see #setLegendAlign(LegendAlignType)
	 * @generated
	 */
	void unsetLegendAlign();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getLegendAlign <em>Legend Align</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Legend Align</em>' attribute is set.
	 * @see #unsetLegendAlign()
	 * @see #getLegendAlign()
	 * @see #setLegendAlign(LegendAlignType)
	 * @generated
	 */
	boolean isSetLegendAlign();

	/**
	 * Returns the value of the '<em><b>Legend Position</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.chart.LegendPositionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Legend Position</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Legend Position</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.LegendPositionType
	 * @see #isSetLegendPosition()
	 * @see #unsetLegendPosition()
	 * @see #setLegendPosition(LegendPositionType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.ChartPackage#getDocumentRoot_LegendPosition()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='legend-position' namespace='##targetNamespace'"
	 * @generated
	 */
	LegendPositionType getLegendPosition();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getLegendPosition <em>Legend Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Legend Position</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.LegendPositionType
	 * @see #isSetLegendPosition()
	 * @see #unsetLegendPosition()
	 * @see #getLegendPosition()
	 * @generated
	 */
	void setLegendPosition(LegendPositionType value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getLegendPosition <em>Legend Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLegendPosition()
	 * @see #getLegendPosition()
	 * @see #setLegendPosition(LegendPositionType)
	 * @generated
	 */
	void unsetLegendPosition();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getLegendPosition <em>Legend Position</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Legend Position</em>' attribute is set.
	 * @see #unsetLegendPosition()
	 * @see #getLegendPosition()
	 * @see #setLegendPosition(LegendPositionType)
	 * @generated
	 */
	boolean isSetLegendPosition();

	/**
	 * Returns the value of the '<em><b>Lines</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lines</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lines</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetLines()
	 * @see #unsetLines()
	 * @see #setLines(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.ChartPackage#getDocumentRoot_Lines()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='lines' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getLines();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getLines <em>Lines</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lines</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetLines()
	 * @see #unsetLines()
	 * @see #getLines()
	 * @generated
	 */
	void setLines(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getLines <em>Lines</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLines()
	 * @see #getLines()
	 * @see #setLines(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetLines();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getLines <em>Lines</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Lines</em>' attribute is set.
	 * @see #unsetLines()
	 * @see #getLines()
	 * @see #setLines(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetLines();

	/**
	 * Returns the value of the '<em><b>Link Data Style To Source</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Link Data Style To Source</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link Data Style To Source</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetLinkDataStyleToSource()
	 * @see #unsetLinkDataStyleToSource()
	 * @see #setLinkDataStyleToSource(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.ChartPackage#getDocumentRoot_LinkDataStyleToSource()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='link-data-style-to-source' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getLinkDataStyleToSource();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getLinkDataStyleToSource <em>Link Data Style To Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Link Data Style To Source</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetLinkDataStyleToSource()
	 * @see #unsetLinkDataStyleToSource()
	 * @see #getLinkDataStyleToSource()
	 * @generated
	 */
	void setLinkDataStyleToSource(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getLinkDataStyleToSource <em>Link Data Style To Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLinkDataStyleToSource()
	 * @see #getLinkDataStyleToSource()
	 * @see #setLinkDataStyleToSource(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetLinkDataStyleToSource();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getLinkDataStyleToSource <em>Link Data Style To Source</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Link Data Style To Source</em>' attribute is set.
	 * @see #unsetLinkDataStyleToSource()
	 * @see #getLinkDataStyleToSource()
	 * @see #setLinkDataStyleToSource(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetLinkDataStyleToSource();

	/**
	 * Returns the value of the '<em><b>Logarithmic</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Logarithmic</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Logarithmic</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetLogarithmic()
	 * @see #unsetLogarithmic()
	 * @see #setLogarithmic(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.ChartPackage#getDocumentRoot_Logarithmic()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='logarithmic' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getLogarithmic();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getLogarithmic <em>Logarithmic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Logarithmic</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetLogarithmic()
	 * @see #unsetLogarithmic()
	 * @see #getLogarithmic()
	 * @generated
	 */
	void setLogarithmic(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getLogarithmic <em>Logarithmic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLogarithmic()
	 * @see #getLogarithmic()
	 * @see #setLogarithmic(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetLogarithmic();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getLogarithmic <em>Logarithmic</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Logarithmic</em>' attribute is set.
	 * @see #unsetLogarithmic()
	 * @see #getLogarithmic()
	 * @see #setLogarithmic(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetLogarithmic();

	/**
	 * Returns the value of the '<em><b>Maximum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maximum</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maximum</em>' attribute.
	 * @see #isSetMaximum()
	 * @see #unsetMaximum()
	 * @see #setMaximum(double)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.ChartPackage#getDocumentRoot_Maximum()
	 * @model unsettable="true" dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Double"
	 *        extendedMetaData="kind='attribute' name='maximum' namespace='##targetNamespace'"
	 * @generated
	 */
	double getMaximum();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getMaximum <em>Maximum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum</em>' attribute.
	 * @see #isSetMaximum()
	 * @see #unsetMaximum()
	 * @see #getMaximum()
	 * @generated
	 */
	void setMaximum(double value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getMaximum <em>Maximum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMaximum()
	 * @see #getMaximum()
	 * @see #setMaximum(double)
	 * @generated
	 */
	void unsetMaximum();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getMaximum <em>Maximum</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Maximum</em>' attribute is set.
	 * @see #unsetMaximum()
	 * @see #getMaximum()
	 * @see #setMaximum(double)
	 * @generated
	 */
	boolean isSetMaximum();

	/**
	 * Returns the value of the '<em><b>Mean Value1</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mean Value1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mean Value1</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetMeanValue1()
	 * @see #unsetMeanValue1()
	 * @see #setMeanValue1(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.ChartPackage#getDocumentRoot_MeanValue1()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='mean-value' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getMeanValue1();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getMeanValue1 <em>Mean Value1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mean Value1</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetMeanValue1()
	 * @see #unsetMeanValue1()
	 * @see #getMeanValue1()
	 * @generated
	 */
	void setMeanValue1(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getMeanValue1 <em>Mean Value1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMeanValue1()
	 * @see #getMeanValue1()
	 * @see #setMeanValue1(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetMeanValue1();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getMeanValue1 <em>Mean Value1</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Mean Value1</em>' attribute is set.
	 * @see #unsetMeanValue1()
	 * @see #getMeanValue1()
	 * @see #setMeanValue1(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetMeanValue1();

	/**
	 * Returns the value of the '<em><b>Minimum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Minimum</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minimum</em>' attribute.
	 * @see #isSetMinimum()
	 * @see #unsetMinimum()
	 * @see #setMinimum(double)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.ChartPackage#getDocumentRoot_Minimum()
	 * @model unsettable="true" dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Double"
	 *        extendedMetaData="kind='attribute' name='minimum' namespace='##targetNamespace'"
	 * @generated
	 */
	double getMinimum();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getMinimum <em>Minimum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minimum</em>' attribute.
	 * @see #isSetMinimum()
	 * @see #unsetMinimum()
	 * @see #getMinimum()
	 * @generated
	 */
	void setMinimum(double value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getMinimum <em>Minimum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMinimum()
	 * @see #getMinimum()
	 * @see #setMinimum(double)
	 * @generated
	 */
	void unsetMinimum();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getMinimum <em>Minimum</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Minimum</em>' attribute is set.
	 * @see #unsetMinimum()
	 * @see #getMinimum()
	 * @see #setMinimum(double)
	 * @generated
	 */
	boolean isSetMinimum();

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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.ChartPackage#getDocumentRoot_Name()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Origin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Origin</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Origin</em>' attribute.
	 * @see #isSetOrigin()
	 * @see #unsetOrigin()
	 * @see #setOrigin(double)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.ChartPackage#getDocumentRoot_Origin()
	 * @model unsettable="true" dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Double"
	 *        extendedMetaData="kind='attribute' name='origin' namespace='##targetNamespace'"
	 * @generated
	 */
	double getOrigin();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getOrigin <em>Origin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Origin</em>' attribute.
	 * @see #isSetOrigin()
	 * @see #unsetOrigin()
	 * @see #getOrigin()
	 * @generated
	 */
	void setOrigin(double value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getOrigin <em>Origin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetOrigin()
	 * @see #getOrigin()
	 * @see #setOrigin(double)
	 * @generated
	 */
	void unsetOrigin();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getOrigin <em>Origin</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Origin</em>' attribute is set.
	 * @see #unsetOrigin()
	 * @see #getOrigin()
	 * @see #setOrigin(double)
	 * @generated
	 */
	boolean isSetOrigin();

	/**
	 * Returns the value of the '<em><b>Overlap</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Overlap</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Overlap</em>' attribute.
	 * @see #setOverlap(BigInteger)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.ChartPackage#getDocumentRoot_Overlap()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Integer"
	 *        extendedMetaData="kind='attribute' name='overlap' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getOverlap();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getOverlap <em>Overlap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Overlap</em>' attribute.
	 * @see #getOverlap()
	 * @generated
	 */
	void setOverlap(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Percentage</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Percentage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Percentage</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetPercentage()
	 * @see #unsetPercentage()
	 * @see #setPercentage(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.ChartPackage#getDocumentRoot_Percentage()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='percentage' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getPercentage();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getPercentage <em>Percentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Percentage</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetPercentage()
	 * @see #unsetPercentage()
	 * @see #getPercentage()
	 * @generated
	 */
	void setPercentage(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getPercentage <em>Percentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPercentage()
	 * @see #getPercentage()
	 * @see #setPercentage(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetPercentage();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getPercentage <em>Percentage</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Percentage</em>' attribute is set.
	 * @see #unsetPercentage()
	 * @see #getPercentage()
	 * @see #setPercentage(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetPercentage();

	/**
	 * Returns the value of the '<em><b>Pie Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pie Offset</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pie Offset</em>' attribute.
	 * @see #setPieOffset(BigInteger)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.ChartPackage#getDocumentRoot_PieOffset()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.NonNegativeInteger"
	 *        extendedMetaData="kind='attribute' name='pie-offset' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getPieOffset();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getPieOffset <em>Pie Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pie Offset</em>' attribute.
	 * @see #getPieOffset()
	 * @generated
	 */
	void setPieOffset(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Regression Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.chart.RegressionTypeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Regression Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Regression Type</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.RegressionTypeType
	 * @see #isSetRegressionType()
	 * @see #unsetRegressionType()
	 * @see #setRegressionType(RegressionTypeType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.ChartPackage#getDocumentRoot_RegressionType()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='regression-type' namespace='##targetNamespace'"
	 * @generated
	 */
	RegressionTypeType getRegressionType();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getRegressionType <em>Regression Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Regression Type</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.RegressionTypeType
	 * @see #isSetRegressionType()
	 * @see #unsetRegressionType()
	 * @see #getRegressionType()
	 * @generated
	 */
	void setRegressionType(RegressionTypeType value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getRegressionType <em>Regression Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRegressionType()
	 * @see #getRegressionType()
	 * @see #setRegressionType(RegressionTypeType)
	 * @generated
	 */
	void unsetRegressionType();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getRegressionType <em>Regression Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Regression Type</em>' attribute is set.
	 * @see #unsetRegressionType()
	 * @see #getRegressionType()
	 * @see #setRegressionType(RegressionTypeType)
	 * @generated
	 */
	boolean isSetRegressionType();

	/**
	 * Returns the value of the '<em><b>Repeated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Repeated</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repeated</em>' attribute.
	 * @see #setRepeated(BigInteger)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.ChartPackage#getDocumentRoot_Repeated()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.NonNegativeInteger"
	 *        extendedMetaData="kind='attribute' name='repeated' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getRepeated();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getRepeated <em>Repeated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repeated</em>' attribute.
	 * @see #getRepeated()
	 * @generated
	 */
	void setRepeated(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Row Mapping</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Row Mapping</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Row Mapping</em>' attribute.
	 * @see #setRowMapping(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.ChartPackage#getDocumentRoot_RowMapping()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='row-mapping' namespace='##targetNamespace'"
	 * @generated
	 */
	String getRowMapping();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getRowMapping <em>Row Mapping</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Row Mapping</em>' attribute.
	 * @see #getRowMapping()
	 * @generated
	 */
	void setRowMapping(String value);

	/**
	 * Returns the value of the '<em><b>Scale Text</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scale Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scale Text</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetScaleText()
	 * @see #unsetScaleText()
	 * @see #setScaleText(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.ChartPackage#getDocumentRoot_ScaleText()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='scale-text' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getScaleText();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getScaleText <em>Scale Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scale Text</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetScaleText()
	 * @see #unsetScaleText()
	 * @see #getScaleText()
	 * @generated
	 */
	void setScaleText(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getScaleText <em>Scale Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetScaleText()
	 * @see #getScaleText()
	 * @see #setScaleText(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetScaleText();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getScaleText <em>Scale Text</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Scale Text</em>' attribute is set.
	 * @see #unsetScaleText()
	 * @see #getScaleText()
	 * @see #setScaleText(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetScaleText();

	/**
	 * Returns the value of the '<em><b>Series Source</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.chart.SeriesSourceType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Series Source</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Series Source</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.SeriesSourceType
	 * @see #isSetSeriesSource()
	 * @see #unsetSeriesSource()
	 * @see #setSeriesSource(SeriesSourceType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.ChartPackage#getDocumentRoot_SeriesSource()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='series-source' namespace='##targetNamespace'"
	 * @generated
	 */
	SeriesSourceType getSeriesSource();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getSeriesSource <em>Series Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Series Source</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.SeriesSourceType
	 * @see #isSetSeriesSource()
	 * @see #unsetSeriesSource()
	 * @see #getSeriesSource()
	 * @generated
	 */
	void setSeriesSource(SeriesSourceType value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getSeriesSource <em>Series Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSeriesSource()
	 * @see #getSeriesSource()
	 * @see #setSeriesSource(SeriesSourceType)
	 * @generated
	 */
	void unsetSeriesSource();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getSeriesSource <em>Series Source</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Series Source</em>' attribute is set.
	 * @see #unsetSeriesSource()
	 * @see #getSeriesSource()
	 * @see #setSeriesSource(SeriesSourceType)
	 * @generated
	 */
	boolean isSetSeriesSource();

	/**
	 * Returns the value of the '<em><b>Solid Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.chart.SolidTypeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Solid Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Solid Type</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.SolidTypeType
	 * @see #isSetSolidType()
	 * @see #unsetSolidType()
	 * @see #setSolidType(SolidTypeType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.ChartPackage#getDocumentRoot_SolidType()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='solid-type' namespace='##targetNamespace'"
	 * @generated
	 */
	SolidTypeType getSolidType();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getSolidType <em>Solid Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Solid Type</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.SolidTypeType
	 * @see #isSetSolidType()
	 * @see #unsetSolidType()
	 * @see #getSolidType()
	 * @generated
	 */
	void setSolidType(SolidTypeType value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getSolidType <em>Solid Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSolidType()
	 * @see #getSolidType()
	 * @see #setSolidType(SolidTypeType)
	 * @generated
	 */
	void unsetSolidType();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getSolidType <em>Solid Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Solid Type</em>' attribute is set.
	 * @see #unsetSolidType()
	 * @see #getSolidType()
	 * @see #setSolidType(SolidTypeType)
	 * @generated
	 */
	boolean isSetSolidType();

	/**
	 * Returns the value of the '<em><b>Spline Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Spline Order</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spline Order</em>' attribute.
	 * @see #setSplineOrder(BigInteger)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.ChartPackage#getDocumentRoot_SplineOrder()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.PositiveInteger"
	 *        extendedMetaData="kind='attribute' name='spline-order' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getSplineOrder();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getSplineOrder <em>Spline Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Spline Order</em>' attribute.
	 * @see #getSplineOrder()
	 * @generated
	 */
	void setSplineOrder(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Spline Resolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Spline Resolution</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spline Resolution</em>' attribute.
	 * @see #setSplineResolution(BigInteger)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.ChartPackage#getDocumentRoot_SplineResolution()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.PositiveInteger"
	 *        extendedMetaData="kind='attribute' name='spline-resolution' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getSplineResolution();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getSplineResolution <em>Spline Resolution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Spline Resolution</em>' attribute.
	 * @see #getSplineResolution()
	 * @generated
	 */
	void setSplineResolution(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Stacked</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stacked</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stacked</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetStacked()
	 * @see #unsetStacked()
	 * @see #setStacked(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.ChartPackage#getDocumentRoot_Stacked()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='stacked' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getStacked();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getStacked <em>Stacked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stacked</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetStacked()
	 * @see #unsetStacked()
	 * @see #getStacked()
	 * @generated
	 */
	void setStacked(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getStacked <em>Stacked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStacked()
	 * @see #getStacked()
	 * @see #setStacked(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetStacked();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getStacked <em>Stacked</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Stacked</em>' attribute is set.
	 * @see #unsetStacked()
	 * @see #getStacked()
	 * @see #setStacked(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetStacked();

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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.ChartPackage#getDocumentRoot_StyleName()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.chart.StyleNameType"
	 *        extendedMetaData="kind='attribute' name='style-name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getStyleName();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getStyleName <em>Style Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style Name</em>' attribute.
	 * @see #getStyleName()
	 * @generated
	 */
	void setStyleName(String value);

	/**
	 * Returns the value of the '<em><b>Symbol Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Symbol Height</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Symbol Height</em>' attribute.
	 * @see #setSymbolHeight(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.ChartPackage#getDocumentRoot_SymbolHeight()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.NonNegativeLength"
	 *        extendedMetaData="kind='attribute' name='symbol-height' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSymbolHeight();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getSymbolHeight <em>Symbol Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Symbol Height</em>' attribute.
	 * @see #getSymbolHeight()
	 * @generated
	 */
	void setSymbolHeight(String value);

	/**
	 * Returns the value of the '<em><b>Symbol Name</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.chart.SymbolNameType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Symbol Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Symbol Name</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.SymbolNameType
	 * @see #isSetSymbolName()
	 * @see #unsetSymbolName()
	 * @see #setSymbolName(SymbolNameType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.ChartPackage#getDocumentRoot_SymbolName()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='symbol-name' namespace='##targetNamespace'"
	 * @generated
	 */
	SymbolNameType getSymbolName();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getSymbolName <em>Symbol Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Symbol Name</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.SymbolNameType
	 * @see #isSetSymbolName()
	 * @see #unsetSymbolName()
	 * @see #getSymbolName()
	 * @generated
	 */
	void setSymbolName(SymbolNameType value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getSymbolName <em>Symbol Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSymbolName()
	 * @see #getSymbolName()
	 * @see #setSymbolName(SymbolNameType)
	 * @generated
	 */
	void unsetSymbolName();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getSymbolName <em>Symbol Name</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Symbol Name</em>' attribute is set.
	 * @see #unsetSymbolName()
	 * @see #getSymbolName()
	 * @see #setSymbolName(SymbolNameType)
	 * @generated
	 */
	boolean isSetSymbolName();

	/**
	 * Returns the value of the '<em><b>Symbol Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.chart.SymbolTypeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Symbol Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Symbol Type</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.SymbolTypeType
	 * @see #isSetSymbolType()
	 * @see #unsetSymbolType()
	 * @see #setSymbolType(SymbolTypeType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.ChartPackage#getDocumentRoot_SymbolType()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='symbol-type' namespace='##targetNamespace'"
	 * @generated
	 */
	SymbolTypeType getSymbolType();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getSymbolType <em>Symbol Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Symbol Type</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.SymbolTypeType
	 * @see #isSetSymbolType()
	 * @see #unsetSymbolType()
	 * @see #getSymbolType()
	 * @generated
	 */
	void setSymbolType(SymbolTypeType value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getSymbolType <em>Symbol Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSymbolType()
	 * @see #getSymbolType()
	 * @see #setSymbolType(SymbolTypeType)
	 * @generated
	 */
	void unsetSymbolType();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getSymbolType <em>Symbol Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Symbol Type</em>' attribute is set.
	 * @see #unsetSymbolType()
	 * @see #getSymbolType()
	 * @see #setSymbolType(SymbolTypeType)
	 * @generated
	 */
	boolean isSetSymbolType();

	/**
	 * Returns the value of the '<em><b>Symbol Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Symbol Width</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Symbol Width</em>' attribute.
	 * @see #setSymbolWidth(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.ChartPackage#getDocumentRoot_SymbolWidth()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.NonNegativeLength"
	 *        extendedMetaData="kind='attribute' name='symbol-width' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSymbolWidth();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getSymbolWidth <em>Symbol Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Symbol Width</em>' attribute.
	 * @see #getSymbolWidth()
	 * @generated
	 */
	void setSymbolWidth(String value);

	/**
	 * Returns the value of the '<em><b>Text Overlap</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text Overlap</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text Overlap</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetTextOverlap()
	 * @see #unsetTextOverlap()
	 * @see #setTextOverlap(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.ChartPackage#getDocumentRoot_TextOverlap()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='text-overlap' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getTextOverlap();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getTextOverlap <em>Text Overlap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Overlap</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetTextOverlap()
	 * @see #unsetTextOverlap()
	 * @see #getTextOverlap()
	 * @generated
	 */
	void setTextOverlap(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getTextOverlap <em>Text Overlap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTextOverlap()
	 * @see #getTextOverlap()
	 * @see #setTextOverlap(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetTextOverlap();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getTextOverlap <em>Text Overlap</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Text Overlap</em>' attribute is set.
	 * @see #unsetTextOverlap()
	 * @see #getTextOverlap()
	 * @see #setTextOverlap(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetTextOverlap();

	/**
	 * Returns the value of the '<em><b>Three Dimensional</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Three Dimensional</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Three Dimensional</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetThreeDimensional()
	 * @see #unsetThreeDimensional()
	 * @see #setThreeDimensional(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.ChartPackage#getDocumentRoot_ThreeDimensional()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='three-dimensional' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getThreeDimensional();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getThreeDimensional <em>Three Dimensional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Three Dimensional</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetThreeDimensional()
	 * @see #unsetThreeDimensional()
	 * @see #getThreeDimensional()
	 * @generated
	 */
	void setThreeDimensional(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getThreeDimensional <em>Three Dimensional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetThreeDimensional()
	 * @see #getThreeDimensional()
	 * @see #setThreeDimensional(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetThreeDimensional();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getThreeDimensional <em>Three Dimensional</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Three Dimensional</em>' attribute is set.
	 * @see #unsetThreeDimensional()
	 * @see #getThreeDimensional()
	 * @see #setThreeDimensional(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetThreeDimensional();

	/**
	 * Returns the value of the '<em><b>Tick Marks Major Inner</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tick Marks Major Inner</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tick Marks Major Inner</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetTickMarksMajorInner()
	 * @see #unsetTickMarksMajorInner()
	 * @see #setTickMarksMajorInner(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.ChartPackage#getDocumentRoot_TickMarksMajorInner()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='tick-marks-major-inner' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getTickMarksMajorInner();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getTickMarksMajorInner <em>Tick Marks Major Inner</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tick Marks Major Inner</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetTickMarksMajorInner()
	 * @see #unsetTickMarksMajorInner()
	 * @see #getTickMarksMajorInner()
	 * @generated
	 */
	void setTickMarksMajorInner(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getTickMarksMajorInner <em>Tick Marks Major Inner</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTickMarksMajorInner()
	 * @see #getTickMarksMajorInner()
	 * @see #setTickMarksMajorInner(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetTickMarksMajorInner();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getTickMarksMajorInner <em>Tick Marks Major Inner</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Tick Marks Major Inner</em>' attribute is set.
	 * @see #unsetTickMarksMajorInner()
	 * @see #getTickMarksMajorInner()
	 * @see #setTickMarksMajorInner(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetTickMarksMajorInner();

	/**
	 * Returns the value of the '<em><b>Tick Marks Major Outer</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tick Marks Major Outer</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tick Marks Major Outer</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetTickMarksMajorOuter()
	 * @see #unsetTickMarksMajorOuter()
	 * @see #setTickMarksMajorOuter(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.ChartPackage#getDocumentRoot_TickMarksMajorOuter()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='tick-marks-major-outer' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getTickMarksMajorOuter();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getTickMarksMajorOuter <em>Tick Marks Major Outer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tick Marks Major Outer</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetTickMarksMajorOuter()
	 * @see #unsetTickMarksMajorOuter()
	 * @see #getTickMarksMajorOuter()
	 * @generated
	 */
	void setTickMarksMajorOuter(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getTickMarksMajorOuter <em>Tick Marks Major Outer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTickMarksMajorOuter()
	 * @see #getTickMarksMajorOuter()
	 * @see #setTickMarksMajorOuter(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetTickMarksMajorOuter();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getTickMarksMajorOuter <em>Tick Marks Major Outer</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Tick Marks Major Outer</em>' attribute is set.
	 * @see #unsetTickMarksMajorOuter()
	 * @see #getTickMarksMajorOuter()
	 * @see #setTickMarksMajorOuter(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetTickMarksMajorOuter();

	/**
	 * Returns the value of the '<em><b>Tick Marks Minor Inner</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tick Marks Minor Inner</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tick Marks Minor Inner</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetTickMarksMinorInner()
	 * @see #unsetTickMarksMinorInner()
	 * @see #setTickMarksMinorInner(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.ChartPackage#getDocumentRoot_TickMarksMinorInner()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='tick-marks-minor-inner' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getTickMarksMinorInner();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getTickMarksMinorInner <em>Tick Marks Minor Inner</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tick Marks Minor Inner</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetTickMarksMinorInner()
	 * @see #unsetTickMarksMinorInner()
	 * @see #getTickMarksMinorInner()
	 * @generated
	 */
	void setTickMarksMinorInner(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getTickMarksMinorInner <em>Tick Marks Minor Inner</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTickMarksMinorInner()
	 * @see #getTickMarksMinorInner()
	 * @see #setTickMarksMinorInner(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetTickMarksMinorInner();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getTickMarksMinorInner <em>Tick Marks Minor Inner</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Tick Marks Minor Inner</em>' attribute is set.
	 * @see #unsetTickMarksMinorInner()
	 * @see #getTickMarksMinorInner()
	 * @see #setTickMarksMinorInner(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetTickMarksMinorInner();

	/**
	 * Returns the value of the '<em><b>Tick Marks Minor Outer</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tick Marks Minor Outer</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tick Marks Minor Outer</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetTickMarksMinorOuter()
	 * @see #unsetTickMarksMinorOuter()
	 * @see #setTickMarksMinorOuter(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.ChartPackage#getDocumentRoot_TickMarksMinorOuter()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='tick-marks-minor-outer' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getTickMarksMinorOuter();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getTickMarksMinorOuter <em>Tick Marks Minor Outer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tick Marks Minor Outer</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetTickMarksMinorOuter()
	 * @see #unsetTickMarksMinorOuter()
	 * @see #getTickMarksMinorOuter()
	 * @generated
	 */
	void setTickMarksMinorOuter(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getTickMarksMinorOuter <em>Tick Marks Minor Outer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTickMarksMinorOuter()
	 * @see #getTickMarksMinorOuter()
	 * @see #setTickMarksMinorOuter(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetTickMarksMinorOuter();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getTickMarksMinorOuter <em>Tick Marks Minor Outer</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Tick Marks Minor Outer</em>' attribute is set.
	 * @see #unsetTickMarksMinorOuter()
	 * @see #getTickMarksMinorOuter()
	 * @see #setTickMarksMinorOuter(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetTickMarksMinorOuter();

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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.ChartPackage#getDocumentRoot_ValuesCellRangeAddress()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.CellRangeAddress"
	 *        extendedMetaData="kind='attribute' name='values-cell-range-address' namespace='##targetNamespace'"
	 * @generated
	 */
	String getValuesCellRangeAddress();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getValuesCellRangeAddress <em>Values Cell Range Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Values Cell Range Address</em>' attribute.
	 * @see #getValuesCellRangeAddress()
	 * @generated
	 */
	void setValuesCellRangeAddress(String value);

	/**
	 * Returns the value of the '<em><b>Vertical</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vertical</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vertical</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetVertical()
	 * @see #unsetVertical()
	 * @see #setVertical(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.ChartPackage#getDocumentRoot_Vertical()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='vertical' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getVertical();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getVertical <em>Vertical</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vertical</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetVertical()
	 * @see #unsetVertical()
	 * @see #getVertical()
	 * @generated
	 */
	void setVertical(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getVertical <em>Vertical</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVertical()
	 * @see #getVertical()
	 * @see #setVertical(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetVertical();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getVertical <em>Vertical</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Vertical</em>' attribute is set.
	 * @see #unsetVertical()
	 * @see #getVertical()
	 * @see #setVertical(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetVertical();

	/**
	 * Returns the value of the '<em><b>Visible</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Visible</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visible</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetVisible()
	 * @see #unsetVisible()
	 * @see #setVisible(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.ChartPackage#getDocumentRoot_Visible()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='visible' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getVisible();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getVisible <em>Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visible</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetVisible()
	 * @see #unsetVisible()
	 * @see #getVisible()
	 * @generated
	 */
	void setVisible(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getVisible <em>Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVisible()
	 * @see #getVisible()
	 * @see #setVisible(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetVisible();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot#getVisible <em>Visible</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Visible</em>' attribute is set.
	 * @see #unsetVisible()
	 * @see #getVisible()
	 * @see #setVisible(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetVisible();

} // DocumentRoot
