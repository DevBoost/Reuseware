/*
 * Copyright (c) 2006, 2007 Borland Software Corporation
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Dmitry Stadnik (Borland) - initial API and implementation
 */
package org.reuseware.application.taipan.gmf.editor.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.CreateElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ConfigureRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.reuseware.application.taipan.BesiegePortOrder;
import org.reuseware.application.taipan.PortType;
import org.reuseware.application.taipan.TaiPanFactory;
import org.reuseware.application.taipan.TaiPanPackage;
import org.reuseware.application.taipan.Warship;
import org.reuseware.application.taipan.gmf.editor.edit.policies.TaiPanBaseItemSemanticEditPolicy;

/**
 * @generated
 */
public class BesiegePortOrderCreateCommand extends CreateElementCommand {

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
	public BesiegePortOrderCreateCommand(CreateRelationshipRequest request,
			EObject source, EObject target) {
		super(request);
		this.source = source;
		this.target = target;
		if (request.getContainmentFeature() == null) {
			setContainmentFeature(TaiPanPackage.eINSTANCE
					.getWarship_AttackOrders());
		}

		super.setElementToEdit(source);
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (source == null && target == null) {
			return false;
		}
		if (source != null && false == source instanceof Warship) {
			return false;
		}
		if (target != null && false == target instanceof PortType) {
			return false;
		}
		if (getSource() == null) {
			return true; // link creation is in progress; source is not defined yet
		}
		// target may be null here but it's possible to check constraint
		return TaiPanBaseItemSemanticEditPolicy.LinkConstraints
				.canCreateBesiegePortOrder_4005(getSource(), getTarget());
	}

	/**
	 * @generated
	 */
	protected EObject doDefaultElementCreation() {
		BesiegePortOrder newElement = TaiPanFactory.eINSTANCE
				.createBesiegePortOrder();
		getSource().getAttackOrders().add(newElement);
		newElement.setPort(getTarget());
		return newElement;
	}

	/**
	 * @generated
	 */
	protected EClass getEClassToEdit() {
		return TaiPanPackage.eINSTANCE.getWarship();
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
		return super.doExecuteWithResult(monitor, info);
	}

	/**
	 * @generated
	 */
	protected ConfigureRequest createConfigureRequest() {
		ConfigureRequest request = super.createConfigureRequest();
		request.setParameter(CreateRelationshipRequest.SOURCE, getSource());
		request.setParameter(CreateRelationshipRequest.TARGET, getTarget());
		return request;
	}

	/**
	 * @generated
	 */
	protected void setElementToEdit(EObject element) {
		throw new UnsupportedOperationException();
	}

	/**
	 * @generated
	 */
	protected Warship getSource() {
		return (Warship) source;
	}

	/**
	 * @generated
	 */
	protected PortType getTarget() {
		return (PortType) target;
	}
}
