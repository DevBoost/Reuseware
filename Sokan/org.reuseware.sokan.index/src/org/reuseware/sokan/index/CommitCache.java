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
package org.reuseware.sokan.index;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.util.URI;
import org.reuseware.sokan.ID;
import org.reuseware.sokan.index.indexer.Indexer;
import org.reuseware.sokan.index.util.ResourceUtil;

/**
 * Cache that holds information about artifacts to be 
 * updated by indexers.
 */
public class CommitCache {

	private Set<URI> deletedResources;
	private Set<URI> newResources;
	private Set<URI> updatedResources;
	private Map<ID, List<Indexer>> updateMap;

	private Set<URI> generatedResources;
	
	/**
	 * Constructs an empty cache.
	 */
	public CommitCache() {
		initCollections();
	}

	/**
	 * Constructs a new cache as clone of the given one.
	 * 
	 * @param cacheToClone the cache to clone
	 */
	public CommitCache(CommitCache cacheToClone) {
		initCollections();

		deletedResources.addAll(cacheToClone.getDeletedResources());
		newResources.addAll(cacheToClone.getNewResources());
		updatedResources.addAll(cacheToClone.getUpdatedResources());
		updateMap.putAll(cacheToClone.getUpdateMap());
		
		generatedResources.addAll(cacheToClone.getGeneratedResources());
	}

	private void initCollections() {
		deletedResources = new LinkedHashSet<URI>();
		newResources = new LinkedHashSet<URI>();
		updatedResources = new LinkedHashSet<URI>();
		updateMap = new LinkedHashMap<ID, List<Indexer>>();
		
		generatedResources = new LinkedHashSet<URI>();
	}

	/** 
	 * @return URIs of all new resources
	 */
	public Set<URI> getNewResources() {
		return newResources;
	}

	/** 
	 * @return URIs of all deleted resources
	 */
	public Set<URI> getDeletedResources() {
		return deletedResources;
	}

	/** 
	 * @return URIs of all updated resources
	 */
	public Set<URI> getUpdatedResources() {
		return updatedResources;
	}

	/** 
	 * @return map from artifact IDs to indexers that need to be called
	 */
	public Map<ID, List<Indexer>> getUpdateMap() {
		return updateMap;
	}

	/**
	 * @return IDs of all artifacts in the cache
	 */
	public Set<ID> extractAllIDs() {
		Set<ID> relevantIDs = extractUpdAndNewIDs();
		relevantIDs.addAll(extractDeletedIDs());
		return relevantIDs;
	}

	/**
	 * @return IDs of all deleted artifacts in the cache
	 */
	public Set<ID> extractDeletedIDs() {
		Set<ID> relevantIDs = new LinkedHashSet<ID>();
		relevantIDs.addAll(ResourceUtil.idListFromURIs(deletedResources));
		return relevantIDs;
	}

	/**
	 * @return IDs of all new artifacts in the cache
	 */
	public Set<ID> extractNewIDs() {
		Set<ID> relevantIDs = new LinkedHashSet<ID>();
		relevantIDs.addAll(ResourceUtil.idListFromURIs(newResources));
		return relevantIDs;
	}
	
	/**
	 * @return IDs of completely updated artifacts in the cache
	 */
	public Set<ID> extractCompletelyUpdatedIDs() {
		Set<ID> relevantIDs = new LinkedHashSet<ID>();
		relevantIDs.addAll(ResourceUtil.idListFromURIs(updatedResources));
		return relevantIDs;
	}

	/**
	 * @return IDs of all updated artifacts in the cache
	 */
	public Set<ID> extractUpdatedIDs() {
		Set<ID> relevantIDs = new LinkedHashSet<ID>();
		relevantIDs.addAll(ResourceUtil.idListFromURIs(updatedResources));
		relevantIDs.addAll(updateMap.keySet());
		return relevantIDs;
	}

	/**
	 * @return IDs of all new and updated artifacts in the cache
	 */
	public Set<ID> extractUpdAndNewIDs() {
		Set<ID> relevantIDs = extractNewIDs();
		relevantIDs.addAll(extractCompletelyUpdatedIDs());
		return relevantIDs;
	}

	/**
	 * @return true if the cache is empty
	 */
	public boolean isEmpty() {
		boolean empty = true;
		empty &= deletedResources.isEmpty();
		empty &= newResources.isEmpty();
		empty &= updatedResources.isEmpty();
		empty &= isUpdateMapEmpty();
		return empty;
	}
	
	/**
	 * @return true if the update map is empty
	 */
	public boolean isUpdateMapEmpty() {
		boolean empty = true;
		for (List<Indexer> list : getUpdateMap().values()) {
			if (!list.isEmpty()) {
				return false;
			}
		}
		return empty;
	}

	/** 
	 * @return URIs of all new resources that were generated by Sokan
	 */
	public Set<URI> getGeneratedResources() {
		return generatedResources;
	}
}
