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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.reuseware.application.taipan.TaiPanFactory
 * @model kind="package"
 * @generated
 */
public interface TaiPanPackage extends EPackage {

	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "taipan"; //$NON-NLS-1$

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.reuseware.org/application/taipan"; //$NON-NLS-1$

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "taipan"; //$NON-NLS-1$

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TaiPanPackage eINSTANCE = org.reuseware.application.taipan.impl.TaiPanPackageImpl
			.init();

	/**
	 * The meta object id for the '{@link org.reuseware.application.taipan.impl.AquatoryImpl <em>Aquatory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.reuseware.application.taipan.impl.AquatoryImpl
	 * @see org.reuseware.application.taipan.impl.TaiPanPackageImpl#getAquatory()
	 * @generated
	 */
	int AQUATORY = 0;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AQUATORY__PORTS = 0;

	/**
	 * The feature id for the '<em><b>Routes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AQUATORY__ROUTES = 1;

	/**
	 * The feature id for the '<em><b>Ships</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AQUATORY__SHIPS = 2;

	/**
	 * The number of structural features of the '<em>Aquatory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AQUATORY_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.reuseware.application.taipan.impl.DestinationTypeImpl <em>Destination Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.reuseware.application.taipan.impl.DestinationTypeImpl
	 * @see org.reuseware.application.taipan.impl.TaiPanPackageImpl#getDestinationType()
	 * @generated
	 */
	int DESTINATION_TYPE = 21;

	/**
	 * The number of structural features of the '<em>Destination Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTINATION_TYPE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.reuseware.application.taipan.Destination <em>Destination</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.reuseware.application.taipan.Destination
	 * @see org.reuseware.application.taipan.impl.TaiPanPackageImpl#getDestination()
	 * @generated
	 */
	int DESTINATION = 1;

	/**
	 * The number of structural features of the '<em>Destination</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTINATION_FEATURE_COUNT = DESTINATION_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.reuseware.application.taipan.impl.PortImpl <em>Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.reuseware.application.taipan.impl.PortImpl
	 * @see org.reuseware.application.taipan.impl.TaiPanPackageImpl#getPort()
	 * @generated
	 */
	int PORT = 2;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__LOCATION = DESTINATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Buildings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__BUILDINGS = DESTINATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Register</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__REGISTER = DESTINATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FEATURE_COUNT = DESTINATION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.reuseware.application.taipan.impl.ShipImpl <em>Ship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.reuseware.application.taipan.impl.ShipImpl
	 * @see org.reuseware.application.taipan.impl.TaiPanPackageImpl#getShip()
	 * @generated
	 */
	int SHIP = 5;

	/**
	 * The meta object id for the '{@link org.reuseware.application.taipan.impl.ItemImpl <em>Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.reuseware.application.taipan.impl.ItemImpl
	 * @see org.reuseware.application.taipan.impl.TaiPanPackageImpl#getItem()
	 * @generated
	 */
	int ITEM = 6;

	/**
	 * The meta object id for the '{@link org.reuseware.application.taipan.impl.LargeItemImpl <em>Large Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.reuseware.application.taipan.impl.LargeItemImpl
	 * @see org.reuseware.application.taipan.impl.TaiPanPackageImpl#getLargeItem()
	 * @generated
	 */
	int LARGE_ITEM = 7;

	/**
	 * The meta object id for the '{@link org.reuseware.application.taipan.impl.SmallItemsImpl <em>Small Items</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.reuseware.application.taipan.impl.SmallItemsImpl
	 * @see org.reuseware.application.taipan.impl.TaiPanPackageImpl#getSmallItems()
	 * @generated
	 */
	int SMALL_ITEMS = 8;

	/**
	 * The meta object id for the '{@link org.reuseware.application.taipan.impl.EmptyBoxImpl <em>Empty Box</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.reuseware.application.taipan.impl.EmptyBoxImpl
	 * @see org.reuseware.application.taipan.impl.TaiPanPackageImpl#getEmptyBox()
	 * @generated
	 */
	int EMPTY_BOX = 9;

	/**
	 * The meta object id for the '{@link org.reuseware.application.taipan.impl.WarshipImpl <em>Warship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.reuseware.application.taipan.impl.WarshipImpl
	 * @see org.reuseware.application.taipan.impl.TaiPanPackageImpl#getWarship()
	 * @generated
	 */
	int WARSHIP = 10;

	/**
	 * The meta object id for the '{@link org.reuseware.application.taipan.Order <em>Order</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.reuseware.application.taipan.Order
	 * @see org.reuseware.application.taipan.impl.TaiPanPackageImpl#getOrder()
	 * @generated
	 */
	int ORDER = 11;

	/**
	 * The meta object id for the '{@link org.reuseware.application.taipan.impl.EscortShipsOrderImpl <em>Escort Ships Order</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.reuseware.application.taipan.impl.EscortShipsOrderImpl
	 * @see org.reuseware.application.taipan.impl.TaiPanPackageImpl#getEscortShipsOrder()
	 * @generated
	 */
	int ESCORT_SHIPS_ORDER = 12;

	/**
	 * The meta object id for the '{@link org.reuseware.application.taipan.impl.BesiegePortOrderImpl <em>Besiege Port Order</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.reuseware.application.taipan.impl.BesiegePortOrderImpl
	 * @see org.reuseware.application.taipan.impl.TaiPanPackageImpl#getBesiegePortOrder()
	 * @generated
	 */
	int BESIEGE_PORT_ORDER = 13;

	/**
	 * The meta object id for the '{@link org.reuseware.application.taipan.impl.RouteImpl <em>Route</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.reuseware.application.taipan.impl.RouteImpl
	 * @see org.reuseware.application.taipan.impl.TaiPanPackageImpl#getRoute()
	 * @generated
	 */
	int ROUTE = 4;

	/**
	 * The meta object id for the '{@link org.reuseware.application.taipan.impl.BuildingImpl <em>Building</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.reuseware.application.taipan.impl.BuildingImpl
	 * @see org.reuseware.application.taipan.impl.TaiPanPackageImpl#getBuilding()
	 * @generated
	 */
	int BUILDING = 3;

	/**
	 * The feature id for the '<em><b>Info</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING__INFO = 0;

	/**
	 * The feature id for the '<em><b>Street</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING__STREET = 1;

	/**
	 * The number of structural features of the '<em>Building</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_FEATURE_COUNT = 2;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE__SOURCE = DESTINATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE__DESTINATION = DESTINATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE__DESCRIPTION = DESTINATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Reliability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE__RELIABILITY = DESTINATION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Route</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_FEATURE_COUNT = DESTINATION_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.reuseware.application.taipan.impl.ShipTypeImpl <em>Ship Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.reuseware.application.taipan.impl.ShipTypeImpl
	 * @see org.reuseware.application.taipan.impl.TaiPanPackageImpl#getShipType()
	 * @generated
	 */
	int SHIP_TYPE = 26;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIP__NAME = 0;

