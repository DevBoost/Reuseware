package es.tid.cim.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

import es.tid.cim.NextHopRoute;
import es.tid.cim.RemoteServiceAccessPoint;
import es.tid.cim.diagram.edit.policies.CIMLevelZeroBaseItemSemanticEditPolicy;

/**
 * @generated
 */
public class NextHopRouteAssociatedNextHopReorientCommand extends
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
	public NextHopRouteAssociatedNextHopReorientCommand(
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
		if (false == referenceOwner instanceof NextHopRoute) {
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
		if (!(oldEnd instanceof RemoteServiceAccessPoint && newEnd instanceof NextHopRoute)) {
			return false;
		}
		return CIMLevelZeroBaseItemSemanticEditPolicy.LinkConstraints
				.canExistNextHopRouteAssociatedNextHop_4071(getNewSource(),
						getOldTarget());
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof RemoteServiceAccessPoint && newEnd instanceof RemoteServiceAccessPoint)) {
			return false;
		}
		return CIMLevelZeroBaseItemSemanticEditPolicy.LinkConstraints
				.canExistNextHopRouteAssociatedNextHop_4071(getOldSource(),
						getNewTarget());
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
		getOldSource().setAssociatedNextHop(null);
		getNewSource().setAssociatedNextHop(getOldTarget());
		return CommandResult.newOKCommandResult(referenceOwner);
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		getOldSource().setAssociatedNextHop(getNewTarget());
		return CommandResult.newOKCommandResult(referenceOwner);
	}

	/**
	 * @generated
	 */
	protected NextHopRoute getOldSource() {
		return (NextHopRoute) referenceOwner;
	}

	/**
	 * @generated
	 */
	protected NextHopRoute getNewSource() {
		return (NextHopRoute) newEnd;
	}

	/**
	 * @generated
	 */
	protected RemoteServiceAccessPoint getOldTarget() {
		return (RemoteServiceAccessPoint) oldEnd;
	}

	/**
	 * @generated
	 */
	protected RemoteServiceAccessPoint getNewTarget() {
		return (RemoteServiceAccessPoint) newEnd;
	}
}