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
import org.oasisopen.names.tc.opendocument.xmlns.table.CutOffsType;
import org.oasisopen.names.tc.opendocument.xmlns.table.InsertionCutOffType;
import org.oasisopen.names.tc.opendocument.xmlns.table.MovementCutOffType;
import org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cut Offs Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.CutOffsTypeImpl#getMovementCutOff <em>Movement Cut Off</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.CutOffsTypeImpl#getInsertionCutOff <em>Insertion Cut Off</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.CutOffsTypeImpl#getMovementCutOff1 <em>Movement Cut Off1</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CutOffsTypeImpl extends EObjectImpl implements CutOffsType {
	/**
	 * The cached value of the '{@link #getMovementCutOff() <em>Movement Cut Off</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMovementCutOff()
	 * @generated
	 * @ordered
	 */
	protected EList<MovementCutOffType> movementCutOff;

	/**
	 * The cached value of the '{@link #getInsertionCutOff() <em>Insertion Cut Off</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInsertionCutOff()
	 * @generated
	 * @ordered
	 */
	protected InsertionCutOffType insertionCutOff;

	/**
	 * The cached value of the '{@link #getMovementCutOff1() <em>Movement Cut Off1</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMovementCutOff1()
	 * @generated
	 * @ordered
	 */
	protected EList<MovementCutOffType> movementCutOff1;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CutOffsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TablePackage.eINSTANCE.getCutOffsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MovementCutOffType> getMovementCutOff() {
		if (movementCutOff == null) {
			movementCutOff = new EObjectContainmentEList<MovementCutOffType>(MovementCutOffType.class, this, TablePackage.CUT_OFFS_TYPE__MOVEMENT_CUT_OFF);
		}
		return movementCutOff;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InsertionCutOffType getInsertionCutOff() {
		return insertionCutOff;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInsertionCutOff(InsertionCutOffType newInsertionCutOff, NotificationChain msgs) {
		InsertionCutOffType oldInsertionCutOff = insertionCutOff;
		insertionCutOff = newInsertionCutOff;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TablePackage.CUT_OFFS_TYPE__INSERTION_CUT_OFF, oldInsertionCutOff, newInsertionCutOff);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInsertionCutOff(InsertionCutOffType newInsertionCutOff) {
		if (newInsertionCutOff != insertionCutOff) {
			NotificationChain msgs = null;
			if (insertionCutOff != null)
				msgs = ((InternalEObject)insertionCutOff).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TablePackage.CUT_OFFS_TYPE__INSERTION_CUT_OFF, null, msgs);
			if (newInsertionCutOff != null)
				msgs = ((InternalEObject)newInsertionCutOff).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TablePackage.CUT_OFFS_TYPE__INSERTION_CUT_OFF, null, msgs);
			msgs = basicSetInsertionCutOff(newInsertionCutOff, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.CUT_OFFS_TYPE__INSERTION_CUT_OFF, newInsertionCutOff, newInsertionCutOff));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MovementCutOffType> getMovementCutOff1() {
		if (movementCutOff1 == null) {
			movementCutOff1 = new EObjectContainmentEList<MovementCutOffType>(MovementCutOffType.class, this, TablePackage.CUT_OFFS_TYPE__MOVEMENT_CUT_OFF1);
		}
		return movementCutOff1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TablePackage.CUT_OFFS_TYPE__MOVEMENT_CUT_OFF:
				return ((InternalEList<?>)getMovementCutOff()).basicRemove(otherEnd, msgs);
			case TablePackage.CUT_OFFS_TYPE__INSERTION_CUT_OFF:
				return basicSetInsertionCutOff(null, msgs);
			case TablePackage.CUT_OFFS_TYPE__MOVEMENT_CUT_OFF1:
				return ((InternalEList<?>)getMovementCutOff1()).basicRemove(otherEnd, msgs);
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
			case TablePackage.CUT_OFFS_TYPE__MOVEMENT_CUT_OFF:
				return getMovementCutOff();
			case TablePackage.CUT_OFFS_TYPE__INSERTION_CUT_OFF:
				return getInsertionCutOff();
			case TablePackage.CUT_OFFS_TYPE__MOVEMENT_CUT_OFF1:
				return getMovementCutOff1();
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
			case TablePackage.CUT_OFFS_TYPE__MOVEMENT_CUT_OFF:
				getMovementCutOff().clear();
				getMovementCutOff().addAll((Collection<? extends MovementCutOffType>)newValue);
				return;
			case TablePackage.CUT_OFFS_TYPE__INSERTION_CUT_OFF:
				setInsertionCutOff((InsertionCutOffType)newValue);
				return;
			case TablePackage.CUT_OFFS_TYPE__MOVEMENT_CUT_OFF1:
				getMovementCutOff1().clear();
				getMovementCutOff1().addAll((Collection<? extends MovementCutOffType>)newValue);
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
			case TablePackage.CUT_OFFS_TYPE__MOVEMENT_CUT_OFF:
				getMovementCutOff().clear();
				return;
			case TablePackage.CUT_OFFS_TYPE__INSERTION_CUT_OFF:
				setInsertionCutOff((InsertionCutOffType)null);
				return;
			case TablePackage.CUT_OFFS_TYPE__MOVEMENT_CUT_OFF1:
				getMovementCutOff1().clear();
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
			case TablePackage.CUT_OFFS_TYPE__MOVEMENT_CUT_OFF:
				return movementCutOff != null && !movementCutOff.isEmpty();
			case TablePackage.CUT_OFFS_TYPE__INSERTION_CUT_OFF:
				return insertionCutOff != null;
			case TablePackage.CUT_OFFS_TYPE__MOVEMENT_CUT_OFF1:
				return movementCutOff1 != null && !movementCutOff1.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CutOffsTypeImpl
