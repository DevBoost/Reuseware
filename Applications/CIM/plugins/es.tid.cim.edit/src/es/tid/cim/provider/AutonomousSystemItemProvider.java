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

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import es.tid.cim.AutonomousSystem;
import es.tid.cim.CimFactory;
import es.tid.cim.CimPackage;

/**
 * This is the item provider adapter for a {@link es.tid.cim.AutonomousSystem} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AutonomousSystemItemProvider
	extends AdminDomainItemProvider
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
	public AutonomousSystemItemProvider(AdapterFactory adapterFactory) {
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

			addASNumberPropertyDescriptor(object);
			addIsSingleHomedPropertyDescriptor(object);
			addIsTransitPropertyDescriptor(object);
			addRequireIGPSyncPropertyDescriptor(object);
			addRoutingUpdateSourcePropertyDescriptor(object);
			addAggregationTypePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the AS Number feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addASNumberPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AutonomousSystem_ASNumber_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AutonomousSystem_ASNumber_feature", "_UI_AutonomousSystem_type"),
				 CimPackage.eINSTANCE.getAutonomousSystem_ASNumber(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Single Homed feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsSingleHomedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AutonomousSystem_isSingleHomed_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AutonomousSystem_isSingleHomed_feature", "_UI_AutonomousSystem_type"),
				 CimPackage.eINSTANCE.getAutonomousSystem_IsSingleHomed(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Transit feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsTransitPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AutonomousSystem_isTransit_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AutonomousSystem_isTransit_feature", "_UI_AutonomousSystem_type"),
				 CimPackage.eINSTANCE.getAutonomousSystem_IsTransit(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Require IGP Sync feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRequireIGPSyncPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AutonomousSystem_requireIGPSync_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AutonomousSystem_requireIGPSync_feature", "_UI_AutonomousSystem_type"),
				 CimPackage.eINSTANCE.getAutonomousSystem_RequireIGPSync(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Routing Update Source feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRoutingUpdateSourcePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AutonomousSystem_routingUpdateSource_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AutonomousSystem_routingUpdateSource_feature", "_UI_AutonomousSystem_type"),
				 CimPackage.eINSTANCE.getAutonomousSystem_RoutingUpdateSource(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Aggregation Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAggregationTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AutonomousSystem_aggregationType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AutonomousSystem_aggregationType_feature", "_UI_AutonomousSystem_type"),
				 CimPackage.eINSTANCE.getAutonomousSystem_AggregationType(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(CimPackage.eINSTANCE.getAutonomousSystem_RouterInAS());
			childrenFeatures.add(CimPackage.eINSTANCE.getAutonomousSystem_ASBGPEndpoints());
			childrenFeatures.add(CimPackage.eINSTANCE.getAutonomousSystem_RoutingProtocolDomainInAS());
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns AutonomousSystem.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/AutonomousSystem"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((AutonomousSystem)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_AutonomousSystem_type") :
			getString("_UI_AutonomousSystem_type") + " " + label;
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

		switch (notification.getFeatureID(AutonomousSystem.class)) {
			case CimPackage.AUTONOMOUS_SYSTEM__AS_NUMBER:
			case CimPackage.AUTONOMOUS_SYSTEM__IS_SINGLE_HOMED:
			case CimPackage.AUTONOMOUS_SYSTEM__IS_TRANSIT:
			case CimPackage.AUTONOMOUS_SYSTEM__REQUIRE_IGP_SYNC:
			case CimPackage.AUTONOMOUS_SYSTEM__ROUTING_UPDATE_SOURCE:
			case CimPackage.AUTONOMOUS_SYSTEM__AGGREGATION_TYPE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case CimPackage.AUTONOMOUS_SYSTEM__ROUTER_IN_AS:
			case CimPackage.AUTONOMOUS_SYSTEM__ASBGP_ENDPOINTS:
			case CimPackage.AUTONOMOUS_SYSTEM__ROUTING_PROTOCOL_DOMAIN_IN_AS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
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

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getAutonomousSystem_RouterInAS(),
				 CimFactory.eINSTANCE.createComputerSystem()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getAutonomousSystem_RouterInAS(),
				 CimFactory.eINSTANCE.createUnitaryComputerSystem()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getAutonomousSystem_ASBGPEndpoints(),
				 CimFactory.eINSTANCE.createBGPProtocolEndpoint()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getAutonomousSystem_RoutingProtocolDomainInAS(),
				 CimFactory.eINSTANCE.createRoutingProtocolDomain()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == CimPackage.eINSTANCE.getManagedElement_Components() ||
			childFeature == CimPackage.eINSTANCE.getSystem_SystemComponents() ||
			childFeature == CimPackage.eINSTANCE.getAdminDomain_ContainedDomain() ||
			childFeature == CimPackage.eINSTANCE.getAutonomousSystem_RouterInAS() ||
			childFeature == CimPackage.eINSTANCE.getAutonomousSystem_ASBGPEndpoints() ||
			childFeature == CimPackage.eINSTANCE.getAutonomousSystem_RoutingProtocolDomainInAS();

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