	/**
	 * The feature id for the '<em><b>Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIP__DESTINATION = 1;

	/**
	 * The feature id for the '<em><b>Route</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIP__ROUTE = 2;

	/**
	 * The feature id for the '<em><b>Cargo</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIP__CARGO = 3;

	/**
	 * The feature id for the '<em><b>Aquatory</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIP__AQUATORY = 4;

	/**
	 * The number of structural features of the '<em>Ship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIP_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.reuseware.application.taipan.impl.ItemTypeImpl <em>Item Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.reuseware.application.taipan.impl.ItemTypeImpl
	 * @see org.reuseware.application.taipan.impl.TaiPanPackageImpl#getItemType()
	 * @generated
	 */
	int ITEM_TYPE = 18;

	/**
	 * The number of structural features of the '<em>Item Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_TYPE_FEATURE_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Article</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__ARTICLE = ITEM_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_FEATURE_COUNT = ITEM_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Article</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LARGE_ITEM__ARTICLE = ITEM__ARTICLE;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LARGE_ITEM__WEIGHT = ITEM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Large Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LARGE_ITEM_FEATURE_COUNT = ITEM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Article</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALL_ITEMS__ARTICLE = ITEM__ARTICLE;

	/**
	 * The feature id for the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALL_ITEMS__QUANTITY = ITEM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Small Items</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALL_ITEMS_FEATURE_COUNT = ITEM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Article</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY_BOX__ARTICLE = ITEM__ARTICLE;

	/**
	 * The number of structural features of the '<em>Empty Box</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY_BOX_FEATURE_COUNT = ITEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WARSHIP__NAME = SHIP__NAME;

	/**
	 * The feature id for the '<em><b>Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WARSHIP__DESTINATION = SHIP__DESTINATION;

	/**
	 * The feature id for the '<em><b>Route</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WARSHIP__ROUTE = SHIP__ROUTE;

	/**
	 * The feature id for the '<em><b>Cargo</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WARSHIP__CARGO = SHIP__CARGO;

	/**
	 * The feature id for the '<em><b>Aquatory</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WARSHIP__AQUATORY = SHIP__AQUATORY;

	/**
	 * The feature id for the '<em><b>Escort Order</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WARSHIP__ESCORT_ORDER = SHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Attack Orders</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WARSHIP__ATTACK_ORDERS = SHIP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Warship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WARSHIP_FEATURE_COUNT = SHIP_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Order</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_FEATURE_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Ships</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESCORT_SHIPS_ORDER__SHIPS = ORDER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Escort Ships Order</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESCORT_SHIPS_ORDER_FEATURE_COUNT = ORDER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BESIEGE_PORT_ORDER__PORT = ORDER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Besiege Port Order</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BESIEGE_PORT_ORDER_FEATURE_COUNT = ORDER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.reuseware.application.taipan.impl.OrderTypeImpl <em>Order Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.reuseware.application.taipan.impl.OrderTypeImpl
	 * @see org.reuseware.application.taipan.impl.TaiPanPackageImpl#getOrderType()
	 * @generated
	 */
	int ORDER_TYPE = 24;

	/**
	 * The meta object id for the '{@link org.reuseware.application.taipan.impl.EscortShipsOrderTypeImpl <em>Escort Ships Order Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.reuseware.application.taipan.impl.EscortShipsOrderTypeImpl
	 * @see org.reuseware.application.taipan.impl.TaiPanPackageImpl#getEscortShipsOrderType()
	 * @generated
	 */
	int ESCORT_SHIPS_ORDER_TYPE = 17;

	/**
	 * The meta object id for the '{@link org.reuseware.application.taipan.impl.AquatoryTypeImpl <em>Aquatory Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.reuseware.application.taipan.impl.AquatoryTypeImpl
	 * @see org.reuseware.application.taipan.impl.TaiPanPackageImpl#getAquatoryType()
	 * @generated
	 */
	int AQUATORY_TYPE = 15;

	/**
	 * The meta object id for the '{@link org.reuseware.application.taipan.impl.RouteTypeImpl <em>Route Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.reuseware.application.taipan.impl.RouteTypeImpl
	 * @see org.reuseware.application.taipan.impl.TaiPanPackageImpl#getRouteType()
	 * @generated
	 */
	int ROUTE_TYPE = 25;

	/**
	 * The meta object id for the '{@link org.reuseware.application.taipan.impl.WarshipTypeImpl <em>Warship Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.reuseware.application.taipan.impl.WarshipTypeImpl
	 * @see org.reuseware.application.taipan.impl.TaiPanPackageImpl#getWarshipType()
	 * @generated
	 */
	int WARSHIP_TYPE = 23;

	/**
	 * The meta object id for the '{@link org.reuseware.application.taipan.impl.LargeItemTypeImpl <em>Large Item Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.reuseware.application.taipan.impl.LargeItemTypeImpl
	 * @see org.reuseware.application.taipan.impl.TaiPanPackageImpl#getLargeItemType()
	 * @generated
	 */
	int LARGE_ITEM_TYPE = 16;

	/**
	 * The meta object id for the '{@link org.reuseware.application.taipan.impl.BuildingTypeImpl <em>Building Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.reuseware.application.taipan.impl.BuildingTypeImpl
	 * @see org.reuseware.application.taipan.impl.TaiPanPackageImpl#getBuildingType()
	 * @generated
	 */
	int BUILDING_TYPE = 27;

	/**
	 * The meta object id for the '{@link org.reuseware.application.taipan.impl.PortTypeImpl <em>Port Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.reuseware.application.taipan.impl.PortTypeImpl
	 * @see org.reuseware.application.taipan.impl.TaiPanPackageImpl#getPortType()
	 * @generated
	 */
	int PORT_TYPE = 14;

	/**
	 * The meta object id for the '{@link org.reuseware.application.taipan.impl.BesiegePortOrderTypeImpl <em>Besiege Port Order Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.reuseware.application.taipan.impl.BesiegePortOrderTypeImpl
	 * @see org.reuseware.application.taipan.impl.TaiPanPackageImpl#getBesiegePortOrderType()
	 * @generated
	 */
	int BESIEGE_PORT_ORDER_TYPE = 19;

	/**
	 * The meta object id for the '{@link org.reuseware.application.taipan.impl.EmptyBoxTypeImpl <em>Empty Box Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.reuseware.application.taipan.impl.EmptyBoxTypeImpl
	 * @see org.reuseware.application.taipan.impl.TaiPanPackageImpl#getEmptyBoxType()
	 * @generated
	 */
	int EMPTY_BOX_TYPE = 22;

	/**
	 * The meta object id for the '{@link org.reuseware.application.taipan.impl.SmallItemsTypeImpl <em>Small Items Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.reuseware.application.taipan.impl.SmallItemsTypeImpl
	 * @see org.reuseware.application.taipan.impl.TaiPanPackageImpl#getSmallItemsType()
	 * @generated
	 */
	int SMALL_ITEMS_TYPE = 20;

