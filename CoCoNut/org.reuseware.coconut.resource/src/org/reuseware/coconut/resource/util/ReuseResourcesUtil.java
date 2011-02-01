package org.reuseware.coconut.resource.util;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.reuseware.coconut.compositionprogram.CompositionLink;
import org.reuseware.coconut.compositionprogram.CompositionProgram;
import org.reuseware.coconut.compositionprogram.DerivedCompositionProgram;
import org.reuseware.coconut.compositionprogram.FragmentInstance;
import org.reuseware.coconut.compositionprogram.PhysicalCompositionProgram;
import org.reuseware.coconut.fracol.FragmentCollaboration;
import org.reuseware.coconut.fragment.Fragment;
import org.reuseware.coconut.resource.ReuseResources;
import org.reuseware.coconut.reuseextension.ReuseExtension;
import org.reuseware.coconut.reuseextensionactivator.ReuseExtensionActivatorList;

/**
 * Utility class to control the relationships between all artifacts in a repository
 * Reuseware is concerned with. Different types of artifacts (fragments, composition programs,
 * fracols, reuse extensions) are explicitly supported and treated differently.
 * <p>
 * The class offers method to obtain different types of artifacts by ID.
 * <p>
 * The class manages the diagram types extension point.
 */
public final class ReuseResourcesUtil {
	
	private ReuseResourcesUtil() { }
	
	/**
	 * Inform Reuseware that the content of the fracol with the given ID has changed.
	 * Further updates that are required are calculated and returned.
	 * 
	 * @param fracolID ID of the fracol
	 * @return required update operations
	 */
	public static DirtyReuseResourceIDCollection fragmentCollaborationChanged(List<String> fracolID) {
		ReuseResources rr = ReuseResources.INSTANCE;
		DirtyReuseResourceIDCollection result = new DirtyReuseResourceIDCollection();
		
		result.getFragmentCompositionInterfaceIDs().addAll(
				rr.getInfluencedCompositionInterfaceIDsFracol(fracolID));
		result.getComposingCompositionProgramIDs().addAll(
				rr.getInfluencedComposingCompositionProgramIDsFracol(fracolID));
		result.getDerivedCompositionProgramIDs().addAll(
				rr.getInfluencedDerivedCompositionProgramIDsFracol(fracolID));

		return result;
	}
	
	/**
	 * Inform Reuseware that the content of the component model specification (REX) 
	 * with the given ID has changed.
	 * Further updates that are required are calculated and returned.
	 * 
	 * @param rexcmID ID of the component model specification
	 * @return required update operations
	 */
	public static DirtyReuseResourceIDCollection componentModelSpecChanged(
			List<String> rexcmID) {
		ReuseResources rr = ReuseResources.INSTANCE;
		DirtyReuseResourceIDCollection result = new DirtyReuseResourceIDCollection();
		
		result.getFragmentCompositionInterfaceIDs().addAll(
				rr.getInfluencedCompositionInterfaceIDsRexCM(rexcmID));
		result.getComposingCompositionProgramIDs().addAll(
				rr.getInfluencedComposingCompositionProgramIDsRexCM(rexcmID));

		return result;
	}
	
	/**
	 * Inform Reuseware that the content of the composition language specification (REX) 
	 * with the given ID has changed.
	 * Further updates that are required are calculated and returned.
	 * 
	 * @param rexclID ID of the composition language specification
	 * @return required update operations
	 */
	public static DirtyReuseResourceIDCollection compositionLanguageSpecChanged(
			List<String> rexclID) {
		ReuseResources rr = ReuseResources.INSTANCE;
		DirtyReuseResourceIDCollection result = new DirtyReuseResourceIDCollection();
		
		result.getDerivedCompositionProgramIDs().addAll(
				rr.getInfluencedDerivedCompositionProgramIDsRexCL(rexclID));

		return result;
	}
	
