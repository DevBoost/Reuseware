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
package org.reuseware.sokan.test.index.tests;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;
import org.reuseware.sokan.index.CommitCache;
import org.reuseware.sokan.test.index.indexer.util.DependencyTestUtil;
import org.reuseware.sokan.test.util.TestData;



public class DependencyManagerTestCase {
	private static final TestData data = TestData.INSTANCE;

	@Before
	public void setUp() throws IOException {
		DependencyTestUtil.fillDependencies(data);
	}
	
	@Test
	public void getTrivial() {
		CommitCache expected = new CommitCache();

		// 0
		assertTrue(data.fLvlDep0.getUpdateMap().isEmpty());

		// 1
		expected = DependencyTestUtil.childrenOutput("A1", null);
		assertTrue(DependencyTestUtil.equalCacheUpdate(expected, data.fLvlDep1));

		// 2
		expected = DependencyTestUtil.childrenOutput("A2", "A2");
		assertTrue(DependencyTestUtil.equalCacheUpdate(expected, data.fLvlDep2));
	}

	@Test
	public void getList() {
		CommitCache expected = null;

		// 3
		expected = DependencyTestUtil.childrenOutput("A3", "B3");
		assertTrue(DependencyTestUtil.equalCacheUpdate(expected, data.fLvlDep3));

		// 4
		expected = DependencyTestUtil.childrenOutput("A4", "B4");
		assertTrue(DependencyTestUtil.equalCacheUpdate(expected, data.fLvlDep4));

		// 5
		expected = DependencyTestUtil.childrenOutput("A5", "B5");
		assertTrue(DependencyTestUtil.equalCacheUpdate(expected, data.fLvlDep5));

		// 6
		expected = DependencyTestUtil.childrenOutput("A6", "B6");
		assertTrue(DependencyTestUtil.equalCacheUpdate(expected, data.fLvlDep6));

		// 7
		expected = DependencyTestUtil.childrenOutput("A7", "B7");
		assertTrue(DependencyTestUtil.equalCacheUpdate(expected, data.fLvlDep7));

		// 8
		expected = DependencyTestUtil.childrenOutput("A8", "B8");
		assertTrue(DependencyTestUtil.equalCacheUpdate(expected, data.fLvlDep8));

		// 9
		expected = DependencyTestUtil.childrenOutput("A9", "B9");
		assertTrue(DependencyTestUtil.equalCacheUpdate(expected, data.fLvlDep9));
	}

	@Test
	public void getBinaryList() {
		CommitCache expected = null;

		// 10
		expected = DependencyTestUtil.childrenOutput("A10", "A10");
		assertTrue(DependencyTestUtil.equalCacheUpdate(expected, data.fLvlDep10));

		// 11
		expected = DependencyTestUtil.childrenOutput("A11", "A11,B11");
		assertTrue(DependencyTestUtil.equalCacheUpdate(expected, data.fLvlDep11));

		// 12
		expected = DependencyTestUtil.childrenOutput("A12", "B12");
		assertTrue(DependencyTestUtil.equalCacheUpdate(expected, data.fLvlDep12));

		// 13
		expected = DependencyTestUtil.childrenOutput("A13", "B13");
		assertTrue(DependencyTestUtil.equalCacheUpdate(expected, data.fLvlDep13));

		// 14
		expected = DependencyTestUtil.childrenOutput("A14", "B14");
		assertTrue(DependencyTestUtil.equalCacheUpdate(expected, data.fLvlDep14));

		// 15
		expected = DependencyTestUtil.childrenOutput("A15", "B15");
		assertTrue(DependencyTestUtil.equalCacheUpdate(expected, data.fLvlDep15));

		// 16
		expected = DependencyTestUtil.childrenOutput("A16", "B16");
		assertTrue(DependencyTestUtil.equalCacheUpdate(expected, data.fLvlDep16));
	}

