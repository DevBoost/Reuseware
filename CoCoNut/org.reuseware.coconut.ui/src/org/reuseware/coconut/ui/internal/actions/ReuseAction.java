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
package org.reuseware.coconut.ui.internal.actions;

import java.net.URL;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.diagram.ui.resources.editor.parts.DiagramDocumentEditor;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.IEditorPart;
import org.reuseware.coconut.compositionprogram.CompositionProgram;
import org.reuseware.coconut.compositionprogram.FragmentInstance;
import org.reuseware.coconut.compositionprogram.PhysicalCompositionProgram;
import org.reuseware.coconut.compositionprogram.util.CompositionProgramUtil;
import org.reuseware.coconut.fragment.Fragment;
import org.reuseware.coconut.resource.ReuseResources;
import org.reuseware.coconut.ui.CoCoNutUIPlugin;
import org.reuseware.coconut.ui.views.FragmentRepositoryView;

/**
 * Action that instantiates the currently selected fragment in the
 * composition program currently opened in the graphical 
 * composition program editor.
 */
public class ReuseAction extends FragmentRepositoryAction {
	
	private static ImageDescriptor useFragmentImage;
	static {
		URL url = null;
		url = CoCoNutUIPlugin.getDefault().getBundle().getResource(
				"icons/UseFragment.gif");
		useFragmentImage = ImageDescriptor.createFromURL(url);
	}
	
	/**
	 * Constructs a new action for the given fragment repository view.
	 * 
	 * @param view the fragment repository view
	 */
	public ReuseAction(FragmentRepositoryView view) {
		super(view);
		this.setText("Reuse Fragment");
		this.setToolTipText("Reuse the selected fragment");
		this.setImageDescriptor(useFragmentImage);
		this.setEnabled(true);
	}
	
	@Override
	public void run() {	
		IEditorPart activeEditor = getActiveCompositionProgramEditor();
		
		if (activeEditor != null) {
			DiagramDocumentEditor cpEditor = (DiagramDocumentEditor) activeEditor;
			final CompositionProgram cp = (CompositionProgram) cpEditor.getDiagram().getElement();
			TransactionalEditingDomain domain = cpEditor.getEditingDomain();
			
			for (EObject element : getFragmentRepositoryView().getSelectedElements()) {
				if (element instanceof Fragment) {
					final Fragment fragment = 
						ReuseResources.INSTANCE.getFragment(((Fragment) element).getUFI(), 
								domain.getResourceSet());
								
					domain.getCommandStack().execute(new RecordingCommand(domain) {
						protected void doExecute() {
							FragmentInstance fInstance = 
								CompositionProgramUtil.createFragmentInstance(fragment, cp);
							
							CompositionProgramUtil.linkImplicitInterface(cp, fInstance);
						}
					});
				}
			}

		} else {
			MessageDialog.openError(getFragmentRepositoryView().getSite().getShell(),
					"No Composition Program Selected", 
					"Open a composition program.");
		}
	}
	
	/**
	 * @return the currently active UCL composition program editor
	 */
	public IEditorPart getActiveCompositionProgramEditor() {
		IEditorPart activeEditor = 
			getFragmentRepositoryView().getSite().getPage().getActiveEditor();
		
		if (activeEditor instanceof DiagramDocumentEditor) {
			if (((DiagramDocumentEditor) activeEditor).getDiagram().getElement() instanceof PhysicalCompositionProgram) {
				return activeEditor;
			}
		}
		
		return null;
	}
}
