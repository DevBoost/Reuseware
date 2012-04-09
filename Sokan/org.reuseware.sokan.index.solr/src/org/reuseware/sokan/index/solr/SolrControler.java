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
package org.reuseware.sokan.index.solr;

import static org.reuseware.sokan.index.solr.SolrConst.SYS_FIELD_ID;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.Map.Entry;
import java.util.logging.Level;

import java.io.File;

import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.SolrServer;
import org.apache.solr.client.solrj.embedded.EmbeddedSolrServer;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.solr.common.util.NamedList;
import org.apache.solr.core.CoreContainer;
import org.apache.solr.core.CoreDescriptor;
import org.apache.solr.core.SolrConfig;
import org.apache.solr.core.SolrCore;
import org.apache.solr.core.SolrResourceLoader;
import org.apache.solr.schema.IndexSchema;
import org.reuseware.sokan.ID;
import org.reuseware.sokan.IndexRow;
import org.reuseware.sokan.index.SokanIndexPlugin;
import org.reuseware.sokan.index.util.CoreUtil;
import org.reuseware.sokan.index.util.ResourceUtil;

/**
 * Singleton that controls the Solr index.
 */
public final class SolrControler {
	
	/**
	 * The singleton instance.
	 */
	public static final SolrControler INSTANCE = new SolrControler();
		
	private static final String OR = " OR ";
	private static final int DEFAULT_ROWS = 100;

	private String solrHome;
	private String confDir;
	private String solrData;

	private SolrConfig solrConfig;
	private IndexSchema indexSchema;
	private SolrServer solrServer;
	private CoreContainer coreContainer;

	private SolrControler() {
		solrHome = SolrUtil.getSolrHome();
		confDir = SolrUtil.getConfigurationDir();
		solrData = SolrUtil.getDataDir();

		SolrUtil.configureLogger(Level.SEVERE);
		setupSolrHome();
		startSolrServer();
	}

	/**
	 * @return the Solr server
	 */
	public SolrServer getServer() {
		return solrServer;
	}

	/**
	 * @return the indexSchema
	 */
	public IndexSchema getIndexSchema() {
		return indexSchema;
	}

	/**
	 * Queries for all index rows.
	 * 
	 * @return all index rows
	 */
	public List<IndexRow> query() {
		return query("*:*", -1);
	}

	/**
	 * @return the names of all fields (columns) in the index
	 */
	public Set<String> getFieldNames() {
		NamedList<Object> list = adminQuery();
		if (list == null) {
			return null;
		}
		Set<String> fields = new TreeSet<String>();
		@SuppressWarnings("unchecked")
		NamedList<Object> fieldStatistic = (NamedList<Object>) list.get("fields");

		for (Entry<String, ?> entry : fieldStatistic) {
			fields.add(entry.getKey());
		}
		return fields;
	}

	/**
	 * Queries for the index row of the artifact with the given ID.
	 * 
	 * @param artifactID the artifact's ID
	 * @return the artifact's index row
	 */
	public IndexRow query(ID artifactID) {
		String idString = ResourceUtil.idString(artifactID);
		idString = SolrUtil.prepareForQuery(idString);
		List<IndexRow> result = query(SYS_FIELD_ID + ":" + idString, 1);

		if (result == null || result.size() < 1) {
			return null;
		}
		return result.get(0);
	}
	
	/**
	 * Queries for all index rows of the artifacts with the given IDs.
	 * 
	 * @param artifactIDs the artifacts' IDs
	 * @return the artifacts' index rows
	 */
	public List<IndexRow> query(Collection<ID> artifactIDs) {
		String idString;
		String queryString = "";

		for (ID id : artifactIDs) {
			idString = ResourceUtil.idString(id);
			idString = SolrUtil.prepareForQuery(idString);
			queryString += SYS_FIELD_ID + ":" + idString + OR;
		}
		if (queryString.length() != 0) {
			queryString = CoreUtil.trimLastString(queryString, OR);
		}
		return query(queryString, artifactIDs.size());
	}

	/**
	 * Executes the query but limits the result to the given number of rows.
	 * 
	 * @param queryString the query string
	 * @param resultRows maximum number of result rows
	 * @return the query result
	 */
	public List<IndexRow> query(String queryString, int resultRows) {
		if (queryString == null || queryString.equals("")) {
			return new ArrayList<IndexRow>();
		}
		SolrQuery query = new SolrQuery();
		query.setQuery(queryString);
		limit(query, resultRows);

		QueryResponse rsp = query(query);
		if (rsp == null) {
			return null;
		} else {
			return SolrUtil.toIndexRows(rsp.getResults());
		}
	}

