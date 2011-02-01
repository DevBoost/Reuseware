package org.reuseware.sokan.test.indexer.complex;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.reuseware.sokan.ID;
import org.reuseware.sokan.IndexMetaData;
import org.reuseware.sokan.index.DependencyMap;
import org.reuseware.sokan.index.indexer.Indexer;
import org.reuseware.sokan.test.indexer.tests.IndexerSorterTest;

/**
 * This <code>Indexer</code> is used by {@link IndexerSorterTest} in an indexer
 * dependency graph. It therefore doesn't provide any meta data or artifact
 * dependencies.
 * 
 * @author Matthias Schmidt
 * 
 */
public class C9Indexer implements Indexer {

	/**
	 * Returns null.<br>
	 * See {@link C9Indexer} for more information.
	 */
	public void createIndex(URI artifactURI, IndexMetaData part,
			ResourceSet resourceSet) {
		// no index maintained
	}

	/**
	 * See {@link C9Indexer} for more information.
	 */
	public void getDependent(ID artifactID, DependencyMap depMap) {
		// no artifact dependencies maintained
	}

}
