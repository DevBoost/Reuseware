/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.form;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.oasisopen.names.tc.opendocument.xmlns.office.EventListenersType;
import org.oasisopen.names.tc.opendocument.xmlns.text.Navigation;
import org.oasisopen.names.tc.opendocument.xmlns.text.TabCycles;
import org.w3.xlink.ActuateType1;
import org.w3.xlink.TypeType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.FormType#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.FormType#getEventListeners <em>Event Listeners</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.FormType#getGroup <em>Group</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.FormType#getControlsGroup <em>Controls Group</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.FormType#getControls <em>Controls</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.FormType#getForm <em>Form</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.FormType#getConnectionResource <em>Connection Resource</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.FormType#getActuate <em>Actuate</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.FormType#getAllowDeletes <em>Allow Deletes</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.FormType#getAllowInserts <em>Allow Inserts</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.FormType#getAllowUpdates <em>Allow Updates</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.FormType#getApplyFilter <em>Apply Filter</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.FormType#getCommand <em>Command</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.FormType#getCommandType <em>Command Type</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.FormType#getControlImplementation <em>Control Implementation</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.FormType#getDatasource <em>Datasource</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.FormType#getDetailFields <em>Detail Fields</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.FormType#getEnctype <em>Enctype</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.FormType#getEscapeProcessing <em>Escape Processing</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.FormType#getFilter <em>Filter</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.FormType#getHref <em>Href</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.FormType#getIgnoreResult <em>Ignore Result</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.FormType#getMasterFields <em>Master Fields</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.FormType#getMethod <em>Method</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.FormType#getName <em>Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.FormType#getNavigationMode <em>Navigation Mode</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.FormType#getOrder <em>Order</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.FormType#getTabCycle <em>Tab Cycle</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.FormType#getTargetFrame <em>Target Frame</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.FormType#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormPackage#getFormType()
 * @model extendedMetaData="name='form_._type' kind='elementOnly'"
 * @generated
 */
public interface FormType extends EObject {
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormPackage#getFormType_Properties()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='properties' namespace='##targetNamespace'"
	 * @generated
	 */
	PropertiesType getProperties();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.FormType#getProperties <em>Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Properties</em>' containment reference.
	 * @see #getProperties()
	 * @generated
	 */
	void setProperties(PropertiesType value);

	/**
	 * Returns the value of the '<em><b>Event Listeners</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event Listeners</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Listeners</em>' containment reference.
	 * @see #setEventListeners(EventListenersType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormPackage#getFormType_EventListeners()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='event-listeners' namespace='urn:oasis:names:tc:opendocument:xmlns:office:1.0'"
	 * @generated
	 */
	EventListenersType getEventListeners();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.FormType#getEventListeners <em>Event Listeners</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event Listeners</em>' containment reference.
	 * @see #getEventListeners()
	 * @generated
	 */
	void setEventListeners(EventListenersType value);

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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormPackage#getFormType_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:2'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Controls Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Controls Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Controls Group</em>' attribute list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormPackage#getFormType_ControlsGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='group' name='controls:group' namespace='urn:oasis:names:tc:opendocument:xmlns:text:1.0' group='#group:2'"
	 * @generated
	 */
	FeatureMap getControlsGroup();

	/**
	 * Returns the value of the '<em><b>Controls</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Controls</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Controls</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormPackage#getFormType_Controls()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='controls' namespace='urn:oasis:names:tc:opendocument:xmlns:text:1.0' group='urn:oasis:names:tc:opendocument:xmlns:text:1.0#controls:group'"
	 * @generated
	 */
	EList<EObject> getControls();

	/**
	 * Returns the value of the '<em><b>Form</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.form.FormType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Form</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Form</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormPackage#getFormType_Form()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='form' namespace='##targetNamespace' group='#group:2'"
	 * @generated
	 */
	EList<FormType> getForm();

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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormPackage#getFormType_ConnectionResource()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='connection-resource' namespace='##targetNamespace'"
	 * @generated
	 */
	ConnectionResourceType getConnectionResource();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.FormType#getConnectionResource <em>Connection Resource</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connection Resource</em>' containment reference.
	 * @see #getConnectionResource()
	 * @generated
	 */
	void setConnectionResource(ConnectionResourceType value);

