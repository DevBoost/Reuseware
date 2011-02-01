package org.reuseware.sokan.test.exampleindexer.indexer;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.reuseware.sokan.ID;
import org.reuseware.sokan.IndexMetaData;
import org.reuseware.sokan.index.DependencyMap;
import org.reuseware.sokan.index.indexer.Indexer;

/**
 * @author Matthias Schmidt
 * 
 */
public class GeneratingIndexer implements Indexer {

	// Attention!
	// This indexer makes Test Cases invalid: IndexUtilTest, MultiValueTest
	public void createIndex(URI artifactURI, IndexMetaData metaData,
			ResourceSet resourceSet) {

//		String path = artifactURI.path();
//		if (path.contains("2"))
//			return;
//
//		path += "2";
//		path = path.substring(9);
//		URI uri = URI.createPlatformResourceURI(path, true);
//		Resource res = resourceSet.createResource(uri);
//		res.setModified(true);
	}

	public void getDependent(ID artifactID, DependencyMap depMap) {
	}
}
