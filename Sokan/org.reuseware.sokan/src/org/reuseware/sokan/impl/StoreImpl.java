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
package org.reuseware.sokan.impl;

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
import org.reuseware.sokan.Filter;
import org.reuseware.sokan.SokanPackage;
import org.reuseware.sokan.Store;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Store</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.reuseware.sokan.impl.StoreImpl#getFilters <em>Filters</em>}</li>
 *   <li>{@link org.reuseware.sokan.impl.StoreImpl#getUriBuffer <em>Uri Buffer</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StoreImpl extends EObjectImpl implements Store {
	/**
	 * The cached value of the '{@link #getFilters() <em>Filters</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getFilters()
	 * @generated
	 * @ordered
	 */
	protected EList<Filter> filters;

	/**
	 * The default value of the '{@link #getUriBuffer() <em>Uri Buffer</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getUriBuffer()
	 * @generated
	 * @ordered
	 */
	protected static final String URI_BUFFER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUriBuffer() <em>Uri Buffer</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getUriBuffer()
	 * @generated
	 * @ordered
	 */
	protected String uriBuffer = URI_BUFFER_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected StoreImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SokanPackage.Literals.STORE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Filter> getFilters() {
		if (filters == null) {
			filters = new EObjectContainmentEList<Filter>(Filter.class, this, SokanPackage.STORE__FILTERS);
		}
		return filters;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getUriBuffer() {
		return uriBuffer;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setUriBuffer(String newUriBuffer) {
		String oldUriBuffer = uriBuffer;
		uriBuffer = newUriBuffer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SokanPackage.STORE__URI_BUFFER, oldUriBuffer, uriBuffer));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SokanPackage.STORE__FILTERS:
				return ((InternalEList<?>)getFilters()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SokanPackage.STORE__FILTERS:
				return getFilters();
			case SokanPackage.STORE__URI_BUFFER:
				return getUriBuffer();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SokanPackage.STORE__FILTERS:
				getFilters().clear();
				getFilters().addAll((Collection<? extends Filter>)newValue);
				return;
			case SokanPackage.STORE__URI_BUFFER:
				setUriBuffer((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SokanPackage.STORE__FILTERS:
				getFilters().clear();
				return;
			case SokanPackage.STORE__URI_BUFFER:
				setUriBuffer(URI_BUFFER_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SokanPackage.STORE__FILTERS:
				return filters != null && !filters.isEmpty();
			case SokanPackage.STORE__URI_BUFFER:
				return URI_BUFFER_EDEFAULT == null ? uriBuffer != null : !URI_BUFFER_EDEFAULT.equals(uriBuffer);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (uriBuffer: ");
		result.append(uriBuffer);
		result.append(')');
		return result.toString();
	}

} // StoreImpl
