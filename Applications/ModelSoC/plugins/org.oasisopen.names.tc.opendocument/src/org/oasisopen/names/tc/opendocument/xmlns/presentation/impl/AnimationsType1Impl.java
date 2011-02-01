/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.presentation.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;
import org.oasisopen.names.tc.opendocument.xmlns.presentation.AnimationGroupType;
import org.oasisopen.names.tc.opendocument.xmlns.presentation.AnimationsType1;
import org.oasisopen.names.tc.opendocument.xmlns.presentation.PresentationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Animations Type1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.AnimationsType1Impl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.AnimationsType1Impl#getPresentationAnimationElementsGroup <em>Presentation Animation Elements Group</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.AnimationsType1Impl#getPresentationAnimationElements <em>Presentation Animation Elements</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.AnimationsType1Impl#getAnimationGroup <em>Animation Group</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AnimationsType1Impl extends EObjectImpl implements AnimationsType1 {
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
	protected AnimationsType1Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PresentationPackage.Literals.ANIMATIONS_TYPE1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, PresentationPackage.ANIMATIONS_TYPE1__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getPresentationAnimationElementsGroup() {
		return (FeatureMap)getGroup().<FeatureMap.Entry>list(PresentationPackage.Literals.ANIMATIONS_TYPE1__PRESENTATION_ANIMATION_ELEMENTS_GROUP);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getPresentationAnimationElements() {
		return getPresentationAnimationElementsGroup().list(PresentationPackage.Literals.ANIMATIONS_TYPE1__PRESENTATION_ANIMATION_ELEMENTS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AnimationGroupType> getAnimationGroup() {
		return getGroup().list(PresentationPackage.Literals.ANIMATIONS_TYPE1__ANIMATION_GROUP);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PresentationPackage.ANIMATIONS_TYPE1__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case PresentationPackage.ANIMATIONS_TYPE1__PRESENTATION_ANIMATION_ELEMENTS_GROUP:
				return ((InternalEList<?>)getPresentationAnimationElementsGroup()).basicRemove(otherEnd, msgs);
			case PresentationPackage.ANIMATIONS_TYPE1__PRESENTATION_ANIMATION_ELEMENTS:
				return ((InternalEList<?>)getPresentationAnimationElements()).basicRemove(otherEnd, msgs);
			case PresentationPackage.ANIMATIONS_TYPE1__ANIMATION_GROUP:
				return ((InternalEList<?>)getAnimationGroup()).basicRemove(otherEnd, msgs);
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
			case PresentationPackage.ANIMATIONS_TYPE1__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case PresentationPackage.ANIMATIONS_TYPE1__PRESENTATION_ANIMATION_ELEMENTS_GROUP:
				if (coreType) return getPresentationAnimationElementsGroup();
				return ((FeatureMap.Internal)getPresentationAnimationElementsGroup()).getWrapper();
			case PresentationPackage.ANIMATIONS_TYPE1__PRESENTATION_ANIMATION_ELEMENTS:
				return getPresentationAnimationElements();
			case PresentationPackage.ANIMATIONS_TYPE1__ANIMATION_GROUP:
				return getAnimationGroup();
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
			case PresentationPackage.ANIMATIONS_TYPE1__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case PresentationPackage.ANIMATIONS_TYPE1__PRESENTATION_ANIMATION_ELEMENTS_GROUP:
				((FeatureMap.Internal)getPresentationAnimationElementsGroup()).set(newValue);
				return;
			case PresentationPackage.ANIMATIONS_TYPE1__ANIMATION_GROUP:
				getAnimationGroup().clear();
				getAnimationGroup().addAll((Collection<? extends AnimationGroupType>)newValue);
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
			case PresentationPackage.ANIMATIONS_TYPE1__GROUP:
				getGroup().clear();
				return;
			case PresentationPackage.ANIMATIONS_TYPE1__PRESENTATION_ANIMATION_ELEMENTS_GROUP:
				getPresentationAnimationElementsGroup().clear();
				return;
			case PresentationPackage.ANIMATIONS_TYPE1__ANIMATION_GROUP:
				getAnimationGroup().clear();
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
			case PresentationPackage.ANIMATIONS_TYPE1__GROUP:
				return group != null && !group.isEmpty();
			case PresentationPackage.ANIMATIONS_TYPE1__PRESENTATION_ANIMATION_ELEMENTS_GROUP:
				return !getPresentationAnimationElementsGroup().isEmpty();
			case PresentationPackage.ANIMATIONS_TYPE1__PRESENTATION_ANIMATION_ELEMENTS:
				return !getPresentationAnimationElements().isEmpty();
			case PresentationPackage.ANIMATIONS_TYPE1__ANIMATION_GROUP:
				return !getAnimationGroup().isEmpty();
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

} //AnimationsType1Impl
