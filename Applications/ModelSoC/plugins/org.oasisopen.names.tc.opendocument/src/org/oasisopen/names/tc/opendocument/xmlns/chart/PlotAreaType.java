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

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.oasisopen.names.tc.opendocument.xmlns.dr3d.LightType;
import org.oasisopen.names.tc.opendocument.xmlns.dr3d.ProjectionType;
import org.oasisopen.names.tc.opendocument.xmlns.dr3d.ShadeModeType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Plot Area Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.PlotAreaType#getLight <em>Light</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.PlotAreaType#getAxis <em>Axis</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.PlotAreaType#getSeries <em>Series</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.PlotAreaType#getStockGainMarker <em>Stock Gain Marker</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.PlotAreaType#getStockLossMarker <em>Stock Loss Marker</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.PlotAreaType#getStockRangeLine <em>Stock Range Line</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.PlotAreaType#getWall <em>Wall</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.PlotAreaType#getFloor <em>Floor</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.PlotAreaType#getAmbientColor <em>Ambient Color</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.PlotAreaType#getCellRangeAddress <em>Cell Range Address</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.PlotAreaType#getDataSourceHasLabels <em>Data Source Has Labels</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.PlotAreaType#getDistance <em>Distance</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.PlotAreaType#getFocalLength <em>Focal Length</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.PlotAreaType#getHeight <em>Height</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.PlotAreaType#getLightingMode <em>Lighting Mode</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.PlotAreaType#getProjection <em>Projection</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.PlotAreaType#getShadeMode <em>Shade Mode</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.PlotAreaType#getShadowSlant <em>Shadow Slant</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.PlotAreaType#getStyleName <em>Style Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.PlotAreaType#getTransform <em>Transform</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.PlotAreaType#getVpn <em>Vpn</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.PlotAreaType#getVrp <em>Vrp</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.PlotAreaType#getVup <em>Vup</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.PlotAreaType#getWidth <em>Width</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.PlotAreaType#getX <em>X</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.PlotAreaType#getY <em>Y</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.ChartPackage#getPlotAreaType()
 * @model extendedMetaData="name='plot-area_._type' kind='elementOnly'"
 * @generated
 */
public interface PlotAreaType extends EObject {
	/**
	 * Returns the value of the '<em><b>Light</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.LightType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Light</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Light</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.ChartPackage#getPlotAreaType_Light()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='light' namespace='urn:oasis:names:tc:opendocument:xmlns:dr3d:1.0'"
	 * @generated
	 */
	EList<LightType> getLight();

	/**
	 * Returns the value of the '<em><b>Axis</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.chart.AxisType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Axis</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Axis</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.ChartPackage#getPlotAreaType_Axis()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='axis' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AxisType> getAxis();

	/**
	 * Returns the value of the '<em><b>Series</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.chart.SeriesType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Series</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Series</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.ChartPackage#getPlotAreaType_Series()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='series' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SeriesType> getSeries();

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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.ChartPackage#getPlotAreaType_StockGainMarker()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='stock-gain-marker' namespace='##targetNamespace'"
	 * @generated
	 */
	StockGainMarkerType getStockGainMarker();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.PlotAreaType#getStockGainMarker <em>Stock Gain Marker</em>}' containment reference.
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.ChartPackage#getPlotAreaType_StockLossMarker()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='stock-loss-marker' namespace='##targetNamespace'"
	 * @generated
	 */
	StockLossMarkerType getStockLossMarker();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.PlotAreaType#getStockLossMarker <em>Stock Loss Marker</em>}' containment reference.
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.ChartPackage#getPlotAreaType_StockRangeLine()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='stock-range-line' namespace='##targetNamespace'"
	 * @generated
	 */
	StockRangeLineType getStockRangeLine();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.PlotAreaType#getStockRangeLine <em>Stock Range Line</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stock Range Line</em>' containment reference.
	 * @see #getStockRangeLine()
	 * @generated
	 */
	void setStockRangeLine(StockRangeLineType value);

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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.ChartPackage#getPlotAreaType_Wall()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='wall' namespace='##targetNamespace'"
	 * @generated
	 */
	WallType getWall();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.PlotAreaType#getWall <em>Wall</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wall</em>' containment reference.
	 * @see #getWall()
	 * @generated
	 */
	void setWall(WallType value);

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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.ChartPackage#getPlotAreaType_Floor()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='floor' namespace='##targetNamespace'"
	 * @generated
	 */
	FloorType getFloor();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.PlotAreaType#getFloor <em>Floor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Floor</em>' containment reference.
	 * @see #getFloor()
	 * @generated
	 */
	void setFloor(FloorType value);

