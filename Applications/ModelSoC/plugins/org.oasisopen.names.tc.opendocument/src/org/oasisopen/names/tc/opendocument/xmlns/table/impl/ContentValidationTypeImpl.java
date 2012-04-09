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
package org.oasisopen.names.tc.opendocument.xmlns.table.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.oasisopen.names.tc.opendocument.xmlns.office.EventListenersType;
import org.oasisopen.names.tc.opendocument.xmlns.table.ContentValidationType;
import org.oasisopen.names.tc.opendocument.xmlns.table.DisplayListType;
import org.oasisopen.names.tc.opendocument.xmlns.table.ErrorMacroType;
import org.oasisopen.names.tc.opendocument.xmlns.table.ErrorMessageType;
import org.oasisopen.names.tc.opendocument.xmlns.table.HelpMessageType;
import org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Content Validation Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.ContentValidationTypeImpl#getHelpMessage <em>Help Message</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.ContentValidationTypeImpl#getErrorMessage <em>Error Message</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.ContentValidationTypeImpl#getErrorMacro <em>Error Macro</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.ContentValidationTypeImpl#getEventListeners <em>Event Listeners</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.ContentValidationTypeImpl#getAllowEmptyCell <em>Allow Empty Cell</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.ContentValidationTypeImpl#getBaseCellAddress <em>Base Cell Address</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.ContentValidationTypeImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.ContentValidationTypeImpl#getDisplayList <em>Display List</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.ContentValidationTypeImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ContentValidationTypeImpl extends EObjectImpl implements ContentValidationType {
	/**
	 * The cached value of the '{@link #getHelpMessage() <em>Help Message</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHelpMessage()
	 * @generated
	 * @ordered
	 */
	protected HelpMessageType helpMessage;

	/**
	 * The cached value of the '{@link #getErrorMessage() <em>Error Message</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorMessage()
	 * @generated
	 * @ordered
	 */
	protected ErrorMessageType errorMessage;

	/**
	 * The cached value of the '{@link #getErrorMacro() <em>Error Macro</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorMacro()
	 * @generated
	 * @ordered
	 */
	protected ErrorMacroType errorMacro;

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
	 * The default value of the '{@link #getAllowEmptyCell() <em>Allow Empty Cell</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowEmptyCell()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean ALLOW_EMPTY_CELL_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getAllowEmptyCell() <em>Allow Empty Cell</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowEmptyCell()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean allowEmptyCell = ALLOW_EMPTY_CELL_EDEFAULT;

	/**
	 * This is true if the Allow Empty Cell attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean allowEmptyCellESet;

	/**
	 * The default value of the '{@link #getBaseCellAddress() <em>Base Cell Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseCellAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String BASE_CELL_ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBaseCellAddress() <em>Base Cell Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseCellAddress()
	 * @generated
	 * @ordered
	 */
	protected String baseCellAddress = BASE_CELL_ADDRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getCondition() <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected static final String CONDITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected String condition = CONDITION_EDEFAULT;

	/**
	 * The default value of the '{@link #getDisplayList() <em>Display List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayList()
	 * @generated
	 * @ordered
	 */
	protected static final DisplayListType DISPLAY_LIST_EDEFAULT = DisplayListType.UNSORTED;

	/**
	 * The cached value of the '{@link #getDisplayList() <em>Display List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayList()
	 * @generated
	 * @ordered
	 */
	protected DisplayListType displayList = DISPLAY_LIST_EDEFAULT;

	/**
	 * This is true if the Display List attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean displayListESet;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContentValidationTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TablePackage.eINSTANCE.getContentValidationType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HelpMessageType getHelpMessage() {
		return helpMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHelpMessage(HelpMessageType newHelpMessage, NotificationChain msgs) {
		HelpMessageType oldHelpMessage = helpMessage;
		helpMessage = newHelpMessage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TablePackage.CONTENT_VALIDATION_TYPE__HELP_MESSAGE, oldHelpMessage, newHelpMessage);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHelpMessage(HelpMessageType newHelpMessage) {
		if (newHelpMessage != helpMessage) {
			NotificationChain msgs = null;
			if (helpMessage != null)
				msgs = ((InternalEObject)helpMessage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TablePackage.CONTENT_VALIDATION_TYPE__HELP_MESSAGE, null, msgs);
			if (newHelpMessage != null)
				msgs = ((InternalEObject)newHelpMessage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TablePackage.CONTENT_VALIDATION_TYPE__HELP_MESSAGE, null, msgs);
			msgs = basicSetHelpMessage(newHelpMessage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.CONTENT_VALIDATION_TYPE__HELP_MESSAGE, newHelpMessage, newHelpMessage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErrorMessageType getErrorMessage() {
		return errorMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetErrorMessage(ErrorMessageType newErrorMessage, NotificationChain msgs) {
		ErrorMessageType oldErrorMessage = errorMessage;
		errorMessage = newErrorMessage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TablePackage.CONTENT_VALIDATION_TYPE__ERROR_MESSAGE, oldErrorMessage, newErrorMessage);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setErrorMessage(ErrorMessageType newErrorMessage) {
		if (newErrorMessage != errorMessage) {
			NotificationChain msgs = null;
			if (errorMessage != null)
				msgs = ((InternalEObject)errorMessage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TablePackage.CONTENT_VALIDATION_TYPE__ERROR_MESSAGE, null, msgs);
			if (newErrorMessage != null)
				msgs = ((InternalEObject)newErrorMessage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TablePackage.CONTENT_VALIDATION_TYPE__ERROR_MESSAGE, null, msgs);
			msgs = basicSetErrorMessage(newErrorMessage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.CONTENT_VALIDATION_TYPE__ERROR_MESSAGE, newErrorMessage, newErrorMessage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErrorMacroType getErrorMacro() {
		return errorMacro;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetErrorMacro(ErrorMacroType newErrorMacro, NotificationChain msgs) {
		ErrorMacroType oldErrorMacro = errorMacro;
		errorMacro = newErrorMacro;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TablePackage.CONTENT_VALIDATION_TYPE__ERROR_MACRO, oldErrorMacro, newErrorMacro);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setErrorMacro(ErrorMacroType newErrorMacro) {
		if (newErrorMacro != errorMacro) {
			NotificationChain msgs = null;
			if (errorMacro != null)
				msgs = ((InternalEObject)errorMacro).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TablePackage.CONTENT_VALIDATION_TYPE__ERROR_MACRO, null, msgs);
			if (newErrorMacro != null)
				msgs = ((InternalEObject)newErrorMacro).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TablePackage.CONTENT_VALIDATION_TYPE__ERROR_MACRO, null, msgs);
			msgs = basicSetErrorMacro(newErrorMacro, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.CONTENT_VALIDATION_TYPE__ERROR_MACRO, newErrorMacro, newErrorMacro));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TablePackage.CONTENT_VALIDATION_TYPE__EVENT_LISTENERS, oldEventListeners, newEventListeners);
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
				msgs = ((InternalEObject)eventListeners).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TablePackage.CONTENT_VALIDATION_TYPE__EVENT_LISTENERS, null, msgs);
			if (newEventListeners != null)
				msgs = ((InternalEObject)newEventListeners).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TablePackage.CONTENT_VALIDATION_TYPE__EVENT_LISTENERS, null, msgs);
			msgs = basicSetEventListeners(newEventListeners, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.CONTENT_VALIDATION_TYPE__EVENT_LISTENERS, newEventListeners, newEventListeners));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getAllowEmptyCell() {
		return allowEmptyCell;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllowEmptyCell(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newAllowEmptyCell) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldAllowEmptyCell = allowEmptyCell;
		allowEmptyCell = newAllowEmptyCell == null ? ALLOW_EMPTY_CELL_EDEFAULT : newAllowEmptyCell;
		boolean oldAllowEmptyCellESet = allowEmptyCellESet;
		allowEmptyCellESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.CONTENT_VALIDATION_TYPE__ALLOW_EMPTY_CELL, oldAllowEmptyCell, allowEmptyCell, !oldAllowEmptyCellESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAllowEmptyCell() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldAllowEmptyCell = allowEmptyCell;
		boolean oldAllowEmptyCellESet = allowEmptyCellESet;
		allowEmptyCell = ALLOW_EMPTY_CELL_EDEFAULT;
		allowEmptyCellESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TablePackage.CONTENT_VALIDATION_TYPE__ALLOW_EMPTY_CELL, oldAllowEmptyCell, ALLOW_EMPTY_CELL_EDEFAULT, oldAllowEmptyCellESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAllowEmptyCell() {
		return allowEmptyCellESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBaseCellAddress() {
		return baseCellAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBaseCellAddress(String newBaseCellAddress) {
		String oldBaseCellAddress = baseCellAddress;
		baseCellAddress = newBaseCellAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.CONTENT_VALIDATION_TYPE__BASE_CELL_ADDRESS, oldBaseCellAddress, baseCellAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCondition() {
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCondition(String newCondition) {
		String oldCondition = condition;
		condition = newCondition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.CONTENT_VALIDATION_TYPE__CONDITION, oldCondition, condition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DisplayListType getDisplayList() {
		return displayList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisplayList(DisplayListType newDisplayList) {
		DisplayListType oldDisplayList = displayList;
		displayList = newDisplayList == null ? DISPLAY_LIST_EDEFAULT : newDisplayList;
		boolean oldDisplayListESet = displayListESet;
		displayListESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.CONTENT_VALIDATION_TYPE__DISPLAY_LIST, oldDisplayList, displayList, !oldDisplayListESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDisplayList() {
		DisplayListType oldDisplayList = displayList;
		boolean oldDisplayListESet = displayListESet;
		displayList = DISPLAY_LIST_EDEFAULT;
		displayListESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TablePackage.CONTENT_VALIDATION_TYPE__DISPLAY_LIST, oldDisplayList, DISPLAY_LIST_EDEFAULT, oldDisplayListESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDisplayList() {
		return displayListESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.CONTENT_VALIDATION_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TablePackage.CONTENT_VALIDATION_TYPE__HELP_MESSAGE:
				return basicSetHelpMessage(null, msgs);
			case TablePackage.CONTENT_VALIDATION_TYPE__ERROR_MESSAGE:
				return basicSetErrorMessage(null, msgs);
			case TablePackage.CONTENT_VALIDATION_TYPE__ERROR_MACRO:
				return basicSetErrorMacro(null, msgs);
			case TablePackage.CONTENT_VALIDATION_TYPE__EVENT_LISTENERS:
				return basicSetEventListeners(null, msgs);
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
			case TablePackage.CONTENT_VALIDATION_TYPE__HELP_MESSAGE:
				return getHelpMessage();
			case TablePackage.CONTENT_VALIDATION_TYPE__ERROR_MESSAGE:
				return getErrorMessage();
			case TablePackage.CONTENT_VALIDATION_TYPE__ERROR_MACRO:
				return getErrorMacro();
			case TablePackage.CONTENT_VALIDATION_TYPE__EVENT_LISTENERS:
				return getEventListeners();
			case TablePackage.CONTENT_VALIDATION_TYPE__ALLOW_EMPTY_CELL:
				return getAllowEmptyCell();
			case TablePackage.CONTENT_VALIDATION_TYPE__BASE_CELL_ADDRESS:
				return getBaseCellAddress();
			case TablePackage.CONTENT_VALIDATION_TYPE__CONDITION:
				return getCondition();
			case TablePackage.CONTENT_VALIDATION_TYPE__DISPLAY_LIST:
				return getDisplayList();
			case TablePackage.CONTENT_VALIDATION_TYPE__NAME:
				return getName();
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
			case TablePackage.CONTENT_VALIDATION_TYPE__HELP_MESSAGE:
				setHelpMessage((HelpMessageType)newValue);
				return;
			case TablePackage.CONTENT_VALIDATION_TYPE__ERROR_MESSAGE:
				setErrorMessage((ErrorMessageType)newValue);
				return;
			case TablePackage.CONTENT_VALIDATION_TYPE__ERROR_MACRO:
				setErrorMacro((ErrorMacroType)newValue);
				return;
			case TablePackage.CONTENT_VALIDATION_TYPE__EVENT_LISTENERS:
				setEventListeners((EventListenersType)newValue);
				return;
			case TablePackage.CONTENT_VALIDATION_TYPE__ALLOW_EMPTY_CELL:
				setAllowEmptyCell((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case TablePackage.CONTENT_VALIDATION_TYPE__BASE_CELL_ADDRESS:
				setBaseCellAddress((String)newValue);
				return;
			case TablePackage.CONTENT_VALIDATION_TYPE__CONDITION:
				setCondition((String)newValue);
				return;
			case TablePackage.CONTENT_VALIDATION_TYPE__DISPLAY_LIST:
				setDisplayList((DisplayListType)newValue);
				return;
			case TablePackage.CONTENT_VALIDATION_TYPE__NAME:
				setName((String)newValue);
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
			case TablePackage.CONTENT_VALIDATION_TYPE__HELP_MESSAGE:
				setHelpMessage((HelpMessageType)null);
				return;
			case TablePackage.CONTENT_VALIDATION_TYPE__ERROR_MESSAGE:
				setErrorMessage((ErrorMessageType)null);
				return;
			case TablePackage.CONTENT_VALIDATION_TYPE__ERROR_MACRO:
				setErrorMacro((ErrorMacroType)null);
				return;
			case TablePackage.CONTENT_VALIDATION_TYPE__EVENT_LISTENERS:
				setEventListeners((EventListenersType)null);
				return;
			case TablePackage.CONTENT_VALIDATION_TYPE__ALLOW_EMPTY_CELL:
				unsetAllowEmptyCell();
				return;
			case TablePackage.CONTENT_VALIDATION_TYPE__BASE_CELL_ADDRESS:
				setBaseCellAddress(BASE_CELL_ADDRESS_EDEFAULT);
				return;
			case TablePackage.CONTENT_VALIDATION_TYPE__CONDITION:
				setCondition(CONDITION_EDEFAULT);
				return;
			case TablePackage.CONTENT_VALIDATION_TYPE__DISPLAY_LIST:
				unsetDisplayList();
				return;
			case TablePackage.CONTENT_VALIDATION_TYPE__NAME:
				setName(NAME_EDEFAULT);
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
			case TablePackage.CONTENT_VALIDATION_TYPE__HELP_MESSAGE:
				return helpMessage != null;
			case TablePackage.CONTENT_VALIDATION_TYPE__ERROR_MESSAGE:
				return errorMessage != null;
			case TablePackage.CONTENT_VALIDATION_TYPE__ERROR_MACRO:
				return errorMacro != null;
			case TablePackage.CONTENT_VALIDATION_TYPE__EVENT_LISTENERS:
				return eventListeners != null;
			case TablePackage.CONTENT_VALIDATION_TYPE__ALLOW_EMPTY_CELL:
				return isSetAllowEmptyCell();
			case TablePackage.CONTENT_VALIDATION_TYPE__BASE_CELL_ADDRESS:
				return BASE_CELL_ADDRESS_EDEFAULT == null ? baseCellAddress != null : !BASE_CELL_ADDRESS_EDEFAULT.equals(baseCellAddress);
			case TablePackage.CONTENT_VALIDATION_TYPE__CONDITION:
				return CONDITION_EDEFAULT == null ? condition != null : !CONDITION_EDEFAULT.equals(condition);
			case TablePackage.CONTENT_VALIDATION_TYPE__DISPLAY_LIST:
				return isSetDisplayList();
			case TablePackage.CONTENT_VALIDATION_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (allowEmptyCell: ");
		if (allowEmptyCellESet) result.append(allowEmptyCell); else result.append("<unset>");
		result.append(", baseCellAddress: ");
		result.append(baseCellAddress);
		result.append(", condition: ");
		result.append(condition);
		result.append(", displayList: ");
		if (displayListESet) result.append(displayList); else result.append("<unset>");
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ContentValidationTypeImpl
