package org.reuseware.coconut.resource.sokan.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.reuseware.coconut.compositionprogram.CompositionProgram;
import org.reuseware.coconut.compositionprogram.CompositionprogramPackage;
import org.reuseware.coconut.compositionprogram.FragmentInstance;
import org.reuseware.coconut.fracol.FracolPackage;
import org.reuseware.coconut.resource.sokan.IndexConstants;
import org.reuseware.coconut.resource.util.DirtyReuseResourceIDCollection;
import org.reuseware.coconut.resource.util.ReuseResourcesUtil;
import org.reuseware.coconut.reuseextension.ReuseextensionPackage;
import org.reuseware.coconut.reuseextensionactivator.ReuseExtensionActivator;
import org.reuseware.coconut.reuseextensionactivator.ReuseExtensionActivatorList;
import org.reuseware.coconut.reuseextensionactivator.ReuseextensionactivatorPackage;
import org.reuseware.sokan.Constraint;
import org.reuseware.sokan.FacetedRequest;
import org.reuseware.sokan.ID;
import org.reuseware.sokan.IndexRow;
import org.reuseware.sokan.index.DependencyMap;
import org.reuseware.sokan.index.solr.SolrConst;
import org.reuseware.sokan.index.util.FacetUtil;
import org.reuseware.sokan.index.util.IndexUtil;
import org.reuseware.sokan.index.util.ResourceUtil;
import org.reuseware.sokan.index.util.SokanConst;
import org.reuseware.sokan.index.util.StoreUtil;

/**
 * Utility methods specific to handling reuse resources with Sokan.
 */
public final class SokanReuseResourceUtil {
	
	private SokanReuseResourceUtil() { }
	
	/**
	 * Translates a dirty ID collection of reuse resources into a 
	 * Sokan dependency map.
	 * 
	 * @param dirtyIDs the dirty ID collection
	 * @param dependencyMap the dependency map to fill
	 */
	public static void processDirtyIDs(
			DirtyReuseResourceIDCollection dirtyIDs,
			DependencyMap dependencyMap) {
		
		for (List<String> ufi : dirtyIDs.getFragmentCompositionInterfaceIDs()) {
			dependencyMap.put(
					ResourceUtil.idFrom(ufi), 
					IndexConstants.GENERATOR_FRAGMENT_COMPOSITION_INTERFACE);
		}
		for (List<String> ucpi : dirtyIDs.getDerivedCompositionProgramIDs()) {
			dependencyMap.put(
					ResourceUtil.idFrom(ucpi), 
					IndexConstants.GENERATOR_DERIVED_COMPOSITION_PROGRAM);
		}
		for (List<String> ucpi : dirtyIDs.getComposingCompositionProgramIDs()) {
			dependencyMap.put(
					ResourceUtil.idFrom(ucpi), 
					IndexConstants.GENERATOR_COMPOSED_FRAGMENTS);
		}
		for (List<String> ufi : dirtyIDs.getCompositionProgramSourceIDs()) {
			dependencyMap.put(
					ResourceUtil.idFrom(ufi), 
					IndexConstants.INDEXER_COMPOSITION_PROGRAM_SOURCE);
		}
	}
	
