package es.tid.cim.diagram.edit.parts;

import org.eclipse.draw2d.FigureUtilities;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Text;

import es.tid.cim.diagram.part.CIMLevelZeroVisualIDRegistry;

/**
 * @generated
 */
public class CIMLevelZeroEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (CIMLevelZeroVisualIDRegistry.getVisualID(view)) {

			case CIM_ModelEditPart.VISUAL_ID:
				return new CIM_ModelEditPart(view);

			case USBDeviceEditPart.VISUAL_ID:
				return new USBDeviceEditPart(view);

			case USBDeviceElementNameEditPart.VISUAL_ID:
				return new USBDeviceElementNameEditPart(view);

			case WrappingLabelEditPart.VISUAL_ID:
				return new WrappingLabelEditPart(view);

			case OSPFVirtualInterfaceEditPart.VISUAL_ID:
				return new OSPFVirtualInterfaceEditPart(view);

			case OSPFVirtualInterfaceElementNameEditPart.VISUAL_ID:
				return new OSPFVirtualInterfaceElementNameEditPart(view);

			case WrappingLabel2EditPart.VISUAL_ID:
				return new WrappingLabel2EditPart(view);

			case WiFiPortEditPart.VISUAL_ID:
				return new WiFiPortEditPart(view);

			case WiFiPortElementNameEditPart.VISUAL_ID:
				return new WiFiPortElementNameEditPart(view);

			case WrappingLabel3EditPart.VISUAL_ID:
				return new WrappingLabel3EditPart(view);

			case ProtocolServiceEditPart.VISUAL_ID:
				return new ProtocolServiceEditPart(view);

			case ProtocolServiceElementNameEditPart.VISUAL_ID:
				return new ProtocolServiceElementNameEditPart(view);

			case WrappingLabel4EditPart.VISUAL_ID:
				return new WrappingLabel4EditPart(view);

			case RoutingPolicyEditPart.VISUAL_ID:
				return new RoutingPolicyEditPart(view);

			case RoutingPolicyElementNameEditPart.VISUAL_ID:
				return new RoutingPolicyElementNameEditPart(view);

			case WrappingLabel5EditPart.VISUAL_ID:
				return new WrappingLabel5EditPart(view);

			case EnabledLogicalElementCapabilitiesEditPart.VISUAL_ID:
				return new EnabledLogicalElementCapabilitiesEditPart(view);

			case EnabledLogicalElementCapabilitiesElementNameEditPart.VISUAL_ID:
				return new EnabledLogicalElementCapabilitiesElementNameEditPart(
						view);

			case WrappingLabel6EditPart.VISUAL_ID:
				return new WrappingLabel6EditPart(view);

			case BufferPoolEditPart.VISUAL_ID:
				return new BufferPoolEditPart(view);

			case BufferPoolElementNameEditPart.VISUAL_ID:
				return new BufferPoolElementNameEditPart(view);

			case WrappingLabel7EditPart.VISUAL_ID:
				return new WrappingLabel7EditPart(view);

			case MPLSProtocolEndpointEditPart.VISUAL_ID:
				return new MPLSProtocolEndpointEditPart(view);

			case MPLSProtocolEndpointElementNameEditPart.VISUAL_ID:
				return new MPLSProtocolEndpointElementNameEditPart(view);

			case WrappingLabel8EditPart.VISUAL_ID:
				return new WrappingLabel8EditPart(view);

			case AutonomousSystemEditPart.VISUAL_ID:
				return new AutonomousSystemEditPart(view);

			case AutonomousSystemElementNameEditPart.VISUAL_ID:
				return new AutonomousSystemElementNameEditPart(view);

			case WrappingLabel9EditPart.VISUAL_ID:
				return new WrappingLabel9EditPart(view);

			case DNSSettingDataEditPart.VISUAL_ID:
				return new DNSSettingDataEditPart(view);

			case DNSSettingDataElementNameEditPart.VISUAL_ID:
				return new DNSSettingDataElementNameEditPart(view);

			case WrappingLabel10EditPart.VISUAL_ID:
				return new WrappingLabel10EditPart(view);

			case UniModemEditPart.VISUAL_ID:
				return new UniModemEditPart(view);

			case UniModemElementNameEditPart.VISUAL_ID:
				return new UniModemElementNameEditPart(view);

			case WrappingLabel11EditPart.VISUAL_ID:
				return new WrappingLabel11EditPart(view);

			case EFServiceEditPart.VISUAL_ID:
				return new EFServiceEditPart(view);

			case EFServiceElementNameEditPart.VISUAL_ID:
				return new EFServiceElementNameEditPart(view);

			case WrappingLabel12EditPart.VISUAL_ID:
				return new WrappingLabel12EditPart(view);

			case IPSubnetEditPart.VISUAL_ID:
				return new IPSubnetEditPart(view);

			case IPSubnetElementNameEditPart.VISUAL_ID:
				return new IPSubnetElementNameEditPart(view);

			case WrappingLabel13EditPart.VISUAL_ID:
				return new WrappingLabel13EditPart(view);

			case NamedAddressCollectionEditPart.VISUAL_ID:
				return new NamedAddressCollectionEditPart(view);

			case NamedAddressCollectionElementNameEditPart.VISUAL_ID:
				return new NamedAddressCollectionElementNameEditPart(view);

			case WrappingLabel14EditPart.VISUAL_ID:
				return new WrappingLabel14EditPart(view);

			case BIOSElementEditPart.VISUAL_ID:
				return new BIOSElementEditPart(view);

			case BIOSElementElementNameEditPart.VISUAL_ID:
				return new BIOSElementElementNameEditPart(view);

			case WrappingLabel15EditPart.VISUAL_ID:
				return new WrappingLabel15EditPart(view);

			case TelnetSettingDataEditPart.VISUAL_ID:
				return new TelnetSettingDataEditPart(view);

			case TelnetSettingDataElementNameEditPart.VISUAL_ID:
				return new TelnetSettingDataElementNameEditPart(view);

			case WrappingLabel16EditPart.VISUAL_ID:
				return new WrappingLabel16EditPart(view);

			case BGPPeerGroupEditPart.VISUAL_ID:
				return new BGPPeerGroupEditPart(view);

			case BGPPeerGroupElementNameEditPart.VISUAL_ID:
				return new BGPPeerGroupElementNameEditPart(view);

			case WrappingLabel17EditPart.VISUAL_ID:
				return new WrappingLabel17EditPart(view);

			case LANConnectivitySegmentEditPart.VISUAL_ID:
				return new LANConnectivitySegmentEditPart(view);

			case LANConnectivitySegmentElementNameEditPart.VISUAL_ID:
				return new LANConnectivitySegmentElementNameEditPart(view);

			case WrappingLabel18EditPart.VISUAL_ID:
				return new WrappingLabel18EditPart(view);

