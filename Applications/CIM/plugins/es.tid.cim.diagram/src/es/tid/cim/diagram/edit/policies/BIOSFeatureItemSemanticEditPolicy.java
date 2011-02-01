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
import es.tid.cim.diagram.edit.commands.OperatingSystemOperatingSystemSoftwareFeatureCreateCommand;
import es.tid.cim.diagram.edit.commands.OperatingSystemOperatingSystemSoftwareFeatureReorientCommand;
import es.tid.cim.diagram.edit.commands.ServiceSoftwareFeatureServiceImplementationCreateCommand;
import es.tid.cim.diagram.edit.commands.ServiceSoftwareFeatureServiceImplementationReorientCommand;
import es.tid.cim.diagram.edit.commands.SystemSystemComponentsCreateCommand;
import es.tid.cim.diagram.edit.commands.SystemSystemComponentsReorientCommand;
import es.tid.cim.diagram.edit.parts.CIM_ModelElementsEditPart;
import es.tid.cim.diagram.edit.parts.CollectionMembersEditPart;
import es.tid.cim.diagram.edit.parts.ElementSoftwareIdentityManagedElementEditPart;
import es.tid.cim.diagram.edit.parts.ManagedElementComponentsEditPart;
import es.tid.cim.diagram.edit.parts.ManagedElementDependenciesEditPart;
import es.tid.cim.diagram.edit.parts.ManagedElementElementCapabilitiesEditPart;
import es.tid.cim.diagram.edit.parts.ManagedElementElementSettingDataEditPart;
import es.tid.cim.diagram.edit.parts.ManagedElementHostedDependencyEditPart;
import es.tid.cim.diagram.edit.parts.ManagedSystemElementStatusDescriptionsEditPart;
import es.tid.cim.diagram.edit.parts.OperatingSystemOperatingSystemSoftwareFeatureEditPart;
import es.tid.cim.diagram.edit.parts.ServiceSoftwareFeatureServiceImplementationEditPart;
import es.tid.cim.diagram.edit.parts.SystemSystemComponentsEditPart;
import es.tid.cim.diagram.providers.CIMLevelZeroElementTypes;

/**
 * @generated
 */
public class BIOSFeatureItemSemanticEditPolicy extends
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
		if (CIMLevelZeroElementTypes.OperatingSystemOperatingSystemSoftwareFeature_4002 == req
				.getElementType()) {
			return null;
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
		if (CIMLevelZeroElementTypes.ElementSoftwareIdentityManagedElement_4024 == req
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
		if (CIMLevelZeroElementTypes.CIM_ModelElements_4048 == req
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
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (CIMLevelZeroElementTypes.OperatingSystemOperatingSystemSoftwareFeature_4002 == req
				.getElementType()) {
			return getGEFWrapper(new OperatingSystemOperatingSystemSoftwareFeatureCreateCommand(
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
		if (CIMLevelZeroElementTypes.ElementSoftwareIdentityManagedElement_4024 == req
				.getElementType()) {
			return getGEFWrapper(new ElementSoftwareIdentityManagedElementCreateCommand(
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
		if (CIMLevelZeroElementTypes.ServiceSoftwareFeatureServiceImplementation_4068 == req
				.getElementType()) {
			return getGEFWrapper(new ServiceSoftwareFeatureServiceImplementationCreateCommand(
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
		case OperatingSystemOperatingSystemSoftwareFeatureEditPart.VISUAL_ID:
			return getGEFWrapper(new OperatingSystemOperatingSystemSoftwareFeatureReorientCommand(
					req));
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
		case ElementSoftwareIdentityManagedElementEditPart.VISUAL_ID:
			return getGEFWrapper(new ElementSoftwareIdentityManagedElementReorientCommand(
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
		case ServiceSoftwareFeatureServiceImplementationEditPart.VISUAL_ID:
			return getGEFWrapper(new ServiceSoftwareFeatureServiceImplementationReorientCommand(
					req));
		}
		return super.getReorientReferenceRelationshipCommand(req);
	}

}
