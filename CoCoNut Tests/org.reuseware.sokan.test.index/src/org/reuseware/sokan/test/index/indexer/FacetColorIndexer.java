package org.reuseware.sokan.test.index.indexer;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.reuseware.sokan.ID;
import org.reuseware.sokan.IndexMetaData;
import org.reuseware.sokan.index.DependencyMap;
import org.reuseware.sokan.index.indexer.Indexer;

public class FacetColorIndexer implements Indexer {
	public static final String VALUE_DEFAULT = "Yellow";
	public static final String VALUE_G = "orange";
	public static final String VALUE_F = "Firebrick";
	public static final String VALUE_E = "Egyptian blue";
	public static final String VALUE_C = "Dark";
	public static final String VALUE_B = "Brown";
	public static final String VALUE_A = "Ash grey";
	public static final String VALUE_D = VALUE_C + " " + VALUE_G;
	public static final String FACET_NAME = "color";

	public void createIndex(URI artifactURI, IndexMetaData part,
			ResourceSet resourceSet) {

		char firstChar = artifactURI.lastSegment().charAt(0);
		switch (firstChar) {
		case 'A':
			part.putSingle(FACET_NAME, VALUE_A);
			break;

		case 'B':
			part.putSingle(FACET_NAME, VALUE_B);
			break;

		case 'C':
			part.putSingle(FACET_NAME, VALUE_C);
			break;

		case 'D':
			part.putSingle(FACET_NAME, VALUE_D);
			break;

		case 'E':
			part.putSingle(FACET_NAME, VALUE_E);
			break;

		case 'F':
			part.putSingle(FACET_NAME, VALUE_F);
			break;

		case 'G':
			part.putSingle(FACET_NAME, VALUE_G);
			break;

		default:
			part.putSingle(FACET_NAME, VALUE_DEFAULT);
			break;
		}
	}

	public void getDependent(ID artifactID, DependencyMap depMap) {
		// this indexer doesn't maintain any dependencies
	}

}
