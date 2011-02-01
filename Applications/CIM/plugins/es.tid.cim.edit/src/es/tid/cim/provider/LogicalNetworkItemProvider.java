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

import es.tid.cim.CimFactory;
import es.tid.cim.CimPackage;
import es.tid.cim.LogicalNetwork;

/**
 * This is the item provider adapter for a {@link es.tid.cim.LogicalNetwork} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class LogicalNetworkItemProvider
	extends CollectionOfMSEsItemProvider
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
	public LogicalNetworkItemProvider(AdapterFactory adapterFactory) {
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

			addCreationClassNamePropertyDescriptor(object);
			addNamePropertyDescriptor(object);
			addNetworkTypePropertyDescriptor(object);
			addOtherTypeDescriptionPropertyDescriptor(object);
			addLogicalNetworkServicePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Creation Class Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCreationClassNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LogicalNetwork_creationClassName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LogicalNetwork_creationClassName_feature", "_UI_LogicalNetwork_type"),
				 CimPackage.eINSTANCE.getLogicalNetwork_CreationClassName(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LogicalNetwork_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LogicalNetwork_name_feature", "_UI_LogicalNetwork_type"),
				 CimPackage.eINSTANCE.getLogicalNetwork_Name(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Network Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNetworkTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LogicalNetwork_networkType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LogicalNetwork_networkType_feature", "_UI_LogicalNetwork_type"),
				 CimPackage.eINSTANCE.getLogicalNetwork_NetworkType(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Other Type Description feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOtherTypeDescriptionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LogicalNetwork_otherTypeDescription_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LogicalNetwork_otherTypeDescription_feature", "_UI_LogicalNetwork_type"),
				 CimPackage.eINSTANCE.getLogicalNetwork_OtherTypeDescription(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Logical Network Service feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLogicalNetworkServicePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LogicalNetwork_logicalNetworkService_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LogicalNetwork_logicalNetworkService_feature", "_UI_LogicalNetwork_type"),
				 CimPackage.eINSTANCE.getLogicalNetwork_LogicalNetworkService(),
				 true,
				 false,
				 true,
				 null,
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
			childrenFeatures.add(CimPackage.eINSTANCE.getLogicalNetwork_InLogicalNetwork());
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
	 * This returns LogicalNetwork.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/LogicalNetwork"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((LogicalNetwork)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_LogicalNetwork_type") :
			getString("_UI_LogicalNetwork_type") + " " + label;
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

		switch (notification.getFeatureID(LogicalNetwork.class)) {
			case CimPackage.LOGICAL_NETWORK__CREATION_CLASS_NAME:
			case CimPackage.LOGICAL_NETWORK__NAME:
			case CimPackage.LOGICAL_NETWORK__NETWORK_TYPE:
			case CimPackage.LOGICAL_NETWORK__OTHER_TYPE_DESCRIPTION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case CimPackage.LOGICAL_NETWORK__IN_LOGICAL_NETWORK:
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
				(CimPackage.eINSTANCE.getLogicalNetwork_InLogicalNetwork(),
				 CimFactory.eINSTANCE.createProtocolEndpoint()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getLogicalNetwork_InLogicalNetwork(),
				 CimFactory.eINSTANCE.createLANEndpoint()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getLogicalNetwork_InLogicalNetwork(),
				 CimFactory.eINSTANCE.createOSPFProtocolEndpointBase()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getLogicalNetwork_InLogicalNetwork(),
				 CimFactory.eINSTANCE.createOSPFVirtualInterface()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getLogicalNetwork_InLogicalNetwork(),
				 CimFactory.eINSTANCE.createOSPFProtocolEndpoint()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getLogicalNetwork_InLogicalNetwork(),
				 CimFactory.eINSTANCE.createBGPProtocolEndpoint()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getLogicalNetwork_InLogicalNetwork(),
				 CimFactory.eINSTANCE.createIPProtocolEndpoint()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getLogicalNetwork_InLogicalNetwork(),
				 CimFactory.eINSTANCE.createIPXProtocolEndpoint()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getLogicalNetwork_InLogicalNetwork(),
				 CimFactory.eINSTANCE.createMPLSProtocolEndpoint()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getLogicalNetwork_InLogicalNetwork(),
				 CimFactory.eINSTANCE.createSwitchPort()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getLogicalNetwork_InLogicalNetwork(),
				 CimFactory.eINSTANCE.createTCPProtocolEndpoint()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getLogicalNetwork_InLogicalNetwork(),
				 CimFactory.eINSTANCE.createUDPProtocolEndpoint()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getLogicalNetwork_InLogicalNetwork(),
				 CimFactory.eINSTANCE.createDHCPProtocolEndpoint()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getLogicalNetwork_InLogicalNetwork(),
				 CimFactory.eINSTANCE.createTelnetProtocolEndpoint()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getLogicalNetwork_InLogicalNetwork(),
				 CimFactory.eINSTANCE.createDNSProtocolEndpoint()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getLogicalNetwork_InLogicalNetwork(),
				 CimFactory.eINSTANCE.createWirelessLANEndpoint()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getLogicalNetwork_InLogicalNetwork(),
				 CimFactory.eINSTANCE.createWiFiEndPoint()));
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
			childFeature == CimPackage.eINSTANCE.getLogicalNetwork_InLogicalNetwork();

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
