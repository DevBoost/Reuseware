package org.reuseware.sokan.test.indexer.tree;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.reuseware.sokan.ID;
import org.reuseware.sokan.IndexMetaData;
import org.reuseware.sokan.index.DependencyMap;
import org.reuseware.sokan.test.indexer.AbstractIndexer;
import org.reuseware.sokan.test.indexer.tests.IndexerSorterTest;
import org.reuseware.sokan.test.indexer.tests.MultiPhaseCommitTest;
import org.reuseware.sokan.test.util.TestUtil;

/**
 * This <code>Indexer</code> is used by {@link IndexerSorterTest} in an indexer
 * dependency graph. In addition, {@link MultiPhaseCommitTest} uses this class
 * to prove that indexers not depending on others get invoked in alphabetic
 * order during one index commit phase.
 * 
 * @author Matthias Schmidt
 * 
 */
public class D8Indexer extends AbstractIndexer {

	/**
	 * Adds meta data saying, that this indexer was invoked and when.<br>
	 * See {@link D8Indexer} for more information.
	 */
	public void createIndex(URI artifactURI, IndexMetaData part,
			ResourceSet resourceSet) {
		TestUtil.waitForIndexingToFinish();

		addMyMetaData(part);
		addTimeStamp(this.getClass(), part);
	}

	/**
	 * See {@link D8Indexer} for more information.
	 */
	public void getDependent(ID artifactID, DependencyMap depMap) {
		// no artifact dependencies maintained
	}

}
