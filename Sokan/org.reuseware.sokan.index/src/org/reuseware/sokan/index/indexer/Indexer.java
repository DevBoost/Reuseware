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
package org.reuseware.sokan.index.indexer;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.reuseware.sokan.ID;
import org.reuseware.sokan.IndexMetaData;
import org.reuseware.sokan.index.DependencyMap;

/**
 * This interface is the base of an extension point that is fundamental to the
 * index creation process. Whenever an artifact gets added or updated in a store
 * all indexers registered by client plug-ins get invoked. This makes
 * <code>Indexer</code>s to the linchpin of applications using Sokan. <br>
 * <br>
 * 
 * <b>Important Hint:</b> <br>
 * As classes registered under the indexer extension point get invoked quite
 * often during the indexing process they can slow it down. Especially querying
 * and manipulating the index within an <code>Indexer</code> can lead to this
 * effect. Putting this point further, an <code>Indexer</code> implementation
 * can lead to an infinite loop given the following two conditions: <br>
 * 
 * <ul>
 * <li>An <code>Indexer</code> queries for clean rows. (e.g. using
 * {@link IndexUtil#getIndex()})</li>
 * <li>The same <code>Indexer</code> is specified to be invoked when a dirty
 * artifact needs cleaning.</li>
 * </ul>
 */
public interface Indexer {

	/**
	 * Creates the specific meta data that should be added to the artifact's
	 * index row. The meta data of this <code>Indexer</code> is represented by
	 * an <code>IndexMetaData</code> object. The <code>IndexMetaData</code>
	 * maintains <code>field-value</code> mappings where <code>field</code>
	 * defines the field type or index column.
	 * 
	 * @param artifactURI
	 *            The artifact's physical URI.
	 * @param metaData
	 *            The <code>IndexMetaData</code> object that needs to be filled
	 *            by the <code>Indexer</code>.
	 * @param resourceSet
	 *            A resource set in the context of one index build process that
	 *            can be used to load EMF models.
	 * @see IndexMetaData
	 */
	void createIndex(URI artifactURI, IndexMetaData metaData,
			ResourceSet resourceSet);

	/**
	 * Retrieves a number of other artifacts that depend on the artifact
	 * identified by the given <code>artifactID</code>. 'Depends on' means, that
	 * these other artifacts get invalid if the artifacts get updated. The
	 * dependencies are maintained by a <code>DependencyMap</code> object, which
	 * maps <code>ID</code>s of the dependent artifacts to a set of
	 * <code>Indexer</code> ids that need to be invoked to clean there index.
	 * This is highly connected to the <code>dirty</code> feature of
	 * <code>IndexRow</code>.
	 * 
	 * @param artifactID
	 *            The artifact's identifier.
	 * @param depMap
	 *            The <code>DependencyMap</code> object that needs to be filled
	 *            by the <code>Indexer</code>.
	 * @see DependencyMap
	 * @see IndexRow#getDirty()
	 */
	void getDependent(ID artifactID, DependencyMap depMap);
}
