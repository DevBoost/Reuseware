package es.tid.cim.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;

import es.tid.cim.*;
import es.tid.cim.System;
import es.tid.cim.diagram.edit.parts.*;
import es.tid.cim.diagram.providers.CIMLevelZeroElementTypes;


/**
 * @generated
 */
public class CIMLevelZeroDiagramUpdater {

	/**
	 * @generated
	 */
	public static List getSemanticChildren(View view) {
		switch (CIMLevelZeroVisualIDRegistry.getVisualID(view)) {
		case CIM_ModelEditPart.VISUAL_ID:
			return getCIM_Model_1000SemanticChildren(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCIM_Model_1000SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		CIM_Model modelElement = (CIM_Model) view.getElement();
		List result = new LinkedList();
		Resource resource = modelElement.eResource();
		for (Iterator semanticIterator = getPhantomNodesIterator(resource); semanticIterator
				.hasNext();) {
			EObject childElement = (EObject) semanticIterator.next();
			if (childElement == modelElement) {
				continue;
			}
			if (CIMLevelZeroVisualIDRegistry
					.getNodeVisualID(view, childElement) == USBDeviceEditPart.VISUAL_ID) {
				result.add(new CIMLevelZeroNodeDescriptor(childElement,
						USBDeviceEditPart.VISUAL_ID));
				continue;
			}
			if (CIMLevelZeroVisualIDRegistry
					.getNodeVisualID(view, childElement) == OSPFVirtualInterfaceEditPart.VISUAL_ID) {
				result.add(new CIMLevelZeroNodeDescriptor(childElement,
						OSPFVirtualInterfaceEditPart.VISUAL_ID));
				continue;
			}
			if (CIMLevelZeroVisualIDRegistry
					.getNodeVisualID(view, childElement) == WiFiPortEditPart.VISUAL_ID) {
				result.add(new CIMLevelZeroNodeDescriptor(childElement,
						WiFiPortEditPart.VISUAL_ID));
				continue;
			}
			if (CIMLevelZeroVisualIDRegistry
					.getNodeVisualID(view, childElement) == ProtocolServiceEditPart.VISUAL_ID) {
				result.add(new CIMLevelZeroNodeDescriptor(childElement,
						ProtocolServiceEditPart.VISUAL_ID));
				continue;
			}
			if (CIMLevelZeroVisualIDRegistry
					.getNodeVisualID(view, childElement) == RoutingPolicyEditPart.VISUAL_ID) {
				result.add(new CIMLevelZeroNodeDescriptor(childElement,
						RoutingPolicyEditPart.VISUAL_ID));
				continue;
			}
			if (CIMLevelZeroVisualIDRegistry
					.getNodeVisualID(view, childElement) == EnabledLogicalElementCapabilitiesEditPart.VISUAL_ID) {
				result.add(new CIMLevelZeroNodeDescriptor(childElement,
						EnabledLogicalElementCapabilitiesEditPart.VISUAL_ID));
				continue;
			}
			if (CIMLevelZeroVisualIDRegistry
					.getNodeVisualID(view, childElement) == BufferPoolEditPart.VISUAL_ID) {
				result.add(new CIMLevelZeroNodeDescriptor(childElement,
						BufferPoolEditPart.VISUAL_ID));
				continue;
			}
			if (CIMLevelZeroVisualIDRegistry
					.getNodeVisualID(view, childElement) == MPLSProtocolEndpointEditPart.VISUAL_ID) {
				result.add(new CIMLevelZeroNodeDescriptor(childElement,
						MPLSProtocolEndpointEditPart.VISUAL_ID));
				continue;
			}
			if (CIMLevelZeroVisualIDRegistry
					.getNodeVisualID(view, childElement) == AutonomousSystemEditPart.VISUAL_ID) {
				result.add(new CIMLevelZeroNodeDescriptor(childElement,
						AutonomousSystemEditPart.VISUAL_ID));
				continue;
			}
			if (CIMLevelZeroVisualIDRegistry
					.getNodeVisualID(view, childElement) == DNSSettingDataEditPart.VISUAL_ID) {
				result.add(new CIMLevelZeroNodeDescriptor(childElement,
						DNSSettingDataEditPart.VISUAL_ID));
				continue;
			}
			if (CIMLevelZeroVisualIDRegistry
					.getNodeVisualID(view, childElement) == UniModemEditPart.VISUAL_ID) {
				result.add(new CIMLevelZeroNodeDescriptor(childElement,
						UniModemEditPart.VISUAL_ID));
				continue;
			}
			if (CIMLevelZeroVisualIDRegistry
					.getNodeVisualID(view, childElement) == EFServiceEditPart.VISUAL_ID) {
				result.add(new CIMLevelZeroNodeDescriptor(childElement,
						EFServiceEditPart.VISUAL_ID));
				continue;
			}
			if (CIMLevelZeroVisualIDRegistry
					.getNodeVisualID(view, childElement) == IPSubnetEditPart.VISUAL_ID) {
				result.add(new CIMLevelZeroNodeDescriptor(childElement,
						IPSubnetEditPart.VISUAL_ID));
				continue;
			}
			if (CIMLevelZeroVisualIDRegistry
					.getNodeVisualID(view, childElement) == NamedAddressCollectionEditPart.VISUAL_ID) {
				result.add(new CIMLevelZeroNodeDescriptor(childElement,
						NamedAddressCollectionEditPart.VISUAL_ID));
				continue;
			}
			if (CIMLevelZeroVisualIDRegistry
					.getNodeVisualID(view, childElement) == BIOSElementEditPart.VISUAL_ID) {
				result.add(new CIMLevelZeroNodeDescriptor(childElement,
						BIOSElementEditPart.VISUAL_ID));
				continue;
			}
			if (CIMLevelZeroVisualIDRegistry
					.getNodeVisualID(view, childElement) == TelnetSettingDataEditPart.VISUAL_ID) {
				result.add(new CIMLevelZeroNodeDescriptor(childElement,
						TelnetSettingDataEditPart.VISUAL_ID));
				continue;
			}
			if (CIMLevelZeroVisualIDRegistry
					.getNodeVisualID(view, childElement) == BGPPeerGroupEditPart.VISUAL_ID) {
				result.add(new CIMLevelZeroNodeDescriptor(childElement,
						BGPPeerGroupEditPart.VISUAL_ID));
				continue;
			}
			if (CIMLevelZeroVisualIDRegistry
					.getNodeVisualID(view, childElement) == LANConnectivitySegmentEditPart.VISUAL_ID) {
				result.add(new CIMLevelZeroNodeDescriptor(childElement,
						LANConnectivitySegmentEditPart.VISUAL_ID));
				continue;
			}
			if (CIMLevelZeroVisualIDRegistry
					.getNodeVisualID(view, childElement) == CableModemEditPart.VISUAL_ID) {
				result.add(new CIMLevelZeroNodeDescriptor(childElement,
						CableModemEditPart.VISUAL_ID));
				continue;
			}
			if (CIMLevelZeroVisualIDRegistry
					.getNodeVisualID(view, childElement) == SwitchPortEditPart.VISUAL_ID) {
				result.add(new CIMLevelZeroNodeDescriptor(childElement,
						SwitchPortEditPart.VISUAL_ID));
				continue;
			}
			if (CIMLevelZeroVisualIDRegistry
					.getNodeVisualID(view, childElement) == TCPProtocolEndpointEditPart.VISUAL_ID) {
				result.add(new CIMLevelZeroNodeDescriptor(childElement,
						TCPProtocolEndpointEditPart.VISUAL_ID));
				continue;
			}
			if (CIMLevelZeroVisualIDRegistry
					.getNodeVisualID(view, childElement) == AdministrativeDistanceEditPart.VISUAL_ID) {
				result.add(new CIMLevelZeroNodeDescriptor(childElement,
						AdministrativeDistanceEditPart.VISUAL_ID));
				continue;
			}
			if (CIMLevelZeroVisualIDRegistry
					.getNodeVisualID(view, childElement) == IPConnectivitySubnetEditPart.VISUAL_ID) {
				result.add(new CIMLevelZeroNodeDescriptor(childElement,
						IPConnectivitySubnetEditPart.VISUAL_ID));
				continue;
			}
			if (CIMLevelZeroVisualIDRegistry
					.getNodeVisualID(view, childElement) == VolatileStorageEditPart.VISUAL_ID) {
				result.add(new CIMLevelZeroNodeDescriptor(childElement,
						VolatileStorageEditPart.VISUAL_ID));
				continue;
			}
			if (CIMLevelZeroVisualIDRegistry
					.getNodeVisualID(view, childElement) == RangeOfIPAddressesEditPart.VISUAL_ID) {
				result.add(new CIMLevelZeroNodeDescriptor(childElement,
						RangeOfIPAddressesEditPart.VISUAL_ID));
				continue;
			}
			if (CIMLevelZeroVisualIDRegistry
					.getNodeVisualID(view, childElement) == BGPProtocolEndpointEditPart.VISUAL_ID) {
				result.add(new CIMLevelZeroNodeDescriptor(childElement,
						BGPProtocolEndpointEditPart.VISUAL_ID));
				continue;
			}
			if (CIMLevelZeroVisualIDRegistry
					.getNodeVisualID(view, childElement) == UnitaryComputerSystemEditPart.VISUAL_ID) {
				result.add(new CIMLevelZeroNodeDescriptor(childElement,
						UnitaryComputerSystemEditPart.VISUAL_ID));
				continue;
			}
			if (CIMLevelZeroVisualIDRegistry
					.getNodeVisualID(view, childElement) == EthernetPortEditPart.VISUAL_ID) {
				result.add(new CIMLevelZeroNodeDescriptor(childElement,
						EthernetPortEditPart.VISUAL_ID));
				continue;
			}
			if (CIMLevelZeroVisualIDRegistry
					.getNodeVisualID(view, childElement) == SNMPServiceEditPart.VISUAL_ID) {
				result.add(new CIMLevelZeroNodeDescriptor(childElement,
						SNMPServiceEditPart.VISUAL_ID));
				continue;
			}
			if (CIMLevelZeroVisualIDRegistry
					.getNodeVisualID(view, childElement) == LogicalModuleEditPart.VISUAL_ID) {
				result.add(new CIMLevelZeroNodeDescriptor(childElement,
						LogicalModuleEditPart.VISUAL_ID));
				continue;
			}
			if (CIMLevelZeroVisualIDRegistry
					.getNodeVisualID(view, childElement) == NextHopIPRouteEditPart.VISUAL_ID) {
				result.add(new CIMLevelZeroNodeDescriptor(childElement,
						NextHopIPRouteEditPart.VISUAL_ID));
				continue;
			}
			if (CIMLevelZeroVisualIDRegistry
					.getNodeVisualID(view, childElement) == OperatingSystemEditPart.VISUAL_ID) {
				result.add(new CIMLevelZeroNodeDescriptor(childElement,
						OperatingSystemEditPart.VISUAL_ID));
				continue;
			}
			if (CIMLevelZeroVisualIDRegistry
					.getNodeVisualID(view, childElement) == SDSLModemEditPart.VISUAL_ID) {
				result.add(new CIMLevelZeroNodeDescriptor(childElement,
						SDSLModemEditPart.VISUAL_ID));
				continue;
			}
			if (CIMLevelZeroVisualIDRegistry
					.getNodeVisualID(view, childElement) == WiFiEndPointEditPart.VISUAL_ID) {
				result.add(new CIMLevelZeroNodeDescriptor(childElement,
						WiFiEndPointEditPart.VISUAL_ID));
				continue;
			}
			if (CIMLevelZeroVisualIDRegistry
					.getNodeVisualID(view, childElement) == NATServiceEditPart.VISUAL_ID) {
				result.add(new CIMLevelZeroNodeDescriptor(childElement,
						NATServiceEditPart.VISUAL_ID));
				continue;
			}
			if (CIMLevelZeroVisualIDRegistry
					.getNodeVisualID(view, childElement) == ADSLModemEditPart.VISUAL_ID) {
				result.add(new CIMLevelZeroNodeDescriptor(childElement,
						ADSLModemEditPart.VISUAL_ID));
				continue;
			}
			if (CIMLevelZeroVisualIDRegistry
					.getNodeVisualID(view, childElement) == LogicalFileEditPart.VISUAL_ID) {
				result.add(new CIMLevelZeroNodeDescriptor(childElement,
						LogicalFileEditPart.VISUAL_ID));
				continue;
			}
			if (CIMLevelZeroVisualIDRegistry
					.getNodeVisualID(view, childElement) == BGPClusterEditPart.VISUAL_ID) {
				result.add(new CIMLevelZeroNodeDescriptor(childElement,
						BGPClusterEditPart.VISUAL_ID));
				continue;
			}
			if (CIMLevelZeroVisualIDRegistry
					.getNodeVisualID(view, childElement) == ApplicationSystemEditPart.VISUAL_ID) {
				result.add(new CIMLevelZeroNodeDescriptor(childElement,
						ApplicationSystemEditPart.VISUAL_ID));
				continue;
			}
			if (CIMLevelZeroVisualIDRegistry
					.getNodeVisualID(view, childElement) == SoftwareIdentityEditPart.VISUAL_ID) {
				result.add(new CIMLevelZeroNodeDescriptor(childElement,
						SoftwareIdentityEditPart.VISUAL_ID));
				continue;
			}
			if (CIMLevelZeroVisualIDRegistry
					.getNodeVisualID(view, childElement) == WirelessPortEditPart.VISUAL_ID) {
				result.add(new CIMLevelZeroNodeDescriptor(childElement,
						WirelessPortEditPart.VISUAL_ID));
				continue;
			}
			if (CIMLevelZeroVisualIDRegistry
					.getNodeVisualID(view, childElement) == CLPSettingDataEditPart.VISUAL_ID) {
				result.add(new CIMLevelZeroNodeDescriptor(childElement,
						CLPSettingDataEditPart.VISUAL_ID));
				continue;
			}
			if (CIMLevelZeroVisualIDRegistry
					.getNodeVisualID(view, childElement) == GenericServiceEditPart.VISUAL_ID) {
				result.add(new CIMLevelZeroNodeDescriptor(childElement,
						GenericServiceEditPart.VISUAL_ID));
				continue;
			}
			if (CIMLevelZeroVisualIDRegistry
					.getNodeVisualID(view, childElement) == NATListBasedSettingsEditPart.VISUAL_ID) {
				result.add(new CIMLevelZeroNodeDescriptor(childElement,
						NATListBasedSettingsEditPart.VISUAL_ID));
				continue;
			}
			if (CIMLevelZeroVisualIDRegistry
					.getNodeVisualID(view, childElement) == VDSLModemEditPart.VISUAL_ID) {
				result.add(new CIMLevelZeroNodeDescriptor(childElement,
						VDSLModemEditPart.VISUAL_ID));
				continue;
			}
			if (CIMLevelZeroVisualIDRegistry
					.getNodeVisualID(view, childElement) == USBPortEditPart.VISUAL_ID) {
				result.add(new CIMLevelZeroNodeDescriptor(childElement,
						USBPortEditPart.VISUAL_ID));
				continue;
			}
			if (CIMLevelZeroVisualIDRegistry
					.getNodeVisualID(view, childElement) == DNSProtocolEndpointEditPart.VISUAL_ID) {
				result.add(new CIMLevelZeroNodeDescriptor(childElement,
						DNSProtocolEndpointEditPart.VISUAL_ID));
				continue;
			}
			if (CIMLevelZeroVisualIDRegistry
					.getNodeVisualID(view, childElement) == WiFiEndpointSettingsEditPart.VISUAL_ID) {
				result.add(new CIMLevelZeroNodeDescriptor(childElement,
						WiFiEndpointSettingsEditPart.VISUAL_ID));
				continue;
			}
			if (CIMLevelZeroVisualIDRegistry
					.getNodeVisualID(view, childElement) == SSHSettingDataEditPart.VISUAL_ID) {
				result.add(new CIMLevelZeroNodeDescriptor(childElement,
						SSHSettingDataEditPart.VISUAL_ID));
				continue;
			}
			if (CIMLevelZeroVisualIDRegistry
					.getNodeVisualID(view, childElement) == WirelessLANEndpointEditPart.VISUAL_ID) {
				result.add(new CIMLevelZeroNodeDescriptor(childElement,
						WirelessLANEndpointEditPart.VISUAL_ID));
				continue;
			}
			if (CIMLevelZeroVisualIDRegistry
					.getNodeVisualID(view, childElement) == DHCPProtocolEndpointEditPart.VISUAL_ID) {
				result.add(new CIMLevelZeroNodeDescriptor(childElement,
						DHCPProtocolEndpointEditPart.VISUAL_ID));
				continue;
			}
			if (CIMLevelZeroVisualIDRegistry
					.getNodeVisualID(view, childElement) == IPHeadersFilterEditPart.VISUAL_ID) {
				result.add(new CIMLevelZeroNodeDescriptor(childElement,
						IPHeadersFilterEditPart.VISUAL_ID));
				continue;
			}
			if (CIMLevelZeroVisualIDRegistry
					.getNodeVisualID(view, childElement) == DirectoryEditPart.VISUAL_ID) {
				result.add(new CIMLevelZeroNodeDescriptor(childElement,
						DirectoryEditPart.VISUAL_ID));
				continue;
			}
			if (CIMLevelZeroVisualIDRegistry
					.getNodeVisualID(view, childElement) == IPAddressRangeEditPart.VISUAL_ID) {
				result.add(new CIMLevelZeroNodeDescriptor(childElement,
						IPAddressRangeEditPart.VISUAL_ID));
				continue;
			}
			if (CIMLevelZeroVisualIDRegistry
					.getNodeVisualID(view, childElement) == SNMPTrapTargetEditPart.VISUAL_ID) {
				result.add(new CIMLevelZeroNodeDescriptor(childElement,
						SNMPTrapTargetEditPart.VISUAL_ID));
				continue;
			}
			if (CIMLevelZeroVisualIDRegistry
					.getNodeVisualID(view, childElement) == IPXConnectivityNetworkEditPart.VISUAL_ID) {
				result.add(new CIMLevelZeroNodeDescriptor(childElement,
						IPXConnectivityNetworkEditPart.VISUAL_ID));
				continue;
			}
			if (CIMLevelZeroVisualIDRegistry
					.getNodeVisualID(view, childElement) == ConnectivityMemberhipSettingDataEditPart.VISUAL_ID) {
				result.add(new CIMLevelZeroNodeDescriptor(childElement,
						ConnectivityMemberhipSettingDataEditPart.VISUAL_ID));
				continue;
			}
			if (CIMLevelZeroVisualIDRegistry
					.getNodeVisualID(view, childElement) == ConditioningServiceEditPart.VISUAL_ID) {
				result.add(new CIMLevelZeroNodeDescriptor(childElement,
						ConditioningServiceEditPart.VISUAL_ID));
				continue;
			}
			if (CIMLevelZeroVisualIDRegistry
					.getNodeVisualID(view, childElement) == BIOSFeatureEditPart.VISUAL_ID) {
				result.add(new CIMLevelZeroNodeDescriptor(childElement,
						BIOSFeatureEditPart.VISUAL_ID));
				continue;
			}
			if (CIMLevelZeroVisualIDRegistry
					.getNodeVisualID(view, childElement) == OSPFProtocolEndpointEditPart.VISUAL_ID) {
				result.add(new CIMLevelZeroNodeDescriptor(childElement,
						OSPFProtocolEndpointEditPart.VISUAL_ID));
				continue;
			}
			if (CIMLevelZeroVisualIDRegistry
					.getNodeVisualID(view, childElement) == FilterListEditPart.VISUAL_ID) {
				result.add(new CIMLevelZeroNodeDescriptor(childElement,
						FilterListEditPart.VISUAL_ID));
				continue;
			}
			if (CIMLevelZeroVisualIDRegistry
					.getNodeVisualID(view, childElement) == BGPServiceEditPart.VISUAL_ID) {
				result.add(new CIMLevelZeroNodeDescriptor(childElement,
						BGPServiceEditPart.VISUAL_ID));
				continue;
			}
			if (CIMLevelZeroVisualIDRegistry
					.getNodeVisualID(view, childElement) == PrecedenceServiceEditPart.VISUAL_ID) {
				result.add(new CIMLevelZeroNodeDescriptor(childElement,
						PrecedenceServiceEditPart.VISUAL_ID));
				continue;
			}
			if (CIMLevelZeroVisualIDRegistry
					.getNodeVisualID(view, childElement) == DHCPCapabilitiesEditPart.VISUAL_ID) {
				result.add(new CIMLevelZeroNodeDescriptor(childElement,
						DHCPCapabilitiesEditPart.VISUAL_ID));
				continue;
			}
			if (CIMLevelZeroVisualIDRegistry
					.getNodeVisualID(view, childElement) == Hdr8021PServiceEditPart.VISUAL_ID) {
				result.add(new CIMLevelZeroNodeDescriptor(childElement,
						Hdr8021PServiceEditPart.VISUAL_ID));
				continue;
			}
			if (CIMLevelZeroVisualIDRegistry
					.getNodeVisualID(view, childElement) == ReplacementSetEditPart.VISUAL_ID) {
				result.add(new CIMLevelZeroNodeDescriptor(childElement,
						ReplacementSetEditPart.VISUAL_ID));
				continue;
			}
			if (CIMLevelZeroVisualIDRegistry
					.getNodeVisualID(view, childElement) == HDSLModemEditPart.VISUAL_ID) {
				result.add(new CIMLevelZeroNodeDescriptor(childElement,
						HDSLModemEditPart.VISUAL_ID));
				continue;
			}
			if (CIMLevelZeroVisualIDRegistry
					.getNodeVisualID(view, childElement) == ServiceAccessURIEditPart.VISUAL_ID) {
				result.add(new CIMLevelZeroNodeDescriptor(childElement,
						ServiceAccessURIEditPart.VISUAL_ID));
				continue;
			}
			if (CIMLevelZeroVisualIDRegistry
					.getNodeVisualID(view, childElement) == FilterEntryEditPart.VISUAL_ID) {
				result.add(new CIMLevelZeroNodeDescriptor(childElement,
						FilterEntryEditPart.VISUAL_ID));
				continue;
			}
			if (CIMLevelZeroVisualIDRegistry
					.getNodeVisualID(view, childElement) == SNMPCommunityStringsEditPart.VISUAL_ID) {
				result.add(new CIMLevelZeroNodeDescriptor(childElement,
						SNMPCommunityStringsEditPart.VISUAL_ID));
				continue;
			}
			if (CIMLevelZeroVisualIDRegistry
					.getNodeVisualID(view, childElement) == NetworkEditPart.VISUAL_ID) {
				result.add(new CIMLevelZeroNodeDescriptor(childElement,
						NetworkEditPart.VISUAL_ID));
				continue;
			}
			if (CIMLevelZeroVisualIDRegistry
					.getNodeVisualID(view, childElement) == FileSpecificationEditPart.VISUAL_ID) {
				result.add(new CIMLevelZeroNodeDescriptor(childElement,
						FileSpecificationEditPart.VISUAL_ID));
				continue;
			}
			if (CIMLevelZeroVisualIDRegistry
					.getNodeVisualID(view, childElement) == IPXNetworkEditPart.VISUAL_ID) {
				result.add(new CIMLevelZeroNodeDescriptor(childElement,
						IPXNetworkEditPart.VISUAL_ID));
				continue;
			}
			if (CIMLevelZeroVisualIDRegistry
					.getNodeVisualID(view, childElement) == PowerManagementCapabilitiesEditPart.VISUAL_ID) {
				result.add(new CIMLevelZeroNodeDescriptor(childElement,
						PowerManagementCapabilitiesEditPart.VISUAL_ID));
				continue;
			}
			if (CIMLevelZeroVisualIDRegistry
					.getNodeVisualID(view, childElement) == FlowServiceEditPart.VISUAL_ID) {
				result.add(new CIMLevelZeroNodeDescriptor(childElement,
						FlowServiceEditPart.VISUAL_ID));
				continue;
			}
			if (CIMLevelZeroVisualIDRegistry
					.getNodeVisualID(view, childElement) == ISDNModemEditPart.VISUAL_ID) {
				result.add(new CIMLevelZeroNodeDescriptor(childElement,
						ISDNModemEditPart.VISUAL_ID));
				continue;
			}
			if (CIMLevelZeroVisualIDRegistry
					.getNodeVisualID(view, childElement) == IPXProtocolEndpointEditPart.VISUAL_ID) {
				result.add(new CIMLevelZeroNodeDescriptor(childElement,
						IPXProtocolEndpointEditPart.VISUAL_ID));
				continue;
			}
			if (CIMLevelZeroVisualIDRegistry
					.getNodeVisualID(view, childElement) == IPProtocolEndpointEditPart.VISUAL_ID) {
				result.add(new CIMLevelZeroNodeDescriptor(childElement,
						IPProtocolEndpointEditPart.VISUAL_ID));
				continue;
			}
			if (CIMLevelZeroVisualIDRegistry
					.getNodeVisualID(view, childElement) == UDPProtocolEndpointEditPart.VISUAL_ID) {
				result.add(new CIMLevelZeroNodeDescriptor(childElement,
						UDPProtocolEndpointEditPart.VISUAL_ID));
				continue;
			}
			if (CIMLevelZeroVisualIDRegistry
					.getNodeVisualID(view, childElement) == ProductEditPart.VISUAL_ID) {
				result.add(new CIMLevelZeroNodeDescriptor(childElement,
						ProductEditPart.VISUAL_ID));
				continue;
			}
			if (CIMLevelZeroVisualIDRegistry
					.getNodeVisualID(view, childElement) == MemoryCapacityEditPart.VISUAL_ID) {
				result.add(new CIMLevelZeroNodeDescriptor(childElement,
						MemoryCapacityEditPart.VISUAL_ID));
				continue;
			}
			if (CIMLevelZeroVisualIDRegistry
					.getNodeVisualID(view, childElement) == RoutingProtocolDomainEditPart.VISUAL_ID) {
				result.add(new CIMLevelZeroNodeDescriptor(childElement,
						RoutingProtocolDomainEditPart.VISUAL_ID));
				continue;
			}
			if (CIMLevelZeroVisualIDRegistry
					.getNodeVisualID(view, childElement) == AFServiceEditPart.VISUAL_ID) {
				result.add(new CIMLevelZeroNodeDescriptor(childElement,
						AFServiceEditPart.VISUAL_ID));
				continue;
			}
			if (CIMLevelZeroVisualIDRegistry
					.getNodeVisualID(view, childElement) == LANSegmentEditPart.VISUAL_ID) {
				result.add(new CIMLevelZeroNodeDescriptor(childElement,
						LANSegmentEditPart.VISUAL_ID));
				continue;
			}
			if (CIMLevelZeroVisualIDRegistry
					.getNodeVisualID(view, childElement) == NATStaticSettingsEditPart.VISUAL_ID) {
				result.add(new CIMLevelZeroNodeDescriptor(childElement,
						NATStaticSettingsEditPart.VISUAL_ID));
				continue;
			}
			if (CIMLevelZeroVisualIDRegistry
					.getNodeVisualID(view, childElement) == TelnetProtocolEndpointEditPart.VISUAL_ID) {
				result.add(new CIMLevelZeroNodeDescriptor(childElement,
						TelnetProtocolEndpointEditPart.VISUAL_ID));
				continue;
			}
			if (CIMLevelZeroVisualIDRegistry
					.getNodeVisualID(view, childElement) == LANEndpointEditPart.VISUAL_ID) {
				result.add(new CIMLevelZeroNodeDescriptor(childElement,
						LANEndpointEditPart.VISUAL_ID));
				continue;
			}
			if (CIMLevelZeroVisualIDRegistry
					.getNodeVisualID(view, childElement) == DropThresholdCalculationServiceEditPart.VISUAL_ID) {
				result.add(new CIMLevelZeroNodeDescriptor(childElement,
						DropThresholdCalculationServiceEditPart.VISUAL_ID));
				continue;
			}
			if (CIMLevelZeroVisualIDRegistry
					.getNodeVisualID(view, childElement) == AdminDomainEditPart.VISUAL_ID) {
				result.add(new CIMLevelZeroNodeDescriptor(childElement,
						AdminDomainEditPart.VISUAL_ID));
				continue;
			}
			if (CIMLevelZeroVisualIDRegistry
					.getNodeVisualID(view, childElement) == SystemSpecificCollectionEditPart.VISUAL_ID) {
				result.add(new CIMLevelZeroNodeDescriptor(childElement,
						SystemSpecificCollectionEditPart.VISUAL_ID));
				continue;
			}
			if (CIMLevelZeroVisualIDRegistry
					.getNodeVisualID(view, childElement) == NextHopRoutingEditPart.VISUAL_ID) {
				result.add(new CIMLevelZeroNodeDescriptor(childElement,
						NextHopRoutingEditPart.VISUAL_ID));
				continue;
			}
			if (CIMLevelZeroVisualIDRegistry
					.getNodeVisualID(view, childElement) == ComputerSystemEditPart.VISUAL_ID) {
				result.add(new CIMLevelZeroNodeDescriptor(childElement,
						ComputerSystemEditPart.VISUAL_ID));
				continue;
			}
			if (CIMLevelZeroVisualIDRegistry
					.getNodeVisualID(view, childElement) == NetworkPortEditPart.VISUAL_ID) {
				result.add(new CIMLevelZeroNodeDescriptor(childElement,
						NetworkPortEditPart.VISUAL_ID));
				continue;
			}
			if (CIMLevelZeroVisualIDRegistry
					.getNodeVisualID(view, childElement) == RemoteServiceAccessPointEditPart.VISUAL_ID) {
				result.add(new CIMLevelZeroNodeDescriptor(childElement,
						RemoteServiceAccessPointEditPart.VISUAL_ID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Iterator getPhantomNodesIterator(Resource resource) {
		return resource.getAllContents();
	}

	/**
	 * @generated
	 */
	public static List getContainedLinks(View view) {
		switch (CIMLevelZeroVisualIDRegistry.getVisualID(view)) {
		case CIM_ModelEditPart.VISUAL_ID:
			return getCIM_Model_1000ContainedLinks(view);
		case USBDeviceEditPart.VISUAL_ID:
			return getUSBDevice_2001ContainedLinks(view);
		case OSPFVirtualInterfaceEditPart.VISUAL_ID:
			return getOSPFVirtualInterface_2002ContainedLinks(view);
		case WiFiPortEditPart.VISUAL_ID:
			return getWiFiPort_2003ContainedLinks(view);
		case ProtocolServiceEditPart.VISUAL_ID:
			return getProtocolService_2004ContainedLinks(view);
		case RoutingPolicyEditPart.VISUAL_ID:
			return getRoutingPolicy_2005ContainedLinks(view);
		case EnabledLogicalElementCapabilitiesEditPart.VISUAL_ID:
			return getEnabledLogicalElementCapabilities_2006ContainedLinks(view);
		case BufferPoolEditPart.VISUAL_ID:
			return getBufferPool_2007ContainedLinks(view);
		case MPLSProtocolEndpointEditPart.VISUAL_ID:
			return getMPLSProtocolEndpoint_2008ContainedLinks(view);
		case AutonomousSystemEditPart.VISUAL_ID:
			return getAutonomousSystem_2009ContainedLinks(view);
		case DNSSettingDataEditPart.VISUAL_ID:
			return getDNSSettingData_2010ContainedLinks(view);
		case UniModemEditPart.VISUAL_ID:
			return getUniModem_2011ContainedLinks(view);
		case EFServiceEditPart.VISUAL_ID:
			return getEFService_2012ContainedLinks(view);
		case IPSubnetEditPart.VISUAL_ID:
			return getIPSubnet_2013ContainedLinks(view);
		case NamedAddressCollectionEditPart.VISUAL_ID:
			return getNamedAddressCollection_2014ContainedLinks(view);
		case BIOSElementEditPart.VISUAL_ID:
			return getBIOSElement_2015ContainedLinks(view);
		case TelnetSettingDataEditPart.VISUAL_ID:
			return getTelnetSettingData_2016ContainedLinks(view);
		case BGPPeerGroupEditPart.VISUAL_ID:
			return getBGPPeerGroup_2017ContainedLinks(view);
		case LANConnectivitySegmentEditPart.VISUAL_ID:
			return getLANConnectivitySegment_2018ContainedLinks(view);
		case CableModemEditPart.VISUAL_ID:
			return getCableModem_2019ContainedLinks(view);
		case SwitchPortEditPart.VISUAL_ID:
			return getSwitchPort_2020ContainedLinks(view);
		case TCPProtocolEndpointEditPart.VISUAL_ID:
			return getTCPProtocolEndpoint_2021ContainedLinks(view);
		case AdministrativeDistanceEditPart.VISUAL_ID:
			return getAdministrativeDistance_2022ContainedLinks(view);
		case IPConnectivitySubnetEditPart.VISUAL_ID:
			return getIPConnectivitySubnet_2023ContainedLinks(view);
		case VolatileStorageEditPart.VISUAL_ID:
			return getVolatileStorage_2024ContainedLinks(view);
		case RangeOfIPAddressesEditPart.VISUAL_ID:
			return getRangeOfIPAddresses_2025ContainedLinks(view);
		case BGPProtocolEndpointEditPart.VISUAL_ID:
			return getBGPProtocolEndpoint_2026ContainedLinks(view);
		case UnitaryComputerSystemEditPart.VISUAL_ID:
			return getUnitaryComputerSystem_2027ContainedLinks(view);
		case EthernetPortEditPart.VISUAL_ID:
			return getEthernetPort_2028ContainedLinks(view);
		case SNMPServiceEditPart.VISUAL_ID:
			return getSNMPService_2029ContainedLinks(view);
		case LogicalModuleEditPart.VISUAL_ID:
			return getLogicalModule_2030ContainedLinks(view);
		case NextHopIPRouteEditPart.VISUAL_ID:
			return getNextHopIPRoute_2031ContainedLinks(view);
		case OperatingSystemEditPart.VISUAL_ID:
			return getOperatingSystem_2032ContainedLinks(view);
		case SDSLModemEditPart.VISUAL_ID:
			return getSDSLModem_2033ContainedLinks(view);
		case WiFiEndPointEditPart.VISUAL_ID:
			return getWiFiEndPoint_2034ContainedLinks(view);
		case NATServiceEditPart.VISUAL_ID:
			return getNATService_2035ContainedLinks(view);
		case ADSLModemEditPart.VISUAL_ID:
			return getADSLModem_2036ContainedLinks(view);
		case LogicalFileEditPart.VISUAL_ID:
			return getLogicalFile_2037ContainedLinks(view);
		case BGPClusterEditPart.VISUAL_ID:
			return getBGPCluster_2038ContainedLinks(view);
		case ApplicationSystemEditPart.VISUAL_ID:
			return getApplicationSystem_2039ContainedLinks(view);
		case SoftwareIdentityEditPart.VISUAL_ID:
			return getSoftwareIdentity_2040ContainedLinks(view);
		case WirelessPortEditPart.VISUAL_ID:
			return getWirelessPort_2041ContainedLinks(view);
		case CLPSettingDataEditPart.VISUAL_ID:
			return getCLPSettingData_2042ContainedLinks(view);
		case GenericServiceEditPart.VISUAL_ID:
			return getGenericService_2043ContainedLinks(view);
		case NATListBasedSettingsEditPart.VISUAL_ID:
			return getNATListBasedSettings_2044ContainedLinks(view);
		case VDSLModemEditPart.VISUAL_ID:
			return getVDSLModem_2045ContainedLinks(view);
		case USBPortEditPart.VISUAL_ID:
			return getUSBPort_2046ContainedLinks(view);
		case DNSProtocolEndpointEditPart.VISUAL_ID:
			return getDNSProtocolEndpoint_2047ContainedLinks(view);
		case WiFiEndpointSettingsEditPart.VISUAL_ID:
			return getWiFiEndpointSettings_2048ContainedLinks(view);
		case SSHSettingDataEditPart.VISUAL_ID:
			return getSSHSettingData_2049ContainedLinks(view);
		case WirelessLANEndpointEditPart.VISUAL_ID:
			return getWirelessLANEndpoint_2050ContainedLinks(view);
		case DHCPProtocolEndpointEditPart.VISUAL_ID:
			return getDHCPProtocolEndpoint_2051ContainedLinks(view);
		case IPHeadersFilterEditPart.VISUAL_ID:
			return getIPHeadersFilter_2052ContainedLinks(view);
		case DirectoryEditPart.VISUAL_ID:
			return getDirectory_2053ContainedLinks(view);
		case IPAddressRangeEditPart.VISUAL_ID:
			return getIPAddressRange_2054ContainedLinks(view);
		case SNMPTrapTargetEditPart.VISUAL_ID:
			return getSNMPTrapTarget_2055ContainedLinks(view);
		case IPXConnectivityNetworkEditPart.VISUAL_ID:
			return getIPXConnectivityNetwork_2056ContainedLinks(view);
		case ConnectivityMemberhipSettingDataEditPart.VISUAL_ID:
			return getConnectivityMemberhipSettingData_2057ContainedLinks(view);
		case ConditioningServiceEditPart.VISUAL_ID:
			return getConditioningService_2058ContainedLinks(view);
		case BIOSFeatureEditPart.VISUAL_ID:
			return getBIOSFeature_2059ContainedLinks(view);
		case OSPFProtocolEndpointEditPart.VISUAL_ID:
			return getOSPFProtocolEndpoint_2060ContainedLinks(view);
		case FilterListEditPart.VISUAL_ID:
			return getFilterList_2061ContainedLinks(view);
		case BGPServiceEditPart.VISUAL_ID:
			return getBGPService_2062ContainedLinks(view);
		case PrecedenceServiceEditPart.VISUAL_ID:
			return getPrecedenceService_2063ContainedLinks(view);
		case DHCPCapabilitiesEditPart.VISUAL_ID:
			return getDHCPCapabilities_2064ContainedLinks(view);
		case Hdr8021PServiceEditPart.VISUAL_ID:
			return getHdr8021PService_2065ContainedLinks(view);
		case ReplacementSetEditPart.VISUAL_ID:
			return getReplacementSet_2066ContainedLinks(view);
		case HDSLModemEditPart.VISUAL_ID:
			return getHDSLModem_2067ContainedLinks(view);
		case ServiceAccessURIEditPart.VISUAL_ID:
			return getServiceAccessURI_2068ContainedLinks(view);
		case FilterEntryEditPart.VISUAL_ID:
			return getFilterEntry_2069ContainedLinks(view);
		case SNMPCommunityStringsEditPart.VISUAL_ID:
			return getSNMPCommunityStrings_2070ContainedLinks(view);
		case NetworkEditPart.VISUAL_ID:
			return getNetwork_2071ContainedLinks(view);
		case FileSpecificationEditPart.VISUAL_ID:
			return getFileSpecification_2072ContainedLinks(view);
		case IPXNetworkEditPart.VISUAL_ID:
			return getIPXNetwork_2073ContainedLinks(view);
		case PowerManagementCapabilitiesEditPart.VISUAL_ID:
			return getPowerManagementCapabilities_2074ContainedLinks(view);
		case FlowServiceEditPart.VISUAL_ID:
			return getFlowService_2075ContainedLinks(view);
		case ISDNModemEditPart.VISUAL_ID:
			return getISDNModem_2076ContainedLinks(view);
		case IPXProtocolEndpointEditPart.VISUAL_ID:
			return getIPXProtocolEndpoint_2077ContainedLinks(view);
		case IPProtocolEndpointEditPart.VISUAL_ID:
			return getIPProtocolEndpoint_2078ContainedLinks(view);
		case UDPProtocolEndpointEditPart.VISUAL_ID:
			return getUDPProtocolEndpoint_2079ContainedLinks(view);
		case ProductEditPart.VISUAL_ID:
			return getProduct_2080ContainedLinks(view);
		case MemoryCapacityEditPart.VISUAL_ID:
			return getMemoryCapacity_2081ContainedLinks(view);
		case RoutingProtocolDomainEditPart.VISUAL_ID:
			return getRoutingProtocolDomain_2082ContainedLinks(view);
		case AFServiceEditPart.VISUAL_ID:
			return getAFService_2083ContainedLinks(view);
		case LANSegmentEditPart.VISUAL_ID:
			return getLANSegment_2084ContainedLinks(view);
		case NATStaticSettingsEditPart.VISUAL_ID:
			return getNATStaticSettings_2085ContainedLinks(view);
		case TelnetProtocolEndpointEditPart.VISUAL_ID:
			return getTelnetProtocolEndpoint_2086ContainedLinks(view);
		case LANEndpointEditPart.VISUAL_ID:
			return getLANEndpoint_2087ContainedLinks(view);
		case DropThresholdCalculationServiceEditPart.VISUAL_ID:
			return getDropThresholdCalculationService_2088ContainedLinks(view);
		case AdminDomainEditPart.VISUAL_ID:
			return getAdminDomain_2089ContainedLinks(view);
		case SystemSpecificCollectionEditPart.VISUAL_ID:
			return getSystemSpecificCollection_2090ContainedLinks(view);
		case NextHopRoutingEditPart.VISUAL_ID:
			return getNextHopRouting_2091ContainedLinks(view);
		case ComputerSystemEditPart.VISUAL_ID:
			return getComputerSystem_2092ContainedLinks(view);
		case NetworkPortEditPart.VISUAL_ID:
			return getNetworkPort_2093ContainedLinks(view);
		case RemoteServiceAccessPointEditPart.VISUAL_ID:
			return getRemoteServiceAccessPoint_2094ContainedLinks(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIncomingLinks(View view) {
		switch (CIMLevelZeroVisualIDRegistry.getVisualID(view)) {
		case USBDeviceEditPart.VISUAL_ID:
			return getUSBDevice_2001IncomingLinks(view);
		case OSPFVirtualInterfaceEditPart.VISUAL_ID:
			return getOSPFVirtualInterface_2002IncomingLinks(view);
		case WiFiPortEditPart.VISUAL_ID:
			return getWiFiPort_2003IncomingLinks(view);
		case ProtocolServiceEditPart.VISUAL_ID:
			return getProtocolService_2004IncomingLinks(view);
		case RoutingPolicyEditPart.VISUAL_ID:
			return getRoutingPolicy_2005IncomingLinks(view);
		case EnabledLogicalElementCapabilitiesEditPart.VISUAL_ID:
			return getEnabledLogicalElementCapabilities_2006IncomingLinks(view);
		case BufferPoolEditPart.VISUAL_ID:
			return getBufferPool_2007IncomingLinks(view);
		case MPLSProtocolEndpointEditPart.VISUAL_ID:
			return getMPLSProtocolEndpoint_2008IncomingLinks(view);
		case AutonomousSystemEditPart.VISUAL_ID:
			return getAutonomousSystem_2009IncomingLinks(view);
		case DNSSettingDataEditPart.VISUAL_ID:
			return getDNSSettingData_2010IncomingLinks(view);
		case UniModemEditPart.VISUAL_ID:
			return getUniModem_2011IncomingLinks(view);
		case EFServiceEditPart.VISUAL_ID:
			return getEFService_2012IncomingLinks(view);
		case IPSubnetEditPart.VISUAL_ID:
			return getIPSubnet_2013IncomingLinks(view);
		case NamedAddressCollectionEditPart.VISUAL_ID:
			return getNamedAddressCollection_2014IncomingLinks(view);
		case BIOSElementEditPart.VISUAL_ID:
			return getBIOSElement_2015IncomingLinks(view);
		case TelnetSettingDataEditPart.VISUAL_ID:
			return getTelnetSettingData_2016IncomingLinks(view);
		case BGPPeerGroupEditPart.VISUAL_ID:
			return getBGPPeerGroup_2017IncomingLinks(view);
		case LANConnectivitySegmentEditPart.VISUAL_ID:
			return getLANConnectivitySegment_2018IncomingLinks(view);
		case CableModemEditPart.VISUAL_ID:
			return getCableModem_2019IncomingLinks(view);
		case SwitchPortEditPart.VISUAL_ID:
			return getSwitchPort_2020IncomingLinks(view);
		case TCPProtocolEndpointEditPart.VISUAL_ID:
			return getTCPProtocolEndpoint_2021IncomingLinks(view);
		case AdministrativeDistanceEditPart.VISUAL_ID:
			return getAdministrativeDistance_2022IncomingLinks(view);
		case IPConnectivitySubnetEditPart.VISUAL_ID:
			return getIPConnectivitySubnet_2023IncomingLinks(view);
		case VolatileStorageEditPart.VISUAL_ID:
			return getVolatileStorage_2024IncomingLinks(view);
		case RangeOfIPAddressesEditPart.VISUAL_ID:
			return getRangeOfIPAddresses_2025IncomingLinks(view);
		case BGPProtocolEndpointEditPart.VISUAL_ID:
			return getBGPProtocolEndpoint_2026IncomingLinks(view);
		case UnitaryComputerSystemEditPart.VISUAL_ID:
			return getUnitaryComputerSystem_2027IncomingLinks(view);
		case EthernetPortEditPart.VISUAL_ID:
			return getEthernetPort_2028IncomingLinks(view);
		case SNMPServiceEditPart.VISUAL_ID:
			return getSNMPService_2029IncomingLinks(view);
		case LogicalModuleEditPart.VISUAL_ID:
			return getLogicalModule_2030IncomingLinks(view);
		case NextHopIPRouteEditPart.VISUAL_ID:
			return getNextHopIPRoute_2031IncomingLinks(view);
		case OperatingSystemEditPart.VISUAL_ID:
			return getOperatingSystem_2032IncomingLinks(view);
		case SDSLModemEditPart.VISUAL_ID:
			return getSDSLModem_2033IncomingLinks(view);
		case WiFiEndPointEditPart.VISUAL_ID:
			return getWiFiEndPoint_2034IncomingLinks(view);
		case NATServiceEditPart.VISUAL_ID:
			return getNATService_2035IncomingLinks(view);
		case ADSLModemEditPart.VISUAL_ID:
			return getADSLModem_2036IncomingLinks(view);
		case LogicalFileEditPart.VISUAL_ID:
			return getLogicalFile_2037IncomingLinks(view);
		case BGPClusterEditPart.VISUAL_ID:
			return getBGPCluster_2038IncomingLinks(view);
		case ApplicationSystemEditPart.VISUAL_ID:
			return getApplicationSystem_2039IncomingLinks(view);
		case SoftwareIdentityEditPart.VISUAL_ID:
			return getSoftwareIdentity_2040IncomingLinks(view);
		case WirelessPortEditPart.VISUAL_ID:
			return getWirelessPort_2041IncomingLinks(view);
		case CLPSettingDataEditPart.VISUAL_ID:
			return getCLPSettingData_2042IncomingLinks(view);
		case GenericServiceEditPart.VISUAL_ID:
			return getGenericService_2043IncomingLinks(view);
		case NATListBasedSettingsEditPart.VISUAL_ID:
			return getNATListBasedSettings_2044IncomingLinks(view);
		case VDSLModemEditPart.VISUAL_ID:
			return getVDSLModem_2045IncomingLinks(view);
		case USBPortEditPart.VISUAL_ID:
			return getUSBPort_2046IncomingLinks(view);
		case DNSProtocolEndpointEditPart.VISUAL_ID:
			return getDNSProtocolEndpoint_2047IncomingLinks(view);
		case WiFiEndpointSettingsEditPart.VISUAL_ID:
			return getWiFiEndpointSettings_2048IncomingLinks(view);
		case SSHSettingDataEditPart.VISUAL_ID:
			return getSSHSettingData_2049IncomingLinks(view);
		case WirelessLANEndpointEditPart.VISUAL_ID:
			return getWirelessLANEndpoint_2050IncomingLinks(view);
		case DHCPProtocolEndpointEditPart.VISUAL_ID:
			return getDHCPProtocolEndpoint_2051IncomingLinks(view);
		case IPHeadersFilterEditPart.VISUAL_ID:
			return getIPHeadersFilter_2052IncomingLinks(view);
		case DirectoryEditPart.VISUAL_ID:
			return getDirectory_2053IncomingLinks(view);
		case IPAddressRangeEditPart.VISUAL_ID:
			return getIPAddressRange_2054IncomingLinks(view);
		case SNMPTrapTargetEditPart.VISUAL_ID:
			return getSNMPTrapTarget_2055IncomingLinks(view);
		case IPXConnectivityNetworkEditPart.VISUAL_ID:
			return getIPXConnectivityNetwork_2056IncomingLinks(view);
		case ConnectivityMemberhipSettingDataEditPart.VISUAL_ID:
			return getConnectivityMemberhipSettingData_2057IncomingLinks(view);
		case ConditioningServiceEditPart.VISUAL_ID:
			return getConditioningService_2058IncomingLinks(view);
		case BIOSFeatureEditPart.VISUAL_ID:
			return getBIOSFeature_2059IncomingLinks(view);
		case OSPFProtocolEndpointEditPart.VISUAL_ID:
			return getOSPFProtocolEndpoint_2060IncomingLinks(view);
		case FilterListEditPart.VISUAL_ID:
			return getFilterList_2061IncomingLinks(view);
		case BGPServiceEditPart.VISUAL_ID:
			return getBGPService_2062IncomingLinks(view);
		case PrecedenceServiceEditPart.VISUAL_ID:
			return getPrecedenceService_2063IncomingLinks(view);
		case DHCPCapabilitiesEditPart.VISUAL_ID:
			return getDHCPCapabilities_2064IncomingLinks(view);
		case Hdr8021PServiceEditPart.VISUAL_ID:
			return getHdr8021PService_2065IncomingLinks(view);
		case ReplacementSetEditPart.VISUAL_ID:
			return getReplacementSet_2066IncomingLinks(view);
		case HDSLModemEditPart.VISUAL_ID:
			return getHDSLModem_2067IncomingLinks(view);
		case ServiceAccessURIEditPart.VISUAL_ID:
			return getServiceAccessURI_2068IncomingLinks(view);
		case FilterEntryEditPart.VISUAL_ID:
			return getFilterEntry_2069IncomingLinks(view);
		case SNMPCommunityStringsEditPart.VISUAL_ID:
			return getSNMPCommunityStrings_2070IncomingLinks(view);
		case NetworkEditPart.VISUAL_ID:
			return getNetwork_2071IncomingLinks(view);
		case FileSpecificationEditPart.VISUAL_ID:
			return getFileSpecification_2072IncomingLinks(view);
		case IPXNetworkEditPart.VISUAL_ID:
			return getIPXNetwork_2073IncomingLinks(view);
		case PowerManagementCapabilitiesEditPart.VISUAL_ID:
			return getPowerManagementCapabilities_2074IncomingLinks(view);
		case FlowServiceEditPart.VISUAL_ID:
			return getFlowService_2075IncomingLinks(view);
		case ISDNModemEditPart.VISUAL_ID:
			return getISDNModem_2076IncomingLinks(view);
		case IPXProtocolEndpointEditPart.VISUAL_ID:
			return getIPXProtocolEndpoint_2077IncomingLinks(view);
		case IPProtocolEndpointEditPart.VISUAL_ID:
			return getIPProtocolEndpoint_2078IncomingLinks(view);
		case UDPProtocolEndpointEditPart.VISUAL_ID:
			return getUDPProtocolEndpoint_2079IncomingLinks(view);
		case ProductEditPart.VISUAL_ID:
			return getProduct_2080IncomingLinks(view);
		case MemoryCapacityEditPart.VISUAL_ID:
			return getMemoryCapacity_2081IncomingLinks(view);
		case RoutingProtocolDomainEditPart.VISUAL_ID:
			return getRoutingProtocolDomain_2082IncomingLinks(view);
		case AFServiceEditPart.VISUAL_ID:
			return getAFService_2083IncomingLinks(view);
		case LANSegmentEditPart.VISUAL_ID:
			return getLANSegment_2084IncomingLinks(view);
		case NATStaticSettingsEditPart.VISUAL_ID:
			return getNATStaticSettings_2085IncomingLinks(view);
		case TelnetProtocolEndpointEditPart.VISUAL_ID:
			return getTelnetProtocolEndpoint_2086IncomingLinks(view);
		case LANEndpointEditPart.VISUAL_ID:
			return getLANEndpoint_2087IncomingLinks(view);
		case DropThresholdCalculationServiceEditPart.VISUAL_ID:
			return getDropThresholdCalculationService_2088IncomingLinks(view);
		case AdminDomainEditPart.VISUAL_ID:
			return getAdminDomain_2089IncomingLinks(view);
		case SystemSpecificCollectionEditPart.VISUAL_ID:
			return getSystemSpecificCollection_2090IncomingLinks(view);
		case NextHopRoutingEditPart.VISUAL_ID:
			return getNextHopRouting_2091IncomingLinks(view);
		case ComputerSystemEditPart.VISUAL_ID:
			return getComputerSystem_2092IncomingLinks(view);
		case NetworkPortEditPart.VISUAL_ID:
			return getNetworkPort_2093IncomingLinks(view);
		case RemoteServiceAccessPointEditPart.VISUAL_ID:
			return getRemoteServiceAccessPoint_2094IncomingLinks(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOutgoingLinks(View view) {
		switch (CIMLevelZeroVisualIDRegistry.getVisualID(view)) {
		case USBDeviceEditPart.VISUAL_ID:
			return getUSBDevice_2001OutgoingLinks(view);
		case OSPFVirtualInterfaceEditPart.VISUAL_ID:
			return getOSPFVirtualInterface_2002OutgoingLinks(view);
		case WiFiPortEditPart.VISUAL_ID:
			return getWiFiPort_2003OutgoingLinks(view);
		case ProtocolServiceEditPart.VISUAL_ID:
			return getProtocolService_2004OutgoingLinks(view);
		case RoutingPolicyEditPart.VISUAL_ID:
			return getRoutingPolicy_2005OutgoingLinks(view);
		case EnabledLogicalElementCapabilitiesEditPart.VISUAL_ID:
			return getEnabledLogicalElementCapabilities_2006OutgoingLinks(view);
		case BufferPoolEditPart.VISUAL_ID:
			return getBufferPool_2007OutgoingLinks(view);
		case MPLSProtocolEndpointEditPart.VISUAL_ID:
			return getMPLSProtocolEndpoint_2008OutgoingLinks(view);
		case AutonomousSystemEditPart.VISUAL_ID:
			return getAutonomousSystem_2009OutgoingLinks(view);
		case DNSSettingDataEditPart.VISUAL_ID:
			return getDNSSettingData_2010OutgoingLinks(view);
		case UniModemEditPart.VISUAL_ID:
			return getUniModem_2011OutgoingLinks(view);
		case EFServiceEditPart.VISUAL_ID:
			return getEFService_2012OutgoingLinks(view);
		case IPSubnetEditPart.VISUAL_ID:
			return getIPSubnet_2013OutgoingLinks(view);
		case NamedAddressCollectionEditPart.VISUAL_ID:
			return getNamedAddressCollection_2014OutgoingLinks(view);
		case BIOSElementEditPart.VISUAL_ID:
			return getBIOSElement_2015OutgoingLinks(view);
		case TelnetSettingDataEditPart.VISUAL_ID:
			return getTelnetSettingData_2016OutgoingLinks(view);
		case BGPPeerGroupEditPart.VISUAL_ID:
			return getBGPPeerGroup_2017OutgoingLinks(view);
		case LANConnectivitySegmentEditPart.VISUAL_ID:
			return getLANConnectivitySegment_2018OutgoingLinks(view);
		case CableModemEditPart.VISUAL_ID:
			return getCableModem_2019OutgoingLinks(view);
		case SwitchPortEditPart.VISUAL_ID:
			return getSwitchPort_2020OutgoingLinks(view);
		case TCPProtocolEndpointEditPart.VISUAL_ID:
			return getTCPProtocolEndpoint_2021OutgoingLinks(view);
		case AdministrativeDistanceEditPart.VISUAL_ID:
			return getAdministrativeDistance_2022OutgoingLinks(view);
		case IPConnectivitySubnetEditPart.VISUAL_ID:
			return getIPConnectivitySubnet_2023OutgoingLinks(view);
		case VolatileStorageEditPart.VISUAL_ID:
			return getVolatileStorage_2024OutgoingLinks(view);
		case RangeOfIPAddressesEditPart.VISUAL_ID:
			return getRangeOfIPAddresses_2025OutgoingLinks(view);
		case BGPProtocolEndpointEditPart.VISUAL_ID:
			return getBGPProtocolEndpoint_2026OutgoingLinks(view);
		case UnitaryComputerSystemEditPart.VISUAL_ID:
			return getUnitaryComputerSystem_2027OutgoingLinks(view);
		case EthernetPortEditPart.VISUAL_ID:
			return getEthernetPort_2028OutgoingLinks(view);
		case SNMPServiceEditPart.VISUAL_ID:
			return getSNMPService_2029OutgoingLinks(view);
		case LogicalModuleEditPart.VISUAL_ID:
			return getLogicalModule_2030OutgoingLinks(view);
		case NextHopIPRouteEditPart.VISUAL_ID:
			return getNextHopIPRoute_2031OutgoingLinks(view);
		case OperatingSystemEditPart.VISUAL_ID:
			return getOperatingSystem_2032OutgoingLinks(view);
		case SDSLModemEditPart.VISUAL_ID:
			return getSDSLModem_2033OutgoingLinks(view);
		case WiFiEndPointEditPart.VISUAL_ID:
			return getWiFiEndPoint_2034OutgoingLinks(view);
		case NATServiceEditPart.VISUAL_ID:
			return getNATService_2035OutgoingLinks(view);
		case ADSLModemEditPart.VISUAL_ID:
			return getADSLModem_2036OutgoingLinks(view);
		case LogicalFileEditPart.VISUAL_ID:
			return getLogicalFile_2037OutgoingLinks(view);
		case BGPClusterEditPart.VISUAL_ID:
			return getBGPCluster_2038OutgoingLinks(view);
		case ApplicationSystemEditPart.VISUAL_ID:
			return getApplicationSystem_2039OutgoingLinks(view);
		case SoftwareIdentityEditPart.VISUAL_ID:
			return getSoftwareIdentity_2040OutgoingLinks(view);
		case WirelessPortEditPart.VISUAL_ID:
			return getWirelessPort_2041OutgoingLinks(view);
		case CLPSettingDataEditPart.VISUAL_ID:
			return getCLPSettingData_2042OutgoingLinks(view);
		case GenericServiceEditPart.VISUAL_ID:
			return getGenericService_2043OutgoingLinks(view);
		case NATListBasedSettingsEditPart.VISUAL_ID:
			return getNATListBasedSettings_2044OutgoingLinks(view);
		case VDSLModemEditPart.VISUAL_ID:
			return getVDSLModem_2045OutgoingLinks(view);
		case USBPortEditPart.VISUAL_ID:
			return getUSBPort_2046OutgoingLinks(view);
		case DNSProtocolEndpointEditPart.VISUAL_ID:
			return getDNSProtocolEndpoint_2047OutgoingLinks(view);
		case WiFiEndpointSettingsEditPart.VISUAL_ID:
			return getWiFiEndpointSettings_2048OutgoingLinks(view);
		case SSHSettingDataEditPart.VISUAL_ID:
			return getSSHSettingData_2049OutgoingLinks(view);
		case WirelessLANEndpointEditPart.VISUAL_ID:
			return getWirelessLANEndpoint_2050OutgoingLinks(view);
		case DHCPProtocolEndpointEditPart.VISUAL_ID:
			return getDHCPProtocolEndpoint_2051OutgoingLinks(view);
		case IPHeadersFilterEditPart.VISUAL_ID:
			return getIPHeadersFilter_2052OutgoingLinks(view);
		case DirectoryEditPart.VISUAL_ID:
			return getDirectory_2053OutgoingLinks(view);
		case IPAddressRangeEditPart.VISUAL_ID:
			return getIPAddressRange_2054OutgoingLinks(view);
		case SNMPTrapTargetEditPart.VISUAL_ID:
			return getSNMPTrapTarget_2055OutgoingLinks(view);
		case IPXConnectivityNetworkEditPart.VISUAL_ID:
			return getIPXConnectivityNetwork_2056OutgoingLinks(view);
		case ConnectivityMemberhipSettingDataEditPart.VISUAL_ID:
			return getConnectivityMemberhipSettingData_2057OutgoingLinks(view);
		case ConditioningServiceEditPart.VISUAL_ID:
			return getConditioningService_2058OutgoingLinks(view);
		case BIOSFeatureEditPart.VISUAL_ID:
			return getBIOSFeature_2059OutgoingLinks(view);
		case OSPFProtocolEndpointEditPart.VISUAL_ID:
			return getOSPFProtocolEndpoint_2060OutgoingLinks(view);
		case FilterListEditPart.VISUAL_ID:
			return getFilterList_2061OutgoingLinks(view);
		case BGPServiceEditPart.VISUAL_ID:
			return getBGPService_2062OutgoingLinks(view);
		case PrecedenceServiceEditPart.VISUAL_ID:
			return getPrecedenceService_2063OutgoingLinks(view);
		case DHCPCapabilitiesEditPart.VISUAL_ID:
			return getDHCPCapabilities_2064OutgoingLinks(view);
		case Hdr8021PServiceEditPart.VISUAL_ID:
			return getHdr8021PService_2065OutgoingLinks(view);
		case ReplacementSetEditPart.VISUAL_ID:
			return getReplacementSet_2066OutgoingLinks(view);
		case HDSLModemEditPart.VISUAL_ID:
			return getHDSLModem_2067OutgoingLinks(view);
		case ServiceAccessURIEditPart.VISUAL_ID:
			return getServiceAccessURI_2068OutgoingLinks(view);
		case FilterEntryEditPart.VISUAL_ID:
			return getFilterEntry_2069OutgoingLinks(view);
		case SNMPCommunityStringsEditPart.VISUAL_ID:
			return getSNMPCommunityStrings_2070OutgoingLinks(view);
		case NetworkEditPart.VISUAL_ID:
			return getNetwork_2071OutgoingLinks(view);
		case FileSpecificationEditPart.VISUAL_ID:
			return getFileSpecification_2072OutgoingLinks(view);
		case IPXNetworkEditPart.VISUAL_ID:
			return getIPXNetwork_2073OutgoingLinks(view);
		case PowerManagementCapabilitiesEditPart.VISUAL_ID:
			return getPowerManagementCapabilities_2074OutgoingLinks(view);
		case FlowServiceEditPart.VISUAL_ID:
			return getFlowService_2075OutgoingLinks(view);
		case ISDNModemEditPart.VISUAL_ID:
			return getISDNModem_2076OutgoingLinks(view);
		case IPXProtocolEndpointEditPart.VISUAL_ID:
			return getIPXProtocolEndpoint_2077OutgoingLinks(view);
		case IPProtocolEndpointEditPart.VISUAL_ID:
			return getIPProtocolEndpoint_2078OutgoingLinks(view);
		case UDPProtocolEndpointEditPart.VISUAL_ID:
			return getUDPProtocolEndpoint_2079OutgoingLinks(view);
		case ProductEditPart.VISUAL_ID:
			return getProduct_2080OutgoingLinks(view);
		case MemoryCapacityEditPart.VISUAL_ID:
			return getMemoryCapacity_2081OutgoingLinks(view);
		case RoutingProtocolDomainEditPart.VISUAL_ID:
			return getRoutingProtocolDomain_2082OutgoingLinks(view);
		case AFServiceEditPart.VISUAL_ID:
			return getAFService_2083OutgoingLinks(view);
		case LANSegmentEditPart.VISUAL_ID:
			return getLANSegment_2084OutgoingLinks(view);
		case NATStaticSettingsEditPart.VISUAL_ID:
			return getNATStaticSettings_2085OutgoingLinks(view);
		case TelnetProtocolEndpointEditPart.VISUAL_ID:
			return getTelnetProtocolEndpoint_2086OutgoingLinks(view);
		case LANEndpointEditPart.VISUAL_ID:
			return getLANEndpoint_2087OutgoingLinks(view);
		case DropThresholdCalculationServiceEditPart.VISUAL_ID:
			return getDropThresholdCalculationService_2088OutgoingLinks(view);
		case AdminDomainEditPart.VISUAL_ID:
			return getAdminDomain_2089OutgoingLinks(view);
		case SystemSpecificCollectionEditPart.VISUAL_ID:
			return getSystemSpecificCollection_2090OutgoingLinks(view);
		case NextHopRoutingEditPart.VISUAL_ID:
			return getNextHopRouting_2091OutgoingLinks(view);
		case ComputerSystemEditPart.VISUAL_ID:
			return getComputerSystem_2092OutgoingLinks(view);
		case NetworkPortEditPart.VISUAL_ID:
			return getNetworkPort_2093OutgoingLinks(view);
		case RemoteServiceAccessPointEditPart.VISUAL_ID:
			return getRemoteServiceAccessPoint_2094OutgoingLinks(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCIM_Model_1000ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getUSBDevice_2001ContainedLinks(View view) {
		USBDevice modelElement = (USBDevice) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Components_4011(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_LogicalDevice_DeviceConnection_4014(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_LogicalDevice_DeviceIdentity_4015(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_LogicalDevice_DeviceSAPImplementation_4016(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementCapabilities_4017(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementSettingData_4018(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_EnabledLogicalElement_RemoteAccessAvailableToElement_4027(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedSystemElement_StatusDescriptions_4035(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_LogicalDevice_PortOnDevice_4061(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getOSPFVirtualInterface_2002ContainedLinks(View view) {
		OSPFVirtualInterface modelElement = (OSPFVirtualInterface) view
				.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ServiceAccessPoint_BindsTo_4010(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Components_4011(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementCapabilities_4017(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementSettingData_4018(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_EnabledLogicalElement_RemoteAccessAvailableToElement_4027(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ServiceAccessPoint_SAPSAPDependency_4029(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedSystemElement_StatusDescriptions_4035(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ServiceAccessPoint_BindsToLANEndpoint_4045(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ProtocolEndpoint_EgressConditioningServiceOnEndpoint_4047(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ProtocolEndpoint_IngressConditioningServiceOnEndpoint_4055(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getWiFiPort_2003ContainedLinks(View view) {
		WiFiPort modelElement = (WiFiPort) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Components_4011(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_LogicalDevice_DeviceConnection_4014(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_LogicalDevice_DeviceIdentity_4015(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_LogicalDevice_DeviceSAPImplementation_4016(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementCapabilities_4017(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementSettingData_4018(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_EnabledLogicalElement_RemoteAccessAvailableToElement_4027(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedSystemElement_StatusDescriptions_4035(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_LogicalPort_PortImplementsEndPoint_4060(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_LogicalDevice_PortOnDevice_4061(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getProtocolService_2004ContainedLinks(View view) {
		ProtocolService modelElement = (ProtocolService) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Components_4011(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementCapabilities_4017(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementSettingData_4018(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_EnabledLogicalElement_RemoteAccessAvailableToElement_4027(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Service_ServiceAccessBySAP_4030(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Service_ServiceComponents_4031(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Service_ServiceServiceDependency_4032(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedSystemElement_StatusDescriptions_4035(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Service_SoftwareFeatureServiceImplementation_4068(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getRoutingPolicy_2005ContainedLinks(View view) {
		RoutingPolicy modelElement = (RoutingPolicy) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Components_4011(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementCapabilities_4017(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementSettingData_4018(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedSystemElement_StatusDescriptions_4035(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getEnabledLogicalElementCapabilities_2006ContainedLinks(
			View view) {
		EnabledLogicalElementCapabilities modelElement = (EnabledLogicalElementCapabilities) view
				.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Components_4011(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementCapabilities_4017(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementSettingData_4018(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getBufferPool_2007ContainedLinks(View view) {
		BufferPool modelElement = (BufferPool) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Components_4011(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementCapabilities_4017(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementSettingData_4018(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Collection_Members_4042(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getMPLSProtocolEndpoint_2008ContainedLinks(View view) {
		MPLSProtocolEndpoint modelElement = (MPLSProtocolEndpoint) view
				.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ServiceAccessPoint_BindsTo_4010(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Components_4011(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementCapabilities_4017(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementSettingData_4018(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_EnabledLogicalElement_RemoteAccessAvailableToElement_4027(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ServiceAccessPoint_SAPSAPDependency_4029(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedSystemElement_StatusDescriptions_4035(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ServiceAccessPoint_BindsToLANEndpoint_4045(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ProtocolEndpoint_EgressConditioningServiceOnEndpoint_4047(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ProtocolEndpoint_IngressConditioningServiceOnEndpoint_4055(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getAutonomousSystem_2009ContainedLinks(View view) {
		AutonomousSystem modelElement = (AutonomousSystem) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Components_4011(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_AdminDomain_ContainedDomain_4012(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementCapabilities_4017(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementSettingData_4018(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_System_HostedAccessPoint_4020(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_System_HostedCollection_4021(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_System_HostedServices_4023(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_EnabledLogicalElement_RemoteAccessAvailableToElement_4027(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_System_Roles_4028(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedSystemElement_StatusDescriptions_4035(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_System_SystemComponents_4036(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_System_SystemDevices_4037(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_System_HostedRoute_4053(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_AdminDomain_NetworksInAdminDomain_4059(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_AutonomousSystem_RouterInAS_4063(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_AutonomousSystem_RoutingProtocolDomainInAS_4066(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getDNSSettingData_2010ContainedLinks(View view) {
		DNSSettingData modelElement = (DNSSettingData) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Components_4011(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementCapabilities_4017(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementSettingData_4018(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_SettingData_SettingsDefineCapabilities_4034(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getUniModem_2011ContainedLinks(View view) {
		UniModem modelElement = (UniModem) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Components_4011(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_LogicalDevice_DeviceConnection_4014(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_LogicalDevice_DeviceIdentity_4015(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_LogicalDevice_DeviceSAPImplementation_4016(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementCapabilities_4017(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementSettingData_4018(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_EnabledLogicalElement_RemoteAccessAvailableToElement_4027(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedSystemElement_StatusDescriptions_4035(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_LogicalDevice_PortOnDevice_4061(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getEFService_2012ContainedLinks(View view) {
		EFService modelElement = (EFService) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Components_4011(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementCapabilities_4017(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementSettingData_4018(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_EnabledLogicalElement_RemoteAccessAvailableToElement_4027(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Service_ServiceAccessBySAP_4030(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Service_ServiceComponents_4031(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Service_ServiceServiceDependency_4032(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedSystemElement_StatusDescriptions_4035(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_QoSService_QoSConditioningSubService_4040(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_QoSService_QoSSubService_4041(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Service_SoftwareFeatureServiceImplementation_4068(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getIPSubnet_2013ContainedLinks(View view) {
		IPSubnet modelElement = (IPSubnet) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Components_4011(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementCapabilities_4017(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementSettingData_4018(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Collection_Members_4042(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_LogicalNetwork_InLogicalNetwork_4056(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getNamedAddressCollection_2014ContainedLinks(View view) {
		NamedAddressCollection modelElement = (NamedAddressCollection) view
				.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Components_4011(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementCapabilities_4017(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementSettingData_4018(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Collection_Members_4042(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getBIOSElement_2015ContainedLinks(View view) {
		BIOSElement modelElement = (BIOSElement) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_SoftwareElement_SoftwareElementActions_4003(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_SoftwareElement_SoftwareElementChecks_4004(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Components_4011(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementCapabilities_4017(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementSettingData_4018(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedSystemElement_StatusDescriptions_4035(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getTelnetSettingData_2016ContainedLinks(View view) {
		TelnetSettingData modelElement = (TelnetSettingData) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Components_4011(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementCapabilities_4017(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementSettingData_4018(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_SettingData_SettingsDefineCapabilities_4034(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getBGPPeerGroup_2017ContainedLinks(View view) {
		BGPPeerGroup modelElement = (BGPPeerGroup) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Components_4011(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementCapabilities_4017(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementSettingData_4018(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Collection_Members_4042(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getLANConnectivitySegment_2018ContainedLinks(View view) {
		LANConnectivitySegment modelElement = (LANConnectivitySegment) view
				.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Components_4011(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementCapabilities_4017(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementSettingData_4018(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Collection_Members_4042(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getCableModem_2019ContainedLinks(View view) {
		CableModem modelElement = (CableModem) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Components_4011(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_LogicalDevice_DeviceConnection_4014(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_LogicalDevice_DeviceIdentity_4015(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_LogicalDevice_DeviceSAPImplementation_4016(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementCapabilities_4017(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementSettingData_4018(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_EnabledLogicalElement_RemoteAccessAvailableToElement_4027(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedSystemElement_StatusDescriptions_4035(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_LogicalDevice_PortOnDevice_4061(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getSwitchPort_2020ContainedLinks(View view) {
		SwitchPort modelElement = (SwitchPort) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ServiceAccessPoint_BindsTo_4010(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Components_4011(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementCapabilities_4017(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementSettingData_4018(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_EnabledLogicalElement_RemoteAccessAvailableToElement_4027(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ServiceAccessPoint_SAPSAPDependency_4029(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedSystemElement_StatusDescriptions_4035(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ServiceAccessPoint_BindsToLANEndpoint_4045(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ProtocolEndpoint_EgressConditioningServiceOnEndpoint_4047(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ProtocolEndpoint_IngressConditioningServiceOnEndpoint_4055(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getTCPProtocolEndpoint_2021ContainedLinks(View view) {
		TCPProtocolEndpoint modelElement = (TCPProtocolEndpoint) view
				.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ServiceAccessPoint_BindsTo_4010(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Components_4011(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementCapabilities_4017(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementSettingData_4018(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_EnabledLogicalElement_RemoteAccessAvailableToElement_4027(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ServiceAccessPoint_SAPSAPDependency_4029(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedSystemElement_StatusDescriptions_4035(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ServiceAccessPoint_BindsToLANEndpoint_4045(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ProtocolEndpoint_EgressConditioningServiceOnEndpoint_4047(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ProtocolEndpoint_IngressConditioningServiceOnEndpoint_4055(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getAdministrativeDistance_2022ContainedLinks(View view) {
		AdministrativeDistance modelElement = (AdministrativeDistance) view
				.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Components_4011(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementCapabilities_4017(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementSettingData_4018(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedSystemElement_StatusDescriptions_4035(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getIPConnectivitySubnet_2023ContainedLinks(View view) {
		IPConnectivitySubnet modelElement = (IPConnectivitySubnet) view
				.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Components_4011(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementCapabilities_4017(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementSettingData_4018(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Collection_Members_4042(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getVolatileStorage_2024ContainedLinks(View view) {
		VolatileStorage modelElement = (VolatileStorage) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Components_4011(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_LogicalDevice_DeviceConnection_4014(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_LogicalDevice_DeviceIdentity_4015(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_LogicalDevice_DeviceSAPImplementation_4016(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementCapabilities_4017(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementSettingData_4018(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_EnabledLogicalElement_RemoteAccessAvailableToElement_4027(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedSystemElement_StatusDescriptions_4035(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_LogicalDevice_PortOnDevice_4061(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getRangeOfIPAddresses_2025ContainedLinks(View view) {
		RangeOfIPAddresses modelElement = (RangeOfIPAddresses) view
				.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Components_4011(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementCapabilities_4017(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementSettingData_4018(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Collection_Members_4042(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getBGPProtocolEndpoint_2026ContainedLinks(View view) {
		BGPProtocolEndpoint modelElement = (BGPProtocolEndpoint) view
				.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ServiceAccessPoint_BindsTo_4010(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Components_4011(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementCapabilities_4017(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementSettingData_4018(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_EnabledLogicalElement_RemoteAccessAvailableToElement_4027(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ServiceAccessPoint_SAPSAPDependency_4029(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedSystemElement_StatusDescriptions_4035(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ServiceAccessPoint_BindsToLANEndpoint_4045(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ProtocolEndpoint_EgressConditioningServiceOnEndpoint_4047(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ProtocolEndpoint_IngressConditioningServiceOnEndpoint_4055(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getUnitaryComputerSystem_2027ContainedLinks(View view) {
		UnitaryComputerSystem modelElement = (UnitaryComputerSystem) view
				.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Components_4011(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementCapabilities_4017(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementSettingData_4018(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_System_HostedAccessPoint_4020(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_System_HostedCollection_4021(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_System_HostedServices_4023(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_EnabledLogicalElement_RemoteAccessAvailableToElement_4027(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_System_Roles_4028(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedSystemElement_StatusDescriptions_4035(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_System_SystemComponents_4036(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_System_SystemDevices_4037(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ComputerSystem_HostedFilterList_4051(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ComputerSystem_HostedForwardingServices_4052(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_System_HostedRoute_4053(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ComputerSystem_HostedRoutingPolicy_4054(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ComputerSystem_RunningOS_4067(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getEthernetPort_2028ContainedLinks(View view) {
		EthernetPort modelElement = (EthernetPort) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Components_4011(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_LogicalDevice_DeviceConnection_4014(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_LogicalDevice_DeviceIdentity_4015(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_LogicalDevice_DeviceSAPImplementation_4016(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementCapabilities_4017(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementSettingData_4018(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_EnabledLogicalElement_RemoteAccessAvailableToElement_4027(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedSystemElement_StatusDescriptions_4035(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_LogicalPort_PortImplementsEndPoint_4060(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_LogicalDevice_PortOnDevice_4061(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getSNMPService_2029ContainedLinks(View view) {
		SNMPService modelElement = (SNMPService) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Components_4011(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementCapabilities_4017(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementSettingData_4018(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_EnabledLogicalElement_RemoteAccessAvailableToElement_4027(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Service_ServiceAccessBySAP_4030(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Service_ServiceComponents_4031(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Service_ServiceServiceDependency_4032(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedSystemElement_StatusDescriptions_4035(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Service_SoftwareFeatureServiceImplementation_4068(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_SNMPService_TrapSourceForSNMPService_4070(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getLogicalModule_2030ContainedLinks(View view) {
		LogicalModule modelElement = (LogicalModule) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Components_4011(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_LogicalDevice_DeviceConnection_4014(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_LogicalDevice_DeviceIdentity_4015(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_LogicalDevice_DeviceSAPImplementation_4016(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementCapabilities_4017(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementSettingData_4018(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_EnabledLogicalElement_RemoteAccessAvailableToElement_4027(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedSystemElement_StatusDescriptions_4035(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_LogicalModule_ModulePort_4038(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_LogicalDevice_PortOnDevice_4061(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getNextHopIPRoute_2031ContainedLinks(View view) {
		NextHopIPRoute modelElement = (NextHopIPRoute) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Components_4011(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementCapabilities_4017(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementSettingData_4018(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_NextHopRoute_RouteUsesEndpoint_4065(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_NextHopRoute_AssociatedNextHop_4071(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getOperatingSystem_2032ContainedLinks(View view) {
		OperatingSystem modelElement = (OperatingSystem) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_OperatingSystem_OperatingSystemSoftwareFeature_4002(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Components_4011(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementCapabilities_4017(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementSettingData_4018(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_EnabledLogicalElement_RemoteAccessAvailableToElement_4027(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedSystemElement_StatusDescriptions_4035(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getSDSLModem_2033ContainedLinks(View view) {
		SDSLModem modelElement = (SDSLModem) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Components_4011(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_LogicalDevice_DeviceConnection_4014(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_LogicalDevice_DeviceIdentity_4015(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_LogicalDevice_DeviceSAPImplementation_4016(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementCapabilities_4017(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementSettingData_4018(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_EnabledLogicalElement_RemoteAccessAvailableToElement_4027(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedSystemElement_StatusDescriptions_4035(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_LogicalDevice_PortOnDevice_4061(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getWiFiEndPoint_2034ContainedLinks(View view) {
		WiFiEndPoint modelElement = (WiFiEndPoint) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ServiceAccessPoint_BindsTo_4010(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Components_4011(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementCapabilities_4017(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementSettingData_4018(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_EnabledLogicalElement_RemoteAccessAvailableToElement_4027(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ServiceAccessPoint_SAPSAPDependency_4029(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedSystemElement_StatusDescriptions_4035(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ServiceAccessPoint_BindsToLANEndpoint_4045(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ProtocolEndpoint_EgressConditioningServiceOnEndpoint_4047(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ProtocolEndpoint_IngressConditioningServiceOnEndpoint_4055(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getNATService_2035ContainedLinks(View view) {
		NATService modelElement = (NATService) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Components_4011(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementCapabilities_4017(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementSettingData_4018(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_EnabledLogicalElement_RemoteAccessAvailableToElement_4027(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Service_ServiceAccessBySAP_4030(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Service_ServiceComponents_4031(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Service_ServiceServiceDependency_4032(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedSystemElement_StatusDescriptions_4035(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ForwardingService_ForwardedRoutes_4049(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ForwardingService_ForwardsAmong_4050(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_NATService_NATServiceRunningOnEndpoint_4058(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ForwardingService_RouteForwardedByService_4062(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Service_SoftwareFeatureServiceImplementation_4068(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getADSLModem_2036ContainedLinks(View view) {
		ADSLModem modelElement = (ADSLModem) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Components_4011(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_LogicalDevice_DeviceConnection_4014(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_LogicalDevice_DeviceIdentity_4015(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_LogicalDevice_DeviceSAPImplementation_4016(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementCapabilities_4017(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementSettingData_4018(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_EnabledLogicalElement_RemoteAccessAvailableToElement_4027(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedSystemElement_StatusDescriptions_4035(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_LogicalDevice_PortOnDevice_4061(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getLogicalFile_2037ContainedLinks(View view) {
		LogicalFile modelElement = (LogicalFile) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Components_4011(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementCapabilities_4017(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementSettingData_4018(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedSystemElement_StatusDescriptions_4035(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getBGPCluster_2038ContainedLinks(View view) {
		BGPCluster modelElement = (BGPCluster) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_BGPCluster_ReflectorClientService_4007(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_BGPCluster_ReflectorNonClientService_4008(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_BGPCluster_ReflectorService_4009(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Components_4011(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementCapabilities_4017(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementSettingData_4018(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Collection_Members_4042(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_BGPCluster_RoutersInBGPCluster_4064(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getApplicationSystem_2039ContainedLinks(View view) {
		ApplicationSystem modelElement = (ApplicationSystem) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Components_4011(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementCapabilities_4017(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementSettingData_4018(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_System_HostedAccessPoint_4020(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_System_HostedCollection_4021(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_System_HostedServices_4023(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_EnabledLogicalElement_RemoteAccessAvailableToElement_4027(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_System_Roles_4028(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedSystemElement_StatusDescriptions_4035(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_System_SystemComponents_4036(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_System_SystemDevices_4037(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_System_HostedRoute_4053(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getSoftwareIdentity_2040ContainedLinks(View view) {
		SoftwareIdentity modelElement = (SoftwareIdentity) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Components_4011(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementCapabilities_4017(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementSettingData_4018(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_SoftwareIdentity_ElementSoftwareIdentity_4019(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedSystemElement_StatusDescriptions_4035(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getWirelessPort_2041ContainedLinks(View view) {
		WirelessPort modelElement = (WirelessPort) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Components_4011(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_LogicalDevice_DeviceConnection_4014(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_LogicalDevice_DeviceIdentity_4015(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_LogicalDevice_DeviceSAPImplementation_4016(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementCapabilities_4017(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementSettingData_4018(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_EnabledLogicalElement_RemoteAccessAvailableToElement_4027(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedSystemElement_StatusDescriptions_4035(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_LogicalPort_PortImplementsEndPoint_4060(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_LogicalDevice_PortOnDevice_4061(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getCLPSettingData_2042ContainedLinks(View view) {
		CLPSettingData modelElement = (CLPSettingData) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Components_4011(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementCapabilities_4017(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementSettingData_4018(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_SettingData_SettingsDefineCapabilities_4034(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getGenericService_2043ContainedLinks(View view) {
		GenericService modelElement = (GenericService) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Components_4011(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementCapabilities_4017(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementSettingData_4018(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_EnabledLogicalElement_RemoteAccessAvailableToElement_4027(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Service_ServiceAccessBySAP_4030(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Service_ServiceComponents_4031(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Service_ServiceServiceDependency_4032(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedSystemElement_StatusDescriptions_4035(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Service_SoftwareFeatureServiceImplementation_4068(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getNATListBasedSettings_2044ContainedLinks(View view) {
		NATListBasedSettings modelElement = (NATListBasedSettings) view
				.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Components_4011(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementCapabilities_4017(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementSettingData_4018(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_SettingData_SettingsDefineCapabilities_4034(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_NATListBasedSettings_AddressesToBeTranslated_4043(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_NATListBasedSettings_TranslationPoolForNAT_4069(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getVDSLModem_2045ContainedLinks(View view) {
		VDSLModem modelElement = (VDSLModem) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Components_4011(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_LogicalDevice_DeviceConnection_4014(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_LogicalDevice_DeviceIdentity_4015(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_LogicalDevice_DeviceSAPImplementation_4016(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementCapabilities_4017(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementSettingData_4018(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_EnabledLogicalElement_RemoteAccessAvailableToElement_4027(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedSystemElement_StatusDescriptions_4035(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_LogicalDevice_PortOnDevice_4061(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getUSBPort_2046ContainedLinks(View view) {
		USBPort modelElement = (USBPort) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Components_4011(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_LogicalDevice_DeviceConnection_4014(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_LogicalDevice_DeviceIdentity_4015(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_LogicalDevice_DeviceSAPImplementation_4016(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementCapabilities_4017(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementSettingData_4018(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_EnabledLogicalElement_RemoteAccessAvailableToElement_4027(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedSystemElement_StatusDescriptions_4035(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_LogicalPort_PortImplementsEndPoint_4060(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_LogicalDevice_PortOnDevice_4061(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getDNSProtocolEndpoint_2047ContainedLinks(View view) {
		DNSProtocolEndpoint modelElement = (DNSProtocolEndpoint) view
				.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ServiceAccessPoint_BindsTo_4010(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Components_4011(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementCapabilities_4017(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementSettingData_4018(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_EnabledLogicalElement_RemoteAccessAvailableToElement_4027(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ServiceAccessPoint_SAPSAPDependency_4029(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedSystemElement_StatusDescriptions_4035(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ServiceAccessPoint_BindsToLANEndpoint_4045(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ProtocolEndpoint_EgressConditioningServiceOnEndpoint_4047(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ProtocolEndpoint_IngressConditioningServiceOnEndpoint_4055(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getWiFiEndpointSettings_2048ContainedLinks(View view) {
		WiFiEndpointSettings modelElement = (WiFiEndpointSettings) view
				.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Components_4011(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementCapabilities_4017(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementSettingData_4018(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_SettingData_SettingsDefineCapabilities_4034(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getSSHSettingData_2049ContainedLinks(View view) {
		SSHSettingData modelElement = (SSHSettingData) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Components_4011(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementCapabilities_4017(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementSettingData_4018(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_SettingData_SettingsDefineCapabilities_4034(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getWirelessLANEndpoint_2050ContainedLinks(View view) {
		WirelessLANEndpoint modelElement = (WirelessLANEndpoint) view
				.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ServiceAccessPoint_BindsTo_4010(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Components_4011(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementCapabilities_4017(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementSettingData_4018(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_EnabledLogicalElement_RemoteAccessAvailableToElement_4027(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ServiceAccessPoint_SAPSAPDependency_4029(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedSystemElement_StatusDescriptions_4035(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ServiceAccessPoint_BindsToLANEndpoint_4045(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ProtocolEndpoint_EgressConditioningServiceOnEndpoint_4047(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ProtocolEndpoint_IngressConditioningServiceOnEndpoint_4055(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getDHCPProtocolEndpoint_2051ContainedLinks(View view) {
		DHCPProtocolEndpoint modelElement = (DHCPProtocolEndpoint) view
				.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ServiceAccessPoint_BindsTo_4010(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Components_4011(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementCapabilities_4017(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementSettingData_4018(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_EnabledLogicalElement_RemoteAccessAvailableToElement_4027(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ServiceAccessPoint_SAPSAPDependency_4029(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedSystemElement_StatusDescriptions_4035(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ServiceAccessPoint_BindsToLANEndpoint_4045(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ProtocolEndpoint_EgressConditioningServiceOnEndpoint_4047(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ProtocolEndpoint_IngressConditioningServiceOnEndpoint_4055(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getIPHeadersFilter_2052ContainedLinks(View view) {
		IPHeadersFilter modelElement = (IPHeadersFilter) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Components_4011(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementCapabilities_4017(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementSettingData_4018(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedSystemElement_StatusDescriptions_4035(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getDirectory_2053ContainedLinks(View view) {
		Directory modelElement = (Directory) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Components_4011(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementCapabilities_4017(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementSettingData_4018(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedSystemElement_StatusDescriptions_4035(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getIPAddressRange_2054ContainedLinks(View view) {
		IPAddressRange modelElement = (IPAddressRange) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Components_4011(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementCapabilities_4017(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementSettingData_4018(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Collection_Members_4042(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getSNMPTrapTarget_2055ContainedLinks(View view) {
		SNMPTrapTarget modelElement = (SNMPTrapTarget) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ServiceAccessPoint_BindsTo_4010(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Components_4011(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementCapabilities_4017(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementSettingData_4018(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_EnabledLogicalElement_RemoteAccessAvailableToElement_4027(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ServiceAccessPoint_SAPSAPDependency_4029(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedSystemElement_StatusDescriptions_4035(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ServiceAccessPoint_BindsToLANEndpoint_4045(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getIPXConnectivityNetwork_2056ContainedLinks(View view) {
		IPXConnectivityNetwork modelElement = (IPXConnectivityNetwork) view
				.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Components_4011(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementCapabilities_4017(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementSettingData_4018(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Collection_Members_4042(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getConnectivityMemberhipSettingData_2057ContainedLinks(
			View view) {
		ConnectivityMemberhipSettingData modelElement = (ConnectivityMemberhipSettingData) view
				.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Components_4011(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementCapabilities_4017(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementSettingData_4018(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_SettingData_SettingsDefineCapabilities_4034(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getConditioningService_2058ContainedLinks(View view) {
		ConditioningService modelElement = (ConditioningService) view
				.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Components_4011(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementCapabilities_4017(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementSettingData_4018(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_EnabledLogicalElement_RemoteAccessAvailableToElement_4027(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Service_ServiceAccessBySAP_4030(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Service_ServiceComponents_4031(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Service_ServiceServiceDependency_4032(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedSystemElement_StatusDescriptions_4035(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Service_SoftwareFeatureServiceImplementation_4068(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getBIOSFeature_2059ContainedLinks(View view) {
		BIOSFeature modelElement = (BIOSFeature) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Components_4011(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementCapabilities_4017(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementSettingData_4018(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedSystemElement_StatusDescriptions_4035(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getOSPFProtocolEndpoint_2060ContainedLinks(View view) {
		OSPFProtocolEndpoint modelElement = (OSPFProtocolEndpoint) view
				.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ServiceAccessPoint_BindsTo_4010(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Components_4011(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementCapabilities_4017(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementSettingData_4018(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_EnabledLogicalElement_RemoteAccessAvailableToElement_4027(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ServiceAccessPoint_SAPSAPDependency_4029(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedSystemElement_StatusDescriptions_4035(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ServiceAccessPoint_BindsToLANEndpoint_4045(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ProtocolEndpoint_EgressConditioningServiceOnEndpoint_4047(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ProtocolEndpoint_IngressConditioningServiceOnEndpoint_4055(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getFilterList_2061ContainedLinks(View view) {
		FilterList modelElement = (FilterList) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Components_4011(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementCapabilities_4017(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementSettingData_4018(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedSystemElement_StatusDescriptions_4035(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getBGPService_2062ContainedLinks(View view) {
		BGPService modelElement = (BGPService) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_BGPService_BGPPeerGroupServices_4006(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Components_4011(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementCapabilities_4017(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementSettingData_4018(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_EnabledLogicalElement_RemoteAccessAvailableToElement_4027(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Service_ServiceAccessBySAP_4030(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Service_ServiceComponents_4031(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Service_ServiceServiceDependency_4032(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedSystemElement_StatusDescriptions_4035(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_BGPService_BGPAdminDistance_4044(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_RouteCalculationService_CalculatesAmong_4046(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Service_SoftwareFeatureServiceImplementation_4068(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getPrecedenceService_2063ContainedLinks(View view) {
		PrecedenceService modelElement = (PrecedenceService) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Components_4011(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementCapabilities_4017(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementSettingData_4018(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_EnabledLogicalElement_RemoteAccessAvailableToElement_4027(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Service_ServiceAccessBySAP_4030(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Service_ServiceComponents_4031(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Service_ServiceServiceDependency_4032(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedSystemElement_StatusDescriptions_4035(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_QoSService_QoSConditioningSubService_4040(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_QoSService_QoSSubService_4041(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Service_SoftwareFeatureServiceImplementation_4068(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getDHCPCapabilities_2064ContainedLinks(View view) {
		DHCPCapabilities modelElement = (DHCPCapabilities) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Components_4011(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementCapabilities_4017(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementSettingData_4018(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getHdr8021PService_2065ContainedLinks(View view) {
		Hdr8021PService modelElement = (Hdr8021PService) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Components_4011(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementCapabilities_4017(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementSettingData_4018(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_EnabledLogicalElement_RemoteAccessAvailableToElement_4027(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Service_ServiceAccessBySAP_4030(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Service_ServiceComponents_4031(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Service_ServiceServiceDependency_4032(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedSystemElement_StatusDescriptions_4035(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_QoSService_QoSConditioningSubService_4040(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_QoSService_QoSSubService_4041(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Service_SoftwareFeatureServiceImplementation_4068(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getReplacementSet_2066ContainedLinks(View view) {
		ReplacementSet modelElement = (ReplacementSet) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Components_4011(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementCapabilities_4017(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementSettingData_4018(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Collection_Members_4042(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getHDSLModem_2067ContainedLinks(View view) {
		HDSLModem modelElement = (HDSLModem) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Components_4011(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_LogicalDevice_DeviceConnection_4014(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_LogicalDevice_DeviceIdentity_4015(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_LogicalDevice_DeviceSAPImplementation_4016(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementCapabilities_4017(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementSettingData_4018(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_EnabledLogicalElement_RemoteAccessAvailableToElement_4027(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedSystemElement_StatusDescriptions_4035(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_LogicalDevice_PortOnDevice_4061(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getServiceAccessURI_2068ContainedLinks(View view) {
		ServiceAccessURI modelElement = (ServiceAccessURI) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ServiceAccessPoint_BindsTo_4010(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Components_4011(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementCapabilities_4017(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementSettingData_4018(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_EnabledLogicalElement_RemoteAccessAvailableToElement_4027(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ServiceAccessPoint_SAPSAPDependency_4029(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedSystemElement_StatusDescriptions_4035(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ServiceAccessPoint_BindsToLANEndpoint_4045(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getFilterEntry_2069ContainedLinks(View view) {
		FilterEntry modelElement = (FilterEntry) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Components_4011(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementCapabilities_4017(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementSettingData_4018(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedSystemElement_StatusDescriptions_4035(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getSNMPCommunityStrings_2070ContainedLinks(View view) {
		SNMPCommunityStrings modelElement = (SNMPCommunityStrings) view
				.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ServiceAccessPoint_BindsTo_4010(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Components_4011(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementCapabilities_4017(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementSettingData_4018(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_EnabledLogicalElement_RemoteAccessAvailableToElement_4027(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ServiceAccessPoint_SAPSAPDependency_4029(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedSystemElement_StatusDescriptions_4035(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ServiceAccessPoint_BindsToLANEndpoint_4045(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getNetwork_2071ContainedLinks(View view) {
		Network modelElement = (Network) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Components_4011(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_AdminDomain_ContainedDomain_4012(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementCapabilities_4017(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementSettingData_4018(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_System_HostedAccessPoint_4020(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_System_HostedCollection_4021(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_System_HostedServices_4023(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_EnabledLogicalElement_RemoteAccessAvailableToElement_4027(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_System_Roles_4028(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedSystemElement_StatusDescriptions_4035(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_System_SystemComponents_4036(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_System_SystemDevices_4037(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_System_HostedRoute_4053(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_AdminDomain_NetworksInAdminDomain_4059(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getFileSpecification_2072ContainedLinks(View view) {
		FileSpecification modelElement = (FileSpecification) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Components_4011(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementCapabilities_4017(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementSettingData_4018(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getIPXNetwork_2073ContainedLinks(View view) {
		IPXNetwork modelElement = (IPXNetwork) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Components_4011(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementCapabilities_4017(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementSettingData_4018(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Collection_Members_4042(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_LogicalNetwork_InLogicalNetwork_4056(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getPowerManagementCapabilities_2074ContainedLinks(
			View view) {
		PowerManagementCapabilities modelElement = (PowerManagementCapabilities) view
				.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Components_4011(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementCapabilities_4017(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementSettingData_4018(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getFlowService_2075ContainedLinks(View view) {
		FlowService modelElement = (FlowService) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Components_4011(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementCapabilities_4017(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementSettingData_4018(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_EnabledLogicalElement_RemoteAccessAvailableToElement_4027(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Service_ServiceAccessBySAP_4030(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Service_ServiceComponents_4031(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Service_ServiceServiceDependency_4032(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedSystemElement_StatusDescriptions_4035(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_QoSService_QoSConditioningSubService_4040(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_QoSService_QoSSubService_4041(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Service_SoftwareFeatureServiceImplementation_4068(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getISDNModem_2076ContainedLinks(View view) {
		ISDNModem modelElement = (ISDNModem) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Components_4011(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_LogicalDevice_DeviceConnection_4014(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_LogicalDevice_DeviceIdentity_4015(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_LogicalDevice_DeviceSAPImplementation_4016(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementCapabilities_4017(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementSettingData_4018(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_EnabledLogicalElement_RemoteAccessAvailableToElement_4027(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedSystemElement_StatusDescriptions_4035(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_LogicalDevice_PortOnDevice_4061(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getIPXProtocolEndpoint_2077ContainedLinks(View view) {
		IPXProtocolEndpoint modelElement = (IPXProtocolEndpoint) view
				.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ServiceAccessPoint_BindsTo_4010(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Components_4011(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementCapabilities_4017(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementSettingData_4018(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_EnabledLogicalElement_RemoteAccessAvailableToElement_4027(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ServiceAccessPoint_SAPSAPDependency_4029(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedSystemElement_StatusDescriptions_4035(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ServiceAccessPoint_BindsToLANEndpoint_4045(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ProtocolEndpoint_EgressConditioningServiceOnEndpoint_4047(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ProtocolEndpoint_IngressConditioningServiceOnEndpoint_4055(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getIPProtocolEndpoint_2078ContainedLinks(View view) {
		IPProtocolEndpoint modelElement = (IPProtocolEndpoint) view
				.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ServiceAccessPoint_BindsTo_4010(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Components_4011(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementCapabilities_4017(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementSettingData_4018(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_EnabledLogicalElement_RemoteAccessAvailableToElement_4027(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ServiceAccessPoint_SAPSAPDependency_4029(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedSystemElement_StatusDescriptions_4035(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ServiceAccessPoint_BindsToLANEndpoint_4045(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ProtocolEndpoint_EgressConditioningServiceOnEndpoint_4047(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ProtocolEndpoint_IngressConditioningServiceOnEndpoint_4055(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getUDPProtocolEndpoint_2079ContainedLinks(View view) {
		UDPProtocolEndpoint modelElement = (UDPProtocolEndpoint) view
				.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ServiceAccessPoint_BindsTo_4010(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Components_4011(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementCapabilities_4017(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementSettingData_4018(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_EnabledLogicalElement_RemoteAccessAvailableToElement_4027(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ServiceAccessPoint_SAPSAPDependency_4029(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedSystemElement_StatusDescriptions_4035(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ServiceAccessPoint_BindsToLANEndpoint_4045(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ProtocolEndpoint_EgressConditioningServiceOnEndpoint_4047(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ProtocolEndpoint_IngressConditioningServiceOnEndpoint_4055(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getProduct_2080ContainedLinks(View view) {
		Product modelElement = (Product) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Components_4011(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementCapabilities_4017(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementSettingData_4018(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Product_ProductProductDependency_4025(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Product_ProductServiceComponent_4026(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getMemoryCapacity_2081ContainedLinks(View view) {
		MemoryCapacity modelElement = (MemoryCapacity) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Components_4011(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementCapabilities_4017(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementSettingData_4018(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getRoutingProtocolDomain_2082ContainedLinks(View view) {
		RoutingProtocolDomain modelElement = (RoutingProtocolDomain) view
				.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Components_4011(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_AdminDomain_ContainedDomain_4012(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementCapabilities_4017(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementSettingData_4018(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_System_HostedAccessPoint_4020(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_System_HostedCollection_4021(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_System_HostedServices_4023(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_EnabledLogicalElement_RemoteAccessAvailableToElement_4027(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_System_Roles_4028(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedSystemElement_StatusDescriptions_4035(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_System_SystemComponents_4036(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_System_SystemDevices_4037(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_System_HostedRoute_4053(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_AdminDomain_NetworksInAdminDomain_4059(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getAFService_2083ContainedLinks(View view) {
		AFService modelElement = (AFService) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Components_4011(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementCapabilities_4017(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementSettingData_4018(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_EnabledLogicalElement_RemoteAccessAvailableToElement_4027(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Service_ServiceAccessBySAP_4030(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Service_ServiceComponents_4031(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Service_ServiceServiceDependency_4032(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedSystemElement_StatusDescriptions_4035(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_AFService_AFRelatedServices_4039(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_QoSService_QoSConditioningSubService_4040(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_QoSService_QoSSubService_4041(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Service_SoftwareFeatureServiceImplementation_4068(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getLANSegment_2084ContainedLinks(View view) {
		LANSegment modelElement = (LANSegment) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Components_4011(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementCapabilities_4017(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementSettingData_4018(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Collection_Members_4042(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_LogicalNetwork_InLogicalNetwork_4056(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_LANSegment_InSegment_4057(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getNATStaticSettings_2085ContainedLinks(View view) {
		NATStaticSettings modelElement = (NATStaticSettings) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Components_4011(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementCapabilities_4017(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementSettingData_4018(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_SettingData_SettingsDefineCapabilities_4034(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getTelnetProtocolEndpoint_2086ContainedLinks(View view) {
		TelnetProtocolEndpoint modelElement = (TelnetProtocolEndpoint) view
				.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ServiceAccessPoint_BindsTo_4010(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Components_4011(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementCapabilities_4017(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementSettingData_4018(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_EnabledLogicalElement_RemoteAccessAvailableToElement_4027(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ServiceAccessPoint_SAPSAPDependency_4029(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedSystemElement_StatusDescriptions_4035(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ServiceAccessPoint_BindsToLANEndpoint_4045(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ProtocolEndpoint_EgressConditioningServiceOnEndpoint_4047(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ProtocolEndpoint_IngressConditioningServiceOnEndpoint_4055(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getLANEndpoint_2087ContainedLinks(View view) {
		LANEndpoint modelElement = (LANEndpoint) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ServiceAccessPoint_BindsTo_4010(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Components_4011(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementCapabilities_4017(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementSettingData_4018(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_EnabledLogicalElement_RemoteAccessAvailableToElement_4027(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ServiceAccessPoint_SAPSAPDependency_4029(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedSystemElement_StatusDescriptions_4035(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ServiceAccessPoint_BindsToLANEndpoint_4045(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ProtocolEndpoint_EgressConditioningServiceOnEndpoint_4047(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ProtocolEndpoint_IngressConditioningServiceOnEndpoint_4055(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getDropThresholdCalculationService_2088ContainedLinks(
			View view) {
		DropThresholdCalculationService modelElement = (DropThresholdCalculationService) view
				.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Components_4011(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementCapabilities_4017(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementSettingData_4018(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_EnabledLogicalElement_RemoteAccessAvailableToElement_4027(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Service_ServiceAccessBySAP_4030(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Service_ServiceComponents_4031(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Service_ServiceServiceDependency_4032(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedSystemElement_StatusDescriptions_4035(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Service_SoftwareFeatureServiceImplementation_4068(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getAdminDomain_2089ContainedLinks(View view) {
		AdminDomain modelElement = (AdminDomain) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Components_4011(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_AdminDomain_ContainedDomain_4012(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementCapabilities_4017(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementSettingData_4018(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_System_HostedAccessPoint_4020(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_System_HostedCollection_4021(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_System_HostedServices_4023(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_EnabledLogicalElement_RemoteAccessAvailableToElement_4027(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_System_Roles_4028(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedSystemElement_StatusDescriptions_4035(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_System_SystemComponents_4036(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_System_SystemDevices_4037(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_System_HostedRoute_4053(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_AdminDomain_NetworksInAdminDomain_4059(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getSystemSpecificCollection_2090ContainedLinks(View view) {
		SystemSpecificCollection modelElement = (SystemSpecificCollection) view
				.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Components_4011(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementCapabilities_4017(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementSettingData_4018(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Collection_Members_4042(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getNextHopRouting_2091ContainedLinks(View view) {
		NextHopRouting modelElement = (NextHopRouting) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Components_4011(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementCapabilities_4017(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementSettingData_4018(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedSystemElement_StatusDescriptions_4035(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getComputerSystem_2092ContainedLinks(View view) {
		ComputerSystem modelElement = (ComputerSystem) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Components_4011(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementCapabilities_4017(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementSettingData_4018(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_System_HostedAccessPoint_4020(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_System_HostedCollection_4021(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_System_HostedServices_4023(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_EnabledLogicalElement_RemoteAccessAvailableToElement_4027(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_System_Roles_4028(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedSystemElement_StatusDescriptions_4035(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_System_SystemComponents_4036(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_System_SystemDevices_4037(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ComputerSystem_HostedFilterList_4051(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ComputerSystem_HostedForwardingServices_4052(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_System_HostedRoute_4053(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ComputerSystem_HostedRoutingPolicy_4054(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ComputerSystem_RunningOS_4067(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getNetworkPort_2093ContainedLinks(View view) {
		NetworkPort modelElement = (NetworkPort) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Components_4011(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_LogicalDevice_DeviceConnection_4014(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_LogicalDevice_DeviceIdentity_4015(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_LogicalDevice_DeviceSAPImplementation_4016(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementCapabilities_4017(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementSettingData_4018(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_EnabledLogicalElement_RemoteAccessAvailableToElement_4027(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedSystemElement_StatusDescriptions_4035(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_LogicalPort_PortImplementsEndPoint_4060(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_LogicalDevice_PortOnDevice_4061(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getRemoteServiceAccessPoint_2094ContainedLinks(View view) {
		RemoteServiceAccessPoint modelElement = (RemoteServiceAccessPoint) view
				.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ServiceAccessPoint_BindsTo_4010(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Components_4011(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementCapabilities_4017(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementSettingData_4018(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_EnabledLogicalElement_RemoteAccessAvailableToElement_4027(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ServiceAccessPoint_SAPSAPDependency_4029(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedSystemElement_StatusDescriptions_4035(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ServiceAccessPoint_BindsToLANEndpoint_4045(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getUSBDevice_2001IncomingLinks(View view) {
		USBDevice modelElement = (USBDevice) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_Components_4011(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_LogicalDevice_DeviceConnection_4014(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_LogicalDevice_DeviceIdentity_4015(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ElementSoftwareIdentity_ManagedElement_4024(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_System_SystemComponents_4036(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_System_SystemDevices_4037(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_Collection_Members_4042(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_CIM_Model_Elements_4048(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getOSPFVirtualInterface_2002IncomingLinks(View view) {
		OSPFVirtualInterface modelElement = (OSPFVirtualInterface) view
				.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result
				.addAll(getIncomingFeatureModelFacetLinks_ServiceAccessPoint_BindsTo_4010(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_Components_4011(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_LogicalDevice_DeviceSAPImplementation_4016(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_System_HostedAccessPoint_4020(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ElementSoftwareIdentity_ManagedElement_4024(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ServiceAccessPoint_SAPSAPDependency_4029(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_Service_ServiceAccessBySAP_4030(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_System_SystemComponents_4036(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_Collection_Members_4042(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_RouteCalculationService_CalculatesAmong_4046(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_CIM_Model_Elements_4048(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ForwardingService_ForwardsAmong_4050(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_LogicalNetwork_InLogicalNetwork_4056(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_NATService_NATServiceRunningOnEndpoint_4058(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_LogicalPort_PortImplementsEndPoint_4060(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_NextHopRoute_RouteUsesEndpoint_4065(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_SNMPService_TrapSourceForSNMPService_4070(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getWiFiPort_2003IncomingLinks(View view) {
		WiFiPort modelElement = (WiFiPort) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_Components_4011(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_LogicalDevice_DeviceConnection_4014(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_LogicalDevice_DeviceIdentity_4015(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ElementSoftwareIdentity_ManagedElement_4024(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_System_SystemComponents_4036(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_System_SystemDevices_4037(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_LogicalModule_ModulePort_4038(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_Collection_Members_4042(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_CIM_Model_Elements_4048(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_LogicalDevice_PortOnDevice_4061(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getProtocolService_2004IncomingLinks(View view) {
		ProtocolService modelElement = (ProtocolService) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_Components_4011(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_System_HostedServices_4023(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ElementSoftwareIdentity_ManagedElement_4024(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_Product_ProductServiceComponent_4026(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_Service_ServiceComponents_4031(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_Service_ServiceServiceDependency_4032(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_System_SystemComponents_4036(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_Collection_Members_4042(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_CIM_Model_Elements_4048(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getRoutingPolicy_2005IncomingLinks(View view) {
		RoutingPolicy modelElement = (RoutingPolicy) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_Components_4011(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ElementSoftwareIdentity_ManagedElement_4024(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_System_SystemComponents_4036(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_Collection_Members_4042(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_CIM_Model_Elements_4048(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ComputerSystem_HostedRoutingPolicy_4054(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getEnabledLogicalElementCapabilities_2006IncomingLinks(
			View view) {
		EnabledLogicalElementCapabilities modelElement = (EnabledLogicalElementCapabilities) view
				.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_Components_4011(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_ElementCapabilities_4017(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ElementSoftwareIdentity_ManagedElement_4024(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_SettingData_SettingsDefineCapabilities_4034(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_System_SystemComponents_4036(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_Collection_Members_4042(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_CIM_Model_Elements_4048(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getBufferPool_2007IncomingLinks(View view) {
		BufferPool modelElement = (BufferPool) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_Components_4011(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ElementSoftwareIdentity_ManagedElement_4024(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_System_SystemComponents_4036(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_Collection_Members_4042(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_CIM_Model_Elements_4048(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getMPLSProtocolEndpoint_2008IncomingLinks(View view) {
		MPLSProtocolEndpoint modelElement = (MPLSProtocolEndpoint) view
				.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result
				.addAll(getIncomingFeatureModelFacetLinks_ServiceAccessPoint_BindsTo_4010(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_Components_4011(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_LogicalDevice_DeviceSAPImplementation_4016(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_System_HostedAccessPoint_4020(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ElementSoftwareIdentity_ManagedElement_4024(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ServiceAccessPoint_SAPSAPDependency_4029(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_Service_ServiceAccessBySAP_4030(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_System_SystemComponents_4036(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_Collection_Members_4042(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_RouteCalculationService_CalculatesAmong_4046(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_CIM_Model_Elements_4048(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ForwardingService_ForwardsAmong_4050(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_LogicalNetwork_InLogicalNetwork_4056(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_NATService_NATServiceRunningOnEndpoint_4058(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_LogicalPort_PortImplementsEndPoint_4060(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_NextHopRoute_RouteUsesEndpoint_4065(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_SNMPService_TrapSourceForSNMPService_4070(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getAutonomousSystem_2009IncomingLinks(View view) {
		AutonomousSystem modelElement = (AutonomousSystem) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_Components_4011(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_AdminDomain_ContainedDomain_4012(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ElementSoftwareIdentity_ManagedElement_4024(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_System_SystemComponents_4036(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_Collection_Members_4042(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_CIM_Model_Elements_4048(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getDNSSettingData_2010IncomingLinks(View view) {
		DNSSettingData modelElement = (DNSSettingData) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_Components_4011(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ElementSoftwareIdentity_ManagedElement_4024(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ElementSettingData_SettingData_4033(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_System_SystemComponents_4036(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_Collection_Members_4042(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_CIM_Model_Elements_4048(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getUniModem_2011IncomingLinks(View view) {
		UniModem modelElement = (UniModem) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_Components_4011(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_LogicalDevice_DeviceConnection_4014(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_LogicalDevice_DeviceIdentity_4015(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ElementSoftwareIdentity_ManagedElement_4024(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_System_SystemComponents_4036(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_System_SystemDevices_4037(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_Collection_Members_4042(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_CIM_Model_Elements_4048(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getEFService_2012IncomingLinks(View view) {
		EFService modelElement = (EFService) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_Components_4011(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_System_HostedServices_4023(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ElementSoftwareIdentity_ManagedElement_4024(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_Product_ProductServiceComponent_4026(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_Service_ServiceComponents_4031(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_Service_ServiceServiceDependency_4032(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_System_SystemComponents_4036(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_QoSService_QoSSubService_4041(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_Collection_Members_4042(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_CIM_Model_Elements_4048(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getIPSubnet_2013IncomingLinks(View view) {
		IPSubnet modelElement = (IPSubnet) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_Components_4011(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ElementSoftwareIdentity_ManagedElement_4024(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_System_SystemComponents_4036(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_Collection_Members_4042(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_CIM_Model_Elements_4048(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_AdminDomain_NetworksInAdminDomain_4059(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getNamedAddressCollection_2014IncomingLinks(View view) {
		NamedAddressCollection modelElement = (NamedAddressCollection) view
				.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_Components_4011(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_System_HostedCollection_4021(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ElementSoftwareIdentity_ManagedElement_4024(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_System_SystemComponents_4036(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_Collection_Members_4042(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_CIM_Model_Elements_4048(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getBIOSElement_2015IncomingLinks(View view) {
		BIOSElement modelElement = (BIOSElement) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result
				.addAll(getIncomingFeatureModelFacetLinks_InstalledProduct_SoftwareElements_4005(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_Components_4011(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ElementSoftwareIdentity_ManagedElement_4024(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_System_SystemComponents_4036(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_Collection_Members_4042(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_CIM_Model_Elements_4048(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getTelnetSettingData_2016IncomingLinks(View view) {
		TelnetSettingData modelElement = (TelnetSettingData) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_Components_4011(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ElementSoftwareIdentity_ManagedElement_4024(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ElementSettingData_SettingData_4033(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_System_SystemComponents_4036(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_Collection_Members_4042(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_CIM_Model_Elements_4048(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getBGPPeerGroup_2017IncomingLinks(View view) {
		BGPPeerGroup modelElement = (BGPPeerGroup) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result
				.addAll(getIncomingFeatureModelFacetLinks_BGPService_BGPPeerGroupServices_4006(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_Components_4011(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ElementSoftwareIdentity_ManagedElement_4024(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_System_SystemComponents_4036(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_Collection_Members_4042(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_CIM_Model_Elements_4048(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getLANConnectivitySegment_2018IncomingLinks(View view) {
		LANConnectivitySegment modelElement = (LANConnectivitySegment) view
				.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_Components_4011(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_System_HostedCollection_4021(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ElementSoftwareIdentity_ManagedElement_4024(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_System_SystemComponents_4036(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_Collection_Members_4042(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_CIM_Model_Elements_4048(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getCableModem_2019IncomingLinks(View view) {
		CableModem modelElement = (CableModem) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_Components_4011(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_LogicalDevice_DeviceConnection_4014(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_LogicalDevice_DeviceIdentity_4015(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ElementSoftwareIdentity_ManagedElement_4024(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_System_SystemComponents_4036(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_System_SystemDevices_4037(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_Collection_Members_4042(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_CIM_Model_Elements_4048(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getSwitchPort_2020IncomingLinks(View view) {
		SwitchPort modelElement = (SwitchPort) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result
				.addAll(getIncomingFeatureModelFacetLinks_ServiceAccessPoint_BindsTo_4010(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_Components_4011(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_LogicalDevice_DeviceSAPImplementation_4016(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_System_HostedAccessPoint_4020(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ElementSoftwareIdentity_ManagedElement_4024(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ServiceAccessPoint_SAPSAPDependency_4029(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_Service_ServiceAccessBySAP_4030(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_System_SystemComponents_4036(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_Collection_Members_4042(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_RouteCalculationService_CalculatesAmong_4046(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_CIM_Model_Elements_4048(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ForwardingService_ForwardsAmong_4050(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_LogicalNetwork_InLogicalNetwork_4056(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_NATService_NATServiceRunningOnEndpoint_4058(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_LogicalPort_PortImplementsEndPoint_4060(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_NextHopRoute_RouteUsesEndpoint_4065(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_SNMPService_TrapSourceForSNMPService_4070(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getTCPProtocolEndpoint_2021IncomingLinks(View view) {
		TCPProtocolEndpoint modelElement = (TCPProtocolEndpoint) view
				.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result
				.addAll(getIncomingFeatureModelFacetLinks_ServiceAccessPoint_BindsTo_4010(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_Components_4011(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_LogicalDevice_DeviceSAPImplementation_4016(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_System_HostedAccessPoint_4020(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ElementSoftwareIdentity_ManagedElement_4024(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ServiceAccessPoint_SAPSAPDependency_4029(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_Service_ServiceAccessBySAP_4030(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_System_SystemComponents_4036(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_Collection_Members_4042(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_RouteCalculationService_CalculatesAmong_4046(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_CIM_Model_Elements_4048(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ForwardingService_ForwardsAmong_4050(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_LogicalNetwork_InLogicalNetwork_4056(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_NATService_NATServiceRunningOnEndpoint_4058(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_LogicalPort_PortImplementsEndPoint_4060(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_NextHopRoute_RouteUsesEndpoint_4065(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_SNMPService_TrapSourceForSNMPService_4070(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getAdministrativeDistance_2022IncomingLinks(View view) {
		AdministrativeDistance modelElement = (AdministrativeDistance) view
				.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_Components_4011(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ElementSoftwareIdentity_ManagedElement_4024(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_System_SystemComponents_4036(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_Collection_Members_4042(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_BGPService_BGPAdminDistance_4044(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_CIM_Model_Elements_4048(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getIPConnectivitySubnet_2023IncomingLinks(View view) {
		IPConnectivitySubnet modelElement = (IPConnectivitySubnet) view
				.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_Components_4011(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_System_HostedCollection_4021(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ElementSoftwareIdentity_ManagedElement_4024(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_System_SystemComponents_4036(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_Collection_Members_4042(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_CIM_Model_Elements_4048(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getVolatileStorage_2024IncomingLinks(View view) {
		VolatileStorage modelElement = (VolatileStorage) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_Components_4011(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_LogicalDevice_DeviceConnection_4014(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_LogicalDevice_DeviceIdentity_4015(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ElementSoftwareIdentity_ManagedElement_4024(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_System_SystemComponents_4036(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_System_SystemDevices_4037(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_Collection_Members_4042(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_CIM_Model_Elements_4048(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getRangeOfIPAddresses_2025IncomingLinks(View view) {
		RangeOfIPAddresses modelElement = (RangeOfIPAddresses) view
				.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_Components_4011(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_System_HostedCollection_4021(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ElementSoftwareIdentity_ManagedElement_4024(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_System_SystemComponents_4036(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_Collection_Members_4042(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_CIM_Model_Elements_4048(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_NATListBasedSettings_TranslationPoolForNAT_4069(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getBGPProtocolEndpoint_2026IncomingLinks(View view) {
		BGPProtocolEndpoint modelElement = (BGPProtocolEndpoint) view
				.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result
				.addAll(getIncomingFeatureModelFacetLinks_ServiceAccessPoint_BindsTo_4010(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_Components_4011(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_LogicalDevice_DeviceSAPImplementation_4016(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_System_HostedAccessPoint_4020(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ElementSoftwareIdentity_ManagedElement_4024(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ServiceAccessPoint_SAPSAPDependency_4029(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_Service_ServiceAccessBySAP_4030(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_System_SystemComponents_4036(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_Collection_Members_4042(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_RouteCalculationService_CalculatesAmong_4046(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_CIM_Model_Elements_4048(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ForwardingService_ForwardsAmong_4050(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_LogicalNetwork_InLogicalNetwork_4056(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_NATService_NATServiceRunningOnEndpoint_4058(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_LogicalPort_PortImplementsEndPoint_4060(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_NextHopRoute_RouteUsesEndpoint_4065(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_SNMPService_TrapSourceForSNMPService_4070(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getUnitaryComputerSystem_2027IncomingLinks(View view) {
		UnitaryComputerSystem modelElement = (UnitaryComputerSystem) view
				.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_Components_4011(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ElementSoftwareIdentity_ManagedElement_4024(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_System_SystemComponents_4036(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_Collection_Members_4042(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_CIM_Model_Elements_4048(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_AutonomousSystem_RouterInAS_4063(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_BGPCluster_RoutersInBGPCluster_4064(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getEthernetPort_2028IncomingLinks(View view) {
		EthernetPort modelElement = (EthernetPort) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_Components_4011(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_LogicalDevice_DeviceConnection_4014(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_LogicalDevice_DeviceIdentity_4015(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ElementSoftwareIdentity_ManagedElement_4024(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_System_SystemComponents_4036(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_System_SystemDevices_4037(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_LogicalModule_ModulePort_4038(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_Collection_Members_4042(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_CIM_Model_Elements_4048(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_LogicalDevice_PortOnDevice_4061(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getSNMPService_2029IncomingLinks(View view) {
		SNMPService modelElement = (SNMPService) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_Components_4011(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_System_HostedServices_4023(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ElementSoftwareIdentity_ManagedElement_4024(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_Product_ProductServiceComponent_4026(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_Service_ServiceComponents_4031(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_Service_ServiceServiceDependency_4032(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_System_SystemComponents_4036(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_Collection_Members_4042(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_CIM_Model_Elements_4048(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getLogicalModule_2030IncomingLinks(View view) {
		LogicalModule modelElement = (LogicalModule) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_Components_4011(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_LogicalDevice_DeviceConnection_4014(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_LogicalDevice_DeviceIdentity_4015(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ElementSoftwareIdentity_ManagedElement_4024(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_System_SystemComponents_4036(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_System_SystemDevices_4037(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_Collection_Members_4042(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_CIM_Model_Elements_4048(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getNextHopIPRoute_2031IncomingLinks(View view) {
		NextHopIPRoute modelElement = (NextHopIPRoute) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_Components_4011(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ElementSoftwareIdentity_ManagedElement_4024(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_System_SystemComponents_4036(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_Collection_Members_4042(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_CIM_Model_Elements_4048(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_System_HostedRoute_4053(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getOperatingSystem_2032IncomingLinks(View view) {
		OperatingSystem modelElement = (OperatingSystem) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_Components_4011(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ElementSoftwareIdentity_ManagedElement_4024(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_System_SystemComponents_4036(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_Collection_Members_4042(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_CIM_Model_Elements_4048(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ComputerSystem_RunningOS_4067(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getSDSLModem_2033IncomingLinks(View view) {
		SDSLModem modelElement = (SDSLModem) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_Components_4011(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_LogicalDevice_DeviceConnection_4014(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_LogicalDevice_DeviceIdentity_4015(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ElementSoftwareIdentity_ManagedElement_4024(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_System_SystemComponents_4036(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_System_SystemDevices_4037(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_Collection_Members_4042(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_CIM_Model_Elements_4048(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getWiFiEndPoint_2034IncomingLinks(View view) {
		WiFiEndPoint modelElement = (WiFiEndPoint) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result
				.addAll(getIncomingFeatureModelFacetLinks_ServiceAccessPoint_BindsTo_4010(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_Components_4011(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_LogicalDevice_DeviceSAPImplementation_4016(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_System_HostedAccessPoint_4020(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ElementSoftwareIdentity_ManagedElement_4024(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ServiceAccessPoint_SAPSAPDependency_4029(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_Service_ServiceAccessBySAP_4030(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_System_SystemComponents_4036(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_Collection_Members_4042(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_RouteCalculationService_CalculatesAmong_4046(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_CIM_Model_Elements_4048(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ForwardingService_ForwardsAmong_4050(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_LogicalNetwork_InLogicalNetwork_4056(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_NATService_NATServiceRunningOnEndpoint_4058(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_LogicalPort_PortImplementsEndPoint_4060(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_NextHopRoute_RouteUsesEndpoint_4065(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_SNMPService_TrapSourceForSNMPService_4070(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getNATService_2035IncomingLinks(View view) {
		NATService modelElement = (NATService) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_Components_4011(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_System_HostedServices_4023(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ElementSoftwareIdentity_ManagedElement_4024(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_Product_ProductServiceComponent_4026(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_Service_ServiceComponents_4031(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_Service_ServiceServiceDependency_4032(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_System_SystemComponents_4036(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_Collection_Members_4042(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_CIM_Model_Elements_4048(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ComputerSystem_HostedForwardingServices_4052(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getADSLModem_2036IncomingLinks(View view) {
		ADSLModem modelElement = (ADSLModem) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_Components_4011(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_LogicalDevice_DeviceConnection_4014(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_LogicalDevice_DeviceIdentity_4015(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ElementSoftwareIdentity_ManagedElement_4024(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_System_SystemComponents_4036(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_System_SystemDevices_4037(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_Collection_Members_4042(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_CIM_Model_Elements_4048(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getLogicalFile_2037IncomingLinks(View view) {
		LogicalFile modelElement = (LogicalFile) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_Components_4011(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ElementSoftwareIdentity_ManagedElement_4024(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_System_SystemComponents_4036(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_Collection_Members_4042(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_CIM_Model_Elements_4048(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getBGPCluster_2038IncomingLinks(View view) {
		BGPCluster modelElement = (BGPCluster) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_Components_4011(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ElementSoftwareIdentity_ManagedElement_4024(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_System_SystemComponents_4036(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_Collection_Members_4042(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_CIM_Model_Elements_4048(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getApplicationSystem_2039IncomingLinks(View view) {
		ApplicationSystem modelElement = (ApplicationSystem) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_Components_4011(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ElementSoftwareIdentity_ManagedElement_4024(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_System_SystemComponents_4036(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_Collection_Members_4042(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_CIM_Model_Elements_4048(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getSoftwareIdentity_2040IncomingLinks(View view) {
		SoftwareIdentity modelElement = (SoftwareIdentity) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_Components_4011(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ElementSoftwareIdentity_ManagedElement_4024(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_System_SystemComponents_4036(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_Collection_Members_4042(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_CIM_Model_Elements_4048(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getWirelessPort_2041IncomingLinks(View view) {
		WirelessPort modelElement = (WirelessPort) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_Components_4011(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_LogicalDevice_DeviceConnection_4014(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_LogicalDevice_DeviceIdentity_4015(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ElementSoftwareIdentity_ManagedElement_4024(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_System_SystemComponents_4036(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_System_SystemDevices_4037(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_LogicalModule_ModulePort_4038(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_Collection_Members_4042(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_CIM_Model_Elements_4048(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_LogicalDevice_PortOnDevice_4061(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getCLPSettingData_2042IncomingLinks(View view) {
		CLPSettingData modelElement = (CLPSettingData) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_Components_4011(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ElementSoftwareIdentity_ManagedElement_4024(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ElementSettingData_SettingData_4033(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_System_SystemComponents_4036(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_Collection_Members_4042(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_CIM_Model_Elements_4048(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getGenericService_2043IncomingLinks(View view) {
		GenericService modelElement = (GenericService) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_Components_4011(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_System_HostedServices_4023(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ElementSoftwareIdentity_ManagedElement_4024(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_Product_ProductServiceComponent_4026(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_Service_ServiceComponents_4031(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_Service_ServiceServiceDependency_4032(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_System_SystemComponents_4036(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_Collection_Members_4042(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_CIM_Model_Elements_4048(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getNATListBasedSettings_2044IncomingLinks(View view) {
		NATListBasedSettings modelElement = (NATListBasedSettings) view
				.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_Components_4011(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ElementSoftwareIdentity_ManagedElement_4024(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ElementSettingData_SettingData_4033(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_System_SystemComponents_4036(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_Collection_Members_4042(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_CIM_Model_Elements_4048(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getVDSLModem_2045IncomingLinks(View view) {
		VDSLModem modelElement = (VDSLModem) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_Components_4011(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_LogicalDevice_DeviceConnection_4014(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_LogicalDevice_DeviceIdentity_4015(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ElementSoftwareIdentity_ManagedElement_4024(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_System_SystemComponents_4036(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_System_SystemDevices_4037(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_Collection_Members_4042(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_CIM_Model_Elements_4048(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getUSBPort_2046IncomingLinks(View view) {
		USBPort modelElement = (USBPort) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_Components_4011(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_LogicalDevice_DeviceConnection_4014(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_LogicalDevice_DeviceIdentity_4015(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ElementSoftwareIdentity_ManagedElement_4024(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_System_SystemComponents_4036(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_System_SystemDevices_4037(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_Collection_Members_4042(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_CIM_Model_Elements_4048(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_LogicalDevice_PortOnDevice_4061(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getDNSProtocolEndpoint_2047IncomingLinks(View view) {
		DNSProtocolEndpoint modelElement = (DNSProtocolEndpoint) view
				.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result
				.addAll(getIncomingFeatureModelFacetLinks_ServiceAccessPoint_BindsTo_4010(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_Components_4011(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_LogicalDevice_DeviceSAPImplementation_4016(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_System_HostedAccessPoint_4020(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ElementSoftwareIdentity_ManagedElement_4024(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ServiceAccessPoint_SAPSAPDependency_4029(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_Service_ServiceAccessBySAP_4030(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_System_SystemComponents_4036(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_Collection_Members_4042(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_RouteCalculationService_CalculatesAmong_4046(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_CIM_Model_Elements_4048(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ForwardingService_ForwardsAmong_4050(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_LogicalNetwork_InLogicalNetwork_4056(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_NATService_NATServiceRunningOnEndpoint_4058(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_LogicalPort_PortImplementsEndPoint_4060(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_NextHopRoute_RouteUsesEndpoint_4065(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_SNMPService_TrapSourceForSNMPService_4070(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getWiFiEndpointSettings_2048IncomingLinks(View view) {
		WiFiEndpointSettings modelElement = (WiFiEndpointSettings) view
				.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_Components_4011(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ElementSoftwareIdentity_ManagedElement_4024(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ElementSettingData_SettingData_4033(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_System_SystemComponents_4036(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_Collection_Members_4042(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_CIM_Model_Elements_4048(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getSSHSettingData_2049IncomingLinks(View view) {
		SSHSettingData modelElement = (SSHSettingData) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_Components_4011(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ElementSoftwareIdentity_ManagedElement_4024(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ElementSettingData_SettingData_4033(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_System_SystemComponents_4036(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_Collection_Members_4042(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_CIM_Model_Elements_4048(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getWirelessLANEndpoint_2050IncomingLinks(View view) {
		WirelessLANEndpoint modelElement = (WirelessLANEndpoint) view
				.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result
				.addAll(getIncomingFeatureModelFacetLinks_ServiceAccessPoint_BindsTo_4010(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_Components_4011(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_LogicalDevice_DeviceSAPImplementation_4016(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_System_HostedAccessPoint_4020(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ElementSoftwareIdentity_ManagedElement_4024(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ServiceAccessPoint_SAPSAPDependency_4029(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_Service_ServiceAccessBySAP_4030(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_System_SystemComponents_4036(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_Collection_Members_4042(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_RouteCalculationService_CalculatesAmong_4046(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_CIM_Model_Elements_4048(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ForwardingService_ForwardsAmong_4050(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_LogicalNetwork_InLogicalNetwork_4056(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_NATService_NATServiceRunningOnEndpoint_4058(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_LogicalPort_PortImplementsEndPoint_4060(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_NextHopRoute_RouteUsesEndpoint_4065(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_SNMPService_TrapSourceForSNMPService_4070(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getDHCPProtocolEndpoint_2051IncomingLinks(View view) {
		DHCPProtocolEndpoint modelElement = (DHCPProtocolEndpoint) view
				.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result
				.addAll(getIncomingFeatureModelFacetLinks_ServiceAccessPoint_BindsTo_4010(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_Components_4011(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_LogicalDevice_DeviceSAPImplementation_4016(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_System_HostedAccessPoint_4020(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ElementSoftwareIdentity_ManagedElement_4024(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ServiceAccessPoint_SAPSAPDependency_4029(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_Service_ServiceAccessBySAP_4030(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_System_SystemComponents_4036(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_Collection_Members_4042(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_RouteCalculationService_CalculatesAmong_4046(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_CIM_Model_Elements_4048(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ForwardingService_ForwardsAmong_4050(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_LogicalNetwork_InLogicalNetwork_4056(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_NATService_NATServiceRunningOnEndpoint_4058(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_LogicalPort_PortImplementsEndPoint_4060(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_NextHopRoute_RouteUsesEndpoint_4065(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_SNMPService_TrapSourceForSNMPService_4070(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getIPHeadersFilter_2052IncomingLinks(View view) {
		IPHeadersFilter modelElement = (IPHeadersFilter) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_Components_4011(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ElementSoftwareIdentity_ManagedElement_4024(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_System_SystemComponents_4036(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_Collection_Members_4042(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_CIM_Model_Elements_4048(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getDirectory_2053IncomingLinks(View view) {
		Directory modelElement = (Directory) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_Components_4011(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ElementSoftwareIdentity_ManagedElement_4024(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_System_SystemComponents_4036(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_Collection_Members_4042(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_CIM_Model_Elements_4048(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getIPAddressRange_2054IncomingLinks(View view) {
		IPAddressRange modelElement = (IPAddressRange) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_Components_4011(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ElementSoftwareIdentity_ManagedElement_4024(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_System_SystemComponents_4036(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_Collection_Members_4042(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_CIM_Model_Elements_4048(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getSNMPTrapTarget_2055IncomingLinks(View view) {
		SNMPTrapTarget modelElement = (SNMPTrapTarget) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_Components_4011(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_LogicalDevice_DeviceSAPImplementation_4016(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_System_HostedAccessPoint_4020(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ElementSoftwareIdentity_ManagedElement_4024(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_EnabledLogicalElement_RemoteAccessAvailableToElement_4027(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ServiceAccessPoint_SAPSAPDependency_4029(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_Service_ServiceAccessBySAP_4030(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_System_SystemComponents_4036(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_Collection_Members_4042(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_CIM_Model_Elements_4048(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_NextHopRoute_AssociatedNextHop_4071(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getIPXConnectivityNetwork_2056IncomingLinks(View view) {
		IPXConnectivityNetwork modelElement = (IPXConnectivityNetwork) view
				.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_Components_4011(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_System_HostedCollection_4021(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ElementSoftwareIdentity_ManagedElement_4024(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_System_SystemComponents_4036(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_Collection_Members_4042(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_CIM_Model_Elements_4048(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getConnectivityMemberhipSettingData_2057IncomingLinks(
			View view) {
		ConnectivityMemberhipSettingData modelElement = (ConnectivityMemberhipSettingData) view
				.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_Components_4011(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ElementSoftwareIdentity_ManagedElement_4024(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ElementSettingData_SettingData_4033(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_System_SystemComponents_4036(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_Collection_Members_4042(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_CIM_Model_Elements_4048(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getConditioningService_2058IncomingLinks(View view) {
		ConditioningService modelElement = (ConditioningService) view
				.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_Components_4011(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_System_HostedServices_4023(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ElementSoftwareIdentity_ManagedElement_4024(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_Product_ProductServiceComponent_4026(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_Service_ServiceComponents_4031(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_Service_ServiceServiceDependency_4032(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_System_SystemComponents_4036(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_QoSService_QoSConditioningSubService_4040(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_Collection_Members_4042(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ProtocolEndpoint_EgressConditioningServiceOnEndpoint_4047(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_CIM_Model_Elements_4048(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ProtocolEndpoint_IngressConditioningServiceOnEndpoint_4055(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getBIOSFeature_2059IncomingLinks(View view) {
		BIOSFeature modelElement = (BIOSFeature) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result
				.addAll(getIncomingFeatureModelFacetLinks_OperatingSystem_OperatingSystemSoftwareFeature_4002(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_Components_4011(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ElementSoftwareIdentity_ManagedElement_4024(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_System_SystemComponents_4036(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_Collection_Members_4042(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_CIM_Model_Elements_4048(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_Service_SoftwareFeatureServiceImplementation_4068(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getOSPFProtocolEndpoint_2060IncomingLinks(View view) {
		OSPFProtocolEndpoint modelElement = (OSPFProtocolEndpoint) view
				.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result
				.addAll(getIncomingFeatureModelFacetLinks_ServiceAccessPoint_BindsTo_4010(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_Components_4011(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_LogicalDevice_DeviceSAPImplementation_4016(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_System_HostedAccessPoint_4020(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ElementSoftwareIdentity_ManagedElement_4024(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ServiceAccessPoint_SAPSAPDependency_4029(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_Service_ServiceAccessBySAP_4030(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_System_SystemComponents_4036(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_Collection_Members_4042(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_RouteCalculationService_CalculatesAmong_4046(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_CIM_Model_Elements_4048(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ForwardingService_ForwardsAmong_4050(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_LogicalNetwork_InLogicalNetwork_4056(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_NATService_NATServiceRunningOnEndpoint_4058(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_LogicalPort_PortImplementsEndPoint_4060(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_NextHopRoute_RouteUsesEndpoint_4065(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_SNMPService_TrapSourceForSNMPService_4070(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getFilterList_2061IncomingLinks(View view) {
		FilterList modelElement = (FilterList) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_Components_4011(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ElementSoftwareIdentity_ManagedElement_4024(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_System_SystemComponents_4036(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_Collection_Members_4042(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_NATListBasedSettings_AddressesToBeTranslated_4043(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_CIM_Model_Elements_4048(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ComputerSystem_HostedFilterList_4051(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getBGPService_2062IncomingLinks(View view) {
		BGPService modelElement = (BGPService) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result
				.addAll(getIncomingFeatureModelFacetLinks_BGPCluster_ReflectorClientService_4007(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_BGPCluster_ReflectorNonClientService_4008(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_BGPCluster_ReflectorService_4009(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_Components_4011(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_System_HostedServices_4023(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ElementSoftwareIdentity_ManagedElement_4024(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_Product_ProductServiceComponent_4026(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_Service_ServiceComponents_4031(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_Service_ServiceServiceDependency_4032(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_System_SystemComponents_4036(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_Collection_Members_4042(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_CIM_Model_Elements_4048(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getPrecedenceService_2063IncomingLinks(View view) {
		PrecedenceService modelElement = (PrecedenceService) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_Components_4011(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_System_HostedServices_4023(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ElementSoftwareIdentity_ManagedElement_4024(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_Product_ProductServiceComponent_4026(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_Service_ServiceComponents_4031(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_Service_ServiceServiceDependency_4032(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_System_SystemComponents_4036(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_QoSService_QoSSubService_4041(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_Collection_Members_4042(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_CIM_Model_Elements_4048(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getDHCPCapabilities_2064IncomingLinks(View view) {
		DHCPCapabilities modelElement = (DHCPCapabilities) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_Components_4011(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_ElementCapabilities_4017(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ElementSoftwareIdentity_ManagedElement_4024(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_SettingData_SettingsDefineCapabilities_4034(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_System_SystemComponents_4036(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_Collection_Members_4042(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_CIM_Model_Elements_4048(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getHdr8021PService_2065IncomingLinks(View view) {
		Hdr8021PService modelElement = (Hdr8021PService) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_Components_4011(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_System_HostedServices_4023(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ElementSoftwareIdentity_ManagedElement_4024(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_Product_ProductServiceComponent_4026(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_Service_ServiceComponents_4031(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_Service_ServiceServiceDependency_4032(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_System_SystemComponents_4036(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_QoSService_QoSSubService_4041(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_Collection_Members_4042(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_CIM_Model_Elements_4048(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getReplacementSet_2066IncomingLinks(View view) {
		ReplacementSet modelElement = (ReplacementSet) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_Components_4011(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ElementSoftwareIdentity_ManagedElement_4024(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_System_SystemComponents_4036(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_Collection_Members_4042(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_CIM_Model_Elements_4048(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getHDSLModem_2067IncomingLinks(View view) {
		HDSLModem modelElement = (HDSLModem) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_Components_4011(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_LogicalDevice_DeviceConnection_4014(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_LogicalDevice_DeviceIdentity_4015(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ElementSoftwareIdentity_ManagedElement_4024(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_System_SystemComponents_4036(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_System_SystemDevices_4037(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_Collection_Members_4042(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_CIM_Model_Elements_4048(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getServiceAccessURI_2068IncomingLinks(View view) {
		ServiceAccessURI modelElement = (ServiceAccessURI) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_Components_4011(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_LogicalDevice_DeviceSAPImplementation_4016(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_System_HostedAccessPoint_4020(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ElementSoftwareIdentity_ManagedElement_4024(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ServiceAccessPoint_SAPSAPDependency_4029(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_Service_ServiceAccessBySAP_4030(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_System_SystemComponents_4036(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_Collection_Members_4042(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_CIM_Model_Elements_4048(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getFilterEntry_2069IncomingLinks(View view) {
		FilterEntry modelElement = (FilterEntry) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_Components_4011(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ElementSoftwareIdentity_ManagedElement_4024(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_System_SystemComponents_4036(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_Collection_Members_4042(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_CIM_Model_Elements_4048(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getSNMPCommunityStrings_2070IncomingLinks(View view) {
		SNMPCommunityStrings modelElement = (SNMPCommunityStrings) view
				.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_Components_4011(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_LogicalDevice_DeviceSAPImplementation_4016(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_System_HostedAccessPoint_4020(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ElementSoftwareIdentity_ManagedElement_4024(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ServiceAccessPoint_SAPSAPDependency_4029(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_Service_ServiceAccessBySAP_4030(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_System_SystemComponents_4036(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_Collection_Members_4042(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_CIM_Model_Elements_4048(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getNetwork_2071IncomingLinks(View view) {
		Network modelElement = (Network) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_Components_4011(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_AdminDomain_ContainedDomain_4012(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ElementSoftwareIdentity_ManagedElement_4024(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_System_SystemComponents_4036(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_Collection_Members_4042(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_CIM_Model_Elements_4048(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getFileSpecification_2072IncomingLinks(View view) {
		FileSpecification modelElement = (FileSpecification) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result
				.addAll(getIncomingFeatureModelFacetLinks_DirectorySpecification_DirectorySpecificationFiles_4001(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_SoftwareElement_SoftwareElementChecks_4004(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_Components_4011(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ElementSoftwareIdentity_ManagedElement_4024(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_System_SystemComponents_4036(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_Collection_Members_4042(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_CIM_Model_Elements_4048(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getIPXNetwork_2073IncomingLinks(View view) {
		IPXNetwork modelElement = (IPXNetwork) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_Components_4011(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ElementSoftwareIdentity_ManagedElement_4024(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_System_SystemComponents_4036(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_Collection_Members_4042(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_CIM_Model_Elements_4048(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_AdminDomain_NetworksInAdminDomain_4059(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getPowerManagementCapabilities_2074IncomingLinks(
			View view) {
		PowerManagementCapabilities modelElement = (PowerManagementCapabilities) view
				.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_Components_4011(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_ElementCapabilities_4017(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ElementSoftwareIdentity_ManagedElement_4024(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_SettingData_SettingsDefineCapabilities_4034(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_System_SystemComponents_4036(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_Collection_Members_4042(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_CIM_Model_Elements_4048(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getFlowService_2075IncomingLinks(View view) {
		FlowService modelElement = (FlowService) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_Components_4011(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_System_HostedServices_4023(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ElementSoftwareIdentity_ManagedElement_4024(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_Product_ProductServiceComponent_4026(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_Service_ServiceComponents_4031(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_Service_ServiceServiceDependency_4032(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_System_SystemComponents_4036(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_QoSService_QoSSubService_4041(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_Collection_Members_4042(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_CIM_Model_Elements_4048(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getISDNModem_2076IncomingLinks(View view) {
		ISDNModem modelElement = (ISDNModem) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_Components_4011(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_LogicalDevice_DeviceConnection_4014(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_LogicalDevice_DeviceIdentity_4015(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ElementSoftwareIdentity_ManagedElement_4024(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_System_SystemComponents_4036(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_System_SystemDevices_4037(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_Collection_Members_4042(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_CIM_Model_Elements_4048(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getIPXProtocolEndpoint_2077IncomingLinks(View view) {
		IPXProtocolEndpoint modelElement = (IPXProtocolEndpoint) view
				.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result
				.addAll(getIncomingFeatureModelFacetLinks_ServiceAccessPoint_BindsTo_4010(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_Components_4011(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_LogicalDevice_DeviceSAPImplementation_4016(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_System_HostedAccessPoint_4020(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ElementSoftwareIdentity_ManagedElement_4024(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ServiceAccessPoint_SAPSAPDependency_4029(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_Service_ServiceAccessBySAP_4030(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_System_SystemComponents_4036(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_Collection_Members_4042(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_RouteCalculationService_CalculatesAmong_4046(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_CIM_Model_Elements_4048(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ForwardingService_ForwardsAmong_4050(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_LogicalNetwork_InLogicalNetwork_4056(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_NATService_NATServiceRunningOnEndpoint_4058(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_LogicalPort_PortImplementsEndPoint_4060(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_NextHopRoute_RouteUsesEndpoint_4065(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_SNMPService_TrapSourceForSNMPService_4070(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getIPProtocolEndpoint_2078IncomingLinks(View view) {
		IPProtocolEndpoint modelElement = (IPProtocolEndpoint) view
				.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result
				.addAll(getIncomingFeatureModelFacetLinks_ServiceAccessPoint_BindsTo_4010(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_Components_4011(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_LogicalDevice_DeviceSAPImplementation_4016(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_System_HostedAccessPoint_4020(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ElementSoftwareIdentity_ManagedElement_4024(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ServiceAccessPoint_SAPSAPDependency_4029(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_Service_ServiceAccessBySAP_4030(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_System_SystemComponents_4036(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_Collection_Members_4042(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_RouteCalculationService_CalculatesAmong_4046(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_CIM_Model_Elements_4048(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ForwardingService_ForwardsAmong_4050(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_LogicalNetwork_InLogicalNetwork_4056(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_NATService_NATServiceRunningOnEndpoint_4058(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_LogicalPort_PortImplementsEndPoint_4060(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_NextHopRoute_RouteUsesEndpoint_4065(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_SNMPService_TrapSourceForSNMPService_4070(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getUDPProtocolEndpoint_2079IncomingLinks(View view) {
		UDPProtocolEndpoint modelElement = (UDPProtocolEndpoint) view
				.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result
				.addAll(getIncomingFeatureModelFacetLinks_ServiceAccessPoint_BindsTo_4010(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_Components_4011(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_LogicalDevice_DeviceSAPImplementation_4016(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_System_HostedAccessPoint_4020(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ElementSoftwareIdentity_ManagedElement_4024(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ServiceAccessPoint_SAPSAPDependency_4029(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_Service_ServiceAccessBySAP_4030(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_System_SystemComponents_4036(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_Collection_Members_4042(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_RouteCalculationService_CalculatesAmong_4046(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_CIM_Model_Elements_4048(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ForwardingService_ForwardsAmong_4050(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_LogicalNetwork_InLogicalNetwork_4056(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_NATService_NATServiceRunningOnEndpoint_4058(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_LogicalPort_PortImplementsEndPoint_4060(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_NextHopRoute_RouteUsesEndpoint_4065(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_SNMPService_TrapSourceForSNMPService_4070(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getProduct_2080IncomingLinks(View view) {
		Product modelElement = (Product) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_Components_4011(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ElementSoftwareIdentity_ManagedElement_4024(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_Product_ProductProductDependency_4025(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_System_SystemComponents_4036(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_Collection_Members_4042(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_CIM_Model_Elements_4048(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getMemoryCapacity_2081IncomingLinks(View view) {
		MemoryCapacity modelElement = (MemoryCapacity) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_Components_4011(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ElementSoftwareIdentity_ManagedElement_4024(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_System_SystemComponents_4036(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_Collection_Members_4042(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_CIM_Model_Elements_4048(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getRoutingProtocolDomain_2082IncomingLinks(View view) {
		RoutingProtocolDomain modelElement = (RoutingProtocolDomain) view
				.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_Components_4011(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_AdminDomain_ContainedDomain_4012(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ElementSoftwareIdentity_ManagedElement_4024(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_System_SystemComponents_4036(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_Collection_Members_4042(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_CIM_Model_Elements_4048(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_AutonomousSystem_RoutingProtocolDomainInAS_4066(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getAFService_2083IncomingLinks(View view) {
		AFService modelElement = (AFService) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_Components_4011(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_System_HostedServices_4023(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ElementSoftwareIdentity_ManagedElement_4024(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_Product_ProductServiceComponent_4026(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_Service_ServiceComponents_4031(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_Service_ServiceServiceDependency_4032(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_System_SystemComponents_4036(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_AFService_AFRelatedServices_4039(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_QoSService_QoSSubService_4041(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_Collection_Members_4042(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_CIM_Model_Elements_4048(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getLANSegment_2084IncomingLinks(View view) {
		LANSegment modelElement = (LANSegment) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_Components_4011(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ElementSoftwareIdentity_ManagedElement_4024(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_System_SystemComponents_4036(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_Collection_Members_4042(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_CIM_Model_Elements_4048(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_AdminDomain_NetworksInAdminDomain_4059(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getNATStaticSettings_2085IncomingLinks(View view) {
		NATStaticSettings modelElement = (NATStaticSettings) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_Components_4011(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ElementSoftwareIdentity_ManagedElement_4024(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ElementSettingData_SettingData_4033(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_System_SystemComponents_4036(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_Collection_Members_4042(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_CIM_Model_Elements_4048(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getTelnetProtocolEndpoint_2086IncomingLinks(View view) {
		TelnetProtocolEndpoint modelElement = (TelnetProtocolEndpoint) view
				.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result
				.addAll(getIncomingFeatureModelFacetLinks_ServiceAccessPoint_BindsTo_4010(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_Components_4011(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_LogicalDevice_DeviceSAPImplementation_4016(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_System_HostedAccessPoint_4020(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ElementSoftwareIdentity_ManagedElement_4024(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ServiceAccessPoint_SAPSAPDependency_4029(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_Service_ServiceAccessBySAP_4030(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_System_SystemComponents_4036(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_Collection_Members_4042(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_RouteCalculationService_CalculatesAmong_4046(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_CIM_Model_Elements_4048(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ForwardingService_ForwardsAmong_4050(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_LogicalNetwork_InLogicalNetwork_4056(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_NATService_NATServiceRunningOnEndpoint_4058(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_LogicalPort_PortImplementsEndPoint_4060(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_NextHopRoute_RouteUsesEndpoint_4065(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_SNMPService_TrapSourceForSNMPService_4070(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getLANEndpoint_2087IncomingLinks(View view) {
		LANEndpoint modelElement = (LANEndpoint) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result
				.addAll(getIncomingFeatureModelFacetLinks_ServiceAccessPoint_BindsTo_4010(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_Components_4011(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_LogicalDevice_DeviceSAPImplementation_4016(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_System_HostedAccessPoint_4020(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ElementSoftwareIdentity_ManagedElement_4024(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ServiceAccessPoint_SAPSAPDependency_4029(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_Service_ServiceAccessBySAP_4030(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_System_SystemComponents_4036(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_Collection_Members_4042(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ServiceAccessPoint_BindsToLANEndpoint_4045(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_RouteCalculationService_CalculatesAmong_4046(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_CIM_Model_Elements_4048(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ForwardingService_ForwardsAmong_4050(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_LogicalNetwork_InLogicalNetwork_4056(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_LANSegment_InSegment_4057(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_NATService_NATServiceRunningOnEndpoint_4058(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_LogicalPort_PortImplementsEndPoint_4060(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_NextHopRoute_RouteUsesEndpoint_4065(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_SNMPService_TrapSourceForSNMPService_4070(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getDropThresholdCalculationService_2088IncomingLinks(
			View view) {
		DropThresholdCalculationService modelElement = (DropThresholdCalculationService) view
				.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_Components_4011(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_System_HostedServices_4023(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ElementSoftwareIdentity_ManagedElement_4024(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_Product_ProductServiceComponent_4026(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_Service_ServiceComponents_4031(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_Service_ServiceServiceDependency_4032(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_System_SystemComponents_4036(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_Collection_Members_4042(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_CIM_Model_Elements_4048(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getAdminDomain_2089IncomingLinks(View view) {
		AdminDomain modelElement = (AdminDomain) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_Components_4011(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_AdminDomain_ContainedDomain_4012(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ElementSoftwareIdentity_ManagedElement_4024(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_System_SystemComponents_4036(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_Collection_Members_4042(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_CIM_Model_Elements_4048(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getSystemSpecificCollection_2090IncomingLinks(View view) {
		SystemSpecificCollection modelElement = (SystemSpecificCollection) view
				.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_Components_4011(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_System_HostedCollection_4021(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ElementSoftwareIdentity_ManagedElement_4024(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_System_SystemComponents_4036(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_Collection_Members_4042(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_CIM_Model_Elements_4048(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getNextHopRouting_2091IncomingLinks(View view) {
		NextHopRouting modelElement = (NextHopRouting) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_Components_4011(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ElementSoftwareIdentity_ManagedElement_4024(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_System_SystemComponents_4036(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_Collection_Members_4042(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_CIM_Model_Elements_4048(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ForwardingService_RouteForwardedByService_4062(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getComputerSystem_2092IncomingLinks(View view) {
		ComputerSystem modelElement = (ComputerSystem) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_Components_4011(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ElementSoftwareIdentity_ManagedElement_4024(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_System_SystemComponents_4036(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_Collection_Members_4042(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_CIM_Model_Elements_4048(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_AutonomousSystem_RouterInAS_4063(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_BGPCluster_RoutersInBGPCluster_4064(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getNetworkPort_2093IncomingLinks(View view) {
		NetworkPort modelElement = (NetworkPort) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_Components_4011(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_LogicalDevice_DeviceConnection_4014(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_LogicalDevice_DeviceIdentity_4015(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ElementSoftwareIdentity_ManagedElement_4024(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_System_SystemComponents_4036(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_System_SystemDevices_4037(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_LogicalModule_ModulePort_4038(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_Collection_Members_4042(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_CIM_Model_Elements_4048(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_LogicalDevice_PortOnDevice_4061(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getRemoteServiceAccessPoint_2094IncomingLinks(View view) {
		RemoteServiceAccessPoint modelElement = (RemoteServiceAccessPoint) view
				.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_Components_4011(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_LogicalDevice_DeviceSAPImplementation_4016(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_System_HostedAccessPoint_4020(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ElementSoftwareIdentity_ManagedElement_4024(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_EnabledLogicalElement_RemoteAccessAvailableToElement_4027(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_ServiceAccessPoint_SAPSAPDependency_4029(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_Service_ServiceAccessBySAP_4030(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_System_SystemComponents_4036(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_Collection_Members_4042(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_CIM_Model_Elements_4048(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_NextHopRoute_AssociatedNextHop_4071(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getUSBDevice_2001OutgoingLinks(View view) {
		USBDevice modelElement = (USBDevice) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Components_4011(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_LogicalDevice_DeviceConnection_4014(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_LogicalDevice_DeviceIdentity_4015(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_LogicalDevice_DeviceSAPImplementation_4016(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementCapabilities_4017(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementSettingData_4018(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_EnabledLogicalElement_RemoteAccessAvailableToElement_4027(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedSystemElement_StatusDescriptions_4035(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_LogicalDevice_PortOnDevice_4061(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getOSPFVirtualInterface_2002OutgoingLinks(View view) {
		OSPFVirtualInterface modelElement = (OSPFVirtualInterface) view
				.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ServiceAccessPoint_BindsTo_4010(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Components_4011(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementCapabilities_4017(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementSettingData_4018(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_EnabledLogicalElement_RemoteAccessAvailableToElement_4027(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ServiceAccessPoint_SAPSAPDependency_4029(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedSystemElement_StatusDescriptions_4035(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ServiceAccessPoint_BindsToLANEndpoint_4045(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ProtocolEndpoint_EgressConditioningServiceOnEndpoint_4047(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ProtocolEndpoint_IngressConditioningServiceOnEndpoint_4055(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getWiFiPort_2003OutgoingLinks(View view) {
		WiFiPort modelElement = (WiFiPort) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Components_4011(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_LogicalDevice_DeviceConnection_4014(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_LogicalDevice_DeviceIdentity_4015(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_LogicalDevice_DeviceSAPImplementation_4016(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementCapabilities_4017(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementSettingData_4018(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_EnabledLogicalElement_RemoteAccessAvailableToElement_4027(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedSystemElement_StatusDescriptions_4035(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_LogicalPort_PortImplementsEndPoint_4060(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_LogicalDevice_PortOnDevice_4061(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getProtocolService_2004OutgoingLinks(View view) {
		ProtocolService modelElement = (ProtocolService) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Components_4011(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementCapabilities_4017(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementSettingData_4018(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_EnabledLogicalElement_RemoteAccessAvailableToElement_4027(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Service_ServiceAccessBySAP_4030(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Service_ServiceComponents_4031(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Service_ServiceServiceDependency_4032(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedSystemElement_StatusDescriptions_4035(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Service_SoftwareFeatureServiceImplementation_4068(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getRoutingPolicy_2005OutgoingLinks(View view) {
		RoutingPolicy modelElement = (RoutingPolicy) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Components_4011(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementCapabilities_4017(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementSettingData_4018(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedSystemElement_StatusDescriptions_4035(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getEnabledLogicalElementCapabilities_2006OutgoingLinks(
			View view) {
		EnabledLogicalElementCapabilities modelElement = (EnabledLogicalElementCapabilities) view
				.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Components_4011(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementCapabilities_4017(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementSettingData_4018(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getBufferPool_2007OutgoingLinks(View view) {
		BufferPool modelElement = (BufferPool) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Components_4011(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementCapabilities_4017(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementSettingData_4018(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Collection_Members_4042(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getMPLSProtocolEndpoint_2008OutgoingLinks(View view) {
		MPLSProtocolEndpoint modelElement = (MPLSProtocolEndpoint) view
				.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ServiceAccessPoint_BindsTo_4010(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Components_4011(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementCapabilities_4017(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementSettingData_4018(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_EnabledLogicalElement_RemoteAccessAvailableToElement_4027(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ServiceAccessPoint_SAPSAPDependency_4029(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedSystemElement_StatusDescriptions_4035(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ServiceAccessPoint_BindsToLANEndpoint_4045(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ProtocolEndpoint_EgressConditioningServiceOnEndpoint_4047(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ProtocolEndpoint_IngressConditioningServiceOnEndpoint_4055(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getAutonomousSystem_2009OutgoingLinks(View view) {
		AutonomousSystem modelElement = (AutonomousSystem) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Components_4011(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_AdminDomain_ContainedDomain_4012(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementCapabilities_4017(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementSettingData_4018(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_System_HostedAccessPoint_4020(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_System_HostedCollection_4021(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_System_HostedServices_4023(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_EnabledLogicalElement_RemoteAccessAvailableToElement_4027(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_System_Roles_4028(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedSystemElement_StatusDescriptions_4035(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_System_SystemComponents_4036(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_System_SystemDevices_4037(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_System_HostedRoute_4053(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_AdminDomain_NetworksInAdminDomain_4059(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_AutonomousSystem_RouterInAS_4063(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_AutonomousSystem_RoutingProtocolDomainInAS_4066(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getDNSSettingData_2010OutgoingLinks(View view) {
		DNSSettingData modelElement = (DNSSettingData) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Components_4011(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementCapabilities_4017(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementSettingData_4018(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_SettingData_SettingsDefineCapabilities_4034(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getUniModem_2011OutgoingLinks(View view) {
		UniModem modelElement = (UniModem) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Components_4011(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_LogicalDevice_DeviceConnection_4014(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_LogicalDevice_DeviceIdentity_4015(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_LogicalDevice_DeviceSAPImplementation_4016(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementCapabilities_4017(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementSettingData_4018(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_EnabledLogicalElement_RemoteAccessAvailableToElement_4027(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedSystemElement_StatusDescriptions_4035(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_LogicalDevice_PortOnDevice_4061(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getEFService_2012OutgoingLinks(View view) {
		EFService modelElement = (EFService) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Components_4011(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementCapabilities_4017(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementSettingData_4018(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_EnabledLogicalElement_RemoteAccessAvailableToElement_4027(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Service_ServiceAccessBySAP_4030(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Service_ServiceComponents_4031(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Service_ServiceServiceDependency_4032(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedSystemElement_StatusDescriptions_4035(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_QoSService_QoSConditioningSubService_4040(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_QoSService_QoSSubService_4041(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Service_SoftwareFeatureServiceImplementation_4068(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getIPSubnet_2013OutgoingLinks(View view) {
		IPSubnet modelElement = (IPSubnet) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Components_4011(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementCapabilities_4017(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementSettingData_4018(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Collection_Members_4042(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_LogicalNetwork_InLogicalNetwork_4056(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getNamedAddressCollection_2014OutgoingLinks(View view) {
		NamedAddressCollection modelElement = (NamedAddressCollection) view
				.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Components_4011(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementCapabilities_4017(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementSettingData_4018(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Collection_Members_4042(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getBIOSElement_2015OutgoingLinks(View view) {
		BIOSElement modelElement = (BIOSElement) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_SoftwareElement_SoftwareElementActions_4003(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_SoftwareElement_SoftwareElementChecks_4004(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Components_4011(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementCapabilities_4017(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementSettingData_4018(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedSystemElement_StatusDescriptions_4035(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getTelnetSettingData_2016OutgoingLinks(View view) {
		TelnetSettingData modelElement = (TelnetSettingData) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Components_4011(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementCapabilities_4017(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementSettingData_4018(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_SettingData_SettingsDefineCapabilities_4034(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getBGPPeerGroup_2017OutgoingLinks(View view) {
		BGPPeerGroup modelElement = (BGPPeerGroup) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Components_4011(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementCapabilities_4017(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementSettingData_4018(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Collection_Members_4042(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getLANConnectivitySegment_2018OutgoingLinks(View view) {
		LANConnectivitySegment modelElement = (LANConnectivitySegment) view
				.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Components_4011(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementCapabilities_4017(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementSettingData_4018(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Collection_Members_4042(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getCableModem_2019OutgoingLinks(View view) {
		CableModem modelElement = (CableModem) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Components_4011(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_LogicalDevice_DeviceConnection_4014(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_LogicalDevice_DeviceIdentity_4015(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_LogicalDevice_DeviceSAPImplementation_4016(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementCapabilities_4017(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementSettingData_4018(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_EnabledLogicalElement_RemoteAccessAvailableToElement_4027(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedSystemElement_StatusDescriptions_4035(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_LogicalDevice_PortOnDevice_4061(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getSwitchPort_2020OutgoingLinks(View view) {
		SwitchPort modelElement = (SwitchPort) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ServiceAccessPoint_BindsTo_4010(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Components_4011(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementCapabilities_4017(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementSettingData_4018(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_EnabledLogicalElement_RemoteAccessAvailableToElement_4027(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ServiceAccessPoint_SAPSAPDependency_4029(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedSystemElement_StatusDescriptions_4035(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ServiceAccessPoint_BindsToLANEndpoint_4045(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ProtocolEndpoint_EgressConditioningServiceOnEndpoint_4047(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ProtocolEndpoint_IngressConditioningServiceOnEndpoint_4055(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getTCPProtocolEndpoint_2021OutgoingLinks(View view) {
		TCPProtocolEndpoint modelElement = (TCPProtocolEndpoint) view
				.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ServiceAccessPoint_BindsTo_4010(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Components_4011(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementCapabilities_4017(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementSettingData_4018(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_EnabledLogicalElement_RemoteAccessAvailableToElement_4027(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ServiceAccessPoint_SAPSAPDependency_4029(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedSystemElement_StatusDescriptions_4035(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ServiceAccessPoint_BindsToLANEndpoint_4045(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ProtocolEndpoint_EgressConditioningServiceOnEndpoint_4047(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ProtocolEndpoint_IngressConditioningServiceOnEndpoint_4055(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getAdministrativeDistance_2022OutgoingLinks(View view) {
		AdministrativeDistance modelElement = (AdministrativeDistance) view
				.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Components_4011(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementCapabilities_4017(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementSettingData_4018(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedSystemElement_StatusDescriptions_4035(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getIPConnectivitySubnet_2023OutgoingLinks(View view) {
		IPConnectivitySubnet modelElement = (IPConnectivitySubnet) view
				.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Components_4011(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementCapabilities_4017(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementSettingData_4018(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Collection_Members_4042(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getVolatileStorage_2024OutgoingLinks(View view) {
		VolatileStorage modelElement = (VolatileStorage) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Components_4011(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_LogicalDevice_DeviceConnection_4014(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_LogicalDevice_DeviceIdentity_4015(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_LogicalDevice_DeviceSAPImplementation_4016(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementCapabilities_4017(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementSettingData_4018(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_EnabledLogicalElement_RemoteAccessAvailableToElement_4027(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedSystemElement_StatusDescriptions_4035(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_LogicalDevice_PortOnDevice_4061(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getRangeOfIPAddresses_2025OutgoingLinks(View view) {
		RangeOfIPAddresses modelElement = (RangeOfIPAddresses) view
				.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Components_4011(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementCapabilities_4017(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementSettingData_4018(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Collection_Members_4042(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getBGPProtocolEndpoint_2026OutgoingLinks(View view) {
		BGPProtocolEndpoint modelElement = (BGPProtocolEndpoint) view
				.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ServiceAccessPoint_BindsTo_4010(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Components_4011(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementCapabilities_4017(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementSettingData_4018(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_EnabledLogicalElement_RemoteAccessAvailableToElement_4027(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ServiceAccessPoint_SAPSAPDependency_4029(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedSystemElement_StatusDescriptions_4035(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ServiceAccessPoint_BindsToLANEndpoint_4045(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ProtocolEndpoint_EgressConditioningServiceOnEndpoint_4047(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ProtocolEndpoint_IngressConditioningServiceOnEndpoint_4055(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getUnitaryComputerSystem_2027OutgoingLinks(View view) {
		UnitaryComputerSystem modelElement = (UnitaryComputerSystem) view
				.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Components_4011(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementCapabilities_4017(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementSettingData_4018(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_System_HostedAccessPoint_4020(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_System_HostedCollection_4021(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_System_HostedServices_4023(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_EnabledLogicalElement_RemoteAccessAvailableToElement_4027(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_System_Roles_4028(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedSystemElement_StatusDescriptions_4035(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_System_SystemComponents_4036(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_System_SystemDevices_4037(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ComputerSystem_HostedFilterList_4051(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ComputerSystem_HostedForwardingServices_4052(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_System_HostedRoute_4053(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ComputerSystem_HostedRoutingPolicy_4054(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ComputerSystem_RunningOS_4067(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getEthernetPort_2028OutgoingLinks(View view) {
		EthernetPort modelElement = (EthernetPort) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Components_4011(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_LogicalDevice_DeviceConnection_4014(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_LogicalDevice_DeviceIdentity_4015(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_LogicalDevice_DeviceSAPImplementation_4016(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementCapabilities_4017(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementSettingData_4018(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_EnabledLogicalElement_RemoteAccessAvailableToElement_4027(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedSystemElement_StatusDescriptions_4035(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_LogicalPort_PortImplementsEndPoint_4060(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_LogicalDevice_PortOnDevice_4061(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getSNMPService_2029OutgoingLinks(View view) {
		SNMPService modelElement = (SNMPService) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Components_4011(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementCapabilities_4017(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementSettingData_4018(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_EnabledLogicalElement_RemoteAccessAvailableToElement_4027(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Service_ServiceAccessBySAP_4030(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Service_ServiceComponents_4031(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Service_ServiceServiceDependency_4032(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedSystemElement_StatusDescriptions_4035(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Service_SoftwareFeatureServiceImplementation_4068(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_SNMPService_TrapSourceForSNMPService_4070(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getLogicalModule_2030OutgoingLinks(View view) {
		LogicalModule modelElement = (LogicalModule) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Components_4011(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_LogicalDevice_DeviceConnection_4014(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_LogicalDevice_DeviceIdentity_4015(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_LogicalDevice_DeviceSAPImplementation_4016(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementCapabilities_4017(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementSettingData_4018(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_EnabledLogicalElement_RemoteAccessAvailableToElement_4027(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedSystemElement_StatusDescriptions_4035(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_LogicalModule_ModulePort_4038(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_LogicalDevice_PortOnDevice_4061(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getNextHopIPRoute_2031OutgoingLinks(View view) {
		NextHopIPRoute modelElement = (NextHopIPRoute) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Components_4011(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementCapabilities_4017(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementSettingData_4018(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_NextHopRoute_RouteUsesEndpoint_4065(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_NextHopRoute_AssociatedNextHop_4071(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getOperatingSystem_2032OutgoingLinks(View view) {
		OperatingSystem modelElement = (OperatingSystem) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_OperatingSystem_OperatingSystemSoftwareFeature_4002(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Components_4011(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementCapabilities_4017(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementSettingData_4018(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_EnabledLogicalElement_RemoteAccessAvailableToElement_4027(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedSystemElement_StatusDescriptions_4035(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getSDSLModem_2033OutgoingLinks(View view) {
		SDSLModem modelElement = (SDSLModem) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Components_4011(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_LogicalDevice_DeviceConnection_4014(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_LogicalDevice_DeviceIdentity_4015(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_LogicalDevice_DeviceSAPImplementation_4016(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementCapabilities_4017(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementSettingData_4018(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_EnabledLogicalElement_RemoteAccessAvailableToElement_4027(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedSystemElement_StatusDescriptions_4035(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_LogicalDevice_PortOnDevice_4061(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getWiFiEndPoint_2034OutgoingLinks(View view) {
		WiFiEndPoint modelElement = (WiFiEndPoint) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ServiceAccessPoint_BindsTo_4010(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Components_4011(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementCapabilities_4017(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementSettingData_4018(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_EnabledLogicalElement_RemoteAccessAvailableToElement_4027(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ServiceAccessPoint_SAPSAPDependency_4029(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedSystemElement_StatusDescriptions_4035(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ServiceAccessPoint_BindsToLANEndpoint_4045(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ProtocolEndpoint_EgressConditioningServiceOnEndpoint_4047(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ProtocolEndpoint_IngressConditioningServiceOnEndpoint_4055(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getNATService_2035OutgoingLinks(View view) {
		NATService modelElement = (NATService) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Components_4011(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementCapabilities_4017(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementSettingData_4018(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_EnabledLogicalElement_RemoteAccessAvailableToElement_4027(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Service_ServiceAccessBySAP_4030(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Service_ServiceComponents_4031(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Service_ServiceServiceDependency_4032(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedSystemElement_StatusDescriptions_4035(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ForwardingService_ForwardedRoutes_4049(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ForwardingService_ForwardsAmong_4050(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_NATService_NATServiceRunningOnEndpoint_4058(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ForwardingService_RouteForwardedByService_4062(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Service_SoftwareFeatureServiceImplementation_4068(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getADSLModem_2036OutgoingLinks(View view) {
		ADSLModem modelElement = (ADSLModem) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Components_4011(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_LogicalDevice_DeviceConnection_4014(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_LogicalDevice_DeviceIdentity_4015(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_LogicalDevice_DeviceSAPImplementation_4016(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementCapabilities_4017(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementSettingData_4018(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_EnabledLogicalElement_RemoteAccessAvailableToElement_4027(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedSystemElement_StatusDescriptions_4035(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_LogicalDevice_PortOnDevice_4061(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getLogicalFile_2037OutgoingLinks(View view) {
		LogicalFile modelElement = (LogicalFile) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Components_4011(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementCapabilities_4017(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementSettingData_4018(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedSystemElement_StatusDescriptions_4035(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getBGPCluster_2038OutgoingLinks(View view) {
		BGPCluster modelElement = (BGPCluster) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_BGPCluster_ReflectorClientService_4007(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_BGPCluster_ReflectorNonClientService_4008(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_BGPCluster_ReflectorService_4009(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Components_4011(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementCapabilities_4017(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementSettingData_4018(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Collection_Members_4042(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_BGPCluster_RoutersInBGPCluster_4064(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getApplicationSystem_2039OutgoingLinks(View view) {
		ApplicationSystem modelElement = (ApplicationSystem) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Components_4011(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementCapabilities_4017(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementSettingData_4018(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_System_HostedAccessPoint_4020(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_System_HostedCollection_4021(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_System_HostedServices_4023(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_EnabledLogicalElement_RemoteAccessAvailableToElement_4027(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_System_Roles_4028(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedSystemElement_StatusDescriptions_4035(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_System_SystemComponents_4036(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_System_SystemDevices_4037(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_System_HostedRoute_4053(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getSoftwareIdentity_2040OutgoingLinks(View view) {
		SoftwareIdentity modelElement = (SoftwareIdentity) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Components_4011(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementCapabilities_4017(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementSettingData_4018(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_SoftwareIdentity_ElementSoftwareIdentity_4019(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedSystemElement_StatusDescriptions_4035(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getWirelessPort_2041OutgoingLinks(View view) {
		WirelessPort modelElement = (WirelessPort) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Components_4011(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_LogicalDevice_DeviceConnection_4014(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_LogicalDevice_DeviceIdentity_4015(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_LogicalDevice_DeviceSAPImplementation_4016(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementCapabilities_4017(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementSettingData_4018(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_EnabledLogicalElement_RemoteAccessAvailableToElement_4027(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedSystemElement_StatusDescriptions_4035(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_LogicalPort_PortImplementsEndPoint_4060(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_LogicalDevice_PortOnDevice_4061(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getCLPSettingData_2042OutgoingLinks(View view) {
		CLPSettingData modelElement = (CLPSettingData) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Components_4011(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementCapabilities_4017(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementSettingData_4018(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_SettingData_SettingsDefineCapabilities_4034(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getGenericService_2043OutgoingLinks(View view) {
		GenericService modelElement = (GenericService) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Components_4011(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementCapabilities_4017(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementSettingData_4018(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_EnabledLogicalElement_RemoteAccessAvailableToElement_4027(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Service_ServiceAccessBySAP_4030(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Service_ServiceComponents_4031(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Service_ServiceServiceDependency_4032(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedSystemElement_StatusDescriptions_4035(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Service_SoftwareFeatureServiceImplementation_4068(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getNATListBasedSettings_2044OutgoingLinks(View view) {
		NATListBasedSettings modelElement = (NATListBasedSettings) view
				.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Components_4011(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementCapabilities_4017(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementSettingData_4018(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_SettingData_SettingsDefineCapabilities_4034(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_NATListBasedSettings_AddressesToBeTranslated_4043(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_NATListBasedSettings_TranslationPoolForNAT_4069(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getVDSLModem_2045OutgoingLinks(View view) {
		VDSLModem modelElement = (VDSLModem) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Components_4011(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_LogicalDevice_DeviceConnection_4014(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_LogicalDevice_DeviceIdentity_4015(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_LogicalDevice_DeviceSAPImplementation_4016(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementCapabilities_4017(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementSettingData_4018(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_EnabledLogicalElement_RemoteAccessAvailableToElement_4027(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedSystemElement_StatusDescriptions_4035(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_LogicalDevice_PortOnDevice_4061(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getUSBPort_2046OutgoingLinks(View view) {
		USBPort modelElement = (USBPort) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Components_4011(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_LogicalDevice_DeviceConnection_4014(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_LogicalDevice_DeviceIdentity_4015(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_LogicalDevice_DeviceSAPImplementation_4016(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementCapabilities_4017(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementSettingData_4018(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_EnabledLogicalElement_RemoteAccessAvailableToElement_4027(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedSystemElement_StatusDescriptions_4035(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_LogicalPort_PortImplementsEndPoint_4060(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_LogicalDevice_PortOnDevice_4061(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getDNSProtocolEndpoint_2047OutgoingLinks(View view) {
		DNSProtocolEndpoint modelElement = (DNSProtocolEndpoint) view
				.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ServiceAccessPoint_BindsTo_4010(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Components_4011(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementCapabilities_4017(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementSettingData_4018(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_EnabledLogicalElement_RemoteAccessAvailableToElement_4027(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ServiceAccessPoint_SAPSAPDependency_4029(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedSystemElement_StatusDescriptions_4035(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ServiceAccessPoint_BindsToLANEndpoint_4045(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ProtocolEndpoint_EgressConditioningServiceOnEndpoint_4047(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ProtocolEndpoint_IngressConditioningServiceOnEndpoint_4055(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getWiFiEndpointSettings_2048OutgoingLinks(View view) {
		WiFiEndpointSettings modelElement = (WiFiEndpointSettings) view
				.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Components_4011(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementCapabilities_4017(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementSettingData_4018(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_SettingData_SettingsDefineCapabilities_4034(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getSSHSettingData_2049OutgoingLinks(View view) {
		SSHSettingData modelElement = (SSHSettingData) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Components_4011(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementCapabilities_4017(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementSettingData_4018(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_SettingData_SettingsDefineCapabilities_4034(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getWirelessLANEndpoint_2050OutgoingLinks(View view) {
		WirelessLANEndpoint modelElement = (WirelessLANEndpoint) view
				.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ServiceAccessPoint_BindsTo_4010(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Components_4011(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementCapabilities_4017(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementSettingData_4018(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_EnabledLogicalElement_RemoteAccessAvailableToElement_4027(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ServiceAccessPoint_SAPSAPDependency_4029(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedSystemElement_StatusDescriptions_4035(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ServiceAccessPoint_BindsToLANEndpoint_4045(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ProtocolEndpoint_EgressConditioningServiceOnEndpoint_4047(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ProtocolEndpoint_IngressConditioningServiceOnEndpoint_4055(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getDHCPProtocolEndpoint_2051OutgoingLinks(View view) {
		DHCPProtocolEndpoint modelElement = (DHCPProtocolEndpoint) view
				.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ServiceAccessPoint_BindsTo_4010(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Components_4011(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementCapabilities_4017(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementSettingData_4018(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_EnabledLogicalElement_RemoteAccessAvailableToElement_4027(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ServiceAccessPoint_SAPSAPDependency_4029(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedSystemElement_StatusDescriptions_4035(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ServiceAccessPoint_BindsToLANEndpoint_4045(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ProtocolEndpoint_EgressConditioningServiceOnEndpoint_4047(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ProtocolEndpoint_IngressConditioningServiceOnEndpoint_4055(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getIPHeadersFilter_2052OutgoingLinks(View view) {
		IPHeadersFilter modelElement = (IPHeadersFilter) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Components_4011(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementCapabilities_4017(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementSettingData_4018(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedSystemElement_StatusDescriptions_4035(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getDirectory_2053OutgoingLinks(View view) {
		Directory modelElement = (Directory) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Components_4011(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementCapabilities_4017(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementSettingData_4018(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedSystemElement_StatusDescriptions_4035(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getIPAddressRange_2054OutgoingLinks(View view) {
		IPAddressRange modelElement = (IPAddressRange) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Components_4011(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementCapabilities_4017(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementSettingData_4018(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Collection_Members_4042(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getSNMPTrapTarget_2055OutgoingLinks(View view) {
		SNMPTrapTarget modelElement = (SNMPTrapTarget) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ServiceAccessPoint_BindsTo_4010(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Components_4011(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementCapabilities_4017(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementSettingData_4018(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_EnabledLogicalElement_RemoteAccessAvailableToElement_4027(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ServiceAccessPoint_SAPSAPDependency_4029(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedSystemElement_StatusDescriptions_4035(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ServiceAccessPoint_BindsToLANEndpoint_4045(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getIPXConnectivityNetwork_2056OutgoingLinks(View view) {
		IPXConnectivityNetwork modelElement = (IPXConnectivityNetwork) view
				.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Components_4011(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementCapabilities_4017(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementSettingData_4018(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Collection_Members_4042(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getConnectivityMemberhipSettingData_2057OutgoingLinks(
			View view) {
		ConnectivityMemberhipSettingData modelElement = (ConnectivityMemberhipSettingData) view
				.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Components_4011(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementCapabilities_4017(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementSettingData_4018(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_SettingData_SettingsDefineCapabilities_4034(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getConditioningService_2058OutgoingLinks(View view) {
		ConditioningService modelElement = (ConditioningService) view
				.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Components_4011(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementCapabilities_4017(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementSettingData_4018(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_EnabledLogicalElement_RemoteAccessAvailableToElement_4027(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Service_ServiceAccessBySAP_4030(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Service_ServiceComponents_4031(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Service_ServiceServiceDependency_4032(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedSystemElement_StatusDescriptions_4035(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Service_SoftwareFeatureServiceImplementation_4068(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getBIOSFeature_2059OutgoingLinks(View view) {
		BIOSFeature modelElement = (BIOSFeature) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Components_4011(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementCapabilities_4017(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementSettingData_4018(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedSystemElement_StatusDescriptions_4035(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getOSPFProtocolEndpoint_2060OutgoingLinks(View view) {
		OSPFProtocolEndpoint modelElement = (OSPFProtocolEndpoint) view
				.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ServiceAccessPoint_BindsTo_4010(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Components_4011(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementCapabilities_4017(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementSettingData_4018(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_EnabledLogicalElement_RemoteAccessAvailableToElement_4027(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ServiceAccessPoint_SAPSAPDependency_4029(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedSystemElement_StatusDescriptions_4035(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ServiceAccessPoint_BindsToLANEndpoint_4045(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ProtocolEndpoint_EgressConditioningServiceOnEndpoint_4047(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ProtocolEndpoint_IngressConditioningServiceOnEndpoint_4055(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getFilterList_2061OutgoingLinks(View view) {
		FilterList modelElement = (FilterList) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Components_4011(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementCapabilities_4017(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementSettingData_4018(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedSystemElement_StatusDescriptions_4035(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getBGPService_2062OutgoingLinks(View view) {
		BGPService modelElement = (BGPService) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_BGPService_BGPPeerGroupServices_4006(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Components_4011(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementCapabilities_4017(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementSettingData_4018(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_EnabledLogicalElement_RemoteAccessAvailableToElement_4027(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Service_ServiceAccessBySAP_4030(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Service_ServiceComponents_4031(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Service_ServiceServiceDependency_4032(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedSystemElement_StatusDescriptions_4035(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_BGPService_BGPAdminDistance_4044(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_RouteCalculationService_CalculatesAmong_4046(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Service_SoftwareFeatureServiceImplementation_4068(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getPrecedenceService_2063OutgoingLinks(View view) {
		PrecedenceService modelElement = (PrecedenceService) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Components_4011(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementCapabilities_4017(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementSettingData_4018(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_EnabledLogicalElement_RemoteAccessAvailableToElement_4027(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Service_ServiceAccessBySAP_4030(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Service_ServiceComponents_4031(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Service_ServiceServiceDependency_4032(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedSystemElement_StatusDescriptions_4035(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_QoSService_QoSConditioningSubService_4040(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_QoSService_QoSSubService_4041(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Service_SoftwareFeatureServiceImplementation_4068(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getDHCPCapabilities_2064OutgoingLinks(View view) {
		DHCPCapabilities modelElement = (DHCPCapabilities) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Components_4011(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementCapabilities_4017(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementSettingData_4018(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getHdr8021PService_2065OutgoingLinks(View view) {
		Hdr8021PService modelElement = (Hdr8021PService) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Components_4011(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementCapabilities_4017(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementSettingData_4018(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_EnabledLogicalElement_RemoteAccessAvailableToElement_4027(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Service_ServiceAccessBySAP_4030(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Service_ServiceComponents_4031(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Service_ServiceServiceDependency_4032(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedSystemElement_StatusDescriptions_4035(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_QoSService_QoSConditioningSubService_4040(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_QoSService_QoSSubService_4041(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Service_SoftwareFeatureServiceImplementation_4068(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getReplacementSet_2066OutgoingLinks(View view) {
		ReplacementSet modelElement = (ReplacementSet) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Components_4011(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementCapabilities_4017(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementSettingData_4018(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Collection_Members_4042(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getHDSLModem_2067OutgoingLinks(View view) {
		HDSLModem modelElement = (HDSLModem) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Components_4011(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_LogicalDevice_DeviceConnection_4014(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_LogicalDevice_DeviceIdentity_4015(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_LogicalDevice_DeviceSAPImplementation_4016(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementCapabilities_4017(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementSettingData_4018(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_EnabledLogicalElement_RemoteAccessAvailableToElement_4027(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedSystemElement_StatusDescriptions_4035(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_LogicalDevice_PortOnDevice_4061(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getServiceAccessURI_2068OutgoingLinks(View view) {
		ServiceAccessURI modelElement = (ServiceAccessURI) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ServiceAccessPoint_BindsTo_4010(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Components_4011(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementCapabilities_4017(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementSettingData_4018(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_EnabledLogicalElement_RemoteAccessAvailableToElement_4027(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ServiceAccessPoint_SAPSAPDependency_4029(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedSystemElement_StatusDescriptions_4035(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ServiceAccessPoint_BindsToLANEndpoint_4045(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getFilterEntry_2069OutgoingLinks(View view) {
		FilterEntry modelElement = (FilterEntry) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Components_4011(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementCapabilities_4017(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementSettingData_4018(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedSystemElement_StatusDescriptions_4035(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getSNMPCommunityStrings_2070OutgoingLinks(View view) {
		SNMPCommunityStrings modelElement = (SNMPCommunityStrings) view
				.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ServiceAccessPoint_BindsTo_4010(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Components_4011(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementCapabilities_4017(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementSettingData_4018(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_EnabledLogicalElement_RemoteAccessAvailableToElement_4027(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ServiceAccessPoint_SAPSAPDependency_4029(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedSystemElement_StatusDescriptions_4035(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ServiceAccessPoint_BindsToLANEndpoint_4045(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getNetwork_2071OutgoingLinks(View view) {
		Network modelElement = (Network) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Components_4011(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_AdminDomain_ContainedDomain_4012(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementCapabilities_4017(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementSettingData_4018(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_System_HostedAccessPoint_4020(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_System_HostedCollection_4021(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_System_HostedServices_4023(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_EnabledLogicalElement_RemoteAccessAvailableToElement_4027(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_System_Roles_4028(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedSystemElement_StatusDescriptions_4035(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_System_SystemComponents_4036(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_System_SystemDevices_4037(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_System_HostedRoute_4053(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_AdminDomain_NetworksInAdminDomain_4059(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getFileSpecification_2072OutgoingLinks(View view) {
		FileSpecification modelElement = (FileSpecification) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Components_4011(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementCapabilities_4017(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementSettingData_4018(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getIPXNetwork_2073OutgoingLinks(View view) {
		IPXNetwork modelElement = (IPXNetwork) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Components_4011(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementCapabilities_4017(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementSettingData_4018(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Collection_Members_4042(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_LogicalNetwork_InLogicalNetwork_4056(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getPowerManagementCapabilities_2074OutgoingLinks(
			View view) {
		PowerManagementCapabilities modelElement = (PowerManagementCapabilities) view
				.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Components_4011(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementCapabilities_4017(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementSettingData_4018(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getFlowService_2075OutgoingLinks(View view) {
		FlowService modelElement = (FlowService) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Components_4011(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementCapabilities_4017(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementSettingData_4018(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_EnabledLogicalElement_RemoteAccessAvailableToElement_4027(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Service_ServiceAccessBySAP_4030(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Service_ServiceComponents_4031(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Service_ServiceServiceDependency_4032(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedSystemElement_StatusDescriptions_4035(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_QoSService_QoSConditioningSubService_4040(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_QoSService_QoSSubService_4041(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Service_SoftwareFeatureServiceImplementation_4068(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getISDNModem_2076OutgoingLinks(View view) {
		ISDNModem modelElement = (ISDNModem) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Components_4011(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_LogicalDevice_DeviceConnection_4014(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_LogicalDevice_DeviceIdentity_4015(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_LogicalDevice_DeviceSAPImplementation_4016(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementCapabilities_4017(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementSettingData_4018(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_EnabledLogicalElement_RemoteAccessAvailableToElement_4027(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedSystemElement_StatusDescriptions_4035(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_LogicalDevice_PortOnDevice_4061(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getIPXProtocolEndpoint_2077OutgoingLinks(View view) {
		IPXProtocolEndpoint modelElement = (IPXProtocolEndpoint) view
				.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ServiceAccessPoint_BindsTo_4010(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Components_4011(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementCapabilities_4017(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementSettingData_4018(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_EnabledLogicalElement_RemoteAccessAvailableToElement_4027(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ServiceAccessPoint_SAPSAPDependency_4029(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedSystemElement_StatusDescriptions_4035(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ServiceAccessPoint_BindsToLANEndpoint_4045(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ProtocolEndpoint_EgressConditioningServiceOnEndpoint_4047(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ProtocolEndpoint_IngressConditioningServiceOnEndpoint_4055(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getIPProtocolEndpoint_2078OutgoingLinks(View view) {
		IPProtocolEndpoint modelElement = (IPProtocolEndpoint) view
				.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ServiceAccessPoint_BindsTo_4010(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Components_4011(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementCapabilities_4017(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementSettingData_4018(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_EnabledLogicalElement_RemoteAccessAvailableToElement_4027(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ServiceAccessPoint_SAPSAPDependency_4029(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedSystemElement_StatusDescriptions_4035(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ServiceAccessPoint_BindsToLANEndpoint_4045(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ProtocolEndpoint_EgressConditioningServiceOnEndpoint_4047(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ProtocolEndpoint_IngressConditioningServiceOnEndpoint_4055(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getUDPProtocolEndpoint_2079OutgoingLinks(View view) {
		UDPProtocolEndpoint modelElement = (UDPProtocolEndpoint) view
				.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ServiceAccessPoint_BindsTo_4010(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Components_4011(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementCapabilities_4017(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementSettingData_4018(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_EnabledLogicalElement_RemoteAccessAvailableToElement_4027(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ServiceAccessPoint_SAPSAPDependency_4029(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedSystemElement_StatusDescriptions_4035(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ServiceAccessPoint_BindsToLANEndpoint_4045(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ProtocolEndpoint_EgressConditioningServiceOnEndpoint_4047(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ProtocolEndpoint_IngressConditioningServiceOnEndpoint_4055(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getProduct_2080OutgoingLinks(View view) {
		Product modelElement = (Product) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Components_4011(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementCapabilities_4017(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementSettingData_4018(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Product_ProductProductDependency_4025(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Product_ProductServiceComponent_4026(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getMemoryCapacity_2081OutgoingLinks(View view) {
		MemoryCapacity modelElement = (MemoryCapacity) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Components_4011(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementCapabilities_4017(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementSettingData_4018(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getRoutingProtocolDomain_2082OutgoingLinks(View view) {
		RoutingProtocolDomain modelElement = (RoutingProtocolDomain) view
				.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Components_4011(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_AdminDomain_ContainedDomain_4012(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementCapabilities_4017(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementSettingData_4018(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_System_HostedAccessPoint_4020(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_System_HostedCollection_4021(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_System_HostedServices_4023(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_EnabledLogicalElement_RemoteAccessAvailableToElement_4027(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_System_Roles_4028(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedSystemElement_StatusDescriptions_4035(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_System_SystemComponents_4036(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_System_SystemDevices_4037(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_System_HostedRoute_4053(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_AdminDomain_NetworksInAdminDomain_4059(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getAFService_2083OutgoingLinks(View view) {
		AFService modelElement = (AFService) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Components_4011(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementCapabilities_4017(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementSettingData_4018(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_EnabledLogicalElement_RemoteAccessAvailableToElement_4027(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Service_ServiceAccessBySAP_4030(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Service_ServiceComponents_4031(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Service_ServiceServiceDependency_4032(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedSystemElement_StatusDescriptions_4035(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_AFService_AFRelatedServices_4039(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_QoSService_QoSConditioningSubService_4040(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_QoSService_QoSSubService_4041(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Service_SoftwareFeatureServiceImplementation_4068(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getLANSegment_2084OutgoingLinks(View view) {
		LANSegment modelElement = (LANSegment) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Components_4011(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementCapabilities_4017(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementSettingData_4018(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Collection_Members_4042(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_LogicalNetwork_InLogicalNetwork_4056(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_LANSegment_InSegment_4057(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getNATStaticSettings_2085OutgoingLinks(View view) {
		NATStaticSettings modelElement = (NATStaticSettings) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Components_4011(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementCapabilities_4017(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementSettingData_4018(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_SettingData_SettingsDefineCapabilities_4034(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getTelnetProtocolEndpoint_2086OutgoingLinks(View view) {
		TelnetProtocolEndpoint modelElement = (TelnetProtocolEndpoint) view
				.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ServiceAccessPoint_BindsTo_4010(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Components_4011(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementCapabilities_4017(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementSettingData_4018(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_EnabledLogicalElement_RemoteAccessAvailableToElement_4027(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ServiceAccessPoint_SAPSAPDependency_4029(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedSystemElement_StatusDescriptions_4035(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ServiceAccessPoint_BindsToLANEndpoint_4045(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ProtocolEndpoint_EgressConditioningServiceOnEndpoint_4047(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ProtocolEndpoint_IngressConditioningServiceOnEndpoint_4055(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getLANEndpoint_2087OutgoingLinks(View view) {
		LANEndpoint modelElement = (LANEndpoint) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ServiceAccessPoint_BindsTo_4010(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Components_4011(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementCapabilities_4017(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementSettingData_4018(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_EnabledLogicalElement_RemoteAccessAvailableToElement_4027(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ServiceAccessPoint_SAPSAPDependency_4029(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedSystemElement_StatusDescriptions_4035(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ServiceAccessPoint_BindsToLANEndpoint_4045(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ProtocolEndpoint_EgressConditioningServiceOnEndpoint_4047(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ProtocolEndpoint_IngressConditioningServiceOnEndpoint_4055(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getDropThresholdCalculationService_2088OutgoingLinks(
			View view) {
		DropThresholdCalculationService modelElement = (DropThresholdCalculationService) view
				.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Components_4011(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementCapabilities_4017(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementSettingData_4018(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_EnabledLogicalElement_RemoteAccessAvailableToElement_4027(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Service_ServiceAccessBySAP_4030(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Service_ServiceComponents_4031(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Service_ServiceServiceDependency_4032(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedSystemElement_StatusDescriptions_4035(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Service_SoftwareFeatureServiceImplementation_4068(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getAdminDomain_2089OutgoingLinks(View view) {
		AdminDomain modelElement = (AdminDomain) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Components_4011(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_AdminDomain_ContainedDomain_4012(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementCapabilities_4017(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementSettingData_4018(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_System_HostedAccessPoint_4020(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_System_HostedCollection_4021(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_System_HostedServices_4023(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_EnabledLogicalElement_RemoteAccessAvailableToElement_4027(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_System_Roles_4028(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedSystemElement_StatusDescriptions_4035(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_System_SystemComponents_4036(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_System_SystemDevices_4037(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_System_HostedRoute_4053(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_AdminDomain_NetworksInAdminDomain_4059(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getSystemSpecificCollection_2090OutgoingLinks(View view) {
		SystemSpecificCollection modelElement = (SystemSpecificCollection) view
				.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Components_4011(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementCapabilities_4017(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementSettingData_4018(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Collection_Members_4042(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getNextHopRouting_2091OutgoingLinks(View view) {
		NextHopRouting modelElement = (NextHopRouting) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Components_4011(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementCapabilities_4017(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementSettingData_4018(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedSystemElement_StatusDescriptions_4035(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getComputerSystem_2092OutgoingLinks(View view) {
		ComputerSystem modelElement = (ComputerSystem) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Components_4011(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementCapabilities_4017(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementSettingData_4018(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_System_HostedAccessPoint_4020(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_System_HostedCollection_4021(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_System_HostedServices_4023(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_EnabledLogicalElement_RemoteAccessAvailableToElement_4027(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_System_Roles_4028(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedSystemElement_StatusDescriptions_4035(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_System_SystemComponents_4036(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_System_SystemDevices_4037(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ComputerSystem_HostedFilterList_4051(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ComputerSystem_HostedForwardingServices_4052(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_System_HostedRoute_4053(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ComputerSystem_HostedRoutingPolicy_4054(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ComputerSystem_RunningOS_4067(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getNetworkPort_2093OutgoingLinks(View view) {
		NetworkPort modelElement = (NetworkPort) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Components_4011(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_LogicalDevice_DeviceConnection_4014(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_LogicalDevice_DeviceIdentity_4015(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_LogicalDevice_DeviceSAPImplementation_4016(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementCapabilities_4017(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementSettingData_4018(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_EnabledLogicalElement_RemoteAccessAvailableToElement_4027(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedSystemElement_StatusDescriptions_4035(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_LogicalPort_PortImplementsEndPoint_4060(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_LogicalDevice_PortOnDevice_4061(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getRemoteServiceAccessPoint_2094OutgoingLinks(View view) {
		RemoteServiceAccessPoint modelElement = (RemoteServiceAccessPoint) view
				.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ServiceAccessPoint_BindsTo_4010(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Components_4011(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementCapabilities_4017(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_ElementSettingData_4018(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_EnabledLogicalElement_RemoteAccessAvailableToElement_4027(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ServiceAccessPoint_SAPSAPDependency_4029(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ManagedSystemElement_StatusDescriptions_4035(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ServiceAccessPoint_BindsToLANEndpoint_4045(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_DirectorySpecification_DirectorySpecificationFiles_4001(
			FileSpecification target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() == CimPackage.eINSTANCE
					.getDirectorySpecification_DirectorySpecificationFiles()) {
				result
						.add(new CIMLevelZeroLinkDescriptor(
								setting.getEObject(),
								target,
								CIMLevelZeroElementTypes.DirectorySpecificationDirectorySpecificationFiles_4001,
								DirectorySpecificationDirectorySpecificationFilesEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_OperatingSystem_OperatingSystemSoftwareFeature_4002(
			SoftwareFeature target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() == CimPackage.eINSTANCE
					.getOperatingSystem_OperatingSystemSoftwareFeature()) {
				result
						.add(new CIMLevelZeroLinkDescriptor(
								setting.getEObject(),
								target,
								CIMLevelZeroElementTypes.OperatingSystemOperatingSystemSoftwareFeature_4002,
								OperatingSystemOperatingSystemSoftwareFeatureEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_SoftwareElement_SoftwareElementChecks_4004(
			Check target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() == CimPackage.eINSTANCE
					.getSoftwareElement_SoftwareElementChecks()) {
				result
						.add(new CIMLevelZeroLinkDescriptor(
								setting.getEObject(),
								target,
								CIMLevelZeroElementTypes.SoftwareElementSoftwareElementChecks_4004,
								SoftwareElementSoftwareElementChecksEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_InstalledProduct_SoftwareElements_4005(
			SoftwareElement target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() == CimPackage.eINSTANCE
					.getInstalledProduct_SoftwareElements()) {
				result
						.add(new CIMLevelZeroLinkDescriptor(
								setting.getEObject(),
								target,
								CIMLevelZeroElementTypes.InstalledProductSoftwareElements_4005,
								InstalledProductSoftwareElementsEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_BGPService_BGPPeerGroupServices_4006(
			BGPPeerGroup target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() == CimPackage.eINSTANCE
					.getBGPService_BGPPeerGroupServices()) {
				result
						.add(new CIMLevelZeroLinkDescriptor(
								setting.getEObject(),
								target,
								CIMLevelZeroElementTypes.BGPServiceBGPPeerGroupServices_4006,
								BGPServiceBGPPeerGroupServicesEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_BGPCluster_ReflectorClientService_4007(
			BGPService target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() == CimPackage.eINSTANCE
					.getBGPCluster_ReflectorClientService()) {
				result
						.add(new CIMLevelZeroLinkDescriptor(
								setting.getEObject(),
								target,
								CIMLevelZeroElementTypes.BGPClusterReflectorClientService_4007,
								BGPClusterReflectorClientServiceEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_BGPCluster_ReflectorNonClientService_4008(
			BGPService target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() == CimPackage.eINSTANCE
					.getBGPCluster_ReflectorNonClientService()) {
				result
						.add(new CIMLevelZeroLinkDescriptor(
								setting.getEObject(),
								target,
								CIMLevelZeroElementTypes.BGPClusterReflectorNonClientService_4008,
								BGPClusterReflectorNonClientServiceEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_BGPCluster_ReflectorService_4009(
			BGPService target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() == CimPackage.eINSTANCE
					.getBGPCluster_ReflectorService()) {
				result
						.add(new CIMLevelZeroLinkDescriptor(
								setting.getEObject(),
								target,
								CIMLevelZeroElementTypes.BGPClusterReflectorService_4009,
								BGPClusterReflectorServiceEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_ServiceAccessPoint_BindsTo_4010(
			ProtocolEndpoint target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() == CimPackage.eINSTANCE
					.getServiceAccessPoint_BindsTo()) {
				result
						.add(new CIMLevelZeroLinkDescriptor(
								setting.getEObject(),
								target,
								CIMLevelZeroElementTypes.ServiceAccessPointBindsTo_4010,
								ServiceAccessPointBindsToEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_ManagedElement_Components_4011(
			ManagedElement target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() == CimPackage.eINSTANCE
					.getManagedElement_Components()) {
				result.add(new CIMLevelZeroLinkDescriptor(setting.getEObject(),
						target,
						CIMLevelZeroElementTypes.ManagedElementComponents_4011,
						ManagedElementComponentsEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_AdminDomain_ContainedDomain_4012(
			AdminDomain target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() == CimPackage.eINSTANCE
					.getAdminDomain_ContainedDomain()) {
				result
						.add(new CIMLevelZeroLinkDescriptor(
								setting.getEObject(),
								target,
								CIMLevelZeroElementTypes.AdminDomainContainedDomain_4012,
								AdminDomainContainedDomainEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(
			ManagedElement target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() == CimPackage.eINSTANCE
					.getManagedElement_Dependencies()) {
				result
						.add(new CIMLevelZeroLinkDescriptor(
								setting.getEObject(),
								target,
								CIMLevelZeroElementTypes.ManagedElementDependencies_4013,
								ManagedElementDependenciesEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_LogicalDevice_DeviceConnection_4014(
			LogicalDevice target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() == CimPackage.eINSTANCE
					.getLogicalDevice_DeviceConnection()) {
				result
						.add(new CIMLevelZeroLinkDescriptor(
								setting.getEObject(),
								target,
								CIMLevelZeroElementTypes.LogicalDeviceDeviceConnection_4014,
								LogicalDeviceDeviceConnectionEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_LogicalDevice_DeviceIdentity_4015(
			LogicalDevice target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() == CimPackage.eINSTANCE
					.getLogicalDevice_DeviceIdentity()) {
				result
						.add(new CIMLevelZeroLinkDescriptor(
								setting.getEObject(),
								target,
								CIMLevelZeroElementTypes.LogicalDeviceDeviceIdentity_4015,
								LogicalDeviceDeviceIdentityEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_LogicalDevice_DeviceSAPImplementation_4016(
			ServiceAccessPoint target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() == CimPackage.eINSTANCE
					.getLogicalDevice_DeviceSAPImplementation()) {
				result
						.add(new CIMLevelZeroLinkDescriptor(
								setting.getEObject(),
								target,
								CIMLevelZeroElementTypes.LogicalDeviceDeviceSAPImplementation_4016,
								LogicalDeviceDeviceSAPImplementationEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_ManagedElement_ElementCapabilities_4017(
			Capabilities target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() == CimPackage.eINSTANCE
					.getManagedElement_ElementCapabilities()) {
				result
						.add(new CIMLevelZeroLinkDescriptor(
								setting.getEObject(),
								target,
								CIMLevelZeroElementTypes.ManagedElementElementCapabilities_4017,
								ManagedElementElementCapabilitiesEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_System_HostedAccessPoint_4020(
			ServiceAccessPoint target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() == CimPackage.eINSTANCE
					.getSystem_HostedAccessPoint()) {
				result.add(new CIMLevelZeroLinkDescriptor(setting.getEObject(),
						target,
						CIMLevelZeroElementTypes.SystemHostedAccessPoint_4020,
						SystemHostedAccessPointEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_System_HostedCollection_4021(
			SystemSpecificCollection target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() == CimPackage.eINSTANCE
					.getSystem_HostedCollection()) {
				result.add(new CIMLevelZeroLinkDescriptor(setting.getEObject(),
						target,
						CIMLevelZeroElementTypes.SystemHostedCollection_4021,
						SystemHostedCollectionEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(
			ManagedElement target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() == CimPackage.eINSTANCE
					.getManagedElement_HostedDependency()) {
				result
						.add(new CIMLevelZeroLinkDescriptor(
								setting.getEObject(),
								target,
								CIMLevelZeroElementTypes.ManagedElementHostedDependency_4022,
								ManagedElementHostedDependencyEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_System_HostedServices_4023(
			Service target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() == CimPackage.eINSTANCE
					.getSystem_HostedServices()) {
				result.add(new CIMLevelZeroLinkDescriptor(setting.getEObject(),
						target,
						CIMLevelZeroElementTypes.SystemHostedServices_4023,
						SystemHostedServicesEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_ElementSoftwareIdentity_ManagedElement_4024(
			ManagedElement target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() == CimPackage.eINSTANCE
					.getElementSoftwareIdentity_ManagedElement()) {
				result
						.add(new CIMLevelZeroLinkDescriptor(
								setting.getEObject(),
								target,
								CIMLevelZeroElementTypes.ElementSoftwareIdentityManagedElement_4024,
								ElementSoftwareIdentityManagedElementEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_Product_ProductProductDependency_4025(
			Product target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() == CimPackage.eINSTANCE
					.getProduct_ProductProductDependency()) {
				result
						.add(new CIMLevelZeroLinkDescriptor(
								setting.getEObject(),
								target,
								CIMLevelZeroElementTypes.ProductProductProductDependency_4025,
								ProductProductProductDependencyEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_Product_ProductServiceComponent_4026(
			Service target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() == CimPackage.eINSTANCE
					.getProduct_ProductServiceComponent()) {
				result
						.add(new CIMLevelZeroLinkDescriptor(
								setting.getEObject(),
								target,
								CIMLevelZeroElementTypes.ProductProductServiceComponent_4026,
								ProductProductServiceComponentEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_EnabledLogicalElement_RemoteAccessAvailableToElement_4027(
			RemoteServiceAccessPoint target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() == CimPackage.eINSTANCE
					.getEnabledLogicalElement_RemoteAccessAvailableToElement()) {
				result
						.add(new CIMLevelZeroLinkDescriptor(
								setting.getEObject(),
								target,
								CIMLevelZeroElementTypes.EnabledLogicalElementRemoteAccessAvailableToElement_4027,
								EnabledLogicalElementRemoteAccessAvailableToElementEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_ServiceAccessPoint_SAPSAPDependency_4029(
			ServiceAccessPoint target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() == CimPackage.eINSTANCE
					.getServiceAccessPoint_SAPSAPDependency()) {
				result
						.add(new CIMLevelZeroLinkDescriptor(
								setting.getEObject(),
								target,
								CIMLevelZeroElementTypes.ServiceAccessPointSAPSAPDependency_4029,
								ServiceAccessPointSAPSAPDependencyEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_Service_ServiceAccessBySAP_4030(
			ServiceAccessPoint target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() == CimPackage.eINSTANCE
					.getService_ServiceAccessBySAP()) {
				result
						.add(new CIMLevelZeroLinkDescriptor(
								setting.getEObject(),
								target,
								CIMLevelZeroElementTypes.ServiceServiceAccessBySAP_4030,
								ServiceServiceAccessBySAPEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_Service_ServiceComponents_4031(
			Service target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() == CimPackage.eINSTANCE
					.getService_ServiceComponents()) {
				result.add(new CIMLevelZeroLinkDescriptor(setting.getEObject(),
						target,
						CIMLevelZeroElementTypes.ServiceServiceComponents_4031,
						ServiceServiceComponentsEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_Service_ServiceServiceDependency_4032(
			Service target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() == CimPackage.eINSTANCE
					.getService_ServiceServiceDependency()) {
				result
						.add(new CIMLevelZeroLinkDescriptor(
								setting.getEObject(),
								target,
								CIMLevelZeroElementTypes.ServiceServiceServiceDependency_4032,
								ServiceServiceServiceDependencyEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_ElementSettingData_SettingData_4033(
			SettingData target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() == CimPackage.eINSTANCE
					.getElementSettingData_SettingData()) {
				result
						.add(new CIMLevelZeroLinkDescriptor(
								setting.getEObject(),
								target,
								CIMLevelZeroElementTypes.ElementSettingDataSettingData_4033,
								ElementSettingDataSettingDataEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_SettingData_SettingsDefineCapabilities_4034(
			Capabilities target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() == CimPackage.eINSTANCE
					.getSettingData_SettingsDefineCapabilities()) {
				result
						.add(new CIMLevelZeroLinkDescriptor(
								setting.getEObject(),
								target,
								CIMLevelZeroElementTypes.SettingDataSettingsDefineCapabilities_4034,
								SettingDataSettingsDefineCapabilitiesEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_System_SystemComponents_4036(
			ManagedElement target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() == CimPackage.eINSTANCE
					.getSystem_SystemComponents()) {
				result.add(new CIMLevelZeroLinkDescriptor(setting.getEObject(),
						target,
						CIMLevelZeroElementTypes.SystemSystemComponents_4036,
						SystemSystemComponentsEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_System_SystemDevices_4037(
			LogicalDevice target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() == CimPackage.eINSTANCE
					.getSystem_SystemDevices()) {
				result.add(new CIMLevelZeroLinkDescriptor(setting.getEObject(),
						target,
						CIMLevelZeroElementTypes.SystemSystemDevices_4037,
						SystemSystemDevicesEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_LogicalModule_ModulePort_4038(
			NetworkPort target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() == CimPackage.eINSTANCE
					.getLogicalModule_ModulePort()) {
				result.add(new CIMLevelZeroLinkDescriptor(setting.getEObject(),
						target,
						CIMLevelZeroElementTypes.LogicalModuleModulePort_4038,
						LogicalModuleModulePortEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_AFService_AFRelatedServices_4039(
			AFService target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() == CimPackage.eINSTANCE
					.getAFService_AFRelatedServices()) {
				result
						.add(new CIMLevelZeroLinkDescriptor(
								setting.getEObject(),
								target,
								CIMLevelZeroElementTypes.AFServiceAFRelatedServices_4039,
								AFServiceAFRelatedServicesEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_QoSService_QoSConditioningSubService_4040(
			ConditioningService target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() == CimPackage.eINSTANCE
					.getQoSService_QoSConditioningSubService()) {
				result
						.add(new CIMLevelZeroLinkDescriptor(
								setting.getEObject(),
								target,
								CIMLevelZeroElementTypes.QoSServiceQoSConditioningSubService_4040,
								QoSServiceQoSConditioningSubServiceEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_QoSService_QoSSubService_4041(
			QoSService target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() == CimPackage.eINSTANCE
					.getQoSService_QoSSubService()) {
				result.add(new CIMLevelZeroLinkDescriptor(setting.getEObject(),
						target,
						CIMLevelZeroElementTypes.QoSServiceQoSSubService_4041,
						QoSServiceQoSSubServiceEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_Collection_Members_4042(
			ManagedElement target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() == CimPackage.eINSTANCE
					.getCollection_Members()) {
				result.add(new CIMLevelZeroLinkDescriptor(setting.getEObject(),
						target,
						CIMLevelZeroElementTypes.CollectionMembers_4042,
						CollectionMembersEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_NATListBasedSettings_AddressesToBeTranslated_4043(
			FilterList target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() == CimPackage.eINSTANCE
					.getNATListBasedSettings_AddressesToBeTranslated()) {
				result
						.add(new CIMLevelZeroLinkDescriptor(
								setting.getEObject(),
								target,
								CIMLevelZeroElementTypes.NATListBasedSettingsAddressesToBeTranslated_4043,
								NATListBasedSettingsAddressesToBeTranslatedEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_BGPService_BGPAdminDistance_4044(
			AdministrativeDistance target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() == CimPackage.eINSTANCE
					.getBGPService_BGPAdminDistance()) {
				result
						.add(new CIMLevelZeroLinkDescriptor(
								setting.getEObject(),
								target,
								CIMLevelZeroElementTypes.BGPServiceBGPAdminDistance_4044,
								BGPServiceBGPAdminDistanceEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_ServiceAccessPoint_BindsToLANEndpoint_4045(
			LANEndpoint target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() == CimPackage.eINSTANCE
					.getServiceAccessPoint_BindsToLANEndpoint()) {
				result
						.add(new CIMLevelZeroLinkDescriptor(
								setting.getEObject(),
								target,
								CIMLevelZeroElementTypes.ServiceAccessPointBindsToLANEndpoint_4045,
								ServiceAccessPointBindsToLANEndpointEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_RouteCalculationService_CalculatesAmong_4046(
			ProtocolEndpoint target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() == CimPackage.eINSTANCE
					.getRouteCalculationService_CalculatesAmong()) {
				result
						.add(new CIMLevelZeroLinkDescriptor(
								setting.getEObject(),
								target,
								CIMLevelZeroElementTypes.RouteCalculationServiceCalculatesAmong_4046,
								RouteCalculationServiceCalculatesAmongEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_ProtocolEndpoint_EgressConditioningServiceOnEndpoint_4047(
			ConditioningService target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() == CimPackage.eINSTANCE
					.getProtocolEndpoint_EgressConditioningServiceOnEndpoint()) {
				result
						.add(new CIMLevelZeroLinkDescriptor(
								setting.getEObject(),
								target,
								CIMLevelZeroElementTypes.ProtocolEndpointEgressConditioningServiceOnEndpoint_4047,
								ProtocolEndpointEgressConditioningServiceOnEndpointEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_CIM_Model_Elements_4048(
			ManagedElement target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() == CimPackage.eINSTANCE
					.getCIM_Model_Elements()) {
				result.add(new CIMLevelZeroLinkDescriptor(setting.getEObject(),
						target,
						CIMLevelZeroElementTypes.CIM_ModelElements_4048,
						CIM_ModelElementsEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_ForwardingService_ForwardsAmong_4050(
			ProtocolEndpoint target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() == CimPackage.eINSTANCE
					.getForwardingService_ForwardsAmong()) {
				result
						.add(new CIMLevelZeroLinkDescriptor(
								setting.getEObject(),
								target,
								CIMLevelZeroElementTypes.ForwardingServiceForwardsAmong_4050,
								ForwardingServiceForwardsAmongEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_ComputerSystem_HostedFilterList_4051(
			FilterList target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() == CimPackage.eINSTANCE
					.getComputerSystem_HostedFilterList()) {
				result
						.add(new CIMLevelZeroLinkDescriptor(
								setting.getEObject(),
								target,
								CIMLevelZeroElementTypes.ComputerSystemHostedFilterList_4051,
								ComputerSystemHostedFilterListEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_ComputerSystem_HostedForwardingServices_4052(
			ForwardingService target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() == CimPackage.eINSTANCE
					.getComputerSystem_HostedForwardingServices()) {
				result
						.add(new CIMLevelZeroLinkDescriptor(
								setting.getEObject(),
								target,
								CIMLevelZeroElementTypes.ComputerSystemHostedForwardingServices_4052,
								ComputerSystemHostedForwardingServicesEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_System_HostedRoute_4053(
			NextHopRoute target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() == CimPackage.eINSTANCE
					.getSystem_HostedRoute()) {
				result.add(new CIMLevelZeroLinkDescriptor(setting.getEObject(),
						target,
						CIMLevelZeroElementTypes.SystemHostedRoute_4053,
						SystemHostedRouteEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_ComputerSystem_HostedRoutingPolicy_4054(
			RoutingPolicy target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() == CimPackage.eINSTANCE
					.getComputerSystem_HostedRoutingPolicy()) {
				result
						.add(new CIMLevelZeroLinkDescriptor(
								setting.getEObject(),
								target,
								CIMLevelZeroElementTypes.ComputerSystemHostedRoutingPolicy_4054,
								ComputerSystemHostedRoutingPolicyEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_ProtocolEndpoint_IngressConditioningServiceOnEndpoint_4055(
			ConditioningService target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() == CimPackage.eINSTANCE
					.getProtocolEndpoint_IngressConditioningServiceOnEndpoint()) {
				result
						.add(new CIMLevelZeroLinkDescriptor(
								setting.getEObject(),
								target,
								CIMLevelZeroElementTypes.ProtocolEndpointIngressConditioningServiceOnEndpoint_4055,
								ProtocolEndpointIngressConditioningServiceOnEndpointEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_LogicalNetwork_InLogicalNetwork_4056(
			ProtocolEndpoint target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() == CimPackage.eINSTANCE
					.getLogicalNetwork_InLogicalNetwork()) {
				result
						.add(new CIMLevelZeroLinkDescriptor(
								setting.getEObject(),
								target,
								CIMLevelZeroElementTypes.LogicalNetworkInLogicalNetwork_4056,
								LogicalNetworkInLogicalNetworkEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_LANSegment_InSegment_4057(
			LANEndpoint target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() == CimPackage.eINSTANCE
					.getLANSegment_InSegment()) {
				result.add(new CIMLevelZeroLinkDescriptor(setting.getEObject(),
						target,
						CIMLevelZeroElementTypes.LANSegmentInSegment_4057,
						LANSegmentInSegmentEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_NATService_NATServiceRunningOnEndpoint_4058(
			ProtocolEndpoint target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() == CimPackage.eINSTANCE
					.getNATService_NATServiceRunningOnEndpoint()) {
				result
						.add(new CIMLevelZeroLinkDescriptor(
								setting.getEObject(),
								target,
								CIMLevelZeroElementTypes.NATServiceNATServiceRunningOnEndpoint_4058,
								NATServiceNATServiceRunningOnEndpointEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_AdminDomain_NetworksInAdminDomain_4059(
			LogicalNetwork target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() == CimPackage.eINSTANCE
					.getAdminDomain_NetworksInAdminDomain()) {
				result
						.add(new CIMLevelZeroLinkDescriptor(
								setting.getEObject(),
								target,
								CIMLevelZeroElementTypes.AdminDomainNetworksInAdminDomain_4059,
								AdminDomainNetworksInAdminDomainEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_LogicalPort_PortImplementsEndPoint_4060(
			ProtocolEndpoint target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() == CimPackage.eINSTANCE
					.getLogicalPort_PortImplementsEndPoint()) {
				result
						.add(new CIMLevelZeroLinkDescriptor(
								setting.getEObject(),
								target,
								CIMLevelZeroElementTypes.LogicalPortPortImplementsEndPoint_4060,
								LogicalPortPortImplementsEndPointEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_LogicalDevice_PortOnDevice_4061(
			LogicalPort target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() == CimPackage.eINSTANCE
					.getLogicalDevice_PortOnDevice()) {
				result
						.add(new CIMLevelZeroLinkDescriptor(
								setting.getEObject(),
								target,
								CIMLevelZeroElementTypes.LogicalDevicePortOnDevice_4061,
								LogicalDevicePortOnDeviceEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_ForwardingService_RouteForwardedByService_4062(
			NextHopRouting target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() == CimPackage.eINSTANCE
					.getForwardingService_RouteForwardedByService()) {
				result
						.add(new CIMLevelZeroLinkDescriptor(
								setting.getEObject(),
								target,
								CIMLevelZeroElementTypes.ForwardingServiceRouteForwardedByService_4062,
								ForwardingServiceRouteForwardedByServiceEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_AutonomousSystem_RouterInAS_4063(
			ComputerSystem target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() == CimPackage.eINSTANCE
					.getAutonomousSystem_RouterInAS()) {
				result
						.add(new CIMLevelZeroLinkDescriptor(
								setting.getEObject(),
								target,
								CIMLevelZeroElementTypes.AutonomousSystemRouterInAS_4063,
								AutonomousSystemRouterInASEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_BGPCluster_RoutersInBGPCluster_4064(
			ComputerSystem target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() == CimPackage.eINSTANCE
					.getBGPCluster_RoutersInBGPCluster()) {
				result
						.add(new CIMLevelZeroLinkDescriptor(
								setting.getEObject(),
								target,
								CIMLevelZeroElementTypes.BGPClusterRoutersInBGPCluster_4064,
								BGPClusterRoutersInBGPClusterEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_NextHopRoute_RouteUsesEndpoint_4065(
			ProtocolEndpoint target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() == CimPackage.eINSTANCE
					.getNextHopRoute_RouteUsesEndpoint()) {
				result
						.add(new CIMLevelZeroLinkDescriptor(
								setting.getEObject(),
								target,
								CIMLevelZeroElementTypes.NextHopRouteRouteUsesEndpoint_4065,
								NextHopRouteRouteUsesEndpointEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_AutonomousSystem_RoutingProtocolDomainInAS_4066(
			RoutingProtocolDomain target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() == CimPackage.eINSTANCE
					.getAutonomousSystem_RoutingProtocolDomainInAS()) {
				result
						.add(new CIMLevelZeroLinkDescriptor(
								setting.getEObject(),
								target,
								CIMLevelZeroElementTypes.AutonomousSystemRoutingProtocolDomainInAS_4066,
								AutonomousSystemRoutingProtocolDomainInASEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_ComputerSystem_RunningOS_4067(
			OperatingSystem target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() == CimPackage.eINSTANCE
					.getComputerSystem_RunningOS()) {
				result.add(new CIMLevelZeroLinkDescriptor(setting.getEObject(),
						target,
						CIMLevelZeroElementTypes.ComputerSystemRunningOS_4067,
						ComputerSystemRunningOSEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_Service_SoftwareFeatureServiceImplementation_4068(
			SoftwareFeature target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() == CimPackage.eINSTANCE
					.getService_SoftwareFeatureServiceImplementation()) {
				result
						.add(new CIMLevelZeroLinkDescriptor(
								setting.getEObject(),
								target,
								CIMLevelZeroElementTypes.ServiceSoftwareFeatureServiceImplementation_4068,
								ServiceSoftwareFeatureServiceImplementationEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_NATListBasedSettings_TranslationPoolForNAT_4069(
			RangeOfIPAddresses target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() == CimPackage.eINSTANCE
					.getNATListBasedSettings_TranslationPoolForNAT()) {
				result
						.add(new CIMLevelZeroLinkDescriptor(
								setting.getEObject(),
								target,
								CIMLevelZeroElementTypes.NATListBasedSettingsTranslationPoolForNAT_4069,
								NATListBasedSettingsTranslationPoolForNATEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_SNMPService_TrapSourceForSNMPService_4070(
			ProtocolEndpoint target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() == CimPackage.eINSTANCE
					.getSNMPService_TrapSourceForSNMPService()) {
				result
						.add(new CIMLevelZeroLinkDescriptor(
								setting.getEObject(),
								target,
								CIMLevelZeroElementTypes.SNMPServiceTrapSourceForSNMPService_4070,
								SNMPServiceTrapSourceForSNMPServiceEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_NextHopRoute_AssociatedNextHop_4071(
			RemoteServiceAccessPoint target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() == CimPackage.eINSTANCE
					.getNextHopRoute_AssociatedNextHop()) {
				result
						.add(new CIMLevelZeroLinkDescriptor(
								setting.getEObject(),
								target,
								CIMLevelZeroElementTypes.NextHopRouteAssociatedNextHop_4071,
								NextHopRouteAssociatedNextHopEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_OperatingSystem_OperatingSystemSoftwareFeature_4002(
			OperatingSystem source) {
		Collection result = new LinkedList();
		for (Iterator destinations = source.getOperatingSystemSoftwareFeature()
				.iterator(); destinations.hasNext();) {
			SoftwareFeature destination = (SoftwareFeature) destinations.next();
			result
					.add(new CIMLevelZeroLinkDescriptor(
							source,
							destination,
							CIMLevelZeroElementTypes.OperatingSystemOperatingSystemSoftwareFeature_4002,
							OperatingSystemOperatingSystemSoftwareFeatureEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_SoftwareElement_SoftwareElementActions_4003(
			SoftwareElement source) {
		Collection result = new LinkedList();
		for (Iterator destinations = source.getSoftwareElementActions()
				.iterator(); destinations.hasNext();) {
			Action destination = (Action) destinations.next();
			result
					.add(new CIMLevelZeroLinkDescriptor(
							source,
							destination,
							CIMLevelZeroElementTypes.SoftwareElementSoftwareElementActions_4003,
							SoftwareElementSoftwareElementActionsEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_SoftwareElement_SoftwareElementChecks_4004(
			SoftwareElement source) {
		Collection result = new LinkedList();
		for (Iterator destinations = source.getSoftwareElementChecks()
				.iterator(); destinations.hasNext();) {
			Check destination = (Check) destinations.next();
			result
					.add(new CIMLevelZeroLinkDescriptor(
							source,
							destination,
							CIMLevelZeroElementTypes.SoftwareElementSoftwareElementChecks_4004,
							SoftwareElementSoftwareElementChecksEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_BGPService_BGPPeerGroupServices_4006(
			BGPService source) {
		Collection result = new LinkedList();
		for (Iterator destinations = source.getBGPPeerGroupServices()
				.iterator(); destinations.hasNext();) {
			BGPPeerGroup destination = (BGPPeerGroup) destinations.next();
			result
					.add(new CIMLevelZeroLinkDescriptor(
							source,
							destination,
							CIMLevelZeroElementTypes.BGPServiceBGPPeerGroupServices_4006,
							BGPServiceBGPPeerGroupServicesEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_BGPCluster_ReflectorClientService_4007(
			BGPCluster source) {
		Collection result = new LinkedList();
		for (Iterator destinations = source.getReflectorClientService()
				.iterator(); destinations.hasNext();) {
			BGPService destination = (BGPService) destinations.next();
			result
					.add(new CIMLevelZeroLinkDescriptor(
							source,
							destination,
							CIMLevelZeroElementTypes.BGPClusterReflectorClientService_4007,
							BGPClusterReflectorClientServiceEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_BGPCluster_ReflectorNonClientService_4008(
			BGPCluster source) {
		Collection result = new LinkedList();
		for (Iterator destinations = source.getReflectorNonClientService()
				.iterator(); destinations.hasNext();) {
			BGPService destination = (BGPService) destinations.next();
			result
					.add(new CIMLevelZeroLinkDescriptor(
							source,
							destination,
							CIMLevelZeroElementTypes.BGPClusterReflectorNonClientService_4008,
							BGPClusterReflectorNonClientServiceEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_BGPCluster_ReflectorService_4009(
			BGPCluster source) {
		Collection result = new LinkedList();
		for (Iterator destinations = source.getReflectorService().iterator(); destinations
				.hasNext();) {
			BGPService destination = (BGPService) destinations.next();
			result.add(new CIMLevelZeroLinkDescriptor(source, destination,
					CIMLevelZeroElementTypes.BGPClusterReflectorService_4009,
					BGPClusterReflectorServiceEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_ServiceAccessPoint_BindsTo_4010(
			ServiceAccessPoint source) {
		Collection result = new LinkedList();
		for (Iterator destinations = source.getBindsTo().iterator(); destinations
				.hasNext();) {
			ProtocolEndpoint destination = (ProtocolEndpoint) destinations
					.next();
			result.add(new CIMLevelZeroLinkDescriptor(source, destination,
					CIMLevelZeroElementTypes.ServiceAccessPointBindsTo_4010,
					ServiceAccessPointBindsToEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_ManagedElement_Components_4011(
			ManagedElement source) {
		Collection result = new LinkedList();
		for (Iterator destinations = source.getComponents().iterator(); destinations
				.hasNext();) {
			ManagedElement destination = (ManagedElement) destinations.next();
			result.add(new CIMLevelZeroLinkDescriptor(source, destination,
					CIMLevelZeroElementTypes.ManagedElementComponents_4011,
					ManagedElementComponentsEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_AdminDomain_ContainedDomain_4012(
			AdminDomain source) {
		Collection result = new LinkedList();
		for (Iterator destinations = source.getContainedDomain().iterator(); destinations
				.hasNext();) {
			AdminDomain destination = (AdminDomain) destinations.next();
			result.add(new CIMLevelZeroLinkDescriptor(source, destination,
					CIMLevelZeroElementTypes.AdminDomainContainedDomain_4012,
					AdminDomainContainedDomainEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_ManagedElement_Dependencies_4013(
			ManagedElement source) {
		Collection result = new LinkedList();
		for (Iterator destinations = source.getDependencies().iterator(); destinations
				.hasNext();) {
			ManagedElement destination = (ManagedElement) destinations.next();
			result.add(new CIMLevelZeroLinkDescriptor(source, destination,
					CIMLevelZeroElementTypes.ManagedElementDependencies_4013,
					ManagedElementDependenciesEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_LogicalDevice_DeviceConnection_4014(
			LogicalDevice source) {
		Collection result = new LinkedList();
		for (Iterator destinations = source.getDeviceConnection().iterator(); destinations
				.hasNext();) {
			LogicalDevice destination = (LogicalDevice) destinations.next();
			result
					.add(new CIMLevelZeroLinkDescriptor(
							source,
							destination,
							CIMLevelZeroElementTypes.LogicalDeviceDeviceConnection_4014,
							LogicalDeviceDeviceConnectionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_LogicalDevice_DeviceIdentity_4015(
			LogicalDevice source) {
		Collection result = new LinkedList();
		LogicalDevice destination = source.getDeviceIdentity();
		if (destination == null) {
			return result;
		}
		result.add(new CIMLevelZeroLinkDescriptor(source, destination,
				CIMLevelZeroElementTypes.LogicalDeviceDeviceIdentity_4015,
				LogicalDeviceDeviceIdentityEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_LogicalDevice_DeviceSAPImplementation_4016(
			LogicalDevice source) {
		Collection result = new LinkedList();
		for (Iterator destinations = source.getDeviceSAPImplementation()
				.iterator(); destinations.hasNext();) {
			ServiceAccessPoint destination = (ServiceAccessPoint) destinations
					.next();
			result
					.add(new CIMLevelZeroLinkDescriptor(
							source,
							destination,
							CIMLevelZeroElementTypes.LogicalDeviceDeviceSAPImplementation_4016,
							LogicalDeviceDeviceSAPImplementationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_ManagedElement_ElementCapabilities_4017(
			ManagedElement source) {
		Collection result = new LinkedList();
		for (Iterator destinations = source.getElementCapabilities().iterator(); destinations
				.hasNext();) {
			Capabilities destination = (Capabilities) destinations.next();
			result
					.add(new CIMLevelZeroLinkDescriptor(
							source,
							destination,
							CIMLevelZeroElementTypes.ManagedElementElementCapabilities_4017,
							ManagedElementElementCapabilitiesEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_ManagedElement_ElementSettingData_4018(
			ManagedElement source) {
		Collection result = new LinkedList();
		for (Iterator destinations = source.getElementSettingData().iterator(); destinations
				.hasNext();) {
			ElementSettingData destination = (ElementSettingData) destinations
					.next();
			result
					.add(new CIMLevelZeroLinkDescriptor(
							source,
							destination,
							CIMLevelZeroElementTypes.ManagedElementElementSettingData_4018,
							ManagedElementElementSettingDataEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_SoftwareIdentity_ElementSoftwareIdentity_4019(
			SoftwareIdentity source) {
		Collection result = new LinkedList();
		ElementSoftwareIdentity destination = source
				.getElementSoftwareIdentity();
		if (destination == null) {
			return result;
		}
		result
				.add(new CIMLevelZeroLinkDescriptor(
						source,
						destination,
						CIMLevelZeroElementTypes.SoftwareIdentityElementSoftwareIdentity_4019,
						SoftwareIdentityElementSoftwareIdentityEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_System_HostedAccessPoint_4020(
			System source) {
		Collection result = new LinkedList();
		for (Iterator destinations = source.getHostedAccessPoint().iterator(); destinations
				.hasNext();) {
			ServiceAccessPoint destination = (ServiceAccessPoint) destinations
					.next();
			result.add(new CIMLevelZeroLinkDescriptor(source, destination,
					CIMLevelZeroElementTypes.SystemHostedAccessPoint_4020,
					SystemHostedAccessPointEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_System_HostedCollection_4021(
			System source) {
		Collection result = new LinkedList();
		for (Iterator destinations = source.getHostedCollection().iterator(); destinations
				.hasNext();) {
			SystemSpecificCollection destination = (SystemSpecificCollection) destinations
					.next();
			result.add(new CIMLevelZeroLinkDescriptor(source, destination,
					CIMLevelZeroElementTypes.SystemHostedCollection_4021,
					SystemHostedCollectionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_ManagedElement_HostedDependency_4022(
			ManagedElement source) {
		Collection result = new LinkedList();
		for (Iterator destinations = source.getHostedDependency().iterator(); destinations
				.hasNext();) {
			ManagedElement destination = (ManagedElement) destinations.next();
			result
					.add(new CIMLevelZeroLinkDescriptor(
							source,
							destination,
							CIMLevelZeroElementTypes.ManagedElementHostedDependency_4022,
							ManagedElementHostedDependencyEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_System_HostedServices_4023(
			System source) {
		Collection result = new LinkedList();
		for (Iterator destinations = source.getHostedServices().iterator(); destinations
				.hasNext();) {
			Service destination = (Service) destinations.next();
			result.add(new CIMLevelZeroLinkDescriptor(source, destination,
					CIMLevelZeroElementTypes.SystemHostedServices_4023,
					SystemHostedServicesEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_Product_ProductProductDependency_4025(
			Product source) {
		Collection result = new LinkedList();
		for (Iterator destinations = source.getProductProductDependency()
				.iterator(); destinations.hasNext();) {
			Product destination = (Product) destinations.next();
			result
					.add(new CIMLevelZeroLinkDescriptor(
							source,
							destination,
							CIMLevelZeroElementTypes.ProductProductProductDependency_4025,
							ProductProductProductDependencyEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_Product_ProductServiceComponent_4026(
			Product source) {
		Collection result = new LinkedList();
		for (Iterator destinations = source.getProductServiceComponent()
				.iterator(); destinations.hasNext();) {
			Service destination = (Service) destinations.next();
			result
					.add(new CIMLevelZeroLinkDescriptor(
							source,
							destination,
							CIMLevelZeroElementTypes.ProductProductServiceComponent_4026,
							ProductProductServiceComponentEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_EnabledLogicalElement_RemoteAccessAvailableToElement_4027(
			EnabledLogicalElement source) {
		Collection result = new LinkedList();
		for (Iterator destinations = source.getRemoteAccessAvailableToElement()
				.iterator(); destinations.hasNext();) {
			RemoteServiceAccessPoint destination = (RemoteServiceAccessPoint) destinations
					.next();
			result
					.add(new CIMLevelZeroLinkDescriptor(
							source,
							destination,
							CIMLevelZeroElementTypes.EnabledLogicalElementRemoteAccessAvailableToElement_4027,
							EnabledLogicalElementRemoteAccessAvailableToElementEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_System_Roles_4028(
			System source) {
		Collection result = new LinkedList();
		for (Iterator destinations = source.getRoles().iterator(); destinations
				.hasNext();) {
			Role destination = (Role) destinations.next();
			result.add(new CIMLevelZeroLinkDescriptor(source, destination,
					CIMLevelZeroElementTypes.SystemRoles_4028,
					SystemRolesEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_ServiceAccessPoint_SAPSAPDependency_4029(
			ServiceAccessPoint source) {
		Collection result = new LinkedList();
		for (Iterator destinations = source.getSAPSAPDependency().iterator(); destinations
				.hasNext();) {
			ServiceAccessPoint destination = (ServiceAccessPoint) destinations
					.next();
			result
					.add(new CIMLevelZeroLinkDescriptor(
							source,
							destination,
							CIMLevelZeroElementTypes.ServiceAccessPointSAPSAPDependency_4029,
							ServiceAccessPointSAPSAPDependencyEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_Service_ServiceAccessBySAP_4030(
			Service source) {
		Collection result = new LinkedList();
		for (Iterator destinations = source.getServiceAccessBySAP().iterator(); destinations
				.hasNext();) {
			ServiceAccessPoint destination = (ServiceAccessPoint) destinations
					.next();
			result.add(new CIMLevelZeroLinkDescriptor(source, destination,
					CIMLevelZeroElementTypes.ServiceServiceAccessBySAP_4030,
					ServiceServiceAccessBySAPEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_Service_ServiceComponents_4031(
			Service source) {
		Collection result = new LinkedList();
		for (Iterator destinations = source.getServiceComponents().iterator(); destinations
				.hasNext();) {
			Service destination = (Service) destinations.next();
			result.add(new CIMLevelZeroLinkDescriptor(source, destination,
					CIMLevelZeroElementTypes.ServiceServiceComponents_4031,
					ServiceServiceComponentsEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_Service_ServiceServiceDependency_4032(
			Service source) {
		Collection result = new LinkedList();
		for (Iterator destinations = source.getServiceServiceDependency()
				.iterator(); destinations.hasNext();) {
			Service destination = (Service) destinations.next();
			result
					.add(new CIMLevelZeroLinkDescriptor(
							source,
							destination,
							CIMLevelZeroElementTypes.ServiceServiceServiceDependency_4032,
							ServiceServiceServiceDependencyEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_SettingData_SettingsDefineCapabilities_4034(
			SettingData source) {
		Collection result = new LinkedList();
		for (Iterator destinations = source.getSettingsDefineCapabilities()
				.iterator(); destinations.hasNext();) {
			Capabilities destination = (Capabilities) destinations.next();
			result
					.add(new CIMLevelZeroLinkDescriptor(
							source,
							destination,
							CIMLevelZeroElementTypes.SettingDataSettingsDefineCapabilities_4034,
							SettingDataSettingsDefineCapabilitiesEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_ManagedSystemElement_StatusDescriptions_4035(
			ManagedSystemElement source) {
		Collection result = new LinkedList();
		for (Iterator destinations = source.getStatusDescriptions().iterator(); destinations
				.hasNext();) {
			StatusDescription destination = (StatusDescription) destinations
					.next();
			result
					.add(new CIMLevelZeroLinkDescriptor(
							source,
							destination,
							CIMLevelZeroElementTypes.ManagedSystemElementStatusDescriptions_4035,
							ManagedSystemElementStatusDescriptionsEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_System_SystemComponents_4036(
			System source) {
		Collection result = new LinkedList();
		for (Iterator destinations = source.getSystemComponents().iterator(); destinations
				.hasNext();) {
			ManagedElement destination = (ManagedElement) destinations.next();
			result.add(new CIMLevelZeroLinkDescriptor(source, destination,
					CIMLevelZeroElementTypes.SystemSystemComponents_4036,
					SystemSystemComponentsEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_System_SystemDevices_4037(
			System source) {
		Collection result = new LinkedList();
		for (Iterator destinations = source.getSystemDevices().iterator(); destinations
				.hasNext();) {
			LogicalDevice destination = (LogicalDevice) destinations.next();
			result.add(new CIMLevelZeroLinkDescriptor(source, destination,
					CIMLevelZeroElementTypes.SystemSystemDevices_4037,
					SystemSystemDevicesEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_LogicalModule_ModulePort_4038(
			LogicalModule source) {
		Collection result = new LinkedList();
		for (Iterator destinations = source.getModulePort().iterator(); destinations
				.hasNext();) {
			NetworkPort destination = (NetworkPort) destinations.next();
			result.add(new CIMLevelZeroLinkDescriptor(source, destination,
					CIMLevelZeroElementTypes.LogicalModuleModulePort_4038,
					LogicalModuleModulePortEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_AFService_AFRelatedServices_4039(
			AFService source) {
		Collection result = new LinkedList();
		for (Iterator destinations = source.getAFRelatedServices().iterator(); destinations
				.hasNext();) {
			AFService destination = (AFService) destinations.next();
			result.add(new CIMLevelZeroLinkDescriptor(source, destination,
					CIMLevelZeroElementTypes.AFServiceAFRelatedServices_4039,
					AFServiceAFRelatedServicesEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_QoSService_QoSConditioningSubService_4040(
			QoSService source) {
		Collection result = new LinkedList();
		for (Iterator destinations = source.getQoSConditioningSubService()
				.iterator(); destinations.hasNext();) {
			ConditioningService destination = (ConditioningService) destinations
					.next();
			result
					.add(new CIMLevelZeroLinkDescriptor(
							source,
							destination,
							CIMLevelZeroElementTypes.QoSServiceQoSConditioningSubService_4040,
							QoSServiceQoSConditioningSubServiceEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_QoSService_QoSSubService_4041(
			QoSService source) {
		Collection result = new LinkedList();
		for (Iterator destinations = source.getQoSSubService().iterator(); destinations
				.hasNext();) {
			QoSService destination = (QoSService) destinations.next();
			result.add(new CIMLevelZeroLinkDescriptor(source, destination,
					CIMLevelZeroElementTypes.QoSServiceQoSSubService_4041,
					QoSServiceQoSSubServiceEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_Collection_Members_4042(
			es.tid.cim.Collection source) {
		Collection result = new LinkedList();
		for (Iterator destinations = source.getMembers().iterator(); destinations
				.hasNext();) {
			ManagedElement destination = (ManagedElement) destinations.next();
			result.add(new CIMLevelZeroLinkDescriptor(source, destination,
					CIMLevelZeroElementTypes.CollectionMembers_4042,
					CollectionMembersEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_NATListBasedSettings_AddressesToBeTranslated_4043(
			NATListBasedSettings source) {
		Collection result = new LinkedList();
		FilterList destination = source.getAddressesToBeTranslated();
		if (destination == null) {
			return result;
		}
		result
				.add(new CIMLevelZeroLinkDescriptor(
						source,
						destination,
						CIMLevelZeroElementTypes.NATListBasedSettingsAddressesToBeTranslated_4043,
						NATListBasedSettingsAddressesToBeTranslatedEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_BGPService_BGPAdminDistance_4044(
			BGPService source) {
		Collection result = new LinkedList();
		AdministrativeDistance destination = source.getBGPAdminDistance();
		if (destination == null) {
			return result;
		}
		result.add(new CIMLevelZeroLinkDescriptor(source, destination,
				CIMLevelZeroElementTypes.BGPServiceBGPAdminDistance_4044,
				BGPServiceBGPAdminDistanceEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_ServiceAccessPoint_BindsToLANEndpoint_4045(
			ServiceAccessPoint source) {
		Collection result = new LinkedList();
		for (Iterator destinations = source.getBindsToLANEndpoint().iterator(); destinations
				.hasNext();) {
			LANEndpoint destination = (LANEndpoint) destinations.next();
			result
					.add(new CIMLevelZeroLinkDescriptor(
							source,
							destination,
							CIMLevelZeroElementTypes.ServiceAccessPointBindsToLANEndpoint_4045,
							ServiceAccessPointBindsToLANEndpointEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_RouteCalculationService_CalculatesAmong_4046(
			RouteCalculationService source) {
		Collection result = new LinkedList();
		for (Iterator destinations = source.getCalculatesAmong().iterator(); destinations
				.hasNext();) {
			ProtocolEndpoint destination = (ProtocolEndpoint) destinations
					.next();
			result
					.add(new CIMLevelZeroLinkDescriptor(
							source,
							destination,
							CIMLevelZeroElementTypes.RouteCalculationServiceCalculatesAmong_4046,
							RouteCalculationServiceCalculatesAmongEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_ProtocolEndpoint_EgressConditioningServiceOnEndpoint_4047(
			ProtocolEndpoint source) {
		Collection result = new LinkedList();
		for (Iterator destinations = source
				.getEgressConditioningServiceOnEndpoint().iterator(); destinations
				.hasNext();) {
			ConditioningService destination = (ConditioningService) destinations
					.next();
			result
					.add(new CIMLevelZeroLinkDescriptor(
							source,
							destination,
							CIMLevelZeroElementTypes.ProtocolEndpointEgressConditioningServiceOnEndpoint_4047,
							ProtocolEndpointEgressConditioningServiceOnEndpointEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_ForwardingService_ForwardedRoutes_4049(
			ForwardingService source) {
		Collection result = new LinkedList();
		for (Iterator destinations = source.getForwardedRoutes().iterator(); destinations
				.hasNext();) {
			IPRoute destination = (IPRoute) destinations.next();
			result
					.add(new CIMLevelZeroLinkDescriptor(
							source,
							destination,
							CIMLevelZeroElementTypes.ForwardingServiceForwardedRoutes_4049,
							ForwardingServiceForwardedRoutesEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_ForwardingService_ForwardsAmong_4050(
			ForwardingService source) {
		Collection result = new LinkedList();
		for (Iterator destinations = source.getForwardsAmong().iterator(); destinations
				.hasNext();) {
			ProtocolEndpoint destination = (ProtocolEndpoint) destinations
					.next();
			result
					.add(new CIMLevelZeroLinkDescriptor(
							source,
							destination,
							CIMLevelZeroElementTypes.ForwardingServiceForwardsAmong_4050,
							ForwardingServiceForwardsAmongEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_ComputerSystem_HostedFilterList_4051(
			ComputerSystem source) {
		Collection result = new LinkedList();
		for (Iterator destinations = source.getHostedFilterList().iterator(); destinations
				.hasNext();) {
			FilterList destination = (FilterList) destinations.next();
			result
					.add(new CIMLevelZeroLinkDescriptor(
							source,
							destination,
							CIMLevelZeroElementTypes.ComputerSystemHostedFilterList_4051,
							ComputerSystemHostedFilterListEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_ComputerSystem_HostedForwardingServices_4052(
			ComputerSystem source) {
		Collection result = new LinkedList();
		for (Iterator destinations = source.getHostedForwardingServices()
				.iterator(); destinations.hasNext();) {
			ForwardingService destination = (ForwardingService) destinations
					.next();
			result
					.add(new CIMLevelZeroLinkDescriptor(
							source,
							destination,
							CIMLevelZeroElementTypes.ComputerSystemHostedForwardingServices_4052,
							ComputerSystemHostedForwardingServicesEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_System_HostedRoute_4053(
			System source) {
		Collection result = new LinkedList();
		for (Iterator destinations = source.getHostedRoute().iterator(); destinations
				.hasNext();) {
			NextHopRoute destination = (NextHopRoute) destinations.next();
			result.add(new CIMLevelZeroLinkDescriptor(source, destination,
					CIMLevelZeroElementTypes.SystemHostedRoute_4053,
					SystemHostedRouteEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_ComputerSystem_HostedRoutingPolicy_4054(
			ComputerSystem source) {
		Collection result = new LinkedList();
		for (Iterator destinations = source.getHostedRoutingPolicy().iterator(); destinations
				.hasNext();) {
			RoutingPolicy destination = (RoutingPolicy) destinations.next();
			result
					.add(new CIMLevelZeroLinkDescriptor(
							source,
							destination,
							CIMLevelZeroElementTypes.ComputerSystemHostedRoutingPolicy_4054,
							ComputerSystemHostedRoutingPolicyEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_ProtocolEndpoint_IngressConditioningServiceOnEndpoint_4055(
			ProtocolEndpoint source) {
		Collection result = new LinkedList();
		for (Iterator destinations = source
				.getIngressConditioningServiceOnEndpoint().iterator(); destinations
				.hasNext();) {
			ConditioningService destination = (ConditioningService) destinations
					.next();
			result
					.add(new CIMLevelZeroLinkDescriptor(
							source,
							destination,
							CIMLevelZeroElementTypes.ProtocolEndpointIngressConditioningServiceOnEndpoint_4055,
							ProtocolEndpointIngressConditioningServiceOnEndpointEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_LogicalNetwork_InLogicalNetwork_4056(
			LogicalNetwork source) {
		Collection result = new LinkedList();
		for (Iterator destinations = source.getInLogicalNetwork().iterator(); destinations
				.hasNext();) {
			ProtocolEndpoint destination = (ProtocolEndpoint) destinations
					.next();
			result
					.add(new CIMLevelZeroLinkDescriptor(
							source,
							destination,
							CIMLevelZeroElementTypes.LogicalNetworkInLogicalNetwork_4056,
							LogicalNetworkInLogicalNetworkEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_LANSegment_InSegment_4057(
			LANSegment source) {
		Collection result = new LinkedList();
		for (Iterator destinations = source.getInSegment().iterator(); destinations
				.hasNext();) {
			LANEndpoint destination = (LANEndpoint) destinations.next();
			result.add(new CIMLevelZeroLinkDescriptor(source, destination,
					CIMLevelZeroElementTypes.LANSegmentInSegment_4057,
					LANSegmentInSegmentEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_NATService_NATServiceRunningOnEndpoint_4058(
			NATService source) {
		Collection result = new LinkedList();
		for (Iterator destinations = source.getNATServiceRunningOnEndpoint()
				.iterator(); destinations.hasNext();) {
			ProtocolEndpoint destination = (ProtocolEndpoint) destinations
					.next();
			result
					.add(new CIMLevelZeroLinkDescriptor(
							source,
							destination,
							CIMLevelZeroElementTypes.NATServiceNATServiceRunningOnEndpoint_4058,
							NATServiceNATServiceRunningOnEndpointEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_AdminDomain_NetworksInAdminDomain_4059(
			AdminDomain source) {
		Collection result = new LinkedList();
		for (Iterator destinations = source.getNetworksInAdminDomain()
				.iterator(); destinations.hasNext();) {
			LogicalNetwork destination = (LogicalNetwork) destinations.next();
			result
					.add(new CIMLevelZeroLinkDescriptor(
							source,
							destination,
							CIMLevelZeroElementTypes.AdminDomainNetworksInAdminDomain_4059,
							AdminDomainNetworksInAdminDomainEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_LogicalPort_PortImplementsEndPoint_4060(
			LogicalPort source) {
		Collection result = new LinkedList();
		for (Iterator destinations = source.getPortImplementsEndPoint()
				.iterator(); destinations.hasNext();) {
			ProtocolEndpoint destination = (ProtocolEndpoint) destinations
					.next();
			result
					.add(new CIMLevelZeroLinkDescriptor(
							source,
							destination,
							CIMLevelZeroElementTypes.LogicalPortPortImplementsEndPoint_4060,
							LogicalPortPortImplementsEndPointEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_LogicalDevice_PortOnDevice_4061(
			LogicalDevice source) {
		Collection result = new LinkedList();
		for (Iterator destinations = source.getPortOnDevice().iterator(); destinations
				.hasNext();) {
			LogicalPort destination = (LogicalPort) destinations.next();
			result.add(new CIMLevelZeroLinkDescriptor(source, destination,
					CIMLevelZeroElementTypes.LogicalDevicePortOnDevice_4061,
					LogicalDevicePortOnDeviceEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_ForwardingService_RouteForwardedByService_4062(
			ForwardingService source) {
		Collection result = new LinkedList();
		for (Iterator destinations = source.getRouteForwardedByService()
				.iterator(); destinations.hasNext();) {
			NextHopRouting destination = (NextHopRouting) destinations.next();
			result
					.add(new CIMLevelZeroLinkDescriptor(
							source,
							destination,
							CIMLevelZeroElementTypes.ForwardingServiceRouteForwardedByService_4062,
							ForwardingServiceRouteForwardedByServiceEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_AutonomousSystem_RouterInAS_4063(
			AutonomousSystem source) {
		Collection result = new LinkedList();
		for (Iterator destinations = source.getRouterInAS().iterator(); destinations
				.hasNext();) {
			ComputerSystem destination = (ComputerSystem) destinations.next();
			result.add(new CIMLevelZeroLinkDescriptor(source, destination,
					CIMLevelZeroElementTypes.AutonomousSystemRouterInAS_4063,
					AutonomousSystemRouterInASEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_BGPCluster_RoutersInBGPCluster_4064(
			BGPCluster source) {
		Collection result = new LinkedList();
		for (Iterator destinations = source.getRoutersInBGPCluster().iterator(); destinations
				.hasNext();) {
			ComputerSystem destination = (ComputerSystem) destinations.next();
			result
					.add(new CIMLevelZeroLinkDescriptor(
							source,
							destination,
							CIMLevelZeroElementTypes.BGPClusterRoutersInBGPCluster_4064,
							BGPClusterRoutersInBGPClusterEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_NextHopRoute_RouteUsesEndpoint_4065(
			NextHopRoute source) {
		Collection result = new LinkedList();
		ProtocolEndpoint destination = source.getRouteUsesEndpoint();
		if (destination == null) {
			return result;
		}
		result.add(new CIMLevelZeroLinkDescriptor(source, destination,
				CIMLevelZeroElementTypes.NextHopRouteRouteUsesEndpoint_4065,
				NextHopRouteRouteUsesEndpointEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_AutonomousSystem_RoutingProtocolDomainInAS_4066(
			AutonomousSystem source) {
		Collection result = new LinkedList();
		for (Iterator destinations = source.getRoutingProtocolDomainInAS()
				.iterator(); destinations.hasNext();) {
			RoutingProtocolDomain destination = (RoutingProtocolDomain) destinations
					.next();
			result
					.add(new CIMLevelZeroLinkDescriptor(
							source,
							destination,
							CIMLevelZeroElementTypes.AutonomousSystemRoutingProtocolDomainInAS_4066,
							AutonomousSystemRoutingProtocolDomainInASEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_ComputerSystem_RunningOS_4067(
			ComputerSystem source) {
		Collection result = new LinkedList();
		OperatingSystem destination = source.getRunningOS();
		if (destination == null) {
			return result;
		}
		result.add(new CIMLevelZeroLinkDescriptor(source, destination,
				CIMLevelZeroElementTypes.ComputerSystemRunningOS_4067,
				ComputerSystemRunningOSEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_Service_SoftwareFeatureServiceImplementation_4068(
			Service source) {
		Collection result = new LinkedList();
		for (Iterator destinations = source
				.getSoftwareFeatureServiceImplementation().iterator(); destinations
				.hasNext();) {
			SoftwareFeature destination = (SoftwareFeature) destinations.next();
			result
					.add(new CIMLevelZeroLinkDescriptor(
							source,
							destination,
							CIMLevelZeroElementTypes.ServiceSoftwareFeatureServiceImplementation_4068,
							ServiceSoftwareFeatureServiceImplementationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_NATListBasedSettings_TranslationPoolForNAT_4069(
			NATListBasedSettings source) {
		Collection result = new LinkedList();
		RangeOfIPAddresses destination = source.getTranslationPoolForNAT();
		if (destination == null) {
			return result;
		}
		result
				.add(new CIMLevelZeroLinkDescriptor(
						source,
						destination,
						CIMLevelZeroElementTypes.NATListBasedSettingsTranslationPoolForNAT_4069,
						NATListBasedSettingsTranslationPoolForNATEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_SNMPService_TrapSourceForSNMPService_4070(
			SNMPService source) {
		Collection result = new LinkedList();
		ProtocolEndpoint destination = source.getTrapSourceForSNMPService();
		if (destination == null) {
			return result;
		}
		result
				.add(new CIMLevelZeroLinkDescriptor(
						source,
						destination,
						CIMLevelZeroElementTypes.SNMPServiceTrapSourceForSNMPService_4070,
						SNMPServiceTrapSourceForSNMPServiceEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_NextHopRoute_AssociatedNextHop_4071(
			NextHopRoute source) {
		Collection result = new LinkedList();
		RemoteServiceAccessPoint destination = source.getAssociatedNextHop();
		if (destination == null) {
			return result;
		}
		result.add(new CIMLevelZeroLinkDescriptor(source, destination,
				CIMLevelZeroElementTypes.NextHopRouteAssociatedNextHop_4071,
				NextHopRouteAssociatedNextHopEditPart.VISUAL_ID));
		return result;
	}

}
