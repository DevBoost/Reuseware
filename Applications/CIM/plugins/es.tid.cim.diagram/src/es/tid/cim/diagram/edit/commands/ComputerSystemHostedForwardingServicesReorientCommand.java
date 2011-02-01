package es.tid.cim.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

import es.tid.cim.ComputerSystem;
import es.tid.cim.ForwardingService;
import es.tid.cim.diagram.edit.policies.CIMLevelZeroBaseItemSemanticEditPolicy;

/**
 * @generated
 */
public class ComputerSystemHostedForwardingServicesReorientCommand extends
		EditElementCommand {

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
	public ComputerSystemHostedForwardingServicesReorientCommand(
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
		if (false == referenceOwner instanceof ComputerSystem) {
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
		if (!(oldEnd instanceof ForwardingService && newEnd instanceof ComputerSystem)) {
			return false;
		}
		return CIMLevelZeroBaseItemSemanticEditPolicy.LinkConstraints
				.canExistComputerSystemHostedForwardingServices_4052(
						getNewSource(), getOldTarget());
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof ForwardingService && newEnd instanceof ForwardingService)) {
			return false;
		}
		return CIMLevelZeroBaseItemSemanticEditPolicy.LinkConstraints
				.canExistComputerSystemHostedForwardingServices_4052(
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
		getOldSource().getHostedForwardingServices().remove(getOldTarget());
		getNewSource().getHostedForwardingServices().add(getOldTarget());
		return CommandResult.newOKCommandResult(referenceOwner);
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		getOldSource().getHostedForwardingServices().remove(getOldTarget());
		getOldSource().getHostedForwardingServices().add(getNewTarget());
		return CommandResult.newOKCommandResult(referenceOwner);
	}

	/**
	 * @generated
	 */
	protected ComputerSystem getOldSource() {
		return (ComputerSystem) referenceOwner;
	}

	/**
	 * @generated
	 */
	protected ComputerSystem getNewSource() {
		return (ComputerSystem) newEnd;
	}

	/**
	 * @generated
	 */
	protected ForwardingService getOldTarget() {
		return (ForwardingService) oldEnd;
	}

	/**
	 * @generated
	 */
	protected ForwardingService getNewTarget() {
		return (ForwardingService) newEnd;
	}
}
