package org.reuseware.coconut.resource.sokan.indexer;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.reuseware.coconut.resource.sokan.IndexConstants;
import org.reuseware.coconut.resource.sokan.util.SokanReuseResourceUtil;
import org.reuseware.sokan.ID;
import org.reuseware.sokan.IndexMetaData;
import org.reuseware.sokan.index.DependencyMap;
import org.reuseware.sokan.index.indexer.Indexer;

/**
 * An indexer that can index any EMF model. It stores the
 * type of the model, represented by the EClasses of 
 * the model's root elements and their super classes,
 * in the index.
 * <p>
 * Index field: <i>org.reuseware.coconut.resource.sokan.rootEClass</i>.
 */
public class RootEClassIndexer implements Indexer {

	/**
	 * @param artifactURI the URI
	 * @param metaData the meta data to fill
	 * @param resourceSet the resource set to use
	 */
	public void createIndex(URI artifactURI, IndexMetaData metaData,
			ResourceSet resourceSet) {
		
		Resource resource = null;
		try {
			resource = resourceSet.getResource(artifactURI, true);
		} catch (Exception e) {
			//ok
		}
		
		if (resource == null || resource.getContents().isEmpty()) {
			return;
		}
		
		metaData.getMulti(IndexConstants.COLUMN_ROOT_ECLASS).clear();
		
		for (EObject rootElement : resource.getContents()) {
			EClass rootEClass = rootElement.eClass();
			metaData.putMultiple(
					IndexConstants.COLUMN_ROOT_ECLASS, 
					SokanReuseResourceUtil.eClassToString(rootEClass));
			for (EClass superEClass : rootEClass.getEAllSuperTypes()) {
				metaData.putMultiple(
						IndexConstants.COLUMN_ROOT_ECLASS, 
						SokanReuseResourceUtil.eClassToString(superEClass));
			}
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
