package org.reuseware.coconut.resource.sokan.generators;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.reuseware.coconut.compositionprogram.CompositionprogramFactory;
import org.reuseware.coconut.compositionprogram.DerivedCompositionProgram;
import org.reuseware.coconut.fragment.Fragment;
import org.reuseware.coconut.resource.ReuseResources;
import org.reuseware.coconut.resource.sokan.IndexConstants;
import org.reuseware.coconut.resource.sokan.util.SokanReuseResourceUtil;
import org.reuseware.coconut.resource.util.ReuseResourcesUtil;
import org.reuseware.coconut.reuseextension.CompositionLanguageSpecification;
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
 * This indexer derives a derived composition programs from
 * its sources. It is called through the dependencies from
 * one or more CompositionProgramSourceIndexer executions.
 * <p>
 * This indexer does not modify the index.
 */
public class DerivedCompositionProgramGenerator implements CalledIndexer {

	/**
	 * @param artifactURI the URI
	 * @param metaData the meta data to fill
	 * @param resourceSet the resource set to use
	 */
	public void createIndex(URI artifactURI, IndexMetaData metaData,
			ResourceSet resourceSet) {
		
		deriveCompositionProgram(artifactURI, resourceSet);
	}
	
	private void deriveCompositionProgram(URI artifactURI,
			ResourceSet resourceSet) {
		
		Resource resource = null;
		resource = resourceSet.getResource(artifactURI, false); 						
		if (resource == null) {
			resource = resourceSet.createResource(artifactURI);
		}
		resource.getContents().clear();
		
		DerivedCompositionProgram derivedCP = 
			CompositionprogramFactory.eINSTANCE.createDerivedCompositionProgram();
		ID id = ResourceUtil.idFrom(artifactURI);
			
		//find fragments with composition language specifications to derive from
		List<Constraint> constraints = FacetUtil.buildConstraints(
				IndexConstants.COLUMN_DERIVED_COMPOSITION_PROGRAM,
				ResourceUtil.idString(id));
		FacetedRequest request  = FacetUtil.buildFacetedRequest(constraints);
		List<IndexRow> response = IndexUtil.INSTANCE.getIndex(request);
		for (IndexRow row : response) {
			EList<String> ufi = row.getArtifactID().getSegments();
			Fragment fragment = ReuseResources.INSTANCE.getFragment(
					ufi, resourceSet);
			fragment.getCompositionLanguageActivators().clear();
			for (ReuseExtensionActivator rexActivator : SokanReuseResourceUtil.findReuseExtensionActivators(
					ufi, resourceSet)) {
				if (rexActivator.getReuseExtension() instanceof CompositionLanguageSpecification) {
					CompositionLanguageSpecification clSpec = 
						(CompositionLanguageSpecification) rexActivator.getReuseExtension();
					String idExp = clSpec.getUcpiExpression();
					if (!fragment.getContents().isEmpty()) {
						EObject context = fragment.getContents().get(0);
						for (RootElementContext rootElementContext : clSpec.getRootElementContexts()) {
							if (rootElementContext.getEBoundClass().isInstance(context)) {
								Map<String, String> args = new LinkedHashMap<String, String>();
								for (Argument arg : rexActivator.getArguments()) {
									args.put(arg.getParameter(), arg.getValue());
								}
								List<String> variantUCPI = EvaluatorUtil.deriveID(
										fragment.getUFI(), context, idExp, args);
								
								if (id.getSegments().equals(variantUCPI)) {
									if (!fragment.getCompositionLanguageActivators().contains(rexActivator)) {
										fragment.getCompositionLanguageActivators().add(rexActivator);	
									}
								}
								break;
							}
						}
					}
				}
			}
			derivedCP.getDeriveFrom().add(fragment);
		}
		
		//perform update
		derivedCP.extractCompositionProgram();
		
		if (!derivedCP.getFragmentInstances().isEmpty()) {
			resource.getContents().add(derivedCP);
			ReuseResourcesUtil.completeCompositionProgram(resource);
		}
		
		resource.setModified(true);
	}
	
	/**
	 * This implementation does nothing.
	 * 
	 * @param artifactID the artifact's ID
	 * @param depMap the dependency map to fill
	 */
	public void getDependent(ID artifactID, DependencyMap depMap) { }

}
