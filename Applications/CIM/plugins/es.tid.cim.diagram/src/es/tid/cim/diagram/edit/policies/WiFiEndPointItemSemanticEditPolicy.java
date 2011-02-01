package es.tid.cim.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.notation.View;

import es.tid.cim.diagram.edit.commands.CIM_ModelElementsCreateCommand;
import es.tid.cim.diagram.edit.commands.CIM_ModelElementsReorientCommand;
import es.tid.cim.diagram.edit.commands.CollectionMembersCreateCommand;
import es.tid.cim.diagram.edit.commands.CollectionMembersReorientCommand;
import es.tid.cim.diagram.edit.commands.ElementSoftwareIdentityManagedElementCreateCommand;
import es.tid.cim.diagram.edit.commands.ElementSoftwareIdentityManagedElementReorientCommand;
import es.tid.cim.diagram.edit.commands.EnabledLogicalElementRemoteAccessAvailableToElementCreateCommand;
import es.tid.cim.diagram.edit.commands.EnabledLogicalElementRemoteAccessAvailableToElementReorientCommand;
import es.tid.cim.diagram.edit.commands.ForwardingServiceForwardsAmongCreateCommand;
import es.tid.cim.diagram.edit.commands.ForwardingServiceForwardsAmongReorientCommand;
import es.tid.cim.diagram.edit.commands.LogicalDeviceDeviceSAPImplementationCreateCommand;
import es.tid.cim.diagram.edit.commands.LogicalDeviceDeviceSAPImplementationReorientCommand;
import es.tid.cim.diagram.edit.commands.LogicalNetworkInLogicalNetworkCreateCommand;
import es.tid.cim.diagram.edit.commands.LogicalNetworkInLogicalNetworkReorientCommand;
import es.tid.cim.diagram.edit.commands.LogicalPortPortImplementsEndPointCreateCommand;
import es.tid.cim.diagram.edit.commands.LogicalPortPortImplementsEndPointReorientCommand;
import es.tid.cim.diagram.edit.commands.ManagedElementComponentsCreateCommand;
import es.tid.cim.diagram.edit.commands.ManagedElementComponentsReorientCommand;
import es.tid.cim.diagram.edit.commands.ManagedElementDependenciesCreateCommand;
import es.tid.cim.diagram.edit.commands.ManagedElementDependenciesReorientCommand;
import es.tid.cim.diagram.edit.commands.ManagedElementElementCapabilitiesCreateCommand;
import es.tid.cim.diagram.edit.commands.ManagedElementElementCapabilitiesReorientCommand;
import es.tid.cim.diagram.edit.commands.ManagedElementElementSettingDataCreateCommand;
import es.tid.cim.diagram.edit.commands.ManagedElementElementSettingDataReorientCommand;
import es.tid.cim.diagram.edit.commands.ManagedElementHostedDependencyCreateCommand;
import es.tid.cim.diagram.edit.commands.ManagedElementHostedDependencyReorientCommand;
import es.tid.cim.diagram.edit.commands.ManagedSystemElementStatusDescriptionsCreateCommand;
import es.tid.cim.diagram.edit.commands.ManagedSystemElementStatusDescriptionsReorientCommand;
import es.tid.cim.diagram.edit.commands.NATServiceNATServiceRunningOnEndpointCreateCommand;
import es.tid.cim.diagram.edit.commands.NATServiceNATServiceRunningOnEndpointReorientCommand;
import es.tid.cim.diagram.edit.commands.NextHopRouteRouteUsesEndpointCreateCommand;
import es.tid.cim.diagram.edit.commands.NextHopRouteRouteUsesEndpointReorientCommand;
import es.tid.cim.diagram.edit.commands.ProtocolEndpointEgressConditioningServiceOnEndpointCreateCommand;
import es.tid.cim.diagram.edit.commands.ProtocolEndpointEgressConditioningServiceOnEndpointReorientCommand;
import es.tid.cim.diagram.edit.commands.ProtocolEndpointIngressConditioningServiceOnEndpointCreateCommand;
import es.tid.cim.diagram.edit.commands.ProtocolEndpointIngressConditioningServiceOnEndpointReorientCommand;
import es.tid.cim.diagram.edit.commands.RouteCalculationServiceCalculatesAmongCreateCommand;
import es.tid.cim.diagram.edit.commands.RouteCalculationServiceCalculatesAmongReorientCommand;
import es.tid.cim.diagram.edit.commands.SNMPServiceTrapSourceForSNMPServiceCreateCommand;
import es.tid.cim.diagram.edit.commands.SNMPServiceTrapSourceForSNMPServiceReorientCommand;
import es.tid.cim.diagram.edit.commands.ServiceAccessPointBindsToCreateCommand;
import es.tid.cim.diagram.edit.commands.ServiceAccessPointBindsToLANEndpointCreateCommand;
import es.tid.cim.diagram.edit.commands.ServiceAccessPointBindsToLANEndpointReorientCommand;
import es.tid.cim.diagram.edit.commands.ServiceAccessPointBindsToReorientCommand;
import es.tid.cim.diagram.edit.commands.ServiceAccessPointSAPSAPDependencyCreateCommand;
import es.tid.cim.diagram.edit.commands.ServiceAccessPointSAPSAPDependencyReorientCommand;
import es.tid.cim.diagram.edit.commands.ServiceServiceAccessBySAPCreateCommand;
import es.tid.cim.diagram.edit.commands.ServiceServiceAccessBySAPReorientCommand;
import es.tid.cim.diagram.edit.commands.SystemHostedAccessPointCreateCommand;
import es.tid.cim.diagram.edit.commands.SystemHostedAccessPointReorientCommand;
import es.tid.cim.diagram.edit.commands.SystemSystemComponentsCreateCommand;
import es.tid.cim.diagram.edit.commands.SystemSystemComponentsReorientCommand;
import es.tid.cim.diagram.edit.parts.CIM_ModelElementsEditPart;
import es.tid.cim.diagram.edit.parts.CollectionMembersEditPart;
import es.tid.cim.diagram.edit.parts.ElementSoftwareIdentityManagedElementEditPart;
import es.tid.cim.diagram.edit.parts.EnabledLogicalElementRemoteAccessAvailableToElementEditPart;
import es.tid.cim.diagram.edit.parts.ForwardingServiceForwardsAmongEditPart;
import es.tid.cim.diagram.edit.parts.LogicalDeviceDeviceSAPImplementationEditPart;
import es.tid.cim.diagram.edit.parts.LogicalNetworkInLogicalNetworkEditPart;
import es.tid.cim.diagram.edit.parts.LogicalPortPortImplementsEndPointEditPart;
import es.tid.cim.diagram.edit.parts.ManagedElementComponentsEditPart;
import es.tid.cim.diagram.edit.parts.ManagedElementDependenciesEditPart;
import es.tid.cim.diagram.edit.parts.ManagedElementElementCapabilitiesEditPart;
import es.tid.cim.diagram.edit.parts.ManagedElementElementSettingDataEditPart;
import es.tid.cim.diagram.edit.parts.ManagedElementHostedDependencyEditPart;
import es.tid.cim.diagram.edit.parts.ManagedSystemElementStatusDescriptionsEditPart;
import es.tid.cim.diagram.edit.parts.NATServiceNATServiceRunningOnEndpointEditPart;
import es.tid.cim.diagram.edit.parts.NextHopRouteRouteUsesEndpointEditPart;
import es.tid.cim.diagram.edit.parts.ProtocolEndpointEgressConditioningServiceOnEndpointEditPart;
import es.tid.cim.diagram.edit.parts.ProtocolEndpointIngressConditioningServiceOnEndpointEditPart;
import es.tid.cim.diagram.edit.parts.RouteCalculationServiceCalculatesAmongEditPart;
import es.tid.cim.diagram.edit.parts.SNMPServiceTrapSourceForSNMPServiceEditPart;
import es.tid.cim.diagram.edit.parts.ServiceAccessPointBindsToEditPart;
import es.tid.cim.diagram.edit.parts.ServiceAccessPointBindsToLANEndpointEditPart;
import es.tid.cim.diagram.edit.parts.ServiceAccessPointSAPSAPDependencyEditPart;
import es.tid.cim.diagram.edit.parts.ServiceServiceAccessBySAPEditPart;
import es.tid.cim.diagram.edit.parts.SystemHostedAccessPointEditPart;
import es.tid.cim.diagram.edit.parts.SystemSystemComponentsEditPart;
import es.tid.cim.diagram.providers.CIMLevelZeroElementTypes;

