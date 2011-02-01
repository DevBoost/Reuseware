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

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import es.tid.cim.CIM_Model;
import es.tid.cim.CimFactory;
import es.tid.cim.CimPackage;

/**
 * This is the item provider adapter for a {@link es.tid.cim.CIM_Model} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CIM_ModelItemProvider
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
	public CIM_ModelItemProvider(AdapterFactory adapterFactory) {
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

		}
		return itemPropertyDescriptors;
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
			childrenFeatures.add(CimPackage.eINSTANCE.getCIM_Model_Elements());
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
	 * This returns CIM_Model.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/CIM_Model"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_CIM_Model_type");
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

		switch (notification.getFeatureID(CIM_Model.class)) {
			case CimPackage.CIM_MODEL__ELEMENTS:
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
				(CimPackage.eINSTANCE.getCIM_Model_Elements(),
				 CimFactory.eINSTANCE.createBGPCluster()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getCIM_Model_Elements(),
				 CimFactory.eINSTANCE.createBGPPeerGroup()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getCIM_Model_Elements(),
				 CimFactory.eINSTANCE.createBGPService()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getCIM_Model_Elements(),
				 CimFactory.eINSTANCE.createAdminDomain()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getCIM_Model_Elements(),
				 CimFactory.eINSTANCE.createAutonomousSystem()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getCIM_Model_Elements(),
				 CimFactory.eINSTANCE.createNetwork()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getCIM_Model_Elements(),
				 CimFactory.eINSTANCE.createComputerSystem()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getCIM_Model_Elements(),
				 CimFactory.eINSTANCE.createDirectory()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getCIM_Model_Elements(),
				 CimFactory.eINSTANCE.createLogicalFile()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getCIM_Model_Elements(),
				 CimFactory.eINSTANCE.createUnitaryComputerSystem()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getCIM_Model_Elements(),
				 CimFactory.eINSTANCE.createArchitectureCheck()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getCIM_Model_Elements(),
				 CimFactory.eINSTANCE.createApplicationSystem()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getCIM_Model_Elements(),
				 CimFactory.eINSTANCE.createSoftwareElement()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getCIM_Model_Elements(),
				 CimFactory.eINSTANCE.createBIOSElement()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getCIM_Model_Elements(),
				 CimFactory.eINSTANCE.createSoftwareFeature()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getCIM_Model_Elements(),
				 CimFactory.eINSTANCE.createBIOSFeature()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getCIM_Model_Elements(),
				 CimFactory.eINSTANCE.createCreateDirectoryAction()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getCIM_Model_Elements(),
				 CimFactory.eINSTANCE.createCopyFileAction()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getCIM_Model_Elements(),
				 CimFactory.eINSTANCE.createDirectorySpecification()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getCIM_Model_Elements(),
				 CimFactory.eINSTANCE.createDiskSpaceCheck()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getCIM_Model_Elements(),
				 CimFactory.eINSTANCE.createExecuteProgram()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getCIM_Model_Elements(),
				 CimFactory.eINSTANCE.createFileSpecification()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getCIM_Model_Elements(),
				 CimFactory.eINSTANCE.createInstalledProduct()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getCIM_Model_Elements(),
				 CimFactory.eINSTANCE.createMemoryCheck()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getCIM_Model_Elements(),
				 CimFactory.eINSTANCE.createModifySettingAction()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getCIM_Model_Elements(),
				 CimFactory.eINSTANCE.createOperatingSystem()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getCIM_Model_Elements(),
				 CimFactory.eINSTANCE.createOSVersionCheck()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getCIM_Model_Elements(),
				 CimFactory.eINSTANCE.createRebootAction()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getCIM_Model_Elements(),
				 CimFactory.eINSTANCE.createRemoveFileAction()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getCIM_Model_Elements(),
				 CimFactory.eINSTANCE.createRemoveDirectoryAction()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getCIM_Model_Elements(),
				 CimFactory.eINSTANCE.createSettingCheck()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getCIM_Model_Elements(),
				 CimFactory.eINSTANCE.createSoftwareElementVersionCheck()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getCIM_Model_Elements(),
				 CimFactory.eINSTANCE.createSwapSpaceCheck()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getCIM_Model_Elements(),
				 CimFactory.eINSTANCE.createVersionCompatibilityCheck()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getCIM_Model_Elements(),
				 CimFactory.eINSTANCE.createBufferPool()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getCIM_Model_Elements(),
				 CimFactory.eINSTANCE.createConnectivityMemberhipSettingData()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getCIM_Model_Elements(),
				 CimFactory.eINSTANCE.createSystemSpecificCollection()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getCIM_Model_Elements(),
				 CimFactory.eINSTANCE.createConnectivityCollection()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getCIM_Model_Elements(),
				 CimFactory.eINSTANCE.createNamedAddressCollection()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getCIM_Model_Elements(),
				 CimFactory.eINSTANCE.createRangeOfIPAddresses()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getCIM_Model_Elements(),
				 CimFactory.eINSTANCE.createLANConnectivitySegment()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getCIM_Model_Elements(),
				 CimFactory.eINSTANCE.createIPConnectivitySubnet()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getCIM_Model_Elements(),
				 CimFactory.eINSTANCE.createIPXConnectivityNetwork()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getCIM_Model_Elements(),
				 CimFactory.eINSTANCE.createIPAddressRange()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getCIM_Model_Elements(),
				 CimFactory.eINSTANCE.createLogicalNetwork()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getCIM_Model_Elements(),
				 CimFactory.eINSTANCE.createIPXNetwork()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getCIM_Model_Elements(),
				 CimFactory.eINSTANCE.createLANSegment()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getCIM_Model_Elements(),
				 CimFactory.eINSTANCE.createIPSubnet()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getCIM_Model_Elements(),
				 CimFactory.eINSTANCE.createElementSettingData()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getCIM_Model_Elements(),
				 CimFactory.eINSTANCE.createEnabledLogicalElementCapabilities()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getCIM_Model_Elements(),
				 CimFactory.eINSTANCE.createGenericService()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getCIM_Model_Elements(),
				 CimFactory.eINSTANCE.createPowerManagementCapabilities()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getCIM_Model_Elements(),
				 CimFactory.eINSTANCE.createProduct()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getCIM_Model_Elements(),
				 CimFactory.eINSTANCE.createProtocolEndpoint()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getCIM_Model_Elements(),
				 CimFactory.eINSTANCE.createRemoteServiceAccessPoint()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getCIM_Model_Elements(),
				 CimFactory.eINSTANCE.createRemotePort()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getCIM_Model_Elements(),
				 CimFactory.eINSTANCE.createServiceAccessURI()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getCIM_Model_Elements(),
				 CimFactory.eINSTANCE.createSoftwareIdentity()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getCIM_Model_Elements(),
				 CimFactory.eINSTANCE.createStorageExtent()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getCIM_Model_Elements(),
				 CimFactory.eINSTANCE.createMemory()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getCIM_Model_Elements(),
				 CimFactory.eINSTANCE.createVolatileStorage()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getCIM_Model_Elements(),
				 CimFactory.eINSTANCE.createUSBDevice()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getCIM_Model_Elements(),
				 CimFactory.eINSTANCE.createFilterList()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getCIM_Model_Elements(),
				 CimFactory.eINSTANCE.createFilterEntry()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getCIM_Model_Elements(),
				 CimFactory.eINSTANCE.createIPHeadersFilter()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getCIM_Model_Elements(),
				 CimFactory.eINSTANCE.createLogicalPort()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getCIM_Model_Elements(),
				 CimFactory.eINSTANCE.createNetworkPort()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getCIM_Model_Elements(),
				 CimFactory.eINSTANCE.createEthernetPort()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getCIM_Model_Elements(),
				 CimFactory.eINSTANCE.createLogicalModule()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getCIM_Model_Elements(),
				 CimFactory.eINSTANCE.createUSBPort()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getCIM_Model_Elements(),
				 CimFactory.eINSTANCE.createWirelessPort()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getCIM_Model_Elements(),
				 CimFactory.eINSTANCE.createWiFiPort()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getCIM_Model_Elements(),
				 CimFactory.eINSTANCE.createDSLModem()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getCIM_Model_Elements(),
				 CimFactory.eINSTANCE.createADSLModem()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getCIM_Model_Elements(),
				 CimFactory.eINSTANCE.createCableModem()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getCIM_Model_Elements(),
				 CimFactory.eINSTANCE.createISDNModem()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getCIM_Model_Elements(),
				 CimFactory.eINSTANCE.createHDSLModem()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getCIM_Model_Elements(),
				 CimFactory.eINSTANCE.createSDSLModem()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getCIM_Model_Elements(),
				 CimFactory.eINSTANCE.createVDSLModem()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getCIM_Model_Elements(),
				 CimFactory.eINSTANCE.createPOTSModem()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getCIM_Model_Elements(),
				 CimFactory.eINSTANCE.createUniModem()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getCIM_Model_Elements(),
				 CimFactory.eINSTANCE.createReplacementSet()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getCIM_Model_Elements(),
				 CimFactory.eINSTANCE.createMemoryCapacity()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getCIM_Model_Elements(),
				 CimFactory.eINSTANCE.createLANEndpoint()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getCIM_Model_Elements(),
				 CimFactory.eINSTANCE.createOSPFProtocolEndpointBase()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getCIM_Model_Elements(),
				 CimFactory.eINSTANCE.createOSPFVirtualInterface()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getCIM_Model_Elements(),
				 CimFactory.eINSTANCE.createOSPFProtocolEndpoint()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getCIM_Model_Elements(),
				 CimFactory.eINSTANCE.createBGPProtocolEndpoint()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getCIM_Model_Elements(),
				 CimFactory.eINSTANCE.createIPProtocolEndpoint()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getCIM_Model_Elements(),
				 CimFactory.eINSTANCE.createIPXProtocolEndpoint()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getCIM_Model_Elements(),
				 CimFactory.eINSTANCE.createMPLSProtocolEndpoint()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getCIM_Model_Elements(),
				 CimFactory.eINSTANCE.createSwitchPort()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getCIM_Model_Elements(),
				 CimFactory.eINSTANCE.createTCPProtocolEndpoint()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getCIM_Model_Elements(),
				 CimFactory.eINSTANCE.createUDPProtocolEndpoint()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getCIM_Model_Elements(),
				 CimFactory.eINSTANCE.createCLPSettingData()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getCIM_Model_Elements(),
				 CimFactory.eINSTANCE.createTelnetSettingData()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getCIM_Model_Elements(),
				 CimFactory.eINSTANCE.createSSHSettingData()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getCIM_Model_Elements(),
				 CimFactory.eINSTANCE.createDHCPCapabilities()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getCIM_Model_Elements(),
				 CimFactory.eINSTANCE.createDHCPProtocolEndpoint()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getCIM_Model_Elements(),
				 CimFactory.eINSTANCE.createTelnetProtocolEndpoint()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getCIM_Model_Elements(),
				 CimFactory.eINSTANCE.createDNSProtocolEndpoint()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getCIM_Model_Elements(),
				 CimFactory.eINSTANCE.createIPAssignmentSettingData()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getCIM_Model_Elements(),
				 CimFactory.eINSTANCE.createDNSSettingData()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getCIM_Model_Elements(),
				 CimFactory.eINSTANCE.createWirelessLANEndpoint()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getCIM_Model_Elements(),
				 CimFactory.eINSTANCE.createWiFiEndPoint()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getCIM_Model_Elements(),
				 CimFactory.eINSTANCE.createWiFiEndpointSettings()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getCIM_Model_Elements(),
				 CimFactory.eINSTANCE.createProtocolService()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getCIM_Model_Elements(),
				 CimFactory.eINSTANCE.createConditioningService()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getCIM_Model_Elements(),
				 CimFactory.eINSTANCE.createQoSService()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getCIM_Model_Elements(),
				 CimFactory.eINSTANCE.createPrecedenceService()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getCIM_Model_Elements(),
				 CimFactory.eINSTANCE.createDiffServService()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getCIM_Model_Elements(),
				 CimFactory.eINSTANCE.createEFService()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getCIM_Model_Elements(),
				 CimFactory.eINSTANCE.createAFService()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getCIM_Model_Elements(),
				 CimFactory.eINSTANCE.createHdr8021PService()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getCIM_Model_Elements(),
				 CimFactory.eINSTANCE.createDropThresholdCalculationService()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getCIM_Model_Elements(),
				 CimFactory.eINSTANCE.createFlowService()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getCIM_Model_Elements(),
				 CimFactory.eINSTANCE.createNextHopIPRoute()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getCIM_Model_Elements(),
				 CimFactory.eINSTANCE.createAdministrativeDistance()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getCIM_Model_Elements(),
				 CimFactory.eINSTANCE.createNextHopRouting()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getCIM_Model_Elements(),
				 CimFactory.eINSTANCE.createRoutingPolicy()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getCIM_Model_Elements(),
				 CimFactory.eINSTANCE.createForwardingService()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getCIM_Model_Elements(),
				 CimFactory.eINSTANCE.createRoutingProtocolDomain()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getCIM_Model_Elements(),
				 CimFactory.eINSTANCE.createNATService()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getCIM_Model_Elements(),
				 CimFactory.eINSTANCE.createNATStaticSettings()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getCIM_Model_Elements(),
				 CimFactory.eINSTANCE.createNATListBasedSettings()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getCIM_Model_Elements(),
				 CimFactory.eINSTANCE.createSNMPCommunityStrings()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getCIM_Model_Elements(),
				 CimFactory.eINSTANCE.createSNMPService()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getCIM_Model_Elements(),
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
