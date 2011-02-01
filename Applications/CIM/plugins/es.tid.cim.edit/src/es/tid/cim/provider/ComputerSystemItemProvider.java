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
import es.tid.cim.ComputerSystem;

/**
 * This is the item provider adapter for a {@link es.tid.cim.ComputerSystem} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ComputerSystemItemProvider
	extends SystemItemProvider
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
	public ComputerSystemItemProvider(AdapterFactory adapterFactory) {
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

			addOtherIdentifyingInfoPropertyDescriptor(object);
			addIdentifyingDescriptionsPropertyDescriptor(object);
			addDedicatedPropertyDescriptor(object);
			addOtherDedicatedDescriptionsPropertyDescriptor(object);
			addResetCapabilityPropertyDescriptor(object);
			addHostedRoutingServicesPropertyDescriptor(object);
			addHostedForwardingServicesPropertyDescriptor(object);
			addHostedRoutingPolicyPropertyDescriptor(object);
			addHostedFilterListPropertyDescriptor(object);
			addRunningOSPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Other Identifying Info feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOtherIdentifyingInfoPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ComputerSystem_otherIdentifyingInfo_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ComputerSystem_otherIdentifyingInfo_feature", "_UI_ComputerSystem_type"),
				 CimPackage.eINSTANCE.getComputerSystem_OtherIdentifyingInfo(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Identifying Descriptions feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIdentifyingDescriptionsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ComputerSystem_identifyingDescriptions_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ComputerSystem_identifyingDescriptions_feature", "_UI_ComputerSystem_type"),
				 CimPackage.eINSTANCE.getComputerSystem_IdentifyingDescriptions(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Dedicated feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDedicatedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ComputerSystem_dedicated_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ComputerSystem_dedicated_feature", "_UI_ComputerSystem_type"),
				 CimPackage.eINSTANCE.getComputerSystem_Dedicated(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Other Dedicated Descriptions feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOtherDedicatedDescriptionsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ComputerSystem_otherDedicatedDescriptions_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ComputerSystem_otherDedicatedDescriptions_feature", "_UI_ComputerSystem_type"),
				 CimPackage.eINSTANCE.getComputerSystem_OtherDedicatedDescriptions(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Reset Capability feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addResetCapabilityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ComputerSystem_resetCapability_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ComputerSystem_resetCapability_feature", "_UI_ComputerSystem_type"),
				 CimPackage.eINSTANCE.getComputerSystem_ResetCapability(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Hosted Routing Services feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHostedRoutingServicesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ComputerSystem_hostedRoutingServices_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ComputerSystem_hostedRoutingServices_feature", "_UI_ComputerSystem_type"),
				 CimPackage.eINSTANCE.getComputerSystem_HostedRoutingServices(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Hosted Forwarding Services feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHostedForwardingServicesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ComputerSystem_hostedForwardingServices_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ComputerSystem_hostedForwardingServices_feature", "_UI_ComputerSystem_type"),
				 CimPackage.eINSTANCE.getComputerSystem_HostedForwardingServices(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Hosted Routing Policy feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHostedRoutingPolicyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ComputerSystem_hostedRoutingPolicy_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ComputerSystem_hostedRoutingPolicy_feature", "_UI_ComputerSystem_type"),
				 CimPackage.eINSTANCE.getComputerSystem_HostedRoutingPolicy(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Hosted Filter List feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHostedFilterListPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ComputerSystem_hostedFilterList_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ComputerSystem_hostedFilterList_feature", "_UI_ComputerSystem_type"),
				 CimPackage.eINSTANCE.getComputerSystem_HostedFilterList(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Running OS feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRunningOSPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ComputerSystem_runningOS_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ComputerSystem_runningOS_feature", "_UI_ComputerSystem_type"),
				 CimPackage.eINSTANCE.getComputerSystem_RunningOS(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This returns ComputerSystem.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ComputerSystem"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ComputerSystem)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_ComputerSystem_type") :
			getString("_UI_ComputerSystem_type") + " " + label;
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

		switch (notification.getFeatureID(ComputerSystem.class)) {
			case CimPackage.COMPUTER_SYSTEM__OTHER_IDENTIFYING_INFO:
			case CimPackage.COMPUTER_SYSTEM__IDENTIFYING_DESCRIPTIONS:
			case CimPackage.COMPUTER_SYSTEM__DEDICATED:
			case CimPackage.COMPUTER_SYSTEM__OTHER_DEDICATED_DESCRIPTIONS:
			case CimPackage.COMPUTER_SYSTEM__RESET_CAPABILITY:
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
			childFeature == CimPackage.eINSTANCE.getSystem_SystemComponents();

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
