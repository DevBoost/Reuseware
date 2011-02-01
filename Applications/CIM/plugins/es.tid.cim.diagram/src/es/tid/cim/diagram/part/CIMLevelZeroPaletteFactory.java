package es.tid.cim.diagram.part;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeConnectionTool;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;

import es.tid.cim.diagram.providers.CIMLevelZeroElementTypes;

/**
 * @generated
 */
public class CIMLevelZeroPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createDefault1Group());
		paletteRoot.add(createCore2Group());
		paletteRoot.add(createDevices3Group());
		paletteRoot.add(createModems4Group());
		paletteRoot.add(createNetworkSystems5Group());
		paletteRoot.add(createSystem6Group());
		paletteRoot.add(createSNMP7Group());
		paletteRoot.add(createRouting8Group());
		paletteRoot.add(createRoutes9Group());
		paletteRoot.add(createQoS10Group());
		paletteRoot.add(createCollections11Group());
		paletteRoot.add(createLogicalPorts12Group());
		paletteRoot.add(createFiltering13Group());
		paletteRoot.add(createApplication14Group());
		paletteRoot.add(createProtocolService15Group());
		paletteRoot.add(createPhysical16Group());
		paletteRoot.add(createBGP17Group());
		paletteRoot.add(createProtocolEndpoints18Group());
	}

	/**
	 * Creates "Default" palette tool group
	 * @generated
	 */
	private PaletteContainer createDefault1Group() {
		PaletteGroup paletteContainer = new PaletteGroup(
				Messages.Default1Group_title);
		paletteContainer.setDescription(Messages.Default1Group_desc);
		paletteContainer.add(createLinks1CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Core" palette tool group
	 * @generated
	 */
	private PaletteContainer createCore2Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.Core2Group_title);
		paletteContainer.add(createAdminDomain1CreationTool());
		paletteContainer.add(createCapabilities2CreationTool());
		paletteContainer.add(createGenericService3CreationTool());
		paletteContainer.add(createProduct4CreationTool());
		paletteContainer.add(createServiceAccessPoint5CreationTool());
		paletteContainer.add(createSoftwareIdentity6CreationTool());
		paletteContainer.add(createSystemSpecificCollection7CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Devices" palette tool group
	 * @generated
	 */
	private PaletteContainer createDevices3Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.Devices3Group_title);
		paletteContainer.add(createStorageExtent1CreationTool());
		paletteContainer.add(createUSBDevice2CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Modems" palette tool group
	 * @generated
	 */
	private PaletteContainer createModems4Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.Modems4Group_title);
		paletteContainer.add(createCableModemConnectionBased1CreationTool());
		paletteContainer.add(createDSLModemConnectionBased2CreationTool());
		paletteContainer.add(createISDNModemCallBased3CreationTool());
		paletteContainer.add(createPOTSModemCallBased4CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "NetworkSystems" palette tool group
	 * @generated
	 */
	private PaletteContainer createNetworkSystems5Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.NetworkSystems5Group_title);
		paletteContainer.add(createAutonomousSystem1CreationTool());
		paletteContainer.add(createNetwork2CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "System" palette tool group
	 * @generated
	 */
	private PaletteContainer createSystem6Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.System6Group_title);
		paletteContainer.add(createComputerSystem1CreationTool());
		paletteContainer.add(createDirectory2CreationTool());
		paletteContainer.add(createLogicalFile3CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "SNMP" palette tool group
	 * @generated
	 */
	private PaletteContainer createSNMP7Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.SNMP7Group_title);
		paletteContainer.add(createSNMPCommunityStrings1CreationTool());
		paletteContainer.add(createSNMPService2CreationTool());
		paletteContainer.add(createSNMPTrapTarget3CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Routing" palette tool group
	 * @generated
	 */
	private PaletteContainer createRouting8Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.Routing8Group_title);
		paletteContainer
				.add(createForwardingServiceNetworkService1CreationTool());
		paletteContainer.add(createRoutingPolicy2CreationTool());
		paletteContainer.add(createRoutingProtocolDomain3CreationTool());
		paletteContainer.add(createNATSetttingData4CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Routes" palette tool group
	 * @generated
	 */
	private PaletteContainer createRoutes9Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.Routes9Group_title);
		paletteContainer.add(createAdministrativeDistance1CreationTool());
		paletteContainer.add(createNextHopRoute2CreationTool());
		paletteContainer.add(createNextHopRouting3CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "QoS" palette tool group
	 * @generated
	 */
	private PaletteContainer createQoS10Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.QoS10Group_title);
		paletteContainer.add(createConditioningService1CreationTool());
		paletteContainer.add(createDiffServServiceQoSService2CreationTool());
		paletteContainer
				.add(createDropThresholdCalculationService3CreationTool());
		paletteContainer.add(createFlowServiceQoSService4CreationTool());
		paletteContainer.add(createHdr8021PServiceQoSService5CreationTool());
		paletteContainer.add(createPrecedenceServiceQoSService6CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Collections" palette tool group
	 * @generated
	 */
	private PaletteContainer createCollections11Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.Collections11Group_title);
		paletteContainer.add(createBufferPool1CreationTool());
		paletteContainer.add(createConnectivityCollection2CreationTool());
		paletteContainer
				.add(createConnectivityMemberhipSettingData3CreationTool());
		paletteContainer
				.add(createIPAddressRangeCollectionOfMSEs4CreationTool());
		paletteContainer
				.add(createLogicalNetworkCollectionOfMSEs5CreationTool());
		paletteContainer.add(createNamedAddressCollection6CreationTool());
		paletteContainer.add(createRangeOfIPAddresses7CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "LogicalPorts" palette tool group
	 * @generated
	 */
	private PaletteContainer createLogicalPorts12Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.LogicalPorts12Group_title);
		paletteContainer.add(createLogicalModule1CreationTool());
		paletteContainer.add(createNetworkPortLogicalPort2CreationTool());
		paletteContainer.add(createUSBPortLogicalPort3CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Filtering" palette tool group
	 * @generated
	 */
	private PaletteContainer createFiltering13Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.Filtering13Group_title);
		paletteContainer.add(createFilterEntryBase1CreationTool());
		paletteContainer.add(createFilterList2CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Application" palette tool group
	 * @generated
	 */
	private PaletteContainer createApplication14Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.Application14Group_title);
		paletteContainer.add(createApplicationSystem1CreationTool());
		paletteContainer.add(createFileSpecification2CreationTool());
		paletteContainer.add(createOperatingSystem3CreationTool());
		paletteContainer.add(createSoftwareElement4CreationTool());
		paletteContainer.add(createSoftwareFeature5CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "ProtocolService" palette tool group
	 * @generated
	 */
	private PaletteContainer createProtocolService15Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.ProtocolService15Group_title);
		paletteContainer.add(createProtocolService1CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Physical" palette tool group
	 * @generated
	 */
	private PaletteContainer createPhysical16Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.Physical16Group_title);
		paletteContainer.add(createReplacementSet1CreationTool());
		paletteContainer.add(createPhysicalCapacity2CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "BGP" palette tool group
	 * @generated
	 */
	private PaletteContainer createBGP17Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.BGP17Group_title);
		paletteContainer.add(createBGPCluster1CreationTool());
		paletteContainer.add(createBGPPeerGroup2CreationTool());
		paletteContainer.add(createBGPService3CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "ProtocolEndpoints" palette tool group
	 * @generated
	 */
	private PaletteContainer createProtocolEndpoints18Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.ProtocolEndpoints18Group_title);
		paletteContainer.add(createBGPProtocolEndpoint1CreationTool());
		paletteContainer.add(createCLPSettingData2CreationTool());
		paletteContainer.add(createDHCPCapabilities3CreationTool());
		paletteContainer.add(createDHCPProtocolEndpoint4CreationTool());
		paletteContainer.add(createDNSProtocolEndpoint5CreationTool());
		paletteContainer.add(createIPAssignmentSettingData6CreationTool());
		paletteContainer.add(createIPProtocolEndpoint7CreationTool());
		paletteContainer.add(createIPXProtocolEndpoint8CreationTool());
		paletteContainer.add(createLANEndpoint9CreationTool());
		paletteContainer.add(createMPLSProtocolEndpoint10CreationTool());
		paletteContainer.add(createOSPFProtocolEndpointBase11CreationTool());
		paletteContainer.add(createSSHSettingData12CreationTool());
		paletteContainer.add(createSwitchPort13CreationTool());
		paletteContainer.add(createTCPProtocolEndpoint14CreationTool());
		paletteContainer.add(createTelnetProtocolEndpoint15CreationTool());
		paletteContainer.add(createTelnetSettingData16CreationTool());
		paletteContainer.add(createUDPProtocolEndpoint17CreationTool());
		paletteContainer.add(createWiFiEndPoint18CreationTool());
		paletteContainer.add(createWiFiEndpointSettings19CreationTool());
		paletteContainer.add(createWirelessLANEndpoint20CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createLinks1CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(71);
		types
				.add(CIMLevelZeroElementTypes.DirectorySpecificationDirectorySpecificationFiles_4001);
		types
				.add(CIMLevelZeroElementTypes.OperatingSystemOperatingSystemSoftwareFeature_4002);
		types
				.add(CIMLevelZeroElementTypes.SoftwareElementSoftwareElementActions_4003);
		types
				.add(CIMLevelZeroElementTypes.SoftwareElementSoftwareElementChecks_4004);
		types
				.add(CIMLevelZeroElementTypes.InstalledProductSoftwareElements_4005);
		types.add(CIMLevelZeroElementTypes.BGPServiceBGPPeerGroupServices_4006);
		types
				.add(CIMLevelZeroElementTypes.BGPClusterReflectorClientService_4007);
		types
				.add(CIMLevelZeroElementTypes.BGPClusterReflectorNonClientService_4008);
		types.add(CIMLevelZeroElementTypes.BGPClusterReflectorService_4009);
		types.add(CIMLevelZeroElementTypes.ServiceAccessPointBindsTo_4010);
		types.add(CIMLevelZeroElementTypes.ManagedElementComponents_4011);
		types.add(CIMLevelZeroElementTypes.AdminDomainContainedDomain_4012);
		types.add(CIMLevelZeroElementTypes.ManagedElementDependencies_4013);
		types.add(CIMLevelZeroElementTypes.LogicalDeviceDeviceConnection_4014);
		types.add(CIMLevelZeroElementTypes.LogicalDeviceDeviceIdentity_4015);
		types
				.add(CIMLevelZeroElementTypes.LogicalDeviceDeviceSAPImplementation_4016);
		types
				.add(CIMLevelZeroElementTypes.ManagedElementElementCapabilities_4017);
		types
				.add(CIMLevelZeroElementTypes.ManagedElementElementSettingData_4018);
		types
				.add(CIMLevelZeroElementTypes.SoftwareIdentityElementSoftwareIdentity_4019);
		types.add(CIMLevelZeroElementTypes.SystemHostedAccessPoint_4020);
		types.add(CIMLevelZeroElementTypes.SystemHostedCollection_4021);
		types.add(CIMLevelZeroElementTypes.ManagedElementHostedDependency_4022);
		types.add(CIMLevelZeroElementTypes.SystemHostedServices_4023);
		types
				.add(CIMLevelZeroElementTypes.ElementSoftwareIdentityManagedElement_4024);
		types
				.add(CIMLevelZeroElementTypes.ProductProductProductDependency_4025);
		types.add(CIMLevelZeroElementTypes.ProductProductServiceComponent_4026);
		types
				.add(CIMLevelZeroElementTypes.EnabledLogicalElementRemoteAccessAvailableToElement_4027);
		types.add(CIMLevelZeroElementTypes.SystemRoles_4028);
		types
				.add(CIMLevelZeroElementTypes.ServiceAccessPointSAPSAPDependency_4029);
		types.add(CIMLevelZeroElementTypes.ServiceServiceAccessBySAP_4030);
		types.add(CIMLevelZeroElementTypes.ServiceServiceComponents_4031);
		types
				.add(CIMLevelZeroElementTypes.ServiceServiceServiceDependency_4032);
		types.add(CIMLevelZeroElementTypes.ElementSettingDataSettingData_4033);
		types
				.add(CIMLevelZeroElementTypes.SettingDataSettingsDefineCapabilities_4034);
		types
				.add(CIMLevelZeroElementTypes.ManagedSystemElementStatusDescriptions_4035);
		types.add(CIMLevelZeroElementTypes.SystemSystemComponents_4036);
		types.add(CIMLevelZeroElementTypes.SystemSystemDevices_4037);
		types.add(CIMLevelZeroElementTypes.LogicalModuleModulePort_4038);
		types.add(CIMLevelZeroElementTypes.AFServiceAFRelatedServices_4039);
		types
				.add(CIMLevelZeroElementTypes.QoSServiceQoSConditioningSubService_4040);
		types.add(CIMLevelZeroElementTypes.QoSServiceQoSSubService_4041);
		types.add(CIMLevelZeroElementTypes.CollectionMembers_4042);
		types
				.add(CIMLevelZeroElementTypes.NATListBasedSettingsAddressesToBeTranslated_4043);
		types.add(CIMLevelZeroElementTypes.BGPServiceBGPAdminDistance_4044);
		types
				.add(CIMLevelZeroElementTypes.ServiceAccessPointBindsToLANEndpoint_4045);
		types
				.add(CIMLevelZeroElementTypes.RouteCalculationServiceCalculatesAmong_4046);
		types
				.add(CIMLevelZeroElementTypes.ProtocolEndpointEgressConditioningServiceOnEndpoint_4047);
		types.add(CIMLevelZeroElementTypes.CIM_ModelElements_4048);
		types
				.add(CIMLevelZeroElementTypes.ForwardingServiceForwardedRoutes_4049);
		types.add(CIMLevelZeroElementTypes.ForwardingServiceForwardsAmong_4050);
		types.add(CIMLevelZeroElementTypes.ComputerSystemHostedFilterList_4051);
		types
				.add(CIMLevelZeroElementTypes.ComputerSystemHostedForwardingServices_4052);
		types.add(CIMLevelZeroElementTypes.SystemHostedRoute_4053);
		types
				.add(CIMLevelZeroElementTypes.ComputerSystemHostedRoutingPolicy_4054);
		types
				.add(CIMLevelZeroElementTypes.ProtocolEndpointIngressConditioningServiceOnEndpoint_4055);
		types.add(CIMLevelZeroElementTypes.LogicalNetworkInLogicalNetwork_4056);
		types.add(CIMLevelZeroElementTypes.LANSegmentInSegment_4057);
		types
				.add(CIMLevelZeroElementTypes.NATServiceNATServiceRunningOnEndpoint_4058);
		types
				.add(CIMLevelZeroElementTypes.AdminDomainNetworksInAdminDomain_4059);
		types
				.add(CIMLevelZeroElementTypes.LogicalPortPortImplementsEndPoint_4060);
		types.add(CIMLevelZeroElementTypes.LogicalDevicePortOnDevice_4061);
		types
				.add(CIMLevelZeroElementTypes.ForwardingServiceRouteForwardedByService_4062);
		types.add(CIMLevelZeroElementTypes.AutonomousSystemRouterInAS_4063);
		types.add(CIMLevelZeroElementTypes.BGPClusterRoutersInBGPCluster_4064);
		types.add(CIMLevelZeroElementTypes.NextHopRouteRouteUsesEndpoint_4065);
		types
				.add(CIMLevelZeroElementTypes.AutonomousSystemRoutingProtocolDomainInAS_4066);
		types.add(CIMLevelZeroElementTypes.ComputerSystemRunningOS_4067);
		types
				.add(CIMLevelZeroElementTypes.ServiceSoftwareFeatureServiceImplementation_4068);
		types
				.add(CIMLevelZeroElementTypes.NATListBasedSettingsTranslationPoolForNAT_4069);
		types
				.add(CIMLevelZeroElementTypes.SNMPServiceTrapSourceForSNMPService_4070);
		types.add(CIMLevelZeroElementTypes.NextHopRouteAssociatedNextHop_4071);
		LinkToolEntry entry = new LinkToolEntry(
				Messages.Links1CreationTool_title,
				Messages.Links1CreationTool_desc, types);
		entry.setSmallIcon(CIMLevelZeroDiagramEditorPlugin
				.findImageDescriptor("/levelZero.diagram/icons/linkIcon.gif")); //$NON-NLS-1$
		entry.setLargeIcon(CIMLevelZeroDiagramEditorPlugin
				.findImageDescriptor("/levelZero.diagram/icons/linkIcon.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAdminDomain1CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(CIMLevelZeroElementTypes.AdminDomain_2089);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.AdminDomain1CreationTool_title,
				Messages.AdminDomain1CreationTool_desc, types);
		entry.setSmallIcon(CIMLevelZeroElementTypes
				.getImageDescriptor(CIMLevelZeroElementTypes.AdminDomain_2089));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCapabilities2CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(2);
		types
				.add(CIMLevelZeroElementTypes.EnabledLogicalElementCapabilities_2006);
		types.add(CIMLevelZeroElementTypes.PowerManagementCapabilities_2074);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Capabilities2CreationTool_title, null, types);
		entry
				.setSmallIcon(CIMLevelZeroElementTypes
						.getImageDescriptor(CIMLevelZeroElementTypes.EnabledLogicalElementCapabilities_2006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createGenericService3CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(CIMLevelZeroElementTypes.GenericService_2043);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.GenericService3CreationTool_title,
				Messages.GenericService3CreationTool_desc, types);
		entry
				.setSmallIcon(CIMLevelZeroElementTypes
						.getImageDescriptor(CIMLevelZeroElementTypes.GenericService_2043));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createProduct4CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(CIMLevelZeroElementTypes.Product_2080);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Product4CreationTool_title,
				Messages.Product4CreationTool_desc, types);
		entry.setSmallIcon(CIMLevelZeroElementTypes
				.getImageDescriptor(CIMLevelZeroElementTypes.Product_2080));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createServiceAccessPoint5CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(2);
		types.add(CIMLevelZeroElementTypes.ServiceAccessURI_2068);
		types.add(CIMLevelZeroElementTypes.RemoteServiceAccessPoint_2094);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.ServiceAccessPoint5CreationTool_title, null, types);
		entry
				.setSmallIcon(CIMLevelZeroElementTypes
						.getImageDescriptor(CIMLevelZeroElementTypes.ServiceAccessURI_2068));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSoftwareIdentity6CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(CIMLevelZeroElementTypes.SoftwareIdentity_2040);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.SoftwareIdentity6CreationTool_title,
				Messages.SoftwareIdentity6CreationTool_desc, types);
		entry
				.setSmallIcon(CIMLevelZeroElementTypes
						.getImageDescriptor(CIMLevelZeroElementTypes.SoftwareIdentity_2040));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSystemSpecificCollection7CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(CIMLevelZeroElementTypes.SystemSpecificCollection_2090);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.SystemSpecificCollection7CreationTool_title,
				Messages.SystemSpecificCollection7CreationTool_desc, types);
		entry
				.setSmallIcon(CIMLevelZeroElementTypes
						.getImageDescriptor(CIMLevelZeroElementTypes.SystemSpecificCollection_2090));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createStorageExtent1CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(CIMLevelZeroElementTypes.VolatileStorage_2024);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.StorageExtent1CreationTool_title,
				Messages.StorageExtent1CreationTool_desc, types);
		entry
				.setSmallIcon(CIMLevelZeroElementTypes
						.getImageDescriptor(CIMLevelZeroElementTypes.VolatileStorage_2024));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createUSBDevice2CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(CIMLevelZeroElementTypes.USBDevice_2001);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.USBDevice2CreationTool_title,
				Messages.USBDevice2CreationTool_desc, types);
		entry.setSmallIcon(CIMLevelZeroElementTypes
				.getImageDescriptor(CIMLevelZeroElementTypes.USBDevice_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCableModemConnectionBased1CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(CIMLevelZeroElementTypes.CableModem_2019);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.CableModemConnectionBased1CreationTool_title,
				Messages.CableModemConnectionBased1CreationTool_desc, types);
		entry.setSmallIcon(CIMLevelZeroElementTypes
				.getImageDescriptor(CIMLevelZeroElementTypes.CableModem_2019));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDSLModemConnectionBased2CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(4);
		types.add(CIMLevelZeroElementTypes.SDSLModem_2033);
		types.add(CIMLevelZeroElementTypes.ADSLModem_2036);
		types.add(CIMLevelZeroElementTypes.VDSLModem_2045);
		types.add(CIMLevelZeroElementTypes.HDSLModem_2067);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.DSLModemConnectionBased2CreationTool_title,
				Messages.DSLModemConnectionBased2CreationTool_desc, types);
		entry.setSmallIcon(CIMLevelZeroElementTypes
				.getImageDescriptor(CIMLevelZeroElementTypes.SDSLModem_2033));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createISDNModemCallBased3CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(CIMLevelZeroElementTypes.ISDNModem_2076);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.ISDNModemCallBased3CreationTool_title,
				Messages.ISDNModemCallBased3CreationTool_desc, types);
		entry.setSmallIcon(CIMLevelZeroElementTypes
				.getImageDescriptor(CIMLevelZeroElementTypes.ISDNModem_2076));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPOTSModemCallBased4CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(CIMLevelZeroElementTypes.UniModem_2011);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.POTSModemCallBased4CreationTool_title,
				Messages.POTSModemCallBased4CreationTool_desc, types);
		entry.setSmallIcon(CIMLevelZeroElementTypes
				.getImageDescriptor(CIMLevelZeroElementTypes.UniModem_2011));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAutonomousSystem1CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(CIMLevelZeroElementTypes.AutonomousSystem_2009);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.AutonomousSystem1CreationTool_title,
				Messages.AutonomousSystem1CreationTool_desc, types);
		entry
				.setSmallIcon(CIMLevelZeroElementTypes
						.getImageDescriptor(CIMLevelZeroElementTypes.AutonomousSystem_2009));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createNetwork2CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(CIMLevelZeroElementTypes.Network_2071);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Network2CreationTool_title,
				Messages.Network2CreationTool_desc, types);
		entry.setSmallIcon(CIMLevelZeroElementTypes
				.getImageDescriptor(CIMLevelZeroElementTypes.Network_2071));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createComputerSystem1CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(2);
		types.add(CIMLevelZeroElementTypes.UnitaryComputerSystem_2027);
		types.add(CIMLevelZeroElementTypes.ComputerSystem_2092);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.ComputerSystem1CreationTool_title,
				Messages.ComputerSystem1CreationTool_desc, types);
		entry
				.setSmallIcon(CIMLevelZeroElementTypes
						.getImageDescriptor(CIMLevelZeroElementTypes.UnitaryComputerSystem_2027));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDirectory2CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(CIMLevelZeroElementTypes.Directory_2053);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Directory2CreationTool_title,
				Messages.Directory2CreationTool_desc, types);
		entry.setSmallIcon(CIMLevelZeroElementTypes
				.getImageDescriptor(CIMLevelZeroElementTypes.Directory_2053));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createLogicalFile3CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(CIMLevelZeroElementTypes.LogicalFile_2037);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.LogicalFile3CreationTool_title,
				Messages.LogicalFile3CreationTool_desc, types);
		entry.setSmallIcon(CIMLevelZeroElementTypes
				.getImageDescriptor(CIMLevelZeroElementTypes.LogicalFile_2037));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSNMPCommunityStrings1CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(CIMLevelZeroElementTypes.SNMPCommunityStrings_2070);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.SNMPCommunityStrings1CreationTool_title,
				Messages.SNMPCommunityStrings1CreationTool_desc, types);
		entry
				.setSmallIcon(CIMLevelZeroElementTypes
						.getImageDescriptor(CIMLevelZeroElementTypes.SNMPCommunityStrings_2070));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSNMPService2CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(CIMLevelZeroElementTypes.SNMPService_2029);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.SNMPService2CreationTool_title,
				Messages.SNMPService2CreationTool_desc, types);
		entry.setSmallIcon(CIMLevelZeroElementTypes
				.getImageDescriptor(CIMLevelZeroElementTypes.SNMPService_2029));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSNMPTrapTarget3CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(CIMLevelZeroElementTypes.SNMPTrapTarget_2055);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.SNMPTrapTarget3CreationTool_title,
				Messages.SNMPTrapTarget3CreationTool_desc, types);
		entry
				.setSmallIcon(CIMLevelZeroElementTypes
						.getImageDescriptor(CIMLevelZeroElementTypes.SNMPTrapTarget_2055));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createForwardingServiceNetworkService1CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(CIMLevelZeroElementTypes.NATService_2035);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.ForwardingServiceNetworkService1CreationTool_title,
				Messages.ForwardingServiceNetworkService1CreationTool_desc,
				types);
		entry.setSmallIcon(CIMLevelZeroElementTypes
				.getImageDescriptor(CIMLevelZeroElementTypes.NATService_2035));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRoutingPolicy2CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(CIMLevelZeroElementTypes.RoutingPolicy_2005);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.RoutingPolicy2CreationTool_title,
				Messages.RoutingPolicy2CreationTool_desc, types);
		entry
				.setSmallIcon(CIMLevelZeroElementTypes
						.getImageDescriptor(CIMLevelZeroElementTypes.RoutingPolicy_2005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRoutingProtocolDomain3CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(CIMLevelZeroElementTypes.RoutingProtocolDomain_2082);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.RoutingProtocolDomain3CreationTool_title,
				Messages.RoutingProtocolDomain3CreationTool_desc, types);
		entry
				.setSmallIcon(CIMLevelZeroElementTypes
						.getImageDescriptor(CIMLevelZeroElementTypes.RoutingProtocolDomain_2082));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createNATSetttingData4CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(2);
		types.add(CIMLevelZeroElementTypes.NATListBasedSettings_2044);
		types.add(CIMLevelZeroElementTypes.NATStaticSettings_2085);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.NATSetttingData4CreationTool_title, null, types);
		entry
				.setSmallIcon(CIMLevelZeroElementTypes
						.getImageDescriptor(CIMLevelZeroElementTypes.NATListBasedSettings_2044));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAdministrativeDistance1CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(CIMLevelZeroElementTypes.AdministrativeDistance_2022);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.AdministrativeDistance1CreationTool_title,
				Messages.AdministrativeDistance1CreationTool_desc, types);
		entry
				.setSmallIcon(CIMLevelZeroElementTypes
						.getImageDescriptor(CIMLevelZeroElementTypes.AdministrativeDistance_2022));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createNextHopRoute2CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(CIMLevelZeroElementTypes.NextHopIPRoute_2031);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.NextHopRoute2CreationTool_title, null, types);
		entry
				.setSmallIcon(CIMLevelZeroElementTypes
						.getImageDescriptor(CIMLevelZeroElementTypes.NextHopIPRoute_2031));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createNextHopRouting3CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(CIMLevelZeroElementTypes.NextHopRouting_2091);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.NextHopRouting3CreationTool_title,
				Messages.NextHopRouting3CreationTool_desc, types);
		entry
				.setSmallIcon(CIMLevelZeroElementTypes
						.getImageDescriptor(CIMLevelZeroElementTypes.NextHopRouting_2091));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConditioningService1CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(CIMLevelZeroElementTypes.ConditioningService_2058);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.ConditioningService1CreationTool_title,
				Messages.ConditioningService1CreationTool_desc, types);
		entry
				.setSmallIcon(CIMLevelZeroElementTypes
						.getImageDescriptor(CIMLevelZeroElementTypes.ConditioningService_2058));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDiffServServiceQoSService2CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(2);
		types.add(CIMLevelZeroElementTypes.EFService_2012);
		types.add(CIMLevelZeroElementTypes.AFService_2083);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.DiffServServiceQoSService2CreationTool_title,
				Messages.DiffServServiceQoSService2CreationTool_desc, types);
		entry.setSmallIcon(CIMLevelZeroElementTypes
				.getImageDescriptor(CIMLevelZeroElementTypes.EFService_2012));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDropThresholdCalculationService3CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types
				.add(CIMLevelZeroElementTypes.DropThresholdCalculationService_2088);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.DropThresholdCalculationService3CreationTool_title,
				Messages.DropThresholdCalculationService3CreationTool_desc,
				types);
		entry
				.setSmallIcon(CIMLevelZeroElementTypes
						.getImageDescriptor(CIMLevelZeroElementTypes.DropThresholdCalculationService_2088));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createFlowServiceQoSService4CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(CIMLevelZeroElementTypes.FlowService_2075);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.FlowServiceQoSService4CreationTool_title,
				Messages.FlowServiceQoSService4CreationTool_desc, types);
		entry.setSmallIcon(CIMLevelZeroElementTypes
				.getImageDescriptor(CIMLevelZeroElementTypes.FlowService_2075));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createHdr8021PServiceQoSService5CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(CIMLevelZeroElementTypes.Hdr8021PService_2065);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Hdr8021PServiceQoSService5CreationTool_title,
				Messages.Hdr8021PServiceQoSService5CreationTool_desc, types);
		entry
				.setSmallIcon(CIMLevelZeroElementTypes
						.getImageDescriptor(CIMLevelZeroElementTypes.Hdr8021PService_2065));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPrecedenceServiceQoSService6CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(CIMLevelZeroElementTypes.PrecedenceService_2063);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.PrecedenceServiceQoSService6CreationTool_title,
				Messages.PrecedenceServiceQoSService6CreationTool_desc, types);
		entry
				.setSmallIcon(CIMLevelZeroElementTypes
						.getImageDescriptor(CIMLevelZeroElementTypes.PrecedenceService_2063));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createBufferPool1CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(CIMLevelZeroElementTypes.BufferPool_2007);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.BufferPool1CreationTool_title, null, types);
		entry.setSmallIcon(CIMLevelZeroElementTypes
				.getImageDescriptor(CIMLevelZeroElementTypes.BufferPool_2007));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectivityCollection2CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(3);
		types.add(CIMLevelZeroElementTypes.LANConnectivitySegment_2018);
		types.add(CIMLevelZeroElementTypes.IPConnectivitySubnet_2023);
		types.add(CIMLevelZeroElementTypes.IPXConnectivityNetwork_2056);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.ConnectivityCollection2CreationTool_title,
				Messages.ConnectivityCollection2CreationTool_desc, types);
		entry
				.setSmallIcon(CIMLevelZeroElementTypes
						.getImageDescriptor(CIMLevelZeroElementTypes.LANConnectivitySegment_2018));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectivityMemberhipSettingData3CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types
				.add(CIMLevelZeroElementTypes.ConnectivityMemberhipSettingData_2057);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.ConnectivityMemberhipSettingData3CreationTool_title,
				Messages.ConnectivityMemberhipSettingData3CreationTool_desc,
				types);
		entry
				.setSmallIcon(CIMLevelZeroElementTypes
						.getImageDescriptor(CIMLevelZeroElementTypes.ConnectivityMemberhipSettingData_2057));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createIPAddressRangeCollectionOfMSEs4CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(CIMLevelZeroElementTypes.IPAddressRange_2054);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.IPAddressRangeCollectionOfMSEs4CreationTool_title,
				Messages.IPAddressRangeCollectionOfMSEs4CreationTool_desc,
				types);
		entry
				.setSmallIcon(CIMLevelZeroElementTypes
						.getImageDescriptor(CIMLevelZeroElementTypes.IPAddressRange_2054));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createLogicalNetworkCollectionOfMSEs5CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(3);
		types.add(CIMLevelZeroElementTypes.IPSubnet_2013);
		types.add(CIMLevelZeroElementTypes.IPXNetwork_2073);
		types.add(CIMLevelZeroElementTypes.LANSegment_2084);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.LogicalNetworkCollectionOfMSEs5CreationTool_title,
				Messages.LogicalNetworkCollectionOfMSEs5CreationTool_desc,
				types);
		entry.setSmallIcon(CIMLevelZeroElementTypes
				.getImageDescriptor(CIMLevelZeroElementTypes.IPSubnet_2013));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createNamedAddressCollection6CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(CIMLevelZeroElementTypes.NamedAddressCollection_2014);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.NamedAddressCollection6CreationTool_title,
				Messages.NamedAddressCollection6CreationTool_desc, types);
		entry
				.setSmallIcon(CIMLevelZeroElementTypes
						.getImageDescriptor(CIMLevelZeroElementTypes.NamedAddressCollection_2014));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRangeOfIPAddresses7CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(CIMLevelZeroElementTypes.RangeOfIPAddresses_2025);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.RangeOfIPAddresses7CreationTool_title,
				Messages.RangeOfIPAddresses7CreationTool_desc, types);
		entry
				.setSmallIcon(CIMLevelZeroElementTypes
						.getImageDescriptor(CIMLevelZeroElementTypes.RangeOfIPAddresses_2025));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createLogicalModule1CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(CIMLevelZeroElementTypes.LogicalModule_2030);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.LogicalModule1CreationTool_title,
				Messages.LogicalModule1CreationTool_desc, types);
		entry
				.setSmallIcon(CIMLevelZeroElementTypes
						.getImageDescriptor(CIMLevelZeroElementTypes.LogicalModule_2030));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createNetworkPortLogicalPort2CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(4);
		types.add(CIMLevelZeroElementTypes.WiFiPort_2003);
		types.add(CIMLevelZeroElementTypes.EthernetPort_2028);
		types.add(CIMLevelZeroElementTypes.WirelessPort_2041);
		types.add(CIMLevelZeroElementTypes.NetworkPort_2093);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.NetworkPortLogicalPort2CreationTool_title,
				Messages.NetworkPortLogicalPort2CreationTool_desc, types);
		entry.setSmallIcon(CIMLevelZeroElementTypes
				.getImageDescriptor(CIMLevelZeroElementTypes.WiFiPort_2003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createUSBPortLogicalPort3CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(CIMLevelZeroElementTypes.USBPort_2046);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.USBPortLogicalPort3CreationTool_title,
				Messages.USBPortLogicalPort3CreationTool_desc, types);
		entry.setSmallIcon(CIMLevelZeroElementTypes
				.getImageDescriptor(CIMLevelZeroElementTypes.USBPort_2046));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createFilterEntryBase1CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(2);
		types.add(CIMLevelZeroElementTypes.IPHeadersFilter_2052);
		types.add(CIMLevelZeroElementTypes.FilterEntry_2069);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.FilterEntryBase1CreationTool_title, null, types);
		entry
				.setSmallIcon(CIMLevelZeroElementTypes
						.getImageDescriptor(CIMLevelZeroElementTypes.IPHeadersFilter_2052));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createFilterList2CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(CIMLevelZeroElementTypes.FilterList_2061);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.FilterList2CreationTool_title,
				Messages.FilterList2CreationTool_desc, types);
		entry.setSmallIcon(CIMLevelZeroElementTypes
				.getImageDescriptor(CIMLevelZeroElementTypes.FilterList_2061));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createApplicationSystem1CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(CIMLevelZeroElementTypes.ApplicationSystem_2039);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.ApplicationSystem1CreationTool_title,
				Messages.ApplicationSystem1CreationTool_desc, types);
		entry
				.setSmallIcon(CIMLevelZeroElementTypes
						.getImageDescriptor(CIMLevelZeroElementTypes.ApplicationSystem_2039));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createFileSpecification2CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(CIMLevelZeroElementTypes.FileSpecification_2072);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.FileSpecification2CreationTool_title,
				Messages.FileSpecification2CreationTool_desc, types);
		entry
				.setSmallIcon(CIMLevelZeroElementTypes
						.getImageDescriptor(CIMLevelZeroElementTypes.FileSpecification_2072));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createOperatingSystem3CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(CIMLevelZeroElementTypes.OperatingSystem_2032);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.OperatingSystem3CreationTool_title,
				Messages.OperatingSystem3CreationTool_desc, types);
		entry
				.setSmallIcon(CIMLevelZeroElementTypes
						.getImageDescriptor(CIMLevelZeroElementTypes.OperatingSystem_2032));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSoftwareElement4CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(CIMLevelZeroElementTypes.BIOSElement_2015);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.SoftwareElement4CreationTool_title,
				Messages.SoftwareElement4CreationTool_desc, types);
		entry.setSmallIcon(CIMLevelZeroElementTypes
				.getImageDescriptor(CIMLevelZeroElementTypes.BIOSElement_2015));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSoftwareFeature5CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(CIMLevelZeroElementTypes.BIOSFeature_2059);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.SoftwareFeature5CreationTool_title,
				Messages.SoftwareFeature5CreationTool_desc, types);
		entry.setSmallIcon(CIMLevelZeroElementTypes
				.getImageDescriptor(CIMLevelZeroElementTypes.BIOSFeature_2059));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createProtocolService1CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(CIMLevelZeroElementTypes.ProtocolService_2004);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.ProtocolService1CreationTool_title,
				Messages.ProtocolService1CreationTool_desc, types);
		entry
				.setSmallIcon(CIMLevelZeroElementTypes
						.getImageDescriptor(CIMLevelZeroElementTypes.ProtocolService_2004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createReplacementSet1CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(CIMLevelZeroElementTypes.ReplacementSet_2066);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.ReplacementSet1CreationTool_title,
				Messages.ReplacementSet1CreationTool_desc, types);
		entry
				.setSmallIcon(CIMLevelZeroElementTypes
						.getImageDescriptor(CIMLevelZeroElementTypes.ReplacementSet_2066));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPhysicalCapacity2CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(CIMLevelZeroElementTypes.MemoryCapacity_2081);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.PhysicalCapacity2CreationTool_title, null, types);
		entry
				.setSmallIcon(CIMLevelZeroElementTypes
						.getImageDescriptor(CIMLevelZeroElementTypes.MemoryCapacity_2081));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createBGPCluster1CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(CIMLevelZeroElementTypes.BGPCluster_2038);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.BGPCluster1CreationTool_title,
				Messages.BGPCluster1CreationTool_desc, types);
		entry.setSmallIcon(CIMLevelZeroElementTypes
				.getImageDescriptor(CIMLevelZeroElementTypes.BGPCluster_2038));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createBGPPeerGroup2CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(CIMLevelZeroElementTypes.BGPPeerGroup_2017);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.BGPPeerGroup2CreationTool_title,
				Messages.BGPPeerGroup2CreationTool_desc, types);
		entry
				.setSmallIcon(CIMLevelZeroElementTypes
						.getImageDescriptor(CIMLevelZeroElementTypes.BGPPeerGroup_2017));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createBGPService3CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(CIMLevelZeroElementTypes.BGPService_2062);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.BGPService3CreationTool_title,
				Messages.BGPService3CreationTool_desc, types);
		entry.setSmallIcon(CIMLevelZeroElementTypes
				.getImageDescriptor(CIMLevelZeroElementTypes.BGPService_2062));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createBGPProtocolEndpoint1CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(CIMLevelZeroElementTypes.BGPProtocolEndpoint_2026);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.BGPProtocolEndpoint1CreationTool_title,
				Messages.BGPProtocolEndpoint1CreationTool_desc, types);
		entry
				.setSmallIcon(CIMLevelZeroElementTypes
						.getImageDescriptor(CIMLevelZeroElementTypes.BGPProtocolEndpoint_2026));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCLPSettingData2CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(CIMLevelZeroElementTypes.CLPSettingData_2042);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.CLPSettingData2CreationTool_title,
				Messages.CLPSettingData2CreationTool_desc, types);
		entry
				.setSmallIcon(CIMLevelZeroElementTypes
						.getImageDescriptor(CIMLevelZeroElementTypes.CLPSettingData_2042));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDHCPCapabilities3CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(CIMLevelZeroElementTypes.DHCPCapabilities_2064);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.DHCPCapabilities3CreationTool_title,
				Messages.DHCPCapabilities3CreationTool_desc, types);
		entry
				.setSmallIcon(CIMLevelZeroElementTypes
						.getImageDescriptor(CIMLevelZeroElementTypes.DHCPCapabilities_2064));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDHCPProtocolEndpoint4CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(CIMLevelZeroElementTypes.DHCPProtocolEndpoint_2051);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.DHCPProtocolEndpoint4CreationTool_title,
				Messages.DHCPProtocolEndpoint4CreationTool_desc, types);
		entry
				.setSmallIcon(CIMLevelZeroElementTypes
						.getImageDescriptor(CIMLevelZeroElementTypes.DHCPProtocolEndpoint_2051));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDNSProtocolEndpoint5CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(CIMLevelZeroElementTypes.DNSProtocolEndpoint_2047);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.DNSProtocolEndpoint5CreationTool_title,
				Messages.DNSProtocolEndpoint5CreationTool_desc, types);
		entry
				.setSmallIcon(CIMLevelZeroElementTypes
						.getImageDescriptor(CIMLevelZeroElementTypes.DNSProtocolEndpoint_2047));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createIPAssignmentSettingData6CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(CIMLevelZeroElementTypes.DNSSettingData_2010);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.IPAssignmentSettingData6CreationTool_title,
				Messages.IPAssignmentSettingData6CreationTool_desc, types);
		entry
				.setSmallIcon(CIMLevelZeroElementTypes
						.getImageDescriptor(CIMLevelZeroElementTypes.DNSSettingData_2010));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createIPProtocolEndpoint7CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(CIMLevelZeroElementTypes.IPProtocolEndpoint_2078);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.IPProtocolEndpoint7CreationTool_title,
				Messages.IPProtocolEndpoint7CreationTool_desc, types);
		entry
				.setSmallIcon(CIMLevelZeroElementTypes
						.getImageDescriptor(CIMLevelZeroElementTypes.IPProtocolEndpoint_2078));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createIPXProtocolEndpoint8CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(CIMLevelZeroElementTypes.IPXProtocolEndpoint_2077);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.IPXProtocolEndpoint8CreationTool_title,
				Messages.IPXProtocolEndpoint8CreationTool_desc, types);
		entry
				.setSmallIcon(CIMLevelZeroElementTypes
						.getImageDescriptor(CIMLevelZeroElementTypes.IPXProtocolEndpoint_2077));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createLANEndpoint9CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(CIMLevelZeroElementTypes.LANEndpoint_2087);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.LANEndpoint9CreationTool_title,
				Messages.LANEndpoint9CreationTool_desc, types);
		entry.setSmallIcon(CIMLevelZeroElementTypes
				.getImageDescriptor(CIMLevelZeroElementTypes.LANEndpoint_2087));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createMPLSProtocolEndpoint10CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(CIMLevelZeroElementTypes.MPLSProtocolEndpoint_2008);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.MPLSProtocolEndpoint10CreationTool_title,
				Messages.MPLSProtocolEndpoint10CreationTool_desc, types);
		entry
				.setSmallIcon(CIMLevelZeroElementTypes
						.getImageDescriptor(CIMLevelZeroElementTypes.MPLSProtocolEndpoint_2008));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createOSPFProtocolEndpointBase11CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(2);
		types.add(CIMLevelZeroElementTypes.OSPFVirtualInterface_2002);
		types.add(CIMLevelZeroElementTypes.OSPFProtocolEndpoint_2060);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.OSPFProtocolEndpointBase11CreationTool_title,
				Messages.OSPFProtocolEndpointBase11CreationTool_desc, types);
		entry
				.setSmallIcon(CIMLevelZeroElementTypes
						.getImageDescriptor(CIMLevelZeroElementTypes.OSPFVirtualInterface_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSSHSettingData12CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(CIMLevelZeroElementTypes.SSHSettingData_2049);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.SSHSettingData12CreationTool_title,
				Messages.SSHSettingData12CreationTool_desc, types);
		entry
				.setSmallIcon(CIMLevelZeroElementTypes
						.getImageDescriptor(CIMLevelZeroElementTypes.SSHSettingData_2049));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSwitchPort13CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(CIMLevelZeroElementTypes.SwitchPort_2020);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.SwitchPort13CreationTool_title,
				Messages.SwitchPort13CreationTool_desc, types);
		entry.setSmallIcon(CIMLevelZeroElementTypes
				.getImageDescriptor(CIMLevelZeroElementTypes.SwitchPort_2020));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTCPProtocolEndpoint14CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(CIMLevelZeroElementTypes.TCPProtocolEndpoint_2021);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.TCPProtocolEndpoint14CreationTool_title,
				Messages.TCPProtocolEndpoint14CreationTool_desc, types);
		entry
				.setSmallIcon(CIMLevelZeroElementTypes
						.getImageDescriptor(CIMLevelZeroElementTypes.TCPProtocolEndpoint_2021));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTelnetProtocolEndpoint15CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(CIMLevelZeroElementTypes.TelnetProtocolEndpoint_2086);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.TelnetProtocolEndpoint15CreationTool_title,
				Messages.TelnetProtocolEndpoint15CreationTool_desc, types);
		entry
				.setSmallIcon(CIMLevelZeroElementTypes
						.getImageDescriptor(CIMLevelZeroElementTypes.TelnetProtocolEndpoint_2086));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTelnetSettingData16CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(CIMLevelZeroElementTypes.TelnetSettingData_2016);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.TelnetSettingData16CreationTool_title,
				Messages.TelnetSettingData16CreationTool_desc, types);
		entry
				.setSmallIcon(CIMLevelZeroElementTypes
						.getImageDescriptor(CIMLevelZeroElementTypes.TelnetSettingData_2016));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createUDPProtocolEndpoint17CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(CIMLevelZeroElementTypes.UDPProtocolEndpoint_2079);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.UDPProtocolEndpoint17CreationTool_title,
				Messages.UDPProtocolEndpoint17CreationTool_desc, types);
		entry
				.setSmallIcon(CIMLevelZeroElementTypes
						.getImageDescriptor(CIMLevelZeroElementTypes.UDPProtocolEndpoint_2079));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createWiFiEndPoint18CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(CIMLevelZeroElementTypes.WiFiEndPoint_2034);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.WiFiEndPoint18CreationTool_title,
				Messages.WiFiEndPoint18CreationTool_desc, types);
		entry
				.setSmallIcon(CIMLevelZeroElementTypes
						.getImageDescriptor(CIMLevelZeroElementTypes.WiFiEndPoint_2034));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createWiFiEndpointSettings19CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(CIMLevelZeroElementTypes.WiFiEndpointSettings_2048);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.WiFiEndpointSettings19CreationTool_title,
				Messages.WiFiEndpointSettings19CreationTool_desc, types);
		entry
				.setSmallIcon(CIMLevelZeroElementTypes
						.getImageDescriptor(CIMLevelZeroElementTypes.WiFiEndpointSettings_2048));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createWirelessLANEndpoint20CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(CIMLevelZeroElementTypes.WirelessLANEndpoint_2050);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.WirelessLANEndpoint20CreationTool_title,
				Messages.WirelessLANEndpoint20CreationTool_desc, types);
		entry
				.setSmallIcon(CIMLevelZeroElementTypes
						.getImageDescriptor(CIMLevelZeroElementTypes.WirelessLANEndpoint_2050));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private static class NodeToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List elementTypes;

		/**
		 * @generated
		 */
		private NodeToolEntry(String title, String description,
				List elementTypes) {
			super(title, description, null, null);
			this.elementTypes = elementTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeCreationTool(elementTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}

	/**
	 * @generated
	 */
	private static class LinkToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List relationshipTypes;

		/**
		 * @generated
		 */
		private LinkToolEntry(String title, String description,
				List relationshipTypes) {
			super(title, description, null, null);
			this.relationshipTypes = relationshipTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeConnectionTool(relationshipTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}
}
