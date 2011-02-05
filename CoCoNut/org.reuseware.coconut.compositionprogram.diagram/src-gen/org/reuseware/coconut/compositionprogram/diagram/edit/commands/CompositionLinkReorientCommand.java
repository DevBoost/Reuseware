/*******************************************************************************
 * Copyright (c) 2006-2011
 * Software Technology Group, Dresden University of Technology
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0 
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *   Software Technology Group - TU Dresden, Germany 
 *      - initial API and implementation
 ******************************************************************************/
package org.reuseware.coconut.compositionprogram.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.reuseware.coconut.compositionprogram.CompositionLink;
import org.reuseware.coconut.compositionprogram.CompositionProgram;
import org.reuseware.coconut.compositionprogram.PortInstance;
import org.reuseware.coconut.compositionprogram.diagram.edit.policies.CompositionprogramBaseItemSemanticEditPolicy;

/**
 * @generated
 */
public class CompositionLinkReorientCommand extends EditElementCommand {

	/**
	 * @generated
	 */
	private final int reorientDirection;

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
	public CompositionLinkReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof CompositionLink) {
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
		if (!(oldEnd instanceof PortInstance && newEnd instanceof PortInstance)) {
			return false;
		}
		PortInstance target = getLink().getTarget();
		if (!(getLink().eContainer() instanceof CompositionProgram)) {
			return false;
		}
		CompositionProgram container = (CompositionProgram) getLink()
				.eContainer();
		return CompositionprogramBaseItemSemanticEditPolicy
				.getLinkConstraints().canExistCompositionLink_4001(container,
						getLink(), getNewSource(), target);
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof PortInstance && newEnd instanceof PortInstance)) {
			return false;
		}
		PortInstance source = getLink().getSource();
		if (!(getLink().eContainer() instanceof CompositionProgram)) {
			return false;
		}
		CompositionProgram container = (CompositionProgram) getLink()
				.eContainer();
		return CompositionprogramBaseItemSemanticEditPolicy
				.getLinkConstraints().canExistCompositionLink_4001(container,
						getLink(), source, getNewTarget());
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
	 * Added call to match() after re-orientation
	 * 
	 * @generated
	 */
	protected CommandResult reorientSource() throws ExecutionException {
		getLink().setSource(getNewSource());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * Added call to match() after re-orientation
	 * 
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		getLink().setTarget(getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected CompositionLink getLink() {
		return (CompositionLink) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected PortInstance getOldSource() {
		return (PortInstance) oldEnd;
	}

	/**
	 * @generated
	 */
	protected PortInstance getNewSource() {
		return (PortInstance) newEnd;
	}

	/**
	 * @generated
	 */
	protected PortInstance getOldTarget() {
		return (PortInstance) oldEnd;
	}

	/**
	 * @generated
	 */
	protected PortInstance getNewTarget() {
		return (PortInstance) newEnd;
	}
}
