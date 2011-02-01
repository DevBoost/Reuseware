package org.reuseware.coconut.resource.resourceset;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.reuseware.coconut.fragment.Fragment;
import org.reuseware.coconut.fragment.FragmentFactory;
import org.reuseware.coconut.resource.FragmentCompositionInterfaceCreator;
import org.reuseware.coconut.resource.ReuseResources;
import org.reuseware.coconut.resource.util.ReuseResourcesUtil;
import org.reuseware.coconut.reuseextension.ComponentModelSpecification;
import org.reuseware.coconut.reuseextension.CompositionLanguageSpecification;
import org.reuseware.coconut.reuseextensionactivator.ReuseExtensionActivator;
import org.reuseware.coconut.reuseextensionactivator.ReuseExtensionActivatorList;

public class ResourceSetFragmentCompositionInterfaceCreator implements
		FragmentCompositionInterfaceCreator {

	ReuseResourceSet reuseResourceSet = null;
	
	public ResourceSetFragmentCompositionInterfaceCreator(ReuseResourceSet reuseResourceSet) {
		this.reuseResourceSet = reuseResourceSet;
	}
	
	
	public Fragment getFragment(List<String> UFI, ResourceSet resourceSet) {	
		//load
		URI fragmentContentsURI = ReuseResources.INSTANCE.getContentsURI(UFI);
		if (fragmentContentsURI == null) {
			return null;
		}
		Resource fragmentResource = null;
		try {
			fragmentResource = resourceSet.getResource(fragmentContentsURI, true);
		} catch (Exception e) {
		}
		if (fragmentResource == null) {
			return null;
		}
		Fragment fragment = FragmentFactory.eINSTANCE.createPhysicalFragment();
		fragment.getUFI().addAll(UFI);
		fragment.getContents().addAll(fragmentResource.getContents());
		
		for(URI fragmentDiagramURI : ReuseResources.INSTANCE.getDiagramURIs(UFI)) {
			Resource fragmentDiagramResource = resourceSet.getResource(fragmentDiagramURI, true);
			if (fragmentDiagramResource != null) {
				fragment.getDiagrams().addAll(fragmentDiagramResource.getContents());
			}
		}
		
		//find reuse extension activators
		for(Resource resource : new ArrayList<Resource>(reuseResourceSet.getResources())) {
			List<String> rexActivatorID = ReuseResources.INSTANCE.getID(resource.getURI());
			ReuseExtensionActivatorList rexActivatorList = 
				ReuseResourcesUtil.getReuseExtensionActivatorList(rexActivatorID, resourceSet);
			
			if (rexActivatorList != null) {

				if (ResourceSetReuseResourceUtil.isInScopeOf(UFI, rexActivatorID)) {
					for(ReuseExtensionActivator rexActivator : rexActivatorList.getActivators()) {
						if (ResourceSetReuseResourceUtil.extendsTypeOf(rexActivator, fragmentResource, UFI)) {
							if (rexActivator.getReuseExtension() instanceof ComponentModelSpecification) {
								fragment.getComponentModelActivators().add(rexActivator);
							}
							if (rexActivator.getReuseExtension() instanceof CompositionLanguageSpecification) {
								fragment.getCompositionLanguageActivators().add(rexActivator);
							}
						}
					}
				}
			}
		}
		
		// TODO #1558: Use composition interface calculator registry
		fragment.computeCompositionInterface();
		
		return fragment;
	}
}
