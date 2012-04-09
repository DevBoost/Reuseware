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
package org.reuseware.sokan.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.reuseware.sokan.ID;
import org.reuseware.sokan.IndexRow;
import org.reuseware.sokan.IndexTransaction;
import org.reuseware.sokan.SokanPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Index Transaction</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.reuseware.sokan.impl.IndexTransactionImpl#getRemArtifacts <em>Rem Artifacts</em>}</li>
 *   <li>{@link org.reuseware.sokan.impl.IndexTransactionImpl#getAddArtifacts <em>Add Artifacts</em>}</li>
 *   <li>{@link org.reuseware.sokan.impl.IndexTransactionImpl#getUpdateArtifacts <em>Update Artifacts</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IndexTransactionImpl extends EObjectImpl implements
		IndexTransaction {
	/**
	 * The cached value of the '{@link #getRemArtifacts() <em>Rem Artifacts</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getRemArtifacts()
	 * @generated
	 * @ordered
	 */
	protected EList<ID> remArtifacts;

	/**
	 * The cached value of the '{@link #getAddArtifacts() <em>Add Artifacts</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getAddArtifacts()
	 * @generated
	 * @ordered
	 */
	protected EList<IndexRow> addArtifacts;

	/**
	 * The cached value of the '{@link #getUpdateArtifacts() <em>Update Artifacts</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getUpdateArtifacts()
	 * @generated
	 * @ordered
	 */
	protected EList<IndexRow> updateArtifacts;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected IndexTransactionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SokanPackage.Literals.INDEX_TRANSACTION;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ID> getRemArtifacts() {
		if (remArtifacts == null) {
			remArtifacts = new EObjectContainmentEList<ID>(ID.class, this, SokanPackage.INDEX_TRANSACTION__REM_ARTIFACTS);
		}
		return remArtifacts;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IndexRow> getAddArtifacts() {
		if (addArtifacts == null) {
			addArtifacts = new EObjectContainmentEList<IndexRow>(IndexRow.class, this, SokanPackage.INDEX_TRANSACTION__ADD_ARTIFACTS);
		}
		return addArtifacts;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IndexRow> getUpdateArtifacts() {
		if (updateArtifacts == null) {
			updateArtifacts = new EObjectContainmentEList<IndexRow>(IndexRow.class, this, SokanPackage.INDEX_TRANSACTION__UPDATE_ARTIFACTS);
		}
		return updateArtifacts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SokanPackage.INDEX_TRANSACTION__REM_ARTIFACTS:
				return ((InternalEList<?>)getRemArtifacts()).basicRemove(otherEnd, msgs);
			case SokanPackage.INDEX_TRANSACTION__ADD_ARTIFACTS:
				return ((InternalEList<?>)getAddArtifacts()).basicRemove(otherEnd, msgs);
			case SokanPackage.INDEX_TRANSACTION__UPDATE_ARTIFACTS:
				return ((InternalEList<?>)getUpdateArtifacts()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SokanPackage.INDEX_TRANSACTION__REM_ARTIFACTS:
				return getRemArtifacts();
			case SokanPackage.INDEX_TRANSACTION__ADD_ARTIFACTS:
				return getAddArtifacts();
			case SokanPackage.INDEX_TRANSACTION__UPDATE_ARTIFACTS:
				return getUpdateArtifacts();
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
			case SokanPackage.INDEX_TRANSACTION__REM_ARTIFACTS:
				getRemArtifacts().clear();
				getRemArtifacts().addAll((Collection<? extends ID>)newValue);
				return;
			case SokanPackage.INDEX_TRANSACTION__ADD_ARTIFACTS:
				getAddArtifacts().clear();
				getAddArtifacts().addAll((Collection<? extends IndexRow>)newValue);
				return;
			case SokanPackage.INDEX_TRANSACTION__UPDATE_ARTIFACTS:
				getUpdateArtifacts().clear();
				getUpdateArtifacts().addAll((Collection<? extends IndexRow>)newValue);
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
			case SokanPackage.INDEX_TRANSACTION__REM_ARTIFACTS:
				getRemArtifacts().clear();
				return;
			case SokanPackage.INDEX_TRANSACTION__ADD_ARTIFACTS:
				getAddArtifacts().clear();
				return;
			case SokanPackage.INDEX_TRANSACTION__UPDATE_ARTIFACTS:
				getUpdateArtifacts().clear();
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
			case SokanPackage.INDEX_TRANSACTION__REM_ARTIFACTS:
				return remArtifacts != null && !remArtifacts.isEmpty();
			case SokanPackage.INDEX_TRANSACTION__ADD_ARTIFACTS:
				return addArtifacts != null && !addArtifacts.isEmpty();
			case SokanPackage.INDEX_TRANSACTION__UPDATE_ARTIFACTS:
				return updateArtifacts != null && !updateArtifacts.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // IndexTransactionImpl
