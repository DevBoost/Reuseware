package org.reuseware.coconut.resource.resourceset;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.reuseware.coconut.compositionprogram.CompositionProgram;
import org.reuseware.coconut.compositionprogram.CompositionprogramFactory;
import org.reuseware.coconut.compositionprogram.DerivedCompositionProgram;
import org.reuseware.coconut.fragment.ComposedFragment;
import org.reuseware.coconut.resource.ReuseResources;
import org.reuseware.coconut.resource.util.DirtyReuseResourceIDCollection;
import org.reuseware.coconut.resource.util.ReuseResourcesUtil;

/**
 * A resource set that instantly updates resources 
 * that have 'reuse' relationships to a resource that change.
 */
public class ReuseResourceSet extends ResourceSetImpl {
	
	public void demandLoad(Resource resource) throws IOException {
		super.demandLoad(resource);
		URI uri = resource.getURI();
		List<String> ID = ReuseResources.INSTANCE.getID(uri);
		if (ID == null) {
			return;
		}
		
		if (uri.fileExtension().equals("fracol")) {
			clean(ReuseResourcesUtil.fragmentCollaborationChanged(ID));
		}
		else if (uri.fileExtension().equals("rex")) {
			clean(ReuseResourcesUtil.componentModelSpecChanged(ID));
			clean(ReuseResourcesUtil.compositionLanguageSpecChanged(ID));
		}		
		else if (uri.fileExtension().equals("rex_activator")) {
			clean(ReuseResourcesUtil.reuseExtensionActivatorChanged(ID));
		}
		else if (uri.fileExtension().equals("ucl")) {
			executeComposition(ID);
			clean(ReuseResourcesUtil.compositionProgramChanged(ID));
		}
		else {
			clean(ReuseResourcesUtil.fragmentChanged(ID));
		}
	}
	
	protected List<URI> composedFragmentURIs = new ArrayList<URI>();
	
	public List<URI> getComposedFragmentURIs() {
		//check if the composed fragments do all still exist
		for(Iterator<URI> i = composedFragmentURIs.iterator(); i.hasNext(); ) {
			URI next = i.next();
			if (getResource(next, false) == null) {
				i.remove();
			}
		}
		return Collections.unmodifiableList(composedFragmentURIs);
	}

	private void clean(DirtyReuseResourceIDCollection dirtyIDs) throws IOException {
		for(List<String> fragmentID : dirtyIDs.getFragmentCompositionInterfaceIDs()) {
			clean(ReuseResourcesUtil.fragmentChanged(fragmentID));
		}
		
		for(List<String> derivedUCPI : dirtyIDs.getDerivedCompositionProgramIDs()) {
			deriveCompositionProgram(derivedUCPI);
			executeComposition(derivedUCPI);
			clean(ReuseResourcesUtil.compositionProgramChanged(derivedUCPI));
		}
		
		for(List<String> composingUCPI : dirtyIDs.getComposingCompositionProgramIDs()) {
			executeComposition(composingUCPI);
			clean(ReuseResourcesUtil.compositionProgramChanged(composingUCPI));
		}
	}

	private void deriveCompositionProgram(List<String> derivedUCPI) throws IOException {
		URI uri = ReuseResources.INSTANCE.getContentsURI(derivedUCPI);
		ResourceSet resourceSetForDerivation = newResourceSet();
		Resource derivedCPResource = resourceSetForDerivation.createResource(uri);
		
		DerivedCompositionProgram derivedCP = CompositionprogramFactory.eINSTANCE.createDerivedCompositionProgram();
		derivedCP.getUCPI().addAll(derivedUCPI);
		
		for(Resource resource : new ArrayList<Resource>(getResources())) {
			List<String> UFI = ReuseResources.INSTANCE.getID(resource.getURI());
			if (UFI == null) {
				continue;
			}
		}
		
		// TODO #1558: Use composition program extractor registry
		derivedCP.extractCompositionProgram();
		derivedCPResource.getContents().add(derivedCP);

		ReuseResourcesUtil.completeCompositionProgram(derivedCPResource);	

		derivedCPResource.save(resourceSetForDerivation.getLoadOptions());
	}
	
	private void executeComposition(List<String> composingUCPI) throws IOException {
		ResourceSet resourceSetForComposition = newResourceSet();
		CompositionProgram compositionProgram = ReuseResourcesUtil.getCompositionProgram(
				composingUCPI, resourceSetForComposition);
		if (compositionProgram == null) {
			return;
		}
		compositionProgram.compose();
		
		List<Resource> composedResources = new ArrayList<Resource>();
		for(ComposedFragment composed : compositionProgram.getComposedFragments()) {
			URI uri = ReuseResources.INSTANCE.getContentsURI(composed.getUFI());
			Resource composedResource = resourceSetForComposition.createResource(uri);
			composedResource.getContents().clear();
			composedResource.getContents().addAll(composed.getContents());
			
			composedResources.add(composedResource);
			
			composedFragmentURIs.add(uri);
		}
		
		//save after all resources have been prepared to ensure correct cross-references
		for(Resource composedResource : composedResources) {
			composedResource.save(resourceSetForComposition.getLoadOptions());
		}
	}
	
	private ResourceSet newResourceSet() {
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getLoadOptions().putAll(getLoadOptions());
		return resourceSet;
	}
}
