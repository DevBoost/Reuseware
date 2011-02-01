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
import es.tid.cim.diagram.edit.commands.ComputerSystemHostedForwardingServicesCreateCommand;
import es.tid.cim.diagram.edit.commands.ComputerSystemHostedForwardingServicesReorientCommand;
import es.tid.cim.diagram.edit.commands.ElementSoftwareIdentityManagedElementCreateCommand;
import es.tid.cim.diagram.edit.commands.ElementSoftwareIdentityManagedElementReorientCommand;
import es.tid.cim.diagram.edit.commands.EnabledLogicalElementRemoteAccessAvailableToElementCreateCommand;
import es.tid.cim.diagram.edit.commands.EnabledLogicalElementRemoteAccessAvailableToElementReorientCommand;
import es.tid.cim.diagram.edit.commands.ForwardingServiceForwardedRoutesCreateCommand;
import es.tid.cim.diagram.edit.commands.ForwardingServiceForwardedRoutesReorientCommand;
import es.tid.cim.diagram.edit.commands.ForwardingServiceForwardsAmongCreateCommand;
import es.tid.cim.diagram.edit.commands.ForwardingServiceForwardsAmongReorientCommand;
import es.tid.cim.diagram.edit.commands.ForwardingServiceRouteForwardedByServiceCreateCommand;
import es.tid.cim.diagram.edit.commands.ForwardingServiceRouteForwardedByServiceReorientCommand;
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
import es.tid.cim.diagram.edit.commands.ProductProductServiceComponentCreateCommand;
import es.tid.cim.diagram.edit.commands.ProductProductServiceComponentReorientCommand;
import es.tid.cim.diagram.edit.commands.ServiceServiceAccessBySAPCreateCommand;
import es.tid.cim.diagram.edit.commands.ServiceServiceAccessBySAPReorientCommand;
import es.tid.cim.diagram.edit.commands.ServiceServiceComponentsCreateCommand;
import es.tid.cim.diagram.edit.commands.ServiceServiceComponentsReorientCommand;
import es.tid.cim.diagram.edit.commands.ServiceServiceServiceDependencyCreateCommand;
import es.tid.cim.diagram.edit.commands.ServiceServiceServiceDependencyReorientCommand;
import es.tid.cim.diagram.edit.commands.ServiceSoftwareFeatureServiceImplementationCreateCommand;
import es.tid.cim.diagram.edit.commands.ServiceSoftwareFeatureServiceImplementationReorientCommand;
import es.tid.cim.diagram.edit.commands.SystemHostedServicesCreateCommand;
import es.tid.cim.diagram.edit.commands.SystemHostedServicesReorientCommand;
import es.tid.cim.diagram.edit.commands.SystemSystemComponentsCreateCommand;
import es.tid.cim.diagram.edit.commands.SystemSystemComponentsReorientCommand;
import es.tid.cim.diagram.edit.parts.CIM_ModelElementsEditPart;
import es.tid.cim.diagram.edit.parts.CollectionMembersEditPart;
import es.tid.cim.diagram.edit.parts.ComputerSystemHostedForwardingServicesEditPart;
import es.tid.cim.diagram.edit.parts.ElementSoftwareIdentityManagedElementEditPart;
import es.tid.cim.diagram.edit.parts.EnabledLogicalElementRemoteAccessAvailableToElementEditPart;
import es.tid.cim.diagram.edit.parts.ForwardingServiceForwardedRoutesEditPart;
import es.tid.cim.diagram.edit.parts.ForwardingServiceForwardsAmongEditPart;
import es.tid.cim.diagram.edit.parts.ForwardingServiceRouteForwardedByServiceEditPart;
import es.tid.cim.diagram.edit.parts.ManagedElementComponentsEditPart;
import es.tid.cim.diagram.edit.parts.ManagedElementDependenciesEditPart;
import es.tid.cim.diagram.edit.parts.ManagedElementElementCapabilitiesEditPart;
import es.tid.cim.diagram.edit.parts.ManagedElementElementSettingDataEditPart;
import es.tid.cim.diagram.edit.parts.ManagedElementHostedDependencyEditPart;
import es.tid.cim.diagram.edit.parts.ManagedSystemElementStatusDescriptionsEditPart;
import es.tid.cim.diagram.edit.parts.NATServiceNATServiceRunningOnEndpointEditPart;
import es.tid.cim.diagram.edit.parts.ProductProductServiceComponentEditPart;
import es.tid.cim.diagram.edit.parts.ServiceServiceAccessBySAPEditPart;
import es.tid.cim.diagram.edit.parts.ServiceServiceComponentsEditPart;
import es.tid.cim.diagram.edit.parts.ServiceServiceServiceDependencyEditPart;
import es.tid.cim.diagram.edit.parts.ServiceSoftwareFeatureServiceImplementationEditPart;
import es.tid.cim.diagram.edit.parts.SystemHostedServicesEditPart;
import es.tid.cim.diagram.edit.parts.SystemSystemComponentsEditPart;
import es.tid.cim.diagram.providers.CIMLevelZeroElementTypes;