	@Test
	public void getBinaryTree() {
		CommitCache expected = null;

		// 17
		expected = DependencyTestUtil.childrenOutput("A17", "B17,C17");
		assertTrue(DependencyTestUtil.equalCacheUpdate(expected, data.fLvlDep17));

		// 18
		expected = DependencyTestUtil.childrenOutput("A18", "B18,C18");
		assertTrue(DependencyTestUtil.equalCacheUpdate(expected, data.fLvlDep18));

		// 19
		expected = DependencyTestUtil.childrenOutput("A19", "B19,C19");
		assertTrue(DependencyTestUtil.equalCacheUpdate(expected, data.fLvlDep19));

		// 20
		expected = DependencyTestUtil.childrenOutput("A20", "B20,C20");
		assertTrue(DependencyTestUtil.equalCacheUpdate(expected, data.fLvlDep20));

		// 21
		expected = DependencyTestUtil.childrenOutput("A21", "B21,C21");
		assertTrue(DependencyTestUtil.equalCacheUpdate(expected, data.fLvlDep21));

		// 22
		expected = DependencyTestUtil.childrenOutput("A22", "B22,C22");
		assertTrue(DependencyTestUtil.equalCacheUpdate(expected, data.fLvlDep22));

		// 23
		expected = DependencyTestUtil.childrenOutput("A23", "B23,C23");
		assertTrue(DependencyTestUtil.equalCacheUpdate(expected, data.fLvlDep23));

		// 24
		expected = DependencyTestUtil.childrenOutput("A24", "B24,C24");
		assertTrue(DependencyTestUtil.equalCacheUpdate(expected, data.fLvlDep24));
	}

	@Test
	public void getComplexPositive() {
		CommitCache expected = null;

		// 25
		expected = DependencyTestUtil.childrenOutput("A25", "B25,C25,D25");
		assertTrue(DependencyTestUtil.equalCacheUpdate(expected, data.fLvlDep25));

		// 26
		expected = DependencyTestUtil.childrenOutput("A26", "B26,C26,D26");
		assertTrue(DependencyTestUtil.equalCacheUpdate(expected, data.fLvlDep26));

		// 27
		expected = DependencyTestUtil.childrenOutput("A27", "B27,C27,D27");
		assertTrue(DependencyTestUtil.equalCacheUpdate(expected, data.fLvlDep27));

		// 28
		expected = DependencyTestUtil.childrenOutput("A28", "B28,C28");
		assertTrue(DependencyTestUtil.equalCacheUpdate(expected, data.fLvlDep28));

		// 29
		expected = DependencyTestUtil.childrenOutput("A29", "B29,C29");
		assertTrue(DependencyTestUtil.equalCacheUpdate(expected, data.fLvlDep29));

		// 30
		expected = DependencyTestUtil.childrenOutput("A30", "B30,C30");
		assertTrue(DependencyTestUtil.equalCacheUpdate(expected, data.fLvlDep30));

		// 31
		expected = DependencyTestUtil.childrenOutput("A31", "B31,C31,D31");
		assertTrue(DependencyTestUtil.equalCacheUpdate(expected, data.fLvlDep31));
	}

	@Test
	public void getComplexNegative() {
		CommitCache expected = null;

		// 32
		expected = DependencyTestUtil.childrenOutput("A32", "B32,C32,D32");
		assertTrue(DependencyTestUtil.equalCacheUpdate(expected, data.fLvlDep32));

		// 33
		expected = DependencyTestUtil.childrenOutput("A33", "B33,C33,D33");
		assertTrue(DependencyTestUtil.equalCacheUpdate(expected, data.fLvlDep33));

		// 34
		expected = DependencyTestUtil.childrenOutput("A34", "B34,C34");
		assertTrue(DependencyTestUtil.equalCacheUpdate(expected, data.fLvlDep34));

		// 35
		expected = DependencyTestUtil.childrenOutput("A35", "B35,C35");
		assertTrue(DependencyTestUtil.equalCacheUpdate(expected, data.fLvlDep35));
	}

