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

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.content.IContentType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorDescriptor;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorRegistry;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.FileEditorInput;
import org.reuseware.coconut.compositionprogram.CompositionProgram;
import org.reuseware.coconut.compositionprogram.FragmentInstance;
import org.reuseware.coconut.compositionprogram.diagram.edit.parts.FragmentInstanceNameEditPart;

/**
 * Base class for actions performed on fragment instances.
 */
public abstract class FragmentInstanceAction implements IObjectActionDelegate {

	protected Shell shell;
	protected FragmentInstance selectedFragmentInstance;
	

	/**
	 * @param action
	 *            the action proxy that handles presentation portion of the
	 *            action; must not be <code>null</code>.
	 * @param targetPart
	 *            the new part target; must not be <code>null</code>.
	 *            
	 * @see IObjectActionDelegate#setActivePart(IAction, IWorkbenchPart)
	 */
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		shell = targetPart.getSite().getShell();
	}

	/**
	 * @param action the action proxy that handles presentation portion of 
     * 		the action
     * @param selection the current selection, or <code>null</code> if there
     * 		is no selection.
     * 
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {
		selectedFragmentInstance = null;
		EditPart selected = (EditPart) ((StructuredSelection) selection).getFirstElement();
		if (selected instanceof FragmentInstanceNameEditPart) {
			selected = ((FragmentInstanceNameEditPart) selected).getParent();
		}
		if (selected == null) {
			return;
		}
		
		EObject element = ((View) selected.getModel()).getElement();
		if (element instanceof FragmentInstance) {
			selectedFragmentInstance = (FragmentInstance) element;
		} else if (element instanceof CompositionProgram) {
			//default behavior: select the first 'target' fragment
			CompositionProgram compositionProgram = (CompositionProgram) element;
			for (FragmentInstance candidate : compositionProgram.getFragmentInstances()) {
				if (candidate.isTarget()) {
					selectedFragmentInstance = candidate;
					break;
				}
			}
		}
		if (!"".equals(getText())) {
			action.setText(getText());	
		}
		if (selectedFragmentInstance == null) {
			action.setEnabled(false);
		} else {
			action.setEnabled(isEnabled());
		}
	}
	
	
	protected String getText() {
		return "";
	}
	
	protected boolean isEnabled() {
		return true;
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
						"No editor found for '"
						+ file.getName()
						+ "'.");
			}
		}
		return null;
	}

}
