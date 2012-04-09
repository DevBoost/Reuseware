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
package org.reuseware.coconut.description.classify.test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import junit.framework.TestCase;

import org.reuseware.coconut.description.FacetType;
import org.reuseware.coconut.description.FacetTypeDecorator;
import org.reuseware.coconut.description.classify.DecorationManager;
import org.reuseware.coconut.description.classify.UtilityProvider;

public class UtilityTester extends TestCase {

	private FacetTypeDecorator decor1;
	private FacetTypeDecorator decor2;
	private FacetType type1;
	private FacetType type2;

	List<Integer> list1;
	List<Integer> list2;
	List<Integer> list3;
	List<Integer> list4;
	private ArrayList<Integer> list5;
	private LinkedList<Object> list6;
	private ArrayList<Integer> list7;
	private ArrayList<Integer> list8;
	private ArrayList<Integer> list9;
	private ArrayList<Integer> list10;

	protected void setUp() throws Exception {
		type1 = TestDataFactory.getHobbyFacet();
		decor1 = DecorationManager.buildFacetTypeDecorator(type1);

		type2 = TestDataFactory.getJobFacet();
		decor2 = DecorationManager.buildFacetTypeDecorator(type2);

		list1 = new ArrayList<Integer>(4);
		list1.add(3);
		list1.add(1);
		list1.add(7);
		list1.add(8);

		list2 = new ArrayList<Integer>(4);
		list2.add(1);
		list2.add(8);
		list2.add(7);
		list2.add(3);

		list3 = new ArrayList<Integer>(4);
		list3.add(91);
		list3.add(3);
		list3.add(7);
		list3.add(8);

		list4 = new ArrayList<Integer>(5);
		list4.add(3);
		list4.add(1);
		list4.add(7);
		list4.add(8);
		list4.add(1);

		list5 = new ArrayList<Integer>();
		list6 = new LinkedList<Object>();

		list7 = new ArrayList<Integer>(1);
		list7.add(3);

		list8 = new ArrayList<Integer>(1);
		list8.add(3);

		list9 = new ArrayList<Integer>(1);
		list9.add(3);
		list9.add(91);

		list10 = new ArrayList<Integer>(1);
		list10.add(91);
		list10.add(3);
	}

	public void testSimilarity() {
		assertEquals(type1, type1);
		assertEquals(type2, type2);

		assertEquals(decor1, decor1);
		assertEquals(decor2, decor2);
	}

	public void testLists() {
		assertEquals(type1.getValues(), type1.getValues());

		assertEquals(list1, list1);
		assertTrue(list1.equals(list1));

		assertTrue(!list1.equals(list2));
		assertTrue(!list1.equals(list3));
	}

	public void testUtilitProvider() {
		assertTrue(UtilityProvider.equal(null, null));
		
		assertTrue(!UtilityProvider.equal(list1, null));
		assertTrue(!UtilityProvider.equal(null, list1));
		assertTrue(!UtilityProvider.equal(null, list2));

		assertTrue(!UtilityProvider.equal(list1, list5));
		assertTrue(!UtilityProvider.equal(list5, list4));

		assertTrue(UtilityProvider.equal(list5, list6));
		assertTrue(UtilityProvider.equal(list5, null));

		assertEquals(list7.size(), 1);
		assertEquals(list8.size(), 1);
		assertTrue(UtilityProvider.equal(list7, list7));
		assertTrue(UtilityProvider.equal(list7, list8));
		assertTrue(UtilityProvider.equal(list8, list7));

		assertTrue(UtilityProvider.equal(list1, list1));
		assertTrue(UtilityProvider.equal(list9, list10));
		assertTrue(UtilityProvider.equal(list10, list9));
		assertTrue(UtilityProvider.equal(list1, list2));
		assertTrue(UtilityProvider.equal(list2, list1));

		assertTrue(!UtilityProvider.equal(list10, list3));
		assertTrue(!UtilityProvider.equal(list3, list10));
		assertTrue(!UtilityProvider.equal(list1, list10));
		assertTrue(!UtilityProvider.equal(list5, list3));
		assertTrue(!UtilityProvider.equal(list3, list7));
	}
}
