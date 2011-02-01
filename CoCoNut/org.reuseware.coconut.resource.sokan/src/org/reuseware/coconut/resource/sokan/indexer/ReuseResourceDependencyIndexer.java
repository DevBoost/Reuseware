package org.reuseware.coconut.resource.sokan.indexer;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.reuseware.coconut.compositionprogram.CompositionProgram;
import org.reuseware.coconut.compositionprogram.CompositionprogramPackage;
import org.reuseware.coconut.compositionprogram.FragmentInstance;
import org.reuseware.coconut.fracol.FracolPackage;
import org.reuseware.coconut.resource.ReuseResources;
import org.reuseware.coconut.resource.sokan.IndexConstants;
import org.reuseware.coconut.resource.sokan.util.SokanReuseResourceUtil;
import org.reuseware.coconut.resource.util.ReuseResourcesUtil;
import org.reuseware.coconut.reuseextension.ComponentModelSpecification;
import org.reuseware.coconut.reuseextension.CompositionLanguageSpecification;
import org.reuseware.coconut.reuseextension.ReuseExtension;
import org.reuseware.coconut.reuseextension.ReuseextensionPackage;
import org.reuseware.coconut.reuseextension.RootElementContext;
import org.reuseware.coconut.reuseextensionactivator.ComponentModelSpecificationActivator;
import org.reuseware.coconut.reuseextensionactivator.CompositionLanguageSpecificationActivator;
import org.reuseware.coconut.reuseextensionactivator.ReuseExtensionActivator;
import org.reuseware.coconut.reuseextensionactivator.ReuseExtensionActivatorList;
import org.reuseware.coconut.reuseextensionactivator.ReuseextensionactivatorPackage;
import org.reuseware.sokan.ID;
import org.reuseware.sokan.IndexMetaData;
import org.reuseware.sokan.IndexRow;
import org.reuseware.sokan.index.DependencyMap;
import org.reuseware.sokan.index.indexer.DependencyIndexer;
import org.reuseware.sokan.index.util.IndexUtil;
import org.reuseware.sokan.index.util.ResourceUtil;

/**
 * This indexer is responsible for calculating and persisting all dependencies
 * between reuse resources. The information indexed by this indexer is used
 * to calculate the updates required a reuse resource changes.
 * <p>
 * Index fields: <i>multiple</i>.
 */
public class ReuseResourceDependencyIndexer implements DependencyIndexer {

	/**
	 * @param artifactURI the URI
	 * @param metaData the meta data to fill
	 * @param resourceSet the resource set to use
	 */
	public void createIndex(URI artifactURI, IndexMetaData metaData, ResourceSet resourceSet) {
		clearOldInfo(metaData, resourceSet);
		
		Resource resource = null;
		try {
			resource = resourceSet.getResource(artifactURI, true);
		} catch (Exception e) { 
			//ok
		}
		
		if (resource == null || resource.getContents().isEmpty()) {
			return;
		}
		
		indexReuseExtension(resource, metaData, resourceSet);
		indexReuseExtensionActivator(resource, metaData, resourceSet);
		indexCompositionProgram(resource, metaData, resourceSet);
	}
	
	private void clearOldInfo(IndexMetaData metaData, ResourceSet resourceSet) {
		metaData.putSingle(IndexConstants.COLUMN_CM_IMPLEMENTED_FRAGMENT_COLLABORATION, null);
		metaData.getMulti(IndexConstants.COLUMN_CM_EXTENDED_ROOT_ECLASS).clear();
		metaData.putSingle(IndexConstants.COLUMN_CL_IMPLEMENTED_FRAGMENT_COLLABORATION, null);
		metaData.getMulti(IndexConstants.COLUMN_CL_EXTENDED_ROOT_ECLASS).clear();
		metaData.getMulti(IndexConstants.COLUMN_CM_ACTIVATED_REUSE_EXTENSION).clear();
		metaData.getMulti(IndexConstants.COLUMN_CL_ACTIVATED_REUSE_EXTENSION).clear();
		metaData.getMulti(IndexConstants.COLUMN_INSTANTIATED_FRAGMENT).clear();
		
		emptyOldCompositionProgramTargetsOfDerivedCPs(metaData, resourceSet);
		emptyOldCompositionProgramTargets(metaData, resourceSet);
		emptyOldDerivedCompositionPrograms(metaData, resourceSet);
		metaData.getMulti(IndexConstants.COLUMN_COMPOSED_FRAGMENT).clear();
		metaData.getMulti(IndexConstants.COLUMN_DERIVED_COMPOSITION_PROGRAM).clear();
	}	
	
	private void emptyOldDerivedCompositionPrograms(IndexMetaData metaData, ResourceSet resourceSet) {
		for (String oldDerivedUCPI : metaData.getMulti(IndexConstants.COLUMN_DERIVED_COMPOSITION_PROGRAM)) {
			URI uri = ResourceUtil.uriFrom(ResourceUtil.idFrom(oldDerivedUCPI));
			if (uri != null) {
				Resource oldDerivedCPResource = null;
				try {
					oldDerivedCPResource = resourceSet.getResource(uri, true);
				} catch (Exception e) {
					//ok
				}
				if (oldDerivedCPResource == null) {
					continue;
				}
				oldDerivedCPResource.getContents().clear();
				oldDerivedCPResource.setModified(true);
			}
		}
	}
	
