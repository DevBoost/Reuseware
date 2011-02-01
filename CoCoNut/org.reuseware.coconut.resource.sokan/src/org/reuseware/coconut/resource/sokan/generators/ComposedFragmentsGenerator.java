package org.reuseware.coconut.resource.sokan.generators;

import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.reuseware.coconut.compositionprogram.CompositionProgram;
import org.reuseware.coconut.compositionprogram.FragmentInstance;
import org.reuseware.coconut.fragment.ComposedFragment;
import org.reuseware.coconut.resource.sokan.util.SokanReuseResourceUtil;
import org.reuseware.coconut.resource.util.ReuseResourcesUtil;
import org.reuseware.sokan.ID;
import org.reuseware.sokan.IndexMetaData;
import org.reuseware.sokan.index.DependencyMap;
import org.reuseware.sokan.index.indexer.CalledIndexer;
import org.reuseware.sokan.index.util.ResourceUtil;

/**
 * This called indexer (generator) executes a composition program 
 * and generates the composed fragments resulting from this execution.
 * <p>
 * This indexer does not modify the index. 
 */
public class ComposedFragmentsGenerator implements CalledIndexer {

	/**
	 * @param artifactURI the URI
	 * @param metaData the meta data to fill
	 * @param resourceSet the resource set to use
	 */
	public void createIndex(URI artifactURI, IndexMetaData metaData,
			ResourceSet resourceSet) {
		
		CompositionProgram compositionProgram = getCompositionProgram(
				ResourceUtil.idFrom(artifactURI), resourceSet);
		
		if (compositionProgram == null) {
			return;
		}
		
		executeComposition(compositionProgram, resourceSet);
	}
	
	private CompositionProgram getCompositionProgram(ID artifactID,	ResourceSet resourceSet) {
		return ReuseResourcesUtil.getCompositionProgram(
				artifactID.getSegments(), resourceSet);
	}

	private void executeComposition(CompositionProgram compositionProgram,
			ResourceSet resourceSet) {
		if (compositionProgram == null) {
			return;
		}
		
		//execute the composition
		compositionProgram.compose();
		
		for (ComposedFragment composedFragment : compositionProgram.getComposedFragments()) {
			URI composedFragmentURI = SokanReuseResourceUtil.getComposedFragmentURI(
					composedFragment.getUFI(), 
					compositionProgram);
			Resource composedFragmentResource = resetResource(composedFragmentURI, resourceSet);
			composedFragmentResource.getContents().addAll(composedFragment.getContents());
			Resource composedDiagramResource = createDiagramResource(compositionProgram, composedFragment.getUFI(), composedFragmentURI, resourceSet);
			if (composedDiagramResource != null) {
				composedDiagramResource.getContents().addAll(composedFragment.getDiagrams());
			}
			
		}
		
		compositionProgram.getComposedFragments().clear();
	}
	
	private Resource createDiagramResource(CompositionProgram compositionProgram, List<String> composedFragmentUFI, URI composedFragmentURI,
			ResourceSet resourceSet) {
		for (FragmentInstance fragmentInstance : compositionProgram.getFragmentInstances()) {
			if (fragmentInstance.isTarget() && composedFragmentUFI.equals(fragmentInstance.getTargetUFI())) {
				if (!fragmentInstance.getFragment().getDiagrams().isEmpty()) {
					Resource originalDiagramResource = fragmentInstance.getFragment().getDiagrams().get(0).eResource();
					if (originalDiagramResource != null) {
						URI composedDiagramURI = composedFragmentURI.trimFileExtension().appendFileExtension(
								originalDiagramResource.getURI().fileExtension());
						return resetResource(composedDiagramURI, resourceSet);
					}
				}
			}
		}
		return null;
	}
	
	private Resource resetResource(URI uri, ResourceSet resourceSet) {
		Resource resource = resourceSet.getResource(uri, false);
		if (resource == null) {
			resource = resourceSet.createResource(uri);
		} else {
			resource.getContents().clear();
		}
		resource.setModified(true);
		return resource;
	}

	/**
	 * This implementation does nothing.
	 * 
	 * @param artifactID the artifact's ID
	 * @param depMap the dependency map to fill
	 */
	public void getDependent(ID artifactID, DependencyMap depMap) { }

}
