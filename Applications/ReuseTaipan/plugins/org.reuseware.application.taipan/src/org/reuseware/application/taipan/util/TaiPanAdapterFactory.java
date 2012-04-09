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
package org.reuseware.application.taipan.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.reuseware.application.taipan.Aquatory;
import org.reuseware.application.taipan.AquatoryType;
import org.reuseware.application.taipan.BesiegePortOrder;
import org.reuseware.application.taipan.BesiegePortOrderType;
import org.reuseware.application.taipan.Building;
import org.reuseware.application.taipan.BuildingType;
import org.reuseware.application.taipan.Destination;
import org.reuseware.application.taipan.DestinationType;
import org.reuseware.application.taipan.EmptyBox;
import org.reuseware.application.taipan.EmptyBoxType;
import org.reuseware.application.taipan.EscortShipsOrder;
import org.reuseware.application.taipan.EscortShipsOrderType;
import org.reuseware.application.taipan.Item;
import org.reuseware.application.taipan.ItemType;
import org.reuseware.application.taipan.LargeItem;
import org.reuseware.application.taipan.LargeItemHook;
import org.reuseware.application.taipan.LargeItemPrototype;
import org.reuseware.application.taipan.LargeItemType;
import org.reuseware.application.taipan.Order;
import org.reuseware.application.taipan.OrderType;
import org.reuseware.application.taipan.Port;
import org.reuseware.application.taipan.PortAnchor;
import org.reuseware.application.taipan.PortSlot;
import org.reuseware.application.taipan.PortType;
import org.reuseware.application.taipan.Route;
import org.reuseware.application.taipan.RouteAnchor;
import org.reuseware.application.taipan.RouteSlot;
import org.reuseware.application.taipan.RouteType;
import org.reuseware.application.taipan.Ship;
import org.reuseware.application.taipan.ShipHook;
import org.reuseware.application.taipan.ShipPrototype;
import org.reuseware.application.taipan.ShipType;
import org.reuseware.application.taipan.SmallItems;
import org.reuseware.application.taipan.SmallItemsType;
import org.reuseware.application.taipan.TaiPanPackage;
import org.reuseware.application.taipan.Warship;
import org.reuseware.application.taipan.WarshipType;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.reuseware.application.taipan.TaiPanPackage
 * @generated
 */
