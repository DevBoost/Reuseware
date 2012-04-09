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

import java.io.IOException;
import java.net.URL;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.jface.resource.ImageDescriptor;
import org.reuseware.coconut.compositionprogram.CompositionProgram;
import org.reuseware.coconut.compositionprogram.FragmentInstance;
import org.reuseware.coconut.compositionprogram.PhysicalCompositionProgram;
import org.reuseware.coconut.fragment.Fragment;
import org.reuseware.coconut.resource.ReuseResources;
import org.reuseware.coconut.resource.sokan.IndexConstants;
import org.reuseware.coconut.resource.util.ReuseResourcesUtil;
import org.reuseware.coconut.ui.CoCoNutUIPlugin;
import org.reuseware.coconut.ui.views.FragmentRepositoryView;
import org.reuseware.coconut.ui.views.InputDialogWithStoreSelection;
import org.reuseware.sokan.Constraint;
import org.reuseware.sokan.FacetedRequest;
import org.reuseware.sokan.IndexRow;
import org.reuseware.sokan.index.util.FacetUtil;
import org.reuseware.sokan.index.util.IndexUtil;
import org.reuseware.sokan.index.util.ResourceUtil;

/**
 * Action to rename/move the selected fragment. The action attempts to rename
 * diagrams associated with the fragment and to update all fragment instances in
 * composition programs that refer to the fragment.
 */
public class RenameAction extends FragmentRepositoryAction {

	private static ImageDescriptor artifactImage;
	static {
		URL url = null;
		url = CoCoNutUIPlugin.getDefault().getBundle().getResource(
				"icons/Move.gif");
		artifactImage = ImageDescriptor.createFromURL(url);
	}
	
	/**
	 * Constructs a new action for the given fragment repository view.
	 * 
	 * @param view the fragment repository view
	 */
	public RenameAction(FragmentRepositoryView view) {
		super(view);
		this.setText("Fragment Move/Rename...");
		this.setToolTipText("Fragment Move/Rename...");
		this.setImageDescriptor(artifactImage);
	}
	
	@Override
	public void run() {
		for (EObject element : getFragmentRepositoryView().getSelectedElements()) {
			if (element instanceof Fragment) {
				List<String> oldUFI = ((Fragment) element).getUFI();
				URI fragmentURI = ResourceUtil.uriFrom(ResourceUtil.idFrom(oldUFI));
				URI currentStoreURI = fragmentURI.trimSegments(oldUFI.size());
				
				String oldUFIString = ResourceUtil.idString(oldUFI);
				
				InputDialogWithStoreSelection inputDialog = new InputDialogWithStoreSelection(getFragmentRepositoryView().getSite().getShell(), 
						"Rename Fragment", "New Name", oldUFIString, currentStoreURI);
				
				if (inputDialog.open() != InputDialog.OK) {
					return;
				}
				
				String newUFIString = inputDialog.getValue();
				List<String> newUFI = ResourceUtil.idFrom(newUFIString).getSegments();
				
				URI newStoreURI = currentStoreURI.trimSegments(1).appendSegments(
						URI.createURI(inputDialog.getSelectedStore()).segments());
				
				if (newUFI != null) {
					renameFragment(newUFI, oldUFI, newStoreURI);
				}
			}
		}

	}

	private void renameFragment(List<String> newUFI, List<String> oldUFI, URI storeURI) {
		ResourceSet renameResourceSet = new ResourceSetImpl();
		Fragment fragment = ReuseResources.INSTANCE.getFragment(oldUFI, renameResourceSet);
		
		renameFragmentAndDiagrams(newUFI, oldUFI, fragment, storeURI, renameResourceSet);
		adjustCompositionPrograms(newUFI, oldUFI, renameResourceSet);
	}

