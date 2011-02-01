/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.form.impl;

import java.math.BigInteger;

import javax.xml.datatype.Duration;

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
import org.oasisopen.names.tc.opendocument.xmlns.form.ButtonType;
import org.oasisopen.names.tc.opendocument.xmlns.form.CheckboxType;
import org.oasisopen.names.tc.opendocument.xmlns.form.ColumnType;
import org.oasisopen.names.tc.opendocument.xmlns.form.ComboboxType;
import org.oasisopen.names.tc.opendocument.xmlns.form.CommandTypeType;
import org.oasisopen.names.tc.opendocument.xmlns.form.ConnectionResourceType;
import org.oasisopen.names.tc.opendocument.xmlns.form.DateType;
import org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot;
import org.oasisopen.names.tc.opendocument.xmlns.form.FileType;
import org.oasisopen.names.tc.opendocument.xmlns.form.FixedTextType;
import org.oasisopen.names.tc.opendocument.xmlns.form.FormPackage;
import org.oasisopen.names.tc.opendocument.xmlns.form.FormType;
import org.oasisopen.names.tc.opendocument.xmlns.form.FormattedTextType;
import org.oasisopen.names.tc.opendocument.xmlns.form.FrameType;
import org.oasisopen.names.tc.opendocument.xmlns.form.GenericControlType;
import org.oasisopen.names.tc.opendocument.xmlns.form.GridType;
import org.oasisopen.names.tc.opendocument.xmlns.form.HiddenType;
import org.oasisopen.names.tc.opendocument.xmlns.form.ImageAlignType;
import org.oasisopen.names.tc.opendocument.xmlns.form.ImageFrameType;
import org.oasisopen.names.tc.opendocument.xmlns.form.ImagePositionType;
import org.oasisopen.names.tc.opendocument.xmlns.form.ImageType;
import org.oasisopen.names.tc.opendocument.xmlns.form.ItemType;
import org.oasisopen.names.tc.opendocument.xmlns.form.ListPropertyType;
import org.oasisopen.names.tc.opendocument.xmlns.form.ListSourceTypeType;
import org.oasisopen.names.tc.opendocument.xmlns.form.ListboxType;
import org.oasisopen.names.tc.opendocument.xmlns.form.NumberType;
import org.oasisopen.names.tc.opendocument.xmlns.form.OptionType;
import org.oasisopen.names.tc.opendocument.xmlns.form.OrientationType;
import org.oasisopen.names.tc.opendocument.xmlns.form.PasswordType;
import org.oasisopen.names.tc.opendocument.xmlns.form.PropertiesType;
import org.oasisopen.names.tc.opendocument.xmlns.form.PropertyType;
import org.oasisopen.names.tc.opendocument.xmlns.form.RadioType;
import org.oasisopen.names.tc.opendocument.xmlns.form.TextType;
import org.oasisopen.names.tc.opendocument.xmlns.form.TextareaType;
import org.oasisopen.names.tc.opendocument.xmlns.form.TimeType;
import org.oasisopen.names.tc.opendocument.xmlns.form.ValueRangeType;
import org.oasisopen.names.tc.opendocument.xmlns.form.VisualEffectType;
import org.oasisopen.names.tc.opendocument.xmlns.text.Navigation;
import org.oasisopen.names.tc.opendocument.xmlns.text.States;
import org.oasisopen.names.tc.opendocument.xmlns.text.TabCycles;
import org.oasisopen.names.tc.opendocument.xmlns.text.Types;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.DocumentRootImpl#getButton <em>Button</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.DocumentRootImpl#getCheckbox <em>Checkbox</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.DocumentRootImpl#getColumn <em>Column</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.DocumentRootImpl#getCombobox <em>Combobox</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.DocumentRootImpl#getConnectionResource <em>Connection Resource</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.DocumentRootImpl#getDate <em>Date</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.DocumentRootImpl#getFile <em>File</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.DocumentRootImpl#getFixedText <em>Fixed Text</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.DocumentRootImpl#getForm <em>Form</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.DocumentRootImpl#getFormattedText <em>Formatted Text</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.DocumentRootImpl#getFrame <em>Frame</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.DocumentRootImpl#getGenericControl <em>Generic Control</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.DocumentRootImpl#getGrid <em>Grid</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.DocumentRootImpl#getHidden <em>Hidden</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.DocumentRootImpl#getImage <em>Image</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.DocumentRootImpl#getImageFrame <em>Image Frame</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.DocumentRootImpl#getItem <em>Item</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.DocumentRootImpl#getListbox <em>Listbox</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.DocumentRootImpl#getListProperty <em>List Property</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.DocumentRootImpl#getNumber <em>Number</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.DocumentRootImpl#getOption <em>Option</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.DocumentRootImpl#getPassword <em>Password</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.DocumentRootImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.DocumentRootImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.DocumentRootImpl#getRadio <em>Radio</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.DocumentRootImpl#getText <em>Text</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.DocumentRootImpl#getTextarea <em>Textarea</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.DocumentRootImpl#getTime <em>Time</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.DocumentRootImpl#getValueRange <em>Value Range</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.DocumentRootImpl#getAllowDeletes <em>Allow Deletes</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.DocumentRootImpl#getAllowInserts <em>Allow Inserts</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.DocumentRootImpl#getAllowUpdates <em>Allow Updates</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.DocumentRootImpl#getApplyDesignMode <em>Apply Design Mode</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.DocumentRootImpl#getApplyFilter <em>Apply Filter</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.DocumentRootImpl#getAutoComplete <em>Auto Complete</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.DocumentRootImpl#getAutomaticFocus <em>Automatic Focus</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.DocumentRootImpl#getBoundColumn <em>Bound Column</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.DocumentRootImpl#getButtonType <em>Button Type</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.DocumentRootImpl#getCommand <em>Command</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.DocumentRootImpl#getCommandType <em>Command Type</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.DocumentRootImpl#getControlImplementation <em>Control Implementation</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.DocumentRootImpl#getConvertEmptyToNull <em>Convert Empty To Null</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.DocumentRootImpl#getCurrentSelected <em>Current Selected</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.DocumentRootImpl#getCurrentState <em>Current State</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.DocumentRootImpl#getDataField <em>Data Field</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.DocumentRootImpl#getDatasource <em>Datasource</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.DocumentRootImpl#getDefaultButton <em>Default Button</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.DocumentRootImpl#getDelayForRepeat <em>Delay For Repeat</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.DocumentRootImpl#getDetailFields <em>Detail Fields</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.DocumentRootImpl#getDisabled <em>Disabled</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.DocumentRootImpl#getDropdown <em>Dropdown</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.DocumentRootImpl#getEchoChar <em>Echo Char</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.DocumentRootImpl#getEnctype <em>Enctype</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.DocumentRootImpl#getEscapeProcessing <em>Escape Processing</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.DocumentRootImpl#getFilter <em>Filter</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.DocumentRootImpl#getFocusOnClick <em>Focus On Click</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.DocumentRootImpl#getFor <em>For</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.DocumentRootImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.DocumentRootImpl#getIgnoreResult <em>Ignore Result</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.DocumentRootImpl#getImageAlign <em>Image Align</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.DocumentRootImpl#getImageData <em>Image Data</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.DocumentRootImpl#getImagePosition <em>Image Position</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.DocumentRootImpl#getIsTristate <em>Is Tristate</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.DocumentRootImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.DocumentRootImpl#getListSource <em>List Source</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.DocumentRootImpl#getListSourceType <em>List Source Type</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.DocumentRootImpl#getMasterFields <em>Master Fields</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.DocumentRootImpl#getMaxLength <em>Max Length</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.DocumentRootImpl#getMethod <em>Method</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.DocumentRootImpl#getMultiLine <em>Multi Line</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.DocumentRootImpl#getMultiple <em>Multiple</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.DocumentRootImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.DocumentRootImpl#getNavigationMode <em>Navigation Mode</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.DocumentRootImpl#getOrder <em>Order</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.DocumentRootImpl#getOrientation <em>Orientation</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.DocumentRootImpl#getPageStepSize <em>Page Step Size</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.DocumentRootImpl#getPrintable <em>Printable</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.DocumentRootImpl#getPropertyName <em>Property Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.DocumentRootImpl#getReadonly <em>Readonly</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.DocumentRootImpl#getSelected <em>Selected</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.DocumentRootImpl#getSize <em>Size</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.DocumentRootImpl#getState <em>State</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.DocumentRootImpl#getStepSize <em>Step Size</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.DocumentRootImpl#getTabCycle <em>Tab Cycle</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.DocumentRootImpl#getTabIndex <em>Tab Index</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.DocumentRootImpl#getTabStop <em>Tab Stop</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.DocumentRootImpl#getTextStyleName <em>Text Style Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.DocumentRootImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.DocumentRootImpl#getToggle <em>Toggle</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.DocumentRootImpl#getValidation <em>Validation</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.DocumentRootImpl#getVisualEffect <em>Visual Effect</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.DocumentRootImpl#getXformsListSource <em>Xforms List Source</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.DocumentRootImpl#getXformsSubmission <em>Xforms Submission</em>}</li>
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
	 * The default value of the '{@link #getApplyDesignMode() <em>Apply Design Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplyDesignMode()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean APPLY_DESIGN_MODE_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getApplyDesignMode() <em>Apply Design Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplyDesignMode()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean applyDesignMode = APPLY_DESIGN_MODE_EDEFAULT;

	/**
	 * This is true if the Apply Design Mode attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean applyDesignModeESet;

	/**
	 * The default value of the '{@link #getApplyFilter() <em>Apply Filter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplyFilter()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean APPLY_FILTER_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

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
	 * The default value of the '{@link #getAutoComplete() <em>Auto Complete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutoComplete()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean AUTO_COMPLETE_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getAutoComplete() <em>Auto Complete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutoComplete()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean autoComplete = AUTO_COMPLETE_EDEFAULT;

	/**
	 * This is true if the Auto Complete attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean autoCompleteESet;

	/**
	 * The default value of the '{@link #getAutomaticFocus() <em>Automatic Focus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutomaticFocus()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean AUTOMATIC_FOCUS_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getAutomaticFocus() <em>Automatic Focus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutomaticFocus()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean automaticFocus = AUTOMATIC_FOCUS_EDEFAULT;

	/**
	 * This is true if the Automatic Focus attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean automaticFocusESet;

	/**
	 * The default value of the '{@link #getBoundColumn() <em>Bound Column</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoundColumn()
	 * @generated
	 * @ordered
	 */
	protected static final String BOUND_COLUMN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBoundColumn() <em>Bound Column</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoundColumn()
	 * @generated
	 * @ordered
	 */
	protected String boundColumn = BOUND_COLUMN_EDEFAULT;

	/**
	 * The default value of the '{@link #getButtonType() <em>Button Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getButtonType()
	 * @generated
	 * @ordered
	 */
	protected static final Types BUTTON_TYPE_EDEFAULT = Types.SUBMIT;

	/**
	 * The cached value of the '{@link #getButtonType() <em>Button Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getButtonType()
	 * @generated
	 * @ordered
	 */
	protected Types buttonType = BUTTON_TYPE_EDEFAULT;

	/**
	 * This is true if the Button Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean buttonTypeESet;

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
	protected static final CommandTypeType COMMAND_TYPE_EDEFAULT = CommandTypeType.TABLE;

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
	 * The default value of the '{@link #getConvertEmptyToNull() <em>Convert Empty To Null</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConvertEmptyToNull()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean CONVERT_EMPTY_TO_NULL_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getConvertEmptyToNull() <em>Convert Empty To Null</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConvertEmptyToNull()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean convertEmptyToNull = CONVERT_EMPTY_TO_NULL_EDEFAULT;

	/**
	 * This is true if the Convert Empty To Null attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean convertEmptyToNullESet;

	/**
	 * The default value of the '{@link #getCurrentSelected() <em>Current Selected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentSelected()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean CURRENT_SELECTED_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getCurrentSelected() <em>Current Selected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentSelected()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean currentSelected = CURRENT_SELECTED_EDEFAULT;

	/**
	 * This is true if the Current Selected attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean currentSelectedESet;

	/**
	 * The default value of the '{@link #getCurrentState() <em>Current State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentState()
	 * @generated
	 * @ordered
	 */
	protected static final States CURRENT_STATE_EDEFAULT = States.UNCHECKED;

	/**
	 * The cached value of the '{@link #getCurrentState() <em>Current State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentState()
	 * @generated
	 * @ordered
	 */
	protected States currentState = CURRENT_STATE_EDEFAULT;

	/**
	 * This is true if the Current State attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean currentStateESet;

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
	 * The default value of the '{@link #getDefaultButton() <em>Default Button</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultButton()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean DEFAULT_BUTTON_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getDefaultButton() <em>Default Button</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultButton()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean defaultButton = DEFAULT_BUTTON_EDEFAULT;

	/**
	 * This is true if the Default Button attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean defaultButtonESet;

	/**
	 * The default value of the '{@link #getDelayForRepeat() <em>Delay For Repeat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelayForRepeat()
	 * @generated
	 * @ordered
	 */
	protected static final Duration DELAY_FOR_REPEAT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDelayForRepeat() <em>Delay For Repeat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelayForRepeat()
	 * @generated
	 * @ordered
	 */
	protected Duration delayForRepeat = DELAY_FOR_REPEAT_EDEFAULT;

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
	 * The default value of the '{@link #getDisabled() <em>Disabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisabled()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean DISABLED_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getDisabled() <em>Disabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisabled()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean disabled = DISABLED_EDEFAULT;

	/**
	 * This is true if the Disabled attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean disabledESet;

	/**
	 * The default value of the '{@link #getDropdown() <em>Dropdown</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDropdown()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean DROPDOWN_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getDropdown() <em>Dropdown</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDropdown()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean dropdown = DROPDOWN_EDEFAULT;

	/**
	 * This is true if the Dropdown attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean dropdownESet;

	/**
	 * The default value of the '{@link #getEchoChar() <em>Echo Char</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEchoChar()
	 * @generated
	 * @ordered
	 */
	protected static final String ECHO_CHAR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEchoChar() <em>Echo Char</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEchoChar()
	 * @generated
	 * @ordered
	 */
	protected String echoChar = ECHO_CHAR_EDEFAULT;

	/**
	 * The default value of the '{@link #getEnctype() <em>Enctype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnctype()
	 * @generated
	 * @ordered
	 */
	protected static final String ENCTYPE_EDEFAULT = null;

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
	 * The default value of the '{@link #getFocusOnClick() <em>Focus On Click</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFocusOnClick()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean FOCUS_ON_CLICK_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getFocusOnClick() <em>Focus On Click</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFocusOnClick()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean focusOnClick = FOCUS_ON_CLICK_EDEFAULT;

	/**
	 * This is true if the Focus On Click attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean focusOnClickESet;

	/**
	 * The default value of the '{@link #getFor() <em>For</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFor()
	 * @generated
	 * @ordered
	 */
	protected static final String FOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFor() <em>For</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFor()
	 * @generated
	 * @ordered
	 */
	protected String for_ = FOR_EDEFAULT;

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
	 * The default value of the '{@link #getIgnoreResult() <em>Ignore Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIgnoreResult()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean IGNORE_RESULT_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

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
	 * The default value of the '{@link #getImageAlign() <em>Image Align</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImageAlign()
	 * @generated
	 * @ordered
	 */
	protected static final ImageAlignType IMAGE_ALIGN_EDEFAULT = ImageAlignType.START;

	/**
	 * The cached value of the '{@link #getImageAlign() <em>Image Align</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImageAlign()
	 * @generated
	 * @ordered
	 */
	protected ImageAlignType imageAlign = IMAGE_ALIGN_EDEFAULT;

	/**
	 * This is true if the Image Align attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean imageAlignESet;

	/**
	 * The default value of the '{@link #getImageData() <em>Image Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImageData()
	 * @generated
	 * @ordered
	 */
	protected static final String IMAGE_DATA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImageData() <em>Image Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImageData()
	 * @generated
	 * @ordered
	 */
	protected String imageData = IMAGE_DATA_EDEFAULT;

	/**
	 * The default value of the '{@link #getImagePosition() <em>Image Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImagePosition()
	 * @generated
	 * @ordered
	 */
	protected static final ImagePositionType IMAGE_POSITION_EDEFAULT = ImagePositionType.CENTER;

	/**
	 * The cached value of the '{@link #getImagePosition() <em>Image Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImagePosition()
	 * @generated
	 * @ordered
	 */
	protected ImagePositionType imagePosition = IMAGE_POSITION_EDEFAULT;

	/**
	 * This is true if the Image Position attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean imagePositionESet;

	/**
	 * The default value of the '{@link #getIsTristate() <em>Is Tristate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsTristate()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean IS_TRISTATE_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getIsTristate() <em>Is Tristate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsTristate()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean isTristate = IS_TRISTATE_EDEFAULT;

	/**
	 * This is true if the Is Tristate attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isTristateESet;

	/**
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected String label = LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getListSource() <em>List Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListSource()
	 * @generated
	 * @ordered
	 */
	protected static final String LIST_SOURCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getListSource() <em>List Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListSource()
	 * @generated
	 * @ordered
	 */
	protected String listSource = LIST_SOURCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getListSourceType() <em>List Source Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListSourceType()
	 * @generated
	 * @ordered
	 */
	protected static final ListSourceTypeType LIST_SOURCE_TYPE_EDEFAULT = ListSourceTypeType.TABLE;

	/**
	 * The cached value of the '{@link #getListSourceType() <em>List Source Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListSourceType()
	 * @generated
	 * @ordered
	 */
	protected ListSourceTypeType listSourceType = LIST_SOURCE_TYPE_EDEFAULT;

	/**
	 * This is true if the List Source Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean listSourceTypeESet;

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
	 * The default value of the '{@link #getMaxLength() <em>Max Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxLength()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger MAX_LENGTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxLength() <em>Max Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxLength()
	 * @generated
	 * @ordered
	 */
	protected BigInteger maxLength = MAX_LENGTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getMethod() <em>Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethod()
	 * @generated
	 * @ordered
	 */
	protected static final Object METHOD_EDEFAULT = null;

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
	 * The default value of the '{@link #getMultiLine() <em>Multi Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiLine()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean MULTI_LINE_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getMultiLine() <em>Multi Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiLine()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean multiLine = MULTI_LINE_EDEFAULT;

	/**
	 * This is true if the Multi Line attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean multiLineESet;

	/**
	 * The default value of the '{@link #getMultiple() <em>Multiple</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiple()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean MULTIPLE_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getMultiple() <em>Multiple</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiple()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean multiple = MULTIPLE_EDEFAULT;

	/**
	 * This is true if the Multiple attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean multipleESet;

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
	 * The default value of the '{@link #getOrientation() <em>Orientation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrientation()
	 * @generated
	 * @ordered
	 */
	protected static final OrientationType ORIENTATION_EDEFAULT = OrientationType.HORIZONTAL;

	/**
	 * The cached value of the '{@link #getOrientation() <em>Orientation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrientation()
	 * @generated
	 * @ordered
	 */
	protected OrientationType orientation = ORIENTATION_EDEFAULT;

	/**
	 * This is true if the Orientation attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean orientationESet;

	/**
	 * The default value of the '{@link #getPageStepSize() <em>Page Step Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPageStepSize()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger PAGE_STEP_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPageStepSize() <em>Page Step Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPageStepSize()
	 * @generated
	 * @ordered
	 */
	protected BigInteger pageStepSize = PAGE_STEP_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrintable() <em>Printable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrintable()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean PRINTABLE_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getPrintable() <em>Printable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrintable()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean printable = PRINTABLE_EDEFAULT;

	/**
	 * This is true if the Printable attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean printableESet;

	/**
	 * The default value of the '{@link #getPropertyName() <em>Property Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyName()
	 * @generated
	 * @ordered
	 */
	protected static final String PROPERTY_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPropertyName() <em>Property Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyName()
	 * @generated
	 * @ordered
	 */
	protected String propertyName = PROPERTY_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getReadonly() <em>Readonly</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadonly()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean READONLY_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getReadonly() <em>Readonly</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadonly()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean readonly = READONLY_EDEFAULT;

	/**
	 * This is true if the Readonly attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean readonlyESet;

	/**
	 * The default value of the '{@link #getSelected() <em>Selected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelected()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean SELECTED_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getSelected() <em>Selected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelected()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean selected = SELECTED_EDEFAULT;

	/**
	 * This is true if the Selected attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean selectedESet;

	/**
	 * The default value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected BigInteger size = SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected static final States STATE_EDEFAULT = States.UNCHECKED;

	/**
	 * The cached value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected States state = STATE_EDEFAULT;

	/**
	 * This is true if the State attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean stateESet;

	/**
	 * The default value of the '{@link #getStepSize() <em>Step Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStepSize()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger STEP_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStepSize() <em>Step Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStepSize()
	 * @generated
	 * @ordered
	 */
	protected BigInteger stepSize = STEP_SIZE_EDEFAULT;

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
	 * The default value of the '{@link #getTabIndex() <em>Tab Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTabIndex()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger TAB_INDEX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTabIndex() <em>Tab Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTabIndex()
	 * @generated
	 * @ordered
	 */
	protected BigInteger tabIndex = TAB_INDEX_EDEFAULT;

	/**
	 * The default value of the '{@link #getTabStop() <em>Tab Stop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTabStop()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean TAB_STOP_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getTabStop() <em>Tab Stop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTabStop()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean tabStop = TAB_STOP_EDEFAULT;

	/**
	 * This is true if the Tab Stop attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean tabStopESet;

	/**
	 * The default value of the '{@link #getTextStyleName() <em>Text Style Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextStyleName()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT_STYLE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTextStyleName() <em>Text Style Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextStyleName()
	 * @generated
	 * @ordered
	 */
	protected String textStyleName = TEXT_STYLE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final Object TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected Object title = TITLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getToggle() <em>Toggle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToggle()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean TOGGLE_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getToggle() <em>Toggle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToggle()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean toggle = TOGGLE_EDEFAULT;

	/**
	 * This is true if the Toggle attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean toggleESet;

	/**
	 * The default value of the '{@link #getValidation() <em>Validation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidation()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean VALIDATION_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getValidation() <em>Validation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidation()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean validation = VALIDATION_EDEFAULT;

	/**
	 * This is true if the Validation attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean validationESet;

	/**
	 * The default value of the '{@link #getVisualEffect() <em>Visual Effect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisualEffect()
	 * @generated
	 * @ordered
	 */
	protected static final VisualEffectType VISUAL_EFFECT_EDEFAULT = VisualEffectType.FLAT;

	/**
	 * The cached value of the '{@link #getVisualEffect() <em>Visual Effect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisualEffect()
	 * @generated
	 * @ordered
	 */
	protected VisualEffectType visualEffect = VISUAL_EFFECT_EDEFAULT;

	/**
	 * This is true if the Visual Effect attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean visualEffectESet;

	/**
	 * The default value of the '{@link #getXformsListSource() <em>Xforms List Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXformsListSource()
	 * @generated
	 * @ordered
	 */
	protected static final String XFORMS_LIST_SOURCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getXformsListSource() <em>Xforms List Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXformsListSource()
	 * @generated
	 * @ordered
	 */
	protected String xformsListSource = XFORMS_LIST_SOURCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getXformsSubmission() <em>Xforms Submission</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXformsSubmission()
	 * @generated
	 * @ordered
	 */
	protected static final String XFORMS_SUBMISSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getXformsSubmission() <em>Xforms Submission</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXformsSubmission()
	 * @generated
	 * @ordered
	 */
	protected String xformsSubmission = XFORMS_SUBMISSION_EDEFAULT;

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
		return FormPackage.eINSTANCE.getDocumentRoot();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, FormPackage.DOCUMENT_ROOT__MIXED);
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
			xMLNSPrefixMap = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, FormPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
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
			xSISchemaLocation = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, FormPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		}
		return xSISchemaLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ButtonType getButton() {
		return (ButtonType)getMixed().get(FormPackage.eINSTANCE.getDocumentRoot_Button(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetButton(ButtonType newButton, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FormPackage.eINSTANCE.getDocumentRoot_Button(), newButton, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setButton(ButtonType newButton) {
		((FeatureMap.Internal)getMixed()).set(FormPackage.eINSTANCE.getDocumentRoot_Button(), newButton);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CheckboxType getCheckbox() {
		return (CheckboxType)getMixed().get(FormPackage.eINSTANCE.getDocumentRoot_Checkbox(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCheckbox(CheckboxType newCheckbox, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FormPackage.eINSTANCE.getDocumentRoot_Checkbox(), newCheckbox, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCheckbox(CheckboxType newCheckbox) {
		((FeatureMap.Internal)getMixed()).set(FormPackage.eINSTANCE.getDocumentRoot_Checkbox(), newCheckbox);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColumnType getColumn() {
		return (ColumnType)getMixed().get(FormPackage.eINSTANCE.getDocumentRoot_Column(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetColumn(ColumnType newColumn, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FormPackage.eINSTANCE.getDocumentRoot_Column(), newColumn, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColumn(ColumnType newColumn) {
		((FeatureMap.Internal)getMixed()).set(FormPackage.eINSTANCE.getDocumentRoot_Column(), newColumn);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComboboxType getCombobox() {
		return (ComboboxType)getMixed().get(FormPackage.eINSTANCE.getDocumentRoot_Combobox(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCombobox(ComboboxType newCombobox, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FormPackage.eINSTANCE.getDocumentRoot_Combobox(), newCombobox, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCombobox(ComboboxType newCombobox) {
		((FeatureMap.Internal)getMixed()).set(FormPackage.eINSTANCE.getDocumentRoot_Combobox(), newCombobox);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionResourceType getConnectionResource() {
		return (ConnectionResourceType)getMixed().get(FormPackage.eINSTANCE.getDocumentRoot_ConnectionResource(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConnectionResource(ConnectionResourceType newConnectionResource, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FormPackage.eINSTANCE.getDocumentRoot_ConnectionResource(), newConnectionResource, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnectionResource(ConnectionResourceType newConnectionResource) {
		((FeatureMap.Internal)getMixed()).set(FormPackage.eINSTANCE.getDocumentRoot_ConnectionResource(), newConnectionResource);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateType getDate() {
		return (DateType)getMixed().get(FormPackage.eINSTANCE.getDocumentRoot_Date(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDate(DateType newDate, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FormPackage.eINSTANCE.getDocumentRoot_Date(), newDate, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDate(DateType newDate) {
		((FeatureMap.Internal)getMixed()).set(FormPackage.eINSTANCE.getDocumentRoot_Date(), newDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileType getFile() {
		return (FileType)getMixed().get(FormPackage.eINSTANCE.getDocumentRoot_File(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFile(FileType newFile, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FormPackage.eINSTANCE.getDocumentRoot_File(), newFile, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFile(FileType newFile) {
		((FeatureMap.Internal)getMixed()).set(FormPackage.eINSTANCE.getDocumentRoot_File(), newFile);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FixedTextType getFixedText() {
		return (FixedTextType)getMixed().get(FormPackage.eINSTANCE.getDocumentRoot_FixedText(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFixedText(FixedTextType newFixedText, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FormPackage.eINSTANCE.getDocumentRoot_FixedText(), newFixedText, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFixedText(FixedTextType newFixedText) {
		((FeatureMap.Internal)getMixed()).set(FormPackage.eINSTANCE.getDocumentRoot_FixedText(), newFixedText);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormType getForm() {
		return (FormType)getMixed().get(FormPackage.eINSTANCE.getDocumentRoot_Form(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetForm(FormType newForm, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FormPackage.eINSTANCE.getDocumentRoot_Form(), newForm, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setForm(FormType newForm) {
		((FeatureMap.Internal)getMixed()).set(FormPackage.eINSTANCE.getDocumentRoot_Form(), newForm);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormattedTextType getFormattedText() {
		return (FormattedTextType)getMixed().get(FormPackage.eINSTANCE.getDocumentRoot_FormattedText(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFormattedText(FormattedTextType newFormattedText, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FormPackage.eINSTANCE.getDocumentRoot_FormattedText(), newFormattedText, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFormattedText(FormattedTextType newFormattedText) {
		((FeatureMap.Internal)getMixed()).set(FormPackage.eINSTANCE.getDocumentRoot_FormattedText(), newFormattedText);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FrameType getFrame() {
		return (FrameType)getMixed().get(FormPackage.eINSTANCE.getDocumentRoot_Frame(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFrame(FrameType newFrame, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FormPackage.eINSTANCE.getDocumentRoot_Frame(), newFrame, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrame(FrameType newFrame) {
		((FeatureMap.Internal)getMixed()).set(FormPackage.eINSTANCE.getDocumentRoot_Frame(), newFrame);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenericControlType getGenericControl() {
		return (GenericControlType)getMixed().get(FormPackage.eINSTANCE.getDocumentRoot_GenericControl(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGenericControl(GenericControlType newGenericControl, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FormPackage.eINSTANCE.getDocumentRoot_GenericControl(), newGenericControl, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenericControl(GenericControlType newGenericControl) {
		((FeatureMap.Internal)getMixed()).set(FormPackage.eINSTANCE.getDocumentRoot_GenericControl(), newGenericControl);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GridType getGrid() {
		return (GridType)getMixed().get(FormPackage.eINSTANCE.getDocumentRoot_Grid(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGrid(GridType newGrid, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FormPackage.eINSTANCE.getDocumentRoot_Grid(), newGrid, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGrid(GridType newGrid) {
		((FeatureMap.Internal)getMixed()).set(FormPackage.eINSTANCE.getDocumentRoot_Grid(), newGrid);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HiddenType getHidden() {
		return (HiddenType)getMixed().get(FormPackage.eINSTANCE.getDocumentRoot_Hidden(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHidden(HiddenType newHidden, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FormPackage.eINSTANCE.getDocumentRoot_Hidden(), newHidden, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHidden(HiddenType newHidden) {
		((FeatureMap.Internal)getMixed()).set(FormPackage.eINSTANCE.getDocumentRoot_Hidden(), newHidden);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImageType getImage() {
		return (ImageType)getMixed().get(FormPackage.eINSTANCE.getDocumentRoot_Image(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImage(ImageType newImage, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FormPackage.eINSTANCE.getDocumentRoot_Image(), newImage, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImage(ImageType newImage) {
		((FeatureMap.Internal)getMixed()).set(FormPackage.eINSTANCE.getDocumentRoot_Image(), newImage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImageFrameType getImageFrame() {
		return (ImageFrameType)getMixed().get(FormPackage.eINSTANCE.getDocumentRoot_ImageFrame(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImageFrame(ImageFrameType newImageFrame, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FormPackage.eINSTANCE.getDocumentRoot_ImageFrame(), newImageFrame, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImageFrame(ImageFrameType newImageFrame) {
		((FeatureMap.Internal)getMixed()).set(FormPackage.eINSTANCE.getDocumentRoot_ImageFrame(), newImageFrame);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItemType getItem() {
		return (ItemType)getMixed().get(FormPackage.eINSTANCE.getDocumentRoot_Item(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetItem(ItemType newItem, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FormPackage.eINSTANCE.getDocumentRoot_Item(), newItem, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setItem(ItemType newItem) {
		((FeatureMap.Internal)getMixed()).set(FormPackage.eINSTANCE.getDocumentRoot_Item(), newItem);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListboxType getListbox() {
		return (ListboxType)getMixed().get(FormPackage.eINSTANCE.getDocumentRoot_Listbox(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListbox(ListboxType newListbox, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FormPackage.eINSTANCE.getDocumentRoot_Listbox(), newListbox, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListbox(ListboxType newListbox) {
		((FeatureMap.Internal)getMixed()).set(FormPackage.eINSTANCE.getDocumentRoot_Listbox(), newListbox);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListPropertyType getListProperty() {
		return (ListPropertyType)getMixed().get(FormPackage.eINSTANCE.getDocumentRoot_ListProperty(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListProperty(ListPropertyType newListProperty, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FormPackage.eINSTANCE.getDocumentRoot_ListProperty(), newListProperty, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListProperty(ListPropertyType newListProperty) {
		((FeatureMap.Internal)getMixed()).set(FormPackage.eINSTANCE.getDocumentRoot_ListProperty(), newListProperty);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumberType getNumber() {
		return (NumberType)getMixed().get(FormPackage.eINSTANCE.getDocumentRoot_Number(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNumber(NumberType newNumber, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FormPackage.eINSTANCE.getDocumentRoot_Number(), newNumber, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumber(NumberType newNumber) {
		((FeatureMap.Internal)getMixed()).set(FormPackage.eINSTANCE.getDocumentRoot_Number(), newNumber);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OptionType getOption() {
		return (OptionType)getMixed().get(FormPackage.eINSTANCE.getDocumentRoot_Option(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOption(OptionType newOption, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FormPackage.eINSTANCE.getDocumentRoot_Option(), newOption, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOption(OptionType newOption) {
		((FeatureMap.Internal)getMixed()).set(FormPackage.eINSTANCE.getDocumentRoot_Option(), newOption);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PasswordType getPassword() {
		return (PasswordType)getMixed().get(FormPackage.eINSTANCE.getDocumentRoot_Password(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPassword(PasswordType newPassword, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FormPackage.eINSTANCE.getDocumentRoot_Password(), newPassword, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassword(PasswordType newPassword) {
		((FeatureMap.Internal)getMixed()).set(FormPackage.eINSTANCE.getDocumentRoot_Password(), newPassword);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertiesType getProperties() {
		return (PropertiesType)getMixed().get(FormPackage.eINSTANCE.getDocumentRoot_Properties(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProperties(PropertiesType newProperties, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FormPackage.eINSTANCE.getDocumentRoot_Properties(), newProperties, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProperties(PropertiesType newProperties) {
		((FeatureMap.Internal)getMixed()).set(FormPackage.eINSTANCE.getDocumentRoot_Properties(), newProperties);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyType getProperty() {
		return (PropertyType)getMixed().get(FormPackage.eINSTANCE.getDocumentRoot_Property(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProperty(PropertyType newProperty, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FormPackage.eINSTANCE.getDocumentRoot_Property(), newProperty, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProperty(PropertyType newProperty) {
		((FeatureMap.Internal)getMixed()).set(FormPackage.eINSTANCE.getDocumentRoot_Property(), newProperty);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RadioType getRadio() {
		return (RadioType)getMixed().get(FormPackage.eINSTANCE.getDocumentRoot_Radio(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRadio(RadioType newRadio, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FormPackage.eINSTANCE.getDocumentRoot_Radio(), newRadio, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRadio(RadioType newRadio) {
		((FeatureMap.Internal)getMixed()).set(FormPackage.eINSTANCE.getDocumentRoot_Radio(), newRadio);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextType getText() {
		return (TextType)getMixed().get(FormPackage.eINSTANCE.getDocumentRoot_Text(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetText(TextType newText, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FormPackage.eINSTANCE.getDocumentRoot_Text(), newText, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setText(TextType newText) {
		((FeatureMap.Internal)getMixed()).set(FormPackage.eINSTANCE.getDocumentRoot_Text(), newText);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextareaType getTextarea() {
		return (TextareaType)getMixed().get(FormPackage.eINSTANCE.getDocumentRoot_Textarea(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTextarea(TextareaType newTextarea, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FormPackage.eINSTANCE.getDocumentRoot_Textarea(), newTextarea, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextarea(TextareaType newTextarea) {
		((FeatureMap.Internal)getMixed()).set(FormPackage.eINSTANCE.getDocumentRoot_Textarea(), newTextarea);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeType getTime() {
		return (TimeType)getMixed().get(FormPackage.eINSTANCE.getDocumentRoot_Time(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTime(TimeType newTime, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FormPackage.eINSTANCE.getDocumentRoot_Time(), newTime, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTime(TimeType newTime) {
		((FeatureMap.Internal)getMixed()).set(FormPackage.eINSTANCE.getDocumentRoot_Time(), newTime);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueRangeType getValueRange() {
		return (ValueRangeType)getMixed().get(FormPackage.eINSTANCE.getDocumentRoot_ValueRange(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueRange(ValueRangeType newValueRange, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FormPackage.eINSTANCE.getDocumentRoot_ValueRange(), newValueRange, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueRange(ValueRangeType newValueRange) {
		((FeatureMap.Internal)getMixed()).set(FormPackage.eINSTANCE.getDocumentRoot_ValueRange(), newValueRange);
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
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.DOCUMENT_ROOT__ALLOW_DELETES, oldAllowDeletes, allowDeletes, !oldAllowDeletesESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, FormPackage.DOCUMENT_ROOT__ALLOW_DELETES, oldAllowDeletes, ALLOW_DELETES_EDEFAULT, oldAllowDeletesESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.DOCUMENT_ROOT__ALLOW_INSERTS, oldAllowInserts, allowInserts, !oldAllowInsertsESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, FormPackage.DOCUMENT_ROOT__ALLOW_INSERTS, oldAllowInserts, ALLOW_INSERTS_EDEFAULT, oldAllowInsertsESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.DOCUMENT_ROOT__ALLOW_UPDATES, oldAllowUpdates, allowUpdates, !oldAllowUpdatesESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, FormPackage.DOCUMENT_ROOT__ALLOW_UPDATES, oldAllowUpdates, ALLOW_UPDATES_EDEFAULT, oldAllowUpdatesESet));
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
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getApplyDesignMode() {
		return applyDesignMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApplyDesignMode(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newApplyDesignMode) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldApplyDesignMode = applyDesignMode;
		applyDesignMode = newApplyDesignMode == null ? APPLY_DESIGN_MODE_EDEFAULT : newApplyDesignMode;
		boolean oldApplyDesignModeESet = applyDesignModeESet;
		applyDesignModeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.DOCUMENT_ROOT__APPLY_DESIGN_MODE, oldApplyDesignMode, applyDesignMode, !oldApplyDesignModeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetApplyDesignMode() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldApplyDesignMode = applyDesignMode;
		boolean oldApplyDesignModeESet = applyDesignModeESet;
		applyDesignMode = APPLY_DESIGN_MODE_EDEFAULT;
		applyDesignModeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, FormPackage.DOCUMENT_ROOT__APPLY_DESIGN_MODE, oldApplyDesignMode, APPLY_DESIGN_MODE_EDEFAULT, oldApplyDesignModeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetApplyDesignMode() {
		return applyDesignModeESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.DOCUMENT_ROOT__APPLY_FILTER, oldApplyFilter, applyFilter, !oldApplyFilterESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, FormPackage.DOCUMENT_ROOT__APPLY_FILTER, oldApplyFilter, APPLY_FILTER_EDEFAULT, oldApplyFilterESet));
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
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getAutoComplete() {
		return autoComplete;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAutoComplete(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newAutoComplete) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldAutoComplete = autoComplete;
		autoComplete = newAutoComplete == null ? AUTO_COMPLETE_EDEFAULT : newAutoComplete;
		boolean oldAutoCompleteESet = autoCompleteESet;
		autoCompleteESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.DOCUMENT_ROOT__AUTO_COMPLETE, oldAutoComplete, autoComplete, !oldAutoCompleteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAutoComplete() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldAutoComplete = autoComplete;
		boolean oldAutoCompleteESet = autoCompleteESet;
		autoComplete = AUTO_COMPLETE_EDEFAULT;
		autoCompleteESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, FormPackage.DOCUMENT_ROOT__AUTO_COMPLETE, oldAutoComplete, AUTO_COMPLETE_EDEFAULT, oldAutoCompleteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAutoComplete() {
		return autoCompleteESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getAutomaticFocus() {
		return automaticFocus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAutomaticFocus(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newAutomaticFocus) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldAutomaticFocus = automaticFocus;
		automaticFocus = newAutomaticFocus == null ? AUTOMATIC_FOCUS_EDEFAULT : newAutomaticFocus;
		boolean oldAutomaticFocusESet = automaticFocusESet;
		automaticFocusESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.DOCUMENT_ROOT__AUTOMATIC_FOCUS, oldAutomaticFocus, automaticFocus, !oldAutomaticFocusESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAutomaticFocus() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldAutomaticFocus = automaticFocus;
		boolean oldAutomaticFocusESet = automaticFocusESet;
		automaticFocus = AUTOMATIC_FOCUS_EDEFAULT;
		automaticFocusESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, FormPackage.DOCUMENT_ROOT__AUTOMATIC_FOCUS, oldAutomaticFocus, AUTOMATIC_FOCUS_EDEFAULT, oldAutomaticFocusESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAutomaticFocus() {
		return automaticFocusESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBoundColumn() {
		return boundColumn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBoundColumn(String newBoundColumn) {
		String oldBoundColumn = boundColumn;
		boundColumn = newBoundColumn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.DOCUMENT_ROOT__BOUND_COLUMN, oldBoundColumn, boundColumn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Types getButtonType() {
		return buttonType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setButtonType(Types newButtonType) {
		Types oldButtonType = buttonType;
		buttonType = newButtonType == null ? BUTTON_TYPE_EDEFAULT : newButtonType;
		boolean oldButtonTypeESet = buttonTypeESet;
		buttonTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.DOCUMENT_ROOT__BUTTON_TYPE, oldButtonType, buttonType, !oldButtonTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetButtonType() {
		Types oldButtonType = buttonType;
		boolean oldButtonTypeESet = buttonTypeESet;
		buttonType = BUTTON_TYPE_EDEFAULT;
		buttonTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, FormPackage.DOCUMENT_ROOT__BUTTON_TYPE, oldButtonType, BUTTON_TYPE_EDEFAULT, oldButtonTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetButtonType() {
		return buttonTypeESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.DOCUMENT_ROOT__COMMAND, oldCommand, command));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.DOCUMENT_ROOT__COMMAND_TYPE, oldCommandType, commandType, !oldCommandTypeESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, FormPackage.DOCUMENT_ROOT__COMMAND_TYPE, oldCommandType, COMMAND_TYPE_EDEFAULT, oldCommandTypeESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.DOCUMENT_ROOT__CONTROL_IMPLEMENTATION, oldControlImplementation, controlImplementation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getConvertEmptyToNull() {
		return convertEmptyToNull;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConvertEmptyToNull(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newConvertEmptyToNull) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldConvertEmptyToNull = convertEmptyToNull;
		convertEmptyToNull = newConvertEmptyToNull == null ? CONVERT_EMPTY_TO_NULL_EDEFAULT : newConvertEmptyToNull;
		boolean oldConvertEmptyToNullESet = convertEmptyToNullESet;
		convertEmptyToNullESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.DOCUMENT_ROOT__CONVERT_EMPTY_TO_NULL, oldConvertEmptyToNull, convertEmptyToNull, !oldConvertEmptyToNullESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetConvertEmptyToNull() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldConvertEmptyToNull = convertEmptyToNull;
		boolean oldConvertEmptyToNullESet = convertEmptyToNullESet;
		convertEmptyToNull = CONVERT_EMPTY_TO_NULL_EDEFAULT;
		convertEmptyToNullESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, FormPackage.DOCUMENT_ROOT__CONVERT_EMPTY_TO_NULL, oldConvertEmptyToNull, CONVERT_EMPTY_TO_NULL_EDEFAULT, oldConvertEmptyToNullESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetConvertEmptyToNull() {
		return convertEmptyToNullESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getCurrentSelected() {
		return currentSelected;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrentSelected(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newCurrentSelected) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldCurrentSelected = currentSelected;
		currentSelected = newCurrentSelected == null ? CURRENT_SELECTED_EDEFAULT : newCurrentSelected;
		boolean oldCurrentSelectedESet = currentSelectedESet;
		currentSelectedESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.DOCUMENT_ROOT__CURRENT_SELECTED, oldCurrentSelected, currentSelected, !oldCurrentSelectedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCurrentSelected() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldCurrentSelected = currentSelected;
		boolean oldCurrentSelectedESet = currentSelectedESet;
		currentSelected = CURRENT_SELECTED_EDEFAULT;
		currentSelectedESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, FormPackage.DOCUMENT_ROOT__CURRENT_SELECTED, oldCurrentSelected, CURRENT_SELECTED_EDEFAULT, oldCurrentSelectedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCurrentSelected() {
		return currentSelectedESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public States getCurrentState() {
		return currentState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrentState(States newCurrentState) {
		States oldCurrentState = currentState;
		currentState = newCurrentState == null ? CURRENT_STATE_EDEFAULT : newCurrentState;
		boolean oldCurrentStateESet = currentStateESet;
		currentStateESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.DOCUMENT_ROOT__CURRENT_STATE, oldCurrentState, currentState, !oldCurrentStateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCurrentState() {
		States oldCurrentState = currentState;
		boolean oldCurrentStateESet = currentStateESet;
		currentState = CURRENT_STATE_EDEFAULT;
		currentStateESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, FormPackage.DOCUMENT_ROOT__CURRENT_STATE, oldCurrentState, CURRENT_STATE_EDEFAULT, oldCurrentStateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCurrentState() {
		return currentStateESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.DOCUMENT_ROOT__DATA_FIELD, oldDataField, dataField));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.DOCUMENT_ROOT__DATASOURCE, oldDatasource, datasource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getDefaultButton() {
		return defaultButton;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultButton(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newDefaultButton) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldDefaultButton = defaultButton;
		defaultButton = newDefaultButton == null ? DEFAULT_BUTTON_EDEFAULT : newDefaultButton;
		boolean oldDefaultButtonESet = defaultButtonESet;
		defaultButtonESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.DOCUMENT_ROOT__DEFAULT_BUTTON, oldDefaultButton, defaultButton, !oldDefaultButtonESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDefaultButton() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldDefaultButton = defaultButton;
		boolean oldDefaultButtonESet = defaultButtonESet;
		defaultButton = DEFAULT_BUTTON_EDEFAULT;
		defaultButtonESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, FormPackage.DOCUMENT_ROOT__DEFAULT_BUTTON, oldDefaultButton, DEFAULT_BUTTON_EDEFAULT, oldDefaultButtonESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDefaultButton() {
		return defaultButtonESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Duration getDelayForRepeat() {
		return delayForRepeat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDelayForRepeat(Duration newDelayForRepeat) {
		Duration oldDelayForRepeat = delayForRepeat;
		delayForRepeat = newDelayForRepeat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.DOCUMENT_ROOT__DELAY_FOR_REPEAT, oldDelayForRepeat, delayForRepeat));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.DOCUMENT_ROOT__DETAIL_FIELDS, oldDetailFields, detailFields));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getDisabled() {
		return disabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisabled(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newDisabled) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldDisabled = disabled;
		disabled = newDisabled == null ? DISABLED_EDEFAULT : newDisabled;
		boolean oldDisabledESet = disabledESet;
		disabledESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.DOCUMENT_ROOT__DISABLED, oldDisabled, disabled, !oldDisabledESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDisabled() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldDisabled = disabled;
		boolean oldDisabledESet = disabledESet;
		disabled = DISABLED_EDEFAULT;
		disabledESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, FormPackage.DOCUMENT_ROOT__DISABLED, oldDisabled, DISABLED_EDEFAULT, oldDisabledESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDisabled() {
		return disabledESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getDropdown() {
		return dropdown;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDropdown(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newDropdown) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldDropdown = dropdown;
		dropdown = newDropdown == null ? DROPDOWN_EDEFAULT : newDropdown;
		boolean oldDropdownESet = dropdownESet;
		dropdownESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.DOCUMENT_ROOT__DROPDOWN, oldDropdown, dropdown, !oldDropdownESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDropdown() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldDropdown = dropdown;
		boolean oldDropdownESet = dropdownESet;
		dropdown = DROPDOWN_EDEFAULT;
		dropdownESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, FormPackage.DOCUMENT_ROOT__DROPDOWN, oldDropdown, DROPDOWN_EDEFAULT, oldDropdownESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDropdown() {
		return dropdownESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEchoChar() {
		return echoChar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEchoChar(String newEchoChar) {
		String oldEchoChar = echoChar;
		echoChar = newEchoChar;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.DOCUMENT_ROOT__ECHO_CHAR, oldEchoChar, echoChar));
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
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.DOCUMENT_ROOT__ENCTYPE, oldEnctype, enctype));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.DOCUMENT_ROOT__ESCAPE_PROCESSING, oldEscapeProcessing, escapeProcessing, !oldEscapeProcessingESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, FormPackage.DOCUMENT_ROOT__ESCAPE_PROCESSING, oldEscapeProcessing, ESCAPE_PROCESSING_EDEFAULT, oldEscapeProcessingESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.DOCUMENT_ROOT__FILTER, oldFilter, filter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getFocusOnClick() {
		return focusOnClick;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFocusOnClick(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newFocusOnClick) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldFocusOnClick = focusOnClick;
		focusOnClick = newFocusOnClick == null ? FOCUS_ON_CLICK_EDEFAULT : newFocusOnClick;
		boolean oldFocusOnClickESet = focusOnClickESet;
		focusOnClickESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.DOCUMENT_ROOT__FOCUS_ON_CLICK, oldFocusOnClick, focusOnClick, !oldFocusOnClickESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFocusOnClick() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldFocusOnClick = focusOnClick;
		boolean oldFocusOnClickESet = focusOnClickESet;
		focusOnClick = FOCUS_ON_CLICK_EDEFAULT;
		focusOnClickESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, FormPackage.DOCUMENT_ROOT__FOCUS_ON_CLICK, oldFocusOnClick, FOCUS_ON_CLICK_EDEFAULT, oldFocusOnClickESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFocusOnClick() {
		return focusOnClickESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFor() {
		return for_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFor(String newFor) {
		String oldFor = for_;
		for_ = newFor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.DOCUMENT_ROOT__FOR, oldFor, for_));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.DOCUMENT_ROOT__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.DOCUMENT_ROOT__IGNORE_RESULT, oldIgnoreResult, ignoreResult, !oldIgnoreResultESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, FormPackage.DOCUMENT_ROOT__IGNORE_RESULT, oldIgnoreResult, IGNORE_RESULT_EDEFAULT, oldIgnoreResultESet));
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
	public ImageAlignType getImageAlign() {
		return imageAlign;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImageAlign(ImageAlignType newImageAlign) {
		ImageAlignType oldImageAlign = imageAlign;
		imageAlign = newImageAlign == null ? IMAGE_ALIGN_EDEFAULT : newImageAlign;
		boolean oldImageAlignESet = imageAlignESet;
		imageAlignESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.DOCUMENT_ROOT__IMAGE_ALIGN, oldImageAlign, imageAlign, !oldImageAlignESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetImageAlign() {
		ImageAlignType oldImageAlign = imageAlign;
		boolean oldImageAlignESet = imageAlignESet;
		imageAlign = IMAGE_ALIGN_EDEFAULT;
		imageAlignESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, FormPackage.DOCUMENT_ROOT__IMAGE_ALIGN, oldImageAlign, IMAGE_ALIGN_EDEFAULT, oldImageAlignESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetImageAlign() {
		return imageAlignESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getImageData() {
		return imageData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImageData(String newImageData) {
		String oldImageData = imageData;
		imageData = newImageData;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.DOCUMENT_ROOT__IMAGE_DATA, oldImageData, imageData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImagePositionType getImagePosition() {
		return imagePosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImagePosition(ImagePositionType newImagePosition) {
		ImagePositionType oldImagePosition = imagePosition;
		imagePosition = newImagePosition == null ? IMAGE_POSITION_EDEFAULT : newImagePosition;
		boolean oldImagePositionESet = imagePositionESet;
		imagePositionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.DOCUMENT_ROOT__IMAGE_POSITION, oldImagePosition, imagePosition, !oldImagePositionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetImagePosition() {
		ImagePositionType oldImagePosition = imagePosition;
		boolean oldImagePositionESet = imagePositionESet;
		imagePosition = IMAGE_POSITION_EDEFAULT;
		imagePositionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, FormPackage.DOCUMENT_ROOT__IMAGE_POSITION, oldImagePosition, IMAGE_POSITION_EDEFAULT, oldImagePositionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetImagePosition() {
		return imagePositionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getIsTristate() {
		return isTristate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsTristate(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newIsTristate) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldIsTristate = isTristate;
		isTristate = newIsTristate == null ? IS_TRISTATE_EDEFAULT : newIsTristate;
		boolean oldIsTristateESet = isTristateESet;
		isTristateESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.DOCUMENT_ROOT__IS_TRISTATE, oldIsTristate, isTristate, !oldIsTristateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIsTristate() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldIsTristate = isTristate;
		boolean oldIsTristateESet = isTristateESet;
		isTristate = IS_TRISTATE_EDEFAULT;
		isTristateESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, FormPackage.DOCUMENT_ROOT__IS_TRISTATE, oldIsTristate, IS_TRISTATE_EDEFAULT, oldIsTristateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIsTristate() {
		return isTristateESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLabel() {
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel(String newLabel) {
		String oldLabel = label;
		label = newLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.DOCUMENT_ROOT__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getListSource() {
		return listSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListSource(String newListSource) {
		String oldListSource = listSource;
		listSource = newListSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.DOCUMENT_ROOT__LIST_SOURCE, oldListSource, listSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListSourceTypeType getListSourceType() {
		return listSourceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListSourceType(ListSourceTypeType newListSourceType) {
		ListSourceTypeType oldListSourceType = listSourceType;
		listSourceType = newListSourceType == null ? LIST_SOURCE_TYPE_EDEFAULT : newListSourceType;
		boolean oldListSourceTypeESet = listSourceTypeESet;
		listSourceTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.DOCUMENT_ROOT__LIST_SOURCE_TYPE, oldListSourceType, listSourceType, !oldListSourceTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetListSourceType() {
		ListSourceTypeType oldListSourceType = listSourceType;
		boolean oldListSourceTypeESet = listSourceTypeESet;
		listSourceType = LIST_SOURCE_TYPE_EDEFAULT;
		listSourceTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, FormPackage.DOCUMENT_ROOT__LIST_SOURCE_TYPE, oldListSourceType, LIST_SOURCE_TYPE_EDEFAULT, oldListSourceTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetListSourceType() {
		return listSourceTypeESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.DOCUMENT_ROOT__MASTER_FIELDS, oldMasterFields, masterFields));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getMaxLength() {
		return maxLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxLength(BigInteger newMaxLength) {
		BigInteger oldMaxLength = maxLength;
		maxLength = newMaxLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.DOCUMENT_ROOT__MAX_LENGTH, oldMaxLength, maxLength));
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
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.DOCUMENT_ROOT__METHOD, oldMethod, method));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getMultiLine() {
		return multiLine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultiLine(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newMultiLine) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldMultiLine = multiLine;
		multiLine = newMultiLine == null ? MULTI_LINE_EDEFAULT : newMultiLine;
		boolean oldMultiLineESet = multiLineESet;
		multiLineESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.DOCUMENT_ROOT__MULTI_LINE, oldMultiLine, multiLine, !oldMultiLineESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMultiLine() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldMultiLine = multiLine;
		boolean oldMultiLineESet = multiLineESet;
		multiLine = MULTI_LINE_EDEFAULT;
		multiLineESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, FormPackage.DOCUMENT_ROOT__MULTI_LINE, oldMultiLine, MULTI_LINE_EDEFAULT, oldMultiLineESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMultiLine() {
		return multiLineESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getMultiple() {
		return multiple;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultiple(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newMultiple) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldMultiple = multiple;
		multiple = newMultiple == null ? MULTIPLE_EDEFAULT : newMultiple;
		boolean oldMultipleESet = multipleESet;
		multipleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.DOCUMENT_ROOT__MULTIPLE, oldMultiple, multiple, !oldMultipleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMultiple() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldMultiple = multiple;
		boolean oldMultipleESet = multipleESet;
		multiple = MULTIPLE_EDEFAULT;
		multipleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, FormPackage.DOCUMENT_ROOT__MULTIPLE, oldMultiple, MULTIPLE_EDEFAULT, oldMultipleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMultiple() {
		return multipleESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.DOCUMENT_ROOT__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.DOCUMENT_ROOT__NAVIGATION_MODE, oldNavigationMode, navigationMode, !oldNavigationModeESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, FormPackage.DOCUMENT_ROOT__NAVIGATION_MODE, oldNavigationMode, NAVIGATION_MODE_EDEFAULT, oldNavigationModeESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.DOCUMENT_ROOT__ORDER, oldOrder, order));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrientationType getOrientation() {
		return orientation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrientation(OrientationType newOrientation) {
		OrientationType oldOrientation = orientation;
		orientation = newOrientation == null ? ORIENTATION_EDEFAULT : newOrientation;
		boolean oldOrientationESet = orientationESet;
		orientationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.DOCUMENT_ROOT__ORIENTATION, oldOrientation, orientation, !oldOrientationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetOrientation() {
		OrientationType oldOrientation = orientation;
		boolean oldOrientationESet = orientationESet;
		orientation = ORIENTATION_EDEFAULT;
		orientationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, FormPackage.DOCUMENT_ROOT__ORIENTATION, oldOrientation, ORIENTATION_EDEFAULT, oldOrientationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOrientation() {
		return orientationESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getPageStepSize() {
		return pageStepSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPageStepSize(BigInteger newPageStepSize) {
		BigInteger oldPageStepSize = pageStepSize;
		pageStepSize = newPageStepSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.DOCUMENT_ROOT__PAGE_STEP_SIZE, oldPageStepSize, pageStepSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getPrintable() {
		return printable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrintable(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newPrintable) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldPrintable = printable;
		printable = newPrintable == null ? PRINTABLE_EDEFAULT : newPrintable;
		boolean oldPrintableESet = printableESet;
		printableESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.DOCUMENT_ROOT__PRINTABLE, oldPrintable, printable, !oldPrintableESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPrintable() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldPrintable = printable;
		boolean oldPrintableESet = printableESet;
		printable = PRINTABLE_EDEFAULT;
		printableESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, FormPackage.DOCUMENT_ROOT__PRINTABLE, oldPrintable, PRINTABLE_EDEFAULT, oldPrintableESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPrintable() {
		return printableESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPropertyName() {
		return propertyName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPropertyName(String newPropertyName) {
		String oldPropertyName = propertyName;
		propertyName = newPropertyName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.DOCUMENT_ROOT__PROPERTY_NAME, oldPropertyName, propertyName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getReadonly() {
		return readonly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReadonly(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newReadonly) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldReadonly = readonly;
		readonly = newReadonly == null ? READONLY_EDEFAULT : newReadonly;
		boolean oldReadonlyESet = readonlyESet;
		readonlyESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.DOCUMENT_ROOT__READONLY, oldReadonly, readonly, !oldReadonlyESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetReadonly() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldReadonly = readonly;
		boolean oldReadonlyESet = readonlyESet;
		readonly = READONLY_EDEFAULT;
		readonlyESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, FormPackage.DOCUMENT_ROOT__READONLY, oldReadonly, READONLY_EDEFAULT, oldReadonlyESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetReadonly() {
		return readonlyESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getSelected() {
		return selected;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelected(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newSelected) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldSelected = selected;
		selected = newSelected == null ? SELECTED_EDEFAULT : newSelected;
		boolean oldSelectedESet = selectedESet;
		selectedESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.DOCUMENT_ROOT__SELECTED, oldSelected, selected, !oldSelectedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSelected() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldSelected = selected;
		boolean oldSelectedESet = selectedESet;
		selected = SELECTED_EDEFAULT;
		selectedESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, FormPackage.DOCUMENT_ROOT__SELECTED, oldSelected, SELECTED_EDEFAULT, oldSelectedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSelected() {
		return selectedESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getSize() {
		return size;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSize(BigInteger newSize) {
		BigInteger oldSize = size;
		size = newSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.DOCUMENT_ROOT__SIZE, oldSize, size));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public States getState() {
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setState(States newState) {
		States oldState = state;
		state = newState == null ? STATE_EDEFAULT : newState;
		boolean oldStateESet = stateESet;
		stateESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.DOCUMENT_ROOT__STATE, oldState, state, !oldStateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetState() {
		States oldState = state;
		boolean oldStateESet = stateESet;
		state = STATE_EDEFAULT;
		stateESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, FormPackage.DOCUMENT_ROOT__STATE, oldState, STATE_EDEFAULT, oldStateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetState() {
		return stateESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getStepSize() {
		return stepSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStepSize(BigInteger newStepSize) {
		BigInteger oldStepSize = stepSize;
		stepSize = newStepSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.DOCUMENT_ROOT__STEP_SIZE, oldStepSize, stepSize));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.DOCUMENT_ROOT__TAB_CYCLE, oldTabCycle, tabCycle, !oldTabCycleESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, FormPackage.DOCUMENT_ROOT__TAB_CYCLE, oldTabCycle, TAB_CYCLE_EDEFAULT, oldTabCycleESet));
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
	public BigInteger getTabIndex() {
		return tabIndex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTabIndex(BigInteger newTabIndex) {
		BigInteger oldTabIndex = tabIndex;
		tabIndex = newTabIndex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.DOCUMENT_ROOT__TAB_INDEX, oldTabIndex, tabIndex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getTabStop() {
		return tabStop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTabStop(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newTabStop) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldTabStop = tabStop;
		tabStop = newTabStop == null ? TAB_STOP_EDEFAULT : newTabStop;
		boolean oldTabStopESet = tabStopESet;
		tabStopESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.DOCUMENT_ROOT__TAB_STOP, oldTabStop, tabStop, !oldTabStopESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTabStop() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldTabStop = tabStop;
		boolean oldTabStopESet = tabStopESet;
		tabStop = TAB_STOP_EDEFAULT;
		tabStopESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, FormPackage.DOCUMENT_ROOT__TAB_STOP, oldTabStop, TAB_STOP_EDEFAULT, oldTabStopESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTabStop() {
		return tabStopESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTextStyleName() {
		return textStyleName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextStyleName(String newTextStyleName) {
		String oldTextStyleName = textStyleName;
		textStyleName = newTextStyleName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.DOCUMENT_ROOT__TEXT_STYLE_NAME, oldTextStyleName, textStyleName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(Object newTitle) {
		Object oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.DOCUMENT_ROOT__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getToggle() {
		return toggle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToggle(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newToggle) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldToggle = toggle;
		toggle = newToggle == null ? TOGGLE_EDEFAULT : newToggle;
		boolean oldToggleESet = toggleESet;
		toggleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.DOCUMENT_ROOT__TOGGLE, oldToggle, toggle, !oldToggleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetToggle() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldToggle = toggle;
		boolean oldToggleESet = toggleESet;
		toggle = TOGGLE_EDEFAULT;
		toggleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, FormPackage.DOCUMENT_ROOT__TOGGLE, oldToggle, TOGGLE_EDEFAULT, oldToggleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetToggle() {
		return toggleESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getValidation() {
		return validation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValidation(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newValidation) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldValidation = validation;
		validation = newValidation == null ? VALIDATION_EDEFAULT : newValidation;
		boolean oldValidationESet = validationESet;
		validationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.DOCUMENT_ROOT__VALIDATION, oldValidation, validation, !oldValidationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetValidation() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldValidation = validation;
		boolean oldValidationESet = validationESet;
		validation = VALIDATION_EDEFAULT;
		validationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, FormPackage.DOCUMENT_ROOT__VALIDATION, oldValidation, VALIDATION_EDEFAULT, oldValidationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetValidation() {
		return validationESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisualEffectType getVisualEffect() {
		return visualEffect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisualEffect(VisualEffectType newVisualEffect) {
		VisualEffectType oldVisualEffect = visualEffect;
		visualEffect = newVisualEffect == null ? VISUAL_EFFECT_EDEFAULT : newVisualEffect;
		boolean oldVisualEffectESet = visualEffectESet;
		visualEffectESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.DOCUMENT_ROOT__VISUAL_EFFECT, oldVisualEffect, visualEffect, !oldVisualEffectESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetVisualEffect() {
		VisualEffectType oldVisualEffect = visualEffect;
		boolean oldVisualEffectESet = visualEffectESet;
		visualEffect = VISUAL_EFFECT_EDEFAULT;
		visualEffectESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, FormPackage.DOCUMENT_ROOT__VISUAL_EFFECT, oldVisualEffect, VISUAL_EFFECT_EDEFAULT, oldVisualEffectESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetVisualEffect() {
		return visualEffectESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getXformsListSource() {
		return xformsListSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXformsListSource(String newXformsListSource) {
		String oldXformsListSource = xformsListSource;
		xformsListSource = newXformsListSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.DOCUMENT_ROOT__XFORMS_LIST_SOURCE, oldXformsListSource, xformsListSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getXformsSubmission() {
		return xformsSubmission;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXformsSubmission(String newXformsSubmission) {
		String oldXformsSubmission = xformsSubmission;
		xformsSubmission = newXformsSubmission;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.DOCUMENT_ROOT__XFORMS_SUBMISSION, oldXformsSubmission, xformsSubmission));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FormPackage.DOCUMENT_ROOT__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case FormPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return ((InternalEList<?>)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
			case FormPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return ((InternalEList<?>)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
			case FormPackage.DOCUMENT_ROOT__BUTTON:
				return basicSetButton(null, msgs);
			case FormPackage.DOCUMENT_ROOT__CHECKBOX:
				return basicSetCheckbox(null, msgs);
			case FormPackage.DOCUMENT_ROOT__COLUMN:
				return basicSetColumn(null, msgs);
			case FormPackage.DOCUMENT_ROOT__COMBOBOX:
				return basicSetCombobox(null, msgs);
			case FormPackage.DOCUMENT_ROOT__CONNECTION_RESOURCE:
				return basicSetConnectionResource(null, msgs);
			case FormPackage.DOCUMENT_ROOT__DATE:
				return basicSetDate(null, msgs);
			case FormPackage.DOCUMENT_ROOT__FILE:
				return basicSetFile(null, msgs);
			case FormPackage.DOCUMENT_ROOT__FIXED_TEXT:
				return basicSetFixedText(null, msgs);
			case FormPackage.DOCUMENT_ROOT__FORM:
				return basicSetForm(null, msgs);
			case FormPackage.DOCUMENT_ROOT__FORMATTED_TEXT:
				return basicSetFormattedText(null, msgs);
			case FormPackage.DOCUMENT_ROOT__FRAME:
				return basicSetFrame(null, msgs);
			case FormPackage.DOCUMENT_ROOT__GENERIC_CONTROL:
				return basicSetGenericControl(null, msgs);
			case FormPackage.DOCUMENT_ROOT__GRID:
				return basicSetGrid(null, msgs);
			case FormPackage.DOCUMENT_ROOT__HIDDEN:
				return basicSetHidden(null, msgs);
			case FormPackage.DOCUMENT_ROOT__IMAGE:
				return basicSetImage(null, msgs);
			case FormPackage.DOCUMENT_ROOT__IMAGE_FRAME:
				return basicSetImageFrame(null, msgs);
			case FormPackage.DOCUMENT_ROOT__ITEM:
				return basicSetItem(null, msgs);
			case FormPackage.DOCUMENT_ROOT__LISTBOX:
				return basicSetListbox(null, msgs);
			case FormPackage.DOCUMENT_ROOT__LIST_PROPERTY:
				return basicSetListProperty(null, msgs);
			case FormPackage.DOCUMENT_ROOT__NUMBER:
				return basicSetNumber(null, msgs);
			case FormPackage.DOCUMENT_ROOT__OPTION:
				return basicSetOption(null, msgs);
			case FormPackage.DOCUMENT_ROOT__PASSWORD:
				return basicSetPassword(null, msgs);
			case FormPackage.DOCUMENT_ROOT__PROPERTIES:
				return basicSetProperties(null, msgs);
			case FormPackage.DOCUMENT_ROOT__PROPERTY:
				return basicSetProperty(null, msgs);
			case FormPackage.DOCUMENT_ROOT__RADIO:
				return basicSetRadio(null, msgs);
			case FormPackage.DOCUMENT_ROOT__TEXT:
				return basicSetText(null, msgs);
			case FormPackage.DOCUMENT_ROOT__TEXTAREA:
				return basicSetTextarea(null, msgs);
			case FormPackage.DOCUMENT_ROOT__TIME:
				return basicSetTime(null, msgs);
			case FormPackage.DOCUMENT_ROOT__VALUE_RANGE:
				return basicSetValueRange(null, msgs);
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
			case FormPackage.DOCUMENT_ROOT__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case FormPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				if (coreType) return getXMLNSPrefixMap();
				else return getXMLNSPrefixMap().map();
			case FormPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				if (coreType) return getXSISchemaLocation();
				else return getXSISchemaLocation().map();
			case FormPackage.DOCUMENT_ROOT__BUTTON:
				return getButton();
			case FormPackage.DOCUMENT_ROOT__CHECKBOX:
				return getCheckbox();
			case FormPackage.DOCUMENT_ROOT__COLUMN:
				return getColumn();
			case FormPackage.DOCUMENT_ROOT__COMBOBOX:
				return getCombobox();
			case FormPackage.DOCUMENT_ROOT__CONNECTION_RESOURCE:
				return getConnectionResource();
			case FormPackage.DOCUMENT_ROOT__DATE:
				return getDate();
			case FormPackage.DOCUMENT_ROOT__FILE:
				return getFile();
			case FormPackage.DOCUMENT_ROOT__FIXED_TEXT:
				return getFixedText();
			case FormPackage.DOCUMENT_ROOT__FORM:
				return getForm();
			case FormPackage.DOCUMENT_ROOT__FORMATTED_TEXT:
				return getFormattedText();
			case FormPackage.DOCUMENT_ROOT__FRAME:
				return getFrame();
			case FormPackage.DOCUMENT_ROOT__GENERIC_CONTROL:
				return getGenericControl();
			case FormPackage.DOCUMENT_ROOT__GRID:
				return getGrid();
			case FormPackage.DOCUMENT_ROOT__HIDDEN:
				return getHidden();
			case FormPackage.DOCUMENT_ROOT__IMAGE:
				return getImage();
			case FormPackage.DOCUMENT_ROOT__IMAGE_FRAME:
				return getImageFrame();
			case FormPackage.DOCUMENT_ROOT__ITEM:
				return getItem();
			case FormPackage.DOCUMENT_ROOT__LISTBOX:
				return getListbox();
			case FormPackage.DOCUMENT_ROOT__LIST_PROPERTY:
				return getListProperty();
			case FormPackage.DOCUMENT_ROOT__NUMBER:
				return getNumber();
			case FormPackage.DOCUMENT_ROOT__OPTION:
				return getOption();
			case FormPackage.DOCUMENT_ROOT__PASSWORD:
				return getPassword();
			case FormPackage.DOCUMENT_ROOT__PROPERTIES:
				return getProperties();
			case FormPackage.DOCUMENT_ROOT__PROPERTY:
				return getProperty();
			case FormPackage.DOCUMENT_ROOT__RADIO:
				return getRadio();
			case FormPackage.DOCUMENT_ROOT__TEXT:
				return getText();
			case FormPackage.DOCUMENT_ROOT__TEXTAREA:
				return getTextarea();
			case FormPackage.DOCUMENT_ROOT__TIME:
				return getTime();
			case FormPackage.DOCUMENT_ROOT__VALUE_RANGE:
				return getValueRange();
			case FormPackage.DOCUMENT_ROOT__ALLOW_DELETES:
				return getAllowDeletes();
			case FormPackage.DOCUMENT_ROOT__ALLOW_INSERTS:
				return getAllowInserts();
			case FormPackage.DOCUMENT_ROOT__ALLOW_UPDATES:
				return getAllowUpdates();
			case FormPackage.DOCUMENT_ROOT__APPLY_DESIGN_MODE:
				return getApplyDesignMode();
			case FormPackage.DOCUMENT_ROOT__APPLY_FILTER:
				return getApplyFilter();
			case FormPackage.DOCUMENT_ROOT__AUTO_COMPLETE:
				return getAutoComplete();
			case FormPackage.DOCUMENT_ROOT__AUTOMATIC_FOCUS:
				return getAutomaticFocus();
			case FormPackage.DOCUMENT_ROOT__BOUND_COLUMN:
				return getBoundColumn();
			case FormPackage.DOCUMENT_ROOT__BUTTON_TYPE:
				return getButtonType();
			case FormPackage.DOCUMENT_ROOT__COMMAND:
				return getCommand();
			case FormPackage.DOCUMENT_ROOT__COMMAND_TYPE:
				return getCommandType();
			case FormPackage.DOCUMENT_ROOT__CONTROL_IMPLEMENTATION:
				return getControlImplementation();
			case FormPackage.DOCUMENT_ROOT__CONVERT_EMPTY_TO_NULL:
				return getConvertEmptyToNull();
			case FormPackage.DOCUMENT_ROOT__CURRENT_SELECTED:
				return getCurrentSelected();
			case FormPackage.DOCUMENT_ROOT__CURRENT_STATE:
				return getCurrentState();
			case FormPackage.DOCUMENT_ROOT__DATA_FIELD:
				return getDataField();
			case FormPackage.DOCUMENT_ROOT__DATASOURCE:
				return getDatasource();
			case FormPackage.DOCUMENT_ROOT__DEFAULT_BUTTON:
				return getDefaultButton();
			case FormPackage.DOCUMENT_ROOT__DELAY_FOR_REPEAT:
				return getDelayForRepeat();
			case FormPackage.DOCUMENT_ROOT__DETAIL_FIELDS:
				return getDetailFields();
			case FormPackage.DOCUMENT_ROOT__DISABLED:
				return getDisabled();
			case FormPackage.DOCUMENT_ROOT__DROPDOWN:
				return getDropdown();
			case FormPackage.DOCUMENT_ROOT__ECHO_CHAR:
				return getEchoChar();
			case FormPackage.DOCUMENT_ROOT__ENCTYPE:
				return getEnctype();
			case FormPackage.DOCUMENT_ROOT__ESCAPE_PROCESSING:
				return getEscapeProcessing();
			case FormPackage.DOCUMENT_ROOT__FILTER:
				return getFilter();
			case FormPackage.DOCUMENT_ROOT__FOCUS_ON_CLICK:
				return getFocusOnClick();
			case FormPackage.DOCUMENT_ROOT__FOR:
				return getFor();
			case FormPackage.DOCUMENT_ROOT__ID:
				return getId();
			case FormPackage.DOCUMENT_ROOT__IGNORE_RESULT:
				return getIgnoreResult();
			case FormPackage.DOCUMENT_ROOT__IMAGE_ALIGN:
				return getImageAlign();
			case FormPackage.DOCUMENT_ROOT__IMAGE_DATA:
				return getImageData();
			case FormPackage.DOCUMENT_ROOT__IMAGE_POSITION:
				return getImagePosition();
			case FormPackage.DOCUMENT_ROOT__IS_TRISTATE:
				return getIsTristate();
			case FormPackage.DOCUMENT_ROOT__LABEL:
				return getLabel();
			case FormPackage.DOCUMENT_ROOT__LIST_SOURCE:
				return getListSource();
			case FormPackage.DOCUMENT_ROOT__LIST_SOURCE_TYPE:
				return getListSourceType();
			case FormPackage.DOCUMENT_ROOT__MASTER_FIELDS:
				return getMasterFields();
			case FormPackage.DOCUMENT_ROOT__MAX_LENGTH:
				return getMaxLength();
			case FormPackage.DOCUMENT_ROOT__METHOD:
				return getMethod();
			case FormPackage.DOCUMENT_ROOT__MULTI_LINE:
				return getMultiLine();
			case FormPackage.DOCUMENT_ROOT__MULTIPLE:
				return getMultiple();
			case FormPackage.DOCUMENT_ROOT__NAME:
				return getName();
			case FormPackage.DOCUMENT_ROOT__NAVIGATION_MODE:
				return getNavigationMode();
			case FormPackage.DOCUMENT_ROOT__ORDER:
				return getOrder();
			case FormPackage.DOCUMENT_ROOT__ORIENTATION:
				return getOrientation();
			case FormPackage.DOCUMENT_ROOT__PAGE_STEP_SIZE:
				return getPageStepSize();
			case FormPackage.DOCUMENT_ROOT__PRINTABLE:
				return getPrintable();
			case FormPackage.DOCUMENT_ROOT__PROPERTY_NAME:
				return getPropertyName();
			case FormPackage.DOCUMENT_ROOT__READONLY:
				return getReadonly();
			case FormPackage.DOCUMENT_ROOT__SELECTED:
				return getSelected();
			case FormPackage.DOCUMENT_ROOT__SIZE:
				return getSize();
			case FormPackage.DOCUMENT_ROOT__STATE:
				return getState();
			case FormPackage.DOCUMENT_ROOT__STEP_SIZE:
				return getStepSize();
			case FormPackage.DOCUMENT_ROOT__TAB_CYCLE:
				return getTabCycle();
			case FormPackage.DOCUMENT_ROOT__TAB_INDEX:
				return getTabIndex();
			case FormPackage.DOCUMENT_ROOT__TAB_STOP:
				return getTabStop();
			case FormPackage.DOCUMENT_ROOT__TEXT_STYLE_NAME:
				return getTextStyleName();
			case FormPackage.DOCUMENT_ROOT__TITLE:
				return getTitle();
			case FormPackage.DOCUMENT_ROOT__TOGGLE:
				return getToggle();
			case FormPackage.DOCUMENT_ROOT__VALIDATION:
				return getValidation();
			case FormPackage.DOCUMENT_ROOT__VISUAL_EFFECT:
				return getVisualEffect();
			case FormPackage.DOCUMENT_ROOT__XFORMS_LIST_SOURCE:
				return getXformsListSource();
			case FormPackage.DOCUMENT_ROOT__XFORMS_SUBMISSION:
				return getXformsSubmission();
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
			case FormPackage.DOCUMENT_ROOT__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case FormPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
				return;
			case FormPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
				return;
			case FormPackage.DOCUMENT_ROOT__BUTTON:
				setButton((ButtonType)newValue);
				return;
			case FormPackage.DOCUMENT_ROOT__CHECKBOX:
				setCheckbox((CheckboxType)newValue);
				return;
			case FormPackage.DOCUMENT_ROOT__COLUMN:
				setColumn((ColumnType)newValue);
				return;
			case FormPackage.DOCUMENT_ROOT__COMBOBOX:
				setCombobox((ComboboxType)newValue);
				return;
			case FormPackage.DOCUMENT_ROOT__CONNECTION_RESOURCE:
				setConnectionResource((ConnectionResourceType)newValue);
				return;
			case FormPackage.DOCUMENT_ROOT__DATE:
				setDate((DateType)newValue);
				return;
			case FormPackage.DOCUMENT_ROOT__FILE:
				setFile((FileType)newValue);
				return;
			case FormPackage.DOCUMENT_ROOT__FIXED_TEXT:
				setFixedText((FixedTextType)newValue);
				return;
			case FormPackage.DOCUMENT_ROOT__FORM:
				setForm((FormType)newValue);
				return;
			case FormPackage.DOCUMENT_ROOT__FORMATTED_TEXT:
				setFormattedText((FormattedTextType)newValue);
				return;
			case FormPackage.DOCUMENT_ROOT__FRAME:
				setFrame((FrameType)newValue);
				return;
			case FormPackage.DOCUMENT_ROOT__GENERIC_CONTROL:
				setGenericControl((GenericControlType)newValue);
				return;
			case FormPackage.DOCUMENT_ROOT__GRID:
				setGrid((GridType)newValue);
				return;
			case FormPackage.DOCUMENT_ROOT__HIDDEN:
				setHidden((HiddenType)newValue);
				return;
			case FormPackage.DOCUMENT_ROOT__IMAGE:
				setImage((ImageType)newValue);
				return;
			case FormPackage.DOCUMENT_ROOT__IMAGE_FRAME:
				setImageFrame((ImageFrameType)newValue);
				return;
			case FormPackage.DOCUMENT_ROOT__ITEM:
				setItem((ItemType)newValue);
				return;
			case FormPackage.DOCUMENT_ROOT__LISTBOX:
				setListbox((ListboxType)newValue);
				return;
			case FormPackage.DOCUMENT_ROOT__LIST_PROPERTY:
				setListProperty((ListPropertyType)newValue);
				return;
			case FormPackage.DOCUMENT_ROOT__NUMBER:
				setNumber((NumberType)newValue);
				return;
			case FormPackage.DOCUMENT_ROOT__OPTION:
				setOption((OptionType)newValue);
				return;
			case FormPackage.DOCUMENT_ROOT__PASSWORD:
				setPassword((PasswordType)newValue);
				return;
			case FormPackage.DOCUMENT_ROOT__PROPERTIES:
				setProperties((PropertiesType)newValue);
				return;
			case FormPackage.DOCUMENT_ROOT__PROPERTY:
				setProperty((PropertyType)newValue);
				return;
			case FormPackage.DOCUMENT_ROOT__RADIO:
				setRadio((RadioType)newValue);
				return;
			case FormPackage.DOCUMENT_ROOT__TEXT:
				setText((TextType)newValue);
				return;
			case FormPackage.DOCUMENT_ROOT__TEXTAREA:
				setTextarea((TextareaType)newValue);
				return;
			case FormPackage.DOCUMENT_ROOT__TIME:
				setTime((TimeType)newValue);
				return;
			case FormPackage.DOCUMENT_ROOT__VALUE_RANGE:
				setValueRange((ValueRangeType)newValue);
				return;
			case FormPackage.DOCUMENT_ROOT__ALLOW_DELETES:
				setAllowDeletes((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case FormPackage.DOCUMENT_ROOT__ALLOW_INSERTS:
				setAllowInserts((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case FormPackage.DOCUMENT_ROOT__ALLOW_UPDATES:
				setAllowUpdates((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case FormPackage.DOCUMENT_ROOT__APPLY_DESIGN_MODE:
				setApplyDesignMode((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case FormPackage.DOCUMENT_ROOT__APPLY_FILTER:
				setApplyFilter((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case FormPackage.DOCUMENT_ROOT__AUTO_COMPLETE:
				setAutoComplete((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case FormPackage.DOCUMENT_ROOT__AUTOMATIC_FOCUS:
				setAutomaticFocus((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case FormPackage.DOCUMENT_ROOT__BOUND_COLUMN:
				setBoundColumn((String)newValue);
				return;
			case FormPackage.DOCUMENT_ROOT__BUTTON_TYPE:
				setButtonType((Types)newValue);
				return;
			case FormPackage.DOCUMENT_ROOT__COMMAND:
				setCommand(newValue);
				return;
			case FormPackage.DOCUMENT_ROOT__COMMAND_TYPE:
				setCommandType((CommandTypeType)newValue);
				return;
			case FormPackage.DOCUMENT_ROOT__CONTROL_IMPLEMENTATION:
				setControlImplementation((String)newValue);
				return;
			case FormPackage.DOCUMENT_ROOT__CONVERT_EMPTY_TO_NULL:
				setConvertEmptyToNull((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case FormPackage.DOCUMENT_ROOT__CURRENT_SELECTED:
				setCurrentSelected((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case FormPackage.DOCUMENT_ROOT__CURRENT_STATE:
				setCurrentState((States)newValue);
				return;
			case FormPackage.DOCUMENT_ROOT__DATA_FIELD:
				setDataField((String)newValue);
				return;
			case FormPackage.DOCUMENT_ROOT__DATASOURCE:
				setDatasource((String)newValue);
				return;
			case FormPackage.DOCUMENT_ROOT__DEFAULT_BUTTON:
				setDefaultButton((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case FormPackage.DOCUMENT_ROOT__DELAY_FOR_REPEAT:
				setDelayForRepeat((Duration)newValue);
				return;
			case FormPackage.DOCUMENT_ROOT__DETAIL_FIELDS:
				setDetailFields((String)newValue);
				return;
			case FormPackage.DOCUMENT_ROOT__DISABLED:
				setDisabled((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case FormPackage.DOCUMENT_ROOT__DROPDOWN:
				setDropdown((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case FormPackage.DOCUMENT_ROOT__ECHO_CHAR:
				setEchoChar((String)newValue);
				return;
			case FormPackage.DOCUMENT_ROOT__ENCTYPE:
				setEnctype((String)newValue);
				return;
			case FormPackage.DOCUMENT_ROOT__ESCAPE_PROCESSING:
				setEscapeProcessing((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case FormPackage.DOCUMENT_ROOT__FILTER:
				setFilter((String)newValue);
				return;
			case FormPackage.DOCUMENT_ROOT__FOCUS_ON_CLICK:
				setFocusOnClick((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case FormPackage.DOCUMENT_ROOT__FOR:
				setFor((String)newValue);
				return;
			case FormPackage.DOCUMENT_ROOT__ID:
				setId((String)newValue);
				return;
			case FormPackage.DOCUMENT_ROOT__IGNORE_RESULT:
				setIgnoreResult((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case FormPackage.DOCUMENT_ROOT__IMAGE_ALIGN:
				setImageAlign((ImageAlignType)newValue);
				return;
			case FormPackage.DOCUMENT_ROOT__IMAGE_DATA:
				setImageData((String)newValue);
				return;
			case FormPackage.DOCUMENT_ROOT__IMAGE_POSITION:
				setImagePosition((ImagePositionType)newValue);
				return;
			case FormPackage.DOCUMENT_ROOT__IS_TRISTATE:
				setIsTristate((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case FormPackage.DOCUMENT_ROOT__LABEL:
				setLabel((String)newValue);
				return;
			case FormPackage.DOCUMENT_ROOT__LIST_SOURCE:
				setListSource((String)newValue);
				return;
			case FormPackage.DOCUMENT_ROOT__LIST_SOURCE_TYPE:
				setListSourceType((ListSourceTypeType)newValue);
				return;
			case FormPackage.DOCUMENT_ROOT__MASTER_FIELDS:
				setMasterFields((String)newValue);
				return;
			case FormPackage.DOCUMENT_ROOT__MAX_LENGTH:
				setMaxLength((BigInteger)newValue);
				return;
			case FormPackage.DOCUMENT_ROOT__METHOD:
				setMethod(newValue);
				return;
			case FormPackage.DOCUMENT_ROOT__MULTI_LINE:
				setMultiLine((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case FormPackage.DOCUMENT_ROOT__MULTIPLE:
				setMultiple((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case FormPackage.DOCUMENT_ROOT__NAME:
				setName((String)newValue);
				return;
			case FormPackage.DOCUMENT_ROOT__NAVIGATION_MODE:
				setNavigationMode((Navigation)newValue);
				return;
			case FormPackage.DOCUMENT_ROOT__ORDER:
				setOrder((String)newValue);
				return;
			case FormPackage.DOCUMENT_ROOT__ORIENTATION:
				setOrientation((OrientationType)newValue);
				return;
			case FormPackage.DOCUMENT_ROOT__PAGE_STEP_SIZE:
				setPageStepSize((BigInteger)newValue);
				return;
			case FormPackage.DOCUMENT_ROOT__PRINTABLE:
				setPrintable((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case FormPackage.DOCUMENT_ROOT__PROPERTY_NAME:
				setPropertyName((String)newValue);
				return;
			case FormPackage.DOCUMENT_ROOT__READONLY:
				setReadonly((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case FormPackage.DOCUMENT_ROOT__SELECTED:
				setSelected((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case FormPackage.DOCUMENT_ROOT__SIZE:
				setSize((BigInteger)newValue);
				return;
			case FormPackage.DOCUMENT_ROOT__STATE:
				setState((States)newValue);
				return;
			case FormPackage.DOCUMENT_ROOT__STEP_SIZE:
				setStepSize((BigInteger)newValue);
				return;
			case FormPackage.DOCUMENT_ROOT__TAB_CYCLE:
				setTabCycle((TabCycles)newValue);
				return;
			case FormPackage.DOCUMENT_ROOT__TAB_INDEX:
				setTabIndex((BigInteger)newValue);
				return;
			case FormPackage.DOCUMENT_ROOT__TAB_STOP:
				setTabStop((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case FormPackage.DOCUMENT_ROOT__TEXT_STYLE_NAME:
				setTextStyleName((String)newValue);
				return;
			case FormPackage.DOCUMENT_ROOT__TITLE:
				setTitle(newValue);
				return;
			case FormPackage.DOCUMENT_ROOT__TOGGLE:
				setToggle((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case FormPackage.DOCUMENT_ROOT__VALIDATION:
				setValidation((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case FormPackage.DOCUMENT_ROOT__VISUAL_EFFECT:
				setVisualEffect((VisualEffectType)newValue);
				return;
			case FormPackage.DOCUMENT_ROOT__XFORMS_LIST_SOURCE:
				setXformsListSource((String)newValue);
				return;
			case FormPackage.DOCUMENT_ROOT__XFORMS_SUBMISSION:
				setXformsSubmission((String)newValue);
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
			case FormPackage.DOCUMENT_ROOT__MIXED:
				getMixed().clear();
				return;
			case FormPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				getXMLNSPrefixMap().clear();
				return;
			case FormPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				getXSISchemaLocation().clear();
				return;
			case FormPackage.DOCUMENT_ROOT__BUTTON:
				setButton((ButtonType)null);
				return;
			case FormPackage.DOCUMENT_ROOT__CHECKBOX:
				setCheckbox((CheckboxType)null);
				return;
			case FormPackage.DOCUMENT_ROOT__COLUMN:
				setColumn((ColumnType)null);
				return;
			case FormPackage.DOCUMENT_ROOT__COMBOBOX:
				setCombobox((ComboboxType)null);
				return;
			case FormPackage.DOCUMENT_ROOT__CONNECTION_RESOURCE:
				setConnectionResource((ConnectionResourceType)null);
				return;
			case FormPackage.DOCUMENT_ROOT__DATE:
				setDate((DateType)null);
				return;
			case FormPackage.DOCUMENT_ROOT__FILE:
				setFile((FileType)null);
				return;
			case FormPackage.DOCUMENT_ROOT__FIXED_TEXT:
				setFixedText((FixedTextType)null);
				return;
			case FormPackage.DOCUMENT_ROOT__FORM:
				setForm((FormType)null);
				return;
			case FormPackage.DOCUMENT_ROOT__FORMATTED_TEXT:
				setFormattedText((FormattedTextType)null);
				return;
			case FormPackage.DOCUMENT_ROOT__FRAME:
				setFrame((FrameType)null);
				return;
			case FormPackage.DOCUMENT_ROOT__GENERIC_CONTROL:
				setGenericControl((GenericControlType)null);
				return;
			case FormPackage.DOCUMENT_ROOT__GRID:
				setGrid((GridType)null);
				return;
			case FormPackage.DOCUMENT_ROOT__HIDDEN:
				setHidden((HiddenType)null);
				return;
			case FormPackage.DOCUMENT_ROOT__IMAGE:
				setImage((ImageType)null);
				return;
			case FormPackage.DOCUMENT_ROOT__IMAGE_FRAME:
				setImageFrame((ImageFrameType)null);
				return;
			case FormPackage.DOCUMENT_ROOT__ITEM:
				setItem((ItemType)null);
				return;
			case FormPackage.DOCUMENT_ROOT__LISTBOX:
				setListbox((ListboxType)null);
				return;
			case FormPackage.DOCUMENT_ROOT__LIST_PROPERTY:
				setListProperty((ListPropertyType)null);
				return;
			case FormPackage.DOCUMENT_ROOT__NUMBER:
				setNumber((NumberType)null);
				return;
			case FormPackage.DOCUMENT_ROOT__OPTION:
				setOption((OptionType)null);
				return;
			case FormPackage.DOCUMENT_ROOT__PASSWORD:
				setPassword((PasswordType)null);
				return;
			case FormPackage.DOCUMENT_ROOT__PROPERTIES:
				setProperties((PropertiesType)null);
				return;
			case FormPackage.DOCUMENT_ROOT__PROPERTY:
				setProperty((PropertyType)null);
				return;
			case FormPackage.DOCUMENT_ROOT__RADIO:
				setRadio((RadioType)null);
				return;
			case FormPackage.DOCUMENT_ROOT__TEXT:
				setText((TextType)null);
				return;
			case FormPackage.DOCUMENT_ROOT__TEXTAREA:
				setTextarea((TextareaType)null);
				return;
			case FormPackage.DOCUMENT_ROOT__TIME:
				setTime((TimeType)null);
				return;
			case FormPackage.DOCUMENT_ROOT__VALUE_RANGE:
				setValueRange((ValueRangeType)null);
				return;
			case FormPackage.DOCUMENT_ROOT__ALLOW_DELETES:
				unsetAllowDeletes();
				return;
			case FormPackage.DOCUMENT_ROOT__ALLOW_INSERTS:
				unsetAllowInserts();
				return;
			case FormPackage.DOCUMENT_ROOT__ALLOW_UPDATES:
				unsetAllowUpdates();
				return;
			case FormPackage.DOCUMENT_ROOT__APPLY_DESIGN_MODE:
				unsetApplyDesignMode();
				return;
			case FormPackage.DOCUMENT_ROOT__APPLY_FILTER:
				unsetApplyFilter();
				return;
			case FormPackage.DOCUMENT_ROOT__AUTO_COMPLETE:
				unsetAutoComplete();
				return;
			case FormPackage.DOCUMENT_ROOT__AUTOMATIC_FOCUS:
				unsetAutomaticFocus();
				return;
			case FormPackage.DOCUMENT_ROOT__BOUND_COLUMN:
				setBoundColumn(BOUND_COLUMN_EDEFAULT);
				return;
			case FormPackage.DOCUMENT_ROOT__BUTTON_TYPE:
				unsetButtonType();
				return;
			case FormPackage.DOCUMENT_ROOT__COMMAND:
				setCommand(COMMAND_EDEFAULT);
				return;
			case FormPackage.DOCUMENT_ROOT__COMMAND_TYPE:
				unsetCommandType();
				return;
			case FormPackage.DOCUMENT_ROOT__CONTROL_IMPLEMENTATION:
				setControlImplementation(CONTROL_IMPLEMENTATION_EDEFAULT);
				return;
			case FormPackage.DOCUMENT_ROOT__CONVERT_EMPTY_TO_NULL:
				unsetConvertEmptyToNull();
				return;
			case FormPackage.DOCUMENT_ROOT__CURRENT_SELECTED:
				unsetCurrentSelected();
				return;
			case FormPackage.DOCUMENT_ROOT__CURRENT_STATE:
				unsetCurrentState();
				return;
			case FormPackage.DOCUMENT_ROOT__DATA_FIELD:
				setDataField(DATA_FIELD_EDEFAULT);
				return;
			case FormPackage.DOCUMENT_ROOT__DATASOURCE:
				setDatasource(DATASOURCE_EDEFAULT);
				return;
			case FormPackage.DOCUMENT_ROOT__DEFAULT_BUTTON:
				unsetDefaultButton();
				return;
			case FormPackage.DOCUMENT_ROOT__DELAY_FOR_REPEAT:
				setDelayForRepeat(DELAY_FOR_REPEAT_EDEFAULT);
				return;
			case FormPackage.DOCUMENT_ROOT__DETAIL_FIELDS:
				setDetailFields(DETAIL_FIELDS_EDEFAULT);
				return;
			case FormPackage.DOCUMENT_ROOT__DISABLED:
				unsetDisabled();
				return;
			case FormPackage.DOCUMENT_ROOT__DROPDOWN:
				unsetDropdown();
				return;
			case FormPackage.DOCUMENT_ROOT__ECHO_CHAR:
				setEchoChar(ECHO_CHAR_EDEFAULT);
				return;
			case FormPackage.DOCUMENT_ROOT__ENCTYPE:
				setEnctype(ENCTYPE_EDEFAULT);
				return;
			case FormPackage.DOCUMENT_ROOT__ESCAPE_PROCESSING:
				unsetEscapeProcessing();
				return;
			case FormPackage.DOCUMENT_ROOT__FILTER:
				setFilter(FILTER_EDEFAULT);
				return;
			case FormPackage.DOCUMENT_ROOT__FOCUS_ON_CLICK:
				unsetFocusOnClick();
				return;
			case FormPackage.DOCUMENT_ROOT__FOR:
				setFor(FOR_EDEFAULT);
				return;
			case FormPackage.DOCUMENT_ROOT__ID:
				setId(ID_EDEFAULT);
				return;
			case FormPackage.DOCUMENT_ROOT__IGNORE_RESULT:
				unsetIgnoreResult();
				return;
			case FormPackage.DOCUMENT_ROOT__IMAGE_ALIGN:
				unsetImageAlign();
				return;
			case FormPackage.DOCUMENT_ROOT__IMAGE_DATA:
				setImageData(IMAGE_DATA_EDEFAULT);
				return;
			case FormPackage.DOCUMENT_ROOT__IMAGE_POSITION:
				unsetImagePosition();
				return;
			case FormPackage.DOCUMENT_ROOT__IS_TRISTATE:
				unsetIsTristate();
				return;
			case FormPackage.DOCUMENT_ROOT__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case FormPackage.DOCUMENT_ROOT__LIST_SOURCE:
				setListSource(LIST_SOURCE_EDEFAULT);
				return;
			case FormPackage.DOCUMENT_ROOT__LIST_SOURCE_TYPE:
				unsetListSourceType();
				return;
			case FormPackage.DOCUMENT_ROOT__MASTER_FIELDS:
				setMasterFields(MASTER_FIELDS_EDEFAULT);
				return;
			case FormPackage.DOCUMENT_ROOT__MAX_LENGTH:
				setMaxLength(MAX_LENGTH_EDEFAULT);
				return;
			case FormPackage.DOCUMENT_ROOT__METHOD:
				setMethod(METHOD_EDEFAULT);
				return;
			case FormPackage.DOCUMENT_ROOT__MULTI_LINE:
				unsetMultiLine();
				return;
			case FormPackage.DOCUMENT_ROOT__MULTIPLE:
				unsetMultiple();
				return;
			case FormPackage.DOCUMENT_ROOT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case FormPackage.DOCUMENT_ROOT__NAVIGATION_MODE:
				unsetNavigationMode();
				return;
			case FormPackage.DOCUMENT_ROOT__ORDER:
				setOrder(ORDER_EDEFAULT);
				return;
			case FormPackage.DOCUMENT_ROOT__ORIENTATION:
				unsetOrientation();
				return;
			case FormPackage.DOCUMENT_ROOT__PAGE_STEP_SIZE:
				setPageStepSize(PAGE_STEP_SIZE_EDEFAULT);
				return;
			case FormPackage.DOCUMENT_ROOT__PRINTABLE:
				unsetPrintable();
				return;
			case FormPackage.DOCUMENT_ROOT__PROPERTY_NAME:
				setPropertyName(PROPERTY_NAME_EDEFAULT);
				return;
			case FormPackage.DOCUMENT_ROOT__READONLY:
				unsetReadonly();
				return;
			case FormPackage.DOCUMENT_ROOT__SELECTED:
				unsetSelected();
				return;
			case FormPackage.DOCUMENT_ROOT__SIZE:
				setSize(SIZE_EDEFAULT);
				return;
			case FormPackage.DOCUMENT_ROOT__STATE:
				unsetState();
				return;
			case FormPackage.DOCUMENT_ROOT__STEP_SIZE:
				setStepSize(STEP_SIZE_EDEFAULT);
				return;
			case FormPackage.DOCUMENT_ROOT__TAB_CYCLE:
				unsetTabCycle();
				return;
			case FormPackage.DOCUMENT_ROOT__TAB_INDEX:
				setTabIndex(TAB_INDEX_EDEFAULT);
				return;
			case FormPackage.DOCUMENT_ROOT__TAB_STOP:
				unsetTabStop();
				return;
			case FormPackage.DOCUMENT_ROOT__TEXT_STYLE_NAME:
				setTextStyleName(TEXT_STYLE_NAME_EDEFAULT);
				return;
			case FormPackage.DOCUMENT_ROOT__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case FormPackage.DOCUMENT_ROOT__TOGGLE:
				unsetToggle();
				return;
			case FormPackage.DOCUMENT_ROOT__VALIDATION:
				unsetValidation();
				return;
			case FormPackage.DOCUMENT_ROOT__VISUAL_EFFECT:
				unsetVisualEffect();
				return;
			case FormPackage.DOCUMENT_ROOT__XFORMS_LIST_SOURCE:
				setXformsListSource(XFORMS_LIST_SOURCE_EDEFAULT);
				return;
			case FormPackage.DOCUMENT_ROOT__XFORMS_SUBMISSION:
				setXformsSubmission(XFORMS_SUBMISSION_EDEFAULT);
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
			case FormPackage.DOCUMENT_ROOT__MIXED:
				return mixed != null && !mixed.isEmpty();
			case FormPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
			case FormPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
			case FormPackage.DOCUMENT_ROOT__BUTTON:
				return getButton() != null;
			case FormPackage.DOCUMENT_ROOT__CHECKBOX:
				return getCheckbox() != null;
			case FormPackage.DOCUMENT_ROOT__COLUMN:
				return getColumn() != null;
			case FormPackage.DOCUMENT_ROOT__COMBOBOX:
				return getCombobox() != null;
			case FormPackage.DOCUMENT_ROOT__CONNECTION_RESOURCE:
				return getConnectionResource() != null;
			case FormPackage.DOCUMENT_ROOT__DATE:
				return getDate() != null;
			case FormPackage.DOCUMENT_ROOT__FILE:
				return getFile() != null;
			case FormPackage.DOCUMENT_ROOT__FIXED_TEXT:
				return getFixedText() != null;
			case FormPackage.DOCUMENT_ROOT__FORM:
				return getForm() != null;
			case FormPackage.DOCUMENT_ROOT__FORMATTED_TEXT:
				return getFormattedText() != null;
			case FormPackage.DOCUMENT_ROOT__FRAME:
				return getFrame() != null;
			case FormPackage.DOCUMENT_ROOT__GENERIC_CONTROL:
				return getGenericControl() != null;
			case FormPackage.DOCUMENT_ROOT__GRID:
				return getGrid() != null;
			case FormPackage.DOCUMENT_ROOT__HIDDEN:
				return getHidden() != null;
			case FormPackage.DOCUMENT_ROOT__IMAGE:
				return getImage() != null;
			case FormPackage.DOCUMENT_ROOT__IMAGE_FRAME:
				return getImageFrame() != null;
			case FormPackage.DOCUMENT_ROOT__ITEM:
				return getItem() != null;
			case FormPackage.DOCUMENT_ROOT__LISTBOX:
				return getListbox() != null;
			case FormPackage.DOCUMENT_ROOT__LIST_PROPERTY:
				return getListProperty() != null;
			case FormPackage.DOCUMENT_ROOT__NUMBER:
				return getNumber() != null;
			case FormPackage.DOCUMENT_ROOT__OPTION:
				return getOption() != null;
			case FormPackage.DOCUMENT_ROOT__PASSWORD:
				return getPassword() != null;
			case FormPackage.DOCUMENT_ROOT__PROPERTIES:
				return getProperties() != null;
			case FormPackage.DOCUMENT_ROOT__PROPERTY:
				return getProperty() != null;
			case FormPackage.DOCUMENT_ROOT__RADIO:
				return getRadio() != null;
			case FormPackage.DOCUMENT_ROOT__TEXT:
				return getText() != null;
			case FormPackage.DOCUMENT_ROOT__TEXTAREA:
				return getTextarea() != null;
			case FormPackage.DOCUMENT_ROOT__TIME:
				return getTime() != null;
			case FormPackage.DOCUMENT_ROOT__VALUE_RANGE:
				return getValueRange() != null;
			case FormPackage.DOCUMENT_ROOT__ALLOW_DELETES:
				return isSetAllowDeletes();
			case FormPackage.DOCUMENT_ROOT__ALLOW_INSERTS:
				return isSetAllowInserts();
			case FormPackage.DOCUMENT_ROOT__ALLOW_UPDATES:
				return isSetAllowUpdates();
			case FormPackage.DOCUMENT_ROOT__APPLY_DESIGN_MODE:
				return isSetApplyDesignMode();
			case FormPackage.DOCUMENT_ROOT__APPLY_FILTER:
				return isSetApplyFilter();
			case FormPackage.DOCUMENT_ROOT__AUTO_COMPLETE:
				return isSetAutoComplete();
			case FormPackage.DOCUMENT_ROOT__AUTOMATIC_FOCUS:
				return isSetAutomaticFocus();
			case FormPackage.DOCUMENT_ROOT__BOUND_COLUMN:
				return BOUND_COLUMN_EDEFAULT == null ? boundColumn != null : !BOUND_COLUMN_EDEFAULT.equals(boundColumn);
			case FormPackage.DOCUMENT_ROOT__BUTTON_TYPE:
				return isSetButtonType();
			case FormPackage.DOCUMENT_ROOT__COMMAND:
				return COMMAND_EDEFAULT == null ? command != null : !COMMAND_EDEFAULT.equals(command);
			case FormPackage.DOCUMENT_ROOT__COMMAND_TYPE:
				return isSetCommandType();
			case FormPackage.DOCUMENT_ROOT__CONTROL_IMPLEMENTATION:
				return CONTROL_IMPLEMENTATION_EDEFAULT == null ? controlImplementation != null : !CONTROL_IMPLEMENTATION_EDEFAULT.equals(controlImplementation);
			case FormPackage.DOCUMENT_ROOT__CONVERT_EMPTY_TO_NULL:
				return isSetConvertEmptyToNull();
			case FormPackage.DOCUMENT_ROOT__CURRENT_SELECTED:
				return isSetCurrentSelected();
			case FormPackage.DOCUMENT_ROOT__CURRENT_STATE:
				return isSetCurrentState();
			case FormPackage.DOCUMENT_ROOT__DATA_FIELD:
				return DATA_FIELD_EDEFAULT == null ? dataField != null : !DATA_FIELD_EDEFAULT.equals(dataField);
			case FormPackage.DOCUMENT_ROOT__DATASOURCE:
				return DATASOURCE_EDEFAULT == null ? datasource != null : !DATASOURCE_EDEFAULT.equals(datasource);
			case FormPackage.DOCUMENT_ROOT__DEFAULT_BUTTON:
				return isSetDefaultButton();
			case FormPackage.DOCUMENT_ROOT__DELAY_FOR_REPEAT:
				return DELAY_FOR_REPEAT_EDEFAULT == null ? delayForRepeat != null : !DELAY_FOR_REPEAT_EDEFAULT.equals(delayForRepeat);
			case FormPackage.DOCUMENT_ROOT__DETAIL_FIELDS:
				return DETAIL_FIELDS_EDEFAULT == null ? detailFields != null : !DETAIL_FIELDS_EDEFAULT.equals(detailFields);
			case FormPackage.DOCUMENT_ROOT__DISABLED:
				return isSetDisabled();
			case FormPackage.DOCUMENT_ROOT__DROPDOWN:
				return isSetDropdown();
			case FormPackage.DOCUMENT_ROOT__ECHO_CHAR:
				return ECHO_CHAR_EDEFAULT == null ? echoChar != null : !ECHO_CHAR_EDEFAULT.equals(echoChar);
			case FormPackage.DOCUMENT_ROOT__ENCTYPE:
				return ENCTYPE_EDEFAULT == null ? enctype != null : !ENCTYPE_EDEFAULT.equals(enctype);
			case FormPackage.DOCUMENT_ROOT__ESCAPE_PROCESSING:
				return isSetEscapeProcessing();
			case FormPackage.DOCUMENT_ROOT__FILTER:
				return FILTER_EDEFAULT == null ? filter != null : !FILTER_EDEFAULT.equals(filter);
			case FormPackage.DOCUMENT_ROOT__FOCUS_ON_CLICK:
				return isSetFocusOnClick();
			case FormPackage.DOCUMENT_ROOT__FOR:
				return FOR_EDEFAULT == null ? for_ != null : !FOR_EDEFAULT.equals(for_);
			case FormPackage.DOCUMENT_ROOT__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case FormPackage.DOCUMENT_ROOT__IGNORE_RESULT:
				return isSetIgnoreResult();
			case FormPackage.DOCUMENT_ROOT__IMAGE_ALIGN:
				return isSetImageAlign();
			case FormPackage.DOCUMENT_ROOT__IMAGE_DATA:
				return IMAGE_DATA_EDEFAULT == null ? imageData != null : !IMAGE_DATA_EDEFAULT.equals(imageData);
			case FormPackage.DOCUMENT_ROOT__IMAGE_POSITION:
				return isSetImagePosition();
			case FormPackage.DOCUMENT_ROOT__IS_TRISTATE:
				return isSetIsTristate();
			case FormPackage.DOCUMENT_ROOT__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case FormPackage.DOCUMENT_ROOT__LIST_SOURCE:
				return LIST_SOURCE_EDEFAULT == null ? listSource != null : !LIST_SOURCE_EDEFAULT.equals(listSource);
			case FormPackage.DOCUMENT_ROOT__LIST_SOURCE_TYPE:
				return isSetListSourceType();
			case FormPackage.DOCUMENT_ROOT__MASTER_FIELDS:
				return MASTER_FIELDS_EDEFAULT == null ? masterFields != null : !MASTER_FIELDS_EDEFAULT.equals(masterFields);
			case FormPackage.DOCUMENT_ROOT__MAX_LENGTH:
				return MAX_LENGTH_EDEFAULT == null ? maxLength != null : !MAX_LENGTH_EDEFAULT.equals(maxLength);
			case FormPackage.DOCUMENT_ROOT__METHOD:
				return METHOD_EDEFAULT == null ? method != null : !METHOD_EDEFAULT.equals(method);
			case FormPackage.DOCUMENT_ROOT__MULTI_LINE:
				return isSetMultiLine();
			case FormPackage.DOCUMENT_ROOT__MULTIPLE:
				return isSetMultiple();
			case FormPackage.DOCUMENT_ROOT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case FormPackage.DOCUMENT_ROOT__NAVIGATION_MODE:
				return isSetNavigationMode();
			case FormPackage.DOCUMENT_ROOT__ORDER:
				return ORDER_EDEFAULT == null ? order != null : !ORDER_EDEFAULT.equals(order);
			case FormPackage.DOCUMENT_ROOT__ORIENTATION:
				return isSetOrientation();
			case FormPackage.DOCUMENT_ROOT__PAGE_STEP_SIZE:
				return PAGE_STEP_SIZE_EDEFAULT == null ? pageStepSize != null : !PAGE_STEP_SIZE_EDEFAULT.equals(pageStepSize);
			case FormPackage.DOCUMENT_ROOT__PRINTABLE:
				return isSetPrintable();
			case FormPackage.DOCUMENT_ROOT__PROPERTY_NAME:
				return PROPERTY_NAME_EDEFAULT == null ? propertyName != null : !PROPERTY_NAME_EDEFAULT.equals(propertyName);
			case FormPackage.DOCUMENT_ROOT__READONLY:
				return isSetReadonly();
			case FormPackage.DOCUMENT_ROOT__SELECTED:
				return isSetSelected();
			case FormPackage.DOCUMENT_ROOT__SIZE:
				return SIZE_EDEFAULT == null ? size != null : !SIZE_EDEFAULT.equals(size);
			case FormPackage.DOCUMENT_ROOT__STATE:
				return isSetState();
			case FormPackage.DOCUMENT_ROOT__STEP_SIZE:
				return STEP_SIZE_EDEFAULT == null ? stepSize != null : !STEP_SIZE_EDEFAULT.equals(stepSize);
			case FormPackage.DOCUMENT_ROOT__TAB_CYCLE:
				return isSetTabCycle();
			case FormPackage.DOCUMENT_ROOT__TAB_INDEX:
				return TAB_INDEX_EDEFAULT == null ? tabIndex != null : !TAB_INDEX_EDEFAULT.equals(tabIndex);
			case FormPackage.DOCUMENT_ROOT__TAB_STOP:
				return isSetTabStop();
			case FormPackage.DOCUMENT_ROOT__TEXT_STYLE_NAME:
				return TEXT_STYLE_NAME_EDEFAULT == null ? textStyleName != null : !TEXT_STYLE_NAME_EDEFAULT.equals(textStyleName);
			case FormPackage.DOCUMENT_ROOT__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case FormPackage.DOCUMENT_ROOT__TOGGLE:
				return isSetToggle();
			case FormPackage.DOCUMENT_ROOT__VALIDATION:
				return isSetValidation();
			case FormPackage.DOCUMENT_ROOT__VISUAL_EFFECT:
				return isSetVisualEffect();
			case FormPackage.DOCUMENT_ROOT__XFORMS_LIST_SOURCE:
				return XFORMS_LIST_SOURCE_EDEFAULT == null ? xformsListSource != null : !XFORMS_LIST_SOURCE_EDEFAULT.equals(xformsListSource);
			case FormPackage.DOCUMENT_ROOT__XFORMS_SUBMISSION:
				return XFORMS_SUBMISSION_EDEFAULT == null ? xformsSubmission != null : !XFORMS_SUBMISSION_EDEFAULT.equals(xformsSubmission);
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
		result.append(", allowDeletes: ");
		if (allowDeletesESet) result.append(allowDeletes); else result.append("<unset>");
		result.append(", allowInserts: ");
		if (allowInsertsESet) result.append(allowInserts); else result.append("<unset>");
		result.append(", allowUpdates: ");
		if (allowUpdatesESet) result.append(allowUpdates); else result.append("<unset>");
		result.append(", applyDesignMode: ");
		if (applyDesignModeESet) result.append(applyDesignMode); else result.append("<unset>");
		result.append(", applyFilter: ");
		if (applyFilterESet) result.append(applyFilter); else result.append("<unset>");
		result.append(", autoComplete: ");
		if (autoCompleteESet) result.append(autoComplete); else result.append("<unset>");
		result.append(", automaticFocus: ");
		if (automaticFocusESet) result.append(automaticFocus); else result.append("<unset>");
		result.append(", boundColumn: ");
		result.append(boundColumn);
		result.append(", buttonType: ");
		if (buttonTypeESet) result.append(buttonType); else result.append("<unset>");
		result.append(", command: ");
		result.append(command);
		result.append(", commandType: ");
		if (commandTypeESet) result.append(commandType); else result.append("<unset>");
		result.append(", controlImplementation: ");
		result.append(controlImplementation);
		result.append(", convertEmptyToNull: ");
		if (convertEmptyToNullESet) result.append(convertEmptyToNull); else result.append("<unset>");
		result.append(", currentSelected: ");
		if (currentSelectedESet) result.append(currentSelected); else result.append("<unset>");
		result.append(", currentState: ");
		if (currentStateESet) result.append(currentState); else result.append("<unset>");
		result.append(", dataField: ");
		result.append(dataField);
		result.append(", datasource: ");
		result.append(datasource);
		result.append(", defaultButton: ");
		if (defaultButtonESet) result.append(defaultButton); else result.append("<unset>");
		result.append(", delayForRepeat: ");
		result.append(delayForRepeat);
		result.append(", detailFields: ");
		result.append(detailFields);
		result.append(", disabled: ");
		if (disabledESet) result.append(disabled); else result.append("<unset>");
		result.append(", dropdown: ");
		if (dropdownESet) result.append(dropdown); else result.append("<unset>");
		result.append(", echoChar: ");
		result.append(echoChar);
		result.append(", enctype: ");
		result.append(enctype);
		result.append(", escapeProcessing: ");
		if (escapeProcessingESet) result.append(escapeProcessing); else result.append("<unset>");
		result.append(", filter: ");
		result.append(filter);
		result.append(", focusOnClick: ");
		if (focusOnClickESet) result.append(focusOnClick); else result.append("<unset>");
		result.append(", for: ");
		result.append(for_);
		result.append(", id: ");
		result.append(id);
		result.append(", ignoreResult: ");
		if (ignoreResultESet) result.append(ignoreResult); else result.append("<unset>");
		result.append(", imageAlign: ");
		if (imageAlignESet) result.append(imageAlign); else result.append("<unset>");
		result.append(", imageData: ");
		result.append(imageData);
		result.append(", imagePosition: ");
		if (imagePositionESet) result.append(imagePosition); else result.append("<unset>");
		result.append(", isTristate: ");
		if (isTristateESet) result.append(isTristate); else result.append("<unset>");
		result.append(", label: ");
		result.append(label);
		result.append(", listSource: ");
		result.append(listSource);
		result.append(", listSourceType: ");
		if (listSourceTypeESet) result.append(listSourceType); else result.append("<unset>");
		result.append(", masterFields: ");
		result.append(masterFields);
		result.append(", maxLength: ");
		result.append(maxLength);
		result.append(", method: ");
		result.append(method);
		result.append(", multiLine: ");
		if (multiLineESet) result.append(multiLine); else result.append("<unset>");
		result.append(", multiple: ");
		if (multipleESet) result.append(multiple); else result.append("<unset>");
		result.append(", name: ");
		result.append(name);
		result.append(", navigationMode: ");
		if (navigationModeESet) result.append(navigationMode); else result.append("<unset>");
		result.append(", order: ");
		result.append(order);
		result.append(", orientation: ");
		if (orientationESet) result.append(orientation); else result.append("<unset>");
		result.append(", pageStepSize: ");
		result.append(pageStepSize);
		result.append(", printable: ");
		if (printableESet) result.append(printable); else result.append("<unset>");
		result.append(", propertyName: ");
		result.append(propertyName);
		result.append(", readonly: ");
		if (readonlyESet) result.append(readonly); else result.append("<unset>");
		result.append(", selected: ");
		if (selectedESet) result.append(selected); else result.append("<unset>");
		result.append(", size: ");
		result.append(size);
		result.append(", state: ");
		if (stateESet) result.append(state); else result.append("<unset>");
		result.append(", stepSize: ");
		result.append(stepSize);
		result.append(", tabCycle: ");
		if (tabCycleESet) result.append(tabCycle); else result.append("<unset>");
		result.append(", tabIndex: ");
		result.append(tabIndex);
		result.append(", tabStop: ");
		if (tabStopESet) result.append(tabStop); else result.append("<unset>");
		result.append(", textStyleName: ");
		result.append(textStyleName);
		result.append(", title: ");
		result.append(title);
		result.append(", toggle: ");
		if (toggleESet) result.append(toggle); else result.append("<unset>");
		result.append(", validation: ");
		if (validationESet) result.append(validation); else result.append("<unset>");
		result.append(", visualEffect: ");
		if (visualEffectESet) result.append(visualEffect); else result.append("<unset>");
		result.append(", xformsListSource: ");
		result.append(xformsListSource);
		result.append(", xformsSubmission: ");
		result.append(xformsSubmission);
		result.append(')');
		return result.toString();
	}

} //DocumentRootImpl
