/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.tid.cim.util;


import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import es.tid.cim.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see es.tid.cim.CimPackage
 * @generated
 */
public class CimSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CimPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CimSwitch() {
		if (modelPackage == null) {
			modelPackage = CimPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public T doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List<EClass> eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch(eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case CimPackage.CIM_MODEL: {
				CIM_Model ciM_Model = (CIM_Model)theEObject;
				T result = caseCIM_Model(ciM_Model);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CimPackage.BGP_CLUSTER: {
				BGPCluster bgpCluster = (BGPCluster)theEObject;
				T result = caseBGPCluster(bgpCluster);
				if (result == null) result = caseCollectionOfMSEs(bgpCluster);
				if (result == null) result = caseCollection(bgpCluster);
				if (result == null) result = caseManagedElement(bgpCluster);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CimPackage.BGP_PEER_GROUP: {
				BGPPeerGroup bgpPeerGroup = (BGPPeerGroup)theEObject;
				T result = caseBGPPeerGroup(bgpPeerGroup);
				if (result == null) result = caseCollectionOfMSEs(bgpPeerGroup);
				if (result == null) result = caseCollection(bgpPeerGroup);
				if (result == null) result = caseManagedElement(bgpPeerGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CimPackage.BGP_SERVICE: {
				BGPService bgpService = (BGPService)theEObject;
				T result = caseBGPService(bgpService);
				if (result == null) result = caseRouteCalculationService(bgpService);
				if (result == null) result = caseNetworkService(bgpService);
				if (result == null) result = caseService(bgpService);
				if (result == null) result = caseEnabledLogicalElement(bgpService);
				if (result == null) result = caseLogicalElement(bgpService);
				if (result == null) result = caseManagedSystemElement(bgpService);
				if (result == null) result = caseManagedElement(bgpService);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CimPackage.AUTONOMOUS_SYSTEM: {
				AutonomousSystem autonomousSystem = (AutonomousSystem)theEObject;
				T result = caseAutonomousSystem(autonomousSystem);
				if (result == null) result = caseAdminDomain(autonomousSystem);
				if (result == null) result = caseSystem(autonomousSystem);
				if (result == null) result = caseEnabledLogicalElement(autonomousSystem);
				if (result == null) result = caseLogicalElement(autonomousSystem);
				if (result == null) result = caseManagedSystemElement(autonomousSystem);
				if (result == null) result = caseManagedElement(autonomousSystem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CimPackage.NETWORK: {
				Network network = (Network)theEObject;
				T result = caseNetwork(network);
				if (result == null) result = caseAdminDomain(network);
				if (result == null) result = caseSystem(network);
				if (result == null) result = caseEnabledLogicalElement(network);
				if (result == null) result = caseLogicalElement(network);
				if (result == null) result = caseManagedSystemElement(network);
				if (result == null) result = caseManagedElement(network);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CimPackage.COMPUTER_SYSTEM: {
				ComputerSystem computerSystem = (ComputerSystem)theEObject;
				T result = caseComputerSystem(computerSystem);
				if (result == null) result = caseSystem(computerSystem);
				if (result == null) result = caseEnabledLogicalElement(computerSystem);
				if (result == null) result = caseLogicalElement(computerSystem);
				if (result == null) result = caseManagedSystemElement(computerSystem);
				if (result == null) result = caseManagedElement(computerSystem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CimPackage.DIRECTORY: {
				Directory directory = (Directory)theEObject;
				T result = caseDirectory(directory);
				if (result == null) result = caseLogicalElement(directory);
				if (result == null) result = caseManagedSystemElement(directory);
				if (result == null) result = caseManagedElement(directory);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CimPackage.LOGICAL_FILE: {
				LogicalFile logicalFile = (LogicalFile)theEObject;
				T result = caseLogicalFile(logicalFile);
				if (result == null) result = caseLogicalElement(logicalFile);
				if (result == null) result = caseManagedSystemElement(logicalFile);
				if (result == null) result = caseManagedElement(logicalFile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CimPackage.UNITARY_COMPUTER_SYSTEM: {
				UnitaryComputerSystem unitaryComputerSystem = (UnitaryComputerSystem)theEObject;
				T result = caseUnitaryComputerSystem(unitaryComputerSystem);
				if (result == null) result = caseComputerSystem(unitaryComputerSystem);
				if (result == null) result = caseSystem(unitaryComputerSystem);
				if (result == null) result = caseEnabledLogicalElement(unitaryComputerSystem);
				if (result == null) result = caseLogicalElement(unitaryComputerSystem);
				if (result == null) result = caseManagedSystemElement(unitaryComputerSystem);
				if (result == null) result = caseManagedElement(unitaryComputerSystem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CimPackage.ACTION: {
				Action action = (Action)theEObject;
				T result = caseAction(action);
				if (result == null) result = caseManagedElement(action);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CimPackage.ARCHITECTURE_CHECK: {
				ArchitectureCheck architectureCheck = (ArchitectureCheck)theEObject;
				T result = caseArchitectureCheck(architectureCheck);
				if (result == null) result = caseCheck(architectureCheck);
				if (result == null) result = caseManagedElement(architectureCheck);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CimPackage.APPLICATION_SYSTEM: {
				ApplicationSystem applicationSystem = (ApplicationSystem)theEObject;
				T result = caseApplicationSystem(applicationSystem);
				if (result == null) result = caseSystem(applicationSystem);
				if (result == null) result = caseEnabledLogicalElement(applicationSystem);
				if (result == null) result = caseLogicalElement(applicationSystem);
				if (result == null) result = caseManagedSystemElement(applicationSystem);
				if (result == null) result = caseManagedElement(applicationSystem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CimPackage.BIOS_ELEMENT: {
				BIOSElement biosElement = (BIOSElement)theEObject;
				T result = caseBIOSElement(biosElement);
				if (result == null) result = caseSoftwareElement(biosElement);
				if (result == null) result = caseLogicalElement(biosElement);
				if (result == null) result = caseManagedSystemElement(biosElement);
				if (result == null) result = caseManagedElement(biosElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CimPackage.BIOS_FEATURE: {
				BIOSFeature biosFeature = (BIOSFeature)theEObject;
				T result = caseBIOSFeature(biosFeature);
				if (result == null) result = caseSoftwareFeature(biosFeature);
				if (result == null) result = caseLogicalElement(biosFeature);
				if (result == null) result = caseManagedSystemElement(biosFeature);
				if (result == null) result = caseManagedElement(biosFeature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CimPackage.CHECK: {
				Check check = (Check)theEObject;
				T result = caseCheck(check);
				if (result == null) result = caseManagedElement(check);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CimPackage.CREATE_DIRECTORY_ACTION: {
				CreateDirectoryAction createDirectoryAction = (CreateDirectoryAction)theEObject;
				T result = caseCreateDirectoryAction(createDirectoryAction);
				if (result == null) result = caseDirectoryAction(createDirectoryAction);
				if (result == null) result = caseAction(createDirectoryAction);
				if (result == null) result = caseManagedElement(createDirectoryAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CimPackage.COPY_FILE_ACTION: {
				CopyFileAction copyFileAction = (CopyFileAction)theEObject;
				T result = caseCopyFileAction(copyFileAction);
				if (result == null) result = caseFileAction(copyFileAction);
				if (result == null) result = caseAction(copyFileAction);
				if (result == null) result = caseManagedElement(copyFileAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CimPackage.DIRECTORY_ACTION: {
				DirectoryAction directoryAction = (DirectoryAction)theEObject;
				T result = caseDirectoryAction(directoryAction);
				if (result == null) result = caseAction(directoryAction);
				if (result == null) result = caseManagedElement(directoryAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CimPackage.DIRECTORY_SPECIFICATION: {
				DirectorySpecification directorySpecification = (DirectorySpecification)theEObject;
				T result = caseDirectorySpecification(directorySpecification);
				if (result == null) result = caseCheck(directorySpecification);
				if (result == null) result = caseManagedElement(directorySpecification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CimPackage.DISK_SPACE_CHECK: {
				DiskSpaceCheck diskSpaceCheck = (DiskSpaceCheck)theEObject;
				T result = caseDiskSpaceCheck(diskSpaceCheck);
				if (result == null) result = caseCheck(diskSpaceCheck);
				if (result == null) result = caseManagedElement(diskSpaceCheck);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CimPackage.EXECUTE_PROGRAM: {
				ExecuteProgram executeProgram = (ExecuteProgram)theEObject;
				T result = caseExecuteProgram(executeProgram);
				if (result == null) result = caseAction(executeProgram);
				if (result == null) result = caseManagedElement(executeProgram);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CimPackage.FILE_ACTION: {
				FileAction fileAction = (FileAction)theEObject;
				T result = caseFileAction(fileAction);
				if (result == null) result = caseAction(fileAction);
				if (result == null) result = caseManagedElement(fileAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CimPackage.FILE_SPECIFICATION: {
				FileSpecification fileSpecification = (FileSpecification)theEObject;
				T result = caseFileSpecification(fileSpecification);
				if (result == null) result = caseCheck(fileSpecification);
				if (result == null) result = caseManagedElement(fileSpecification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CimPackage.INSTALLED_PRODUCT: {
				InstalledProduct installedProduct = (InstalledProduct)theEObject;
				T result = caseInstalledProduct(installedProduct);
				if (result == null) result = caseCollection(installedProduct);
				if (result == null) result = caseManagedElement(installedProduct);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CimPackage.MEMORY_CHECK: {
				MemoryCheck memoryCheck = (MemoryCheck)theEObject;
				T result = caseMemoryCheck(memoryCheck);
				if (result == null) result = caseCheck(memoryCheck);
				if (result == null) result = caseManagedElement(memoryCheck);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CimPackage.MODIFY_SETTING_ACTION: {
				ModifySettingAction modifySettingAction = (ModifySettingAction)theEObject;
				T result = caseModifySettingAction(modifySettingAction);
				if (result == null) result = caseAction(modifySettingAction);
				if (result == null) result = caseManagedElement(modifySettingAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CimPackage.OPERATING_SYSTEM: {
				OperatingSystem operatingSystem = (OperatingSystem)theEObject;
				T result = caseOperatingSystem(operatingSystem);
				if (result == null) result = caseEnabledLogicalElement(operatingSystem);
				if (result == null) result = caseLogicalElement(operatingSystem);
				if (result == null) result = caseManagedSystemElement(operatingSystem);
				if (result == null) result = caseManagedElement(operatingSystem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CimPackage.OS_VERSION_CHECK: {
				OSVersionCheck osVersionCheck = (OSVersionCheck)theEObject;
				T result = caseOSVersionCheck(osVersionCheck);
				if (result == null) result = caseCheck(osVersionCheck);
				if (result == null) result = caseManagedElement(osVersionCheck);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CimPackage.REBOOT_ACTION: {
				RebootAction rebootAction = (RebootAction)theEObject;
				T result = caseRebootAction(rebootAction);
				if (result == null) result = caseAction(rebootAction);
				if (result == null) result = caseManagedElement(rebootAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CimPackage.REMOVE_FILE_ACTION: {
				RemoveFileAction removeFileAction = (RemoveFileAction)theEObject;
				T result = caseRemoveFileAction(removeFileAction);
				if (result == null) result = caseFileAction(removeFileAction);
				if (result == null) result = caseAction(removeFileAction);
				if (result == null) result = caseManagedElement(removeFileAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CimPackage.REMOVE_DIRECTORY_ACTION: {
				RemoveDirectoryAction removeDirectoryAction = (RemoveDirectoryAction)theEObject;
				T result = caseRemoveDirectoryAction(removeDirectoryAction);
				if (result == null) result = caseDirectoryAction(removeDirectoryAction);
				if (result == null) result = caseAction(removeDirectoryAction);
				if (result == null) result = caseManagedElement(removeDirectoryAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CimPackage.SETTING_CHECK: {
				SettingCheck settingCheck = (SettingCheck)theEObject;
				T result = caseSettingCheck(settingCheck);
				if (result == null) result = caseCheck(settingCheck);
				if (result == null) result = caseManagedElement(settingCheck);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CimPackage.SOFTWARE_ELEMENT: {
				SoftwareElement softwareElement = (SoftwareElement)theEObject;
				T result = caseSoftwareElement(softwareElement);
				if (result == null) result = caseLogicalElement(softwareElement);
				if (result == null) result = caseManagedSystemElement(softwareElement);
				if (result == null) result = caseManagedElement(softwareElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CimPackage.SOFTWARE_ELEMENT_VERSION_CHECK: {
				SoftwareElementVersionCheck softwareElementVersionCheck = (SoftwareElementVersionCheck)theEObject;
				T result = caseSoftwareElementVersionCheck(softwareElementVersionCheck);
				if (result == null) result = caseCheck(softwareElementVersionCheck);
				if (result == null) result = caseManagedElement(softwareElementVersionCheck);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CimPackage.SOFTWARE_FEATURE: {
				SoftwareFeature softwareFeature = (SoftwareFeature)theEObject;
				T result = caseSoftwareFeature(softwareFeature);
				if (result == null) result = caseLogicalElement(softwareFeature);
				if (result == null) result = caseManagedSystemElement(softwareFeature);
				if (result == null) result = caseManagedElement(softwareFeature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CimPackage.SWAP_SPACE_CHECK: {
				SwapSpaceCheck swapSpaceCheck = (SwapSpaceCheck)theEObject;
				T result = caseSwapSpaceCheck(swapSpaceCheck);
				if (result == null) result = caseCheck(swapSpaceCheck);
				if (result == null) result = caseManagedElement(swapSpaceCheck);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CimPackage.VERSION_COMPATIBILITY_CHECK: {
				VersionCompatibilityCheck versionCompatibilityCheck = (VersionCompatibilityCheck)theEObject;
				T result = caseVersionCompatibilityCheck(versionCompatibilityCheck);
				if (result == null) result = caseCheck(versionCompatibilityCheck);
				if (result == null) result = caseManagedElement(versionCompatibilityCheck);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CimPackage.BUFFER_POOL: {
				BufferPool bufferPool = (BufferPool)theEObject;
				T result = caseBufferPool(bufferPool);
				if (result == null) result = caseCollectionOfMSEs(bufferPool);
				if (result == null) result = caseCollection(bufferPool);
				if (result == null) result = caseManagedElement(bufferPool);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CimPackage.CONNECTIVITY_MEMBERHIP_SETTING_DATA: {
				ConnectivityMemberhipSettingData connectivityMemberhipSettingData = (ConnectivityMemberhipSettingData)theEObject;
				T result = caseConnectivityMemberhipSettingData(connectivityMemberhipSettingData);
				if (result == null) result = caseSettingData(connectivityMemberhipSettingData);
				if (result == null) result = caseManagedElement(connectivityMemberhipSettingData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CimPackage.CONNECTIVITY_COLLECTION: {
				ConnectivityCollection connectivityCollection = (ConnectivityCollection)theEObject;
				T result = caseConnectivityCollection(connectivityCollection);
				if (result == null) result = caseSystemSpecificCollection(connectivityCollection);
				if (result == null) result = caseCollection(connectivityCollection);
				if (result == null) result = caseManagedElement(connectivityCollection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CimPackage.NAMED_ADDRESS_COLLECTION: {
				NamedAddressCollection namedAddressCollection = (NamedAddressCollection)theEObject;
				T result = caseNamedAddressCollection(namedAddressCollection);
				if (result == null) result = caseSystemSpecificCollection(namedAddressCollection);
				if (result == null) result = caseCollection(namedAddressCollection);
				if (result == null) result = caseManagedElement(namedAddressCollection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CimPackage.RANGE_OF_IP_ADDRESSES: {
				RangeOfIPAddresses rangeOfIPAddresses = (RangeOfIPAddresses)theEObject;
				T result = caseRangeOfIPAddresses(rangeOfIPAddresses);
				if (result == null) result = caseSystemSpecificCollection(rangeOfIPAddresses);
				if (result == null) result = caseCollection(rangeOfIPAddresses);
				if (result == null) result = caseManagedElement(rangeOfIPAddresses);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CimPackage.LAN_CONNECTIVITY_SEGMENT: {
				LANConnectivitySegment lanConnectivitySegment = (LANConnectivitySegment)theEObject;
				T result = caseLANConnectivitySegment(lanConnectivitySegment);
				if (result == null) result = caseConnectivityCollection(lanConnectivitySegment);
				if (result == null) result = caseSystemSpecificCollection(lanConnectivitySegment);
				if (result == null) result = caseCollection(lanConnectivitySegment);
				if (result == null) result = caseManagedElement(lanConnectivitySegment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CimPackage.IP_CONNECTIVITY_SUBNET: {
				IPConnectivitySubnet ipConnectivitySubnet = (IPConnectivitySubnet)theEObject;
				T result = caseIPConnectivitySubnet(ipConnectivitySubnet);
				if (result == null) result = caseConnectivityCollection(ipConnectivitySubnet);
				if (result == null) result = caseSystemSpecificCollection(ipConnectivitySubnet);
				if (result == null) result = caseCollection(ipConnectivitySubnet);
				if (result == null) result = caseManagedElement(ipConnectivitySubnet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CimPackage.IPX_CONNECTIVITY_NETWORK: {
				IPXConnectivityNetwork ipxConnectivityNetwork = (IPXConnectivityNetwork)theEObject;
				T result = caseIPXConnectivityNetwork(ipxConnectivityNetwork);
				if (result == null) result = caseConnectivityCollection(ipxConnectivityNetwork);
				if (result == null) result = caseSystemSpecificCollection(ipxConnectivityNetwork);
				if (result == null) result = caseCollection(ipxConnectivityNetwork);
				if (result == null) result = caseManagedElement(ipxConnectivityNetwork);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CimPackage.IP_ADDRESS_RANGE: {
				IPAddressRange ipAddressRange = (IPAddressRange)theEObject;
				T result = caseIPAddressRange(ipAddressRange);
				if (result == null) result = caseCollectionOfMSEs(ipAddressRange);
				if (result == null) result = caseCollection(ipAddressRange);
				if (result == null) result = caseManagedElement(ipAddressRange);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CimPackage.LOGICAL_NETWORK: {
				LogicalNetwork logicalNetwork = (LogicalNetwork)theEObject;
				T result = caseLogicalNetwork(logicalNetwork);
				if (result == null) result = caseCollectionOfMSEs(logicalNetwork);
				if (result == null) result = caseCollection(logicalNetwork);
				if (result == null) result = caseManagedElement(logicalNetwork);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CimPackage.IPX_NETWORK: {
				IPXNetwork ipxNetwork = (IPXNetwork)theEObject;
				T result = caseIPXNetwork(ipxNetwork);
				if (result == null) result = caseLogicalNetwork(ipxNetwork);
				if (result == null) result = caseCollectionOfMSEs(ipxNetwork);
				if (result == null) result = caseCollection(ipxNetwork);
				if (result == null) result = caseManagedElement(ipxNetwork);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CimPackage.LAN_SEGMENT: {
				LANSegment lanSegment = (LANSegment)theEObject;
				T result = caseLANSegment(lanSegment);
				if (result == null) result = caseLogicalNetwork(lanSegment);
				if (result == null) result = caseCollectionOfMSEs(lanSegment);
				if (result == null) result = caseCollection(lanSegment);
				if (result == null) result = caseManagedElement(lanSegment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CimPackage.IP_SUBNET: {
				IPSubnet ipSubnet = (IPSubnet)theEObject;
				T result = caseIPSubnet(ipSubnet);
				if (result == null) result = caseLogicalNetwork(ipSubnet);
				if (result == null) result = caseCollectionOfMSEs(ipSubnet);
				if (result == null) result = caseCollection(ipSubnet);
				if (result == null) result = caseManagedElement(ipSubnet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CimPackage.ADMIN_DOMAIN: {
				AdminDomain adminDomain = (AdminDomain)theEObject;
				T result = caseAdminDomain(adminDomain);
				if (result == null) result = caseSystem(adminDomain);
				if (result == null) result = caseEnabledLogicalElement(adminDomain);
				if (result == null) result = caseLogicalElement(adminDomain);
				if (result == null) result = caseManagedSystemElement(adminDomain);
				if (result == null) result = caseManagedElement(adminDomain);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CimPackage.CAPABILITIES: {
				Capabilities capabilities = (Capabilities)theEObject;
				T result = caseCapabilities(capabilities);
				if (result == null) result = caseManagedElement(capabilities);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CimPackage.COLLECTION: {
				Collection collection = (Collection)theEObject;
				T result = caseCollection(collection);
				if (result == null) result = caseManagedElement(collection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CimPackage.COLLECTION_OF_MS_ES: {
				CollectionOfMSEs collectionOfMSEs = (CollectionOfMSEs)theEObject;
				T result = caseCollectionOfMSEs(collectionOfMSEs);
				if (result == null) result = caseCollection(collectionOfMSEs);
				if (result == null) result = caseManagedElement(collectionOfMSEs);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CimPackage.ELEMENT_SETTING_DATA: {
				ElementSettingData elementSettingData = (ElementSettingData)theEObject;
				T result = caseElementSettingData(elementSettingData);
				if (result == null) result = caseManagedElement(elementSettingData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CimPackage.ELEMENT_SOFTWARE_IDENTITY: {
				ElementSoftwareIdentity elementSoftwareIdentity = (ElementSoftwareIdentity)theEObject;
				T result = caseElementSoftwareIdentity(elementSoftwareIdentity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CimPackage.ENABLED_LOGICAL_ELEMENT: {
				EnabledLogicalElement enabledLogicalElement = (EnabledLogicalElement)theEObject;
				T result = caseEnabledLogicalElement(enabledLogicalElement);
				if (result == null) result = caseLogicalElement(enabledLogicalElement);
				if (result == null) result = caseManagedSystemElement(enabledLogicalElement);
				if (result == null) result = caseManagedElement(enabledLogicalElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CimPackage.ENABLED_LOGICAL_ELEMENT_CAPABILITIES: {
				EnabledLogicalElementCapabilities enabledLogicalElementCapabilities = (EnabledLogicalElementCapabilities)theEObject;
				T result = caseEnabledLogicalElementCapabilities(enabledLogicalElementCapabilities);
				if (result == null) result = caseCapabilities(enabledLogicalElementCapabilities);
				if (result == null) result = caseManagedElement(enabledLogicalElementCapabilities);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CimPackage.GENERIC_SERVICE: {
				GenericService genericService = (GenericService)theEObject;
				T result = caseGenericService(genericService);
				if (result == null) result = caseService(genericService);
				if (result == null) result = caseEnabledLogicalElement(genericService);
				if (result == null) result = caseLogicalElement(genericService);
				if (result == null) result = caseManagedSystemElement(genericService);
				if (result == null) result = caseManagedElement(genericService);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CimPackage.LOGICAL_DEVICE: {
				LogicalDevice logicalDevice = (LogicalDevice)theEObject;
				T result = caseLogicalDevice(logicalDevice);
				if (result == null) result = caseEnabledLogicalElement(logicalDevice);
				if (result == null) result = caseLogicalElement(logicalDevice);
				if (result == null) result = caseManagedSystemElement(logicalDevice);
				if (result == null) result = caseManagedElement(logicalDevice);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CimPackage.LOGICAL_ELEMENT: {
				LogicalElement logicalElement = (LogicalElement)theEObject;
				T result = caseLogicalElement(logicalElement);
				if (result == null) result = caseManagedSystemElement(logicalElement);
				if (result == null) result = caseManagedElement(logicalElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CimPackage.MANAGED_ELEMENT: {
				ManagedElement managedElement = (ManagedElement)theEObject;
				T result = caseManagedElement(managedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CimPackage.MANAGED_SYSTEM_ELEMENT: {
				ManagedSystemElement managedSystemElement = (ManagedSystemElement)theEObject;
				T result = caseManagedSystemElement(managedSystemElement);
				if (result == null) result = caseManagedElement(managedSystemElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CimPackage.PHYSICAL_ELEMENT: {
				PhysicalElement physicalElement = (PhysicalElement)theEObject;
				T result = casePhysicalElement(physicalElement);
				if (result == null) result = caseManagedSystemElement(physicalElement);
				if (result == null) result = caseManagedElement(physicalElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CimPackage.POWER_MANAGEMENT_CAPABILITIES: {
				PowerManagementCapabilities powerManagementCapabilities = (PowerManagementCapabilities)theEObject;
				T result = casePowerManagementCapabilities(powerManagementCapabilities);
				if (result == null) result = caseCapabilities(powerManagementCapabilities);
				if (result == null) result = caseManagedElement(powerManagementCapabilities);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CimPackage.PRODUCT: {
				Product product = (Product)theEObject;
				T result = caseProduct(product);
				if (result == null) result = caseManagedElement(product);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CimPackage.PROTOCOL_ENDPOINT: {
				ProtocolEndpoint protocolEndpoint = (ProtocolEndpoint)theEObject;
				T result = caseProtocolEndpoint(protocolEndpoint);
				if (result == null) result = caseServiceAccessPoint(protocolEndpoint);
				if (result == null) result = caseEnabledLogicalElement(protocolEndpoint);
				if (result == null) result = caseLogicalElement(protocolEndpoint);
				if (result == null) result = caseManagedSystemElement(protocolEndpoint);
				if (result == null) result = caseManagedElement(protocolEndpoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CimPackage.REMOTE_PORT: {
				RemotePort remotePort = (RemotePort)theEObject;
				T result = caseRemotePort(remotePort);
				if (result == null) result = caseRemoteServiceAccessPoint(remotePort);
				if (result == null) result = caseServiceAccessPoint(remotePort);
				if (result == null) result = caseEnabledLogicalElement(remotePort);
				if (result == null) result = caseLogicalElement(remotePort);
				if (result == null) result = caseManagedSystemElement(remotePort);
				if (result == null) result = caseManagedElement(remotePort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CimPackage.REMOTE_SERVICE_ACCESS_POINT: {
				RemoteServiceAccessPoint remoteServiceAccessPoint = (RemoteServiceAccessPoint)theEObject;
				T result = caseRemoteServiceAccessPoint(remoteServiceAccessPoint);
				if (result == null) result = caseServiceAccessPoint(remoteServiceAccessPoint);
				if (result == null) result = caseEnabledLogicalElement(remoteServiceAccessPoint);
				if (result == null) result = caseLogicalElement(remoteServiceAccessPoint);
				if (result == null) result = caseManagedSystemElement(remoteServiceAccessPoint);
				if (result == null) result = caseManagedElement(remoteServiceAccessPoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CimPackage.ROLE: {
				Role role = (Role)theEObject;
				T result = caseRole(role);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CimPackage.SCOPED_SETTING_DATA: {
				ScopedSettingData scopedSettingData = (ScopedSettingData)theEObject;
				T result = caseScopedSettingData(scopedSettingData);
				if (result == null) result = caseSettingData(scopedSettingData);
				if (result == null) result = caseManagedElement(scopedSettingData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CimPackage.SERVICE: {
				Service service = (Service)theEObject;
				T result = caseService(service);
				if (result == null) result = caseEnabledLogicalElement(service);
				if (result == null) result = caseLogicalElement(service);
				if (result == null) result = caseManagedSystemElement(service);
				if (result == null) result = caseManagedElement(service);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CimPackage.SERVICE_ACCESS_URI: {
				ServiceAccessURI serviceAccessURI = (ServiceAccessURI)theEObject;
				T result = caseServiceAccessURI(serviceAccessURI);
				if (result == null) result = caseServiceAccessPoint(serviceAccessURI);
				if (result == null) result = caseEnabledLogicalElement(serviceAccessURI);
				if (result == null) result = caseLogicalElement(serviceAccessURI);
				if (result == null) result = caseManagedSystemElement(serviceAccessURI);
				if (result == null) result = caseManagedElement(serviceAccessURI);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CimPackage.SERVICE_ACCESS_POINT: {
				ServiceAccessPoint serviceAccessPoint = (ServiceAccessPoint)theEObject;
				T result = caseServiceAccessPoint(serviceAccessPoint);
				if (result == null) result = caseEnabledLogicalElement(serviceAccessPoint);
				if (result == null) result = caseLogicalElement(serviceAccessPoint);
				if (result == null) result = caseManagedSystemElement(serviceAccessPoint);
				if (result == null) result = caseManagedElement(serviceAccessPoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CimPackage.SETTING_DATA: {
				SettingData settingData = (SettingData)theEObject;
				T result = caseSettingData(settingData);
				if (result == null) result = caseManagedElement(settingData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CimPackage.SOFTWARE_IDENTITY: {
				SoftwareIdentity softwareIdentity = (SoftwareIdentity)theEObject;
				T result = caseSoftwareIdentity(softwareIdentity);
				if (result == null) result = caseLogicalElement(softwareIdentity);
				if (result == null) result = caseManagedSystemElement(softwareIdentity);
				if (result == null) result = caseManagedElement(softwareIdentity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CimPackage.STATUS_DESCRIPTION: {
				StatusDescription statusDescription = (StatusDescription)theEObject;
				T result = caseStatusDescription(statusDescription);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CimPackage.SYSTEM: {
				es.tid.cim.System system = (es.tid.cim.System)theEObject;
				T result = caseSystem(system);
				if (result == null) result = caseEnabledLogicalElement(system);
				if (result == null) result = caseLogicalElement(system);
				if (result == null) result = caseManagedSystemElement(system);
				if (result == null) result = caseManagedElement(system);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CimPackage.SYSTEM_SPECIFIC_COLLECTION: {
				SystemSpecificCollection systemSpecificCollection = (SystemSpecificCollection)theEObject;
				T result = caseSystemSpecificCollection(systemSpecificCollection);
				if (result == null) result = caseCollection(systemSpecificCollection);
				if (result == null) result = caseManagedElement(systemSpecificCollection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CimPackage.STORAGE_EXTENT: {
				StorageExtent storageExtent = (StorageExtent)theEObject;
				T result = caseStorageExtent(storageExtent);
				if (result == null) result = caseLogicalDevice(storageExtent);
				if (result == null) result = caseEnabledLogicalElement(storageExtent);
				if (result == null) result = caseLogicalElement(storageExtent);
				if (result == null) result = caseManagedSystemElement(storageExtent);
				if (result == null) result = caseManagedElement(storageExtent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CimPackage.MEMORY: {
				Memory memory = (Memory)theEObject;
				T result = caseMemory(memory);
				if (result == null) result = caseStorageExtent(memory);
				if (result == null) result = caseLogicalDevice(memory);
				if (result == null) result = caseEnabledLogicalElement(memory);
				if (result == null) result = caseLogicalElement(memory);
				if (result == null) result = caseManagedSystemElement(memory);
				if (result == null) result = caseManagedElement(memory);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CimPackage.VOLATILE_STORAGE: {
				VolatileStorage volatileStorage = (VolatileStorage)theEObject;
				T result = caseVolatileStorage(volatileStorage);
				if (result == null) result = caseMemory(volatileStorage);
				if (result == null) result = caseStorageExtent(volatileStorage);
				if (result == null) result = caseLogicalDevice(volatileStorage);
				if (result == null) result = caseEnabledLogicalElement(volatileStorage);
				if (result == null) result = caseLogicalElement(volatileStorage);
				if (result == null) result = caseManagedSystemElement(volatileStorage);
				if (result == null) result = caseManagedElement(volatileStorage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CimPackage.USB_DEVICE: {
				USBDevice usbDevice = (USBDevice)theEObject;
				T result = caseUSBDevice(usbDevice);
				if (result == null) result = caseLogicalDevice(usbDevice);
				if (result == null) result = caseEnabledLogicalElement(usbDevice);
				if (result == null) result = caseLogicalElement(usbDevice);
				if (result == null) result = caseManagedSystemElement(usbDevice);
				if (result == null) result = caseManagedElement(usbDevice);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CimPackage.FILTER_LIST: {
				FilterList filterList = (FilterList)theEObject;
				T result = caseFilterList(filterList);
				if (result == null) result = caseLogicalElement(filterList);
				if (result == null) result = caseManagedSystemElement(filterList);
				if (result == null) result = caseManagedElement(filterList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CimPackage.FILTER_ENTRY_BASE: {
				FilterEntryBase filterEntryBase = (FilterEntryBase)theEObject;
				T result = caseFilterEntryBase(filterEntryBase);
				if (result == null) result = caseLogicalElement(filterEntryBase);
				if (result == null) result = caseManagedSystemElement(filterEntryBase);
				if (result == null) result = caseManagedElement(filterEntryBase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CimPackage.FILTER_ENTRY: {
				FilterEntry filterEntry = (FilterEntry)theEObject;
				T result = caseFilterEntry(filterEntry);
				if (result == null) result = caseFilterEntryBase(filterEntry);
				if (result == null) result = caseLogicalElement(filterEntry);
				if (result == null) result = caseManagedSystemElement(filterEntry);
				if (result == null) result = caseManagedElement(filterEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CimPackage.IP_HEADERS_FILTER: {
				IPHeadersFilter ipHeadersFilter = (IPHeadersFilter)theEObject;
				T result = caseIPHeadersFilter(ipHeadersFilter);
				if (result == null) result = caseFilterEntryBase(ipHeadersFilter);
				if (result == null) result = caseLogicalElement(ipHeadersFilter);
				if (result == null) result = caseManagedSystemElement(ipHeadersFilter);
				if (result == null) result = caseManagedElement(ipHeadersFilter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CimPackage.ETHERNET_PORT: {
				EthernetPort ethernetPort = (EthernetPort)theEObject;
				T result = caseEthernetPort(ethernetPort);
				if (result == null) result = caseNetworkPort(ethernetPort);
				if (result == null) result = caseLogicalPort(ethernetPort);
				if (result == null) result = caseLogicalDevice(ethernetPort);
				if (result == null) result = caseEnabledLogicalElement(ethernetPort);
				if (result == null) result = caseLogicalElement(ethernetPort);
				if (result == null) result = caseManagedSystemElement(ethernetPort);
				if (result == null) result = caseManagedElement(ethernetPort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CimPackage.LOGICAL_MODULE: {
				LogicalModule logicalModule = (LogicalModule)theEObject;
				T result = caseLogicalModule(logicalModule);
				if (result == null) result = caseLogicalDevice(logicalModule);
				if (result == null) result = caseEnabledLogicalElement(logicalModule);
				if (result == null) result = caseLogicalElement(logicalModule);
				if (result == null) result = caseManagedSystemElement(logicalModule);
				if (result == null) result = caseManagedElement(logicalModule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CimPackage.LOGICAL_PORT: {
				LogicalPort logicalPort = (LogicalPort)theEObject;
				T result = caseLogicalPort(logicalPort);
				if (result == null) result = caseLogicalDevice(logicalPort);
				if (result == null) result = caseEnabledLogicalElement(logicalPort);
				if (result == null) result = caseLogicalElement(logicalPort);
				if (result == null) result = caseManagedSystemElement(logicalPort);
				if (result == null) result = caseManagedElement(logicalPort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CimPackage.NETWORK_PORT: {
				NetworkPort networkPort = (NetworkPort)theEObject;
				T result = caseNetworkPort(networkPort);
				if (result == null) result = caseLogicalPort(networkPort);
				if (result == null) result = caseLogicalDevice(networkPort);
				if (result == null) result = caseEnabledLogicalElement(networkPort);
				if (result == null) result = caseLogicalElement(networkPort);
				if (result == null) result = caseManagedSystemElement(networkPort);
				if (result == null) result = caseManagedElement(networkPort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CimPackage.USB_PORT: {
				USBPort usbPort = (USBPort)theEObject;
				T result = caseUSBPort(usbPort);
				if (result == null) result = caseLogicalPort(usbPort);
				if (result == null) result = caseLogicalDevice(usbPort);
				if (result == null) result = caseEnabledLogicalElement(usbPort);
				if (result == null) result = caseLogicalElement(usbPort);
				if (result == null) result = caseManagedSystemElement(usbPort);
				if (result == null) result = caseManagedElement(usbPort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CimPackage.WIRELESS_PORT: {
				WirelessPort wirelessPort = (WirelessPort)theEObject;
				T result = caseWirelessPort(wirelessPort);
				if (result == null) result = caseNetworkPort(wirelessPort);
				if (result == null) result = caseLogicalPort(wirelessPort);
				if (result == null) result = caseLogicalDevice(wirelessPort);
				if (result == null) result = caseEnabledLogicalElement(wirelessPort);
				if (result == null) result = caseLogicalElement(wirelessPort);
				if (result == null) result = caseManagedSystemElement(wirelessPort);
				if (result == null) result = caseManagedElement(wirelessPort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CimPackage.WI_FI_PORT: {
				WiFiPort wiFiPort = (WiFiPort)theEObject;
				T result = caseWiFiPort(wiFiPort);
				if (result == null) result = caseNetworkPort(wiFiPort);
				if (result == null) result = caseLogicalPort(wiFiPort);
				if (result == null) result = caseLogicalDevice(wiFiPort);
				if (result == null) result = caseEnabledLogicalElement(wiFiPort);
				if (result == null) result = caseLogicalElement(wiFiPort);
				if (result == null) result = caseManagedSystemElement(wiFiPort);
				if (result == null) result = caseManagedElement(wiFiPort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CimPackage.ADSL_MODEM: {
				ADSLModem adslModem = (ADSLModem)theEObject;
				T result = caseADSLModem(adslModem);
				if (result == null) result = caseDSLModem(adslModem);
				if (result == null) result = caseConnectionBasedModem(adslModem);
				if (result == null) result = caseModem(adslModem);
				if (result == null) result = caseLogicalDevice(adslModem);
				if (result == null) result = caseEnabledLogicalElement(adslModem);
				if (result == null) result = caseLogicalElement(adslModem);
				if (result == null) result = caseManagedSystemElement(adslModem);
				if (result == null) result = caseManagedElement(adslModem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CimPackage.CABLE_MODEM: {
				CableModem cableModem = (CableModem)theEObject;
				T result = caseCableModem(cableModem);
				if (result == null) result = caseConnectionBasedModem(cableModem);
				if (result == null) result = caseModem(cableModem);
				if (result == null) result = caseLogicalDevice(cableModem);
				if (result == null) result = caseEnabledLogicalElement(cableModem);
				if (result == null) result = caseLogicalElement(cableModem);
				if (result == null) result = caseManagedSystemElement(cableModem);
				if (result == null) result = caseManagedElement(cableModem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CimPackage.CALL_BASED_MODEM: {
				CallBasedModem callBasedModem = (CallBasedModem)theEObject;
				T result = caseCallBasedModem(callBasedModem);
				if (result == null) result = caseModem(callBasedModem);
				if (result == null) result = caseLogicalDevice(callBasedModem);
				if (result == null) result = caseEnabledLogicalElement(callBasedModem);
				if (result == null) result = caseLogicalElement(callBasedModem);
				if (result == null) result = caseManagedSystemElement(callBasedModem);
				if (result == null) result = caseManagedElement(callBasedModem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CimPackage.CONNECTION_BASED_MODEM: {
				ConnectionBasedModem connectionBasedModem = (ConnectionBasedModem)theEObject;
				T result = caseConnectionBasedModem(connectionBasedModem);
				if (result == null) result = caseModem(connectionBasedModem);
				if (result == null) result = caseLogicalDevice(connectionBasedModem);
				if (result == null) result = caseEnabledLogicalElement(connectionBasedModem);
				if (result == null) result = caseLogicalElement(connectionBasedModem);
				if (result == null) result = caseManagedSystemElement(connectionBasedModem);
				if (result == null) result = caseManagedElement(connectionBasedModem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CimPackage.DSL_MODEM: {
				DSLModem dslModem = (DSLModem)theEObject;
				T result = caseDSLModem(dslModem);
				if (result == null) result = caseConnectionBasedModem(dslModem);
				if (result == null) result = caseModem(dslModem);
				if (result == null) result = caseLogicalDevice(dslModem);
				if (result == null) result = caseEnabledLogicalElement(dslModem);
				if (result == null) result = caseLogicalElement(dslModem);
				if (result == null) result = caseManagedSystemElement(dslModem);
				if (result == null) result = caseManagedElement(dslModem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CimPackage.ISDN_MODEM: {
				ISDNModem isdnModem = (ISDNModem)theEObject;
				T result = caseISDNModem(isdnModem);
				if (result == null) result = caseCallBasedModem(isdnModem);
				if (result == null) result = caseModem(isdnModem);
				if (result == null) result = caseLogicalDevice(isdnModem);
				if (result == null) result = caseEnabledLogicalElement(isdnModem);
				if (result == null) result = caseLogicalElement(isdnModem);
				if (result == null) result = caseManagedSystemElement(isdnModem);
				if (result == null) result = caseManagedElement(isdnModem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CimPackage.MODEM: {
				Modem modem = (Modem)theEObject;
				T result = caseModem(modem);
				if (result == null) result = caseLogicalDevice(modem);
				if (result == null) result = caseEnabledLogicalElement(modem);
				if (result == null) result = caseLogicalElement(modem);
				if (result == null) result = caseManagedSystemElement(modem);
				if (result == null) result = caseManagedElement(modem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CimPackage.HDSL_MODEM: {
				HDSLModem hdslModem = (HDSLModem)theEObject;
				T result = caseHDSLModem(hdslModem);
				if (result == null) result = caseDSLModem(hdslModem);
				if (result == null) result = caseConnectionBasedModem(hdslModem);
				if (result == null) result = caseModem(hdslModem);
				if (result == null) result = caseLogicalDevice(hdslModem);
				if (result == null) result = caseEnabledLogicalElement(hdslModem);
				if (result == null) result = caseLogicalElement(hdslModem);
				if (result == null) result = caseManagedSystemElement(hdslModem);
				if (result == null) result = caseManagedElement(hdslModem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CimPackage.SDSL_MODEM: {
				SDSLModem sdslModem = (SDSLModem)theEObject;
				T result = caseSDSLModem(sdslModem);
				if (result == null) result = caseDSLModem(sdslModem);
				if (result == null) result = caseConnectionBasedModem(sdslModem);
				if (result == null) result = caseModem(sdslModem);
				if (result == null) result = caseLogicalDevice(sdslModem);
				if (result == null) result = caseEnabledLogicalElement(sdslModem);
				if (result == null) result = caseLogicalElement(sdslModem);
				if (result == null) result = caseManagedSystemElement(sdslModem);
				if (result == null) result = caseManagedElement(sdslModem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CimPackage.VDSL_MODEM: {
				VDSLModem vdslModem = (VDSLModem)theEObject;
				T result = caseVDSLModem(vdslModem);
				if (result == null) result = caseDSLModem(vdslModem);
				if (result == null) result = caseConnectionBasedModem(vdslModem);
				if (result == null) result = caseModem(vdslModem);
				if (result == null) result = caseLogicalDevice(vdslModem);
				if (result == null) result = caseEnabledLogicalElement(vdslModem);
				if (result == null) result = caseLogicalElement(vdslModem);
				if (result == null) result = caseManagedSystemElement(vdslModem);
				if (result == null) result = caseManagedElement(vdslModem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CimPackage.POTS_MODEM: {
				POTSModem potsModem = (POTSModem)theEObject;
				T result = casePOTSModem(potsModem);
				if (result == null) result = caseCallBasedModem(potsModem);
				if (result == null) result = caseModem(potsModem);
				if (result == null) result = caseLogicalDevice(potsModem);
				if (result == null) result = caseEnabledLogicalElement(potsModem);
				if (result == null) result = caseLogicalElement(potsModem);
				if (result == null) result = caseManagedSystemElement(potsModem);
				if (result == null) result = caseManagedElement(potsModem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CimPackage.UNI_MODEM: {
				UniModem uniModem = (UniModem)theEObject;
				T result = caseUniModem(uniModem);
				if (result == null) result = casePOTSModem(uniModem);
				if (result == null) result = caseCallBasedModem(uniModem);
				if (result == null) result = caseModem(uniModem);
				if (result == null) result = caseLogicalDevice(uniModem);
				if (result == null) result = caseEnabledLogicalElement(uniModem);
				if (result == null) result = caseLogicalElement(uniModem);
				if (result == null) result = caseManagedSystemElement(uniModem);
				if (result == null) result = caseManagedElement(uniModem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CimPackage.REPLACEMENT_SET: {
				ReplacementSet replacementSet = (ReplacementSet)theEObject;
				T result = caseReplacementSet(replacementSet);
				if (result == null) result = caseCollection(replacementSet);
				if (result == null) result = caseManagedElement(replacementSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CimPackage.PHYSICAL_CAPCACITY: {
				PhysicalCapcacity physicalCapcacity = (PhysicalCapcacity)theEObject;
				T result = casePhysicalCapcacity(physicalCapcacity);
				if (result == null) result = caseManagedElement(physicalCapcacity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CimPackage.MEMORY_CAPACITY: {
				MemoryCapacity memoryCapacity = (MemoryCapacity)theEObject;
				T result = caseMemoryCapacity(memoryCapacity);
				if (result == null) result = casePhysicalCapcacity(memoryCapacity);
				if (result == null) result = caseManagedElement(memoryCapacity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CimPackage.LAN_ENDPOINT: {
				LANEndpoint lanEndpoint = (LANEndpoint)theEObject;
				T result = caseLANEndpoint(lanEndpoint);
				if (result == null) result = caseProtocolEndpoint(lanEndpoint);
				if (result == null) result = caseServiceAccessPoint(lanEndpoint);
				if (result == null) result = caseEnabledLogicalElement(lanEndpoint);
				if (result == null) result = caseLogicalElement(lanEndpoint);
				if (result == null) result = caseManagedSystemElement(lanEndpoint);
				if (result == null) result = caseManagedElement(lanEndpoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CimPackage.OSPF_PROTOCOL_ENDPOINT_BASE: {
				OSPFProtocolEndpointBase ospfProtocolEndpointBase = (OSPFProtocolEndpointBase)theEObject;
				T result = caseOSPFProtocolEndpointBase(ospfProtocolEndpointBase);
				if (result == null) result = caseProtocolEndpoint(ospfProtocolEndpointBase);
				if (result == null) result = caseServiceAccessPoint(ospfProtocolEndpointBase);
				if (result == null) result = caseEnabledLogicalElement(ospfProtocolEndpointBase);
				if (result == null) result = caseLogicalElement(ospfProtocolEndpointBase);
				if (result == null) result = caseManagedSystemElement(ospfProtocolEndpointBase);
				if (result == null) result = caseManagedElement(ospfProtocolEndpointBase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CimPackage.OSPF_VIRTUAL_INTERFACE: {
				OSPFVirtualInterface ospfVirtualInterface = (OSPFVirtualInterface)theEObject;
				T result = caseOSPFVirtualInterface(ospfVirtualInterface);
				if (result == null) result = caseOSPFProtocolEndpointBase(ospfVirtualInterface);
				if (result == null) result = caseProtocolEndpoint(ospfVirtualInterface);
				if (result == null) result = caseServiceAccessPoint(ospfVirtualInterface);
				if (result == null) result = caseEnabledLogicalElement(ospfVirtualInterface);
				if (result == null) result = caseLogicalElement(ospfVirtualInterface);
				if (result == null) result = caseManagedSystemElement(ospfVirtualInterface);
				if (result == null) result = caseManagedElement(ospfVirtualInterface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CimPackage.OSPF_PROTOCOL_ENDPOINT: {
				OSPFProtocolEndpoint ospfProtocolEndpoint = (OSPFProtocolEndpoint)theEObject;
				T result = caseOSPFProtocolEndpoint(ospfProtocolEndpoint);
				if (result == null) result = caseOSPFProtocolEndpointBase(ospfProtocolEndpoint);
				if (result == null) result = caseProtocolEndpoint(ospfProtocolEndpoint);
				if (result == null) result = caseServiceAccessPoint(ospfProtocolEndpoint);
				if (result == null) result = caseEnabledLogicalElement(ospfProtocolEndpoint);
				if (result == null) result = caseLogicalElement(ospfProtocolEndpoint);
				if (result == null) result = caseManagedSystemElement(ospfProtocolEndpoint);
				if (result == null) result = caseManagedElement(ospfProtocolEndpoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CimPackage.BGP_PROTOCOL_ENDPOINT: {
				BGPProtocolEndpoint bgpProtocolEndpoint = (BGPProtocolEndpoint)theEObject;
				T result = caseBGPProtocolEndpoint(bgpProtocolEndpoint);
				if (result == null) result = caseProtocolEndpoint(bgpProtocolEndpoint);
				if (result == null) result = caseServiceAccessPoint(bgpProtocolEndpoint);
				if (result == null) result = caseEnabledLogicalElement(bgpProtocolEndpoint);
				if (result == null) result = caseLogicalElement(bgpProtocolEndpoint);
				if (result == null) result = caseManagedSystemElement(bgpProtocolEndpoint);
				if (result == null) result = caseManagedElement(bgpProtocolEndpoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CimPackage.IP_PROTOCOL_ENDPOINT: {
				IPProtocolEndpoint ipProtocolEndpoint = (IPProtocolEndpoint)theEObject;
				T result = caseIPProtocolEndpoint(ipProtocolEndpoint);
				if (result == null) result = caseProtocolEndpoint(ipProtocolEndpoint);
				if (result == null) result = caseServiceAccessPoint(ipProtocolEndpoint);
				if (result == null) result = caseEnabledLogicalElement(ipProtocolEndpoint);
				if (result == null) result = caseLogicalElement(ipProtocolEndpoint);
				if (result == null) result = caseManagedSystemElement(ipProtocolEndpoint);
				if (result == null) result = caseManagedElement(ipProtocolEndpoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CimPackage.IPX_PROTOCOL_ENDPOINT: {
				IPXProtocolEndpoint ipxProtocolEndpoint = (IPXProtocolEndpoint)theEObject;
				T result = caseIPXProtocolEndpoint(ipxProtocolEndpoint);
				if (result == null) result = caseProtocolEndpoint(ipxProtocolEndpoint);
				if (result == null) result = caseServiceAccessPoint(ipxProtocolEndpoint);
				if (result == null) result = caseEnabledLogicalElement(ipxProtocolEndpoint);
				if (result == null) result = caseLogicalElement(ipxProtocolEndpoint);
				if (result == null) result = caseManagedSystemElement(ipxProtocolEndpoint);
				if (result == null) result = caseManagedElement(ipxProtocolEndpoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CimPackage.MPLS_PROTOCOL_ENDPOINT: {
				MPLSProtocolEndpoint mplsProtocolEndpoint = (MPLSProtocolEndpoint)theEObject;
				T result = caseMPLSProtocolEndpoint(mplsProtocolEndpoint);
				if (result == null) result = caseProtocolEndpoint(mplsProtocolEndpoint);
				if (result == null) result = caseServiceAccessPoint(mplsProtocolEndpoint);
				if (result == null) result = caseEnabledLogicalElement(mplsProtocolEndpoint);
				if (result == null) result = caseLogicalElement(mplsProtocolEndpoint);
				if (result == null) result = caseManagedSystemElement(mplsProtocolEndpoint);
				if (result == null) result = caseManagedElement(mplsProtocolEndpoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CimPackage.SWITCH_PORT: {
				SwitchPort switchPort = (SwitchPort)theEObject;
				T result = caseSwitchPort(switchPort);
				if (result == null) result = caseProtocolEndpoint(switchPort);
				if (result == null) result = caseServiceAccessPoint(switchPort);
				if (result == null) result = caseEnabledLogicalElement(switchPort);
				if (result == null) result = caseLogicalElement(switchPort);
				if (result == null) result = caseManagedSystemElement(switchPort);
				if (result == null) result = caseManagedElement(switchPort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CimPackage.TCP_PROTOCOL_ENDPOINT: {
				TCPProtocolEndpoint tcpProtocolEndpoint = (TCPProtocolEndpoint)theEObject;
				T result = caseTCPProtocolEndpoint(tcpProtocolEndpoint);
				if (result == null) result = caseProtocolEndpoint(tcpProtocolEndpoint);
				if (result == null) result = caseServiceAccessPoint(tcpProtocolEndpoint);
				if (result == null) result = caseEnabledLogicalElement(tcpProtocolEndpoint);
				if (result == null) result = caseLogicalElement(tcpProtocolEndpoint);
				if (result == null) result = caseManagedSystemElement(tcpProtocolEndpoint);
				if (result == null) result = caseManagedElement(tcpProtocolEndpoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CimPackage.UDP_PROTOCOL_ENDPOINT: {
				UDPProtocolEndpoint udpProtocolEndpoint = (UDPProtocolEndpoint)theEObject;
				T result = caseUDPProtocolEndpoint(udpProtocolEndpoint);
				if (result == null) result = caseProtocolEndpoint(udpProtocolEndpoint);
				if (result == null) result = caseServiceAccessPoint(udpProtocolEndpoint);
				if (result == null) result = caseEnabledLogicalElement(udpProtocolEndpoint);
				if (result == null) result = caseLogicalElement(udpProtocolEndpoint);
				if (result == null) result = caseManagedSystemElement(udpProtocolEndpoint);
				if (result == null) result = caseManagedElement(udpProtocolEndpoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CimPackage.CLP_SETTING_DATA: {
				CLPSettingData clpSettingData = (CLPSettingData)theEObject;
				T result = caseCLPSettingData(clpSettingData);
				if (result == null) result = caseSettingData(clpSettingData);
				if (result == null) result = caseManagedElement(clpSettingData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CimPackage.TELNET_SETTING_DATA: {
				TelnetSettingData telnetSettingData = (TelnetSettingData)theEObject;
				T result = caseTelnetSettingData(telnetSettingData);
				if (result == null) result = caseSettingData(telnetSettingData);
				if (result == null) result = caseManagedElement(telnetSettingData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CimPackage.SSH_SETTING_DATA: {
				SSHSettingData sshSettingData = (SSHSettingData)theEObject;
				T result = caseSSHSettingData(sshSettingData);
				if (result == null) result = caseSettingData(sshSettingData);
				if (result == null) result = caseManagedElement(sshSettingData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CimPackage.DHCP_CAPABILITIES: {
				DHCPCapabilities dhcpCapabilities = (DHCPCapabilities)theEObject;
				T result = caseDHCPCapabilities(dhcpCapabilities);
				if (result == null) result = caseCapabilities(dhcpCapabilities);
				if (result == null) result = caseManagedElement(dhcpCapabilities);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CimPackage.DHCP_PROTOCOL_ENDPOINT: {
				DHCPProtocolEndpoint dhcpProtocolEndpoint = (DHCPProtocolEndpoint)theEObject;
				T result = caseDHCPProtocolEndpoint(dhcpProtocolEndpoint);
				if (result == null) result = caseProtocolEndpoint(dhcpProtocolEndpoint);
				if (result == null) result = caseServiceAccessPoint(dhcpProtocolEndpoint);
				if (result == null) result = caseEnabledLogicalElement(dhcpProtocolEndpoint);
				if (result == null) result = caseLogicalElement(dhcpProtocolEndpoint);
				if (result == null) result = caseManagedSystemElement(dhcpProtocolEndpoint);
				if (result == null) result = caseManagedElement(dhcpProtocolEndpoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CimPackage.TELNET_PROTOCOL_ENDPOINT: {
				TelnetProtocolEndpoint telnetProtocolEndpoint = (TelnetProtocolEndpoint)theEObject;
				T result = caseTelnetProtocolEndpoint(telnetProtocolEndpoint);
				if (result == null) result = caseProtocolEndpoint(telnetProtocolEndpoint);
				if (result == null) result = caseServiceAccessPoint(telnetProtocolEndpoint);
				if (result == null) result = caseEnabledLogicalElement(telnetProtocolEndpoint);
				if (result == null) result = caseLogicalElement(telnetProtocolEndpoint);
				if (result == null) result = caseManagedSystemElement(telnetProtocolEndpoint);
				if (result == null) result = caseManagedElement(telnetProtocolEndpoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CimPackage.DNS_PROTOCOL_ENDPOINT: {
				DNSProtocolEndpoint dnsProtocolEndpoint = (DNSProtocolEndpoint)theEObject;
				T result = caseDNSProtocolEndpoint(dnsProtocolEndpoint);
				if (result == null) result = caseProtocolEndpoint(dnsProtocolEndpoint);
				if (result == null) result = caseServiceAccessPoint(dnsProtocolEndpoint);
				if (result == null) result = caseEnabledLogicalElement(dnsProtocolEndpoint);
				if (result == null) result = caseLogicalElement(dnsProtocolEndpoint);
				if (result == null) result = caseManagedSystemElement(dnsProtocolEndpoint);
				if (result == null) result = caseManagedElement(dnsProtocolEndpoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CimPackage.DNS_SETTING_DATA: {
				DNSSettingData dnsSettingData = (DNSSettingData)theEObject;
				T result = caseDNSSettingData(dnsSettingData);
				if (result == null) result = caseIPAssignmentSettingData(dnsSettingData);
				if (result == null) result = caseSettingData(dnsSettingData);
				if (result == null) result = caseManagedElement(dnsSettingData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CimPackage.IP_ASSIGNMENT_SETTING_DATA: {
				IPAssignmentSettingData ipAssignmentSettingData = (IPAssignmentSettingData)theEObject;
				T result = caseIPAssignmentSettingData(ipAssignmentSettingData);
				if (result == null) result = caseSettingData(ipAssignmentSettingData);
				if (result == null) result = caseManagedElement(ipAssignmentSettingData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CimPackage.WIRELESS_LAN_ENDPOINT: {
				WirelessLANEndpoint wirelessLANEndpoint = (WirelessLANEndpoint)theEObject;
				T result = caseWirelessLANEndpoint(wirelessLANEndpoint);
				if (result == null) result = caseProtocolEndpoint(wirelessLANEndpoint);
				if (result == null) result = caseServiceAccessPoint(wirelessLANEndpoint);
				if (result == null) result = caseEnabledLogicalElement(wirelessLANEndpoint);
				if (result == null) result = caseLogicalElement(wirelessLANEndpoint);
				if (result == null) result = caseManagedSystemElement(wirelessLANEndpoint);
				if (result == null) result = caseManagedElement(wirelessLANEndpoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CimPackage.WI_FI_END_POINT: {
				WiFiEndPoint wiFiEndPoint = (WiFiEndPoint)theEObject;
				T result = caseWiFiEndPoint(wiFiEndPoint);
				if (result == null) result = caseProtocolEndpoint(wiFiEndPoint);
				if (result == null) result = caseServiceAccessPoint(wiFiEndPoint);
				if (result == null) result = caseEnabledLogicalElement(wiFiEndPoint);
				if (result == null) result = caseLogicalElement(wiFiEndPoint);
				if (result == null) result = caseManagedSystemElement(wiFiEndPoint);
				if (result == null) result = caseManagedElement(wiFiEndPoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CimPackage.WI_FI_ENDPOINT_SETTINGS: {
				WiFiEndpointSettings wiFiEndpointSettings = (WiFiEndpointSettings)theEObject;
				T result = caseWiFiEndpointSettings(wiFiEndpointSettings);
				if (result == null) result = caseSettingData(wiFiEndpointSettings);
				if (result == null) result = caseManagedElement(wiFiEndpointSettings);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CimPackage.PROTOCOL_SERVICE: {
				ProtocolService protocolService = (ProtocolService)theEObject;
				T result = caseProtocolService(protocolService);
				if (result == null) result = caseService(protocolService);
				if (result == null) result = caseEnabledLogicalElement(protocolService);
				if (result == null) result = caseLogicalElement(protocolService);
				if (result == null) result = caseManagedSystemElement(protocolService);
				if (result == null) result = caseManagedElement(protocolService);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CimPackage.CONDITIONING_SERVICE: {
				ConditioningService conditioningService = (ConditioningService)theEObject;
				T result = caseConditioningService(conditioningService);
				if (result == null) result = caseService(conditioningService);
				if (result == null) result = caseEnabledLogicalElement(conditioningService);
				if (result == null) result = caseLogicalElement(conditioningService);
				if (result == null) result = caseManagedSystemElement(conditioningService);
				if (result == null) result = caseManagedElement(conditioningService);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CimPackage.QO_SSERVICE: {
				QoSService qoSService = (QoSService)theEObject;
				T result = caseQoSService(qoSService);
				if (result == null) result = caseService(qoSService);
				if (result == null) result = caseEnabledLogicalElement(qoSService);
				if (result == null) result = caseLogicalElement(qoSService);
				if (result == null) result = caseManagedSystemElement(qoSService);
				if (result == null) result = caseManagedElement(qoSService);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CimPackage.PRECEDENCE_SERVICE: {
				PrecedenceService precedenceService = (PrecedenceService)theEObject;
				T result = casePrecedenceService(precedenceService);
				if (result == null) result = caseQoSService(precedenceService);
				if (result == null) result = caseService(precedenceService);
				if (result == null) result = caseEnabledLogicalElement(precedenceService);
				if (result == null) result = caseLogicalElement(precedenceService);
				if (result == null) result = caseManagedSystemElement(precedenceService);
				if (result == null) result = caseManagedElement(precedenceService);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CimPackage.DIFF_SERV_SERVICE: {
				DiffServService diffServService = (DiffServService)theEObject;
				T result = caseDiffServService(diffServService);
				if (result == null) result = caseQoSService(diffServService);
				if (result == null) result = caseService(diffServService);
				if (result == null) result = caseEnabledLogicalElement(diffServService);
				if (result == null) result = caseLogicalElement(diffServService);
				if (result == null) result = caseManagedSystemElement(diffServService);
				if (result == null) result = caseManagedElement(diffServService);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CimPackage.EF_SERVICE: {
				EFService efService = (EFService)theEObject;
				T result = caseEFService(efService);
				if (result == null) result = caseDiffServService(efService);
				if (result == null) result = caseQoSService(efService);
				if (result == null) result = caseService(efService);
				if (result == null) result = caseEnabledLogicalElement(efService);
				if (result == null) result = caseLogicalElement(efService);
				if (result == null) result = caseManagedSystemElement(efService);
				if (result == null) result = caseManagedElement(efService);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CimPackage.AF_SERVICE: {
				AFService afService = (AFService)theEObject;
				T result = caseAFService(afService);
				if (result == null) result = caseDiffServService(afService);
				if (result == null) result = caseQoSService(afService);
				if (result == null) result = caseService(afService);
				if (result == null) result = caseEnabledLogicalElement(afService);
				if (result == null) result = caseLogicalElement(afService);
				if (result == null) result = caseManagedSystemElement(afService);
				if (result == null) result = caseManagedElement(afService);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CimPackage.HDR8021_PSERVICE: {
				Hdr8021PService hdr8021PService = (Hdr8021PService)theEObject;
				T result = caseHdr8021PService(hdr8021PService);
				if (result == null) result = caseQoSService(hdr8021PService);
				if (result == null) result = caseService(hdr8021PService);
				if (result == null) result = caseEnabledLogicalElement(hdr8021PService);
				if (result == null) result = caseLogicalElement(hdr8021PService);
				if (result == null) result = caseManagedSystemElement(hdr8021PService);
				if (result == null) result = caseManagedElement(hdr8021PService);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CimPackage.DROP_THRESHOLD_CALCULATION_SERVICE: {
				DropThresholdCalculationService dropThresholdCalculationService = (DropThresholdCalculationService)theEObject;
				T result = caseDropThresholdCalculationService(dropThresholdCalculationService);
				if (result == null) result = caseService(dropThresholdCalculationService);
				if (result == null) result = caseEnabledLogicalElement(dropThresholdCalculationService);
				if (result == null) result = caseLogicalElement(dropThresholdCalculationService);
				if (result == null) result = caseManagedSystemElement(dropThresholdCalculationService);
				if (result == null) result = caseManagedElement(dropThresholdCalculationService);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CimPackage.FLOW_SERVICE: {
				FlowService flowService = (FlowService)theEObject;
				T result = caseFlowService(flowService);
				if (result == null) result = caseQoSService(flowService);
				if (result == null) result = caseService(flowService);
				if (result == null) result = caseEnabledLogicalElement(flowService);
				if (result == null) result = caseLogicalElement(flowService);
				if (result == null) result = caseManagedSystemElement(flowService);
				if (result == null) result = caseManagedElement(flowService);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CimPackage.NEXT_HOP_ROUTE: {
				NextHopRoute nextHopRoute = (NextHopRoute)theEObject;
				T result = caseNextHopRoute(nextHopRoute);
				if (result == null) result = caseManagedElement(nextHopRoute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CimPackage.NEXT_HOP_IP_ROUTE: {
				NextHopIPRoute nextHopIPRoute = (NextHopIPRoute)theEObject;
				T result = caseNextHopIPRoute(nextHopIPRoute);
				if (result == null) result = caseNextHopRoute(nextHopIPRoute);
				if (result == null) result = caseManagedElement(nextHopIPRoute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CimPackage.ADMINISTRATIVE_DISTANCE: {
				AdministrativeDistance administrativeDistance = (AdministrativeDistance)theEObject;
				T result = caseAdministrativeDistance(administrativeDistance);
				if (result == null) result = caseLogicalElement(administrativeDistance);
				if (result == null) result = caseManagedSystemElement(administrativeDistance);
				if (result == null) result = caseManagedElement(administrativeDistance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CimPackage.NEXT_HOP_ROUTING: {
				NextHopRouting nextHopRouting = (NextHopRouting)theEObject;
				T result = caseNextHopRouting(nextHopRouting);
				if (result == null) result = caseLogicalElement(nextHopRouting);
				if (result == null) result = caseManagedSystemElement(nextHopRouting);
				if (result == null) result = caseManagedElement(nextHopRouting);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CimPackage.IP_ROUTE: {
				IPRoute ipRoute = (IPRoute)theEObject;
				T result = caseIPRoute(ipRoute);
				if (result == null) result = caseNextHopRouting(ipRoute);
				if (result == null) result = caseLogicalElement(ipRoute);
				if (result == null) result = caseManagedSystemElement(ipRoute);
				if (result == null) result = caseManagedElement(ipRoute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CimPackage.ROUTING_POLICY: {
				RoutingPolicy routingPolicy = (RoutingPolicy)theEObject;
				T result = caseRoutingPolicy(routingPolicy);
				if (result == null) result = caseLogicalElement(routingPolicy);
				if (result == null) result = caseManagedSystemElement(routingPolicy);
				if (result == null) result = caseManagedElement(routingPolicy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CimPackage.ROUTE_CALCULATION_SERVICE: {
				RouteCalculationService routeCalculationService = (RouteCalculationService)theEObject;
				T result = caseRouteCalculationService(routeCalculationService);
				if (result == null) result = caseNetworkService(routeCalculationService);
				if (result == null) result = caseService(routeCalculationService);
				if (result == null) result = caseEnabledLogicalElement(routeCalculationService);
				if (result == null) result = caseLogicalElement(routeCalculationService);
				if (result == null) result = caseManagedSystemElement(routeCalculationService);
				if (result == null) result = caseManagedElement(routeCalculationService);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CimPackage.NETWORK_SERVICE: {
				NetworkService networkService = (NetworkService)theEObject;
				T result = caseNetworkService(networkService);
				if (result == null) result = caseService(networkService);
				if (result == null) result = caseEnabledLogicalElement(networkService);
				if (result == null) result = caseLogicalElement(networkService);
				if (result == null) result = caseManagedSystemElement(networkService);
				if (result == null) result = caseManagedElement(networkService);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CimPackage.FORWARDING_SERVICE: {
				ForwardingService forwardingService = (ForwardingService)theEObject;
				T result = caseForwardingService(forwardingService);
				if (result == null) result = caseNetworkService(forwardingService);
				if (result == null) result = caseService(forwardingService);
				if (result == null) result = caseEnabledLogicalElement(forwardingService);
				if (result == null) result = caseLogicalElement(forwardingService);
				if (result == null) result = caseManagedSystemElement(forwardingService);
				if (result == null) result = caseManagedElement(forwardingService);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CimPackage.ROUTING_PROTOCOL_DOMAIN: {
				RoutingProtocolDomain routingProtocolDomain = (RoutingProtocolDomain)theEObject;
				T result = caseRoutingProtocolDomain(routingProtocolDomain);
				if (result == null) result = caseAdminDomain(routingProtocolDomain);
				if (result == null) result = caseSystem(routingProtocolDomain);
				if (result == null) result = caseEnabledLogicalElement(routingProtocolDomain);
				if (result == null) result = caseLogicalElement(routingProtocolDomain);
				if (result == null) result = caseManagedSystemElement(routingProtocolDomain);
				if (result == null) result = caseManagedElement(routingProtocolDomain);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CimPackage.NAT_SERVICE: {
				NATService natService = (NATService)theEObject;
				T result = caseNATService(natService);
				if (result == null) result = caseForwardingService(natService);
				if (result == null) result = caseNetworkService(natService);
				if (result == null) result = caseService(natService);
				if (result == null) result = caseEnabledLogicalElement(natService);
				if (result == null) result = caseLogicalElement(natService);
				if (result == null) result = caseManagedSystemElement(natService);
				if (result == null) result = caseManagedElement(natService);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CimPackage.NAT_SETTING_DATA: {
				NATSettingData natSettingData = (NATSettingData)theEObject;
				T result = caseNATSettingData(natSettingData);
				if (result == null) result = caseScopedSettingData(natSettingData);
				if (result == null) result = caseSettingData(natSettingData);
				if (result == null) result = caseManagedElement(natSettingData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CimPackage.NAT_STATIC_SETTINGS: {
				NATStaticSettings natStaticSettings = (NATStaticSettings)theEObject;
				T result = caseNATStaticSettings(natStaticSettings);
				if (result == null) result = caseNATSettingData(natStaticSettings);
				if (result == null) result = caseScopedSettingData(natStaticSettings);
				if (result == null) result = caseSettingData(natStaticSettings);
				if (result == null) result = caseManagedElement(natStaticSettings);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CimPackage.NAT_LIST_BASED_SETTINGS: {
				NATListBasedSettings natListBasedSettings = (NATListBasedSettings)theEObject;
				T result = caseNATListBasedSettings(natListBasedSettings);
				if (result == null) result = caseNATSettingData(natListBasedSettings);
				if (result == null) result = caseScopedSettingData(natListBasedSettings);
				if (result == null) result = caseSettingData(natListBasedSettings);
				if (result == null) result = caseManagedElement(natListBasedSettings);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CimPackage.SNMP_COMMUNITY_STRINGS: {
				SNMPCommunityStrings snmpCommunityStrings = (SNMPCommunityStrings)theEObject;
				T result = caseSNMPCommunityStrings(snmpCommunityStrings);
				if (result == null) result = caseServiceAccessPoint(snmpCommunityStrings);
				if (result == null) result = caseEnabledLogicalElement(snmpCommunityStrings);
				if (result == null) result = caseLogicalElement(snmpCommunityStrings);
				if (result == null) result = caseManagedSystemElement(snmpCommunityStrings);
				if (result == null) result = caseManagedElement(snmpCommunityStrings);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CimPackage.SNMP_SERVICE: {
				SNMPService snmpService = (SNMPService)theEObject;
				T result = caseSNMPService(snmpService);
				if (result == null) result = caseService(snmpService);
				if (result == null) result = caseEnabledLogicalElement(snmpService);
				if (result == null) result = caseLogicalElement(snmpService);
				if (result == null) result = caseManagedSystemElement(snmpService);
				if (result == null) result = caseManagedElement(snmpService);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CimPackage.SNMP_TRAP_TARGET: {
				SNMPTrapTarget snmpTrapTarget = (SNMPTrapTarget)theEObject;
				T result = caseSNMPTrapTarget(snmpTrapTarget);
				if (result == null) result = caseRemotePort(snmpTrapTarget);
				if (result == null) result = caseRemoteServiceAccessPoint(snmpTrapTarget);
				if (result == null) result = caseServiceAccessPoint(snmpTrapTarget);
				if (result == null) result = caseEnabledLogicalElement(snmpTrapTarget);
				if (result == null) result = caseLogicalElement(snmpTrapTarget);
				if (result == null) result = caseManagedSystemElement(snmpTrapTarget);
				if (result == null) result = caseManagedElement(snmpTrapTarget);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CIM Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CIM Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCIM_Model(CIM_Model object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BGP Cluster</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BGP Cluster</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBGPCluster(BGPCluster object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BGP Peer Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BGP Peer Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBGPPeerGroup(BGPPeerGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BGP Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BGP Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBGPService(BGPService object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Autonomous System</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Autonomous System</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAutonomousSystem(AutonomousSystem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Network</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Network</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNetwork(Network object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Computer System</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Computer System</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComputerSystem(ComputerSystem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Directory</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Directory</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDirectory(Directory object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Logical File</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Logical File</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLogicalFile(LogicalFile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unitary Computer System</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unitary Computer System</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnitaryComputerSystem(UnitaryComputerSystem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAction(Action object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Architecture Check</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Architecture Check</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArchitectureCheck(ArchitectureCheck object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Application System</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Application System</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseApplicationSystem(ApplicationSystem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BIOS Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BIOS Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBIOSElement(BIOSElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BIOS Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BIOS Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBIOSFeature(BIOSFeature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Check</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Check</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCheck(Check object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Create Directory Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Create Directory Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCreateDirectoryAction(CreateDirectoryAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Copy File Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Copy File Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCopyFileAction(CopyFileAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Directory Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Directory Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDirectoryAction(DirectoryAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Directory Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Directory Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDirectorySpecification(DirectorySpecification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Disk Space Check</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Disk Space Check</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiskSpaceCheck(DiskSpaceCheck object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Execute Program</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Execute Program</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExecuteProgram(ExecuteProgram object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>File Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>File Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFileAction(FileAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>File Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>File Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFileSpecification(FileSpecification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Installed Product</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Installed Product</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInstalledProduct(InstalledProduct object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Memory Check</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Memory Check</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMemoryCheck(MemoryCheck object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Modify Setting Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Modify Setting Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModifySettingAction(ModifySettingAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operating System</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operating System</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperatingSystem(OperatingSystem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OS Version Check</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OS Version Check</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOSVersionCheck(OSVersionCheck object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reboot Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reboot Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRebootAction(RebootAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Remove File Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Remove File Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRemoveFileAction(RemoveFileAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Remove Directory Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Remove Directory Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRemoveDirectoryAction(RemoveDirectoryAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Setting Check</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Setting Check</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSettingCheck(SettingCheck object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Software Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Software Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSoftwareElement(SoftwareElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Software Element Version Check</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Software Element Version Check</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSoftwareElementVersionCheck(SoftwareElementVersionCheck object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Software Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Software Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSoftwareFeature(SoftwareFeature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Swap Space Check</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Swap Space Check</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSwapSpaceCheck(SwapSpaceCheck object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Version Compatibility Check</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Version Compatibility Check</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVersionCompatibilityCheck(VersionCompatibilityCheck object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Buffer Pool</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Buffer Pool</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBufferPool(BufferPool object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connectivity Memberhip Setting Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connectivity Memberhip Setting Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnectivityMemberhipSettingData(ConnectivityMemberhipSettingData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connectivity Collection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connectivity Collection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnectivityCollection(ConnectivityCollection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Address Collection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Address Collection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedAddressCollection(NamedAddressCollection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Range Of IP Addresses</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Range Of IP Addresses</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRangeOfIPAddresses(RangeOfIPAddresses object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>LAN Connectivity Segment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>LAN Connectivity Segment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLANConnectivitySegment(LANConnectivitySegment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IP Connectivity Subnet</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IP Connectivity Subnet</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIPConnectivitySubnet(IPConnectivitySubnet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IPX Connectivity Network</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IPX Connectivity Network</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIPXConnectivityNetwork(IPXConnectivityNetwork object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IP Address Range</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IP Address Range</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIPAddressRange(IPAddressRange object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Logical Network</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Logical Network</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLogicalNetwork(LogicalNetwork object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IPX Network</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IPX Network</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIPXNetwork(IPXNetwork object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>LAN Segment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>LAN Segment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLANSegment(LANSegment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IP Subnet</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IP Subnet</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIPSubnet(IPSubnet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Admin Domain</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Admin Domain</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdminDomain(AdminDomain object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Capabilities</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Capabilities</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCapabilities(Capabilities object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Collection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Collection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCollection(Collection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Collection Of MS Es</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Collection Of MS Es</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCollectionOfMSEs(CollectionOfMSEs object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element Setting Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element Setting Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElementSettingData(ElementSettingData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element Software Identity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element Software Identity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElementSoftwareIdentity(ElementSoftwareIdentity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enabled Logical Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enabled Logical Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnabledLogicalElement(EnabledLogicalElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enabled Logical Element Capabilities</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enabled Logical Element Capabilities</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnabledLogicalElementCapabilities(EnabledLogicalElementCapabilities object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generic Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generic Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenericService(GenericService object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Logical Device</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Logical Device</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLogicalDevice(LogicalDevice object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Logical Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Logical Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLogicalElement(LogicalElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Managed Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Managed Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseManagedElement(ManagedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Managed System Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Managed System Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseManagedSystemElement(ManagedSystemElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Physical Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Physical Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePhysicalElement(PhysicalElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Power Management Capabilities</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Power Management Capabilities</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePowerManagementCapabilities(PowerManagementCapabilities object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Product</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Product</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProduct(Product object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Protocol Endpoint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Protocol Endpoint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProtocolEndpoint(ProtocolEndpoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Remote Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Remote Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRemotePort(RemotePort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Remote Service Access Point</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Remote Service Access Point</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRemoteServiceAccessPoint(RemoteServiceAccessPoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRole(Role object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scoped Setting Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scoped Setting Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScopedSettingData(ScopedSettingData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseService(Service object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Access URI</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Access URI</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceAccessURI(ServiceAccessURI object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Access Point</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Access Point</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceAccessPoint(ServiceAccessPoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Setting Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Setting Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSettingData(SettingData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Software Identity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Software Identity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSoftwareIdentity(SoftwareIdentity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Status Description</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Status Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStatusDescription(StatusDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystem(es.tid.cim.System object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System Specific Collection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System Specific Collection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystemSpecificCollection(SystemSpecificCollection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Storage Extent</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Storage Extent</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStorageExtent(StorageExtent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Memory</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Memory</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMemory(Memory object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Volatile Storage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Volatile Storage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVolatileStorage(VolatileStorage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>USB Device</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>USB Device</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUSBDevice(USBDevice object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Filter List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Filter List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFilterList(FilterList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Filter Entry Base</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Filter Entry Base</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFilterEntryBase(FilterEntryBase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Filter Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Filter Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFilterEntry(FilterEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IP Headers Filter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IP Headers Filter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIPHeadersFilter(IPHeadersFilter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ethernet Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ethernet Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEthernetPort(EthernetPort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Logical Module</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Logical Module</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLogicalModule(LogicalModule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Logical Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Logical Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLogicalPort(LogicalPort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Network Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Network Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNetworkPort(NetworkPort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>USB Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>USB Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUSBPort(USBPort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wireless Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wireless Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWirelessPort(WirelessPort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wi Fi Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wi Fi Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWiFiPort(WiFiPort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ADSL Modem</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ADSL Modem</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseADSLModem(ADSLModem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cable Modem</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cable Modem</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCableModem(CableModem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Call Based Modem</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Call Based Modem</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCallBasedModem(CallBasedModem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connection Based Modem</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connection Based Modem</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnectionBasedModem(ConnectionBasedModem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DSL Modem</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DSL Modem</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDSLModem(DSLModem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISDN Modem</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISDN Modem</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISDNModem(ISDNModem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Modem</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Modem</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModem(Modem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HDSL Modem</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HDSL Modem</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHDSLModem(HDSLModem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SDSL Modem</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SDSL Modem</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSDSLModem(SDSLModem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VDSL Modem</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VDSL Modem</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVDSLModem(VDSLModem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>POTS Modem</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>POTS Modem</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePOTSModem(POTSModem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Uni Modem</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Uni Modem</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUniModem(UniModem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Replacement Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Replacement Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReplacementSet(ReplacementSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Physical Capcacity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Physical Capcacity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePhysicalCapcacity(PhysicalCapcacity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Memory Capacity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Memory Capacity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMemoryCapacity(MemoryCapacity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>LAN Endpoint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>LAN Endpoint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLANEndpoint(LANEndpoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OSPF Protocol Endpoint Base</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OSPF Protocol Endpoint Base</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOSPFProtocolEndpointBase(OSPFProtocolEndpointBase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OSPF Virtual Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OSPF Virtual Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOSPFVirtualInterface(OSPFVirtualInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OSPF Protocol Endpoint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OSPF Protocol Endpoint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOSPFProtocolEndpoint(OSPFProtocolEndpoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BGP Protocol Endpoint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BGP Protocol Endpoint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBGPProtocolEndpoint(BGPProtocolEndpoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IP Protocol Endpoint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IP Protocol Endpoint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIPProtocolEndpoint(IPProtocolEndpoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IPX Protocol Endpoint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IPX Protocol Endpoint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIPXProtocolEndpoint(IPXProtocolEndpoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MPLS Protocol Endpoint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MPLS Protocol Endpoint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMPLSProtocolEndpoint(MPLSProtocolEndpoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Switch Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Switch Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSwitchPort(SwitchPort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TCP Protocol Endpoint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TCP Protocol Endpoint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTCPProtocolEndpoint(TCPProtocolEndpoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UDP Protocol Endpoint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UDP Protocol Endpoint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUDPProtocolEndpoint(UDPProtocolEndpoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CLP Setting Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CLP Setting Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCLPSettingData(CLPSettingData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Telnet Setting Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Telnet Setting Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTelnetSettingData(TelnetSettingData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SSH Setting Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SSH Setting Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSSHSettingData(SSHSettingData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DHCP Capabilities</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DHCP Capabilities</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDHCPCapabilities(DHCPCapabilities object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DHCP Protocol Endpoint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DHCP Protocol Endpoint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDHCPProtocolEndpoint(DHCPProtocolEndpoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Telnet Protocol Endpoint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Telnet Protocol Endpoint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTelnetProtocolEndpoint(TelnetProtocolEndpoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DNS Protocol Endpoint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DNS Protocol Endpoint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDNSProtocolEndpoint(DNSProtocolEndpoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DNS Setting Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DNS Setting Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDNSSettingData(DNSSettingData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IP Assignment Setting Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IP Assignment Setting Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIPAssignmentSettingData(IPAssignmentSettingData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wireless LAN Endpoint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wireless LAN Endpoint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWirelessLANEndpoint(WirelessLANEndpoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wi Fi End Point</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wi Fi End Point</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWiFiEndPoint(WiFiEndPoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wi Fi Endpoint Settings</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wi Fi Endpoint Settings</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWiFiEndpointSettings(WiFiEndpointSettings object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Protocol Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Protocol Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProtocolService(ProtocolService object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conditioning Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conditioning Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConditioningService(ConditioningService object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Qo SService</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Qo SService</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQoSService(QoSService object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Precedence Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Precedence Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrecedenceService(PrecedenceService object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diff Serv Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diff Serv Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiffServService(DiffServService object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EF Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EF Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEFService(EFService object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>AF Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>AF Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAFService(AFService object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hdr8021 PService</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hdr8021 PService</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHdr8021PService(Hdr8021PService object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Drop Threshold Calculation Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Drop Threshold Calculation Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDropThresholdCalculationService(DropThresholdCalculationService object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Flow Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Flow Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFlowService(FlowService object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Next Hop Route</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Next Hop Route</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNextHopRoute(NextHopRoute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Next Hop IP Route</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Next Hop IP Route</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNextHopIPRoute(NextHopIPRoute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Administrative Distance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Administrative Distance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdministrativeDistance(AdministrativeDistance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Next Hop Routing</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Next Hop Routing</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNextHopRouting(NextHopRouting object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IP Route</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IP Route</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIPRoute(IPRoute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Routing Policy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Routing Policy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoutingPolicy(RoutingPolicy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Route Calculation Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Route Calculation Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRouteCalculationService(RouteCalculationService object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Network Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Network Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNetworkService(NetworkService object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Forwarding Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Forwarding Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseForwardingService(ForwardingService object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Routing Protocol Domain</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Routing Protocol Domain</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoutingProtocolDomain(RoutingProtocolDomain object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>NAT Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>NAT Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNATService(NATService object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>NAT Setting Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>NAT Setting Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNATSettingData(NATSettingData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>NAT Static Settings</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>NAT Static Settings</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNATStaticSettings(NATStaticSettings object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>NAT List Based Settings</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>NAT List Based Settings</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNATListBasedSettings(NATListBasedSettings object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SNMP Community Strings</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SNMP Community Strings</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSNMPCommunityStrings(SNMPCommunityStrings object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SNMP Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SNMP Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSNMPService(SNMPService object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SNMP Trap Target</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SNMP Trap Target</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSNMPTrapTarget(SNMPTrapTarget object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public T defaultCase(EObject object) {
		return null;
	}

} //CimSwitch
