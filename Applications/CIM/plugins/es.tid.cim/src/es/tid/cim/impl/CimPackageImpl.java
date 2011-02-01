/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.tid.cim.impl;


import java.io.IOException;
import java.net.URL;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;

import es.tid.cim.CimFactory;
import es.tid.cim.CimPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CimPackageImpl extends EPackageImpl implements CimPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected String packageFilename = "cim.ecore";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ciM_ModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bgpClusterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bgpPeerGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bgpServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass autonomousSystemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass networkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass computerSystemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass directoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass logicalFileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unitaryComputerSystemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass architectureCheckEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass applicationSystemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass biosElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass biosFeatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass checkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass createDirectoryActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass copyFileActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass directoryActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass directorySpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diskSpaceCheckEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass executeProgramEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fileActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fileSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass installedProductEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass memoryCheckEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modifySettingActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operatingSystemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass osVersionCheckEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rebootActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass removeFileActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass removeDirectoryActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass settingCheckEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass softwareElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass softwareElementVersionCheckEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass softwareFeatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass swapSpaceCheckEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass versionCompatibilityCheckEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bufferPoolEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectivityMemberhipSettingDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectivityCollectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedAddressCollectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rangeOfIPAddressesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lanConnectivitySegmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ipConnectivitySubnetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ipxConnectivityNetworkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ipAddressRangeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass logicalNetworkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ipxNetworkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lanSegmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ipSubnetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass adminDomainEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass capabilitiesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass collectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass collectionOfMSEsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementSettingDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementSoftwareIdentityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enabledLogicalElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enabledLogicalElementCapabilitiesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genericServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass logicalDeviceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass logicalElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass managedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass managedSystemElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass physicalElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass powerManagementCapabilitiesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass protocolEndpointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass remotePortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass remoteServiceAccessPointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scopedSettingDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceAccessURIEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceAccessPointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass settingDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass softwareIdentityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass statusDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemSpecificCollectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass storageExtentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass memoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass volatileStorageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass usbDeviceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass filterListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass filterEntryBaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass filterEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ipHeadersFilterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ethernetPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass logicalModuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass logicalPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass networkPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass usbPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wirelessPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wiFiPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass adslModemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cableModemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass callBasedModemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectionBasedModemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dslModemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass isdnModemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hdslModemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sdslModemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vdslModemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass potsModemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uniModemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass replacementSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass physicalCapcacityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass memoryCapacityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lanEndpointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ospfProtocolEndpointBaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ospfVirtualInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ospfProtocolEndpointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bgpProtocolEndpointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ipProtocolEndpointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ipxProtocolEndpointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mplsProtocolEndpointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass switchPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tcpProtocolEndpointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass udpProtocolEndpointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clpSettingDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass telnetSettingDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sshSettingDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dhcpCapabilitiesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dhcpProtocolEndpointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass telnetProtocolEndpointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dnsProtocolEndpointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dnsSettingDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ipAssignmentSettingDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wirelessLANEndpointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wiFiEndPointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wiFiEndpointSettingsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass protocolServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditioningServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass qoSServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass precedenceServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diffServServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass efServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass afServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hdr8021PServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dropThresholdCalculationServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass flowServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nextHopRouteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nextHopIPRouteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass administrativeDistanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nextHopRoutingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ipRouteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass routingPolicyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass routeCalculationServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass networkServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass forwardingServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass routingProtocolDomainEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass natServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass natSettingDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass natStaticSettingsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass natListBasedSettingsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass snmpCommunityStringsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass snmpServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass snmpTrapTargetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumDedicatedEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumSoftwareElementStateEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumAddressTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumAccessContextEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumChangeableTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumClassificationsEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumHealthStateEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumEnabledDefaultEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumEnabledStateEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumElementSoftwareStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumExtendedResourceTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumInfoFormatEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumIsCurrentEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumIsDefaultEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumIsMaximumEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumIsMinimumEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumIsNextEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumIsPendingEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumNameFormatEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumOperationalStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumProtocolIFTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumRequestedStateEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumTargetOSTypesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumUpgradeConditionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumDirectionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumMatchConditionTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumActionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumTrafficTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumIPVersionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumAvailabilityEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumLinkTechnologyEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumLogicalModuleTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumPortTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumStatusInfoEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumLineStateEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumModulationSchemeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumAddressOriginEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumTerminalModeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumCharacterDisplayModeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumDHCPOptionsEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumAuthenticationMethodEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumEncryptionMethodEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumBSSTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumProtocolServiceReturnCodeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumProtocolTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumAddressExaminedEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see es.tid.cim.CimPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CimPackageImpl() {
		super(eNS_URI, CimFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link CimPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @generated
	 */
	public static CimPackage init() {
		if (isInited) return (CimPackage)EPackage.Registry.INSTANCE.getEPackage(CimPackage.eNS_URI);

		// Obtain or create and register package
		CimPackageImpl theCimPackage = (CimPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CimPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CimPackageImpl());

		isInited = true;

		// Load packages
		theCimPackage.loadPackage();

		// Fix loaded packages
		theCimPackage.fixPackageContents();

		// Mark meta-data to indicate it can't be changed
		theCimPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CimPackage.eNS_URI, theCimPackage);
		return theCimPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCIM_Model() {
		if (ciM_ModelEClass == null) {
			ciM_ModelEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CimPackage.eNS_URI).getEClassifiers().get(0);
		}
		return ciM_ModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCIM_Model_Elements() {
        return (EReference)getCIM_Model().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBGPCluster() {
		if (bgpClusterEClass == null) {
			bgpClusterEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CimPackage.eNS_URI).getEClassifiers().get(1);
		}
		return bgpClusterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBGPCluster_ClusterID() {
        return (EAttribute)getBGPCluster().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBGPCluster_ReflectorService() {
        return (EReference)getBGPCluster().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBGPCluster_ReflectorClientService() {
        return (EReference)getBGPCluster().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBGPCluster_ReflectorNonClientService() {
        return (EReference)getBGPCluster().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBGPCluster_RoutersInBGPCluster() {
        return (EReference)getBGPCluster().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBGPPeerGroup() {
		if (bgpPeerGroupEClass == null) {
			bgpPeerGroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CimPackage.eNS_URI).getEClassifiers().get(2);
		}
		return bgpPeerGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBGPPeerGroup_CreationClassName() {
        return (EAttribute)getBGPPeerGroup().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBGPPeerGroup_Name() {
        return (EAttribute)getBGPPeerGroup().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBGPPeerGroup_ConnectRetryInterval() {
        return (EAttribute)getBGPPeerGroup().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBGPPeerGroup_HoldTimeConfigured() {
        return (EAttribute)getBGPPeerGroup().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBGPPeerGroup_KeepAliveConfigured() {
        return (EAttribute)getBGPPeerGroup().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBGPPeerGroup_MinASOriginationInterval() {
        return (EAttribute)getBGPPeerGroup().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBGPPeerGroup_MinRouteAdvertisementInterval() {
        return (EAttribute)getBGPPeerGroup().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBGPService() {
		if (bgpServiceEClass == null) {
			bgpServiceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CimPackage.eNS_URI).getEClassifiers().get(3);
		}
		return bgpServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBGPService_BGPPeerGroupServices() {
        return (EReference)getBGPService().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBGPService_BGPVersion() {
        return (EAttribute)getBGPService().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBGPService_LastErrorCode() {
        return (EAttribute)getBGPService().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBGPService_LastMessageErrorSubCode() {
        return (EAttribute)getBGPService().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBGPService_LastOpenErrorSubCode() {
        return (EAttribute)getBGPService().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBGPService_LastUpdatedErrorSubCode() {
        return (EAttribute)getBGPService().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBGPService_BGPRoutingPolicy() {
        return (EReference)getBGPService().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBGPService_BGPAdminDistance() {
        return (EReference)getBGPService().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAutonomousSystem() {
		if (autonomousSystemEClass == null) {
			autonomousSystemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CimPackage.eNS_URI).getEClassifiers().get(4);
		}
		return autonomousSystemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAutonomousSystem_ASNumber() {
        return (EAttribute)getAutonomousSystem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAutonomousSystem_IsSingleHomed() {
        return (EAttribute)getAutonomousSystem().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAutonomousSystem_IsTransit() {
        return (EAttribute)getAutonomousSystem().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAutonomousSystem_RequireIGPSync() {
        return (EAttribute)getAutonomousSystem().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAutonomousSystem_RoutingUpdateSource() {
        return (EAttribute)getAutonomousSystem().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAutonomousSystem_AggregationType() {
        return (EAttribute)getAutonomousSystem().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAutonomousSystem_RouterInAS() {
        return (EReference)getAutonomousSystem().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAutonomousSystem_ASBGPEndpoints() {
        return (EReference)getAutonomousSystem().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAutonomousSystem_RoutingProtocolDomainInAS() {
        return (EReference)getAutonomousSystem().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNetwork() {
		if (networkEClass == null) {
			networkEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CimPackage.eNS_URI).getEClassifiers().get(5);
		}
		return networkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComputerSystem() {
		if (computerSystemEClass == null) {
			computerSystemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CimPackage.eNS_URI).getEClassifiers().get(6);
		}
		return computerSystemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComputerSystem_OtherIdentifyingInfo() {
        return (EAttribute)getComputerSystem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComputerSystem_IdentifyingDescriptions() {
        return (EAttribute)getComputerSystem().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComputerSystem_Dedicated() {
        return (EAttribute)getComputerSystem().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComputerSystem_OtherDedicatedDescriptions() {
        return (EAttribute)getComputerSystem().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComputerSystem_ResetCapability() {
        return (EAttribute)getComputerSystem().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComputerSystem_HostedRoutingServices() {
        return (EReference)getComputerSystem().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComputerSystem_HostedForwardingServices() {
        return (EReference)getComputerSystem().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComputerSystem_HostedRoutingPolicy() {
        return (EReference)getComputerSystem().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComputerSystem_HostedFilterList() {
        return (EReference)getComputerSystem().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComputerSystem_RunningOS() {
        return (EReference)getComputerSystem().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDirectory() {
		if (directoryEClass == null) {
			directoryEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CimPackage.eNS_URI).getEClassifiers().get(8);
		}
		return directoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLogicalFile() {
		if (logicalFileEClass == null) {
			logicalFileEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CimPackage.eNS_URI).getEClassifiers().get(9);
		}
		return logicalFileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLogicalFile_Filename() {
        return (EAttribute)getLogicalFile().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLogicalFile_FileSize() {
        return (EAttribute)getLogicalFile().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLogicalFile_CreationDate() {
        return (EAttribute)getLogicalFile().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnitaryComputerSystem() {
		if (unitaryComputerSystemEClass == null) {
			unitaryComputerSystemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CimPackage.eNS_URI).getEClassifiers().get(10);
		}
		return unitaryComputerSystemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAction() {
		if (actionEClass == null) {
			actionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CimPackage.eNS_URI).getEClassifiers().get(11);
		}
		return actionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArchitectureCheck() {
		if (architectureCheckEClass == null) {
			architectureCheckEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CimPackage.eNS_URI).getEClassifiers().get(12);
		}
		return architectureCheckEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApplicationSystem() {
		if (applicationSystemEClass == null) {
			applicationSystemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CimPackage.eNS_URI).getEClassifiers().get(13);
		}
		return applicationSystemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBIOSElement() {
		if (biosElementEClass == null) {
			biosElementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CimPackage.eNS_URI).getEClassifiers().get(14);
		}
		return biosElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBIOSFeature() {
		if (biosFeatureEClass == null) {
			biosFeatureEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CimPackage.eNS_URI).getEClassifiers().get(15);
		}
		return biosFeatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCheck() {
		if (checkEClass == null) {
			checkEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CimPackage.eNS_URI).getEClassifiers().get(16);
		}
		return checkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCheck_CheckID() {
        return (EAttribute)getCheck().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCheck_CheckMode() {
        return (EAttribute)getCheck().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCheck_Name() {
        return (EAttribute)getCheck().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCheck_SoftwareElementID() {
        return (EAttribute)getCheck().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCheck_SoftwareElementState() {
        return (EAttribute)getCheck().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCheck_TargetOperatingSystem() {
        return (EAttribute)getCheck().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCheck_Version() {
        return (EAttribute)getCheck().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCreateDirectoryAction() {
		if (createDirectoryActionEClass == null) {
			createDirectoryActionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CimPackage.eNS_URI).getEClassifiers().get(17);
		}
		return createDirectoryActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCopyFileAction() {
		if (copyFileActionEClass == null) {
			copyFileActionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CimPackage.eNS_URI).getEClassifiers().get(18);
		}
		return copyFileActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDirectoryAction() {
		if (directoryActionEClass == null) {
			directoryActionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CimPackage.eNS_URI).getEClassifiers().get(19);
		}
		return directoryActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDirectorySpecification() {
		if (directorySpecificationEClass == null) {
			directorySpecificationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CimPackage.eNS_URI).getEClassifiers().get(20);
		}
		return directorySpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDirectorySpecification_DirectorySpecificationFiles() {
        return (EReference)getDirectorySpecification().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiskSpaceCheck() {
		if (diskSpaceCheckEClass == null) {
			diskSpaceCheckEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CimPackage.eNS_URI).getEClassifiers().get(21);
		}
		return diskSpaceCheckEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExecuteProgram() {
		if (executeProgramEClass == null) {
			executeProgramEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CimPackage.eNS_URI).getEClassifiers().get(22);
		}
		return executeProgramEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFileAction() {
		if (fileActionEClass == null) {
			fileActionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CimPackage.eNS_URI).getEClassifiers().get(23);
		}
		return fileActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFileSpecification() {
		if (fileSpecificationEClass == null) {
			fileSpecificationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CimPackage.eNS_URI).getEClassifiers().get(24);
		}
		return fileSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFileSpecification_CheckSum() {
        return (EAttribute)getFileSpecification().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFileSpecification_CRC1() {
        return (EAttribute)getFileSpecification().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFileSpecification_CRC2() {
        return (EAttribute)getFileSpecification().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFileSpecification_CreateTimeStamp() {
        return (EAttribute)getFileSpecification().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFileSpecification_FileName() {
        return (EAttribute)getFileSpecification().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFileSpecification_FileSize() {
        return (EAttribute)getFileSpecification().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFileSpecification_MD5Checksum() {
        return (EAttribute)getFileSpecification().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstalledProduct() {
		if (installedProductEClass == null) {
			installedProductEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CimPackage.eNS_URI).getEClassifiers().get(25);
		}
		return installedProductEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstalledProduct_SoftwareElements() {
        return (EReference)getInstalledProduct().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMemoryCheck() {
		if (memoryCheckEClass == null) {
			memoryCheckEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CimPackage.eNS_URI).getEClassifiers().get(26);
		}
		return memoryCheckEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModifySettingAction() {
		if (modifySettingActionEClass == null) {
			modifySettingActionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CimPackage.eNS_URI).getEClassifiers().get(27);
		}
		return modifySettingActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperatingSystem() {
		if (operatingSystemEClass == null) {
			operatingSystemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CimPackage.eNS_URI).getEClassifiers().get(28);
		}
		return operatingSystemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperatingSystem_CreationClassName() {
        return (EAttribute)getOperatingSystem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperatingSystem_CSCreationClassName() {
        return (EAttribute)getOperatingSystem().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperatingSystem_CSName() {
        return (EAttribute)getOperatingSystem().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperatingSystem_OperatingSystemSoftwareFeature() {
        return (EReference)getOperatingSystem().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperatingSystem_OSType() {
        return (EAttribute)getOperatingSystem().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperatingSystem_OtherTypeDescription() {
        return (EAttribute)getOperatingSystem().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperatingSystem_Version() {
        return (EAttribute)getOperatingSystem().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOSVersionCheck() {
		if (osVersionCheckEClass == null) {
			osVersionCheckEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CimPackage.eNS_URI).getEClassifiers().get(29);
		}
		return osVersionCheckEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRebootAction() {
		if (rebootActionEClass == null) {
			rebootActionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CimPackage.eNS_URI).getEClassifiers().get(30);
		}
		return rebootActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRemoveFileAction() {
		if (removeFileActionEClass == null) {
			removeFileActionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CimPackage.eNS_URI).getEClassifiers().get(31);
		}
		return removeFileActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRemoveDirectoryAction() {
		if (removeDirectoryActionEClass == null) {
			removeDirectoryActionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CimPackage.eNS_URI).getEClassifiers().get(32);
		}
		return removeDirectoryActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSettingCheck() {
		if (settingCheckEClass == null) {
			settingCheckEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CimPackage.eNS_URI).getEClassifiers().get(33);
		}
		return settingCheckEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSoftwareElement() {
		if (softwareElementEClass == null) {
			softwareElementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CimPackage.eNS_URI).getEClassifiers().get(34);
		}
		return softwareElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSoftwareElement_SoftwareElementChecks() {
        return (EReference)getSoftwareElement().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSoftwareElement_SoftwareElementActions() {
        return (EReference)getSoftwareElement().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSoftwareElement_BuildNumber() {
        return (EAttribute)getSoftwareElement().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSoftwareElement_CodeSet() {
        return (EAttribute)getSoftwareElement().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSoftwareElement_IdentificationCode() {
        return (EAttribute)getSoftwareElement().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSoftwareElement_LanguageEdition() {
        return (EAttribute)getSoftwareElement().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSoftwareElement_Manufacturer() {
        return (EAttribute)getSoftwareElement().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSoftwareElement_OtherTargetOS() {
        return (EAttribute)getSoftwareElement().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSoftwareElement_SerialNumber() {
        return (EAttribute)getSoftwareElement().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSoftwareElement_SoftwareElementID() {
        return (EAttribute)getSoftwareElement().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSoftwareElement_SoftwareElementState() {
        return (EAttribute)getSoftwareElement().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSoftwareElement_TargetOperatingSystem() {
        return (EAttribute)getSoftwareElement().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSoftwareElement_Version() {
        return (EAttribute)getSoftwareElement().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSoftwareElementVersionCheck() {
		if (softwareElementVersionCheckEClass == null) {
			softwareElementVersionCheckEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CimPackage.eNS_URI).getEClassifiers().get(35);
		}
		return softwareElementVersionCheckEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSoftwareFeature() {
		if (softwareFeatureEClass == null) {
			softwareFeatureEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CimPackage.eNS_URI).getEClassifiers().get(36);
		}
		return softwareFeatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSwapSpaceCheck() {
		if (swapSpaceCheckEClass == null) {
			swapSpaceCheckEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CimPackage.eNS_URI).getEClassifiers().get(37);
		}
		return swapSpaceCheckEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVersionCompatibilityCheck() {
		if (versionCompatibilityCheckEClass == null) {
			versionCompatibilityCheckEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CimPackage.eNS_URI).getEClassifiers().get(38);
		}
		return versionCompatibilityCheckEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBufferPool() {
		if (bufferPoolEClass == null) {
			bufferPoolEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CimPackage.eNS_URI).getEClassifiers().get(40);
		}
		return bufferPoolEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnectivityMemberhipSettingData() {
		if (connectivityMemberhipSettingDataEClass == null) {
			connectivityMemberhipSettingDataEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CimPackage.eNS_URI).getEClassifiers().get(41);
		}
		return connectivityMemberhipSettingDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnectivityMemberhipSettingData_ConnectivityMembershipType() {
        return (EAttribute)getConnectivityMemberhipSettingData().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnectivityMemberhipSettingData_OtherConnectivityMembershipType() {
        return (EAttribute)getConnectivityMemberhipSettingData().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnectivityMemberhipSettingData_ConnectivityMembershipID() {
        return (EAttribute)getConnectivityMemberhipSettingData().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnectivityCollection() {
		if (connectivityCollectionEClass == null) {
			connectivityCollectionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CimPackage.eNS_URI).getEClassifiers().get(42);
		}
		return connectivityCollectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnectivityCollection_ConnectivityStatus() {
        return (EAttribute)getConnectivityCollection().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedAddressCollection() {
		if (namedAddressCollectionEClass == null) {
			namedAddressCollectionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CimPackage.eNS_URI).getEClassifiers().get(43);
		}
		return namedAddressCollectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedAddressCollection_CollectionAlias() {
        return (EAttribute)getNamedAddressCollection().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRangeOfIPAddresses() {
		if (rangeOfIPAddressesEClass == null) {
			rangeOfIPAddressesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CimPackage.eNS_URI).getEClassifiers().get(44);
		}
		return rangeOfIPAddressesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRangeOfIPAddresses_StartAddress() {
        return (EAttribute)getRangeOfIPAddresses().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRangeOfIPAddresses_EndAddress() {
        return (EAttribute)getRangeOfIPAddresses().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRangeOfIPAddresses_AddressType() {
        return (EAttribute)getRangeOfIPAddresses().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLANConnectivitySegment() {
		if (lanConnectivitySegmentEClass == null) {
			lanConnectivitySegmentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CimPackage.eNS_URI).getEClassifiers().get(45);
		}
		return lanConnectivitySegmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLANConnectivitySegment_LANID() {
        return (EAttribute)getLANConnectivitySegment().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLANConnectivitySegment_ConnectivityType() {
        return (EAttribute)getLANConnectivitySegment().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLANConnectivitySegment_OtherTypeDescription() {
        return (EAttribute)getLANConnectivitySegment().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIPConnectivitySubnet() {
		if (ipConnectivitySubnetEClass == null) {
			ipConnectivitySubnetEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CimPackage.eNS_URI).getEClassifiers().get(46);
		}
		return ipConnectivitySubnetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIPConnectivitySubnet_SubnetNumber() {
        return (EAttribute)getIPConnectivitySubnet().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIPConnectivitySubnet_SubnetMask() {
        return (EAttribute)getIPConnectivitySubnet().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIPConnectivitySubnet_PrefixLength() {
        return (EAttribute)getIPConnectivitySubnet().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIPConnectivitySubnet_AddressType() {
        return (EAttribute)getIPConnectivitySubnet().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIPXConnectivityNetwork() {
		if (ipxConnectivityNetworkEClass == null) {
			ipxConnectivityNetworkEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CimPackage.eNS_URI).getEClassifiers().get(47);
		}
		return ipxConnectivityNetworkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIPXConnectivityNetwork_NetworkNumber() {
        return (EAttribute)getIPXConnectivityNetwork().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIPAddressRange() {
		if (ipAddressRangeEClass == null) {
			ipAddressRangeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CimPackage.eNS_URI).getEClassifiers().get(48);
		}
		return ipAddressRangeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIPAddressRange_StartAddress() {
        return (EAttribute)getIPAddressRange().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIPAddressRange_EndAddress() {
        return (EAttribute)getIPAddressRange().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIPAddressRange_TypeOfAddress() {
        return (EAttribute)getIPAddressRange().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIPAddressRange_AllocationRange() {
        return (EAttribute)getIPAddressRange().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLogicalNetwork() {
		if (logicalNetworkEClass == null) {
			logicalNetworkEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CimPackage.eNS_URI).getEClassifiers().get(49);
		}
		return logicalNetworkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLogicalNetwork_CreationClassName() {
        return (EAttribute)getLogicalNetwork().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLogicalNetwork_Name() {
        return (EAttribute)getLogicalNetwork().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLogicalNetwork_NetworkType() {
        return (EAttribute)getLogicalNetwork().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLogicalNetwork_OtherTypeDescription() {
        return (EAttribute)getLogicalNetwork().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLogicalNetwork_InLogicalNetwork() {
        return (EReference)getLogicalNetwork().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLogicalNetwork_LogicalNetworkService() {
        return (EReference)getLogicalNetwork().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIPXNetwork() {
		if (ipxNetworkEClass == null) {
			ipxNetworkEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CimPackage.eNS_URI).getEClassifiers().get(50);
		}
		return ipxNetworkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIPXNetwork_NetworkNumber() {
        return (EAttribute)getIPXNetwork().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLANSegment() {
		if (lanSegmentEClass == null) {
			lanSegmentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CimPackage.eNS_URI).getEClassifiers().get(51);
		}
		return lanSegmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLANSegment_LANID() {
        return (EAttribute)getLANSegment().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLANSegment_LANType() {
        return (EAttribute)getLANSegment().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLANSegment_OtherLANType() {
        return (EAttribute)getLANSegment().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLANSegment_InSegment() {
        return (EReference)getLANSegment().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIPSubnet() {
		if (ipSubnetEClass == null) {
			ipSubnetEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CimPackage.eNS_URI).getEClassifiers().get(52);
		}
		return ipSubnetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIPSubnet_SubnetNumber() {
        return (EAttribute)getIPSubnet().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIPSubnet_SubnetMask() {
        return (EAttribute)getIPSubnet().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIPSubnet_PrefixLength() {
        return (EAttribute)getIPSubnet().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIPSubnet_AddressType() {
        return (EAttribute)getIPSubnet().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdminDomain() {
		if (adminDomainEClass == null) {
			adminDomainEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CimPackage.eNS_URI).getEClassifiers().get(54);
		}
		return adminDomainEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAdminDomain_ContainedDomain() {
        return (EReference)getAdminDomain().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAdminDomain_NetworksInAdminDomain() {
        return (EReference)getAdminDomain().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCapabilities() {
		if (capabilitiesEClass == null) {
			capabilitiesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CimPackage.eNS_URI).getEClassifiers().get(55);
		}
		return capabilitiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCapabilities_InstanceID() {
        return (EAttribute)getCapabilities().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCollection() {
		if (collectionEClass == null) {
			collectionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CimPackage.eNS_URI).getEClassifiers().get(56);
		}
		return collectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCollection_Members() {
        return (EReference)getCollection().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCollectionOfMSEs() {
		if (collectionOfMSEsEClass == null) {
			collectionOfMSEsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CimPackage.eNS_URI).getEClassifiers().get(57);
		}
		return collectionOfMSEsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollectionOfMSEs_CollectionId() {
        return (EAttribute)getCollectionOfMSEs().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElementSettingData() {
		if (elementSettingDataEClass == null) {
			elementSettingDataEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CimPackage.eNS_URI).getEClassifiers().get(58);
		}
		return elementSettingDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElementSettingData_IsCurrent() {
        return (EAttribute)getElementSettingData().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElementSettingData_IsDefault() {
        return (EAttribute)getElementSettingData().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElementSettingData_IsMaximum() {
        return (EAttribute)getElementSettingData().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElementSettingData_IsMinimum() {
        return (EAttribute)getElementSettingData().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElementSettingData_IsNext() {
        return (EAttribute)getElementSettingData().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElementSettingData_IsPending() {
        return (EAttribute)getElementSettingData().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementSettingData_SettingData() {
        return (EReference)getElementSettingData().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElementSoftwareIdentity() {
		if (elementSoftwareIdentityEClass == null) {
			elementSoftwareIdentityEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CimPackage.eNS_URI).getEClassifiers().get(59);
		}
		return elementSoftwareIdentityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElementSoftwareIdentity_ElementSoftwareStatus() {
        return (EAttribute)getElementSoftwareIdentity().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementSoftwareIdentity_ManagedElement() {
        return (EReference)getElementSoftwareIdentity().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElementSoftwareIdentity_OtherUpgradeCondition() {
        return (EAttribute)getElementSoftwareIdentity().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElementSoftwareIdentity_UpgradeCondition() {
        return (EAttribute)getElementSoftwareIdentity().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnabledLogicalElement() {
		if (enabledLogicalElementEClass == null) {
			enabledLogicalElementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CimPackage.eNS_URI).getEClassifiers().get(60);
		}
		return enabledLogicalElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnabledLogicalElement_EnabledDefault() {
        return (EAttribute)getEnabledLogicalElement().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnabledLogicalElement_EnabledState() {
        return (EAttribute)getEnabledLogicalElement().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnabledLogicalElement_OtherEnabledState() {
        return (EAttribute)getEnabledLogicalElement().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnabledLogicalElement_OverwritePolicy() {
        return (EAttribute)getEnabledLogicalElement().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnabledLogicalElement_RemoteAccessAvailableToElement() {
        return (EReference)getEnabledLogicalElement().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnabledLogicalElement_RequestedState() {
        return (EAttribute)getEnabledLogicalElement().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnabledLogicalElement_TimeOfLastStateChange() {
        return (EAttribute)getEnabledLogicalElement().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnabledLogicalElementCapabilities() {
		if (enabledLogicalElementCapabilitiesEClass == null) {
			enabledLogicalElementCapabilitiesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CimPackage.eNS_URI).getEClassifiers().get(61);
		}
		return enabledLogicalElementCapabilitiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnabledLogicalElementCapabilities_ElementNameEditSupported() {
        return (EAttribute)getEnabledLogicalElementCapabilities().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnabledLogicalElementCapabilities_MaxElementNameLen() {
        return (EAttribute)getEnabledLogicalElementCapabilities().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenericService() {
		if (genericServiceEClass == null) {
			genericServiceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CimPackage.eNS_URI).getEClassifiers().get(83);
		}
		return genericServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenericService_GenericProperties() {
        return (EAttribute)getGenericService().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLogicalDevice() {
		if (logicalDeviceEClass == null) {
			logicalDeviceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CimPackage.eNS_URI).getEClassifiers().get(84);
		}
		return logicalDeviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLogicalDevice_CreationClassName() {
        return (EAttribute)getLogicalDevice().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLogicalDevice_DeviceId() {
        return (EAttribute)getLogicalDevice().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLogicalDevice_PortOnDevice() {
        return (EReference)getLogicalDevice().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLogicalDevice_DeviceSAPImplementation() {
        return (EReference)getLogicalDevice().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLogicalDevice_SystemCreationClassName() {
        return (EAttribute)getLogicalDevice().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLogicalDevice_SystemName() {
        return (EAttribute)getLogicalDevice().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLogicalDevice_DeviceIdentity() {
        return (EReference)getLogicalDevice().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLogicalDevice_DeviceConnection() {
        return (EReference)getLogicalDevice().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLogicalElement() {
		if (logicalElementEClass == null) {
			logicalElementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CimPackage.eNS_URI).getEClassifiers().get(85);
		}
		return logicalElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getManagedElement() {
		if (managedElementEClass == null) {
			managedElementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CimPackage.eNS_URI).getEClassifiers().get(86);
		}
		return managedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getManagedElement_Caption() {
        return (EAttribute)getManagedElement().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getManagedElement_Description() {
        return (EAttribute)getManagedElement().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getManagedElement_ElementName() {
        return (EAttribute)getManagedElement().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getManagedElement_Components() {
        return (EReference)getManagedElement().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getManagedElement_Dependencies() {
        return (EReference)getManagedElement().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getManagedElement_ElementCapabilities() {
        return (EReference)getManagedElement().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getManagedElement_HostedDependency() {
        return (EReference)getManagedElement().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getManagedElement_ElementSettingData() {
        return (EReference)getManagedElement().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getManagedSystemElement() {
		if (managedSystemElementEClass == null) {
			managedSystemElementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CimPackage.eNS_URI).getEClassifiers().get(87);
		}
		return managedSystemElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getManagedSystemElement_HealthState() {
        return (EAttribute)getManagedSystemElement().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getManagedSystemElement_InstallDate() {
        return (EAttribute)getManagedSystemElement().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getManagedSystemElement_Name() {
        return (EAttribute)getManagedSystemElement().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getManagedSystemElement_OperationalStatus() {
        return (EAttribute)getManagedSystemElement().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getManagedSystemElement_StatusDescriptions() {
        return (EReference)getManagedSystemElement().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPhysicalElement() {
		if (physicalElementEClass == null) {
			physicalElementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CimPackage.eNS_URI).getEClassifiers().get(88);
		}
		return physicalElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhysicalElement_Tag() {
        return (EAttribute)getPhysicalElement().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhysicalElement_CreationclassName() {
        return (EAttribute)getPhysicalElement().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhysicalElement_Manufacturer() {
        return (EAttribute)getPhysicalElement().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhysicalElement_Model() {
        return (EAttribute)getPhysicalElement().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhysicalElement_SKU() {
        return (EAttribute)getPhysicalElement().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhysicalElement_SerialNumber() {
        return (EAttribute)getPhysicalElement().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhysicalElement_Version() {
        return (EAttribute)getPhysicalElement().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhysicalElement_PartNo() {
        return (EAttribute)getPhysicalElement().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhysicalElement_OtherIdentiyingInfo() {
        return (EAttribute)getPhysicalElement().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhysicalElement_PoweredOn() {
        return (EAttribute)getPhysicalElement().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhysicalElement_ManufactureDate() {
        return (EAttribute)getPhysicalElement().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhysicalElement_VendorEquipmentType() {
        return (EAttribute)getPhysicalElement().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhysicalElement_UserTracking() {
        return (EAttribute)getPhysicalElement().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhysicalElement_CanBeFRUed() {
        return (EAttribute)getPhysicalElement().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPowerManagementCapabilities() {
		if (powerManagementCapabilitiesEClass == null) {
			powerManagementCapabilitiesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CimPackage.eNS_URI).getEClassifiers().get(89);
		}
		return powerManagementCapabilitiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPowerManagementCapabilities_PowerCapabilities() {
        return (EAttribute)getPowerManagementCapabilities().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProduct() {
		if (productEClass == null) {
			productEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CimPackage.eNS_URI).getEClassifiers().get(90);
		}
		return productEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProduct_Family() {
        return (EAttribute)getProduct().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProduct_IdentifyingNumber() {
        return (EAttribute)getProduct().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProduct_Name() {
        return (EAttribute)getProduct().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProduct_SKUNumber() {
        return (EAttribute)getProduct().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProduct_ProductProductDependency() {
        return (EReference)getProduct().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProduct_ProductServiceComponent() {
        return (EReference)getProduct().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProduct_Vendor() {
        return (EAttribute)getProduct().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProduct_Version() {
        return (EAttribute)getProduct().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProduct_WarrantyDuration() {
        return (EAttribute)getProduct().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProduct_WarrantyStartDate() {
        return (EAttribute)getProduct().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProtocolEndpoint() {
		if (protocolEndpointEClass == null) {
			protocolEndpointEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CimPackage.eNS_URI).getEClassifiers().get(91);
		}
		return protocolEndpointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProtocolEndpoint_NameFormat() {
        return (EAttribute)getProtocolEndpoint().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProtocolEndpoint_OtherTypeDescription() {
        return (EAttribute)getProtocolEndpoint().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProtocolEndpoint_ProtocolIFType() {
        return (EAttribute)getProtocolEndpoint().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProtocolEndpoint_EgressConditioningServiceOnEndpoint() {
        return (EReference)getProtocolEndpoint().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProtocolEndpoint_IngressConditioningServiceOnEndpoint() {
        return (EReference)getProtocolEndpoint().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRemotePort() {
		if (remotePortEClass == null) {
			remotePortEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CimPackage.eNS_URI).getEClassifiers().get(92);
		}
		return remotePortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRemotePort_PortInfo() {
        return (EAttribute)getRemotePort().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRemotePort_PortProtocol() {
        return (EAttribute)getRemotePort().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRemotePort_OtherProtocolDescription() {
        return (EAttribute)getRemotePort().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRemoteServiceAccessPoint() {
		if (remoteServiceAccessPointEClass == null) {
			remoteServiceAccessPointEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CimPackage.eNS_URI).getEClassifiers().get(93);
		}
		return remoteServiceAccessPointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRemoteServiceAccessPoint_AccessInfo() {
        return (EAttribute)getRemoteServiceAccessPoint().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRemoteServiceAccessPoint_AccessContext() {
        return (EAttribute)getRemoteServiceAccessPoint().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRemoteServiceAccessPoint_InfoFormat() {
        return (EAttribute)getRemoteServiceAccessPoint().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRemoteServiceAccessPoint_OtherAccessContext() {
        return (EAttribute)getRemoteServiceAccessPoint().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRemoteServiceAccessPoint_OtherInfoFormatDescription() {
        return (EAttribute)getRemoteServiceAccessPoint().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRole() {
		if (roleEClass == null) {
			roleEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CimPackage.eNS_URI).getEClassifiers().get(94);
		}
		return roleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRole_Name() {
        return (EAttribute)getRole().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScopedSettingData() {
		if (scopedSettingDataEClass == null) {
			scopedSettingDataEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CimPackage.eNS_URI).getEClassifiers().get(95);
		}
		return scopedSettingDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getService() {
		if (serviceEClass == null) {
			serviceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CimPackage.eNS_URI).getEClassifiers().get(96);
		}
		return serviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getService_CreationClassName() {
        return (EAttribute)getService().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getService_PrimaryOwnerName() {
        return (EAttribute)getService().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getService_PrimaryOwnerContact() {
        return (EAttribute)getService().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getService_Started() {
        return (EAttribute)getService().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getService_ServiceComponents() {
        return (EReference)getService().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getService_ServiceServiceDependency() {
        return (EReference)getService().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getService_SoftwareElementServiceImplementation() {
        return (EReference)getService().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getService_SoftwareFeatureServiceImplementation() {
        return (EReference)getService().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getService_SystemCreationClassName() {
        return (EAttribute)getService().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getService_SystemName() {
        return (EAttribute)getService().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getService_ServiceAccessBySAP() {
        return (EReference)getService().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceAccessURI() {
		if (serviceAccessURIEClass == null) {
			serviceAccessURIEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CimPackage.eNS_URI).getEClassifiers().get(97);
		}
		return serviceAccessURIEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceAccessURI_LabeledURI() {
        return (EAttribute)getServiceAccessURI().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceAccessPoint() {
		if (serviceAccessPointEClass == null) {
			serviceAccessPointEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CimPackage.eNS_URI).getEClassifiers().get(98);
		}
		return serviceAccessPointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceAccessPoint_CreationClassName() {
        return (EAttribute)getServiceAccessPoint().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceAccessPoint_SystemCreationClassName() {
        return (EAttribute)getServiceAccessPoint().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceAccessPoint_SystemName() {
        return (EAttribute)getServiceAccessPoint().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceAccessPoint_BindsToLANEndpoint() {
        return (EReference)getServiceAccessPoint().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceAccessPoint_SAPSAPDependency() {
        return (EReference)getServiceAccessPoint().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceAccessPoint_BindsTo() {
        return (EReference)getServiceAccessPoint().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSettingData() {
		if (settingDataEClass == null) {
			settingDataEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CimPackage.eNS_URI).getEClassifiers().get(99);
		}
		return settingDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSettingData_ChangeableType() {
        return (EAttribute)getSettingData().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSettingData_ConfigurationName() {
        return (EAttribute)getSettingData().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSettingData_InstanceID() {
        return (EAttribute)getSettingData().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSettingData_SettingsDefineCapabilities() {
        return (EReference)getSettingData().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSoftwareIdentity() {
		if (softwareIdentityEClass == null) {
			softwareIdentityEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CimPackage.eNS_URI).getEClassifiers().get(100);
		}
		return softwareIdentityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSoftwareIdentity_BuildNumber() {
        return (EAttribute)getSoftwareIdentity().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSoftwareIdentity_ElementSoftwareIdentity() {
        return (EReference)getSoftwareIdentity().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSoftwareIdentity_ExtendedResourceType() {
        return (EAttribute)getSoftwareIdentity().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSoftwareIdentity_InstanceID() {
        return (EAttribute)getSoftwareIdentity().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSoftwareIdentity_IsEntity() {
        return (EAttribute)getSoftwareIdentity().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSoftwareIdentity_MajorVersion() {
        return (EAttribute)getSoftwareIdentity().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSoftwareIdentity_Manufacturer() {
        return (EAttribute)getSoftwareIdentity().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSoftwareIdentity_MinExtendedResourceTypeBuildNumber() {
        return (EAttribute)getSoftwareIdentity().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSoftwareIdentity_MinExtendedResourceTypeMajorVersion() {
        return (EAttribute)getSoftwareIdentity().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSoftwareIdentity_MinExtendedResourceTypeMinorVersion() {
        return (EAttribute)getSoftwareIdentity().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSoftwareIdentity_MinExtendedResourceTypeRevisionNumber() {
        return (EAttribute)getSoftwareIdentity().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSoftwareIdentity_MinorVersion() {
        return (EAttribute)getSoftwareIdentity().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSoftwareIdentity_OtherExtendedResourceTypeDescription() {
        return (EAttribute)getSoftwareIdentity().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSoftwareIdentity_ReleaseDate() {
        return (EAttribute)getSoftwareIdentity().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSoftwareIdentity_RevisionNumber() {
        return (EAttribute)getSoftwareIdentity().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSoftwareIdentity_SerialNumber() {
        return (EAttribute)getSoftwareIdentity().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSoftwareIdentity_VersionString() {
        return (EAttribute)getSoftwareIdentity().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSoftwareIdentity_ClassificationDescriptions() {
        return (EAttribute)getSoftwareIdentity().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSoftwareIdentity_IdentityInfoType() {
        return (EAttribute)getSoftwareIdentity().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSoftwareIdentity_IdentityInfoValue() {
        return (EAttribute)getSoftwareIdentity().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSoftwareIdentity_Languages() {
        return (EAttribute)getSoftwareIdentity().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSoftwareIdentity_TargetOperatingSystems() {
        return (EAttribute)getSoftwareIdentity().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSoftwareIdentity_TargetOSTypes() {
        return (EAttribute)getSoftwareIdentity().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSoftwareIdentity_TargetTypes() {
        return (EAttribute)getSoftwareIdentity().getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStatusDescription() {
		if (statusDescriptionEClass == null) {
			statusDescriptionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CimPackage.eNS_URI).getEClassifiers().get(101);
		}
		return statusDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStatusDescription_Description() {
        return (EAttribute)getStatusDescription().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSystem() {
		if (systemEClass == null) {
			systemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CimPackage.eNS_URI).getEClassifiers().get(102);
		}
		return systemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSystem_CreationClassName() {
        return (EAttribute)getSystem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystem_SystemDevices() {
        return (EReference)getSystem().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystem_SystemComponents() {
        return (EReference)getSystem().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSystem_NameFormat() {
        return (EAttribute)getSystem().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSystem_PrimaryOwnerName() {
        return (EAttribute)getSystem().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSystem_PrimaryOwnerContact() {
        return (EAttribute)getSystem().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystem_Roles() {
        return (EReference)getSystem().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystem_HostedServices() {
        return (EReference)getSystem().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystem_HostedRoute() {
        return (EReference)getSystem().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystem_HostedAccessPoint() {
        return (EReference)getSystem().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystem_HostedCollection() {
        return (EReference)getSystem().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSystemSpecificCollection() {
		if (systemSpecificCollectionEClass == null) {
			systemSpecificCollectionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CimPackage.eNS_URI).getEClassifiers().get(103);
		}
		return systemSpecificCollectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSystemSpecificCollection_InstanceID() {
        return (EAttribute)getSystemSpecificCollection().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStorageExtent() {
		if (storageExtentEClass == null) {
			storageExtentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CimPackage.eNS_URI).getEClassifiers().get(104);
		}
		return storageExtentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMemory() {
		if (memoryEClass == null) {
			memoryEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CimPackage.eNS_URI).getEClassifiers().get(105);
		}
		return memoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVolatileStorage() {
		if (volatileStorageEClass == null) {
			volatileStorageEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CimPackage.eNS_URI).getEClassifiers().get(106);
		}
		return volatileStorageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUSBDevice() {
		if (usbDeviceEClass == null) {
			usbDeviceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CimPackage.eNS_URI).getEClassifiers().get(107);
		}
		return usbDeviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUSBDevice_USBVersion() {
        return (EAttribute)getUSBDevice().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFilterList() {
		if (filterListEClass == null) {
			filterListEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CimPackage.eNS_URI).getEClassifiers().get(108);
		}
		return filterListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFilterList_CreationClassName() {
        return (EAttribute)getFilterList().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFilterList_Direction() {
        return (EAttribute)getFilterList().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFilterList_SystemCreationClassName() {
        return (EAttribute)getFilterList().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFilterList_SystemName() {
        return (EAttribute)getFilterList().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFilterEntryBase() {
		if (filterEntryBaseEClass == null) {
			filterEntryBaseEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CimPackage.eNS_URI).getEClassifiers().get(110);
		}
		return filterEntryBaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFilterEntryBase_IsNegated() {
        return (EAttribute)getFilterEntryBase().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFilterEntry() {
		if (filterEntryEClass == null) {
			filterEntryEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CimPackage.eNS_URI).getEClassifiers().get(113);
		}
		return filterEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFilterEntry_Action() {
        return (EAttribute)getFilterEntry().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFilterEntry_DefaultFilter() {
        return (EAttribute)getFilterEntry().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFilterEntry_MatchConditionType() {
        return (EAttribute)getFilterEntry().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFilterEntry_MatchConditionValue() {
        return (EAttribute)getFilterEntry().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFilterEntry_OtherMatchConditionType() {
        return (EAttribute)getFilterEntry().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFilterEntry_OtherTrafficType() {
        return (EAttribute)getFilterEntry().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFilterEntry_TrafficClass() {
        return (EAttribute)getFilterEntry().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFilterEntry_TrafficType() {
        return (EAttribute)getFilterEntry().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIPHeadersFilter() {
		if (ipHeadersFilterEClass == null) {
			ipHeadersFilterEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CimPackage.eNS_URI).getEClassifiers().get(115);
		}
		return ipHeadersFilterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIPHeadersFilter_HdrDestPortEnd() {
        return (EAttribute)getIPHeadersFilter().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIPHeadersFilter_HdrDestPortStart() {
        return (EAttribute)getIPHeadersFilter().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIPHeadersFilter_HdrIPVersion() {
        return (EAttribute)getIPHeadersFilter().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIPHeadersFilter_HdrProtocolID() {
        return (EAttribute)getIPHeadersFilter().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIPHeadersFilter_HdrSrcPortEnd() {
        return (EAttribute)getIPHeadersFilter().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIPHeadersFilter_HdrSrcPortStart() {
        return (EAttribute)getIPHeadersFilter().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIPHeadersFilter_HdrDestAddress() {
        return (EAttribute)getIPHeadersFilter().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIPHeadersFilter_HdrDestAddressEndOfRange() {
        return (EAttribute)getIPHeadersFilter().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIPHeadersFilter_HdrDestMask() {
        return (EAttribute)getIPHeadersFilter().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIPHeadersFilter_HdrDSCP() {
        return (EAttribute)getIPHeadersFilter().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIPHeadersFilter_HdrFlowLabel() {
        return (EAttribute)getIPHeadersFilter().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIPHeadersFilter_HdrSrcAddressEndOfRange() {
        return (EAttribute)getIPHeadersFilter().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIPHeadersFilter_HdrSrcMask() {
        return (EAttribute)getIPHeadersFilter().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEthernetPort() {
		if (ethernetPortEClass == null) {
			ethernetPortEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CimPackage.eNS_URI).getEClassifiers().get(122);
		}
		return ethernetPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEthernetPort_MaxDataSize() {
        return (EAttribute)getEthernetPort().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEthernetPort_Capabilities() {
        return (EAttribute)getEthernetPort().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEthernetPort_CapabilityDescriptions() {
        return (EAttribute)getEthernetPort().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEthernetPort_EnabledCapabilities() {
        return (EAttribute)getEthernetPort().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEthernetPort_OtherEnabledCapabilities() {
        return (EAttribute)getEthernetPort().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLogicalModule() {
		if (logicalModuleEClass == null) {
			logicalModuleEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CimPackage.eNS_URI).getEClassifiers().get(123);
		}
		return logicalModuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLogicalModule_ModuleNumber() {
        return (EAttribute)getLogicalModule().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLogicalModule_LogicalModuleType() {
        return (EAttribute)getLogicalModule().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLogicalModule_OtherLogicalModuleTypeDescription() {
        return (EAttribute)getLogicalModule().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLogicalModule_ModulePort() {
        return (EReference)getLogicalModule().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLogicalPort() {
		if (logicalPortEClass == null) {
			logicalPortEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CimPackage.eNS_URI).getEClassifiers().get(124);
		}
		return logicalPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLogicalPort_Speed() {
        return (EAttribute)getLogicalPort().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLogicalPort_MaxSpeed() {
        return (EAttribute)getLogicalPort().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLogicalPort_RequestedSpeed() {
        return (EAttribute)getLogicalPort().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLogicalPort_UsageRestriction() {
        return (EAttribute)getLogicalPort().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLogicalPort_PortType() {
        return (EAttribute)getLogicalPort().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLogicalPort_OtherPortType() {
        return (EAttribute)getLogicalPort().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLogicalPort_PortImplementsEndPoint() {
        return (EReference)getLogicalPort().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNetworkPort() {
		if (networkPortEClass == null) {
			networkPortEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CimPackage.eNS_URI).getEClassifiers().get(125);
		}
		return networkPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNetworkPort_PortNumber() {
        return (EAttribute)getNetworkPort().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNetworkPort_LinkTechnology() {
        return (EAttribute)getNetworkPort().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNetworkPort_OtherLinktechnology() {
        return (EAttribute)getNetworkPort().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNetworkPort_NetworkAddresses() {
        return (EAttribute)getNetworkPort().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNetworkPort_FullDuplex() {
        return (EAttribute)getNetworkPort().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNetworkPort_AutoSense() {
        return (EAttribute)getNetworkPort().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNetworkPort_SupportedMaximumTransmissionUnit() {
        return (EAttribute)getNetworkPort().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNetworkPort_PermanentAddress() {
        return (EAttribute)getNetworkPort().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNetworkPort_ActiveMaximumTransmissionUnit() {
        return (EAttribute)getNetworkPort().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUSBPort() {
		if (usbPortEClass == null) {
			usbPortEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CimPackage.eNS_URI).getEClassifiers().get(126);
		}
		return usbPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUSBPort_Availability() {
        return (EAttribute)getUSBPort().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUSBPort_StatusInfo() {
        return (EAttribute)getUSBPort().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUSBPort_Suspended() {
        return (EAttribute)getUSBPort().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWirelessPort() {
		if (wirelessPortEClass == null) {
			wirelessPortEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CimPackage.eNS_URI).getEClassifiers().get(127);
		}
		return wirelessPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWirelessPort_SignalStrength() {
        return (EAttribute)getWirelessPort().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWiFiPort() {
		if (wiFiPortEClass == null) {
			wiFiPortEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CimPackage.eNS_URI).getEClassifiers().get(128);
		}
		return wiFiPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getADSLModem() {
		if (adslModemEClass == null) {
			adslModemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CimPackage.eNS_URI).getEClassifiers().get(129);
		}
		return adslModemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getADSLModem_LineAttenuation() {
        return (EAttribute)getADSLModem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getADSLModem_LineState() {
        return (EAttribute)getADSLModem().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getADSLModem_MaxDataRate() {
        return (EAttribute)getADSLModem().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getADSLModem_NoiseMargin() {
        return (EAttribute)getADSLModem().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getADSLModem_TotalOutputPower() {
        return (EAttribute)getADSLModem().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCableModem() {
		if (cableModemEClass == null) {
			cableModemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CimPackage.eNS_URI).getEClassifiers().get(130);
		}
		return cableModemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCallBasedModem() {
		if (callBasedModemEClass == null) {
			callBasedModemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CimPackage.eNS_URI).getEClassifiers().get(131);
		}
		return callBasedModemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCallBasedModem_CallSpeed() {
        return (EAttribute)getCallBasedModem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCallBasedModem_ModulationScheme() {
        return (EAttribute)getCallBasedModem().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCallBasedModem_NumberDialed() {
        return (EAttribute)getCallBasedModem().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCallBasedModem_OtherModulationDescription() {
        return (EAttribute)getCallBasedModem().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCallBasedModem_ModulationSupported() {
        return (EAttribute)getCallBasedModem().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnectionBasedModem() {
		if (connectionBasedModemEClass == null) {
			connectionBasedModemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CimPackage.eNS_URI).getEClassifiers().get(132);
		}
		return connectionBasedModemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnectionBasedModem_VendorId() {
        return (EAttribute)getConnectionBasedModem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDSLModem() {
		if (dslModemEClass == null) {
			dslModemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CimPackage.eNS_URI).getEClassifiers().get(133);
		}
		return dslModemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getISDNModem() {
		if (isdnModemEClass == null) {
			isdnModemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CimPackage.eNS_URI).getEClassifiers().get(136);
		}
		return isdnModemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModem() {
		if (modemEClass == null) {
			modemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CimPackage.eNS_URI).getEClassifiers().get(137);
		}
		return modemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHDSLModem() {
		if (hdslModemEClass == null) {
			hdslModemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CimPackage.eNS_URI).getEClassifiers().get(138);
		}
		return hdslModemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSDSLModem() {
		if (sdslModemEClass == null) {
			sdslModemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CimPackage.eNS_URI).getEClassifiers().get(139);
		}
		return sdslModemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVDSLModem() {
		if (vdslModemEClass == null) {
			vdslModemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CimPackage.eNS_URI).getEClassifiers().get(140);
		}
		return vdslModemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPOTSModem() {
		if (potsModemEClass == null) {
			potsModemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CimPackage.eNS_URI).getEClassifiers().get(141);
		}
		return potsModemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUniModem() {
		if (uniModemEClass == null) {
			uniModemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CimPackage.eNS_URI).getEClassifiers().get(142);
		}
		return uniModemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReplacementSet() {
		if (replacementSetEClass == null) {
			replacementSetEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CimPackage.eNS_URI).getEClassifiers().get(143);
		}
		return replacementSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPhysicalCapcacity() {
		if (physicalCapcacityEClass == null) {
			physicalCapcacityEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CimPackage.eNS_URI).getEClassifiers().get(144);
		}
		return physicalCapcacityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhysicalCapcacity_Name() {
        return (EAttribute)getPhysicalCapcacity().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMemoryCapacity() {
		if (memoryCapacityEClass == null) {
			memoryCapacityEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CimPackage.eNS_URI).getEClassifiers().get(145);
		}
		return memoryCapacityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLANEndpoint() {
		if (lanEndpointEClass == null) {
			lanEndpointEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CimPackage.eNS_URI).getEClassifiers().get(146);
		}
		return lanEndpointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLANEndpoint_LANID() {
        return (EAttribute)getLANEndpoint().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLANEndpoint_LANType() {
        return (EAttribute)getLANEndpoint().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLANEndpoint_OtherLANType() {
        return (EAttribute)getLANEndpoint().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLANEndpoint_MACAddress() {
        return (EAttribute)getLANEndpoint().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLANEndpoint_AliasAddress() {
        return (EAttribute)getLANEndpoint().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLANEndpoint_GroupAddresses() {
        return (EAttribute)getLANEndpoint().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLANEndpoint_MaxDataSize() {
        return (EAttribute)getLANEndpoint().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOSPFProtocolEndpointBase() {
		if (ospfProtocolEndpointBaseEClass == null) {
			ospfProtocolEndpointBaseEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CimPackage.eNS_URI).getEClassifiers().get(147);
		}
		return ospfProtocolEndpointBaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOSPFProtocolEndpointBase_TransitDelay() {
        return (EAttribute)getOSPFProtocolEndpointBase().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOSPFProtocolEndpointBase_RetransmitInterval() {
        return (EAttribute)getOSPFProtocolEndpointBase().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOSPFProtocolEndpointBase_AuthType() {
        return (EAttribute)getOSPFProtocolEndpointBase().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOSPFProtocolEndpointBase_OtherAuthType() {
        return (EAttribute)getOSPFProtocolEndpointBase().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOSPFProtocolEndpointBase_AuthKey() {
        return (EAttribute)getOSPFProtocolEndpointBase().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOSPFVirtualInterface() {
		if (ospfVirtualInterfaceEClass == null) {
			ospfVirtualInterfaceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CimPackage.eNS_URI).getEClassifiers().get(148);
		}
		return ospfVirtualInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOSPFProtocolEndpoint() {
		if (ospfProtocolEndpointEClass == null) {
			ospfProtocolEndpointEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CimPackage.eNS_URI).getEClassifiers().get(149);
		}
		return ospfProtocolEndpointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOSPFProtocolEndpoint_Priority() {
        return (EAttribute)getOSPFProtocolEndpoint().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOSPFProtocolEndpoint_PollInterval() {
        return (EAttribute)getOSPFProtocolEndpoint().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOSPFProtocolEndpoint_Cost() {
        return (EAttribute)getOSPFProtocolEndpoint().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOSPFProtocolEndpoint_IfDemand() {
        return (EAttribute)getOSPFProtocolEndpoint().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBGPProtocolEndpoint() {
		if (bgpProtocolEndpointEClass == null) {
			bgpProtocolEndpointEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CimPackage.eNS_URI).getEClassifiers().get(150);
		}
		return bgpProtocolEndpointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBGPProtocolEndpoint_IsEBGP() {
        return (EAttribute)getBGPProtocolEndpoint().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBGPProtocolEndpoint_IsEBGPMultihop() {
        return (EAttribute)getBGPProtocolEndpoint().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBGPProtocolEndpoint_LocalIdentifier() {
        return (EAttribute)getBGPProtocolEndpoint().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBGPProtocolEndpoint_PerrIdentifier() {
        return (EAttribute)getBGPProtocolEndpoint().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBGPProtocolEndpoint_State() {
        return (EAttribute)getBGPProtocolEndpoint().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBGPProtocolEndpoint_AdminStatus() {
        return (EAttribute)getBGPProtocolEndpoint().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBGPProtocolEndpoint_NegotiatedVersion() {
        return (EAttribute)getBGPProtocolEndpoint().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBGPProtocolEndpoint_LocalAddress() {
        return (EAttribute)getBGPProtocolEndpoint().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBGPProtocolEndpoint_LocalPort() {
        return (EAttribute)getBGPProtocolEndpoint().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBGPProtocolEndpoint_RemoteAddress() {
        return (EAttribute)getBGPProtocolEndpoint().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBGPProtocolEndpoint_RemotePort() {
        return (EAttribute)getBGPProtocolEndpoint().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBGPProtocolEndpoint_RemoteAS() {
        return (EAttribute)getBGPProtocolEndpoint().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBGPProtocolEndpoint_ConnectRetryInterval() {
        return (EAttribute)getBGPProtocolEndpoint().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBGPProtocolEndpoint_HoldTimeConfigured() {
        return (EAttribute)getBGPProtocolEndpoint().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBGPProtocolEndpoint_KeepAliveConfigured() {
        return (EAttribute)getBGPProtocolEndpoint().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBGPProtocolEndpoint_MinASOriginationInterval() {
        return (EAttribute)getBGPProtocolEndpoint().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBGPProtocolEndpoint_MinRouteAdvertisementInterval() {
        return (EAttribute)getBGPProtocolEndpoint().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBGPProtocolEndpoint_HoldTime() {
        return (EAttribute)getBGPProtocolEndpoint().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBGPProtocolEndpoint_KeepAlive() {
        return (EAttribute)getBGPProtocolEndpoint().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIPProtocolEndpoint() {
		if (ipProtocolEndpointEClass == null) {
			ipProtocolEndpointEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CimPackage.eNS_URI).getEClassifiers().get(151);
		}
		return ipProtocolEndpointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIPProtocolEndpoint_AddressOrigin() {
        return (EAttribute)getIPProtocolEndpoint().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIPProtocolEndpoint_IPv4Address() {
        return (EAttribute)getIPProtocolEndpoint().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIPProtocolEndpoint_SubnetMask() {
        return (EAttribute)getIPProtocolEndpoint().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIPProtocolEndpoint_IPv6Address() {
        return (EAttribute)getIPProtocolEndpoint().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIPProtocolEndpoint_PrefixLength() {
        return (EAttribute)getIPProtocolEndpoint().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIPXProtocolEndpoint() {
		if (ipxProtocolEndpointEClass == null) {
			ipxProtocolEndpointEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CimPackage.eNS_URI).getEClassifiers().get(153);
		}
		return ipxProtocolEndpointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIPXProtocolEndpoint_Address() {
        return (EAttribute)getIPXProtocolEndpoint().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMPLSProtocolEndpoint() {
		if (mplsProtocolEndpointEClass == null) {
			mplsProtocolEndpointEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CimPackage.eNS_URI).getEClassifiers().get(154);
		}
		return mplsProtocolEndpointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMPLSProtocolEndpoint_OverruleLSR() {
        return (EAttribute)getMPLSProtocolEndpoint().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMPLSProtocolEndpoint_TotalBandwidth() {
        return (EAttribute)getMPLSProtocolEndpoint().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMPLSProtocolEndpoint_AvailableBandwidth() {
        return (EAttribute)getMPLSProtocolEndpoint().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMPLSProtocolEndpoint_ResourceClasses() {
        return (EAttribute)getMPLSProtocolEndpoint().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSwitchPort() {
		if (switchPortEClass == null) {
			switchPortEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CimPackage.eNS_URI).getEClassifiers().get(155);
		}
		return switchPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSwitchPort_PortNumber() {
        return (EAttribute)getSwitchPort().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTCPProtocolEndpoint() {
		if (tcpProtocolEndpointEClass == null) {
			tcpProtocolEndpointEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CimPackage.eNS_URI).getEClassifiers().get(156);
		}
		return tcpProtocolEndpointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTCPProtocolEndpoint_PortNumber() {
        return (EAttribute)getTCPProtocolEndpoint().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUDPProtocolEndpoint() {
		if (udpProtocolEndpointEClass == null) {
			udpProtocolEndpointEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CimPackage.eNS_URI).getEClassifiers().get(157);
		}
		return udpProtocolEndpointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUDPProtocolEndpoint_PortNumber() {
        return (EAttribute)getUDPProtocolEndpoint().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCLPSettingData() {
		if (clpSettingDataEClass == null) {
			clpSettingDataEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CimPackage.eNS_URI).getEClassifiers().get(158);
		}
		return clpSettingDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCLPSettingData_CurrentDefaultTarget() {
        return (EAttribute)getCLPSettingData().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCLPSettingData_KeepTime() {
        return (EAttribute)getCLPSettingData().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCLPSettingData_WaitBehaviour() {
        return (EAttribute)getCLPSettingData().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCLPSettingData_OutputFormat() {
        return (EAttribute)getCLPSettingData().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCLPSettingData_OutputVerbosity() {
        return (EAttribute)getCLPSettingData().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCLPSettingData_OutputLanguage() {
        return (EAttribute)getCLPSettingData().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCLPSettingData_OutputPosition() {
        return (EAttribute)getCLPSettingData().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCLPSettingData_OutputOrder() {
        return (EAttribute)getCLPSettingData().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCLPSettingData_OutputCount() {
        return (EAttribute)getCLPSettingData().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCLPSettingData_DisplayOption() {
        return (EAttribute)getCLPSettingData().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTelnetSettingData() {
		if (telnetSettingDataEClass == null) {
			telnetSettingDataEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CimPackage.eNS_URI).getEClassifiers().get(159);
		}
		return telnetSettingDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTelnetSettingData_EnabledTerminalModes() {
        return (EAttribute)getTelnetSettingData().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTelnetSettingData_OtherEnabledTerminalMode() {
        return (EAttribute)getTelnetSettingData().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTelnetSettingData_TerminalMode() {
        return (EAttribute)getTelnetSettingData().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTelnetSettingData_OtherTerminalMode() {
        return (EAttribute)getTelnetSettingData().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTelnetSettingData_EnabledCharacterDisplayModes() {
        return (EAttribute)getTelnetSettingData().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTelnetSettingData_OtherEnabledCharacterDisplayMode() {
        return (EAttribute)getTelnetSettingData().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTelnetSettingData_CharacterDisplayMode() {
        return (EAttribute)getTelnetSettingData().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTelnetSettingData_OtherCharacterDisplayMode() {
        return (EAttribute)getTelnetSettingData().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTelnetSettingData_EscapeCharacter() {
        return (EAttribute)getTelnetSettingData().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTelnetSettingData_IdleTimeout() {
        return (EAttribute)getTelnetSettingData().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSSHSettingData() {
		if (sshSettingDataEClass == null) {
			sshSettingDataEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CimPackage.eNS_URI).getEClassifiers().get(160);
		}
		return sshSettingDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSSHSettingData_EnabledSSHVersions() {
        return (EAttribute)getSSHSettingData().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSSHSettingData_OtherEnabledSSHVersion() {
        return (EAttribute)getSSHSettingData().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSSHSettingData_SSHVersion() {
        return (EAttribute)getSSHSettingData().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSSHSettingData_EnabledEncryptionAlgorithms() {
        return (EAttribute)getSSHSettingData().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSSHSettingData_OtherEnabledEncryptionAlgorithm() {
        return (EAttribute)getSSHSettingData().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSSHSettingData_IdleTimeout() {
        return (EAttribute)getSSHSettingData().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSSHSettingData_KeepAlive() {
        return (EAttribute)getSSHSettingData().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSSHSettingData_ForwardX11() {
        return (EAttribute)getSSHSettingData().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSSHSettingData_Compression() {
        return (EAttribute)getSSHSettingData().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDHCPCapabilities() {
		if (dhcpCapabilitiesEClass == null) {
			dhcpCapabilitiesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CimPackage.eNS_URI).getEClassifiers().get(161);
		}
		return dhcpCapabilitiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDHCPCapabilities_OptionsSupported() {
        return (EAttribute)getDHCPCapabilities().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDHCPProtocolEndpoint() {
		if (dhcpProtocolEndpointEClass == null) {
			dhcpProtocolEndpointEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CimPackage.eNS_URI).getEClassifiers().get(162);
		}
		return dhcpProtocolEndpointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTelnetProtocolEndpoint() {
		if (telnetProtocolEndpointEClass == null) {
			telnetProtocolEndpointEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CimPackage.eNS_URI).getEClassifiers().get(163);
		}
		return telnetProtocolEndpointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTelnetProtocolEndpoint_CharacterDisplayMode() {
        return (EAttribute)getTelnetProtocolEndpoint().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTelnetProtocolEndpoint_EscapeCharacter() {
        return (EAttribute)getTelnetProtocolEndpoint().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTelnetProtocolEndpoint_IdleTimeout() {
        return (EAttribute)getTelnetProtocolEndpoint().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTelnetProtocolEndpoint_OtherCharacterDisplayMode() {
        return (EAttribute)getTelnetProtocolEndpoint().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTelnetProtocolEndpoint_OtherEnabledCharacterDisplayMode() {
        return (EAttribute)getTelnetProtocolEndpoint().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTelnetProtocolEndpoint_OtherEnabledTerminalMode() {
        return (EAttribute)getTelnetProtocolEndpoint().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTelnetProtocolEndpoint_OtherTerminalMode() {
        return (EAttribute)getTelnetProtocolEndpoint().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTelnetProtocolEndpoint_TerminalMode() {
        return (EAttribute)getTelnetProtocolEndpoint().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTelnetProtocolEndpoint_EnabledCharacterDisplayModes() {
        return (EAttribute)getTelnetProtocolEndpoint().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTelnetProtocolEndpoint_EnabledTerminalModes() {
        return (EAttribute)getTelnetProtocolEndpoint().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDNSProtocolEndpoint() {
		if (dnsProtocolEndpointEClass == null) {
			dnsProtocolEndpointEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CimPackage.eNS_URI).getEClassifiers().get(166);
		}
		return dnsProtocolEndpointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDNSProtocolEndpoint_AppendParentSuffixes() {
        return (EAttribute)getDNSProtocolEndpoint().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDNSProtocolEndpoint_AppendPrimarySuffixes() {
        return (EAttribute)getDNSProtocolEndpoint().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDNSProtocolEndpoint_DomainName() {
        return (EAttribute)getDNSProtocolEndpoint().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDNSProtocolEndpoint_Hostname() {
        return (EAttribute)getDNSProtocolEndpoint().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDNSProtocolEndpoint_RegisterThisConnectionsAddress() {
        return (EAttribute)getDNSProtocolEndpoint().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDNSProtocolEndpoint_UseSuffixWhenRegistering() {
        return (EAttribute)getDNSProtocolEndpoint().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDNSProtocolEndpoint_DHCPOptionsToUse() {
        return (EAttribute)getDNSProtocolEndpoint().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDNSProtocolEndpoint_DNSSuffixesToAppend() {
        return (EAttribute)getDNSProtocolEndpoint().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDNSSettingData() {
		if (dnsSettingDataEClass == null) {
			dnsSettingDataEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CimPackage.eNS_URI).getEClassifiers().get(168);
		}
		return dnsSettingDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDNSSettingData_DNSServerAddresses() {
        return (EAttribute)getDNSSettingData().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIPAssignmentSettingData() {
		if (ipAssignmentSettingDataEClass == null) {
			ipAssignmentSettingDataEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CimPackage.eNS_URI).getEClassifiers().get(169);
		}
		return ipAssignmentSettingDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIPAssignmentSettingData_AddressOrigin() {
        return (EAttribute)getIPAssignmentSettingData().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWirelessLANEndpoint() {
		if (wirelessLANEndpointEClass == null) {
			wirelessLANEndpointEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CimPackage.eNS_URI).getEClassifiers().get(170);
		}
		return wirelessLANEndpointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWirelessLANEndpoint_SSID() {
        return (EAttribute)getWirelessLANEndpoint().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWirelessLANEndpoint_WEPEnabled() {
        return (EAttribute)getWirelessLANEndpoint().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWirelessLANEndpoint_WEPKeyMixEnabled() {
        return (EAttribute)getWirelessLANEndpoint().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWiFiEndPoint() {
		if (wiFiEndPointEClass == null) {
			wiFiEndPointEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CimPackage.eNS_URI).getEClassifiers().get(171);
		}
		return wiFiEndPointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWiFiEndpointSettings() {
		if (wiFiEndpointSettingsEClass == null) {
			wiFiEndpointSettingsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CimPackage.eNS_URI).getEClassifiers().get(172);
		}
		return wiFiEndpointSettingsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWiFiEndpointSettings_AuthenticationMethod() {
        return (EAttribute)getWiFiEndpointSettings().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWiFiEndpointSettings_BSSType() {
        return (EAttribute)getWiFiEndpointSettings().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWiFiEndpointSettings_EncryptionMethod() {
        return (EAttribute)getWiFiEndpointSettings().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWiFiEndpointSettings_KeyIndex() {
        return (EAttribute)getWiFiEndpointSettings().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWiFiEndpointSettings_OtherAuthenticationMethod() {
        return (EAttribute)getWiFiEndpointSettings().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWiFiEndpointSettings_OtherEncryptionMethod() {
        return (EAttribute)getWiFiEndpointSettings().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWiFiEndpointSettings_Priority() {
        return (EAttribute)getWiFiEndpointSettings().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWiFiEndpointSettings_PSKPassPhrase() {
        return (EAttribute)getWiFiEndpointSettings().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWiFiEndpointSettings_SSID() {
        return (EAttribute)getWiFiEndpointSettings().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWiFiEndpointSettings_Keys() {
        return (EAttribute)getWiFiEndpointSettings().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWiFiEndpointSettings_PSKValue() {
        return (EAttribute)getWiFiEndpointSettings().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProtocolService() {
		if (protocolServiceEClass == null) {
			protocolServiceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CimPackage.eNS_URI).getEClassifiers().get(176);
		}
		return protocolServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProtocolService_MaxConnections() {
        return (EAttribute)getProtocolService().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProtocolService_OtherProtocol() {
        return (EAttribute)getProtocolService().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProtocolService_Protocol() {
        return (EAttribute)getProtocolService().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConditioningService() {
		if (conditioningServiceEClass == null) {
			conditioningServiceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CimPackage.eNS_URI).getEClassifiers().get(179);
		}
		return conditioningServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConditioningService_Enabled() {
        return (EAttribute)getConditioningService().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQoSService() {
		if (qoSServiceEClass == null) {
			qoSServiceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CimPackage.eNS_URI).getEClassifiers().get(180);
		}
		return qoSServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQoSService_QoSSubService() {
        return (EReference)getQoSService().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQoSService_QoSConditioningSubService() {
        return (EReference)getQoSService().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrecedenceService() {
		if (precedenceServiceEClass == null) {
			precedenceServiceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CimPackage.eNS_URI).getEClassifiers().get(181);
		}
		return precedenceServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrecedenceService_PrecedenceValue() {
        return (EAttribute)getPrecedenceService().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiffServService() {
		if (diffServServiceEClass == null) {
			diffServServiceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CimPackage.eNS_URI).getEClassifiers().get(182);
		}
		return diffServServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffServService_DSCP() {
        return (EAttribute)getDiffServService().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffServService_PHBID() {
        return (EAttribute)getDiffServService().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEFService() {
		if (efServiceEClass == null) {
			efServiceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CimPackage.eNS_URI).getEClassifiers().get(183);
		}
		return efServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAFService() {
		if (afServiceEClass == null) {
			afServiceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CimPackage.eNS_URI).getEClassifiers().get(184);
		}
		return afServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAFService_ClassNumber() {
        return (EAttribute)getAFService().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAFService_DropperNumber() {
        return (EAttribute)getAFService().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAFService_AFRelatedServices() {
        return (EReference)getAFService().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHdr8021PService() {
		if (hdr8021PServiceEClass == null) {
			hdr8021PServiceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CimPackage.eNS_URI).getEClassifiers().get(185);
		}
		return hdr8021PServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHdr8021PService_PriorityValue() {
        return (EAttribute)getHdr8021PService().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDropThresholdCalculationService() {
		if (dropThresholdCalculationServiceEClass == null) {
			dropThresholdCalculationServiceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CimPackage.eNS_URI).getEClassifiers().get(186);
		}
		return dropThresholdCalculationServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDropThresholdCalculationService_SmoothingWeight() {
        return (EAttribute)getDropThresholdCalculationService().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDropThresholdCalculationService_TimeInterval() {
        return (EAttribute)getDropThresholdCalculationService().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFlowService() {
		if (flowServiceEClass == null) {
			flowServiceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CimPackage.eNS_URI).getEClassifiers().get(187);
		}
		return flowServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFlowService_FlowID() {
        return (EAttribute)getFlowService().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNextHopRoute() {
		if (nextHopRouteEClass == null) {
			nextHopRouteEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CimPackage.eNS_URI).getEClassifiers().get(188);
		}
		return nextHopRouteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNextHopRoute_InstanceID() {
        return (EAttribute)getNextHopRoute().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNextHopRoute_DestinationAddress() {
        return (EAttribute)getNextHopRoute().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNextHopRoute_AdminDistance() {
        return (EAttribute)getNextHopRoute().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNextHopRoute_RouteMetric() {
        return (EAttribute)getNextHopRoute().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNextHopRoute_IsStatic() {
        return (EAttribute)getNextHopRoute().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNextHopRoute_TypeOfRoute() {
        return (EAttribute)getNextHopRoute().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNextHopRoute_RouteUsesEndpoint() {
        return (EReference)getNextHopRoute().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNextHopRoute_AssociatedNextHop() {
        return (EReference)getNextHopRoute().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNextHopIPRoute() {
		if (nextHopIPRouteEClass == null) {
			nextHopIPRouteEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CimPackage.eNS_URI).getEClassifiers().get(189);
		}
		return nextHopIPRouteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNextHopIPRoute_RouteDerivation() {
        return (EAttribute)getNextHopIPRoute().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNextHopIPRoute_OtherDerivation() {
        return (EAttribute)getNextHopIPRoute().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNextHopIPRoute_DestinationMask() {
        return (EAttribute)getNextHopIPRoute().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNextHopIPRoute_PrefixLength() {
        return (EAttribute)getNextHopIPRoute().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNextHopIPRoute_AddressType() {
        return (EAttribute)getNextHopIPRoute().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdministrativeDistance() {
		if (administrativeDistanceEClass == null) {
			administrativeDistanceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CimPackage.eNS_URI).getEClassifiers().get(190);
		}
		return administrativeDistanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAdministrativeDistance_CreationClassName() {
        return (EAttribute)getAdministrativeDistance().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAdministrativeDistance_DirectConnect() {
        return (EAttribute)getAdministrativeDistance().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAdministrativeDistance_Static() {
        return (EAttribute)getAdministrativeDistance().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAdministrativeDistance_EBGP() {
        return (EAttribute)getAdministrativeDistance().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAdministrativeDistance_EIGRPInternal() {
        return (EAttribute)getAdministrativeDistance().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAdministrativeDistance_IGRP() {
        return (EAttribute)getAdministrativeDistance().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAdministrativeDistance_OSPF() {
        return (EAttribute)getAdministrativeDistance().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAdministrativeDistance_ISIS() {
        return (EAttribute)getAdministrativeDistance().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAdministrativeDistance_RIP() {
        return (EAttribute)getAdministrativeDistance().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAdministrativeDistance_EGP() {
        return (EAttribute)getAdministrativeDistance().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAdministrativeDistance_IEGRPExternal() {
        return (EAttribute)getAdministrativeDistance().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAdministrativeDistance_IBGP() {
        return (EAttribute)getAdministrativeDistance().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAdministrativeDistance_BGPLocal() {
        return (EAttribute)getAdministrativeDistance().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAdministrativeDistance_Unknown() {
        return (EAttribute)getAdministrativeDistance().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNextHopRouting() {
		if (nextHopRoutingEClass == null) {
			nextHopRoutingEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CimPackage.eNS_URI).getEClassifiers().get(191);
		}
		return nextHopRoutingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNextHopRouting_DestinationAddress() {
        return (EAttribute)getNextHopRouting().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNextHopRouting_DestinationMask() {
        return (EAttribute)getNextHopRouting().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNextHopRouting_NextHop() {
        return (EAttribute)getNextHopRouting().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNextHopRouting_IsStatic() {
        return (EAttribute)getNextHopRouting().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIPRoute() {
		if (ipRouteEClass == null) {
			ipRouteEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CimPackage.eNS_URI).getEClassifiers().get(192);
		}
		return ipRouteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIPRoute_CreationClassName() {
        return (EAttribute)getIPRoute().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIPRoute_IPDestinationAddress() {
        return (EAttribute)getIPRoute().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIPRoute_IPDestinationMask() {
        return (EAttribute)getIPRoute().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIPRoute_AddressType() {
        return (EAttribute)getIPRoute().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoutingPolicy() {
		if (routingPolicyEClass == null) {
			routingPolicyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CimPackage.eNS_URI).getEClassifiers().get(193);
		}
		return routingPolicyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoutingPolicy_CreationClassName() {
        return (EAttribute)getRoutingPolicy().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoutingPolicy_Action() {
        return (EAttribute)getRoutingPolicy().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoutingPolicy_AttributeAction() {
        return (EAttribute)getRoutingPolicy().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoutingPolicy_BGPAction() {
        return (EAttribute)getRoutingPolicy().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoutingPolicy_BGPValue() {
        return (EAttribute)getRoutingPolicy().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoutingPolicy_RemarkAction() {
        return (EAttribute)getRoutingPolicy().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoutingPolicy_RemarkValue() {
        return (EAttribute)getRoutingPolicy().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoutingPolicy_ConditioningAction() {
        return (EAttribute)getRoutingPolicy().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoutingPolicy_OtherConditioningAction() {
        return (EAttribute)getRoutingPolicy().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoutingPolicy_ConditioningValue() {
        return (EAttribute)getRoutingPolicy().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRouteCalculationService() {
		if (routeCalculationServiceEClass == null) {
			routeCalculationServiceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CimPackage.eNS_URI).getEClassifiers().get(194);
		}
		return routeCalculationServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRouteCalculationService_RouterID() {
        return (EAttribute)getRouteCalculationService().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRouteCalculationService_AlgorithmType() {
        return (EAttribute)getRouteCalculationService().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRouteCalculationService_CalculatesAmong() {
        return (EReference)getRouteCalculationService().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRouteCalculationService_CalculatedRoutes() {
        return (EReference)getRouteCalculationService().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNetworkService() {
		if (networkServiceEClass == null) {
			networkServiceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CimPackage.eNS_URI).getEClassifiers().get(195);
		}
		return networkServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNetworkService_Keywords() {
        return (EAttribute)getNetworkService().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNetworkService_ServiceURL() {
        return (EAttribute)getNetworkService().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNetworkService_StartupConditions() {
        return (EAttribute)getNetworkService().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNetworkService_StartupParameters() {
        return (EAttribute)getNetworkService().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getForwardingService() {
		if (forwardingServiceEClass == null) {
			forwardingServiceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CimPackage.eNS_URI).getEClassifiers().get(196);
		}
		return forwardingServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getForwardingService_ProtocolType() {
        return (EAttribute)getForwardingService().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getForwardingService_OtherProtocolType() {
        return (EAttribute)getForwardingService().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getForwardingService_ForwardsAmong() {
        return (EReference)getForwardingService().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getForwardingService_RouteForwardedByService() {
        return (EReference)getForwardingService().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getForwardingService_ForwardedRoutes() {
        return (EReference)getForwardingService().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoutingProtocolDomain() {
		if (routingProtocolDomainEClass == null) {
			routingProtocolDomainEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CimPackage.eNS_URI).getEClassifiers().get(197);
		}
		return routingProtocolDomainEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNATService() {
		if (natServiceEClass == null) {
			natServiceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CimPackage.eNS_URI).getEClassifiers().get(198);
		}
		return natServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNATService_NATServiceRunningOnEndpoint() {
        return (EReference)getNATService().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNATSettingData() {
		if (natSettingDataEClass == null) {
			natSettingDataEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CimPackage.eNS_URI).getEClassifiers().get(199);
		}
		return natSettingDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNATSettingData_AddressExamined() {
        return (EAttribute)getNATSettingData().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNATSettingData_IsInside() {
        return (EAttribute)getNATSettingData().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNATStaticSettings() {
		if (natStaticSettingsEClass == null) {
			natStaticSettingsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CimPackage.eNS_URI).getEClassifiers().get(201);
		}
		return natStaticSettingsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNATStaticSettings_InsideAddress() {
        return (EAttribute)getNATStaticSettings().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNATStaticSettings_OutsideAddress() {
        return (EAttribute)getNATStaticSettings().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNATListBasedSettings() {
		if (natListBasedSettingsEClass == null) {
			natListBasedSettingsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CimPackage.eNS_URI).getEClassifiers().get(202);
		}
		return natListBasedSettingsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNATListBasedSettings_OverloadingPermitted() {
        return (EAttribute)getNATListBasedSettings().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNATListBasedSettings_TranslationPoolForNAT() {
        return (EReference)getNATListBasedSettings().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNATListBasedSettings_AddressesToBeTranslated() {
        return (EReference)getNATListBasedSettings().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSNMPCommunityStrings() {
		if (snmpCommunityStringsEClass == null) {
			snmpCommunityStringsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CimPackage.eNS_URI).getEClassifiers().get(203);
		}
		return snmpCommunityStringsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSNMPCommunityStrings_CommunityString() {
        return (EAttribute)getSNMPCommunityStrings().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSNMPCommunityStrings_TypeOfAccess() {
        return (EAttribute)getSNMPCommunityStrings().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSNMPCommunityStrings_LogicalEntitiesAccessed() {
        return (EAttribute)getSNMPCommunityStrings().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSNMPCommunityStrings_LogicalEntitiesDescriptions() {
        return (EAttribute)getSNMPCommunityStrings().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSNMPService() {
		if (snmpServiceEClass == null) {
			snmpServiceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CimPackage.eNS_URI).getEClassifiers().get(204);
		}
		return snmpServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSNMPService_TrapSourceForSNMPService() {
        return (EReference)getSNMPService().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSNMPTrapTarget() {
		if (snmpTrapTargetEClass == null) {
			snmpTrapTargetEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CimPackage.eNS_URI).getEClassifiers().get(205);
		}
		return snmpTrapTargetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSNMPTrapTarget_NotificationMessage() {
        return (EAttribute)getSNMPTrapTarget().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSNMPTrapTarget_SNMPVersion() {
        return (EAttribute)getSNMPTrapTarget().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSNMPTrapTarget_CommunityString() {
        return (EAttribute)getSNMPTrapTarget().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEnumDedicated() {
		if (enumDedicatedEEnum == null) {
			enumDedicatedEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CimPackage.eNS_URI).getEClassifiers().get(7);
		}
		return enumDedicatedEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEnumSoftwareElementState() {
		if (enumSoftwareElementStateEEnum == null) {
			enumSoftwareElementStateEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CimPackage.eNS_URI).getEClassifiers().get(39);
		}
		return enumSoftwareElementStateEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEnumAddressType() {
		if (enumAddressTypeEEnum == null) {
			enumAddressTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CimPackage.eNS_URI).getEClassifiers().get(53);
		}
		return enumAddressTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEnumAccessContext() {
		if (enumAccessContextEEnum == null) {
			enumAccessContextEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CimPackage.eNS_URI).getEClassifiers().get(62);
		}
		return enumAccessContextEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEnumChangeableType() {
		if (enumChangeableTypeEEnum == null) {
			enumChangeableTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CimPackage.eNS_URI).getEClassifiers().get(63);
		}
		return enumChangeableTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEnumClassifications() {
		if (enumClassificationsEEnum == null) {
			enumClassificationsEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CimPackage.eNS_URI).getEClassifiers().get(64);
		}
		return enumClassificationsEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEnumHealthState() {
		if (enumHealthStateEEnum == null) {
			enumHealthStateEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CimPackage.eNS_URI).getEClassifiers().get(65);
		}
		return enumHealthStateEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEnumEnabledDefault() {
		if (enumEnabledDefaultEEnum == null) {
			enumEnabledDefaultEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CimPackage.eNS_URI).getEClassifiers().get(66);
		}
		return enumEnabledDefaultEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEnumEnabledState() {
		if (enumEnabledStateEEnum == null) {
			enumEnabledStateEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CimPackage.eNS_URI).getEClassifiers().get(67);
		}
		return enumEnabledStateEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEnumElementSoftwareStatus() {
		if (enumElementSoftwareStatusEEnum == null) {
			enumElementSoftwareStatusEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CimPackage.eNS_URI).getEClassifiers().get(68);
		}
		return enumElementSoftwareStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEnumExtendedResourceType() {
		if (enumExtendedResourceTypeEEnum == null) {
			enumExtendedResourceTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CimPackage.eNS_URI).getEClassifiers().get(69);
		}
		return enumExtendedResourceTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEnumInfoFormat() {
		if (enumInfoFormatEEnum == null) {
			enumInfoFormatEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CimPackage.eNS_URI).getEClassifiers().get(70);
		}
		return enumInfoFormatEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEnumIsCurrent() {
		if (enumIsCurrentEEnum == null) {
			enumIsCurrentEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CimPackage.eNS_URI).getEClassifiers().get(71);
		}
		return enumIsCurrentEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEnumIsDefault() {
		if (enumIsDefaultEEnum == null) {
			enumIsDefaultEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CimPackage.eNS_URI).getEClassifiers().get(72);
		}
		return enumIsDefaultEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEnumIsMaximum() {
		if (enumIsMaximumEEnum == null) {
			enumIsMaximumEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CimPackage.eNS_URI).getEClassifiers().get(73);
		}
		return enumIsMaximumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEnumIsMinimum() {
		if (enumIsMinimumEEnum == null) {
			enumIsMinimumEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CimPackage.eNS_URI).getEClassifiers().get(74);
		}
		return enumIsMinimumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEnumIsNext() {
		if (enumIsNextEEnum == null) {
			enumIsNextEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CimPackage.eNS_URI).getEClassifiers().get(75);
		}
		return enumIsNextEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEnumIsPending() {
		if (enumIsPendingEEnum == null) {
			enumIsPendingEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CimPackage.eNS_URI).getEClassifiers().get(76);
		}
		return enumIsPendingEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEnumNameFormat() {
		if (enumNameFormatEEnum == null) {
			enumNameFormatEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CimPackage.eNS_URI).getEClassifiers().get(77);
		}
		return enumNameFormatEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEnumOperationalStatus() {
		if (enumOperationalStatusEEnum == null) {
			enumOperationalStatusEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CimPackage.eNS_URI).getEClassifiers().get(78);
		}
		return enumOperationalStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEnumProtocolIFType() {
		if (enumProtocolIFTypeEEnum == null) {
			enumProtocolIFTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CimPackage.eNS_URI).getEClassifiers().get(79);
		}
		return enumProtocolIFTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEnumRequestedState() {
		if (enumRequestedStateEEnum == null) {
			enumRequestedStateEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CimPackage.eNS_URI).getEClassifiers().get(80);
		}
		return enumRequestedStateEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEnumTargetOSTypes() {
		if (enumTargetOSTypesEEnum == null) {
			enumTargetOSTypesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CimPackage.eNS_URI).getEClassifiers().get(81);
		}
		return enumTargetOSTypesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEnumUpgradeCondition() {
		if (enumUpgradeConditionEEnum == null) {
			enumUpgradeConditionEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CimPackage.eNS_URI).getEClassifiers().get(82);
		}
		return enumUpgradeConditionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEnumDirection() {
		if (enumDirectionEEnum == null) {
			enumDirectionEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CimPackage.eNS_URI).getEClassifiers().get(109);
		}
		return enumDirectionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEnumMatchConditionType() {
		if (enumMatchConditionTypeEEnum == null) {
			enumMatchConditionTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CimPackage.eNS_URI).getEClassifiers().get(111);
		}
		return enumMatchConditionTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEnumAction() {
		if (enumActionEEnum == null) {
			enumActionEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CimPackage.eNS_URI).getEClassifiers().get(112);
		}
		return enumActionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEnumTrafficType() {
		if (enumTrafficTypeEEnum == null) {
			enumTrafficTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CimPackage.eNS_URI).getEClassifiers().get(114);
		}
		return enumTrafficTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEnumIPVersion() {
		if (enumIPVersionEEnum == null) {
			enumIPVersionEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CimPackage.eNS_URI).getEClassifiers().get(116);
		}
		return enumIPVersionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEnumAvailability() {
		if (enumAvailabilityEEnum == null) {
			enumAvailabilityEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CimPackage.eNS_URI).getEClassifiers().get(117);
		}
		return enumAvailabilityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEnumLinkTechnology() {
		if (enumLinkTechnologyEEnum == null) {
			enumLinkTechnologyEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CimPackage.eNS_URI).getEClassifiers().get(118);
		}
		return enumLinkTechnologyEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEnumLogicalModuleType() {
		if (enumLogicalModuleTypeEEnum == null) {
			enumLogicalModuleTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CimPackage.eNS_URI).getEClassifiers().get(119);
		}
		return enumLogicalModuleTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEnumPortType() {
		if (enumPortTypeEEnum == null) {
			enumPortTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CimPackage.eNS_URI).getEClassifiers().get(120);
		}
		return enumPortTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEnumStatusInfo() {
		if (enumStatusInfoEEnum == null) {
			enumStatusInfoEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CimPackage.eNS_URI).getEClassifiers().get(121);
		}
		return enumStatusInfoEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEnumLineState() {
		if (enumLineStateEEnum == null) {
			enumLineStateEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CimPackage.eNS_URI).getEClassifiers().get(134);
		}
		return enumLineStateEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEnumModulationScheme() {
		if (enumModulationSchemeEEnum == null) {
			enumModulationSchemeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CimPackage.eNS_URI).getEClassifiers().get(135);
		}
		return enumModulationSchemeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEnumAddressOrigin() {
		if (enumAddressOriginEEnum == null) {
			enumAddressOriginEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CimPackage.eNS_URI).getEClassifiers().get(152);
		}
		return enumAddressOriginEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEnumTerminalMode() {
		if (enumTerminalModeEEnum == null) {
			enumTerminalModeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CimPackage.eNS_URI).getEClassifiers().get(164);
		}
		return enumTerminalModeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEnumCharacterDisplayMode() {
		if (enumCharacterDisplayModeEEnum == null) {
			enumCharacterDisplayModeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CimPackage.eNS_URI).getEClassifiers().get(165);
		}
		return enumCharacterDisplayModeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEnumDHCPOptions() {
		if (enumDHCPOptionsEEnum == null) {
			enumDHCPOptionsEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CimPackage.eNS_URI).getEClassifiers().get(167);
		}
		return enumDHCPOptionsEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEnumAuthenticationMethod() {
		if (enumAuthenticationMethodEEnum == null) {
			enumAuthenticationMethodEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CimPackage.eNS_URI).getEClassifiers().get(173);
		}
		return enumAuthenticationMethodEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEnumEncryptionMethod() {
		if (enumEncryptionMethodEEnum == null) {
			enumEncryptionMethodEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CimPackage.eNS_URI).getEClassifiers().get(174);
		}
		return enumEncryptionMethodEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEnumBSSType() {
		if (enumBSSTypeEEnum == null) {
			enumBSSTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CimPackage.eNS_URI).getEClassifiers().get(175);
		}
		return enumBSSTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEnumProtocolServiceReturnCode() {
		if (enumProtocolServiceReturnCodeEEnum == null) {
			enumProtocolServiceReturnCodeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CimPackage.eNS_URI).getEClassifiers().get(177);
		}
		return enumProtocolServiceReturnCodeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEnumProtocolType() {
		if (enumProtocolTypeEEnum == null) {
			enumProtocolTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CimPackage.eNS_URI).getEClassifiers().get(178);
		}
		return enumProtocolTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEnumAddressExamined() {
		if (enumAddressExaminedEEnum == null) {
			enumAddressExaminedEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CimPackage.eNS_URI).getEClassifiers().get(200);
		}
		return enumAddressExaminedEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CimFactory getCimFactory() {
		return (CimFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isLoaded = false;

	/**
	 * Laods the package and any sub-packages from their serialized form.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void loadPackage() {
		if (isLoaded) return;
		isLoaded = true;

		URL url = getClass().getResource(packageFilename);
		if (url == null) {
			throw new RuntimeException("Missing serialized package: " + packageFilename);
		}
		URI uri = URI.createURI(url.toString());
		Resource resource = new EcoreResourceFactoryImpl().createResource(uri);
		try {
			resource.load(null);
		}
		catch (IOException exception) {
			throw new WrappedException(exception);
		}
		initializeFromLoadedEPackage(this, (EPackage)resource.getContents().get(0));
		createResource(eNS_URI);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isFixed = false;

	/**
	 * Fixes up the loaded package, to make it appear as if it had been programmatically built.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fixPackageContents() {
		if (isFixed) return;
		isFixed = true;
		fixEClassifiers();
	}

	/**
	 * Sets the instance class on the given classifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void fixInstanceClass(EClassifier eClassifier) {
		if (eClassifier.getInstanceClassName() == null) {
			eClassifier.setInstanceClassName("es.tid.cim." + eClassifier.getName());
			setGeneratedClassName(eClassifier);
		}
	}

} //CimPackageImpl
