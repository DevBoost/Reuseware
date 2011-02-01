/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.table;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.oasisopen.names.tc.opendocument.xmlns.office.FormsType;
import org.oasisopen.names.tc.opendocument.xmlns.text.SoftPageBreakType;
import org.oasisopen.names.tc.opendocument.xmlns.text.TextSectionSourceDdeType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableType#getTableSource <em>Table Source</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableType#getDdeSource <em>Dde Source</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableType#getScenario <em>Scenario</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableType#getForms <em>Forms</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableType#getShapes <em>Shapes</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableType#getGroup <em>Group</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableType#getTableColumnGroup <em>Table Column Group</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableType#getTableColumns <em>Table Columns</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableType#getTableColumn <em>Table Column</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableType#getTableHeaderColumns <em>Table Header Columns</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableType#getTableColumns1 <em>Table Columns1</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableType#getTableColumn1 <em>Table Column1</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableType#getTableHeaderColumns1 <em>Table Header Columns1</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableType#getTableColumns2 <em>Table Columns2</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableType#getTableColumn2 <em>Table Column2</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableType#getGroup1 <em>Group1</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableType#getTableRowGroup <em>Table Row Group</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableType#getTableRows <em>Table Rows</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableType#getSoftPageBreak <em>Soft Page Break</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableType#getTableRow <em>Table Row</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableType#getTableHeaderRows <em>Table Header Rows</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableType#getTableRows1 <em>Table Rows1</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableType#getSoftPageBreak1 <em>Soft Page Break1</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableType#getTableRow1 <em>Table Row1</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableType#getTableHeaderRows1 <em>Table Header Rows1</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableType#getTableRows2 <em>Table Rows2</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableType#getSoftPageBreak2 <em>Soft Page Break2</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableType#getTableRow2 <em>Table Row2</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableType#getIsSubTable <em>Is Sub Table</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableType#getName <em>Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableType#getPrint <em>Print</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableType#getPrintRanges <em>Print Ranges</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableType#getProtected <em>Protected</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableType#getProtectionKey <em>Protection Key</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableType#getStyleName <em>Style Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getTableType()
 * @model extendedMetaData="name='table_._type' kind='elementOnly'"
 * @generated
 */
public interface TableType extends EObject {
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getTableType_TableSource()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='table-source' namespace='##targetNamespace'"
	 * @generated
	 */
	TableSourceType getTableSource();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableType#getTableSource <em>Table Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table Source</em>' containment reference.
	 * @see #getTableSource()
	 * @generated
	 */
	void setTableSource(TableSourceType value);

	/**
	 * Returns the value of the '<em><b>Dde Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dde Source</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dde Source</em>' containment reference.
	 * @see #setDdeSource(TextSectionSourceDdeType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getTableType_DdeSource()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dde-source' namespace='urn:oasis:names:tc:opendocument:xmlns:office:1.0'"
	 * @generated
	 */
	TextSectionSourceDdeType getDdeSource();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableType#getDdeSource <em>Dde Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dde Source</em>' containment reference.
	 * @see #getDdeSource()
	 * @generated
	 */
	void setDdeSource(TextSectionSourceDdeType value);

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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getTableType_Scenario()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='scenario' namespace='##targetNamespace'"
	 * @generated
	 */
	ScenarioType getScenario();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableType#getScenario <em>Scenario</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scenario</em>' containment reference.
	 * @see #getScenario()
	 * @generated
	 */
	void setScenario(ScenarioType value);

	/**
	 * Returns the value of the '<em><b>Forms</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Forms</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Forms</em>' containment reference.
	 * @see #setForms(FormsType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getTableType_Forms()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='forms' namespace='urn:oasis:names:tc:opendocument:xmlns:office:1.0'"
	 * @generated
	 */
	FormsType getForms();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableType#getForms <em>Forms</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Forms</em>' containment reference.
	 * @see #getForms()
	 * @generated
	 */
	void setForms(FormsType value);

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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getTableType_Shapes()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='shapes' namespace='##targetNamespace'"
	 * @generated
	 */
	ShapesType getShapes();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableType#getShapes <em>Shapes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shapes</em>' containment reference.
	 * @see #getShapes()
	 * @generated
	 */
	void setShapes(ShapesType value);

	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getTableType_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:5'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Table Column Group</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.table.TableColumnGroupType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table Column Group</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table Column Group</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getTableType_TableColumnGroup()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='table-column-group' namespace='##targetNamespace' group='#group:5'"
	 * @generated
	 */
	EList<TableColumnGroupType> getTableColumnGroup();

