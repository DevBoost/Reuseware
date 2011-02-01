/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.tid.cim.impl;


import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import es.tid.cim.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CimFactoryImpl extends EFactoryImpl implements CimFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CimFactory init() {
		try {
			CimFactory theCimFactory = (CimFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.tid.es/cim"); 
			if (theCimFactory != null) {
				return theCimFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CimFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CimFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case CimPackage.CIM_MODEL: return createCIM_Model();
			case CimPackage.BGP_CLUSTER: return createBGPCluster();
			case CimPackage.BGP_PEER_GROUP: return createBGPPeerGroup();
			case CimPackage.BGP_SERVICE: return createBGPService();
			case CimPackage.AUTONOMOUS_SYSTEM: return createAutonomousSystem();
			case CimPackage.NETWORK: return createNetwork();
			case CimPackage.COMPUTER_SYSTEM: return createComputerSystem();
			case CimPackage.DIRECTORY: return createDirectory();
			case CimPackage.LOGICAL_FILE: return createLogicalFile();
			case CimPackage.UNITARY_COMPUTER_SYSTEM: return createUnitaryComputerSystem();
			case CimPackage.ARCHITECTURE_CHECK: return createArchitectureCheck();
			case CimPackage.APPLICATION_SYSTEM: return createApplicationSystem();
			case CimPackage.BIOS_ELEMENT: return createBIOSElement();
			case CimPackage.BIOS_FEATURE: return createBIOSFeature();
			case CimPackage.CREATE_DIRECTORY_ACTION: return createCreateDirectoryAction();
			case CimPackage.COPY_FILE_ACTION: return createCopyFileAction();
			case CimPackage.DIRECTORY_SPECIFICATION: return createDirectorySpecification();
			case CimPackage.DISK_SPACE_CHECK: return createDiskSpaceCheck();
			case CimPackage.EXECUTE_PROGRAM: return createExecuteProgram();
			case CimPackage.FILE_SPECIFICATION: return createFileSpecification();
			case CimPackage.INSTALLED_PRODUCT: return createInstalledProduct();
			case CimPackage.MEMORY_CHECK: return createMemoryCheck();
			case CimPackage.MODIFY_SETTING_ACTION: return createModifySettingAction();
			case CimPackage.OPERATING_SYSTEM: return createOperatingSystem();
			case CimPackage.OS_VERSION_CHECK: return createOSVersionCheck();
			case CimPackage.REBOOT_ACTION: return createRebootAction();
			case CimPackage.REMOVE_FILE_ACTION: return createRemoveFileAction();
			case CimPackage.REMOVE_DIRECTORY_ACTION: return createRemoveDirectoryAction();
			case CimPackage.SETTING_CHECK: return createSettingCheck();
			case CimPackage.SOFTWARE_ELEMENT: return createSoftwareElement();
			case CimPackage.SOFTWARE_ELEMENT_VERSION_CHECK: return createSoftwareElementVersionCheck();
			case CimPackage.SOFTWARE_FEATURE: return createSoftwareFeature();
			case CimPackage.SWAP_SPACE_CHECK: return createSwapSpaceCheck();
			case CimPackage.VERSION_COMPATIBILITY_CHECK: return createVersionCompatibilityCheck();
			case CimPackage.BUFFER_POOL: return createBufferPool();
			case CimPackage.CONNECTIVITY_MEMBERHIP_SETTING_DATA: return createConnectivityMemberhipSettingData();
			case CimPackage.CONNECTIVITY_COLLECTION: return createConnectivityCollection();
			case CimPackage.NAMED_ADDRESS_COLLECTION: return createNamedAddressCollection();
			case CimPackage.RANGE_OF_IP_ADDRESSES: return createRangeOfIPAddresses();
			case CimPackage.LAN_CONNECTIVITY_SEGMENT: return createLANConnectivitySegment();
			case CimPackage.IP_CONNECTIVITY_SUBNET: return createIPConnectivitySubnet();
			case CimPackage.IPX_CONNECTIVITY_NETWORK: return createIPXConnectivityNetwork();
			case CimPackage.IP_ADDRESS_RANGE: return createIPAddressRange();
			case CimPackage.LOGICAL_NETWORK: return createLogicalNetwork();
			case CimPackage.IPX_NETWORK: return createIPXNetwork();
			case CimPackage.LAN_SEGMENT: return createLANSegment();
			case CimPackage.IP_SUBNET: return createIPSubnet();
			case CimPackage.ADMIN_DOMAIN: return createAdminDomain();
			case CimPackage.ELEMENT_SETTING_DATA: return createElementSettingData();
			case CimPackage.ELEMENT_SOFTWARE_IDENTITY: return createElementSoftwareIdentity();
			case CimPackage.ENABLED_LOGICAL_ELEMENT_CAPABILITIES: return createEnabledLogicalElementCapabilities();
			case CimPackage.GENERIC_SERVICE: return createGenericService();
			case CimPackage.POWER_MANAGEMENT_CAPABILITIES: return createPowerManagementCapabilities();
			case CimPackage.PRODUCT: return createProduct();
			case CimPackage.PROTOCOL_ENDPOINT: return createProtocolEndpoint();
			case CimPackage.REMOTE_PORT: return createRemotePort();
			case CimPackage.REMOTE_SERVICE_ACCESS_POINT: return createRemoteServiceAccessPoint();
			case CimPackage.ROLE: return createRole();
			case CimPackage.SERVICE_ACCESS_URI: return createServiceAccessURI();
			case CimPackage.SOFTWARE_IDENTITY: return createSoftwareIdentity();
			case CimPackage.STATUS_DESCRIPTION: return createStatusDescription();
			case CimPackage.SYSTEM_SPECIFIC_COLLECTION: return createSystemSpecificCollection();
			case CimPackage.STORAGE_EXTENT: return createStorageExtent();
			case CimPackage.MEMORY: return createMemory();
			case CimPackage.VOLATILE_STORAGE: return createVolatileStorage();
			case CimPackage.USB_DEVICE: return createUSBDevice();
			case CimPackage.FILTER_LIST: return createFilterList();
			case CimPackage.FILTER_ENTRY: return createFilterEntry();
			case CimPackage.IP_HEADERS_FILTER: return createIPHeadersFilter();
			case CimPackage.ETHERNET_PORT: return createEthernetPort();
			case CimPackage.LOGICAL_MODULE: return createLogicalModule();
			case CimPackage.LOGICAL_PORT: return createLogicalPort();
			case CimPackage.NETWORK_PORT: return createNetworkPort();
			case CimPackage.USB_PORT: return createUSBPort();
			case CimPackage.WIRELESS_PORT: return createWirelessPort();
			case CimPackage.WI_FI_PORT: return createWiFiPort();
			case CimPackage.ADSL_MODEM: return createADSLModem();
			case CimPackage.CABLE_MODEM: return createCableModem();
			case CimPackage.DSL_MODEM: return createDSLModem();
			case CimPackage.ISDN_MODEM: return createISDNModem();
			case CimPackage.HDSL_MODEM: return createHDSLModem();
			case CimPackage.SDSL_MODEM: return createSDSLModem();
			case CimPackage.VDSL_MODEM: return createVDSLModem();
			case CimPackage.POTS_MODEM: return createPOTSModem();
			case CimPackage.UNI_MODEM: return createUniModem();
			case CimPackage.REPLACEMENT_SET: return createReplacementSet();
			case CimPackage.MEMORY_CAPACITY: return createMemoryCapacity();
			case CimPackage.LAN_ENDPOINT: return createLANEndpoint();
			case CimPackage.OSPF_PROTOCOL_ENDPOINT_BASE: return createOSPFProtocolEndpointBase();
			case CimPackage.OSPF_VIRTUAL_INTERFACE: return createOSPFVirtualInterface();
			case CimPackage.OSPF_PROTOCOL_ENDPOINT: return createOSPFProtocolEndpoint();
			case CimPackage.BGP_PROTOCOL_ENDPOINT: return createBGPProtocolEndpoint();
			case CimPackage.IP_PROTOCOL_ENDPOINT: return createIPProtocolEndpoint();
			case CimPackage.IPX_PROTOCOL_ENDPOINT: return createIPXProtocolEndpoint();
			case CimPackage.MPLS_PROTOCOL_ENDPOINT: return createMPLSProtocolEndpoint();
			case CimPackage.SWITCH_PORT: return createSwitchPort();
			case CimPackage.TCP_PROTOCOL_ENDPOINT: return createTCPProtocolEndpoint();
			case CimPackage.UDP_PROTOCOL_ENDPOINT: return createUDPProtocolEndpoint();
			case CimPackage.CLP_SETTING_DATA: return createCLPSettingData();
			case CimPackage.TELNET_SETTING_DATA: return createTelnetSettingData();
			case CimPackage.SSH_SETTING_DATA: return createSSHSettingData();
			case CimPackage.DHCP_CAPABILITIES: return createDHCPCapabilities();
			case CimPackage.DHCP_PROTOCOL_ENDPOINT: return createDHCPProtocolEndpoint();
			case CimPackage.TELNET_PROTOCOL_ENDPOINT: return createTelnetProtocolEndpoint();
			case CimPackage.DNS_PROTOCOL_ENDPOINT: return createDNSProtocolEndpoint();
			case CimPackage.DNS_SETTING_DATA: return createDNSSettingData();
			case CimPackage.IP_ASSIGNMENT_SETTING_DATA: return createIPAssignmentSettingData();
			case CimPackage.WIRELESS_LAN_ENDPOINT: return createWirelessLANEndpoint();
			case CimPackage.WI_FI_END_POINT: return createWiFiEndPoint();
			case CimPackage.WI_FI_ENDPOINT_SETTINGS: return createWiFiEndpointSettings();
			case CimPackage.PROTOCOL_SERVICE: return createProtocolService();
			case CimPackage.CONDITIONING_SERVICE: return createConditioningService();
			case CimPackage.QO_SSERVICE: return createQoSService();
			case CimPackage.PRECEDENCE_SERVICE: return createPrecedenceService();
			case CimPackage.DIFF_SERV_SERVICE: return createDiffServService();
			case CimPackage.EF_SERVICE: return createEFService();
			case CimPackage.AF_SERVICE: return createAFService();
			case CimPackage.HDR8021_PSERVICE: return createHdr8021PService();
			case CimPackage.DROP_THRESHOLD_CALCULATION_SERVICE: return createDropThresholdCalculationService();
			case CimPackage.FLOW_SERVICE: return createFlowService();
			case CimPackage.NEXT_HOP_IP_ROUTE: return createNextHopIPRoute();
			case CimPackage.ADMINISTRATIVE_DISTANCE: return createAdministrativeDistance();
			case CimPackage.NEXT_HOP_ROUTING: return createNextHopRouting();
			case CimPackage.ROUTING_POLICY: return createRoutingPolicy();
			case CimPackage.FORWARDING_SERVICE: return createForwardingService();
			case CimPackage.ROUTING_PROTOCOL_DOMAIN: return createRoutingProtocolDomain();
			case CimPackage.NAT_SERVICE: return createNATService();
			case CimPackage.NAT_STATIC_SETTINGS: return createNATStaticSettings();
			case CimPackage.NAT_LIST_BASED_SETTINGS: return createNATListBasedSettings();
			case CimPackage.SNMP_COMMUNITY_STRINGS: return createSNMPCommunityStrings();
			case CimPackage.SNMP_SERVICE: return createSNMPService();
			case CimPackage.SNMP_TRAP_TARGET: return createSNMPTrapTarget();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case CimPackage.ENUM_DEDICATED:
				return createEnumDedicatedFromString(eDataType, initialValue);
			case CimPackage.ENUM_SOFTWARE_ELEMENT_STATE:
				return createEnumSoftwareElementStateFromString(eDataType, initialValue);
			case CimPackage.ENUM_ADDRESS_TYPE:
				return createEnumAddressTypeFromString(eDataType, initialValue);
			case CimPackage.ENUM_ACCESS_CONTEXT:
				return createEnumAccessContextFromString(eDataType, initialValue);
			case CimPackage.ENUM_CHANGEABLE_TYPE:
				return createEnumChangeableTypeFromString(eDataType, initialValue);
			case CimPackage.ENUM_CLASSIFICATIONS:
				return createEnumClassificationsFromString(eDataType, initialValue);
			case CimPackage.ENUM_HEALTH_STATE:
				return createEnumHealthStateFromString(eDataType, initialValue);
			case CimPackage.ENUM_ENABLED_DEFAULT:
				return createEnumEnabledDefaultFromString(eDataType, initialValue);
			case CimPackage.ENUM_ENABLED_STATE:
				return createEnumEnabledStateFromString(eDataType, initialValue);
			case CimPackage.ENUM_ELEMENT_SOFTWARE_STATUS:
				return createEnumElementSoftwareStatusFromString(eDataType, initialValue);
			case CimPackage.ENUM_EXTENDED_RESOURCE_TYPE:
				return createEnumExtendedResourceTypeFromString(eDataType, initialValue);
			case CimPackage.ENUM_INFO_FORMAT:
				return createEnumInfoFormatFromString(eDataType, initialValue);
			case CimPackage.ENUM_IS_CURRENT:
				return createEnumIsCurrentFromString(eDataType, initialValue);
			case CimPackage.ENUM_IS_DEFAULT:
				return createEnumIsDefaultFromString(eDataType, initialValue);
			case CimPackage.ENUM_IS_MAXIMUM:
				return createEnumIsMaximumFromString(eDataType, initialValue);
			case CimPackage.ENUM_IS_MINIMUM:
				return createEnumIsMinimumFromString(eDataType, initialValue);
			case CimPackage.ENUM_IS_NEXT:
				return createEnumIsNextFromString(eDataType, initialValue);
			case CimPackage.ENUM_IS_PENDING:
				return createEnumIsPendingFromString(eDataType, initialValue);
			case CimPackage.ENUM_NAME_FORMAT:
				return createEnumNameFormatFromString(eDataType, initialValue);
			case CimPackage.ENUM_OPERATIONAL_STATUS:
				return createEnumOperationalStatusFromString(eDataType, initialValue);
			case CimPackage.ENUM_PROTOCOL_IF_TYPE:
				return createEnumProtocolIFTypeFromString(eDataType, initialValue);
			case CimPackage.ENUM_REQUESTED_STATE:
				return createEnumRequestedStateFromString(eDataType, initialValue);
			case CimPackage.ENUM_TARGET_OS_TYPES:
				return createEnumTargetOSTypesFromString(eDataType, initialValue);
			case CimPackage.ENUM_UPGRADE_CONDITION:
				return createEnumUpgradeConditionFromString(eDataType, initialValue);
			case CimPackage.ENUM_DIRECTION:
				return createEnumDirectionFromString(eDataType, initialValue);
			case CimPackage.ENUM_MATCH_CONDITION_TYPE:
				return createEnumMatchConditionTypeFromString(eDataType, initialValue);
			case CimPackage.ENUM_ACTION:
				return createEnumActionFromString(eDataType, initialValue);
			case CimPackage.ENUM_TRAFFIC_TYPE:
				return createEnumTrafficTypeFromString(eDataType, initialValue);
			case CimPackage.ENUM_IP_VERSION:
				return createEnumIPVersionFromString(eDataType, initialValue);
			case CimPackage.ENUM_AVAILABILITY:
				return createEnumAvailabilityFromString(eDataType, initialValue);
			case CimPackage.ENUM_LINK_TECHNOLOGY:
				return createEnumLinkTechnologyFromString(eDataType, initialValue);
			case CimPackage.ENUM_LOGICAL_MODULE_TYPE:
				return createEnumLogicalModuleTypeFromString(eDataType, initialValue);
			case CimPackage.ENUM_PORT_TYPE:
				return createEnumPortTypeFromString(eDataType, initialValue);
			case CimPackage.ENUM_STATUS_INFO:
				return createEnumStatusInfoFromString(eDataType, initialValue);
			case CimPackage.ENUM_LINE_STATE:
				return createEnumLineStateFromString(eDataType, initialValue);
			case CimPackage.ENUM_MODULATION_SCHEME:
				return createEnumModulationSchemeFromString(eDataType, initialValue);
			case CimPackage.ENUM_ADDRESS_ORIGIN:
				return createEnumAddressOriginFromString(eDataType, initialValue);
			case CimPackage.ENUM_TERMINAL_MODE:
				return createEnumTerminalModeFromString(eDataType, initialValue);
			case CimPackage.ENUM_CHARACTER_DISPLAY_MODE:
				return createEnumCharacterDisplayModeFromString(eDataType, initialValue);
			case CimPackage.ENUM_DHCP_OPTIONS:
				return createEnumDHCPOptionsFromString(eDataType, initialValue);
			case CimPackage.ENUM_AUTHENTICATION_METHOD:
				return createEnumAuthenticationMethodFromString(eDataType, initialValue);
			case CimPackage.ENUM_ENCRYPTION_METHOD:
				return createEnumEncryptionMethodFromString(eDataType, initialValue);
			case CimPackage.ENUM_BSS_TYPE:
				return createEnumBSSTypeFromString(eDataType, initialValue);
			case CimPackage.ENUM_PROTOCOL_SERVICE_RETURN_CODE:
				return createEnumProtocolServiceReturnCodeFromString(eDataType, initialValue);
			case CimPackage.ENUM_PROTOCOL_TYPE:
				return createEnumProtocolTypeFromString(eDataType, initialValue);
			case CimPackage.ENUM_ADDRESS_EXAMINED:
				return createEnumAddressExaminedFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case CimPackage.ENUM_DEDICATED:
				return convertEnumDedicatedToString(eDataType, instanceValue);
			case CimPackage.ENUM_SOFTWARE_ELEMENT_STATE:
				return convertEnumSoftwareElementStateToString(eDataType, instanceValue);
			case CimPackage.ENUM_ADDRESS_TYPE:
				return convertEnumAddressTypeToString(eDataType, instanceValue);
			case CimPackage.ENUM_ACCESS_CONTEXT:
				return convertEnumAccessContextToString(eDataType, instanceValue);
			case CimPackage.ENUM_CHANGEABLE_TYPE:
				return convertEnumChangeableTypeToString(eDataType, instanceValue);
			case CimPackage.ENUM_CLASSIFICATIONS:
				return convertEnumClassificationsToString(eDataType, instanceValue);
			case CimPackage.ENUM_HEALTH_STATE:
				return convertEnumHealthStateToString(eDataType, instanceValue);
			case CimPackage.ENUM_ENABLED_DEFAULT:
				return convertEnumEnabledDefaultToString(eDataType, instanceValue);
			case CimPackage.ENUM_ENABLED_STATE:
				return convertEnumEnabledStateToString(eDataType, instanceValue);
			case CimPackage.ENUM_ELEMENT_SOFTWARE_STATUS:
				return convertEnumElementSoftwareStatusToString(eDataType, instanceValue);
			case CimPackage.ENUM_EXTENDED_RESOURCE_TYPE:
				return convertEnumExtendedResourceTypeToString(eDataType, instanceValue);
			case CimPackage.ENUM_INFO_FORMAT:
				return convertEnumInfoFormatToString(eDataType, instanceValue);
			case CimPackage.ENUM_IS_CURRENT:
				return convertEnumIsCurrentToString(eDataType, instanceValue);
			case CimPackage.ENUM_IS_DEFAULT:
				return convertEnumIsDefaultToString(eDataType, instanceValue);
			case CimPackage.ENUM_IS_MAXIMUM:
				return convertEnumIsMaximumToString(eDataType, instanceValue);
			case CimPackage.ENUM_IS_MINIMUM:
				return convertEnumIsMinimumToString(eDataType, instanceValue);
			case CimPackage.ENUM_IS_NEXT:
				return convertEnumIsNextToString(eDataType, instanceValue);
			case CimPackage.ENUM_IS_PENDING:
				return convertEnumIsPendingToString(eDataType, instanceValue);
			case CimPackage.ENUM_NAME_FORMAT:
				return convertEnumNameFormatToString(eDataType, instanceValue);
			case CimPackage.ENUM_OPERATIONAL_STATUS:
				return convertEnumOperationalStatusToString(eDataType, instanceValue);
			case CimPackage.ENUM_PROTOCOL_IF_TYPE:
				return convertEnumProtocolIFTypeToString(eDataType, instanceValue);
			case CimPackage.ENUM_REQUESTED_STATE:
				return convertEnumRequestedStateToString(eDataType, instanceValue);
			case CimPackage.ENUM_TARGET_OS_TYPES:
				return convertEnumTargetOSTypesToString(eDataType, instanceValue);
			case CimPackage.ENUM_UPGRADE_CONDITION:
				return convertEnumUpgradeConditionToString(eDataType, instanceValue);
			case CimPackage.ENUM_DIRECTION:
				return convertEnumDirectionToString(eDataType, instanceValue);
			case CimPackage.ENUM_MATCH_CONDITION_TYPE:
				return convertEnumMatchConditionTypeToString(eDataType, instanceValue);
			case CimPackage.ENUM_ACTION:
				return convertEnumActionToString(eDataType, instanceValue);
			case CimPackage.ENUM_TRAFFIC_TYPE:
				return convertEnumTrafficTypeToString(eDataType, instanceValue);
			case CimPackage.ENUM_IP_VERSION:
				return convertEnumIPVersionToString(eDataType, instanceValue);
			case CimPackage.ENUM_AVAILABILITY:
				return convertEnumAvailabilityToString(eDataType, instanceValue);
			case CimPackage.ENUM_LINK_TECHNOLOGY:
				return convertEnumLinkTechnologyToString(eDataType, instanceValue);
			case CimPackage.ENUM_LOGICAL_MODULE_TYPE:
				return convertEnumLogicalModuleTypeToString(eDataType, instanceValue);
			case CimPackage.ENUM_PORT_TYPE:
				return convertEnumPortTypeToString(eDataType, instanceValue);
			case CimPackage.ENUM_STATUS_INFO:
				return convertEnumStatusInfoToString(eDataType, instanceValue);
			case CimPackage.ENUM_LINE_STATE:
				return convertEnumLineStateToString(eDataType, instanceValue);
			case CimPackage.ENUM_MODULATION_SCHEME:
				return convertEnumModulationSchemeToString(eDataType, instanceValue);
			case CimPackage.ENUM_ADDRESS_ORIGIN:
				return convertEnumAddressOriginToString(eDataType, instanceValue);
			case CimPackage.ENUM_TERMINAL_MODE:
				return convertEnumTerminalModeToString(eDataType, instanceValue);
			case CimPackage.ENUM_CHARACTER_DISPLAY_MODE:
				return convertEnumCharacterDisplayModeToString(eDataType, instanceValue);
			case CimPackage.ENUM_DHCP_OPTIONS:
				return convertEnumDHCPOptionsToString(eDataType, instanceValue);
			case CimPackage.ENUM_AUTHENTICATION_METHOD:
				return convertEnumAuthenticationMethodToString(eDataType, instanceValue);
			case CimPackage.ENUM_ENCRYPTION_METHOD:
				return convertEnumEncryptionMethodToString(eDataType, instanceValue);
			case CimPackage.ENUM_BSS_TYPE:
				return convertEnumBSSTypeToString(eDataType, instanceValue);
			case CimPackage.ENUM_PROTOCOL_SERVICE_RETURN_CODE:
				return convertEnumProtocolServiceReturnCodeToString(eDataType, instanceValue);
			case CimPackage.ENUM_PROTOCOL_TYPE:
				return convertEnumProtocolTypeToString(eDataType, instanceValue);
			case CimPackage.ENUM_ADDRESS_EXAMINED:
				return convertEnumAddressExaminedToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CIM_Model createCIM_Model() {
		CIM_ModelImpl ciM_Model = new CIM_ModelImpl();
		return ciM_Model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BGPCluster createBGPCluster() {
		BGPClusterImpl bgpCluster = new BGPClusterImpl();
		return bgpCluster;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BGPPeerGroup createBGPPeerGroup() {
		BGPPeerGroupImpl bgpPeerGroup = new BGPPeerGroupImpl();
		return bgpPeerGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BGPService createBGPService() {
		BGPServiceImpl bgpService = new BGPServiceImpl();
		return bgpService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AutonomousSystem createAutonomousSystem() {
		AutonomousSystemImpl autonomousSystem = new AutonomousSystemImpl();
		return autonomousSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Network createNetwork() {
		NetworkImpl network = new NetworkImpl();
		return network;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComputerSystem createComputerSystem() {
		ComputerSystemImpl computerSystem = new ComputerSystemImpl();
		return computerSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Directory createDirectory() {
		DirectoryImpl directory = new DirectoryImpl();
		return directory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalFile createLogicalFile() {
		LogicalFileImpl logicalFile = new LogicalFileImpl();
		return logicalFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitaryComputerSystem createUnitaryComputerSystem() {
		UnitaryComputerSystemImpl unitaryComputerSystem = new UnitaryComputerSystemImpl();
		return unitaryComputerSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArchitectureCheck createArchitectureCheck() {
		ArchitectureCheckImpl architectureCheck = new ArchitectureCheckImpl();
		return architectureCheck;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationSystem createApplicationSystem() {
		ApplicationSystemImpl applicationSystem = new ApplicationSystemImpl();
		return applicationSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BIOSElement createBIOSElement() {
		BIOSElementImpl biosElement = new BIOSElementImpl();
		return biosElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BIOSFeature createBIOSFeature() {
		BIOSFeatureImpl biosFeature = new BIOSFeatureImpl();
		return biosFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreateDirectoryAction createCreateDirectoryAction() {
		CreateDirectoryActionImpl createDirectoryAction = new CreateDirectoryActionImpl();
		return createDirectoryAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CopyFileAction createCopyFileAction() {
		CopyFileActionImpl copyFileAction = new CopyFileActionImpl();
		return copyFileAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DirectorySpecification createDirectorySpecification() {
		DirectorySpecificationImpl directorySpecification = new DirectorySpecificationImpl();
		return directorySpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiskSpaceCheck createDiskSpaceCheck() {
		DiskSpaceCheckImpl diskSpaceCheck = new DiskSpaceCheckImpl();
		return diskSpaceCheck;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecuteProgram createExecuteProgram() {
		ExecuteProgramImpl executeProgram = new ExecuteProgramImpl();
		return executeProgram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileSpecification createFileSpecification() {
		FileSpecificationImpl fileSpecification = new FileSpecificationImpl();
		return fileSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstalledProduct createInstalledProduct() {
		InstalledProductImpl installedProduct = new InstalledProductImpl();
		return installedProduct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MemoryCheck createMemoryCheck() {
		MemoryCheckImpl memoryCheck = new MemoryCheckImpl();
		return memoryCheck;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModifySettingAction createModifySettingAction() {
		ModifySettingActionImpl modifySettingAction = new ModifySettingActionImpl();
		return modifySettingAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperatingSystem createOperatingSystem() {
		OperatingSystemImpl operatingSystem = new OperatingSystemImpl();
		return operatingSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OSVersionCheck createOSVersionCheck() {
		OSVersionCheckImpl osVersionCheck = new OSVersionCheckImpl();
		return osVersionCheck;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RebootAction createRebootAction() {
		RebootActionImpl rebootAction = new RebootActionImpl();
		return rebootAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemoveFileAction createRemoveFileAction() {
		RemoveFileActionImpl removeFileAction = new RemoveFileActionImpl();
		return removeFileAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemoveDirectoryAction createRemoveDirectoryAction() {
		RemoveDirectoryActionImpl removeDirectoryAction = new RemoveDirectoryActionImpl();
		return removeDirectoryAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SettingCheck createSettingCheck() {
		SettingCheckImpl settingCheck = new SettingCheckImpl();
		return settingCheck;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoftwareElement createSoftwareElement() {
		SoftwareElementImpl softwareElement = new SoftwareElementImpl();
		return softwareElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoftwareElementVersionCheck createSoftwareElementVersionCheck() {
		SoftwareElementVersionCheckImpl softwareElementVersionCheck = new SoftwareElementVersionCheckImpl();
		return softwareElementVersionCheck;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoftwareFeature createSoftwareFeature() {
		SoftwareFeatureImpl softwareFeature = new SoftwareFeatureImpl();
		return softwareFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwapSpaceCheck createSwapSpaceCheck() {
		SwapSpaceCheckImpl swapSpaceCheck = new SwapSpaceCheckImpl();
		return swapSpaceCheck;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VersionCompatibilityCheck createVersionCompatibilityCheck() {
		VersionCompatibilityCheckImpl versionCompatibilityCheck = new VersionCompatibilityCheckImpl();
		return versionCompatibilityCheck;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BufferPool createBufferPool() {
		BufferPoolImpl bufferPool = new BufferPoolImpl();
		return bufferPool;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectivityMemberhipSettingData createConnectivityMemberhipSettingData() {
		ConnectivityMemberhipSettingDataImpl connectivityMemberhipSettingData = new ConnectivityMemberhipSettingDataImpl();
		return connectivityMemberhipSettingData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectivityCollection createConnectivityCollection() {
		ConnectivityCollectionImpl connectivityCollection = new ConnectivityCollectionImpl();
		return connectivityCollection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedAddressCollection createNamedAddressCollection() {
		NamedAddressCollectionImpl namedAddressCollection = new NamedAddressCollectionImpl();
		return namedAddressCollection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RangeOfIPAddresses createRangeOfIPAddresses() {
		RangeOfIPAddressesImpl rangeOfIPAddresses = new RangeOfIPAddressesImpl();
		return rangeOfIPAddresses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LANConnectivitySegment createLANConnectivitySegment() {
		LANConnectivitySegmentImpl lanConnectivitySegment = new LANConnectivitySegmentImpl();
		return lanConnectivitySegment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IPConnectivitySubnet createIPConnectivitySubnet() {
		IPConnectivitySubnetImpl ipConnectivitySubnet = new IPConnectivitySubnetImpl();
		return ipConnectivitySubnet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IPXConnectivityNetwork createIPXConnectivityNetwork() {
		IPXConnectivityNetworkImpl ipxConnectivityNetwork = new IPXConnectivityNetworkImpl();
		return ipxConnectivityNetwork;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IPAddressRange createIPAddressRange() {
		IPAddressRangeImpl ipAddressRange = new IPAddressRangeImpl();
		return ipAddressRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalNetwork createLogicalNetwork() {
		LogicalNetworkImpl logicalNetwork = new LogicalNetworkImpl();
		return logicalNetwork;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IPXNetwork createIPXNetwork() {
		IPXNetworkImpl ipxNetwork = new IPXNetworkImpl();
		return ipxNetwork;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LANSegment createLANSegment() {
		LANSegmentImpl lanSegment = new LANSegmentImpl();
		return lanSegment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IPSubnet createIPSubnet() {
		IPSubnetImpl ipSubnet = new IPSubnetImpl();
		return ipSubnet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdminDomain createAdminDomain() {
		AdminDomainImpl adminDomain = new AdminDomainImpl();
		return adminDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementSettingData createElementSettingData() {
		ElementSettingDataImpl elementSettingData = new ElementSettingDataImpl();
		return elementSettingData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementSoftwareIdentity createElementSoftwareIdentity() {
		ElementSoftwareIdentityImpl elementSoftwareIdentity = new ElementSoftwareIdentityImpl();
		return elementSoftwareIdentity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnabledLogicalElementCapabilities createEnabledLogicalElementCapabilities() {
		EnabledLogicalElementCapabilitiesImpl enabledLogicalElementCapabilities = new EnabledLogicalElementCapabilitiesImpl();
		return enabledLogicalElementCapabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenericService createGenericService() {
		GenericServiceImpl genericService = new GenericServiceImpl();
		return genericService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PowerManagementCapabilities createPowerManagementCapabilities() {
		PowerManagementCapabilitiesImpl powerManagementCapabilities = new PowerManagementCapabilitiesImpl();
		return powerManagementCapabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Product createProduct() {
		ProductImpl product = new ProductImpl();
		return product;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProtocolEndpoint createProtocolEndpoint() {
		ProtocolEndpointImpl protocolEndpoint = new ProtocolEndpointImpl();
		return protocolEndpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemotePort createRemotePort() {
		RemotePortImpl remotePort = new RemotePortImpl();
		return remotePort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemoteServiceAccessPoint createRemoteServiceAccessPoint() {
		RemoteServiceAccessPointImpl remoteServiceAccessPoint = new RemoteServiceAccessPointImpl();
		return remoteServiceAccessPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role createRole() {
		RoleImpl role = new RoleImpl();
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceAccessURI createServiceAccessURI() {
		ServiceAccessURIImpl serviceAccessURI = new ServiceAccessURIImpl();
		return serviceAccessURI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoftwareIdentity createSoftwareIdentity() {
		SoftwareIdentityImpl softwareIdentity = new SoftwareIdentityImpl();
		return softwareIdentity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatusDescription createStatusDescription() {
		StatusDescriptionImpl statusDescription = new StatusDescriptionImpl();
		return statusDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemSpecificCollection createSystemSpecificCollection() {
		SystemSpecificCollectionImpl systemSpecificCollection = new SystemSpecificCollectionImpl();
		return systemSpecificCollection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StorageExtent createStorageExtent() {
		StorageExtentImpl storageExtent = new StorageExtentImpl();
		return storageExtent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Memory createMemory() {
		MemoryImpl memory = new MemoryImpl();
		return memory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VolatileStorage createVolatileStorage() {
		VolatileStorageImpl volatileStorage = new VolatileStorageImpl();
		return volatileStorage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public USBDevice createUSBDevice() {
		USBDeviceImpl usbDevice = new USBDeviceImpl();
		return usbDevice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilterList createFilterList() {
		FilterListImpl filterList = new FilterListImpl();
		return filterList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilterEntry createFilterEntry() {
		FilterEntryImpl filterEntry = new FilterEntryImpl();
		return filterEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IPHeadersFilter createIPHeadersFilter() {
		IPHeadersFilterImpl ipHeadersFilter = new IPHeadersFilterImpl();
		return ipHeadersFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EthernetPort createEthernetPort() {
		EthernetPortImpl ethernetPort = new EthernetPortImpl();
		return ethernetPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalModule createLogicalModule() {
		LogicalModuleImpl logicalModule = new LogicalModuleImpl();
		return logicalModule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalPort createLogicalPort() {
		LogicalPortImpl logicalPort = new LogicalPortImpl();
		return logicalPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NetworkPort createNetworkPort() {
		NetworkPortImpl networkPort = new NetworkPortImpl();
		return networkPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public USBPort createUSBPort() {
		USBPortImpl usbPort = new USBPortImpl();
		return usbPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WirelessPort createWirelessPort() {
		WirelessPortImpl wirelessPort = new WirelessPortImpl();
		return wirelessPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WiFiPort createWiFiPort() {
		WiFiPortImpl wiFiPort = new WiFiPortImpl();
		return wiFiPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ADSLModem createADSLModem() {
		ADSLModemImpl adslModem = new ADSLModemImpl();
		return adslModem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CableModem createCableModem() {
		CableModemImpl cableModem = new CableModemImpl();
		return cableModem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DSLModem createDSLModem() {
		DSLModemImpl dslModem = new DSLModemImpl();
		return dslModem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISDNModem createISDNModem() {
		ISDNModemImpl isdnModem = new ISDNModemImpl();
		return isdnModem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HDSLModem createHDSLModem() {
		HDSLModemImpl hdslModem = new HDSLModemImpl();
		return hdslModem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SDSLModem createSDSLModem() {
		SDSLModemImpl sdslModem = new SDSLModemImpl();
		return sdslModem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VDSLModem createVDSLModem() {
		VDSLModemImpl vdslModem = new VDSLModemImpl();
		return vdslModem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public POTSModem createPOTSModem() {
		POTSModemImpl potsModem = new POTSModemImpl();
		return potsModem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UniModem createUniModem() {
		UniModemImpl uniModem = new UniModemImpl();
		return uniModem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReplacementSet createReplacementSet() {
		ReplacementSetImpl replacementSet = new ReplacementSetImpl();
		return replacementSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MemoryCapacity createMemoryCapacity() {
		MemoryCapacityImpl memoryCapacity = new MemoryCapacityImpl();
		return memoryCapacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LANEndpoint createLANEndpoint() {
		LANEndpointImpl lanEndpoint = new LANEndpointImpl();
		return lanEndpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OSPFProtocolEndpointBase createOSPFProtocolEndpointBase() {
		OSPFProtocolEndpointBaseImpl ospfProtocolEndpointBase = new OSPFProtocolEndpointBaseImpl();
		return ospfProtocolEndpointBase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OSPFVirtualInterface createOSPFVirtualInterface() {
		OSPFVirtualInterfaceImpl ospfVirtualInterface = new OSPFVirtualInterfaceImpl();
		return ospfVirtualInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OSPFProtocolEndpoint createOSPFProtocolEndpoint() {
		OSPFProtocolEndpointImpl ospfProtocolEndpoint = new OSPFProtocolEndpointImpl();
		return ospfProtocolEndpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BGPProtocolEndpoint createBGPProtocolEndpoint() {
		BGPProtocolEndpointImpl bgpProtocolEndpoint = new BGPProtocolEndpointImpl();
		return bgpProtocolEndpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IPProtocolEndpoint createIPProtocolEndpoint() {
		IPProtocolEndpointImpl ipProtocolEndpoint = new IPProtocolEndpointImpl();
		return ipProtocolEndpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IPXProtocolEndpoint createIPXProtocolEndpoint() {
		IPXProtocolEndpointImpl ipxProtocolEndpoint = new IPXProtocolEndpointImpl();
		return ipxProtocolEndpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MPLSProtocolEndpoint createMPLSProtocolEndpoint() {
		MPLSProtocolEndpointImpl mplsProtocolEndpoint = new MPLSProtocolEndpointImpl();
		return mplsProtocolEndpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwitchPort createSwitchPort() {
		SwitchPortImpl switchPort = new SwitchPortImpl();
		return switchPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TCPProtocolEndpoint createTCPProtocolEndpoint() {
		TCPProtocolEndpointImpl tcpProtocolEndpoint = new TCPProtocolEndpointImpl();
		return tcpProtocolEndpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UDPProtocolEndpoint createUDPProtocolEndpoint() {
		UDPProtocolEndpointImpl udpProtocolEndpoint = new UDPProtocolEndpointImpl();
		return udpProtocolEndpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CLPSettingData createCLPSettingData() {
		CLPSettingDataImpl clpSettingData = new CLPSettingDataImpl();
		return clpSettingData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TelnetSettingData createTelnetSettingData() {
		TelnetSettingDataImpl telnetSettingData = new TelnetSettingDataImpl();
		return telnetSettingData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SSHSettingData createSSHSettingData() {
		SSHSettingDataImpl sshSettingData = new SSHSettingDataImpl();
		return sshSettingData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DHCPCapabilities createDHCPCapabilities() {
		DHCPCapabilitiesImpl dhcpCapabilities = new DHCPCapabilitiesImpl();
		return dhcpCapabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DHCPProtocolEndpoint createDHCPProtocolEndpoint() {
		DHCPProtocolEndpointImpl dhcpProtocolEndpoint = new DHCPProtocolEndpointImpl();
		return dhcpProtocolEndpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TelnetProtocolEndpoint createTelnetProtocolEndpoint() {
		TelnetProtocolEndpointImpl telnetProtocolEndpoint = new TelnetProtocolEndpointImpl();
		return telnetProtocolEndpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DNSProtocolEndpoint createDNSProtocolEndpoint() {
		DNSProtocolEndpointImpl dnsProtocolEndpoint = new DNSProtocolEndpointImpl();
		return dnsProtocolEndpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DNSSettingData createDNSSettingData() {
		DNSSettingDataImpl dnsSettingData = new DNSSettingDataImpl();
		return dnsSettingData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IPAssignmentSettingData createIPAssignmentSettingData() {
		IPAssignmentSettingDataImpl ipAssignmentSettingData = new IPAssignmentSettingDataImpl();
		return ipAssignmentSettingData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WirelessLANEndpoint createWirelessLANEndpoint() {
		WirelessLANEndpointImpl wirelessLANEndpoint = new WirelessLANEndpointImpl();
		return wirelessLANEndpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WiFiEndPoint createWiFiEndPoint() {
		WiFiEndPointImpl wiFiEndPoint = new WiFiEndPointImpl();
		return wiFiEndPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WiFiEndpointSettings createWiFiEndpointSettings() {
		WiFiEndpointSettingsImpl wiFiEndpointSettings = new WiFiEndpointSettingsImpl();
		return wiFiEndpointSettings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProtocolService createProtocolService() {
		ProtocolServiceImpl protocolService = new ProtocolServiceImpl();
		return protocolService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditioningService createConditioningService() {
		ConditioningServiceImpl conditioningService = new ConditioningServiceImpl();
		return conditioningService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QoSService createQoSService() {
		QoSServiceImpl qoSService = new QoSServiceImpl();
		return qoSService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrecedenceService createPrecedenceService() {
		PrecedenceServiceImpl precedenceService = new PrecedenceServiceImpl();
		return precedenceService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiffServService createDiffServService() {
		DiffServServiceImpl diffServService = new DiffServServiceImpl();
		return diffServService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EFService createEFService() {
		EFServiceImpl efService = new EFServiceImpl();
		return efService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AFService createAFService() {
		AFServiceImpl afService = new AFServiceImpl();
		return afService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hdr8021PService createHdr8021PService() {
		Hdr8021PServiceImpl hdr8021PService = new Hdr8021PServiceImpl();
		return hdr8021PService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DropThresholdCalculationService createDropThresholdCalculationService() {
		DropThresholdCalculationServiceImpl dropThresholdCalculationService = new DropThresholdCalculationServiceImpl();
		return dropThresholdCalculationService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlowService createFlowService() {
		FlowServiceImpl flowService = new FlowServiceImpl();
		return flowService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NextHopIPRoute createNextHopIPRoute() {
		NextHopIPRouteImpl nextHopIPRoute = new NextHopIPRouteImpl();
		return nextHopIPRoute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdministrativeDistance createAdministrativeDistance() {
		AdministrativeDistanceImpl administrativeDistance = new AdministrativeDistanceImpl();
		return administrativeDistance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NextHopRouting createNextHopRouting() {
		NextHopRoutingImpl nextHopRouting = new NextHopRoutingImpl();
		return nextHopRouting;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoutingPolicy createRoutingPolicy() {
		RoutingPolicyImpl routingPolicy = new RoutingPolicyImpl();
		return routingPolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForwardingService createForwardingService() {
		ForwardingServiceImpl forwardingService = new ForwardingServiceImpl();
		return forwardingService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoutingProtocolDomain createRoutingProtocolDomain() {
		RoutingProtocolDomainImpl routingProtocolDomain = new RoutingProtocolDomainImpl();
		return routingProtocolDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NATService createNATService() {
		NATServiceImpl natService = new NATServiceImpl();
		return natService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NATStaticSettings createNATStaticSettings() {
		NATStaticSettingsImpl natStaticSettings = new NATStaticSettingsImpl();
		return natStaticSettings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NATListBasedSettings createNATListBasedSettings() {
		NATListBasedSettingsImpl natListBasedSettings = new NATListBasedSettingsImpl();
		return natListBasedSettings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SNMPCommunityStrings createSNMPCommunityStrings() {
		SNMPCommunityStringsImpl snmpCommunityStrings = new SNMPCommunityStringsImpl();
		return snmpCommunityStrings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SNMPService createSNMPService() {
		SNMPServiceImpl snmpService = new SNMPServiceImpl();
		return snmpService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SNMPTrapTarget createSNMPTrapTarget() {
		SNMPTrapTargetImpl snmpTrapTarget = new SNMPTrapTargetImpl();
		return snmpTrapTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumDedicated createEnumDedicatedFromString(EDataType eDataType, String initialValue) {
		EnumDedicated result = EnumDedicated.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEnumDedicatedToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumSoftwareElementState createEnumSoftwareElementStateFromString(EDataType eDataType, String initialValue) {
		EnumSoftwareElementState result = EnumSoftwareElementState.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEnumSoftwareElementStateToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumAddressType createEnumAddressTypeFromString(EDataType eDataType, String initialValue) {
		EnumAddressType result = EnumAddressType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEnumAddressTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumAccessContext createEnumAccessContextFromString(EDataType eDataType, String initialValue) {
		EnumAccessContext result = EnumAccessContext.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEnumAccessContextToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumChangeableType createEnumChangeableTypeFromString(EDataType eDataType, String initialValue) {
		EnumChangeableType result = EnumChangeableType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEnumChangeableTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumClassifications createEnumClassificationsFromString(EDataType eDataType, String initialValue) {
		EnumClassifications result = EnumClassifications.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEnumClassificationsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumHealthState createEnumHealthStateFromString(EDataType eDataType, String initialValue) {
		EnumHealthState result = EnumHealthState.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEnumHealthStateToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumEnabledDefault createEnumEnabledDefaultFromString(EDataType eDataType, String initialValue) {
		EnumEnabledDefault result = EnumEnabledDefault.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEnumEnabledDefaultToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumEnabledState createEnumEnabledStateFromString(EDataType eDataType, String initialValue) {
		EnumEnabledState result = EnumEnabledState.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEnumEnabledStateToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumElementSoftwareStatus createEnumElementSoftwareStatusFromString(EDataType eDataType, String initialValue) {
		EnumElementSoftwareStatus result = EnumElementSoftwareStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEnumElementSoftwareStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumExtendedResourceType createEnumExtendedResourceTypeFromString(EDataType eDataType, String initialValue) {
		EnumExtendedResourceType result = EnumExtendedResourceType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEnumExtendedResourceTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumInfoFormat createEnumInfoFormatFromString(EDataType eDataType, String initialValue) {
		EnumInfoFormat result = EnumInfoFormat.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEnumInfoFormatToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumIsCurrent createEnumIsCurrentFromString(EDataType eDataType, String initialValue) {
		EnumIsCurrent result = EnumIsCurrent.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEnumIsCurrentToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumIsDefault createEnumIsDefaultFromString(EDataType eDataType, String initialValue) {
		EnumIsDefault result = EnumIsDefault.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEnumIsDefaultToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumIsMaximum createEnumIsMaximumFromString(EDataType eDataType, String initialValue) {
		EnumIsMaximum result = EnumIsMaximum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEnumIsMaximumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumIsMinimum createEnumIsMinimumFromString(EDataType eDataType, String initialValue) {
		EnumIsMinimum result = EnumIsMinimum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEnumIsMinimumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumIsNext createEnumIsNextFromString(EDataType eDataType, String initialValue) {
		EnumIsNext result = EnumIsNext.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEnumIsNextToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumIsPending createEnumIsPendingFromString(EDataType eDataType, String initialValue) {
		EnumIsPending result = EnumIsPending.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEnumIsPendingToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumNameFormat createEnumNameFormatFromString(EDataType eDataType, String initialValue) {
		EnumNameFormat result = EnumNameFormat.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEnumNameFormatToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumOperationalStatus createEnumOperationalStatusFromString(EDataType eDataType, String initialValue) {
		EnumOperationalStatus result = EnumOperationalStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEnumOperationalStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumProtocolIFType createEnumProtocolIFTypeFromString(EDataType eDataType, String initialValue) {
		EnumProtocolIFType result = EnumProtocolIFType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEnumProtocolIFTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumRequestedState createEnumRequestedStateFromString(EDataType eDataType, String initialValue) {
		EnumRequestedState result = EnumRequestedState.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEnumRequestedStateToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumTargetOSTypes createEnumTargetOSTypesFromString(EDataType eDataType, String initialValue) {
		EnumTargetOSTypes result = EnumTargetOSTypes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEnumTargetOSTypesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumUpgradeCondition createEnumUpgradeConditionFromString(EDataType eDataType, String initialValue) {
		EnumUpgradeCondition result = EnumUpgradeCondition.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEnumUpgradeConditionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumDirection createEnumDirectionFromString(EDataType eDataType, String initialValue) {
		EnumDirection result = EnumDirection.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEnumDirectionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumMatchConditionType createEnumMatchConditionTypeFromString(EDataType eDataType, String initialValue) {
		EnumMatchConditionType result = EnumMatchConditionType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEnumMatchConditionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumAction createEnumActionFromString(EDataType eDataType, String initialValue) {
		EnumAction result = EnumAction.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEnumActionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumTrafficType createEnumTrafficTypeFromString(EDataType eDataType, String initialValue) {
		EnumTrafficType result = EnumTrafficType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEnumTrafficTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumIPVersion createEnumIPVersionFromString(EDataType eDataType, String initialValue) {
		EnumIPVersion result = EnumIPVersion.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEnumIPVersionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumAvailability createEnumAvailabilityFromString(EDataType eDataType, String initialValue) {
		EnumAvailability result = EnumAvailability.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEnumAvailabilityToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumLinkTechnology createEnumLinkTechnologyFromString(EDataType eDataType, String initialValue) {
		EnumLinkTechnology result = EnumLinkTechnology.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEnumLinkTechnologyToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumLogicalModuleType createEnumLogicalModuleTypeFromString(EDataType eDataType, String initialValue) {
		EnumLogicalModuleType result = EnumLogicalModuleType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEnumLogicalModuleTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumPortType createEnumPortTypeFromString(EDataType eDataType, String initialValue) {
		EnumPortType result = EnumPortType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEnumPortTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumStatusInfo createEnumStatusInfoFromString(EDataType eDataType, String initialValue) {
		EnumStatusInfo result = EnumStatusInfo.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEnumStatusInfoToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumLineState createEnumLineStateFromString(EDataType eDataType, String initialValue) {
		EnumLineState result = EnumLineState.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEnumLineStateToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumModulationScheme createEnumModulationSchemeFromString(EDataType eDataType, String initialValue) {
		EnumModulationScheme result = EnumModulationScheme.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEnumModulationSchemeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumAddressOrigin createEnumAddressOriginFromString(EDataType eDataType, String initialValue) {
		EnumAddressOrigin result = EnumAddressOrigin.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEnumAddressOriginToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumTerminalMode createEnumTerminalModeFromString(EDataType eDataType, String initialValue) {
		EnumTerminalMode result = EnumTerminalMode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEnumTerminalModeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumCharacterDisplayMode createEnumCharacterDisplayModeFromString(EDataType eDataType, String initialValue) {
		EnumCharacterDisplayMode result = EnumCharacterDisplayMode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEnumCharacterDisplayModeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumDHCPOptions createEnumDHCPOptionsFromString(EDataType eDataType, String initialValue) {
		EnumDHCPOptions result = EnumDHCPOptions.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEnumDHCPOptionsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumAuthenticationMethod createEnumAuthenticationMethodFromString(EDataType eDataType, String initialValue) {
		EnumAuthenticationMethod result = EnumAuthenticationMethod.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEnumAuthenticationMethodToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumEncryptionMethod createEnumEncryptionMethodFromString(EDataType eDataType, String initialValue) {
		EnumEncryptionMethod result = EnumEncryptionMethod.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEnumEncryptionMethodToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumBSSType createEnumBSSTypeFromString(EDataType eDataType, String initialValue) {
		EnumBSSType result = EnumBSSType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEnumBSSTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumProtocolServiceReturnCode createEnumProtocolServiceReturnCodeFromString(EDataType eDataType, String initialValue) {
		EnumProtocolServiceReturnCode result = EnumProtocolServiceReturnCode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEnumProtocolServiceReturnCodeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumProtocolType createEnumProtocolTypeFromString(EDataType eDataType, String initialValue) {
		EnumProtocolType result = EnumProtocolType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEnumProtocolTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumAddressExamined createEnumAddressExaminedFromString(EDataType eDataType, String initialValue) {
		EnumAddressExamined result = EnumAddressExamined.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEnumAddressExaminedToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CimPackage getCimPackage() {
		return (CimPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CimPackage getPackage() {
		return CimPackage.eINSTANCE;
	}

} //CimFactoryImpl
