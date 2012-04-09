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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;
import org.oasisopen.names.tc.opendocument.xmlns.chart.AxisType;
import org.oasisopen.names.tc.opendocument.xmlns.chart.CategoriesType;
import org.oasisopen.names.tc.opendocument.xmlns.chart.ChartFactory;
import org.oasisopen.names.tc.opendocument.xmlns.chart.ChartPackage;
import org.oasisopen.names.tc.opendocument.xmlns.chart.ClassType;
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
import org.oasisopen.names.tc.opendocument.xmlns.text.TextFactory;
import org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ChartFactoryImpl extends EFactoryImpl implements ChartFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ChartFactory init() {
		try {
			ChartFactory theChartFactory = (ChartFactory)EPackage.Registry.INSTANCE.getEFactory("urn:oasis:names:tc:opendocument:xmlns:chart:1.0"); 
			if (theChartFactory != null) {
				return theChartFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ChartFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChartFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ChartPackage.AXIS_TYPE: return createAxisType();
			case ChartPackage.CATEGORIES_TYPE: return createCategoriesType();
			case ChartPackage.DATA_POINT_TYPE: return createDataPointType();
			case ChartPackage.DOCUMENT_ROOT: return createDocumentRoot();
			case ChartPackage.DOMAIN_TYPE: return createDomainType();
			case ChartPackage.ERROR_INDICATOR_TYPE: return createErrorIndicatorType();
			case ChartPackage.FLOOR_TYPE: return createFloorType();
			case ChartPackage.FOOTER_TYPE: return createFooterType();
			case ChartPackage.GRID_TYPE: return createGridType();
			case ChartPackage.LEGEND_TYPE: return createLegendType();
			case ChartPackage.MEAN_VALUE_TYPE: return createMeanValueType();
			case ChartPackage.PLOT_AREA_TYPE: return createPlotAreaType();
			case ChartPackage.REGRESSION_CURVE_TYPE: return createRegressionCurveType();
			case ChartPackage.SERIES_TYPE: return createSeriesType();
			case ChartPackage.STOCK_GAIN_MARKER_TYPE: return createStockGainMarkerType();
			case ChartPackage.STOCK_LOSS_MARKER_TYPE: return createStockLossMarkerType();
			case ChartPackage.STOCK_RANGE_LINE_TYPE: return createStockRangeLineType();
			case ChartPackage.SUBTITLE_TYPE: return createSubtitleType();
			case ChartPackage.SYMBOL_IMAGE_TYPE: return createSymbolImageType();
			case ChartPackage.TITLE_TYPE: return createTitleType();
			case ChartPackage.WALL_TYPE: return createWallType();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case ChartPackage.CLASS_TYPE:
				return createClassTypeFromString(eDataType, initialValue);
			case ChartPackage.DATA_LABEL_NUMBER_TYPE:
				return createDataLabelNumberTypeFromString(eDataType, initialValue);
			case ChartPackage.DATA_SOURCE_HAS_LABELS_TYPE:
				return createDataSourceHasLabelsTypeFromString(eDataType, initialValue);
			case ChartPackage.DIMENSION_TYPE:
				return createDimensionTypeFromString(eDataType, initialValue);
			case ChartPackage.ERROR_CATEGORY_TYPE:
				return createErrorCategoryTypeFromString(eDataType, initialValue);
			case ChartPackage.INTERPOLATION_TYPE:
				return createInterpolationTypeFromString(eDataType, initialValue);
			case ChartPackage.LABEL_ARRANGEMENT_TYPE:
				return createLabelArrangementTypeFromString(eDataType, initialValue);
			case ChartPackage.LEGEND_ALIGN_TYPE:
				return createLegendAlignTypeFromString(eDataType, initialValue);
			case ChartPackage.LEGEND_POSITION_TYPE:
				return createLegendPositionTypeFromString(eDataType, initialValue);
			case ChartPackage.REGRESSION_TYPE_TYPE:
				return createRegressionTypeTypeFromString(eDataType, initialValue);
			case ChartPackage.SERIES_SOURCE_TYPE:
				return createSeriesSourceTypeFromString(eDataType, initialValue);
			case ChartPackage.SOLID_TYPE_TYPE:
				return createSolidTypeTypeFromString(eDataType, initialValue);
			case ChartPackage.SYMBOL_NAME_TYPE:
				return createSymbolNameTypeFromString(eDataType, initialValue);
			case ChartPackage.SYMBOL_TYPE_TYPE:
				return createSymbolTypeTypeFromString(eDataType, initialValue);
			case ChartPackage.CLASS_TYPE_OBJECT:
				return createClassTypeObjectFromString(eDataType, initialValue);
			case ChartPackage.DATA_LABEL_NUMBER_TYPE_OBJECT:
				return createDataLabelNumberTypeObjectFromString(eDataType, initialValue);
			case ChartPackage.DATA_SOURCE_HAS_LABELS_TYPE_OBJECT:
				return createDataSourceHasLabelsTypeObjectFromString(eDataType, initialValue);
			case ChartPackage.DIMENSION_TYPE_OBJECT:
				return createDimensionTypeObjectFromString(eDataType, initialValue);
			case ChartPackage.ERROR_CATEGORY_TYPE_OBJECT:
				return createErrorCategoryTypeObjectFromString(eDataType, initialValue);
			case ChartPackage.INTERPOLATION_TYPE_OBJECT:
				return createInterpolationTypeObjectFromString(eDataType, initialValue);
			case ChartPackage.LABEL_ARRANGEMENT_TYPE_OBJECT:
				return createLabelArrangementTypeObjectFromString(eDataType, initialValue);
			case ChartPackage.LEGEND_ALIGN_TYPE_OBJECT:
				return createLegendAlignTypeObjectFromString(eDataType, initialValue);
			case ChartPackage.LEGEND_POSITION_TYPE_OBJECT:
				return createLegendPositionTypeObjectFromString(eDataType, initialValue);
			case ChartPackage.REGRESSION_TYPE_TYPE_OBJECT:
				return createRegressionTypeTypeObjectFromString(eDataType, initialValue);
			case ChartPackage.SERIES_SOURCE_TYPE_OBJECT:
				return createSeriesSourceTypeObjectFromString(eDataType, initialValue);
			case ChartPackage.SOLID_TYPE_TYPE_OBJECT:
				return createSolidTypeTypeObjectFromString(eDataType, initialValue);
			case ChartPackage.STYLE_NAME_TYPE:
				return createStyleNameTypeFromString(eDataType, initialValue);
			case ChartPackage.STYLE_NAME_TYPE_MEMBER1:
				return createStyleNameTypeMember1FromString(eDataType, initialValue);
			case ChartPackage.SYMBOL_NAME_TYPE_OBJECT:
				return createSymbolNameTypeObjectFromString(eDataType, initialValue);
			case ChartPackage.SYMBOL_TYPE_TYPE_OBJECT:
				return createSymbolTypeTypeObjectFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case ChartPackage.CLASS_TYPE:
				return convertClassTypeToString(eDataType, instanceValue);
			case ChartPackage.DATA_LABEL_NUMBER_TYPE:
				return convertDataLabelNumberTypeToString(eDataType, instanceValue);
			case ChartPackage.DATA_SOURCE_HAS_LABELS_TYPE:
				return convertDataSourceHasLabelsTypeToString(eDataType, instanceValue);
			case ChartPackage.DIMENSION_TYPE:
				return convertDimensionTypeToString(eDataType, instanceValue);
			case ChartPackage.ERROR_CATEGORY_TYPE:
				return convertErrorCategoryTypeToString(eDataType, instanceValue);
			case ChartPackage.INTERPOLATION_TYPE:
				return convertInterpolationTypeToString(eDataType, instanceValue);
			case ChartPackage.LABEL_ARRANGEMENT_TYPE:
				return convertLabelArrangementTypeToString(eDataType, instanceValue);
			case ChartPackage.LEGEND_ALIGN_TYPE:
				return convertLegendAlignTypeToString(eDataType, instanceValue);
			case ChartPackage.LEGEND_POSITION_TYPE:
				return convertLegendPositionTypeToString(eDataType, instanceValue);
			case ChartPackage.REGRESSION_TYPE_TYPE:
				return convertRegressionTypeTypeToString(eDataType, instanceValue);
			case ChartPackage.SERIES_SOURCE_TYPE:
				return convertSeriesSourceTypeToString(eDataType, instanceValue);
			case ChartPackage.SOLID_TYPE_TYPE:
				return convertSolidTypeTypeToString(eDataType, instanceValue);
			case ChartPackage.SYMBOL_NAME_TYPE:
				return convertSymbolNameTypeToString(eDataType, instanceValue);
			case ChartPackage.SYMBOL_TYPE_TYPE:
				return convertSymbolTypeTypeToString(eDataType, instanceValue);
			case ChartPackage.CLASS_TYPE_OBJECT:
				return convertClassTypeObjectToString(eDataType, instanceValue);
			case ChartPackage.DATA_LABEL_NUMBER_TYPE_OBJECT:
				return convertDataLabelNumberTypeObjectToString(eDataType, instanceValue);
			case ChartPackage.DATA_SOURCE_HAS_LABELS_TYPE_OBJECT:
				return convertDataSourceHasLabelsTypeObjectToString(eDataType, instanceValue);
			case ChartPackage.DIMENSION_TYPE_OBJECT:
				return convertDimensionTypeObjectToString(eDataType, instanceValue);
			case ChartPackage.ERROR_CATEGORY_TYPE_OBJECT:
				return convertErrorCategoryTypeObjectToString(eDataType, instanceValue);
			case ChartPackage.INTERPOLATION_TYPE_OBJECT:
				return convertInterpolationTypeObjectToString(eDataType, instanceValue);
			case ChartPackage.LABEL_ARRANGEMENT_TYPE_OBJECT:
				return convertLabelArrangementTypeObjectToString(eDataType, instanceValue);
			case ChartPackage.LEGEND_ALIGN_TYPE_OBJECT:
				return convertLegendAlignTypeObjectToString(eDataType, instanceValue);
			case ChartPackage.LEGEND_POSITION_TYPE_OBJECT:
				return convertLegendPositionTypeObjectToString(eDataType, instanceValue);
			case ChartPackage.REGRESSION_TYPE_TYPE_OBJECT:
				return convertRegressionTypeTypeObjectToString(eDataType, instanceValue);
			case ChartPackage.SERIES_SOURCE_TYPE_OBJECT:
				return convertSeriesSourceTypeObjectToString(eDataType, instanceValue);
			case ChartPackage.SOLID_TYPE_TYPE_OBJECT:
				return convertSolidTypeTypeObjectToString(eDataType, instanceValue);
			case ChartPackage.STYLE_NAME_TYPE:
				return convertStyleNameTypeToString(eDataType, instanceValue);
			case ChartPackage.STYLE_NAME_TYPE_MEMBER1:
				return convertStyleNameTypeMember1ToString(eDataType, instanceValue);
			case ChartPackage.SYMBOL_NAME_TYPE_OBJECT:
				return convertSymbolNameTypeObjectToString(eDataType, instanceValue);
			case ChartPackage.SYMBOL_TYPE_TYPE_OBJECT:
				return convertSymbolTypeTypeObjectToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AxisType createAxisType() {
		AxisTypeImpl axisType = new AxisTypeImpl();
		return axisType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CategoriesType createCategoriesType() {
		CategoriesTypeImpl categoriesType = new CategoriesTypeImpl();
		return categoriesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataPointType createDataPointType() {
		DataPointTypeImpl dataPointType = new DataPointTypeImpl();
		return dataPointType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentRoot createDocumentRoot() {
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainType createDomainType() {
		DomainTypeImpl domainType = new DomainTypeImpl();
		return domainType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErrorIndicatorType createErrorIndicatorType() {
		ErrorIndicatorTypeImpl errorIndicatorType = new ErrorIndicatorTypeImpl();
		return errorIndicatorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FloorType createFloorType() {
		FloorTypeImpl floorType = new FloorTypeImpl();
		return floorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FooterType createFooterType() {
		FooterTypeImpl footerType = new FooterTypeImpl();
		return footerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GridType createGridType() {
		GridTypeImpl gridType = new GridTypeImpl();
		return gridType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LegendType createLegendType() {
		LegendTypeImpl legendType = new LegendTypeImpl();
		return legendType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeanValueType createMeanValueType() {
		MeanValueTypeImpl meanValueType = new MeanValueTypeImpl();
		return meanValueType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlotAreaType createPlotAreaType() {
		PlotAreaTypeImpl plotAreaType = new PlotAreaTypeImpl();
		return plotAreaType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegressionCurveType createRegressionCurveType() {
		RegressionCurveTypeImpl regressionCurveType = new RegressionCurveTypeImpl();
		return regressionCurveType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SeriesType createSeriesType() {
		SeriesTypeImpl seriesType = new SeriesTypeImpl();
		return seriesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StockGainMarkerType createStockGainMarkerType() {
		StockGainMarkerTypeImpl stockGainMarkerType = new StockGainMarkerTypeImpl();
		return stockGainMarkerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StockLossMarkerType createStockLossMarkerType() {
		StockLossMarkerTypeImpl stockLossMarkerType = new StockLossMarkerTypeImpl();
		return stockLossMarkerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StockRangeLineType createStockRangeLineType() {
		StockRangeLineTypeImpl stockRangeLineType = new StockRangeLineTypeImpl();
		return stockRangeLineType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubtitleType createSubtitleType() {
		SubtitleTypeImpl subtitleType = new SubtitleTypeImpl();
		return subtitleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SymbolImageType createSymbolImageType() {
		SymbolImageTypeImpl symbolImageType = new SymbolImageTypeImpl();
		return symbolImageType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TitleType createTitleType() {
		TitleTypeImpl titleType = new TitleTypeImpl();
		return titleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WallType createWallType() {
		WallTypeImpl wallType = new WallTypeImpl();
		return wallType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassType createClassTypeFromString(EDataType eDataType, String initialValue) {
		ClassType result = ClassType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertClassTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataLabelNumberType createDataLabelNumberTypeFromString(EDataType eDataType, String initialValue) {
		DataLabelNumberType result = DataLabelNumberType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDataLabelNumberTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataSourceHasLabelsType createDataSourceHasLabelsTypeFromString(EDataType eDataType, String initialValue) {
		DataSourceHasLabelsType result = DataSourceHasLabelsType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDataSourceHasLabelsTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DimensionType createDimensionTypeFromString(EDataType eDataType, String initialValue) {
		DimensionType result = DimensionType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDimensionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErrorCategoryType createErrorCategoryTypeFromString(EDataType eDataType, String initialValue) {
		ErrorCategoryType result = ErrorCategoryType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertErrorCategoryTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterpolationType createInterpolationTypeFromString(EDataType eDataType, String initialValue) {
		InterpolationType result = InterpolationType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInterpolationTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LabelArrangementType createLabelArrangementTypeFromString(EDataType eDataType, String initialValue) {
		LabelArrangementType result = LabelArrangementType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLabelArrangementTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LegendAlignType createLegendAlignTypeFromString(EDataType eDataType, String initialValue) {
		LegendAlignType result = LegendAlignType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLegendAlignTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LegendPositionType createLegendPositionTypeFromString(EDataType eDataType, String initialValue) {
		LegendPositionType result = LegendPositionType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLegendPositionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegressionTypeType createRegressionTypeTypeFromString(EDataType eDataType, String initialValue) {
		RegressionTypeType result = RegressionTypeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRegressionTypeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SeriesSourceType createSeriesSourceTypeFromString(EDataType eDataType, String initialValue) {
		SeriesSourceType result = SeriesSourceType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSeriesSourceTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SolidTypeType createSolidTypeTypeFromString(EDataType eDataType, String initialValue) {
		SolidTypeType result = SolidTypeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSolidTypeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SymbolNameType createSymbolNameTypeFromString(EDataType eDataType, String initialValue) {
		SymbolNameType result = SymbolNameType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSymbolNameTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SymbolTypeType createSymbolTypeTypeFromString(EDataType eDataType, String initialValue) {
		SymbolTypeType result = SymbolTypeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSymbolTypeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassType createClassTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createClassTypeFromString(ChartPackage.Literals.CLASS_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertClassTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertClassTypeToString(ChartPackage.Literals.CLASS_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataLabelNumberType createDataLabelNumberTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createDataLabelNumberTypeFromString(ChartPackage.Literals.DATA_LABEL_NUMBER_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDataLabelNumberTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDataLabelNumberTypeToString(ChartPackage.Literals.DATA_LABEL_NUMBER_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataSourceHasLabelsType createDataSourceHasLabelsTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createDataSourceHasLabelsTypeFromString(ChartPackage.Literals.DATA_SOURCE_HAS_LABELS_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDataSourceHasLabelsTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDataSourceHasLabelsTypeToString(ChartPackage.Literals.DATA_SOURCE_HAS_LABELS_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DimensionType createDimensionTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createDimensionTypeFromString(ChartPackage.Literals.DIMENSION_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDimensionTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDimensionTypeToString(ChartPackage.Literals.DIMENSION_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErrorCategoryType createErrorCategoryTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createErrorCategoryTypeFromString(ChartPackage.Literals.ERROR_CATEGORY_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertErrorCategoryTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertErrorCategoryTypeToString(ChartPackage.Literals.ERROR_CATEGORY_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterpolationType createInterpolationTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createInterpolationTypeFromString(ChartPackage.Literals.INTERPOLATION_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInterpolationTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertInterpolationTypeToString(ChartPackage.Literals.INTERPOLATION_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LabelArrangementType createLabelArrangementTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createLabelArrangementTypeFromString(ChartPackage.Literals.LABEL_ARRANGEMENT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLabelArrangementTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertLabelArrangementTypeToString(ChartPackage.Literals.LABEL_ARRANGEMENT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LegendAlignType createLegendAlignTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createLegendAlignTypeFromString(ChartPackage.Literals.LEGEND_ALIGN_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLegendAlignTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertLegendAlignTypeToString(ChartPackage.Literals.LEGEND_ALIGN_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LegendPositionType createLegendPositionTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createLegendPositionTypeFromString(ChartPackage.Literals.LEGEND_POSITION_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLegendPositionTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertLegendPositionTypeToString(ChartPackage.Literals.LEGEND_POSITION_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegressionTypeType createRegressionTypeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createRegressionTypeTypeFromString(ChartPackage.Literals.REGRESSION_TYPE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRegressionTypeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertRegressionTypeTypeToString(ChartPackage.Literals.REGRESSION_TYPE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SeriesSourceType createSeriesSourceTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createSeriesSourceTypeFromString(ChartPackage.Literals.SERIES_SOURCE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSeriesSourceTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSeriesSourceTypeToString(ChartPackage.Literals.SERIES_SOURCE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SolidTypeType createSolidTypeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createSolidTypeTypeFromString(ChartPackage.Literals.SOLID_TYPE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSolidTypeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSolidTypeTypeToString(ChartPackage.Literals.SOLID_TYPE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createStyleNameTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		String result = null;
		RuntimeException exception = null;
		try {
			result = (String)TextFactory.eINSTANCE.createFromString(TextPackage.eINSTANCE.getStyleNameRef(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createStyleNameTypeMember1FromString(ChartPackage.Literals.STYLE_NAME_TYPE_MEMBER1, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStyleNameTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (TextPackage.eINSTANCE.getStyleNameRef().isInstance(instanceValue)) {
			try {
				String value = TextFactory.eINSTANCE.convertToString(TextPackage.eINSTANCE.getStyleNameRef(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (ChartPackage.Literals.STYLE_NAME_TYPE_MEMBER1.isInstance(instanceValue)) {
			try {
				String value = convertStyleNameTypeMember1ToString(ChartPackage.Literals.STYLE_NAME_TYPE_MEMBER1, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createStyleNameTypeMember1FromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.TOKEN, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStyleNameTypeMember1ToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.TOKEN, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SymbolNameType createSymbolNameTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createSymbolNameTypeFromString(ChartPackage.Literals.SYMBOL_NAME_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSymbolNameTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSymbolNameTypeToString(ChartPackage.Literals.SYMBOL_NAME_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SymbolTypeType createSymbolTypeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createSymbolTypeTypeFromString(ChartPackage.Literals.SYMBOL_TYPE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSymbolTypeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSymbolTypeTypeToString(ChartPackage.Literals.SYMBOL_TYPE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChartPackage getChartPackage() {
		return (ChartPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ChartPackage getPackage() {
		return ChartPackage.eINSTANCE;
	}

} //ChartFactoryImpl