	/**
	 * Returns the value of the '<em><b>Table Columns</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.table.TableColumnsType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table Columns</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table Columns</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getTableType_TableColumns()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='table-columns' namespace='##targetNamespace' group='#group:5'"
	 * @generated
	 */
	EList<TableColumnsType> getTableColumns();

	/**
	 * Returns the value of the '<em><b>Table Column</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.table.TableColumnType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table Column</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table Column</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getTableType_TableColumn()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='table-column' namespace='##targetNamespace' group='#group:5'"
	 * @generated
	 */
	EList<TableColumnType> getTableColumn();

	/**
	 * Returns the value of the '<em><b>Table Header Columns</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.table.TableHeaderColumnsType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table Header Columns</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table Header Columns</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getTableType_TableHeaderColumns()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='table-header-columns' namespace='##targetNamespace' group='#group:5'"
	 * @generated
	 */
	EList<TableHeaderColumnsType> getTableHeaderColumns();

	/**
	 * Returns the value of the '<em><b>Table Columns1</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.table.TableColumnsType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table Columns1</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table Columns1</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getTableType_TableColumns1()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='table-columns' namespace='##targetNamespace' group='#group:5'"
	 * @generated
	 */
	EList<TableColumnsType> getTableColumns1();

	/**
	 * Returns the value of the '<em><b>Table Column1</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.table.TableColumnType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table Column1</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table Column1</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getTableType_TableColumn1()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='table-column' namespace='##targetNamespace' group='#group:5'"
	 * @generated
	 */
	EList<TableColumnType> getTableColumn1();

	/**
	 * Returns the value of the '<em><b>Table Header Columns1</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.table.TableHeaderColumnsType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table Header Columns1</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table Header Columns1</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getTableType_TableHeaderColumns1()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='table-header-columns' namespace='##targetNamespace' group='#group:5'"
	 * @generated
	 */
	EList<TableHeaderColumnsType> getTableHeaderColumns1();

	/**
	 * Returns the value of the '<em><b>Table Columns2</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.table.TableColumnsType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table Columns2</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table Columns2</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getTableType_TableColumns2()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='table-columns' namespace='##targetNamespace' group='#group:5'"
	 * @generated
	 */
	EList<TableColumnsType> getTableColumns2();

	/**
	 * Returns the value of the '<em><b>Table Column2</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.table.TableColumnType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table Column2</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table Column2</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getTableType_TableColumn2()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='table-column' namespace='##targetNamespace' group='#group:5'"
	 * @generated
	 */
	EList<TableColumnType> getTableColumn2();

	/**
	 * Returns the value of the '<em><b>Group1</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group1</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group1</em>' attribute list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getTableType_Group1()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:15'"
	 * @generated
	 */
	FeatureMap getGroup1();

	/**
	 * Returns the value of the '<em><b>Table Row Group</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.table.TableRowGroupType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table Row Group</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table Row Group</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getTableType_TableRowGroup()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='table-row-group' namespace='##targetNamespace' group='#group:15'"
	 * @generated
	 */
	EList<TableRowGroupType> getTableRowGroup();

	/**
	 * Returns the value of the '<em><b>Table Rows</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.table.TableRowsType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table Rows</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table Rows</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getTableType_TableRows()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='table-rows' namespace='##targetNamespace' group='#group:15'"
	 * @generated
	 */
	EList<TableRowsType> getTableRows();

	/**
	 * Returns the value of the '<em><b>Soft Page Break</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.text.SoftPageBreakType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Soft Page Break</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Soft Page Break</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getTableType_SoftPageBreak()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='soft-page-break' namespace='urn:oasis:names:tc:opendocument:xmlns:text:1.0' group='#group:15'"
	 * @generated
	 */
	EList<SoftPageBreakType> getSoftPageBreak();

	/**
	 * Returns the value of the '<em><b>Table Row</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.table.TableRowType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table Row</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table Row</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getTableType_TableRow()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='table-row' namespace='##targetNamespace' group='#group:15'"
	 * @generated
	 */
	EList<TableRowType> getTableRow();

	/**
	 * Returns the value of the '<em><b>Table Header Rows</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.table.TableHeaderRowsType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table Header Rows</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table Header Rows</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getTableType_TableHeaderRows()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='table-header-rows' namespace='##targetNamespace' group='#group:15'"
	 * @generated
	 */
	EList<TableHeaderRowsType> getTableHeaderRows();

	/**
	 * Returns the value of the '<em><b>Table Rows1</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.table.TableRowsType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table Rows1</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table Rows1</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getTableType_TableRows1()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='table-rows' namespace='##targetNamespace' group='#group:15'"
	 * @generated
	 */
	EList<TableRowsType> getTableRows1();

