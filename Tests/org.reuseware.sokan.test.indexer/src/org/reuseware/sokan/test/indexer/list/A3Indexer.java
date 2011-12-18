package org.reuseware.sokan.test.indexer.list;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.reuseware.sokan.ID;
import org.reuseware.sokan.IndexMetaData;
import org.reuseware.sokan.index.DependencyMap;
import org.reuseware.sokan.test.indexer.AbstractIndexer;
import org.reuseware.sokan.test.indexer.tests.IndexerSorterTestCase;
import org.reuseware.sokan.test.indexer.tests.MultiPhaseCommitTestCase;

/**
 * This <code>Indexer</code> is used by {@link IndexerSorterTestCase} in an indexer
 * dependency graph. In addition, {@link MultiPhaseCommitTestCase} uses this class
 * to prove that indexers depending on other indexers get invoked after latter
 * have indexed all incoming artifacts.
 * 
 * @author Matthias Schmidt
 * 
 */
public class A3Indexer extends AbstractIndexer {

	/**
	 * Adds meta data saying, that this indexer was invoked.<br>
	 * See {@link A3Indexer} for more information.
	 */
	public void createIndex(URI artifactURI, IndexMetaData part,
			ResourceSet resourceSet) {
		addMyMetaData(part);
	}

	/**
	 * See {@link A3Indexer} for more information.
	 */
	public void getDependent(ID artifactID, DependencyMap depMap) {
		// no artifact dependencies maintained
	}
}
