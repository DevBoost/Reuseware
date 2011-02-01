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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.reuseware.application.taipan.Aquatory;
import org.reuseware.application.taipan.ItemType;
import org.reuseware.application.taipan.PortType;
import org.reuseware.application.taipan.RouteType;
import org.reuseware.application.taipan.Ship;
import org.reuseware.application.taipan.TaiPanPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ship</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.reuseware.application.taipan.impl.ShipImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.reuseware.application.taipan.impl.ShipImpl#getDestination <em>Destination</em>}</li>
 *   <li>{@link org.reuseware.application.taipan.impl.ShipImpl#getRoute <em>Route</em>}</li>
 *   <li>{@link org.reuseware.application.taipan.impl.ShipImpl#getCargo <em>Cargo</em>}</li>
 *   <li>{@link org.reuseware.application.taipan.impl.ShipImpl#getAquatory <em>Aquatory</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ShipImpl extends EObjectImpl implements Ship {

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDestination() <em>Destination</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestination()
	 * @generated
	 * @ordered
	 */
	protected PortType destination;

	/**
	 * The cached value of the '{@link #getRoute() <em>Route</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoute()
	 * @generated
	 * @ordered
	 */
	protected RouteType route;

	/**
	 * The cached value of the '{@link #getCargo() <em>Cargo</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCargo()
	 * @generated
	 * @ordered
	 */
	protected EList<ItemType> cargo;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ShipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TaiPanPackage.Literals.SHIP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TaiPanPackage.SHIP__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortType getDestination() {
		if (destination != null && destination.eIsProxy()) {
			InternalEObject oldDestination = (InternalEObject) destination;
			destination = (PortType) eResolveProxy(oldDestination);
			if (destination != oldDestination) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							TaiPanPackage.SHIP__DESTINATION, oldDestination,
							destination));
			}
		}
		return destination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortType basicGetDestination() {
		return destination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDestination(PortType newDestination) {
		PortType oldDestination = destination;
		destination = newDestination;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TaiPanPackage.SHIP__DESTINATION, oldDestination,
					destination));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RouteType getRoute() {
		if (route != null && route.eIsProxy()) {
			InternalEObject oldRoute = (InternalEObject) route;
			route = (RouteType) eResolveProxy(oldRoute);
			if (route != oldRoute) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							TaiPanPackage.SHIP__ROUTE, oldRoute, route));
			}
		}
		return route;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RouteType basicGetRoute() {
		return route;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoute(RouteType newRoute) {
		RouteType oldRoute = route;
		route = newRoute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TaiPanPackage.SHIP__ROUTE, oldRoute, route));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ItemType> getCargo() {
		if (cargo == null) {
			cargo = new EObjectContainmentEList<ItemType>(ItemType.class, this,
					TaiPanPackage.SHIP__CARGO);
		}
		return cargo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Aquatory getAquatory() {
		if (eContainerFeatureID() != TaiPanPackage.SHIP__AQUATORY)
			return null;
		return (Aquatory) eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAquatory(Aquatory newAquatory,
			NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newAquatory,
				TaiPanPackage.SHIP__AQUATORY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAquatory(Aquatory newAquatory) {
		if (newAquatory != eInternalContainer()
				|| (eContainerFeatureID() != TaiPanPackage.SHIP__AQUATORY && newAquatory != null)) {
			if (EcoreUtil.isAncestor(this, newAquatory))
				throw new IllegalArgumentException(
						"Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newAquatory != null)
				msgs = ((InternalEObject) newAquatory).eInverseAdd(this,
						TaiPanPackage.AQUATORY__SHIPS, Aquatory.class, msgs);
			msgs = basicSetAquatory(newAquatory, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TaiPanPackage.SHIP__AQUATORY, newAquatory, newAquatory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case TaiPanPackage.SHIP__AQUATORY:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetAquatory((Aquatory) otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
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
		case TaiPanPackage.SHIP__CARGO:
			return ((InternalEList<?>) getCargo()).basicRemove(otherEnd, msgs);
		case TaiPanPackage.SHIP__AQUATORY:
			return basicSetAquatory(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(
			NotificationChain msgs) {
		switch (eContainerFeatureID()) {
		case TaiPanPackage.SHIP__AQUATORY:
			return eInternalContainer().eInverseRemove(this,
					TaiPanPackage.AQUATORY__SHIPS, Aquatory.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case TaiPanPackage.SHIP__NAME:
			return getName();
		case TaiPanPackage.SHIP__DESTINATION:
			if (resolve)
				return getDestination();
			return basicGetDestination();
		case TaiPanPackage.SHIP__ROUTE:
			if (resolve)
				return getRoute();
			return basicGetRoute();
		case TaiPanPackage.SHIP__CARGO:
			return getCargo();
		case TaiPanPackage.SHIP__AQUATORY:
			return getAquatory();
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
		case TaiPanPackage.SHIP__NAME:
			setName((String) newValue);
			return;
		case TaiPanPackage.SHIP__DESTINATION:
			setDestination((PortType) newValue);
			return;
		case TaiPanPackage.SHIP__ROUTE:
			setRoute((RouteType) newValue);
			return;
		case TaiPanPackage.SHIP__CARGO:
			getCargo().clear();
			getCargo().addAll((Collection<? extends ItemType>) newValue);
			return;
		case TaiPanPackage.SHIP__AQUATORY:
			setAquatory((Aquatory) newValue);
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
		case TaiPanPackage.SHIP__NAME:
			setName(NAME_EDEFAULT);
			return;
		case TaiPanPackage.SHIP__DESTINATION:
			setDestination((PortType) null);
			return;
		case TaiPanPackage.SHIP__ROUTE:
			setRoute((RouteType) null);
			return;
		case TaiPanPackage.SHIP__CARGO:
			getCargo().clear();
			return;
		case TaiPanPackage.SHIP__AQUATORY:
			setAquatory((Aquatory) null);
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
		case TaiPanPackage.SHIP__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT
					.equals(name);
		case TaiPanPackage.SHIP__DESTINATION:
			return destination != null;
		case TaiPanPackage.SHIP__ROUTE:
			return route != null;
		case TaiPanPackage.SHIP__CARGO:
			return cargo != null && !cargo.isEmpty();
		case TaiPanPackage.SHIP__AQUATORY:
			return getAquatory() != null;
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
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: "); //$NON-NLS-1$
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ShipImpl
