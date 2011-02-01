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

import java.io.IOException;
import java.net.URL;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.reuseware.application.taipan.TaiPanFactory;
import org.reuseware.application.taipan.TaiPanPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TaiPanPackageImpl extends EPackageImpl implements TaiPanPackage {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected String packageFilename = "taipan.ecore"; //$NON-NLS-1$

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aquatoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass destinationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass itemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass largeItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass smallItemsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emptyBoxEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass warshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass escortShipsOrderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass besiegePortOrderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass escortShipsOrderTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aquatoryTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass destinationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass routeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass warshipTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass largeItemTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass buildingTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass itemTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shipTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orderTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass besiegePortOrderTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emptyBoxTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass smallItemsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass largeItemHookEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass largeItemPrototypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shipPrototypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shipHookEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portSlotEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass routeSlotEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portAnchorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass routeAnchorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass routeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass buildingEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.reuseware.application.taipan.TaiPanPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TaiPanPackageImpl() {
		super(eNS_URI, TaiPanFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link TaiPanPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @generated
	 */
	public static TaiPanPackage init() {
		if (isInited)
			return (TaiPanPackage) EPackage.Registry.INSTANCE
					.getEPackage(TaiPanPackage.eNS_URI);

		// Obtain or create and register package
		TaiPanPackageImpl theTaiPanPackage = (TaiPanPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof TaiPanPackageImpl ? EPackage.Registry.INSTANCE
				.get(eNS_URI)
				: new TaiPanPackageImpl());

		isInited = true;

		// Load packages
		theTaiPanPackage.loadPackage();

		// Fix loaded packages
		theTaiPanPackage.fixPackageContents();

		// Mark meta-data to indicate it can't be changed
		theTaiPanPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TaiPanPackage.eNS_URI, theTaiPanPackage);
		return theTaiPanPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAquatory() {
		if (aquatoryEClass == null) {
			aquatoryEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
					TaiPanPackage.eNS_URI).getEClassifiers().get(0);
		}
		return aquatoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAquatory_Ports() {
		return (EReference) getAquatory().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAquatory_Ships() {
		return (EReference) getAquatory().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDestination() {
		if (destinationEClass == null) {
			destinationEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(TaiPanPackage.eNS_URI).getEClassifiers()
					.get(1);
		}
		return destinationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAquatory_Routes() {
		return (EReference) getAquatory().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPort() {
		if (portEClass == null) {
			portEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
					TaiPanPackage.eNS_URI).getEClassifiers().get(2);
		}
		return portEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPort_Location() {
		return (EAttribute) getPort().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPort_Buildings() {
		return (EReference) getPort().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPort_Register() {
		return (EReference) getPort().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getShip() {
		if (shipEClass == null) {
			shipEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
					TaiPanPackage.eNS_URI).getEClassifiers().get(5);
		}
		return shipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getShip_Name() {
		return (EAttribute) getShip().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getShip_Destination() {
		return (EReference) getShip().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getShip_Route() {
		return (EReference) getShip().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getShip_Cargo() {
		return (EReference) getShip().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getShip_Aquatory() {
		return (EReference) getShip().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getItem() {
		if (itemEClass == null) {
			itemEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
					TaiPanPackage.eNS_URI).getEClassifiers().get(6);
		}
		return itemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getItem_Article() {
		return (EAttribute) getItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLargeItem() {
		if (largeItemEClass == null) {
			largeItemEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
					TaiPanPackage.eNS_URI).getEClassifiers().get(7);
		}
		return largeItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLargeItem_Weight() {
		return (EAttribute) getLargeItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSmallItems() {
		if (smallItemsEClass == null) {
			smallItemsEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
					TaiPanPackage.eNS_URI).getEClassifiers().get(8);
		}
		return smallItemsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSmallItems_Quantity() {
		return (EAttribute) getSmallItems().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEmptyBox() {
		if (emptyBoxEClass == null) {
			emptyBoxEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
					TaiPanPackage.eNS_URI).getEClassifiers().get(9);
		}
		return emptyBoxEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWarship() {
		if (warshipEClass == null) {
			warshipEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
					TaiPanPackage.eNS_URI).getEClassifiers().get(10);
		}
		return warshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWarship_EscortOrder() {
		return (EReference) getWarship().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWarship_AttackOrders() {
		return (EReference) getWarship().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrder() {
		if (orderEClass == null) {
			orderEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
					TaiPanPackage.eNS_URI).getEClassifiers().get(11);
		}
		return orderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEscortShipsOrder() {
		if (escortShipsOrderEClass == null) {
			escortShipsOrderEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(TaiPanPackage.eNS_URI).getEClassifiers().get(
							12);
		}
		return escortShipsOrderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEscortShipsOrder_Ships() {
		return (EReference) getEscortShipsOrder().getEStructuralFeatures().get(
				0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBesiegePortOrder() {
		if (besiegePortOrderEClass == null) {
			besiegePortOrderEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(TaiPanPackage.eNS_URI).getEClassifiers().get(
							13);
		}
		return besiegePortOrderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBesiegePortOrder_Port() {
		return (EReference) getBesiegePortOrder().getEStructuralFeatures().get(
				0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEscortShipsOrderType() {
		if (escortShipsOrderTypeEClass == null) {
			escortShipsOrderTypeEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(TaiPanPackage.eNS_URI).getEClassifiers().get(
							17);
		}
		return escortShipsOrderTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAquatoryType() {
		if (aquatoryTypeEClass == null) {
			aquatoryTypeEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(TaiPanPackage.eNS_URI).getEClassifiers().get(
							15);
		}
		return aquatoryTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDestinationType() {
		if (destinationTypeEClass == null) {
			destinationTypeEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(TaiPanPackage.eNS_URI).getEClassifiers().get(
							21);
		}
		return destinationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRouteType() {
		if (routeTypeEClass == null) {
			routeTypeEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
					TaiPanPackage.eNS_URI).getEClassifiers().get(25);
		}
		return routeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWarshipType() {
		if (warshipTypeEClass == null) {
			warshipTypeEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(TaiPanPackage.eNS_URI).getEClassifiers().get(
							23);
		}
		return warshipTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLargeItemType() {
		if (largeItemTypeEClass == null) {
			largeItemTypeEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(TaiPanPackage.eNS_URI).getEClassifiers().get(
							16);
		}
		return largeItemTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBuildingType() {
		if (buildingTypeEClass == null) {
			buildingTypeEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(TaiPanPackage.eNS_URI).getEClassifiers().get(
							27);
		}
		return buildingTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPortType() {
		if (portTypeEClass == null) {
			portTypeEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
					TaiPanPackage.eNS_URI).getEClassifiers().get(14);
		}
		return portTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getItemType() {
		if (itemTypeEClass == null) {
			itemTypeEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
					TaiPanPackage.eNS_URI).getEClassifiers().get(18);
		}
		return itemTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getShipType() {
		if (shipTypeEClass == null) {
			shipTypeEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
					TaiPanPackage.eNS_URI).getEClassifiers().get(26);
		}
		return shipTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrderType() {
		if (orderTypeEClass == null) {
			orderTypeEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
					TaiPanPackage.eNS_URI).getEClassifiers().get(24);
		}
		return orderTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBesiegePortOrderType() {
		if (besiegePortOrderTypeEClass == null) {
			besiegePortOrderTypeEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(TaiPanPackage.eNS_URI).getEClassifiers().get(
							19);
		}
		return besiegePortOrderTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEmptyBoxType() {
		if (emptyBoxTypeEClass == null) {
			emptyBoxTypeEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(TaiPanPackage.eNS_URI).getEClassifiers().get(
							22);
		}
		return emptyBoxTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSmallItemsType() {
		if (smallItemsTypeEClass == null) {
			smallItemsTypeEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(TaiPanPackage.eNS_URI).getEClassifiers().get(
							20);
		}
		return smallItemsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLargeItemHook() {
		if (largeItemHookEClass == null) {
			largeItemHookEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(TaiPanPackage.eNS_URI).getEClassifiers().get(
							28);
		}
		return largeItemHookEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLargeItemHook_PortName() {
		return (EAttribute) getLargeItemHook().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLargeItemPrototype() {
		if (largeItemPrototypeEClass == null) {
			largeItemPrototypeEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(TaiPanPackage.eNS_URI).getEClassifiers().get(
							29);
		}
		return largeItemPrototypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getShipPrototype() {
		if (shipPrototypeEClass == null) {
			shipPrototypeEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(TaiPanPackage.eNS_URI).getEClassifiers().get(
							30);
		}
		return shipPrototypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getShipHook() {
		if (shipHookEClass == null) {
			shipHookEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
					TaiPanPackage.eNS_URI).getEClassifiers().get(31);
		}
		return shipHookEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPortSlot() {
		if (portSlotEClass == null) {
			portSlotEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
					TaiPanPackage.eNS_URI).getEClassifiers().get(32);
		}
		return portSlotEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPortSlot_PortName() {
		return (EAttribute) getPortSlot().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRouteSlot() {
		if (routeSlotEClass == null) {
			routeSlotEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
					TaiPanPackage.eNS_URI).getEClassifiers().get(33);
		}
		return routeSlotEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRouteSlot_PortName() {
		return (EAttribute) getRouteSlot().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPortAnchor() {
		if (portAnchorEClass == null) {
			portAnchorEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
					TaiPanPackage.eNS_URI).getEClassifiers().get(34);
		}
		return portAnchorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRouteAnchor() {
		if (routeAnchorEClass == null) {
			routeAnchorEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(TaiPanPackage.eNS_URI).getEClassifiers().get(
							35);
		}
		return routeAnchorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoute() {
		if (routeEClass == null) {
			routeEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
					TaiPanPackage.eNS_URI).getEClassifiers().get(4);
		}
		return routeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoute_Source() {
		return (EReference) getRoute().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoute_Destination() {
		return (EReference) getRoute().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoute_Description() {
		return (EAttribute) getRoute().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoute_Reliability() {
		return (EAttribute) getRoute().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBuilding() {
		if (buildingEClass == null) {
			buildingEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
					TaiPanPackage.eNS_URI).getEClassifiers().get(3);
		}
		return buildingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBuilding_Info() {
		return (EAttribute) getBuilding().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBuilding_Street() {
		return (EAttribute) getBuilding().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaiPanFactory getTaiPanFactory() {
		return (TaiPanFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isLoaded = false;

	/**
	 * Laods the package and any sub-packages from their serialized form.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void loadPackage() {
		if (isLoaded)
			return;
		isLoaded = true;

		URL url = getClass().getResource(packageFilename);
		if (url == null) {
			throw new RuntimeException(
					"Missing serialized package: " + packageFilename); //$NON-NLS-1$
		}
		URI uri = URI.createURI(url.toString());
		Resource resource = new EcoreResourceFactoryImpl().createResource(uri);
		try {
			resource.load(null);
		} catch (IOException exception) {
			throw new WrappedException(exception);
		}
		initializeFromLoadedEPackage(this, (EPackage) resource.getContents()
				.get(0));
		createResource(eNS_URI);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isFixed = false;

	/**
	 * Fixes up the loaded package, to make it appear as if it had been programmatically built.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fixPackageContents() {
		if (isFixed)
			return;
		isFixed = true;
		fixEClassifiers();
	}

	/**
	 * Sets the instance class on the given classifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void fixInstanceClass(EClassifier eClassifier) {
		if (eClassifier.getInstanceClassName() == null) {
			eClassifier
					.setInstanceClassName("org.reuseware.application.taipan." + eClassifier.getName()); //$NON-NLS-1$
			setGeneratedClassName(eClassifier);
		}
	}

} //TaiPanPackageImpl
