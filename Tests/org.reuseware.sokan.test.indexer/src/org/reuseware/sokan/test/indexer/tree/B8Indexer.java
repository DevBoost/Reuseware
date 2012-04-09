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
package org.reuseware.sokan.test.indexer.tree;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.reuseware.sokan.ID;
import org.reuseware.sokan.IndexMetaData;
import org.reuseware.sokan.index.DependencyMap;
import org.reuseware.sokan.test.indexer.AbstractIndexer;
import org.reuseware.sokan.test.indexer.tests.IndexerSorterTestCase;
import org.reuseware.sokan.test.indexer.tests.MultiPhaseCommitTestCase;

/**
 * This <code>Indexer</code> is used by {@link IndexerSorterTestCase} in an indexer
 * dependency graph. In addition, {@link MultiPhaseCommitTestCase} uses this class
 * to prove that indexers not depending on others get invoked in alphabetic
 * order during one index commit phase.
 * 
 * @author Matthias Schmidt
 * 
 */
public class B8Indexer extends AbstractIndexer {

	/**
	 * Adds meta data saying, that this indexer was invoked and when.<br>
	 * See {@link B8Indexer} for more information.
	 */
	public void createIndex(URI artifactURI, IndexMetaData part,
			ResourceSet resourceSet) {
		addMyMetaData(part);
		addTimeStamp(this.getClass(), part);
	}

	/**
	 * See {@link B8Indexer} for more information.
	 */
	public void getDependent(ID artifactID, DependencyMap depMap) {
		// no artifact dependencies maintained
	}

}
