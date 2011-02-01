package org.reuseware.comogen.ui.internal.actions;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.resource.ImageDescriptor;
import org.reuseware.coconut.fracol.FragmentCollaboration;
import org.reuseware.coconut.resource.sokan.IndexConstants;
import org.reuseware.coconut.resource.util.ReuseResourcesUtil;
import org.reuseware.coconut.reuseextension.ReuseExtension;
import org.reuseware.coconut.reuseextensionactivator.ReuseExtensionActivator;
import org.reuseware.coconut.ui.views.InputDialogWithStoreSelection;
import org.reuseware.comogen.ui.CoMoGenUIPlugin;
import org.reuseware.comogen.ui.views.CompositionSystemRepositoryView;
import org.reuseware.sokan.Constraint;
import org.reuseware.sokan.FacetedRequest;
import org.reuseware.sokan.IndexRow;
import org.reuseware.sokan.index.util.FacetUtil;
import org.reuseware.sokan.index.util.IndexUtil;
import org.reuseware.sokan.index.util.ResourceUtil;

/**
 * Action to perform a rename/move refactoring of a fracol or a rex file.
 */
public class RenameAction extends CompositionSystemRepositoryAction {

	private static ImageDescriptor artifactImage;
	static {
		URL url = null;
		url = CoMoGenUIPlugin.getDefault().getBundle().getResource(
				"icons/Move.gif");
		artifactImage = ImageDescriptor.createFromURL(url);
	}
	
	/**
	 * Construct new rename action.
	 * 
	 * @param view the associated <code>CompositionSystemRepositoryView</code>
	 */
	public RenameAction(CompositionSystemRepositoryView view) {
		super(view);
		this.setText("Fracol or Rex Move/Rename...");
		this.setToolTipText("Fracol or Rex Move/Rename...");
		this.setImageDescriptor(artifactImage);
	}
	
	/**
	 * Changes the name of the currently selected element and updates references
	 * to that name in other artifacts in the repository.
	 */
	public void run() {
		for (EObject element : getCompositionSystemRepositoryView().getSelectedElements()) {
			List<String> oldID = null;
			if (element instanceof FragmentCollaboration) {
				oldID = new ArrayList<String>(((FragmentCollaboration) element).getFracolNamespace());
				oldID.add(((FragmentCollaboration) element).getFracolName());
			}
			if (element instanceof ReuseExtension) {
				oldID = new ArrayList<String>(((ReuseExtension) element).getRexNamespace());
				oldID.add(((ReuseExtension) element).getRexName());
			}
			
			URI physicalURI = ResourceUtil.uriFrom(ResourceUtil.idFrom(oldID));
			URI currentStoreURI = physicalURI.trimSegments(oldID.size());
			
			String oldUFIString = ResourceUtil.idString(oldID);
			
			InputDialogWithStoreSelection inputDialog = new InputDialogWithStoreSelection(getCompositionSystemRepositoryView().getSite().getShell(), 
					"Move/Rename Fracol or Rex", "New Name", oldUFIString, currentStoreURI);
			
			inputDialog.open();
			
			String newUFIString = inputDialog.getValue();
			List<String> newID = ResourceUtil.idFrom(newUFIString).getSegments();
			
			URI newStoreURI = currentStoreURI.trimSegments(1).appendSegments(
					URI.createURI(inputDialog.getSelectedStore()).segments());
			
			if (newID != null) {
				if (element instanceof FragmentCollaboration) {
					renameFragmentCollaboration(newID, oldID, newStoreURI);
				}
				if (element instanceof ReuseExtension) {
					renameReuseExtension(newID, oldID, newStoreURI);
				}

			}
			
		}
	}
	
	private void renameFragmentCollaboration(List<String> newID, List<String> oldID, URI storeURI) {
		ResourceSet renameResourceSet = new ResourceSetImpl();
		FragmentCollaboration fracol = ReuseResourcesUtil.getFragmentCollaboration(oldID, renameResourceSet);
		fracol.setFracolName(newID.get(newID.size() - 1));
		fracol.getFracolNamespace().clear();
		fracol.getFracolNamespace().addAll(newID.subList(0, newID.size() - 1));
		for (List<String> rexID : getImplementingReuseExtensionIDs(oldID)) {
			ReuseExtension rex = ReuseResourcesUtil.getReuseExtension(rexID, renameResourceSet);
			rex.getFracolNamespace().clear();
			rex.getFracolNamespace().addAll(newID.subList(0, newID.size() - 1));
			rex.eResource().setModified(true);
		}
		
		EcoreUtil.resolveAll(renameResourceSet);
		
		Resource oldFracolResource = fracol.eResource();
		Resource newFracolResouce = renameResourceSet.createResource(
				storeURI.appendSegments(newID.toArray(new String[newID.size()])));
		newFracolResouce.getContents().addAll(oldFracolResource.getContents());
		
		try {
			newFracolResouce.save(renameResourceSet.getLoadOptions());
		} catch (IOException e) {
			CoMoGenUIPlugin.logError("Error during rename", e);
		}
		try {
			oldFracolResource.delete(renameResourceSet.getLoadOptions());
		} catch (IOException e) {
			CoMoGenUIPlugin.logError("Error during rename", e);
		}
		
		for (Resource resource : renameResourceSet.getResources()) {
			if (resource.isModified()) {
				try {
					resource.save(renameResourceSet.getLoadOptions());
				} catch (IOException e) {
					CoMoGenUIPlugin.logError("Error during rename", e);
				}
			}
		}
	}