	/**
	 * The number of structural features of the '<em>Port Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_TYPE_FEATURE_COUNT = DESTINATION_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Aquatory Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AQUATORY_TYPE_FEATURE_COUNT = 0;

	/**
	 * The number of structural features of the '<em>Large Item Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LARGE_ITEM_TYPE_FEATURE_COUNT = ITEM_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Order Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_TYPE_FEATURE_COUNT = 0;

	/**
	 * The number of structural features of the '<em>Escort Ships Order Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESCORT_SHIPS_ORDER_TYPE_FEATURE_COUNT = ORDER_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Besiege Port Order Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BESIEGE_PORT_ORDER_TYPE_FEATURE_COUNT = ORDER_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Small Items Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALL_ITEMS_TYPE_FEATURE_COUNT = ITEM_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Empty Box Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY_BOX_TYPE_FEATURE_COUNT = ITEM_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ship Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIP_TYPE_FEATURE_COUNT = 0;

	/**
	 * The number of structural features of the '<em>Warship Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WARSHIP_TYPE_FEATURE_COUNT = SHIP_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Route Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_TYPE_FEATURE_COUNT = DESTINATION_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Building Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_TYPE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.reuseware.application.taipan.impl.LargeItemHookImpl <em>Large Item Hook</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.reuseware.application.taipan.impl.LargeItemHookImpl
	 * @see org.reuseware.application.taipan.impl.TaiPanPackageImpl#getLargeItemHook()
	 * @generated
	 */
	int LARGE_ITEM_HOOK = 28;

	/**
	 * The feature id for the '<em><b>Port Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LARGE_ITEM_HOOK__PORT_NAME = LARGE_ITEM_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Large Item Hook</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LARGE_ITEM_HOOK_FEATURE_COUNT = LARGE_ITEM_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.reuseware.application.taipan.impl.LargeItemPrototypeImpl <em>Large Item Prototype</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.reuseware.application.taipan.impl.LargeItemPrototypeImpl
	 * @see org.reuseware.application.taipan.impl.TaiPanPackageImpl#getLargeItemPrototype()
	 * @generated
	 */
	int LARGE_ITEM_PROTOTYPE = 29;

	/**
	 * The number of structural features of the '<em>Large Item Prototype</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LARGE_ITEM_PROTOTYPE_FEATURE_COUNT = LARGE_ITEM_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.reuseware.application.taipan.impl.ShipPrototypeImpl <em>Ship Prototype</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.reuseware.application.taipan.impl.ShipPrototypeImpl
	 * @see org.reuseware.application.taipan.impl.TaiPanPackageImpl#getShipPrototype()
	 * @generated
	 */
	int SHIP_PROTOTYPE = 30;

	/**
	 * The number of structural features of the '<em>Ship Prototype</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIP_PROTOTYPE_FEATURE_COUNT = SHIP_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.reuseware.application.taipan.impl.ShipHookImpl <em>Ship Hook</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.reuseware.application.taipan.impl.ShipHookImpl
	 * @see org.reuseware.application.taipan.impl.TaiPanPackageImpl#getShipHook()
	 * @generated
	 */
	int SHIP_HOOK = 31;

	/**
	 * The number of structural features of the '<em>Ship Hook</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIP_HOOK_FEATURE_COUNT = SHIP_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.reuseware.application.taipan.impl.PortSlotImpl <em>Port Slot</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.reuseware.application.taipan.impl.PortSlotImpl
	 * @see org.reuseware.application.taipan.impl.TaiPanPackageImpl#getPortSlot()
	 * @generated
	 */
	int PORT_SLOT = 32;

	/**
	 * The feature id for the '<em><b>Port Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_SLOT__PORT_NAME = PORT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Port Slot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_SLOT_FEATURE_COUNT = PORT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.reuseware.application.taipan.impl.RouteSlotImpl <em>Route Slot</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.reuseware.application.taipan.impl.RouteSlotImpl
	 * @see org.reuseware.application.taipan.impl.TaiPanPackageImpl#getRouteSlot()
	 * @generated
	 */
	int ROUTE_SLOT = 33;

	/**
	 * The feature id for the '<em><b>Port Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_SLOT__PORT_NAME = ROUTE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Route Slot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_SLOT_FEATURE_COUNT = ROUTE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.reuseware.application.taipan.impl.PortAnchorImpl <em>Port Anchor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.reuseware.application.taipan.impl.PortAnchorImpl
	 * @see org.reuseware.application.taipan.impl.TaiPanPackageImpl#getPortAnchor()
	 * @generated
	 */
	int PORT_ANCHOR = 34;

	/**
	 * The number of structural features of the '<em>Port Anchor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_ANCHOR_FEATURE_COUNT = PORT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.reuseware.application.taipan.impl.RouteAnchorImpl <em>Route Anchor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.reuseware.application.taipan.impl.RouteAnchorImpl
	 * @see org.reuseware.application.taipan.impl.TaiPanPackageImpl#getRouteAnchor()
	 * @generated
	 */
	int ROUTE_ANCHOR = 35;

	/**
	 * The number of structural features of the '<em>Route Anchor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_ANCHOR_FEATURE_COUNT = ROUTE_TYPE_FEATURE_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link org.reuseware.application.taipan.Aquatory <em>Aquatory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aquatory</em>'.
	 * @see org.reuseware.application.taipan.Aquatory
	 * @generated
	 */
	EClass getAquatory();

	/**
	 * Returns the meta object for the containment reference list '{@link org.reuseware.application.taipan.Aquatory#getPorts <em>Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ports</em>'.
	 * @see org.reuseware.application.taipan.Aquatory#getPorts()
	 * @see #getAquatory()
	 * @generated
	 */
	EReference getAquatory_Ports();

	/**
	 * Returns the meta object for the containment reference list '{@link org.reuseware.application.taipan.Aquatory#getShips <em>Ships</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ships</em>'.
	 * @see org.reuseware.application.taipan.Aquatory#getShips()
	 * @see #getAquatory()
	 * @generated
	 */
	EReference getAquatory_Ships();

	/**
	 * Returns the meta object for class '{@link org.reuseware.application.taipan.Destination <em>Destination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Destination</em>'.
	 * @see org.reuseware.application.taipan.Destination
	 * @generated
	 */
	EClass getDestination();

	/**
	 * Returns the meta object for the containment reference list '{@link org.reuseware.application.taipan.Aquatory#getRoutes <em>Routes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Routes</em>'.
	 * @see org.reuseware.application.taipan.Aquatory#getRoutes()
	 * @see #getAquatory()
	 * @generated
	 */
	EReference getAquatory_Routes();

	/**
	 * Returns the meta object for class '{@link org.reuseware.application.taipan.Port <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port</em>'.
	 * @see org.reuseware.application.taipan.Port
	 * @generated
	 */
	EClass getPort();

