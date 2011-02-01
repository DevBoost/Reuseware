package es.tid.cim.diagram.edit.policies;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

import es.tid.cim.diagram.edit.commands.ADSLModemCreateCommand;
import es.tid.cim.diagram.edit.commands.AFServiceCreateCommand;
import es.tid.cim.diagram.edit.commands.AdminDomainCreateCommand;
import es.tid.cim.diagram.edit.commands.AdministrativeDistanceCreateCommand;
import es.tid.cim.diagram.edit.commands.ApplicationSystemCreateCommand;
import es.tid.cim.diagram.edit.commands.AutonomousSystemCreateCommand;
import es.tid.cim.diagram.edit.commands.BGPClusterCreateCommand;
import es.tid.cim.diagram.edit.commands.BGPPeerGroupCreateCommand;
import es.tid.cim.diagram.edit.commands.BGPProtocolEndpointCreateCommand;
import es.tid.cim.diagram.edit.commands.BGPServiceCreateCommand;
import es.tid.cim.diagram.edit.commands.BIOSElementCreateCommand;
import es.tid.cim.diagram.edit.commands.BIOSFeatureCreateCommand;
import es.tid.cim.diagram.edit.commands.BufferPoolCreateCommand;
import es.tid.cim.diagram.edit.commands.CLPSettingDataCreateCommand;
import es.tid.cim.diagram.edit.commands.CableModemCreateCommand;
import es.tid.cim.diagram.edit.commands.ComputerSystemCreateCommand;
import es.tid.cim.diagram.edit.commands.ConditioningServiceCreateCommand;
import es.tid.cim.diagram.edit.commands.ConnectivityMemberhipSettingDataCreateCommand;
import es.tid.cim.diagram.edit.commands.DHCPCapabilitiesCreateCommand;
import es.tid.cim.diagram.edit.commands.DHCPProtocolEndpointCreateCommand;
import es.tid.cim.diagram.edit.commands.DNSProtocolEndpointCreateCommand;
import es.tid.cim.diagram.edit.commands.DNSSettingDataCreateCommand;
import es.tid.cim.diagram.edit.commands.DirectoryCreateCommand;
import es.tid.cim.diagram.edit.commands.DropThresholdCalculationServiceCreateCommand;
import es.tid.cim.diagram.edit.commands.EFServiceCreateCommand;
import es.tid.cim.diagram.edit.commands.EnabledLogicalElementCapabilitiesCreateCommand;
import es.tid.cim.diagram.edit.commands.EthernetPortCreateCommand;
import es.tid.cim.diagram.edit.commands.FileSpecificationCreateCommand;
import es.tid.cim.diagram.edit.commands.FilterEntryCreateCommand;
import es.tid.cim.diagram.edit.commands.FilterListCreateCommand;
import es.tid.cim.diagram.edit.commands.FlowServiceCreateCommand;
import es.tid.cim.diagram.edit.commands.GenericServiceCreateCommand;
import es.tid.cim.diagram.edit.commands.HDSLModemCreateCommand;
import es.tid.cim.diagram.edit.commands.Hdr8021PServiceCreateCommand;
import es.tid.cim.diagram.edit.commands.IPAddressRangeCreateCommand;
import es.tid.cim.diagram.edit.commands.IPConnectivitySubnetCreateCommand;
import es.tid.cim.diagram.edit.commands.IPHeadersFilterCreateCommand;
import es.tid.cim.diagram.edit.commands.IPProtocolEndpointCreateCommand;
import es.tid.cim.diagram.edit.commands.IPSubnetCreateCommand;
import es.tid.cim.diagram.edit.commands.IPXConnectivityNetworkCreateCommand;
import es.tid.cim.diagram.edit.commands.IPXNetworkCreateCommand;
import es.tid.cim.diagram.edit.commands.IPXProtocolEndpointCreateCommand;
import es.tid.cim.diagram.edit.commands.ISDNModemCreateCommand;
import es.tid.cim.diagram.edit.commands.LANConnectivitySegmentCreateCommand;
import es.tid.cim.diagram.edit.commands.LANEndpointCreateCommand;
import es.tid.cim.diagram.edit.commands.LANSegmentCreateCommand;
import es.tid.cim.diagram.edit.commands.LogicalFileCreateCommand;
import es.tid.cim.diagram.edit.commands.LogicalModuleCreateCommand;
import es.tid.cim.diagram.edit.commands.MPLSProtocolEndpointCreateCommand;
import es.tid.cim.diagram.edit.commands.MemoryCapacityCreateCommand;
import es.tid.cim.diagram.edit.commands.NATListBasedSettingsCreateCommand;
import es.tid.cim.diagram.edit.commands.NATServiceCreateCommand;
import es.tid.cim.diagram.edit.commands.NATStaticSettingsCreateCommand;
import es.tid.cim.diagram.edit.commands.NamedAddressCollectionCreateCommand;
import es.tid.cim.diagram.edit.commands.NetworkCreateCommand;
import es.tid.cim.diagram.edit.commands.NetworkPortCreateCommand;
import es.tid.cim.diagram.edit.commands.NextHopIPRouteCreateCommand;
import es.tid.cim.diagram.edit.commands.NextHopRoutingCreateCommand;
import es.tid.cim.diagram.edit.commands.OSPFProtocolEndpointCreateCommand;
import es.tid.cim.diagram.edit.commands.OSPFVirtualInterfaceCreateCommand;
import es.tid.cim.diagram.edit.commands.OperatingSystemCreateCommand;
import es.tid.cim.diagram.edit.commands.PowerManagementCapabilitiesCreateCommand;
import es.tid.cim.diagram.edit.commands.PrecedenceServiceCreateCommand;
import es.tid.cim.diagram.edit.commands.ProductCreateCommand;
import es.tid.cim.diagram.edit.commands.ProtocolServiceCreateCommand;
import es.tid.cim.diagram.edit.commands.RangeOfIPAddressesCreateCommand;
import es.tid.cim.diagram.edit.commands.RemoteServiceAccessPointCreateCommand;
import es.tid.cim.diagram.edit.commands.ReplacementSetCreateCommand;
import es.tid.cim.diagram.edit.commands.RoutingPolicyCreateCommand;
import es.tid.cim.diagram.edit.commands.RoutingProtocolDomainCreateCommand;
import es.tid.cim.diagram.edit.commands.SDSLModemCreateCommand;
import es.tid.cim.diagram.edit.commands.SNMPCommunityStringsCreateCommand;
import es.tid.cim.diagram.edit.commands.SNMPServiceCreateCommand;
import es.tid.cim.diagram.edit.commands.SNMPTrapTargetCreateCommand;
import es.tid.cim.diagram.edit.commands.SSHSettingDataCreateCommand;
import es.tid.cim.diagram.edit.commands.ServiceAccessURICreateCommand;
import es.tid.cim.diagram.edit.commands.SoftwareIdentityCreateCommand;
import es.tid.cim.diagram.edit.commands.SwitchPortCreateCommand;
import es.tid.cim.diagram.edit.commands.SystemSpecificCollectionCreateCommand;
import es.tid.cim.diagram.edit.commands.TCPProtocolEndpointCreateCommand;
import es.tid.cim.diagram.edit.commands.TelnetProtocolEndpointCreateCommand;
import es.tid.cim.diagram.edit.commands.TelnetSettingDataCreateCommand;
import es.tid.cim.diagram.edit.commands.UDPProtocolEndpointCreateCommand;
import es.tid.cim.diagram.edit.commands.USBDeviceCreateCommand;
import es.tid.cim.diagram.edit.commands.USBPortCreateCommand;
import es.tid.cim.diagram.edit.commands.UniModemCreateCommand;
import es.tid.cim.diagram.edit.commands.UnitaryComputerSystemCreateCommand;
import es.tid.cim.diagram.edit.commands.VDSLModemCreateCommand;
import es.tid.cim.diagram.edit.commands.VolatileStorageCreateCommand;
import es.tid.cim.diagram.edit.commands.WiFiEndPointCreateCommand;
import es.tid.cim.diagram.edit.commands.WiFiEndpointSettingsCreateCommand;
import es.tid.cim.diagram.edit.commands.WiFiPortCreateCommand;
import es.tid.cim.diagram.edit.commands.WirelessLANEndpointCreateCommand;
import es.tid.cim.diagram.edit.commands.WirelessPortCreateCommand;
import es.tid.cim.diagram.providers.CIMLevelZeroElementTypes;

