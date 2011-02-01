/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.tid.cim.util;


import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

import es.tid.cim.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see es.tid.cim.CimPackage
 * @generated
 */
public class CimAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CimPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CimAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = CimPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CimSwitch<Adapter> modelSwitch =
		new CimSwitch<Adapter>() {
			@Override
			public Adapter caseCIM_Model(CIM_Model object) {
				return createCIM_ModelAdapter();
			}
			@Override
			public Adapter caseBGPCluster(BGPCluster object) {
				return createBGPClusterAdapter();
			}
			@Override
			public Adapter caseBGPPeerGroup(BGPPeerGroup object) {
				return createBGPPeerGroupAdapter();
			}
			@Override
			public Adapter caseBGPService(BGPService object) {
				return createBGPServiceAdapter();
			}
			@Override
			public Adapter caseAutonomousSystem(AutonomousSystem object) {
				return createAutonomousSystemAdapter();
			}
			@Override
			public Adapter caseNetwork(Network object) {
				return createNetworkAdapter();
			}
			@Override
			public Adapter caseComputerSystem(ComputerSystem object) {
				return createComputerSystemAdapter();
			}
			@Override
			public Adapter caseDirectory(Directory object) {
				return createDirectoryAdapter();
			}
			@Override
			public Adapter caseLogicalFile(LogicalFile object) {
				return createLogicalFileAdapter();
			}
			@Override
			public Adapter caseUnitaryComputerSystem(UnitaryComputerSystem object) {
				return createUnitaryComputerSystemAdapter();
			}
			@Override
			public Adapter caseAction(Action object) {
				return createActionAdapter();
			}
			@Override
			public Adapter caseArchitectureCheck(ArchitectureCheck object) {
				return createArchitectureCheckAdapter();
			}
			@Override
			public Adapter caseApplicationSystem(ApplicationSystem object) {
				return createApplicationSystemAdapter();
			}
			@Override
			public Adapter caseBIOSElement(BIOSElement object) {
				return createBIOSElementAdapter();
			}
			@Override
			public Adapter caseBIOSFeature(BIOSFeature object) {
				return createBIOSFeatureAdapter();
			}
			@Override
			public Adapter caseCheck(Check object) {
				return createCheckAdapter();
			}
			@Override
			public Adapter caseCreateDirectoryAction(CreateDirectoryAction object) {
				return createCreateDirectoryActionAdapter();
			}
			@Override
			public Adapter caseCopyFileAction(CopyFileAction object) {
				return createCopyFileActionAdapter();
			}
			@Override
			public Adapter caseDirectoryAction(DirectoryAction object) {
				return createDirectoryActionAdapter();
			}
			@Override
			public Adapter caseDirectorySpecification(DirectorySpecification object) {
				return createDirectorySpecificationAdapter();
			}
			@Override
			public Adapter caseDiskSpaceCheck(DiskSpaceCheck object) {
				return createDiskSpaceCheckAdapter();
			}
			@Override
			public Adapter caseExecuteProgram(ExecuteProgram object) {
				return createExecuteProgramAdapter();
			}
			@Override
			public Adapter caseFileAction(FileAction object) {
				return createFileActionAdapter();
			}
			@Override
			public Adapter caseFileSpecification(FileSpecification object) {
				return createFileSpecificationAdapter();
			}
			@Override
			public Adapter caseInstalledProduct(InstalledProduct object) {
				return createInstalledProductAdapter();
			}
			@Override
			public Adapter caseMemoryCheck(MemoryCheck object) {
				return createMemoryCheckAdapter();
			}
			@Override
			public Adapter caseModifySettingAction(ModifySettingAction object) {
				return createModifySettingActionAdapter();
			}
			@Override
			public Adapter caseOperatingSystem(OperatingSystem object) {
				return createOperatingSystemAdapter();
			}
			@Override
			public Adapter caseOSVersionCheck(OSVersionCheck object) {
				return createOSVersionCheckAdapter();
			}
			@Override
			public Adapter caseRebootAction(RebootAction object) {
				return createRebootActionAdapter();
			}
			@Override
			public Adapter caseRemoveFileAction(RemoveFileAction object) {
				return createRemoveFileActionAdapter();
			}
			@Override
			public Adapter caseRemoveDirectoryAction(RemoveDirectoryAction object) {
				return createRemoveDirectoryActionAdapter();
			}
			@Override
			public Adapter caseSettingCheck(SettingCheck object) {
				return createSettingCheckAdapter();
			}
			@Override
			public Adapter caseSoftwareElement(SoftwareElement object) {
				return createSoftwareElementAdapter();
			}
			@Override
			public Adapter caseSoftwareElementVersionCheck(SoftwareElementVersionCheck object) {
				return createSoftwareElementVersionCheckAdapter();
			}
			@Override
			public Adapter caseSoftwareFeature(SoftwareFeature object) {
				return createSoftwareFeatureAdapter();
			}
			@Override
			public Adapter caseSwapSpaceCheck(SwapSpaceCheck object) {
				return createSwapSpaceCheckAdapter();
			}
			@Override
			public Adapter caseVersionCompatibilityCheck(VersionCompatibilityCheck object) {
				return createVersionCompatibilityCheckAdapter();
			}
			@Override
			public Adapter caseBufferPool(BufferPool object) {
				return createBufferPoolAdapter();
			}
			@Override
			public Adapter caseConnectivityMemberhipSettingData(ConnectivityMemberhipSettingData object) {
				return createConnectivityMemberhipSettingDataAdapter();
			}
			@Override
			public Adapter caseConnectivityCollection(ConnectivityCollection object) {
				return createConnectivityCollectionAdapter();
			}
			@Override
			public Adapter caseNamedAddressCollection(NamedAddressCollection object) {
				return createNamedAddressCollectionAdapter();
			}
			@Override
			public Adapter caseRangeOfIPAddresses(RangeOfIPAddresses object) {
				return createRangeOfIPAddressesAdapter();
			}
			@Override
			public Adapter caseLANConnectivitySegment(LANConnectivitySegment object) {
				return createLANConnectivitySegmentAdapter();
			}
			@Override
			public Adapter caseIPConnectivitySubnet(IPConnectivitySubnet object) {
				return createIPConnectivitySubnetAdapter();
			}
			@Override
			public Adapter caseIPXConnectivityNetwork(IPXConnectivityNetwork object) {
				return createIPXConnectivityNetworkAdapter();
			}
			@Override
			public Adapter caseIPAddressRange(IPAddressRange object) {
				return createIPAddressRangeAdapter();
			}
			@Override
			public Adapter caseLogicalNetwork(LogicalNetwork object) {
				return createLogicalNetworkAdapter();
			}
			@Override
			public Adapter caseIPXNetwork(IPXNetwork object) {
				return createIPXNetworkAdapter();
			}
			@Override
			public Adapter caseLANSegment(LANSegment object) {
				return createLANSegmentAdapter();
			}
			@Override
			public Adapter caseIPSubnet(IPSubnet object) {
				return createIPSubnetAdapter();
			}
			@Override
			public Adapter caseAdminDomain(AdminDomain object) {
				return createAdminDomainAdapter();
			}
			@Override
			public Adapter caseCapabilities(Capabilities object) {
				return createCapabilitiesAdapter();
			}
			@Override
			public Adapter caseCollection(Collection object) {
				return createCollectionAdapter();
			}
			@Override
			public Adapter caseCollectionOfMSEs(CollectionOfMSEs object) {
				return createCollectionOfMSEsAdapter();
			}
			@Override
			public Adapter caseElementSettingData(ElementSettingData object) {
				return createElementSettingDataAdapter();
			}
			@Override
			public Adapter caseElementSoftwareIdentity(ElementSoftwareIdentity object) {
				return createElementSoftwareIdentityAdapter();
			}
			@Override
			public Adapter caseEnabledLogicalElement(EnabledLogicalElement object) {
				return createEnabledLogicalElementAdapter();
			}
			@Override
			public Adapter caseEnabledLogicalElementCapabilities(EnabledLogicalElementCapabilities object) {
				return createEnabledLogicalElementCapabilitiesAdapter();
			}
			@Override
			public Adapter caseGenericService(GenericService object) {
				return createGenericServiceAdapter();
			}
			@Override
			public Adapter caseLogicalDevice(LogicalDevice object) {
				return createLogicalDeviceAdapter();
			}
			@Override
			public Adapter caseLogicalElement(LogicalElement object) {
				return createLogicalElementAdapter();
			}
			@Override
			public Adapter caseManagedElement(ManagedElement object) {
				return createManagedElementAdapter();
			}
			@Override
			public Adapter caseManagedSystemElement(ManagedSystemElement object) {
				return createManagedSystemElementAdapter();
			}
			@Override
			public Adapter casePhysicalElement(PhysicalElement object) {
				return createPhysicalElementAdapter();
			}
			@Override
			public Adapter casePowerManagementCapabilities(PowerManagementCapabilities object) {
				return createPowerManagementCapabilitiesAdapter();
			}
			@Override
			public Adapter caseProduct(Product object) {
				return createProductAdapter();
			}
			@Override
			public Adapter caseProtocolEndpoint(ProtocolEndpoint object) {
				return createProtocolEndpointAdapter();
			}
			@Override
			public Adapter caseRemotePort(RemotePort object) {
				return createRemotePortAdapter();
			}
			@Override
			public Adapter caseRemoteServiceAccessPoint(RemoteServiceAccessPoint object) {
				return createRemoteServiceAccessPointAdapter();
			}
			@Override
			public Adapter caseRole(Role object) {
				return createRoleAdapter();
			}
			@Override
			public Adapter caseScopedSettingData(ScopedSettingData object) {
				return createScopedSettingDataAdapter();
			}
			@Override
			public Adapter caseService(Service object) {
				return createServiceAdapter();
			}
			@Override
			public Adapter caseServiceAccessURI(ServiceAccessURI object) {
				return createServiceAccessURIAdapter();
			}
			@Override
			public Adapter caseServiceAccessPoint(ServiceAccessPoint object) {
				return createServiceAccessPointAdapter();
			}
			@Override
			public Adapter caseSettingData(SettingData object) {
				return createSettingDataAdapter();
			}
			@Override
			public Adapter caseSoftwareIdentity(SoftwareIdentity object) {
				return createSoftwareIdentityAdapter();
			}
			@Override
			public Adapter caseStatusDescription(StatusDescription object) {
				return createStatusDescriptionAdapter();
			}
			@Override
			public Adapter caseSystem(es.tid.cim.System object) {
				return createSystemAdapter();
			}
			@Override
			public Adapter caseSystemSpecificCollection(SystemSpecificCollection object) {
				return createSystemSpecificCollectionAdapter();
			}
			@Override
			public Adapter caseStorageExtent(StorageExtent object) {
				return createStorageExtentAdapter();
			}
			@Override
			public Adapter caseMemory(Memory object) {
				return createMemoryAdapter();
			}
			@Override
			public Adapter caseVolatileStorage(VolatileStorage object) {
				return createVolatileStorageAdapter();
			}
			@Override
			public Adapter caseUSBDevice(USBDevice object) {
				return createUSBDeviceAdapter();
			}
			@Override
			public Adapter caseFilterList(FilterList object) {
				return createFilterListAdapter();
			}
			@Override
			public Adapter caseFilterEntryBase(FilterEntryBase object) {
				return createFilterEntryBaseAdapter();
			}
			@Override
			public Adapter caseFilterEntry(FilterEntry object) {
				return createFilterEntryAdapter();
			}
			@Override
			public Adapter caseIPHeadersFilter(IPHeadersFilter object) {
				return createIPHeadersFilterAdapter();
			}
			@Override
			public Adapter caseEthernetPort(EthernetPort object) {
				return createEthernetPortAdapter();
			}
			@Override
			public Adapter caseLogicalModule(LogicalModule object) {
				return createLogicalModuleAdapter();
			}
			@Override
			public Adapter caseLogicalPort(LogicalPort object) {
				return createLogicalPortAdapter();
			}
			@Override
			public Adapter caseNetworkPort(NetworkPort object) {
				return createNetworkPortAdapter();
			}
			@Override
			public Adapter caseUSBPort(USBPort object) {
				return createUSBPortAdapter();
			}
			@Override
			public Adapter caseWirelessPort(WirelessPort object) {
				return createWirelessPortAdapter();
			}
			@Override
			public Adapter caseWiFiPort(WiFiPort object) {
				return createWiFiPortAdapter();
			}
			@Override
			public Adapter caseADSLModem(ADSLModem object) {
				return createADSLModemAdapter();
			}
			@Override
			public Adapter caseCableModem(CableModem object) {
				return createCableModemAdapter();
			}
			@Override
			public Adapter caseCallBasedModem(CallBasedModem object) {
				return createCallBasedModemAdapter();
			}
			@Override
			public Adapter caseConnectionBasedModem(ConnectionBasedModem object) {
				return createConnectionBasedModemAdapter();
			}
			@Override
			public Adapter caseDSLModem(DSLModem object) {
				return createDSLModemAdapter();
			}
			@Override
			public Adapter caseISDNModem(ISDNModem object) {
				return createISDNModemAdapter();
			}
			@Override
			public Adapter caseModem(Modem object) {
				return createModemAdapter();
			}
			@Override
			public Adapter caseHDSLModem(HDSLModem object) {
				return createHDSLModemAdapter();
			}
			@Override
			public Adapter caseSDSLModem(SDSLModem object) {
				return createSDSLModemAdapter();
			}
			@Override
			public Adapter caseVDSLModem(VDSLModem object) {
				return createVDSLModemAdapter();
			}
			@Override
			public Adapter casePOTSModem(POTSModem object) {
				return createPOTSModemAdapter();
			}
			@Override
			public Adapter caseUniModem(UniModem object) {
				return createUniModemAdapter();
			}
			@Override
			public Adapter caseReplacementSet(ReplacementSet object) {
				return createReplacementSetAdapter();
			}
			@Override
			public Adapter casePhysicalCapcacity(PhysicalCapcacity object) {
				return createPhysicalCapcacityAdapter();
			}
			@Override
			public Adapter caseMemoryCapacity(MemoryCapacity object) {
				return createMemoryCapacityAdapter();
			}
			@Override
			public Adapter caseLANEndpoint(LANEndpoint object) {
				return createLANEndpointAdapter();
			}
			@Override
			public Adapter caseOSPFProtocolEndpointBase(OSPFProtocolEndpointBase object) {
				return createOSPFProtocolEndpointBaseAdapter();
			}
			@Override
			public Adapter caseOSPFVirtualInterface(OSPFVirtualInterface object) {
				return createOSPFVirtualInterfaceAdapter();
			}
			@Override
			public Adapter caseOSPFProtocolEndpoint(OSPFProtocolEndpoint object) {
				return createOSPFProtocolEndpointAdapter();
			}
			@Override
			public Adapter caseBGPProtocolEndpoint(BGPProtocolEndpoint object) {
				return createBGPProtocolEndpointAdapter();
			}
			@Override
			public Adapter caseIPProtocolEndpoint(IPProtocolEndpoint object) {
				return createIPProtocolEndpointAdapter();
			}
			@Override
			public Adapter caseIPXProtocolEndpoint(IPXProtocolEndpoint object) {
				return createIPXProtocolEndpointAdapter();
			}
			@Override
			public Adapter caseMPLSProtocolEndpoint(MPLSProtocolEndpoint object) {
				return createMPLSProtocolEndpointAdapter();
			}
			@Override
			public Adapter caseSwitchPort(SwitchPort object) {
				return createSwitchPortAdapter();
			}
			@Override
			public Adapter caseTCPProtocolEndpoint(TCPProtocolEndpoint object) {
				return createTCPProtocolEndpointAdapter();
			}
			@Override
			public Adapter caseUDPProtocolEndpoint(UDPProtocolEndpoint object) {
				return createUDPProtocolEndpointAdapter();
			}
			@Override
			public Adapter caseCLPSettingData(CLPSettingData object) {
				return createCLPSettingDataAdapter();
			}
			@Override
			public Adapter caseTelnetSettingData(TelnetSettingData object) {
				return createTelnetSettingDataAdapter();
			}
			@Override
			public Adapter caseSSHSettingData(SSHSettingData object) {
				return createSSHSettingDataAdapter();
			}
			@Override
			public Adapter caseDHCPCapabilities(DHCPCapabilities object) {
				return createDHCPCapabilitiesAdapter();
			}
			@Override
			public Adapter caseDHCPProtocolEndpoint(DHCPProtocolEndpoint object) {
				return createDHCPProtocolEndpointAdapter();
			}
			@Override
			public Adapter caseTelnetProtocolEndpoint(TelnetProtocolEndpoint object) {
				return createTelnetProtocolEndpointAdapter();
			}
			@Override
			public Adapter caseDNSProtocolEndpoint(DNSProtocolEndpoint object) {
				return createDNSProtocolEndpointAdapter();
			}
			@Override
			public Adapter caseDNSSettingData(DNSSettingData object) {
				return createDNSSettingDataAdapter();
			}
			@Override
			public Adapter caseIPAssignmentSettingData(IPAssignmentSettingData object) {
				return createIPAssignmentSettingDataAdapter();
			}
			@Override
			public Adapter caseWirelessLANEndpoint(WirelessLANEndpoint object) {
				return createWirelessLANEndpointAdapter();
			}
			@Override
			public Adapter caseWiFiEndPoint(WiFiEndPoint object) {
				return createWiFiEndPointAdapter();
			}
			@Override
			public Adapter caseWiFiEndpointSettings(WiFiEndpointSettings object) {
				return createWiFiEndpointSettingsAdapter();
			}
			@Override
			public Adapter caseProtocolService(ProtocolService object) {
				return createProtocolServiceAdapter();
			}
			@Override
			public Adapter caseConditioningService(ConditioningService object) {
				return createConditioningServiceAdapter();
			}
			@Override
			public Adapter caseQoSService(QoSService object) {
				return createQoSServiceAdapter();
			}
			@Override
			public Adapter casePrecedenceService(PrecedenceService object) {
				return createPrecedenceServiceAdapter();
			}
			@Override
			public Adapter caseDiffServService(DiffServService object) {
				return createDiffServServiceAdapter();
			}
			@Override
			public Adapter caseEFService(EFService object) {
				return createEFServiceAdapter();
			}
			@Override
			public Adapter caseAFService(AFService object) {
				return createAFServiceAdapter();
			}
			@Override
			public Adapter caseHdr8021PService(Hdr8021PService object) {
				return createHdr8021PServiceAdapter();
			}
			@Override
			public Adapter caseDropThresholdCalculationService(DropThresholdCalculationService object) {
				return createDropThresholdCalculationServiceAdapter();
			}
			@Override
			public Adapter caseFlowService(FlowService object) {
				return createFlowServiceAdapter();
			}
			@Override
			public Adapter caseNextHopRoute(NextHopRoute object) {
				return createNextHopRouteAdapter();
			}
			@Override
			public Adapter caseNextHopIPRoute(NextHopIPRoute object) {
				return createNextHopIPRouteAdapter();
			}
			@Override
			public Adapter caseAdministrativeDistance(AdministrativeDistance object) {
				return createAdministrativeDistanceAdapter();
			}
			@Override
			public Adapter caseNextHopRouting(NextHopRouting object) {
				return createNextHopRoutingAdapter();
			}
			@Override
			public Adapter caseIPRoute(IPRoute object) {
				return createIPRouteAdapter();
			}
			@Override
			public Adapter caseRoutingPolicy(RoutingPolicy object) {
				return createRoutingPolicyAdapter();
			}
			@Override
			public Adapter caseRouteCalculationService(RouteCalculationService object) {
				return createRouteCalculationServiceAdapter();
			}
			@Override
			public Adapter caseNetworkService(NetworkService object) {
				return createNetworkServiceAdapter();
			}
			@Override
			public Adapter caseForwardingService(ForwardingService object) {
				return createForwardingServiceAdapter();
			}
			@Override
			public Adapter caseRoutingProtocolDomain(RoutingProtocolDomain object) {
				return createRoutingProtocolDomainAdapter();
			}
			@Override
			public Adapter caseNATService(NATService object) {
				return createNATServiceAdapter();
			}
			@Override
			public Adapter caseNATSettingData(NATSettingData object) {
				return createNATSettingDataAdapter();
			}
			@Override
			public Adapter caseNATStaticSettings(NATStaticSettings object) {
				return createNATStaticSettingsAdapter();
			}
			@Override
			public Adapter caseNATListBasedSettings(NATListBasedSettings object) {
				return createNATListBasedSettingsAdapter();
			}
			@Override
			public Adapter caseSNMPCommunityStrings(SNMPCommunityStrings object) {
				return createSNMPCommunityStringsAdapter();
			}
			@Override
			public Adapter caseSNMPService(SNMPService object) {
				return createSNMPServiceAdapter();
			}
			@Override
			public Adapter caseSNMPTrapTarget(SNMPTrapTarget object) {
				return createSNMPTrapTargetAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link es.tid.cim.CIM_Model <em>CIM Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.tid.cim.CIM_Model
	 * @generated
	 */
	public Adapter createCIM_ModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.tid.cim.BGPCluster <em>BGP Cluster</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.tid.cim.BGPCluster
	 * @generated
	 */
	public Adapter createBGPClusterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.tid.cim.BGPPeerGroup <em>BGP Peer Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.tid.cim.BGPPeerGroup
	 * @generated
	 */
	public Adapter createBGPPeerGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.tid.cim.BGPService <em>BGP Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.tid.cim.BGPService
	 * @generated
	 */
	public Adapter createBGPServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.tid.cim.AutonomousSystem <em>Autonomous System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.tid.cim.AutonomousSystem
	 * @generated
	 */
	public Adapter createAutonomousSystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.tid.cim.Network <em>Network</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.tid.cim.Network
	 * @generated
	 */
	public Adapter createNetworkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.tid.cim.ComputerSystem <em>Computer System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.tid.cim.ComputerSystem
	 * @generated
	 */
	public Adapter createComputerSystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.tid.cim.Directory <em>Directory</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.tid.cim.Directory
	 * @generated
	 */
	public Adapter createDirectoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.tid.cim.LogicalFile <em>Logical File</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.tid.cim.LogicalFile
	 * @generated
	 */
	public Adapter createLogicalFileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.tid.cim.UnitaryComputerSystem <em>Unitary Computer System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.tid.cim.UnitaryComputerSystem
	 * @generated
	 */
	public Adapter createUnitaryComputerSystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.tid.cim.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.tid.cim.Action
	 * @generated
	 */
	public Adapter createActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.tid.cim.ArchitectureCheck <em>Architecture Check</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.tid.cim.ArchitectureCheck
	 * @generated
	 */
	public Adapter createArchitectureCheckAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.tid.cim.ApplicationSystem <em>Application System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.tid.cim.ApplicationSystem
	 * @generated
	 */
	public Adapter createApplicationSystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.tid.cim.BIOSElement <em>BIOS Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.tid.cim.BIOSElement
	 * @generated
	 */
	public Adapter createBIOSElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.tid.cim.BIOSFeature <em>BIOS Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.tid.cim.BIOSFeature
	 * @generated
	 */
	public Adapter createBIOSFeatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.tid.cim.Check <em>Check</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.tid.cim.Check
	 * @generated
	 */
	public Adapter createCheckAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.tid.cim.CreateDirectoryAction <em>Create Directory Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.tid.cim.CreateDirectoryAction
	 * @generated
	 */
	public Adapter createCreateDirectoryActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.tid.cim.CopyFileAction <em>Copy File Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.tid.cim.CopyFileAction
	 * @generated
	 */
	public Adapter createCopyFileActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.tid.cim.DirectoryAction <em>Directory Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.tid.cim.DirectoryAction
	 * @generated
	 */
	public Adapter createDirectoryActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.tid.cim.DirectorySpecification <em>Directory Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.tid.cim.DirectorySpecification
	 * @generated
	 */
	public Adapter createDirectorySpecificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.tid.cim.DiskSpaceCheck <em>Disk Space Check</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.tid.cim.DiskSpaceCheck
	 * @generated
	 */
	public Adapter createDiskSpaceCheckAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.tid.cim.ExecuteProgram <em>Execute Program</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.tid.cim.ExecuteProgram
	 * @generated
	 */
	public Adapter createExecuteProgramAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.tid.cim.FileAction <em>File Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.tid.cim.FileAction
	 * @generated
	 */
	public Adapter createFileActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.tid.cim.FileSpecification <em>File Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.tid.cim.FileSpecification
	 * @generated
	 */
	public Adapter createFileSpecificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.tid.cim.InstalledProduct <em>Installed Product</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.tid.cim.InstalledProduct
	 * @generated
	 */
	public Adapter createInstalledProductAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.tid.cim.MemoryCheck <em>Memory Check</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.tid.cim.MemoryCheck
	 * @generated
	 */
	public Adapter createMemoryCheckAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.tid.cim.ModifySettingAction <em>Modify Setting Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.tid.cim.ModifySettingAction
	 * @generated
	 */
	public Adapter createModifySettingActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.tid.cim.OperatingSystem <em>Operating System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.tid.cim.OperatingSystem
	 * @generated
	 */
	public Adapter createOperatingSystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.tid.cim.OSVersionCheck <em>OS Version Check</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.tid.cim.OSVersionCheck
	 * @generated
	 */
	public Adapter createOSVersionCheckAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.tid.cim.RebootAction <em>Reboot Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.tid.cim.RebootAction
	 * @generated
	 */
	public Adapter createRebootActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.tid.cim.RemoveFileAction <em>Remove File Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.tid.cim.RemoveFileAction
	 * @generated
	 */
	public Adapter createRemoveFileActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.tid.cim.RemoveDirectoryAction <em>Remove Directory Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.tid.cim.RemoveDirectoryAction
	 * @generated
	 */
	public Adapter createRemoveDirectoryActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.tid.cim.SettingCheck <em>Setting Check</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.tid.cim.SettingCheck
	 * @generated
	 */
	public Adapter createSettingCheckAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.tid.cim.SoftwareElement <em>Software Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.tid.cim.SoftwareElement
	 * @generated
	 */
	public Adapter createSoftwareElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.tid.cim.SoftwareElementVersionCheck <em>Software Element Version Check</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.tid.cim.SoftwareElementVersionCheck
	 * @generated
	 */
	public Adapter createSoftwareElementVersionCheckAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.tid.cim.SoftwareFeature <em>Software Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.tid.cim.SoftwareFeature
	 * @generated
	 */
	public Adapter createSoftwareFeatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.tid.cim.SwapSpaceCheck <em>Swap Space Check</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.tid.cim.SwapSpaceCheck
	 * @generated
	 */
	public Adapter createSwapSpaceCheckAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.tid.cim.VersionCompatibilityCheck <em>Version Compatibility Check</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.tid.cim.VersionCompatibilityCheck
	 * @generated
	 */
	public Adapter createVersionCompatibilityCheckAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.tid.cim.BufferPool <em>Buffer Pool</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.tid.cim.BufferPool
	 * @generated
	 */
	public Adapter createBufferPoolAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.tid.cim.ConnectivityMemberhipSettingData <em>Connectivity Memberhip Setting Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.tid.cim.ConnectivityMemberhipSettingData
	 * @generated
	 */
	public Adapter createConnectivityMemberhipSettingDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.tid.cim.ConnectivityCollection <em>Connectivity Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.tid.cim.ConnectivityCollection
	 * @generated
	 */
	public Adapter createConnectivityCollectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.tid.cim.NamedAddressCollection <em>Named Address Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.tid.cim.NamedAddressCollection
	 * @generated
	 */
	public Adapter createNamedAddressCollectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.tid.cim.RangeOfIPAddresses <em>Range Of IP Addresses</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.tid.cim.RangeOfIPAddresses
	 * @generated
	 */
	public Adapter createRangeOfIPAddressesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.tid.cim.LANConnectivitySegment <em>LAN Connectivity Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.tid.cim.LANConnectivitySegment
	 * @generated
	 */
	public Adapter createLANConnectivitySegmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.tid.cim.IPConnectivitySubnet <em>IP Connectivity Subnet</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.tid.cim.IPConnectivitySubnet
	 * @generated
	 */
	public Adapter createIPConnectivitySubnetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.tid.cim.IPXConnectivityNetwork <em>IPX Connectivity Network</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.tid.cim.IPXConnectivityNetwork
	 * @generated
	 */
	public Adapter createIPXConnectivityNetworkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.tid.cim.IPAddressRange <em>IP Address Range</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.tid.cim.IPAddressRange
	 * @generated
	 */
	public Adapter createIPAddressRangeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.tid.cim.LogicalNetwork <em>Logical Network</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.tid.cim.LogicalNetwork
	 * @generated
	 */
	public Adapter createLogicalNetworkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.tid.cim.IPXNetwork <em>IPX Network</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.tid.cim.IPXNetwork
	 * @generated
	 */
	public Adapter createIPXNetworkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.tid.cim.LANSegment <em>LAN Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.tid.cim.LANSegment
	 * @generated
	 */
	public Adapter createLANSegmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.tid.cim.IPSubnet <em>IP Subnet</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.tid.cim.IPSubnet
	 * @generated
	 */
	public Adapter createIPSubnetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.tid.cim.AdminDomain <em>Admin Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.tid.cim.AdminDomain
	 * @generated
	 */
	public Adapter createAdminDomainAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.tid.cim.Capabilities <em>Capabilities</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.tid.cim.Capabilities
	 * @generated
	 */
	public Adapter createCapabilitiesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.tid.cim.Collection <em>Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.tid.cim.Collection
	 * @generated
	 */
	public Adapter createCollectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.tid.cim.CollectionOfMSEs <em>Collection Of MS Es</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.tid.cim.CollectionOfMSEs
	 * @generated
	 */
	public Adapter createCollectionOfMSEsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.tid.cim.ElementSettingData <em>Element Setting Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.tid.cim.ElementSettingData
	 * @generated
	 */
	public Adapter createElementSettingDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.tid.cim.ElementSoftwareIdentity <em>Element Software Identity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.tid.cim.ElementSoftwareIdentity
	 * @generated
	 */
	public Adapter createElementSoftwareIdentityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.tid.cim.EnabledLogicalElement <em>Enabled Logical Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.tid.cim.EnabledLogicalElement
	 * @generated
	 */
	public Adapter createEnabledLogicalElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.tid.cim.EnabledLogicalElementCapabilities <em>Enabled Logical Element Capabilities</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.tid.cim.EnabledLogicalElementCapabilities
	 * @generated
	 */
	public Adapter createEnabledLogicalElementCapabilitiesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.tid.cim.GenericService <em>Generic Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.tid.cim.GenericService
	 * @generated
	 */
	public Adapter createGenericServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.tid.cim.LogicalDevice <em>Logical Device</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.tid.cim.LogicalDevice
	 * @generated
	 */
	public Adapter createLogicalDeviceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.tid.cim.LogicalElement <em>Logical Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.tid.cim.LogicalElement
	 * @generated
	 */
	public Adapter createLogicalElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.tid.cim.ManagedElement <em>Managed Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.tid.cim.ManagedElement
	 * @generated
	 */
	public Adapter createManagedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.tid.cim.ManagedSystemElement <em>Managed System Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.tid.cim.ManagedSystemElement
	 * @generated
	 */
	public Adapter createManagedSystemElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.tid.cim.PhysicalElement <em>Physical Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.tid.cim.PhysicalElement
	 * @generated
	 */
	public Adapter createPhysicalElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.tid.cim.PowerManagementCapabilities <em>Power Management Capabilities</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.tid.cim.PowerManagementCapabilities
	 * @generated
	 */
	public Adapter createPowerManagementCapabilitiesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.tid.cim.Product <em>Product</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.tid.cim.Product
	 * @generated
	 */
	public Adapter createProductAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.tid.cim.ProtocolEndpoint <em>Protocol Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.tid.cim.ProtocolEndpoint
	 * @generated
	 */
	public Adapter createProtocolEndpointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.tid.cim.RemotePort <em>Remote Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.tid.cim.RemotePort
	 * @generated
	 */
	public Adapter createRemotePortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.tid.cim.RemoteServiceAccessPoint <em>Remote Service Access Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.tid.cim.RemoteServiceAccessPoint
	 * @generated
	 */
	public Adapter createRemoteServiceAccessPointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.tid.cim.Role <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.tid.cim.Role
	 * @generated
	 */
	public Adapter createRoleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.tid.cim.ScopedSettingData <em>Scoped Setting Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.tid.cim.ScopedSettingData
	 * @generated
	 */
	public Adapter createScopedSettingDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.tid.cim.Service <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.tid.cim.Service
	 * @generated
	 */
	public Adapter createServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.tid.cim.ServiceAccessURI <em>Service Access URI</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.tid.cim.ServiceAccessURI
	 * @generated
	 */
	public Adapter createServiceAccessURIAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.tid.cim.ServiceAccessPoint <em>Service Access Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.tid.cim.ServiceAccessPoint
	 * @generated
	 */
	public Adapter createServiceAccessPointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.tid.cim.SettingData <em>Setting Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.tid.cim.SettingData
	 * @generated
	 */
	public Adapter createSettingDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.tid.cim.SoftwareIdentity <em>Software Identity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.tid.cim.SoftwareIdentity
	 * @generated
	 */
	public Adapter createSoftwareIdentityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.tid.cim.StatusDescription <em>Status Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.tid.cim.StatusDescription
	 * @generated
	 */
	public Adapter createStatusDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.tid.cim.System <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.tid.cim.System
	 * @generated
	 */
	public Adapter createSystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.tid.cim.SystemSpecificCollection <em>System Specific Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.tid.cim.SystemSpecificCollection
	 * @generated
	 */
	public Adapter createSystemSpecificCollectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.tid.cim.StorageExtent <em>Storage Extent</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.tid.cim.StorageExtent
	 * @generated
	 */
	public Adapter createStorageExtentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.tid.cim.Memory <em>Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.tid.cim.Memory
	 * @generated
	 */
	public Adapter createMemoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.tid.cim.VolatileStorage <em>Volatile Storage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.tid.cim.VolatileStorage
	 * @generated
	 */
	public Adapter createVolatileStorageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.tid.cim.USBDevice <em>USB Device</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.tid.cim.USBDevice
	 * @generated
	 */
	public Adapter createUSBDeviceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.tid.cim.FilterList <em>Filter List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.tid.cim.FilterList
	 * @generated
	 */
	public Adapter createFilterListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.tid.cim.FilterEntryBase <em>Filter Entry Base</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.tid.cim.FilterEntryBase
	 * @generated
	 */
	public Adapter createFilterEntryBaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.tid.cim.FilterEntry <em>Filter Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.tid.cim.FilterEntry
	 * @generated
	 */
	public Adapter createFilterEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.tid.cim.IPHeadersFilter <em>IP Headers Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.tid.cim.IPHeadersFilter
	 * @generated
	 */
	public Adapter createIPHeadersFilterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.tid.cim.EthernetPort <em>Ethernet Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.tid.cim.EthernetPort
	 * @generated
	 */
	public Adapter createEthernetPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.tid.cim.LogicalModule <em>Logical Module</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.tid.cim.LogicalModule
	 * @generated
	 */
	public Adapter createLogicalModuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.tid.cim.LogicalPort <em>Logical Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.tid.cim.LogicalPort
	 * @generated
	 */
	public Adapter createLogicalPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.tid.cim.NetworkPort <em>Network Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.tid.cim.NetworkPort
	 * @generated
	 */
	public Adapter createNetworkPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.tid.cim.USBPort <em>USB Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.tid.cim.USBPort
	 * @generated
	 */
	public Adapter createUSBPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.tid.cim.WirelessPort <em>Wireless Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.tid.cim.WirelessPort
	 * @generated
	 */
	public Adapter createWirelessPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.tid.cim.WiFiPort <em>Wi Fi Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.tid.cim.WiFiPort
	 * @generated
	 */
	public Adapter createWiFiPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.tid.cim.ADSLModem <em>ADSL Modem</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.tid.cim.ADSLModem
	 * @generated
	 */
	public Adapter createADSLModemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.tid.cim.CableModem <em>Cable Modem</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.tid.cim.CableModem
	 * @generated
	 */
	public Adapter createCableModemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.tid.cim.CallBasedModem <em>Call Based Modem</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.tid.cim.CallBasedModem
	 * @generated
	 */
	public Adapter createCallBasedModemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.tid.cim.ConnectionBasedModem <em>Connection Based Modem</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.tid.cim.ConnectionBasedModem
	 * @generated
	 */
	public Adapter createConnectionBasedModemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.tid.cim.DSLModem <em>DSL Modem</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.tid.cim.DSLModem
	 * @generated
	 */
	public Adapter createDSLModemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.tid.cim.ISDNModem <em>ISDN Modem</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.tid.cim.ISDNModem
	 * @generated
	 */
	public Adapter createISDNModemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.tid.cim.Modem <em>Modem</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.tid.cim.Modem
	 * @generated
	 */
	public Adapter createModemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.tid.cim.HDSLModem <em>HDSL Modem</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.tid.cim.HDSLModem
	 * @generated
	 */
	public Adapter createHDSLModemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.tid.cim.SDSLModem <em>SDSL Modem</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.tid.cim.SDSLModem
	 * @generated
	 */
	public Adapter createSDSLModemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.tid.cim.VDSLModem <em>VDSL Modem</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.tid.cim.VDSLModem
	 * @generated
	 */
	public Adapter createVDSLModemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.tid.cim.POTSModem <em>POTS Modem</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.tid.cim.POTSModem
	 * @generated
	 */
	public Adapter createPOTSModemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.tid.cim.UniModem <em>Uni Modem</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.tid.cim.UniModem
	 * @generated
	 */
	public Adapter createUniModemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.tid.cim.ReplacementSet <em>Replacement Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.tid.cim.ReplacementSet
	 * @generated
	 */
	public Adapter createReplacementSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.tid.cim.PhysicalCapcacity <em>Physical Capcacity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.tid.cim.PhysicalCapcacity
	 * @generated
	 */
	public Adapter createPhysicalCapcacityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.tid.cim.MemoryCapacity <em>Memory Capacity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.tid.cim.MemoryCapacity
	 * @generated
	 */
	public Adapter createMemoryCapacityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.tid.cim.LANEndpoint <em>LAN Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.tid.cim.LANEndpoint
	 * @generated
	 */
	public Adapter createLANEndpointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.tid.cim.OSPFProtocolEndpointBase <em>OSPF Protocol Endpoint Base</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.tid.cim.OSPFProtocolEndpointBase
	 * @generated
	 */
	public Adapter createOSPFProtocolEndpointBaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.tid.cim.OSPFVirtualInterface <em>OSPF Virtual Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.tid.cim.OSPFVirtualInterface
	 * @generated
	 */
	public Adapter createOSPFVirtualInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.tid.cim.OSPFProtocolEndpoint <em>OSPF Protocol Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.tid.cim.OSPFProtocolEndpoint
	 * @generated
	 */
	public Adapter createOSPFProtocolEndpointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.tid.cim.BGPProtocolEndpoint <em>BGP Protocol Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.tid.cim.BGPProtocolEndpoint
	 * @generated
	 */
	public Adapter createBGPProtocolEndpointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.tid.cim.IPProtocolEndpoint <em>IP Protocol Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.tid.cim.IPProtocolEndpoint
	 * @generated
	 */
	public Adapter createIPProtocolEndpointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.tid.cim.IPXProtocolEndpoint <em>IPX Protocol Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.tid.cim.IPXProtocolEndpoint
	 * @generated
	 */
	public Adapter createIPXProtocolEndpointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.tid.cim.MPLSProtocolEndpoint <em>MPLS Protocol Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.tid.cim.MPLSProtocolEndpoint
	 * @generated
	 */
	public Adapter createMPLSProtocolEndpointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.tid.cim.SwitchPort <em>Switch Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.tid.cim.SwitchPort
	 * @generated
	 */
	public Adapter createSwitchPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.tid.cim.TCPProtocolEndpoint <em>TCP Protocol Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.tid.cim.TCPProtocolEndpoint
	 * @generated
	 */
	public Adapter createTCPProtocolEndpointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.tid.cim.UDPProtocolEndpoint <em>UDP Protocol Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.tid.cim.UDPProtocolEndpoint
	 * @generated
	 */
	public Adapter createUDPProtocolEndpointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.tid.cim.CLPSettingData <em>CLP Setting Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.tid.cim.CLPSettingData
	 * @generated
	 */
	public Adapter createCLPSettingDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.tid.cim.TelnetSettingData <em>Telnet Setting Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.tid.cim.TelnetSettingData
	 * @generated
	 */
	public Adapter createTelnetSettingDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.tid.cim.SSHSettingData <em>SSH Setting Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.tid.cim.SSHSettingData
	 * @generated
	 */
	public Adapter createSSHSettingDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.tid.cim.DHCPCapabilities <em>DHCP Capabilities</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.tid.cim.DHCPCapabilities
	 * @generated
	 */
	public Adapter createDHCPCapabilitiesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.tid.cim.DHCPProtocolEndpoint <em>DHCP Protocol Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.tid.cim.DHCPProtocolEndpoint
	 * @generated
	 */
	public Adapter createDHCPProtocolEndpointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.tid.cim.TelnetProtocolEndpoint <em>Telnet Protocol Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.tid.cim.TelnetProtocolEndpoint
	 * @generated
	 */
	public Adapter createTelnetProtocolEndpointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.tid.cim.DNSProtocolEndpoint <em>DNS Protocol Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.tid.cim.DNSProtocolEndpoint
	 * @generated
	 */
	public Adapter createDNSProtocolEndpointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.tid.cim.DNSSettingData <em>DNS Setting Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.tid.cim.DNSSettingData
	 * @generated
	 */
	public Adapter createDNSSettingDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.tid.cim.IPAssignmentSettingData <em>IP Assignment Setting Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.tid.cim.IPAssignmentSettingData
	 * @generated
	 */
	public Adapter createIPAssignmentSettingDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.tid.cim.WirelessLANEndpoint <em>Wireless LAN Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.tid.cim.WirelessLANEndpoint
	 * @generated
	 */
	public Adapter createWirelessLANEndpointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.tid.cim.WiFiEndPoint <em>Wi Fi End Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.tid.cim.WiFiEndPoint
	 * @generated
	 */
	public Adapter createWiFiEndPointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.tid.cim.WiFiEndpointSettings <em>Wi Fi Endpoint Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.tid.cim.WiFiEndpointSettings
	 * @generated
	 */
	public Adapter createWiFiEndpointSettingsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.tid.cim.ProtocolService <em>Protocol Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.tid.cim.ProtocolService
	 * @generated
	 */
	public Adapter createProtocolServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.tid.cim.ConditioningService <em>Conditioning Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.tid.cim.ConditioningService
	 * @generated
	 */
	public Adapter createConditioningServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.tid.cim.QoSService <em>Qo SService</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.tid.cim.QoSService
	 * @generated
	 */
	public Adapter createQoSServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.tid.cim.PrecedenceService <em>Precedence Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.tid.cim.PrecedenceService
	 * @generated
	 */
	public Adapter createPrecedenceServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.tid.cim.DiffServService <em>Diff Serv Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.tid.cim.DiffServService
	 * @generated
	 */
	public Adapter createDiffServServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.tid.cim.EFService <em>EF Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.tid.cim.EFService
	 * @generated
	 */
	public Adapter createEFServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.tid.cim.AFService <em>AF Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.tid.cim.AFService
	 * @generated
	 */
	public Adapter createAFServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.tid.cim.Hdr8021PService <em>Hdr8021 PService</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.tid.cim.Hdr8021PService
	 * @generated
	 */
	public Adapter createHdr8021PServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.tid.cim.DropThresholdCalculationService <em>Drop Threshold Calculation Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.tid.cim.DropThresholdCalculationService
	 * @generated
	 */
	public Adapter createDropThresholdCalculationServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.tid.cim.FlowService <em>Flow Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.tid.cim.FlowService
	 * @generated
	 */
	public Adapter createFlowServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.tid.cim.NextHopRoute <em>Next Hop Route</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.tid.cim.NextHopRoute
	 * @generated
	 */
	public Adapter createNextHopRouteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.tid.cim.NextHopIPRoute <em>Next Hop IP Route</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.tid.cim.NextHopIPRoute
	 * @generated
	 */
	public Adapter createNextHopIPRouteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.tid.cim.AdministrativeDistance <em>Administrative Distance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.tid.cim.AdministrativeDistance
	 * @generated
	 */
	public Adapter createAdministrativeDistanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.tid.cim.NextHopRouting <em>Next Hop Routing</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.tid.cim.NextHopRouting
	 * @generated
	 */
	public Adapter createNextHopRoutingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.tid.cim.IPRoute <em>IP Route</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.tid.cim.IPRoute
	 * @generated
	 */
	public Adapter createIPRouteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.tid.cim.RoutingPolicy <em>Routing Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.tid.cim.RoutingPolicy
	 * @generated
	 */
	public Adapter createRoutingPolicyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.tid.cim.RouteCalculationService <em>Route Calculation Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.tid.cim.RouteCalculationService
	 * @generated
	 */
	public Adapter createRouteCalculationServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.tid.cim.NetworkService <em>Network Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.tid.cim.NetworkService
	 * @generated
	 */
	public Adapter createNetworkServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.tid.cim.ForwardingService <em>Forwarding Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.tid.cim.ForwardingService
	 * @generated
	 */
	public Adapter createForwardingServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.tid.cim.RoutingProtocolDomain <em>Routing Protocol Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.tid.cim.RoutingProtocolDomain
	 * @generated
	 */
	public Adapter createRoutingProtocolDomainAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.tid.cim.NATService <em>NAT Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.tid.cim.NATService
	 * @generated
	 */
	public Adapter createNATServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.tid.cim.NATSettingData <em>NAT Setting Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.tid.cim.NATSettingData
	 * @generated
	 */
	public Adapter createNATSettingDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.tid.cim.NATStaticSettings <em>NAT Static Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.tid.cim.NATStaticSettings
	 * @generated
	 */
	public Adapter createNATStaticSettingsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.tid.cim.NATListBasedSettings <em>NAT List Based Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.tid.cim.NATListBasedSettings
	 * @generated
	 */
	public Adapter createNATListBasedSettingsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.tid.cim.SNMPCommunityStrings <em>SNMP Community Strings</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.tid.cim.SNMPCommunityStrings
	 * @generated
	 */
	public Adapter createSNMPCommunityStringsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.tid.cim.SNMPService <em>SNMP Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.tid.cim.SNMPService
	 * @generated
	 */
	public Adapter createSNMPServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.tid.cim.SNMPTrapTarget <em>SNMP Trap Target</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.tid.cim.SNMPTrapTarget
	 * @generated
	 */
	public Adapter createSNMPTrapTargetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //CimAdapterFactory