			case CableModemEditPart.VISUAL_ID:
				return new CableModemEditPart(view);

			case CableModemElementNameEditPart.VISUAL_ID:
				return new CableModemElementNameEditPart(view);

			case WrappingLabel19EditPart.VISUAL_ID:
				return new WrappingLabel19EditPart(view);

			case SwitchPortEditPart.VISUAL_ID:
				return new SwitchPortEditPart(view);

			case SwitchPortElementNameEditPart.VISUAL_ID:
				return new SwitchPortElementNameEditPart(view);

			case WrappingLabel20EditPart.VISUAL_ID:
				return new WrappingLabel20EditPart(view);

			case TCPProtocolEndpointEditPart.VISUAL_ID:
				return new TCPProtocolEndpointEditPart(view);

			case TCPProtocolEndpointElementNameEditPart.VISUAL_ID:
				return new TCPProtocolEndpointElementNameEditPart(view);

			case WrappingLabel21EditPart.VISUAL_ID:
				return new WrappingLabel21EditPart(view);

			case AdministrativeDistanceEditPart.VISUAL_ID:
				return new AdministrativeDistanceEditPart(view);

			case AdministrativeDistanceElementNameEditPart.VISUAL_ID:
				return new AdministrativeDistanceElementNameEditPart(view);

			case WrappingLabel22EditPart.VISUAL_ID:
				return new WrappingLabel22EditPart(view);

			case IPConnectivitySubnetEditPart.VISUAL_ID:
				return new IPConnectivitySubnetEditPart(view);

			case IPConnectivitySubnetElementNameEditPart.VISUAL_ID:
				return new IPConnectivitySubnetElementNameEditPart(view);

			case WrappingLabel23EditPart.VISUAL_ID:
				return new WrappingLabel23EditPart(view);

			case VolatileStorageEditPart.VISUAL_ID:
				return new VolatileStorageEditPart(view);

			case VolatileStorageElementNameEditPart.VISUAL_ID:
				return new VolatileStorageElementNameEditPart(view);

			case WrappingLabel24EditPart.VISUAL_ID:
				return new WrappingLabel24EditPart(view);

			case RangeOfIPAddressesEditPart.VISUAL_ID:
				return new RangeOfIPAddressesEditPart(view);

			case RangeOfIPAddressesElementNameEditPart.VISUAL_ID:
				return new RangeOfIPAddressesElementNameEditPart(view);

			case WrappingLabel25EditPart.VISUAL_ID:
				return new WrappingLabel25EditPart(view);

			case BGPProtocolEndpointEditPart.VISUAL_ID:
				return new BGPProtocolEndpointEditPart(view);

			case BGPProtocolEndpointElementNameEditPart.VISUAL_ID:
				return new BGPProtocolEndpointElementNameEditPart(view);

			case WrappingLabel26EditPart.VISUAL_ID:
				return new WrappingLabel26EditPart(view);

			case UnitaryComputerSystemEditPart.VISUAL_ID:
				return new UnitaryComputerSystemEditPart(view);

			case UnitaryComputerSystemElementNameEditPart.VISUAL_ID:
				return new UnitaryComputerSystemElementNameEditPart(view);

			case WrappingLabel27EditPart.VISUAL_ID:
				return new WrappingLabel27EditPart(view);

			case EthernetPortEditPart.VISUAL_ID:
				return new EthernetPortEditPart(view);

			case EthernetPortElementNameEditPart.VISUAL_ID:
				return new EthernetPortElementNameEditPart(view);

			case WrappingLabel28EditPart.VISUAL_ID:
				return new WrappingLabel28EditPart(view);

			case SNMPServiceEditPart.VISUAL_ID:
				return new SNMPServiceEditPart(view);

			case SNMPServiceElementNameEditPart.VISUAL_ID:
				return new SNMPServiceElementNameEditPart(view);

			case WrappingLabel29EditPart.VISUAL_ID:
				return new WrappingLabel29EditPart(view);

			case LogicalModuleEditPart.VISUAL_ID:
				return new LogicalModuleEditPart(view);

			case LogicalModuleElementNameEditPart.VISUAL_ID:
				return new LogicalModuleElementNameEditPart(view);

			case WrappingLabel30EditPart.VISUAL_ID:
				return new WrappingLabel30EditPart(view);

			case NextHopIPRouteEditPart.VISUAL_ID:
				return new NextHopIPRouteEditPart(view);

			case NextHopIPRouteElementNameEditPart.VISUAL_ID:
				return new NextHopIPRouteElementNameEditPart(view);

			case WrappingLabel31EditPart.VISUAL_ID:
				return new WrappingLabel31EditPart(view);

			case OperatingSystemEditPart.VISUAL_ID:
				return new OperatingSystemEditPart(view);

			case OperatingSystemElementNameEditPart.VISUAL_ID:
				return new OperatingSystemElementNameEditPart(view);

			case WrappingLabel32EditPart.VISUAL_ID:
				return new WrappingLabel32EditPart(view);

			case SDSLModemEditPart.VISUAL_ID:
				return new SDSLModemEditPart(view);

			case SDSLModemElementNameEditPart.VISUAL_ID:
				return new SDSLModemElementNameEditPart(view);

			case WrappingLabel33EditPart.VISUAL_ID:
				return new WrappingLabel33EditPart(view);

			case WiFiEndPointEditPart.VISUAL_ID:
				return new WiFiEndPointEditPart(view);

			case WiFiEndPointElementNameEditPart.VISUAL_ID:
				return new WiFiEndPointElementNameEditPart(view);

			case WrappingLabel34EditPart.VISUAL_ID:
				return new WrappingLabel34EditPart(view);

			case NATServiceEditPart.VISUAL_ID:
				return new NATServiceEditPart(view);

			case NATServiceElementNameEditPart.VISUAL_ID:
				return new NATServiceElementNameEditPart(view);

			case WrappingLabel35EditPart.VISUAL_ID:
				return new WrappingLabel35EditPart(view);

			case ADSLModemEditPart.VISUAL_ID:
				return new ADSLModemEditPart(view);

			case ADSLModemElementNameEditPart.VISUAL_ID:
				return new ADSLModemElementNameEditPart(view);

			case WrappingLabel36EditPart.VISUAL_ID:
				return new WrappingLabel36EditPart(view);

			case LogicalFileEditPart.VISUAL_ID:
				return new LogicalFileEditPart(view);

			case LogicalFileElementNameEditPart.VISUAL_ID:
				return new LogicalFileElementNameEditPart(view);

			case WrappingLabel37EditPart.VISUAL_ID:
				return new WrappingLabel37EditPart(view);

			case BGPClusterEditPart.VISUAL_ID:
				return new BGPClusterEditPart(view);

			case BGPClusterElementNameEditPart.VISUAL_ID:
				return new BGPClusterElementNameEditPart(view);

