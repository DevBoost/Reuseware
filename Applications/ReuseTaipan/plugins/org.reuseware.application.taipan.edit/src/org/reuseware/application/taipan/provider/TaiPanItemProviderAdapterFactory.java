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
package org.reuseware.application.taipan.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.reuseware.application.taipan.util.TaiPanAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TaiPanItemProviderAdapterFactory extends TaiPanAdapterFactory
		implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {

	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaiPanItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.reuseware.application.taipan.Aquatory} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AquatoryItemProvider aquatoryItemProvider;

	/**
	 * This creates an adapter for a {@link org.reuseware.application.taipan.Aquatory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAquatoryAdapter() {
		if (aquatoryItemProvider == null) {
			aquatoryItemProvider = new AquatoryItemProvider(this);
		}

		return aquatoryItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.reuseware.application.taipan.Port} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PortItemProvider portItemProvider;

	/**
	 * This creates an adapter for a {@link org.reuseware.application.taipan.Port}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPortAdapter() {
		if (portItemProvider == null) {
			portItemProvider = new PortItemProvider(this);
		}

		return portItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.reuseware.application.taipan.Ship} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ShipItemProvider shipItemProvider;

	/**
	 * This creates an adapter for a {@link org.reuseware.application.taipan.Ship}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createShipAdapter() {
		if (shipItemProvider == null) {
			shipItemProvider = new ShipItemProvider(this);
		}

		return shipItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.reuseware.application.taipan.LargeItem} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LargeItemItemProvider largeItemItemProvider;

	/**
	 * This creates an adapter for a {@link org.reuseware.application.taipan.LargeItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLargeItemAdapter() {
		if (largeItemItemProvider == null) {
			largeItemItemProvider = new LargeItemItemProvider(this);
		}

		return largeItemItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.reuseware.application.taipan.SmallItems} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SmallItemsItemProvider smallItemsItemProvider;

	/**
	 * This creates an adapter for a {@link org.reuseware.application.taipan.SmallItems}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSmallItemsAdapter() {
		if (smallItemsItemProvider == null) {
			smallItemsItemProvider = new SmallItemsItemProvider(this);
		}

		return smallItemsItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.reuseware.application.taipan.EmptyBox} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EmptyBoxItemProvider emptyBoxItemProvider;

	/**
	 * This creates an adapter for a {@link org.reuseware.application.taipan.EmptyBox}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEmptyBoxAdapter() {
		if (emptyBoxItemProvider == null) {
			emptyBoxItemProvider = new EmptyBoxItemProvider(this);
		}

		return emptyBoxItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.reuseware.application.taipan.Warship} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WarshipItemProvider warshipItemProvider;

	/**
	 * This creates an adapter for a {@link org.reuseware.application.taipan.Warship}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createWarshipAdapter() {
		if (warshipItemProvider == null) {
			warshipItemProvider = new WarshipItemProvider(this);
		}

		return warshipItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.reuseware.application.taipan.EscortShipsOrder} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EscortShipsOrderItemProvider escortShipsOrderItemProvider;

	/**
	 * This creates an adapter for a {@link org.reuseware.application.taipan.EscortShipsOrder}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEscortShipsOrderAdapter() {
		if (escortShipsOrderItemProvider == null) {
			escortShipsOrderItemProvider = new EscortShipsOrderItemProvider(
					this);
		}

		return escortShipsOrderItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.reuseware.application.taipan.BesiegePortOrder} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BesiegePortOrderItemProvider besiegePortOrderItemProvider;

	/**
	 * This creates an adapter for a {@link org.reuseware.application.taipan.BesiegePortOrder}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBesiegePortOrderAdapter() {
		if (besiegePortOrderItemProvider == null) {
			besiegePortOrderItemProvider = new BesiegePortOrderItemProvider(
					this);
		}

		return besiegePortOrderItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.reuseware.application.taipan.LargeItemHook} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LargeItemHookItemProvider largeItemHookItemProvider;

	/**
	 * This creates an adapter for a {@link org.reuseware.application.taipan.LargeItemHook}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLargeItemHookAdapter() {
		if (largeItemHookItemProvider == null) {
			largeItemHookItemProvider = new LargeItemHookItemProvider(this);
		}

		return largeItemHookItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.reuseware.application.taipan.LargeItemPrototype} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LargeItemPrototypeItemProvider largeItemPrototypeItemProvider;

	/**
	 * This creates an adapter for a {@link org.reuseware.application.taipan.LargeItemPrototype}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLargeItemPrototypeAdapter() {
		if (largeItemPrototypeItemProvider == null) {
			largeItemPrototypeItemProvider = new LargeItemPrototypeItemProvider(
					this);
		}

		return largeItemPrototypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.reuseware.application.taipan.ShipPrototype} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ShipPrototypeItemProvider shipPrototypeItemProvider;

	/**
	 * This creates an adapter for a {@link org.reuseware.application.taipan.ShipPrototype}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createShipPrototypeAdapter() {
		if (shipPrototypeItemProvider == null) {
			shipPrototypeItemProvider = new ShipPrototypeItemProvider(this);
		}

		return shipPrototypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.reuseware.application.taipan.ShipHook} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ShipHookItemProvider shipHookItemProvider;

	/**
	 * This creates an adapter for a {@link org.reuseware.application.taipan.ShipHook}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createShipHookAdapter() {
		if (shipHookItemProvider == null) {
			shipHookItemProvider = new ShipHookItemProvider(this);
		}

		return shipHookItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.reuseware.application.taipan.PortSlot} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PortSlotItemProvider portSlotItemProvider;

	/**
	 * This creates an adapter for a {@link org.reuseware.application.taipan.PortSlot}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPortSlotAdapter() {
		if (portSlotItemProvider == null) {
			portSlotItemProvider = new PortSlotItemProvider(this);
		}

		return portSlotItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.reuseware.application.taipan.RouteSlot} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RouteSlotItemProvider routeSlotItemProvider;

	/**
	 * This creates an adapter for a {@link org.reuseware.application.taipan.RouteSlot}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRouteSlotAdapter() {
		if (routeSlotItemProvider == null) {
			routeSlotItemProvider = new RouteSlotItemProvider(this);
		}

		return routeSlotItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.reuseware.application.taipan.PortAnchor} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PortAnchorItemProvider portAnchorItemProvider;

	/**
	 * This creates an adapter for a {@link org.reuseware.application.taipan.PortAnchor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPortAnchorAdapter() {
		if (portAnchorItemProvider == null) {
			portAnchorItemProvider = new PortAnchorItemProvider(this);
		}

		return portAnchorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.reuseware.application.taipan.RouteAnchor} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RouteAnchorItemProvider routeAnchorItemProvider;

	/**
	 * This creates an adapter for a {@link org.reuseware.application.taipan.RouteAnchor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRouteAnchorAdapter() {
		if (routeAnchorItemProvider == null) {
			routeAnchorItemProvider = new RouteAnchorItemProvider(this);
		}

		return routeAnchorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.reuseware.application.taipan.Route} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RouteItemProvider routeItemProvider;

	/**
	 * This creates an adapter for a {@link org.reuseware.application.taipan.Route}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRouteAdapter() {
		if (routeItemProvider == null) {
			routeItemProvider = new RouteItemProvider(this);
		}

		return routeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.reuseware.application.taipan.Building} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BuildingItemProvider buildingItemProvider;

	/**
	 * This creates an adapter for a {@link org.reuseware.application.taipan.Building}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBuildingAdapter() {
		if (buildingItemProvider == null) {
			buildingItemProvider = new BuildingItemProvider(this);
		}

		return buildingItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory
				.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(
			ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>)
					|| (((Class<?>) type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (aquatoryItemProvider != null)
			aquatoryItemProvider.dispose();
		if (portItemProvider != null)
			portItemProvider.dispose();
		if (buildingItemProvider != null)
			buildingItemProvider.dispose();
		if (routeItemProvider != null)
			routeItemProvider.dispose();
		if (shipItemProvider != null)
			shipItemProvider.dispose();
		if (largeItemItemProvider != null)
			largeItemItemProvider.dispose();
		if (smallItemsItemProvider != null)
			smallItemsItemProvider.dispose();
		if (emptyBoxItemProvider != null)
			emptyBoxItemProvider.dispose();
		if (warshipItemProvider != null)
			warshipItemProvider.dispose();
		if (escortShipsOrderItemProvider != null)
			escortShipsOrderItemProvider.dispose();
		if (besiegePortOrderItemProvider != null)
			besiegePortOrderItemProvider.dispose();
		if (largeItemHookItemProvider != null)
			largeItemHookItemProvider.dispose();
		if (largeItemPrototypeItemProvider != null)
			largeItemPrototypeItemProvider.dispose();
		if (shipPrototypeItemProvider != null)
			shipPrototypeItemProvider.dispose();
		if (shipHookItemProvider != null)
			shipHookItemProvider.dispose();
		if (portSlotItemProvider != null)
			portSlotItemProvider.dispose();
		if (routeSlotItemProvider != null)
			routeSlotItemProvider.dispose();
		if (portAnchorItemProvider != null)
			portAnchorItemProvider.dispose();
		if (routeAnchorItemProvider != null)
			routeAnchorItemProvider.dispose();
	}

}
