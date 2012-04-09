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
