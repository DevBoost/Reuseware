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
package org.oasisopen.names.tc.opendocument.xmlns.table.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.oasisopen.names.tc.opendocument.xmlns.table.BodyType;
import org.oasisopen.names.tc.opendocument.xmlns.table.CalculationSettingsType;
import org.oasisopen.names.tc.opendocument.xmlns.table.CellAddressType;
import org.oasisopen.names.tc.opendocument.xmlns.table.CellContentChangeType;
import org.oasisopen.names.tc.opendocument.xmlns.table.CellContentDeletionType;
import org.oasisopen.names.tc.opendocument.xmlns.table.CellRangeSourceType;
import org.oasisopen.names.tc.opendocument.xmlns.table.ChangeDeletionType;
import org.oasisopen.names.tc.opendocument.xmlns.table.ChangeTrackTableCellType;
import org.oasisopen.names.tc.opendocument.xmlns.table.ConsolidationType;
import org.oasisopen.names.tc.opendocument.xmlns.table.ContentValidationType;
import org.oasisopen.names.tc.opendocument.xmlns.table.ContentValidationsType;
import org.oasisopen.names.tc.opendocument.xmlns.table.CoveredTableCellType;
import org.oasisopen.names.tc.opendocument.xmlns.table.CutOffsType;
import org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotDisplayInfoType;
import org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotFieldReferenceType;
import org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotFieldType;
import org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotGroupMemberType;
import org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotGroupType;
import org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotGroupsType;
import org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotLayoutInfoType;
import org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotLevelType;
import org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotMemberType;
import org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotMembersType;
import org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotSortInfoType;
import org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotSubtotalType;
import org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotSubtotalsType;
import org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotTableType;
import org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotTablesType;
import org.oasisopen.names.tc.opendocument.xmlns.table.DatabaseRangeType;
import org.oasisopen.names.tc.opendocument.xmlns.table.DatabaseRangesType;
import org.oasisopen.names.tc.opendocument.xmlns.table.DatabaseSourceQueryType;
import org.oasisopen.names.tc.opendocument.xmlns.table.DatabaseSourceSqlType;
import org.oasisopen.names.tc.opendocument.xmlns.table.DatabaseSourceTableType;
import org.oasisopen.names.tc.opendocument.xmlns.table.DdeLinkType;
import org.oasisopen.names.tc.opendocument.xmlns.table.DdeLinksType;
import org.oasisopen.names.tc.opendocument.xmlns.table.DeletionType;
import org.oasisopen.names.tc.opendocument.xmlns.table.DeletionsType;
import org.oasisopen.names.tc.opendocument.xmlns.table.DependenciesType;
import org.oasisopen.names.tc.opendocument.xmlns.table.DependencyType;
import org.oasisopen.names.tc.opendocument.xmlns.table.DetectiveType;
import org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot;
import org.oasisopen.names.tc.opendocument.xmlns.table.ErrorMacroType;
import org.oasisopen.names.tc.opendocument.xmlns.table.ErrorMessageType;
import org.oasisopen.names.tc.opendocument.xmlns.table.EvenColumnsType;
import org.oasisopen.names.tc.opendocument.xmlns.table.EvenRowsType;
import org.oasisopen.names.tc.opendocument.xmlns.table.FilterAndType;
import org.oasisopen.names.tc.opendocument.xmlns.table.FilterConditionType;
import org.oasisopen.names.tc.opendocument.xmlns.table.FilterOrType;
import org.oasisopen.names.tc.opendocument.xmlns.table.FilterType;
import org.oasisopen.names.tc.opendocument.xmlns.table.FirstColumnType;
import org.oasisopen.names.tc.opendocument.xmlns.table.FirstRowType;
import org.oasisopen.names.tc.opendocument.xmlns.table.HelpMessageType;
import org.oasisopen.names.tc.opendocument.xmlns.table.HighlightedRangeType;
import org.oasisopen.names.tc.opendocument.xmlns.table.InsertionCutOffType;
import org.oasisopen.names.tc.opendocument.xmlns.table.InsertionType;
import org.oasisopen.names.tc.opendocument.xmlns.table.IterationType;
import org.oasisopen.names.tc.opendocument.xmlns.table.LabelRangeType;
import org.oasisopen.names.tc.opendocument.xmlns.table.LabelRangesType;
import org.oasisopen.names.tc.opendocument.xmlns.table.LastColumnType;
import org.oasisopen.names.tc.opendocument.xmlns.table.LastRowType;
import org.oasisopen.names.tc.opendocument.xmlns.table.MovementCutOffType;
import org.oasisopen.names.tc.opendocument.xmlns.table.MovementType;
import org.oasisopen.names.tc.opendocument.xmlns.table.NamedExpressionType;
import org.oasisopen.names.tc.opendocument.xmlns.table.NamedExpressionsType;
import org.oasisopen.names.tc.opendocument.xmlns.table.NamedRangeType;
import org.oasisopen.names.tc.opendocument.xmlns.table.NullDateType;
import org.oasisopen.names.tc.opendocument.xmlns.table.OddColumnsType;
import org.oasisopen.names.tc.opendocument.xmlns.table.OddRowsType;
import org.oasisopen.names.tc.opendocument.xmlns.table.OperationType;
import org.oasisopen.names.tc.opendocument.xmlns.table.PreviousType;
import org.oasisopen.names.tc.opendocument.xmlns.table.ScenarioType;
import org.oasisopen.names.tc.opendocument.xmlns.table.ShapesType;
import org.oasisopen.names.tc.opendocument.xmlns.table.SortByType;
import org.oasisopen.names.tc.opendocument.xmlns.table.SortGroupsType;
import org.oasisopen.names.tc.opendocument.xmlns.table.SortType;
import org.oasisopen.names.tc.opendocument.xmlns.table.SourceCellRangeType;
import org.oasisopen.names.tc.opendocument.xmlns.table.SourceRangeAddressType;
import org.oasisopen.names.tc.opendocument.xmlns.table.SourceServiceType;
import org.oasisopen.names.tc.opendocument.xmlns.table.SubtotalFieldType;
import org.oasisopen.names.tc.opendocument.xmlns.table.SubtotalRuleType;
import org.oasisopen.names.tc.opendocument.xmlns.table.SubtotalRulesType;
import org.oasisopen.names.tc.opendocument.xmlns.table.TableCellType;
import org.oasisopen.names.tc.opendocument.xmlns.table.TableColumnGroupType;
import org.oasisopen.names.tc.opendocument.xmlns.table.TableColumnType;
import org.oasisopen.names.tc.opendocument.xmlns.table.TableColumnsType;
import org.oasisopen.names.tc.opendocument.xmlns.table.TableHeaderColumnsType;
import org.oasisopen.names.tc.opendocument.xmlns.table.TableHeaderRowsType;
import org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage;
import org.oasisopen.names.tc.opendocument.xmlns.table.TableRowGroupType;
import org.oasisopen.names.tc.opendocument.xmlns.table.TableRowType;
import org.oasisopen.names.tc.opendocument.xmlns.table.TableRowsType;
import org.oasisopen.names.tc.opendocument.xmlns.table.TableSourceType;
import org.oasisopen.names.tc.opendocument.xmlns.table.TableTemplateType;
import org.oasisopen.names.tc.opendocument.xmlns.table.TableType;
import org.oasisopen.names.tc.opendocument.xmlns.table.TargetRangeAddressType;
import org.oasisopen.names.tc.opendocument.xmlns.table.TrackedChangesType;
import org.oasisopen.names.tc.opendocument.xmlns.text.TableTableCellContent;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage
 * @generated
 */
