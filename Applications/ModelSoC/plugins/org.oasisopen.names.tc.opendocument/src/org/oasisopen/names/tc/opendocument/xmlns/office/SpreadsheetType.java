/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.office;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.oasisopen.names.tc.opendocument.xmlns.table.CalculationSettingsType;
import org.oasisopen.names.tc.opendocument.xmlns.table.ConsolidationType;
import org.oasisopen.names.tc.opendocument.xmlns.table.ContentValidationsType;
import org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotTablesType;
import org.oasisopen.names.tc.opendocument.xmlns.table.DatabaseRangesType;
import org.oasisopen.names.tc.opendocument.xmlns.table.DdeLinksType;
import org.oasisopen.names.tc.opendocument.xmlns.table.LabelRangesType;
import org.oasisopen.names.tc.opendocument.xmlns.table.NamedExpressionsType;
import org.oasisopen.names.tc.opendocument.xmlns.table.TableType;
import org.oasisopen.names.tc.opendocument.xmlns.table.TrackedChangesType;
import org.oasisopen.names.tc.opendocument.xmlns.text.AlphabeticalIndexAutoMarkFileType;
import org.oasisopen.names.tc.opendocument.xmlns.text.DdeConnectionDeclsType;
import org.oasisopen.names.tc.opendocument.xmlns.text.SequenceDeclsType;
import org.oasisopen.names.tc.opendocument.xmlns.text.UserFieldDeclsType;
import org.oasisopen.names.tc.opendocument.xmlns.text.VariableDeclsType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Spreadsheet Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.SpreadsheetType#getTrackedChanges <em>Tracked Changes</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.SpreadsheetType#getVariableDecls <em>Variable Decls</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.SpreadsheetType#getSequenceDecls <em>Sequence Decls</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.SpreadsheetType#getUserFieldDecls <em>User Field Decls</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.SpreadsheetType#getDdeConnectionDecls <em>Dde Connection Decls</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.SpreadsheetType#getAlphabeticalIndexAutoMarkFile <em>Alphabetical Index Auto Mark File</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.SpreadsheetType#getCalculationSettings <em>Calculation Settings</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.SpreadsheetType#getContentValidations <em>Content Validations</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.SpreadsheetType#getLabelRanges <em>Label Ranges</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.SpreadsheetType#getTable <em>Table</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.SpreadsheetType#getNamedExpressions <em>Named Expressions</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.SpreadsheetType#getDatabaseRanges <em>Database Ranges</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.SpreadsheetType#getDataPilotTables <em>Data Pilot Tables</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.SpreadsheetType#getConsolidation <em>Consolidation</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.SpreadsheetType#getDdeLinks <em>Dde Links</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.SpreadsheetType#getProtectionKey <em>Protection Key</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.SpreadsheetType#getStructureProtected <em>Structure Protected</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oasisopen.names.tc.opendocument.xmlns.office.OfficePackage#getSpreadsheetType()
 * @model extendedMetaData="name='spreadsheet_._type' kind='elementOnly'"
 * @generated
 */
public interface SpreadsheetType extends EObject {
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.OfficePackage#getSpreadsheetType_TrackedChanges()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='tracked-changes' namespace='urn:oasis:names:tc:opendocument:xmlns:table:1.0'"
	 * @generated
	 */
	TrackedChangesType getTrackedChanges();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.office.SpreadsheetType#getTrackedChanges <em>Tracked Changes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tracked Changes</em>' containment reference.
	 * @see #getTrackedChanges()
	 * @generated
	 */
	void setTrackedChanges(TrackedChangesType value);

	/**
	 * Returns the value of the '<em><b>Variable Decls</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable Decls</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable Decls</em>' containment reference.
	 * @see #setVariableDecls(VariableDeclsType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.OfficePackage#getSpreadsheetType_VariableDecls()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='variable-decls' namespace='urn:oasis:names:tc:opendocument:xmlns:text:1.0'"
	 * @generated
	 */
	VariableDeclsType getVariableDecls();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.office.SpreadsheetType#getVariableDecls <em>Variable Decls</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable Decls</em>' containment reference.
	 * @see #getVariableDecls()
	 * @generated
	 */
	void setVariableDecls(VariableDeclsType value);