	/**
	 * Inform Reuseware that the content of the REX activator
	 * with the given ID has changed.
	 * Further updates that are required are calculated and returned.
	 * 
	 * @param rexActivatorID ID of the rex activator
	 * @return required update operations
	 */
	public static DirtyReuseResourceIDCollection reuseExtensionActivatorChanged(
			List<String> rexActivatorID) {
		ReuseResources rr = ReuseResources.INSTANCE;
		DirtyReuseResourceIDCollection result = new DirtyReuseResourceIDCollection();
		
		result.getFragmentCompositionInterfaceIDs().addAll(
				rr.getInfluencedCompositionInterfaceIDsRexActivator(rexActivatorID));
		result.getComposingCompositionProgramIDs().addAll(
				rr.getInfluencedComposingCompositionProgramIDsRexActivator(rexActivatorID));
		result.getCompositionProgramSourceIDs().addAll(
				rr.getInfluencedCompositionProgramSourceIDsRexActivator(rexActivatorID));

		return result;
	}
	
	/**
	 * Inform Reuseware that the content of the fragment
	 * with the given ID has changed.
	 * Further updates that are required are calculated and returned.
	 * 
	 * @param ufi ID of the fragment (UFI)
	 * @return required update operations
	 */
	public static DirtyReuseResourceIDCollection fragmentChanged(
			List<String> ufi) {
		ReuseResources rr = ReuseResources.INSTANCE;
		DirtyReuseResourceIDCollection result = new DirtyReuseResourceIDCollection();
		
		result.getFragmentCompositionInterfaceIDs().add(ufi);
		result.getComposingCompositionProgramIDs().addAll(
				rr.getInfluencedComposingCompositionProgramIDsFragment(ufi));

		return result;
	}

	/**
	 * Inform Reuseware that the content of the fragment with the given ID, 
	 * from which a composition program is derived, has changed.
	 * Further updates that are required are calculated and returned.
	 * 
	 * @param ufi ID of the fragment (UFI)
	 * @return required update operations
	 */
	public static DirtyReuseResourceIDCollection compositionProgramSourceChanged(
			List<String> ufi) {
		ReuseResources rr = ReuseResources.INSTANCE;
		DirtyReuseResourceIDCollection result = new DirtyReuseResourceIDCollection();

		result.getDerivedCompositionProgramIDs().addAll(
				rr.getInfluencedDerivedCompositionProgramIDsCompositionProgramSource(ufi));

		return result;
	}
	
	/**
	 * Inform Reuseware that the content of the composition program
	 * with the given ID has changed.
	 * Further updates that are required are calculated and returned.
	 * 
	 * @param ucpi ID of the composition program (UCPI)
	 * @return required update operations
	 */
	public static DirtyReuseResourceIDCollection compositionProgramChanged(
			List<String> ucpi) {
		DirtyReuseResourceIDCollection result = new DirtyReuseResourceIDCollection();
		
		result.getComposingCompositionProgramIDs().add(ucpi);

		return result;
	}

	/**
	 * Loads and returns the fragment collaboration (Fracol) with the given ID.
	 * 
	 * @param fracolID ID of the fragment collaboration
	 * @param resourceSet resource set for loading
	 * @return the loaded fragment collaboration
	 */
	public static FragmentCollaboration getFragmentCollaboration(
			List<String> fracolID, ResourceSet resourceSet) {
		ReuseResources rr = ReuseResources.INSTANCE;
		URI resourceURI = rr.getContentsURI(fracolID);
		if (resourceURI == null) {
			return null;
		}
		Resource resource = null;
		try {
			resource = resourceSet.getResource(resourceURI, true);
		} catch (Exception e) {
			//ok
		}
		if (resource == null || resource.getContents().isEmpty()) {
			return null;
		}
		if (!(resource.getContents().get(0) instanceof FragmentCollaboration)) {
			return null;
		}
		FragmentCollaboration fracol = (FragmentCollaboration) resource.getContents().get(0);
		return fracol;
	}
	
