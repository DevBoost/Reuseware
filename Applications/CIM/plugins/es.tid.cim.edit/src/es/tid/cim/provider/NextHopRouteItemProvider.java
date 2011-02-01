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
import es.tid.cim.NextHopRoute;

/**
 * This is the item provider adapter for a {@link es.tid.cim.NextHopRoute} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class NextHopRouteItemProvider
	extends ManagedElementItemProvider
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
	public NextHopRouteItemProvider(AdapterFactory adapterFactory) {
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

			addInstanceIDPropertyDescriptor(object);
			addDestinationAddressPropertyDescriptor(object);
			addAdminDistancePropertyDescriptor(object);
			addRouteMetricPropertyDescriptor(object);
			addIsStaticPropertyDescriptor(object);
			addTypeOfRoutePropertyDescriptor(object);
			addRouteUsesEndpointPropertyDescriptor(object);
			addAssociatedNextHopPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Instance ID feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInstanceIDPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_NextHopRoute_instanceID_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NextHopRoute_instanceID_feature", "_UI_NextHopRoute_type"),
				 CimPackage.eINSTANCE.getNextHopRoute_InstanceID(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Destination Address feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDestinationAddressPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_NextHopRoute_destinationAddress_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NextHopRoute_destinationAddress_feature", "_UI_NextHopRoute_type"),
				 CimPackage.eINSTANCE.getNextHopRoute_DestinationAddress(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Admin Distance feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAdminDistancePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_NextHopRoute_adminDistance_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NextHopRoute_adminDistance_feature", "_UI_NextHopRoute_type"),
				 CimPackage.eINSTANCE.getNextHopRoute_AdminDistance(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Route Metric feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRouteMetricPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_NextHopRoute_routeMetric_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NextHopRoute_routeMetric_feature", "_UI_NextHopRoute_type"),
				 CimPackage.eINSTANCE.getNextHopRoute_RouteMetric(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Static feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsStaticPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_NextHopRoute_isStatic_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NextHopRoute_isStatic_feature", "_UI_NextHopRoute_type"),
				 CimPackage.eINSTANCE.getNextHopRoute_IsStatic(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Type Of Route feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTypeOfRoutePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_NextHopRoute_typeOfRoute_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NextHopRoute_typeOfRoute_feature", "_UI_NextHopRoute_type"),
				 CimPackage.eINSTANCE.getNextHopRoute_TypeOfRoute(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Route Uses Endpoint feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRouteUsesEndpointPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_NextHopRoute_routeUsesEndpoint_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NextHopRoute_routeUsesEndpoint_feature", "_UI_NextHopRoute_type"),
				 CimPackage.eINSTANCE.getNextHopRoute_RouteUsesEndpoint(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Associated Next Hop feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAssociatedNextHopPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_NextHopRoute_associatedNextHop_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NextHopRoute_associatedNextHop_feature", "_UI_NextHopRoute_type"),
				 CimPackage.eINSTANCE.getNextHopRoute_AssociatedNextHop(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((NextHopRoute)object).getElementName();
		return label == null || label.length() == 0 ?
			getString("_UI_NextHopRoute_type") :
			getString("_UI_NextHopRoute_type") + " " + label;
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

		switch (notification.getFeatureID(NextHopRoute.class)) {
			case CimPackage.NEXT_HOP_ROUTE__INSTANCE_ID:
			case CimPackage.NEXT_HOP_ROUTE__DESTINATION_ADDRESS:
			case CimPackage.NEXT_HOP_ROUTE__ADMIN_DISTANCE:
			case CimPackage.NEXT_HOP_ROUTE__ROUTE_METRIC:
			case CimPackage.NEXT_HOP_ROUTE__IS_STATIC:
			case CimPackage.NEXT_HOP_ROUTE__TYPE_OF_ROUTE:
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
