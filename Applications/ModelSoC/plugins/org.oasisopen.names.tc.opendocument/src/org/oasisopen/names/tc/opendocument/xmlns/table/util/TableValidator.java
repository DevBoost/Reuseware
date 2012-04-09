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

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.emf.ecore.xml.type.util.XMLTypeValidator;
import org.oasisopen.names.tc.opendocument.xmlns.table.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage
 * @generated
 */
public class TableValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final TableValidator INSTANCE = new TableValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.oasisopen.names.tc.opendocument.xmlns.table";

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
	protected XMLTypeValidator xmlTypeValidator;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TableValidator() {
		super();
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
	  return TablePackage.eINSTANCE;
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
			case TablePackage.BODY_TYPE:
				return validateBodyType((BodyType)value, diagnostics, context);
			case TablePackage.CALCULATION_SETTINGS_TYPE:
				return validateCalculationSettingsType((CalculationSettingsType)value, diagnostics, context);
			case TablePackage.CELL_ADDRESS_TYPE:
				return validateCellAddressType((CellAddressType)value, diagnostics, context);
			case TablePackage.CELL_CONTENT_CHANGE_TYPE:
				return validateCellContentChangeType((CellContentChangeType)value, diagnostics, context);
			case TablePackage.CELL_CONTENT_DELETION_TYPE:
				return validateCellContentDeletionType((CellContentDeletionType)value, diagnostics, context);
			case TablePackage.CELL_RANGE_SOURCE_TYPE:
				return validateCellRangeSourceType((CellRangeSourceType)value, diagnostics, context);
			case TablePackage.CHANGE_DELETION_TYPE:
				return validateChangeDeletionType((ChangeDeletionType)value, diagnostics, context);
			case TablePackage.CHANGE_TRACK_TABLE_CELL_TYPE:
				return validateChangeTrackTableCellType((ChangeTrackTableCellType)value, diagnostics, context);
			case TablePackage.CONSOLIDATION_TYPE:
				return validateConsolidationType((ConsolidationType)value, diagnostics, context);
			case TablePackage.CONTENT_VALIDATIONS_TYPE:
				return validateContentValidationsType((ContentValidationsType)value, diagnostics, context);
			case TablePackage.CONTENT_VALIDATION_TYPE:
				return validateContentValidationType((ContentValidationType)value, diagnostics, context);
			case TablePackage.COVERED_TABLE_CELL_TYPE:
				return validateCoveredTableCellType((CoveredTableCellType)value, diagnostics, context);
			case TablePackage.CUT_OFFS_TYPE:
				return validateCutOffsType((CutOffsType)value, diagnostics, context);
			case TablePackage.DATABASE_RANGES_TYPE:
				return validateDatabaseRangesType((DatabaseRangesType)value, diagnostics, context);
			case TablePackage.DATABASE_RANGE_TYPE:
				return validateDatabaseRangeType((DatabaseRangeType)value, diagnostics, context);
			case TablePackage.DATABASE_SOURCE_QUERY_TYPE:
				return validateDatabaseSourceQueryType((DatabaseSourceQueryType)value, diagnostics, context);
			case TablePackage.DATABASE_SOURCE_SQL_TYPE:
				return validateDatabaseSourceSqlType((DatabaseSourceSqlType)value, diagnostics, context);
			case TablePackage.DATABASE_SOURCE_TABLE_TYPE:
				return validateDatabaseSourceTableType((DatabaseSourceTableType)value, diagnostics, context);
			case TablePackage.DATA_PILOT_DISPLAY_INFO_TYPE:
				return validateDataPilotDisplayInfoType((DataPilotDisplayInfoType)value, diagnostics, context);
			case TablePackage.DATA_PILOT_FIELD_REFERENCE_TYPE:
				return validateDataPilotFieldReferenceType((DataPilotFieldReferenceType)value, diagnostics, context);
			case TablePackage.DATA_PILOT_FIELD_TYPE:
				return validateDataPilotFieldType((DataPilotFieldType)value, diagnostics, context);
			case TablePackage.DATA_PILOT_GROUP_MEMBER_TYPE:
				return validateDataPilotGroupMemberType((DataPilotGroupMemberType)value, diagnostics, context);
			case TablePackage.DATA_PILOT_GROUPS_TYPE:
				return validateDataPilotGroupsType((DataPilotGroupsType)value, diagnostics, context);
			case TablePackage.DATA_PILOT_GROUP_TYPE:
				return validateDataPilotGroupType((DataPilotGroupType)value, diagnostics, context);
			case TablePackage.DATA_PILOT_LAYOUT_INFO_TYPE:
				return validateDataPilotLayoutInfoType((DataPilotLayoutInfoType)value, diagnostics, context);
			case TablePackage.DATA_PILOT_LEVEL_TYPE:
				return validateDataPilotLevelType((DataPilotLevelType)value, diagnostics, context);
			case TablePackage.DATA_PILOT_MEMBERS_TYPE:
				return validateDataPilotMembersType((DataPilotMembersType)value, diagnostics, context);
			case TablePackage.DATA_PILOT_MEMBER_TYPE:
				return validateDataPilotMemberType((DataPilotMemberType)value, diagnostics, context);
			case TablePackage.DATA_PILOT_SORT_INFO_TYPE:
				return validateDataPilotSortInfoType((DataPilotSortInfoType)value, diagnostics, context);
			case TablePackage.DATA_PILOT_SUBTOTALS_TYPE:
				return validateDataPilotSubtotalsType((DataPilotSubtotalsType)value, diagnostics, context);
			case TablePackage.DATA_PILOT_SUBTOTAL_TYPE:
				return validateDataPilotSubtotalType((DataPilotSubtotalType)value, diagnostics, context);
			case TablePackage.DATA_PILOT_TABLES_TYPE:
				return validateDataPilotTablesType((DataPilotTablesType)value, diagnostics, context);
			case TablePackage.DATA_PILOT_TABLE_TYPE:
				return validateDataPilotTableType((DataPilotTableType)value, diagnostics, context);
			case TablePackage.DDE_LINKS_TYPE:
				return validateDdeLinksType((DdeLinksType)value, diagnostics, context);
			case TablePackage.DDE_LINK_TYPE:
				return validateDdeLinkType((DdeLinkType)value, diagnostics, context);
			case TablePackage.DELETIONS_TYPE:
				return validateDeletionsType((DeletionsType)value, diagnostics, context);
			case TablePackage.DELETION_TYPE:
				return validateDeletionType((DeletionType)value, diagnostics, context);
			case TablePackage.DEPENDENCIES_TYPE:
				return validateDependenciesType((DependenciesType)value, diagnostics, context);
			case TablePackage.DEPENDENCY_TYPE:
				return validateDependencyType((DependencyType)value, diagnostics, context);
			case TablePackage.DETECTIVE_TYPE:
				return validateDetectiveType((DetectiveType)value, diagnostics, context);
			case TablePackage.ERROR_MACRO_TYPE:
				return validateErrorMacroType((ErrorMacroType)value, diagnostics, context);
			case TablePackage.ERROR_MESSAGE_TYPE:
				return validateErrorMessageType((ErrorMessageType)value, diagnostics, context);
			case TablePackage.EVEN_COLUMNS_TYPE:
				return validateEvenColumnsType((EvenColumnsType)value, diagnostics, context);
			case TablePackage.EVEN_ROWS_TYPE:
				return validateEvenRowsType((EvenRowsType)value, diagnostics, context);
			case TablePackage.FILTER_AND_TYPE:
				return validateFilterAndType((FilterAndType)value, diagnostics, context);
			case TablePackage.FILTER_CONDITION_TYPE:
				return validateFilterConditionType((FilterConditionType)value, diagnostics, context);
			case TablePackage.FILTER_OR_TYPE:
				return validateFilterOrType((FilterOrType)value, diagnostics, context);
			case TablePackage.FILTER_TYPE:
				return validateFilterType((FilterType)value, diagnostics, context);
			case TablePackage.FIRST_COLUMN_TYPE:
				return validateFirstColumnType((FirstColumnType)value, diagnostics, context);
			case TablePackage.FIRST_ROW_TYPE:
				return validateFirstRowType((FirstRowType)value, diagnostics, context);
			case TablePackage.HELP_MESSAGE_TYPE:
				return validateHelpMessageType((HelpMessageType)value, diagnostics, context);
			case TablePackage.HIGHLIGHTED_RANGE_TYPE:
				return validateHighlightedRangeType((HighlightedRangeType)value, diagnostics, context);
			case TablePackage.INSERTION_CUT_OFF_TYPE:
				return validateInsertionCutOffType((InsertionCutOffType)value, diagnostics, context);
			case TablePackage.INSERTION_TYPE:
				return validateInsertionType((InsertionType)value, diagnostics, context);
			case TablePackage.ITERATION_TYPE:
				return validateIterationType((IterationType)value, diagnostics, context);
			case TablePackage.LABEL_RANGES_TYPE:
				return validateLabelRangesType((LabelRangesType)value, diagnostics, context);
			case TablePackage.LABEL_RANGE_TYPE:
				return validateLabelRangeType((LabelRangeType)value, diagnostics, context);
			case TablePackage.LAST_COLUMN_TYPE:
				return validateLastColumnType((LastColumnType)value, diagnostics, context);
			case TablePackage.LAST_ROW_TYPE:
				return validateLastRowType((LastRowType)value, diagnostics, context);
			case TablePackage.MOVEMENT_CUT_OFF_TYPE:
				return validateMovementCutOffType((MovementCutOffType)value, diagnostics, context);
			case TablePackage.MOVEMENT_TYPE:
				return validateMovementType((MovementType)value, diagnostics, context);
			case TablePackage.NAMED_EXPRESSIONS_TYPE:
				return validateNamedExpressionsType((NamedExpressionsType)value, diagnostics, context);
			case TablePackage.NAMED_EXPRESSION_TYPE:
				return validateNamedExpressionType((NamedExpressionType)value, diagnostics, context);
			case TablePackage.NAMED_RANGE_TYPE:
				return validateNamedRangeType((NamedRangeType)value, diagnostics, context);
			case TablePackage.NULL_DATE_TYPE:
				return validateNullDateType((NullDateType)value, diagnostics, context);
			case TablePackage.ODD_COLUMNS_TYPE:
				return validateOddColumnsType((OddColumnsType)value, diagnostics, context);
			case TablePackage.ODD_ROWS_TYPE:
				return validateOddRowsType((OddRowsType)value, diagnostics, context);
			case TablePackage.OPERATION_TYPE:
				return validateOperationType((OperationType)value, diagnostics, context);
			case TablePackage.PREVIOUS_TYPE:
				return validatePreviousType((PreviousType)value, diagnostics, context);
			case TablePackage.SCENARIO_TYPE:
				return validateScenarioType((ScenarioType)value, diagnostics, context);
			case TablePackage.SHAPES_TYPE:
				return validateShapesType((ShapesType)value, diagnostics, context);
			case TablePackage.SORT_BY_TYPE:
				return validateSortByType((SortByType)value, diagnostics, context);
			case TablePackage.SORT_GROUPS_TYPE:
				return validateSortGroupsType((SortGroupsType)value, diagnostics, context);
			case TablePackage.SORT_TYPE:
				return validateSortType((SortType)value, diagnostics, context);
			case TablePackage.SOURCE_CELL_RANGE_TYPE:
				return validateSourceCellRangeType((SourceCellRangeType)value, diagnostics, context);
			case TablePackage.SOURCE_RANGE_ADDRESS_TYPE:
				return validateSourceRangeAddressType((SourceRangeAddressType)value, diagnostics, context);
			case TablePackage.SOURCE_SERVICE_TYPE:
				return validateSourceServiceType((SourceServiceType)value, diagnostics, context);
			case TablePackage.SUBTOTAL_FIELD_TYPE:
				return validateSubtotalFieldType((SubtotalFieldType)value, diagnostics, context);
			case TablePackage.SUBTOTAL_RULES_TYPE:
				return validateSubtotalRulesType((SubtotalRulesType)value, diagnostics, context);
			case TablePackage.SUBTOTAL_RULE_TYPE:
				return validateSubtotalRuleType((SubtotalRuleType)value, diagnostics, context);
			case TablePackage.TABLE_CELL_TYPE:
				return validateTableCellType((TableCellType)value, diagnostics, context);
			case TablePackage.TABLE_COLUMN_GROUP_TYPE:
				return validateTableColumnGroupType((TableColumnGroupType)value, diagnostics, context);
			case TablePackage.TABLE_COLUMNS_TYPE:
				return validateTableColumnsType((TableColumnsType)value, diagnostics, context);
			case TablePackage.TABLE_COLUMN_TYPE:
				return validateTableColumnType((TableColumnType)value, diagnostics, context);
			case TablePackage.TABLE_HEADER_COLUMNS_TYPE:
				return validateTableHeaderColumnsType((TableHeaderColumnsType)value, diagnostics, context);
			case TablePackage.TABLE_HEADER_ROWS_TYPE:
				return validateTableHeaderRowsType((TableHeaderRowsType)value, diagnostics, context);
			case TablePackage.TABLE_ROW_GROUP_TYPE:
				return validateTableRowGroupType((TableRowGroupType)value, diagnostics, context);
			case TablePackage.TABLE_ROWS_TYPE:
				return validateTableRowsType((TableRowsType)value, diagnostics, context);
			case TablePackage.TABLE_ROW_TYPE:
				return validateTableRowType((TableRowType)value, diagnostics, context);
			case TablePackage.TABLE_SOURCE_TYPE:
				return validateTableSourceType((TableSourceType)value, diagnostics, context);
			case TablePackage.TABLE_TYPE:
				return validateTableType((TableType)value, diagnostics, context);
			case TablePackage.DOCUMENT_ROOT:
				return validateDocumentRoot((DocumentRoot)value, diagnostics, context);
			case TablePackage.TABLE_TEMPLATE_TYPE:
				return validateTableTemplateType((TableTemplateType)value, diagnostics, context);
			case TablePackage.TARGET_RANGE_ADDRESS_TYPE:
				return validateTargetRangeAddressType((TargetRangeAddressType)value, diagnostics, context);
			case TablePackage.TRACKED_CHANGES_TYPE:
				return validateTrackedChangesType((TrackedChangesType)value, diagnostics, context);
			case TablePackage.ACCEPTANCE_STATE_TYPE:
				return validateAcceptanceStateType((AcceptanceStateType)value, diagnostics, context);
			case TablePackage.ALIGN_TYPE:
				return validateAlignType((AlignType)value, diagnostics, context);
			case TablePackage.BORDER_MODEL_TYPE:
				return validateBorderModelType((BorderModelType)value, diagnostics, context);
			case TablePackage.CONDITION_SOURCE_TYPE:
				return validateConditionSourceType((ConditionSourceType)value, diagnostics, context);
			case TablePackage.DATA_TYPE_TYPE1:
				return validateDataTypeType1((DataTypeType1)value, diagnostics, context);
			case TablePackage.DATA_TYPE_TYPE_MEMBER1:
				return validateDataTypeTypeMember1((DataTypeTypeMember1)value, diagnostics, context);
			case TablePackage.DATA_TYPE_TYPE_MEMBER2:
				return validateDataTypeTypeMember2((DataTypeTypeMember2)value, diagnostics, context);
			case TablePackage.DATA_TYPE_TYPE_MEMBER3:
				return validateDataTypeTypeMember3((DataTypeTypeMember3)value, diagnostics, context);
			case TablePackage.DATE_END_TYPE_MEMBER1:
				return validateDateEndTypeMember1((DateEndTypeMember1)value, diagnostics, context);
			case TablePackage.DATE_START_TYPE_MEMBER1:
				return validateDateStartTypeMember1((DateStartTypeMember1)value, diagnostics, context);
			case TablePackage.DIRECTION_TYPE:
				return validateDirectionType((DirectionType)value, diagnostics, context);
			case TablePackage.DISPLAY_LIST_TYPE:
				return validateDisplayListType((DisplayListType)value, diagnostics, context);
			case TablePackage.DISPLAY_MEMBER_MODE_TYPE:
				return validateDisplayMemberModeType((DisplayMemberModeType)value, diagnostics, context);
			case TablePackage.END_TYPE_MEMBER1:
				return validateEndTypeMember1((EndTypeMember1)value, diagnostics, context);
			case TablePackage.FUNCTION_TYPE_MEMBER1:
				return validateFunctionTypeMember1((FunctionTypeMember1)value, diagnostics, context);
			case TablePackage.FUNCTION_TYPE_MEMBER10:
				return validateFunctionTypeMember10((FunctionTypeMember10)value, diagnostics, context);
			case TablePackage.FUNCTION_TYPE_MEMBER11:
				return validateFunctionTypeMember11((FunctionTypeMember11)value, diagnostics, context);
			case TablePackage.FUNCTION_TYPE_MEMBER12:
				return validateFunctionTypeMember12((FunctionTypeMember12)value, diagnostics, context);
			case TablePackage.FUNCTION_TYPE_MEMBER2:
				return validateFunctionTypeMember2((FunctionTypeMember2)value, diagnostics, context);
			case TablePackage.FUNCTION_TYPE_MEMBER3:
				return validateFunctionTypeMember3((FunctionTypeMember3)value, diagnostics, context);
			case TablePackage.FUNCTION_TYPE_MEMBER4:
				return validateFunctionTypeMember4((FunctionTypeMember4)value, diagnostics, context);
			case TablePackage.FUNCTION_TYPE_MEMBER5:
				return validateFunctionTypeMember5((FunctionTypeMember5)value, diagnostics, context);
			case TablePackage.FUNCTION_TYPE_MEMBER6:
				return validateFunctionTypeMember6((FunctionTypeMember6)value, diagnostics, context);
			case TablePackage.FUNCTION_TYPE_MEMBER7:
				return validateFunctionTypeMember7((FunctionTypeMember7)value, diagnostics, context);
			case TablePackage.FUNCTION_TYPE_MEMBER8:
				return validateFunctionTypeMember8((FunctionTypeMember8)value, diagnostics, context);
			case TablePackage.FUNCTION_TYPE_MEMBER9:
				return validateFunctionTypeMember9((FunctionTypeMember9)value, diagnostics, context);
			case TablePackage.GRAND_TOTAL_TYPE:
				return validateGrandTotalType((GrandTotalType)value, diagnostics, context);
			case TablePackage.GROUPED_BY_TYPE:
				return validateGroupedByType((GroupedByType)value, diagnostics, context);
			case TablePackage.LAYOUT_MODE_TYPE:
				return validateLayoutModeType((LayoutModeType)value, diagnostics, context);
			case TablePackage.MEMBER_TYPE_TYPE:
				return validateMemberTypeType((MemberTypeType)value, diagnostics, context);
			case TablePackage.MESSAGE_TYPE_TYPE:
				return validateMessageTypeType((MessageTypeType)value, diagnostics, context);
			case TablePackage.MODE_TYPE:
				return validateModeType((ModeType)value, diagnostics, context);
			case TablePackage.NAME_TYPE:
				return validateNameType((NameType)value, diagnostics, context);
			case TablePackage.ORDER_TYPE:
				return validateOrderType((OrderType)value, diagnostics, context);
			case TablePackage.ORIENTATION_TYPE:
				return validateOrientationType((OrientationType)value, diagnostics, context);
			case TablePackage.ORIENTATION_TYPE1:
				return validateOrientationType1((OrientationType1)value, diagnostics, context);
			case TablePackage.RANGE_USABLE_AS_TYPE_MEMBER0:
				return validateRangeUsableAsTypeMember0((RangeUsableAsTypeMember0)value, diagnostics, context);
			case TablePackage.RANGE_USABLE_AS_TYPE_MEMBER1_BASE_ITEM:
				return validateRangeUsableAsTypeMember1BaseItem((RangeUsableAsTypeMember1BaseItem)value, diagnostics, context);
			case TablePackage.SORT_MODE_TYPE:
				return validateSortModeType((SortModeType)value, diagnostics, context);
			case TablePackage.START_TYPE_MEMBER1:
				return validateStartTypeMember1((StartTypeMember1)value, diagnostics, context);
			case TablePackage.STATUS_TYPE:
				return validateStatusType((StatusType)value, diagnostics, context);
			case TablePackage.TYPE_TYPE:
				return validateTypeType((TypeType)value, diagnostics, context);
			case TablePackage.TYPE_TYPE1:
				return validateTypeType1((TypeType1)value, diagnostics, context);
			case TablePackage.USE_LABELS_TYPE:
				return validateUseLabelsType((UseLabelsType)value, diagnostics, context);
			case TablePackage.ACCEPTANCE_STATE_TYPE_OBJECT:
				return validateAcceptanceStateTypeObject((AcceptanceStateType)value, diagnostics, context);
			case TablePackage.ALIGN_TYPE_OBJECT:
				return validateAlignTypeObject((AlignType)value, diagnostics, context);
			case TablePackage.BORDER_MODEL_TYPE_OBJECT:
				return validateBorderModelTypeObject((BorderModelType)value, diagnostics, context);
			case TablePackage.CONDITION_SOURCE_TYPE_OBJECT:
				return validateConditionSourceTypeObject((ConditionSourceType)value, diagnostics, context);
			case TablePackage.DATA_TYPE_TYPE:
				return validateDataTypeType(value, diagnostics, context);
			case TablePackage.DATA_TYPE_TYPE_MEMBER1_OBJECT:
				return validateDataTypeTypeMember1Object((DataTypeTypeMember1)value, diagnostics, context);
			case TablePackage.DATA_TYPE_TYPE_MEMBER2_OBJECT:
				return validateDataTypeTypeMember2Object((DataTypeTypeMember2)value, diagnostics, context);
			case TablePackage.DATA_TYPE_TYPE_MEMBER3_OBJECT:
				return validateDataTypeTypeMember3Object((DataTypeTypeMember3)value, diagnostics, context);
			case TablePackage.DATA_TYPE_TYPE_OBJECT:
				return validateDataTypeTypeObject((DataTypeType1)value, diagnostics, context);
			case TablePackage.DATE_END_TYPE:
				return validateDateEndType(value, diagnostics, context);
			case TablePackage.DATE_END_TYPE_MEMBER1_OBJECT:
				return validateDateEndTypeMember1Object((DateEndTypeMember1)value, diagnostics, context);
			case TablePackage.DATE_START_TYPE:
				return validateDateStartType(value, diagnostics, context);
			case TablePackage.DATE_START_TYPE_MEMBER1_OBJECT:
				return validateDateStartTypeMember1Object((DateStartTypeMember1)value, diagnostics, context);
			case TablePackage.DEFAULT_CELL_STYLE_NAME_TYPE:
				return validateDefaultCellStyleNameType((String)value, diagnostics, context);
			case TablePackage.DEFAULT_CELL_STYLE_NAME_TYPE_MEMBER1:
				return validateDefaultCellStyleNameTypeMember1((String)value, diagnostics, context);
			case TablePackage.DIRECTION_TYPE_OBJECT:
				return validateDirectionTypeObject((DirectionType)value, diagnostics, context);
			case TablePackage.DISPLAY_LIST_TYPE_OBJECT:
				return validateDisplayListTypeObject((DisplayListType)value, diagnostics, context);
			case TablePackage.DISPLAY_MEMBER_MODE_TYPE_OBJECT:
				return validateDisplayMemberModeTypeObject((DisplayMemberModeType)value, diagnostics, context);
			case TablePackage.END_TYPE:
				return validateEndType(value, diagnostics, context);
			case TablePackage.END_TYPE_MEMBER1_OBJECT:
				return validateEndTypeMember1Object((EndTypeMember1)value, diagnostics, context);
			case TablePackage.FUNCTION_TYPE:
				return validateFunctionType(value, diagnostics, context);
			case TablePackage.FUNCTION_TYPE_MEMBER10_OBJECT:
				return validateFunctionTypeMember10Object((FunctionTypeMember10)value, diagnostics, context);
			case TablePackage.FUNCTION_TYPE_MEMBER11_OBJECT:
				return validateFunctionTypeMember11Object((FunctionTypeMember11)value, diagnostics, context);
			case TablePackage.FUNCTION_TYPE_MEMBER12_OBJECT:
				return validateFunctionTypeMember12Object((FunctionTypeMember12)value, diagnostics, context);
			case TablePackage.FUNCTION_TYPE_MEMBER1_OBJECT:
				return validateFunctionTypeMember1Object((FunctionTypeMember1)value, diagnostics, context);
			case TablePackage.FUNCTION_TYPE_MEMBER2_OBJECT:
				return validateFunctionTypeMember2Object((FunctionTypeMember2)value, diagnostics, context);
			case TablePackage.FUNCTION_TYPE_MEMBER3_OBJECT:
				return validateFunctionTypeMember3Object((FunctionTypeMember3)value, diagnostics, context);
			case TablePackage.FUNCTION_TYPE_MEMBER4_OBJECT:
				return validateFunctionTypeMember4Object((FunctionTypeMember4)value, diagnostics, context);
			case TablePackage.FUNCTION_TYPE_MEMBER5_OBJECT:
				return validateFunctionTypeMember5Object((FunctionTypeMember5)value, diagnostics, context);
			case TablePackage.FUNCTION_TYPE_MEMBER6_OBJECT:
				return validateFunctionTypeMember6Object((FunctionTypeMember6)value, diagnostics, context);
			case TablePackage.FUNCTION_TYPE_MEMBER7_OBJECT:
				return validateFunctionTypeMember7Object((FunctionTypeMember7)value, diagnostics, context);
			case TablePackage.FUNCTION_TYPE_MEMBER8_OBJECT:
				return validateFunctionTypeMember8Object((FunctionTypeMember8)value, diagnostics, context);
			case TablePackage.FUNCTION_TYPE_MEMBER9_OBJECT:
				return validateFunctionTypeMember9Object((FunctionTypeMember9)value, diagnostics, context);
			case TablePackage.GRAND_TOTAL_TYPE_OBJECT:
				return validateGrandTotalTypeObject((GrandTotalType)value, diagnostics, context);
			case TablePackage.GROUPED_BY_TYPE_OBJECT:
				return validateGroupedByTypeObject((GroupedByType)value, diagnostics, context);
			case TablePackage.LAYOUT_MODE_TYPE_OBJECT:
				return validateLayoutModeTypeObject((LayoutModeType)value, diagnostics, context);
			case TablePackage.MEMBER_TYPE_TYPE_OBJECT:
				return validateMemberTypeTypeObject((MemberTypeType)value, diagnostics, context);
			case TablePackage.MESSAGE_TYPE_TYPE_OBJECT:
				return validateMessageTypeTypeObject((MessageTypeType)value, diagnostics, context);
			case TablePackage.MODE_TYPE_OBJECT:
				return validateModeTypeObject((ModeType)value, diagnostics, context);
			case TablePackage.NAME_TYPE_OBJECT:
				return validateNameTypeObject((NameType)value, diagnostics, context);
			case TablePackage.ORDER_TYPE_OBJECT:
				return validateOrderTypeObject((OrderType)value, diagnostics, context);
			case TablePackage.ORIENTATION_TYPE_OBJECT:
				return validateOrientationTypeObject((OrientationType)value, diagnostics, context);
			case TablePackage.ORIENTATION_TYPE_OBJECT1:
				return validateOrientationTypeObject1((OrientationType1)value, diagnostics, context);
			case TablePackage.RANGE_USABLE_AS_TYPE:
				return validateRangeUsableAsType(value, diagnostics, context);
			case TablePackage.RANGE_USABLE_AS_TYPE_MEMBER0_OBJECT:
				return validateRangeUsableAsTypeMember0Object((RangeUsableAsTypeMember0)value, diagnostics, context);
			case TablePackage.RANGE_USABLE_AS_TYPE_MEMBER1:
				return validateRangeUsableAsTypeMember1((List)value, diagnostics, context);
			case TablePackage.RANGE_USABLE_AS_TYPE_MEMBER1_BASE:
				return validateRangeUsableAsTypeMember1Base((List<?>)value, diagnostics, context);
			case TablePackage.RANGE_USABLE_AS_TYPE_MEMBER1_BASE_ITEM_OBJECT:
				return validateRangeUsableAsTypeMember1BaseItemObject((RangeUsableAsTypeMember1BaseItem)value, diagnostics, context);
			case TablePackage.SORT_MODE_TYPE_OBJECT:
				return validateSortModeTypeObject((SortModeType)value, diagnostics, context);
			case TablePackage.START_TYPE:
				return validateStartType(value, diagnostics, context);
			case TablePackage.START_TYPE_MEMBER1_OBJECT:
				return validateStartTypeMember1Object((StartTypeMember1)value, diagnostics, context);
			case TablePackage.STATUS_TYPE_OBJECT:
				return validateStatusTypeObject((StatusType)value, diagnostics, context);
			case TablePackage.STYLE_NAME_TYPE:
				return validateStyleNameType((String)value, diagnostics, context);
			case TablePackage.STYLE_NAME_TYPE_MEMBER1:
				return validateStyleNameTypeMember1((String)value, diagnostics, context);
			case TablePackage.TYPE_TYPE_OBJECT:
				return validateTypeTypeObject((TypeType)value, diagnostics, context);
			case TablePackage.TYPE_TYPE_OBJECT1:
				return validateTypeTypeObject1((TypeType1)value, diagnostics, context);
			case TablePackage.USE_LABELS_TYPE_OBJECT:
				return validateUseLabelsTypeObject((UseLabelsType)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBodyType(BodyType bodyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bodyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCalculationSettingsType(CalculationSettingsType calculationSettingsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(calculationSettingsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCellAddressType(CellAddressType cellAddressType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(cellAddressType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCellContentChangeType(CellContentChangeType cellContentChangeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(cellContentChangeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCellContentDeletionType(CellContentDeletionType cellContentDeletionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(cellContentDeletionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCellRangeSourceType(CellRangeSourceType cellRangeSourceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(cellRangeSourceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChangeDeletionType(ChangeDeletionType changeDeletionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(changeDeletionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChangeTrackTableCellType(ChangeTrackTableCellType changeTrackTableCellType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(changeTrackTableCellType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsolidationType(ConsolidationType consolidationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(consolidationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContentValidationsType(ContentValidationsType contentValidationsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(contentValidationsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContentValidationType(ContentValidationType contentValidationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(contentValidationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoveredTableCellType(CoveredTableCellType coveredTableCellType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(coveredTableCellType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCutOffsType(CutOffsType cutOffsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(cutOffsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDatabaseRangesType(DatabaseRangesType databaseRangesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(databaseRangesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDatabaseRangeType(DatabaseRangeType databaseRangeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(databaseRangeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDatabaseSourceQueryType(DatabaseSourceQueryType databaseSourceQueryType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(databaseSourceQueryType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDatabaseSourceSqlType(DatabaseSourceSqlType databaseSourceSqlType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(databaseSourceSqlType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDatabaseSourceTableType(DatabaseSourceTableType databaseSourceTableType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(databaseSourceTableType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataPilotDisplayInfoType(DataPilotDisplayInfoType dataPilotDisplayInfoType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dataPilotDisplayInfoType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataPilotFieldReferenceType(DataPilotFieldReferenceType dataPilotFieldReferenceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dataPilotFieldReferenceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataPilotFieldType(DataPilotFieldType dataPilotFieldType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dataPilotFieldType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataPilotGroupMemberType(DataPilotGroupMemberType dataPilotGroupMemberType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dataPilotGroupMemberType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataPilotGroupsType(DataPilotGroupsType dataPilotGroupsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dataPilotGroupsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataPilotGroupType(DataPilotGroupType dataPilotGroupType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dataPilotGroupType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataPilotLayoutInfoType(DataPilotLayoutInfoType dataPilotLayoutInfoType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dataPilotLayoutInfoType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataPilotLevelType(DataPilotLevelType dataPilotLevelType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dataPilotLevelType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataPilotMembersType(DataPilotMembersType dataPilotMembersType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dataPilotMembersType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataPilotMemberType(DataPilotMemberType dataPilotMemberType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dataPilotMemberType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataPilotSortInfoType(DataPilotSortInfoType dataPilotSortInfoType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dataPilotSortInfoType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataPilotSubtotalsType(DataPilotSubtotalsType dataPilotSubtotalsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dataPilotSubtotalsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataPilotSubtotalType(DataPilotSubtotalType dataPilotSubtotalType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dataPilotSubtotalType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataPilotTablesType(DataPilotTablesType dataPilotTablesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dataPilotTablesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataPilotTableType(DataPilotTableType dataPilotTableType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dataPilotTableType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDdeLinksType(DdeLinksType ddeLinksType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ddeLinksType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDdeLinkType(DdeLinkType ddeLinkType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ddeLinkType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeletionsType(DeletionsType deletionsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(deletionsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeletionType(DeletionType deletionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(deletionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDependenciesType(DependenciesType dependenciesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dependenciesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDependencyType(DependencyType dependencyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dependencyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDetectiveType(DetectiveType detectiveType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(detectiveType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateErrorMacroType(ErrorMacroType errorMacroType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(errorMacroType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateErrorMessageType(ErrorMessageType errorMessageType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(errorMessageType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEvenColumnsType(EvenColumnsType evenColumnsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(evenColumnsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEvenRowsType(EvenRowsType evenRowsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(evenRowsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFilterAndType(FilterAndType filterAndType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(filterAndType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFilterConditionType(FilterConditionType filterConditionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(filterConditionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFilterOrType(FilterOrType filterOrType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(filterOrType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFilterType(FilterType filterType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(filterType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFirstColumnType(FirstColumnType firstColumnType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(firstColumnType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFirstRowType(FirstRowType firstRowType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(firstRowType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHelpMessageType(HelpMessageType helpMessageType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(helpMessageType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHighlightedRangeType(HighlightedRangeType highlightedRangeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(highlightedRangeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInsertionCutOffType(InsertionCutOffType insertionCutOffType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(insertionCutOffType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInsertionType(InsertionType insertionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(insertionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIterationType(IterationType iterationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(iterationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLabelRangesType(LabelRangesType labelRangesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(labelRangesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLabelRangeType(LabelRangeType labelRangeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(labelRangeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLastColumnType(LastColumnType lastColumnType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(lastColumnType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLastRowType(LastRowType lastRowType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(lastRowType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMovementCutOffType(MovementCutOffType movementCutOffType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(movementCutOffType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMovementType(MovementType movementType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(movementType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNamedExpressionsType(NamedExpressionsType namedExpressionsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(namedExpressionsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNamedExpressionType(NamedExpressionType namedExpressionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(namedExpressionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNamedRangeType(NamedRangeType namedRangeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(namedRangeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNullDateType(NullDateType nullDateType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nullDateType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOddColumnsType(OddColumnsType oddColumnsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(oddColumnsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOddRowsType(OddRowsType oddRowsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(oddRowsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperationType(OperationType operationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(operationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePreviousType(PreviousType previousType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(previousType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScenarioType(ScenarioType scenarioType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(scenarioType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateShapesType(ShapesType shapesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(shapesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSortByType(SortByType sortByType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sortByType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSortGroupsType(SortGroupsType sortGroupsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sortGroupsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSortType(SortType sortType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sortType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSourceCellRangeType(SourceCellRangeType sourceCellRangeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sourceCellRangeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSourceRangeAddressType(SourceRangeAddressType sourceRangeAddressType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sourceRangeAddressType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSourceServiceType(SourceServiceType sourceServiceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sourceServiceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubtotalFieldType(SubtotalFieldType subtotalFieldType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(subtotalFieldType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubtotalRulesType(SubtotalRulesType subtotalRulesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(subtotalRulesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubtotalRuleType(SubtotalRuleType subtotalRuleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(subtotalRuleType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTableCellType(TableCellType tableCellType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tableCellType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTableColumnGroupType(TableColumnGroupType tableColumnGroupType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tableColumnGroupType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTableColumnsType(TableColumnsType tableColumnsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tableColumnsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTableColumnType(TableColumnType tableColumnType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tableColumnType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTableHeaderColumnsType(TableHeaderColumnsType tableHeaderColumnsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tableHeaderColumnsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTableHeaderRowsType(TableHeaderRowsType tableHeaderRowsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tableHeaderRowsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTableRowGroupType(TableRowGroupType tableRowGroupType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tableRowGroupType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTableRowsType(TableRowsType tableRowsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tableRowsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTableRowType(TableRowType tableRowType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tableRowType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTableSourceType(TableSourceType tableSourceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tableSourceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTableType(TableType tableType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tableType, diagnostics, context);
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
	public boolean validateTableTemplateType(TableTemplateType tableTemplateType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tableTemplateType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTargetRangeAddressType(TargetRangeAddressType targetRangeAddressType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(targetRangeAddressType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTrackedChangesType(TrackedChangesType trackedChangesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(trackedChangesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAcceptanceStateType(AcceptanceStateType acceptanceStateType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAlignType(AlignType alignType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBorderModelType(BorderModelType borderModelType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConditionSourceType(ConditionSourceType conditionSourceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataTypeType1(DataTypeType1 dataTypeType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataTypeTypeMember1(DataTypeTypeMember1 dataTypeTypeMember1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataTypeTypeMember2(DataTypeTypeMember2 dataTypeTypeMember2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataTypeTypeMember3(DataTypeTypeMember3 dataTypeTypeMember3, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDateEndTypeMember1(DateEndTypeMember1 dateEndTypeMember1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDateStartTypeMember1(DateStartTypeMember1 dateStartTypeMember1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDirectionType(DirectionType directionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDisplayListType(DisplayListType displayListType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDisplayMemberModeType(DisplayMemberModeType displayMemberModeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEndTypeMember1(EndTypeMember1 endTypeMember1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunctionTypeMember1(FunctionTypeMember1 functionTypeMember1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunctionTypeMember10(FunctionTypeMember10 functionTypeMember10, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunctionTypeMember11(FunctionTypeMember11 functionTypeMember11, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunctionTypeMember12(FunctionTypeMember12 functionTypeMember12, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunctionTypeMember2(FunctionTypeMember2 functionTypeMember2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunctionTypeMember3(FunctionTypeMember3 functionTypeMember3, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunctionTypeMember4(FunctionTypeMember4 functionTypeMember4, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunctionTypeMember5(FunctionTypeMember5 functionTypeMember5, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunctionTypeMember6(FunctionTypeMember6 functionTypeMember6, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunctionTypeMember7(FunctionTypeMember7 functionTypeMember7, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunctionTypeMember8(FunctionTypeMember8 functionTypeMember8, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunctionTypeMember9(FunctionTypeMember9 functionTypeMember9, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGrandTotalType(GrandTotalType grandTotalType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGroupedByType(GroupedByType groupedByType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLayoutModeType(LayoutModeType layoutModeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMemberTypeType(MemberTypeType memberTypeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMessageTypeType(MessageTypeType messageTypeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModeType(ModeType modeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNameType(NameType nameType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOrderType(OrderType orderType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOrientationType(OrientationType orientationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOrientationType1(OrientationType1 orientationType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRangeUsableAsTypeMember0(RangeUsableAsTypeMember0 rangeUsableAsTypeMember0, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRangeUsableAsTypeMember1BaseItem(RangeUsableAsTypeMember1BaseItem rangeUsableAsTypeMember1BaseItem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSortModeType(SortModeType sortModeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStartTypeMember1(StartTypeMember1 startTypeMember1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStatusType(StatusType statusType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeType(TypeType typeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeType1(TypeType1 typeType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUseLabelsType(UseLabelsType useLabelsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAcceptanceStateTypeObject(AcceptanceStateType acceptanceStateTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAlignTypeObject(AlignType alignTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBorderModelTypeObject(BorderModelType borderModelTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConditionSourceTypeObject(ConditionSourceType conditionSourceTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataTypeType(Object dataTypeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateDataTypeType_MemberTypes(dataTypeType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Data Type Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataTypeType_MemberTypes(Object dataTypeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (TablePackage.eINSTANCE.getDataTypeTypeMember1().isInstance(dataTypeType)) {
				if (validateDataTypeTypeMember1((DataTypeTypeMember1)dataTypeType, tempDiagnostics, context)) return true;
			}
			if (TablePackage.eINSTANCE.getDataTypeTypeMember2().isInstance(dataTypeType)) {
				if (validateDataTypeTypeMember2((DataTypeTypeMember2)dataTypeType, tempDiagnostics, context)) return true;
			}
			if (TablePackage.eINSTANCE.getDataTypeTypeMember3().isInstance(dataTypeType)) {
				if (validateDataTypeTypeMember3((DataTypeTypeMember3)dataTypeType, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (TablePackage.eINSTANCE.getDataTypeTypeMember1().isInstance(dataTypeType)) {
				if (validateDataTypeTypeMember1((DataTypeTypeMember1)dataTypeType, null, context)) return true;
			}
			if (TablePackage.eINSTANCE.getDataTypeTypeMember2().isInstance(dataTypeType)) {
				if (validateDataTypeTypeMember2((DataTypeTypeMember2)dataTypeType, null, context)) return true;
			}
			if (TablePackage.eINSTANCE.getDataTypeTypeMember3().isInstance(dataTypeType)) {
				if (validateDataTypeTypeMember3((DataTypeTypeMember3)dataTypeType, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataTypeTypeMember1Object(DataTypeTypeMember1 dataTypeTypeMember1Object, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataTypeTypeMember2Object(DataTypeTypeMember2 dataTypeTypeMember2Object, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataTypeTypeMember3Object(DataTypeTypeMember3 dataTypeTypeMember3Object, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataTypeTypeObject(DataTypeType1 dataTypeTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDateEndType(Object dateEndType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateDateEndType_MemberTypes(dateEndType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Date End Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDateEndType_MemberTypes(Object dateEndType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (TablePackage.eINSTANCE.getDateEndTypeMember1().isInstance(dateEndType)) {
				if (validateDateEndTypeMember1((DateEndTypeMember1)dateEndType, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (TablePackage.eINSTANCE.getDateEndTypeMember1().isInstance(dateEndType)) {
				if (validateDateEndTypeMember1((DateEndTypeMember1)dateEndType, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDateEndTypeMember1Object(DateEndTypeMember1 dateEndTypeMember1Object, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDateStartType(Object dateStartType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateDateStartType_MemberTypes(dateStartType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Date Start Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDateStartType_MemberTypes(Object dateStartType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (TablePackage.eINSTANCE.getDateStartTypeMember1().isInstance(dateStartType)) {
				if (validateDateStartTypeMember1((DateStartTypeMember1)dateStartType, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (TablePackage.eINSTANCE.getDateStartTypeMember1().isInstance(dateStartType)) {
				if (validateDateStartTypeMember1((DateStartTypeMember1)dateStartType, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDateStartTypeMember1Object(DateStartTypeMember1 dateStartTypeMember1Object, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDefaultCellStyleNameType(String defaultCellStyleNameType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateDefaultCellStyleNameType_MemberTypes(defaultCellStyleNameType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Default Cell Style Name Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDefaultCellStyleNameType_MemberTypes(String defaultCellStyleNameType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (TablePackage.eINSTANCE.getDefaultCellStyleNameTypeMember1().isInstance(defaultCellStyleNameType)) {
				if (validateDefaultCellStyleNameTypeMember1(defaultCellStyleNameType, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (TablePackage.eINSTANCE.getDefaultCellStyleNameTypeMember1().isInstance(defaultCellStyleNameType)) {
				if (validateDefaultCellStyleNameTypeMember1(defaultCellStyleNameType, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDefaultCellStyleNameTypeMember1(String defaultCellStyleNameTypeMember1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateDefaultCellStyleNameTypeMember1_MinLength(defaultCellStyleNameTypeMember1, diagnostics, context);
		if (result || diagnostics != null) result &= validateDefaultCellStyleNameTypeMember1_MaxLength(defaultCellStyleNameTypeMember1, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>Default Cell Style Name Type Member1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDefaultCellStyleNameTypeMember1_MinLength(String defaultCellStyleNameTypeMember1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = defaultCellStyleNameTypeMember1.length();
		boolean result = length >= 0;
		if (!result && diagnostics != null)
			reportMinLengthViolation(TablePackage.eINSTANCE.getDefaultCellStyleNameTypeMember1(), defaultCellStyleNameTypeMember1, length, 0, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Default Cell Style Name Type Member1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDefaultCellStyleNameTypeMember1_MaxLength(String defaultCellStyleNameTypeMember1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = defaultCellStyleNameTypeMember1.length();
		boolean result = length <= 0;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(TablePackage.eINSTANCE.getDefaultCellStyleNameTypeMember1(), defaultCellStyleNameTypeMember1, length, 0, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDirectionTypeObject(DirectionType directionTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDisplayListTypeObject(DisplayListType displayListTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDisplayMemberModeTypeObject(DisplayMemberModeType displayMemberModeTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEndType(Object endType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateEndType_MemberTypes(endType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>End Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEndType_MemberTypes(Object endType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (TablePackage.eINSTANCE.getEndTypeMember1().isInstance(endType)) {
				if (validateEndTypeMember1((EndTypeMember1)endType, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (TablePackage.eINSTANCE.getEndTypeMember1().isInstance(endType)) {
				if (validateEndTypeMember1((EndTypeMember1)endType, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEndTypeMember1Object(EndTypeMember1 endTypeMember1Object, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunctionType(Object functionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateFunctionType_MemberTypes(functionType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Function Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunctionType_MemberTypes(Object functionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (TablePackage.eINSTANCE.getFunctionTypeMember1().isInstance(functionType)) {
				if (validateFunctionTypeMember1((FunctionTypeMember1)functionType, tempDiagnostics, context)) return true;
			}
			if (TablePackage.eINSTANCE.getFunctionTypeMember2().isInstance(functionType)) {
				if (validateFunctionTypeMember2((FunctionTypeMember2)functionType, tempDiagnostics, context)) return true;
			}
			if (TablePackage.eINSTANCE.getFunctionTypeMember3().isInstance(functionType)) {
				if (validateFunctionTypeMember3((FunctionTypeMember3)functionType, tempDiagnostics, context)) return true;
			}
			if (TablePackage.eINSTANCE.getFunctionTypeMember4().isInstance(functionType)) {
				if (validateFunctionTypeMember4((FunctionTypeMember4)functionType, tempDiagnostics, context)) return true;
			}
			if (TablePackage.eINSTANCE.getFunctionTypeMember5().isInstance(functionType)) {
				if (validateFunctionTypeMember5((FunctionTypeMember5)functionType, tempDiagnostics, context)) return true;
			}
			if (TablePackage.eINSTANCE.getFunctionTypeMember6().isInstance(functionType)) {
				if (validateFunctionTypeMember6((FunctionTypeMember6)functionType, tempDiagnostics, context)) return true;
			}
			if (TablePackage.eINSTANCE.getFunctionTypeMember7().isInstance(functionType)) {
				if (validateFunctionTypeMember7((FunctionTypeMember7)functionType, tempDiagnostics, context)) return true;
			}
			if (TablePackage.eINSTANCE.getFunctionTypeMember8().isInstance(functionType)) {
				if (validateFunctionTypeMember8((FunctionTypeMember8)functionType, tempDiagnostics, context)) return true;
			}
			if (TablePackage.eINSTANCE.getFunctionTypeMember9().isInstance(functionType)) {
				if (validateFunctionTypeMember9((FunctionTypeMember9)functionType, tempDiagnostics, context)) return true;
			}
			if (TablePackage.eINSTANCE.getFunctionTypeMember10().isInstance(functionType)) {
				if (validateFunctionTypeMember10((FunctionTypeMember10)functionType, tempDiagnostics, context)) return true;
			}
			if (TablePackage.eINSTANCE.getFunctionTypeMember11().isInstance(functionType)) {
				if (validateFunctionTypeMember11((FunctionTypeMember11)functionType, tempDiagnostics, context)) return true;
			}
			if (TablePackage.eINSTANCE.getFunctionTypeMember12().isInstance(functionType)) {
				if (validateFunctionTypeMember12((FunctionTypeMember12)functionType, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (TablePackage.eINSTANCE.getFunctionTypeMember1().isInstance(functionType)) {
				if (validateFunctionTypeMember1((FunctionTypeMember1)functionType, null, context)) return true;
			}
			if (TablePackage.eINSTANCE.getFunctionTypeMember2().isInstance(functionType)) {
				if (validateFunctionTypeMember2((FunctionTypeMember2)functionType, null, context)) return true;
			}
			if (TablePackage.eINSTANCE.getFunctionTypeMember3().isInstance(functionType)) {
				if (validateFunctionTypeMember3((FunctionTypeMember3)functionType, null, context)) return true;
			}
			if (TablePackage.eINSTANCE.getFunctionTypeMember4().isInstance(functionType)) {
				if (validateFunctionTypeMember4((FunctionTypeMember4)functionType, null, context)) return true;
			}
			if (TablePackage.eINSTANCE.getFunctionTypeMember5().isInstance(functionType)) {
				if (validateFunctionTypeMember5((FunctionTypeMember5)functionType, null, context)) return true;
			}
			if (TablePackage.eINSTANCE.getFunctionTypeMember6().isInstance(functionType)) {
				if (validateFunctionTypeMember6((FunctionTypeMember6)functionType, null, context)) return true;
			}
			if (TablePackage.eINSTANCE.getFunctionTypeMember7().isInstance(functionType)) {
				if (validateFunctionTypeMember7((FunctionTypeMember7)functionType, null, context)) return true;
			}
			if (TablePackage.eINSTANCE.getFunctionTypeMember8().isInstance(functionType)) {
				if (validateFunctionTypeMember8((FunctionTypeMember8)functionType, null, context)) return true;
			}
			if (TablePackage.eINSTANCE.getFunctionTypeMember9().isInstance(functionType)) {
				if (validateFunctionTypeMember9((FunctionTypeMember9)functionType, null, context)) return true;
			}
			if (TablePackage.eINSTANCE.getFunctionTypeMember10().isInstance(functionType)) {
				if (validateFunctionTypeMember10((FunctionTypeMember10)functionType, null, context)) return true;
			}
			if (TablePackage.eINSTANCE.getFunctionTypeMember11().isInstance(functionType)) {
				if (validateFunctionTypeMember11((FunctionTypeMember11)functionType, null, context)) return true;
			}
			if (TablePackage.eINSTANCE.getFunctionTypeMember12().isInstance(functionType)) {
				if (validateFunctionTypeMember12((FunctionTypeMember12)functionType, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunctionTypeMember10Object(FunctionTypeMember10 functionTypeMember10Object, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunctionTypeMember11Object(FunctionTypeMember11 functionTypeMember11Object, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunctionTypeMember12Object(FunctionTypeMember12 functionTypeMember12Object, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunctionTypeMember1Object(FunctionTypeMember1 functionTypeMember1Object, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunctionTypeMember2Object(FunctionTypeMember2 functionTypeMember2Object, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunctionTypeMember3Object(FunctionTypeMember3 functionTypeMember3Object, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunctionTypeMember4Object(FunctionTypeMember4 functionTypeMember4Object, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunctionTypeMember5Object(FunctionTypeMember5 functionTypeMember5Object, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunctionTypeMember6Object(FunctionTypeMember6 functionTypeMember6Object, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunctionTypeMember7Object(FunctionTypeMember7 functionTypeMember7Object, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunctionTypeMember8Object(FunctionTypeMember8 functionTypeMember8Object, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunctionTypeMember9Object(FunctionTypeMember9 functionTypeMember9Object, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGrandTotalTypeObject(GrandTotalType grandTotalTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGroupedByTypeObject(GroupedByType groupedByTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLayoutModeTypeObject(LayoutModeType layoutModeTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMemberTypeTypeObject(MemberTypeType memberTypeTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMessageTypeTypeObject(MessageTypeType messageTypeTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModeTypeObject(ModeType modeTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNameTypeObject(NameType nameTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOrderTypeObject(OrderType orderTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOrientationTypeObject(OrientationType orientationTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOrientationTypeObject1(OrientationType1 orientationTypeObject1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRangeUsableAsType(Object rangeUsableAsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateRangeUsableAsType_MemberTypes(rangeUsableAsType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Range Usable As Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRangeUsableAsType_MemberTypes(Object rangeUsableAsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (TablePackage.eINSTANCE.getRangeUsableAsTypeMember0().isInstance(rangeUsableAsType)) {
				if (validateRangeUsableAsTypeMember0((RangeUsableAsTypeMember0)rangeUsableAsType, tempDiagnostics, context)) return true;
			}
			if (TablePackage.eINSTANCE.getRangeUsableAsTypeMember1().isInstance(rangeUsableAsType)) {
				if (validateRangeUsableAsTypeMember1((List)rangeUsableAsType, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (TablePackage.eINSTANCE.getRangeUsableAsTypeMember0().isInstance(rangeUsableAsType)) {
				if (validateRangeUsableAsTypeMember0((RangeUsableAsTypeMember0)rangeUsableAsType, null, context)) return true;
			}
			if (TablePackage.eINSTANCE.getRangeUsableAsTypeMember1().isInstance(rangeUsableAsType)) {
				if (validateRangeUsableAsTypeMember1((List)rangeUsableAsType, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRangeUsableAsTypeMember0Object(RangeUsableAsTypeMember0 rangeUsableAsTypeMember0Object, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRangeUsableAsTypeMember1(List rangeUsableAsTypeMember1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateRangeUsableAsTypeMember1_MinLength(rangeUsableAsTypeMember1, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>Range Usable As Type Member1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRangeUsableAsTypeMember1_MinLength(List rangeUsableAsTypeMember1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = rangeUsableAsTypeMember1.size();
		boolean result = length >= 1;
		if (!result && diagnostics != null)
			reportMinLengthViolation(TablePackage.eINSTANCE.getRangeUsableAsTypeMember1(), rangeUsableAsTypeMember1, length, 1, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRangeUsableAsTypeMember1Base(List<?> rangeUsableAsTypeMember1Base, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateRangeUsableAsTypeMember1Base_ItemType(rangeUsableAsTypeMember1Base, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ItemType constraint of '<em>Range Usable As Type Member1 Base</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRangeUsableAsTypeMember1Base_ItemType(List<?> rangeUsableAsTypeMember1Base, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = true;
		for (Iterator<?> i = rangeUsableAsTypeMember1Base.iterator(); i.hasNext() && (result || diagnostics != null); ) {
			Object item = i.next();
			if (TablePackage.eINSTANCE.getRangeUsableAsTypeMember1BaseItem().isInstance(item)) {
				result &= validateRangeUsableAsTypeMember1BaseItem((RangeUsableAsTypeMember1BaseItem)item, diagnostics, context);
			}
			else {
				result = false;
				reportDataValueTypeViolation(TablePackage.eINSTANCE.getRangeUsableAsTypeMember1BaseItem(), item, diagnostics, context);
			}
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRangeUsableAsTypeMember1BaseItemObject(RangeUsableAsTypeMember1BaseItem rangeUsableAsTypeMember1BaseItemObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSortModeTypeObject(SortModeType sortModeTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStartType(Object startType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateStartType_MemberTypes(startType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Start Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStartType_MemberTypes(Object startType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (TablePackage.eINSTANCE.getStartTypeMember1().isInstance(startType)) {
				if (validateStartTypeMember1((StartTypeMember1)startType, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (TablePackage.eINSTANCE.getStartTypeMember1().isInstance(startType)) {
				if (validateStartTypeMember1((StartTypeMember1)startType, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStartTypeMember1Object(StartTypeMember1 startTypeMember1Object, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStatusTypeObject(StatusType statusTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
			if (TablePackage.eINSTANCE.getStyleNameTypeMember1().isInstance(styleNameType)) {
				if (validateStyleNameTypeMember1(styleNameType, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (TablePackage.eINSTANCE.getStyleNameTypeMember1().isInstance(styleNameType)) {
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
			reportMinLengthViolation(TablePackage.eINSTANCE.getStyleNameTypeMember1(), styleNameTypeMember1, length, 0, diagnostics, context);
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
			reportMaxLengthViolation(TablePackage.eINSTANCE.getStyleNameTypeMember1(), styleNameTypeMember1, length, 0, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeTypeObject(TypeType typeTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeTypeObject1(TypeType1 typeTypeObject1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUseLabelsTypeObject(UseLabelsType useLabelsTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
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

} //TableValidator