	/**
	 * Returns the meta object for the attribute '{@link org.reuseware.application.taipan.Port#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see org.reuseware.application.taipan.Port#getLocation()
	 * @see #getPort()
	 * @generated
	 */
	EAttribute getPort_Location();

	/**
	 * Returns the meta object for the containment reference list '{@link org.reuseware.application.taipan.Port#getBuildings <em>Buildings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Buildings</em>'.
	 * @see org.reuseware.application.taipan.Port#getBuildings()
	 * @see #getPort()
	 * @generated
	 */
	EReference getPort_Buildings();

	/**
	 * Returns the meta object for the reference list '{@link org.reuseware.application.taipan.Port#getRegister <em>Register</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Register</em>'.
	 * @see org.reuseware.application.taipan.Port#getRegister()
	 * @see #getPort()
	 * @generated
	 */
	EReference getPort_Register();

	/**
	 * Returns the meta object for class '{@link org.reuseware.application.taipan.Ship <em>Ship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ship</em>'.
	 * @see org.reuseware.application.taipan.Ship
	 * @generated
	 */
	EClass getShip();

	/**
	 * Returns the meta object for the attribute '{@link org.reuseware.application.taipan.Ship#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.reuseware.application.taipan.Ship#getName()
	 * @see #getShip()
	 * @generated
	 */
	EAttribute getShip_Name();

	/**
	 * Returns the meta object for the reference '{@link org.reuseware.application.taipan.Ship#getDestination <em>Destination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Destination</em>'.
	 * @see org.reuseware.application.taipan.Ship#getDestination()
	 * @see #getShip()
	 * @generated
	 */
	EReference getShip_Destination();

	/**
	 * Returns the meta object for the reference '{@link org.reuseware.application.taipan.Ship#getRoute <em>Route</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Route</em>'.
	 * @see org.reuseware.application.taipan.Ship#getRoute()
	 * @see #getShip()
	 * @generated
	 */
	EReference getShip_Route();

	/**
	 * Returns the meta object for the containment reference list '{@link org.reuseware.application.taipan.Ship#getCargo <em>Cargo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cargo</em>'.
	 * @see org.reuseware.application.taipan.Ship#getCargo()
	 * @see #getShip()
	 * @generated
	 */
	EReference getShip_Cargo();

	/**
	 * Returns the meta object for the container reference '{@link org.reuseware.application.taipan.Ship#getAquatory <em>Aquatory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Aquatory</em>'.
	 * @see org.reuseware.application.taipan.Ship#getAquatory()
	 * @see #getShip()
	 * @generated
	 */
	EReference getShip_Aquatory();

	/**
	 * Returns the meta object for class '{@link org.reuseware.application.taipan.Item <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item</em>'.
	 * @see org.reuseware.application.taipan.Item
	 * @generated
	 */
	EClass getItem();

	/**
	 * Returns the meta object for the attribute '{@link org.reuseware.application.taipan.Item#getArticle <em>Article</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Article</em>'.
	 * @see org.reuseware.application.taipan.Item#getArticle()
	 * @see #getItem()
	 * @generated
	 */
	EAttribute getItem_Article();

	/**
	 * Returns the meta object for class '{@link org.reuseware.application.taipan.LargeItem <em>Large Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Large Item</em>'.
	 * @see org.reuseware.application.taipan.LargeItem
	 * @generated
	 */
	EClass getLargeItem();

	/**
	 * Returns the meta object for the attribute '{@link org.reuseware.application.taipan.LargeItem#getWeight <em>Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Weight</em>'.
	 * @see org.reuseware.application.taipan.LargeItem#getWeight()
	 * @see #getLargeItem()
	 * @generated
	 */
	EAttribute getLargeItem_Weight();

	/**
	 * Returns the meta object for class '{@link org.reuseware.application.taipan.SmallItems <em>Small Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Small Items</em>'.
	 * @see org.reuseware.application.taipan.SmallItems
	 * @generated
	 */
	EClass getSmallItems();

	/**
	 * Returns the meta object for the attribute '{@link org.reuseware.application.taipan.SmallItems#getQuantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantity</em>'.
	 * @see org.reuseware.application.taipan.SmallItems#getQuantity()
	 * @see #getSmallItems()
	 * @generated
	 */
	EAttribute getSmallItems_Quantity();

	/**
	 * Returns the meta object for class '{@link org.reuseware.application.taipan.EmptyBox <em>Empty Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Empty Box</em>'.
	 * @see org.reuseware.application.taipan.EmptyBox
	 * @generated
	 */
	EClass getEmptyBox();

	/**
	 * Returns the meta object for class '{@link org.reuseware.application.taipan.Warship <em>Warship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Warship</em>'.
	 * @see org.reuseware.application.taipan.Warship
	 * @generated
	 */
	EClass getWarship();

	/**
	 * Returns the meta object for the containment reference '{@link org.reuseware.application.taipan.Warship#getEscortOrder <em>Escort Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Escort Order</em>'.
	 * @see org.reuseware.application.taipan.Warship#getEscortOrder()
	 * @see #getWarship()
	 * @generated
	 */
	EReference getWarship_EscortOrder();

	/**
	 * Returns the meta object for the containment reference list '{@link org.reuseware.application.taipan.Warship#getAttackOrders <em>Attack Orders</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attack Orders</em>'.
	 * @see org.reuseware.application.taipan.Warship#getAttackOrders()
	 * @see #getWarship()
	 * @generated
	 */
	EReference getWarship_AttackOrders();

	/**
	 * Returns the meta object for class '{@link org.reuseware.application.taipan.Order <em>Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Order</em>'.
	 * @see org.reuseware.application.taipan.Order
	 * @generated
	 */
	EClass getOrder();

	/**
	 * Returns the meta object for class '{@link org.reuseware.application.taipan.EscortShipsOrder <em>Escort Ships Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Escort Ships Order</em>'.
	 * @see org.reuseware.application.taipan.EscortShipsOrder
	 * @generated
	 */
	EClass getEscortShipsOrder();

	/**
	 * Returns the meta object for the reference list '{@link org.reuseware.application.taipan.EscortShipsOrder#getShips <em>Ships</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ships</em>'.
	 * @see org.reuseware.application.taipan.EscortShipsOrder#getShips()
	 * @see #getEscortShipsOrder()
	 * @generated
	 */
	EReference getEscortShipsOrder_Ships();

	/**
	 * Returns the meta object for class '{@link org.reuseware.application.taipan.BesiegePortOrder <em>Besiege Port Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Besiege Port Order</em>'.
	 * @see org.reuseware.application.taipan.BesiegePortOrder
	 * @generated
	 */
	EClass getBesiegePortOrder();

