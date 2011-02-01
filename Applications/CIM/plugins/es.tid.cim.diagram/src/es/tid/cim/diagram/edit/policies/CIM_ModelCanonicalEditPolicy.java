package es.tid.cim.diagram.edit.policies;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.core.util.ViewUtil;
import org.eclipse.gmf.runtime.diagram.ui.commands.DeferredLayoutCommand;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CanonicalConnectionEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateConnectionViewRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.RequestConstants;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.View;

import es.tid.cim.diagram.edit.parts.ADSLModemEditPart;
import es.tid.cim.diagram.edit.parts.AFServiceEditPart;
import es.tid.cim.diagram.edit.parts.AdminDomainEditPart;
import es.tid.cim.diagram.edit.parts.AdministrativeDistanceEditPart;
import es.tid.cim.diagram.edit.parts.ApplicationSystemEditPart;
import es.tid.cim.diagram.edit.parts.AutonomousSystemEditPart;
import es.tid.cim.diagram.edit.parts.BGPClusterEditPart;
import es.tid.cim.diagram.edit.parts.BGPPeerGroupEditPart;
import es.tid.cim.diagram.edit.parts.BGPProtocolEndpointEditPart;
import es.tid.cim.diagram.edit.parts.BGPServiceEditPart;
import es.tid.cim.diagram.edit.parts.BIOSElementEditPart;
import es.tid.cim.diagram.edit.parts.BIOSFeatureEditPart;
import es.tid.cim.diagram.edit.parts.BufferPoolEditPart;
import es.tid.cim.diagram.edit.parts.CIM_ModelEditPart;
import es.tid.cim.diagram.edit.parts.CLPSettingDataEditPart;
import es.tid.cim.diagram.edit.parts.CableModemEditPart;
import es.tid.cim.diagram.edit.parts.ComputerSystemEditPart;
import es.tid.cim.diagram.edit.parts.ConditioningServiceEditPart;
import es.tid.cim.diagram.edit.parts.ConnectivityMemberhipSettingDataEditPart;
import es.tid.cim.diagram.edit.parts.DHCPCapabilitiesEditPart;
import es.tid.cim.diagram.edit.parts.DHCPProtocolEndpointEditPart;
import es.tid.cim.diagram.edit.parts.DNSProtocolEndpointEditPart;
import es.tid.cim.diagram.edit.parts.DNSSettingDataEditPart;
import es.tid.cim.diagram.edit.parts.DirectoryEditPart;
import es.tid.cim.diagram.edit.parts.DropThresholdCalculationServiceEditPart;
import es.tid.cim.diagram.edit.parts.EFServiceEditPart;
import es.tid.cim.diagram.edit.parts.EnabledLogicalElementCapabilitiesEditPart;
import es.tid.cim.diagram.edit.parts.EthernetPortEditPart;
import es.tid.cim.diagram.edit.parts.FileSpecificationEditPart;
import es.tid.cim.diagram.edit.parts.FilterEntryEditPart;
import es.tid.cim.diagram.edit.parts.FilterListEditPart;
import es.tid.cim.diagram.edit.parts.FlowServiceEditPart;
import es.tid.cim.diagram.edit.parts.GenericServiceEditPart;
import es.tid.cim.diagram.edit.parts.HDSLModemEditPart;
import es.tid.cim.diagram.edit.parts.Hdr8021PServiceEditPart;
import es.tid.cim.diagram.edit.parts.IPAddressRangeEditPart;
import es.tid.cim.diagram.edit.parts.IPConnectivitySubnetEditPart;
import es.tid.cim.diagram.edit.parts.IPHeadersFilterEditPart;
import es.tid.cim.diagram.edit.parts.IPProtocolEndpointEditPart;
import es.tid.cim.diagram.edit.parts.IPSubnetEditPart;
import es.tid.cim.diagram.edit.parts.IPXConnectivityNetworkEditPart;
import es.tid.cim.diagram.edit.parts.IPXNetworkEditPart;
import es.tid.cim.diagram.edit.parts.IPXProtocolEndpointEditPart;
import es.tid.cim.diagram.edit.parts.ISDNModemEditPart;
import es.tid.cim.diagram.edit.parts.LANConnectivitySegmentEditPart;
import es.tid.cim.diagram.edit.parts.LANEndpointEditPart;
import es.tid.cim.diagram.edit.parts.LANSegmentEditPart;
import es.tid.cim.diagram.edit.parts.LogicalFileEditPart;
import es.tid.cim.diagram.edit.parts.LogicalModuleEditPart;
import es.tid.cim.diagram.edit.parts.MPLSProtocolEndpointEditPart;
import es.tid.cim.diagram.edit.parts.MemoryCapacityEditPart;
import es.tid.cim.diagram.edit.parts.NATListBasedSettingsEditPart;
import es.tid.cim.diagram.edit.parts.NATServiceEditPart;
import es.tid.cim.diagram.edit.parts.NATStaticSettingsEditPart;
import es.tid.cim.diagram.edit.parts.NamedAddressCollectionEditPart;
import es.tid.cim.diagram.edit.parts.NetworkEditPart;
import es.tid.cim.diagram.edit.parts.NetworkPortEditPart;
import es.tid.cim.diagram.edit.parts.NextHopIPRouteEditPart;
import es.tid.cim.diagram.edit.parts.NextHopRoutingEditPart;
import es.tid.cim.diagram.edit.parts.OSPFProtocolEndpointEditPart;
import es.tid.cim.diagram.edit.parts.OSPFVirtualInterfaceEditPart;
import es.tid.cim.diagram.edit.parts.OperatingSystemEditPart;
import es.tid.cim.diagram.edit.parts.PowerManagementCapabilitiesEditPart;
import es.tid.cim.diagram.edit.parts.PrecedenceServiceEditPart;
import es.tid.cim.diagram.edit.parts.ProductEditPart;
import es.tid.cim.diagram.edit.parts.ProtocolServiceEditPart;
import es.tid.cim.diagram.edit.parts.RangeOfIPAddressesEditPart;
import es.tid.cim.diagram.edit.parts.RemoteServiceAccessPointEditPart;
import es.tid.cim.diagram.edit.parts.ReplacementSetEditPart;
import es.tid.cim.diagram.edit.parts.RoutingPolicyEditPart;
import es.tid.cim.diagram.edit.parts.RoutingProtocolDomainEditPart;
import es.tid.cim.diagram.edit.parts.SDSLModemEditPart;
import es.tid.cim.diagram.edit.parts.SNMPCommunityStringsEditPart;
import es.tid.cim.diagram.edit.parts.SNMPServiceEditPart;
import es.tid.cim.diagram.edit.parts.SNMPTrapTargetEditPart;
import es.tid.cim.diagram.edit.parts.SSHSettingDataEditPart;
import es.tid.cim.diagram.edit.parts.ServiceAccessURIEditPart;
import es.tid.cim.diagram.edit.parts.SoftwareIdentityEditPart;
import es.tid.cim.diagram.edit.parts.SwitchPortEditPart;
import es.tid.cim.diagram.edit.parts.SystemSpecificCollectionEditPart;
import es.tid.cim.diagram.edit.parts.TCPProtocolEndpointEditPart;
import es.tid.cim.diagram.edit.parts.TelnetProtocolEndpointEditPart;
import es.tid.cim.diagram.edit.parts.TelnetSettingDataEditPart;
import es.tid.cim.diagram.edit.parts.UDPProtocolEndpointEditPart;
import es.tid.cim.diagram.edit.parts.USBDeviceEditPart;
import es.tid.cim.diagram.edit.parts.USBPortEditPart;
import es.tid.cim.diagram.edit.parts.UniModemEditPart;
import es.tid.cim.diagram.edit.parts.UnitaryComputerSystemEditPart;
import es.tid.cim.diagram.edit.parts.VDSLModemEditPart;
import es.tid.cim.diagram.edit.parts.VolatileStorageEditPart;
import es.tid.cim.diagram.edit.parts.WiFiEndPointEditPart;
import es.tid.cim.diagram.edit.parts.WiFiEndpointSettingsEditPart;
import es.tid.cim.diagram.edit.parts.WiFiPortEditPart;
import es.tid.cim.diagram.edit.parts.WirelessLANEndpointEditPart;
import es.tid.cim.diagram.edit.parts.WirelessPortEditPart;
import es.tid.cim.diagram.part.CIMLevelZeroDiagramUpdater;
import es.tid.cim.diagram.part.CIMLevelZeroLinkDescriptor;
import es.tid.cim.diagram.part.CIMLevelZeroNodeDescriptor;
import es.tid.cim.diagram.part.CIMLevelZeroVisualIDRegistry;

