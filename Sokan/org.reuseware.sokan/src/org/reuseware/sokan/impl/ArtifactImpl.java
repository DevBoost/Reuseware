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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.reuseware.sokan.Artifact;
import org.reuseware.sokan.IndexRow;
import org.reuseware.sokan.SokanPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Artifact</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.reuseware.sokan.impl.ArtifactImpl#getModel <em>Model</em>}</li>
 *   <li>{@link org.reuseware.sokan.impl.ArtifactImpl#getMetaInformation <em>Meta Information</em>}</li>
 *   <li>{@link org.reuseware.sokan.impl.ArtifactImpl#getIndexRepresentation <em>Index Representation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ArtifactImpl extends IdentifiableElementImpl implements Artifact {
	/**
	 * The cached value of the '{@link #getModel() <em>Model</em>}' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getModel()
	 * @generated
	 * @ordered
	 */
	protected EList<EObject> model;

	/**
	 * The cached value of the '{@link #getMetaInformation() <em>Meta Information</em>}' reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getMetaInformation()
	 * @generated
	 * @ordered
	 */
	protected EObject metaInformation;

	/**
	 * The cached value of the '{@link #getIndexRepresentation()
	 * <em>Index Representation</em>}' containment reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getIndexRepresentation()
	 * @generated
	 * @ordered
	 */
	protected IndexRow indexRepresentation;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ArtifactImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SokanPackage.Literals.ARTIFACT;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getModel() {
		if (model == null) {
			model = new EObjectResolvingEList<EObject>(EObject.class, this, SokanPackage.ARTIFACT__MODEL);
		}
		return model;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getMetaInformation() {
		if (metaInformation != null && metaInformation.eIsProxy()) {
			InternalEObject oldMetaInformation = (InternalEObject)metaInformation;
			metaInformation = eResolveProxy(oldMetaInformation);
			if (metaInformation != oldMetaInformation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SokanPackage.ARTIFACT__META_INFORMATION, oldMetaInformation, metaInformation));
			}
		}
		return metaInformation;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetMetaInformation() {
		return metaInformation;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setMetaInformation(EObject newMetaInformation) {
		EObject oldMetaInformation = metaInformation;
		metaInformation = newMetaInformation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SokanPackage.ARTIFACT__META_INFORMATION, oldMetaInformation, metaInformation));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public IndexRow getIndexRepresentation() {
		return indexRepresentation;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIndexRepresentation(
			IndexRow newIndexRepresentation, NotificationChain msgs) {
		IndexRow oldIndexRepresentation = indexRepresentation;
		indexRepresentation = newIndexRepresentation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SokanPackage.ARTIFACT__INDEX_REPRESENTATION, oldIndexRepresentation, newIndexRepresentation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setIndexRepresentation(IndexRow newIndexRepresentation) {
		if (newIndexRepresentation != indexRepresentation) {
			NotificationChain msgs = null;
			if (indexRepresentation != null)
				msgs = ((InternalEObject)indexRepresentation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SokanPackage.ARTIFACT__INDEX_REPRESENTATION, null, msgs);
			if (newIndexRepresentation != null)
				msgs = ((InternalEObject)newIndexRepresentation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SokanPackage.ARTIFACT__INDEX_REPRESENTATION, null, msgs);
			msgs = basicSetIndexRepresentation(newIndexRepresentation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SokanPackage.ARTIFACT__INDEX_REPRESENTATION, newIndexRepresentation, newIndexRepresentation));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SokanPackage.ARTIFACT__INDEX_REPRESENTATION:
				return basicSetIndexRepresentation(null, msgs);
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
			case SokanPackage.ARTIFACT__MODEL:
				return getModel();
			case SokanPackage.ARTIFACT__META_INFORMATION:
				if (resolve) return getMetaInformation();
				return basicGetMetaInformation();
			case SokanPackage.ARTIFACT__INDEX_REPRESENTATION:
				return getIndexRepresentation();
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
			case SokanPackage.ARTIFACT__MODEL:
				getModel().clear();
				getModel().addAll((Collection<? extends EObject>)newValue);
				return;
			case SokanPackage.ARTIFACT__META_INFORMATION:
				setMetaInformation((EObject)newValue);
				return;
			case SokanPackage.ARTIFACT__INDEX_REPRESENTATION:
				setIndexRepresentation((IndexRow)newValue);
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
			case SokanPackage.ARTIFACT__MODEL:
				getModel().clear();
				return;
			case SokanPackage.ARTIFACT__META_INFORMATION:
				setMetaInformation((EObject)null);
				return;
			case SokanPackage.ARTIFACT__INDEX_REPRESENTATION:
				setIndexRepresentation((IndexRow)null);
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
			case SokanPackage.ARTIFACT__MODEL:
				return model != null && !model.isEmpty();
			case SokanPackage.ARTIFACT__META_INFORMATION:
				return metaInformation != null;
			case SokanPackage.ARTIFACT__INDEX_REPRESENTATION:
				return indexRepresentation != null;
		}
		return super.eIsSet(featureID);
	}

} // ArtifactImpl
