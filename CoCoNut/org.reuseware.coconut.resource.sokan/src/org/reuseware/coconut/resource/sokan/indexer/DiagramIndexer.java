package org.reuseware.coconut.resource.sokan.indexer;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.reuseware.coconut.resource.ReuseResources;
import org.reuseware.coconut.resource.sokan.IndexConstants;
import org.reuseware.coconut.resource.sokan.util.SokanReuseResourceUtil;
import org.reuseware.coconut.resource.util.ReuseResourcesUtil;
import org.reuseware.sokan.ID;
import org.reuseware.sokan.IndexMetaData;
import org.reuseware.sokan.IndexRow;
import org.reuseware.sokan.index.DependencyMap;
import org.reuseware.sokan.index.indexer.Indexer;
import org.reuseware.sokan.index.util.IndexUtil;
import org.reuseware.sokan.index.util.ResourceUtil;

/**
 * An indexer that checks if an artifact is a diagram (i.e., contains layout information)
 * for another artifact. If that is the case, the current artifact is marked as a
 * diagram of the other one using the <code>IndexConstants.COLUMN_DIAGRAM_FOR</code>
 * row.
 */
public class DiagramIndexer implements Indexer {
	
	/**
	 * Fills <code>IndexConstants.COLUMN_DIAGRAM_FOR</code> for the given artifact.
	 * 
	 * @param artifactURI
	 *            The artifact's physical URI.
	 * @param metaData
	 *            The <code>IndexMetaData</code> object that needs to be filled
	 *            by the <code>Indexer</code>.
	 * @param resourceSet
	 *            A resource set in the context of one index build process that
	 *            can be used to load EMF models.
	 */
	public void createIndex(URI artifactURI, IndexMetaData metaData,
			ResourceSet resourceSet) {
		
		
		Resource diagramResource = null;
		try {
			diagramResource = resourceSet.getResource(artifactURI, true);
		} catch (Exception e) {
			//can not load
		}
		if (diagramResource == null) {
			return;
		}
		
		metaData.getMulti(IndexConstants.COLUMN_DIAGRAM_FOR).clear();
		
		for (EObject root : diagramResource.getContents()) {
			if (ReuseResourcesUtil.isDiagram(root)) {
				Set<URI> referencedURIs = new LinkedHashSet<URI>();
				for (Iterator<EObject> i = diagramResource.getAllContents(); i.hasNext();) {
					EObject next = i.next();
					for (EObject referencedElement : next.eCrossReferences()) {
						if (!referencedElement.eIsProxy() && referencedElement.eResource() != null) {
							URI referencedURI = referencedElement.eResource().getURI();
							if (!referencedURI.equals(artifactURI)) {
								referencedURIs.add(referencedURI);
							}
						}
					}
				}
				
				for (URI referencedURI : referencedURIs) {
					ID referencedID = ResourceUtil.idFrom(referencedURI);
					if (referencedID != null) {
						metaData.putMultiple(
								IndexConstants.COLUMN_DIAGRAM_FOR,
								ResourceUtil.idString(referencedID));
					}
				}
			}
		}
		


	}

	/**
	 * Re-executes the <code>IndexConstants.GENERATOR_COMPOSED_FRAGMENTS</code> called 
	 * indexer for cases where current artifact is a diagram that is input of the composition.
	 * This is needed, because if a diagram composition component as Lacome is used, the
	 * layout of the composed fragment changes along with the layout of the source
	 * fragments.
	 * 
	 * @param artifactID
	 *            The artifact's identifier.
	 * @param depMap
	 *            The <code>DependencyMap</code> object that needs to be filled
	 *            by the <code>Indexer</code>.
	 */
	public void getDependent(ID artifactID, DependencyMap depMap) {
		IndexRow row = IndexUtil.INSTANCE.getIndex(artifactID);
		List<String> ufiStringList = row.getMetaData().getMulti(
				IndexConstants.COLUMN_DIAGRAM_FOR);
		
		for (String ufiString : ufiStringList) {
			//diagram of a source fragment
			List<String> ufi = ResourceUtil.idFrom(ufiString).getSegments();
			List<List<String>> ucpiList = 
				ReuseResources.INSTANCE.getInfluencedComposingCompositionProgramIDsFragment(ufi);
			for (List<String> ucpi : ucpiList) {
				depMap.put(
						ResourceUtil.idFrom(ucpi), 
						IndexConstants.GENERATOR_COMPOSED_FRAGMENTS);
			}
			//diagram of a composition program
			row = IndexUtil.INSTANCE.getIndex(ResourceUtil.idFrom(ufiString));
			if (SokanReuseResourceUtil.isCompositionProgram(row)) {
				depMap.put(
						ResourceUtil.idFrom(ufi), 
						IndexConstants.GENERATOR_COMPOSED_FRAGMENTS);
			}
			//diagram of a fragment from which a composition program was derived
			 ucpiList = 
					ReuseResources.INSTANCE.getInfluencedDerivedCompositionProgramIDsCompositionProgramSource(ufi);
			for (List<String> ucpi : ucpiList) {
				depMap.put(
						ResourceUtil.idFrom(ucpi), 
						IndexConstants.GENERATOR_COMPOSED_FRAGMENTS);
			}
		}
	}
}