/**
 * @generated
 */
public class CIM_ModelItemSemanticEditPolicy extends
		CIMLevelZeroBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (CIMLevelZeroElementTypes.USBDevice_2001 == req.getElementType()) {
			return getGEFWrapper(new USBDeviceCreateCommand(req));
		}
		if (CIMLevelZeroElementTypes.OSPFVirtualInterface_2002 == req
				.getElementType()) {
			return getGEFWrapper(new OSPFVirtualInterfaceCreateCommand(req));
		}
		if (CIMLevelZeroElementTypes.WiFiPort_2003 == req.getElementType()) {
			return getGEFWrapper(new WiFiPortCreateCommand(req));
		}
		if (CIMLevelZeroElementTypes.ProtocolService_2004 == req
				.getElementType()) {
			return getGEFWrapper(new ProtocolServiceCreateCommand(req));
		}
		if (CIMLevelZeroElementTypes.RoutingPolicy_2005 == req.getElementType()) {
			return getGEFWrapper(new RoutingPolicyCreateCommand(req));
		}
		if (CIMLevelZeroElementTypes.EnabledLogicalElementCapabilities_2006 == req
				.getElementType()) {
			return getGEFWrapper(new EnabledLogicalElementCapabilitiesCreateCommand(
					req));
		}
		if (CIMLevelZeroElementTypes.BufferPool_2007 == req.getElementType()) {
			return getGEFWrapper(new BufferPoolCreateCommand(req));
		}
		if (CIMLevelZeroElementTypes.MPLSProtocolEndpoint_2008 == req
				.getElementType()) {
			return getGEFWrapper(new MPLSProtocolEndpointCreateCommand(req));
		}
		if (CIMLevelZeroElementTypes.AutonomousSystem_2009 == req
				.getElementType()) {
			return getGEFWrapper(new AutonomousSystemCreateCommand(req));
		}
		if (CIMLevelZeroElementTypes.DNSSettingData_2010 == req
				.getElementType()) {
			return getGEFWrapper(new DNSSettingDataCreateCommand(req));
		}
		if (CIMLevelZeroElementTypes.UniModem_2011 == req.getElementType()) {
			return getGEFWrapper(new UniModemCreateCommand(req));
		}
		if (CIMLevelZeroElementTypes.EFService_2012 == req.getElementType()) {
			return getGEFWrapper(new EFServiceCreateCommand(req));
		}
		if (CIMLevelZeroElementTypes.IPSubnet_2013 == req.getElementType()) {
			return getGEFWrapper(new IPSubnetCreateCommand(req));
		}
		if (CIMLevelZeroElementTypes.NamedAddressCollection_2014 == req
				.getElementType()) {
			return getGEFWrapper(new NamedAddressCollectionCreateCommand(req));
		}
		if (CIMLevelZeroElementTypes.BIOSElement_2015 == req.getElementType()) {
			return getGEFWrapper(new BIOSElementCreateCommand(req));
		}
		if (CIMLevelZeroElementTypes.TelnetSettingData_2016 == req
				.getElementType()) {
			return getGEFWrapper(new TelnetSettingDataCreateCommand(req));
		}
		if (CIMLevelZeroElementTypes.BGPPeerGroup_2017 == req.getElementType()) {
			return getGEFWrapper(new BGPPeerGroupCreateCommand(req));
		}
		if (CIMLevelZeroElementTypes.LANConnectivitySegment_2018 == req
				.getElementType()) {
			return getGEFWrapper(new LANConnectivitySegmentCreateCommand(req));
		}
		if (CIMLevelZeroElementTypes.CableModem_2019 == req.getElementType()) {
			return getGEFWrapper(new CableModemCreateCommand(req));
		}
		if (CIMLevelZeroElementTypes.SwitchPort_2020 == req.getElementType()) {
			return getGEFWrapper(new SwitchPortCreateCommand(req));
		}
		if (CIMLevelZeroElementTypes.TCPProtocolEndpoint_2021 == req
				.getElementType()) {
			return getGEFWrapper(new TCPProtocolEndpointCreateCommand(req));
		}
		if (CIMLevelZeroElementTypes.AdministrativeDistance_2022 == req
				.getElementType()) {
			return getGEFWrapper(new AdministrativeDistanceCreateCommand(req));
		}
		if (CIMLevelZeroElementTypes.IPConnectivitySubnet_2023 == req
				.getElementType()) {
			return getGEFWrapper(new IPConnectivitySubnetCreateCommand(req));
		}
		if (CIMLevelZeroElementTypes.VolatileStorage_2024 == req
				.getElementType()) {
			return getGEFWrapper(new VolatileStorageCreateCommand(req));
		}
		if (CIMLevelZeroElementTypes.RangeOfIPAddresses_2025 == req
				.getElementType()) {
			return getGEFWrapper(new RangeOfIPAddressesCreateCommand(req));
		}
		if (CIMLevelZeroElementTypes.BGPProtocolEndpoint_2026 == req
				.getElementType()) {
			return getGEFWrapper(new BGPProtocolEndpointCreateCommand(req));
		}
		if (CIMLevelZeroElementTypes.UnitaryComputerSystem_2027 == req
				.getElementType()) {
			return getGEFWrapper(new UnitaryComputerSystemCreateCommand(req));
		}
		if (CIMLevelZeroElementTypes.EthernetPort_2028 == req.getElementType()) {
			return getGEFWrapper(new EthernetPortCreateCommand(req));
		}
		if (CIMLevelZeroElementTypes.SNMPService_2029 == req.getElementType()) {
			return getGEFWrapper(new SNMPServiceCreateCommand(req));
		}
		if (CIMLevelZeroElementTypes.LogicalModule_2030 == req.getElementType()) {
			return getGEFWrapper(new LogicalModuleCreateCommand(req));
		}
		if (CIMLevelZeroElementTypes.NextHopIPRoute_2031 == req
				.getElementType()) {
			return getGEFWrapper(new NextHopIPRouteCreateCommand(req));
		}
		if (CIMLevelZeroElementTypes.OperatingSystem_2032 == req
				.getElementType()) {
			return getGEFWrapper(new OperatingSystemCreateCommand(req));
		}
		if (CIMLevelZeroElementTypes.SDSLModem_2033 == req.getElementType()) {
			return getGEFWrapper(new SDSLModemCreateCommand(req));
		}
		if (CIMLevelZeroElementTypes.WiFiEndPoint_2034 == req.getElementType()) {
			return getGEFWrapper(new WiFiEndPointCreateCommand(req));
		}
		if (CIMLevelZeroElementTypes.NATService_2035 == req.getElementType()) {
			return getGEFWrapper(new NATServiceCreateCommand(req));
		}
		if (CIMLevelZeroElementTypes.ADSLModem_2036 == req.getElementType()) {
			return getGEFWrapper(new ADSLModemCreateCommand(req));
		}
		if (CIMLevelZeroElementTypes.LogicalFile_2037 == req.getElementType()) {
			return getGEFWrapper(new LogicalFileCreateCommand(req));
		}
		if (CIMLevelZeroElementTypes.BGPCluster_2038 == req.getElementType()) {
			return getGEFWrapper(new BGPClusterCreateCommand(req));
		}
		if (CIMLevelZeroElementTypes.ApplicationSystem_2039 == req
				.getElementType()) {
			return getGEFWrapper(new ApplicationSystemCreateCommand(req));
		}
		if (CIMLevelZeroElementTypes.SoftwareIdentity_2040 == req
				.getElementType()) {
			return getGEFWrapper(new SoftwareIdentityCreateCommand(req));
		}
		if (CIMLevelZeroElementTypes.WirelessPort_2041 == req.getElementType()) {
			return getGEFWrapper(new WirelessPortCreateCommand(req));
		}
		if (CIMLevelZeroElementTypes.CLPSettingData_2042 == req
				.getElementType()) {
			return getGEFWrapper(new CLPSettingDataCreateCommand(req));
		}
		if (CIMLevelZeroElementTypes.GenericService_2043 == req
				.getElementType()) {
			return getGEFWrapper(new GenericServiceCreateCommand(req));
		}
		if (CIMLevelZeroElementTypes.NATListBasedSettings_2044 == req
				.getElementType()) {
			return getGEFWrapper(new NATListBasedSettingsCreateCommand(req));
		}
		if (CIMLevelZeroElementTypes.VDSLModem_2045 == req.getElementType()) {
			return getGEFWrapper(new VDSLModemCreateCommand(req));
		}
		if (CIMLevelZeroElementTypes.USBPort_2046 == req.getElementType()) {
			return getGEFWrapper(new USBPortCreateCommand(req));
		}
		if (CIMLevelZeroElementTypes.DNSProtocolEndpoint_2047 == req
				.getElementType()) {
			return getGEFWrapper(new DNSProtocolEndpointCreateCommand(req));
		}
		if (CIMLevelZeroElementTypes.WiFiEndpointSettings_2048 == req
				.getElementType()) {
			return getGEFWrapper(new WiFiEndpointSettingsCreateCommand(req));
		}
		if (CIMLevelZeroElementTypes.SSHSettingData_2049 == req
				.getElementType()) {
			return getGEFWrapper(new SSHSettingDataCreateCommand(req));
		}
		if (CIMLevelZeroElementTypes.WirelessLANEndpoint_2050 == req
				.getElementType()) {
			return getGEFWrapper(new WirelessLANEndpointCreateCommand(req));
		}
		if (CIMLevelZeroElementTypes.DHCPProtocolEndpoint_2051 == req
				.getElementType()) {
			return getGEFWrapper(new DHCPProtocolEndpointCreateCommand(req));
		}
		if (CIMLevelZeroElementTypes.IPHeadersFilter_2052 == req
				.getElementType()) {
			return getGEFWrapper(new IPHeadersFilterCreateCommand(req));
		}
		if (CIMLevelZeroElementTypes.Directory_2053 == req.getElementType()) {
			return getGEFWrapper(new DirectoryCreateCommand(req));
		}
		if (CIMLevelZeroElementTypes.IPAddressRange_2054 == req
				.getElementType()) {
			return getGEFWrapper(new IPAddressRangeCreateCommand(req));
		}
		if (CIMLevelZeroElementTypes.SNMPTrapTarget_2055 == req
				.getElementType()) {
			return getGEFWrapper(new SNMPTrapTargetCreateCommand(req));
		}
		if (CIMLevelZeroElementTypes.IPXConnectivityNetwork_2056 == req
				.getElementType()) {
			return getGEFWrapper(new IPXConnectivityNetworkCreateCommand(req));
		}
		if (CIMLevelZeroElementTypes.ConnectivityMemberhipSettingData_2057 == req
				.getElementType()) {
			return getGEFWrapper(new ConnectivityMemberhipSettingDataCreateCommand(
					req));
		}
		if (CIMLevelZeroElementTypes.ConditioningService_2058 == req
				.getElementType()) {
			return getGEFWrapper(new ConditioningServiceCreateCommand(req));
		}
		if (CIMLevelZeroElementTypes.BIOSFeature_2059 == req.getElementType()) {
			return getGEFWrapper(new BIOSFeatureCreateCommand(req));
		}
		if (CIMLevelZeroElementTypes.OSPFProtocolEndpoint_2060 == req
				.getElementType()) {
			return getGEFWrapper(new OSPFProtocolEndpointCreateCommand(req));
		}
		if (CIMLevelZeroElementTypes.FilterList_2061 == req.getElementType()) {
			return getGEFWrapper(new FilterListCreateCommand(req));
		}
		if (CIMLevelZeroElementTypes.BGPService_2062 == req.getElementType()) {
			return getGEFWrapper(new BGPServiceCreateCommand(req));
		}
		if (CIMLevelZeroElementTypes.PrecedenceService_2063 == req
				.getElementType()) {
			return getGEFWrapper(new PrecedenceServiceCreateCommand(req));
		}
		if (CIMLevelZeroElementTypes.DHCPCapabilities_2064 == req
				.getElementType()) {
			return getGEFWrapper(new DHCPCapabilitiesCreateCommand(req));
		}
		if (CIMLevelZeroElementTypes.Hdr8021PService_2065 == req
				.getElementType()) {
			return getGEFWrapper(new Hdr8021PServiceCreateCommand(req));
		}
		if (CIMLevelZeroElementTypes.ReplacementSet_2066 == req
				.getElementType()) {
			return getGEFWrapper(new ReplacementSetCreateCommand(req));
		}
		if (CIMLevelZeroElementTypes.HDSLModem_2067 == req.getElementType()) {
			return getGEFWrapper(new HDSLModemCreateCommand(req));
		}
		if (CIMLevelZeroElementTypes.ServiceAccessURI_2068 == req
				.getElementType()) {
			return getGEFWrapper(new ServiceAccessURICreateCommand(req));
		}
		if (CIMLevelZeroElementTypes.FilterEntry_2069 == req.getElementType()) {
			return getGEFWrapper(new FilterEntryCreateCommand(req));
		}
		if (CIMLevelZeroElementTypes.SNMPCommunityStrings_2070 == req
				.getElementType()) {
			return getGEFWrapper(new SNMPCommunityStringsCreateCommand(req));
		}
		if (CIMLevelZeroElementTypes.Network_2071 == req.getElementType()) {
			return getGEFWrapper(new NetworkCreateCommand(req));
		}
		if (CIMLevelZeroElementTypes.FileSpecification_2072 == req
				.getElementType()) {
			return getGEFWrapper(new FileSpecificationCreateCommand(req));
		}
		if (CIMLevelZeroElementTypes.IPXNetwork_2073 == req.getElementType()) {
			return getGEFWrapper(new IPXNetworkCreateCommand(req));
		}
		if (CIMLevelZeroElementTypes.PowerManagementCapabilities_2074 == req
				.getElementType()) {
			return getGEFWrapper(new PowerManagementCapabilitiesCreateCommand(
					req));
		}
		if (CIMLevelZeroElementTypes.FlowService_2075 == req.getElementType()) {
			return getGEFWrapper(new FlowServiceCreateCommand(req));
		}
		if (CIMLevelZeroElementTypes.ISDNModem_2076 == req.getElementType()) {
			return getGEFWrapper(new ISDNModemCreateCommand(req));
		}
		if (CIMLevelZeroElementTypes.IPXProtocolEndpoint_2077 == req
				.getElementType()) {
			return getGEFWrapper(new IPXProtocolEndpointCreateCommand(req));
		}
		if (CIMLevelZeroElementTypes.IPProtocolEndpoint_2078 == req
				.getElementType()) {
			return getGEFWrapper(new IPProtocolEndpointCreateCommand(req));
		}
		if (CIMLevelZeroElementTypes.UDPProtocolEndpoint_2079 == req
				.getElementType()) {
			return getGEFWrapper(new UDPProtocolEndpointCreateCommand(req));
		}
		if (CIMLevelZeroElementTypes.Product_2080 == req.getElementType()) {
			return getGEFWrapper(new ProductCreateCommand(req));
		}
		if (CIMLevelZeroElementTypes.MemoryCapacity_2081 == req
				.getElementType()) {
			return getGEFWrapper(new MemoryCapacityCreateCommand(req));
		}
		if (CIMLevelZeroElementTypes.RoutingProtocolDomain_2082 == req
				.getElementType()) {
			return getGEFWrapper(new RoutingProtocolDomainCreateCommand(req));
		}
		if (CIMLevelZeroElementTypes.AFService_2083 == req.getElementType()) {
			return getGEFWrapper(new AFServiceCreateCommand(req));
		}
		if (CIMLevelZeroElementTypes.LANSegment_2084 == req.getElementType()) {
			return getGEFWrapper(new LANSegmentCreateCommand(req));
		}
		if (CIMLevelZeroElementTypes.NATStaticSettings_2085 == req
				.getElementType()) {
			return getGEFWrapper(new NATStaticSettingsCreateCommand(req));
		}
		if (CIMLevelZeroElementTypes.TelnetProtocolEndpoint_2086 == req
				.getElementType()) {
			return getGEFWrapper(new TelnetProtocolEndpointCreateCommand(req));
		}
		if (CIMLevelZeroElementTypes.LANEndpoint_2087 == req.getElementType()) {
			return getGEFWrapper(new LANEndpointCreateCommand(req));
		}
		if (CIMLevelZeroElementTypes.DropThresholdCalculationService_2088 == req
				.getElementType()) {
			return getGEFWrapper(new DropThresholdCalculationServiceCreateCommand(
					req));
		}
		if (CIMLevelZeroElementTypes.AdminDomain_2089 == req.getElementType()) {
			return getGEFWrapper(new AdminDomainCreateCommand(req));
		}
		if (CIMLevelZeroElementTypes.SystemSpecificCollection_2090 == req
				.getElementType()) {
			return getGEFWrapper(new SystemSpecificCollectionCreateCommand(req));
		}
		if (CIMLevelZeroElementTypes.NextHopRouting_2091 == req
				.getElementType()) {
			return getGEFWrapper(new NextHopRoutingCreateCommand(req));
		}
		if (CIMLevelZeroElementTypes.ComputerSystem_2092 == req
				.getElementType()) {
			return getGEFWrapper(new ComputerSystemCreateCommand(req));
		}
		if (CIMLevelZeroElementTypes.NetworkPort_2093 == req.getElementType()) {
			return getGEFWrapper(new NetworkPortCreateCommand(req));
		}
		if (CIMLevelZeroElementTypes.RemoteServiceAccessPoint_2094 == req
				.getElementType()) {
			return getGEFWrapper(new RemoteServiceAccessPointCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost())
				.getEditingDomain();
		return getGEFWrapper(new DuplicateAnythingCommand(editingDomain, req));
	}

	/**
	 * @generated
	 */
	private static class DuplicateAnythingCommand extends
			DuplicateEObjectsCommand {

		/**
		 * @generated
		 */
		public DuplicateAnythingCommand(
				TransactionalEditingDomain editingDomain,
				DuplicateElementsRequest req) {
			super(editingDomain, req.getLabel(), req
					.getElementsToBeDuplicated(), req
					.getAllDuplicatedElementsMap());
		}

	}

}
