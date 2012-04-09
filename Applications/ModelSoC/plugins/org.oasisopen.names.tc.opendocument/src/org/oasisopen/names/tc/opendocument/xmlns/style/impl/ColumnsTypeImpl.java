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
package org.oasisopen.names.tc.opendocument.xmlns.style.impl;

import java.math.BigInteger;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.oasisopen.names.tc.opendocument.xmlns.style.ColumnSepType;
import org.oasisopen.names.tc.opendocument.xmlns.style.ColumnType;
import org.oasisopen.names.tc.opendocument.xmlns.style.ColumnsType;
import org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Columns Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.ColumnsTypeImpl#getColumnSep <em>Column Sep</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.ColumnsTypeImpl#getColumn <em>Column</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.ColumnsTypeImpl#getColumnCount <em>Column Count</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.ColumnsTypeImpl#getColumnGap <em>Column Gap</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ColumnsTypeImpl extends EObjectImpl implements ColumnsType {
	/**
	 * The cached value of the '{@link #getColumnSep() <em>Column Sep</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumnSep()
	 * @generated
	 * @ordered
	 */
	protected ColumnSepType columnSep;

	/**
	 * The cached value of the '{@link #getColumn() <em>Column</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumn()
	 * @generated
	 * @ordered
	 */
	protected EList<ColumnType> column;

	/**
	 * The default value of the '{@link #getColumnCount() <em>Column Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumnCount()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger COLUMN_COUNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getColumnCount() <em>Column Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumnCount()
	 * @generated
	 * @ordered
	 */
	protected BigInteger columnCount = COLUMN_COUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getColumnGap() <em>Column Gap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumnGap()
	 * @generated
	 * @ordered
	 */
	protected static final String COLUMN_GAP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getColumnGap() <em>Column Gap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumnGap()
	 * @generated
	 * @ordered
	 */
	protected String columnGap = COLUMN_GAP_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ColumnsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StylePackage.eINSTANCE.getColumnsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColumnSepType getColumnSep() {
		return columnSep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetColumnSep(ColumnSepType newColumnSep, NotificationChain msgs) {
		ColumnSepType oldColumnSep = columnSep;
		columnSep = newColumnSep;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StylePackage.COLUMNS_TYPE__COLUMN_SEP, oldColumnSep, newColumnSep);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColumnSep(ColumnSepType newColumnSep) {
		if (newColumnSep != columnSep) {
			NotificationChain msgs = null;
			if (columnSep != null)
				msgs = ((InternalEObject)columnSep).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StylePackage.COLUMNS_TYPE__COLUMN_SEP, null, msgs);
			if (newColumnSep != null)
				msgs = ((InternalEObject)newColumnSep).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StylePackage.COLUMNS_TYPE__COLUMN_SEP, null, msgs);
			msgs = basicSetColumnSep(newColumnSep, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.COLUMNS_TYPE__COLUMN_SEP, newColumnSep, newColumnSep));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ColumnType> getColumn() {
		if (column == null) {
			column = new EObjectContainmentEList<ColumnType>(ColumnType.class, this, StylePackage.COLUMNS_TYPE__COLUMN);
		}
		return column;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getColumnCount() {
		return columnCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColumnCount(BigInteger newColumnCount) {
		BigInteger oldColumnCount = columnCount;
		columnCount = newColumnCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.COLUMNS_TYPE__COLUMN_COUNT, oldColumnCount, columnCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getColumnGap() {
		return columnGap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColumnGap(String newColumnGap) {
		String oldColumnGap = columnGap;
		columnGap = newColumnGap;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.COLUMNS_TYPE__COLUMN_GAP, oldColumnGap, columnGap));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StylePackage.COLUMNS_TYPE__COLUMN_SEP:
				return basicSetColumnSep(null, msgs);
			case StylePackage.COLUMNS_TYPE__COLUMN:
				return ((InternalEList<?>)getColumn()).basicRemove(otherEnd, msgs);
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
			case StylePackage.COLUMNS_TYPE__COLUMN_SEP:
				return getColumnSep();
			case StylePackage.COLUMNS_TYPE__COLUMN:
				return getColumn();
			case StylePackage.COLUMNS_TYPE__COLUMN_COUNT:
				return getColumnCount();
			case StylePackage.COLUMNS_TYPE__COLUMN_GAP:
				return getColumnGap();
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
			case StylePackage.COLUMNS_TYPE__COLUMN_SEP:
				setColumnSep((ColumnSepType)newValue);
				return;
			case StylePackage.COLUMNS_TYPE__COLUMN:
				getColumn().clear();
				getColumn().addAll((Collection<? extends ColumnType>)newValue);
				return;
			case StylePackage.COLUMNS_TYPE__COLUMN_COUNT:
				setColumnCount((BigInteger)newValue);
				return;
			case StylePackage.COLUMNS_TYPE__COLUMN_GAP:
				setColumnGap((String)newValue);
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
			case StylePackage.COLUMNS_TYPE__COLUMN_SEP:
				setColumnSep((ColumnSepType)null);
				return;
			case StylePackage.COLUMNS_TYPE__COLUMN:
				getColumn().clear();
				return;
			case StylePackage.COLUMNS_TYPE__COLUMN_COUNT:
				setColumnCount(COLUMN_COUNT_EDEFAULT);
				return;
			case StylePackage.COLUMNS_TYPE__COLUMN_GAP:
				setColumnGap(COLUMN_GAP_EDEFAULT);
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
			case StylePackage.COLUMNS_TYPE__COLUMN_SEP:
				return columnSep != null;
			case StylePackage.COLUMNS_TYPE__COLUMN:
				return column != null && !column.isEmpty();
			case StylePackage.COLUMNS_TYPE__COLUMN_COUNT:
				return COLUMN_COUNT_EDEFAULT == null ? columnCount != null : !COLUMN_COUNT_EDEFAULT.equals(columnCount);
			case StylePackage.COLUMNS_TYPE__COLUMN_GAP:
				return COLUMN_GAP_EDEFAULT == null ? columnGap != null : !COLUMN_GAP_EDEFAULT.equals(columnGap);
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
		result.append(" (columnCount: ");
		result.append(columnCount);
		result.append(", columnGap: ");
		result.append(columnGap);
		result.append(')');
		return result.toString();
	}

} //ColumnsTypeImpl
