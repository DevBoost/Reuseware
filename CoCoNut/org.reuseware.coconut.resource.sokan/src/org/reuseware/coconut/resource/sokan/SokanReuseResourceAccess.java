package org.reuseware.coconut.resource.sokan;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.reuseware.coconut.compositionprogram.CompositionprogramPackage;
import org.reuseware.coconut.fracol.FracolPackage;
import org.reuseware.coconut.resource.ReuseResourceAccess;
import org.reuseware.coconut.resource.sokan.util.SokanReuseResourceUtil;
import org.reuseware.coconut.reuseextension.ReuseextensionPackage;
import org.reuseware.coconut.reuseextensionactivator.ReuseextensionactivatorPackage;
import org.reuseware.sokan.Constraint;
import org.reuseware.sokan.FacetedRequest;
import org.reuseware.sokan.ID;
import org.reuseware.sokan.IndexRow;
import org.reuseware.sokan.index.util.FacetUtil;
import org.reuseware.sokan.index.util.IndexUtil;
import org.reuseware.sokan.index.util.ResourceUtil;

/**
 * A reuse resource access implementation that only queries the
 * Sokan index and does not need to load resources.
 */
public class SokanReuseResourceAccess implements ReuseResourceAccess {

	/**
	 * @param resourceURI URI of an artifact
	 * @return ID of the artifact in the repository
	 */
	public List<String> getID(URI resourceURI) {
		ID id = ResourceUtil.idFrom(resourceURI);
		if (id == null) {
			return null;
		}
		return id.getSegments();
	}
	
	/**
	 * @param iD ID of the artifact in the repository
	 * @return URI of the artifact
	 */
	public URI getContentsURI(List<String> iD) {
		return ResourceUtil.uriFrom(ResourceUtil.idFrom(iD));
	}

	/**
	 * @param iD ID of the artifact in the repository
	 * @return URIs of the diagrams associated with the artifact
	 */
	public List<URI> getDiagramURIs(List<String> iD) {
		List<Constraint> constraints = FacetUtil.buildConstraints(
				IndexConstants.COLUMN_DIAGRAM_FOR,
				ResourceUtil.idString(iD));
		FacetedRequest request = FacetUtil.buildFacetedRequest(constraints);
		List<IndexRow> response = IndexUtil.INSTANCE.getIndex(request);
		
		List<URI> result = new ArrayList<URI>();
		for (IndexRow diagramtRow : response) {
			URI diagramURI = ResourceUtil.uriFrom(diagramtRow.getArtifactID());
			result.add(diagramURI);
		}
		return result;
	}

	/**
	 * @return IDs of all Fracols registered in the repository
	 */
	public List<List<String>> getAllFragmentCollaborationIDs() {
		return getAllIDs(FracolPackage.Literals.FRAGMENT_COLLABORATION);
	}
	
	/**
	 * @return IDs of all reuse extensions registered in the repository
	 */
	public List<List<String>> getAllReuseExtensionIDs() {
		return getAllIDs(ReuseextensionPackage.Literals.REUSE_EXTENSION);
	}
	
	/**
	 * @return IDs of all reuse extension activator lists registered in the repository
	 */
	public List<List<String>> getAllReuseExtensionActivatorListIDs() {
		return getAllIDs(ReuseextensionactivatorPackage.Literals.REUSE_EXTENSION_ACTIVATOR_LIST);
	}
	
	/**
	 * @return IDs of all composition programs registered in the repository
	 */
	public List<List<String>> getAllCompositionProgramIDs() {
		return getAllIDs(CompositionprogramPackage.Literals.COMPOSITION_PROGRAM);
	}
	
	/**
	 * @return IDs of all derived composition programs registered in the repository
	 */
	public List<List<String>> getAllDerivedCompositionProgramIDs() {
		return getAllIDs(CompositionprogramPackage.Literals.DERIVED_COMPOSITION_PROGRAM);
	}
	
	/**
	 * @return IDs of all fragments registered in the repository
	 */
	public List<List<String>> getAllFragmentIDs() {
		//everything in the index can be a fragment
		List<List<String>> result = new ArrayList<List<String>>();
		for (IndexRow row : IndexUtil.INSTANCE.getIndex()) {
			result.add(row.getArtifactID().getSegments());
		}
		return result;
	}
	
	/**
	 * @return IDs of all composed fragments registered in the repository
	 */
	public List<List<String>> getAllComposedFragmentIDs() {
		List<Constraint> constraints = FacetUtil.buildConstraints(
				IndexConstants.COLUMN_COMPOSED_FRAGMENT,
				SokanReuseResourceUtil.eClassToString(
						CompositionprogramPackage.Literals.COMPOSITION_PROGRAM));
		FacetedRequest request = FacetUtil.buildFacetedRequest(constraints);
		List<IndexRow> response = IndexUtil.INSTANCE.getIndex(request);
		
		Set<List<String>> result = new TreeSet<List<String>>();
		for (IndexRow row : response) {
			for (String ufiString : row.getMetaData().getMulti(IndexConstants.COLUMN_COMPOSED_FRAGMENT)) {
				result.add(ResourceUtil.idFrom(ufiString).getSegments());
			}
		}
		return new ArrayList<List<String>>(result);
	}

	
	private List<List<String>> getAllIDs(EClass type) {
		List<Constraint> constraints = FacetUtil.buildConstraints(
				IndexConstants.COLUMN_ROOT_ECLASS,
				SokanReuseResourceUtil.eClassToString(type));
		FacetedRequest request = FacetUtil.buildFacetedRequest(constraints);
		List<IndexRow> response = IndexUtil.INSTANCE.getIndex(request);
		
		List<List<String>> result = new ArrayList<List<String>>();
		for (IndexRow row : response) {
			result.add(row.getArtifactID().getSegments());
		}
		return result;
	}

}
