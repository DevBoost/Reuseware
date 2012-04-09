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
package org.oasisopen.names.tc.opendocument.xmlns.chart.impl;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl;
import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;
import org.oasisopen.names.tc.opendocument.xmlns.chart.AxisType;
import org.oasisopen.names.tc.opendocument.xmlns.chart.CategoriesType;
import org.oasisopen.names.tc.opendocument.xmlns.chart.ChartPackage;
import org.oasisopen.names.tc.opendocument.xmlns.chart.DataLabelNumberType;
import org.oasisopen.names.tc.opendocument.xmlns.chart.DataPointType;
import org.oasisopen.names.tc.opendocument.xmlns.chart.DataSourceHasLabelsType;
import org.oasisopen.names.tc.opendocument.xmlns.chart.DimensionType;
import org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot;
import org.oasisopen.names.tc.opendocument.xmlns.chart.DomainType;
import org.oasisopen.names.tc.opendocument.xmlns.chart.ErrorCategoryType;
import org.oasisopen.names.tc.opendocument.xmlns.chart.ErrorIndicatorType;
import org.oasisopen.names.tc.opendocument.xmlns.chart.FloorType;
import org.oasisopen.names.tc.opendocument.xmlns.chart.FooterType;
import org.oasisopen.names.tc.opendocument.xmlns.chart.GridType;
import org.oasisopen.names.tc.opendocument.xmlns.chart.InterpolationType;
import org.oasisopen.names.tc.opendocument.xmlns.chart.LabelArrangementType;
import org.oasisopen.names.tc.opendocument.xmlns.chart.LegendAlignType;
import org.oasisopen.names.tc.opendocument.xmlns.chart.LegendPositionType;
import org.oasisopen.names.tc.opendocument.xmlns.chart.LegendType;
import org.oasisopen.names.tc.opendocument.xmlns.chart.MeanValueType;
import org.oasisopen.names.tc.opendocument.xmlns.chart.PlotAreaType;
import org.oasisopen.names.tc.opendocument.xmlns.chart.RegressionCurveType;
import org.oasisopen.names.tc.opendocument.xmlns.chart.RegressionTypeType;
import org.oasisopen.names.tc.opendocument.xmlns.chart.SeriesSourceType;
import org.oasisopen.names.tc.opendocument.xmlns.chart.SeriesType;
import org.oasisopen.names.tc.opendocument.xmlns.chart.SolidTypeType;
import org.oasisopen.names.tc.opendocument.xmlns.chart.StockGainMarkerType;
import org.oasisopen.names.tc.opendocument.xmlns.chart.StockLossMarkerType;
import org.oasisopen.names.tc.opendocument.xmlns.chart.StockRangeLineType;
import org.oasisopen.names.tc.opendocument.xmlns.chart.SubtitleType;
import org.oasisopen.names.tc.opendocument.xmlns.chart.SymbolImageType;
import org.oasisopen.names.tc.opendocument.xmlns.chart.SymbolNameType;
import org.oasisopen.names.tc.opendocument.xmlns.chart.SymbolTypeType;
import org.oasisopen.names.tc.opendocument.xmlns.chart.TitleType;
import org.oasisopen.names.tc.opendocument.xmlns.chart.WallType;
import org.oasisopen.names.tc.opendocument.xmlns.text.OfficeChartContentMainType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.impl.DocumentRootImpl#getAxis <em>Axis</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.impl.DocumentRootImpl#getCategories <em>Categories</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.impl.DocumentRootImpl#getChart <em>Chart</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.impl.DocumentRootImpl#getDataPoint <em>Data Point</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.impl.DocumentRootImpl#getDomain <em>Domain</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.impl.DocumentRootImpl#getErrorIndicator <em>Error Indicator</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.impl.DocumentRootImpl#getFloor <em>Floor</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.impl.DocumentRootImpl#getFooter <em>Footer</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.impl.DocumentRootImpl#getGrid <em>Grid</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.impl.DocumentRootImpl#getLegend <em>Legend</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.impl.DocumentRootImpl#getMeanValue <em>Mean Value</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.impl.DocumentRootImpl#getPlotArea <em>Plot Area</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.impl.DocumentRootImpl#getRegressionCurve <em>Regression Curve</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.impl.DocumentRootImpl#getSeries <em>Series</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.impl.DocumentRootImpl#getStockGainMarker <em>Stock Gain Marker</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.impl.DocumentRootImpl#getStockLossMarker <em>Stock Loss Marker</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.impl.DocumentRootImpl#getStockRangeLine <em>Stock Range Line</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.impl.DocumentRootImpl#getSubtitle <em>Subtitle</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.impl.DocumentRootImpl#getSymbolImage <em>Symbol Image</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.impl.DocumentRootImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.impl.DocumentRootImpl#getWall <em>Wall</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.impl.DocumentRootImpl#getAttachedAxis <em>Attached Axis</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.impl.DocumentRootImpl#getColumnMapping <em>Column Mapping</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.impl.DocumentRootImpl#getConnectBars <em>Connect Bars</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.impl.DocumentRootImpl#getDataLabelNumber <em>Data Label Number</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.impl.DocumentRootImpl#getDataLabelSymbol <em>Data Label Symbol</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.impl.DocumentRootImpl#getDataLabelText <em>Data Label Text</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.impl.DocumentRootImpl#getDataSourceHasLabels <em>Data Source Has Labels</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.impl.DocumentRootImpl#getDeep <em>Deep</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.impl.DocumentRootImpl#getDimension <em>Dimension</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.impl.DocumentRootImpl#getDisplayLabel <em>Display Label</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.impl.DocumentRootImpl#getErrorCategory <em>Error Category</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.impl.DocumentRootImpl#getErrorLowerIndicator <em>Error Lower Indicator</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.impl.DocumentRootImpl#getErrorLowerLimit <em>Error Lower Limit</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.impl.DocumentRootImpl#getErrorMargin <em>Error Margin</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.impl.DocumentRootImpl#getErrorPercentage <em>Error Percentage</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.impl.DocumentRootImpl#getErrorUpperIndicator <em>Error Upper Indicator</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.impl.DocumentRootImpl#getErrorUpperLimit <em>Error Upper Limit</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.impl.DocumentRootImpl#getGapWidth <em>Gap Width</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.impl.DocumentRootImpl#getInterpolation <em>Interpolation</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.impl.DocumentRootImpl#getIntervalMajor <em>Interval Major</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.impl.DocumentRootImpl#getIntervalMinorDivisor <em>Interval Minor Divisor</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.impl.DocumentRootImpl#getJapaneseCandleStick <em>Japanese Candle Stick</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.impl.DocumentRootImpl#getLabelArrangement <em>Label Arrangement</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.impl.DocumentRootImpl#getLabelCellAddress <em>Label Cell Address</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.impl.DocumentRootImpl#getLegendAlign <em>Legend Align</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.impl.DocumentRootImpl#getLegendPosition <em>Legend Position</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.impl.DocumentRootImpl#getLines <em>Lines</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.impl.DocumentRootImpl#getLinkDataStyleToSource <em>Link Data Style To Source</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.impl.DocumentRootImpl#getLogarithmic <em>Logarithmic</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.impl.DocumentRootImpl#getMaximum <em>Maximum</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.impl.DocumentRootImpl#getMeanValue1 <em>Mean Value1</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.impl.DocumentRootImpl#getMinimum <em>Minimum</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.impl.DocumentRootImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.impl.DocumentRootImpl#getOrigin <em>Origin</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.impl.DocumentRootImpl#getOverlap <em>Overlap</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.impl.DocumentRootImpl#getPercentage <em>Percentage</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.impl.DocumentRootImpl#getPieOffset <em>Pie Offset</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.impl.DocumentRootImpl#getRegressionType <em>Regression Type</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.impl.DocumentRootImpl#getRepeated <em>Repeated</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.impl.DocumentRootImpl#getRowMapping <em>Row Mapping</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.impl.DocumentRootImpl#getScaleText <em>Scale Text</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.impl.DocumentRootImpl#getSeriesSource <em>Series Source</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.impl.DocumentRootImpl#getSolidType <em>Solid Type</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.impl.DocumentRootImpl#getSplineOrder <em>Spline Order</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.impl.DocumentRootImpl#getSplineResolution <em>Spline Resolution</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.impl.DocumentRootImpl#getStacked <em>Stacked</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.impl.DocumentRootImpl#getStyleName <em>Style Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.impl.DocumentRootImpl#getSymbolHeight <em>Symbol Height</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.impl.DocumentRootImpl#getSymbolName <em>Symbol Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.impl.DocumentRootImpl#getSymbolType <em>Symbol Type</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.impl.DocumentRootImpl#getSymbolWidth <em>Symbol Width</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.impl.DocumentRootImpl#getTextOverlap <em>Text Overlap</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.impl.DocumentRootImpl#getThreeDimensional <em>Three Dimensional</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.impl.DocumentRootImpl#getTickMarksMajorInner <em>Tick Marks Major Inner</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.impl.DocumentRootImpl#getTickMarksMajorOuter <em>Tick Marks Major Outer</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.impl.DocumentRootImpl#getTickMarksMinorInner <em>Tick Marks Minor Inner</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.impl.DocumentRootImpl#getTickMarksMinorOuter <em>Tick Marks Minor Outer</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.impl.DocumentRootImpl#getValuesCellRangeAddress <em>Values Cell Range Address</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.impl.DocumentRootImpl#getVertical <em>Vertical</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.impl.DocumentRootImpl#getVisible <em>Visible</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DocumentRootImpl extends EObjectImpl implements DocumentRoot {
	/**
	 * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMixed()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap mixed;

	/**
	 * The cached value of the '{@link #getXMLNSPrefixMap() <em>XMLNS Prefix Map</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXMLNSPrefixMap()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xMLNSPrefixMap;

	/**
	 * The cached value of the '{@link #getXSISchemaLocation() <em>XSI Schema Location</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXSISchemaLocation()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xSISchemaLocation;

	/**
	 * The default value of the '{@link #getAttachedAxis() <em>Attached Axis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttachedAxis()
	 * @generated
	 * @ordered
	 */
	protected static final String ATTACHED_AXIS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAttachedAxis() <em>Attached Axis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttachedAxis()
	 * @generated
	 * @ordered
	 */
	protected String attachedAxis = ATTACHED_AXIS_EDEFAULT;

	/**
	 * The default value of the '{@link #getColumnMapping() <em>Column Mapping</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumnMapping()
	 * @generated
	 * @ordered
	 */
	protected static final String COLUMN_MAPPING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getColumnMapping() <em>Column Mapping</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumnMapping()
	 * @generated
	 * @ordered
	 */
	protected String columnMapping = COLUMN_MAPPING_EDEFAULT;

	/**
	 * The default value of the '{@link #getConnectBars() <em>Connect Bars</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectBars()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean CONNECT_BARS_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getConnectBars() <em>Connect Bars</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectBars()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean connectBars = CONNECT_BARS_EDEFAULT;

	/**
	 * This is true if the Connect Bars attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean connectBarsESet;

	/**
	 * The default value of the '{@link #getDataLabelNumber() <em>Data Label Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataLabelNumber()
	 * @generated
	 * @ordered
	 */
	protected static final DataLabelNumberType DATA_LABEL_NUMBER_EDEFAULT = DataLabelNumberType.NONE;

	/**
	 * The cached value of the '{@link #getDataLabelNumber() <em>Data Label Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataLabelNumber()
	 * @generated
	 * @ordered
	 */
	protected DataLabelNumberType dataLabelNumber = DATA_LABEL_NUMBER_EDEFAULT;

	/**
	 * This is true if the Data Label Number attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean dataLabelNumberESet;

	/**
	 * The default value of the '{@link #getDataLabelSymbol() <em>Data Label Symbol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataLabelSymbol()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean DATA_LABEL_SYMBOL_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getDataLabelSymbol() <em>Data Label Symbol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataLabelSymbol()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean dataLabelSymbol = DATA_LABEL_SYMBOL_EDEFAULT;

	/**
	 * This is true if the Data Label Symbol attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean dataLabelSymbolESet;

	/**
	 * The default value of the '{@link #getDataLabelText() <em>Data Label Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataLabelText()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean DATA_LABEL_TEXT_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getDataLabelText() <em>Data Label Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataLabelText()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean dataLabelText = DATA_LABEL_TEXT_EDEFAULT;

	/**
	 * This is true if the Data Label Text attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean dataLabelTextESet;

	/**
	 * The default value of the '{@link #getDataSourceHasLabels() <em>Data Source Has Labels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataSourceHasLabels()
	 * @generated
	 * @ordered
	 */
	protected static final DataSourceHasLabelsType DATA_SOURCE_HAS_LABELS_EDEFAULT = DataSourceHasLabelsType.NONE;

	/**
	 * The cached value of the '{@link #getDataSourceHasLabels() <em>Data Source Has Labels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataSourceHasLabels()
	 * @generated
	 * @ordered
	 */
	protected DataSourceHasLabelsType dataSourceHasLabels = DATA_SOURCE_HAS_LABELS_EDEFAULT;

	/**
	 * This is true if the Data Source Has Labels attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean dataSourceHasLabelsESet;

	/**
	 * The default value of the '{@link #getDeep() <em>Deep</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeep()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean DEEP_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getDeep() <em>Deep</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeep()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean deep = DEEP_EDEFAULT;

	/**
	 * This is true if the Deep attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean deepESet;

	/**
	 * The default value of the '{@link #getDimension() <em>Dimension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDimension()
	 * @generated
	 * @ordered
	 */
	protected static final DimensionType DIMENSION_EDEFAULT = DimensionType.X;

	/**
	 * The cached value of the '{@link #getDimension() <em>Dimension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDimension()
	 * @generated
	 * @ordered
	 */
	protected DimensionType dimension = DIMENSION_EDEFAULT;

	/**
	 * This is true if the Dimension attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean dimensionESet;

	/**
	 * The default value of the '{@link #getDisplayLabel() <em>Display Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayLabel()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean DISPLAY_LABEL_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getDisplayLabel() <em>Display Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayLabel()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean displayLabel = DISPLAY_LABEL_EDEFAULT;

	/**
	 * This is true if the Display Label attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean displayLabelESet;

	/**
	 * The default value of the '{@link #getErrorCategory() <em>Error Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorCategory()
	 * @generated
	 * @ordered
	 */
	protected static final ErrorCategoryType ERROR_CATEGORY_EDEFAULT = ErrorCategoryType.NONE;

	/**
	 * The cached value of the '{@link #getErrorCategory() <em>Error Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorCategory()
	 * @generated
	 * @ordered
	 */
	protected ErrorCategoryType errorCategory = ERROR_CATEGORY_EDEFAULT;

	/**
	 * This is true if the Error Category attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean errorCategoryESet;

	/**
	 * The default value of the '{@link #getErrorLowerIndicator() <em>Error Lower Indicator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorLowerIndicator()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean ERROR_LOWER_INDICATOR_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getErrorLowerIndicator() <em>Error Lower Indicator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorLowerIndicator()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean errorLowerIndicator = ERROR_LOWER_INDICATOR_EDEFAULT;

	/**
	 * This is true if the Error Lower Indicator attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean errorLowerIndicatorESet;

	/**
	 * The default value of the '{@link #getErrorLowerLimit() <em>Error Lower Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorLowerLimit()
	 * @generated
	 * @ordered
	 */
	protected static final double ERROR_LOWER_LIMIT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getErrorLowerLimit() <em>Error Lower Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorLowerLimit()
	 * @generated
	 * @ordered
	 */
	protected double errorLowerLimit = ERROR_LOWER_LIMIT_EDEFAULT;

	/**
	 * This is true if the Error Lower Limit attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean errorLowerLimitESet;

	/**
	 * The default value of the '{@link #getErrorMargin() <em>Error Margin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorMargin()
	 * @generated
	 * @ordered
	 */
	protected static final double ERROR_MARGIN_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getErrorMargin() <em>Error Margin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorMargin()
	 * @generated
	 * @ordered
	 */
	protected double errorMargin = ERROR_MARGIN_EDEFAULT;

	/**
	 * This is true if the Error Margin attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean errorMarginESet;

	/**
	 * The default value of the '{@link #getErrorPercentage() <em>Error Percentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorPercentage()
	 * @generated
	 * @ordered
	 */
	protected static final double ERROR_PERCENTAGE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getErrorPercentage() <em>Error Percentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorPercentage()
	 * @generated
	 * @ordered
	 */
	protected double errorPercentage = ERROR_PERCENTAGE_EDEFAULT;

	/**
	 * This is true if the Error Percentage attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean errorPercentageESet;

	/**
	 * The default value of the '{@link #getErrorUpperIndicator() <em>Error Upper Indicator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorUpperIndicator()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean ERROR_UPPER_INDICATOR_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getErrorUpperIndicator() <em>Error Upper Indicator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorUpperIndicator()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean errorUpperIndicator = ERROR_UPPER_INDICATOR_EDEFAULT;

	/**
	 * This is true if the Error Upper Indicator attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean errorUpperIndicatorESet;

	/**
	 * The default value of the '{@link #getErrorUpperLimit() <em>Error Upper Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorUpperLimit()
	 * @generated
	 * @ordered
	 */
	protected static final double ERROR_UPPER_LIMIT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getErrorUpperLimit() <em>Error Upper Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorUpperLimit()
	 * @generated
	 * @ordered
	 */
	protected double errorUpperLimit = ERROR_UPPER_LIMIT_EDEFAULT;

	/**
	 * This is true if the Error Upper Limit attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean errorUpperLimitESet;

	/**
	 * The default value of the '{@link #getGapWidth() <em>Gap Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGapWidth()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger GAP_WIDTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGapWidth() <em>Gap Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGapWidth()
	 * @generated
	 * @ordered
	 */
	protected BigInteger gapWidth = GAP_WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getInterpolation() <em>Interpolation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterpolation()
	 * @generated
	 * @ordered
	 */
	protected static final InterpolationType INTERPOLATION_EDEFAULT = InterpolationType.NONE;

	/**
	 * The cached value of the '{@link #getInterpolation() <em>Interpolation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterpolation()
	 * @generated
	 * @ordered
	 */
	protected InterpolationType interpolation = INTERPOLATION_EDEFAULT;

	/**
	 * This is true if the Interpolation attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean interpolationESet;

	/**
	 * The default value of the '{@link #getIntervalMajor() <em>Interval Major</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntervalMajor()
	 * @generated
	 * @ordered
	 */
	protected static final double INTERVAL_MAJOR_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getIntervalMajor() <em>Interval Major</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntervalMajor()
	 * @generated
	 * @ordered
	 */
	protected double intervalMajor = INTERVAL_MAJOR_EDEFAULT;

	/**
	 * This is true if the Interval Major attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean intervalMajorESet;

	/**
	 * The default value of the '{@link #getIntervalMinorDivisor() <em>Interval Minor Divisor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntervalMinorDivisor()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger INTERVAL_MINOR_DIVISOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIntervalMinorDivisor() <em>Interval Minor Divisor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntervalMinorDivisor()
	 * @generated
	 * @ordered
	 */
	protected BigInteger intervalMinorDivisor = INTERVAL_MINOR_DIVISOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getJapaneseCandleStick() <em>Japanese Candle Stick</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJapaneseCandleStick()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean JAPANESE_CANDLE_STICK_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getJapaneseCandleStick() <em>Japanese Candle Stick</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJapaneseCandleStick()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean japaneseCandleStick = JAPANESE_CANDLE_STICK_EDEFAULT;

	/**
	 * This is true if the Japanese Candle Stick attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean japaneseCandleStickESet;

	/**
	 * The default value of the '{@link #getLabelArrangement() <em>Label Arrangement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabelArrangement()
	 * @generated
	 * @ordered
	 */
	protected static final LabelArrangementType LABEL_ARRANGEMENT_EDEFAULT = LabelArrangementType.SIDE_BY_SIDE;

	/**
	 * The cached value of the '{@link #getLabelArrangement() <em>Label Arrangement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabelArrangement()
	 * @generated
	 * @ordered
	 */
	protected LabelArrangementType labelArrangement = LABEL_ARRANGEMENT_EDEFAULT;

	/**
	 * This is true if the Label Arrangement attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean labelArrangementESet;

	/**
	 * The default value of the '{@link #getLabelCellAddress() <em>Label Cell Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabelCellAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_CELL_ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabelCellAddress() <em>Label Cell Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabelCellAddress()
	 * @generated
	 * @ordered
	 */
	protected String labelCellAddress = LABEL_CELL_ADDRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getLegendAlign() <em>Legend Align</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLegendAlign()
	 * @generated
	 * @ordered
	 */
	protected static final LegendAlignType LEGEND_ALIGN_EDEFAULT = LegendAlignType.START;

	/**
	 * The cached value of the '{@link #getLegendAlign() <em>Legend Align</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLegendAlign()
	 * @generated
	 * @ordered
	 */
	protected LegendAlignType legendAlign = LEGEND_ALIGN_EDEFAULT;

	/**
	 * This is true if the Legend Align attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean legendAlignESet;

	/**
	 * The default value of the '{@link #getLegendPosition() <em>Legend Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLegendPosition()
	 * @generated
	 * @ordered
	 */
	protected static final LegendPositionType LEGEND_POSITION_EDEFAULT = LegendPositionType.START;

	/**
	 * The cached value of the '{@link #getLegendPosition() <em>Legend Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLegendPosition()
	 * @generated
	 * @ordered
	 */
	protected LegendPositionType legendPosition = LEGEND_POSITION_EDEFAULT;

	/**
	 * This is true if the Legend Position attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean legendPositionESet;

	/**
	 * The default value of the '{@link #getLines() <em>Lines</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLines()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean LINES_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getLines() <em>Lines</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLines()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean lines = LINES_EDEFAULT;

	/**
	 * This is true if the Lines attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean linesESet;

	/**
	 * The default value of the '{@link #getLinkDataStyleToSource() <em>Link Data Style To Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkDataStyleToSource()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean LINK_DATA_STYLE_TO_SOURCE_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getLinkDataStyleToSource() <em>Link Data Style To Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkDataStyleToSource()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean linkDataStyleToSource = LINK_DATA_STYLE_TO_SOURCE_EDEFAULT;

	/**
	 * This is true if the Link Data Style To Source attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean linkDataStyleToSourceESet;

	/**
	 * The default value of the '{@link #getLogarithmic() <em>Logarithmic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogarithmic()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean LOGARITHMIC_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getLogarithmic() <em>Logarithmic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogarithmic()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean logarithmic = LOGARITHMIC_EDEFAULT;

	/**
	 * This is true if the Logarithmic attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean logarithmicESet;

	/**
	 * The default value of the '{@link #getMaximum() <em>Maximum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximum()
	 * @generated
	 * @ordered
	 */
	protected static final double MAXIMUM_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMaximum() <em>Maximum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximum()
	 * @generated
	 * @ordered
	 */
	protected double maximum = MAXIMUM_EDEFAULT;

	/**
	 * This is true if the Maximum attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean maximumESet;

	/**
	 * The default value of the '{@link #getMeanValue1() <em>Mean Value1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeanValue1()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean MEAN_VALUE1_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getMeanValue1() <em>Mean Value1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeanValue1()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean meanValue1 = MEAN_VALUE1_EDEFAULT;

	/**
	 * This is true if the Mean Value1 attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean meanValue1ESet;

	/**
	 * The default value of the '{@link #getMinimum() <em>Minimum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimum()
	 * @generated
	 * @ordered
	 */
	protected static final double MINIMUM_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMinimum() <em>Minimum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimum()
	 * @generated
	 * @ordered
	 */
	protected double minimum = MINIMUM_EDEFAULT;

	/**
	 * This is true if the Minimum attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean minimumESet;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getOrigin() <em>Origin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrigin()
	 * @generated
	 * @ordered
	 */
	protected static final double ORIGIN_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getOrigin() <em>Origin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrigin()
	 * @generated
	 * @ordered
	 */
	protected double origin = ORIGIN_EDEFAULT;

	/**
	 * This is true if the Origin attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean originESet;

	/**
	 * The default value of the '{@link #getOverlap() <em>Overlap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOverlap()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger OVERLAP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOverlap() <em>Overlap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOverlap()
	 * @generated
	 * @ordered
	 */
	protected BigInteger overlap = OVERLAP_EDEFAULT;

	/**
	 * The default value of the '{@link #getPercentage() <em>Percentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPercentage()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean PERCENTAGE_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getPercentage() <em>Percentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPercentage()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean percentage = PERCENTAGE_EDEFAULT;

	/**
	 * This is true if the Percentage attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean percentageESet;

	/**
	 * The default value of the '{@link #getPieOffset() <em>Pie Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPieOffset()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger PIE_OFFSET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPieOffset() <em>Pie Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPieOffset()
	 * @generated
	 * @ordered
	 */
	protected BigInteger pieOffset = PIE_OFFSET_EDEFAULT;

	/**
	 * The default value of the '{@link #getRegressionType() <em>Regression Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegressionType()
	 * @generated
	 * @ordered
	 */
	protected static final RegressionTypeType REGRESSION_TYPE_EDEFAULT = RegressionTypeType.NONE;

	/**
	 * The cached value of the '{@link #getRegressionType() <em>Regression Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegressionType()
	 * @generated
	 * @ordered
	 */
	protected RegressionTypeType regressionType = REGRESSION_TYPE_EDEFAULT;

	/**
	 * This is true if the Regression Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean regressionTypeESet;

	/**
	 * The default value of the '{@link #getRepeated() <em>Repeated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepeated()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger REPEATED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRepeated() <em>Repeated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepeated()
	 * @generated
	 * @ordered
	 */
	protected BigInteger repeated = REPEATED_EDEFAULT;

	/**
	 * The default value of the '{@link #getRowMapping() <em>Row Mapping</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRowMapping()
	 * @generated
	 * @ordered
	 */
	protected static final String ROW_MAPPING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRowMapping() <em>Row Mapping</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRowMapping()
	 * @generated
	 * @ordered
	 */
	protected String rowMapping = ROW_MAPPING_EDEFAULT;

	/**
	 * The default value of the '{@link #getScaleText() <em>Scale Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScaleText()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean SCALE_TEXT_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getScaleText() <em>Scale Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScaleText()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean scaleText = SCALE_TEXT_EDEFAULT;

	/**
	 * This is true if the Scale Text attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean scaleTextESet;

	/**
	 * The default value of the '{@link #getSeriesSource() <em>Series Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeriesSource()
	 * @generated
	 * @ordered
	 */
	protected static final SeriesSourceType SERIES_SOURCE_EDEFAULT = SeriesSourceType.COLUMNS;

	/**
	 * The cached value of the '{@link #getSeriesSource() <em>Series Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeriesSource()
	 * @generated
	 * @ordered
	 */
	protected SeriesSourceType seriesSource = SERIES_SOURCE_EDEFAULT;

	/**
	 * This is true if the Series Source attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean seriesSourceESet;

	/**
	 * The default value of the '{@link #getSolidType() <em>Solid Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSolidType()
	 * @generated
	 * @ordered
	 */
	protected static final SolidTypeType SOLID_TYPE_EDEFAULT = SolidTypeType.CUBOID;

	/**
	 * The cached value of the '{@link #getSolidType() <em>Solid Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSolidType()
	 * @generated
	 * @ordered
	 */
	protected SolidTypeType solidType = SOLID_TYPE_EDEFAULT;

	/**
	 * This is true if the Solid Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean solidTypeESet;

	/**
	 * The default value of the '{@link #getSplineOrder() <em>Spline Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSplineOrder()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger SPLINE_ORDER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSplineOrder() <em>Spline Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSplineOrder()
	 * @generated
	 * @ordered
	 */
	protected BigInteger splineOrder = SPLINE_ORDER_EDEFAULT;

	/**
	 * The default value of the '{@link #getSplineResolution() <em>Spline Resolution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSplineResolution()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger SPLINE_RESOLUTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSplineResolution() <em>Spline Resolution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSplineResolution()
	 * @generated
	 * @ordered
	 */
	protected BigInteger splineResolution = SPLINE_RESOLUTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getStacked() <em>Stacked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStacked()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean STACKED_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getStacked() <em>Stacked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStacked()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean stacked = STACKED_EDEFAULT;

	/**
	 * This is true if the Stacked attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean stackedESet;

	/**
	 * The default value of the '{@link #getStyleName() <em>Style Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyleName()
	 * @generated
	 * @ordered
	 */
	protected static final String STYLE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStyleName() <em>Style Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyleName()
	 * @generated
	 * @ordered
	 */
	protected String styleName = STYLE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSymbolHeight() <em>Symbol Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSymbolHeight()
	 * @generated
	 * @ordered
	 */
	protected static final String SYMBOL_HEIGHT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSymbolHeight() <em>Symbol Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSymbolHeight()
	 * @generated
	 * @ordered
	 */
	protected String symbolHeight = SYMBOL_HEIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getSymbolName() <em>Symbol Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSymbolName()
	 * @generated
	 * @ordered
	 */
	protected static final SymbolNameType SYMBOL_NAME_EDEFAULT = SymbolNameType.SQUARE;

	/**
	 * The cached value of the '{@link #getSymbolName() <em>Symbol Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSymbolName()
	 * @generated
	 * @ordered
	 */
	protected SymbolNameType symbolName = SYMBOL_NAME_EDEFAULT;

	/**
	 * This is true if the Symbol Name attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean symbolNameESet;

	/**
	 * The default value of the '{@link #getSymbolType() <em>Symbol Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSymbolType()
	 * @generated
	 * @ordered
	 */
	protected static final SymbolTypeType SYMBOL_TYPE_EDEFAULT = SymbolTypeType.NONE;

	/**
	 * The cached value of the '{@link #getSymbolType() <em>Symbol Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSymbolType()
	 * @generated
	 * @ordered
	 */
	protected SymbolTypeType symbolType = SYMBOL_TYPE_EDEFAULT;

	/**
	 * This is true if the Symbol Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean symbolTypeESet;

	/**
	 * The default value of the '{@link #getSymbolWidth() <em>Symbol Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSymbolWidth()
	 * @generated
	 * @ordered
	 */
	protected static final String SYMBOL_WIDTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSymbolWidth() <em>Symbol Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSymbolWidth()
	 * @generated
	 * @ordered
	 */
	protected String symbolWidth = SYMBOL_WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getTextOverlap() <em>Text Overlap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextOverlap()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean TEXT_OVERLAP_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getTextOverlap() <em>Text Overlap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextOverlap()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean textOverlap = TEXT_OVERLAP_EDEFAULT;

	/**
	 * This is true if the Text Overlap attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean textOverlapESet;

	/**
	 * The default value of the '{@link #getThreeDimensional() <em>Three Dimensional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThreeDimensional()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean THREE_DIMENSIONAL_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getThreeDimensional() <em>Three Dimensional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThreeDimensional()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean threeDimensional = THREE_DIMENSIONAL_EDEFAULT;

	/**
	 * This is true if the Three Dimensional attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean threeDimensionalESet;

	/**
	 * The default value of the '{@link #getTickMarksMajorInner() <em>Tick Marks Major Inner</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTickMarksMajorInner()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean TICK_MARKS_MAJOR_INNER_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getTickMarksMajorInner() <em>Tick Marks Major Inner</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTickMarksMajorInner()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean tickMarksMajorInner = TICK_MARKS_MAJOR_INNER_EDEFAULT;

	/**
	 * This is true if the Tick Marks Major Inner attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean tickMarksMajorInnerESet;

	/**
	 * The default value of the '{@link #getTickMarksMajorOuter() <em>Tick Marks Major Outer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTickMarksMajorOuter()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean TICK_MARKS_MAJOR_OUTER_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getTickMarksMajorOuter() <em>Tick Marks Major Outer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTickMarksMajorOuter()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean tickMarksMajorOuter = TICK_MARKS_MAJOR_OUTER_EDEFAULT;

	/**
	 * This is true if the Tick Marks Major Outer attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean tickMarksMajorOuterESet;

	/**
	 * The default value of the '{@link #getTickMarksMinorInner() <em>Tick Marks Minor Inner</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTickMarksMinorInner()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean TICK_MARKS_MINOR_INNER_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getTickMarksMinorInner() <em>Tick Marks Minor Inner</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTickMarksMinorInner()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean tickMarksMinorInner = TICK_MARKS_MINOR_INNER_EDEFAULT;

	/**
	 * This is true if the Tick Marks Minor Inner attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean tickMarksMinorInnerESet;

	/**
	 * The default value of the '{@link #getTickMarksMinorOuter() <em>Tick Marks Minor Outer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTickMarksMinorOuter()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean TICK_MARKS_MINOR_OUTER_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getTickMarksMinorOuter() <em>Tick Marks Minor Outer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTickMarksMinorOuter()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean tickMarksMinorOuter = TICK_MARKS_MINOR_OUTER_EDEFAULT;

	/**
	 * This is true if the Tick Marks Minor Outer attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean tickMarksMinorOuterESet;

	/**
	 * The default value of the '{@link #getValuesCellRangeAddress() <em>Values Cell Range Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValuesCellRangeAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUES_CELL_RANGE_ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValuesCellRangeAddress() <em>Values Cell Range Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValuesCellRangeAddress()
	 * @generated
	 * @ordered
	 */
	protected String valuesCellRangeAddress = VALUES_CELL_RANGE_ADDRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getVertical() <em>Vertical</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVertical()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean VERTICAL_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getVertical() <em>Vertical</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVertical()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean vertical = VERTICAL_EDEFAULT;

	/**
	 * This is true if the Vertical attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean verticalESet;

	/**
	 * The default value of the '{@link #getVisible() <em>Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisible()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean VISIBLE_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getVisible() <em>Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisible()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean visible = VISIBLE_EDEFAULT;

	/**
	 * This is true if the Visible attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean visibleESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ChartPackage.Literals.DOCUMENT_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, ChartPackage.DOCUMENT_ROOT__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getXMLNSPrefixMap() {
		if (xMLNSPrefixMap == null) {
			xMLNSPrefixMap = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, ChartPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		}
		return xMLNSPrefixMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getXSISchemaLocation() {
		if (xSISchemaLocation == null) {
			xSISchemaLocation = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, ChartPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		}
		return xSISchemaLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AxisType getAxis() {
		return (AxisType)getMixed().get(ChartPackage.Literals.DOCUMENT_ROOT__AXIS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAxis(AxisType newAxis, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ChartPackage.Literals.DOCUMENT_ROOT__AXIS, newAxis, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAxis(AxisType newAxis) {
		((FeatureMap.Internal)getMixed()).set(ChartPackage.Literals.DOCUMENT_ROOT__AXIS, newAxis);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CategoriesType getCategories() {
		return (CategoriesType)getMixed().get(ChartPackage.Literals.DOCUMENT_ROOT__CATEGORIES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCategories(CategoriesType newCategories, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ChartPackage.Literals.DOCUMENT_ROOT__CATEGORIES, newCategories, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategories(CategoriesType newCategories) {
		((FeatureMap.Internal)getMixed()).set(ChartPackage.Literals.DOCUMENT_ROOT__CATEGORIES, newCategories);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OfficeChartContentMainType getChart() {
		return (OfficeChartContentMainType)getMixed().get(ChartPackage.Literals.DOCUMENT_ROOT__CHART, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChart(OfficeChartContentMainType newChart, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ChartPackage.Literals.DOCUMENT_ROOT__CHART, newChart, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChart(OfficeChartContentMainType newChart) {
		((FeatureMap.Internal)getMixed()).set(ChartPackage.Literals.DOCUMENT_ROOT__CHART, newChart);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataPointType getDataPoint() {
		return (DataPointType)getMixed().get(ChartPackage.Literals.DOCUMENT_ROOT__DATA_POINT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataPoint(DataPointType newDataPoint, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ChartPackage.Literals.DOCUMENT_ROOT__DATA_POINT, newDataPoint, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataPoint(DataPointType newDataPoint) {
		((FeatureMap.Internal)getMixed()).set(ChartPackage.Literals.DOCUMENT_ROOT__DATA_POINT, newDataPoint);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainType getDomain() {
		return (DomainType)getMixed().get(ChartPackage.Literals.DOCUMENT_ROOT__DOMAIN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDomain(DomainType newDomain, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ChartPackage.Literals.DOCUMENT_ROOT__DOMAIN, newDomain, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDomain(DomainType newDomain) {
		((FeatureMap.Internal)getMixed()).set(ChartPackage.Literals.DOCUMENT_ROOT__DOMAIN, newDomain);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErrorIndicatorType getErrorIndicator() {
		return (ErrorIndicatorType)getMixed().get(ChartPackage.Literals.DOCUMENT_ROOT__ERROR_INDICATOR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetErrorIndicator(ErrorIndicatorType newErrorIndicator, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ChartPackage.Literals.DOCUMENT_ROOT__ERROR_INDICATOR, newErrorIndicator, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setErrorIndicator(ErrorIndicatorType newErrorIndicator) {
		((FeatureMap.Internal)getMixed()).set(ChartPackage.Literals.DOCUMENT_ROOT__ERROR_INDICATOR, newErrorIndicator);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FloorType getFloor() {
		return (FloorType)getMixed().get(ChartPackage.Literals.DOCUMENT_ROOT__FLOOR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFloor(FloorType newFloor, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ChartPackage.Literals.DOCUMENT_ROOT__FLOOR, newFloor, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFloor(FloorType newFloor) {
		((FeatureMap.Internal)getMixed()).set(ChartPackage.Literals.DOCUMENT_ROOT__FLOOR, newFloor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FooterType getFooter() {
		return (FooterType)getMixed().get(ChartPackage.Literals.DOCUMENT_ROOT__FOOTER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFooter(FooterType newFooter, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ChartPackage.Literals.DOCUMENT_ROOT__FOOTER, newFooter, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFooter(FooterType newFooter) {
		((FeatureMap.Internal)getMixed()).set(ChartPackage.Literals.DOCUMENT_ROOT__FOOTER, newFooter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GridType getGrid() {
		return (GridType)getMixed().get(ChartPackage.Literals.DOCUMENT_ROOT__GRID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGrid(GridType newGrid, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ChartPackage.Literals.DOCUMENT_ROOT__GRID, newGrid, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGrid(GridType newGrid) {
		((FeatureMap.Internal)getMixed()).set(ChartPackage.Literals.DOCUMENT_ROOT__GRID, newGrid);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LegendType getLegend() {
		return (LegendType)getMixed().get(ChartPackage.Literals.DOCUMENT_ROOT__LEGEND, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLegend(LegendType newLegend, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ChartPackage.Literals.DOCUMENT_ROOT__LEGEND, newLegend, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLegend(LegendType newLegend) {
		((FeatureMap.Internal)getMixed()).set(ChartPackage.Literals.DOCUMENT_ROOT__LEGEND, newLegend);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeanValueType getMeanValue() {
		return (MeanValueType)getMixed().get(ChartPackage.Literals.DOCUMENT_ROOT__MEAN_VALUE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMeanValue(MeanValueType newMeanValue, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ChartPackage.Literals.DOCUMENT_ROOT__MEAN_VALUE, newMeanValue, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMeanValue(MeanValueType newMeanValue) {
		((FeatureMap.Internal)getMixed()).set(ChartPackage.Literals.DOCUMENT_ROOT__MEAN_VALUE, newMeanValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlotAreaType getPlotArea() {
		return (PlotAreaType)getMixed().get(ChartPackage.Literals.DOCUMENT_ROOT__PLOT_AREA, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPlotArea(PlotAreaType newPlotArea, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ChartPackage.Literals.DOCUMENT_ROOT__PLOT_AREA, newPlotArea, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlotArea(PlotAreaType newPlotArea) {
		((FeatureMap.Internal)getMixed()).set(ChartPackage.Literals.DOCUMENT_ROOT__PLOT_AREA, newPlotArea);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegressionCurveType getRegressionCurve() {
		return (RegressionCurveType)getMixed().get(ChartPackage.Literals.DOCUMENT_ROOT__REGRESSION_CURVE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRegressionCurve(RegressionCurveType newRegressionCurve, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ChartPackage.Literals.DOCUMENT_ROOT__REGRESSION_CURVE, newRegressionCurve, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegressionCurve(RegressionCurveType newRegressionCurve) {
		((FeatureMap.Internal)getMixed()).set(ChartPackage.Literals.DOCUMENT_ROOT__REGRESSION_CURVE, newRegressionCurve);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SeriesType getSeries() {
		return (SeriesType)getMixed().get(ChartPackage.Literals.DOCUMENT_ROOT__SERIES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSeries(SeriesType newSeries, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ChartPackage.Literals.DOCUMENT_ROOT__SERIES, newSeries, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeries(SeriesType newSeries) {
		((FeatureMap.Internal)getMixed()).set(ChartPackage.Literals.DOCUMENT_ROOT__SERIES, newSeries);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StockGainMarkerType getStockGainMarker() {
		return (StockGainMarkerType)getMixed().get(ChartPackage.Literals.DOCUMENT_ROOT__STOCK_GAIN_MARKER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStockGainMarker(StockGainMarkerType newStockGainMarker, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ChartPackage.Literals.DOCUMENT_ROOT__STOCK_GAIN_MARKER, newStockGainMarker, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStockGainMarker(StockGainMarkerType newStockGainMarker) {
		((FeatureMap.Internal)getMixed()).set(ChartPackage.Literals.DOCUMENT_ROOT__STOCK_GAIN_MARKER, newStockGainMarker);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StockLossMarkerType getStockLossMarker() {
		return (StockLossMarkerType)getMixed().get(ChartPackage.Literals.DOCUMENT_ROOT__STOCK_LOSS_MARKER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStockLossMarker(StockLossMarkerType newStockLossMarker, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ChartPackage.Literals.DOCUMENT_ROOT__STOCK_LOSS_MARKER, newStockLossMarker, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStockLossMarker(StockLossMarkerType newStockLossMarker) {
		((FeatureMap.Internal)getMixed()).set(ChartPackage.Literals.DOCUMENT_ROOT__STOCK_LOSS_MARKER, newStockLossMarker);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StockRangeLineType getStockRangeLine() {
		return (StockRangeLineType)getMixed().get(ChartPackage.Literals.DOCUMENT_ROOT__STOCK_RANGE_LINE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStockRangeLine(StockRangeLineType newStockRangeLine, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ChartPackage.Literals.DOCUMENT_ROOT__STOCK_RANGE_LINE, newStockRangeLine, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStockRangeLine(StockRangeLineType newStockRangeLine) {
		((FeatureMap.Internal)getMixed()).set(ChartPackage.Literals.DOCUMENT_ROOT__STOCK_RANGE_LINE, newStockRangeLine);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubtitleType getSubtitle() {
		return (SubtitleType)getMixed().get(ChartPackage.Literals.DOCUMENT_ROOT__SUBTITLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubtitle(SubtitleType newSubtitle, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ChartPackage.Literals.DOCUMENT_ROOT__SUBTITLE, newSubtitle, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubtitle(SubtitleType newSubtitle) {
		((FeatureMap.Internal)getMixed()).set(ChartPackage.Literals.DOCUMENT_ROOT__SUBTITLE, newSubtitle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SymbolImageType getSymbolImage() {
		return (SymbolImageType)getMixed().get(ChartPackage.Literals.DOCUMENT_ROOT__SYMBOL_IMAGE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSymbolImage(SymbolImageType newSymbolImage, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ChartPackage.Literals.DOCUMENT_ROOT__SYMBOL_IMAGE, newSymbolImage, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSymbolImage(SymbolImageType newSymbolImage) {
		((FeatureMap.Internal)getMixed()).set(ChartPackage.Literals.DOCUMENT_ROOT__SYMBOL_IMAGE, newSymbolImage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TitleType getTitle() {
		return (TitleType)getMixed().get(ChartPackage.Literals.DOCUMENT_ROOT__TITLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTitle(TitleType newTitle, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ChartPackage.Literals.DOCUMENT_ROOT__TITLE, newTitle, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(TitleType newTitle) {
		((FeatureMap.Internal)getMixed()).set(ChartPackage.Literals.DOCUMENT_ROOT__TITLE, newTitle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WallType getWall() {
		return (WallType)getMixed().get(ChartPackage.Literals.DOCUMENT_ROOT__WALL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWall(WallType newWall, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ChartPackage.Literals.DOCUMENT_ROOT__WALL, newWall, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWall(WallType newWall) {
		((FeatureMap.Internal)getMixed()).set(ChartPackage.Literals.DOCUMENT_ROOT__WALL, newWall);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAttachedAxis() {
		return attachedAxis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttachedAxis(String newAttachedAxis) {
		String oldAttachedAxis = attachedAxis;
		attachedAxis = newAttachedAxis;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChartPackage.DOCUMENT_ROOT__ATTACHED_AXIS, oldAttachedAxis, attachedAxis));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getColumnMapping() {
		return columnMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColumnMapping(String newColumnMapping) {
		String oldColumnMapping = columnMapping;
		columnMapping = newColumnMapping;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChartPackage.DOCUMENT_ROOT__COLUMN_MAPPING, oldColumnMapping, columnMapping));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getConnectBars() {
		return connectBars;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnectBars(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newConnectBars) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldConnectBars = connectBars;
		connectBars = newConnectBars == null ? CONNECT_BARS_EDEFAULT : newConnectBars;
		boolean oldConnectBarsESet = connectBarsESet;
		connectBarsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChartPackage.DOCUMENT_ROOT__CONNECT_BARS, oldConnectBars, connectBars, !oldConnectBarsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetConnectBars() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldConnectBars = connectBars;
		boolean oldConnectBarsESet = connectBarsESet;
		connectBars = CONNECT_BARS_EDEFAULT;
		connectBarsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ChartPackage.DOCUMENT_ROOT__CONNECT_BARS, oldConnectBars, CONNECT_BARS_EDEFAULT, oldConnectBarsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetConnectBars() {
		return connectBarsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataLabelNumberType getDataLabelNumber() {
		return dataLabelNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataLabelNumber(DataLabelNumberType newDataLabelNumber) {
		DataLabelNumberType oldDataLabelNumber = dataLabelNumber;
		dataLabelNumber = newDataLabelNumber == null ? DATA_LABEL_NUMBER_EDEFAULT : newDataLabelNumber;
		boolean oldDataLabelNumberESet = dataLabelNumberESet;
		dataLabelNumberESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChartPackage.DOCUMENT_ROOT__DATA_LABEL_NUMBER, oldDataLabelNumber, dataLabelNumber, !oldDataLabelNumberESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDataLabelNumber() {
		DataLabelNumberType oldDataLabelNumber = dataLabelNumber;
		boolean oldDataLabelNumberESet = dataLabelNumberESet;
		dataLabelNumber = DATA_LABEL_NUMBER_EDEFAULT;
		dataLabelNumberESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ChartPackage.DOCUMENT_ROOT__DATA_LABEL_NUMBER, oldDataLabelNumber, DATA_LABEL_NUMBER_EDEFAULT, oldDataLabelNumberESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDataLabelNumber() {
		return dataLabelNumberESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getDataLabelSymbol() {
		return dataLabelSymbol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataLabelSymbol(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newDataLabelSymbol) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldDataLabelSymbol = dataLabelSymbol;
		dataLabelSymbol = newDataLabelSymbol == null ? DATA_LABEL_SYMBOL_EDEFAULT : newDataLabelSymbol;
		boolean oldDataLabelSymbolESet = dataLabelSymbolESet;
		dataLabelSymbolESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChartPackage.DOCUMENT_ROOT__DATA_LABEL_SYMBOL, oldDataLabelSymbol, dataLabelSymbol, !oldDataLabelSymbolESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDataLabelSymbol() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldDataLabelSymbol = dataLabelSymbol;
		boolean oldDataLabelSymbolESet = dataLabelSymbolESet;
		dataLabelSymbol = DATA_LABEL_SYMBOL_EDEFAULT;
		dataLabelSymbolESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ChartPackage.DOCUMENT_ROOT__DATA_LABEL_SYMBOL, oldDataLabelSymbol, DATA_LABEL_SYMBOL_EDEFAULT, oldDataLabelSymbolESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDataLabelSymbol() {
		return dataLabelSymbolESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getDataLabelText() {
		return dataLabelText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataLabelText(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newDataLabelText) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldDataLabelText = dataLabelText;
		dataLabelText = newDataLabelText == null ? DATA_LABEL_TEXT_EDEFAULT : newDataLabelText;
		boolean oldDataLabelTextESet = dataLabelTextESet;
		dataLabelTextESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChartPackage.DOCUMENT_ROOT__DATA_LABEL_TEXT, oldDataLabelText, dataLabelText, !oldDataLabelTextESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDataLabelText() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldDataLabelText = dataLabelText;
		boolean oldDataLabelTextESet = dataLabelTextESet;
		dataLabelText = DATA_LABEL_TEXT_EDEFAULT;
		dataLabelTextESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ChartPackage.DOCUMENT_ROOT__DATA_LABEL_TEXT, oldDataLabelText, DATA_LABEL_TEXT_EDEFAULT, oldDataLabelTextESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDataLabelText() {
		return dataLabelTextESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataSourceHasLabelsType getDataSourceHasLabels() {
		return dataSourceHasLabels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataSourceHasLabels(DataSourceHasLabelsType newDataSourceHasLabels) {
		DataSourceHasLabelsType oldDataSourceHasLabels = dataSourceHasLabels;
		dataSourceHasLabels = newDataSourceHasLabels == null ? DATA_SOURCE_HAS_LABELS_EDEFAULT : newDataSourceHasLabels;
		boolean oldDataSourceHasLabelsESet = dataSourceHasLabelsESet;
		dataSourceHasLabelsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChartPackage.DOCUMENT_ROOT__DATA_SOURCE_HAS_LABELS, oldDataSourceHasLabels, dataSourceHasLabels, !oldDataSourceHasLabelsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDataSourceHasLabels() {
		DataSourceHasLabelsType oldDataSourceHasLabels = dataSourceHasLabels;
		boolean oldDataSourceHasLabelsESet = dataSourceHasLabelsESet;
		dataSourceHasLabels = DATA_SOURCE_HAS_LABELS_EDEFAULT;
		dataSourceHasLabelsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ChartPackage.DOCUMENT_ROOT__DATA_SOURCE_HAS_LABELS, oldDataSourceHasLabels, DATA_SOURCE_HAS_LABELS_EDEFAULT, oldDataSourceHasLabelsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDataSourceHasLabels() {
		return dataSourceHasLabelsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getDeep() {
		return deep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeep(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newDeep) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldDeep = deep;
		deep = newDeep == null ? DEEP_EDEFAULT : newDeep;
		boolean oldDeepESet = deepESet;
		deepESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChartPackage.DOCUMENT_ROOT__DEEP, oldDeep, deep, !oldDeepESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDeep() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldDeep = deep;
		boolean oldDeepESet = deepESet;
		deep = DEEP_EDEFAULT;
		deepESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ChartPackage.DOCUMENT_ROOT__DEEP, oldDeep, DEEP_EDEFAULT, oldDeepESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDeep() {
		return deepESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DimensionType getDimension() {
		return dimension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDimension(DimensionType newDimension) {
		DimensionType oldDimension = dimension;
		dimension = newDimension == null ? DIMENSION_EDEFAULT : newDimension;
		boolean oldDimensionESet = dimensionESet;
		dimensionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChartPackage.DOCUMENT_ROOT__DIMENSION, oldDimension, dimension, !oldDimensionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDimension() {
		DimensionType oldDimension = dimension;
		boolean oldDimensionESet = dimensionESet;
		dimension = DIMENSION_EDEFAULT;
		dimensionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ChartPackage.DOCUMENT_ROOT__DIMENSION, oldDimension, DIMENSION_EDEFAULT, oldDimensionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDimension() {
		return dimensionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getDisplayLabel() {
		return displayLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisplayLabel(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newDisplayLabel) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldDisplayLabel = displayLabel;
		displayLabel = newDisplayLabel == null ? DISPLAY_LABEL_EDEFAULT : newDisplayLabel;
		boolean oldDisplayLabelESet = displayLabelESet;
		displayLabelESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChartPackage.DOCUMENT_ROOT__DISPLAY_LABEL, oldDisplayLabel, displayLabel, !oldDisplayLabelESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDisplayLabel() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldDisplayLabel = displayLabel;
		boolean oldDisplayLabelESet = displayLabelESet;
		displayLabel = DISPLAY_LABEL_EDEFAULT;
		displayLabelESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ChartPackage.DOCUMENT_ROOT__DISPLAY_LABEL, oldDisplayLabel, DISPLAY_LABEL_EDEFAULT, oldDisplayLabelESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDisplayLabel() {
		return displayLabelESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErrorCategoryType getErrorCategory() {
		return errorCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setErrorCategory(ErrorCategoryType newErrorCategory) {
		ErrorCategoryType oldErrorCategory = errorCategory;
		errorCategory = newErrorCategory == null ? ERROR_CATEGORY_EDEFAULT : newErrorCategory;
		boolean oldErrorCategoryESet = errorCategoryESet;
		errorCategoryESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChartPackage.DOCUMENT_ROOT__ERROR_CATEGORY, oldErrorCategory, errorCategory, !oldErrorCategoryESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetErrorCategory() {
		ErrorCategoryType oldErrorCategory = errorCategory;
		boolean oldErrorCategoryESet = errorCategoryESet;
		errorCategory = ERROR_CATEGORY_EDEFAULT;
		errorCategoryESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ChartPackage.DOCUMENT_ROOT__ERROR_CATEGORY, oldErrorCategory, ERROR_CATEGORY_EDEFAULT, oldErrorCategoryESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetErrorCategory() {
		return errorCategoryESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getErrorLowerIndicator() {
		return errorLowerIndicator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setErrorLowerIndicator(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newErrorLowerIndicator) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldErrorLowerIndicator = errorLowerIndicator;
		errorLowerIndicator = newErrorLowerIndicator == null ? ERROR_LOWER_INDICATOR_EDEFAULT : newErrorLowerIndicator;
		boolean oldErrorLowerIndicatorESet = errorLowerIndicatorESet;
		errorLowerIndicatorESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChartPackage.DOCUMENT_ROOT__ERROR_LOWER_INDICATOR, oldErrorLowerIndicator, errorLowerIndicator, !oldErrorLowerIndicatorESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetErrorLowerIndicator() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldErrorLowerIndicator = errorLowerIndicator;
		boolean oldErrorLowerIndicatorESet = errorLowerIndicatorESet;
		errorLowerIndicator = ERROR_LOWER_INDICATOR_EDEFAULT;
		errorLowerIndicatorESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ChartPackage.DOCUMENT_ROOT__ERROR_LOWER_INDICATOR, oldErrorLowerIndicator, ERROR_LOWER_INDICATOR_EDEFAULT, oldErrorLowerIndicatorESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetErrorLowerIndicator() {
		return errorLowerIndicatorESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getErrorLowerLimit() {
		return errorLowerLimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setErrorLowerLimit(double newErrorLowerLimit) {
		double oldErrorLowerLimit = errorLowerLimit;
		errorLowerLimit = newErrorLowerLimit;
		boolean oldErrorLowerLimitESet = errorLowerLimitESet;
		errorLowerLimitESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChartPackage.DOCUMENT_ROOT__ERROR_LOWER_LIMIT, oldErrorLowerLimit, errorLowerLimit, !oldErrorLowerLimitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetErrorLowerLimit() {
		double oldErrorLowerLimit = errorLowerLimit;
		boolean oldErrorLowerLimitESet = errorLowerLimitESet;
		errorLowerLimit = ERROR_LOWER_LIMIT_EDEFAULT;
		errorLowerLimitESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ChartPackage.DOCUMENT_ROOT__ERROR_LOWER_LIMIT, oldErrorLowerLimit, ERROR_LOWER_LIMIT_EDEFAULT, oldErrorLowerLimitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetErrorLowerLimit() {
		return errorLowerLimitESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getErrorMargin() {
		return errorMargin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setErrorMargin(double newErrorMargin) {
		double oldErrorMargin = errorMargin;
		errorMargin = newErrorMargin;
		boolean oldErrorMarginESet = errorMarginESet;
		errorMarginESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChartPackage.DOCUMENT_ROOT__ERROR_MARGIN, oldErrorMargin, errorMargin, !oldErrorMarginESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetErrorMargin() {
		double oldErrorMargin = errorMargin;
		boolean oldErrorMarginESet = errorMarginESet;
		errorMargin = ERROR_MARGIN_EDEFAULT;
		errorMarginESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ChartPackage.DOCUMENT_ROOT__ERROR_MARGIN, oldErrorMargin, ERROR_MARGIN_EDEFAULT, oldErrorMarginESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetErrorMargin() {
		return errorMarginESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getErrorPercentage() {
		return errorPercentage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setErrorPercentage(double newErrorPercentage) {
		double oldErrorPercentage = errorPercentage;
		errorPercentage = newErrorPercentage;
		boolean oldErrorPercentageESet = errorPercentageESet;
		errorPercentageESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChartPackage.DOCUMENT_ROOT__ERROR_PERCENTAGE, oldErrorPercentage, errorPercentage, !oldErrorPercentageESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetErrorPercentage() {
		double oldErrorPercentage = errorPercentage;
		boolean oldErrorPercentageESet = errorPercentageESet;
		errorPercentage = ERROR_PERCENTAGE_EDEFAULT;
		errorPercentageESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ChartPackage.DOCUMENT_ROOT__ERROR_PERCENTAGE, oldErrorPercentage, ERROR_PERCENTAGE_EDEFAULT, oldErrorPercentageESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetErrorPercentage() {
		return errorPercentageESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getErrorUpperIndicator() {
		return errorUpperIndicator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setErrorUpperIndicator(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newErrorUpperIndicator) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldErrorUpperIndicator = errorUpperIndicator;
		errorUpperIndicator = newErrorUpperIndicator == null ? ERROR_UPPER_INDICATOR_EDEFAULT : newErrorUpperIndicator;
		boolean oldErrorUpperIndicatorESet = errorUpperIndicatorESet;
		errorUpperIndicatorESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChartPackage.DOCUMENT_ROOT__ERROR_UPPER_INDICATOR, oldErrorUpperIndicator, errorUpperIndicator, !oldErrorUpperIndicatorESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetErrorUpperIndicator() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldErrorUpperIndicator = errorUpperIndicator;
		boolean oldErrorUpperIndicatorESet = errorUpperIndicatorESet;
		errorUpperIndicator = ERROR_UPPER_INDICATOR_EDEFAULT;
		errorUpperIndicatorESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ChartPackage.DOCUMENT_ROOT__ERROR_UPPER_INDICATOR, oldErrorUpperIndicator, ERROR_UPPER_INDICATOR_EDEFAULT, oldErrorUpperIndicatorESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetErrorUpperIndicator() {
		return errorUpperIndicatorESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getErrorUpperLimit() {
		return errorUpperLimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setErrorUpperLimit(double newErrorUpperLimit) {
		double oldErrorUpperLimit = errorUpperLimit;
		errorUpperLimit = newErrorUpperLimit;
		boolean oldErrorUpperLimitESet = errorUpperLimitESet;
		errorUpperLimitESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChartPackage.DOCUMENT_ROOT__ERROR_UPPER_LIMIT, oldErrorUpperLimit, errorUpperLimit, !oldErrorUpperLimitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetErrorUpperLimit() {
		double oldErrorUpperLimit = errorUpperLimit;
		boolean oldErrorUpperLimitESet = errorUpperLimitESet;
		errorUpperLimit = ERROR_UPPER_LIMIT_EDEFAULT;
		errorUpperLimitESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ChartPackage.DOCUMENT_ROOT__ERROR_UPPER_LIMIT, oldErrorUpperLimit, ERROR_UPPER_LIMIT_EDEFAULT, oldErrorUpperLimitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetErrorUpperLimit() {
		return errorUpperLimitESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getGapWidth() {
		return gapWidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGapWidth(BigInteger newGapWidth) {
		BigInteger oldGapWidth = gapWidth;
		gapWidth = newGapWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChartPackage.DOCUMENT_ROOT__GAP_WIDTH, oldGapWidth, gapWidth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterpolationType getInterpolation() {
		return interpolation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterpolation(InterpolationType newInterpolation) {
		InterpolationType oldInterpolation = interpolation;
		interpolation = newInterpolation == null ? INTERPOLATION_EDEFAULT : newInterpolation;
		boolean oldInterpolationESet = interpolationESet;
		interpolationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChartPackage.DOCUMENT_ROOT__INTERPOLATION, oldInterpolation, interpolation, !oldInterpolationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetInterpolation() {
		InterpolationType oldInterpolation = interpolation;
		boolean oldInterpolationESet = interpolationESet;
		interpolation = INTERPOLATION_EDEFAULT;
		interpolationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ChartPackage.DOCUMENT_ROOT__INTERPOLATION, oldInterpolation, INTERPOLATION_EDEFAULT, oldInterpolationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetInterpolation() {
		return interpolationESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getIntervalMajor() {
		return intervalMajor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIntervalMajor(double newIntervalMajor) {
		double oldIntervalMajor = intervalMajor;
		intervalMajor = newIntervalMajor;
		boolean oldIntervalMajorESet = intervalMajorESet;
		intervalMajorESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChartPackage.DOCUMENT_ROOT__INTERVAL_MAJOR, oldIntervalMajor, intervalMajor, !oldIntervalMajorESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIntervalMajor() {
		double oldIntervalMajor = intervalMajor;
		boolean oldIntervalMajorESet = intervalMajorESet;
		intervalMajor = INTERVAL_MAJOR_EDEFAULT;
		intervalMajorESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ChartPackage.DOCUMENT_ROOT__INTERVAL_MAJOR, oldIntervalMajor, INTERVAL_MAJOR_EDEFAULT, oldIntervalMajorESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIntervalMajor() {
		return intervalMajorESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getIntervalMinorDivisor() {
		return intervalMinorDivisor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIntervalMinorDivisor(BigInteger newIntervalMinorDivisor) {
		BigInteger oldIntervalMinorDivisor = intervalMinorDivisor;
		intervalMinorDivisor = newIntervalMinorDivisor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChartPackage.DOCUMENT_ROOT__INTERVAL_MINOR_DIVISOR, oldIntervalMinorDivisor, intervalMinorDivisor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getJapaneseCandleStick() {
		return japaneseCandleStick;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJapaneseCandleStick(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newJapaneseCandleStick) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldJapaneseCandleStick = japaneseCandleStick;
		japaneseCandleStick = newJapaneseCandleStick == null ? JAPANESE_CANDLE_STICK_EDEFAULT : newJapaneseCandleStick;
		boolean oldJapaneseCandleStickESet = japaneseCandleStickESet;
		japaneseCandleStickESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChartPackage.DOCUMENT_ROOT__JAPANESE_CANDLE_STICK, oldJapaneseCandleStick, japaneseCandleStick, !oldJapaneseCandleStickESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetJapaneseCandleStick() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldJapaneseCandleStick = japaneseCandleStick;
		boolean oldJapaneseCandleStickESet = japaneseCandleStickESet;
		japaneseCandleStick = JAPANESE_CANDLE_STICK_EDEFAULT;
		japaneseCandleStickESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ChartPackage.DOCUMENT_ROOT__JAPANESE_CANDLE_STICK, oldJapaneseCandleStick, JAPANESE_CANDLE_STICK_EDEFAULT, oldJapaneseCandleStickESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetJapaneseCandleStick() {
		return japaneseCandleStickESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LabelArrangementType getLabelArrangement() {
		return labelArrangement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabelArrangement(LabelArrangementType newLabelArrangement) {
		LabelArrangementType oldLabelArrangement = labelArrangement;
		labelArrangement = newLabelArrangement == null ? LABEL_ARRANGEMENT_EDEFAULT : newLabelArrangement;
		boolean oldLabelArrangementESet = labelArrangementESet;
		labelArrangementESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChartPackage.DOCUMENT_ROOT__LABEL_ARRANGEMENT, oldLabelArrangement, labelArrangement, !oldLabelArrangementESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLabelArrangement() {
		LabelArrangementType oldLabelArrangement = labelArrangement;
		boolean oldLabelArrangementESet = labelArrangementESet;
		labelArrangement = LABEL_ARRANGEMENT_EDEFAULT;
		labelArrangementESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ChartPackage.DOCUMENT_ROOT__LABEL_ARRANGEMENT, oldLabelArrangement, LABEL_ARRANGEMENT_EDEFAULT, oldLabelArrangementESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLabelArrangement() {
		return labelArrangementESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLabelCellAddress() {
		return labelCellAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabelCellAddress(String newLabelCellAddress) {
		String oldLabelCellAddress = labelCellAddress;
		labelCellAddress = newLabelCellAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChartPackage.DOCUMENT_ROOT__LABEL_CELL_ADDRESS, oldLabelCellAddress, labelCellAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LegendAlignType getLegendAlign() {
		return legendAlign;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLegendAlign(LegendAlignType newLegendAlign) {
		LegendAlignType oldLegendAlign = legendAlign;
		legendAlign = newLegendAlign == null ? LEGEND_ALIGN_EDEFAULT : newLegendAlign;
		boolean oldLegendAlignESet = legendAlignESet;
		legendAlignESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChartPackage.DOCUMENT_ROOT__LEGEND_ALIGN, oldLegendAlign, legendAlign, !oldLegendAlignESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLegendAlign() {
		LegendAlignType oldLegendAlign = legendAlign;
		boolean oldLegendAlignESet = legendAlignESet;
		legendAlign = LEGEND_ALIGN_EDEFAULT;
		legendAlignESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ChartPackage.DOCUMENT_ROOT__LEGEND_ALIGN, oldLegendAlign, LEGEND_ALIGN_EDEFAULT, oldLegendAlignESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLegendAlign() {
		return legendAlignESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LegendPositionType getLegendPosition() {
		return legendPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLegendPosition(LegendPositionType newLegendPosition) {
		LegendPositionType oldLegendPosition = legendPosition;
		legendPosition = newLegendPosition == null ? LEGEND_POSITION_EDEFAULT : newLegendPosition;
		boolean oldLegendPositionESet = legendPositionESet;
		legendPositionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChartPackage.DOCUMENT_ROOT__LEGEND_POSITION, oldLegendPosition, legendPosition, !oldLegendPositionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLegendPosition() {
		LegendPositionType oldLegendPosition = legendPosition;
		boolean oldLegendPositionESet = legendPositionESet;
		legendPosition = LEGEND_POSITION_EDEFAULT;
		legendPositionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ChartPackage.DOCUMENT_ROOT__LEGEND_POSITION, oldLegendPosition, LEGEND_POSITION_EDEFAULT, oldLegendPositionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLegendPosition() {
		return legendPositionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getLines() {
		return lines;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLines(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newLines) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldLines = lines;
		lines = newLines == null ? LINES_EDEFAULT : newLines;
		boolean oldLinesESet = linesESet;
		linesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChartPackage.DOCUMENT_ROOT__LINES, oldLines, lines, !oldLinesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLines() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldLines = lines;
		boolean oldLinesESet = linesESet;
		lines = LINES_EDEFAULT;
		linesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ChartPackage.DOCUMENT_ROOT__LINES, oldLines, LINES_EDEFAULT, oldLinesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLines() {
		return linesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getLinkDataStyleToSource() {
		return linkDataStyleToSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinkDataStyleToSource(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newLinkDataStyleToSource) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldLinkDataStyleToSource = linkDataStyleToSource;
		linkDataStyleToSource = newLinkDataStyleToSource == null ? LINK_DATA_STYLE_TO_SOURCE_EDEFAULT : newLinkDataStyleToSource;
		boolean oldLinkDataStyleToSourceESet = linkDataStyleToSourceESet;
		linkDataStyleToSourceESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChartPackage.DOCUMENT_ROOT__LINK_DATA_STYLE_TO_SOURCE, oldLinkDataStyleToSource, linkDataStyleToSource, !oldLinkDataStyleToSourceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLinkDataStyleToSource() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldLinkDataStyleToSource = linkDataStyleToSource;
		boolean oldLinkDataStyleToSourceESet = linkDataStyleToSourceESet;
		linkDataStyleToSource = LINK_DATA_STYLE_TO_SOURCE_EDEFAULT;
		linkDataStyleToSourceESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ChartPackage.DOCUMENT_ROOT__LINK_DATA_STYLE_TO_SOURCE, oldLinkDataStyleToSource, LINK_DATA_STYLE_TO_SOURCE_EDEFAULT, oldLinkDataStyleToSourceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLinkDataStyleToSource() {
		return linkDataStyleToSourceESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getLogarithmic() {
		return logarithmic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLogarithmic(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newLogarithmic) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldLogarithmic = logarithmic;
		logarithmic = newLogarithmic == null ? LOGARITHMIC_EDEFAULT : newLogarithmic;
		boolean oldLogarithmicESet = logarithmicESet;
		logarithmicESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChartPackage.DOCUMENT_ROOT__LOGARITHMIC, oldLogarithmic, logarithmic, !oldLogarithmicESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLogarithmic() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldLogarithmic = logarithmic;
		boolean oldLogarithmicESet = logarithmicESet;
		logarithmic = LOGARITHMIC_EDEFAULT;
		logarithmicESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ChartPackage.DOCUMENT_ROOT__LOGARITHMIC, oldLogarithmic, LOGARITHMIC_EDEFAULT, oldLogarithmicESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLogarithmic() {
		return logarithmicESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMaximum() {
		return maximum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaximum(double newMaximum) {
		double oldMaximum = maximum;
		maximum = newMaximum;
		boolean oldMaximumESet = maximumESet;
		maximumESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChartPackage.DOCUMENT_ROOT__MAXIMUM, oldMaximum, maximum, !oldMaximumESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMaximum() {
		double oldMaximum = maximum;
		boolean oldMaximumESet = maximumESet;
		maximum = MAXIMUM_EDEFAULT;
		maximumESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ChartPackage.DOCUMENT_ROOT__MAXIMUM, oldMaximum, MAXIMUM_EDEFAULT, oldMaximumESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMaximum() {
		return maximumESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getMeanValue1() {
		return meanValue1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMeanValue1(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newMeanValue1) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldMeanValue1 = meanValue1;
		meanValue1 = newMeanValue1 == null ? MEAN_VALUE1_EDEFAULT : newMeanValue1;
		boolean oldMeanValue1ESet = meanValue1ESet;
		meanValue1ESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChartPackage.DOCUMENT_ROOT__MEAN_VALUE1, oldMeanValue1, meanValue1, !oldMeanValue1ESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMeanValue1() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldMeanValue1 = meanValue1;
		boolean oldMeanValue1ESet = meanValue1ESet;
		meanValue1 = MEAN_VALUE1_EDEFAULT;
		meanValue1ESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ChartPackage.DOCUMENT_ROOT__MEAN_VALUE1, oldMeanValue1, MEAN_VALUE1_EDEFAULT, oldMeanValue1ESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMeanValue1() {
		return meanValue1ESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMinimum() {
		return minimum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinimum(double newMinimum) {
		double oldMinimum = minimum;
		minimum = newMinimum;
		boolean oldMinimumESet = minimumESet;
		minimumESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChartPackage.DOCUMENT_ROOT__MINIMUM, oldMinimum, minimum, !oldMinimumESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMinimum() {
		double oldMinimum = minimum;
		boolean oldMinimumESet = minimumESet;
		minimum = MINIMUM_EDEFAULT;
		minimumESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ChartPackage.DOCUMENT_ROOT__MINIMUM, oldMinimum, MINIMUM_EDEFAULT, oldMinimumESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMinimum() {
		return minimumESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChartPackage.DOCUMENT_ROOT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getOrigin() {
		return origin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrigin(double newOrigin) {
		double oldOrigin = origin;
		origin = newOrigin;
		boolean oldOriginESet = originESet;
		originESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChartPackage.DOCUMENT_ROOT__ORIGIN, oldOrigin, origin, !oldOriginESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetOrigin() {
		double oldOrigin = origin;
		boolean oldOriginESet = originESet;
		origin = ORIGIN_EDEFAULT;
		originESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ChartPackage.DOCUMENT_ROOT__ORIGIN, oldOrigin, ORIGIN_EDEFAULT, oldOriginESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOrigin() {
		return originESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getOverlap() {
		return overlap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOverlap(BigInteger newOverlap) {
		BigInteger oldOverlap = overlap;
		overlap = newOverlap;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChartPackage.DOCUMENT_ROOT__OVERLAP, oldOverlap, overlap));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getPercentage() {
		return percentage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPercentage(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newPercentage) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldPercentage = percentage;
		percentage = newPercentage == null ? PERCENTAGE_EDEFAULT : newPercentage;
		boolean oldPercentageESet = percentageESet;
		percentageESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChartPackage.DOCUMENT_ROOT__PERCENTAGE, oldPercentage, percentage, !oldPercentageESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPercentage() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldPercentage = percentage;
		boolean oldPercentageESet = percentageESet;
		percentage = PERCENTAGE_EDEFAULT;
		percentageESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ChartPackage.DOCUMENT_ROOT__PERCENTAGE, oldPercentage, PERCENTAGE_EDEFAULT, oldPercentageESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPercentage() {
		return percentageESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getPieOffset() {
		return pieOffset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPieOffset(BigInteger newPieOffset) {
		BigInteger oldPieOffset = pieOffset;
		pieOffset = newPieOffset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChartPackage.DOCUMENT_ROOT__PIE_OFFSET, oldPieOffset, pieOffset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegressionTypeType getRegressionType() {
		return regressionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegressionType(RegressionTypeType newRegressionType) {
		RegressionTypeType oldRegressionType = regressionType;
		regressionType = newRegressionType == null ? REGRESSION_TYPE_EDEFAULT : newRegressionType;
		boolean oldRegressionTypeESet = regressionTypeESet;
		regressionTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChartPackage.DOCUMENT_ROOT__REGRESSION_TYPE, oldRegressionType, regressionType, !oldRegressionTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRegressionType() {
		RegressionTypeType oldRegressionType = regressionType;
		boolean oldRegressionTypeESet = regressionTypeESet;
		regressionType = REGRESSION_TYPE_EDEFAULT;
		regressionTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ChartPackage.DOCUMENT_ROOT__REGRESSION_TYPE, oldRegressionType, REGRESSION_TYPE_EDEFAULT, oldRegressionTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRegressionType() {
		return regressionTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getRepeated() {
		return repeated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepeated(BigInteger newRepeated) {
		BigInteger oldRepeated = repeated;
		repeated = newRepeated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChartPackage.DOCUMENT_ROOT__REPEATED, oldRepeated, repeated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRowMapping() {
		return rowMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRowMapping(String newRowMapping) {
		String oldRowMapping = rowMapping;
		rowMapping = newRowMapping;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChartPackage.DOCUMENT_ROOT__ROW_MAPPING, oldRowMapping, rowMapping));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getScaleText() {
		return scaleText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScaleText(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newScaleText) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldScaleText = scaleText;
		scaleText = newScaleText == null ? SCALE_TEXT_EDEFAULT : newScaleText;
		boolean oldScaleTextESet = scaleTextESet;
		scaleTextESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChartPackage.DOCUMENT_ROOT__SCALE_TEXT, oldScaleText, scaleText, !oldScaleTextESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetScaleText() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldScaleText = scaleText;
		boolean oldScaleTextESet = scaleTextESet;
		scaleText = SCALE_TEXT_EDEFAULT;
		scaleTextESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ChartPackage.DOCUMENT_ROOT__SCALE_TEXT, oldScaleText, SCALE_TEXT_EDEFAULT, oldScaleTextESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetScaleText() {
		return scaleTextESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SeriesSourceType getSeriesSource() {
		return seriesSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeriesSource(SeriesSourceType newSeriesSource) {
		SeriesSourceType oldSeriesSource = seriesSource;
		seriesSource = newSeriesSource == null ? SERIES_SOURCE_EDEFAULT : newSeriesSource;
		boolean oldSeriesSourceESet = seriesSourceESet;
		seriesSourceESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChartPackage.DOCUMENT_ROOT__SERIES_SOURCE, oldSeriesSource, seriesSource, !oldSeriesSourceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSeriesSource() {
		SeriesSourceType oldSeriesSource = seriesSource;
		boolean oldSeriesSourceESet = seriesSourceESet;
		seriesSource = SERIES_SOURCE_EDEFAULT;
		seriesSourceESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ChartPackage.DOCUMENT_ROOT__SERIES_SOURCE, oldSeriesSource, SERIES_SOURCE_EDEFAULT, oldSeriesSourceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSeriesSource() {
		return seriesSourceESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SolidTypeType getSolidType() {
		return solidType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSolidType(SolidTypeType newSolidType) {
		SolidTypeType oldSolidType = solidType;
		solidType = newSolidType == null ? SOLID_TYPE_EDEFAULT : newSolidType;
		boolean oldSolidTypeESet = solidTypeESet;
		solidTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChartPackage.DOCUMENT_ROOT__SOLID_TYPE, oldSolidType, solidType, !oldSolidTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSolidType() {
		SolidTypeType oldSolidType = solidType;
		boolean oldSolidTypeESet = solidTypeESet;
		solidType = SOLID_TYPE_EDEFAULT;
		solidTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ChartPackage.DOCUMENT_ROOT__SOLID_TYPE, oldSolidType, SOLID_TYPE_EDEFAULT, oldSolidTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSolidType() {
		return solidTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getSplineOrder() {
		return splineOrder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSplineOrder(BigInteger newSplineOrder) {
		BigInteger oldSplineOrder = splineOrder;
		splineOrder = newSplineOrder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChartPackage.DOCUMENT_ROOT__SPLINE_ORDER, oldSplineOrder, splineOrder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getSplineResolution() {
		return splineResolution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSplineResolution(BigInteger newSplineResolution) {
		BigInteger oldSplineResolution = splineResolution;
		splineResolution = newSplineResolution;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChartPackage.DOCUMENT_ROOT__SPLINE_RESOLUTION, oldSplineResolution, splineResolution));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getStacked() {
		return stacked;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStacked(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newStacked) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldStacked = stacked;
		stacked = newStacked == null ? STACKED_EDEFAULT : newStacked;
		boolean oldStackedESet = stackedESet;
		stackedESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChartPackage.DOCUMENT_ROOT__STACKED, oldStacked, stacked, !oldStackedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetStacked() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldStacked = stacked;
		boolean oldStackedESet = stackedESet;
		stacked = STACKED_EDEFAULT;
		stackedESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ChartPackage.DOCUMENT_ROOT__STACKED, oldStacked, STACKED_EDEFAULT, oldStackedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetStacked() {
		return stackedESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStyleName() {
		return styleName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStyleName(String newStyleName) {
		String oldStyleName = styleName;
		styleName = newStyleName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChartPackage.DOCUMENT_ROOT__STYLE_NAME, oldStyleName, styleName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSymbolHeight() {
		return symbolHeight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSymbolHeight(String newSymbolHeight) {
		String oldSymbolHeight = symbolHeight;
		symbolHeight = newSymbolHeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChartPackage.DOCUMENT_ROOT__SYMBOL_HEIGHT, oldSymbolHeight, symbolHeight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SymbolNameType getSymbolName() {
		return symbolName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSymbolName(SymbolNameType newSymbolName) {
		SymbolNameType oldSymbolName = symbolName;
		symbolName = newSymbolName == null ? SYMBOL_NAME_EDEFAULT : newSymbolName;
		boolean oldSymbolNameESet = symbolNameESet;
		symbolNameESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChartPackage.DOCUMENT_ROOT__SYMBOL_NAME, oldSymbolName, symbolName, !oldSymbolNameESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSymbolName() {
		SymbolNameType oldSymbolName = symbolName;
		boolean oldSymbolNameESet = symbolNameESet;
		symbolName = SYMBOL_NAME_EDEFAULT;
		symbolNameESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ChartPackage.DOCUMENT_ROOT__SYMBOL_NAME, oldSymbolName, SYMBOL_NAME_EDEFAULT, oldSymbolNameESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSymbolName() {
		return symbolNameESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SymbolTypeType getSymbolType() {
		return symbolType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSymbolType(SymbolTypeType newSymbolType) {
		SymbolTypeType oldSymbolType = symbolType;
		symbolType = newSymbolType == null ? SYMBOL_TYPE_EDEFAULT : newSymbolType;
		boolean oldSymbolTypeESet = symbolTypeESet;
		symbolTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChartPackage.DOCUMENT_ROOT__SYMBOL_TYPE, oldSymbolType, symbolType, !oldSymbolTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSymbolType() {
		SymbolTypeType oldSymbolType = symbolType;
		boolean oldSymbolTypeESet = symbolTypeESet;
		symbolType = SYMBOL_TYPE_EDEFAULT;
		symbolTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ChartPackage.DOCUMENT_ROOT__SYMBOL_TYPE, oldSymbolType, SYMBOL_TYPE_EDEFAULT, oldSymbolTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSymbolType() {
		return symbolTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSymbolWidth() {
		return symbolWidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSymbolWidth(String newSymbolWidth) {
		String oldSymbolWidth = symbolWidth;
		symbolWidth = newSymbolWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChartPackage.DOCUMENT_ROOT__SYMBOL_WIDTH, oldSymbolWidth, symbolWidth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getTextOverlap() {
		return textOverlap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextOverlap(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newTextOverlap) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldTextOverlap = textOverlap;
		textOverlap = newTextOverlap == null ? TEXT_OVERLAP_EDEFAULT : newTextOverlap;
		boolean oldTextOverlapESet = textOverlapESet;
		textOverlapESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChartPackage.DOCUMENT_ROOT__TEXT_OVERLAP, oldTextOverlap, textOverlap, !oldTextOverlapESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTextOverlap() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldTextOverlap = textOverlap;
		boolean oldTextOverlapESet = textOverlapESet;
		textOverlap = TEXT_OVERLAP_EDEFAULT;
		textOverlapESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ChartPackage.DOCUMENT_ROOT__TEXT_OVERLAP, oldTextOverlap, TEXT_OVERLAP_EDEFAULT, oldTextOverlapESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTextOverlap() {
		return textOverlapESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getThreeDimensional() {
		return threeDimensional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThreeDimensional(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newThreeDimensional) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldThreeDimensional = threeDimensional;
		threeDimensional = newThreeDimensional == null ? THREE_DIMENSIONAL_EDEFAULT : newThreeDimensional;
		boolean oldThreeDimensionalESet = threeDimensionalESet;
		threeDimensionalESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChartPackage.DOCUMENT_ROOT__THREE_DIMENSIONAL, oldThreeDimensional, threeDimensional, !oldThreeDimensionalESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetThreeDimensional() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldThreeDimensional = threeDimensional;
		boolean oldThreeDimensionalESet = threeDimensionalESet;
		threeDimensional = THREE_DIMENSIONAL_EDEFAULT;
		threeDimensionalESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ChartPackage.DOCUMENT_ROOT__THREE_DIMENSIONAL, oldThreeDimensional, THREE_DIMENSIONAL_EDEFAULT, oldThreeDimensionalESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetThreeDimensional() {
		return threeDimensionalESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getTickMarksMajorInner() {
		return tickMarksMajorInner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTickMarksMajorInner(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newTickMarksMajorInner) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldTickMarksMajorInner = tickMarksMajorInner;
		tickMarksMajorInner = newTickMarksMajorInner == null ? TICK_MARKS_MAJOR_INNER_EDEFAULT : newTickMarksMajorInner;
		boolean oldTickMarksMajorInnerESet = tickMarksMajorInnerESet;
		tickMarksMajorInnerESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChartPackage.DOCUMENT_ROOT__TICK_MARKS_MAJOR_INNER, oldTickMarksMajorInner, tickMarksMajorInner, !oldTickMarksMajorInnerESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTickMarksMajorInner() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldTickMarksMajorInner = tickMarksMajorInner;
		boolean oldTickMarksMajorInnerESet = tickMarksMajorInnerESet;
		tickMarksMajorInner = TICK_MARKS_MAJOR_INNER_EDEFAULT;
		tickMarksMajorInnerESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ChartPackage.DOCUMENT_ROOT__TICK_MARKS_MAJOR_INNER, oldTickMarksMajorInner, TICK_MARKS_MAJOR_INNER_EDEFAULT, oldTickMarksMajorInnerESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTickMarksMajorInner() {
		return tickMarksMajorInnerESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getTickMarksMajorOuter() {
		return tickMarksMajorOuter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTickMarksMajorOuter(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newTickMarksMajorOuter) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldTickMarksMajorOuter = tickMarksMajorOuter;
		tickMarksMajorOuter = newTickMarksMajorOuter == null ? TICK_MARKS_MAJOR_OUTER_EDEFAULT : newTickMarksMajorOuter;
		boolean oldTickMarksMajorOuterESet = tickMarksMajorOuterESet;
		tickMarksMajorOuterESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChartPackage.DOCUMENT_ROOT__TICK_MARKS_MAJOR_OUTER, oldTickMarksMajorOuter, tickMarksMajorOuter, !oldTickMarksMajorOuterESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTickMarksMajorOuter() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldTickMarksMajorOuter = tickMarksMajorOuter;
		boolean oldTickMarksMajorOuterESet = tickMarksMajorOuterESet;
		tickMarksMajorOuter = TICK_MARKS_MAJOR_OUTER_EDEFAULT;
		tickMarksMajorOuterESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ChartPackage.DOCUMENT_ROOT__TICK_MARKS_MAJOR_OUTER, oldTickMarksMajorOuter, TICK_MARKS_MAJOR_OUTER_EDEFAULT, oldTickMarksMajorOuterESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTickMarksMajorOuter() {
		return tickMarksMajorOuterESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getTickMarksMinorInner() {
		return tickMarksMinorInner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTickMarksMinorInner(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newTickMarksMinorInner) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldTickMarksMinorInner = tickMarksMinorInner;
		tickMarksMinorInner = newTickMarksMinorInner == null ? TICK_MARKS_MINOR_INNER_EDEFAULT : newTickMarksMinorInner;
		boolean oldTickMarksMinorInnerESet = tickMarksMinorInnerESet;
		tickMarksMinorInnerESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChartPackage.DOCUMENT_ROOT__TICK_MARKS_MINOR_INNER, oldTickMarksMinorInner, tickMarksMinorInner, !oldTickMarksMinorInnerESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTickMarksMinorInner() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldTickMarksMinorInner = tickMarksMinorInner;
		boolean oldTickMarksMinorInnerESet = tickMarksMinorInnerESet;
		tickMarksMinorInner = TICK_MARKS_MINOR_INNER_EDEFAULT;
		tickMarksMinorInnerESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ChartPackage.DOCUMENT_ROOT__TICK_MARKS_MINOR_INNER, oldTickMarksMinorInner, TICK_MARKS_MINOR_INNER_EDEFAULT, oldTickMarksMinorInnerESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTickMarksMinorInner() {
		return tickMarksMinorInnerESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getTickMarksMinorOuter() {
		return tickMarksMinorOuter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTickMarksMinorOuter(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newTickMarksMinorOuter) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldTickMarksMinorOuter = tickMarksMinorOuter;
		tickMarksMinorOuter = newTickMarksMinorOuter == null ? TICK_MARKS_MINOR_OUTER_EDEFAULT : newTickMarksMinorOuter;
		boolean oldTickMarksMinorOuterESet = tickMarksMinorOuterESet;
		tickMarksMinorOuterESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChartPackage.DOCUMENT_ROOT__TICK_MARKS_MINOR_OUTER, oldTickMarksMinorOuter, tickMarksMinorOuter, !oldTickMarksMinorOuterESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTickMarksMinorOuter() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldTickMarksMinorOuter = tickMarksMinorOuter;
		boolean oldTickMarksMinorOuterESet = tickMarksMinorOuterESet;
		tickMarksMinorOuter = TICK_MARKS_MINOR_OUTER_EDEFAULT;
		tickMarksMinorOuterESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ChartPackage.DOCUMENT_ROOT__TICK_MARKS_MINOR_OUTER, oldTickMarksMinorOuter, TICK_MARKS_MINOR_OUTER_EDEFAULT, oldTickMarksMinorOuterESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTickMarksMinorOuter() {
		return tickMarksMinorOuterESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValuesCellRangeAddress() {
		return valuesCellRangeAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValuesCellRangeAddress(String newValuesCellRangeAddress) {
		String oldValuesCellRangeAddress = valuesCellRangeAddress;
		valuesCellRangeAddress = newValuesCellRangeAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChartPackage.DOCUMENT_ROOT__VALUES_CELL_RANGE_ADDRESS, oldValuesCellRangeAddress, valuesCellRangeAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getVertical() {
		return vertical;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVertical(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newVertical) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldVertical = vertical;
		vertical = newVertical == null ? VERTICAL_EDEFAULT : newVertical;
		boolean oldVerticalESet = verticalESet;
		verticalESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChartPackage.DOCUMENT_ROOT__VERTICAL, oldVertical, vertical, !oldVerticalESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetVertical() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldVertical = vertical;
		boolean oldVerticalESet = verticalESet;
		vertical = VERTICAL_EDEFAULT;
		verticalESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ChartPackage.DOCUMENT_ROOT__VERTICAL, oldVertical, VERTICAL_EDEFAULT, oldVerticalESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetVertical() {
		return verticalESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getVisible() {
		return visible;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisible(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newVisible) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldVisible = visible;
		visible = newVisible == null ? VISIBLE_EDEFAULT : newVisible;
		boolean oldVisibleESet = visibleESet;
		visibleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChartPackage.DOCUMENT_ROOT__VISIBLE, oldVisible, visible, !oldVisibleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetVisible() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldVisible = visible;
		boolean oldVisibleESet = visibleESet;
		visible = VISIBLE_EDEFAULT;
		visibleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ChartPackage.DOCUMENT_ROOT__VISIBLE, oldVisible, VISIBLE_EDEFAULT, oldVisibleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetVisible() {
		return visibleESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ChartPackage.DOCUMENT_ROOT__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case ChartPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return ((InternalEList<?>)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
			case ChartPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return ((InternalEList<?>)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
			case ChartPackage.DOCUMENT_ROOT__AXIS:
				return basicSetAxis(null, msgs);
			case ChartPackage.DOCUMENT_ROOT__CATEGORIES:
				return basicSetCategories(null, msgs);
			case ChartPackage.DOCUMENT_ROOT__CHART:
				return basicSetChart(null, msgs);
			case ChartPackage.DOCUMENT_ROOT__DATA_POINT:
				return basicSetDataPoint(null, msgs);
			case ChartPackage.DOCUMENT_ROOT__DOMAIN:
				return basicSetDomain(null, msgs);
			case ChartPackage.DOCUMENT_ROOT__ERROR_INDICATOR:
				return basicSetErrorIndicator(null, msgs);
			case ChartPackage.DOCUMENT_ROOT__FLOOR:
				return basicSetFloor(null, msgs);
			case ChartPackage.DOCUMENT_ROOT__FOOTER:
				return basicSetFooter(null, msgs);
			case ChartPackage.DOCUMENT_ROOT__GRID:
				return basicSetGrid(null, msgs);
			case ChartPackage.DOCUMENT_ROOT__LEGEND:
				return basicSetLegend(null, msgs);
			case ChartPackage.DOCUMENT_ROOT__MEAN_VALUE:
				return basicSetMeanValue(null, msgs);
			case ChartPackage.DOCUMENT_ROOT__PLOT_AREA:
				return basicSetPlotArea(null, msgs);
			case ChartPackage.DOCUMENT_ROOT__REGRESSION_CURVE:
				return basicSetRegressionCurve(null, msgs);
			case ChartPackage.DOCUMENT_ROOT__SERIES:
				return basicSetSeries(null, msgs);
			case ChartPackage.DOCUMENT_ROOT__STOCK_GAIN_MARKER:
				return basicSetStockGainMarker(null, msgs);
			case ChartPackage.DOCUMENT_ROOT__STOCK_LOSS_MARKER:
				return basicSetStockLossMarker(null, msgs);
			case ChartPackage.DOCUMENT_ROOT__STOCK_RANGE_LINE:
				return basicSetStockRangeLine(null, msgs);
			case ChartPackage.DOCUMENT_ROOT__SUBTITLE:
				return basicSetSubtitle(null, msgs);
			case ChartPackage.DOCUMENT_ROOT__SYMBOL_IMAGE:
				return basicSetSymbolImage(null, msgs);
			case ChartPackage.DOCUMENT_ROOT__TITLE:
				return basicSetTitle(null, msgs);
			case ChartPackage.DOCUMENT_ROOT__WALL:
				return basicSetWall(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ChartPackage.DOCUMENT_ROOT__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case ChartPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				if (coreType) return getXMLNSPrefixMap();
				else return getXMLNSPrefixMap().map();
			case ChartPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				if (coreType) return getXSISchemaLocation();
				else return getXSISchemaLocation().map();
			case ChartPackage.DOCUMENT_ROOT__AXIS:
				return getAxis();
			case ChartPackage.DOCUMENT_ROOT__CATEGORIES:
				return getCategories();
			case ChartPackage.DOCUMENT_ROOT__CHART:
				return getChart();
			case ChartPackage.DOCUMENT_ROOT__DATA_POINT:
				return getDataPoint();
			case ChartPackage.DOCUMENT_ROOT__DOMAIN:
				return getDomain();
			case ChartPackage.DOCUMENT_ROOT__ERROR_INDICATOR:
				return getErrorIndicator();
			case ChartPackage.DOCUMENT_ROOT__FLOOR:
				return getFloor();
			case ChartPackage.DOCUMENT_ROOT__FOOTER:
				return getFooter();
			case ChartPackage.DOCUMENT_ROOT__GRID:
				return getGrid();
			case ChartPackage.DOCUMENT_ROOT__LEGEND:
				return getLegend();
			case ChartPackage.DOCUMENT_ROOT__MEAN_VALUE:
				return getMeanValue();
			case ChartPackage.DOCUMENT_ROOT__PLOT_AREA:
				return getPlotArea();
			case ChartPackage.DOCUMENT_ROOT__REGRESSION_CURVE:
				return getRegressionCurve();
			case ChartPackage.DOCUMENT_ROOT__SERIES:
				return getSeries();
			case ChartPackage.DOCUMENT_ROOT__STOCK_GAIN_MARKER:
				return getStockGainMarker();
			case ChartPackage.DOCUMENT_ROOT__STOCK_LOSS_MARKER:
				return getStockLossMarker();
			case ChartPackage.DOCUMENT_ROOT__STOCK_RANGE_LINE:
				return getStockRangeLine();
			case ChartPackage.DOCUMENT_ROOT__SUBTITLE:
				return getSubtitle();
			case ChartPackage.DOCUMENT_ROOT__SYMBOL_IMAGE:
				return getSymbolImage();
			case ChartPackage.DOCUMENT_ROOT__TITLE:
				return getTitle();
			case ChartPackage.DOCUMENT_ROOT__WALL:
				return getWall();
			case ChartPackage.DOCUMENT_ROOT__ATTACHED_AXIS:
				return getAttachedAxis();
			case ChartPackage.DOCUMENT_ROOT__COLUMN_MAPPING:
				return getColumnMapping();
			case ChartPackage.DOCUMENT_ROOT__CONNECT_BARS:
				return getConnectBars();
			case ChartPackage.DOCUMENT_ROOT__DATA_LABEL_NUMBER:
				return getDataLabelNumber();
			case ChartPackage.DOCUMENT_ROOT__DATA_LABEL_SYMBOL:
				return getDataLabelSymbol();
			case ChartPackage.DOCUMENT_ROOT__DATA_LABEL_TEXT:
				return getDataLabelText();
			case ChartPackage.DOCUMENT_ROOT__DATA_SOURCE_HAS_LABELS:
				return getDataSourceHasLabels();
			case ChartPackage.DOCUMENT_ROOT__DEEP:
				return getDeep();
			case ChartPackage.DOCUMENT_ROOT__DIMENSION:
				return getDimension();
			case ChartPackage.DOCUMENT_ROOT__DISPLAY_LABEL:
				return getDisplayLabel();
			case ChartPackage.DOCUMENT_ROOT__ERROR_CATEGORY:
				return getErrorCategory();
			case ChartPackage.DOCUMENT_ROOT__ERROR_LOWER_INDICATOR:
				return getErrorLowerIndicator();
			case ChartPackage.DOCUMENT_ROOT__ERROR_LOWER_LIMIT:
				return new Double(getErrorLowerLimit());
			case ChartPackage.DOCUMENT_ROOT__ERROR_MARGIN:
				return new Double(getErrorMargin());
			case ChartPackage.DOCUMENT_ROOT__ERROR_PERCENTAGE:
				return new Double(getErrorPercentage());
			case ChartPackage.DOCUMENT_ROOT__ERROR_UPPER_INDICATOR:
				return getErrorUpperIndicator();
			case ChartPackage.DOCUMENT_ROOT__ERROR_UPPER_LIMIT:
				return new Double(getErrorUpperLimit());
			case ChartPackage.DOCUMENT_ROOT__GAP_WIDTH:
				return getGapWidth();
			case ChartPackage.DOCUMENT_ROOT__INTERPOLATION:
				return getInterpolation();
			case ChartPackage.DOCUMENT_ROOT__INTERVAL_MAJOR:
				return new Double(getIntervalMajor());
			case ChartPackage.DOCUMENT_ROOT__INTERVAL_MINOR_DIVISOR:
				return getIntervalMinorDivisor();
			case ChartPackage.DOCUMENT_ROOT__JAPANESE_CANDLE_STICK:
				return getJapaneseCandleStick();
			case ChartPackage.DOCUMENT_ROOT__LABEL_ARRANGEMENT:
				return getLabelArrangement();
			case ChartPackage.DOCUMENT_ROOT__LABEL_CELL_ADDRESS:
				return getLabelCellAddress();
			case ChartPackage.DOCUMENT_ROOT__LEGEND_ALIGN:
				return getLegendAlign();
			case ChartPackage.DOCUMENT_ROOT__LEGEND_POSITION:
				return getLegendPosition();
			case ChartPackage.DOCUMENT_ROOT__LINES:
				return getLines();
			case ChartPackage.DOCUMENT_ROOT__LINK_DATA_STYLE_TO_SOURCE:
				return getLinkDataStyleToSource();
			case ChartPackage.DOCUMENT_ROOT__LOGARITHMIC:
				return getLogarithmic();
			case ChartPackage.DOCUMENT_ROOT__MAXIMUM:
				return new Double(getMaximum());
			case ChartPackage.DOCUMENT_ROOT__MEAN_VALUE1:
				return getMeanValue1();
			case ChartPackage.DOCUMENT_ROOT__MINIMUM:
				return new Double(getMinimum());
			case ChartPackage.DOCUMENT_ROOT__NAME:
				return getName();
			case ChartPackage.DOCUMENT_ROOT__ORIGIN:
				return new Double(getOrigin());
			case ChartPackage.DOCUMENT_ROOT__OVERLAP:
				return getOverlap();
			case ChartPackage.DOCUMENT_ROOT__PERCENTAGE:
				return getPercentage();
			case ChartPackage.DOCUMENT_ROOT__PIE_OFFSET:
				return getPieOffset();
			case ChartPackage.DOCUMENT_ROOT__REGRESSION_TYPE:
				return getRegressionType();
			case ChartPackage.DOCUMENT_ROOT__REPEATED:
				return getRepeated();
			case ChartPackage.DOCUMENT_ROOT__ROW_MAPPING:
				return getRowMapping();
			case ChartPackage.DOCUMENT_ROOT__SCALE_TEXT:
				return getScaleText();
			case ChartPackage.DOCUMENT_ROOT__SERIES_SOURCE:
				return getSeriesSource();
			case ChartPackage.DOCUMENT_ROOT__SOLID_TYPE:
				return getSolidType();
			case ChartPackage.DOCUMENT_ROOT__SPLINE_ORDER:
				return getSplineOrder();
			case ChartPackage.DOCUMENT_ROOT__SPLINE_RESOLUTION:
				return getSplineResolution();
			case ChartPackage.DOCUMENT_ROOT__STACKED:
				return getStacked();
			case ChartPackage.DOCUMENT_ROOT__STYLE_NAME:
				return getStyleName();
			case ChartPackage.DOCUMENT_ROOT__SYMBOL_HEIGHT:
				return getSymbolHeight();
			case ChartPackage.DOCUMENT_ROOT__SYMBOL_NAME:
				return getSymbolName();
			case ChartPackage.DOCUMENT_ROOT__SYMBOL_TYPE:
				return getSymbolType();
			case ChartPackage.DOCUMENT_ROOT__SYMBOL_WIDTH:
				return getSymbolWidth();
			case ChartPackage.DOCUMENT_ROOT__TEXT_OVERLAP:
				return getTextOverlap();
			case ChartPackage.DOCUMENT_ROOT__THREE_DIMENSIONAL:
				return getThreeDimensional();
			case ChartPackage.DOCUMENT_ROOT__TICK_MARKS_MAJOR_INNER:
				return getTickMarksMajorInner();
			case ChartPackage.DOCUMENT_ROOT__TICK_MARKS_MAJOR_OUTER:
				return getTickMarksMajorOuter();
			case ChartPackage.DOCUMENT_ROOT__TICK_MARKS_MINOR_INNER:
				return getTickMarksMinorInner();
			case ChartPackage.DOCUMENT_ROOT__TICK_MARKS_MINOR_OUTER:
				return getTickMarksMinorOuter();
			case ChartPackage.DOCUMENT_ROOT__VALUES_CELL_RANGE_ADDRESS:
				return getValuesCellRangeAddress();
			case ChartPackage.DOCUMENT_ROOT__VERTICAL:
				return getVertical();
			case ChartPackage.DOCUMENT_ROOT__VISIBLE:
				return getVisible();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ChartPackage.DOCUMENT_ROOT__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case ChartPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
				return;
			case ChartPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
				return;
			case ChartPackage.DOCUMENT_ROOT__AXIS:
				setAxis((AxisType)newValue);
				return;
			case ChartPackage.DOCUMENT_ROOT__CATEGORIES:
				setCategories((CategoriesType)newValue);
				return;
			case ChartPackage.DOCUMENT_ROOT__CHART:
				setChart((OfficeChartContentMainType)newValue);
				return;
			case ChartPackage.DOCUMENT_ROOT__DATA_POINT:
				setDataPoint((DataPointType)newValue);
				return;
			case ChartPackage.DOCUMENT_ROOT__DOMAIN:
				setDomain((DomainType)newValue);
				return;
			case ChartPackage.DOCUMENT_ROOT__ERROR_INDICATOR:
				setErrorIndicator((ErrorIndicatorType)newValue);
				return;
			case ChartPackage.DOCUMENT_ROOT__FLOOR:
				setFloor((FloorType)newValue);
				return;
			case ChartPackage.DOCUMENT_ROOT__FOOTER:
				setFooter((FooterType)newValue);
				return;
			case ChartPackage.DOCUMENT_ROOT__GRID:
				setGrid((GridType)newValue);
				return;
			case ChartPackage.DOCUMENT_ROOT__LEGEND:
				setLegend((LegendType)newValue);
				return;
			case ChartPackage.DOCUMENT_ROOT__MEAN_VALUE:
				setMeanValue((MeanValueType)newValue);
				return;
			case ChartPackage.DOCUMENT_ROOT__PLOT_AREA:
				setPlotArea((PlotAreaType)newValue);
				return;
			case ChartPackage.DOCUMENT_ROOT__REGRESSION_CURVE:
				setRegressionCurve((RegressionCurveType)newValue);
				return;
			case ChartPackage.DOCUMENT_ROOT__SERIES:
				setSeries((SeriesType)newValue);
				return;
			case ChartPackage.DOCUMENT_ROOT__STOCK_GAIN_MARKER:
				setStockGainMarker((StockGainMarkerType)newValue);
				return;
			case ChartPackage.DOCUMENT_ROOT__STOCK_LOSS_MARKER:
				setStockLossMarker((StockLossMarkerType)newValue);
				return;
			case ChartPackage.DOCUMENT_ROOT__STOCK_RANGE_LINE:
				setStockRangeLine((StockRangeLineType)newValue);
				return;
			case ChartPackage.DOCUMENT_ROOT__SUBTITLE:
				setSubtitle((SubtitleType)newValue);
				return;
			case ChartPackage.DOCUMENT_ROOT__SYMBOL_IMAGE:
				setSymbolImage((SymbolImageType)newValue);
				return;
			case ChartPackage.DOCUMENT_ROOT__TITLE:
				setTitle((TitleType)newValue);
				return;
			case ChartPackage.DOCUMENT_ROOT__WALL:
				setWall((WallType)newValue);
				return;
			case ChartPackage.DOCUMENT_ROOT__ATTACHED_AXIS:
				setAttachedAxis((String)newValue);
				return;
			case ChartPackage.DOCUMENT_ROOT__COLUMN_MAPPING:
				setColumnMapping((String)newValue);
				return;
			case ChartPackage.DOCUMENT_ROOT__CONNECT_BARS:
				setConnectBars((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case ChartPackage.DOCUMENT_ROOT__DATA_LABEL_NUMBER:
				setDataLabelNumber((DataLabelNumberType)newValue);
				return;
			case ChartPackage.DOCUMENT_ROOT__DATA_LABEL_SYMBOL:
				setDataLabelSymbol((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case ChartPackage.DOCUMENT_ROOT__DATA_LABEL_TEXT:
				setDataLabelText((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case ChartPackage.DOCUMENT_ROOT__DATA_SOURCE_HAS_LABELS:
				setDataSourceHasLabels((DataSourceHasLabelsType)newValue);
				return;
			case ChartPackage.DOCUMENT_ROOT__DEEP:
				setDeep((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case ChartPackage.DOCUMENT_ROOT__DIMENSION:
				setDimension((DimensionType)newValue);
				return;
			case ChartPackage.DOCUMENT_ROOT__DISPLAY_LABEL:
				setDisplayLabel((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case ChartPackage.DOCUMENT_ROOT__ERROR_CATEGORY:
				setErrorCategory((ErrorCategoryType)newValue);
				return;
			case ChartPackage.DOCUMENT_ROOT__ERROR_LOWER_INDICATOR:
				setErrorLowerIndicator((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case ChartPackage.DOCUMENT_ROOT__ERROR_LOWER_LIMIT:
				setErrorLowerLimit(((Double)newValue).doubleValue());
				return;
			case ChartPackage.DOCUMENT_ROOT__ERROR_MARGIN:
				setErrorMargin(((Double)newValue).doubleValue());
				return;
			case ChartPackage.DOCUMENT_ROOT__ERROR_PERCENTAGE:
				setErrorPercentage(((Double)newValue).doubleValue());
				return;
			case ChartPackage.DOCUMENT_ROOT__ERROR_UPPER_INDICATOR:
				setErrorUpperIndicator((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case ChartPackage.DOCUMENT_ROOT__ERROR_UPPER_LIMIT:
				setErrorUpperLimit(((Double)newValue).doubleValue());
				return;
			case ChartPackage.DOCUMENT_ROOT__GAP_WIDTH:
				setGapWidth((BigInteger)newValue);
				return;
			case ChartPackage.DOCUMENT_ROOT__INTERPOLATION:
				setInterpolation((InterpolationType)newValue);
				return;
			case ChartPackage.DOCUMENT_ROOT__INTERVAL_MAJOR:
				setIntervalMajor(((Double)newValue).doubleValue());
				return;
			case ChartPackage.DOCUMENT_ROOT__INTERVAL_MINOR_DIVISOR:
				setIntervalMinorDivisor((BigInteger)newValue);
				return;
			case ChartPackage.DOCUMENT_ROOT__JAPANESE_CANDLE_STICK:
				setJapaneseCandleStick((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case ChartPackage.DOCUMENT_ROOT__LABEL_ARRANGEMENT:
				setLabelArrangement((LabelArrangementType)newValue);
				return;
			case ChartPackage.DOCUMENT_ROOT__LABEL_CELL_ADDRESS:
				setLabelCellAddress((String)newValue);
				return;
			case ChartPackage.DOCUMENT_ROOT__LEGEND_ALIGN:
				setLegendAlign((LegendAlignType)newValue);
				return;
			case ChartPackage.DOCUMENT_ROOT__LEGEND_POSITION:
				setLegendPosition((LegendPositionType)newValue);
				return;
			case ChartPackage.DOCUMENT_ROOT__LINES:
				setLines((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case ChartPackage.DOCUMENT_ROOT__LINK_DATA_STYLE_TO_SOURCE:
				setLinkDataStyleToSource((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case ChartPackage.DOCUMENT_ROOT__LOGARITHMIC:
				setLogarithmic((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case ChartPackage.DOCUMENT_ROOT__MAXIMUM:
				setMaximum(((Double)newValue).doubleValue());
				return;
			case ChartPackage.DOCUMENT_ROOT__MEAN_VALUE1:
				setMeanValue1((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case ChartPackage.DOCUMENT_ROOT__MINIMUM:
				setMinimum(((Double)newValue).doubleValue());
				return;
			case ChartPackage.DOCUMENT_ROOT__NAME:
				setName((String)newValue);
				return;
			case ChartPackage.DOCUMENT_ROOT__ORIGIN:
				setOrigin(((Double)newValue).doubleValue());
				return;
			case ChartPackage.DOCUMENT_ROOT__OVERLAP:
				setOverlap((BigInteger)newValue);
				return;
			case ChartPackage.DOCUMENT_ROOT__PERCENTAGE:
				setPercentage((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case ChartPackage.DOCUMENT_ROOT__PIE_OFFSET:
				setPieOffset((BigInteger)newValue);
				return;
			case ChartPackage.DOCUMENT_ROOT__REGRESSION_TYPE:
				setRegressionType((RegressionTypeType)newValue);
				return;
			case ChartPackage.DOCUMENT_ROOT__REPEATED:
				setRepeated((BigInteger)newValue);
				return;
			case ChartPackage.DOCUMENT_ROOT__ROW_MAPPING:
				setRowMapping((String)newValue);
				return;
			case ChartPackage.DOCUMENT_ROOT__SCALE_TEXT:
				setScaleText((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case ChartPackage.DOCUMENT_ROOT__SERIES_SOURCE:
				setSeriesSource((SeriesSourceType)newValue);
				return;
			case ChartPackage.DOCUMENT_ROOT__SOLID_TYPE:
				setSolidType((SolidTypeType)newValue);
				return;
			case ChartPackage.DOCUMENT_ROOT__SPLINE_ORDER:
				setSplineOrder((BigInteger)newValue);
				return;
			case ChartPackage.DOCUMENT_ROOT__SPLINE_RESOLUTION:
				setSplineResolution((BigInteger)newValue);
				return;
			case ChartPackage.DOCUMENT_ROOT__STACKED:
				setStacked((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case ChartPackage.DOCUMENT_ROOT__STYLE_NAME:
				setStyleName((String)newValue);
				return;
			case ChartPackage.DOCUMENT_ROOT__SYMBOL_HEIGHT:
				setSymbolHeight((String)newValue);
				return;
			case ChartPackage.DOCUMENT_ROOT__SYMBOL_NAME:
				setSymbolName((SymbolNameType)newValue);
				return;
			case ChartPackage.DOCUMENT_ROOT__SYMBOL_TYPE:
				setSymbolType((SymbolTypeType)newValue);
				return;
			case ChartPackage.DOCUMENT_ROOT__SYMBOL_WIDTH:
				setSymbolWidth((String)newValue);
				return;
			case ChartPackage.DOCUMENT_ROOT__TEXT_OVERLAP:
				setTextOverlap((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case ChartPackage.DOCUMENT_ROOT__THREE_DIMENSIONAL:
				setThreeDimensional((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case ChartPackage.DOCUMENT_ROOT__TICK_MARKS_MAJOR_INNER:
				setTickMarksMajorInner((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case ChartPackage.DOCUMENT_ROOT__TICK_MARKS_MAJOR_OUTER:
				setTickMarksMajorOuter((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case ChartPackage.DOCUMENT_ROOT__TICK_MARKS_MINOR_INNER:
				setTickMarksMinorInner((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case ChartPackage.DOCUMENT_ROOT__TICK_MARKS_MINOR_OUTER:
				setTickMarksMinorOuter((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case ChartPackage.DOCUMENT_ROOT__VALUES_CELL_RANGE_ADDRESS:
				setValuesCellRangeAddress((String)newValue);
				return;
			case ChartPackage.DOCUMENT_ROOT__VERTICAL:
				setVertical((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case ChartPackage.DOCUMENT_ROOT__VISIBLE:
				setVisible((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ChartPackage.DOCUMENT_ROOT__MIXED:
				getMixed().clear();
				return;
			case ChartPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				getXMLNSPrefixMap().clear();
				return;
			case ChartPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				getXSISchemaLocation().clear();
				return;
			case ChartPackage.DOCUMENT_ROOT__AXIS:
				setAxis((AxisType)null);
				return;
			case ChartPackage.DOCUMENT_ROOT__CATEGORIES:
				setCategories((CategoriesType)null);
				return;
			case ChartPackage.DOCUMENT_ROOT__CHART:
				setChart((OfficeChartContentMainType)null);
				return;
			case ChartPackage.DOCUMENT_ROOT__DATA_POINT:
				setDataPoint((DataPointType)null);
				return;
			case ChartPackage.DOCUMENT_ROOT__DOMAIN:
				setDomain((DomainType)null);
				return;
			case ChartPackage.DOCUMENT_ROOT__ERROR_INDICATOR:
				setErrorIndicator((ErrorIndicatorType)null);
				return;
			case ChartPackage.DOCUMENT_ROOT__FLOOR:
				setFloor((FloorType)null);
				return;
			case ChartPackage.DOCUMENT_ROOT__FOOTER:
				setFooter((FooterType)null);
				return;
			case ChartPackage.DOCUMENT_ROOT__GRID:
				setGrid((GridType)null);
				return;
			case ChartPackage.DOCUMENT_ROOT__LEGEND:
				setLegend((LegendType)null);
				return;
			case ChartPackage.DOCUMENT_ROOT__MEAN_VALUE:
				setMeanValue((MeanValueType)null);
				return;
			case ChartPackage.DOCUMENT_ROOT__PLOT_AREA:
				setPlotArea((PlotAreaType)null);
				return;
			case ChartPackage.DOCUMENT_ROOT__REGRESSION_CURVE:
				setRegressionCurve((RegressionCurveType)null);
				return;
			case ChartPackage.DOCUMENT_ROOT__SERIES:
				setSeries((SeriesType)null);
				return;
			case ChartPackage.DOCUMENT_ROOT__STOCK_GAIN_MARKER:
				setStockGainMarker((StockGainMarkerType)null);
				return;
			case ChartPackage.DOCUMENT_ROOT__STOCK_LOSS_MARKER:
				setStockLossMarker((StockLossMarkerType)null);
				return;
			case ChartPackage.DOCUMENT_ROOT__STOCK_RANGE_LINE:
				setStockRangeLine((StockRangeLineType)null);
				return;
			case ChartPackage.DOCUMENT_ROOT__SUBTITLE:
				setSubtitle((SubtitleType)null);
				return;
			case ChartPackage.DOCUMENT_ROOT__SYMBOL_IMAGE:
				setSymbolImage((SymbolImageType)null);
				return;
			case ChartPackage.DOCUMENT_ROOT__TITLE:
				setTitle((TitleType)null);
				return;
			case ChartPackage.DOCUMENT_ROOT__WALL:
				setWall((WallType)null);
				return;
			case ChartPackage.DOCUMENT_ROOT__ATTACHED_AXIS:
				setAttachedAxis(ATTACHED_AXIS_EDEFAULT);
				return;
			case ChartPackage.DOCUMENT_ROOT__COLUMN_MAPPING:
				setColumnMapping(COLUMN_MAPPING_EDEFAULT);
				return;
			case ChartPackage.DOCUMENT_ROOT__CONNECT_BARS:
				unsetConnectBars();
				return;
			case ChartPackage.DOCUMENT_ROOT__DATA_LABEL_NUMBER:
				unsetDataLabelNumber();
				return;
			case ChartPackage.DOCUMENT_ROOT__DATA_LABEL_SYMBOL:
				unsetDataLabelSymbol();
				return;
			case ChartPackage.DOCUMENT_ROOT__DATA_LABEL_TEXT:
				unsetDataLabelText();
				return;
			case ChartPackage.DOCUMENT_ROOT__DATA_SOURCE_HAS_LABELS:
				unsetDataSourceHasLabels();
				return;
			case ChartPackage.DOCUMENT_ROOT__DEEP:
				unsetDeep();
				return;
			case ChartPackage.DOCUMENT_ROOT__DIMENSION:
				unsetDimension();
				return;
			case ChartPackage.DOCUMENT_ROOT__DISPLAY_LABEL:
				unsetDisplayLabel();
				return;
			case ChartPackage.DOCUMENT_ROOT__ERROR_CATEGORY:
				unsetErrorCategory();
				return;
			case ChartPackage.DOCUMENT_ROOT__ERROR_LOWER_INDICATOR:
				unsetErrorLowerIndicator();
				return;
			case ChartPackage.DOCUMENT_ROOT__ERROR_LOWER_LIMIT:
				unsetErrorLowerLimit();
				return;
			case ChartPackage.DOCUMENT_ROOT__ERROR_MARGIN:
				unsetErrorMargin();
				return;
			case ChartPackage.DOCUMENT_ROOT__ERROR_PERCENTAGE:
				unsetErrorPercentage();
				return;
			case ChartPackage.DOCUMENT_ROOT__ERROR_UPPER_INDICATOR:
				unsetErrorUpperIndicator();
				return;
			case ChartPackage.DOCUMENT_ROOT__ERROR_UPPER_LIMIT:
				unsetErrorUpperLimit();
				return;
			case ChartPackage.DOCUMENT_ROOT__GAP_WIDTH:
				setGapWidth(GAP_WIDTH_EDEFAULT);
				return;
			case ChartPackage.DOCUMENT_ROOT__INTERPOLATION:
				unsetInterpolation();
				return;
			case ChartPackage.DOCUMENT_ROOT__INTERVAL_MAJOR:
				unsetIntervalMajor();
				return;
			case ChartPackage.DOCUMENT_ROOT__INTERVAL_MINOR_DIVISOR:
				setIntervalMinorDivisor(INTERVAL_MINOR_DIVISOR_EDEFAULT);
				return;
			case ChartPackage.DOCUMENT_ROOT__JAPANESE_CANDLE_STICK:
				unsetJapaneseCandleStick();
				return;
			case ChartPackage.DOCUMENT_ROOT__LABEL_ARRANGEMENT:
				unsetLabelArrangement();
				return;
			case ChartPackage.DOCUMENT_ROOT__LABEL_CELL_ADDRESS:
				setLabelCellAddress(LABEL_CELL_ADDRESS_EDEFAULT);
				return;
			case ChartPackage.DOCUMENT_ROOT__LEGEND_ALIGN:
				unsetLegendAlign();
				return;
			case ChartPackage.DOCUMENT_ROOT__LEGEND_POSITION:
				unsetLegendPosition();
				return;
			case ChartPackage.DOCUMENT_ROOT__LINES:
				unsetLines();
				return;
			case ChartPackage.DOCUMENT_ROOT__LINK_DATA_STYLE_TO_SOURCE:
				unsetLinkDataStyleToSource();
				return;
			case ChartPackage.DOCUMENT_ROOT__LOGARITHMIC:
				unsetLogarithmic();
				return;
			case ChartPackage.DOCUMENT_ROOT__MAXIMUM:
				unsetMaximum();
				return;
			case ChartPackage.DOCUMENT_ROOT__MEAN_VALUE1:
				unsetMeanValue1();
				return;
			case ChartPackage.DOCUMENT_ROOT__MINIMUM:
				unsetMinimum();
				return;
			case ChartPackage.DOCUMENT_ROOT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ChartPackage.DOCUMENT_ROOT__ORIGIN:
				unsetOrigin();
				return;
			case ChartPackage.DOCUMENT_ROOT__OVERLAP:
				setOverlap(OVERLAP_EDEFAULT);
				return;
			case ChartPackage.DOCUMENT_ROOT__PERCENTAGE:
				unsetPercentage();
				return;
			case ChartPackage.DOCUMENT_ROOT__PIE_OFFSET:
				setPieOffset(PIE_OFFSET_EDEFAULT);
				return;
			case ChartPackage.DOCUMENT_ROOT__REGRESSION_TYPE:
				unsetRegressionType();
				return;
			case ChartPackage.DOCUMENT_ROOT__REPEATED:
				setRepeated(REPEATED_EDEFAULT);
				return;
			case ChartPackage.DOCUMENT_ROOT__ROW_MAPPING:
				setRowMapping(ROW_MAPPING_EDEFAULT);
				return;
			case ChartPackage.DOCUMENT_ROOT__SCALE_TEXT:
				unsetScaleText();
				return;
			case ChartPackage.DOCUMENT_ROOT__SERIES_SOURCE:
				unsetSeriesSource();
				return;
			case ChartPackage.DOCUMENT_ROOT__SOLID_TYPE:
				unsetSolidType();
				return;
			case ChartPackage.DOCUMENT_ROOT__SPLINE_ORDER:
				setSplineOrder(SPLINE_ORDER_EDEFAULT);
				return;
			case ChartPackage.DOCUMENT_ROOT__SPLINE_RESOLUTION:
				setSplineResolution(SPLINE_RESOLUTION_EDEFAULT);
				return;
			case ChartPackage.DOCUMENT_ROOT__STACKED:
				unsetStacked();
				return;
			case ChartPackage.DOCUMENT_ROOT__STYLE_NAME:
				setStyleName(STYLE_NAME_EDEFAULT);
				return;
			case ChartPackage.DOCUMENT_ROOT__SYMBOL_HEIGHT:
				setSymbolHeight(SYMBOL_HEIGHT_EDEFAULT);
				return;
			case ChartPackage.DOCUMENT_ROOT__SYMBOL_NAME:
				unsetSymbolName();
				return;
			case ChartPackage.DOCUMENT_ROOT__SYMBOL_TYPE:
				unsetSymbolType();
				return;
			case ChartPackage.DOCUMENT_ROOT__SYMBOL_WIDTH:
				setSymbolWidth(SYMBOL_WIDTH_EDEFAULT);
				return;
			case ChartPackage.DOCUMENT_ROOT__TEXT_OVERLAP:
				unsetTextOverlap();
				return;
			case ChartPackage.DOCUMENT_ROOT__THREE_DIMENSIONAL:
				unsetThreeDimensional();
				return;
			case ChartPackage.DOCUMENT_ROOT__TICK_MARKS_MAJOR_INNER:
				unsetTickMarksMajorInner();
				return;
			case ChartPackage.DOCUMENT_ROOT__TICK_MARKS_MAJOR_OUTER:
				unsetTickMarksMajorOuter();
				return;
			case ChartPackage.DOCUMENT_ROOT__TICK_MARKS_MINOR_INNER:
				unsetTickMarksMinorInner();
				return;
			case ChartPackage.DOCUMENT_ROOT__TICK_MARKS_MINOR_OUTER:
				unsetTickMarksMinorOuter();
				return;
			case ChartPackage.DOCUMENT_ROOT__VALUES_CELL_RANGE_ADDRESS:
				setValuesCellRangeAddress(VALUES_CELL_RANGE_ADDRESS_EDEFAULT);
				return;
			case ChartPackage.DOCUMENT_ROOT__VERTICAL:
				unsetVertical();
				return;
			case ChartPackage.DOCUMENT_ROOT__VISIBLE:
				unsetVisible();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ChartPackage.DOCUMENT_ROOT__MIXED:
				return mixed != null && !mixed.isEmpty();
			case ChartPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
			case ChartPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
			case ChartPackage.DOCUMENT_ROOT__AXIS:
				return getAxis() != null;
			case ChartPackage.DOCUMENT_ROOT__CATEGORIES:
				return getCategories() != null;
			case ChartPackage.DOCUMENT_ROOT__CHART:
				return getChart() != null;
			case ChartPackage.DOCUMENT_ROOT__DATA_POINT:
				return getDataPoint() != null;
			case ChartPackage.DOCUMENT_ROOT__DOMAIN:
				return getDomain() != null;
			case ChartPackage.DOCUMENT_ROOT__ERROR_INDICATOR:
				return getErrorIndicator() != null;
			case ChartPackage.DOCUMENT_ROOT__FLOOR:
				return getFloor() != null;
			case ChartPackage.DOCUMENT_ROOT__FOOTER:
				return getFooter() != null;
			case ChartPackage.DOCUMENT_ROOT__GRID:
				return getGrid() != null;
			case ChartPackage.DOCUMENT_ROOT__LEGEND:
				return getLegend() != null;
			case ChartPackage.DOCUMENT_ROOT__MEAN_VALUE:
				return getMeanValue() != null;
			case ChartPackage.DOCUMENT_ROOT__PLOT_AREA:
				return getPlotArea() != null;
			case ChartPackage.DOCUMENT_ROOT__REGRESSION_CURVE:
				return getRegressionCurve() != null;
			case ChartPackage.DOCUMENT_ROOT__SERIES:
				return getSeries() != null;
			case ChartPackage.DOCUMENT_ROOT__STOCK_GAIN_MARKER:
				return getStockGainMarker() != null;
			case ChartPackage.DOCUMENT_ROOT__STOCK_LOSS_MARKER:
				return getStockLossMarker() != null;
			case ChartPackage.DOCUMENT_ROOT__STOCK_RANGE_LINE:
				return getStockRangeLine() != null;
			case ChartPackage.DOCUMENT_ROOT__SUBTITLE:
				return getSubtitle() != null;
			case ChartPackage.DOCUMENT_ROOT__SYMBOL_IMAGE:
				return getSymbolImage() != null;
			case ChartPackage.DOCUMENT_ROOT__TITLE:
				return getTitle() != null;
			case ChartPackage.DOCUMENT_ROOT__WALL:
				return getWall() != null;
			case ChartPackage.DOCUMENT_ROOT__ATTACHED_AXIS:
				return ATTACHED_AXIS_EDEFAULT == null ? attachedAxis != null : !ATTACHED_AXIS_EDEFAULT.equals(attachedAxis);
			case ChartPackage.DOCUMENT_ROOT__COLUMN_MAPPING:
				return COLUMN_MAPPING_EDEFAULT == null ? columnMapping != null : !COLUMN_MAPPING_EDEFAULT.equals(columnMapping);
			case ChartPackage.DOCUMENT_ROOT__CONNECT_BARS:
				return isSetConnectBars();
			case ChartPackage.DOCUMENT_ROOT__DATA_LABEL_NUMBER:
				return isSetDataLabelNumber();
			case ChartPackage.DOCUMENT_ROOT__DATA_LABEL_SYMBOL:
				return isSetDataLabelSymbol();
			case ChartPackage.DOCUMENT_ROOT__DATA_LABEL_TEXT:
				return isSetDataLabelText();
			case ChartPackage.DOCUMENT_ROOT__DATA_SOURCE_HAS_LABELS:
				return isSetDataSourceHasLabels();
			case ChartPackage.DOCUMENT_ROOT__DEEP:
				return isSetDeep();
			case ChartPackage.DOCUMENT_ROOT__DIMENSION:
				return isSetDimension();
			case ChartPackage.DOCUMENT_ROOT__DISPLAY_LABEL:
				return isSetDisplayLabel();
			case ChartPackage.DOCUMENT_ROOT__ERROR_CATEGORY:
				return isSetErrorCategory();
			case ChartPackage.DOCUMENT_ROOT__ERROR_LOWER_INDICATOR:
				return isSetErrorLowerIndicator();
			case ChartPackage.DOCUMENT_ROOT__ERROR_LOWER_LIMIT:
				return isSetErrorLowerLimit();
			case ChartPackage.DOCUMENT_ROOT__ERROR_MARGIN:
				return isSetErrorMargin();
			case ChartPackage.DOCUMENT_ROOT__ERROR_PERCENTAGE:
				return isSetErrorPercentage();
			case ChartPackage.DOCUMENT_ROOT__ERROR_UPPER_INDICATOR:
				return isSetErrorUpperIndicator();
			case ChartPackage.DOCUMENT_ROOT__ERROR_UPPER_LIMIT:
				return isSetErrorUpperLimit();
			case ChartPackage.DOCUMENT_ROOT__GAP_WIDTH:
				return GAP_WIDTH_EDEFAULT == null ? gapWidth != null : !GAP_WIDTH_EDEFAULT.equals(gapWidth);
			case ChartPackage.DOCUMENT_ROOT__INTERPOLATION:
				return isSetInterpolation();
			case ChartPackage.DOCUMENT_ROOT__INTERVAL_MAJOR:
				return isSetIntervalMajor();
			case ChartPackage.DOCUMENT_ROOT__INTERVAL_MINOR_DIVISOR:
				return INTERVAL_MINOR_DIVISOR_EDEFAULT == null ? intervalMinorDivisor != null : !INTERVAL_MINOR_DIVISOR_EDEFAULT.equals(intervalMinorDivisor);
			case ChartPackage.DOCUMENT_ROOT__JAPANESE_CANDLE_STICK:
				return isSetJapaneseCandleStick();
			case ChartPackage.DOCUMENT_ROOT__LABEL_ARRANGEMENT:
				return isSetLabelArrangement();
			case ChartPackage.DOCUMENT_ROOT__LABEL_CELL_ADDRESS:
				return LABEL_CELL_ADDRESS_EDEFAULT == null ? labelCellAddress != null : !LABEL_CELL_ADDRESS_EDEFAULT.equals(labelCellAddress);
			case ChartPackage.DOCUMENT_ROOT__LEGEND_ALIGN:
				return isSetLegendAlign();
			case ChartPackage.DOCUMENT_ROOT__LEGEND_POSITION:
				return isSetLegendPosition();
			case ChartPackage.DOCUMENT_ROOT__LINES:
				return isSetLines();
			case ChartPackage.DOCUMENT_ROOT__LINK_DATA_STYLE_TO_SOURCE:
				return isSetLinkDataStyleToSource();
			case ChartPackage.DOCUMENT_ROOT__LOGARITHMIC:
				return isSetLogarithmic();
			case ChartPackage.DOCUMENT_ROOT__MAXIMUM:
				return isSetMaximum();
			case ChartPackage.DOCUMENT_ROOT__MEAN_VALUE1:
				return isSetMeanValue1();
			case ChartPackage.DOCUMENT_ROOT__MINIMUM:
				return isSetMinimum();
			case ChartPackage.DOCUMENT_ROOT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ChartPackage.DOCUMENT_ROOT__ORIGIN:
				return isSetOrigin();
			case ChartPackage.DOCUMENT_ROOT__OVERLAP:
				return OVERLAP_EDEFAULT == null ? overlap != null : !OVERLAP_EDEFAULT.equals(overlap);
			case ChartPackage.DOCUMENT_ROOT__PERCENTAGE:
				return isSetPercentage();
			case ChartPackage.DOCUMENT_ROOT__PIE_OFFSET:
				return PIE_OFFSET_EDEFAULT == null ? pieOffset != null : !PIE_OFFSET_EDEFAULT.equals(pieOffset);
			case ChartPackage.DOCUMENT_ROOT__REGRESSION_TYPE:
				return isSetRegressionType();
			case ChartPackage.DOCUMENT_ROOT__REPEATED:
				return REPEATED_EDEFAULT == null ? repeated != null : !REPEATED_EDEFAULT.equals(repeated);
			case ChartPackage.DOCUMENT_ROOT__ROW_MAPPING:
				return ROW_MAPPING_EDEFAULT == null ? rowMapping != null : !ROW_MAPPING_EDEFAULT.equals(rowMapping);
			case ChartPackage.DOCUMENT_ROOT__SCALE_TEXT:
				return isSetScaleText();
			case ChartPackage.DOCUMENT_ROOT__SERIES_SOURCE:
				return isSetSeriesSource();
			case ChartPackage.DOCUMENT_ROOT__SOLID_TYPE:
				return isSetSolidType();
			case ChartPackage.DOCUMENT_ROOT__SPLINE_ORDER:
				return SPLINE_ORDER_EDEFAULT == null ? splineOrder != null : !SPLINE_ORDER_EDEFAULT.equals(splineOrder);
			case ChartPackage.DOCUMENT_ROOT__SPLINE_RESOLUTION:
				return SPLINE_RESOLUTION_EDEFAULT == null ? splineResolution != null : !SPLINE_RESOLUTION_EDEFAULT.equals(splineResolution);
			case ChartPackage.DOCUMENT_ROOT__STACKED:
				return isSetStacked();
			case ChartPackage.DOCUMENT_ROOT__STYLE_NAME:
				return STYLE_NAME_EDEFAULT == null ? styleName != null : !STYLE_NAME_EDEFAULT.equals(styleName);
			case ChartPackage.DOCUMENT_ROOT__SYMBOL_HEIGHT:
				return SYMBOL_HEIGHT_EDEFAULT == null ? symbolHeight != null : !SYMBOL_HEIGHT_EDEFAULT.equals(symbolHeight);
			case ChartPackage.DOCUMENT_ROOT__SYMBOL_NAME:
				return isSetSymbolName();
			case ChartPackage.DOCUMENT_ROOT__SYMBOL_TYPE:
				return isSetSymbolType();
			case ChartPackage.DOCUMENT_ROOT__SYMBOL_WIDTH:
				return SYMBOL_WIDTH_EDEFAULT == null ? symbolWidth != null : !SYMBOL_WIDTH_EDEFAULT.equals(symbolWidth);
			case ChartPackage.DOCUMENT_ROOT__TEXT_OVERLAP:
				return isSetTextOverlap();
			case ChartPackage.DOCUMENT_ROOT__THREE_DIMENSIONAL:
				return isSetThreeDimensional();
			case ChartPackage.DOCUMENT_ROOT__TICK_MARKS_MAJOR_INNER:
				return isSetTickMarksMajorInner();
			case ChartPackage.DOCUMENT_ROOT__TICK_MARKS_MAJOR_OUTER:
				return isSetTickMarksMajorOuter();
			case ChartPackage.DOCUMENT_ROOT__TICK_MARKS_MINOR_INNER:
				return isSetTickMarksMinorInner();
			case ChartPackage.DOCUMENT_ROOT__TICK_MARKS_MINOR_OUTER:
				return isSetTickMarksMinorOuter();
			case ChartPackage.DOCUMENT_ROOT__VALUES_CELL_RANGE_ADDRESS:
				return VALUES_CELL_RANGE_ADDRESS_EDEFAULT == null ? valuesCellRangeAddress != null : !VALUES_CELL_RANGE_ADDRESS_EDEFAULT.equals(valuesCellRangeAddress);
			case ChartPackage.DOCUMENT_ROOT__VERTICAL:
				return isSetVertical();
			case ChartPackage.DOCUMENT_ROOT__VISIBLE:
				return isSetVisible();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (mixed: ");
		result.append(mixed);
		result.append(", attachedAxis: ");
		result.append(attachedAxis);
		result.append(", columnMapping: ");
		result.append(columnMapping);
		result.append(", connectBars: ");
		if (connectBarsESet) result.append(connectBars); else result.append("<unset>");
		result.append(", dataLabelNumber: ");
		if (dataLabelNumberESet) result.append(dataLabelNumber); else result.append("<unset>");
		result.append(", dataLabelSymbol: ");
		if (dataLabelSymbolESet) result.append(dataLabelSymbol); else result.append("<unset>");
		result.append(", dataLabelText: ");
		if (dataLabelTextESet) result.append(dataLabelText); else result.append("<unset>");
		result.append(", dataSourceHasLabels: ");
		if (dataSourceHasLabelsESet) result.append(dataSourceHasLabels); else result.append("<unset>");
		result.append(", deep: ");
		if (deepESet) result.append(deep); else result.append("<unset>");
		result.append(", dimension: ");
		if (dimensionESet) result.append(dimension); else result.append("<unset>");
		result.append(", displayLabel: ");
		if (displayLabelESet) result.append(displayLabel); else result.append("<unset>");
		result.append(", errorCategory: ");
		if (errorCategoryESet) result.append(errorCategory); else result.append("<unset>");
		result.append(", errorLowerIndicator: ");
		if (errorLowerIndicatorESet) result.append(errorLowerIndicator); else result.append("<unset>");
		result.append(", errorLowerLimit: ");
		if (errorLowerLimitESet) result.append(errorLowerLimit); else result.append("<unset>");
		result.append(", errorMargin: ");
		if (errorMarginESet) result.append(errorMargin); else result.append("<unset>");
		result.append(", errorPercentage: ");
		if (errorPercentageESet) result.append(errorPercentage); else result.append("<unset>");
		result.append(", errorUpperIndicator: ");
		if (errorUpperIndicatorESet) result.append(errorUpperIndicator); else result.append("<unset>");
		result.append(", errorUpperLimit: ");
		if (errorUpperLimitESet) result.append(errorUpperLimit); else result.append("<unset>");
		result.append(", gapWidth: ");
		result.append(gapWidth);
		result.append(", interpolation: ");
		if (interpolationESet) result.append(interpolation); else result.append("<unset>");
		result.append(", intervalMajor: ");
		if (intervalMajorESet) result.append(intervalMajor); else result.append("<unset>");
		result.append(", intervalMinorDivisor: ");
		result.append(intervalMinorDivisor);
		result.append(", japaneseCandleStick: ");
		if (japaneseCandleStickESet) result.append(japaneseCandleStick); else result.append("<unset>");
		result.append(", labelArrangement: ");
		if (labelArrangementESet) result.append(labelArrangement); else result.append("<unset>");
		result.append(", labelCellAddress: ");
		result.append(labelCellAddress);
		result.append(", legendAlign: ");
		if (legendAlignESet) result.append(legendAlign); else result.append("<unset>");
		result.append(", legendPosition: ");
		if (legendPositionESet) result.append(legendPosition); else result.append("<unset>");
		result.append(", lines: ");
		if (linesESet) result.append(lines); else result.append("<unset>");
		result.append(", linkDataStyleToSource: ");
		if (linkDataStyleToSourceESet) result.append(linkDataStyleToSource); else result.append("<unset>");
		result.append(", logarithmic: ");
		if (logarithmicESet) result.append(logarithmic); else result.append("<unset>");
		result.append(", maximum: ");
		if (maximumESet) result.append(maximum); else result.append("<unset>");
		result.append(", meanValue1: ");
		if (meanValue1ESet) result.append(meanValue1); else result.append("<unset>");
		result.append(", minimum: ");
		if (minimumESet) result.append(minimum); else result.append("<unset>");
		result.append(", name: ");
		result.append(name);
		result.append(", origin: ");
		if (originESet) result.append(origin); else result.append("<unset>");
		result.append(", overlap: ");
		result.append(overlap);
		result.append(", percentage: ");
		if (percentageESet) result.append(percentage); else result.append("<unset>");
		result.append(", pieOffset: ");
		result.append(pieOffset);
		result.append(", regressionType: ");
		if (regressionTypeESet) result.append(regressionType); else result.append("<unset>");
		result.append(", repeated: ");
		result.append(repeated);
		result.append(", rowMapping: ");
		result.append(rowMapping);
		result.append(", scaleText: ");
		if (scaleTextESet) result.append(scaleText); else result.append("<unset>");
		result.append(", seriesSource: ");
		if (seriesSourceESet) result.append(seriesSource); else result.append("<unset>");
		result.append(", solidType: ");
		if (solidTypeESet) result.append(solidType); else result.append("<unset>");
		result.append(", splineOrder: ");
		result.append(splineOrder);
		result.append(", splineResolution: ");
		result.append(splineResolution);
		result.append(", stacked: ");
		if (stackedESet) result.append(stacked); else result.append("<unset>");
		result.append(", styleName: ");
		result.append(styleName);
		result.append(", symbolHeight: ");
		result.append(symbolHeight);
		result.append(", symbolName: ");
		if (symbolNameESet) result.append(symbolName); else result.append("<unset>");
		result.append(", symbolType: ");
		if (symbolTypeESet) result.append(symbolType); else result.append("<unset>");
		result.append(", symbolWidth: ");
		result.append(symbolWidth);
		result.append(", textOverlap: ");
		if (textOverlapESet) result.append(textOverlap); else result.append("<unset>");
		result.append(", threeDimensional: ");
		if (threeDimensionalESet) result.append(threeDimensional); else result.append("<unset>");
		result.append(", tickMarksMajorInner: ");
		if (tickMarksMajorInnerESet) result.append(tickMarksMajorInner); else result.append("<unset>");
		result.append(", tickMarksMajorOuter: ");
		if (tickMarksMajorOuterESet) result.append(tickMarksMajorOuter); else result.append("<unset>");
		result.append(", tickMarksMinorInner: ");
		if (tickMarksMinorInnerESet) result.append(tickMarksMinorInner); else result.append("<unset>");
		result.append(", tickMarksMinorOuter: ");
		if (tickMarksMinorOuterESet) result.append(tickMarksMinorOuter); else result.append("<unset>");
		result.append(", valuesCellRangeAddress: ");
		result.append(valuesCellRangeAddress);
		result.append(", vertical: ");
		if (verticalESet) result.append(vertical); else result.append("<unset>");
		result.append(", visible: ");
		if (visibleESet) result.append(visible); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //DocumentRootImpl