			case WrappingLabel38EditPart.VISUAL_ID:
				return new WrappingLabel38EditPart(view);

			case ApplicationSystemEditPart.VISUAL_ID:
				return new ApplicationSystemEditPart(view);

			case ApplicationSystemElementNameEditPart.VISUAL_ID:
				return new ApplicationSystemElementNameEditPart(view);

			case WrappingLabel39EditPart.VISUAL_ID:
				return new WrappingLabel39EditPart(view);

			case SoftwareIdentityEditPart.VISUAL_ID:
				return new SoftwareIdentityEditPart(view);

			case SoftwareIdentityElementNameEditPart.VISUAL_ID:
				return new SoftwareIdentityElementNameEditPart(view);

			case WrappingLabel40EditPart.VISUAL_ID:
				return new WrappingLabel40EditPart(view);

			case WirelessPortEditPart.VISUAL_ID:
				return new WirelessPortEditPart(view);

			case WirelessPortElementNameEditPart.VISUAL_ID:
				return new WirelessPortElementNameEditPart(view);

			case WrappingLabel41EditPart.VISUAL_ID:
				return new WrappingLabel41EditPart(view);

			case CLPSettingDataEditPart.VISUAL_ID:
				return new CLPSettingDataEditPart(view);

			case CLPSettingDataElementNameEditPart.VISUAL_ID:
				return new CLPSettingDataElementNameEditPart(view);

			case WrappingLabel42EditPart.VISUAL_ID:
				return new WrappingLabel42EditPart(view);

			case GenericServiceEditPart.VISUAL_ID:
				return new GenericServiceEditPart(view);

			case GenericServiceElementNameEditPart.VISUAL_ID:
				return new GenericServiceElementNameEditPart(view);

			case WrappingLabel43EditPart.VISUAL_ID:
				return new WrappingLabel43EditPart(view);

			case NATListBasedSettingsEditPart.VISUAL_ID:
				return new NATListBasedSettingsEditPart(view);

			case NATListBasedSettingsElementNameEditPart.VISUAL_ID:
				return new NATListBasedSettingsElementNameEditPart(view);

			case WrappingLabel44EditPart.VISUAL_ID:
				return new WrappingLabel44EditPart(view);

			case VDSLModemEditPart.VISUAL_ID:
				return new VDSLModemEditPart(view);

			case VDSLModemElementNameEditPart.VISUAL_ID:
				return new VDSLModemElementNameEditPart(view);

			case WrappingLabel45EditPart.VISUAL_ID:
				return new WrappingLabel45EditPart(view);

			case USBPortEditPart.VISUAL_ID:
				return new USBPortEditPart(view);

			case USBPortElementNameEditPart.VISUAL_ID:
				return new USBPortElementNameEditPart(view);

			case WrappingLabel46EditPart.VISUAL_ID:
				return new WrappingLabel46EditPart(view);

			case DNSProtocolEndpointEditPart.VISUAL_ID:
				return new DNSProtocolEndpointEditPart(view);

			case DNSProtocolEndpointElementNameEditPart.VISUAL_ID:
				return new DNSProtocolEndpointElementNameEditPart(view);

			case WrappingLabel47EditPart.VISUAL_ID:
				return new WrappingLabel47EditPart(view);

			case WiFiEndpointSettingsEditPart.VISUAL_ID:
				return new WiFiEndpointSettingsEditPart(view);

			case WiFiEndpointSettingsElementNameEditPart.VISUAL_ID:
				return new WiFiEndpointSettingsElementNameEditPart(view);

			case WrappingLabel48EditPart.VISUAL_ID:
				return new WrappingLabel48EditPart(view);

			case SSHSettingDataEditPart.VISUAL_ID:
				return new SSHSettingDataEditPart(view);

			case SSHSettingDataElementNameEditPart.VISUAL_ID:
				return new SSHSettingDataElementNameEditPart(view);

			case WrappingLabel49EditPart.VISUAL_ID:
				return new WrappingLabel49EditPart(view);

			case WirelessLANEndpointEditPart.VISUAL_ID:
				return new WirelessLANEndpointEditPart(view);

			case WirelessLANEndpointElementNameEditPart.VISUAL_ID:
				return new WirelessLANEndpointElementNameEditPart(view);

			case WrappingLabel50EditPart.VISUAL_ID:
				return new WrappingLabel50EditPart(view);

			case DHCPProtocolEndpointEditPart.VISUAL_ID:
				return new DHCPProtocolEndpointEditPart(view);

			case DHCPProtocolEndpointElementNameEditPart.VISUAL_ID:
				return new DHCPProtocolEndpointElementNameEditPart(view);

			case WrappingLabel51EditPart.VISUAL_ID:
				return new WrappingLabel51EditPart(view);

			case IPHeadersFilterEditPart.VISUAL_ID:
				return new IPHeadersFilterEditPart(view);

			case IPHeadersFilterElementNameEditPart.VISUAL_ID:
				return new IPHeadersFilterElementNameEditPart(view);

			case WrappingLabel52EditPart.VISUAL_ID:
				return new WrappingLabel52EditPart(view);

			case DirectoryEditPart.VISUAL_ID:
				return new DirectoryEditPart(view);

			case DirectoryElementNameEditPart.VISUAL_ID:
				return new DirectoryElementNameEditPart(view);

			case WrappingLabel53EditPart.VISUAL_ID:
				return new WrappingLabel53EditPart(view);

			case IPAddressRangeEditPart.VISUAL_ID:
				return new IPAddressRangeEditPart(view);

			case IPAddressRangeElementNameEditPart.VISUAL_ID:
				return new IPAddressRangeElementNameEditPart(view);

			case WrappingLabel54EditPart.VISUAL_ID:
				return new WrappingLabel54EditPart(view);

			case SNMPTrapTargetEditPart.VISUAL_ID:
				return new SNMPTrapTargetEditPart(view);

			case SNMPTrapTargetElementNameEditPart.VISUAL_ID:
				return new SNMPTrapTargetElementNameEditPart(view);

			case WrappingLabel55EditPart.VISUAL_ID:
				return new WrappingLabel55EditPart(view);

			case IPXConnectivityNetworkEditPart.VISUAL_ID:
				return new IPXConnectivityNetworkEditPart(view);

			case IPXConnectivityNetworkElementNameEditPart.VISUAL_ID:
				return new IPXConnectivityNetworkElementNameEditPart(view);

			case WrappingLabel56EditPart.VISUAL_ID:
				return new WrappingLabel56EditPart(view);

			case ConnectivityMemberhipSettingDataEditPart.VISUAL_ID:
				return new ConnectivityMemberhipSettingDataEditPart(view);

			case ConnectivityMemberhipSettingDataElementNameEditPart.VISUAL_ID:
				return new ConnectivityMemberhipSettingDataElementNameEditPart(
						view);

