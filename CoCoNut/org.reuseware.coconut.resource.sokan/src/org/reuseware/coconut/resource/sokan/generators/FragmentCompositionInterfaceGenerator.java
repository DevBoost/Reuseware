package org.reuseware.coconut.resource.sokan.generators;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.reuseware.coconut.compositionprogram.DerivedCompositionProgram;
import org.reuseware.coconut.compositionprogram.util.CompositionInterfaceComputerUtil;
import org.reuseware.coconut.compositionprogram.util.CompositionProgramExtractorUtil;
import org.reuseware.coconut.fracol.FragmentCollaboration;
import org.reuseware.coconut.fragment.Fragment;
import org.reuseware.coconut.fragment.FragmentFactory;
import org.reuseware.coconut.resource.ReuseResources;
import org.reuseware.coconut.resource.sokan.IndexConstants;
import org.reuseware.coconut.resource.sokan.util.SokanReuseResourceUtil;
import org.reuseware.coconut.resource.util.ReuseResourcesUtil;
import org.reuseware.coconut.reuseextension.ComponentModelSpecification;
import org.reuseware.coconut.reuseextension.ReuseExtension;
import org.reuseware.coconut.reuseextension.RootElementContext;
import org.reuseware.coconut.reuseextension.evaluator.EvaluatorUtil;
import org.reuseware.coconut.reuseextensionactivator.Argument;
import org.reuseware.coconut.reuseextensionactivator.ReuseExtensionActivator;
import org.reuseware.sokan.Constraint;
import org.reuseware.sokan.FacetedRequest;
import org.reuseware.sokan.ID;
import org.reuseware.sokan.IndexMetaData;
import org.reuseware.sokan.IndexRow;
import org.reuseware.sokan.index.DependencyMap;
import org.reuseware.sokan.index.indexer.CalledIndexer;
import org.reuseware.sokan.index.util.FacetUtil;
import org.reuseware.sokan.index.util.IndexUtil;
import org.reuseware.sokan.index.util.ResourceUtil;

/**
 * This called indexer (generator) generates the composition
 * interface of the fragment it indexes. For this it prepares the
 * fragment with the reuse extension activators that are in
 * its scope. Then it calls CompositionInterfaceComputerUtil.compute().
 * <p>
 * This indexer caches the generated composition interface model in
 * the field: <i>org.reuseware.coconut.resource.sokan.fragment</i>.
 */
public class FragmentCompositionInterfaceGenerator implements CalledIndexer {

	/**
	 * @param artifactURI the URI
	 * @param metaData the meta data to fill
	 * @param resourceSet the resource set to use
	 */
	public void createIndex(URI artifactURI, IndexMetaData metaData,
			ResourceSet resourceSet) {

		Resource fragmentResource = null;
		
		try {
			fragmentResource = resourceSet.getResource(artifactURI, true);
		} catch (Exception e) {
			//ok
		}
		
		if (fragmentResource == null) {
			return;
		}
		
		EList<String> ufi = ResourceUtil.idFrom(artifactURI).getSegments();
		List<ReuseExtensionActivator> rexActivatorList = 
			SokanReuseResourceUtil.findReuseExtensionActivators(ufi, resourceSet);

		// == COMPOSITION INTERFACE
		computeAndCacheCompositionInterface(
				ufi, fragmentResource, rexActivatorList, resourceSet, metaData);
		
		// the composition programs need to be reloaded in the resource set to find the updated fragment models
		unloadCompositionPrograms(artifactURI, resourceSet);
		
		//reload for re-validation
		reloadReuseExtension(fragmentResource, resourceSet);
		reloadReuseExtensionActivator(fragmentResource, resourceSet);
	}
	
