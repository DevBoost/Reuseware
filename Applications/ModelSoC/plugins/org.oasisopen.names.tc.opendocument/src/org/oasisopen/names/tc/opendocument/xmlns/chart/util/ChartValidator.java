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
package org.oasisopen.names.tc.opendocument.xmlns.chart.util;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.emf.ecore.xml.type.util.XMLTypeValidator;
import org.oasisopen.names.tc.opendocument.xmlns.chart.AxisType;
import org.oasisopen.names.tc.opendocument.xmlns.chart.CategoriesType;
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
import org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage;
import org.oasisopen.names.tc.opendocument.xmlns.text.util.TextValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.ChartPackage
 * @generated
 */
public class ChartValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final ChartValidator INSTANCE = new ChartValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.oasisopen.names.tc.opendocument.xmlns.chart";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TextValidator textValidator;

	/**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XMLTypeValidator xmlTypeValidator;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChartValidator() {
		super();
		textValidator = TextValidator.INSTANCE;
		xmlTypeValidator = XMLTypeValidator.INSTANCE;
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return ChartPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case ChartPackage.AXIS_TYPE:
				return validateAxisType((AxisType)value, diagnostics, context);
			case ChartPackage.CATEGORIES_TYPE:
				return validateCategoriesType((CategoriesType)value, diagnostics, context);
			case ChartPackage.DATA_POINT_TYPE:
				return validateDataPointType((DataPointType)value, diagnostics, context);
			case ChartPackage.DOCUMENT_ROOT:
				return validateDocumentRoot((DocumentRoot)value, diagnostics, context);
			case ChartPackage.DOMAIN_TYPE:
				return validateDomainType((DomainType)value, diagnostics, context);
			case ChartPackage.ERROR_INDICATOR_TYPE:
				return validateErrorIndicatorType((ErrorIndicatorType)value, diagnostics, context);
			case ChartPackage.FLOOR_TYPE:
				return validateFloorType((FloorType)value, diagnostics, context);
			case ChartPackage.FOOTER_TYPE:
				return validateFooterType((FooterType)value, diagnostics, context);
			case ChartPackage.GRID_TYPE:
				return validateGridType((GridType)value, diagnostics, context);
			case ChartPackage.LEGEND_TYPE:
				return validateLegendType((LegendType)value, diagnostics, context);
			case ChartPackage.MEAN_VALUE_TYPE:
				return validateMeanValueType((MeanValueType)value, diagnostics, context);
			case ChartPackage.PLOT_AREA_TYPE:
				return validatePlotAreaType((PlotAreaType)value, diagnostics, context);
			case ChartPackage.REGRESSION_CURVE_TYPE:
				return validateRegressionCurveType((RegressionCurveType)value, diagnostics, context);
			case ChartPackage.SERIES_TYPE:
				return validateSeriesType((SeriesType)value, diagnostics, context);
			case ChartPackage.STOCK_GAIN_MARKER_TYPE:
				return validateStockGainMarkerType((StockGainMarkerType)value, diagnostics, context);
			case ChartPackage.STOCK_LOSS_MARKER_TYPE:
				return validateStockLossMarkerType((StockLossMarkerType)value, diagnostics, context);
			case ChartPackage.STOCK_RANGE_LINE_TYPE:
				return validateStockRangeLineType((StockRangeLineType)value, diagnostics, context);
			case ChartPackage.SUBTITLE_TYPE:
				return validateSubtitleType((SubtitleType)value, diagnostics, context);
			case ChartPackage.SYMBOL_IMAGE_TYPE:
				return validateSymbolImageType((SymbolImageType)value, diagnostics, context);
			case ChartPackage.TITLE_TYPE:
				return validateTitleType((TitleType)value, diagnostics, context);
			case ChartPackage.WALL_TYPE:
				return validateWallType((WallType)value, diagnostics, context);
			case ChartPackage.CLASS_TYPE:
				return validateClassType((ClassType)value, diagnostics, context);
			case ChartPackage.DATA_LABEL_NUMBER_TYPE:
				return validateDataLabelNumberType((DataLabelNumberType)value, diagnostics, context);
			case ChartPackage.DATA_SOURCE_HAS_LABELS_TYPE:
				return validateDataSourceHasLabelsType((DataSourceHasLabelsType)value, diagnostics, context);
			case ChartPackage.DIMENSION_TYPE:
				return validateDimensionType((DimensionType)value, diagnostics, context);
			case ChartPackage.ERROR_CATEGORY_TYPE:
				return validateErrorCategoryType((ErrorCategoryType)value, diagnostics, context);
			case ChartPackage.INTERPOLATION_TYPE:
				return validateInterpolationType((InterpolationType)value, diagnostics, context);
			case ChartPackage.LABEL_ARRANGEMENT_TYPE:
				return validateLabelArrangementType((LabelArrangementType)value, diagnostics, context);
			case ChartPackage.LEGEND_ALIGN_TYPE:
				return validateLegendAlignType((LegendAlignType)value, diagnostics, context);
			case ChartPackage.LEGEND_POSITION_TYPE:
				return validateLegendPositionType((LegendPositionType)value, diagnostics, context);
			case ChartPackage.REGRESSION_TYPE_TYPE:
				return validateRegressionTypeType((RegressionTypeType)value, diagnostics, context);
			case ChartPackage.SERIES_SOURCE_TYPE:
				return validateSeriesSourceType((SeriesSourceType)value, diagnostics, context);
			case ChartPackage.SOLID_TYPE_TYPE:
				return validateSolidTypeType((SolidTypeType)value, diagnostics, context);
			case ChartPackage.SYMBOL_NAME_TYPE:
				return validateSymbolNameType((SymbolNameType)value, diagnostics, context);
			case ChartPackage.SYMBOL_TYPE_TYPE:
				return validateSymbolTypeType((SymbolTypeType)value, diagnostics, context);
			case ChartPackage.CLASS_TYPE_OBJECT:
				return validateClassTypeObject((ClassType)value, diagnostics, context);
			case ChartPackage.DATA_LABEL_NUMBER_TYPE_OBJECT:
				return validateDataLabelNumberTypeObject((DataLabelNumberType)value, diagnostics, context);
			case ChartPackage.DATA_SOURCE_HAS_LABELS_TYPE_OBJECT:
				return validateDataSourceHasLabelsTypeObject((DataSourceHasLabelsType)value, diagnostics, context);
			case ChartPackage.DIMENSION_TYPE_OBJECT:
				return validateDimensionTypeObject((DimensionType)value, diagnostics, context);
			case ChartPackage.ERROR_CATEGORY_TYPE_OBJECT:
				return validateErrorCategoryTypeObject((ErrorCategoryType)value, diagnostics, context);
			case ChartPackage.INTERPOLATION_TYPE_OBJECT:
				return validateInterpolationTypeObject((InterpolationType)value, diagnostics, context);
			case ChartPackage.LABEL_ARRANGEMENT_TYPE_OBJECT:
				return validateLabelArrangementTypeObject((LabelArrangementType)value, diagnostics, context);
			case ChartPackage.LEGEND_ALIGN_TYPE_OBJECT:
				return validateLegendAlignTypeObject((LegendAlignType)value, diagnostics, context);
			case ChartPackage.LEGEND_POSITION_TYPE_OBJECT:
				return validateLegendPositionTypeObject((LegendPositionType)value, diagnostics, context);
			case ChartPackage.REGRESSION_TYPE_TYPE_OBJECT:
				return validateRegressionTypeTypeObject((RegressionTypeType)value, diagnostics, context);
			case ChartPackage.SERIES_SOURCE_TYPE_OBJECT:
				return validateSeriesSourceTypeObject((SeriesSourceType)value, diagnostics, context);
			case ChartPackage.SOLID_TYPE_TYPE_OBJECT:
				return validateSolidTypeTypeObject((SolidTypeType)value, diagnostics, context);
			case ChartPackage.STYLE_NAME_TYPE:
				return validateStyleNameType((String)value, diagnostics, context);
			case ChartPackage.STYLE_NAME_TYPE_MEMBER1:
				return validateStyleNameTypeMember1((String)value, diagnostics, context);
			case ChartPackage.SYMBOL_NAME_TYPE_OBJECT:
				return validateSymbolNameTypeObject((SymbolNameType)value, diagnostics, context);
			case ChartPackage.SYMBOL_TYPE_TYPE_OBJECT:
				return validateSymbolTypeTypeObject((SymbolTypeType)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAxisType(AxisType axisType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(axisType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCategoriesType(CategoriesType categoriesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(categoriesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataPointType(DataPointType dataPointType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dataPointType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentRoot(DocumentRoot documentRoot, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(documentRoot, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDomainType(DomainType domainType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(domainType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateErrorIndicatorType(ErrorIndicatorType errorIndicatorType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(errorIndicatorType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFloorType(FloorType floorType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(floorType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFooterType(FooterType footerType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(footerType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGridType(GridType gridType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(gridType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLegendType(LegendType legendType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(legendType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeanValueType(MeanValueType meanValueType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(meanValueType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlotAreaType(PlotAreaType plotAreaType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(plotAreaType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRegressionCurveType(RegressionCurveType regressionCurveType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(regressionCurveType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSeriesType(SeriesType seriesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(seriesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStockGainMarkerType(StockGainMarkerType stockGainMarkerType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(stockGainMarkerType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStockLossMarkerType(StockLossMarkerType stockLossMarkerType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(stockLossMarkerType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStockRangeLineType(StockRangeLineType stockRangeLineType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(stockRangeLineType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubtitleType(SubtitleType subtitleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(subtitleType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSymbolImageType(SymbolImageType symbolImageType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(symbolImageType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTitleType(TitleType titleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(titleType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWallType(WallType wallType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(wallType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClassType(ClassType classType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataLabelNumberType(DataLabelNumberType dataLabelNumberType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataSourceHasLabelsType(DataSourceHasLabelsType dataSourceHasLabelsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDimensionType(DimensionType dimensionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateErrorCategoryType(ErrorCategoryType errorCategoryType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterpolationType(InterpolationType interpolationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLabelArrangementType(LabelArrangementType labelArrangementType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLegendAlignType(LegendAlignType legendAlignType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLegendPositionType(LegendPositionType legendPositionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRegressionTypeType(RegressionTypeType regressionTypeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSeriesSourceType(SeriesSourceType seriesSourceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSolidTypeType(SolidTypeType solidTypeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSymbolNameType(SymbolNameType symbolNameType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSymbolTypeType(SymbolTypeType symbolTypeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClassTypeObject(ClassType classTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataLabelNumberTypeObject(DataLabelNumberType dataLabelNumberTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataSourceHasLabelsTypeObject(DataSourceHasLabelsType dataSourceHasLabelsTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDimensionTypeObject(DimensionType dimensionTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateErrorCategoryTypeObject(ErrorCategoryType errorCategoryTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterpolationTypeObject(InterpolationType interpolationTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLabelArrangementTypeObject(LabelArrangementType labelArrangementTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLegendAlignTypeObject(LegendAlignType legendAlignTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLegendPositionTypeObject(LegendPositionType legendPositionTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRegressionTypeTypeObject(RegressionTypeType regressionTypeTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSeriesSourceTypeObject(SeriesSourceType seriesSourceTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSolidTypeTypeObject(SolidTypeType solidTypeTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStyleNameType(String styleNameType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateStyleNameType_MemberTypes(styleNameType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Style Name Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStyleNameType_MemberTypes(String styleNameType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (TextPackage.eINSTANCE.getStyleNameRef().isInstance(styleNameType)) {
				if (textValidator.validateStyleNameRef(styleNameType, tempDiagnostics, context)) return true;
			}
			if (ChartPackage.Literals.STYLE_NAME_TYPE_MEMBER1.isInstance(styleNameType)) {
				if (validateStyleNameTypeMember1(styleNameType, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (TextPackage.eINSTANCE.getStyleNameRef().isInstance(styleNameType)) {
				if (textValidator.validateStyleNameRef(styleNameType, null, context)) return true;
			}
			if (ChartPackage.Literals.STYLE_NAME_TYPE_MEMBER1.isInstance(styleNameType)) {
				if (validateStyleNameTypeMember1(styleNameType, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStyleNameTypeMember1(String styleNameTypeMember1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateStyleNameTypeMember1_MinLength(styleNameTypeMember1, diagnostics, context);
		if (result || diagnostics != null) result &= validateStyleNameTypeMember1_MaxLength(styleNameTypeMember1, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>Style Name Type Member1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStyleNameTypeMember1_MinLength(String styleNameTypeMember1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = styleNameTypeMember1.length();
		boolean result = length >= 0;
		if (!result && diagnostics != null)
			reportMinLengthViolation(ChartPackage.Literals.STYLE_NAME_TYPE_MEMBER1, styleNameTypeMember1, length, 0, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Style Name Type Member1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStyleNameTypeMember1_MaxLength(String styleNameTypeMember1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = styleNameTypeMember1.length();
		boolean result = length <= 0;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(ChartPackage.Literals.STYLE_NAME_TYPE_MEMBER1, styleNameTypeMember1, length, 0, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSymbolNameTypeObject(SymbolNameType symbolNameTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSymbolTypeTypeObject(SymbolTypeType symbolTypeTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //ChartValidator
