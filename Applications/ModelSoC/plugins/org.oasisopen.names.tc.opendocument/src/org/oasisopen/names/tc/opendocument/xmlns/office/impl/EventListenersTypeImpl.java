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
package org.oasisopen.names.tc.opendocument.xmlns.office.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;
import org.oasisopen.names.tc.opendocument.xmlns.office.EventListenersType;
import org.oasisopen.names.tc.opendocument.xmlns.office.OfficePackage;
import org.oasisopen.names.tc.opendocument.xmlns.script.EventListenerType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Event Listeners Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.EventListenersTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.EventListenersTypeImpl#getEventListener <em>Event Listener</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.EventListenersTypeImpl#getEventListener1 <em>Event Listener1</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EventListenersTypeImpl extends EObjectImpl implements EventListenersType {
	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventListenersTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OfficePackage.Literals.EVENT_LISTENERS_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, OfficePackage.EVENT_LISTENERS_TYPE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EventListenerType> getEventListener() {
		return getGroup().list(OfficePackage.Literals.EVENT_LISTENERS_TYPE__EVENT_LISTENER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<org.oasisopen.names.tc.opendocument.xmlns.presentation.EventListenerType> getEventListener1() {
		return getGroup().list(OfficePackage.Literals.EVENT_LISTENERS_TYPE__EVENT_LISTENER1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OfficePackage.EVENT_LISTENERS_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case OfficePackage.EVENT_LISTENERS_TYPE__EVENT_LISTENER:
				return ((InternalEList<?>)getEventListener()).basicRemove(otherEnd, msgs);
			case OfficePackage.EVENT_LISTENERS_TYPE__EVENT_LISTENER1:
				return ((InternalEList<?>)getEventListener1()).basicRemove(otherEnd, msgs);
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
			case OfficePackage.EVENT_LISTENERS_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case OfficePackage.EVENT_LISTENERS_TYPE__EVENT_LISTENER:
				return getEventListener();
			case OfficePackage.EVENT_LISTENERS_TYPE__EVENT_LISTENER1:
				return getEventListener1();
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
			case OfficePackage.EVENT_LISTENERS_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case OfficePackage.EVENT_LISTENERS_TYPE__EVENT_LISTENER:
				getEventListener().clear();
				getEventListener().addAll((Collection<? extends EventListenerType>)newValue);
				return;
			case OfficePackage.EVENT_LISTENERS_TYPE__EVENT_LISTENER1:
				getEventListener1().clear();
				getEventListener1().addAll((Collection<? extends org.oasisopen.names.tc.opendocument.xmlns.presentation.EventListenerType>)newValue);
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
			case OfficePackage.EVENT_LISTENERS_TYPE__GROUP:
				getGroup().clear();
				return;
			case OfficePackage.EVENT_LISTENERS_TYPE__EVENT_LISTENER:
				getEventListener().clear();
				return;
			case OfficePackage.EVENT_LISTENERS_TYPE__EVENT_LISTENER1:
				getEventListener1().clear();
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
			case OfficePackage.EVENT_LISTENERS_TYPE__GROUP:
				return group != null && !group.isEmpty();
			case OfficePackage.EVENT_LISTENERS_TYPE__EVENT_LISTENER:
				return !getEventListener().isEmpty();
			case OfficePackage.EVENT_LISTENERS_TYPE__EVENT_LISTENER1:
				return !getEventListener1().isEmpty();
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
		result.append(" (group: ");
		result.append(group);
		result.append(')');
		return result.toString();
	}

} //EventListenersTypeImpl
