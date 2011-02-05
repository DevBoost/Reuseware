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
package org.reuseware.sokan.index.solr;

import static org.reuseware.sokan.index.solr.SolrConst.ALL_SYS_FIELDS;
import static org.reuseware.sokan.index.solr.SolrConst.SYS_FIELD_GENERATED;
import static org.reuseware.sokan.index.solr.SolrConst.SYS_FIELD_ID;
import static org.reuseware.sokan.index.solr.SolrConst.SYS_FIELD_PHY_URI;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.apache.solr.common.SolrDocument;
import org.apache.solr.common.SolrDocumentList;
import org.apache.solr.common.SolrInputDocument;
import org.apache.solr.schema.IndexSchema;
import org.apache.solr.schema.SchemaField;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.osgi.framework.Bundle;
import org.reuseware.sokan.ID;
import org.reuseware.sokan.IndexMetaData;
import org.reuseware.sokan.IndexRow;
import org.reuseware.sokan.index.SokanIndexPlugin;
import org.reuseware.sokan.index.util.ResourceUtil;
import org.reuseware.sokan.index.util.RowUtil;

/**
 * Utility class to work with the Solr index.
 */
public final class SolrUtil {
	
	private SolrUtil() { }
	
	private static String solrHome;
	private static String confDir;
	private static String solrData;

	/**
	 * Returns the field that is identified by the given value.
	 * 
	 * @param value the value
	 * @param fields list of fields to consider
	 * @return the identified field
	 */
	public static String adaptField(String value, Set<String> fields) {
		if (value == null || value.equals("")) {
			return value;
		}
		if (isSystemField(value)) {
			return value;
		}
		String test;
		for (String field : fields) {
			test = trimSuffix(field);
			if (value.equals(test)) {
				return field;
			}
		}

		return null;
	}

	/**
	 * @param field the field
	 * @return true if the field is a predefined field 
	 */
	public static boolean isSystemField(String field) {
		return ALL_SYS_FIELDS.contains(field);
	}

	/**
	 * Trims the suffix of the given field.
	 * 
	 * @param solrField the field
	 * @return the trimmed field
	 */
	public static String trimSuffix(String solrField) {
		int trim = 0;

		if (solrField.endsWith(SolrConst.SUFFIX_MULTI)) {
			trim = SolrConst.SUFFIX_MULTI.length();
		} else if (solrField.endsWith(SolrConst.SUFFIX_SINGLE)) {
			trim = SolrConst.SUFFIX_SINGLE.length();
		}
		return solrField.substring(0, solrField.length() - trim);
	}

	/**
	 * Converts the given Solr documents to index row objects.
	 * 
	 * @param docs the Solr documents
	 * @return the index rows
	 */
	public static List<IndexRow> toIndexRows(SolrDocumentList docs) {
		if (docs == null) {
			return null;
		}
		List<IndexRow> rows = new ArrayList<IndexRow>(docs.size());
		String idString;
		String phyURI;
		boolean isGenerated;
		IndexMetaData metaData;

		for (SolrDocument doc : docs) {
			// extract system index fields: actifactID, phyURI, dirty
			idString = (String) doc.getFieldValue(SYS_FIELD_ID);
			phyURI = (String) doc.getFieldValue(SYS_FIELD_PHY_URI);
			Object generated = doc.getFieldValue(SYS_FIELD_GENERATED);
			isGenerated = generated == null ? false : (Boolean) generated;

			// extract dynamic meta data
			metaData = RowUtil.buildMetaData();
			String key;
			for (Entry<String, Object> entry : doc) {
				key = entry.getKey();
				if (SolrUtil.isSystemField(key)) {
					continue;
				}
				if (key.endsWith(SolrConst.SUFFIX_MULTI)) {
					metaData.putMultiple(SolrUtil.trimSuffix(key), toValueList(
							doc, entry.getKey()));
				} else {
					metaData.putSingle(SolrUtil.trimSuffix(key), (String) entry
							.getValue());
				}
			}

			rows.add(RowUtil.buildIndexRow(idString, phyURI,
					metaData, isGenerated));
		}

		return rows;
	}

	/**
	 * Converts the list of artifact IDs to a list of
	 * artifact IDs in string representation.
	 * 
	 * @param artifactIDs the artifact IDs
	 * @return list of IDs as strings
	 */
	public static List<String> toStringList(List<ID> artifactIDs) {
		List<String> uniqueFields = new ArrayList<String>(artifactIDs.size());
		String field;

		for (ID id : artifactIDs) {
			field = ResourceUtil.idString(id);
			uniqueFields.add(field);
		}

		return uniqueFields;
	}