	/**
	 * Returns the meta object for the reference '{@link org.reuseware.application.taipan.BesiegePortOrder#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Port</em>'.
	 * @see org.reuseware.application.taipan.BesiegePortOrder#getPort()
	 * @see #getBesiegePortOrder()
	 * @generated
	 */
	EReference getBesiegePortOrder_Port();

	/**
	 * Returns the meta object for class '{@link org.reuseware.application.taipan.EscortShipsOrderType <em>Escort Ships Order Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Escort Ships Order Type</em>'.
	 * @see org.reuseware.application.taipan.EscortShipsOrderType
	 * @generated
	 */
	EClass getEscortShipsOrderType();

	/**
	 * Returns the meta object for class '{@link org.reuseware.application.taipan.AquatoryType <em>Aquatory Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aquatory Type</em>'.
	 * @see org.reuseware.application.taipan.AquatoryType
	 * @generated
	 */
	EClass getAquatoryType();

	/**
	 * Returns the meta object for class '{@link org.reuseware.application.taipan.DestinationType <em>Destination Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Destination Type</em>'.
	 * @see org.reuseware.application.taipan.DestinationType
	 * @generated
	 */
	EClass getDestinationType();

	/**
	 * Returns the meta object for class '{@link org.reuseware.application.taipan.RouteType <em>Route Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Route Type</em>'.
	 * @see org.reuseware.application.taipan.RouteType
	 * @generated
	 */
	EClass getRouteType();

	/**
	 * Returns the meta object for class '{@link org.reuseware.application.taipan.WarshipType <em>Warship Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Warship Type</em>'.
	 * @see org.reuseware.application.taipan.WarshipType
	 * @generated
	 */
	EClass getWarshipType();

	/**
	 * Returns the meta object for class '{@link org.reuseware.application.taipan.LargeItemType <em>Large Item Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Large Item Type</em>'.
	 * @see org.reuseware.application.taipan.LargeItemType
	 * @generated
	 */
	EClass getLargeItemType();

	/**
	 * Returns the meta object for class '{@link org.reuseware.application.taipan.BuildingType <em>Building Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Building Type</em>'.
	 * @see org.reuseware.application.taipan.BuildingType
	 * @generated
	 */
	EClass getBuildingType();

	/**
	 * Returns the meta object for class '{@link org.reuseware.application.taipan.PortType <em>Port Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Type</em>'.
	 * @see org.reuseware.application.taipan.PortType
	 * @generated
	 */
	EClass getPortType();

	/**
	 * Returns the meta object for class '{@link org.reuseware.application.taipan.ItemType <em>Item Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item Type</em>'.
	 * @see org.reuseware.application.taipan.ItemType
	 * @generated
	 */
	EClass getItemType();

	/**
	 * Returns the meta object for class '{@link org.reuseware.application.taipan.ShipType <em>Ship Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ship Type</em>'.
	 * @see org.reuseware.application.taipan.ShipType
	 * @generated
	 */
	EClass getShipType();

	/**
	 * Returns the meta object for class '{@link org.reuseware.application.taipan.OrderType <em>Order Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Order Type</em>'.
	 * @see org.reuseware.application.taipan.OrderType
	 * @generated
	 */
	EClass getOrderType();

	/**
	 * Returns the meta object for class '{@link org.reuseware.application.taipan.BesiegePortOrderType <em>Besiege Port Order Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Besiege Port Order Type</em>'.
	 * @see org.reuseware.application.taipan.BesiegePortOrderType
	 * @generated
	 */
	EClass getBesiegePortOrderType();

	/**
	 * Returns the meta object for class '{@link org.reuseware.application.taipan.EmptyBoxType <em>Empty Box Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Empty Box Type</em>'.
	 * @see org.reuseware.application.taipan.EmptyBoxType
	 * @generated
	 */
	EClass getEmptyBoxType();

	/**
	 * Returns the meta object for class '{@link org.reuseware.application.taipan.SmallItemsType <em>Small Items Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Small Items Type</em>'.
	 * @see org.reuseware.application.taipan.SmallItemsType
	 * @generated
	 */
	EClass getSmallItemsType();

	/**
	 * Returns the meta object for class '{@link org.reuseware.application.taipan.LargeItemHook <em>Large Item Hook</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Large Item Hook</em>'.
	 * @see org.reuseware.application.taipan.LargeItemHook
	 * @generated
	 */
	EClass getLargeItemHook();

	/**
	 * Returns the meta object for the attribute '{@link org.reuseware.application.taipan.LargeItemHook#getPortName <em>Port Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port Name</em>'.
	 * @see org.reuseware.application.taipan.LargeItemHook#getPortName()
	 * @see #getLargeItemHook()
	 * @generated
	 */
	EAttribute getLargeItemHook_PortName();

	/**
	 * Returns the meta object for class '{@link org.reuseware.application.taipan.LargeItemPrototype <em>Large Item Prototype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Large Item Prototype</em>'.
	 * @see org.reuseware.application.taipan.LargeItemPrototype
	 * @generated
	 */
	EClass getLargeItemPrototype();

	/**
	 * Returns the meta object for class '{@link org.reuseware.application.taipan.ShipPrototype <em>Ship Prototype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ship Prototype</em>'.
	 * @see org.reuseware.application.taipan.ShipPrototype
	 * @generated
	 */
	EClass getShipPrototype();

	/**
	 * Returns the meta object for class '{@link org.reuseware.application.taipan.ShipHook <em>Ship Hook</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ship Hook</em>'.
	 * @see org.reuseware.application.taipan.ShipHook
	 * @generated
	 */
	EClass getShipHook();

	/**
	 * Returns the meta object for class '{@link org.reuseware.application.taipan.PortSlot <em>Port Slot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Slot</em>'.
	 * @see org.reuseware.application.taipan.PortSlot
	 * @generated
	 */
	EClass getPortSlot();

	/**
	 * Returns the meta object for the attribute '{@link org.reuseware.application.taipan.PortSlot#getPortName <em>Port Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port Name</em>'.
	 * @see org.reuseware.application.taipan.PortSlot#getPortName()
	 * @see #getPortSlot()
	 * @generated
	 */
	EAttribute getPortSlot_PortName();

	/**
	 * Returns the meta object for class '{@link org.reuseware.application.taipan.RouteSlot <em>Route Slot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Route Slot</em>'.
	 * @see org.reuseware.application.taipan.RouteSlot
	 * @generated
	 */
	EClass getRouteSlot();

	/**
	 * Returns the meta object for the attribute '{@link org.reuseware.application.taipan.RouteSlot#getPortName <em>Port Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port Name</em>'.
	 * @see org.reuseware.application.taipan.RouteSlot#getPortName()
	 * @see #getRouteSlot()
	 * @generated
	 */
	EAttribute getRouteSlot_PortName();

	/**
	 * Returns the meta object for class '{@link org.reuseware.application.taipan.PortAnchor <em>Port Anchor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Anchor</em>'.
	 * @see org.reuseware.application.taipan.PortAnchor
	 * @generated
	 */
	EClass getPortAnchor();

