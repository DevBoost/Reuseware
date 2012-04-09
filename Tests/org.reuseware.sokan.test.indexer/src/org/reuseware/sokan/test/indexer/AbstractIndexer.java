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
package org.reuseware.sokan.test.indexer;

import org.reuseware.sokan.ID;
import org.reuseware.sokan.IndexMetaData;
import org.reuseware.sokan.IndexRow;
import org.reuseware.sokan.index.indexer.Indexer;
import org.reuseware.sokan.index.util.IndexUtil;
import org.reuseware.sokan.test.util.TestUtil;

public abstract class AbstractIndexer implements Indexer {
	public final String myName = getName(this.getClass());
	public static final String ALL = "all";
	public static final String BEFORE = "-before-";
	public static final String INVOKED = "invoked";
	public static final String TIMESTAMP = "time";

	protected void addMyMetaData(IndexMetaData part) {
		part.putSingle(myName, INVOKED);
	}

	protected void addTimeStamp(Class<? extends Indexer> indexerClass,
			IndexMetaData part) {
		String name = getName(indexerClass);
		part.putSingle(name + TIMESTAMP, TestUtil.now());
	}

	protected boolean wasInvokedBefore(Class<? extends Indexer> indexerClass,
			ID id) {
		IndexRow row = IndexUtil.INSTANCE.getIndex(id);
		String name = getName(indexerClass);
		return row.getMetaData().getSingle(name) == null;
	}

	protected String getName(Class<? extends Indexer> indexerClass) {
		String indexerName = indexerClass.getSimpleName();
		int i = indexerName.lastIndexOf('I');
		indexerName = indexerName.substring(0, i);
		return indexerName;
	}

}
