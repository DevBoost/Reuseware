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

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Pilot Table Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotTableType#getDatabaseSourceSql <em>Database Source Sql</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotTableType#getDatabaseSourceQuery <em>Database Source Query</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotTableType#getDatabaseSourceTable <em>Database Source Table</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotTableType#getSourceService <em>Source Service</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotTableType#getSourceCellRange <em>Source Cell Range</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotTableType#getDataPilotField <em>Data Pilot Field</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotTableType#getApplicationData <em>Application Data</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotTableType#getButtons <em>Buttons</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotTableType#getDrillDownOnDoubleClick <em>Drill Down On Double Click</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotTableType#getGrandTotal <em>Grand Total</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotTableType#getIdentifyCategories <em>Identify Categories</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotTableType#getIgnoreEmptyRows <em>Ignore Empty Rows</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotTableType#getName <em>Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotTableType#getShowFilterButton <em>Show Filter Button</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotTableType#getTargetRangeAddress <em>Target Range Address</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDataPilotTableType()
 * @model extendedMetaData="name='data-pilot-table_._type' kind='elementOnly'"
 * @generated
 */
public interface DataPilotTableType extends EObject {
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDataPilotTableType_DatabaseSourceSql()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='database-source-sql' namespace='##targetNamespace'"
	 * @generated
	 */
	DatabaseSourceSqlType getDatabaseSourceSql();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotTableType#getDatabaseSourceSql <em>Database Source Sql</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Database Source Sql</em>' containment reference.
	 * @see #getDatabaseSourceSql()
	 * @generated
	 */
	void setDatabaseSourceSql(DatabaseSourceSqlType value);

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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDataPilotTableType_DatabaseSourceQuery()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='database-source-query' namespace='##targetNamespace'"
	 * @generated
	 */
	DatabaseSourceQueryType getDatabaseSourceQuery();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotTableType#getDatabaseSourceQuery <em>Database Source Query</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Database Source Query</em>' containment reference.
	 * @see #getDatabaseSourceQuery()
	 * @generated
	 */
	void setDatabaseSourceQuery(DatabaseSourceQueryType value);

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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDataPilotTableType_DatabaseSourceTable()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='database-source-table' namespace='##targetNamespace'"
	 * @generated
	 */
	DatabaseSourceTableType getDatabaseSourceTable();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotTableType#getDatabaseSourceTable <em>Database Source Table</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Database Source Table</em>' containment reference.
	 * @see #getDatabaseSourceTable()
	 * @generated
	 */
	void setDatabaseSourceTable(DatabaseSourceTableType value);

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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDataPilotTableType_SourceService()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='source-service' namespace='##targetNamespace'"
	 * @generated
	 */
	SourceServiceType getSourceService();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotTableType#getSourceService <em>Source Service</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Service</em>' containment reference.
	 * @see #getSourceService()
	 * @generated
	 */
	void setSourceService(SourceServiceType value);

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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDataPilotTableType_SourceCellRange()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='source-cell-range' namespace='##targetNamespace'"
	 * @generated
	 */
	SourceCellRangeType getSourceCellRange();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotTableType#getSourceCellRange <em>Source Cell Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Cell Range</em>' containment reference.
	 * @see #getSourceCellRange()
	 * @generated
	 */
	void setSourceCellRange(SourceCellRangeType value);

	/**
	 * Returns the value of the '<em><b>Data Pilot Field</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotFieldType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Pilot Field</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Pilot Field</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDataPilotTableType_DataPilotField()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='data-pilot-field' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DataPilotFieldType> getDataPilotField();

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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDataPilotTableType_ApplicationData()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='application-data' namespace='##targetNamespace'"
	 * @generated
	 */
	String getApplicationData();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotTableType#getApplicationData <em>Application Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Application Data</em>' attribute.
	 * @see #getApplicationData()
	 * @generated
	 */
	void setApplicationData(String value);

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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDataPilotTableType_Buttons()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.CellRangeAddressList"
	 *        extendedMetaData="kind='attribute' name='buttons' namespace='##targetNamespace'"
	 * @generated
	 */
	String getButtons();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotTableType#getButtons <em>Buttons</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Buttons</em>' attribute.
	 * @see #getButtons()
	 * @generated
	 */
	void setButtons(String value);