/**
 * @generated
 */
public class WiFiEndPointItemSemanticEditPolicy extends
		CIMLevelZeroBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		CompoundCommand cc = getDestroyEdgesCommand();
		addDestroyShortcutsCommand(cc);
		View view = (View) getHost().getModel();
		if (view.getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
			req.setElementToDestroy(view);
		}
		cc.add(getGEFWrapper(new DestroyElementCommand(req)));
		return cc.unwrap();
	}

	/**
	 * @generated
	 */
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		Command command = req.getTarget() == null ? getStartCreateRelationshipCommand(req)
				: getCompleteCreateRelationshipCommand(req);
		return command != null ? command : super
				.getCreateRelationshipCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getStartCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (CIMLevelZeroElementTypes.ServiceAccessPointBindsTo_4010 == req
				.getElementType()) {
			return getGEFWrapper(new ServiceAccessPointBindsToCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (CIMLevelZeroElementTypes.ManagedElementComponents_4011 == req
				.getElementType()) {
			return getGEFWrapper(new ManagedElementComponentsCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (CIMLevelZeroElementTypes.ManagedElementDependencies_4013 == req
				.getElementType()) {
			return getGEFWrapper(new ManagedElementDependenciesCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (CIMLevelZeroElementTypes.LogicalDeviceDeviceSAPImplementation_4016 == req
				.getElementType()) {
			return null;
		}
		if (CIMLevelZeroElementTypes.ManagedElementElementCapabilities_4017 == req
				.getElementType()) {
			return getGEFWrapper(new ManagedElementElementCapabilitiesCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (CIMLevelZeroElementTypes.ManagedElementElementSettingData_4018 == req
				.getElementType()) {
			return getGEFWrapper(new ManagedElementElementSettingDataCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (CIMLevelZeroElementTypes.SystemHostedAccessPoint_4020 == req
				.getElementType()) {
			return null;
		}
		if (CIMLevelZeroElementTypes.ManagedElementHostedDependency_4022 == req
				.getElementType()) {
			return getGEFWrapper(new ManagedElementHostedDependencyCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (CIMLevelZeroElementTypes.ElementSoftwareIdentityManagedElement_4024 == req
				.getElementType()) {
			return null;
		}
		if (CIMLevelZeroElementTypes.EnabledLogicalElementRemoteAccessAvailableToElement_4027 == req
				.getElementType()) {
			return getGEFWrapper(new EnabledLogicalElementRemoteAccessAvailableToElementCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (CIMLevelZeroElementTypes.ServiceAccessPointSAPSAPDependency_4029 == req
				.getElementType()) {
			return getGEFWrapper(new ServiceAccessPointSAPSAPDependencyCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (CIMLevelZeroElementTypes.ServiceServiceAccessBySAP_4030 == req
				.getElementType()) {
			return null;
		}
		if (CIMLevelZeroElementTypes.ManagedSystemElementStatusDescriptions_4035 == req
				.getElementType()) {
			return getGEFWrapper(new ManagedSystemElementStatusDescriptionsCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (CIMLevelZeroElementTypes.SystemSystemComponents_4036 == req
				.getElementType()) {
			return null;
		}
		if (CIMLevelZeroElementTypes.CollectionMembers_4042 == req
				.getElementType()) {
			return null;
		}
		if (CIMLevelZeroElementTypes.ServiceAccessPointBindsToLANEndpoint_4045 == req
				.getElementType()) {
			return getGEFWrapper(new ServiceAccessPointBindsToLANEndpointCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (CIMLevelZeroElementTypes.RouteCalculationServiceCalculatesAmong_4046 == req
				.getElementType()) {
			return null;
		}
		if (CIMLevelZeroElementTypes.ProtocolEndpointEgressConditioningServiceOnEndpoint_4047 == req
				.getElementType()) {
			return getGEFWrapper(new ProtocolEndpointEgressConditioningServiceOnEndpointCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (CIMLevelZeroElementTypes.CIM_ModelElements_4048 == req
				.getElementType()) {
			return null;
		}
		if (CIMLevelZeroElementTypes.ForwardingServiceForwardsAmong_4050 == req
				.getElementType()) {
			return null;
		}
		if (CIMLevelZeroElementTypes.ProtocolEndpointIngressConditioningServiceOnEndpoint_4055 == req
				.getElementType()) {
			return getGEFWrapper(new ProtocolEndpointIngressConditioningServiceOnEndpointCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (CIMLevelZeroElementTypes.LogicalNetworkInLogicalNetwork_4056 == req
				.getElementType()) {
			return null;
		}
		if (CIMLevelZeroElementTypes.NATServiceNATServiceRunningOnEndpoint_4058 == req
				.getElementType()) {
			return null;
		}
		if (CIMLevelZeroElementTypes.LogicalPortPortImplementsEndPoint_4060 == req
				.getElementType()) {
			return null;
		}
		if (CIMLevelZeroElementTypes.NextHopRouteRouteUsesEndpoint_4065 == req
				.getElementType()) {
			return null;
		}
		if (CIMLevelZeroElementTypes.SNMPServiceTrapSourceForSNMPService_4070 == req
				.getElementType()) {
			return null;
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (CIMLevelZeroElementTypes.ServiceAccessPointBindsTo_4010 == req
				.getElementType()) {
			return getGEFWrapper(new ServiceAccessPointBindsToCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (CIMLevelZeroElementTypes.ManagedElementComponents_4011 == req
				.getElementType()) {
			return getGEFWrapper(new ManagedElementComponentsCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (CIMLevelZeroElementTypes.ManagedElementDependencies_4013 == req
				.getElementType()) {
			return getGEFWrapper(new ManagedElementDependenciesCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (CIMLevelZeroElementTypes.LogicalDeviceDeviceSAPImplementation_4016 == req
				.getElementType()) {
			return getGEFWrapper(new LogicalDeviceDeviceSAPImplementationCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (CIMLevelZeroElementTypes.ManagedElementElementCapabilities_4017 == req
				.getElementType()) {
			return null;
		}
		if (CIMLevelZeroElementTypes.ManagedElementElementSettingData_4018 == req
				.getElementType()) {
			return null;
		}
		if (CIMLevelZeroElementTypes.SystemHostedAccessPoint_4020 == req
				.getElementType()) {
			return getGEFWrapper(new SystemHostedAccessPointCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (CIMLevelZeroElementTypes.ManagedElementHostedDependency_4022 == req
				.getElementType()) {
			return getGEFWrapper(new ManagedElementHostedDependencyCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (CIMLevelZeroElementTypes.ElementSoftwareIdentityManagedElement_4024 == req
				.getElementType()) {
			return getGEFWrapper(new ElementSoftwareIdentityManagedElementCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (CIMLevelZeroElementTypes.EnabledLogicalElementRemoteAccessAvailableToElement_4027 == req
				.getElementType()) {
			return null;
		}
		if (CIMLevelZeroElementTypes.ServiceAccessPointSAPSAPDependency_4029 == req
				.getElementType()) {
			return getGEFWrapper(new ServiceAccessPointSAPSAPDependencyCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (CIMLevelZeroElementTypes.ServiceServiceAccessBySAP_4030 == req
				.getElementType()) {
			return getGEFWrapper(new ServiceServiceAccessBySAPCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (CIMLevelZeroElementTypes.ManagedSystemElementStatusDescriptions_4035 == req
				.getElementType()) {
			return null;
		}
		if (CIMLevelZeroElementTypes.SystemSystemComponents_4036 == req
				.getElementType()) {
			return getGEFWrapper(new SystemSystemComponentsCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (CIMLevelZeroElementTypes.CollectionMembers_4042 == req
				.getElementType()) {
			return getGEFWrapper(new CollectionMembersCreateCommand(req, req
					.getSource(), req.getTarget()));
		}
		if (CIMLevelZeroElementTypes.ServiceAccessPointBindsToLANEndpoint_4045 == req
				.getElementType()) {
			return null;
		}
		if (CIMLevelZeroElementTypes.RouteCalculationServiceCalculatesAmong_4046 == req
				.getElementType()) {
			return getGEFWrapper(new RouteCalculationServiceCalculatesAmongCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (CIMLevelZeroElementTypes.ProtocolEndpointEgressConditioningServiceOnEndpoint_4047 == req
				.getElementType()) {
			return null;
		}
		if (CIMLevelZeroElementTypes.CIM_ModelElements_4048 == req
				.getElementType()) {
			return getGEFWrapper(new CIM_ModelElementsCreateCommand(req, req
					.getSource(), req.getTarget()));
		}
		if (CIMLevelZeroElementTypes.ForwardingServiceForwardsAmong_4050 == req
				.getElementType()) {
			return getGEFWrapper(new ForwardingServiceForwardsAmongCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (CIMLevelZeroElementTypes.ProtocolEndpointIngressConditioningServiceOnEndpoint_4055 == req
				.getElementType()) {
			return null;
		}
		if (CIMLevelZeroElementTypes.LogicalNetworkInLogicalNetwork_4056 == req
				.getElementType()) {
			return getGEFWrapper(new LogicalNetworkInLogicalNetworkCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (CIMLevelZeroElementTypes.NATServiceNATServiceRunningOnEndpoint_4058 == req
				.getElementType()) {
			return getGEFWrapper(new NATServiceNATServiceRunningOnEndpointCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (CIMLevelZeroElementTypes.LogicalPortPortImplementsEndPoint_4060 == req
				.getElementType()) {
			return getGEFWrapper(new LogicalPortPortImplementsEndPointCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (CIMLevelZeroElementTypes.NextHopRouteRouteUsesEndpoint_4065 == req
				.getElementType()) {
			return getGEFWrapper(new NextHopRouteRouteUsesEndpointCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (CIMLevelZeroElementTypes.SNMPServiceTrapSourceForSNMPService_4070 == req
				.getElementType()) {
			return getGEFWrapper(new SNMPServiceTrapSourceForSNMPServiceCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * Returns command to reorient EReference based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientReferenceRelationshipCommand(
			ReorientReferenceRelationshipRequest req) {
		switch (getVisualID(req)) {
		case ServiceAccessPointBindsToEditPart.VISUAL_ID:
			return getGEFWrapper(new ServiceAccessPointBindsToReorientCommand(
					req));
		case ManagedElementComponentsEditPart.VISUAL_ID:
			return getGEFWrapper(new ManagedElementComponentsReorientCommand(
					req));
		case ManagedElementDependenciesEditPart.VISUAL_ID:
			return getGEFWrapper(new ManagedElementDependenciesReorientCommand(
					req));
		case LogicalDeviceDeviceSAPImplementationEditPart.VISUAL_ID:
			return getGEFWrapper(new LogicalDeviceDeviceSAPImplementationReorientCommand(
					req));
		case ManagedElementElementCapabilitiesEditPart.VISUAL_ID:
			return getGEFWrapper(new ManagedElementElementCapabilitiesReorientCommand(
					req));
		case ManagedElementElementSettingDataEditPart.VISUAL_ID:
			return getGEFWrapper(new ManagedElementElementSettingDataReorientCommand(
					req));
		case SystemHostedAccessPointEditPart.VISUAL_ID:
			return getGEFWrapper(new SystemHostedAccessPointReorientCommand(req));
		case ManagedElementHostedDependencyEditPart.VISUAL_ID:
			return getGEFWrapper(new ManagedElementHostedDependencyReorientCommand(
					req));
		case ElementSoftwareIdentityManagedElementEditPart.VISUAL_ID:
			return getGEFWrapper(new ElementSoftwareIdentityManagedElementReorientCommand(
					req));
		case EnabledLogicalElementRemoteAccessAvailableToElementEditPart.VISUAL_ID:
			return getGEFWrapper(new EnabledLogicalElementRemoteAccessAvailableToElementReorientCommand(
					req));
		case ServiceAccessPointSAPSAPDependencyEditPart.VISUAL_ID:
			return getGEFWrapper(new ServiceAccessPointSAPSAPDependencyReorientCommand(
					req));
		case ServiceServiceAccessBySAPEditPart.VISUAL_ID:
			return getGEFWrapper(new ServiceServiceAccessBySAPReorientCommand(
					req));
		case ManagedSystemElementStatusDescriptionsEditPart.VISUAL_ID:
			return getGEFWrapper(new ManagedSystemElementStatusDescriptionsReorientCommand(
					req));
		case SystemSystemComponentsEditPart.VISUAL_ID:
			return getGEFWrapper(new SystemSystemComponentsReorientCommand(req));
		case CollectionMembersEditPart.VISUAL_ID:
			return getGEFWrapper(new CollectionMembersReorientCommand(req));
		case ServiceAccessPointBindsToLANEndpointEditPart.VISUAL_ID:
			return getGEFWrapper(new ServiceAccessPointBindsToLANEndpointReorientCommand(
					req));
		case RouteCalculationServiceCalculatesAmongEditPart.VISUAL_ID:
			return getGEFWrapper(new RouteCalculationServiceCalculatesAmongReorientCommand(
					req));
		case ProtocolEndpointEgressConditioningServiceOnEndpointEditPart.VISUAL_ID:
			return getGEFWrapper(new ProtocolEndpointEgressConditioningServiceOnEndpointReorientCommand(
					req));
		case CIM_ModelElementsEditPart.VISUAL_ID:
			return getGEFWrapper(new CIM_ModelElementsReorientCommand(req));
		case ForwardingServiceForwardsAmongEditPart.VISUAL_ID:
			return getGEFWrapper(new ForwardingServiceForwardsAmongReorientCommand(
					req));
		case ProtocolEndpointIngressConditioningServiceOnEndpointEditPart.VISUAL_ID:
			return getGEFWrapper(new ProtocolEndpointIngressConditioningServiceOnEndpointReorientCommand(
					req));
		case LogicalNetworkInLogicalNetworkEditPart.VISUAL_ID:
			return getGEFWrapper(new LogicalNetworkInLogicalNetworkReorientCommand(
					req));
		case NATServiceNATServiceRunningOnEndpointEditPart.VISUAL_ID:
			return getGEFWrapper(new NATServiceNATServiceRunningOnEndpointReorientCommand(
					req));
		case LogicalPortPortImplementsEndPointEditPart.VISUAL_ID:
			return getGEFWrapper(new LogicalPortPortImplementsEndPointReorientCommand(
					req));
		case NextHopRouteRouteUsesEndpointEditPart.VISUAL_ID:
			return getGEFWrapper(new NextHopRouteRouteUsesEndpointReorientCommand(
					req));
		case SNMPServiceTrapSourceForSNMPServiceEditPart.VISUAL_ID:
			return getGEFWrapper(new SNMPServiceTrapSourceForSNMPServiceReorientCommand(
					req));
		}
		return super.getReorientReferenceRelationshipCommand(req);
	}

}
