package es.tid.cim.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.notation.View;

import es.tid.cim.diagram.edit.commands.AutonomousSystemRouterInASCreateCommand;
import es.tid.cim.diagram.edit.commands.AutonomousSystemRouterInASReorientCommand;
import es.tid.cim.diagram.edit.commands.BGPClusterRoutersInBGPClusterCreateCommand;
import es.tid.cim.diagram.edit.commands.BGPClusterRoutersInBGPClusterReorientCommand;
import es.tid.cim.diagram.edit.commands.CIM_ModelElementsCreateCommand;
import es.tid.cim.diagram.edit.commands.CIM_ModelElementsReorientCommand;
import es.tid.cim.diagram.edit.commands.CollectionMembersCreateCommand;
import es.tid.cim.diagram.edit.commands.CollectionMembersReorientCommand;
import es.tid.cim.diagram.edit.commands.ComputerSystemHostedFilterListCreateCommand;
import es.tid.cim.diagram.edit.commands.ComputerSystemHostedFilterListReorientCommand;
import es.tid.cim.diagram.edit.commands.ComputerSystemHostedForwardingServicesCreateCommand;
import es.tid.cim.diagram.edit.commands.ComputerSystemHostedForwardingServicesReorientCommand;
import es.tid.cim.diagram.edit.commands.ComputerSystemHostedRoutingPolicyCreateCommand;
import es.tid.cim.diagram.edit.commands.ComputerSystemHostedRoutingPolicyReorientCommand;
import es.tid.cim.diagram.edit.commands.ComputerSystemRunningOSCreateCommand;
import es.tid.cim.diagram.edit.commands.ComputerSystemRunningOSReorientCommand;
import es.tid.cim.diagram.edit.commands.ElementSoftwareIdentityManagedElementCreateCommand;
import es.tid.cim.diagram.edit.commands.ElementSoftwareIdentityManagedElementReorientCommand;
import es.tid.cim.diagram.edit.commands.EnabledLogicalElementRemoteAccessAvailableToElementCreateCommand;
import es.tid.cim.diagram.edit.commands.EnabledLogicalElementRemoteAccessAvailableToElementReorientCommand;
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
import es.tid.cim.diagram.edit.commands.SystemHostedAccessPointCreateCommand;
import es.tid.cim.diagram.edit.commands.SystemHostedAccessPointReorientCommand;
import es.tid.cim.diagram.edit.commands.SystemHostedCollectionCreateCommand;
import es.tid.cim.diagram.edit.commands.SystemHostedCollectionReorientCommand;
import es.tid.cim.diagram.edit.commands.SystemHostedRouteCreateCommand;
import es.tid.cim.diagram.edit.commands.SystemHostedRouteReorientCommand;
import es.tid.cim.diagram.edit.commands.SystemHostedServicesCreateCommand;
import es.tid.cim.diagram.edit.commands.SystemHostedServicesReorientCommand;
import es.tid.cim.diagram.edit.commands.SystemRolesCreateCommand;
import es.tid.cim.diagram.edit.commands.SystemRolesReorientCommand;
import es.tid.cim.diagram.edit.commands.SystemSystemComponentsCreateCommand;
import es.tid.cim.diagram.edit.commands.SystemSystemComponentsReorientCommand;
import es.tid.cim.diagram.edit.commands.SystemSystemDevicesCreateCommand;
import es.tid.cim.diagram.edit.commands.SystemSystemDevicesReorientCommand;
import es.tid.cim.diagram.edit.parts.AutonomousSystemRouterInASEditPart;
import es.tid.cim.diagram.edit.parts.BGPClusterRoutersInBGPClusterEditPart;
import es.tid.cim.diagram.edit.parts.CIM_ModelElementsEditPart;
import es.tid.cim.diagram.edit.parts.CollectionMembersEditPart;
import es.tid.cim.diagram.edit.parts.ComputerSystemHostedFilterListEditPart;
import es.tid.cim.diagram.edit.parts.ComputerSystemHostedForwardingServicesEditPart;
import es.tid.cim.diagram.edit.parts.ComputerSystemHostedRoutingPolicyEditPart;
import es.tid.cim.diagram.edit.parts.ComputerSystemRunningOSEditPart;
import es.tid.cim.diagram.edit.parts.ElementSoftwareIdentityManagedElementEditPart;
import es.tid.cim.diagram.edit.parts.EnabledLogicalElementRemoteAccessAvailableToElementEditPart;
import es.tid.cim.diagram.edit.parts.ManagedElementComponentsEditPart;
import es.tid.cim.diagram.edit.parts.ManagedElementDependenciesEditPart;
import es.tid.cim.diagram.edit.parts.ManagedElementElementCapabilitiesEditPart;
import es.tid.cim.diagram.edit.parts.ManagedElementElementSettingDataEditPart;
import es.tid.cim.diagram.edit.parts.ManagedElementHostedDependencyEditPart;
import es.tid.cim.diagram.edit.parts.ManagedSystemElementStatusDescriptionsEditPart;
import es.tid.cim.diagram.edit.parts.SystemHostedAccessPointEditPart;
import es.tid.cim.diagram.edit.parts.SystemHostedCollectionEditPart;
import es.tid.cim.diagram.edit.parts.SystemHostedRouteEditPart;
import es.tid.cim.diagram.edit.parts.SystemHostedServicesEditPart;
import es.tid.cim.diagram.edit.parts.SystemRolesEditPart;
import es.tid.cim.diagram.edit.parts.SystemSystemComponentsEditPart;
import es.tid.cim.diagram.edit.parts.SystemSystemDevicesEditPart;
import es.tid.cim.diagram.providers.CIMLevelZeroElementTypes;