	/**
	 * Finds all reuse extension activators that influence the fragment
	 * with the given UFI.
	 * 
	 * @param ufi the UFI
	 * @param resourceSet the resource set to use
	 * @return the found reuse extension activators
	 */
	public static List<ReuseExtensionActivator> findReuseExtensionActivators(
			List<String> ufi, 
			ResourceSet resourceSet) {
		
		List<ReuseExtensionActivator> result = new ArrayList<ReuseExtensionActivator>();
		
		//TODO #1261: complex query used here
		//find reuse extension activators
		List<String> queries = new ArrayList<String>();
		for (int i = ufi.size() - 1; i >= 0; i--) {
			String packageName = ResourceUtil.idString(ufi.subList(0, i));
			String rexActivatorQuery = packageName + SokanConst.SEPERATOR + "*" + ".rex_activator";
			rexActivatorQuery = rexActivatorQuery + " NOT " + packageName + SokanConst.SEPERATOR + "*" + SokanConst.SEPERATOR + "*" + ".rex_activator"; 
			queries.add(rexActivatorQuery);
		}
		String completeQueryString = "";
		for (Iterator<String> i = queries.iterator(); i.hasNext();) {
			String query = i.next();
			completeQueryString = completeQueryString + "(" + query + ")";
			if (i.hasNext()) {
				completeQueryString = completeQueryString + " OR ";
			}
		}
		
		List<Constraint> constraints = FacetUtil.buildConstraints(
				SolrConst.SYS_FIELD_ID,
				completeQueryString);
		FacetedRequest request  = FacetUtil.buildFacetedRequest(constraints);
		List<IndexRow> response = IndexUtil.INSTANCE.getIndex(request);
		for (IndexRow rexActicatorRow : response) {
			ID rexActivatorID = rexActicatorRow.getArtifactID();
			URI rexActivatorURI = ResourceUtil.uriFrom(rexActivatorID);
			ReuseExtensionActivatorList rexActivatorList = 
				ReuseResourcesUtil.getReuseExtensionActivatorList(
						ResourceUtil.idFrom(rexActivatorURI).getSegments(), 
						resourceSet);	
			if (rexActivatorList != null) {
				result.addAll(rexActivatorList.getActivators());
			}
		}
		
		return result;
	}
	
	/**
	 * Determines the URI for the derived composition program
	 * with the given UCPI.
	 * 
	 * @param ucpi the UCPI
	 * @param derivedFromUFI the UFI of the fragment from which 
	 *                       the composition program was derived
	 * @param locationHint a location hint
	 * 
	 * @return the URI for storing the composition program
	 */
	public static URI getDerivedCompositionProgramURI(
			List<String> ucpi, 
			List<String> derivedFromUFI, String locationHint) {
		List<String> referenceID = derivedFromUFI;
		URI referenceURI = ResourceUtil.uriFrom(ResourceUtil.idFrom(derivedFromUFI));
		
		URI locationURI = uriForLocationHint(locationHint, referenceID, referenceURI);
		
		URI store = 
			StoreUtil.INSTANCE.getStoreContainerFor(locationURI);
		
		if (store != null) {
			referenceID = Collections.emptyList();
			referenceURI = locationURI;
		}
		
		return uriForID(
				ucpi,
				referenceID, 
				referenceURI);
	}
	
	/**
	 * Determines the URI for the composed fragment
	 * with the given UFI.
	 * 
	 * @param ufi the UFI
	 * @param composingCompositionProgram
	 *            the composition program responsible for composing the fragment
	 *            
	 * @return the URI for storing the composed fragment
	 */
	public static URI getComposedFragmentURI(
			List<String> ufi,
			CompositionProgram composingCompositionProgram) {
		
		String locationHint = null;
		
		for (FragmentInstance fragmentInstance : composingCompositionProgram.getFragmentInstances()) {
			if (ufi.equals(fragmentInstance.getTargetUFI()) && fragmentInstance.isTarget()) {
				locationHint = fragmentInstance.getTargetPhysicalLocation();
				break;
			}
		}
		
		List<String> referenceID = composingCompositionProgram.getUCPI();
		URI referenceURI = composingCompositionProgram.eResource().getURI();
		
		URI locationURI = uriForLocationHint(locationHint, referenceID, referenceURI);
		
		URI store = 
			StoreUtil.INSTANCE.getStoreContainerFor(locationURI);
		
		if (store != null) {
			referenceID = Collections.emptyList();
			referenceURI = locationURI;
		}
		
		return uriForID(
				ufi,
				referenceID, 
				referenceURI);
	}