	private void renameFragmentAndDiagrams(List<String> newUFI, List<String> oldUFI,
			Fragment fragment, URI storeURI, ResourceSet renameResourceSet) {
		if (fragment.getContents().isEmpty()) {
			return;
		}
		
		URI fragmentURI = fragment.getContents().get(0).eResource().getURI();
		Set<Resource> oldResources = new LinkedHashSet<Resource>();
		
		String oldName = oldUFI.get(oldUFI.size() - 1);
		String newName = newUFI.get(newUFI.size() - 1);
		oldName = oldName.contains(".") ? oldName.substring(0, oldName.indexOf(".")) : oldName;
		newName = newName.contains(".") ? newName.substring(0, newName.indexOf(".")) : newName;
		
		oldResources.add(fragment.getContents().get(0).eResource());
		for (EObject diagramRoot : fragment.getDiagrams()) {
			oldResources.add(diagramRoot.eResource());
		}
		
		EcoreUtil.resolveAll(renameResourceSet);
		
		for (Resource oldResource : oldResources) {
			URI oldURI = oldResource.getURI();
			if (oldURI.segmentCount() == fragmentURI.segmentCount()) {
				URI newURI = storeURI.appendSegments(newUFI.toArray(new String[newUFI.size()]));
				newURI = newURI.trimSegments(1).appendSegment(oldURI.lastSegment());
				String oldResourceName = oldURI.trimFileExtension().lastSegment();
				if (oldResourceName.contains(oldName)) {
					String newResourceName = oldResourceName.replace(oldName, newName);
					newURI = newURI.trimSegments(1).appendSegment(
							newResourceName).appendFileExtension(oldURI.fileExtension());
				}				
				Resource newResource = renameResourceSet.createResource(newURI);
				newResource.getContents().addAll(oldResource.getContents());
				oldResource.setModified(true);
				newResource.setModified(true);
			}
		}
		
		for (Resource resource : renameResourceSet.getResources()) {
			if (resource.isModified()) {
				if (!oldResources.contains(resource)) {
					try {
						resource.save(renameResourceSet.getLoadOptions());
					} catch (IOException e) {
						CoCoNutUIPlugin.logError("Error during rename", e);
					}
				}
			}
		}
		
		for (Resource resource : oldResources) {
			if (resource.isModified()) {
				try {
					resource.delete(renameResourceSet.getLoadOptions());
				} catch (IOException e) {
					CoCoNutUIPlugin.logError("Error during rename", e);
				}
			}
		}
	}
	
	private void adjustCompositionPrograms(List<String> newUFI, List<String> oldUFI,
			ResourceSet renameResourceSet) {
		
		List<Constraint> constraints = FacetUtil.buildConstraints(
				IndexConstants.COLUMN_INSTANTIATED_FRAGMENT,
				ResourceUtil.idString(oldUFI));
		FacetedRequest request  = FacetUtil.buildFacetedRequest(constraints);
		List<IndexRow> response = IndexUtil.INSTANCE.getIndex(request);
		
		for (IndexRow row : response) {
			Fragment cpFragment = ReuseResources.INSTANCE.getFragment(
					row.getArtifactID().getSegments(), renameResourceSet);
			
			CompositionProgram compositionProgram = ReuseResourcesUtil.getCompositionProgram(
					row.getArtifactID().getSegments(), renameResourceSet);
			
			EcoreUtil.resolveAll(renameResourceSet);
			
			String oldName = oldUFI.get(oldUFI.size() - 1);
			String newName = newUFI.get(newUFI.size() - 1);
			
			if (compositionProgram instanceof PhysicalCompositionProgram) {
				for (FragmentInstance fragmentInstance : compositionProgram.getFragmentInstances()) {
					if (fragmentInstance.getUFI().equals(oldUFI)) {
						fragmentInstance.getUFI().clear();
						fragmentInstance.getUFI().addAll(newUFI);
						if (fragmentInstance.getName().startsWith(oldName)) {
							fragmentInstance.setName(newName
									+ fragmentInstance.getName().substring(oldName.length()));
						}
					}
				}
			}
			
			try {
				for (EObject cpDiagramRoot : cpFragment.getDiagrams()) {
					cpDiagramRoot.eResource().save(renameResourceSet.getLoadOptions());
				}
				compositionProgram.eResource().save(renameResourceSet.getLoadOptions());
			} catch (IOException e) {
				CoCoNutUIPlugin.logError("Error during rename", e);
			}
		}
		
	}

}
