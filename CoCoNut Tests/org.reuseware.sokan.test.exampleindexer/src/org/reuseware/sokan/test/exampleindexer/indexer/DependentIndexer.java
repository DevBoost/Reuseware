package org.reuseware.sokan.test.exampleindexer.indexer;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.reuseware.sokan.ID;
import org.reuseware.sokan.IndexMetaData;
import org.reuseware.sokan.index.DependencyMap;
import org.reuseware.sokan.index.indexer.Indexer;

public class DependentIndexer implements Indexer {

	public void createIndex(URI artifactURI, IndexMetaData part,
			ResourceSet resourceSet) {

		// System.out.println("DEPENDENT INDEXER!");
	}

	public void getDependent(ID artifactID, DependencyMap depMap) {
		// no artifact dependencies maintained
	}

}
