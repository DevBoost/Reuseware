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
package org.reuseware.application.taipan;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.reuseware.application.taipan.TaiPanPackage
 * @generated
 */
public interface TaiPanFactory extends EFactory {

	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TaiPanFactory eINSTANCE = org.reuseware.application.taipan.impl.TaiPanFactoryImpl
			.init();

	/**
	 * Returns a new object of class '<em>Aquatory</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Aquatory</em>'.
	 * @generated
	 */
	Aquatory createAquatory();

	/**
	 * Returns a new object of class '<em>Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Port</em>'.
	 * @generated
	 */
	Port createPort();

	/**
	 * Returns a new object of class '<em>Ship</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ship</em>'.
	 * @generated
	 */
	Ship createShip();

	/**
	 * Returns a new object of class '<em>Large Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Large Item</em>'.
	 * @generated
	 */
	LargeItem createLargeItem();

	/**
	 * Returns a new object of class '<em>Small Items</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Small Items</em>'.
	 * @generated
	 */
	SmallItems createSmallItems();

	/**
	 * Returns a new object of class '<em>Empty Box</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Empty Box</em>'.
	 * @generated
	 */
	EmptyBox createEmptyBox();

	/**
	 * Returns a new object of class '<em>Warship</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Warship</em>'.
	 * @generated
	 */
	Warship createWarship();

	/**
	 * Returns a new object of class '<em>Escort Ships Order</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Escort Ships Order</em>'.
	 * @generated
	 */
	EscortShipsOrder createEscortShipsOrder();

	/**
	 * Returns a new object of class '<em>Besiege Port Order</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Besiege Port Order</em>'.
	 * @generated
	 */
	BesiegePortOrder createBesiegePortOrder();

	/**
	 * Returns a new object of class '<em>Large Item Hook</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Large Item Hook</em>'.
	 * @generated
	 */
	LargeItemHook createLargeItemHook();

	/**
	 * Returns a new object of class '<em>Large Item Prototype</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Large Item Prototype</em>'.
	 * @generated
	 */
	LargeItemPrototype createLargeItemPrototype();

	/**
	 * Returns a new object of class '<em>Ship Prototype</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ship Prototype</em>'.
	 * @generated
	 */
	ShipPrototype createShipPrototype();

	/**
	 * Returns a new object of class '<em>Ship Hook</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ship Hook</em>'.
	 * @generated
	 */
	ShipHook createShipHook();

	/**
	 * Returns a new object of class '<em>Port Slot</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Port Slot</em>'.
	 * @generated
	 */
	PortSlot createPortSlot();

	/**
	 * Returns a new object of class '<em>Route Slot</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Route Slot</em>'.
	 * @generated
	 */
	RouteSlot createRouteSlot();

	/**
	 * Returns a new object of class '<em>Port Anchor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Port Anchor</em>'.
	 * @generated
	 */
	PortAnchor createPortAnchor();

	/**
	 * Returns a new object of class '<em>Route Anchor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Route Anchor</em>'.
	 * @generated
	 */
	RouteAnchor createRouteAnchor();

	/**
	 * Returns a new object of class '<em>Route</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Route</em>'.
	 * @generated
	 */
	Route createRoute();

	/**
	 * Returns a new object of class '<em>Building</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Building</em>'.
	 * @generated
	 */
	Building createBuilding();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TaiPanPackage getTaiPanPackage();

} //TaiPanFactory
