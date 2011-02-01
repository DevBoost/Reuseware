/*******************************************************************************
 * Copyright (c) 2006-2009
 * Software Technology Group, Dresden University of Technology
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Software Technology Group - TU Dresden, Germany
 *      - initial API and implementation
 ******************************************************************************/
package org.reuseware.coconut.roundtrip.interactive.gui;

import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;

public class InteractiveAddResolver extends AbstractInteractiveResolver {
	
	/**
	 * Opens a dialog to let the user decide where to add the new element.
	 * 
	 * @param sourceUFIs
	 *            All possible source fragment UFIs.
	 * @return The user-chosen UFI.
	 */
	public URI showSelectSourceFragmentGUI(List<URI> sourceUFIs) {
		IWorkbenchPage page = PlatformUI.getWorkbench()
				.getActiveWorkbenchWindow().getActivePage();

		ElementListSelectionDialog ld = new ElementListSelectionDialog(page
				.getActivePart().getSite().getShell(), new LabelProvider()) {
			protected void createButtonsForButtonBar(Composite parent) {
				// create only OK button
				createButton(parent, IDialogConstants.OK_ID,
						IDialogConstants.OK_LABEL, true);
				// createButton(parent, IDialogConstants.CANCEL_ID,
				// IDialogConstants.CANCEL_LABEL, false);
			}
		};
		Object[] options = sourceUFIs.toArray();
		ld.setElements(options);
		ld.setMultipleSelection(false);
		ld.setTitle("Backpropagation Conflict");
		String text = "To which source fragment should the new element be propagated?";
		ld.setMessage(text);
		ld.open();

		Object answer = ld.getResult()[0];
		return (URI) answer;

	}
}
