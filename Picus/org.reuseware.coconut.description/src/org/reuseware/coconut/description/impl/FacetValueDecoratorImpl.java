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
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.reuseware.coconut.description.DescriptionPackage;
import org.reuseware.coconut.description.FacetValue;
import org.reuseware.coconut.description.FacetValueDecorator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Facet Value Decorator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.reuseware.coconut.description.impl.FacetValueDecoratorImpl#getChildren <em>Children</em>}</li>
 *   <li>{@link org.reuseware.coconut.description.impl.FacetValueDecoratorImpl#getDecoratee <em>Decoratee</em>}</li>
 *   <li>{@link org.reuseware.coconut.description.impl.FacetValueDecoratorImpl#getValueCount <em>Value Count</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FacetValueDecoratorImpl extends EObjectImpl implements FacetValueDecorator {
	/**
	 * The cached value of the '{@link #getChildren() <em>Children</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildren()
	 * @generated
	 * @ordered
	 */
	protected EList<FacetValueDecorator> children;

	/**
	 * The cached value of the '{@link #getDecoratee() <em>Decoratee</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecoratee()
	 * @generated
	 * @ordered
	 */
	protected FacetValue decoratee;

	/**
	 * The default value of the '{@link #getValueCount() <em>Value Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueCount()
	 * @generated
	 * @ordered
	 */
	protected static final int VALUE_COUNT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getValueCount() <em>Value Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueCount()
	 * @generated
	 * @ordered
	 */
	protected int valueCount = VALUE_COUNT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FacetValueDecoratorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DescriptionPackage.Literals.FACET_VALUE_DECORATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FacetValueDecorator> getChildren() {
		if (children == null) {
			children = new EObjectResolvingEList<FacetValueDecorator>(FacetValueDecorator.class, this, DescriptionPackage.FACET_VALUE_DECORATOR__CHILDREN);
		}
		return children;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FacetValue getDecoratee() {
		if (decoratee != null && decoratee.eIsProxy()) {
			InternalEObject oldDecoratee = (InternalEObject)decoratee;
			decoratee = (FacetValue)eResolveProxy(oldDecoratee);
			if (decoratee != oldDecoratee) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DescriptionPackage.FACET_VALUE_DECORATOR__DECORATEE, oldDecoratee, decoratee));
			}
		}
		return decoratee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FacetValue basicGetDecoratee() {
		return decoratee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDecoratee(FacetValue newDecoratee) {
		FacetValue oldDecoratee = decoratee;
		decoratee = newDecoratee;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DescriptionPackage.FACET_VALUE_DECORATOR__DECORATEE, oldDecoratee, decoratee));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValueCount() {
		return valueCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueCount(int newValueCount) {
		int oldValueCount = valueCount;
		valueCount = newValueCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DescriptionPackage.FACET_VALUE_DECORATOR__VALUE_COUNT, oldValueCount, valueCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DescriptionPackage.FACET_VALUE_DECORATOR__CHILDREN:
				return getChildren();
			case DescriptionPackage.FACET_VALUE_DECORATOR__DECORATEE:
				if (resolve) return getDecoratee();
				return basicGetDecoratee();
			case DescriptionPackage.FACET_VALUE_DECORATOR__VALUE_COUNT:
				return getValueCount();
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
			case DescriptionPackage.FACET_VALUE_DECORATOR__CHILDREN:
				getChildren().clear();
				getChildren().addAll((Collection<? extends FacetValueDecorator>)newValue);
				return;
			case DescriptionPackage.FACET_VALUE_DECORATOR__DECORATEE:
				setDecoratee((FacetValue)newValue);
				return;
			case DescriptionPackage.FACET_VALUE_DECORATOR__VALUE_COUNT:
				setValueCount((Integer)newValue);
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
			case DescriptionPackage.FACET_VALUE_DECORATOR__CHILDREN:
				getChildren().clear();
				return;
			case DescriptionPackage.FACET_VALUE_DECORATOR__DECORATEE:
				setDecoratee((FacetValue)null);
				return;
			case DescriptionPackage.FACET_VALUE_DECORATOR__VALUE_COUNT:
				setValueCount(VALUE_COUNT_EDEFAULT);
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
			case DescriptionPackage.FACET_VALUE_DECORATOR__CHILDREN:
				return children != null && !children.isEmpty();
			case DescriptionPackage.FACET_VALUE_DECORATOR__DECORATEE:
				return decoratee != null;
			case DescriptionPackage.FACET_VALUE_DECORATOR__VALUE_COUNT:
				return valueCount != VALUE_COUNT_EDEFAULT;
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
		result.append(" (valueCount: ");
		result.append(valueCount);
		result.append(')');
		return result.toString();
	}

} //FacetValueDecoratorImpl