	@Test
	public void getDualTrivial() {
		CommitCache expected = null;
		Map<String, String> expectMap;

		// 36
		expectMap = new HashMap<String, String>();
		expectMap.put("A36_1", "");
		expectMap.put("A36_2", "");
		expected = DependencyTestUtil.childrenOutput(expectMap);
		assertTrue(DependencyTestUtil.equalCacheUpdate(expected, data.fLvlDep36));

		// 37
		expectMap = new HashMap<String, String>();
		expectMap.put("A37_1", "A37_2");
		expected = DependencyTestUtil.childrenOutput(expectMap);
		assertTrue(DependencyTestUtil.equalCacheUpdate(expected, data.fLvlDep37));

		// 38
		expectMap = new HashMap<String, String>();
		expectMap.put("A38_2", "A38_1");
		expectMap.put("A38_1", "A38_2");
		expected = DependencyTestUtil.childrenOutput(expectMap);
		assertTrue(DependencyTestUtil.equalCacheUpdate(expected, data.fLvlDep38));
	}

	@Test
	public void getDualNormal() {
		CommitCache expected = null;
		Map<String, String> expectMap;

		// 39
		expectMap = new HashMap<String, String>();
		expectMap.put("A39_1", "A39_2");
		expectMap.put("A39_2", "B39");
		expected = DependencyTestUtil.childrenOutput(expectMap);
		assertTrue(DependencyTestUtil.equalCacheUpdate(expected, data.fLvlDep39));

		// 40
		expectMap = new HashMap<String, String>();
		expectMap.put("A40_1", "B40");
		expectMap.put("A40_2", "B40");
		expected = DependencyTestUtil.childrenOutput(expectMap);
		assertTrue(DependencyTestUtil.equalCacheUpdate(expected, data.fLvlDep40));

		// 41
		expectMap = new HashMap<String, String>();
		expectMap.put("A41_1", "B41");
		expectMap.put("A41_2", "C41");
		expected = DependencyTestUtil.childrenOutput(expectMap);
		assertTrue(DependencyTestUtil.equalCacheUpdate(expected, data.fLvlDep41));

		// 42
		expectMap = new HashMap<String, String>();
		expectMap.put("A42_1", "B42");
		expectMap.put("A42_2", "C42");
		expected = DependencyTestUtil.childrenOutput(expectMap);
		assertTrue(DependencyTestUtil.equalCacheUpdate(expected, data.fLvlDep42));

		// 43
		expectMap = new HashMap<String, String>();
		expectMap.put("A43_1", "B43");
		expectMap.put("A43_2", "C43");
		expected = DependencyTestUtil.childrenOutput(expectMap);
		assertTrue(DependencyTestUtil.equalCacheUpdate(expected, data.fLvlDep43));

		// 44
		expectMap = new HashMap<String, String>();
		expectMap.put("A44_1", "B44");
		expectMap.put("A44_2", "C44");
		expected = DependencyTestUtil.childrenOutput(expectMap);
		assertTrue(DependencyTestUtil.equalCacheUpdate(expected, data.fLvlDep44));

		// 45
		expectMap = new HashMap<String, String>();
		expectMap.put("A45_1", "B45");
		expectMap.put("A45_2", "C45");
		expected = DependencyTestUtil.childrenOutput(expectMap);
		assertTrue(DependencyTestUtil.equalCacheUpdate(expected, data.fLvlDep45));
	}

	@Test
	public void getDualComplex() {
		CommitCache expected = null;
		Map<String, String> expectMap;

		// 46
		expectMap = new HashMap<String, String>();
		expectMap.put("A46_1", "B46");
		expectMap.put("A46_2", "C46");
		expected = DependencyTestUtil.childrenOutput(expectMap);
		assertTrue(DependencyTestUtil.equalCacheUpdate(expected, data.fLvlDep46));

		// 47
		expectMap = new HashMap<String, String>();
		expectMap.put("A47_1", "B47");
		expectMap.put("A47_2", "C47");
		expected = DependencyTestUtil.childrenOutput(expectMap);
		assertTrue(DependencyTestUtil.equalCacheUpdate(expected, data.fLvlDep47));

		// 48
		expectMap = new HashMap<String, String>();
		expectMap.put("A48_1", "B48");
		expectMap.put("A48_2", "C48");
		expected = DependencyTestUtil.childrenOutput(expectMap);
		assertTrue(DependencyTestUtil.equalCacheUpdate(expected, data.fLvlDep48));
	}

