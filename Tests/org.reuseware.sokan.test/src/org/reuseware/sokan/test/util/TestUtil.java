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
package org.reuseware.sokan.test.util;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.reuseware.sokan.ID;
import org.reuseware.sokan.IndexRow;
import org.reuseware.sokan.index.CommitCache;
import org.reuseware.sokan.index.indexer.IndexerConfiguration;
import org.reuseware.sokan.index.util.CoreUtil;
import org.reuseware.sokan.index.util.IndexUtil;
import org.reuseware.sokan.index.util.ResourceUtil;
import org.reuseware.sokan.index.util.RowUtil;
import org.reuseware.sokan.index.util.SokanConst;
import org.reuseware.sokan.index.util.StoreUtil;
import org.reuseware.sokan.test.model.FacetInstance;
import org.reuseware.sokan.test.model.ModelFactory;

public class TestUtil {
	public static final String SEPERATOR = ",";
	private static final SorterData sData = SorterData.INSTANCE;
	private static final String DATE_FORMAT_NOW = "yyyy-MM-dd HH:mm:ss,SSS";
	private static String TMP_FOLDER = "./tmp/";

	public static File getTempFolder() {
		File tmpFolder = new File(TMP_FOLDER);
		if (!tmpFolder.exists()) {
			tmpFolder.mkdir();
		}
		return tmpFolder;
	}
	
	
	public static File createProject(String name) {
		String fullPath = TMP_FOLDER + name;
		File newProject = new File(fullPath);
			
		if (!newProject.exists()) {
			newProject.mkdir();
		}
		
		return newProject;
	}

	public static File createFolder(String name, File parent,
			AbstractData data) throws IOException {
		String fullPath = parent.getCanonicalPath() + "/" + name;
		File folder = new File(fullPath);

		if (!folder.exists()) {
			folder.mkdir();
		}

		if (data == null)
			return folder;

		data.set(name, folder);
		return folder;
	}

	public static void createArtifactFile(String nameList, File parent,
			AbstractData data) throws IOException {
		if (parent == null)
			return;

		List<String> names = CoreUtil.toList(nameList, ",");
		for (String name : names) {
			File folder   = new File(parent.getCanonicalPath());
			if (!folder.exists()) {
				folder.mkdirs();
			}
			String fullPath = parent.getCanonicalPath() + "/" + name;
			File artifact = new File(fullPath);
			if (!artifact.exists()) {
				artifact.createNewFile();
				FileWriter writer = new FileWriter(artifact);
				writer.append(artifact.getName());
				
			}

			if (data == null)
				return;

			if (!data.set(name, artifact))
				System.err.println("Setting the field didn't work!");
			System.out.println(data.get(name));
			IndexUtil.INSTANCE.addArtifact(URI.createFileURI(fullPath));
		}
	}

	public static void change(File file) throws IOException {
		if (file.exists()) {
			FileWriter writer = new FileWriter(file);
			writer.append("\n" + now());
		}
		IndexUtil.INSTANCE.updateArtifact(URI.createFileURI(file.getCanonicalPath()));
	}


	public static List<Boolean> toBooleanList(String boolListString) {
		List<String> list = trimAndSplit(boolListString, SEPERATOR);
		if (list == null)
			return null;
		List<Boolean> boolList = new ArrayList<Boolean>(list.size());
		for (String boolString : list) {
			if (boolString.equals("t"))
				boolList.add(true);

			else if (boolString.equals("f"))
				boolList.add(false);

			else
				boolList.add(Boolean.parseBoolean(boolString));
		}
		return boolList;
	}

	public static List<List<IndexerConfiguration>> toIndexerConfigList(
			String configListString) {
		List<String> phases = trimAndSplit(configListString, "~");
		if (phases == null)
			return null;

		List<List<IndexerConfiguration>> multiPhase = new LinkedList<List<IndexerConfiguration>>();
		List<String> list;
		List<IndexerConfiguration> configList;

		for (String phase : phases) {
			list = trimAndSplit(phase, SEPERATOR);
			if (list == null)
				continue;

			configList = new LinkedList<IndexerConfiguration>();
			for (String configString : list) {
				configList.add(sData.getConfig(configString));
			}
			multiPhase.add(configList);
		}

		return multiPhase;
	}

	public static List<ID> toIDList(String idListString) {
		List<String> list = trimAndSplit(idListString, SEPERATOR);
		if (list == null)
			return Collections.emptyList();
		List<ID> idList = new ArrayList<ID>(list.size());

		for (String idString : list) {
			idList.add(ResourceUtil.idFrom(SokanConst.SEPERATOR + idString));
		}

		return idList;
	}

