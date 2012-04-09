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
import org.oasisopen.names.tc.opendocument.xmlns.table.ConditionSourceType;
import org.oasisopen.names.tc.opendocument.xmlns.table.FilterAndType;
import org.oasisopen.names.tc.opendocument.xmlns.table.FilterConditionType;
import org.oasisopen.names.tc.opendocument.xmlns.table.FilterOrType;
import org.oasisopen.names.tc.opendocument.xmlns.table.FilterType;
import org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Filter Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.FilterTypeImpl#getFilterCondition <em>Filter Condition</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.FilterTypeImpl#getFilterAnd <em>Filter And</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.FilterTypeImpl#getFilterOr <em>Filter Or</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.FilterTypeImpl#getConditionSource <em>Condition Source</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.FilterTypeImpl#getConditionSourceRangeAddress <em>Condition Source Range Address</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.FilterTypeImpl#getDisplayDuplicates <em>Display Duplicates</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.FilterTypeImpl#getTargetRangeAddress <em>Target Range Address</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FilterTypeImpl extends EObjectImpl implements FilterType {
	/**
	 * The cached value of the '{@link #getFilterCondition() <em>Filter Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilterCondition()
	 * @generated
	 * @ordered
	 */
	protected FilterConditionType filterCondition;

	/**
	 * The cached value of the '{@link #getFilterAnd() <em>Filter And</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilterAnd()
	 * @generated
	 * @ordered
	 */
	protected FilterAndType filterAnd;

	/**
	 * The cached value of the '{@link #getFilterOr() <em>Filter Or</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilterOr()
	 * @generated
	 * @ordered
	 */
	protected FilterOrType filterOr;

	/**
	 * The default value of the '{@link #getConditionSource() <em>Condition Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditionSource()
	 * @generated
	 * @ordered
	 */
	protected static final ConditionSourceType CONDITION_SOURCE_EDEFAULT = ConditionSourceType.SELF;

	/**
	 * The cached value of the '{@link #getConditionSource() <em>Condition Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditionSource()
	 * @generated
	 * @ordered
	 */
	protected ConditionSourceType conditionSource = CONDITION_SOURCE_EDEFAULT;

	/**
	 * This is true if the Condition Source attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean conditionSourceESet;

	/**
	 * The default value of the '{@link #getConditionSourceRangeAddress() <em>Condition Source Range Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditionSourceRangeAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String CONDITION_SOURCE_RANGE_ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConditionSourceRangeAddress() <em>Condition Source Range Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditionSourceRangeAddress()
	 * @generated
	 * @ordered
	 */
	protected String conditionSourceRangeAddress = CONDITION_SOURCE_RANGE_ADDRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getDisplayDuplicates() <em>Display Duplicates</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayDuplicates()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean DISPLAY_DUPLICATES_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getDisplayDuplicates() <em>Display Duplicates</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayDuplicates()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean displayDuplicates = DISPLAY_DUPLICATES_EDEFAULT;

	/**
	 * This is true if the Display Duplicates attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean displayDuplicatesESet;

	/**
	 * The default value of the '{@link #getTargetRangeAddress() <em>Target Range Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetRangeAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_RANGE_ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetRangeAddress() <em>Target Range Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetRangeAddress()
	 * @generated
	 * @ordered
	 */
	protected String targetRangeAddress = TARGET_RANGE_ADDRESS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FilterTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TablePackage.eINSTANCE.getFilterType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilterConditionType getFilterCondition() {
		return filterCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFilterCondition(FilterConditionType newFilterCondition, NotificationChain msgs) {
		FilterConditionType oldFilterCondition = filterCondition;
		filterCondition = newFilterCondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TablePackage.FILTER_TYPE__FILTER_CONDITION, oldFilterCondition, newFilterCondition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFilterCondition(FilterConditionType newFilterCondition) {
		if (newFilterCondition != filterCondition) {
			NotificationChain msgs = null;
			if (filterCondition != null)
				msgs = ((InternalEObject)filterCondition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TablePackage.FILTER_TYPE__FILTER_CONDITION, null, msgs);
			if (newFilterCondition != null)
				msgs = ((InternalEObject)newFilterCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TablePackage.FILTER_TYPE__FILTER_CONDITION, null, msgs);
			msgs = basicSetFilterCondition(newFilterCondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.FILTER_TYPE__FILTER_CONDITION, newFilterCondition, newFilterCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilterAndType getFilterAnd() {
		return filterAnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFilterAnd(FilterAndType newFilterAnd, NotificationChain msgs) {
		FilterAndType oldFilterAnd = filterAnd;
		filterAnd = newFilterAnd;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TablePackage.FILTER_TYPE__FILTER_AND, oldFilterAnd, newFilterAnd);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFilterAnd(FilterAndType newFilterAnd) {
		if (newFilterAnd != filterAnd) {
			NotificationChain msgs = null;
			if (filterAnd != null)
				msgs = ((InternalEObject)filterAnd).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TablePackage.FILTER_TYPE__FILTER_AND, null, msgs);
			if (newFilterAnd != null)
				msgs = ((InternalEObject)newFilterAnd).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TablePackage.FILTER_TYPE__FILTER_AND, null, msgs);
			msgs = basicSetFilterAnd(newFilterAnd, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.FILTER_TYPE__FILTER_AND, newFilterAnd, newFilterAnd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilterOrType getFilterOr() {
		return filterOr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFilterOr(FilterOrType newFilterOr, NotificationChain msgs) {
		FilterOrType oldFilterOr = filterOr;
		filterOr = newFilterOr;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TablePackage.FILTER_TYPE__FILTER_OR, oldFilterOr, newFilterOr);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFilterOr(FilterOrType newFilterOr) {
		if (newFilterOr != filterOr) {
			NotificationChain msgs = null;
			if (filterOr != null)
				msgs = ((InternalEObject)filterOr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TablePackage.FILTER_TYPE__FILTER_OR, null, msgs);
			if (newFilterOr != null)
				msgs = ((InternalEObject)newFilterOr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TablePackage.FILTER_TYPE__FILTER_OR, null, msgs);
			msgs = basicSetFilterOr(newFilterOr, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.FILTER_TYPE__FILTER_OR, newFilterOr, newFilterOr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionSourceType getConditionSource() {
		return conditionSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConditionSource(ConditionSourceType newConditionSource) {
		ConditionSourceType oldConditionSource = conditionSource;
		conditionSource = newConditionSource == null ? CONDITION_SOURCE_EDEFAULT : newConditionSource;
		boolean oldConditionSourceESet = conditionSourceESet;
		conditionSourceESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.FILTER_TYPE__CONDITION_SOURCE, oldConditionSource, conditionSource, !oldConditionSourceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetConditionSource() {
		ConditionSourceType oldConditionSource = conditionSource;
		boolean oldConditionSourceESet = conditionSourceESet;
		conditionSource = CONDITION_SOURCE_EDEFAULT;
		conditionSourceESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TablePackage.FILTER_TYPE__CONDITION_SOURCE, oldConditionSource, CONDITION_SOURCE_EDEFAULT, oldConditionSourceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetConditionSource() {
		return conditionSourceESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConditionSourceRangeAddress() {
		return conditionSourceRangeAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConditionSourceRangeAddress(String newConditionSourceRangeAddress) {
		String oldConditionSourceRangeAddress = conditionSourceRangeAddress;
		conditionSourceRangeAddress = newConditionSourceRangeAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.FILTER_TYPE__CONDITION_SOURCE_RANGE_ADDRESS, oldConditionSourceRangeAddress, conditionSourceRangeAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getDisplayDuplicates() {
		return displayDuplicates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisplayDuplicates(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newDisplayDuplicates) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldDisplayDuplicates = displayDuplicates;
		displayDuplicates = newDisplayDuplicates == null ? DISPLAY_DUPLICATES_EDEFAULT : newDisplayDuplicates;
		boolean oldDisplayDuplicatesESet = displayDuplicatesESet;
		displayDuplicatesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.FILTER_TYPE__DISPLAY_DUPLICATES, oldDisplayDuplicates, displayDuplicates, !oldDisplayDuplicatesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDisplayDuplicates() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldDisplayDuplicates = displayDuplicates;
		boolean oldDisplayDuplicatesESet = displayDuplicatesESet;
		displayDuplicates = DISPLAY_DUPLICATES_EDEFAULT;
		displayDuplicatesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TablePackage.FILTER_TYPE__DISPLAY_DUPLICATES, oldDisplayDuplicates, DISPLAY_DUPLICATES_EDEFAULT, oldDisplayDuplicatesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDisplayDuplicates() {
		return displayDuplicatesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTargetRangeAddress() {
		return targetRangeAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetRangeAddress(String newTargetRangeAddress) {
		String oldTargetRangeAddress = targetRangeAddress;
		targetRangeAddress = newTargetRangeAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.FILTER_TYPE__TARGET_RANGE_ADDRESS, oldTargetRangeAddress, targetRangeAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TablePackage.FILTER_TYPE__FILTER_CONDITION:
				return basicSetFilterCondition(null, msgs);
			case TablePackage.FILTER_TYPE__FILTER_AND:
				return basicSetFilterAnd(null, msgs);
			case TablePackage.FILTER_TYPE__FILTER_OR:
				return basicSetFilterOr(null, msgs);
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
			case TablePackage.FILTER_TYPE__FILTER_CONDITION:
				return getFilterCondition();
			case TablePackage.FILTER_TYPE__FILTER_AND:
				return getFilterAnd();
			case TablePackage.FILTER_TYPE__FILTER_OR:
				return getFilterOr();
			case TablePackage.FILTER_TYPE__CONDITION_SOURCE:
				return getConditionSource();
			case TablePackage.FILTER_TYPE__CONDITION_SOURCE_RANGE_ADDRESS:
				return getConditionSourceRangeAddress();
			case TablePackage.FILTER_TYPE__DISPLAY_DUPLICATES:
				return getDisplayDuplicates();
			case TablePackage.FILTER_TYPE__TARGET_RANGE_ADDRESS:
				return getTargetRangeAddress();
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
			case TablePackage.FILTER_TYPE__FILTER_CONDITION:
				setFilterCondition((FilterConditionType)newValue);
				return;
			case TablePackage.FILTER_TYPE__FILTER_AND:
				setFilterAnd((FilterAndType)newValue);
				return;
			case TablePackage.FILTER_TYPE__FILTER_OR:
				setFilterOr((FilterOrType)newValue);
				return;
			case TablePackage.FILTER_TYPE__CONDITION_SOURCE:
				setConditionSource((ConditionSourceType)newValue);
				return;
			case TablePackage.FILTER_TYPE__CONDITION_SOURCE_RANGE_ADDRESS:
				setConditionSourceRangeAddress((String)newValue);
				return;
			case TablePackage.FILTER_TYPE__DISPLAY_DUPLICATES:
				setDisplayDuplicates((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case TablePackage.FILTER_TYPE__TARGET_RANGE_ADDRESS:
				setTargetRangeAddress((String)newValue);
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
			case TablePackage.FILTER_TYPE__FILTER_CONDITION:
				setFilterCondition((FilterConditionType)null);
				return;
			case TablePackage.FILTER_TYPE__FILTER_AND:
				setFilterAnd((FilterAndType)null);
				return;
			case TablePackage.FILTER_TYPE__FILTER_OR:
				setFilterOr((FilterOrType)null);
				return;
			case TablePackage.FILTER_TYPE__CONDITION_SOURCE:
				unsetConditionSource();
				return;
			case TablePackage.FILTER_TYPE__CONDITION_SOURCE_RANGE_ADDRESS:
				setConditionSourceRangeAddress(CONDITION_SOURCE_RANGE_ADDRESS_EDEFAULT);
				return;
			case TablePackage.FILTER_TYPE__DISPLAY_DUPLICATES:
				unsetDisplayDuplicates();
				return;
			case TablePackage.FILTER_TYPE__TARGET_RANGE_ADDRESS:
				setTargetRangeAddress(TARGET_RANGE_ADDRESS_EDEFAULT);
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
			case TablePackage.FILTER_TYPE__FILTER_CONDITION:
				return filterCondition != null;
			case TablePackage.FILTER_TYPE__FILTER_AND:
				return filterAnd != null;
			case TablePackage.FILTER_TYPE__FILTER_OR:
				return filterOr != null;
			case TablePackage.FILTER_TYPE__CONDITION_SOURCE:
				return isSetConditionSource();
			case TablePackage.FILTER_TYPE__CONDITION_SOURCE_RANGE_ADDRESS:
				return CONDITION_SOURCE_RANGE_ADDRESS_EDEFAULT == null ? conditionSourceRangeAddress != null : !CONDITION_SOURCE_RANGE_ADDRESS_EDEFAULT.equals(conditionSourceRangeAddress);
			case TablePackage.FILTER_TYPE__DISPLAY_DUPLICATES:
				return isSetDisplayDuplicates();
			case TablePackage.FILTER_TYPE__TARGET_RANGE_ADDRESS:
				return TARGET_RANGE_ADDRESS_EDEFAULT == null ? targetRangeAddress != null : !TARGET_RANGE_ADDRESS_EDEFAULT.equals(targetRangeAddress);
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
		result.append(" (conditionSource: ");
		if (conditionSourceESet) result.append(conditionSource); else result.append("<unset>");
		result.append(", conditionSourceRangeAddress: ");
		result.append(conditionSourceRangeAddress);
		result.append(", displayDuplicates: ");
		if (displayDuplicatesESet) result.append(displayDuplicates); else result.append("<unset>");
		result.append(", targetRangeAddress: ");
		result.append(targetRangeAddress);
		result.append(')');
		return result.toString();
	}

} //FilterTypeImpl
