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

/**
 * This is the item provider adapter for a {@link es.tid.cim.System} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SystemItemProvider
	extends EnabledLogicalElementItemProvider
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
	public SystemItemProvider(AdapterFactory adapterFactory) {
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
			addSystemDevicesPropertyDescriptor(object);
			addNameFormatPropertyDescriptor(object);
			addPrimaryOwnerNamePropertyDescriptor(object);
			addPrimaryOwnerContactPropertyDescriptor(object);
			addHostedServicesPropertyDescriptor(object);
			addHostedRoutePropertyDescriptor(object);
			addHostedAccessPointPropertyDescriptor(object);
			addHostedCollectionPropertyDescriptor(object);
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
				 getString("_UI_System_creationClassName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_System_creationClassName_feature", "_UI_System_type"),
				 CimPackage.eINSTANCE.getSystem_CreationClassName(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the System Devices feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSystemDevicesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_System_systemDevices_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_System_systemDevices_feature", "_UI_System_type"),
				 CimPackage.eINSTANCE.getSystem_SystemDevices(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Name Format feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNameFormatPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_System_nameFormat_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_System_nameFormat_feature", "_UI_System_type"),
				 CimPackage.eINSTANCE.getSystem_NameFormat(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Primary Owner Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPrimaryOwnerNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_System_primaryOwnerName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_System_primaryOwnerName_feature", "_UI_System_type"),
				 CimPackage.eINSTANCE.getSystem_PrimaryOwnerName(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Primary Owner Contact feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPrimaryOwnerContactPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_System_primaryOwnerContact_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_System_primaryOwnerContact_feature", "_UI_System_type"),
				 CimPackage.eINSTANCE.getSystem_PrimaryOwnerContact(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Hosted Services feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHostedServicesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_System_hostedServices_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_System_hostedServices_feature", "_UI_System_type"),
				 CimPackage.eINSTANCE.getSystem_HostedServices(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Hosted Route feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHostedRoutePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_System_hostedRoute_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_System_hostedRoute_feature", "_UI_System_type"),
				 CimPackage.eINSTANCE.getSystem_HostedRoute(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Hosted Access Point feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHostedAccessPointPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_System_hostedAccessPoint_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_System_hostedAccessPoint_feature", "_UI_System_type"),
				 CimPackage.eINSTANCE.getSystem_HostedAccessPoint(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Hosted Collection feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHostedCollectionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_System_hostedCollection_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_System_hostedCollection_feature", "_UI_System_type"),
				 CimPackage.eINSTANCE.getSystem_HostedCollection(),
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
			childrenFeatures.add(CimPackage.eINSTANCE.getSystem_SystemComponents());
			childrenFeatures.add(CimPackage.eINSTANCE.getSystem_Roles());
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
		String label = ((es.tid.cim.System)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_System_type") :
			getString("_UI_System_type") + " " + label;
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

		switch (notification.getFeatureID(es.tid.cim.System.class)) {
			case CimPackage.SYSTEM__CREATION_CLASS_NAME:
			case CimPackage.SYSTEM__NAME_FORMAT:
			case CimPackage.SYSTEM__PRIMARY_OWNER_NAME:
			case CimPackage.SYSTEM__PRIMARY_OWNER_CONTACT:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case CimPackage.SYSTEM__SYSTEM_COMPONENTS:
			case CimPackage.SYSTEM__ROLES:
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
				(CimPackage.eINSTANCE.getSystem_SystemComponents(),
				 CimFactory.eINSTANCE.createBGPCluster()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getSystem_SystemComponents(),
				 CimFactory.eINSTANCE.createBGPPeerGroup()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getSystem_SystemComponents(),
				 CimFactory.eINSTANCE.createBGPService()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getSystem_SystemComponents(),
				 CimFactory.eINSTANCE.createAdminDomain()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getSystem_SystemComponents(),
				 CimFactory.eINSTANCE.createAutonomousSystem()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getSystem_SystemComponents(),
				 CimFactory.eINSTANCE.createNetwork()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getSystem_SystemComponents(),
				 CimFactory.eINSTANCE.createComputerSystem()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getSystem_SystemComponents(),
				 CimFactory.eINSTANCE.createDirectory()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getSystem_SystemComponents(),
				 CimFactory.eINSTANCE.createLogicalFile()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getSystem_SystemComponents(),
				 CimFactory.eINSTANCE.createUnitaryComputerSystem()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getSystem_SystemComponents(),
				 CimFactory.eINSTANCE.createArchitectureCheck()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getSystem_SystemComponents(),
				 CimFactory.eINSTANCE.createApplicationSystem()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getSystem_SystemComponents(),
				 CimFactory.eINSTANCE.createSoftwareElement()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getSystem_SystemComponents(),
				 CimFactory.eINSTANCE.createBIOSElement()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getSystem_SystemComponents(),
				 CimFactory.eINSTANCE.createSoftwareFeature()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getSystem_SystemComponents(),
				 CimFactory.eINSTANCE.createBIOSFeature()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getSystem_SystemComponents(),
				 CimFactory.eINSTANCE.createCreateDirectoryAction()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getSystem_SystemComponents(),
				 CimFactory.eINSTANCE.createCopyFileAction()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getSystem_SystemComponents(),
				 CimFactory.eINSTANCE.createDirectorySpecification()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getSystem_SystemComponents(),
				 CimFactory.eINSTANCE.createDiskSpaceCheck()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getSystem_SystemComponents(),
				 CimFactory.eINSTANCE.createExecuteProgram()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getSystem_SystemComponents(),
				 CimFactory.eINSTANCE.createFileSpecification()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getSystem_SystemComponents(),
				 CimFactory.eINSTANCE.createInstalledProduct()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getSystem_SystemComponents(),
				 CimFactory.eINSTANCE.createMemoryCheck()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getSystem_SystemComponents(),
				 CimFactory.eINSTANCE.createModifySettingAction()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getSystem_SystemComponents(),
				 CimFactory.eINSTANCE.createOperatingSystem()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getSystem_SystemComponents(),
				 CimFactory.eINSTANCE.createOSVersionCheck()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getSystem_SystemComponents(),
				 CimFactory.eINSTANCE.createRebootAction()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getSystem_SystemComponents(),
				 CimFactory.eINSTANCE.createRemoveFileAction()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getSystem_SystemComponents(),
				 CimFactory.eINSTANCE.createRemoveDirectoryAction()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getSystem_SystemComponents(),
				 CimFactory.eINSTANCE.createSettingCheck()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getSystem_SystemComponents(),
				 CimFactory.eINSTANCE.createSoftwareElementVersionCheck()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getSystem_SystemComponents(),
				 CimFactory.eINSTANCE.createSwapSpaceCheck()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getSystem_SystemComponents(),
				 CimFactory.eINSTANCE.createVersionCompatibilityCheck()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getSystem_SystemComponents(),
				 CimFactory.eINSTANCE.createBufferPool()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getSystem_SystemComponents(),
				 CimFactory.eINSTANCE.createConnectivityMemberhipSettingData()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getSystem_SystemComponents(),
				 CimFactory.eINSTANCE.createSystemSpecificCollection()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getSystem_SystemComponents(),
				 CimFactory.eINSTANCE.createConnectivityCollection()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getSystem_SystemComponents(),
				 CimFactory.eINSTANCE.createNamedAddressCollection()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getSystem_SystemComponents(),
				 CimFactory.eINSTANCE.createRangeOfIPAddresses()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getSystem_SystemComponents(),
				 CimFactory.eINSTANCE.createLANConnectivitySegment()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getSystem_SystemComponents(),
				 CimFactory.eINSTANCE.createIPConnectivitySubnet()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getSystem_SystemComponents(),
				 CimFactory.eINSTANCE.createIPXConnectivityNetwork()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getSystem_SystemComponents(),
				 CimFactory.eINSTANCE.createIPAddressRange()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getSystem_SystemComponents(),
				 CimFactory.eINSTANCE.createLogicalNetwork()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getSystem_SystemComponents(),
				 CimFactory.eINSTANCE.createIPXNetwork()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getSystem_SystemComponents(),
				 CimFactory.eINSTANCE.createLANSegment()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getSystem_SystemComponents(),
				 CimFactory.eINSTANCE.createIPSubnet()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getSystem_SystemComponents(),
				 CimFactory.eINSTANCE.createElementSettingData()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getSystem_SystemComponents(),
				 CimFactory.eINSTANCE.createEnabledLogicalElementCapabilities()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getSystem_SystemComponents(),
				 CimFactory.eINSTANCE.createGenericService()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getSystem_SystemComponents(),
				 CimFactory.eINSTANCE.createPowerManagementCapabilities()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getSystem_SystemComponents(),
				 CimFactory.eINSTANCE.createProduct()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getSystem_SystemComponents(),
				 CimFactory.eINSTANCE.createProtocolEndpoint()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getSystem_SystemComponents(),
				 CimFactory.eINSTANCE.createRemoteServiceAccessPoint()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getSystem_SystemComponents(),
				 CimFactory.eINSTANCE.createRemotePort()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getSystem_SystemComponents(),
				 CimFactory.eINSTANCE.createServiceAccessURI()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getSystem_SystemComponents(),
				 CimFactory.eINSTANCE.createSoftwareIdentity()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getSystem_SystemComponents(),
				 CimFactory.eINSTANCE.createStorageExtent()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getSystem_SystemComponents(),
				 CimFactory.eINSTANCE.createMemory()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getSystem_SystemComponents(),
				 CimFactory.eINSTANCE.createVolatileStorage()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getSystem_SystemComponents(),
				 CimFactory.eINSTANCE.createUSBDevice()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getSystem_SystemComponents(),
				 CimFactory.eINSTANCE.createFilterList()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getSystem_SystemComponents(),
				 CimFactory.eINSTANCE.createFilterEntry()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getSystem_SystemComponents(),
				 CimFactory.eINSTANCE.createIPHeadersFilter()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getSystem_SystemComponents(),
				 CimFactory.eINSTANCE.createLogicalPort()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getSystem_SystemComponents(),
				 CimFactory.eINSTANCE.createNetworkPort()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getSystem_SystemComponents(),
				 CimFactory.eINSTANCE.createEthernetPort()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getSystem_SystemComponents(),
				 CimFactory.eINSTANCE.createLogicalModule()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getSystem_SystemComponents(),
				 CimFactory.eINSTANCE.createUSBPort()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getSystem_SystemComponents(),
				 CimFactory.eINSTANCE.createWirelessPort()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getSystem_SystemComponents(),
				 CimFactory.eINSTANCE.createWiFiPort()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getSystem_SystemComponents(),
				 CimFactory.eINSTANCE.createDSLModem()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getSystem_SystemComponents(),
				 CimFactory.eINSTANCE.createADSLModem()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getSystem_SystemComponents(),
				 CimFactory.eINSTANCE.createCableModem()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getSystem_SystemComponents(),
				 CimFactory.eINSTANCE.createISDNModem()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getSystem_SystemComponents(),
				 CimFactory.eINSTANCE.createHDSLModem()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getSystem_SystemComponents(),
				 CimFactory.eINSTANCE.createSDSLModem()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getSystem_SystemComponents(),
				 CimFactory.eINSTANCE.createVDSLModem()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getSystem_SystemComponents(),
				 CimFactory.eINSTANCE.createPOTSModem()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getSystem_SystemComponents(),
				 CimFactory.eINSTANCE.createUniModem()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getSystem_SystemComponents(),
				 CimFactory.eINSTANCE.createReplacementSet()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getSystem_SystemComponents(),
				 CimFactory.eINSTANCE.createMemoryCapacity()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getSystem_SystemComponents(),
				 CimFactory.eINSTANCE.createLANEndpoint()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getSystem_SystemComponents(),
				 CimFactory.eINSTANCE.createOSPFProtocolEndpointBase()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getSystem_SystemComponents(),
				 CimFactory.eINSTANCE.createOSPFVirtualInterface()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getSystem_SystemComponents(),
				 CimFactory.eINSTANCE.createOSPFProtocolEndpoint()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getSystem_SystemComponents(),
				 CimFactory.eINSTANCE.createBGPProtocolEndpoint()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getSystem_SystemComponents(),
				 CimFactory.eINSTANCE.createIPProtocolEndpoint()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getSystem_SystemComponents(),
				 CimFactory.eINSTANCE.createIPXProtocolEndpoint()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getSystem_SystemComponents(),
				 CimFactory.eINSTANCE.createMPLSProtocolEndpoint()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getSystem_SystemComponents(),
				 CimFactory.eINSTANCE.createSwitchPort()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getSystem_SystemComponents(),
				 CimFactory.eINSTANCE.createTCPProtocolEndpoint()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getSystem_SystemComponents(),
				 CimFactory.eINSTANCE.createUDPProtocolEndpoint()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getSystem_SystemComponents(),
				 CimFactory.eINSTANCE.createCLPSettingData()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getSystem_SystemComponents(),
				 CimFactory.eINSTANCE.createTelnetSettingData()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getSystem_SystemComponents(),
				 CimFactory.eINSTANCE.createSSHSettingData()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getSystem_SystemComponents(),
				 CimFactory.eINSTANCE.createDHCPCapabilities()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getSystem_SystemComponents(),
				 CimFactory.eINSTANCE.createDHCPProtocolEndpoint()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getSystem_SystemComponents(),
				 CimFactory.eINSTANCE.createTelnetProtocolEndpoint()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getSystem_SystemComponents(),
				 CimFactory.eINSTANCE.createDNSProtocolEndpoint()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getSystem_SystemComponents(),
				 CimFactory.eINSTANCE.createIPAssignmentSettingData()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getSystem_SystemComponents(),
				 CimFactory.eINSTANCE.createDNSSettingData()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getSystem_SystemComponents(),
				 CimFactory.eINSTANCE.createWirelessLANEndpoint()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getSystem_SystemComponents(),
				 CimFactory.eINSTANCE.createWiFiEndPoint()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getSystem_SystemComponents(),
				 CimFactory.eINSTANCE.createWiFiEndpointSettings()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getSystem_SystemComponents(),
				 CimFactory.eINSTANCE.createProtocolService()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getSystem_SystemComponents(),
				 CimFactory.eINSTANCE.createConditioningService()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getSystem_SystemComponents(),
				 CimFactory.eINSTANCE.createQoSService()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getSystem_SystemComponents(),
				 CimFactory.eINSTANCE.createPrecedenceService()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getSystem_SystemComponents(),
				 CimFactory.eINSTANCE.createDiffServService()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getSystem_SystemComponents(),
				 CimFactory.eINSTANCE.createEFService()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getSystem_SystemComponents(),
				 CimFactory.eINSTANCE.createAFService()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getSystem_SystemComponents(),
				 CimFactory.eINSTANCE.createHdr8021PService()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getSystem_SystemComponents(),
				 CimFactory.eINSTANCE.createDropThresholdCalculationService()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getSystem_SystemComponents(),
				 CimFactory.eINSTANCE.createFlowService()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getSystem_SystemComponents(),
				 CimFactory.eINSTANCE.createNextHopIPRoute()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getSystem_SystemComponents(),
				 CimFactory.eINSTANCE.createAdministrativeDistance()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getSystem_SystemComponents(),
				 CimFactory.eINSTANCE.createNextHopRouting()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getSystem_SystemComponents(),
				 CimFactory.eINSTANCE.createRoutingPolicy()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getSystem_SystemComponents(),
				 CimFactory.eINSTANCE.createForwardingService()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getSystem_SystemComponents(),
				 CimFactory.eINSTANCE.createRoutingProtocolDomain()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getSystem_SystemComponents(),
				 CimFactory.eINSTANCE.createNATService()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getSystem_SystemComponents(),
				 CimFactory.eINSTANCE.createNATStaticSettings()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getSystem_SystemComponents(),
				 CimFactory.eINSTANCE.createNATListBasedSettings()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getSystem_SystemComponents(),
				 CimFactory.eINSTANCE.createSNMPCommunityStrings()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getSystem_SystemComponents(),
				 CimFactory.eINSTANCE.createSNMPService()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getSystem_SystemComponents(),
				 CimFactory.eINSTANCE.createSNMPTrapTarget()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getSystem_Roles(),
				 CimFactory.eINSTANCE.createRole()));
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