/**
 * @generated
 */
public class CIM_ModelCanonicalEditPolicy extends CanonicalConnectionEditPolicy {

	/**
	 * @generated
	 */
	protected List getSemanticChildrenList() {
		View viewObject = (View) getHost().getModel();
		List result = new LinkedList();
		for (Iterator it = CIMLevelZeroDiagramUpdater
				.getCIM_Model_1000SemanticChildren(viewObject).iterator(); it
				.hasNext();) {
			result.add(((CIMLevelZeroNodeDescriptor) it.next())
					.getModelElement());
		}
		return result;
	}

	/**
	 * @generated
	 */
	protected boolean shouldDeleteView(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	protected boolean isOrphaned(Collection semanticChildren, final View view) {
		int visualID = CIMLevelZeroVisualIDRegistry.getVisualID(view);
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
			if (!semanticChildren.contains(view.getElement())) {
				return true;
			}
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected String getDefaultFactoryHint() {
		return null;
	}

	/**
	 * @generated
	 */
	protected List getSemanticConnectionsList() {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	protected EObject getSourceElement(EObject relationship) {
		return null;
	}

	/**
	 * @generated
	 */
	protected EObject getTargetElement(EObject relationship) {
		return null;
	}

	/**
	 * @generated
	 */
	protected boolean shouldIncludeConnection(Edge connector,
			Collection children) {
		return false;
	}

	/**
	 * @generated
	 */
	protected void refreshSemantic() {
		List createdViews = new LinkedList();
		createdViews.addAll(refreshSemanticChildren());
		List createdConnectionViews = new LinkedList();
		createdConnectionViews.addAll(refreshSemanticConnections());
		createdConnectionViews.addAll(refreshConnections());

		if (createdViews.size() > 1) {
			// perform a layout of the container
			DeferredLayoutCommand layoutCmd = new DeferredLayoutCommand(host()
					.getEditingDomain(), createdViews, host());
			executeCommand(new ICommandProxy(layoutCmd));
		}

		createdViews.addAll(createdConnectionViews);
		makeViewsImmutable(createdViews);
	}

	/**
	 * @generated
	 */
	private Diagram getDiagram() {
		return ((View) getHost().getModel()).getDiagram();
	}

	/**
	 * @generated
	 */
	private Collection refreshConnections() {
		Map domain2NotationMap = new HashMap();
		Collection linkDescriptors = collectAllLinks(getDiagram(),
				domain2NotationMap);
		Collection existingLinks = new LinkedList(getDiagram().getEdges());
		for (Iterator linksIterator = existingLinks.iterator(); linksIterator
				.hasNext();) {
			Edge nextDiagramLink = (Edge) linksIterator.next();
			int diagramLinkVisualID = CIMLevelZeroVisualIDRegistry
					.getVisualID(nextDiagramLink);
			if (diagramLinkVisualID == -1) {
				if (nextDiagramLink.getSource() != null
						&& nextDiagramLink.getTarget() != null) {
					linksIterator.remove();
				}
				continue;
			}
			EObject diagramLinkObject = nextDiagramLink.getElement();
			EObject diagramLinkSrc = nextDiagramLink.getSource().getElement();
			EObject diagramLinkDst = nextDiagramLink.getTarget().getElement();
			for (Iterator LinkDescriptorsIterator = linkDescriptors.iterator(); LinkDescriptorsIterator
					.hasNext();) {
				CIMLevelZeroLinkDescriptor nextLinkDescriptor = (CIMLevelZeroLinkDescriptor) LinkDescriptorsIterator
						.next();
				if (diagramLinkObject == nextLinkDescriptor.getModelElement()
						&& diagramLinkSrc == nextLinkDescriptor.getSource()
						&& diagramLinkDst == nextLinkDescriptor
								.getDestination()
						&& diagramLinkVisualID == nextLinkDescriptor
								.getVisualID()) {
					linksIterator.remove();
					LinkDescriptorsIterator.remove();
				}
			}
		}
		deleteViews(existingLinks.iterator());
		return createConnections(linkDescriptors, domain2NotationMap);
	}

	/**
	 * @generated
	 */
	private Collection collectAllLinks(View view, Map domain2NotationMap) {
		if (!CIM_ModelEditPart.MODEL_ID.equals(CIMLevelZeroVisualIDRegistry
				.getModelID(view))) {
			return Collections.EMPTY_LIST;
		}
		Collection result = new LinkedList();
		switch (CIMLevelZeroVisualIDRegistry.getVisualID(view)) {
		case CIM_ModelEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(CIMLevelZeroDiagramUpdater
						.getCIM_Model_1000ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case USBDeviceEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(CIMLevelZeroDiagramUpdater
						.getUSBDevice_2001ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case OSPFVirtualInterfaceEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(CIMLevelZeroDiagramUpdater
						.getOSPFVirtualInterface_2002ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case WiFiPortEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(CIMLevelZeroDiagramUpdater
						.getWiFiPort_2003ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case ProtocolServiceEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(CIMLevelZeroDiagramUpdater
						.getProtocolService_2004ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case RoutingPolicyEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(CIMLevelZeroDiagramUpdater
						.getRoutingPolicy_2005ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case EnabledLogicalElementCapabilitiesEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result
						.addAll(CIMLevelZeroDiagramUpdater
								.getEnabledLogicalElementCapabilities_2006ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case BufferPoolEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(CIMLevelZeroDiagramUpdater
						.getBufferPool_2007ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case MPLSProtocolEndpointEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(CIMLevelZeroDiagramUpdater
						.getMPLSProtocolEndpoint_2008ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case AutonomousSystemEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(CIMLevelZeroDiagramUpdater
						.getAutonomousSystem_2009ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case DNSSettingDataEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(CIMLevelZeroDiagramUpdater
						.getDNSSettingData_2010ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case UniModemEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(CIMLevelZeroDiagramUpdater
						.getUniModem_2011ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case EFServiceEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(CIMLevelZeroDiagramUpdater
						.getEFService_2012ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case IPSubnetEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(CIMLevelZeroDiagramUpdater
						.getIPSubnet_2013ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case NamedAddressCollectionEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(CIMLevelZeroDiagramUpdater
						.getNamedAddressCollection_2014ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case BIOSElementEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(CIMLevelZeroDiagramUpdater
						.getBIOSElement_2015ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case TelnetSettingDataEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(CIMLevelZeroDiagramUpdater
						.getTelnetSettingData_2016ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case BGPPeerGroupEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(CIMLevelZeroDiagramUpdater
						.getBGPPeerGroup_2017ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case LANConnectivitySegmentEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(CIMLevelZeroDiagramUpdater
						.getLANConnectivitySegment_2018ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case CableModemEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(CIMLevelZeroDiagramUpdater
						.getCableModem_2019ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case SwitchPortEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(CIMLevelZeroDiagramUpdater
						.getSwitchPort_2020ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case TCPProtocolEndpointEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(CIMLevelZeroDiagramUpdater
						.getTCPProtocolEndpoint_2021ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case AdministrativeDistanceEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(CIMLevelZeroDiagramUpdater
						.getAdministrativeDistance_2022ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case IPConnectivitySubnetEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(CIMLevelZeroDiagramUpdater
						.getIPConnectivitySubnet_2023ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case VolatileStorageEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(CIMLevelZeroDiagramUpdater
						.getVolatileStorage_2024ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case RangeOfIPAddressesEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(CIMLevelZeroDiagramUpdater
						.getRangeOfIPAddresses_2025ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case BGPProtocolEndpointEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(CIMLevelZeroDiagramUpdater
						.getBGPProtocolEndpoint_2026ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case UnitaryComputerSystemEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(CIMLevelZeroDiagramUpdater
						.getUnitaryComputerSystem_2027ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case EthernetPortEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(CIMLevelZeroDiagramUpdater
						.getEthernetPort_2028ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case SNMPServiceEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(CIMLevelZeroDiagramUpdater
						.getSNMPService_2029ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case LogicalModuleEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(CIMLevelZeroDiagramUpdater
						.getLogicalModule_2030ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case NextHopIPRouteEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(CIMLevelZeroDiagramUpdater
						.getNextHopIPRoute_2031ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case OperatingSystemEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(CIMLevelZeroDiagramUpdater
						.getOperatingSystem_2032ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case SDSLModemEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(CIMLevelZeroDiagramUpdater
						.getSDSLModem_2033ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case WiFiEndPointEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(CIMLevelZeroDiagramUpdater
						.getWiFiEndPoint_2034ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case NATServiceEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(CIMLevelZeroDiagramUpdater
						.getNATService_2035ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case ADSLModemEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(CIMLevelZeroDiagramUpdater
						.getADSLModem_2036ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case LogicalFileEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(CIMLevelZeroDiagramUpdater
						.getLogicalFile_2037ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case BGPClusterEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(CIMLevelZeroDiagramUpdater
						.getBGPCluster_2038ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case ApplicationSystemEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(CIMLevelZeroDiagramUpdater
						.getApplicationSystem_2039ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case SoftwareIdentityEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(CIMLevelZeroDiagramUpdater
						.getSoftwareIdentity_2040ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case WirelessPortEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(CIMLevelZeroDiagramUpdater
						.getWirelessPort_2041ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case CLPSettingDataEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(CIMLevelZeroDiagramUpdater
						.getCLPSettingData_2042ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case GenericServiceEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(CIMLevelZeroDiagramUpdater
						.getGenericService_2043ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case NATListBasedSettingsEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(CIMLevelZeroDiagramUpdater
						.getNATListBasedSettings_2044ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case VDSLModemEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(CIMLevelZeroDiagramUpdater
						.getVDSLModem_2045ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case USBPortEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(CIMLevelZeroDiagramUpdater
						.getUSBPort_2046ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case DNSProtocolEndpointEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(CIMLevelZeroDiagramUpdater
						.getDNSProtocolEndpoint_2047ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case WiFiEndpointSettingsEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(CIMLevelZeroDiagramUpdater
						.getWiFiEndpointSettings_2048ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case SSHSettingDataEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(CIMLevelZeroDiagramUpdater
						.getSSHSettingData_2049ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case WirelessLANEndpointEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(CIMLevelZeroDiagramUpdater
						.getWirelessLANEndpoint_2050ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case DHCPProtocolEndpointEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(CIMLevelZeroDiagramUpdater
						.getDHCPProtocolEndpoint_2051ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case IPHeadersFilterEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(CIMLevelZeroDiagramUpdater
						.getIPHeadersFilter_2052ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case DirectoryEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(CIMLevelZeroDiagramUpdater
						.getDirectory_2053ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case IPAddressRangeEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(CIMLevelZeroDiagramUpdater
						.getIPAddressRange_2054ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case SNMPTrapTargetEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(CIMLevelZeroDiagramUpdater
						.getSNMPTrapTarget_2055ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case IPXConnectivityNetworkEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(CIMLevelZeroDiagramUpdater
						.getIPXConnectivityNetwork_2056ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case ConnectivityMemberhipSettingDataEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result
						.addAll(CIMLevelZeroDiagramUpdater
								.getConnectivityMemberhipSettingData_2057ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case ConditioningServiceEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(CIMLevelZeroDiagramUpdater
						.getConditioningService_2058ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case BIOSFeatureEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(CIMLevelZeroDiagramUpdater
						.getBIOSFeature_2059ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case OSPFProtocolEndpointEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(CIMLevelZeroDiagramUpdater
						.getOSPFProtocolEndpoint_2060ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case FilterListEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(CIMLevelZeroDiagramUpdater
						.getFilterList_2061ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case BGPServiceEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(CIMLevelZeroDiagramUpdater
						.getBGPService_2062ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case PrecedenceServiceEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(CIMLevelZeroDiagramUpdater
						.getPrecedenceService_2063ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case DHCPCapabilitiesEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(CIMLevelZeroDiagramUpdater
						.getDHCPCapabilities_2064ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case Hdr8021PServiceEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(CIMLevelZeroDiagramUpdater
						.getHdr8021PService_2065ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case ReplacementSetEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(CIMLevelZeroDiagramUpdater
						.getReplacementSet_2066ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case HDSLModemEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(CIMLevelZeroDiagramUpdater
						.getHDSLModem_2067ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case ServiceAccessURIEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(CIMLevelZeroDiagramUpdater
						.getServiceAccessURI_2068ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case FilterEntryEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(CIMLevelZeroDiagramUpdater
						.getFilterEntry_2069ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case SNMPCommunityStringsEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(CIMLevelZeroDiagramUpdater
						.getSNMPCommunityStrings_2070ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case NetworkEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(CIMLevelZeroDiagramUpdater
						.getNetwork_2071ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case FileSpecificationEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(CIMLevelZeroDiagramUpdater
						.getFileSpecification_2072ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case IPXNetworkEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(CIMLevelZeroDiagramUpdater
						.getIPXNetwork_2073ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case PowerManagementCapabilitiesEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result
						.addAll(CIMLevelZeroDiagramUpdater
								.getPowerManagementCapabilities_2074ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case FlowServiceEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(CIMLevelZeroDiagramUpdater
						.getFlowService_2075ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case ISDNModemEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(CIMLevelZeroDiagramUpdater
						.getISDNModem_2076ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case IPXProtocolEndpointEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(CIMLevelZeroDiagramUpdater
						.getIPXProtocolEndpoint_2077ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case IPProtocolEndpointEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(CIMLevelZeroDiagramUpdater
						.getIPProtocolEndpoint_2078ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case UDPProtocolEndpointEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(CIMLevelZeroDiagramUpdater
						.getUDPProtocolEndpoint_2079ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case ProductEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(CIMLevelZeroDiagramUpdater
						.getProduct_2080ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case MemoryCapacityEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(CIMLevelZeroDiagramUpdater
						.getMemoryCapacity_2081ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case RoutingProtocolDomainEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(CIMLevelZeroDiagramUpdater
						.getRoutingProtocolDomain_2082ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case AFServiceEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(CIMLevelZeroDiagramUpdater
						.getAFService_2083ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case LANSegmentEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(CIMLevelZeroDiagramUpdater
						.getLANSegment_2084ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case NATStaticSettingsEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(CIMLevelZeroDiagramUpdater
						.getNATStaticSettings_2085ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case TelnetProtocolEndpointEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(CIMLevelZeroDiagramUpdater
						.getTelnetProtocolEndpoint_2086ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case LANEndpointEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(CIMLevelZeroDiagramUpdater
						.getLANEndpoint_2087ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case DropThresholdCalculationServiceEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result
						.addAll(CIMLevelZeroDiagramUpdater
								.getDropThresholdCalculationService_2088ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case AdminDomainEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(CIMLevelZeroDiagramUpdater
						.getAdminDomain_2089ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case SystemSpecificCollectionEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(CIMLevelZeroDiagramUpdater
						.getSystemSpecificCollection_2090ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case NextHopRoutingEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(CIMLevelZeroDiagramUpdater
						.getNextHopRouting_2091ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case ComputerSystemEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(CIMLevelZeroDiagramUpdater
						.getComputerSystem_2092ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case NetworkPortEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(CIMLevelZeroDiagramUpdater
						.getNetworkPort_2093ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case RemoteServiceAccessPointEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(CIMLevelZeroDiagramUpdater
						.getRemoteServiceAccessPoint_2094ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		}
		for (Iterator children = view.getChildren().iterator(); children
				.hasNext();) {
			result.addAll(collectAllLinks((View) children.next(),
					domain2NotationMap));
		}
		for (Iterator edges = view.getSourceEdges().iterator(); edges.hasNext();) {
			result.addAll(collectAllLinks((View) edges.next(),
					domain2NotationMap));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection createConnections(Collection linkDescriptors,
			Map domain2NotationMap) {
		List adapters = new LinkedList();
		for (Iterator linkDescriptorsIterator = linkDescriptors.iterator(); linkDescriptorsIterator
				.hasNext();) {
			final CIMLevelZeroLinkDescriptor nextLinkDescriptor = (CIMLevelZeroLinkDescriptor) linkDescriptorsIterator
					.next();
			EditPart sourceEditPart = getEditPart(nextLinkDescriptor
					.getSource(), domain2NotationMap);
			EditPart targetEditPart = getEditPart(nextLinkDescriptor
					.getDestination(), domain2NotationMap);
			if (sourceEditPart == null || targetEditPart == null) {
				continue;
			}
			CreateConnectionViewRequest.ConnectionViewDescriptor descriptor = new CreateConnectionViewRequest.ConnectionViewDescriptor(
					nextLinkDescriptor.getSemanticAdapter(), null,
					ViewUtil.APPEND, false, ((IGraphicalEditPart) getHost())
							.getDiagramPreferencesHint());
			CreateConnectionViewRequest ccr = new CreateConnectionViewRequest(
					descriptor);
			ccr.setType(RequestConstants.REQ_CONNECTION_START);
			ccr.setSourceEditPart(sourceEditPart);
			sourceEditPart.getCommand(ccr);
			ccr.setTargetEditPart(targetEditPart);
			ccr.setType(RequestConstants.REQ_CONNECTION_END);
			Command cmd = targetEditPart.getCommand(ccr);
			if (cmd != null && cmd.canExecute()) {
				executeCommand(cmd);
				IAdaptable viewAdapter = (IAdaptable) ccr.getNewObject();
				if (viewAdapter != null) {
					adapters.add(viewAdapter);
				}
			}
		}
		return adapters;
	}

	/**
	 * @generated
	 */
	private EditPart getEditPart(EObject domainModelElement,
			Map domain2NotationMap) {
		View view = (View) domain2NotationMap.get(domainModelElement);
		if (view != null) {
			return (EditPart) getHost().getViewer().getEditPartRegistry().get(
					view);
		}
		return null;
	}
}
