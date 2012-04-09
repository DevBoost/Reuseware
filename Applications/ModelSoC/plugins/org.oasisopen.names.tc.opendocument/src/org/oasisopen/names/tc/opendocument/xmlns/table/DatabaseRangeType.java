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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Database Range Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DatabaseRangeType#getDatabaseSourceSql <em>Database Source Sql</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DatabaseRangeType#getDatabaseSourceQuery <em>Database Source Query</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DatabaseRangeType#getDatabaseSourceTable <em>Database Source Table</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DatabaseRangeType#getFilter <em>Filter</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DatabaseRangeType#getSort <em>Sort</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DatabaseRangeType#getSubtotalRules <em>Subtotal Rules</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DatabaseRangeType#getContainsHeader <em>Contains Header</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DatabaseRangeType#getDisplayFilterButtons <em>Display Filter Buttons</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DatabaseRangeType#getHasPersistentData <em>Has Persistent Data</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DatabaseRangeType#getIsSelection <em>Is Selection</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DatabaseRangeType#getName <em>Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DatabaseRangeType#getOnUpdateKeepSize <em>On Update Keep Size</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DatabaseRangeType#getOnUpdateKeepStyles <em>On Update Keep Styles</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DatabaseRangeType#getOrientation <em>Orientation</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DatabaseRangeType#getRefreshDelay <em>Refresh Delay</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DatabaseRangeType#getTargetRangeAddress <em>Target Range Address</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDatabaseRangeType()
 * @model extendedMetaData="name='database-range_._type' kind='elementOnly'"
 * @generated
 */
public interface DatabaseRangeType extends EObject {
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDatabaseRangeType_DatabaseSourceSql()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='database-source-sql' namespace='##targetNamespace'"
	 * @generated
	 */
	DatabaseSourceSqlType getDatabaseSourceSql();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DatabaseRangeType#getDatabaseSourceSql <em>Database Source Sql</em>}' containment reference.
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDatabaseRangeType_DatabaseSourceQuery()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='database-source-query' namespace='##targetNamespace'"
	 * @generated
	 */
	DatabaseSourceQueryType getDatabaseSourceQuery();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DatabaseRangeType#getDatabaseSourceQuery <em>Database Source Query</em>}' containment reference.
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDatabaseRangeType_DatabaseSourceTable()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='database-source-table' namespace='##targetNamespace'"
	 * @generated
	 */
	DatabaseSourceTableType getDatabaseSourceTable();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DatabaseRangeType#getDatabaseSourceTable <em>Database Source Table</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Database Source Table</em>' containment reference.
	 * @see #getDatabaseSourceTable()
	 * @generated
	 */
	void setDatabaseSourceTable(DatabaseSourceTableType value);

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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDatabaseRangeType_Filter()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='filter' namespace='##targetNamespace'"
	 * @generated
	 */
	FilterType getFilter();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DatabaseRangeType#getFilter <em>Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filter</em>' containment reference.
	 * @see #getFilter()
	 * @generated
	 */
	void setFilter(FilterType value);

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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDatabaseRangeType_Sort()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='sort' namespace='##targetNamespace'"
	 * @generated
	 */
	SortType getSort();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DatabaseRangeType#getSort <em>Sort</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sort</em>' containment reference.
	 * @see #getSort()
	 * @generated
	 */
	void setSort(SortType value);

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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDatabaseRangeType_SubtotalRules()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='subtotal-rules' namespace='##targetNamespace'"
	 * @generated
	 */
	SubtotalRulesType getSubtotalRules();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DatabaseRangeType#getSubtotalRules <em>Subtotal Rules</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subtotal Rules</em>' containment reference.
	 * @see #getSubtotalRules()
	 * @generated
	 */
	void setSubtotalRules(SubtotalRulesType value);

