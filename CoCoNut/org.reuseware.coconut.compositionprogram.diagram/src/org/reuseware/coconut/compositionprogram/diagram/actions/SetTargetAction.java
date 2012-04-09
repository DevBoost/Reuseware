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
package org.reuseware.coconut.compositionprogram.diagram.actions;

import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.jface.action.IAction;
import org.reuseware.coconut.compositionprogram.PhysicalCompositionProgram;
import org.reuseware.coconut.resource.sokan.util.SokanReuseResourceUtil;
import org.reuseware.coconut.ui.views.InputDialogWithStoreSelection;
import org.reuseware.sokan.index.util.ResourceUtil;

/**
 * Sets the selected fragment instance to <i>target</i>.
 */
public class SetTargetAction extends FragmentInstanceAction {

	/**
     * @param action the action proxy that handles the presentation portion of the
     *   action
     *   
     * @see IActionDelegat#run(IAction)
	 */
	public void run(IAction action) {
		String oldTargetUFIString = 
			ResourceUtil.idString(selectedFragmentInstance.getTargetUFI());
		String newTargetUFIString = oldTargetUFIString;
		String selectedStore = selectedFragmentInstance.getTargetPhysicalLocation();
		
		if (!selectedFragmentInstance.isTarget()) {
			URI currentStoreURI = SokanReuseResourceUtil.getComposedFragmentURI(
					selectedFragmentInstance.getTargetUFI(), selectedFragmentInstance.getCompositionProgram()).trimSegments(
							selectedFragmentInstance.getTargetUFI().size());
			InputDialogWithStoreSelection inputDialog = new InputDialogWithStoreSelection(shell, 
					"Define Target UFI", "Target UFI", oldTargetUFIString, currentStoreURI);
			inputDialog.open();
			newTargetUFIString = inputDialog.getValue();
			selectedStore = inputDialog.getSelectedStore();
			if (newTargetUFIString == null || "".equals(newTargetUFIString)) {
				return;
			}
		}

		final List<String> newTargetUFI = 
			ResourceUtil.idFrom(newTargetUFIString).getSegments();	
		final String newLocationHint = selectedStore;
		TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(
				selectedFragmentInstance);
		domain.getCommandStack().execute(new RecordingCommand(domain) {
			protected void doExecute() {
				if (selectedFragmentInstance.isTarget()) {
					selectedFragmentInstance.setTarget(false);
				} else {
					selectedFragmentInstance.setReference(false);
					selectedFragmentInstance.setTarget(true);
					selectedFragmentInstance.getTargetUFI().clear();
					selectedFragmentInstance.getTargetUFI().addAll(newTargetUFI);
					selectedFragmentInstance.setTargetPhysicalLocation(newLocationHint);
				}
			}
		});
	}

	@Override
	protected String getText() {
		return selectedFragmentInstance.isTarget()
				? "Unset Target" : "Set Target...";
	}
	
	@Override
	protected boolean isEnabled() {
		return selectedFragmentInstance.getCompositionProgram() instanceof PhysicalCompositionProgram;
	}

}
