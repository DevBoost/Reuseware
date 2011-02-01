package org.reuseware.coconut.resource.sokan.indexer;

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
import org.reuseware.coconut.resource.sokan.IndexConstants;
import org.reuseware.coconut.resource.sokan.util.SokanReuseResourceUtil;
import org.reuseware.coconut.resource.util.ReuseResourcesUtil;
import org.reuseware.coconut.reuseextension.CompositionLanguageSpecification;
import org.reuseware.coconut.reuseextension.ReuseExtension;
import org.reuseware.coconut.reuseextension.RootElementContext;
import org.reuseware.coconut.reuseextension.evaluator.EvaluatorUtil;
import org.reuseware.coconut.reuseextensionactivator.Argument;
import org.reuseware.coconut.reuseextensionactivator.ReuseExtensionActivator;
import org.reuseware.sokan.ID;
import org.reuseware.sokan.IndexMetaData;
import org.reuseware.sokan.index.DependencyMap;
import org.reuseware.sokan.index.indexer.Indexer;
import org.reuseware.sokan.index.util.IndexUtil;
import org.reuseware.sokan.index.util.ResourceUtil;

/**
 * This indexer is responsible for identifying if a certain 
 * artifact is source of one or more derived composition
 * programs. If yes, it also ensures that the derived
 * composition program is (initially empty) created in the
 * resource set of the indexing process.
 * <p>
 * Index field: <i>org.reuseware.coconut.resource.sokan.derivedCompositionProgram</i>.
 */
public class CompositionProgramSourceIndexer implements Indexer {

	/**
	 * @param artifactURI the URI
	 * @param metaData the meta data to fill
	 * @param resourceSet the resource set to use
	 */
	public void createIndex(URI artifactURI, IndexMetaData metaData,
			ResourceSet resourceSet) {
		metaData.getMulti(IndexConstants.COLUMN_DERIVED_COMPOSITION_PROGRAM).clear();
		Resource resource = null;
		try {
			resource = resourceSet.getResource(artifactURI, true);
		} catch (Exception e) {
			//ok
		}
		
		if (resource == null || resource.getContents().isEmpty()) {
			return;
		}
		indexDerivedCompositionProgramSource(resource, metaData, resourceSet);
	}
	
	private void indexDerivedCompositionProgramSource(Resource resource, IndexMetaData metaData,
			ResourceSet resourceSet) {

		ID iD = ResourceUtil.idFrom(resource.getURI());
		if (iD == null) {
			return;
		}
		
		EList<String> ufi = iD.getSegments();
		List<ReuseExtensionActivator> rexActivatorList = 
			SokanReuseResourceUtil.findReuseExtensionActivators(ufi, resourceSet);
		
		for (ReuseExtensionActivator rexActivator : rexActivatorList) {
			if (rexActivator.getReuseExtension() instanceof CompositionLanguageSpecification) {
				if (influencesFragment(rexActivator, resource, ufi)) {
					CompositionLanguageSpecification clSpec = 
						(CompositionLanguageSpecification) rexActivator.getReuseExtension();
				
					String idExp = clSpec.getUcpiExpression();
					String locationExp = clSpec.getCompositionProgramPhysicalLocationExpression();
					EObject context = resource.getContents().get(0);
					
					Map<String, String> args = new LinkedHashMap<String, String>();
					for (Argument arg : rexActivator.getArguments()) {
						args.put(arg.getParameter(), arg.getValue());
					}
					
					List<String> ucpi = EvaluatorUtil.deriveID(ufi, context, idExp, args);
					String locationHint = EvaluatorUtil.derive(ufi, context, locationExp, args);
					URI derivedCpURI = SokanReuseResourceUtil.getDerivedCompositionProgramURI(ucpi, ufi, locationHint);
					if (!IndexUtil.INSTANCE.isArtifact(ResourceUtil.idFrom(derivedCpURI))) {
						//derived cp has not been registered with sokan yet
						createResourceForDerivedCompositionProgram(
								CompositionprogramFactory.eINSTANCE.createDerivedCompositionProgram(),
								derivedCpURI, resourceSet);
					}
					
					metaData.putMultiple(
							IndexConstants.COLUMN_DERIVED_COMPOSITION_PROGRAM, 
							ResourceUtil.idString(ucpi));					
				}
			}
		}
	}

	private Resource createResourceForDerivedCompositionProgram(
			DerivedCompositionProgram derivedCompositionProgram,
			URI derivedCpURI, ResourceSet resourceSet) {
		Resource derivedCpResource = null;
		derivedCpResource = resourceSet.getResource(derivedCpURI, false); 
		if (derivedCpResource == null) {
			derivedCpResource = resourceSet.createResource(derivedCpURI);
		}
		DerivedCompositionProgram derivedCP = derivedCompositionProgram;
		derivedCpResource.getContents().clear();
		derivedCpResource.getContents().add(derivedCP);
		derivedCpResource.setModified(true);
		
		return derivedCpResource;
	}

	private boolean influencesFragment(ReuseExtensionActivator rexActivator,
			Resource resource, List<String> ufi) {
		ReuseExtension rex = rexActivator.getReuseExtension();
		for (EObject root : resource.getContents()) {
			for (RootElementContext rootElementContext : rex.getRootElementContexts()) {
				if (rootElementContext.getEBoundClass().isInstance(root)) {
					Map<String, String> args = new LinkedHashMap<String, String>();
					for (Argument arg : rexActivator.getArguments()) {
						args.put(arg.getParameter(), arg.getValue());
					}
					if (EvaluatorUtil.eval(
							ufi, 
							root, 
							rootElementContext.getIsExpression(),
							args)) {
						return true;
					}
				}
			}
		}
		return false;
	}

	/**
	 * This implementation makes sure that the DerivedCompositionProgramGenerator
	 * is called for all derived composition programs.
	 * 
	 * @param artifactID the artifact's ID
	 * @param depMap the dependency map to fill
	 */
	public void getDependent(ID artifactID, DependencyMap depMap) {
		SokanReuseResourceUtil.processDirtyIDs(ReuseResourcesUtil.compositionProgramSourceChanged(artifactID.getSegments()),
				depMap);
	}

}