	private static URI uriForLocationHint(
			String locationHint,
			List<String> referenceID,
			URI referenceURI) {
		if (locationHint == null || "".equals(locationHint)) {
			return null;
		}
		URI locationURI = null;
		if (locationHint.contains(":")) {
			//absolute with scheme
			locationURI = URI.createURI(locationHint);
		} else if (locationHint.startsWith("/")) {
			//absolute in workspace
			locationURI = URI.createPlatformResourceURI(locationHint, true);
		} else {
			//relative to current store's container
			locationURI = URI.createURI(locationHint).resolve(referenceURI.trimSegments(referenceID.size()));
		}
		return locationURI;
	}
	
	private static URI uriForID(
			List<String> iD, 
			List<String> referenceID,
			URI referenceURI) {
		
		return referenceURI.trimSegments(referenceID.size()).appendSegments(
				 iD.toArray(new String[iD.size()]));
	}
	
	/**
	 * @param row an index row
	 * @return true if the row represents a meta artifact (fracol or rex file)
	 */
	public static boolean isMetaArtifact(IndexRow row) {
		if (row == null || row.getMetaData() == null) {
			return false;
		}
		
		if (row.getMetaData().getMulti(IndexConstants.COLUMN_ROOT_ECLASS).contains(
				SokanReuseResourceUtil.eClassToString(FracolPackage.Literals.FRAGMENT_COLLABORATION))
				&& row.getMetaData().getMulti(IndexConstants.COLUMN_ROOT_ECLASS).size() == 1) {
			return true;
		}
		if (row.getMetaData().getMulti(IndexConstants.COLUMN_ROOT_ECLASS).contains(
				SokanReuseResourceUtil.eClassToString(ReuseextensionPackage.Literals.REUSE_EXTENSION))
				&& row.getMetaData().getMulti(IndexConstants.COLUMN_ROOT_ECLASS).size() == 2) {
			return true;
		}
		return false;
	}
	
	/**
	 * @param row an index row
	 * @return true if the row represents a reuse extension activator
	 */
	public static boolean isRexActivator(IndexRow row) {
		if (row == null || row.getMetaData() == null) {
			return false;
		}
		
		if (row.getMetaData().getMulti(IndexConstants.COLUMN_ROOT_ECLASS).contains(
				SokanReuseResourceUtil.eClassToString(ReuseextensionactivatorPackage.Literals.REUSE_EXTENSION_ACTIVATOR_LIST))
				&& row.getMetaData().getMulti(IndexConstants.COLUMN_ROOT_ECLASS).size() == 1) {
			return true;
		}
		return false;
	}

	/**
	 * @param row an index row
	 * @return true if the row represents a diagram
	 */
	public static boolean isDiagram(IndexRow row) {
		if (row == null || row.getMetaData() == null) {
			return false;
		}
		return !row.getMetaData().getMulti(IndexConstants.COLUMN_DIAGRAM_FOR).isEmpty();
	}
	
	/**
	 * @param row an index row
	 * @return true if the row represents a composition program
	 */
	public static boolean isCompositionProgram(IndexRow row) {
		if (row == null || row.getMetaData() == null) {
			return false;
		}
		
		if (row.getMetaData().getMulti(IndexConstants.COLUMN_ROOT_ECLASS).contains(
				SokanReuseResourceUtil.eClassToString(CompositionprogramPackage.Literals.COMPOSITION_PROGRAM))) {
			return true;
		}
		return false;
	}
	
	/**
	 * Returns a string representation of the given EClass that can
	 * be stored in the index. The string is created from the nsURI
	 * of the EClass' package and the EClass' name.
	 * 
	 * @param eClass the EClass
	 * @return the string representation
	 */
	public static String eClassToString(EClass eClass) {
		if (eClass == null || eClass.getEPackage() == null) {
			return null;
		}
		return eClass.getEPackage().getNsURI() + "::" +  eClass.getName();
	}
}
