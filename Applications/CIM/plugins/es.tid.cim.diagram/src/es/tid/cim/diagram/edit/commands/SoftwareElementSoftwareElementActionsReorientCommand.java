package es.tid.cim.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

import es.tid.cim.Action;
import es.tid.cim.SoftwareElement;
import es.tid.cim.diagram.edit.policies.CIMLevelZeroBaseItemSemanticEditPolicy;

/**
 * @generated
 */
public class SoftwareElementSoftwareElementActionsReorientCommand extends
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
	public SoftwareElementSoftwareElementActionsReorientCommand(
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
		if (false == referenceOwner instanceof SoftwareElement) {
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
		if (!(oldEnd instanceof Action && newEnd instanceof SoftwareElement)) {
			return false;
		}
		return CIMLevelZeroBaseItemSemanticEditPolicy.LinkConstraints
				.canExistSoftwareElementSoftwareElementActions_4003(
						getNewSource(), getOldTarget());
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof Action && newEnd instanceof Action)) {
			return false;
		}
		return CIMLevelZeroBaseItemSemanticEditPolicy.LinkConstraints
				.canExistSoftwareElementSoftwareElementActions_4003(
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
		getOldSource().getSoftwareElementActions().remove(getOldTarget());
		getNewSource().getSoftwareElementActions().add(getOldTarget());
		return CommandResult.newOKCommandResult(referenceOwner);
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		getOldSource().getSoftwareElementActions().remove(getOldTarget());
		getOldSource().getSoftwareElementActions().add(getNewTarget());
		return CommandResult.newOKCommandResult(referenceOwner);
	}

	/**
	 * @generated
	 */
	protected SoftwareElement getOldSource() {
		return (SoftwareElement) referenceOwner;
	}

	/**
	 * @generated
	 */
	protected SoftwareElement getNewSource() {
		return (SoftwareElement) newEnd;
	}

	/**
	 * @generated
	 */
	protected Action getOldTarget() {
		return (Action) oldEnd;
	}

	/**
	 * @generated
	 */
	protected Action getNewTarget() {
		return (Action) newEnd;
	}
}
