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
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.reuseware.coconut.description.DerivationData;
import org.reuseware.coconut.description.DescriptionPackage;
import org.reuseware.coconut.description.FacetDefinition;
import org.reuseware.coconut.description.FacetType;
import org.reuseware.coconut.description.FacetValue;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Facet Type</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.reuseware.coconut.description.impl.FacetTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.reuseware.coconut.description.impl.FacetTypeImpl#isMultiValue <em>Multi Value</em>}</li>
 *   <li>{@link org.reuseware.coconut.description.impl.FacetTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.reuseware.coconut.description.impl.FacetTypeImpl#getValues <em>Values</em>}</li>
 *   <li>{@link org.reuseware.coconut.description.impl.FacetTypeImpl#getContainer <em>Container</em>}</li>
 *   <li>{@link org.reuseware.coconut.description.impl.FacetTypeImpl#getDerivationData <em>Derivation Data</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class FacetTypeImpl extends EObjectImpl implements FacetType {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #isMultiValue() <em>Multi Value</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isMultiValue()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MULTI_VALUE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMultiValue() <em>Multi Value</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isMultiValue()
	 * @generated
	 * @ordered
	 */
	protected boolean multiValue = MULTI_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getValues() <em>Values</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getValues()
	 * @generated
	 * @ordered
	 */
	protected EList<FacetValue> values;

	/**
	 * The cached value of the '{@link #getDerivationData() <em>Derivation Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDerivationData()
	 * @generated
	 * @ordered
	 */
	protected DerivationData derivationData;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected FacetTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DescriptionPackage.Literals.FACET_TYPE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DescriptionPackage.FACET_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMultiValue() {
		return multiValue;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultiValue(boolean newMultiValue) {
		boolean oldMultiValue = multiValue;
		multiValue = newMultiValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DescriptionPackage.FACET_TYPE__MULTI_VALUE, oldMultiValue, multiValue));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DescriptionPackage.FACET_TYPE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FacetValue> getValues() {
		if (values == null) {
			values = new EObjectContainmentEList<FacetValue>(FacetValue.class, this, DescriptionPackage.FACET_TYPE__VALUES);
		}
		return values;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public FacetDefinition getContainer() {
		if (eContainerFeatureID() != DescriptionPackage.FACET_TYPE__CONTAINER) return null;
		return (FacetDefinition)eContainer();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContainer(FacetDefinition newContainer, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newContainer, DescriptionPackage.FACET_TYPE__CONTAINER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainer(FacetDefinition newContainer) {
		if (newContainer != eInternalContainer() || (eContainerFeatureID() != DescriptionPackage.FACET_TYPE__CONTAINER && newContainer != null)) {
			if (EcoreUtil.isAncestor(this, newContainer))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newContainer != null)
				msgs = ((InternalEObject)newContainer).eInverseAdd(this, DescriptionPackage.FACET_DEFINITION__FACET_TYPES, FacetDefinition.class, msgs);
			msgs = basicSetContainer(newContainer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DescriptionPackage.FACET_TYPE__CONTAINER, newContainer, newContainer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DerivationData getDerivationData() {
		return derivationData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDerivationData(DerivationData newDerivationData, NotificationChain msgs) {
		DerivationData oldDerivationData = derivationData;
		derivationData = newDerivationData;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DescriptionPackage.FACET_TYPE__DERIVATION_DATA, oldDerivationData, newDerivationData);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDerivationData(DerivationData newDerivationData) {
		if (newDerivationData != derivationData) {
			NotificationChain msgs = null;
			if (derivationData != null)
				msgs = ((InternalEObject)derivationData).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DescriptionPackage.FACET_TYPE__DERIVATION_DATA, null, msgs);
			if (newDerivationData != null)
				msgs = ((InternalEObject)newDerivationData).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DescriptionPackage.FACET_TYPE__DERIVATION_DATA, null, msgs);
			msgs = basicSetDerivationData(newDerivationData, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DescriptionPackage.FACET_TYPE__DERIVATION_DATA, newDerivationData, newDerivationData));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public String getQuery() {
		// Because this is a abstract class FacetTypeImpl will never be invoked.
		// All children of FacetType must have a 'String query' attribute so
		// that it's generated getter implements this method.
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID,
			NotificationChain msgs) {
		switch (featureID) {
			case DescriptionPackage.FACET_TYPE__CONTAINER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetContainer((FacetDefinition)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID,
			NotificationChain msgs) {
		switch (featureID) {
			case DescriptionPackage.FACET_TYPE__VALUES:
				return ((InternalEList<?>)getValues()).basicRemove(otherEnd, msgs);
			case DescriptionPackage.FACET_TYPE__CONTAINER:
				return basicSetContainer(null, msgs);
			case DescriptionPackage.FACET_TYPE__DERIVATION_DATA:
				return basicSetDerivationData(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case DescriptionPackage.FACET_TYPE__CONTAINER:
				return eInternalContainer().eInverseRemove(this, DescriptionPackage.FACET_DEFINITION__FACET_TYPES, FacetDefinition.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DescriptionPackage.FACET_TYPE__NAME:
				return getName();
			case DescriptionPackage.FACET_TYPE__MULTI_VALUE:
				return isMultiValue();
			case DescriptionPackage.FACET_TYPE__DESCRIPTION:
				return getDescription();
			case DescriptionPackage.FACET_TYPE__VALUES:
				return getValues();
			case DescriptionPackage.FACET_TYPE__CONTAINER:
				return getContainer();
			case DescriptionPackage.FACET_TYPE__DERIVATION_DATA:
				return getDerivationData();
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
			case DescriptionPackage.FACET_TYPE__NAME:
				setName((String)newValue);
				return;
			case DescriptionPackage.FACET_TYPE__MULTI_VALUE:
				setMultiValue((Boolean)newValue);
				return;
			case DescriptionPackage.FACET_TYPE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case DescriptionPackage.FACET_TYPE__VALUES:
				getValues().clear();
				getValues().addAll((Collection<? extends FacetValue>)newValue);
				return;
			case DescriptionPackage.FACET_TYPE__CONTAINER:
				setContainer((FacetDefinition)newValue);
				return;
			case DescriptionPackage.FACET_TYPE__DERIVATION_DATA:
				setDerivationData((DerivationData)newValue);
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
			case DescriptionPackage.FACET_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DescriptionPackage.FACET_TYPE__MULTI_VALUE:
				setMultiValue(MULTI_VALUE_EDEFAULT);
				return;
			case DescriptionPackage.FACET_TYPE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case DescriptionPackage.FACET_TYPE__VALUES:
				getValues().clear();
				return;
			case DescriptionPackage.FACET_TYPE__CONTAINER:
				setContainer((FacetDefinition)null);
				return;
			case DescriptionPackage.FACET_TYPE__DERIVATION_DATA:
				setDerivationData((DerivationData)null);
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
			case DescriptionPackage.FACET_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DescriptionPackage.FACET_TYPE__MULTI_VALUE:
				return multiValue != MULTI_VALUE_EDEFAULT;
			case DescriptionPackage.FACET_TYPE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case DescriptionPackage.FACET_TYPE__VALUES:
				return values != null && !values.isEmpty();
			case DescriptionPackage.FACET_TYPE__CONTAINER:
				return getContainer() != null;
			case DescriptionPackage.FACET_TYPE__DERIVATION_DATA:
				return derivationData != null;
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
		result.append(" (name: ");
		result.append(name);
		result.append(", multiValue: ");
		result.append(multiValue);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} // FacetTypeImpl
