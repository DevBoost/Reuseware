/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.office;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.oasisopen.names.tc.opendocument.xmlns.table.CalculationSettingsType;
import org.oasisopen.names.tc.opendocument.xmlns.table.ConsolidationType;
import org.oasisopen.names.tc.opendocument.xmlns.table.ContentValidationsType;
import org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotTablesType;
import org.oasisopen.names.tc.opendocument.xmlns.table.DatabaseRangesType;
import org.oasisopen.names.tc.opendocument.xmlns.table.DdeLinksType;
import org.oasisopen.names.tc.opendocument.xmlns.table.LabelRangesType;
import org.oasisopen.names.tc.opendocument.xmlns.table.NamedExpressionsType;
import org.oasisopen.names.tc.opendocument.xmlns.text.AlphabeticalIndexAutoMarkFileType;
import org.oasisopen.names.tc.opendocument.xmlns.text.DdeConnectionDeclsType;
import org.oasisopen.names.tc.opendocument.xmlns.text.OfficeChartContentMainType;
import org.oasisopen.names.tc.opendocument.xmlns.text.SequenceDeclsType;
import org.oasisopen.names.tc.opendocument.xmlns.text.UserFieldDeclsType;
import org.oasisopen.names.tc.opendocument.xmlns.text.VariableDeclsType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Chart Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.ChartType#getVariableDecls <em>Variable Decls</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.ChartType#getSequenceDecls <em>Sequence Decls</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.ChartType#getUserFieldDecls <em>User Field Decls</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.ChartType#getDdeConnectionDecls <em>Dde Connection Decls</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.ChartType#getAlphabeticalIndexAutoMarkFile <em>Alphabetical Index Auto Mark File</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.ChartType#getCalculationSettings <em>Calculation Settings</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.ChartType#getContentValidations <em>Content Validations</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.ChartType#getLabelRanges <em>Label Ranges</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.ChartType#getOfficeChartContentMainGroup <em>Office Chart Content Main Group</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.ChartType#getOfficeChartContentMain <em>Office Chart Content Main</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.ChartType#getNamedExpressions <em>Named Expressions</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.ChartType#getDatabaseRanges <em>Database Ranges</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.ChartType#getDataPilotTables <em>Data Pilot Tables</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.ChartType#getConsolidation <em>Consolidation</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.ChartType#getDdeLinks <em>Dde Links</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oasisopen.names.tc.opendocument.xmlns.office.OfficePackage#getChartType()
 * @model extendedMetaData="name='chart_._type' kind='elementOnly'"
 * @generated
 */
public interface ChartType extends EObject {
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.OfficePackage#getChartType_VariableDecls()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='variable-decls' namespace='urn:oasis:names:tc:opendocument:xmlns:text:1.0'"
	 * @generated
	 */
	VariableDeclsType getVariableDecls();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.office.ChartType#getVariableDecls <em>Variable Decls</em>}' containment reference.
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.OfficePackage#getChartType_SequenceDecls()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='sequence-decls' namespace='urn:oasis:names:tc:opendocument:xmlns:text:1.0'"
	 * @generated
	 */
	SequenceDeclsType getSequenceDecls();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.office.ChartType#getSequenceDecls <em>Sequence Decls</em>}' containment reference.
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.OfficePackage#getChartType_UserFieldDecls()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='user-field-decls' namespace='urn:oasis:names:tc:opendocument:xmlns:text:1.0'"
	 * @generated
	 */
	UserFieldDeclsType getUserFieldDecls();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.office.ChartType#getUserFieldDecls <em>User Field Decls</em>}' containment reference.
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.OfficePackage#getChartType_DdeConnectionDecls()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dde-connection-decls' namespace='urn:oasis:names:tc:opendocument:xmlns:text:1.0'"
	 * @generated
	 */
	DdeConnectionDeclsType getDdeConnectionDecls();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.office.ChartType#getDdeConnectionDecls <em>Dde Connection Decls</em>}' containment reference.
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.OfficePackage#getChartType_AlphabeticalIndexAutoMarkFile()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='alphabetical-index-auto-mark-file' namespace='urn:oasis:names:tc:opendocument:xmlns:text:1.0'"
	 * @generated
	 */
	AlphabeticalIndexAutoMarkFileType getAlphabeticalIndexAutoMarkFile();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.office.ChartType#getAlphabeticalIndexAutoMarkFile <em>Alphabetical Index Auto Mark File</em>}' containment reference.
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.OfficePackage#getChartType_CalculationSettings()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='calculation-settings' namespace='urn:oasis:names:tc:opendocument:xmlns:table:1.0'"
	 * @generated
	 */
	CalculationSettingsType getCalculationSettings();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.office.ChartType#getCalculationSettings <em>Calculation Settings</em>}' containment reference.
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.OfficePackage#getChartType_ContentValidations()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='content-validations' namespace='urn:oasis:names:tc:opendocument:xmlns:table:1.0'"
	 * @generated
	 */
	ContentValidationsType getContentValidations();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.office.ChartType#getContentValidations <em>Content Validations</em>}' containment reference.
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.OfficePackage#getChartType_LabelRanges()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='label-ranges' namespace='urn:oasis:names:tc:opendocument:xmlns:table:1.0'"
	 * @generated
	 */
	LabelRangesType getLabelRanges();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.office.ChartType#getLabelRanges <em>Label Ranges</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label Ranges</em>' containment reference.
	 * @see #getLabelRanges()
	 * @generated
	 */
	void setLabelRanges(LabelRangesType value);