			case WrappingLabel57EditPart.VISUAL_ID:
				return new WrappingLabel57EditPart(view);

			case ConditioningServiceEditPart.VISUAL_ID:
				return new ConditioningServiceEditPart(view);

			case ConditioningServiceElementNameEditPart.VISUAL_ID:
				return new ConditioningServiceElementNameEditPart(view);

			case WrappingLabel58EditPart.VISUAL_ID:
				return new WrappingLabel58EditPart(view);

			case BIOSFeatureEditPart.VISUAL_ID:
				return new BIOSFeatureEditPart(view);

			case BIOSFeatureElementNameEditPart.VISUAL_ID:
				return new BIOSFeatureElementNameEditPart(view);

			case WrappingLabel59EditPart.VISUAL_ID:
				return new WrappingLabel59EditPart(view);

			case OSPFProtocolEndpointEditPart.VISUAL_ID:
				return new OSPFProtocolEndpointEditPart(view);

			case OSPFProtocolEndpointElementNameEditPart.VISUAL_ID:
				return new OSPFProtocolEndpointElementNameEditPart(view);

			case WrappingLabel60EditPart.VISUAL_ID:
				return new WrappingLabel60EditPart(view);

			case FilterListEditPart.VISUAL_ID:
				return new FilterListEditPart(view);

			case FilterListElementNameEditPart.VISUAL_ID:
				return new FilterListElementNameEditPart(view);

			case WrappingLabel61EditPart.VISUAL_ID:
				return new WrappingLabel61EditPart(view);

			case BGPServiceEditPart.VISUAL_ID:
				return new BGPServiceEditPart(view);

			case BGPServiceElementNameEditPart.VISUAL_ID:
				return new BGPServiceElementNameEditPart(view);

			case WrappingLabel62EditPart.VISUAL_ID:
				return new WrappingLabel62EditPart(view);

			case PrecedenceServiceEditPart.VISUAL_ID:
				return new PrecedenceServiceEditPart(view);

			case PrecedenceServiceElementNameEditPart.VISUAL_ID:
				return new PrecedenceServiceElementNameEditPart(view);

			case WrappingLabel63EditPart.VISUAL_ID:
				return new WrappingLabel63EditPart(view);

			case DHCPCapabilitiesEditPart.VISUAL_ID:
				return new DHCPCapabilitiesEditPart(view);

			case DHCPCapabilitiesElementNameEditPart.VISUAL_ID:
				return new DHCPCapabilitiesElementNameEditPart(view);

			case WrappingLabel64EditPart.VISUAL_ID:
				return new WrappingLabel64EditPart(view);

			case Hdr8021PServiceEditPart.VISUAL_ID:
				return new Hdr8021PServiceEditPart(view);

			case Hdr8021PServiceElementNameEditPart.VISUAL_ID:
				return new Hdr8021PServiceElementNameEditPart(view);

			case WrappingLabel65EditPart.VISUAL_ID:
				return new WrappingLabel65EditPart(view);

			case ReplacementSetEditPart.VISUAL_ID:
				return new ReplacementSetEditPart(view);

			case ReplacementSetElementNameEditPart.VISUAL_ID:
				return new ReplacementSetElementNameEditPart(view);

			case WrappingLabel66EditPart.VISUAL_ID:
				return new WrappingLabel66EditPart(view);

			case HDSLModemEditPart.VISUAL_ID:
				return new HDSLModemEditPart(view);

			case HDSLModemElementNameEditPart.VISUAL_ID:
				return new HDSLModemElementNameEditPart(view);

			case WrappingLabel67EditPart.VISUAL_ID:
				return new WrappingLabel67EditPart(view);

			case ServiceAccessURIEditPart.VISUAL_ID:
				return new ServiceAccessURIEditPart(view);

			case ServiceAccessURIElementNameEditPart.VISUAL_ID:
				return new ServiceAccessURIElementNameEditPart(view);

			case WrappingLabel68EditPart.VISUAL_ID:
				return new WrappingLabel68EditPart(view);

			case FilterEntryEditPart.VISUAL_ID:
				return new FilterEntryEditPart(view);

			case FilterEntryElementNameEditPart.VISUAL_ID:
				return new FilterEntryElementNameEditPart(view);

			case WrappingLabel69EditPart.VISUAL_ID:
				return new WrappingLabel69EditPart(view);

			case SNMPCommunityStringsEditPart.VISUAL_ID:
				return new SNMPCommunityStringsEditPart(view);

			case SNMPCommunityStringsElementNameEditPart.VISUAL_ID:
				return new SNMPCommunityStringsElementNameEditPart(view);

			case WrappingLabel70EditPart.VISUAL_ID:
				return new WrappingLabel70EditPart(view);

			case NetworkEditPart.VISUAL_ID:
				return new NetworkEditPart(view);

			case NetworkElementNameEditPart.VISUAL_ID:
				return new NetworkElementNameEditPart(view);

			case WrappingLabel71EditPart.VISUAL_ID:
				return new WrappingLabel71EditPart(view);

			case FileSpecificationEditPart.VISUAL_ID:
				return new FileSpecificationEditPart(view);

			case FileSpecificationElementNameEditPart.VISUAL_ID:
				return new FileSpecificationElementNameEditPart(view);

			case WrappingLabel72EditPart.VISUAL_ID:
				return new WrappingLabel72EditPart(view);

			case IPXNetworkEditPart.VISUAL_ID:
				return new IPXNetworkEditPart(view);

			case IPXNetworkElementNameEditPart.VISUAL_ID:
				return new IPXNetworkElementNameEditPart(view);

			case WrappingLabel73EditPart.VISUAL_ID:
				return new WrappingLabel73EditPart(view);

			case PowerManagementCapabilitiesEditPart.VISUAL_ID:
				return new PowerManagementCapabilitiesEditPart(view);

			case PowerManagementCapabilitiesElementNameEditPart.VISUAL_ID:
				return new PowerManagementCapabilitiesElementNameEditPart(view);

			case WrappingLabel74EditPart.VISUAL_ID:
				return new WrappingLabel74EditPart(view);

			case FlowServiceEditPart.VISUAL_ID:
				return new FlowServiceEditPart(view);

			case FlowServiceElementNameEditPart.VISUAL_ID:
				return new FlowServiceElementNameEditPart(view);

			case WrappingLabel75EditPart.VISUAL_ID:
				return new WrappingLabel75EditPart(view);

			case ISDNModemEditPart.VISUAL_ID:
				return new ISDNModemEditPart(view);

			case ISDNModemElementNameEditPart.VISUAL_ID:
				return new ISDNModemElementNameEditPart(view);

			case WrappingLabel76EditPart.VISUAL_ID:
				return new WrappingLabel76EditPart(view);

			case IPXProtocolEndpointEditPart.VISUAL_ID:
				return new IPXProtocolEndpointEditPart(view);