	/**
	 * Returns the value of the '<em><b>Sequence Decls</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sequence Decls</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sequence Decls</em>' containment reference.
	 * @see #setSequenceDecls(SequenceDeclsType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.OfficePackage#getSpreadsheetType_SequenceDecls()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='sequence-decls' namespace='urn:oasis:names:tc:opendocument:xmlns:text:1.0'"
	 * @generated
	 */
	SequenceDeclsType getSequenceDecls();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.office.SpreadsheetType#getSequenceDecls <em>Sequence Decls</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequence Decls</em>' containment reference.
	 * @see #getSequenceDecls()
	 * @generated
	 */
	void setSequenceDecls(SequenceDeclsType value);

	/**
	 * Returns the value of the '<em><b>User Field Decls</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Field Decls</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Field Decls</em>' containment reference.
	 * @see #setUserFieldDecls(UserFieldDeclsType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.OfficePackage#getSpreadsheetType_UserFieldDecls()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='user-field-decls' namespace='urn:oasis:names:tc:opendocument:xmlns:text:1.0'"
	 * @generated
	 */
	UserFieldDeclsType getUserFieldDecls();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.office.SpreadsheetType#getUserFieldDecls <em>User Field Decls</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Field Decls</em>' containment reference.
	 * @see #getUserFieldDecls()
	 * @generated
	 */
	void setUserFieldDecls(UserFieldDeclsType value);

	/**
	 * Returns the value of the '<em><b>Dde Connection Decls</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dde Connection Decls</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dde Connection Decls</em>' containment reference.
	 * @see #setDdeConnectionDecls(DdeConnectionDeclsType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.OfficePackage#getSpreadsheetType_DdeConnectionDecls()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dde-connection-decls' namespace='urn:oasis:names:tc:opendocument:xmlns:text:1.0'"
	 * @generated
	 */
	DdeConnectionDeclsType getDdeConnectionDecls();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.office.SpreadsheetType#getDdeConnectionDecls <em>Dde Connection Decls</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dde Connection Decls</em>' containment reference.
	 * @see #getDdeConnectionDecls()
	 * @generated
	 */
	void setDdeConnectionDecls(DdeConnectionDeclsType value);

	/**
	 * Returns the value of the '<em><b>Alphabetical Index Auto Mark File</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alphabetical Index Auto Mark File</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alphabetical Index Auto Mark File</em>' containment reference.
	 * @see #setAlphabeticalIndexAutoMarkFile(AlphabeticalIndexAutoMarkFileType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.OfficePackage#getSpreadsheetType_AlphabeticalIndexAutoMarkFile()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='alphabetical-index-auto-mark-file' namespace='urn:oasis:names:tc:opendocument:xmlns:text:1.0'"
	 * @generated
	 */
	AlphabeticalIndexAutoMarkFileType getAlphabeticalIndexAutoMarkFile();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.office.SpreadsheetType#getAlphabeticalIndexAutoMarkFile <em>Alphabetical Index Auto Mark File</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alphabetical Index Auto Mark File</em>' containment reference.
	 * @see #getAlphabeticalIndexAutoMarkFile()
	 * @generated
	 */
	void setAlphabeticalIndexAutoMarkFile(AlphabeticalIndexAutoMarkFileType value);

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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.OfficePackage#getSpreadsheetType_CalculationSettings()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='calculation-settings' namespace='urn:oasis:names:tc:opendocument:xmlns:table:1.0'"
	 * @generated
	 */
	CalculationSettingsType getCalculationSettings();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.office.SpreadsheetType#getCalculationSettings <em>Calculation Settings</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Calculation Settings</em>' containment reference.
	 * @see #getCalculationSettings()
	 * @generated
	 */
	void setCalculationSettings(CalculationSettingsType value);

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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.OfficePackage#getSpreadsheetType_ContentValidations()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='content-validations' namespace='urn:oasis:names:tc:opendocument:xmlns:table:1.0'"
	 * @generated
	 */
	ContentValidationsType getContentValidations();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.office.SpreadsheetType#getContentValidations <em>Content Validations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content Validations</em>' containment reference.
	 * @see #getContentValidations()
	 * @generated
	 */
	void setContentValidations(ContentValidationsType value);

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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.OfficePackage#getSpreadsheetType_LabelRanges()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='label-ranges' namespace='urn:oasis:names:tc:opendocument:xmlns:table:1.0'"
	 * @generated
	 */
	LabelRangesType getLabelRanges();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.office.SpreadsheetType#getLabelRanges <em>Label Ranges</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label Ranges</em>' containment reference.
	 * @see #getLabelRanges()
	 * @generated
	 */
	void setLabelRanges(LabelRangesType value);

