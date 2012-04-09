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
package org.reuseware.sokan.test.exampleindexer.indexer;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.reuseware.sokan.ID;
import org.reuseware.sokan.IndexMetaData;
import org.reuseware.sokan.index.DependencyMap;
import org.reuseware.sokan.index.indexer.Indexer;

/**
 * @author Matthias Schmidt
 * 
 */
public class GeneratingIndexer implements Indexer {

	// Attention!
	// This indexer makes Test Cases invalid: IndexUtilTest, MultiValueTest
	public void createIndex(URI artifactURI, IndexMetaData metaData,
			ResourceSet resourceSet) {

//		String path = artifactURI.path();
//		if (path.contains("2"))
//			return;
//
//		path += "2";
//		path = path.substring(9);
//		URI uri = URI.createPlatformResourceURI(path, true);
//		Resource res = resourceSet.createResource(uri);
//		res.setModified(true);
	}

	public void getDependent(ID artifactID, DependencyMap depMap) {
	}
}