	/**
	 * Executes the given Solr query.
	 * 
	 * @param query the Solr query
	 * @return the query result
	 */
	public QueryResponse query(SolrQuery query) {
		if (query == null) {
			return null;
		}
		QueryResponse rsp = null;
		query.add("debugQuery", "true");
		try {
			rsp = solrServer.query(query);
		} catch (Exception e) {
			SokanIndexPlugin.logError("", e);
		}

		if (rsp == null) {
			return null;
		}
		return rsp;
	}

	/**
	 * Stops the Solr server.
	 */
	public void stopServer() {
		if (coreContainer != null) {
			coreContainer.shutdown();
		}
	}

	private boolean isCorrectSchema() {
		solrConfig = buildSolrConfig();
		try {
			indexSchema = buildIndexSchema(solrConfig);
		} catch (RuntimeException e) {
			// schema.xml doesn't exist
			return false;
		}

		if (SolrUtil.wellFormed(indexSchema)) {
			return true;
		}
		solrConfig = null;
		indexSchema = null;
		return false;
	}

	/**
	 * @return the size of the index.
	 */
	public int getSize() {
		NamedList<Object> list = adminQuery();
		if (list == null) {
			return DEFAULT_ROWS;
		}
		
		@SuppressWarnings("unchecked")
		NamedList<Object> indexStatistic = (NamedList<Object>) list.get("index");
		return (Integer) indexStatistic.get("numDocs");

		// SolrQuery query = new SolrQuery().setQuery("*.*").setRows(0);
		// QueryResponse rsp = query(query);
		// long numFound = rsp.getResults().getNumFound();
		// return new Integer((int) numFound);
	}

	/**
	 * Limits the number of result rows in the given Solr query.
	 * 
	 * @param query the Solr query
	 * @param resultRows maximum number of result rows
	 */
	public void limit(SolrQuery query, int resultRows) {
		// Solr limits the number of result rows.
		// see solrconfig.xml '<requestHandler name="standard" (...)'
		if (resultRows < 0) {
			query.setRows(getSize());
		} else {
			query.setRows(resultRows);
		}
	}

	private NamedList<Object> adminQuery() {
		SolrQuery query = new SolrQuery().setQuery("*.*").setQueryType(
				"/admin/luke").setRows(0);
		QueryResponse rsp = query(query);
		return rsp.getResponse();
	}

	private boolean setupSolrHome() {
		try {
			// create solreHome and configDir if needed
			File f = new File(confDir);
			if (!f.exists()) {
				f.mkdirs();
			}
		} catch (Exception e) {
			SokanIndexPlugin.logError("", e);
			return false;
		}

		// copy configuration file
		if (!SolrUtil.copyIfNeeded(SolrConst.FILE_CONFIG, false)) {
			return false;
		}
		// schema file
		if (!SolrUtil.copyIfNeeded(SolrConst.FILE_SCHEMA, !isCorrectSchema())) {
			return false;
		}
		// // copy configuration file
		// if (!copyIfNeeded("protwords.txt"))
		// return false;
		//
		// // copy configuration file
		// if (!copyIfNeeded("stopwords.txt"))
		// return false;
		//
		// // copy configuration file
		// if (!copyIfNeeded("synonyms.txt"))
		// return false;

		return true;
	}

	private boolean startSolrServer() {
		if (solrConfig == null) {
			solrConfig = buildSolrConfig();
		}
		if (indexSchema == null) {
			indexSchema = buildIndexSchema(solrConfig);
			if (indexSchema == null) {
				return false;
			}
		}

		coreContainer = new CoreContainer(new SolrResourceLoader(
				SolrResourceLoader.locateSolrHome()));
		CoreDescriptor dcore = new CoreDescriptor(coreContainer, "", solrConfig
				.getResourceLoader().getInstanceDir());
		dcore.setConfigName(solrConfig.getResourceName());
		dcore.setSchemaName(indexSchema.getResourceName());
		SolrCore core = new SolrCore(SolrConst.CORE_NAME, solrData, solrConfig,
				indexSchema, dcore);
		coreContainer.register(core, false);
		solrServer = new EmbeddedSolrServer(coreContainer, SolrConst.CORE_NAME);

		return true;
	}

	private IndexSchema buildIndexSchema(SolrConfig solrConfig) {
		if (solrConfig == null) {
			return null;
		}
		IndexSchema indexSchema = new IndexSchema(solrConfig,
				SolrConst.FILE_SCHEMA, null);
		return indexSchema;
	}

	private SolrConfig buildSolrConfig() {
		SolrConfig solrConfig = null;
		try {
			solrConfig = new SolrConfig(solrHome, SolrConst.FILE_CONFIG, null);
		} catch (Exception e) {
			SokanIndexPlugin.logError("", e);
		}
		return solrConfig;
	}

}
