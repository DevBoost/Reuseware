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
package org.reuseware.coconut.compositionprogram.diagram.edit.policies;

import java.util.Iterator;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.common.core.command.ICompositeCommand;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.reuseware.coconut.compositionprogram.CompositionLink;
import org.reuseware.coconut.compositionprogram.FragmentInstance;
import org.reuseware.coconut.compositionprogram.PortInstance;
import org.reuseware.coconut.compositionprogram.diagram.edit.commands.PortInstanceCreateCommand;
import org.reuseware.coconut.compositionprogram.diagram.edit.parts.CompositionLinkEditPart;
import org.reuseware.coconut.compositionprogram.diagram.edit.parts.PortInstanceEditPart;
import org.reuseware.coconut.compositionprogram.diagram.part.CompositionprogramVisualIDRegistry;
import org.reuseware.coconut.compositionprogram.diagram.providers.CompositionprogramElementTypes;

/**
 * @generated
 */
public class FragmentInstanceItemSemanticEditPolicy extends
		CompositionprogramBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public FragmentInstanceItemSemanticEditPolicy() {
		super(CompositionprogramElementTypes.FragmentInstance_2001);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (CompositionprogramElementTypes.PortInstance_3001 == req
				.getElementType()) {
			return getGEFWrapper(new PortInstanceCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

	/**
	 * Modified to also destroy invisible links
	 * 
	 * @generated NOT
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		View view = (View) getHost().getModel();
		CompositeTransactionalCommand cmd = new CompositeTransactionalCommand(
				getEditingDomain(), null);
		cmd.setTransactionNestingEnabled(false);
		EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
		if (annotation == null) {
			// there are indirectly referenced children, need extra commands: false
			addDestroyChildNodesCommand(cmd);
			//!BEGIN MODIFICATION
			addDestroyInvisibleLinksCommand(cmd);
			//!END MODIFICATION
			addDestroyShortcutsCommand(cmd, view);
			// delete host element
			cmd.add(new DestroyElementCommand(req));
		} else {
			cmd.add(new DeleteCommand(getEditingDomain(), view));
		}
		return getGEFWrapper(cmd.reduce());
	}

	/**
	 * @generated
	 */
	private void addDestroyChildNodesCommand(ICompositeCommand cmd) {
		View view = (View) getHost().getModel();
		for (Iterator<?> nit = view.getChildren().iterator(); nit.hasNext();) {
			Node node = (Node) nit.next();
			switch (CompositionprogramVisualIDRegistry.getVisualID(node)) {
			case PortInstanceEditPart.VISUAL_ID:
				for (Iterator<?> it = node.getTargetEdges().iterator(); it
						.hasNext();) {
					Edge incomingLink = (Edge) it.next();
					if (CompositionprogramVisualIDRegistry
							.getVisualID(incomingLink) == CompositionLinkEditPart.VISUAL_ID) {
						DestroyElementRequest r = new DestroyElementRequest(
								incomingLink.getElement(), false);
						cmd.add(new DestroyElementCommand(r));
						cmd.add(new DeleteCommand(getEditingDomain(),
								incomingLink));
						continue;
					}
				}
				for (Iterator<?> it = node.getSourceEdges().iterator(); it
						.hasNext();) {
					Edge outgoingLink = (Edge) it.next();
					if (CompositionprogramVisualIDRegistry
							.getVisualID(outgoingLink) == CompositionLinkEditPart.VISUAL_ID) {
						DestroyElementRequest r = new DestroyElementRequest(
								outgoingLink.getElement(), false);
						cmd.add(new DestroyElementCommand(r));
						cmd.add(new DeleteCommand(getEditingDomain(),
								outgoingLink));
						continue;
					}
				}
				cmd.add(new DestroyElementCommand(new DestroyElementRequest(
						getEditingDomain(), node.getElement(), false))); // directlyOwned: true
				// don't need explicit deletion of node as parent's view deletion would clean child views as well 
				// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), node));
				break;
			}
		}
	}
	
	//!BEGIN MODIFICATION
	private void addDestroyInvisibleLinksCommand(ICompositeCommand cmd) {
		FragmentInstance fInstance = (FragmentInstance) ((View) getHost()
				.getModel()).getElement();

		for (PortInstance pInstance : fInstance.getPortInstances()) {
			for (CompositionLink link : pInstance.getSourceLinks()) {
				cmd.add(getDestroyInvisbleLinkCommand(link));
			}
			for (CompositionLink link : pInstance.getTargetLinks()) {
				cmd.add(getDestroyInvisbleLinkCommand(link));
			}
		}
	}

	private DestroyElementCommand getDestroyInvisbleLinkCommand(
			CompositionLink link) {
		DestroyElementRequest request = new DestroyElementRequest(
				getEditingDomain(), link, false);
		return new DestroyElementCommand(request);
	}
	//!END MODIFICATION

}
