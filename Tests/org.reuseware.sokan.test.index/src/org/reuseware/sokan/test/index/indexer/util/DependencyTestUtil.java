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
package org.reuseware.sokan.test.index.indexer.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.reuseware.sokan.ID;
import org.reuseware.sokan.index.CommitCache;
import org.reuseware.sokan.index.indexer.DependencyManager;
import org.reuseware.sokan.index.indexer.Indexer;
import org.reuseware.sokan.index.indexer.IndexerManager;
import org.reuseware.sokan.index.persister.PersistencyManager;
import org.reuseware.sokan.index.util.CoreUtil;
import org.reuseware.sokan.index.util.ResourceUtil;
import org.reuseware.sokan.test.index.indexer.DependencyIndexer;
import org.reuseware.sokan.test.util.TestData;
import org.reuseware.sokan.test.util.TestUtil;

public class DependencyTestUtil extends TestUtil{

	private static Indexer dependencyIndexer = new DependencyIndexer();
	
	public static void fillDependencies(TestData data) {
		// trivial
		data.fLvlDep0 = invokeDependencyCalculator(null);
		data.fLvlDep1 = invokeDependencyCalculator("A1");
		data.fLvlDep2 = invokeDependencyCalculator("A2");

		// list
		data.fLvlDep3 = invokeDependencyCalculator("A3");
		data.fLvlDep4 = invokeDependencyCalculator("A4");
		data.fLvlDep5 = invokeDependencyCalculator("A5");
		data.fLvlDep6 = invokeDependencyCalculator("A6");
		data.fLvlDep7 = invokeDependencyCalculator("A7");
		data.fLvlDep8 = invokeDependencyCalculator("A8");
		data.fLvlDep9 = invokeDependencyCalculator("A9");

		// binaryList
		data.fLvlDep10 = invokeDependencyCalculator("A10");
		data.fLvlDep11 = invokeDependencyCalculator("A11");
		data.fLvlDep12 = invokeDependencyCalculator("A12");
		data.fLvlDep13 = invokeDependencyCalculator("A13");
		data.fLvlDep14 = invokeDependencyCalculator("A14");
		data.fLvlDep15 = invokeDependencyCalculator("A15");
		data.fLvlDep16 = invokeDependencyCalculator("A16");

		// binaryTree
		data.fLvlDep17 = invokeDependencyCalculator("A17");
		data.fLvlDep18 = invokeDependencyCalculator("A18");
		data.fLvlDep19 = invokeDependencyCalculator("A19");
		data.fLvlDep20 = invokeDependencyCalculator("A20");
		data.fLvlDep21 = invokeDependencyCalculator("A21");
		data.fLvlDep22 = invokeDependencyCalculator("A22");
		data.fLvlDep23 = invokeDependencyCalculator("A23");
		data.fLvlDep24 = invokeDependencyCalculator("A24");

		// complexPositive
		data.fLvlDep25 = invokeDependencyCalculator("A25");
		data.fLvlDep26 = invokeDependencyCalculator("A26");
		data.fLvlDep27 = invokeDependencyCalculator("A27");
		data.fLvlDep28 = invokeDependencyCalculator("A28");
		data.fLvlDep29 = invokeDependencyCalculator("A29");
		data.fLvlDep30 = invokeDependencyCalculator("A30");
		data.fLvlDep31 = invokeDependencyCalculator("A31");

		// complexNegative
		data.fLvlDep32 = invokeDependencyCalculator("A32");
		data.fLvlDep33 = invokeDependencyCalculator("A33");
		data.fLvlDep34 = invokeDependencyCalculator("A34");
		data.fLvlDep35 = invokeDependencyCalculator("A35");

		// dualTrivial
		data.fLvlDep36 = invokeDependencyCalculator("A36_1,A36_2");
		data.fLvlDep37 = invokeDependencyCalculator("A37_1,A37_2");
		data.fLvlDep38 = invokeDependencyCalculator("A38_1,A38_2");

		// dualNormal
		data.fLvlDep39 = invokeDependencyCalculator("A39_1,A39_2");
		data.fLvlDep40 = invokeDependencyCalculator("A40_1,A40_2");
		data.fLvlDep41 = invokeDependencyCalculator("A41_1,A41_2");
		data.fLvlDep42 = invokeDependencyCalculator("A42_1,A42_2");
		data.fLvlDep43 = invokeDependencyCalculator("A43_1,A43_2");
		data.fLvlDep44 = invokeDependencyCalculator("A44_1,A44_2");
		data.fLvlDep45 = invokeDependencyCalculator("A45_1,A45_2");

		// dualComplex
		data.fLvlDep46 = invokeDependencyCalculator("A46_1,A46_2");
		data.fLvlDep47 = invokeDependencyCalculator("A47_1,A47_2");
		data.fLvlDep48 = invokeDependencyCalculator("A48_1,A48_2");

		// multi
		data.fLvlDep49 = invokeDependencyCalculator("A49_1,A49_2,A49_3");
		data.fLvlDep50 = invokeDependencyCalculator("A50_1,A50_2,A50_3,A50_4");
	}