	public static List<IndexRow> toRowList(String rowListString) {
		List<String> list = trimAndSplit(rowListString, SEPERATOR);
		if (list == null)
			return null;
		List<IndexRow> rowList = new ArrayList<IndexRow>(list.size());

		String uriString = null;
		for (String idString : list) {
			idString = idString.trim();
			uriString = ResourceUtil.uriString(ResourceUtil
					.uriFrom(ResourceUtil.idFrom(idString)));
			rowList.add(RowUtil.buildIndexRow(idString, uriString, null, false));
		}

		return rowList;
	}

	public static boolean addressSameArtifacts(List<IndexRow> expected,
			List<IndexRow> actual) {

		boolean contains;
		for (IndexRow eRow : expected) {
			contains = false;
			for (IndexRow aRow : actual) {
				if (eRow.getArtifactID().equals(aRow.getArtifactID())) {
					contains = true;
					break;
				}
			}
			if (!contains)
				return false;
		}

		return true;
	}

	public static boolean equalCacheUpdate(CommitCache expected,
			CommitCache actual) {

		int check = trivialMapEqual(expected.getUpdateMap(), actual.getUpdateMap());
		switch (check) {
		case -1:
			System.out.println("EXPECTED: " + expected.getUpdateMap().keySet());
			System.out.println("ACTUL:    " + actual.getUpdateMap().keySet());
			return false;
		case 1:
			return true;
		}

		if (!CoreUtil.equal(expected.getUpdateMap().keySet(), actual.getUpdateMap().keySet()))
			return false;

		return true;
	}

	public static boolean equalList(List<?> expected, List<?> actual) {
		return actual.equals(expected);
	}

	public static void mark(File[] stores) throws IOException {
		for (File folder : stores) {
			URI folderURI = URI.createFileURI(folder.getCanonicalPath());
			
			waitForIndexingToFinish();

			if (StoreUtil.INSTANCE.isStore(folderURI))
				continue;

			if (!StoreUtil.INSTANCE.isStore(folderURI)) {
				List<String> patterns = new ArrayList<String>(1);
				patterns.add("*.*");
				StoreUtil.INSTANCE.addExternalStore(folderURI);
			}
		}
	}

	public static FacetInstance buildFacetInstance(String facetName, IndexRow row) {
		String valueString = row.getMetaData().getSingle(facetName);
		List<String> valueList = CoreUtil.toList(valueString, SEPERATOR);
		EList<String> eValues = TestUtil.adapt(valueList);

		FacetInstance inst = ModelFactory.eINSTANCE.createFacetInstance();
		inst.setFacet(facetName);
		inst.setValues(eValues);

		return inst;
	}

	private static int trivialMapEqual(Map<?, ?> expected, Map<?, ?> actual) {
		if (expected == null && actual == null)
			return 1;

		if (expected == null && actual != null && actual.size() == 0)
			return 1;

		if (actual == null && expected != null && expected.size() == 0)
			return 1;

		if (expected == null || actual == null)
			return -1;

		if (expected.keySet().size() != actual.keySet().size())
			return -1;

		return 0;
	}

	public static void waitForIndexingToFinish() {
		while(IndexUtil.INSTANCE.isIndexing()) {
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static String now() {
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT_NOW);
		return sdf.format(cal.getTime());
	}

	public static int compareDate(String timeStamp1, String timeStamp2) {
		SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT_NOW);
		try {
			Date d1 = sdf.parse(timeStamp1);
			Date d2 = sdf.parse(timeStamp2);

			if (d1.compareTo(d2) == 0) {
				return -1;
			}
			return d1.compareTo(d2);
		} catch (ParseException e) {
		}
		return 0;

	}

	private static List<String> trimAndSplit(String arg, String sep) {
		if (arg == null)
			return null;
		if (arg.startsWith("{"))
			arg = CoreUtil.trimFirstChar(arg);
		if (arg.endsWith("}"))
			arg = CoreUtil.trimLastChar(arg);
		List<String> list = CoreUtil.toList(arg, sep);
		for (String string : list) {
			string = string.trim();
		}
		return list;
	}

	public static EList<String> adapt(List<String> strings) {
		EList<String> eStrings = new BasicEList<String>(strings.size());
		eStrings.addAll(strings);
		return eStrings;
	}
	
	public static URI fileAsURI(File file) throws IOException {
		return URI.createFileURI(file.getCanonicalPath());
	}
}
