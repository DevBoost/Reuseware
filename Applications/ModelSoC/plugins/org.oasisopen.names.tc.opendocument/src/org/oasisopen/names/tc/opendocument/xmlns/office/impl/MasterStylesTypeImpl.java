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
package org.oasisopen.names.tc.opendocument.xmlns.office.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.LayerSetType;
import org.oasisopen.names.tc.opendocument.xmlns.office.MasterStylesType;
import org.oasisopen.names.tc.opendocument.xmlns.office.OfficePackage;
import org.oasisopen.names.tc.opendocument.xmlns.style.HandoutMasterType;
import org.oasisopen.names.tc.opendocument.xmlns.style.MasterPageType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Master Styles Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.MasterStylesTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.MasterStylesTypeImpl#getMasterPage <em>Master Page</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.MasterStylesTypeImpl#getHandoutMaster <em>Handout Master</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.MasterStylesTypeImpl#getLayerSet <em>Layer Set</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MasterStylesTypeImpl extends EObjectImpl implements MasterStylesType {
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
	protected MasterStylesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OfficePackage.Literals.MASTER_STYLES_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, OfficePackage.MASTER_STYLES_TYPE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MasterPageType> getMasterPage() {
		return getGroup().list(OfficePackage.Literals.MASTER_STYLES_TYPE__MASTER_PAGE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HandoutMasterType> getHandoutMaster() {
		return getGroup().list(OfficePackage.Literals.MASTER_STYLES_TYPE__HANDOUT_MASTER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LayerSetType> getLayerSet() {
		return getGroup().list(OfficePackage.Literals.MASTER_STYLES_TYPE__LAYER_SET);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OfficePackage.MASTER_STYLES_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case OfficePackage.MASTER_STYLES_TYPE__MASTER_PAGE:
				return ((InternalEList<?>)getMasterPage()).basicRemove(otherEnd, msgs);
			case OfficePackage.MASTER_STYLES_TYPE__HANDOUT_MASTER:
				return ((InternalEList<?>)getHandoutMaster()).basicRemove(otherEnd, msgs);
			case OfficePackage.MASTER_STYLES_TYPE__LAYER_SET:
				return ((InternalEList<?>)getLayerSet()).basicRemove(otherEnd, msgs);
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
			case OfficePackage.MASTER_STYLES_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case OfficePackage.MASTER_STYLES_TYPE__MASTER_PAGE:
				return getMasterPage();
			case OfficePackage.MASTER_STYLES_TYPE__HANDOUT_MASTER:
				return getHandoutMaster();
			case OfficePackage.MASTER_STYLES_TYPE__LAYER_SET:
				return getLayerSet();
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
			case OfficePackage.MASTER_STYLES_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case OfficePackage.MASTER_STYLES_TYPE__MASTER_PAGE:
				getMasterPage().clear();
				getMasterPage().addAll((Collection<? extends MasterPageType>)newValue);
				return;
			case OfficePackage.MASTER_STYLES_TYPE__HANDOUT_MASTER:
				getHandoutMaster().clear();
				getHandoutMaster().addAll((Collection<? extends HandoutMasterType>)newValue);
				return;
			case OfficePackage.MASTER_STYLES_TYPE__LAYER_SET:
				getLayerSet().clear();
				getLayerSet().addAll((Collection<? extends LayerSetType>)newValue);
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
			case OfficePackage.MASTER_STYLES_TYPE__GROUP:
				getGroup().clear();
				return;
			case OfficePackage.MASTER_STYLES_TYPE__MASTER_PAGE:
				getMasterPage().clear();
				return;
			case OfficePackage.MASTER_STYLES_TYPE__HANDOUT_MASTER:
				getHandoutMaster().clear();
				return;
			case OfficePackage.MASTER_STYLES_TYPE__LAYER_SET:
				getLayerSet().clear();
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
			case OfficePackage.MASTER_STYLES_TYPE__GROUP:
				return group != null && !group.isEmpty();
			case OfficePackage.MASTER_STYLES_TYPE__MASTER_PAGE:
				return !getMasterPage().isEmpty();
			case OfficePackage.MASTER_STYLES_TYPE__HANDOUT_MASTER:
				return !getHandoutMaster().isEmpty();
			case OfficePackage.MASTER_STYLES_TYPE__LAYER_SET:
				return !getLayerSet().isEmpty();
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

} //MasterStylesTypeImpl
