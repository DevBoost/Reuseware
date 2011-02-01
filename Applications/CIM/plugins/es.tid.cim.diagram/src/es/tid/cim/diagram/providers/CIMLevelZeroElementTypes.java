package es.tid.cim.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.swt.graphics.Image;

import es.tid.cim.CimPackage;
import es.tid.cim.diagram.part.CIMLevelZeroDiagramEditorPlugin;

/**
 * @generated
 */
public class CIMLevelZeroElementTypes extends ElementInitializers {

	/**
	 * @generated
	 */
	private CIMLevelZeroElementTypes() {
	}

	/**
	 * @generated
	 */
	private static Map elements;

	/**
	 * @generated
	 */
	private static ImageRegistry imageRegistry;

	/**
	 * @generated
	 */
	private static Set KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType CIM_Model_1000 = getElementType("levelZero.diagram.CIM_Model_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType USBDevice_2001 = getElementType("levelZero.diagram.USBDevice_2001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType OSPFVirtualInterface_2002 = getElementType("levelZero.diagram.OSPFVirtualInterface_2002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType WiFiPort_2003 = getElementType("levelZero.diagram.WiFiPort_2003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ProtocolService_2004 = getElementType("levelZero.diagram.ProtocolService_2004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType RoutingPolicy_2005 = getElementType("levelZero.diagram.RoutingPolicy_2005"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType EnabledLogicalElementCapabilities_2006 = getElementType("levelZero.diagram.EnabledLogicalElementCapabilities_2006"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType BufferPool_2007 = getElementType("levelZero.diagram.BufferPool_2007"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType MPLSProtocolEndpoint_2008 = getElementType("levelZero.diagram.MPLSProtocolEndpoint_2008"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType AutonomousSystem_2009 = getElementType("levelZero.diagram.AutonomousSystem_2009"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType DNSSettingData_2010 = getElementType("levelZero.diagram.DNSSettingData_2010"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType UniModem_2011 = getElementType("levelZero.diagram.UniModem_2011"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType EFService_2012 = getElementType("levelZero.diagram.EFService_2012"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType IPSubnet_2013 = getElementType("levelZero.diagram.IPSubnet_2013"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType NamedAddressCollection_2014 = getElementType("levelZero.diagram.NamedAddressCollection_2014"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType BIOSElement_2015 = getElementType("levelZero.diagram.BIOSElement_2015"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType TelnetSettingData_2016 = getElementType("levelZero.diagram.TelnetSettingData_2016"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType BGPPeerGroup_2017 = getElementType("levelZero.diagram.BGPPeerGroup_2017"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType LANConnectivitySegment_2018 = getElementType("levelZero.diagram.LANConnectivitySegment_2018"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType CableModem_2019 = getElementType("levelZero.diagram.CableModem_2019"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType SwitchPort_2020 = getElementType("levelZero.diagram.SwitchPort_2020"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType TCPProtocolEndpoint_2021 = getElementType("levelZero.diagram.TCPProtocolEndpoint_2021"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType AdministrativeDistance_2022 = getElementType("levelZero.diagram.AdministrativeDistance_2022"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType IPConnectivitySubnet_2023 = getElementType("levelZero.diagram.IPConnectivitySubnet_2023"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType VolatileStorage_2024 = getElementType("levelZero.diagram.VolatileStorage_2024"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType RangeOfIPAddresses_2025 = getElementType("levelZero.diagram.RangeOfIPAddresses_2025"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType BGPProtocolEndpoint_2026 = getElementType("levelZero.diagram.BGPProtocolEndpoint_2026"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType UnitaryComputerSystem_2027 = getElementType("levelZero.diagram.UnitaryComputerSystem_2027"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType EthernetPort_2028 = getElementType("levelZero.diagram.EthernetPort_2028"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType SNMPService_2029 = getElementType("levelZero.diagram.SNMPService_2029"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType LogicalModule_2030 = getElementType("levelZero.diagram.LogicalModule_2030"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType NextHopIPRoute_2031 = getElementType("levelZero.diagram.NextHopIPRoute_2031"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType OperatingSystem_2032 = getElementType("levelZero.diagram.OperatingSystem_2032"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType SDSLModem_2033 = getElementType("levelZero.diagram.SDSLModem_2033"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType WiFiEndPoint_2034 = getElementType("levelZero.diagram.WiFiEndPoint_2034"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType NATService_2035 = getElementType("levelZero.diagram.NATService_2035"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ADSLModem_2036 = getElementType("levelZero.diagram.ADSLModem_2036"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType LogicalFile_2037 = getElementType("levelZero.diagram.LogicalFile_2037"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType BGPCluster_2038 = getElementType("levelZero.diagram.BGPCluster_2038"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ApplicationSystem_2039 = getElementType("levelZero.diagram.ApplicationSystem_2039"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType SoftwareIdentity_2040 = getElementType("levelZero.diagram.SoftwareIdentity_2040"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType WirelessPort_2041 = getElementType("levelZero.diagram.WirelessPort_2041"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType CLPSettingData_2042 = getElementType("levelZero.diagram.CLPSettingData_2042"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType GenericService_2043 = getElementType("levelZero.diagram.GenericService_2043"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType NATListBasedSettings_2044 = getElementType("levelZero.diagram.NATListBasedSettings_2044"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType VDSLModem_2045 = getElementType("levelZero.diagram.VDSLModem_2045"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType USBPort_2046 = getElementType("levelZero.diagram.USBPort_2046"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType DNSProtocolEndpoint_2047 = getElementType("levelZero.diagram.DNSProtocolEndpoint_2047"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType WiFiEndpointSettings_2048 = getElementType("levelZero.diagram.WiFiEndpointSettings_2048"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType SSHSettingData_2049 = getElementType("levelZero.diagram.SSHSettingData_2049"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType WirelessLANEndpoint_2050 = getElementType("levelZero.diagram.WirelessLANEndpoint_2050"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType DHCPProtocolEndpoint_2051 = getElementType("levelZero.diagram.DHCPProtocolEndpoint_2051"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType IPHeadersFilter_2052 = getElementType("levelZero.diagram.IPHeadersFilter_2052"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Directory_2053 = getElementType("levelZero.diagram.Directory_2053"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType IPAddressRange_2054 = getElementType("levelZero.diagram.IPAddressRange_2054"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType SNMPTrapTarget_2055 = getElementType("levelZero.diagram.SNMPTrapTarget_2055"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType IPXConnectivityNetwork_2056 = getElementType("levelZero.diagram.IPXConnectivityNetwork_2056"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ConnectivityMemberhipSettingData_2057 = getElementType("levelZero.diagram.ConnectivityMemberhipSettingData_2057"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ConditioningService_2058 = getElementType("levelZero.diagram.ConditioningService_2058"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType BIOSFeature_2059 = getElementType("levelZero.diagram.BIOSFeature_2059"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType OSPFProtocolEndpoint_2060 = getElementType("levelZero.diagram.OSPFProtocolEndpoint_2060"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType FilterList_2061 = getElementType("levelZero.diagram.FilterList_2061"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType BGPService_2062 = getElementType("levelZero.diagram.BGPService_2062"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType PrecedenceService_2063 = getElementType("levelZero.diagram.PrecedenceService_2063"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType DHCPCapabilities_2064 = getElementType("levelZero.diagram.DHCPCapabilities_2064"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Hdr8021PService_2065 = getElementType("levelZero.diagram.Hdr8021PService_2065"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ReplacementSet_2066 = getElementType("levelZero.diagram.ReplacementSet_2066"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType HDSLModem_2067 = getElementType("levelZero.diagram.HDSLModem_2067"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ServiceAccessURI_2068 = getElementType("levelZero.diagram.ServiceAccessURI_2068"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType FilterEntry_2069 = getElementType("levelZero.diagram.FilterEntry_2069"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType SNMPCommunityStrings_2070 = getElementType("levelZero.diagram.SNMPCommunityStrings_2070"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Network_2071 = getElementType("levelZero.diagram.Network_2071"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType FileSpecification_2072 = getElementType("levelZero.diagram.FileSpecification_2072"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType IPXNetwork_2073 = getElementType("levelZero.diagram.IPXNetwork_2073"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType PowerManagementCapabilities_2074 = getElementType("levelZero.diagram.PowerManagementCapabilities_2074"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType FlowService_2075 = getElementType("levelZero.diagram.FlowService_2075"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ISDNModem_2076 = getElementType("levelZero.diagram.ISDNModem_2076"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType IPXProtocolEndpoint_2077 = getElementType("levelZero.diagram.IPXProtocolEndpoint_2077"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType IPProtocolEndpoint_2078 = getElementType("levelZero.diagram.IPProtocolEndpoint_2078"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType UDPProtocolEndpoint_2079 = getElementType("levelZero.diagram.UDPProtocolEndpoint_2079"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Product_2080 = getElementType("levelZero.diagram.Product_2080"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType MemoryCapacity_2081 = getElementType("levelZero.diagram.MemoryCapacity_2081"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType RoutingProtocolDomain_2082 = getElementType("levelZero.diagram.RoutingProtocolDomain_2082"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType AFService_2083 = getElementType("levelZero.diagram.AFService_2083"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType LANSegment_2084 = getElementType("levelZero.diagram.LANSegment_2084"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType NATStaticSettings_2085 = getElementType("levelZero.diagram.NATStaticSettings_2085"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType TelnetProtocolEndpoint_2086 = getElementType("levelZero.diagram.TelnetProtocolEndpoint_2086"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType LANEndpoint_2087 = getElementType("levelZero.diagram.LANEndpoint_2087"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType DropThresholdCalculationService_2088 = getElementType("levelZero.diagram.DropThresholdCalculationService_2088"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType AdminDomain_2089 = getElementType("levelZero.diagram.AdminDomain_2089"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType SystemSpecificCollection_2090 = getElementType("levelZero.diagram.SystemSpecificCollection_2090"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType NextHopRouting_2091 = getElementType("levelZero.diagram.NextHopRouting_2091"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ComputerSystem_2092 = getElementType("levelZero.diagram.ComputerSystem_2092"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType NetworkPort_2093 = getElementType("levelZero.diagram.NetworkPort_2093"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType RemoteServiceAccessPoint_2094 = getElementType("levelZero.diagram.RemoteServiceAccessPoint_2094"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType DirectorySpecificationDirectorySpecificationFiles_4001 = getElementType("levelZero.diagram.DirectorySpecificationDirectorySpecificationFiles_4001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType OperatingSystemOperatingSystemSoftwareFeature_4002 = getElementType("levelZero.diagram.OperatingSystemOperatingSystemSoftwareFeature_4002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType SoftwareElementSoftwareElementActions_4003 = getElementType("levelZero.diagram.SoftwareElementSoftwareElementActions_4003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType SoftwareElementSoftwareElementChecks_4004 = getElementType("levelZero.diagram.SoftwareElementSoftwareElementChecks_4004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType InstalledProductSoftwareElements_4005 = getElementType("levelZero.diagram.InstalledProductSoftwareElements_4005"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType BGPServiceBGPPeerGroupServices_4006 = getElementType("levelZero.diagram.BGPServiceBGPPeerGroupServices_4006"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType BGPClusterReflectorClientService_4007 = getElementType("levelZero.diagram.BGPClusterReflectorClientService_4007"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType BGPClusterReflectorNonClientService_4008 = getElementType("levelZero.diagram.BGPClusterReflectorNonClientService_4008"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType BGPClusterReflectorService_4009 = getElementType("levelZero.diagram.BGPClusterReflectorService_4009"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ServiceAccessPointBindsTo_4010 = getElementType("levelZero.diagram.ServiceAccessPointBindsTo_4010"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ManagedElementComponents_4011 = getElementType("levelZero.diagram.ManagedElementComponents_4011"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType AdminDomainContainedDomain_4012 = getElementType("levelZero.diagram.AdminDomainContainedDomain_4012"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ManagedElementDependencies_4013 = getElementType("levelZero.diagram.ManagedElementDependencies_4013"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType LogicalDeviceDeviceConnection_4014 = getElementType("levelZero.diagram.LogicalDeviceDeviceConnection_4014"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType LogicalDeviceDeviceIdentity_4015 = getElementType("levelZero.diagram.LogicalDeviceDeviceIdentity_4015"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType LogicalDeviceDeviceSAPImplementation_4016 = getElementType("levelZero.diagram.LogicalDeviceDeviceSAPImplementation_4016"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ManagedElementElementCapabilities_4017 = getElementType("levelZero.diagram.ManagedElementElementCapabilities_4017"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ManagedElementElementSettingData_4018 = getElementType("levelZero.diagram.ManagedElementElementSettingData_4018"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType SoftwareIdentityElementSoftwareIdentity_4019 = getElementType("levelZero.diagram.SoftwareIdentityElementSoftwareIdentity_4019"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType SystemHostedAccessPoint_4020 = getElementType("levelZero.diagram.SystemHostedAccessPoint_4020"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType SystemHostedCollection_4021 = getElementType("levelZero.diagram.SystemHostedCollection_4021"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ManagedElementHostedDependency_4022 = getElementType("levelZero.diagram.ManagedElementHostedDependency_4022"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType SystemHostedServices_4023 = getElementType("levelZero.diagram.SystemHostedServices_4023"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ElementSoftwareIdentityManagedElement_4024 = getElementType("levelZero.diagram.ElementSoftwareIdentityManagedElement_4024"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ProductProductProductDependency_4025 = getElementType("levelZero.diagram.ProductProductProductDependency_4025"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ProductProductServiceComponent_4026 = getElementType("levelZero.diagram.ProductProductServiceComponent_4026"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType EnabledLogicalElementRemoteAccessAvailableToElement_4027 = getElementType("levelZero.diagram.EnabledLogicalElementRemoteAccessAvailableToElement_4027"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType SystemRoles_4028 = getElementType("levelZero.diagram.SystemRoles_4028"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ServiceAccessPointSAPSAPDependency_4029 = getElementType("levelZero.diagram.ServiceAccessPointSAPSAPDependency_4029"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ServiceServiceAccessBySAP_4030 = getElementType("levelZero.diagram.ServiceServiceAccessBySAP_4030"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ServiceServiceComponents_4031 = getElementType("levelZero.diagram.ServiceServiceComponents_4031"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ServiceServiceServiceDependency_4032 = getElementType("levelZero.diagram.ServiceServiceServiceDependency_4032"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ElementSettingDataSettingData_4033 = getElementType("levelZero.diagram.ElementSettingDataSettingData_4033"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType SettingDataSettingsDefineCapabilities_4034 = getElementType("levelZero.diagram.SettingDataSettingsDefineCapabilities_4034"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ManagedSystemElementStatusDescriptions_4035 = getElementType("levelZero.diagram.ManagedSystemElementStatusDescriptions_4035"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType SystemSystemComponents_4036 = getElementType("levelZero.diagram.SystemSystemComponents_4036"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType SystemSystemDevices_4037 = getElementType("levelZero.diagram.SystemSystemDevices_4037"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType LogicalModuleModulePort_4038 = getElementType("levelZero.diagram.LogicalModuleModulePort_4038"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType AFServiceAFRelatedServices_4039 = getElementType("levelZero.diagram.AFServiceAFRelatedServices_4039"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType QoSServiceQoSConditioningSubService_4040 = getElementType("levelZero.diagram.QoSServiceQoSConditioningSubService_4040"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType QoSServiceQoSSubService_4041 = getElementType("levelZero.diagram.QoSServiceQoSSubService_4041"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType CollectionMembers_4042 = getElementType("levelZero.diagram.CollectionMembers_4042"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType NATListBasedSettingsAddressesToBeTranslated_4043 = getElementType("levelZero.diagram.NATListBasedSettingsAddressesToBeTranslated_4043"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType BGPServiceBGPAdminDistance_4044 = getElementType("levelZero.diagram.BGPServiceBGPAdminDistance_4044"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ServiceAccessPointBindsToLANEndpoint_4045 = getElementType("levelZero.diagram.ServiceAccessPointBindsToLANEndpoint_4045"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType RouteCalculationServiceCalculatesAmong_4046 = getElementType("levelZero.diagram.RouteCalculationServiceCalculatesAmong_4046"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ProtocolEndpointEgressConditioningServiceOnEndpoint_4047 = getElementType("levelZero.diagram.ProtocolEndpointEgressConditioningServiceOnEndpoint_4047"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType CIM_ModelElements_4048 = getElementType("levelZero.diagram.CIM_ModelElements_4048"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ForwardingServiceForwardedRoutes_4049 = getElementType("levelZero.diagram.ForwardingServiceForwardedRoutes_4049"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ForwardingServiceForwardsAmong_4050 = getElementType("levelZero.diagram.ForwardingServiceForwardsAmong_4050"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ComputerSystemHostedFilterList_4051 = getElementType("levelZero.diagram.ComputerSystemHostedFilterList_4051"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ComputerSystemHostedForwardingServices_4052 = getElementType("levelZero.diagram.ComputerSystemHostedForwardingServices_4052"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType SystemHostedRoute_4053 = getElementType("levelZero.diagram.SystemHostedRoute_4053"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ComputerSystemHostedRoutingPolicy_4054 = getElementType("levelZero.diagram.ComputerSystemHostedRoutingPolicy_4054"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ProtocolEndpointIngressConditioningServiceOnEndpoint_4055 = getElementType("levelZero.diagram.ProtocolEndpointIngressConditioningServiceOnEndpoint_4055"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType LogicalNetworkInLogicalNetwork_4056 = getElementType("levelZero.diagram.LogicalNetworkInLogicalNetwork_4056"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType LANSegmentInSegment_4057 = getElementType("levelZero.diagram.LANSegmentInSegment_4057"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType NATServiceNATServiceRunningOnEndpoint_4058 = getElementType("levelZero.diagram.NATServiceNATServiceRunningOnEndpoint_4058"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType AdminDomainNetworksInAdminDomain_4059 = getElementType("levelZero.diagram.AdminDomainNetworksInAdminDomain_4059"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType LogicalPortPortImplementsEndPoint_4060 = getElementType("levelZero.diagram.LogicalPortPortImplementsEndPoint_4060"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType LogicalDevicePortOnDevice_4061 = getElementType("levelZero.diagram.LogicalDevicePortOnDevice_4061"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ForwardingServiceRouteForwardedByService_4062 = getElementType("levelZero.diagram.ForwardingServiceRouteForwardedByService_4062"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType AutonomousSystemRouterInAS_4063 = getElementType("levelZero.diagram.AutonomousSystemRouterInAS_4063"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType BGPClusterRoutersInBGPCluster_4064 = getElementType("levelZero.diagram.BGPClusterRoutersInBGPCluster_4064"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType NextHopRouteRouteUsesEndpoint_4065 = getElementType("levelZero.diagram.NextHopRouteRouteUsesEndpoint_4065"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType AutonomousSystemRoutingProtocolDomainInAS_4066 = getElementType("levelZero.diagram.AutonomousSystemRoutingProtocolDomainInAS_4066"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ComputerSystemRunningOS_4067 = getElementType("levelZero.diagram.ComputerSystemRunningOS_4067"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ServiceSoftwareFeatureServiceImplementation_4068 = getElementType("levelZero.diagram.ServiceSoftwareFeatureServiceImplementation_4068"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType NATListBasedSettingsTranslationPoolForNAT_4069 = getElementType("levelZero.diagram.NATListBasedSettingsTranslationPoolForNAT_4069"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType SNMPServiceTrapSourceForSNMPService_4070 = getElementType("levelZero.diagram.SNMPServiceTrapSourceForSNMPService_4070"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType NextHopRouteAssociatedNextHop_4071 = getElementType("levelZero.diagram.NextHopRouteAssociatedNextHop_4071"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	private static ImageRegistry getImageRegistry() {
		if (imageRegistry == null) {
			imageRegistry = new ImageRegistry();
		}
		return imageRegistry;
	}

	/**
	 * @generated
	 */
	private static String getImageRegistryKey(ENamedElement element) {
		return element.getName();
	}

	/**
	 * @generated
	 */
	private static ImageDescriptor getProvidedImageDescriptor(
			ENamedElement element) {
		if (element instanceof EStructuralFeature) {
			EStructuralFeature feature = ((EStructuralFeature) element);
			EClass eContainingClass = feature.getEContainingClass();
			EClassifier eType = feature.getEType();
			if (eContainingClass != null && !eContainingClass.isAbstract()) {
				element = eContainingClass;
			} else if (eType instanceof EClass
					&& !((EClass) eType).isAbstract()) {
				element = eType;
			}
		}
		if (element instanceof EClass) {
			EClass eClass = (EClass) element;
			if (!eClass.isAbstract()) {
				return CIMLevelZeroDiagramEditorPlugin.getInstance()
						.getItemImageDescriptor(
								eClass.getEPackage().getEFactoryInstance()
										.create(eClass));
			}
		}
		// TODO : support structural features
		return null;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		String key = getImageRegistryKey(element);
		ImageDescriptor imageDescriptor = getImageRegistry().getDescriptor(key);
		if (imageDescriptor == null) {
			imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
		}
		return imageDescriptor;
	}

	/**
	 * @generated
	 */
	public static Image getImage(ENamedElement element) {
		String key = getImageRegistryKey(element);
		Image image = getImageRegistry().get(key);
		if (image == null) {
			ImageDescriptor imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
			image = getImageRegistry().get(key);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImageDescriptor(element);
	}

	/**
	 * @generated
	 */
	public static Image getImage(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImage(element);
	}

	/**
	 * Returns 'type' of the ecore object associated with the hint.
	 * 
	 * @generated
	 */
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap();

			elements.put(CIM_Model_1000, CimPackage.eINSTANCE.getCIM_Model());

			elements.put(USBDevice_2001, CimPackage.eINSTANCE.getUSBDevice());

			elements.put(OSPFVirtualInterface_2002, CimPackage.eINSTANCE
					.getOSPFVirtualInterface());

			elements.put(WiFiPort_2003, CimPackage.eINSTANCE.getWiFiPort());

			elements.put(ProtocolService_2004, CimPackage.eINSTANCE
					.getProtocolService());

			elements.put(RoutingPolicy_2005, CimPackage.eINSTANCE
					.getRoutingPolicy());

			elements
					.put(EnabledLogicalElementCapabilities_2006,
							CimPackage.eINSTANCE
									.getEnabledLogicalElementCapabilities());

			elements.put(BufferPool_2007, CimPackage.eINSTANCE.getBufferPool());

			elements.put(MPLSProtocolEndpoint_2008, CimPackage.eINSTANCE
					.getMPLSProtocolEndpoint());

			elements.put(AutonomousSystem_2009, CimPackage.eINSTANCE
					.getAutonomousSystem());

			elements.put(DNSSettingData_2010, CimPackage.eINSTANCE
					.getDNSSettingData());

			elements.put(UniModem_2011, CimPackage.eINSTANCE.getUniModem());

			elements.put(EFService_2012, CimPackage.eINSTANCE.getEFService());

			elements.put(IPSubnet_2013, CimPackage.eINSTANCE.getIPSubnet());

			elements.put(NamedAddressCollection_2014, CimPackage.eINSTANCE
					.getNamedAddressCollection());

			elements.put(BIOSElement_2015, CimPackage.eINSTANCE
					.getBIOSElement());

			elements.put(TelnetSettingData_2016, CimPackage.eINSTANCE
					.getTelnetSettingData());

			elements.put(BGPPeerGroup_2017, CimPackage.eINSTANCE
					.getBGPPeerGroup());

			elements.put(LANConnectivitySegment_2018, CimPackage.eINSTANCE
					.getLANConnectivitySegment());

			elements.put(CableModem_2019, CimPackage.eINSTANCE.getCableModem());

			elements.put(SwitchPort_2020, CimPackage.eINSTANCE.getSwitchPort());

			elements.put(TCPProtocolEndpoint_2021, CimPackage.eINSTANCE
					.getTCPProtocolEndpoint());

			elements.put(AdministrativeDistance_2022, CimPackage.eINSTANCE
					.getAdministrativeDistance());

			elements.put(IPConnectivitySubnet_2023, CimPackage.eINSTANCE
					.getIPConnectivitySubnet());

			elements.put(VolatileStorage_2024, CimPackage.eINSTANCE
					.getVolatileStorage());

			elements.put(RangeOfIPAddresses_2025, CimPackage.eINSTANCE
					.getRangeOfIPAddresses());

			elements.put(BGPProtocolEndpoint_2026, CimPackage.eINSTANCE
					.getBGPProtocolEndpoint());

			elements.put(UnitaryComputerSystem_2027, CimPackage.eINSTANCE
					.getUnitaryComputerSystem());

			elements.put(EthernetPort_2028, CimPackage.eINSTANCE
					.getEthernetPort());

			elements.put(SNMPService_2029, CimPackage.eINSTANCE
					.getSNMPService());

			elements.put(LogicalModule_2030, CimPackage.eINSTANCE
					.getLogicalModule());

			elements.put(NextHopIPRoute_2031, CimPackage.eINSTANCE
					.getNextHopIPRoute());

			elements.put(OperatingSystem_2032, CimPackage.eINSTANCE
					.getOperatingSystem());

			elements.put(SDSLModem_2033, CimPackage.eINSTANCE.getSDSLModem());

			elements.put(WiFiEndPoint_2034, CimPackage.eINSTANCE
					.getWiFiEndPoint());

			elements.put(NATService_2035, CimPackage.eINSTANCE.getNATService());

			elements.put(ADSLModem_2036, CimPackage.eINSTANCE.getADSLModem());

			elements.put(LogicalFile_2037, CimPackage.eINSTANCE
					.getLogicalFile());

			elements.put(BGPCluster_2038, CimPackage.eINSTANCE.getBGPCluster());

			elements.put(ApplicationSystem_2039, CimPackage.eINSTANCE
					.getApplicationSystem());

			elements.put(SoftwareIdentity_2040, CimPackage.eINSTANCE
					.getSoftwareIdentity());

			elements.put(WirelessPort_2041, CimPackage.eINSTANCE
					.getWirelessPort());

			elements.put(CLPSettingData_2042, CimPackage.eINSTANCE
					.getCLPSettingData());

			elements.put(GenericService_2043, CimPackage.eINSTANCE
					.getGenericService());

			elements.put(NATListBasedSettings_2044, CimPackage.eINSTANCE
					.getNATListBasedSettings());

			elements.put(VDSLModem_2045, CimPackage.eINSTANCE.getVDSLModem());

			elements.put(USBPort_2046, CimPackage.eINSTANCE.getUSBPort());

			elements.put(DNSProtocolEndpoint_2047, CimPackage.eINSTANCE
					.getDNSProtocolEndpoint());

			elements.put(WiFiEndpointSettings_2048, CimPackage.eINSTANCE
					.getWiFiEndpointSettings());

			elements.put(SSHSettingData_2049, CimPackage.eINSTANCE
					.getSSHSettingData());

			elements.put(WirelessLANEndpoint_2050, CimPackage.eINSTANCE
					.getWirelessLANEndpoint());

			elements.put(DHCPProtocolEndpoint_2051, CimPackage.eINSTANCE
					.getDHCPProtocolEndpoint());

			elements.put(IPHeadersFilter_2052, CimPackage.eINSTANCE
					.getIPHeadersFilter());

			elements.put(Directory_2053, CimPackage.eINSTANCE.getDirectory());

			elements.put(IPAddressRange_2054, CimPackage.eINSTANCE
					.getIPAddressRange());

			elements.put(SNMPTrapTarget_2055, CimPackage.eINSTANCE
					.getSNMPTrapTarget());

			elements.put(IPXConnectivityNetwork_2056, CimPackage.eINSTANCE
					.getIPXConnectivityNetwork());

			elements.put(ConnectivityMemberhipSettingData_2057,
					CimPackage.eINSTANCE.getConnectivityMemberhipSettingData());

			elements.put(ConditioningService_2058, CimPackage.eINSTANCE
					.getConditioningService());

			elements.put(BIOSFeature_2059, CimPackage.eINSTANCE
					.getBIOSFeature());

			elements.put(OSPFProtocolEndpoint_2060, CimPackage.eINSTANCE
					.getOSPFProtocolEndpoint());

			elements.put(FilterList_2061, CimPackage.eINSTANCE.getFilterList());

			elements.put(BGPService_2062, CimPackage.eINSTANCE.getBGPService());

			elements.put(PrecedenceService_2063, CimPackage.eINSTANCE
					.getPrecedenceService());

			elements.put(DHCPCapabilities_2064, CimPackage.eINSTANCE
					.getDHCPCapabilities());

			elements.put(Hdr8021PService_2065, CimPackage.eINSTANCE
					.getHdr8021PService());

			elements.put(ReplacementSet_2066, CimPackage.eINSTANCE
					.getReplacementSet());

			elements.put(HDSLModem_2067, CimPackage.eINSTANCE.getHDSLModem());

			elements.put(ServiceAccessURI_2068, CimPackage.eINSTANCE
					.getServiceAccessURI());

			elements.put(FilterEntry_2069, CimPackage.eINSTANCE
					.getFilterEntry());

			elements.put(SNMPCommunityStrings_2070, CimPackage.eINSTANCE
					.getSNMPCommunityStrings());

			elements.put(Network_2071, CimPackage.eINSTANCE.getNetwork());

			elements.put(FileSpecification_2072, CimPackage.eINSTANCE
					.getFileSpecification());

			elements.put(IPXNetwork_2073, CimPackage.eINSTANCE.getIPXNetwork());

			elements.put(PowerManagementCapabilities_2074, CimPackage.eINSTANCE
					.getPowerManagementCapabilities());

			elements.put(FlowService_2075, CimPackage.eINSTANCE
					.getFlowService());

			elements.put(ISDNModem_2076, CimPackage.eINSTANCE.getISDNModem());

			elements.put(IPXProtocolEndpoint_2077, CimPackage.eINSTANCE
					.getIPXProtocolEndpoint());

			elements.put(IPProtocolEndpoint_2078, CimPackage.eINSTANCE
					.getIPProtocolEndpoint());

			elements.put(UDPProtocolEndpoint_2079, CimPackage.eINSTANCE
					.getUDPProtocolEndpoint());

			elements.put(Product_2080, CimPackage.eINSTANCE.getProduct());

			elements.put(MemoryCapacity_2081, CimPackage.eINSTANCE
					.getMemoryCapacity());

			elements.put(RoutingProtocolDomain_2082, CimPackage.eINSTANCE
					.getRoutingProtocolDomain());

			elements.put(AFService_2083, CimPackage.eINSTANCE.getAFService());

			elements.put(LANSegment_2084, CimPackage.eINSTANCE.getLANSegment());

			elements.put(NATStaticSettings_2085, CimPackage.eINSTANCE
					.getNATStaticSettings());

			elements.put(TelnetProtocolEndpoint_2086, CimPackage.eINSTANCE
					.getTelnetProtocolEndpoint());

			elements.put(LANEndpoint_2087, CimPackage.eINSTANCE
					.getLANEndpoint());

			elements.put(DropThresholdCalculationService_2088,
					CimPackage.eINSTANCE.getDropThresholdCalculationService());

			elements.put(AdminDomain_2089, CimPackage.eINSTANCE
					.getAdminDomain());

			elements.put(SystemSpecificCollection_2090, CimPackage.eINSTANCE
					.getSystemSpecificCollection());

			elements.put(NextHopRouting_2091, CimPackage.eINSTANCE
					.getNextHopRouting());

			elements.put(ComputerSystem_2092, CimPackage.eINSTANCE
					.getComputerSystem());

			elements.put(NetworkPort_2093, CimPackage.eINSTANCE
					.getNetworkPort());

			elements.put(RemoteServiceAccessPoint_2094, CimPackage.eINSTANCE
					.getRemoteServiceAccessPoint());

			elements
					.put(
							DirectorySpecificationDirectorySpecificationFiles_4001,
							CimPackage.eINSTANCE
									.getDirectorySpecification_DirectorySpecificationFiles());

			elements
					.put(
							OperatingSystemOperatingSystemSoftwareFeature_4002,
							CimPackage.eINSTANCE
									.getOperatingSystem_OperatingSystemSoftwareFeature());

			elements.put(SoftwareElementSoftwareElementActions_4003,
					CimPackage.eINSTANCE
							.getSoftwareElement_SoftwareElementActions());

			elements.put(SoftwareElementSoftwareElementChecks_4004,
					CimPackage.eINSTANCE
							.getSoftwareElement_SoftwareElementChecks());

			elements
					.put(InstalledProductSoftwareElements_4005,
							CimPackage.eINSTANCE
									.getInstalledProduct_SoftwareElements());

			elements.put(BGPServiceBGPPeerGroupServices_4006,
					CimPackage.eINSTANCE.getBGPService_BGPPeerGroupServices());

			elements
					.put(BGPClusterReflectorClientService_4007,
							CimPackage.eINSTANCE
									.getBGPCluster_ReflectorClientService());

			elements.put(BGPClusterReflectorNonClientService_4008,
					CimPackage.eINSTANCE
							.getBGPCluster_ReflectorNonClientService());

			elements.put(BGPClusterReflectorService_4009, CimPackage.eINSTANCE
					.getBGPCluster_ReflectorService());

			elements.put(ServiceAccessPointBindsTo_4010, CimPackage.eINSTANCE
					.getServiceAccessPoint_BindsTo());

			elements.put(ManagedElementComponents_4011, CimPackage.eINSTANCE
					.getManagedElement_Components());

			elements.put(AdminDomainContainedDomain_4012, CimPackage.eINSTANCE
					.getAdminDomain_ContainedDomain());

			elements.put(ManagedElementDependencies_4013, CimPackage.eINSTANCE
					.getManagedElement_Dependencies());

			elements.put(LogicalDeviceDeviceConnection_4014,
					CimPackage.eINSTANCE.getLogicalDevice_DeviceConnection());

			elements.put(LogicalDeviceDeviceIdentity_4015, CimPackage.eINSTANCE
					.getLogicalDevice_DeviceIdentity());

			elements.put(LogicalDeviceDeviceSAPImplementation_4016,
					CimPackage.eINSTANCE
							.getLogicalDevice_DeviceSAPImplementation());

			elements.put(ManagedElementElementCapabilities_4017,
					CimPackage.eINSTANCE
							.getManagedElement_ElementCapabilities());

			elements
					.put(ManagedElementElementSettingData_4018,
							CimPackage.eINSTANCE
									.getManagedElement_ElementSettingData());

			elements.put(SoftwareIdentityElementSoftwareIdentity_4019,
					CimPackage.eINSTANCE
							.getSoftwareIdentity_ElementSoftwareIdentity());

			elements.put(SystemHostedAccessPoint_4020, CimPackage.eINSTANCE
					.getSystem_HostedAccessPoint());

			elements.put(SystemHostedCollection_4021, CimPackage.eINSTANCE
					.getSystem_HostedCollection());

			elements.put(ManagedElementHostedDependency_4022,
					CimPackage.eINSTANCE.getManagedElement_HostedDependency());

			elements.put(SystemHostedServices_4023, CimPackage.eINSTANCE
					.getSystem_HostedServices());

			elements.put(ElementSoftwareIdentityManagedElement_4024,
					CimPackage.eINSTANCE
							.getElementSoftwareIdentity_ManagedElement());

			elements.put(ProductProductProductDependency_4025,
					CimPackage.eINSTANCE.getProduct_ProductProductDependency());

			elements.put(ProductProductServiceComponent_4026,
					CimPackage.eINSTANCE.getProduct_ProductServiceComponent());

			elements
					.put(
							EnabledLogicalElementRemoteAccessAvailableToElement_4027,
							CimPackage.eINSTANCE
									.getEnabledLogicalElement_RemoteAccessAvailableToElement());

			elements.put(SystemRoles_4028, CimPackage.eINSTANCE
					.getSystem_Roles());

			elements.put(ServiceAccessPointSAPSAPDependency_4029,
					CimPackage.eINSTANCE
							.getServiceAccessPoint_SAPSAPDependency());

			elements.put(ServiceServiceAccessBySAP_4030, CimPackage.eINSTANCE
					.getService_ServiceAccessBySAP());

			elements.put(ServiceServiceComponents_4031, CimPackage.eINSTANCE
					.getService_ServiceComponents());

			elements.put(ServiceServiceServiceDependency_4032,
					CimPackage.eINSTANCE.getService_ServiceServiceDependency());

			elements.put(ElementSettingDataSettingData_4033,
					CimPackage.eINSTANCE.getElementSettingData_SettingData());

			elements.put(SettingDataSettingsDefineCapabilities_4034,
					CimPackage.eINSTANCE
							.getSettingData_SettingsDefineCapabilities());

			elements.put(ManagedSystemElementStatusDescriptions_4035,
					CimPackage.eINSTANCE
							.getManagedSystemElement_StatusDescriptions());

			elements.put(SystemSystemComponents_4036, CimPackage.eINSTANCE
					.getSystem_SystemComponents());

			elements.put(SystemSystemDevices_4037, CimPackage.eINSTANCE
					.getSystem_SystemDevices());

			elements.put(LogicalModuleModulePort_4038, CimPackage.eINSTANCE
					.getLogicalModule_ModulePort());

			elements.put(AFServiceAFRelatedServices_4039, CimPackage.eINSTANCE
					.getAFService_AFRelatedServices());

			elements.put(QoSServiceQoSConditioningSubService_4040,
					CimPackage.eINSTANCE
							.getQoSService_QoSConditioningSubService());

			elements.put(QoSServiceQoSSubService_4041, CimPackage.eINSTANCE
					.getQoSService_QoSSubService());

			elements.put(CollectionMembers_4042, CimPackage.eINSTANCE
					.getCollection_Members());

			elements.put(NATListBasedSettingsAddressesToBeTranslated_4043,
					CimPackage.eINSTANCE
							.getNATListBasedSettings_AddressesToBeTranslated());

			elements.put(BGPServiceBGPAdminDistance_4044, CimPackage.eINSTANCE
					.getBGPService_BGPAdminDistance());

			elements.put(ServiceAccessPointBindsToLANEndpoint_4045,
					CimPackage.eINSTANCE
							.getServiceAccessPoint_BindsToLANEndpoint());

			elements.put(RouteCalculationServiceCalculatesAmong_4046,
					CimPackage.eINSTANCE
							.getRouteCalculationService_CalculatesAmong());

			elements
					.put(
							ProtocolEndpointEgressConditioningServiceOnEndpoint_4047,
							CimPackage.eINSTANCE
									.getProtocolEndpoint_EgressConditioningServiceOnEndpoint());

			elements.put(CIM_ModelElements_4048, CimPackage.eINSTANCE
					.getCIM_Model_Elements());

			elements
					.put(ForwardingServiceForwardedRoutes_4049,
							CimPackage.eINSTANCE
									.getForwardingService_ForwardedRoutes());

			elements.put(ForwardingServiceForwardsAmong_4050,
					CimPackage.eINSTANCE.getForwardingService_ForwardsAmong());

			elements.put(ComputerSystemHostedFilterList_4051,
					CimPackage.eINSTANCE.getComputerSystem_HostedFilterList());

			elements.put(ComputerSystemHostedForwardingServices_4052,
					CimPackage.eINSTANCE
							.getComputerSystem_HostedForwardingServices());

			elements.put(SystemHostedRoute_4053, CimPackage.eINSTANCE
					.getSystem_HostedRoute());

			elements.put(ComputerSystemHostedRoutingPolicy_4054,
					CimPackage.eINSTANCE
							.getComputerSystem_HostedRoutingPolicy());

			elements
					.put(
							ProtocolEndpointIngressConditioningServiceOnEndpoint_4055,
							CimPackage.eINSTANCE
									.getProtocolEndpoint_IngressConditioningServiceOnEndpoint());

			elements.put(LogicalNetworkInLogicalNetwork_4056,
					CimPackage.eINSTANCE.getLogicalNetwork_InLogicalNetwork());

			elements.put(LANSegmentInSegment_4057, CimPackage.eINSTANCE
					.getLANSegment_InSegment());

			elements.put(NATServiceNATServiceRunningOnEndpoint_4058,
					CimPackage.eINSTANCE
							.getNATService_NATServiceRunningOnEndpoint());

			elements
					.put(AdminDomainNetworksInAdminDomain_4059,
							CimPackage.eINSTANCE
									.getAdminDomain_NetworksInAdminDomain());

			elements.put(LogicalPortPortImplementsEndPoint_4060,
					CimPackage.eINSTANCE
							.getLogicalPort_PortImplementsEndPoint());

			elements.put(LogicalDevicePortOnDevice_4061, CimPackage.eINSTANCE
					.getLogicalDevice_PortOnDevice());

			elements.put(ForwardingServiceRouteForwardedByService_4062,
					CimPackage.eINSTANCE
							.getForwardingService_RouteForwardedByService());

			elements.put(AutonomousSystemRouterInAS_4063, CimPackage.eINSTANCE
					.getAutonomousSystem_RouterInAS());

			elements.put(BGPClusterRoutersInBGPCluster_4064,
					CimPackage.eINSTANCE.getBGPCluster_RoutersInBGPCluster());

			elements.put(NextHopRouteRouteUsesEndpoint_4065,
					CimPackage.eINSTANCE.getNextHopRoute_RouteUsesEndpoint());

			elements.put(AutonomousSystemRoutingProtocolDomainInAS_4066,
					CimPackage.eINSTANCE
							.getAutonomousSystem_RoutingProtocolDomainInAS());

			elements.put(ComputerSystemRunningOS_4067, CimPackage.eINSTANCE
					.getComputerSystem_RunningOS());

			elements.put(ServiceSoftwareFeatureServiceImplementation_4068,
					CimPackage.eINSTANCE
							.getService_SoftwareFeatureServiceImplementation());

			elements.put(NATListBasedSettingsTranslationPoolForNAT_4069,
					CimPackage.eINSTANCE
							.getNATListBasedSettings_TranslationPoolForNAT());

			elements.put(SNMPServiceTrapSourceForSNMPService_4070,
					CimPackage.eINSTANCE
							.getSNMPService_TrapSourceForSNMPService());

			elements.put(NextHopRouteAssociatedNextHop_4071,
					CimPackage.eINSTANCE.getNextHopRoute_AssociatedNextHop());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	 * @generated
	 */
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	 * @generated
	 */
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet();
			KNOWN_ELEMENT_TYPES.add(CIM_Model_1000);
			KNOWN_ELEMENT_TYPES.add(USBDevice_2001);
			KNOWN_ELEMENT_TYPES.add(OSPFVirtualInterface_2002);
			KNOWN_ELEMENT_TYPES.add(WiFiPort_2003);
			KNOWN_ELEMENT_TYPES.add(ProtocolService_2004);
			KNOWN_ELEMENT_TYPES.add(RoutingPolicy_2005);
			KNOWN_ELEMENT_TYPES.add(EnabledLogicalElementCapabilities_2006);
			KNOWN_ELEMENT_TYPES.add(BufferPool_2007);
			KNOWN_ELEMENT_TYPES.add(MPLSProtocolEndpoint_2008);
			KNOWN_ELEMENT_TYPES.add(AutonomousSystem_2009);
			KNOWN_ELEMENT_TYPES.add(DNSSettingData_2010);
			KNOWN_ELEMENT_TYPES.add(UniModem_2011);
			KNOWN_ELEMENT_TYPES.add(EFService_2012);
			KNOWN_ELEMENT_TYPES.add(IPSubnet_2013);
			KNOWN_ELEMENT_TYPES.add(NamedAddressCollection_2014);
			KNOWN_ELEMENT_TYPES.add(BIOSElement_2015);
			KNOWN_ELEMENT_TYPES.add(TelnetSettingData_2016);
			KNOWN_ELEMENT_TYPES.add(BGPPeerGroup_2017);
			KNOWN_ELEMENT_TYPES.add(LANConnectivitySegment_2018);
			KNOWN_ELEMENT_TYPES.add(CableModem_2019);
			KNOWN_ELEMENT_TYPES.add(SwitchPort_2020);
			KNOWN_ELEMENT_TYPES.add(TCPProtocolEndpoint_2021);
			KNOWN_ELEMENT_TYPES.add(AdministrativeDistance_2022);
			KNOWN_ELEMENT_TYPES.add(IPConnectivitySubnet_2023);
			KNOWN_ELEMENT_TYPES.add(VolatileStorage_2024);
			KNOWN_ELEMENT_TYPES.add(RangeOfIPAddresses_2025);
			KNOWN_ELEMENT_TYPES.add(BGPProtocolEndpoint_2026);
			KNOWN_ELEMENT_TYPES.add(UnitaryComputerSystem_2027);
			KNOWN_ELEMENT_TYPES.add(EthernetPort_2028);
			KNOWN_ELEMENT_TYPES.add(SNMPService_2029);
			KNOWN_ELEMENT_TYPES.add(LogicalModule_2030);
			KNOWN_ELEMENT_TYPES.add(NextHopIPRoute_2031);
			KNOWN_ELEMENT_TYPES.add(OperatingSystem_2032);
			KNOWN_ELEMENT_TYPES.add(SDSLModem_2033);
			KNOWN_ELEMENT_TYPES.add(WiFiEndPoint_2034);
			KNOWN_ELEMENT_TYPES.add(NATService_2035);
			KNOWN_ELEMENT_TYPES.add(ADSLModem_2036);
			KNOWN_ELEMENT_TYPES.add(LogicalFile_2037);
			KNOWN_ELEMENT_TYPES.add(BGPCluster_2038);
			KNOWN_ELEMENT_TYPES.add(ApplicationSystem_2039);
			KNOWN_ELEMENT_TYPES.add(SoftwareIdentity_2040);
			KNOWN_ELEMENT_TYPES.add(WirelessPort_2041);
			KNOWN_ELEMENT_TYPES.add(CLPSettingData_2042);
			KNOWN_ELEMENT_TYPES.add(GenericService_2043);
			KNOWN_ELEMENT_TYPES.add(NATListBasedSettings_2044);
			KNOWN_ELEMENT_TYPES.add(VDSLModem_2045);
			KNOWN_ELEMENT_TYPES.add(USBPort_2046);
			KNOWN_ELEMENT_TYPES.add(DNSProtocolEndpoint_2047);
			KNOWN_ELEMENT_TYPES.add(WiFiEndpointSettings_2048);
			KNOWN_ELEMENT_TYPES.add(SSHSettingData_2049);
			KNOWN_ELEMENT_TYPES.add(WirelessLANEndpoint_2050);
			KNOWN_ELEMENT_TYPES.add(DHCPProtocolEndpoint_2051);
			KNOWN_ELEMENT_TYPES.add(IPHeadersFilter_2052);
			KNOWN_ELEMENT_TYPES.add(Directory_2053);
			KNOWN_ELEMENT_TYPES.add(IPAddressRange_2054);
			KNOWN_ELEMENT_TYPES.add(SNMPTrapTarget_2055);
			KNOWN_ELEMENT_TYPES.add(IPXConnectivityNetwork_2056);
			KNOWN_ELEMENT_TYPES.add(ConnectivityMemberhipSettingData_2057);
			KNOWN_ELEMENT_TYPES.add(ConditioningService_2058);
			KNOWN_ELEMENT_TYPES.add(BIOSFeature_2059);
			KNOWN_ELEMENT_TYPES.add(OSPFProtocolEndpoint_2060);
			KNOWN_ELEMENT_TYPES.add(FilterList_2061);
			KNOWN_ELEMENT_TYPES.add(BGPService_2062);
			KNOWN_ELEMENT_TYPES.add(PrecedenceService_2063);
			KNOWN_ELEMENT_TYPES.add(DHCPCapabilities_2064);
			KNOWN_ELEMENT_TYPES.add(Hdr8021PService_2065);
			KNOWN_ELEMENT_TYPES.add(ReplacementSet_2066);
			KNOWN_ELEMENT_TYPES.add(HDSLModem_2067);
			KNOWN_ELEMENT_TYPES.add(ServiceAccessURI_2068);
			KNOWN_ELEMENT_TYPES.add(FilterEntry_2069);
			KNOWN_ELEMENT_TYPES.add(SNMPCommunityStrings_2070);
			KNOWN_ELEMENT_TYPES.add(Network_2071);
			KNOWN_ELEMENT_TYPES.add(FileSpecification_2072);
			KNOWN_ELEMENT_TYPES.add(IPXNetwork_2073);
			KNOWN_ELEMENT_TYPES.add(PowerManagementCapabilities_2074);
			KNOWN_ELEMENT_TYPES.add(FlowService_2075);
			KNOWN_ELEMENT_TYPES.add(ISDNModem_2076);
			KNOWN_ELEMENT_TYPES.add(IPXProtocolEndpoint_2077);
			KNOWN_ELEMENT_TYPES.add(IPProtocolEndpoint_2078);
			KNOWN_ELEMENT_TYPES.add(UDPProtocolEndpoint_2079);
			KNOWN_ELEMENT_TYPES.add(Product_2080);
			KNOWN_ELEMENT_TYPES.add(MemoryCapacity_2081);
			KNOWN_ELEMENT_TYPES.add(RoutingProtocolDomain_2082);
			KNOWN_ELEMENT_TYPES.add(AFService_2083);
			KNOWN_ELEMENT_TYPES.add(LANSegment_2084);
			KNOWN_ELEMENT_TYPES.add(NATStaticSettings_2085);
			KNOWN_ELEMENT_TYPES.add(TelnetProtocolEndpoint_2086);
			KNOWN_ELEMENT_TYPES.add(LANEndpoint_2087);
			KNOWN_ELEMENT_TYPES.add(DropThresholdCalculationService_2088);
			KNOWN_ELEMENT_TYPES.add(AdminDomain_2089);
			KNOWN_ELEMENT_TYPES.add(SystemSpecificCollection_2090);
			KNOWN_ELEMENT_TYPES.add(NextHopRouting_2091);
			KNOWN_ELEMENT_TYPES.add(ComputerSystem_2092);
			KNOWN_ELEMENT_TYPES.add(NetworkPort_2093);
			KNOWN_ELEMENT_TYPES.add(RemoteServiceAccessPoint_2094);
			KNOWN_ELEMENT_TYPES
					.add(DirectorySpecificationDirectorySpecificationFiles_4001);
			KNOWN_ELEMENT_TYPES
					.add(OperatingSystemOperatingSystemSoftwareFeature_4002);
			KNOWN_ELEMENT_TYPES.add(SoftwareElementSoftwareElementActions_4003);
			KNOWN_ELEMENT_TYPES.add(SoftwareElementSoftwareElementChecks_4004);
			KNOWN_ELEMENT_TYPES.add(InstalledProductSoftwareElements_4005);
			KNOWN_ELEMENT_TYPES.add(BGPServiceBGPPeerGroupServices_4006);
			KNOWN_ELEMENT_TYPES.add(BGPClusterReflectorClientService_4007);
			KNOWN_ELEMENT_TYPES.add(BGPClusterReflectorNonClientService_4008);
			KNOWN_ELEMENT_TYPES.add(BGPClusterReflectorService_4009);
			KNOWN_ELEMENT_TYPES.add(ServiceAccessPointBindsTo_4010);
			KNOWN_ELEMENT_TYPES.add(ManagedElementComponents_4011);
			KNOWN_ELEMENT_TYPES.add(AdminDomainContainedDomain_4012);
			KNOWN_ELEMENT_TYPES.add(ManagedElementDependencies_4013);
			KNOWN_ELEMENT_TYPES.add(LogicalDeviceDeviceConnection_4014);
			KNOWN_ELEMENT_TYPES.add(LogicalDeviceDeviceIdentity_4015);
			KNOWN_ELEMENT_TYPES.add(LogicalDeviceDeviceSAPImplementation_4016);
			KNOWN_ELEMENT_TYPES.add(ManagedElementElementCapabilities_4017);
			KNOWN_ELEMENT_TYPES.add(ManagedElementElementSettingData_4018);
			KNOWN_ELEMENT_TYPES
					.add(SoftwareIdentityElementSoftwareIdentity_4019);
			KNOWN_ELEMENT_TYPES.add(SystemHostedAccessPoint_4020);
			KNOWN_ELEMENT_TYPES.add(SystemHostedCollection_4021);
			KNOWN_ELEMENT_TYPES.add(ManagedElementHostedDependency_4022);
			KNOWN_ELEMENT_TYPES.add(SystemHostedServices_4023);
			KNOWN_ELEMENT_TYPES.add(ElementSoftwareIdentityManagedElement_4024);
			KNOWN_ELEMENT_TYPES.add(ProductProductProductDependency_4025);
			KNOWN_ELEMENT_TYPES.add(ProductProductServiceComponent_4026);
			KNOWN_ELEMENT_TYPES
					.add(EnabledLogicalElementRemoteAccessAvailableToElement_4027);
			KNOWN_ELEMENT_TYPES.add(SystemRoles_4028);
			KNOWN_ELEMENT_TYPES.add(ServiceAccessPointSAPSAPDependency_4029);
			KNOWN_ELEMENT_TYPES.add(ServiceServiceAccessBySAP_4030);
			KNOWN_ELEMENT_TYPES.add(ServiceServiceComponents_4031);
			KNOWN_ELEMENT_TYPES.add(ServiceServiceServiceDependency_4032);
			KNOWN_ELEMENT_TYPES.add(ElementSettingDataSettingData_4033);
			KNOWN_ELEMENT_TYPES.add(SettingDataSettingsDefineCapabilities_4034);
			KNOWN_ELEMENT_TYPES
					.add(ManagedSystemElementStatusDescriptions_4035);
			KNOWN_ELEMENT_TYPES.add(SystemSystemComponents_4036);
			KNOWN_ELEMENT_TYPES.add(SystemSystemDevices_4037);
			KNOWN_ELEMENT_TYPES.add(LogicalModuleModulePort_4038);
			KNOWN_ELEMENT_TYPES.add(AFServiceAFRelatedServices_4039);
			KNOWN_ELEMENT_TYPES.add(QoSServiceQoSConditioningSubService_4040);
			KNOWN_ELEMENT_TYPES.add(QoSServiceQoSSubService_4041);
			KNOWN_ELEMENT_TYPES.add(CollectionMembers_4042);
			KNOWN_ELEMENT_TYPES
					.add(NATListBasedSettingsAddressesToBeTranslated_4043);
			KNOWN_ELEMENT_TYPES.add(BGPServiceBGPAdminDistance_4044);
			KNOWN_ELEMENT_TYPES.add(ServiceAccessPointBindsToLANEndpoint_4045);
			KNOWN_ELEMENT_TYPES
					.add(RouteCalculationServiceCalculatesAmong_4046);
			KNOWN_ELEMENT_TYPES
					.add(ProtocolEndpointEgressConditioningServiceOnEndpoint_4047);
			KNOWN_ELEMENT_TYPES.add(CIM_ModelElements_4048);
			KNOWN_ELEMENT_TYPES.add(ForwardingServiceForwardedRoutes_4049);
			KNOWN_ELEMENT_TYPES.add(ForwardingServiceForwardsAmong_4050);
			KNOWN_ELEMENT_TYPES.add(ComputerSystemHostedFilterList_4051);
			KNOWN_ELEMENT_TYPES
					.add(ComputerSystemHostedForwardingServices_4052);
			KNOWN_ELEMENT_TYPES.add(SystemHostedRoute_4053);
			KNOWN_ELEMENT_TYPES.add(ComputerSystemHostedRoutingPolicy_4054);
			KNOWN_ELEMENT_TYPES
					.add(ProtocolEndpointIngressConditioningServiceOnEndpoint_4055);
			KNOWN_ELEMENT_TYPES.add(LogicalNetworkInLogicalNetwork_4056);
			KNOWN_ELEMENT_TYPES.add(LANSegmentInSegment_4057);
			KNOWN_ELEMENT_TYPES.add(NATServiceNATServiceRunningOnEndpoint_4058);
			KNOWN_ELEMENT_TYPES.add(AdminDomainNetworksInAdminDomain_4059);
			KNOWN_ELEMENT_TYPES.add(LogicalPortPortImplementsEndPoint_4060);
			KNOWN_ELEMENT_TYPES.add(LogicalDevicePortOnDevice_4061);
			KNOWN_ELEMENT_TYPES
					.add(ForwardingServiceRouteForwardedByService_4062);
			KNOWN_ELEMENT_TYPES.add(AutonomousSystemRouterInAS_4063);
			KNOWN_ELEMENT_TYPES.add(BGPClusterRoutersInBGPCluster_4064);
			KNOWN_ELEMENT_TYPES.add(NextHopRouteRouteUsesEndpoint_4065);
			KNOWN_ELEMENT_TYPES
					.add(AutonomousSystemRoutingProtocolDomainInAS_4066);
			KNOWN_ELEMENT_TYPES.add(ComputerSystemRunningOS_4067);
			KNOWN_ELEMENT_TYPES
					.add(ServiceSoftwareFeatureServiceImplementation_4068);
			KNOWN_ELEMENT_TYPES
					.add(NATListBasedSettingsTranslationPoolForNAT_4069);
			KNOWN_ELEMENT_TYPES.add(SNMPServiceTrapSourceForSNMPService_4070);
			KNOWN_ELEMENT_TYPES.add(NextHopRouteAssociatedNextHop_4071);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

}