/**
 * @generated
 */
public class UnitaryComputerSystemItemSemanticEditPolicy extends
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
			return getGEFWrapper(new SystemHostedAccessPointCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (CIMLevelZeroElementTypes.SystemHostedCollection_4021 == req
				.getElementType()) {
			return getGEFWrapper(new SystemHostedCollectionCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (CIMLevelZeroElementTypes.ManagedElementHostedDependency_4022 == req
				.getElementType()) {
			return getGEFWrapper(new ManagedElementHostedDependencyCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (CIMLevelZeroElementTypes.SystemHostedServices_4023 == req
				.getElementType()) {
			return getGEFWrapper(new SystemHostedServicesCreateCommand(req, req
					.getSource(), req.getTarget()));
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
		if (CIMLevelZeroElementTypes.SystemRoles_4028 == req.getElementType()) {
			return getGEFWrapper(new SystemRolesCreateCommand(req, req
					.getSource(), req.getTarget()));
		}
		if (CIMLevelZeroElementTypes.ManagedSystemElementStatusDescriptions_4035 == req
				.getElementType()) {
			return getGEFWrapper(new ManagedSystemElementStatusDescriptionsCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (CIMLevelZeroElementTypes.SystemSystemComponents_4036 == req
				.getElementType()) {
			return getGEFWrapper(new SystemSystemComponentsCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (CIMLevelZeroElementTypes.SystemSystemDevices_4037 == req
				.getElementType()) {
			return getGEFWrapper(new SystemSystemDevicesCreateCommand(req, req
					.getSource(), req.getTarget()));
		}
		if (CIMLevelZeroElementTypes.CollectionMembers_4042 == req
				.getElementType()) {
			return null;
		}
		if (CIMLevelZeroElementTypes.CIM_ModelElements_4048 == req
				.getElementType()) {
			return null;
		}
		if (CIMLevelZeroElementTypes.ComputerSystemHostedFilterList_4051 == req
				.getElementType()) {
			return getGEFWrapper(new ComputerSystemHostedFilterListCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (CIMLevelZeroElementTypes.ComputerSystemHostedForwardingServices_4052 == req
				.getElementType()) {
			return getGEFWrapper(new ComputerSystemHostedForwardingServicesCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (CIMLevelZeroElementTypes.SystemHostedRoute_4053 == req
				.getElementType()) {
			return getGEFWrapper(new SystemHostedRouteCreateCommand(req, req
					.getSource(), req.getTarget()));
		}
		if (CIMLevelZeroElementTypes.ComputerSystemHostedRoutingPolicy_4054 == req
				.getElementType()) {
			return getGEFWrapper(new ComputerSystemHostedRoutingPolicyCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (CIMLevelZeroElementTypes.AutonomousSystemRouterInAS_4063 == req
				.getElementType()) {
			return null;
		}
		if (CIMLevelZeroElementTypes.BGPClusterRoutersInBGPCluster_4064 == req
				.getElementType()) {
			return null;
		}
		if (CIMLevelZeroElementTypes.ComputerSystemRunningOS_4067 == req
				.getElementType()) {
			return getGEFWrapper(new ComputerSystemRunningOSCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(
			CreateRelationshipRequest req) {
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
			return null;
		}
		if (CIMLevelZeroElementTypes.SystemHostedCollection_4021 == req
				.getElementType()) {
			return null;
		}
		if (CIMLevelZeroElementTypes.ManagedElementHostedDependency_4022 == req
				.getElementType()) {
			return getGEFWrapper(new ManagedElementHostedDependencyCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (CIMLevelZeroElementTypes.SystemHostedServices_4023 == req
				.getElementType()) {
			return null;
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
		if (CIMLevelZeroElementTypes.SystemRoles_4028 == req.getElementType()) {
			return null;
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
		if (CIMLevelZeroElementTypes.SystemSystemDevices_4037 == req
				.getElementType()) {
			return null;
		}
		if (CIMLevelZeroElementTypes.CollectionMembers_4042 == req
				.getElementType()) {
			return getGEFWrapper(new CollectionMembersCreateCommand(req, req
					.getSource(), req.getTarget()));
		}
		if (CIMLevelZeroElementTypes.CIM_ModelElements_4048 == req
				.getElementType()) {
			return getGEFWrapper(new CIM_ModelElementsCreateCommand(req, req
					.getSource(), req.getTarget()));
		}
		if (CIMLevelZeroElementTypes.ComputerSystemHostedFilterList_4051 == req
				.getElementType()) {
			return null;
		}
		if (CIMLevelZeroElementTypes.ComputerSystemHostedForwardingServices_4052 == req
				.getElementType()) {
			return null;
		}
		if (CIMLevelZeroElementTypes.SystemHostedRoute_4053 == req
				.getElementType()) {
			return null;
		}
		if (CIMLevelZeroElementTypes.ComputerSystemHostedRoutingPolicy_4054 == req
				.getElementType()) {
			return null;
		}
		if (CIMLevelZeroElementTypes.AutonomousSystemRouterInAS_4063 == req
				.getElementType()) {
			return getGEFWrapper(new AutonomousSystemRouterInASCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (CIMLevelZeroElementTypes.BGPClusterRoutersInBGPCluster_4064 == req
				.getElementType()) {
			return getGEFWrapper(new BGPClusterRoutersInBGPClusterCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (CIMLevelZeroElementTypes.ComputerSystemRunningOS_4067 == req
				.getElementType()) {
			return null;
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
		case ManagedElementComponentsEditPart.VISUAL_ID:
			return getGEFWrapper(new ManagedElementComponentsReorientCommand(
					req));
		case ManagedElementDependenciesEditPart.VISUAL_ID:
			return getGEFWrapper(new ManagedElementDependenciesReorientCommand(
					req));
		case ManagedElementElementCapabilitiesEditPart.VISUAL_ID:
			return getGEFWrapper(new ManagedElementElementCapabilitiesReorientCommand(
					req));
		case ManagedElementElementSettingDataEditPart.VISUAL_ID:
			return getGEFWrapper(new ManagedElementElementSettingDataReorientCommand(
					req));
		case SystemHostedAccessPointEditPart.VISUAL_ID:
			return getGEFWrapper(new SystemHostedAccessPointReorientCommand(req));
		case SystemHostedCollectionEditPart.VISUAL_ID:
			return getGEFWrapper(new SystemHostedCollectionReorientCommand(req));
		case ManagedElementHostedDependencyEditPart.VISUAL_ID:
			return getGEFWrapper(new ManagedElementHostedDependencyReorientCommand(
					req));
		case SystemHostedServicesEditPart.VISUAL_ID:
			return getGEFWrapper(new SystemHostedServicesReorientCommand(req));
		case ElementSoftwareIdentityManagedElementEditPart.VISUAL_ID:
			return getGEFWrapper(new ElementSoftwareIdentityManagedElementReorientCommand(
					req));
		case EnabledLogicalElementRemoteAccessAvailableToElementEditPart.VISUAL_ID:
			return getGEFWrapper(new EnabledLogicalElementRemoteAccessAvailableToElementReorientCommand(
					req));
		case SystemRolesEditPart.VISUAL_ID:
			return getGEFWrapper(new SystemRolesReorientCommand(req));
		case ManagedSystemElementStatusDescriptionsEditPart.VISUAL_ID:
			return getGEFWrapper(new ManagedSystemElementStatusDescriptionsReorientCommand(
					req));
		case SystemSystemComponentsEditPart.VISUAL_ID:
			return getGEFWrapper(new SystemSystemComponentsReorientCommand(req));
		case SystemSystemDevicesEditPart.VISUAL_ID:
			return getGEFWrapper(new SystemSystemDevicesReorientCommand(req));
		case CollectionMembersEditPart.VISUAL_ID:
			return getGEFWrapper(new CollectionMembersReorientCommand(req));
		case CIM_ModelElementsEditPart.VISUAL_ID:
			return getGEFWrapper(new CIM_ModelElementsReorientCommand(req));
		case ComputerSystemHostedFilterListEditPart.VISUAL_ID:
			return getGEFWrapper(new ComputerSystemHostedFilterListReorientCommand(
					req));
		case ComputerSystemHostedForwardingServicesEditPart.VISUAL_ID:
			return getGEFWrapper(new ComputerSystemHostedForwardingServicesReorientCommand(
					req));
		case SystemHostedRouteEditPart.VISUAL_ID:
			return getGEFWrapper(new SystemHostedRouteReorientCommand(req));
		case ComputerSystemHostedRoutingPolicyEditPart.VISUAL_ID:
			return getGEFWrapper(new ComputerSystemHostedRoutingPolicyReorientCommand(
					req));
		case AutonomousSystemRouterInASEditPart.VISUAL_ID:
			return getGEFWrapper(new AutonomousSystemRouterInASReorientCommand(
					req));
		case BGPClusterRoutersInBGPClusterEditPart.VISUAL_ID:
			return getGEFWrapper(new BGPClusterRoutersInBGPClusterReorientCommand(
					req));
		case ComputerSystemRunningOSEditPart.VISUAL_ID:
			return getGEFWrapper(new ComputerSystemRunningOSReorientCommand(req));
		}
		return super.getReorientReferenceRelationshipCommand(req);
	}

}
