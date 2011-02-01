/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.tid.cim;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see es.tid.cim.CimPackage
 * @generated
 */
public interface CimFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CimFactory eINSTANCE = es.tid.cim.impl.CimFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>CIM Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Model</em>'.
	 * @generated
	 */
	CIM_Model createCIM_Model();

	/**
	 * Returns a new object of class '<em>BGP Cluster</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BGP Cluster</em>'.
	 * @generated
	 */
	BGPCluster createBGPCluster();

	/**
	 * Returns a new object of class '<em>BGP Peer Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BGP Peer Group</em>'.
	 * @generated
	 */
	BGPPeerGroup createBGPPeerGroup();

	/**
	 * Returns a new object of class '<em>BGP Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BGP Service</em>'.
	 * @generated
	 */
	BGPService createBGPService();

	/**
	 * Returns a new object of class '<em>Autonomous System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Autonomous System</em>'.
	 * @generated
	 */
	AutonomousSystem createAutonomousSystem();

	/**
	 * Returns a new object of class '<em>Network</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Network</em>'.
	 * @generated
	 */
	Network createNetwork();

	/**
	 * Returns a new object of class '<em>Computer System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Computer System</em>'.
	 * @generated
	 */
	ComputerSystem createComputerSystem();

	/**
	 * Returns a new object of class '<em>Directory</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Directory</em>'.
	 * @generated
	 */
	Directory createDirectory();

	/**
	 * Returns a new object of class '<em>Logical File</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Logical File</em>'.
	 * @generated
	 */
	LogicalFile createLogicalFile();

	/**
	 * Returns a new object of class '<em>Unitary Computer System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unitary Computer System</em>'.
	 * @generated
	 */
	UnitaryComputerSystem createUnitaryComputerSystem();

	/**
	 * Returns a new object of class '<em>Architecture Check</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Architecture Check</em>'.
	 * @generated
	 */
	ArchitectureCheck createArchitectureCheck();

	/**
	 * Returns a new object of class '<em>Application System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Application System</em>'.
	 * @generated
	 */
	ApplicationSystem createApplicationSystem();

	/**
	 * Returns a new object of class '<em>BIOS Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BIOS Element</em>'.
	 * @generated
	 */
	BIOSElement createBIOSElement();

	/**
	 * Returns a new object of class '<em>BIOS Feature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BIOS Feature</em>'.
	 * @generated
	 */
	BIOSFeature createBIOSFeature();

	/**
	 * Returns a new object of class '<em>Create Directory Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Create Directory Action</em>'.
	 * @generated
	 */
	CreateDirectoryAction createCreateDirectoryAction();

	/**
	 * Returns a new object of class '<em>Copy File Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Copy File Action</em>'.
	 * @generated
	 */
	CopyFileAction createCopyFileAction();

	/**
	 * Returns a new object of class '<em>Directory Specification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Directory Specification</em>'.
	 * @generated
	 */
	DirectorySpecification createDirectorySpecification();

	/**
	 * Returns a new object of class '<em>Disk Space Check</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Disk Space Check</em>'.
	 * @generated
	 */
	DiskSpaceCheck createDiskSpaceCheck();

	/**
	 * Returns a new object of class '<em>Execute Program</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Execute Program</em>'.
	 * @generated
	 */
	ExecuteProgram createExecuteProgram();

	/**
	 * Returns a new object of class '<em>File Specification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>File Specification</em>'.
	 * @generated
	 */
	FileSpecification createFileSpecification();

	/**
	 * Returns a new object of class '<em>Installed Product</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Installed Product</em>'.
	 * @generated
	 */
	InstalledProduct createInstalledProduct();

	/**
	 * Returns a new object of class '<em>Memory Check</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Memory Check</em>'.
	 * @generated
	 */
	MemoryCheck createMemoryCheck();

	/**
	 * Returns a new object of class '<em>Modify Setting Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Modify Setting Action</em>'.
	 * @generated
	 */
	ModifySettingAction createModifySettingAction();

	/**
	 * Returns a new object of class '<em>Operating System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Operating System</em>'.
	 * @generated
	 */
	OperatingSystem createOperatingSystem();

	/**
	 * Returns a new object of class '<em>OS Version Check</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>OS Version Check</em>'.
	 * @generated
	 */
	OSVersionCheck createOSVersionCheck();

	/**
	 * Returns a new object of class '<em>Reboot Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reboot Action</em>'.
	 * @generated
	 */
	RebootAction createRebootAction();

	/**
	 * Returns a new object of class '<em>Remove File Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Remove File Action</em>'.
	 * @generated
	 */
	RemoveFileAction createRemoveFileAction();

	/**
	 * Returns a new object of class '<em>Remove Directory Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Remove Directory Action</em>'.
	 * @generated
	 */
	RemoveDirectoryAction createRemoveDirectoryAction();

	/**
	 * Returns a new object of class '<em>Setting Check</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Setting Check</em>'.
	 * @generated
	 */
	SettingCheck createSettingCheck();

	/**
	 * Returns a new object of class '<em>Software Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Software Element</em>'.
	 * @generated
	 */
	SoftwareElement createSoftwareElement();

	/**
	 * Returns a new object of class '<em>Software Element Version Check</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Software Element Version Check</em>'.
	 * @generated
	 */
	SoftwareElementVersionCheck createSoftwareElementVersionCheck();

	/**
	 * Returns a new object of class '<em>Software Feature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Software Feature</em>'.
	 * @generated
	 */
	SoftwareFeature createSoftwareFeature();

	/**
	 * Returns a new object of class '<em>Swap Space Check</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Swap Space Check</em>'.
	 * @generated
	 */
	SwapSpaceCheck createSwapSpaceCheck();

	/**
	 * Returns a new object of class '<em>Version Compatibility Check</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Version Compatibility Check</em>'.
	 * @generated
	 */
	VersionCompatibilityCheck createVersionCompatibilityCheck();

	/**
	 * Returns a new object of class '<em>Buffer Pool</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Buffer Pool</em>'.
	 * @generated
	 */
	BufferPool createBufferPool();

	/**
	 * Returns a new object of class '<em>Connectivity Memberhip Setting Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Connectivity Memberhip Setting Data</em>'.
	 * @generated
	 */
	ConnectivityMemberhipSettingData createConnectivityMemberhipSettingData();

	/**
	 * Returns a new object of class '<em>Connectivity Collection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Connectivity Collection</em>'.
	 * @generated
	 */
	ConnectivityCollection createConnectivityCollection();

	/**
	 * Returns a new object of class '<em>Named Address Collection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Named Address Collection</em>'.
	 * @generated
	 */
	NamedAddressCollection createNamedAddressCollection();

	/**
	 * Returns a new object of class '<em>Range Of IP Addresses</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Range Of IP Addresses</em>'.
	 * @generated
	 */
	RangeOfIPAddresses createRangeOfIPAddresses();

	/**
	 * Returns a new object of class '<em>LAN Connectivity Segment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>LAN Connectivity Segment</em>'.
	 * @generated
	 */
	LANConnectivitySegment createLANConnectivitySegment();

	/**
	 * Returns a new object of class '<em>IP Connectivity Subnet</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>IP Connectivity Subnet</em>'.
	 * @generated
	 */
	IPConnectivitySubnet createIPConnectivitySubnet();

	/**
	 * Returns a new object of class '<em>IPX Connectivity Network</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>IPX Connectivity Network</em>'.
	 * @generated
	 */
	IPXConnectivityNetwork createIPXConnectivityNetwork();

	/**
	 * Returns a new object of class '<em>IP Address Range</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>IP Address Range</em>'.
	 * @generated
	 */
	IPAddressRange createIPAddressRange();

	/**
	 * Returns a new object of class '<em>Logical Network</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Logical Network</em>'.
	 * @generated
	 */
	LogicalNetwork createLogicalNetwork();

	/**
	 * Returns a new object of class '<em>IPX Network</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>IPX Network</em>'.
	 * @generated
	 */
	IPXNetwork createIPXNetwork();

	/**
	 * Returns a new object of class '<em>LAN Segment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>LAN Segment</em>'.
	 * @generated
	 */
	LANSegment createLANSegment();

	/**
	 * Returns a new object of class '<em>IP Subnet</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>IP Subnet</em>'.
	 * @generated
	 */
	IPSubnet createIPSubnet();

	/**
	 * Returns a new object of class '<em>Admin Domain</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Admin Domain</em>'.
	 * @generated
	 */
	AdminDomain createAdminDomain();

	/**
	 * Returns a new object of class '<em>Element Setting Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Element Setting Data</em>'.
	 * @generated
	 */
	ElementSettingData createElementSettingData();

	/**
	 * Returns a new object of class '<em>Element Software Identity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Element Software Identity</em>'.
	 * @generated
	 */
	ElementSoftwareIdentity createElementSoftwareIdentity();

	/**
	 * Returns a new object of class '<em>Enabled Logical Element Capabilities</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enabled Logical Element Capabilities</em>'.
	 * @generated
	 */
	EnabledLogicalElementCapabilities createEnabledLogicalElementCapabilities();

	/**
	 * Returns a new object of class '<em>Generic Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Generic Service</em>'.
	 * @generated
	 */
	GenericService createGenericService();

	/**
	 * Returns a new object of class '<em>Power Management Capabilities</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Power Management Capabilities</em>'.
	 * @generated
	 */
	PowerManagementCapabilities createPowerManagementCapabilities();

	/**
	 * Returns a new object of class '<em>Product</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Product</em>'.
	 * @generated
	 */
	Product createProduct();

	/**
	 * Returns a new object of class '<em>Protocol Endpoint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Protocol Endpoint</em>'.
	 * @generated
	 */
	ProtocolEndpoint createProtocolEndpoint();

	/**
	 * Returns a new object of class '<em>Remote Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Remote Port</em>'.
	 * @generated
	 */
	RemotePort createRemotePort();

	/**
	 * Returns a new object of class '<em>Remote Service Access Point</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Remote Service Access Point</em>'.
	 * @generated
	 */
	RemoteServiceAccessPoint createRemoteServiceAccessPoint();

	/**
	 * Returns a new object of class '<em>Role</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Role</em>'.
	 * @generated
	 */
	Role createRole();

	/**
	 * Returns a new object of class '<em>Service Access URI</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Access URI</em>'.
	 * @generated
	 */
	ServiceAccessURI createServiceAccessURI();

	/**
	 * Returns a new object of class '<em>Software Identity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Software Identity</em>'.
	 * @generated
	 */
	SoftwareIdentity createSoftwareIdentity();

	/**
	 * Returns a new object of class '<em>Status Description</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Status Description</em>'.
	 * @generated
	 */
	StatusDescription createStatusDescription();

	/**
	 * Returns a new object of class '<em>System Specific Collection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>System Specific Collection</em>'.
	 * @generated
	 */
	SystemSpecificCollection createSystemSpecificCollection();

	/**
	 * Returns a new object of class '<em>Storage Extent</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Storage Extent</em>'.
	 * @generated
	 */
	StorageExtent createStorageExtent();

	/**
	 * Returns a new object of class '<em>Memory</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Memory</em>'.
	 * @generated
	 */
	Memory createMemory();

	/**
	 * Returns a new object of class '<em>Volatile Storage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Volatile Storage</em>'.
	 * @generated
	 */
	VolatileStorage createVolatileStorage();

	/**
	 * Returns a new object of class '<em>USB Device</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>USB Device</em>'.
	 * @generated
	 */
	USBDevice createUSBDevice();

	/**
	 * Returns a new object of class '<em>Filter List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Filter List</em>'.
	 * @generated
	 */
	FilterList createFilterList();

	/**
	 * Returns a new object of class '<em>Filter Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Filter Entry</em>'.
	 * @generated
	 */
	FilterEntry createFilterEntry();

	/**
	 * Returns a new object of class '<em>IP Headers Filter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>IP Headers Filter</em>'.
	 * @generated
	 */
	IPHeadersFilter createIPHeadersFilter();

	/**
	 * Returns a new object of class '<em>Ethernet Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ethernet Port</em>'.
	 * @generated
	 */
	EthernetPort createEthernetPort();

	/**
	 * Returns a new object of class '<em>Logical Module</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Logical Module</em>'.
	 * @generated
	 */
	LogicalModule createLogicalModule();

	/**
	 * Returns a new object of class '<em>Logical Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Logical Port</em>'.
	 * @generated
	 */
	LogicalPort createLogicalPort();

	/**
	 * Returns a new object of class '<em>Network Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Network Port</em>'.
	 * @generated
	 */
	NetworkPort createNetworkPort();

	/**
	 * Returns a new object of class '<em>USB Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>USB Port</em>'.
	 * @generated
	 */
	USBPort createUSBPort();

	/**
	 * Returns a new object of class '<em>Wireless Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Wireless Port</em>'.
	 * @generated
	 */
	WirelessPort createWirelessPort();

	/**
	 * Returns a new object of class '<em>Wi Fi Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Wi Fi Port</em>'.
	 * @generated
	 */
	WiFiPort createWiFiPort();

	/**
	 * Returns a new object of class '<em>ADSL Modem</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ADSL Modem</em>'.
	 * @generated
	 */
	ADSLModem createADSLModem();

	/**
	 * Returns a new object of class '<em>Cable Modem</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cable Modem</em>'.
	 * @generated
	 */
	CableModem createCableModem();

	/**
	 * Returns a new object of class '<em>DSL Modem</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DSL Modem</em>'.
	 * @generated
	 */
	DSLModem createDSLModem();

	/**
	 * Returns a new object of class '<em>ISDN Modem</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ISDN Modem</em>'.
	 * @generated
	 */
	ISDNModem createISDNModem();

	/**
	 * Returns a new object of class '<em>HDSL Modem</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>HDSL Modem</em>'.
	 * @generated
	 */
	HDSLModem createHDSLModem();

	/**
	 * Returns a new object of class '<em>SDSL Modem</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SDSL Modem</em>'.
	 * @generated
	 */
	SDSLModem createSDSLModem();

	/**
	 * Returns a new object of class '<em>VDSL Modem</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VDSL Modem</em>'.
	 * @generated
	 */
	VDSLModem createVDSLModem();

	/**
	 * Returns a new object of class '<em>POTS Modem</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>POTS Modem</em>'.
	 * @generated
	 */
	POTSModem createPOTSModem();

	/**
	 * Returns a new object of class '<em>Uni Modem</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Uni Modem</em>'.
	 * @generated
	 */
	UniModem createUniModem();

	/**
	 * Returns a new object of class '<em>Replacement Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Replacement Set</em>'.
	 * @generated
	 */
	ReplacementSet createReplacementSet();

	/**
	 * Returns a new object of class '<em>Memory Capacity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Memory Capacity</em>'.
	 * @generated
	 */
	MemoryCapacity createMemoryCapacity();

	/**
	 * Returns a new object of class '<em>LAN Endpoint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>LAN Endpoint</em>'.
	 * @generated
	 */
	LANEndpoint createLANEndpoint();

	/**
	 * Returns a new object of class '<em>OSPF Protocol Endpoint Base</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>OSPF Protocol Endpoint Base</em>'.
	 * @generated
	 */
	OSPFProtocolEndpointBase createOSPFProtocolEndpointBase();

	/**
	 * Returns a new object of class '<em>OSPF Virtual Interface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>OSPF Virtual Interface</em>'.
	 * @generated
	 */
	OSPFVirtualInterface createOSPFVirtualInterface();

	/**
	 * Returns a new object of class '<em>OSPF Protocol Endpoint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>OSPF Protocol Endpoint</em>'.
	 * @generated
	 */
	OSPFProtocolEndpoint createOSPFProtocolEndpoint();

	/**
	 * Returns a new object of class '<em>BGP Protocol Endpoint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BGP Protocol Endpoint</em>'.
	 * @generated
	 */
	BGPProtocolEndpoint createBGPProtocolEndpoint();

	/**
	 * Returns a new object of class '<em>IP Protocol Endpoint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>IP Protocol Endpoint</em>'.
	 * @generated
	 */
	IPProtocolEndpoint createIPProtocolEndpoint();

	/**
	 * Returns a new object of class '<em>IPX Protocol Endpoint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>IPX Protocol Endpoint</em>'.
	 * @generated
	 */
	IPXProtocolEndpoint createIPXProtocolEndpoint();

	/**
	 * Returns a new object of class '<em>MPLS Protocol Endpoint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>MPLS Protocol Endpoint</em>'.
	 * @generated
	 */
	MPLSProtocolEndpoint createMPLSProtocolEndpoint();

	/**
	 * Returns a new object of class '<em>Switch Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Switch Port</em>'.
	 * @generated
	 */
	SwitchPort createSwitchPort();

	/**
	 * Returns a new object of class '<em>TCP Protocol Endpoint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TCP Protocol Endpoint</em>'.
	 * @generated
	 */
	TCPProtocolEndpoint createTCPProtocolEndpoint();

	/**
	 * Returns a new object of class '<em>UDP Protocol Endpoint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>UDP Protocol Endpoint</em>'.
	 * @generated
	 */
	UDPProtocolEndpoint createUDPProtocolEndpoint();

	/**
	 * Returns a new object of class '<em>CLP Setting Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CLP Setting Data</em>'.
	 * @generated
	 */
	CLPSettingData createCLPSettingData();

	/**
	 * Returns a new object of class '<em>Telnet Setting Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Telnet Setting Data</em>'.
	 * @generated
	 */
	TelnetSettingData createTelnetSettingData();

	/**
	 * Returns a new object of class '<em>SSH Setting Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SSH Setting Data</em>'.
	 * @generated
	 */
	SSHSettingData createSSHSettingData();

	/**
	 * Returns a new object of class '<em>DHCP Capabilities</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DHCP Capabilities</em>'.
	 * @generated
	 */
	DHCPCapabilities createDHCPCapabilities();

	/**
	 * Returns a new object of class '<em>DHCP Protocol Endpoint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DHCP Protocol Endpoint</em>'.
	 * @generated
	 */
	DHCPProtocolEndpoint createDHCPProtocolEndpoint();

	/**
	 * Returns a new object of class '<em>Telnet Protocol Endpoint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Telnet Protocol Endpoint</em>'.
	 * @generated
	 */
	TelnetProtocolEndpoint createTelnetProtocolEndpoint();

	/**
	 * Returns a new object of class '<em>DNS Protocol Endpoint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DNS Protocol Endpoint</em>'.
	 * @generated
	 */
	DNSProtocolEndpoint createDNSProtocolEndpoint();

	/**
	 * Returns a new object of class '<em>DNS Setting Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DNS Setting Data</em>'.
	 * @generated
	 */
	DNSSettingData createDNSSettingData();

	/**
	 * Returns a new object of class '<em>IP Assignment Setting Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>IP Assignment Setting Data</em>'.
	 * @generated
	 */
	IPAssignmentSettingData createIPAssignmentSettingData();

	/**
	 * Returns a new object of class '<em>Wireless LAN Endpoint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Wireless LAN Endpoint</em>'.
	 * @generated
	 */
	WirelessLANEndpoint createWirelessLANEndpoint();

	/**
	 * Returns a new object of class '<em>Wi Fi End Point</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Wi Fi End Point</em>'.
	 * @generated
	 */
	WiFiEndPoint createWiFiEndPoint();

	/**
	 * Returns a new object of class '<em>Wi Fi Endpoint Settings</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Wi Fi Endpoint Settings</em>'.
	 * @generated
	 */
	WiFiEndpointSettings createWiFiEndpointSettings();

	/**
	 * Returns a new object of class '<em>Protocol Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Protocol Service</em>'.
	 * @generated
	 */
	ProtocolService createProtocolService();

	/**
	 * Returns a new object of class '<em>Conditioning Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Conditioning Service</em>'.
	 * @generated
	 */
	ConditioningService createConditioningService();

	/**
	 * Returns a new object of class '<em>Qo SService</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Qo SService</em>'.
	 * @generated
	 */
	QoSService createQoSService();

	/**
	 * Returns a new object of class '<em>Precedence Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Precedence Service</em>'.
	 * @generated
	 */
	PrecedenceService createPrecedenceService();

	/**
	 * Returns a new object of class '<em>Diff Serv Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diff Serv Service</em>'.
	 * @generated
	 */
	DiffServService createDiffServService();

	/**
	 * Returns a new object of class '<em>EF Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EF Service</em>'.
	 * @generated
	 */
	EFService createEFService();

	/**
	 * Returns a new object of class '<em>AF Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>AF Service</em>'.
	 * @generated
	 */
	AFService createAFService();

	/**
	 * Returns a new object of class '<em>Hdr8021 PService</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hdr8021 PService</em>'.
	 * @generated
	 */
	Hdr8021PService createHdr8021PService();

	/**
	 * Returns a new object of class '<em>Drop Threshold Calculation Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Drop Threshold Calculation Service</em>'.
	 * @generated
	 */
	DropThresholdCalculationService createDropThresholdCalculationService();

	/**
	 * Returns a new object of class '<em>Flow Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Flow Service</em>'.
	 * @generated
	 */
	FlowService createFlowService();

	/**
	 * Returns a new object of class '<em>Next Hop IP Route</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Next Hop IP Route</em>'.
	 * @generated
	 */
	NextHopIPRoute createNextHopIPRoute();

	/**
	 * Returns a new object of class '<em>Administrative Distance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Administrative Distance</em>'.
	 * @generated
	 */
	AdministrativeDistance createAdministrativeDistance();

	/**
	 * Returns a new object of class '<em>Next Hop Routing</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Next Hop Routing</em>'.
	 * @generated
	 */
	NextHopRouting createNextHopRouting();

	/**
	 * Returns a new object of class '<em>Routing Policy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Routing Policy</em>'.
	 * @generated
	 */
	RoutingPolicy createRoutingPolicy();

	/**
	 * Returns a new object of class '<em>Forwarding Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Forwarding Service</em>'.
	 * @generated
	 */
	ForwardingService createForwardingService();

	/**
	 * Returns a new object of class '<em>Routing Protocol Domain</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Routing Protocol Domain</em>'.
	 * @generated
	 */
	RoutingProtocolDomain createRoutingProtocolDomain();

	/**
	 * Returns a new object of class '<em>NAT Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>NAT Service</em>'.
	 * @generated
	 */
	NATService createNATService();

	/**
	 * Returns a new object of class '<em>NAT Static Settings</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>NAT Static Settings</em>'.
	 * @generated
	 */
	NATStaticSettings createNATStaticSettings();

	/**
	 * Returns a new object of class '<em>NAT List Based Settings</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>NAT List Based Settings</em>'.
	 * @generated
	 */
	NATListBasedSettings createNATListBasedSettings();

	/**
	 * Returns a new object of class '<em>SNMP Community Strings</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SNMP Community Strings</em>'.
	 * @generated
	 */
	SNMPCommunityStrings createSNMPCommunityStrings();

	/**
	 * Returns a new object of class '<em>SNMP Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SNMP Service</em>'.
	 * @generated
	 */
	SNMPService createSNMPService();

	/**
	 * Returns a new object of class '<em>SNMP Trap Target</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SNMP Trap Target</em>'.
	 * @generated
	 */
	SNMPTrapTarget createSNMPTrapTarget();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CimPackage getCimPackage();

} //CimFactory