	@Test
	public void getMulti() {
		CommitCache expected = null;
		Map<String, String> expectMap;

		// 49
		expectMap = new HashMap<String, String>();
		expectMap.put("A49_1", "A49_3,B49");
		expectMap.put("A49_2", "C49,D49");
		expectMap.put("A49_3", "E49");
		expected = DependencyTestUtil.childrenOutput(expectMap);
		assertTrue(DependencyTestUtil.equalCacheUpdate(expected, data.fLvlDep49));

		// 50
		expectMap = new HashMap<String, String>();
		expectMap.put("A50_1", "");
		expectMap.put("A50_2", "B50");
		expectMap.put("A50_3", "C50");
		expectMap.put("A50_4", "D50");
		expected = DependencyTestUtil.childrenOutput(expectMap);
		assertTrue(DependencyTestUtil.equalCacheUpdate(expected, data.fLvlDep50));
	}

	@Test
	public void checkDependenciesGetAdded() {		
		CommitCache fLvlDeps = null;
		assertNull(fLvlDeps);

		String idString = "A3";
		fLvlDeps = DependencyTestUtil.invokeDependencyCalculator(
				idString);

		assertNotNull(fLvlDeps);
		//2 because A3 itself is included
		assertTrue(2 == fLvlDeps.getUpdateMap().size());
		

		idString = "A13";
		fLvlDeps = DependencyTestUtil.invokeDependencyCalculator(
				idString);
		
		assertNotNull(fLvlDeps);
		assertTrue(2 == fLvlDeps.getUpdateMap().size());

		idString = "A50_1,A50_2,A50_3,A50_4";
		fLvlDeps = DependencyTestUtil.invokeDependencyCalculator(
				idString);
		
		assertNotNull(fLvlDeps);
		assertTrue(7 == fLvlDeps.getUpdateMap().size());
	}

