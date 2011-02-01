/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.form;

import java.math.BigInteger;

import javax.xml.datatype.Duration;

import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.oasisopen.names.tc.opendocument.xmlns.text.Navigation;
import org.oasisopen.names.tc.opendocument.xmlns.text.States;
import org.oasisopen.names.tc.opendocument.xmlns.text.TabCycles;
import org.oasisopen.names.tc.opendocument.xmlns.text.Types;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getButton <em>Button</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getCheckbox <em>Checkbox</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getColumn <em>Column</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getCombobox <em>Combobox</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getConnectionResource <em>Connection Resource</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getDate <em>Date</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getFile <em>File</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getFixedText <em>Fixed Text</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getForm <em>Form</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getFormattedText <em>Formatted Text</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getFrame <em>Frame</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getGenericControl <em>Generic Control</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getGrid <em>Grid</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getHidden <em>Hidden</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getImage <em>Image</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getImageFrame <em>Image Frame</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getItem <em>Item</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getListbox <em>Listbox</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getListProperty <em>List Property</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getNumber <em>Number</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getOption <em>Option</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getPassword <em>Password</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getProperty <em>Property</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getRadio <em>Radio</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getText <em>Text</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getTextarea <em>Textarea</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getTime <em>Time</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getValueRange <em>Value Range</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getAllowDeletes <em>Allow Deletes</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getAllowInserts <em>Allow Inserts</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getAllowUpdates <em>Allow Updates</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getApplyDesignMode <em>Apply Design Mode</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getApplyFilter <em>Apply Filter</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getAutoComplete <em>Auto Complete</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getAutomaticFocus <em>Automatic Focus</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getBoundColumn <em>Bound Column</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getButtonType <em>Button Type</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getCommand <em>Command</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getCommandType <em>Command Type</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getControlImplementation <em>Control Implementation</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getConvertEmptyToNull <em>Convert Empty To Null</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getCurrentSelected <em>Current Selected</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getCurrentState <em>Current State</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getDataField <em>Data Field</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getDatasource <em>Datasource</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getDefaultButton <em>Default Button</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getDelayForRepeat <em>Delay For Repeat</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getDetailFields <em>Detail Fields</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getDisabled <em>Disabled</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getDropdown <em>Dropdown</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getEchoChar <em>Echo Char</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getEnctype <em>Enctype</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getEscapeProcessing <em>Escape Processing</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getFilter <em>Filter</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getFocusOnClick <em>Focus On Click</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getFor <em>For</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getId <em>Id</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getIgnoreResult <em>Ignore Result</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getImageAlign <em>Image Align</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getImageData <em>Image Data</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getImagePosition <em>Image Position</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getIsTristate <em>Is Tristate</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getLabel <em>Label</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getListSource <em>List Source</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getListSourceType <em>List Source Type</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getMasterFields <em>Master Fields</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getMaxLength <em>Max Length</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getMethod <em>Method</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getMultiLine <em>Multi Line</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getMultiple <em>Multiple</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getName <em>Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getNavigationMode <em>Navigation Mode</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getOrder <em>Order</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getOrientation <em>Orientation</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getPageStepSize <em>Page Step Size</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getPrintable <em>Printable</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getPropertyName <em>Property Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getReadonly <em>Readonly</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getSelected <em>Selected</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getSize <em>Size</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getState <em>State</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getStepSize <em>Step Size</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getTabCycle <em>Tab Cycle</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getTabIndex <em>Tab Index</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getTabStop <em>Tab Stop</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getTextStyleName <em>Text Style Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getTitle <em>Title</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getToggle <em>Toggle</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getValidation <em>Validation</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getVisualEffect <em>Visual Effect</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getXformsListSource <em>Xforms List Source</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getXformsSubmission <em>Xforms Submission</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormPackage#getDocumentRoot()
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormPackage#getDocumentRoot_Mixed()
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormPackage#getDocumentRoot_XMLNSPrefixMap()
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormPackage#getDocumentRoot_XSISchemaLocation()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" transient="true"
	 *        extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
	 * @generated
	 */
	EMap<String, String> getXSISchemaLocation();

	/**
	 * Returns the value of the '<em><b>Button</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Button</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Button</em>' containment reference.
	 * @see #setButton(ButtonType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormPackage#getDocumentRoot_Button()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='button' namespace='##targetNamespace' affiliation='urn:oasis:names:tc:opendocument:xmlns:text:1.0#controls'"
	 * @generated
	 */
	ButtonType getButton();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getButton <em>Button</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Button</em>' containment reference.
	 * @see #getButton()
	 * @generated
	 */
	void setButton(ButtonType value);

	/**
	 * Returns the value of the '<em><b>Checkbox</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Checkbox</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Checkbox</em>' containment reference.
	 * @see #setCheckbox(CheckboxType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormPackage#getDocumentRoot_Checkbox()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='checkbox' namespace='##targetNamespace' affiliation='urn:oasis:names:tc:opendocument:xmlns:text:1.0#column-controls'"
	 * @generated
	 */
	CheckboxType getCheckbox();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getCheckbox <em>Checkbox</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Checkbox</em>' containment reference.
	 * @see #getCheckbox()
	 * @generated
	 */
	void setCheckbox(CheckboxType value);

	/**
	 * Returns the value of the '<em><b>Column</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Column</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Column</em>' containment reference.
	 * @see #setColumn(ColumnType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormPackage#getDocumentRoot_Column()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='column' namespace='##targetNamespace'"
	 * @generated
	 */
	ColumnType getColumn();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getColumn <em>Column</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Column</em>' containment reference.
	 * @see #getColumn()
	 * @generated
	 */
	void setColumn(ColumnType value);

	/**
	 * Returns the value of the '<em><b>Combobox</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Combobox</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Combobox</em>' containment reference.
	 * @see #setCombobox(ComboboxType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormPackage#getDocumentRoot_Combobox()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='combobox' namespace='##targetNamespace' affiliation='urn:oasis:names:tc:opendocument:xmlns:text:1.0#column-controls'"
	 * @generated
	 */
	ComboboxType getCombobox();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getCombobox <em>Combobox</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Combobox</em>' containment reference.
	 * @see #getCombobox()
	 * @generated
	 */
	void setCombobox(ComboboxType value);

	/**
	 * Returns the value of the '<em><b>Connection Resource</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connection Resource</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connection Resource</em>' containment reference.
	 * @see #setConnectionResource(ConnectionResourceType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormPackage#getDocumentRoot_ConnectionResource()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='connection-resource' namespace='##targetNamespace'"
	 * @generated
	 */
	ConnectionResourceType getConnectionResource();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getConnectionResource <em>Connection Resource</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connection Resource</em>' containment reference.
	 * @see #getConnectionResource()
	 * @generated
	 */
	void setConnectionResource(ConnectionResourceType value);

	/**
	 * Returns the value of the '<em><b>Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' containment reference.
	 * @see #setDate(DateType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormPackage#getDocumentRoot_Date()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='date' namespace='##targetNamespace' affiliation='urn:oasis:names:tc:opendocument:xmlns:text:1.0#column-controls'"
	 * @generated
	 */
	DateType getDate();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getDate <em>Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' containment reference.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(DateType value);

	/**
	 * Returns the value of the '<em><b>File</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>File</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File</em>' containment reference.
	 * @see #setFile(FileType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormPackage#getDocumentRoot_File()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='file' namespace='##targetNamespace' affiliation='urn:oasis:names:tc:opendocument:xmlns:text:1.0#controls'"
	 * @generated
	 */
	FileType getFile();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getFile <em>File</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File</em>' containment reference.
	 * @see #getFile()
	 * @generated
	 */
	void setFile(FileType value);

	/**
	 * Returns the value of the '<em><b>Fixed Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fixed Text</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fixed Text</em>' containment reference.
	 * @see #setFixedText(FixedTextType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormPackage#getDocumentRoot_FixedText()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='fixed-text' namespace='##targetNamespace' affiliation='urn:oasis:names:tc:opendocument:xmlns:text:1.0#controls'"
	 * @generated
	 */
	FixedTextType getFixedText();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getFixedText <em>Fixed Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fixed Text</em>' containment reference.
	 * @see #getFixedText()
	 * @generated
	 */
	void setFixedText(FixedTextType value);

	/**
	 * Returns the value of the '<em><b>Form</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Form</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Form</em>' containment reference.
	 * @see #setForm(FormType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormPackage#getDocumentRoot_Form()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='form' namespace='##targetNamespace'"
	 * @generated
	 */
	FormType getForm();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getForm <em>Form</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Form</em>' containment reference.
	 * @see #getForm()
	 * @generated
	 */
	void setForm(FormType value);

	/**
	 * Returns the value of the '<em><b>Formatted Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Formatted Text</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Formatted Text</em>' containment reference.
	 * @see #setFormattedText(FormattedTextType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormPackage#getDocumentRoot_FormattedText()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='formatted-text' namespace='##targetNamespace' affiliation='urn:oasis:names:tc:opendocument:xmlns:text:1.0#column-controls'"
	 * @generated
	 */
	FormattedTextType getFormattedText();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getFormattedText <em>Formatted Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Formatted Text</em>' containment reference.
	 * @see #getFormattedText()
	 * @generated
	 */
	void setFormattedText(FormattedTextType value);

	/**
	 * Returns the value of the '<em><b>Frame</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Frame</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Frame</em>' containment reference.
	 * @see #setFrame(FrameType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormPackage#getDocumentRoot_Frame()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='frame' namespace='##targetNamespace' affiliation='urn:oasis:names:tc:opendocument:xmlns:text:1.0#controls'"
	 * @generated
	 */
	FrameType getFrame();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getFrame <em>Frame</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Frame</em>' containment reference.
	 * @see #getFrame()
	 * @generated
	 */
	void setFrame(FrameType value);

	/**
	 * Returns the value of the '<em><b>Generic Control</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generic Control</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic Control</em>' containment reference.
	 * @see #setGenericControl(GenericControlType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormPackage#getDocumentRoot_GenericControl()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='generic-control' namespace='##targetNamespace' affiliation='urn:oasis:names:tc:opendocument:xmlns:text:1.0#controls'"
	 * @generated
	 */
	GenericControlType getGenericControl();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getGenericControl <em>Generic Control</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generic Control</em>' containment reference.
	 * @see #getGenericControl()
	 * @generated
	 */
	void setGenericControl(GenericControlType value);

	/**
	 * Returns the value of the '<em><b>Grid</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Grid</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grid</em>' containment reference.
	 * @see #setGrid(GridType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormPackage#getDocumentRoot_Grid()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='grid' namespace='##targetNamespace' affiliation='urn:oasis:names:tc:opendocument:xmlns:text:1.0#controls'"
	 * @generated
	 */
	GridType getGrid();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getGrid <em>Grid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grid</em>' containment reference.
	 * @see #getGrid()
	 * @generated
	 */
	void setGrid(GridType value);

	/**
	 * Returns the value of the '<em><b>Hidden</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hidden</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hidden</em>' containment reference.
	 * @see #setHidden(HiddenType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormPackage#getDocumentRoot_Hidden()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='hidden' namespace='##targetNamespace' affiliation='urn:oasis:names:tc:opendocument:xmlns:text:1.0#controls'"
	 * @generated
	 */
	HiddenType getHidden();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getHidden <em>Hidden</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hidden</em>' containment reference.
	 * @see #getHidden()
	 * @generated
	 */
	void setHidden(HiddenType value);

	/**
	 * Returns the value of the '<em><b>Image</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Image</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image</em>' containment reference.
	 * @see #setImage(ImageType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormPackage#getDocumentRoot_Image()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='image' namespace='##targetNamespace' affiliation='urn:oasis:names:tc:opendocument:xmlns:text:1.0#controls'"
	 * @generated
	 */
	ImageType getImage();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getImage <em>Image</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image</em>' containment reference.
	 * @see #getImage()
	 * @generated
	 */
	void setImage(ImageType value);

	/**
	 * Returns the value of the '<em><b>Image Frame</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Image Frame</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image Frame</em>' containment reference.
	 * @see #setImageFrame(ImageFrameType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormPackage#getDocumentRoot_ImageFrame()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='image-frame' namespace='##targetNamespace' affiliation='urn:oasis:names:tc:opendocument:xmlns:text:1.0#controls'"
	 * @generated
	 */
	ImageFrameType getImageFrame();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getImageFrame <em>Image Frame</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image Frame</em>' containment reference.
	 * @see #getImageFrame()
	 * @generated
	 */
	void setImageFrame(ImageFrameType value);

	/**
	 * Returns the value of the '<em><b>Item</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Item</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item</em>' containment reference.
	 * @see #setItem(ItemType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormPackage#getDocumentRoot_Item()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='item' namespace='##targetNamespace'"
	 * @generated
	 */
	ItemType getItem();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getItem <em>Item</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Item</em>' containment reference.
	 * @see #getItem()
	 * @generated
	 */
	void setItem(ItemType value);

	/**
	 * Returns the value of the '<em><b>Listbox</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Listbox</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Listbox</em>' containment reference.
	 * @see #setListbox(ListboxType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormPackage#getDocumentRoot_Listbox()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='listbox' namespace='##targetNamespace' affiliation='urn:oasis:names:tc:opendocument:xmlns:text:1.0#column-controls'"
	 * @generated
	 */
	ListboxType getListbox();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getListbox <em>Listbox</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Listbox</em>' containment reference.
	 * @see #getListbox()
	 * @generated
	 */
	void setListbox(ListboxType value);

	/**
	 * Returns the value of the '<em><b>List Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>List Property</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Property</em>' containment reference.
	 * @see #setListProperty(ListPropertyType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormPackage#getDocumentRoot_ListProperty()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='list-property' namespace='##targetNamespace' affiliation='urn:oasis:names:tc:opendocument:xmlns:text:1.0#form-property'"
	 * @generated
	 */
	ListPropertyType getListProperty();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getListProperty <em>List Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Property</em>' containment reference.
	 * @see #getListProperty()
	 * @generated
	 */
	void setListProperty(ListPropertyType value);

	/**
	 * Returns the value of the '<em><b>Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number</em>' containment reference.
	 * @see #setNumber(NumberType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormPackage#getDocumentRoot_Number()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='number' namespace='##targetNamespace' affiliation='urn:oasis:names:tc:opendocument:xmlns:text:1.0#column-controls'"
	 * @generated
	 */
	NumberType getNumber();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getNumber <em>Number</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number</em>' containment reference.
	 * @see #getNumber()
	 * @generated
	 */
	void setNumber(NumberType value);

	/**
	 * Returns the value of the '<em><b>Option</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Option</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Option</em>' containment reference.
	 * @see #setOption(OptionType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormPackage#getDocumentRoot_Option()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='option' namespace='##targetNamespace'"
	 * @generated
	 */
	OptionType getOption();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getOption <em>Option</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Option</em>' containment reference.
	 * @see #getOption()
	 * @generated
	 */
	void setOption(OptionType value);

	/**
	 * Returns the value of the '<em><b>Password</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Password</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Password</em>' containment reference.
	 * @see #setPassword(PasswordType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormPackage#getDocumentRoot_Password()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='password' namespace='##targetNamespace' affiliation='urn:oasis:names:tc:opendocument:xmlns:text:1.0#controls'"
	 * @generated
	 */
	PasswordType getPassword();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getPassword <em>Password</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Password</em>' containment reference.
	 * @see #getPassword()
	 * @generated
	 */
	void setPassword(PasswordType value);

	/**
	 * Returns the value of the '<em><b>Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Properties</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' containment reference.
	 * @see #setProperties(PropertiesType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormPackage#getDocumentRoot_Properties()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='properties' namespace='##targetNamespace'"
	 * @generated
	 */
	PropertiesType getProperties();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getProperties <em>Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Properties</em>' containment reference.
	 * @see #getProperties()
	 * @generated
	 */
	void setProperties(PropertiesType value);

	/**
	 * Returns the value of the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property</em>' containment reference.
	 * @see #setProperty(PropertyType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormPackage#getDocumentRoot_Property()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='property' namespace='##targetNamespace' affiliation='urn:oasis:names:tc:opendocument:xmlns:text:1.0#form-property'"
	 * @generated
	 */
	PropertyType getProperty();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getProperty <em>Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property</em>' containment reference.
	 * @see #getProperty()
	 * @generated
	 */
	void setProperty(PropertyType value);

	/**
	 * Returns the value of the '<em><b>Radio</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Radio</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Radio</em>' containment reference.
	 * @see #setRadio(RadioType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormPackage#getDocumentRoot_Radio()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='radio' namespace='##targetNamespace' affiliation='urn:oasis:names:tc:opendocument:xmlns:text:1.0#controls'"
	 * @generated
	 */
	RadioType getRadio();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getRadio <em>Radio</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Radio</em>' containment reference.
	 * @see #getRadio()
	 * @generated
	 */
	void setRadio(RadioType value);

	/**
	 * Returns the value of the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' containment reference.
	 * @see #setText(TextType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormPackage#getDocumentRoot_Text()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='text' namespace='##targetNamespace' affiliation='urn:oasis:names:tc:opendocument:xmlns:text:1.0#column-controls'"
	 * @generated
	 */
	TextType getText();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getText <em>Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' containment reference.
	 * @see #getText()
	 * @generated
	 */
	void setText(TextType value);

	/**
	 * Returns the value of the '<em><b>Textarea</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Textarea</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Textarea</em>' containment reference.
	 * @see #setTextarea(TextareaType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormPackage#getDocumentRoot_Textarea()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='textarea' namespace='##targetNamespace' affiliation='urn:oasis:names:tc:opendocument:xmlns:text:1.0#column-controls'"
	 * @generated
	 */
	TextareaType getTextarea();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getTextarea <em>Textarea</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Textarea</em>' containment reference.
	 * @see #getTextarea()
	 * @generated
	 */
	void setTextarea(TextareaType value);

	/**
	 * Returns the value of the '<em><b>Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time</em>' containment reference.
	 * @see #setTime(TimeType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormPackage#getDocumentRoot_Time()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='time' namespace='##targetNamespace' affiliation='urn:oasis:names:tc:opendocument:xmlns:text:1.0#controls'"
	 * @generated
	 */
	TimeType getTime();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getTime <em>Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time</em>' containment reference.
	 * @see #getTime()
	 * @generated
	 */
	void setTime(TimeType value);

	/**
	 * Returns the value of the '<em><b>Value Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Range</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Range</em>' containment reference.
	 * @see #setValueRange(ValueRangeType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormPackage#getDocumentRoot_ValueRange()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='value-range' namespace='##targetNamespace' affiliation='urn:oasis:names:tc:opendocument:xmlns:text:1.0#controls'"
	 * @generated
	 */
	ValueRangeType getValueRange();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getValueRange <em>Value Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Range</em>' containment reference.
	 * @see #getValueRange()
	 * @generated
	 */
	void setValueRange(ValueRangeType value);

	/**
	 * Returns the value of the '<em><b>Allow Deletes</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allow Deletes</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allow Deletes</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetAllowDeletes()
	 * @see #unsetAllowDeletes()
	 * @see #setAllowDeletes(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormPackage#getDocumentRoot_AllowDeletes()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='allow-deletes' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getAllowDeletes();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getAllowDeletes <em>Allow Deletes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allow Deletes</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetAllowDeletes()
	 * @see #unsetAllowDeletes()
	 * @see #getAllowDeletes()
	 * @generated
	 */
	void setAllowDeletes(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getAllowDeletes <em>Allow Deletes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAllowDeletes()
	 * @see #getAllowDeletes()
	 * @see #setAllowDeletes(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetAllowDeletes();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getAllowDeletes <em>Allow Deletes</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Allow Deletes</em>' attribute is set.
	 * @see #unsetAllowDeletes()
	 * @see #getAllowDeletes()
	 * @see #setAllowDeletes(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetAllowDeletes();

	/**
	 * Returns the value of the '<em><b>Allow Inserts</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allow Inserts</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allow Inserts</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetAllowInserts()
	 * @see #unsetAllowInserts()
	 * @see #setAllowInserts(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormPackage#getDocumentRoot_AllowInserts()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='allow-inserts' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getAllowInserts();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getAllowInserts <em>Allow Inserts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allow Inserts</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetAllowInserts()
	 * @see #unsetAllowInserts()
	 * @see #getAllowInserts()
	 * @generated
	 */
	void setAllowInserts(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getAllowInserts <em>Allow Inserts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAllowInserts()
	 * @see #getAllowInserts()
	 * @see #setAllowInserts(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetAllowInserts();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getAllowInserts <em>Allow Inserts</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Allow Inserts</em>' attribute is set.
	 * @see #unsetAllowInserts()
	 * @see #getAllowInserts()
	 * @see #setAllowInserts(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetAllowInserts();

	/**
	 * Returns the value of the '<em><b>Allow Updates</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allow Updates</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allow Updates</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetAllowUpdates()
	 * @see #unsetAllowUpdates()
	 * @see #setAllowUpdates(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormPackage#getDocumentRoot_AllowUpdates()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='allow-updates' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getAllowUpdates();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getAllowUpdates <em>Allow Updates</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allow Updates</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetAllowUpdates()
	 * @see #unsetAllowUpdates()
	 * @see #getAllowUpdates()
	 * @generated
	 */
	void setAllowUpdates(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getAllowUpdates <em>Allow Updates</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAllowUpdates()
	 * @see #getAllowUpdates()
	 * @see #setAllowUpdates(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetAllowUpdates();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getAllowUpdates <em>Allow Updates</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Allow Updates</em>' attribute is set.
	 * @see #unsetAllowUpdates()
	 * @see #getAllowUpdates()
	 * @see #setAllowUpdates(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetAllowUpdates();

	/**
	 * Returns the value of the '<em><b>Apply Design Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Apply Design Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Apply Design Mode</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetApplyDesignMode()
	 * @see #unsetApplyDesignMode()
	 * @see #setApplyDesignMode(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormPackage#getDocumentRoot_ApplyDesignMode()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='apply-design-mode' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getApplyDesignMode();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getApplyDesignMode <em>Apply Design Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Apply Design Mode</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetApplyDesignMode()
	 * @see #unsetApplyDesignMode()
	 * @see #getApplyDesignMode()
	 * @generated
	 */
	void setApplyDesignMode(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getApplyDesignMode <em>Apply Design Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetApplyDesignMode()
	 * @see #getApplyDesignMode()
	 * @see #setApplyDesignMode(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetApplyDesignMode();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getApplyDesignMode <em>Apply Design Mode</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Apply Design Mode</em>' attribute is set.
	 * @see #unsetApplyDesignMode()
	 * @see #getApplyDesignMode()
	 * @see #setApplyDesignMode(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetApplyDesignMode();

	/**
	 * Returns the value of the '<em><b>Apply Filter</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Apply Filter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Apply Filter</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetApplyFilter()
	 * @see #unsetApplyFilter()
	 * @see #setApplyFilter(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormPackage#getDocumentRoot_ApplyFilter()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='apply-filter' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getApplyFilter();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getApplyFilter <em>Apply Filter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Apply Filter</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetApplyFilter()
	 * @see #unsetApplyFilter()
	 * @see #getApplyFilter()
	 * @generated
	 */
	void setApplyFilter(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getApplyFilter <em>Apply Filter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetApplyFilter()
	 * @see #getApplyFilter()
	 * @see #setApplyFilter(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetApplyFilter();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getApplyFilter <em>Apply Filter</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Apply Filter</em>' attribute is set.
	 * @see #unsetApplyFilter()
	 * @see #getApplyFilter()
	 * @see #setApplyFilter(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetApplyFilter();

	/**
	 * Returns the value of the '<em><b>Auto Complete</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Auto Complete</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auto Complete</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetAutoComplete()
	 * @see #unsetAutoComplete()
	 * @see #setAutoComplete(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormPackage#getDocumentRoot_AutoComplete()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='auto-complete' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getAutoComplete();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getAutoComplete <em>Auto Complete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auto Complete</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetAutoComplete()
	 * @see #unsetAutoComplete()
	 * @see #getAutoComplete()
	 * @generated
	 */
	void setAutoComplete(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getAutoComplete <em>Auto Complete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAutoComplete()
	 * @see #getAutoComplete()
	 * @see #setAutoComplete(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetAutoComplete();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getAutoComplete <em>Auto Complete</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Auto Complete</em>' attribute is set.
	 * @see #unsetAutoComplete()
	 * @see #getAutoComplete()
	 * @see #setAutoComplete(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetAutoComplete();

	/**
	 * Returns the value of the '<em><b>Automatic Focus</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Automatic Focus</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Automatic Focus</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetAutomaticFocus()
	 * @see #unsetAutomaticFocus()
	 * @see #setAutomaticFocus(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormPackage#getDocumentRoot_AutomaticFocus()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='automatic-focus' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getAutomaticFocus();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getAutomaticFocus <em>Automatic Focus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Automatic Focus</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetAutomaticFocus()
	 * @see #unsetAutomaticFocus()
	 * @see #getAutomaticFocus()
	 * @generated
	 */
	void setAutomaticFocus(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getAutomaticFocus <em>Automatic Focus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAutomaticFocus()
	 * @see #getAutomaticFocus()
	 * @see #setAutomaticFocus(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetAutomaticFocus();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getAutomaticFocus <em>Automatic Focus</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Automatic Focus</em>' attribute is set.
	 * @see #unsetAutomaticFocus()
	 * @see #getAutomaticFocus()
	 * @see #setAutomaticFocus(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetAutomaticFocus();

	/**
	 * Returns the value of the '<em><b>Bound Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bound Column</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bound Column</em>' attribute.
	 * @see #setBoundColumn(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormPackage#getDocumentRoot_BoundColumn()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='bound-column' namespace='##targetNamespace'"
	 * @generated
	 */
	String getBoundColumn();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getBoundColumn <em>Bound Column</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bound Column</em>' attribute.
	 * @see #getBoundColumn()
	 * @generated
	 */
	void setBoundColumn(String value);

	/**
	 * Returns the value of the '<em><b>Button Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Types}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Button Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Button Type</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Types
	 * @see #isSetButtonType()
	 * @see #unsetButtonType()
	 * @see #setButtonType(Types)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormPackage#getDocumentRoot_ButtonType()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='button-type' namespace='##targetNamespace'"
	 * @generated
	 */
	Types getButtonType();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getButtonType <em>Button Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Button Type</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Types
	 * @see #isSetButtonType()
	 * @see #unsetButtonType()
	 * @see #getButtonType()
	 * @generated
	 */
	void setButtonType(Types value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getButtonType <em>Button Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetButtonType()
	 * @see #getButtonType()
	 * @see #setButtonType(Types)
	 * @generated
	 */
	void unsetButtonType();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getButtonType <em>Button Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Button Type</em>' attribute is set.
	 * @see #unsetButtonType()
	 * @see #getButtonType()
	 * @see #setButtonType(Types)
	 * @generated
	 */
	boolean isSetButtonType();

	/**
	 * Returns the value of the '<em><b>Command</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Command</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Command</em>' attribute.
	 * @see #setCommand(Object)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormPackage#getDocumentRoot_Command()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='command' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getCommand();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getCommand <em>Command</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Command</em>' attribute.
	 * @see #getCommand()
	 * @generated
	 */
	void setCommand(Object value);

	/**
	 * Returns the value of the '<em><b>Command Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.form.CommandTypeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Command Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Command Type</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.CommandTypeType
	 * @see #isSetCommandType()
	 * @see #unsetCommandType()
	 * @see #setCommandType(CommandTypeType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormPackage#getDocumentRoot_CommandType()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='command-type' namespace='##targetNamespace'"
	 * @generated
	 */
	CommandTypeType getCommandType();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getCommandType <em>Command Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Command Type</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.CommandTypeType
	 * @see #isSetCommandType()
	 * @see #unsetCommandType()
	 * @see #getCommandType()
	 * @generated
	 */
	void setCommandType(CommandTypeType value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getCommandType <em>Command Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCommandType()
	 * @see #getCommandType()
	 * @see #setCommandType(CommandTypeType)
	 * @generated
	 */
	void unsetCommandType();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getCommandType <em>Command Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Command Type</em>' attribute is set.
	 * @see #unsetCommandType()
	 * @see #getCommandType()
	 * @see #setCommandType(CommandTypeType)
	 * @generated
	 */
	boolean isSetCommandType();

	/**
	 * Returns the value of the '<em><b>Control Implementation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Control Implementation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Control Implementation</em>' attribute.
	 * @see #setControlImplementation(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormPackage#getDocumentRoot_ControlImplementation()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.NamespacedToken"
	 *        extendedMetaData="kind='attribute' name='control-implementation' namespace='##targetNamespace'"
	 * @generated
	 */
	String getControlImplementation();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getControlImplementation <em>Control Implementation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Control Implementation</em>' attribute.
	 * @see #getControlImplementation()
	 * @generated
	 */
	void setControlImplementation(String value);

	/**
	 * Returns the value of the '<em><b>Convert Empty To Null</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Convert Empty To Null</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Convert Empty To Null</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetConvertEmptyToNull()
	 * @see #unsetConvertEmptyToNull()
	 * @see #setConvertEmptyToNull(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormPackage#getDocumentRoot_ConvertEmptyToNull()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='convert-empty-to-null' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getConvertEmptyToNull();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getConvertEmptyToNull <em>Convert Empty To Null</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Convert Empty To Null</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetConvertEmptyToNull()
	 * @see #unsetConvertEmptyToNull()
	 * @see #getConvertEmptyToNull()
	 * @generated
	 */
	void setConvertEmptyToNull(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getConvertEmptyToNull <em>Convert Empty To Null</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetConvertEmptyToNull()
	 * @see #getConvertEmptyToNull()
	 * @see #setConvertEmptyToNull(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetConvertEmptyToNull();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getConvertEmptyToNull <em>Convert Empty To Null</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Convert Empty To Null</em>' attribute is set.
	 * @see #unsetConvertEmptyToNull()
	 * @see #getConvertEmptyToNull()
	 * @see #setConvertEmptyToNull(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetConvertEmptyToNull();

	/**
	 * Returns the value of the '<em><b>Current Selected</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current Selected</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Selected</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetCurrentSelected()
	 * @see #unsetCurrentSelected()
	 * @see #setCurrentSelected(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormPackage#getDocumentRoot_CurrentSelected()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='current-selected' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getCurrentSelected();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getCurrentSelected <em>Current Selected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Selected</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetCurrentSelected()
	 * @see #unsetCurrentSelected()
	 * @see #getCurrentSelected()
	 * @generated
	 */
	void setCurrentSelected(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getCurrentSelected <em>Current Selected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCurrentSelected()
	 * @see #getCurrentSelected()
	 * @see #setCurrentSelected(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetCurrentSelected();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getCurrentSelected <em>Current Selected</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Current Selected</em>' attribute is set.
	 * @see #unsetCurrentSelected()
	 * @see #getCurrentSelected()
	 * @see #setCurrentSelected(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetCurrentSelected();

	/**
	 * Returns the value of the '<em><b>Current State</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.States}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current State</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current State</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.States
	 * @see #isSetCurrentState()
	 * @see #unsetCurrentState()
	 * @see #setCurrentState(States)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormPackage#getDocumentRoot_CurrentState()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='current-state' namespace='##targetNamespace'"
	 * @generated
	 */
	States getCurrentState();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getCurrentState <em>Current State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current State</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.States
	 * @see #isSetCurrentState()
	 * @see #unsetCurrentState()
	 * @see #getCurrentState()
	 * @generated
	 */
	void setCurrentState(States value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getCurrentState <em>Current State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCurrentState()
	 * @see #getCurrentState()
	 * @see #setCurrentState(States)
	 * @generated
	 */
	void unsetCurrentState();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getCurrentState <em>Current State</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Current State</em>' attribute is set.
	 * @see #unsetCurrentState()
	 * @see #getCurrentState()
	 * @see #setCurrentState(States)
	 * @generated
	 */
	boolean isSetCurrentState();

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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormPackage#getDocumentRoot_DataField()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='data-field' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDataField();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getDataField <em>Data Field</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Field</em>' attribute.
	 * @see #getDataField()
	 * @generated
	 */
	void setDataField(String value);

	/**
	 * Returns the value of the '<em><b>Datasource</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Datasource</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datasource</em>' attribute.
	 * @see #setDatasource(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormPackage#getDocumentRoot_Datasource()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.form.DatasourceType"
	 *        extendedMetaData="kind='attribute' name='datasource' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDatasource();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getDatasource <em>Datasource</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datasource</em>' attribute.
	 * @see #getDatasource()
	 * @generated
	 */
	void setDatasource(String value);

	/**
	 * Returns the value of the '<em><b>Default Button</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Button</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Button</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetDefaultButton()
	 * @see #unsetDefaultButton()
	 * @see #setDefaultButton(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormPackage#getDocumentRoot_DefaultButton()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='default-button' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getDefaultButton();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getDefaultButton <em>Default Button</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Button</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetDefaultButton()
	 * @see #unsetDefaultButton()
	 * @see #getDefaultButton()
	 * @generated
	 */
	void setDefaultButton(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getDefaultButton <em>Default Button</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDefaultButton()
	 * @see #getDefaultButton()
	 * @see #setDefaultButton(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetDefaultButton();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getDefaultButton <em>Default Button</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Default Button</em>' attribute is set.
	 * @see #unsetDefaultButton()
	 * @see #getDefaultButton()
	 * @see #setDefaultButton(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetDefaultButton();

	/**
	 * Returns the value of the '<em><b>Delay For Repeat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delay For Repeat</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delay For Repeat</em>' attribute.
	 * @see #setDelayForRepeat(Duration)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormPackage#getDocumentRoot_DelayForRepeat()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Duration"
	 *        extendedMetaData="kind='attribute' name='delay-for-repeat' namespace='##targetNamespace'"
	 * @generated
	 */
	Duration getDelayForRepeat();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getDelayForRepeat <em>Delay For Repeat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delay For Repeat</em>' attribute.
	 * @see #getDelayForRepeat()
	 * @generated
	 */
	void setDelayForRepeat(Duration value);

	/**
	 * Returns the value of the '<em><b>Detail Fields</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Detail Fields</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Detail Fields</em>' attribute.
	 * @see #setDetailFields(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormPackage#getDocumentRoot_DetailFields()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='detail-fields' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDetailFields();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getDetailFields <em>Detail Fields</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Detail Fields</em>' attribute.
	 * @see #getDetailFields()
	 * @generated
	 */
	void setDetailFields(String value);

	/**
	 * Returns the value of the '<em><b>Disabled</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Disabled</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Disabled</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetDisabled()
	 * @see #unsetDisabled()
	 * @see #setDisabled(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormPackage#getDocumentRoot_Disabled()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='disabled' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getDisabled();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getDisabled <em>Disabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disabled</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetDisabled()
	 * @see #unsetDisabled()
	 * @see #getDisabled()
	 * @generated
	 */
	void setDisabled(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getDisabled <em>Disabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDisabled()
	 * @see #getDisabled()
	 * @see #setDisabled(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetDisabled();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getDisabled <em>Disabled</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Disabled</em>' attribute is set.
	 * @see #unsetDisabled()
	 * @see #getDisabled()
	 * @see #setDisabled(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetDisabled();

	/**
	 * Returns the value of the '<em><b>Dropdown</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dropdown</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dropdown</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetDropdown()
	 * @see #unsetDropdown()
	 * @see #setDropdown(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormPackage#getDocumentRoot_Dropdown()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='dropdown' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getDropdown();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getDropdown <em>Dropdown</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dropdown</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetDropdown()
	 * @see #unsetDropdown()
	 * @see #getDropdown()
	 * @generated
	 */
	void setDropdown(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getDropdown <em>Dropdown</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDropdown()
	 * @see #getDropdown()
	 * @see #setDropdown(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetDropdown();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getDropdown <em>Dropdown</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Dropdown</em>' attribute is set.
	 * @see #unsetDropdown()
	 * @see #getDropdown()
	 * @see #setDropdown(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetDropdown();

	/**
	 * Returns the value of the '<em><b>Echo Char</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Echo Char</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Echo Char</em>' attribute.
	 * @see #setEchoChar(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormPackage#getDocumentRoot_EchoChar()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Character"
	 *        extendedMetaData="kind='attribute' name='echo-char' namespace='##targetNamespace'"
	 * @generated
	 */
	String getEchoChar();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getEchoChar <em>Echo Char</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Echo Char</em>' attribute.
	 * @see #getEchoChar()
	 * @generated
	 */
	void setEchoChar(String value);

	/**
	 * Returns the value of the '<em><b>Enctype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enctype</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enctype</em>' attribute.
	 * @see #setEnctype(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormPackage#getDocumentRoot_Enctype()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='enctype' namespace='##targetNamespace'"
	 * @generated
	 */
	String getEnctype();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getEnctype <em>Enctype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enctype</em>' attribute.
	 * @see #getEnctype()
	 * @generated
	 */
	void setEnctype(String value);

	/**
	 * Returns the value of the '<em><b>Escape Processing</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Escape Processing</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Escape Processing</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetEscapeProcessing()
	 * @see #unsetEscapeProcessing()
	 * @see #setEscapeProcessing(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormPackage#getDocumentRoot_EscapeProcessing()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='escape-processing' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getEscapeProcessing();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getEscapeProcessing <em>Escape Processing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Escape Processing</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetEscapeProcessing()
	 * @see #unsetEscapeProcessing()
	 * @see #getEscapeProcessing()
	 * @generated
	 */
	void setEscapeProcessing(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getEscapeProcessing <em>Escape Processing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEscapeProcessing()
	 * @see #getEscapeProcessing()
	 * @see #setEscapeProcessing(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetEscapeProcessing();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getEscapeProcessing <em>Escape Processing</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Escape Processing</em>' attribute is set.
	 * @see #unsetEscapeProcessing()
	 * @see #getEscapeProcessing()
	 * @see #setEscapeProcessing(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetEscapeProcessing();

	/**
	 * Returns the value of the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Filter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filter</em>' attribute.
	 * @see #setFilter(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormPackage#getDocumentRoot_Filter()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='filter' namespace='##targetNamespace'"
	 * @generated
	 */
	String getFilter();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getFilter <em>Filter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filter</em>' attribute.
	 * @see #getFilter()
	 * @generated
	 */
	void setFilter(String value);

	/**
	 * Returns the value of the '<em><b>Focus On Click</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Focus On Click</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Focus On Click</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetFocusOnClick()
	 * @see #unsetFocusOnClick()
	 * @see #setFocusOnClick(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormPackage#getDocumentRoot_FocusOnClick()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='focus-on-click' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getFocusOnClick();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getFocusOnClick <em>Focus On Click</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Focus On Click</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetFocusOnClick()
	 * @see #unsetFocusOnClick()
	 * @see #getFocusOnClick()
	 * @generated
	 */
	void setFocusOnClick(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getFocusOnClick <em>Focus On Click</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFocusOnClick()
	 * @see #getFocusOnClick()
	 * @see #setFocusOnClick(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetFocusOnClick();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getFocusOnClick <em>Focus On Click</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Focus On Click</em>' attribute is set.
	 * @see #unsetFocusOnClick()
	 * @see #getFocusOnClick()
	 * @see #setFocusOnClick(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetFocusOnClick();

	/**
	 * Returns the value of the '<em><b>For</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>For</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>For</em>' attribute.
	 * @see #setFor(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormPackage#getDocumentRoot_For()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='for' namespace='##targetNamespace'"
	 * @generated
	 */
	String getFor();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getFor <em>For</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>For</em>' attribute.
	 * @see #getFor()
	 * @generated
	 */
	void setFor(String value);

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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormPackage#getDocumentRoot_Id()
	 * @model id="true" dataType="org.oasisopen.names.tc.opendocument.xmlns.text.ID"
	 *        extendedMetaData="kind='attribute' name='id' namespace='##targetNamespace'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Ignore Result</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ignore Result</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ignore Result</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetIgnoreResult()
	 * @see #unsetIgnoreResult()
	 * @see #setIgnoreResult(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormPackage#getDocumentRoot_IgnoreResult()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='ignore-result' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getIgnoreResult();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getIgnoreResult <em>Ignore Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ignore Result</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetIgnoreResult()
	 * @see #unsetIgnoreResult()
	 * @see #getIgnoreResult()
	 * @generated
	 */
	void setIgnoreResult(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getIgnoreResult <em>Ignore Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIgnoreResult()
	 * @see #getIgnoreResult()
	 * @see #setIgnoreResult(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetIgnoreResult();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getIgnoreResult <em>Ignore Result</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Ignore Result</em>' attribute is set.
	 * @see #unsetIgnoreResult()
	 * @see #getIgnoreResult()
	 * @see #setIgnoreResult(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetIgnoreResult();

	/**
	 * Returns the value of the '<em><b>Image Align</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.form.ImageAlignType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Image Align</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image Align</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.ImageAlignType
	 * @see #isSetImageAlign()
	 * @see #unsetImageAlign()
	 * @see #setImageAlign(ImageAlignType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormPackage#getDocumentRoot_ImageAlign()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='image-align' namespace='##targetNamespace'"
	 * @generated
	 */
	ImageAlignType getImageAlign();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getImageAlign <em>Image Align</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image Align</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.ImageAlignType
	 * @see #isSetImageAlign()
	 * @see #unsetImageAlign()
	 * @see #getImageAlign()
	 * @generated
	 */
	void setImageAlign(ImageAlignType value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getImageAlign <em>Image Align</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetImageAlign()
	 * @see #getImageAlign()
	 * @see #setImageAlign(ImageAlignType)
	 * @generated
	 */
	void unsetImageAlign();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getImageAlign <em>Image Align</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Image Align</em>' attribute is set.
	 * @see #unsetImageAlign()
	 * @see #getImageAlign()
	 * @see #setImageAlign(ImageAlignType)
	 * @generated
	 */
	boolean isSetImageAlign();

	/**
	 * Returns the value of the '<em><b>Image Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Image Data</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image Data</em>' attribute.
	 * @see #setImageData(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormPackage#getDocumentRoot_ImageData()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.AnyURI"
	 *        extendedMetaData="kind='attribute' name='image-data' namespace='##targetNamespace'"
	 * @generated
	 */
	String getImageData();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getImageData <em>Image Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image Data</em>' attribute.
	 * @see #getImageData()
	 * @generated
	 */
	void setImageData(String value);

	/**
	 * Returns the value of the '<em><b>Image Position</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.form.ImagePositionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Image Position</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image Position</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.ImagePositionType
	 * @see #isSetImagePosition()
	 * @see #unsetImagePosition()
	 * @see #setImagePosition(ImagePositionType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormPackage#getDocumentRoot_ImagePosition()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='image-position' namespace='##targetNamespace'"
	 * @generated
	 */
	ImagePositionType getImagePosition();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getImagePosition <em>Image Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image Position</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.ImagePositionType
	 * @see #isSetImagePosition()
	 * @see #unsetImagePosition()
	 * @see #getImagePosition()
	 * @generated
	 */
	void setImagePosition(ImagePositionType value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getImagePosition <em>Image Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetImagePosition()
	 * @see #getImagePosition()
	 * @see #setImagePosition(ImagePositionType)
	 * @generated
	 */
	void unsetImagePosition();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getImagePosition <em>Image Position</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Image Position</em>' attribute is set.
	 * @see #unsetImagePosition()
	 * @see #getImagePosition()
	 * @see #setImagePosition(ImagePositionType)
	 * @generated
	 */
	boolean isSetImagePosition();

	/**
	 * Returns the value of the '<em><b>Is Tristate</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Tristate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Tristate</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetIsTristate()
	 * @see #unsetIsTristate()
	 * @see #setIsTristate(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormPackage#getDocumentRoot_IsTristate()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='is-tristate' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getIsTristate();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getIsTristate <em>Is Tristate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Tristate</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetIsTristate()
	 * @see #unsetIsTristate()
	 * @see #getIsTristate()
	 * @generated
	 */
	void setIsTristate(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getIsTristate <em>Is Tristate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsTristate()
	 * @see #getIsTristate()
	 * @see #setIsTristate(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetIsTristate();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getIsTristate <em>Is Tristate</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Tristate</em>' attribute is set.
	 * @see #unsetIsTristate()
	 * @see #getIsTristate()
	 * @see #setIsTristate(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetIsTristate();

	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormPackage#getDocumentRoot_Label()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='label' namespace='##targetNamespace'"
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>List Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>List Source</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Source</em>' attribute.
	 * @see #setListSource(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormPackage#getDocumentRoot_ListSource()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='list-source' namespace='##targetNamespace'"
	 * @generated
	 */
	String getListSource();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getListSource <em>List Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Source</em>' attribute.
	 * @see #getListSource()
	 * @generated
	 */
	void setListSource(String value);

	/**
	 * Returns the value of the '<em><b>List Source Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.form.ListSourceTypeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>List Source Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Source Type</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.ListSourceTypeType
	 * @see #isSetListSourceType()
	 * @see #unsetListSourceType()
	 * @see #setListSourceType(ListSourceTypeType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormPackage#getDocumentRoot_ListSourceType()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='list-source-type' namespace='##targetNamespace'"
	 * @generated
	 */
	ListSourceTypeType getListSourceType();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getListSourceType <em>List Source Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Source Type</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.ListSourceTypeType
	 * @see #isSetListSourceType()
	 * @see #unsetListSourceType()
	 * @see #getListSourceType()
	 * @generated
	 */
	void setListSourceType(ListSourceTypeType value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getListSourceType <em>List Source Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetListSourceType()
	 * @see #getListSourceType()
	 * @see #setListSourceType(ListSourceTypeType)
	 * @generated
	 */
	void unsetListSourceType();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getListSourceType <em>List Source Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>List Source Type</em>' attribute is set.
	 * @see #unsetListSourceType()
	 * @see #getListSourceType()
	 * @see #setListSourceType(ListSourceTypeType)
	 * @generated
	 */
	boolean isSetListSourceType();

	/**
	 * Returns the value of the '<em><b>Master Fields</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Master Fields</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Master Fields</em>' attribute.
	 * @see #setMasterFields(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormPackage#getDocumentRoot_MasterFields()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='master-fields' namespace='##targetNamespace'"
	 * @generated
	 */
	String getMasterFields();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getMasterFields <em>Master Fields</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Master Fields</em>' attribute.
	 * @see #getMasterFields()
	 * @generated
	 */
	void setMasterFields(String value);

	/**
	 * Returns the value of the '<em><b>Max Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Length</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Length</em>' attribute.
	 * @see #setMaxLength(BigInteger)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormPackage#getDocumentRoot_MaxLength()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.NonNegativeInteger"
	 *        extendedMetaData="kind='attribute' name='max-length' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getMaxLength();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getMaxLength <em>Max Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Length</em>' attribute.
	 * @see #getMaxLength()
	 * @generated
	 */
	void setMaxLength(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Method</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method</em>' attribute.
	 * @see #setMethod(Object)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormPackage#getDocumentRoot_Method()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.form.MethodType"
	 *        extendedMetaData="kind='attribute' name='method' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getMethod();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getMethod <em>Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method</em>' attribute.
	 * @see #getMethod()
	 * @generated
	 */
	void setMethod(Object value);

	/**
	 * Returns the value of the '<em><b>Multi Line</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multi Line</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multi Line</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetMultiLine()
	 * @see #unsetMultiLine()
	 * @see #setMultiLine(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormPackage#getDocumentRoot_MultiLine()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='multi-line' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getMultiLine();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getMultiLine <em>Multi Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multi Line</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetMultiLine()
	 * @see #unsetMultiLine()
	 * @see #getMultiLine()
	 * @generated
	 */
	void setMultiLine(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getMultiLine <em>Multi Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMultiLine()
	 * @see #getMultiLine()
	 * @see #setMultiLine(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetMultiLine();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getMultiLine <em>Multi Line</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Multi Line</em>' attribute is set.
	 * @see #unsetMultiLine()
	 * @see #getMultiLine()
	 * @see #setMultiLine(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetMultiLine();

	/**
	 * Returns the value of the '<em><b>Multiple</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multiple</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multiple</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetMultiple()
	 * @see #unsetMultiple()
	 * @see #setMultiple(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormPackage#getDocumentRoot_Multiple()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='multiple' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getMultiple();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getMultiple <em>Multiple</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multiple</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetMultiple()
	 * @see #unsetMultiple()
	 * @see #getMultiple()
	 * @generated
	 */
	void setMultiple(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getMultiple <em>Multiple</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMultiple()
	 * @see #getMultiple()
	 * @see #setMultiple(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetMultiple();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getMultiple <em>Multiple</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Multiple</em>' attribute is set.
	 * @see #unsetMultiple()
	 * @see #getMultiple()
	 * @see #setMultiple(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetMultiple();

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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormPackage#getDocumentRoot_Name()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Navigation Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Navigation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Navigation Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Navigation Mode</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Navigation
	 * @see #isSetNavigationMode()
	 * @see #unsetNavigationMode()
	 * @see #setNavigationMode(Navigation)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormPackage#getDocumentRoot_NavigationMode()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='navigation-mode' namespace='##targetNamespace'"
	 * @generated
	 */
	Navigation getNavigationMode();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getNavigationMode <em>Navigation Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Navigation Mode</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Navigation
	 * @see #isSetNavigationMode()
	 * @see #unsetNavigationMode()
	 * @see #getNavigationMode()
	 * @generated
	 */
	void setNavigationMode(Navigation value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getNavigationMode <em>Navigation Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNavigationMode()
	 * @see #getNavigationMode()
	 * @see #setNavigationMode(Navigation)
	 * @generated
	 */
	void unsetNavigationMode();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getNavigationMode <em>Navigation Mode</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Navigation Mode</em>' attribute is set.
	 * @see #unsetNavigationMode()
	 * @see #getNavigationMode()
	 * @see #setNavigationMode(Navigation)
	 * @generated
	 */
	boolean isSetNavigationMode();

	/**
	 * Returns the value of the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Order</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order</em>' attribute.
	 * @see #setOrder(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormPackage#getDocumentRoot_Order()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='order' namespace='##targetNamespace'"
	 * @generated
	 */
	String getOrder();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getOrder <em>Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order</em>' attribute.
	 * @see #getOrder()
	 * @generated
	 */
	void setOrder(String value);

	/**
	 * Returns the value of the '<em><b>Orientation</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.form.OrientationType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Orientation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orientation</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.OrientationType
	 * @see #isSetOrientation()
	 * @see #unsetOrientation()
	 * @see #setOrientation(OrientationType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormPackage#getDocumentRoot_Orientation()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='orientation' namespace='##targetNamespace'"
	 * @generated
	 */
	OrientationType getOrientation();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getOrientation <em>Orientation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Orientation</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.OrientationType
	 * @see #isSetOrientation()
	 * @see #unsetOrientation()
	 * @see #getOrientation()
	 * @generated
	 */
	void setOrientation(OrientationType value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getOrientation <em>Orientation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetOrientation()
	 * @see #getOrientation()
	 * @see #setOrientation(OrientationType)
	 * @generated
	 */
	void unsetOrientation();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getOrientation <em>Orientation</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Orientation</em>' attribute is set.
	 * @see #unsetOrientation()
	 * @see #getOrientation()
	 * @see #setOrientation(OrientationType)
	 * @generated
	 */
	boolean isSetOrientation();

	/**
	 * Returns the value of the '<em><b>Page Step Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Page Step Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Page Step Size</em>' attribute.
	 * @see #setPageStepSize(BigInteger)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormPackage#getDocumentRoot_PageStepSize()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.PositiveInteger"
	 *        extendedMetaData="kind='attribute' name='page-step-size' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getPageStepSize();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getPageStepSize <em>Page Step Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Page Step Size</em>' attribute.
	 * @see #getPageStepSize()
	 * @generated
	 */
	void setPageStepSize(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Printable</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Printable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Printable</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetPrintable()
	 * @see #unsetPrintable()
	 * @see #setPrintable(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormPackage#getDocumentRoot_Printable()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='printable' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getPrintable();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getPrintable <em>Printable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Printable</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetPrintable()
	 * @see #unsetPrintable()
	 * @see #getPrintable()
	 * @generated
	 */
	void setPrintable(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getPrintable <em>Printable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPrintable()
	 * @see #getPrintable()
	 * @see #setPrintable(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetPrintable();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getPrintable <em>Printable</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Printable</em>' attribute is set.
	 * @see #unsetPrintable()
	 * @see #getPrintable()
	 * @see #setPrintable(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetPrintable();

	/**
	 * Returns the value of the '<em><b>Property Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Name</em>' attribute.
	 * @see #setPropertyName(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormPackage#getDocumentRoot_PropertyName()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='property-name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getPropertyName();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getPropertyName <em>Property Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property Name</em>' attribute.
	 * @see #getPropertyName()
	 * @generated
	 */
	void setPropertyName(String value);

	/**
	 * Returns the value of the '<em><b>Readonly</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Readonly</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Readonly</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetReadonly()
	 * @see #unsetReadonly()
	 * @see #setReadonly(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormPackage#getDocumentRoot_Readonly()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='readonly' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getReadonly();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getReadonly <em>Readonly</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Readonly</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetReadonly()
	 * @see #unsetReadonly()
	 * @see #getReadonly()
	 * @generated
	 */
	void setReadonly(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getReadonly <em>Readonly</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetReadonly()
	 * @see #getReadonly()
	 * @see #setReadonly(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetReadonly();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getReadonly <em>Readonly</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Readonly</em>' attribute is set.
	 * @see #unsetReadonly()
	 * @see #getReadonly()
	 * @see #setReadonly(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetReadonly();

	/**
	 * Returns the value of the '<em><b>Selected</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selected</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selected</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetSelected()
	 * @see #unsetSelected()
	 * @see #setSelected(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormPackage#getDocumentRoot_Selected()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='selected' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getSelected();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getSelected <em>Selected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selected</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetSelected()
	 * @see #unsetSelected()
	 * @see #getSelected()
	 * @generated
	 */
	void setSelected(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getSelected <em>Selected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSelected()
	 * @see #getSelected()
	 * @see #setSelected(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetSelected();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getSelected <em>Selected</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Selected</em>' attribute is set.
	 * @see #unsetSelected()
	 * @see #getSelected()
	 * @see #setSelected(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetSelected();

	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see #setSize(BigInteger)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormPackage#getDocumentRoot_Size()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.NonNegativeInteger"
	 *        extendedMetaData="kind='attribute' name='size' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getSize();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(BigInteger value);

	/**
	 * Returns the value of the '<em><b>State</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.States}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.States
	 * @see #isSetState()
	 * @see #unsetState()
	 * @see #setState(States)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormPackage#getDocumentRoot_State()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='state' namespace='##targetNamespace'"
	 * @generated
	 */
	States getState();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getState <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.States
	 * @see #isSetState()
	 * @see #unsetState()
	 * @see #getState()
	 * @generated
	 */
	void setState(States value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getState <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetState()
	 * @see #getState()
	 * @see #setState(States)
	 * @generated
	 */
	void unsetState();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getState <em>State</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>State</em>' attribute is set.
	 * @see #unsetState()
	 * @see #getState()
	 * @see #setState(States)
	 * @generated
	 */
	boolean isSetState();

	/**
	 * Returns the value of the '<em><b>Step Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Step Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Step Size</em>' attribute.
	 * @see #setStepSize(BigInteger)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormPackage#getDocumentRoot_StepSize()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.PositiveInteger"
	 *        extendedMetaData="kind='attribute' name='step-size' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getStepSize();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getStepSize <em>Step Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Step Size</em>' attribute.
	 * @see #getStepSize()
	 * @generated
	 */
	void setStepSize(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Tab Cycle</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.TabCycles}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tab Cycle</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tab Cycle</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TabCycles
	 * @see #isSetTabCycle()
	 * @see #unsetTabCycle()
	 * @see #setTabCycle(TabCycles)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormPackage#getDocumentRoot_TabCycle()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='tab-cycle' namespace='##targetNamespace'"
	 * @generated
	 */
	TabCycles getTabCycle();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getTabCycle <em>Tab Cycle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tab Cycle</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TabCycles
	 * @see #isSetTabCycle()
	 * @see #unsetTabCycle()
	 * @see #getTabCycle()
	 * @generated
	 */
	void setTabCycle(TabCycles value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getTabCycle <em>Tab Cycle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTabCycle()
	 * @see #getTabCycle()
	 * @see #setTabCycle(TabCycles)
	 * @generated
	 */
	void unsetTabCycle();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getTabCycle <em>Tab Cycle</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Tab Cycle</em>' attribute is set.
	 * @see #unsetTabCycle()
	 * @see #getTabCycle()
	 * @see #setTabCycle(TabCycles)
	 * @generated
	 */
	boolean isSetTabCycle();

	/**
	 * Returns the value of the '<em><b>Tab Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tab Index</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tab Index</em>' attribute.
	 * @see #setTabIndex(BigInteger)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormPackage#getDocumentRoot_TabIndex()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.NonNegativeInteger"
	 *        extendedMetaData="kind='attribute' name='tab-index' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getTabIndex();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getTabIndex <em>Tab Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tab Index</em>' attribute.
	 * @see #getTabIndex()
	 * @generated
	 */
	void setTabIndex(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Tab Stop</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tab Stop</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tab Stop</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetTabStop()
	 * @see #unsetTabStop()
	 * @see #setTabStop(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormPackage#getDocumentRoot_TabStop()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='tab-stop' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getTabStop();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getTabStop <em>Tab Stop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tab Stop</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetTabStop()
	 * @see #unsetTabStop()
	 * @see #getTabStop()
	 * @generated
	 */
	void setTabStop(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getTabStop <em>Tab Stop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTabStop()
	 * @see #getTabStop()
	 * @see #setTabStop(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetTabStop();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getTabStop <em>Tab Stop</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Tab Stop</em>' attribute is set.
	 * @see #unsetTabStop()
	 * @see #getTabStop()
	 * @see #setTabStop(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetTabStop();

	/**
	 * Returns the value of the '<em><b>Text Style Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text Style Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text Style Name</em>' attribute.
	 * @see #setTextStyleName(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormPackage#getDocumentRoot_TextStyleName()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.form.TextStyleNameType"
	 *        extendedMetaData="kind='attribute' name='text-style-name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getTextStyleName();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getTextStyleName <em>Text Style Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Style Name</em>' attribute.
	 * @see #getTextStyleName()
	 * @generated
	 */
	void setTextStyleName(String value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(Object)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormPackage#getDocumentRoot_Title()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='title' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getTitle();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(Object value);

	/**
	 * Returns the value of the '<em><b>Toggle</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Toggle</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Toggle</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetToggle()
	 * @see #unsetToggle()
	 * @see #setToggle(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormPackage#getDocumentRoot_Toggle()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='toggle' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getToggle();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getToggle <em>Toggle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Toggle</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetToggle()
	 * @see #unsetToggle()
	 * @see #getToggle()
	 * @generated
	 */
	void setToggle(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getToggle <em>Toggle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetToggle()
	 * @see #getToggle()
	 * @see #setToggle(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetToggle();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getToggle <em>Toggle</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Toggle</em>' attribute is set.
	 * @see #unsetToggle()
	 * @see #getToggle()
	 * @see #setToggle(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetToggle();

	/**
	 * Returns the value of the '<em><b>Validation</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Validation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Validation</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetValidation()
	 * @see #unsetValidation()
	 * @see #setValidation(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormPackage#getDocumentRoot_Validation()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='validation' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getValidation();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getValidation <em>Validation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Validation</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetValidation()
	 * @see #unsetValidation()
	 * @see #getValidation()
	 * @generated
	 */
	void setValidation(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getValidation <em>Validation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetValidation()
	 * @see #getValidation()
	 * @see #setValidation(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetValidation();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getValidation <em>Validation</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Validation</em>' attribute is set.
	 * @see #unsetValidation()
	 * @see #getValidation()
	 * @see #setValidation(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetValidation();

	/**
	 * Returns the value of the '<em><b>Visual Effect</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.form.VisualEffectType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Visual Effect</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visual Effect</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.VisualEffectType
	 * @see #isSetVisualEffect()
	 * @see #unsetVisualEffect()
	 * @see #setVisualEffect(VisualEffectType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormPackage#getDocumentRoot_VisualEffect()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='visual-effect' namespace='##targetNamespace'"
	 * @generated
	 */
	VisualEffectType getVisualEffect();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getVisualEffect <em>Visual Effect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visual Effect</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.VisualEffectType
	 * @see #isSetVisualEffect()
	 * @see #unsetVisualEffect()
	 * @see #getVisualEffect()
	 * @generated
	 */
	void setVisualEffect(VisualEffectType value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getVisualEffect <em>Visual Effect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVisualEffect()
	 * @see #getVisualEffect()
	 * @see #setVisualEffect(VisualEffectType)
	 * @generated
	 */
	void unsetVisualEffect();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getVisualEffect <em>Visual Effect</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Visual Effect</em>' attribute is set.
	 * @see #unsetVisualEffect()
	 * @see #getVisualEffect()
	 * @see #setVisualEffect(VisualEffectType)
	 * @generated
	 */
	boolean isSetVisualEffect();

	/**
	 * Returns the value of the '<em><b>Xforms List Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Xforms List Source</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Xforms List Source</em>' attribute.
	 * @see #setXformsListSource(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormPackage#getDocumentRoot_XformsListSource()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='xforms-list-source' namespace='##targetNamespace'"
	 * @generated
	 */
	String getXformsListSource();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getXformsListSource <em>Xforms List Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xforms List Source</em>' attribute.
	 * @see #getXformsListSource()
	 * @generated
	 */
	void setXformsListSource(String value);

	/**
	 * Returns the value of the '<em><b>Xforms Submission</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Xforms Submission</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Xforms Submission</em>' attribute.
	 * @see #setXformsSubmission(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormPackage#getDocumentRoot_XformsSubmission()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='xforms-submission' namespace='##targetNamespace'"
	 * @generated
	 */
	String getXformsSubmission();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot#getXformsSubmission <em>Xforms Submission</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xforms Submission</em>' attribute.
	 * @see #getXformsSubmission()
	 * @generated
	 */
	void setXformsSubmission(String value);

} // DocumentRoot
