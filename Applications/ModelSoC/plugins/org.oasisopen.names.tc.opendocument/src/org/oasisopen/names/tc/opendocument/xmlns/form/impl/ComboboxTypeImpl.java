/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.form.impl;

import java.math.BigInteger;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.oasisopen.names.tc.opendocument.xmlns.form.ComboboxType;
import org.oasisopen.names.tc.opendocument.xmlns.form.FormPackage;
import org.oasisopen.names.tc.opendocument.xmlns.form.ItemType;
import org.oasisopen.names.tc.opendocument.xmlns.form.ListSourceTypeType;
import org.oasisopen.names.tc.opendocument.xmlns.text.impl.CommonFormControlContentImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Combobox Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.ComboboxTypeImpl#getItem <em>Item</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.ComboboxTypeImpl#getAutoComplete <em>Auto Complete</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.ComboboxTypeImpl#getBind <em>Bind</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.ComboboxTypeImpl#getControlImplementation <em>Control Implementation</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.ComboboxTypeImpl#getConvertEmptyToNull <em>Convert Empty To Null</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.ComboboxTypeImpl#getCurrentValue <em>Current Value</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.ComboboxTypeImpl#getDataField <em>Data Field</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.ComboboxTypeImpl#getDisabled <em>Disabled</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.ComboboxTypeImpl#getDropdown <em>Dropdown</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.ComboboxTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.ComboboxTypeImpl#getListSource <em>List Source</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.ComboboxTypeImpl#getListSourceType <em>List Source Type</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.ComboboxTypeImpl#getMaxLength <em>Max Length</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.ComboboxTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.ComboboxTypeImpl#getPrintable <em>Printable</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.ComboboxTypeImpl#getReadonly <em>Readonly</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.ComboboxTypeImpl#getSize <em>Size</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.ComboboxTypeImpl#getTabIndex <em>Tab Index</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.ComboboxTypeImpl#getTabStop <em>Tab Stop</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.ComboboxTypeImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.ComboboxTypeImpl#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComboboxTypeImpl extends CommonFormControlContentImpl implements ComboboxType {
	/**
	 * The cached value of the '{@link #getItem() <em>Item</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItem()
	 * @generated
	 * @ordered
	 */
	protected EList<ItemType> item;

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
	 * The default value of the '{@link #getBind() <em>Bind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBind()
	 * @generated
	 * @ordered
	 */
	protected static final String BIND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBind() <em>Bind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBind()
	 * @generated
	 * @ordered
	 */
	protected String bind = BIND_EDEFAULT;

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
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean CONVERT_EMPTY_TO_NULL_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.FALSE;

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
	 * The default value of the '{@link #getCurrentValue() <em>Current Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentValue()
	 * @generated
	 * @ordered
	 */
	protected static final String CURRENT_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCurrentValue() <em>Current Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentValue()
	 * @generated
	 * @ordered
	 */
	protected String currentValue = CURRENT_VALUE_EDEFAULT;

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
	 * The default value of the '{@link #getDisabled() <em>Disabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisabled()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean DISABLED_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.FALSE;

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
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean DROPDOWN_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.FALSE;

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
	 * The default value of the '{@link #getReadonly() <em>Readonly</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadonly()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean READONLY_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.FALSE;

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
	 * The default value of the '{@link #getTabIndex() <em>Tab Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTabIndex()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger TAB_INDEX_EDEFAULT = new BigInteger("0");

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
	 * This is true if the Tab Index attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean tabIndexESet;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComboboxTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FormPackage.eINSTANCE.getComboboxType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ItemType> getItem() {
		if (item == null) {
			item = new EObjectContainmentEList<ItemType>(ItemType.class, this, FormPackage.COMBOBOX_TYPE__ITEM);
		}
		return item;
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
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.COMBOBOX_TYPE__AUTO_COMPLETE, oldAutoComplete, autoComplete, !oldAutoCompleteESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, FormPackage.COMBOBOX_TYPE__AUTO_COMPLETE, oldAutoComplete, AUTO_COMPLETE_EDEFAULT, oldAutoCompleteESet));
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
	public String getBind() {
		return bind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBind(String newBind) {
		String oldBind = bind;
		bind = newBind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.COMBOBOX_TYPE__BIND, oldBind, bind));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.COMBOBOX_TYPE__CONTROL_IMPLEMENTATION, oldControlImplementation, controlImplementation));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.COMBOBOX_TYPE__CONVERT_EMPTY_TO_NULL, oldConvertEmptyToNull, convertEmptyToNull, !oldConvertEmptyToNullESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, FormPackage.COMBOBOX_TYPE__CONVERT_EMPTY_TO_NULL, oldConvertEmptyToNull, CONVERT_EMPTY_TO_NULL_EDEFAULT, oldConvertEmptyToNullESet));
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
	public String getCurrentValue() {
		return currentValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrentValue(String newCurrentValue) {
		String oldCurrentValue = currentValue;
		currentValue = newCurrentValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.COMBOBOX_TYPE__CURRENT_VALUE, oldCurrentValue, currentValue));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.COMBOBOX_TYPE__DATA_FIELD, oldDataField, dataField));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.COMBOBOX_TYPE__DISABLED, oldDisabled, disabled, !oldDisabledESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, FormPackage.COMBOBOX_TYPE__DISABLED, oldDisabled, DISABLED_EDEFAULT, oldDisabledESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.COMBOBOX_TYPE__DROPDOWN, oldDropdown, dropdown, !oldDropdownESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, FormPackage.COMBOBOX_TYPE__DROPDOWN, oldDropdown, DROPDOWN_EDEFAULT, oldDropdownESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.COMBOBOX_TYPE__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.COMBOBOX_TYPE__LIST_SOURCE, oldListSource, listSource));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.COMBOBOX_TYPE__LIST_SOURCE_TYPE, oldListSourceType, listSourceType, !oldListSourceTypeESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, FormPackage.COMBOBOX_TYPE__LIST_SOURCE_TYPE, oldListSourceType, LIST_SOURCE_TYPE_EDEFAULT, oldListSourceTypeESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.COMBOBOX_TYPE__MAX_LENGTH, oldMaxLength, maxLength));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.COMBOBOX_TYPE__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.COMBOBOX_TYPE__PRINTABLE, oldPrintable, printable, !oldPrintableESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, FormPackage.COMBOBOX_TYPE__PRINTABLE, oldPrintable, PRINTABLE_EDEFAULT, oldPrintableESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.COMBOBOX_TYPE__READONLY, oldReadonly, readonly, !oldReadonlyESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, FormPackage.COMBOBOX_TYPE__READONLY, oldReadonly, READONLY_EDEFAULT, oldReadonlyESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.COMBOBOX_TYPE__SIZE, oldSize, size));
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
		boolean oldTabIndexESet = tabIndexESet;
		tabIndexESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.COMBOBOX_TYPE__TAB_INDEX, oldTabIndex, tabIndex, !oldTabIndexESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTabIndex() {
		BigInteger oldTabIndex = tabIndex;
		boolean oldTabIndexESet = tabIndexESet;
		tabIndex = TAB_INDEX_EDEFAULT;
		tabIndexESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, FormPackage.COMBOBOX_TYPE__TAB_INDEX, oldTabIndex, TAB_INDEX_EDEFAULT, oldTabIndexESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTabIndex() {
		return tabIndexESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.COMBOBOX_TYPE__TAB_STOP, oldTabStop, tabStop, !oldTabStopESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, FormPackage.COMBOBOX_TYPE__TAB_STOP, oldTabStop, TAB_STOP_EDEFAULT, oldTabStopESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.COMBOBOX_TYPE__TITLE, oldTitle, title));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.COMBOBOX_TYPE__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FormPackage.COMBOBOX_TYPE__ITEM:
				return ((InternalEList<?>)getItem()).basicRemove(otherEnd, msgs);
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
			case FormPackage.COMBOBOX_TYPE__ITEM:
				return getItem();
			case FormPackage.COMBOBOX_TYPE__AUTO_COMPLETE:
				return getAutoComplete();
			case FormPackage.COMBOBOX_TYPE__BIND:
				return getBind();
			case FormPackage.COMBOBOX_TYPE__CONTROL_IMPLEMENTATION:
				return getControlImplementation();
			case FormPackage.COMBOBOX_TYPE__CONVERT_EMPTY_TO_NULL:
				return getConvertEmptyToNull();
			case FormPackage.COMBOBOX_TYPE__CURRENT_VALUE:
				return getCurrentValue();
			case FormPackage.COMBOBOX_TYPE__DATA_FIELD:
				return getDataField();
			case FormPackage.COMBOBOX_TYPE__DISABLED:
				return getDisabled();
			case FormPackage.COMBOBOX_TYPE__DROPDOWN:
				return getDropdown();
			case FormPackage.COMBOBOX_TYPE__ID:
				return getId();
			case FormPackage.COMBOBOX_TYPE__LIST_SOURCE:
				return getListSource();
			case FormPackage.COMBOBOX_TYPE__LIST_SOURCE_TYPE:
				return getListSourceType();
			case FormPackage.COMBOBOX_TYPE__MAX_LENGTH:
				return getMaxLength();
			case FormPackage.COMBOBOX_TYPE__NAME:
				return getName();
			case FormPackage.COMBOBOX_TYPE__PRINTABLE:
				return getPrintable();
			case FormPackage.COMBOBOX_TYPE__READONLY:
				return getReadonly();
			case FormPackage.COMBOBOX_TYPE__SIZE:
				return getSize();
			case FormPackage.COMBOBOX_TYPE__TAB_INDEX:
				return getTabIndex();
			case FormPackage.COMBOBOX_TYPE__TAB_STOP:
				return getTabStop();
			case FormPackage.COMBOBOX_TYPE__TITLE:
				return getTitle();
			case FormPackage.COMBOBOX_TYPE__VALUE:
				return getValue();
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
			case FormPackage.COMBOBOX_TYPE__ITEM:
				getItem().clear();
				getItem().addAll((Collection<? extends ItemType>)newValue);
				return;
			case FormPackage.COMBOBOX_TYPE__AUTO_COMPLETE:
				setAutoComplete((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case FormPackage.COMBOBOX_TYPE__BIND:
				setBind((String)newValue);
				return;
			case FormPackage.COMBOBOX_TYPE__CONTROL_IMPLEMENTATION:
				setControlImplementation((String)newValue);
				return;
			case FormPackage.COMBOBOX_TYPE__CONVERT_EMPTY_TO_NULL:
				setConvertEmptyToNull((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case FormPackage.COMBOBOX_TYPE__CURRENT_VALUE:
				setCurrentValue((String)newValue);
				return;
			case FormPackage.COMBOBOX_TYPE__DATA_FIELD:
				setDataField((String)newValue);
				return;
			case FormPackage.COMBOBOX_TYPE__DISABLED:
				setDisabled((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case FormPackage.COMBOBOX_TYPE__DROPDOWN:
				setDropdown((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case FormPackage.COMBOBOX_TYPE__ID:
				setId((String)newValue);
				return;
			case FormPackage.COMBOBOX_TYPE__LIST_SOURCE:
				setListSource((String)newValue);
				return;
			case FormPackage.COMBOBOX_TYPE__LIST_SOURCE_TYPE:
				setListSourceType((ListSourceTypeType)newValue);
				return;
			case FormPackage.COMBOBOX_TYPE__MAX_LENGTH:
				setMaxLength((BigInteger)newValue);
				return;
			case FormPackage.COMBOBOX_TYPE__NAME:
				setName((String)newValue);
				return;
			case FormPackage.COMBOBOX_TYPE__PRINTABLE:
				setPrintable((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case FormPackage.COMBOBOX_TYPE__READONLY:
				setReadonly((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case FormPackage.COMBOBOX_TYPE__SIZE:
				setSize((BigInteger)newValue);
				return;
			case FormPackage.COMBOBOX_TYPE__TAB_INDEX:
				setTabIndex((BigInteger)newValue);
				return;
			case FormPackage.COMBOBOX_TYPE__TAB_STOP:
				setTabStop((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case FormPackage.COMBOBOX_TYPE__TITLE:
				setTitle(newValue);
				return;
			case FormPackage.COMBOBOX_TYPE__VALUE:
				setValue((String)newValue);
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
			case FormPackage.COMBOBOX_TYPE__ITEM:
				getItem().clear();
				return;
			case FormPackage.COMBOBOX_TYPE__AUTO_COMPLETE:
				unsetAutoComplete();
				return;
			case FormPackage.COMBOBOX_TYPE__BIND:
				setBind(BIND_EDEFAULT);
				return;
			case FormPackage.COMBOBOX_TYPE__CONTROL_IMPLEMENTATION:
				setControlImplementation(CONTROL_IMPLEMENTATION_EDEFAULT);
				return;
			case FormPackage.COMBOBOX_TYPE__CONVERT_EMPTY_TO_NULL:
				unsetConvertEmptyToNull();
				return;
			case FormPackage.COMBOBOX_TYPE__CURRENT_VALUE:
				setCurrentValue(CURRENT_VALUE_EDEFAULT);
				return;
			case FormPackage.COMBOBOX_TYPE__DATA_FIELD:
				setDataField(DATA_FIELD_EDEFAULT);
				return;
			case FormPackage.COMBOBOX_TYPE__DISABLED:
				unsetDisabled();
				return;
			case FormPackage.COMBOBOX_TYPE__DROPDOWN:
				unsetDropdown();
				return;
			case FormPackage.COMBOBOX_TYPE__ID:
				setId(ID_EDEFAULT);
				return;
			case FormPackage.COMBOBOX_TYPE__LIST_SOURCE:
				setListSource(LIST_SOURCE_EDEFAULT);
				return;
			case FormPackage.COMBOBOX_TYPE__LIST_SOURCE_TYPE:
				unsetListSourceType();
				return;
			case FormPackage.COMBOBOX_TYPE__MAX_LENGTH:
				setMaxLength(MAX_LENGTH_EDEFAULT);
				return;
			case FormPackage.COMBOBOX_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case FormPackage.COMBOBOX_TYPE__PRINTABLE:
				unsetPrintable();
				return;
			case FormPackage.COMBOBOX_TYPE__READONLY:
				unsetReadonly();
				return;
			case FormPackage.COMBOBOX_TYPE__SIZE:
				setSize(SIZE_EDEFAULT);
				return;
			case FormPackage.COMBOBOX_TYPE__TAB_INDEX:
				unsetTabIndex();
				return;
			case FormPackage.COMBOBOX_TYPE__TAB_STOP:
				unsetTabStop();
				return;
			case FormPackage.COMBOBOX_TYPE__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case FormPackage.COMBOBOX_TYPE__VALUE:
				setValue(VALUE_EDEFAULT);
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
			case FormPackage.COMBOBOX_TYPE__ITEM:
				return item != null && !item.isEmpty();
			case FormPackage.COMBOBOX_TYPE__AUTO_COMPLETE:
				return isSetAutoComplete();
			case FormPackage.COMBOBOX_TYPE__BIND:
				return BIND_EDEFAULT == null ? bind != null : !BIND_EDEFAULT.equals(bind);
			case FormPackage.COMBOBOX_TYPE__CONTROL_IMPLEMENTATION:
				return CONTROL_IMPLEMENTATION_EDEFAULT == null ? controlImplementation != null : !CONTROL_IMPLEMENTATION_EDEFAULT.equals(controlImplementation);
			case FormPackage.COMBOBOX_TYPE__CONVERT_EMPTY_TO_NULL:
				return isSetConvertEmptyToNull();
			case FormPackage.COMBOBOX_TYPE__CURRENT_VALUE:
				return CURRENT_VALUE_EDEFAULT == null ? currentValue != null : !CURRENT_VALUE_EDEFAULT.equals(currentValue);
			case FormPackage.COMBOBOX_TYPE__DATA_FIELD:
				return DATA_FIELD_EDEFAULT == null ? dataField != null : !DATA_FIELD_EDEFAULT.equals(dataField);
			case FormPackage.COMBOBOX_TYPE__DISABLED:
				return isSetDisabled();
			case FormPackage.COMBOBOX_TYPE__DROPDOWN:
				return isSetDropdown();
			case FormPackage.COMBOBOX_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case FormPackage.COMBOBOX_TYPE__LIST_SOURCE:
				return LIST_SOURCE_EDEFAULT == null ? listSource != null : !LIST_SOURCE_EDEFAULT.equals(listSource);
			case FormPackage.COMBOBOX_TYPE__LIST_SOURCE_TYPE:
				return isSetListSourceType();
			case FormPackage.COMBOBOX_TYPE__MAX_LENGTH:
				return MAX_LENGTH_EDEFAULT == null ? maxLength != null : !MAX_LENGTH_EDEFAULT.equals(maxLength);
			case FormPackage.COMBOBOX_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case FormPackage.COMBOBOX_TYPE__PRINTABLE:
				return isSetPrintable();
			case FormPackage.COMBOBOX_TYPE__READONLY:
				return isSetReadonly();
			case FormPackage.COMBOBOX_TYPE__SIZE:
				return SIZE_EDEFAULT == null ? size != null : !SIZE_EDEFAULT.equals(size);
			case FormPackage.COMBOBOX_TYPE__TAB_INDEX:
				return isSetTabIndex();
			case FormPackage.COMBOBOX_TYPE__TAB_STOP:
				return isSetTabStop();
			case FormPackage.COMBOBOX_TYPE__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case FormPackage.COMBOBOX_TYPE__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
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
		result.append(" (autoComplete: ");
		if (autoCompleteESet) result.append(autoComplete); else result.append("<unset>");
		result.append(", bind: ");
		result.append(bind);
		result.append(", controlImplementation: ");
		result.append(controlImplementation);
		result.append(", convertEmptyToNull: ");
		if (convertEmptyToNullESet) result.append(convertEmptyToNull); else result.append("<unset>");
		result.append(", currentValue: ");
		result.append(currentValue);
		result.append(", dataField: ");
		result.append(dataField);
		result.append(", disabled: ");
		if (disabledESet) result.append(disabled); else result.append("<unset>");
		result.append(", dropdown: ");
		if (dropdownESet) result.append(dropdown); else result.append("<unset>");
		result.append(", id: ");
		result.append(id);
		result.append(", listSource: ");
		result.append(listSource);
		result.append(", listSourceType: ");
		if (listSourceTypeESet) result.append(listSourceType); else result.append("<unset>");
		result.append(", maxLength: ");
		result.append(maxLength);
		result.append(", name: ");
		result.append(name);
		result.append(", printable: ");
		if (printableESet) result.append(printable); else result.append("<unset>");
		result.append(", readonly: ");
		if (readonlyESet) result.append(readonly); else result.append("<unset>");
		result.append(", size: ");
		result.append(size);
		result.append(", tabIndex: ");
		if (tabIndexESet) result.append(tabIndex); else result.append("<unset>");
		result.append(", tabStop: ");
		if (tabStopESet) result.append(tabStop); else result.append("<unset>");
		result.append(", title: ");
		result.append(title);
		result.append(", value: ");
		result.append(value);
		result.append(')');
		return result.toString();
	}

} //ComboboxTypeImpl