	/**
	 * Returns the value of the '<em><b>Ambient Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ambient Color</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ambient Color</em>' attribute.
	 * @see #setAmbientColor(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.ChartPackage#getPlotAreaType_AmbientColor()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Color"
	 *        extendedMetaData="kind='attribute' name='ambient-color' namespace='urn:oasis:names:tc:opendocument:xmlns:dr3d:1.0'"
	 * @generated
	 */
	String getAmbientColor();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.PlotAreaType#getAmbientColor <em>Ambient Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ambient Color</em>' attribute.
	 * @see #getAmbientColor()
	 * @generated
	 */
	void setAmbientColor(String value);

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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.ChartPackage#getPlotAreaType_CellRangeAddress()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.CellRangeAddress"
	 *        extendedMetaData="kind='attribute' name='cell-range-address' namespace='urn:oasis:names:tc:opendocument:xmlns:table:1.0'"
	 * @generated
	 */
	String getCellRangeAddress();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.PlotAreaType#getCellRangeAddress <em>Cell Range Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cell Range Address</em>' attribute.
	 * @see #getCellRangeAddress()
	 * @generated
	 */
	void setCellRangeAddress(String value);

	/**
	 * Returns the value of the '<em><b>Data Source Has Labels</b></em>' attribute.
	 * The default value is <code>"none"</code>.
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.ChartPackage#getPlotAreaType_DataSourceHasLabels()
	 * @model default="none" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='data-source-has-labels' namespace='##targetNamespace'"
	 * @generated
	 */
	DataSourceHasLabelsType getDataSourceHasLabels();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.PlotAreaType#getDataSourceHasLabels <em>Data Source Has Labels</em>}' attribute.
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
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.PlotAreaType#getDataSourceHasLabels <em>Data Source Has Labels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDataSourceHasLabels()
	 * @see #getDataSourceHasLabels()
	 * @see #setDataSourceHasLabels(DataSourceHasLabelsType)
	 * @generated
	 */
	void unsetDataSourceHasLabels();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.PlotAreaType#getDataSourceHasLabels <em>Data Source Has Labels</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Distance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distance</em>' attribute.
	 * @see #setDistance(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.ChartPackage#getPlotAreaType_Distance()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Length"
	 *        extendedMetaData="kind='attribute' name='distance' namespace='urn:oasis:names:tc:opendocument:xmlns:dr3d:1.0'"
	 * @generated
	 */
	String getDistance();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.PlotAreaType#getDistance <em>Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distance</em>' attribute.
	 * @see #getDistance()
	 * @generated
	 */
	void setDistance(String value);

	/**
	 * Returns the value of the '<em><b>Focal Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Focal Length</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Focal Length</em>' attribute.
	 * @see #setFocalLength(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.ChartPackage#getPlotAreaType_FocalLength()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Length"
	 *        extendedMetaData="kind='attribute' name='focal-length' namespace='urn:oasis:names:tc:opendocument:xmlns:dr3d:1.0'"
	 * @generated
	 */
	String getFocalLength();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.PlotAreaType#getFocalLength <em>Focal Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Focal Length</em>' attribute.
	 * @see #getFocalLength()
	 * @generated
	 */
	void setFocalLength(String value);

	/**
	 * Returns the value of the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Height</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Height</em>' attribute.
	 * @see #setHeight(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.ChartPackage#getPlotAreaType_Height()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Length" required="true"
	 *        extendedMetaData="kind='attribute' name='height' namespace='urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0'"
	 * @generated
	 */
	String getHeight();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.PlotAreaType#getHeight <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Height</em>' attribute.
	 * @see #getHeight()
	 * @generated
	 */
	void setHeight(String value);

