package org.reuseware.sokan.test.indexer.list;

import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.reuseware.sokan.FacetedRequest;
import org.reuseware.sokan.ID;
import org.reuseware.sokan.IndexMetaData;
import org.reuseware.sokan.IndexRow;
import org.reuseware.sokan.index.DependencyMap;
import org.reuseware.sokan.index.util.FacetUtil;
import org.reuseware.sokan.index.util.IndexUtil;
import org.reuseware.sokan.index.util.ResourceUtil;
import org.reuseware.sokan.test.indexer.AbstractIndexer;
import org.reuseware.sokan.test.indexer.tests.IndexerSorterTest;
import org.reuseware.sokan.test.indexer.tests.MultiPhaseCommitTest;

/**
 * This <code>Indexer</code> is used by {@link IndexerSorterTest} in an indexer
 * dependency graph. In addition, {@link MultiPhaseCommitTest} uses this class
 * to prove that indexers depending on other indexers get invoked after latter
 * have indexed all incoming artifacts.
 * 
 * @author Matthias Schmidt
 * 
 */

public class B3Indexer extends AbstractIndexer {
	/**
	 * Adds meta data saying, that this indexer was invoked. <br>
	 * In addition, it calculates data over meta data added by {@link A3Indexer}
	 * .<br>
	 * See {@link B3Indexer} for more information.
	 */
	public void createIndex(URI artifactURI, IndexMetaData part,
			ResourceSet resourceSet) {

		ID id = ResourceUtil.idFrom(artifactURI);
		IndexRow row = IndexUtil.INSTANCE.getIndex(id);
		String a3Name = getName(A3Indexer.class);
		String a3Before;
		if (row == null)
			a3Before = String.valueOf(false);
		else
			a3Before = String
					.valueOf(row.getMetaData().getSingle(a3Name) != null);

		String[] valueArray = { INVOKED };
		FacetedRequest req = FacetUtil.buildFacetedRequest(a3Name, valueArray);
		List<IndexRow> rows = IndexUtil.INSTANCE.getIndex(req);
		String sizeStr = String.valueOf(rows.size());

		addMyMetaData(part);
		part.putSingle(a3Name + BEFORE + myName, a3Before);
		part.putSingle(ALL + a3Name, sizeStr);
	}

	/**
	 * See {@link B3Indexer} for more information.
	 */
	public void getDependent(ID artifactID, DependencyMap depMap) {
		// no artifact dependencies maintained
	}

}