	/**
	 * Loads and returns the reuse extension (rex) with the given ID.
	 * 
	 * @param rexID ID of the reuse extension
	 * @param resourceSet resource set for loading
	 * @return the loaded reuse extension
	 */
	public static ReuseExtension getReuseExtension(
			List<String> rexID, ResourceSet resourceSet) {
		ReuseResources rr = ReuseResources.INSTANCE;
		URI resourceURI = rr.getContentsURI(rexID);
		if (resourceURI == null) {
			return null;
		}
		Resource resource = null;
		try {
			resource = resourceSet.getResource(resourceURI, true);
		} catch (Exception e) {
			//ok
		}
		if (resource == null || resource.getContents().isEmpty()) {
			return null;
		}
		if (!(resource.getContents().get(0) instanceof ReuseExtension)) {
			return null;
		}
		ReuseExtension rex = (ReuseExtension) resource.getContents().get(0);
		if (rex.getFracol() == null) {
			return null;
		}
		return rex;
	}

	/**
	 * Loads and returns the list of reuse extension activators with the given ID.
	 * 
	 * @param rexActivatorID ID of the reuse extension activator list
	 * @param resourceSet resource set for loading
	 * @return the loaded reuse extension activator list
	 */
	public static ReuseExtensionActivatorList getReuseExtensionActivatorList(
			List<String> rexActivatorID, ResourceSet resourceSet) {
		ReuseResources rr = ReuseResources.INSTANCE;
		URI resourceURI = rr.getContentsURI(rexActivatorID);
		if (resourceURI == null) {
			return null;
		}
		Resource resource = null;
		try {
			resource = resourceSet.getResource(resourceURI, true);
		} catch (Exception e) {
			//ok
		}
		if (resource == null || resource.getContents().isEmpty()) {
			return null;
		}
		if (!(resource.getContents().get(0) instanceof ReuseExtensionActivatorList)) {
			return null;
		}
		
		ReuseExtensionActivatorList reuseExtensionActivatorList = 
			(ReuseExtensionActivatorList) resource.getContents().get(0);
		return reuseExtensionActivatorList;
	}

	/**
	 * Loads and returns the composition program with the given ID.
	 * 
	 * @param ucpi ID of the composition program (UCPI)
	 * @param resourceSet resource set for loading
	 * @return the loaded composition program
	 */
	public static CompositionProgram getCompositionProgram(
			List<String> ucpi, ResourceSet resourceSet) {
		ReuseResources rr = ReuseResources.INSTANCE;
		URI resourceURI = rr.getContentsURI(ucpi);
		if (resourceURI == null) {
			return null;
		}
		Resource resource = null;
		try {
			resource = resourceSet.getResource(resourceURI, true);
		} catch (Exception e) {
			//ok
		}
		if (resource == null || resource.getContents().isEmpty()) {
			return null;
		}
		if (!(resource.getContents().get(0) instanceof CompositionProgram)) {
			return null;
		}
		
		CompositionProgram compositionProgram = 
			(CompositionProgram) resource.getContents().get(0);
		return compositionProgram;
	}
	
	/**
	 * Loads and returns the derived composition program with the given ID.
	 * 
	 * @param derivedUCPI ID of the derived composition program (UCPI)
	 * @param resourceSet resource set for loading
	 * @return the loaded derived composition program
	 */
	public static DerivedCompositionProgram getDerivedCompositionProgram(
			List<String> derivedUCPI, ResourceSet resourceSet) {
		ReuseResources rr = ReuseResources.INSTANCE;
		URI resourceURI = rr.getContentsURI(derivedUCPI);
		if (resourceURI == null) {
			return null;
		}
		Resource resource = null;
		try {
			resource = resourceSet.getResource(resourceURI, true);
		} catch (Exception e) {
			//ok
		}
		if (resource == null || resource.getContents().isEmpty()) {
			return null;
		}
		if (!(resource.getContents().get(0) instanceof DerivedCompositionProgram)) {
			return null;
		}
		
		DerivedCompositionProgram derivedCompositionProgram = 
			(DerivedCompositionProgram) resource.getContents().get(0);
		return derivedCompositionProgram;
	}

