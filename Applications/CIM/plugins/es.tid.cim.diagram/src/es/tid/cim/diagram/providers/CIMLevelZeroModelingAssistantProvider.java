package es.tid.cim.diagram.providers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.modelingassistant.ModelingAssistantProvider;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;

import es.tid.cim.diagram.edit.parts.AFServiceEditPart;
import es.tid.cim.diagram.edit.parts.AdminDomainEditPart;
import es.tid.cim.diagram.edit.parts.AdministrativeDistanceEditPart;
import es.tid.cim.diagram.edit.parts.AutonomousSystemEditPart;
import es.tid.cim.diagram.edit.parts.BGPClusterEditPart;
import es.tid.cim.diagram.edit.parts.BGPPeerGroupEditPart;
import es.tid.cim.diagram.edit.parts.BGPServiceEditPart;
import es.tid.cim.diagram.edit.parts.CIM_ModelEditPart;
import es.tid.cim.diagram.edit.parts.ComputerSystemEditPart;
import es.tid.cim.diagram.edit.parts.ConditioningServiceEditPart;
import es.tid.cim.diagram.edit.parts.FileSpecificationEditPart;
import es.tid.cim.diagram.edit.parts.FilterListEditPart;
import es.tid.cim.diagram.edit.parts.LANEndpointEditPart;
import es.tid.cim.diagram.edit.parts.LANSegmentEditPart;
import es.tid.cim.diagram.edit.parts.LogicalModuleEditPart;
import es.tid.cim.diagram.edit.parts.NATListBasedSettingsEditPart;
import es.tid.cim.diagram.edit.parts.NATServiceEditPart;
import es.tid.cim.diagram.edit.parts.NetworkPortEditPart;
import es.tid.cim.diagram.edit.parts.NextHopRoutingEditPart;
import es.tid.cim.diagram.edit.parts.OperatingSystemEditPart;
import es.tid.cim.diagram.edit.parts.ProductEditPart;
import es.tid.cim.diagram.edit.parts.RangeOfIPAddressesEditPart;
import es.tid.cim.diagram.edit.parts.RemoteServiceAccessPointEditPart;
import es.tid.cim.diagram.edit.parts.RoutingPolicyEditPart;
import es.tid.cim.diagram.edit.parts.RoutingProtocolDomainEditPart;
import es.tid.cim.diagram.edit.parts.SNMPServiceEditPart;
import es.tid.cim.diagram.edit.parts.SoftwareIdentityEditPart;
import es.tid.cim.diagram.edit.parts.SystemSpecificCollectionEditPart;
import es.tid.cim.diagram.part.CIMLevelZeroDiagramEditorPlugin;
import es.tid.cim.diagram.part.Messages;

/**
 * @generated
 */