	/* TODO #1559: Rewrite this test for cyclic dependencies between artifacts
	 * 
	 *      The part-of-cycle tests are deactivated
	 *      because cycles can only occur for single 
	 *      artifacts and not indexers in general
	
	@Test
	public void partOfTrivial() {
		// 0
		List<Boolean> expacted = boolList("false");
		List<Boolean> actual = partOf(idList(null));
		assertEquals(expacted, actual);

		// 1
		expacted = boolList("false");
		actual = partOf(idList("A1"));
		assertEquals(expacted, actual);

		// 2
		expacted = boolList("true");
		actual = partOf(idList("A2"));
		assertEquals(expacted, actual);
	}

	@Test
	public void partOfList() {
		// 3
		List<Boolean> expacted = boolList("false,false");
		List<Boolean> actual = partOf(idList(data.getCase(3)));
		assertEquals(expacted, actual);

		// 4
		expacted = boolList("false,true");
		actual = partOf(idList(data.getCase(4)));
		assertEquals(expacted, actual);

		// 5
		expacted = boolList("true,true");
		actual = partOf(idList(data.getCase(5)));
		assertEquals(expacted, actual);

		// 6
		expacted = boolList("{f,f,f}");
		actual = partOf(idList(data.getCase(6)));
		assertEquals(expacted, actual);

		// 7
		expacted = boolList("{f,f,t}");
		actual = partOf(idList(data.getCase(7)));
		assertEquals(expacted, actual);

		// 8
		expacted = boolList("{t,t,t}");
		actual = partOf(idList(data.getCase(8)));
		assertEquals(expacted, actual);

		// 9
		expacted = boolList("{f,t,t}");
		actual = partOf(idList(data.getCase(9)));
		assertEquals(expacted, actual);
	}

	@Test
	public void partOfBinaryList() {
		// 10
		List<Boolean> expacted = boolList("{t}");
		List<Boolean> actual = partOf(idList(data.getCase(10)));
		assertEquals(expacted, actual);

		// 11
		expacted = boolList("{t,f}");
		actual = partOf(idList(data.getCase(11)));
		assertEquals(expacted, actual);

		// 12
		expacted = boolList("{f,f}");
		actual = partOf(idList(data.getCase(12)));
		assertEquals(expacted, actual);

		// 13
		expacted = boolList("{f,t}");
		actual = partOf(idList(data.getCase(13)));
		assertEquals(expacted, actual);

		// 14
		expacted = boolList("{f,t}");
		actual = partOf(idList(data.getCase(14)));
		assertEquals(expacted, actual);

		// 15
		expacted = boolList("{t,t}");
		actual = partOf(idList(data.getCase(15)));
		assertEquals(expacted, actual);

		// 16
		expacted = boolList("{t,t}");
		actual = partOf(idList(data.getCase(16)));
		assertEquals(expacted, actual);
	}

	@Test
	public void partOfBinaryTree() {
		// 17
		List<Boolean> expacted = boolList("{f,f,f}");
		List<Boolean> actual = partOf(idList(data.getCase(17)));
		assertEquals(expacted, actual);

		// 18
		expacted = boolList("{f,t,f}");
		actual = partOf(idList(data.getCase(18)));
		assertEquals(expacted, actual);

		// 19
		expacted = boolList("{f,t,t}");
		actual = partOf(idList(data.getCase(19)));
		assertEquals(expacted, actual);

		// 20
		expacted = boolList("{t,t,f}");
		actual = partOf(idList(data.getCase(20)));
		assertEquals(expacted, actual);

		// 21
		expacted = boolList("{t,t,t}");
		actual = partOf(idList(data.getCase(21)));
		assertEquals(expacted, actual);

		// 22
		expacted = boolList("{f,f,f}");
		actual = partOf(idList(data.getCase(22)));
		assertEquals(expacted, actual);

		// 23
		expacted = boolList("{f,f,t}");
		actual = partOf(idList(data.getCase(23)));
		assertEquals(expacted, actual);

		// 24
		expacted = boolList("{f,t,t}");
		actual = partOf(idList(data.getCase(24)));
		assertEquals(expacted, actual);
	}

	@Test
	public void partOfComplexPositive() {
		// 25
		List<Boolean> expacted = boolList("{f,f,f,f}");
		List<Boolean> actual = partOf(idList(data.getCase(25)));
		assertEquals(expacted, actual);

		// 26
		expacted = boolList("{f,f,f,f}");
		actual = partOf(idList(data.getCase(26)));
		assertEquals(expacted, actual);

		// 27
		expacted = boolList("{f,f,f,f,f}");
		actual = partOf(idList(data.getCase(27)));
		assertEquals(expacted, actual);

		// 28
		expacted = boolList("{f,f,f,f,f,f}");
		actual = partOf(idList(data.getCase(28)));
		assertEquals(expacted, actual);

		// 29
		expacted = boolList("{f,f,f,f,f, f}");
		actual = partOf(idList(data.getCase(29)));
		assertEquals(expacted, actual);

		// 30
		expacted = boolList("{f,f,f,f,f, f,f}");
		actual = partOf(idList(data.getCase(30)));
		assertEquals(expacted, actual);

		// 31
		expacted = boolList("{f,f,f,f,f, f}");
		actual = partOf(idList(data.getCase(31)));
		assertEquals(expacted, actual);
	}

	@Test
	public void partOfComplexNegative() {
		// 32
		List<Boolean> expacted = boolList("{t,t,f,f}");
		List<Boolean> actual = partOf(idList(data.getCase(32)));
		assertEquals(expacted, actual);

		// 33
		expacted = boolList("{t,t,t,t,t}");
		actual = partOf(idList(data.getCase(33)));
		assertEquals(expacted, actual);

		// 34
		expacted = boolList("{t,t,f,f,t,t}");
		actual = partOf(idList(data.getCase(34)));
		assertEquals(expacted, actual);

		// 35
		expacted = boolList("{f,f,f,t,t,f}");
		actual = partOf(idList(data.getCase(35)));
		assertEquals(expacted, actual);
	}

	@Test
	public void partOfDualTrivial() {
		// 36
		List<Boolean> expacted = boolList("{f,f}");
		List<Boolean> actual = partOf(idList(data.getCase(36)));
		assertEquals(expacted, actual);

		// 37
		expacted = boolList("{f,f}");
		actual = partOf(idList(data.getCase(37)));
		assertEquals(expacted, actual);

		// 38
		expacted = boolList("{t,t}");
		actual = partOf(idList(data.getCase(38)));
		assertEquals(expacted, actual);
	}

	@Test
	public void partOfDualNormal() {
		// 39
		List<Boolean> expacted = boolList("{f,f,f}");
		List<Boolean> actual = partOf(idList(data.getCase(39)));
		assertEquals(expacted, actual);

		// 40
		expacted = boolList("{f,f,f}");
		actual = partOf(idList(data.getCase(40)));
		assertEquals(expacted, actual);

		// 41
		expacted = boolList("{f,f,f,f}");
		actual = partOf(idList(data.getCase(41)));
		assertEquals(expacted, actual);

		// 42
		expacted = boolList("{f,f,f,f}");
		actual = partOf(idList(data.getCase(42)));
		assertEquals(expacted, actual);

		// 43
		expacted = boolList("{f,f,f,f}");
		actual = partOf(idList(data.getCase(43)));
		assertEquals(expacted, actual);

		// 44
		expacted = boolList("{f,f,t,t}");
		actual = partOf(idList(data.getCase(44)));
		assertEquals(expacted, actual);

		// 45
		expacted = boolList("{t,f,t,t}");
		actual = partOf(idList(data.getCase(45)));
		assertEquals(expacted, actual);
	}

	@Test
	public void partOfDualComplex() {
		// 46
		List<Boolean> expacted = boolList("{f,f,f,f,f,f}");
		List<Boolean> actual = partOf(idList(data.getCase(46)));
		assertEquals(expacted, actual);

		// 47
		expacted = boolList("{f,f,f,f,f,f}");
		actual = partOf(idList(data.getCase(47)));
		assertEquals(expacted, actual);

		// 48
		expacted = boolList("{t,f,t,f,t,f}");
		actual = partOf(idList(data.getCase(48)));
		assertEquals(expacted, actual);
	}

	@Test
	public void partOfMulti() {
		// 49
		List<Boolean> expacted = boolList("{t,t,t,f,t,f,t,t,f,f,t}");
		List<Boolean> actual = partOf(idList(data.getCase(49)));
		assertEquals(expacted, actual);

		// 50
		expacted = boolList("{f,t,f,f,t,t,f,t,t,f,f}");
		actual = partOf(idList(data.getCase(50)));
		assertEquals(expacted, actual);
	}

	private List<Boolean> boolList(String boolString) {
		return DependencyTestUtil.toBooleanList(boolString);
	}

	private List<ID> idList(String string) {
		return DependencyTestUtil.toIDList(string);
	}

	private List<Boolean> partOf(List<ID> idList) {
		List<Boolean> boolList;
		if (idList == null) {
			boolList = new ArrayList<Boolean>(1);
			boolList.add(data.dependencyManagerInst
					.isPartOfDependencyCycle(null));
			return boolList;
		}

		boolList = new ArrayList<Boolean>(idList.size());
		for (ID artifactID : idList) {
			boolList.add(data.dependencyManagerInst
					.isPartOfDependencyCycle(artifactID));
		}

		return boolList;
	}
	*/
}
