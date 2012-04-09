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

import java.util.List;

import org.eclipse.emf.ecore.EClass;
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
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.reuseware.application.taipan.TaiPanPackage
 * @generated
 */
public class TaiPanSwitch<T> {

	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TaiPanPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaiPanSwitch() {
		if (modelPackage == null) {
			modelPackage = TaiPanPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public T doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		} else {
			List<EClass> eSuperTypes = theEClass.getESuperTypes();
			return eSuperTypes.isEmpty() ? defaultCase(theEObject) : doSwitch(
					eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case TaiPanPackage.AQUATORY: {
			Aquatory aquatory = (Aquatory) theEObject;
			T result = caseAquatory(aquatory);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TaiPanPackage.DESTINATION: {
			Destination destination = (Destination) theEObject;
			T result = caseDestination(destination);
			if (result == null)
				result = caseDestinationType(destination);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TaiPanPackage.PORT: {
			Port port = (Port) theEObject;
			T result = casePort(port);
			if (result == null)
				result = caseDestination(port);
			if (result == null)
				result = casePortType(port);
			if (result == null)
				result = caseDestinationType(port);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TaiPanPackage.BUILDING: {
			Building building = (Building) theEObject;
			T result = caseBuilding(building);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TaiPanPackage.ROUTE: {
			Route route = (Route) theEObject;
			T result = caseRoute(route);
			if (result == null)
				result = caseDestination(route);
			if (result == null)
				result = caseRouteType(route);
			if (result == null)
				result = caseDestinationType(route);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TaiPanPackage.SHIP: {
			Ship ship = (Ship) theEObject;
			T result = caseShip(ship);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TaiPanPackage.ITEM: {
			Item item = (Item) theEObject;
			T result = caseItem(item);
			if (result == null)
				result = caseItemType(item);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TaiPanPackage.LARGE_ITEM: {
			LargeItem largeItem = (LargeItem) theEObject;
			T result = caseLargeItem(largeItem);
			if (result == null)
				result = caseItem(largeItem);
			if (result == null)
				result = caseItemType(largeItem);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TaiPanPackage.SMALL_ITEMS: {
			SmallItems smallItems = (SmallItems) theEObject;
			T result = caseSmallItems(smallItems);
			if (result == null)
				result = caseItem(smallItems);
			if (result == null)
				result = caseItemType(smallItems);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TaiPanPackage.EMPTY_BOX: {
			EmptyBox emptyBox = (EmptyBox) theEObject;
			T result = caseEmptyBox(emptyBox);
			if (result == null)
				result = caseItem(emptyBox);
			if (result == null)
				result = caseItemType(emptyBox);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TaiPanPackage.WARSHIP: {
			Warship warship = (Warship) theEObject;
			T result = caseWarship(warship);
			if (result == null)
				result = caseShip(warship);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TaiPanPackage.ORDER: {
			Order order = (Order) theEObject;
			T result = caseOrder(order);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TaiPanPackage.ESCORT_SHIPS_ORDER: {
			EscortShipsOrder escortShipsOrder = (EscortShipsOrder) theEObject;
			T result = caseEscortShipsOrder(escortShipsOrder);
			if (result == null)
				result = caseOrder(escortShipsOrder);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TaiPanPackage.BESIEGE_PORT_ORDER: {
			BesiegePortOrder besiegePortOrder = (BesiegePortOrder) theEObject;
			T result = caseBesiegePortOrder(besiegePortOrder);
			if (result == null)
				result = caseOrder(besiegePortOrder);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TaiPanPackage.PORT_TYPE: {
			PortType portType = (PortType) theEObject;
			T result = casePortType(portType);
			if (result == null)
				result = caseDestinationType(portType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TaiPanPackage.AQUATORY_TYPE: {
			AquatoryType aquatoryType = (AquatoryType) theEObject;
			T result = caseAquatoryType(aquatoryType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TaiPanPackage.LARGE_ITEM_TYPE: {
			LargeItemType largeItemType = (LargeItemType) theEObject;
			T result = caseLargeItemType(largeItemType);
			if (result == null)
				result = caseItemType(largeItemType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TaiPanPackage.ESCORT_SHIPS_ORDER_TYPE: {
			EscortShipsOrderType escortShipsOrderType = (EscortShipsOrderType) theEObject;
			T result = caseEscortShipsOrderType(escortShipsOrderType);
			if (result == null)
				result = caseOrderType(escortShipsOrderType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TaiPanPackage.ITEM_TYPE: {
			ItemType itemType = (ItemType) theEObject;
			T result = caseItemType(itemType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TaiPanPackage.BESIEGE_PORT_ORDER_TYPE: {
			BesiegePortOrderType besiegePortOrderType = (BesiegePortOrderType) theEObject;
			T result = caseBesiegePortOrderType(besiegePortOrderType);
			if (result == null)
				result = caseOrderType(besiegePortOrderType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TaiPanPackage.SMALL_ITEMS_TYPE: {
			SmallItemsType smallItemsType = (SmallItemsType) theEObject;
			T result = caseSmallItemsType(smallItemsType);
			if (result == null)
				result = caseItemType(smallItemsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TaiPanPackage.DESTINATION_TYPE: {
			DestinationType destinationType = (DestinationType) theEObject;
			T result = caseDestinationType(destinationType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TaiPanPackage.EMPTY_BOX_TYPE: {
			EmptyBoxType emptyBoxType = (EmptyBoxType) theEObject;
			T result = caseEmptyBoxType(emptyBoxType);
			if (result == null)
				result = caseItemType(emptyBoxType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TaiPanPackage.WARSHIP_TYPE: {
			WarshipType warshipType = (WarshipType) theEObject;
			T result = caseWarshipType(warshipType);
			if (result == null)
				result = caseShipType(warshipType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TaiPanPackage.ORDER_TYPE: {
			OrderType orderType = (OrderType) theEObject;
			T result = caseOrderType(orderType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TaiPanPackage.ROUTE_TYPE: {
			RouteType routeType = (RouteType) theEObject;
			T result = caseRouteType(routeType);
			if (result == null)
				result = caseDestinationType(routeType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TaiPanPackage.SHIP_TYPE: {
			ShipType shipType = (ShipType) theEObject;
			T result = caseShipType(shipType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TaiPanPackage.BUILDING_TYPE: {
			BuildingType buildingType = (BuildingType) theEObject;
			T result = caseBuildingType(buildingType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TaiPanPackage.LARGE_ITEM_HOOK: {
			LargeItemHook largeItemHook = (LargeItemHook) theEObject;
			T result = caseLargeItemHook(largeItemHook);
			if (result == null)
				result = caseLargeItemType(largeItemHook);
			if (result == null)
				result = caseItemType(largeItemHook);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TaiPanPackage.LARGE_ITEM_PROTOTYPE: {
			LargeItemPrototype largeItemPrototype = (LargeItemPrototype) theEObject;
			T result = caseLargeItemPrototype(largeItemPrototype);
			if (result == null)
				result = caseLargeItemType(largeItemPrototype);
			if (result == null)
				result = caseItemType(largeItemPrototype);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TaiPanPackage.SHIP_PROTOTYPE: {
			ShipPrototype shipPrototype = (ShipPrototype) theEObject;
			T result = caseShipPrototype(shipPrototype);
			if (result == null)
				result = caseShipType(shipPrototype);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TaiPanPackage.SHIP_HOOK: {
			ShipHook shipHook = (ShipHook) theEObject;
			T result = caseShipHook(shipHook);
			if (result == null)
				result = caseShipType(shipHook);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TaiPanPackage.PORT_SLOT: {
			PortSlot portSlot = (PortSlot) theEObject;
			T result = casePortSlot(portSlot);
			if (result == null)
				result = casePortType(portSlot);
			if (result == null)
				result = caseDestinationType(portSlot);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TaiPanPackage.ROUTE_SLOT: {
			RouteSlot routeSlot = (RouteSlot) theEObject;
			T result = caseRouteSlot(routeSlot);
			if (result == null)
				result = caseRouteType(routeSlot);
			if (result == null)
				result = caseDestinationType(routeSlot);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TaiPanPackage.PORT_ANCHOR: {
			PortAnchor portAnchor = (PortAnchor) theEObject;
			T result = casePortAnchor(portAnchor);
			if (result == null)
				result = casePortType(portAnchor);
			if (result == null)
				result = caseDestinationType(portAnchor);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TaiPanPackage.ROUTE_ANCHOR: {
			RouteAnchor routeAnchor = (RouteAnchor) theEObject;
			T result = caseRouteAnchor(routeAnchor);
			if (result == null)
				result = caseRouteType(routeAnchor);
			if (result == null)
				result = caseDestinationType(routeAnchor);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Aquatory</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Aquatory</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAquatory(Aquatory object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Destination</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Destination</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDestination(Destination object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePort(Port object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ship</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ship</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseShip(Ship object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseItem(Item object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Large Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Large Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLargeItem(LargeItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Small Items</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Small Items</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSmallItems(SmallItems object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Empty Box</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Empty Box</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEmptyBox(EmptyBox object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Warship</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Warship</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWarship(Warship object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Order</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Order</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrder(Order object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Escort Ships Order</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Escort Ships Order</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEscortShipsOrder(EscortShipsOrder object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Besiege Port Order</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Besiege Port Order</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBesiegePortOrder(BesiegePortOrder object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Escort Ships Order Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Escort Ships Order Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEscortShipsOrderType(EscortShipsOrderType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Aquatory Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Aquatory Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAquatoryType(AquatoryType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Destination Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Destination Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDestinationType(DestinationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Route Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Route Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRouteType(RouteType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Warship Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Warship Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWarshipType(WarshipType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Large Item Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Large Item Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLargeItemType(LargeItemType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Building Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Building Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBuildingType(BuildingType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePortType(PortType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Item Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Item Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseItemType(ItemType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ship Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ship Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseShipType(ShipType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Order Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Order Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrderType(OrderType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Besiege Port Order Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Besiege Port Order Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBesiegePortOrderType(BesiegePortOrderType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Empty Box Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Empty Box Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEmptyBoxType(EmptyBoxType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Small Items Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Small Items Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSmallItemsType(SmallItemsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Large Item Hook</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Large Item Hook</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLargeItemHook(LargeItemHook object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Large Item Prototype</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Large Item Prototype</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLargeItemPrototype(LargeItemPrototype object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ship Prototype</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ship Prototype</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseShipPrototype(ShipPrototype object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ship Hook</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ship Hook</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseShipHook(ShipHook object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port Slot</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port Slot</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePortSlot(PortSlot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Route Slot</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Route Slot</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRouteSlot(RouteSlot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port Anchor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port Anchor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePortAnchor(PortAnchor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Route Anchor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Route Anchor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRouteAnchor(RouteAnchor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Route</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Route</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoute(Route object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Building</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Building</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBuilding(Building object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public T defaultCase(EObject object) {
		return null;
	}

} //TaiPanSwitch
