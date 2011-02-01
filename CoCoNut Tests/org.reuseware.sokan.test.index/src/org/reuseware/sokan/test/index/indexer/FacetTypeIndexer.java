package org.reuseware.sokan.test.index.indexer;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.reuseware.sokan.ID;
import org.reuseware.sokan.IndexMetaData;
import org.reuseware.sokan.index.DependencyMap;
import org.reuseware.sokan.index.indexer.Indexer;

public class FacetTypeIndexer implements Indexer {
	public static final String VALUE_EVEN = "Even";
	public static final String VALUE_ODD = "Odd";
	public static final String VALUE_DEFAULT = VALUE_EVEN;
	public static final String FACET_NAME = "type";

	public void createIndex(URI artifactURI, IndexMetaData part,
			ResourceSet resourceSet) {

		char thirdChar;
		try {
			thirdChar = artifactURI.lastSegment().charAt(2);
		} catch (Exception e) {
			thirdChar = 'x';
		}

		if (thirdChar == '0') {
			part.putSingle(FACET_NAME, VALUE_EVEN);
		} else {
			part.putSingle(FACET_NAME, VALUE_ODD);
		}
	}

	public void getDependent(ID artifactID, DependencyMap depMap) {
		// this indexer doesn't maintain any dependencies
	}

}