			case IPXProtocolEndpointElementNameEditPart.VISUAL_ID:
				return new IPXProtocolEndpointElementNameEditPart(view);

			case WrappingLabel77EditPart.VISUAL_ID:
				return new WrappingLabel77EditPart(view);

			case IPProtocolEndpointEditPart.VISUAL_ID:
				return new IPProtocolEndpointEditPart(view);

			case IPProtocolEndpointElementNameEditPart.VISUAL_ID:
				return new IPProtocolEndpointElementNameEditPart(view);

			case WrappingLabel78EditPart.VISUAL_ID:
				return new WrappingLabel78EditPart(view);

			case UDPProtocolEndpointEditPart.VISUAL_ID:
				return new UDPProtocolEndpointEditPart(view);

			case UDPProtocolEndpointElementNameEditPart.VISUAL_ID:
				return new UDPProtocolEndpointElementNameEditPart(view);

			case WrappingLabel79EditPart.VISUAL_ID:
				return new WrappingLabel79EditPart(view);

			case ProductEditPart.VISUAL_ID:
				return new ProductEditPart(view);

			case ProductElementNameEditPart.VISUAL_ID:
				return new ProductElementNameEditPart(view);

			case WrappingLabel80EditPart.VISUAL_ID:
				return new WrappingLabel80EditPart(view);

			case MemoryCapacityEditPart.VISUAL_ID:
				return new MemoryCapacityEditPart(view);

			case MemoryCapacityElementNameEditPart.VISUAL_ID:
				return new MemoryCapacityElementNameEditPart(view);

			case WrappingLabel81EditPart.VISUAL_ID:
				return new WrappingLabel81EditPart(view);

			case RoutingProtocolDomainEditPart.VISUAL_ID:
				return new RoutingProtocolDomainEditPart(view);

			case RoutingProtocolDomainElementNameEditPart.VISUAL_ID:
				return new RoutingProtocolDomainElementNameEditPart(view);

			case WrappingLabel82EditPart.VISUAL_ID:
				return new WrappingLabel82EditPart(view);

			case AFServiceEditPart.VISUAL_ID:
				return new AFServiceEditPart(view);

			case AFServiceElementNameEditPart.VISUAL_ID:
				return new AFServiceElementNameEditPart(view);

			case WrappingLabel83EditPart.VISUAL_ID:
				return new WrappingLabel83EditPart(view);

			case LANSegmentEditPart.VISUAL_ID:
				return new LANSegmentEditPart(view);

			case LANSegmentElementNameEditPart.VISUAL_ID:
				return new LANSegmentElementNameEditPart(view);

			case WrappingLabel84EditPart.VISUAL_ID:
				return new WrappingLabel84EditPart(view);

			case NATStaticSettingsEditPart.VISUAL_ID:
				return new NATStaticSettingsEditPart(view);

			case NATStaticSettingsElementNameEditPart.VISUAL_ID:
				return new NATStaticSettingsElementNameEditPart(view);

			case WrappingLabel85EditPart.VISUAL_ID:
				return new WrappingLabel85EditPart(view);

			case TelnetProtocolEndpointEditPart.VISUAL_ID:
				return new TelnetProtocolEndpointEditPart(view);

			case TelnetProtocolEndpointElementNameEditPart.VISUAL_ID:
				return new TelnetProtocolEndpointElementNameEditPart(view);

			case WrappingLabel86EditPart.VISUAL_ID:
				return new WrappingLabel86EditPart(view);

			case LANEndpointEditPart.VISUAL_ID:
				return new LANEndpointEditPart(view);

			case LANEndpointElementNameEditPart.VISUAL_ID:
				return new LANEndpointElementNameEditPart(view);

			case WrappingLabel87EditPart.VISUAL_ID:
				return new WrappingLabel87EditPart(view);

			case DropThresholdCalculationServiceEditPart.VISUAL_ID:
				return new DropThresholdCalculationServiceEditPart(view);

			case DropThresholdCalculationServiceElementNameEditPart.VISUAL_ID:
				return new DropThresholdCalculationServiceElementNameEditPart(
						view);

			case WrappingLabel88EditPart.VISUAL_ID:
				return new WrappingLabel88EditPart(view);

			case AdminDomainEditPart.VISUAL_ID:
				return new AdminDomainEditPart(view);

			case AdminDomainElementNameEditPart.VISUAL_ID:
				return new AdminDomainElementNameEditPart(view);

			case WrappingLabel89EditPart.VISUAL_ID:
				return new WrappingLabel89EditPart(view);

			case SystemSpecificCollectionEditPart.VISUAL_ID:
				return new SystemSpecificCollectionEditPart(view);

			case SystemSpecificCollectionElementNameEditPart.VISUAL_ID:
				return new SystemSpecificCollectionElementNameEditPart(view);

			case WrappingLabel90EditPart.VISUAL_ID:
				return new WrappingLabel90EditPart(view);

			case NextHopRoutingEditPart.VISUAL_ID:
				return new NextHopRoutingEditPart(view);

			case NextHopRoutingElementNameEditPart.VISUAL_ID:
				return new NextHopRoutingElementNameEditPart(view);

			case WrappingLabel91EditPart.VISUAL_ID:
				return new WrappingLabel91EditPart(view);

			case ComputerSystemEditPart.VISUAL_ID:
				return new ComputerSystemEditPart(view);

			case ComputerSystemElementNameEditPart.VISUAL_ID:
				return new ComputerSystemElementNameEditPart(view);

			case WrappingLabel92EditPart.VISUAL_ID:
				return new WrappingLabel92EditPart(view);

			case NetworkPortEditPart.VISUAL_ID:
				return new NetworkPortEditPart(view);

			case NetworkPortElementNameEditPart.VISUAL_ID:
				return new NetworkPortElementNameEditPart(view);

			case WrappingLabel93EditPart.VISUAL_ID:
				return new WrappingLabel93EditPart(view);

			case RemoteServiceAccessPointEditPart.VISUAL_ID:
				return new RemoteServiceAccessPointEditPart(view);

			case RemoteServiceAccessPointElementNameEditPart.VISUAL_ID:
				return new RemoteServiceAccessPointElementNameEditPart(view);

			case WrappingLabel94EditPart.VISUAL_ID:
				return new WrappingLabel94EditPart(view);

			case DirectorySpecificationDirectorySpecificationFilesEditPart.VISUAL_ID:
				return new DirectorySpecificationDirectorySpecificationFilesEditPart(
						view);

			case WrappingLabel95EditPart.VISUAL_ID:
				return new WrappingLabel95EditPart(view);

			case OperatingSystemOperatingSystemSoftwareFeatureEditPart.VISUAL_ID:
				return new OperatingSystemOperatingSystemSoftwareFeatureEditPart(
						view);

