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

import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.jface.action.IAction;
import org.reuseware.coconut.compositionprogram.PhysicalCompositionProgram;

/**
 * Sets the selected fragment instance to <i>reference</i>.
 */
public class SetReferenceAction extends FragmentInstanceAction {

	/**
     * @param action the action proxy that handles the presentation portion of the
     *   action
     *   
     * @see IActionDelegat#run(IAction)
	 */
	public void run(IAction action) {
		TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(
				selectedFragmentInstance);
		domain.getCommandStack().execute(new RecordingCommand(domain) {
			protected void doExecute() {
				if (selectedFragmentInstance.isReference()) {
					selectedFragmentInstance.setReference(false);
				} else {
					selectedFragmentInstance.setTarget(false);
					selectedFragmentInstance.setReference(true);
				}
			}
		});
	}

	@Override
	protected String getText() {
		return selectedFragmentInstance.isReference()
				? "Unset Reference" : "Set Reference";
	}

	@Override
	protected boolean isEnabled() {
		return selectedFragmentInstance.getCompositionProgram() instanceof PhysicalCompositionProgram;
	}
}
