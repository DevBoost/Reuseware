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

import java.net.URL;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.jface.resource.ImageDescriptor;
import org.reuseware.coconut.fragment.Fragment;
import org.reuseware.coconut.resource.ReuseResources;
import org.reuseware.coconut.ui.CoCoNutUIPlugin;
import org.reuseware.coconut.ui.DiagramInitializerUtil;
import org.reuseware.coconut.ui.views.FragmentRepositoryView;
import org.reuseware.sokan.ID;
import org.reuseware.sokan.index.util.ResourceUtil;

/**
 * An action to open the diagram view of an artifact.
 */
public class OpenDiagramAction extends FragmentRepositoryAction {

	private static ImageDescriptor artifactImage;
	static {
		URL url = null;
		url = CoCoNutUIPlugin.getDefault().getBundle().getResource(
				"icons/Diagram.gif");
		artifactImage = ImageDescriptor.createFromURL(url);
	}
	
	/**
	 * Constructor of the action.
	 * 
	 * @param view the fragment repository view to which this action belongs
	 */
	public OpenDiagramAction(FragmentRepositoryView view) {
		super(view);
		this.setText("Open Diagram(s)");
		this.setToolTipText("Open Diagram(s)");
		this.setImageDescriptor(artifactImage);
	}
	
	@Override
	public void run() {
		for (EObject element : getFragmentRepositoryView().getSelectedElements()) {
			Fragment fragment = getFragment(element);
			if (fragment != null) {
				
				boolean diagramFound = false;
				
				for (EObject diagramRoot : fragment.getDiagrams()) {
					Resource diagramResource = diagramRoot.eResource();
					IFile file = WorkspaceSynchronizer.getFile(diagramResource); 
					diagramFound = diagramFound || openEditor(file) != null;
				}
				
				if (!diagramFound && !fragment.getContents().isEmpty()) {
					//try to create a diagram
					Resource diagramResource = 
						DiagramInitializerUtil.initializeDiagram(
								fragment.getContents().get(0).eResource());
					if (diagramResource != null) {
						fragment.getDiagrams().addAll(diagramResource.getContents());
						IFile file = WorkspaceSynchronizer.getFile(diagramResource); 
						openEditor(file);
					} else {
						//open plain model as fallback
						IFile file = getFragmentRepositoryView().getFileForElement(element);
						openEditor(file);					
					}
				}
			}

		}
		

	}

	/**
	 * @param element the element to check
	 * @return true if a diagram for the given element exists
	 */
	public boolean hasDiagrams(EObject element) {
		Fragment fragment = getFragment(element);
		if (fragment == null) {
			return false;
		}
		return !fragment.getDiagrams().isEmpty();
	}
	
	private Fragment getFragment(EObject element) {
		URI uri = getFragmentRepositoryView().getURIForElement(element);
		ID id = ResourceUtil.idFrom(uri);
		if (id == null) {
			return null;
		}
		ResourceSet resourceSet = getFragmentRepositoryView().getResourceSet();
		Fragment fragment = ReuseResources.INSTANCE.getFragment(
				id.getSegments(), resourceSet);
		return fragment;
	}
}
