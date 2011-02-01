/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.tid.cim.provider;



import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import es.tid.cim.CimPackage;
import es.tid.cim.NextHopIPRoute;

/**
 * This is the item provider adapter for a {@link es.tid.cim.NextHopIPRoute} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class NextHopIPRouteItemProvider
	extends NextHopRouteItemProvider
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NextHopIPRouteItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addRouteDerivationPropertyDescriptor(object);
			addOtherDerivationPropertyDescriptor(object);
			addDestinationMaskPropertyDescriptor(object);
			addPrefixLengthPropertyDescriptor(object);
			addAddressTypePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Route Derivation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRouteDerivationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_NextHopIPRoute_routeDerivation_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NextHopIPRoute_routeDerivation_feature", "_UI_NextHopIPRoute_type"),
				 CimPackage.eINSTANCE.getNextHopIPRoute_RouteDerivation(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Other Derivation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOtherDerivationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_NextHopIPRoute_otherDerivation_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NextHopIPRoute_otherDerivation_feature", "_UI_NextHopIPRoute_type"),
				 CimPackage.eINSTANCE.getNextHopIPRoute_OtherDerivation(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Destination Mask feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDestinationMaskPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_NextHopIPRoute_destinationMask_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NextHopIPRoute_destinationMask_feature", "_UI_NextHopIPRoute_type"),
				 CimPackage.eINSTANCE.getNextHopIPRoute_DestinationMask(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Prefix Length feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPrefixLengthPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_NextHopIPRoute_prefixLength_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NextHopIPRoute_prefixLength_feature", "_UI_NextHopIPRoute_type"),
				 CimPackage.eINSTANCE.getNextHopIPRoute_PrefixLength(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Address Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAddressTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_NextHopIPRoute_addressType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NextHopIPRoute_addressType_feature", "_UI_NextHopIPRoute_type"),
				 CimPackage.eINSTANCE.getNextHopIPRoute_AddressType(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns NextHopIPRoute.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/NextHopIPRoute"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((NextHopIPRoute)object).getElementName();
		return label == null || label.length() == 0 ?
			getString("_UI_NextHopIPRoute_type") :
			getString("_UI_NextHopIPRoute_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(NextHopIPRoute.class)) {
			case CimPackage.NEXT_HOP_IP_ROUTE__ROUTE_DERIVATION:
			case CimPackage.NEXT_HOP_IP_ROUTE__OTHER_DERIVATION:
			case CimPackage.NEXT_HOP_IP_ROUTE__DESTINATION_MASK:
			case CimPackage.NEXT_HOP_IP_ROUTE__PREFIX_LENGTH:
			case CimPackage.NEXT_HOP_IP_ROUTE__ADDRESS_TYPE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

}