	/**
	 * Returns the value of the '<em><b>Actuate</b></em>' attribute.
	 * The literals are from the enumeration {@link org.w3.xlink.ActuateType1}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actuate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actuate</em>' attribute.
	 * @see org.w3.xlink.ActuateType1
	 * @see #isSetActuate()
	 * @see #unsetActuate()
	 * @see #setActuate(ActuateType1)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormPackage#getFormType_Actuate()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='actuate' namespace='http://www.w3.org/1999/xlink'"
	 * @generated
	 */
	ActuateType1 getActuate();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.FormType#getActuate <em>Actuate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actuate</em>' attribute.
	 * @see org.w3.xlink.ActuateType1
	 * @see #isSetActuate()
	 * @see #unsetActuate()
	 * @see #getActuate()
	 * @generated
	 */
	void setActuate(ActuateType1 value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.FormType#getActuate <em>Actuate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetActuate()
	 * @see #getActuate()
	 * @see #setActuate(ActuateType1)
	 * @generated
	 */
	void unsetActuate();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.FormType#getActuate <em>Actuate</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Actuate</em>' attribute is set.
	 * @see #unsetActuate()
	 * @see #getActuate()
	 * @see #setActuate(ActuateType1)
	 * @generated
	 */
	boolean isSetActuate();

	/**
	 * Returns the value of the '<em><b>Allow Deletes</b></em>' attribute.
	 * The default value is <code>"true"</code>.
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormPackage#getFormType_AllowDeletes()
	 * @model default="true" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='allow-deletes' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getAllowDeletes();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.FormType#getAllowDeletes <em>Allow Deletes</em>}' attribute.
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
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.FormType#getAllowDeletes <em>Allow Deletes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAllowDeletes()
	 * @see #getAllowDeletes()
	 * @see #setAllowDeletes(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetAllowDeletes();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.FormType#getAllowDeletes <em>Allow Deletes</em>}' attribute is set.
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
	 * The default value is <code>"true"</code>.
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormPackage#getFormType_AllowInserts()
	 * @model default="true" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='allow-inserts' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getAllowInserts();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.FormType#getAllowInserts <em>Allow Inserts</em>}' attribute.
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
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.FormType#getAllowInserts <em>Allow Inserts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAllowInserts()
	 * @see #getAllowInserts()
	 * @see #setAllowInserts(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetAllowInserts();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.FormType#getAllowInserts <em>Allow Inserts</em>}' attribute is set.
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
	 * The default value is <code>"true"</code>.
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormPackage#getFormType_AllowUpdates()
	 * @model default="true" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='allow-updates' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getAllowUpdates();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.FormType#getAllowUpdates <em>Allow Updates</em>}' attribute.
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
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.FormType#getAllowUpdates <em>Allow Updates</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAllowUpdates()
	 * @see #getAllowUpdates()
	 * @see #setAllowUpdates(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetAllowUpdates();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.FormType#getAllowUpdates <em>Allow Updates</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Apply Filter</b></em>' attribute.
	 * The default value is <code>"false"</code>.
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormPackage#getFormType_ApplyFilter()
	 * @model default="false" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='apply-filter' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getApplyFilter();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.FormType#getApplyFilter <em>Apply Filter</em>}' attribute.
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
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.FormType#getApplyFilter <em>Apply Filter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetApplyFilter()
	 * @see #getApplyFilter()
	 * @see #setApplyFilter(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetApplyFilter();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.FormType#getApplyFilter <em>Apply Filter</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Command</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Command</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Command</em>' attribute.
	 * @see #setCommand(Object)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormPackage#getFormType_Command()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='command' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getCommand();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.FormType#getCommand <em>Command</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Command</em>' attribute.
	 * @see #getCommand()
	 * @generated
	 */
	void setCommand(Object value);

	/**
	 * Returns the value of the '<em><b>Command Type</b></em>' attribute.
	 * The default value is <code>"command"</code>.
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormPackage#getFormType_CommandType()
	 * @model default="command" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='command-type' namespace='##targetNamespace'"
	 * @generated
	 */
	CommandTypeType getCommandType();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.FormType#getCommandType <em>Command Type</em>}' attribute.
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
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.FormType#getCommandType <em>Command Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCommandType()
	 * @see #getCommandType()
	 * @see #setCommandType(CommandTypeType)
	 * @generated
	 */
	void unsetCommandType();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.FormType#getCommandType <em>Command Type</em>}' attribute is set.
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormPackage#getFormType_ControlImplementation()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.NamespacedToken"
	 *        extendedMetaData="kind='attribute' name='control-implementation' namespace='##targetNamespace'"
	 * @generated
	 */
	String getControlImplementation();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.FormType#getControlImplementation <em>Control Implementation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Control Implementation</em>' attribute.
	 * @see #getControlImplementation()
	 * @generated
	 */
	void setControlImplementation(String value);

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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormPackage#getFormType_Datasource()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.form.DatasourceType"
	 *        extendedMetaData="kind='attribute' name='datasource' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDatasource();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.FormType#getDatasource <em>Datasource</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datasource</em>' attribute.
	 * @see #getDatasource()
	 * @generated
	 */
	void setDatasource(String value);

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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormPackage#getFormType_DetailFields()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='detail-fields' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDetailFields();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.FormType#getDetailFields <em>Detail Fields</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Detail Fields</em>' attribute.
	 * @see #getDetailFields()
	 * @generated
	 */
	void setDetailFields(String value);

	/**
	 * Returns the value of the '<em><b>Enctype</b></em>' attribute.
	 * The default value is <code>"application/x-www-form-urlencoded"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enctype</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enctype</em>' attribute.
	 * @see #isSetEnctype()
	 * @see #unsetEnctype()
	 * @see #setEnctype(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormPackage#getFormType_Enctype()
	 * @model default="application/x-www-form-urlencoded" unsettable="true" dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='enctype' namespace='##targetNamespace'"
	 * @generated
	 */
	String getEnctype();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.FormType#getEnctype <em>Enctype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enctype</em>' attribute.
	 * @see #isSetEnctype()
	 * @see #unsetEnctype()
	 * @see #getEnctype()
	 * @generated
	 */
	void setEnctype(String value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.FormType#getEnctype <em>Enctype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEnctype()
	 * @see #getEnctype()
	 * @see #setEnctype(String)
	 * @generated
	 */
	void unsetEnctype();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.FormType#getEnctype <em>Enctype</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Enctype</em>' attribute is set.
	 * @see #unsetEnctype()
	 * @see #getEnctype()
	 * @see #setEnctype(String)
	 * @generated
	 */
	boolean isSetEnctype();

	/**
	 * Returns the value of the '<em><b>Escape Processing</b></em>' attribute.
	 * The default value is <code>"true"</code>.
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormPackage#getFormType_EscapeProcessing()
	 * @model default="true" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='escape-processing' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getEscapeProcessing();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.FormType#getEscapeProcessing <em>Escape Processing</em>}' attribute.
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
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.FormType#getEscapeProcessing <em>Escape Processing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEscapeProcessing()
	 * @see #getEscapeProcessing()
	 * @see #setEscapeProcessing(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetEscapeProcessing();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.FormType#getEscapeProcessing <em>Escape Processing</em>}' attribute is set.
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormPackage#getFormType_Filter()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='filter' namespace='##targetNamespace'"
	 * @generated
	 */
	String getFilter();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.FormType#getFilter <em>Filter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filter</em>' attribute.
	 * @see #getFilter()
	 * @generated
	 */
	void setFilter(String value);

	/**
	 * Returns the value of the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Href</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Href</em>' attribute.
	 * @see #setHref(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormPackage#getFormType_Href()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.AnyURI"
	 *        extendedMetaData="kind='attribute' name='href' namespace='http://www.w3.org/1999/xlink'"
	 * @generated
	 */
	String getHref();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.FormType#getHref <em>Href</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Href</em>' attribute.
	 * @see #getHref()
	 * @generated
	 */
	void setHref(String value);

	/**
	 * Returns the value of the '<em><b>Ignore Result</b></em>' attribute.
	 * The default value is <code>"false"</code>.
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormPackage#getFormType_IgnoreResult()
	 * @model default="false" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='ignore-result' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getIgnoreResult();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.FormType#getIgnoreResult <em>Ignore Result</em>}' attribute.
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
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.FormType#getIgnoreResult <em>Ignore Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIgnoreResult()
	 * @see #getIgnoreResult()
	 * @see #setIgnoreResult(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetIgnoreResult();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.FormType#getIgnoreResult <em>Ignore Result</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Master Fields</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Master Fields</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Master Fields</em>' attribute.
	 * @see #setMasterFields(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormPackage#getFormType_MasterFields()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='master-fields' namespace='##targetNamespace'"
	 * @generated
	 */
	String getMasterFields();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.FormType#getMasterFields <em>Master Fields</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Master Fields</em>' attribute.
	 * @see #getMasterFields()
	 * @generated
	 */
	void setMasterFields(String value);

	/**
	 * Returns the value of the '<em><b>Method</b></em>' attribute.
	 * The default value is <code>"get"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Method</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method</em>' attribute.
	 * @see #isSetMethod()
	 * @see #unsetMethod()
	 * @see #setMethod(Object)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormPackage#getFormType_Method()
	 * @model default="get" unsettable="true" dataType="org.oasisopen.names.tc.opendocument.xmlns.form.MethodType"
	 *        extendedMetaData="kind='attribute' name='method' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getMethod();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.FormType#getMethod <em>Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method</em>' attribute.
	 * @see #isSetMethod()
	 * @see #unsetMethod()
	 * @see #getMethod()
	 * @generated
	 */
	void setMethod(Object value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.FormType#getMethod <em>Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMethod()
	 * @see #getMethod()
	 * @see #setMethod(Object)
	 * @generated
	 */
	void unsetMethod();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.FormType#getMethod <em>Method</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Method</em>' attribute is set.
	 * @see #unsetMethod()
	 * @see #getMethod()
	 * @see #setMethod(Object)
	 * @generated
	 */
	boolean isSetMethod();

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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormPackage#getFormType_Name()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.FormType#getName <em>Name</em>}' attribute.
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormPackage#getFormType_NavigationMode()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='navigation-mode' namespace='##targetNamespace'"
	 * @generated
	 */
	Navigation getNavigationMode();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.FormType#getNavigationMode <em>Navigation Mode</em>}' attribute.
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
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.FormType#getNavigationMode <em>Navigation Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNavigationMode()
	 * @see #getNavigationMode()
	 * @see #setNavigationMode(Navigation)
	 * @generated
	 */
	void unsetNavigationMode();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.FormType#getNavigationMode <em>Navigation Mode</em>}' attribute is set.
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormPackage#getFormType_Order()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='order' namespace='##targetNamespace'"
	 * @generated
	 */
	String getOrder();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.FormType#getOrder <em>Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order</em>' attribute.
	 * @see #getOrder()
	 * @generated
	 */
	void setOrder(String value);

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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormPackage#getFormType_TabCycle()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='tab-cycle' namespace='##targetNamespace'"
	 * @generated
	 */
	TabCycles getTabCycle();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.FormType#getTabCycle <em>Tab Cycle</em>}' attribute.
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
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.FormType#getTabCycle <em>Tab Cycle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTabCycle()
	 * @see #getTabCycle()
	 * @see #setTabCycle(TabCycles)
	 * @generated
	 */
	void unsetTabCycle();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.FormType#getTabCycle <em>Tab Cycle</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Target Frame</b></em>' attribute.
	 * The default value is <code>"_blank"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Frame</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Frame</em>' attribute.
	 * @see #isSetTargetFrame()
	 * @see #unsetTargetFrame()
	 * @see #setTargetFrame(Object)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormPackage#getFormType_TargetFrame()
	 * @model default="_blank" unsettable="true" dataType="org.oasisopen.names.tc.opendocument.xmlns.text.TargetFrameName"
	 *        extendedMetaData="kind='attribute' name='target-frame' namespace='urn:oasis:names:tc:opendocument:xmlns:office:1.0'"
	 * @generated
	 */
	Object getTargetFrame();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.FormType#getTargetFrame <em>Target Frame</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Frame</em>' attribute.
	 * @see #isSetTargetFrame()
	 * @see #unsetTargetFrame()
	 * @see #getTargetFrame()
	 * @generated
	 */
	void setTargetFrame(Object value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.FormType#getTargetFrame <em>Target Frame</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTargetFrame()
	 * @see #getTargetFrame()
	 * @see #setTargetFrame(Object)
	 * @generated
	 */
	void unsetTargetFrame();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.FormType#getTargetFrame <em>Target Frame</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Target Frame</em>' attribute is set.
	 * @see #unsetTargetFrame()
	 * @see #getTargetFrame()
	 * @see #setTargetFrame(Object)
	 * @generated
	 */
	boolean isSetTargetFrame();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"simple"</code>.
	 * The literals are from the enumeration {@link org.w3.xlink.TypeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.w3.xlink.TypeType
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #setType(TypeType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormPackage#getFormType_Type()
	 * @model default="simple" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='type' namespace='http://www.w3.org/1999/xlink'"
	 * @generated
	 */
	TypeType getType();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.FormType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.w3.xlink.TypeType
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #getType()
	 * @generated
	 */
	void setType(TypeType value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.FormType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetType()
	 * @see #getType()
	 * @see #setType(TypeType)
	 * @generated
	 */
	void unsetType();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.FormType#getType <em>Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type</em>' attribute is set.
	 * @see #unsetType()
	 * @see #getType()
	 * @see #setType(TypeType)
	 * @generated
	 */
	boolean isSetType();

} // FormType