	private void computeAndCacheCompositionInterface(
			List<String> ufi,
			Resource fragmentResource,
			List<ReuseExtensionActivator> rexActivatorList, 
			ResourceSet resourceSet,
			IndexMetaData metaData) {
		Fragment fragment = null;
		
		//physical or composed?
		List<Constraint> constraints = FacetUtil.buildConstraints(
				IndexConstants.COLUMN_COMPOSED_FRAGMENT,
				ResourceUtil.idString(ufi));
		FacetedRequest request  = FacetUtil.buildFacetedRequest(constraints);
		List<IndexRow> response = IndexUtil.INSTANCE.getIndex(request);
		
		if (response.isEmpty()) {
			fragment = FragmentFactory.eINSTANCE.createPhysicalFragment();
		} else {
			fragment = FragmentFactory.eINSTANCE.createComposedFragment();
		}
		
		//load
		fragment.getUFI().addAll(ufi);
		fragment.getContents().addAll(fragmentResource.getContents());
		
		//find reuse extension activators
		for (ReuseExtensionActivator rexActivator : rexActivatorList) {
			if (rexActivator.getReuseExtension() instanceof ComponentModelSpecification) {
				if (influencesFragment(rexActivator, fragment)) {
					fragment.getComponentModelActivators().add(rexActivator);
				}
			}
		}

		//compute composition interface (post processors might need diagrams)
		if (!fragment.getContents().isEmpty()) {
			for (URI fragmentDiagramURI : ReuseResources.INSTANCE.getDiagramURIs(ufi)) {
				Resource fragmentDiagramResource = null;
				try {
					fragmentDiagramResource = resourceSet.getResource(fragmentDiagramURI, true);
				} catch (Exception e) { 
					//ok
				}
				if (fragmentDiagramResource != null) {
					fragment.getDiagrams().addAll(fragmentDiagramResource.getContents());
				}
			}
		}
		CompositionInterfaceComputerUtil.compute(fragment);
		
		//index (cache)
		Resource tempXMIResource = resourceSet.createResource(URI.createURI("temp:/temp.xmi"));
		tempXMIResource.getContents().add(fragment);
		ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
		try {
			tempXMIResource.save(outputStream, resourceSet.getLoadOptions());
			metaData.putSingle(IndexConstants.COLUMN_FRAGMENT, outputStream.toString("UTF-8"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		resourceSet.getResources().remove(tempXMIResource);
		
		// are there external computers registered?
		//TODO #1656: test this
		DerivedCompositionProgram derivedCp = CompositionProgramExtractorUtil.extract(fragment);
		if (derivedCp != null && derivedCp.getUCPI() != null && !derivedCp.getUCPI().isEmpty()) {
			URI derivedCpURI = SokanReuseResourceUtil.getDerivedCompositionProgramURI(
					derivedCp.getUCPI(), fragment.getUFI(), null);
			Resource resource = createResourceForDerivedCompositionProgram(
					derivedCp, derivedCpURI, resourceSet);
			ReuseResourcesUtil.completeCompositionProgram(resource);
		}
	}

	private boolean influencesFragment(ReuseExtensionActivator rexActivator,
			Fragment fragment) {
		ReuseExtension rex = rexActivator.getReuseExtension();
		if (rex instanceof ComponentModelSpecification) {
			for (EObject root : fragment.getContents()) {
				for (RootElementContext rootElementContext : rex.getRootElementContexts()) {
					if (rootElementContext.getEBoundClass().isInstance(root)) {
						Map<String, String> args = new LinkedHashMap<String, String>();
						for (Argument arg : rexActivator.getArguments()) {
							args.put(arg.getParameter(), arg.getValue());
						}
						if (EvaluatorUtil.eval(
								fragment.getUFI(), 
								root, 
								rootElementContext.getIsExpression(),
								args)) {
							return true;
						}
					}
				}
			}
		}
		return false;
	}
	
	private Resource createResourceForDerivedCompositionProgram(
			DerivedCompositionProgram derivedCompositionProgram,
			URI derivedCpURI, ResourceSet resourceSet) {
		Resource derivedCpResource = null;
		try { 
			derivedCpResource = resourceSet.getResource(derivedCpURI, true); 						
		} catch (Exception e) {	
			//ok
		}
		if (derivedCpResource == null) {
			derivedCpResource = resourceSet.createResource(derivedCpURI);
		}
		DerivedCompositionProgram derivedCP = derivedCompositionProgram;
		derivedCpResource.getContents().clear();
		derivedCpResource.getContents().add(derivedCP);
		derivedCpResource.setModified(true);
		
		return derivedCpResource;
	}

	private void unloadCompositionPrograms(URI artifactURI, ResourceSet resourceSet) {
		for (List<String> ucpi : ReuseResources.INSTANCE.getInfluencedComposingCompositionProgramIDsFragment(
				ResourceUtil.idFrom(artifactURI).getSegments())) {
			URI cpURI = ResourceUtil.uriFrom(ResourceUtil.idFrom(ucpi));
			if (cpURI != null) {
				unload(cpURI, resourceSet);
			}
		}
		
	}
	
	private void reloadReuseExtension(Resource resource, ResourceSet resourceSet) {
		if (resource.getContents().isEmpty()) {
			return;
		}
		if (!(resource.getContents().get(0) instanceof FragmentCollaboration)) {
			return;
		}
		URI fracolURI = resource.getURI();
		List<Constraint> constraints = FacetUtil.buildConstraints(
				IndexConstants.COLUMN_CM_IMPLEMENTED_FRAGMENT_COLLABORATION,
				ResourceUtil.idString(ResourceUtil.idFrom(fracolURI)));
		FacetedRequest request  = FacetUtil.buildFacetedRequest(constraints);
		List<IndexRow> response = IndexUtil.INSTANCE.getIndex(request);
		for (IndexRow row : response) {
			URI rexURI = ResourceUtil.uriFrom(row.getPhyURI());
			if (rexURI != null) {
				reload(rexURI, resourceSet);
			}
		}

		constraints = FacetUtil.buildConstraints(
				IndexConstants.COLUMN_CL_IMPLEMENTED_FRAGMENT_COLLABORATION,
				ResourceUtil.idString(ResourceUtil.idFrom(fracolURI)));
		request  = FacetUtil.buildFacetedRequest(constraints);
		response = IndexUtil.INSTANCE.getIndex(request);
		for (IndexRow row : response) {
			URI rexURI = ResourceUtil.uriFrom(row.getPhyURI());
			if (rexURI != null) {
				reload(rexURI, resourceSet);
			}
		}
	}
	
	private void reloadReuseExtensionActivator(Resource resource, ResourceSet resourceSet) {
		if (resource.getContents().isEmpty()) {
			return;
		}
		if (!(resource.getContents().get(0) instanceof ReuseExtension)) {
			return;
		}
		URI rexURI = resource.getURI();
		List<Constraint> constraints = FacetUtil.buildConstraints(
				IndexConstants.COLUMN_CM_ACTIVATED_REUSE_EXTENSION,
				ResourceUtil.idString(ResourceUtil.idFrom(rexURI)));
		FacetedRequest request  = FacetUtil.buildFacetedRequest(constraints);
		List<IndexRow> response = IndexUtil.INSTANCE.getIndex(request);
		for (IndexRow row : response) {
			URI rexActivatorURI = ResourceUtil.uriFrom(row.getPhyURI());
			if (rexActivatorURI != null) {
				reload(rexActivatorURI, resourceSet);
			}
		}
		
		constraints = FacetUtil.buildConstraints(
				IndexConstants.COLUMN_CL_ACTIVATED_REUSE_EXTENSION,
				ResourceUtil.idString(ResourceUtil.idFrom(rexURI)));
		request  = FacetUtil.buildFacetedRequest(constraints);
		response = IndexUtil.INSTANCE.getIndex(request);
		for (IndexRow row : response) {
			URI rexActivatorURI = ResourceUtil.uriFrom(row.getPhyURI());
			if (rexActivatorURI != null) {
				reload(rexActivatorURI, resourceSet);
			}
		}
	}
	
	private void unload(URI cpURI, ResourceSet resourceSet) {
		Resource cpResource = resourceSet.getResource(cpURI, false);
		if (cpResource != null) {
			cpResource.unload();
		}
	}

	private void reload(URI resourceURI, ResourceSet resourceSet) {
		Resource cpResource = resourceSet.getResource(resourceURI, false);
		if (cpResource != null) {
			cpResource.unload();
		}
		try {
			resourceSet.getResource(resourceURI, true);
		} catch (Exception e) {
			//ok
		}
	}
	
	/**
	 * This implementation does nothing.
	 * 
	 * @param artifactID the artifact's ID
	 * @param depMap the dependency map to fill
	 */
	public void getDependent(ID artifactID, DependencyMap depMap) { }

}
