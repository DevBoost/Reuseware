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
package org.reuseware.sokan.test.index.indexer;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.reuseware.sokan.ID;
import org.reuseware.sokan.IndexMetaData;
import org.reuseware.sokan.index.DependencyMap;
import org.reuseware.sokan.index.indexer.Indexer;

public class MultiValueIndexer implements Indexer {

	public static final String MULTI = "multiValueTest";

	public void createIndex(URI artifactURI, IndexMetaData data,
			ResourceSet resourceSet) {

		String name = artifactURI.lastSegment();
		data.putMultiple(MULTI, String.valueOf(name.charAt(0)));
		if (name.contains("5"))
			data.putMultiple(MULTI, "5");
		if (name.contains("0"))
			data.putMultiple(MULTI, "0");
		
		String multiValueField = "addMulti";
		List<String> list = new ArrayList<String>(3);
		list.add("multi1");
		list.add("multi2");
		list.add("multi3");
		data.addMultiple(multiValueField, list);
	}

	public void getDependent(ID artifactID, DependencyMap depMap) {
		// this indexer doesn't maintain any dependencies
	}
}
