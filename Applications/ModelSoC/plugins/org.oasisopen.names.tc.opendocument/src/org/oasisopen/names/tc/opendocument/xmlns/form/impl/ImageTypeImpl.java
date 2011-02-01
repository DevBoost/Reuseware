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
import org.oasisopen.names.tc.opendocument.xmlns.form.ImageType;
import org.oasisopen.names.tc.opendocument.xmlns.text.Types;
import org.oasisopen.names.tc.opendocument.xmlns.text.impl.CommonFormControlContentImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Image Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.ImageTypeImpl#getBind <em>Bind</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.ImageTypeImpl#getButtonType <em>Button Type</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.ImageTypeImpl#getControlImplementation <em>Control Implementation</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.ImageTypeImpl#getDisabled <em>Disabled</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.ImageTypeImpl#getHref <em>Href</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.ImageTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.ImageTypeImpl#getImageData <em>Image Data</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.ImageTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.ImageTypeImpl#getPrintable <em>Printable</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.ImageTypeImpl#getTabIndex <em>Tab Index</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.ImageTypeImpl#getTabStop <em>Tab Stop</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.ImageTypeImpl#getTargetFrame <em>Target Frame</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.ImageTypeImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.ImageTypeImpl#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ImageTypeImpl extends CommonFormControlContentImpl implements ImageType {
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
	 * The default value of the '{@link #getButtonType() <em>Button Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getButtonType()
	 * @generated
	 * @ordered
	 */
	protected static final Types BUTTON_TYPE_EDEFAULT = Types.PUSH;

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
	protected ImageTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FormPackage.eINSTANCE.getImageType();
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
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.IMAGE_TYPE__BIND, oldBind, bind));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.IMAGE_TYPE__BUTTON_TYPE, oldButtonType, buttonType, !oldButtonTypeESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, FormPackage.IMAGE_TYPE__BUTTON_TYPE, oldButtonType, BUTTON_TYPE_EDEFAULT, oldButtonTypeESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.IMAGE_TYPE__CONTROL_IMPLEMENTATION, oldControlImplementation, controlImplementation));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.IMAGE_TYPE__DISABLED, oldDisabled, disabled, !oldDisabledESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, FormPackage.IMAGE_TYPE__DISABLED, oldDisabled, DISABLED_EDEFAULT, oldDisabledESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.IMAGE_TYPE__HREF, oldHref, href));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.IMAGE_TYPE__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.IMAGE_TYPE__IMAGE_DATA, oldImageData, imageData));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.IMAGE_TYPE__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.IMAGE_TYPE__PRINTABLE, oldPrintable, printable, !oldPrintableESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, FormPackage.IMAGE_TYPE__PRINTABLE, oldPrintable, PRINTABLE_EDEFAULT, oldPrintableESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.IMAGE_TYPE__TAB_INDEX, oldTabIndex, tabIndex, !oldTabIndexESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, FormPackage.IMAGE_TYPE__TAB_INDEX, oldTabIndex, TAB_INDEX_EDEFAULT, oldTabIndexESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.IMAGE_TYPE__TAB_STOP, oldTabStop, tabStop, !oldTabStopESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, FormPackage.IMAGE_TYPE__TAB_STOP, oldTabStop, TAB_STOP_EDEFAULT, oldTabStopESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.IMAGE_TYPE__TARGET_FRAME, oldTargetFrame, targetFrame, !oldTargetFrameESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, FormPackage.IMAGE_TYPE__TARGET_FRAME, oldTargetFrame, TARGET_FRAME_EDEFAULT, oldTargetFrameESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.IMAGE_TYPE__TITLE, oldTitle, title));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.IMAGE_TYPE__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FormPackage.IMAGE_TYPE__BIND:
				return getBind();
			case FormPackage.IMAGE_TYPE__BUTTON_TYPE:
				return getButtonType();
			case FormPackage.IMAGE_TYPE__CONTROL_IMPLEMENTATION:
				return getControlImplementation();
			case FormPackage.IMAGE_TYPE__DISABLED:
				return getDisabled();
			case FormPackage.IMAGE_TYPE__HREF:
				return getHref();
			case FormPackage.IMAGE_TYPE__ID:
				return getId();
			case FormPackage.IMAGE_TYPE__IMAGE_DATA:
				return getImageData();
			case FormPackage.IMAGE_TYPE__NAME:
				return getName();
			case FormPackage.IMAGE_TYPE__PRINTABLE:
				return getPrintable();
			case FormPackage.IMAGE_TYPE__TAB_INDEX:
				return getTabIndex();
			case FormPackage.IMAGE_TYPE__TAB_STOP:
				return getTabStop();
			case FormPackage.IMAGE_TYPE__TARGET_FRAME:
				return getTargetFrame();
			case FormPackage.IMAGE_TYPE__TITLE:
				return getTitle();
			case FormPackage.IMAGE_TYPE__VALUE:
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
			case FormPackage.IMAGE_TYPE__BIND:
				setBind((String)newValue);
				return;
			case FormPackage.IMAGE_TYPE__BUTTON_TYPE:
				setButtonType((Types)newValue);
				return;
			case FormPackage.IMAGE_TYPE__CONTROL_IMPLEMENTATION:
				setControlImplementation((String)newValue);
				return;
			case FormPackage.IMAGE_TYPE__DISABLED:
				setDisabled((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case FormPackage.IMAGE_TYPE__HREF:
				setHref((String)newValue);
				return;
			case FormPackage.IMAGE_TYPE__ID:
				setId((String)newValue);
				return;
			case FormPackage.IMAGE_TYPE__IMAGE_DATA:
				setImageData((String)newValue);
				return;
			case FormPackage.IMAGE_TYPE__NAME:
				setName((String)newValue);
				return;
			case FormPackage.IMAGE_TYPE__PRINTABLE:
				setPrintable((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case FormPackage.IMAGE_TYPE__TAB_INDEX:
				setTabIndex((BigInteger)newValue);
				return;
			case FormPackage.IMAGE_TYPE__TAB_STOP:
				setTabStop((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case FormPackage.IMAGE_TYPE__TARGET_FRAME:
				setTargetFrame(newValue);
				return;
			case FormPackage.IMAGE_TYPE__TITLE:
				setTitle(newValue);
				return;
			case FormPackage.IMAGE_TYPE__VALUE:
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
			case FormPackage.IMAGE_TYPE__BIND:
				setBind(BIND_EDEFAULT);
				return;
			case FormPackage.IMAGE_TYPE__BUTTON_TYPE:
				unsetButtonType();
				return;
			case FormPackage.IMAGE_TYPE__CONTROL_IMPLEMENTATION:
				setControlImplementation(CONTROL_IMPLEMENTATION_EDEFAULT);
				return;
			case FormPackage.IMAGE_TYPE__DISABLED:
				unsetDisabled();
				return;
			case FormPackage.IMAGE_TYPE__HREF:
				setHref(HREF_EDEFAULT);
				return;
			case FormPackage.IMAGE_TYPE__ID:
				setId(ID_EDEFAULT);
				return;
			case FormPackage.IMAGE_TYPE__IMAGE_DATA:
				setImageData(IMAGE_DATA_EDEFAULT);
				return;
			case FormPackage.IMAGE_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case FormPackage.IMAGE_TYPE__PRINTABLE:
				unsetPrintable();
				return;
			case FormPackage.IMAGE_TYPE__TAB_INDEX:
				unsetTabIndex();
				return;
			case FormPackage.IMAGE_TYPE__TAB_STOP:
				unsetTabStop();
				return;
			case FormPackage.IMAGE_TYPE__TARGET_FRAME:
				unsetTargetFrame();
				return;
			case FormPackage.IMAGE_TYPE__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case FormPackage.IMAGE_TYPE__VALUE:
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
			case FormPackage.IMAGE_TYPE__BIND:
				return BIND_EDEFAULT == null ? bind != null : !BIND_EDEFAULT.equals(bind);
			case FormPackage.IMAGE_TYPE__BUTTON_TYPE:
				return isSetButtonType();
			case FormPackage.IMAGE_TYPE__CONTROL_IMPLEMENTATION:
				return CONTROL_IMPLEMENTATION_EDEFAULT == null ? controlImplementation != null : !CONTROL_IMPLEMENTATION_EDEFAULT.equals(controlImplementation);
			case FormPackage.IMAGE_TYPE__DISABLED:
				return isSetDisabled();
			case FormPackage.IMAGE_TYPE__HREF:
				return HREF_EDEFAULT == null ? href != null : !HREF_EDEFAULT.equals(href);
			case FormPackage.IMAGE_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case FormPackage.IMAGE_TYPE__IMAGE_DATA:
				return IMAGE_DATA_EDEFAULT == null ? imageData != null : !IMAGE_DATA_EDEFAULT.equals(imageData);
			case FormPackage.IMAGE_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case FormPackage.IMAGE_TYPE__PRINTABLE:
				return isSetPrintable();
			case FormPackage.IMAGE_TYPE__TAB_INDEX:
				return isSetTabIndex();
			case FormPackage.IMAGE_TYPE__TAB_STOP:
				return isSetTabStop();
			case FormPackage.IMAGE_TYPE__TARGET_FRAME:
				return isSetTargetFrame();
			case FormPackage.IMAGE_TYPE__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case FormPackage.IMAGE_TYPE__VALUE:
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
		result.append(", buttonType: ");
		if (buttonTypeESet) result.append(buttonType); else result.append("<unset>");
		result.append(", controlImplementation: ");
		result.append(controlImplementation);
		result.append(", disabled: ");
		if (disabledESet) result.append(disabled); else result.append("<unset>");
		result.append(", href: ");
		result.append(href);
		result.append(", id: ");
		result.append(id);
		result.append(", imageData: ");
		result.append(imageData);
		result.append(", name: ");
		result.append(name);
		result.append(", printable: ");
		if (printableESet) result.append(printable); else result.append("<unset>");
		result.append(", tabIndex: ");
		if (tabIndexESet) result.append(tabIndex); else result.append("<unset>");
		result.append(", tabStop: ");
		if (tabStopESet) result.append(tabStop); else result.append("<unset>");
		result.append(", targetFrame: ");
		if (targetFrameESet) result.append(targetFrame); else result.append("<unset>");
		result.append(", title: ");
		result.append(title);
		result.append(", value: ");
		result.append(value);
		result.append(')');
		return result.toString();
	}

} //ImageTypeImpl