			case WrappingLabel96EditPart.VISUAL_ID:
				return new WrappingLabel96EditPart(view);

			case SoftwareElementSoftwareElementActionsEditPart.VISUAL_ID:
				return new SoftwareElementSoftwareElementActionsEditPart(view);

			case WrappingLabel97EditPart.VISUAL_ID:
				return new WrappingLabel97EditPart(view);

			case SoftwareElementSoftwareElementChecksEditPart.VISUAL_ID:
				return new SoftwareElementSoftwareElementChecksEditPart(view);

			case WrappingLabel98EditPart.VISUAL_ID:
				return new WrappingLabel98EditPart(view);

			case InstalledProductSoftwareElementsEditPart.VISUAL_ID:
				return new InstalledProductSoftwareElementsEditPart(view);

			case WrappingLabel99EditPart.VISUAL_ID:
				return new WrappingLabel99EditPart(view);

			case BGPServiceBGPPeerGroupServicesEditPart.VISUAL_ID:
				return new BGPServiceBGPPeerGroupServicesEditPart(view);

			case WrappingLabel100EditPart.VISUAL_ID:
				return new WrappingLabel100EditPart(view);

			case BGPClusterReflectorClientServiceEditPart.VISUAL_ID:
				return new BGPClusterReflectorClientServiceEditPart(view);

			case WrappingLabel101EditPart.VISUAL_ID:
				return new WrappingLabel101EditPart(view);

			case BGPClusterReflectorNonClientServiceEditPart.VISUAL_ID:
				return new BGPClusterReflectorNonClientServiceEditPart(view);

			case WrappingLabel102EditPart.VISUAL_ID:
				return new WrappingLabel102EditPart(view);

			case BGPClusterReflectorServiceEditPart.VISUAL_ID:
				return new BGPClusterReflectorServiceEditPart(view);

			case WrappingLabel103EditPart.VISUAL_ID:
				return new WrappingLabel103EditPart(view);

			case ServiceAccessPointBindsToEditPart.VISUAL_ID:
				return new ServiceAccessPointBindsToEditPart(view);

			case WrappingLabel104EditPart.VISUAL_ID:
				return new WrappingLabel104EditPart(view);

			case ManagedElementComponentsEditPart.VISUAL_ID:
				return new ManagedElementComponentsEditPart(view);

			case WrappingLabel105EditPart.VISUAL_ID:
				return new WrappingLabel105EditPart(view);

			case AdminDomainContainedDomainEditPart.VISUAL_ID:
				return new AdminDomainContainedDomainEditPart(view);

			case WrappingLabel106EditPart.VISUAL_ID:
				return new WrappingLabel106EditPart(view);

			case ManagedElementDependenciesEditPart.VISUAL_ID:
				return new ManagedElementDependenciesEditPart(view);

			case WrappingLabel107EditPart.VISUAL_ID:
				return new WrappingLabel107EditPart(view);

			case LogicalDeviceDeviceConnectionEditPart.VISUAL_ID:
				return new LogicalDeviceDeviceConnectionEditPart(view);

			case WrappingLabel108EditPart.VISUAL_ID:
				return new WrappingLabel108EditPart(view);

			case LogicalDeviceDeviceIdentityEditPart.VISUAL_ID:
				return new LogicalDeviceDeviceIdentityEditPart(view);

			case WrappingLabel109EditPart.VISUAL_ID:
				return new WrappingLabel109EditPart(view);

			case LogicalDeviceDeviceSAPImplementationEditPart.VISUAL_ID:
				return new LogicalDeviceDeviceSAPImplementationEditPart(view);

			case WrappingLabel110EditPart.VISUAL_ID:
				return new WrappingLabel110EditPart(view);

			case ManagedElementElementCapabilitiesEditPart.VISUAL_ID:
				return new ManagedElementElementCapabilitiesEditPart(view);

			case WrappingLabel111EditPart.VISUAL_ID:
				return new WrappingLabel111EditPart(view);

			case ManagedElementElementSettingDataEditPart.VISUAL_ID:
				return new ManagedElementElementSettingDataEditPart(view);

			case WrappingLabel112EditPart.VISUAL_ID:
				return new WrappingLabel112EditPart(view);

			case SoftwareIdentityElementSoftwareIdentityEditPart.VISUAL_ID:
				return new SoftwareIdentityElementSoftwareIdentityEditPart(view);

			case WrappingLabel113EditPart.VISUAL_ID:
				return new WrappingLabel113EditPart(view);

			case SystemHostedAccessPointEditPart.VISUAL_ID:
				return new SystemHostedAccessPointEditPart(view);

			case WrappingLabel114EditPart.VISUAL_ID:
				return new WrappingLabel114EditPart(view);

			case SystemHostedCollectionEditPart.VISUAL_ID:
				return new SystemHostedCollectionEditPart(view);

			case WrappingLabel115EditPart.VISUAL_ID:
				return new WrappingLabel115EditPart(view);

			case ManagedElementHostedDependencyEditPart.VISUAL_ID:
				return new ManagedElementHostedDependencyEditPart(view);

			case WrappingLabel116EditPart.VISUAL_ID:
				return new WrappingLabel116EditPart(view);

			case SystemHostedServicesEditPart.VISUAL_ID:
				return new SystemHostedServicesEditPart(view);

			case WrappingLabel117EditPart.VISUAL_ID:
				return new WrappingLabel117EditPart(view);

			case ElementSoftwareIdentityManagedElementEditPart.VISUAL_ID:
				return new ElementSoftwareIdentityManagedElementEditPart(view);

			case WrappingLabel118EditPart.VISUAL_ID:
				return new WrappingLabel118EditPart(view);

			case ProductProductProductDependencyEditPart.VISUAL_ID:
				return new ProductProductProductDependencyEditPart(view);

			case WrappingLabel119EditPart.VISUAL_ID:
				return new WrappingLabel119EditPart(view);

			case ProductProductServiceComponentEditPart.VISUAL_ID:
				return new ProductProductServiceComponentEditPart(view);

			case WrappingLabel120EditPart.VISUAL_ID:
				return new WrappingLabel120EditPart(view);

			case EnabledLogicalElementRemoteAccessAvailableToElementEditPart.VISUAL_ID:
				return new EnabledLogicalElementRemoteAccessAvailableToElementEditPart(
						view);

			case WrappingLabel121EditPart.VISUAL_ID:
				return new WrappingLabel121EditPart(view);

			case SystemRolesEditPart.VISUAL_ID:
				return new SystemRolesEditPart(view);

			case WrappingLabel122EditPart.VISUAL_ID:
				return new WrappingLabel122EditPart(view);

			case ServiceAccessPointSAPSAPDependencyEditPart.VISUAL_ID:
				return new ServiceAccessPointSAPSAPDependencyEditPart(view);

			case WrappingLabel123EditPart.VISUAL_ID:
				return new WrappingLabel123EditPart(view);

