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
package org.oasisopen.names.tc.opendocument.xmlns.table.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;
import org.oasisopen.names.tc.opendocument.xmlns.table.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TableFactoryImpl extends EFactoryImpl implements TableFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TableFactory init() {
		try {
			TableFactory theTableFactory = (TableFactory)EPackage.Registry.INSTANCE.getEFactory("urn:oasis:names:tc:opendocument:xmlns:table:1.0"); 
			if (theTableFactory != null) {
				return theTableFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TableFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TableFactoryImpl() {
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
			case TablePackage.BODY_TYPE: return createBodyType();
			case TablePackage.CALCULATION_SETTINGS_TYPE: return createCalculationSettingsType();
			case TablePackage.CELL_ADDRESS_TYPE: return createCellAddressType();
			case TablePackage.CELL_CONTENT_CHANGE_TYPE: return createCellContentChangeType();
			case TablePackage.CELL_CONTENT_DELETION_TYPE: return createCellContentDeletionType();
			case TablePackage.CELL_RANGE_SOURCE_TYPE: return createCellRangeSourceType();
			case TablePackage.CHANGE_DELETION_TYPE: return createChangeDeletionType();
			case TablePackage.CHANGE_TRACK_TABLE_CELL_TYPE: return createChangeTrackTableCellType();
			case TablePackage.CONSOLIDATION_TYPE: return createConsolidationType();
			case TablePackage.CONTENT_VALIDATIONS_TYPE: return createContentValidationsType();
			case TablePackage.CONTENT_VALIDATION_TYPE: return createContentValidationType();
			case TablePackage.COVERED_TABLE_CELL_TYPE: return createCoveredTableCellType();
			case TablePackage.CUT_OFFS_TYPE: return createCutOffsType();
			case TablePackage.DATABASE_RANGES_TYPE: return createDatabaseRangesType();
			case TablePackage.DATABASE_RANGE_TYPE: return createDatabaseRangeType();
			case TablePackage.DATABASE_SOURCE_QUERY_TYPE: return createDatabaseSourceQueryType();
			case TablePackage.DATABASE_SOURCE_SQL_TYPE: return createDatabaseSourceSqlType();
			case TablePackage.DATABASE_SOURCE_TABLE_TYPE: return createDatabaseSourceTableType();
			case TablePackage.DATA_PILOT_DISPLAY_INFO_TYPE: return createDataPilotDisplayInfoType();
			case TablePackage.DATA_PILOT_FIELD_REFERENCE_TYPE: return createDataPilotFieldReferenceType();
			case TablePackage.DATA_PILOT_FIELD_TYPE: return createDataPilotFieldType();
			case TablePackage.DATA_PILOT_GROUP_MEMBER_TYPE: return createDataPilotGroupMemberType();
			case TablePackage.DATA_PILOT_GROUPS_TYPE: return createDataPilotGroupsType();
			case TablePackage.DATA_PILOT_GROUP_TYPE: return createDataPilotGroupType();
			case TablePackage.DATA_PILOT_LAYOUT_INFO_TYPE: return createDataPilotLayoutInfoType();
			case TablePackage.DATA_PILOT_LEVEL_TYPE: return createDataPilotLevelType();
			case TablePackage.DATA_PILOT_MEMBERS_TYPE: return createDataPilotMembersType();
			case TablePackage.DATA_PILOT_MEMBER_TYPE: return createDataPilotMemberType();
			case TablePackage.DATA_PILOT_SORT_INFO_TYPE: return createDataPilotSortInfoType();
			case TablePackage.DATA_PILOT_SUBTOTALS_TYPE: return createDataPilotSubtotalsType();
			case TablePackage.DATA_PILOT_SUBTOTAL_TYPE: return createDataPilotSubtotalType();
			case TablePackage.DATA_PILOT_TABLES_TYPE: return createDataPilotTablesType();
			case TablePackage.DATA_PILOT_TABLE_TYPE: return createDataPilotTableType();
			case TablePackage.DDE_LINKS_TYPE: return createDdeLinksType();
			case TablePackage.DDE_LINK_TYPE: return createDdeLinkType();
			case TablePackage.DELETIONS_TYPE: return createDeletionsType();
			case TablePackage.DELETION_TYPE: return createDeletionType();
			case TablePackage.DEPENDENCIES_TYPE: return createDependenciesType();
			case TablePackage.DEPENDENCY_TYPE: return createDependencyType();
			case TablePackage.DETECTIVE_TYPE: return createDetectiveType();
			case TablePackage.ERROR_MACRO_TYPE: return createErrorMacroType();
			case TablePackage.ERROR_MESSAGE_TYPE: return createErrorMessageType();
			case TablePackage.EVEN_COLUMNS_TYPE: return createEvenColumnsType();
			case TablePackage.EVEN_ROWS_TYPE: return createEvenRowsType();
			case TablePackage.FILTER_AND_TYPE: return createFilterAndType();
			case TablePackage.FILTER_CONDITION_TYPE: return createFilterConditionType();
			case TablePackage.FILTER_OR_TYPE: return createFilterOrType();
			case TablePackage.FILTER_TYPE: return createFilterType();
			case TablePackage.FIRST_COLUMN_TYPE: return createFirstColumnType();
			case TablePackage.FIRST_ROW_TYPE: return createFirstRowType();
			case TablePackage.HELP_MESSAGE_TYPE: return createHelpMessageType();
			case TablePackage.HIGHLIGHTED_RANGE_TYPE: return createHighlightedRangeType();
			case TablePackage.INSERTION_CUT_OFF_TYPE: return createInsertionCutOffType();
			case TablePackage.INSERTION_TYPE: return createInsertionType();
			case TablePackage.ITERATION_TYPE: return createIterationType();
			case TablePackage.LABEL_RANGES_TYPE: return createLabelRangesType();
			case TablePackage.LABEL_RANGE_TYPE: return createLabelRangeType();
			case TablePackage.LAST_COLUMN_TYPE: return createLastColumnType();
			case TablePackage.LAST_ROW_TYPE: return createLastRowType();
			case TablePackage.MOVEMENT_CUT_OFF_TYPE: return createMovementCutOffType();
			case TablePackage.MOVEMENT_TYPE: return createMovementType();
			case TablePackage.NAMED_EXPRESSIONS_TYPE: return createNamedExpressionsType();
			case TablePackage.NAMED_EXPRESSION_TYPE: return createNamedExpressionType();
			case TablePackage.NAMED_RANGE_TYPE: return createNamedRangeType();
			case TablePackage.NULL_DATE_TYPE: return createNullDateType();
			case TablePackage.ODD_COLUMNS_TYPE: return createOddColumnsType();
			case TablePackage.ODD_ROWS_TYPE: return createOddRowsType();
			case TablePackage.OPERATION_TYPE: return createOperationType();
			case TablePackage.PREVIOUS_TYPE: return createPreviousType();
			case TablePackage.SCENARIO_TYPE: return createScenarioType();
			case TablePackage.SHAPES_TYPE: return createShapesType();
			case TablePackage.SORT_BY_TYPE: return createSortByType();
			case TablePackage.SORT_GROUPS_TYPE: return createSortGroupsType();
			case TablePackage.SORT_TYPE: return createSortType();
			case TablePackage.SOURCE_CELL_RANGE_TYPE: return createSourceCellRangeType();
			case TablePackage.SOURCE_RANGE_ADDRESS_TYPE: return createSourceRangeAddressType();
			case TablePackage.SOURCE_SERVICE_TYPE: return createSourceServiceType();
			case TablePackage.SUBTOTAL_FIELD_TYPE: return createSubtotalFieldType();
			case TablePackage.SUBTOTAL_RULES_TYPE: return createSubtotalRulesType();
			case TablePackage.SUBTOTAL_RULE_TYPE: return createSubtotalRuleType();
			case TablePackage.TABLE_CELL_TYPE: return createTableCellType();
			case TablePackage.TABLE_COLUMN_GROUP_TYPE: return createTableColumnGroupType();
			case TablePackage.TABLE_COLUMNS_TYPE: return createTableColumnsType();
			case TablePackage.TABLE_COLUMN_TYPE: return createTableColumnType();
			case TablePackage.TABLE_HEADER_COLUMNS_TYPE: return createTableHeaderColumnsType();
			case TablePackage.TABLE_HEADER_ROWS_TYPE: return createTableHeaderRowsType();
			case TablePackage.TABLE_ROW_GROUP_TYPE: return createTableRowGroupType();
			case TablePackage.TABLE_ROWS_TYPE: return createTableRowsType();
			case TablePackage.TABLE_ROW_TYPE: return createTableRowType();
			case TablePackage.TABLE_SOURCE_TYPE: return createTableSourceType();
			case TablePackage.TABLE_TYPE: return createTableType();
			case TablePackage.DOCUMENT_ROOT: return createDocumentRoot();
			case TablePackage.TABLE_TEMPLATE_TYPE: return createTableTemplateType();
			case TablePackage.TARGET_RANGE_ADDRESS_TYPE: return createTargetRangeAddressType();
			case TablePackage.TRACKED_CHANGES_TYPE: return createTrackedChangesType();
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
			case TablePackage.ACCEPTANCE_STATE_TYPE:
				return createAcceptanceStateTypeFromString(eDataType, initialValue);
			case TablePackage.ALIGN_TYPE:
				return createAlignTypeFromString(eDataType, initialValue);
			case TablePackage.BORDER_MODEL_TYPE:
				return createBorderModelTypeFromString(eDataType, initialValue);
			case TablePackage.CONDITION_SOURCE_TYPE:
				return createConditionSourceTypeFromString(eDataType, initialValue);
			case TablePackage.DATA_TYPE_TYPE1:
				return createDataTypeType1FromString(eDataType, initialValue);
			case TablePackage.DATA_TYPE_TYPE_MEMBER1:
				return createDataTypeTypeMember1FromString(eDataType, initialValue);
			case TablePackage.DATA_TYPE_TYPE_MEMBER2:
				return createDataTypeTypeMember2FromString(eDataType, initialValue);
			case TablePackage.DATA_TYPE_TYPE_MEMBER3:
				return createDataTypeTypeMember3FromString(eDataType, initialValue);
			case TablePackage.DATE_END_TYPE_MEMBER1:
				return createDateEndTypeMember1FromString(eDataType, initialValue);
			case TablePackage.DATE_START_TYPE_MEMBER1:
				return createDateStartTypeMember1FromString(eDataType, initialValue);
			case TablePackage.DIRECTION_TYPE:
				return createDirectionTypeFromString(eDataType, initialValue);
			case TablePackage.DISPLAY_LIST_TYPE:
				return createDisplayListTypeFromString(eDataType, initialValue);
			case TablePackage.DISPLAY_MEMBER_MODE_TYPE:
				return createDisplayMemberModeTypeFromString(eDataType, initialValue);
			case TablePackage.END_TYPE_MEMBER1:
				return createEndTypeMember1FromString(eDataType, initialValue);
			case TablePackage.FUNCTION_TYPE_MEMBER1:
				return createFunctionTypeMember1FromString(eDataType, initialValue);
			case TablePackage.FUNCTION_TYPE_MEMBER10:
				return createFunctionTypeMember10FromString(eDataType, initialValue);
			case TablePackage.FUNCTION_TYPE_MEMBER11:
				return createFunctionTypeMember11FromString(eDataType, initialValue);
			case TablePackage.FUNCTION_TYPE_MEMBER12:
				return createFunctionTypeMember12FromString(eDataType, initialValue);
			case TablePackage.FUNCTION_TYPE_MEMBER2:
				return createFunctionTypeMember2FromString(eDataType, initialValue);
			case TablePackage.FUNCTION_TYPE_MEMBER3:
				return createFunctionTypeMember3FromString(eDataType, initialValue);
			case TablePackage.FUNCTION_TYPE_MEMBER4:
				return createFunctionTypeMember4FromString(eDataType, initialValue);
			case TablePackage.FUNCTION_TYPE_MEMBER5:
				return createFunctionTypeMember5FromString(eDataType, initialValue);
			case TablePackage.FUNCTION_TYPE_MEMBER6:
				return createFunctionTypeMember6FromString(eDataType, initialValue);
			case TablePackage.FUNCTION_TYPE_MEMBER7:
				return createFunctionTypeMember7FromString(eDataType, initialValue);
			case TablePackage.FUNCTION_TYPE_MEMBER8:
				return createFunctionTypeMember8FromString(eDataType, initialValue);
			case TablePackage.FUNCTION_TYPE_MEMBER9:
				return createFunctionTypeMember9FromString(eDataType, initialValue);
			case TablePackage.GRAND_TOTAL_TYPE:
				return createGrandTotalTypeFromString(eDataType, initialValue);
			case TablePackage.GROUPED_BY_TYPE:
				return createGroupedByTypeFromString(eDataType, initialValue);
			case TablePackage.LAYOUT_MODE_TYPE:
				return createLayoutModeTypeFromString(eDataType, initialValue);
			case TablePackage.MEMBER_TYPE_TYPE:
				return createMemberTypeTypeFromString(eDataType, initialValue);
			case TablePackage.MESSAGE_TYPE_TYPE:
				return createMessageTypeTypeFromString(eDataType, initialValue);
			case TablePackage.MODE_TYPE:
				return createModeTypeFromString(eDataType, initialValue);
			case TablePackage.NAME_TYPE:
				return createNameTypeFromString(eDataType, initialValue);
			case TablePackage.ORDER_TYPE:
				return createOrderTypeFromString(eDataType, initialValue);
			case TablePackage.ORIENTATION_TYPE:
				return createOrientationTypeFromString(eDataType, initialValue);
			case TablePackage.ORIENTATION_TYPE1:
				return createOrientationType1FromString(eDataType, initialValue);
			case TablePackage.RANGE_USABLE_AS_TYPE_MEMBER0:
				return createRangeUsableAsTypeMember0FromString(eDataType, initialValue);
			case TablePackage.RANGE_USABLE_AS_TYPE_MEMBER1_BASE_ITEM:
				return createRangeUsableAsTypeMember1BaseItemFromString(eDataType, initialValue);
			case TablePackage.SORT_MODE_TYPE:
				return createSortModeTypeFromString(eDataType, initialValue);
			case TablePackage.START_TYPE_MEMBER1:
				return createStartTypeMember1FromString(eDataType, initialValue);
			case TablePackage.STATUS_TYPE:
				return createStatusTypeFromString(eDataType, initialValue);
			case TablePackage.TYPE_TYPE:
				return createTypeTypeFromString(eDataType, initialValue);
			case TablePackage.TYPE_TYPE1:
				return createTypeType1FromString(eDataType, initialValue);
			case TablePackage.USE_LABELS_TYPE:
				return createUseLabelsTypeFromString(eDataType, initialValue);
			case TablePackage.ACCEPTANCE_STATE_TYPE_OBJECT:
				return createAcceptanceStateTypeObjectFromString(eDataType, initialValue);
			case TablePackage.ALIGN_TYPE_OBJECT:
				return createAlignTypeObjectFromString(eDataType, initialValue);
			case TablePackage.BORDER_MODEL_TYPE_OBJECT:
				return createBorderModelTypeObjectFromString(eDataType, initialValue);
			case TablePackage.CONDITION_SOURCE_TYPE_OBJECT:
				return createConditionSourceTypeObjectFromString(eDataType, initialValue);
			case TablePackage.DATA_TYPE_TYPE:
				return createDataTypeTypeFromString(eDataType, initialValue);
			case TablePackage.DATA_TYPE_TYPE_MEMBER1_OBJECT:
				return createDataTypeTypeMember1ObjectFromString(eDataType, initialValue);
			case TablePackage.DATA_TYPE_TYPE_MEMBER2_OBJECT:
				return createDataTypeTypeMember2ObjectFromString(eDataType, initialValue);
			case TablePackage.DATA_TYPE_TYPE_MEMBER3_OBJECT:
				return createDataTypeTypeMember3ObjectFromString(eDataType, initialValue);
			case TablePackage.DATA_TYPE_TYPE_OBJECT:
				return createDataTypeTypeObjectFromString(eDataType, initialValue);
			case TablePackage.DATE_END_TYPE:
				return createDateEndTypeFromString(eDataType, initialValue);
			case TablePackage.DATE_END_TYPE_MEMBER1_OBJECT:
				return createDateEndTypeMember1ObjectFromString(eDataType, initialValue);
			case TablePackage.DATE_START_TYPE:
				return createDateStartTypeFromString(eDataType, initialValue);
			case TablePackage.DATE_START_TYPE_MEMBER1_OBJECT:
				return createDateStartTypeMember1ObjectFromString(eDataType, initialValue);
			case TablePackage.DEFAULT_CELL_STYLE_NAME_TYPE:
				return createDefaultCellStyleNameTypeFromString(eDataType, initialValue);
			case TablePackage.DEFAULT_CELL_STYLE_NAME_TYPE_MEMBER1:
				return createDefaultCellStyleNameTypeMember1FromString(eDataType, initialValue);
			case TablePackage.DIRECTION_TYPE_OBJECT:
				return createDirectionTypeObjectFromString(eDataType, initialValue);
			case TablePackage.DISPLAY_LIST_TYPE_OBJECT:
				return createDisplayListTypeObjectFromString(eDataType, initialValue);
			case TablePackage.DISPLAY_MEMBER_MODE_TYPE_OBJECT:
				return createDisplayMemberModeTypeObjectFromString(eDataType, initialValue);
			case TablePackage.END_TYPE:
				return createEndTypeFromString(eDataType, initialValue);
			case TablePackage.END_TYPE_MEMBER1_OBJECT:
				return createEndTypeMember1ObjectFromString(eDataType, initialValue);
			case TablePackage.FUNCTION_TYPE:
				return createFunctionTypeFromString(eDataType, initialValue);
			case TablePackage.FUNCTION_TYPE_MEMBER10_OBJECT:
				return createFunctionTypeMember10ObjectFromString(eDataType, initialValue);
			case TablePackage.FUNCTION_TYPE_MEMBER11_OBJECT:
				return createFunctionTypeMember11ObjectFromString(eDataType, initialValue);
			case TablePackage.FUNCTION_TYPE_MEMBER12_OBJECT:
				return createFunctionTypeMember12ObjectFromString(eDataType, initialValue);
			case TablePackage.FUNCTION_TYPE_MEMBER1_OBJECT:
				return createFunctionTypeMember1ObjectFromString(eDataType, initialValue);
			case TablePackage.FUNCTION_TYPE_MEMBER2_OBJECT:
				return createFunctionTypeMember2ObjectFromString(eDataType, initialValue);
			case TablePackage.FUNCTION_TYPE_MEMBER3_OBJECT:
				return createFunctionTypeMember3ObjectFromString(eDataType, initialValue);
			case TablePackage.FUNCTION_TYPE_MEMBER4_OBJECT:
				return createFunctionTypeMember4ObjectFromString(eDataType, initialValue);
			case TablePackage.FUNCTION_TYPE_MEMBER5_OBJECT:
				return createFunctionTypeMember5ObjectFromString(eDataType, initialValue);
			case TablePackage.FUNCTION_TYPE_MEMBER6_OBJECT:
				return createFunctionTypeMember6ObjectFromString(eDataType, initialValue);
			case TablePackage.FUNCTION_TYPE_MEMBER7_OBJECT:
				return createFunctionTypeMember7ObjectFromString(eDataType, initialValue);
			case TablePackage.FUNCTION_TYPE_MEMBER8_OBJECT:
				return createFunctionTypeMember8ObjectFromString(eDataType, initialValue);
			case TablePackage.FUNCTION_TYPE_MEMBER9_OBJECT:
				return createFunctionTypeMember9ObjectFromString(eDataType, initialValue);
			case TablePackage.GRAND_TOTAL_TYPE_OBJECT:
				return createGrandTotalTypeObjectFromString(eDataType, initialValue);
			case TablePackage.GROUPED_BY_TYPE_OBJECT:
				return createGroupedByTypeObjectFromString(eDataType, initialValue);
			case TablePackage.LAYOUT_MODE_TYPE_OBJECT:
				return createLayoutModeTypeObjectFromString(eDataType, initialValue);
			case TablePackage.MEMBER_TYPE_TYPE_OBJECT:
				return createMemberTypeTypeObjectFromString(eDataType, initialValue);
			case TablePackage.MESSAGE_TYPE_TYPE_OBJECT:
				return createMessageTypeTypeObjectFromString(eDataType, initialValue);
			case TablePackage.MODE_TYPE_OBJECT:
				return createModeTypeObjectFromString(eDataType, initialValue);
			case TablePackage.NAME_TYPE_OBJECT:
				return createNameTypeObjectFromString(eDataType, initialValue);
			case TablePackage.ORDER_TYPE_OBJECT:
				return createOrderTypeObjectFromString(eDataType, initialValue);
			case TablePackage.ORIENTATION_TYPE_OBJECT:
				return createOrientationTypeObjectFromString(eDataType, initialValue);
			case TablePackage.ORIENTATION_TYPE_OBJECT1:
				return createOrientationTypeObject1FromString(eDataType, initialValue);
			case TablePackage.RANGE_USABLE_AS_TYPE:
				return createRangeUsableAsTypeFromString(eDataType, initialValue);
			case TablePackage.RANGE_USABLE_AS_TYPE_MEMBER0_OBJECT:
				return createRangeUsableAsTypeMember0ObjectFromString(eDataType, initialValue);
			case TablePackage.RANGE_USABLE_AS_TYPE_MEMBER1:
				return createRangeUsableAsTypeMember1FromString(eDataType, initialValue);
			case TablePackage.RANGE_USABLE_AS_TYPE_MEMBER1_BASE:
				return createRangeUsableAsTypeMember1BaseFromString(eDataType, initialValue);
			case TablePackage.RANGE_USABLE_AS_TYPE_MEMBER1_BASE_ITEM_OBJECT:
				return createRangeUsableAsTypeMember1BaseItemObjectFromString(eDataType, initialValue);
			case TablePackage.SORT_MODE_TYPE_OBJECT:
				return createSortModeTypeObjectFromString(eDataType, initialValue);
			case TablePackage.START_TYPE:
				return createStartTypeFromString(eDataType, initialValue);
			case TablePackage.START_TYPE_MEMBER1_OBJECT:
				return createStartTypeMember1ObjectFromString(eDataType, initialValue);
			case TablePackage.STATUS_TYPE_OBJECT:
				return createStatusTypeObjectFromString(eDataType, initialValue);
			case TablePackage.STYLE_NAME_TYPE:
				return createStyleNameTypeFromString(eDataType, initialValue);
			case TablePackage.STYLE_NAME_TYPE_MEMBER1:
				return createStyleNameTypeMember1FromString(eDataType, initialValue);
			case TablePackage.TYPE_TYPE_OBJECT:
				return createTypeTypeObjectFromString(eDataType, initialValue);
			case TablePackage.TYPE_TYPE_OBJECT1:
				return createTypeTypeObject1FromString(eDataType, initialValue);
			case TablePackage.USE_LABELS_TYPE_OBJECT:
				return createUseLabelsTypeObjectFromString(eDataType, initialValue);
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
			case TablePackage.ACCEPTANCE_STATE_TYPE:
				return convertAcceptanceStateTypeToString(eDataType, instanceValue);
			case TablePackage.ALIGN_TYPE:
				return convertAlignTypeToString(eDataType, instanceValue);
			case TablePackage.BORDER_MODEL_TYPE:
				return convertBorderModelTypeToString(eDataType, instanceValue);
			case TablePackage.CONDITION_SOURCE_TYPE:
				return convertConditionSourceTypeToString(eDataType, instanceValue);
			case TablePackage.DATA_TYPE_TYPE1:
				return convertDataTypeType1ToString(eDataType, instanceValue);
			case TablePackage.DATA_TYPE_TYPE_MEMBER1:
				return convertDataTypeTypeMember1ToString(eDataType, instanceValue);
			case TablePackage.DATA_TYPE_TYPE_MEMBER2:
				return convertDataTypeTypeMember2ToString(eDataType, instanceValue);
			case TablePackage.DATA_TYPE_TYPE_MEMBER3:
				return convertDataTypeTypeMember3ToString(eDataType, instanceValue);
			case TablePackage.DATE_END_TYPE_MEMBER1:
				return convertDateEndTypeMember1ToString(eDataType, instanceValue);
			case TablePackage.DATE_START_TYPE_MEMBER1:
				return convertDateStartTypeMember1ToString(eDataType, instanceValue);
			case TablePackage.DIRECTION_TYPE:
				return convertDirectionTypeToString(eDataType, instanceValue);
			case TablePackage.DISPLAY_LIST_TYPE:
				return convertDisplayListTypeToString(eDataType, instanceValue);
			case TablePackage.DISPLAY_MEMBER_MODE_TYPE:
				return convertDisplayMemberModeTypeToString(eDataType, instanceValue);
			case TablePackage.END_TYPE_MEMBER1:
				return convertEndTypeMember1ToString(eDataType, instanceValue);
			case TablePackage.FUNCTION_TYPE_MEMBER1:
				return convertFunctionTypeMember1ToString(eDataType, instanceValue);
			case TablePackage.FUNCTION_TYPE_MEMBER10:
				return convertFunctionTypeMember10ToString(eDataType, instanceValue);
			case TablePackage.FUNCTION_TYPE_MEMBER11:
				return convertFunctionTypeMember11ToString(eDataType, instanceValue);
			case TablePackage.FUNCTION_TYPE_MEMBER12:
				return convertFunctionTypeMember12ToString(eDataType, instanceValue);
			case TablePackage.FUNCTION_TYPE_MEMBER2:
				return convertFunctionTypeMember2ToString(eDataType, instanceValue);
			case TablePackage.FUNCTION_TYPE_MEMBER3:
				return convertFunctionTypeMember3ToString(eDataType, instanceValue);
			case TablePackage.FUNCTION_TYPE_MEMBER4:
				return convertFunctionTypeMember4ToString(eDataType, instanceValue);
			case TablePackage.FUNCTION_TYPE_MEMBER5:
				return convertFunctionTypeMember5ToString(eDataType, instanceValue);
			case TablePackage.FUNCTION_TYPE_MEMBER6:
				return convertFunctionTypeMember6ToString(eDataType, instanceValue);
			case TablePackage.FUNCTION_TYPE_MEMBER7:
				return convertFunctionTypeMember7ToString(eDataType, instanceValue);
			case TablePackage.FUNCTION_TYPE_MEMBER8:
				return convertFunctionTypeMember8ToString(eDataType, instanceValue);
			case TablePackage.FUNCTION_TYPE_MEMBER9:
				return convertFunctionTypeMember9ToString(eDataType, instanceValue);
			case TablePackage.GRAND_TOTAL_TYPE:
				return convertGrandTotalTypeToString(eDataType, instanceValue);
			case TablePackage.GROUPED_BY_TYPE:
				return convertGroupedByTypeToString(eDataType, instanceValue);
			case TablePackage.LAYOUT_MODE_TYPE:
				return convertLayoutModeTypeToString(eDataType, instanceValue);
			case TablePackage.MEMBER_TYPE_TYPE:
				return convertMemberTypeTypeToString(eDataType, instanceValue);
			case TablePackage.MESSAGE_TYPE_TYPE:
				return convertMessageTypeTypeToString(eDataType, instanceValue);
			case TablePackage.MODE_TYPE:
				return convertModeTypeToString(eDataType, instanceValue);
			case TablePackage.NAME_TYPE:
				return convertNameTypeToString(eDataType, instanceValue);
			case TablePackage.ORDER_TYPE:
				return convertOrderTypeToString(eDataType, instanceValue);
			case TablePackage.ORIENTATION_TYPE:
				return convertOrientationTypeToString(eDataType, instanceValue);
			case TablePackage.ORIENTATION_TYPE1:
				return convertOrientationType1ToString(eDataType, instanceValue);
			case TablePackage.RANGE_USABLE_AS_TYPE_MEMBER0:
				return convertRangeUsableAsTypeMember0ToString(eDataType, instanceValue);
			case TablePackage.RANGE_USABLE_AS_TYPE_MEMBER1_BASE_ITEM:
				return convertRangeUsableAsTypeMember1BaseItemToString(eDataType, instanceValue);
			case TablePackage.SORT_MODE_TYPE:
				return convertSortModeTypeToString(eDataType, instanceValue);
			case TablePackage.START_TYPE_MEMBER1:
				return convertStartTypeMember1ToString(eDataType, instanceValue);
			case TablePackage.STATUS_TYPE:
				return convertStatusTypeToString(eDataType, instanceValue);
			case TablePackage.TYPE_TYPE:
				return convertTypeTypeToString(eDataType, instanceValue);
			case TablePackage.TYPE_TYPE1:
				return convertTypeType1ToString(eDataType, instanceValue);
			case TablePackage.USE_LABELS_TYPE:
				return convertUseLabelsTypeToString(eDataType, instanceValue);
			case TablePackage.ACCEPTANCE_STATE_TYPE_OBJECT:
				return convertAcceptanceStateTypeObjectToString(eDataType, instanceValue);
			case TablePackage.ALIGN_TYPE_OBJECT:
				return convertAlignTypeObjectToString(eDataType, instanceValue);
			case TablePackage.BORDER_MODEL_TYPE_OBJECT:
				return convertBorderModelTypeObjectToString(eDataType, instanceValue);
			case TablePackage.CONDITION_SOURCE_TYPE_OBJECT:
				return convertConditionSourceTypeObjectToString(eDataType, instanceValue);
			case TablePackage.DATA_TYPE_TYPE:
				return convertDataTypeTypeToString(eDataType, instanceValue);
			case TablePackage.DATA_TYPE_TYPE_MEMBER1_OBJECT:
				return convertDataTypeTypeMember1ObjectToString(eDataType, instanceValue);
			case TablePackage.DATA_TYPE_TYPE_MEMBER2_OBJECT:
				return convertDataTypeTypeMember2ObjectToString(eDataType, instanceValue);
			case TablePackage.DATA_TYPE_TYPE_MEMBER3_OBJECT:
				return convertDataTypeTypeMember3ObjectToString(eDataType, instanceValue);
			case TablePackage.DATA_TYPE_TYPE_OBJECT:
				return convertDataTypeTypeObjectToString(eDataType, instanceValue);
			case TablePackage.DATE_END_TYPE:
				return convertDateEndTypeToString(eDataType, instanceValue);
			case TablePackage.DATE_END_TYPE_MEMBER1_OBJECT:
				return convertDateEndTypeMember1ObjectToString(eDataType, instanceValue);
			case TablePackage.DATE_START_TYPE:
				return convertDateStartTypeToString(eDataType, instanceValue);
			case TablePackage.DATE_START_TYPE_MEMBER1_OBJECT:
				return convertDateStartTypeMember1ObjectToString(eDataType, instanceValue);
			case TablePackage.DEFAULT_CELL_STYLE_NAME_TYPE:
				return convertDefaultCellStyleNameTypeToString(eDataType, instanceValue);
			case TablePackage.DEFAULT_CELL_STYLE_NAME_TYPE_MEMBER1:
				return convertDefaultCellStyleNameTypeMember1ToString(eDataType, instanceValue);
			case TablePackage.DIRECTION_TYPE_OBJECT:
				return convertDirectionTypeObjectToString(eDataType, instanceValue);
			case TablePackage.DISPLAY_LIST_TYPE_OBJECT:
				return convertDisplayListTypeObjectToString(eDataType, instanceValue);
			case TablePackage.DISPLAY_MEMBER_MODE_TYPE_OBJECT:
				return convertDisplayMemberModeTypeObjectToString(eDataType, instanceValue);
			case TablePackage.END_TYPE:
				return convertEndTypeToString(eDataType, instanceValue);
			case TablePackage.END_TYPE_MEMBER1_OBJECT:
				return convertEndTypeMember1ObjectToString(eDataType, instanceValue);
			case TablePackage.FUNCTION_TYPE:
				return convertFunctionTypeToString(eDataType, instanceValue);
			case TablePackage.FUNCTION_TYPE_MEMBER10_OBJECT:
				return convertFunctionTypeMember10ObjectToString(eDataType, instanceValue);
			case TablePackage.FUNCTION_TYPE_MEMBER11_OBJECT:
				return convertFunctionTypeMember11ObjectToString(eDataType, instanceValue);
			case TablePackage.FUNCTION_TYPE_MEMBER12_OBJECT:
				return convertFunctionTypeMember12ObjectToString(eDataType, instanceValue);
			case TablePackage.FUNCTION_TYPE_MEMBER1_OBJECT:
				return convertFunctionTypeMember1ObjectToString(eDataType, instanceValue);
			case TablePackage.FUNCTION_TYPE_MEMBER2_OBJECT:
				return convertFunctionTypeMember2ObjectToString(eDataType, instanceValue);
			case TablePackage.FUNCTION_TYPE_MEMBER3_OBJECT:
				return convertFunctionTypeMember3ObjectToString(eDataType, instanceValue);
			case TablePackage.FUNCTION_TYPE_MEMBER4_OBJECT:
				return convertFunctionTypeMember4ObjectToString(eDataType, instanceValue);
			case TablePackage.FUNCTION_TYPE_MEMBER5_OBJECT:
				return convertFunctionTypeMember5ObjectToString(eDataType, instanceValue);
			case TablePackage.FUNCTION_TYPE_MEMBER6_OBJECT:
				return convertFunctionTypeMember6ObjectToString(eDataType, instanceValue);
			case TablePackage.FUNCTION_TYPE_MEMBER7_OBJECT:
				return convertFunctionTypeMember7ObjectToString(eDataType, instanceValue);
			case TablePackage.FUNCTION_TYPE_MEMBER8_OBJECT:
				return convertFunctionTypeMember8ObjectToString(eDataType, instanceValue);
			case TablePackage.FUNCTION_TYPE_MEMBER9_OBJECT:
				return convertFunctionTypeMember9ObjectToString(eDataType, instanceValue);
			case TablePackage.GRAND_TOTAL_TYPE_OBJECT:
				return convertGrandTotalTypeObjectToString(eDataType, instanceValue);
			case TablePackage.GROUPED_BY_TYPE_OBJECT:
				return convertGroupedByTypeObjectToString(eDataType, instanceValue);
			case TablePackage.LAYOUT_MODE_TYPE_OBJECT:
				return convertLayoutModeTypeObjectToString(eDataType, instanceValue);
			case TablePackage.MEMBER_TYPE_TYPE_OBJECT:
				return convertMemberTypeTypeObjectToString(eDataType, instanceValue);
			case TablePackage.MESSAGE_TYPE_TYPE_OBJECT:
				return convertMessageTypeTypeObjectToString(eDataType, instanceValue);
			case TablePackage.MODE_TYPE_OBJECT:
				return convertModeTypeObjectToString(eDataType, instanceValue);
			case TablePackage.NAME_TYPE_OBJECT:
				return convertNameTypeObjectToString(eDataType, instanceValue);
			case TablePackage.ORDER_TYPE_OBJECT:
				return convertOrderTypeObjectToString(eDataType, instanceValue);
			case TablePackage.ORIENTATION_TYPE_OBJECT:
				return convertOrientationTypeObjectToString(eDataType, instanceValue);
			case TablePackage.ORIENTATION_TYPE_OBJECT1:
				return convertOrientationTypeObject1ToString(eDataType, instanceValue);
			case TablePackage.RANGE_USABLE_AS_TYPE:
				return convertRangeUsableAsTypeToString(eDataType, instanceValue);
			case TablePackage.RANGE_USABLE_AS_TYPE_MEMBER0_OBJECT:
				return convertRangeUsableAsTypeMember0ObjectToString(eDataType, instanceValue);
			case TablePackage.RANGE_USABLE_AS_TYPE_MEMBER1:
				return convertRangeUsableAsTypeMember1ToString(eDataType, instanceValue);
			case TablePackage.RANGE_USABLE_AS_TYPE_MEMBER1_BASE:
				return convertRangeUsableAsTypeMember1BaseToString(eDataType, instanceValue);
			case TablePackage.RANGE_USABLE_AS_TYPE_MEMBER1_BASE_ITEM_OBJECT:
				return convertRangeUsableAsTypeMember1BaseItemObjectToString(eDataType, instanceValue);
			case TablePackage.SORT_MODE_TYPE_OBJECT:
				return convertSortModeTypeObjectToString(eDataType, instanceValue);
			case TablePackage.START_TYPE:
				return convertStartTypeToString(eDataType, instanceValue);
			case TablePackage.START_TYPE_MEMBER1_OBJECT:
				return convertStartTypeMember1ObjectToString(eDataType, instanceValue);
			case TablePackage.STATUS_TYPE_OBJECT:
				return convertStatusTypeObjectToString(eDataType, instanceValue);
			case TablePackage.STYLE_NAME_TYPE:
				return convertStyleNameTypeToString(eDataType, instanceValue);
			case TablePackage.STYLE_NAME_TYPE_MEMBER1:
				return convertStyleNameTypeMember1ToString(eDataType, instanceValue);
			case TablePackage.TYPE_TYPE_OBJECT:
				return convertTypeTypeObjectToString(eDataType, instanceValue);
			case TablePackage.TYPE_TYPE_OBJECT1:
				return convertTypeTypeObject1ToString(eDataType, instanceValue);
			case TablePackage.USE_LABELS_TYPE_OBJECT:
				return convertUseLabelsTypeObjectToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BodyType createBodyType() {
		BodyTypeImpl bodyType = new BodyTypeImpl();
		return bodyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalculationSettingsType createCalculationSettingsType() {
		CalculationSettingsTypeImpl calculationSettingsType = new CalculationSettingsTypeImpl();
		return calculationSettingsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CellAddressType createCellAddressType() {
		CellAddressTypeImpl cellAddressType = new CellAddressTypeImpl();
		return cellAddressType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CellContentChangeType createCellContentChangeType() {
		CellContentChangeTypeImpl cellContentChangeType = new CellContentChangeTypeImpl();
		return cellContentChangeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CellContentDeletionType createCellContentDeletionType() {
		CellContentDeletionTypeImpl cellContentDeletionType = new CellContentDeletionTypeImpl();
		return cellContentDeletionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CellRangeSourceType createCellRangeSourceType() {
		CellRangeSourceTypeImpl cellRangeSourceType = new CellRangeSourceTypeImpl();
		return cellRangeSourceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeDeletionType createChangeDeletionType() {
		ChangeDeletionTypeImpl changeDeletionType = new ChangeDeletionTypeImpl();
		return changeDeletionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeTrackTableCellType createChangeTrackTableCellType() {
		ChangeTrackTableCellTypeImpl changeTrackTableCellType = new ChangeTrackTableCellTypeImpl();
		return changeTrackTableCellType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConsolidationType createConsolidationType() {
		ConsolidationTypeImpl consolidationType = new ConsolidationTypeImpl();
		return consolidationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContentValidationsType createContentValidationsType() {
		ContentValidationsTypeImpl contentValidationsType = new ContentValidationsTypeImpl();
		return contentValidationsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContentValidationType createContentValidationType() {
		ContentValidationTypeImpl contentValidationType = new ContentValidationTypeImpl();
		return contentValidationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoveredTableCellType createCoveredTableCellType() {
		CoveredTableCellTypeImpl coveredTableCellType = new CoveredTableCellTypeImpl();
		return coveredTableCellType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CutOffsType createCutOffsType() {
		CutOffsTypeImpl cutOffsType = new CutOffsTypeImpl();
		return cutOffsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatabaseRangesType createDatabaseRangesType() {
		DatabaseRangesTypeImpl databaseRangesType = new DatabaseRangesTypeImpl();
		return databaseRangesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatabaseRangeType createDatabaseRangeType() {
		DatabaseRangeTypeImpl databaseRangeType = new DatabaseRangeTypeImpl();
		return databaseRangeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatabaseSourceQueryType createDatabaseSourceQueryType() {
		DatabaseSourceQueryTypeImpl databaseSourceQueryType = new DatabaseSourceQueryTypeImpl();
		return databaseSourceQueryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatabaseSourceSqlType createDatabaseSourceSqlType() {
		DatabaseSourceSqlTypeImpl databaseSourceSqlType = new DatabaseSourceSqlTypeImpl();
		return databaseSourceSqlType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatabaseSourceTableType createDatabaseSourceTableType() {
		DatabaseSourceTableTypeImpl databaseSourceTableType = new DatabaseSourceTableTypeImpl();
		return databaseSourceTableType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataPilotDisplayInfoType createDataPilotDisplayInfoType() {
		DataPilotDisplayInfoTypeImpl dataPilotDisplayInfoType = new DataPilotDisplayInfoTypeImpl();
		return dataPilotDisplayInfoType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataPilotFieldReferenceType createDataPilotFieldReferenceType() {
		DataPilotFieldReferenceTypeImpl dataPilotFieldReferenceType = new DataPilotFieldReferenceTypeImpl();
		return dataPilotFieldReferenceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataPilotFieldType createDataPilotFieldType() {
		DataPilotFieldTypeImpl dataPilotFieldType = new DataPilotFieldTypeImpl();
		return dataPilotFieldType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataPilotGroupMemberType createDataPilotGroupMemberType() {
		DataPilotGroupMemberTypeImpl dataPilotGroupMemberType = new DataPilotGroupMemberTypeImpl();
		return dataPilotGroupMemberType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataPilotGroupsType createDataPilotGroupsType() {
		DataPilotGroupsTypeImpl dataPilotGroupsType = new DataPilotGroupsTypeImpl();
		return dataPilotGroupsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataPilotGroupType createDataPilotGroupType() {
		DataPilotGroupTypeImpl dataPilotGroupType = new DataPilotGroupTypeImpl();
		return dataPilotGroupType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataPilotLayoutInfoType createDataPilotLayoutInfoType() {
		DataPilotLayoutInfoTypeImpl dataPilotLayoutInfoType = new DataPilotLayoutInfoTypeImpl();
		return dataPilotLayoutInfoType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataPilotLevelType createDataPilotLevelType() {
		DataPilotLevelTypeImpl dataPilotLevelType = new DataPilotLevelTypeImpl();
		return dataPilotLevelType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataPilotMembersType createDataPilotMembersType() {
		DataPilotMembersTypeImpl dataPilotMembersType = new DataPilotMembersTypeImpl();
		return dataPilotMembersType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataPilotMemberType createDataPilotMemberType() {
		DataPilotMemberTypeImpl dataPilotMemberType = new DataPilotMemberTypeImpl();
		return dataPilotMemberType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataPilotSortInfoType createDataPilotSortInfoType() {
		DataPilotSortInfoTypeImpl dataPilotSortInfoType = new DataPilotSortInfoTypeImpl();
		return dataPilotSortInfoType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataPilotSubtotalsType createDataPilotSubtotalsType() {
		DataPilotSubtotalsTypeImpl dataPilotSubtotalsType = new DataPilotSubtotalsTypeImpl();
		return dataPilotSubtotalsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataPilotSubtotalType createDataPilotSubtotalType() {
		DataPilotSubtotalTypeImpl dataPilotSubtotalType = new DataPilotSubtotalTypeImpl();
		return dataPilotSubtotalType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataPilotTablesType createDataPilotTablesType() {
		DataPilotTablesTypeImpl dataPilotTablesType = new DataPilotTablesTypeImpl();
		return dataPilotTablesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataPilotTableType createDataPilotTableType() {
		DataPilotTableTypeImpl dataPilotTableType = new DataPilotTableTypeImpl();
		return dataPilotTableType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DdeLinksType createDdeLinksType() {
		DdeLinksTypeImpl ddeLinksType = new DdeLinksTypeImpl();
		return ddeLinksType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DdeLinkType createDdeLinkType() {
		DdeLinkTypeImpl ddeLinkType = new DdeLinkTypeImpl();
		return ddeLinkType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeletionsType createDeletionsType() {
		DeletionsTypeImpl deletionsType = new DeletionsTypeImpl();
		return deletionsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeletionType createDeletionType() {
		DeletionTypeImpl deletionType = new DeletionTypeImpl();
		return deletionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DependenciesType createDependenciesType() {
		DependenciesTypeImpl dependenciesType = new DependenciesTypeImpl();
		return dependenciesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DependencyType createDependencyType() {
		DependencyTypeImpl dependencyType = new DependencyTypeImpl();
		return dependencyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DetectiveType createDetectiveType() {
		DetectiveTypeImpl detectiveType = new DetectiveTypeImpl();
		return detectiveType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErrorMacroType createErrorMacroType() {
		ErrorMacroTypeImpl errorMacroType = new ErrorMacroTypeImpl();
		return errorMacroType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErrorMessageType createErrorMessageType() {
		ErrorMessageTypeImpl errorMessageType = new ErrorMessageTypeImpl();
		return errorMessageType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvenColumnsType createEvenColumnsType() {
		EvenColumnsTypeImpl evenColumnsType = new EvenColumnsTypeImpl();
		return evenColumnsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvenRowsType createEvenRowsType() {
		EvenRowsTypeImpl evenRowsType = new EvenRowsTypeImpl();
		return evenRowsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilterAndType createFilterAndType() {
		FilterAndTypeImpl filterAndType = new FilterAndTypeImpl();
		return filterAndType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilterConditionType createFilterConditionType() {
		FilterConditionTypeImpl filterConditionType = new FilterConditionTypeImpl();
		return filterConditionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilterOrType createFilterOrType() {
		FilterOrTypeImpl filterOrType = new FilterOrTypeImpl();
		return filterOrType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilterType createFilterType() {
		FilterTypeImpl filterType = new FilterTypeImpl();
		return filterType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FirstColumnType createFirstColumnType() {
		FirstColumnTypeImpl firstColumnType = new FirstColumnTypeImpl();
		return firstColumnType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FirstRowType createFirstRowType() {
		FirstRowTypeImpl firstRowType = new FirstRowTypeImpl();
		return firstRowType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HelpMessageType createHelpMessageType() {
		HelpMessageTypeImpl helpMessageType = new HelpMessageTypeImpl();
		return helpMessageType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HighlightedRangeType createHighlightedRangeType() {
		HighlightedRangeTypeImpl highlightedRangeType = new HighlightedRangeTypeImpl();
		return highlightedRangeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InsertionCutOffType createInsertionCutOffType() {
		InsertionCutOffTypeImpl insertionCutOffType = new InsertionCutOffTypeImpl();
		return insertionCutOffType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InsertionType createInsertionType() {
		InsertionTypeImpl insertionType = new InsertionTypeImpl();
		return insertionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IterationType createIterationType() {
		IterationTypeImpl iterationType = new IterationTypeImpl();
		return iterationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LabelRangesType createLabelRangesType() {
		LabelRangesTypeImpl labelRangesType = new LabelRangesTypeImpl();
		return labelRangesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LabelRangeType createLabelRangeType() {
		LabelRangeTypeImpl labelRangeType = new LabelRangeTypeImpl();
		return labelRangeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LastColumnType createLastColumnType() {
		LastColumnTypeImpl lastColumnType = new LastColumnTypeImpl();
		return lastColumnType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LastRowType createLastRowType() {
		LastRowTypeImpl lastRowType = new LastRowTypeImpl();
		return lastRowType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MovementCutOffType createMovementCutOffType() {
		MovementCutOffTypeImpl movementCutOffType = new MovementCutOffTypeImpl();
		return movementCutOffType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MovementType createMovementType() {
		MovementTypeImpl movementType = new MovementTypeImpl();
		return movementType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedExpressionsType createNamedExpressionsType() {
		NamedExpressionsTypeImpl namedExpressionsType = new NamedExpressionsTypeImpl();
		return namedExpressionsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedExpressionType createNamedExpressionType() {
		NamedExpressionTypeImpl namedExpressionType = new NamedExpressionTypeImpl();
		return namedExpressionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedRangeType createNamedRangeType() {
		NamedRangeTypeImpl namedRangeType = new NamedRangeTypeImpl();
		return namedRangeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NullDateType createNullDateType() {
		NullDateTypeImpl nullDateType = new NullDateTypeImpl();
		return nullDateType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OddColumnsType createOddColumnsType() {
		OddColumnsTypeImpl oddColumnsType = new OddColumnsTypeImpl();
		return oddColumnsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OddRowsType createOddRowsType() {
		OddRowsTypeImpl oddRowsType = new OddRowsTypeImpl();
		return oddRowsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationType createOperationType() {
		OperationTypeImpl operationType = new OperationTypeImpl();
		return operationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PreviousType createPreviousType() {
		PreviousTypeImpl previousType = new PreviousTypeImpl();
		return previousType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScenarioType createScenarioType() {
		ScenarioTypeImpl scenarioType = new ScenarioTypeImpl();
		return scenarioType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShapesType createShapesType() {
		ShapesTypeImpl shapesType = new ShapesTypeImpl();
		return shapesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SortByType createSortByType() {
		SortByTypeImpl sortByType = new SortByTypeImpl();
		return sortByType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SortGroupsType createSortGroupsType() {
		SortGroupsTypeImpl sortGroupsType = new SortGroupsTypeImpl();
		return sortGroupsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SortType createSortType() {
		SortTypeImpl sortType = new SortTypeImpl();
		return sortType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourceCellRangeType createSourceCellRangeType() {
		SourceCellRangeTypeImpl sourceCellRangeType = new SourceCellRangeTypeImpl();
		return sourceCellRangeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourceRangeAddressType createSourceRangeAddressType() {
		SourceRangeAddressTypeImpl sourceRangeAddressType = new SourceRangeAddressTypeImpl();
		return sourceRangeAddressType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourceServiceType createSourceServiceType() {
		SourceServiceTypeImpl sourceServiceType = new SourceServiceTypeImpl();
		return sourceServiceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubtotalFieldType createSubtotalFieldType() {
		SubtotalFieldTypeImpl subtotalFieldType = new SubtotalFieldTypeImpl();
		return subtotalFieldType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubtotalRulesType createSubtotalRulesType() {
		SubtotalRulesTypeImpl subtotalRulesType = new SubtotalRulesTypeImpl();
		return subtotalRulesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubtotalRuleType createSubtotalRuleType() {
		SubtotalRuleTypeImpl subtotalRuleType = new SubtotalRuleTypeImpl();
		return subtotalRuleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TableCellType createTableCellType() {
		TableCellTypeImpl tableCellType = new TableCellTypeImpl();
		return tableCellType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TableColumnGroupType createTableColumnGroupType() {
		TableColumnGroupTypeImpl tableColumnGroupType = new TableColumnGroupTypeImpl();
		return tableColumnGroupType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TableColumnsType createTableColumnsType() {
		TableColumnsTypeImpl tableColumnsType = new TableColumnsTypeImpl();
		return tableColumnsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TableColumnType createTableColumnType() {
		TableColumnTypeImpl tableColumnType = new TableColumnTypeImpl();
		return tableColumnType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TableHeaderColumnsType createTableHeaderColumnsType() {
		TableHeaderColumnsTypeImpl tableHeaderColumnsType = new TableHeaderColumnsTypeImpl();
		return tableHeaderColumnsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TableHeaderRowsType createTableHeaderRowsType() {
		TableHeaderRowsTypeImpl tableHeaderRowsType = new TableHeaderRowsTypeImpl();
		return tableHeaderRowsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TableRowGroupType createTableRowGroupType() {
		TableRowGroupTypeImpl tableRowGroupType = new TableRowGroupTypeImpl();
		return tableRowGroupType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TableRowsType createTableRowsType() {
		TableRowsTypeImpl tableRowsType = new TableRowsTypeImpl();
		return tableRowsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TableRowType createTableRowType() {
		TableRowTypeImpl tableRowType = new TableRowTypeImpl();
		return tableRowType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TableSourceType createTableSourceType() {
		TableSourceTypeImpl tableSourceType = new TableSourceTypeImpl();
		return tableSourceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TableType createTableType() {
		TableTypeImpl tableType = new TableTypeImpl();
		return tableType;
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
	public TableTemplateType createTableTemplateType() {
		TableTemplateTypeImpl tableTemplateType = new TableTemplateTypeImpl();
		return tableTemplateType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TargetRangeAddressType createTargetRangeAddressType() {
		TargetRangeAddressTypeImpl targetRangeAddressType = new TargetRangeAddressTypeImpl();
		return targetRangeAddressType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrackedChangesType createTrackedChangesType() {
		TrackedChangesTypeImpl trackedChangesType = new TrackedChangesTypeImpl();
		return trackedChangesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AcceptanceStateType createAcceptanceStateTypeFromString(EDataType eDataType, String initialValue) {
		AcceptanceStateType result = AcceptanceStateType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAcceptanceStateTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlignType createAlignTypeFromString(EDataType eDataType, String initialValue) {
		AlignType result = AlignType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAlignTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BorderModelType createBorderModelTypeFromString(EDataType eDataType, String initialValue) {
		BorderModelType result = BorderModelType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBorderModelTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionSourceType createConditionSourceTypeFromString(EDataType eDataType, String initialValue) {
		ConditionSourceType result = ConditionSourceType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConditionSourceTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataTypeType1 createDataTypeType1FromString(EDataType eDataType, String initialValue) {
		DataTypeType1 result = DataTypeType1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDataTypeType1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataTypeTypeMember1 createDataTypeTypeMember1FromString(EDataType eDataType, String initialValue) {
		DataTypeTypeMember1 result = DataTypeTypeMember1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDataTypeTypeMember1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataTypeTypeMember2 createDataTypeTypeMember2FromString(EDataType eDataType, String initialValue) {
		DataTypeTypeMember2 result = DataTypeTypeMember2.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDataTypeTypeMember2ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataTypeTypeMember3 createDataTypeTypeMember3FromString(EDataType eDataType, String initialValue) {
		DataTypeTypeMember3 result = DataTypeTypeMember3.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDataTypeTypeMember3ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateEndTypeMember1 createDateEndTypeMember1FromString(EDataType eDataType, String initialValue) {
		DateEndTypeMember1 result = DateEndTypeMember1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDateEndTypeMember1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateStartTypeMember1 createDateStartTypeMember1FromString(EDataType eDataType, String initialValue) {
		DateStartTypeMember1 result = DateStartTypeMember1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDateStartTypeMember1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DirectionType createDirectionTypeFromString(EDataType eDataType, String initialValue) {
		DirectionType result = DirectionType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDirectionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DisplayListType createDisplayListTypeFromString(EDataType eDataType, String initialValue) {
		DisplayListType result = DisplayListType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDisplayListTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DisplayMemberModeType createDisplayMemberModeTypeFromString(EDataType eDataType, String initialValue) {
		DisplayMemberModeType result = DisplayMemberModeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDisplayMemberModeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndTypeMember1 createEndTypeMember1FromString(EDataType eDataType, String initialValue) {
		EndTypeMember1 result = EndTypeMember1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEndTypeMember1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionTypeMember1 createFunctionTypeMember1FromString(EDataType eDataType, String initialValue) {
		FunctionTypeMember1 result = FunctionTypeMember1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFunctionTypeMember1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionTypeMember10 createFunctionTypeMember10FromString(EDataType eDataType, String initialValue) {
		FunctionTypeMember10 result = FunctionTypeMember10.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFunctionTypeMember10ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionTypeMember11 createFunctionTypeMember11FromString(EDataType eDataType, String initialValue) {
		FunctionTypeMember11 result = FunctionTypeMember11.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFunctionTypeMember11ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionTypeMember12 createFunctionTypeMember12FromString(EDataType eDataType, String initialValue) {
		FunctionTypeMember12 result = FunctionTypeMember12.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFunctionTypeMember12ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionTypeMember2 createFunctionTypeMember2FromString(EDataType eDataType, String initialValue) {
		FunctionTypeMember2 result = FunctionTypeMember2.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFunctionTypeMember2ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionTypeMember3 createFunctionTypeMember3FromString(EDataType eDataType, String initialValue) {
		FunctionTypeMember3 result = FunctionTypeMember3.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFunctionTypeMember3ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionTypeMember4 createFunctionTypeMember4FromString(EDataType eDataType, String initialValue) {
		FunctionTypeMember4 result = FunctionTypeMember4.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFunctionTypeMember4ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionTypeMember5 createFunctionTypeMember5FromString(EDataType eDataType, String initialValue) {
		FunctionTypeMember5 result = FunctionTypeMember5.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFunctionTypeMember5ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionTypeMember6 createFunctionTypeMember6FromString(EDataType eDataType, String initialValue) {
		FunctionTypeMember6 result = FunctionTypeMember6.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFunctionTypeMember6ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionTypeMember7 createFunctionTypeMember7FromString(EDataType eDataType, String initialValue) {
		FunctionTypeMember7 result = FunctionTypeMember7.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFunctionTypeMember7ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionTypeMember8 createFunctionTypeMember8FromString(EDataType eDataType, String initialValue) {
		FunctionTypeMember8 result = FunctionTypeMember8.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFunctionTypeMember8ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionTypeMember9 createFunctionTypeMember9FromString(EDataType eDataType, String initialValue) {
		FunctionTypeMember9 result = FunctionTypeMember9.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFunctionTypeMember9ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GrandTotalType createGrandTotalTypeFromString(EDataType eDataType, String initialValue) {
		GrandTotalType result = GrandTotalType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGrandTotalTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroupedByType createGroupedByTypeFromString(EDataType eDataType, String initialValue) {
		GroupedByType result = GroupedByType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGroupedByTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LayoutModeType createLayoutModeTypeFromString(EDataType eDataType, String initialValue) {
		LayoutModeType result = LayoutModeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLayoutModeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MemberTypeType createMemberTypeTypeFromString(EDataType eDataType, String initialValue) {
		MemberTypeType result = MemberTypeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMemberTypeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageTypeType createMessageTypeTypeFromString(EDataType eDataType, String initialValue) {
		MessageTypeType result = MessageTypeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMessageTypeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModeType createModeTypeFromString(EDataType eDataType, String initialValue) {
		ModeType result = ModeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertModeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NameType createNameTypeFromString(EDataType eDataType, String initialValue) {
		NameType result = NameType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNameTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrderType createOrderTypeFromString(EDataType eDataType, String initialValue) {
		OrderType result = OrderType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOrderTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrientationType createOrientationTypeFromString(EDataType eDataType, String initialValue) {
		OrientationType result = OrientationType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOrientationTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrientationType1 createOrientationType1FromString(EDataType eDataType, String initialValue) {
		OrientationType1 result = OrientationType1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOrientationType1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RangeUsableAsTypeMember0 createRangeUsableAsTypeMember0FromString(EDataType eDataType, String initialValue) {
		RangeUsableAsTypeMember0 result = RangeUsableAsTypeMember0.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRangeUsableAsTypeMember0ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RangeUsableAsTypeMember1BaseItem createRangeUsableAsTypeMember1BaseItemFromString(EDataType eDataType, String initialValue) {
		RangeUsableAsTypeMember1BaseItem result = RangeUsableAsTypeMember1BaseItem.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRangeUsableAsTypeMember1BaseItemToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SortModeType createSortModeTypeFromString(EDataType eDataType, String initialValue) {
		SortModeType result = SortModeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSortModeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StartTypeMember1 createStartTypeMember1FromString(EDataType eDataType, String initialValue) {
		StartTypeMember1 result = StartTypeMember1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStartTypeMember1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatusType createStatusTypeFromString(EDataType eDataType, String initialValue) {
		StatusType result = StatusType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStatusTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeType createTypeTypeFromString(EDataType eDataType, String initialValue) {
		TypeType result = TypeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeType1 createTypeType1FromString(EDataType eDataType, String initialValue) {
		TypeType1 result = TypeType1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeType1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UseLabelsType createUseLabelsTypeFromString(EDataType eDataType, String initialValue) {
		UseLabelsType result = UseLabelsType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUseLabelsTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AcceptanceStateType createAcceptanceStateTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createAcceptanceStateTypeFromString(TablePackage.eINSTANCE.getAcceptanceStateType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAcceptanceStateTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertAcceptanceStateTypeToString(TablePackage.eINSTANCE.getAcceptanceStateType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlignType createAlignTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createAlignTypeFromString(TablePackage.eINSTANCE.getAlignType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAlignTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertAlignTypeToString(TablePackage.eINSTANCE.getAlignType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BorderModelType createBorderModelTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createBorderModelTypeFromString(TablePackage.eINSTANCE.getBorderModelType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBorderModelTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertBorderModelTypeToString(TablePackage.eINSTANCE.getBorderModelType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionSourceType createConditionSourceTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createConditionSourceTypeFromString(TablePackage.eINSTANCE.getConditionSourceType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConditionSourceTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertConditionSourceTypeToString(TablePackage.eINSTANCE.getConditionSourceType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createDataTypeTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Object result = null;
		RuntimeException exception = null;
		try {
			result = createDataTypeTypeMember1FromString(TablePackage.eINSTANCE.getDataTypeTypeMember1(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createDataTypeTypeMember2FromString(TablePackage.eINSTANCE.getDataTypeTypeMember2(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createDataTypeTypeMember3FromString(TablePackage.eINSTANCE.getDataTypeTypeMember3(), initialValue);
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
	public String convertDataTypeTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (TablePackage.eINSTANCE.getDataTypeTypeMember1().isInstance(instanceValue)) {
			try {
				String value = convertDataTypeTypeMember1ToString(TablePackage.eINSTANCE.getDataTypeTypeMember1(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (TablePackage.eINSTANCE.getDataTypeTypeMember2().isInstance(instanceValue)) {
			try {
				String value = convertDataTypeTypeMember2ToString(TablePackage.eINSTANCE.getDataTypeTypeMember2(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (TablePackage.eINSTANCE.getDataTypeTypeMember3().isInstance(instanceValue)) {
			try {
				String value = convertDataTypeTypeMember3ToString(TablePackage.eINSTANCE.getDataTypeTypeMember3(), instanceValue);
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
	public DataTypeTypeMember1 createDataTypeTypeMember1ObjectFromString(EDataType eDataType, String initialValue) {
		return createDataTypeTypeMember1FromString(TablePackage.eINSTANCE.getDataTypeTypeMember1(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDataTypeTypeMember1ObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDataTypeTypeMember1ToString(TablePackage.eINSTANCE.getDataTypeTypeMember1(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataTypeTypeMember2 createDataTypeTypeMember2ObjectFromString(EDataType eDataType, String initialValue) {
		return createDataTypeTypeMember2FromString(TablePackage.eINSTANCE.getDataTypeTypeMember2(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDataTypeTypeMember2ObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDataTypeTypeMember2ToString(TablePackage.eINSTANCE.getDataTypeTypeMember2(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataTypeTypeMember3 createDataTypeTypeMember3ObjectFromString(EDataType eDataType, String initialValue) {
		return createDataTypeTypeMember3FromString(TablePackage.eINSTANCE.getDataTypeTypeMember3(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDataTypeTypeMember3ObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDataTypeTypeMember3ToString(TablePackage.eINSTANCE.getDataTypeTypeMember3(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataTypeType1 createDataTypeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createDataTypeType1FromString(TablePackage.eINSTANCE.getDataTypeType1(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDataTypeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDataTypeType1ToString(TablePackage.eINSTANCE.getDataTypeType1(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createDateEndTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Object result = null;
		RuntimeException exception = null;
		try {
			result = createDateEndTypeMember1FromString(TablePackage.eINSTANCE.getDateEndTypeMember1(), initialValue);
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
	public String convertDateEndTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (TablePackage.eINSTANCE.getDateEndTypeMember1().isInstance(instanceValue)) {
			try {
				String value = convertDateEndTypeMember1ToString(TablePackage.eINSTANCE.getDateEndTypeMember1(), instanceValue);
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
	public DateEndTypeMember1 createDateEndTypeMember1ObjectFromString(EDataType eDataType, String initialValue) {
		return createDateEndTypeMember1FromString(TablePackage.eINSTANCE.getDateEndTypeMember1(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDateEndTypeMember1ObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDateEndTypeMember1ToString(TablePackage.eINSTANCE.getDateEndTypeMember1(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createDateStartTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Object result = null;
		RuntimeException exception = null;
		try {
			result = createDateStartTypeMember1FromString(TablePackage.eINSTANCE.getDateStartTypeMember1(), initialValue);
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
	public String convertDateStartTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (TablePackage.eINSTANCE.getDateStartTypeMember1().isInstance(instanceValue)) {
			try {
				String value = convertDateStartTypeMember1ToString(TablePackage.eINSTANCE.getDateStartTypeMember1(), instanceValue);
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
	public DateStartTypeMember1 createDateStartTypeMember1ObjectFromString(EDataType eDataType, String initialValue) {
		return createDateStartTypeMember1FromString(TablePackage.eINSTANCE.getDateStartTypeMember1(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDateStartTypeMember1ObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDateStartTypeMember1ToString(TablePackage.eINSTANCE.getDateStartTypeMember1(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createDefaultCellStyleNameTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		String result = null;
		RuntimeException exception = null;
		try {
			result = createDefaultCellStyleNameTypeMember1FromString(TablePackage.eINSTANCE.getDefaultCellStyleNameTypeMember1(), initialValue);
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
	public String convertDefaultCellStyleNameTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (TablePackage.eINSTANCE.getDefaultCellStyleNameTypeMember1().isInstance(instanceValue)) {
			try {
				String value = convertDefaultCellStyleNameTypeMember1ToString(TablePackage.eINSTANCE.getDefaultCellStyleNameTypeMember1(), instanceValue);
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
	public String createDefaultCellStyleNameTypeMember1FromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.TOKEN, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDefaultCellStyleNameTypeMember1ToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.TOKEN, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DirectionType createDirectionTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createDirectionTypeFromString(TablePackage.eINSTANCE.getDirectionType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDirectionTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDirectionTypeToString(TablePackage.eINSTANCE.getDirectionType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DisplayListType createDisplayListTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createDisplayListTypeFromString(TablePackage.eINSTANCE.getDisplayListType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDisplayListTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDisplayListTypeToString(TablePackage.eINSTANCE.getDisplayListType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DisplayMemberModeType createDisplayMemberModeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createDisplayMemberModeTypeFromString(TablePackage.eINSTANCE.getDisplayMemberModeType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDisplayMemberModeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDisplayMemberModeTypeToString(TablePackage.eINSTANCE.getDisplayMemberModeType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createEndTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Object result = null;
		RuntimeException exception = null;
		try {
			result = createEndTypeMember1FromString(TablePackage.eINSTANCE.getEndTypeMember1(), initialValue);
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
	public String convertEndTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (TablePackage.eINSTANCE.getEndTypeMember1().isInstance(instanceValue)) {
			try {
				String value = convertEndTypeMember1ToString(TablePackage.eINSTANCE.getEndTypeMember1(), instanceValue);
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
	public EndTypeMember1 createEndTypeMember1ObjectFromString(EDataType eDataType, String initialValue) {
		return createEndTypeMember1FromString(TablePackage.eINSTANCE.getEndTypeMember1(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEndTypeMember1ObjectToString(EDataType eDataType, Object instanceValue) {
		return convertEndTypeMember1ToString(TablePackage.eINSTANCE.getEndTypeMember1(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createFunctionTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Object result = null;
		RuntimeException exception = null;
		try {
			result = createFunctionTypeMember1FromString(TablePackage.eINSTANCE.getFunctionTypeMember1(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createFunctionTypeMember2FromString(TablePackage.eINSTANCE.getFunctionTypeMember2(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createFunctionTypeMember3FromString(TablePackage.eINSTANCE.getFunctionTypeMember3(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createFunctionTypeMember4FromString(TablePackage.eINSTANCE.getFunctionTypeMember4(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createFunctionTypeMember5FromString(TablePackage.eINSTANCE.getFunctionTypeMember5(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createFunctionTypeMember6FromString(TablePackage.eINSTANCE.getFunctionTypeMember6(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createFunctionTypeMember7FromString(TablePackage.eINSTANCE.getFunctionTypeMember7(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createFunctionTypeMember8FromString(TablePackage.eINSTANCE.getFunctionTypeMember8(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createFunctionTypeMember9FromString(TablePackage.eINSTANCE.getFunctionTypeMember9(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createFunctionTypeMember10FromString(TablePackage.eINSTANCE.getFunctionTypeMember10(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createFunctionTypeMember11FromString(TablePackage.eINSTANCE.getFunctionTypeMember11(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createFunctionTypeMember12FromString(TablePackage.eINSTANCE.getFunctionTypeMember12(), initialValue);
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
	public String convertFunctionTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (TablePackage.eINSTANCE.getFunctionTypeMember1().isInstance(instanceValue)) {
			try {
				String value = convertFunctionTypeMember1ToString(TablePackage.eINSTANCE.getFunctionTypeMember1(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (TablePackage.eINSTANCE.getFunctionTypeMember2().isInstance(instanceValue)) {
			try {
				String value = convertFunctionTypeMember2ToString(TablePackage.eINSTANCE.getFunctionTypeMember2(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (TablePackage.eINSTANCE.getFunctionTypeMember3().isInstance(instanceValue)) {
			try {
				String value = convertFunctionTypeMember3ToString(TablePackage.eINSTANCE.getFunctionTypeMember3(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (TablePackage.eINSTANCE.getFunctionTypeMember4().isInstance(instanceValue)) {
			try {
				String value = convertFunctionTypeMember4ToString(TablePackage.eINSTANCE.getFunctionTypeMember4(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (TablePackage.eINSTANCE.getFunctionTypeMember5().isInstance(instanceValue)) {
			try {
				String value = convertFunctionTypeMember5ToString(TablePackage.eINSTANCE.getFunctionTypeMember5(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (TablePackage.eINSTANCE.getFunctionTypeMember6().isInstance(instanceValue)) {
			try {
				String value = convertFunctionTypeMember6ToString(TablePackage.eINSTANCE.getFunctionTypeMember6(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (TablePackage.eINSTANCE.getFunctionTypeMember7().isInstance(instanceValue)) {
			try {
				String value = convertFunctionTypeMember7ToString(TablePackage.eINSTANCE.getFunctionTypeMember7(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (TablePackage.eINSTANCE.getFunctionTypeMember8().isInstance(instanceValue)) {
			try {
				String value = convertFunctionTypeMember8ToString(TablePackage.eINSTANCE.getFunctionTypeMember8(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (TablePackage.eINSTANCE.getFunctionTypeMember9().isInstance(instanceValue)) {
			try {
				String value = convertFunctionTypeMember9ToString(TablePackage.eINSTANCE.getFunctionTypeMember9(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (TablePackage.eINSTANCE.getFunctionTypeMember10().isInstance(instanceValue)) {
			try {
				String value = convertFunctionTypeMember10ToString(TablePackage.eINSTANCE.getFunctionTypeMember10(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (TablePackage.eINSTANCE.getFunctionTypeMember11().isInstance(instanceValue)) {
			try {
				String value = convertFunctionTypeMember11ToString(TablePackage.eINSTANCE.getFunctionTypeMember11(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (TablePackage.eINSTANCE.getFunctionTypeMember12().isInstance(instanceValue)) {
			try {
				String value = convertFunctionTypeMember12ToString(TablePackage.eINSTANCE.getFunctionTypeMember12(), instanceValue);
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
	public FunctionTypeMember10 createFunctionTypeMember10ObjectFromString(EDataType eDataType, String initialValue) {
		return createFunctionTypeMember10FromString(TablePackage.eINSTANCE.getFunctionTypeMember10(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFunctionTypeMember10ObjectToString(EDataType eDataType, Object instanceValue) {
		return convertFunctionTypeMember10ToString(TablePackage.eINSTANCE.getFunctionTypeMember10(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionTypeMember11 createFunctionTypeMember11ObjectFromString(EDataType eDataType, String initialValue) {
		return createFunctionTypeMember11FromString(TablePackage.eINSTANCE.getFunctionTypeMember11(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFunctionTypeMember11ObjectToString(EDataType eDataType, Object instanceValue) {
		return convertFunctionTypeMember11ToString(TablePackage.eINSTANCE.getFunctionTypeMember11(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionTypeMember12 createFunctionTypeMember12ObjectFromString(EDataType eDataType, String initialValue) {
		return createFunctionTypeMember12FromString(TablePackage.eINSTANCE.getFunctionTypeMember12(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFunctionTypeMember12ObjectToString(EDataType eDataType, Object instanceValue) {
		return convertFunctionTypeMember12ToString(TablePackage.eINSTANCE.getFunctionTypeMember12(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionTypeMember1 createFunctionTypeMember1ObjectFromString(EDataType eDataType, String initialValue) {
		return createFunctionTypeMember1FromString(TablePackage.eINSTANCE.getFunctionTypeMember1(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFunctionTypeMember1ObjectToString(EDataType eDataType, Object instanceValue) {
		return convertFunctionTypeMember1ToString(TablePackage.eINSTANCE.getFunctionTypeMember1(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionTypeMember2 createFunctionTypeMember2ObjectFromString(EDataType eDataType, String initialValue) {
		return createFunctionTypeMember2FromString(TablePackage.eINSTANCE.getFunctionTypeMember2(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFunctionTypeMember2ObjectToString(EDataType eDataType, Object instanceValue) {
		return convertFunctionTypeMember2ToString(TablePackage.eINSTANCE.getFunctionTypeMember2(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionTypeMember3 createFunctionTypeMember3ObjectFromString(EDataType eDataType, String initialValue) {
		return createFunctionTypeMember3FromString(TablePackage.eINSTANCE.getFunctionTypeMember3(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFunctionTypeMember3ObjectToString(EDataType eDataType, Object instanceValue) {
		return convertFunctionTypeMember3ToString(TablePackage.eINSTANCE.getFunctionTypeMember3(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionTypeMember4 createFunctionTypeMember4ObjectFromString(EDataType eDataType, String initialValue) {
		return createFunctionTypeMember4FromString(TablePackage.eINSTANCE.getFunctionTypeMember4(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFunctionTypeMember4ObjectToString(EDataType eDataType, Object instanceValue) {
		return convertFunctionTypeMember4ToString(TablePackage.eINSTANCE.getFunctionTypeMember4(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionTypeMember5 createFunctionTypeMember5ObjectFromString(EDataType eDataType, String initialValue) {
		return createFunctionTypeMember5FromString(TablePackage.eINSTANCE.getFunctionTypeMember5(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFunctionTypeMember5ObjectToString(EDataType eDataType, Object instanceValue) {
		return convertFunctionTypeMember5ToString(TablePackage.eINSTANCE.getFunctionTypeMember5(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionTypeMember6 createFunctionTypeMember6ObjectFromString(EDataType eDataType, String initialValue) {
		return createFunctionTypeMember6FromString(TablePackage.eINSTANCE.getFunctionTypeMember6(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFunctionTypeMember6ObjectToString(EDataType eDataType, Object instanceValue) {
		return convertFunctionTypeMember6ToString(TablePackage.eINSTANCE.getFunctionTypeMember6(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionTypeMember7 createFunctionTypeMember7ObjectFromString(EDataType eDataType, String initialValue) {
		return createFunctionTypeMember7FromString(TablePackage.eINSTANCE.getFunctionTypeMember7(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFunctionTypeMember7ObjectToString(EDataType eDataType, Object instanceValue) {
		return convertFunctionTypeMember7ToString(TablePackage.eINSTANCE.getFunctionTypeMember7(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionTypeMember8 createFunctionTypeMember8ObjectFromString(EDataType eDataType, String initialValue) {
		return createFunctionTypeMember8FromString(TablePackage.eINSTANCE.getFunctionTypeMember8(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFunctionTypeMember8ObjectToString(EDataType eDataType, Object instanceValue) {
		return convertFunctionTypeMember8ToString(TablePackage.eINSTANCE.getFunctionTypeMember8(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionTypeMember9 createFunctionTypeMember9ObjectFromString(EDataType eDataType, String initialValue) {
		return createFunctionTypeMember9FromString(TablePackage.eINSTANCE.getFunctionTypeMember9(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFunctionTypeMember9ObjectToString(EDataType eDataType, Object instanceValue) {
		return convertFunctionTypeMember9ToString(TablePackage.eINSTANCE.getFunctionTypeMember9(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GrandTotalType createGrandTotalTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createGrandTotalTypeFromString(TablePackage.eINSTANCE.getGrandTotalType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGrandTotalTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertGrandTotalTypeToString(TablePackage.eINSTANCE.getGrandTotalType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroupedByType createGroupedByTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createGroupedByTypeFromString(TablePackage.eINSTANCE.getGroupedByType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGroupedByTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertGroupedByTypeToString(TablePackage.eINSTANCE.getGroupedByType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LayoutModeType createLayoutModeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createLayoutModeTypeFromString(TablePackage.eINSTANCE.getLayoutModeType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLayoutModeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertLayoutModeTypeToString(TablePackage.eINSTANCE.getLayoutModeType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MemberTypeType createMemberTypeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createMemberTypeTypeFromString(TablePackage.eINSTANCE.getMemberTypeType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMemberTypeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertMemberTypeTypeToString(TablePackage.eINSTANCE.getMemberTypeType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageTypeType createMessageTypeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createMessageTypeTypeFromString(TablePackage.eINSTANCE.getMessageTypeType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMessageTypeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertMessageTypeTypeToString(TablePackage.eINSTANCE.getMessageTypeType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModeType createModeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createModeTypeFromString(TablePackage.eINSTANCE.getModeType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertModeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertModeTypeToString(TablePackage.eINSTANCE.getModeType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NameType createNameTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createNameTypeFromString(TablePackage.eINSTANCE.getNameType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNameTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertNameTypeToString(TablePackage.eINSTANCE.getNameType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrderType createOrderTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createOrderTypeFromString(TablePackage.eINSTANCE.getOrderType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOrderTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertOrderTypeToString(TablePackage.eINSTANCE.getOrderType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrientationType createOrientationTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createOrientationTypeFromString(TablePackage.eINSTANCE.getOrientationType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOrientationTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertOrientationTypeToString(TablePackage.eINSTANCE.getOrientationType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrientationType1 createOrientationTypeObject1FromString(EDataType eDataType, String initialValue) {
		return createOrientationType1FromString(TablePackage.eINSTANCE.getOrientationType1(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOrientationTypeObject1ToString(EDataType eDataType, Object instanceValue) {
		return convertOrientationType1ToString(TablePackage.eINSTANCE.getOrientationType1(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createRangeUsableAsTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Object result = null;
		RuntimeException exception = null;
		try {
			result = createRangeUsableAsTypeMember0FromString(TablePackage.eINSTANCE.getRangeUsableAsTypeMember0(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createRangeUsableAsTypeMember1FromString(TablePackage.eINSTANCE.getRangeUsableAsTypeMember1(), initialValue);
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
	public String convertRangeUsableAsTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (TablePackage.eINSTANCE.getRangeUsableAsTypeMember0().isInstance(instanceValue)) {
			try {
				String value = convertRangeUsableAsTypeMember0ToString(TablePackage.eINSTANCE.getRangeUsableAsTypeMember0(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (TablePackage.eINSTANCE.getRangeUsableAsTypeMember1().isInstance(instanceValue)) {
			try {
				String value = convertRangeUsableAsTypeMember1ToString(TablePackage.eINSTANCE.getRangeUsableAsTypeMember1(), instanceValue);
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
	public RangeUsableAsTypeMember0 createRangeUsableAsTypeMember0ObjectFromString(EDataType eDataType, String initialValue) {
		return createRangeUsableAsTypeMember0FromString(TablePackage.eINSTANCE.getRangeUsableAsTypeMember0(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRangeUsableAsTypeMember0ObjectToString(EDataType eDataType, Object instanceValue) {
		return convertRangeUsableAsTypeMember0ToString(TablePackage.eINSTANCE.getRangeUsableAsTypeMember0(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List createRangeUsableAsTypeMember1FromString(EDataType eDataType, String initialValue) {
		return (List)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRangeUsableAsTypeMember1ToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<RangeUsableAsTypeMember1BaseItem> createRangeUsableAsTypeMember1BaseFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		List<RangeUsableAsTypeMember1BaseItem> result = new ArrayList<RangeUsableAsTypeMember1BaseItem>();
		for (StringTokenizer stringTokenizer = new StringTokenizer(initialValue); stringTokenizer.hasMoreTokens(); ) {
			String item = stringTokenizer.nextToken();
			result.add(createRangeUsableAsTypeMember1BaseItemFromString(TablePackage.eINSTANCE.getRangeUsableAsTypeMember1BaseItem(), item));
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRangeUsableAsTypeMember1BaseToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		List<?> list = (List<?>)instanceValue;
		if (list.isEmpty()) return "";
		StringBuffer result = new StringBuffer();
		for (Object item : list) {
			result.append(convertRangeUsableAsTypeMember1BaseItemToString(TablePackage.eINSTANCE.getRangeUsableAsTypeMember1BaseItem(), item));
			result.append(' ');
		}
		return result.substring(0, result.length() - 1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RangeUsableAsTypeMember1BaseItem createRangeUsableAsTypeMember1BaseItemObjectFromString(EDataType eDataType, String initialValue) {
		return createRangeUsableAsTypeMember1BaseItemFromString(TablePackage.eINSTANCE.getRangeUsableAsTypeMember1BaseItem(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRangeUsableAsTypeMember1BaseItemObjectToString(EDataType eDataType, Object instanceValue) {
		return convertRangeUsableAsTypeMember1BaseItemToString(TablePackage.eINSTANCE.getRangeUsableAsTypeMember1BaseItem(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SortModeType createSortModeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createSortModeTypeFromString(TablePackage.eINSTANCE.getSortModeType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSortModeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSortModeTypeToString(TablePackage.eINSTANCE.getSortModeType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createStartTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Object result = null;
		RuntimeException exception = null;
		try {
			result = createStartTypeMember1FromString(TablePackage.eINSTANCE.getStartTypeMember1(), initialValue);
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
	public String convertStartTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (TablePackage.eINSTANCE.getStartTypeMember1().isInstance(instanceValue)) {
			try {
				String value = convertStartTypeMember1ToString(TablePackage.eINSTANCE.getStartTypeMember1(), instanceValue);
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
	public StartTypeMember1 createStartTypeMember1ObjectFromString(EDataType eDataType, String initialValue) {
		return createStartTypeMember1FromString(TablePackage.eINSTANCE.getStartTypeMember1(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStartTypeMember1ObjectToString(EDataType eDataType, Object instanceValue) {
		return convertStartTypeMember1ToString(TablePackage.eINSTANCE.getStartTypeMember1(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatusType createStatusTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createStatusTypeFromString(TablePackage.eINSTANCE.getStatusType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStatusTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertStatusTypeToString(TablePackage.eINSTANCE.getStatusType(), instanceValue);
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
			result = createStyleNameTypeMember1FromString(TablePackage.eINSTANCE.getStyleNameTypeMember1(), initialValue);
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
		if (TablePackage.eINSTANCE.getStyleNameTypeMember1().isInstance(instanceValue)) {
			try {
				String value = convertStyleNameTypeMember1ToString(TablePackage.eINSTANCE.getStyleNameTypeMember1(), instanceValue);
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
	public TypeType createTypeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createTypeTypeFromString(TablePackage.eINSTANCE.getTypeType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTypeTypeToString(TablePackage.eINSTANCE.getTypeType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeType1 createTypeTypeObject1FromString(EDataType eDataType, String initialValue) {
		return createTypeType1FromString(TablePackage.eINSTANCE.getTypeType1(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeTypeObject1ToString(EDataType eDataType, Object instanceValue) {
		return convertTypeType1ToString(TablePackage.eINSTANCE.getTypeType1(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UseLabelsType createUseLabelsTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createUseLabelsTypeFromString(TablePackage.eINSTANCE.getUseLabelsType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUseLabelsTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertUseLabelsTypeToString(TablePackage.eINSTANCE.getUseLabelsType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TablePackage getTablePackage() {
		return (TablePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TablePackage getPackage() {
		return TablePackage.eINSTANCE;
	}

} //TableFactoryImpl
