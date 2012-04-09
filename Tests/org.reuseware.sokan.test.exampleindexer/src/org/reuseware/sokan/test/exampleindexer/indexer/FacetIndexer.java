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
package org.reuseware.sokan.test.exampleindexer.indexer;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.reuseware.sokan.ID;
import org.reuseware.sokan.IndexMetaData;
import org.reuseware.sokan.index.DependencyMap;
import org.reuseware.sokan.index.indexer.Indexer;
import org.reuseware.sokan.index.util.ResourceUtil;

public class FacetIndexer implements Indexer {
	private static final String DATE_FORMAT_NOW = "yyyy-MM-dd HH:mm:ss";

	// private static final String INDEXER_REUSE =
	// "org.reuseware.sokan.index.eg.reuse";

	public void createIndex(URI artifactURI, IndexMetaData part,
			ResourceSet resourceSet) {
		// System.out.println("FACET INDEXER!");

		part.putSingle("Color", "Blue");
		part.putSingle("Size", "Small");
		part.putSingle("Name", artifactURI.lastSegment());
		part.putSingle("Time", now());
	}

	public void getDependent(ID artifactID, DependencyMap depMap) {
		if (ResourceUtil.idString(artifactID).endsWith("cimFacets.fdef")) {
			depMap.putAll(dependsOn(artifactID, "Person.java"));
			return;
		}

		if (ResourceUtil.idString(artifactID).endsWith("Person.java")) {
			depMap.putAll(dependsOn(artifactID, "Student.java"));
			return;
		}

		if (ResourceUtil.idString(artifactID).endsWith("test.txt")) {
			Map<ID, Set<String>> deps = dependsOn(artifactID, "child.txt");
			if (deps == null)
				deps = dependsOn(artifactID, "child2.txt");
			else
				deps.putAll(dependsOn(artifactID, "child2.txt"));
			depMap.putAll(deps);
			return;
		}
	}

	private Map<ID, Set<String>> dependsOn(ID artifactID, String fileName) {
		Map<ID, Set<String>> dependencies = new HashMap<ID, Set<String>>();
		return dependencies;
	}

	public String now() {
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT_NOW);
		return sdf.format(cal.getTime());
	}
}
