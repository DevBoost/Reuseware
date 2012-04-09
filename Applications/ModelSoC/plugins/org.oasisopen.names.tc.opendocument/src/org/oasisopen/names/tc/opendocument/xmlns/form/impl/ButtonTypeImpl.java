/*******************************************************************************
 * Copyright (c) 2006-2012
 * Software Technology Group, Dresden University of Technology
 * DevBoost GmbH, Berlin, Amtsgericht Charlottenburg, HRB 140026
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *   Software Technology Group - TU Dresden, Germany;
 *   DevBoost GmbH - Berlin, Germany
 *      - initial API and implementation
 ******************************************************************************/
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
import org.oasisopen.names.tc.opendocument.xmlns.form.ButtonType;
import org.oasisopen.names.tc.opendocument.xmlns.form.FormPackage;
import org.oasisopen.names.tc.opendocument.xmlns.form.ImageAlignType;
import org.oasisopen.names.tc.opendocument.xmlns.form.ImagePositionType;
import org.oasisopen.names.tc.opendocument.xmlns.text.Types;
import org.oasisopen.names.tc.opendocument.xmlns.text.impl.CommonFormControlContentImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Button Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.ButtonTypeImpl#getBind <em>Bind</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.ButtonTypeImpl#getButtonType <em>Button Type</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.ButtonTypeImpl#getControlImplementation <em>Control Implementation</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.ButtonTypeImpl#getDefaultButton <em>Default Button</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.ButtonTypeImpl#getDisabled <em>Disabled</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.ButtonTypeImpl#getFocusOnClick <em>Focus On Click</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.ButtonTypeImpl#getHref <em>Href</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.ButtonTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.ButtonTypeImpl#getImageAlign <em>Image Align</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.ButtonTypeImpl#getImageData <em>Image Data</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.ButtonTypeImpl#getImagePosition <em>Image Position</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.ButtonTypeImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.ButtonTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.ButtonTypeImpl#getPrintable <em>Printable</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.ButtonTypeImpl#getTabIndex <em>Tab Index</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.ButtonTypeImpl#getTabStop <em>Tab Stop</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.ButtonTypeImpl#getTargetFrame <em>Target Frame</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.ButtonTypeImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.ButtonTypeImpl#getToggle <em>Toggle</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.ButtonTypeImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.ButtonTypeImpl#getXformsSubmission <em>Xforms Submission</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ButtonTypeImpl extends CommonFormControlContentImpl implements ButtonType {
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
	 * The default value of the '{@link #getDefaultButton() <em>Default Button</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultButton()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean DEFAULT_BUTTON_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.FALSE;

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
	protected ButtonTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FormPackage.eINSTANCE.getButtonType();
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
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.BUTTON_TYPE__BIND, oldBind, bind));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.BUTTON_TYPE__BUTTON_TYPE, oldButtonType, buttonType, !oldButtonTypeESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, FormPackage.BUTTON_TYPE__BUTTON_TYPE, oldButtonType, BUTTON_TYPE_EDEFAULT, oldButtonTypeESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.BUTTON_TYPE__CONTROL_IMPLEMENTATION, oldControlImplementation, controlImplementation));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.BUTTON_TYPE__DEFAULT_BUTTON, oldDefaultButton, defaultButton, !oldDefaultButtonESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, FormPackage.BUTTON_TYPE__DEFAULT_BUTTON, oldDefaultButton, DEFAULT_BUTTON_EDEFAULT, oldDefaultButtonESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.BUTTON_TYPE__DISABLED, oldDisabled, disabled, !oldDisabledESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, FormPackage.BUTTON_TYPE__DISABLED, oldDisabled, DISABLED_EDEFAULT, oldDisabledESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.BUTTON_TYPE__FOCUS_ON_CLICK, oldFocusOnClick, focusOnClick, !oldFocusOnClickESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, FormPackage.BUTTON_TYPE__FOCUS_ON_CLICK, oldFocusOnClick, FOCUS_ON_CLICK_EDEFAULT, oldFocusOnClickESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.BUTTON_TYPE__HREF, oldHref, href));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.BUTTON_TYPE__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.BUTTON_TYPE__IMAGE_ALIGN, oldImageAlign, imageAlign, !oldImageAlignESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, FormPackage.BUTTON_TYPE__IMAGE_ALIGN, oldImageAlign, IMAGE_ALIGN_EDEFAULT, oldImageAlignESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.BUTTON_TYPE__IMAGE_DATA, oldImageData, imageData));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.BUTTON_TYPE__IMAGE_POSITION, oldImagePosition, imagePosition, !oldImagePositionESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, FormPackage.BUTTON_TYPE__IMAGE_POSITION, oldImagePosition, IMAGE_POSITION_EDEFAULT, oldImagePositionESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.BUTTON_TYPE__LABEL, oldLabel, label));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.BUTTON_TYPE__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.BUTTON_TYPE__PRINTABLE, oldPrintable, printable, !oldPrintableESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, FormPackage.BUTTON_TYPE__PRINTABLE, oldPrintable, PRINTABLE_EDEFAULT, oldPrintableESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.BUTTON_TYPE__TAB_INDEX, oldTabIndex, tabIndex, !oldTabIndexESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, FormPackage.BUTTON_TYPE__TAB_INDEX, oldTabIndex, TAB_INDEX_EDEFAULT, oldTabIndexESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.BUTTON_TYPE__TAB_STOP, oldTabStop, tabStop, !oldTabStopESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, FormPackage.BUTTON_TYPE__TAB_STOP, oldTabStop, TAB_STOP_EDEFAULT, oldTabStopESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.BUTTON_TYPE__TARGET_FRAME, oldTargetFrame, targetFrame, !oldTargetFrameESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, FormPackage.BUTTON_TYPE__TARGET_FRAME, oldTargetFrame, TARGET_FRAME_EDEFAULT, oldTargetFrameESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.BUTTON_TYPE__TITLE, oldTitle, title));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.BUTTON_TYPE__TOGGLE, oldToggle, toggle, !oldToggleESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, FormPackage.BUTTON_TYPE__TOGGLE, oldToggle, TOGGLE_EDEFAULT, oldToggleESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.BUTTON_TYPE__VALUE, oldValue, value));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.BUTTON_TYPE__XFORMS_SUBMISSION, oldXformsSubmission, xformsSubmission));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FormPackage.BUTTON_TYPE__BIND:
				return getBind();
			case FormPackage.BUTTON_TYPE__BUTTON_TYPE:
				return getButtonType();
			case FormPackage.BUTTON_TYPE__CONTROL_IMPLEMENTATION:
				return getControlImplementation();
			case FormPackage.BUTTON_TYPE__DEFAULT_BUTTON:
				return getDefaultButton();
			case FormPackage.BUTTON_TYPE__DISABLED:
				return getDisabled();
			case FormPackage.BUTTON_TYPE__FOCUS_ON_CLICK:
				return getFocusOnClick();
			case FormPackage.BUTTON_TYPE__HREF:
				return getHref();
			case FormPackage.BUTTON_TYPE__ID:
				return getId();
			case FormPackage.BUTTON_TYPE__IMAGE_ALIGN:
				return getImageAlign();
			case FormPackage.BUTTON_TYPE__IMAGE_DATA:
				return getImageData();
			case FormPackage.BUTTON_TYPE__IMAGE_POSITION:
				return getImagePosition();
			case FormPackage.BUTTON_TYPE__LABEL:
				return getLabel();
			case FormPackage.BUTTON_TYPE__NAME:
				return getName();
			case FormPackage.BUTTON_TYPE__PRINTABLE:
				return getPrintable();
			case FormPackage.BUTTON_TYPE__TAB_INDEX:
				return getTabIndex();
			case FormPackage.BUTTON_TYPE__TAB_STOP:
				return getTabStop();
			case FormPackage.BUTTON_TYPE__TARGET_FRAME:
				return getTargetFrame();
			case FormPackage.BUTTON_TYPE__TITLE:
				return getTitle();
			case FormPackage.BUTTON_TYPE__TOGGLE:
				return getToggle();
			case FormPackage.BUTTON_TYPE__VALUE:
				return getValue();
			case FormPackage.BUTTON_TYPE__XFORMS_SUBMISSION:
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
			case FormPackage.BUTTON_TYPE__BIND:
				setBind((String)newValue);
				return;
			case FormPackage.BUTTON_TYPE__BUTTON_TYPE:
				setButtonType((Types)newValue);
				return;
			case FormPackage.BUTTON_TYPE__CONTROL_IMPLEMENTATION:
				setControlImplementation((String)newValue);
				return;
			case FormPackage.BUTTON_TYPE__DEFAULT_BUTTON:
				setDefaultButton((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case FormPackage.BUTTON_TYPE__DISABLED:
				setDisabled((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case FormPackage.BUTTON_TYPE__FOCUS_ON_CLICK:
				setFocusOnClick((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case FormPackage.BUTTON_TYPE__HREF:
				setHref((String)newValue);
				return;
			case FormPackage.BUTTON_TYPE__ID:
				setId((String)newValue);
				return;
			case FormPackage.BUTTON_TYPE__IMAGE_ALIGN:
				setImageAlign((ImageAlignType)newValue);
				return;
			case FormPackage.BUTTON_TYPE__IMAGE_DATA:
				setImageData((String)newValue);
				return;
			case FormPackage.BUTTON_TYPE__IMAGE_POSITION:
				setImagePosition((ImagePositionType)newValue);
				return;
			case FormPackage.BUTTON_TYPE__LABEL:
				setLabel((String)newValue);
				return;
			case FormPackage.BUTTON_TYPE__NAME:
				setName((String)newValue);
				return;
			case FormPackage.BUTTON_TYPE__PRINTABLE:
				setPrintable((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case FormPackage.BUTTON_TYPE__TAB_INDEX:
				setTabIndex((BigInteger)newValue);
				return;
			case FormPackage.BUTTON_TYPE__TAB_STOP:
				setTabStop((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case FormPackage.BUTTON_TYPE__TARGET_FRAME:
				setTargetFrame(newValue);
				return;
			case FormPackage.BUTTON_TYPE__TITLE:
				setTitle(newValue);
				return;
			case FormPackage.BUTTON_TYPE__TOGGLE:
				setToggle((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case FormPackage.BUTTON_TYPE__VALUE:
				setValue((String)newValue);
				return;
			case FormPackage.BUTTON_TYPE__XFORMS_SUBMISSION:
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
			case FormPackage.BUTTON_TYPE__BIND:
				setBind(BIND_EDEFAULT);
				return;
			case FormPackage.BUTTON_TYPE__BUTTON_TYPE:
				unsetButtonType();
				return;
			case FormPackage.BUTTON_TYPE__CONTROL_IMPLEMENTATION:
				setControlImplementation(CONTROL_IMPLEMENTATION_EDEFAULT);
				return;
			case FormPackage.BUTTON_TYPE__DEFAULT_BUTTON:
				unsetDefaultButton();
				return;
			case FormPackage.BUTTON_TYPE__DISABLED:
				unsetDisabled();
				return;
			case FormPackage.BUTTON_TYPE__FOCUS_ON_CLICK:
				unsetFocusOnClick();
				return;
			case FormPackage.BUTTON_TYPE__HREF:
				setHref(HREF_EDEFAULT);
				return;
			case FormPackage.BUTTON_TYPE__ID:
				setId(ID_EDEFAULT);
				return;
			case FormPackage.BUTTON_TYPE__IMAGE_ALIGN:
				unsetImageAlign();
				return;
			case FormPackage.BUTTON_TYPE__IMAGE_DATA:
				setImageData(IMAGE_DATA_EDEFAULT);
				return;
			case FormPackage.BUTTON_TYPE__IMAGE_POSITION:
				unsetImagePosition();
				return;
			case FormPackage.BUTTON_TYPE__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case FormPackage.BUTTON_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case FormPackage.BUTTON_TYPE__PRINTABLE:
				unsetPrintable();
				return;
			case FormPackage.BUTTON_TYPE__TAB_INDEX:
				unsetTabIndex();
				return;
			case FormPackage.BUTTON_TYPE__TAB_STOP:
				unsetTabStop();
				return;
			case FormPackage.BUTTON_TYPE__TARGET_FRAME:
				unsetTargetFrame();
				return;
			case FormPackage.BUTTON_TYPE__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case FormPackage.BUTTON_TYPE__TOGGLE:
				unsetToggle();
				return;
			case FormPackage.BUTTON_TYPE__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case FormPackage.BUTTON_TYPE__XFORMS_SUBMISSION:
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
			case FormPackage.BUTTON_TYPE__BIND:
				return BIND_EDEFAULT == null ? bind != null : !BIND_EDEFAULT.equals(bind);
			case FormPackage.BUTTON_TYPE__BUTTON_TYPE:
				return isSetButtonType();
			case FormPackage.BUTTON_TYPE__CONTROL_IMPLEMENTATION:
				return CONTROL_IMPLEMENTATION_EDEFAULT == null ? controlImplementation != null : !CONTROL_IMPLEMENTATION_EDEFAULT.equals(controlImplementation);
			case FormPackage.BUTTON_TYPE__DEFAULT_BUTTON:
				return isSetDefaultButton();
			case FormPackage.BUTTON_TYPE__DISABLED:
				return isSetDisabled();
			case FormPackage.BUTTON_TYPE__FOCUS_ON_CLICK:
				return isSetFocusOnClick();
			case FormPackage.BUTTON_TYPE__HREF:
				return HREF_EDEFAULT == null ? href != null : !HREF_EDEFAULT.equals(href);
			case FormPackage.BUTTON_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case FormPackage.BUTTON_TYPE__IMAGE_ALIGN:
				return isSetImageAlign();
			case FormPackage.BUTTON_TYPE__IMAGE_DATA:
				return IMAGE_DATA_EDEFAULT == null ? imageData != null : !IMAGE_DATA_EDEFAULT.equals(imageData);
			case FormPackage.BUTTON_TYPE__IMAGE_POSITION:
				return isSetImagePosition();
			case FormPackage.BUTTON_TYPE__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case FormPackage.BUTTON_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case FormPackage.BUTTON_TYPE__PRINTABLE:
				return isSetPrintable();
			case FormPackage.BUTTON_TYPE__TAB_INDEX:
				return isSetTabIndex();
			case FormPackage.BUTTON_TYPE__TAB_STOP:
				return isSetTabStop();
			case FormPackage.BUTTON_TYPE__TARGET_FRAME:
				return isSetTargetFrame();
			case FormPackage.BUTTON_TYPE__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case FormPackage.BUTTON_TYPE__TOGGLE:
				return isSetToggle();
			case FormPackage.BUTTON_TYPE__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case FormPackage.BUTTON_TYPE__XFORMS_SUBMISSION:
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
		result.append(" (bind: ");
		result.append(bind);
		result.append(", buttonType: ");
		if (buttonTypeESet) result.append(buttonType); else result.append("<unset>");
		result.append(", controlImplementation: ");
		result.append(controlImplementation);
		result.append(", defaultButton: ");
		if (defaultButtonESet) result.append(defaultButton); else result.append("<unset>");
		result.append(", disabled: ");
		if (disabledESet) result.append(disabled); else result.append("<unset>");
		result.append(", focusOnClick: ");
		if (focusOnClickESet) result.append(focusOnClick); else result.append("<unset>");
		result.append(", href: ");
		result.append(href);
		result.append(", id: ");
		result.append(id);
		result.append(", imageAlign: ");
		if (imageAlignESet) result.append(imageAlign); else result.append("<unset>");
		result.append(", imageData: ");
		result.append(imageData);
		result.append(", imagePosition: ");
		if (imagePositionESet) result.append(imagePosition); else result.append("<unset>");
		result.append(", label: ");
		result.append(label);
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
		result.append(", toggle: ");
		if (toggleESet) result.append(toggle); else result.append("<unset>");
		result.append(", value: ");
		result.append(value);
		result.append(", xformsSubmission: ");
		result.append(xformsSubmission);
		result.append(')');
		return result.toString();
	}

} //ButtonTypeImpl
