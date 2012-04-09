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
package org.oasisopen.names.tc.opendocument.xmlns.table;

import java.math.BigInteger;

import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.oasisopen.names.tc.opendocument.xmlns.text.TableVisibilityValue;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getBody <em>Body</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getCalculationSettings <em>Calculation Settings</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getCellAddress <em>Cell Address</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getCellContentChange <em>Cell Content Change</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getCellContentDeletion <em>Cell Content Deletion</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getCellRangeSource <em>Cell Range Source</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getChangeDeletion <em>Change Deletion</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getChangeTrackTableCell <em>Change Track Table Cell</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getConsolidation <em>Consolidation</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getContentValidation <em>Content Validation</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getContentValidations <em>Content Validations</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getCoveredTableCell <em>Covered Table Cell</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getCutOffs <em>Cut Offs</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getDatabaseRange <em>Database Range</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getDatabaseRanges <em>Database Ranges</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getDatabaseSourceQuery <em>Database Source Query</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getDatabaseSourceSql <em>Database Source Sql</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getDatabaseSourceTable <em>Database Source Table</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getDataPilotDisplayInfo <em>Data Pilot Display Info</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getDataPilotField <em>Data Pilot Field</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getDataPilotFieldReference <em>Data Pilot Field Reference</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getDataPilotGroup <em>Data Pilot Group</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getDataPilotGroupMember <em>Data Pilot Group Member</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getDataPilotGroups <em>Data Pilot Groups</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getDataPilotLayoutInfo <em>Data Pilot Layout Info</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getDataPilotLevel <em>Data Pilot Level</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getDataPilotMember <em>Data Pilot Member</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getDataPilotMembers <em>Data Pilot Members</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getDataPilotSortInfo <em>Data Pilot Sort Info</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getDataPilotSubtotal <em>Data Pilot Subtotal</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getDataPilotSubtotals <em>Data Pilot Subtotals</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getDataPilotTable <em>Data Pilot Table</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getDataPilotTables <em>Data Pilot Tables</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getDdeLink <em>Dde Link</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getDdeLinks <em>Dde Links</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getDeletion <em>Deletion</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getDeletions <em>Deletions</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getDependencies <em>Dependencies</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getDependency <em>Dependency</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getDetective <em>Detective</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getErrorMacro <em>Error Macro</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getErrorMessage <em>Error Message</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getEvenColumns <em>Even Columns</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getEvenRows <em>Even Rows</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getFilter <em>Filter</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getFilterAnd <em>Filter And</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getFilterCondition <em>Filter Condition</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getFilterOr <em>Filter Or</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getFirstColumn <em>First Column</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getFirstRow <em>First Row</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getHelpMessage <em>Help Message</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getHighlightedRange <em>Highlighted Range</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getInsertion <em>Insertion</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getInsertionCutOff <em>Insertion Cut Off</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getIteration <em>Iteration</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getLabelRange <em>Label Range</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getLabelRanges <em>Label Ranges</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getLastColumn <em>Last Column</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getLastRow <em>Last Row</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getMovement <em>Movement</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getMovementCutOff <em>Movement Cut Off</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getNamedExpression <em>Named Expression</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getNamedExpressions <em>Named Expressions</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getNamedRange <em>Named Range</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getNullDate <em>Null Date</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getOddColumns <em>Odd Columns</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getOddRows <em>Odd Rows</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getOperation <em>Operation</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getPrevious <em>Previous</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getScenario <em>Scenario</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getShapes <em>Shapes</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getSort <em>Sort</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getSortBy <em>Sort By</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getSortGroups <em>Sort Groups</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getSourceCellRange <em>Source Cell Range</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getSourceRangeAddress <em>Source Range Address</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getSourceService <em>Source Service</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getSubtotalField <em>Subtotal Field</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getSubtotalRule <em>Subtotal Rule</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getSubtotalRules <em>Subtotal Rules</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getTable <em>Table</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getTableCell <em>Table Cell</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getTableColumn <em>Table Column</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getTableColumnGroup <em>Table Column Group</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getTableColumns <em>Table Columns</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getTableHeaderColumns <em>Table Header Columns</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getTableHeaderRows <em>Table Header Rows</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getTableRow <em>Table Row</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getTableRowGroup <em>Table Row Group</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getTableRows <em>Table Rows</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getTableSource <em>Table Source</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getTableTemplate <em>Table Template</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getTargetRangeAddress <em>Target Range Address</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getTrackedChanges <em>Tracked Changes</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getAcceptanceState <em>Acceptance State</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getAddEmptyLines <em>Add Empty Lines</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getAlgorithm <em>Algorithm</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getAlign <em>Align</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getAllowEmptyCell <em>Allow Empty Cell</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getApplicationData <em>Application Data</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getAutomaticFindLabels <em>Automatic Find Labels</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getBaseCellAddress <em>Base Cell Address</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getBindStylesToContent <em>Bind Styles To Content</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getBorderColor <em>Border Color</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getBorderModel <em>Border Model</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getButtons <em>Buttons</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getCellAddress1 <em>Cell Address1</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getCellRange <em>Cell Range</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getCellRangeAddress <em>Cell Range Address</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getColumn <em>Column</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getComment <em>Comment</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getConditionSource <em>Condition Source</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getConditionSourceRangeAddress <em>Condition Source Range Address</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getContainsError <em>Contains Error</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getContainsHeader <em>Contains Header</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getContentValidationName <em>Content Validation Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getCopyBack <em>Copy Back</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getCopyFormulas <em>Copy Formulas</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getCopyStyles <em>Copy Styles</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getCount <em>Count</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getCountry <em>Country</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getDatabaseName <em>Database Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getDatabaseTableName <em>Database Table Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getDataCellRangeAddress <em>Data Cell Range Address</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getDataField <em>Data Field</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getDateEnd <em>Date End</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getDateStart <em>Date Start</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getDefaultCellStyleName <em>Default Cell Style Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getDirection <em>Direction</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getDisplay <em>Display</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getDisplayBorder <em>Display Border</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getDisplayDuplicates <em>Display Duplicates</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getDisplayFilterButtons <em>Display Filter Buttons</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getDisplayList <em>Display List</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getDisplayMemberMode <em>Display Member Mode</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getDrillDownOnDoubleClick <em>Drill Down On Double Click</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getEnabled <em>Enabled</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getEnd <em>End</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getEndCellAddress <em>End Cell Address</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getEndColumn <em>End Column</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getEndPosition <em>End Position</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getEndRow <em>End Row</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getEndTable <em>End Table</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getEndX <em>End X</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getEndY <em>End Y</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getFieldName <em>Field Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getFieldNumber <em>Field Number</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getFilterName <em>Filter Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getFilterOptions <em>Filter Options</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getFormula <em>Formula</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getFunction <em>Function</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getGrandTotal <em>Grand Total</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getGroupByFieldNumber <em>Group By Field Number</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getGroupedBy <em>Grouped By</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getHasPersistentData <em>Has Persistent Data</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getId <em>Id</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getIdentifyCategories <em>Identify Categories</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getIgnoreEmptyRows <em>Ignore Empty Rows</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getIndex <em>Index</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getIsActive <em>Is Active</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getIsDataLayoutField <em>Is Data Layout Field</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getIsSelection <em>Is Selection</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getIsSubTable <em>Is Sub Table</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getLabelCellRangeAddress <em>Label Cell Range Address</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getLanguage <em>Language</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getLastColumnSpanned <em>Last Column Spanned</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getLastRowSpanned <em>Last Row Spanned</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getLayoutMode <em>Layout Mode</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getLinkToSourceData <em>Link To Source Data</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getMarkedInvalid <em>Marked Invalid</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getMatrixCovered <em>Matrix Covered</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getMemberCount <em>Member Count</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getMemberName <em>Member Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getMemberType <em>Member Type</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getMode <em>Mode</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getMultiDeletionSpanned <em>Multi Deletion Spanned</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getNullYear <em>Null Year</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getNumberColumnsRepeated <em>Number Columns Repeated</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getNumberColumnsSpanned <em>Number Columns Spanned</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getNumberMatrixColumnsSpanned <em>Number Matrix Columns Spanned</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getNumberMatrixRowsSpanned <em>Number Matrix Rows Spanned</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getNumberRowsRepeated <em>Number Rows Repeated</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getNumberRowsSpanned <em>Number Rows Spanned</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getObjectName <em>Object Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getOnUpdateKeepSize <em>On Update Keep Size</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getOnUpdateKeepStyles <em>On Update Keep Styles</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getOperator <em>Operator</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getOrder <em>Order</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getPageBreaksOnGroupChange <em>Page Breaks On Group Change</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getParseSqlStatement <em>Parse Sql Statement</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getPassword <em>Password</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getPosition <em>Position</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getPrecisionAsShown <em>Precision As Shown</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getPrint <em>Print</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getPrintRanges <em>Print Ranges</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getProtect <em>Protect</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getProtected <em>Protected</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getQueryName <em>Query Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getRangeUsableAs <em>Range Usable As</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getRejectingChangeId <em>Rejecting Change Id</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getRow <em>Row</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getScenarioRanges <em>Scenario Ranges</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getSearchCriteriaMustApplyToWholeCell <em>Search Criteria Must Apply To Whole Cell</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getSelectedPage <em>Selected Page</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getShowDetails <em>Show Details</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getShowEmpty <em>Show Empty</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getShowFilterButton <em>Show Filter Button</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getSortMode <em>Sort Mode</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getSourceCellRangeAddresses <em>Source Cell Range Addresses</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getSourceFieldName <em>Source Field Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getSourceName <em>Source Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getSqlStatement <em>Sql Statement</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getStart <em>Start</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getStartColumn <em>Start Column</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getStartPosition <em>Start Position</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getStartRow <em>Start Row</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getStartTable <em>Start Table</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getStep <em>Step</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getStructureProtected <em>Structure Protected</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getStyleName <em>Style Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getTable1 <em>Table1</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getTableBackground <em>Table Background</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getTableName <em>Table Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getTargetCellAddress <em>Target Cell Address</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getTargetRangeAddress1 <em>Target Range Address1</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getTrackChanges <em>Track Changes</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getUsedHierarchy <em>Used Hierarchy</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getUseLabels <em>Use Labels</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getUseRegularExpressions <em>Use Regular Expressions</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getUserName <em>User Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getValue <em>Value</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getVisibility <em>Visibility</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot()
 * @model extendedMetaData="name='' kind='mixed'"
 * @generated
 */