	/**
	 * Returns the value of the '<em><b>Soft Page Break1</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.text.SoftPageBreakType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Soft Page Break1</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Soft Page Break1</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getTableType_SoftPageBreak1()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='soft-page-break' namespace='urn:oasis:names:tc:opendocument:xmlns:text:1.0' group='#group:15'"
	 * @generated
	 */
	EList<SoftPageBreakType> getSoftPageBreak1();

	/**
	 * Returns the value of the '<em><b>Table Row1</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.table.TableRowType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table Row1</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table Row1</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getTableType_TableRow1()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='table-row' namespace='##targetNamespace' group='#group:15'"
	 * @generated
	 */
	EList<TableRowType> getTableRow1();

	/**
	 * Returns the value of the '<em><b>Table Header Rows1</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.table.TableHeaderRowsType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table Header Rows1</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table Header Rows1</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getTableType_TableHeaderRows1()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='table-header-rows' namespace='##targetNamespace' group='#group:15'"
	 * @generated
	 */
	EList<TableHeaderRowsType> getTableHeaderRows1();

	/**
	 * Returns the value of the '<em><b>Table Rows2</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.table.TableRowsType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table Rows2</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table Rows2</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getTableType_TableRows2()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='table-rows' namespace='##targetNamespace' group='#group:15'"
	 * @generated
	 */
	EList<TableRowsType> getTableRows2();

	/**
	 * Returns the value of the '<em><b>Soft Page Break2</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.text.SoftPageBreakType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Soft Page Break2</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Soft Page Break2</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getTableType_SoftPageBreak2()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='soft-page-break' namespace='urn:oasis:names:tc:opendocument:xmlns:text:1.0' group='#group:15'"
	 * @generated
	 */
	EList<SoftPageBreakType> getSoftPageBreak2();

	/**
	 * Returns the value of the '<em><b>Table Row2</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.table.TableRowType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table Row2</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table Row2</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getTableType_TableRow2()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='table-row' namespace='##targetNamespace' group='#group:15'"
	 * @generated
	 */
	EList<TableRowType> getTableRow2();

	/**
	 * Returns the value of the '<em><b>Is Sub Table</b></em>' attribute.
	 * The default value is <code>"false"</code>.
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getTableType_IsSubTable()
	 * @model default="false" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='is-sub-table' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getIsSubTable();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableType#getIsSubTable <em>Is Sub Table</em>}' attribute.
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
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableType#getIsSubTable <em>Is Sub Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsSubTable()
	 * @see #getIsSubTable()
	 * @see #setIsSubTable(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetIsSubTable();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableType#getIsSubTable <em>Is Sub Table</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getTableType_Name()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String" required="true"
	 *        extendedMetaData="kind='attribute' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Print</b></em>' attribute.
	 * The default value is <code>"true"</code>.
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getTableType_Print()
	 * @model default="true" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='print' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getPrint();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableType#getPrint <em>Print</em>}' attribute.
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
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableType#getPrint <em>Print</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPrint()
	 * @see #getPrint()
	 * @see #setPrint(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetPrint();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableType#getPrint <em>Print</em>}' attribute is set.
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getTableType_PrintRanges()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.CellRangeAddressList"
	 *        extendedMetaData="kind='attribute' name='print-ranges' namespace='##targetNamespace'"
	 * @generated
	 */
	String getPrintRanges();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableType#getPrintRanges <em>Print Ranges</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Print Ranges</em>' attribute.
	 * @see #getPrintRanges()
	 * @generated
	 */
	void setPrintRanges(String value);

	/**
	 * Returns the value of the '<em><b>Protected</b></em>' attribute.
	 * The default value is <code>"false"</code>.
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getTableType_Protected()
	 * @model default="false" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='protected' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getProtected();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableType#getProtected <em>Protected</em>}' attribute.
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
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableType#getProtected <em>Protected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetProtected()
	 * @see #getProtected()
	 * @see #setProtected(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetProtected();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableType#getProtected <em>Protected</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Protection Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Protection Key</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Protection Key</em>' attribute.
	 * @see #setProtectionKey(Object)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getTableType_ProtectionKey()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
	 *        extendedMetaData="kind='attribute' name='protection-key' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getProtectionKey();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableType#getProtectionKey <em>Protection Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protection Key</em>' attribute.
	 * @see #getProtectionKey()
	 * @generated
	 */
	void setProtectionKey(Object value);

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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getTableType_StyleName()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.table.StyleNameType"
	 *        extendedMetaData="kind='attribute' name='style-name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getStyleName();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableType#getStyleName <em>Style Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style Name</em>' attribute.
	 * @see #getStyleName()
	 * @generated
	 */
	void setStyleName(String value);

} // TableType
