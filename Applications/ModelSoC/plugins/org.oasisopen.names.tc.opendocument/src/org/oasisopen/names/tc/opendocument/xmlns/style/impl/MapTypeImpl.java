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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.oasisopen.names.tc.opendocument.xmlns.style.MapType;
import org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Map Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.MapTypeImpl#getApplyStyleName <em>Apply Style Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.MapTypeImpl#getBaseCellAddress <em>Base Cell Address</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.MapTypeImpl#getCondition <em>Condition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MapTypeImpl extends EObjectImpl implements MapType {
	/**
	 * The default value of the '{@link #getApplyStyleName() <em>Apply Style Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplyStyleName()
	 * @generated
	 * @ordered
	 */
	protected static final String APPLY_STYLE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getApplyStyleName() <em>Apply Style Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplyStyleName()
	 * @generated
	 * @ordered
	 */
	protected String applyStyleName = APPLY_STYLE_NAME_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MapTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StylePackage.eINSTANCE.getMapType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getApplyStyleName() {
		return applyStyleName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApplyStyleName(String newApplyStyleName) {
		String oldApplyStyleName = applyStyleName;
		applyStyleName = newApplyStyleName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.MAP_TYPE__APPLY_STYLE_NAME, oldApplyStyleName, applyStyleName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.MAP_TYPE__BASE_CELL_ADDRESS, oldBaseCellAddress, baseCellAddress));
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
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.MAP_TYPE__CONDITION, oldCondition, condition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StylePackage.MAP_TYPE__APPLY_STYLE_NAME:
				return getApplyStyleName();
			case StylePackage.MAP_TYPE__BASE_CELL_ADDRESS:
				return getBaseCellAddress();
			case StylePackage.MAP_TYPE__CONDITION:
				return getCondition();
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
			case StylePackage.MAP_TYPE__APPLY_STYLE_NAME:
				setApplyStyleName((String)newValue);
				return;
			case StylePackage.MAP_TYPE__BASE_CELL_ADDRESS:
				setBaseCellAddress((String)newValue);
				return;
			case StylePackage.MAP_TYPE__CONDITION:
				setCondition((String)newValue);
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
			case StylePackage.MAP_TYPE__APPLY_STYLE_NAME:
				setApplyStyleName(APPLY_STYLE_NAME_EDEFAULT);
				return;
			case StylePackage.MAP_TYPE__BASE_CELL_ADDRESS:
				setBaseCellAddress(BASE_CELL_ADDRESS_EDEFAULT);
				return;
			case StylePackage.MAP_TYPE__CONDITION:
				setCondition(CONDITION_EDEFAULT);
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
			case StylePackage.MAP_TYPE__APPLY_STYLE_NAME:
				return APPLY_STYLE_NAME_EDEFAULT == null ? applyStyleName != null : !APPLY_STYLE_NAME_EDEFAULT.equals(applyStyleName);
			case StylePackage.MAP_TYPE__BASE_CELL_ADDRESS:
				return BASE_CELL_ADDRESS_EDEFAULT == null ? baseCellAddress != null : !BASE_CELL_ADDRESS_EDEFAULT.equals(baseCellAddress);
			case StylePackage.MAP_TYPE__CONDITION:
				return CONDITION_EDEFAULT == null ? condition != null : !CONDITION_EDEFAULT.equals(condition);
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
		result.append(" (applyStyleName: ");
		result.append(applyStyleName);
		result.append(", baseCellAddress: ");
		result.append(baseCellAddress);
		result.append(", condition: ");
		result.append(condition);
		result.append(')');
		return result.toString();
	}

} //MapTypeImpl
