/*******************************************************************************
 * Copyright (c) 2006-2012
 * Software Technology Group, Dresden University of Technology
 * DevBoost GmbH, Berlin, Amtsgericht Charlottenburg, HRB 140026
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *   Software Technology Group - TU Dresden, Germany;
 *   DevBoost GmbH - Berlin, Germany
 *      - initial API and implementation
 ******************************************************************************/
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
