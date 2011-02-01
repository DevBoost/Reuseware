/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.style.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage;
import org.oasisopen.names.tc.opendocument.xmlns.style.TabStopType;
import org.oasisopen.names.tc.opendocument.xmlns.style.TabStopsType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tab Stops Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.TabStopsTypeImpl#getTabStop <em>Tab Stop</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TabStopsTypeImpl extends EObjectImpl implements TabStopsType {
	/**
	 * The cached value of the '{@link #getTabStop() <em>Tab Stop</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTabStop()
	 * @generated
	 * @ordered
	 */
	protected EList<TabStopType> tabStop;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TabStopsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StylePackage.eINSTANCE.getTabStopsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TabStopType> getTabStop() {
		if (tabStop == null) {
			tabStop = new EObjectContainmentEList<TabStopType>(TabStopType.class, this, StylePackage.TAB_STOPS_TYPE__TAB_STOP);
		}
		return tabStop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StylePackage.TAB_STOPS_TYPE__TAB_STOP:
				return ((InternalEList<?>)getTabStop()).basicRemove(otherEnd, msgs);
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
			case StylePackage.TAB_STOPS_TYPE__TAB_STOP:
				return getTabStop();
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
			case StylePackage.TAB_STOPS_TYPE__TAB_STOP:
				getTabStop().clear();
				getTabStop().addAll((Collection<? extends TabStopType>)newValue);
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
			case StylePackage.TAB_STOPS_TYPE__TAB_STOP:
				getTabStop().clear();
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
			case StylePackage.TAB_STOPS_TYPE__TAB_STOP:
				return tabStop != null && !tabStop.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TabStopsTypeImpl
