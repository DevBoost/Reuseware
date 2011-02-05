/*******************************************************************************
 * Copyright (c) 2006-2011
 * Software Technology Group, Dresden University of Technology
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0 
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *   Software Technology Group - TU Dresden, Germany 
 *      - initial API and implementation
 ******************************************************************************/
package org.reuseware.sokan.index;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.reuseware.sokan.ID;

/**
 * Maintains a mapping that describes dependencies between artifacts. An
 * artifact A depends on an artifact B, if A gets invalid when B changes.<br>
 * An artifact dependency is described by a mapping of an
 * <code>artifactID</code> to a set of <code>Indexer</code> ids. Every time a
 * dirty artifact needs cleaning, the set of <code>Indexer</code>s is used to
 * clean the artifact's <code>IndexRow</code>.
 * 
 * @see Indexer
 * @see IndexRow
 */
public class DependencyMap {
	private Map<ID, Set<String>> dependencies;

	/**
	 * Dependency map constructor.
	 */
	public DependencyMap() {
		dependencies = new HashMap<ID, Set<String>>();
	}

	/**
	 * Sets the dependency mapping.
	 * 
	 * @param dependencies
	 *            The dependencies to set.
	 */
	public void setDependencies(Map<ID, Set<String>> dependencies) {
		this.dependencies = dependencies;
	}

	/**
	 * Retrieves the dependency mapping.
	 * 
	 * @return The dependencies.
	 */
	public Map<ID, Set<String>> getDependencies() {
		return dependencies;
	}

	/**
	 * Associates the given <code>artifactID</code> with the given
	 * <code>Indexer</code> id. If the dependencies previously contained a
	 * mapping for this <code>ID</code>, the new <code>Indexer</code> id is
	 * added to the set.
	 * 
	 * @param artifactID
	 *            An artifact identifier.
	 * @param indexerID
	 *            A <code>String</code> that identifies an <code>Indexer</code>.
	 */
	public void put(ID artifactID, String indexerID) {
		if (artifactID == null || indexerID == null) {
			return;
		}

		Set<String> inIDs = new HashSet<String>(1);
		inIDs.add(indexerID);
		put(artifactID, inIDs);
	}

	/**
	 * Associates the given <code>artifactID</code> with the given set of
	 * <code>Indexer</code> ids. If the dependencies previously contained a
	 * mapping for this <code>ID</code>, the new <code>Indexer</code> ids are
	 * added to the set.
	 * 
	 * @param artifactID
	 *            An artifact identifier.
	 * @param indexerIDs
	 *            A set of <code>String</code>s that identify
	 *            <code>Indexer</code>s.
	 */
	public void put(ID artifactID, Collection<String> indexerIDs) {
		if (artifactID == null || indexerIDs == null) {
			return;
		}

		if (dependencies.get(artifactID) != null) {
			dependencies.get(artifactID).addAll(indexerIDs);
		} else {
			Set<String> inIDs = new HashSet<String>();
			inIDs.addAll(indexerIDs);
			dependencies.put(artifactID, inIDs);
		}
	}

	/**
	 * Adds the mappings given by <code>newDependencies</code> to the
	 * dependencies maintained by this object.
	 * 
	 * @param newDependencies
	 *            A map containing artifact dependencies.
	 */
	public void putAll(Map<ID, Set<String>> newDependencies) {
		if (newDependencies == null) {
			return;
		}
		dependencies.putAll(newDependencies);
	}

	/**
	 * Adds the mappings given by <code>depMap</code> object to the dependencies
	 * maintained by this object.
	 * 
	 * 
	 * @param depMap
	 *            An <code>DependencyMap</code> object containing artifact
	 *            dependencies.
	 */
	public void putAll(DependencyMap depMap) {
		if (depMap == null || depMap.getDependencies() == null) {
			return;
		}
		dependencies.putAll(depMap.getDependencies());
	}

	/**
	 * Retrieves the set of <code>Indexer</code> ids that are associates to the
	 * given <code>artifactID</code> or <code>null</code> if no mapping is
	 * stored.
	 * 
	 * @param artifactID
	 *            An artifact identifier.
	 * @return A set of <code>String</code>s that identify <code>Indexer</code>s
	 */
	public Set<String> get(ID artifactID) {
		return dependencies.get(artifactID);
	}

	/**
	 * Retrieves whether there is a depencency mapping stored in this object.
	 * 
	 * @return <code>True</code> if at least on mapping is stored, else
	 *         <code>false</code>.
	 */
	public boolean isEmpty() {
		return dependencies.isEmpty();
	}
}
