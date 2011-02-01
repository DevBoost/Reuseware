package es.tid.cim.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;

import es.tid.cim.CimPackage;
import es.tid.cim.diagram.edit.parts.ADSLModemElementNameEditPart;
import es.tid.cim.diagram.edit.parts.AFServiceElementNameEditPart;
import es.tid.cim.diagram.edit.parts.AdminDomainElementNameEditPart;
import es.tid.cim.diagram.edit.parts.AdministrativeDistanceElementNameEditPart;
import es.tid.cim.diagram.edit.parts.ApplicationSystemElementNameEditPart;
import es.tid.cim.diagram.edit.parts.AutonomousSystemElementNameEditPart;
import es.tid.cim.diagram.edit.parts.BGPClusterElementNameEditPart;
import es.tid.cim.diagram.edit.parts.BGPPeerGroupElementNameEditPart;
import es.tid.cim.diagram.edit.parts.BGPProtocolEndpointElementNameEditPart;
import es.tid.cim.diagram.edit.parts.BGPServiceElementNameEditPart;
import es.tid.cim.diagram.edit.parts.BIOSElementElementNameEditPart;
import es.tid.cim.diagram.edit.parts.BIOSFeatureElementNameEditPart;
import es.tid.cim.diagram.edit.parts.BufferPoolElementNameEditPart;
import es.tid.cim.diagram.edit.parts.CLPSettingDataElementNameEditPart;
import es.tid.cim.diagram.edit.parts.CableModemElementNameEditPart;
import es.tid.cim.diagram.edit.parts.ComputerSystemElementNameEditPart;
import es.tid.cim.diagram.edit.parts.ConditioningServiceElementNameEditPart;
import es.tid.cim.diagram.edit.parts.ConnectivityMemberhipSettingDataElementNameEditPart;
import es.tid.cim.diagram.edit.parts.DHCPCapabilitiesElementNameEditPart;
import es.tid.cim.diagram.edit.parts.DHCPProtocolEndpointElementNameEditPart;
import es.tid.cim.diagram.edit.parts.DNSProtocolEndpointElementNameEditPart;
import es.tid.cim.diagram.edit.parts.DNSSettingDataElementNameEditPart;
import es.tid.cim.diagram.edit.parts.DirectoryElementNameEditPart;
import es.tid.cim.diagram.edit.parts.DropThresholdCalculationServiceElementNameEditPart;
import es.tid.cim.diagram.edit.parts.EFServiceElementNameEditPart;
import es.tid.cim.diagram.edit.parts.EnabledLogicalElementCapabilitiesElementNameEditPart;
import es.tid.cim.diagram.edit.parts.EthernetPortElementNameEditPart;
import es.tid.cim.diagram.edit.parts.FileSpecificationElementNameEditPart;
import es.tid.cim.diagram.edit.parts.FilterEntryElementNameEditPart;
import es.tid.cim.diagram.edit.parts.FilterListElementNameEditPart;
import es.tid.cim.diagram.edit.parts.FlowServiceElementNameEditPart;
import es.tid.cim.diagram.edit.parts.GenericServiceElementNameEditPart;
import es.tid.cim.diagram.edit.parts.HDSLModemElementNameEditPart;
import es.tid.cim.diagram.edit.parts.Hdr8021PServiceElementNameEditPart;
import es.tid.cim.diagram.edit.parts.IPAddressRangeElementNameEditPart;
import es.tid.cim.diagram.edit.parts.IPConnectivitySubnetElementNameEditPart;
import es.tid.cim.diagram.edit.parts.IPHeadersFilterElementNameEditPart;
import es.tid.cim.diagram.edit.parts.IPProtocolEndpointElementNameEditPart;
import es.tid.cim.diagram.edit.parts.IPSubnetElementNameEditPart;
import es.tid.cim.diagram.edit.parts.IPXConnectivityNetworkElementNameEditPart;
import es.tid.cim.diagram.edit.parts.IPXNetworkElementNameEditPart;
import es.tid.cim.diagram.edit.parts.IPXProtocolEndpointElementNameEditPart;
import es.tid.cim.diagram.edit.parts.ISDNModemElementNameEditPart;
import es.tid.cim.diagram.edit.parts.LANConnectivitySegmentElementNameEditPart;
import es.tid.cim.diagram.edit.parts.LANEndpointElementNameEditPart;
import es.tid.cim.diagram.edit.parts.LANSegmentElementNameEditPart;
import es.tid.cim.diagram.edit.parts.LogicalFileElementNameEditPart;
import es.tid.cim.diagram.edit.parts.LogicalModuleElementNameEditPart;
import es.tid.cim.diagram.edit.parts.MPLSProtocolEndpointElementNameEditPart;
import es.tid.cim.diagram.edit.parts.MemoryCapacityElementNameEditPart;
import es.tid.cim.diagram.edit.parts.NATListBasedSettingsElementNameEditPart;
import es.tid.cim.diagram.edit.parts.NATServiceElementNameEditPart;
import es.tid.cim.diagram.edit.parts.NATStaticSettingsElementNameEditPart;
import es.tid.cim.diagram.edit.parts.NamedAddressCollectionElementNameEditPart;
import es.tid.cim.diagram.edit.parts.NetworkElementNameEditPart;
import es.tid.cim.diagram.edit.parts.NetworkPortElementNameEditPart;
import es.tid.cim.diagram.edit.parts.NextHopIPRouteElementNameEditPart;
import es.tid.cim.diagram.edit.parts.NextHopRoutingElementNameEditPart;
import es.tid.cim.diagram.edit.parts.OSPFProtocolEndpointElementNameEditPart;
import es.tid.cim.diagram.edit.parts.OSPFVirtualInterfaceElementNameEditPart;
import es.tid.cim.diagram.edit.parts.OperatingSystemElementNameEditPart;
import es.tid.cim.diagram.edit.parts.PowerManagementCapabilitiesElementNameEditPart;
import es.tid.cim.diagram.edit.parts.PrecedenceServiceElementNameEditPart;
import es.tid.cim.diagram.edit.parts.ProductElementNameEditPart;
import es.tid.cim.diagram.edit.parts.ProtocolServiceElementNameEditPart;
import es.tid.cim.diagram.edit.parts.RangeOfIPAddressesElementNameEditPart;
import es.tid.cim.diagram.edit.parts.RemoteServiceAccessPointElementNameEditPart;
import es.tid.cim.diagram.edit.parts.ReplacementSetElementNameEditPart;
import es.tid.cim.diagram.edit.parts.RoutingPolicyElementNameEditPart;
import es.tid.cim.diagram.edit.parts.RoutingProtocolDomainElementNameEditPart;
import es.tid.cim.diagram.edit.parts.SDSLModemElementNameEditPart;
import es.tid.cim.diagram.edit.parts.SNMPCommunityStringsElementNameEditPart;
import es.tid.cim.diagram.edit.parts.SNMPServiceElementNameEditPart;
import es.tid.cim.diagram.edit.parts.SNMPTrapTargetElementNameEditPart;
import es.tid.cim.diagram.edit.parts.SSHSettingDataElementNameEditPart;
import es.tid.cim.diagram.edit.parts.ServiceAccessURIElementNameEditPart;
import es.tid.cim.diagram.edit.parts.SoftwareIdentityElementNameEditPart;
import es.tid.cim.diagram.edit.parts.SwitchPortElementNameEditPart;
import es.tid.cim.diagram.edit.parts.SystemSpecificCollectionElementNameEditPart;
import es.tid.cim.diagram.edit.parts.TCPProtocolEndpointElementNameEditPart;
import es.tid.cim.diagram.edit.parts.TelnetProtocolEndpointElementNameEditPart;
import es.tid.cim.diagram.edit.parts.TelnetSettingDataElementNameEditPart;
import es.tid.cim.diagram.edit.parts.UDPProtocolEndpointElementNameEditPart;
import es.tid.cim.diagram.edit.parts.USBDeviceElementNameEditPart;
import es.tid.cim.diagram.edit.parts.USBPortElementNameEditPart;
import es.tid.cim.diagram.edit.parts.UniModemElementNameEditPart;
import es.tid.cim.diagram.edit.parts.UnitaryComputerSystemElementNameEditPart;
import es.tid.cim.diagram.edit.parts.VDSLModemElementNameEditPart;
import es.tid.cim.diagram.edit.parts.VolatileStorageElementNameEditPart;
import es.tid.cim.diagram.edit.parts.WiFiEndPointElementNameEditPart;
import es.tid.cim.diagram.edit.parts.WiFiEndpointSettingsElementNameEditPart;
import es.tid.cim.diagram.edit.parts.WiFiPortElementNameEditPart;
import es.tid.cim.diagram.edit.parts.WirelessLANEndpointElementNameEditPart;
import es.tid.cim.diagram.edit.parts.WirelessPortElementNameEditPart;
import es.tid.cim.diagram.parsers.MessageFormatParser;
import es.tid.cim.diagram.part.CIMLevelZeroVisualIDRegistry;

