/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.table.impl;

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
import org.oasisopen.names.tc.opendocument.xmlns.table.*;
import org.oasisopen.names.tc.opendocument.xmlns.text.TableVisibilityValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getBody <em>Body</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getCalculationSettings <em>Calculation Settings</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getCellAddress <em>Cell Address</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getCellContentChange <em>Cell Content Change</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getCellContentDeletion <em>Cell Content Deletion</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getCellRangeSource <em>Cell Range Source</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getChangeDeletion <em>Change Deletion</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getChangeTrackTableCell <em>Change Track Table Cell</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getConsolidation <em>Consolidation</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getContentValidation <em>Content Validation</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getContentValidations <em>Content Validations</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getCoveredTableCell <em>Covered Table Cell</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getCutOffs <em>Cut Offs</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getDatabaseRange <em>Database Range</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getDatabaseRanges <em>Database Ranges</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getDatabaseSourceQuery <em>Database Source Query</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getDatabaseSourceSql <em>Database Source Sql</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getDatabaseSourceTable <em>Database Source Table</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getDataPilotDisplayInfo <em>Data Pilot Display Info</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getDataPilotField <em>Data Pilot Field</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getDataPilotFieldReference <em>Data Pilot Field Reference</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getDataPilotGroup <em>Data Pilot Group</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getDataPilotGroupMember <em>Data Pilot Group Member</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getDataPilotGroups <em>Data Pilot Groups</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getDataPilotLayoutInfo <em>Data Pilot Layout Info</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getDataPilotLevel <em>Data Pilot Level</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getDataPilotMember <em>Data Pilot Member</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getDataPilotMembers <em>Data Pilot Members</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getDataPilotSortInfo <em>Data Pilot Sort Info</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getDataPilotSubtotal <em>Data Pilot Subtotal</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getDataPilotSubtotals <em>Data Pilot Subtotals</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getDataPilotTable <em>Data Pilot Table</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getDataPilotTables <em>Data Pilot Tables</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getDdeLink <em>Dde Link</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getDdeLinks <em>Dde Links</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getDeletion <em>Deletion</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getDeletions <em>Deletions</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getDependencies <em>Dependencies</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getDependency <em>Dependency</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getDetective <em>Detective</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getErrorMacro <em>Error Macro</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getErrorMessage <em>Error Message</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getEvenColumns <em>Even Columns</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getEvenRows <em>Even Rows</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getFilter <em>Filter</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getFilterAnd <em>Filter And</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getFilterCondition <em>Filter Condition</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getFilterOr <em>Filter Or</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getFirstColumn <em>First Column</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getFirstRow <em>First Row</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getHelpMessage <em>Help Message</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getHighlightedRange <em>Highlighted Range</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getInsertion <em>Insertion</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getInsertionCutOff <em>Insertion Cut Off</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getIteration <em>Iteration</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getLabelRange <em>Label Range</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getLabelRanges <em>Label Ranges</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getLastColumn <em>Last Column</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getLastRow <em>Last Row</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getMovement <em>Movement</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getMovementCutOff <em>Movement Cut Off</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getNamedExpression <em>Named Expression</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getNamedExpressions <em>Named Expressions</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getNamedRange <em>Named Range</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getNullDate <em>Null Date</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getOddColumns <em>Odd Columns</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getOddRows <em>Odd Rows</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getOperation <em>Operation</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getPrevious <em>Previous</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getScenario <em>Scenario</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getShapes <em>Shapes</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getSort <em>Sort</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getSortBy <em>Sort By</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getSortGroups <em>Sort Groups</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getSourceCellRange <em>Source Cell Range</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getSourceRangeAddress <em>Source Range Address</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getSourceService <em>Source Service</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getSubtotalField <em>Subtotal Field</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getSubtotalRule <em>Subtotal Rule</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getSubtotalRules <em>Subtotal Rules</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getTable <em>Table</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getTableCell <em>Table Cell</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getTableColumn <em>Table Column</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getTableColumnGroup <em>Table Column Group</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getTableColumns <em>Table Columns</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getTableHeaderColumns <em>Table Header Columns</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getTableHeaderRows <em>Table Header Rows</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getTableRow <em>Table Row</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getTableRowGroup <em>Table Row Group</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getTableRows <em>Table Rows</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getTableSource <em>Table Source</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getTableTemplate <em>Table Template</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getTargetRangeAddress <em>Target Range Address</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getTrackedChanges <em>Tracked Changes</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getAcceptanceState <em>Acceptance State</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getAddEmptyLines <em>Add Empty Lines</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getAlgorithm <em>Algorithm</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getAlign <em>Align</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getAllowEmptyCell <em>Allow Empty Cell</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getApplicationData <em>Application Data</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getAutomaticFindLabels <em>Automatic Find Labels</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getBaseCellAddress <em>Base Cell Address</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getBindStylesToContent <em>Bind Styles To Content</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getBorderColor <em>Border Color</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getBorderModel <em>Border Model</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getButtons <em>Buttons</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getCellAddress1 <em>Cell Address1</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getCellRange <em>Cell Range</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getCellRangeAddress <em>Cell Range Address</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getColumn <em>Column</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getConditionSource <em>Condition Source</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getConditionSourceRangeAddress <em>Condition Source Range Address</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getContainsError <em>Contains Error</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getContainsHeader <em>Contains Header</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getContentValidationName <em>Content Validation Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getCopyBack <em>Copy Back</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getCopyFormulas <em>Copy Formulas</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getCopyStyles <em>Copy Styles</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getCount <em>Count</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getCountry <em>Country</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getDatabaseName <em>Database Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getDatabaseTableName <em>Database Table Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getDataCellRangeAddress <em>Data Cell Range Address</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getDataField <em>Data Field</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getDateEnd <em>Date End</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getDateStart <em>Date Start</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getDefaultCellStyleName <em>Default Cell Style Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getDirection <em>Direction</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getDisplay <em>Display</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getDisplayBorder <em>Display Border</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getDisplayDuplicates <em>Display Duplicates</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getDisplayFilterButtons <em>Display Filter Buttons</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getDisplayList <em>Display List</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getDisplayMemberMode <em>Display Member Mode</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getDrillDownOnDoubleClick <em>Drill Down On Double Click</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getEnabled <em>Enabled</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getEnd <em>End</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getEndCellAddress <em>End Cell Address</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getEndColumn <em>End Column</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getEndPosition <em>End Position</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getEndRow <em>End Row</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getEndTable <em>End Table</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getEndX <em>End X</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getEndY <em>End Y</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getFieldName <em>Field Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getFieldNumber <em>Field Number</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getFilterName <em>Filter Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getFilterOptions <em>Filter Options</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getFormula <em>Formula</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getFunction <em>Function</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getGrandTotal <em>Grand Total</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getGroupByFieldNumber <em>Group By Field Number</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getGroupedBy <em>Grouped By</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getHasPersistentData <em>Has Persistent Data</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getIdentifyCategories <em>Identify Categories</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getIgnoreEmptyRows <em>Ignore Empty Rows</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getIndex <em>Index</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getIsActive <em>Is Active</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getIsDataLayoutField <em>Is Data Layout Field</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getIsSelection <em>Is Selection</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getIsSubTable <em>Is Sub Table</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getLabelCellRangeAddress <em>Label Cell Range Address</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getLanguage <em>Language</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getLastColumnSpanned <em>Last Column Spanned</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getLastRowSpanned <em>Last Row Spanned</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getLayoutMode <em>Layout Mode</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getLinkToSourceData <em>Link To Source Data</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getMarkedInvalid <em>Marked Invalid</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getMatrixCovered <em>Matrix Covered</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getMemberCount <em>Member Count</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getMemberName <em>Member Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getMemberType <em>Member Type</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getMode <em>Mode</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getMultiDeletionSpanned <em>Multi Deletion Spanned</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getNullYear <em>Null Year</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getNumberColumnsRepeated <em>Number Columns Repeated</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getNumberColumnsSpanned <em>Number Columns Spanned</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getNumberMatrixColumnsSpanned <em>Number Matrix Columns Spanned</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getNumberMatrixRowsSpanned <em>Number Matrix Rows Spanned</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getNumberRowsRepeated <em>Number Rows Repeated</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getNumberRowsSpanned <em>Number Rows Spanned</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getObjectName <em>Object Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getOnUpdateKeepSize <em>On Update Keep Size</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getOnUpdateKeepStyles <em>On Update Keep Styles</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getOperator <em>Operator</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getOrder <em>Order</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getPageBreaksOnGroupChange <em>Page Breaks On Group Change</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getParseSqlStatement <em>Parse Sql Statement</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getPassword <em>Password</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getPosition <em>Position</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getPrecisionAsShown <em>Precision As Shown</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getPrint <em>Print</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getPrintRanges <em>Print Ranges</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getProtect <em>Protect</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getProtected <em>Protected</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getQueryName <em>Query Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getRangeUsableAs <em>Range Usable As</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getRejectingChangeId <em>Rejecting Change Id</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getRow <em>Row</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getScenarioRanges <em>Scenario Ranges</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getSearchCriteriaMustApplyToWholeCell <em>Search Criteria Must Apply To Whole Cell</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getSelectedPage <em>Selected Page</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getShowDetails <em>Show Details</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getShowEmpty <em>Show Empty</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getShowFilterButton <em>Show Filter Button</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getSortMode <em>Sort Mode</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getSourceCellRangeAddresses <em>Source Cell Range Addresses</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getSourceFieldName <em>Source Field Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getSourceName <em>Source Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getSqlStatement <em>Sql Statement</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getStart <em>Start</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getStartColumn <em>Start Column</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getStartPosition <em>Start Position</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getStartRow <em>Start Row</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getStartTable <em>Start Table</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getStep <em>Step</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getStructureProtected <em>Structure Protected</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getStyleName <em>Style Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getTable1 <em>Table1</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getTableBackground <em>Table Background</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getTableName <em>Table Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getTargetCellAddress <em>Target Cell Address</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getTargetRangeAddress1 <em>Target Range Address1</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getTrackChanges <em>Track Changes</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getUsedHierarchy <em>Used Hierarchy</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getUseLabels <em>Use Labels</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getUseRegularExpressions <em>Use Regular Expressions</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getUserName <em>User Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DocumentRootImpl#getVisibility <em>Visibility</em>}</li>
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
	 * The default value of the '{@link #getAcceptanceState() <em>Acceptance State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAcceptanceState()
	 * @generated
	 * @ordered
	 */
	protected static final AcceptanceStateType ACCEPTANCE_STATE_EDEFAULT = AcceptanceStateType.ACCEPTED;

	/**
	 * The cached value of the '{@link #getAcceptanceState() <em>Acceptance State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAcceptanceState()
	 * @generated
	 * @ordered
	 */
	protected AcceptanceStateType acceptanceState = ACCEPTANCE_STATE_EDEFAULT;

	/**
	 * This is true if the Acceptance State attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean acceptanceStateESet;

	/**
	 * The default value of the '{@link #getAddEmptyLines() <em>Add Empty Lines</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddEmptyLines()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean ADD_EMPTY_LINES_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getAddEmptyLines() <em>Add Empty Lines</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddEmptyLines()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean addEmptyLines = ADD_EMPTY_LINES_EDEFAULT;

	/**
	 * This is true if the Add Empty Lines attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean addEmptyLinesESet;

	/**
	 * The default value of the '{@link #getAlgorithm() <em>Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlgorithm()
	 * @generated
	 * @ordered
	 */
	protected static final String ALGORITHM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAlgorithm() <em>Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlgorithm()
	 * @generated
	 * @ordered
	 */
	protected String algorithm = ALGORITHM_EDEFAULT;

	/**
	 * The default value of the '{@link #getAlign() <em>Align</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlign()
	 * @generated
	 * @ordered
	 */
	protected static final AlignType ALIGN_EDEFAULT = AlignType.LEFT;

	/**
	 * The cached value of the '{@link #getAlign() <em>Align</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlign()
	 * @generated
	 * @ordered
	 */
	protected AlignType align = ALIGN_EDEFAULT;

	/**
	 * This is true if the Align attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean alignESet;

	/**
	 * The default value of the '{@link #getAllowEmptyCell() <em>Allow Empty Cell</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowEmptyCell()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean ALLOW_EMPTY_CELL_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getAllowEmptyCell() <em>Allow Empty Cell</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowEmptyCell()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean allowEmptyCell = ALLOW_EMPTY_CELL_EDEFAULT;

	/**
	 * This is true if the Allow Empty Cell attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean allowEmptyCellESet;

	/**
	 * The default value of the '{@link #getApplicationData() <em>Application Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplicationData()
	 * @generated
	 * @ordered
	 */
	protected static final String APPLICATION_DATA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getApplicationData() <em>Application Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplicationData()
	 * @generated
	 * @ordered
	 */
	protected String applicationData = APPLICATION_DATA_EDEFAULT;

	/**
	 * The default value of the '{@link #getAutomaticFindLabels() <em>Automatic Find Labels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutomaticFindLabels()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean AUTOMATIC_FIND_LABELS_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getAutomaticFindLabels() <em>Automatic Find Labels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutomaticFindLabels()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean automaticFindLabels = AUTOMATIC_FIND_LABELS_EDEFAULT;

	/**
	 * This is true if the Automatic Find Labels attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean automaticFindLabelsESet;

	/**
	 * The default value of the '{@link #getBaseCellAddress() <em>Base Cell Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseCellAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String BASE_CELL_ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBaseCellAddress() <em>Base Cell Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseCellAddress()
	 * @generated
	 * @ordered
	 */
	protected String baseCellAddress = BASE_CELL_ADDRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getBindStylesToContent() <em>Bind Styles To Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBindStylesToContent()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean BIND_STYLES_TO_CONTENT_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getBindStylesToContent() <em>Bind Styles To Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBindStylesToContent()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean bindStylesToContent = BIND_STYLES_TO_CONTENT_EDEFAULT;

	/**
	 * This is true if the Bind Styles To Content attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean bindStylesToContentESet;

	/**
	 * The default value of the '{@link #getBorderColor() <em>Border Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBorderColor()
	 * @generated
	 * @ordered
	 */
	protected static final String BORDER_COLOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBorderColor() <em>Border Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBorderColor()
	 * @generated
	 * @ordered
	 */
	protected String borderColor = BORDER_COLOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getBorderModel() <em>Border Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBorderModel()
	 * @generated
	 * @ordered
	 */
	protected static final BorderModelType BORDER_MODEL_EDEFAULT = BorderModelType.COLLAPSING;

	/**
	 * The cached value of the '{@link #getBorderModel() <em>Border Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBorderModel()
	 * @generated
	 * @ordered
	 */
	protected BorderModelType borderModel = BORDER_MODEL_EDEFAULT;

	/**
	 * This is true if the Border Model attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean borderModelESet;

	/**
	 * The default value of the '{@link #getButtons() <em>Buttons</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getButtons()
	 * @generated
	 * @ordered
	 */
	protected static final String BUTTONS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getButtons() <em>Buttons</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getButtons()
	 * @generated
	 * @ordered
	 */
	protected String buttons = BUTTONS_EDEFAULT;

	/**
	 * The default value of the '{@link #getCellAddress1() <em>Cell Address1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCellAddress1()
	 * @generated
	 * @ordered
	 */
	protected static final String CELL_ADDRESS1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCellAddress1() <em>Cell Address1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCellAddress1()
	 * @generated
	 * @ordered
	 */
	protected String cellAddress1 = CELL_ADDRESS1_EDEFAULT;

	/**
	 * The default value of the '{@link #getCellRange() <em>Cell Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCellRange()
	 * @generated
	 * @ordered
	 */
	protected static final String CELL_RANGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCellRange() <em>Cell Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCellRange()
	 * @generated
	 * @ordered
	 */
	protected String cellRange = CELL_RANGE_EDEFAULT;

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
	 * The default value of the '{@link #getColumn() <em>Column</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumn()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger COLUMN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getColumn() <em>Column</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumn()
	 * @generated
	 * @ordered
	 */
	protected BigInteger column = COLUMN_EDEFAULT;

	/**
	 * The default value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected String comment = COMMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getCondition() <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected static final String CONDITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected String condition = CONDITION_EDEFAULT;

	/**
	 * The default value of the '{@link #getConditionSource() <em>Condition Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditionSource()
	 * @generated
	 * @ordered
	 */
	protected static final ConditionSourceType CONDITION_SOURCE_EDEFAULT = ConditionSourceType.SELF;

	/**
	 * The cached value of the '{@link #getConditionSource() <em>Condition Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditionSource()
	 * @generated
	 * @ordered
	 */
	protected ConditionSourceType conditionSource = CONDITION_SOURCE_EDEFAULT;

	/**
	 * This is true if the Condition Source attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean conditionSourceESet;

	/**
	 * The default value of the '{@link #getConditionSourceRangeAddress() <em>Condition Source Range Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditionSourceRangeAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String CONDITION_SOURCE_RANGE_ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConditionSourceRangeAddress() <em>Condition Source Range Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditionSourceRangeAddress()
	 * @generated
	 * @ordered
	 */
	protected String conditionSourceRangeAddress = CONDITION_SOURCE_RANGE_ADDRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getContainsError() <em>Contains Error</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainsError()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean CONTAINS_ERROR_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getContainsError() <em>Contains Error</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainsError()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean containsError = CONTAINS_ERROR_EDEFAULT;

	/**
	 * This is true if the Contains Error attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean containsErrorESet;

	/**
	 * The default value of the '{@link #getContainsHeader() <em>Contains Header</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainsHeader()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean CONTAINS_HEADER_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getContainsHeader() <em>Contains Header</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainsHeader()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean containsHeader = CONTAINS_HEADER_EDEFAULT;

	/**
	 * This is true if the Contains Header attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean containsHeaderESet;

	/**
	 * The default value of the '{@link #getContentValidationName() <em>Content Validation Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentValidationName()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTENT_VALIDATION_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContentValidationName() <em>Content Validation Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentValidationName()
	 * @generated
	 * @ordered
	 */
	protected String contentValidationName = CONTENT_VALIDATION_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getCopyBack() <em>Copy Back</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCopyBack()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean COPY_BACK_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getCopyBack() <em>Copy Back</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCopyBack()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean copyBack = COPY_BACK_EDEFAULT;

	/**
	 * This is true if the Copy Back attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean copyBackESet;

	/**
	 * The default value of the '{@link #getCopyFormulas() <em>Copy Formulas</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCopyFormulas()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean COPY_FORMULAS_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getCopyFormulas() <em>Copy Formulas</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCopyFormulas()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean copyFormulas = COPY_FORMULAS_EDEFAULT;

	/**
	 * This is true if the Copy Formulas attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean copyFormulasESet;

	/**
	 * The default value of the '{@link #getCopyStyles() <em>Copy Styles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCopyStyles()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean COPY_STYLES_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getCopyStyles() <em>Copy Styles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCopyStyles()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean copyStyles = COPY_STYLES_EDEFAULT;

	/**
	 * This is true if the Copy Styles attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean copyStylesESet;

	/**
	 * The default value of the '{@link #getCount() <em>Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCount()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger COUNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCount() <em>Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCount()
	 * @generated
	 * @ordered
	 */
	protected BigInteger count = COUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getCountry() <em>Country</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountry()
	 * @generated
	 * @ordered
	 */
	protected static final String COUNTRY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCountry() <em>Country</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountry()
	 * @generated
	 * @ordered
	 */
	protected String country = COUNTRY_EDEFAULT;

	/**
	 * The default value of the '{@link #getDatabaseName() <em>Database Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatabaseName()
	 * @generated
	 * @ordered
	 */
	protected static final String DATABASE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDatabaseName() <em>Database Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatabaseName()
	 * @generated
	 * @ordered
	 */
	protected String databaseName = DATABASE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDatabaseTableName() <em>Database Table Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatabaseTableName()
	 * @generated
	 * @ordered
	 */
	protected static final String DATABASE_TABLE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDatabaseTableName() <em>Database Table Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatabaseTableName()
	 * @generated
	 * @ordered
	 */
	protected String databaseTableName = DATABASE_TABLE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDataCellRangeAddress() <em>Data Cell Range Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataCellRangeAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String DATA_CELL_RANGE_ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDataCellRangeAddress() <em>Data Cell Range Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataCellRangeAddress()
	 * @generated
	 * @ordered
	 */
	protected String dataCellRangeAddress = DATA_CELL_RANGE_ADDRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getDataField() <em>Data Field</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataField()
	 * @generated
	 * @ordered
	 */
	protected static final String DATA_FIELD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDataField() <em>Data Field</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataField()
	 * @generated
	 * @ordered
	 */
	protected String dataField = DATA_FIELD_EDEFAULT;

	/**
	 * The default value of the '{@link #getDateEnd() <em>Date End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateEnd()
	 * @generated
	 * @ordered
	 */
	protected static final Object DATE_END_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateEnd() <em>Date End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateEnd()
	 * @generated
	 * @ordered
	 */
	protected Object dateEnd = DATE_END_EDEFAULT;

	/**
	 * The default value of the '{@link #getDateStart() <em>Date Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateStart()
	 * @generated
	 * @ordered
	 */
	protected static final Object DATE_START_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateStart() <em>Date Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateStart()
	 * @generated
	 * @ordered
	 */
	protected Object dateStart = DATE_START_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultCellStyleName() <em>Default Cell Style Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultCellStyleName()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_CELL_STYLE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefaultCellStyleName() <em>Default Cell Style Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultCellStyleName()
	 * @generated
	 * @ordered
	 */
	protected String defaultCellStyleName = DEFAULT_CELL_STYLE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected static final DirectionType DIRECTION_EDEFAULT = DirectionType.FROM_ANOTHER_TABLE;

	/**
	 * The cached value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected DirectionType direction = DIRECTION_EDEFAULT;

	/**
	 * This is true if the Direction attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean directionESet;

	/**
	 * The default value of the '{@link #getDisplay() <em>Display</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplay()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean DISPLAY_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getDisplay() <em>Display</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplay()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean display = DISPLAY_EDEFAULT;

	/**
	 * This is true if the Display attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean displayESet;

	/**
	 * The default value of the '{@link #getDisplayBorder() <em>Display Border</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayBorder()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean DISPLAY_BORDER_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getDisplayBorder() <em>Display Border</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayBorder()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean displayBorder = DISPLAY_BORDER_EDEFAULT;

	/**
	 * This is true if the Display Border attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean displayBorderESet;

	/**
	 * The default value of the '{@link #getDisplayDuplicates() <em>Display Duplicates</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayDuplicates()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean DISPLAY_DUPLICATES_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getDisplayDuplicates() <em>Display Duplicates</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayDuplicates()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean displayDuplicates = DISPLAY_DUPLICATES_EDEFAULT;

	/**
	 * This is true if the Display Duplicates attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean displayDuplicatesESet;

	/**
	 * The default value of the '{@link #getDisplayFilterButtons() <em>Display Filter Buttons</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayFilterButtons()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean DISPLAY_FILTER_BUTTONS_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getDisplayFilterButtons() <em>Display Filter Buttons</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayFilterButtons()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean displayFilterButtons = DISPLAY_FILTER_BUTTONS_EDEFAULT;

	/**
	 * This is true if the Display Filter Buttons attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean displayFilterButtonsESet;

	/**
	 * The default value of the '{@link #getDisplayList() <em>Display List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayList()
	 * @generated
	 * @ordered
	 */
	protected static final DisplayListType DISPLAY_LIST_EDEFAULT = DisplayListType.NONE;

	/**
	 * The cached value of the '{@link #getDisplayList() <em>Display List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayList()
	 * @generated
	 * @ordered
	 */
	protected DisplayListType displayList = DISPLAY_LIST_EDEFAULT;

	/**
	 * This is true if the Display List attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean displayListESet;

	/**
	 * The default value of the '{@link #getDisplayMemberMode() <em>Display Member Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayMemberMode()
	 * @generated
	 * @ordered
	 */
	protected static final DisplayMemberModeType DISPLAY_MEMBER_MODE_EDEFAULT = DisplayMemberModeType.FROM_TOP;

	/**
	 * The cached value of the '{@link #getDisplayMemberMode() <em>Display Member Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayMemberMode()
	 * @generated
	 * @ordered
	 */
	protected DisplayMemberModeType displayMemberMode = DISPLAY_MEMBER_MODE_EDEFAULT;

	/**
	 * This is true if the Display Member Mode attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean displayMemberModeESet;

	/**
	 * The default value of the '{@link #getDrillDownOnDoubleClick() <em>Drill Down On Double Click</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDrillDownOnDoubleClick()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean DRILL_DOWN_ON_DOUBLE_CLICK_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getDrillDownOnDoubleClick() <em>Drill Down On Double Click</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDrillDownOnDoubleClick()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean drillDownOnDoubleClick = DRILL_DOWN_ON_DOUBLE_CLICK_EDEFAULT;

	/**
	 * This is true if the Drill Down On Double Click attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean drillDownOnDoubleClickESet;

	/**
	 * The default value of the '{@link #getEnabled() <em>Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnabled()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean ENABLED_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getEnabled() <em>Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnabled()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean enabled = ENABLED_EDEFAULT;

	/**
	 * This is true if the Enabled attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean enabledESet;

	/**
	 * The default value of the '{@link #getEnd() <em>End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnd()
	 * @generated
	 * @ordered
	 */
	protected static final Object END_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEnd() <em>End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnd()
	 * @generated
	 * @ordered
	 */
	protected Object end = END_EDEFAULT;

	/**
	 * The default value of the '{@link #getEndCellAddress() <em>End Cell Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndCellAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String END_CELL_ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndCellAddress() <em>End Cell Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndCellAddress()
	 * @generated
	 * @ordered
	 */
	protected String endCellAddress = END_CELL_ADDRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getEndColumn() <em>End Column</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndColumn()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger END_COLUMN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndColumn() <em>End Column</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndColumn()
	 * @generated
	 * @ordered
	 */
	protected BigInteger endColumn = END_COLUMN_EDEFAULT;

	/**
	 * The default value of the '{@link #getEndPosition() <em>End Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndPosition()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger END_POSITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndPosition() <em>End Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndPosition()
	 * @generated
	 * @ordered
	 */
	protected BigInteger endPosition = END_POSITION_EDEFAULT;

	/**
	 * The default value of the '{@link #getEndRow() <em>End Row</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndRow()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger END_ROW_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndRow() <em>End Row</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndRow()
	 * @generated
	 * @ordered
	 */
	protected BigInteger endRow = END_ROW_EDEFAULT;

	/**
	 * The default value of the '{@link #getEndTable() <em>End Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndTable()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger END_TABLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndTable() <em>End Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndTable()
	 * @generated
	 * @ordered
	 */
	protected BigInteger endTable = END_TABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEndX() <em>End X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndX()
	 * @generated
	 * @ordered
	 */
	protected static final String END_X_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndX() <em>End X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndX()
	 * @generated
	 * @ordered
	 */
	protected String endX = END_X_EDEFAULT;

	/**
	 * The default value of the '{@link #getEndY() <em>End Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndY()
	 * @generated
	 * @ordered
	 */
	protected static final String END_Y_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndY() <em>End Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndY()
	 * @generated
	 * @ordered
	 */
	protected String endY = END_Y_EDEFAULT;

	/**
	 * The default value of the '{@link #getExpression() <em>Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExpression() <em>Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpression()
	 * @generated
	 * @ordered
	 */
	protected String expression = EXPRESSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getFieldName() <em>Field Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFieldName()
	 * @generated
	 * @ordered
	 */
	protected static final String FIELD_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFieldName() <em>Field Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFieldName()
	 * @generated
	 * @ordered
	 */
	protected String fieldName = FIELD_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getFieldNumber() <em>Field Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFieldNumber()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger FIELD_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFieldNumber() <em>Field Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFieldNumber()
	 * @generated
	 * @ordered
	 */
	protected BigInteger fieldNumber = FIELD_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getFilterName() <em>Filter Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilterName()
	 * @generated
	 * @ordered
	 */
	protected static final String FILTER_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFilterName() <em>Filter Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilterName()
	 * @generated
	 * @ordered
	 */
	protected String filterName = FILTER_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getFilterOptions() <em>Filter Options</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilterOptions()
	 * @generated
	 * @ordered
	 */
	protected static final String FILTER_OPTIONS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFilterOptions() <em>Filter Options</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilterOptions()
	 * @generated
	 * @ordered
	 */
	protected String filterOptions = FILTER_OPTIONS_EDEFAULT;

	/**
	 * The default value of the '{@link #getFormula() <em>Formula</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormula()
	 * @generated
	 * @ordered
	 */
	protected static final String FORMULA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFormula() <em>Formula</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormula()
	 * @generated
	 * @ordered
	 */
	protected String formula = FORMULA_EDEFAULT;

	/**
	 * The default value of the '{@link #getFunction() <em>Function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunction()
	 * @generated
	 * @ordered
	 */
	protected static final Object FUNCTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFunction() <em>Function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunction()
	 * @generated
	 * @ordered
	 */
	protected Object function = FUNCTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getGrandTotal() <em>Grand Total</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGrandTotal()
	 * @generated
	 * @ordered
	 */
	protected static final GrandTotalType GRAND_TOTAL_EDEFAULT = GrandTotalType.NONE;

	/**
	 * The cached value of the '{@link #getGrandTotal() <em>Grand Total</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGrandTotal()
	 * @generated
	 * @ordered
	 */
	protected GrandTotalType grandTotal = GRAND_TOTAL_EDEFAULT;

	/**
	 * This is true if the Grand Total attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean grandTotalESet;

	/**
	 * The default value of the '{@link #getGroupByFieldNumber() <em>Group By Field Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupByFieldNumber()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger GROUP_BY_FIELD_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGroupByFieldNumber() <em>Group By Field Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupByFieldNumber()
	 * @generated
	 * @ordered
	 */
	protected BigInteger groupByFieldNumber = GROUP_BY_FIELD_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getGroupedBy() <em>Grouped By</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupedBy()
	 * @generated
	 * @ordered
	 */
	protected static final GroupedByType GROUPED_BY_EDEFAULT = GroupedByType.SECONDS;

	/**
	 * The cached value of the '{@link #getGroupedBy() <em>Grouped By</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupedBy()
	 * @generated
	 * @ordered
	 */
	protected GroupedByType groupedBy = GROUPED_BY_EDEFAULT;

	/**
	 * This is true if the Grouped By attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean groupedByESet;

	/**
	 * The default value of the '{@link #getHasPersistentData() <em>Has Persistent Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasPersistentData()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean HAS_PERSISTENT_DATA_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getHasPersistentData() <em>Has Persistent Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasPersistentData()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean hasPersistentData = HAS_PERSISTENT_DATA_EDEFAULT;

	/**
	 * This is true if the Has Persistent Data attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean hasPersistentDataESet;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getIdentifyCategories() <em>Identify Categories</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifyCategories()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean IDENTIFY_CATEGORIES_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getIdentifyCategories() <em>Identify Categories</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifyCategories()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean identifyCategories = IDENTIFY_CATEGORIES_EDEFAULT;

	/**
	 * This is true if the Identify Categories attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean identifyCategoriesESet;

	/**
	 * The default value of the '{@link #getIgnoreEmptyRows() <em>Ignore Empty Rows</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIgnoreEmptyRows()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean IGNORE_EMPTY_ROWS_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getIgnoreEmptyRows() <em>Ignore Empty Rows</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIgnoreEmptyRows()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean ignoreEmptyRows = IGNORE_EMPTY_ROWS_EDEFAULT;

	/**
	 * This is true if the Ignore Empty Rows attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean ignoreEmptyRowsESet;

	/**
	 * The default value of the '{@link #getIndex() <em>Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndex()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger INDEX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIndex() <em>Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndex()
	 * @generated
	 * @ordered
	 */
	protected BigInteger index = INDEX_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsActive() <em>Is Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsActive()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean IS_ACTIVE_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getIsActive() <em>Is Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsActive()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean isActive = IS_ACTIVE_EDEFAULT;

	/**
	 * This is true if the Is Active attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isActiveESet;

	/**
	 * The default value of the '{@link #getIsDataLayoutField() <em>Is Data Layout Field</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsDataLayoutField()
	 * @generated
	 * @ordered
	 */
	protected static final String IS_DATA_LAYOUT_FIELD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsDataLayoutField() <em>Is Data Layout Field</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsDataLayoutField()
	 * @generated
	 * @ordered
	 */
	protected String isDataLayoutField = IS_DATA_LAYOUT_FIELD_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsSelection() <em>Is Selection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsSelection()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean IS_SELECTION_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getIsSelection() <em>Is Selection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsSelection()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean isSelection = IS_SELECTION_EDEFAULT;

	/**
	 * This is true if the Is Selection attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isSelectionESet;

	/**
	 * The default value of the '{@link #getIsSubTable() <em>Is Sub Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsSubTable()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean IS_SUB_TABLE_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getIsSubTable() <em>Is Sub Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsSubTable()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean isSubTable = IS_SUB_TABLE_EDEFAULT;

	/**
	 * This is true if the Is Sub Table attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isSubTableESet;

	/**
	 * The default value of the '{@link #getLabelCellRangeAddress() <em>Label Cell Range Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabelCellRangeAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_CELL_RANGE_ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabelCellRangeAddress() <em>Label Cell Range Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabelCellRangeAddress()
	 * @generated
	 * @ordered
	 */
	protected String labelCellRangeAddress = LABEL_CELL_RANGE_ADDRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getLanguage() <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected static final String LANGUAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLanguage() <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected String language = LANGUAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastColumnSpanned() <em>Last Column Spanned</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastColumnSpanned()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger LAST_COLUMN_SPANNED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastColumnSpanned() <em>Last Column Spanned</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastColumnSpanned()
	 * @generated
	 * @ordered
	 */
	protected BigInteger lastColumnSpanned = LAST_COLUMN_SPANNED_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastRowSpanned() <em>Last Row Spanned</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastRowSpanned()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger LAST_ROW_SPANNED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastRowSpanned() <em>Last Row Spanned</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastRowSpanned()
	 * @generated
	 * @ordered
	 */
	protected BigInteger lastRowSpanned = LAST_ROW_SPANNED_EDEFAULT;

	/**
	 * The default value of the '{@link #getLayoutMode() <em>Layout Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayoutMode()
	 * @generated
	 * @ordered
	 */
	protected static final LayoutModeType LAYOUT_MODE_EDEFAULT = LayoutModeType.TABULAR_LAYOUT;

	/**
	 * The cached value of the '{@link #getLayoutMode() <em>Layout Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayoutMode()
	 * @generated
	 * @ordered
	 */
	protected LayoutModeType layoutMode = LAYOUT_MODE_EDEFAULT;

	/**
	 * This is true if the Layout Mode attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean layoutModeESet;

	/**
	 * The default value of the '{@link #getLinkToSourceData() <em>Link To Source Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkToSourceData()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean LINK_TO_SOURCE_DATA_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getLinkToSourceData() <em>Link To Source Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkToSourceData()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean linkToSourceData = LINK_TO_SOURCE_DATA_EDEFAULT;

	/**
	 * This is true if the Link To Source Data attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean linkToSourceDataESet;

	/**
	 * The default value of the '{@link #getMarkedInvalid() <em>Marked Invalid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarkedInvalid()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean MARKED_INVALID_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getMarkedInvalid() <em>Marked Invalid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarkedInvalid()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean markedInvalid = MARKED_INVALID_EDEFAULT;

	/**
	 * This is true if the Marked Invalid attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean markedInvalidESet;

	/**
	 * The default value of the '{@link #getMatrixCovered() <em>Matrix Covered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatrixCovered()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean MATRIX_COVERED_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getMatrixCovered() <em>Matrix Covered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatrixCovered()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean matrixCovered = MATRIX_COVERED_EDEFAULT;

	/**
	 * This is true if the Matrix Covered attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean matrixCoveredESet;

	/**
	 * The default value of the '{@link #getMemberCount() <em>Member Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemberCount()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger MEMBER_COUNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMemberCount() <em>Member Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemberCount()
	 * @generated
	 * @ordered
	 */
	protected BigInteger memberCount = MEMBER_COUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getMemberName() <em>Member Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemberName()
	 * @generated
	 * @ordered
	 */
	protected static final String MEMBER_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMemberName() <em>Member Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemberName()
	 * @generated
	 * @ordered
	 */
	protected String memberName = MEMBER_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getMemberType() <em>Member Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemberType()
	 * @generated
	 * @ordered
	 */
	protected static final MemberTypeType MEMBER_TYPE_EDEFAULT = MemberTypeType.NAMED;

	/**
	 * The cached value of the '{@link #getMemberType() <em>Member Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemberType()
	 * @generated
	 * @ordered
	 */
	protected MemberTypeType memberType = MEMBER_TYPE_EDEFAULT;

	/**
	 * This is true if the Member Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean memberTypeESet;

	/**
	 * The default value of the '{@link #getMode() <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMode()
	 * @generated
	 * @ordered
	 */
	protected static final ModeType MODE_EDEFAULT = ModeType.COPY_ALL;

	/**
	 * The cached value of the '{@link #getMode() <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMode()
	 * @generated
	 * @ordered
	 */
	protected ModeType mode = MODE_EDEFAULT;

	/**
	 * This is true if the Mode attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean modeESet;

	/**
	 * The default value of the '{@link #getMultiDeletionSpanned() <em>Multi Deletion Spanned</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiDeletionSpanned()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger MULTI_DELETION_SPANNED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMultiDeletionSpanned() <em>Multi Deletion Spanned</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiDeletionSpanned()
	 * @generated
	 * @ordered
	 */
	protected BigInteger multiDeletionSpanned = MULTI_DELETION_SPANNED_EDEFAULT;

	/**
	 * The default value of the '{@link #getNullYear() <em>Null Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNullYear()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger NULL_YEAR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNullYear() <em>Null Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNullYear()
	 * @generated
	 * @ordered
	 */
	protected BigInteger nullYear = NULL_YEAR_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumberColumnsRepeated() <em>Number Columns Repeated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberColumnsRepeated()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger NUMBER_COLUMNS_REPEATED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumberColumnsRepeated() <em>Number Columns Repeated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberColumnsRepeated()
	 * @generated
	 * @ordered
	 */
	protected BigInteger numberColumnsRepeated = NUMBER_COLUMNS_REPEATED_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumberColumnsSpanned() <em>Number Columns Spanned</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberColumnsSpanned()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger NUMBER_COLUMNS_SPANNED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumberColumnsSpanned() <em>Number Columns Spanned</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberColumnsSpanned()
	 * @generated
	 * @ordered
	 */
	protected BigInteger numberColumnsSpanned = NUMBER_COLUMNS_SPANNED_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumberMatrixColumnsSpanned() <em>Number Matrix Columns Spanned</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberMatrixColumnsSpanned()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger NUMBER_MATRIX_COLUMNS_SPANNED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumberMatrixColumnsSpanned() <em>Number Matrix Columns Spanned</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberMatrixColumnsSpanned()
	 * @generated
	 * @ordered
	 */
	protected BigInteger numberMatrixColumnsSpanned = NUMBER_MATRIX_COLUMNS_SPANNED_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumberMatrixRowsSpanned() <em>Number Matrix Rows Spanned</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberMatrixRowsSpanned()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger NUMBER_MATRIX_ROWS_SPANNED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumberMatrixRowsSpanned() <em>Number Matrix Rows Spanned</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberMatrixRowsSpanned()
	 * @generated
	 * @ordered
	 */
	protected BigInteger numberMatrixRowsSpanned = NUMBER_MATRIX_ROWS_SPANNED_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumberRowsRepeated() <em>Number Rows Repeated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberRowsRepeated()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger NUMBER_ROWS_REPEATED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumberRowsRepeated() <em>Number Rows Repeated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberRowsRepeated()
	 * @generated
	 * @ordered
	 */
	protected BigInteger numberRowsRepeated = NUMBER_ROWS_REPEATED_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumberRowsSpanned() <em>Number Rows Spanned</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberRowsSpanned()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger NUMBER_ROWS_SPANNED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumberRowsSpanned() <em>Number Rows Spanned</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberRowsSpanned()
	 * @generated
	 * @ordered
	 */
	protected BigInteger numberRowsSpanned = NUMBER_ROWS_SPANNED_EDEFAULT;

	/**
	 * The default value of the '{@link #getObjectName() <em>Object Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectName()
	 * @generated
	 * @ordered
	 */
	protected static final String OBJECT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getObjectName() <em>Object Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectName()
	 * @generated
	 * @ordered
	 */
	protected String objectName = OBJECT_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getOnUpdateKeepSize() <em>On Update Keep Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnUpdateKeepSize()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean ON_UPDATE_KEEP_SIZE_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getOnUpdateKeepSize() <em>On Update Keep Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnUpdateKeepSize()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean onUpdateKeepSize = ON_UPDATE_KEEP_SIZE_EDEFAULT;

	/**
	 * This is true if the On Update Keep Size attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean onUpdateKeepSizeESet;

	/**
	 * The default value of the '{@link #getOnUpdateKeepStyles() <em>On Update Keep Styles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnUpdateKeepStyles()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean ON_UPDATE_KEEP_STYLES_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getOnUpdateKeepStyles() <em>On Update Keep Styles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnUpdateKeepStyles()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean onUpdateKeepStyles = ON_UPDATE_KEEP_STYLES_EDEFAULT;

	/**
	 * This is true if the On Update Keep Styles attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean onUpdateKeepStylesESet;

	/**
	 * The default value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected static final String OPERATOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected String operator = OPERATOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getOrder() <em>Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrder()
	 * @generated
	 * @ordered
	 */
	protected static final OrderType ORDER_EDEFAULT = OrderType.ASCENDING;

	/**
	 * The cached value of the '{@link #getOrder() <em>Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrder()
	 * @generated
	 * @ordered
	 */
	protected OrderType order = ORDER_EDEFAULT;

	/**
	 * This is true if the Order attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean orderESet;

	/**
	 * The default value of the '{@link #getPageBreaksOnGroupChange() <em>Page Breaks On Group Change</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPageBreaksOnGroupChange()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean PAGE_BREAKS_ON_GROUP_CHANGE_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getPageBreaksOnGroupChange() <em>Page Breaks On Group Change</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPageBreaksOnGroupChange()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean pageBreaksOnGroupChange = PAGE_BREAKS_ON_GROUP_CHANGE_EDEFAULT;

	/**
	 * This is true if the Page Breaks On Group Change attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean pageBreaksOnGroupChangeESet;

	/**
	 * The default value of the '{@link #getParseSqlStatement() <em>Parse Sql Statement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParseSqlStatement()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean PARSE_SQL_STATEMENT_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getParseSqlStatement() <em>Parse Sql Statement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParseSqlStatement()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean parseSqlStatement = PARSE_SQL_STATEMENT_EDEFAULT;

	/**
	 * This is true if the Parse Sql Statement attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean parseSqlStatementESet;

	/**
	 * The default value of the '{@link #getPassword() <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassword()
	 * @generated
	 * @ordered
	 */
	protected static final String PASSWORD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPassword() <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassword()
	 * @generated
	 * @ordered
	 */
	protected String password = PASSWORD_EDEFAULT;

	/**
	 * The default value of the '{@link #getPosition() <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosition()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger POSITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPosition() <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosition()
	 * @generated
	 * @ordered
	 */
	protected BigInteger position = POSITION_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrecisionAsShown() <em>Precision As Shown</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecisionAsShown()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean PRECISION_AS_SHOWN_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getPrecisionAsShown() <em>Precision As Shown</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecisionAsShown()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean precisionAsShown = PRECISION_AS_SHOWN_EDEFAULT;

	/**
	 * This is true if the Precision As Shown attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean precisionAsShownESet;

	/**
	 * The default value of the '{@link #getPrint() <em>Print</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrint()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean PRINT_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getPrint() <em>Print</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrint()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean print = PRINT_EDEFAULT;

	/**
	 * This is true if the Print attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean printESet;

	/**
	 * The default value of the '{@link #getPrintRanges() <em>Print Ranges</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrintRanges()
	 * @generated
	 * @ordered
	 */
	protected static final String PRINT_RANGES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrintRanges() <em>Print Ranges</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrintRanges()
	 * @generated
	 * @ordered
	 */
	protected String printRanges = PRINT_RANGES_EDEFAULT;

	/**
	 * The default value of the '{@link #getProtect() <em>Protect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtect()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean PROTECT_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getProtect() <em>Protect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtect()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean protect = PROTECT_EDEFAULT;

	/**
	 * This is true if the Protect attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean protectESet;

	/**
	 * The default value of the '{@link #getProtected() <em>Protected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtected()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean PROTECTED_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getProtected() <em>Protected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtected()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean protected_ = PROTECTED_EDEFAULT;

	/**
	 * This is true if the Protected attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean protectedESet;

	/**
	 * The default value of the '{@link #getQueryName() <em>Query Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueryName()
	 * @generated
	 * @ordered
	 */
	protected static final String QUERY_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQueryName() <em>Query Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueryName()
	 * @generated
	 * @ordered
	 */
	protected String queryName = QUERY_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getRangeUsableAs() <em>Range Usable As</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRangeUsableAs()
	 * @generated
	 * @ordered
	 */
	protected static final Object RANGE_USABLE_AS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRangeUsableAs() <em>Range Usable As</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRangeUsableAs()
	 * @generated
	 * @ordered
	 */
	protected Object rangeUsableAs = RANGE_USABLE_AS_EDEFAULT;

	/**
	 * The default value of the '{@link #getRejectingChangeId() <em>Rejecting Change Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRejectingChangeId()
	 * @generated
	 * @ordered
	 */
	protected static final String REJECTING_CHANGE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRejectingChangeId() <em>Rejecting Change Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRejectingChangeId()
	 * @generated
	 * @ordered
	 */
	protected String rejectingChangeId = REJECTING_CHANGE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getRow() <em>Row</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRow()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger ROW_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRow() <em>Row</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRow()
	 * @generated
	 * @ordered
	 */
	protected BigInteger row = ROW_EDEFAULT;

	/**
	 * The default value of the '{@link #getScenarioRanges() <em>Scenario Ranges</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScenarioRanges()
	 * @generated
	 * @ordered
	 */
	protected static final String SCENARIO_RANGES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getScenarioRanges() <em>Scenario Ranges</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScenarioRanges()
	 * @generated
	 * @ordered
	 */
	protected String scenarioRanges = SCENARIO_RANGES_EDEFAULT;

	/**
	 * The default value of the '{@link #getSearchCriteriaMustApplyToWholeCell() <em>Search Criteria Must Apply To Whole Cell</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSearchCriteriaMustApplyToWholeCell()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean SEARCH_CRITERIA_MUST_APPLY_TO_WHOLE_CELL_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getSearchCriteriaMustApplyToWholeCell() <em>Search Criteria Must Apply To Whole Cell</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSearchCriteriaMustApplyToWholeCell()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean searchCriteriaMustApplyToWholeCell = SEARCH_CRITERIA_MUST_APPLY_TO_WHOLE_CELL_EDEFAULT;

	/**
	 * This is true if the Search Criteria Must Apply To Whole Cell attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean searchCriteriaMustApplyToWholeCellESet;

	/**
	 * The default value of the '{@link #getSelectedPage() <em>Selected Page</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectedPage()
	 * @generated
	 * @ordered
	 */
	protected static final String SELECTED_PAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSelectedPage() <em>Selected Page</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectedPage()
	 * @generated
	 * @ordered
	 */
	protected String selectedPage = SELECTED_PAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getShowDetails() <em>Show Details</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShowDetails()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean SHOW_DETAILS_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getShowDetails() <em>Show Details</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShowDetails()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean showDetails = SHOW_DETAILS_EDEFAULT;

	/**
	 * This is true if the Show Details attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean showDetailsESet;

	/**
	 * The default value of the '{@link #getShowEmpty() <em>Show Empty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShowEmpty()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean SHOW_EMPTY_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getShowEmpty() <em>Show Empty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShowEmpty()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean showEmpty = SHOW_EMPTY_EDEFAULT;

	/**
	 * This is true if the Show Empty attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean showEmptyESet;

	/**
	 * The default value of the '{@link #getShowFilterButton() <em>Show Filter Button</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShowFilterButton()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean SHOW_FILTER_BUTTON_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getShowFilterButton() <em>Show Filter Button</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShowFilterButton()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean showFilterButton = SHOW_FILTER_BUTTON_EDEFAULT;

	/**
	 * This is true if the Show Filter Button attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean showFilterButtonESet;

	/**
	 * The default value of the '{@link #getSortMode() <em>Sort Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSortMode()
	 * @generated
	 * @ordered
	 */
	protected static final SortModeType SORT_MODE_EDEFAULT = SortModeType.DATA;

	/**
	 * The cached value of the '{@link #getSortMode() <em>Sort Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSortMode()
	 * @generated
	 * @ordered
	 */
	protected SortModeType sortMode = SORT_MODE_EDEFAULT;

	/**
	 * This is true if the Sort Mode attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean sortModeESet;

	/**
	 * The default value of the '{@link #getSourceCellRangeAddresses() <em>Source Cell Range Addresses</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceCellRangeAddresses()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_CELL_RANGE_ADDRESSES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSourceCellRangeAddresses() <em>Source Cell Range Addresses</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceCellRangeAddresses()
	 * @generated
	 * @ordered
	 */
	protected String sourceCellRangeAddresses = SOURCE_CELL_RANGE_ADDRESSES_EDEFAULT;

	/**
	 * The default value of the '{@link #getSourceFieldName() <em>Source Field Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceFieldName()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_FIELD_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSourceFieldName() <em>Source Field Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceFieldName()
	 * @generated
	 * @ordered
	 */
	protected String sourceFieldName = SOURCE_FIELD_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSourceName() <em>Source Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceName()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSourceName() <em>Source Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceName()
	 * @generated
	 * @ordered
	 */
	protected String sourceName = SOURCE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSqlStatement() <em>Sql Statement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSqlStatement()
	 * @generated
	 * @ordered
	 */
	protected static final String SQL_STATEMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSqlStatement() <em>Sql Statement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSqlStatement()
	 * @generated
	 * @ordered
	 */
	protected String sqlStatement = SQL_STATEMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getStart() <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStart()
	 * @generated
	 * @ordered
	 */
	protected static final Object START_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStart() <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStart()
	 * @generated
	 * @ordered
	 */
	protected Object start = START_EDEFAULT;

	/**
	 * The default value of the '{@link #getStartColumn() <em>Start Column</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartColumn()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger START_COLUMN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartColumn() <em>Start Column</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartColumn()
	 * @generated
	 * @ordered
	 */
	protected BigInteger startColumn = START_COLUMN_EDEFAULT;

	/**
	 * The default value of the '{@link #getStartPosition() <em>Start Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartPosition()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger START_POSITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartPosition() <em>Start Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartPosition()
	 * @generated
	 * @ordered
	 */
	protected BigInteger startPosition = START_POSITION_EDEFAULT;

	/**
	 * The default value of the '{@link #getStartRow() <em>Start Row</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartRow()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger START_ROW_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartRow() <em>Start Row</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartRow()
	 * @generated
	 * @ordered
	 */
	protected BigInteger startRow = START_ROW_EDEFAULT;

	/**
	 * The default value of the '{@link #getStartTable() <em>Start Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartTable()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger START_TABLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartTable() <em>Start Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartTable()
	 * @generated
	 * @ordered
	 */
	protected BigInteger startTable = START_TABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getStep() <em>Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStep()
	 * @generated
	 * @ordered
	 */
	protected static final double STEP_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getStep() <em>Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStep()
	 * @generated
	 * @ordered
	 */
	protected double step = STEP_EDEFAULT;

	/**
	 * This is true if the Step attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean stepESet;

	/**
	 * The default value of the '{@link #getStructureProtected() <em>Structure Protected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStructureProtected()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean STRUCTURE_PROTECTED_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getStructureProtected() <em>Structure Protected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStructureProtected()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean structureProtected = STRUCTURE_PROTECTED_EDEFAULT;

	/**
	 * This is true if the Structure Protected attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean structureProtectedESet;

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
	 * The default value of the '{@link #getTable1() <em>Table1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTable1()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger TABLE1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTable1() <em>Table1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTable1()
	 * @generated
	 * @ordered
	 */
	protected BigInteger table1 = TABLE1_EDEFAULT;

	/**
	 * The default value of the '{@link #getTableBackground() <em>Table Background</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTableBackground()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean TABLE_BACKGROUND_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getTableBackground() <em>Table Background</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTableBackground()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean tableBackground = TABLE_BACKGROUND_EDEFAULT;

	/**
	 * This is true if the Table Background attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean tableBackgroundESet;

	/**
	 * The default value of the '{@link #getTableName() <em>Table Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTableName()
	 * @generated
	 * @ordered
	 */
	protected static final String TABLE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTableName() <em>Table Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTableName()
	 * @generated
	 * @ordered
	 */
	protected String tableName = TABLE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getTargetCellAddress() <em>Target Cell Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetCellAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_CELL_ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetCellAddress() <em>Target Cell Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetCellAddress()
	 * @generated
	 * @ordered
	 */
	protected String targetCellAddress = TARGET_CELL_ADDRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getTargetRangeAddress1() <em>Target Range Address1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetRangeAddress1()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_RANGE_ADDRESS1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetRangeAddress1() <em>Target Range Address1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetRangeAddress1()
	 * @generated
	 * @ordered
	 */
	protected String targetRangeAddress1 = TARGET_RANGE_ADDRESS1_EDEFAULT;

	/**
	 * The default value of the '{@link #getTrackChanges() <em>Track Changes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrackChanges()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean TRACK_CHANGES_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getTrackChanges() <em>Track Changes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrackChanges()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean trackChanges = TRACK_CHANGES_EDEFAULT;

	/**
	 * This is true if the Track Changes attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean trackChangesESet;

	/**
	 * The default value of the '{@link #getUsedHierarchy() <em>Used Hierarchy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsedHierarchy()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger USED_HIERARCHY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUsedHierarchy() <em>Used Hierarchy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsedHierarchy()
	 * @generated
	 * @ordered
	 */
	protected BigInteger usedHierarchy = USED_HIERARCHY_EDEFAULT;

	/**
	 * The default value of the '{@link #getUseLabels() <em>Use Labels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseLabels()
	 * @generated
	 * @ordered
	 */
	protected static final UseLabelsType USE_LABELS_EDEFAULT = UseLabelsType.NONE;

	/**
	 * The cached value of the '{@link #getUseLabels() <em>Use Labels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseLabels()
	 * @generated
	 * @ordered
	 */
	protected UseLabelsType useLabels = USE_LABELS_EDEFAULT;

	/**
	 * This is true if the Use Labels attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean useLabelsESet;

	/**
	 * The default value of the '{@link #getUseRegularExpressions() <em>Use Regular Expressions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseRegularExpressions()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean USE_REGULAR_EXPRESSIONS_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getUseRegularExpressions() <em>Use Regular Expressions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseRegularExpressions()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean useRegularExpressions = USE_REGULAR_EXPRESSIONS_EDEFAULT;

	/**
	 * This is true if the Use Regular Expressions attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean useRegularExpressionsESet;

	/**
	 * The default value of the '{@link #getUserName() <em>User Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserName()
	 * @generated
	 * @ordered
	 */
	protected static final String USER_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUserName() <em>User Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserName()
	 * @generated
	 * @ordered
	 */
	protected String userName = USER_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getVisibility() <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibility()
	 * @generated
	 * @ordered
	 */
	protected static final TableVisibilityValue VISIBILITY_EDEFAULT = TableVisibilityValue.VISIBLE;

	/**
	 * The cached value of the '{@link #getVisibility() <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibility()
	 * @generated
	 * @ordered
	 */
	protected TableVisibilityValue visibility = VISIBILITY_EDEFAULT;

	/**
	 * This is true if the Visibility attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean visibilityESet;

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
		return TablePackage.eINSTANCE.getDocumentRoot();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, TablePackage.DOCUMENT_ROOT__MIXED);
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
			xMLNSPrefixMap = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, TablePackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
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
			xSISchemaLocation = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, TablePackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		}
		return xSISchemaLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BodyType getBody() {
		return (BodyType)getMixed().get(TablePackage.eINSTANCE.getDocumentRoot_Body(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBody(BodyType newBody, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TablePackage.eINSTANCE.getDocumentRoot_Body(), newBody, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBody(BodyType newBody) {
		((FeatureMap.Internal)getMixed()).set(TablePackage.eINSTANCE.getDocumentRoot_Body(), newBody);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalculationSettingsType getCalculationSettings() {
		return (CalculationSettingsType)getMixed().get(TablePackage.eINSTANCE.getDocumentRoot_CalculationSettings(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCalculationSettings(CalculationSettingsType newCalculationSettings, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TablePackage.eINSTANCE.getDocumentRoot_CalculationSettings(), newCalculationSettings, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCalculationSettings(CalculationSettingsType newCalculationSettings) {
		((FeatureMap.Internal)getMixed()).set(TablePackage.eINSTANCE.getDocumentRoot_CalculationSettings(), newCalculationSettings);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CellAddressType getCellAddress() {
		return (CellAddressType)getMixed().get(TablePackage.eINSTANCE.getDocumentRoot_CellAddress(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCellAddress(CellAddressType newCellAddress, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TablePackage.eINSTANCE.getDocumentRoot_CellAddress(), newCellAddress, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCellAddress(CellAddressType newCellAddress) {
		((FeatureMap.Internal)getMixed()).set(TablePackage.eINSTANCE.getDocumentRoot_CellAddress(), newCellAddress);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CellContentChangeType getCellContentChange() {
		return (CellContentChangeType)getMixed().get(TablePackage.eINSTANCE.getDocumentRoot_CellContentChange(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCellContentChange(CellContentChangeType newCellContentChange, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TablePackage.eINSTANCE.getDocumentRoot_CellContentChange(), newCellContentChange, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCellContentChange(CellContentChangeType newCellContentChange) {
		((FeatureMap.Internal)getMixed()).set(TablePackage.eINSTANCE.getDocumentRoot_CellContentChange(), newCellContentChange);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CellContentDeletionType getCellContentDeletion() {
		return (CellContentDeletionType)getMixed().get(TablePackage.eINSTANCE.getDocumentRoot_CellContentDeletion(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCellContentDeletion(CellContentDeletionType newCellContentDeletion, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TablePackage.eINSTANCE.getDocumentRoot_CellContentDeletion(), newCellContentDeletion, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCellContentDeletion(CellContentDeletionType newCellContentDeletion) {
		((FeatureMap.Internal)getMixed()).set(TablePackage.eINSTANCE.getDocumentRoot_CellContentDeletion(), newCellContentDeletion);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CellRangeSourceType getCellRangeSource() {
		return (CellRangeSourceType)getMixed().get(TablePackage.eINSTANCE.getDocumentRoot_CellRangeSource(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCellRangeSource(CellRangeSourceType newCellRangeSource, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TablePackage.eINSTANCE.getDocumentRoot_CellRangeSource(), newCellRangeSource, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCellRangeSource(CellRangeSourceType newCellRangeSource) {
		((FeatureMap.Internal)getMixed()).set(TablePackage.eINSTANCE.getDocumentRoot_CellRangeSource(), newCellRangeSource);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeDeletionType getChangeDeletion() {
		return (ChangeDeletionType)getMixed().get(TablePackage.eINSTANCE.getDocumentRoot_ChangeDeletion(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChangeDeletion(ChangeDeletionType newChangeDeletion, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TablePackage.eINSTANCE.getDocumentRoot_ChangeDeletion(), newChangeDeletion, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChangeDeletion(ChangeDeletionType newChangeDeletion) {
		((FeatureMap.Internal)getMixed()).set(TablePackage.eINSTANCE.getDocumentRoot_ChangeDeletion(), newChangeDeletion);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeTrackTableCellType getChangeTrackTableCell() {
		return (ChangeTrackTableCellType)getMixed().get(TablePackage.eINSTANCE.getDocumentRoot_ChangeTrackTableCell(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChangeTrackTableCell(ChangeTrackTableCellType newChangeTrackTableCell, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TablePackage.eINSTANCE.getDocumentRoot_ChangeTrackTableCell(), newChangeTrackTableCell, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChangeTrackTableCell(ChangeTrackTableCellType newChangeTrackTableCell) {
		((FeatureMap.Internal)getMixed()).set(TablePackage.eINSTANCE.getDocumentRoot_ChangeTrackTableCell(), newChangeTrackTableCell);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConsolidationType getConsolidation() {
		return (ConsolidationType)getMixed().get(TablePackage.eINSTANCE.getDocumentRoot_Consolidation(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConsolidation(ConsolidationType newConsolidation, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TablePackage.eINSTANCE.getDocumentRoot_Consolidation(), newConsolidation, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConsolidation(ConsolidationType newConsolidation) {
		((FeatureMap.Internal)getMixed()).set(TablePackage.eINSTANCE.getDocumentRoot_Consolidation(), newConsolidation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContentValidationType getContentValidation() {
		return (ContentValidationType)getMixed().get(TablePackage.eINSTANCE.getDocumentRoot_ContentValidation(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContentValidation(ContentValidationType newContentValidation, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TablePackage.eINSTANCE.getDocumentRoot_ContentValidation(), newContentValidation, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContentValidation(ContentValidationType newContentValidation) {
		((FeatureMap.Internal)getMixed()).set(TablePackage.eINSTANCE.getDocumentRoot_ContentValidation(), newContentValidation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContentValidationsType getContentValidations() {
		return (ContentValidationsType)getMixed().get(TablePackage.eINSTANCE.getDocumentRoot_ContentValidations(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContentValidations(ContentValidationsType newContentValidations, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TablePackage.eINSTANCE.getDocumentRoot_ContentValidations(), newContentValidations, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContentValidations(ContentValidationsType newContentValidations) {
		((FeatureMap.Internal)getMixed()).set(TablePackage.eINSTANCE.getDocumentRoot_ContentValidations(), newContentValidations);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoveredTableCellType getCoveredTableCell() {
		return (CoveredTableCellType)getMixed().get(TablePackage.eINSTANCE.getDocumentRoot_CoveredTableCell(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCoveredTableCell(CoveredTableCellType newCoveredTableCell, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TablePackage.eINSTANCE.getDocumentRoot_CoveredTableCell(), newCoveredTableCell, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCoveredTableCell(CoveredTableCellType newCoveredTableCell) {
		((FeatureMap.Internal)getMixed()).set(TablePackage.eINSTANCE.getDocumentRoot_CoveredTableCell(), newCoveredTableCell);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CutOffsType getCutOffs() {
		return (CutOffsType)getMixed().get(TablePackage.eINSTANCE.getDocumentRoot_CutOffs(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCutOffs(CutOffsType newCutOffs, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TablePackage.eINSTANCE.getDocumentRoot_CutOffs(), newCutOffs, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCutOffs(CutOffsType newCutOffs) {
		((FeatureMap.Internal)getMixed()).set(TablePackage.eINSTANCE.getDocumentRoot_CutOffs(), newCutOffs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatabaseRangeType getDatabaseRange() {
		return (DatabaseRangeType)getMixed().get(TablePackage.eINSTANCE.getDocumentRoot_DatabaseRange(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDatabaseRange(DatabaseRangeType newDatabaseRange, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TablePackage.eINSTANCE.getDocumentRoot_DatabaseRange(), newDatabaseRange, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatabaseRange(DatabaseRangeType newDatabaseRange) {
		((FeatureMap.Internal)getMixed()).set(TablePackage.eINSTANCE.getDocumentRoot_DatabaseRange(), newDatabaseRange);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatabaseRangesType getDatabaseRanges() {
		return (DatabaseRangesType)getMixed().get(TablePackage.eINSTANCE.getDocumentRoot_DatabaseRanges(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDatabaseRanges(DatabaseRangesType newDatabaseRanges, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TablePackage.eINSTANCE.getDocumentRoot_DatabaseRanges(), newDatabaseRanges, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatabaseRanges(DatabaseRangesType newDatabaseRanges) {
		((FeatureMap.Internal)getMixed()).set(TablePackage.eINSTANCE.getDocumentRoot_DatabaseRanges(), newDatabaseRanges);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatabaseSourceQueryType getDatabaseSourceQuery() {
		return (DatabaseSourceQueryType)getMixed().get(TablePackage.eINSTANCE.getDocumentRoot_DatabaseSourceQuery(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDatabaseSourceQuery(DatabaseSourceQueryType newDatabaseSourceQuery, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TablePackage.eINSTANCE.getDocumentRoot_DatabaseSourceQuery(), newDatabaseSourceQuery, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatabaseSourceQuery(DatabaseSourceQueryType newDatabaseSourceQuery) {
		((FeatureMap.Internal)getMixed()).set(TablePackage.eINSTANCE.getDocumentRoot_DatabaseSourceQuery(), newDatabaseSourceQuery);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatabaseSourceSqlType getDatabaseSourceSql() {
		return (DatabaseSourceSqlType)getMixed().get(TablePackage.eINSTANCE.getDocumentRoot_DatabaseSourceSql(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDatabaseSourceSql(DatabaseSourceSqlType newDatabaseSourceSql, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TablePackage.eINSTANCE.getDocumentRoot_DatabaseSourceSql(), newDatabaseSourceSql, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatabaseSourceSql(DatabaseSourceSqlType newDatabaseSourceSql) {
		((FeatureMap.Internal)getMixed()).set(TablePackage.eINSTANCE.getDocumentRoot_DatabaseSourceSql(), newDatabaseSourceSql);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatabaseSourceTableType getDatabaseSourceTable() {
		return (DatabaseSourceTableType)getMixed().get(TablePackage.eINSTANCE.getDocumentRoot_DatabaseSourceTable(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDatabaseSourceTable(DatabaseSourceTableType newDatabaseSourceTable, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TablePackage.eINSTANCE.getDocumentRoot_DatabaseSourceTable(), newDatabaseSourceTable, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatabaseSourceTable(DatabaseSourceTableType newDatabaseSourceTable) {
		((FeatureMap.Internal)getMixed()).set(TablePackage.eINSTANCE.getDocumentRoot_DatabaseSourceTable(), newDatabaseSourceTable);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataPilotDisplayInfoType getDataPilotDisplayInfo() {
		return (DataPilotDisplayInfoType)getMixed().get(TablePackage.eINSTANCE.getDocumentRoot_DataPilotDisplayInfo(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataPilotDisplayInfo(DataPilotDisplayInfoType newDataPilotDisplayInfo, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TablePackage.eINSTANCE.getDocumentRoot_DataPilotDisplayInfo(), newDataPilotDisplayInfo, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataPilotDisplayInfo(DataPilotDisplayInfoType newDataPilotDisplayInfo) {
		((FeatureMap.Internal)getMixed()).set(TablePackage.eINSTANCE.getDocumentRoot_DataPilotDisplayInfo(), newDataPilotDisplayInfo);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataPilotFieldType getDataPilotField() {
		return (DataPilotFieldType)getMixed().get(TablePackage.eINSTANCE.getDocumentRoot_DataPilotField(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataPilotField(DataPilotFieldType newDataPilotField, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TablePackage.eINSTANCE.getDocumentRoot_DataPilotField(), newDataPilotField, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataPilotField(DataPilotFieldType newDataPilotField) {
		((FeatureMap.Internal)getMixed()).set(TablePackage.eINSTANCE.getDocumentRoot_DataPilotField(), newDataPilotField);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataPilotFieldReferenceType getDataPilotFieldReference() {
		return (DataPilotFieldReferenceType)getMixed().get(TablePackage.eINSTANCE.getDocumentRoot_DataPilotFieldReference(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataPilotFieldReference(DataPilotFieldReferenceType newDataPilotFieldReference, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TablePackage.eINSTANCE.getDocumentRoot_DataPilotFieldReference(), newDataPilotFieldReference, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataPilotFieldReference(DataPilotFieldReferenceType newDataPilotFieldReference) {
		((FeatureMap.Internal)getMixed()).set(TablePackage.eINSTANCE.getDocumentRoot_DataPilotFieldReference(), newDataPilotFieldReference);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataPilotGroupType getDataPilotGroup() {
		return (DataPilotGroupType)getMixed().get(TablePackage.eINSTANCE.getDocumentRoot_DataPilotGroup(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataPilotGroup(DataPilotGroupType newDataPilotGroup, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TablePackage.eINSTANCE.getDocumentRoot_DataPilotGroup(), newDataPilotGroup, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataPilotGroup(DataPilotGroupType newDataPilotGroup) {
		((FeatureMap.Internal)getMixed()).set(TablePackage.eINSTANCE.getDocumentRoot_DataPilotGroup(), newDataPilotGroup);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataPilotGroupMemberType getDataPilotGroupMember() {
		return (DataPilotGroupMemberType)getMixed().get(TablePackage.eINSTANCE.getDocumentRoot_DataPilotGroupMember(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataPilotGroupMember(DataPilotGroupMemberType newDataPilotGroupMember, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TablePackage.eINSTANCE.getDocumentRoot_DataPilotGroupMember(), newDataPilotGroupMember, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataPilotGroupMember(DataPilotGroupMemberType newDataPilotGroupMember) {
		((FeatureMap.Internal)getMixed()).set(TablePackage.eINSTANCE.getDocumentRoot_DataPilotGroupMember(), newDataPilotGroupMember);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataPilotGroupsType getDataPilotGroups() {
		return (DataPilotGroupsType)getMixed().get(TablePackage.eINSTANCE.getDocumentRoot_DataPilotGroups(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataPilotGroups(DataPilotGroupsType newDataPilotGroups, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TablePackage.eINSTANCE.getDocumentRoot_DataPilotGroups(), newDataPilotGroups, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataPilotGroups(DataPilotGroupsType newDataPilotGroups) {
		((FeatureMap.Internal)getMixed()).set(TablePackage.eINSTANCE.getDocumentRoot_DataPilotGroups(), newDataPilotGroups);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataPilotLayoutInfoType getDataPilotLayoutInfo() {
		return (DataPilotLayoutInfoType)getMixed().get(TablePackage.eINSTANCE.getDocumentRoot_DataPilotLayoutInfo(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataPilotLayoutInfo(DataPilotLayoutInfoType newDataPilotLayoutInfo, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TablePackage.eINSTANCE.getDocumentRoot_DataPilotLayoutInfo(), newDataPilotLayoutInfo, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataPilotLayoutInfo(DataPilotLayoutInfoType newDataPilotLayoutInfo) {
		((FeatureMap.Internal)getMixed()).set(TablePackage.eINSTANCE.getDocumentRoot_DataPilotLayoutInfo(), newDataPilotLayoutInfo);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataPilotLevelType getDataPilotLevel() {
		return (DataPilotLevelType)getMixed().get(TablePackage.eINSTANCE.getDocumentRoot_DataPilotLevel(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataPilotLevel(DataPilotLevelType newDataPilotLevel, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TablePackage.eINSTANCE.getDocumentRoot_DataPilotLevel(), newDataPilotLevel, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataPilotLevel(DataPilotLevelType newDataPilotLevel) {
		((FeatureMap.Internal)getMixed()).set(TablePackage.eINSTANCE.getDocumentRoot_DataPilotLevel(), newDataPilotLevel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataPilotMemberType getDataPilotMember() {
		return (DataPilotMemberType)getMixed().get(TablePackage.eINSTANCE.getDocumentRoot_DataPilotMember(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataPilotMember(DataPilotMemberType newDataPilotMember, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TablePackage.eINSTANCE.getDocumentRoot_DataPilotMember(), newDataPilotMember, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataPilotMember(DataPilotMemberType newDataPilotMember) {
		((FeatureMap.Internal)getMixed()).set(TablePackage.eINSTANCE.getDocumentRoot_DataPilotMember(), newDataPilotMember);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataPilotMembersType getDataPilotMembers() {
		return (DataPilotMembersType)getMixed().get(TablePackage.eINSTANCE.getDocumentRoot_DataPilotMembers(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataPilotMembers(DataPilotMembersType newDataPilotMembers, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TablePackage.eINSTANCE.getDocumentRoot_DataPilotMembers(), newDataPilotMembers, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataPilotMembers(DataPilotMembersType newDataPilotMembers) {
		((FeatureMap.Internal)getMixed()).set(TablePackage.eINSTANCE.getDocumentRoot_DataPilotMembers(), newDataPilotMembers);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataPilotSortInfoType getDataPilotSortInfo() {
		return (DataPilotSortInfoType)getMixed().get(TablePackage.eINSTANCE.getDocumentRoot_DataPilotSortInfo(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataPilotSortInfo(DataPilotSortInfoType newDataPilotSortInfo, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TablePackage.eINSTANCE.getDocumentRoot_DataPilotSortInfo(), newDataPilotSortInfo, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataPilotSortInfo(DataPilotSortInfoType newDataPilotSortInfo) {
		((FeatureMap.Internal)getMixed()).set(TablePackage.eINSTANCE.getDocumentRoot_DataPilotSortInfo(), newDataPilotSortInfo);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataPilotSubtotalType getDataPilotSubtotal() {
		return (DataPilotSubtotalType)getMixed().get(TablePackage.eINSTANCE.getDocumentRoot_DataPilotSubtotal(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataPilotSubtotal(DataPilotSubtotalType newDataPilotSubtotal, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TablePackage.eINSTANCE.getDocumentRoot_DataPilotSubtotal(), newDataPilotSubtotal, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataPilotSubtotal(DataPilotSubtotalType newDataPilotSubtotal) {
		((FeatureMap.Internal)getMixed()).set(TablePackage.eINSTANCE.getDocumentRoot_DataPilotSubtotal(), newDataPilotSubtotal);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataPilotSubtotalsType getDataPilotSubtotals() {
		return (DataPilotSubtotalsType)getMixed().get(TablePackage.eINSTANCE.getDocumentRoot_DataPilotSubtotals(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataPilotSubtotals(DataPilotSubtotalsType newDataPilotSubtotals, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TablePackage.eINSTANCE.getDocumentRoot_DataPilotSubtotals(), newDataPilotSubtotals, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataPilotSubtotals(DataPilotSubtotalsType newDataPilotSubtotals) {
		((FeatureMap.Internal)getMixed()).set(TablePackage.eINSTANCE.getDocumentRoot_DataPilotSubtotals(), newDataPilotSubtotals);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataPilotTableType getDataPilotTable() {
		return (DataPilotTableType)getMixed().get(TablePackage.eINSTANCE.getDocumentRoot_DataPilotTable(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataPilotTable(DataPilotTableType newDataPilotTable, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TablePackage.eINSTANCE.getDocumentRoot_DataPilotTable(), newDataPilotTable, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataPilotTable(DataPilotTableType newDataPilotTable) {
		((FeatureMap.Internal)getMixed()).set(TablePackage.eINSTANCE.getDocumentRoot_DataPilotTable(), newDataPilotTable);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataPilotTablesType getDataPilotTables() {
		return (DataPilotTablesType)getMixed().get(TablePackage.eINSTANCE.getDocumentRoot_DataPilotTables(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataPilotTables(DataPilotTablesType newDataPilotTables, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TablePackage.eINSTANCE.getDocumentRoot_DataPilotTables(), newDataPilotTables, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataPilotTables(DataPilotTablesType newDataPilotTables) {
		((FeatureMap.Internal)getMixed()).set(TablePackage.eINSTANCE.getDocumentRoot_DataPilotTables(), newDataPilotTables);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DdeLinkType getDdeLink() {
		return (DdeLinkType)getMixed().get(TablePackage.eINSTANCE.getDocumentRoot_DdeLink(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDdeLink(DdeLinkType newDdeLink, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TablePackage.eINSTANCE.getDocumentRoot_DdeLink(), newDdeLink, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDdeLink(DdeLinkType newDdeLink) {
		((FeatureMap.Internal)getMixed()).set(TablePackage.eINSTANCE.getDocumentRoot_DdeLink(), newDdeLink);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DdeLinksType getDdeLinks() {
		return (DdeLinksType)getMixed().get(TablePackage.eINSTANCE.getDocumentRoot_DdeLinks(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDdeLinks(DdeLinksType newDdeLinks, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TablePackage.eINSTANCE.getDocumentRoot_DdeLinks(), newDdeLinks, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDdeLinks(DdeLinksType newDdeLinks) {
		((FeatureMap.Internal)getMixed()).set(TablePackage.eINSTANCE.getDocumentRoot_DdeLinks(), newDdeLinks);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeletionType getDeletion() {
		return (DeletionType)getMixed().get(TablePackage.eINSTANCE.getDocumentRoot_Deletion(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeletion(DeletionType newDeletion, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TablePackage.eINSTANCE.getDocumentRoot_Deletion(), newDeletion, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeletion(DeletionType newDeletion) {
		((FeatureMap.Internal)getMixed()).set(TablePackage.eINSTANCE.getDocumentRoot_Deletion(), newDeletion);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeletionsType getDeletions() {
		return (DeletionsType)getMixed().get(TablePackage.eINSTANCE.getDocumentRoot_Deletions(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeletions(DeletionsType newDeletions, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TablePackage.eINSTANCE.getDocumentRoot_Deletions(), newDeletions, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeletions(DeletionsType newDeletions) {
		((FeatureMap.Internal)getMixed()).set(TablePackage.eINSTANCE.getDocumentRoot_Deletions(), newDeletions);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DependenciesType getDependencies() {
		return (DependenciesType)getMixed().get(TablePackage.eINSTANCE.getDocumentRoot_Dependencies(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDependencies(DependenciesType newDependencies, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TablePackage.eINSTANCE.getDocumentRoot_Dependencies(), newDependencies, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDependencies(DependenciesType newDependencies) {
		((FeatureMap.Internal)getMixed()).set(TablePackage.eINSTANCE.getDocumentRoot_Dependencies(), newDependencies);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DependencyType getDependency() {
		return (DependencyType)getMixed().get(TablePackage.eINSTANCE.getDocumentRoot_Dependency(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDependency(DependencyType newDependency, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TablePackage.eINSTANCE.getDocumentRoot_Dependency(), newDependency, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDependency(DependencyType newDependency) {
		((FeatureMap.Internal)getMixed()).set(TablePackage.eINSTANCE.getDocumentRoot_Dependency(), newDependency);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DetectiveType getDetective() {
		return (DetectiveType)getMixed().get(TablePackage.eINSTANCE.getDocumentRoot_Detective(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDetective(DetectiveType newDetective, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TablePackage.eINSTANCE.getDocumentRoot_Detective(), newDetective, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDetective(DetectiveType newDetective) {
		((FeatureMap.Internal)getMixed()).set(TablePackage.eINSTANCE.getDocumentRoot_Detective(), newDetective);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErrorMacroType getErrorMacro() {
		return (ErrorMacroType)getMixed().get(TablePackage.eINSTANCE.getDocumentRoot_ErrorMacro(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetErrorMacro(ErrorMacroType newErrorMacro, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TablePackage.eINSTANCE.getDocumentRoot_ErrorMacro(), newErrorMacro, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setErrorMacro(ErrorMacroType newErrorMacro) {
		((FeatureMap.Internal)getMixed()).set(TablePackage.eINSTANCE.getDocumentRoot_ErrorMacro(), newErrorMacro);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErrorMessageType getErrorMessage() {
		return (ErrorMessageType)getMixed().get(TablePackage.eINSTANCE.getDocumentRoot_ErrorMessage(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetErrorMessage(ErrorMessageType newErrorMessage, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TablePackage.eINSTANCE.getDocumentRoot_ErrorMessage(), newErrorMessage, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setErrorMessage(ErrorMessageType newErrorMessage) {
		((FeatureMap.Internal)getMixed()).set(TablePackage.eINSTANCE.getDocumentRoot_ErrorMessage(), newErrorMessage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvenColumnsType getEvenColumns() {
		return (EvenColumnsType)getMixed().get(TablePackage.eINSTANCE.getDocumentRoot_EvenColumns(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEvenColumns(EvenColumnsType newEvenColumns, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TablePackage.eINSTANCE.getDocumentRoot_EvenColumns(), newEvenColumns, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEvenColumns(EvenColumnsType newEvenColumns) {
		((FeatureMap.Internal)getMixed()).set(TablePackage.eINSTANCE.getDocumentRoot_EvenColumns(), newEvenColumns);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvenRowsType getEvenRows() {
		return (EvenRowsType)getMixed().get(TablePackage.eINSTANCE.getDocumentRoot_EvenRows(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEvenRows(EvenRowsType newEvenRows, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TablePackage.eINSTANCE.getDocumentRoot_EvenRows(), newEvenRows, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEvenRows(EvenRowsType newEvenRows) {
		((FeatureMap.Internal)getMixed()).set(TablePackage.eINSTANCE.getDocumentRoot_EvenRows(), newEvenRows);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilterType getFilter() {
		return (FilterType)getMixed().get(TablePackage.eINSTANCE.getDocumentRoot_Filter(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFilter(FilterType newFilter, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TablePackage.eINSTANCE.getDocumentRoot_Filter(), newFilter, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFilter(FilterType newFilter) {
		((FeatureMap.Internal)getMixed()).set(TablePackage.eINSTANCE.getDocumentRoot_Filter(), newFilter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilterAndType getFilterAnd() {
		return (FilterAndType)getMixed().get(TablePackage.eINSTANCE.getDocumentRoot_FilterAnd(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFilterAnd(FilterAndType newFilterAnd, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TablePackage.eINSTANCE.getDocumentRoot_FilterAnd(), newFilterAnd, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFilterAnd(FilterAndType newFilterAnd) {
		((FeatureMap.Internal)getMixed()).set(TablePackage.eINSTANCE.getDocumentRoot_FilterAnd(), newFilterAnd);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilterConditionType getFilterCondition() {
		return (FilterConditionType)getMixed().get(TablePackage.eINSTANCE.getDocumentRoot_FilterCondition(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFilterCondition(FilterConditionType newFilterCondition, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TablePackage.eINSTANCE.getDocumentRoot_FilterCondition(), newFilterCondition, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFilterCondition(FilterConditionType newFilterCondition) {
		((FeatureMap.Internal)getMixed()).set(TablePackage.eINSTANCE.getDocumentRoot_FilterCondition(), newFilterCondition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilterOrType getFilterOr() {
		return (FilterOrType)getMixed().get(TablePackage.eINSTANCE.getDocumentRoot_FilterOr(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFilterOr(FilterOrType newFilterOr, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TablePackage.eINSTANCE.getDocumentRoot_FilterOr(), newFilterOr, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFilterOr(FilterOrType newFilterOr) {
		((FeatureMap.Internal)getMixed()).set(TablePackage.eINSTANCE.getDocumentRoot_FilterOr(), newFilterOr);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FirstColumnType getFirstColumn() {
		return (FirstColumnType)getMixed().get(TablePackage.eINSTANCE.getDocumentRoot_FirstColumn(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFirstColumn(FirstColumnType newFirstColumn, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TablePackage.eINSTANCE.getDocumentRoot_FirstColumn(), newFirstColumn, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirstColumn(FirstColumnType newFirstColumn) {
		((FeatureMap.Internal)getMixed()).set(TablePackage.eINSTANCE.getDocumentRoot_FirstColumn(), newFirstColumn);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FirstRowType getFirstRow() {
		return (FirstRowType)getMixed().get(TablePackage.eINSTANCE.getDocumentRoot_FirstRow(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFirstRow(FirstRowType newFirstRow, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TablePackage.eINSTANCE.getDocumentRoot_FirstRow(), newFirstRow, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirstRow(FirstRowType newFirstRow) {
		((FeatureMap.Internal)getMixed()).set(TablePackage.eINSTANCE.getDocumentRoot_FirstRow(), newFirstRow);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HelpMessageType getHelpMessage() {
		return (HelpMessageType)getMixed().get(TablePackage.eINSTANCE.getDocumentRoot_HelpMessage(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHelpMessage(HelpMessageType newHelpMessage, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TablePackage.eINSTANCE.getDocumentRoot_HelpMessage(), newHelpMessage, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHelpMessage(HelpMessageType newHelpMessage) {
		((FeatureMap.Internal)getMixed()).set(TablePackage.eINSTANCE.getDocumentRoot_HelpMessage(), newHelpMessage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HighlightedRangeType getHighlightedRange() {
		return (HighlightedRangeType)getMixed().get(TablePackage.eINSTANCE.getDocumentRoot_HighlightedRange(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHighlightedRange(HighlightedRangeType newHighlightedRange, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TablePackage.eINSTANCE.getDocumentRoot_HighlightedRange(), newHighlightedRange, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHighlightedRange(HighlightedRangeType newHighlightedRange) {
		((FeatureMap.Internal)getMixed()).set(TablePackage.eINSTANCE.getDocumentRoot_HighlightedRange(), newHighlightedRange);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InsertionType getInsertion() {
		return (InsertionType)getMixed().get(TablePackage.eINSTANCE.getDocumentRoot_Insertion(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInsertion(InsertionType newInsertion, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TablePackage.eINSTANCE.getDocumentRoot_Insertion(), newInsertion, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInsertion(InsertionType newInsertion) {
		((FeatureMap.Internal)getMixed()).set(TablePackage.eINSTANCE.getDocumentRoot_Insertion(), newInsertion);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InsertionCutOffType getInsertionCutOff() {
		return (InsertionCutOffType)getMixed().get(TablePackage.eINSTANCE.getDocumentRoot_InsertionCutOff(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInsertionCutOff(InsertionCutOffType newInsertionCutOff, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TablePackage.eINSTANCE.getDocumentRoot_InsertionCutOff(), newInsertionCutOff, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInsertionCutOff(InsertionCutOffType newInsertionCutOff) {
		((FeatureMap.Internal)getMixed()).set(TablePackage.eINSTANCE.getDocumentRoot_InsertionCutOff(), newInsertionCutOff);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IterationType getIteration() {
		return (IterationType)getMixed().get(TablePackage.eINSTANCE.getDocumentRoot_Iteration(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIteration(IterationType newIteration, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TablePackage.eINSTANCE.getDocumentRoot_Iteration(), newIteration, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIteration(IterationType newIteration) {
		((FeatureMap.Internal)getMixed()).set(TablePackage.eINSTANCE.getDocumentRoot_Iteration(), newIteration);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LabelRangeType getLabelRange() {
		return (LabelRangeType)getMixed().get(TablePackage.eINSTANCE.getDocumentRoot_LabelRange(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLabelRange(LabelRangeType newLabelRange, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TablePackage.eINSTANCE.getDocumentRoot_LabelRange(), newLabelRange, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabelRange(LabelRangeType newLabelRange) {
		((FeatureMap.Internal)getMixed()).set(TablePackage.eINSTANCE.getDocumentRoot_LabelRange(), newLabelRange);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LabelRangesType getLabelRanges() {
		return (LabelRangesType)getMixed().get(TablePackage.eINSTANCE.getDocumentRoot_LabelRanges(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLabelRanges(LabelRangesType newLabelRanges, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TablePackage.eINSTANCE.getDocumentRoot_LabelRanges(), newLabelRanges, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabelRanges(LabelRangesType newLabelRanges) {
		((FeatureMap.Internal)getMixed()).set(TablePackage.eINSTANCE.getDocumentRoot_LabelRanges(), newLabelRanges);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LastColumnType getLastColumn() {
		return (LastColumnType)getMixed().get(TablePackage.eINSTANCE.getDocumentRoot_LastColumn(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLastColumn(LastColumnType newLastColumn, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TablePackage.eINSTANCE.getDocumentRoot_LastColumn(), newLastColumn, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastColumn(LastColumnType newLastColumn) {
		((FeatureMap.Internal)getMixed()).set(TablePackage.eINSTANCE.getDocumentRoot_LastColumn(), newLastColumn);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LastRowType getLastRow() {
		return (LastRowType)getMixed().get(TablePackage.eINSTANCE.getDocumentRoot_LastRow(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLastRow(LastRowType newLastRow, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TablePackage.eINSTANCE.getDocumentRoot_LastRow(), newLastRow, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastRow(LastRowType newLastRow) {
		((FeatureMap.Internal)getMixed()).set(TablePackage.eINSTANCE.getDocumentRoot_LastRow(), newLastRow);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MovementType getMovement() {
		return (MovementType)getMixed().get(TablePackage.eINSTANCE.getDocumentRoot_Movement(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMovement(MovementType newMovement, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TablePackage.eINSTANCE.getDocumentRoot_Movement(), newMovement, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMovement(MovementType newMovement) {
		((FeatureMap.Internal)getMixed()).set(TablePackage.eINSTANCE.getDocumentRoot_Movement(), newMovement);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MovementCutOffType getMovementCutOff() {
		return (MovementCutOffType)getMixed().get(TablePackage.eINSTANCE.getDocumentRoot_MovementCutOff(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMovementCutOff(MovementCutOffType newMovementCutOff, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TablePackage.eINSTANCE.getDocumentRoot_MovementCutOff(), newMovementCutOff, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMovementCutOff(MovementCutOffType newMovementCutOff) {
		((FeatureMap.Internal)getMixed()).set(TablePackage.eINSTANCE.getDocumentRoot_MovementCutOff(), newMovementCutOff);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedExpressionType getNamedExpression() {
		return (NamedExpressionType)getMixed().get(TablePackage.eINSTANCE.getDocumentRoot_NamedExpression(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNamedExpression(NamedExpressionType newNamedExpression, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TablePackage.eINSTANCE.getDocumentRoot_NamedExpression(), newNamedExpression, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNamedExpression(NamedExpressionType newNamedExpression) {
		((FeatureMap.Internal)getMixed()).set(TablePackage.eINSTANCE.getDocumentRoot_NamedExpression(), newNamedExpression);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedExpressionsType getNamedExpressions() {
		return (NamedExpressionsType)getMixed().get(TablePackage.eINSTANCE.getDocumentRoot_NamedExpressions(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNamedExpressions(NamedExpressionsType newNamedExpressions, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TablePackage.eINSTANCE.getDocumentRoot_NamedExpressions(), newNamedExpressions, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNamedExpressions(NamedExpressionsType newNamedExpressions) {
		((FeatureMap.Internal)getMixed()).set(TablePackage.eINSTANCE.getDocumentRoot_NamedExpressions(), newNamedExpressions);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedRangeType getNamedRange() {
		return (NamedRangeType)getMixed().get(TablePackage.eINSTANCE.getDocumentRoot_NamedRange(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNamedRange(NamedRangeType newNamedRange, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TablePackage.eINSTANCE.getDocumentRoot_NamedRange(), newNamedRange, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNamedRange(NamedRangeType newNamedRange) {
		((FeatureMap.Internal)getMixed()).set(TablePackage.eINSTANCE.getDocumentRoot_NamedRange(), newNamedRange);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NullDateType getNullDate() {
		return (NullDateType)getMixed().get(TablePackage.eINSTANCE.getDocumentRoot_NullDate(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNullDate(NullDateType newNullDate, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TablePackage.eINSTANCE.getDocumentRoot_NullDate(), newNullDate, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNullDate(NullDateType newNullDate) {
		((FeatureMap.Internal)getMixed()).set(TablePackage.eINSTANCE.getDocumentRoot_NullDate(), newNullDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OddColumnsType getOddColumns() {
		return (OddColumnsType)getMixed().get(TablePackage.eINSTANCE.getDocumentRoot_OddColumns(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOddColumns(OddColumnsType newOddColumns, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TablePackage.eINSTANCE.getDocumentRoot_OddColumns(), newOddColumns, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOddColumns(OddColumnsType newOddColumns) {
		((FeatureMap.Internal)getMixed()).set(TablePackage.eINSTANCE.getDocumentRoot_OddColumns(), newOddColumns);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OddRowsType getOddRows() {
		return (OddRowsType)getMixed().get(TablePackage.eINSTANCE.getDocumentRoot_OddRows(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOddRows(OddRowsType newOddRows, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TablePackage.eINSTANCE.getDocumentRoot_OddRows(), newOddRows, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOddRows(OddRowsType newOddRows) {
		((FeatureMap.Internal)getMixed()).set(TablePackage.eINSTANCE.getDocumentRoot_OddRows(), newOddRows);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationType getOperation() {
		return (OperationType)getMixed().get(TablePackage.eINSTANCE.getDocumentRoot_Operation(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOperation(OperationType newOperation, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TablePackage.eINSTANCE.getDocumentRoot_Operation(), newOperation, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperation(OperationType newOperation) {
		((FeatureMap.Internal)getMixed()).set(TablePackage.eINSTANCE.getDocumentRoot_Operation(), newOperation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PreviousType getPrevious() {
		return (PreviousType)getMixed().get(TablePackage.eINSTANCE.getDocumentRoot_Previous(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrevious(PreviousType newPrevious, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TablePackage.eINSTANCE.getDocumentRoot_Previous(), newPrevious, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrevious(PreviousType newPrevious) {
		((FeatureMap.Internal)getMixed()).set(TablePackage.eINSTANCE.getDocumentRoot_Previous(), newPrevious);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScenarioType getScenario() {
		return (ScenarioType)getMixed().get(TablePackage.eINSTANCE.getDocumentRoot_Scenario(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScenario(ScenarioType newScenario, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TablePackage.eINSTANCE.getDocumentRoot_Scenario(), newScenario, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScenario(ScenarioType newScenario) {
		((FeatureMap.Internal)getMixed()).set(TablePackage.eINSTANCE.getDocumentRoot_Scenario(), newScenario);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShapesType getShapes() {
		return (ShapesType)getMixed().get(TablePackage.eINSTANCE.getDocumentRoot_Shapes(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetShapes(ShapesType newShapes, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TablePackage.eINSTANCE.getDocumentRoot_Shapes(), newShapes, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShapes(ShapesType newShapes) {
		((FeatureMap.Internal)getMixed()).set(TablePackage.eINSTANCE.getDocumentRoot_Shapes(), newShapes);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SortType getSort() {
		return (SortType)getMixed().get(TablePackage.eINSTANCE.getDocumentRoot_Sort(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSort(SortType newSort, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TablePackage.eINSTANCE.getDocumentRoot_Sort(), newSort, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSort(SortType newSort) {
		((FeatureMap.Internal)getMixed()).set(TablePackage.eINSTANCE.getDocumentRoot_Sort(), newSort);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SortByType getSortBy() {
		return (SortByType)getMixed().get(TablePackage.eINSTANCE.getDocumentRoot_SortBy(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSortBy(SortByType newSortBy, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TablePackage.eINSTANCE.getDocumentRoot_SortBy(), newSortBy, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSortBy(SortByType newSortBy) {
		((FeatureMap.Internal)getMixed()).set(TablePackage.eINSTANCE.getDocumentRoot_SortBy(), newSortBy);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SortGroupsType getSortGroups() {
		return (SortGroupsType)getMixed().get(TablePackage.eINSTANCE.getDocumentRoot_SortGroups(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSortGroups(SortGroupsType newSortGroups, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TablePackage.eINSTANCE.getDocumentRoot_SortGroups(), newSortGroups, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSortGroups(SortGroupsType newSortGroups) {
		((FeatureMap.Internal)getMixed()).set(TablePackage.eINSTANCE.getDocumentRoot_SortGroups(), newSortGroups);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourceCellRangeType getSourceCellRange() {
		return (SourceCellRangeType)getMixed().get(TablePackage.eINSTANCE.getDocumentRoot_SourceCellRange(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSourceCellRange(SourceCellRangeType newSourceCellRange, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TablePackage.eINSTANCE.getDocumentRoot_SourceCellRange(), newSourceCellRange, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceCellRange(SourceCellRangeType newSourceCellRange) {
		((FeatureMap.Internal)getMixed()).set(TablePackage.eINSTANCE.getDocumentRoot_SourceCellRange(), newSourceCellRange);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourceRangeAddressType getSourceRangeAddress() {
		return (SourceRangeAddressType)getMixed().get(TablePackage.eINSTANCE.getDocumentRoot_SourceRangeAddress(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSourceRangeAddress(SourceRangeAddressType newSourceRangeAddress, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TablePackage.eINSTANCE.getDocumentRoot_SourceRangeAddress(), newSourceRangeAddress, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceRangeAddress(SourceRangeAddressType newSourceRangeAddress) {
		((FeatureMap.Internal)getMixed()).set(TablePackage.eINSTANCE.getDocumentRoot_SourceRangeAddress(), newSourceRangeAddress);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourceServiceType getSourceService() {
		return (SourceServiceType)getMixed().get(TablePackage.eINSTANCE.getDocumentRoot_SourceService(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSourceService(SourceServiceType newSourceService, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TablePackage.eINSTANCE.getDocumentRoot_SourceService(), newSourceService, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceService(SourceServiceType newSourceService) {
		((FeatureMap.Internal)getMixed()).set(TablePackage.eINSTANCE.getDocumentRoot_SourceService(), newSourceService);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubtotalFieldType getSubtotalField() {
		return (SubtotalFieldType)getMixed().get(TablePackage.eINSTANCE.getDocumentRoot_SubtotalField(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubtotalField(SubtotalFieldType newSubtotalField, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TablePackage.eINSTANCE.getDocumentRoot_SubtotalField(), newSubtotalField, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubtotalField(SubtotalFieldType newSubtotalField) {
		((FeatureMap.Internal)getMixed()).set(TablePackage.eINSTANCE.getDocumentRoot_SubtotalField(), newSubtotalField);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubtotalRuleType getSubtotalRule() {
		return (SubtotalRuleType)getMixed().get(TablePackage.eINSTANCE.getDocumentRoot_SubtotalRule(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubtotalRule(SubtotalRuleType newSubtotalRule, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TablePackage.eINSTANCE.getDocumentRoot_SubtotalRule(), newSubtotalRule, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubtotalRule(SubtotalRuleType newSubtotalRule) {
		((FeatureMap.Internal)getMixed()).set(TablePackage.eINSTANCE.getDocumentRoot_SubtotalRule(), newSubtotalRule);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubtotalRulesType getSubtotalRules() {
		return (SubtotalRulesType)getMixed().get(TablePackage.eINSTANCE.getDocumentRoot_SubtotalRules(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubtotalRules(SubtotalRulesType newSubtotalRules, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TablePackage.eINSTANCE.getDocumentRoot_SubtotalRules(), newSubtotalRules, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubtotalRules(SubtotalRulesType newSubtotalRules) {
		((FeatureMap.Internal)getMixed()).set(TablePackage.eINSTANCE.getDocumentRoot_SubtotalRules(), newSubtotalRules);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TableType getTable() {
		return (TableType)getMixed().get(TablePackage.eINSTANCE.getDocumentRoot_Table(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTable(TableType newTable, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TablePackage.eINSTANCE.getDocumentRoot_Table(), newTable, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTable(TableType newTable) {
		((FeatureMap.Internal)getMixed()).set(TablePackage.eINSTANCE.getDocumentRoot_Table(), newTable);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TableCellType getTableCell() {
		return (TableCellType)getMixed().get(TablePackage.eINSTANCE.getDocumentRoot_TableCell(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTableCell(TableCellType newTableCell, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TablePackage.eINSTANCE.getDocumentRoot_TableCell(), newTableCell, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTableCell(TableCellType newTableCell) {
		((FeatureMap.Internal)getMixed()).set(TablePackage.eINSTANCE.getDocumentRoot_TableCell(), newTableCell);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TableColumnType getTableColumn() {
		return (TableColumnType)getMixed().get(TablePackage.eINSTANCE.getDocumentRoot_TableColumn(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTableColumn(TableColumnType newTableColumn, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TablePackage.eINSTANCE.getDocumentRoot_TableColumn(), newTableColumn, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTableColumn(TableColumnType newTableColumn) {
		((FeatureMap.Internal)getMixed()).set(TablePackage.eINSTANCE.getDocumentRoot_TableColumn(), newTableColumn);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TableColumnGroupType getTableColumnGroup() {
		return (TableColumnGroupType)getMixed().get(TablePackage.eINSTANCE.getDocumentRoot_TableColumnGroup(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTableColumnGroup(TableColumnGroupType newTableColumnGroup, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TablePackage.eINSTANCE.getDocumentRoot_TableColumnGroup(), newTableColumnGroup, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTableColumnGroup(TableColumnGroupType newTableColumnGroup) {
		((FeatureMap.Internal)getMixed()).set(TablePackage.eINSTANCE.getDocumentRoot_TableColumnGroup(), newTableColumnGroup);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TableColumnsType getTableColumns() {
		return (TableColumnsType)getMixed().get(TablePackage.eINSTANCE.getDocumentRoot_TableColumns(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTableColumns(TableColumnsType newTableColumns, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TablePackage.eINSTANCE.getDocumentRoot_TableColumns(), newTableColumns, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTableColumns(TableColumnsType newTableColumns) {
		((FeatureMap.Internal)getMixed()).set(TablePackage.eINSTANCE.getDocumentRoot_TableColumns(), newTableColumns);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TableHeaderColumnsType getTableHeaderColumns() {
		return (TableHeaderColumnsType)getMixed().get(TablePackage.eINSTANCE.getDocumentRoot_TableHeaderColumns(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTableHeaderColumns(TableHeaderColumnsType newTableHeaderColumns, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TablePackage.eINSTANCE.getDocumentRoot_TableHeaderColumns(), newTableHeaderColumns, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTableHeaderColumns(TableHeaderColumnsType newTableHeaderColumns) {
		((FeatureMap.Internal)getMixed()).set(TablePackage.eINSTANCE.getDocumentRoot_TableHeaderColumns(), newTableHeaderColumns);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TableHeaderRowsType getTableHeaderRows() {
		return (TableHeaderRowsType)getMixed().get(TablePackage.eINSTANCE.getDocumentRoot_TableHeaderRows(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTableHeaderRows(TableHeaderRowsType newTableHeaderRows, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TablePackage.eINSTANCE.getDocumentRoot_TableHeaderRows(), newTableHeaderRows, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTableHeaderRows(TableHeaderRowsType newTableHeaderRows) {
		((FeatureMap.Internal)getMixed()).set(TablePackage.eINSTANCE.getDocumentRoot_TableHeaderRows(), newTableHeaderRows);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TableRowType getTableRow() {
		return (TableRowType)getMixed().get(TablePackage.eINSTANCE.getDocumentRoot_TableRow(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTableRow(TableRowType newTableRow, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TablePackage.eINSTANCE.getDocumentRoot_TableRow(), newTableRow, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTableRow(TableRowType newTableRow) {
		((FeatureMap.Internal)getMixed()).set(TablePackage.eINSTANCE.getDocumentRoot_TableRow(), newTableRow);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TableRowGroupType getTableRowGroup() {
		return (TableRowGroupType)getMixed().get(TablePackage.eINSTANCE.getDocumentRoot_TableRowGroup(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTableRowGroup(TableRowGroupType newTableRowGroup, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TablePackage.eINSTANCE.getDocumentRoot_TableRowGroup(), newTableRowGroup, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTableRowGroup(TableRowGroupType newTableRowGroup) {
		((FeatureMap.Internal)getMixed()).set(TablePackage.eINSTANCE.getDocumentRoot_TableRowGroup(), newTableRowGroup);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TableRowsType getTableRows() {
		return (TableRowsType)getMixed().get(TablePackage.eINSTANCE.getDocumentRoot_TableRows(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTableRows(TableRowsType newTableRows, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TablePackage.eINSTANCE.getDocumentRoot_TableRows(), newTableRows, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTableRows(TableRowsType newTableRows) {
		((FeatureMap.Internal)getMixed()).set(TablePackage.eINSTANCE.getDocumentRoot_TableRows(), newTableRows);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TableSourceType getTableSource() {
		return (TableSourceType)getMixed().get(TablePackage.eINSTANCE.getDocumentRoot_TableSource(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTableSource(TableSourceType newTableSource, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TablePackage.eINSTANCE.getDocumentRoot_TableSource(), newTableSource, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTableSource(TableSourceType newTableSource) {
		((FeatureMap.Internal)getMixed()).set(TablePackage.eINSTANCE.getDocumentRoot_TableSource(), newTableSource);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TableTemplateType getTableTemplate() {
		return (TableTemplateType)getMixed().get(TablePackage.eINSTANCE.getDocumentRoot_TableTemplate(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTableTemplate(TableTemplateType newTableTemplate, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TablePackage.eINSTANCE.getDocumentRoot_TableTemplate(), newTableTemplate, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTableTemplate(TableTemplateType newTableTemplate) {
		((FeatureMap.Internal)getMixed()).set(TablePackage.eINSTANCE.getDocumentRoot_TableTemplate(), newTableTemplate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TargetRangeAddressType getTargetRangeAddress() {
		return (TargetRangeAddressType)getMixed().get(TablePackage.eINSTANCE.getDocumentRoot_TargetRangeAddress(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTargetRangeAddress(TargetRangeAddressType newTargetRangeAddress, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TablePackage.eINSTANCE.getDocumentRoot_TargetRangeAddress(), newTargetRangeAddress, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetRangeAddress(TargetRangeAddressType newTargetRangeAddress) {
		((FeatureMap.Internal)getMixed()).set(TablePackage.eINSTANCE.getDocumentRoot_TargetRangeAddress(), newTargetRangeAddress);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrackedChangesType getTrackedChanges() {
		return (TrackedChangesType)getMixed().get(TablePackage.eINSTANCE.getDocumentRoot_TrackedChanges(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTrackedChanges(TrackedChangesType newTrackedChanges, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TablePackage.eINSTANCE.getDocumentRoot_TrackedChanges(), newTrackedChanges, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrackedChanges(TrackedChangesType newTrackedChanges) {
		((FeatureMap.Internal)getMixed()).set(TablePackage.eINSTANCE.getDocumentRoot_TrackedChanges(), newTrackedChanges);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AcceptanceStateType getAcceptanceState() {
		return acceptanceState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAcceptanceState(AcceptanceStateType newAcceptanceState) {
		AcceptanceStateType oldAcceptanceState = acceptanceState;
		acceptanceState = newAcceptanceState == null ? ACCEPTANCE_STATE_EDEFAULT : newAcceptanceState;
		boolean oldAcceptanceStateESet = acceptanceStateESet;
		acceptanceStateESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DOCUMENT_ROOT__ACCEPTANCE_STATE, oldAcceptanceState, acceptanceState, !oldAcceptanceStateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAcceptanceState() {
		AcceptanceStateType oldAcceptanceState = acceptanceState;
		boolean oldAcceptanceStateESet = acceptanceStateESet;
		acceptanceState = ACCEPTANCE_STATE_EDEFAULT;
		acceptanceStateESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TablePackage.DOCUMENT_ROOT__ACCEPTANCE_STATE, oldAcceptanceState, ACCEPTANCE_STATE_EDEFAULT, oldAcceptanceStateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAcceptanceState() {
		return acceptanceStateESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getAddEmptyLines() {
		return addEmptyLines;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddEmptyLines(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newAddEmptyLines) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldAddEmptyLines = addEmptyLines;
		addEmptyLines = newAddEmptyLines == null ? ADD_EMPTY_LINES_EDEFAULT : newAddEmptyLines;
		boolean oldAddEmptyLinesESet = addEmptyLinesESet;
		addEmptyLinesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DOCUMENT_ROOT__ADD_EMPTY_LINES, oldAddEmptyLines, addEmptyLines, !oldAddEmptyLinesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAddEmptyLines() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldAddEmptyLines = addEmptyLines;
		boolean oldAddEmptyLinesESet = addEmptyLinesESet;
		addEmptyLines = ADD_EMPTY_LINES_EDEFAULT;
		addEmptyLinesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TablePackage.DOCUMENT_ROOT__ADD_EMPTY_LINES, oldAddEmptyLines, ADD_EMPTY_LINES_EDEFAULT, oldAddEmptyLinesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAddEmptyLines() {
		return addEmptyLinesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAlgorithm() {
		return algorithm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlgorithm(String newAlgorithm) {
		String oldAlgorithm = algorithm;
		algorithm = newAlgorithm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DOCUMENT_ROOT__ALGORITHM, oldAlgorithm, algorithm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlignType getAlign() {
		return align;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlign(AlignType newAlign) {
		AlignType oldAlign = align;
		align = newAlign == null ? ALIGN_EDEFAULT : newAlign;
		boolean oldAlignESet = alignESet;
		alignESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DOCUMENT_ROOT__ALIGN, oldAlign, align, !oldAlignESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAlign() {
		AlignType oldAlign = align;
		boolean oldAlignESet = alignESet;
		align = ALIGN_EDEFAULT;
		alignESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TablePackage.DOCUMENT_ROOT__ALIGN, oldAlign, ALIGN_EDEFAULT, oldAlignESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAlign() {
		return alignESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getAllowEmptyCell() {
		return allowEmptyCell;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllowEmptyCell(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newAllowEmptyCell) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldAllowEmptyCell = allowEmptyCell;
		allowEmptyCell = newAllowEmptyCell == null ? ALLOW_EMPTY_CELL_EDEFAULT : newAllowEmptyCell;
		boolean oldAllowEmptyCellESet = allowEmptyCellESet;
		allowEmptyCellESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DOCUMENT_ROOT__ALLOW_EMPTY_CELL, oldAllowEmptyCell, allowEmptyCell, !oldAllowEmptyCellESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAllowEmptyCell() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldAllowEmptyCell = allowEmptyCell;
		boolean oldAllowEmptyCellESet = allowEmptyCellESet;
		allowEmptyCell = ALLOW_EMPTY_CELL_EDEFAULT;
		allowEmptyCellESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TablePackage.DOCUMENT_ROOT__ALLOW_EMPTY_CELL, oldAllowEmptyCell, ALLOW_EMPTY_CELL_EDEFAULT, oldAllowEmptyCellESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAllowEmptyCell() {
		return allowEmptyCellESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getApplicationData() {
		return applicationData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApplicationData(String newApplicationData) {
		String oldApplicationData = applicationData;
		applicationData = newApplicationData;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DOCUMENT_ROOT__APPLICATION_DATA, oldApplicationData, applicationData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getAutomaticFindLabels() {
		return automaticFindLabels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAutomaticFindLabels(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newAutomaticFindLabels) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldAutomaticFindLabels = automaticFindLabels;
		automaticFindLabels = newAutomaticFindLabels == null ? AUTOMATIC_FIND_LABELS_EDEFAULT : newAutomaticFindLabels;
		boolean oldAutomaticFindLabelsESet = automaticFindLabelsESet;
		automaticFindLabelsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DOCUMENT_ROOT__AUTOMATIC_FIND_LABELS, oldAutomaticFindLabels, automaticFindLabels, !oldAutomaticFindLabelsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAutomaticFindLabels() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldAutomaticFindLabels = automaticFindLabels;
		boolean oldAutomaticFindLabelsESet = automaticFindLabelsESet;
		automaticFindLabels = AUTOMATIC_FIND_LABELS_EDEFAULT;
		automaticFindLabelsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TablePackage.DOCUMENT_ROOT__AUTOMATIC_FIND_LABELS, oldAutomaticFindLabels, AUTOMATIC_FIND_LABELS_EDEFAULT, oldAutomaticFindLabelsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAutomaticFindLabels() {
		return automaticFindLabelsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBaseCellAddress() {
		return baseCellAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBaseCellAddress(String newBaseCellAddress) {
		String oldBaseCellAddress = baseCellAddress;
		baseCellAddress = newBaseCellAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DOCUMENT_ROOT__BASE_CELL_ADDRESS, oldBaseCellAddress, baseCellAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getBindStylesToContent() {
		return bindStylesToContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBindStylesToContent(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newBindStylesToContent) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldBindStylesToContent = bindStylesToContent;
		bindStylesToContent = newBindStylesToContent == null ? BIND_STYLES_TO_CONTENT_EDEFAULT : newBindStylesToContent;
		boolean oldBindStylesToContentESet = bindStylesToContentESet;
		bindStylesToContentESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DOCUMENT_ROOT__BIND_STYLES_TO_CONTENT, oldBindStylesToContent, bindStylesToContent, !oldBindStylesToContentESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetBindStylesToContent() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldBindStylesToContent = bindStylesToContent;
		boolean oldBindStylesToContentESet = bindStylesToContentESet;
		bindStylesToContent = BIND_STYLES_TO_CONTENT_EDEFAULT;
		bindStylesToContentESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TablePackage.DOCUMENT_ROOT__BIND_STYLES_TO_CONTENT, oldBindStylesToContent, BIND_STYLES_TO_CONTENT_EDEFAULT, oldBindStylesToContentESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetBindStylesToContent() {
		return bindStylesToContentESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBorderColor() {
		return borderColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBorderColor(String newBorderColor) {
		String oldBorderColor = borderColor;
		borderColor = newBorderColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DOCUMENT_ROOT__BORDER_COLOR, oldBorderColor, borderColor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BorderModelType getBorderModel() {
		return borderModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBorderModel(BorderModelType newBorderModel) {
		BorderModelType oldBorderModel = borderModel;
		borderModel = newBorderModel == null ? BORDER_MODEL_EDEFAULT : newBorderModel;
		boolean oldBorderModelESet = borderModelESet;
		borderModelESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DOCUMENT_ROOT__BORDER_MODEL, oldBorderModel, borderModel, !oldBorderModelESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetBorderModel() {
		BorderModelType oldBorderModel = borderModel;
		boolean oldBorderModelESet = borderModelESet;
		borderModel = BORDER_MODEL_EDEFAULT;
		borderModelESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TablePackage.DOCUMENT_ROOT__BORDER_MODEL, oldBorderModel, BORDER_MODEL_EDEFAULT, oldBorderModelESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetBorderModel() {
		return borderModelESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getButtons() {
		return buttons;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setButtons(String newButtons) {
		String oldButtons = buttons;
		buttons = newButtons;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DOCUMENT_ROOT__BUTTONS, oldButtons, buttons));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCellAddress1() {
		return cellAddress1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCellAddress1(String newCellAddress1) {
		String oldCellAddress1 = cellAddress1;
		cellAddress1 = newCellAddress1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DOCUMENT_ROOT__CELL_ADDRESS1, oldCellAddress1, cellAddress1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCellRange() {
		return cellRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCellRange(String newCellRange) {
		String oldCellRange = cellRange;
		cellRange = newCellRange;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DOCUMENT_ROOT__CELL_RANGE, oldCellRange, cellRange));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DOCUMENT_ROOT__CELL_RANGE_ADDRESS, oldCellRangeAddress, cellRangeAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getColumn() {
		return column;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColumn(BigInteger newColumn) {
		BigInteger oldColumn = column;
		column = newColumn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DOCUMENT_ROOT__COLUMN, oldColumn, column));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getComment() {
		return comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComment(String newComment) {
		String oldComment = comment;
		comment = newComment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DOCUMENT_ROOT__COMMENT, oldComment, comment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCondition() {
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCondition(String newCondition) {
		String oldCondition = condition;
		condition = newCondition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DOCUMENT_ROOT__CONDITION, oldCondition, condition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionSourceType getConditionSource() {
		return conditionSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConditionSource(ConditionSourceType newConditionSource) {
		ConditionSourceType oldConditionSource = conditionSource;
		conditionSource = newConditionSource == null ? CONDITION_SOURCE_EDEFAULT : newConditionSource;
		boolean oldConditionSourceESet = conditionSourceESet;
		conditionSourceESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DOCUMENT_ROOT__CONDITION_SOURCE, oldConditionSource, conditionSource, !oldConditionSourceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetConditionSource() {
		ConditionSourceType oldConditionSource = conditionSource;
		boolean oldConditionSourceESet = conditionSourceESet;
		conditionSource = CONDITION_SOURCE_EDEFAULT;
		conditionSourceESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TablePackage.DOCUMENT_ROOT__CONDITION_SOURCE, oldConditionSource, CONDITION_SOURCE_EDEFAULT, oldConditionSourceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetConditionSource() {
		return conditionSourceESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConditionSourceRangeAddress() {
		return conditionSourceRangeAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConditionSourceRangeAddress(String newConditionSourceRangeAddress) {
		String oldConditionSourceRangeAddress = conditionSourceRangeAddress;
		conditionSourceRangeAddress = newConditionSourceRangeAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DOCUMENT_ROOT__CONDITION_SOURCE_RANGE_ADDRESS, oldConditionSourceRangeAddress, conditionSourceRangeAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getContainsError() {
		return containsError;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainsError(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newContainsError) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldContainsError = containsError;
		containsError = newContainsError == null ? CONTAINS_ERROR_EDEFAULT : newContainsError;
		boolean oldContainsErrorESet = containsErrorESet;
		containsErrorESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DOCUMENT_ROOT__CONTAINS_ERROR, oldContainsError, containsError, !oldContainsErrorESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetContainsError() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldContainsError = containsError;
		boolean oldContainsErrorESet = containsErrorESet;
		containsError = CONTAINS_ERROR_EDEFAULT;
		containsErrorESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TablePackage.DOCUMENT_ROOT__CONTAINS_ERROR, oldContainsError, CONTAINS_ERROR_EDEFAULT, oldContainsErrorESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetContainsError() {
		return containsErrorESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getContainsHeader() {
		return containsHeader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainsHeader(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newContainsHeader) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldContainsHeader = containsHeader;
		containsHeader = newContainsHeader == null ? CONTAINS_HEADER_EDEFAULT : newContainsHeader;
		boolean oldContainsHeaderESet = containsHeaderESet;
		containsHeaderESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DOCUMENT_ROOT__CONTAINS_HEADER, oldContainsHeader, containsHeader, !oldContainsHeaderESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetContainsHeader() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldContainsHeader = containsHeader;
		boolean oldContainsHeaderESet = containsHeaderESet;
		containsHeader = CONTAINS_HEADER_EDEFAULT;
		containsHeaderESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TablePackage.DOCUMENT_ROOT__CONTAINS_HEADER, oldContainsHeader, CONTAINS_HEADER_EDEFAULT, oldContainsHeaderESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetContainsHeader() {
		return containsHeaderESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getContentValidationName() {
		return contentValidationName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContentValidationName(String newContentValidationName) {
		String oldContentValidationName = contentValidationName;
		contentValidationName = newContentValidationName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DOCUMENT_ROOT__CONTENT_VALIDATION_NAME, oldContentValidationName, contentValidationName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getCopyBack() {
		return copyBack;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCopyBack(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newCopyBack) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldCopyBack = copyBack;
		copyBack = newCopyBack == null ? COPY_BACK_EDEFAULT : newCopyBack;
		boolean oldCopyBackESet = copyBackESet;
		copyBackESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DOCUMENT_ROOT__COPY_BACK, oldCopyBack, copyBack, !oldCopyBackESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCopyBack() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldCopyBack = copyBack;
		boolean oldCopyBackESet = copyBackESet;
		copyBack = COPY_BACK_EDEFAULT;
		copyBackESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TablePackage.DOCUMENT_ROOT__COPY_BACK, oldCopyBack, COPY_BACK_EDEFAULT, oldCopyBackESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCopyBack() {
		return copyBackESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getCopyFormulas() {
		return copyFormulas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCopyFormulas(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newCopyFormulas) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldCopyFormulas = copyFormulas;
		copyFormulas = newCopyFormulas == null ? COPY_FORMULAS_EDEFAULT : newCopyFormulas;
		boolean oldCopyFormulasESet = copyFormulasESet;
		copyFormulasESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DOCUMENT_ROOT__COPY_FORMULAS, oldCopyFormulas, copyFormulas, !oldCopyFormulasESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCopyFormulas() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldCopyFormulas = copyFormulas;
		boolean oldCopyFormulasESet = copyFormulasESet;
		copyFormulas = COPY_FORMULAS_EDEFAULT;
		copyFormulasESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TablePackage.DOCUMENT_ROOT__COPY_FORMULAS, oldCopyFormulas, COPY_FORMULAS_EDEFAULT, oldCopyFormulasESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCopyFormulas() {
		return copyFormulasESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getCopyStyles() {
		return copyStyles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCopyStyles(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newCopyStyles) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldCopyStyles = copyStyles;
		copyStyles = newCopyStyles == null ? COPY_STYLES_EDEFAULT : newCopyStyles;
		boolean oldCopyStylesESet = copyStylesESet;
		copyStylesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DOCUMENT_ROOT__COPY_STYLES, oldCopyStyles, copyStyles, !oldCopyStylesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCopyStyles() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldCopyStyles = copyStyles;
		boolean oldCopyStylesESet = copyStylesESet;
		copyStyles = COPY_STYLES_EDEFAULT;
		copyStylesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TablePackage.DOCUMENT_ROOT__COPY_STYLES, oldCopyStyles, COPY_STYLES_EDEFAULT, oldCopyStylesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCopyStyles() {
		return copyStylesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getCount() {
		return count;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCount(BigInteger newCount) {
		BigInteger oldCount = count;
		count = newCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DOCUMENT_ROOT__COUNT, oldCount, count));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCountry(String newCountry) {
		String oldCountry = country;
		country = newCountry;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DOCUMENT_ROOT__COUNTRY, oldCountry, country));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDatabaseName() {
		return databaseName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatabaseName(String newDatabaseName) {
		String oldDatabaseName = databaseName;
		databaseName = newDatabaseName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DOCUMENT_ROOT__DATABASE_NAME, oldDatabaseName, databaseName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDatabaseTableName() {
		return databaseTableName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatabaseTableName(String newDatabaseTableName) {
		String oldDatabaseTableName = databaseTableName;
		databaseTableName = newDatabaseTableName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DOCUMENT_ROOT__DATABASE_TABLE_NAME, oldDatabaseTableName, databaseTableName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDataCellRangeAddress() {
		return dataCellRangeAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataCellRangeAddress(String newDataCellRangeAddress) {
		String oldDataCellRangeAddress = dataCellRangeAddress;
		dataCellRangeAddress = newDataCellRangeAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DOCUMENT_ROOT__DATA_CELL_RANGE_ADDRESS, oldDataCellRangeAddress, dataCellRangeAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDataField() {
		return dataField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataField(String newDataField) {
		String oldDataField = dataField;
		dataField = newDataField;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DOCUMENT_ROOT__DATA_FIELD, oldDataField, dataField));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getDateEnd() {
		return dateEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateEnd(Object newDateEnd) {
		Object oldDateEnd = dateEnd;
		dateEnd = newDateEnd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DOCUMENT_ROOT__DATE_END, oldDateEnd, dateEnd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getDateStart() {
		return dateStart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateStart(Object newDateStart) {
		Object oldDateStart = dateStart;
		dateStart = newDateStart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DOCUMENT_ROOT__DATE_START, oldDateStart, dateStart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDefaultCellStyleName() {
		return defaultCellStyleName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultCellStyleName(String newDefaultCellStyleName) {
		String oldDefaultCellStyleName = defaultCellStyleName;
		defaultCellStyleName = newDefaultCellStyleName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DOCUMENT_ROOT__DEFAULT_CELL_STYLE_NAME, oldDefaultCellStyleName, defaultCellStyleName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DirectionType getDirection() {
		return direction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDirection(DirectionType newDirection) {
		DirectionType oldDirection = direction;
		direction = newDirection == null ? DIRECTION_EDEFAULT : newDirection;
		boolean oldDirectionESet = directionESet;
		directionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DOCUMENT_ROOT__DIRECTION, oldDirection, direction, !oldDirectionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDirection() {
		DirectionType oldDirection = direction;
		boolean oldDirectionESet = directionESet;
		direction = DIRECTION_EDEFAULT;
		directionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TablePackage.DOCUMENT_ROOT__DIRECTION, oldDirection, DIRECTION_EDEFAULT, oldDirectionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDirection() {
		return directionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getDisplay() {
		return display;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisplay(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newDisplay) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldDisplay = display;
		display = newDisplay == null ? DISPLAY_EDEFAULT : newDisplay;
		boolean oldDisplayESet = displayESet;
		displayESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DOCUMENT_ROOT__DISPLAY, oldDisplay, display, !oldDisplayESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDisplay() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldDisplay = display;
		boolean oldDisplayESet = displayESet;
		display = DISPLAY_EDEFAULT;
		displayESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TablePackage.DOCUMENT_ROOT__DISPLAY, oldDisplay, DISPLAY_EDEFAULT, oldDisplayESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDisplay() {
		return displayESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getDisplayBorder() {
		return displayBorder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisplayBorder(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newDisplayBorder) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldDisplayBorder = displayBorder;
		displayBorder = newDisplayBorder == null ? DISPLAY_BORDER_EDEFAULT : newDisplayBorder;
		boolean oldDisplayBorderESet = displayBorderESet;
		displayBorderESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DOCUMENT_ROOT__DISPLAY_BORDER, oldDisplayBorder, displayBorder, !oldDisplayBorderESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDisplayBorder() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldDisplayBorder = displayBorder;
		boolean oldDisplayBorderESet = displayBorderESet;
		displayBorder = DISPLAY_BORDER_EDEFAULT;
		displayBorderESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TablePackage.DOCUMENT_ROOT__DISPLAY_BORDER, oldDisplayBorder, DISPLAY_BORDER_EDEFAULT, oldDisplayBorderESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDisplayBorder() {
		return displayBorderESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getDisplayDuplicates() {
		return displayDuplicates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisplayDuplicates(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newDisplayDuplicates) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldDisplayDuplicates = displayDuplicates;
		displayDuplicates = newDisplayDuplicates == null ? DISPLAY_DUPLICATES_EDEFAULT : newDisplayDuplicates;
		boolean oldDisplayDuplicatesESet = displayDuplicatesESet;
		displayDuplicatesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DOCUMENT_ROOT__DISPLAY_DUPLICATES, oldDisplayDuplicates, displayDuplicates, !oldDisplayDuplicatesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDisplayDuplicates() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldDisplayDuplicates = displayDuplicates;
		boolean oldDisplayDuplicatesESet = displayDuplicatesESet;
		displayDuplicates = DISPLAY_DUPLICATES_EDEFAULT;
		displayDuplicatesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TablePackage.DOCUMENT_ROOT__DISPLAY_DUPLICATES, oldDisplayDuplicates, DISPLAY_DUPLICATES_EDEFAULT, oldDisplayDuplicatesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDisplayDuplicates() {
		return displayDuplicatesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getDisplayFilterButtons() {
		return displayFilterButtons;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisplayFilterButtons(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newDisplayFilterButtons) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldDisplayFilterButtons = displayFilterButtons;
		displayFilterButtons = newDisplayFilterButtons == null ? DISPLAY_FILTER_BUTTONS_EDEFAULT : newDisplayFilterButtons;
		boolean oldDisplayFilterButtonsESet = displayFilterButtonsESet;
		displayFilterButtonsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DOCUMENT_ROOT__DISPLAY_FILTER_BUTTONS, oldDisplayFilterButtons, displayFilterButtons, !oldDisplayFilterButtonsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDisplayFilterButtons() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldDisplayFilterButtons = displayFilterButtons;
		boolean oldDisplayFilterButtonsESet = displayFilterButtonsESet;
		displayFilterButtons = DISPLAY_FILTER_BUTTONS_EDEFAULT;
		displayFilterButtonsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TablePackage.DOCUMENT_ROOT__DISPLAY_FILTER_BUTTONS, oldDisplayFilterButtons, DISPLAY_FILTER_BUTTONS_EDEFAULT, oldDisplayFilterButtonsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDisplayFilterButtons() {
		return displayFilterButtonsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DisplayListType getDisplayList() {
		return displayList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisplayList(DisplayListType newDisplayList) {
		DisplayListType oldDisplayList = displayList;
		displayList = newDisplayList == null ? DISPLAY_LIST_EDEFAULT : newDisplayList;
		boolean oldDisplayListESet = displayListESet;
		displayListESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DOCUMENT_ROOT__DISPLAY_LIST, oldDisplayList, displayList, !oldDisplayListESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDisplayList() {
		DisplayListType oldDisplayList = displayList;
		boolean oldDisplayListESet = displayListESet;
		displayList = DISPLAY_LIST_EDEFAULT;
		displayListESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TablePackage.DOCUMENT_ROOT__DISPLAY_LIST, oldDisplayList, DISPLAY_LIST_EDEFAULT, oldDisplayListESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDisplayList() {
		return displayListESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DisplayMemberModeType getDisplayMemberMode() {
		return displayMemberMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisplayMemberMode(DisplayMemberModeType newDisplayMemberMode) {
		DisplayMemberModeType oldDisplayMemberMode = displayMemberMode;
		displayMemberMode = newDisplayMemberMode == null ? DISPLAY_MEMBER_MODE_EDEFAULT : newDisplayMemberMode;
		boolean oldDisplayMemberModeESet = displayMemberModeESet;
		displayMemberModeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DOCUMENT_ROOT__DISPLAY_MEMBER_MODE, oldDisplayMemberMode, displayMemberMode, !oldDisplayMemberModeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDisplayMemberMode() {
		DisplayMemberModeType oldDisplayMemberMode = displayMemberMode;
		boolean oldDisplayMemberModeESet = displayMemberModeESet;
		displayMemberMode = DISPLAY_MEMBER_MODE_EDEFAULT;
		displayMemberModeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TablePackage.DOCUMENT_ROOT__DISPLAY_MEMBER_MODE, oldDisplayMemberMode, DISPLAY_MEMBER_MODE_EDEFAULT, oldDisplayMemberModeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDisplayMemberMode() {
		return displayMemberModeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getDrillDownOnDoubleClick() {
		return drillDownOnDoubleClick;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDrillDownOnDoubleClick(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newDrillDownOnDoubleClick) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldDrillDownOnDoubleClick = drillDownOnDoubleClick;
		drillDownOnDoubleClick = newDrillDownOnDoubleClick == null ? DRILL_DOWN_ON_DOUBLE_CLICK_EDEFAULT : newDrillDownOnDoubleClick;
		boolean oldDrillDownOnDoubleClickESet = drillDownOnDoubleClickESet;
		drillDownOnDoubleClickESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DOCUMENT_ROOT__DRILL_DOWN_ON_DOUBLE_CLICK, oldDrillDownOnDoubleClick, drillDownOnDoubleClick, !oldDrillDownOnDoubleClickESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDrillDownOnDoubleClick() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldDrillDownOnDoubleClick = drillDownOnDoubleClick;
		boolean oldDrillDownOnDoubleClickESet = drillDownOnDoubleClickESet;
		drillDownOnDoubleClick = DRILL_DOWN_ON_DOUBLE_CLICK_EDEFAULT;
		drillDownOnDoubleClickESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TablePackage.DOCUMENT_ROOT__DRILL_DOWN_ON_DOUBLE_CLICK, oldDrillDownOnDoubleClick, DRILL_DOWN_ON_DOUBLE_CLICK_EDEFAULT, oldDrillDownOnDoubleClickESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDrillDownOnDoubleClick() {
		return drillDownOnDoubleClickESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getEnabled() {
		return enabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnabled(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newEnabled) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldEnabled = enabled;
		enabled = newEnabled == null ? ENABLED_EDEFAULT : newEnabled;
		boolean oldEnabledESet = enabledESet;
		enabledESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DOCUMENT_ROOT__ENABLED, oldEnabled, enabled, !oldEnabledESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEnabled() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldEnabled = enabled;
		boolean oldEnabledESet = enabledESet;
		enabled = ENABLED_EDEFAULT;
		enabledESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TablePackage.DOCUMENT_ROOT__ENABLED, oldEnabled, ENABLED_EDEFAULT, oldEnabledESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEnabled() {
		return enabledESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getEnd() {
		return end;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnd(Object newEnd) {
		Object oldEnd = end;
		end = newEnd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DOCUMENT_ROOT__END, oldEnd, end));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEndCellAddress() {
		return endCellAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndCellAddress(String newEndCellAddress) {
		String oldEndCellAddress = endCellAddress;
		endCellAddress = newEndCellAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DOCUMENT_ROOT__END_CELL_ADDRESS, oldEndCellAddress, endCellAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getEndColumn() {
		return endColumn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndColumn(BigInteger newEndColumn) {
		BigInteger oldEndColumn = endColumn;
		endColumn = newEndColumn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DOCUMENT_ROOT__END_COLUMN, oldEndColumn, endColumn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getEndPosition() {
		return endPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndPosition(BigInteger newEndPosition) {
		BigInteger oldEndPosition = endPosition;
		endPosition = newEndPosition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DOCUMENT_ROOT__END_POSITION, oldEndPosition, endPosition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getEndRow() {
		return endRow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndRow(BigInteger newEndRow) {
		BigInteger oldEndRow = endRow;
		endRow = newEndRow;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DOCUMENT_ROOT__END_ROW, oldEndRow, endRow));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getEndTable() {
		return endTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndTable(BigInteger newEndTable) {
		BigInteger oldEndTable = endTable;
		endTable = newEndTable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DOCUMENT_ROOT__END_TABLE, oldEndTable, endTable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEndX() {
		return endX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndX(String newEndX) {
		String oldEndX = endX;
		endX = newEndX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DOCUMENT_ROOT__END_X, oldEndX, endX));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEndY() {
		return endY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndY(String newEndY) {
		String oldEndY = endY;
		endY = newEndY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DOCUMENT_ROOT__END_Y, oldEndY, endY));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExpression() {
		return expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpression(String newExpression) {
		String oldExpression = expression;
		expression = newExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DOCUMENT_ROOT__EXPRESSION, oldExpression, expression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFieldName() {
		return fieldName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFieldName(String newFieldName) {
		String oldFieldName = fieldName;
		fieldName = newFieldName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DOCUMENT_ROOT__FIELD_NAME, oldFieldName, fieldName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getFieldNumber() {
		return fieldNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFieldNumber(BigInteger newFieldNumber) {
		BigInteger oldFieldNumber = fieldNumber;
		fieldNumber = newFieldNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DOCUMENT_ROOT__FIELD_NUMBER, oldFieldNumber, fieldNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFilterName() {
		return filterName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFilterName(String newFilterName) {
		String oldFilterName = filterName;
		filterName = newFilterName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DOCUMENT_ROOT__FILTER_NAME, oldFilterName, filterName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFilterOptions() {
		return filterOptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFilterOptions(String newFilterOptions) {
		String oldFilterOptions = filterOptions;
		filterOptions = newFilterOptions;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DOCUMENT_ROOT__FILTER_OPTIONS, oldFilterOptions, filterOptions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFormula() {
		return formula;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFormula(String newFormula) {
		String oldFormula = formula;
		formula = newFormula;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DOCUMENT_ROOT__FORMULA, oldFormula, formula));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getFunction() {
		return function;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFunction(Object newFunction) {
		Object oldFunction = function;
		function = newFunction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DOCUMENT_ROOT__FUNCTION, oldFunction, function));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GrandTotalType getGrandTotal() {
		return grandTotal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGrandTotal(GrandTotalType newGrandTotal) {
		GrandTotalType oldGrandTotal = grandTotal;
		grandTotal = newGrandTotal == null ? GRAND_TOTAL_EDEFAULT : newGrandTotal;
		boolean oldGrandTotalESet = grandTotalESet;
		grandTotalESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DOCUMENT_ROOT__GRAND_TOTAL, oldGrandTotal, grandTotal, !oldGrandTotalESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetGrandTotal() {
		GrandTotalType oldGrandTotal = grandTotal;
		boolean oldGrandTotalESet = grandTotalESet;
		grandTotal = GRAND_TOTAL_EDEFAULT;
		grandTotalESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TablePackage.DOCUMENT_ROOT__GRAND_TOTAL, oldGrandTotal, GRAND_TOTAL_EDEFAULT, oldGrandTotalESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetGrandTotal() {
		return grandTotalESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getGroupByFieldNumber() {
		return groupByFieldNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGroupByFieldNumber(BigInteger newGroupByFieldNumber) {
		BigInteger oldGroupByFieldNumber = groupByFieldNumber;
		groupByFieldNumber = newGroupByFieldNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DOCUMENT_ROOT__GROUP_BY_FIELD_NUMBER, oldGroupByFieldNumber, groupByFieldNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroupedByType getGroupedBy() {
		return groupedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGroupedBy(GroupedByType newGroupedBy) {
		GroupedByType oldGroupedBy = groupedBy;
		groupedBy = newGroupedBy == null ? GROUPED_BY_EDEFAULT : newGroupedBy;
		boolean oldGroupedByESet = groupedByESet;
		groupedByESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DOCUMENT_ROOT__GROUPED_BY, oldGroupedBy, groupedBy, !oldGroupedByESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetGroupedBy() {
		GroupedByType oldGroupedBy = groupedBy;
		boolean oldGroupedByESet = groupedByESet;
		groupedBy = GROUPED_BY_EDEFAULT;
		groupedByESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TablePackage.DOCUMENT_ROOT__GROUPED_BY, oldGroupedBy, GROUPED_BY_EDEFAULT, oldGroupedByESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetGroupedBy() {
		return groupedByESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getHasPersistentData() {
		return hasPersistentData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasPersistentData(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newHasPersistentData) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldHasPersistentData = hasPersistentData;
		hasPersistentData = newHasPersistentData == null ? HAS_PERSISTENT_DATA_EDEFAULT : newHasPersistentData;
		boolean oldHasPersistentDataESet = hasPersistentDataESet;
		hasPersistentDataESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DOCUMENT_ROOT__HAS_PERSISTENT_DATA, oldHasPersistentData, hasPersistentData, !oldHasPersistentDataESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetHasPersistentData() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldHasPersistentData = hasPersistentData;
		boolean oldHasPersistentDataESet = hasPersistentDataESet;
		hasPersistentData = HAS_PERSISTENT_DATA_EDEFAULT;
		hasPersistentDataESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TablePackage.DOCUMENT_ROOT__HAS_PERSISTENT_DATA, oldHasPersistentData, HAS_PERSISTENT_DATA_EDEFAULT, oldHasPersistentDataESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetHasPersistentData() {
		return hasPersistentDataESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DOCUMENT_ROOT__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getIdentifyCategories() {
		return identifyCategories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdentifyCategories(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newIdentifyCategories) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldIdentifyCategories = identifyCategories;
		identifyCategories = newIdentifyCategories == null ? IDENTIFY_CATEGORIES_EDEFAULT : newIdentifyCategories;
		boolean oldIdentifyCategoriesESet = identifyCategoriesESet;
		identifyCategoriesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DOCUMENT_ROOT__IDENTIFY_CATEGORIES, oldIdentifyCategories, identifyCategories, !oldIdentifyCategoriesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIdentifyCategories() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldIdentifyCategories = identifyCategories;
		boolean oldIdentifyCategoriesESet = identifyCategoriesESet;
		identifyCategories = IDENTIFY_CATEGORIES_EDEFAULT;
		identifyCategoriesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TablePackage.DOCUMENT_ROOT__IDENTIFY_CATEGORIES, oldIdentifyCategories, IDENTIFY_CATEGORIES_EDEFAULT, oldIdentifyCategoriesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIdentifyCategories() {
		return identifyCategoriesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getIgnoreEmptyRows() {
		return ignoreEmptyRows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIgnoreEmptyRows(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newIgnoreEmptyRows) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldIgnoreEmptyRows = ignoreEmptyRows;
		ignoreEmptyRows = newIgnoreEmptyRows == null ? IGNORE_EMPTY_ROWS_EDEFAULT : newIgnoreEmptyRows;
		boolean oldIgnoreEmptyRowsESet = ignoreEmptyRowsESet;
		ignoreEmptyRowsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DOCUMENT_ROOT__IGNORE_EMPTY_ROWS, oldIgnoreEmptyRows, ignoreEmptyRows, !oldIgnoreEmptyRowsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIgnoreEmptyRows() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldIgnoreEmptyRows = ignoreEmptyRows;
		boolean oldIgnoreEmptyRowsESet = ignoreEmptyRowsESet;
		ignoreEmptyRows = IGNORE_EMPTY_ROWS_EDEFAULT;
		ignoreEmptyRowsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TablePackage.DOCUMENT_ROOT__IGNORE_EMPTY_ROWS, oldIgnoreEmptyRows, IGNORE_EMPTY_ROWS_EDEFAULT, oldIgnoreEmptyRowsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIgnoreEmptyRows() {
		return ignoreEmptyRowsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getIndex() {
		return index;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIndex(BigInteger newIndex) {
		BigInteger oldIndex = index;
		index = newIndex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DOCUMENT_ROOT__INDEX, oldIndex, index));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getIsActive() {
		return isActive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsActive(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newIsActive) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldIsActive = isActive;
		isActive = newIsActive == null ? IS_ACTIVE_EDEFAULT : newIsActive;
		boolean oldIsActiveESet = isActiveESet;
		isActiveESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DOCUMENT_ROOT__IS_ACTIVE, oldIsActive, isActive, !oldIsActiveESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIsActive() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldIsActive = isActive;
		boolean oldIsActiveESet = isActiveESet;
		isActive = IS_ACTIVE_EDEFAULT;
		isActiveESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TablePackage.DOCUMENT_ROOT__IS_ACTIVE, oldIsActive, IS_ACTIVE_EDEFAULT, oldIsActiveESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIsActive() {
		return isActiveESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIsDataLayoutField() {
		return isDataLayoutField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsDataLayoutField(String newIsDataLayoutField) {
		String oldIsDataLayoutField = isDataLayoutField;
		isDataLayoutField = newIsDataLayoutField;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DOCUMENT_ROOT__IS_DATA_LAYOUT_FIELD, oldIsDataLayoutField, isDataLayoutField));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getIsSelection() {
		return isSelection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsSelection(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newIsSelection) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldIsSelection = isSelection;
		isSelection = newIsSelection == null ? IS_SELECTION_EDEFAULT : newIsSelection;
		boolean oldIsSelectionESet = isSelectionESet;
		isSelectionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DOCUMENT_ROOT__IS_SELECTION, oldIsSelection, isSelection, !oldIsSelectionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIsSelection() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldIsSelection = isSelection;
		boolean oldIsSelectionESet = isSelectionESet;
		isSelection = IS_SELECTION_EDEFAULT;
		isSelectionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TablePackage.DOCUMENT_ROOT__IS_SELECTION, oldIsSelection, IS_SELECTION_EDEFAULT, oldIsSelectionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIsSelection() {
		return isSelectionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getIsSubTable() {
		return isSubTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsSubTable(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newIsSubTable) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldIsSubTable = isSubTable;
		isSubTable = newIsSubTable == null ? IS_SUB_TABLE_EDEFAULT : newIsSubTable;
		boolean oldIsSubTableESet = isSubTableESet;
		isSubTableESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DOCUMENT_ROOT__IS_SUB_TABLE, oldIsSubTable, isSubTable, !oldIsSubTableESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIsSubTable() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldIsSubTable = isSubTable;
		boolean oldIsSubTableESet = isSubTableESet;
		isSubTable = IS_SUB_TABLE_EDEFAULT;
		isSubTableESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TablePackage.DOCUMENT_ROOT__IS_SUB_TABLE, oldIsSubTable, IS_SUB_TABLE_EDEFAULT, oldIsSubTableESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIsSubTable() {
		return isSubTableESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLabelCellRangeAddress() {
		return labelCellRangeAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabelCellRangeAddress(String newLabelCellRangeAddress) {
		String oldLabelCellRangeAddress = labelCellRangeAddress;
		labelCellRangeAddress = newLabelCellRangeAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DOCUMENT_ROOT__LABEL_CELL_RANGE_ADDRESS, oldLabelCellRangeAddress, labelCellRangeAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLanguage() {
		return language;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLanguage(String newLanguage) {
		String oldLanguage = language;
		language = newLanguage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DOCUMENT_ROOT__LANGUAGE, oldLanguage, language));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getLastColumnSpanned() {
		return lastColumnSpanned;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastColumnSpanned(BigInteger newLastColumnSpanned) {
		BigInteger oldLastColumnSpanned = lastColumnSpanned;
		lastColumnSpanned = newLastColumnSpanned;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DOCUMENT_ROOT__LAST_COLUMN_SPANNED, oldLastColumnSpanned, lastColumnSpanned));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getLastRowSpanned() {
		return lastRowSpanned;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastRowSpanned(BigInteger newLastRowSpanned) {
		BigInteger oldLastRowSpanned = lastRowSpanned;
		lastRowSpanned = newLastRowSpanned;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DOCUMENT_ROOT__LAST_ROW_SPANNED, oldLastRowSpanned, lastRowSpanned));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LayoutModeType getLayoutMode() {
		return layoutMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLayoutMode(LayoutModeType newLayoutMode) {
		LayoutModeType oldLayoutMode = layoutMode;
		layoutMode = newLayoutMode == null ? LAYOUT_MODE_EDEFAULT : newLayoutMode;
		boolean oldLayoutModeESet = layoutModeESet;
		layoutModeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DOCUMENT_ROOT__LAYOUT_MODE, oldLayoutMode, layoutMode, !oldLayoutModeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLayoutMode() {
		LayoutModeType oldLayoutMode = layoutMode;
		boolean oldLayoutModeESet = layoutModeESet;
		layoutMode = LAYOUT_MODE_EDEFAULT;
		layoutModeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TablePackage.DOCUMENT_ROOT__LAYOUT_MODE, oldLayoutMode, LAYOUT_MODE_EDEFAULT, oldLayoutModeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLayoutMode() {
		return layoutModeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getLinkToSourceData() {
		return linkToSourceData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinkToSourceData(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newLinkToSourceData) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldLinkToSourceData = linkToSourceData;
		linkToSourceData = newLinkToSourceData == null ? LINK_TO_SOURCE_DATA_EDEFAULT : newLinkToSourceData;
		boolean oldLinkToSourceDataESet = linkToSourceDataESet;
		linkToSourceDataESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DOCUMENT_ROOT__LINK_TO_SOURCE_DATA, oldLinkToSourceData, linkToSourceData, !oldLinkToSourceDataESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLinkToSourceData() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldLinkToSourceData = linkToSourceData;
		boolean oldLinkToSourceDataESet = linkToSourceDataESet;
		linkToSourceData = LINK_TO_SOURCE_DATA_EDEFAULT;
		linkToSourceDataESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TablePackage.DOCUMENT_ROOT__LINK_TO_SOURCE_DATA, oldLinkToSourceData, LINK_TO_SOURCE_DATA_EDEFAULT, oldLinkToSourceDataESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLinkToSourceData() {
		return linkToSourceDataESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getMarkedInvalid() {
		return markedInvalid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMarkedInvalid(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newMarkedInvalid) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldMarkedInvalid = markedInvalid;
		markedInvalid = newMarkedInvalid == null ? MARKED_INVALID_EDEFAULT : newMarkedInvalid;
		boolean oldMarkedInvalidESet = markedInvalidESet;
		markedInvalidESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DOCUMENT_ROOT__MARKED_INVALID, oldMarkedInvalid, markedInvalid, !oldMarkedInvalidESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMarkedInvalid() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldMarkedInvalid = markedInvalid;
		boolean oldMarkedInvalidESet = markedInvalidESet;
		markedInvalid = MARKED_INVALID_EDEFAULT;
		markedInvalidESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TablePackage.DOCUMENT_ROOT__MARKED_INVALID, oldMarkedInvalid, MARKED_INVALID_EDEFAULT, oldMarkedInvalidESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMarkedInvalid() {
		return markedInvalidESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getMatrixCovered() {
		return matrixCovered;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMatrixCovered(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newMatrixCovered) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldMatrixCovered = matrixCovered;
		matrixCovered = newMatrixCovered == null ? MATRIX_COVERED_EDEFAULT : newMatrixCovered;
		boolean oldMatrixCoveredESet = matrixCoveredESet;
		matrixCoveredESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DOCUMENT_ROOT__MATRIX_COVERED, oldMatrixCovered, matrixCovered, !oldMatrixCoveredESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMatrixCovered() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldMatrixCovered = matrixCovered;
		boolean oldMatrixCoveredESet = matrixCoveredESet;
		matrixCovered = MATRIX_COVERED_EDEFAULT;
		matrixCoveredESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TablePackage.DOCUMENT_ROOT__MATRIX_COVERED, oldMatrixCovered, MATRIX_COVERED_EDEFAULT, oldMatrixCoveredESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMatrixCovered() {
		return matrixCoveredESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getMemberCount() {
		return memberCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMemberCount(BigInteger newMemberCount) {
		BigInteger oldMemberCount = memberCount;
		memberCount = newMemberCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DOCUMENT_ROOT__MEMBER_COUNT, oldMemberCount, memberCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMemberName() {
		return memberName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMemberName(String newMemberName) {
		String oldMemberName = memberName;
		memberName = newMemberName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DOCUMENT_ROOT__MEMBER_NAME, oldMemberName, memberName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MemberTypeType getMemberType() {
		return memberType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMemberType(MemberTypeType newMemberType) {
		MemberTypeType oldMemberType = memberType;
		memberType = newMemberType == null ? MEMBER_TYPE_EDEFAULT : newMemberType;
		boolean oldMemberTypeESet = memberTypeESet;
		memberTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DOCUMENT_ROOT__MEMBER_TYPE, oldMemberType, memberType, !oldMemberTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMemberType() {
		MemberTypeType oldMemberType = memberType;
		boolean oldMemberTypeESet = memberTypeESet;
		memberType = MEMBER_TYPE_EDEFAULT;
		memberTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TablePackage.DOCUMENT_ROOT__MEMBER_TYPE, oldMemberType, MEMBER_TYPE_EDEFAULT, oldMemberTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMemberType() {
		return memberTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModeType getMode() {
		return mode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMode(ModeType newMode) {
		ModeType oldMode = mode;
		mode = newMode == null ? MODE_EDEFAULT : newMode;
		boolean oldModeESet = modeESet;
		modeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DOCUMENT_ROOT__MODE, oldMode, mode, !oldModeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMode() {
		ModeType oldMode = mode;
		boolean oldModeESet = modeESet;
		mode = MODE_EDEFAULT;
		modeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TablePackage.DOCUMENT_ROOT__MODE, oldMode, MODE_EDEFAULT, oldModeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMode() {
		return modeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getMultiDeletionSpanned() {
		return multiDeletionSpanned;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultiDeletionSpanned(BigInteger newMultiDeletionSpanned) {
		BigInteger oldMultiDeletionSpanned = multiDeletionSpanned;
		multiDeletionSpanned = newMultiDeletionSpanned;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DOCUMENT_ROOT__MULTI_DELETION_SPANNED, oldMultiDeletionSpanned, multiDeletionSpanned));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getNullYear() {
		return nullYear;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNullYear(BigInteger newNullYear) {
		BigInteger oldNullYear = nullYear;
		nullYear = newNullYear;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DOCUMENT_ROOT__NULL_YEAR, oldNullYear, nullYear));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getNumberColumnsRepeated() {
		return numberColumnsRepeated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberColumnsRepeated(BigInteger newNumberColumnsRepeated) {
		BigInteger oldNumberColumnsRepeated = numberColumnsRepeated;
		numberColumnsRepeated = newNumberColumnsRepeated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DOCUMENT_ROOT__NUMBER_COLUMNS_REPEATED, oldNumberColumnsRepeated, numberColumnsRepeated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getNumberColumnsSpanned() {
		return numberColumnsSpanned;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberColumnsSpanned(BigInteger newNumberColumnsSpanned) {
		BigInteger oldNumberColumnsSpanned = numberColumnsSpanned;
		numberColumnsSpanned = newNumberColumnsSpanned;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DOCUMENT_ROOT__NUMBER_COLUMNS_SPANNED, oldNumberColumnsSpanned, numberColumnsSpanned));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getNumberMatrixColumnsSpanned() {
		return numberMatrixColumnsSpanned;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberMatrixColumnsSpanned(BigInteger newNumberMatrixColumnsSpanned) {
		BigInteger oldNumberMatrixColumnsSpanned = numberMatrixColumnsSpanned;
		numberMatrixColumnsSpanned = newNumberMatrixColumnsSpanned;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DOCUMENT_ROOT__NUMBER_MATRIX_COLUMNS_SPANNED, oldNumberMatrixColumnsSpanned, numberMatrixColumnsSpanned));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getNumberMatrixRowsSpanned() {
		return numberMatrixRowsSpanned;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberMatrixRowsSpanned(BigInteger newNumberMatrixRowsSpanned) {
		BigInteger oldNumberMatrixRowsSpanned = numberMatrixRowsSpanned;
		numberMatrixRowsSpanned = newNumberMatrixRowsSpanned;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DOCUMENT_ROOT__NUMBER_MATRIX_ROWS_SPANNED, oldNumberMatrixRowsSpanned, numberMatrixRowsSpanned));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getNumberRowsRepeated() {
		return numberRowsRepeated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberRowsRepeated(BigInteger newNumberRowsRepeated) {
		BigInteger oldNumberRowsRepeated = numberRowsRepeated;
		numberRowsRepeated = newNumberRowsRepeated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DOCUMENT_ROOT__NUMBER_ROWS_REPEATED, oldNumberRowsRepeated, numberRowsRepeated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getNumberRowsSpanned() {
		return numberRowsSpanned;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberRowsSpanned(BigInteger newNumberRowsSpanned) {
		BigInteger oldNumberRowsSpanned = numberRowsSpanned;
		numberRowsSpanned = newNumberRowsSpanned;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DOCUMENT_ROOT__NUMBER_ROWS_SPANNED, oldNumberRowsSpanned, numberRowsSpanned));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getObjectName() {
		return objectName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObjectName(String newObjectName) {
		String oldObjectName = objectName;
		objectName = newObjectName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DOCUMENT_ROOT__OBJECT_NAME, oldObjectName, objectName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getOnUpdateKeepSize() {
		return onUpdateKeepSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnUpdateKeepSize(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newOnUpdateKeepSize) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldOnUpdateKeepSize = onUpdateKeepSize;
		onUpdateKeepSize = newOnUpdateKeepSize == null ? ON_UPDATE_KEEP_SIZE_EDEFAULT : newOnUpdateKeepSize;
		boolean oldOnUpdateKeepSizeESet = onUpdateKeepSizeESet;
		onUpdateKeepSizeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DOCUMENT_ROOT__ON_UPDATE_KEEP_SIZE, oldOnUpdateKeepSize, onUpdateKeepSize, !oldOnUpdateKeepSizeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetOnUpdateKeepSize() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldOnUpdateKeepSize = onUpdateKeepSize;
		boolean oldOnUpdateKeepSizeESet = onUpdateKeepSizeESet;
		onUpdateKeepSize = ON_UPDATE_KEEP_SIZE_EDEFAULT;
		onUpdateKeepSizeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TablePackage.DOCUMENT_ROOT__ON_UPDATE_KEEP_SIZE, oldOnUpdateKeepSize, ON_UPDATE_KEEP_SIZE_EDEFAULT, oldOnUpdateKeepSizeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOnUpdateKeepSize() {
		return onUpdateKeepSizeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getOnUpdateKeepStyles() {
		return onUpdateKeepStyles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnUpdateKeepStyles(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newOnUpdateKeepStyles) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldOnUpdateKeepStyles = onUpdateKeepStyles;
		onUpdateKeepStyles = newOnUpdateKeepStyles == null ? ON_UPDATE_KEEP_STYLES_EDEFAULT : newOnUpdateKeepStyles;
		boolean oldOnUpdateKeepStylesESet = onUpdateKeepStylesESet;
		onUpdateKeepStylesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DOCUMENT_ROOT__ON_UPDATE_KEEP_STYLES, oldOnUpdateKeepStyles, onUpdateKeepStyles, !oldOnUpdateKeepStylesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetOnUpdateKeepStyles() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldOnUpdateKeepStyles = onUpdateKeepStyles;
		boolean oldOnUpdateKeepStylesESet = onUpdateKeepStylesESet;
		onUpdateKeepStyles = ON_UPDATE_KEEP_STYLES_EDEFAULT;
		onUpdateKeepStylesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TablePackage.DOCUMENT_ROOT__ON_UPDATE_KEEP_STYLES, oldOnUpdateKeepStyles, ON_UPDATE_KEEP_STYLES_EDEFAULT, oldOnUpdateKeepStylesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOnUpdateKeepStyles() {
		return onUpdateKeepStylesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOperator() {
		return operator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperator(String newOperator) {
		String oldOperator = operator;
		operator = newOperator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DOCUMENT_ROOT__OPERATOR, oldOperator, operator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrderType getOrder() {
		return order;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrder(OrderType newOrder) {
		OrderType oldOrder = order;
		order = newOrder == null ? ORDER_EDEFAULT : newOrder;
		boolean oldOrderESet = orderESet;
		orderESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DOCUMENT_ROOT__ORDER, oldOrder, order, !oldOrderESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetOrder() {
		OrderType oldOrder = order;
		boolean oldOrderESet = orderESet;
		order = ORDER_EDEFAULT;
		orderESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TablePackage.DOCUMENT_ROOT__ORDER, oldOrder, ORDER_EDEFAULT, oldOrderESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOrder() {
		return orderESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getPageBreaksOnGroupChange() {
		return pageBreaksOnGroupChange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPageBreaksOnGroupChange(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newPageBreaksOnGroupChange) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldPageBreaksOnGroupChange = pageBreaksOnGroupChange;
		pageBreaksOnGroupChange = newPageBreaksOnGroupChange == null ? PAGE_BREAKS_ON_GROUP_CHANGE_EDEFAULT : newPageBreaksOnGroupChange;
		boolean oldPageBreaksOnGroupChangeESet = pageBreaksOnGroupChangeESet;
		pageBreaksOnGroupChangeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DOCUMENT_ROOT__PAGE_BREAKS_ON_GROUP_CHANGE, oldPageBreaksOnGroupChange, pageBreaksOnGroupChange, !oldPageBreaksOnGroupChangeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPageBreaksOnGroupChange() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldPageBreaksOnGroupChange = pageBreaksOnGroupChange;
		boolean oldPageBreaksOnGroupChangeESet = pageBreaksOnGroupChangeESet;
		pageBreaksOnGroupChange = PAGE_BREAKS_ON_GROUP_CHANGE_EDEFAULT;
		pageBreaksOnGroupChangeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TablePackage.DOCUMENT_ROOT__PAGE_BREAKS_ON_GROUP_CHANGE, oldPageBreaksOnGroupChange, PAGE_BREAKS_ON_GROUP_CHANGE_EDEFAULT, oldPageBreaksOnGroupChangeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPageBreaksOnGroupChange() {
		return pageBreaksOnGroupChangeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getParseSqlStatement() {
		return parseSqlStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParseSqlStatement(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newParseSqlStatement) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldParseSqlStatement = parseSqlStatement;
		parseSqlStatement = newParseSqlStatement == null ? PARSE_SQL_STATEMENT_EDEFAULT : newParseSqlStatement;
		boolean oldParseSqlStatementESet = parseSqlStatementESet;
		parseSqlStatementESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DOCUMENT_ROOT__PARSE_SQL_STATEMENT, oldParseSqlStatement, parseSqlStatement, !oldParseSqlStatementESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetParseSqlStatement() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldParseSqlStatement = parseSqlStatement;
		boolean oldParseSqlStatementESet = parseSqlStatementESet;
		parseSqlStatement = PARSE_SQL_STATEMENT_EDEFAULT;
		parseSqlStatementESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TablePackage.DOCUMENT_ROOT__PARSE_SQL_STATEMENT, oldParseSqlStatement, PARSE_SQL_STATEMENT_EDEFAULT, oldParseSqlStatementESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetParseSqlStatement() {
		return parseSqlStatementESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassword(String newPassword) {
		String oldPassword = password;
		password = newPassword;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DOCUMENT_ROOT__PASSWORD, oldPassword, password));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getPosition() {
		return position;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPosition(BigInteger newPosition) {
		BigInteger oldPosition = position;
		position = newPosition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DOCUMENT_ROOT__POSITION, oldPosition, position));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getPrecisionAsShown() {
		return precisionAsShown;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrecisionAsShown(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newPrecisionAsShown) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldPrecisionAsShown = precisionAsShown;
		precisionAsShown = newPrecisionAsShown == null ? PRECISION_AS_SHOWN_EDEFAULT : newPrecisionAsShown;
		boolean oldPrecisionAsShownESet = precisionAsShownESet;
		precisionAsShownESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DOCUMENT_ROOT__PRECISION_AS_SHOWN, oldPrecisionAsShown, precisionAsShown, !oldPrecisionAsShownESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPrecisionAsShown() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldPrecisionAsShown = precisionAsShown;
		boolean oldPrecisionAsShownESet = precisionAsShownESet;
		precisionAsShown = PRECISION_AS_SHOWN_EDEFAULT;
		precisionAsShownESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TablePackage.DOCUMENT_ROOT__PRECISION_AS_SHOWN, oldPrecisionAsShown, PRECISION_AS_SHOWN_EDEFAULT, oldPrecisionAsShownESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPrecisionAsShown() {
		return precisionAsShownESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getPrint() {
		return print;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrint(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newPrint) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldPrint = print;
		print = newPrint == null ? PRINT_EDEFAULT : newPrint;
		boolean oldPrintESet = printESet;
		printESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DOCUMENT_ROOT__PRINT, oldPrint, print, !oldPrintESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPrint() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldPrint = print;
		boolean oldPrintESet = printESet;
		print = PRINT_EDEFAULT;
		printESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TablePackage.DOCUMENT_ROOT__PRINT, oldPrint, PRINT_EDEFAULT, oldPrintESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPrint() {
		return printESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPrintRanges() {
		return printRanges;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrintRanges(String newPrintRanges) {
		String oldPrintRanges = printRanges;
		printRanges = newPrintRanges;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DOCUMENT_ROOT__PRINT_RANGES, oldPrintRanges, printRanges));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getProtect() {
		return protect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProtect(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newProtect) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldProtect = protect;
		protect = newProtect == null ? PROTECT_EDEFAULT : newProtect;
		boolean oldProtectESet = protectESet;
		protectESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DOCUMENT_ROOT__PROTECT, oldProtect, protect, !oldProtectESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetProtect() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldProtect = protect;
		boolean oldProtectESet = protectESet;
		protect = PROTECT_EDEFAULT;
		protectESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TablePackage.DOCUMENT_ROOT__PROTECT, oldProtect, PROTECT_EDEFAULT, oldProtectESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetProtect() {
		return protectESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getProtected() {
		return protected_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProtected(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newProtected) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldProtected = protected_;
		protected_ = newProtected == null ? PROTECTED_EDEFAULT : newProtected;
		boolean oldProtectedESet = protectedESet;
		protectedESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DOCUMENT_ROOT__PROTECTED, oldProtected, protected_, !oldProtectedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetProtected() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldProtected = protected_;
		boolean oldProtectedESet = protectedESet;
		protected_ = PROTECTED_EDEFAULT;
		protectedESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TablePackage.DOCUMENT_ROOT__PROTECTED, oldProtected, PROTECTED_EDEFAULT, oldProtectedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetProtected() {
		return protectedESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getQueryName() {
		return queryName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQueryName(String newQueryName) {
		String oldQueryName = queryName;
		queryName = newQueryName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DOCUMENT_ROOT__QUERY_NAME, oldQueryName, queryName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getRangeUsableAs() {
		return rangeUsableAs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRangeUsableAs(Object newRangeUsableAs) {
		Object oldRangeUsableAs = rangeUsableAs;
		rangeUsableAs = newRangeUsableAs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DOCUMENT_ROOT__RANGE_USABLE_AS, oldRangeUsableAs, rangeUsableAs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRejectingChangeId() {
		return rejectingChangeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRejectingChangeId(String newRejectingChangeId) {
		String oldRejectingChangeId = rejectingChangeId;
		rejectingChangeId = newRejectingChangeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DOCUMENT_ROOT__REJECTING_CHANGE_ID, oldRejectingChangeId, rejectingChangeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getRow() {
		return row;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRow(BigInteger newRow) {
		BigInteger oldRow = row;
		row = newRow;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DOCUMENT_ROOT__ROW, oldRow, row));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getScenarioRanges() {
		return scenarioRanges;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScenarioRanges(String newScenarioRanges) {
		String oldScenarioRanges = scenarioRanges;
		scenarioRanges = newScenarioRanges;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DOCUMENT_ROOT__SCENARIO_RANGES, oldScenarioRanges, scenarioRanges));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getSearchCriteriaMustApplyToWholeCell() {
		return searchCriteriaMustApplyToWholeCell;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSearchCriteriaMustApplyToWholeCell(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newSearchCriteriaMustApplyToWholeCell) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldSearchCriteriaMustApplyToWholeCell = searchCriteriaMustApplyToWholeCell;
		searchCriteriaMustApplyToWholeCell = newSearchCriteriaMustApplyToWholeCell == null ? SEARCH_CRITERIA_MUST_APPLY_TO_WHOLE_CELL_EDEFAULT : newSearchCriteriaMustApplyToWholeCell;
		boolean oldSearchCriteriaMustApplyToWholeCellESet = searchCriteriaMustApplyToWholeCellESet;
		searchCriteriaMustApplyToWholeCellESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DOCUMENT_ROOT__SEARCH_CRITERIA_MUST_APPLY_TO_WHOLE_CELL, oldSearchCriteriaMustApplyToWholeCell, searchCriteriaMustApplyToWholeCell, !oldSearchCriteriaMustApplyToWholeCellESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSearchCriteriaMustApplyToWholeCell() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldSearchCriteriaMustApplyToWholeCell = searchCriteriaMustApplyToWholeCell;
		boolean oldSearchCriteriaMustApplyToWholeCellESet = searchCriteriaMustApplyToWholeCellESet;
		searchCriteriaMustApplyToWholeCell = SEARCH_CRITERIA_MUST_APPLY_TO_WHOLE_CELL_EDEFAULT;
		searchCriteriaMustApplyToWholeCellESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TablePackage.DOCUMENT_ROOT__SEARCH_CRITERIA_MUST_APPLY_TO_WHOLE_CELL, oldSearchCriteriaMustApplyToWholeCell, SEARCH_CRITERIA_MUST_APPLY_TO_WHOLE_CELL_EDEFAULT, oldSearchCriteriaMustApplyToWholeCellESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSearchCriteriaMustApplyToWholeCell() {
		return searchCriteriaMustApplyToWholeCellESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSelectedPage() {
		return selectedPage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelectedPage(String newSelectedPage) {
		String oldSelectedPage = selectedPage;
		selectedPage = newSelectedPage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DOCUMENT_ROOT__SELECTED_PAGE, oldSelectedPage, selectedPage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getShowDetails() {
		return showDetails;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShowDetails(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newShowDetails) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldShowDetails = showDetails;
		showDetails = newShowDetails == null ? SHOW_DETAILS_EDEFAULT : newShowDetails;
		boolean oldShowDetailsESet = showDetailsESet;
		showDetailsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DOCUMENT_ROOT__SHOW_DETAILS, oldShowDetails, showDetails, !oldShowDetailsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetShowDetails() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldShowDetails = showDetails;
		boolean oldShowDetailsESet = showDetailsESet;
		showDetails = SHOW_DETAILS_EDEFAULT;
		showDetailsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TablePackage.DOCUMENT_ROOT__SHOW_DETAILS, oldShowDetails, SHOW_DETAILS_EDEFAULT, oldShowDetailsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetShowDetails() {
		return showDetailsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getShowEmpty() {
		return showEmpty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShowEmpty(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newShowEmpty) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldShowEmpty = showEmpty;
		showEmpty = newShowEmpty == null ? SHOW_EMPTY_EDEFAULT : newShowEmpty;
		boolean oldShowEmptyESet = showEmptyESet;
		showEmptyESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DOCUMENT_ROOT__SHOW_EMPTY, oldShowEmpty, showEmpty, !oldShowEmptyESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetShowEmpty() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldShowEmpty = showEmpty;
		boolean oldShowEmptyESet = showEmptyESet;
		showEmpty = SHOW_EMPTY_EDEFAULT;
		showEmptyESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TablePackage.DOCUMENT_ROOT__SHOW_EMPTY, oldShowEmpty, SHOW_EMPTY_EDEFAULT, oldShowEmptyESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetShowEmpty() {
		return showEmptyESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getShowFilterButton() {
		return showFilterButton;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShowFilterButton(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newShowFilterButton) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldShowFilterButton = showFilterButton;
		showFilterButton = newShowFilterButton == null ? SHOW_FILTER_BUTTON_EDEFAULT : newShowFilterButton;
		boolean oldShowFilterButtonESet = showFilterButtonESet;
		showFilterButtonESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DOCUMENT_ROOT__SHOW_FILTER_BUTTON, oldShowFilterButton, showFilterButton, !oldShowFilterButtonESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetShowFilterButton() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldShowFilterButton = showFilterButton;
		boolean oldShowFilterButtonESet = showFilterButtonESet;
		showFilterButton = SHOW_FILTER_BUTTON_EDEFAULT;
		showFilterButtonESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TablePackage.DOCUMENT_ROOT__SHOW_FILTER_BUTTON, oldShowFilterButton, SHOW_FILTER_BUTTON_EDEFAULT, oldShowFilterButtonESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetShowFilterButton() {
		return showFilterButtonESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SortModeType getSortMode() {
		return sortMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSortMode(SortModeType newSortMode) {
		SortModeType oldSortMode = sortMode;
		sortMode = newSortMode == null ? SORT_MODE_EDEFAULT : newSortMode;
		boolean oldSortModeESet = sortModeESet;
		sortModeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DOCUMENT_ROOT__SORT_MODE, oldSortMode, sortMode, !oldSortModeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSortMode() {
		SortModeType oldSortMode = sortMode;
		boolean oldSortModeESet = sortModeESet;
		sortMode = SORT_MODE_EDEFAULT;
		sortModeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TablePackage.DOCUMENT_ROOT__SORT_MODE, oldSortMode, SORT_MODE_EDEFAULT, oldSortModeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSortMode() {
		return sortModeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSourceCellRangeAddresses() {
		return sourceCellRangeAddresses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceCellRangeAddresses(String newSourceCellRangeAddresses) {
		String oldSourceCellRangeAddresses = sourceCellRangeAddresses;
		sourceCellRangeAddresses = newSourceCellRangeAddresses;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DOCUMENT_ROOT__SOURCE_CELL_RANGE_ADDRESSES, oldSourceCellRangeAddresses, sourceCellRangeAddresses));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSourceFieldName() {
		return sourceFieldName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceFieldName(String newSourceFieldName) {
		String oldSourceFieldName = sourceFieldName;
		sourceFieldName = newSourceFieldName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DOCUMENT_ROOT__SOURCE_FIELD_NAME, oldSourceFieldName, sourceFieldName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSourceName() {
		return sourceName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceName(String newSourceName) {
		String oldSourceName = sourceName;
		sourceName = newSourceName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DOCUMENT_ROOT__SOURCE_NAME, oldSourceName, sourceName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSqlStatement() {
		return sqlStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSqlStatement(String newSqlStatement) {
		String oldSqlStatement = sqlStatement;
		sqlStatement = newSqlStatement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DOCUMENT_ROOT__SQL_STATEMENT, oldSqlStatement, sqlStatement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getStart() {
		return start;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStart(Object newStart) {
		Object oldStart = start;
		start = newStart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DOCUMENT_ROOT__START, oldStart, start));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getStartColumn() {
		return startColumn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartColumn(BigInteger newStartColumn) {
		BigInteger oldStartColumn = startColumn;
		startColumn = newStartColumn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DOCUMENT_ROOT__START_COLUMN, oldStartColumn, startColumn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getStartPosition() {
		return startPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartPosition(BigInteger newStartPosition) {
		BigInteger oldStartPosition = startPosition;
		startPosition = newStartPosition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DOCUMENT_ROOT__START_POSITION, oldStartPosition, startPosition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getStartRow() {
		return startRow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartRow(BigInteger newStartRow) {
		BigInteger oldStartRow = startRow;
		startRow = newStartRow;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DOCUMENT_ROOT__START_ROW, oldStartRow, startRow));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getStartTable() {
		return startTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartTable(BigInteger newStartTable) {
		BigInteger oldStartTable = startTable;
		startTable = newStartTable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DOCUMENT_ROOT__START_TABLE, oldStartTable, startTable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getStep() {
		return step;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStep(double newStep) {
		double oldStep = step;
		step = newStep;
		boolean oldStepESet = stepESet;
		stepESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DOCUMENT_ROOT__STEP, oldStep, step, !oldStepESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetStep() {
		double oldStep = step;
		boolean oldStepESet = stepESet;
		step = STEP_EDEFAULT;
		stepESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TablePackage.DOCUMENT_ROOT__STEP, oldStep, STEP_EDEFAULT, oldStepESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetStep() {
		return stepESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getStructureProtected() {
		return structureProtected;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStructureProtected(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newStructureProtected) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldStructureProtected = structureProtected;
		structureProtected = newStructureProtected == null ? STRUCTURE_PROTECTED_EDEFAULT : newStructureProtected;
		boolean oldStructureProtectedESet = structureProtectedESet;
		structureProtectedESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DOCUMENT_ROOT__STRUCTURE_PROTECTED, oldStructureProtected, structureProtected, !oldStructureProtectedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetStructureProtected() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldStructureProtected = structureProtected;
		boolean oldStructureProtectedESet = structureProtectedESet;
		structureProtected = STRUCTURE_PROTECTED_EDEFAULT;
		structureProtectedESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TablePackage.DOCUMENT_ROOT__STRUCTURE_PROTECTED, oldStructureProtected, STRUCTURE_PROTECTED_EDEFAULT, oldStructureProtectedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetStructureProtected() {
		return structureProtectedESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DOCUMENT_ROOT__STYLE_NAME, oldStyleName, styleName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getTable1() {
		return table1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTable1(BigInteger newTable1) {
		BigInteger oldTable1 = table1;
		table1 = newTable1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DOCUMENT_ROOT__TABLE1, oldTable1, table1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getTableBackground() {
		return tableBackground;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTableBackground(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newTableBackground) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldTableBackground = tableBackground;
		tableBackground = newTableBackground == null ? TABLE_BACKGROUND_EDEFAULT : newTableBackground;
		boolean oldTableBackgroundESet = tableBackgroundESet;
		tableBackgroundESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DOCUMENT_ROOT__TABLE_BACKGROUND, oldTableBackground, tableBackground, !oldTableBackgroundESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTableBackground() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldTableBackground = tableBackground;
		boolean oldTableBackgroundESet = tableBackgroundESet;
		tableBackground = TABLE_BACKGROUND_EDEFAULT;
		tableBackgroundESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TablePackage.DOCUMENT_ROOT__TABLE_BACKGROUND, oldTableBackground, TABLE_BACKGROUND_EDEFAULT, oldTableBackgroundESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTableBackground() {
		return tableBackgroundESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTableName() {
		return tableName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTableName(String newTableName) {
		String oldTableName = tableName;
		tableName = newTableName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DOCUMENT_ROOT__TABLE_NAME, oldTableName, tableName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTargetCellAddress() {
		return targetCellAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetCellAddress(String newTargetCellAddress) {
		String oldTargetCellAddress = targetCellAddress;
		targetCellAddress = newTargetCellAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DOCUMENT_ROOT__TARGET_CELL_ADDRESS, oldTargetCellAddress, targetCellAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTargetRangeAddress1() {
		return targetRangeAddress1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetRangeAddress1(String newTargetRangeAddress1) {
		String oldTargetRangeAddress1 = targetRangeAddress1;
		targetRangeAddress1 = newTargetRangeAddress1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DOCUMENT_ROOT__TARGET_RANGE_ADDRESS1, oldTargetRangeAddress1, targetRangeAddress1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getTrackChanges() {
		return trackChanges;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrackChanges(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newTrackChanges) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldTrackChanges = trackChanges;
		trackChanges = newTrackChanges == null ? TRACK_CHANGES_EDEFAULT : newTrackChanges;
		boolean oldTrackChangesESet = trackChangesESet;
		trackChangesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DOCUMENT_ROOT__TRACK_CHANGES, oldTrackChanges, trackChanges, !oldTrackChangesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTrackChanges() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldTrackChanges = trackChanges;
		boolean oldTrackChangesESet = trackChangesESet;
		trackChanges = TRACK_CHANGES_EDEFAULT;
		trackChangesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TablePackage.DOCUMENT_ROOT__TRACK_CHANGES, oldTrackChanges, TRACK_CHANGES_EDEFAULT, oldTrackChangesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTrackChanges() {
		return trackChangesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getUsedHierarchy() {
		return usedHierarchy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsedHierarchy(BigInteger newUsedHierarchy) {
		BigInteger oldUsedHierarchy = usedHierarchy;
		usedHierarchy = newUsedHierarchy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DOCUMENT_ROOT__USED_HIERARCHY, oldUsedHierarchy, usedHierarchy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UseLabelsType getUseLabels() {
		return useLabels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUseLabels(UseLabelsType newUseLabels) {
		UseLabelsType oldUseLabels = useLabels;
		useLabels = newUseLabels == null ? USE_LABELS_EDEFAULT : newUseLabels;
		boolean oldUseLabelsESet = useLabelsESet;
		useLabelsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DOCUMENT_ROOT__USE_LABELS, oldUseLabels, useLabels, !oldUseLabelsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetUseLabels() {
		UseLabelsType oldUseLabels = useLabels;
		boolean oldUseLabelsESet = useLabelsESet;
		useLabels = USE_LABELS_EDEFAULT;
		useLabelsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TablePackage.DOCUMENT_ROOT__USE_LABELS, oldUseLabels, USE_LABELS_EDEFAULT, oldUseLabelsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetUseLabels() {
		return useLabelsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getUseRegularExpressions() {
		return useRegularExpressions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUseRegularExpressions(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newUseRegularExpressions) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldUseRegularExpressions = useRegularExpressions;
		useRegularExpressions = newUseRegularExpressions == null ? USE_REGULAR_EXPRESSIONS_EDEFAULT : newUseRegularExpressions;
		boolean oldUseRegularExpressionsESet = useRegularExpressionsESet;
		useRegularExpressionsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DOCUMENT_ROOT__USE_REGULAR_EXPRESSIONS, oldUseRegularExpressions, useRegularExpressions, !oldUseRegularExpressionsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetUseRegularExpressions() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldUseRegularExpressions = useRegularExpressions;
		boolean oldUseRegularExpressionsESet = useRegularExpressionsESet;
		useRegularExpressions = USE_REGULAR_EXPRESSIONS_EDEFAULT;
		useRegularExpressionsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TablePackage.DOCUMENT_ROOT__USE_REGULAR_EXPRESSIONS, oldUseRegularExpressions, USE_REGULAR_EXPRESSIONS_EDEFAULT, oldUseRegularExpressionsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetUseRegularExpressions() {
		return useRegularExpressionsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserName(String newUserName) {
		String oldUserName = userName;
		userName = newUserName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DOCUMENT_ROOT__USER_NAME, oldUserName, userName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(String newValue) {
		String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DOCUMENT_ROOT__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TableVisibilityValue getVisibility() {
		return visibility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisibility(TableVisibilityValue newVisibility) {
		TableVisibilityValue oldVisibility = visibility;
		visibility = newVisibility == null ? VISIBILITY_EDEFAULT : newVisibility;
		boolean oldVisibilityESet = visibilityESet;
		visibilityESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DOCUMENT_ROOT__VISIBILITY, oldVisibility, visibility, !oldVisibilityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetVisibility() {
		TableVisibilityValue oldVisibility = visibility;
		boolean oldVisibilityESet = visibilityESet;
		visibility = VISIBILITY_EDEFAULT;
		visibilityESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TablePackage.DOCUMENT_ROOT__VISIBILITY, oldVisibility, VISIBILITY_EDEFAULT, oldVisibilityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetVisibility() {
		return visibilityESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TablePackage.DOCUMENT_ROOT__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case TablePackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return ((InternalEList<?>)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
			case TablePackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return ((InternalEList<?>)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
			case TablePackage.DOCUMENT_ROOT__BODY:
				return basicSetBody(null, msgs);
			case TablePackage.DOCUMENT_ROOT__CALCULATION_SETTINGS:
				return basicSetCalculationSettings(null, msgs);
			case TablePackage.DOCUMENT_ROOT__CELL_ADDRESS:
				return basicSetCellAddress(null, msgs);
			case TablePackage.DOCUMENT_ROOT__CELL_CONTENT_CHANGE:
				return basicSetCellContentChange(null, msgs);
			case TablePackage.DOCUMENT_ROOT__CELL_CONTENT_DELETION:
				return basicSetCellContentDeletion(null, msgs);
			case TablePackage.DOCUMENT_ROOT__CELL_RANGE_SOURCE:
				return basicSetCellRangeSource(null, msgs);
			case TablePackage.DOCUMENT_ROOT__CHANGE_DELETION:
				return basicSetChangeDeletion(null, msgs);
			case TablePackage.DOCUMENT_ROOT__CHANGE_TRACK_TABLE_CELL:
				return basicSetChangeTrackTableCell(null, msgs);
			case TablePackage.DOCUMENT_ROOT__CONSOLIDATION:
				return basicSetConsolidation(null, msgs);
			case TablePackage.DOCUMENT_ROOT__CONTENT_VALIDATION:
				return basicSetContentValidation(null, msgs);
			case TablePackage.DOCUMENT_ROOT__CONTENT_VALIDATIONS:
				return basicSetContentValidations(null, msgs);
			case TablePackage.DOCUMENT_ROOT__COVERED_TABLE_CELL:
				return basicSetCoveredTableCell(null, msgs);
			case TablePackage.DOCUMENT_ROOT__CUT_OFFS:
				return basicSetCutOffs(null, msgs);
			case TablePackage.DOCUMENT_ROOT__DATABASE_RANGE:
				return basicSetDatabaseRange(null, msgs);
			case TablePackage.DOCUMENT_ROOT__DATABASE_RANGES:
				return basicSetDatabaseRanges(null, msgs);
			case TablePackage.DOCUMENT_ROOT__DATABASE_SOURCE_QUERY:
				return basicSetDatabaseSourceQuery(null, msgs);
			case TablePackage.DOCUMENT_ROOT__DATABASE_SOURCE_SQL:
				return basicSetDatabaseSourceSql(null, msgs);
			case TablePackage.DOCUMENT_ROOT__DATABASE_SOURCE_TABLE:
				return basicSetDatabaseSourceTable(null, msgs);
			case TablePackage.DOCUMENT_ROOT__DATA_PILOT_DISPLAY_INFO:
				return basicSetDataPilotDisplayInfo(null, msgs);
			case TablePackage.DOCUMENT_ROOT__DATA_PILOT_FIELD:
				return basicSetDataPilotField(null, msgs);
			case TablePackage.DOCUMENT_ROOT__DATA_PILOT_FIELD_REFERENCE:
				return basicSetDataPilotFieldReference(null, msgs);
			case TablePackage.DOCUMENT_ROOT__DATA_PILOT_GROUP:
				return basicSetDataPilotGroup(null, msgs);
			case TablePackage.DOCUMENT_ROOT__DATA_PILOT_GROUP_MEMBER:
				return basicSetDataPilotGroupMember(null, msgs);
			case TablePackage.DOCUMENT_ROOT__DATA_PILOT_GROUPS:
				return basicSetDataPilotGroups(null, msgs);
			case TablePackage.DOCUMENT_ROOT__DATA_PILOT_LAYOUT_INFO:
				return basicSetDataPilotLayoutInfo(null, msgs);
			case TablePackage.DOCUMENT_ROOT__DATA_PILOT_LEVEL:
				return basicSetDataPilotLevel(null, msgs);
			case TablePackage.DOCUMENT_ROOT__DATA_PILOT_MEMBER:
				return basicSetDataPilotMember(null, msgs);
			case TablePackage.DOCUMENT_ROOT__DATA_PILOT_MEMBERS:
				return basicSetDataPilotMembers(null, msgs);
			case TablePackage.DOCUMENT_ROOT__DATA_PILOT_SORT_INFO:
				return basicSetDataPilotSortInfo(null, msgs);
			case TablePackage.DOCUMENT_ROOT__DATA_PILOT_SUBTOTAL:
				return basicSetDataPilotSubtotal(null, msgs);
			case TablePackage.DOCUMENT_ROOT__DATA_PILOT_SUBTOTALS:
				return basicSetDataPilotSubtotals(null, msgs);
			case TablePackage.DOCUMENT_ROOT__DATA_PILOT_TABLE:
				return basicSetDataPilotTable(null, msgs);
			case TablePackage.DOCUMENT_ROOT__DATA_PILOT_TABLES:
				return basicSetDataPilotTables(null, msgs);
			case TablePackage.DOCUMENT_ROOT__DDE_LINK:
				return basicSetDdeLink(null, msgs);
			case TablePackage.DOCUMENT_ROOT__DDE_LINKS:
				return basicSetDdeLinks(null, msgs);
			case TablePackage.DOCUMENT_ROOT__DELETION:
				return basicSetDeletion(null, msgs);
			case TablePackage.DOCUMENT_ROOT__DELETIONS:
				return basicSetDeletions(null, msgs);
			case TablePackage.DOCUMENT_ROOT__DEPENDENCIES:
				return basicSetDependencies(null, msgs);
			case TablePackage.DOCUMENT_ROOT__DEPENDENCY:
				return basicSetDependency(null, msgs);
			case TablePackage.DOCUMENT_ROOT__DETECTIVE:
				return basicSetDetective(null, msgs);
			case TablePackage.DOCUMENT_ROOT__ERROR_MACRO:
				return basicSetErrorMacro(null, msgs);
			case TablePackage.DOCUMENT_ROOT__ERROR_MESSAGE:
				return basicSetErrorMessage(null, msgs);
			case TablePackage.DOCUMENT_ROOT__EVEN_COLUMNS:
				return basicSetEvenColumns(null, msgs);
			case TablePackage.DOCUMENT_ROOT__EVEN_ROWS:
				return basicSetEvenRows(null, msgs);
			case TablePackage.DOCUMENT_ROOT__FILTER:
				return basicSetFilter(null, msgs);
			case TablePackage.DOCUMENT_ROOT__FILTER_AND:
				return basicSetFilterAnd(null, msgs);
			case TablePackage.DOCUMENT_ROOT__FILTER_CONDITION:
				return basicSetFilterCondition(null, msgs);
			case TablePackage.DOCUMENT_ROOT__FILTER_OR:
				return basicSetFilterOr(null, msgs);
			case TablePackage.DOCUMENT_ROOT__FIRST_COLUMN:
				return basicSetFirstColumn(null, msgs);
			case TablePackage.DOCUMENT_ROOT__FIRST_ROW:
				return basicSetFirstRow(null, msgs);
			case TablePackage.DOCUMENT_ROOT__HELP_MESSAGE:
				return basicSetHelpMessage(null, msgs);
			case TablePackage.DOCUMENT_ROOT__HIGHLIGHTED_RANGE:
				return basicSetHighlightedRange(null, msgs);
			case TablePackage.DOCUMENT_ROOT__INSERTION:
				return basicSetInsertion(null, msgs);
			case TablePackage.DOCUMENT_ROOT__INSERTION_CUT_OFF:
				return basicSetInsertionCutOff(null, msgs);
			case TablePackage.DOCUMENT_ROOT__ITERATION:
				return basicSetIteration(null, msgs);
			case TablePackage.DOCUMENT_ROOT__LABEL_RANGE:
				return basicSetLabelRange(null, msgs);
			case TablePackage.DOCUMENT_ROOT__LABEL_RANGES:
				return basicSetLabelRanges(null, msgs);
			case TablePackage.DOCUMENT_ROOT__LAST_COLUMN:
				return basicSetLastColumn(null, msgs);
			case TablePackage.DOCUMENT_ROOT__LAST_ROW:
				return basicSetLastRow(null, msgs);
			case TablePackage.DOCUMENT_ROOT__MOVEMENT:
				return basicSetMovement(null, msgs);
			case TablePackage.DOCUMENT_ROOT__MOVEMENT_CUT_OFF:
				return basicSetMovementCutOff(null, msgs);
			case TablePackage.DOCUMENT_ROOT__NAMED_EXPRESSION:
				return basicSetNamedExpression(null, msgs);
			case TablePackage.DOCUMENT_ROOT__NAMED_EXPRESSIONS:
				return basicSetNamedExpressions(null, msgs);
			case TablePackage.DOCUMENT_ROOT__NAMED_RANGE:
				return basicSetNamedRange(null, msgs);
			case TablePackage.DOCUMENT_ROOT__NULL_DATE:
				return basicSetNullDate(null, msgs);
			case TablePackage.DOCUMENT_ROOT__ODD_COLUMNS:
				return basicSetOddColumns(null, msgs);
			case TablePackage.DOCUMENT_ROOT__ODD_ROWS:
				return basicSetOddRows(null, msgs);
			case TablePackage.DOCUMENT_ROOT__OPERATION:
				return basicSetOperation(null, msgs);
			case TablePackage.DOCUMENT_ROOT__PREVIOUS:
				return basicSetPrevious(null, msgs);
			case TablePackage.DOCUMENT_ROOT__SCENARIO:
				return basicSetScenario(null, msgs);
			case TablePackage.DOCUMENT_ROOT__SHAPES:
				return basicSetShapes(null, msgs);
			case TablePackage.DOCUMENT_ROOT__SORT:
				return basicSetSort(null, msgs);
			case TablePackage.DOCUMENT_ROOT__SORT_BY:
				return basicSetSortBy(null, msgs);
			case TablePackage.DOCUMENT_ROOT__SORT_GROUPS:
				return basicSetSortGroups(null, msgs);
			case TablePackage.DOCUMENT_ROOT__SOURCE_CELL_RANGE:
				return basicSetSourceCellRange(null, msgs);
			case TablePackage.DOCUMENT_ROOT__SOURCE_RANGE_ADDRESS:
				return basicSetSourceRangeAddress(null, msgs);
			case TablePackage.DOCUMENT_ROOT__SOURCE_SERVICE:
				return basicSetSourceService(null, msgs);
			case TablePackage.DOCUMENT_ROOT__SUBTOTAL_FIELD:
				return basicSetSubtotalField(null, msgs);
			case TablePackage.DOCUMENT_ROOT__SUBTOTAL_RULE:
				return basicSetSubtotalRule(null, msgs);
			case TablePackage.DOCUMENT_ROOT__SUBTOTAL_RULES:
				return basicSetSubtotalRules(null, msgs);
			case TablePackage.DOCUMENT_ROOT__TABLE:
				return basicSetTable(null, msgs);
			case TablePackage.DOCUMENT_ROOT__TABLE_CELL:
				return basicSetTableCell(null, msgs);
			case TablePackage.DOCUMENT_ROOT__TABLE_COLUMN:
				return basicSetTableColumn(null, msgs);
			case TablePackage.DOCUMENT_ROOT__TABLE_COLUMN_GROUP:
				return basicSetTableColumnGroup(null, msgs);
			case TablePackage.DOCUMENT_ROOT__TABLE_COLUMNS:
				return basicSetTableColumns(null, msgs);
			case TablePackage.DOCUMENT_ROOT__TABLE_HEADER_COLUMNS:
				return basicSetTableHeaderColumns(null, msgs);
			case TablePackage.DOCUMENT_ROOT__TABLE_HEADER_ROWS:
				return basicSetTableHeaderRows(null, msgs);
			case TablePackage.DOCUMENT_ROOT__TABLE_ROW:
				return basicSetTableRow(null, msgs);
			case TablePackage.DOCUMENT_ROOT__TABLE_ROW_GROUP:
				return basicSetTableRowGroup(null, msgs);
			case TablePackage.DOCUMENT_ROOT__TABLE_ROWS:
				return basicSetTableRows(null, msgs);
			case TablePackage.DOCUMENT_ROOT__TABLE_SOURCE:
				return basicSetTableSource(null, msgs);
			case TablePackage.DOCUMENT_ROOT__TABLE_TEMPLATE:
				return basicSetTableTemplate(null, msgs);
			case TablePackage.DOCUMENT_ROOT__TARGET_RANGE_ADDRESS:
				return basicSetTargetRangeAddress(null, msgs);
			case TablePackage.DOCUMENT_ROOT__TRACKED_CHANGES:
				return basicSetTrackedChanges(null, msgs);
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
			case TablePackage.DOCUMENT_ROOT__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case TablePackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				if (coreType) return getXMLNSPrefixMap();
				else return getXMLNSPrefixMap().map();
			case TablePackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				if (coreType) return getXSISchemaLocation();
				else return getXSISchemaLocation().map();
			case TablePackage.DOCUMENT_ROOT__BODY:
				return getBody();
			case TablePackage.DOCUMENT_ROOT__CALCULATION_SETTINGS:
				return getCalculationSettings();
			case TablePackage.DOCUMENT_ROOT__CELL_ADDRESS:
				return getCellAddress();
			case TablePackage.DOCUMENT_ROOT__CELL_CONTENT_CHANGE:
				return getCellContentChange();
			case TablePackage.DOCUMENT_ROOT__CELL_CONTENT_DELETION:
				return getCellContentDeletion();
			case TablePackage.DOCUMENT_ROOT__CELL_RANGE_SOURCE:
				return getCellRangeSource();
			case TablePackage.DOCUMENT_ROOT__CHANGE_DELETION:
				return getChangeDeletion();
			case TablePackage.DOCUMENT_ROOT__CHANGE_TRACK_TABLE_CELL:
				return getChangeTrackTableCell();
			case TablePackage.DOCUMENT_ROOT__CONSOLIDATION:
				return getConsolidation();
			case TablePackage.DOCUMENT_ROOT__CONTENT_VALIDATION:
				return getContentValidation();
			case TablePackage.DOCUMENT_ROOT__CONTENT_VALIDATIONS:
				return getContentValidations();
			case TablePackage.DOCUMENT_ROOT__COVERED_TABLE_CELL:
				return getCoveredTableCell();
			case TablePackage.DOCUMENT_ROOT__CUT_OFFS:
				return getCutOffs();
			case TablePackage.DOCUMENT_ROOT__DATABASE_RANGE:
				return getDatabaseRange();
			case TablePackage.DOCUMENT_ROOT__DATABASE_RANGES:
				return getDatabaseRanges();
			case TablePackage.DOCUMENT_ROOT__DATABASE_SOURCE_QUERY:
				return getDatabaseSourceQuery();
			case TablePackage.DOCUMENT_ROOT__DATABASE_SOURCE_SQL:
				return getDatabaseSourceSql();
			case TablePackage.DOCUMENT_ROOT__DATABASE_SOURCE_TABLE:
				return getDatabaseSourceTable();
			case TablePackage.DOCUMENT_ROOT__DATA_PILOT_DISPLAY_INFO:
				return getDataPilotDisplayInfo();
			case TablePackage.DOCUMENT_ROOT__DATA_PILOT_FIELD:
				return getDataPilotField();
			case TablePackage.DOCUMENT_ROOT__DATA_PILOT_FIELD_REFERENCE:
				return getDataPilotFieldReference();
			case TablePackage.DOCUMENT_ROOT__DATA_PILOT_GROUP:
				return getDataPilotGroup();
			case TablePackage.DOCUMENT_ROOT__DATA_PILOT_GROUP_MEMBER:
				return getDataPilotGroupMember();
			case TablePackage.DOCUMENT_ROOT__DATA_PILOT_GROUPS:
				return getDataPilotGroups();
			case TablePackage.DOCUMENT_ROOT__DATA_PILOT_LAYOUT_INFO:
				return getDataPilotLayoutInfo();
			case TablePackage.DOCUMENT_ROOT__DATA_PILOT_LEVEL:
				return getDataPilotLevel();
			case TablePackage.DOCUMENT_ROOT__DATA_PILOT_MEMBER:
				return getDataPilotMember();
			case TablePackage.DOCUMENT_ROOT__DATA_PILOT_MEMBERS:
				return getDataPilotMembers();
			case TablePackage.DOCUMENT_ROOT__DATA_PILOT_SORT_INFO:
				return getDataPilotSortInfo();
			case TablePackage.DOCUMENT_ROOT__DATA_PILOT_SUBTOTAL:
				return getDataPilotSubtotal();
			case TablePackage.DOCUMENT_ROOT__DATA_PILOT_SUBTOTALS:
				return getDataPilotSubtotals();
			case TablePackage.DOCUMENT_ROOT__DATA_PILOT_TABLE:
				return getDataPilotTable();
			case TablePackage.DOCUMENT_ROOT__DATA_PILOT_TABLES:
				return getDataPilotTables();
			case TablePackage.DOCUMENT_ROOT__DDE_LINK:
				return getDdeLink();
			case TablePackage.DOCUMENT_ROOT__DDE_LINKS:
				return getDdeLinks();
			case TablePackage.DOCUMENT_ROOT__DELETION:
				return getDeletion();
			case TablePackage.DOCUMENT_ROOT__DELETIONS:
				return getDeletions();
			case TablePackage.DOCUMENT_ROOT__DEPENDENCIES:
				return getDependencies();
			case TablePackage.DOCUMENT_ROOT__DEPENDENCY:
				return getDependency();
			case TablePackage.DOCUMENT_ROOT__DETECTIVE:
				return getDetective();
			case TablePackage.DOCUMENT_ROOT__ERROR_MACRO:
				return getErrorMacro();
			case TablePackage.DOCUMENT_ROOT__ERROR_MESSAGE:
				return getErrorMessage();
			case TablePackage.DOCUMENT_ROOT__EVEN_COLUMNS:
				return getEvenColumns();
			case TablePackage.DOCUMENT_ROOT__EVEN_ROWS:
				return getEvenRows();
			case TablePackage.DOCUMENT_ROOT__FILTER:
				return getFilter();
			case TablePackage.DOCUMENT_ROOT__FILTER_AND:
				return getFilterAnd();
			case TablePackage.DOCUMENT_ROOT__FILTER_CONDITION:
				return getFilterCondition();
			case TablePackage.DOCUMENT_ROOT__FILTER_OR:
				return getFilterOr();
			case TablePackage.DOCUMENT_ROOT__FIRST_COLUMN:
				return getFirstColumn();
			case TablePackage.DOCUMENT_ROOT__FIRST_ROW:
				return getFirstRow();
			case TablePackage.DOCUMENT_ROOT__HELP_MESSAGE:
				return getHelpMessage();
			case TablePackage.DOCUMENT_ROOT__HIGHLIGHTED_RANGE:
				return getHighlightedRange();
			case TablePackage.DOCUMENT_ROOT__INSERTION:
				return getInsertion();
			case TablePackage.DOCUMENT_ROOT__INSERTION_CUT_OFF:
				return getInsertionCutOff();
			case TablePackage.DOCUMENT_ROOT__ITERATION:
				return getIteration();
			case TablePackage.DOCUMENT_ROOT__LABEL_RANGE:
				return getLabelRange();
			case TablePackage.DOCUMENT_ROOT__LABEL_RANGES:
				return getLabelRanges();
			case TablePackage.DOCUMENT_ROOT__LAST_COLUMN:
				return getLastColumn();
			case TablePackage.DOCUMENT_ROOT__LAST_ROW:
				return getLastRow();
			case TablePackage.DOCUMENT_ROOT__MOVEMENT:
				return getMovement();
			case TablePackage.DOCUMENT_ROOT__MOVEMENT_CUT_OFF:
				return getMovementCutOff();
			case TablePackage.DOCUMENT_ROOT__NAMED_EXPRESSION:
				return getNamedExpression();
			case TablePackage.DOCUMENT_ROOT__NAMED_EXPRESSIONS:
				return getNamedExpressions();
			case TablePackage.DOCUMENT_ROOT__NAMED_RANGE:
				return getNamedRange();
			case TablePackage.DOCUMENT_ROOT__NULL_DATE:
				return getNullDate();
			case TablePackage.DOCUMENT_ROOT__ODD_COLUMNS:
				return getOddColumns();
			case TablePackage.DOCUMENT_ROOT__ODD_ROWS:
				return getOddRows();
			case TablePackage.DOCUMENT_ROOT__OPERATION:
				return getOperation();
			case TablePackage.DOCUMENT_ROOT__PREVIOUS:
				return getPrevious();
			case TablePackage.DOCUMENT_ROOT__SCENARIO:
				return getScenario();
			case TablePackage.DOCUMENT_ROOT__SHAPES:
				return getShapes();
			case TablePackage.DOCUMENT_ROOT__SORT:
				return getSort();
			case TablePackage.DOCUMENT_ROOT__SORT_BY:
				return getSortBy();
			case TablePackage.DOCUMENT_ROOT__SORT_GROUPS:
				return getSortGroups();
			case TablePackage.DOCUMENT_ROOT__SOURCE_CELL_RANGE:
				return getSourceCellRange();
			case TablePackage.DOCUMENT_ROOT__SOURCE_RANGE_ADDRESS:
				return getSourceRangeAddress();
			case TablePackage.DOCUMENT_ROOT__SOURCE_SERVICE:
				return getSourceService();
			case TablePackage.DOCUMENT_ROOT__SUBTOTAL_FIELD:
				return getSubtotalField();
			case TablePackage.DOCUMENT_ROOT__SUBTOTAL_RULE:
				return getSubtotalRule();
			case TablePackage.DOCUMENT_ROOT__SUBTOTAL_RULES:
				return getSubtotalRules();
			case TablePackage.DOCUMENT_ROOT__TABLE:
				return getTable();
			case TablePackage.DOCUMENT_ROOT__TABLE_CELL:
				return getTableCell();
			case TablePackage.DOCUMENT_ROOT__TABLE_COLUMN:
				return getTableColumn();
			case TablePackage.DOCUMENT_ROOT__TABLE_COLUMN_GROUP:
				return getTableColumnGroup();
			case TablePackage.DOCUMENT_ROOT__TABLE_COLUMNS:
				return getTableColumns();
			case TablePackage.DOCUMENT_ROOT__TABLE_HEADER_COLUMNS:
				return getTableHeaderColumns();
			case TablePackage.DOCUMENT_ROOT__TABLE_HEADER_ROWS:
				return getTableHeaderRows();
			case TablePackage.DOCUMENT_ROOT__TABLE_ROW:
				return getTableRow();
			case TablePackage.DOCUMENT_ROOT__TABLE_ROW_GROUP:
				return getTableRowGroup();
			case TablePackage.DOCUMENT_ROOT__TABLE_ROWS:
				return getTableRows();
			case TablePackage.DOCUMENT_ROOT__TABLE_SOURCE:
				return getTableSource();
			case TablePackage.DOCUMENT_ROOT__TABLE_TEMPLATE:
				return getTableTemplate();
			case TablePackage.DOCUMENT_ROOT__TARGET_RANGE_ADDRESS:
				return getTargetRangeAddress();
			case TablePackage.DOCUMENT_ROOT__TRACKED_CHANGES:
				return getTrackedChanges();
			case TablePackage.DOCUMENT_ROOT__ACCEPTANCE_STATE:
				return getAcceptanceState();
			case TablePackage.DOCUMENT_ROOT__ADD_EMPTY_LINES:
				return getAddEmptyLines();
			case TablePackage.DOCUMENT_ROOT__ALGORITHM:
				return getAlgorithm();
			case TablePackage.DOCUMENT_ROOT__ALIGN:
				return getAlign();
			case TablePackage.DOCUMENT_ROOT__ALLOW_EMPTY_CELL:
				return getAllowEmptyCell();
			case TablePackage.DOCUMENT_ROOT__APPLICATION_DATA:
				return getApplicationData();
			case TablePackage.DOCUMENT_ROOT__AUTOMATIC_FIND_LABELS:
				return getAutomaticFindLabels();
			case TablePackage.DOCUMENT_ROOT__BASE_CELL_ADDRESS:
				return getBaseCellAddress();
			case TablePackage.DOCUMENT_ROOT__BIND_STYLES_TO_CONTENT:
				return getBindStylesToContent();
			case TablePackage.DOCUMENT_ROOT__BORDER_COLOR:
				return getBorderColor();
			case TablePackage.DOCUMENT_ROOT__BORDER_MODEL:
				return getBorderModel();
			case TablePackage.DOCUMENT_ROOT__BUTTONS:
				return getButtons();
			case TablePackage.DOCUMENT_ROOT__CELL_ADDRESS1:
				return getCellAddress1();
			case TablePackage.DOCUMENT_ROOT__CELL_RANGE:
				return getCellRange();
			case TablePackage.DOCUMENT_ROOT__CELL_RANGE_ADDRESS:
				return getCellRangeAddress();
			case TablePackage.DOCUMENT_ROOT__COLUMN:
				return getColumn();
			case TablePackage.DOCUMENT_ROOT__COMMENT:
				return getComment();
			case TablePackage.DOCUMENT_ROOT__CONDITION:
				return getCondition();
			case TablePackage.DOCUMENT_ROOT__CONDITION_SOURCE:
				return getConditionSource();
			case TablePackage.DOCUMENT_ROOT__CONDITION_SOURCE_RANGE_ADDRESS:
				return getConditionSourceRangeAddress();
			case TablePackage.DOCUMENT_ROOT__CONTAINS_ERROR:
				return getContainsError();
			case TablePackage.DOCUMENT_ROOT__CONTAINS_HEADER:
				return getContainsHeader();
			case TablePackage.DOCUMENT_ROOT__CONTENT_VALIDATION_NAME:
				return getContentValidationName();
			case TablePackage.DOCUMENT_ROOT__COPY_BACK:
				return getCopyBack();
			case TablePackage.DOCUMENT_ROOT__COPY_FORMULAS:
				return getCopyFormulas();
			case TablePackage.DOCUMENT_ROOT__COPY_STYLES:
				return getCopyStyles();
			case TablePackage.DOCUMENT_ROOT__COUNT:
				return getCount();
			case TablePackage.DOCUMENT_ROOT__COUNTRY:
				return getCountry();
			case TablePackage.DOCUMENT_ROOT__DATABASE_NAME:
				return getDatabaseName();
			case TablePackage.DOCUMENT_ROOT__DATABASE_TABLE_NAME:
				return getDatabaseTableName();
			case TablePackage.DOCUMENT_ROOT__DATA_CELL_RANGE_ADDRESS:
				return getDataCellRangeAddress();
			case TablePackage.DOCUMENT_ROOT__DATA_FIELD:
				return getDataField();
			case TablePackage.DOCUMENT_ROOT__DATE_END:
				return getDateEnd();
			case TablePackage.DOCUMENT_ROOT__DATE_START:
				return getDateStart();
			case TablePackage.DOCUMENT_ROOT__DEFAULT_CELL_STYLE_NAME:
				return getDefaultCellStyleName();
			case TablePackage.DOCUMENT_ROOT__DIRECTION:
				return getDirection();
			case TablePackage.DOCUMENT_ROOT__DISPLAY:
				return getDisplay();
			case TablePackage.DOCUMENT_ROOT__DISPLAY_BORDER:
				return getDisplayBorder();
			case TablePackage.DOCUMENT_ROOT__DISPLAY_DUPLICATES:
				return getDisplayDuplicates();
			case TablePackage.DOCUMENT_ROOT__DISPLAY_FILTER_BUTTONS:
				return getDisplayFilterButtons();
			case TablePackage.DOCUMENT_ROOT__DISPLAY_LIST:
				return getDisplayList();
			case TablePackage.DOCUMENT_ROOT__DISPLAY_MEMBER_MODE:
				return getDisplayMemberMode();
			case TablePackage.DOCUMENT_ROOT__DRILL_DOWN_ON_DOUBLE_CLICK:
				return getDrillDownOnDoubleClick();
			case TablePackage.DOCUMENT_ROOT__ENABLED:
				return getEnabled();
			case TablePackage.DOCUMENT_ROOT__END:
				return getEnd();
			case TablePackage.DOCUMENT_ROOT__END_CELL_ADDRESS:
				return getEndCellAddress();
			case TablePackage.DOCUMENT_ROOT__END_COLUMN:
				return getEndColumn();
			case TablePackage.DOCUMENT_ROOT__END_POSITION:
				return getEndPosition();
			case TablePackage.DOCUMENT_ROOT__END_ROW:
				return getEndRow();
			case TablePackage.DOCUMENT_ROOT__END_TABLE:
				return getEndTable();
			case TablePackage.DOCUMENT_ROOT__END_X:
				return getEndX();
			case TablePackage.DOCUMENT_ROOT__END_Y:
				return getEndY();
			case TablePackage.DOCUMENT_ROOT__EXPRESSION:
				return getExpression();
			case TablePackage.DOCUMENT_ROOT__FIELD_NAME:
				return getFieldName();
			case TablePackage.DOCUMENT_ROOT__FIELD_NUMBER:
				return getFieldNumber();
			case TablePackage.DOCUMENT_ROOT__FILTER_NAME:
				return getFilterName();
			case TablePackage.DOCUMENT_ROOT__FILTER_OPTIONS:
				return getFilterOptions();
			case TablePackage.DOCUMENT_ROOT__FORMULA:
				return getFormula();
			case TablePackage.DOCUMENT_ROOT__FUNCTION:
				return getFunction();
			case TablePackage.DOCUMENT_ROOT__GRAND_TOTAL:
				return getGrandTotal();
			case TablePackage.DOCUMENT_ROOT__GROUP_BY_FIELD_NUMBER:
				return getGroupByFieldNumber();
			case TablePackage.DOCUMENT_ROOT__GROUPED_BY:
				return getGroupedBy();
			case TablePackage.DOCUMENT_ROOT__HAS_PERSISTENT_DATA:
				return getHasPersistentData();
			case TablePackage.DOCUMENT_ROOT__ID:
				return getId();
			case TablePackage.DOCUMENT_ROOT__IDENTIFY_CATEGORIES:
				return getIdentifyCategories();
			case TablePackage.DOCUMENT_ROOT__IGNORE_EMPTY_ROWS:
				return getIgnoreEmptyRows();
			case TablePackage.DOCUMENT_ROOT__INDEX:
				return getIndex();
			case TablePackage.DOCUMENT_ROOT__IS_ACTIVE:
				return getIsActive();
			case TablePackage.DOCUMENT_ROOT__IS_DATA_LAYOUT_FIELD:
				return getIsDataLayoutField();
			case TablePackage.DOCUMENT_ROOT__IS_SELECTION:
				return getIsSelection();
			case TablePackage.DOCUMENT_ROOT__IS_SUB_TABLE:
				return getIsSubTable();
			case TablePackage.DOCUMENT_ROOT__LABEL_CELL_RANGE_ADDRESS:
				return getLabelCellRangeAddress();
			case TablePackage.DOCUMENT_ROOT__LANGUAGE:
				return getLanguage();
			case TablePackage.DOCUMENT_ROOT__LAST_COLUMN_SPANNED:
				return getLastColumnSpanned();
			case TablePackage.DOCUMENT_ROOT__LAST_ROW_SPANNED:
				return getLastRowSpanned();
			case TablePackage.DOCUMENT_ROOT__LAYOUT_MODE:
				return getLayoutMode();
			case TablePackage.DOCUMENT_ROOT__LINK_TO_SOURCE_DATA:
				return getLinkToSourceData();
			case TablePackage.DOCUMENT_ROOT__MARKED_INVALID:
				return getMarkedInvalid();
			case TablePackage.DOCUMENT_ROOT__MATRIX_COVERED:
				return getMatrixCovered();
			case TablePackage.DOCUMENT_ROOT__MEMBER_COUNT:
				return getMemberCount();
			case TablePackage.DOCUMENT_ROOT__MEMBER_NAME:
				return getMemberName();
			case TablePackage.DOCUMENT_ROOT__MEMBER_TYPE:
				return getMemberType();
			case TablePackage.DOCUMENT_ROOT__MODE:
				return getMode();
			case TablePackage.DOCUMENT_ROOT__MULTI_DELETION_SPANNED:
				return getMultiDeletionSpanned();
			case TablePackage.DOCUMENT_ROOT__NULL_YEAR:
				return getNullYear();
			case TablePackage.DOCUMENT_ROOT__NUMBER_COLUMNS_REPEATED:
				return getNumberColumnsRepeated();
			case TablePackage.DOCUMENT_ROOT__NUMBER_COLUMNS_SPANNED:
				return getNumberColumnsSpanned();
			case TablePackage.DOCUMENT_ROOT__NUMBER_MATRIX_COLUMNS_SPANNED:
				return getNumberMatrixColumnsSpanned();
			case TablePackage.DOCUMENT_ROOT__NUMBER_MATRIX_ROWS_SPANNED:
				return getNumberMatrixRowsSpanned();
			case TablePackage.DOCUMENT_ROOT__NUMBER_ROWS_REPEATED:
				return getNumberRowsRepeated();
			case TablePackage.DOCUMENT_ROOT__NUMBER_ROWS_SPANNED:
				return getNumberRowsSpanned();
			case TablePackage.DOCUMENT_ROOT__OBJECT_NAME:
				return getObjectName();
			case TablePackage.DOCUMENT_ROOT__ON_UPDATE_KEEP_SIZE:
				return getOnUpdateKeepSize();
			case TablePackage.DOCUMENT_ROOT__ON_UPDATE_KEEP_STYLES:
				return getOnUpdateKeepStyles();
			case TablePackage.DOCUMENT_ROOT__OPERATOR:
				return getOperator();
			case TablePackage.DOCUMENT_ROOT__ORDER:
				return getOrder();
			case TablePackage.DOCUMENT_ROOT__PAGE_BREAKS_ON_GROUP_CHANGE:
				return getPageBreaksOnGroupChange();
			case TablePackage.DOCUMENT_ROOT__PARSE_SQL_STATEMENT:
				return getParseSqlStatement();
			case TablePackage.DOCUMENT_ROOT__PASSWORD:
				return getPassword();
			case TablePackage.DOCUMENT_ROOT__POSITION:
				return getPosition();
			case TablePackage.DOCUMENT_ROOT__PRECISION_AS_SHOWN:
				return getPrecisionAsShown();
			case TablePackage.DOCUMENT_ROOT__PRINT:
				return getPrint();
			case TablePackage.DOCUMENT_ROOT__PRINT_RANGES:
				return getPrintRanges();
			case TablePackage.DOCUMENT_ROOT__PROTECT:
				return getProtect();
			case TablePackage.DOCUMENT_ROOT__PROTECTED:
				return getProtected();
			case TablePackage.DOCUMENT_ROOT__QUERY_NAME:
				return getQueryName();
			case TablePackage.DOCUMENT_ROOT__RANGE_USABLE_AS:
				return getRangeUsableAs();
			case TablePackage.DOCUMENT_ROOT__REJECTING_CHANGE_ID:
				return getRejectingChangeId();
			case TablePackage.DOCUMENT_ROOT__ROW:
				return getRow();
			case TablePackage.DOCUMENT_ROOT__SCENARIO_RANGES:
				return getScenarioRanges();
			case TablePackage.DOCUMENT_ROOT__SEARCH_CRITERIA_MUST_APPLY_TO_WHOLE_CELL:
				return getSearchCriteriaMustApplyToWholeCell();
			case TablePackage.DOCUMENT_ROOT__SELECTED_PAGE:
				return getSelectedPage();
			case TablePackage.DOCUMENT_ROOT__SHOW_DETAILS:
				return getShowDetails();
			case TablePackage.DOCUMENT_ROOT__SHOW_EMPTY:
				return getShowEmpty();
			case TablePackage.DOCUMENT_ROOT__SHOW_FILTER_BUTTON:
				return getShowFilterButton();
			case TablePackage.DOCUMENT_ROOT__SORT_MODE:
				return getSortMode();
			case TablePackage.DOCUMENT_ROOT__SOURCE_CELL_RANGE_ADDRESSES:
				return getSourceCellRangeAddresses();
			case TablePackage.DOCUMENT_ROOT__SOURCE_FIELD_NAME:
				return getSourceFieldName();
			case TablePackage.DOCUMENT_ROOT__SOURCE_NAME:
				return getSourceName();
			case TablePackage.DOCUMENT_ROOT__SQL_STATEMENT:
				return getSqlStatement();
			case TablePackage.DOCUMENT_ROOT__START:
				return getStart();
			case TablePackage.DOCUMENT_ROOT__START_COLUMN:
				return getStartColumn();
			case TablePackage.DOCUMENT_ROOT__START_POSITION:
				return getStartPosition();
			case TablePackage.DOCUMENT_ROOT__START_ROW:
				return getStartRow();
			case TablePackage.DOCUMENT_ROOT__START_TABLE:
				return getStartTable();
			case TablePackage.DOCUMENT_ROOT__STEP:
				return new Double(getStep());
			case TablePackage.DOCUMENT_ROOT__STRUCTURE_PROTECTED:
				return getStructureProtected();
			case TablePackage.DOCUMENT_ROOT__STYLE_NAME:
				return getStyleName();
			case TablePackage.DOCUMENT_ROOT__TABLE1:
				return getTable1();
			case TablePackage.DOCUMENT_ROOT__TABLE_BACKGROUND:
				return getTableBackground();
			case TablePackage.DOCUMENT_ROOT__TABLE_NAME:
				return getTableName();
			case TablePackage.DOCUMENT_ROOT__TARGET_CELL_ADDRESS:
				return getTargetCellAddress();
			case TablePackage.DOCUMENT_ROOT__TARGET_RANGE_ADDRESS1:
				return getTargetRangeAddress1();
			case TablePackage.DOCUMENT_ROOT__TRACK_CHANGES:
				return getTrackChanges();
			case TablePackage.DOCUMENT_ROOT__USED_HIERARCHY:
				return getUsedHierarchy();
			case TablePackage.DOCUMENT_ROOT__USE_LABELS:
				return getUseLabels();
			case TablePackage.DOCUMENT_ROOT__USE_REGULAR_EXPRESSIONS:
				return getUseRegularExpressions();
			case TablePackage.DOCUMENT_ROOT__USER_NAME:
				return getUserName();
			case TablePackage.DOCUMENT_ROOT__VALUE:
				return getValue();
			case TablePackage.DOCUMENT_ROOT__VISIBILITY:
				return getVisibility();
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
			case TablePackage.DOCUMENT_ROOT__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__BODY:
				setBody((BodyType)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__CALCULATION_SETTINGS:
				setCalculationSettings((CalculationSettingsType)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__CELL_ADDRESS:
				setCellAddress((CellAddressType)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__CELL_CONTENT_CHANGE:
				setCellContentChange((CellContentChangeType)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__CELL_CONTENT_DELETION:
				setCellContentDeletion((CellContentDeletionType)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__CELL_RANGE_SOURCE:
				setCellRangeSource((CellRangeSourceType)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__CHANGE_DELETION:
				setChangeDeletion((ChangeDeletionType)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__CHANGE_TRACK_TABLE_CELL:
				setChangeTrackTableCell((ChangeTrackTableCellType)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__CONSOLIDATION:
				setConsolidation((ConsolidationType)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__CONTENT_VALIDATION:
				setContentValidation((ContentValidationType)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__CONTENT_VALIDATIONS:
				setContentValidations((ContentValidationsType)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__COVERED_TABLE_CELL:
				setCoveredTableCell((CoveredTableCellType)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__CUT_OFFS:
				setCutOffs((CutOffsType)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__DATABASE_RANGE:
				setDatabaseRange((DatabaseRangeType)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__DATABASE_RANGES:
				setDatabaseRanges((DatabaseRangesType)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__DATABASE_SOURCE_QUERY:
				setDatabaseSourceQuery((DatabaseSourceQueryType)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__DATABASE_SOURCE_SQL:
				setDatabaseSourceSql((DatabaseSourceSqlType)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__DATABASE_SOURCE_TABLE:
				setDatabaseSourceTable((DatabaseSourceTableType)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__DATA_PILOT_DISPLAY_INFO:
				setDataPilotDisplayInfo((DataPilotDisplayInfoType)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__DATA_PILOT_FIELD:
				setDataPilotField((DataPilotFieldType)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__DATA_PILOT_FIELD_REFERENCE:
				setDataPilotFieldReference((DataPilotFieldReferenceType)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__DATA_PILOT_GROUP:
				setDataPilotGroup((DataPilotGroupType)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__DATA_PILOT_GROUP_MEMBER:
				setDataPilotGroupMember((DataPilotGroupMemberType)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__DATA_PILOT_GROUPS:
				setDataPilotGroups((DataPilotGroupsType)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__DATA_PILOT_LAYOUT_INFO:
				setDataPilotLayoutInfo((DataPilotLayoutInfoType)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__DATA_PILOT_LEVEL:
				setDataPilotLevel((DataPilotLevelType)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__DATA_PILOT_MEMBER:
				setDataPilotMember((DataPilotMemberType)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__DATA_PILOT_MEMBERS:
				setDataPilotMembers((DataPilotMembersType)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__DATA_PILOT_SORT_INFO:
				setDataPilotSortInfo((DataPilotSortInfoType)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__DATA_PILOT_SUBTOTAL:
				setDataPilotSubtotal((DataPilotSubtotalType)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__DATA_PILOT_SUBTOTALS:
				setDataPilotSubtotals((DataPilotSubtotalsType)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__DATA_PILOT_TABLE:
				setDataPilotTable((DataPilotTableType)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__DATA_PILOT_TABLES:
				setDataPilotTables((DataPilotTablesType)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__DDE_LINK:
				setDdeLink((DdeLinkType)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__DDE_LINKS:
				setDdeLinks((DdeLinksType)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__DELETION:
				setDeletion((DeletionType)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__DELETIONS:
				setDeletions((DeletionsType)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__DEPENDENCIES:
				setDependencies((DependenciesType)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__DEPENDENCY:
				setDependency((DependencyType)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__DETECTIVE:
				setDetective((DetectiveType)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__ERROR_MACRO:
				setErrorMacro((ErrorMacroType)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__ERROR_MESSAGE:
				setErrorMessage((ErrorMessageType)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__EVEN_COLUMNS:
				setEvenColumns((EvenColumnsType)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__EVEN_ROWS:
				setEvenRows((EvenRowsType)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__FILTER:
				setFilter((FilterType)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__FILTER_AND:
				setFilterAnd((FilterAndType)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__FILTER_CONDITION:
				setFilterCondition((FilterConditionType)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__FILTER_OR:
				setFilterOr((FilterOrType)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__FIRST_COLUMN:
				setFirstColumn((FirstColumnType)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__FIRST_ROW:
				setFirstRow((FirstRowType)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__HELP_MESSAGE:
				setHelpMessage((HelpMessageType)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__HIGHLIGHTED_RANGE:
				setHighlightedRange((HighlightedRangeType)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__INSERTION:
				setInsertion((InsertionType)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__INSERTION_CUT_OFF:
				setInsertionCutOff((InsertionCutOffType)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__ITERATION:
				setIteration((IterationType)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__LABEL_RANGE:
				setLabelRange((LabelRangeType)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__LABEL_RANGES:
				setLabelRanges((LabelRangesType)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__LAST_COLUMN:
				setLastColumn((LastColumnType)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__LAST_ROW:
				setLastRow((LastRowType)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__MOVEMENT:
				setMovement((MovementType)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__MOVEMENT_CUT_OFF:
				setMovementCutOff((MovementCutOffType)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__NAMED_EXPRESSION:
				setNamedExpression((NamedExpressionType)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__NAMED_EXPRESSIONS:
				setNamedExpressions((NamedExpressionsType)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__NAMED_RANGE:
				setNamedRange((NamedRangeType)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__NULL_DATE:
				setNullDate((NullDateType)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__ODD_COLUMNS:
				setOddColumns((OddColumnsType)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__ODD_ROWS:
				setOddRows((OddRowsType)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__OPERATION:
				setOperation((OperationType)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__PREVIOUS:
				setPrevious((PreviousType)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__SCENARIO:
				setScenario((ScenarioType)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__SHAPES:
				setShapes((ShapesType)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__SORT:
				setSort((SortType)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__SORT_BY:
				setSortBy((SortByType)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__SORT_GROUPS:
				setSortGroups((SortGroupsType)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__SOURCE_CELL_RANGE:
				setSourceCellRange((SourceCellRangeType)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__SOURCE_RANGE_ADDRESS:
				setSourceRangeAddress((SourceRangeAddressType)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__SOURCE_SERVICE:
				setSourceService((SourceServiceType)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__SUBTOTAL_FIELD:
				setSubtotalField((SubtotalFieldType)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__SUBTOTAL_RULE:
				setSubtotalRule((SubtotalRuleType)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__SUBTOTAL_RULES:
				setSubtotalRules((SubtotalRulesType)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__TABLE:
				setTable((TableType)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__TABLE_CELL:
				setTableCell((TableCellType)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__TABLE_COLUMN:
				setTableColumn((TableColumnType)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__TABLE_COLUMN_GROUP:
				setTableColumnGroup((TableColumnGroupType)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__TABLE_COLUMNS:
				setTableColumns((TableColumnsType)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__TABLE_HEADER_COLUMNS:
				setTableHeaderColumns((TableHeaderColumnsType)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__TABLE_HEADER_ROWS:
				setTableHeaderRows((TableHeaderRowsType)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__TABLE_ROW:
				setTableRow((TableRowType)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__TABLE_ROW_GROUP:
				setTableRowGroup((TableRowGroupType)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__TABLE_ROWS:
				setTableRows((TableRowsType)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__TABLE_SOURCE:
				setTableSource((TableSourceType)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__TABLE_TEMPLATE:
				setTableTemplate((TableTemplateType)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__TARGET_RANGE_ADDRESS:
				setTargetRangeAddress((TargetRangeAddressType)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__TRACKED_CHANGES:
				setTrackedChanges((TrackedChangesType)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__ACCEPTANCE_STATE:
				setAcceptanceState((AcceptanceStateType)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__ADD_EMPTY_LINES:
				setAddEmptyLines((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__ALGORITHM:
				setAlgorithm((String)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__ALIGN:
				setAlign((AlignType)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__ALLOW_EMPTY_CELL:
				setAllowEmptyCell((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__APPLICATION_DATA:
				setApplicationData((String)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__AUTOMATIC_FIND_LABELS:
				setAutomaticFindLabels((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__BASE_CELL_ADDRESS:
				setBaseCellAddress((String)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__BIND_STYLES_TO_CONTENT:
				setBindStylesToContent((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__BORDER_COLOR:
				setBorderColor((String)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__BORDER_MODEL:
				setBorderModel((BorderModelType)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__BUTTONS:
				setButtons((String)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__CELL_ADDRESS1:
				setCellAddress1((String)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__CELL_RANGE:
				setCellRange((String)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__CELL_RANGE_ADDRESS:
				setCellRangeAddress((String)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__COLUMN:
				setColumn((BigInteger)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__COMMENT:
				setComment((String)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__CONDITION:
				setCondition((String)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__CONDITION_SOURCE:
				setConditionSource((ConditionSourceType)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__CONDITION_SOURCE_RANGE_ADDRESS:
				setConditionSourceRangeAddress((String)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__CONTAINS_ERROR:
				setContainsError((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__CONTAINS_HEADER:
				setContainsHeader((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__CONTENT_VALIDATION_NAME:
				setContentValidationName((String)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__COPY_BACK:
				setCopyBack((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__COPY_FORMULAS:
				setCopyFormulas((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__COPY_STYLES:
				setCopyStyles((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__COUNT:
				setCount((BigInteger)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__COUNTRY:
				setCountry((String)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__DATABASE_NAME:
				setDatabaseName((String)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__DATABASE_TABLE_NAME:
				setDatabaseTableName((String)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__DATA_CELL_RANGE_ADDRESS:
				setDataCellRangeAddress((String)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__DATA_FIELD:
				setDataField((String)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__DATE_END:
				setDateEnd(newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__DATE_START:
				setDateStart(newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__DEFAULT_CELL_STYLE_NAME:
				setDefaultCellStyleName((String)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__DIRECTION:
				setDirection((DirectionType)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__DISPLAY:
				setDisplay((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__DISPLAY_BORDER:
				setDisplayBorder((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__DISPLAY_DUPLICATES:
				setDisplayDuplicates((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__DISPLAY_FILTER_BUTTONS:
				setDisplayFilterButtons((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__DISPLAY_LIST:
				setDisplayList((DisplayListType)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__DISPLAY_MEMBER_MODE:
				setDisplayMemberMode((DisplayMemberModeType)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__DRILL_DOWN_ON_DOUBLE_CLICK:
				setDrillDownOnDoubleClick((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__ENABLED:
				setEnabled((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__END:
				setEnd(newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__END_CELL_ADDRESS:
				setEndCellAddress((String)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__END_COLUMN:
				setEndColumn((BigInteger)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__END_POSITION:
				setEndPosition((BigInteger)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__END_ROW:
				setEndRow((BigInteger)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__END_TABLE:
				setEndTable((BigInteger)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__END_X:
				setEndX((String)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__END_Y:
				setEndY((String)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__EXPRESSION:
				setExpression((String)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__FIELD_NAME:
				setFieldName((String)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__FIELD_NUMBER:
				setFieldNumber((BigInteger)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__FILTER_NAME:
				setFilterName((String)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__FILTER_OPTIONS:
				setFilterOptions((String)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__FORMULA:
				setFormula((String)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__FUNCTION:
				setFunction(newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__GRAND_TOTAL:
				setGrandTotal((GrandTotalType)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__GROUP_BY_FIELD_NUMBER:
				setGroupByFieldNumber((BigInteger)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__GROUPED_BY:
				setGroupedBy((GroupedByType)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__HAS_PERSISTENT_DATA:
				setHasPersistentData((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__ID:
				setId((String)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__IDENTIFY_CATEGORIES:
				setIdentifyCategories((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__IGNORE_EMPTY_ROWS:
				setIgnoreEmptyRows((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__INDEX:
				setIndex((BigInteger)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__IS_ACTIVE:
				setIsActive((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__IS_DATA_LAYOUT_FIELD:
				setIsDataLayoutField((String)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__IS_SELECTION:
				setIsSelection((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__IS_SUB_TABLE:
				setIsSubTable((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__LABEL_CELL_RANGE_ADDRESS:
				setLabelCellRangeAddress((String)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__LANGUAGE:
				setLanguage((String)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__LAST_COLUMN_SPANNED:
				setLastColumnSpanned((BigInteger)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__LAST_ROW_SPANNED:
				setLastRowSpanned((BigInteger)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__LAYOUT_MODE:
				setLayoutMode((LayoutModeType)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__LINK_TO_SOURCE_DATA:
				setLinkToSourceData((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__MARKED_INVALID:
				setMarkedInvalid((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__MATRIX_COVERED:
				setMatrixCovered((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__MEMBER_COUNT:
				setMemberCount((BigInteger)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__MEMBER_NAME:
				setMemberName((String)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__MEMBER_TYPE:
				setMemberType((MemberTypeType)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__MODE:
				setMode((ModeType)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__MULTI_DELETION_SPANNED:
				setMultiDeletionSpanned((BigInteger)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__NULL_YEAR:
				setNullYear((BigInteger)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__NUMBER_COLUMNS_REPEATED:
				setNumberColumnsRepeated((BigInteger)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__NUMBER_COLUMNS_SPANNED:
				setNumberColumnsSpanned((BigInteger)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__NUMBER_MATRIX_COLUMNS_SPANNED:
				setNumberMatrixColumnsSpanned((BigInteger)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__NUMBER_MATRIX_ROWS_SPANNED:
				setNumberMatrixRowsSpanned((BigInteger)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__NUMBER_ROWS_REPEATED:
				setNumberRowsRepeated((BigInteger)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__NUMBER_ROWS_SPANNED:
				setNumberRowsSpanned((BigInteger)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__OBJECT_NAME:
				setObjectName((String)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__ON_UPDATE_KEEP_SIZE:
				setOnUpdateKeepSize((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__ON_UPDATE_KEEP_STYLES:
				setOnUpdateKeepStyles((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__OPERATOR:
				setOperator((String)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__ORDER:
				setOrder((OrderType)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__PAGE_BREAKS_ON_GROUP_CHANGE:
				setPageBreaksOnGroupChange((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__PARSE_SQL_STATEMENT:
				setParseSqlStatement((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__PASSWORD:
				setPassword((String)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__POSITION:
				setPosition((BigInteger)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__PRECISION_AS_SHOWN:
				setPrecisionAsShown((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__PRINT:
				setPrint((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__PRINT_RANGES:
				setPrintRanges((String)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__PROTECT:
				setProtect((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__PROTECTED:
				setProtected((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__QUERY_NAME:
				setQueryName((String)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__RANGE_USABLE_AS:
				setRangeUsableAs(newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__REJECTING_CHANGE_ID:
				setRejectingChangeId((String)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__ROW:
				setRow((BigInteger)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__SCENARIO_RANGES:
				setScenarioRanges((String)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__SEARCH_CRITERIA_MUST_APPLY_TO_WHOLE_CELL:
				setSearchCriteriaMustApplyToWholeCell((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__SELECTED_PAGE:
				setSelectedPage((String)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__SHOW_DETAILS:
				setShowDetails((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__SHOW_EMPTY:
				setShowEmpty((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__SHOW_FILTER_BUTTON:
				setShowFilterButton((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__SORT_MODE:
				setSortMode((SortModeType)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__SOURCE_CELL_RANGE_ADDRESSES:
				setSourceCellRangeAddresses((String)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__SOURCE_FIELD_NAME:
				setSourceFieldName((String)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__SOURCE_NAME:
				setSourceName((String)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__SQL_STATEMENT:
				setSqlStatement((String)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__START:
				setStart(newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__START_COLUMN:
				setStartColumn((BigInteger)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__START_POSITION:
				setStartPosition((BigInteger)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__START_ROW:
				setStartRow((BigInteger)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__START_TABLE:
				setStartTable((BigInteger)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__STEP:
				setStep(((Double)newValue).doubleValue());
				return;
			case TablePackage.DOCUMENT_ROOT__STRUCTURE_PROTECTED:
				setStructureProtected((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__STYLE_NAME:
				setStyleName((String)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__TABLE1:
				setTable1((BigInteger)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__TABLE_BACKGROUND:
				setTableBackground((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__TABLE_NAME:
				setTableName((String)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__TARGET_CELL_ADDRESS:
				setTargetCellAddress((String)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__TARGET_RANGE_ADDRESS1:
				setTargetRangeAddress1((String)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__TRACK_CHANGES:
				setTrackChanges((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__USED_HIERARCHY:
				setUsedHierarchy((BigInteger)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__USE_LABELS:
				setUseLabels((UseLabelsType)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__USE_REGULAR_EXPRESSIONS:
				setUseRegularExpressions((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__USER_NAME:
				setUserName((String)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__VALUE:
				setValue((String)newValue);
				return;
			case TablePackage.DOCUMENT_ROOT__VISIBILITY:
				setVisibility((TableVisibilityValue)newValue);
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
			case TablePackage.DOCUMENT_ROOT__MIXED:
				getMixed().clear();
				return;
			case TablePackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				getXMLNSPrefixMap().clear();
				return;
			case TablePackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				getXSISchemaLocation().clear();
				return;
			case TablePackage.DOCUMENT_ROOT__BODY:
				setBody((BodyType)null);
				return;
			case TablePackage.DOCUMENT_ROOT__CALCULATION_SETTINGS:
				setCalculationSettings((CalculationSettingsType)null);
				return;
			case TablePackage.DOCUMENT_ROOT__CELL_ADDRESS:
				setCellAddress((CellAddressType)null);
				return;
			case TablePackage.DOCUMENT_ROOT__CELL_CONTENT_CHANGE:
				setCellContentChange((CellContentChangeType)null);
				return;
			case TablePackage.DOCUMENT_ROOT__CELL_CONTENT_DELETION:
				setCellContentDeletion((CellContentDeletionType)null);
				return;
			case TablePackage.DOCUMENT_ROOT__CELL_RANGE_SOURCE:
				setCellRangeSource((CellRangeSourceType)null);
				return;
			case TablePackage.DOCUMENT_ROOT__CHANGE_DELETION:
				setChangeDeletion((ChangeDeletionType)null);
				return;
			case TablePackage.DOCUMENT_ROOT__CHANGE_TRACK_TABLE_CELL:
				setChangeTrackTableCell((ChangeTrackTableCellType)null);
				return;
			case TablePackage.DOCUMENT_ROOT__CONSOLIDATION:
				setConsolidation((ConsolidationType)null);
				return;
			case TablePackage.DOCUMENT_ROOT__CONTENT_VALIDATION:
				setContentValidation((ContentValidationType)null);
				return;
			case TablePackage.DOCUMENT_ROOT__CONTENT_VALIDATIONS:
				setContentValidations((ContentValidationsType)null);
				return;
			case TablePackage.DOCUMENT_ROOT__COVERED_TABLE_CELL:
				setCoveredTableCell((CoveredTableCellType)null);
				return;
			case TablePackage.DOCUMENT_ROOT__CUT_OFFS:
				setCutOffs((CutOffsType)null);
				return;
			case TablePackage.DOCUMENT_ROOT__DATABASE_RANGE:
				setDatabaseRange((DatabaseRangeType)null);
				return;
			case TablePackage.DOCUMENT_ROOT__DATABASE_RANGES:
				setDatabaseRanges((DatabaseRangesType)null);
				return;
			case TablePackage.DOCUMENT_ROOT__DATABASE_SOURCE_QUERY:
				setDatabaseSourceQuery((DatabaseSourceQueryType)null);
				return;
			case TablePackage.DOCUMENT_ROOT__DATABASE_SOURCE_SQL:
				setDatabaseSourceSql((DatabaseSourceSqlType)null);
				return;
			case TablePackage.DOCUMENT_ROOT__DATABASE_SOURCE_TABLE:
				setDatabaseSourceTable((DatabaseSourceTableType)null);
				return;
			case TablePackage.DOCUMENT_ROOT__DATA_PILOT_DISPLAY_INFO:
				setDataPilotDisplayInfo((DataPilotDisplayInfoType)null);
				return;
			case TablePackage.DOCUMENT_ROOT__DATA_PILOT_FIELD:
				setDataPilotField((DataPilotFieldType)null);
				return;
			case TablePackage.DOCUMENT_ROOT__DATA_PILOT_FIELD_REFERENCE:
				setDataPilotFieldReference((DataPilotFieldReferenceType)null);
				return;
			case TablePackage.DOCUMENT_ROOT__DATA_PILOT_GROUP:
				setDataPilotGroup((DataPilotGroupType)null);
				return;
			case TablePackage.DOCUMENT_ROOT__DATA_PILOT_GROUP_MEMBER:
				setDataPilotGroupMember((DataPilotGroupMemberType)null);
				return;
			case TablePackage.DOCUMENT_ROOT__DATA_PILOT_GROUPS:
				setDataPilotGroups((DataPilotGroupsType)null);
				return;
			case TablePackage.DOCUMENT_ROOT__DATA_PILOT_LAYOUT_INFO:
				setDataPilotLayoutInfo((DataPilotLayoutInfoType)null);
				return;
			case TablePackage.DOCUMENT_ROOT__DATA_PILOT_LEVEL:
				setDataPilotLevel((DataPilotLevelType)null);
				return;
			case TablePackage.DOCUMENT_ROOT__DATA_PILOT_MEMBER:
				setDataPilotMember((DataPilotMemberType)null);
				return;
			case TablePackage.DOCUMENT_ROOT__DATA_PILOT_MEMBERS:
				setDataPilotMembers((DataPilotMembersType)null);
				return;
			case TablePackage.DOCUMENT_ROOT__DATA_PILOT_SORT_INFO:
				setDataPilotSortInfo((DataPilotSortInfoType)null);
				return;
			case TablePackage.DOCUMENT_ROOT__DATA_PILOT_SUBTOTAL:
				setDataPilotSubtotal((DataPilotSubtotalType)null);
				return;
			case TablePackage.DOCUMENT_ROOT__DATA_PILOT_SUBTOTALS:
				setDataPilotSubtotals((DataPilotSubtotalsType)null);
				return;
			case TablePackage.DOCUMENT_ROOT__DATA_PILOT_TABLE:
				setDataPilotTable((DataPilotTableType)null);
				return;
			case TablePackage.DOCUMENT_ROOT__DATA_PILOT_TABLES:
				setDataPilotTables((DataPilotTablesType)null);
				return;
			case TablePackage.DOCUMENT_ROOT__DDE_LINK:
				setDdeLink((DdeLinkType)null);
				return;
			case TablePackage.DOCUMENT_ROOT__DDE_LINKS:
				setDdeLinks((DdeLinksType)null);
				return;
			case TablePackage.DOCUMENT_ROOT__DELETION:
				setDeletion((DeletionType)null);
				return;
			case TablePackage.DOCUMENT_ROOT__DELETIONS:
				setDeletions((DeletionsType)null);
				return;
			case TablePackage.DOCUMENT_ROOT__DEPENDENCIES:
				setDependencies((DependenciesType)null);
				return;
			case TablePackage.DOCUMENT_ROOT__DEPENDENCY:
				setDependency((DependencyType)null);
				return;
			case TablePackage.DOCUMENT_ROOT__DETECTIVE:
				setDetective((DetectiveType)null);
				return;
			case TablePackage.DOCUMENT_ROOT__ERROR_MACRO:
				setErrorMacro((ErrorMacroType)null);
				return;
			case TablePackage.DOCUMENT_ROOT__ERROR_MESSAGE:
				setErrorMessage((ErrorMessageType)null);
				return;
			case TablePackage.DOCUMENT_ROOT__EVEN_COLUMNS:
				setEvenColumns((EvenColumnsType)null);
				return;
			case TablePackage.DOCUMENT_ROOT__EVEN_ROWS:
				setEvenRows((EvenRowsType)null);
				return;
			case TablePackage.DOCUMENT_ROOT__FILTER:
				setFilter((FilterType)null);
				return;
			case TablePackage.DOCUMENT_ROOT__FILTER_AND:
				setFilterAnd((FilterAndType)null);
				return;
			case TablePackage.DOCUMENT_ROOT__FILTER_CONDITION:
				setFilterCondition((FilterConditionType)null);
				return;
			case TablePackage.DOCUMENT_ROOT__FILTER_OR:
				setFilterOr((FilterOrType)null);
				return;
			case TablePackage.DOCUMENT_ROOT__FIRST_COLUMN:
				setFirstColumn((FirstColumnType)null);
				return;
			case TablePackage.DOCUMENT_ROOT__FIRST_ROW:
				setFirstRow((FirstRowType)null);
				return;
			case TablePackage.DOCUMENT_ROOT__HELP_MESSAGE:
				setHelpMessage((HelpMessageType)null);
				return;
			case TablePackage.DOCUMENT_ROOT__HIGHLIGHTED_RANGE:
				setHighlightedRange((HighlightedRangeType)null);
				return;
			case TablePackage.DOCUMENT_ROOT__INSERTION:
				setInsertion((InsertionType)null);
				return;
			case TablePackage.DOCUMENT_ROOT__INSERTION_CUT_OFF:
				setInsertionCutOff((InsertionCutOffType)null);
				return;
			case TablePackage.DOCUMENT_ROOT__ITERATION:
				setIteration((IterationType)null);
				return;
			case TablePackage.DOCUMENT_ROOT__LABEL_RANGE:
				setLabelRange((LabelRangeType)null);
				return;
			case TablePackage.DOCUMENT_ROOT__LABEL_RANGES:
				setLabelRanges((LabelRangesType)null);
				return;
			case TablePackage.DOCUMENT_ROOT__LAST_COLUMN:
				setLastColumn((LastColumnType)null);
				return;
			case TablePackage.DOCUMENT_ROOT__LAST_ROW:
				setLastRow((LastRowType)null);
				return;
			case TablePackage.DOCUMENT_ROOT__MOVEMENT:
				setMovement((MovementType)null);
				return;
			case TablePackage.DOCUMENT_ROOT__MOVEMENT_CUT_OFF:
				setMovementCutOff((MovementCutOffType)null);
				return;
			case TablePackage.DOCUMENT_ROOT__NAMED_EXPRESSION:
				setNamedExpression((NamedExpressionType)null);
				return;
			case TablePackage.DOCUMENT_ROOT__NAMED_EXPRESSIONS:
				setNamedExpressions((NamedExpressionsType)null);
				return;
			case TablePackage.DOCUMENT_ROOT__NAMED_RANGE:
				setNamedRange((NamedRangeType)null);
				return;
			case TablePackage.DOCUMENT_ROOT__NULL_DATE:
				setNullDate((NullDateType)null);
				return;
			case TablePackage.DOCUMENT_ROOT__ODD_COLUMNS:
				setOddColumns((OddColumnsType)null);
				return;
			case TablePackage.DOCUMENT_ROOT__ODD_ROWS:
				setOddRows((OddRowsType)null);
				return;
			case TablePackage.DOCUMENT_ROOT__OPERATION:
				setOperation((OperationType)null);
				return;
			case TablePackage.DOCUMENT_ROOT__PREVIOUS:
				setPrevious((PreviousType)null);
				return;
			case TablePackage.DOCUMENT_ROOT__SCENARIO:
				setScenario((ScenarioType)null);
				return;
			case TablePackage.DOCUMENT_ROOT__SHAPES:
				setShapes((ShapesType)null);
				return;
			case TablePackage.DOCUMENT_ROOT__SORT:
				setSort((SortType)null);
				return;
			case TablePackage.DOCUMENT_ROOT__SORT_BY:
				setSortBy((SortByType)null);
				return;
			case TablePackage.DOCUMENT_ROOT__SORT_GROUPS:
				setSortGroups((SortGroupsType)null);
				return;
			case TablePackage.DOCUMENT_ROOT__SOURCE_CELL_RANGE:
				setSourceCellRange((SourceCellRangeType)null);
				return;
			case TablePackage.DOCUMENT_ROOT__SOURCE_RANGE_ADDRESS:
				setSourceRangeAddress((SourceRangeAddressType)null);
				return;
			case TablePackage.DOCUMENT_ROOT__SOURCE_SERVICE:
				setSourceService((SourceServiceType)null);
				return;
			case TablePackage.DOCUMENT_ROOT__SUBTOTAL_FIELD:
				setSubtotalField((SubtotalFieldType)null);
				return;
			case TablePackage.DOCUMENT_ROOT__SUBTOTAL_RULE:
				setSubtotalRule((SubtotalRuleType)null);
				return;
			case TablePackage.DOCUMENT_ROOT__SUBTOTAL_RULES:
				setSubtotalRules((SubtotalRulesType)null);
				return;
			case TablePackage.DOCUMENT_ROOT__TABLE:
				setTable((TableType)null);
				return;
			case TablePackage.DOCUMENT_ROOT__TABLE_CELL:
				setTableCell((TableCellType)null);
				return;
			case TablePackage.DOCUMENT_ROOT__TABLE_COLUMN:
				setTableColumn((TableColumnType)null);
				return;
			case TablePackage.DOCUMENT_ROOT__TABLE_COLUMN_GROUP:
				setTableColumnGroup((TableColumnGroupType)null);
				return;
			case TablePackage.DOCUMENT_ROOT__TABLE_COLUMNS:
				setTableColumns((TableColumnsType)null);
				return;
			case TablePackage.DOCUMENT_ROOT__TABLE_HEADER_COLUMNS:
				setTableHeaderColumns((TableHeaderColumnsType)null);
				return;
			case TablePackage.DOCUMENT_ROOT__TABLE_HEADER_ROWS:
				setTableHeaderRows((TableHeaderRowsType)null);
				return;
			case TablePackage.DOCUMENT_ROOT__TABLE_ROW:
				setTableRow((TableRowType)null);
				return;
			case TablePackage.DOCUMENT_ROOT__TABLE_ROW_GROUP:
				setTableRowGroup((TableRowGroupType)null);
				return;
			case TablePackage.DOCUMENT_ROOT__TABLE_ROWS:
				setTableRows((TableRowsType)null);
				return;
			case TablePackage.DOCUMENT_ROOT__TABLE_SOURCE:
				setTableSource((TableSourceType)null);
				return;
			case TablePackage.DOCUMENT_ROOT__TABLE_TEMPLATE:
				setTableTemplate((TableTemplateType)null);
				return;
			case TablePackage.DOCUMENT_ROOT__TARGET_RANGE_ADDRESS:
				setTargetRangeAddress((TargetRangeAddressType)null);
				return;
			case TablePackage.DOCUMENT_ROOT__TRACKED_CHANGES:
				setTrackedChanges((TrackedChangesType)null);
				return;
			case TablePackage.DOCUMENT_ROOT__ACCEPTANCE_STATE:
				unsetAcceptanceState();
				return;
			case TablePackage.DOCUMENT_ROOT__ADD_EMPTY_LINES:
				unsetAddEmptyLines();
				return;
			case TablePackage.DOCUMENT_ROOT__ALGORITHM:
				setAlgorithm(ALGORITHM_EDEFAULT);
				return;
			case TablePackage.DOCUMENT_ROOT__ALIGN:
				unsetAlign();
				return;
			case TablePackage.DOCUMENT_ROOT__ALLOW_EMPTY_CELL:
				unsetAllowEmptyCell();
				return;
			case TablePackage.DOCUMENT_ROOT__APPLICATION_DATA:
				setApplicationData(APPLICATION_DATA_EDEFAULT);
				return;
			case TablePackage.DOCUMENT_ROOT__AUTOMATIC_FIND_LABELS:
				unsetAutomaticFindLabels();
				return;
			case TablePackage.DOCUMENT_ROOT__BASE_CELL_ADDRESS:
				setBaseCellAddress(BASE_CELL_ADDRESS_EDEFAULT);
				return;
			case TablePackage.DOCUMENT_ROOT__BIND_STYLES_TO_CONTENT:
				unsetBindStylesToContent();
				return;
			case TablePackage.DOCUMENT_ROOT__BORDER_COLOR:
				setBorderColor(BORDER_COLOR_EDEFAULT);
				return;
			case TablePackage.DOCUMENT_ROOT__BORDER_MODEL:
				unsetBorderModel();
				return;
			case TablePackage.DOCUMENT_ROOT__BUTTONS:
				setButtons(BUTTONS_EDEFAULT);
				return;
			case TablePackage.DOCUMENT_ROOT__CELL_ADDRESS1:
				setCellAddress1(CELL_ADDRESS1_EDEFAULT);
				return;
			case TablePackage.DOCUMENT_ROOT__CELL_RANGE:
				setCellRange(CELL_RANGE_EDEFAULT);
				return;
			case TablePackage.DOCUMENT_ROOT__CELL_RANGE_ADDRESS:
				setCellRangeAddress(CELL_RANGE_ADDRESS_EDEFAULT);
				return;
			case TablePackage.DOCUMENT_ROOT__COLUMN:
				setColumn(COLUMN_EDEFAULT);
				return;
			case TablePackage.DOCUMENT_ROOT__COMMENT:
				setComment(COMMENT_EDEFAULT);
				return;
			case TablePackage.DOCUMENT_ROOT__CONDITION:
				setCondition(CONDITION_EDEFAULT);
				return;
			case TablePackage.DOCUMENT_ROOT__CONDITION_SOURCE:
				unsetConditionSource();
				return;
			case TablePackage.DOCUMENT_ROOT__CONDITION_SOURCE_RANGE_ADDRESS:
				setConditionSourceRangeAddress(CONDITION_SOURCE_RANGE_ADDRESS_EDEFAULT);
				return;
			case TablePackage.DOCUMENT_ROOT__CONTAINS_ERROR:
				unsetContainsError();
				return;
			case TablePackage.DOCUMENT_ROOT__CONTAINS_HEADER:
				unsetContainsHeader();
				return;
			case TablePackage.DOCUMENT_ROOT__CONTENT_VALIDATION_NAME:
				setContentValidationName(CONTENT_VALIDATION_NAME_EDEFAULT);
				return;
			case TablePackage.DOCUMENT_ROOT__COPY_BACK:
				unsetCopyBack();
				return;
			case TablePackage.DOCUMENT_ROOT__COPY_FORMULAS:
				unsetCopyFormulas();
				return;
			case TablePackage.DOCUMENT_ROOT__COPY_STYLES:
				unsetCopyStyles();
				return;
			case TablePackage.DOCUMENT_ROOT__COUNT:
				setCount(COUNT_EDEFAULT);
				return;
			case TablePackage.DOCUMENT_ROOT__COUNTRY:
				setCountry(COUNTRY_EDEFAULT);
				return;
			case TablePackage.DOCUMENT_ROOT__DATABASE_NAME:
				setDatabaseName(DATABASE_NAME_EDEFAULT);
				return;
			case TablePackage.DOCUMENT_ROOT__DATABASE_TABLE_NAME:
				setDatabaseTableName(DATABASE_TABLE_NAME_EDEFAULT);
				return;
			case TablePackage.DOCUMENT_ROOT__DATA_CELL_RANGE_ADDRESS:
				setDataCellRangeAddress(DATA_CELL_RANGE_ADDRESS_EDEFAULT);
				return;
			case TablePackage.DOCUMENT_ROOT__DATA_FIELD:
				setDataField(DATA_FIELD_EDEFAULT);
				return;
			case TablePackage.DOCUMENT_ROOT__DATE_END:
				setDateEnd(DATE_END_EDEFAULT);
				return;
			case TablePackage.DOCUMENT_ROOT__DATE_START:
				setDateStart(DATE_START_EDEFAULT);
				return;
			case TablePackage.DOCUMENT_ROOT__DEFAULT_CELL_STYLE_NAME:
				setDefaultCellStyleName(DEFAULT_CELL_STYLE_NAME_EDEFAULT);
				return;
			case TablePackage.DOCUMENT_ROOT__DIRECTION:
				unsetDirection();
				return;
			case TablePackage.DOCUMENT_ROOT__DISPLAY:
				unsetDisplay();
				return;
			case TablePackage.DOCUMENT_ROOT__DISPLAY_BORDER:
				unsetDisplayBorder();
				return;
			case TablePackage.DOCUMENT_ROOT__DISPLAY_DUPLICATES:
				unsetDisplayDuplicates();
				return;
			case TablePackage.DOCUMENT_ROOT__DISPLAY_FILTER_BUTTONS:
				unsetDisplayFilterButtons();
				return;
			case TablePackage.DOCUMENT_ROOT__DISPLAY_LIST:
				unsetDisplayList();
				return;
			case TablePackage.DOCUMENT_ROOT__DISPLAY_MEMBER_MODE:
				unsetDisplayMemberMode();
				return;
			case TablePackage.DOCUMENT_ROOT__DRILL_DOWN_ON_DOUBLE_CLICK:
				unsetDrillDownOnDoubleClick();
				return;
			case TablePackage.DOCUMENT_ROOT__ENABLED:
				unsetEnabled();
				return;
			case TablePackage.DOCUMENT_ROOT__END:
				setEnd(END_EDEFAULT);
				return;
			case TablePackage.DOCUMENT_ROOT__END_CELL_ADDRESS:
				setEndCellAddress(END_CELL_ADDRESS_EDEFAULT);
				return;
			case TablePackage.DOCUMENT_ROOT__END_COLUMN:
				setEndColumn(END_COLUMN_EDEFAULT);
				return;
			case TablePackage.DOCUMENT_ROOT__END_POSITION:
				setEndPosition(END_POSITION_EDEFAULT);
				return;
			case TablePackage.DOCUMENT_ROOT__END_ROW:
				setEndRow(END_ROW_EDEFAULT);
				return;
			case TablePackage.DOCUMENT_ROOT__END_TABLE:
				setEndTable(END_TABLE_EDEFAULT);
				return;
			case TablePackage.DOCUMENT_ROOT__END_X:
				setEndX(END_X_EDEFAULT);
				return;
			case TablePackage.DOCUMENT_ROOT__END_Y:
				setEndY(END_Y_EDEFAULT);
				return;
			case TablePackage.DOCUMENT_ROOT__EXPRESSION:
				setExpression(EXPRESSION_EDEFAULT);
				return;
			case TablePackage.DOCUMENT_ROOT__FIELD_NAME:
				setFieldName(FIELD_NAME_EDEFAULT);
				return;
			case TablePackage.DOCUMENT_ROOT__FIELD_NUMBER:
				setFieldNumber(FIELD_NUMBER_EDEFAULT);
				return;
			case TablePackage.DOCUMENT_ROOT__FILTER_NAME:
				setFilterName(FILTER_NAME_EDEFAULT);
				return;
			case TablePackage.DOCUMENT_ROOT__FILTER_OPTIONS:
				setFilterOptions(FILTER_OPTIONS_EDEFAULT);
				return;
			case TablePackage.DOCUMENT_ROOT__FORMULA:
				setFormula(FORMULA_EDEFAULT);
				return;
			case TablePackage.DOCUMENT_ROOT__FUNCTION:
				setFunction(FUNCTION_EDEFAULT);
				return;
			case TablePackage.DOCUMENT_ROOT__GRAND_TOTAL:
				unsetGrandTotal();
				return;
			case TablePackage.DOCUMENT_ROOT__GROUP_BY_FIELD_NUMBER:
				setGroupByFieldNumber(GROUP_BY_FIELD_NUMBER_EDEFAULT);
				return;
			case TablePackage.DOCUMENT_ROOT__GROUPED_BY:
				unsetGroupedBy();
				return;
			case TablePackage.DOCUMENT_ROOT__HAS_PERSISTENT_DATA:
				unsetHasPersistentData();
				return;
			case TablePackage.DOCUMENT_ROOT__ID:
				setId(ID_EDEFAULT);
				return;
			case TablePackage.DOCUMENT_ROOT__IDENTIFY_CATEGORIES:
				unsetIdentifyCategories();
				return;
			case TablePackage.DOCUMENT_ROOT__IGNORE_EMPTY_ROWS:
				unsetIgnoreEmptyRows();
				return;
			case TablePackage.DOCUMENT_ROOT__INDEX:
				setIndex(INDEX_EDEFAULT);
				return;
			case TablePackage.DOCUMENT_ROOT__IS_ACTIVE:
				unsetIsActive();
				return;
			case TablePackage.DOCUMENT_ROOT__IS_DATA_LAYOUT_FIELD:
				setIsDataLayoutField(IS_DATA_LAYOUT_FIELD_EDEFAULT);
				return;
			case TablePackage.DOCUMENT_ROOT__IS_SELECTION:
				unsetIsSelection();
				return;
			case TablePackage.DOCUMENT_ROOT__IS_SUB_TABLE:
				unsetIsSubTable();
				return;
			case TablePackage.DOCUMENT_ROOT__LABEL_CELL_RANGE_ADDRESS:
				setLabelCellRangeAddress(LABEL_CELL_RANGE_ADDRESS_EDEFAULT);
				return;
			case TablePackage.DOCUMENT_ROOT__LANGUAGE:
				setLanguage(LANGUAGE_EDEFAULT);
				return;
			case TablePackage.DOCUMENT_ROOT__LAST_COLUMN_SPANNED:
				setLastColumnSpanned(LAST_COLUMN_SPANNED_EDEFAULT);
				return;
			case TablePackage.DOCUMENT_ROOT__LAST_ROW_SPANNED:
				setLastRowSpanned(LAST_ROW_SPANNED_EDEFAULT);
				return;
			case TablePackage.DOCUMENT_ROOT__LAYOUT_MODE:
				unsetLayoutMode();
				return;
			case TablePackage.DOCUMENT_ROOT__LINK_TO_SOURCE_DATA:
				unsetLinkToSourceData();
				return;
			case TablePackage.DOCUMENT_ROOT__MARKED_INVALID:
				unsetMarkedInvalid();
				return;
			case TablePackage.DOCUMENT_ROOT__MATRIX_COVERED:
				unsetMatrixCovered();
				return;
			case TablePackage.DOCUMENT_ROOT__MEMBER_COUNT:
				setMemberCount(MEMBER_COUNT_EDEFAULT);
				return;
			case TablePackage.DOCUMENT_ROOT__MEMBER_NAME:
				setMemberName(MEMBER_NAME_EDEFAULT);
				return;
			case TablePackage.DOCUMENT_ROOT__MEMBER_TYPE:
				unsetMemberType();
				return;
			case TablePackage.DOCUMENT_ROOT__MODE:
				unsetMode();
				return;
			case TablePackage.DOCUMENT_ROOT__MULTI_DELETION_SPANNED:
				setMultiDeletionSpanned(MULTI_DELETION_SPANNED_EDEFAULT);
				return;
			case TablePackage.DOCUMENT_ROOT__NULL_YEAR:
				setNullYear(NULL_YEAR_EDEFAULT);
				return;
			case TablePackage.DOCUMENT_ROOT__NUMBER_COLUMNS_REPEATED:
				setNumberColumnsRepeated(NUMBER_COLUMNS_REPEATED_EDEFAULT);
				return;
			case TablePackage.DOCUMENT_ROOT__NUMBER_COLUMNS_SPANNED:
				setNumberColumnsSpanned(NUMBER_COLUMNS_SPANNED_EDEFAULT);
				return;
			case TablePackage.DOCUMENT_ROOT__NUMBER_MATRIX_COLUMNS_SPANNED:
				setNumberMatrixColumnsSpanned(NUMBER_MATRIX_COLUMNS_SPANNED_EDEFAULT);
				return;
			case TablePackage.DOCUMENT_ROOT__NUMBER_MATRIX_ROWS_SPANNED:
				setNumberMatrixRowsSpanned(NUMBER_MATRIX_ROWS_SPANNED_EDEFAULT);
				return;
			case TablePackage.DOCUMENT_ROOT__NUMBER_ROWS_REPEATED:
				setNumberRowsRepeated(NUMBER_ROWS_REPEATED_EDEFAULT);
				return;
			case TablePackage.DOCUMENT_ROOT__NUMBER_ROWS_SPANNED:
				setNumberRowsSpanned(NUMBER_ROWS_SPANNED_EDEFAULT);
				return;
			case TablePackage.DOCUMENT_ROOT__OBJECT_NAME:
				setObjectName(OBJECT_NAME_EDEFAULT);
				return;
			case TablePackage.DOCUMENT_ROOT__ON_UPDATE_KEEP_SIZE:
				unsetOnUpdateKeepSize();
				return;
			case TablePackage.DOCUMENT_ROOT__ON_UPDATE_KEEP_STYLES:
				unsetOnUpdateKeepStyles();
				return;
			case TablePackage.DOCUMENT_ROOT__OPERATOR:
				setOperator(OPERATOR_EDEFAULT);
				return;
			case TablePackage.DOCUMENT_ROOT__ORDER:
				unsetOrder();
				return;
			case TablePackage.DOCUMENT_ROOT__PAGE_BREAKS_ON_GROUP_CHANGE:
				unsetPageBreaksOnGroupChange();
				return;
			case TablePackage.DOCUMENT_ROOT__PARSE_SQL_STATEMENT:
				unsetParseSqlStatement();
				return;
			case TablePackage.DOCUMENT_ROOT__PASSWORD:
				setPassword(PASSWORD_EDEFAULT);
				return;
			case TablePackage.DOCUMENT_ROOT__POSITION:
				setPosition(POSITION_EDEFAULT);
				return;
			case TablePackage.DOCUMENT_ROOT__PRECISION_AS_SHOWN:
				unsetPrecisionAsShown();
				return;
			case TablePackage.DOCUMENT_ROOT__PRINT:
				unsetPrint();
				return;
			case TablePackage.DOCUMENT_ROOT__PRINT_RANGES:
				setPrintRanges(PRINT_RANGES_EDEFAULT);
				return;
			case TablePackage.DOCUMENT_ROOT__PROTECT:
				unsetProtect();
				return;
			case TablePackage.DOCUMENT_ROOT__PROTECTED:
				unsetProtected();
				return;
			case TablePackage.DOCUMENT_ROOT__QUERY_NAME:
				setQueryName(QUERY_NAME_EDEFAULT);
				return;
			case TablePackage.DOCUMENT_ROOT__RANGE_USABLE_AS:
				setRangeUsableAs(RANGE_USABLE_AS_EDEFAULT);
				return;
			case TablePackage.DOCUMENT_ROOT__REJECTING_CHANGE_ID:
				setRejectingChangeId(REJECTING_CHANGE_ID_EDEFAULT);
				return;
			case TablePackage.DOCUMENT_ROOT__ROW:
				setRow(ROW_EDEFAULT);
				return;
			case TablePackage.DOCUMENT_ROOT__SCENARIO_RANGES:
				setScenarioRanges(SCENARIO_RANGES_EDEFAULT);
				return;
			case TablePackage.DOCUMENT_ROOT__SEARCH_CRITERIA_MUST_APPLY_TO_WHOLE_CELL:
				unsetSearchCriteriaMustApplyToWholeCell();
				return;
			case TablePackage.DOCUMENT_ROOT__SELECTED_PAGE:
				setSelectedPage(SELECTED_PAGE_EDEFAULT);
				return;
			case TablePackage.DOCUMENT_ROOT__SHOW_DETAILS:
				unsetShowDetails();
				return;
			case TablePackage.DOCUMENT_ROOT__SHOW_EMPTY:
				unsetShowEmpty();
				return;
			case TablePackage.DOCUMENT_ROOT__SHOW_FILTER_BUTTON:
				unsetShowFilterButton();
				return;
			case TablePackage.DOCUMENT_ROOT__SORT_MODE:
				unsetSortMode();
				return;
			case TablePackage.DOCUMENT_ROOT__SOURCE_CELL_RANGE_ADDRESSES:
				setSourceCellRangeAddresses(SOURCE_CELL_RANGE_ADDRESSES_EDEFAULT);
				return;
			case TablePackage.DOCUMENT_ROOT__SOURCE_FIELD_NAME:
				setSourceFieldName(SOURCE_FIELD_NAME_EDEFAULT);
				return;
			case TablePackage.DOCUMENT_ROOT__SOURCE_NAME:
				setSourceName(SOURCE_NAME_EDEFAULT);
				return;
			case TablePackage.DOCUMENT_ROOT__SQL_STATEMENT:
				setSqlStatement(SQL_STATEMENT_EDEFAULT);
				return;
			case TablePackage.DOCUMENT_ROOT__START:
				setStart(START_EDEFAULT);
				return;
			case TablePackage.DOCUMENT_ROOT__START_COLUMN:
				setStartColumn(START_COLUMN_EDEFAULT);
				return;
			case TablePackage.DOCUMENT_ROOT__START_POSITION:
				setStartPosition(START_POSITION_EDEFAULT);
				return;
			case TablePackage.DOCUMENT_ROOT__START_ROW:
				setStartRow(START_ROW_EDEFAULT);
				return;
			case TablePackage.DOCUMENT_ROOT__START_TABLE:
				setStartTable(START_TABLE_EDEFAULT);
				return;
			case TablePackage.DOCUMENT_ROOT__STEP:
				unsetStep();
				return;
			case TablePackage.DOCUMENT_ROOT__STRUCTURE_PROTECTED:
				unsetStructureProtected();
				return;
			case TablePackage.DOCUMENT_ROOT__STYLE_NAME:
				setStyleName(STYLE_NAME_EDEFAULT);
				return;
			case TablePackage.DOCUMENT_ROOT__TABLE1:
				setTable1(TABLE1_EDEFAULT);
				return;
			case TablePackage.DOCUMENT_ROOT__TABLE_BACKGROUND:
				unsetTableBackground();
				return;
			case TablePackage.DOCUMENT_ROOT__TABLE_NAME:
				setTableName(TABLE_NAME_EDEFAULT);
				return;
			case TablePackage.DOCUMENT_ROOT__TARGET_CELL_ADDRESS:
				setTargetCellAddress(TARGET_CELL_ADDRESS_EDEFAULT);
				return;
			case TablePackage.DOCUMENT_ROOT__TARGET_RANGE_ADDRESS1:
				setTargetRangeAddress1(TARGET_RANGE_ADDRESS1_EDEFAULT);
				return;
			case TablePackage.DOCUMENT_ROOT__TRACK_CHANGES:
				unsetTrackChanges();
				return;
			case TablePackage.DOCUMENT_ROOT__USED_HIERARCHY:
				setUsedHierarchy(USED_HIERARCHY_EDEFAULT);
				return;
			case TablePackage.DOCUMENT_ROOT__USE_LABELS:
				unsetUseLabels();
				return;
			case TablePackage.DOCUMENT_ROOT__USE_REGULAR_EXPRESSIONS:
				unsetUseRegularExpressions();
				return;
			case TablePackage.DOCUMENT_ROOT__USER_NAME:
				setUserName(USER_NAME_EDEFAULT);
				return;
			case TablePackage.DOCUMENT_ROOT__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case TablePackage.DOCUMENT_ROOT__VISIBILITY:
				unsetVisibility();
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
			case TablePackage.DOCUMENT_ROOT__MIXED:
				return mixed != null && !mixed.isEmpty();
			case TablePackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
			case TablePackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
			case TablePackage.DOCUMENT_ROOT__BODY:
				return getBody() != null;
			case TablePackage.DOCUMENT_ROOT__CALCULATION_SETTINGS:
				return getCalculationSettings() != null;
			case TablePackage.DOCUMENT_ROOT__CELL_ADDRESS:
				return getCellAddress() != null;
			case TablePackage.DOCUMENT_ROOT__CELL_CONTENT_CHANGE:
				return getCellContentChange() != null;
			case TablePackage.DOCUMENT_ROOT__CELL_CONTENT_DELETION:
				return getCellContentDeletion() != null;
			case TablePackage.DOCUMENT_ROOT__CELL_RANGE_SOURCE:
				return getCellRangeSource() != null;
			case TablePackage.DOCUMENT_ROOT__CHANGE_DELETION:
				return getChangeDeletion() != null;
			case TablePackage.DOCUMENT_ROOT__CHANGE_TRACK_TABLE_CELL:
				return getChangeTrackTableCell() != null;
			case TablePackage.DOCUMENT_ROOT__CONSOLIDATION:
				return getConsolidation() != null;
			case TablePackage.DOCUMENT_ROOT__CONTENT_VALIDATION:
				return getContentValidation() != null;
			case TablePackage.DOCUMENT_ROOT__CONTENT_VALIDATIONS:
				return getContentValidations() != null;
			case TablePackage.DOCUMENT_ROOT__COVERED_TABLE_CELL:
				return getCoveredTableCell() != null;
			case TablePackage.DOCUMENT_ROOT__CUT_OFFS:
				return getCutOffs() != null;
			case TablePackage.DOCUMENT_ROOT__DATABASE_RANGE:
				return getDatabaseRange() != null;
			case TablePackage.DOCUMENT_ROOT__DATABASE_RANGES:
				return getDatabaseRanges() != null;
			case TablePackage.DOCUMENT_ROOT__DATABASE_SOURCE_QUERY:
				return getDatabaseSourceQuery() != null;
			case TablePackage.DOCUMENT_ROOT__DATABASE_SOURCE_SQL:
				return getDatabaseSourceSql() != null;
			case TablePackage.DOCUMENT_ROOT__DATABASE_SOURCE_TABLE:
				return getDatabaseSourceTable() != null;
			case TablePackage.DOCUMENT_ROOT__DATA_PILOT_DISPLAY_INFO:
				return getDataPilotDisplayInfo() != null;
			case TablePackage.DOCUMENT_ROOT__DATA_PILOT_FIELD:
				return getDataPilotField() != null;
			case TablePackage.DOCUMENT_ROOT__DATA_PILOT_FIELD_REFERENCE:
				return getDataPilotFieldReference() != null;
			case TablePackage.DOCUMENT_ROOT__DATA_PILOT_GROUP:
				return getDataPilotGroup() != null;
			case TablePackage.DOCUMENT_ROOT__DATA_PILOT_GROUP_MEMBER:
				return getDataPilotGroupMember() != null;
			case TablePackage.DOCUMENT_ROOT__DATA_PILOT_GROUPS:
				return getDataPilotGroups() != null;
			case TablePackage.DOCUMENT_ROOT__DATA_PILOT_LAYOUT_INFO:
				return getDataPilotLayoutInfo() != null;
			case TablePackage.DOCUMENT_ROOT__DATA_PILOT_LEVEL:
				return getDataPilotLevel() != null;
			case TablePackage.DOCUMENT_ROOT__DATA_PILOT_MEMBER:
				return getDataPilotMember() != null;
			case TablePackage.DOCUMENT_ROOT__DATA_PILOT_MEMBERS:
				return getDataPilotMembers() != null;
			case TablePackage.DOCUMENT_ROOT__DATA_PILOT_SORT_INFO:
				return getDataPilotSortInfo() != null;
			case TablePackage.DOCUMENT_ROOT__DATA_PILOT_SUBTOTAL:
				return getDataPilotSubtotal() != null;
			case TablePackage.DOCUMENT_ROOT__DATA_PILOT_SUBTOTALS:
				return getDataPilotSubtotals() != null;
			case TablePackage.DOCUMENT_ROOT__DATA_PILOT_TABLE:
				return getDataPilotTable() != null;
			case TablePackage.DOCUMENT_ROOT__DATA_PILOT_TABLES:
				return getDataPilotTables() != null;
			case TablePackage.DOCUMENT_ROOT__DDE_LINK:
				return getDdeLink() != null;
			case TablePackage.DOCUMENT_ROOT__DDE_LINKS:
				return getDdeLinks() != null;
			case TablePackage.DOCUMENT_ROOT__DELETION:
				return getDeletion() != null;
			case TablePackage.DOCUMENT_ROOT__DELETIONS:
				return getDeletions() != null;
			case TablePackage.DOCUMENT_ROOT__DEPENDENCIES:
				return getDependencies() != null;
			case TablePackage.DOCUMENT_ROOT__DEPENDENCY:
				return getDependency() != null;
			case TablePackage.DOCUMENT_ROOT__DETECTIVE:
				return getDetective() != null;
			case TablePackage.DOCUMENT_ROOT__ERROR_MACRO:
				return getErrorMacro() != null;
			case TablePackage.DOCUMENT_ROOT__ERROR_MESSAGE:
				return getErrorMessage() != null;
			case TablePackage.DOCUMENT_ROOT__EVEN_COLUMNS:
				return getEvenColumns() != null;
			case TablePackage.DOCUMENT_ROOT__EVEN_ROWS:
				return getEvenRows() != null;
			case TablePackage.DOCUMENT_ROOT__FILTER:
				return getFilter() != null;
			case TablePackage.DOCUMENT_ROOT__FILTER_AND:
				return getFilterAnd() != null;
			case TablePackage.DOCUMENT_ROOT__FILTER_CONDITION:
				return getFilterCondition() != null;
			case TablePackage.DOCUMENT_ROOT__FILTER_OR:
				return getFilterOr() != null;
			case TablePackage.DOCUMENT_ROOT__FIRST_COLUMN:
				return getFirstColumn() != null;
			case TablePackage.DOCUMENT_ROOT__FIRST_ROW:
				return getFirstRow() != null;
			case TablePackage.DOCUMENT_ROOT__HELP_MESSAGE:
				return getHelpMessage() != null;
			case TablePackage.DOCUMENT_ROOT__HIGHLIGHTED_RANGE:
				return getHighlightedRange() != null;
			case TablePackage.DOCUMENT_ROOT__INSERTION:
				return getInsertion() != null;
			case TablePackage.DOCUMENT_ROOT__INSERTION_CUT_OFF:
				return getInsertionCutOff() != null;
			case TablePackage.DOCUMENT_ROOT__ITERATION:
				return getIteration() != null;
			case TablePackage.DOCUMENT_ROOT__LABEL_RANGE:
				return getLabelRange() != null;
			case TablePackage.DOCUMENT_ROOT__LABEL_RANGES:
				return getLabelRanges() != null;
			case TablePackage.DOCUMENT_ROOT__LAST_COLUMN:
				return getLastColumn() != null;
			case TablePackage.DOCUMENT_ROOT__LAST_ROW:
				return getLastRow() != null;
			case TablePackage.DOCUMENT_ROOT__MOVEMENT:
				return getMovement() != null;
			case TablePackage.DOCUMENT_ROOT__MOVEMENT_CUT_OFF:
				return getMovementCutOff() != null;
			case TablePackage.DOCUMENT_ROOT__NAMED_EXPRESSION:
				return getNamedExpression() != null;
			case TablePackage.DOCUMENT_ROOT__NAMED_EXPRESSIONS:
				return getNamedExpressions() != null;
			case TablePackage.DOCUMENT_ROOT__NAMED_RANGE:
				return getNamedRange() != null;
			case TablePackage.DOCUMENT_ROOT__NULL_DATE:
				return getNullDate() != null;
			case TablePackage.DOCUMENT_ROOT__ODD_COLUMNS:
				return getOddColumns() != null;
			case TablePackage.DOCUMENT_ROOT__ODD_ROWS:
				return getOddRows() != null;
			case TablePackage.DOCUMENT_ROOT__OPERATION:
				return getOperation() != null;
			case TablePackage.DOCUMENT_ROOT__PREVIOUS:
				return getPrevious() != null;
			case TablePackage.DOCUMENT_ROOT__SCENARIO:
				return getScenario() != null;
			case TablePackage.DOCUMENT_ROOT__SHAPES:
				return getShapes() != null;
			case TablePackage.DOCUMENT_ROOT__SORT:
				return getSort() != null;
			case TablePackage.DOCUMENT_ROOT__SORT_BY:
				return getSortBy() != null;
			case TablePackage.DOCUMENT_ROOT__SORT_GROUPS:
				return getSortGroups() != null;
			case TablePackage.DOCUMENT_ROOT__SOURCE_CELL_RANGE:
				return getSourceCellRange() != null;
			case TablePackage.DOCUMENT_ROOT__SOURCE_RANGE_ADDRESS:
				return getSourceRangeAddress() != null;
			case TablePackage.DOCUMENT_ROOT__SOURCE_SERVICE:
				return getSourceService() != null;
			case TablePackage.DOCUMENT_ROOT__SUBTOTAL_FIELD:
				return getSubtotalField() != null;
			case TablePackage.DOCUMENT_ROOT__SUBTOTAL_RULE:
				return getSubtotalRule() != null;
			case TablePackage.DOCUMENT_ROOT__SUBTOTAL_RULES:
				return getSubtotalRules() != null;
			case TablePackage.DOCUMENT_ROOT__TABLE:
				return getTable() != null;
			case TablePackage.DOCUMENT_ROOT__TABLE_CELL:
				return getTableCell() != null;
			case TablePackage.DOCUMENT_ROOT__TABLE_COLUMN:
				return getTableColumn() != null;
			case TablePackage.DOCUMENT_ROOT__TABLE_COLUMN_GROUP:
				return getTableColumnGroup() != null;
			case TablePackage.DOCUMENT_ROOT__TABLE_COLUMNS:
				return getTableColumns() != null;
			case TablePackage.DOCUMENT_ROOT__TABLE_HEADER_COLUMNS:
				return getTableHeaderColumns() != null;
			case TablePackage.DOCUMENT_ROOT__TABLE_HEADER_ROWS:
				return getTableHeaderRows() != null;
			case TablePackage.DOCUMENT_ROOT__TABLE_ROW:
				return getTableRow() != null;
			case TablePackage.DOCUMENT_ROOT__TABLE_ROW_GROUP:
				return getTableRowGroup() != null;
			case TablePackage.DOCUMENT_ROOT__TABLE_ROWS:
				return getTableRows() != null;
			case TablePackage.DOCUMENT_ROOT__TABLE_SOURCE:
				return getTableSource() != null;
			case TablePackage.DOCUMENT_ROOT__TABLE_TEMPLATE:
				return getTableTemplate() != null;
			case TablePackage.DOCUMENT_ROOT__TARGET_RANGE_ADDRESS:
				return getTargetRangeAddress() != null;
			case TablePackage.DOCUMENT_ROOT__TRACKED_CHANGES:
				return getTrackedChanges() != null;
			case TablePackage.DOCUMENT_ROOT__ACCEPTANCE_STATE:
				return isSetAcceptanceState();
			case TablePackage.DOCUMENT_ROOT__ADD_EMPTY_LINES:
				return isSetAddEmptyLines();
			case TablePackage.DOCUMENT_ROOT__ALGORITHM:
				return ALGORITHM_EDEFAULT == null ? algorithm != null : !ALGORITHM_EDEFAULT.equals(algorithm);
			case TablePackage.DOCUMENT_ROOT__ALIGN:
				return isSetAlign();
			case TablePackage.DOCUMENT_ROOT__ALLOW_EMPTY_CELL:
				return isSetAllowEmptyCell();
			case TablePackage.DOCUMENT_ROOT__APPLICATION_DATA:
				return APPLICATION_DATA_EDEFAULT == null ? applicationData != null : !APPLICATION_DATA_EDEFAULT.equals(applicationData);
			case TablePackage.DOCUMENT_ROOT__AUTOMATIC_FIND_LABELS:
				return isSetAutomaticFindLabels();
			case TablePackage.DOCUMENT_ROOT__BASE_CELL_ADDRESS:
				return BASE_CELL_ADDRESS_EDEFAULT == null ? baseCellAddress != null : !BASE_CELL_ADDRESS_EDEFAULT.equals(baseCellAddress);
			case TablePackage.DOCUMENT_ROOT__BIND_STYLES_TO_CONTENT:
				return isSetBindStylesToContent();
			case TablePackage.DOCUMENT_ROOT__BORDER_COLOR:
				return BORDER_COLOR_EDEFAULT == null ? borderColor != null : !BORDER_COLOR_EDEFAULT.equals(borderColor);
			case TablePackage.DOCUMENT_ROOT__BORDER_MODEL:
				return isSetBorderModel();
			case TablePackage.DOCUMENT_ROOT__BUTTONS:
				return BUTTONS_EDEFAULT == null ? buttons != null : !BUTTONS_EDEFAULT.equals(buttons);
			case TablePackage.DOCUMENT_ROOT__CELL_ADDRESS1:
				return CELL_ADDRESS1_EDEFAULT == null ? cellAddress1 != null : !CELL_ADDRESS1_EDEFAULT.equals(cellAddress1);
			case TablePackage.DOCUMENT_ROOT__CELL_RANGE:
				return CELL_RANGE_EDEFAULT == null ? cellRange != null : !CELL_RANGE_EDEFAULT.equals(cellRange);
			case TablePackage.DOCUMENT_ROOT__CELL_RANGE_ADDRESS:
				return CELL_RANGE_ADDRESS_EDEFAULT == null ? cellRangeAddress != null : !CELL_RANGE_ADDRESS_EDEFAULT.equals(cellRangeAddress);
			case TablePackage.DOCUMENT_ROOT__COLUMN:
				return COLUMN_EDEFAULT == null ? column != null : !COLUMN_EDEFAULT.equals(column);
			case TablePackage.DOCUMENT_ROOT__COMMENT:
				return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
			case TablePackage.DOCUMENT_ROOT__CONDITION:
				return CONDITION_EDEFAULT == null ? condition != null : !CONDITION_EDEFAULT.equals(condition);
			case TablePackage.DOCUMENT_ROOT__CONDITION_SOURCE:
				return isSetConditionSource();
			case TablePackage.DOCUMENT_ROOT__CONDITION_SOURCE_RANGE_ADDRESS:
				return CONDITION_SOURCE_RANGE_ADDRESS_EDEFAULT == null ? conditionSourceRangeAddress != null : !CONDITION_SOURCE_RANGE_ADDRESS_EDEFAULT.equals(conditionSourceRangeAddress);
			case TablePackage.DOCUMENT_ROOT__CONTAINS_ERROR:
				return isSetContainsError();
			case TablePackage.DOCUMENT_ROOT__CONTAINS_HEADER:
				return isSetContainsHeader();
			case TablePackage.DOCUMENT_ROOT__CONTENT_VALIDATION_NAME:
				return CONTENT_VALIDATION_NAME_EDEFAULT == null ? contentValidationName != null : !CONTENT_VALIDATION_NAME_EDEFAULT.equals(contentValidationName);
			case TablePackage.DOCUMENT_ROOT__COPY_BACK:
				return isSetCopyBack();
			case TablePackage.DOCUMENT_ROOT__COPY_FORMULAS:
				return isSetCopyFormulas();
			case TablePackage.DOCUMENT_ROOT__COPY_STYLES:
				return isSetCopyStyles();
			case TablePackage.DOCUMENT_ROOT__COUNT:
				return COUNT_EDEFAULT == null ? count != null : !COUNT_EDEFAULT.equals(count);
			case TablePackage.DOCUMENT_ROOT__COUNTRY:
				return COUNTRY_EDEFAULT == null ? country != null : !COUNTRY_EDEFAULT.equals(country);
			case TablePackage.DOCUMENT_ROOT__DATABASE_NAME:
				return DATABASE_NAME_EDEFAULT == null ? databaseName != null : !DATABASE_NAME_EDEFAULT.equals(databaseName);
			case TablePackage.DOCUMENT_ROOT__DATABASE_TABLE_NAME:
				return DATABASE_TABLE_NAME_EDEFAULT == null ? databaseTableName != null : !DATABASE_TABLE_NAME_EDEFAULT.equals(databaseTableName);
			case TablePackage.DOCUMENT_ROOT__DATA_CELL_RANGE_ADDRESS:
				return DATA_CELL_RANGE_ADDRESS_EDEFAULT == null ? dataCellRangeAddress != null : !DATA_CELL_RANGE_ADDRESS_EDEFAULT.equals(dataCellRangeAddress);
			case TablePackage.DOCUMENT_ROOT__DATA_FIELD:
				return DATA_FIELD_EDEFAULT == null ? dataField != null : !DATA_FIELD_EDEFAULT.equals(dataField);
			case TablePackage.DOCUMENT_ROOT__DATE_END:
				return DATE_END_EDEFAULT == null ? dateEnd != null : !DATE_END_EDEFAULT.equals(dateEnd);
			case TablePackage.DOCUMENT_ROOT__DATE_START:
				return DATE_START_EDEFAULT == null ? dateStart != null : !DATE_START_EDEFAULT.equals(dateStart);
			case TablePackage.DOCUMENT_ROOT__DEFAULT_CELL_STYLE_NAME:
				return DEFAULT_CELL_STYLE_NAME_EDEFAULT == null ? defaultCellStyleName != null : !DEFAULT_CELL_STYLE_NAME_EDEFAULT.equals(defaultCellStyleName);
			case TablePackage.DOCUMENT_ROOT__DIRECTION:
				return isSetDirection();
			case TablePackage.DOCUMENT_ROOT__DISPLAY:
				return isSetDisplay();
			case TablePackage.DOCUMENT_ROOT__DISPLAY_BORDER:
				return isSetDisplayBorder();
			case TablePackage.DOCUMENT_ROOT__DISPLAY_DUPLICATES:
				return isSetDisplayDuplicates();
			case TablePackage.DOCUMENT_ROOT__DISPLAY_FILTER_BUTTONS:
				return isSetDisplayFilterButtons();
			case TablePackage.DOCUMENT_ROOT__DISPLAY_LIST:
				return isSetDisplayList();
			case TablePackage.DOCUMENT_ROOT__DISPLAY_MEMBER_MODE:
				return isSetDisplayMemberMode();
			case TablePackage.DOCUMENT_ROOT__DRILL_DOWN_ON_DOUBLE_CLICK:
				return isSetDrillDownOnDoubleClick();
			case TablePackage.DOCUMENT_ROOT__ENABLED:
				return isSetEnabled();
			case TablePackage.DOCUMENT_ROOT__END:
				return END_EDEFAULT == null ? end != null : !END_EDEFAULT.equals(end);
			case TablePackage.DOCUMENT_ROOT__END_CELL_ADDRESS:
				return END_CELL_ADDRESS_EDEFAULT == null ? endCellAddress != null : !END_CELL_ADDRESS_EDEFAULT.equals(endCellAddress);
			case TablePackage.DOCUMENT_ROOT__END_COLUMN:
				return END_COLUMN_EDEFAULT == null ? endColumn != null : !END_COLUMN_EDEFAULT.equals(endColumn);
			case TablePackage.DOCUMENT_ROOT__END_POSITION:
				return END_POSITION_EDEFAULT == null ? endPosition != null : !END_POSITION_EDEFAULT.equals(endPosition);
			case TablePackage.DOCUMENT_ROOT__END_ROW:
				return END_ROW_EDEFAULT == null ? endRow != null : !END_ROW_EDEFAULT.equals(endRow);
			case TablePackage.DOCUMENT_ROOT__END_TABLE:
				return END_TABLE_EDEFAULT == null ? endTable != null : !END_TABLE_EDEFAULT.equals(endTable);
			case TablePackage.DOCUMENT_ROOT__END_X:
				return END_X_EDEFAULT == null ? endX != null : !END_X_EDEFAULT.equals(endX);
			case TablePackage.DOCUMENT_ROOT__END_Y:
				return END_Y_EDEFAULT == null ? endY != null : !END_Y_EDEFAULT.equals(endY);
			case TablePackage.DOCUMENT_ROOT__EXPRESSION:
				return EXPRESSION_EDEFAULT == null ? expression != null : !EXPRESSION_EDEFAULT.equals(expression);
			case TablePackage.DOCUMENT_ROOT__FIELD_NAME:
				return FIELD_NAME_EDEFAULT == null ? fieldName != null : !FIELD_NAME_EDEFAULT.equals(fieldName);
			case TablePackage.DOCUMENT_ROOT__FIELD_NUMBER:
				return FIELD_NUMBER_EDEFAULT == null ? fieldNumber != null : !FIELD_NUMBER_EDEFAULT.equals(fieldNumber);
			case TablePackage.DOCUMENT_ROOT__FILTER_NAME:
				return FILTER_NAME_EDEFAULT == null ? filterName != null : !FILTER_NAME_EDEFAULT.equals(filterName);
			case TablePackage.DOCUMENT_ROOT__FILTER_OPTIONS:
				return FILTER_OPTIONS_EDEFAULT == null ? filterOptions != null : !FILTER_OPTIONS_EDEFAULT.equals(filterOptions);
			case TablePackage.DOCUMENT_ROOT__FORMULA:
				return FORMULA_EDEFAULT == null ? formula != null : !FORMULA_EDEFAULT.equals(formula);
			case TablePackage.DOCUMENT_ROOT__FUNCTION:
				return FUNCTION_EDEFAULT == null ? function != null : !FUNCTION_EDEFAULT.equals(function);
			case TablePackage.DOCUMENT_ROOT__GRAND_TOTAL:
				return isSetGrandTotal();
			case TablePackage.DOCUMENT_ROOT__GROUP_BY_FIELD_NUMBER:
				return GROUP_BY_FIELD_NUMBER_EDEFAULT == null ? groupByFieldNumber != null : !GROUP_BY_FIELD_NUMBER_EDEFAULT.equals(groupByFieldNumber);
			case TablePackage.DOCUMENT_ROOT__GROUPED_BY:
				return isSetGroupedBy();
			case TablePackage.DOCUMENT_ROOT__HAS_PERSISTENT_DATA:
				return isSetHasPersistentData();
			case TablePackage.DOCUMENT_ROOT__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case TablePackage.DOCUMENT_ROOT__IDENTIFY_CATEGORIES:
				return isSetIdentifyCategories();
			case TablePackage.DOCUMENT_ROOT__IGNORE_EMPTY_ROWS:
				return isSetIgnoreEmptyRows();
			case TablePackage.DOCUMENT_ROOT__INDEX:
				return INDEX_EDEFAULT == null ? index != null : !INDEX_EDEFAULT.equals(index);
			case TablePackage.DOCUMENT_ROOT__IS_ACTIVE:
				return isSetIsActive();
			case TablePackage.DOCUMENT_ROOT__IS_DATA_LAYOUT_FIELD:
				return IS_DATA_LAYOUT_FIELD_EDEFAULT == null ? isDataLayoutField != null : !IS_DATA_LAYOUT_FIELD_EDEFAULT.equals(isDataLayoutField);
			case TablePackage.DOCUMENT_ROOT__IS_SELECTION:
				return isSetIsSelection();
			case TablePackage.DOCUMENT_ROOT__IS_SUB_TABLE:
				return isSetIsSubTable();
			case TablePackage.DOCUMENT_ROOT__LABEL_CELL_RANGE_ADDRESS:
				return LABEL_CELL_RANGE_ADDRESS_EDEFAULT == null ? labelCellRangeAddress != null : !LABEL_CELL_RANGE_ADDRESS_EDEFAULT.equals(labelCellRangeAddress);
			case TablePackage.DOCUMENT_ROOT__LANGUAGE:
				return LANGUAGE_EDEFAULT == null ? language != null : !LANGUAGE_EDEFAULT.equals(language);
			case TablePackage.DOCUMENT_ROOT__LAST_COLUMN_SPANNED:
				return LAST_COLUMN_SPANNED_EDEFAULT == null ? lastColumnSpanned != null : !LAST_COLUMN_SPANNED_EDEFAULT.equals(lastColumnSpanned);
			case TablePackage.DOCUMENT_ROOT__LAST_ROW_SPANNED:
				return LAST_ROW_SPANNED_EDEFAULT == null ? lastRowSpanned != null : !LAST_ROW_SPANNED_EDEFAULT.equals(lastRowSpanned);
			case TablePackage.DOCUMENT_ROOT__LAYOUT_MODE:
				return isSetLayoutMode();
			case TablePackage.DOCUMENT_ROOT__LINK_TO_SOURCE_DATA:
				return isSetLinkToSourceData();
			case TablePackage.DOCUMENT_ROOT__MARKED_INVALID:
				return isSetMarkedInvalid();
			case TablePackage.DOCUMENT_ROOT__MATRIX_COVERED:
				return isSetMatrixCovered();
			case TablePackage.DOCUMENT_ROOT__MEMBER_COUNT:
				return MEMBER_COUNT_EDEFAULT == null ? memberCount != null : !MEMBER_COUNT_EDEFAULT.equals(memberCount);
			case TablePackage.DOCUMENT_ROOT__MEMBER_NAME:
				return MEMBER_NAME_EDEFAULT == null ? memberName != null : !MEMBER_NAME_EDEFAULT.equals(memberName);
			case TablePackage.DOCUMENT_ROOT__MEMBER_TYPE:
				return isSetMemberType();
			case TablePackage.DOCUMENT_ROOT__MODE:
				return isSetMode();
			case TablePackage.DOCUMENT_ROOT__MULTI_DELETION_SPANNED:
				return MULTI_DELETION_SPANNED_EDEFAULT == null ? multiDeletionSpanned != null : !MULTI_DELETION_SPANNED_EDEFAULT.equals(multiDeletionSpanned);
			case TablePackage.DOCUMENT_ROOT__NULL_YEAR:
				return NULL_YEAR_EDEFAULT == null ? nullYear != null : !NULL_YEAR_EDEFAULT.equals(nullYear);
			case TablePackage.DOCUMENT_ROOT__NUMBER_COLUMNS_REPEATED:
				return NUMBER_COLUMNS_REPEATED_EDEFAULT == null ? numberColumnsRepeated != null : !NUMBER_COLUMNS_REPEATED_EDEFAULT.equals(numberColumnsRepeated);
			case TablePackage.DOCUMENT_ROOT__NUMBER_COLUMNS_SPANNED:
				return NUMBER_COLUMNS_SPANNED_EDEFAULT == null ? numberColumnsSpanned != null : !NUMBER_COLUMNS_SPANNED_EDEFAULT.equals(numberColumnsSpanned);
			case TablePackage.DOCUMENT_ROOT__NUMBER_MATRIX_COLUMNS_SPANNED:
				return NUMBER_MATRIX_COLUMNS_SPANNED_EDEFAULT == null ? numberMatrixColumnsSpanned != null : !NUMBER_MATRIX_COLUMNS_SPANNED_EDEFAULT.equals(numberMatrixColumnsSpanned);
			case TablePackage.DOCUMENT_ROOT__NUMBER_MATRIX_ROWS_SPANNED:
				return NUMBER_MATRIX_ROWS_SPANNED_EDEFAULT == null ? numberMatrixRowsSpanned != null : !NUMBER_MATRIX_ROWS_SPANNED_EDEFAULT.equals(numberMatrixRowsSpanned);
			case TablePackage.DOCUMENT_ROOT__NUMBER_ROWS_REPEATED:
				return NUMBER_ROWS_REPEATED_EDEFAULT == null ? numberRowsRepeated != null : !NUMBER_ROWS_REPEATED_EDEFAULT.equals(numberRowsRepeated);
			case TablePackage.DOCUMENT_ROOT__NUMBER_ROWS_SPANNED:
				return NUMBER_ROWS_SPANNED_EDEFAULT == null ? numberRowsSpanned != null : !NUMBER_ROWS_SPANNED_EDEFAULT.equals(numberRowsSpanned);
			case TablePackage.DOCUMENT_ROOT__OBJECT_NAME:
				return OBJECT_NAME_EDEFAULT == null ? objectName != null : !OBJECT_NAME_EDEFAULT.equals(objectName);
			case TablePackage.DOCUMENT_ROOT__ON_UPDATE_KEEP_SIZE:
				return isSetOnUpdateKeepSize();
			case TablePackage.DOCUMENT_ROOT__ON_UPDATE_KEEP_STYLES:
				return isSetOnUpdateKeepStyles();
			case TablePackage.DOCUMENT_ROOT__OPERATOR:
				return OPERATOR_EDEFAULT == null ? operator != null : !OPERATOR_EDEFAULT.equals(operator);
			case TablePackage.DOCUMENT_ROOT__ORDER:
				return isSetOrder();
			case TablePackage.DOCUMENT_ROOT__PAGE_BREAKS_ON_GROUP_CHANGE:
				return isSetPageBreaksOnGroupChange();
			case TablePackage.DOCUMENT_ROOT__PARSE_SQL_STATEMENT:
				return isSetParseSqlStatement();
			case TablePackage.DOCUMENT_ROOT__PASSWORD:
				return PASSWORD_EDEFAULT == null ? password != null : !PASSWORD_EDEFAULT.equals(password);
			case TablePackage.DOCUMENT_ROOT__POSITION:
				return POSITION_EDEFAULT == null ? position != null : !POSITION_EDEFAULT.equals(position);
			case TablePackage.DOCUMENT_ROOT__PRECISION_AS_SHOWN:
				return isSetPrecisionAsShown();
			case TablePackage.DOCUMENT_ROOT__PRINT:
				return isSetPrint();
			case TablePackage.DOCUMENT_ROOT__PRINT_RANGES:
				return PRINT_RANGES_EDEFAULT == null ? printRanges != null : !PRINT_RANGES_EDEFAULT.equals(printRanges);
			case TablePackage.DOCUMENT_ROOT__PROTECT:
				return isSetProtect();
			case TablePackage.DOCUMENT_ROOT__PROTECTED:
				return isSetProtected();
			case TablePackage.DOCUMENT_ROOT__QUERY_NAME:
				return QUERY_NAME_EDEFAULT == null ? queryName != null : !QUERY_NAME_EDEFAULT.equals(queryName);
			case TablePackage.DOCUMENT_ROOT__RANGE_USABLE_AS:
				return RANGE_USABLE_AS_EDEFAULT == null ? rangeUsableAs != null : !RANGE_USABLE_AS_EDEFAULT.equals(rangeUsableAs);
			case TablePackage.DOCUMENT_ROOT__REJECTING_CHANGE_ID:
				return REJECTING_CHANGE_ID_EDEFAULT == null ? rejectingChangeId != null : !REJECTING_CHANGE_ID_EDEFAULT.equals(rejectingChangeId);
			case TablePackage.DOCUMENT_ROOT__ROW:
				return ROW_EDEFAULT == null ? row != null : !ROW_EDEFAULT.equals(row);
			case TablePackage.DOCUMENT_ROOT__SCENARIO_RANGES:
				return SCENARIO_RANGES_EDEFAULT == null ? scenarioRanges != null : !SCENARIO_RANGES_EDEFAULT.equals(scenarioRanges);
			case TablePackage.DOCUMENT_ROOT__SEARCH_CRITERIA_MUST_APPLY_TO_WHOLE_CELL:
				return isSetSearchCriteriaMustApplyToWholeCell();
			case TablePackage.DOCUMENT_ROOT__SELECTED_PAGE:
				return SELECTED_PAGE_EDEFAULT == null ? selectedPage != null : !SELECTED_PAGE_EDEFAULT.equals(selectedPage);
			case TablePackage.DOCUMENT_ROOT__SHOW_DETAILS:
				return isSetShowDetails();
			case TablePackage.DOCUMENT_ROOT__SHOW_EMPTY:
				return isSetShowEmpty();
			case TablePackage.DOCUMENT_ROOT__SHOW_FILTER_BUTTON:
				return isSetShowFilterButton();
			case TablePackage.DOCUMENT_ROOT__SORT_MODE:
				return isSetSortMode();
			case TablePackage.DOCUMENT_ROOT__SOURCE_CELL_RANGE_ADDRESSES:
				return SOURCE_CELL_RANGE_ADDRESSES_EDEFAULT == null ? sourceCellRangeAddresses != null : !SOURCE_CELL_RANGE_ADDRESSES_EDEFAULT.equals(sourceCellRangeAddresses);
			case TablePackage.DOCUMENT_ROOT__SOURCE_FIELD_NAME:
				return SOURCE_FIELD_NAME_EDEFAULT == null ? sourceFieldName != null : !SOURCE_FIELD_NAME_EDEFAULT.equals(sourceFieldName);
			case TablePackage.DOCUMENT_ROOT__SOURCE_NAME:
				return SOURCE_NAME_EDEFAULT == null ? sourceName != null : !SOURCE_NAME_EDEFAULT.equals(sourceName);
			case TablePackage.DOCUMENT_ROOT__SQL_STATEMENT:
				return SQL_STATEMENT_EDEFAULT == null ? sqlStatement != null : !SQL_STATEMENT_EDEFAULT.equals(sqlStatement);
			case TablePackage.DOCUMENT_ROOT__START:
				return START_EDEFAULT == null ? start != null : !START_EDEFAULT.equals(start);
			case TablePackage.DOCUMENT_ROOT__START_COLUMN:
				return START_COLUMN_EDEFAULT == null ? startColumn != null : !START_COLUMN_EDEFAULT.equals(startColumn);
			case TablePackage.DOCUMENT_ROOT__START_POSITION:
				return START_POSITION_EDEFAULT == null ? startPosition != null : !START_POSITION_EDEFAULT.equals(startPosition);
			case TablePackage.DOCUMENT_ROOT__START_ROW:
				return START_ROW_EDEFAULT == null ? startRow != null : !START_ROW_EDEFAULT.equals(startRow);
			case TablePackage.DOCUMENT_ROOT__START_TABLE:
				return START_TABLE_EDEFAULT == null ? startTable != null : !START_TABLE_EDEFAULT.equals(startTable);
			case TablePackage.DOCUMENT_ROOT__STEP:
				return isSetStep();
			case TablePackage.DOCUMENT_ROOT__STRUCTURE_PROTECTED:
				return isSetStructureProtected();
			case TablePackage.DOCUMENT_ROOT__STYLE_NAME:
				return STYLE_NAME_EDEFAULT == null ? styleName != null : !STYLE_NAME_EDEFAULT.equals(styleName);
			case TablePackage.DOCUMENT_ROOT__TABLE1:
				return TABLE1_EDEFAULT == null ? table1 != null : !TABLE1_EDEFAULT.equals(table1);
			case TablePackage.DOCUMENT_ROOT__TABLE_BACKGROUND:
				return isSetTableBackground();
			case TablePackage.DOCUMENT_ROOT__TABLE_NAME:
				return TABLE_NAME_EDEFAULT == null ? tableName != null : !TABLE_NAME_EDEFAULT.equals(tableName);
			case TablePackage.DOCUMENT_ROOT__TARGET_CELL_ADDRESS:
				return TARGET_CELL_ADDRESS_EDEFAULT == null ? targetCellAddress != null : !TARGET_CELL_ADDRESS_EDEFAULT.equals(targetCellAddress);
			case TablePackage.DOCUMENT_ROOT__TARGET_RANGE_ADDRESS1:
				return TARGET_RANGE_ADDRESS1_EDEFAULT == null ? targetRangeAddress1 != null : !TARGET_RANGE_ADDRESS1_EDEFAULT.equals(targetRangeAddress1);
			case TablePackage.DOCUMENT_ROOT__TRACK_CHANGES:
				return isSetTrackChanges();
			case TablePackage.DOCUMENT_ROOT__USED_HIERARCHY:
				return USED_HIERARCHY_EDEFAULT == null ? usedHierarchy != null : !USED_HIERARCHY_EDEFAULT.equals(usedHierarchy);
			case TablePackage.DOCUMENT_ROOT__USE_LABELS:
				return isSetUseLabels();
			case TablePackage.DOCUMENT_ROOT__USE_REGULAR_EXPRESSIONS:
				return isSetUseRegularExpressions();
			case TablePackage.DOCUMENT_ROOT__USER_NAME:
				return USER_NAME_EDEFAULT == null ? userName != null : !USER_NAME_EDEFAULT.equals(userName);
			case TablePackage.DOCUMENT_ROOT__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case TablePackage.DOCUMENT_ROOT__VISIBILITY:
				return isSetVisibility();
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
		result.append(", acceptanceState: ");
		if (acceptanceStateESet) result.append(acceptanceState); else result.append("<unset>");
		result.append(", addEmptyLines: ");
		if (addEmptyLinesESet) result.append(addEmptyLines); else result.append("<unset>");
		result.append(", algorithm: ");
		result.append(algorithm);
		result.append(", align: ");
		if (alignESet) result.append(align); else result.append("<unset>");
		result.append(", allowEmptyCell: ");
		if (allowEmptyCellESet) result.append(allowEmptyCell); else result.append("<unset>");
		result.append(", applicationData: ");
		result.append(applicationData);
		result.append(", automaticFindLabels: ");
		if (automaticFindLabelsESet) result.append(automaticFindLabels); else result.append("<unset>");
		result.append(", baseCellAddress: ");
		result.append(baseCellAddress);
		result.append(", bindStylesToContent: ");
		if (bindStylesToContentESet) result.append(bindStylesToContent); else result.append("<unset>");
		result.append(", borderColor: ");
		result.append(borderColor);
		result.append(", borderModel: ");
		if (borderModelESet) result.append(borderModel); else result.append("<unset>");
		result.append(", buttons: ");
		result.append(buttons);
		result.append(", cellAddress1: ");
		result.append(cellAddress1);
		result.append(", cellRange: ");
		result.append(cellRange);
		result.append(", cellRangeAddress: ");
		result.append(cellRangeAddress);
		result.append(", column: ");
		result.append(column);
		result.append(", comment: ");
		result.append(comment);
		result.append(", condition: ");
		result.append(condition);
		result.append(", conditionSource: ");
		if (conditionSourceESet) result.append(conditionSource); else result.append("<unset>");
		result.append(", conditionSourceRangeAddress: ");
		result.append(conditionSourceRangeAddress);
		result.append(", containsError: ");
		if (containsErrorESet) result.append(containsError); else result.append("<unset>");
		result.append(", containsHeader: ");
		if (containsHeaderESet) result.append(containsHeader); else result.append("<unset>");
		result.append(", contentValidationName: ");
		result.append(contentValidationName);
		result.append(", copyBack: ");
		if (copyBackESet) result.append(copyBack); else result.append("<unset>");
		result.append(", copyFormulas: ");
		if (copyFormulasESet) result.append(copyFormulas); else result.append("<unset>");
		result.append(", copyStyles: ");
		if (copyStylesESet) result.append(copyStyles); else result.append("<unset>");
		result.append(", count: ");
		result.append(count);
		result.append(", country: ");
		result.append(country);
		result.append(", databaseName: ");
		result.append(databaseName);
		result.append(", databaseTableName: ");
		result.append(databaseTableName);
		result.append(", dataCellRangeAddress: ");
		result.append(dataCellRangeAddress);
		result.append(", dataField: ");
		result.append(dataField);
		result.append(", dateEnd: ");
		result.append(dateEnd);
		result.append(", dateStart: ");
		result.append(dateStart);
		result.append(", defaultCellStyleName: ");
		result.append(defaultCellStyleName);
		result.append(", direction: ");
		if (directionESet) result.append(direction); else result.append("<unset>");
		result.append(", display: ");
		if (displayESet) result.append(display); else result.append("<unset>");
		result.append(", displayBorder: ");
		if (displayBorderESet) result.append(displayBorder); else result.append("<unset>");
		result.append(", displayDuplicates: ");
		if (displayDuplicatesESet) result.append(displayDuplicates); else result.append("<unset>");
		result.append(", displayFilterButtons: ");
		if (displayFilterButtonsESet) result.append(displayFilterButtons); else result.append("<unset>");
		result.append(", displayList: ");
		if (displayListESet) result.append(displayList); else result.append("<unset>");
		result.append(", displayMemberMode: ");
		if (displayMemberModeESet) result.append(displayMemberMode); else result.append("<unset>");
		result.append(", drillDownOnDoubleClick: ");
		if (drillDownOnDoubleClickESet) result.append(drillDownOnDoubleClick); else result.append("<unset>");
		result.append(", enabled: ");
		if (enabledESet) result.append(enabled); else result.append("<unset>");
		result.append(", end: ");
		result.append(end);
		result.append(", endCellAddress: ");
		result.append(endCellAddress);
		result.append(", endColumn: ");
		result.append(endColumn);
		result.append(", endPosition: ");
		result.append(endPosition);
		result.append(", endRow: ");
		result.append(endRow);
		result.append(", endTable: ");
		result.append(endTable);
		result.append(", endX: ");
		result.append(endX);
		result.append(", endY: ");
		result.append(endY);
		result.append(", expression: ");
		result.append(expression);
		result.append(", fieldName: ");
		result.append(fieldName);
		result.append(", fieldNumber: ");
		result.append(fieldNumber);
		result.append(", filterName: ");
		result.append(filterName);
		result.append(", filterOptions: ");
		result.append(filterOptions);
		result.append(", formula: ");
		result.append(formula);
		result.append(", function: ");
		result.append(function);
		result.append(", grandTotal: ");
		if (grandTotalESet) result.append(grandTotal); else result.append("<unset>");
		result.append(", groupByFieldNumber: ");
		result.append(groupByFieldNumber);
		result.append(", groupedBy: ");
		if (groupedByESet) result.append(groupedBy); else result.append("<unset>");
		result.append(", hasPersistentData: ");
		if (hasPersistentDataESet) result.append(hasPersistentData); else result.append("<unset>");
		result.append(", id: ");
		result.append(id);
		result.append(", identifyCategories: ");
		if (identifyCategoriesESet) result.append(identifyCategories); else result.append("<unset>");
		result.append(", ignoreEmptyRows: ");
		if (ignoreEmptyRowsESet) result.append(ignoreEmptyRows); else result.append("<unset>");
		result.append(", index: ");
		result.append(index);
		result.append(", isActive: ");
		if (isActiveESet) result.append(isActive); else result.append("<unset>");
		result.append(", isDataLayoutField: ");
		result.append(isDataLayoutField);
		result.append(", isSelection: ");
		if (isSelectionESet) result.append(isSelection); else result.append("<unset>");
		result.append(", isSubTable: ");
		if (isSubTableESet) result.append(isSubTable); else result.append("<unset>");
		result.append(", labelCellRangeAddress: ");
		result.append(labelCellRangeAddress);
		result.append(", language: ");
		result.append(language);
		result.append(", lastColumnSpanned: ");
		result.append(lastColumnSpanned);
		result.append(", lastRowSpanned: ");
		result.append(lastRowSpanned);
		result.append(", layoutMode: ");
		if (layoutModeESet) result.append(layoutMode); else result.append("<unset>");
		result.append(", linkToSourceData: ");
		if (linkToSourceDataESet) result.append(linkToSourceData); else result.append("<unset>");
		result.append(", markedInvalid: ");
		if (markedInvalidESet) result.append(markedInvalid); else result.append("<unset>");
		result.append(", matrixCovered: ");
		if (matrixCoveredESet) result.append(matrixCovered); else result.append("<unset>");
		result.append(", memberCount: ");
		result.append(memberCount);
		result.append(", memberName: ");
		result.append(memberName);
		result.append(", memberType: ");
		if (memberTypeESet) result.append(memberType); else result.append("<unset>");
		result.append(", mode: ");
		if (modeESet) result.append(mode); else result.append("<unset>");
		result.append(", multiDeletionSpanned: ");
		result.append(multiDeletionSpanned);
		result.append(", nullYear: ");
		result.append(nullYear);
		result.append(", numberColumnsRepeated: ");
		result.append(numberColumnsRepeated);
		result.append(", numberColumnsSpanned: ");
		result.append(numberColumnsSpanned);
		result.append(", numberMatrixColumnsSpanned: ");
		result.append(numberMatrixColumnsSpanned);
		result.append(", numberMatrixRowsSpanned: ");
		result.append(numberMatrixRowsSpanned);
		result.append(", numberRowsRepeated: ");
		result.append(numberRowsRepeated);
		result.append(", numberRowsSpanned: ");
		result.append(numberRowsSpanned);
		result.append(", objectName: ");
		result.append(objectName);
		result.append(", onUpdateKeepSize: ");
		if (onUpdateKeepSizeESet) result.append(onUpdateKeepSize); else result.append("<unset>");
		result.append(", onUpdateKeepStyles: ");
		if (onUpdateKeepStylesESet) result.append(onUpdateKeepStyles); else result.append("<unset>");
		result.append(", operator: ");
		result.append(operator);
		result.append(", order: ");
		if (orderESet) result.append(order); else result.append("<unset>");
		result.append(", pageBreaksOnGroupChange: ");
		if (pageBreaksOnGroupChangeESet) result.append(pageBreaksOnGroupChange); else result.append("<unset>");
		result.append(", parseSqlStatement: ");
		if (parseSqlStatementESet) result.append(parseSqlStatement); else result.append("<unset>");
		result.append(", password: ");
		result.append(password);
		result.append(", position: ");
		result.append(position);
		result.append(", precisionAsShown: ");
		if (precisionAsShownESet) result.append(precisionAsShown); else result.append("<unset>");
		result.append(", print: ");
		if (printESet) result.append(print); else result.append("<unset>");
		result.append(", printRanges: ");
		result.append(printRanges);
		result.append(", protect: ");
		if (protectESet) result.append(protect); else result.append("<unset>");
		result.append(", protected: ");
		if (protectedESet) result.append(protected_); else result.append("<unset>");
		result.append(", queryName: ");
		result.append(queryName);
		result.append(", rangeUsableAs: ");
		result.append(rangeUsableAs);
		result.append(", rejectingChangeId: ");
		result.append(rejectingChangeId);
		result.append(", row: ");
		result.append(row);
		result.append(", scenarioRanges: ");
		result.append(scenarioRanges);
		result.append(", searchCriteriaMustApplyToWholeCell: ");
		if (searchCriteriaMustApplyToWholeCellESet) result.append(searchCriteriaMustApplyToWholeCell); else result.append("<unset>");
		result.append(", selectedPage: ");
		result.append(selectedPage);
		result.append(", showDetails: ");
		if (showDetailsESet) result.append(showDetails); else result.append("<unset>");
		result.append(", showEmpty: ");
		if (showEmptyESet) result.append(showEmpty); else result.append("<unset>");
		result.append(", showFilterButton: ");
		if (showFilterButtonESet) result.append(showFilterButton); else result.append("<unset>");
		result.append(", sortMode: ");
		if (sortModeESet) result.append(sortMode); else result.append("<unset>");
		result.append(", sourceCellRangeAddresses: ");
		result.append(sourceCellRangeAddresses);
		result.append(", sourceFieldName: ");
		result.append(sourceFieldName);
		result.append(", sourceName: ");
		result.append(sourceName);
		result.append(", sqlStatement: ");
		result.append(sqlStatement);
		result.append(", start: ");
		result.append(start);
		result.append(", startColumn: ");
		result.append(startColumn);
		result.append(", startPosition: ");
		result.append(startPosition);
		result.append(", startRow: ");
		result.append(startRow);
		result.append(", startTable: ");
		result.append(startTable);
		result.append(", step: ");
		if (stepESet) result.append(step); else result.append("<unset>");
		result.append(", structureProtected: ");
		if (structureProtectedESet) result.append(structureProtected); else result.append("<unset>");
		result.append(", styleName: ");
		result.append(styleName);
		result.append(", table1: ");
		result.append(table1);
		result.append(", tableBackground: ");
		if (tableBackgroundESet) result.append(tableBackground); else result.append("<unset>");
		result.append(", tableName: ");
		result.append(tableName);
		result.append(", targetCellAddress: ");
		result.append(targetCellAddress);
		result.append(", targetRangeAddress1: ");
		result.append(targetRangeAddress1);
		result.append(", trackChanges: ");
		if (trackChangesESet) result.append(trackChanges); else result.append("<unset>");
		result.append(", usedHierarchy: ");
		result.append(usedHierarchy);
		result.append(", useLabels: ");
		if (useLabelsESet) result.append(useLabels); else result.append("<unset>");
		result.append(", useRegularExpressions: ");
		if (useRegularExpressionsESet) result.append(useRegularExpressions); else result.append("<unset>");
		result.append(", userName: ");
		result.append(userName);
		result.append(", value: ");
		result.append(value);
		result.append(", visibility: ");
		if (visibilityESet) result.append(visibility); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //DocumentRootImpl
