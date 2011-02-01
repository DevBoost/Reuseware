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

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;
import org.reuseware.application.taipan.TaiPanPackage;
import org.reuseware.application.taipan.gmf.editor.edit.commands.PortCreateCommand;
import org.reuseware.application.taipan.gmf.editor.edit.commands.PortSlotCreateCommand;
import org.reuseware.application.taipan.gmf.editor.edit.commands.RouteSlotCreateCommand;
import org.reuseware.application.taipan.gmf.editor.edit.commands.ShipCreateCommand;
import org.reuseware.application.taipan.gmf.editor.edit.commands.WarshipCreateCommand;
import org.reuseware.application.taipan.gmf.editor.providers.TaiPanElementTypes;

/**
 * @generated
 */
public class AquatoryItemSemanticEditPolicy extends
		TaiPanBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (TaiPanElementTypes.Port_2001 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(TaiPanPackage.eINSTANCE
						.getAquatory_Ports());
			}
			return getGEFWrapper(new PortCreateCommand(req));
		}
		if (TaiPanElementTypes.Ship_2002 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(TaiPanPackage.eINSTANCE
						.getAquatory_Ships());
			}
			return getGEFWrapper(new ShipCreateCommand(req));
		}
		if (TaiPanElementTypes.Warship_2003 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(TaiPanPackage.eINSTANCE
						.getAquatory_Ships());
			}
			return getGEFWrapper(new WarshipCreateCommand(req));
		}
		if (TaiPanElementTypes.PortSlot_2004 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(TaiPanPackage.eINSTANCE
						.getAquatory_Ports());
			}
			return getGEFWrapper(new PortSlotCreateCommand(req));
		}
		if (TaiPanElementTypes.RouteSlot_2005 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(TaiPanPackage.eINSTANCE
						.getAquatory_Routes());
			}
			return getGEFWrapper(new RouteSlotCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost())
				.getEditingDomain();
		return getGEFWrapper(new DuplicateAnythingCommand(editingDomain, req));
	}

	/**
	 * @generated
	 */
	private static class DuplicateAnythingCommand extends
			DuplicateEObjectsCommand {

		/**
		 * @generated
		 */
		public DuplicateAnythingCommand(
				TransactionalEditingDomain editingDomain,
				DuplicateElementsRequest req) {
			super(editingDomain, req.getLabel(), req
					.getElementsToBeDuplicated(), req
					.getAllDuplicatedElementsMap());
		}

	}

}
