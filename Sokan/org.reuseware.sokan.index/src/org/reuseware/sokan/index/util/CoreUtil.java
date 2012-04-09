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
package org.reuseware.sokan.index.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.reuseware.sokan.ID;
import org.reuseware.sokan.IndexRow;
import org.reuseware.sokan.index.SokanIndexPlugin;
import org.reuseware.sokan.index.emodeler.DefaultEModeler;
import org.reuseware.sokan.index.emodeler.EModeler;
import org.reuseware.sokan.index.indexer.Indexer;
import org.reuseware.sokan.index.indexer.IndexerConfiguration;

/**
 * Common collection of utility methods used in Sokan.
 */
public final class CoreUtil {
	
	private CoreUtil() { }
	
	private static List<IConfigurationElement> findExtensionConfigs(
			String extensionPoint, String extensionName) {

		if (!Platform.isRunning()) {
			return Collections.emptyList();
		}
		
		IConfigurationElement[] config = Platform.getExtensionRegistry()
				.getConfigurationElementsFor(extensionPoint);

		List<IConfigurationElement> back = new ArrayList<IConfigurationElement>(
				config.length);

		for (IConfigurationElement confElem : config) {
			if (confElem.getName().equals(extensionName)) {
				back.add(confElem);
			}
		}

		return back;
	}

	/**
	 * @return all registered indexers.
	 */
	public static List<IndexerConfiguration> findIndexer() {
		List<IConfigurationElement> configs = 
			findExtensionConfigs(
					SokanConst.EXP_INDEX_ID, SokanConst.EXT_INDEXER);

		List<IndexerConfiguration> allConfigs = 
			new ArrayList<IndexerConfiguration>();
		
		for (IConfigurationElement elem : configs) {
			String id = elem.getAttribute("id");
			Indexer indexer = null;
			try {
				indexer = (Indexer) elem.createExecutableExtension("class");
			} catch (CoreException e) {
				SokanIndexPlugin.logError("Error loading indexer '" + id + "'", e);
			}
			
			List<String> dependencies = new ArrayList<String>();
			for (IConfigurationElement childElem : elem.getChildren("dependsOn")) {
				dependencies.add(childElem.getAttribute("indexerID"));
			}
			allConfigs.add(new IndexerConfiguration(
					indexer, id, dependencies));
		}
		
		return allConfigs;
	}
	
	/**
	 * @return all registered load options.
	 */
	public static Map<String, Object> findLoadOptions() {
		List<IConfigurationElement> configs = CoreUtil.findExtensionConfigs(
				SokanConst.EXP_INDEX_ID, SokanConst.EXT_LOAD_OPTION);

		Map<String, Object> loadOptions = new LinkedHashMap<String, Object>();
		for (IConfigurationElement elem : configs) {
			String key = elem.getAttribute("key");
			String valueString = elem.getAttribute("value");
			Object value = valueString;
			if (valueString.trim().toUpperCase().equals("TRUE")) {
				value = Boolean.TRUE;
			}
			if (valueString.trim().toUpperCase().equals("FALSE")) {
				value = Boolean.FALSE;
			}
			loadOptions.put(key, value);
		}
		return loadOptions;
	}
	
	/**
	 * @return all registered EModelers.
	 */
	public static List<EModeler> findEModelers() {
		List<EModeler> modelers = new ArrayList<EModeler>();
		
		List<IConfigurationElement> configs = findExtensionConfigs(
				SokanConst.EXP_INDEX_ID, SokanConst.EXT_EMODELER);

		
		for (IConfigurationElement config : configs) {
			try {
				modelers.add((EModeler) config.createExecutableExtension("class"));
			} catch (Exception e) {
				SokanIndexPlugin.logError("Cannot instantiate EModeler: "
						+ config.getAttribute("class"), e);
			}
		}

		modelers.add(new DefaultEModeler());
		
		return modelers;
	}

	/**
	 * Prints the information contained in a row into a 
	 * human readable string representation.
	 * 
	 * @param row the row
	 * @return the information from the row as string
	 */
	public static String print(IndexRow row) {
		StringBuffer s = new StringBuffer();
		
		if (row == null) {
			s.append("null\n");
			return s.toString();
		}

		s.append("\n");
		s.append("*************************\n");
		s.append("ID: "
				+ ResourceUtil.idString(row.getArtifactID()) + "\n");
		s.append("PhysicalURI: " + row.getPhyURI() + "\n");
		s.append("Generated: " + row.isGenerated() + "\n");

		String line;
		Map<String, String> single;
		single = row.getMetaData().getSingleValueFields();
		if (single.size() > 0) {
			s.append("\n");
			s.append("~~~ SingleValueFields ~~~\n");
		}
		for (Entry<String, String> entry : single.entrySet()) {
			line = entry.getKey() + " :: " + entry.getValue();
			s.append(line + "\n");
		}

		Map<String, EList<String>> multi;
		multi = row.getMetaData().getMultiValueFields();
		if (multi.size() > 0) {
			s.append("\n");
			s.append("~~~ MultiValueFields ~~~\n");
		}
		for (Entry<String, EList<String>> entry : multi.entrySet()) {
			line = entry.getKey() + " :: " + toString(entry.getValue());
			s.append(line + "\n");
		}
		s.append("*************************\n");
		
		return s.toString();
	}

