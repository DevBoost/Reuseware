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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.reuseware.coconut.description.DerivationState;
import org.reuseware.coconut.description.DescriptionPackage;
import org.reuseware.coconut.description.Facet;
import org.reuseware.coconut.description.FragmentDescription;
import org.reuseware.coconut.description.Property;
import org.reuseware.coconut.fragment.Fragment;
import org.reuseware.coconut.repository.impl.PackageableElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fragment Description</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.reuseware.coconut.description.impl.FragmentDescriptionImpl#getFacets <em>Facets</em>}</li>
 *   <li>{@link org.reuseware.coconut.description.impl.FragmentDescriptionImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.reuseware.coconut.description.impl.FragmentDescriptionImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.reuseware.coconut.description.impl.FragmentDescriptionImpl#getDerivationState <em>Derivation State</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FragmentDescriptionImpl extends PackageableElementImpl implements FragmentDescription {
	/**
	 * The cached value of the '{@link #getFacets() <em>Facets</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFacets()
	 * @generated
	 * @ordered
	 */
	protected EList<Facet> facets;

	/**
	 * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<Property> properties;

	/**
	 * The cached value of the '{@link #getSubject() <em>Subject</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubject()
	 * @generated
	 * @ordered
	 */
	protected Fragment subject;

	/**
	 * The default value of the '{@link #getDerivationState() <em>Derivation State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDerivationState()
	 * @generated
	 * @ordered
	 */
	protected static final DerivationState DERIVATION_STATE_EDEFAULT = DerivationState.REFRESH_ALL;

	/**
	 * The cached value of the '{@link #getDerivationState() <em>Derivation State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDerivationState()
	 * @generated
	 * @ordered
	 */
	protected DerivationState derivationState = DERIVATION_STATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FragmentDescriptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DescriptionPackage.Literals.FRAGMENT_DESCRIPTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Facet> getFacets() {
		if (facets == null) {
			facets = new EObjectContainmentEList<Facet>(Facet.class, this, DescriptionPackage.FRAGMENT_DESCRIPTION__FACETS);
		}
		return facets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getProperties() {
		if (properties == null) {
			properties = new EObjectContainmentEList<Property>(Property.class, this, DescriptionPackage.FRAGMENT_DESCRIPTION__PROPERTIES);
		}
		return properties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fragment getSubject() {
		if (subject != null && subject.eIsProxy()) {
			InternalEObject oldSubject = (InternalEObject)subject;
			subject = (Fragment)eResolveProxy(oldSubject);
			if (subject != oldSubject) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DescriptionPackage.FRAGMENT_DESCRIPTION__SUBJECT, oldSubject, subject));
			}
		}
		return subject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fragment basicGetSubject() {
		return subject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubject(Fragment newSubject) {
		Fragment oldSubject = subject;
		subject = newSubject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DescriptionPackage.FRAGMENT_DESCRIPTION__SUBJECT, oldSubject, subject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DerivationState getDerivationState() {
		return derivationState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDerivationState(DerivationState newDerivationState) {
		DerivationState oldDerivationState = derivationState;
		derivationState = newDerivationState == null ? DERIVATION_STATE_EDEFAULT : newDerivationState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DescriptionPackage.FRAGMENT_DESCRIPTION__DERIVATION_STATE, oldDerivationState, derivationState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DescriptionPackage.FRAGMENT_DESCRIPTION__FACETS:
				return ((InternalEList<?>)getFacets()).basicRemove(otherEnd, msgs);
			case DescriptionPackage.FRAGMENT_DESCRIPTION__PROPERTIES:
				return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
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
			case DescriptionPackage.FRAGMENT_DESCRIPTION__FACETS:
				return getFacets();
			case DescriptionPackage.FRAGMENT_DESCRIPTION__PROPERTIES:
				return getProperties();
			case DescriptionPackage.FRAGMENT_DESCRIPTION__SUBJECT:
				if (resolve) return getSubject();
				return basicGetSubject();
			case DescriptionPackage.FRAGMENT_DESCRIPTION__DERIVATION_STATE:
				return getDerivationState();
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
			case DescriptionPackage.FRAGMENT_DESCRIPTION__FACETS:
				getFacets().clear();
				getFacets().addAll((Collection<? extends Facet>)newValue);
				return;
			case DescriptionPackage.FRAGMENT_DESCRIPTION__PROPERTIES:
				getProperties().clear();
				getProperties().addAll((Collection<? extends Property>)newValue);
				return;
			case DescriptionPackage.FRAGMENT_DESCRIPTION__SUBJECT:
				setSubject((Fragment)newValue);
				return;
			case DescriptionPackage.FRAGMENT_DESCRIPTION__DERIVATION_STATE:
				setDerivationState((DerivationState)newValue);
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
			case DescriptionPackage.FRAGMENT_DESCRIPTION__FACETS:
				getFacets().clear();
				return;
			case DescriptionPackage.FRAGMENT_DESCRIPTION__PROPERTIES:
				getProperties().clear();
				return;
			case DescriptionPackage.FRAGMENT_DESCRIPTION__SUBJECT:
				setSubject((Fragment)null);
				return;
			case DescriptionPackage.FRAGMENT_DESCRIPTION__DERIVATION_STATE:
				setDerivationState(DERIVATION_STATE_EDEFAULT);
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
			case DescriptionPackage.FRAGMENT_DESCRIPTION__FACETS:
				return facets != null && !facets.isEmpty();
			case DescriptionPackage.FRAGMENT_DESCRIPTION__PROPERTIES:
				return properties != null && !properties.isEmpty();
			case DescriptionPackage.FRAGMENT_DESCRIPTION__SUBJECT:
				return subject != null;
			case DescriptionPackage.FRAGMENT_DESCRIPTION__DERIVATION_STATE:
				return derivationState != DERIVATION_STATE_EDEFAULT;
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
		result.append(" (derivationState: ");
		result.append(derivationState);
		result.append(')');
		return result.toString();
	}

} //FragmentDescriptionImpl
