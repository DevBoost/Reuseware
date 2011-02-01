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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.reuseware.coconut.description.DescriptionPackage;
import org.reuseware.coconut.description.Facet;
import org.reuseware.coconut.description.FacetType;
import org.reuseware.coconut.description.FacetTypeDecorator;
import org.reuseware.coconut.description.FacetValueDecorator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Facet Type Decorator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.reuseware.coconut.description.impl.FacetTypeDecoratorImpl#getValues <em>Values</em>}</li>
 *   <li>{@link org.reuseware.coconut.description.impl.FacetTypeDecoratorImpl#getDecoratee <em>Decoratee</em>}</li>
 *   <li>{@link org.reuseware.coconut.description.impl.FacetTypeDecoratorImpl#getSelection <em>Selection</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FacetTypeDecoratorImpl extends EObjectImpl implements FacetTypeDecorator {
	/**
	 * The cached value of the '{@link #getValues() <em>Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValues()
	 * @generated
	 * @ordered
	 */
	protected EList<FacetValueDecorator> values;

	/**
	 * The cached value of the '{@link #getDecoratee() <em>Decoratee</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecoratee()
	 * @generated
	 * @ordered
	 */
	protected FacetType decoratee;

	/**
	 * The cached value of the '{@link #getSelection() <em>Selection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelection()
	 * @generated
	 * @ordered
	 */
	protected Facet selection;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FacetTypeDecoratorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DescriptionPackage.Literals.FACET_TYPE_DECORATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FacetValueDecorator> getValues() {
		if (values == null) {
			values = new EObjectResolvingEList<FacetValueDecorator>(FacetValueDecorator.class, this, DescriptionPackage.FACET_TYPE_DECORATOR__VALUES);
		}
		return values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FacetType getDecoratee() {
		if (decoratee != null && decoratee.eIsProxy()) {
			InternalEObject oldDecoratee = (InternalEObject)decoratee;
			decoratee = (FacetType)eResolveProxy(oldDecoratee);
			if (decoratee != oldDecoratee) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DescriptionPackage.FACET_TYPE_DECORATOR__DECORATEE, oldDecoratee, decoratee));
			}
		}
		return decoratee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FacetType basicGetDecoratee() {
		return decoratee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDecoratee(FacetType newDecoratee) {
		FacetType oldDecoratee = decoratee;
		decoratee = newDecoratee;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DescriptionPackage.FACET_TYPE_DECORATOR__DECORATEE, oldDecoratee, decoratee));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Facet getSelection() {
		if (selection != null && selection.eIsProxy()) {
			InternalEObject oldSelection = (InternalEObject)selection;
			selection = (Facet)eResolveProxy(oldSelection);
			if (selection != oldSelection) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DescriptionPackage.FACET_TYPE_DECORATOR__SELECTION, oldSelection, selection));
			}
		}
		return selection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Facet basicGetSelection() {
		return selection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelection(Facet newSelection) {
		Facet oldSelection = selection;
		selection = newSelection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DescriptionPackage.FACET_TYPE_DECORATOR__SELECTION, oldSelection, selection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DescriptionPackage.FACET_TYPE_DECORATOR__VALUES:
				return getValues();
			case DescriptionPackage.FACET_TYPE_DECORATOR__DECORATEE:
				if (resolve) return getDecoratee();
				return basicGetDecoratee();
			case DescriptionPackage.FACET_TYPE_DECORATOR__SELECTION:
				if (resolve) return getSelection();
				return basicGetSelection();
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
			case DescriptionPackage.FACET_TYPE_DECORATOR__VALUES:
				getValues().clear();
				getValues().addAll((Collection<? extends FacetValueDecorator>)newValue);
				return;
			case DescriptionPackage.FACET_TYPE_DECORATOR__DECORATEE:
				setDecoratee((FacetType)newValue);
				return;
			case DescriptionPackage.FACET_TYPE_DECORATOR__SELECTION:
				setSelection((Facet)newValue);
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
			case DescriptionPackage.FACET_TYPE_DECORATOR__VALUES:
				getValues().clear();
				return;
			case DescriptionPackage.FACET_TYPE_DECORATOR__DECORATEE:
				setDecoratee((FacetType)null);
				return;
			case DescriptionPackage.FACET_TYPE_DECORATOR__SELECTION:
				setSelection((Facet)null);
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
			case DescriptionPackage.FACET_TYPE_DECORATOR__VALUES:
				return values != null && !values.isEmpty();
			case DescriptionPackage.FACET_TYPE_DECORATOR__DECORATEE:
				return decoratee != null;
			case DescriptionPackage.FACET_TYPE_DECORATOR__SELECTION:
				return selection != null;
		}
		return super.eIsSet(featureID);
	}

} //FacetTypeDecoratorImpl
