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
package org.reuseware.sokan.ui.internal.actions;

import java.net.URL;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.actions.NewWizardAction;
import org.reuseware.sokan.ui.SokanUIPlugin;
import org.reuseware.sokan.ui.views.BasicRepositoryView;

/**
 * Action to create a new artifact. I delegates to a 
 * <code>org.eclipse.ui.actions.NewWizardAction</code>.
 */
public class NewAction extends BasicRepositoryViewAction {

	private static ImageDescriptor newArtifactImage;
	static {
		URL url = null;
		url = SokanUIPlugin.getDefault().getBundle().getResource(
				"icons/NewArtifact.gif");
		newArtifactImage = ImageDescriptor.createFromURL(url);
	}

	private NewWizardAction newWizardAction;
	
	/**
	 * Constructs a new action for the given repository view.
	 * 
	 * @param view the repository view
	 */
	public NewAction(BasicRepositoryView view) {
		super(view);
		this.setText("Create New Artifact");
		this.setToolTipText("Create New Artifact");
		this.setImageDescriptor(newArtifactImage);
	}

	@Override
	public void run() {
		IWorkbenchWindow workbenchWindow = getBasicRepositoryView().getViewSite().getWorkbenchWindow();
		if (newWizardAction == null) {
			newWizardAction = new NewWizardAction(workbenchWindow);
		}
		newWizardAction.run();
	}
}
