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
package org.reuseware.coconut.description.browse.views.content;

import java.util.List;

import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPartSite;
import org.reuseware.coconut.compositionprogram.CompositionProgram;
import org.reuseware.coconut.compositionprogram.FragmentInstance;
import org.reuseware.coconut.compositionprogram.diagram.part.CompositionprogramDiagramEditor;
import org.reuseware.coconut.compositionprogram.util.CompositionProgramUtil;
import org.reuseware.coconut.description.BrowserState;
import org.reuseware.coconut.description.FragmentDescription;
import org.reuseware.coconut.description.browse.MainBrowserManager;
import org.reuseware.coconut.description.browse.views.AbstractViewController;
import org.reuseware.coconut.description.classify.DescriptionManager;
import org.reuseware.coconut.fragment.Fragment;

public class ContentController extends AbstractViewController {

	public ContentController(ContentView contentView) {
		super(contentView);
	}

	public List<FragmentDescription> getFilteredContent() {
		BrowserState state = stateManager.getState();
		return state.getFilteredContent();
	}

	public void restartBrowser() {
		MainBrowserManager main = MainBrowserManager.getInstance();
		if (main.isBrowserPerspectivActive())
			main.restart();
	}
	
	/**
	 * @param selected
	 * @param site 
	 */
	public void select(FragmentDescription fDesc, IWorkbenchPartSite site) {

		try {
			IEditorPart activeEditor = site.getPage().getActiveEditor();
			
			// refresh description
			DescriptionManager.refresh(fDesc);
			
			// is the currently opened editor showing a composition program?
			if (activeEditor instanceof CompositionprogramDiagramEditor) {
				CompositionprogramDiagramEditor cpEditor = (CompositionprogramDiagramEditor) activeEditor;
				final CompositionProgram cp = (CompositionProgram) cpEditor.getDiagram().getElement();
				TransactionalEditingDomain domain = cpEditor.getEditingDomain();
							
				if (fDesc.getSubject() != null) {
					final Fragment fragment = fDesc.getSubject();
					
					// add described fragment to the composition programm
					domain.getCommandStack().execute(new RecordingCommand(domain) {
						protected void doExecute() {
							FragmentInstance fInstance = 
								CompositionProgramUtil.createFragmentInstance(fragment, cp);
							
							CompositionProgramUtil.linkImplicitInterface(cp, fInstance);
						}
					});
				}

			}
			else {
				MessageDialog.openError(site.getShell(),
						"No Composition Program Selected", 
						"Open a composition program.");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void test(FragmentDescription element) {
		System.out.println("element: " + element.getSubject());
	}
}