	/**
	 * Returns the value of the '<em><b>Lighting Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lighting Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lighting Mode</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetLightingMode()
	 * @see #unsetLightingMode()
	 * @see #setLightingMode(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.ChartPackage#getPlotAreaType_LightingMode()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='lighting-mode' namespace='urn:oasis:names:tc:opendocument:xmlns:dr3d:1.0'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getLightingMode();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.PlotAreaType#getLightingMode <em>Lighting Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lighting Mode</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetLightingMode()
	 * @see #unsetLightingMode()
	 * @see #getLightingMode()
	 * @generated
	 */
	void setLightingMode(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.PlotAreaType#getLightingMode <em>Lighting Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLightingMode()
	 * @see #getLightingMode()
	 * @see #setLightingMode(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetLightingMode();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.PlotAreaType#getLightingMode <em>Lighting Mode</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Lighting Mode</em>' attribute is set.
	 * @see #unsetLightingMode()
	 * @see #getLightingMode()
	 * @see #setLightingMode(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetLightingMode();

	/**
	 * Returns the value of the '<em><b>Projection</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.ProjectionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Projection</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Projection</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.ProjectionType
	 * @see #isSetProjection()
	 * @see #unsetProjection()
	 * @see #setProjection(ProjectionType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.ChartPackage#getPlotAreaType_Projection()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='projection' namespace='urn:oasis:names:tc:opendocument:xmlns:dr3d:1.0'"
	 * @generated
	 */
	ProjectionType getProjection();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.PlotAreaType#getProjection <em>Projection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Projection</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.ProjectionType
	 * @see #isSetProjection()
	 * @see #unsetProjection()
	 * @see #getProjection()
	 * @generated
	 */
	void setProjection(ProjectionType value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.PlotAreaType#getProjection <em>Projection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetProjection()
	 * @see #getProjection()
	 * @see #setProjection(ProjectionType)
	 * @generated
	 */
	void unsetProjection();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.PlotAreaType#getProjection <em>Projection</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Projection</em>' attribute is set.
	 * @see #unsetProjection()
	 * @see #getProjection()
	 * @see #setProjection(ProjectionType)
	 * @generated
	 */
	boolean isSetProjection();

	/**
	 * Returns the value of the '<em><b>Shade Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.ShadeModeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shade Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shade Mode</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.ShadeModeType
	 * @see #isSetShadeMode()
	 * @see #unsetShadeMode()
	 * @see #setShadeMode(ShadeModeType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.ChartPackage#getPlotAreaType_ShadeMode()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='shade-mode' namespace='urn:oasis:names:tc:opendocument:xmlns:dr3d:1.0'"
	 * @generated
	 */
	ShadeModeType getShadeMode();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.PlotAreaType#getShadeMode <em>Shade Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shade Mode</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.ShadeModeType
	 * @see #isSetShadeMode()
	 * @see #unsetShadeMode()
	 * @see #getShadeMode()
	 * @generated
	 */
	void setShadeMode(ShadeModeType value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.PlotAreaType#getShadeMode <em>Shade Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetShadeMode()
	 * @see #getShadeMode()
	 * @see #setShadeMode(ShadeModeType)
	 * @generated
	 */
	void unsetShadeMode();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.PlotAreaType#getShadeMode <em>Shade Mode</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Shade Mode</em>' attribute is set.
	 * @see #unsetShadeMode()
	 * @see #getShadeMode()
	 * @see #setShadeMode(ShadeModeType)
	 * @generated
	 */
	boolean isSetShadeMode();

	/**
	 * Returns the value of the '<em><b>Shadow Slant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shadow Slant</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shadow Slant</em>' attribute.
	 * @see #setShadowSlant(BigInteger)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.ChartPackage#getPlotAreaType_ShadowSlant()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.NonNegativeInteger"
	 *        extendedMetaData="kind='attribute' name='shadow-slant' namespace='urn:oasis:names:tc:opendocument:xmlns:dr3d:1.0'"
	 * @generated
	 */
	BigInteger getShadowSlant();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.PlotAreaType#getShadowSlant <em>Shadow Slant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shadow Slant</em>' attribute.
	 * @see #getShadowSlant()
	 * @generated
	 */
	void setShadowSlant(BigInteger value);

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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.ChartPackage#getPlotAreaType_StyleName()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.chart.StyleNameType"
	 *        extendedMetaData="kind='attribute' name='style-name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getStyleName();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.PlotAreaType#getStyleName <em>Style Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style Name</em>' attribute.
	 * @see #getStyleName()
	 * @generated
	 */
	void setStyleName(String value);

	/**
	 * Returns the value of the '<em><b>Transform</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transform</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transform</em>' attribute.
	 * @see #setTransform(Object)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.ChartPackage#getPlotAreaType_Transform()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='transform' namespace='urn:oasis:names:tc:opendocument:xmlns:dr3d:1.0'"
	 * @generated
	 */
	Object getTransform();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.PlotAreaType#getTransform <em>Transform</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transform</em>' attribute.
	 * @see #getTransform()
	 * @generated
	 */
	void setTransform(Object value);

	/**
	 * Returns the value of the '<em><b>Vpn</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vpn</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vpn</em>' attribute.
	 * @see #setVpn(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.ChartPackage#getPlotAreaType_Vpn()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Vector3D"
	 *        extendedMetaData="kind='attribute' name='vpn' namespace='urn:oasis:names:tc:opendocument:xmlns:dr3d:1.0'"
	 * @generated
	 */
	String getVpn();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.PlotAreaType#getVpn <em>Vpn</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vpn</em>' attribute.
	 * @see #getVpn()
	 * @generated
	 */
	void setVpn(String value);

	/**
	 * Returns the value of the '<em><b>Vrp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vrp</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vrp</em>' attribute.
	 * @see #setVrp(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.ChartPackage#getPlotAreaType_Vrp()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Vector3D"
	 *        extendedMetaData="kind='attribute' name='vrp' namespace='urn:oasis:names:tc:opendocument:xmlns:dr3d:1.0'"
	 * @generated
	 */
	String getVrp();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.PlotAreaType#getVrp <em>Vrp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vrp</em>' attribute.
	 * @see #getVrp()
	 * @generated
	 */
	void setVrp(String value);

	/**
	 * Returns the value of the '<em><b>Vup</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vup</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vup</em>' attribute.
	 * @see #setVup(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.ChartPackage#getPlotAreaType_Vup()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Vector3D"
	 *        extendedMetaData="kind='attribute' name='vup' namespace='urn:oasis:names:tc:opendocument:xmlns:dr3d:1.0'"
	 * @generated
	 */
	String getVup();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.PlotAreaType#getVup <em>Vup</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vup</em>' attribute.
	 * @see #getVup()
	 * @generated
	 */
	void setVup(String value);

	/**
	 * Returns the value of the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Width</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Width</em>' attribute.
	 * @see #setWidth(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.ChartPackage#getPlotAreaType_Width()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Length" required="true"
	 *        extendedMetaData="kind='attribute' name='width' namespace='urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0'"
	 * @generated
	 */
	String getWidth();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.PlotAreaType#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' attribute.
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(String value);

	/**
	 * Returns the value of the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>X</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>X</em>' attribute.
	 * @see #setX(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.ChartPackage#getPlotAreaType_X()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Coordinate" required="true"
	 *        extendedMetaData="kind='attribute' name='x' namespace='urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0'"
	 * @generated
	 */
	String getX();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.PlotAreaType#getX <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>X</em>' attribute.
	 * @see #getX()
	 * @generated
	 */
	void setX(String value);

	/**
	 * Returns the value of the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Y</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Y</em>' attribute.
	 * @see #setY(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.ChartPackage#getPlotAreaType_Y()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Coordinate" required="true"
	 *        extendedMetaData="kind='attribute' name='y' namespace='urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0'"
	 * @generated
	 */
	String getY();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.PlotAreaType#getY <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Y</em>' attribute.
	 * @see #getY()
	 * @generated
	 */
	void setY(String value);

} // PlotAreaType
