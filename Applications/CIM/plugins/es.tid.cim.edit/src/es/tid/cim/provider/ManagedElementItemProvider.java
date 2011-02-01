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

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import es.tid.cim.CimFactory;
import es.tid.cim.CimPackage;
import es.tid.cim.ManagedElement;

/**
 * This is the item provider adapter for a {@link es.tid.cim.ManagedElement} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ManagedElementItemProvider
	extends ItemProviderAdapter
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
	public ManagedElementItemProvider(AdapterFactory adapterFactory) {
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

			addCaptionPropertyDescriptor(object);
			addDescriptionPropertyDescriptor(object);
			addElementNamePropertyDescriptor(object);
			addDependenciesPropertyDescriptor(object);
			addElementCapabilitiesPropertyDescriptor(object);
			addHostedDependencyPropertyDescriptor(object);
			addElementSettingDataPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Caption feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCaptionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ManagedElement_caption_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ManagedElement_caption_feature", "_UI_ManagedElement_type"),
				 CimPackage.eINSTANCE.getManagedElement_Caption(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Description feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDescriptionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ManagedElement_description_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ManagedElement_description_feature", "_UI_ManagedElement_type"),
				 CimPackage.eINSTANCE.getManagedElement_Description(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Element Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addElementNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ManagedElement_elementName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ManagedElement_elementName_feature", "_UI_ManagedElement_type"),
				 CimPackage.eINSTANCE.getManagedElement_ElementName(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Dependencies feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDependenciesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ManagedElement_dependencies_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ManagedElement_dependencies_feature", "_UI_ManagedElement_type"),
				 CimPackage.eINSTANCE.getManagedElement_Dependencies(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Element Capabilities feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addElementCapabilitiesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ManagedElement_elementCapabilities_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ManagedElement_elementCapabilities_feature", "_UI_ManagedElement_type"),
				 CimPackage.eINSTANCE.getManagedElement_ElementCapabilities(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Hosted Dependency feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHostedDependencyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ManagedElement_hostedDependency_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ManagedElement_hostedDependency_feature", "_UI_ManagedElement_type"),
				 CimPackage.eINSTANCE.getManagedElement_HostedDependency(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Element Setting Data feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addElementSettingDataPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ManagedElement_elementSettingData_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ManagedElement_elementSettingData_feature", "_UI_ManagedElement_type"),
				 CimPackage.eINSTANCE.getManagedElement_ElementSettingData(),
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
			childrenFeatures.add(CimPackage.eINSTANCE.getManagedElement_Components());
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
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ManagedElement)object).getElementName();
		return label == null || label.length() == 0 ?
			getString("_UI_ManagedElement_type") :
			getString("_UI_ManagedElement_type") + " " + label;
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

		switch (notification.getFeatureID(ManagedElement.class)) {
			case CimPackage.MANAGED_ELEMENT__CAPTION:
			case CimPackage.MANAGED_ELEMENT__DESCRIPTION:
			case CimPackage.MANAGED_ELEMENT__ELEMENT_NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case CimPackage.MANAGED_ELEMENT__COMPONENTS:
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
				(CimPackage.eINSTANCE.getManagedElement_Components(),
				 CimFactory.eINSTANCE.createBGPCluster()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getManagedElement_Components(),
				 CimFactory.eINSTANCE.createBGPPeerGroup()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getManagedElement_Components(),
				 CimFactory.eINSTANCE.createBGPService()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getManagedElement_Components(),
				 CimFactory.eINSTANCE.createAdminDomain()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getManagedElement_Components(),
				 CimFactory.eINSTANCE.createAutonomousSystem()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getManagedElement_Components(),
				 CimFactory.eINSTANCE.createNetwork()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getManagedElement_Components(),
				 CimFactory.eINSTANCE.createComputerSystem()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getManagedElement_Components(),
				 CimFactory.eINSTANCE.createDirectory()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getManagedElement_Components(),
				 CimFactory.eINSTANCE.createLogicalFile()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getManagedElement_Components(),
				 CimFactory.eINSTANCE.createUnitaryComputerSystem()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getManagedElement_Components(),
				 CimFactory.eINSTANCE.createArchitectureCheck()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getManagedElement_Components(),
				 CimFactory.eINSTANCE.createApplicationSystem()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getManagedElement_Components(),
				 CimFactory.eINSTANCE.createSoftwareElement()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getManagedElement_Components(),
				 CimFactory.eINSTANCE.createBIOSElement()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getManagedElement_Components(),
				 CimFactory.eINSTANCE.createSoftwareFeature()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getManagedElement_Components(),
				 CimFactory.eINSTANCE.createBIOSFeature()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getManagedElement_Components(),
				 CimFactory.eINSTANCE.createCreateDirectoryAction()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getManagedElement_Components(),
				 CimFactory.eINSTANCE.createCopyFileAction()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getManagedElement_Components(),
				 CimFactory.eINSTANCE.createDirectorySpecification()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getManagedElement_Components(),
				 CimFactory.eINSTANCE.createDiskSpaceCheck()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getManagedElement_Components(),
				 CimFactory.eINSTANCE.createExecuteProgram()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getManagedElement_Components(),
				 CimFactory.eINSTANCE.createFileSpecification()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getManagedElement_Components(),
				 CimFactory.eINSTANCE.createInstalledProduct()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getManagedElement_Components(),
				 CimFactory.eINSTANCE.createMemoryCheck()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getManagedElement_Components(),
				 CimFactory.eINSTANCE.createModifySettingAction()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getManagedElement_Components(),
				 CimFactory.eINSTANCE.createOperatingSystem()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getManagedElement_Components(),
				 CimFactory.eINSTANCE.createOSVersionCheck()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getManagedElement_Components(),
				 CimFactory.eINSTANCE.createRebootAction()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getManagedElement_Components(),
				 CimFactory.eINSTANCE.createRemoveFileAction()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getManagedElement_Components(),
				 CimFactory.eINSTANCE.createRemoveDirectoryAction()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getManagedElement_Components(),
				 CimFactory.eINSTANCE.createSettingCheck()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getManagedElement_Components(),
				 CimFactory.eINSTANCE.createSoftwareElementVersionCheck()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getManagedElement_Components(),
				 CimFactory.eINSTANCE.createSwapSpaceCheck()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getManagedElement_Components(),
				 CimFactory.eINSTANCE.createVersionCompatibilityCheck()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getManagedElement_Components(),
				 CimFactory.eINSTANCE.createBufferPool()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getManagedElement_Components(),
				 CimFactory.eINSTANCE.createConnectivityMemberhipSettingData()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getManagedElement_Components(),
				 CimFactory.eINSTANCE.createSystemSpecificCollection()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getManagedElement_Components(),
				 CimFactory.eINSTANCE.createConnectivityCollection()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getManagedElement_Components(),
				 CimFactory.eINSTANCE.createNamedAddressCollection()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getManagedElement_Components(),
				 CimFactory.eINSTANCE.createRangeOfIPAddresses()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getManagedElement_Components(),
				 CimFactory.eINSTANCE.createLANConnectivitySegment()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getManagedElement_Components(),
				 CimFactory.eINSTANCE.createIPConnectivitySubnet()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getManagedElement_Components(),
				 CimFactory.eINSTANCE.createIPXConnectivityNetwork()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getManagedElement_Components(),
				 CimFactory.eINSTANCE.createIPAddressRange()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getManagedElement_Components(),
				 CimFactory.eINSTANCE.createLogicalNetwork()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getManagedElement_Components(),
				 CimFactory.eINSTANCE.createIPXNetwork()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getManagedElement_Components(),
				 CimFactory.eINSTANCE.createLANSegment()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getManagedElement_Components(),
				 CimFactory.eINSTANCE.createIPSubnet()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getManagedElement_Components(),
				 CimFactory.eINSTANCE.createElementSettingData()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getManagedElement_Components(),
				 CimFactory.eINSTANCE.createEnabledLogicalElementCapabilities()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getManagedElement_Components(),
				 CimFactory.eINSTANCE.createGenericService()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getManagedElement_Components(),
				 CimFactory.eINSTANCE.createPowerManagementCapabilities()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getManagedElement_Components(),
				 CimFactory.eINSTANCE.createProduct()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getManagedElement_Components(),
				 CimFactory.eINSTANCE.createProtocolEndpoint()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getManagedElement_Components(),
				 CimFactory.eINSTANCE.createRemoteServiceAccessPoint()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getManagedElement_Components(),
				 CimFactory.eINSTANCE.createRemotePort()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getManagedElement_Components(),
				 CimFactory.eINSTANCE.createServiceAccessURI()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getManagedElement_Components(),
				 CimFactory.eINSTANCE.createSoftwareIdentity()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getManagedElement_Components(),
				 CimFactory.eINSTANCE.createStorageExtent()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getManagedElement_Components(),
				 CimFactory.eINSTANCE.createMemory()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getManagedElement_Components(),
				 CimFactory.eINSTANCE.createVolatileStorage()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getManagedElement_Components(),
				 CimFactory.eINSTANCE.createUSBDevice()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getManagedElement_Components(),
				 CimFactory.eINSTANCE.createFilterList()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getManagedElement_Components(),
				 CimFactory.eINSTANCE.createFilterEntry()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getManagedElement_Components(),
				 CimFactory.eINSTANCE.createIPHeadersFilter()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getManagedElement_Components(),
				 CimFactory.eINSTANCE.createLogicalPort()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getManagedElement_Components(),
				 CimFactory.eINSTANCE.createNetworkPort()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getManagedElement_Components(),
				 CimFactory.eINSTANCE.createEthernetPort()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getManagedElement_Components(),
				 CimFactory.eINSTANCE.createLogicalModule()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getManagedElement_Components(),
				 CimFactory.eINSTANCE.createUSBPort()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getManagedElement_Components(),
				 CimFactory.eINSTANCE.createWirelessPort()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getManagedElement_Components(),
				 CimFactory.eINSTANCE.createWiFiPort()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getManagedElement_Components(),
				 CimFactory.eINSTANCE.createDSLModem()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getManagedElement_Components(),
				 CimFactory.eINSTANCE.createADSLModem()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getManagedElement_Components(),
				 CimFactory.eINSTANCE.createCableModem()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getManagedElement_Components(),
				 CimFactory.eINSTANCE.createISDNModem()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getManagedElement_Components(),
				 CimFactory.eINSTANCE.createHDSLModem()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getManagedElement_Components(),
				 CimFactory.eINSTANCE.createSDSLModem()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getManagedElement_Components(),
				 CimFactory.eINSTANCE.createVDSLModem()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getManagedElement_Components(),
				 CimFactory.eINSTANCE.createPOTSModem()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getManagedElement_Components(),
				 CimFactory.eINSTANCE.createUniModem()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getManagedElement_Components(),
				 CimFactory.eINSTANCE.createReplacementSet()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getManagedElement_Components(),
				 CimFactory.eINSTANCE.createMemoryCapacity()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getManagedElement_Components(),
				 CimFactory.eINSTANCE.createLANEndpoint()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getManagedElement_Components(),
				 CimFactory.eINSTANCE.createOSPFProtocolEndpointBase()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getManagedElement_Components(),
				 CimFactory.eINSTANCE.createOSPFVirtualInterface()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getManagedElement_Components(),
				 CimFactory.eINSTANCE.createOSPFProtocolEndpoint()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getManagedElement_Components(),
				 CimFactory.eINSTANCE.createBGPProtocolEndpoint()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getManagedElement_Components(),
				 CimFactory.eINSTANCE.createIPProtocolEndpoint()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getManagedElement_Components(),
				 CimFactory.eINSTANCE.createIPXProtocolEndpoint()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getManagedElement_Components(),
				 CimFactory.eINSTANCE.createMPLSProtocolEndpoint()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getManagedElement_Components(),
				 CimFactory.eINSTANCE.createSwitchPort()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getManagedElement_Components(),
				 CimFactory.eINSTANCE.createTCPProtocolEndpoint()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getManagedElement_Components(),
				 CimFactory.eINSTANCE.createUDPProtocolEndpoint()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getManagedElement_Components(),
				 CimFactory.eINSTANCE.createCLPSettingData()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getManagedElement_Components(),
				 CimFactory.eINSTANCE.createTelnetSettingData()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getManagedElement_Components(),
				 CimFactory.eINSTANCE.createSSHSettingData()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getManagedElement_Components(),
				 CimFactory.eINSTANCE.createDHCPCapabilities()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getManagedElement_Components(),
				 CimFactory.eINSTANCE.createDHCPProtocolEndpoint()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getManagedElement_Components(),
				 CimFactory.eINSTANCE.createTelnetProtocolEndpoint()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getManagedElement_Components(),
				 CimFactory.eINSTANCE.createDNSProtocolEndpoint()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getManagedElement_Components(),
				 CimFactory.eINSTANCE.createIPAssignmentSettingData()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getManagedElement_Components(),
				 CimFactory.eINSTANCE.createDNSSettingData()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getManagedElement_Components(),
				 CimFactory.eINSTANCE.createWirelessLANEndpoint()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getManagedElement_Components(),
				 CimFactory.eINSTANCE.createWiFiEndPoint()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getManagedElement_Components(),
				 CimFactory.eINSTANCE.createWiFiEndpointSettings()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getManagedElement_Components(),
				 CimFactory.eINSTANCE.createProtocolService()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getManagedElement_Components(),
				 CimFactory.eINSTANCE.createConditioningService()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getManagedElement_Components(),
				 CimFactory.eINSTANCE.createQoSService()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getManagedElement_Components(),
				 CimFactory.eINSTANCE.createPrecedenceService()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getManagedElement_Components(),
				 CimFactory.eINSTANCE.createDiffServService()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getManagedElement_Components(),
				 CimFactory.eINSTANCE.createEFService()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getManagedElement_Components(),
				 CimFactory.eINSTANCE.createAFService()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getManagedElement_Components(),
				 CimFactory.eINSTANCE.createHdr8021PService()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getManagedElement_Components(),
				 CimFactory.eINSTANCE.createDropThresholdCalculationService()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getManagedElement_Components(),
				 CimFactory.eINSTANCE.createFlowService()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getManagedElement_Components(),
				 CimFactory.eINSTANCE.createNextHopIPRoute()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getManagedElement_Components(),
				 CimFactory.eINSTANCE.createAdministrativeDistance()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getManagedElement_Components(),
				 CimFactory.eINSTANCE.createNextHopRouting()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getManagedElement_Components(),
				 CimFactory.eINSTANCE.createRoutingPolicy()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getManagedElement_Components(),
				 CimFactory.eINSTANCE.createForwardingService()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getManagedElement_Components(),
				 CimFactory.eINSTANCE.createRoutingProtocolDomain()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getManagedElement_Components(),
				 CimFactory.eINSTANCE.createNATService()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getManagedElement_Components(),
				 CimFactory.eINSTANCE.createNATStaticSettings()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getManagedElement_Components(),
				 CimFactory.eINSTANCE.createNATListBasedSettings()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getManagedElement_Components(),
				 CimFactory.eINSTANCE.createSNMPCommunityStrings()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getManagedElement_Components(),
				 CimFactory.eINSTANCE.createSNMPService()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getManagedElement_Components(),
				 CimFactory.eINSTANCE.createSNMPTrapTarget()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return CIMLevelZeroEditPlugin.INSTANCE;
	}

}
