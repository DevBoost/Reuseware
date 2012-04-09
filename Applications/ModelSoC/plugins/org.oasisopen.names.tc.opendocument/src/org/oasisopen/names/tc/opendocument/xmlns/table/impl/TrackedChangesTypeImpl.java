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
package org.oasisopen.names.tc.opendocument.xmlns.table.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;
import org.oasisopen.names.tc.opendocument.xmlns.table.CellContentChangeType;
import org.oasisopen.names.tc.opendocument.xmlns.table.DeletionType;
import org.oasisopen.names.tc.opendocument.xmlns.table.InsertionType;
import org.oasisopen.names.tc.opendocument.xmlns.table.MovementType;
import org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage;
import org.oasisopen.names.tc.opendocument.xmlns.table.TrackedChangesType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tracked Changes Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.TrackedChangesTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.TrackedChangesTypeImpl#getCellContentChange <em>Cell Content Change</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.TrackedChangesTypeImpl#getInsertion <em>Insertion</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.TrackedChangesTypeImpl#getDeletion <em>Deletion</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.TrackedChangesTypeImpl#getMovement <em>Movement</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.TrackedChangesTypeImpl#getTrackChanges <em>Track Changes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TrackedChangesTypeImpl extends EObjectImpl implements TrackedChangesType {
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
	 * The default value of the '{@link #getTrackChanges() <em>Track Changes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrackChanges()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean TRACK_CHANGES_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.FALSE;

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
		return TablePackage.eINSTANCE.getTrackedChangesType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, TablePackage.TRACKED_CHANGES_TYPE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CellContentChangeType> getCellContentChange() {
		return getGroup().list(TablePackage.eINSTANCE.getTrackedChangesType_CellContentChange());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InsertionType> getInsertion() {
		return getGroup().list(TablePackage.eINSTANCE.getTrackedChangesType_Insertion());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DeletionType> getDeletion() {
		return getGroup().list(TablePackage.eINSTANCE.getTrackedChangesType_Deletion());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MovementType> getMovement() {
		return getGroup().list(TablePackage.eINSTANCE.getTrackedChangesType_Movement());
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
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.TRACKED_CHANGES_TYPE__TRACK_CHANGES, oldTrackChanges, trackChanges, !oldTrackChangesESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, TablePackage.TRACKED_CHANGES_TYPE__TRACK_CHANGES, oldTrackChanges, TRACK_CHANGES_EDEFAULT, oldTrackChangesESet));
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
			case TablePackage.TRACKED_CHANGES_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case TablePackage.TRACKED_CHANGES_TYPE__CELL_CONTENT_CHANGE:
				return ((InternalEList<?>)getCellContentChange()).basicRemove(otherEnd, msgs);
			case TablePackage.TRACKED_CHANGES_TYPE__INSERTION:
				return ((InternalEList<?>)getInsertion()).basicRemove(otherEnd, msgs);
			case TablePackage.TRACKED_CHANGES_TYPE__DELETION:
				return ((InternalEList<?>)getDeletion()).basicRemove(otherEnd, msgs);
			case TablePackage.TRACKED_CHANGES_TYPE__MOVEMENT:
				return ((InternalEList<?>)getMovement()).basicRemove(otherEnd, msgs);
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
			case TablePackage.TRACKED_CHANGES_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case TablePackage.TRACKED_CHANGES_TYPE__CELL_CONTENT_CHANGE:
				return getCellContentChange();
			case TablePackage.TRACKED_CHANGES_TYPE__INSERTION:
				return getInsertion();
			case TablePackage.TRACKED_CHANGES_TYPE__DELETION:
				return getDeletion();
			case TablePackage.TRACKED_CHANGES_TYPE__MOVEMENT:
				return getMovement();
			case TablePackage.TRACKED_CHANGES_TYPE__TRACK_CHANGES:
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
			case TablePackage.TRACKED_CHANGES_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case TablePackage.TRACKED_CHANGES_TYPE__CELL_CONTENT_CHANGE:
				getCellContentChange().clear();
				getCellContentChange().addAll((Collection<? extends CellContentChangeType>)newValue);
				return;
			case TablePackage.TRACKED_CHANGES_TYPE__INSERTION:
				getInsertion().clear();
				getInsertion().addAll((Collection<? extends InsertionType>)newValue);
				return;
			case TablePackage.TRACKED_CHANGES_TYPE__DELETION:
				getDeletion().clear();
				getDeletion().addAll((Collection<? extends DeletionType>)newValue);
				return;
			case TablePackage.TRACKED_CHANGES_TYPE__MOVEMENT:
				getMovement().clear();
				getMovement().addAll((Collection<? extends MovementType>)newValue);
				return;
			case TablePackage.TRACKED_CHANGES_TYPE__TRACK_CHANGES:
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
			case TablePackage.TRACKED_CHANGES_TYPE__GROUP:
				getGroup().clear();
				return;
			case TablePackage.TRACKED_CHANGES_TYPE__CELL_CONTENT_CHANGE:
				getCellContentChange().clear();
				return;
			case TablePackage.TRACKED_CHANGES_TYPE__INSERTION:
				getInsertion().clear();
				return;
			case TablePackage.TRACKED_CHANGES_TYPE__DELETION:
				getDeletion().clear();
				return;
			case TablePackage.TRACKED_CHANGES_TYPE__MOVEMENT:
				getMovement().clear();
				return;
			case TablePackage.TRACKED_CHANGES_TYPE__TRACK_CHANGES:
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
			case TablePackage.TRACKED_CHANGES_TYPE__GROUP:
				return group != null && !group.isEmpty();
			case TablePackage.TRACKED_CHANGES_TYPE__CELL_CONTENT_CHANGE:
				return !getCellContentChange().isEmpty();
			case TablePackage.TRACKED_CHANGES_TYPE__INSERTION:
				return !getInsertion().isEmpty();
			case TablePackage.TRACKED_CHANGES_TYPE__DELETION:
				return !getDeletion().isEmpty();
			case TablePackage.TRACKED_CHANGES_TYPE__MOVEMENT:
				return !getMovement().isEmpty();
			case TablePackage.TRACKED_CHANGES_TYPE__TRACK_CHANGES:
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
		result.append(" (group: ");
		result.append(group);
		result.append(", trackChanges: ");
		if (trackChangesESet) result.append(trackChanges); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TrackedChangesTypeImpl
