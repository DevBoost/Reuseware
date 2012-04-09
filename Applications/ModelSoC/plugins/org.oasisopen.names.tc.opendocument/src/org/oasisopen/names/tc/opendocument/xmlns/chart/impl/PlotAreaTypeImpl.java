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
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.oasisopen.names.tc.opendocument.xmlns.chart.AxisType;
import org.oasisopen.names.tc.opendocument.xmlns.chart.ChartPackage;
import org.oasisopen.names.tc.opendocument.xmlns.chart.DataSourceHasLabelsType;
import org.oasisopen.names.tc.opendocument.xmlns.chart.FloorType;
import org.oasisopen.names.tc.opendocument.xmlns.chart.PlotAreaType;
import org.oasisopen.names.tc.opendocument.xmlns.chart.SeriesType;
import org.oasisopen.names.tc.opendocument.xmlns.chart.StockGainMarkerType;
import org.oasisopen.names.tc.opendocument.xmlns.chart.StockLossMarkerType;
import org.oasisopen.names.tc.opendocument.xmlns.chart.StockRangeLineType;
import org.oasisopen.names.tc.opendocument.xmlns.chart.WallType;
import org.oasisopen.names.tc.opendocument.xmlns.dr3d.LightType;
import org.oasisopen.names.tc.opendocument.xmlns.dr3d.ProjectionType;
import org.oasisopen.names.tc.opendocument.xmlns.dr3d.ShadeModeType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Plot Area Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.impl.PlotAreaTypeImpl#getLight <em>Light</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.impl.PlotAreaTypeImpl#getAxis <em>Axis</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.impl.PlotAreaTypeImpl#getSeries <em>Series</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.impl.PlotAreaTypeImpl#getStockGainMarker <em>Stock Gain Marker</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.impl.PlotAreaTypeImpl#getStockLossMarker <em>Stock Loss Marker</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.impl.PlotAreaTypeImpl#getStockRangeLine <em>Stock Range Line</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.impl.PlotAreaTypeImpl#getWall <em>Wall</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.impl.PlotAreaTypeImpl#getFloor <em>Floor</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.impl.PlotAreaTypeImpl#getAmbientColor <em>Ambient Color</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.impl.PlotAreaTypeImpl#getCellRangeAddress <em>Cell Range Address</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.impl.PlotAreaTypeImpl#getDataSourceHasLabels <em>Data Source Has Labels</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.impl.PlotAreaTypeImpl#getDistance <em>Distance</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.impl.PlotAreaTypeImpl#getFocalLength <em>Focal Length</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.impl.PlotAreaTypeImpl#getHeight <em>Height</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.impl.PlotAreaTypeImpl#getLightingMode <em>Lighting Mode</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.impl.PlotAreaTypeImpl#getProjection <em>Projection</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.impl.PlotAreaTypeImpl#getShadeMode <em>Shade Mode</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.impl.PlotAreaTypeImpl#getShadowSlant <em>Shadow Slant</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.impl.PlotAreaTypeImpl#getStyleName <em>Style Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.impl.PlotAreaTypeImpl#getTransform <em>Transform</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.impl.PlotAreaTypeImpl#getVpn <em>Vpn</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.impl.PlotAreaTypeImpl#getVrp <em>Vrp</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.impl.PlotAreaTypeImpl#getVup <em>Vup</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.impl.PlotAreaTypeImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.impl.PlotAreaTypeImpl#getX <em>X</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.impl.PlotAreaTypeImpl#getY <em>Y</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PlotAreaTypeImpl extends EObjectImpl implements PlotAreaType {
	/**
	 * The cached value of the '{@link #getLight() <em>Light</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLight()
	 * @generated
	 * @ordered
	 */
	protected EList<LightType> light;

	/**
	 * The cached value of the '{@link #getAxis() <em>Axis</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAxis()
	 * @generated
	 * @ordered
	 */
	protected EList<AxisType> axis;

	/**
	 * The cached value of the '{@link #getSeries() <em>Series</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeries()
	 * @generated
	 * @ordered
	 */
	protected EList<SeriesType> series;

	/**
	 * The cached value of the '{@link #getStockGainMarker() <em>Stock Gain Marker</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStockGainMarker()
	 * @generated
	 * @ordered
	 */
	protected StockGainMarkerType stockGainMarker;

	/**
	 * The cached value of the '{@link #getStockLossMarker() <em>Stock Loss Marker</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStockLossMarker()
	 * @generated
	 * @ordered
	 */
	protected StockLossMarkerType stockLossMarker;

	/**
	 * The cached value of the '{@link #getStockRangeLine() <em>Stock Range Line</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStockRangeLine()
	 * @generated
	 * @ordered
	 */
	protected StockRangeLineType stockRangeLine;

	/**
	 * The cached value of the '{@link #getWall() <em>Wall</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWall()
	 * @generated
	 * @ordered
	 */
	protected WallType wall;

	/**
	 * The cached value of the '{@link #getFloor() <em>Floor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFloor()
	 * @generated
	 * @ordered
	 */
	protected FloorType floor;

	/**
	 * The default value of the '{@link #getAmbientColor() <em>Ambient Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmbientColor()
	 * @generated
	 * @ordered
	 */
	protected static final String AMBIENT_COLOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAmbientColor() <em>Ambient Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmbientColor()
	 * @generated
	 * @ordered
	 */
	protected String ambientColor = AMBIENT_COLOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getCellRangeAddress() <em>Cell Range Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCellRangeAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String CELL_RANGE_ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCellRangeAddress() <em>Cell Range Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCellRangeAddress()
	 * @generated
	 * @ordered
	 */
	protected String cellRangeAddress = CELL_RANGE_ADDRESS_EDEFAULT;

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
	 * The default value of the '{@link #getDistance() <em>Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistance()
	 * @generated
	 * @ordered
	 */
	protected static final String DISTANCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDistance() <em>Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistance()
	 * @generated
	 * @ordered
	 */
	protected String distance = DISTANCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFocalLength() <em>Focal Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFocalLength()
	 * @generated
	 * @ordered
	 */
	protected static final String FOCAL_LENGTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFocalLength() <em>Focal Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFocalLength()
	 * @generated
	 * @ordered
	 */
	protected String focalLength = FOCAL_LENGTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected static final String HEIGHT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected String height = HEIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getLightingMode() <em>Lighting Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLightingMode()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean LIGHTING_MODE_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getLightingMode() <em>Lighting Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLightingMode()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean lightingMode = LIGHTING_MODE_EDEFAULT;

	/**
	 * This is true if the Lighting Mode attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean lightingModeESet;

	/**
	 * The default value of the '{@link #getProjection() <em>Projection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjection()
	 * @generated
	 * @ordered
	 */
	protected static final ProjectionType PROJECTION_EDEFAULT = ProjectionType.PARALLEL;

	/**
	 * The cached value of the '{@link #getProjection() <em>Projection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjection()
	 * @generated
	 * @ordered
	 */
	protected ProjectionType projection = PROJECTION_EDEFAULT;

	/**
	 * This is true if the Projection attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean projectionESet;

	/**
	 * The default value of the '{@link #getShadeMode() <em>Shade Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShadeMode()
	 * @generated
	 * @ordered
	 */
	protected static final ShadeModeType SHADE_MODE_EDEFAULT = ShadeModeType.FLAT;

	/**
	 * The cached value of the '{@link #getShadeMode() <em>Shade Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShadeMode()
	 * @generated
	 * @ordered
	 */
	protected ShadeModeType shadeMode = SHADE_MODE_EDEFAULT;

	/**
	 * This is true if the Shade Mode attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean shadeModeESet;

	/**
	 * The default value of the '{@link #getShadowSlant() <em>Shadow Slant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShadowSlant()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger SHADOW_SLANT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getShadowSlant() <em>Shadow Slant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShadowSlant()
	 * @generated
	 * @ordered
	 */
	protected BigInteger shadowSlant = SHADOW_SLANT_EDEFAULT;

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
	 * The default value of the '{@link #getTransform() <em>Transform</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransform()
	 * @generated
	 * @ordered
	 */
	protected static final Object TRANSFORM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTransform() <em>Transform</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransform()
	 * @generated
	 * @ordered
	 */
	protected Object transform = TRANSFORM_EDEFAULT;

	/**
	 * The default value of the '{@link #getVpn() <em>Vpn</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVpn()
	 * @generated
	 * @ordered
	 */
	protected static final String VPN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVpn() <em>Vpn</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVpn()
	 * @generated
	 * @ordered
	 */
	protected String vpn = VPN_EDEFAULT;

	/**
	 * The default value of the '{@link #getVrp() <em>Vrp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVrp()
	 * @generated
	 * @ordered
	 */
	protected static final String VRP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVrp() <em>Vrp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVrp()
	 * @generated
	 * @ordered
	 */
	protected String vrp = VRP_EDEFAULT;

	/**
	 * The default value of the '{@link #getVup() <em>Vup</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVup()
	 * @generated
	 * @ordered
	 */
	protected static final String VUP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVup() <em>Vup</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVup()
	 * @generated
	 * @ordered
	 */
	protected String vup = VUP_EDEFAULT;

	/**
	 * The default value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected static final String WIDTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected String width = WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getX() <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX()
	 * @generated
	 * @ordered
	 */
	protected static final String X_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getX() <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX()
	 * @generated
	 * @ordered
	 */
	protected String x = X_EDEFAULT;

	/**
	 * The default value of the '{@link #getY() <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY()
	 * @generated
	 * @ordered
	 */
	protected static final String Y_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getY() <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY()
	 * @generated
	 * @ordered
	 */
	protected String y = Y_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlotAreaTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ChartPackage.Literals.PLOT_AREA_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LightType> getLight() {
		if (light == null) {
			light = new EObjectContainmentEList<LightType>(LightType.class, this, ChartPackage.PLOT_AREA_TYPE__LIGHT);
		}
		return light;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AxisType> getAxis() {
		if (axis == null) {
			axis = new EObjectContainmentEList<AxisType>(AxisType.class, this, ChartPackage.PLOT_AREA_TYPE__AXIS);
		}
		return axis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SeriesType> getSeries() {
		if (series == null) {
			series = new EObjectContainmentEList<SeriesType>(SeriesType.class, this, ChartPackage.PLOT_AREA_TYPE__SERIES);
		}
		return series;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StockGainMarkerType getStockGainMarker() {
		return stockGainMarker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStockGainMarker(StockGainMarkerType newStockGainMarker, NotificationChain msgs) {
		StockGainMarkerType oldStockGainMarker = stockGainMarker;
		stockGainMarker = newStockGainMarker;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ChartPackage.PLOT_AREA_TYPE__STOCK_GAIN_MARKER, oldStockGainMarker, newStockGainMarker);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStockGainMarker(StockGainMarkerType newStockGainMarker) {
		if (newStockGainMarker != stockGainMarker) {
			NotificationChain msgs = null;
			if (stockGainMarker != null)
				msgs = ((InternalEObject)stockGainMarker).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ChartPackage.PLOT_AREA_TYPE__STOCK_GAIN_MARKER, null, msgs);
			if (newStockGainMarker != null)
				msgs = ((InternalEObject)newStockGainMarker).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ChartPackage.PLOT_AREA_TYPE__STOCK_GAIN_MARKER, null, msgs);
			msgs = basicSetStockGainMarker(newStockGainMarker, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChartPackage.PLOT_AREA_TYPE__STOCK_GAIN_MARKER, newStockGainMarker, newStockGainMarker));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StockLossMarkerType getStockLossMarker() {
		return stockLossMarker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStockLossMarker(StockLossMarkerType newStockLossMarker, NotificationChain msgs) {
		StockLossMarkerType oldStockLossMarker = stockLossMarker;
		stockLossMarker = newStockLossMarker;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ChartPackage.PLOT_AREA_TYPE__STOCK_LOSS_MARKER, oldStockLossMarker, newStockLossMarker);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStockLossMarker(StockLossMarkerType newStockLossMarker) {
		if (newStockLossMarker != stockLossMarker) {
			NotificationChain msgs = null;
			if (stockLossMarker != null)
				msgs = ((InternalEObject)stockLossMarker).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ChartPackage.PLOT_AREA_TYPE__STOCK_LOSS_MARKER, null, msgs);
			if (newStockLossMarker != null)
				msgs = ((InternalEObject)newStockLossMarker).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ChartPackage.PLOT_AREA_TYPE__STOCK_LOSS_MARKER, null, msgs);
			msgs = basicSetStockLossMarker(newStockLossMarker, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChartPackage.PLOT_AREA_TYPE__STOCK_LOSS_MARKER, newStockLossMarker, newStockLossMarker));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StockRangeLineType getStockRangeLine() {
		return stockRangeLine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStockRangeLine(StockRangeLineType newStockRangeLine, NotificationChain msgs) {
		StockRangeLineType oldStockRangeLine = stockRangeLine;
		stockRangeLine = newStockRangeLine;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ChartPackage.PLOT_AREA_TYPE__STOCK_RANGE_LINE, oldStockRangeLine, newStockRangeLine);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStockRangeLine(StockRangeLineType newStockRangeLine) {
		if (newStockRangeLine != stockRangeLine) {
			NotificationChain msgs = null;
			if (stockRangeLine != null)
				msgs = ((InternalEObject)stockRangeLine).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ChartPackage.PLOT_AREA_TYPE__STOCK_RANGE_LINE, null, msgs);
			if (newStockRangeLine != null)
				msgs = ((InternalEObject)newStockRangeLine).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ChartPackage.PLOT_AREA_TYPE__STOCK_RANGE_LINE, null, msgs);
			msgs = basicSetStockRangeLine(newStockRangeLine, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChartPackage.PLOT_AREA_TYPE__STOCK_RANGE_LINE, newStockRangeLine, newStockRangeLine));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WallType getWall() {
		return wall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWall(WallType newWall, NotificationChain msgs) {
		WallType oldWall = wall;
		wall = newWall;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ChartPackage.PLOT_AREA_TYPE__WALL, oldWall, newWall);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWall(WallType newWall) {
		if (newWall != wall) {
			NotificationChain msgs = null;
			if (wall != null)
				msgs = ((InternalEObject)wall).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ChartPackage.PLOT_AREA_TYPE__WALL, null, msgs);
			if (newWall != null)
				msgs = ((InternalEObject)newWall).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ChartPackage.PLOT_AREA_TYPE__WALL, null, msgs);
			msgs = basicSetWall(newWall, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChartPackage.PLOT_AREA_TYPE__WALL, newWall, newWall));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FloorType getFloor() {
		return floor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFloor(FloorType newFloor, NotificationChain msgs) {
		FloorType oldFloor = floor;
		floor = newFloor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ChartPackage.PLOT_AREA_TYPE__FLOOR, oldFloor, newFloor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFloor(FloorType newFloor) {
		if (newFloor != floor) {
			NotificationChain msgs = null;
			if (floor != null)
				msgs = ((InternalEObject)floor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ChartPackage.PLOT_AREA_TYPE__FLOOR, null, msgs);
			if (newFloor != null)
				msgs = ((InternalEObject)newFloor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ChartPackage.PLOT_AREA_TYPE__FLOOR, null, msgs);
			msgs = basicSetFloor(newFloor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChartPackage.PLOT_AREA_TYPE__FLOOR, newFloor, newFloor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAmbientColor() {
		return ambientColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAmbientColor(String newAmbientColor) {
		String oldAmbientColor = ambientColor;
		ambientColor = newAmbientColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChartPackage.PLOT_AREA_TYPE__AMBIENT_COLOR, oldAmbientColor, ambientColor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCellRangeAddress() {
		return cellRangeAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCellRangeAddress(String newCellRangeAddress) {
		String oldCellRangeAddress = cellRangeAddress;
		cellRangeAddress = newCellRangeAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChartPackage.PLOT_AREA_TYPE__CELL_RANGE_ADDRESS, oldCellRangeAddress, cellRangeAddress));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ChartPackage.PLOT_AREA_TYPE__DATA_SOURCE_HAS_LABELS, oldDataSourceHasLabels, dataSourceHasLabels, !oldDataSourceHasLabelsESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, ChartPackage.PLOT_AREA_TYPE__DATA_SOURCE_HAS_LABELS, oldDataSourceHasLabels, DATA_SOURCE_HAS_LABELS_EDEFAULT, oldDataSourceHasLabelsESet));
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
	public String getDistance() {
		return distance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDistance(String newDistance) {
		String oldDistance = distance;
		distance = newDistance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChartPackage.PLOT_AREA_TYPE__DISTANCE, oldDistance, distance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFocalLength() {
		return focalLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFocalLength(String newFocalLength) {
		String oldFocalLength = focalLength;
		focalLength = newFocalLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChartPackage.PLOT_AREA_TYPE__FOCAL_LENGTH, oldFocalLength, focalLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHeight() {
		return height;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeight(String newHeight) {
		String oldHeight = height;
		height = newHeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChartPackage.PLOT_AREA_TYPE__HEIGHT, oldHeight, height));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getLightingMode() {
		return lightingMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLightingMode(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newLightingMode) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldLightingMode = lightingMode;
		lightingMode = newLightingMode == null ? LIGHTING_MODE_EDEFAULT : newLightingMode;
		boolean oldLightingModeESet = lightingModeESet;
		lightingModeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChartPackage.PLOT_AREA_TYPE__LIGHTING_MODE, oldLightingMode, lightingMode, !oldLightingModeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLightingMode() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldLightingMode = lightingMode;
		boolean oldLightingModeESet = lightingModeESet;
		lightingMode = LIGHTING_MODE_EDEFAULT;
		lightingModeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ChartPackage.PLOT_AREA_TYPE__LIGHTING_MODE, oldLightingMode, LIGHTING_MODE_EDEFAULT, oldLightingModeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLightingMode() {
		return lightingModeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProjectionType getProjection() {
		return projection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProjection(ProjectionType newProjection) {
		ProjectionType oldProjection = projection;
		projection = newProjection == null ? PROJECTION_EDEFAULT : newProjection;
		boolean oldProjectionESet = projectionESet;
		projectionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChartPackage.PLOT_AREA_TYPE__PROJECTION, oldProjection, projection, !oldProjectionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetProjection() {
		ProjectionType oldProjection = projection;
		boolean oldProjectionESet = projectionESet;
		projection = PROJECTION_EDEFAULT;
		projectionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ChartPackage.PLOT_AREA_TYPE__PROJECTION, oldProjection, PROJECTION_EDEFAULT, oldProjectionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetProjection() {
		return projectionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShadeModeType getShadeMode() {
		return shadeMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShadeMode(ShadeModeType newShadeMode) {
		ShadeModeType oldShadeMode = shadeMode;
		shadeMode = newShadeMode == null ? SHADE_MODE_EDEFAULT : newShadeMode;
		boolean oldShadeModeESet = shadeModeESet;
		shadeModeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChartPackage.PLOT_AREA_TYPE__SHADE_MODE, oldShadeMode, shadeMode, !oldShadeModeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetShadeMode() {
		ShadeModeType oldShadeMode = shadeMode;
		boolean oldShadeModeESet = shadeModeESet;
		shadeMode = SHADE_MODE_EDEFAULT;
		shadeModeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ChartPackage.PLOT_AREA_TYPE__SHADE_MODE, oldShadeMode, SHADE_MODE_EDEFAULT, oldShadeModeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetShadeMode() {
		return shadeModeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getShadowSlant() {
		return shadowSlant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShadowSlant(BigInteger newShadowSlant) {
		BigInteger oldShadowSlant = shadowSlant;
		shadowSlant = newShadowSlant;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChartPackage.PLOT_AREA_TYPE__SHADOW_SLANT, oldShadowSlant, shadowSlant));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ChartPackage.PLOT_AREA_TYPE__STYLE_NAME, oldStyleName, styleName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getTransform() {
		return transform;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransform(Object newTransform) {
		Object oldTransform = transform;
		transform = newTransform;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChartPackage.PLOT_AREA_TYPE__TRANSFORM, oldTransform, transform));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVpn() {
		return vpn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVpn(String newVpn) {
		String oldVpn = vpn;
		vpn = newVpn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChartPackage.PLOT_AREA_TYPE__VPN, oldVpn, vpn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVrp() {
		return vrp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVrp(String newVrp) {
		String oldVrp = vrp;
		vrp = newVrp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChartPackage.PLOT_AREA_TYPE__VRP, oldVrp, vrp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVup() {
		return vup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVup(String newVup) {
		String oldVup = vup;
		vup = newVup;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChartPackage.PLOT_AREA_TYPE__VUP, oldVup, vup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWidth() {
		return width;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWidth(String newWidth) {
		String oldWidth = width;
		width = newWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChartPackage.PLOT_AREA_TYPE__WIDTH, oldWidth, width));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getX() {
		return x;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setX(String newX) {
		String oldX = x;
		x = newX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChartPackage.PLOT_AREA_TYPE__X, oldX, x));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getY() {
		return y;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setY(String newY) {
		String oldY = y;
		y = newY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChartPackage.PLOT_AREA_TYPE__Y, oldY, y));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ChartPackage.PLOT_AREA_TYPE__LIGHT:
				return ((InternalEList<?>)getLight()).basicRemove(otherEnd, msgs);
			case ChartPackage.PLOT_AREA_TYPE__AXIS:
				return ((InternalEList<?>)getAxis()).basicRemove(otherEnd, msgs);
			case ChartPackage.PLOT_AREA_TYPE__SERIES:
				return ((InternalEList<?>)getSeries()).basicRemove(otherEnd, msgs);
			case ChartPackage.PLOT_AREA_TYPE__STOCK_GAIN_MARKER:
				return basicSetStockGainMarker(null, msgs);
			case ChartPackage.PLOT_AREA_TYPE__STOCK_LOSS_MARKER:
				return basicSetStockLossMarker(null, msgs);
			case ChartPackage.PLOT_AREA_TYPE__STOCK_RANGE_LINE:
				return basicSetStockRangeLine(null, msgs);
			case ChartPackage.PLOT_AREA_TYPE__WALL:
				return basicSetWall(null, msgs);
			case ChartPackage.PLOT_AREA_TYPE__FLOOR:
				return basicSetFloor(null, msgs);
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
			case ChartPackage.PLOT_AREA_TYPE__LIGHT:
				return getLight();
			case ChartPackage.PLOT_AREA_TYPE__AXIS:
				return getAxis();
			case ChartPackage.PLOT_AREA_TYPE__SERIES:
				return getSeries();
			case ChartPackage.PLOT_AREA_TYPE__STOCK_GAIN_MARKER:
				return getStockGainMarker();
			case ChartPackage.PLOT_AREA_TYPE__STOCK_LOSS_MARKER:
				return getStockLossMarker();
			case ChartPackage.PLOT_AREA_TYPE__STOCK_RANGE_LINE:
				return getStockRangeLine();
			case ChartPackage.PLOT_AREA_TYPE__WALL:
				return getWall();
			case ChartPackage.PLOT_AREA_TYPE__FLOOR:
				return getFloor();
			case ChartPackage.PLOT_AREA_TYPE__AMBIENT_COLOR:
				return getAmbientColor();
			case ChartPackage.PLOT_AREA_TYPE__CELL_RANGE_ADDRESS:
				return getCellRangeAddress();
			case ChartPackage.PLOT_AREA_TYPE__DATA_SOURCE_HAS_LABELS:
				return getDataSourceHasLabels();
			case ChartPackage.PLOT_AREA_TYPE__DISTANCE:
				return getDistance();
			case ChartPackage.PLOT_AREA_TYPE__FOCAL_LENGTH:
				return getFocalLength();
			case ChartPackage.PLOT_AREA_TYPE__HEIGHT:
				return getHeight();
			case ChartPackage.PLOT_AREA_TYPE__LIGHTING_MODE:
				return getLightingMode();
			case ChartPackage.PLOT_AREA_TYPE__PROJECTION:
				return getProjection();
			case ChartPackage.PLOT_AREA_TYPE__SHADE_MODE:
				return getShadeMode();
			case ChartPackage.PLOT_AREA_TYPE__SHADOW_SLANT:
				return getShadowSlant();
			case ChartPackage.PLOT_AREA_TYPE__STYLE_NAME:
				return getStyleName();
			case ChartPackage.PLOT_AREA_TYPE__TRANSFORM:
				return getTransform();
			case ChartPackage.PLOT_AREA_TYPE__VPN:
				return getVpn();
			case ChartPackage.PLOT_AREA_TYPE__VRP:
				return getVrp();
			case ChartPackage.PLOT_AREA_TYPE__VUP:
				return getVup();
			case ChartPackage.PLOT_AREA_TYPE__WIDTH:
				return getWidth();
			case ChartPackage.PLOT_AREA_TYPE__X:
				return getX();
			case ChartPackage.PLOT_AREA_TYPE__Y:
				return getY();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ChartPackage.PLOT_AREA_TYPE__LIGHT:
				getLight().clear();
				getLight().addAll((Collection<? extends LightType>)newValue);
				return;
			case ChartPackage.PLOT_AREA_TYPE__AXIS:
				getAxis().clear();
				getAxis().addAll((Collection<? extends AxisType>)newValue);
				return;
			case ChartPackage.PLOT_AREA_TYPE__SERIES:
				getSeries().clear();
				getSeries().addAll((Collection<? extends SeriesType>)newValue);
				return;
			case ChartPackage.PLOT_AREA_TYPE__STOCK_GAIN_MARKER:
				setStockGainMarker((StockGainMarkerType)newValue);
				return;
			case ChartPackage.PLOT_AREA_TYPE__STOCK_LOSS_MARKER:
				setStockLossMarker((StockLossMarkerType)newValue);
				return;
			case ChartPackage.PLOT_AREA_TYPE__STOCK_RANGE_LINE:
				setStockRangeLine((StockRangeLineType)newValue);
				return;
			case ChartPackage.PLOT_AREA_TYPE__WALL:
				setWall((WallType)newValue);
				return;
			case ChartPackage.PLOT_AREA_TYPE__FLOOR:
				setFloor((FloorType)newValue);
				return;
			case ChartPackage.PLOT_AREA_TYPE__AMBIENT_COLOR:
				setAmbientColor((String)newValue);
				return;
			case ChartPackage.PLOT_AREA_TYPE__CELL_RANGE_ADDRESS:
				setCellRangeAddress((String)newValue);
				return;
			case ChartPackage.PLOT_AREA_TYPE__DATA_SOURCE_HAS_LABELS:
				setDataSourceHasLabels((DataSourceHasLabelsType)newValue);
				return;
			case ChartPackage.PLOT_AREA_TYPE__DISTANCE:
				setDistance((String)newValue);
				return;
			case ChartPackage.PLOT_AREA_TYPE__FOCAL_LENGTH:
				setFocalLength((String)newValue);
				return;
			case ChartPackage.PLOT_AREA_TYPE__HEIGHT:
				setHeight((String)newValue);
				return;
			case ChartPackage.PLOT_AREA_TYPE__LIGHTING_MODE:
				setLightingMode((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case ChartPackage.PLOT_AREA_TYPE__PROJECTION:
				setProjection((ProjectionType)newValue);
				return;
			case ChartPackage.PLOT_AREA_TYPE__SHADE_MODE:
				setShadeMode((ShadeModeType)newValue);
				return;
			case ChartPackage.PLOT_AREA_TYPE__SHADOW_SLANT:
				setShadowSlant((BigInteger)newValue);
				return;
			case ChartPackage.PLOT_AREA_TYPE__STYLE_NAME:
				setStyleName((String)newValue);
				return;
			case ChartPackage.PLOT_AREA_TYPE__TRANSFORM:
				setTransform(newValue);
				return;
			case ChartPackage.PLOT_AREA_TYPE__VPN:
				setVpn((String)newValue);
				return;
			case ChartPackage.PLOT_AREA_TYPE__VRP:
				setVrp((String)newValue);
				return;
			case ChartPackage.PLOT_AREA_TYPE__VUP:
				setVup((String)newValue);
				return;
			case ChartPackage.PLOT_AREA_TYPE__WIDTH:
				setWidth((String)newValue);
				return;
			case ChartPackage.PLOT_AREA_TYPE__X:
				setX((String)newValue);
				return;
			case ChartPackage.PLOT_AREA_TYPE__Y:
				setY((String)newValue);
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
			case ChartPackage.PLOT_AREA_TYPE__LIGHT:
				getLight().clear();
				return;
			case ChartPackage.PLOT_AREA_TYPE__AXIS:
				getAxis().clear();
				return;
			case ChartPackage.PLOT_AREA_TYPE__SERIES:
				getSeries().clear();
				return;
			case ChartPackage.PLOT_AREA_TYPE__STOCK_GAIN_MARKER:
				setStockGainMarker((StockGainMarkerType)null);
				return;
			case ChartPackage.PLOT_AREA_TYPE__STOCK_LOSS_MARKER:
				setStockLossMarker((StockLossMarkerType)null);
				return;
			case ChartPackage.PLOT_AREA_TYPE__STOCK_RANGE_LINE:
				setStockRangeLine((StockRangeLineType)null);
				return;
			case ChartPackage.PLOT_AREA_TYPE__WALL:
				setWall((WallType)null);
				return;
			case ChartPackage.PLOT_AREA_TYPE__FLOOR:
				setFloor((FloorType)null);
				return;
			case ChartPackage.PLOT_AREA_TYPE__AMBIENT_COLOR:
				setAmbientColor(AMBIENT_COLOR_EDEFAULT);
				return;
			case ChartPackage.PLOT_AREA_TYPE__CELL_RANGE_ADDRESS:
				setCellRangeAddress(CELL_RANGE_ADDRESS_EDEFAULT);
				return;
			case ChartPackage.PLOT_AREA_TYPE__DATA_SOURCE_HAS_LABELS:
				unsetDataSourceHasLabels();
				return;
			case ChartPackage.PLOT_AREA_TYPE__DISTANCE:
				setDistance(DISTANCE_EDEFAULT);
				return;
			case ChartPackage.PLOT_AREA_TYPE__FOCAL_LENGTH:
				setFocalLength(FOCAL_LENGTH_EDEFAULT);
				return;
			case ChartPackage.PLOT_AREA_TYPE__HEIGHT:
				setHeight(HEIGHT_EDEFAULT);
				return;
			case ChartPackage.PLOT_AREA_TYPE__LIGHTING_MODE:
				unsetLightingMode();
				return;
			case ChartPackage.PLOT_AREA_TYPE__PROJECTION:
				unsetProjection();
				return;
			case ChartPackage.PLOT_AREA_TYPE__SHADE_MODE:
				unsetShadeMode();
				return;
			case ChartPackage.PLOT_AREA_TYPE__SHADOW_SLANT:
				setShadowSlant(SHADOW_SLANT_EDEFAULT);
				return;
			case ChartPackage.PLOT_AREA_TYPE__STYLE_NAME:
				setStyleName(STYLE_NAME_EDEFAULT);
				return;
			case ChartPackage.PLOT_AREA_TYPE__TRANSFORM:
				setTransform(TRANSFORM_EDEFAULT);
				return;
			case ChartPackage.PLOT_AREA_TYPE__VPN:
				setVpn(VPN_EDEFAULT);
				return;
			case ChartPackage.PLOT_AREA_TYPE__VRP:
				setVrp(VRP_EDEFAULT);
				return;
			case ChartPackage.PLOT_AREA_TYPE__VUP:
				setVup(VUP_EDEFAULT);
				return;
			case ChartPackage.PLOT_AREA_TYPE__WIDTH:
				setWidth(WIDTH_EDEFAULT);
				return;
			case ChartPackage.PLOT_AREA_TYPE__X:
				setX(X_EDEFAULT);
				return;
			case ChartPackage.PLOT_AREA_TYPE__Y:
				setY(Y_EDEFAULT);
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
			case ChartPackage.PLOT_AREA_TYPE__LIGHT:
				return light != null && !light.isEmpty();
			case ChartPackage.PLOT_AREA_TYPE__AXIS:
				return axis != null && !axis.isEmpty();
			case ChartPackage.PLOT_AREA_TYPE__SERIES:
				return series != null && !series.isEmpty();
			case ChartPackage.PLOT_AREA_TYPE__STOCK_GAIN_MARKER:
				return stockGainMarker != null;
			case ChartPackage.PLOT_AREA_TYPE__STOCK_LOSS_MARKER:
				return stockLossMarker != null;
			case ChartPackage.PLOT_AREA_TYPE__STOCK_RANGE_LINE:
				return stockRangeLine != null;
			case ChartPackage.PLOT_AREA_TYPE__WALL:
				return wall != null;
			case ChartPackage.PLOT_AREA_TYPE__FLOOR:
				return floor != null;
			case ChartPackage.PLOT_AREA_TYPE__AMBIENT_COLOR:
				return AMBIENT_COLOR_EDEFAULT == null ? ambientColor != null : !AMBIENT_COLOR_EDEFAULT.equals(ambientColor);
			case ChartPackage.PLOT_AREA_TYPE__CELL_RANGE_ADDRESS:
				return CELL_RANGE_ADDRESS_EDEFAULT == null ? cellRangeAddress != null : !CELL_RANGE_ADDRESS_EDEFAULT.equals(cellRangeAddress);
			case ChartPackage.PLOT_AREA_TYPE__DATA_SOURCE_HAS_LABELS:
				return isSetDataSourceHasLabels();
			case ChartPackage.PLOT_AREA_TYPE__DISTANCE:
				return DISTANCE_EDEFAULT == null ? distance != null : !DISTANCE_EDEFAULT.equals(distance);
			case ChartPackage.PLOT_AREA_TYPE__FOCAL_LENGTH:
				return FOCAL_LENGTH_EDEFAULT == null ? focalLength != null : !FOCAL_LENGTH_EDEFAULT.equals(focalLength);
			case ChartPackage.PLOT_AREA_TYPE__HEIGHT:
				return HEIGHT_EDEFAULT == null ? height != null : !HEIGHT_EDEFAULT.equals(height);
			case ChartPackage.PLOT_AREA_TYPE__LIGHTING_MODE:
				return isSetLightingMode();
			case ChartPackage.PLOT_AREA_TYPE__PROJECTION:
				return isSetProjection();
			case ChartPackage.PLOT_AREA_TYPE__SHADE_MODE:
				return isSetShadeMode();
			case ChartPackage.PLOT_AREA_TYPE__SHADOW_SLANT:
				return SHADOW_SLANT_EDEFAULT == null ? shadowSlant != null : !SHADOW_SLANT_EDEFAULT.equals(shadowSlant);
			case ChartPackage.PLOT_AREA_TYPE__STYLE_NAME:
				return STYLE_NAME_EDEFAULT == null ? styleName != null : !STYLE_NAME_EDEFAULT.equals(styleName);
			case ChartPackage.PLOT_AREA_TYPE__TRANSFORM:
				return TRANSFORM_EDEFAULT == null ? transform != null : !TRANSFORM_EDEFAULT.equals(transform);
			case ChartPackage.PLOT_AREA_TYPE__VPN:
				return VPN_EDEFAULT == null ? vpn != null : !VPN_EDEFAULT.equals(vpn);
			case ChartPackage.PLOT_AREA_TYPE__VRP:
				return VRP_EDEFAULT == null ? vrp != null : !VRP_EDEFAULT.equals(vrp);
			case ChartPackage.PLOT_AREA_TYPE__VUP:
				return VUP_EDEFAULT == null ? vup != null : !VUP_EDEFAULT.equals(vup);
			case ChartPackage.PLOT_AREA_TYPE__WIDTH:
				return WIDTH_EDEFAULT == null ? width != null : !WIDTH_EDEFAULT.equals(width);
			case ChartPackage.PLOT_AREA_TYPE__X:
				return X_EDEFAULT == null ? x != null : !X_EDEFAULT.equals(x);
			case ChartPackage.PLOT_AREA_TYPE__Y:
				return Y_EDEFAULT == null ? y != null : !Y_EDEFAULT.equals(y);
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
		result.append(" (ambientColor: ");
		result.append(ambientColor);
		result.append(", cellRangeAddress: ");
		result.append(cellRangeAddress);
		result.append(", dataSourceHasLabels: ");
		if (dataSourceHasLabelsESet) result.append(dataSourceHasLabels); else result.append("<unset>");
		result.append(", distance: ");
		result.append(distance);
		result.append(", focalLength: ");
		result.append(focalLength);
		result.append(", height: ");
		result.append(height);
		result.append(", lightingMode: ");
		if (lightingModeESet) result.append(lightingMode); else result.append("<unset>");
		result.append(", projection: ");
		if (projectionESet) result.append(projection); else result.append("<unset>");
		result.append(", shadeMode: ");
		if (shadeModeESet) result.append(shadeMode); else result.append("<unset>");
		result.append(", shadowSlant: ");
		result.append(shadowSlant);
		result.append(", styleName: ");
		result.append(styleName);
		result.append(", transform: ");
		result.append(transform);
		result.append(", vpn: ");
		result.append(vpn);
		result.append(", vrp: ");
		result.append(vrp);
		result.append(", vup: ");
		result.append(vup);
		result.append(", width: ");
		result.append(width);
		result.append(", x: ");
		result.append(x);
		result.append(", y: ");
		result.append(y);
		result.append(')');
		return result.toString();
	}

} //PlotAreaTypeImpl
