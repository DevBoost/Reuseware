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
import org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotSubtotalType;
import org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotSubtotalsType;
import org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Pilot Subtotals Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DataPilotSubtotalsTypeImpl#getDataPilotSubtotal <em>Data Pilot Subtotal</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DataPilotSubtotalsTypeImpl extends EObjectImpl implements DataPilotSubtotalsType {
	/**
	 * The cached value of the '{@link #getDataPilotSubtotal() <em>Data Pilot Subtotal</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataPilotSubtotal()
	 * @generated
	 * @ordered
	 */
	protected EList<DataPilotSubtotalType> dataPilotSubtotal;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataPilotSubtotalsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TablePackage.eINSTANCE.getDataPilotSubtotalsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataPilotSubtotalType> getDataPilotSubtotal() {
		if (dataPilotSubtotal == null) {
			dataPilotSubtotal = new EObjectContainmentEList<DataPilotSubtotalType>(DataPilotSubtotalType.class, this, TablePackage.DATA_PILOT_SUBTOTALS_TYPE__DATA_PILOT_SUBTOTAL);
		}
		return dataPilotSubtotal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TablePackage.DATA_PILOT_SUBTOTALS_TYPE__DATA_PILOT_SUBTOTAL:
				return ((InternalEList<?>)getDataPilotSubtotal()).basicRemove(otherEnd, msgs);
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
			case TablePackage.DATA_PILOT_SUBTOTALS_TYPE__DATA_PILOT_SUBTOTAL:
				return getDataPilotSubtotal();
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
			case TablePackage.DATA_PILOT_SUBTOTALS_TYPE__DATA_PILOT_SUBTOTAL:
				getDataPilotSubtotal().clear();
				getDataPilotSubtotal().addAll((Collection<? extends DataPilotSubtotalType>)newValue);
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
			case TablePackage.DATA_PILOT_SUBTOTALS_TYPE__DATA_PILOT_SUBTOTAL:
				getDataPilotSubtotal().clear();
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
			case TablePackage.DATA_PILOT_SUBTOTALS_TYPE__DATA_PILOT_SUBTOTAL:
				return dataPilotSubtotal != null && !dataPilotSubtotal.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DataPilotSubtotalsTypeImpl
