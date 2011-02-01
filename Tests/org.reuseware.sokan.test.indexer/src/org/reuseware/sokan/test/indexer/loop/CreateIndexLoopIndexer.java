package org.reuseware.sokan.test.indexer.loop;

import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.reuseware.sokan.ID;
import org.reuseware.sokan.IndexMetaData;
import org.reuseware.sokan.IndexRow;
import org.reuseware.sokan.index.DependencyMap;
import org.reuseware.sokan.index.indexer.Indexer;
import org.reuseware.sokan.index.util.IndexUtil;

/**
 * @author Matthias Schmidt
 *
 */
public class CreateIndexLoopIndexer implements Indexer {

	/* (non-Javadoc)
	 * @see org.reuseware.sokan.index.indexer.Indexer#createIndex(org.eclipse.emf.common.util.URI, org.reuseware.sokan.IndexMetaData, org.eclipse.emf.ecore.resource.ResourceSet)
	 */
	public void createIndex(URI artifactURI, IndexMetaData metaData,
			ResourceSet resourceSet) {
		// this leads to invocation loop
		List<IndexRow> rows = IndexUtil.INSTANCE.getIndex();
		rows.isEmpty();
	}

	/* (non-Javadoc)
	 * @see org.reuseware.sokan.index.indexer.Indexer#getDependent(org.reuseware.sokan.ID, org.reuseware.sokan.index.DependencyMap)
	 */
	public void getDependent(ID artifactID, DependencyMap depMap) {
		// no dependencies supported
	}

}