/**
 * @generated
 */
public class CIMLevelZeroParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser uSBDeviceElementName_5001Parser;

	/**
	 * @generated
	 */
	private IParser getUSBDeviceElementName_5001Parser() {
		if (uSBDeviceElementName_5001Parser == null) {
			uSBDeviceElementName_5001Parser = createUSBDeviceElementName_5001Parser();
		}
		return uSBDeviceElementName_5001Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createUSBDeviceElementName_5001Parser() {
		EAttribute[] features = new EAttribute[] { CimPackage.eINSTANCE
				.getManagedElement_ElementName(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser oSPFVirtualInterfaceElementName_5003Parser;

	/**
	 * @generated
	 */
	private IParser getOSPFVirtualInterfaceElementName_5003Parser() {
		if (oSPFVirtualInterfaceElementName_5003Parser == null) {
			oSPFVirtualInterfaceElementName_5003Parser = createOSPFVirtualInterfaceElementName_5003Parser();
		}
		return oSPFVirtualInterfaceElementName_5003Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createOSPFVirtualInterfaceElementName_5003Parser() {
		EAttribute[] features = new EAttribute[] { CimPackage.eINSTANCE
				.getManagedElement_ElementName(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser wiFiPortElementName_5005Parser;

	/**
	 * @generated
	 */
	private IParser getWiFiPortElementName_5005Parser() {
		if (wiFiPortElementName_5005Parser == null) {
			wiFiPortElementName_5005Parser = createWiFiPortElementName_5005Parser();
		}
		return wiFiPortElementName_5005Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createWiFiPortElementName_5005Parser() {
		EAttribute[] features = new EAttribute[] { CimPackage.eINSTANCE
				.getManagedElement_ElementName(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser protocolServiceElementName_5007Parser;

	/**
	 * @generated
	 */
	private IParser getProtocolServiceElementName_5007Parser() {
		if (protocolServiceElementName_5007Parser == null) {
			protocolServiceElementName_5007Parser = createProtocolServiceElementName_5007Parser();
		}
		return protocolServiceElementName_5007Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createProtocolServiceElementName_5007Parser() {
		EAttribute[] features = new EAttribute[] { CimPackage.eINSTANCE
				.getManagedElement_ElementName(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser routingPolicyElementName_5009Parser;

	/**
	 * @generated
	 */
	private IParser getRoutingPolicyElementName_5009Parser() {
		if (routingPolicyElementName_5009Parser == null) {
			routingPolicyElementName_5009Parser = createRoutingPolicyElementName_5009Parser();
		}
		return routingPolicyElementName_5009Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createRoutingPolicyElementName_5009Parser() {
		EAttribute[] features = new EAttribute[] { CimPackage.eINSTANCE
				.getManagedElement_ElementName(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser enabledLogicalElementCapabilitiesElementName_5011Parser;

	/**
	 * @generated
	 */
	private IParser getEnabledLogicalElementCapabilitiesElementName_5011Parser() {
		if (enabledLogicalElementCapabilitiesElementName_5011Parser == null) {
			enabledLogicalElementCapabilitiesElementName_5011Parser = createEnabledLogicalElementCapabilitiesElementName_5011Parser();
		}
		return enabledLogicalElementCapabilitiesElementName_5011Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createEnabledLogicalElementCapabilitiesElementName_5011Parser() {
		EAttribute[] features = new EAttribute[] { CimPackage.eINSTANCE
				.getManagedElement_ElementName(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser bufferPoolElementName_5013Parser;

	/**
	 * @generated
	 */
	private IParser getBufferPoolElementName_5013Parser() {
		if (bufferPoolElementName_5013Parser == null) {
			bufferPoolElementName_5013Parser = createBufferPoolElementName_5013Parser();
		}
		return bufferPoolElementName_5013Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createBufferPoolElementName_5013Parser() {
		EAttribute[] features = new EAttribute[] { CimPackage.eINSTANCE
				.getManagedElement_ElementName(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser mPLSProtocolEndpointElementName_5015Parser;

	/**
	 * @generated
	 */
	private IParser getMPLSProtocolEndpointElementName_5015Parser() {
		if (mPLSProtocolEndpointElementName_5015Parser == null) {
			mPLSProtocolEndpointElementName_5015Parser = createMPLSProtocolEndpointElementName_5015Parser();
		}
		return mPLSProtocolEndpointElementName_5015Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createMPLSProtocolEndpointElementName_5015Parser() {
		EAttribute[] features = new EAttribute[] { CimPackage.eINSTANCE
				.getManagedElement_ElementName(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser autonomousSystemElementName_5017Parser;

	/**
	 * @generated
	 */
	private IParser getAutonomousSystemElementName_5017Parser() {
		if (autonomousSystemElementName_5017Parser == null) {
			autonomousSystemElementName_5017Parser = createAutonomousSystemElementName_5017Parser();
		}
		return autonomousSystemElementName_5017Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createAutonomousSystemElementName_5017Parser() {
		EAttribute[] features = new EAttribute[] { CimPackage.eINSTANCE
				.getManagedElement_ElementName(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser dNSSettingDataElementName_5019Parser;

	/**
	 * @generated
	 */
	private IParser getDNSSettingDataElementName_5019Parser() {
		if (dNSSettingDataElementName_5019Parser == null) {
			dNSSettingDataElementName_5019Parser = createDNSSettingDataElementName_5019Parser();
		}
		return dNSSettingDataElementName_5019Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createDNSSettingDataElementName_5019Parser() {
		EAttribute[] features = new EAttribute[] { CimPackage.eINSTANCE
				.getManagedElement_ElementName(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser uniModemElementName_5021Parser;

	/**
	 * @generated
	 */
	private IParser getUniModemElementName_5021Parser() {
		if (uniModemElementName_5021Parser == null) {
			uniModemElementName_5021Parser = createUniModemElementName_5021Parser();
		}
		return uniModemElementName_5021Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createUniModemElementName_5021Parser() {
		EAttribute[] features = new EAttribute[] { CimPackage.eINSTANCE
				.getManagedElement_ElementName(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser eFServiceElementName_5023Parser;

	/**
	 * @generated
	 */
	private IParser getEFServiceElementName_5023Parser() {
		if (eFServiceElementName_5023Parser == null) {
			eFServiceElementName_5023Parser = createEFServiceElementName_5023Parser();
		}
		return eFServiceElementName_5023Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createEFServiceElementName_5023Parser() {
		EAttribute[] features = new EAttribute[] { CimPackage.eINSTANCE
				.getManagedElement_ElementName(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser iPSubnetElementName_5025Parser;

	/**
	 * @generated
	 */
	private IParser getIPSubnetElementName_5025Parser() {
		if (iPSubnetElementName_5025Parser == null) {
			iPSubnetElementName_5025Parser = createIPSubnetElementName_5025Parser();
		}
		return iPSubnetElementName_5025Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createIPSubnetElementName_5025Parser() {
		EAttribute[] features = new EAttribute[] { CimPackage.eINSTANCE
				.getManagedElement_ElementName(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser namedAddressCollectionElementName_5027Parser;

	/**
	 * @generated
	 */
	private IParser getNamedAddressCollectionElementName_5027Parser() {
		if (namedAddressCollectionElementName_5027Parser == null) {
			namedAddressCollectionElementName_5027Parser = createNamedAddressCollectionElementName_5027Parser();
		}
		return namedAddressCollectionElementName_5027Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createNamedAddressCollectionElementName_5027Parser() {
		EAttribute[] features = new EAttribute[] { CimPackage.eINSTANCE
				.getManagedElement_ElementName(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser bIOSElementElementName_5029Parser;

	/**
	 * @generated
	 */
	private IParser getBIOSElementElementName_5029Parser() {
		if (bIOSElementElementName_5029Parser == null) {
			bIOSElementElementName_5029Parser = createBIOSElementElementName_5029Parser();
		}
		return bIOSElementElementName_5029Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createBIOSElementElementName_5029Parser() {
		EAttribute[] features = new EAttribute[] { CimPackage.eINSTANCE
				.getManagedElement_ElementName(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser telnetSettingDataElementName_5031Parser;

	/**
	 * @generated
	 */
	private IParser getTelnetSettingDataElementName_5031Parser() {
		if (telnetSettingDataElementName_5031Parser == null) {
			telnetSettingDataElementName_5031Parser = createTelnetSettingDataElementName_5031Parser();
		}
		return telnetSettingDataElementName_5031Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createTelnetSettingDataElementName_5031Parser() {
		EAttribute[] features = new EAttribute[] { CimPackage.eINSTANCE
				.getManagedElement_ElementName(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser bGPPeerGroupElementName_5033Parser;

	/**
	 * @generated
	 */
	private IParser getBGPPeerGroupElementName_5033Parser() {
		if (bGPPeerGroupElementName_5033Parser == null) {
			bGPPeerGroupElementName_5033Parser = createBGPPeerGroupElementName_5033Parser();
		}
		return bGPPeerGroupElementName_5033Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createBGPPeerGroupElementName_5033Parser() {
		EAttribute[] features = new EAttribute[] { CimPackage.eINSTANCE
				.getManagedElement_ElementName(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser lANConnectivitySegmentElementName_5035Parser;

	/**
	 * @generated
	 */
	private IParser getLANConnectivitySegmentElementName_5035Parser() {
		if (lANConnectivitySegmentElementName_5035Parser == null) {
			lANConnectivitySegmentElementName_5035Parser = createLANConnectivitySegmentElementName_5035Parser();
		}
		return lANConnectivitySegmentElementName_5035Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createLANConnectivitySegmentElementName_5035Parser() {
		EAttribute[] features = new EAttribute[] { CimPackage.eINSTANCE
				.getManagedElement_ElementName(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser cableModemElementName_5037Parser;

	/**
	 * @generated
	 */
	private IParser getCableModemElementName_5037Parser() {
		if (cableModemElementName_5037Parser == null) {
			cableModemElementName_5037Parser = createCableModemElementName_5037Parser();
		}
		return cableModemElementName_5037Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createCableModemElementName_5037Parser() {
		EAttribute[] features = new EAttribute[] { CimPackage.eINSTANCE
				.getManagedElement_ElementName(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser switchPortElementName_5039Parser;

	/**
	 * @generated
	 */
	private IParser getSwitchPortElementName_5039Parser() {
		if (switchPortElementName_5039Parser == null) {
			switchPortElementName_5039Parser = createSwitchPortElementName_5039Parser();
		}
		return switchPortElementName_5039Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createSwitchPortElementName_5039Parser() {
		EAttribute[] features = new EAttribute[] { CimPackage.eINSTANCE
				.getManagedElement_ElementName(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser tCPProtocolEndpointElementName_5041Parser;

	/**
	 * @generated
	 */
	private IParser getTCPProtocolEndpointElementName_5041Parser() {
		if (tCPProtocolEndpointElementName_5041Parser == null) {
			tCPProtocolEndpointElementName_5041Parser = createTCPProtocolEndpointElementName_5041Parser();
		}
		return tCPProtocolEndpointElementName_5041Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createTCPProtocolEndpointElementName_5041Parser() {
		EAttribute[] features = new EAttribute[] { CimPackage.eINSTANCE
				.getManagedElement_ElementName(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser administrativeDistanceElementName_5043Parser;

	/**
	 * @generated
	 */
	private IParser getAdministrativeDistanceElementName_5043Parser() {
		if (administrativeDistanceElementName_5043Parser == null) {
			administrativeDistanceElementName_5043Parser = createAdministrativeDistanceElementName_5043Parser();
		}
		return administrativeDistanceElementName_5043Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createAdministrativeDistanceElementName_5043Parser() {
		EAttribute[] features = new EAttribute[] { CimPackage.eINSTANCE
				.getManagedElement_ElementName(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser iPConnectivitySubnetElementName_5045Parser;

	/**
	 * @generated
	 */
	private IParser getIPConnectivitySubnetElementName_5045Parser() {
		if (iPConnectivitySubnetElementName_5045Parser == null) {
			iPConnectivitySubnetElementName_5045Parser = createIPConnectivitySubnetElementName_5045Parser();
		}
		return iPConnectivitySubnetElementName_5045Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createIPConnectivitySubnetElementName_5045Parser() {
		EAttribute[] features = new EAttribute[] { CimPackage.eINSTANCE
				.getManagedElement_ElementName(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser volatileStorageElementName_5047Parser;

	/**
	 * @generated
	 */
	private IParser getVolatileStorageElementName_5047Parser() {
		if (volatileStorageElementName_5047Parser == null) {
			volatileStorageElementName_5047Parser = createVolatileStorageElementName_5047Parser();
		}
		return volatileStorageElementName_5047Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createVolatileStorageElementName_5047Parser() {
		EAttribute[] features = new EAttribute[] { CimPackage.eINSTANCE
				.getManagedElement_ElementName(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser rangeOfIPAddressesElementName_5049Parser;

	/**
	 * @generated
	 */
	private IParser getRangeOfIPAddressesElementName_5049Parser() {
		if (rangeOfIPAddressesElementName_5049Parser == null) {
			rangeOfIPAddressesElementName_5049Parser = createRangeOfIPAddressesElementName_5049Parser();
		}
		return rangeOfIPAddressesElementName_5049Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createRangeOfIPAddressesElementName_5049Parser() {
		EAttribute[] features = new EAttribute[] { CimPackage.eINSTANCE
				.getManagedElement_ElementName(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser bGPProtocolEndpointElementName_5051Parser;

	/**
	 * @generated
	 */
	private IParser getBGPProtocolEndpointElementName_5051Parser() {
		if (bGPProtocolEndpointElementName_5051Parser == null) {
			bGPProtocolEndpointElementName_5051Parser = createBGPProtocolEndpointElementName_5051Parser();
		}
		return bGPProtocolEndpointElementName_5051Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createBGPProtocolEndpointElementName_5051Parser() {
		EAttribute[] features = new EAttribute[] { CimPackage.eINSTANCE
				.getManagedElement_ElementName(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser unitaryComputerSystemElementName_5053Parser;

	/**
	 * @generated
	 */
	private IParser getUnitaryComputerSystemElementName_5053Parser() {
		if (unitaryComputerSystemElementName_5053Parser == null) {
			unitaryComputerSystemElementName_5053Parser = createUnitaryComputerSystemElementName_5053Parser();
		}
		return unitaryComputerSystemElementName_5053Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createUnitaryComputerSystemElementName_5053Parser() {
		EAttribute[] features = new EAttribute[] { CimPackage.eINSTANCE
				.getManagedElement_ElementName(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser ethernetPortElementName_5055Parser;

	/**
	 * @generated
	 */
	private IParser getEthernetPortElementName_5055Parser() {
		if (ethernetPortElementName_5055Parser == null) {
			ethernetPortElementName_5055Parser = createEthernetPortElementName_5055Parser();
		}
		return ethernetPortElementName_5055Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createEthernetPortElementName_5055Parser() {
		EAttribute[] features = new EAttribute[] { CimPackage.eINSTANCE
				.getManagedElement_ElementName(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser sNMPServiceElementName_5057Parser;

	/**
	 * @generated
	 */
	private IParser getSNMPServiceElementName_5057Parser() {
		if (sNMPServiceElementName_5057Parser == null) {
			sNMPServiceElementName_5057Parser = createSNMPServiceElementName_5057Parser();
		}
		return sNMPServiceElementName_5057Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createSNMPServiceElementName_5057Parser() {
		EAttribute[] features = new EAttribute[] { CimPackage.eINSTANCE
				.getManagedElement_ElementName(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser logicalModuleElementName_5059Parser;

	/**
	 * @generated
	 */
	private IParser getLogicalModuleElementName_5059Parser() {
		if (logicalModuleElementName_5059Parser == null) {
			logicalModuleElementName_5059Parser = createLogicalModuleElementName_5059Parser();
		}
		return logicalModuleElementName_5059Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createLogicalModuleElementName_5059Parser() {
		EAttribute[] features = new EAttribute[] { CimPackage.eINSTANCE
				.getManagedElement_ElementName(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser nextHopIPRouteElementName_5061Parser;

	/**
	 * @generated
	 */
	private IParser getNextHopIPRouteElementName_5061Parser() {
		if (nextHopIPRouteElementName_5061Parser == null) {
			nextHopIPRouteElementName_5061Parser = createNextHopIPRouteElementName_5061Parser();
		}
		return nextHopIPRouteElementName_5061Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createNextHopIPRouteElementName_5061Parser() {
		EAttribute[] features = new EAttribute[] { CimPackage.eINSTANCE
				.getManagedElement_ElementName(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser operatingSystemElementName_5063Parser;

	/**
	 * @generated
	 */
	private IParser getOperatingSystemElementName_5063Parser() {
		if (operatingSystemElementName_5063Parser == null) {
			operatingSystemElementName_5063Parser = createOperatingSystemElementName_5063Parser();
		}
		return operatingSystemElementName_5063Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createOperatingSystemElementName_5063Parser() {
		EAttribute[] features = new EAttribute[] { CimPackage.eINSTANCE
				.getManagedElement_ElementName(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser sDSLModemElementName_5065Parser;

	/**
	 * @generated
	 */
	private IParser getSDSLModemElementName_5065Parser() {
		if (sDSLModemElementName_5065Parser == null) {
			sDSLModemElementName_5065Parser = createSDSLModemElementName_5065Parser();
		}
		return sDSLModemElementName_5065Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createSDSLModemElementName_5065Parser() {
		EAttribute[] features = new EAttribute[] { CimPackage.eINSTANCE
				.getManagedElement_ElementName(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser wiFiEndPointElementName_5067Parser;

	/**
	 * @generated
	 */
	private IParser getWiFiEndPointElementName_5067Parser() {
		if (wiFiEndPointElementName_5067Parser == null) {
			wiFiEndPointElementName_5067Parser = createWiFiEndPointElementName_5067Parser();
		}
		return wiFiEndPointElementName_5067Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createWiFiEndPointElementName_5067Parser() {
		EAttribute[] features = new EAttribute[] { CimPackage.eINSTANCE
				.getManagedElement_ElementName(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser nATServiceElementName_5069Parser;

	/**
	 * @generated
	 */
	private IParser getNATServiceElementName_5069Parser() {
		if (nATServiceElementName_5069Parser == null) {
			nATServiceElementName_5069Parser = createNATServiceElementName_5069Parser();
		}
		return nATServiceElementName_5069Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createNATServiceElementName_5069Parser() {
		EAttribute[] features = new EAttribute[] { CimPackage.eINSTANCE
				.getManagedElement_ElementName(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser aDSLModemElementName_5071Parser;

	/**
	 * @generated
	 */
	private IParser getADSLModemElementName_5071Parser() {
		if (aDSLModemElementName_5071Parser == null) {
			aDSLModemElementName_5071Parser = createADSLModemElementName_5071Parser();
		}
		return aDSLModemElementName_5071Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createADSLModemElementName_5071Parser() {
		EAttribute[] features = new EAttribute[] { CimPackage.eINSTANCE
				.getManagedElement_ElementName(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser logicalFileElementName_5073Parser;

	/**
	 * @generated
	 */
	private IParser getLogicalFileElementName_5073Parser() {
		if (logicalFileElementName_5073Parser == null) {
			logicalFileElementName_5073Parser = createLogicalFileElementName_5073Parser();
		}
		return logicalFileElementName_5073Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createLogicalFileElementName_5073Parser() {
		EAttribute[] features = new EAttribute[] { CimPackage.eINSTANCE
				.getManagedElement_ElementName(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser bGPClusterElementName_5075Parser;

	/**
	 * @generated
	 */
	private IParser getBGPClusterElementName_5075Parser() {
		if (bGPClusterElementName_5075Parser == null) {
			bGPClusterElementName_5075Parser = createBGPClusterElementName_5075Parser();
		}
		return bGPClusterElementName_5075Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createBGPClusterElementName_5075Parser() {
		EAttribute[] features = new EAttribute[] { CimPackage.eINSTANCE
				.getManagedElement_ElementName(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser applicationSystemElementName_5077Parser;

	/**
	 * @generated
	 */
	private IParser getApplicationSystemElementName_5077Parser() {
		if (applicationSystemElementName_5077Parser == null) {
			applicationSystemElementName_5077Parser = createApplicationSystemElementName_5077Parser();
		}
		return applicationSystemElementName_5077Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createApplicationSystemElementName_5077Parser() {
		EAttribute[] features = new EAttribute[] { CimPackage.eINSTANCE
				.getManagedElement_ElementName(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser softwareIdentityElementName_5079Parser;

	/**
	 * @generated
	 */
	private IParser getSoftwareIdentityElementName_5079Parser() {
		if (softwareIdentityElementName_5079Parser == null) {
			softwareIdentityElementName_5079Parser = createSoftwareIdentityElementName_5079Parser();
		}
		return softwareIdentityElementName_5079Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createSoftwareIdentityElementName_5079Parser() {
		EAttribute[] features = new EAttribute[] { CimPackage.eINSTANCE
				.getManagedElement_ElementName(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser wirelessPortElementName_5081Parser;

	/**
	 * @generated
	 */
	private IParser getWirelessPortElementName_5081Parser() {
		if (wirelessPortElementName_5081Parser == null) {
			wirelessPortElementName_5081Parser = createWirelessPortElementName_5081Parser();
		}
		return wirelessPortElementName_5081Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createWirelessPortElementName_5081Parser() {
		EAttribute[] features = new EAttribute[] { CimPackage.eINSTANCE
				.getManagedElement_ElementName(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser cLPSettingDataElementName_5083Parser;

	/**
	 * @generated
	 */
	private IParser getCLPSettingDataElementName_5083Parser() {
		if (cLPSettingDataElementName_5083Parser == null) {
			cLPSettingDataElementName_5083Parser = createCLPSettingDataElementName_5083Parser();
		}
		return cLPSettingDataElementName_5083Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createCLPSettingDataElementName_5083Parser() {
		EAttribute[] features = new EAttribute[] { CimPackage.eINSTANCE
				.getManagedElement_ElementName(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser genericServiceElementName_5085Parser;

	/**
	 * @generated
	 */
	private IParser getGenericServiceElementName_5085Parser() {
		if (genericServiceElementName_5085Parser == null) {
			genericServiceElementName_5085Parser = createGenericServiceElementName_5085Parser();
		}
		return genericServiceElementName_5085Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createGenericServiceElementName_5085Parser() {
		EAttribute[] features = new EAttribute[] { CimPackage.eINSTANCE
				.getManagedElement_ElementName(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser nATListBasedSettingsElementName_5087Parser;

	/**
	 * @generated
	 */
	private IParser getNATListBasedSettingsElementName_5087Parser() {
		if (nATListBasedSettingsElementName_5087Parser == null) {
			nATListBasedSettingsElementName_5087Parser = createNATListBasedSettingsElementName_5087Parser();
		}
		return nATListBasedSettingsElementName_5087Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createNATListBasedSettingsElementName_5087Parser() {
		EAttribute[] features = new EAttribute[] { CimPackage.eINSTANCE
				.getManagedElement_ElementName(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser vDSLModemElementName_5089Parser;

	/**
	 * @generated
	 */
	private IParser getVDSLModemElementName_5089Parser() {
		if (vDSLModemElementName_5089Parser == null) {
			vDSLModemElementName_5089Parser = createVDSLModemElementName_5089Parser();
		}
		return vDSLModemElementName_5089Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createVDSLModemElementName_5089Parser() {
		EAttribute[] features = new EAttribute[] { CimPackage.eINSTANCE
				.getManagedElement_ElementName(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser uSBPortElementName_5091Parser;

	/**
	 * @generated
	 */
	private IParser getUSBPortElementName_5091Parser() {
		if (uSBPortElementName_5091Parser == null) {
			uSBPortElementName_5091Parser = createUSBPortElementName_5091Parser();
		}
		return uSBPortElementName_5091Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createUSBPortElementName_5091Parser() {
		EAttribute[] features = new EAttribute[] { CimPackage.eINSTANCE
				.getManagedElement_ElementName(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser dNSProtocolEndpointElementName_5093Parser;

	/**
	 * @generated
	 */
	private IParser getDNSProtocolEndpointElementName_5093Parser() {
		if (dNSProtocolEndpointElementName_5093Parser == null) {
			dNSProtocolEndpointElementName_5093Parser = createDNSProtocolEndpointElementName_5093Parser();
		}
		return dNSProtocolEndpointElementName_5093Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createDNSProtocolEndpointElementName_5093Parser() {
		EAttribute[] features = new EAttribute[] { CimPackage.eINSTANCE
				.getManagedElement_ElementName(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser wiFiEndpointSettingsElementName_5095Parser;

	/**
	 * @generated
	 */
	private IParser getWiFiEndpointSettingsElementName_5095Parser() {
		if (wiFiEndpointSettingsElementName_5095Parser == null) {
			wiFiEndpointSettingsElementName_5095Parser = createWiFiEndpointSettingsElementName_5095Parser();
		}
		return wiFiEndpointSettingsElementName_5095Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createWiFiEndpointSettingsElementName_5095Parser() {
		EAttribute[] features = new EAttribute[] { CimPackage.eINSTANCE
				.getManagedElement_ElementName(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser sSHSettingDataElementName_5097Parser;

	/**
	 * @generated
	 */
	private IParser getSSHSettingDataElementName_5097Parser() {
		if (sSHSettingDataElementName_5097Parser == null) {
			sSHSettingDataElementName_5097Parser = createSSHSettingDataElementName_5097Parser();
		}
		return sSHSettingDataElementName_5097Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createSSHSettingDataElementName_5097Parser() {
		EAttribute[] features = new EAttribute[] { CimPackage.eINSTANCE
				.getManagedElement_ElementName(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser wirelessLANEndpointElementName_5099Parser;

	/**
	 * @generated
	 */
	private IParser getWirelessLANEndpointElementName_5099Parser() {
		if (wirelessLANEndpointElementName_5099Parser == null) {
			wirelessLANEndpointElementName_5099Parser = createWirelessLANEndpointElementName_5099Parser();
		}
		return wirelessLANEndpointElementName_5099Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createWirelessLANEndpointElementName_5099Parser() {
		EAttribute[] features = new EAttribute[] { CimPackage.eINSTANCE
				.getManagedElement_ElementName(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser dHCPProtocolEndpointElementName_5101Parser;

	/**
	 * @generated
	 */
	private IParser getDHCPProtocolEndpointElementName_5101Parser() {
		if (dHCPProtocolEndpointElementName_5101Parser == null) {
			dHCPProtocolEndpointElementName_5101Parser = createDHCPProtocolEndpointElementName_5101Parser();
		}
		return dHCPProtocolEndpointElementName_5101Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createDHCPProtocolEndpointElementName_5101Parser() {
		EAttribute[] features = new EAttribute[] { CimPackage.eINSTANCE
				.getManagedElement_ElementName(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser iPHeadersFilterElementName_5103Parser;

	/**
	 * @generated
	 */
	private IParser getIPHeadersFilterElementName_5103Parser() {
		if (iPHeadersFilterElementName_5103Parser == null) {
			iPHeadersFilterElementName_5103Parser = createIPHeadersFilterElementName_5103Parser();
		}
		return iPHeadersFilterElementName_5103Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createIPHeadersFilterElementName_5103Parser() {
		EAttribute[] features = new EAttribute[] { CimPackage.eINSTANCE
				.getManagedElement_ElementName(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser directoryElementName_5105Parser;

	/**
	 * @generated
	 */
	private IParser getDirectoryElementName_5105Parser() {
		if (directoryElementName_5105Parser == null) {
			directoryElementName_5105Parser = createDirectoryElementName_5105Parser();
		}
		return directoryElementName_5105Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createDirectoryElementName_5105Parser() {
		EAttribute[] features = new EAttribute[] { CimPackage.eINSTANCE
				.getManagedElement_ElementName(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser iPAddressRangeElementName_5107Parser;

	/**
	 * @generated
	 */
	private IParser getIPAddressRangeElementName_5107Parser() {
		if (iPAddressRangeElementName_5107Parser == null) {
			iPAddressRangeElementName_5107Parser = createIPAddressRangeElementName_5107Parser();
		}
		return iPAddressRangeElementName_5107Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createIPAddressRangeElementName_5107Parser() {
		EAttribute[] features = new EAttribute[] { CimPackage.eINSTANCE
				.getManagedElement_ElementName(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser sNMPTrapTargetElementName_5109Parser;

	/**
	 * @generated
	 */
	private IParser getSNMPTrapTargetElementName_5109Parser() {
		if (sNMPTrapTargetElementName_5109Parser == null) {
			sNMPTrapTargetElementName_5109Parser = createSNMPTrapTargetElementName_5109Parser();
		}
		return sNMPTrapTargetElementName_5109Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createSNMPTrapTargetElementName_5109Parser() {
		EAttribute[] features = new EAttribute[] { CimPackage.eINSTANCE
				.getManagedElement_ElementName(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser iPXConnectivityNetworkElementName_5111Parser;

	/**
	 * @generated
	 */
	private IParser getIPXConnectivityNetworkElementName_5111Parser() {
		if (iPXConnectivityNetworkElementName_5111Parser == null) {
			iPXConnectivityNetworkElementName_5111Parser = createIPXConnectivityNetworkElementName_5111Parser();
		}
		return iPXConnectivityNetworkElementName_5111Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createIPXConnectivityNetworkElementName_5111Parser() {
		EAttribute[] features = new EAttribute[] { CimPackage.eINSTANCE
				.getManagedElement_ElementName(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser connectivityMemberhipSettingDataElementName_5113Parser;

	/**
	 * @generated
	 */
	private IParser getConnectivityMemberhipSettingDataElementName_5113Parser() {
		if (connectivityMemberhipSettingDataElementName_5113Parser == null) {
			connectivityMemberhipSettingDataElementName_5113Parser = createConnectivityMemberhipSettingDataElementName_5113Parser();
		}
		return connectivityMemberhipSettingDataElementName_5113Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createConnectivityMemberhipSettingDataElementName_5113Parser() {
		EAttribute[] features = new EAttribute[] { CimPackage.eINSTANCE
				.getManagedElement_ElementName(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser conditioningServiceElementName_5115Parser;

	/**
	 * @generated
	 */
	private IParser getConditioningServiceElementName_5115Parser() {
		if (conditioningServiceElementName_5115Parser == null) {
			conditioningServiceElementName_5115Parser = createConditioningServiceElementName_5115Parser();
		}
		return conditioningServiceElementName_5115Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createConditioningServiceElementName_5115Parser() {
		EAttribute[] features = new EAttribute[] { CimPackage.eINSTANCE
				.getManagedElement_ElementName(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser bIOSFeatureElementName_5117Parser;

	/**
	 * @generated
	 */
	private IParser getBIOSFeatureElementName_5117Parser() {
		if (bIOSFeatureElementName_5117Parser == null) {
			bIOSFeatureElementName_5117Parser = createBIOSFeatureElementName_5117Parser();
		}
		return bIOSFeatureElementName_5117Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createBIOSFeatureElementName_5117Parser() {
		EAttribute[] features = new EAttribute[] { CimPackage.eINSTANCE
				.getManagedElement_ElementName(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser oSPFProtocolEndpointElementName_5119Parser;

	/**
	 * @generated
	 */
	private IParser getOSPFProtocolEndpointElementName_5119Parser() {
		if (oSPFProtocolEndpointElementName_5119Parser == null) {
			oSPFProtocolEndpointElementName_5119Parser = createOSPFProtocolEndpointElementName_5119Parser();
		}
		return oSPFProtocolEndpointElementName_5119Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createOSPFProtocolEndpointElementName_5119Parser() {
		EAttribute[] features = new EAttribute[] { CimPackage.eINSTANCE
				.getManagedElement_ElementName(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser filterListElementName_5121Parser;

	/**
	 * @generated
	 */
	private IParser getFilterListElementName_5121Parser() {
		if (filterListElementName_5121Parser == null) {
			filterListElementName_5121Parser = createFilterListElementName_5121Parser();
		}
		return filterListElementName_5121Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createFilterListElementName_5121Parser() {
		EAttribute[] features = new EAttribute[] { CimPackage.eINSTANCE
				.getManagedElement_ElementName(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser bGPServiceElementName_5123Parser;

	/**
	 * @generated
	 */
	private IParser getBGPServiceElementName_5123Parser() {
		if (bGPServiceElementName_5123Parser == null) {
			bGPServiceElementName_5123Parser = createBGPServiceElementName_5123Parser();
		}
		return bGPServiceElementName_5123Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createBGPServiceElementName_5123Parser() {
		EAttribute[] features = new EAttribute[] { CimPackage.eINSTANCE
				.getManagedElement_ElementName(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser precedenceServiceElementName_5125Parser;

	/**
	 * @generated
	 */
	private IParser getPrecedenceServiceElementName_5125Parser() {
		if (precedenceServiceElementName_5125Parser == null) {
			precedenceServiceElementName_5125Parser = createPrecedenceServiceElementName_5125Parser();
		}
		return precedenceServiceElementName_5125Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createPrecedenceServiceElementName_5125Parser() {
		EAttribute[] features = new EAttribute[] { CimPackage.eINSTANCE
				.getManagedElement_ElementName(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser dHCPCapabilitiesElementName_5127Parser;

	/**
	 * @generated
	 */
	private IParser getDHCPCapabilitiesElementName_5127Parser() {
		if (dHCPCapabilitiesElementName_5127Parser == null) {
			dHCPCapabilitiesElementName_5127Parser = createDHCPCapabilitiesElementName_5127Parser();
		}
		return dHCPCapabilitiesElementName_5127Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createDHCPCapabilitiesElementName_5127Parser() {
		EAttribute[] features = new EAttribute[] { CimPackage.eINSTANCE
				.getManagedElement_ElementName(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser hdr8021PServiceElementName_5129Parser;

	/**
	 * @generated
	 */
	private IParser getHdr8021PServiceElementName_5129Parser() {
		if (hdr8021PServiceElementName_5129Parser == null) {
			hdr8021PServiceElementName_5129Parser = createHdr8021PServiceElementName_5129Parser();
		}
		return hdr8021PServiceElementName_5129Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createHdr8021PServiceElementName_5129Parser() {
		EAttribute[] features = new EAttribute[] { CimPackage.eINSTANCE
				.getManagedElement_ElementName(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser replacementSetElementName_5131Parser;

	/**
	 * @generated
	 */
	private IParser getReplacementSetElementName_5131Parser() {
		if (replacementSetElementName_5131Parser == null) {
			replacementSetElementName_5131Parser = createReplacementSetElementName_5131Parser();
		}
		return replacementSetElementName_5131Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createReplacementSetElementName_5131Parser() {
		EAttribute[] features = new EAttribute[] { CimPackage.eINSTANCE
				.getManagedElement_ElementName(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser hDSLModemElementName_5133Parser;

	/**
	 * @generated
	 */
	private IParser getHDSLModemElementName_5133Parser() {
		if (hDSLModemElementName_5133Parser == null) {
			hDSLModemElementName_5133Parser = createHDSLModemElementName_5133Parser();
		}
		return hDSLModemElementName_5133Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createHDSLModemElementName_5133Parser() {
		EAttribute[] features = new EAttribute[] { CimPackage.eINSTANCE
				.getManagedElement_ElementName(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser serviceAccessURIElementName_5135Parser;

	/**
	 * @generated
	 */
	private IParser getServiceAccessURIElementName_5135Parser() {
		if (serviceAccessURIElementName_5135Parser == null) {
			serviceAccessURIElementName_5135Parser = createServiceAccessURIElementName_5135Parser();
		}
		return serviceAccessURIElementName_5135Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createServiceAccessURIElementName_5135Parser() {
		EAttribute[] features = new EAttribute[] { CimPackage.eINSTANCE
				.getManagedElement_ElementName(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser filterEntryElementName_5137Parser;

	/**
	 * @generated
	 */
	private IParser getFilterEntryElementName_5137Parser() {
		if (filterEntryElementName_5137Parser == null) {
			filterEntryElementName_5137Parser = createFilterEntryElementName_5137Parser();
		}
		return filterEntryElementName_5137Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createFilterEntryElementName_5137Parser() {
		EAttribute[] features = new EAttribute[] { CimPackage.eINSTANCE
				.getManagedElement_ElementName(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser sNMPCommunityStringsElementName_5139Parser;

	/**
	 * @generated
	 */
	private IParser getSNMPCommunityStringsElementName_5139Parser() {
		if (sNMPCommunityStringsElementName_5139Parser == null) {
			sNMPCommunityStringsElementName_5139Parser = createSNMPCommunityStringsElementName_5139Parser();
		}
		return sNMPCommunityStringsElementName_5139Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createSNMPCommunityStringsElementName_5139Parser() {
		EAttribute[] features = new EAttribute[] { CimPackage.eINSTANCE
				.getManagedElement_ElementName(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser networkElementName_5141Parser;

	/**
	 * @generated
	 */
	private IParser getNetworkElementName_5141Parser() {
		if (networkElementName_5141Parser == null) {
			networkElementName_5141Parser = createNetworkElementName_5141Parser();
		}
		return networkElementName_5141Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createNetworkElementName_5141Parser() {
		EAttribute[] features = new EAttribute[] { CimPackage.eINSTANCE
				.getManagedElement_ElementName(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser fileSpecificationElementName_5143Parser;

	/**
	 * @generated
	 */
	private IParser getFileSpecificationElementName_5143Parser() {
		if (fileSpecificationElementName_5143Parser == null) {
			fileSpecificationElementName_5143Parser = createFileSpecificationElementName_5143Parser();
		}
		return fileSpecificationElementName_5143Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createFileSpecificationElementName_5143Parser() {
		EAttribute[] features = new EAttribute[] { CimPackage.eINSTANCE
				.getManagedElement_ElementName(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser iPXNetworkElementName_5145Parser;

	/**
	 * @generated
	 */
	private IParser getIPXNetworkElementName_5145Parser() {
		if (iPXNetworkElementName_5145Parser == null) {
			iPXNetworkElementName_5145Parser = createIPXNetworkElementName_5145Parser();
		}
		return iPXNetworkElementName_5145Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createIPXNetworkElementName_5145Parser() {
		EAttribute[] features = new EAttribute[] { CimPackage.eINSTANCE
				.getManagedElement_ElementName(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser powerManagementCapabilitiesElementName_5147Parser;

	/**
	 * @generated
	 */
	private IParser getPowerManagementCapabilitiesElementName_5147Parser() {
		if (powerManagementCapabilitiesElementName_5147Parser == null) {
			powerManagementCapabilitiesElementName_5147Parser = createPowerManagementCapabilitiesElementName_5147Parser();
		}
		return powerManagementCapabilitiesElementName_5147Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createPowerManagementCapabilitiesElementName_5147Parser() {
		EAttribute[] features = new EAttribute[] { CimPackage.eINSTANCE
				.getManagedElement_ElementName(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser flowServiceElementName_5149Parser;

	/**
	 * @generated
	 */
	private IParser getFlowServiceElementName_5149Parser() {
		if (flowServiceElementName_5149Parser == null) {
			flowServiceElementName_5149Parser = createFlowServiceElementName_5149Parser();
		}
		return flowServiceElementName_5149Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createFlowServiceElementName_5149Parser() {
		EAttribute[] features = new EAttribute[] { CimPackage.eINSTANCE
				.getManagedElement_ElementName(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser iSDNModemElementName_5151Parser;

	/**
	 * @generated
	 */
	private IParser getISDNModemElementName_5151Parser() {
		if (iSDNModemElementName_5151Parser == null) {
			iSDNModemElementName_5151Parser = createISDNModemElementName_5151Parser();
		}
		return iSDNModemElementName_5151Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createISDNModemElementName_5151Parser() {
		EAttribute[] features = new EAttribute[] { CimPackage.eINSTANCE
				.getManagedElement_ElementName(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser iPXProtocolEndpointElementName_5153Parser;

	/**
	 * @generated
	 */
	private IParser getIPXProtocolEndpointElementName_5153Parser() {
		if (iPXProtocolEndpointElementName_5153Parser == null) {
			iPXProtocolEndpointElementName_5153Parser = createIPXProtocolEndpointElementName_5153Parser();
		}
		return iPXProtocolEndpointElementName_5153Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createIPXProtocolEndpointElementName_5153Parser() {
		EAttribute[] features = new EAttribute[] { CimPackage.eINSTANCE
				.getManagedElement_ElementName(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser iPProtocolEndpointElementName_5155Parser;

	/**
	 * @generated
	 */
	private IParser getIPProtocolEndpointElementName_5155Parser() {
		if (iPProtocolEndpointElementName_5155Parser == null) {
			iPProtocolEndpointElementName_5155Parser = createIPProtocolEndpointElementName_5155Parser();
		}
		return iPProtocolEndpointElementName_5155Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createIPProtocolEndpointElementName_5155Parser() {
		EAttribute[] features = new EAttribute[] { CimPackage.eINSTANCE
				.getManagedElement_ElementName(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser uDPProtocolEndpointElementName_5157Parser;

	/**
	 * @generated
	 */
	private IParser getUDPProtocolEndpointElementName_5157Parser() {
		if (uDPProtocolEndpointElementName_5157Parser == null) {
			uDPProtocolEndpointElementName_5157Parser = createUDPProtocolEndpointElementName_5157Parser();
		}
		return uDPProtocolEndpointElementName_5157Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createUDPProtocolEndpointElementName_5157Parser() {
		EAttribute[] features = new EAttribute[] { CimPackage.eINSTANCE
				.getManagedElement_ElementName(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser productElementName_5159Parser;

	/**
	 * @generated
	 */
	private IParser getProductElementName_5159Parser() {
		if (productElementName_5159Parser == null) {
			productElementName_5159Parser = createProductElementName_5159Parser();
		}
		return productElementName_5159Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createProductElementName_5159Parser() {
		EAttribute[] features = new EAttribute[] { CimPackage.eINSTANCE
				.getManagedElement_ElementName(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser memoryCapacityElementName_5161Parser;

	/**
	 * @generated
	 */
	private IParser getMemoryCapacityElementName_5161Parser() {
		if (memoryCapacityElementName_5161Parser == null) {
			memoryCapacityElementName_5161Parser = createMemoryCapacityElementName_5161Parser();
		}
		return memoryCapacityElementName_5161Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createMemoryCapacityElementName_5161Parser() {
		EAttribute[] features = new EAttribute[] { CimPackage.eINSTANCE
				.getManagedElement_ElementName(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser routingProtocolDomainElementName_5163Parser;

	/**
	 * @generated
	 */
	private IParser getRoutingProtocolDomainElementName_5163Parser() {
		if (routingProtocolDomainElementName_5163Parser == null) {
			routingProtocolDomainElementName_5163Parser = createRoutingProtocolDomainElementName_5163Parser();
		}
		return routingProtocolDomainElementName_5163Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createRoutingProtocolDomainElementName_5163Parser() {
		EAttribute[] features = new EAttribute[] { CimPackage.eINSTANCE
				.getManagedElement_ElementName(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser aFServiceElementName_5165Parser;

	/**
	 * @generated
	 */
	private IParser getAFServiceElementName_5165Parser() {
		if (aFServiceElementName_5165Parser == null) {
			aFServiceElementName_5165Parser = createAFServiceElementName_5165Parser();
		}
		return aFServiceElementName_5165Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createAFServiceElementName_5165Parser() {
		EAttribute[] features = new EAttribute[] { CimPackage.eINSTANCE
				.getManagedElement_ElementName(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser lANSegmentElementName_5167Parser;

	/**
	 * @generated
	 */
	private IParser getLANSegmentElementName_5167Parser() {
		if (lANSegmentElementName_5167Parser == null) {
			lANSegmentElementName_5167Parser = createLANSegmentElementName_5167Parser();
		}
		return lANSegmentElementName_5167Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createLANSegmentElementName_5167Parser() {
		EAttribute[] features = new EAttribute[] { CimPackage.eINSTANCE
				.getManagedElement_ElementName(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser nATStaticSettingsElementName_5169Parser;

	/**
	 * @generated
	 */
	private IParser getNATStaticSettingsElementName_5169Parser() {
		if (nATStaticSettingsElementName_5169Parser == null) {
			nATStaticSettingsElementName_5169Parser = createNATStaticSettingsElementName_5169Parser();
		}
		return nATStaticSettingsElementName_5169Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createNATStaticSettingsElementName_5169Parser() {
		EAttribute[] features = new EAttribute[] { CimPackage.eINSTANCE
				.getManagedElement_ElementName(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser telnetProtocolEndpointElementName_5171Parser;

	/**
	 * @generated
	 */
	private IParser getTelnetProtocolEndpointElementName_5171Parser() {
		if (telnetProtocolEndpointElementName_5171Parser == null) {
			telnetProtocolEndpointElementName_5171Parser = createTelnetProtocolEndpointElementName_5171Parser();
		}
		return telnetProtocolEndpointElementName_5171Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createTelnetProtocolEndpointElementName_5171Parser() {
		EAttribute[] features = new EAttribute[] { CimPackage.eINSTANCE
				.getManagedElement_ElementName(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser lANEndpointElementName_5173Parser;

	/**
	 * @generated
	 */
	private IParser getLANEndpointElementName_5173Parser() {
		if (lANEndpointElementName_5173Parser == null) {
			lANEndpointElementName_5173Parser = createLANEndpointElementName_5173Parser();
		}
		return lANEndpointElementName_5173Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createLANEndpointElementName_5173Parser() {
		EAttribute[] features = new EAttribute[] { CimPackage.eINSTANCE
				.getManagedElement_ElementName(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser dropThresholdCalculationServiceElementName_5175Parser;

	/**
	 * @generated
	 */
	private IParser getDropThresholdCalculationServiceElementName_5175Parser() {
		if (dropThresholdCalculationServiceElementName_5175Parser == null) {
			dropThresholdCalculationServiceElementName_5175Parser = createDropThresholdCalculationServiceElementName_5175Parser();
		}
		return dropThresholdCalculationServiceElementName_5175Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createDropThresholdCalculationServiceElementName_5175Parser() {
		EAttribute[] features = new EAttribute[] { CimPackage.eINSTANCE
				.getManagedElement_ElementName(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser adminDomainElementName_5177Parser;

	/**
	 * @generated
	 */
	private IParser getAdminDomainElementName_5177Parser() {
		if (adminDomainElementName_5177Parser == null) {
			adminDomainElementName_5177Parser = createAdminDomainElementName_5177Parser();
		}
		return adminDomainElementName_5177Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createAdminDomainElementName_5177Parser() {
		EAttribute[] features = new EAttribute[] { CimPackage.eINSTANCE
				.getManagedElement_ElementName(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser systemSpecificCollectionElementName_5179Parser;

	/**
	 * @generated
	 */
	private IParser getSystemSpecificCollectionElementName_5179Parser() {
		if (systemSpecificCollectionElementName_5179Parser == null) {
			systemSpecificCollectionElementName_5179Parser = createSystemSpecificCollectionElementName_5179Parser();
		}
		return systemSpecificCollectionElementName_5179Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createSystemSpecificCollectionElementName_5179Parser() {
		EAttribute[] features = new EAttribute[] { CimPackage.eINSTANCE
				.getManagedElement_ElementName(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser nextHopRoutingElementName_5181Parser;

	/**
	 * @generated
	 */
	private IParser getNextHopRoutingElementName_5181Parser() {
		if (nextHopRoutingElementName_5181Parser == null) {
			nextHopRoutingElementName_5181Parser = createNextHopRoutingElementName_5181Parser();
		}
		return nextHopRoutingElementName_5181Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createNextHopRoutingElementName_5181Parser() {
		EAttribute[] features = new EAttribute[] { CimPackage.eINSTANCE
				.getManagedElement_ElementName(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser computerSystemElementName_5183Parser;

	/**
	 * @generated
	 */
	private IParser getComputerSystemElementName_5183Parser() {
		if (computerSystemElementName_5183Parser == null) {
			computerSystemElementName_5183Parser = createComputerSystemElementName_5183Parser();
		}
		return computerSystemElementName_5183Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createComputerSystemElementName_5183Parser() {
		EAttribute[] features = new EAttribute[] { CimPackage.eINSTANCE
				.getManagedElement_ElementName(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser networkPortElementName_5185Parser;

	/**
	 * @generated
	 */
	private IParser getNetworkPortElementName_5185Parser() {
		if (networkPortElementName_5185Parser == null) {
			networkPortElementName_5185Parser = createNetworkPortElementName_5185Parser();
		}
		return networkPortElementName_5185Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createNetworkPortElementName_5185Parser() {
		EAttribute[] features = new EAttribute[] { CimPackage.eINSTANCE
				.getManagedElement_ElementName(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser remoteServiceAccessPointElementName_5187Parser;

	/**
	 * @generated
	 */
	private IParser getRemoteServiceAccessPointElementName_5187Parser() {
		if (remoteServiceAccessPointElementName_5187Parser == null) {
			remoteServiceAccessPointElementName_5187Parser = createRemoteServiceAccessPointElementName_5187Parser();
		}
		return remoteServiceAccessPointElementName_5187Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createRemoteServiceAccessPointElementName_5187Parser() {
		EAttribute[] features = new EAttribute[] { CimPackage.eINSTANCE
				.getManagedElement_ElementName(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case USBDeviceElementNameEditPart.VISUAL_ID:
			return getUSBDeviceElementName_5001Parser();
		case OSPFVirtualInterfaceElementNameEditPart.VISUAL_ID:
			return getOSPFVirtualInterfaceElementName_5003Parser();
		case WiFiPortElementNameEditPart.VISUAL_ID:
			return getWiFiPortElementName_5005Parser();
		case ProtocolServiceElementNameEditPart.VISUAL_ID:
			return getProtocolServiceElementName_5007Parser();
		case RoutingPolicyElementNameEditPart.VISUAL_ID:
			return getRoutingPolicyElementName_5009Parser();
		case EnabledLogicalElementCapabilitiesElementNameEditPart.VISUAL_ID:
			return getEnabledLogicalElementCapabilitiesElementName_5011Parser();
		case BufferPoolElementNameEditPart.VISUAL_ID:
			return getBufferPoolElementName_5013Parser();
		case MPLSProtocolEndpointElementNameEditPart.VISUAL_ID:
			return getMPLSProtocolEndpointElementName_5015Parser();
		case AutonomousSystemElementNameEditPart.VISUAL_ID:
			return getAutonomousSystemElementName_5017Parser();
		case DNSSettingDataElementNameEditPart.VISUAL_ID:
			return getDNSSettingDataElementName_5019Parser();
		case UniModemElementNameEditPart.VISUAL_ID:
			return getUniModemElementName_5021Parser();
		case EFServiceElementNameEditPart.VISUAL_ID:
			return getEFServiceElementName_5023Parser();
		case IPSubnetElementNameEditPart.VISUAL_ID:
			return getIPSubnetElementName_5025Parser();
		case NamedAddressCollectionElementNameEditPart.VISUAL_ID:
			return getNamedAddressCollectionElementName_5027Parser();
		case BIOSElementElementNameEditPart.VISUAL_ID:
			return getBIOSElementElementName_5029Parser();
		case TelnetSettingDataElementNameEditPart.VISUAL_ID:
			return getTelnetSettingDataElementName_5031Parser();
		case BGPPeerGroupElementNameEditPart.VISUAL_ID:
			return getBGPPeerGroupElementName_5033Parser();
		case LANConnectivitySegmentElementNameEditPart.VISUAL_ID:
			return getLANConnectivitySegmentElementName_5035Parser();
		case CableModemElementNameEditPart.VISUAL_ID:
			return getCableModemElementName_5037Parser();
		case SwitchPortElementNameEditPart.VISUAL_ID:
			return getSwitchPortElementName_5039Parser();
		case TCPProtocolEndpointElementNameEditPart.VISUAL_ID:
			return getTCPProtocolEndpointElementName_5041Parser();
		case AdministrativeDistanceElementNameEditPart.VISUAL_ID:
			return getAdministrativeDistanceElementName_5043Parser();
		case IPConnectivitySubnetElementNameEditPart.VISUAL_ID:
			return getIPConnectivitySubnetElementName_5045Parser();
		case VolatileStorageElementNameEditPart.VISUAL_ID:
			return getVolatileStorageElementName_5047Parser();
		case RangeOfIPAddressesElementNameEditPart.VISUAL_ID:
			return getRangeOfIPAddressesElementName_5049Parser();
		case BGPProtocolEndpointElementNameEditPart.VISUAL_ID:
			return getBGPProtocolEndpointElementName_5051Parser();
		case UnitaryComputerSystemElementNameEditPart.VISUAL_ID:
			return getUnitaryComputerSystemElementName_5053Parser();
		case EthernetPortElementNameEditPart.VISUAL_ID:
			return getEthernetPortElementName_5055Parser();
		case SNMPServiceElementNameEditPart.VISUAL_ID:
			return getSNMPServiceElementName_5057Parser();
		case LogicalModuleElementNameEditPart.VISUAL_ID:
			return getLogicalModuleElementName_5059Parser();
		case NextHopIPRouteElementNameEditPart.VISUAL_ID:
			return getNextHopIPRouteElementName_5061Parser();
		case OperatingSystemElementNameEditPart.VISUAL_ID:
			return getOperatingSystemElementName_5063Parser();
		case SDSLModemElementNameEditPart.VISUAL_ID:
			return getSDSLModemElementName_5065Parser();
		case WiFiEndPointElementNameEditPart.VISUAL_ID:
			return getWiFiEndPointElementName_5067Parser();
		case NATServiceElementNameEditPart.VISUAL_ID:
			return getNATServiceElementName_5069Parser();
		case ADSLModemElementNameEditPart.VISUAL_ID:
			return getADSLModemElementName_5071Parser();
		case LogicalFileElementNameEditPart.VISUAL_ID:
			return getLogicalFileElementName_5073Parser();
		case BGPClusterElementNameEditPart.VISUAL_ID:
			return getBGPClusterElementName_5075Parser();
		case ApplicationSystemElementNameEditPart.VISUAL_ID:
			return getApplicationSystemElementName_5077Parser();
		case SoftwareIdentityElementNameEditPart.VISUAL_ID:
			return getSoftwareIdentityElementName_5079Parser();
		case WirelessPortElementNameEditPart.VISUAL_ID:
			return getWirelessPortElementName_5081Parser();
		case CLPSettingDataElementNameEditPart.VISUAL_ID:
			return getCLPSettingDataElementName_5083Parser();
		case GenericServiceElementNameEditPart.VISUAL_ID:
			return getGenericServiceElementName_5085Parser();
		case NATListBasedSettingsElementNameEditPart.VISUAL_ID:
			return getNATListBasedSettingsElementName_5087Parser();
		case VDSLModemElementNameEditPart.VISUAL_ID:
			return getVDSLModemElementName_5089Parser();
		case USBPortElementNameEditPart.VISUAL_ID:
			return getUSBPortElementName_5091Parser();
		case DNSProtocolEndpointElementNameEditPart.VISUAL_ID:
			return getDNSProtocolEndpointElementName_5093Parser();
		case WiFiEndpointSettingsElementNameEditPart.VISUAL_ID:
			return getWiFiEndpointSettingsElementName_5095Parser();
		case SSHSettingDataElementNameEditPart.VISUAL_ID:
			return getSSHSettingDataElementName_5097Parser();
		case WirelessLANEndpointElementNameEditPart.VISUAL_ID:
			return getWirelessLANEndpointElementName_5099Parser();
		case DHCPProtocolEndpointElementNameEditPart.VISUAL_ID:
			return getDHCPProtocolEndpointElementName_5101Parser();
		case IPHeadersFilterElementNameEditPart.VISUAL_ID:
			return getIPHeadersFilterElementName_5103Parser();
		case DirectoryElementNameEditPart.VISUAL_ID:
			return getDirectoryElementName_5105Parser();
		case IPAddressRangeElementNameEditPart.VISUAL_ID:
			return getIPAddressRangeElementName_5107Parser();
		case SNMPTrapTargetElementNameEditPart.VISUAL_ID:
			return getSNMPTrapTargetElementName_5109Parser();
		case IPXConnectivityNetworkElementNameEditPart.VISUAL_ID:
			return getIPXConnectivityNetworkElementName_5111Parser();
		case ConnectivityMemberhipSettingDataElementNameEditPart.VISUAL_ID:
			return getConnectivityMemberhipSettingDataElementName_5113Parser();
		case ConditioningServiceElementNameEditPart.VISUAL_ID:
			return getConditioningServiceElementName_5115Parser();
		case BIOSFeatureElementNameEditPart.VISUAL_ID:
			return getBIOSFeatureElementName_5117Parser();
		case OSPFProtocolEndpointElementNameEditPart.VISUAL_ID:
			return getOSPFProtocolEndpointElementName_5119Parser();
		case FilterListElementNameEditPart.VISUAL_ID:
			return getFilterListElementName_5121Parser();
		case BGPServiceElementNameEditPart.VISUAL_ID:
			return getBGPServiceElementName_5123Parser();
		case PrecedenceServiceElementNameEditPart.VISUAL_ID:
			return getPrecedenceServiceElementName_5125Parser();
		case DHCPCapabilitiesElementNameEditPart.VISUAL_ID:
			return getDHCPCapabilitiesElementName_5127Parser();
		case Hdr8021PServiceElementNameEditPart.VISUAL_ID:
			return getHdr8021PServiceElementName_5129Parser();
		case ReplacementSetElementNameEditPart.VISUAL_ID:
			return getReplacementSetElementName_5131Parser();
		case HDSLModemElementNameEditPart.VISUAL_ID:
			return getHDSLModemElementName_5133Parser();
		case ServiceAccessURIElementNameEditPart.VISUAL_ID:
			return getServiceAccessURIElementName_5135Parser();
		case FilterEntryElementNameEditPart.VISUAL_ID:
			return getFilterEntryElementName_5137Parser();
		case SNMPCommunityStringsElementNameEditPart.VISUAL_ID:
			return getSNMPCommunityStringsElementName_5139Parser();
		case NetworkElementNameEditPart.VISUAL_ID:
			return getNetworkElementName_5141Parser();
		case FileSpecificationElementNameEditPart.VISUAL_ID:
			return getFileSpecificationElementName_5143Parser();
		case IPXNetworkElementNameEditPart.VISUAL_ID:
			return getIPXNetworkElementName_5145Parser();
		case PowerManagementCapabilitiesElementNameEditPart.VISUAL_ID:
			return getPowerManagementCapabilitiesElementName_5147Parser();
		case FlowServiceElementNameEditPart.VISUAL_ID:
			return getFlowServiceElementName_5149Parser();
		case ISDNModemElementNameEditPart.VISUAL_ID:
			return getISDNModemElementName_5151Parser();
		case IPXProtocolEndpointElementNameEditPart.VISUAL_ID:
			return getIPXProtocolEndpointElementName_5153Parser();
		case IPProtocolEndpointElementNameEditPart.VISUAL_ID:
			return getIPProtocolEndpointElementName_5155Parser();
		case UDPProtocolEndpointElementNameEditPart.VISUAL_ID:
			return getUDPProtocolEndpointElementName_5157Parser();
		case ProductElementNameEditPart.VISUAL_ID:
			return getProductElementName_5159Parser();
		case MemoryCapacityElementNameEditPart.VISUAL_ID:
			return getMemoryCapacityElementName_5161Parser();
		case RoutingProtocolDomainElementNameEditPart.VISUAL_ID:
			return getRoutingProtocolDomainElementName_5163Parser();
		case AFServiceElementNameEditPart.VISUAL_ID:
			return getAFServiceElementName_5165Parser();
		case LANSegmentElementNameEditPart.VISUAL_ID:
			return getLANSegmentElementName_5167Parser();
		case NATStaticSettingsElementNameEditPart.VISUAL_ID:
			return getNATStaticSettingsElementName_5169Parser();
		case TelnetProtocolEndpointElementNameEditPart.VISUAL_ID:
			return getTelnetProtocolEndpointElementName_5171Parser();
		case LANEndpointElementNameEditPart.VISUAL_ID:
			return getLANEndpointElementName_5173Parser();
		case DropThresholdCalculationServiceElementNameEditPart.VISUAL_ID:
			return getDropThresholdCalculationServiceElementName_5175Parser();
		case AdminDomainElementNameEditPart.VISUAL_ID:
			return getAdminDomainElementName_5177Parser();
		case SystemSpecificCollectionElementNameEditPart.VISUAL_ID:
			return getSystemSpecificCollectionElementName_5179Parser();
		case NextHopRoutingElementNameEditPart.VISUAL_ID:
			return getNextHopRoutingElementName_5181Parser();
		case ComputerSystemElementNameEditPart.VISUAL_ID:
			return getComputerSystemElementName_5183Parser();
		case NetworkPortElementNameEditPart.VISUAL_ID:
			return getNetworkPortElementName_5185Parser();
		case RemoteServiceAccessPointElementNameEditPart.VISUAL_ID:
			return getRemoteServiceAccessPointElementName_5187Parser();
		}
		return null;
	}

	/**
	 * @generated
	 */
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(CIMLevelZeroVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(CIMLevelZeroVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (CIMLevelZeroElementTypes.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static class HintAdapter extends ParserHintAdapter {

		/**
		 * @generated
		 */
		private final IElementType elementType;

		/**
		 * @generated
		 */
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		 * @generated
		 */
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