	private void renameReuseExtension(List<String> newID, List<String> oldID, URI storeURI) {
		ResourceSet renameResourceSet = new ResourceSetImpl();
		ReuseExtension rex = ReuseResourcesUtil.getReuseExtension(oldID, renameResourceSet);
		rex.setRexName(newID.get(newID.size() - 1));
		rex.getRexNamespace().clear();
		rex.getRexNamespace().addAll(newID.subList(0, newID.size() - 1));
		for (List<String> rexActivatorID : getActivatingReuseExtensionActivatorListIDs(oldID)) {
			for (ReuseExtensionActivator rexActivator : ReuseResourcesUtil.getReuseExtensionActivatorList(rexActivatorID, renameResourceSet).getActivators()) {
				if (rex.equals(rexActivator.getReuseExtension())) {
					rexActivator.getRexNamespace().clear();
					rexActivator.getRexNamespace().addAll(newID.subList(0, newID.size() - 1));
					rexActivator.eResource().setModified(true);			
				}
			}
		}
		
		EcoreUtil.resolveAll(renameResourceSet);
		
		Resource oldRexResource = rex.eResource();
		Resource newRexResouce = renameResourceSet.createResource(
				storeURI.appendSegments(newID.toArray(new String[newID.size()])));
		newRexResouce.getContents().addAll(oldRexResource.getContents());
		
		try {
			newRexResouce.save(renameResourceSet.getLoadOptions());
		} catch (IOException e) {
			CoMoGenUIPlugin.logError("Error during rename", e);
		}
		try {
			oldRexResource.delete(renameResourceSet.getLoadOptions());
		} catch (IOException e) {
			CoMoGenUIPlugin.logError("Error during rename", e);
		}
		
		for (Resource resource : renameResourceSet.getResources()) {
			if (resource.isModified()) {
				try {
					resource.save(renameResourceSet.getLoadOptions());
				} catch (IOException e) {
					CoMoGenUIPlugin.logError("Error during rename", e);
				}
			}
		}

		//TODO #1052: update phyiscal composition programs as well?
	}
	
	private List<List<String>> getImplementingReuseExtensionIDs(
			List<String> implementedFragmentCollaborationID) {
		
		List<List<String>> result = new ArrayList<List<String>>();
		
		List<Constraint> constraints = FacetUtil.buildConstraints(
				IndexConstants.COLUMN_CM_IMPLEMENTED_FRAGMENT_COLLABORATION,
				ResourceUtil.idString(implementedFragmentCollaborationID));
		FacetedRequest request  = FacetUtil.buildFacetedRequest(constraints);
		List<IndexRow> response = IndexUtil.INSTANCE.getIndex(request);
		for (IndexRow rexRow : response) {
			result.add(rexRow.getArtifactID().getSegments());
		}
		
		constraints = FacetUtil.buildConstraints(
				IndexConstants.COLUMN_CL_IMPLEMENTED_FRAGMENT_COLLABORATION,
				ResourceUtil.idString(implementedFragmentCollaborationID));
		request  = FacetUtil.buildFacetedRequest(constraints);
		response = IndexUtil.INSTANCE.getIndex(request);
		for (IndexRow rexRow : response) {
			result.add(rexRow.getArtifactID().getSegments());
		}
		
		return result;
	}
	
	private List<List<String>> getActivatingReuseExtensionActivatorListIDs(
			List<String> activatedResueExtensionID) {
		List<List<String>> result = new ArrayList<List<String>>();
		
		List<Constraint> constraints = FacetUtil.buildConstraints(
				IndexConstants.COLUMN_CM_ACTIVATED_REUSE_EXTENSION,
				ResourceUtil.idString(activatedResueExtensionID));
		FacetedRequest request  = FacetUtil.buildFacetedRequest(constraints);
		List<IndexRow> response = IndexUtil.INSTANCE.getIndex(request);
		for (IndexRow activatorRow : response) {
			result.add(activatorRow.getArtifactID().getSegments());
		}
		
		constraints = FacetUtil.buildConstraints(
				IndexConstants.COLUMN_CL_ACTIVATED_REUSE_EXTENSION,
				ResourceUtil.idString(activatedResueExtensionID));
		request  = FacetUtil.buildFacetedRequest(constraints);
		response = IndexUtil.INSTANCE.getIndex(request);
		for (IndexRow activatorRow : response) {
			result.add(activatorRow.getArtifactID().getSegments());
		}
		
		return result;
	}
	
}