	/**
	 * Returns the meta object for class '{@link org.reuseware.application.taipan.RouteAnchor <em>Route Anchor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Route Anchor</em>'.
	 * @see org.reuseware.application.taipan.RouteAnchor
	 * @generated
	 */
	EClass getRouteAnchor();

	/**
	 * Returns the meta object for class '{@link org.reuseware.application.taipan.Route <em>Route</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Route</em>'.
	 * @see org.reuseware.application.taipan.Route
	 * @generated
	 */
	EClass getRoute();

	/**
	 * Returns the meta object for the reference '{@link org.reuseware.application.taipan.Route#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.reuseware.application.taipan.Route#getSource()
	 * @see #getRoute()
	 * @generated
	 */
	EReference getRoute_Source();

	/**
	 * Returns the meta object for the reference '{@link org.reuseware.application.taipan.Route#getDestination <em>Destination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Destination</em>'.
	 * @see org.reuseware.application.taipan.Route#getDestination()
	 * @see #getRoute()
	 * @generated
	 */
	EReference getRoute_Destination();

	/**
	 * Returns the meta object for the attribute '{@link org.reuseware.application.taipan.Route#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.reuseware.application.taipan.Route#getDescription()
	 * @see #getRoute()
	 * @generated
	 */
	EAttribute getRoute_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.reuseware.application.taipan.Route#getReliability <em>Reliability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reliability</em>'.
	 * @see org.reuseware.application.taipan.Route#getReliability()
	 * @see #getRoute()
	 * @generated
	 */
	EAttribute getRoute_Reliability();

	/**
	 * Returns the meta object for class '{@link org.reuseware.application.taipan.Building <em>Building</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Building</em>'.
	 * @see org.reuseware.application.taipan.Building
	 * @generated
	 */
	EClass getBuilding();

	/**
	 * Returns the meta object for the attribute '{@link org.reuseware.application.taipan.Building#getInfo <em>Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Info</em>'.
	 * @see org.reuseware.application.taipan.Building#getInfo()
	 * @see #getBuilding()
	 * @generated
	 */
	EAttribute getBuilding_Info();

