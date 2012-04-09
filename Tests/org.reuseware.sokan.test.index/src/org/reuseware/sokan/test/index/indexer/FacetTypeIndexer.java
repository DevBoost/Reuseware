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
