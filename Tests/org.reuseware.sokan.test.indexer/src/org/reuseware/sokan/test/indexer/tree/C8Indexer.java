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
import org.reuseware.sokan.IndexRow;
import org.reuseware.sokan.index.DependencyMap;
import org.reuseware.sokan.index.util.IndexUtil;
import org.reuseware.sokan.index.util.ResourceUtil;
import org.reuseware.sokan.test.indexer.AbstractIndexer;
import org.reuseware.sokan.test.indexer.tests.IndexerSorterTestCase;
import org.reuseware.sokan.test.indexer.tests.MultiPhaseCommitTestCase;
import org.reuseware.sokan.test.util.TestUtil;

/**
 * This <code>Indexer</code> is used by {@link IndexerSorterTestCase} in an indexer
 * dependency graph. In addition, {@link MultiPhaseCommitTestCase} uses this class
 * to prove that indexers not depending on others get invoked in alphabetic
 * order during one index commit phase.
 * 
 * @author Matthias Schmidt
 * 
 */
public class C8Indexer extends AbstractIndexer {

	/**
	 * Adds meta data saying, that this indexer was invoked and when. <br>
	 * In addition, it calculates data over meta data added by {@link B8Indexer}
	 * and {@link D8Indexer}.<br>
	 * See {@link C8Indexer} for more information.
	 */
	public void createIndex(URI artifactURI, IndexMetaData part,
			ResourceSet resourceSet) {
		TestUtil.waitForIndexingToFinish();

		ID id = ResourceUtil.idFrom(artifactURI);
		IndexRow row = IndexUtil.INSTANCE.getIndex(id);

		String b8Name = getName(B8Indexer.class);
		String b8Before;
		if (row == null)
			b8Before = String.valueOf(false);
		else
			b8Before = String
					.valueOf(row.getMetaData().getSingle(b8Name) != null);

		String d8Name = getName(D8Indexer.class);
		String d8Before;
		if (row == null)
			d8Before = String.valueOf(false);
		else
			d8Before = String
					.valueOf(row.getMetaData().getSingle(d8Name) != null);

		addMyMetaData(part);
		addTimeStamp(this.getClass(), part);

		part.putSingle(b8Name + BEFORE + myName, b8Before);
		part.putSingle(d8Name + BEFORE + myName, d8Before);
	}

	/**
	 * See {@link C8Indexer} for more information.
	 */
	public void getDependent(ID artifactID, DependencyMap depMap) {
		// no artifact dependencies maintained
	}

}
