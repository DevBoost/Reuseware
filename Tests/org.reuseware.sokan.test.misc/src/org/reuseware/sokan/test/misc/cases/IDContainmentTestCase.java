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
package org.reuseware.sokan.test.misc.cases;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;
import org.reuseware.sokan.ID;
import org.reuseware.sokan.index.util.ResourceUtil;

/**
 * @author Matthias Schmidt
 *
 */
public class IDContainmentTestCase {

	private ID id1;
	private ID id1Other;
	private ID id2;

	private Object id5;
	private Object id6;
	private Object id5Other;

	private List<ID> idList;
	private Set<ID> idSet;

	@Before
	public void setUp() throws Exception {
		id1 = ResourceUtil.idFrom("id1");
		id2 = ResourceUtil.idFrom("id2");
		id1Other = ResourceUtil.idFrom("id1");

		id5 = ResourceUtil.idFrom("id5\\dir\\artifact");
		id6 = ResourceUtil.idFrom("id5\\dir\\art");
		id5Other = ResourceUtil.idFrom("id5\\dir\\artifact");

		idList = new ArrayList<ID>(1);
		idList.add(id1);

		idSet = new HashSet<ID>();
		idSet.add(id1);
	}

	@Test
	public void testIDEqual() {
		assertTrue(id1.equals(id1));
		assertFalse(id1.equals(id2));
		assertTrue(id1.equals(id1Other));

		assertFalse(id1.equals(id5));

		assertTrue(id5.equals(id5));
		assertFalse(id5.equals(id6));
		assertTrue(id5.equals(id5Other));
	}

	@Test
	public void testList() {
		assertTrue(idList.contains(id1));
		assertFalse(idList.contains(id2));

		assertTrue(idList.contains(id1Other));
	}

	@Test
	public void testSet() {
		assertTrue(idSet.contains(id1));
		assertFalse(idSet.contains(id2));

		// this works because hashCode() of IDImpl has been adjusted to 
		// return the hash code of the segment list
		assertTrue(idSet.contains(id1Other));
	}

	@Test
	public void testSetCaching() {
		List<ID> cache = new ArrayList<ID>(idSet);

		assertTrue(cache.contains(id1));
		assertFalse(cache.contains(id2));

		assertTrue(cache.contains(id1Other));
	}
}
