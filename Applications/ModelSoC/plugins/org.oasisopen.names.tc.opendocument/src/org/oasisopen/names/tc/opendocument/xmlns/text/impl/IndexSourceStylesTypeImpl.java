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

import java.math.BigInteger;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.oasisopen.names.tc.opendocument.xmlns.text.IndexSourceStyleType;
import org.oasisopen.names.tc.opendocument.xmlns.text.IndexSourceStylesType;
import org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Index Source Styles Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.IndexSourceStylesTypeImpl#getIndexSourceStyle <em>Index Source Style</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.IndexSourceStylesTypeImpl#getOutlineLevel <em>Outline Level</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IndexSourceStylesTypeImpl extends EObjectImpl implements IndexSourceStylesType {
	/**
	 * The cached value of the '{@link #getIndexSourceStyle() <em>Index Source Style</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndexSourceStyle()
	 * @generated
	 * @ordered
	 */
	protected EList<IndexSourceStyleType> indexSourceStyle;

	/**
	 * The default value of the '{@link #getOutlineLevel() <em>Outline Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutlineLevel()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger OUTLINE_LEVEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOutlineLevel() <em>Outline Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutlineLevel()
	 * @generated
	 * @ordered
	 */
	protected BigInteger outlineLevel = OUTLINE_LEVEL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IndexSourceStylesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TextPackage.eINSTANCE.getIndexSourceStylesType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IndexSourceStyleType> getIndexSourceStyle() {
		if (indexSourceStyle == null) {
			indexSourceStyle = new EObjectContainmentEList<IndexSourceStyleType>(IndexSourceStyleType.class, this, TextPackage.INDEX_SOURCE_STYLES_TYPE__INDEX_SOURCE_STYLE);
		}
		return indexSourceStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getOutlineLevel() {
		return outlineLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutlineLevel(BigInteger newOutlineLevel) {
		BigInteger oldOutlineLevel = outlineLevel;
		outlineLevel = newOutlineLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.INDEX_SOURCE_STYLES_TYPE__OUTLINE_LEVEL, oldOutlineLevel, outlineLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TextPackage.INDEX_SOURCE_STYLES_TYPE__INDEX_SOURCE_STYLE:
				return ((InternalEList<?>)getIndexSourceStyle()).basicRemove(otherEnd, msgs);
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
			case TextPackage.INDEX_SOURCE_STYLES_TYPE__INDEX_SOURCE_STYLE:
				return getIndexSourceStyle();
			case TextPackage.INDEX_SOURCE_STYLES_TYPE__OUTLINE_LEVEL:
				return getOutlineLevel();
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
			case TextPackage.INDEX_SOURCE_STYLES_TYPE__INDEX_SOURCE_STYLE:
				getIndexSourceStyle().clear();
				getIndexSourceStyle().addAll((Collection<? extends IndexSourceStyleType>)newValue);
				return;
			case TextPackage.INDEX_SOURCE_STYLES_TYPE__OUTLINE_LEVEL:
				setOutlineLevel((BigInteger)newValue);
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
			case TextPackage.INDEX_SOURCE_STYLES_TYPE__INDEX_SOURCE_STYLE:
				getIndexSourceStyle().clear();
				return;
			case TextPackage.INDEX_SOURCE_STYLES_TYPE__OUTLINE_LEVEL:
				setOutlineLevel(OUTLINE_LEVEL_EDEFAULT);
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
			case TextPackage.INDEX_SOURCE_STYLES_TYPE__INDEX_SOURCE_STYLE:
				return indexSourceStyle != null && !indexSourceStyle.isEmpty();
			case TextPackage.INDEX_SOURCE_STYLES_TYPE__OUTLINE_LEVEL:
				return OUTLINE_LEVEL_EDEFAULT == null ? outlineLevel != null : !OUTLINE_LEVEL_EDEFAULT.equals(outlineLevel);
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
		result.append(" (outlineLevel: ");
		result.append(outlineLevel);
		result.append(')');
		return result.toString();
	}

} //IndexSourceStylesTypeImpl
