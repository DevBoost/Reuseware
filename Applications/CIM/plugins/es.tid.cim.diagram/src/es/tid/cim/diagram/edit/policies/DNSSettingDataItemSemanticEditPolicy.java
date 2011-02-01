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
import es.tid.cim.diagram.edit.commands.ElementSettingDataSettingDataCreateCommand;
import es.tid.cim.diagram.edit.commands.ElementSettingDataSettingDataReorientCommand;
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
import es.tid.cim.diagram.edit.commands.SettingDataSettingsDefineCapabilitiesCreateCommand;
import es.tid.cim.diagram.edit.commands.SettingDataSettingsDefineCapabilitiesReorientCommand;
import es.tid.cim.diagram.edit.commands.SystemSystemComponentsCreateCommand;
import es.tid.cim.diagram.edit.commands.SystemSystemComponentsReorientCommand;
import es.tid.cim.diagram.edit.parts.CIM_ModelElementsEditPart;
import es.tid.cim.diagram.edit.parts.CollectionMembersEditPart;
import es.tid.cim.diagram.edit.parts.ElementSettingDataSettingDataEditPart;
import es.tid.cim.diagram.edit.parts.ElementSoftwareIdentityManagedElementEditPart;
import es.tid.cim.diagram.edit.parts.ManagedElementComponentsEditPart;
import es.tid.cim.diagram.edit.parts.ManagedElementDependenciesEditPart;
import es.tid.cim.diagram.edit.parts.ManagedElementElementCapabilitiesEditPart;
import es.tid.cim.diagram.edit.parts.ManagedElementElementSettingDataEditPart;
import es.tid.cim.diagram.edit.parts.ManagedElementHostedDependencyEditPart;
import es.tid.cim.diagram.edit.parts.SettingDataSettingsDefineCapabilitiesEditPart;
import es.tid.cim.diagram.edit.parts.SystemSystemComponentsEditPart;
import es.tid.cim.diagram.providers.CIMLevelZeroElementTypes;

/**
 * @generated
 */
public class DNSSettingDataItemSemanticEditPolicy extends
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
		if (CIMLevelZeroElementTypes.ElementSoftwareIdentityManagedElement_4024 == req
				.getElementType()) {
			return null;
		}
		if (CIMLevelZeroElementTypes.ElementSettingDataSettingData_4033 == req
				.getElementType()) {
			return null;
		}
		if (CIMLevelZeroElementTypes.SettingDataSettingsDefineCapabilities_4034 == req
				.getElementType()) {
			return getGEFWrapper(new SettingDataSettingsDefineCapabilitiesCreateCommand(
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
		if (CIMLevelZeroElementTypes.ElementSoftwareIdentityManagedElement_4024 == req
				.getElementType()) {
			return getGEFWrapper(new ElementSoftwareIdentityManagedElementCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (CIMLevelZeroElementTypes.ElementSettingDataSettingData_4033 == req
				.getElementType()) {
			return getGEFWrapper(new ElementSettingDataSettingDataCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (CIMLevelZeroElementTypes.SettingDataSettingsDefineCapabilities_4034 == req
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
		case ElementSoftwareIdentityManagedElementEditPart.VISUAL_ID:
			return getGEFWrapper(new ElementSoftwareIdentityManagedElementReorientCommand(
					req));
		case ElementSettingDataSettingDataEditPart.VISUAL_ID:
			return getGEFWrapper(new ElementSettingDataSettingDataReorientCommand(
					req));
		case SettingDataSettingsDefineCapabilitiesEditPart.VISUAL_ID:
			return getGEFWrapper(new SettingDataSettingsDefineCapabilitiesReorientCommand(
					req));
		case SystemSystemComponentsEditPart.VISUAL_ID:
			return getGEFWrapper(new SystemSystemComponentsReorientCommand(req));
		case CollectionMembersEditPart.VISUAL_ID:
			return getGEFWrapper(new CollectionMembersReorientCommand(req));
		case CIM_ModelElementsEditPart.VISUAL_ID:
			return getGEFWrapper(new CIM_ModelElementsReorientCommand(req));
		}
		return super.getReorientReferenceRelationshipCommand(req);
	}

}
