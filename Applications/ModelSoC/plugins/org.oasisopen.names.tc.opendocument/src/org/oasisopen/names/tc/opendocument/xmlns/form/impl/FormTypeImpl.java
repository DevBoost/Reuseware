/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.form.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;
import org.oasisopen.names.tc.opendocument.xmlns.form.CommandTypeType;
import org.oasisopen.names.tc.opendocument.xmlns.form.ConnectionResourceType;
import org.oasisopen.names.tc.opendocument.xmlns.form.FormPackage;
import org.oasisopen.names.tc.opendocument.xmlns.form.FormType;
import org.oasisopen.names.tc.opendocument.xmlns.form.PropertiesType;
import org.oasisopen.names.tc.opendocument.xmlns.office.EventListenersType;
import org.oasisopen.names.tc.opendocument.xmlns.text.Navigation;
import org.oasisopen.names.tc.opendocument.xmlns.text.TabCycles;
import org.w3.xlink.ActuateType1;
import org.w3.xlink.TypeType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.FormTypeImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.FormTypeImpl#getEventListeners <em>Event Listeners</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.FormTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.FormTypeImpl#getControlsGroup <em>Controls Group</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.FormTypeImpl#getControls <em>Controls</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.FormTypeImpl#getForm <em>Form</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.FormTypeImpl#getConnectionResource <em>Connection Resource</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.FormTypeImpl#getActuate <em>Actuate</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.FormTypeImpl#getAllowDeletes <em>Allow Deletes</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.FormTypeImpl#getAllowInserts <em>Allow Inserts</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.FormTypeImpl#getAllowUpdates <em>Allow Updates</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.FormTypeImpl#getApplyFilter <em>Apply Filter</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.FormTypeImpl#getCommand <em>Command</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.FormTypeImpl#getCommandType <em>Command Type</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.FormTypeImpl#getControlImplementation <em>Control Implementation</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.FormTypeImpl#getDatasource <em>Datasource</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.FormTypeImpl#getDetailFields <em>Detail Fields</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.FormTypeImpl#getEnctype <em>Enctype</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.FormTypeImpl#getEscapeProcessing <em>Escape Processing</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.FormTypeImpl#getFilter <em>Filter</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.FormTypeImpl#getHref <em>Href</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.FormTypeImpl#getIgnoreResult <em>Ignore Result</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.FormTypeImpl#getMasterFields <em>Master Fields</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.FormTypeImpl#getMethod <em>Method</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.FormTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.FormTypeImpl#getNavigationMode <em>Navigation Mode</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.FormTypeImpl#getOrder <em>Order</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.FormTypeImpl#getTabCycle <em>Tab Cycle</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.FormTypeImpl#getTargetFrame <em>Target Frame</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.FormTypeImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FormTypeImpl extends EObjectImpl implements FormType {
	/**
	 * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperties()
	 * @generated
	 * @ordered
	 */
	protected PropertiesType properties;

	/**
	 * The cached value of the '{@link #getEventListeners() <em>Event Listeners</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventListeners()
	 * @generated
	 * @ordered
	 */
	protected EventListenersType eventListeners;

	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group;

	/**
	 * The cached value of the '{@link #getConnectionResource() <em>Connection Resource</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectionResource()
	 * @generated
	 * @ordered
	 */
	protected ConnectionResourceType connectionResource;

	/**
	 * The default value of the '{@link #getActuate() <em>Actuate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActuate()
	 * @generated
	 * @ordered
	 */
	protected static final ActuateType1 ACTUATE_EDEFAULT = ActuateType1.ON_REQUEST;

	/**
	 * The cached value of the '{@link #getActuate() <em>Actuate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActuate()
	 * @generated
	 * @ordered
	 */
	protected ActuateType1 actuate = ACTUATE_EDEFAULT;

	/**
	 * This is true if the Actuate attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean actuateESet;

	/**
	 * The default value of the '{@link #getAllowDeletes() <em>Allow Deletes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowDeletes()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean ALLOW_DELETES_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getAllowDeletes() <em>Allow Deletes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowDeletes()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean allowDeletes = ALLOW_DELETES_EDEFAULT;

	/**
	 * This is true if the Allow Deletes attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean allowDeletesESet;

	/**
	 * The default value of the '{@link #getAllowInserts() <em>Allow Inserts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowInserts()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean ALLOW_INSERTS_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getAllowInserts() <em>Allow Inserts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowInserts()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean allowInserts = ALLOW_INSERTS_EDEFAULT;

	/**
	 * This is true if the Allow Inserts attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean allowInsertsESet;

	/**
	 * The default value of the '{@link #getAllowUpdates() <em>Allow Updates</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowUpdates()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean ALLOW_UPDATES_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getAllowUpdates() <em>Allow Updates</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowUpdates()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean allowUpdates = ALLOW_UPDATES_EDEFAULT;

	/**
	 * This is true if the Allow Updates attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean allowUpdatesESet;

	/**
	 * The default value of the '{@link #getApplyFilter() <em>Apply Filter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplyFilter()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean APPLY_FILTER_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getApplyFilter() <em>Apply Filter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplyFilter()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean applyFilter = APPLY_FILTER_EDEFAULT;

	/**
	 * This is true if the Apply Filter attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean applyFilterESet;

	/**
	 * The default value of the '{@link #getCommand() <em>Command</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommand()
	 * @generated
	 * @ordered
	 */
	protected static final Object COMMAND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCommand() <em>Command</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommand()
	 * @generated
	 * @ordered
	 */
	protected Object command = COMMAND_EDEFAULT;

	/**
	 * The default value of the '{@link #getCommandType() <em>Command Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommandType()
	 * @generated
	 * @ordered
	 */
	protected static final CommandTypeType COMMAND_TYPE_EDEFAULT = CommandTypeType.COMMAND;

	/**
	 * The cached value of the '{@link #getCommandType() <em>Command Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommandType()
	 * @generated
	 * @ordered
	 */
	protected CommandTypeType commandType = COMMAND_TYPE_EDEFAULT;

	/**
	 * This is true if the Command Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean commandTypeESet;

	/**
	 * The default value of the '{@link #getControlImplementation() <em>Control Implementation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlImplementation()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTROL_IMPLEMENTATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getControlImplementation() <em>Control Implementation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlImplementation()
	 * @generated
	 * @ordered
	 */
	protected String controlImplementation = CONTROL_IMPLEMENTATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getDatasource() <em>Datasource</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatasource()
	 * @generated
	 * @ordered
	 */
	protected static final String DATASOURCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDatasource() <em>Datasource</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatasource()
	 * @generated
	 * @ordered
	 */
	protected String datasource = DATASOURCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDetailFields() <em>Detail Fields</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDetailFields()
	 * @generated
	 * @ordered
	 */
	protected static final String DETAIL_FIELDS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDetailFields() <em>Detail Fields</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDetailFields()
	 * @generated
	 * @ordered
	 */
	protected String detailFields = DETAIL_FIELDS_EDEFAULT;

	/**
	 * The default value of the '{@link #getEnctype() <em>Enctype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnctype()
	 * @generated
	 * @ordered
	 */
	protected static final String ENCTYPE_EDEFAULT = "application/x-www-form-urlencoded";

	/**
	 * The cached value of the '{@link #getEnctype() <em>Enctype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnctype()
	 * @generated
	 * @ordered
	 */
	protected String enctype = ENCTYPE_EDEFAULT;

	/**
	 * This is true if the Enctype attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean enctypeESet;

	/**
	 * The default value of the '{@link #getEscapeProcessing() <em>Escape Processing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEscapeProcessing()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean ESCAPE_PROCESSING_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getEscapeProcessing() <em>Escape Processing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEscapeProcessing()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean escapeProcessing = ESCAPE_PROCESSING_EDEFAULT;

	/**
	 * This is true if the Escape Processing attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean escapeProcessingESet;

	/**
	 * The default value of the '{@link #getFilter() <em>Filter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilter()
	 * @generated
	 * @ordered
	 */
	protected static final String FILTER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFilter() <em>Filter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilter()
	 * @generated
	 * @ordered
	 */
	protected String filter = FILTER_EDEFAULT;

	/**
	 * The default value of the '{@link #getHref() <em>Href</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHref()
	 * @generated
	 * @ordered
	 */
	protected static final String HREF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHref() <em>Href</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHref()
	 * @generated
	 * @ordered
	 */
	protected String href = HREF_EDEFAULT;

	/**
	 * The default value of the '{@link #getIgnoreResult() <em>Ignore Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIgnoreResult()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean IGNORE_RESULT_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getIgnoreResult() <em>Ignore Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIgnoreResult()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean ignoreResult = IGNORE_RESULT_EDEFAULT;

	/**
	 * This is true if the Ignore Result attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean ignoreResultESet;

	/**
	 * The default value of the '{@link #getMasterFields() <em>Master Fields</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMasterFields()
	 * @generated
	 * @ordered
	 */
	protected static final String MASTER_FIELDS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMasterFields() <em>Master Fields</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMasterFields()
	 * @generated
	 * @ordered
	 */
	protected String masterFields = MASTER_FIELDS_EDEFAULT;

	/**
	 * The default value of the '{@link #getMethod() <em>Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethod()
	 * @generated
	 * @ordered
	 */
	protected static final Object METHOD_EDEFAULT = "get"; // TODO The default value literal "get" is not valid.

	/**
	 * The cached value of the '{@link #getMethod() <em>Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethod()
	 * @generated
	 * @ordered
	 */
	protected Object method = METHOD_EDEFAULT;

	/**
	 * This is true if the Method attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean methodESet;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getNavigationMode() <em>Navigation Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNavigationMode()
	 * @generated
	 * @ordered
	 */
	protected static final Navigation NAVIGATION_MODE_EDEFAULT = Navigation.NONE;

	/**
	 * The cached value of the '{@link #getNavigationMode() <em>Navigation Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNavigationMode()
	 * @generated
	 * @ordered
	 */
	protected Navigation navigationMode = NAVIGATION_MODE_EDEFAULT;

	/**
	 * This is true if the Navigation Mode attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean navigationModeESet;

	/**
	 * The default value of the '{@link #getOrder() <em>Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrder()
	 * @generated
	 * @ordered
	 */
	protected static final String ORDER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOrder() <em>Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrder()
	 * @generated
	 * @ordered
	 */
	protected String order = ORDER_EDEFAULT;

	/**
	 * The default value of the '{@link #getTabCycle() <em>Tab Cycle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTabCycle()
	 * @generated
	 * @ordered
	 */
	protected static final TabCycles TAB_CYCLE_EDEFAULT = TabCycles.RECORDS;

	/**
	 * The cached value of the '{@link #getTabCycle() <em>Tab Cycle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTabCycle()
	 * @generated
	 * @ordered
	 */
	protected TabCycles tabCycle = TAB_CYCLE_EDEFAULT;

	/**
	 * This is true if the Tab Cycle attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean tabCycleESet;

	/**
	 * The default value of the '{@link #getTargetFrame() <em>Target Frame</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetFrame()
	 * @generated
	 * @ordered
	 */
	protected static final Object TARGET_FRAME_EDEFAULT = "_blank"; // TODO The default value literal "_blank" is not valid.

	/**
	 * The cached value of the '{@link #getTargetFrame() <em>Target Frame</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetFrame()
	 * @generated
	 * @ordered
	 */
	protected Object targetFrame = TARGET_FRAME_EDEFAULT;

	/**
	 * This is true if the Target Frame attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean targetFrameESet;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final TypeType TYPE_EDEFAULT = TypeType.SIMPLE;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected TypeType type = TYPE_EDEFAULT;

	/**
	 * This is true if the Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FormTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FormPackage.eINSTANCE.getFormType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertiesType getProperties() {
		return properties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProperties(PropertiesType newProperties, NotificationChain msgs) {
		PropertiesType oldProperties = properties;
		properties = newProperties;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FormPackage.FORM_TYPE__PROPERTIES, oldProperties, newProperties);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProperties(PropertiesType newProperties) {
		if (newProperties != properties) {
			NotificationChain msgs = null;
			if (properties != null)
				msgs = ((InternalEObject)properties).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FormPackage.FORM_TYPE__PROPERTIES, null, msgs);
			if (newProperties != null)
				msgs = ((InternalEObject)newProperties).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FormPackage.FORM_TYPE__PROPERTIES, null, msgs);
			msgs = basicSetProperties(newProperties, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.FORM_TYPE__PROPERTIES, newProperties, newProperties));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventListenersType getEventListeners() {
		return eventListeners;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEventListeners(EventListenersType newEventListeners, NotificationChain msgs) {
		EventListenersType oldEventListeners = eventListeners;
		eventListeners = newEventListeners;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FormPackage.FORM_TYPE__EVENT_LISTENERS, oldEventListeners, newEventListeners);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEventListeners(EventListenersType newEventListeners) {
		if (newEventListeners != eventListeners) {
			NotificationChain msgs = null;
			if (eventListeners != null)
				msgs = ((InternalEObject)eventListeners).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FormPackage.FORM_TYPE__EVENT_LISTENERS, null, msgs);
			if (newEventListeners != null)
				msgs = ((InternalEObject)newEventListeners).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FormPackage.FORM_TYPE__EVENT_LISTENERS, null, msgs);
			msgs = basicSetEventListeners(newEventListeners, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.FORM_TYPE__EVENT_LISTENERS, newEventListeners, newEventListeners));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, FormPackage.FORM_TYPE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getControlsGroup() {
		return (FeatureMap)getGroup().<FeatureMap.Entry>list(FormPackage.eINSTANCE.getFormType_ControlsGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getControls() {
		return getControlsGroup().list(FormPackage.eINSTANCE.getFormType_Controls());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FormType> getForm() {
		return getGroup().list(FormPackage.eINSTANCE.getFormType_Form());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionResourceType getConnectionResource() {
		return connectionResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConnectionResource(ConnectionResourceType newConnectionResource, NotificationChain msgs) {
		ConnectionResourceType oldConnectionResource = connectionResource;
		connectionResource = newConnectionResource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FormPackage.FORM_TYPE__CONNECTION_RESOURCE, oldConnectionResource, newConnectionResource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnectionResource(ConnectionResourceType newConnectionResource) {
		if (newConnectionResource != connectionResource) {
			NotificationChain msgs = null;
			if (connectionResource != null)
				msgs = ((InternalEObject)connectionResource).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FormPackage.FORM_TYPE__CONNECTION_RESOURCE, null, msgs);
			if (newConnectionResource != null)
				msgs = ((InternalEObject)newConnectionResource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FormPackage.FORM_TYPE__CONNECTION_RESOURCE, null, msgs);
			msgs = basicSetConnectionResource(newConnectionResource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.FORM_TYPE__CONNECTION_RESOURCE, newConnectionResource, newConnectionResource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActuateType1 getActuate() {
		return actuate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActuate(ActuateType1 newActuate) {
		ActuateType1 oldActuate = actuate;
		actuate = newActuate == null ? ACTUATE_EDEFAULT : newActuate;
		boolean oldActuateESet = actuateESet;
		actuateESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.FORM_TYPE__ACTUATE, oldActuate, actuate, !oldActuateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetActuate() {
		ActuateType1 oldActuate = actuate;
		boolean oldActuateESet = actuateESet;
		actuate = ACTUATE_EDEFAULT;
		actuateESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, FormPackage.FORM_TYPE__ACTUATE, oldActuate, ACTUATE_EDEFAULT, oldActuateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetActuate() {
		return actuateESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getAllowDeletes() {
		return allowDeletes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllowDeletes(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newAllowDeletes) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldAllowDeletes = allowDeletes;
		allowDeletes = newAllowDeletes == null ? ALLOW_DELETES_EDEFAULT : newAllowDeletes;
		boolean oldAllowDeletesESet = allowDeletesESet;
		allowDeletesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.FORM_TYPE__ALLOW_DELETES, oldAllowDeletes, allowDeletes, !oldAllowDeletesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAllowDeletes() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldAllowDeletes = allowDeletes;
		boolean oldAllowDeletesESet = allowDeletesESet;
		allowDeletes = ALLOW_DELETES_EDEFAULT;
		allowDeletesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, FormPackage.FORM_TYPE__ALLOW_DELETES, oldAllowDeletes, ALLOW_DELETES_EDEFAULT, oldAllowDeletesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAllowDeletes() {
		return allowDeletesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getAllowInserts() {
		return allowInserts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllowInserts(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newAllowInserts) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldAllowInserts = allowInserts;
		allowInserts = newAllowInserts == null ? ALLOW_INSERTS_EDEFAULT : newAllowInserts;
		boolean oldAllowInsertsESet = allowInsertsESet;
		allowInsertsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.FORM_TYPE__ALLOW_INSERTS, oldAllowInserts, allowInserts, !oldAllowInsertsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAllowInserts() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldAllowInserts = allowInserts;
		boolean oldAllowInsertsESet = allowInsertsESet;
		allowInserts = ALLOW_INSERTS_EDEFAULT;
		allowInsertsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, FormPackage.FORM_TYPE__ALLOW_INSERTS, oldAllowInserts, ALLOW_INSERTS_EDEFAULT, oldAllowInsertsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAllowInserts() {
		return allowInsertsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getAllowUpdates() {
		return allowUpdates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllowUpdates(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newAllowUpdates) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldAllowUpdates = allowUpdates;
		allowUpdates = newAllowUpdates == null ? ALLOW_UPDATES_EDEFAULT : newAllowUpdates;
		boolean oldAllowUpdatesESet = allowUpdatesESet;
		allowUpdatesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.FORM_TYPE__ALLOW_UPDATES, oldAllowUpdates, allowUpdates, !oldAllowUpdatesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAllowUpdates() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldAllowUpdates = allowUpdates;
		boolean oldAllowUpdatesESet = allowUpdatesESet;
		allowUpdates = ALLOW_UPDATES_EDEFAULT;
		allowUpdatesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, FormPackage.FORM_TYPE__ALLOW_UPDATES, oldAllowUpdates, ALLOW_UPDATES_EDEFAULT, oldAllowUpdatesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAllowUpdates() {
		return allowUpdatesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getApplyFilter() {
		return applyFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApplyFilter(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newApplyFilter) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldApplyFilter = applyFilter;
		applyFilter = newApplyFilter == null ? APPLY_FILTER_EDEFAULT : newApplyFilter;
		boolean oldApplyFilterESet = applyFilterESet;
		applyFilterESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.FORM_TYPE__APPLY_FILTER, oldApplyFilter, applyFilter, !oldApplyFilterESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetApplyFilter() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldApplyFilter = applyFilter;
		boolean oldApplyFilterESet = applyFilterESet;
		applyFilter = APPLY_FILTER_EDEFAULT;
		applyFilterESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, FormPackage.FORM_TYPE__APPLY_FILTER, oldApplyFilter, APPLY_FILTER_EDEFAULT, oldApplyFilterESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetApplyFilter() {
		return applyFilterESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getCommand() {
		return command;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommand(Object newCommand) {
		Object oldCommand = command;
		command = newCommand;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.FORM_TYPE__COMMAND, oldCommand, command));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommandTypeType getCommandType() {
		return commandType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommandType(CommandTypeType newCommandType) {
		CommandTypeType oldCommandType = commandType;
		commandType = newCommandType == null ? COMMAND_TYPE_EDEFAULT : newCommandType;
		boolean oldCommandTypeESet = commandTypeESet;
		commandTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.FORM_TYPE__COMMAND_TYPE, oldCommandType, commandType, !oldCommandTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCommandType() {
		CommandTypeType oldCommandType = commandType;
		boolean oldCommandTypeESet = commandTypeESet;
		commandType = COMMAND_TYPE_EDEFAULT;
		commandTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, FormPackage.FORM_TYPE__COMMAND_TYPE, oldCommandType, COMMAND_TYPE_EDEFAULT, oldCommandTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCommandType() {
		return commandTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getControlImplementation() {
		return controlImplementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setControlImplementation(String newControlImplementation) {
		String oldControlImplementation = controlImplementation;
		controlImplementation = newControlImplementation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.FORM_TYPE__CONTROL_IMPLEMENTATION, oldControlImplementation, controlImplementation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDatasource() {
		return datasource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatasource(String newDatasource) {
		String oldDatasource = datasource;
		datasource = newDatasource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.FORM_TYPE__DATASOURCE, oldDatasource, datasource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDetailFields() {
		return detailFields;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDetailFields(String newDetailFields) {
		String oldDetailFields = detailFields;
		detailFields = newDetailFields;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.FORM_TYPE__DETAIL_FIELDS, oldDetailFields, detailFields));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEnctype() {
		return enctype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnctype(String newEnctype) {
		String oldEnctype = enctype;
		enctype = newEnctype;
		boolean oldEnctypeESet = enctypeESet;
		enctypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.FORM_TYPE__ENCTYPE, oldEnctype, enctype, !oldEnctypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEnctype() {
		String oldEnctype = enctype;
		boolean oldEnctypeESet = enctypeESet;
		enctype = ENCTYPE_EDEFAULT;
		enctypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, FormPackage.FORM_TYPE__ENCTYPE, oldEnctype, ENCTYPE_EDEFAULT, oldEnctypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEnctype() {
		return enctypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getEscapeProcessing() {
		return escapeProcessing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEscapeProcessing(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newEscapeProcessing) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldEscapeProcessing = escapeProcessing;
		escapeProcessing = newEscapeProcessing == null ? ESCAPE_PROCESSING_EDEFAULT : newEscapeProcessing;
		boolean oldEscapeProcessingESet = escapeProcessingESet;
		escapeProcessingESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.FORM_TYPE__ESCAPE_PROCESSING, oldEscapeProcessing, escapeProcessing, !oldEscapeProcessingESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEscapeProcessing() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldEscapeProcessing = escapeProcessing;
		boolean oldEscapeProcessingESet = escapeProcessingESet;
		escapeProcessing = ESCAPE_PROCESSING_EDEFAULT;
		escapeProcessingESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, FormPackage.FORM_TYPE__ESCAPE_PROCESSING, oldEscapeProcessing, ESCAPE_PROCESSING_EDEFAULT, oldEscapeProcessingESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEscapeProcessing() {
		return escapeProcessingESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFilter() {
		return filter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFilter(String newFilter) {
		String oldFilter = filter;
		filter = newFilter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.FORM_TYPE__FILTER, oldFilter, filter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHref() {
		return href;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHref(String newHref) {
		String oldHref = href;
		href = newHref;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.FORM_TYPE__HREF, oldHref, href));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getIgnoreResult() {
		return ignoreResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIgnoreResult(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newIgnoreResult) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldIgnoreResult = ignoreResult;
		ignoreResult = newIgnoreResult == null ? IGNORE_RESULT_EDEFAULT : newIgnoreResult;
		boolean oldIgnoreResultESet = ignoreResultESet;
		ignoreResultESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.FORM_TYPE__IGNORE_RESULT, oldIgnoreResult, ignoreResult, !oldIgnoreResultESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIgnoreResult() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldIgnoreResult = ignoreResult;
		boolean oldIgnoreResultESet = ignoreResultESet;
		ignoreResult = IGNORE_RESULT_EDEFAULT;
		ignoreResultESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, FormPackage.FORM_TYPE__IGNORE_RESULT, oldIgnoreResult, IGNORE_RESULT_EDEFAULT, oldIgnoreResultESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIgnoreResult() {
		return ignoreResultESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMasterFields() {
		return masterFields;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMasterFields(String newMasterFields) {
		String oldMasterFields = masterFields;
		masterFields = newMasterFields;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.FORM_TYPE__MASTER_FIELDS, oldMasterFields, masterFields));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getMethod() {
		return method;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMethod(Object newMethod) {
		Object oldMethod = method;
		method = newMethod;
		boolean oldMethodESet = methodESet;
		methodESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.FORM_TYPE__METHOD, oldMethod, method, !oldMethodESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMethod() {
		Object oldMethod = method;
		boolean oldMethodESet = methodESet;
		method = METHOD_EDEFAULT;
		methodESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, FormPackage.FORM_TYPE__METHOD, oldMethod, METHOD_EDEFAULT, oldMethodESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMethod() {
		return methodESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.FORM_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Navigation getNavigationMode() {
		return navigationMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNavigationMode(Navigation newNavigationMode) {
		Navigation oldNavigationMode = navigationMode;
		navigationMode = newNavigationMode == null ? NAVIGATION_MODE_EDEFAULT : newNavigationMode;
		boolean oldNavigationModeESet = navigationModeESet;
		navigationModeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.FORM_TYPE__NAVIGATION_MODE, oldNavigationMode, navigationMode, !oldNavigationModeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNavigationMode() {
		Navigation oldNavigationMode = navigationMode;
		boolean oldNavigationModeESet = navigationModeESet;
		navigationMode = NAVIGATION_MODE_EDEFAULT;
		navigationModeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, FormPackage.FORM_TYPE__NAVIGATION_MODE, oldNavigationMode, NAVIGATION_MODE_EDEFAULT, oldNavigationModeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNavigationMode() {
		return navigationModeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOrder() {
		return order;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrder(String newOrder) {
		String oldOrder = order;
		order = newOrder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.FORM_TYPE__ORDER, oldOrder, order));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TabCycles getTabCycle() {
		return tabCycle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTabCycle(TabCycles newTabCycle) {
		TabCycles oldTabCycle = tabCycle;
		tabCycle = newTabCycle == null ? TAB_CYCLE_EDEFAULT : newTabCycle;
		boolean oldTabCycleESet = tabCycleESet;
		tabCycleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.FORM_TYPE__TAB_CYCLE, oldTabCycle, tabCycle, !oldTabCycleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTabCycle() {
		TabCycles oldTabCycle = tabCycle;
		boolean oldTabCycleESet = tabCycleESet;
		tabCycle = TAB_CYCLE_EDEFAULT;
		tabCycleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, FormPackage.FORM_TYPE__TAB_CYCLE, oldTabCycle, TAB_CYCLE_EDEFAULT, oldTabCycleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTabCycle() {
		return tabCycleESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getTargetFrame() {
		return targetFrame;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetFrame(Object newTargetFrame) {
		Object oldTargetFrame = targetFrame;
		targetFrame = newTargetFrame;
		boolean oldTargetFrameESet = targetFrameESet;
		targetFrameESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.FORM_TYPE__TARGET_FRAME, oldTargetFrame, targetFrame, !oldTargetFrameESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTargetFrame() {
		Object oldTargetFrame = targetFrame;
		boolean oldTargetFrameESet = targetFrameESet;
		targetFrame = TARGET_FRAME_EDEFAULT;
		targetFrameESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, FormPackage.FORM_TYPE__TARGET_FRAME, oldTargetFrame, TARGET_FRAME_EDEFAULT, oldTargetFrameESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTargetFrame() {
		return targetFrameESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(TypeType newType) {
		TypeType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		boolean oldTypeESet = typeESet;
		typeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.FORM_TYPE__TYPE, oldType, type, !oldTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetType() {
		TypeType oldType = type;
		boolean oldTypeESet = typeESet;
		type = TYPE_EDEFAULT;
		typeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, FormPackage.FORM_TYPE__TYPE, oldType, TYPE_EDEFAULT, oldTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetType() {
		return typeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FormPackage.FORM_TYPE__PROPERTIES:
				return basicSetProperties(null, msgs);
			case FormPackage.FORM_TYPE__EVENT_LISTENERS:
				return basicSetEventListeners(null, msgs);
			case FormPackage.FORM_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case FormPackage.FORM_TYPE__CONTROLS_GROUP:
				return ((InternalEList<?>)getControlsGroup()).basicRemove(otherEnd, msgs);
			case FormPackage.FORM_TYPE__CONTROLS:
				return ((InternalEList<?>)getControls()).basicRemove(otherEnd, msgs);
			case FormPackage.FORM_TYPE__FORM:
				return ((InternalEList<?>)getForm()).basicRemove(otherEnd, msgs);
			case FormPackage.FORM_TYPE__CONNECTION_RESOURCE:
				return basicSetConnectionResource(null, msgs);
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
			case FormPackage.FORM_TYPE__PROPERTIES:
				return getProperties();
			case FormPackage.FORM_TYPE__EVENT_LISTENERS:
				return getEventListeners();
			case FormPackage.FORM_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case FormPackage.FORM_TYPE__CONTROLS_GROUP:
				if (coreType) return getControlsGroup();
				return ((FeatureMap.Internal)getControlsGroup()).getWrapper();
			case FormPackage.FORM_TYPE__CONTROLS:
				return getControls();
			case FormPackage.FORM_TYPE__FORM:
				return getForm();
			case FormPackage.FORM_TYPE__CONNECTION_RESOURCE:
				return getConnectionResource();
			case FormPackage.FORM_TYPE__ACTUATE:
				return getActuate();
			case FormPackage.FORM_TYPE__ALLOW_DELETES:
				return getAllowDeletes();
			case FormPackage.FORM_TYPE__ALLOW_INSERTS:
				return getAllowInserts();
			case FormPackage.FORM_TYPE__ALLOW_UPDATES:
				return getAllowUpdates();
			case FormPackage.FORM_TYPE__APPLY_FILTER:
				return getApplyFilter();
			case FormPackage.FORM_TYPE__COMMAND:
				return getCommand();
			case FormPackage.FORM_TYPE__COMMAND_TYPE:
				return getCommandType();
			case FormPackage.FORM_TYPE__CONTROL_IMPLEMENTATION:
				return getControlImplementation();
			case FormPackage.FORM_TYPE__DATASOURCE:
				return getDatasource();
			case FormPackage.FORM_TYPE__DETAIL_FIELDS:
				return getDetailFields();
			case FormPackage.FORM_TYPE__ENCTYPE:
				return getEnctype();
			case FormPackage.FORM_TYPE__ESCAPE_PROCESSING:
				return getEscapeProcessing();
			case FormPackage.FORM_TYPE__FILTER:
				return getFilter();
			case FormPackage.FORM_TYPE__HREF:
				return getHref();
			case FormPackage.FORM_TYPE__IGNORE_RESULT:
				return getIgnoreResult();
			case FormPackage.FORM_TYPE__MASTER_FIELDS:
				return getMasterFields();
			case FormPackage.FORM_TYPE__METHOD:
				return getMethod();
			case FormPackage.FORM_TYPE__NAME:
				return getName();
			case FormPackage.FORM_TYPE__NAVIGATION_MODE:
				return getNavigationMode();
			case FormPackage.FORM_TYPE__ORDER:
				return getOrder();
			case FormPackage.FORM_TYPE__TAB_CYCLE:
				return getTabCycle();
			case FormPackage.FORM_TYPE__TARGET_FRAME:
				return getTargetFrame();
			case FormPackage.FORM_TYPE__TYPE:
				return getType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FormPackage.FORM_TYPE__PROPERTIES:
				setProperties((PropertiesType)newValue);
				return;
			case FormPackage.FORM_TYPE__EVENT_LISTENERS:
				setEventListeners((EventListenersType)newValue);
				return;
			case FormPackage.FORM_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case FormPackage.FORM_TYPE__CONTROLS_GROUP:
				((FeatureMap.Internal)getControlsGroup()).set(newValue);
				return;
			case FormPackage.FORM_TYPE__FORM:
				getForm().clear();
				getForm().addAll((Collection<? extends FormType>)newValue);
				return;
			case FormPackage.FORM_TYPE__CONNECTION_RESOURCE:
				setConnectionResource((ConnectionResourceType)newValue);
				return;
			case FormPackage.FORM_TYPE__ACTUATE:
				setActuate((ActuateType1)newValue);
				return;
			case FormPackage.FORM_TYPE__ALLOW_DELETES:
				setAllowDeletes((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case FormPackage.FORM_TYPE__ALLOW_INSERTS:
				setAllowInserts((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case FormPackage.FORM_TYPE__ALLOW_UPDATES:
				setAllowUpdates((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case FormPackage.FORM_TYPE__APPLY_FILTER:
				setApplyFilter((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case FormPackage.FORM_TYPE__COMMAND:
				setCommand(newValue);
				return;
			case FormPackage.FORM_TYPE__COMMAND_TYPE:
				setCommandType((CommandTypeType)newValue);
				return;
			case FormPackage.FORM_TYPE__CONTROL_IMPLEMENTATION:
				setControlImplementation((String)newValue);
				return;
			case FormPackage.FORM_TYPE__DATASOURCE:
				setDatasource((String)newValue);
				return;
			case FormPackage.FORM_TYPE__DETAIL_FIELDS:
				setDetailFields((String)newValue);
				return;
			case FormPackage.FORM_TYPE__ENCTYPE:
				setEnctype((String)newValue);
				return;
			case FormPackage.FORM_TYPE__ESCAPE_PROCESSING:
				setEscapeProcessing((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case FormPackage.FORM_TYPE__FILTER:
				setFilter((String)newValue);
				return;
			case FormPackage.FORM_TYPE__HREF:
				setHref((String)newValue);
				return;
			case FormPackage.FORM_TYPE__IGNORE_RESULT:
				setIgnoreResult((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case FormPackage.FORM_TYPE__MASTER_FIELDS:
				setMasterFields((String)newValue);
				return;
			case FormPackage.FORM_TYPE__METHOD:
				setMethod(newValue);
				return;
			case FormPackage.FORM_TYPE__NAME:
				setName((String)newValue);
				return;
			case FormPackage.FORM_TYPE__NAVIGATION_MODE:
				setNavigationMode((Navigation)newValue);
				return;
			case FormPackage.FORM_TYPE__ORDER:
				setOrder((String)newValue);
				return;
			case FormPackage.FORM_TYPE__TAB_CYCLE:
				setTabCycle((TabCycles)newValue);
				return;
			case FormPackage.FORM_TYPE__TARGET_FRAME:
				setTargetFrame(newValue);
				return;
			case FormPackage.FORM_TYPE__TYPE:
				setType((TypeType)newValue);
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
			case FormPackage.FORM_TYPE__PROPERTIES:
				setProperties((PropertiesType)null);
				return;
			case FormPackage.FORM_TYPE__EVENT_LISTENERS:
				setEventListeners((EventListenersType)null);
				return;
			case FormPackage.FORM_TYPE__GROUP:
				getGroup().clear();
				return;
			case FormPackage.FORM_TYPE__CONTROLS_GROUP:
				getControlsGroup().clear();
				return;
			case FormPackage.FORM_TYPE__FORM:
				getForm().clear();
				return;
			case FormPackage.FORM_TYPE__CONNECTION_RESOURCE:
				setConnectionResource((ConnectionResourceType)null);
				return;
			case FormPackage.FORM_TYPE__ACTUATE:
				unsetActuate();
				return;
			case FormPackage.FORM_TYPE__ALLOW_DELETES:
				unsetAllowDeletes();
				return;
			case FormPackage.FORM_TYPE__ALLOW_INSERTS:
				unsetAllowInserts();
				return;
			case FormPackage.FORM_TYPE__ALLOW_UPDATES:
				unsetAllowUpdates();
				return;
			case FormPackage.FORM_TYPE__APPLY_FILTER:
				unsetApplyFilter();
				return;
			case FormPackage.FORM_TYPE__COMMAND:
				setCommand(COMMAND_EDEFAULT);
				return;
			case FormPackage.FORM_TYPE__COMMAND_TYPE:
				unsetCommandType();
				return;
			case FormPackage.FORM_TYPE__CONTROL_IMPLEMENTATION:
				setControlImplementation(CONTROL_IMPLEMENTATION_EDEFAULT);
				return;
			case FormPackage.FORM_TYPE__DATASOURCE:
				setDatasource(DATASOURCE_EDEFAULT);
				return;
			case FormPackage.FORM_TYPE__DETAIL_FIELDS:
				setDetailFields(DETAIL_FIELDS_EDEFAULT);
				return;
			case FormPackage.FORM_TYPE__ENCTYPE:
				unsetEnctype();
				return;
			case FormPackage.FORM_TYPE__ESCAPE_PROCESSING:
				unsetEscapeProcessing();
				return;
			case FormPackage.FORM_TYPE__FILTER:
				setFilter(FILTER_EDEFAULT);
				return;
			case FormPackage.FORM_TYPE__HREF:
				setHref(HREF_EDEFAULT);
				return;
			case FormPackage.FORM_TYPE__IGNORE_RESULT:
				unsetIgnoreResult();
				return;
			case FormPackage.FORM_TYPE__MASTER_FIELDS:
				setMasterFields(MASTER_FIELDS_EDEFAULT);
				return;
			case FormPackage.FORM_TYPE__METHOD:
				unsetMethod();
				return;
			case FormPackage.FORM_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case FormPackage.FORM_TYPE__NAVIGATION_MODE:
				unsetNavigationMode();
				return;
			case FormPackage.FORM_TYPE__ORDER:
				setOrder(ORDER_EDEFAULT);
				return;
			case FormPackage.FORM_TYPE__TAB_CYCLE:
				unsetTabCycle();
				return;
			case FormPackage.FORM_TYPE__TARGET_FRAME:
				unsetTargetFrame();
				return;
			case FormPackage.FORM_TYPE__TYPE:
				unsetType();
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
			case FormPackage.FORM_TYPE__PROPERTIES:
				return properties != null;
			case FormPackage.FORM_TYPE__EVENT_LISTENERS:
				return eventListeners != null;
			case FormPackage.FORM_TYPE__GROUP:
				return group != null && !group.isEmpty();
			case FormPackage.FORM_TYPE__CONTROLS_GROUP:
				return !getControlsGroup().isEmpty();
			case FormPackage.FORM_TYPE__CONTROLS:
				return !getControls().isEmpty();
			case FormPackage.FORM_TYPE__FORM:
				return !getForm().isEmpty();
			case FormPackage.FORM_TYPE__CONNECTION_RESOURCE:
				return connectionResource != null;
			case FormPackage.FORM_TYPE__ACTUATE:
				return isSetActuate();
			case FormPackage.FORM_TYPE__ALLOW_DELETES:
				return isSetAllowDeletes();
			case FormPackage.FORM_TYPE__ALLOW_INSERTS:
				return isSetAllowInserts();
			case FormPackage.FORM_TYPE__ALLOW_UPDATES:
				return isSetAllowUpdates();
			case FormPackage.FORM_TYPE__APPLY_FILTER:
				return isSetApplyFilter();
			case FormPackage.FORM_TYPE__COMMAND:
				return COMMAND_EDEFAULT == null ? command != null : !COMMAND_EDEFAULT.equals(command);
			case FormPackage.FORM_TYPE__COMMAND_TYPE:
				return isSetCommandType();
			case FormPackage.FORM_TYPE__CONTROL_IMPLEMENTATION:
				return CONTROL_IMPLEMENTATION_EDEFAULT == null ? controlImplementation != null : !CONTROL_IMPLEMENTATION_EDEFAULT.equals(controlImplementation);
			case FormPackage.FORM_TYPE__DATASOURCE:
				return DATASOURCE_EDEFAULT == null ? datasource != null : !DATASOURCE_EDEFAULT.equals(datasource);
			case FormPackage.FORM_TYPE__DETAIL_FIELDS:
				return DETAIL_FIELDS_EDEFAULT == null ? detailFields != null : !DETAIL_FIELDS_EDEFAULT.equals(detailFields);
			case FormPackage.FORM_TYPE__ENCTYPE:
				return isSetEnctype();
			case FormPackage.FORM_TYPE__ESCAPE_PROCESSING:
				return isSetEscapeProcessing();
			case FormPackage.FORM_TYPE__FILTER:
				return FILTER_EDEFAULT == null ? filter != null : !FILTER_EDEFAULT.equals(filter);
			case FormPackage.FORM_TYPE__HREF:
				return HREF_EDEFAULT == null ? href != null : !HREF_EDEFAULT.equals(href);
			case FormPackage.FORM_TYPE__IGNORE_RESULT:
				return isSetIgnoreResult();
			case FormPackage.FORM_TYPE__MASTER_FIELDS:
				return MASTER_FIELDS_EDEFAULT == null ? masterFields != null : !MASTER_FIELDS_EDEFAULT.equals(masterFields);
			case FormPackage.FORM_TYPE__METHOD:
				return isSetMethod();
			case FormPackage.FORM_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case FormPackage.FORM_TYPE__NAVIGATION_MODE:
				return isSetNavigationMode();
			case FormPackage.FORM_TYPE__ORDER:
				return ORDER_EDEFAULT == null ? order != null : !ORDER_EDEFAULT.equals(order);
			case FormPackage.FORM_TYPE__TAB_CYCLE:
				return isSetTabCycle();
			case FormPackage.FORM_TYPE__TARGET_FRAME:
				return isSetTargetFrame();
			case FormPackage.FORM_TYPE__TYPE:
				return isSetType();
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
		result.append(" (group: ");
		result.append(group);
		result.append(", actuate: ");
		if (actuateESet) result.append(actuate); else result.append("<unset>");
		result.append(", allowDeletes: ");
		if (allowDeletesESet) result.append(allowDeletes); else result.append("<unset>");
		result.append(", allowInserts: ");
		if (allowInsertsESet) result.append(allowInserts); else result.append("<unset>");
		result.append(", allowUpdates: ");
		if (allowUpdatesESet) result.append(allowUpdates); else result.append("<unset>");
		result.append(", applyFilter: ");
		if (applyFilterESet) result.append(applyFilter); else result.append("<unset>");
		result.append(", command: ");
		result.append(command);
		result.append(", commandType: ");
		if (commandTypeESet) result.append(commandType); else result.append("<unset>");
		result.append(", controlImplementation: ");
		result.append(controlImplementation);
		result.append(", datasource: ");
		result.append(datasource);
		result.append(", detailFields: ");
		result.append(detailFields);
		result.append(", enctype: ");
		if (enctypeESet) result.append(enctype); else result.append("<unset>");
		result.append(", escapeProcessing: ");
		if (escapeProcessingESet) result.append(escapeProcessing); else result.append("<unset>");
		result.append(", filter: ");
		result.append(filter);
		result.append(", href: ");
		result.append(href);
		result.append(", ignoreResult: ");
		if (ignoreResultESet) result.append(ignoreResult); else result.append("<unset>");
		result.append(", masterFields: ");
		result.append(masterFields);
		result.append(", method: ");
		if (methodESet) result.append(method); else result.append("<unset>");
		result.append(", name: ");
		result.append(name);
		result.append(", navigationMode: ");
		if (navigationModeESet) result.append(navigationMode); else result.append("<unset>");
		result.append(", order: ");
		result.append(order);
		result.append(", tabCycle: ");
		if (tabCycleESet) result.append(tabCycle); else result.append("<unset>");
		result.append(", targetFrame: ");
		if (targetFrameESet) result.append(targetFrame); else result.append("<unset>");
		result.append(", type: ");
		if (typeESet) result.append(type); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //FormTypeImpl