public class CIMLevelZeroModelingAssistantProvider extends
		ModelingAssistantProvider {

	/**
	 * @generated
	 */
	public List getTypesForPopupBar(IAdaptable host) {
		IGraphicalEditPart editPart = (IGraphicalEditPart) host
				.getAdapter(IGraphicalEditPart.class);
		if (editPart instanceof CIM_ModelEditPart) {
			List types = new ArrayList();
			types.add(CIMLevelZeroElementTypes.USBDevice_2001);
			types.add(CIMLevelZeroElementTypes.OSPFVirtualInterface_2002);
			types.add(CIMLevelZeroElementTypes.WiFiPort_2003);
			types.add(CIMLevelZeroElementTypes.ProtocolService_2004);
			types.add(CIMLevelZeroElementTypes.RoutingPolicy_2005);
			types
					.add(CIMLevelZeroElementTypes.EnabledLogicalElementCapabilities_2006);
			types.add(CIMLevelZeroElementTypes.BufferPool_2007);
			types.add(CIMLevelZeroElementTypes.MPLSProtocolEndpoint_2008);
			types.add(CIMLevelZeroElementTypes.AutonomousSystem_2009);
			types.add(CIMLevelZeroElementTypes.DNSSettingData_2010);
			types.add(CIMLevelZeroElementTypes.UniModem_2011);
			types.add(CIMLevelZeroElementTypes.EFService_2012);
			types.add(CIMLevelZeroElementTypes.IPSubnet_2013);
			types.add(CIMLevelZeroElementTypes.NamedAddressCollection_2014);
			types.add(CIMLevelZeroElementTypes.BIOSElement_2015);
			types.add(CIMLevelZeroElementTypes.TelnetSettingData_2016);
			types.add(CIMLevelZeroElementTypes.BGPPeerGroup_2017);
			types.add(CIMLevelZeroElementTypes.LANConnectivitySegment_2018);
			types.add(CIMLevelZeroElementTypes.CableModem_2019);
			types.add(CIMLevelZeroElementTypes.SwitchPort_2020);
			types.add(CIMLevelZeroElementTypes.TCPProtocolEndpoint_2021);
			types.add(CIMLevelZeroElementTypes.AdministrativeDistance_2022);
			types.add(CIMLevelZeroElementTypes.IPConnectivitySubnet_2023);
			types.add(CIMLevelZeroElementTypes.VolatileStorage_2024);
			types.add(CIMLevelZeroElementTypes.RangeOfIPAddresses_2025);
			types.add(CIMLevelZeroElementTypes.BGPProtocolEndpoint_2026);
			types.add(CIMLevelZeroElementTypes.UnitaryComputerSystem_2027);
			types.add(CIMLevelZeroElementTypes.EthernetPort_2028);
			types.add(CIMLevelZeroElementTypes.SNMPService_2029);
			types.add(CIMLevelZeroElementTypes.LogicalModule_2030);
			types.add(CIMLevelZeroElementTypes.NextHopIPRoute_2031);
			types.add(CIMLevelZeroElementTypes.OperatingSystem_2032);
			types.add(CIMLevelZeroElementTypes.SDSLModem_2033);
			types.add(CIMLevelZeroElementTypes.WiFiEndPoint_2034);
			types.add(CIMLevelZeroElementTypes.NATService_2035);
			types.add(CIMLevelZeroElementTypes.ADSLModem_2036);
			types.add(CIMLevelZeroElementTypes.LogicalFile_2037);
			types.add(CIMLevelZeroElementTypes.BGPCluster_2038);
			types.add(CIMLevelZeroElementTypes.ApplicationSystem_2039);
			types.add(CIMLevelZeroElementTypes.SoftwareIdentity_2040);
			types.add(CIMLevelZeroElementTypes.WirelessPort_2041);
			types.add(CIMLevelZeroElementTypes.CLPSettingData_2042);
			types.add(CIMLevelZeroElementTypes.GenericService_2043);
			types.add(CIMLevelZeroElementTypes.NATListBasedSettings_2044);
			types.add(CIMLevelZeroElementTypes.VDSLModem_2045);
			types.add(CIMLevelZeroElementTypes.USBPort_2046);
			types.add(CIMLevelZeroElementTypes.DNSProtocolEndpoint_2047);
			types.add(CIMLevelZeroElementTypes.WiFiEndpointSettings_2048);
			types.add(CIMLevelZeroElementTypes.SSHSettingData_2049);
			types.add(CIMLevelZeroElementTypes.WirelessLANEndpoint_2050);
			types.add(CIMLevelZeroElementTypes.DHCPProtocolEndpoint_2051);
			types.add(CIMLevelZeroElementTypes.IPHeadersFilter_2052);
			types.add(CIMLevelZeroElementTypes.Directory_2053);
			types.add(CIMLevelZeroElementTypes.IPAddressRange_2054);
			types.add(CIMLevelZeroElementTypes.SNMPTrapTarget_2055);
			types.add(CIMLevelZeroElementTypes.IPXConnectivityNetwork_2056);
			types
					.add(CIMLevelZeroElementTypes.ConnectivityMemberhipSettingData_2057);
			types.add(CIMLevelZeroElementTypes.ConditioningService_2058);
			types.add(CIMLevelZeroElementTypes.BIOSFeature_2059);
			types.add(CIMLevelZeroElementTypes.OSPFProtocolEndpoint_2060);
			types.add(CIMLevelZeroElementTypes.FilterList_2061);
			types.add(CIMLevelZeroElementTypes.BGPService_2062);
			types.add(CIMLevelZeroElementTypes.PrecedenceService_2063);
			types.add(CIMLevelZeroElementTypes.DHCPCapabilities_2064);
			types.add(CIMLevelZeroElementTypes.Hdr8021PService_2065);
			types.add(CIMLevelZeroElementTypes.ReplacementSet_2066);
			types.add(CIMLevelZeroElementTypes.HDSLModem_2067);
			types.add(CIMLevelZeroElementTypes.ServiceAccessURI_2068);
			types.add(CIMLevelZeroElementTypes.FilterEntry_2069);
			types.add(CIMLevelZeroElementTypes.SNMPCommunityStrings_2070);
			types.add(CIMLevelZeroElementTypes.Network_2071);
			types.add(CIMLevelZeroElementTypes.FileSpecification_2072);
			types.add(CIMLevelZeroElementTypes.IPXNetwork_2073);
			types
					.add(CIMLevelZeroElementTypes.PowerManagementCapabilities_2074);
			types.add(CIMLevelZeroElementTypes.FlowService_2075);
			types.add(CIMLevelZeroElementTypes.ISDNModem_2076);
			types.add(CIMLevelZeroElementTypes.IPXProtocolEndpoint_2077);
			types.add(CIMLevelZeroElementTypes.IPProtocolEndpoint_2078);
			types.add(CIMLevelZeroElementTypes.UDPProtocolEndpoint_2079);
			types.add(CIMLevelZeroElementTypes.Product_2080);
			types.add(CIMLevelZeroElementTypes.MemoryCapacity_2081);
			types.add(CIMLevelZeroElementTypes.RoutingProtocolDomain_2082);
			types.add(CIMLevelZeroElementTypes.AFService_2083);
			types.add(CIMLevelZeroElementTypes.LANSegment_2084);
			types.add(CIMLevelZeroElementTypes.NATStaticSettings_2085);
			types.add(CIMLevelZeroElementTypes.TelnetProtocolEndpoint_2086);
			types.add(CIMLevelZeroElementTypes.LANEndpoint_2087);
			types
					.add(CIMLevelZeroElementTypes.DropThresholdCalculationService_2088);
			types.add(CIMLevelZeroElementTypes.AdminDomain_2089);
			types.add(CIMLevelZeroElementTypes.SystemSpecificCollection_2090);
			types.add(CIMLevelZeroElementTypes.NextHopRouting_2091);
			types.add(CIMLevelZeroElementTypes.ComputerSystem_2092);
			types.add(CIMLevelZeroElementTypes.NetworkPort_2093);
			types.add(CIMLevelZeroElementTypes.RemoteServiceAccessPoint_2094);
			return types;
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		if (sourceEditPart instanceof AutonomousSystemEditPart) {
			List types = new ArrayList();
			types.add(CIMLevelZeroElementTypes.AutonomousSystemRouterInAS_4063);
			types
					.add(CIMLevelZeroElementTypes.AutonomousSystemRoutingProtocolDomainInAS_4066);
			return types;
		}
		if (sourceEditPart instanceof SNMPServiceEditPart) {
			List types = new ArrayList();
			types
					.add(CIMLevelZeroElementTypes.SNMPServiceTrapSourceForSNMPService_4070);
			return types;
		}
		if (sourceEditPart instanceof LogicalModuleEditPart) {
			List types = new ArrayList();
			types.add(CIMLevelZeroElementTypes.LogicalModuleModulePort_4038);
			return types;
		}
		if (sourceEditPart instanceof OperatingSystemEditPart) {
			List types = new ArrayList();
			types
					.add(CIMLevelZeroElementTypes.OperatingSystemOperatingSystemSoftwareFeature_4002);
			return types;
		}
		if (sourceEditPart instanceof NATServiceEditPart) {
			List types = new ArrayList();
			types
					.add(CIMLevelZeroElementTypes.NATServiceNATServiceRunningOnEndpoint_4058);
			return types;
		}
		if (sourceEditPart instanceof BGPClusterEditPart) {
			List types = new ArrayList();
			types
					.add(CIMLevelZeroElementTypes.BGPClusterReflectorClientService_4007);
			types
					.add(CIMLevelZeroElementTypes.BGPClusterReflectorNonClientService_4008);
			types.add(CIMLevelZeroElementTypes.BGPClusterReflectorService_4009);
			types
					.add(CIMLevelZeroElementTypes.BGPClusterRoutersInBGPCluster_4064);
			return types;
		}
		if (sourceEditPart instanceof SoftwareIdentityEditPart) {
			List types = new ArrayList();
			types
					.add(CIMLevelZeroElementTypes.SoftwareIdentityElementSoftwareIdentity_4019);
			return types;
		}
		if (sourceEditPart instanceof NATListBasedSettingsEditPart) {
			List types = new ArrayList();
			types
					.add(CIMLevelZeroElementTypes.NATListBasedSettingsAddressesToBeTranslated_4043);
			types
					.add(CIMLevelZeroElementTypes.NATListBasedSettingsTranslationPoolForNAT_4069);
			return types;
		}
		if (sourceEditPart instanceof BGPServiceEditPart) {
			List types = new ArrayList();
			types
					.add(CIMLevelZeroElementTypes.BGPServiceBGPPeerGroupServices_4006);
			types.add(CIMLevelZeroElementTypes.BGPServiceBGPAdminDistance_4044);
			return types;
		}
		if (sourceEditPart instanceof ProductEditPart) {
			List types = new ArrayList();
			types
					.add(CIMLevelZeroElementTypes.ProductProductProductDependency_4025);
			types
					.add(CIMLevelZeroElementTypes.ProductProductServiceComponent_4026);
			return types;
		}
		if (sourceEditPart instanceof AFServiceEditPart) {
			List types = new ArrayList();
			types.add(CIMLevelZeroElementTypes.AFServiceAFRelatedServices_4039);
			return types;
		}
		if (sourceEditPart instanceof LANSegmentEditPart) {
			List types = new ArrayList();
			types.add(CIMLevelZeroElementTypes.LANSegmentInSegment_4057);
			return types;
		}
		if (sourceEditPart instanceof AdminDomainEditPart) {
			List types = new ArrayList();
			types.add(CIMLevelZeroElementTypes.AdminDomainContainedDomain_4012);
			types
					.add(CIMLevelZeroElementTypes.AdminDomainNetworksInAdminDomain_4059);
			return types;
		}
		if (sourceEditPart instanceof ComputerSystemEditPart) {
			List types = new ArrayList();
			types
					.add(CIMLevelZeroElementTypes.ComputerSystemHostedFilterList_4051);
			types
					.add(CIMLevelZeroElementTypes.ComputerSystemHostedForwardingServices_4052);
			types
					.add(CIMLevelZeroElementTypes.ComputerSystemHostedRoutingPolicy_4054);
			types.add(CIMLevelZeroElementTypes.ComputerSystemRunningOS_4067);
			return types;
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		if (targetEditPart instanceof RoutingPolicyEditPart) {
			List types = new ArrayList();
			types
					.add(CIMLevelZeroElementTypes.ComputerSystemHostedRoutingPolicy_4054);
			return types;
		}
		if (targetEditPart instanceof BGPPeerGroupEditPart) {
			List types = new ArrayList();
			types
					.add(CIMLevelZeroElementTypes.BGPServiceBGPPeerGroupServices_4006);
			return types;
		}
		if (targetEditPart instanceof AdministrativeDistanceEditPart) {
			List types = new ArrayList();
			types.add(CIMLevelZeroElementTypes.BGPServiceBGPAdminDistance_4044);
			return types;
		}
		if (targetEditPart instanceof RangeOfIPAddressesEditPart) {
			List types = new ArrayList();
			types
					.add(CIMLevelZeroElementTypes.NATListBasedSettingsTranslationPoolForNAT_4069);
			return types;
		}
		if (targetEditPart instanceof OperatingSystemEditPart) {
			List types = new ArrayList();
			types.add(CIMLevelZeroElementTypes.ComputerSystemRunningOS_4067);
			return types;
		}
		if (targetEditPart instanceof ConditioningServiceEditPart) {
			List types = new ArrayList();
			types
					.add(CIMLevelZeroElementTypes.QoSServiceQoSConditioningSubService_4040);
			types
					.add(CIMLevelZeroElementTypes.ProtocolEndpointEgressConditioningServiceOnEndpoint_4047);
			types
					.add(CIMLevelZeroElementTypes.ProtocolEndpointIngressConditioningServiceOnEndpoint_4055);
			return types;
		}
		if (targetEditPart instanceof FilterListEditPart) {
			List types = new ArrayList();
			types
					.add(CIMLevelZeroElementTypes.NATListBasedSettingsAddressesToBeTranslated_4043);
			types
					.add(CIMLevelZeroElementTypes.ComputerSystemHostedFilterList_4051);
			return types;
		}
		if (targetEditPart instanceof BGPServiceEditPart) {
			List types = new ArrayList();
			types
					.add(CIMLevelZeroElementTypes.BGPClusterReflectorClientService_4007);
			types
					.add(CIMLevelZeroElementTypes.BGPClusterReflectorNonClientService_4008);
			types.add(CIMLevelZeroElementTypes.BGPClusterReflectorService_4009);
			return types;
		}
		if (targetEditPart instanceof FileSpecificationEditPart) {
			List types = new ArrayList();
			types
					.add(CIMLevelZeroElementTypes.DirectorySpecificationDirectorySpecificationFiles_4001);
			return types;
		}
		if (targetEditPart instanceof ProductEditPart) {
			List types = new ArrayList();
			types
					.add(CIMLevelZeroElementTypes.ProductProductProductDependency_4025);
			return types;
		}
		if (targetEditPart instanceof RoutingProtocolDomainEditPart) {
			List types = new ArrayList();
			types
					.add(CIMLevelZeroElementTypes.AutonomousSystemRoutingProtocolDomainInAS_4066);
			return types;
		}
		if (targetEditPart instanceof AFServiceEditPart) {
			List types = new ArrayList();
			types.add(CIMLevelZeroElementTypes.AFServiceAFRelatedServices_4039);
			return types;
		}
		if (targetEditPart instanceof LANEndpointEditPart) {
			List types = new ArrayList();
			types
					.add(CIMLevelZeroElementTypes.ServiceAccessPointBindsToLANEndpoint_4045);
			types.add(CIMLevelZeroElementTypes.LANSegmentInSegment_4057);
			return types;
		}
		if (targetEditPart instanceof AdminDomainEditPart) {
			List types = new ArrayList();
			types.add(CIMLevelZeroElementTypes.AdminDomainContainedDomain_4012);
			return types;
		}
		if (targetEditPart instanceof SystemSpecificCollectionEditPart) {
			List types = new ArrayList();
			types.add(CIMLevelZeroElementTypes.SystemHostedCollection_4021);
			return types;
		}
		if (targetEditPart instanceof NextHopRoutingEditPart) {
			List types = new ArrayList();
			types
					.add(CIMLevelZeroElementTypes.ForwardingServiceRouteForwardedByService_4062);
			return types;
		}
		if (targetEditPart instanceof ComputerSystemEditPart) {
			List types = new ArrayList();
			types.add(CIMLevelZeroElementTypes.AutonomousSystemRouterInAS_4063);
			types
					.add(CIMLevelZeroElementTypes.BGPClusterRoutersInBGPCluster_4064);
			return types;
		}
		if (targetEditPart instanceof NetworkPortEditPart) {
			List types = new ArrayList();
			types.add(CIMLevelZeroElementTypes.LogicalModuleModulePort_4038);
			return types;
		}
		if (targetEditPart instanceof RemoteServiceAccessPointEditPart) {
			List types = new ArrayList();
			types
					.add(CIMLevelZeroElementTypes.EnabledLogicalElementRemoteAccessAvailableToElement_4027);
			types
					.add(CIMLevelZeroElementTypes.NextHopRouteAssociatedNextHop_4071);
			return types;
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnSourceAndTarget(IAdaptable source,
			IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		if (sourceEditPart instanceof AutonomousSystemEditPart) {
			List types = new ArrayList();
			if (targetEditPart instanceof ComputerSystemEditPart) {
				types
						.add(CIMLevelZeroElementTypes.AutonomousSystemRouterInAS_4063);
			}
			if (targetEditPart instanceof RoutingProtocolDomainEditPart) {
				types
						.add(CIMLevelZeroElementTypes.AutonomousSystemRoutingProtocolDomainInAS_4066);
			}
			return types;
		}
		if (sourceEditPart instanceof SNMPServiceEditPart) {
			List types = new ArrayList();
			return types;
		}
		if (sourceEditPart instanceof LogicalModuleEditPart) {
			List types = new ArrayList();
			if (targetEditPart instanceof NetworkPortEditPart) {
				types
						.add(CIMLevelZeroElementTypes.LogicalModuleModulePort_4038);
			}
			return types;
		}
		if (sourceEditPart instanceof OperatingSystemEditPart) {
			List types = new ArrayList();
			return types;
		}
		if (sourceEditPart instanceof NATServiceEditPart) {
			List types = new ArrayList();
			return types;
		}
		if (sourceEditPart instanceof BGPClusterEditPart) {
			List types = new ArrayList();
			if (targetEditPart instanceof BGPServiceEditPart) {
				types
						.add(CIMLevelZeroElementTypes.BGPClusterReflectorClientService_4007);
			}
			if (targetEditPart instanceof BGPServiceEditPart) {
				types
						.add(CIMLevelZeroElementTypes.BGPClusterReflectorNonClientService_4008);
			}
			if (targetEditPart instanceof BGPServiceEditPart) {
				types
						.add(CIMLevelZeroElementTypes.BGPClusterReflectorService_4009);
			}
			if (targetEditPart instanceof ComputerSystemEditPart) {
				types
						.add(CIMLevelZeroElementTypes.BGPClusterRoutersInBGPCluster_4064);
			}
			return types;
		}
		if (sourceEditPart instanceof SoftwareIdentityEditPart) {
			List types = new ArrayList();
			return types;
		}
		if (sourceEditPart instanceof NATListBasedSettingsEditPart) {
			List types = new ArrayList();
			if (targetEditPart instanceof FilterListEditPart) {
				types
						.add(CIMLevelZeroElementTypes.NATListBasedSettingsAddressesToBeTranslated_4043);
			}
			if (targetEditPart instanceof RangeOfIPAddressesEditPart) {
				types
						.add(CIMLevelZeroElementTypes.NATListBasedSettingsTranslationPoolForNAT_4069);
			}
			return types;
		}
		if (sourceEditPart instanceof BGPServiceEditPart) {
			List types = new ArrayList();
			if (targetEditPart instanceof BGPPeerGroupEditPart) {
				types
						.add(CIMLevelZeroElementTypes.BGPServiceBGPPeerGroupServices_4006);
			}
			if (targetEditPart instanceof AdministrativeDistanceEditPart) {
				types
						.add(CIMLevelZeroElementTypes.BGPServiceBGPAdminDistance_4044);
			}
			return types;
		}
		if (sourceEditPart instanceof ProductEditPart) {
			List types = new ArrayList();
			if (targetEditPart instanceof ProductEditPart) {
				types
						.add(CIMLevelZeroElementTypes.ProductProductProductDependency_4025);
			}
			return types;
		}
		if (sourceEditPart instanceof AFServiceEditPart) {
			List types = new ArrayList();
			if (targetEditPart instanceof AFServiceEditPart) {
				types
						.add(CIMLevelZeroElementTypes.AFServiceAFRelatedServices_4039);
			}
			return types;
		}
		if (sourceEditPart instanceof LANSegmentEditPart) {
			List types = new ArrayList();
			if (targetEditPart instanceof LANEndpointEditPart) {
				types.add(CIMLevelZeroElementTypes.LANSegmentInSegment_4057);
			}
			return types;
		}
		if (sourceEditPart instanceof AdminDomainEditPart) {
			List types = new ArrayList();
			if (targetEditPart instanceof AdminDomainEditPart) {
				types
						.add(CIMLevelZeroElementTypes.AdminDomainContainedDomain_4012);
			}
			return types;
		}
		if (sourceEditPart instanceof ComputerSystemEditPart) {
			List types = new ArrayList();
			if (targetEditPart instanceof FilterListEditPart) {
				types
						.add(CIMLevelZeroElementTypes.ComputerSystemHostedFilterList_4051);
			}
			if (targetEditPart instanceof RoutingPolicyEditPart) {
				types
						.add(CIMLevelZeroElementTypes.ComputerSystemHostedRoutingPolicy_4054);
			}
			if (targetEditPart instanceof OperatingSystemEditPart) {
				types
						.add(CIMLevelZeroElementTypes.ComputerSystemRunningOS_4067);
			}
			return types;
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getTypesForSource(IAdaptable target,
			IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		if (targetEditPart instanceof RoutingPolicyEditPart) {
			List types = new ArrayList();
			if (relationshipType == CIMLevelZeroElementTypes.ComputerSystemHostedRoutingPolicy_4054) {
				types.add(CIMLevelZeroElementTypes.ComputerSystem_2092);
			}
			return types;
		}
		if (targetEditPart instanceof BGPPeerGroupEditPart) {
			List types = new ArrayList();
			if (relationshipType == CIMLevelZeroElementTypes.BGPServiceBGPPeerGroupServices_4006) {
				types.add(CIMLevelZeroElementTypes.BGPService_2062);
			}
			return types;
		}
		if (targetEditPart instanceof AdministrativeDistanceEditPart) {
			List types = new ArrayList();
			if (relationshipType == CIMLevelZeroElementTypes.BGPServiceBGPAdminDistance_4044) {
				types.add(CIMLevelZeroElementTypes.BGPService_2062);
			}
			return types;
		}
		if (targetEditPart instanceof RangeOfIPAddressesEditPart) {
			List types = new ArrayList();
			if (relationshipType == CIMLevelZeroElementTypes.NATListBasedSettingsTranslationPoolForNAT_4069) {
				types.add(CIMLevelZeroElementTypes.NATListBasedSettings_2044);
			}
			return types;
		}
		if (targetEditPart instanceof OperatingSystemEditPart) {
			List types = new ArrayList();
			if (relationshipType == CIMLevelZeroElementTypes.ComputerSystemRunningOS_4067) {
				types.add(CIMLevelZeroElementTypes.ComputerSystem_2092);
			}
			return types;
		}
		if (targetEditPart instanceof ConditioningServiceEditPart) {
			List types = new ArrayList();
			return types;
		}
		if (targetEditPart instanceof FilterListEditPart) {
			List types = new ArrayList();
			if (relationshipType == CIMLevelZeroElementTypes.NATListBasedSettingsAddressesToBeTranslated_4043) {
				types.add(CIMLevelZeroElementTypes.NATListBasedSettings_2044);
			}
			if (relationshipType == CIMLevelZeroElementTypes.ComputerSystemHostedFilterList_4051) {
				types.add(CIMLevelZeroElementTypes.ComputerSystem_2092);
			}
			return types;
		}
		if (targetEditPart instanceof BGPServiceEditPart) {
			List types = new ArrayList();
			if (relationshipType == CIMLevelZeroElementTypes.BGPClusterReflectorClientService_4007) {
				types.add(CIMLevelZeroElementTypes.BGPCluster_2038);
			}
			if (relationshipType == CIMLevelZeroElementTypes.BGPClusterReflectorNonClientService_4008) {
				types.add(CIMLevelZeroElementTypes.BGPCluster_2038);
			}
			if (relationshipType == CIMLevelZeroElementTypes.BGPClusterReflectorService_4009) {
				types.add(CIMLevelZeroElementTypes.BGPCluster_2038);
			}
			return types;
		}
		if (targetEditPart instanceof FileSpecificationEditPart) {
			List types = new ArrayList();
			return types;
		}
		if (targetEditPart instanceof ProductEditPart) {
			List types = new ArrayList();
			if (relationshipType == CIMLevelZeroElementTypes.ProductProductProductDependency_4025) {
				types.add(CIMLevelZeroElementTypes.Product_2080);
			}
			return types;
		}
		if (targetEditPart instanceof RoutingProtocolDomainEditPart) {
			List types = new ArrayList();
			if (relationshipType == CIMLevelZeroElementTypes.AutonomousSystemRoutingProtocolDomainInAS_4066) {
				types.add(CIMLevelZeroElementTypes.AutonomousSystem_2009);
			}
			return types;
		}
		if (targetEditPart instanceof AFServiceEditPart) {
			List types = new ArrayList();
			if (relationshipType == CIMLevelZeroElementTypes.AFServiceAFRelatedServices_4039) {
				types.add(CIMLevelZeroElementTypes.AFService_2083);
			}
			return types;
		}
		if (targetEditPart instanceof LANEndpointEditPart) {
			List types = new ArrayList();
			if (relationshipType == CIMLevelZeroElementTypes.LANSegmentInSegment_4057) {
				types.add(CIMLevelZeroElementTypes.LANSegment_2084);
			}
			return types;
		}
		if (targetEditPart instanceof AdminDomainEditPart) {
			List types = new ArrayList();
			if (relationshipType == CIMLevelZeroElementTypes.AdminDomainContainedDomain_4012) {
				types.add(CIMLevelZeroElementTypes.AdminDomain_2089);
			}
			return types;
		}
		if (targetEditPart instanceof SystemSpecificCollectionEditPart) {
			List types = new ArrayList();
			return types;
		}
		if (targetEditPart instanceof NextHopRoutingEditPart) {
			List types = new ArrayList();
			return types;
		}
		if (targetEditPart instanceof ComputerSystemEditPart) {
			List types = new ArrayList();
			if (relationshipType == CIMLevelZeroElementTypes.AutonomousSystemRouterInAS_4063) {
				types.add(CIMLevelZeroElementTypes.AutonomousSystem_2009);
			}
			if (relationshipType == CIMLevelZeroElementTypes.BGPClusterRoutersInBGPCluster_4064) {
				types.add(CIMLevelZeroElementTypes.BGPCluster_2038);
			}
			return types;
		}
		if (targetEditPart instanceof NetworkPortEditPart) {
			List types = new ArrayList();
			if (relationshipType == CIMLevelZeroElementTypes.LogicalModuleModulePort_4038) {
				types.add(CIMLevelZeroElementTypes.LogicalModule_2030);
			}
			return types;
		}
		if (targetEditPart instanceof RemoteServiceAccessPointEditPart) {
			List types = new ArrayList();
			return types;
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getTypesForTarget(IAdaptable source,
			IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		if (sourceEditPart instanceof AutonomousSystemEditPart) {
			List types = new ArrayList();
			if (relationshipType == CIMLevelZeroElementTypes.AutonomousSystemRouterInAS_4063) {
				types.add(CIMLevelZeroElementTypes.ComputerSystem_2092);
			}
			if (relationshipType == CIMLevelZeroElementTypes.AutonomousSystemRoutingProtocolDomainInAS_4066) {
				types.add(CIMLevelZeroElementTypes.RoutingProtocolDomain_2082);
			}
			return types;
		}
		if (sourceEditPart instanceof SNMPServiceEditPart) {
			List types = new ArrayList();
			return types;
		}
		if (sourceEditPart instanceof LogicalModuleEditPart) {
			List types = new ArrayList();
			if (relationshipType == CIMLevelZeroElementTypes.LogicalModuleModulePort_4038) {
				types.add(CIMLevelZeroElementTypes.NetworkPort_2093);
			}
			return types;
		}
		if (sourceEditPart instanceof OperatingSystemEditPart) {
			List types = new ArrayList();
			return types;
		}
		if (sourceEditPart instanceof NATServiceEditPart) {
			List types = new ArrayList();
			return types;
		}
		if (sourceEditPart instanceof BGPClusterEditPart) {
			List types = new ArrayList();
			if (relationshipType == CIMLevelZeroElementTypes.BGPClusterReflectorClientService_4007) {
				types.add(CIMLevelZeroElementTypes.BGPService_2062);
			}
			if (relationshipType == CIMLevelZeroElementTypes.BGPClusterReflectorNonClientService_4008) {
				types.add(CIMLevelZeroElementTypes.BGPService_2062);
			}
			if (relationshipType == CIMLevelZeroElementTypes.BGPClusterReflectorService_4009) {
				types.add(CIMLevelZeroElementTypes.BGPService_2062);
			}
			if (relationshipType == CIMLevelZeroElementTypes.BGPClusterRoutersInBGPCluster_4064) {
				types.add(CIMLevelZeroElementTypes.ComputerSystem_2092);
			}
			return types;
		}
		if (sourceEditPart instanceof SoftwareIdentityEditPart) {
			List types = new ArrayList();
			return types;
		}
		if (sourceEditPart instanceof NATListBasedSettingsEditPart) {
			List types = new ArrayList();
			if (relationshipType == CIMLevelZeroElementTypes.NATListBasedSettingsAddressesToBeTranslated_4043) {
				types.add(CIMLevelZeroElementTypes.FilterList_2061);
			}
			if (relationshipType == CIMLevelZeroElementTypes.NATListBasedSettingsTranslationPoolForNAT_4069) {
				types.add(CIMLevelZeroElementTypes.RangeOfIPAddresses_2025);
			}
			return types;
		}
		if (sourceEditPart instanceof BGPServiceEditPart) {
			List types = new ArrayList();
			if (relationshipType == CIMLevelZeroElementTypes.BGPServiceBGPPeerGroupServices_4006) {
				types.add(CIMLevelZeroElementTypes.BGPPeerGroup_2017);
			}
			if (relationshipType == CIMLevelZeroElementTypes.BGPServiceBGPAdminDistance_4044) {
				types.add(CIMLevelZeroElementTypes.AdministrativeDistance_2022);
			}
			return types;
		}
		if (sourceEditPart instanceof ProductEditPart) {
			List types = new ArrayList();
			if (relationshipType == CIMLevelZeroElementTypes.ProductProductProductDependency_4025) {
				types.add(CIMLevelZeroElementTypes.Product_2080);
			}
			return types;
		}
		if (sourceEditPart instanceof AFServiceEditPart) {
			List types = new ArrayList();
			if (relationshipType == CIMLevelZeroElementTypes.AFServiceAFRelatedServices_4039) {
				types.add(CIMLevelZeroElementTypes.AFService_2083);
			}
			return types;
		}
		if (sourceEditPart instanceof LANSegmentEditPart) {
			List types = new ArrayList();
			if (relationshipType == CIMLevelZeroElementTypes.LANSegmentInSegment_4057) {
				types.add(CIMLevelZeroElementTypes.LANEndpoint_2087);
			}
			return types;
		}
		if (sourceEditPart instanceof AdminDomainEditPart) {
			List types = new ArrayList();
			if (relationshipType == CIMLevelZeroElementTypes.AdminDomainContainedDomain_4012) {
				types.add(CIMLevelZeroElementTypes.AdminDomain_2089);
			}
			return types;
		}
		if (sourceEditPart instanceof ComputerSystemEditPart) {
			List types = new ArrayList();
			if (relationshipType == CIMLevelZeroElementTypes.ComputerSystemHostedFilterList_4051) {
				types.add(CIMLevelZeroElementTypes.FilterList_2061);
			}
			if (relationshipType == CIMLevelZeroElementTypes.ComputerSystemHostedRoutingPolicy_4054) {
				types.add(CIMLevelZeroElementTypes.RoutingPolicy_2005);
			}
			if (relationshipType == CIMLevelZeroElementTypes.ComputerSystemRunningOS_4067) {
				types.add(CIMLevelZeroElementTypes.OperatingSystem_2032);
			}
			return types;
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public EObject selectExistingElementForSource(IAdaptable target,
			IElementType relationshipType) {
		return selectExistingElement(target, getTypesForSource(target,
				relationshipType));
	}

	/**
	 * @generated
	 */
	public EObject selectExistingElementForTarget(IAdaptable source,
			IElementType relationshipType) {
		return selectExistingElement(source, getTypesForTarget(source,
				relationshipType));
	}

	/**
	 * @generated
	 */
	protected EObject selectExistingElement(IAdaptable host, Collection types) {
		if (types.isEmpty()) {
			return null;
		}
		IGraphicalEditPart editPart = (IGraphicalEditPart) host
				.getAdapter(IGraphicalEditPart.class);
		if (editPart == null) {
			return null;
		}
		Diagram diagram = (Diagram) editPart.getRoot().getContents().getModel();
		Collection elements = new HashSet();
		for (Iterator it = diagram.getElement().eAllContents(); it.hasNext();) {
			EObject element = (EObject) it.next();
			if (isApplicableElement(element, types)) {
				elements.add(element);
			}
		}
		if (elements.isEmpty()) {
			return null;
		}
		return selectElement((EObject[]) elements.toArray(new EObject[elements
				.size()]));
	}

	/**
	 * @generated
	 */
	protected boolean isApplicableElement(EObject element, Collection types) {
		IElementType type = ElementTypeRegistry.getInstance().getElementType(
				element);
		return types.contains(type);
	}

	/**
	 * @generated
	 */
	protected EObject selectElement(EObject[] elements) {
		Shell shell = Display.getCurrent().getActiveShell();
		ILabelProvider labelProvider = new AdapterFactoryLabelProvider(
				CIMLevelZeroDiagramEditorPlugin.getInstance()
						.getItemProvidersAdapterFactory());
		ElementListSelectionDialog dialog = new ElementListSelectionDialog(
				shell, labelProvider);
		dialog
				.setMessage(Messages.CIMLevelZeroModelingAssistantProviderMessage);
		dialog.setTitle(Messages.CIMLevelZeroModelingAssistantProviderTitle);
		dialog.setMultipleSelection(false);
		dialog.setElements(elements);
		EObject selected = null;
		if (dialog.open() == Window.OK) {
			selected = (EObject) dialog.getFirstResult();
		}
		return selected;
	}
}