public class TaiPanAdapterFactory extends AdapterFactoryImpl {

	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TaiPanPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaiPanAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = TaiPanPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaiPanSwitch<Adapter> modelSwitch = new TaiPanSwitch<Adapter>() {
		@Override
		public Adapter caseAquatory(Aquatory object) {
			return createAquatoryAdapter();
		}

		@Override
		public Adapter caseDestination(Destination object) {
			return createDestinationAdapter();
		}

		@Override
		public Adapter casePort(Port object) {
			return createPortAdapter();
		}

		@Override
		public Adapter caseBuilding(Building object) {
			return createBuildingAdapter();
		}

		@Override
		public Adapter caseRoute(Route object) {
			return createRouteAdapter();
		}

		@Override
		public Adapter caseShip(Ship object) {
			return createShipAdapter();
		}

		@Override
		public Adapter caseItem(Item object) {
			return createItemAdapter();
		}

		@Override
		public Adapter caseLargeItem(LargeItem object) {
			return createLargeItemAdapter();
		}

		@Override
		public Adapter caseSmallItems(SmallItems object) {
			return createSmallItemsAdapter();
		}

		@Override
		public Adapter caseEmptyBox(EmptyBox object) {
			return createEmptyBoxAdapter();
		}

		@Override
		public Adapter caseWarship(Warship object) {
			return createWarshipAdapter();
		}

		@Override
		public Adapter caseOrder(Order object) {
			return createOrderAdapter();
		}

		@Override
		public Adapter caseEscortShipsOrder(EscortShipsOrder object) {
			return createEscortShipsOrderAdapter();
		}

		@Override
		public Adapter caseBesiegePortOrder(BesiegePortOrder object) {
			return createBesiegePortOrderAdapter();
		}

		@Override
		public Adapter casePortType(PortType object) {
			return createPortTypeAdapter();
		}

		@Override
		public Adapter caseAquatoryType(AquatoryType object) {
			return createAquatoryTypeAdapter();
		}

		@Override
		public Adapter caseLargeItemType(LargeItemType object) {
			return createLargeItemTypeAdapter();
		}

		@Override
		public Adapter caseEscortShipsOrderType(EscortShipsOrderType object) {
			return createEscortShipsOrderTypeAdapter();
		}

		@Override
		public Adapter caseItemType(ItemType object) {
			return createItemTypeAdapter();
		}

		@Override
		public Adapter caseBesiegePortOrderType(BesiegePortOrderType object) {
			return createBesiegePortOrderTypeAdapter();
		}

		@Override
		public Adapter caseSmallItemsType(SmallItemsType object) {
			return createSmallItemsTypeAdapter();
		}

		@Override
		public Adapter caseDestinationType(DestinationType object) {
			return createDestinationTypeAdapter();
		}

		@Override
		public Adapter caseEmptyBoxType(EmptyBoxType object) {
			return createEmptyBoxTypeAdapter();
		}

		@Override
		public Adapter caseWarshipType(WarshipType object) {
			return createWarshipTypeAdapter();
		}

		@Override
		public Adapter caseOrderType(OrderType object) {
			return createOrderTypeAdapter();
		}

		@Override
		public Adapter caseRouteType(RouteType object) {
			return createRouteTypeAdapter();
		}

		@Override
		public Adapter caseShipType(ShipType object) {
			return createShipTypeAdapter();
		}

		@Override
		public Adapter caseBuildingType(BuildingType object) {
			return createBuildingTypeAdapter();
		}

		@Override
		public Adapter caseLargeItemHook(LargeItemHook object) {
			return createLargeItemHookAdapter();
		}

		@Override
		public Adapter caseLargeItemPrototype(LargeItemPrototype object) {
			return createLargeItemPrototypeAdapter();
		}

		@Override
		public Adapter caseShipPrototype(ShipPrototype object) {
			return createShipPrototypeAdapter();
		}

		@Override
		public Adapter caseShipHook(ShipHook object) {
			return createShipHookAdapter();
		}

		@Override
		public Adapter casePortSlot(PortSlot object) {
			return createPortSlotAdapter();
		}

		@Override
		public Adapter caseRouteSlot(RouteSlot object) {
			return createRouteSlotAdapter();
		}

		@Override
		public Adapter casePortAnchor(PortAnchor object) {
			return createPortAnchorAdapter();
		}

		@Override
		public Adapter caseRouteAnchor(RouteAnchor object) {
			return createRouteAnchorAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.reuseware.application.taipan.Aquatory <em>Aquatory</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.reuseware.application.taipan.Aquatory
	 * @generated
	 */
	public Adapter createAquatoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.reuseware.application.taipan.Destination <em>Destination</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.reuseware.application.taipan.Destination
	 * @generated
	 */
	public Adapter createDestinationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.reuseware.application.taipan.Port <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.reuseware.application.taipan.Port
	 * @generated
	 */
	public Adapter createPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.reuseware.application.taipan.Ship <em>Ship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.reuseware.application.taipan.Ship
	 * @generated
	 */
	public Adapter createShipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.reuseware.application.taipan.Item <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.reuseware.application.taipan.Item
	 * @generated
	 */
	public Adapter createItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.reuseware.application.taipan.LargeItem <em>Large Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.reuseware.application.taipan.LargeItem
	 * @generated
	 */
	public Adapter createLargeItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.reuseware.application.taipan.SmallItems <em>Small Items</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.reuseware.application.taipan.SmallItems
	 * @generated
	 */
	public Adapter createSmallItemsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.reuseware.application.taipan.EmptyBox <em>Empty Box</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.reuseware.application.taipan.EmptyBox
	 * @generated
	 */
	public Adapter createEmptyBoxAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.reuseware.application.taipan.Warship <em>Warship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.reuseware.application.taipan.Warship
	 * @generated
	 */
	public Adapter createWarshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.reuseware.application.taipan.Order <em>Order</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.reuseware.application.taipan.Order
	 * @generated
	 */
	public Adapter createOrderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.reuseware.application.taipan.EscortShipsOrder <em>Escort Ships Order</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.reuseware.application.taipan.EscortShipsOrder
	 * @generated
	 */
	public Adapter createEscortShipsOrderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.reuseware.application.taipan.BesiegePortOrder <em>Besiege Port Order</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.reuseware.application.taipan.BesiegePortOrder
	 * @generated
	 */
	public Adapter createBesiegePortOrderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.reuseware.application.taipan.EscortShipsOrderType <em>Escort Ships Order Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.reuseware.application.taipan.EscortShipsOrderType
	 * @generated
	 */
	public Adapter createEscortShipsOrderTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.reuseware.application.taipan.AquatoryType <em>Aquatory Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.reuseware.application.taipan.AquatoryType
	 * @generated
	 */
	public Adapter createAquatoryTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.reuseware.application.taipan.DestinationType <em>Destination Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.reuseware.application.taipan.DestinationType
	 * @generated
	 */
	public Adapter createDestinationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.reuseware.application.taipan.RouteType <em>Route Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.reuseware.application.taipan.RouteType
	 * @generated
	 */
	public Adapter createRouteTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.reuseware.application.taipan.WarshipType <em>Warship Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.reuseware.application.taipan.WarshipType
	 * @generated
	 */
	public Adapter createWarshipTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.reuseware.application.taipan.LargeItemType <em>Large Item Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.reuseware.application.taipan.LargeItemType
	 * @generated
	 */
	public Adapter createLargeItemTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.reuseware.application.taipan.BuildingType <em>Building Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.reuseware.application.taipan.BuildingType
	 * @generated
	 */
	public Adapter createBuildingTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.reuseware.application.taipan.PortType <em>Port Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.reuseware.application.taipan.PortType
	 * @generated
	 */
	public Adapter createPortTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.reuseware.application.taipan.ItemType <em>Item Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.reuseware.application.taipan.ItemType
	 * @generated
	 */
	public Adapter createItemTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.reuseware.application.taipan.ShipType <em>Ship Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.reuseware.application.taipan.ShipType
	 * @generated
	 */
	public Adapter createShipTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.reuseware.application.taipan.OrderType <em>Order Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.reuseware.application.taipan.OrderType
	 * @generated
	 */
	public Adapter createOrderTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.reuseware.application.taipan.BesiegePortOrderType <em>Besiege Port Order Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.reuseware.application.taipan.BesiegePortOrderType
	 * @generated
	 */
	public Adapter createBesiegePortOrderTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.reuseware.application.taipan.EmptyBoxType <em>Empty Box Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.reuseware.application.taipan.EmptyBoxType
	 * @generated
	 */
	public Adapter createEmptyBoxTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.reuseware.application.taipan.SmallItemsType <em>Small Items Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.reuseware.application.taipan.SmallItemsType
	 * @generated
	 */
	public Adapter createSmallItemsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.reuseware.application.taipan.LargeItemHook <em>Large Item Hook</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.reuseware.application.taipan.LargeItemHook
	 * @generated
	 */
	public Adapter createLargeItemHookAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.reuseware.application.taipan.LargeItemPrototype <em>Large Item Prototype</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.reuseware.application.taipan.LargeItemPrototype
	 * @generated
	 */
	public Adapter createLargeItemPrototypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.reuseware.application.taipan.ShipPrototype <em>Ship Prototype</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.reuseware.application.taipan.ShipPrototype
	 * @generated
	 */
	public Adapter createShipPrototypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.reuseware.application.taipan.ShipHook <em>Ship Hook</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.reuseware.application.taipan.ShipHook
	 * @generated
	 */
	public Adapter createShipHookAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.reuseware.application.taipan.PortSlot <em>Port Slot</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.reuseware.application.taipan.PortSlot
	 * @generated
	 */
	public Adapter createPortSlotAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.reuseware.application.taipan.RouteSlot <em>Route Slot</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.reuseware.application.taipan.RouteSlot
	 * @generated
	 */
	public Adapter createRouteSlotAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.reuseware.application.taipan.PortAnchor <em>Port Anchor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.reuseware.application.taipan.PortAnchor
	 * @generated
	 */
	public Adapter createPortAnchorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.reuseware.application.taipan.RouteAnchor <em>Route Anchor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.reuseware.application.taipan.RouteAnchor
	 * @generated
	 */
	public Adapter createRouteAnchorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.reuseware.application.taipan.Route <em>Route</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.reuseware.application.taipan.Route
	 * @generated
	 */
	public Adapter createRouteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.reuseware.application.taipan.Building <em>Building</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.reuseware.application.taipan.Building
	 * @generated
	 */
	public Adapter createBuildingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //TaiPanAdapterFactory
