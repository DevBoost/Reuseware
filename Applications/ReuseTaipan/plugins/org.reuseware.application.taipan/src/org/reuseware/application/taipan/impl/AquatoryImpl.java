/*
 * Copyright (c) 2005 Borland Software Corporation
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Dmitri Stadnik (Borland) - initial API and implementation
 */
package org.reuseware.application.taipan.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.reuseware.application.taipan.Aquatory;
import org.reuseware.application.taipan.PortType;
import org.reuseware.application.taipan.RouteType;
import org.reuseware.application.taipan.Ship;
import org.reuseware.application.taipan.TaiPanPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Aquatory</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.reuseware.application.taipan.impl.AquatoryImpl#getPorts <em>Ports</em>}</li>
 *   <li>{@link org.reuseware.application.taipan.impl.AquatoryImpl#getRoutes <em>Routes</em>}</li>
 *   <li>{@link org.reuseware.application.taipan.impl.AquatoryImpl#getShips <em>Ships</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AquatoryImpl extends EObjectImpl implements Aquatory {

	/**
	 * The cached value of the '{@link #getPorts() <em>Ports</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPorts()
	 * @generated
	 * @ordered
	 */
	protected EList<PortType> ports;

	/**
	 * The cached value of the '{@link #getRoutes() <em>Routes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoutes()
	 * @generated
	 * @ordered
	 */
	protected EList<RouteType> routes;

	/**
	 * The cached value of the '{@link #getShips() <em>Ships</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShips()
	 * @generated
	 * @ordered
	 */
	protected EList<Ship> ships;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AquatoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TaiPanPackage.Literals.AQUATORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PortType> getPorts() {
		if (ports == null) {
			ports = new EObjectContainmentEList<PortType>(PortType.class, this,
					TaiPanPackage.AQUATORY__PORTS);
		}
		return ports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Ship> getShips() {
		if (ships == null) {
			ships = new EObjectContainmentWithInverseEList<Ship>(Ship.class,
					this, TaiPanPackage.AQUATORY__SHIPS,
					TaiPanPackage.SHIP__AQUATORY);
		}
		return ships;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case TaiPanPackage.AQUATORY__SHIPS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getShips())
					.basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RouteType> getRoutes() {
		if (routes == null) {
			routes = new EObjectContainmentEList<RouteType>(RouteType.class,
					this, TaiPanPackage.AQUATORY__ROUTES);
		}
		return routes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case TaiPanPackage.AQUATORY__PORTS:
			return ((InternalEList<?>) getPorts()).basicRemove(otherEnd, msgs);
		case TaiPanPackage.AQUATORY__ROUTES:
			return ((InternalEList<?>) getRoutes()).basicRemove(otherEnd, msgs);
		case TaiPanPackage.AQUATORY__SHIPS:
			return ((InternalEList<?>) getShips()).basicRemove(otherEnd, msgs);
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
		case TaiPanPackage.AQUATORY__PORTS:
			return getPorts();
		case TaiPanPackage.AQUATORY__ROUTES:
			return getRoutes();
		case TaiPanPackage.AQUATORY__SHIPS:
			return getShips();
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
		case TaiPanPackage.AQUATORY__PORTS:
			getPorts().clear();
			getPorts().addAll((Collection<? extends PortType>) newValue);
			return;
		case TaiPanPackage.AQUATORY__ROUTES:
			getRoutes().clear();
			getRoutes().addAll((Collection<? extends RouteType>) newValue);
			return;
		case TaiPanPackage.AQUATORY__SHIPS:
			getShips().clear();
			getShips().addAll((Collection<? extends Ship>) newValue);
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
		case TaiPanPackage.AQUATORY__PORTS:
			getPorts().clear();
			return;
		case TaiPanPackage.AQUATORY__ROUTES:
			getRoutes().clear();
			return;
		case TaiPanPackage.AQUATORY__SHIPS:
			getShips().clear();
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
		case TaiPanPackage.AQUATORY__PORTS:
			return ports != null && !ports.isEmpty();
		case TaiPanPackage.AQUATORY__ROUTES:
			return routes != null && !routes.isEmpty();
		case TaiPanPackage.AQUATORY__SHIPS:
			return ships != null && !ships.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AquatoryImpl
