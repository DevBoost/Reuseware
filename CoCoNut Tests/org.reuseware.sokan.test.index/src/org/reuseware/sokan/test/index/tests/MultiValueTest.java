package org.reuseware.sokan.test.index.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

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

public class MultiValueTest {

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
		assertEquals(29, rows.size()); // 18?
	}

	@Test
	public void testMultiValueAND() {
		String multi = MultiValueIndexer.MULTI;
		String[][] constArray = { { multi, "5" }, { multi, "B" } };
		List<Constraint> cons = FacetUtil.buildConstraints(constArray);
		FacetedRequest req = FacetUtil.buildFacetedRequest(cons);

		List<IndexRow> rows = IndexUtil.INSTANCE.getIndex(req);
		assertNotNull(rows);
		assertEquals(6, rows.size()); // 5?
	}

	@Test
	public void testMultiValueOR() {
		String multi = MultiValueIndexer.MULTI;
		String[][] constArray = { { multi, "5", "B" } };
		List<Constraint> cons = FacetUtil.buildConstraints(constArray);
		FacetedRequest req = FacetUtil.buildFacetedRequest(cons);

		List<IndexRow> rows = IndexUtil.INSTANCE.getIndex(req);
		assertNotNull(rows);
		assertEquals(67, rows.size()); // 55?
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
		assertEquals(2, values.size());
	}
}
