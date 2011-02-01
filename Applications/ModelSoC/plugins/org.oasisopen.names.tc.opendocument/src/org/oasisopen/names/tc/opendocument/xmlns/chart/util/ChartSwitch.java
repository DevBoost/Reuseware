/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.chart.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.oasisopen.names.tc.opendocument.xmlns.chart.AxisType;
import org.oasisopen.names.tc.opendocument.xmlns.chart.CategoriesType;
import org.oasisopen.names.tc.opendocument.xmlns.chart.ChartPackage;
import org.oasisopen.names.tc.opendocument.xmlns.chart.DataPointType;
import org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot;
import org.oasisopen.names.tc.opendocument.xmlns.chart.DomainType;
import org.oasisopen.names.tc.opendocument.xmlns.chart.ErrorIndicatorType;
import org.oasisopen.names.tc.opendocument.xmlns.chart.FloorType;
import org.oasisopen.names.tc.opendocument.xmlns.chart.FooterType;
import org.oasisopen.names.tc.opendocument.xmlns.chart.GridType;
import org.oasisopen.names.tc.opendocument.xmlns.chart.LegendType;
import org.oasisopen.names.tc.opendocument.xmlns.chart.MeanValueType;
import org.oasisopen.names.tc.opendocument.xmlns.chart.PlotAreaType;
import org.oasisopen.names.tc.opendocument.xmlns.chart.RegressionCurveType;
import org.oasisopen.names.tc.opendocument.xmlns.chart.SeriesType;
import org.oasisopen.names.tc.opendocument.xmlns.chart.StockGainMarkerType;
import org.oasisopen.names.tc.opendocument.xmlns.chart.StockLossMarkerType;
import org.oasisopen.names.tc.opendocument.xmlns.chart.StockRangeLineType;
import org.oasisopen.names.tc.opendocument.xmlns.chart.SubtitleType;
import org.oasisopen.names.tc.opendocument.xmlns.chart.SymbolImageType;
import org.oasisopen.names.tc.opendocument.xmlns.chart.TitleType;
import org.oasisopen.names.tc.opendocument.xmlns.chart.WallType;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.ChartPackage
 * @generated
 */
public class ChartSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ChartPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChartSwitch() {
		if (modelPackage == null) {
			modelPackage = ChartPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public T doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List<EClass> eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch(eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ChartPackage.AXIS_TYPE: {
				AxisType axisType = (AxisType)theEObject;
				T result = caseAxisType(axisType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ChartPackage.CATEGORIES_TYPE: {
				CategoriesType categoriesType = (CategoriesType)theEObject;
				T result = caseCategoriesType(categoriesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ChartPackage.DATA_POINT_TYPE: {
				DataPointType dataPointType = (DataPointType)theEObject;
				T result = caseDataPointType(dataPointType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ChartPackage.DOCUMENT_ROOT: {
				DocumentRoot documentRoot = (DocumentRoot)theEObject;
				T result = caseDocumentRoot(documentRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ChartPackage.DOMAIN_TYPE: {
				DomainType domainType = (DomainType)theEObject;
				T result = caseDomainType(domainType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ChartPackage.ERROR_INDICATOR_TYPE: {
				ErrorIndicatorType errorIndicatorType = (ErrorIndicatorType)theEObject;
				T result = caseErrorIndicatorType(errorIndicatorType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ChartPackage.FLOOR_TYPE: {
				FloorType floorType = (FloorType)theEObject;
				T result = caseFloorType(floorType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ChartPackage.FOOTER_TYPE: {
				FooterType footerType = (FooterType)theEObject;
				T result = caseFooterType(footerType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ChartPackage.GRID_TYPE: {
				GridType gridType = (GridType)theEObject;
				T result = caseGridType(gridType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ChartPackage.LEGEND_TYPE: {
				LegendType legendType = (LegendType)theEObject;
				T result = caseLegendType(legendType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ChartPackage.MEAN_VALUE_TYPE: {
				MeanValueType meanValueType = (MeanValueType)theEObject;
				T result = caseMeanValueType(meanValueType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ChartPackage.PLOT_AREA_TYPE: {
				PlotAreaType plotAreaType = (PlotAreaType)theEObject;
				T result = casePlotAreaType(plotAreaType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ChartPackage.REGRESSION_CURVE_TYPE: {
				RegressionCurveType regressionCurveType = (RegressionCurveType)theEObject;
				T result = caseRegressionCurveType(regressionCurveType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ChartPackage.SERIES_TYPE: {
				SeriesType seriesType = (SeriesType)theEObject;
				T result = caseSeriesType(seriesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ChartPackage.STOCK_GAIN_MARKER_TYPE: {
				StockGainMarkerType stockGainMarkerType = (StockGainMarkerType)theEObject;
				T result = caseStockGainMarkerType(stockGainMarkerType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ChartPackage.STOCK_LOSS_MARKER_TYPE: {
				StockLossMarkerType stockLossMarkerType = (StockLossMarkerType)theEObject;
				T result = caseStockLossMarkerType(stockLossMarkerType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ChartPackage.STOCK_RANGE_LINE_TYPE: {
				StockRangeLineType stockRangeLineType = (StockRangeLineType)theEObject;
				T result = caseStockRangeLineType(stockRangeLineType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ChartPackage.SUBTITLE_TYPE: {
				SubtitleType subtitleType = (SubtitleType)theEObject;
				T result = caseSubtitleType(subtitleType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ChartPackage.SYMBOL_IMAGE_TYPE: {
				SymbolImageType symbolImageType = (SymbolImageType)theEObject;
				T result = caseSymbolImageType(symbolImageType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ChartPackage.TITLE_TYPE: {
				TitleType titleType = (TitleType)theEObject;
				T result = caseTitleType(titleType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ChartPackage.WALL_TYPE: {
				WallType wallType = (WallType)theEObject;
				T result = caseWallType(wallType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Axis Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Axis Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAxisType(AxisType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Categories Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Categories Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCategoriesType(CategoriesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Point Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Point Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataPointType(DataPointType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentRoot(DocumentRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Domain Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Domain Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDomainType(DomainType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Error Indicator Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Error Indicator Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseErrorIndicatorType(ErrorIndicatorType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Floor Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Floor Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFloorType(FloorType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Footer Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Footer Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFooterType(FooterType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Grid Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Grid Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGridType(GridType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Legend Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Legend Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLegendType(LegendType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mean Value Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mean Value Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeanValueType(MeanValueType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Plot Area Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Plot Area Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlotAreaType(PlotAreaType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Regression Curve Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Regression Curve Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRegressionCurveType(RegressionCurveType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Series Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Series Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSeriesType(SeriesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stock Gain Marker Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stock Gain Marker Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStockGainMarkerType(StockGainMarkerType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stock Loss Marker Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stock Loss Marker Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStockLossMarkerType(StockLossMarkerType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stock Range Line Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stock Range Line Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStockRangeLineType(StockRangeLineType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subtitle Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subtitle Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubtitleType(SubtitleType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Symbol Image Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Symbol Image Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSymbolImageType(SymbolImageType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Title Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Title Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTitleType(TitleType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wall Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wall Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWallType(WallType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public T defaultCase(EObject object) {
		return null;
	}

} //ChartSwitch
