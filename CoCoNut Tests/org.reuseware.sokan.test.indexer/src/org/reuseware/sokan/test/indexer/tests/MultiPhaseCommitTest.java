package org.reuseware.sokan.test.indexer.tests;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.junit.Test;
import org.reuseware.sokan.ID;
import org.reuseware.sokan.IndexMetaData;
import org.reuseware.sokan.IndexRow;
import org.reuseware.sokan.index.util.CoreUtil;
import org.reuseware.sokan.index.util.IndexUtil;
import org.reuseware.sokan.index.util.ResourceUtil;
import org.reuseware.sokan.test.indexer.AbstractIndexer;
import org.reuseware.sokan.test.indexer.list.A3Indexer;
import org.reuseware.sokan.test.indexer.list.B3Indexer;
import org.reuseware.sokan.test.indexer.tree.B8Indexer;
import org.reuseware.sokan.test.indexer.tree.C8Indexer;
import org.reuseware.sokan.test.indexer.tree.D8Indexer;
import org.reuseware.sokan.test.util.TestData;
import org.reuseware.sokan.test.util.TestUtil;

public class MultiPhaseCommitTest {
	private static final TestData data = TestData.INSTANCE;
	
	@Test
	public void testDependencyOrder() throws IOException {
		ID id = ResourceUtil.idFrom(TestUtil.fileAsURI(data.a6));
		IndexRow row = IndexUtil.INSTANCE.getIndex(id);
		IndexMetaData metaData = row.getMetaData();

		String a3 = new A3Indexer().myName;
		String b3 = new B3Indexer().myName;
		String a3BeforeB3 = a3 + AbstractIndexer.BEFORE + b3;

		assertEquals(AbstractIndexer.INVOKED, metaData.getSingle(a3));
		assertEquals(AbstractIndexer.INVOKED, metaData.getSingle(b3));
		assertEquals(true, Boolean.parseBoolean(metaData.getSingle(a3BeforeB3)));

		// 20, if artifacts only in folder 'trivial' and 'list' got indexed
		// 33, if artifacts in 'trivial', 'list' and 'binaryList' got indexed
		// what is the correct number to check for here?
		// String allA3 = AbstractIndexer.ALL + a3;
		// int actual = Integer.parseInt(metaData.getSingle(allA3));
		// assertTrue(actual == 20 || actual == 33);
	}

	@Test
	public void testAlphabeticOrder() throws IOException {
		ID id = ResourceUtil.idFrom(TestUtil.fileAsURI(data.a6));
		IndexRow row = IndexUtil.INSTANCE.getIndex(id);
		IndexMetaData metaData = row.getMetaData();

		String b8 = new B8Indexer().myName;
		String c8 = new C8Indexer().myName;
		String d8 = new D8Indexer().myName;
		String b3BeforeC8 = b8 + AbstractIndexer.BEFORE + c8;
		String d3BeforeC8 = d8 + AbstractIndexer.BEFORE + c8;
		String b8TimeStamp = b8 + AbstractIndexer.TIMESTAMP;
		String c8TimeStamp = c8 + AbstractIndexer.TIMESTAMP;
		String d8TimeStamp = d8 + AbstractIndexer.TIMESTAMP;

		assertEquals(AbstractIndexer.INVOKED, metaData.getSingle(b8));
		assertEquals(AbstractIndexer.INVOKED, metaData.getSingle(c8));
		assertEquals(AbstractIndexer.INVOKED, metaData.getSingle(d8));

		// false, because B8, C8, D8 get invoked in one indexing phase
		assertEquals(false, Boolean
				.parseBoolean(metaData.getSingle(b3BeforeC8)));
		assertEquals(false, Boolean
				.parseBoolean(metaData.getSingle(d3BeforeC8)));

		// only time stamps can indicate the order.
		String b8Time = metaData.getSingle(b8TimeStamp);
		String c8Time = metaData.getSingle(c8TimeStamp);
		String d8Time = metaData.getSingle(d8TimeStamp);
		assertEquals(-1, TestUtil.compareDate(b8Time, c8Time));
		assertEquals(-1, TestUtil.compareDate(c8Time, d8Time));

		CoreUtil.print(row);
	}
}