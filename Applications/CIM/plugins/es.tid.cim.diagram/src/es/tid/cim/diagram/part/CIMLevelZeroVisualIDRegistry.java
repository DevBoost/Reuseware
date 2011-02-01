package es.tid.cim.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;

import es.tid.cim.CIM_Model;
import es.tid.cim.CimPackage;
import es.tid.cim.diagram.edit.parts.*;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class CIMLevelZeroVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "levelZero.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (CIM_ModelEditPart.MODEL_ID.equals(view.getType())) {
				return CIM_ModelEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return es.tid.cim.diagram.part.CIMLevelZeroVisualIDRegistry.getVisualID(view
				.getType());
	}

	/**
	 * @generated
	 */
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	 * @generated
	 */
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(
					Platform.getDebugOption(DEBUG_KEY))) {
				CIMLevelZeroDiagramEditorPlugin.getInstance().logError(
						"Unable to parse view type as a visualID number: "
								+ type);
			}
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static String getType(int visualID) {
		return String.valueOf(visualID);
	}

	/**
	 * @generated
	 */
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (CimPackage.eINSTANCE.getCIM_Model().isSuperTypeOf(
				domainElement.eClass())
				&& isDiagram((CIM_Model) domainElement)) {
			return CIM_ModelEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = es.tid.cim.diagram.part.CIMLevelZeroVisualIDRegistry
				.getModelID(containerView);
		if (!CIM_ModelEditPart.MODEL_ID.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (CIM_ModelEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = es.tid.cim.diagram.part.CIMLevelZeroVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = CIM_ModelEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case CIM_ModelEditPart.VISUAL_ID:
			if (CimPackage.eINSTANCE.getUSBDevice().isSuperTypeOf(
					domainElement.eClass())) {
				return USBDeviceEditPart.VISUAL_ID;
			}
			if (CimPackage.eINSTANCE.getOSPFVirtualInterface().isSuperTypeOf(
					domainElement.eClass())) {
				return OSPFVirtualInterfaceEditPart.VISUAL_ID;
			}
			if (CimPackage.eINSTANCE.getWiFiPort().isSuperTypeOf(
					domainElement.eClass())) {
				return WiFiPortEditPart.VISUAL_ID;
			}
			if (CimPackage.eINSTANCE.getProtocolService().isSuperTypeOf(
					domainElement.eClass())) {
				return ProtocolServiceEditPart.VISUAL_ID;
			}
			if (CimPackage.eINSTANCE.getRoutingPolicy().isSuperTypeOf(
					domainElement.eClass())) {
				return RoutingPolicyEditPart.VISUAL_ID;
			}
			if (CimPackage.eINSTANCE.getEnabledLogicalElementCapabilities()
					.isSuperTypeOf(domainElement.eClass())) {
				return EnabledLogicalElementCapabilitiesEditPart.VISUAL_ID;
			}
			if (CimPackage.eINSTANCE.getBufferPool().isSuperTypeOf(
					domainElement.eClass())) {
				return BufferPoolEditPart.VISUAL_ID;
			}
			if (CimPackage.eINSTANCE.getMPLSProtocolEndpoint().isSuperTypeOf(
					domainElement.eClass())) {
				return MPLSProtocolEndpointEditPart.VISUAL_ID;
			}
			if (CimPackage.eINSTANCE.getAutonomousSystem().isSuperTypeOf(
					domainElement.eClass())) {
				return AutonomousSystemEditPart.VISUAL_ID;
			}
			if (CimPackage.eINSTANCE.getDNSSettingData().isSuperTypeOf(
					domainElement.eClass())) {
				return DNSSettingDataEditPart.VISUAL_ID;
			}
			if (CimPackage.eINSTANCE.getUniModem().isSuperTypeOf(
					domainElement.eClass())) {
				return UniModemEditPart.VISUAL_ID;
			}
			if (CimPackage.eINSTANCE.getEFService().isSuperTypeOf(
					domainElement.eClass())) {
				return EFServiceEditPart.VISUAL_ID;
			}
			if (CimPackage.eINSTANCE.getIPSubnet().isSuperTypeOf(
					domainElement.eClass())) {
				return IPSubnetEditPart.VISUAL_ID;
			}
			if (CimPackage.eINSTANCE.getNamedAddressCollection().isSuperTypeOf(
					domainElement.eClass())) {
				return NamedAddressCollectionEditPart.VISUAL_ID;
			}
			if (CimPackage.eINSTANCE.getBIOSElement().isSuperTypeOf(
					domainElement.eClass())) {
				return BIOSElementEditPart.VISUAL_ID;
			}
			if (CimPackage.eINSTANCE.getTelnetSettingData().isSuperTypeOf(
					domainElement.eClass())) {
				return TelnetSettingDataEditPart.VISUAL_ID;
			}
			if (CimPackage.eINSTANCE.getBGPPeerGroup().isSuperTypeOf(
					domainElement.eClass())) {
				return BGPPeerGroupEditPart.VISUAL_ID;
			}
			if (CimPackage.eINSTANCE.getLANConnectivitySegment().isSuperTypeOf(
					domainElement.eClass())) {
				return LANConnectivitySegmentEditPart.VISUAL_ID;
			}
			if (CimPackage.eINSTANCE.getCableModem().isSuperTypeOf(
					domainElement.eClass())) {
				return CableModemEditPart.VISUAL_ID;
			}
			if (CimPackage.eINSTANCE.getSwitchPort().isSuperTypeOf(
					domainElement.eClass())) {
				return SwitchPortEditPart.VISUAL_ID;
			}
			if (CimPackage.eINSTANCE.getTCPProtocolEndpoint().isSuperTypeOf(
					domainElement.eClass())) {
				return TCPProtocolEndpointEditPart.VISUAL_ID;
			}
			if (CimPackage.eINSTANCE.getAdministrativeDistance().isSuperTypeOf(
					domainElement.eClass())) {
				return AdministrativeDistanceEditPart.VISUAL_ID;
			}
			if (CimPackage.eINSTANCE.getIPConnectivitySubnet().isSuperTypeOf(
					domainElement.eClass())) {
				return IPConnectivitySubnetEditPart.VISUAL_ID;
			}
			if (CimPackage.eINSTANCE.getVolatileStorage().isSuperTypeOf(
					domainElement.eClass())) {
				return VolatileStorageEditPart.VISUAL_ID;
			}
			if (CimPackage.eINSTANCE.getRangeOfIPAddresses().isSuperTypeOf(
					domainElement.eClass())) {
				return RangeOfIPAddressesEditPart.VISUAL_ID;
			}
			if (CimPackage.eINSTANCE.getBGPProtocolEndpoint().isSuperTypeOf(
					domainElement.eClass())) {
				return BGPProtocolEndpointEditPart.VISUAL_ID;
			}
			if (CimPackage.eINSTANCE.getUnitaryComputerSystem().isSuperTypeOf(
					domainElement.eClass())) {
				return UnitaryComputerSystemEditPart.VISUAL_ID;
			}
			if (CimPackage.eINSTANCE.getEthernetPort().isSuperTypeOf(
					domainElement.eClass())) {
				return EthernetPortEditPart.VISUAL_ID;
			}
			if (CimPackage.eINSTANCE.getSNMPService().isSuperTypeOf(
					domainElement.eClass())) {
				return SNMPServiceEditPart.VISUAL_ID;
			}
			if (CimPackage.eINSTANCE.getLogicalModule().isSuperTypeOf(
					domainElement.eClass())) {
				return LogicalModuleEditPart.VISUAL_ID;
			}
			if (CimPackage.eINSTANCE.getNextHopIPRoute().isSuperTypeOf(
					domainElement.eClass())) {
				return NextHopIPRouteEditPart.VISUAL_ID;
			}
			if (CimPackage.eINSTANCE.getOperatingSystem().isSuperTypeOf(
					domainElement.eClass())) {
				return OperatingSystemEditPart.VISUAL_ID;
			}
			if (CimPackage.eINSTANCE.getSDSLModem().isSuperTypeOf(
					domainElement.eClass())) {
				return SDSLModemEditPart.VISUAL_ID;
			}
			if (CimPackage.eINSTANCE.getWiFiEndPoint().isSuperTypeOf(
					domainElement.eClass())) {
				return WiFiEndPointEditPart.VISUAL_ID;
			}
			if (CimPackage.eINSTANCE.getNATService().isSuperTypeOf(
					domainElement.eClass())) {
				return NATServiceEditPart.VISUAL_ID;
			}
			if (CimPackage.eINSTANCE.getADSLModem().isSuperTypeOf(
					domainElement.eClass())) {
				return ADSLModemEditPart.VISUAL_ID;
			}
			if (CimPackage.eINSTANCE.getLogicalFile().isSuperTypeOf(
					domainElement.eClass())) {
				return LogicalFileEditPart.VISUAL_ID;
			}
			if (CimPackage.eINSTANCE.getBGPCluster().isSuperTypeOf(
					domainElement.eClass())) {
				return BGPClusterEditPart.VISUAL_ID;
			}
			if (CimPackage.eINSTANCE.getApplicationSystem().isSuperTypeOf(
					domainElement.eClass())) {
				return ApplicationSystemEditPart.VISUAL_ID;
			}
			if (CimPackage.eINSTANCE.getSoftwareIdentity().isSuperTypeOf(
					domainElement.eClass())) {
				return SoftwareIdentityEditPart.VISUAL_ID;
			}
			if (CimPackage.eINSTANCE.getWirelessPort().isSuperTypeOf(
					domainElement.eClass())) {
				return WirelessPortEditPart.VISUAL_ID;
			}
			if (CimPackage.eINSTANCE.getCLPSettingData().isSuperTypeOf(
					domainElement.eClass())) {
				return CLPSettingDataEditPart.VISUAL_ID;
			}
			if (CimPackage.eINSTANCE.getGenericService().isSuperTypeOf(
					domainElement.eClass())) {
				return GenericServiceEditPart.VISUAL_ID;
			}
			if (CimPackage.eINSTANCE.getNATListBasedSettings().isSuperTypeOf(
					domainElement.eClass())) {
				return NATListBasedSettingsEditPart.VISUAL_ID;
			}
			if (CimPackage.eINSTANCE.getVDSLModem().isSuperTypeOf(
					domainElement.eClass())) {
				return VDSLModemEditPart.VISUAL_ID;
			}
			if (CimPackage.eINSTANCE.getUSBPort().isSuperTypeOf(
					domainElement.eClass())) {
				return USBPortEditPart.VISUAL_ID;
			}
			if (CimPackage.eINSTANCE.getDNSProtocolEndpoint().isSuperTypeOf(
					domainElement.eClass())) {
				return DNSProtocolEndpointEditPart.VISUAL_ID;
			}
			if (CimPackage.eINSTANCE.getWiFiEndpointSettings().isSuperTypeOf(
					domainElement.eClass())) {
				return WiFiEndpointSettingsEditPart.VISUAL_ID;
			}
			if (CimPackage.eINSTANCE.getSSHSettingData().isSuperTypeOf(
					domainElement.eClass())) {
				return SSHSettingDataEditPart.VISUAL_ID;
			}
			if (CimPackage.eINSTANCE.getWirelessLANEndpoint().isSuperTypeOf(
					domainElement.eClass())) {
				return WirelessLANEndpointEditPart.VISUAL_ID;
			}
			if (CimPackage.eINSTANCE.getDHCPProtocolEndpoint().isSuperTypeOf(
					domainElement.eClass())) {
				return DHCPProtocolEndpointEditPart.VISUAL_ID;
			}
			if (CimPackage.eINSTANCE.getIPHeadersFilter().isSuperTypeOf(
					domainElement.eClass())) {
				return IPHeadersFilterEditPart.VISUAL_ID;
			}
			if (CimPackage.eINSTANCE.getDirectory().isSuperTypeOf(
					domainElement.eClass())) {
				return DirectoryEditPart.VISUAL_ID;
			}
			if (CimPackage.eINSTANCE.getIPAddressRange().isSuperTypeOf(
					domainElement.eClass())) {
				return IPAddressRangeEditPart.VISUAL_ID;
			}
			if (CimPackage.eINSTANCE.getSNMPTrapTarget().isSuperTypeOf(
					domainElement.eClass())) {
				return SNMPTrapTargetEditPart.VISUAL_ID;
			}
			if (CimPackage.eINSTANCE.getIPXConnectivityNetwork().isSuperTypeOf(
					domainElement.eClass())) {
				return IPXConnectivityNetworkEditPart.VISUAL_ID;
			}
			if (CimPackage.eINSTANCE.getConnectivityMemberhipSettingData()
					.isSuperTypeOf(domainElement.eClass())) {
				return ConnectivityMemberhipSettingDataEditPart.VISUAL_ID;
			}
			if (CimPackage.eINSTANCE.getConditioningService().isSuperTypeOf(
					domainElement.eClass())) {
				return ConditioningServiceEditPart.VISUAL_ID;
			}
			if (CimPackage.eINSTANCE.getBIOSFeature().isSuperTypeOf(
					domainElement.eClass())) {
				return BIOSFeatureEditPart.VISUAL_ID;
			}
			if (CimPackage.eINSTANCE.getOSPFProtocolEndpoint().isSuperTypeOf(
					domainElement.eClass())) {
				return OSPFProtocolEndpointEditPart.VISUAL_ID;
			}
			if (CimPackage.eINSTANCE.getFilterList().isSuperTypeOf(
					domainElement.eClass())) {
				return FilterListEditPart.VISUAL_ID;
			}
			if (CimPackage.eINSTANCE.getBGPService().isSuperTypeOf(
					domainElement.eClass())) {
				return BGPServiceEditPart.VISUAL_ID;
			}
			if (CimPackage.eINSTANCE.getPrecedenceService().isSuperTypeOf(
					domainElement.eClass())) {
				return PrecedenceServiceEditPart.VISUAL_ID;
			}
			if (CimPackage.eINSTANCE.getDHCPCapabilities().isSuperTypeOf(
					domainElement.eClass())) {
				return DHCPCapabilitiesEditPart.VISUAL_ID;
			}
			if (CimPackage.eINSTANCE.getHdr8021PService().isSuperTypeOf(
					domainElement.eClass())) {
				return Hdr8021PServiceEditPart.VISUAL_ID;
			}
			if (CimPackage.eINSTANCE.getReplacementSet().isSuperTypeOf(
					domainElement.eClass())) {
				return ReplacementSetEditPart.VISUAL_ID;
			}
			if (CimPackage.eINSTANCE.getHDSLModem().isSuperTypeOf(
					domainElement.eClass())) {
				return HDSLModemEditPart.VISUAL_ID;
			}
			if (CimPackage.eINSTANCE.getServiceAccessURI().isSuperTypeOf(
					domainElement.eClass())) {
				return ServiceAccessURIEditPart.VISUAL_ID;
			}
			if (CimPackage.eINSTANCE.getFilterEntry().isSuperTypeOf(
					domainElement.eClass())) {
				return FilterEntryEditPart.VISUAL_ID;
			}
			if (CimPackage.eINSTANCE.getSNMPCommunityStrings().isSuperTypeOf(
					domainElement.eClass())) {
				return SNMPCommunityStringsEditPart.VISUAL_ID;
			}
			if (CimPackage.eINSTANCE.getNetwork().isSuperTypeOf(
					domainElement.eClass())) {
				return NetworkEditPart.VISUAL_ID;
			}
			if (CimPackage.eINSTANCE.getFileSpecification().isSuperTypeOf(
					domainElement.eClass())) {
				return FileSpecificationEditPart.VISUAL_ID;
			}
			if (CimPackage.eINSTANCE.getIPXNetwork().isSuperTypeOf(
					domainElement.eClass())) {
				return IPXNetworkEditPart.VISUAL_ID;
			}
			if (CimPackage.eINSTANCE.getPowerManagementCapabilities()
					.isSuperTypeOf(domainElement.eClass())) {
				return PowerManagementCapabilitiesEditPart.VISUAL_ID;
			}
			if (CimPackage.eINSTANCE.getFlowService().isSuperTypeOf(
					domainElement.eClass())) {
				return FlowServiceEditPart.VISUAL_ID;
			}
			if (CimPackage.eINSTANCE.getISDNModem().isSuperTypeOf(
					domainElement.eClass())) {
				return ISDNModemEditPart.VISUAL_ID;
			}
			if (CimPackage.eINSTANCE.getIPXProtocolEndpoint().isSuperTypeOf(
					domainElement.eClass())) {
				return IPXProtocolEndpointEditPart.VISUAL_ID;
			}
			if (CimPackage.eINSTANCE.getIPProtocolEndpoint().isSuperTypeOf(
					domainElement.eClass())) {
				return IPProtocolEndpointEditPart.VISUAL_ID;
			}
			if (CimPackage.eINSTANCE.getUDPProtocolEndpoint().isSuperTypeOf(
					domainElement.eClass())) {
				return UDPProtocolEndpointEditPart.VISUAL_ID;
			}
			if (CimPackage.eINSTANCE.getProduct().isSuperTypeOf(
					domainElement.eClass())) {
				return ProductEditPart.VISUAL_ID;
			}
			if (CimPackage.eINSTANCE.getMemoryCapacity().isSuperTypeOf(
					domainElement.eClass())) {
				return MemoryCapacityEditPart.VISUAL_ID;
			}
			if (CimPackage.eINSTANCE.getRoutingProtocolDomain().isSuperTypeOf(
					domainElement.eClass())) {
				return RoutingProtocolDomainEditPart.VISUAL_ID;
			}
			if (CimPackage.eINSTANCE.getAFService().isSuperTypeOf(
					domainElement.eClass())) {
				return AFServiceEditPart.VISUAL_ID;
			}
			if (CimPackage.eINSTANCE.getLANSegment().isSuperTypeOf(
					domainElement.eClass())) {
				return LANSegmentEditPart.VISUAL_ID;
			}
			if (CimPackage.eINSTANCE.getNATStaticSettings().isSuperTypeOf(
					domainElement.eClass())) {
				return NATStaticSettingsEditPart.VISUAL_ID;
			}
			if (CimPackage.eINSTANCE.getTelnetProtocolEndpoint().isSuperTypeOf(
					domainElement.eClass())) {
				return TelnetProtocolEndpointEditPart.VISUAL_ID;
			}
			if (CimPackage.eINSTANCE.getLANEndpoint().isSuperTypeOf(
					domainElement.eClass())) {
				return LANEndpointEditPart.VISUAL_ID;
			}
			if (CimPackage.eINSTANCE.getDropThresholdCalculationService()
					.isSuperTypeOf(domainElement.eClass())) {
				return DropThresholdCalculationServiceEditPart.VISUAL_ID;
			}
			if (CimPackage.eINSTANCE.getAdminDomain().isSuperTypeOf(
					domainElement.eClass())) {
				return AdminDomainEditPart.VISUAL_ID;
			}
			if (CimPackage.eINSTANCE.getSystemSpecificCollection()
					.isSuperTypeOf(domainElement.eClass())) {
				return SystemSpecificCollectionEditPart.VISUAL_ID;
			}
			if (CimPackage.eINSTANCE.getNextHopRouting().isSuperTypeOf(
					domainElement.eClass())) {
				return NextHopRoutingEditPart.VISUAL_ID;
			}
			if (CimPackage.eINSTANCE.getComputerSystem().isSuperTypeOf(
					domainElement.eClass())) {
				return ComputerSystemEditPart.VISUAL_ID;
			}
			if (CimPackage.eINSTANCE.getNetworkPort().isSuperTypeOf(
					domainElement.eClass())) {
				return NetworkPortEditPart.VISUAL_ID;
			}
			if (CimPackage.eINSTANCE.getRemoteServiceAccessPoint()
					.isSuperTypeOf(domainElement.eClass())) {
				return RemoteServiceAccessPointEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = es.tid.cim.diagram.part.CIMLevelZeroVisualIDRegistry
				.getModelID(containerView);
		if (!CIM_ModelEditPart.MODEL_ID.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (CIM_ModelEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = es.tid.cim.diagram.part.CIMLevelZeroVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = CIM_ModelEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case USBDeviceEditPart.VISUAL_ID:
			if (USBDeviceElementNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WrappingLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case OSPFVirtualInterfaceEditPart.VISUAL_ID:
			if (OSPFVirtualInterfaceElementNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WrappingLabel2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case WiFiPortEditPart.VISUAL_ID:
			if (WiFiPortElementNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WrappingLabel3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ProtocolServiceEditPart.VISUAL_ID:
			if (ProtocolServiceElementNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WrappingLabel4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RoutingPolicyEditPart.VISUAL_ID:
			if (RoutingPolicyElementNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WrappingLabel5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case EnabledLogicalElementCapabilitiesEditPart.VISUAL_ID:
			if (EnabledLogicalElementCapabilitiesElementNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WrappingLabel6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case BufferPoolEditPart.VISUAL_ID:
			if (BufferPoolElementNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WrappingLabel7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MPLSProtocolEndpointEditPart.VISUAL_ID:
			if (MPLSProtocolEndpointElementNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WrappingLabel8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AutonomousSystemEditPart.VISUAL_ID:
			if (AutonomousSystemElementNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WrappingLabel9EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DNSSettingDataEditPart.VISUAL_ID:
			if (DNSSettingDataElementNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WrappingLabel10EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case UniModemEditPart.VISUAL_ID:
			if (UniModemElementNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WrappingLabel11EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case EFServiceEditPart.VISUAL_ID:
			if (EFServiceElementNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WrappingLabel12EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case IPSubnetEditPart.VISUAL_ID:
			if (IPSubnetElementNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WrappingLabel13EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case NamedAddressCollectionEditPart.VISUAL_ID:
			if (NamedAddressCollectionElementNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WrappingLabel14EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case BIOSElementEditPart.VISUAL_ID:
			if (BIOSElementElementNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WrappingLabel15EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TelnetSettingDataEditPart.VISUAL_ID:
			if (TelnetSettingDataElementNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WrappingLabel16EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case BGPPeerGroupEditPart.VISUAL_ID:
			if (BGPPeerGroupElementNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WrappingLabel17EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case LANConnectivitySegmentEditPart.VISUAL_ID:
			if (LANConnectivitySegmentElementNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WrappingLabel18EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CableModemEditPart.VISUAL_ID:
			if (CableModemElementNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WrappingLabel19EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SwitchPortEditPart.VISUAL_ID:
			if (SwitchPortElementNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WrappingLabel20EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TCPProtocolEndpointEditPart.VISUAL_ID:
			if (TCPProtocolEndpointElementNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WrappingLabel21EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AdministrativeDistanceEditPart.VISUAL_ID:
			if (AdministrativeDistanceElementNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WrappingLabel22EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case IPConnectivitySubnetEditPart.VISUAL_ID:
			if (IPConnectivitySubnetElementNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WrappingLabel23EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case VolatileStorageEditPart.VISUAL_ID:
			if (VolatileStorageElementNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WrappingLabel24EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RangeOfIPAddressesEditPart.VISUAL_ID:
			if (RangeOfIPAddressesElementNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WrappingLabel25EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case BGPProtocolEndpointEditPart.VISUAL_ID:
			if (BGPProtocolEndpointElementNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WrappingLabel26EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case UnitaryComputerSystemEditPart.VISUAL_ID:
			if (UnitaryComputerSystemElementNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WrappingLabel27EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case EthernetPortEditPart.VISUAL_ID:
			if (EthernetPortElementNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WrappingLabel28EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SNMPServiceEditPart.VISUAL_ID:
			if (SNMPServiceElementNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WrappingLabel29EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case LogicalModuleEditPart.VISUAL_ID:
			if (LogicalModuleElementNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WrappingLabel30EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case NextHopIPRouteEditPart.VISUAL_ID:
			if (NextHopIPRouteElementNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WrappingLabel31EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case OperatingSystemEditPart.VISUAL_ID:
			if (OperatingSystemElementNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WrappingLabel32EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SDSLModemEditPart.VISUAL_ID:
			if (SDSLModemElementNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WrappingLabel33EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case WiFiEndPointEditPart.VISUAL_ID:
			if (WiFiEndPointElementNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WrappingLabel34EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case NATServiceEditPart.VISUAL_ID:
			if (NATServiceElementNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WrappingLabel35EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ADSLModemEditPart.VISUAL_ID:
			if (ADSLModemElementNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WrappingLabel36EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case LogicalFileEditPart.VISUAL_ID:
			if (LogicalFileElementNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WrappingLabel37EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case BGPClusterEditPart.VISUAL_ID:
			if (BGPClusterElementNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WrappingLabel38EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ApplicationSystemEditPart.VISUAL_ID:
			if (ApplicationSystemElementNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WrappingLabel39EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SoftwareIdentityEditPart.VISUAL_ID:
			if (SoftwareIdentityElementNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WrappingLabel40EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case WirelessPortEditPart.VISUAL_ID:
			if (WirelessPortElementNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WrappingLabel41EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CLPSettingDataEditPart.VISUAL_ID:
			if (CLPSettingDataElementNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WrappingLabel42EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case GenericServiceEditPart.VISUAL_ID:
			if (GenericServiceElementNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WrappingLabel43EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case NATListBasedSettingsEditPart.VISUAL_ID:
			if (NATListBasedSettingsElementNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WrappingLabel44EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case VDSLModemEditPart.VISUAL_ID:
			if (VDSLModemElementNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WrappingLabel45EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case USBPortEditPart.VISUAL_ID:
			if (USBPortElementNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WrappingLabel46EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DNSProtocolEndpointEditPart.VISUAL_ID:
			if (DNSProtocolEndpointElementNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WrappingLabel47EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case WiFiEndpointSettingsEditPart.VISUAL_ID:
			if (WiFiEndpointSettingsElementNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WrappingLabel48EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SSHSettingDataEditPart.VISUAL_ID:
			if (SSHSettingDataElementNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WrappingLabel49EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case WirelessLANEndpointEditPart.VISUAL_ID:
			if (WirelessLANEndpointElementNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WrappingLabel50EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DHCPProtocolEndpointEditPart.VISUAL_ID:
			if (DHCPProtocolEndpointElementNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WrappingLabel51EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case IPHeadersFilterEditPart.VISUAL_ID:
			if (IPHeadersFilterElementNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WrappingLabel52EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DirectoryEditPart.VISUAL_ID:
			if (DirectoryElementNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WrappingLabel53EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case IPAddressRangeEditPart.VISUAL_ID:
			if (IPAddressRangeElementNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WrappingLabel54EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SNMPTrapTargetEditPart.VISUAL_ID:
			if (SNMPTrapTargetElementNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WrappingLabel55EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case IPXConnectivityNetworkEditPart.VISUAL_ID:
			if (IPXConnectivityNetworkElementNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WrappingLabel56EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ConnectivityMemberhipSettingDataEditPart.VISUAL_ID:
			if (ConnectivityMemberhipSettingDataElementNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WrappingLabel57EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ConditioningServiceEditPart.VISUAL_ID:
			if (ConditioningServiceElementNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WrappingLabel58EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case BIOSFeatureEditPart.VISUAL_ID:
			if (BIOSFeatureElementNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WrappingLabel59EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case OSPFProtocolEndpointEditPart.VISUAL_ID:
			if (OSPFProtocolEndpointElementNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WrappingLabel60EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case FilterListEditPart.VISUAL_ID:
			if (FilterListElementNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WrappingLabel61EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case BGPServiceEditPart.VISUAL_ID:
			if (BGPServiceElementNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WrappingLabel62EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PrecedenceServiceEditPart.VISUAL_ID:
			if (PrecedenceServiceElementNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WrappingLabel63EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DHCPCapabilitiesEditPart.VISUAL_ID:
			if (DHCPCapabilitiesElementNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WrappingLabel64EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Hdr8021PServiceEditPart.VISUAL_ID:
			if (Hdr8021PServiceElementNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WrappingLabel65EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ReplacementSetEditPart.VISUAL_ID:
			if (ReplacementSetElementNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WrappingLabel66EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case HDSLModemEditPart.VISUAL_ID:
			if (HDSLModemElementNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WrappingLabel67EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ServiceAccessURIEditPart.VISUAL_ID:
			if (ServiceAccessURIElementNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WrappingLabel68EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case FilterEntryEditPart.VISUAL_ID:
			if (FilterEntryElementNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WrappingLabel69EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SNMPCommunityStringsEditPart.VISUAL_ID:
			if (SNMPCommunityStringsElementNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WrappingLabel70EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case NetworkEditPart.VISUAL_ID:
			if (NetworkElementNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WrappingLabel71EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case FileSpecificationEditPart.VISUAL_ID:
			if (FileSpecificationElementNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WrappingLabel72EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case IPXNetworkEditPart.VISUAL_ID:
			if (IPXNetworkElementNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WrappingLabel73EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PowerManagementCapabilitiesEditPart.VISUAL_ID:
			if (PowerManagementCapabilitiesElementNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WrappingLabel74EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case FlowServiceEditPart.VISUAL_ID:
			if (FlowServiceElementNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WrappingLabel75EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ISDNModemEditPart.VISUAL_ID:
			if (ISDNModemElementNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WrappingLabel76EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case IPXProtocolEndpointEditPart.VISUAL_ID:
			if (IPXProtocolEndpointElementNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WrappingLabel77EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case IPProtocolEndpointEditPart.VISUAL_ID:
			if (IPProtocolEndpointElementNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WrappingLabel78EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case UDPProtocolEndpointEditPart.VISUAL_ID:
			if (UDPProtocolEndpointElementNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WrappingLabel79EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ProductEditPart.VISUAL_ID:
			if (ProductElementNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WrappingLabel80EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MemoryCapacityEditPart.VISUAL_ID:
			if (MemoryCapacityElementNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WrappingLabel81EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RoutingProtocolDomainEditPart.VISUAL_ID:
			if (RoutingProtocolDomainElementNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WrappingLabel82EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AFServiceEditPart.VISUAL_ID:
			if (AFServiceElementNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WrappingLabel83EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case LANSegmentEditPart.VISUAL_ID:
			if (LANSegmentElementNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WrappingLabel84EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case NATStaticSettingsEditPart.VISUAL_ID:
			if (NATStaticSettingsElementNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WrappingLabel85EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TelnetProtocolEndpointEditPart.VISUAL_ID:
			if (TelnetProtocolEndpointElementNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WrappingLabel86EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case LANEndpointEditPart.VISUAL_ID:
			if (LANEndpointElementNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WrappingLabel87EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DropThresholdCalculationServiceEditPart.VISUAL_ID:
			if (DropThresholdCalculationServiceElementNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WrappingLabel88EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AdminDomainEditPart.VISUAL_ID:
			if (AdminDomainElementNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WrappingLabel89EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SystemSpecificCollectionEditPart.VISUAL_ID:
			if (SystemSpecificCollectionElementNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WrappingLabel90EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case NextHopRoutingEditPart.VISUAL_ID:
			if (NextHopRoutingElementNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WrappingLabel91EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ComputerSystemEditPart.VISUAL_ID:
			if (ComputerSystemElementNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WrappingLabel92EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case NetworkPortEditPart.VISUAL_ID:
			if (NetworkPortElementNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WrappingLabel93EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RemoteServiceAccessPointEditPart.VISUAL_ID:
			if (RemoteServiceAccessPointElementNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WrappingLabel94EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CIM_ModelEditPart.VISUAL_ID:
			if (USBDeviceEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OSPFVirtualInterfaceEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WiFiPortEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ProtocolServiceEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RoutingPolicyEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EnabledLogicalElementCapabilitiesEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (BufferPoolEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MPLSProtocolEndpointEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AutonomousSystemEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DNSSettingDataEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (UniModemEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EFServiceEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IPSubnetEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (NamedAddressCollectionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (BIOSElementEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TelnetSettingDataEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (BGPPeerGroupEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (LANConnectivitySegmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CableModemEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SwitchPortEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TCPProtocolEndpointEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdministrativeDistanceEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IPConnectivitySubnetEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (VolatileStorageEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RangeOfIPAddressesEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (BGPProtocolEndpointEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (UnitaryComputerSystemEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EthernetPortEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SNMPServiceEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (LogicalModuleEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (NextHopIPRouteEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OperatingSystemEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SDSLModemEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WiFiEndPointEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (NATServiceEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ADSLModemEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (LogicalFileEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (BGPClusterEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ApplicationSystemEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SoftwareIdentityEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WirelessPortEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CLPSettingDataEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (GenericServiceEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (NATListBasedSettingsEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (VDSLModemEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (USBPortEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DNSProtocolEndpointEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WiFiEndpointSettingsEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SSHSettingDataEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WirelessLANEndpointEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DHCPProtocolEndpointEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IPHeadersFilterEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DirectoryEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IPAddressRangeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SNMPTrapTargetEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IPXConnectivityNetworkEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ConnectivityMemberhipSettingDataEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ConditioningServiceEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (BIOSFeatureEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OSPFProtocolEndpointEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (FilterListEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (BGPServiceEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PrecedenceServiceEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DHCPCapabilitiesEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Hdr8021PServiceEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ReplacementSetEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (HDSLModemEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ServiceAccessURIEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (FilterEntryEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SNMPCommunityStringsEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (NetworkEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (FileSpecificationEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IPXNetworkEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PowerManagementCapabilitiesEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (FlowServiceEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ISDNModemEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IPXProtocolEndpointEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IPProtocolEndpointEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (UDPProtocolEndpointEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ProductEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MemoryCapacityEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RoutingProtocolDomainEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AFServiceEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (LANSegmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (NATStaticSettingsEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TelnetProtocolEndpointEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (LANEndpointEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DropThresholdCalculationServiceEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdminDomainEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SystemSpecificCollectionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (NextHopRoutingEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ComputerSystemEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (NetworkPortEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RemoteServiceAccessPointEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DirectorySpecificationDirectorySpecificationFilesEditPart.VISUAL_ID:
			if (WrappingLabel95EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case OperatingSystemOperatingSystemSoftwareFeatureEditPart.VISUAL_ID:
			if (WrappingLabel96EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SoftwareElementSoftwareElementActionsEditPart.VISUAL_ID:
			if (WrappingLabel97EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SoftwareElementSoftwareElementChecksEditPart.VISUAL_ID:
			if (WrappingLabel98EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case InstalledProductSoftwareElementsEditPart.VISUAL_ID:
			if (WrappingLabel99EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case BGPServiceBGPPeerGroupServicesEditPart.VISUAL_ID:
			if (WrappingLabel100EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case BGPClusterReflectorClientServiceEditPart.VISUAL_ID:
			if (WrappingLabel101EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case BGPClusterReflectorNonClientServiceEditPart.VISUAL_ID:
			if (WrappingLabel102EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case BGPClusterReflectorServiceEditPart.VISUAL_ID:
			if (WrappingLabel103EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ServiceAccessPointBindsToEditPart.VISUAL_ID:
			if (WrappingLabel104EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ManagedElementComponentsEditPart.VISUAL_ID:
			if (WrappingLabel105EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AdminDomainContainedDomainEditPart.VISUAL_ID:
			if (WrappingLabel106EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ManagedElementDependenciesEditPart.VISUAL_ID:
			if (WrappingLabel107EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case LogicalDeviceDeviceConnectionEditPart.VISUAL_ID:
			if (WrappingLabel108EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case LogicalDeviceDeviceIdentityEditPart.VISUAL_ID:
			if (WrappingLabel109EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case LogicalDeviceDeviceSAPImplementationEditPart.VISUAL_ID:
			if (WrappingLabel110EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ManagedElementElementCapabilitiesEditPart.VISUAL_ID:
			if (WrappingLabel111EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ManagedElementElementSettingDataEditPart.VISUAL_ID:
			if (WrappingLabel112EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SoftwareIdentityElementSoftwareIdentityEditPart.VISUAL_ID:
			if (WrappingLabel113EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SystemHostedAccessPointEditPart.VISUAL_ID:
			if (WrappingLabel114EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SystemHostedCollectionEditPart.VISUAL_ID:
			if (WrappingLabel115EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ManagedElementHostedDependencyEditPart.VISUAL_ID:
			if (WrappingLabel116EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SystemHostedServicesEditPart.VISUAL_ID:
			if (WrappingLabel117EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ElementSoftwareIdentityManagedElementEditPart.VISUAL_ID:
			if (WrappingLabel118EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ProductProductProductDependencyEditPart.VISUAL_ID:
			if (WrappingLabel119EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ProductProductServiceComponentEditPart.VISUAL_ID:
			if (WrappingLabel120EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case EnabledLogicalElementRemoteAccessAvailableToElementEditPart.VISUAL_ID:
			if (WrappingLabel121EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SystemRolesEditPart.VISUAL_ID:
			if (WrappingLabel122EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ServiceAccessPointSAPSAPDependencyEditPart.VISUAL_ID:
			if (WrappingLabel123EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ServiceServiceAccessBySAPEditPart.VISUAL_ID:
			if (WrappingLabel124EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ServiceServiceComponentsEditPart.VISUAL_ID:
			if (WrappingLabel125EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ServiceServiceServiceDependencyEditPart.VISUAL_ID:
			if (WrappingLabel126EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ElementSettingDataSettingDataEditPart.VISUAL_ID:
			if (WrappingLabel127EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SettingDataSettingsDefineCapabilitiesEditPart.VISUAL_ID:
			if (WrappingLabel128EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ManagedSystemElementStatusDescriptionsEditPart.VISUAL_ID:
			if (WrappingLabel129EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SystemSystemComponentsEditPart.VISUAL_ID:
			if (WrappingLabel130EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SystemSystemDevicesEditPart.VISUAL_ID:
			if (WrappingLabel131EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case LogicalModuleModulePortEditPart.VISUAL_ID:
			if (WrappingLabel132EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AFServiceAFRelatedServicesEditPart.VISUAL_ID:
			if (WrappingLabel133EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case QoSServiceQoSConditioningSubServiceEditPart.VISUAL_ID:
			if (WrappingLabel134EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case QoSServiceQoSSubServiceEditPart.VISUAL_ID:
			if (WrappingLabel135EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CollectionMembersEditPart.VISUAL_ID:
			if (WrappingLabel136EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case NATListBasedSettingsAddressesToBeTranslatedEditPart.VISUAL_ID:
			if (WrappingLabel137EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case BGPServiceBGPAdminDistanceEditPart.VISUAL_ID:
			if (WrappingLabel138EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ServiceAccessPointBindsToLANEndpointEditPart.VISUAL_ID:
			if (WrappingLabel139EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RouteCalculationServiceCalculatesAmongEditPart.VISUAL_ID:
			if (WrappingLabel140EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ProtocolEndpointEgressConditioningServiceOnEndpointEditPart.VISUAL_ID:
			if (WrappingLabel141EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CIM_ModelElementsEditPart.VISUAL_ID:
			if (WrappingLabel142EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ForwardingServiceForwardedRoutesEditPart.VISUAL_ID:
			if (WrappingLabel143EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ForwardingServiceForwardsAmongEditPart.VISUAL_ID:
			if (WrappingLabel144EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ComputerSystemHostedFilterListEditPart.VISUAL_ID:
			if (WrappingLabel145EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ComputerSystemHostedForwardingServicesEditPart.VISUAL_ID:
			if (WrappingLabel146EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SystemHostedRouteEditPart.VISUAL_ID:
			if (WrappingLabel147EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ComputerSystemHostedRoutingPolicyEditPart.VISUAL_ID:
			if (WrappingLabel148EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ProtocolEndpointIngressConditioningServiceOnEndpointEditPart.VISUAL_ID:
			if (WrappingLabel149EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case LogicalNetworkInLogicalNetworkEditPart.VISUAL_ID:
			if (WrappingLabel150EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case LANSegmentInSegmentEditPart.VISUAL_ID:
			if (WrappingLabel151EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case NATServiceNATServiceRunningOnEndpointEditPart.VISUAL_ID:
			if (WrappingLabel152EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AdminDomainNetworksInAdminDomainEditPart.VISUAL_ID:
			if (WrappingLabel153EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case LogicalPortPortImplementsEndPointEditPart.VISUAL_ID:
			if (WrappingLabel154EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case LogicalDevicePortOnDeviceEditPart.VISUAL_ID:
			if (WrappingLabel155EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ForwardingServiceRouteForwardedByServiceEditPart.VISUAL_ID:
			if (WrappingLabel156EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AutonomousSystemRouterInASEditPart.VISUAL_ID:
			if (WrappingLabel157EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case BGPClusterRoutersInBGPClusterEditPart.VISUAL_ID:
			if (WrappingLabel158EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case NextHopRouteRouteUsesEndpointEditPart.VISUAL_ID:
			if (WrappingLabel159EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AutonomousSystemRoutingProtocolDomainInASEditPart.VISUAL_ID:
			if (WrappingLabel160EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ComputerSystemRunningOSEditPart.VISUAL_ID:
			if (WrappingLabel161EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ServiceSoftwareFeatureServiceImplementationEditPart.VISUAL_ID:
			if (WrappingLabel162EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case NATListBasedSettingsTranslationPoolForNATEditPart.VISUAL_ID:
			if (WrappingLabel163EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SNMPServiceTrapSourceForSNMPServiceEditPart.VISUAL_ID:
			if (WrappingLabel164EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case NextHopRouteAssociatedNextHopEditPart.VISUAL_ID:
			if (WrappingLabel165EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(CIM_Model element) {
		return true;
	}

}
