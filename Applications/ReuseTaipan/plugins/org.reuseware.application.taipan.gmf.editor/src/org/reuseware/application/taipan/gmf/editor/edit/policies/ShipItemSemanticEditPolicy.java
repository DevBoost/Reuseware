/*******************************************************************************
 * Copyright (c) 2006-2012
 * Software Technology Group, Dresden University of Technology
 * DevBoost GmbH, Berlin, Amtsgericht Charlottenburg, HRB 140026
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *   Software Technology Group - TU Dresden, Germany;
 *   DevBoost GmbH - Berlin, Germany
 *      - initial API and implementation
 ******************************************************************************/
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
package org.reuseware.application.taipan.gmf.editor.edit.policies;

import java.util.Iterator;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.reuseware.application.taipan.gmf.editor.edit.commands.EscortShipsOrderCreateCommand;
import org.reuseware.application.taipan.gmf.editor.edit.commands.EscortShipsOrderReorientCommand;
import org.reuseware.application.taipan.gmf.editor.edit.commands.PortRegisterCreateCommand;
import org.reuseware.application.taipan.gmf.editor.edit.commands.PortRegisterReorientCommand;
import org.reuseware.application.taipan.gmf.editor.edit.commands.ShipDestinationCreateCommand;
import org.reuseware.application.taipan.gmf.editor.edit.commands.ShipDestinationReorientCommand;
import org.reuseware.application.taipan.gmf.editor.edit.commands.ShipRouteCreateCommand;
import org.reuseware.application.taipan.gmf.editor.edit.commands.ShipRouteReorientCommand;
import org.reuseware.application.taipan.gmf.editor.edit.parts.EmptyBoxEditPart;
import org.reuseware.application.taipan.gmf.editor.edit.parts.EscortShipsOrderEditPart;
import org.reuseware.application.taipan.gmf.editor.edit.parts.ItemHookEditPart;
import org.reuseware.application.taipan.gmf.editor.edit.parts.LargeItemEditPart;
import org.reuseware.application.taipan.gmf.editor.edit.parts.PortRegisterEditPart;
import org.reuseware.application.taipan.gmf.editor.edit.parts.ShipDestinationEditPart;
import org.reuseware.application.taipan.gmf.editor.edit.parts.ShipLargeCargoEditPart;
import org.reuseware.application.taipan.gmf.editor.edit.parts.ShipRouteEditPart;
import org.reuseware.application.taipan.gmf.editor.edit.parts.ShipSmallCargoEditPart;
import org.reuseware.application.taipan.gmf.editor.edit.parts.SmallItemsEditPart;
import org.reuseware.application.taipan.gmf.editor.part.TaiPanVisualIDRegistry;
import org.reuseware.application.taipan.gmf.editor.providers.TaiPanElementTypes;

/**
 * @generated
 */
public class ShipItemSemanticEditPolicy extends
		TaiPanBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		CompoundCommand cc = getDestroyEdgesCommand();
		addDestroyChildNodesCommand(cc);
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
	protected void addDestroyChildNodesCommand(CompoundCommand cmd) {
		View view = (View) getHost().getModel();
		EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
		if (annotation != null) {
			return;
		}
		for (Iterator it = view.getChildren().iterator(); it.hasNext();) {
			Node node = (Node) it.next();
			switch (TaiPanVisualIDRegistry.getVisualID(node)) {
			case ShipSmallCargoEditPart.VISUAL_ID:
				for (Iterator cit = node.getChildren().iterator(); cit
						.hasNext();) {
					Node cnode = (Node) cit.next();
					switch (TaiPanVisualIDRegistry.getVisualID(cnode)) {
					case SmallItemsEditPart.VISUAL_ID:
						cmd.add(getDestroyElementCommand(cnode));
						break;
					}
				}
				break;
			case ShipLargeCargoEditPart.VISUAL_ID:
				for (Iterator cit = node.getChildren().iterator(); cit
						.hasNext();) {
					Node cnode = (Node) cit.next();
					switch (TaiPanVisualIDRegistry.getVisualID(cnode)) {
					case LargeItemEditPart.VISUAL_ID:
						cmd.add(getDestroyElementCommand(cnode));
						break;
					case EmptyBoxEditPart.VISUAL_ID:
						cmd.add(getDestroyElementCommand(cnode));
						break;
					case ItemHookEditPart.VISUAL_ID:
						cmd.add(getDestroyElementCommand(cnode));
						break;
					}
				}
				break;
			}
		}
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
		if (TaiPanElementTypes.ShipDestination_4001 == req.getElementType()) {
			return getGEFWrapper(new ShipDestinationCreateCommand(req, req
					.getSource(), req.getTarget()));
		}
		if (TaiPanElementTypes.ShipRoute_4004 == req.getElementType()) {
			return getGEFWrapper(new ShipRouteCreateCommand(req, req
					.getSource(), req.getTarget()));
		}
		if (TaiPanElementTypes.EscortShipsOrder_4006 == req.getElementType()) {
			return getGEFWrapper(new EscortShipsOrderCreateCommand(req, req
					.getTarget(), req.getSource()));
		}
		if (TaiPanElementTypes.PortRegister_4007 == req.getElementType()) {
			return getGEFWrapper(new PortRegisterCreateCommand(req, req
					.getTarget(), req.getSource()));
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (TaiPanElementTypes.ShipDestination_4001 == req.getElementType()) {
			return null;
		}
		if (TaiPanElementTypes.ShipRoute_4004 == req.getElementType()) {
			return null;
		}
		if (TaiPanElementTypes.EscortShipsOrder_4006 == req.getElementType()) {
			return getGEFWrapper(new EscortShipsOrderCreateCommand(req, req
					.getSource(), req.getTarget()));
		}
		if (TaiPanElementTypes.PortRegister_4007 == req.getElementType()) {
			return getGEFWrapper(new PortRegisterCreateCommand(req, req
					.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * Returns command to reorient EClass based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientRelationshipCommand(
			ReorientRelationshipRequest req) {
		switch (getVisualID(req)) {
		case EscortShipsOrderEditPart.VISUAL_ID:
			return getGEFWrapper(new EscortShipsOrderReorientCommand(req));
		}
		return super.getReorientRelationshipCommand(req);
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
		case ShipDestinationEditPart.VISUAL_ID:
			return getGEFWrapper(new ShipDestinationReorientCommand(req));
		case ShipRouteEditPart.VISUAL_ID:
			return getGEFWrapper(new ShipRouteReorientCommand(req));
		case PortRegisterEditPart.VISUAL_ID:
			return getGEFWrapper(new PortRegisterReorientCommand(req));
		}
		return super.getReorientReferenceRelationshipCommand(req);
	}

}