	/**
	 * Returns the meta object for the attribute '{@link org.reuseware.application.taipan.Building#getStreet <em>Street</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Street</em>'.
	 * @see org.reuseware.application.taipan.Building#getStreet()
	 * @see #getBuilding()
	 * @generated
	 */
	EAttribute getBuilding_Street();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TaiPanFactory getTaiPanFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {

		/**
		 * The meta object literal for the '{@link org.reuseware.application.taipan.impl.AquatoryImpl <em>Aquatory</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.reuseware.application.taipan.impl.AquatoryImpl
		 * @see org.reuseware.application.taipan.impl.TaiPanPackageImpl#getAquatory()
		 * @generated
		 */
		EClass AQUATORY = eINSTANCE.getAquatory();

		/**
		 * The meta object literal for the '<em><b>Ports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AQUATORY__PORTS = eINSTANCE.getAquatory_Ports();

		/**
		 * The meta object literal for the '<em><b>Ships</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AQUATORY__SHIPS = eINSTANCE.getAquatory_Ships();

		/**
		 * The meta object literal for the '{@link org.reuseware.application.taipan.Destination <em>Destination</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.reuseware.application.taipan.Destination
		 * @see org.reuseware.application.taipan.impl.TaiPanPackageImpl#getDestination()
		 * @generated
		 */
		EClass DESTINATION = eINSTANCE.getDestination();

		/**
		 * The meta object literal for the '<em><b>Routes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AQUATORY__ROUTES = eINSTANCE.getAquatory_Routes();

		/**
		 * The meta object literal for the '{@link org.reuseware.application.taipan.impl.PortImpl <em>Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.reuseware.application.taipan.impl.PortImpl
		 * @see org.reuseware.application.taipan.impl.TaiPanPackageImpl#getPort()
		 * @generated
		 */
		EClass PORT = eINSTANCE.getPort();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT__LOCATION = eINSTANCE.getPort_Location();

		/**
		 * The meta object literal for the '<em><b>Buildings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT__BUILDINGS = eINSTANCE.getPort_Buildings();

		/**
		 * The meta object literal for the '<em><b>Register</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT__REGISTER = eINSTANCE.getPort_Register();

		/**
		 * The meta object literal for the '{@link org.reuseware.application.taipan.impl.ShipImpl <em>Ship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.reuseware.application.taipan.impl.ShipImpl
		 * @see org.reuseware.application.taipan.impl.TaiPanPackageImpl#getShip()
		 * @generated
		 */
		EClass SHIP = eINSTANCE.getShip();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIP__NAME = eINSTANCE.getShip_Name();

		/**
		 * The meta object literal for the '<em><b>Destination</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHIP__DESTINATION = eINSTANCE.getShip_Destination();

		/**
		 * The meta object literal for the '<em><b>Route</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHIP__ROUTE = eINSTANCE.getShip_Route();

		/**
		 * The meta object literal for the '<em><b>Cargo</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHIP__CARGO = eINSTANCE.getShip_Cargo();

		/**
		 * The meta object literal for the '<em><b>Aquatory</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHIP__AQUATORY = eINSTANCE.getShip_Aquatory();

		/**
		 * The meta object literal for the '{@link org.reuseware.application.taipan.impl.ItemImpl <em>Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.reuseware.application.taipan.impl.ItemImpl
		 * @see org.reuseware.application.taipan.impl.TaiPanPackageImpl#getItem()
		 * @generated
		 */
		EClass ITEM = eINSTANCE.getItem();

		/**
		 * The meta object literal for the '<em><b>Article</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM__ARTICLE = eINSTANCE.getItem_Article();

		/**
		 * The meta object literal for the '{@link org.reuseware.application.taipan.impl.LargeItemImpl <em>Large Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.reuseware.application.taipan.impl.LargeItemImpl
		 * @see org.reuseware.application.taipan.impl.TaiPanPackageImpl#getLargeItem()
		 * @generated
		 */
		EClass LARGE_ITEM = eINSTANCE.getLargeItem();

		/**
		 * The meta object literal for the '<em><b>Weight</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LARGE_ITEM__WEIGHT = eINSTANCE.getLargeItem_Weight();

		/**
		 * The meta object literal for the '{@link org.reuseware.application.taipan.impl.SmallItemsImpl <em>Small Items</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.reuseware.application.taipan.impl.SmallItemsImpl
		 * @see org.reuseware.application.taipan.impl.TaiPanPackageImpl#getSmallItems()
		 * @generated
		 */
		EClass SMALL_ITEMS = eINSTANCE.getSmallItems();

		/**
		 * The meta object literal for the '<em><b>Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SMALL_ITEMS__QUANTITY = eINSTANCE.getSmallItems_Quantity();

		/**
		 * The meta object literal for the '{@link org.reuseware.application.taipan.impl.EmptyBoxImpl <em>Empty Box</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.reuseware.application.taipan.impl.EmptyBoxImpl
		 * @see org.reuseware.application.taipan.impl.TaiPanPackageImpl#getEmptyBox()
		 * @generated
		 */
		EClass EMPTY_BOX = eINSTANCE.getEmptyBox();

		/**
		 * The meta object literal for the '{@link org.reuseware.application.taipan.impl.WarshipImpl <em>Warship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.reuseware.application.taipan.impl.WarshipImpl
		 * @see org.reuseware.application.taipan.impl.TaiPanPackageImpl#getWarship()
		 * @generated
		 */
		EClass WARSHIP = eINSTANCE.getWarship();

		/**
		 * The meta object literal for the '<em><b>Escort Order</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WARSHIP__ESCORT_ORDER = eINSTANCE.getWarship_EscortOrder();

		/**
		 * The meta object literal for the '<em><b>Attack Orders</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WARSHIP__ATTACK_ORDERS = eINSTANCE.getWarship_AttackOrders();

		/**
		 * The meta object literal for the '{@link org.reuseware.application.taipan.Order <em>Order</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.reuseware.application.taipan.Order
		 * @see org.reuseware.application.taipan.impl.TaiPanPackageImpl#getOrder()
		 * @generated
		 */
		EClass ORDER = eINSTANCE.getOrder();

		/**
		 * The meta object literal for the '{@link org.reuseware.application.taipan.impl.EscortShipsOrderImpl <em>Escort Ships Order</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.reuseware.application.taipan.impl.EscortShipsOrderImpl
		 * @see org.reuseware.application.taipan.impl.TaiPanPackageImpl#getEscortShipsOrder()
		 * @generated
		 */
		EClass ESCORT_SHIPS_ORDER = eINSTANCE.getEscortShipsOrder();

		/**
		 * The meta object literal for the '<em><b>Ships</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESCORT_SHIPS_ORDER__SHIPS = eINSTANCE
				.getEscortShipsOrder_Ships();

		/**
		 * The meta object literal for the '{@link org.reuseware.application.taipan.impl.BesiegePortOrderImpl <em>Besiege Port Order</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.reuseware.application.taipan.impl.BesiegePortOrderImpl
		 * @see org.reuseware.application.taipan.impl.TaiPanPackageImpl#getBesiegePortOrder()
		 * @generated
		 */
		EClass BESIEGE_PORT_ORDER = eINSTANCE.getBesiegePortOrder();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BESIEGE_PORT_ORDER__PORT = eINSTANCE
				.getBesiegePortOrder_Port();

		/**
		 * The meta object literal for the '{@link org.reuseware.application.taipan.impl.EscortShipsOrderTypeImpl <em>Escort Ships Order Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.reuseware.application.taipan.impl.EscortShipsOrderTypeImpl
		 * @see org.reuseware.application.taipan.impl.TaiPanPackageImpl#getEscortShipsOrderType()
		 * @generated
		 */
		EClass ESCORT_SHIPS_ORDER_TYPE = eINSTANCE.getEscortShipsOrderType();

		/**
		 * The meta object literal for the '{@link org.reuseware.application.taipan.impl.AquatoryTypeImpl <em>Aquatory Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.reuseware.application.taipan.impl.AquatoryTypeImpl
		 * @see org.reuseware.application.taipan.impl.TaiPanPackageImpl#getAquatoryType()
		 * @generated
		 */
		EClass AQUATORY_TYPE = eINSTANCE.getAquatoryType();

		/**
		 * The meta object literal for the '{@link org.reuseware.application.taipan.impl.DestinationTypeImpl <em>Destination Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.reuseware.application.taipan.impl.DestinationTypeImpl
		 * @see org.reuseware.application.taipan.impl.TaiPanPackageImpl#getDestinationType()
		 * @generated
		 */
		EClass DESTINATION_TYPE = eINSTANCE.getDestinationType();

		/**
		 * The meta object literal for the '{@link org.reuseware.application.taipan.impl.RouteTypeImpl <em>Route Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.reuseware.application.taipan.impl.RouteTypeImpl
		 * @see org.reuseware.application.taipan.impl.TaiPanPackageImpl#getRouteType()
		 * @generated
		 */
		EClass ROUTE_TYPE = eINSTANCE.getRouteType();

		/**
		 * The meta object literal for the '{@link org.reuseware.application.taipan.impl.WarshipTypeImpl <em>Warship Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.reuseware.application.taipan.impl.WarshipTypeImpl
		 * @see org.reuseware.application.taipan.impl.TaiPanPackageImpl#getWarshipType()
		 * @generated
		 */
		EClass WARSHIP_TYPE = eINSTANCE.getWarshipType();

		/**
		 * The meta object literal for the '{@link org.reuseware.application.taipan.impl.LargeItemTypeImpl <em>Large Item Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.reuseware.application.taipan.impl.LargeItemTypeImpl
		 * @see org.reuseware.application.taipan.impl.TaiPanPackageImpl#getLargeItemType()
		 * @generated
		 */
		EClass LARGE_ITEM_TYPE = eINSTANCE.getLargeItemType();

		/**
		 * The meta object literal for the '{@link org.reuseware.application.taipan.impl.BuildingTypeImpl <em>Building Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.reuseware.application.taipan.impl.BuildingTypeImpl
		 * @see org.reuseware.application.taipan.impl.TaiPanPackageImpl#getBuildingType()
		 * @generated
		 */
		EClass BUILDING_TYPE = eINSTANCE.getBuildingType();

		/**
		 * The meta object literal for the '{@link org.reuseware.application.taipan.impl.PortTypeImpl <em>Port Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.reuseware.application.taipan.impl.PortTypeImpl
		 * @see org.reuseware.application.taipan.impl.TaiPanPackageImpl#getPortType()
		 * @generated
		 */
		EClass PORT_TYPE = eINSTANCE.getPortType();

		/**
		 * The meta object literal for the '{@link org.reuseware.application.taipan.impl.ItemTypeImpl <em>Item Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.reuseware.application.taipan.impl.ItemTypeImpl
		 * @see org.reuseware.application.taipan.impl.TaiPanPackageImpl#getItemType()
		 * @generated
		 */
		EClass ITEM_TYPE = eINSTANCE.getItemType();

		/**
		 * The meta object literal for the '{@link org.reuseware.application.taipan.impl.ShipTypeImpl <em>Ship Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.reuseware.application.taipan.impl.ShipTypeImpl
		 * @see org.reuseware.application.taipan.impl.TaiPanPackageImpl#getShipType()
		 * @generated
		 */
		EClass SHIP_TYPE = eINSTANCE.getShipType();

		/**
		 * The meta object literal for the '{@link org.reuseware.application.taipan.impl.OrderTypeImpl <em>Order Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.reuseware.application.taipan.impl.OrderTypeImpl
		 * @see org.reuseware.application.taipan.impl.TaiPanPackageImpl#getOrderType()
		 * @generated
		 */
		EClass ORDER_TYPE = eINSTANCE.getOrderType();

		/**
		 * The meta object literal for the '{@link org.reuseware.application.taipan.impl.BesiegePortOrderTypeImpl <em>Besiege Port Order Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.reuseware.application.taipan.impl.BesiegePortOrderTypeImpl
		 * @see org.reuseware.application.taipan.impl.TaiPanPackageImpl#getBesiegePortOrderType()
		 * @generated
		 */
		EClass BESIEGE_PORT_ORDER_TYPE = eINSTANCE.getBesiegePortOrderType();

		/**
		 * The meta object literal for the '{@link org.reuseware.application.taipan.impl.EmptyBoxTypeImpl <em>Empty Box Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.reuseware.application.taipan.impl.EmptyBoxTypeImpl
		 * @see org.reuseware.application.taipan.impl.TaiPanPackageImpl#getEmptyBoxType()
		 * @generated
		 */
		EClass EMPTY_BOX_TYPE = eINSTANCE.getEmptyBoxType();

		/**
		 * The meta object literal for the '{@link org.reuseware.application.taipan.impl.SmallItemsTypeImpl <em>Small Items Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.reuseware.application.taipan.impl.SmallItemsTypeImpl
		 * @see org.reuseware.application.taipan.impl.TaiPanPackageImpl#getSmallItemsType()
		 * @generated
		 */
		EClass SMALL_ITEMS_TYPE = eINSTANCE.getSmallItemsType();

		/**
		 * The meta object literal for the '{@link org.reuseware.application.taipan.impl.LargeItemHookImpl <em>Large Item Hook</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.reuseware.application.taipan.impl.LargeItemHookImpl
		 * @see org.reuseware.application.taipan.impl.TaiPanPackageImpl#getLargeItemHook()
		 * @generated
		 */
		EClass LARGE_ITEM_HOOK = eINSTANCE.getLargeItemHook();

		/**
		 * The meta object literal for the '<em><b>Port Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LARGE_ITEM_HOOK__PORT_NAME = eINSTANCE
				.getLargeItemHook_PortName();

		/**
		 * The meta object literal for the '{@link org.reuseware.application.taipan.impl.LargeItemPrototypeImpl <em>Large Item Prototype</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.reuseware.application.taipan.impl.LargeItemPrototypeImpl
		 * @see org.reuseware.application.taipan.impl.TaiPanPackageImpl#getLargeItemPrototype()
		 * @generated
		 */
		EClass LARGE_ITEM_PROTOTYPE = eINSTANCE.getLargeItemPrototype();

		/**
		 * The meta object literal for the '{@link org.reuseware.application.taipan.impl.ShipPrototypeImpl <em>Ship Prototype</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.reuseware.application.taipan.impl.ShipPrototypeImpl
		 * @see org.reuseware.application.taipan.impl.TaiPanPackageImpl#getShipPrototype()
		 * @generated
		 */
		EClass SHIP_PROTOTYPE = eINSTANCE.getShipPrototype();

		/**
		 * The meta object literal for the '{@link org.reuseware.application.taipan.impl.ShipHookImpl <em>Ship Hook</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.reuseware.application.taipan.impl.ShipHookImpl
		 * @see org.reuseware.application.taipan.impl.TaiPanPackageImpl#getShipHook()
		 * @generated
		 */
		EClass SHIP_HOOK = eINSTANCE.getShipHook();

		/**
		 * The meta object literal for the '{@link org.reuseware.application.taipan.impl.PortSlotImpl <em>Port Slot</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.reuseware.application.taipan.impl.PortSlotImpl
		 * @see org.reuseware.application.taipan.impl.TaiPanPackageImpl#getPortSlot()
		 * @generated
		 */
		EClass PORT_SLOT = eINSTANCE.getPortSlot();

		/**
		 * The meta object literal for the '<em><b>Port Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT_SLOT__PORT_NAME = eINSTANCE.getPortSlot_PortName();

		/**
		 * The meta object literal for the '{@link org.reuseware.application.taipan.impl.RouteSlotImpl <em>Route Slot</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.reuseware.application.taipan.impl.RouteSlotImpl
		 * @see org.reuseware.application.taipan.impl.TaiPanPackageImpl#getRouteSlot()
		 * @generated
		 */
		EClass ROUTE_SLOT = eINSTANCE.getRouteSlot();

		/**
		 * The meta object literal for the '<em><b>Port Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROUTE_SLOT__PORT_NAME = eINSTANCE.getRouteSlot_PortName();

		/**
		 * The meta object literal for the '{@link org.reuseware.application.taipan.impl.PortAnchorImpl <em>Port Anchor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.reuseware.application.taipan.impl.PortAnchorImpl
		 * @see org.reuseware.application.taipan.impl.TaiPanPackageImpl#getPortAnchor()
		 * @generated
		 */
		EClass PORT_ANCHOR = eINSTANCE.getPortAnchor();

		/**
		 * The meta object literal for the '{@link org.reuseware.application.taipan.impl.RouteAnchorImpl <em>Route Anchor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.reuseware.application.taipan.impl.RouteAnchorImpl
		 * @see org.reuseware.application.taipan.impl.TaiPanPackageImpl#getRouteAnchor()
		 * @generated
		 */
		EClass ROUTE_ANCHOR = eINSTANCE.getRouteAnchor();

		/**
		 * The meta object literal for the '{@link org.reuseware.application.taipan.impl.RouteImpl <em>Route</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.reuseware.application.taipan.impl.RouteImpl
		 * @see org.reuseware.application.taipan.impl.TaiPanPackageImpl#getRoute()
		 * @generated
		 */
		EClass ROUTE = eINSTANCE.getRoute();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROUTE__SOURCE = eINSTANCE.getRoute_Source();

		/**
		 * The meta object literal for the '<em><b>Destination</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROUTE__DESTINATION = eINSTANCE.getRoute_Destination();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROUTE__DESCRIPTION = eINSTANCE.getRoute_Description();

		/**
		 * The meta object literal for the '<em><b>Reliability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROUTE__RELIABILITY = eINSTANCE.getRoute_Reliability();

		/**
		 * The meta object literal for the '{@link org.reuseware.application.taipan.impl.BuildingImpl <em>Building</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.reuseware.application.taipan.impl.BuildingImpl
		 * @see org.reuseware.application.taipan.impl.TaiPanPackageImpl#getBuilding()
		 * @generated
		 */
		EClass BUILDING = eINSTANCE.getBuilding();

		/**
		 * The meta object literal for the '<em><b>Info</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUILDING__INFO = eINSTANCE.getBuilding_Info();

		/**
		 * The meta object literal for the '<em><b>Street</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUILDING__STREET = eINSTANCE.getBuilding_Street();

	}

} //TaiPanPackage
