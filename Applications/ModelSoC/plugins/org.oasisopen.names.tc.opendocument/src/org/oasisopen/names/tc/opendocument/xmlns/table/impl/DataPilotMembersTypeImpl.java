/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.table.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotMemberType;
import org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotMembersType;
import org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Pilot Members Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DataPilotMembersTypeImpl#getDataPilotMember <em>Data Pilot Member</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DataPilotMembersTypeImpl extends EObjectImpl implements DataPilotMembersType {
	/**
	 * The cached value of the '{@link #getDataPilotMember() <em>Data Pilot Member</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataPilotMember()
	 * @generated
	 * @ordered
	 */
	protected EList<DataPilotMemberType> dataPilotMember;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataPilotMembersTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TablePackage.eINSTANCE.getDataPilotMembersType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataPilotMemberType> getDataPilotMember() {
		if (dataPilotMember == null) {
			dataPilotMember = new EObjectContainmentEList<DataPilotMemberType>(DataPilotMemberType.class, this, TablePackage.DATA_PILOT_MEMBERS_TYPE__DATA_PILOT_MEMBER);
		}
		return dataPilotMember;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TablePackage.DATA_PILOT_MEMBERS_TYPE__DATA_PILOT_MEMBER:
				return ((InternalEList<?>)getDataPilotMember()).basicRemove(otherEnd, msgs);
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
			case TablePackage.DATA_PILOT_MEMBERS_TYPE__DATA_PILOT_MEMBER:
				return getDataPilotMember();
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
			case TablePackage.DATA_PILOT_MEMBERS_TYPE__DATA_PILOT_MEMBER:
				getDataPilotMember().clear();
				getDataPilotMember().addAll((Collection<? extends DataPilotMemberType>)newValue);
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
			case TablePackage.DATA_PILOT_MEMBERS_TYPE__DATA_PILOT_MEMBER:
				getDataPilotMember().clear();
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
			case TablePackage.DATA_PILOT_MEMBERS_TYPE__DATA_PILOT_MEMBER:
				return dataPilotMember != null && !dataPilotMember.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DataPilotMembersTypeImpl
