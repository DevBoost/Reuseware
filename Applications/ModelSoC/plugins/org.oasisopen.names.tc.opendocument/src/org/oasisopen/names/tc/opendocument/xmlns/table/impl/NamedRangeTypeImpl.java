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
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.oasisopen.names.tc.opendocument.xmlns.table.NamedRangeType;
import org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Named Range Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.NamedRangeTypeImpl#getBaseCellAddress <em>Base Cell Address</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.NamedRangeTypeImpl#getCellRangeAddress <em>Cell Range Address</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.NamedRangeTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.NamedRangeTypeImpl#getRangeUsableAs <em>Range Usable As</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NamedRangeTypeImpl extends EObjectImpl implements NamedRangeType {
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
	 * The default value of the '{@link #getCellRangeAddress() <em>Cell Range Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCellRangeAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String CELL_RANGE_ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCellRangeAddress() <em>Cell Range Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCellRangeAddress()
	 * @generated
	 * @ordered
	 */
	protected String cellRangeAddress = CELL_RANGE_ADDRESS_EDEFAULT;

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
	 * The default value of the '{@link #getRangeUsableAs() <em>Range Usable As</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRangeUsableAs()
	 * @generated
	 * @ordered
	 */
	protected static final Object RANGE_USABLE_AS_EDEFAULT = "none"; // TODO The default value literal "none" is not valid.

	/**
	 * The cached value of the '{@link #getRangeUsableAs() <em>Range Usable As</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRangeUsableAs()
	 * @generated
	 * @ordered
	 */
	protected Object rangeUsableAs = RANGE_USABLE_AS_EDEFAULT;

	/**
	 * This is true if the Range Usable As attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean rangeUsableAsESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NamedRangeTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TablePackage.eINSTANCE.getNamedRangeType();
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
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.NAMED_RANGE_TYPE__BASE_CELL_ADDRESS, oldBaseCellAddress, baseCellAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCellRangeAddress() {
		return cellRangeAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCellRangeAddress(String newCellRangeAddress) {
		String oldCellRangeAddress = cellRangeAddress;
		cellRangeAddress = newCellRangeAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.NAMED_RANGE_TYPE__CELL_RANGE_ADDRESS, oldCellRangeAddress, cellRangeAddress));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.NAMED_RANGE_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getRangeUsableAs() {
		return rangeUsableAs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRangeUsableAs(Object newRangeUsableAs) {
		Object oldRangeUsableAs = rangeUsableAs;
		rangeUsableAs = newRangeUsableAs;
		boolean oldRangeUsableAsESet = rangeUsableAsESet;
		rangeUsableAsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.NAMED_RANGE_TYPE__RANGE_USABLE_AS, oldRangeUsableAs, rangeUsableAs, !oldRangeUsableAsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRangeUsableAs() {
		Object oldRangeUsableAs = rangeUsableAs;
		boolean oldRangeUsableAsESet = rangeUsableAsESet;
		rangeUsableAs = RANGE_USABLE_AS_EDEFAULT;
		rangeUsableAsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TablePackage.NAMED_RANGE_TYPE__RANGE_USABLE_AS, oldRangeUsableAs, RANGE_USABLE_AS_EDEFAULT, oldRangeUsableAsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRangeUsableAs() {
		return rangeUsableAsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TablePackage.NAMED_RANGE_TYPE__BASE_CELL_ADDRESS:
				return getBaseCellAddress();
			case TablePackage.NAMED_RANGE_TYPE__CELL_RANGE_ADDRESS:
				return getCellRangeAddress();
			case TablePackage.NAMED_RANGE_TYPE__NAME:
				return getName();
			case TablePackage.NAMED_RANGE_TYPE__RANGE_USABLE_AS:
				return getRangeUsableAs();
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
			case TablePackage.NAMED_RANGE_TYPE__BASE_CELL_ADDRESS:
				setBaseCellAddress((String)newValue);
				return;
			case TablePackage.NAMED_RANGE_TYPE__CELL_RANGE_ADDRESS:
				setCellRangeAddress((String)newValue);
				return;
			case TablePackage.NAMED_RANGE_TYPE__NAME:
				setName((String)newValue);
				return;
			case TablePackage.NAMED_RANGE_TYPE__RANGE_USABLE_AS:
				setRangeUsableAs(newValue);
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
			case TablePackage.NAMED_RANGE_TYPE__BASE_CELL_ADDRESS:
				setBaseCellAddress(BASE_CELL_ADDRESS_EDEFAULT);
				return;
			case TablePackage.NAMED_RANGE_TYPE__CELL_RANGE_ADDRESS:
				setCellRangeAddress(CELL_RANGE_ADDRESS_EDEFAULT);
				return;
			case TablePackage.NAMED_RANGE_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case TablePackage.NAMED_RANGE_TYPE__RANGE_USABLE_AS:
				unsetRangeUsableAs();
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
			case TablePackage.NAMED_RANGE_TYPE__BASE_CELL_ADDRESS:
				return BASE_CELL_ADDRESS_EDEFAULT == null ? baseCellAddress != null : !BASE_CELL_ADDRESS_EDEFAULT.equals(baseCellAddress);
			case TablePackage.NAMED_RANGE_TYPE__CELL_RANGE_ADDRESS:
				return CELL_RANGE_ADDRESS_EDEFAULT == null ? cellRangeAddress != null : !CELL_RANGE_ADDRESS_EDEFAULT.equals(cellRangeAddress);
			case TablePackage.NAMED_RANGE_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case TablePackage.NAMED_RANGE_TYPE__RANGE_USABLE_AS:
				return isSetRangeUsableAs();
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
		result.append(" (baseCellAddress: ");
		result.append(baseCellAddress);
		result.append(", cellRangeAddress: ");
		result.append(cellRangeAddress);
		result.append(", name: ");
		result.append(name);
		result.append(", rangeUsableAs: ");
		if (rangeUsableAsESet) result.append(rangeUsableAs); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //NamedRangeTypeImpl
