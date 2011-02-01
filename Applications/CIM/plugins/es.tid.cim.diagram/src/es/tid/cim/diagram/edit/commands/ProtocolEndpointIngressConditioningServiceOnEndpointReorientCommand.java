package es.tid.cim.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

import es.tid.cim.ConditioningService;
import es.tid.cim.ProtocolEndpoint;
import es.tid.cim.diagram.edit.policies.CIMLevelZeroBaseItemSemanticEditPolicy;

/**
 * @generated
 */
public class ProtocolEndpointIngressConditioningServiceOnEndpointReorientCommand
		extends EditElementCommand {

	/**
	 * @generated
	 */
	private final int reorientDirection;

	/**
	 * @generated
	 */
	private final EObject referenceOwner;

	/**
	 * @generated
	 */
	private final EObject oldEnd;

	/**
	 * @generated
	 */
	private final EObject newEnd;

	/**
	 * @generated
	 */
	public ProtocolEndpointIngressConditioningServiceOnEndpointReorientCommand(
			ReorientReferenceRelationshipRequest request) {
		super(request.getLabel(), null, request);
		reorientDirection = request.getDirection();
		referenceOwner = request.getReferenceOwner();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == referenceOwner instanceof ProtocolEndpoint) {
			return false;
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return canReorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return canReorientTarget();
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean canReorientSource() {
		if (!(oldEnd instanceof ConditioningService && newEnd instanceof ProtocolEndpoint)) {
			return false;
		}
		return CIMLevelZeroBaseItemSemanticEditPolicy.LinkConstraints
				.canExistProtocolEndpointIngressConditioningServiceOnEndpoint_4055(
						getNewSource(), getOldTarget());
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof ConditioningService && newEnd instanceof ConditioningService)) {
			return false;
		}
		return CIMLevelZeroBaseItemSemanticEditPolicy.LinkConstraints
				.canExistProtocolEndpointIngressConditioningServiceOnEndpoint_4055(
						getOldSource(), getNewTarget());
	}

	/**
	 * @generated
	 */
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor,
			IAdaptable info) throws ExecutionException {
		if (!canExecute()) {
			throw new ExecutionException(
					"Invalid arguments in reorient link command"); //$NON-NLS-1$
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return reorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return reorientTarget();
		}
		throw new IllegalStateException();
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientSource() throws ExecutionException {
		getOldSource().getIngressConditioningServiceOnEndpoint().remove(
				getOldTarget());
		getNewSource().getIngressConditioningServiceOnEndpoint().add(
				getOldTarget());
		return CommandResult.newOKCommandResult(referenceOwner);
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		getOldSource().getIngressConditioningServiceOnEndpoint().remove(
				getOldTarget());
		getOldSource().getIngressConditioningServiceOnEndpoint().add(
				getNewTarget());
		return CommandResult.newOKCommandResult(referenceOwner);
	}

	/**
	 * @generated
	 */
	protected ProtocolEndpoint getOldSource() {
		return (ProtocolEndpoint) referenceOwner;
	}

	/**
	 * @generated
	 */
	protected ProtocolEndpoint getNewSource() {
		return (ProtocolEndpoint) newEnd;
	}

	/**
	 * @generated
	 */
	protected ConditioningService getOldTarget() {
		return (ConditioningService) oldEnd;
	}

	/**
	 * @generated
	 */
	protected ConditioningService getNewTarget() {
		return (ConditioningService) newEnd;
	}
}
