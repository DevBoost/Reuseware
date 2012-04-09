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
package org.reuseware.coconut.description.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.reuseware.coconut.description.DescriptionPackage;
import org.reuseware.coconut.description.FacetDefinition;
import org.reuseware.coconut.description.FacetType;
import org.reuseware.coconut.repository.impl.PackageableElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Facet Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.reuseware.coconut.description.impl.FacetDefinitionImpl#getFacetTypes <em>Facet Types</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FacetDefinitionImpl extends PackageableElementImpl implements FacetDefinition {
	/**
	 * The cached value of the '{@link #getFacetTypes() <em>Facet Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFacetTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<FacetType> facetTypes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FacetDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DescriptionPackage.Literals.FACET_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FacetType> getFacetTypes() {
		if (facetTypes == null) {
			facetTypes = new EObjectContainmentWithInverseEList<FacetType>(FacetType.class, this, DescriptionPackage.FACET_DEFINITION__FACET_TYPES, DescriptionPackage.FACET_TYPE__CONTAINER);
		}
		return facetTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DescriptionPackage.FACET_DEFINITION__FACET_TYPES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFacetTypes()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DescriptionPackage.FACET_DEFINITION__FACET_TYPES:
				return ((InternalEList<?>)getFacetTypes()).basicRemove(otherEnd, msgs);
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
			case DescriptionPackage.FACET_DEFINITION__FACET_TYPES:
				return getFacetTypes();
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
			case DescriptionPackage.FACET_DEFINITION__FACET_TYPES:
				getFacetTypes().clear();
				getFacetTypes().addAll((Collection<? extends FacetType>)newValue);
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
			case DescriptionPackage.FACET_DEFINITION__FACET_TYPES:
				getFacetTypes().clear();
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
			case DescriptionPackage.FACET_DEFINITION__FACET_TYPES:
				return facetTypes != null && !facetTypes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FacetDefinitionImpl
