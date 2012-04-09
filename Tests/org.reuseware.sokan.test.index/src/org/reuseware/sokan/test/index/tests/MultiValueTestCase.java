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
import static org.junit.Assert.assertTrue;

import java.util.LinkedList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.reuseware.sokan.Constraint;
import org.reuseware.sokan.FacetedRequest;
import org.reuseware.sokan.IndexRow;
import org.reuseware.sokan.index.util.FacetUtil;
import org.reuseware.sokan.index.util.IndexUtil;
import org.reuseware.sokan.test.index.indexer.FacetColorIndexer;
import org.reuseware.sokan.test.index.indexer.MultiValueIndexer;
import org.reuseware.sokan.test.util.TestUtil;

public class MultiValueTestCase {

	@Before
	public void setUp() {
		TestUtil.waitForIndexingToFinish();
	}

	@Test
	public void testMultiValueSIMPLE() {
		String multi = MultiValueIndexer.MULTI;
		String[][] constArray = { { multi, "5" } };
		List<Constraint> cons = FacetUtil.buildConstraints(constArray);
		FacetedRequest req = FacetUtil.buildFacetedRequest(cons);

		List<IndexRow> rows = IndexUtil.INSTANCE.getIndex(req);
		assertNotNull(rows);
		assertTrue(29 == rows.size()); // 18?
	}

	@Test
	public void testMultiValueAND() {
		String multi = MultiValueIndexer.MULTI;
		String[][] constArray = { { multi, "5" }, { multi, "B" } };
		List<Constraint> cons = FacetUtil.buildConstraints(constArray);
		FacetedRequest req = FacetUtil.buildFacetedRequest(cons);

		List<IndexRow> rows = IndexUtil.INSTANCE.getIndex(req);
		assertNotNull(rows);
		assertTrue(6 == rows.size()); // 5?
	}

	@Test
	public void testMultiValueOR() {
		String multi = MultiValueIndexer.MULTI;
		String[][] constArray = { { multi, "5", "B" } };
		List<Constraint> cons = FacetUtil.buildConstraints(constArray);
		FacetedRequest req = FacetUtil.buildFacetedRequest(cons);

		List<IndexRow> rows = IndexUtil.INSTANCE.getIndex(req);
		assertNotNull(rows);
		assertTrue(67 == rows.size()); // 55?
	}

	@Test
	public void testWildcard() {
		String color = FacetColorIndexer.FACET_NAME;
		List<Constraint> cons = FacetUtil.buildConstraints(color, "Dar*");
		FacetedRequest req = FacetUtil.buildFacetedRequest(cons);

		List<IndexRow> rows = IndexUtil.INSTANCE.getIndex(req);
		List<String> values = new LinkedList<String>();
		for (IndexRow row : rows) {
			if (!values.contains(row.getMetaData().getSingle(color)))
				values.add(row.getMetaData().getSingle(color));
		}
		assertTrue(2 == values.size());
	}
}
