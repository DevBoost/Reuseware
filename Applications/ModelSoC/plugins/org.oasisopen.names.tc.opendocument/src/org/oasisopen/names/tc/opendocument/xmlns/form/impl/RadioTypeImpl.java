/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.form.impl;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.oasisopen.names.tc.opendocument.xmlns.form.FormPackage;
import org.oasisopen.names.tc.opendocument.xmlns.form.ImageAlignType;
import org.oasisopen.names.tc.opendocument.xmlns.form.ImagePositionType;
import org.oasisopen.names.tc.opendocument.xmlns.form.RadioType;
import org.oasisopen.names.tc.opendocument.xmlns.form.VisualEffectType;
import org.oasisopen.names.tc.opendocument.xmlns.text.impl.CommonFormControlContentImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Radio Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.RadioTypeImpl#getBind <em>Bind</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.RadioTypeImpl#getControlImplementation <em>Control Implementation</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.RadioTypeImpl#getCurrentSelected <em>Current Selected</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.RadioTypeImpl#getDataField <em>Data Field</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.RadioTypeImpl#getDisabled <em>Disabled</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.RadioTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.RadioTypeImpl#getImageAlign <em>Image Align</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.RadioTypeImpl#getImagePosition <em>Image Position</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.RadioTypeImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.RadioTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.RadioTypeImpl#getPrintable <em>Printable</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.RadioTypeImpl#getSelected <em>Selected</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.RadioTypeImpl#getTabIndex <em>Tab Index</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.RadioTypeImpl#getTabStop <em>Tab Stop</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.RadioTypeImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.RadioTypeImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.RadioTypeImpl#getVisualEffect <em>Visual Effect</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RadioTypeImpl extends CommonFormControlContentImpl implements RadioType {
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
	 * The default value of the '{@link #getCurrentSelected() <em>Current Selected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentSelected()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean CURRENT_SELECTED_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.FALSE;

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
	 * The default value of the '{@link #getImageAlign() <em>Image Align</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImageAlign()
	 * @generated
	 * @ordered
	 */
	protected static final ImageAlignType IMAGE_ALIGN_EDEFAULT = ImageAlignType.CENTER;

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
	 * The default value of the '{@link #getSelected() <em>Selected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelected()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean SELECTED_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.FALSE;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RadioTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FormPackage.eINSTANCE.getRadioType();
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
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.RADIO_TYPE__BIND, oldBind, bind));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.RADIO_TYPE__CONTROL_IMPLEMENTATION, oldControlImplementation, controlImplementation));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.RADIO_TYPE__CURRENT_SELECTED, oldCurrentSelected, currentSelected, !oldCurrentSelectedESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, FormPackage.RADIO_TYPE__CURRENT_SELECTED, oldCurrentSelected, CURRENT_SELECTED_EDEFAULT, oldCurrentSelectedESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.RADIO_TYPE__DATA_FIELD, oldDataField, dataField));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.RADIO_TYPE__DISABLED, oldDisabled, disabled, !oldDisabledESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, FormPackage.RADIO_TYPE__DISABLED, oldDisabled, DISABLED_EDEFAULT, oldDisabledESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.RADIO_TYPE__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.RADIO_TYPE__IMAGE_ALIGN, oldImageAlign, imageAlign, !oldImageAlignESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, FormPackage.RADIO_TYPE__IMAGE_ALIGN, oldImageAlign, IMAGE_ALIGN_EDEFAULT, oldImageAlignESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.RADIO_TYPE__IMAGE_POSITION, oldImagePosition, imagePosition, !oldImagePositionESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, FormPackage.RADIO_TYPE__IMAGE_POSITION, oldImagePosition, IMAGE_POSITION_EDEFAULT, oldImagePositionESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.RADIO_TYPE__LABEL, oldLabel, label));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.RADIO_TYPE__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.RADIO_TYPE__PRINTABLE, oldPrintable, printable, !oldPrintableESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, FormPackage.RADIO_TYPE__PRINTABLE, oldPrintable, PRINTABLE_EDEFAULT, oldPrintableESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.RADIO_TYPE__SELECTED, oldSelected, selected, !oldSelectedESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, FormPackage.RADIO_TYPE__SELECTED, oldSelected, SELECTED_EDEFAULT, oldSelectedESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.RADIO_TYPE__TAB_INDEX, oldTabIndex, tabIndex, !oldTabIndexESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, FormPackage.RADIO_TYPE__TAB_INDEX, oldTabIndex, TAB_INDEX_EDEFAULT, oldTabIndexESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.RADIO_TYPE__TAB_STOP, oldTabStop, tabStop, !oldTabStopESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, FormPackage.RADIO_TYPE__TAB_STOP, oldTabStop, TAB_STOP_EDEFAULT, oldTabStopESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.RADIO_TYPE__TITLE, oldTitle, title));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.RADIO_TYPE__VALUE, oldValue, value));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.RADIO_TYPE__VISUAL_EFFECT, oldVisualEffect, visualEffect, !oldVisualEffectESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, FormPackage.RADIO_TYPE__VISUAL_EFFECT, oldVisualEffect, VISUAL_EFFECT_EDEFAULT, oldVisualEffectESet));
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
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FormPackage.RADIO_TYPE__BIND:
				return getBind();
			case FormPackage.RADIO_TYPE__CONTROL_IMPLEMENTATION:
				return getControlImplementation();
			case FormPackage.RADIO_TYPE__CURRENT_SELECTED:
				return getCurrentSelected();
			case FormPackage.RADIO_TYPE__DATA_FIELD:
				return getDataField();
			case FormPackage.RADIO_TYPE__DISABLED:
				return getDisabled();
			case FormPackage.RADIO_TYPE__ID:
				return getId();
			case FormPackage.RADIO_TYPE__IMAGE_ALIGN:
				return getImageAlign();
			case FormPackage.RADIO_TYPE__IMAGE_POSITION:
				return getImagePosition();
			case FormPackage.RADIO_TYPE__LABEL:
				return getLabel();
			case FormPackage.RADIO_TYPE__NAME:
				return getName();
			case FormPackage.RADIO_TYPE__PRINTABLE:
				return getPrintable();
			case FormPackage.RADIO_TYPE__SELECTED:
				return getSelected();
			case FormPackage.RADIO_TYPE__TAB_INDEX:
				return getTabIndex();
			case FormPackage.RADIO_TYPE__TAB_STOP:
				return getTabStop();
			case FormPackage.RADIO_TYPE__TITLE:
				return getTitle();
			case FormPackage.RADIO_TYPE__VALUE:
				return getValue();
			case FormPackage.RADIO_TYPE__VISUAL_EFFECT:
				return getVisualEffect();
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
			case FormPackage.RADIO_TYPE__BIND:
				setBind((String)newValue);
				return;
			case FormPackage.RADIO_TYPE__CONTROL_IMPLEMENTATION:
				setControlImplementation((String)newValue);
				return;
			case FormPackage.RADIO_TYPE__CURRENT_SELECTED:
				setCurrentSelected((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case FormPackage.RADIO_TYPE__DATA_FIELD:
				setDataField((String)newValue);
				return;
			case FormPackage.RADIO_TYPE__DISABLED:
				setDisabled((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case FormPackage.RADIO_TYPE__ID:
				setId((String)newValue);
				return;
			case FormPackage.RADIO_TYPE__IMAGE_ALIGN:
				setImageAlign((ImageAlignType)newValue);
				return;
			case FormPackage.RADIO_TYPE__IMAGE_POSITION:
				setImagePosition((ImagePositionType)newValue);
				return;
			case FormPackage.RADIO_TYPE__LABEL:
				setLabel((String)newValue);
				return;
			case FormPackage.RADIO_TYPE__NAME:
				setName((String)newValue);
				return;
			case FormPackage.RADIO_TYPE__PRINTABLE:
				setPrintable((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case FormPackage.RADIO_TYPE__SELECTED:
				setSelected((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case FormPackage.RADIO_TYPE__TAB_INDEX:
				setTabIndex((BigInteger)newValue);
				return;
			case FormPackage.RADIO_TYPE__TAB_STOP:
				setTabStop((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case FormPackage.RADIO_TYPE__TITLE:
				setTitle(newValue);
				return;
			case FormPackage.RADIO_TYPE__VALUE:
				setValue((String)newValue);
				return;
			case FormPackage.RADIO_TYPE__VISUAL_EFFECT:
				setVisualEffect((VisualEffectType)newValue);
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
			case FormPackage.RADIO_TYPE__BIND:
				setBind(BIND_EDEFAULT);
				return;
			case FormPackage.RADIO_TYPE__CONTROL_IMPLEMENTATION:
				setControlImplementation(CONTROL_IMPLEMENTATION_EDEFAULT);
				return;
			case FormPackage.RADIO_TYPE__CURRENT_SELECTED:
				unsetCurrentSelected();
				return;
			case FormPackage.RADIO_TYPE__DATA_FIELD:
				setDataField(DATA_FIELD_EDEFAULT);
				return;
			case FormPackage.RADIO_TYPE__DISABLED:
				unsetDisabled();
				return;
			case FormPackage.RADIO_TYPE__ID:
				setId(ID_EDEFAULT);
				return;
			case FormPackage.RADIO_TYPE__IMAGE_ALIGN:
				unsetImageAlign();
				return;
			case FormPackage.RADIO_TYPE__IMAGE_POSITION:
				unsetImagePosition();
				return;
			case FormPackage.RADIO_TYPE__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case FormPackage.RADIO_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case FormPackage.RADIO_TYPE__PRINTABLE:
				unsetPrintable();
				return;
			case FormPackage.RADIO_TYPE__SELECTED:
				unsetSelected();
				return;
			case FormPackage.RADIO_TYPE__TAB_INDEX:
				unsetTabIndex();
				return;
			case FormPackage.RADIO_TYPE__TAB_STOP:
				unsetTabStop();
				return;
			case FormPackage.RADIO_TYPE__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case FormPackage.RADIO_TYPE__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case FormPackage.RADIO_TYPE__VISUAL_EFFECT:
				unsetVisualEffect();
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
			case FormPackage.RADIO_TYPE__BIND:
				return BIND_EDEFAULT == null ? bind != null : !BIND_EDEFAULT.equals(bind);
			case FormPackage.RADIO_TYPE__CONTROL_IMPLEMENTATION:
				return CONTROL_IMPLEMENTATION_EDEFAULT == null ? controlImplementation != null : !CONTROL_IMPLEMENTATION_EDEFAULT.equals(controlImplementation);
			case FormPackage.RADIO_TYPE__CURRENT_SELECTED:
				return isSetCurrentSelected();
			case FormPackage.RADIO_TYPE__DATA_FIELD:
				return DATA_FIELD_EDEFAULT == null ? dataField != null : !DATA_FIELD_EDEFAULT.equals(dataField);
			case FormPackage.RADIO_TYPE__DISABLED:
				return isSetDisabled();
			case FormPackage.RADIO_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case FormPackage.RADIO_TYPE__IMAGE_ALIGN:
				return isSetImageAlign();
			case FormPackage.RADIO_TYPE__IMAGE_POSITION:
				return isSetImagePosition();
			case FormPackage.RADIO_TYPE__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case FormPackage.RADIO_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case FormPackage.RADIO_TYPE__PRINTABLE:
				return isSetPrintable();
			case FormPackage.RADIO_TYPE__SELECTED:
				return isSetSelected();
			case FormPackage.RADIO_TYPE__TAB_INDEX:
				return isSetTabIndex();
			case FormPackage.RADIO_TYPE__TAB_STOP:
				return isSetTabStop();
			case FormPackage.RADIO_TYPE__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case FormPackage.RADIO_TYPE__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case FormPackage.RADIO_TYPE__VISUAL_EFFECT:
				return isSetVisualEffect();
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
		result.append(", currentSelected: ");
		if (currentSelectedESet) result.append(currentSelected); else result.append("<unset>");
		result.append(", dataField: ");
		result.append(dataField);
		result.append(", disabled: ");
		if (disabledESet) result.append(disabled); else result.append("<unset>");
		result.append(", id: ");
		result.append(id);
		result.append(", imageAlign: ");
		if (imageAlignESet) result.append(imageAlign); else result.append("<unset>");
		result.append(", imagePosition: ");
		if (imagePositionESet) result.append(imagePosition); else result.append("<unset>");
		result.append(", label: ");
		result.append(label);
		result.append(", name: ");
		result.append(name);
		result.append(", printable: ");
		if (printableESet) result.append(printable); else result.append("<unset>");
		result.append(", selected: ");
		if (selectedESet) result.append(selected); else result.append("<unset>");
		result.append(", tabIndex: ");
		if (tabIndexESet) result.append(tabIndex); else result.append("<unset>");
		result.append(", tabStop: ");
		if (tabStopESet) result.append(tabStop); else result.append("<unset>");
		result.append(", title: ");
		result.append(title);
		result.append(", value: ");
		result.append(value);
		result.append(", visualEffect: ");
		if (visualEffectESet) result.append(visualEffect); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //RadioTypeImpl