	public static CommitCache invokeDependencyCalculator(String idListString) {
		IndexerManager tempIndexerManager = new IndexerManager(
				new PersistencyManager());
		DependencyManager tempDependencyManager = new DependencyManager(tempIndexerManager);
		List<ID> artifactIDs = TestUtil.toIDList(idListString);
		CommitCache tempCache = new CommitCache();
		List<Indexer> indexerList = Collections.singletonList(dependencyIndexer);
		
		for(ID updatedID : artifactIDs) {
			tempCache.getUpdateMap().put(updatedID, indexerList);
		}

		tempDependencyManager.calculateDependenciesOfUpdatedArtifacts(
				indexerList, tempCache);
		
		return tempCache;
	}
	
	public static Map<ID, List<Indexer>> dependsOn(String dependecyString) {
		if (dependecyString == null || dependecyString.equals(""))
			return Collections.emptyMap();

		if (dependecyString.contains(SEPERATOR))
			return moreDeps(CoreUtil.toList(dependecyString, SEPERATOR));

		ID childID = ResourceUtil.idFrom(dependecyString);

		List<Indexer> cleaningIndexer = new ArrayList<Indexer>();
		cleaningIndexer.add(dependencyIndexer);

		Map<ID, List<Indexer>> dependencies = new HashMap<ID, List<Indexer>>();
		dependencies.put(childID, cleaningIndexer);

		return dependencies;
	}

	
	private static Map<ID, List<Indexer>> moreDeps(List<String> dependencyList) {
		Map<ID, List<Indexer>> dependencies = new HashMap<ID, List<Indexer>>(
				dependencyList.size());

		ID childID;
		List<Indexer> cleaningIndexer;
		for (String string : dependencyList) {
			childID = ResourceUtil.idFrom(string);
			cleaningIndexer = new ArrayList<Indexer>();
			cleaningIndexer.add(dependencyIndexer);

			dependencies.put(childID, cleaningIndexer);
		}

		return dependencies;
	}

	public static CommitCache childrenOutput(
			Map<String, String> dependencyMap) {

		if (dependencyMap == null)
			return null;

		CommitCache cache = new CommitCache();
		for (Entry<String, String> dep : dependencyMap.entrySet()) {
			cache.getUpdateMap().putAll(childrenOutput(dep.getKey(), dep.getValue()).getUpdateMap());
		}

		return cache;
	}

	public static CommitCache childrenOutput(String parent,
			String dependecyString) {
		CommitCache cache = new CommitCache();
		cache.getUpdateMap().put(ResourceUtil.idFrom(parent), 
				Collections.singletonList(dependencyIndexer));
		
		if (dependecyString == null || dependecyString.equals(""))
			return cache;

		if (dependecyString.contains(SEPERATOR))
			cache.getUpdateMap().putAll(moreDeps(CoreUtil.toList(
					dependecyString, SEPERATOR)));
		else
			cache.getUpdateMap().putAll(dependsOn(dependecyString));

		return cache;
	}
}
