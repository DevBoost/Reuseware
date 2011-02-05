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
package org.reuseware.coconut.ui.internal.actions;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.content.IContentType;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.ui.IEditorDescriptor;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorRegistry;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.FileEditorInput;
import org.reuseware.coconut.ui.views.FragmentRepositoryView;

/**
 * Common base implementation for actions associated with the
 * fragment repository view.
 */
public abstract class FragmentRepositoryAction extends Action {
	
	private FragmentRepositoryView fragmentRepositoryView;
	
	/**
	 * Constructs a new action for the given fragment repository view.
	 * 
	 * @param view the fragment repository view
	 */
	public FragmentRepositoryAction(FragmentRepositoryView view) {
		this.fragmentRepositoryView = view;
	}
	
	/**
	 * @return the fragment repository view this actions is associated with
	 */
	public FragmentRepositoryView getFragmentRepositoryView() {
		return fragmentRepositoryView;
	}

	protected IEditorPart openEditor(IFile file) {
		if (file != null && file.exists()) {
			IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
			IEditorRegistry editorRegistry = PlatformUI.getWorkbench().getEditorRegistry();

			IEditorDescriptor editorDescriptor = null;
			String fileName = file.getName();
			IContentType[] contentTypes = Platform.getContentTypeManager().findContentTypesFor(fileName);

			if (contentTypes.length == 0) {
				editorDescriptor = editorRegistry.getDefaultEditor(fileName, null);
			}
			for (int i = 0; editorDescriptor == null && i < contentTypes.length; i++) {
				editorDescriptor = editorRegistry.getDefaultEditor(fileName, contentTypes[i]);
			}

			if (editorDescriptor == null) {
				//try default model tree editor
				editorDescriptor = editorRegistry.getDefaultEditor(".xmi");
			}
			
			if (editorDescriptor != null) {

		        try {			        
		        	final IEditorPart editor =  page.openEditor(
						      new FileEditorInput(file),
						      editorDescriptor.getId());
					return editor;
					
				} catch (PartInitException e) {
					e.printStackTrace();
				}
			} else {
				MessageDialog.openError(page.getActivePart().getSite().getShell(), 
						"Open editor error",
						"No editor found for '" + file.getName() + "'.");
			}
		}
		return null;
	}
}