	/**
	 * Converts the given row elements to Solr input document objects.
	 * 
	 * @param newRows the newly created rows to convert
	 * @return list of Solr input documents
	 */
	public static List<SolrInputDocument> toSolrDocs(List<IndexRow> newRows) {
		List<SolrInputDocument> docs = new ArrayList<SolrInputDocument>(newRows
				.size());
		SolrInputDocument in;

		for (IndexRow row : newRows) {
			in = new SolrInputDocument();
			// Sokan system fields
			in.addField(SYS_FIELD_ID, ResourceUtil
					.idString(row.getArtifactID()));
			in.addField(SYS_FIELD_GENERATED, row.isGenerated());
			in.addField(SYS_FIELD_PHY_URI, row.getPhyURI());

			// dynamic user data
			IndexMetaData metaData = row.getMetaData();
			if (metaData != null && !metaData.isEmpty()) {
				// single-value fields
				for (Entry<String, String> pair : metaData
						.getSingleValueFields().entrySet()) {
					in.addField(pair.getKey() + SolrConst.SUFFIX_SINGLE, pair
							.getValue());
				}

				// multi-value fields
				for (Entry<String, EList<String>> pair : metaData
						.getMultiValueFields().entrySet()) {
					in.addField(pair.getKey() + SolrConst.SUFFIX_MULTI, pair
							.getValue());
				}
			}

			docs.add(in);
		}

		return docs;
	}

	/**
	 * Configures Solr's logger. 
	 * 
	 * @param level the logging level
	 */
	public static void configureLogger(Level level) {
		Logger log = Logger.getLogger("");
		log = Logger.getLogger("org.apache.solr");
		// log.setUseParentHandlers(false);
		log.setLevel(level);
	}

	/**
	 * Prepares a query string by correct escape characters.
	 * 
	 * @param string the unprepared string
	 * @return the prepared string
	 */
	public static String prepareForQuery(String string) {
		return string.replaceAll("\\\\", "\\\\\\\\");
	}

	/**
	 * Copies the given field if required.
	 * 
	 * @param inputFile the input field
	 * @param force true to force the copying
	 * @return true if the copying was successful
	 */
	public static boolean copyIfNeeded(String inputFile, boolean force) {
		if (inputFile == null) {
			return false;
		}
		File solrFile = new File(getConfigurationDir() + File.separator
				+ inputFile);
		try {
			if (solrFile.exists() && !force) {
				return true;
			}
		} catch (SecurityException e) {
			SokanIndexPlugin.logError("", e);
			return false;
		}

		InputStream in = null;
		FileOutputStream out = null;

		try {
			if (Platform.isRunning()) {
		 		Bundle bundle = Platform.getBundle(SolrConst.PLUGIN_ID);
				IPath path = new Path("conf" + File.separator + inputFile);
				in = FileLocator.find(bundle, path, null).openStream();
			} else {
				in = SolrUtil.class.getResourceAsStream("../../../../../" + inputFile);
			}

			out = new FileOutputStream(solrFile, false);

			byte[] buffer = new byte[0xFFFF];
			for (int len; (len = in.read(buffer)) != -1;) {
				out.write(buffer, 0, len);
			}
		} catch (IOException e1) {
			SokanIndexPlugin.logError("", e1);
			return false;
		} finally {
			if (in != null) {
				try {
					in.close();
				} catch (IOException e) {
					SokanIndexPlugin.logError("", e);
					return false;
				}
			}
			if (out != null) {
				try {
					out.close();
				} catch (IOException e) {
					SokanIndexPlugin.logError("", e);
					return false;
				}
			}
		}

		return true;
	}

	/**
	 * @return the Solr configuration directory
	 */
	public static String getConfigurationDir() {
		if (confDir != null) {
			return confDir;
		}
		confDir = getSolrHome() + File.separator + "conf";

		return confDir;
	}

	/**
	 * @return the Solr data directory
	 */
	public static String getDataDir() {
		if (solrData != null) {
			return solrData;
		}
		solrData = getSolrHome() + File.separator + "data";

		return solrData;
	}

	/**
	 * @return the Solr home directory
	 */
	public static String getSolrHome() {
		if (solrHome != null) {
			return solrHome;
		}
		if (Platform.isRunning()) {
			solrHome = Platform.getLocation().toOSString();
		} else {
			solrHome = ".";
		}
		
		solrHome += File.separator + ".metadata" + File.separator + ".plugins"
				+ File.separator + "org.reuseware.sokan.index.solr"
				+ File.separator + ".solr_home";

		return solrHome;
	}

	private static EList<String> toValueList(SolrDocument doc, String key) {
		Collection<Object> temp = doc.getFieldValues(key);
		EList<String> valueList = new BasicEList<String>(temp.size());
		for (Object obj : temp) {
			String value = (String) obj;
			if (value == null || value.equals("")) {
				continue;
			}
			valueList.add(value);
		}

		return valueList;
	}

	/**
	 * Checks if the given Solr schema is well formed.
	 * 
	 * @param schema the schema
	 * @return true if the schema is well formed
	 */
	public static boolean wellFormed(IndexSchema schema) {
		Set<String> inSchema = new HashSet<String>();
		for (Entry<String, SchemaField> entry : schema.getFields()
				.entrySet()) {
			if (ALL_SYS_FIELDS.contains(entry.getKey())) {
				inSchema.add(entry.getKey());
			}
		}
		if (ALL_SYS_FIELDS.size() == inSchema.size()) {
			return true;
		}
		return false;
	}
	
	/**
	 * @param schema the Solr schema
	 * @return all fields defined in the schema
	 */
	public static Set<String> extractFields(IndexSchema schema) {
		return schema.getFields().keySet();
	}
}