/**
 * @generated
 */
public class NATServiceItemSemanticEditPolicy extends
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
			return null;
		}
		if (CIMLevelZeroElementTypes.ProductProductServiceComponent_4026 == req
				.getElementType()) {
			return null;
		}
		if (CIMLevelZeroElementTypes.EnabledLogicalElementRemoteAccessAvailableToElement_4027 == req
				.getElementType()) {
			return getGEFWrapper(new EnabledLogicalElementRemoteAccessAvailableToElementCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (CIMLevelZeroElementTypes.ServiceServiceAccessBySAP_4030 == req
				.getElementType()) {
			return getGEFWrapper(new ServiceServiceAccessBySAPCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (CIMLevelZeroElementTypes.ServiceServiceComponents_4031 == req
				.getElementType()) {
			return getGEFWrapper(new ServiceServiceComponentsCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (CIMLevelZeroElementTypes.ServiceServiceServiceDependency_4032 == req
				.getElementType()) {
			return getGEFWrapper(new ServiceServiceServiceDependencyCreateCommand(
					req, req.getSource(), req.getTarget()));
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
		if (CIMLevelZeroElementTypes.CIM_ModelElements_4048 == req
				.getElementType()) {
			return null;
		}
		if (CIMLevelZeroElementTypes.ForwardingServiceForwardedRoutes_4049 == req
				.getElementType()) {
			return getGEFWrapper(new ForwardingServiceForwardedRoutesCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (CIMLevelZeroElementTypes.ForwardingServiceForwardsAmong_4050 == req
				.getElementType()) {
			return getGEFWrapper(new ForwardingServiceForwardsAmongCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (CIMLevelZeroElementTypes.ComputerSystemHostedForwardingServices_4052 == req
				.getElementType()) {
			return null;
		}
		if (CIMLevelZeroElementTypes.NATServiceNATServiceRunningOnEndpoint_4058 == req
				.getElementType()) {
			return getGEFWrapper(new NATServiceNATServiceRunningOnEndpointCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (CIMLevelZeroElementTypes.ForwardingServiceRouteForwardedByService_4062 == req
				.getElementType()) {
			return getGEFWrapper(new ForwardingServiceRouteForwardedByServiceCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (CIMLevelZeroElementTypes.ServiceSoftwareFeatureServiceImplementation_4068 == req
				.getElementType()) {
			return getGEFWrapper(new ServiceSoftwareFeatureServiceImplementationCreateCommand(
					req, req.getSource(), req.getTarget()));
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
			return getGEFWrapper(new ElementSoftwareIdentityManagedElementCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (CIMLevelZeroElementTypes.ProductProductServiceComponent_4026 == req
				.getElementType()) {
			return getGEFWrapper(new ProductProductServiceComponentCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (CIMLevelZeroElementTypes.EnabledLogicalElementRemoteAccessAvailableToElement_4027 == req
				.getElementType()) {
			return null;
		}
		if (CIMLevelZeroElementTypes.ServiceServiceAccessBySAP_4030 == req
				.getElementType()) {
			return null;
		}
		if (CIMLevelZeroElementTypes.ServiceServiceComponents_4031 == req
				.getElementType()) {
			return getGEFWrapper(new ServiceServiceComponentsCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (CIMLevelZeroElementTypes.ServiceServiceServiceDependency_4032 == req
				.getElementType()) {
			return getGEFWrapper(new ServiceServiceServiceDependencyCreateCommand(
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
		if (CIMLevelZeroElementTypes.CIM_ModelElements_4048 == req
				.getElementType()) {
			return getGEFWrapper(new CIM_ModelElementsCreateCommand(req, req
					.getSource(), req.getTarget()));
		}
		if (CIMLevelZeroElementTypes.ForwardingServiceForwardedRoutes_4049 == req
				.getElementType()) {
			return null;
		}
		if (CIMLevelZeroElementTypes.ForwardingServiceForwardsAmong_4050 == req
				.getElementType()) {
			return null;
		}
		if (CIMLevelZeroElementTypes.ComputerSystemHostedForwardingServices_4052 == req
				.getElementType()) {
			return getGEFWrapper(new ComputerSystemHostedForwardingServicesCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (CIMLevelZeroElementTypes.NATServiceNATServiceRunningOnEndpoint_4058 == req
				.getElementType()) {
			return null;
		}
		if (CIMLevelZeroElementTypes.ForwardingServiceRouteForwardedByService_4062 == req
				.getElementType()) {
			return null;
		}
		if (CIMLevelZeroElementTypes.ServiceSoftwareFeatureServiceImplementation_4068 == req
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
		case ManagedElementHostedDependencyEditPart.VISUAL_ID:
			return getGEFWrapper(new ManagedElementHostedDependencyReorientCommand(
					req));
		case SystemHostedServicesEditPart.VISUAL_ID:
			return getGEFWrapper(new SystemHostedServicesReorientCommand(req));
		case ElementSoftwareIdentityManagedElementEditPart.VISUAL_ID:
			return getGEFWrapper(new ElementSoftwareIdentityManagedElementReorientCommand(
					req));
		case ProductProductServiceComponentEditPart.VISUAL_ID:
			return getGEFWrapper(new ProductProductServiceComponentReorientCommand(
					req));
		case EnabledLogicalElementRemoteAccessAvailableToElementEditPart.VISUAL_ID:
			return getGEFWrapper(new EnabledLogicalElementRemoteAccessAvailableToElementReorientCommand(
					req));
		case ServiceServiceAccessBySAPEditPart.VISUAL_ID:
			return getGEFWrapper(new ServiceServiceAccessBySAPReorientCommand(
					req));
		case ServiceServiceComponentsEditPart.VISUAL_ID:
			return getGEFWrapper(new ServiceServiceComponentsReorientCommand(
					req));
		case ServiceServiceServiceDependencyEditPart.VISUAL_ID:
			return getGEFWrapper(new ServiceServiceServiceDependencyReorientCommand(
					req));
		case ManagedSystemElementStatusDescriptionsEditPart.VISUAL_ID:
			return getGEFWrapper(new ManagedSystemElementStatusDescriptionsReorientCommand(
					req));
		case SystemSystemComponentsEditPart.VISUAL_ID:
			return getGEFWrapper(new SystemSystemComponentsReorientCommand(req));
		case CollectionMembersEditPart.VISUAL_ID:
			return getGEFWrapper(new CollectionMembersReorientCommand(req));
		case CIM_ModelElementsEditPart.VISUAL_ID:
			return getGEFWrapper(new CIM_ModelElementsReorientCommand(req));
		case ForwardingServiceForwardedRoutesEditPart.VISUAL_ID:
			return getGEFWrapper(new ForwardingServiceForwardedRoutesReorientCommand(
					req));
		case ForwardingServiceForwardsAmongEditPart.VISUAL_ID:
			return getGEFWrapper(new ForwardingServiceForwardsAmongReorientCommand(
					req));
		case ComputerSystemHostedForwardingServicesEditPart.VISUAL_ID:
			return getGEFWrapper(new ComputerSystemHostedForwardingServicesReorientCommand(
					req));
		case NATServiceNATServiceRunningOnEndpointEditPart.VISUAL_ID:
			return getGEFWrapper(new NATServiceNATServiceRunningOnEndpointReorientCommand(
					req));
		case ForwardingServiceRouteForwardedByServiceEditPart.VISUAL_ID:
			return getGEFWrapper(new ForwardingServiceRouteForwardedByServiceReorientCommand(
					req));
		case ServiceSoftwareFeatureServiceImplementationEditPart.VISUAL_ID:
			return getGEFWrapper(new ServiceSoftwareFeatureServiceImplementationReorientCommand(
					req));
		}
		return super.getReorientReferenceRelationshipCommand(req);
	}

}
