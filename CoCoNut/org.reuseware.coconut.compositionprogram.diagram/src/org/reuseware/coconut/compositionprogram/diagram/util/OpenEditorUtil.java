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
package org.reuseware.coconut.compositionprogram.diagram.util;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.content.IContentType;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.ui.IEditorDescriptor;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorRegistry;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.FileEditorInput;
import org.reuseware.coconut.fragment.Fragment;
import org.reuseware.coconut.ui.DiagramInitializerUtil;

/**
 * Utility class to open an editor (graphical, textual, or tree) for a given fragment.
 */
public final class OpenEditorUtil {
	
	private OpenEditorUtil() { }
	
	/**
	 * Opens the most appropriate editor installed for the given fragment. If 
	 * the fragment has a diagram, the corresponding diagram editor will be chosen.
	 * 
	 * @param fragment the fragment for which to open an editor
	 * @return the editor if any was found and opened
	 */
	public static IEditorPart openEditor(Fragment fragment) {
		if (fragment == null) {
			return null;
		}
		
		if (!fragment.getDiagrams().isEmpty()) {
			InternalEList<EObject> diagramList = (InternalEList<EObject>) fragment.getDiagrams();
			//use basicGet to not resolve proxies, which is not necessary because openEditor() can handle proxies
			return openEditor(diagramList.basicGet(0));
		}
		if (!fragment.getContents().isEmpty()) {
			//try to create a diagram
			Resource diagramResource = 
				DiagramInitializerUtil.initializeDiagram(
						fragment.getContents().get(0).eResource());
			if (diagramResource != null) {
				return openEditor(diagramResource.getContents().get(0));
			}
			return openEditor(fragment.getContents().get(0));
		}
		return null;
	}

	/**
	 * Opens the most appropriate editor installed for the fragment that contains
	 * the given EObject.
	 * 
	 * @param element the EObject for which to open an editor
	 * @return the editor if any was found and opened
	 */
	public static IEditorPart openEditor(EObject element) {
		IFile file = null;
		if (!element.eIsProxy()) {
			Resource resource = element.eResource();
			if (resource != null) {
				file = WorkspaceSynchronizer.getFile(resource); 
			}
			
		} else {
			URI resourceURI = ((InternalEObject) element).eProxyURI().trimFragment();
			IPath path = new Path(resourceURI.toPlatformString(true));
			file = ResourcesPlugin.getWorkspace().getRoot().getFile(path);
		}

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