	/**
	 * Completes the loading of a composition program by linking fragment
	 * instances to the corresponding fragments and by updating the composition
	 * interfaces of fragment instances.
	 * 
	 * @param resource the resource containing the composition program
	 */
	public static void completeCompositionProgram(Resource resource) {
		if (resource == null || ReuseResources.INSTANCE.getID(resource.getURI()) == null) {
			return;
		}
		
		//set the fragment links
		for (TreeIterator<EObject> i = resource.getAllContents(); i.hasNext();) {
			EObject next = i.next();
			if (next instanceof CompositionProgram) {
				CompositionProgram compositionProgram = (CompositionProgram) next;
				compositionProgram.getUCPI().clear();
				compositionProgram.getUCPI().addAll(ReuseResources.INSTANCE.getID(resource.getURI()));
			}
			if (next instanceof FragmentInstance) {
				FragmentInstance fragmentInstance = (FragmentInstance) next;
				Fragment fragment = ReuseResources.INSTANCE.getFragment(
						fragmentInstance.getUFI(), resource.getResourceSet());
				if (fragment != null) {
					fragmentInstance.setFragment(fragment);
					if (fragmentInstance.getCompositionProgram() instanceof PhysicalCompositionProgram) {
						fragmentInstance.update();	
					}
				}
				i.prune();
			}
			if (next instanceof CompositionLink) {
				CompositionLink compositionLink = (CompositionLink) next;
				compositionLink.match();
				i.prune();
			}
		}		
	}
	
	/**
	 * Extension point ID:
	 * <i>org.reuseware.coconut.resource.diagramType</i>.
	 */
	public static final String DIAGRAM_TYPE_EP_ID = "org.reuseware.coconut.resource.diagramType";

	private static List<String> diagramTypes = null;
	
	/**
	 * Determines whether the given element is the root node of a diagram. For this
	 * it is checked if the EClass corresponds to a registered diagram type.
	 * 
	 * @param element the element to check
	 * @return true if element is the root node of a diagram
	 */
	public static boolean isDiagram(EObject element) {
		if (element == null) {
			return false;
		}
		EPackage ePackage = element.eClass().getEPackage();
		if (ePackage == null) {
			return false;
		}
		
		initDiagramTypes();
		String idString = ePackage.getNsURI() + "_" + element.eClass().getName();
		return diagramTypes.contains(idString);
	}
	
	/**
	 * Registers a new diagram type identified by the name of an EClass and the nsURI of
	 * an EPackage.
	 * 
	 * @param eClassName the EClass' name
	 * @param ePackageURI the Epackage's nsURI
	 */
	public static void addDiagram(String eClassName, String ePackageURI) {
		initDiagramTypes();
		String idString = ePackageURI + "_" + eClassName;
		diagramTypes.add(idString);
	}
	
	private static void initDiagramTypes() {
		if (diagramTypes == null) {
			diagramTypes = new ArrayList<String>();
			if (Platform.isRunning()) {
		        IExtensionPoint reporterEP = 
		        	Platform.getExtensionRegistry().getExtensionPoint(DIAGRAM_TYPE_EP_ID);
		        IConfigurationElement[] entries = reporterEP.getConfigurationElements();
		        
		        for (int i = 0; i < entries.length; i++) {
	        		String eClassName = entries[i].getAttribute("eClass");
	        		String ePackageURI = entries[i].getAttribute("ePackage");
	        		String idString = ePackageURI + "_" + eClassName;
	        		diagramTypes.add(idString);
		        }
			}
		}
	}

}