			case ServiceServiceAccessBySAPEditPart.VISUAL_ID:
				return new ServiceServiceAccessBySAPEditPart(view);

			case WrappingLabel124EditPart.VISUAL_ID:
				return new WrappingLabel124EditPart(view);

			case ServiceServiceComponentsEditPart.VISUAL_ID:
				return new ServiceServiceComponentsEditPart(view);

			case WrappingLabel125EditPart.VISUAL_ID:
				return new WrappingLabel125EditPart(view);

			case ServiceServiceServiceDependencyEditPart.VISUAL_ID:
				return new ServiceServiceServiceDependencyEditPart(view);

			case WrappingLabel126EditPart.VISUAL_ID:
				return new WrappingLabel126EditPart(view);

			case ElementSettingDataSettingDataEditPart.VISUAL_ID:
				return new ElementSettingDataSettingDataEditPart(view);

			case WrappingLabel127EditPart.VISUAL_ID:
				return new WrappingLabel127EditPart(view);

			case SettingDataSettingsDefineCapabilitiesEditPart.VISUAL_ID:
				return new SettingDataSettingsDefineCapabilitiesEditPart(view);

			case WrappingLabel128EditPart.VISUAL_ID:
				return new WrappingLabel128EditPart(view);

			case ManagedSystemElementStatusDescriptionsEditPart.VISUAL_ID:
				return new ManagedSystemElementStatusDescriptionsEditPart(view);

			case WrappingLabel129EditPart.VISUAL_ID:
				return new WrappingLabel129EditPart(view);

			case SystemSystemComponentsEditPart.VISUAL_ID:
				return new SystemSystemComponentsEditPart(view);

			case WrappingLabel130EditPart.VISUAL_ID:
				return new WrappingLabel130EditPart(view);

			case SystemSystemDevicesEditPart.VISUAL_ID:
				return new SystemSystemDevicesEditPart(view);

			case WrappingLabel131EditPart.VISUAL_ID:
				return new WrappingLabel131EditPart(view);

			case LogicalModuleModulePortEditPart.VISUAL_ID:
				return new LogicalModuleModulePortEditPart(view);

			case WrappingLabel132EditPart.VISUAL_ID:
				return new WrappingLabel132EditPart(view);

			case AFServiceAFRelatedServicesEditPart.VISUAL_ID:
				return new AFServiceAFRelatedServicesEditPart(view);

			case WrappingLabel133EditPart.VISUAL_ID:
				return new WrappingLabel133EditPart(view);

			case QoSServiceQoSConditioningSubServiceEditPart.VISUAL_ID:
				return new QoSServiceQoSConditioningSubServiceEditPart(view);

			case WrappingLabel134EditPart.VISUAL_ID:
				return new WrappingLabel134EditPart(view);

			case QoSServiceQoSSubServiceEditPart.VISUAL_ID:
				return new QoSServiceQoSSubServiceEditPart(view);

			case WrappingLabel135EditPart.VISUAL_ID:
				return new WrappingLabel135EditPart(view);

			case CollectionMembersEditPart.VISUAL_ID:
				return new CollectionMembersEditPart(view);

			case WrappingLabel136EditPart.VISUAL_ID:
				return new WrappingLabel136EditPart(view);

			case NATListBasedSettingsAddressesToBeTranslatedEditPart.VISUAL_ID:
				return new NATListBasedSettingsAddressesToBeTranslatedEditPart(
						view);

			case WrappingLabel137EditPart.VISUAL_ID:
				return new WrappingLabel137EditPart(view);

			case BGPServiceBGPAdminDistanceEditPart.VISUAL_ID:
				return new BGPServiceBGPAdminDistanceEditPart(view);

			case WrappingLabel138EditPart.VISUAL_ID:
				return new WrappingLabel138EditPart(view);

			case ServiceAccessPointBindsToLANEndpointEditPart.VISUAL_ID:
				return new ServiceAccessPointBindsToLANEndpointEditPart(view);

			case WrappingLabel139EditPart.VISUAL_ID:
				return new WrappingLabel139EditPart(view);

			case RouteCalculationServiceCalculatesAmongEditPart.VISUAL_ID:
				return new RouteCalculationServiceCalculatesAmongEditPart(view);

			case WrappingLabel140EditPart.VISUAL_ID:
				return new WrappingLabel140EditPart(view);

			case ProtocolEndpointEgressConditioningServiceOnEndpointEditPart.VISUAL_ID:
				return new ProtocolEndpointEgressConditioningServiceOnEndpointEditPart(
						view);

			case WrappingLabel141EditPart.VISUAL_ID:
				return new WrappingLabel141EditPart(view);

			case CIM_ModelElementsEditPart.VISUAL_ID:
				return new CIM_ModelElementsEditPart(view);

			case WrappingLabel142EditPart.VISUAL_ID:
				return new WrappingLabel142EditPart(view);

			case ForwardingServiceForwardedRoutesEditPart.VISUAL_ID:
				return new ForwardingServiceForwardedRoutesEditPart(view);

			case WrappingLabel143EditPart.VISUAL_ID:
				return new WrappingLabel143EditPart(view);

			case ForwardingServiceForwardsAmongEditPart.VISUAL_ID:
				return new ForwardingServiceForwardsAmongEditPart(view);

			case WrappingLabel144EditPart.VISUAL_ID:
				return new WrappingLabel144EditPart(view);

			case ComputerSystemHostedFilterListEditPart.VISUAL_ID:
				return new ComputerSystemHostedFilterListEditPart(view);

			case WrappingLabel145EditPart.VISUAL_ID:
				return new WrappingLabel145EditPart(view);

			case ComputerSystemHostedForwardingServicesEditPart.VISUAL_ID:
				return new ComputerSystemHostedForwardingServicesEditPart(view);

			case WrappingLabel146EditPart.VISUAL_ID:
				return new WrappingLabel146EditPart(view);

			case SystemHostedRouteEditPart.VISUAL_ID:
				return new SystemHostedRouteEditPart(view);

			case WrappingLabel147EditPart.VISUAL_ID:
				return new WrappingLabel147EditPart(view);

			case ComputerSystemHostedRoutingPolicyEditPart.VISUAL_ID:
				return new ComputerSystemHostedRoutingPolicyEditPart(view);

			case WrappingLabel148EditPart.VISUAL_ID:
				return new WrappingLabel148EditPart(view);

			case ProtocolEndpointIngressConditioningServiceOnEndpointEditPart.VISUAL_ID:
				return new ProtocolEndpointIngressConditioningServiceOnEndpointEditPart(
						view);

			case WrappingLabel149EditPart.VISUAL_ID:
				return new WrappingLabel149EditPart(view);

			case LogicalNetworkInLogicalNetworkEditPart.VISUAL_ID:
				return new LogicalNetworkInLogicalNetworkEditPart(view);

