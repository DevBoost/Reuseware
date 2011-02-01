/*******************************************************************************
 * Copyright (c) 2006-2009
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
 ******************************************************************************/
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.reuseware.coconut.description.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.reuseware.coconut.description.DescriptionPackage;
import org.reuseware.coconut.description.Facet;
import org.reuseware.coconut.description.FacetType;
import org.reuseware.coconut.description.FacetValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Facet</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.reuseware.coconut.description.impl.FacetImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.reuseware.coconut.description.impl.FacetImpl#getValues <em>Values</em>}</li>
 *   <li>{@link org.reuseware.coconut.description.impl.FacetImpl#getTypeID <em>Type ID</em>}</li>
 *   <li>{@link org.reuseware.coconut.description.impl.FacetImpl#getValueNames <em>Value Names</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FacetImpl extends EObjectImpl implements Facet {
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected FacetType type;

	/**
	 * The cached value of the '{@link #getValues() <em>Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValues()
	 * @generated
	 * @ordered
	 */
	protected EList<FacetValue> values;

	/**
	 * The cached value of the '{@link #getTypeID() <em>Type ID</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeID()
	 * @generated
	 * @ordered
	 */
	protected EList<String> typeID;

	/**
	 * The cached value of the '{@link #getValueNames() <em>Value Names</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueNames()
	 * @generated
	 * @ordered
	 */
	protected EList<String> valueNames;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FacetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DescriptionPackage.Literals.FACET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FacetType getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (FacetType)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DescriptionPackage.FACET__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FacetType basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(FacetType newType) {
		FacetType oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DescriptionPackage.FACET__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FacetValue> getValues() {
		if (values == null) {
			values = new EObjectResolvingEList<FacetValue>(FacetValue.class, this, DescriptionPackage.FACET__VALUES);
		}
		return values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getTypeID() {
		if (typeID == null) {
			typeID = new EDataTypeUniqueEList<String>(String.class, this, DescriptionPackage.FACET__TYPE_ID);
		}
		return typeID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getValueNames() {
		if (valueNames == null) {
			valueNames = new EDataTypeUniqueEList<String>(String.class, this, DescriptionPackage.FACET__VALUE_NAMES);
		}
		return valueNames;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DescriptionPackage.FACET__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case DescriptionPackage.FACET__VALUES:
				return getValues();
			case DescriptionPackage.FACET__TYPE_ID:
				return getTypeID();
			case DescriptionPackage.FACET__VALUE_NAMES:
				return getValueNames();
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
			case DescriptionPackage.FACET__TYPE:
				setType((FacetType)newValue);
				return;
			case DescriptionPackage.FACET__VALUES:
				getValues().clear();
				getValues().addAll((Collection<? extends FacetValue>)newValue);
				return;
			case DescriptionPackage.FACET__TYPE_ID:
				getTypeID().clear();
				getTypeID().addAll((Collection<? extends String>)newValue);
				return;
			case DescriptionPackage.FACET__VALUE_NAMES:
				getValueNames().clear();
				getValueNames().addAll((Collection<? extends String>)newValue);
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
			case DescriptionPackage.FACET__TYPE:
				setType((FacetType)null);
				return;
			case DescriptionPackage.FACET__VALUES:
				getValues().clear();
				return;
			case DescriptionPackage.FACET__TYPE_ID:
				getTypeID().clear();
				return;
			case DescriptionPackage.FACET__VALUE_NAMES:
				getValueNames().clear();
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
			case DescriptionPackage.FACET__TYPE:
				return type != null;
			case DescriptionPackage.FACET__VALUES:
				return values != null && !values.isEmpty();
			case DescriptionPackage.FACET__TYPE_ID:
				return typeID != null && !typeID.isEmpty();
			case DescriptionPackage.FACET__VALUE_NAMES:
				return valueNames != null && !valueNames.isEmpty();
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
		result.append(" (typeID: ");
		result.append(typeID);
		result.append(", valueNames: ");
		result.append(valueNames);
		result.append(')');
		return result.toString();
	}

} //FacetImpl
