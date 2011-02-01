/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.table.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
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
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage
 * @generated
 */
public class TableSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TablePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TableSwitch() {
		if (modelPackage == null) {
			modelPackage = TablePackage.eINSTANCE;
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
			case TablePackage.BODY_TYPE: {
				BodyType bodyType = (BodyType)theEObject;
				T result = caseBodyType(bodyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TablePackage.CALCULATION_SETTINGS_TYPE: {
				CalculationSettingsType calculationSettingsType = (CalculationSettingsType)theEObject;
				T result = caseCalculationSettingsType(calculationSettingsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TablePackage.CELL_ADDRESS_TYPE: {
				CellAddressType cellAddressType = (CellAddressType)theEObject;
				T result = caseCellAddressType(cellAddressType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TablePackage.CELL_CONTENT_CHANGE_TYPE: {
				CellContentChangeType cellContentChangeType = (CellContentChangeType)theEObject;
				T result = caseCellContentChangeType(cellContentChangeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TablePackage.CELL_CONTENT_DELETION_TYPE: {
				CellContentDeletionType cellContentDeletionType = (CellContentDeletionType)theEObject;
				T result = caseCellContentDeletionType(cellContentDeletionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TablePackage.CELL_RANGE_SOURCE_TYPE: {
				CellRangeSourceType cellRangeSourceType = (CellRangeSourceType)theEObject;
				T result = caseCellRangeSourceType(cellRangeSourceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TablePackage.CHANGE_DELETION_TYPE: {
				ChangeDeletionType changeDeletionType = (ChangeDeletionType)theEObject;
				T result = caseChangeDeletionType(changeDeletionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TablePackage.CHANGE_TRACK_TABLE_CELL_TYPE: {
				ChangeTrackTableCellType changeTrackTableCellType = (ChangeTrackTableCellType)theEObject;
				T result = caseChangeTrackTableCellType(changeTrackTableCellType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TablePackage.CONSOLIDATION_TYPE: {
				ConsolidationType consolidationType = (ConsolidationType)theEObject;
				T result = caseConsolidationType(consolidationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TablePackage.CONTENT_VALIDATIONS_TYPE: {
				ContentValidationsType contentValidationsType = (ContentValidationsType)theEObject;
				T result = caseContentValidationsType(contentValidationsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TablePackage.CONTENT_VALIDATION_TYPE: {
				ContentValidationType contentValidationType = (ContentValidationType)theEObject;
				T result = caseContentValidationType(contentValidationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TablePackage.COVERED_TABLE_CELL_TYPE: {
				CoveredTableCellType coveredTableCellType = (CoveredTableCellType)theEObject;
				T result = caseCoveredTableCellType(coveredTableCellType);
				if (result == null) result = caseTableTableCellContent(coveredTableCellType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TablePackage.CUT_OFFS_TYPE: {
				CutOffsType cutOffsType = (CutOffsType)theEObject;
				T result = caseCutOffsType(cutOffsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TablePackage.DATABASE_RANGES_TYPE: {
				DatabaseRangesType databaseRangesType = (DatabaseRangesType)theEObject;
				T result = caseDatabaseRangesType(databaseRangesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TablePackage.DATABASE_RANGE_TYPE: {
				DatabaseRangeType databaseRangeType = (DatabaseRangeType)theEObject;
				T result = caseDatabaseRangeType(databaseRangeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TablePackage.DATABASE_SOURCE_QUERY_TYPE: {
				DatabaseSourceQueryType databaseSourceQueryType = (DatabaseSourceQueryType)theEObject;
				T result = caseDatabaseSourceQueryType(databaseSourceQueryType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TablePackage.DATABASE_SOURCE_SQL_TYPE: {
				DatabaseSourceSqlType databaseSourceSqlType = (DatabaseSourceSqlType)theEObject;
				T result = caseDatabaseSourceSqlType(databaseSourceSqlType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TablePackage.DATABASE_SOURCE_TABLE_TYPE: {
				DatabaseSourceTableType databaseSourceTableType = (DatabaseSourceTableType)theEObject;
				T result = caseDatabaseSourceTableType(databaseSourceTableType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TablePackage.DATA_PILOT_DISPLAY_INFO_TYPE: {
				DataPilotDisplayInfoType dataPilotDisplayInfoType = (DataPilotDisplayInfoType)theEObject;
				T result = caseDataPilotDisplayInfoType(dataPilotDisplayInfoType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TablePackage.DATA_PILOT_FIELD_REFERENCE_TYPE: {
				DataPilotFieldReferenceType dataPilotFieldReferenceType = (DataPilotFieldReferenceType)theEObject;
				T result = caseDataPilotFieldReferenceType(dataPilotFieldReferenceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TablePackage.DATA_PILOT_FIELD_TYPE: {
				DataPilotFieldType dataPilotFieldType = (DataPilotFieldType)theEObject;
				T result = caseDataPilotFieldType(dataPilotFieldType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TablePackage.DATA_PILOT_GROUP_MEMBER_TYPE: {
				DataPilotGroupMemberType dataPilotGroupMemberType = (DataPilotGroupMemberType)theEObject;
				T result = caseDataPilotGroupMemberType(dataPilotGroupMemberType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TablePackage.DATA_PILOT_GROUPS_TYPE: {
				DataPilotGroupsType dataPilotGroupsType = (DataPilotGroupsType)theEObject;
				T result = caseDataPilotGroupsType(dataPilotGroupsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TablePackage.DATA_PILOT_GROUP_TYPE: {
				DataPilotGroupType dataPilotGroupType = (DataPilotGroupType)theEObject;
				T result = caseDataPilotGroupType(dataPilotGroupType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TablePackage.DATA_PILOT_LAYOUT_INFO_TYPE: {
				DataPilotLayoutInfoType dataPilotLayoutInfoType = (DataPilotLayoutInfoType)theEObject;
				T result = caseDataPilotLayoutInfoType(dataPilotLayoutInfoType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TablePackage.DATA_PILOT_LEVEL_TYPE: {
				DataPilotLevelType dataPilotLevelType = (DataPilotLevelType)theEObject;
				T result = caseDataPilotLevelType(dataPilotLevelType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TablePackage.DATA_PILOT_MEMBERS_TYPE: {
				DataPilotMembersType dataPilotMembersType = (DataPilotMembersType)theEObject;
				T result = caseDataPilotMembersType(dataPilotMembersType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TablePackage.DATA_PILOT_MEMBER_TYPE: {
				DataPilotMemberType dataPilotMemberType = (DataPilotMemberType)theEObject;
				T result = caseDataPilotMemberType(dataPilotMemberType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TablePackage.DATA_PILOT_SORT_INFO_TYPE: {
				DataPilotSortInfoType dataPilotSortInfoType = (DataPilotSortInfoType)theEObject;
				T result = caseDataPilotSortInfoType(dataPilotSortInfoType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TablePackage.DATA_PILOT_SUBTOTALS_TYPE: {
				DataPilotSubtotalsType dataPilotSubtotalsType = (DataPilotSubtotalsType)theEObject;
				T result = caseDataPilotSubtotalsType(dataPilotSubtotalsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TablePackage.DATA_PILOT_SUBTOTAL_TYPE: {
				DataPilotSubtotalType dataPilotSubtotalType = (DataPilotSubtotalType)theEObject;
				T result = caseDataPilotSubtotalType(dataPilotSubtotalType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TablePackage.DATA_PILOT_TABLES_TYPE: {
				DataPilotTablesType dataPilotTablesType = (DataPilotTablesType)theEObject;
				T result = caseDataPilotTablesType(dataPilotTablesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TablePackage.DATA_PILOT_TABLE_TYPE: {
				DataPilotTableType dataPilotTableType = (DataPilotTableType)theEObject;
				T result = caseDataPilotTableType(dataPilotTableType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TablePackage.DDE_LINKS_TYPE: {
				DdeLinksType ddeLinksType = (DdeLinksType)theEObject;
				T result = caseDdeLinksType(ddeLinksType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TablePackage.DDE_LINK_TYPE: {
				DdeLinkType ddeLinkType = (DdeLinkType)theEObject;
				T result = caseDdeLinkType(ddeLinkType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TablePackage.DELETIONS_TYPE: {
				DeletionsType deletionsType = (DeletionsType)theEObject;
				T result = caseDeletionsType(deletionsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TablePackage.DELETION_TYPE: {
				DeletionType deletionType = (DeletionType)theEObject;
				T result = caseDeletionType(deletionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TablePackage.DEPENDENCIES_TYPE: {
				DependenciesType dependenciesType = (DependenciesType)theEObject;
				T result = caseDependenciesType(dependenciesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TablePackage.DEPENDENCY_TYPE: {
				DependencyType dependencyType = (DependencyType)theEObject;
				T result = caseDependencyType(dependencyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TablePackage.DETECTIVE_TYPE: {
				DetectiveType detectiveType = (DetectiveType)theEObject;
				T result = caseDetectiveType(detectiveType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TablePackage.ERROR_MACRO_TYPE: {
				ErrorMacroType errorMacroType = (ErrorMacroType)theEObject;
				T result = caseErrorMacroType(errorMacroType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TablePackage.ERROR_MESSAGE_TYPE: {
				ErrorMessageType errorMessageType = (ErrorMessageType)theEObject;
				T result = caseErrorMessageType(errorMessageType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TablePackage.EVEN_COLUMNS_TYPE: {
				EvenColumnsType evenColumnsType = (EvenColumnsType)theEObject;
				T result = caseEvenColumnsType(evenColumnsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TablePackage.EVEN_ROWS_TYPE: {
				EvenRowsType evenRowsType = (EvenRowsType)theEObject;
				T result = caseEvenRowsType(evenRowsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TablePackage.FILTER_AND_TYPE: {
				FilterAndType filterAndType = (FilterAndType)theEObject;
				T result = caseFilterAndType(filterAndType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TablePackage.FILTER_CONDITION_TYPE: {
				FilterConditionType filterConditionType = (FilterConditionType)theEObject;
				T result = caseFilterConditionType(filterConditionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TablePackage.FILTER_OR_TYPE: {
				FilterOrType filterOrType = (FilterOrType)theEObject;
				T result = caseFilterOrType(filterOrType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TablePackage.FILTER_TYPE: {
				FilterType filterType = (FilterType)theEObject;
				T result = caseFilterType(filterType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TablePackage.FIRST_COLUMN_TYPE: {
				FirstColumnType firstColumnType = (FirstColumnType)theEObject;
				T result = caseFirstColumnType(firstColumnType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TablePackage.FIRST_ROW_TYPE: {
				FirstRowType firstRowType = (FirstRowType)theEObject;
				T result = caseFirstRowType(firstRowType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TablePackage.HELP_MESSAGE_TYPE: {
				HelpMessageType helpMessageType = (HelpMessageType)theEObject;
				T result = caseHelpMessageType(helpMessageType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TablePackage.HIGHLIGHTED_RANGE_TYPE: {
				HighlightedRangeType highlightedRangeType = (HighlightedRangeType)theEObject;
				T result = caseHighlightedRangeType(highlightedRangeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TablePackage.INSERTION_CUT_OFF_TYPE: {
				InsertionCutOffType insertionCutOffType = (InsertionCutOffType)theEObject;
				T result = caseInsertionCutOffType(insertionCutOffType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TablePackage.INSERTION_TYPE: {
				InsertionType insertionType = (InsertionType)theEObject;
				T result = caseInsertionType(insertionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TablePackage.ITERATION_TYPE: {
				IterationType iterationType = (IterationType)theEObject;
				T result = caseIterationType(iterationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TablePackage.LABEL_RANGES_TYPE: {
				LabelRangesType labelRangesType = (LabelRangesType)theEObject;
				T result = caseLabelRangesType(labelRangesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TablePackage.LABEL_RANGE_TYPE: {
				LabelRangeType labelRangeType = (LabelRangeType)theEObject;
				T result = caseLabelRangeType(labelRangeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TablePackage.LAST_COLUMN_TYPE: {
				LastColumnType lastColumnType = (LastColumnType)theEObject;
				T result = caseLastColumnType(lastColumnType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TablePackage.LAST_ROW_TYPE: {
				LastRowType lastRowType = (LastRowType)theEObject;
				T result = caseLastRowType(lastRowType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TablePackage.MOVEMENT_CUT_OFF_TYPE: {
				MovementCutOffType movementCutOffType = (MovementCutOffType)theEObject;
				T result = caseMovementCutOffType(movementCutOffType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TablePackage.MOVEMENT_TYPE: {
				MovementType movementType = (MovementType)theEObject;
				T result = caseMovementType(movementType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TablePackage.NAMED_EXPRESSIONS_TYPE: {
				NamedExpressionsType namedExpressionsType = (NamedExpressionsType)theEObject;
				T result = caseNamedExpressionsType(namedExpressionsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TablePackage.NAMED_EXPRESSION_TYPE: {
				NamedExpressionType namedExpressionType = (NamedExpressionType)theEObject;
				T result = caseNamedExpressionType(namedExpressionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TablePackage.NAMED_RANGE_TYPE: {
				NamedRangeType namedRangeType = (NamedRangeType)theEObject;
				T result = caseNamedRangeType(namedRangeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TablePackage.NULL_DATE_TYPE: {
				NullDateType nullDateType = (NullDateType)theEObject;
				T result = caseNullDateType(nullDateType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TablePackage.ODD_COLUMNS_TYPE: {
				OddColumnsType oddColumnsType = (OddColumnsType)theEObject;
				T result = caseOddColumnsType(oddColumnsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TablePackage.ODD_ROWS_TYPE: {
				OddRowsType oddRowsType = (OddRowsType)theEObject;
				T result = caseOddRowsType(oddRowsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TablePackage.OPERATION_TYPE: {
				OperationType operationType = (OperationType)theEObject;
				T result = caseOperationType(operationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TablePackage.PREVIOUS_TYPE: {
				PreviousType previousType = (PreviousType)theEObject;
				T result = casePreviousType(previousType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TablePackage.SCENARIO_TYPE: {
				ScenarioType scenarioType = (ScenarioType)theEObject;
				T result = caseScenarioType(scenarioType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TablePackage.SHAPES_TYPE: {
				ShapesType shapesType = (ShapesType)theEObject;
				T result = caseShapesType(shapesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TablePackage.SORT_BY_TYPE: {
				SortByType sortByType = (SortByType)theEObject;
				T result = caseSortByType(sortByType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TablePackage.SORT_GROUPS_TYPE: {
				SortGroupsType sortGroupsType = (SortGroupsType)theEObject;
				T result = caseSortGroupsType(sortGroupsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TablePackage.SORT_TYPE: {
				SortType sortType = (SortType)theEObject;
				T result = caseSortType(sortType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TablePackage.SOURCE_CELL_RANGE_TYPE: {
				SourceCellRangeType sourceCellRangeType = (SourceCellRangeType)theEObject;
				T result = caseSourceCellRangeType(sourceCellRangeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TablePackage.SOURCE_RANGE_ADDRESS_TYPE: {
				SourceRangeAddressType sourceRangeAddressType = (SourceRangeAddressType)theEObject;
				T result = caseSourceRangeAddressType(sourceRangeAddressType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TablePackage.SOURCE_SERVICE_TYPE: {
				SourceServiceType sourceServiceType = (SourceServiceType)theEObject;
				T result = caseSourceServiceType(sourceServiceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TablePackage.SUBTOTAL_FIELD_TYPE: {
				SubtotalFieldType subtotalFieldType = (SubtotalFieldType)theEObject;
				T result = caseSubtotalFieldType(subtotalFieldType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TablePackage.SUBTOTAL_RULES_TYPE: {
				SubtotalRulesType subtotalRulesType = (SubtotalRulesType)theEObject;
				T result = caseSubtotalRulesType(subtotalRulesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TablePackage.SUBTOTAL_RULE_TYPE: {
				SubtotalRuleType subtotalRuleType = (SubtotalRuleType)theEObject;
				T result = caseSubtotalRuleType(subtotalRuleType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TablePackage.TABLE_CELL_TYPE: {
				TableCellType tableCellType = (TableCellType)theEObject;
				T result = caseTableCellType(tableCellType);
				if (result == null) result = caseTableTableCellContent(tableCellType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TablePackage.TABLE_COLUMN_GROUP_TYPE: {
				TableColumnGroupType tableColumnGroupType = (TableColumnGroupType)theEObject;
				T result = caseTableColumnGroupType(tableColumnGroupType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TablePackage.TABLE_COLUMNS_TYPE: {
				TableColumnsType tableColumnsType = (TableColumnsType)theEObject;
				T result = caseTableColumnsType(tableColumnsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TablePackage.TABLE_COLUMN_TYPE: {
				TableColumnType tableColumnType = (TableColumnType)theEObject;
				T result = caseTableColumnType(tableColumnType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TablePackage.TABLE_HEADER_COLUMNS_TYPE: {
				TableHeaderColumnsType tableHeaderColumnsType = (TableHeaderColumnsType)theEObject;
				T result = caseTableHeaderColumnsType(tableHeaderColumnsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TablePackage.TABLE_HEADER_ROWS_TYPE: {
				TableHeaderRowsType tableHeaderRowsType = (TableHeaderRowsType)theEObject;
				T result = caseTableHeaderRowsType(tableHeaderRowsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TablePackage.TABLE_ROW_GROUP_TYPE: {
				TableRowGroupType tableRowGroupType = (TableRowGroupType)theEObject;
				T result = caseTableRowGroupType(tableRowGroupType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TablePackage.TABLE_ROWS_TYPE: {
				TableRowsType tableRowsType = (TableRowsType)theEObject;
				T result = caseTableRowsType(tableRowsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TablePackage.TABLE_ROW_TYPE: {
				TableRowType tableRowType = (TableRowType)theEObject;
				T result = caseTableRowType(tableRowType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TablePackage.TABLE_SOURCE_TYPE: {
				TableSourceType tableSourceType = (TableSourceType)theEObject;
				T result = caseTableSourceType(tableSourceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TablePackage.TABLE_TYPE: {
				TableType tableType = (TableType)theEObject;
				T result = caseTableType(tableType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TablePackage.DOCUMENT_ROOT: {
				DocumentRoot documentRoot = (DocumentRoot)theEObject;
				T result = caseDocumentRoot(documentRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TablePackage.TABLE_TEMPLATE_TYPE: {
				TableTemplateType tableTemplateType = (TableTemplateType)theEObject;
				T result = caseTableTemplateType(tableTemplateType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TablePackage.TARGET_RANGE_ADDRESS_TYPE: {
				TargetRangeAddressType targetRangeAddressType = (TargetRangeAddressType)theEObject;
				T result = caseTargetRangeAddressType(targetRangeAddressType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TablePackage.TRACKED_CHANGES_TYPE: {
				TrackedChangesType trackedChangesType = (TrackedChangesType)theEObject;
				T result = caseTrackedChangesType(trackedChangesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Body Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Body Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBodyType(BodyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Calculation Settings Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Calculation Settings Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCalculationSettingsType(CalculationSettingsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cell Address Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cell Address Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCellAddressType(CellAddressType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cell Content Change Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cell Content Change Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCellContentChangeType(CellContentChangeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cell Content Deletion Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cell Content Deletion Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCellContentDeletionType(CellContentDeletionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cell Range Source Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cell Range Source Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCellRangeSourceType(CellRangeSourceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Change Deletion Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Change Deletion Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChangeDeletionType(ChangeDeletionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Change Track Table Cell Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Change Track Table Cell Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChangeTrackTableCellType(ChangeTrackTableCellType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Consolidation Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Consolidation Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConsolidationType(ConsolidationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Content Validations Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Content Validations Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContentValidationsType(ContentValidationsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Content Validation Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Content Validation Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContentValidationType(ContentValidationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Covered Table Cell Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Covered Table Cell Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCoveredTableCellType(CoveredTableCellType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cut Offs Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cut Offs Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCutOffsType(CutOffsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Database Ranges Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Database Ranges Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDatabaseRangesType(DatabaseRangesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Database Range Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Database Range Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDatabaseRangeType(DatabaseRangeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Database Source Query Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Database Source Query Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDatabaseSourceQueryType(DatabaseSourceQueryType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Database Source Sql Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Database Source Sql Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDatabaseSourceSqlType(DatabaseSourceSqlType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Database Source Table Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Database Source Table Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDatabaseSourceTableType(DatabaseSourceTableType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Pilot Display Info Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Pilot Display Info Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataPilotDisplayInfoType(DataPilotDisplayInfoType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Pilot Field Reference Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Pilot Field Reference Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataPilotFieldReferenceType(DataPilotFieldReferenceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Pilot Field Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Pilot Field Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataPilotFieldType(DataPilotFieldType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Pilot Group Member Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Pilot Group Member Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataPilotGroupMemberType(DataPilotGroupMemberType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Pilot Groups Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Pilot Groups Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataPilotGroupsType(DataPilotGroupsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Pilot Group Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Pilot Group Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataPilotGroupType(DataPilotGroupType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Pilot Layout Info Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Pilot Layout Info Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataPilotLayoutInfoType(DataPilotLayoutInfoType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Pilot Level Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Pilot Level Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataPilotLevelType(DataPilotLevelType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Pilot Members Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Pilot Members Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataPilotMembersType(DataPilotMembersType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Pilot Member Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Pilot Member Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataPilotMemberType(DataPilotMemberType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Pilot Sort Info Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Pilot Sort Info Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataPilotSortInfoType(DataPilotSortInfoType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Pilot Subtotals Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Pilot Subtotals Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataPilotSubtotalsType(DataPilotSubtotalsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Pilot Subtotal Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Pilot Subtotal Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataPilotSubtotalType(DataPilotSubtotalType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Pilot Tables Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Pilot Tables Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataPilotTablesType(DataPilotTablesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Pilot Table Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Pilot Table Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataPilotTableType(DataPilotTableType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dde Links Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dde Links Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDdeLinksType(DdeLinksType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dde Link Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dde Link Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDdeLinkType(DdeLinkType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Deletions Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Deletions Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeletionsType(DeletionsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Deletion Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Deletion Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeletionType(DeletionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dependencies Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dependencies Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDependenciesType(DependenciesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dependency Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dependency Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDependencyType(DependencyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Detective Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Detective Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDetectiveType(DetectiveType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Error Macro Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Error Macro Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseErrorMacroType(ErrorMacroType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Error Message Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Error Message Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseErrorMessageType(ErrorMessageType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Even Columns Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Even Columns Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEvenColumnsType(EvenColumnsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Even Rows Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Even Rows Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEvenRowsType(EvenRowsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Filter And Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Filter And Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFilterAndType(FilterAndType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Filter Condition Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Filter Condition Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFilterConditionType(FilterConditionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Filter Or Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Filter Or Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFilterOrType(FilterOrType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Filter Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Filter Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFilterType(FilterType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>First Column Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>First Column Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFirstColumnType(FirstColumnType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>First Row Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>First Row Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFirstRowType(FirstRowType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Help Message Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Help Message Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHelpMessageType(HelpMessageType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Highlighted Range Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Highlighted Range Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHighlightedRangeType(HighlightedRangeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Insertion Cut Off Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Insertion Cut Off Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInsertionCutOffType(InsertionCutOffType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Insertion Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Insertion Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInsertionType(InsertionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Iteration Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Iteration Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIterationType(IterationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Label Ranges Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Label Ranges Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLabelRangesType(LabelRangesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Label Range Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Label Range Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLabelRangeType(LabelRangeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Last Column Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Last Column Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLastColumnType(LastColumnType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Last Row Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Last Row Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLastRowType(LastRowType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Movement Cut Off Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Movement Cut Off Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMovementCutOffType(MovementCutOffType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Movement Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Movement Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMovementType(MovementType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Expressions Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Expressions Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedExpressionsType(NamedExpressionsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Expression Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Expression Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedExpressionType(NamedExpressionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Range Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Range Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedRangeType(NamedRangeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Null Date Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Null Date Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNullDateType(NullDateType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Odd Columns Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Odd Columns Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOddColumnsType(OddColumnsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Odd Rows Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Odd Rows Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOddRowsType(OddRowsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operation Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationType(OperationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Previous Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Previous Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePreviousType(PreviousType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scenario Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scenario Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScenarioType(ScenarioType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Shapes Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Shapes Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseShapesType(ShapesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sort By Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sort By Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSortByType(SortByType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sort Groups Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sort Groups Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSortGroupsType(SortGroupsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sort Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sort Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSortType(SortType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Source Cell Range Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Source Cell Range Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSourceCellRangeType(SourceCellRangeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Source Range Address Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Source Range Address Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSourceRangeAddressType(SourceRangeAddressType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Source Service Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Source Service Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSourceServiceType(SourceServiceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subtotal Field Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subtotal Field Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubtotalFieldType(SubtotalFieldType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subtotal Rules Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subtotal Rules Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubtotalRulesType(SubtotalRulesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subtotal Rule Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subtotal Rule Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubtotalRuleType(SubtotalRuleType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cell Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cell Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTableCellType(TableCellType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Column Group Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Column Group Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTableColumnGroupType(TableColumnGroupType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Columns Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Columns Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTableColumnsType(TableColumnsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Column Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Column Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTableColumnType(TableColumnType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Header Columns Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Header Columns Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTableHeaderColumnsType(TableHeaderColumnsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Header Rows Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Header Rows Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTableHeaderRowsType(TableHeaderRowsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Row Group Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Row Group Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTableRowGroupType(TableRowGroupType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rows Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rows Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTableRowsType(TableRowsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Row Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Row Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTableRowType(TableRowType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Source Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Source Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTableSourceType(TableSourceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTableType(TableType object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Template Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Template Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTableTemplateType(TableTemplateType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Target Range Address Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Target Range Address Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTargetRangeAddressType(TargetRangeAddressType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tracked Changes Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tracked Changes Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrackedChangesType(TrackedChangesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Table Table Cell Content</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Table Table Cell Content</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTableTableCellContent(TableTableCellContent object) {
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

} //TableSwitch
