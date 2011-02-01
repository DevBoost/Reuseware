/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.text.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.oasisopen.names.tc.opendocument.xmlns.text.OutlineLevelStyleType;
import org.oasisopen.names.tc.opendocument.xmlns.text.OutlineStyleType;
import org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Outline Style Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.OutlineStyleTypeImpl#getOutlineLevelStyle <em>Outline Level Style</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OutlineStyleTypeImpl extends EObjectImpl implements OutlineStyleType {
	/**
	 * The cached value of the '{@link #getOutlineLevelStyle() <em>Outline Level Style</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutlineLevelStyle()
	 * @generated
	 * @ordered
	 */
	protected EList<OutlineLevelStyleType> outlineLevelStyle;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OutlineStyleTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TextPackage.eINSTANCE.getOutlineStyleType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OutlineLevelStyleType> getOutlineLevelStyle() {
		if (outlineLevelStyle == null) {
			outlineLevelStyle = new EObjectContainmentEList<OutlineLevelStyleType>(OutlineLevelStyleType.class, this, TextPackage.OUTLINE_STYLE_TYPE__OUTLINE_LEVEL_STYLE);
		}
		return outlineLevelStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TextPackage.OUTLINE_STYLE_TYPE__OUTLINE_LEVEL_STYLE:
				return ((InternalEList<?>)getOutlineLevelStyle()).basicRemove(otherEnd, msgs);
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
			case TextPackage.OUTLINE_STYLE_TYPE__OUTLINE_LEVEL_STYLE:
				return getOutlineLevelStyle();
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
			case TextPackage.OUTLINE_STYLE_TYPE__OUTLINE_LEVEL_STYLE:
				getOutlineLevelStyle().clear();
				getOutlineLevelStyle().addAll((Collection<? extends OutlineLevelStyleType>)newValue);
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
			case TextPackage.OUTLINE_STYLE_TYPE__OUTLINE_LEVEL_STYLE:
				getOutlineLevelStyle().clear();
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
			case TextPackage.OUTLINE_STYLE_TYPE__OUTLINE_LEVEL_STYLE:
				return outlineLevelStyle != null && !outlineLevelStyle.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //OutlineStyleTypeImpl
