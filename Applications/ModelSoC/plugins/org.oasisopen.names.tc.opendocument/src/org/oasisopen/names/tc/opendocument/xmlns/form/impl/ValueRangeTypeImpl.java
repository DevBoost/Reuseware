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
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.oasisopen.names.tc.opendocument.xmlns.form.FormPackage;
import org.oasisopen.names.tc.opendocument.xmlns.form.OrientationType;
import org.oasisopen.names.tc.opendocument.xmlns.form.ValueRangeType;
import org.oasisopen.names.tc.opendocument.xmlns.text.impl.CommonFormControlContentImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Value Range Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.ValueRangeTypeImpl#getBind <em>Bind</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.ValueRangeTypeImpl#getControlImplementation <em>Control Implementation</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.ValueRangeTypeImpl#getDelayForRepeat <em>Delay For Repeat</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.ValueRangeTypeImpl#getDisabled <em>Disabled</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.ValueRangeTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.ValueRangeTypeImpl#getMaxValue <em>Max Value</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.ValueRangeTypeImpl#getMinValue <em>Min Value</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.ValueRangeTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.ValueRangeTypeImpl#getOrientation <em>Orientation</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.ValueRangeTypeImpl#getPageStepSize <em>Page Step Size</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.ValueRangeTypeImpl#getPrintable <em>Printable</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.ValueRangeTypeImpl#getStepSize <em>Step Size</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.ValueRangeTypeImpl#getTabIndex <em>Tab Index</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.ValueRangeTypeImpl#getTabStop <em>Tab Stop</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.ValueRangeTypeImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.ValueRangeTypeImpl#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ValueRangeTypeImpl extends CommonFormControlContentImpl implements ValueRangeType {
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
	 * The default value of the '{@link #getMaxValue() <em>Max Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxValue()
	 * @generated
	 * @ordered
	 */
	protected static final String MAX_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxValue() <em>Max Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxValue()
	 * @generated
	 * @ordered
	 */
	protected String maxValue = MAX_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinValue() <em>Min Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinValue()
	 * @generated
	 * @ordered
	 */
	protected static final String MIN_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMinValue() <em>Min Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinValue()
	 * @generated
	 * @ordered
	 */
	protected String minValue = MIN_VALUE_EDEFAULT;

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
	protected ValueRangeTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FormPackage.eINSTANCE.getValueRangeType();
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
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.VALUE_RANGE_TYPE__BIND, oldBind, bind));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.VALUE_RANGE_TYPE__CONTROL_IMPLEMENTATION, oldControlImplementation, controlImplementation));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.VALUE_RANGE_TYPE__DELAY_FOR_REPEAT, oldDelayForRepeat, delayForRepeat));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.VALUE_RANGE_TYPE__DISABLED, oldDisabled, disabled, !oldDisabledESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, FormPackage.VALUE_RANGE_TYPE__DISABLED, oldDisabled, DISABLED_EDEFAULT, oldDisabledESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.VALUE_RANGE_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMaxValue() {
		return maxValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxValue(String newMaxValue) {
		String oldMaxValue = maxValue;
		maxValue = newMaxValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.VALUE_RANGE_TYPE__MAX_VALUE, oldMaxValue, maxValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMinValue() {
		return minValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinValue(String newMinValue) {
		String oldMinValue = minValue;
		minValue = newMinValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.VALUE_RANGE_TYPE__MIN_VALUE, oldMinValue, minValue));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.VALUE_RANGE_TYPE__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.VALUE_RANGE_TYPE__ORIENTATION, oldOrientation, orientation, !oldOrientationESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, FormPackage.VALUE_RANGE_TYPE__ORIENTATION, oldOrientation, ORIENTATION_EDEFAULT, oldOrientationESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.VALUE_RANGE_TYPE__PAGE_STEP_SIZE, oldPageStepSize, pageStepSize));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.VALUE_RANGE_TYPE__PRINTABLE, oldPrintable, printable, !oldPrintableESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, FormPackage.VALUE_RANGE_TYPE__PRINTABLE, oldPrintable, PRINTABLE_EDEFAULT, oldPrintableESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.VALUE_RANGE_TYPE__STEP_SIZE, oldStepSize, stepSize));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.VALUE_RANGE_TYPE__TAB_INDEX, oldTabIndex, tabIndex, !oldTabIndexESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, FormPackage.VALUE_RANGE_TYPE__TAB_INDEX, oldTabIndex, TAB_INDEX_EDEFAULT, oldTabIndexESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.VALUE_RANGE_TYPE__TAB_STOP, oldTabStop, tabStop, !oldTabStopESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, FormPackage.VALUE_RANGE_TYPE__TAB_STOP, oldTabStop, TAB_STOP_EDEFAULT, oldTabStopESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.VALUE_RANGE_TYPE__TITLE, oldTitle, title));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.VALUE_RANGE_TYPE__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FormPackage.VALUE_RANGE_TYPE__BIND:
				return getBind();
			case FormPackage.VALUE_RANGE_TYPE__CONTROL_IMPLEMENTATION:
				return getControlImplementation();
			case FormPackage.VALUE_RANGE_TYPE__DELAY_FOR_REPEAT:
				return getDelayForRepeat();
			case FormPackage.VALUE_RANGE_TYPE__DISABLED:
				return getDisabled();
			case FormPackage.VALUE_RANGE_TYPE__ID:
				return getId();
			case FormPackage.VALUE_RANGE_TYPE__MAX_VALUE:
				return getMaxValue();
			case FormPackage.VALUE_RANGE_TYPE__MIN_VALUE:
				return getMinValue();
			case FormPackage.VALUE_RANGE_TYPE__NAME:
				return getName();
			case FormPackage.VALUE_RANGE_TYPE__ORIENTATION:
				return getOrientation();
			case FormPackage.VALUE_RANGE_TYPE__PAGE_STEP_SIZE:
				return getPageStepSize();
			case FormPackage.VALUE_RANGE_TYPE__PRINTABLE:
				return getPrintable();
			case FormPackage.VALUE_RANGE_TYPE__STEP_SIZE:
				return getStepSize();
			case FormPackage.VALUE_RANGE_TYPE__TAB_INDEX:
				return getTabIndex();
			case FormPackage.VALUE_RANGE_TYPE__TAB_STOP:
				return getTabStop();
			case FormPackage.VALUE_RANGE_TYPE__TITLE:
				return getTitle();
			case FormPackage.VALUE_RANGE_TYPE__VALUE:
				return getValue();
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
			case FormPackage.VALUE_RANGE_TYPE__BIND:
				setBind((String)newValue);
				return;
			case FormPackage.VALUE_RANGE_TYPE__CONTROL_IMPLEMENTATION:
				setControlImplementation((String)newValue);
				return;
			case FormPackage.VALUE_RANGE_TYPE__DELAY_FOR_REPEAT:
				setDelayForRepeat((Duration)newValue);
				return;
			case FormPackage.VALUE_RANGE_TYPE__DISABLED:
				setDisabled((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case FormPackage.VALUE_RANGE_TYPE__ID:
				setId((String)newValue);
				return;
			case FormPackage.VALUE_RANGE_TYPE__MAX_VALUE:
				setMaxValue((String)newValue);
				return;
			case FormPackage.VALUE_RANGE_TYPE__MIN_VALUE:
				setMinValue((String)newValue);
				return;
			case FormPackage.VALUE_RANGE_TYPE__NAME:
				setName((String)newValue);
				return;
			case FormPackage.VALUE_RANGE_TYPE__ORIENTATION:
				setOrientation((OrientationType)newValue);
				return;
			case FormPackage.VALUE_RANGE_TYPE__PAGE_STEP_SIZE:
				setPageStepSize((BigInteger)newValue);
				return;
			case FormPackage.VALUE_RANGE_TYPE__PRINTABLE:
				setPrintable((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case FormPackage.VALUE_RANGE_TYPE__STEP_SIZE:
				setStepSize((BigInteger)newValue);
				return;
			case FormPackage.VALUE_RANGE_TYPE__TAB_INDEX:
				setTabIndex((BigInteger)newValue);
				return;
			case FormPackage.VALUE_RANGE_TYPE__TAB_STOP:
				setTabStop((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case FormPackage.VALUE_RANGE_TYPE__TITLE:
				setTitle(newValue);
				return;
			case FormPackage.VALUE_RANGE_TYPE__VALUE:
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
			case FormPackage.VALUE_RANGE_TYPE__BIND:
				setBind(BIND_EDEFAULT);
				return;
			case FormPackage.VALUE_RANGE_TYPE__CONTROL_IMPLEMENTATION:
				setControlImplementation(CONTROL_IMPLEMENTATION_EDEFAULT);
				return;
			case FormPackage.VALUE_RANGE_TYPE__DELAY_FOR_REPEAT:
				setDelayForRepeat(DELAY_FOR_REPEAT_EDEFAULT);
				return;
			case FormPackage.VALUE_RANGE_TYPE__DISABLED:
				unsetDisabled();
				return;
			case FormPackage.VALUE_RANGE_TYPE__ID:
				setId(ID_EDEFAULT);
				return;
			case FormPackage.VALUE_RANGE_TYPE__MAX_VALUE:
				setMaxValue(MAX_VALUE_EDEFAULT);
				return;
			case FormPackage.VALUE_RANGE_TYPE__MIN_VALUE:
				setMinValue(MIN_VALUE_EDEFAULT);
				return;
			case FormPackage.VALUE_RANGE_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case FormPackage.VALUE_RANGE_TYPE__ORIENTATION:
				unsetOrientation();
				return;
			case FormPackage.VALUE_RANGE_TYPE__PAGE_STEP_SIZE:
				setPageStepSize(PAGE_STEP_SIZE_EDEFAULT);
				return;
			case FormPackage.VALUE_RANGE_TYPE__PRINTABLE:
				unsetPrintable();
				return;
			case FormPackage.VALUE_RANGE_TYPE__STEP_SIZE:
				setStepSize(STEP_SIZE_EDEFAULT);
				return;
			case FormPackage.VALUE_RANGE_TYPE__TAB_INDEX:
				unsetTabIndex();
				return;
			case FormPackage.VALUE_RANGE_TYPE__TAB_STOP:
				unsetTabStop();
				return;
			case FormPackage.VALUE_RANGE_TYPE__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case FormPackage.VALUE_RANGE_TYPE__VALUE:
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
			case FormPackage.VALUE_RANGE_TYPE__BIND:
				return BIND_EDEFAULT == null ? bind != null : !BIND_EDEFAULT.equals(bind);
			case FormPackage.VALUE_RANGE_TYPE__CONTROL_IMPLEMENTATION:
				return CONTROL_IMPLEMENTATION_EDEFAULT == null ? controlImplementation != null : !CONTROL_IMPLEMENTATION_EDEFAULT.equals(controlImplementation);
			case FormPackage.VALUE_RANGE_TYPE__DELAY_FOR_REPEAT:
				return DELAY_FOR_REPEAT_EDEFAULT == null ? delayForRepeat != null : !DELAY_FOR_REPEAT_EDEFAULT.equals(delayForRepeat);
			case FormPackage.VALUE_RANGE_TYPE__DISABLED:
				return isSetDisabled();
			case FormPackage.VALUE_RANGE_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case FormPackage.VALUE_RANGE_TYPE__MAX_VALUE:
				return MAX_VALUE_EDEFAULT == null ? maxValue != null : !MAX_VALUE_EDEFAULT.equals(maxValue);
			case FormPackage.VALUE_RANGE_TYPE__MIN_VALUE:
				return MIN_VALUE_EDEFAULT == null ? minValue != null : !MIN_VALUE_EDEFAULT.equals(minValue);
			case FormPackage.VALUE_RANGE_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case FormPackage.VALUE_RANGE_TYPE__ORIENTATION:
				return isSetOrientation();
			case FormPackage.VALUE_RANGE_TYPE__PAGE_STEP_SIZE:
				return PAGE_STEP_SIZE_EDEFAULT == null ? pageStepSize != null : !PAGE_STEP_SIZE_EDEFAULT.equals(pageStepSize);
			case FormPackage.VALUE_RANGE_TYPE__PRINTABLE:
				return isSetPrintable();
			case FormPackage.VALUE_RANGE_TYPE__STEP_SIZE:
				return STEP_SIZE_EDEFAULT == null ? stepSize != null : !STEP_SIZE_EDEFAULT.equals(stepSize);
			case FormPackage.VALUE_RANGE_TYPE__TAB_INDEX:
				return isSetTabIndex();
			case FormPackage.VALUE_RANGE_TYPE__TAB_STOP:
				return isSetTabStop();
			case FormPackage.VALUE_RANGE_TYPE__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case FormPackage.VALUE_RANGE_TYPE__VALUE:
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
		result.append(" (bind: ");
		result.append(bind);
		result.append(", controlImplementation: ");
		result.append(controlImplementation);
		result.append(", delayForRepeat: ");
		result.append(delayForRepeat);
		result.append(", disabled: ");
		if (disabledESet) result.append(disabled); else result.append("<unset>");
		result.append(", id: ");
		result.append(id);
		result.append(", maxValue: ");
		result.append(maxValue);
		result.append(", minValue: ");
		result.append(minValue);
		result.append(", name: ");
		result.append(name);
		result.append(", orientation: ");
		if (orientationESet) result.append(orientation); else result.append("<unset>");
		result.append(", pageStepSize: ");
		result.append(pageStepSize);
		result.append(", printable: ");
		if (printableESet) result.append(printable); else result.append("<unset>");
		result.append(", stepSize: ");
		result.append(stepSize);
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

} //ValueRangeTypeImpl