	/**
	 * Returns the value of the '<em><b>Drill Down On Double Click</b></em>' attribute.
	 * The default value is <code>"true"</code>.
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDataPilotTableType_DrillDownOnDoubleClick()
	 * @model default="true" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='drill-down-on-double-click' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getDrillDownOnDoubleClick();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotTableType#getDrillDownOnDoubleClick <em>Drill Down On Double Click</em>}' attribute.
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
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotTableType#getDrillDownOnDoubleClick <em>Drill Down On Double Click</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDrillDownOnDoubleClick()
	 * @see #getDrillDownOnDoubleClick()
	 * @see #setDrillDownOnDoubleClick(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetDrillDownOnDoubleClick();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotTableType#getDrillDownOnDoubleClick <em>Drill Down On Double Click</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Grand Total</b></em>' attribute.
	 * The default value is <code>"both"</code>.
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDataPilotTableType_GrandTotal()
	 * @model default="both" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='grand-total' namespace='##targetNamespace'"
	 * @generated
	 */
	GrandTotalType getGrandTotal();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotTableType#getGrandTotal <em>Grand Total</em>}' attribute.
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
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotTableType#getGrandTotal <em>Grand Total</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetGrandTotal()
	 * @see #getGrandTotal()
	 * @see #setGrandTotal(GrandTotalType)
	 * @generated
	 */
	void unsetGrandTotal();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotTableType#getGrandTotal <em>Grand Total</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Identify Categories</b></em>' attribute.
	 * The default value is <code>"false"</code>.
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDataPilotTableType_IdentifyCategories()
	 * @model default="false" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='identify-categories' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getIdentifyCategories();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotTableType#getIdentifyCategories <em>Identify Categories</em>}' attribute.
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
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotTableType#getIdentifyCategories <em>Identify Categories</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIdentifyCategories()
	 * @see #getIdentifyCategories()
	 * @see #setIdentifyCategories(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetIdentifyCategories();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotTableType#getIdentifyCategories <em>Identify Categories</em>}' attribute is set.
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
	 * The default value is <code>"false"</code>.
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDataPilotTableType_IgnoreEmptyRows()
	 * @model default="false" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='ignore-empty-rows' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getIgnoreEmptyRows();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotTableType#getIgnoreEmptyRows <em>Ignore Empty Rows</em>}' attribute.
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
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotTableType#getIgnoreEmptyRows <em>Ignore Empty Rows</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIgnoreEmptyRows()
	 * @see #getIgnoreEmptyRows()
	 * @see #setIgnoreEmptyRows(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetIgnoreEmptyRows();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotTableType#getIgnoreEmptyRows <em>Ignore Empty Rows</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDataPilotTableType_Name()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String" required="true"
	 *        extendedMetaData="kind='attribute' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotTableType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Show Filter Button</b></em>' attribute.
	 * The default value is <code>"true"</code>.
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDataPilotTableType_ShowFilterButton()
	 * @model default="true" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='show-filter-button' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getShowFilterButton();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotTableType#getShowFilterButton <em>Show Filter Button</em>}' attribute.
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
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotTableType#getShowFilterButton <em>Show Filter Button</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetShowFilterButton()
	 * @see #getShowFilterButton()
	 * @see #setShowFilterButton(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetShowFilterButton();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotTableType#getShowFilterButton <em>Show Filter Button</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Target Range Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Range Address</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Range Address</em>' attribute.
	 * @see #setTargetRangeAddress(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDataPilotTableType_TargetRangeAddress()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.CellRangeAddress" required="true"
	 *        extendedMetaData="kind='attribute' name='target-range-address' namespace='##targetNamespace'"
	 * @generated
	 */
	String getTargetRangeAddress();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotTableType#getTargetRangeAddress <em>Target Range Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Range Address</em>' attribute.
	 * @see #getTargetRangeAddress()
	 * @generated
	 */
	void setTargetRangeAddress(String value);

} // DataPilotTableType