public interface DocumentRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mixed</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mixed</em>' attribute list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':mixed'"
	 * @generated
	 */
	FeatureMap getMixed();

	/**
	 * Returns the value of the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XMLNS Prefix Map</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XMLNS Prefix Map</em>' map.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_XMLNSPrefixMap()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" transient="true"
	 *        extendedMetaData="kind='attribute' name='xmlns:prefix'"
	 * @generated
	 */
	EMap<String, String> getXMLNSPrefixMap();

	/**
	 * Returns the value of the '<em><b>XSI Schema Location</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XSI Schema Location</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XSI Schema Location</em>' map.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_XSISchemaLocation()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" transient="true"
	 *        extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
	 * @generated
	 */
	EMap<String, String> getXSISchemaLocation();

	/**
	 * Returns the value of the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' containment reference.
	 * @see #setBody(BodyType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_Body()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='body' namespace='##targetNamespace'"
	 * @generated
	 */
	BodyType getBody();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getBody <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' containment reference.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(BodyType value);

	/**
	 * Returns the value of the '<em><b>Calculation Settings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Calculation Settings</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Calculation Settings</em>' containment reference.
	 * @see #setCalculationSettings(CalculationSettingsType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_CalculationSettings()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='calculation-settings' namespace='##targetNamespace'"
	 * @generated
	 */
	CalculationSettingsType getCalculationSettings();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getCalculationSettings <em>Calculation Settings</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Calculation Settings</em>' containment reference.
	 * @see #getCalculationSettings()
	 * @generated
	 */
	void setCalculationSettings(CalculationSettingsType value);

	/**
	 * Returns the value of the '<em><b>Cell Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cell Address</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cell Address</em>' containment reference.
	 * @see #setCellAddress(CellAddressType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_CellAddress()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='cell-address' namespace='##targetNamespace'"
	 * @generated
	 */
	CellAddressType getCellAddress();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getCellAddress <em>Cell Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cell Address</em>' containment reference.
	 * @see #getCellAddress()
	 * @generated
	 */
	void setCellAddress(CellAddressType value);

	/**
	 * Returns the value of the '<em><b>Cell Content Change</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cell Content Change</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cell Content Change</em>' containment reference.
	 * @see #setCellContentChange(CellContentChangeType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_CellContentChange()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='cell-content-change' namespace='##targetNamespace'"
	 * @generated
	 */
	CellContentChangeType getCellContentChange();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getCellContentChange <em>Cell Content Change</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cell Content Change</em>' containment reference.
	 * @see #getCellContentChange()
	 * @generated
	 */
	void setCellContentChange(CellContentChangeType value);

	/**
	 * Returns the value of the '<em><b>Cell Content Deletion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cell Content Deletion</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cell Content Deletion</em>' containment reference.
	 * @see #setCellContentDeletion(CellContentDeletionType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_CellContentDeletion()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='cell-content-deletion' namespace='##targetNamespace'"
	 * @generated
	 */
	CellContentDeletionType getCellContentDeletion();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getCellContentDeletion <em>Cell Content Deletion</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cell Content Deletion</em>' containment reference.
	 * @see #getCellContentDeletion()
	 * @generated
	 */
	void setCellContentDeletion(CellContentDeletionType value);

	/**
	 * Returns the value of the '<em><b>Cell Range Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cell Range Source</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cell Range Source</em>' containment reference.
	 * @see #setCellRangeSource(CellRangeSourceType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_CellRangeSource()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='cell-range-source' namespace='##targetNamespace'"
	 * @generated
	 */
	CellRangeSourceType getCellRangeSource();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getCellRangeSource <em>Cell Range Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cell Range Source</em>' containment reference.
	 * @see #getCellRangeSource()
	 * @generated
	 */
	void setCellRangeSource(CellRangeSourceType value);

	/**
	 * Returns the value of the '<em><b>Change Deletion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Change Deletion</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Change Deletion</em>' containment reference.
	 * @see #setChangeDeletion(ChangeDeletionType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_ChangeDeletion()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='change-deletion' namespace='##targetNamespace'"
	 * @generated
	 */
	ChangeDeletionType getChangeDeletion();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getChangeDeletion <em>Change Deletion</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Change Deletion</em>' containment reference.
	 * @see #getChangeDeletion()
	 * @generated
	 */
	void setChangeDeletion(ChangeDeletionType value);

	/**
	 * Returns the value of the '<em><b>Change Track Table Cell</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Change Track Table Cell</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Change Track Table Cell</em>' containment reference.
	 * @see #setChangeTrackTableCell(ChangeTrackTableCellType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_ChangeTrackTableCell()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='change-track-table-cell' namespace='##targetNamespace'"
	 * @generated
	 */
	ChangeTrackTableCellType getChangeTrackTableCell();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getChangeTrackTableCell <em>Change Track Table Cell</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Change Track Table Cell</em>' containment reference.
	 * @see #getChangeTrackTableCell()
	 * @generated
	 */
	void setChangeTrackTableCell(ChangeTrackTableCellType value);

	/**
	 * Returns the value of the '<em><b>Consolidation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Consolidation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Consolidation</em>' containment reference.
	 * @see #setConsolidation(ConsolidationType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_Consolidation()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='consolidation' namespace='##targetNamespace'"
	 * @generated
	 */
	ConsolidationType getConsolidation();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getConsolidation <em>Consolidation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Consolidation</em>' containment reference.
	 * @see #getConsolidation()
	 * @generated
	 */
	void setConsolidation(ConsolidationType value);

	/**
	 * Returns the value of the '<em><b>Content Validation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content Validation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Validation</em>' containment reference.
	 * @see #setContentValidation(ContentValidationType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_ContentValidation()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='content-validation' namespace='##targetNamespace'"
	 * @generated
	 */
	ContentValidationType getContentValidation();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getContentValidation <em>Content Validation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content Validation</em>' containment reference.
	 * @see #getContentValidation()
	 * @generated
	 */
	void setContentValidation(ContentValidationType value);

	/**
	 * Returns the value of the '<em><b>Content Validations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content Validations</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Validations</em>' containment reference.
	 * @see #setContentValidations(ContentValidationsType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_ContentValidations()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='content-validations' namespace='##targetNamespace'"
	 * @generated
	 */
	ContentValidationsType getContentValidations();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getContentValidations <em>Content Validations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content Validations</em>' containment reference.
	 * @see #getContentValidations()
	 * @generated
	 */
	void setContentValidations(ContentValidationsType value);

	/**
	 * Returns the value of the '<em><b>Covered Table Cell</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Covered Table Cell</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Covered Table Cell</em>' containment reference.
	 * @see #setCoveredTableCell(CoveredTableCellType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_CoveredTableCell()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='covered-table-cell' namespace='##targetNamespace'"
	 * @generated
	 */
	CoveredTableCellType getCoveredTableCell();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getCoveredTableCell <em>Covered Table Cell</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Covered Table Cell</em>' containment reference.
	 * @see #getCoveredTableCell()
	 * @generated
	 */
	void setCoveredTableCell(CoveredTableCellType value);

	/**
	 * Returns the value of the '<em><b>Cut Offs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cut Offs</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cut Offs</em>' containment reference.
	 * @see #setCutOffs(CutOffsType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_CutOffs()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='cut-offs' namespace='##targetNamespace'"
	 * @generated
	 */
	CutOffsType getCutOffs();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getCutOffs <em>Cut Offs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cut Offs</em>' containment reference.
	 * @see #getCutOffs()
	 * @generated
	 */
	void setCutOffs(CutOffsType value);

	/**
	 * Returns the value of the '<em><b>Database Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Database Range</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Database Range</em>' containment reference.
	 * @see #setDatabaseRange(DatabaseRangeType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_DatabaseRange()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='database-range' namespace='##targetNamespace'"
	 * @generated
	 */
	DatabaseRangeType getDatabaseRange();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getDatabaseRange <em>Database Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Database Range</em>' containment reference.
	 * @see #getDatabaseRange()
	 * @generated
	 */
	void setDatabaseRange(DatabaseRangeType value);

	/**
	 * Returns the value of the '<em><b>Database Ranges</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Database Ranges</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Database Ranges</em>' containment reference.
	 * @see #setDatabaseRanges(DatabaseRangesType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_DatabaseRanges()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='database-ranges' namespace='##targetNamespace'"
	 * @generated
	 */
	DatabaseRangesType getDatabaseRanges();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getDatabaseRanges <em>Database Ranges</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Database Ranges</em>' containment reference.
	 * @see #getDatabaseRanges()
	 * @generated
	 */
	void setDatabaseRanges(DatabaseRangesType value);

	/**
	 * Returns the value of the '<em><b>Database Source Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Database Source Query</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Database Source Query</em>' containment reference.
	 * @see #setDatabaseSourceQuery(DatabaseSourceQueryType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_DatabaseSourceQuery()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='database-source-query' namespace='##targetNamespace'"
	 * @generated
	 */
	DatabaseSourceQueryType getDatabaseSourceQuery();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getDatabaseSourceQuery <em>Database Source Query</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Database Source Query</em>' containment reference.
	 * @see #getDatabaseSourceQuery()
	 * @generated
	 */
	void setDatabaseSourceQuery(DatabaseSourceQueryType value);

	/**
	 * Returns the value of the '<em><b>Database Source Sql</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Database Source Sql</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Database Source Sql</em>' containment reference.
	 * @see #setDatabaseSourceSql(DatabaseSourceSqlType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_DatabaseSourceSql()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='database-source-sql' namespace='##targetNamespace'"
	 * @generated
	 */
	DatabaseSourceSqlType getDatabaseSourceSql();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getDatabaseSourceSql <em>Database Source Sql</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Database Source Sql</em>' containment reference.
	 * @see #getDatabaseSourceSql()
	 * @generated
	 */
	void setDatabaseSourceSql(DatabaseSourceSqlType value);

	/**
	 * Returns the value of the '<em><b>Database Source Table</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Database Source Table</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Database Source Table</em>' containment reference.
	 * @see #setDatabaseSourceTable(DatabaseSourceTableType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_DatabaseSourceTable()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='database-source-table' namespace='##targetNamespace'"
	 * @generated
	 */
	DatabaseSourceTableType getDatabaseSourceTable();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getDatabaseSourceTable <em>Database Source Table</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Database Source Table</em>' containment reference.
	 * @see #getDatabaseSourceTable()
	 * @generated
	 */
	void setDatabaseSourceTable(DatabaseSourceTableType value);

	/**
	 * Returns the value of the '<em><b>Data Pilot Display Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Pilot Display Info</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Pilot Display Info</em>' containment reference.
	 * @see #setDataPilotDisplayInfo(DataPilotDisplayInfoType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_DataPilotDisplayInfo()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='data-pilot-display-info' namespace='##targetNamespace'"
	 * @generated
	 */
	DataPilotDisplayInfoType getDataPilotDisplayInfo();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getDataPilotDisplayInfo <em>Data Pilot Display Info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Pilot Display Info</em>' containment reference.
	 * @see #getDataPilotDisplayInfo()
	 * @generated
	 */
	void setDataPilotDisplayInfo(DataPilotDisplayInfoType value);

	/**
	 * Returns the value of the '<em><b>Data Pilot Field</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Pilot Field</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Pilot Field</em>' containment reference.
	 * @see #setDataPilotField(DataPilotFieldType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_DataPilotField()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='data-pilot-field' namespace='##targetNamespace'"
	 * @generated
	 */
	DataPilotFieldType getDataPilotField();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getDataPilotField <em>Data Pilot Field</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Pilot Field</em>' containment reference.
	 * @see #getDataPilotField()
	 * @generated
	 */
	void setDataPilotField(DataPilotFieldType value);

	/**
	 * Returns the value of the '<em><b>Data Pilot Field Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Pilot Field Reference</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Pilot Field Reference</em>' containment reference.
	 * @see #setDataPilotFieldReference(DataPilotFieldReferenceType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_DataPilotFieldReference()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='data-pilot-field-reference' namespace='##targetNamespace'"
	 * @generated
	 */
	DataPilotFieldReferenceType getDataPilotFieldReference();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getDataPilotFieldReference <em>Data Pilot Field Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Pilot Field Reference</em>' containment reference.
	 * @see #getDataPilotFieldReference()
	 * @generated
	 */
	void setDataPilotFieldReference(DataPilotFieldReferenceType value);

	/**
	 * Returns the value of the '<em><b>Data Pilot Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Pilot Group</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Pilot Group</em>' containment reference.
	 * @see #setDataPilotGroup(DataPilotGroupType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_DataPilotGroup()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='data-pilot-group' namespace='##targetNamespace'"
	 * @generated
	 */
	DataPilotGroupType getDataPilotGroup();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getDataPilotGroup <em>Data Pilot Group</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Pilot Group</em>' containment reference.
	 * @see #getDataPilotGroup()
	 * @generated
	 */
	void setDataPilotGroup(DataPilotGroupType value);

	/**
	 * Returns the value of the '<em><b>Data Pilot Group Member</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Pilot Group Member</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Pilot Group Member</em>' containment reference.
	 * @see #setDataPilotGroupMember(DataPilotGroupMemberType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_DataPilotGroupMember()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='data-pilot-group-member' namespace='##targetNamespace'"
	 * @generated
	 */
	DataPilotGroupMemberType getDataPilotGroupMember();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getDataPilotGroupMember <em>Data Pilot Group Member</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Pilot Group Member</em>' containment reference.
	 * @see #getDataPilotGroupMember()
	 * @generated
	 */
	void setDataPilotGroupMember(DataPilotGroupMemberType value);

	/**
	 * Returns the value of the '<em><b>Data Pilot Groups</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Pilot Groups</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Pilot Groups</em>' containment reference.
	 * @see #setDataPilotGroups(DataPilotGroupsType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_DataPilotGroups()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='data-pilot-groups' namespace='##targetNamespace'"
	 * @generated
	 */
	DataPilotGroupsType getDataPilotGroups();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getDataPilotGroups <em>Data Pilot Groups</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Pilot Groups</em>' containment reference.
	 * @see #getDataPilotGroups()
	 * @generated
	 */
	void setDataPilotGroups(DataPilotGroupsType value);

	/**
	 * Returns the value of the '<em><b>Data Pilot Layout Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Pilot Layout Info</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Pilot Layout Info</em>' containment reference.
	 * @see #setDataPilotLayoutInfo(DataPilotLayoutInfoType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_DataPilotLayoutInfo()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='data-pilot-layout-info' namespace='##targetNamespace'"
	 * @generated
	 */
	DataPilotLayoutInfoType getDataPilotLayoutInfo();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getDataPilotLayoutInfo <em>Data Pilot Layout Info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Pilot Layout Info</em>' containment reference.
	 * @see #getDataPilotLayoutInfo()
	 * @generated
	 */
	void setDataPilotLayoutInfo(DataPilotLayoutInfoType value);

	/**
	 * Returns the value of the '<em><b>Data Pilot Level</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Pilot Level</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Pilot Level</em>' containment reference.
	 * @see #setDataPilotLevel(DataPilotLevelType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_DataPilotLevel()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='data-pilot-level' namespace='##targetNamespace'"
	 * @generated
	 */
	DataPilotLevelType getDataPilotLevel();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getDataPilotLevel <em>Data Pilot Level</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Pilot Level</em>' containment reference.
	 * @see #getDataPilotLevel()
	 * @generated
	 */
	void setDataPilotLevel(DataPilotLevelType value);

	/**
	 * Returns the value of the '<em><b>Data Pilot Member</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Pilot Member</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Pilot Member</em>' containment reference.
	 * @see #setDataPilotMember(DataPilotMemberType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_DataPilotMember()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='data-pilot-member' namespace='##targetNamespace'"
	 * @generated
	 */
	DataPilotMemberType getDataPilotMember();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getDataPilotMember <em>Data Pilot Member</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Pilot Member</em>' containment reference.
	 * @see #getDataPilotMember()
	 * @generated
	 */
	void setDataPilotMember(DataPilotMemberType value);

	/**
	 * Returns the value of the '<em><b>Data Pilot Members</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Pilot Members</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Pilot Members</em>' containment reference.
	 * @see #setDataPilotMembers(DataPilotMembersType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_DataPilotMembers()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='data-pilot-members' namespace='##targetNamespace'"
	 * @generated
	 */
	DataPilotMembersType getDataPilotMembers();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getDataPilotMembers <em>Data Pilot Members</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Pilot Members</em>' containment reference.
	 * @see #getDataPilotMembers()
	 * @generated
	 */
	void setDataPilotMembers(DataPilotMembersType value);

	/**
	 * Returns the value of the '<em><b>Data Pilot Sort Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Pilot Sort Info</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Pilot Sort Info</em>' containment reference.
	 * @see #setDataPilotSortInfo(DataPilotSortInfoType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_DataPilotSortInfo()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='data-pilot-sort-info' namespace='##targetNamespace'"
	 * @generated
	 */
	DataPilotSortInfoType getDataPilotSortInfo();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getDataPilotSortInfo <em>Data Pilot Sort Info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Pilot Sort Info</em>' containment reference.
	 * @see #getDataPilotSortInfo()
	 * @generated
	 */
	void setDataPilotSortInfo(DataPilotSortInfoType value);

	/**
	 * Returns the value of the '<em><b>Data Pilot Subtotal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Pilot Subtotal</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Pilot Subtotal</em>' containment reference.
	 * @see #setDataPilotSubtotal(DataPilotSubtotalType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_DataPilotSubtotal()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='data-pilot-subtotal' namespace='##targetNamespace'"
	 * @generated
	 */
	DataPilotSubtotalType getDataPilotSubtotal();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getDataPilotSubtotal <em>Data Pilot Subtotal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Pilot Subtotal</em>' containment reference.
	 * @see #getDataPilotSubtotal()
	 * @generated
	 */
	void setDataPilotSubtotal(DataPilotSubtotalType value);

	/**
	 * Returns the value of the '<em><b>Data Pilot Subtotals</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Pilot Subtotals</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Pilot Subtotals</em>' containment reference.
	 * @see #setDataPilotSubtotals(DataPilotSubtotalsType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_DataPilotSubtotals()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='data-pilot-subtotals' namespace='##targetNamespace'"
	 * @generated
	 */
	DataPilotSubtotalsType getDataPilotSubtotals();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getDataPilotSubtotals <em>Data Pilot Subtotals</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Pilot Subtotals</em>' containment reference.
	 * @see #getDataPilotSubtotals()
	 * @generated
	 */
	void setDataPilotSubtotals(DataPilotSubtotalsType value);

	/**
	 * Returns the value of the '<em><b>Data Pilot Table</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Pilot Table</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Pilot Table</em>' containment reference.
	 * @see #setDataPilotTable(DataPilotTableType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_DataPilotTable()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='data-pilot-table' namespace='##targetNamespace'"
	 * @generated
	 */
	DataPilotTableType getDataPilotTable();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getDataPilotTable <em>Data Pilot Table</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Pilot Table</em>' containment reference.
	 * @see #getDataPilotTable()
	 * @generated
	 */
	void setDataPilotTable(DataPilotTableType value);

	/**
	 * Returns the value of the '<em><b>Data Pilot Tables</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Pilot Tables</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Pilot Tables</em>' containment reference.
	 * @see #setDataPilotTables(DataPilotTablesType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_DataPilotTables()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='data-pilot-tables' namespace='##targetNamespace'"
	 * @generated
	 */
	DataPilotTablesType getDataPilotTables();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getDataPilotTables <em>Data Pilot Tables</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Pilot Tables</em>' containment reference.
	 * @see #getDataPilotTables()
	 * @generated
	 */
	void setDataPilotTables(DataPilotTablesType value);

	/**
	 * Returns the value of the '<em><b>Dde Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dde Link</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dde Link</em>' containment reference.
	 * @see #setDdeLink(DdeLinkType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_DdeLink()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='dde-link' namespace='##targetNamespace'"
	 * @generated
	 */
	DdeLinkType getDdeLink();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getDdeLink <em>Dde Link</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dde Link</em>' containment reference.
	 * @see #getDdeLink()
	 * @generated
	 */
	void setDdeLink(DdeLinkType value);

	/**
	 * Returns the value of the '<em><b>Dde Links</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dde Links</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dde Links</em>' containment reference.
	 * @see #setDdeLinks(DdeLinksType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_DdeLinks()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='dde-links' namespace='##targetNamespace'"
	 * @generated
	 */
	DdeLinksType getDdeLinks();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getDdeLinks <em>Dde Links</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dde Links</em>' containment reference.
	 * @see #getDdeLinks()
	 * @generated
	 */
	void setDdeLinks(DdeLinksType value);

	/**
	 * Returns the value of the '<em><b>Deletion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deletion</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deletion</em>' containment reference.
	 * @see #setDeletion(DeletionType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_Deletion()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='deletion' namespace='##targetNamespace'"
	 * @generated
	 */
	DeletionType getDeletion();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getDeletion <em>Deletion</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deletion</em>' containment reference.
	 * @see #getDeletion()
	 * @generated
	 */
	void setDeletion(DeletionType value);

	/**
	 * Returns the value of the '<em><b>Deletions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deletions</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deletions</em>' containment reference.
	 * @see #setDeletions(DeletionsType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_Deletions()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='deletions' namespace='##targetNamespace'"
	 * @generated
	 */
	DeletionsType getDeletions();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getDeletions <em>Deletions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deletions</em>' containment reference.
	 * @see #getDeletions()
	 * @generated
	 */
	void setDeletions(DeletionsType value);

	/**
	 * Returns the value of the '<em><b>Dependencies</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dependencies</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependencies</em>' containment reference.
	 * @see #setDependencies(DependenciesType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_Dependencies()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='dependencies' namespace='##targetNamespace'"
	 * @generated
	 */
	DependenciesType getDependencies();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getDependencies <em>Dependencies</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dependencies</em>' containment reference.
	 * @see #getDependencies()
	 * @generated
	 */
	void setDependencies(DependenciesType value);

	/**
	 * Returns the value of the '<em><b>Dependency</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dependency</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependency</em>' containment reference.
	 * @see #setDependency(DependencyType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_Dependency()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='dependency' namespace='##targetNamespace'"
	 * @generated
	 */
	DependencyType getDependency();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getDependency <em>Dependency</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dependency</em>' containment reference.
	 * @see #getDependency()
	 * @generated
	 */
	void setDependency(DependencyType value);

	/**
	 * Returns the value of the '<em><b>Detective</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Detective</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Detective</em>' containment reference.
	 * @see #setDetective(DetectiveType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_Detective()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='detective' namespace='##targetNamespace'"
	 * @generated
	 */
	DetectiveType getDetective();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getDetective <em>Detective</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Detective</em>' containment reference.
	 * @see #getDetective()
	 * @generated
	 */
	void setDetective(DetectiveType value);

	/**
	 * Returns the value of the '<em><b>Error Macro</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Error Macro</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Error Macro</em>' containment reference.
	 * @see #setErrorMacro(ErrorMacroType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_ErrorMacro()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='error-macro' namespace='##targetNamespace'"
	 * @generated
	 */
	ErrorMacroType getErrorMacro();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getErrorMacro <em>Error Macro</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Error Macro</em>' containment reference.
	 * @see #getErrorMacro()
	 * @generated
	 */
	void setErrorMacro(ErrorMacroType value);

	/**
	 * Returns the value of the '<em><b>Error Message</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Error Message</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Error Message</em>' containment reference.
	 * @see #setErrorMessage(ErrorMessageType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_ErrorMessage()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='error-message' namespace='##targetNamespace'"
	 * @generated
	 */
	ErrorMessageType getErrorMessage();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getErrorMessage <em>Error Message</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Error Message</em>' containment reference.
	 * @see #getErrorMessage()
	 * @generated
	 */
	void setErrorMessage(ErrorMessageType value);

	/**
	 * Returns the value of the '<em><b>Even Columns</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Even Columns</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Even Columns</em>' containment reference.
	 * @see #setEvenColumns(EvenColumnsType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_EvenColumns()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='even-columns' namespace='##targetNamespace'"
	 * @generated
	 */
	EvenColumnsType getEvenColumns();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getEvenColumns <em>Even Columns</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Even Columns</em>' containment reference.
	 * @see #getEvenColumns()
	 * @generated
	 */
	void setEvenColumns(EvenColumnsType value);

	/**
	 * Returns the value of the '<em><b>Even Rows</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Even Rows</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Even Rows</em>' containment reference.
	 * @see #setEvenRows(EvenRowsType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_EvenRows()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='even-rows' namespace='##targetNamespace'"
	 * @generated
	 */
	EvenRowsType getEvenRows();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getEvenRows <em>Even Rows</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Even Rows</em>' containment reference.
	 * @see #getEvenRows()
	 * @generated
	 */
	void setEvenRows(EvenRowsType value);

	/**
	 * Returns the value of the '<em><b>Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Filter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filter</em>' containment reference.
	 * @see #setFilter(FilterType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_Filter()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='filter' namespace='##targetNamespace'"
	 * @generated
	 */
	FilterType getFilter();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getFilter <em>Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filter</em>' containment reference.
	 * @see #getFilter()
	 * @generated
	 */
	void setFilter(FilterType value);

	/**
	 * Returns the value of the '<em><b>Filter And</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Filter And</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filter And</em>' containment reference.
	 * @see #setFilterAnd(FilterAndType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_FilterAnd()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='filter-and' namespace='##targetNamespace'"
	 * @generated
	 */
	FilterAndType getFilterAnd();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getFilterAnd <em>Filter And</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filter And</em>' containment reference.
	 * @see #getFilterAnd()
	 * @generated
	 */
	void setFilterAnd(FilterAndType value);

	/**
	 * Returns the value of the '<em><b>Filter Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Filter Condition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filter Condition</em>' containment reference.
	 * @see #setFilterCondition(FilterConditionType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_FilterCondition()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='filter-condition' namespace='##targetNamespace'"
	 * @generated
	 */
	FilterConditionType getFilterCondition();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getFilterCondition <em>Filter Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filter Condition</em>' containment reference.
	 * @see #getFilterCondition()
	 * @generated
	 */
	void setFilterCondition(FilterConditionType value);

	/**
	 * Returns the value of the '<em><b>Filter Or</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Filter Or</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filter Or</em>' containment reference.
	 * @see #setFilterOr(FilterOrType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_FilterOr()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='filter-or' namespace='##targetNamespace'"
	 * @generated
	 */
	FilterOrType getFilterOr();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getFilterOr <em>Filter Or</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filter Or</em>' containment reference.
	 * @see #getFilterOr()
	 * @generated
	 */
	void setFilterOr(FilterOrType value);

	/**
	 * Returns the value of the '<em><b>First Column</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First Column</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Column</em>' containment reference.
	 * @see #setFirstColumn(FirstColumnType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_FirstColumn()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='first-column' namespace='##targetNamespace'"
	 * @generated
	 */
	FirstColumnType getFirstColumn();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getFirstColumn <em>First Column</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Column</em>' containment reference.
	 * @see #getFirstColumn()
	 * @generated
	 */
	void setFirstColumn(FirstColumnType value);

	/**
	 * Returns the value of the '<em><b>First Row</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First Row</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Row</em>' containment reference.
	 * @see #setFirstRow(FirstRowType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_FirstRow()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='first-row' namespace='##targetNamespace'"
	 * @generated
	 */
	FirstRowType getFirstRow();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getFirstRow <em>First Row</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Row</em>' containment reference.
	 * @see #getFirstRow()
	 * @generated
	 */
	void setFirstRow(FirstRowType value);

	/**
	 * Returns the value of the '<em><b>Help Message</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Help Message</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Help Message</em>' containment reference.
	 * @see #setHelpMessage(HelpMessageType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_HelpMessage()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='help-message' namespace='##targetNamespace'"
	 * @generated
	 */
	HelpMessageType getHelpMessage();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getHelpMessage <em>Help Message</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Help Message</em>' containment reference.
	 * @see #getHelpMessage()
	 * @generated
	 */
	void setHelpMessage(HelpMessageType value);

	/**
	 * Returns the value of the '<em><b>Highlighted Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Highlighted Range</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Highlighted Range</em>' containment reference.
	 * @see #setHighlightedRange(HighlightedRangeType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_HighlightedRange()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='highlighted-range' namespace='##targetNamespace'"
	 * @generated
	 */
	HighlightedRangeType getHighlightedRange();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getHighlightedRange <em>Highlighted Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Highlighted Range</em>' containment reference.
	 * @see #getHighlightedRange()
	 * @generated
	 */
	void setHighlightedRange(HighlightedRangeType value);

	/**
	 * Returns the value of the '<em><b>Insertion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Insertion</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Insertion</em>' containment reference.
	 * @see #setInsertion(InsertionType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_Insertion()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='insertion' namespace='##targetNamespace'"
	 * @generated
	 */
	InsertionType getInsertion();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getInsertion <em>Insertion</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Insertion</em>' containment reference.
	 * @see #getInsertion()
	 * @generated
	 */
	void setInsertion(InsertionType value);

	/**
	 * Returns the value of the '<em><b>Insertion Cut Off</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Insertion Cut Off</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Insertion Cut Off</em>' containment reference.
	 * @see #setInsertionCutOff(InsertionCutOffType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_InsertionCutOff()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='insertion-cut-off' namespace='##targetNamespace'"
	 * @generated
	 */
	InsertionCutOffType getInsertionCutOff();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getInsertionCutOff <em>Insertion Cut Off</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Insertion Cut Off</em>' containment reference.
	 * @see #getInsertionCutOff()
	 * @generated
	 */
	void setInsertionCutOff(InsertionCutOffType value);

	/**
	 * Returns the value of the '<em><b>Iteration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Iteration</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Iteration</em>' containment reference.
	 * @see #setIteration(IterationType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_Iteration()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='iteration' namespace='##targetNamespace'"
	 * @generated
	 */
	IterationType getIteration();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getIteration <em>Iteration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Iteration</em>' containment reference.
	 * @see #getIteration()
	 * @generated
	 */
	void setIteration(IterationType value);

	/**
	 * Returns the value of the '<em><b>Label Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label Range</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label Range</em>' containment reference.
	 * @see #setLabelRange(LabelRangeType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_LabelRange()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='label-range' namespace='##targetNamespace'"
	 * @generated
	 */
	LabelRangeType getLabelRange();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getLabelRange <em>Label Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label Range</em>' containment reference.
	 * @see #getLabelRange()
	 * @generated
	 */
	void setLabelRange(LabelRangeType value);

	/**
	 * Returns the value of the '<em><b>Label Ranges</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label Ranges</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label Ranges</em>' containment reference.
	 * @see #setLabelRanges(LabelRangesType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_LabelRanges()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='label-ranges' namespace='##targetNamespace'"
	 * @generated
	 */
	LabelRangesType getLabelRanges();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getLabelRanges <em>Label Ranges</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label Ranges</em>' containment reference.
	 * @see #getLabelRanges()
	 * @generated
	 */
	void setLabelRanges(LabelRangesType value);

	/**
	 * Returns the value of the '<em><b>Last Column</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Column</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Column</em>' containment reference.
	 * @see #setLastColumn(LastColumnType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_LastColumn()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='last-column' namespace='##targetNamespace'"
	 * @generated
	 */
	LastColumnType getLastColumn();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getLastColumn <em>Last Column</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Column</em>' containment reference.
	 * @see #getLastColumn()
	 * @generated
	 */
	void setLastColumn(LastColumnType value);

	/**
	 * Returns the value of the '<em><b>Last Row</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Row</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Row</em>' containment reference.
	 * @see #setLastRow(LastRowType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_LastRow()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='last-row' namespace='##targetNamespace'"
	 * @generated
	 */
	LastRowType getLastRow();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getLastRow <em>Last Row</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Row</em>' containment reference.
	 * @see #getLastRow()
	 * @generated
	 */
	void setLastRow(LastRowType value);

	/**
	 * Returns the value of the '<em><b>Movement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Movement</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Movement</em>' containment reference.
	 * @see #setMovement(MovementType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_Movement()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='movement' namespace='##targetNamespace'"
	 * @generated
	 */
	MovementType getMovement();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getMovement <em>Movement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Movement</em>' containment reference.
	 * @see #getMovement()
	 * @generated
	 */
	void setMovement(MovementType value);

	/**
	 * Returns the value of the '<em><b>Movement Cut Off</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Movement Cut Off</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Movement Cut Off</em>' containment reference.
	 * @see #setMovementCutOff(MovementCutOffType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_MovementCutOff()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='movement-cut-off' namespace='##targetNamespace'"
	 * @generated
	 */
	MovementCutOffType getMovementCutOff();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getMovementCutOff <em>Movement Cut Off</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Movement Cut Off</em>' containment reference.
	 * @see #getMovementCutOff()
	 * @generated
	 */
	void setMovementCutOff(MovementCutOffType value);

	/**
	 * Returns the value of the '<em><b>Named Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Named Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Named Expression</em>' containment reference.
	 * @see #setNamedExpression(NamedExpressionType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_NamedExpression()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='named-expression' namespace='##targetNamespace'"
	 * @generated
	 */
	NamedExpressionType getNamedExpression();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getNamedExpression <em>Named Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Named Expression</em>' containment reference.
	 * @see #getNamedExpression()
	 * @generated
	 */
	void setNamedExpression(NamedExpressionType value);

	/**
	 * Returns the value of the '<em><b>Named Expressions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Named Expressions</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Named Expressions</em>' containment reference.
	 * @see #setNamedExpressions(NamedExpressionsType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_NamedExpressions()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='named-expressions' namespace='##targetNamespace'"
	 * @generated
	 */
	NamedExpressionsType getNamedExpressions();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getNamedExpressions <em>Named Expressions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Named Expressions</em>' containment reference.
	 * @see #getNamedExpressions()
	 * @generated
	 */
	void setNamedExpressions(NamedExpressionsType value);

	/**
	 * Returns the value of the '<em><b>Named Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Named Range</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Named Range</em>' containment reference.
	 * @see #setNamedRange(NamedRangeType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_NamedRange()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='named-range' namespace='##targetNamespace'"
	 * @generated
	 */
	NamedRangeType getNamedRange();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getNamedRange <em>Named Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Named Range</em>' containment reference.
	 * @see #getNamedRange()
	 * @generated
	 */
	void setNamedRange(NamedRangeType value);

	/**
	 * Returns the value of the '<em><b>Null Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Null Date</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Null Date</em>' containment reference.
	 * @see #setNullDate(NullDateType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_NullDate()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='null-date' namespace='##targetNamespace'"
	 * @generated
	 */
	NullDateType getNullDate();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getNullDate <em>Null Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Null Date</em>' containment reference.
	 * @see #getNullDate()
	 * @generated
	 */
	void setNullDate(NullDateType value);

	/**
	 * Returns the value of the '<em><b>Odd Columns</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Odd Columns</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Odd Columns</em>' containment reference.
	 * @see #setOddColumns(OddColumnsType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_OddColumns()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='odd-columns' namespace='##targetNamespace'"
	 * @generated
	 */
	OddColumnsType getOddColumns();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getOddColumns <em>Odd Columns</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Odd Columns</em>' containment reference.
	 * @see #getOddColumns()
	 * @generated
	 */
	void setOddColumns(OddColumnsType value);

	/**
	 * Returns the value of the '<em><b>Odd Rows</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Odd Rows</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Odd Rows</em>' containment reference.
	 * @see #setOddRows(OddRowsType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_OddRows()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='odd-rows' namespace='##targetNamespace'"
	 * @generated
	 */
	OddRowsType getOddRows();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getOddRows <em>Odd Rows</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Odd Rows</em>' containment reference.
	 * @see #getOddRows()
	 * @generated
	 */
	void setOddRows(OddRowsType value);

	/**
	 * Returns the value of the '<em><b>Operation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' containment reference.
	 * @see #setOperation(OperationType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_Operation()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='operation' namespace='##targetNamespace'"
	 * @generated
	 */
	OperationType getOperation();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getOperation <em>Operation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation</em>' containment reference.
	 * @see #getOperation()
	 * @generated
	 */
	void setOperation(OperationType value);

	/**
	 * Returns the value of the '<em><b>Previous</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Previous</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Previous</em>' containment reference.
	 * @see #setPrevious(PreviousType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_Previous()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='previous' namespace='##targetNamespace'"
	 * @generated
	 */
	PreviousType getPrevious();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getPrevious <em>Previous</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Previous</em>' containment reference.
	 * @see #getPrevious()
	 * @generated
	 */
	void setPrevious(PreviousType value);

	/**
	 * Returns the value of the '<em><b>Scenario</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scenario</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scenario</em>' containment reference.
	 * @see #setScenario(ScenarioType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_Scenario()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='scenario' namespace='##targetNamespace'"
	 * @generated
	 */
	ScenarioType getScenario();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getScenario <em>Scenario</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scenario</em>' containment reference.
	 * @see #getScenario()
	 * @generated
	 */
	void setScenario(ScenarioType value);

	/**
	 * Returns the value of the '<em><b>Shapes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shapes</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shapes</em>' containment reference.
	 * @see #setShapes(ShapesType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_Shapes()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='shapes' namespace='##targetNamespace'"
	 * @generated
	 */
	ShapesType getShapes();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getShapes <em>Shapes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shapes</em>' containment reference.
	 * @see #getShapes()
	 * @generated
	 */
	void setShapes(ShapesType value);

	/**
	 * Returns the value of the '<em><b>Sort</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sort</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sort</em>' containment reference.
	 * @see #setSort(SortType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_Sort()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='sort' namespace='##targetNamespace'"
	 * @generated
	 */
	SortType getSort();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getSort <em>Sort</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sort</em>' containment reference.
	 * @see #getSort()
	 * @generated
	 */
	void setSort(SortType value);

	/**
	 * Returns the value of the '<em><b>Sort By</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sort By</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sort By</em>' containment reference.
	 * @see #setSortBy(SortByType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_SortBy()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='sort-by' namespace='##targetNamespace'"
	 * @generated
	 */
	SortByType getSortBy();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getSortBy <em>Sort By</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sort By</em>' containment reference.
	 * @see #getSortBy()
	 * @generated
	 */
	void setSortBy(SortByType value);

	/**
	 * Returns the value of the '<em><b>Sort Groups</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sort Groups</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sort Groups</em>' containment reference.
	 * @see #setSortGroups(SortGroupsType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_SortGroups()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='sort-groups' namespace='##targetNamespace'"
	 * @generated
	 */
	SortGroupsType getSortGroups();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getSortGroups <em>Sort Groups</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sort Groups</em>' containment reference.
	 * @see #getSortGroups()
	 * @generated
	 */
	void setSortGroups(SortGroupsType value);

	/**
	 * Returns the value of the '<em><b>Source Cell Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Cell Range</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Cell Range</em>' containment reference.
	 * @see #setSourceCellRange(SourceCellRangeType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_SourceCellRange()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='source-cell-range' namespace='##targetNamespace'"
	 * @generated
	 */
	SourceCellRangeType getSourceCellRange();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getSourceCellRange <em>Source Cell Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Cell Range</em>' containment reference.
	 * @see #getSourceCellRange()
	 * @generated
	 */
	void setSourceCellRange(SourceCellRangeType value);

	/**
	 * Returns the value of the '<em><b>Source Range Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Range Address</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Range Address</em>' containment reference.
	 * @see #setSourceRangeAddress(SourceRangeAddressType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_SourceRangeAddress()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='source-range-address' namespace='##targetNamespace'"
	 * @generated
	 */
	SourceRangeAddressType getSourceRangeAddress();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getSourceRangeAddress <em>Source Range Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Range Address</em>' containment reference.
	 * @see #getSourceRangeAddress()
	 * @generated
	 */
	void setSourceRangeAddress(SourceRangeAddressType value);

	/**
	 * Returns the value of the '<em><b>Source Service</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Service</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Service</em>' containment reference.
	 * @see #setSourceService(SourceServiceType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_SourceService()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='source-service' namespace='##targetNamespace'"
	 * @generated
	 */
	SourceServiceType getSourceService();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getSourceService <em>Source Service</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Service</em>' containment reference.
	 * @see #getSourceService()
	 * @generated
	 */
	void setSourceService(SourceServiceType value);

	/**
	 * Returns the value of the '<em><b>Subtotal Field</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subtotal Field</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subtotal Field</em>' containment reference.
	 * @see #setSubtotalField(SubtotalFieldType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_SubtotalField()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='subtotal-field' namespace='##targetNamespace'"
	 * @generated
	 */
	SubtotalFieldType getSubtotalField();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getSubtotalField <em>Subtotal Field</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subtotal Field</em>' containment reference.
	 * @see #getSubtotalField()
	 * @generated
	 */
	void setSubtotalField(SubtotalFieldType value);

	/**
	 * Returns the value of the '<em><b>Subtotal Rule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subtotal Rule</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subtotal Rule</em>' containment reference.
	 * @see #setSubtotalRule(SubtotalRuleType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_SubtotalRule()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='subtotal-rule' namespace='##targetNamespace'"
	 * @generated
	 */
	SubtotalRuleType getSubtotalRule();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getSubtotalRule <em>Subtotal Rule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subtotal Rule</em>' containment reference.
	 * @see #getSubtotalRule()
	 * @generated
	 */
	void setSubtotalRule(SubtotalRuleType value);

	/**
	 * Returns the value of the '<em><b>Subtotal Rules</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subtotal Rules</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subtotal Rules</em>' containment reference.
	 * @see #setSubtotalRules(SubtotalRulesType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_SubtotalRules()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='subtotal-rules' namespace='##targetNamespace'"
	 * @generated
	 */
	SubtotalRulesType getSubtotalRules();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getSubtotalRules <em>Subtotal Rules</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subtotal Rules</em>' containment reference.
	 * @see #getSubtotalRules()
	 * @generated
	 */
	void setSubtotalRules(SubtotalRulesType value);

	/**
	 * Returns the value of the '<em><b>Table</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table</em>' containment reference.
	 * @see #setTable(TableType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_Table()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='table' namespace='##targetNamespace'"
	 * @generated
	 */
	TableType getTable();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getTable <em>Table</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table</em>' containment reference.
	 * @see #getTable()
	 * @generated
	 */
	void setTable(TableType value);

	/**
	 * Returns the value of the '<em><b>Table Cell</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table Cell</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table Cell</em>' containment reference.
	 * @see #setTableCell(TableCellType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_TableCell()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='table-cell' namespace='##targetNamespace'"
	 * @generated
	 */
	TableCellType getTableCell();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getTableCell <em>Table Cell</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table Cell</em>' containment reference.
	 * @see #getTableCell()
	 * @generated
	 */
	void setTableCell(TableCellType value);

	/**
	 * Returns the value of the '<em><b>Table Column</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table Column</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table Column</em>' containment reference.
	 * @see #setTableColumn(TableColumnType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_TableColumn()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='table-column' namespace='##targetNamespace'"
	 * @generated
	 */
	TableColumnType getTableColumn();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getTableColumn <em>Table Column</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table Column</em>' containment reference.
	 * @see #getTableColumn()
	 * @generated
	 */
	void setTableColumn(TableColumnType value);

	/**
	 * Returns the value of the '<em><b>Table Column Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table Column Group</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table Column Group</em>' containment reference.
	 * @see #setTableColumnGroup(TableColumnGroupType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_TableColumnGroup()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='table-column-group' namespace='##targetNamespace'"
	 * @generated
	 */
	TableColumnGroupType getTableColumnGroup();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getTableColumnGroup <em>Table Column Group</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table Column Group</em>' containment reference.
	 * @see #getTableColumnGroup()
	 * @generated
	 */
	void setTableColumnGroup(TableColumnGroupType value);

	/**
	 * Returns the value of the '<em><b>Table Columns</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table Columns</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table Columns</em>' containment reference.
	 * @see #setTableColumns(TableColumnsType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_TableColumns()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='table-columns' namespace='##targetNamespace'"
	 * @generated
	 */
	TableColumnsType getTableColumns();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getTableColumns <em>Table Columns</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table Columns</em>' containment reference.
	 * @see #getTableColumns()
	 * @generated
	 */
	void setTableColumns(TableColumnsType value);

	/**
	 * Returns the value of the '<em><b>Table Header Columns</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table Header Columns</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table Header Columns</em>' containment reference.
	 * @see #setTableHeaderColumns(TableHeaderColumnsType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_TableHeaderColumns()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='table-header-columns' namespace='##targetNamespace'"
	 * @generated
	 */
	TableHeaderColumnsType getTableHeaderColumns();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getTableHeaderColumns <em>Table Header Columns</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table Header Columns</em>' containment reference.
	 * @see #getTableHeaderColumns()
	 * @generated
	 */
	void setTableHeaderColumns(TableHeaderColumnsType value);

	/**
	 * Returns the value of the '<em><b>Table Header Rows</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table Header Rows</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table Header Rows</em>' containment reference.
	 * @see #setTableHeaderRows(TableHeaderRowsType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_TableHeaderRows()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='table-header-rows' namespace='##targetNamespace'"
	 * @generated
	 */
	TableHeaderRowsType getTableHeaderRows();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getTableHeaderRows <em>Table Header Rows</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table Header Rows</em>' containment reference.
	 * @see #getTableHeaderRows()
	 * @generated
	 */
	void setTableHeaderRows(TableHeaderRowsType value);

	/**
	 * Returns the value of the '<em><b>Table Row</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table Row</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table Row</em>' containment reference.
	 * @see #setTableRow(TableRowType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_TableRow()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='table-row' namespace='##targetNamespace'"
	 * @generated
	 */
	TableRowType getTableRow();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getTableRow <em>Table Row</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table Row</em>' containment reference.
	 * @see #getTableRow()
	 * @generated
	 */
	void setTableRow(TableRowType value);

	/**
	 * Returns the value of the '<em><b>Table Row Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table Row Group</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table Row Group</em>' containment reference.
	 * @see #setTableRowGroup(TableRowGroupType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_TableRowGroup()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='table-row-group' namespace='##targetNamespace'"
	 * @generated
	 */
	TableRowGroupType getTableRowGroup();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getTableRowGroup <em>Table Row Group</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table Row Group</em>' containment reference.
	 * @see #getTableRowGroup()
	 * @generated
	 */
	void setTableRowGroup(TableRowGroupType value);

	/**
	 * Returns the value of the '<em><b>Table Rows</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table Rows</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table Rows</em>' containment reference.
	 * @see #setTableRows(TableRowsType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_TableRows()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='table-rows' namespace='##targetNamespace'"
	 * @generated
	 */
	TableRowsType getTableRows();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getTableRows <em>Table Rows</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table Rows</em>' containment reference.
	 * @see #getTableRows()
	 * @generated
	 */
	void setTableRows(TableRowsType value);

	/**
	 * Returns the value of the '<em><b>Table Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table Source</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table Source</em>' containment reference.
	 * @see #setTableSource(TableSourceType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_TableSource()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='table-source' namespace='##targetNamespace'"
	 * @generated
	 */
	TableSourceType getTableSource();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getTableSource <em>Table Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table Source</em>' containment reference.
	 * @see #getTableSource()
	 * @generated
	 */
	void setTableSource(TableSourceType value);

	/**
	 * Returns the value of the '<em><b>Table Template</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table Template</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table Template</em>' containment reference.
	 * @see #setTableTemplate(TableTemplateType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_TableTemplate()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='table-template' namespace='##targetNamespace'"
	 * @generated
	 */
	TableTemplateType getTableTemplate();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getTableTemplate <em>Table Template</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table Template</em>' containment reference.
	 * @see #getTableTemplate()
	 * @generated
	 */
	void setTableTemplate(TableTemplateType value);

	/**
	 * Returns the value of the '<em><b>Target Range Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Range Address</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Range Address</em>' containment reference.
	 * @see #setTargetRangeAddress(TargetRangeAddressType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_TargetRangeAddress()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='target-range-address' namespace='##targetNamespace'"
	 * @generated
	 */
	TargetRangeAddressType getTargetRangeAddress();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getTargetRangeAddress <em>Target Range Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Range Address</em>' containment reference.
	 * @see #getTargetRangeAddress()
	 * @generated
	 */
	void setTargetRangeAddress(TargetRangeAddressType value);

	/**
	 * Returns the value of the '<em><b>Tracked Changes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tracked Changes</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tracked Changes</em>' containment reference.
	 * @see #setTrackedChanges(TrackedChangesType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_TrackedChanges()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='tracked-changes' namespace='##targetNamespace'"
	 * @generated
	 */
	TrackedChangesType getTrackedChanges();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getTrackedChanges <em>Tracked Changes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tracked Changes</em>' containment reference.
	 * @see #getTrackedChanges()
	 * @generated
	 */
	void setTrackedChanges(TrackedChangesType value);

	/**
	 * Returns the value of the '<em><b>Acceptance State</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.table.AcceptanceStateType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Acceptance State</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Acceptance State</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.AcceptanceStateType
	 * @see #isSetAcceptanceState()
	 * @see #unsetAcceptanceState()
	 * @see #setAcceptanceState(AcceptanceStateType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_AcceptanceState()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='acceptance-state' namespace='##targetNamespace'"
	 * @generated
	 */
	AcceptanceStateType getAcceptanceState();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getAcceptanceState <em>Acceptance State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Acceptance State</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.AcceptanceStateType
	 * @see #isSetAcceptanceState()
	 * @see #unsetAcceptanceState()
	 * @see #getAcceptanceState()
	 * @generated
	 */
	void setAcceptanceState(AcceptanceStateType value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getAcceptanceState <em>Acceptance State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAcceptanceState()
	 * @see #getAcceptanceState()
	 * @see #setAcceptanceState(AcceptanceStateType)
	 * @generated
	 */
	void unsetAcceptanceState();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getAcceptanceState <em>Acceptance State</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Acceptance State</em>' attribute is set.
	 * @see #unsetAcceptanceState()
	 * @see #getAcceptanceState()
	 * @see #setAcceptanceState(AcceptanceStateType)
	 * @generated
	 */
	boolean isSetAcceptanceState();

	/**
	 * Returns the value of the '<em><b>Add Empty Lines</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Add Empty Lines</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Add Empty Lines</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetAddEmptyLines()
	 * @see #unsetAddEmptyLines()
	 * @see #setAddEmptyLines(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_AddEmptyLines()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='add-empty-lines' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getAddEmptyLines();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getAddEmptyLines <em>Add Empty Lines</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Add Empty Lines</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetAddEmptyLines()
	 * @see #unsetAddEmptyLines()
	 * @see #getAddEmptyLines()
	 * @generated
	 */
	void setAddEmptyLines(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getAddEmptyLines <em>Add Empty Lines</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAddEmptyLines()
	 * @see #getAddEmptyLines()
	 * @see #setAddEmptyLines(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetAddEmptyLines();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getAddEmptyLines <em>Add Empty Lines</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Add Empty Lines</em>' attribute is set.
	 * @see #unsetAddEmptyLines()
	 * @see #getAddEmptyLines()
	 * @see #setAddEmptyLines(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetAddEmptyLines();

	/**
	 * Returns the value of the '<em><b>Algorithm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Algorithm</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Algorithm</em>' attribute.
	 * @see #setAlgorithm(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_Algorithm()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='algorithm' namespace='##targetNamespace'"
	 * @generated
	 */
	String getAlgorithm();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getAlgorithm <em>Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Algorithm</em>' attribute.
	 * @see #getAlgorithm()
	 * @generated
	 */
	void setAlgorithm(String value);

	/**
	 * Returns the value of the '<em><b>Align</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.table.AlignType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Align</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Align</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.AlignType
	 * @see #isSetAlign()
	 * @see #unsetAlign()
	 * @see #setAlign(AlignType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_Align()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='align' namespace='##targetNamespace'"
	 * @generated
	 */
	AlignType getAlign();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getAlign <em>Align</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Align</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.AlignType
	 * @see #isSetAlign()
	 * @see #unsetAlign()
	 * @see #getAlign()
	 * @generated
	 */
	void setAlign(AlignType value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getAlign <em>Align</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAlign()
	 * @see #getAlign()
	 * @see #setAlign(AlignType)
	 * @generated
	 */
	void unsetAlign();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getAlign <em>Align</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Align</em>' attribute is set.
	 * @see #unsetAlign()
	 * @see #getAlign()
	 * @see #setAlign(AlignType)
	 * @generated
	 */
	boolean isSetAlign();

	/**
	 * Returns the value of the '<em><b>Allow Empty Cell</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allow Empty Cell</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allow Empty Cell</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetAllowEmptyCell()
	 * @see #unsetAllowEmptyCell()
	 * @see #setAllowEmptyCell(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_AllowEmptyCell()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='allow-empty-cell' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getAllowEmptyCell();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getAllowEmptyCell <em>Allow Empty Cell</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allow Empty Cell</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetAllowEmptyCell()
	 * @see #unsetAllowEmptyCell()
	 * @see #getAllowEmptyCell()
	 * @generated
	 */
	void setAllowEmptyCell(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getAllowEmptyCell <em>Allow Empty Cell</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAllowEmptyCell()
	 * @see #getAllowEmptyCell()
	 * @see #setAllowEmptyCell(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetAllowEmptyCell();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getAllowEmptyCell <em>Allow Empty Cell</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Allow Empty Cell</em>' attribute is set.
	 * @see #unsetAllowEmptyCell()
	 * @see #getAllowEmptyCell()
	 * @see #setAllowEmptyCell(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetAllowEmptyCell();

	/**
	 * Returns the value of the '<em><b>Application Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Application Data</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Application Data</em>' attribute.
	 * @see #setApplicationData(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_ApplicationData()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='application-data' namespace='##targetNamespace'"
	 * @generated
	 */
	String getApplicationData();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getApplicationData <em>Application Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Application Data</em>' attribute.
	 * @see #getApplicationData()
	 * @generated
	 */
	void setApplicationData(String value);

	/**
	 * Returns the value of the '<em><b>Automatic Find Labels</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Automatic Find Labels</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Automatic Find Labels</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetAutomaticFindLabels()
	 * @see #unsetAutomaticFindLabels()
	 * @see #setAutomaticFindLabels(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_AutomaticFindLabels()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='automatic-find-labels' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getAutomaticFindLabels();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getAutomaticFindLabels <em>Automatic Find Labels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Automatic Find Labels</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetAutomaticFindLabels()
	 * @see #unsetAutomaticFindLabels()
	 * @see #getAutomaticFindLabels()
	 * @generated
	 */
	void setAutomaticFindLabels(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getAutomaticFindLabels <em>Automatic Find Labels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAutomaticFindLabels()
	 * @see #getAutomaticFindLabels()
	 * @see #setAutomaticFindLabels(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetAutomaticFindLabels();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getAutomaticFindLabels <em>Automatic Find Labels</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Automatic Find Labels</em>' attribute is set.
	 * @see #unsetAutomaticFindLabels()
	 * @see #getAutomaticFindLabels()
	 * @see #setAutomaticFindLabels(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetAutomaticFindLabels();

	/**
	 * Returns the value of the '<em><b>Base Cell Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Cell Address</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Cell Address</em>' attribute.
	 * @see #setBaseCellAddress(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_BaseCellAddress()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.CellAddress"
	 *        extendedMetaData="kind='attribute' name='base-cell-address' namespace='##targetNamespace'"
	 * @generated
	 */
	String getBaseCellAddress();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getBaseCellAddress <em>Base Cell Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Cell Address</em>' attribute.
	 * @see #getBaseCellAddress()
	 * @generated
	 */
	void setBaseCellAddress(String value);

	/**
	 * Returns the value of the '<em><b>Bind Styles To Content</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bind Styles To Content</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bind Styles To Content</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetBindStylesToContent()
	 * @see #unsetBindStylesToContent()
	 * @see #setBindStylesToContent(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_BindStylesToContent()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='bind-styles-to-content' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getBindStylesToContent();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getBindStylesToContent <em>Bind Styles To Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bind Styles To Content</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetBindStylesToContent()
	 * @see #unsetBindStylesToContent()
	 * @see #getBindStylesToContent()
	 * @generated
	 */
	void setBindStylesToContent(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getBindStylesToContent <em>Bind Styles To Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBindStylesToContent()
	 * @see #getBindStylesToContent()
	 * @see #setBindStylesToContent(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetBindStylesToContent();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getBindStylesToContent <em>Bind Styles To Content</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Bind Styles To Content</em>' attribute is set.
	 * @see #unsetBindStylesToContent()
	 * @see #getBindStylesToContent()
	 * @see #setBindStylesToContent(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetBindStylesToContent();

	/**
	 * Returns the value of the '<em><b>Border Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Border Color</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Border Color</em>' attribute.
	 * @see #setBorderColor(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_BorderColor()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Color"
	 *        extendedMetaData="kind='attribute' name='border-color' namespace='##targetNamespace'"
	 * @generated
	 */
	String getBorderColor();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getBorderColor <em>Border Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Border Color</em>' attribute.
	 * @see #getBorderColor()
	 * @generated
	 */
	void setBorderColor(String value);

	/**
	 * Returns the value of the '<em><b>Border Model</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.table.BorderModelType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Border Model</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Border Model</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.BorderModelType
	 * @see #isSetBorderModel()
	 * @see #unsetBorderModel()
	 * @see #setBorderModel(BorderModelType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_BorderModel()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='border-model' namespace='##targetNamespace'"
	 * @generated
	 */
	BorderModelType getBorderModel();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getBorderModel <em>Border Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Border Model</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.BorderModelType
	 * @see #isSetBorderModel()
	 * @see #unsetBorderModel()
	 * @see #getBorderModel()
	 * @generated
	 */
	void setBorderModel(BorderModelType value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getBorderModel <em>Border Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBorderModel()
	 * @see #getBorderModel()
	 * @see #setBorderModel(BorderModelType)
	 * @generated
	 */
	void unsetBorderModel();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getBorderModel <em>Border Model</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Border Model</em>' attribute is set.
	 * @see #unsetBorderModel()
	 * @see #getBorderModel()
	 * @see #setBorderModel(BorderModelType)
	 * @generated
	 */
	boolean isSetBorderModel();

	/**
	 * Returns the value of the '<em><b>Buttons</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Buttons</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Buttons</em>' attribute.
	 * @see #setButtons(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_Buttons()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.CellRangeAddressList"
	 *        extendedMetaData="kind='attribute' name='buttons' namespace='##targetNamespace'"
	 * @generated
	 */
	String getButtons();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getButtons <em>Buttons</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Buttons</em>' attribute.
	 * @see #getButtons()
	 * @generated
	 */
	void setButtons(String value);

	/**
	 * Returns the value of the '<em><b>Cell Address1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cell Address1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cell Address1</em>' attribute.
	 * @see #setCellAddress1(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_CellAddress1()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.CellAddress"
	 *        extendedMetaData="kind='attribute' name='cell-address' namespace='##targetNamespace'"
	 * @generated
	 */
	String getCellAddress1();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getCellAddress1 <em>Cell Address1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cell Address1</em>' attribute.
	 * @see #getCellAddress1()
	 * @generated
	 */
	void setCellAddress1(String value);

	/**
	 * Returns the value of the '<em><b>Cell Range</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cell Range</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cell Range</em>' attribute.
	 * @see #setCellRange(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_CellRange()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.CellAddress"
	 *        extendedMetaData="kind='attribute' name='cell-range' namespace='##targetNamespace'"
	 * @generated
	 */
	String getCellRange();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getCellRange <em>Cell Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cell Range</em>' attribute.
	 * @see #getCellRange()
	 * @generated
	 */
	void setCellRange(String value);

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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_CellRangeAddress()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.CellRangeAddress"
	 *        extendedMetaData="kind='attribute' name='cell-range-address' namespace='##targetNamespace'"
	 * @generated
	 */
	String getCellRangeAddress();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getCellRangeAddress <em>Cell Range Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cell Range Address</em>' attribute.
	 * @see #getCellRangeAddress()
	 * @generated
	 */
	void setCellRangeAddress(String value);

	/**
	 * Returns the value of the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Column</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Column</em>' attribute.
	 * @see #setColumn(BigInteger)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_Column()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Integer"
	 *        extendedMetaData="kind='attribute' name='column' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getColumn();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getColumn <em>Column</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Column</em>' attribute.
	 * @see #getColumn()
	 * @generated
	 */
	void setColumn(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comment</em>' attribute.
	 * @see #setComment(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_Comment()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='comment' namespace='##targetNamespace'"
	 * @generated
	 */
	String getComment();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getComment <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment</em>' attribute.
	 * @see #getComment()
	 * @generated
	 */
	void setComment(String value);

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' attribute.
	 * @see #setCondition(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_Condition()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='condition' namespace='##targetNamespace'"
	 * @generated
	 */
	String getCondition();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getCondition <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' attribute.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(String value);

	/**
	 * Returns the value of the '<em><b>Condition Source</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.table.ConditionSourceType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition Source</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition Source</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.ConditionSourceType
	 * @see #isSetConditionSource()
	 * @see #unsetConditionSource()
	 * @see #setConditionSource(ConditionSourceType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_ConditionSource()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='condition-source' namespace='##targetNamespace'"
	 * @generated
	 */
	ConditionSourceType getConditionSource();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getConditionSource <em>Condition Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition Source</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.ConditionSourceType
	 * @see #isSetConditionSource()
	 * @see #unsetConditionSource()
	 * @see #getConditionSource()
	 * @generated
	 */
	void setConditionSource(ConditionSourceType value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getConditionSource <em>Condition Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetConditionSource()
	 * @see #getConditionSource()
	 * @see #setConditionSource(ConditionSourceType)
	 * @generated
	 */
	void unsetConditionSource();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getConditionSource <em>Condition Source</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Condition Source</em>' attribute is set.
	 * @see #unsetConditionSource()
	 * @see #getConditionSource()
	 * @see #setConditionSource(ConditionSourceType)
	 * @generated
	 */
	boolean isSetConditionSource();

	/**
	 * Returns the value of the '<em><b>Condition Source Range Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition Source Range Address</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition Source Range Address</em>' attribute.
	 * @see #setConditionSourceRangeAddress(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_ConditionSourceRangeAddress()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.CellRangeAddress"
	 *        extendedMetaData="kind='attribute' name='condition-source-range-address' namespace='##targetNamespace'"
	 * @generated
	 */
	String getConditionSourceRangeAddress();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getConditionSourceRangeAddress <em>Condition Source Range Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition Source Range Address</em>' attribute.
	 * @see #getConditionSourceRangeAddress()
	 * @generated
	 */
	void setConditionSourceRangeAddress(String value);

	/**
	 * Returns the value of the '<em><b>Contains Error</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contains Error</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains Error</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetContainsError()
	 * @see #unsetContainsError()
	 * @see #setContainsError(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_ContainsError()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='contains-error' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getContainsError();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getContainsError <em>Contains Error</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contains Error</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetContainsError()
	 * @see #unsetContainsError()
	 * @see #getContainsError()
	 * @generated
	 */
	void setContainsError(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getContainsError <em>Contains Error</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetContainsError()
	 * @see #getContainsError()
	 * @see #setContainsError(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetContainsError();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getContainsError <em>Contains Error</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Contains Error</em>' attribute is set.
	 * @see #unsetContainsError()
	 * @see #getContainsError()
	 * @see #setContainsError(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetContainsError();

	/**
	 * Returns the value of the '<em><b>Contains Header</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contains Header</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains Header</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetContainsHeader()
	 * @see #unsetContainsHeader()
	 * @see #setContainsHeader(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_ContainsHeader()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='contains-header' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getContainsHeader();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getContainsHeader <em>Contains Header</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contains Header</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetContainsHeader()
	 * @see #unsetContainsHeader()
	 * @see #getContainsHeader()
	 * @generated
	 */
	void setContainsHeader(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getContainsHeader <em>Contains Header</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetContainsHeader()
	 * @see #getContainsHeader()
	 * @see #setContainsHeader(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetContainsHeader();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getContainsHeader <em>Contains Header</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Contains Header</em>' attribute is set.
	 * @see #unsetContainsHeader()
	 * @see #getContainsHeader()
	 * @see #setContainsHeader(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetContainsHeader();

	/**
	 * Returns the value of the '<em><b>Content Validation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content Validation Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Validation Name</em>' attribute.
	 * @see #setContentValidationName(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_ContentValidationName()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='content-validation-name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getContentValidationName();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getContentValidationName <em>Content Validation Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content Validation Name</em>' attribute.
	 * @see #getContentValidationName()
	 * @generated
	 */
	void setContentValidationName(String value);

	/**
	 * Returns the value of the '<em><b>Copy Back</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Copy Back</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Copy Back</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetCopyBack()
	 * @see #unsetCopyBack()
	 * @see #setCopyBack(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_CopyBack()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='copy-back' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getCopyBack();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getCopyBack <em>Copy Back</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Copy Back</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetCopyBack()
	 * @see #unsetCopyBack()
	 * @see #getCopyBack()
	 * @generated
	 */
	void setCopyBack(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getCopyBack <em>Copy Back</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCopyBack()
	 * @see #getCopyBack()
	 * @see #setCopyBack(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetCopyBack();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getCopyBack <em>Copy Back</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Copy Back</em>' attribute is set.
	 * @see #unsetCopyBack()
	 * @see #getCopyBack()
	 * @see #setCopyBack(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetCopyBack();

	/**
	 * Returns the value of the '<em><b>Copy Formulas</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Copy Formulas</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Copy Formulas</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetCopyFormulas()
	 * @see #unsetCopyFormulas()
	 * @see #setCopyFormulas(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_CopyFormulas()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='copy-formulas' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getCopyFormulas();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getCopyFormulas <em>Copy Formulas</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Copy Formulas</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetCopyFormulas()
	 * @see #unsetCopyFormulas()
	 * @see #getCopyFormulas()
	 * @generated
	 */
	void setCopyFormulas(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getCopyFormulas <em>Copy Formulas</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCopyFormulas()
	 * @see #getCopyFormulas()
	 * @see #setCopyFormulas(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetCopyFormulas();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getCopyFormulas <em>Copy Formulas</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Copy Formulas</em>' attribute is set.
	 * @see #unsetCopyFormulas()
	 * @see #getCopyFormulas()
	 * @see #setCopyFormulas(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetCopyFormulas();

	/**
	 * Returns the value of the '<em><b>Copy Styles</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Copy Styles</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Copy Styles</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetCopyStyles()
	 * @see #unsetCopyStyles()
	 * @see #setCopyStyles(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_CopyStyles()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='copy-styles' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getCopyStyles();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getCopyStyles <em>Copy Styles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Copy Styles</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetCopyStyles()
	 * @see #unsetCopyStyles()
	 * @see #getCopyStyles()
	 * @generated
	 */
	void setCopyStyles(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getCopyStyles <em>Copy Styles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCopyStyles()
	 * @see #getCopyStyles()
	 * @see #setCopyStyles(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetCopyStyles();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getCopyStyles <em>Copy Styles</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Copy Styles</em>' attribute is set.
	 * @see #unsetCopyStyles()
	 * @see #getCopyStyles()
	 * @see #setCopyStyles(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetCopyStyles();

	/**
	 * Returns the value of the '<em><b>Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Count</em>' attribute.
	 * @see #setCount(BigInteger)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_Count()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.PositiveInteger"
	 *        extendedMetaData="kind='attribute' name='count' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getCount();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getCount <em>Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Count</em>' attribute.
	 * @see #getCount()
	 * @generated
	 */
	void setCount(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Country</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Country</em>' attribute.
	 * @see #setCountry(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_Country()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.CountryCode"
	 *        extendedMetaData="kind='attribute' name='country' namespace='##targetNamespace'"
	 * @generated
	 */
	String getCountry();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getCountry <em>Country</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Country</em>' attribute.
	 * @see #getCountry()
	 * @generated
	 */
	void setCountry(String value);

	/**
	 * Returns the value of the '<em><b>Database Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Database Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Database Name</em>' attribute.
	 * @see #setDatabaseName(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_DatabaseName()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='database-name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDatabaseName();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getDatabaseName <em>Database Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Database Name</em>' attribute.
	 * @see #getDatabaseName()
	 * @generated
	 */
	void setDatabaseName(String value);

	/**
	 * Returns the value of the '<em><b>Database Table Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Database Table Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Database Table Name</em>' attribute.
	 * @see #setDatabaseTableName(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_DatabaseTableName()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='database-table-name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDatabaseTableName();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getDatabaseTableName <em>Database Table Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Database Table Name</em>' attribute.
	 * @see #getDatabaseTableName()
	 * @generated
	 */
	void setDatabaseTableName(String value);

	/**
	 * Returns the value of the '<em><b>Data Cell Range Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Cell Range Address</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Cell Range Address</em>' attribute.
	 * @see #setDataCellRangeAddress(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_DataCellRangeAddress()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.CellRangeAddress"
	 *        extendedMetaData="kind='attribute' name='data-cell-range-address' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDataCellRangeAddress();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getDataCellRangeAddress <em>Data Cell Range Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Cell Range Address</em>' attribute.
	 * @see #getDataCellRangeAddress()
	 * @generated
	 */
	void setDataCellRangeAddress(String value);

	/**
	 * Returns the value of the '<em><b>Data Field</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Field</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Field</em>' attribute.
	 * @see #setDataField(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_DataField()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='data-field' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDataField();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getDataField <em>Data Field</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Field</em>' attribute.
	 * @see #getDataField()
	 * @generated
	 */
	void setDataField(String value);

	/**
	 * Returns the value of the '<em><b>Date End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date End</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date End</em>' attribute.
	 * @see #setDateEnd(Object)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_DateEnd()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.table.DateEndType"
	 *        extendedMetaData="kind='attribute' name='date-end' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getDateEnd();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getDateEnd <em>Date End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date End</em>' attribute.
	 * @see #getDateEnd()
	 * @generated
	 */
	void setDateEnd(Object value);

	/**
	 * Returns the value of the '<em><b>Date Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Start</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Start</em>' attribute.
	 * @see #setDateStart(Object)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_DateStart()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.table.DateStartType"
	 *        extendedMetaData="kind='attribute' name='date-start' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getDateStart();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getDateStart <em>Date Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Start</em>' attribute.
	 * @see #getDateStart()
	 * @generated
	 */
	void setDateStart(Object value);

	/**
	 * Returns the value of the '<em><b>Default Cell Style Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Cell Style Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Cell Style Name</em>' attribute.
	 * @see #setDefaultCellStyleName(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_DefaultCellStyleName()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.table.DefaultCellStyleNameType"
	 *        extendedMetaData="kind='attribute' name='default-cell-style-name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDefaultCellStyleName();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getDefaultCellStyleName <em>Default Cell Style Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Cell Style Name</em>' attribute.
	 * @see #getDefaultCellStyleName()
	 * @generated
	 */
	void setDefaultCellStyleName(String value);

	/**
	 * Returns the value of the '<em><b>Direction</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.table.DirectionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Direction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direction</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DirectionType
	 * @see #isSetDirection()
	 * @see #unsetDirection()
	 * @see #setDirection(DirectionType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_Direction()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='direction' namespace='##targetNamespace'"
	 * @generated
	 */
	DirectionType getDirection();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DirectionType
	 * @see #isSetDirection()
	 * @see #unsetDirection()
	 * @see #getDirection()
	 * @generated
	 */
	void setDirection(DirectionType value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDirection()
	 * @see #getDirection()
	 * @see #setDirection(DirectionType)
	 * @generated
	 */
	void unsetDirection();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getDirection <em>Direction</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Direction</em>' attribute is set.
	 * @see #unsetDirection()
	 * @see #getDirection()
	 * @see #setDirection(DirectionType)
	 * @generated
	 */
	boolean isSetDirection();

	/**
	 * Returns the value of the '<em><b>Display</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Display</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Display</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetDisplay()
	 * @see #unsetDisplay()
	 * @see #setDisplay(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_Display()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='display' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getDisplay();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getDisplay <em>Display</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Display</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetDisplay()
	 * @see #unsetDisplay()
	 * @see #getDisplay()
	 * @generated
	 */
	void setDisplay(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getDisplay <em>Display</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDisplay()
	 * @see #getDisplay()
	 * @see #setDisplay(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetDisplay();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getDisplay <em>Display</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Display</em>' attribute is set.
	 * @see #unsetDisplay()
	 * @see #getDisplay()
	 * @see #setDisplay(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetDisplay();

	/**
	 * Returns the value of the '<em><b>Display Border</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Display Border</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Display Border</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetDisplayBorder()
	 * @see #unsetDisplayBorder()
	 * @see #setDisplayBorder(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_DisplayBorder()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='display-border' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getDisplayBorder();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getDisplayBorder <em>Display Border</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Display Border</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetDisplayBorder()
	 * @see #unsetDisplayBorder()
	 * @see #getDisplayBorder()
	 * @generated
	 */
	void setDisplayBorder(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getDisplayBorder <em>Display Border</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDisplayBorder()
	 * @see #getDisplayBorder()
	 * @see #setDisplayBorder(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetDisplayBorder();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getDisplayBorder <em>Display Border</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Display Border</em>' attribute is set.
	 * @see #unsetDisplayBorder()
	 * @see #getDisplayBorder()
	 * @see #setDisplayBorder(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetDisplayBorder();

	/**
	 * Returns the value of the '<em><b>Display Duplicates</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Display Duplicates</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Display Duplicates</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetDisplayDuplicates()
	 * @see #unsetDisplayDuplicates()
	 * @see #setDisplayDuplicates(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_DisplayDuplicates()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='display-duplicates' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getDisplayDuplicates();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getDisplayDuplicates <em>Display Duplicates</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Display Duplicates</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetDisplayDuplicates()
	 * @see #unsetDisplayDuplicates()
	 * @see #getDisplayDuplicates()
	 * @generated
	 */
	void setDisplayDuplicates(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getDisplayDuplicates <em>Display Duplicates</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDisplayDuplicates()
	 * @see #getDisplayDuplicates()
	 * @see #setDisplayDuplicates(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetDisplayDuplicates();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getDisplayDuplicates <em>Display Duplicates</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Display Duplicates</em>' attribute is set.
	 * @see #unsetDisplayDuplicates()
	 * @see #getDisplayDuplicates()
	 * @see #setDisplayDuplicates(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetDisplayDuplicates();

	/**
	 * Returns the value of the '<em><b>Display Filter Buttons</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Display Filter Buttons</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Display Filter Buttons</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetDisplayFilterButtons()
	 * @see #unsetDisplayFilterButtons()
	 * @see #setDisplayFilterButtons(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_DisplayFilterButtons()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='display-filter-buttons' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getDisplayFilterButtons();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getDisplayFilterButtons <em>Display Filter Buttons</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Display Filter Buttons</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetDisplayFilterButtons()
	 * @see #unsetDisplayFilterButtons()
	 * @see #getDisplayFilterButtons()
	 * @generated
	 */
	void setDisplayFilterButtons(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getDisplayFilterButtons <em>Display Filter Buttons</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDisplayFilterButtons()
	 * @see #getDisplayFilterButtons()
	 * @see #setDisplayFilterButtons(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetDisplayFilterButtons();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getDisplayFilterButtons <em>Display Filter Buttons</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Display Filter Buttons</em>' attribute is set.
	 * @see #unsetDisplayFilterButtons()
	 * @see #getDisplayFilterButtons()
	 * @see #setDisplayFilterButtons(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetDisplayFilterButtons();

	/**
	 * Returns the value of the '<em><b>Display List</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.table.DisplayListType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Display List</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Display List</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DisplayListType
	 * @see #isSetDisplayList()
	 * @see #unsetDisplayList()
	 * @see #setDisplayList(DisplayListType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_DisplayList()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='display-list' namespace='##targetNamespace'"
	 * @generated
	 */
	DisplayListType getDisplayList();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getDisplayList <em>Display List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Display List</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DisplayListType
	 * @see #isSetDisplayList()
	 * @see #unsetDisplayList()
	 * @see #getDisplayList()
	 * @generated
	 */
	void setDisplayList(DisplayListType value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getDisplayList <em>Display List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDisplayList()
	 * @see #getDisplayList()
	 * @see #setDisplayList(DisplayListType)
	 * @generated
	 */
	void unsetDisplayList();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getDisplayList <em>Display List</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Display List</em>' attribute is set.
	 * @see #unsetDisplayList()
	 * @see #getDisplayList()
	 * @see #setDisplayList(DisplayListType)
	 * @generated
	 */
	boolean isSetDisplayList();

	/**
	 * Returns the value of the '<em><b>Display Member Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.table.DisplayMemberModeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Display Member Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Display Member Mode</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DisplayMemberModeType
	 * @see #isSetDisplayMemberMode()
	 * @see #unsetDisplayMemberMode()
	 * @see #setDisplayMemberMode(DisplayMemberModeType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_DisplayMemberMode()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='display-member-mode' namespace='##targetNamespace'"
	 * @generated
	 */
	DisplayMemberModeType getDisplayMemberMode();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getDisplayMemberMode <em>Display Member Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Display Member Mode</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DisplayMemberModeType
	 * @see #isSetDisplayMemberMode()
	 * @see #unsetDisplayMemberMode()
	 * @see #getDisplayMemberMode()
	 * @generated
	 */
	void setDisplayMemberMode(DisplayMemberModeType value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getDisplayMemberMode <em>Display Member Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDisplayMemberMode()
	 * @see #getDisplayMemberMode()
	 * @see #setDisplayMemberMode(DisplayMemberModeType)
	 * @generated
	 */
	void unsetDisplayMemberMode();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getDisplayMemberMode <em>Display Member Mode</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Display Member Mode</em>' attribute is set.
	 * @see #unsetDisplayMemberMode()
	 * @see #getDisplayMemberMode()
	 * @see #setDisplayMemberMode(DisplayMemberModeType)
	 * @generated
	 */
	boolean isSetDisplayMemberMode();

	/**
	 * Returns the value of the '<em><b>Drill Down On Double Click</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Drill Down On Double Click</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Drill Down On Double Click</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetDrillDownOnDoubleClick()
	 * @see #unsetDrillDownOnDoubleClick()
	 * @see #setDrillDownOnDoubleClick(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_DrillDownOnDoubleClick()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='drill-down-on-double-click' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getDrillDownOnDoubleClick();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getDrillDownOnDoubleClick <em>Drill Down On Double Click</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Drill Down On Double Click</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetDrillDownOnDoubleClick()
	 * @see #unsetDrillDownOnDoubleClick()
	 * @see #getDrillDownOnDoubleClick()
	 * @generated
	 */
	void setDrillDownOnDoubleClick(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getDrillDownOnDoubleClick <em>Drill Down On Double Click</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDrillDownOnDoubleClick()
	 * @see #getDrillDownOnDoubleClick()
	 * @see #setDrillDownOnDoubleClick(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetDrillDownOnDoubleClick();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getDrillDownOnDoubleClick <em>Drill Down On Double Click</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Drill Down On Double Click</em>' attribute is set.
	 * @see #unsetDrillDownOnDoubleClick()
	 * @see #getDrillDownOnDoubleClick()
	 * @see #setDrillDownOnDoubleClick(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetDrillDownOnDoubleClick();

	/**
	 * Returns the value of the '<em><b>Enabled</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enabled</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enabled</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetEnabled()
	 * @see #unsetEnabled()
	 * @see #setEnabled(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_Enabled()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='enabled' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getEnabled();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getEnabled <em>Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enabled</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetEnabled()
	 * @see #unsetEnabled()
	 * @see #getEnabled()
	 * @generated
	 */
	void setEnabled(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getEnabled <em>Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEnabled()
	 * @see #getEnabled()
	 * @see #setEnabled(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetEnabled();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getEnabled <em>Enabled</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Enabled</em>' attribute is set.
	 * @see #unsetEnabled()
	 * @see #getEnabled()
	 * @see #setEnabled(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetEnabled();

	/**
	 * Returns the value of the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End</em>' attribute.
	 * @see #setEnd(Object)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_End()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.table.EndType"
	 *        extendedMetaData="kind='attribute' name='end' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getEnd();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getEnd <em>End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End</em>' attribute.
	 * @see #getEnd()
	 * @generated
	 */
	void setEnd(Object value);

	/**
	 * Returns the value of the '<em><b>End Cell Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Cell Address</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Cell Address</em>' attribute.
	 * @see #setEndCellAddress(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_EndCellAddress()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.CellAddress"
	 *        extendedMetaData="kind='attribute' name='end-cell-address' namespace='##targetNamespace'"
	 * @generated
	 */
	String getEndCellAddress();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getEndCellAddress <em>End Cell Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Cell Address</em>' attribute.
	 * @see #getEndCellAddress()
	 * @generated
	 */
	void setEndCellAddress(String value);

	/**
	 * Returns the value of the '<em><b>End Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Column</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Column</em>' attribute.
	 * @see #setEndColumn(BigInteger)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_EndColumn()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Integer"
	 *        extendedMetaData="kind='attribute' name='end-column' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getEndColumn();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getEndColumn <em>End Column</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Column</em>' attribute.
	 * @see #getEndColumn()
	 * @generated
	 */
	void setEndColumn(BigInteger value);

	/**
	 * Returns the value of the '<em><b>End Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Position</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Position</em>' attribute.
	 * @see #setEndPosition(BigInteger)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_EndPosition()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Integer"
	 *        extendedMetaData="kind='attribute' name='end-position' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getEndPosition();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getEndPosition <em>End Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Position</em>' attribute.
	 * @see #getEndPosition()
	 * @generated
	 */
	void setEndPosition(BigInteger value);

	/**
	 * Returns the value of the '<em><b>End Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Row</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Row</em>' attribute.
	 * @see #setEndRow(BigInteger)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_EndRow()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Integer"
	 *        extendedMetaData="kind='attribute' name='end-row' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getEndRow();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getEndRow <em>End Row</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Row</em>' attribute.
	 * @see #getEndRow()
	 * @generated
	 */
	void setEndRow(BigInteger value);

	/**
	 * Returns the value of the '<em><b>End Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Table</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Table</em>' attribute.
	 * @see #setEndTable(BigInteger)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_EndTable()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Integer"
	 *        extendedMetaData="kind='attribute' name='end-table' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getEndTable();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getEndTable <em>End Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Table</em>' attribute.
	 * @see #getEndTable()
	 * @generated
	 */
	void setEndTable(BigInteger value);

	/**
	 * Returns the value of the '<em><b>End X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End X</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End X</em>' attribute.
	 * @see #setEndX(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_EndX()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Coordinate"
	 *        extendedMetaData="kind='attribute' name='end-x' namespace='##targetNamespace'"
	 * @generated
	 */
	String getEndX();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getEndX <em>End X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End X</em>' attribute.
	 * @see #getEndX()
	 * @generated
	 */
	void setEndX(String value);

	/**
	 * Returns the value of the '<em><b>End Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Y</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Y</em>' attribute.
	 * @see #setEndY(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_EndY()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Coordinate"
	 *        extendedMetaData="kind='attribute' name='end-y' namespace='##targetNamespace'"
	 * @generated
	 */
	String getEndY();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getEndY <em>End Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Y</em>' attribute.
	 * @see #getEndY()
	 * @generated
	 */
	void setEndY(String value);

	/**
	 * Returns the value of the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' attribute.
	 * @see #setExpression(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_Expression()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='expression' namespace='##targetNamespace'"
	 * @generated
	 */
	String getExpression();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getExpression <em>Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' attribute.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(String value);

	/**
	 * Returns the value of the '<em><b>Field Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Field Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Field Name</em>' attribute.
	 * @see #setFieldName(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_FieldName()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='field-name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getFieldName();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getFieldName <em>Field Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Field Name</em>' attribute.
	 * @see #getFieldName()
	 * @generated
	 */
	void setFieldName(String value);

	/**
	 * Returns the value of the '<em><b>Field Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Field Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Field Number</em>' attribute.
	 * @see #setFieldNumber(BigInteger)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_FieldNumber()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.NonNegativeInteger"
	 *        extendedMetaData="kind='attribute' name='field-number' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getFieldNumber();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getFieldNumber <em>Field Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Field Number</em>' attribute.
	 * @see #getFieldNumber()
	 * @generated
	 */
	void setFieldNumber(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Filter Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Filter Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filter Name</em>' attribute.
	 * @see #setFilterName(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_FilterName()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='filter-name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getFilterName();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getFilterName <em>Filter Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filter Name</em>' attribute.
	 * @see #getFilterName()
	 * @generated
	 */
	void setFilterName(String value);

	/**
	 * Returns the value of the '<em><b>Filter Options</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Filter Options</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filter Options</em>' attribute.
	 * @see #setFilterOptions(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_FilterOptions()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='filter-options' namespace='##targetNamespace'"
	 * @generated
	 */
	String getFilterOptions();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getFilterOptions <em>Filter Options</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filter Options</em>' attribute.
	 * @see #getFilterOptions()
	 * @generated
	 */
	void setFilterOptions(String value);

	/**
	 * Returns the value of the '<em><b>Formula</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Formula</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Formula</em>' attribute.
	 * @see #setFormula(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_Formula()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='formula' namespace='##targetNamespace'"
	 * @generated
	 */
	String getFormula();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getFormula <em>Formula</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Formula</em>' attribute.
	 * @see #getFormula()
	 * @generated
	 */
	void setFormula(String value);

	/**
	 * Returns the value of the '<em><b>Function</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Function</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function</em>' attribute.
	 * @see #setFunction(Object)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_Function()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.table.FunctionType"
	 *        extendedMetaData="kind='attribute' name='function' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getFunction();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getFunction <em>Function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function</em>' attribute.
	 * @see #getFunction()
	 * @generated
	 */
	void setFunction(Object value);

	/**
	 * Returns the value of the '<em><b>Grand Total</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.table.GrandTotalType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Grand Total</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grand Total</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.GrandTotalType
	 * @see #isSetGrandTotal()
	 * @see #unsetGrandTotal()
	 * @see #setGrandTotal(GrandTotalType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_GrandTotal()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='grand-total' namespace='##targetNamespace'"
	 * @generated
	 */
	GrandTotalType getGrandTotal();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getGrandTotal <em>Grand Total</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grand Total</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.GrandTotalType
	 * @see #isSetGrandTotal()
	 * @see #unsetGrandTotal()
	 * @see #getGrandTotal()
	 * @generated
	 */
	void setGrandTotal(GrandTotalType value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getGrandTotal <em>Grand Total</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetGrandTotal()
	 * @see #getGrandTotal()
	 * @see #setGrandTotal(GrandTotalType)
	 * @generated
	 */
	void unsetGrandTotal();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getGrandTotal <em>Grand Total</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Grand Total</em>' attribute is set.
	 * @see #unsetGrandTotal()
	 * @see #getGrandTotal()
	 * @see #setGrandTotal(GrandTotalType)
	 * @generated
	 */
	boolean isSetGrandTotal();

	/**
	 * Returns the value of the '<em><b>Group By Field Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group By Field Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group By Field Number</em>' attribute.
	 * @see #setGroupByFieldNumber(BigInteger)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_GroupByFieldNumber()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.NonNegativeInteger"
	 *        extendedMetaData="kind='attribute' name='group-by-field-number' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getGroupByFieldNumber();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getGroupByFieldNumber <em>Group By Field Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group By Field Number</em>' attribute.
	 * @see #getGroupByFieldNumber()
	 * @generated
	 */
	void setGroupByFieldNumber(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Grouped By</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.table.GroupedByType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Grouped By</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grouped By</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.GroupedByType
	 * @see #isSetGroupedBy()
	 * @see #unsetGroupedBy()
	 * @see #setGroupedBy(GroupedByType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_GroupedBy()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='grouped-by' namespace='##targetNamespace'"
	 * @generated
	 */
	GroupedByType getGroupedBy();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getGroupedBy <em>Grouped By</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grouped By</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.GroupedByType
	 * @see #isSetGroupedBy()
	 * @see #unsetGroupedBy()
	 * @see #getGroupedBy()
	 * @generated
	 */
	void setGroupedBy(GroupedByType value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getGroupedBy <em>Grouped By</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetGroupedBy()
	 * @see #getGroupedBy()
	 * @see #setGroupedBy(GroupedByType)
	 * @generated
	 */
	void unsetGroupedBy();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getGroupedBy <em>Grouped By</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Grouped By</em>' attribute is set.
	 * @see #unsetGroupedBy()
	 * @see #getGroupedBy()
	 * @see #setGroupedBy(GroupedByType)
	 * @generated
	 */
	boolean isSetGroupedBy();

	/**
	 * Returns the value of the '<em><b>Has Persistent Data</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Persistent Data</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Persistent Data</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetHasPersistentData()
	 * @see #unsetHasPersistentData()
	 * @see #setHasPersistentData(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_HasPersistentData()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='has-persistent-data' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getHasPersistentData();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getHasPersistentData <em>Has Persistent Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Persistent Data</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetHasPersistentData()
	 * @see #unsetHasPersistentData()
	 * @see #getHasPersistentData()
	 * @generated
	 */
	void setHasPersistentData(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getHasPersistentData <em>Has Persistent Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetHasPersistentData()
	 * @see #getHasPersistentData()
	 * @see #setHasPersistentData(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetHasPersistentData();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getHasPersistentData <em>Has Persistent Data</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Has Persistent Data</em>' attribute is set.
	 * @see #unsetHasPersistentData()
	 * @see #getHasPersistentData()
	 * @see #setHasPersistentData(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetHasPersistentData();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_Id()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='id' namespace='##targetNamespace'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Identify Categories</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Identify Categories</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identify Categories</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetIdentifyCategories()
	 * @see #unsetIdentifyCategories()
	 * @see #setIdentifyCategories(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_IdentifyCategories()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='identify-categories' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getIdentifyCategories();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getIdentifyCategories <em>Identify Categories</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identify Categories</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetIdentifyCategories()
	 * @see #unsetIdentifyCategories()
	 * @see #getIdentifyCategories()
	 * @generated
	 */
	void setIdentifyCategories(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getIdentifyCategories <em>Identify Categories</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIdentifyCategories()
	 * @see #getIdentifyCategories()
	 * @see #setIdentifyCategories(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetIdentifyCategories();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getIdentifyCategories <em>Identify Categories</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Identify Categories</em>' attribute is set.
	 * @see #unsetIdentifyCategories()
	 * @see #getIdentifyCategories()
	 * @see #setIdentifyCategories(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetIdentifyCategories();

	/**
	 * Returns the value of the '<em><b>Ignore Empty Rows</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ignore Empty Rows</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ignore Empty Rows</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetIgnoreEmptyRows()
	 * @see #unsetIgnoreEmptyRows()
	 * @see #setIgnoreEmptyRows(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_IgnoreEmptyRows()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='ignore-empty-rows' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getIgnoreEmptyRows();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getIgnoreEmptyRows <em>Ignore Empty Rows</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ignore Empty Rows</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetIgnoreEmptyRows()
	 * @see #unsetIgnoreEmptyRows()
	 * @see #getIgnoreEmptyRows()
	 * @generated
	 */
	void setIgnoreEmptyRows(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getIgnoreEmptyRows <em>Ignore Empty Rows</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIgnoreEmptyRows()
	 * @see #getIgnoreEmptyRows()
	 * @see #setIgnoreEmptyRows(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetIgnoreEmptyRows();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getIgnoreEmptyRows <em>Ignore Empty Rows</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Ignore Empty Rows</em>' attribute is set.
	 * @see #unsetIgnoreEmptyRows()
	 * @see #getIgnoreEmptyRows()
	 * @see #setIgnoreEmptyRows(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetIgnoreEmptyRows();

	/**
	 * Returns the value of the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Index</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Index</em>' attribute.
	 * @see #setIndex(BigInteger)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_Index()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.NonNegativeInteger"
	 *        extendedMetaData="kind='attribute' name='index' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getIndex();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getIndex <em>Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Index</em>' attribute.
	 * @see #getIndex()
	 * @generated
	 */
	void setIndex(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Is Active</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Active</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Active</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetIsActive()
	 * @see #unsetIsActive()
	 * @see #setIsActive(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_IsActive()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='is-active' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getIsActive();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getIsActive <em>Is Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Active</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetIsActive()
	 * @see #unsetIsActive()
	 * @see #getIsActive()
	 * @generated
	 */
	void setIsActive(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getIsActive <em>Is Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsActive()
	 * @see #getIsActive()
	 * @see #setIsActive(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetIsActive();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getIsActive <em>Is Active</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Active</em>' attribute is set.
	 * @see #unsetIsActive()
	 * @see #getIsActive()
	 * @see #setIsActive(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetIsActive();

	/**
	 * Returns the value of the '<em><b>Is Data Layout Field</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Data Layout Field</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Data Layout Field</em>' attribute.
	 * @see #setIsDataLayoutField(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_IsDataLayoutField()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='is-data-layout-field' namespace='##targetNamespace'"
	 * @generated
	 */
	String getIsDataLayoutField();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getIsDataLayoutField <em>Is Data Layout Field</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Data Layout Field</em>' attribute.
	 * @see #getIsDataLayoutField()
	 * @generated
	 */
	void setIsDataLayoutField(String value);

	/**
	 * Returns the value of the '<em><b>Is Selection</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Selection</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Selection</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetIsSelection()
	 * @see #unsetIsSelection()
	 * @see #setIsSelection(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_IsSelection()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='is-selection' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getIsSelection();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getIsSelection <em>Is Selection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Selection</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetIsSelection()
	 * @see #unsetIsSelection()
	 * @see #getIsSelection()
	 * @generated
	 */
	void setIsSelection(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getIsSelection <em>Is Selection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsSelection()
	 * @see #getIsSelection()
	 * @see #setIsSelection(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetIsSelection();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getIsSelection <em>Is Selection</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Selection</em>' attribute is set.
	 * @see #unsetIsSelection()
	 * @see #getIsSelection()
	 * @see #setIsSelection(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetIsSelection();

	/**
	 * Returns the value of the '<em><b>Is Sub Table</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Sub Table</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Sub Table</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetIsSubTable()
	 * @see #unsetIsSubTable()
	 * @see #setIsSubTable(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_IsSubTable()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='is-sub-table' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getIsSubTable();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getIsSubTable <em>Is Sub Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Sub Table</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetIsSubTable()
	 * @see #unsetIsSubTable()
	 * @see #getIsSubTable()
	 * @generated
	 */
	void setIsSubTable(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getIsSubTable <em>Is Sub Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsSubTable()
	 * @see #getIsSubTable()
	 * @see #setIsSubTable(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetIsSubTable();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getIsSubTable <em>Is Sub Table</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Sub Table</em>' attribute is set.
	 * @see #unsetIsSubTable()
	 * @see #getIsSubTable()
	 * @see #setIsSubTable(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetIsSubTable();

	/**
	 * Returns the value of the '<em><b>Label Cell Range Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label Cell Range Address</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label Cell Range Address</em>' attribute.
	 * @see #setLabelCellRangeAddress(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_LabelCellRangeAddress()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.CellRangeAddress"
	 *        extendedMetaData="kind='attribute' name='label-cell-range-address' namespace='##targetNamespace'"
	 * @generated
	 */
	String getLabelCellRangeAddress();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getLabelCellRangeAddress <em>Label Cell Range Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label Cell Range Address</em>' attribute.
	 * @see #getLabelCellRangeAddress()
	 * @generated
	 */
	void setLabelCellRangeAddress(String value);

	/**
	 * Returns the value of the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Language</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Language</em>' attribute.
	 * @see #setLanguage(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_Language()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.LanguageCode"
	 *        extendedMetaData="kind='attribute' name='language' namespace='##targetNamespace'"
	 * @generated
	 */
	String getLanguage();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getLanguage <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language</em>' attribute.
	 * @see #getLanguage()
	 * @generated
	 */
	void setLanguage(String value);

	/**
	 * Returns the value of the '<em><b>Last Column Spanned</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Column Spanned</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Column Spanned</em>' attribute.
	 * @see #setLastColumnSpanned(BigInteger)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_LastColumnSpanned()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.PositiveInteger"
	 *        extendedMetaData="kind='attribute' name='last-column-spanned' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getLastColumnSpanned();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getLastColumnSpanned <em>Last Column Spanned</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Column Spanned</em>' attribute.
	 * @see #getLastColumnSpanned()
	 * @generated
	 */
	void setLastColumnSpanned(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Last Row Spanned</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Row Spanned</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Row Spanned</em>' attribute.
	 * @see #setLastRowSpanned(BigInteger)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_LastRowSpanned()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.PositiveInteger"
	 *        extendedMetaData="kind='attribute' name='last-row-spanned' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getLastRowSpanned();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getLastRowSpanned <em>Last Row Spanned</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Row Spanned</em>' attribute.
	 * @see #getLastRowSpanned()
	 * @generated
	 */
	void setLastRowSpanned(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Layout Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.table.LayoutModeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Layout Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Layout Mode</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.LayoutModeType
	 * @see #isSetLayoutMode()
	 * @see #unsetLayoutMode()
	 * @see #setLayoutMode(LayoutModeType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_LayoutMode()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='layout-mode' namespace='##targetNamespace'"
	 * @generated
	 */
	LayoutModeType getLayoutMode();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getLayoutMode <em>Layout Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Layout Mode</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.LayoutModeType
	 * @see #isSetLayoutMode()
	 * @see #unsetLayoutMode()
	 * @see #getLayoutMode()
	 * @generated
	 */
	void setLayoutMode(LayoutModeType value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getLayoutMode <em>Layout Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLayoutMode()
	 * @see #getLayoutMode()
	 * @see #setLayoutMode(LayoutModeType)
	 * @generated
	 */
	void unsetLayoutMode();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getLayoutMode <em>Layout Mode</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Layout Mode</em>' attribute is set.
	 * @see #unsetLayoutMode()
	 * @see #getLayoutMode()
	 * @see #setLayoutMode(LayoutModeType)
	 * @generated
	 */
	boolean isSetLayoutMode();

	/**
	 * Returns the value of the '<em><b>Link To Source Data</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Link To Source Data</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link To Source Data</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetLinkToSourceData()
	 * @see #unsetLinkToSourceData()
	 * @see #setLinkToSourceData(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_LinkToSourceData()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='link-to-source-data' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getLinkToSourceData();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getLinkToSourceData <em>Link To Source Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Link To Source Data</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetLinkToSourceData()
	 * @see #unsetLinkToSourceData()
	 * @see #getLinkToSourceData()
	 * @generated
	 */
	void setLinkToSourceData(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getLinkToSourceData <em>Link To Source Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLinkToSourceData()
	 * @see #getLinkToSourceData()
	 * @see #setLinkToSourceData(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetLinkToSourceData();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getLinkToSourceData <em>Link To Source Data</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Link To Source Data</em>' attribute is set.
	 * @see #unsetLinkToSourceData()
	 * @see #getLinkToSourceData()
	 * @see #setLinkToSourceData(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetLinkToSourceData();

	/**
	 * Returns the value of the '<em><b>Marked Invalid</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Marked Invalid</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Marked Invalid</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetMarkedInvalid()
	 * @see #unsetMarkedInvalid()
	 * @see #setMarkedInvalid(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_MarkedInvalid()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='marked-invalid' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getMarkedInvalid();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getMarkedInvalid <em>Marked Invalid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Marked Invalid</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetMarkedInvalid()
	 * @see #unsetMarkedInvalid()
	 * @see #getMarkedInvalid()
	 * @generated
	 */
	void setMarkedInvalid(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getMarkedInvalid <em>Marked Invalid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMarkedInvalid()
	 * @see #getMarkedInvalid()
	 * @see #setMarkedInvalid(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetMarkedInvalid();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getMarkedInvalid <em>Marked Invalid</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Marked Invalid</em>' attribute is set.
	 * @see #unsetMarkedInvalid()
	 * @see #getMarkedInvalid()
	 * @see #setMarkedInvalid(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetMarkedInvalid();

	/**
	 * Returns the value of the '<em><b>Matrix Covered</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Matrix Covered</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Matrix Covered</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetMatrixCovered()
	 * @see #unsetMatrixCovered()
	 * @see #setMatrixCovered(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_MatrixCovered()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='matrix-covered' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getMatrixCovered();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getMatrixCovered <em>Matrix Covered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Matrix Covered</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetMatrixCovered()
	 * @see #unsetMatrixCovered()
	 * @see #getMatrixCovered()
	 * @generated
	 */
	void setMatrixCovered(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getMatrixCovered <em>Matrix Covered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMatrixCovered()
	 * @see #getMatrixCovered()
	 * @see #setMatrixCovered(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetMatrixCovered();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getMatrixCovered <em>Matrix Covered</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Matrix Covered</em>' attribute is set.
	 * @see #unsetMatrixCovered()
	 * @see #getMatrixCovered()
	 * @see #setMatrixCovered(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetMatrixCovered();

	/**
	 * Returns the value of the '<em><b>Member Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Member Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Member Count</em>' attribute.
	 * @see #setMemberCount(BigInteger)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_MemberCount()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.NonNegativeInteger"
	 *        extendedMetaData="kind='attribute' name='member-count' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getMemberCount();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getMemberCount <em>Member Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Member Count</em>' attribute.
	 * @see #getMemberCount()
	 * @generated
	 */
	void setMemberCount(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Member Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Member Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Member Name</em>' attribute.
	 * @see #setMemberName(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_MemberName()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='member-name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getMemberName();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getMemberName <em>Member Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Member Name</em>' attribute.
	 * @see #getMemberName()
	 * @generated
	 */
	void setMemberName(String value);

	/**
	 * Returns the value of the '<em><b>Member Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.table.MemberTypeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Member Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Member Type</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.MemberTypeType
	 * @see #isSetMemberType()
	 * @see #unsetMemberType()
	 * @see #setMemberType(MemberTypeType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_MemberType()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='member-type' namespace='##targetNamespace'"
	 * @generated
	 */
	MemberTypeType getMemberType();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getMemberType <em>Member Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Member Type</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.MemberTypeType
	 * @see #isSetMemberType()
	 * @see #unsetMemberType()
	 * @see #getMemberType()
	 * @generated
	 */
	void setMemberType(MemberTypeType value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getMemberType <em>Member Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMemberType()
	 * @see #getMemberType()
	 * @see #setMemberType(MemberTypeType)
	 * @generated
	 */
	void unsetMemberType();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getMemberType <em>Member Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Member Type</em>' attribute is set.
	 * @see #unsetMemberType()
	 * @see #getMemberType()
	 * @see #setMemberType(MemberTypeType)
	 * @generated
	 */
	boolean isSetMemberType();

	/**
	 * Returns the value of the '<em><b>Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.table.ModeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mode</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.ModeType
	 * @see #isSetMode()
	 * @see #unsetMode()
	 * @see #setMode(ModeType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_Mode()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='mode' namespace='##targetNamespace'"
	 * @generated
	 */
	ModeType getMode();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getMode <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mode</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.ModeType
	 * @see #isSetMode()
	 * @see #unsetMode()
	 * @see #getMode()
	 * @generated
	 */
	void setMode(ModeType value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getMode <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMode()
	 * @see #getMode()
	 * @see #setMode(ModeType)
	 * @generated
	 */
	void unsetMode();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getMode <em>Mode</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Mode</em>' attribute is set.
	 * @see #unsetMode()
	 * @see #getMode()
	 * @see #setMode(ModeType)
	 * @generated
	 */
	boolean isSetMode();

	/**
	 * Returns the value of the '<em><b>Multi Deletion Spanned</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multi Deletion Spanned</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multi Deletion Spanned</em>' attribute.
	 * @see #setMultiDeletionSpanned(BigInteger)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_MultiDeletionSpanned()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Integer"
	 *        extendedMetaData="kind='attribute' name='multi-deletion-spanned' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getMultiDeletionSpanned();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getMultiDeletionSpanned <em>Multi Deletion Spanned</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multi Deletion Spanned</em>' attribute.
	 * @see #getMultiDeletionSpanned()
	 * @generated
	 */
	void setMultiDeletionSpanned(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Null Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Null Year</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Null Year</em>' attribute.
	 * @see #setNullYear(BigInteger)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_NullYear()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.PositiveInteger"
	 *        extendedMetaData="kind='attribute' name='null-year' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getNullYear();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getNullYear <em>Null Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Null Year</em>' attribute.
	 * @see #getNullYear()
	 * @generated
	 */
	void setNullYear(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Number Columns Repeated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Columns Repeated</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Columns Repeated</em>' attribute.
	 * @see #setNumberColumnsRepeated(BigInteger)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_NumberColumnsRepeated()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.PositiveInteger"
	 *        extendedMetaData="kind='attribute' name='number-columns-repeated' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getNumberColumnsRepeated();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getNumberColumnsRepeated <em>Number Columns Repeated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Columns Repeated</em>' attribute.
	 * @see #getNumberColumnsRepeated()
	 * @generated
	 */
	void setNumberColumnsRepeated(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Number Columns Spanned</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Columns Spanned</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Columns Spanned</em>' attribute.
	 * @see #setNumberColumnsSpanned(BigInteger)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_NumberColumnsSpanned()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.PositiveInteger"
	 *        extendedMetaData="kind='attribute' name='number-columns-spanned' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getNumberColumnsSpanned();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getNumberColumnsSpanned <em>Number Columns Spanned</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Columns Spanned</em>' attribute.
	 * @see #getNumberColumnsSpanned()
	 * @generated
	 */
	void setNumberColumnsSpanned(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Number Matrix Columns Spanned</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Matrix Columns Spanned</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Matrix Columns Spanned</em>' attribute.
	 * @see #setNumberMatrixColumnsSpanned(BigInteger)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_NumberMatrixColumnsSpanned()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.PositiveInteger"
	 *        extendedMetaData="kind='attribute' name='number-matrix-columns-spanned' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getNumberMatrixColumnsSpanned();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getNumberMatrixColumnsSpanned <em>Number Matrix Columns Spanned</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Matrix Columns Spanned</em>' attribute.
	 * @see #getNumberMatrixColumnsSpanned()
	 * @generated
	 */
	void setNumberMatrixColumnsSpanned(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Number Matrix Rows Spanned</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Matrix Rows Spanned</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Matrix Rows Spanned</em>' attribute.
	 * @see #setNumberMatrixRowsSpanned(BigInteger)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_NumberMatrixRowsSpanned()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.PositiveInteger"
	 *        extendedMetaData="kind='attribute' name='number-matrix-rows-spanned' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getNumberMatrixRowsSpanned();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getNumberMatrixRowsSpanned <em>Number Matrix Rows Spanned</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Matrix Rows Spanned</em>' attribute.
	 * @see #getNumberMatrixRowsSpanned()
	 * @generated
	 */
	void setNumberMatrixRowsSpanned(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Number Rows Repeated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Rows Repeated</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Rows Repeated</em>' attribute.
	 * @see #setNumberRowsRepeated(BigInteger)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_NumberRowsRepeated()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.PositiveInteger"
	 *        extendedMetaData="kind='attribute' name='number-rows-repeated' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getNumberRowsRepeated();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getNumberRowsRepeated <em>Number Rows Repeated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Rows Repeated</em>' attribute.
	 * @see #getNumberRowsRepeated()
	 * @generated
	 */
	void setNumberRowsRepeated(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Number Rows Spanned</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Rows Spanned</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Rows Spanned</em>' attribute.
	 * @see #setNumberRowsSpanned(BigInteger)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_NumberRowsSpanned()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.PositiveInteger"
	 *        extendedMetaData="kind='attribute' name='number-rows-spanned' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getNumberRowsSpanned();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getNumberRowsSpanned <em>Number Rows Spanned</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Rows Spanned</em>' attribute.
	 * @see #getNumberRowsSpanned()
	 * @generated
	 */
	void setNumberRowsSpanned(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Object Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object Name</em>' attribute.
	 * @see #setObjectName(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_ObjectName()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='object-name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getObjectName();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getObjectName <em>Object Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object Name</em>' attribute.
	 * @see #getObjectName()
	 * @generated
	 */
	void setObjectName(String value);

	/**
	 * Returns the value of the '<em><b>On Update Keep Size</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>On Update Keep Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On Update Keep Size</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetOnUpdateKeepSize()
	 * @see #unsetOnUpdateKeepSize()
	 * @see #setOnUpdateKeepSize(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_OnUpdateKeepSize()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='on-update-keep-size' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getOnUpdateKeepSize();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getOnUpdateKeepSize <em>On Update Keep Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On Update Keep Size</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetOnUpdateKeepSize()
	 * @see #unsetOnUpdateKeepSize()
	 * @see #getOnUpdateKeepSize()
	 * @generated
	 */
	void setOnUpdateKeepSize(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getOnUpdateKeepSize <em>On Update Keep Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetOnUpdateKeepSize()
	 * @see #getOnUpdateKeepSize()
	 * @see #setOnUpdateKeepSize(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetOnUpdateKeepSize();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getOnUpdateKeepSize <em>On Update Keep Size</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>On Update Keep Size</em>' attribute is set.
	 * @see #unsetOnUpdateKeepSize()
	 * @see #getOnUpdateKeepSize()
	 * @see #setOnUpdateKeepSize(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetOnUpdateKeepSize();

	/**
	 * Returns the value of the '<em><b>On Update Keep Styles</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>On Update Keep Styles</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On Update Keep Styles</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetOnUpdateKeepStyles()
	 * @see #unsetOnUpdateKeepStyles()
	 * @see #setOnUpdateKeepStyles(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_OnUpdateKeepStyles()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='on-update-keep-styles' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getOnUpdateKeepStyles();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getOnUpdateKeepStyles <em>On Update Keep Styles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On Update Keep Styles</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetOnUpdateKeepStyles()
	 * @see #unsetOnUpdateKeepStyles()
	 * @see #getOnUpdateKeepStyles()
	 * @generated
	 */
	void setOnUpdateKeepStyles(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getOnUpdateKeepStyles <em>On Update Keep Styles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetOnUpdateKeepStyles()
	 * @see #getOnUpdateKeepStyles()
	 * @see #setOnUpdateKeepStyles(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetOnUpdateKeepStyles();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getOnUpdateKeepStyles <em>On Update Keep Styles</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>On Update Keep Styles</em>' attribute is set.
	 * @see #unsetOnUpdateKeepStyles()
	 * @see #getOnUpdateKeepStyles()
	 * @see #setOnUpdateKeepStyles(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetOnUpdateKeepStyles();

	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see #setOperator(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_Operator()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='operator' namespace='##targetNamespace'"
	 * @generated
	 */
	String getOperator();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(String value);

	/**
	 * Returns the value of the '<em><b>Order</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.table.OrderType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Order</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.OrderType
	 * @see #isSetOrder()
	 * @see #unsetOrder()
	 * @see #setOrder(OrderType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_Order()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='order' namespace='##targetNamespace'"
	 * @generated
	 */
	OrderType getOrder();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getOrder <em>Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.OrderType
	 * @see #isSetOrder()
	 * @see #unsetOrder()
	 * @see #getOrder()
	 * @generated
	 */
	void setOrder(OrderType value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getOrder <em>Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetOrder()
	 * @see #getOrder()
	 * @see #setOrder(OrderType)
	 * @generated
	 */
	void unsetOrder();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getOrder <em>Order</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Order</em>' attribute is set.
	 * @see #unsetOrder()
	 * @see #getOrder()
	 * @see #setOrder(OrderType)
	 * @generated
	 */
	boolean isSetOrder();

	/**
	 * Returns the value of the '<em><b>Page Breaks On Group Change</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Page Breaks On Group Change</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Page Breaks On Group Change</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetPageBreaksOnGroupChange()
	 * @see #unsetPageBreaksOnGroupChange()
	 * @see #setPageBreaksOnGroupChange(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_PageBreaksOnGroupChange()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='page-breaks-on-group-change' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getPageBreaksOnGroupChange();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getPageBreaksOnGroupChange <em>Page Breaks On Group Change</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Page Breaks On Group Change</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetPageBreaksOnGroupChange()
	 * @see #unsetPageBreaksOnGroupChange()
	 * @see #getPageBreaksOnGroupChange()
	 * @generated
	 */
	void setPageBreaksOnGroupChange(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getPageBreaksOnGroupChange <em>Page Breaks On Group Change</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPageBreaksOnGroupChange()
	 * @see #getPageBreaksOnGroupChange()
	 * @see #setPageBreaksOnGroupChange(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetPageBreaksOnGroupChange();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getPageBreaksOnGroupChange <em>Page Breaks On Group Change</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Page Breaks On Group Change</em>' attribute is set.
	 * @see #unsetPageBreaksOnGroupChange()
	 * @see #getPageBreaksOnGroupChange()
	 * @see #setPageBreaksOnGroupChange(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetPageBreaksOnGroupChange();

	/**
	 * Returns the value of the '<em><b>Parse Sql Statement</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parse Sql Statement</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parse Sql Statement</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetParseSqlStatement()
	 * @see #unsetParseSqlStatement()
	 * @see #setParseSqlStatement(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_ParseSqlStatement()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='parse-sql-statement' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getParseSqlStatement();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getParseSqlStatement <em>Parse Sql Statement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parse Sql Statement</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetParseSqlStatement()
	 * @see #unsetParseSqlStatement()
	 * @see #getParseSqlStatement()
	 * @generated
	 */
	void setParseSqlStatement(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getParseSqlStatement <em>Parse Sql Statement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetParseSqlStatement()
	 * @see #getParseSqlStatement()
	 * @see #setParseSqlStatement(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetParseSqlStatement();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getParseSqlStatement <em>Parse Sql Statement</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Parse Sql Statement</em>' attribute is set.
	 * @see #unsetParseSqlStatement()
	 * @see #getParseSqlStatement()
	 * @see #setParseSqlStatement(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetParseSqlStatement();

	/**
	 * Returns the value of the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Password</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Password</em>' attribute.
	 * @see #setPassword(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_Password()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='password' namespace='##targetNamespace'"
	 * @generated
	 */
	String getPassword();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getPassword <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Password</em>' attribute.
	 * @see #getPassword()
	 * @generated
	 */
	void setPassword(String value);

	/**
	 * Returns the value of the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Position</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position</em>' attribute.
	 * @see #setPosition(BigInteger)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_Position()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Integer"
	 *        extendedMetaData="kind='attribute' name='position' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getPosition();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getPosition <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' attribute.
	 * @see #getPosition()
	 * @generated
	 */
	void setPosition(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Precision As Shown</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Precision As Shown</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Precision As Shown</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetPrecisionAsShown()
	 * @see #unsetPrecisionAsShown()
	 * @see #setPrecisionAsShown(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_PrecisionAsShown()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='precision-as-shown' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getPrecisionAsShown();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getPrecisionAsShown <em>Precision As Shown</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Precision As Shown</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetPrecisionAsShown()
	 * @see #unsetPrecisionAsShown()
	 * @see #getPrecisionAsShown()
	 * @generated
	 */
	void setPrecisionAsShown(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getPrecisionAsShown <em>Precision As Shown</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPrecisionAsShown()
	 * @see #getPrecisionAsShown()
	 * @see #setPrecisionAsShown(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetPrecisionAsShown();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getPrecisionAsShown <em>Precision As Shown</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Precision As Shown</em>' attribute is set.
	 * @see #unsetPrecisionAsShown()
	 * @see #getPrecisionAsShown()
	 * @see #setPrecisionAsShown(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetPrecisionAsShown();

	/**
	 * Returns the value of the '<em><b>Print</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Print</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Print</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetPrint()
	 * @see #unsetPrint()
	 * @see #setPrint(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_Print()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='print' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getPrint();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getPrint <em>Print</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Print</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetPrint()
	 * @see #unsetPrint()
	 * @see #getPrint()
	 * @generated
	 */
	void setPrint(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getPrint <em>Print</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPrint()
	 * @see #getPrint()
	 * @see #setPrint(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetPrint();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getPrint <em>Print</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Print</em>' attribute is set.
	 * @see #unsetPrint()
	 * @see #getPrint()
	 * @see #setPrint(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetPrint();

	/**
	 * Returns the value of the '<em><b>Print Ranges</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Print Ranges</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Print Ranges</em>' attribute.
	 * @see #setPrintRanges(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_PrintRanges()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.CellRangeAddressList"
	 *        extendedMetaData="kind='attribute' name='print-ranges' namespace='##targetNamespace'"
	 * @generated
	 */
	String getPrintRanges();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getPrintRanges <em>Print Ranges</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Print Ranges</em>' attribute.
	 * @see #getPrintRanges()
	 * @generated
	 */
	void setPrintRanges(String value);

	/**
	 * Returns the value of the '<em><b>Protect</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Protect</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Protect</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetProtect()
	 * @see #unsetProtect()
	 * @see #setProtect(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_Protect()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='protect' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getProtect();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getProtect <em>Protect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protect</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetProtect()
	 * @see #unsetProtect()
	 * @see #getProtect()
	 * @generated
	 */
	void setProtect(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getProtect <em>Protect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetProtect()
	 * @see #getProtect()
	 * @see #setProtect(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetProtect();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getProtect <em>Protect</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Protect</em>' attribute is set.
	 * @see #unsetProtect()
	 * @see #getProtect()
	 * @see #setProtect(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetProtect();

	/**
	 * Returns the value of the '<em><b>Protected</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Protected</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Protected</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetProtected()
	 * @see #unsetProtected()
	 * @see #setProtected(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_Protected()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='protected' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getProtected();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getProtected <em>Protected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protected</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetProtected()
	 * @see #unsetProtected()
	 * @see #getProtected()
	 * @generated
	 */
	void setProtected(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getProtected <em>Protected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetProtected()
	 * @see #getProtected()
	 * @see #setProtected(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetProtected();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getProtected <em>Protected</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Protected</em>' attribute is set.
	 * @see #unsetProtected()
	 * @see #getProtected()
	 * @see #setProtected(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetProtected();

	/**
	 * Returns the value of the '<em><b>Query Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Query Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Query Name</em>' attribute.
	 * @see #setQueryName(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_QueryName()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='query-name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getQueryName();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getQueryName <em>Query Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Query Name</em>' attribute.
	 * @see #getQueryName()
	 * @generated
	 */
	void setQueryName(String value);

	/**
	 * Returns the value of the '<em><b>Range Usable As</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Range Usable As</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Range Usable As</em>' attribute.
	 * @see #setRangeUsableAs(Object)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_RangeUsableAs()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.table.RangeUsableAsType"
	 *        extendedMetaData="kind='attribute' name='range-usable-as' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getRangeUsableAs();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getRangeUsableAs <em>Range Usable As</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Range Usable As</em>' attribute.
	 * @see #getRangeUsableAs()
	 * @generated
	 */
	void setRangeUsableAs(Object value);

	/**
	 * Returns the value of the '<em><b>Rejecting Change Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rejecting Change Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rejecting Change Id</em>' attribute.
	 * @see #setRejectingChangeId(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_RejectingChangeId()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='rejecting-change-id' namespace='##targetNamespace'"
	 * @generated
	 */
	String getRejectingChangeId();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getRejectingChangeId <em>Rejecting Change Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rejecting Change Id</em>' attribute.
	 * @see #getRejectingChangeId()
	 * @generated
	 */
	void setRejectingChangeId(String value);

	/**
	 * Returns the value of the '<em><b>Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Row</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Row</em>' attribute.
	 * @see #setRow(BigInteger)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_Row()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Integer"
	 *        extendedMetaData="kind='attribute' name='row' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getRow();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getRow <em>Row</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Row</em>' attribute.
	 * @see #getRow()
	 * @generated
	 */
	void setRow(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Scenario Ranges</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scenario Ranges</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scenario Ranges</em>' attribute.
	 * @see #setScenarioRanges(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_ScenarioRanges()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.CellRangeAddressList"
	 *        extendedMetaData="kind='attribute' name='scenario-ranges' namespace='##targetNamespace'"
	 * @generated
	 */
	String getScenarioRanges();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getScenarioRanges <em>Scenario Ranges</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scenario Ranges</em>' attribute.
	 * @see #getScenarioRanges()
	 * @generated
	 */
	void setScenarioRanges(String value);

	/**
	 * Returns the value of the '<em><b>Search Criteria Must Apply To Whole Cell</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Search Criteria Must Apply To Whole Cell</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Search Criteria Must Apply To Whole Cell</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetSearchCriteriaMustApplyToWholeCell()
	 * @see #unsetSearchCriteriaMustApplyToWholeCell()
	 * @see #setSearchCriteriaMustApplyToWholeCell(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_SearchCriteriaMustApplyToWholeCell()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='search-criteria-must-apply-to-whole-cell' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getSearchCriteriaMustApplyToWholeCell();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getSearchCriteriaMustApplyToWholeCell <em>Search Criteria Must Apply To Whole Cell</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Search Criteria Must Apply To Whole Cell</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetSearchCriteriaMustApplyToWholeCell()
	 * @see #unsetSearchCriteriaMustApplyToWholeCell()
	 * @see #getSearchCriteriaMustApplyToWholeCell()
	 * @generated
	 */
	void setSearchCriteriaMustApplyToWholeCell(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getSearchCriteriaMustApplyToWholeCell <em>Search Criteria Must Apply To Whole Cell</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSearchCriteriaMustApplyToWholeCell()
	 * @see #getSearchCriteriaMustApplyToWholeCell()
	 * @see #setSearchCriteriaMustApplyToWholeCell(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetSearchCriteriaMustApplyToWholeCell();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getSearchCriteriaMustApplyToWholeCell <em>Search Criteria Must Apply To Whole Cell</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Search Criteria Must Apply To Whole Cell</em>' attribute is set.
	 * @see #unsetSearchCriteriaMustApplyToWholeCell()
	 * @see #getSearchCriteriaMustApplyToWholeCell()
	 * @see #setSearchCriteriaMustApplyToWholeCell(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetSearchCriteriaMustApplyToWholeCell();

	/**
	 * Returns the value of the '<em><b>Selected Page</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selected Page</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selected Page</em>' attribute.
	 * @see #setSelectedPage(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_SelectedPage()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='selected-page' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSelectedPage();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getSelectedPage <em>Selected Page</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selected Page</em>' attribute.
	 * @see #getSelectedPage()
	 * @generated
	 */
	void setSelectedPage(String value);

	/**
	 * Returns the value of the '<em><b>Show Details</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Show Details</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Show Details</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetShowDetails()
	 * @see #unsetShowDetails()
	 * @see #setShowDetails(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_ShowDetails()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='show-details' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getShowDetails();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getShowDetails <em>Show Details</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Show Details</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetShowDetails()
	 * @see #unsetShowDetails()
	 * @see #getShowDetails()
	 * @generated
	 */
	void setShowDetails(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getShowDetails <em>Show Details</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetShowDetails()
	 * @see #getShowDetails()
	 * @see #setShowDetails(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetShowDetails();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getShowDetails <em>Show Details</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Show Details</em>' attribute is set.
	 * @see #unsetShowDetails()
	 * @see #getShowDetails()
	 * @see #setShowDetails(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetShowDetails();

	/**
	 * Returns the value of the '<em><b>Show Empty</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Show Empty</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Show Empty</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetShowEmpty()
	 * @see #unsetShowEmpty()
	 * @see #setShowEmpty(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_ShowEmpty()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='show-empty' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getShowEmpty();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getShowEmpty <em>Show Empty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Show Empty</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetShowEmpty()
	 * @see #unsetShowEmpty()
	 * @see #getShowEmpty()
	 * @generated
	 */
	void setShowEmpty(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getShowEmpty <em>Show Empty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetShowEmpty()
	 * @see #getShowEmpty()
	 * @see #setShowEmpty(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetShowEmpty();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getShowEmpty <em>Show Empty</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Show Empty</em>' attribute is set.
	 * @see #unsetShowEmpty()
	 * @see #getShowEmpty()
	 * @see #setShowEmpty(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetShowEmpty();

	/**
	 * Returns the value of the '<em><b>Show Filter Button</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Show Filter Button</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Show Filter Button</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetShowFilterButton()
	 * @see #unsetShowFilterButton()
	 * @see #setShowFilterButton(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_ShowFilterButton()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='show-filter-button' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getShowFilterButton();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getShowFilterButton <em>Show Filter Button</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Show Filter Button</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetShowFilterButton()
	 * @see #unsetShowFilterButton()
	 * @see #getShowFilterButton()
	 * @generated
	 */
	void setShowFilterButton(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getShowFilterButton <em>Show Filter Button</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetShowFilterButton()
	 * @see #getShowFilterButton()
	 * @see #setShowFilterButton(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetShowFilterButton();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getShowFilterButton <em>Show Filter Button</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Show Filter Button</em>' attribute is set.
	 * @see #unsetShowFilterButton()
	 * @see #getShowFilterButton()
	 * @see #setShowFilterButton(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetShowFilterButton();

	/**
	 * Returns the value of the '<em><b>Sort Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.table.SortModeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sort Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sort Mode</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.SortModeType
	 * @see #isSetSortMode()
	 * @see #unsetSortMode()
	 * @see #setSortMode(SortModeType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_SortMode()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='sort-mode' namespace='##targetNamespace'"
	 * @generated
	 */
	SortModeType getSortMode();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getSortMode <em>Sort Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sort Mode</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.SortModeType
	 * @see #isSetSortMode()
	 * @see #unsetSortMode()
	 * @see #getSortMode()
	 * @generated
	 */
	void setSortMode(SortModeType value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getSortMode <em>Sort Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSortMode()
	 * @see #getSortMode()
	 * @see #setSortMode(SortModeType)
	 * @generated
	 */
	void unsetSortMode();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getSortMode <em>Sort Mode</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Sort Mode</em>' attribute is set.
	 * @see #unsetSortMode()
	 * @see #getSortMode()
	 * @see #setSortMode(SortModeType)
	 * @generated
	 */
	boolean isSetSortMode();

	/**
	 * Returns the value of the '<em><b>Source Cell Range Addresses</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Cell Range Addresses</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Cell Range Addresses</em>' attribute.
	 * @see #setSourceCellRangeAddresses(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_SourceCellRangeAddresses()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.CellRangeAddressList"
	 *        extendedMetaData="kind='attribute' name='source-cell-range-addresses' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSourceCellRangeAddresses();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getSourceCellRangeAddresses <em>Source Cell Range Addresses</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Cell Range Addresses</em>' attribute.
	 * @see #getSourceCellRangeAddresses()
	 * @generated
	 */
	void setSourceCellRangeAddresses(String value);

	/**
	 * Returns the value of the '<em><b>Source Field Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Field Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Field Name</em>' attribute.
	 * @see #setSourceFieldName(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_SourceFieldName()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='source-field-name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSourceFieldName();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getSourceFieldName <em>Source Field Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Field Name</em>' attribute.
	 * @see #getSourceFieldName()
	 * @generated
	 */
	void setSourceFieldName(String value);

	/**
	 * Returns the value of the '<em><b>Source Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Name</em>' attribute.
	 * @see #setSourceName(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_SourceName()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='source-name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSourceName();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getSourceName <em>Source Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Name</em>' attribute.
	 * @see #getSourceName()
	 * @generated
	 */
	void setSourceName(String value);

	/**
	 * Returns the value of the '<em><b>Sql Statement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sql Statement</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sql Statement</em>' attribute.
	 * @see #setSqlStatement(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_SqlStatement()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='sql-statement' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSqlStatement();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getSqlStatement <em>Sql Statement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sql Statement</em>' attribute.
	 * @see #getSqlStatement()
	 * @generated
	 */
	void setSqlStatement(String value);

	/**
	 * Returns the value of the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start</em>' attribute.
	 * @see #setStart(Object)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_Start()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.table.StartType"
	 *        extendedMetaData="kind='attribute' name='start' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getStart();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getStart <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start</em>' attribute.
	 * @see #getStart()
	 * @generated
	 */
	void setStart(Object value);

	/**
	 * Returns the value of the '<em><b>Start Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Column</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Column</em>' attribute.
	 * @see #setStartColumn(BigInteger)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_StartColumn()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Integer"
	 *        extendedMetaData="kind='attribute' name='start-column' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getStartColumn();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getStartColumn <em>Start Column</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Column</em>' attribute.
	 * @see #getStartColumn()
	 * @generated
	 */
	void setStartColumn(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Start Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Position</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Position</em>' attribute.
	 * @see #setStartPosition(BigInteger)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_StartPosition()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Integer"
	 *        extendedMetaData="kind='attribute' name='start-position' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getStartPosition();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getStartPosition <em>Start Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Position</em>' attribute.
	 * @see #getStartPosition()
	 * @generated
	 */
	void setStartPosition(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Start Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Row</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Row</em>' attribute.
	 * @see #setStartRow(BigInteger)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_StartRow()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Integer"
	 *        extendedMetaData="kind='attribute' name='start-row' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getStartRow();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getStartRow <em>Start Row</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Row</em>' attribute.
	 * @see #getStartRow()
	 * @generated
	 */
	void setStartRow(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Start Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Table</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Table</em>' attribute.
	 * @see #setStartTable(BigInteger)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_StartTable()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Integer"
	 *        extendedMetaData="kind='attribute' name='start-table' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getStartTable();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getStartTable <em>Start Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Table</em>' attribute.
	 * @see #getStartTable()
	 * @generated
	 */
	void setStartTable(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Step</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Step</em>' attribute.
	 * @see #isSetStep()
	 * @see #unsetStep()
	 * @see #setStep(double)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_Step()
	 * @model unsettable="true" dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Double"
	 *        extendedMetaData="kind='attribute' name='step' namespace='##targetNamespace'"
	 * @generated
	 */
	double getStep();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getStep <em>Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Step</em>' attribute.
	 * @see #isSetStep()
	 * @see #unsetStep()
	 * @see #getStep()
	 * @generated
	 */
	void setStep(double value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getStep <em>Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStep()
	 * @see #getStep()
	 * @see #setStep(double)
	 * @generated
	 */
	void unsetStep();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getStep <em>Step</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Step</em>' attribute is set.
	 * @see #unsetStep()
	 * @see #getStep()
	 * @see #setStep(double)
	 * @generated
	 */
	boolean isSetStep();

	/**
	 * Returns the value of the '<em><b>Structure Protected</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Structure Protected</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Structure Protected</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetStructureProtected()
	 * @see #unsetStructureProtected()
	 * @see #setStructureProtected(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_StructureProtected()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='structure-protected' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getStructureProtected();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getStructureProtected <em>Structure Protected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Structure Protected</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetStructureProtected()
	 * @see #unsetStructureProtected()
	 * @see #getStructureProtected()
	 * @generated
	 */
	void setStructureProtected(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getStructureProtected <em>Structure Protected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStructureProtected()
	 * @see #getStructureProtected()
	 * @see #setStructureProtected(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetStructureProtected();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getStructureProtected <em>Structure Protected</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Structure Protected</em>' attribute is set.
	 * @see #unsetStructureProtected()
	 * @see #getStructureProtected()
	 * @see #setStructureProtected(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetStructureProtected();

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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_StyleName()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.table.StyleNameType"
	 *        extendedMetaData="kind='attribute' name='style-name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getStyleName();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getStyleName <em>Style Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style Name</em>' attribute.
	 * @see #getStyleName()
	 * @generated
	 */
	void setStyleName(String value);

	/**
	 * Returns the value of the '<em><b>Table1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table1</em>' attribute.
	 * @see #setTable1(BigInteger)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_Table1()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Integer"
	 *        extendedMetaData="kind='attribute' name='table' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getTable1();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getTable1 <em>Table1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table1</em>' attribute.
	 * @see #getTable1()
	 * @generated
	 */
	void setTable1(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Table Background</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table Background</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table Background</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetTableBackground()
	 * @see #unsetTableBackground()
	 * @see #setTableBackground(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_TableBackground()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='table-background' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getTableBackground();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getTableBackground <em>Table Background</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table Background</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetTableBackground()
	 * @see #unsetTableBackground()
	 * @see #getTableBackground()
	 * @generated
	 */
	void setTableBackground(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getTableBackground <em>Table Background</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTableBackground()
	 * @see #getTableBackground()
	 * @see #setTableBackground(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetTableBackground();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getTableBackground <em>Table Background</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Table Background</em>' attribute is set.
	 * @see #unsetTableBackground()
	 * @see #getTableBackground()
	 * @see #setTableBackground(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetTableBackground();

	/**
	 * Returns the value of the '<em><b>Table Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table Name</em>' attribute.
	 * @see #setTableName(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_TableName()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='table-name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getTableName();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getTableName <em>Table Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table Name</em>' attribute.
	 * @see #getTableName()
	 * @generated
	 */
	void setTableName(String value);

	/**
	 * Returns the value of the '<em><b>Target Cell Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Cell Address</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Cell Address</em>' attribute.
	 * @see #setTargetCellAddress(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_TargetCellAddress()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.CellAddress"
	 *        extendedMetaData="kind='attribute' name='target-cell-address' namespace='##targetNamespace'"
	 * @generated
	 */
	String getTargetCellAddress();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getTargetCellAddress <em>Target Cell Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Cell Address</em>' attribute.
	 * @see #getTargetCellAddress()
	 * @generated
	 */
	void setTargetCellAddress(String value);

	/**
	 * Returns the value of the '<em><b>Target Range Address1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Range Address1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Range Address1</em>' attribute.
	 * @see #setTargetRangeAddress1(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_TargetRangeAddress1()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.CellRangeAddress"
	 *        extendedMetaData="kind='attribute' name='target-range-address' namespace='##targetNamespace'"
	 * @generated
	 */
	String getTargetRangeAddress1();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getTargetRangeAddress1 <em>Target Range Address1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Range Address1</em>' attribute.
	 * @see #getTargetRangeAddress1()
	 * @generated
	 */
	void setTargetRangeAddress1(String value);

	/**
	 * Returns the value of the '<em><b>Track Changes</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Track Changes</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Track Changes</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetTrackChanges()
	 * @see #unsetTrackChanges()
	 * @see #setTrackChanges(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_TrackChanges()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='track-changes' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getTrackChanges();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getTrackChanges <em>Track Changes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Track Changes</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetTrackChanges()
	 * @see #unsetTrackChanges()
	 * @see #getTrackChanges()
	 * @generated
	 */
	void setTrackChanges(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getTrackChanges <em>Track Changes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTrackChanges()
	 * @see #getTrackChanges()
	 * @see #setTrackChanges(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetTrackChanges();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getTrackChanges <em>Track Changes</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Track Changes</em>' attribute is set.
	 * @see #unsetTrackChanges()
	 * @see #getTrackChanges()
	 * @see #setTrackChanges(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetTrackChanges();

	/**
	 * Returns the value of the '<em><b>Used Hierarchy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Used Hierarchy</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Used Hierarchy</em>' attribute.
	 * @see #setUsedHierarchy(BigInteger)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_UsedHierarchy()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Integer"
	 *        extendedMetaData="kind='attribute' name='used-hierarchy' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getUsedHierarchy();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getUsedHierarchy <em>Used Hierarchy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Used Hierarchy</em>' attribute.
	 * @see #getUsedHierarchy()
	 * @generated
	 */
	void setUsedHierarchy(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Use Labels</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.table.UseLabelsType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use Labels</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use Labels</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.UseLabelsType
	 * @see #isSetUseLabels()
	 * @see #unsetUseLabels()
	 * @see #setUseLabels(UseLabelsType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_UseLabels()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='use-labels' namespace='##targetNamespace'"
	 * @generated
	 */
	UseLabelsType getUseLabels();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getUseLabels <em>Use Labels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Labels</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.UseLabelsType
	 * @see #isSetUseLabels()
	 * @see #unsetUseLabels()
	 * @see #getUseLabels()
	 * @generated
	 */
	void setUseLabels(UseLabelsType value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getUseLabels <em>Use Labels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUseLabels()
	 * @see #getUseLabels()
	 * @see #setUseLabels(UseLabelsType)
	 * @generated
	 */
	void unsetUseLabels();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getUseLabels <em>Use Labels</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Use Labels</em>' attribute is set.
	 * @see #unsetUseLabels()
	 * @see #getUseLabels()
	 * @see #setUseLabels(UseLabelsType)
	 * @generated
	 */
	boolean isSetUseLabels();

	/**
	 * Returns the value of the '<em><b>Use Regular Expressions</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use Regular Expressions</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use Regular Expressions</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetUseRegularExpressions()
	 * @see #unsetUseRegularExpressions()
	 * @see #setUseRegularExpressions(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_UseRegularExpressions()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='use-regular-expressions' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getUseRegularExpressions();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getUseRegularExpressions <em>Use Regular Expressions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Regular Expressions</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetUseRegularExpressions()
	 * @see #unsetUseRegularExpressions()
	 * @see #getUseRegularExpressions()
	 * @generated
	 */
	void setUseRegularExpressions(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getUseRegularExpressions <em>Use Regular Expressions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUseRegularExpressions()
	 * @see #getUseRegularExpressions()
	 * @see #setUseRegularExpressions(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetUseRegularExpressions();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getUseRegularExpressions <em>Use Regular Expressions</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Use Regular Expressions</em>' attribute is set.
	 * @see #unsetUseRegularExpressions()
	 * @see #getUseRegularExpressions()
	 * @see #setUseRegularExpressions(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetUseRegularExpressions();

	/**
	 * Returns the value of the '<em><b>User Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Name</em>' attribute.
	 * @see #setUserName(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_UserName()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='user-name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUserName();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getUserName <em>User Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Name</em>' attribute.
	 * @see #getUserName()
	 * @generated
	 */
	void setUserName(String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_Value()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='value' namespace='##targetNamespace'"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Visibility</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.TableVisibilityValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Visibility</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visibility</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TableVisibilityValue
	 * @see #isSetVisibility()
	 * @see #unsetVisibility()
	 * @see #setVisibility(TableVisibilityValue)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDocumentRoot_Visibility()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='visibility' namespace='##targetNamespace'"
	 * @generated
	 */
	TableVisibilityValue getVisibility();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getVisibility <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visibility</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TableVisibilityValue
	 * @see #isSetVisibility()
	 * @see #unsetVisibility()
	 * @see #getVisibility()
	 * @generated
	 */
	void setVisibility(TableVisibilityValue value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getVisibility <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVisibility()
	 * @see #getVisibility()
	 * @see #setVisibility(TableVisibilityValue)
	 * @generated
	 */
	void unsetVisibility();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DocumentRoot#getVisibility <em>Visibility</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Visibility</em>' attribute is set.
	 * @see #unsetVisibility()
	 * @see #getVisibility()
	 * @see #setVisibility(TableVisibilityValue)
	 * @generated
	 */
	boolean isSetVisibility();

} // DocumentRoot
