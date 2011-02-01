package es.tid.cim.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;

import es.tid.cim.ConditioningService;
import es.tid.cim.ProtocolEndpoint;
import es.tid.cim.diagram.edit.policies.CIMLevelZeroBaseItemSemanticEditPolicy;

/**
 * @generated
 */
public class ProtocolEndpointIngressConditioningServiceOnEndpointCreateCommand
		extends EditElementCommand {

	/**
	 * @generated
	 */
	private final EObject source;

	/**
	 * @generated
	 */
	private final EObject target;

	/**
	 * @generated
	 */
	public ProtocolEndpointIngressConditioningServiceOnEndpointCreateCommand(
			CreateRelationshipRequest request, EObject source, EObject target) {
		super(request.getLabel(), null, request);
		this.source = source;
		this.target = target;
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (source == null && target == null) {
			return false;
		}
		if (source != null && false == source instanceof ProtocolEndpoint) {
			return false;
		}
		if (target != null && false == target instanceof ConditioningService) {
			return false;
		}
		if (getSource() == null) {
			return true; // link creation is in progress; source is not defined yet
		}
		// target may be null here but it's possible to check constraint
		return CIMLevelZeroBaseItemSemanticEditPolicy.LinkConstraints
				.canCreateProtocolEndpointIngressConditioningServiceOnEndpoint_4055(
						getSource(), getTarget());
	}

	/**
	 * @generated
	 */
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor,
			IAdaptable info) throws ExecutionException {
		if (!canExecute()) {
			throw new ExecutionException(
					"Invalid arguments in create link command"); //$NON-NLS-1$
		}
		if (getSource() != null && getTarget() != null) {
			getSource().getIngressConditioningServiceOnEndpoint().add(
					getTarget());
		}
		return CommandResult.newOKCommandResult();
	}

	/**
	 * @generated
	 */
	protected ProtocolEndpoint getSource() {
		return (ProtocolEndpoint) source;
	}

	/**
	 * @generated
	 */
	protected ConditioningService getTarget() {
		return (ConditioningService) target;
	}
}