	/**
	 * Returns the value of the '<em><b>Office Chart Content Main Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Office Chart Content Main Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Office Chart Content Main Group</em>' attribute list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.OfficePackage#getChartType_OfficeChartContentMainGroup()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" required="true" many="false"
	 *        extendedMetaData="kind='group' name='office-chart-content-main:group' namespace='urn:oasis:names:tc:opendocument:xmlns:text:1.0'"
	 * @generated
	 */
	FeatureMap getOfficeChartContentMainGroup();

	/**
	 * Returns the value of the '<em><b>Office Chart Content Main</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Office Chart Content Main</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Office Chart Content Main</em>' containment reference.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.OfficePackage#getChartType_OfficeChartContentMain()
	 * @model containment="true" required="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='office-chart-content-main' namespace='urn:oasis:names:tc:opendocument:xmlns:text:1.0' group='urn:oasis:names:tc:opendocument:xmlns:text:1.0#office-chart-content-main:group'"
	 * @generated
	 */
	OfficeChartContentMainType getOfficeChartContentMain();

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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.OfficePackage#getChartType_NamedExpressions()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='named-expressions' namespace='urn:oasis:names:tc:opendocument:xmlns:table:1.0'"
	 * @generated
	 */
	NamedExpressionsType getNamedExpressions();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.office.ChartType#getNamedExpressions <em>Named Expressions</em>}' containment reference.
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.OfficePackage#getChartType_DatabaseRanges()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='database-ranges' namespace='urn:oasis:names:tc:opendocument:xmlns:table:1.0'"
	 * @generated
	 */
	DatabaseRangesType getDatabaseRanges();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.office.ChartType#getDatabaseRanges <em>Database Ranges</em>}' containment reference.
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.OfficePackage#getChartType_DataPilotTables()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='data-pilot-tables' namespace='urn:oasis:names:tc:opendocument:xmlns:table:1.0'"
	 * @generated
	 */
	DataPilotTablesType getDataPilotTables();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.office.ChartType#getDataPilotTables <em>Data Pilot Tables</em>}' containment reference.
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.OfficePackage#getChartType_Consolidation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='consolidation' namespace='urn:oasis:names:tc:opendocument:xmlns:table:1.0'"
	 * @generated
	 */
	ConsolidationType getConsolidation();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.office.ChartType#getConsolidation <em>Consolidation</em>}' containment reference.
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.OfficePackage#getChartType_DdeLinks()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dde-links' namespace='urn:oasis:names:tc:opendocument:xmlns:table:1.0'"
	 * @generated
	 */
	DdeLinksType getDdeLinks();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.office.ChartType#getDdeLinks <em>Dde Links</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dde Links</em>' containment reference.
	 * @see #getDdeLinks()
	 * @generated
	 */
	void setDdeLinks(DdeLinksType value);

} // ChartType
