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

import org.eclipse.emf.common.command.CommandStack;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.IInputValidator;
import org.eclipse.jface.dialogs.InputDialog;
import org.reuseware.coconut.compositionprogram.FragmentInstance;

/**
 * Action for defining arguments as additional configuration of 
 * fragment instances. An example for an argument is 'layoutStrategy'
 * interpreted by Lacome.
 */
public class SetArgumentAction extends FragmentInstanceAction {

	/**
     * @param action the action proxy that handles the presentation portion of the
     *   action
     *   
     * @see IActionDelegat#run(IAction)
	 */
	public void run(IAction action) {
		
		InputDialog argumentDialog = new InputDialog(shell, 
			"Configure Attribute",
			"Enter name of attribute",
			proposeAttribute(selectedFragmentInstance),
			new IInputValidator() {
				public String isValid(String newText) {
					if (newText == null || newText.length() == 0) {
						return "Enter a valid attribute name";
					}
					return null;
				}			
			});
		if (argumentDialog.open() != InputDialog.OK) {
			return;
		}
		final String argumentName = argumentDialog.getValue();
		
		InputDialog valueDialog = new InputDialog(shell, 
				"Enter Value",
				"Enter value for " + argumentName,
				proposeValue(selectedFragmentInstance, argumentName),
				new IInputValidator() {
					public String isValid(String newText) {
						if (newText == null || newText.length() == 0) {
							return "Enter a valid attribute value";
						}
						return null;
					}			
				});
		if (valueDialog.open() != InputDialog.OK) {
			return;
		}
		final String attributeValue = valueDialog.getValue();
		
		final FragmentInstance fragmentInstance = selectedFragmentInstance;
	
		TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(fragmentInstance);
		CommandStack commandStack = domain.getCommandStack();
		
		synchronized (commandStack) {
			commandStack.execute(new RecordingCommand(domain) {
				protected void doExecute() {
					fragmentInstance.getArguments().put(argumentName, attributeValue);
				}
			});
		}
		
	}

	private String proposeAttribute(FragmentInstance fragmentInstance) {
		String proposal = "newAttribute";
		
		for (String attribute : fragmentInstance.getArguments().keySet()) {
			return attribute;
		}
		
		return proposal;
	}
	
	
	private String proposeValue(FragmentInstance fragmentInstance,
			String argumentName) {
		String proposal = fragmentInstance.getArguments().get(argumentName);
		return proposal == null ? "value" : proposal;
	}


}
