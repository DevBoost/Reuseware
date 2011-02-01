/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.reuseware.air.language.componentmodel.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.reuseware.air.language.componentmodel.AbstractFragmentType;
import org.reuseware.air.language.componentmodel.AbstractVariationPointName;
import org.reuseware.air.language.componentmodel.ComponentmodelPackage;
import org.reuseware.air.language.componentmodel.FragmentTypeSlot;
import org.reuseware.air.language.componentmodel.Slot;
import org.reuseware.air.language.componentmodel.VariationPoint;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fragment Type Slot</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.reuseware.air.language.componentmodel.impl.FragmentTypeSlotImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.reuseware.air.language.componentmodel.impl.FragmentTypeSlotImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FragmentTypeSlotImpl extends AbstractFragmentTypeImpl implements FragmentTypeSlot {
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected AbstractFragmentType type;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected AbstractVariationPointName name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FragmentTypeSlotImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponentmodelPackage.Literals.FRAGMENT_TYPE_SLOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractFragmentType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(AbstractFragmentType newType, NotificationChain msgs) {
		AbstractFragmentType oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ComponentmodelPackage.FRAGMENT_TYPE_SLOT__TYPE, oldType, newType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(AbstractFragmentType newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ComponentmodelPackage.FRAGMENT_TYPE_SLOT__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ComponentmodelPackage.FRAGMENT_TYPE_SLOT__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentmodelPackage.FRAGMENT_TYPE_SLOT__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractVariationPointName getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetName(AbstractVariationPointName newName, NotificationChain msgs) {
		AbstractVariationPointName oldName = name;
		name = newName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ComponentmodelPackage.FRAGMENT_TYPE_SLOT__NAME, oldName, newName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(AbstractVariationPointName newName) {
		if (newName != name) {
			NotificationChain msgs = null;
			if (name != null)
				msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ComponentmodelPackage.FRAGMENT_TYPE_SLOT__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ComponentmodelPackage.FRAGMENT_TYPE_SLOT__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentmodelPackage.FRAGMENT_TYPE_SLOT__NAME, newName, newName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ComponentmodelPackage.FRAGMENT_TYPE_SLOT__TYPE:
				return basicSetType(null, msgs);
			case ComponentmodelPackage.FRAGMENT_TYPE_SLOT__NAME:
				return basicSetName(null, msgs);
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
			case ComponentmodelPackage.FRAGMENT_TYPE_SLOT__TYPE:
				return getType();
			case ComponentmodelPackage.FRAGMENT_TYPE_SLOT__NAME:
				return getName();
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
			case ComponentmodelPackage.FRAGMENT_TYPE_SLOT__TYPE:
				setType((AbstractFragmentType)newValue);
				return;
			case ComponentmodelPackage.FRAGMENT_TYPE_SLOT__NAME:
				setName((AbstractVariationPointName)newValue);
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
			case ComponentmodelPackage.FRAGMENT_TYPE_SLOT__TYPE:
				setType((AbstractFragmentType)null);
				return;
			case ComponentmodelPackage.FRAGMENT_TYPE_SLOT__NAME:
				setName((AbstractVariationPointName)null);
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
			case ComponentmodelPackage.FRAGMENT_TYPE_SLOT__TYPE:
				return type != null;
			case ComponentmodelPackage.FRAGMENT_TYPE_SLOT__NAME:
				return name != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == VariationPoint.class) {
			switch (derivedFeatureID) {
				case ComponentmodelPackage.FRAGMENT_TYPE_SLOT__TYPE: return ComponentmodelPackage.VARIATION_POINT__TYPE;
				case ComponentmodelPackage.FRAGMENT_TYPE_SLOT__NAME: return ComponentmodelPackage.VARIATION_POINT__NAME;
				default: return -1;
			}
		}
		if (baseClass == Slot.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == VariationPoint.class) {
			switch (baseFeatureID) {
				case ComponentmodelPackage.VARIATION_POINT__TYPE: return ComponentmodelPackage.FRAGMENT_TYPE_SLOT__TYPE;
				case ComponentmodelPackage.VARIATION_POINT__NAME: return ComponentmodelPackage.FRAGMENT_TYPE_SLOT__NAME;
				default: return -1;
			}
		}
		if (baseClass == Slot.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //FragmentTypeSlotImpl
