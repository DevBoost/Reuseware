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
package org.oasisopen.names.tc.opendocument.xmlns.text.impl;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;
import org.oasisopen.names.tc.opendocument.xmlns.text.TextChangedRegionContent;
import org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Changed Region Content</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.TextChangedRegionContentImpl#getTextChangedRegionContentGroup <em>Text Changed Region Content Group</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.TextChangedRegionContentImpl#getTextChangedRegionContent <em>Text Changed Region Content</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TextChangedRegionContentImpl extends EObjectImpl implements TextChangedRegionContent {
	/**
	 * The cached value of the '{@link #getTextChangedRegionContentGroup() <em>Text Changed Region Content Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextChangedRegionContentGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap textChangedRegionContentGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TextChangedRegionContentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TextPackage.eINSTANCE.getTextChangedRegionContent();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getTextChangedRegionContentGroup() {
		if (textChangedRegionContentGroup == null) {
			textChangedRegionContentGroup = new BasicFeatureMap(this, TextPackage.TEXT_CHANGED_REGION_CONTENT__TEXT_CHANGED_REGION_CONTENT_GROUP);
		}
		return textChangedRegionContentGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getTextChangedRegionContent() {
		return (EObject)getTextChangedRegionContentGroup().get(TextPackage.eINSTANCE.getTextChangedRegionContent_TextChangedRegionContent(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTextChangedRegionContent(EObject newTextChangedRegionContent, NotificationChain msgs) {
		return ((FeatureMap.Internal)getTextChangedRegionContentGroup()).basicAdd(TextPackage.eINSTANCE.getTextChangedRegionContent_TextChangedRegionContent(), newTextChangedRegionContent, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TextPackage.TEXT_CHANGED_REGION_CONTENT__TEXT_CHANGED_REGION_CONTENT_GROUP:
				return ((InternalEList<?>)getTextChangedRegionContentGroup()).basicRemove(otherEnd, msgs);
			case TextPackage.TEXT_CHANGED_REGION_CONTENT__TEXT_CHANGED_REGION_CONTENT:
				return basicSetTextChangedRegionContent(null, msgs);
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
			case TextPackage.TEXT_CHANGED_REGION_CONTENT__TEXT_CHANGED_REGION_CONTENT_GROUP:
				if (coreType) return getTextChangedRegionContentGroup();
				return ((FeatureMap.Internal)getTextChangedRegionContentGroup()).getWrapper();
			case TextPackage.TEXT_CHANGED_REGION_CONTENT__TEXT_CHANGED_REGION_CONTENT:
				return getTextChangedRegionContent();
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
			case TextPackage.TEXT_CHANGED_REGION_CONTENT__TEXT_CHANGED_REGION_CONTENT_GROUP:
				((FeatureMap.Internal)getTextChangedRegionContentGroup()).set(newValue);
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
			case TextPackage.TEXT_CHANGED_REGION_CONTENT__TEXT_CHANGED_REGION_CONTENT_GROUP:
				getTextChangedRegionContentGroup().clear();
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
			case TextPackage.TEXT_CHANGED_REGION_CONTENT__TEXT_CHANGED_REGION_CONTENT_GROUP:
				return textChangedRegionContentGroup != null && !textChangedRegionContentGroup.isEmpty();
			case TextPackage.TEXT_CHANGED_REGION_CONTENT__TEXT_CHANGED_REGION_CONTENT:
				return getTextChangedRegionContent() != null;
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
		result.append(" (textChangedRegionContentGroup: ");
		result.append(textChangedRegionContentGroup);
		result.append(')');
		return result.toString();
	}

} //TextChangedRegionContentImpl
