package org.reuseware.sokan.test.index.indexer;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.reuseware.sokan.ID;
import org.reuseware.sokan.IndexMetaData;
import org.reuseware.sokan.index.DependencyMap;
import org.reuseware.sokan.index.indexer.Indexer;

public class FacetSizeIndexer implements Indexer {

	public static final String FACET_NAME = "size";
	public static final String VALUE_TINY = "tiny";
	public static final String VALUE_SMALL = "small";
	public static final String VALUE_NORMAL = "normal";
	public static final String VALUE_BIG = "big";
	public static final String VALUE_HUGE = "huge";
	public static final String VALUE_UNDEFINED = "undefined";

	public void createIndex(URI artifactURI, IndexMetaData part,
			ResourceSet resourceSet) {

		char secondChar = artifactURI.lastSegment().charAt(1);
		if (secondChar == '1')
			part.putSingle(FACET_NAME, VALUE_TINY);
		else if (secondChar == '2' || secondChar == '3')
			part.putSingle(FACET_NAME, VALUE_SMALL);
		else if (secondChar == '4' || secondChar == '5' || secondChar == '6')
			part.putSingle(FACET_NAME, VALUE_NORMAL);
		else if (secondChar == '7' || secondChar == '8')
			part.putSingle(FACET_NAME, VALUE_BIG);
		else if (secondChar == '9')
			part.putSingle(FACET_NAME, VALUE_HUGE);
		else
			part.putSingle(FACET_NAME, VALUE_UNDEFINED);
	}

	public void getDependent(ID artifactID, DependencyMap depMap) {
		// this indexer doesn't maintain any dependencies
	}

}
