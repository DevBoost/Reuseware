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

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.reuseware.sokan.FacetedRequest;
import org.reuseware.sokan.FacetedResponse;
import org.reuseware.sokan.ID;
import org.reuseware.sokan.IndexRow;
import org.reuseware.sokan.index.util.CoreUtil;
import org.reuseware.sokan.index.util.RowUtil;

/**
 * Caches query results from queries on the index.
 */
public class IndexCache {

	/**
	 * Indicates that the cache was just initiated.
	 */
	public static final String INIT_TIME = "INIT_TIME";

	private String time = INIT_TIME;

	private List<IndexRow> allCache;
	private Map<ID, IndexRow> oneRowCache;
	private Map<Collection<ID>, List<IndexRow>> nRowCache;
	private Map<FacetedRequest, FacetedResponse> rspCache;
	private Map<ID, Boolean> isArtCache;

	/**
	 * The constructor.
	 */
	public IndexCache() {
		oneRowCache = new HashMap<ID, IndexRow>();
		nRowCache = new HashMap<Collection<ID>, List<IndexRow>>();
		rspCache = new HashMap<FacetedRequest, FacetedResponse>();
		isArtCache = new HashMap<ID, Boolean>();
	}

	/**
	 * Puts all given rows into the cache.
	 * 
	 * @param timeStamp the time stamp of the index update
	 * @param toCache the rows to cache
	 * @return true if successful
	 */
	public boolean putAll(String timeStamp, List<IndexRow> toCache) {
		if (isNull(timeStamp, toCache)) {
			return false;
		}
		time = timeStamp;
		allCache = toCache;
		return true;
	}

	/**
	 * Returns all rows associated with the given time stamp.
	 * 
	 * @param timeStamp the time stamp
	 * @return the rows
	 */
	public List<IndexRow> getAll(String timeStamp) {
		if (notLastCommit(timeStamp)) {

			if (isWellFormed(timeStamp)) {
				clearAll();
			}
			return null;
		}

		return allCache;
	}

	/**
	 * Returns the row of the artifact with the given ID and the given time stamp.
	 * 
	 * @param timeStamp the time stamp
	 * @param id the ID
	 * @return the row
	 */
	public IndexRow getIndex(String timeStamp, ID id) {
		if (notLastCommit(timeStamp)) {
			if (id != null && isWellFormed(timeStamp)) {
				clearAll();
			}
			return null;
		}

		IndexRow myRow = oneRowCache.get(id);
		if (myRow != null) {
			return myRow;
		}
		if (allCache != null) {
			myRow = RowUtil.findRowFor(id, allCache);
			if (myRow != null) {
				oneRowCache.put(id, myRow);
				return myRow;
			}
		}

		return myRow;
	}

	/**
	 * Puts the given row into the cache.
	 * 
	 * @param timeStamp the time stamp of the index update
	 * @param id the ID of the artifact
	 * @param toCache the row to cache
	 * @return true if successful
	 */
	public boolean putIndex(String timeStamp, ID id, IndexRow toCache) {
		if (isNull(timeStamp, toCache) || id == null) {
			return false;
		}

		time = timeStamp;
		oneRowCache.put(id, toCache);
		return true;
	}

	/**
	 * Returns the rows of the artifacts with the given IDs and the given time stamp.
	 * 
	 * @param timeStamp the time stamp
	 * @param ids the IDs
	 * @return the rows
	 */
	public List<IndexRow> getIndex(String timeStamp, Collection<ID> ids) {
		if (notLastCommit(timeStamp)) {
			if (ids != null && isWellFormed(timeStamp)) {
				clearAll();
			}
			return null;
		}

		Collection<ID> myKey = null;
		for (Collection<ID> keyIDs : nRowCache.keySet()) {
			if (!CoreUtil.equal(ids, keyIDs)) {
				continue;
			}
			myKey = keyIDs;
			break;
		}
		return nRowCache.get(myKey);
	}

	/**
	 * Puts the given rows into the cache.
	 * 
	 * @param timeStamp the time stamp of the index update
	 * @param ids the IDs of the artifacts
	 * @param toCache the rows to cache
	 * @return true if successful
	 */
	public boolean putIndex(String timeStamp, Collection<ID> ids,
			List<IndexRow> toCache) {
		if (isNull(timeStamp, toCache) || ids == null || ids.isEmpty()) {
			return false;
		}

		time = timeStamp;
		Collection<ID> myKey = null;
		for (Collection<ID> keyIDs : nRowCache.keySet()) {
			if (!CoreUtil.equal(ids, keyIDs)) {
				continue;
			}
			myKey = keyIDs;
			break;
		}
		nRowCache.put(myKey != null ? myKey : ids, toCache);
		return true;
	}

	/**
	 * @param timeStamp the time stamp
	 * @param req the request 
	 * @return the cached query result
	 */
	public FacetedResponse getResponse(String timeStamp, FacetedRequest req) {
		if (notLastCommit(timeStamp)) {
			if (req != null && isWellFormed(timeStamp)) {
				clearAll();
			}
			return null;
		}

		return rspCache.get(req);
	}

	/**
	 * @param timeStamp the time stamp
	 * @param req the request 
	 * @param toCache the query result to cache
	 * @return true if successful
	 */
	public boolean putResponse(String timeStamp, FacetedRequest req,
			FacetedResponse toCache) {
		if (isNull(timeStamp, toCache) || req == null) {
			return false;
		}

		time = timeStamp;
		rspCache.put(req, toCache);
		return true;
	}

	/**
	 * @param timeStamp the time stamp
	 * @param id the artifact ID
	 * @return true if there is an artifact with the given ID indexed at the given time stamp
	 */
	public Boolean isArtifact(String timeStamp, ID id) {
		if (notLastCommit(timeStamp)) {
			if (id != null && isWellFormed(timeStamp)) {
				clearAll();
			}
			return null;
		}

		Boolean isArt = isArtCache.get(id);
		if (isArt != null) {
			return isArt;
		}
		if (allCache != null && RowUtil.findRowFor(id, allCache) != null) {
			isArtCache.put(id, true);
			return true;
		}

		if (RowUtil.findRowFor(id, oneRowCache.values()) != null) {
			isArtCache.put(id, true);
			return true;
		}

		for (List<IndexRow> rows : nRowCache.values()) {
			if (RowUtil.findRowFor(id, rows) != null) {
				isArtCache.put(id, true);
				return true;
			}
		}

		for (FacetedResponse rsp : rspCache.values()) {
			if (RowUtil.findRowFor(id, rsp.getContent()) != null) {
				isArtCache.put(id, true);
				return true;
			}
		}

		return null;
	}

	/**
	 * @param timeStamp the time stamp
	 * @param id the ID
	 * @param toCache value to cache
	 * @return true if successful
	 */
	public boolean putIsArtifact(String timeStamp, ID id, Boolean toCache) {
		if (isNull(timeStamp, toCache) || id == null) {
			return false;
		}
		time = timeStamp;
		isArtCache.put(id, toCache);
		return true;
	}

	private boolean notLastCommit(String timeStamp) {
		return timeStamp == null || timeStamp.equals("")
				|| !timeStamp.equals(time);
	}

	private boolean isWellFormed(String timeStamp) {
		return CoreUtil.toDate(timeStamp) != null;
	}

	private boolean isNull(String timeStamp, Object toCache) {
		return timeStamp == null || timeStamp.equals("") || toCache == null;
	}

	private void clearAll() {
		nRowCache.clear();
		allCache = null;
		oneRowCache.clear();
		rspCache.clear();
		isArtCache.clear();
	}
}
