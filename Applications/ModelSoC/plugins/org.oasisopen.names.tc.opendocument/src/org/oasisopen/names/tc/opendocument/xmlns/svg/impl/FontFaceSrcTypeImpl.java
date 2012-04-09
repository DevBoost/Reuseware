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
package org.oasisopen.names.tc.opendocument.xmlns.svg.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;
import org.oasisopen.names.tc.opendocument.xmlns.svg.FontFaceNameType;
import org.oasisopen.names.tc.opendocument.xmlns.svg.FontFaceSrcType;
import org.oasisopen.names.tc.opendocument.xmlns.svg.FontFaceUriType;
import org.oasisopen.names.tc.opendocument.xmlns.svg.SvgPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Font Face Src Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.svg.impl.FontFaceSrcTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.svg.impl.FontFaceSrcTypeImpl#getFontFaceUri <em>Font Face Uri</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.svg.impl.FontFaceSrcTypeImpl#getFontFaceName <em>Font Face Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FontFaceSrcTypeImpl extends EObjectImpl implements FontFaceSrcType {
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
	protected FontFaceSrcTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SvgPackage.Literals.FONT_FACE_SRC_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, SvgPackage.FONT_FACE_SRC_TYPE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FontFaceUriType> getFontFaceUri() {
		return getGroup().list(SvgPackage.Literals.FONT_FACE_SRC_TYPE__FONT_FACE_URI);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FontFaceNameType> getFontFaceName() {
		return getGroup().list(SvgPackage.Literals.FONT_FACE_SRC_TYPE__FONT_FACE_NAME);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SvgPackage.FONT_FACE_SRC_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case SvgPackage.FONT_FACE_SRC_TYPE__FONT_FACE_URI:
				return ((InternalEList<?>)getFontFaceUri()).basicRemove(otherEnd, msgs);
			case SvgPackage.FONT_FACE_SRC_TYPE__FONT_FACE_NAME:
				return ((InternalEList<?>)getFontFaceName()).basicRemove(otherEnd, msgs);
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
			case SvgPackage.FONT_FACE_SRC_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case SvgPackage.FONT_FACE_SRC_TYPE__FONT_FACE_URI:
				return getFontFaceUri();
			case SvgPackage.FONT_FACE_SRC_TYPE__FONT_FACE_NAME:
				return getFontFaceName();
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
			case SvgPackage.FONT_FACE_SRC_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case SvgPackage.FONT_FACE_SRC_TYPE__FONT_FACE_URI:
				getFontFaceUri().clear();
				getFontFaceUri().addAll((Collection<? extends FontFaceUriType>)newValue);
				return;
			case SvgPackage.FONT_FACE_SRC_TYPE__FONT_FACE_NAME:
				getFontFaceName().clear();
				getFontFaceName().addAll((Collection<? extends FontFaceNameType>)newValue);
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
			case SvgPackage.FONT_FACE_SRC_TYPE__GROUP:
				getGroup().clear();
				return;
			case SvgPackage.FONT_FACE_SRC_TYPE__FONT_FACE_URI:
				getFontFaceUri().clear();
				return;
			case SvgPackage.FONT_FACE_SRC_TYPE__FONT_FACE_NAME:
				getFontFaceName().clear();
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
			case SvgPackage.FONT_FACE_SRC_TYPE__GROUP:
				return group != null && !group.isEmpty();
			case SvgPackage.FONT_FACE_SRC_TYPE__FONT_FACE_URI:
				return !getFontFaceUri().isEmpty();
			case SvgPackage.FONT_FACE_SRC_TYPE__FONT_FACE_NAME:
				return !getFontFaceName().isEmpty();
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

} //FontFaceSrcTypeImpl
