package org.reuseware.coconut.resource;

import java.util.List;

import org.eclipse.emf.common.util.URI;

/**
 * This interface offers access to resources registered with Reuseware.
 */
public interface ReuseResourceAccess {
	
	/**
	 * @param resourceURI URI of an artifact
	 * @return ID of the artifact in the repository
	 */
	List<String> getID(URI resourceURI);
	
	/**
	 * @param iD ID of the artifact in the repository
	 * @return URI of the artifact
	 */
	URI          getContentsURI(List<String> iD);
	
	/**
	 * @param iD ID of the artifact in the repository
	 * @return URIs of the diagrams associated with the artifact
	 */
	List<URI>    getDiagramURIs(List<String> iD);
	
	/**
	 * @return IDs of all Fracols registered in the repository
	 */
	List<List<String>> getAllFragmentCollaborationIDs();
	
	/**
	 * @return IDs of all reuse extensions registered in the repository
	 */
	List<List<String>> getAllReuseExtensionIDs();
	
	/**
	 * @return IDs of all reuse extension activator lists registered in the repository
	 */
	List<List<String>> getAllReuseExtensionActivatorListIDs();
	
	/**
	 * @return IDs of all composition programs registered in the repository
	 */
	List<List<String>> getAllCompositionProgramIDs();
	
	/**
	 * @return IDs of all derived composition programs registered in the repository
	 */
	List<List<String>> getAllDerivedCompositionProgramIDs();
	
	/**
	 * @return IDs of all fragments registered in the repository
	 */
	List<List<String>> getAllFragmentIDs();
	
	/**
	 * @return IDs of all composed fragments registered in the repository
	 */
	List<List<String>> getAllComposedFragmentIDs();
}