	private void emptyOldCompositionProgramTargetsOfDerivedCPs(IndexMetaData metaData, ResourceSet resourceSet) {
		for (String oldUCPI : metaData.getMulti(IndexConstants.COLUMN_DERIVED_COMPOSITION_PROGRAM)) {
			IndexRow row = IndexUtil.INSTANCE.getIndex(ResourceUtil.idFrom(oldUCPI));
			if (row != null) {
				IndexMetaData cpMetaData = row.getMetaData();
				emptyOldCompositionProgramTargets(cpMetaData, resourceSet);
			}
		}
	}
	
	private void emptyOldCompositionProgramTargets(IndexMetaData metaData, ResourceSet resourceSet) {
		for (String oldTargetUFI : metaData.getMulti(IndexConstants.COLUMN_COMPOSED_FRAGMENT)) {
			URI uri = ResourceUtil.uriFrom(ResourceUtil.idFrom(oldTargetUFI));
			if (uri != null) {
				Resource oldTargetResource = null;
				try {
					oldTargetResource = resourceSet.getResource(uri, true);
				} catch (Exception e) {
					//ok
				}
				if (oldTargetResource == null) {
					continue;
				}
				oldTargetResource.getContents().clear();
				oldTargetResource.setModified(true);
				
				for (URI oldDiagramURI : ReuseResources.INSTANCE.getDiagramURIs(
						ResourceUtil.idFrom(oldTargetUFI).getSegments())) {
					Resource oldDiagramResource = null;
					try {
						oldDiagramResource = resourceSet.getResource(oldDiagramURI, true);
					} catch (Exception e) { 
						//ok
					}
					if (oldDiagramResource != null) {
						oldDiagramResource.getContents().clear();
						oldDiagramResource.setModified(true);
					}
				}
			}
		}
	}

	private void indexReuseExtension(Resource resource, IndexMetaData metaData, ResourceSet resourceSet) {
		if (!(resource.getContents().get(0) instanceof ReuseExtension)) {
			return;
		}
		
		ReuseExtension rex = (ReuseExtension) resource.getContents().get(0);
		if (rex == null) {
			return;
		}
		if (rex.getFracol() == null) {
			return;
		}
		
		String fracolIDString = null;
		if (rex.getFracol().eIsProxy()) {
			String fracolName = getNameFromProxy(rex.getFracol());
			List<String> id = new ArrayList<String>();
			id.addAll(rex.getFracolNamespace());
			id.add(fracolName + ".fracol");
			fracolIDString = ResourceUtil.idString(id);
		} else {
			fracolIDString = ResourceUtil.idString(
					ResourceUtil.idFrom(rex.getFracol().eResource().getURI()));
		}
		
		Set<String> eClassIDs = new TreeSet<String>();
		createEClassIDs(rex, eClassIDs);
		
		if (rex instanceof ComponentModelSpecification) {
			metaData.putSingle(
					IndexConstants.COLUMN_CM_IMPLEMENTED_FRAGMENT_COLLABORATION, 
					fracolIDString);
			metaData.putMultiple(
					IndexConstants.COLUMN_CM_EXTENDED_ROOT_ECLASS, 
					new ArrayList<String>(eClassIDs));
		} else if (rex instanceof CompositionLanguageSpecification) {
			metaData.putSingle(
					IndexConstants.COLUMN_CL_IMPLEMENTED_FRAGMENT_COLLABORATION, 
					fracolIDString);
			metaData.putMultiple(
					IndexConstants.COLUMN_CL_EXTENDED_ROOT_ECLASS, 
					new ArrayList<String>(eClassIDs));
		}
	}
	
	private void indexReuseExtensionActivator(Resource resource, IndexMetaData metaData,
			ResourceSet resourceSet) {
		
		if (!(resource.getContents().get(0) instanceof ReuseExtensionActivatorList)) {
			return;
		}
		
		ReuseExtensionActivatorList reuseExtensionActivatorList = 
			(ReuseExtensionActivatorList) resource.getContents().get(0);
		
		List<String> cmRexIDs = new ArrayList<String>();
		List<String> clRexIDs = new ArrayList<String>();
		
		for (ReuseExtensionActivator activator : reuseExtensionActivatorList.getActivators()) {
			ReuseExtension rex = activator.getReuseExtension();
			if (rex == null) {
				continue;
			}
			
			if (rex.eIsProxy()) {
				String rexName = getNameFromProxy(rex);
				List<String> id = new ArrayList<String>();
				id.addAll(rex.getRexNamespace());
				id.add(rexName + ".rex");
				if (activator instanceof ComponentModelSpecificationActivator) {
					cmRexIDs.add(ResourceUtil.idString(id));
				} else if (activator instanceof CompositionLanguageSpecificationActivator) {
					clRexIDs.add(ResourceUtil.idString(id));
				}
			} else {
				if (rex instanceof ComponentModelSpecification) {
					cmRexIDs.add(
							ResourceUtil.idString(ResourceUtil.idFrom(rex.eResource().getURI())));
				}
				if (rex instanceof CompositionLanguageSpecification) {
					clRexIDs.add(
							ResourceUtil.idString(ResourceUtil.idFrom(rex.eResource().getURI())));
				}
			}
		}

		metaData.putMultiple(
				IndexConstants.COLUMN_CM_ACTIVATED_REUSE_EXTENSION, 
				cmRexIDs);
		metaData.putMultiple(
				IndexConstants.COLUMN_CL_ACTIVATED_REUSE_EXTENSION, 
				clRexIDs);
	}
	
