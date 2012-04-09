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
package org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.oasisopen.names.tc.opendocument.xmlns.datastyle.DatastylePackage;
import org.oasisopen.names.tc.opendocument.xmlns.datastyle.FractionType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fraction Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.FractionTypeImpl#getDenominatorValue <em>Denominator Value</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.FractionTypeImpl#getGrouping <em>Grouping</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.FractionTypeImpl#getMinDenominatorDigits <em>Min Denominator Digits</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.FractionTypeImpl#getMinIntegerDigits <em>Min Integer Digits</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.FractionTypeImpl#getMinNumeratorDigits <em>Min Numerator Digits</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FractionTypeImpl extends EObjectImpl implements FractionType {
	/**
	 * The default value of the '{@link #getDenominatorValue() <em>Denominator Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDenominatorValue()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger DENOMINATOR_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDenominatorValue() <em>Denominator Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDenominatorValue()
	 * @generated
	 * @ordered
	 */
	protected BigInteger denominatorValue = DENOMINATOR_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getGrouping() <em>Grouping</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGrouping()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean GROUPING_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getGrouping() <em>Grouping</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGrouping()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean grouping = GROUPING_EDEFAULT;

	/**
	 * This is true if the Grouping attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean groupingESet;

	/**
	 * The default value of the '{@link #getMinDenominatorDigits() <em>Min Denominator Digits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinDenominatorDigits()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger MIN_DENOMINATOR_DIGITS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMinDenominatorDigits() <em>Min Denominator Digits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinDenominatorDigits()
	 * @generated
	 * @ordered
	 */
	protected BigInteger minDenominatorDigits = MIN_DENOMINATOR_DIGITS_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinIntegerDigits() <em>Min Integer Digits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinIntegerDigits()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger MIN_INTEGER_DIGITS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMinIntegerDigits() <em>Min Integer Digits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinIntegerDigits()
	 * @generated
	 * @ordered
	 */
	protected BigInteger minIntegerDigits = MIN_INTEGER_DIGITS_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinNumeratorDigits() <em>Min Numerator Digits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinNumeratorDigits()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger MIN_NUMERATOR_DIGITS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMinNumeratorDigits() <em>Min Numerator Digits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinNumeratorDigits()
	 * @generated
	 * @ordered
	 */
	protected BigInteger minNumeratorDigits = MIN_NUMERATOR_DIGITS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FractionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatastylePackage.Literals.FRACTION_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getDenominatorValue() {
		return denominatorValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDenominatorValue(BigInteger newDenominatorValue) {
		BigInteger oldDenominatorValue = denominatorValue;
		denominatorValue = newDenominatorValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatastylePackage.FRACTION_TYPE__DENOMINATOR_VALUE, oldDenominatorValue, denominatorValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getGrouping() {
		return grouping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGrouping(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newGrouping) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldGrouping = grouping;
		grouping = newGrouping == null ? GROUPING_EDEFAULT : newGrouping;
		boolean oldGroupingESet = groupingESet;
		groupingESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatastylePackage.FRACTION_TYPE__GROUPING, oldGrouping, grouping, !oldGroupingESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetGrouping() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldGrouping = grouping;
		boolean oldGroupingESet = groupingESet;
		grouping = GROUPING_EDEFAULT;
		groupingESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DatastylePackage.FRACTION_TYPE__GROUPING, oldGrouping, GROUPING_EDEFAULT, oldGroupingESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetGrouping() {
		return groupingESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getMinDenominatorDigits() {
		return minDenominatorDigits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinDenominatorDigits(BigInteger newMinDenominatorDigits) {
		BigInteger oldMinDenominatorDigits = minDenominatorDigits;
		minDenominatorDigits = newMinDenominatorDigits;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatastylePackage.FRACTION_TYPE__MIN_DENOMINATOR_DIGITS, oldMinDenominatorDigits, minDenominatorDigits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getMinIntegerDigits() {
		return minIntegerDigits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinIntegerDigits(BigInteger newMinIntegerDigits) {
		BigInteger oldMinIntegerDigits = minIntegerDigits;
		minIntegerDigits = newMinIntegerDigits;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatastylePackage.FRACTION_TYPE__MIN_INTEGER_DIGITS, oldMinIntegerDigits, minIntegerDigits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getMinNumeratorDigits() {
		return minNumeratorDigits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinNumeratorDigits(BigInteger newMinNumeratorDigits) {
		BigInteger oldMinNumeratorDigits = minNumeratorDigits;
		minNumeratorDigits = newMinNumeratorDigits;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatastylePackage.FRACTION_TYPE__MIN_NUMERATOR_DIGITS, oldMinNumeratorDigits, minNumeratorDigits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DatastylePackage.FRACTION_TYPE__DENOMINATOR_VALUE:
				return getDenominatorValue();
			case DatastylePackage.FRACTION_TYPE__GROUPING:
				return getGrouping();
			case DatastylePackage.FRACTION_TYPE__MIN_DENOMINATOR_DIGITS:
				return getMinDenominatorDigits();
			case DatastylePackage.FRACTION_TYPE__MIN_INTEGER_DIGITS:
				return getMinIntegerDigits();
			case DatastylePackage.FRACTION_TYPE__MIN_NUMERATOR_DIGITS:
				return getMinNumeratorDigits();
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
			case DatastylePackage.FRACTION_TYPE__DENOMINATOR_VALUE:
				setDenominatorValue((BigInteger)newValue);
				return;
			case DatastylePackage.FRACTION_TYPE__GROUPING:
				setGrouping((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case DatastylePackage.FRACTION_TYPE__MIN_DENOMINATOR_DIGITS:
				setMinDenominatorDigits((BigInteger)newValue);
				return;
			case DatastylePackage.FRACTION_TYPE__MIN_INTEGER_DIGITS:
				setMinIntegerDigits((BigInteger)newValue);
				return;
			case DatastylePackage.FRACTION_TYPE__MIN_NUMERATOR_DIGITS:
				setMinNumeratorDigits((BigInteger)newValue);
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
			case DatastylePackage.FRACTION_TYPE__DENOMINATOR_VALUE:
				setDenominatorValue(DENOMINATOR_VALUE_EDEFAULT);
				return;
			case DatastylePackage.FRACTION_TYPE__GROUPING:
				unsetGrouping();
				return;
			case DatastylePackage.FRACTION_TYPE__MIN_DENOMINATOR_DIGITS:
				setMinDenominatorDigits(MIN_DENOMINATOR_DIGITS_EDEFAULT);
				return;
			case DatastylePackage.FRACTION_TYPE__MIN_INTEGER_DIGITS:
				setMinIntegerDigits(MIN_INTEGER_DIGITS_EDEFAULT);
				return;
			case DatastylePackage.FRACTION_TYPE__MIN_NUMERATOR_DIGITS:
				setMinNumeratorDigits(MIN_NUMERATOR_DIGITS_EDEFAULT);
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
			case DatastylePackage.FRACTION_TYPE__DENOMINATOR_VALUE:
				return DENOMINATOR_VALUE_EDEFAULT == null ? denominatorValue != null : !DENOMINATOR_VALUE_EDEFAULT.equals(denominatorValue);
			case DatastylePackage.FRACTION_TYPE__GROUPING:
				return isSetGrouping();
			case DatastylePackage.FRACTION_TYPE__MIN_DENOMINATOR_DIGITS:
				return MIN_DENOMINATOR_DIGITS_EDEFAULT == null ? minDenominatorDigits != null : !MIN_DENOMINATOR_DIGITS_EDEFAULT.equals(minDenominatorDigits);
			case DatastylePackage.FRACTION_TYPE__MIN_INTEGER_DIGITS:
				return MIN_INTEGER_DIGITS_EDEFAULT == null ? minIntegerDigits != null : !MIN_INTEGER_DIGITS_EDEFAULT.equals(minIntegerDigits);
			case DatastylePackage.FRACTION_TYPE__MIN_NUMERATOR_DIGITS:
				return MIN_NUMERATOR_DIGITS_EDEFAULT == null ? minNumeratorDigits != null : !MIN_NUMERATOR_DIGITS_EDEFAULT.equals(minNumeratorDigits);
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
		result.append(" (denominatorValue: ");
		result.append(denominatorValue);
		result.append(", grouping: ");
		if (groupingESet) result.append(grouping); else result.append("<unset>");
		result.append(", minDenominatorDigits: ");
		result.append(minDenominatorDigits);
		result.append(", minIntegerDigits: ");
		result.append(minIntegerDigits);
		result.append(", minNumeratorDigits: ");
		result.append(minNumeratorDigits);
		result.append(')');
		return result.toString();
	}

} //FractionTypeImpl