	/**
	 * @param listString a string representing a list of strings
	 * @param sep the separator used in the list string
	 * @return the list of strings
	 */
	public static List<String> toList(String listString, String sep) {
		List<String> back = new LinkedList<String>();

		if (listString == null || sep == null || listString.equals("")
				|| sep.equals("")) {
			return back;
		}

		if (sep.equals(SokanConst.SEPERATOR)) {
			sep = "\\" + SokanConst.SEPERATOR;
		}
		
		String[] segments;
		try {
			segments = listString.split(sep);
		} catch (Exception e) {
			SokanIndexPlugin.logError("", e);
			return back;
		}
		for (String seg : segments) {
			back.add(seg);
		}

		return back;
	}

	/**
	 * @param list the list
	 * @return the list as comma separated string
	 */
	public static String toString(List<?> list) {
		if (list == null) {
			return "null";
		}
		String listStr = "";
		for (Object obj : list) {
			listStr += obj.toString() + ", ";
		}
		listStr = trimLastSeperator(listStr, ", ");
		return listStr;
	}

	/**
	 * @param list the list
	 * @param sep the separator
	 * @return the list as string using the given separator
	 */
	public static String toListString(List<String> list, String sep) {
		String back = "";
		for (String elem : list) {
			back += elem + sep;
		}
		return CoreUtil.trimLastSeperator(back, sep);
	}

	/**
	 * @param arg the string
	 * @return the string with the first character trimmed
	 */
	public static String trimFirstChar(String arg) {
		return arg.substring(1, arg.length());
	}

	/**
	 * @param arg the string
	 * @return the string with the last character trimmed
	 */
	public static String trimLastChar(String arg) {
		return arg.substring(0, arg.length() - 1);
	}

	/**
	 * @param arg the string
	 * @param sep the separator used in the string
	 * @return the string with the separator trimmed from the end
	 */
	public static String trimLastSeperator(String arg, String sep) {
		if (arg == null || sep == null || arg.equals("") || sep.equals("")) {
			return "";
		}
		return arg.substring(0, arg.lastIndexOf(sep));
	}

	/**
	 * @param arg the string
	 * @param suffix the suffix to be trimmed from the string 
	 * @return the trimmed string
	 */
	public static String trimLastString(String arg, String suffix) {
		try {
			return arg.substring(0, arg.length() - suffix.length());
		} catch (IndexOutOfBoundsException e) {
			return arg;
		}
	}

	/**
	 * @return the current time
	 */
	public static String now() {
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat(SokanConst.DATE_FORMAT_NOW);
		return sdf.format(cal.getTime());
	}

	/**
	 * Compares the given collections.
	 * 
	 * @param col1 collection 1
	 * @param col2 collection 2
	 * @return comparison result
	 */
	public static boolean equal(Collection<?> col1, Collection<?> col2) {
		int check = trivialCollectionEqual(col1, col2);
		switch (check) {
		case -1:
			return false;
		case 1:
			return true;
		default:
			//nothing
		}

		//TODO #1469: does not work if same element is contained twice
		boolean contains;
		for (Object eObj : col1) {
			contains = false;
			for (Object aObj : col2) {
				if (eObj.equals(aObj)) {
					contains = true;
					break;
				}
			}
			if (!contains) {
				return false;
			}
		}

		return true;
	}

	private static int trivialCollectionEqual(Collection<?> expected,
			Collection<?> actual) {
		if (expected == null && actual == null) {
			return 1;
		}
		if (expected == null && actual != null) {
			return -1;
		}
		if (actual == null && expected != null) {
			return -1;
		}
		if (expected == null || actual == null) {
			return -1;
		}
		if (expected.size() != actual.size()) {
			return -1;
		}
		if (expected.size() == 0 && actual.size() == 0) {
			return 1;
		}
		return 0;
	}

	/**
	 * Produces an error about a cycle in the dependencies between the
	 * given artifacts.
	 * 
	 * @param artifactID ID of the artifact of concern
	 * @param cycles IDs of all artifacts involved in the cycle
	 */
	public static void cycleWarning(ID artifactID, List<List<ID>> cycles) {
		if (artifactID == null || cycles == null) {
			return;
		}
		StringBuffer message = new StringBuffer();
		
		message.append("ERROR! Artifact with following "
						+ "id is part of a cycle: "
						+ ResourceUtil.idString(artifactID) + "\n");
		message.append("Artifacts involved: ");
		String cycleStr = "";
		for (List<ID> cycle : cycles) {
			if (cycle.contains(artifactID)) {
				for (ID id : cycle) {
					cycleStr += ResourceUtil.idString(id) + ", ";
				}
			}
		}
		cycleStr = CoreUtil.trimLastSeperator(cycleStr, ", ");
		message.append(cycleStr + "\n");
		
		SokanIndexPlugin.logError(message.toString(), null);
	}

	/**
	 * Adapts a List to an EList.
	 * 
	 * @param <T> type of elements in the list.
	 * @param list the list to adapt
	 * @return the list as EList
	 */
	public static <T> EList<T> adapt(List<T> list) {
		EList<T> eList = new BasicEList<T>();
		eList.addAll(list);
		return eList;
	}

	/**
	 * Converts the given time stamp into a date object.
	 * 
	 * @param timeStamp the time stamp as string
	 * @return the date object
	 */
	public static Date toDate(String timeStamp) {
		if (timeStamp == null || timeStamp.equals("")) {
			return null;
		}
		SimpleDateFormat sdf = new SimpleDateFormat(SokanConst.DATE_FORMAT_NOW);
		try {
			Date date = sdf.parse(timeStamp);
			return date;
		} catch (ParseException e) {
			return null;
		}
	}

}