public class TableAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TablePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TableAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = TablePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TableSwitch<Adapter> modelSwitch =
		new TableSwitch<Adapter>() {
			@Override
			public Adapter caseBodyType(BodyType object) {
				return createBodyTypeAdapter();
			}
			@Override
			public Adapter caseCalculationSettingsType(CalculationSettingsType object) {
				return createCalculationSettingsTypeAdapter();
			}
			@Override
			public Adapter caseCellAddressType(CellAddressType object) {
				return createCellAddressTypeAdapter();
			}
			@Override
			public Adapter caseCellContentChangeType(CellContentChangeType object) {
				return createCellContentChangeTypeAdapter();
			}
			@Override
			public Adapter caseCellContentDeletionType(CellContentDeletionType object) {
				return createCellContentDeletionTypeAdapter();
			}
			@Override
			public Adapter caseCellRangeSourceType(CellRangeSourceType object) {
				return createCellRangeSourceTypeAdapter();
			}
			@Override
			public Adapter caseChangeDeletionType(ChangeDeletionType object) {
				return createChangeDeletionTypeAdapter();
			}
			@Override
			public Adapter caseChangeTrackTableCellType(ChangeTrackTableCellType object) {
				return createChangeTrackTableCellTypeAdapter();
			}
			@Override
			public Adapter caseConsolidationType(ConsolidationType object) {
				return createConsolidationTypeAdapter();
			}
			@Override
			public Adapter caseContentValidationsType(ContentValidationsType object) {
				return createContentValidationsTypeAdapter();
			}
			@Override
			public Adapter caseContentValidationType(ContentValidationType object) {
				return createContentValidationTypeAdapter();
			}
			@Override
			public Adapter caseCoveredTableCellType(CoveredTableCellType object) {
				return createCoveredTableCellTypeAdapter();
			}
			@Override
			public Adapter caseCutOffsType(CutOffsType object) {
				return createCutOffsTypeAdapter();
			}
			@Override
			public Adapter caseDatabaseRangesType(DatabaseRangesType object) {
				return createDatabaseRangesTypeAdapter();
			}
			@Override
			public Adapter caseDatabaseRangeType(DatabaseRangeType object) {
				return createDatabaseRangeTypeAdapter();
			}
			@Override
			public Adapter caseDatabaseSourceQueryType(DatabaseSourceQueryType object) {
				return createDatabaseSourceQueryTypeAdapter();
			}
			@Override
			public Adapter caseDatabaseSourceSqlType(DatabaseSourceSqlType object) {
				return createDatabaseSourceSqlTypeAdapter();
			}
			@Override
			public Adapter caseDatabaseSourceTableType(DatabaseSourceTableType object) {
				return createDatabaseSourceTableTypeAdapter();
			}
			@Override
			public Adapter caseDataPilotDisplayInfoType(DataPilotDisplayInfoType object) {
				return createDataPilotDisplayInfoTypeAdapter();
			}
			@Override
			public Adapter caseDataPilotFieldReferenceType(DataPilotFieldReferenceType object) {
				return createDataPilotFieldReferenceTypeAdapter();
			}
			@Override
			public Adapter caseDataPilotFieldType(DataPilotFieldType object) {
				return createDataPilotFieldTypeAdapter();
			}
			@Override
			public Adapter caseDataPilotGroupMemberType(DataPilotGroupMemberType object) {
				return createDataPilotGroupMemberTypeAdapter();
			}
			@Override
			public Adapter caseDataPilotGroupsType(DataPilotGroupsType object) {
				return createDataPilotGroupsTypeAdapter();
			}
			@Override
			public Adapter caseDataPilotGroupType(DataPilotGroupType object) {
				return createDataPilotGroupTypeAdapter();
			}
			@Override
			public Adapter caseDataPilotLayoutInfoType(DataPilotLayoutInfoType object) {
				return createDataPilotLayoutInfoTypeAdapter();
			}
			@Override
			public Adapter caseDataPilotLevelType(DataPilotLevelType object) {
				return createDataPilotLevelTypeAdapter();
			}
			@Override
			public Adapter caseDataPilotMembersType(DataPilotMembersType object) {
				return createDataPilotMembersTypeAdapter();
			}
			@Override
			public Adapter caseDataPilotMemberType(DataPilotMemberType object) {
				return createDataPilotMemberTypeAdapter();
			}
			@Override
			public Adapter caseDataPilotSortInfoType(DataPilotSortInfoType object) {
				return createDataPilotSortInfoTypeAdapter();
			}
			@Override
			public Adapter caseDataPilotSubtotalsType(DataPilotSubtotalsType object) {
				return createDataPilotSubtotalsTypeAdapter();
			}
			@Override
			public Adapter caseDataPilotSubtotalType(DataPilotSubtotalType object) {
				return createDataPilotSubtotalTypeAdapter();
			}
			@Override
			public Adapter caseDataPilotTablesType(DataPilotTablesType object) {
				return createDataPilotTablesTypeAdapter();
			}
			@Override
			public Adapter caseDataPilotTableType(DataPilotTableType object) {
				return createDataPilotTableTypeAdapter();
			}
			@Override
			public Adapter caseDdeLinksType(DdeLinksType object) {
				return createDdeLinksTypeAdapter();
			}
			@Override
			public Adapter caseDdeLinkType(DdeLinkType object) {
				return createDdeLinkTypeAdapter();
			}
			@Override
			public Adapter caseDeletionsType(DeletionsType object) {
				return createDeletionsTypeAdapter();
			}
			@Override
			public Adapter caseDeletionType(DeletionType object) {
				return createDeletionTypeAdapter();
			}
			@Override
			public Adapter caseDependenciesType(DependenciesType object) {
				return createDependenciesTypeAdapter();
			}
			@Override
			public Adapter caseDependencyType(DependencyType object) {
				return createDependencyTypeAdapter();
			}
			@Override
			public Adapter caseDetectiveType(DetectiveType object) {
				return createDetectiveTypeAdapter();
			}
			@Override
			public Adapter caseErrorMacroType(ErrorMacroType object) {
				return createErrorMacroTypeAdapter();
			}
			@Override
			public Adapter caseErrorMessageType(ErrorMessageType object) {
				return createErrorMessageTypeAdapter();
			}
			@Override
			public Adapter caseEvenColumnsType(EvenColumnsType object) {
				return createEvenColumnsTypeAdapter();
			}
			@Override
			public Adapter caseEvenRowsType(EvenRowsType object) {
				return createEvenRowsTypeAdapter();
			}
			@Override
			public Adapter caseFilterAndType(FilterAndType object) {
				return createFilterAndTypeAdapter();
			}
			@Override
			public Adapter caseFilterConditionType(FilterConditionType object) {
				return createFilterConditionTypeAdapter();
			}
			@Override
			public Adapter caseFilterOrType(FilterOrType object) {
				return createFilterOrTypeAdapter();
			}
			@Override
			public Adapter caseFilterType(FilterType object) {
				return createFilterTypeAdapter();
			}
			@Override
			public Adapter caseFirstColumnType(FirstColumnType object) {
				return createFirstColumnTypeAdapter();
			}
			@Override
			public Adapter caseFirstRowType(FirstRowType object) {
				return createFirstRowTypeAdapter();
			}
			@Override
			public Adapter caseHelpMessageType(HelpMessageType object) {
				return createHelpMessageTypeAdapter();
			}
			@Override
			public Adapter caseHighlightedRangeType(HighlightedRangeType object) {
				return createHighlightedRangeTypeAdapter();
			}
			@Override
			public Adapter caseInsertionCutOffType(InsertionCutOffType object) {
				return createInsertionCutOffTypeAdapter();
			}
			@Override
			public Adapter caseInsertionType(InsertionType object) {
				return createInsertionTypeAdapter();
			}
			@Override
			public Adapter caseIterationType(IterationType object) {
				return createIterationTypeAdapter();
			}
			@Override
			public Adapter caseLabelRangesType(LabelRangesType object) {
				return createLabelRangesTypeAdapter();
			}
			@Override
			public Adapter caseLabelRangeType(LabelRangeType object) {
				return createLabelRangeTypeAdapter();
			}
			@Override
			public Adapter caseLastColumnType(LastColumnType object) {
				return createLastColumnTypeAdapter();
			}
			@Override
			public Adapter caseLastRowType(LastRowType object) {
				return createLastRowTypeAdapter();
			}
			@Override
			public Adapter caseMovementCutOffType(MovementCutOffType object) {
				return createMovementCutOffTypeAdapter();
			}
			@Override
			public Adapter caseMovementType(MovementType object) {
				return createMovementTypeAdapter();
			}
			@Override
			public Adapter caseNamedExpressionsType(NamedExpressionsType object) {
				return createNamedExpressionsTypeAdapter();
			}
			@Override
			public Adapter caseNamedExpressionType(NamedExpressionType object) {
				return createNamedExpressionTypeAdapter();
			}
			@Override
			public Adapter caseNamedRangeType(NamedRangeType object) {
				return createNamedRangeTypeAdapter();
			}
			@Override
			public Adapter caseNullDateType(NullDateType object) {
				return createNullDateTypeAdapter();
			}
			@Override
			public Adapter caseOddColumnsType(OddColumnsType object) {
				return createOddColumnsTypeAdapter();
			}
			@Override
			public Adapter caseOddRowsType(OddRowsType object) {
				return createOddRowsTypeAdapter();
			}
			@Override
			public Adapter caseOperationType(OperationType object) {
				return createOperationTypeAdapter();
			}
			@Override
			public Adapter casePreviousType(PreviousType object) {
				return createPreviousTypeAdapter();
			}
			@Override
			public Adapter caseScenarioType(ScenarioType object) {
				return createScenarioTypeAdapter();
			}
			@Override
			public Adapter caseShapesType(ShapesType object) {
				return createShapesTypeAdapter();
			}
			@Override
			public Adapter caseSortByType(SortByType object) {
				return createSortByTypeAdapter();
			}
			@Override
			public Adapter caseSortGroupsType(SortGroupsType object) {
				return createSortGroupsTypeAdapter();
			}
			@Override
			public Adapter caseSortType(SortType object) {
				return createSortTypeAdapter();
			}
			@Override
			public Adapter caseSourceCellRangeType(SourceCellRangeType object) {
				return createSourceCellRangeTypeAdapter();
			}
			@Override
			public Adapter caseSourceRangeAddressType(SourceRangeAddressType object) {
				return createSourceRangeAddressTypeAdapter();
			}
			@Override
			public Adapter caseSourceServiceType(SourceServiceType object) {
				return createSourceServiceTypeAdapter();
			}
			@Override
			public Adapter caseSubtotalFieldType(SubtotalFieldType object) {
				return createSubtotalFieldTypeAdapter();
			}
			@Override
			public Adapter caseSubtotalRulesType(SubtotalRulesType object) {
				return createSubtotalRulesTypeAdapter();
			}
			@Override
			public Adapter caseSubtotalRuleType(SubtotalRuleType object) {
				return createSubtotalRuleTypeAdapter();
			}
			@Override
			public Adapter caseTableCellType(TableCellType object) {
				return createTableCellTypeAdapter();
			}
			@Override
			public Adapter caseTableColumnGroupType(TableColumnGroupType object) {
				return createTableColumnGroupTypeAdapter();
			}
			@Override
			public Adapter caseTableColumnsType(TableColumnsType object) {
				return createTableColumnsTypeAdapter();
			}
			@Override
			public Adapter caseTableColumnType(TableColumnType object) {
				return createTableColumnTypeAdapter();
			}
			@Override
			public Adapter caseTableHeaderColumnsType(TableHeaderColumnsType object) {
				return createTableHeaderColumnsTypeAdapter();
			}
			@Override
			public Adapter caseTableHeaderRowsType(TableHeaderRowsType object) {
				return createTableHeaderRowsTypeAdapter();
			}
			@Override
			public Adapter caseTableRowGroupType(TableRowGroupType object) {
				return createTableRowGroupTypeAdapter();
			}
			@Override
			public Adapter caseTableRowsType(TableRowsType object) {
				return createTableRowsTypeAdapter();
			}
			@Override
			public Adapter caseTableRowType(TableRowType object) {
				return createTableRowTypeAdapter();
			}
			@Override
			public Adapter caseTableSourceType(TableSourceType object) {
				return createTableSourceTypeAdapter();
			}
			@Override
			public Adapter caseTableType(TableType object) {
				return createTableTypeAdapter();
			}
			@Override
			public Adapter caseDocumentRoot(DocumentRoot object) {
				return createDocumentRootAdapter();
			}
			@Override
			public Adapter caseTableTemplateType(TableTemplateType object) {
				return createTableTemplateTypeAdapter();
			}
			@Override
			public Adapter caseTargetRangeAddressType(TargetRangeAddressType object) {
				return createTargetRangeAddressTypeAdapter();
			}
			@Override
			public Adapter caseTrackedChangesType(TrackedChangesType object) {
				return createTrackedChangesTypeAdapter();
			}
			@Override
			public Adapter caseTableTableCellContent(TableTableCellContent object) {
				return createTableTableCellContentAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.table.BodyType <em>Body Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.BodyType
	 * @generated
	 */
	public Adapter createBodyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.table.CalculationSettingsType <em>Calculation Settings Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.CalculationSettingsType
	 * @generated
	 */
	public Adapter createCalculationSettingsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.table.CellAddressType <em>Cell Address Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.CellAddressType
	 * @generated
	 */
	public Adapter createCellAddressTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.table.CellContentChangeType <em>Cell Content Change Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.CellContentChangeType
	 * @generated
	 */
	public Adapter createCellContentChangeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.table.CellContentDeletionType <em>Cell Content Deletion Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.CellContentDeletionType
	 * @generated
	 */
	public Adapter createCellContentDeletionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.table.CellRangeSourceType <em>Cell Range Source Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.CellRangeSourceType
	 * @generated
	 */
	public Adapter createCellRangeSourceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.table.ChangeDeletionType <em>Change Deletion Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.ChangeDeletionType
	 * @generated
	 */
	public Adapter createChangeDeletionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.table.ChangeTrackTableCellType <em>Change Track Table Cell Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.ChangeTrackTableCellType
	 * @generated
	 */
	public Adapter createChangeTrackTableCellTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.table.ConsolidationType <em>Consolidation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.ConsolidationType
	 * @generated
	 */
	public Adapter createConsolidationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.table.ContentValidationsType <em>Content Validations Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.ContentValidationsType
	 * @generated
	 */
	public Adapter createContentValidationsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.table.ContentValidationType <em>Content Validation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.ContentValidationType
	 * @generated
	 */
	public Adapter createContentValidationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.table.CoveredTableCellType <em>Covered Table Cell Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.CoveredTableCellType
	 * @generated
	 */
	public Adapter createCoveredTableCellTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.table.CutOffsType <em>Cut Offs Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.CutOffsType
	 * @generated
	 */
	public Adapter createCutOffsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DatabaseRangesType <em>Database Ranges Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DatabaseRangesType
	 * @generated
	 */
	public Adapter createDatabaseRangesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DatabaseRangeType <em>Database Range Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DatabaseRangeType
	 * @generated
	 */
	public Adapter createDatabaseRangeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DatabaseSourceQueryType <em>Database Source Query Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DatabaseSourceQueryType
	 * @generated
	 */
	public Adapter createDatabaseSourceQueryTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DatabaseSourceSqlType <em>Database Source Sql Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DatabaseSourceSqlType
	 * @generated
	 */
	public Adapter createDatabaseSourceSqlTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DatabaseSourceTableType <em>Database Source Table Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DatabaseSourceTableType
	 * @generated
	 */
	public Adapter createDatabaseSourceTableTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotDisplayInfoType <em>Data Pilot Display Info Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotDisplayInfoType
	 * @generated
	 */
	public Adapter createDataPilotDisplayInfoTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotFieldReferenceType <em>Data Pilot Field Reference Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotFieldReferenceType
	 * @generated
	 */
	public Adapter createDataPilotFieldReferenceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotFieldType <em>Data Pilot Field Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotFieldType
	 * @generated
	 */
	public Adapter createDataPilotFieldTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotGroupMemberType <em>Data Pilot Group Member Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotGroupMemberType
	 * @generated
	 */
	public Adapter createDataPilotGroupMemberTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotGroupsType <em>Data Pilot Groups Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotGroupsType
	 * @generated
	 */
	public Adapter createDataPilotGroupsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotGroupType <em>Data Pilot Group Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotGroupType
	 * @generated
	 */
	public Adapter createDataPilotGroupTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotLayoutInfoType <em>Data Pilot Layout Info Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotLayoutInfoType
	 * @generated
	 */
	public Adapter createDataPilotLayoutInfoTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotLevelType <em>Data Pilot Level Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotLevelType
	 * @generated
	 */
	public Adapter createDataPilotLevelTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotMembersType <em>Data Pilot Members Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotMembersType
	 * @generated
	 */
	public Adapter createDataPilotMembersTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotMemberType <em>Data Pilot Member Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotMemberType
	 * @generated
	 */
	public Adapter createDataPilotMemberTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotSortInfoType <em>Data Pilot Sort Info Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotSortInfoType
	 * @generated
	 */
	public Adapter createDataPilotSortInfoTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotSubtotalsType <em>Data Pilot Subtotals Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotSubtotalsType
	 * @generated
	 */
	public Adapter createDataPilotSubtotalsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotSubtotalType <em>Data Pilot Subtotal Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotSubtotalType
	 * @generated
	 */
	public Adapter createDataPilotSubtotalTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotTablesType <em>Data Pilot Tables Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotTablesType
	 * @generated
	 */
	public Adapter createDataPilotTablesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotTableType <em>Data Pilot Table Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotTableType
	 * @generated
	 */
	public Adapter createDataPilotTableTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DdeLinksType <em>Dde Links Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DdeLinksType
	 * @generated
	 */
	public Adapter createDdeLinksTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DdeLinkType <em>Dde Link Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DdeLinkType
	 * @generated
	 */
	public Adapter createDdeLinkTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DeletionsType <em>Deletions Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DeletionsType
	 * @generated
	 */
	public Adapter createDeletionsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DeletionType <em>Deletion Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DeletionType
	 * @generated
	 */
	public Adapter createDeletionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DependenciesType <em>Dependencies Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DependenciesType
	 * @generated
	 */
	public Adapter createDependenciesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DependencyType <em>Dependency Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DependencyType
	 * @generated
	 */
	public Adapter createDependencyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DetectiveType <em>Detective Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DetectiveType
	 * @generated
	 */
	public Adapter createDetectiveTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.table.ErrorMacroType <em>Error Macro Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.ErrorMacroType
	 * @generated
	 */
	public Adapter createErrorMacroTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.table.ErrorMessageType <em>Error Message Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.ErrorMessageType
	 * @generated
	 */
	public Adapter createErrorMessageTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.table.EvenColumnsType <em>Even Columns Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.EvenColumnsType
	 * @generated
	 */
	public Adapter createEvenColumnsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.table.EvenRowsType <em>Even Rows Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.EvenRowsType
	 * @generated
	 */
	public Adapter createEvenRowsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.table.FilterAndType <em>Filter And Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.FilterAndType
	 * @generated
	 */
	public Adapter createFilterAndTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.table.FilterConditionType <em>Filter Condition Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.FilterConditionType
	 * @generated
	 */
	public Adapter createFilterConditionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.table.FilterOrType <em>Filter Or Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.FilterOrType
	 * @generated
	 */
	public Adapter createFilterOrTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.table.FilterType <em>Filter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.FilterType
	 * @generated
	 */
	public Adapter createFilterTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.table.FirstColumnType <em>First Column Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.FirstColumnType
	 * @generated
	 */
	public Adapter createFirstColumnTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.table.FirstRowType <em>First Row Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.FirstRowType
	 * @generated
	 */
	public Adapter createFirstRowTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.table.HelpMessageType <em>Help Message Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.HelpMessageType
	 * @generated
	 */
	public Adapter createHelpMessageTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.table.HighlightedRangeType <em>Highlighted Range Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.HighlightedRangeType
	 * @generated
	 */
	public Adapter createHighlightedRangeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.table.InsertionCutOffType <em>Insertion Cut Off Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.InsertionCutOffType
	 * @generated
	 */
	public Adapter createInsertionCutOffTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.table.InsertionType <em>Insertion Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.InsertionType
	 * @generated
	 */
	public Adapter createInsertionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.table.IterationType <em>Iteration Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.IterationType
	 * @generated
	 */
	public Adapter createIterationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.table.LabelRangesType <em>Label Ranges Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.LabelRangesType
	 * @generated
	 */
	public Adapter createLabelRangesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.table.LabelRangeType <em>Label Range Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.LabelRangeType
	 * @generated
	 */
	public Adapter createLabelRangeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.table.LastColumnType <em>Last Column Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.LastColumnType
	 * @generated
	 */
	public Adapter createLastColumnTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.table.LastRowType <em>Last Row Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.LastRowType
	 * @generated
	 */
	public Adapter createLastRowTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.table.MovementCutOffType <em>Movement Cut Off Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.MovementCutOffType
	 * @generated
	 */
	public Adapter createMovementCutOffTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.table.MovementType <em>Movement Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.MovementType
	 * @generated
	 */
	public Adapter createMovementTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.table.NamedExpressionsType <em>Named Expressions Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.NamedExpressionsType
	 * @generated
	 */
	public Adapter createNamedExpressionsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.table.NamedExpressionType <em>Named Expression Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.NamedExpressionType
	 * @generated
	 */
	public Adapter createNamedExpressionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.table.NamedRangeType <em>Named Range Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.NamedRangeType
	 * @generated
	 */
	public Adapter createNamedRangeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.table.NullDateType <em>Null Date Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.NullDateType
	 * @generated
	 */
	public Adapter createNullDateTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.table.OddColumnsType <em>Odd Columns Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.OddColumnsType
	 * @generated
	 */
	public Adapter createOddColumnsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.table.OddRowsType <em>Odd Rows Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.OddRowsType
	 * @generated
	 */
	public Adapter createOddRowsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.table.OperationType <em>Operation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.OperationType
	 * @generated
	 */
	public Adapter createOperationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.table.PreviousType <em>Previous Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.PreviousType
	 * @generated
	 */
	public Adapter createPreviousTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.table.ScenarioType <em>Scenario Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.ScenarioType
	 * @generated
	 */
	public Adapter createScenarioTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.table.ShapesType <em>Shapes Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.ShapesType
	 * @generated
	 */
	public Adapter createShapesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.table.SortByType <em>Sort By Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.SortByType
	 * @generated
	 */
	public Adapter createSortByTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.table.SortGroupsType <em>Sort Groups Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.SortGroupsType
	 * @generated
	 */
	public Adapter createSortGroupsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.table.SortType <em>Sort Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.SortType
	 * @generated
	 */
	public Adapter createSortTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.table.SourceCellRangeType <em>Source Cell Range Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.SourceCellRangeType
	 * @generated
	 */
	public Adapter createSourceCellRangeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.table.SourceRangeAddressType <em>Source Range Address Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.SourceRangeAddressType
	 * @generated
	 */
	public Adapter createSourceRangeAddressTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.table.SourceServiceType <em>Source Service Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.SourceServiceType
	 * @generated
	 */
	public Adapter createSourceServiceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.table.SubtotalFieldType <em>Subtotal Field Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.SubtotalFieldType
	 * @generated
	 */
	public Adapter createSubtotalFieldTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.table.SubtotalRulesType <em>Subtotal Rules Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.SubtotalRulesType
	 * @generated
	 */
	public Adapter createSubtotalRulesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.table.SubtotalRuleType <em>Subtotal Rule Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.SubtotalRuleType
	 * @generated
	 */
	public Adapter createSubtotalRuleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableCellType <em>Cell Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TableCellType
	 * @generated
	 */
	public Adapter createTableCellTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableColumnGroupType <em>Column Group Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TableColumnGroupType
	 * @generated
	 */
	public Adapter createTableColumnGroupTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableColumnsType <em>Columns Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TableColumnsType
	 * @generated
	 */
	public Adapter createTableColumnsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableColumnType <em>Column Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TableColumnType
	 * @generated
	 */
	public Adapter createTableColumnTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableHeaderColumnsType <em>Header Columns Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TableHeaderColumnsType
	 * @generated
	 */
	public Adapter createTableHeaderColumnsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableHeaderRowsType <em>Header Rows Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TableHeaderRowsType
	 * @generated
	 */
	public Adapter createTableHeaderRowsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableRowGroupType <em>Row Group Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TableRowGroupType
	 * @generated
	 */
	public Adapter createTableRowGroupTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableRowsType <em>Rows Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TableRowsType
	 * @generated
	 */
	public Adapter createTableRowsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableRowType <em>Row Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TableRowType
	 * @generated
	 */
	public Adapter createTableRowTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableSourceType <em>Source Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TableSourceType
	 * @generated
	 */
	public Adapter createTableSourceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TableType
	 * @generated
	 */
	public Adapter createTableTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableTemplateType <em>Template Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TableTemplateType
	 * @generated
	 */
	public Adapter createTableTemplateTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TargetRangeAddressType <em>Target Range Address Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TargetRangeAddressType
	 * @generated
	 */
	public Adapter createTargetRangeAddressTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TrackedChangesType <em>Tracked Changes Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TrackedChangesType
	 * @generated
	 */
	public Adapter createTrackedChangesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.text.TableTableCellContent <em>Table Table Cell Content</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TableTableCellContent
	 * @generated
	 */
	public Adapter createTableTableCellContentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //TableAdapterFactory
