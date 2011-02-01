/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.presentation.impl;

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
import org.oasisopen.names.tc.opendocument.xmlns.presentation.PresentationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Animation Group Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.AnimationGroupTypeImpl#getPresentationAnimationElementsGroup <em>Presentation Animation Elements Group</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.AnimationGroupTypeImpl#getPresentationAnimationElements <em>Presentation Animation Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AnimationGroupTypeImpl extends EObjectImpl implements AnimationGroupType {
	/**
	 * The cached value of the '{@link #getPresentationAnimationElementsGroup() <em>Presentation Animation Elements Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPresentationAnimationElementsGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap presentationAnimationElementsGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnimationGroupTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PresentationPackage.Literals.ANIMATION_GROUP_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getPresentationAnimationElementsGroup() {
		if (presentationAnimationElementsGroup == null) {
			presentationAnimationElementsGroup = new BasicFeatureMap(this, PresentationPackage.ANIMATION_GROUP_TYPE__PRESENTATION_ANIMATION_ELEMENTS_GROUP);
		}
		return presentationAnimationElementsGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getPresentationAnimationElements() {
		return getPresentationAnimationElementsGroup().list(PresentationPackage.Literals.ANIMATION_GROUP_TYPE__PRESENTATION_ANIMATION_ELEMENTS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PresentationPackage.ANIMATION_GROUP_TYPE__PRESENTATION_ANIMATION_ELEMENTS_GROUP:
				return ((InternalEList<?>)getPresentationAnimationElementsGroup()).basicRemove(otherEnd, msgs);
			case PresentationPackage.ANIMATION_GROUP_TYPE__PRESENTATION_ANIMATION_ELEMENTS:
				return ((InternalEList<?>)getPresentationAnimationElements()).basicRemove(otherEnd, msgs);
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
			case PresentationPackage.ANIMATION_GROUP_TYPE__PRESENTATION_ANIMATION_ELEMENTS_GROUP:
				if (coreType) return getPresentationAnimationElementsGroup();
				return ((FeatureMap.Internal)getPresentationAnimationElementsGroup()).getWrapper();
			case PresentationPackage.ANIMATION_GROUP_TYPE__PRESENTATION_ANIMATION_ELEMENTS:
				return getPresentationAnimationElements();
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
			case PresentationPackage.ANIMATION_GROUP_TYPE__PRESENTATION_ANIMATION_ELEMENTS_GROUP:
				((FeatureMap.Internal)getPresentationAnimationElementsGroup()).set(newValue);
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
			case PresentationPackage.ANIMATION_GROUP_TYPE__PRESENTATION_ANIMATION_ELEMENTS_GROUP:
				getPresentationAnimationElementsGroup().clear();
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
			case PresentationPackage.ANIMATION_GROUP_TYPE__PRESENTATION_ANIMATION_ELEMENTS_GROUP:
				return presentationAnimationElementsGroup != null && !presentationAnimationElementsGroup.isEmpty();
			case PresentationPackage.ANIMATION_GROUP_TYPE__PRESENTATION_ANIMATION_ELEMENTS:
				return !getPresentationAnimationElements().isEmpty();
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
		result.append(" (presentationAnimationElementsGroup: ");
		result.append(presentationAnimationElementsGroup);
		result.append(')');
		return result.toString();
	}

} //AnimationGroupTypeImpl
