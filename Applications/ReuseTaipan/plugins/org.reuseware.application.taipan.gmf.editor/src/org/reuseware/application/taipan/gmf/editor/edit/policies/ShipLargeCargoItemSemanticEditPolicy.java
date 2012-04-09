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

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.reuseware.application.taipan.TaiPanPackage;
import org.reuseware.application.taipan.gmf.editor.edit.commands.EmptyBoxCreateCommand;
import org.reuseware.application.taipan.gmf.editor.edit.commands.ItemHookCreateCommand;
import org.reuseware.application.taipan.gmf.editor.edit.commands.LargeItemCreateCommand;
import org.reuseware.application.taipan.gmf.editor.providers.TaiPanElementTypes;

/**
 * @generated
 */
public class ShipLargeCargoItemSemanticEditPolicy extends
		TaiPanBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (TaiPanElementTypes.LargeItem_3002 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(TaiPanPackage.eINSTANCE
						.getShip_Cargo());
			}
			return getGEFWrapper(new LargeItemCreateCommand(req));
		}
		if (TaiPanElementTypes.EmptyBox_3003 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(TaiPanPackage.eINSTANCE
						.getShip_Cargo());
			}
			return getGEFWrapper(new EmptyBoxCreateCommand(req));
		}
		if (TaiPanElementTypes.LargeItemHook_3004 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(TaiPanPackage.eINSTANCE
						.getShip_Cargo());
			}
			return getGEFWrapper(new ItemHookCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