			case WrappingLabel150EditPart.VISUAL_ID:
				return new WrappingLabel150EditPart(view);

			case LANSegmentInSegmentEditPart.VISUAL_ID:
				return new LANSegmentInSegmentEditPart(view);

			case WrappingLabel151EditPart.VISUAL_ID:
				return new WrappingLabel151EditPart(view);

			case NATServiceNATServiceRunningOnEndpointEditPart.VISUAL_ID:
				return new NATServiceNATServiceRunningOnEndpointEditPart(view);

			case WrappingLabel152EditPart.VISUAL_ID:
				return new WrappingLabel152EditPart(view);

			case AdminDomainNetworksInAdminDomainEditPart.VISUAL_ID:
				return new AdminDomainNetworksInAdminDomainEditPart(view);

			case WrappingLabel153EditPart.VISUAL_ID:
				return new WrappingLabel153EditPart(view);

			case LogicalPortPortImplementsEndPointEditPart.VISUAL_ID:
				return new LogicalPortPortImplementsEndPointEditPart(view);

			case WrappingLabel154EditPart.VISUAL_ID:
				return new WrappingLabel154EditPart(view);

			case LogicalDevicePortOnDeviceEditPart.VISUAL_ID:
				return new LogicalDevicePortOnDeviceEditPart(view);

			case WrappingLabel155EditPart.VISUAL_ID:
				return new WrappingLabel155EditPart(view);

			case ForwardingServiceRouteForwardedByServiceEditPart.VISUAL_ID:
				return new ForwardingServiceRouteForwardedByServiceEditPart(
						view);

			case WrappingLabel156EditPart.VISUAL_ID:
				return new WrappingLabel156EditPart(view);

			case AutonomousSystemRouterInASEditPart.VISUAL_ID:
				return new AutonomousSystemRouterInASEditPart(view);

			case WrappingLabel157EditPart.VISUAL_ID:
				return new WrappingLabel157EditPart(view);

			case BGPClusterRoutersInBGPClusterEditPart.VISUAL_ID:
				return new BGPClusterRoutersInBGPClusterEditPart(view);

			case WrappingLabel158EditPart.VISUAL_ID:
				return new WrappingLabel158EditPart(view);

			case NextHopRouteRouteUsesEndpointEditPart.VISUAL_ID:
				return new NextHopRouteRouteUsesEndpointEditPart(view);

			case WrappingLabel159EditPart.VISUAL_ID:
				return new WrappingLabel159EditPart(view);

			case AutonomousSystemRoutingProtocolDomainInASEditPart.VISUAL_ID:
				return new AutonomousSystemRoutingProtocolDomainInASEditPart(
						view);

			case WrappingLabel160EditPart.VISUAL_ID:
				return new WrappingLabel160EditPart(view);

			case ComputerSystemRunningOSEditPart.VISUAL_ID:
				return new ComputerSystemRunningOSEditPart(view);

			case WrappingLabel161EditPart.VISUAL_ID:
				return new WrappingLabel161EditPart(view);

			case ServiceSoftwareFeatureServiceImplementationEditPart.VISUAL_ID:
				return new ServiceSoftwareFeatureServiceImplementationEditPart(
						view);

			case WrappingLabel162EditPart.VISUAL_ID:
				return new WrappingLabel162EditPart(view);

			case NATListBasedSettingsTranslationPoolForNATEditPart.VISUAL_ID:
				return new NATListBasedSettingsTranslationPoolForNATEditPart(
						view);

			case WrappingLabel163EditPart.VISUAL_ID:
				return new WrappingLabel163EditPart(view);

			case SNMPServiceTrapSourceForSNMPServiceEditPart.VISUAL_ID:
				return new SNMPServiceTrapSourceForSNMPServiceEditPart(view);

			case WrappingLabel164EditPart.VISUAL_ID:
				return new WrappingLabel164EditPart(view);

			case NextHopRouteAssociatedNextHopEditPart.VISUAL_ID:
				return new NextHopRouteAssociatedNextHopEditPart(view);

			case WrappingLabel165EditPart.VISUAL_ID:
				return new WrappingLabel165EditPart(view);
			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	 * @generated
	 */
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	 * @generated
	 */
	public static CellEditorLocator getTextCellEditorLocator(
			ITextAwareEditPart source) {
		if (source.getFigure() instanceof WrappingLabel)
			return new TextCellEditorLocator((WrappingLabel) source.getFigure());
		else {
			return new LabelCellEditorLocator((Label) source.getFigure());
		}
	}

	/**
	 * @generated
	 */
	static private class TextCellEditorLocator implements CellEditorLocator {

		/**
		 * @generated
		 */
		private WrappingLabel wrapLabel;

		/**
		 * @generated
		 */
		public TextCellEditorLocator(WrappingLabel wrapLabel) {
			this.wrapLabel = wrapLabel;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getWrapLabel() {
			return wrapLabel;
		}

		/**
		 * @generated
		 */
		public void relocate(CellEditor celleditor) {
			Text text = (Text) celleditor.getControl();
			Rectangle rect = getWrapLabel().getTextBounds().getCopy();
			getWrapLabel().translateToAbsolute(rect);
			if (getWrapLabel().isTextWrapOn()
					&& getWrapLabel().getText().length() > 0) {
				rect.setSize(new Dimension(text.computeSize(rect.width,
						SWT.DEFAULT)));
			} else {
				int avr = FigureUtilities.getFontMetrics(text.getFont())
						.getAverageCharWidth();
				rect.setSize(new Dimension(text.computeSize(SWT.DEFAULT,
						SWT.DEFAULT)).expand(avr * 2, 0));
			}
			if (!rect.equals(new Rectangle(text.getBounds()))) {
				text.setBounds(rect.x, rect.y, rect.width, rect.height);
			}
		}
	}

	/**
	 * @generated
	 */
	private static class LabelCellEditorLocator implements CellEditorLocator {

		/**
		 * @generated
		 */
		private Label label;

		/**
		 * @generated
		 */
		public LabelCellEditorLocator(Label label) {
			this.label = label;
		}

		/**
		 * @generated
		 */
		public Label getLabel() {
			return label;
		}

		/**
		 * @generated
		 */
		public void relocate(CellEditor celleditor) {
			Text text = (Text) celleditor.getControl();
			Rectangle rect = getLabel().getTextBounds().getCopy();
			getLabel().translateToAbsolute(rect);
			int avr = FigureUtilities.getFontMetrics(text.getFont())
					.getAverageCharWidth();
			rect.setSize(new Dimension(text.computeSize(SWT.DEFAULT,
					SWT.DEFAULT)).expand(avr * 2, 0));
			if (!rect.equals(new Rectangle(text.getBounds()))) {
				text.setBounds(rect.x, rect.y, rect.width, rect.height);
			}
		}
	}
}