	/**
	 * Returns the value of the '<em><b>Table</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.table.TableType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.OfficePackage#getSpreadsheetType_Table()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='table' namespace='urn:oasis:names:tc:opendocument:xmlns:table:1.0'"
	 * @generated
	 */
	EList<TableType> getTable();

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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.OfficePackage#getSpreadsheetType_NamedExpressions()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='named-expressions' namespace='urn:oasis:names:tc:opendocument:xmlns:table:1.0'"
	 * @generated
	 */
	NamedExpressionsType getNamedExpressions();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.office.SpreadsheetType#getNamedExpressions <em>Named Expressions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Named Expressions</em>' containment reference.
	 * @see #getNamedExpressions()
	 * @generated
	 */
	void setNamedExpressions(NamedExpressionsType value);

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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.OfficePackage#getSpreadsheetType_DatabaseRanges()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='database-ranges' namespace='urn:oasis:names:tc:opendocument:xmlns:table:1.0'"
	 * @generated
	 */
	DatabaseRangesType getDatabaseRanges();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.office.SpreadsheetType#getDatabaseRanges <em>Database Ranges</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Database Ranges</em>' containment reference.
	 * @see #getDatabaseRanges()
	 * @generated
	 */
	void setDatabaseRanges(DatabaseRangesType value);

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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.OfficePackage#getSpreadsheetType_DataPilotTables()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='data-pilot-tables' namespace='urn:oasis:names:tc:opendocument:xmlns:table:1.0'"
	 * @generated
	 */
	DataPilotTablesType getDataPilotTables();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.office.SpreadsheetType#getDataPilotTables <em>Data Pilot Tables</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Pilot Tables</em>' containment reference.
	 * @see #getDataPilotTables()
	 * @generated
	 */
	void setDataPilotTables(DataPilotTablesType value);

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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.OfficePackage#getSpreadsheetType_Consolidation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='consolidation' namespace='urn:oasis:names:tc:opendocument:xmlns:table:1.0'"
	 * @generated
	 */
	ConsolidationType getConsolidation();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.office.SpreadsheetType#getConsolidation <em>Consolidation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Consolidation</em>' containment reference.
	 * @see #getConsolidation()
	 * @generated
	 */
	void setConsolidation(ConsolidationType value);

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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.OfficePackage#getSpreadsheetType_DdeLinks()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dde-links' namespace='urn:oasis:names:tc:opendocument:xmlns:table:1.0'"
	 * @generated
	 */
	DdeLinksType getDdeLinks();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.office.SpreadsheetType#getDdeLinks <em>Dde Links</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dde Links</em>' containment reference.
	 * @see #getDdeLinks()
	 * @generated
	 */
	void setDdeLinks(DdeLinksType value);

	/**
	 * Returns the value of the '<em><b>Protection Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Protection Key</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Protection Key</em>' attribute.
	 * @see #setProtectionKey(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.OfficePackage#getSpreadsheetType_ProtectionKey()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String" required="true"
	 *        extendedMetaData="kind='attribute' name='protection-key' namespace='urn:oasis:names:tc:opendocument:xmlns:table:1.0'"
	 * @generated
	 */
	String getProtectionKey();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.office.SpreadsheetType#getProtectionKey <em>Protection Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protection Key</em>' attribute.
	 * @see #getProtectionKey()
	 * @generated
	 */
	void setProtectionKey(String value);

	/**
	 * Returns the value of the '<em><b>Structure Protected</b></em>' attribute.
	 * The default value is <code>"false"</code>.
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.OfficePackage#getSpreadsheetType_StructureProtected()
	 * @model default="false" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='structure-protected' namespace='urn:oasis:names:tc:opendocument:xmlns:table:1.0'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getStructureProtected();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.office.SpreadsheetType#getStructureProtected <em>Structure Protected</em>}' attribute.
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
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.office.SpreadsheetType#getStructureProtected <em>Structure Protected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStructureProtected()
	 * @see #getStructureProtected()
	 * @see #setStructureProtected(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetStructureProtected();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.office.SpreadsheetType#getStructureProtected <em>Structure Protected</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Structure Protected</em>' attribute is set.
	 * @see #unsetStructureProtected()
	 * @see #getStructureProtected()
	 * @see #setStructureProtected(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetStructureProtected();

} // SpreadsheetType