	/**
	 * Returns the value of the '<em><b>Contains Header</b></em>' attribute.
	 * The default value is <code>"true"</code>.
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDatabaseRangeType_ContainsHeader()
	 * @model default="true" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='contains-header' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getContainsHeader();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DatabaseRangeType#getContainsHeader <em>Contains Header</em>}' attribute.
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
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DatabaseRangeType#getContainsHeader <em>Contains Header</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetContainsHeader()
	 * @see #getContainsHeader()
	 * @see #setContainsHeader(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetContainsHeader();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DatabaseRangeType#getContainsHeader <em>Contains Header</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Display Filter Buttons</b></em>' attribute.
	 * The default value is <code>"false"</code>.
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDatabaseRangeType_DisplayFilterButtons()
	 * @model default="false" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='display-filter-buttons' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getDisplayFilterButtons();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DatabaseRangeType#getDisplayFilterButtons <em>Display Filter Buttons</em>}' attribute.
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
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DatabaseRangeType#getDisplayFilterButtons <em>Display Filter Buttons</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDisplayFilterButtons()
	 * @see #getDisplayFilterButtons()
	 * @see #setDisplayFilterButtons(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetDisplayFilterButtons();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DatabaseRangeType#getDisplayFilterButtons <em>Display Filter Buttons</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Has Persistent Data</b></em>' attribute.
	 * The default value is <code>"true"</code>.
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDatabaseRangeType_HasPersistentData()
	 * @model default="true" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='has-persistent-data' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getHasPersistentData();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DatabaseRangeType#getHasPersistentData <em>Has Persistent Data</em>}' attribute.
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
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DatabaseRangeType#getHasPersistentData <em>Has Persistent Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetHasPersistentData()
	 * @see #getHasPersistentData()
	 * @see #setHasPersistentData(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetHasPersistentData();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DatabaseRangeType#getHasPersistentData <em>Has Persistent Data</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Is Selection</b></em>' attribute.
	 * The default value is <code>"false"</code>.
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDatabaseRangeType_IsSelection()
	 * @model default="false" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='is-selection' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getIsSelection();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DatabaseRangeType#getIsSelection <em>Is Selection</em>}' attribute.
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
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DatabaseRangeType#getIsSelection <em>Is Selection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsSelection()
	 * @see #getIsSelection()
	 * @see #setIsSelection(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetIsSelection();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DatabaseRangeType#getIsSelection <em>Is Selection</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDatabaseRangeType_Name()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String" required="true"
	 *        extendedMetaData="kind='attribute' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DatabaseRangeType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>On Update Keep Size</b></em>' attribute.
	 * The default value is <code>"true"</code>.
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDatabaseRangeType_OnUpdateKeepSize()
	 * @model default="true" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='on-update-keep-size' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getOnUpdateKeepSize();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DatabaseRangeType#getOnUpdateKeepSize <em>On Update Keep Size</em>}' attribute.
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
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DatabaseRangeType#getOnUpdateKeepSize <em>On Update Keep Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetOnUpdateKeepSize()
	 * @see #getOnUpdateKeepSize()
	 * @see #setOnUpdateKeepSize(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetOnUpdateKeepSize();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DatabaseRangeType#getOnUpdateKeepSize <em>On Update Keep Size</em>}' attribute is set.
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
	 * The default value is <code>"false"</code>.
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDatabaseRangeType_OnUpdateKeepStyles()
	 * @model default="false" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='on-update-keep-styles' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getOnUpdateKeepStyles();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DatabaseRangeType#getOnUpdateKeepStyles <em>On Update Keep Styles</em>}' attribute.
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
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DatabaseRangeType#getOnUpdateKeepStyles <em>On Update Keep Styles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetOnUpdateKeepStyles()
	 * @see #getOnUpdateKeepStyles()
	 * @see #setOnUpdateKeepStyles(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetOnUpdateKeepStyles();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DatabaseRangeType#getOnUpdateKeepStyles <em>On Update Keep Styles</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Orientation</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.table.OrientationType1}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Orientation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orientation</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.OrientationType1
	 * @see #isSetOrientation()
	 * @see #unsetOrientation()
	 * @see #setOrientation(OrientationType1)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDatabaseRangeType_Orientation()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='orientation' namespace='##targetNamespace'"
	 * @generated
	 */
	OrientationType1 getOrientation();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DatabaseRangeType#getOrientation <em>Orientation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Orientation</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.OrientationType1
	 * @see #isSetOrientation()
	 * @see #unsetOrientation()
	 * @see #getOrientation()
	 * @generated
	 */
	void setOrientation(OrientationType1 value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DatabaseRangeType#getOrientation <em>Orientation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetOrientation()
	 * @see #getOrientation()
	 * @see #setOrientation(OrientationType1)
	 * @generated
	 */
	void unsetOrientation();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DatabaseRangeType#getOrientation <em>Orientation</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Orientation</em>' attribute is set.
	 * @see #unsetOrientation()
	 * @see #getOrientation()
	 * @see #setOrientation(OrientationType1)
	 * @generated
	 */
	boolean isSetOrientation();

	/**
	 * Returns the value of the '<em><b>Refresh Delay</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Refresh Delay</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refresh Delay</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetRefreshDelay()
	 * @see #unsetRefreshDelay()
	 * @see #setRefreshDelay(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDatabaseRangeType_RefreshDelay()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='refresh-delay' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getRefreshDelay();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DatabaseRangeType#getRefreshDelay <em>Refresh Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refresh Delay</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetRefreshDelay()
	 * @see #unsetRefreshDelay()
	 * @see #getRefreshDelay()
	 * @generated
	 */
	void setRefreshDelay(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DatabaseRangeType#getRefreshDelay <em>Refresh Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRefreshDelay()
	 * @see #getRefreshDelay()
	 * @see #setRefreshDelay(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetRefreshDelay();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DatabaseRangeType#getRefreshDelay <em>Refresh Delay</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Refresh Delay</em>' attribute is set.
	 * @see #unsetRefreshDelay()
	 * @see #getRefreshDelay()
	 * @see #setRefreshDelay(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetRefreshDelay();

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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDatabaseRangeType_TargetRangeAddress()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.CellRangeAddress" required="true"
	 *        extendedMetaData="kind='attribute' name='target-range-address' namespace='##targetNamespace'"
	 * @generated
	 */
	String getTargetRangeAddress();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DatabaseRangeType#getTargetRangeAddress <em>Target Range Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Range Address</em>' attribute.
	 * @see #getTargetRangeAddress()
	 * @generated
	 */
	void setTargetRangeAddress(String value);

} // DatabaseRangeType
