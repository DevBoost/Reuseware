package es.tid.cim.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.diagram.core.providers.AbstractViewProvider;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.IHintedType;
import org.eclipse.gmf.runtime.notation.View;

import es.tid.cim.diagram.edit.parts.*;
import es.tid.cim.diagram.part.CIMLevelZeroVisualIDRegistry;
import es.tid.cim.diagram.view.factories.*;

/**
 * @generated
 */
public class CIMLevelZeroViewProvider extends AbstractViewProvider {

	/**
	 * @generated
	 */
	protected Class getDiagramViewClass(IAdaptable semanticAdapter,
			String diagramKind) {
		EObject semanticElement = getSemanticElement(semanticAdapter);
		if (CIM_ModelEditPart.MODEL_ID.equals(diagramKind)
				&& CIMLevelZeroVisualIDRegistry
						.getDiagramVisualID(semanticElement) != -1) {
			return CIM_ModelViewFactory.class;
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Class getNodeViewClass(IAdaptable semanticAdapter,
			View containerView, String semanticHint) {
		if (containerView == null) {
			return null;
		}
		IElementType elementType = getSemanticElementType(semanticAdapter);
		EObject domainElement = getSemanticElement(semanticAdapter);
		int visualID;
		if (semanticHint == null) {
			// Semantic hint is not specified. Can be a result of call from CanonicalEditPolicy.
			// In this situation there should be NO elementType, visualID will be determined
			// by VisualIDRegistry.getNodeVisualID() for domainElement.
			if (elementType != null || domainElement == null) {
				return null;
			}
			visualID = CIMLevelZeroVisualIDRegistry.getNodeVisualID(
					containerView, domainElement);
		} else {
			visualID = CIMLevelZeroVisualIDRegistry.getVisualID(semanticHint);
			if (elementType != null) {
				// Semantic hint is specified together with element type.
				// Both parameters should describe exactly the same diagram element.
				// In addition we check that visualID returned by VisualIDRegistry.getNodeVisualID() for
				// domainElement (if specified) is the same as in element type.
				if (!CIMLevelZeroElementTypes.isKnownElementType(elementType)
						|| (!(elementType instanceof IHintedType))) {
					return null; // foreign element type
				}
				String elementTypeHint = ((IHintedType) elementType)
						.getSemanticHint();
				if (!semanticHint.equals(elementTypeHint)) {
					return null; // if semantic hint is specified it should be the same as in element type
				}
				if (domainElement != null
						&& visualID != CIMLevelZeroVisualIDRegistry
								.getNodeVisualID(containerView, domainElement)) {
					return null; // visual id for node EClass should match visual id from element type
				}
			} else {
				// Element type is not specified. Domain element should be present (except pure design elements).
				// This method is called with EObjectAdapter as parameter from:
				//   - ViewService.createNode(View container, EObject eObject, String type, PreferencesHint preferencesHint) 
				//   - generated ViewFactory.decorateView() for parent element
				if (!CIM_ModelEditPart.MODEL_ID
						.equals(CIMLevelZeroVisualIDRegistry
								.getModelID(containerView))) {
					return null; // foreign diagram
				}
				switch (visualID) {
				case USBDeviceEditPart.VISUAL_ID:
				case OSPFVirtualInterfaceEditPart.VISUAL_ID:
				case WiFiPortEditPart.VISUAL_ID:
				case ProtocolServiceEditPart.VISUAL_ID:
				case RoutingPolicyEditPart.VISUAL_ID:
				case EnabledLogicalElementCapabilitiesEditPart.VISUAL_ID:
				case BufferPoolEditPart.VISUAL_ID:
				case MPLSProtocolEndpointEditPart.VISUAL_ID:
				case AutonomousSystemEditPart.VISUAL_ID:
				case DNSSettingDataEditPart.VISUAL_ID:
				case UniModemEditPart.VISUAL_ID:
				case EFServiceEditPart.VISUAL_ID:
				case IPSubnetEditPart.VISUAL_ID:
				case NamedAddressCollectionEditPart.VISUAL_ID:
				case BIOSElementEditPart.VISUAL_ID:
				case TelnetSettingDataEditPart.VISUAL_ID:
				case BGPPeerGroupEditPart.VISUAL_ID:
				case LANConnectivitySegmentEditPart.VISUAL_ID:
				case CableModemEditPart.VISUAL_ID:
				case SwitchPortEditPart.VISUAL_ID:
				case TCPProtocolEndpointEditPart.VISUAL_ID:
				case AdministrativeDistanceEditPart.VISUAL_ID:
				case IPConnectivitySubnetEditPart.VISUAL_ID:
				case VolatileStorageEditPart.VISUAL_ID:
				case RangeOfIPAddressesEditPart.VISUAL_ID:
				case BGPProtocolEndpointEditPart.VISUAL_ID:
				case UnitaryComputerSystemEditPart.VISUAL_ID:
				case EthernetPortEditPart.VISUAL_ID:
				case SNMPServiceEditPart.VISUAL_ID:
				case LogicalModuleEditPart.VISUAL_ID:
				case NextHopIPRouteEditPart.VISUAL_ID:
				case OperatingSystemEditPart.VISUAL_ID:
				case SDSLModemEditPart.VISUAL_ID:
				case WiFiEndPointEditPart.VISUAL_ID:
				case NATServiceEditPart.VISUAL_ID:
				case ADSLModemEditPart.VISUAL_ID:
				case LogicalFileEditPart.VISUAL_ID:
				case BGPClusterEditPart.VISUAL_ID:
				case ApplicationSystemEditPart.VISUAL_ID:
				case SoftwareIdentityEditPart.VISUAL_ID:
				case WirelessPortEditPart.VISUAL_ID:
				case CLPSettingDataEditPart.VISUAL_ID:
				case GenericServiceEditPart.VISUAL_ID:
				case NATListBasedSettingsEditPart.VISUAL_ID:
				case VDSLModemEditPart.VISUAL_ID:
				case USBPortEditPart.VISUAL_ID:
				case DNSProtocolEndpointEditPart.VISUAL_ID:
				case WiFiEndpointSettingsEditPart.VISUAL_ID:
				case SSHSettingDataEditPart.VISUAL_ID:
				case WirelessLANEndpointEditPart.VISUAL_ID:
				case DHCPProtocolEndpointEditPart.VISUAL_ID:
				case IPHeadersFilterEditPart.VISUAL_ID:
				case DirectoryEditPart.VISUAL_ID:
				case IPAddressRangeEditPart.VISUAL_ID:
				case SNMPTrapTargetEditPart.VISUAL_ID:
				case IPXConnectivityNetworkEditPart.VISUAL_ID:
				case ConnectivityMemberhipSettingDataEditPart.VISUAL_ID:
				case ConditioningServiceEditPart.VISUAL_ID:
				case BIOSFeatureEditPart.VISUAL_ID:
				case OSPFProtocolEndpointEditPart.VISUAL_ID:
				case FilterListEditPart.VISUAL_ID:
				case BGPServiceEditPart.VISUAL_ID:
				case PrecedenceServiceEditPart.VISUAL_ID:
				case DHCPCapabilitiesEditPart.VISUAL_ID:
				case Hdr8021PServiceEditPart.VISUAL_ID:
				case ReplacementSetEditPart.VISUAL_ID:
				case HDSLModemEditPart.VISUAL_ID:
				case ServiceAccessURIEditPart.VISUAL_ID:
				case FilterEntryEditPart.VISUAL_ID:
				case SNMPCommunityStringsEditPart.VISUAL_ID:
				case NetworkEditPart.VISUAL_ID:
				case FileSpecificationEditPart.VISUAL_ID:
				case IPXNetworkEditPart.VISUAL_ID:
				case PowerManagementCapabilitiesEditPart.VISUAL_ID:
				case FlowServiceEditPart.VISUAL_ID:
				case ISDNModemEditPart.VISUAL_ID:
				case IPXProtocolEndpointEditPart.VISUAL_ID:
				case IPProtocolEndpointEditPart.VISUAL_ID:
				case UDPProtocolEndpointEditPart.VISUAL_ID:
				case ProductEditPart.VISUAL_ID:
				case MemoryCapacityEditPart.VISUAL_ID:
				case RoutingProtocolDomainEditPart.VISUAL_ID:
				case AFServiceEditPart.VISUAL_ID:
				case LANSegmentEditPart.VISUAL_ID:
				case NATStaticSettingsEditPart.VISUAL_ID:
				case TelnetProtocolEndpointEditPart.VISUAL_ID:
				case LANEndpointEditPart.VISUAL_ID:
				case DropThresholdCalculationServiceEditPart.VISUAL_ID:
				case AdminDomainEditPart.VISUAL_ID:
				case SystemSpecificCollectionEditPart.VISUAL_ID:
				case NextHopRoutingEditPart.VISUAL_ID:
				case ComputerSystemEditPart.VISUAL_ID:
				case NetworkPortEditPart.VISUAL_ID:
				case RemoteServiceAccessPointEditPart.VISUAL_ID:
					if (domainElement == null
							|| visualID != CIMLevelZeroVisualIDRegistry
									.getNodeVisualID(containerView,
											domainElement)) {
						return null; // visual id in semantic hint should match visual id for domain element
					}
					break;
				case USBDeviceElementNameEditPart.VISUAL_ID:
				case WrappingLabelEditPart.VISUAL_ID:
					if (USBDeviceEditPart.VISUAL_ID != CIMLevelZeroVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case OSPFVirtualInterfaceElementNameEditPart.VISUAL_ID:
				case WrappingLabel2EditPart.VISUAL_ID:
					if (OSPFVirtualInterfaceEditPart.VISUAL_ID != CIMLevelZeroVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case WiFiPortElementNameEditPart.VISUAL_ID:
				case WrappingLabel3EditPart.VISUAL_ID:
					if (WiFiPortEditPart.VISUAL_ID != CIMLevelZeroVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case ProtocolServiceElementNameEditPart.VISUAL_ID:
				case WrappingLabel4EditPart.VISUAL_ID:
					if (ProtocolServiceEditPart.VISUAL_ID != CIMLevelZeroVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case RoutingPolicyElementNameEditPart.VISUAL_ID:
				case WrappingLabel5EditPart.VISUAL_ID:
					if (RoutingPolicyEditPart.VISUAL_ID != CIMLevelZeroVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case EnabledLogicalElementCapabilitiesElementNameEditPart.VISUAL_ID:
				case WrappingLabel6EditPart.VISUAL_ID:
					if (EnabledLogicalElementCapabilitiesEditPart.VISUAL_ID != CIMLevelZeroVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case BufferPoolElementNameEditPart.VISUAL_ID:
				case WrappingLabel7EditPart.VISUAL_ID:
					if (BufferPoolEditPart.VISUAL_ID != CIMLevelZeroVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case MPLSProtocolEndpointElementNameEditPart.VISUAL_ID:
				case WrappingLabel8EditPart.VISUAL_ID:
					if (MPLSProtocolEndpointEditPart.VISUAL_ID != CIMLevelZeroVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case AutonomousSystemElementNameEditPart.VISUAL_ID:
				case WrappingLabel9EditPart.VISUAL_ID:
					if (AutonomousSystemEditPart.VISUAL_ID != CIMLevelZeroVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case DNSSettingDataElementNameEditPart.VISUAL_ID:
				case WrappingLabel10EditPart.VISUAL_ID:
					if (DNSSettingDataEditPart.VISUAL_ID != CIMLevelZeroVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case UniModemElementNameEditPart.VISUAL_ID:
				case WrappingLabel11EditPart.VISUAL_ID:
					if (UniModemEditPart.VISUAL_ID != CIMLevelZeroVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case EFServiceElementNameEditPart.VISUAL_ID:
				case WrappingLabel12EditPart.VISUAL_ID:
					if (EFServiceEditPart.VISUAL_ID != CIMLevelZeroVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case IPSubnetElementNameEditPart.VISUAL_ID:
				case WrappingLabel13EditPart.VISUAL_ID:
					if (IPSubnetEditPart.VISUAL_ID != CIMLevelZeroVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case NamedAddressCollectionElementNameEditPart.VISUAL_ID:
				case WrappingLabel14EditPart.VISUAL_ID:
					if (NamedAddressCollectionEditPart.VISUAL_ID != CIMLevelZeroVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case BIOSElementElementNameEditPart.VISUAL_ID:
				case WrappingLabel15EditPart.VISUAL_ID:
					if (BIOSElementEditPart.VISUAL_ID != CIMLevelZeroVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case TelnetSettingDataElementNameEditPart.VISUAL_ID:
				case WrappingLabel16EditPart.VISUAL_ID:
					if (TelnetSettingDataEditPart.VISUAL_ID != CIMLevelZeroVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case BGPPeerGroupElementNameEditPart.VISUAL_ID:
				case WrappingLabel17EditPart.VISUAL_ID:
					if (BGPPeerGroupEditPart.VISUAL_ID != CIMLevelZeroVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case LANConnectivitySegmentElementNameEditPart.VISUAL_ID:
				case WrappingLabel18EditPart.VISUAL_ID:
					if (LANConnectivitySegmentEditPart.VISUAL_ID != CIMLevelZeroVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case CableModemElementNameEditPart.VISUAL_ID:
				case WrappingLabel19EditPart.VISUAL_ID:
					if (CableModemEditPart.VISUAL_ID != CIMLevelZeroVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case SwitchPortElementNameEditPart.VISUAL_ID:
				case WrappingLabel20EditPart.VISUAL_ID:
					if (SwitchPortEditPart.VISUAL_ID != CIMLevelZeroVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case TCPProtocolEndpointElementNameEditPart.VISUAL_ID:
				case WrappingLabel21EditPart.VISUAL_ID:
					if (TCPProtocolEndpointEditPart.VISUAL_ID != CIMLevelZeroVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case AdministrativeDistanceElementNameEditPart.VISUAL_ID:
				case WrappingLabel22EditPart.VISUAL_ID:
					if (AdministrativeDistanceEditPart.VISUAL_ID != CIMLevelZeroVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case IPConnectivitySubnetElementNameEditPart.VISUAL_ID:
				case WrappingLabel23EditPart.VISUAL_ID:
					if (IPConnectivitySubnetEditPart.VISUAL_ID != CIMLevelZeroVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case VolatileStorageElementNameEditPart.VISUAL_ID:
				case WrappingLabel24EditPart.VISUAL_ID:
					if (VolatileStorageEditPart.VISUAL_ID != CIMLevelZeroVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case RangeOfIPAddressesElementNameEditPart.VISUAL_ID:
				case WrappingLabel25EditPart.VISUAL_ID:
					if (RangeOfIPAddressesEditPart.VISUAL_ID != CIMLevelZeroVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case BGPProtocolEndpointElementNameEditPart.VISUAL_ID:
				case WrappingLabel26EditPart.VISUAL_ID:
					if (BGPProtocolEndpointEditPart.VISUAL_ID != CIMLevelZeroVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case UnitaryComputerSystemElementNameEditPart.VISUAL_ID:
				case WrappingLabel27EditPart.VISUAL_ID:
					if (UnitaryComputerSystemEditPart.VISUAL_ID != CIMLevelZeroVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case EthernetPortElementNameEditPart.VISUAL_ID:
				case WrappingLabel28EditPart.VISUAL_ID:
					if (EthernetPortEditPart.VISUAL_ID != CIMLevelZeroVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case SNMPServiceElementNameEditPart.VISUAL_ID:
				case WrappingLabel29EditPart.VISUAL_ID:
					if (SNMPServiceEditPart.VISUAL_ID != CIMLevelZeroVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case LogicalModuleElementNameEditPart.VISUAL_ID:
				case WrappingLabel30EditPart.VISUAL_ID:
					if (LogicalModuleEditPart.VISUAL_ID != CIMLevelZeroVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case NextHopIPRouteElementNameEditPart.VISUAL_ID:
				case WrappingLabel31EditPart.VISUAL_ID:
					if (NextHopIPRouteEditPart.VISUAL_ID != CIMLevelZeroVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case OperatingSystemElementNameEditPart.VISUAL_ID:
				case WrappingLabel32EditPart.VISUAL_ID:
					if (OperatingSystemEditPart.VISUAL_ID != CIMLevelZeroVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case SDSLModemElementNameEditPart.VISUAL_ID:
				case WrappingLabel33EditPart.VISUAL_ID:
					if (SDSLModemEditPart.VISUAL_ID != CIMLevelZeroVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case WiFiEndPointElementNameEditPart.VISUAL_ID:
				case WrappingLabel34EditPart.VISUAL_ID:
					if (WiFiEndPointEditPart.VISUAL_ID != CIMLevelZeroVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case NATServiceElementNameEditPart.VISUAL_ID:
				case WrappingLabel35EditPart.VISUAL_ID:
					if (NATServiceEditPart.VISUAL_ID != CIMLevelZeroVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case ADSLModemElementNameEditPart.VISUAL_ID:
				case WrappingLabel36EditPart.VISUAL_ID:
					if (ADSLModemEditPart.VISUAL_ID != CIMLevelZeroVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case LogicalFileElementNameEditPart.VISUAL_ID:
				case WrappingLabel37EditPart.VISUAL_ID:
					if (LogicalFileEditPart.VISUAL_ID != CIMLevelZeroVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case BGPClusterElementNameEditPart.VISUAL_ID:
				case WrappingLabel38EditPart.VISUAL_ID:
					if (BGPClusterEditPart.VISUAL_ID != CIMLevelZeroVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case ApplicationSystemElementNameEditPart.VISUAL_ID:
				case WrappingLabel39EditPart.VISUAL_ID:
					if (ApplicationSystemEditPart.VISUAL_ID != CIMLevelZeroVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case SoftwareIdentityElementNameEditPart.VISUAL_ID:
				case WrappingLabel40EditPart.VISUAL_ID:
					if (SoftwareIdentityEditPart.VISUAL_ID != CIMLevelZeroVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case WirelessPortElementNameEditPart.VISUAL_ID:
				case WrappingLabel41EditPart.VISUAL_ID:
					if (WirelessPortEditPart.VISUAL_ID != CIMLevelZeroVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case CLPSettingDataElementNameEditPart.VISUAL_ID:
				case WrappingLabel42EditPart.VISUAL_ID:
					if (CLPSettingDataEditPart.VISUAL_ID != CIMLevelZeroVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case GenericServiceElementNameEditPart.VISUAL_ID:
				case WrappingLabel43EditPart.VISUAL_ID:
					if (GenericServiceEditPart.VISUAL_ID != CIMLevelZeroVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case NATListBasedSettingsElementNameEditPart.VISUAL_ID:
				case WrappingLabel44EditPart.VISUAL_ID:
					if (NATListBasedSettingsEditPart.VISUAL_ID != CIMLevelZeroVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case VDSLModemElementNameEditPart.VISUAL_ID:
				case WrappingLabel45EditPart.VISUAL_ID:
					if (VDSLModemEditPart.VISUAL_ID != CIMLevelZeroVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case USBPortElementNameEditPart.VISUAL_ID:
				case WrappingLabel46EditPart.VISUAL_ID:
					if (USBPortEditPart.VISUAL_ID != CIMLevelZeroVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case DNSProtocolEndpointElementNameEditPart.VISUAL_ID:
				case WrappingLabel47EditPart.VISUAL_ID:
					if (DNSProtocolEndpointEditPart.VISUAL_ID != CIMLevelZeroVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case WiFiEndpointSettingsElementNameEditPart.VISUAL_ID:
				case WrappingLabel48EditPart.VISUAL_ID:
					if (WiFiEndpointSettingsEditPart.VISUAL_ID != CIMLevelZeroVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case SSHSettingDataElementNameEditPart.VISUAL_ID:
				case WrappingLabel49EditPart.VISUAL_ID:
					if (SSHSettingDataEditPart.VISUAL_ID != CIMLevelZeroVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case WirelessLANEndpointElementNameEditPart.VISUAL_ID:
				case WrappingLabel50EditPart.VISUAL_ID:
					if (WirelessLANEndpointEditPart.VISUAL_ID != CIMLevelZeroVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case DHCPProtocolEndpointElementNameEditPart.VISUAL_ID:
				case WrappingLabel51EditPart.VISUAL_ID:
					if (DHCPProtocolEndpointEditPart.VISUAL_ID != CIMLevelZeroVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case IPHeadersFilterElementNameEditPart.VISUAL_ID:
				case WrappingLabel52EditPart.VISUAL_ID:
					if (IPHeadersFilterEditPart.VISUAL_ID != CIMLevelZeroVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case DirectoryElementNameEditPart.VISUAL_ID:
				case WrappingLabel53EditPart.VISUAL_ID:
					if (DirectoryEditPart.VISUAL_ID != CIMLevelZeroVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case IPAddressRangeElementNameEditPart.VISUAL_ID:
				case WrappingLabel54EditPart.VISUAL_ID:
					if (IPAddressRangeEditPart.VISUAL_ID != CIMLevelZeroVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case SNMPTrapTargetElementNameEditPart.VISUAL_ID:
				case WrappingLabel55EditPart.VISUAL_ID:
					if (SNMPTrapTargetEditPart.VISUAL_ID != CIMLevelZeroVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case IPXConnectivityNetworkElementNameEditPart.VISUAL_ID:
				case WrappingLabel56EditPart.VISUAL_ID:
					if (IPXConnectivityNetworkEditPart.VISUAL_ID != CIMLevelZeroVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case ConnectivityMemberhipSettingDataElementNameEditPart.VISUAL_ID:
				case WrappingLabel57EditPart.VISUAL_ID:
					if (ConnectivityMemberhipSettingDataEditPart.VISUAL_ID != CIMLevelZeroVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case ConditioningServiceElementNameEditPart.VISUAL_ID:
				case WrappingLabel58EditPart.VISUAL_ID:
					if (ConditioningServiceEditPart.VISUAL_ID != CIMLevelZeroVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case BIOSFeatureElementNameEditPart.VISUAL_ID:
				case WrappingLabel59EditPart.VISUAL_ID:
					if (BIOSFeatureEditPart.VISUAL_ID != CIMLevelZeroVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case OSPFProtocolEndpointElementNameEditPart.VISUAL_ID:
				case WrappingLabel60EditPart.VISUAL_ID:
					if (OSPFProtocolEndpointEditPart.VISUAL_ID != CIMLevelZeroVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case FilterListElementNameEditPart.VISUAL_ID:
				case WrappingLabel61EditPart.VISUAL_ID:
					if (FilterListEditPart.VISUAL_ID != CIMLevelZeroVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case BGPServiceElementNameEditPart.VISUAL_ID:
				case WrappingLabel62EditPart.VISUAL_ID:
					if (BGPServiceEditPart.VISUAL_ID != CIMLevelZeroVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case PrecedenceServiceElementNameEditPart.VISUAL_ID:
				case WrappingLabel63EditPart.VISUAL_ID:
					if (PrecedenceServiceEditPart.VISUAL_ID != CIMLevelZeroVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case DHCPCapabilitiesElementNameEditPart.VISUAL_ID:
				case WrappingLabel64EditPart.VISUAL_ID:
					if (DHCPCapabilitiesEditPart.VISUAL_ID != CIMLevelZeroVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case Hdr8021PServiceElementNameEditPart.VISUAL_ID:
				case WrappingLabel65EditPart.VISUAL_ID:
					if (Hdr8021PServiceEditPart.VISUAL_ID != CIMLevelZeroVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case ReplacementSetElementNameEditPart.VISUAL_ID:
				case WrappingLabel66EditPart.VISUAL_ID:
					if (ReplacementSetEditPart.VISUAL_ID != CIMLevelZeroVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case HDSLModemElementNameEditPart.VISUAL_ID:
				case WrappingLabel67EditPart.VISUAL_ID:
					if (HDSLModemEditPart.VISUAL_ID != CIMLevelZeroVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case ServiceAccessURIElementNameEditPart.VISUAL_ID:
				case WrappingLabel68EditPart.VISUAL_ID:
					if (ServiceAccessURIEditPart.VISUAL_ID != CIMLevelZeroVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case FilterEntryElementNameEditPart.VISUAL_ID:
				case WrappingLabel69EditPart.VISUAL_ID:
					if (FilterEntryEditPart.VISUAL_ID != CIMLevelZeroVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case SNMPCommunityStringsElementNameEditPart.VISUAL_ID:
				case WrappingLabel70EditPart.VISUAL_ID:
					if (SNMPCommunityStringsEditPart.VISUAL_ID != CIMLevelZeroVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case NetworkElementNameEditPart.VISUAL_ID:
				case WrappingLabel71EditPart.VISUAL_ID:
					if (NetworkEditPart.VISUAL_ID != CIMLevelZeroVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case FileSpecificationElementNameEditPart.VISUAL_ID:
				case WrappingLabel72EditPart.VISUAL_ID:
					if (FileSpecificationEditPart.VISUAL_ID != CIMLevelZeroVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case IPXNetworkElementNameEditPart.VISUAL_ID:
				case WrappingLabel73EditPart.VISUAL_ID:
					if (IPXNetworkEditPart.VISUAL_ID != CIMLevelZeroVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case PowerManagementCapabilitiesElementNameEditPart.VISUAL_ID:
				case WrappingLabel74EditPart.VISUAL_ID:
					if (PowerManagementCapabilitiesEditPart.VISUAL_ID != CIMLevelZeroVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case FlowServiceElementNameEditPart.VISUAL_ID:
				case WrappingLabel75EditPart.VISUAL_ID:
					if (FlowServiceEditPart.VISUAL_ID != CIMLevelZeroVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case ISDNModemElementNameEditPart.VISUAL_ID:
				case WrappingLabel76EditPart.VISUAL_ID:
					if (ISDNModemEditPart.VISUAL_ID != CIMLevelZeroVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case IPXProtocolEndpointElementNameEditPart.VISUAL_ID:
				case WrappingLabel77EditPart.VISUAL_ID:
					if (IPXProtocolEndpointEditPart.VISUAL_ID != CIMLevelZeroVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case IPProtocolEndpointElementNameEditPart.VISUAL_ID:
				case WrappingLabel78EditPart.VISUAL_ID:
					if (IPProtocolEndpointEditPart.VISUAL_ID != CIMLevelZeroVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case UDPProtocolEndpointElementNameEditPart.VISUAL_ID:
				case WrappingLabel79EditPart.VISUAL_ID:
					if (UDPProtocolEndpointEditPart.VISUAL_ID != CIMLevelZeroVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case ProductElementNameEditPart.VISUAL_ID:
				case WrappingLabel80EditPart.VISUAL_ID:
					if (ProductEditPart.VISUAL_ID != CIMLevelZeroVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case MemoryCapacityElementNameEditPart.VISUAL_ID:
				case WrappingLabel81EditPart.VISUAL_ID:
					if (MemoryCapacityEditPart.VISUAL_ID != CIMLevelZeroVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case RoutingProtocolDomainElementNameEditPart.VISUAL_ID:
				case WrappingLabel82EditPart.VISUAL_ID:
					if (RoutingProtocolDomainEditPart.VISUAL_ID != CIMLevelZeroVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case AFServiceElementNameEditPart.VISUAL_ID:
				case WrappingLabel83EditPart.VISUAL_ID:
					if (AFServiceEditPart.VISUAL_ID != CIMLevelZeroVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case LANSegmentElementNameEditPart.VISUAL_ID:
				case WrappingLabel84EditPart.VISUAL_ID:
					if (LANSegmentEditPart.VISUAL_ID != CIMLevelZeroVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case NATStaticSettingsElementNameEditPart.VISUAL_ID:
				case WrappingLabel85EditPart.VISUAL_ID:
					if (NATStaticSettingsEditPart.VISUAL_ID != CIMLevelZeroVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case TelnetProtocolEndpointElementNameEditPart.VISUAL_ID:
				case WrappingLabel86EditPart.VISUAL_ID:
					if (TelnetProtocolEndpointEditPart.VISUAL_ID != CIMLevelZeroVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case LANEndpointElementNameEditPart.VISUAL_ID:
				case WrappingLabel87EditPart.VISUAL_ID:
					if (LANEndpointEditPart.VISUAL_ID != CIMLevelZeroVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case DropThresholdCalculationServiceElementNameEditPart.VISUAL_ID:
				case WrappingLabel88EditPart.VISUAL_ID:
					if (DropThresholdCalculationServiceEditPart.VISUAL_ID != CIMLevelZeroVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case AdminDomainElementNameEditPart.VISUAL_ID:
				case WrappingLabel89EditPart.VISUAL_ID:
					if (AdminDomainEditPart.VISUAL_ID != CIMLevelZeroVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case SystemSpecificCollectionElementNameEditPart.VISUAL_ID:
				case WrappingLabel90EditPart.VISUAL_ID:
					if (SystemSpecificCollectionEditPart.VISUAL_ID != CIMLevelZeroVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case NextHopRoutingElementNameEditPart.VISUAL_ID:
				case WrappingLabel91EditPart.VISUAL_ID:
					if (NextHopRoutingEditPart.VISUAL_ID != CIMLevelZeroVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case ComputerSystemElementNameEditPart.VISUAL_ID:
				case WrappingLabel92EditPart.VISUAL_ID:
					if (ComputerSystemEditPart.VISUAL_ID != CIMLevelZeroVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case NetworkPortElementNameEditPart.VISUAL_ID:
				case WrappingLabel93EditPart.VISUAL_ID:
					if (NetworkPortEditPart.VISUAL_ID != CIMLevelZeroVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case RemoteServiceAccessPointElementNameEditPart.VISUAL_ID:
				case WrappingLabel94EditPart.VISUAL_ID:
					if (RemoteServiceAccessPointEditPart.VISUAL_ID != CIMLevelZeroVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case WrappingLabel95EditPart.VISUAL_ID:
					if (DirectorySpecificationDirectorySpecificationFilesEditPart.VISUAL_ID != CIMLevelZeroVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case WrappingLabel96EditPart.VISUAL_ID:
					if (OperatingSystemOperatingSystemSoftwareFeatureEditPart.VISUAL_ID != CIMLevelZeroVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case WrappingLabel97EditPart.VISUAL_ID:
					if (SoftwareElementSoftwareElementActionsEditPart.VISUAL_ID != CIMLevelZeroVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case WrappingLabel98EditPart.VISUAL_ID:
					if (SoftwareElementSoftwareElementChecksEditPart.VISUAL_ID != CIMLevelZeroVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case WrappingLabel99EditPart.VISUAL_ID:
					if (InstalledProductSoftwareElementsEditPart.VISUAL_ID != CIMLevelZeroVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case WrappingLabel100EditPart.VISUAL_ID:
					if (BGPServiceBGPPeerGroupServicesEditPart.VISUAL_ID != CIMLevelZeroVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case WrappingLabel101EditPart.VISUAL_ID:
					if (BGPClusterReflectorClientServiceEditPart.VISUAL_ID != CIMLevelZeroVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case WrappingLabel102EditPart.VISUAL_ID:
					if (BGPClusterReflectorNonClientServiceEditPart.VISUAL_ID != CIMLevelZeroVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case WrappingLabel103EditPart.VISUAL_ID:
					if (BGPClusterReflectorServiceEditPart.VISUAL_ID != CIMLevelZeroVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case WrappingLabel104EditPart.VISUAL_ID:
					if (ServiceAccessPointBindsToEditPart.VISUAL_ID != CIMLevelZeroVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case WrappingLabel105EditPart.VISUAL_ID:
					if (ManagedElementComponentsEditPart.VISUAL_ID != CIMLevelZeroVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case WrappingLabel106EditPart.VISUAL_ID:
					if (AdminDomainContainedDomainEditPart.VISUAL_ID != CIMLevelZeroVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case WrappingLabel107EditPart.VISUAL_ID:
					if (ManagedElementDependenciesEditPart.VISUAL_ID != CIMLevelZeroVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case WrappingLabel108EditPart.VISUAL_ID:
					if (LogicalDeviceDeviceConnectionEditPart.VISUAL_ID != CIMLevelZeroVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case WrappingLabel109EditPart.VISUAL_ID:
					if (LogicalDeviceDeviceIdentityEditPart.VISUAL_ID != CIMLevelZeroVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case WrappingLabel110EditPart.VISUAL_ID:
					if (LogicalDeviceDeviceSAPImplementationEditPart.VISUAL_ID != CIMLevelZeroVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case WrappingLabel111EditPart.VISUAL_ID:
					if (ManagedElementElementCapabilitiesEditPart.VISUAL_ID != CIMLevelZeroVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case WrappingLabel112EditPart.VISUAL_ID:
					if (ManagedElementElementSettingDataEditPart.VISUAL_ID != CIMLevelZeroVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case WrappingLabel113EditPart.VISUAL_ID:
					if (SoftwareIdentityElementSoftwareIdentityEditPart.VISUAL_ID != CIMLevelZeroVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case WrappingLabel114EditPart.VISUAL_ID:
					if (SystemHostedAccessPointEditPart.VISUAL_ID != CIMLevelZeroVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case WrappingLabel115EditPart.VISUAL_ID:
					if (SystemHostedCollectionEditPart.VISUAL_ID != CIMLevelZeroVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case WrappingLabel116EditPart.VISUAL_ID:
					if (ManagedElementHostedDependencyEditPart.VISUAL_ID != CIMLevelZeroVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case WrappingLabel117EditPart.VISUAL_ID:
					if (SystemHostedServicesEditPart.VISUAL_ID != CIMLevelZeroVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case WrappingLabel118EditPart.VISUAL_ID:
					if (ElementSoftwareIdentityManagedElementEditPart.VISUAL_ID != CIMLevelZeroVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case WrappingLabel119EditPart.VISUAL_ID:
					if (ProductProductProductDependencyEditPart.VISUAL_ID != CIMLevelZeroVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case WrappingLabel120EditPart.VISUAL_ID:
					if (ProductProductServiceComponentEditPart.VISUAL_ID != CIMLevelZeroVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case WrappingLabel121EditPart.VISUAL_ID:
					if (EnabledLogicalElementRemoteAccessAvailableToElementEditPart.VISUAL_ID != CIMLevelZeroVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case WrappingLabel122EditPart.VISUAL_ID:
					if (SystemRolesEditPart.VISUAL_ID != CIMLevelZeroVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case WrappingLabel123EditPart.VISUAL_ID:
					if (ServiceAccessPointSAPSAPDependencyEditPart.VISUAL_ID != CIMLevelZeroVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case WrappingLabel124EditPart.VISUAL_ID:
					if (ServiceServiceAccessBySAPEditPart.VISUAL_ID != CIMLevelZeroVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case WrappingLabel125EditPart.VISUAL_ID:
					if (ServiceServiceComponentsEditPart.VISUAL_ID != CIMLevelZeroVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case WrappingLabel126EditPart.VISUAL_ID:
					if (ServiceServiceServiceDependencyEditPart.VISUAL_ID != CIMLevelZeroVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case WrappingLabel127EditPart.VISUAL_ID:
					if (ElementSettingDataSettingDataEditPart.VISUAL_ID != CIMLevelZeroVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case WrappingLabel128EditPart.VISUAL_ID:
					if (SettingDataSettingsDefineCapabilitiesEditPart.VISUAL_ID != CIMLevelZeroVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case WrappingLabel129EditPart.VISUAL_ID:
					if (ManagedSystemElementStatusDescriptionsEditPart.VISUAL_ID != CIMLevelZeroVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case WrappingLabel130EditPart.VISUAL_ID:
					if (SystemSystemComponentsEditPart.VISUAL_ID != CIMLevelZeroVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case WrappingLabel131EditPart.VISUAL_ID:
					if (SystemSystemDevicesEditPart.VISUAL_ID != CIMLevelZeroVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case WrappingLabel132EditPart.VISUAL_ID:
					if (LogicalModuleModulePortEditPart.VISUAL_ID != CIMLevelZeroVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case WrappingLabel133EditPart.VISUAL_ID:
					if (AFServiceAFRelatedServicesEditPart.VISUAL_ID != CIMLevelZeroVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case WrappingLabel134EditPart.VISUAL_ID:
					if (QoSServiceQoSConditioningSubServiceEditPart.VISUAL_ID != CIMLevelZeroVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case WrappingLabel135EditPart.VISUAL_ID:
					if (QoSServiceQoSSubServiceEditPart.VISUAL_ID != CIMLevelZeroVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case WrappingLabel136EditPart.VISUAL_ID:
					if (CollectionMembersEditPart.VISUAL_ID != CIMLevelZeroVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case WrappingLabel137EditPart.VISUAL_ID:
					if (NATListBasedSettingsAddressesToBeTranslatedEditPart.VISUAL_ID != CIMLevelZeroVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case WrappingLabel138EditPart.VISUAL_ID:
					if (BGPServiceBGPAdminDistanceEditPart.VISUAL_ID != CIMLevelZeroVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case WrappingLabel139EditPart.VISUAL_ID:
					if (ServiceAccessPointBindsToLANEndpointEditPart.VISUAL_ID != CIMLevelZeroVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case WrappingLabel140EditPart.VISUAL_ID:
					if (RouteCalculationServiceCalculatesAmongEditPart.VISUAL_ID != CIMLevelZeroVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case WrappingLabel141EditPart.VISUAL_ID:
					if (ProtocolEndpointEgressConditioningServiceOnEndpointEditPart.VISUAL_ID != CIMLevelZeroVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case WrappingLabel142EditPart.VISUAL_ID:
					if (CIM_ModelElementsEditPart.VISUAL_ID != CIMLevelZeroVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case WrappingLabel143EditPart.VISUAL_ID:
					if (ForwardingServiceForwardedRoutesEditPart.VISUAL_ID != CIMLevelZeroVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case WrappingLabel144EditPart.VISUAL_ID:
					if (ForwardingServiceForwardsAmongEditPart.VISUAL_ID != CIMLevelZeroVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case WrappingLabel145EditPart.VISUAL_ID:
					if (ComputerSystemHostedFilterListEditPart.VISUAL_ID != CIMLevelZeroVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case WrappingLabel146EditPart.VISUAL_ID:
					if (ComputerSystemHostedForwardingServicesEditPart.VISUAL_ID != CIMLevelZeroVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case WrappingLabel147EditPart.VISUAL_ID:
					if (SystemHostedRouteEditPart.VISUAL_ID != CIMLevelZeroVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case WrappingLabel148EditPart.VISUAL_ID:
					if (ComputerSystemHostedRoutingPolicyEditPart.VISUAL_ID != CIMLevelZeroVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case WrappingLabel149EditPart.VISUAL_ID:
					if (ProtocolEndpointIngressConditioningServiceOnEndpointEditPart.VISUAL_ID != CIMLevelZeroVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case WrappingLabel150EditPart.VISUAL_ID:
					if (LogicalNetworkInLogicalNetworkEditPart.VISUAL_ID != CIMLevelZeroVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case WrappingLabel151EditPart.VISUAL_ID:
					if (LANSegmentInSegmentEditPart.VISUAL_ID != CIMLevelZeroVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case WrappingLabel152EditPart.VISUAL_ID:
					if (NATServiceNATServiceRunningOnEndpointEditPart.VISUAL_ID != CIMLevelZeroVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case WrappingLabel153EditPart.VISUAL_ID:
					if (AdminDomainNetworksInAdminDomainEditPart.VISUAL_ID != CIMLevelZeroVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case WrappingLabel154EditPart.VISUAL_ID:
					if (LogicalPortPortImplementsEndPointEditPart.VISUAL_ID != CIMLevelZeroVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case WrappingLabel155EditPart.VISUAL_ID:
					if (LogicalDevicePortOnDeviceEditPart.VISUAL_ID != CIMLevelZeroVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case WrappingLabel156EditPart.VISUAL_ID:
					if (ForwardingServiceRouteForwardedByServiceEditPart.VISUAL_ID != CIMLevelZeroVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case WrappingLabel157EditPart.VISUAL_ID:
					if (AutonomousSystemRouterInASEditPart.VISUAL_ID != CIMLevelZeroVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case WrappingLabel158EditPart.VISUAL_ID:
					if (BGPClusterRoutersInBGPClusterEditPart.VISUAL_ID != CIMLevelZeroVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case WrappingLabel159EditPart.VISUAL_ID:
					if (NextHopRouteRouteUsesEndpointEditPart.VISUAL_ID != CIMLevelZeroVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case WrappingLabel160EditPart.VISUAL_ID:
					if (AutonomousSystemRoutingProtocolDomainInASEditPart.VISUAL_ID != CIMLevelZeroVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case WrappingLabel161EditPart.VISUAL_ID:
					if (ComputerSystemRunningOSEditPart.VISUAL_ID != CIMLevelZeroVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case WrappingLabel162EditPart.VISUAL_ID:
					if (ServiceSoftwareFeatureServiceImplementationEditPart.VISUAL_ID != CIMLevelZeroVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case WrappingLabel163EditPart.VISUAL_ID:
					if (NATListBasedSettingsTranslationPoolForNATEditPart.VISUAL_ID != CIMLevelZeroVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case WrappingLabel164EditPart.VISUAL_ID:
					if (SNMPServiceTrapSourceForSNMPServiceEditPart.VISUAL_ID != CIMLevelZeroVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case WrappingLabel165EditPart.VISUAL_ID:
					if (NextHopRouteAssociatedNextHopEditPart.VISUAL_ID != CIMLevelZeroVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				default:
					return null;
				}
			}
		}
		return getNodeViewClass(containerView, visualID);
	}

	/**
	 * @generated
	 */
	protected Class getNodeViewClass(View containerView, int visualID) {
		if (containerView == null
				|| !CIMLevelZeroVisualIDRegistry.canCreateNode(containerView,
						visualID)) {
			return null;
		}
		switch (visualID) {
		case USBDeviceEditPart.VISUAL_ID:
			return USBDeviceViewFactory.class;
		case USBDeviceElementNameEditPart.VISUAL_ID:
			return USBDeviceElementNameViewFactory.class;
		case WrappingLabelEditPart.VISUAL_ID:
			return WrappingLabelViewFactory.class;
		case OSPFVirtualInterfaceEditPart.VISUAL_ID:
			return OSPFVirtualInterfaceViewFactory.class;
		case OSPFVirtualInterfaceElementNameEditPart.VISUAL_ID:
			return OSPFVirtualInterfaceElementNameViewFactory.class;
		case WrappingLabel2EditPart.VISUAL_ID:
			return WrappingLabel2ViewFactory.class;
		case WiFiPortEditPart.VISUAL_ID:
			return WiFiPortViewFactory.class;
		case WiFiPortElementNameEditPart.VISUAL_ID:
			return WiFiPortElementNameViewFactory.class;
		case WrappingLabel3EditPart.VISUAL_ID:
			return WrappingLabel3ViewFactory.class;
		case ProtocolServiceEditPart.VISUAL_ID:
			return ProtocolServiceViewFactory.class;
		case ProtocolServiceElementNameEditPart.VISUAL_ID:
			return ProtocolServiceElementNameViewFactory.class;
		case WrappingLabel4EditPart.VISUAL_ID:
			return WrappingLabel4ViewFactory.class;
		case RoutingPolicyEditPart.VISUAL_ID:
			return RoutingPolicyViewFactory.class;
		case RoutingPolicyElementNameEditPart.VISUAL_ID:
			return RoutingPolicyElementNameViewFactory.class;
		case WrappingLabel5EditPart.VISUAL_ID:
			return WrappingLabel5ViewFactory.class;
		case EnabledLogicalElementCapabilitiesEditPart.VISUAL_ID:
			return EnabledLogicalElementCapabilitiesViewFactory.class;
		case EnabledLogicalElementCapabilitiesElementNameEditPart.VISUAL_ID:
			return EnabledLogicalElementCapabilitiesElementNameViewFactory.class;
		case WrappingLabel6EditPart.VISUAL_ID:
			return WrappingLabel6ViewFactory.class;
		case BufferPoolEditPart.VISUAL_ID:
			return BufferPoolViewFactory.class;
		case BufferPoolElementNameEditPart.VISUAL_ID:
			return BufferPoolElementNameViewFactory.class;
		case WrappingLabel7EditPart.VISUAL_ID:
			return WrappingLabel7ViewFactory.class;
		case MPLSProtocolEndpointEditPart.VISUAL_ID:
			return MPLSProtocolEndpointViewFactory.class;
		case MPLSProtocolEndpointElementNameEditPart.VISUAL_ID:
			return MPLSProtocolEndpointElementNameViewFactory.class;
		case WrappingLabel8EditPart.VISUAL_ID:
			return WrappingLabel8ViewFactory.class;
		case AutonomousSystemEditPart.VISUAL_ID:
			return AutonomousSystemViewFactory.class;
		case AutonomousSystemElementNameEditPart.VISUAL_ID:
			return AutonomousSystemElementNameViewFactory.class;
		case WrappingLabel9EditPart.VISUAL_ID:
			return WrappingLabel9ViewFactory.class;
		case DNSSettingDataEditPart.VISUAL_ID:
			return DNSSettingDataViewFactory.class;
		case DNSSettingDataElementNameEditPart.VISUAL_ID:
			return DNSSettingDataElementNameViewFactory.class;
		case WrappingLabel10EditPart.VISUAL_ID:
			return WrappingLabel10ViewFactory.class;
		case UniModemEditPart.VISUAL_ID:
			return UniModemViewFactory.class;
		case UniModemElementNameEditPart.VISUAL_ID:
			return UniModemElementNameViewFactory.class;
		case WrappingLabel11EditPart.VISUAL_ID:
			return WrappingLabel11ViewFactory.class;
		case EFServiceEditPart.VISUAL_ID:
			return EFServiceViewFactory.class;
		case EFServiceElementNameEditPart.VISUAL_ID:
			return EFServiceElementNameViewFactory.class;
		case WrappingLabel12EditPart.VISUAL_ID:
			return WrappingLabel12ViewFactory.class;
		case IPSubnetEditPart.VISUAL_ID:
			return IPSubnetViewFactory.class;
		case IPSubnetElementNameEditPart.VISUAL_ID:
			return IPSubnetElementNameViewFactory.class;
		case WrappingLabel13EditPart.VISUAL_ID:
			return WrappingLabel13ViewFactory.class;
		case NamedAddressCollectionEditPart.VISUAL_ID:
			return NamedAddressCollectionViewFactory.class;
		case NamedAddressCollectionElementNameEditPart.VISUAL_ID:
			return NamedAddressCollectionElementNameViewFactory.class;
		case WrappingLabel14EditPart.VISUAL_ID:
			return WrappingLabel14ViewFactory.class;
		case BIOSElementEditPart.VISUAL_ID:
			return BIOSElementViewFactory.class;
		case BIOSElementElementNameEditPart.VISUAL_ID:
			return BIOSElementElementNameViewFactory.class;
		case WrappingLabel15EditPart.VISUAL_ID:
			return WrappingLabel15ViewFactory.class;
		case TelnetSettingDataEditPart.VISUAL_ID:
			return TelnetSettingDataViewFactory.class;
		case TelnetSettingDataElementNameEditPart.VISUAL_ID:
			return TelnetSettingDataElementNameViewFactory.class;
		case WrappingLabel16EditPart.VISUAL_ID:
			return WrappingLabel16ViewFactory.class;
		case BGPPeerGroupEditPart.VISUAL_ID:
			return BGPPeerGroupViewFactory.class;
		case BGPPeerGroupElementNameEditPart.VISUAL_ID:
			return BGPPeerGroupElementNameViewFactory.class;
		case WrappingLabel17EditPart.VISUAL_ID:
			return WrappingLabel17ViewFactory.class;
		case LANConnectivitySegmentEditPart.VISUAL_ID:
			return LANConnectivitySegmentViewFactory.class;
		case LANConnectivitySegmentElementNameEditPart.VISUAL_ID:
			return LANConnectivitySegmentElementNameViewFactory.class;
		case WrappingLabel18EditPart.VISUAL_ID:
			return WrappingLabel18ViewFactory.class;
		case CableModemEditPart.VISUAL_ID:
			return CableModemViewFactory.class;
		case CableModemElementNameEditPart.VISUAL_ID:
			return CableModemElementNameViewFactory.class;
		case WrappingLabel19EditPart.VISUAL_ID:
			return WrappingLabel19ViewFactory.class;
		case SwitchPortEditPart.VISUAL_ID:
			return SwitchPortViewFactory.class;
		case SwitchPortElementNameEditPart.VISUAL_ID:
			return SwitchPortElementNameViewFactory.class;
		case WrappingLabel20EditPart.VISUAL_ID:
			return WrappingLabel20ViewFactory.class;
		case TCPProtocolEndpointEditPart.VISUAL_ID:
			return TCPProtocolEndpointViewFactory.class;
		case TCPProtocolEndpointElementNameEditPart.VISUAL_ID:
			return TCPProtocolEndpointElementNameViewFactory.class;
		case WrappingLabel21EditPart.VISUAL_ID:
			return WrappingLabel21ViewFactory.class;
		case AdministrativeDistanceEditPart.VISUAL_ID:
			return AdministrativeDistanceViewFactory.class;
		case AdministrativeDistanceElementNameEditPart.VISUAL_ID:
			return AdministrativeDistanceElementNameViewFactory.class;
		case WrappingLabel22EditPart.VISUAL_ID:
			return WrappingLabel22ViewFactory.class;
		case IPConnectivitySubnetEditPart.VISUAL_ID:
			return IPConnectivitySubnetViewFactory.class;
		case IPConnectivitySubnetElementNameEditPart.VISUAL_ID:
			return IPConnectivitySubnetElementNameViewFactory.class;
		case WrappingLabel23EditPart.VISUAL_ID:
			return WrappingLabel23ViewFactory.class;
		case VolatileStorageEditPart.VISUAL_ID:
			return VolatileStorageViewFactory.class;
		case VolatileStorageElementNameEditPart.VISUAL_ID:
			return VolatileStorageElementNameViewFactory.class;
		case WrappingLabel24EditPart.VISUAL_ID:
			return WrappingLabel24ViewFactory.class;
		case RangeOfIPAddressesEditPart.VISUAL_ID:
			return RangeOfIPAddressesViewFactory.class;
		case RangeOfIPAddressesElementNameEditPart.VISUAL_ID:
			return RangeOfIPAddressesElementNameViewFactory.class;
		case WrappingLabel25EditPart.VISUAL_ID:
			return WrappingLabel25ViewFactory.class;
		case BGPProtocolEndpointEditPart.VISUAL_ID:
			return BGPProtocolEndpointViewFactory.class;
		case BGPProtocolEndpointElementNameEditPart.VISUAL_ID:
			return BGPProtocolEndpointElementNameViewFactory.class;
		case WrappingLabel26EditPart.VISUAL_ID:
			return WrappingLabel26ViewFactory.class;
		case UnitaryComputerSystemEditPart.VISUAL_ID:
			return UnitaryComputerSystemViewFactory.class;
		case UnitaryComputerSystemElementNameEditPart.VISUAL_ID:
			return UnitaryComputerSystemElementNameViewFactory.class;
		case WrappingLabel27EditPart.VISUAL_ID:
			return WrappingLabel27ViewFactory.class;
		case EthernetPortEditPart.VISUAL_ID:
			return EthernetPortViewFactory.class;
		case EthernetPortElementNameEditPart.VISUAL_ID:
			return EthernetPortElementNameViewFactory.class;
		case WrappingLabel28EditPart.VISUAL_ID:
			return WrappingLabel28ViewFactory.class;
		case SNMPServiceEditPart.VISUAL_ID:
			return SNMPServiceViewFactory.class;
		case SNMPServiceElementNameEditPart.VISUAL_ID:
			return SNMPServiceElementNameViewFactory.class;
		case WrappingLabel29EditPart.VISUAL_ID:
			return WrappingLabel29ViewFactory.class;
		case LogicalModuleEditPart.VISUAL_ID:
			return LogicalModuleViewFactory.class;
		case LogicalModuleElementNameEditPart.VISUAL_ID:
			return LogicalModuleElementNameViewFactory.class;
		case WrappingLabel30EditPart.VISUAL_ID:
			return WrappingLabel30ViewFactory.class;
		case NextHopIPRouteEditPart.VISUAL_ID:
			return NextHopIPRouteViewFactory.class;
		case NextHopIPRouteElementNameEditPart.VISUAL_ID:
			return NextHopIPRouteElementNameViewFactory.class;
		case WrappingLabel31EditPart.VISUAL_ID:
			return WrappingLabel31ViewFactory.class;
		case OperatingSystemEditPart.VISUAL_ID:
			return OperatingSystemViewFactory.class;
		case OperatingSystemElementNameEditPart.VISUAL_ID:
			return OperatingSystemElementNameViewFactory.class;
		case WrappingLabel32EditPart.VISUAL_ID:
			return WrappingLabel32ViewFactory.class;
		case SDSLModemEditPart.VISUAL_ID:
			return SDSLModemViewFactory.class;
		case SDSLModemElementNameEditPart.VISUAL_ID:
			return SDSLModemElementNameViewFactory.class;
		case WrappingLabel33EditPart.VISUAL_ID:
			return WrappingLabel33ViewFactory.class;
		case WiFiEndPointEditPart.VISUAL_ID:
			return WiFiEndPointViewFactory.class;
		case WiFiEndPointElementNameEditPart.VISUAL_ID:
			return WiFiEndPointElementNameViewFactory.class;
		case WrappingLabel34EditPart.VISUAL_ID:
			return WrappingLabel34ViewFactory.class;
		case NATServiceEditPart.VISUAL_ID:
			return NATServiceViewFactory.class;
		case NATServiceElementNameEditPart.VISUAL_ID:
			return NATServiceElementNameViewFactory.class;
		case WrappingLabel35EditPart.VISUAL_ID:
			return WrappingLabel35ViewFactory.class;
		case ADSLModemEditPart.VISUAL_ID:
			return ADSLModemViewFactory.class;
		case ADSLModemElementNameEditPart.VISUAL_ID:
			return ADSLModemElementNameViewFactory.class;
		case WrappingLabel36EditPart.VISUAL_ID:
			return WrappingLabel36ViewFactory.class;
		case LogicalFileEditPart.VISUAL_ID:
			return LogicalFileViewFactory.class;
		case LogicalFileElementNameEditPart.VISUAL_ID:
			return LogicalFileElementNameViewFactory.class;
		case WrappingLabel37EditPart.VISUAL_ID:
			return WrappingLabel37ViewFactory.class;
		case BGPClusterEditPart.VISUAL_ID:
			return BGPClusterViewFactory.class;
		case BGPClusterElementNameEditPart.VISUAL_ID:
			return BGPClusterElementNameViewFactory.class;
		case WrappingLabel38EditPart.VISUAL_ID:
			return WrappingLabel38ViewFactory.class;
		case ApplicationSystemEditPart.VISUAL_ID:
			return ApplicationSystemViewFactory.class;
		case ApplicationSystemElementNameEditPart.VISUAL_ID:
			return ApplicationSystemElementNameViewFactory.class;
		case WrappingLabel39EditPart.VISUAL_ID:
			return WrappingLabel39ViewFactory.class;
		case SoftwareIdentityEditPart.VISUAL_ID:
			return SoftwareIdentityViewFactory.class;
		case SoftwareIdentityElementNameEditPart.VISUAL_ID:
			return SoftwareIdentityElementNameViewFactory.class;
		case WrappingLabel40EditPart.VISUAL_ID:
			return WrappingLabel40ViewFactory.class;
		case WirelessPortEditPart.VISUAL_ID:
			return WirelessPortViewFactory.class;
		case WirelessPortElementNameEditPart.VISUAL_ID:
			return WirelessPortElementNameViewFactory.class;
		case WrappingLabel41EditPart.VISUAL_ID:
			return WrappingLabel41ViewFactory.class;
		case CLPSettingDataEditPart.VISUAL_ID:
			return CLPSettingDataViewFactory.class;
		case CLPSettingDataElementNameEditPart.VISUAL_ID:
			return CLPSettingDataElementNameViewFactory.class;
		case WrappingLabel42EditPart.VISUAL_ID:
			return WrappingLabel42ViewFactory.class;
		case GenericServiceEditPart.VISUAL_ID:
			return GenericServiceViewFactory.class;
		case GenericServiceElementNameEditPart.VISUAL_ID:
			return GenericServiceElementNameViewFactory.class;
		case WrappingLabel43EditPart.VISUAL_ID:
			return WrappingLabel43ViewFactory.class;
		case NATListBasedSettingsEditPart.VISUAL_ID:
			return NATListBasedSettingsViewFactory.class;
		case NATListBasedSettingsElementNameEditPart.VISUAL_ID:
			return NATListBasedSettingsElementNameViewFactory.class;
		case WrappingLabel44EditPart.VISUAL_ID:
			return WrappingLabel44ViewFactory.class;
		case VDSLModemEditPart.VISUAL_ID:
			return VDSLModemViewFactory.class;
		case VDSLModemElementNameEditPart.VISUAL_ID:
			return VDSLModemElementNameViewFactory.class;
		case WrappingLabel45EditPart.VISUAL_ID:
			return WrappingLabel45ViewFactory.class;
		case USBPortEditPart.VISUAL_ID:
			return USBPortViewFactory.class;
		case USBPortElementNameEditPart.VISUAL_ID:
			return USBPortElementNameViewFactory.class;
		case WrappingLabel46EditPart.VISUAL_ID:
			return WrappingLabel46ViewFactory.class;
		case DNSProtocolEndpointEditPart.VISUAL_ID:
			return DNSProtocolEndpointViewFactory.class;
		case DNSProtocolEndpointElementNameEditPart.VISUAL_ID:
			return DNSProtocolEndpointElementNameViewFactory.class;
		case WrappingLabel47EditPart.VISUAL_ID:
			return WrappingLabel47ViewFactory.class;
		case WiFiEndpointSettingsEditPart.VISUAL_ID:
			return WiFiEndpointSettingsViewFactory.class;
		case WiFiEndpointSettingsElementNameEditPart.VISUAL_ID:
			return WiFiEndpointSettingsElementNameViewFactory.class;
		case WrappingLabel48EditPart.VISUAL_ID:
			return WrappingLabel48ViewFactory.class;
		case SSHSettingDataEditPart.VISUAL_ID:
			return SSHSettingDataViewFactory.class;
		case SSHSettingDataElementNameEditPart.VISUAL_ID:
			return SSHSettingDataElementNameViewFactory.class;
		case WrappingLabel49EditPart.VISUAL_ID:
			return WrappingLabel49ViewFactory.class;
		case WirelessLANEndpointEditPart.VISUAL_ID:
			return WirelessLANEndpointViewFactory.class;
		case WirelessLANEndpointElementNameEditPart.VISUAL_ID:
			return WirelessLANEndpointElementNameViewFactory.class;
		case WrappingLabel50EditPart.VISUAL_ID:
			return WrappingLabel50ViewFactory.class;
		case DHCPProtocolEndpointEditPart.VISUAL_ID:
			return DHCPProtocolEndpointViewFactory.class;
		case DHCPProtocolEndpointElementNameEditPart.VISUAL_ID:
			return DHCPProtocolEndpointElementNameViewFactory.class;
		case WrappingLabel51EditPart.VISUAL_ID:
			return WrappingLabel51ViewFactory.class;
		case IPHeadersFilterEditPart.VISUAL_ID:
			return IPHeadersFilterViewFactory.class;
		case IPHeadersFilterElementNameEditPart.VISUAL_ID:
			return IPHeadersFilterElementNameViewFactory.class;
		case WrappingLabel52EditPart.VISUAL_ID:
			return WrappingLabel52ViewFactory.class;
		case DirectoryEditPart.VISUAL_ID:
			return DirectoryViewFactory.class;
		case DirectoryElementNameEditPart.VISUAL_ID:
			return DirectoryElementNameViewFactory.class;
		case WrappingLabel53EditPart.VISUAL_ID:
			return WrappingLabel53ViewFactory.class;
		case IPAddressRangeEditPart.VISUAL_ID:
			return IPAddressRangeViewFactory.class;
		case IPAddressRangeElementNameEditPart.VISUAL_ID:
			return IPAddressRangeElementNameViewFactory.class;
		case WrappingLabel54EditPart.VISUAL_ID:
			return WrappingLabel54ViewFactory.class;
		case SNMPTrapTargetEditPart.VISUAL_ID:
			return SNMPTrapTargetViewFactory.class;
		case SNMPTrapTargetElementNameEditPart.VISUAL_ID:
			return SNMPTrapTargetElementNameViewFactory.class;
		case WrappingLabel55EditPart.VISUAL_ID:
			return WrappingLabel55ViewFactory.class;
		case IPXConnectivityNetworkEditPart.VISUAL_ID:
			return IPXConnectivityNetworkViewFactory.class;
		case IPXConnectivityNetworkElementNameEditPart.VISUAL_ID:
			return IPXConnectivityNetworkElementNameViewFactory.class;
		case WrappingLabel56EditPart.VISUAL_ID:
			return WrappingLabel56ViewFactory.class;
		case ConnectivityMemberhipSettingDataEditPart.VISUAL_ID:
			return ConnectivityMemberhipSettingDataViewFactory.class;
		case ConnectivityMemberhipSettingDataElementNameEditPart.VISUAL_ID:
			return ConnectivityMemberhipSettingDataElementNameViewFactory.class;
		case WrappingLabel57EditPart.VISUAL_ID:
			return WrappingLabel57ViewFactory.class;
		case ConditioningServiceEditPart.VISUAL_ID:
			return ConditioningServiceViewFactory.class;
		case ConditioningServiceElementNameEditPart.VISUAL_ID:
			return ConditioningServiceElementNameViewFactory.class;
		case WrappingLabel58EditPart.VISUAL_ID:
			return WrappingLabel58ViewFactory.class;
		case BIOSFeatureEditPart.VISUAL_ID:
			return BIOSFeatureViewFactory.class;
		case BIOSFeatureElementNameEditPart.VISUAL_ID:
			return BIOSFeatureElementNameViewFactory.class;
		case WrappingLabel59EditPart.VISUAL_ID:
			return WrappingLabel59ViewFactory.class;
		case OSPFProtocolEndpointEditPart.VISUAL_ID:
			return OSPFProtocolEndpointViewFactory.class;
		case OSPFProtocolEndpointElementNameEditPart.VISUAL_ID:
			return OSPFProtocolEndpointElementNameViewFactory.class;
		case WrappingLabel60EditPart.VISUAL_ID:
			return WrappingLabel60ViewFactory.class;
		case FilterListEditPart.VISUAL_ID:
			return FilterListViewFactory.class;
		case FilterListElementNameEditPart.VISUAL_ID:
			return FilterListElementNameViewFactory.class;
		case WrappingLabel61EditPart.VISUAL_ID:
			return WrappingLabel61ViewFactory.class;
		case BGPServiceEditPart.VISUAL_ID:
			return BGPServiceViewFactory.class;
		case BGPServiceElementNameEditPart.VISUAL_ID:
			return BGPServiceElementNameViewFactory.class;
		case WrappingLabel62EditPart.VISUAL_ID:
			return WrappingLabel62ViewFactory.class;
		case PrecedenceServiceEditPart.VISUAL_ID:
			return PrecedenceServiceViewFactory.class;
		case PrecedenceServiceElementNameEditPart.VISUAL_ID:
			return PrecedenceServiceElementNameViewFactory.class;
		case WrappingLabel63EditPart.VISUAL_ID:
			return WrappingLabel63ViewFactory.class;
		case DHCPCapabilitiesEditPart.VISUAL_ID:
			return DHCPCapabilitiesViewFactory.class;
		case DHCPCapabilitiesElementNameEditPart.VISUAL_ID:
			return DHCPCapabilitiesElementNameViewFactory.class;
		case WrappingLabel64EditPart.VISUAL_ID:
			return WrappingLabel64ViewFactory.class;
		case Hdr8021PServiceEditPart.VISUAL_ID:
			return Hdr8021PServiceViewFactory.class;
		case Hdr8021PServiceElementNameEditPart.VISUAL_ID:
			return Hdr8021PServiceElementNameViewFactory.class;
		case WrappingLabel65EditPart.VISUAL_ID:
			return WrappingLabel65ViewFactory.class;
		case ReplacementSetEditPart.VISUAL_ID:
			return ReplacementSetViewFactory.class;
		case ReplacementSetElementNameEditPart.VISUAL_ID:
			return ReplacementSetElementNameViewFactory.class;
		case WrappingLabel66EditPart.VISUAL_ID:
			return WrappingLabel66ViewFactory.class;
		case HDSLModemEditPart.VISUAL_ID:
			return HDSLModemViewFactory.class;
		case HDSLModemElementNameEditPart.VISUAL_ID:
			return HDSLModemElementNameViewFactory.class;
		case WrappingLabel67EditPart.VISUAL_ID:
			return WrappingLabel67ViewFactory.class;
		case ServiceAccessURIEditPart.VISUAL_ID:
			return ServiceAccessURIViewFactory.class;
		case ServiceAccessURIElementNameEditPart.VISUAL_ID:
			return ServiceAccessURIElementNameViewFactory.class;
		case WrappingLabel68EditPart.VISUAL_ID:
			return WrappingLabel68ViewFactory.class;
		case FilterEntryEditPart.VISUAL_ID:
			return FilterEntryViewFactory.class;
		case FilterEntryElementNameEditPart.VISUAL_ID:
			return FilterEntryElementNameViewFactory.class;
		case WrappingLabel69EditPart.VISUAL_ID:
			return WrappingLabel69ViewFactory.class;
		case SNMPCommunityStringsEditPart.VISUAL_ID:
			return SNMPCommunityStringsViewFactory.class;
		case SNMPCommunityStringsElementNameEditPart.VISUAL_ID:
			return SNMPCommunityStringsElementNameViewFactory.class;
		case WrappingLabel70EditPart.VISUAL_ID:
			return WrappingLabel70ViewFactory.class;
		case NetworkEditPart.VISUAL_ID:
			return NetworkViewFactory.class;
		case NetworkElementNameEditPart.VISUAL_ID:
			return NetworkElementNameViewFactory.class;
		case WrappingLabel71EditPart.VISUAL_ID:
			return WrappingLabel71ViewFactory.class;
		case FileSpecificationEditPart.VISUAL_ID:
			return FileSpecificationViewFactory.class;
		case FileSpecificationElementNameEditPart.VISUAL_ID:
			return FileSpecificationElementNameViewFactory.class;
		case WrappingLabel72EditPart.VISUAL_ID:
			return WrappingLabel72ViewFactory.class;
		case IPXNetworkEditPart.VISUAL_ID:
			return IPXNetworkViewFactory.class;
		case IPXNetworkElementNameEditPart.VISUAL_ID:
			return IPXNetworkElementNameViewFactory.class;
		case WrappingLabel73EditPart.VISUAL_ID:
			return WrappingLabel73ViewFactory.class;
		case PowerManagementCapabilitiesEditPart.VISUAL_ID:
			return PowerManagementCapabilitiesViewFactory.class;
		case PowerManagementCapabilitiesElementNameEditPart.VISUAL_ID:
			return PowerManagementCapabilitiesElementNameViewFactory.class;
		case WrappingLabel74EditPart.VISUAL_ID:
			return WrappingLabel74ViewFactory.class;
		case FlowServiceEditPart.VISUAL_ID:
			return FlowServiceViewFactory.class;
		case FlowServiceElementNameEditPart.VISUAL_ID:
			return FlowServiceElementNameViewFactory.class;
		case WrappingLabel75EditPart.VISUAL_ID:
			return WrappingLabel75ViewFactory.class;
		case ISDNModemEditPart.VISUAL_ID:
			return ISDNModemViewFactory.class;
		case ISDNModemElementNameEditPart.VISUAL_ID:
			return ISDNModemElementNameViewFactory.class;
		case WrappingLabel76EditPart.VISUAL_ID:
			return WrappingLabel76ViewFactory.class;
		case IPXProtocolEndpointEditPart.VISUAL_ID:
			return IPXProtocolEndpointViewFactory.class;
		case IPXProtocolEndpointElementNameEditPart.VISUAL_ID:
			return IPXProtocolEndpointElementNameViewFactory.class;
		case WrappingLabel77EditPart.VISUAL_ID:
			return WrappingLabel77ViewFactory.class;
		case IPProtocolEndpointEditPart.VISUAL_ID:
			return IPProtocolEndpointViewFactory.class;
		case IPProtocolEndpointElementNameEditPart.VISUAL_ID:
			return IPProtocolEndpointElementNameViewFactory.class;
		case WrappingLabel78EditPart.VISUAL_ID:
			return WrappingLabel78ViewFactory.class;
		case UDPProtocolEndpointEditPart.VISUAL_ID:
			return UDPProtocolEndpointViewFactory.class;
		case UDPProtocolEndpointElementNameEditPart.VISUAL_ID:
			return UDPProtocolEndpointElementNameViewFactory.class;
		case WrappingLabel79EditPart.VISUAL_ID:
			return WrappingLabel79ViewFactory.class;
		case ProductEditPart.VISUAL_ID:
			return ProductViewFactory.class;
		case ProductElementNameEditPart.VISUAL_ID:
			return ProductElementNameViewFactory.class;
		case WrappingLabel80EditPart.VISUAL_ID:
			return WrappingLabel80ViewFactory.class;
		case MemoryCapacityEditPart.VISUAL_ID:
			return MemoryCapacityViewFactory.class;
		case MemoryCapacityElementNameEditPart.VISUAL_ID:
			return MemoryCapacityElementNameViewFactory.class;
		case WrappingLabel81EditPart.VISUAL_ID:
			return WrappingLabel81ViewFactory.class;
		case RoutingProtocolDomainEditPart.VISUAL_ID:
			return RoutingProtocolDomainViewFactory.class;
		case RoutingProtocolDomainElementNameEditPart.VISUAL_ID:
			return RoutingProtocolDomainElementNameViewFactory.class;
		case WrappingLabel82EditPart.VISUAL_ID:
			return WrappingLabel82ViewFactory.class;
		case AFServiceEditPart.VISUAL_ID:
			return AFServiceViewFactory.class;
		case AFServiceElementNameEditPart.VISUAL_ID:
			return AFServiceElementNameViewFactory.class;
		case WrappingLabel83EditPart.VISUAL_ID:
			return WrappingLabel83ViewFactory.class;
		case LANSegmentEditPart.VISUAL_ID:
			return LANSegmentViewFactory.class;
		case LANSegmentElementNameEditPart.VISUAL_ID:
			return LANSegmentElementNameViewFactory.class;
		case WrappingLabel84EditPart.VISUAL_ID:
			return WrappingLabel84ViewFactory.class;
		case NATStaticSettingsEditPart.VISUAL_ID:
			return NATStaticSettingsViewFactory.class;
		case NATStaticSettingsElementNameEditPart.VISUAL_ID:
			return NATStaticSettingsElementNameViewFactory.class;
		case WrappingLabel85EditPart.VISUAL_ID:
			return WrappingLabel85ViewFactory.class;
		case TelnetProtocolEndpointEditPart.VISUAL_ID:
			return TelnetProtocolEndpointViewFactory.class;
		case TelnetProtocolEndpointElementNameEditPart.VISUAL_ID:
			return TelnetProtocolEndpointElementNameViewFactory.class;
		case WrappingLabel86EditPart.VISUAL_ID:
			return WrappingLabel86ViewFactory.class;
		case LANEndpointEditPart.VISUAL_ID:
			return LANEndpointViewFactory.class;
		case LANEndpointElementNameEditPart.VISUAL_ID:
			return LANEndpointElementNameViewFactory.class;
		case WrappingLabel87EditPart.VISUAL_ID:
			return WrappingLabel87ViewFactory.class;
		case DropThresholdCalculationServiceEditPart.VISUAL_ID:
			return DropThresholdCalculationServiceViewFactory.class;
		case DropThresholdCalculationServiceElementNameEditPart.VISUAL_ID:
			return DropThresholdCalculationServiceElementNameViewFactory.class;
		case WrappingLabel88EditPart.VISUAL_ID:
			return WrappingLabel88ViewFactory.class;
		case AdminDomainEditPart.VISUAL_ID:
			return AdminDomainViewFactory.class;
		case AdminDomainElementNameEditPart.VISUAL_ID:
			return AdminDomainElementNameViewFactory.class;
		case WrappingLabel89EditPart.VISUAL_ID:
			return WrappingLabel89ViewFactory.class;
		case SystemSpecificCollectionEditPart.VISUAL_ID:
			return SystemSpecificCollectionViewFactory.class;
		case SystemSpecificCollectionElementNameEditPart.VISUAL_ID:
			return SystemSpecificCollectionElementNameViewFactory.class;
		case WrappingLabel90EditPart.VISUAL_ID:
			return WrappingLabel90ViewFactory.class;
		case NextHopRoutingEditPart.VISUAL_ID:
			return NextHopRoutingViewFactory.class;
		case NextHopRoutingElementNameEditPart.VISUAL_ID:
			return NextHopRoutingElementNameViewFactory.class;
		case WrappingLabel91EditPart.VISUAL_ID:
			return WrappingLabel91ViewFactory.class;
		case ComputerSystemEditPart.VISUAL_ID:
			return ComputerSystemViewFactory.class;
		case ComputerSystemElementNameEditPart.VISUAL_ID:
			return ComputerSystemElementNameViewFactory.class;
		case WrappingLabel92EditPart.VISUAL_ID:
			return WrappingLabel92ViewFactory.class;
		case NetworkPortEditPart.VISUAL_ID:
			return NetworkPortViewFactory.class;
		case NetworkPortElementNameEditPart.VISUAL_ID:
			return NetworkPortElementNameViewFactory.class;
		case WrappingLabel93EditPart.VISUAL_ID:
			return WrappingLabel93ViewFactory.class;
		case RemoteServiceAccessPointEditPart.VISUAL_ID:
			return RemoteServiceAccessPointViewFactory.class;
		case RemoteServiceAccessPointElementNameEditPart.VISUAL_ID:
			return RemoteServiceAccessPointElementNameViewFactory.class;
		case WrappingLabel94EditPart.VISUAL_ID:
			return WrappingLabel94ViewFactory.class;
		case WrappingLabel95EditPart.VISUAL_ID:
			return WrappingLabel95ViewFactory.class;
		case WrappingLabel96EditPart.VISUAL_ID:
			return WrappingLabel96ViewFactory.class;
		case WrappingLabel97EditPart.VISUAL_ID:
			return WrappingLabel97ViewFactory.class;
		case WrappingLabel98EditPart.VISUAL_ID:
			return WrappingLabel98ViewFactory.class;
		case WrappingLabel99EditPart.VISUAL_ID:
			return WrappingLabel99ViewFactory.class;
		case WrappingLabel100EditPart.VISUAL_ID:
			return WrappingLabel100ViewFactory.class;
		case WrappingLabel101EditPart.VISUAL_ID:
			return WrappingLabel101ViewFactory.class;
		case WrappingLabel102EditPart.VISUAL_ID:
			return WrappingLabel102ViewFactory.class;
		case WrappingLabel103EditPart.VISUAL_ID:
			return WrappingLabel103ViewFactory.class;
		case WrappingLabel104EditPart.VISUAL_ID:
			return WrappingLabel104ViewFactory.class;
		case WrappingLabel105EditPart.VISUAL_ID:
			return WrappingLabel105ViewFactory.class;
		case WrappingLabel106EditPart.VISUAL_ID:
			return WrappingLabel106ViewFactory.class;
		case WrappingLabel107EditPart.VISUAL_ID:
			return WrappingLabel107ViewFactory.class;
		case WrappingLabel108EditPart.VISUAL_ID:
			return WrappingLabel108ViewFactory.class;
		case WrappingLabel109EditPart.VISUAL_ID:
			return WrappingLabel109ViewFactory.class;
		case WrappingLabel110EditPart.VISUAL_ID:
			return WrappingLabel110ViewFactory.class;
		case WrappingLabel111EditPart.VISUAL_ID:
			return WrappingLabel111ViewFactory.class;
		case WrappingLabel112EditPart.VISUAL_ID:
			return WrappingLabel112ViewFactory.class;
		case WrappingLabel113EditPart.VISUAL_ID:
			return WrappingLabel113ViewFactory.class;
		case WrappingLabel114EditPart.VISUAL_ID:
			return WrappingLabel114ViewFactory.class;
		case WrappingLabel115EditPart.VISUAL_ID:
			return WrappingLabel115ViewFactory.class;
		case WrappingLabel116EditPart.VISUAL_ID:
			return WrappingLabel116ViewFactory.class;
		case WrappingLabel117EditPart.VISUAL_ID:
			return WrappingLabel117ViewFactory.class;
		case WrappingLabel118EditPart.VISUAL_ID:
			return WrappingLabel118ViewFactory.class;
		case WrappingLabel119EditPart.VISUAL_ID:
			return WrappingLabel119ViewFactory.class;
		case WrappingLabel120EditPart.VISUAL_ID:
			return WrappingLabel120ViewFactory.class;
		case WrappingLabel121EditPart.VISUAL_ID:
			return WrappingLabel121ViewFactory.class;
		case WrappingLabel122EditPart.VISUAL_ID:
			return WrappingLabel122ViewFactory.class;
		case WrappingLabel123EditPart.VISUAL_ID:
			return WrappingLabel123ViewFactory.class;
		case WrappingLabel124EditPart.VISUAL_ID:
			return WrappingLabel124ViewFactory.class;
		case WrappingLabel125EditPart.VISUAL_ID:
			return WrappingLabel125ViewFactory.class;
		case WrappingLabel126EditPart.VISUAL_ID:
			return WrappingLabel126ViewFactory.class;
		case WrappingLabel127EditPart.VISUAL_ID:
			return WrappingLabel127ViewFactory.class;
		case WrappingLabel128EditPart.VISUAL_ID:
			return WrappingLabel128ViewFactory.class;
		case WrappingLabel129EditPart.VISUAL_ID:
			return WrappingLabel129ViewFactory.class;
		case WrappingLabel130EditPart.VISUAL_ID:
			return WrappingLabel130ViewFactory.class;
		case WrappingLabel131EditPart.VISUAL_ID:
			return WrappingLabel131ViewFactory.class;
		case WrappingLabel132EditPart.VISUAL_ID:
			return WrappingLabel132ViewFactory.class;
		case WrappingLabel133EditPart.VISUAL_ID:
			return WrappingLabel133ViewFactory.class;
		case WrappingLabel134EditPart.VISUAL_ID:
			return WrappingLabel134ViewFactory.class;
		case WrappingLabel135EditPart.VISUAL_ID:
			return WrappingLabel135ViewFactory.class;
		case WrappingLabel136EditPart.VISUAL_ID:
			return WrappingLabel136ViewFactory.class;
		case WrappingLabel137EditPart.VISUAL_ID:
			return WrappingLabel137ViewFactory.class;
		case WrappingLabel138EditPart.VISUAL_ID:
			return WrappingLabel138ViewFactory.class;
		case WrappingLabel139EditPart.VISUAL_ID:
			return WrappingLabel139ViewFactory.class;
		case WrappingLabel140EditPart.VISUAL_ID:
			return WrappingLabel140ViewFactory.class;
		case WrappingLabel141EditPart.VISUAL_ID:
			return WrappingLabel141ViewFactory.class;
		case WrappingLabel142EditPart.VISUAL_ID:
			return WrappingLabel142ViewFactory.class;
		case WrappingLabel143EditPart.VISUAL_ID:
			return WrappingLabel143ViewFactory.class;
		case WrappingLabel144EditPart.VISUAL_ID:
			return WrappingLabel144ViewFactory.class;
		case WrappingLabel145EditPart.VISUAL_ID:
			return WrappingLabel145ViewFactory.class;
		case WrappingLabel146EditPart.VISUAL_ID:
			return WrappingLabel146ViewFactory.class;
		case WrappingLabel147EditPart.VISUAL_ID:
			return WrappingLabel147ViewFactory.class;
		case WrappingLabel148EditPart.VISUAL_ID:
			return WrappingLabel148ViewFactory.class;
		case WrappingLabel149EditPart.VISUAL_ID:
			return WrappingLabel149ViewFactory.class;
		case WrappingLabel150EditPart.VISUAL_ID:
			return WrappingLabel150ViewFactory.class;
		case WrappingLabel151EditPart.VISUAL_ID:
			return WrappingLabel151ViewFactory.class;
		case WrappingLabel152EditPart.VISUAL_ID:
			return WrappingLabel152ViewFactory.class;
		case WrappingLabel153EditPart.VISUAL_ID:
			return WrappingLabel153ViewFactory.class;
		case WrappingLabel154EditPart.VISUAL_ID:
			return WrappingLabel154ViewFactory.class;
		case WrappingLabel155EditPart.VISUAL_ID:
			return WrappingLabel155ViewFactory.class;
		case WrappingLabel156EditPart.VISUAL_ID:
			return WrappingLabel156ViewFactory.class;
		case WrappingLabel157EditPart.VISUAL_ID:
			return WrappingLabel157ViewFactory.class;
		case WrappingLabel158EditPart.VISUAL_ID:
			return WrappingLabel158ViewFactory.class;
		case WrappingLabel159EditPart.VISUAL_ID:
			return WrappingLabel159ViewFactory.class;
		case WrappingLabel160EditPart.VISUAL_ID:
			return WrappingLabel160ViewFactory.class;
		case WrappingLabel161EditPart.VISUAL_ID:
			return WrappingLabel161ViewFactory.class;
		case WrappingLabel162EditPart.VISUAL_ID:
			return WrappingLabel162ViewFactory.class;
		case WrappingLabel163EditPart.VISUAL_ID:
			return WrappingLabel163ViewFactory.class;
		case WrappingLabel164EditPart.VISUAL_ID:
			return WrappingLabel164ViewFactory.class;
		case WrappingLabel165EditPart.VISUAL_ID:
			return WrappingLabel165ViewFactory.class;
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Class getEdgeViewClass(IAdaptable semanticAdapter,
			View containerView, String semanticHint) {
		IElementType elementType = getSemanticElementType(semanticAdapter);
		if (!CIMLevelZeroElementTypes.isKnownElementType(elementType)
				|| (!(elementType instanceof IHintedType))) {
			return null; // foreign element type
		}
		String elementTypeHint = ((IHintedType) elementType).getSemanticHint();
		if (elementTypeHint == null) {
			return null; // our hint is visual id and must be specified
		}
		if (semanticHint != null && !semanticHint.equals(elementTypeHint)) {
			return null; // if semantic hint is specified it should be the same as in element type
		}
		int visualID = CIMLevelZeroVisualIDRegistry
				.getVisualID(elementTypeHint);
		EObject domainElement = getSemanticElement(semanticAdapter);
		if (domainElement != null
				&& visualID != CIMLevelZeroVisualIDRegistry
						.getLinkWithClassVisualID(domainElement)) {
			return null; // visual id for link EClass should match visual id from element type
		}
		return getEdgeViewClass(visualID);
	}

	/**
	 * @generated
	 */
	protected Class getEdgeViewClass(int visualID) {
		switch (visualID) {
		case DirectorySpecificationDirectorySpecificationFilesEditPart.VISUAL_ID:
			return DirectorySpecificationDirectorySpecificationFilesViewFactory.class;
		case OperatingSystemOperatingSystemSoftwareFeatureEditPart.VISUAL_ID:
			return OperatingSystemOperatingSystemSoftwareFeatureViewFactory.class;
		case SoftwareElementSoftwareElementActionsEditPart.VISUAL_ID:
			return SoftwareElementSoftwareElementActionsViewFactory.class;
		case SoftwareElementSoftwareElementChecksEditPart.VISUAL_ID:
			return SoftwareElementSoftwareElementChecksViewFactory.class;
		case InstalledProductSoftwareElementsEditPart.VISUAL_ID:
			return InstalledProductSoftwareElementsViewFactory.class;
		case BGPServiceBGPPeerGroupServicesEditPart.VISUAL_ID:
			return BGPServiceBGPPeerGroupServicesViewFactory.class;
		case BGPClusterReflectorClientServiceEditPart.VISUAL_ID:
			return BGPClusterReflectorClientServiceViewFactory.class;
		case BGPClusterReflectorNonClientServiceEditPart.VISUAL_ID:
			return BGPClusterReflectorNonClientServiceViewFactory.class;
		case BGPClusterReflectorServiceEditPart.VISUAL_ID:
			return BGPClusterReflectorServiceViewFactory.class;
		case ServiceAccessPointBindsToEditPart.VISUAL_ID:
			return ServiceAccessPointBindsToViewFactory.class;
		case ManagedElementComponentsEditPart.VISUAL_ID:
			return ManagedElementComponentsViewFactory.class;
		case AdminDomainContainedDomainEditPart.VISUAL_ID:
			return AdminDomainContainedDomainViewFactory.class;
		case ManagedElementDependenciesEditPart.VISUAL_ID:
			return ManagedElementDependenciesViewFactory.class;
		case LogicalDeviceDeviceConnectionEditPart.VISUAL_ID:
			return LogicalDeviceDeviceConnectionViewFactory.class;
		case LogicalDeviceDeviceIdentityEditPart.VISUAL_ID:
			return LogicalDeviceDeviceIdentityViewFactory.class;
		case LogicalDeviceDeviceSAPImplementationEditPart.VISUAL_ID:
			return LogicalDeviceDeviceSAPImplementationViewFactory.class;
		case ManagedElementElementCapabilitiesEditPart.VISUAL_ID:
			return ManagedElementElementCapabilitiesViewFactory.class;
		case ManagedElementElementSettingDataEditPart.VISUAL_ID:
			return ManagedElementElementSettingDataViewFactory.class;
		case SoftwareIdentityElementSoftwareIdentityEditPart.VISUAL_ID:
			return SoftwareIdentityElementSoftwareIdentityViewFactory.class;
		case SystemHostedAccessPointEditPart.VISUAL_ID:
			return SystemHostedAccessPointViewFactory.class;
		case SystemHostedCollectionEditPart.VISUAL_ID:
			return SystemHostedCollectionViewFactory.class;
		case ManagedElementHostedDependencyEditPart.VISUAL_ID:
			return ManagedElementHostedDependencyViewFactory.class;
		case SystemHostedServicesEditPart.VISUAL_ID:
			return SystemHostedServicesViewFactory.class;
		case ElementSoftwareIdentityManagedElementEditPart.VISUAL_ID:
			return ElementSoftwareIdentityManagedElementViewFactory.class;
		case ProductProductProductDependencyEditPart.VISUAL_ID:
			return ProductProductProductDependencyViewFactory.class;
		case ProductProductServiceComponentEditPart.VISUAL_ID:
			return ProductProductServiceComponentViewFactory.class;
		case EnabledLogicalElementRemoteAccessAvailableToElementEditPart.VISUAL_ID:
			return EnabledLogicalElementRemoteAccessAvailableToElementViewFactory.class;
		case SystemRolesEditPart.VISUAL_ID:
			return SystemRolesViewFactory.class;
		case ServiceAccessPointSAPSAPDependencyEditPart.VISUAL_ID:
			return ServiceAccessPointSAPSAPDependencyViewFactory.class;
		case ServiceServiceAccessBySAPEditPart.VISUAL_ID:
			return ServiceServiceAccessBySAPViewFactory.class;
		case ServiceServiceComponentsEditPart.VISUAL_ID:
			return ServiceServiceComponentsViewFactory.class;
		case ServiceServiceServiceDependencyEditPart.VISUAL_ID:
			return ServiceServiceServiceDependencyViewFactory.class;
		case ElementSettingDataSettingDataEditPart.VISUAL_ID:
			return ElementSettingDataSettingDataViewFactory.class;
		case SettingDataSettingsDefineCapabilitiesEditPart.VISUAL_ID:
			return SettingDataSettingsDefineCapabilitiesViewFactory.class;
		case ManagedSystemElementStatusDescriptionsEditPart.VISUAL_ID:
			return ManagedSystemElementStatusDescriptionsViewFactory.class;
		case SystemSystemComponentsEditPart.VISUAL_ID:
			return SystemSystemComponentsViewFactory.class;
		case SystemSystemDevicesEditPart.VISUAL_ID:
			return SystemSystemDevicesViewFactory.class;
		case LogicalModuleModulePortEditPart.VISUAL_ID:
			return LogicalModuleModulePortViewFactory.class;
		case AFServiceAFRelatedServicesEditPart.VISUAL_ID:
			return AFServiceAFRelatedServicesViewFactory.class;
		case QoSServiceQoSConditioningSubServiceEditPart.VISUAL_ID:
			return QoSServiceQoSConditioningSubServiceViewFactory.class;
		case QoSServiceQoSSubServiceEditPart.VISUAL_ID:
			return QoSServiceQoSSubServiceViewFactory.class;
		case CollectionMembersEditPart.VISUAL_ID:
			return CollectionMembersViewFactory.class;
		case NATListBasedSettingsAddressesToBeTranslatedEditPart.VISUAL_ID:
			return NATListBasedSettingsAddressesToBeTranslatedViewFactory.class;
		case BGPServiceBGPAdminDistanceEditPart.VISUAL_ID:
			return BGPServiceBGPAdminDistanceViewFactory.class;
		case ServiceAccessPointBindsToLANEndpointEditPart.VISUAL_ID:
			return ServiceAccessPointBindsToLANEndpointViewFactory.class;
		case RouteCalculationServiceCalculatesAmongEditPart.VISUAL_ID:
			return RouteCalculationServiceCalculatesAmongViewFactory.class;
		case ProtocolEndpointEgressConditioningServiceOnEndpointEditPart.VISUAL_ID:
			return ProtocolEndpointEgressConditioningServiceOnEndpointViewFactory.class;
		case CIM_ModelElementsEditPart.VISUAL_ID:
			return CIM_ModelElementsViewFactory.class;
		case ForwardingServiceForwardedRoutesEditPart.VISUAL_ID:
			return ForwardingServiceForwardedRoutesViewFactory.class;
		case ForwardingServiceForwardsAmongEditPart.VISUAL_ID:
			return ForwardingServiceForwardsAmongViewFactory.class;
		case ComputerSystemHostedFilterListEditPart.VISUAL_ID:
			return ComputerSystemHostedFilterListViewFactory.class;
		case ComputerSystemHostedForwardingServicesEditPart.VISUAL_ID:
			return ComputerSystemHostedForwardingServicesViewFactory.class;
		case SystemHostedRouteEditPart.VISUAL_ID:
			return SystemHostedRouteViewFactory.class;
		case ComputerSystemHostedRoutingPolicyEditPart.VISUAL_ID:
			return ComputerSystemHostedRoutingPolicyViewFactory.class;
		case ProtocolEndpointIngressConditioningServiceOnEndpointEditPart.VISUAL_ID:
			return ProtocolEndpointIngressConditioningServiceOnEndpointViewFactory.class;
		case LogicalNetworkInLogicalNetworkEditPart.VISUAL_ID:
			return LogicalNetworkInLogicalNetworkViewFactory.class;
		case LANSegmentInSegmentEditPart.VISUAL_ID:
			return LANSegmentInSegmentViewFactory.class;
		case NATServiceNATServiceRunningOnEndpointEditPart.VISUAL_ID:
			return NATServiceNATServiceRunningOnEndpointViewFactory.class;
		case AdminDomainNetworksInAdminDomainEditPart.VISUAL_ID:
			return AdminDomainNetworksInAdminDomainViewFactory.class;
		case LogicalPortPortImplementsEndPointEditPart.VISUAL_ID:
			return LogicalPortPortImplementsEndPointViewFactory.class;
		case LogicalDevicePortOnDeviceEditPart.VISUAL_ID:
			return LogicalDevicePortOnDeviceViewFactory.class;
		case ForwardingServiceRouteForwardedByServiceEditPart.VISUAL_ID:
			return ForwardingServiceRouteForwardedByServiceViewFactory.class;
		case AutonomousSystemRouterInASEditPart.VISUAL_ID:
			return AutonomousSystemRouterInASViewFactory.class;
		case BGPClusterRoutersInBGPClusterEditPart.VISUAL_ID:
			return BGPClusterRoutersInBGPClusterViewFactory.class;
		case NextHopRouteRouteUsesEndpointEditPart.VISUAL_ID:
			return NextHopRouteRouteUsesEndpointViewFactory.class;
		case AutonomousSystemRoutingProtocolDomainInASEditPart.VISUAL_ID:
			return AutonomousSystemRoutingProtocolDomainInASViewFactory.class;
		case ComputerSystemRunningOSEditPart.VISUAL_ID:
			return ComputerSystemRunningOSViewFactory.class;
		case ServiceSoftwareFeatureServiceImplementationEditPart.VISUAL_ID:
			return ServiceSoftwareFeatureServiceImplementationViewFactory.class;
		case NATListBasedSettingsTranslationPoolForNATEditPart.VISUAL_ID:
			return NATListBasedSettingsTranslationPoolForNATViewFactory.class;
		case SNMPServiceTrapSourceForSNMPServiceEditPart.VISUAL_ID:
			return SNMPServiceTrapSourceForSNMPServiceViewFactory.class;
		case NextHopRouteAssociatedNextHopEditPart.VISUAL_ID:
			return NextHopRouteAssociatedNextHopViewFactory.class;
		}
		return null;
	}

	/**
	 * @generated
	 */
	private IElementType getSemanticElementType(IAdaptable semanticAdapter) {
		if (semanticAdapter == null) {
			return null;
		}
		return (IElementType) semanticAdapter.getAdapter(IElementType.class);
	}
}
