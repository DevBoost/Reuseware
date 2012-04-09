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
 * Copyright (c) 2006-2011
 * Software Technology Group, Dresden University of Technology
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Software Technology Group - TU Dresden, Germany
 *      - initial API and implementation
 */
package org.reuseware.sokan.ui.model.sokanui.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.reuseware.sokan.ui.model.sokanui.Root;
import org.reuseware.sokan.ui.model.sokanui.SokanuiPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.reuseware.sokan.ui.model.sokanui.impl.RootImpl#getVisibleTypes <em>Visible Types</em>}</li>
 *   <li>{@link org.reuseware.sokan.ui.model.sokanui.impl.RootImpl#getResourceSet <em>Resource Set</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class RootImpl extends EObjectImpl implements Root {
	/**
	 * The cached value of the '{@link #getVisibleTypes() <em>Visible Types</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibleTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<EClass> visibleTypes;

	/**
	 * The default value of the '{@link #getResourceSet() <em>Resource Set</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceSet()
	 * @generated
	 * @ordered
	 */
	protected static final ResourceSet RESOURCE_SET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResourceSet() <em>Resource Set</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceSet()
	 * @generated
	 * @ordered
	 */
	protected ResourceSet resourceSet = RESOURCE_SET_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SokanuiPackage.Literals.ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EClass> getVisibleTypes() {
		if (visibleTypes == null) {
			visibleTypes = new EObjectResolvingEList<EClass>(EClass.class, this, SokanuiPackage.ROOT__VISIBLE_TYPES);
		}
		return visibleTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceSet getResourceSet() {
		return resourceSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResourceSet(ResourceSet newResourceSet) {
		ResourceSet oldResourceSet = resourceSet;
		resourceSet = newResourceSet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SokanuiPackage.ROOT__RESOURCE_SET, oldResourceSet, resourceSet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SokanuiPackage.ROOT__VISIBLE_TYPES:
				return getVisibleTypes();
			case SokanuiPackage.ROOT__RESOURCE_SET:
				return getResourceSet();
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
			case SokanuiPackage.ROOT__VISIBLE_TYPES:
				getVisibleTypes().clear();
				getVisibleTypes().addAll((Collection<? extends EClass>)newValue);
				return;
			case SokanuiPackage.ROOT__RESOURCE_SET:
				setResourceSet((ResourceSet)newValue);
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
			case SokanuiPackage.ROOT__VISIBLE_TYPES:
				getVisibleTypes().clear();
				return;
			case SokanuiPackage.ROOT__RESOURCE_SET:
				setResourceSet(RESOURCE_SET_EDEFAULT);
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
			case SokanuiPackage.ROOT__VISIBLE_TYPES:
				return visibleTypes != null && !visibleTypes.isEmpty();
			case SokanuiPackage.ROOT__RESOURCE_SET:
				return RESOURCE_SET_EDEFAULT == null ? resourceSet != null : !RESOURCE_SET_EDEFAULT.equals(resourceSet);
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
		result.append(" (resourceSet: ");
		result.append(resourceSet);
		result.append(')');
		return result.toString();
	}

} //RootImpl