	private void indexCompositionProgram(Resource resource, IndexMetaData metaData, ResourceSet resourceSet) {
		if (!(resource.getContents().get(0) instanceof CompositionProgram)) {
			return;
		}
		CompositionProgram compositionProgram = 
			(CompositionProgram) resource.getContents().get(0);
		
		for (FragmentInstance fi : compositionProgram.getFragmentInstances()) {
			metaData.putMultiple(
					IndexConstants.COLUMN_INSTANTIATED_FRAGMENT, 
					ResourceUtil.idString(fi.getUFI()));
			if (fi.isTarget()) {
				metaData.putMultiple(
						IndexConstants.COLUMN_COMPOSED_FRAGMENT, 
						ResourceUtil.idString(fi.getTargetUFI()));
			}
		}
	}

	private void createEClassIDs(ReuseExtension rex, Set<String> eClassIDs) {
		for (RootElementContext rootContext : rex.getRootElementContexts()) {
			if (rootContext.getEBoundClass() == null) {
				continue;
			}
			
			eClassIDs.add(SokanReuseResourceUtil.eClassToString(rootContext.getEBoundClass()));
		}
	}
	
	/**
	 * Dependent of the type of artifact this method calls one of 
	 * the ReuseResourcesUtil.*Changed() methods to calculate
	 * the impact of the change on other artifacts. 
	 * 
	 * @param artifactID the artifact's ID
	 * @param depMap the dependency map to fill
	 */
	public void getDependent(ID artifactID, DependencyMap depMap) {
		IndexRow row = IndexUtil.INSTANCE.getIndex(artifactID);
		
		if (isOfType(row, CompositionprogramPackage.Literals.COMPOSITION_PROGRAM)) {
			SokanReuseResourceUtil.processDirtyIDs(ReuseResourcesUtil.compositionProgramChanged(artifactID.getSegments()),
					depMap);
		} else if (isOfType(row, FracolPackage.Literals.FRAGMENT_COLLABORATION)) {
			SokanReuseResourceUtil.processDirtyIDs(ReuseResourcesUtil.fragmentCollaborationChanged(artifactID.getSegments()),
					depMap);
		} else if (isOfType(row, ReuseextensionPackage.Literals.COMPONENT_MODEL_SPECIFICATION)) {
			SokanReuseResourceUtil.processDirtyIDs(ReuseResourcesUtil.componentModelSpecChanged(artifactID.getSegments()),
					depMap);
		} else if (isOfType(row, ReuseextensionPackage.Literals.COMPOSITION_LANGUAGE_SPECIFICATION)) {
			SokanReuseResourceUtil.processDirtyIDs(ReuseResourcesUtil.compositionLanguageSpecChanged(artifactID.getSegments()),
					depMap);
		} else if (isOfType(row, ReuseextensionactivatorPackage.Literals.REUSE_EXTENSION_ACTIVATOR_LIST)) {
			SokanReuseResourceUtil.processDirtyIDs(ReuseResourcesUtil.reuseExtensionActivatorChanged(artifactID.getSegments()),
					depMap);
		}
		
		SokanReuseResourceUtil.processDirtyIDs(ReuseResourcesUtil.fragmentChanged(artifactID.getSegments()),
				depMap);
	}
	
	private boolean isOfType(IndexRow row, EClass eClass) {
		return row.getMetaData().getMulti(IndexConstants.COLUMN_ROOT_ECLASS).contains(
				SokanReuseResourceUtil.eClassToString(eClass));
	}
	
	private static final String EMFTEXT_PROXY_FRAGMENT = "EMFTEXT_INTERNAL_URI_FRAGMENT_";
	
	private String getNameFromProxy(EObject proxy) {
		String fragment = ((InternalEObject) proxy).eProxyURI().fragment();
		String name = null;
		if (fragment.startsWith(EMFTEXT_PROXY_FRAGMENT)) {
			name = fragment.substring(EMFTEXT_PROXY_FRAGMENT.length());
			name = name.substring(name.indexOf("_") + 1);	
		}
		return name;
	}

}
