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
import org.oasisopen.names.tc.opendocument.xmlns.text.ChangedRegionType;
import org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage;
import org.oasisopen.names.tc.opendocument.xmlns.text.TrackedChangesType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tracked Changes Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.TrackedChangesTypeImpl#getChangedRegion <em>Changed Region</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.TrackedChangesTypeImpl#getTrackChanges <em>Track Changes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TrackedChangesTypeImpl extends EObjectImpl implements TrackedChangesType {
	/**
	 * The cached value of the '{@link #getChangedRegion() <em>Changed Region</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangedRegion()
	 * @generated
	 * @ordered
	 */
	protected EList<ChangedRegionType> changedRegion;

	/**
	 * The default value of the '{@link #getTrackChanges() <em>Track Changes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrackChanges()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean TRACK_CHANGES_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getTrackChanges() <em>Track Changes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrackChanges()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean trackChanges = TRACK_CHANGES_EDEFAULT;

	/**
	 * This is true if the Track Changes attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean trackChangesESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TrackedChangesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TextPackage.eINSTANCE.getTrackedChangesType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ChangedRegionType> getChangedRegion() {
		if (changedRegion == null) {
			changedRegion = new EObjectContainmentEList<ChangedRegionType>(ChangedRegionType.class, this, TextPackage.TRACKED_CHANGES_TYPE__CHANGED_REGION);
		}
		return changedRegion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getTrackChanges() {
		return trackChanges;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrackChanges(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newTrackChanges) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldTrackChanges = trackChanges;
		trackChanges = newTrackChanges == null ? TRACK_CHANGES_EDEFAULT : newTrackChanges;
		boolean oldTrackChangesESet = trackChangesESet;
		trackChangesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.TRACKED_CHANGES_TYPE__TRACK_CHANGES, oldTrackChanges, trackChanges, !oldTrackChangesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTrackChanges() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldTrackChanges = trackChanges;
		boolean oldTrackChangesESet = trackChangesESet;
		trackChanges = TRACK_CHANGES_EDEFAULT;
		trackChangesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TextPackage.TRACKED_CHANGES_TYPE__TRACK_CHANGES, oldTrackChanges, TRACK_CHANGES_EDEFAULT, oldTrackChangesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTrackChanges() {
		return trackChangesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TextPackage.TRACKED_CHANGES_TYPE__CHANGED_REGION:
				return ((InternalEList<?>)getChangedRegion()).basicRemove(otherEnd, msgs);
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
			case TextPackage.TRACKED_CHANGES_TYPE__CHANGED_REGION:
				return getChangedRegion();
			case TextPackage.TRACKED_CHANGES_TYPE__TRACK_CHANGES:
				return getTrackChanges();
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
			case TextPackage.TRACKED_CHANGES_TYPE__CHANGED_REGION:
				getChangedRegion().clear();
				getChangedRegion().addAll((Collection<? extends ChangedRegionType>)newValue);
				return;
			case TextPackage.TRACKED_CHANGES_TYPE__TRACK_CHANGES:
				setTrackChanges((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
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
			case TextPackage.TRACKED_CHANGES_TYPE__CHANGED_REGION:
				getChangedRegion().clear();
				return;
			case TextPackage.TRACKED_CHANGES_TYPE__TRACK_CHANGES:
				unsetTrackChanges();
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
			case TextPackage.TRACKED_CHANGES_TYPE__CHANGED_REGION:
				return changedRegion != null && !changedRegion.isEmpty();
			case TextPackage.TRACKED_CHANGES_TYPE__TRACK_CHANGES:
				return isSetTrackChanges();
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
		result.append(" (trackChanges: ");
		if (trackChangesESet) result.append(trackChanges); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TrackedChangesTypeImpl
