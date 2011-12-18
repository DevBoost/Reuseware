package org.reuseware.sokan.test.indexer.tests;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;
import org.reuseware.sokan.index.indexer.IndexerConfiguration;
import org.reuseware.sokan.test.util.SorterData;
import org.reuseware.sokan.test.util.TestUtil;


public class IndexerSorterTestCase {
	private static final SorterData sData = SorterData.INSTANCE;

	@Test
	public void testSortTrivial() {
		// 0
		List<List<IndexerConfiguration>> expected = toList("{}");
		List<List<IndexerConfiguration>> actual = sort(sData.configs0);
		assertTrue(TestUtil.equalList(expected, actual));

		// 1
		expected = toList("{A1}");
		actual = sort(sData.configs1);
		assertTrue(TestUtil.equalList(expected, actual));

		// 2
		expected = toList("{A2}");
		actual = sort(sData.configs2);
		assertTrue(TestUtil.equalList(expected, actual));
	}

	@Test
	public void testSortList() {
		// 3
		List<List<IndexerConfiguration>> expected = toList("{A3~B3}");
		List<List<IndexerConfiguration>> actual = sort(sData.configs3);
		assertTrue(TestUtil.equalList(expected, actual));

		// 4
		expected = toList("{B4~A4}");
		actual = sort(sData.configs4);
		assertTrue(TestUtil.equalList(expected, actual));

		// 5
		expected = toList("{A5~B5}");
		actual = sort(sData.configs5);
		assertTrue(TestUtil.equalList(expected, actual));

		// 6
		expected = toList("{B6~C6~A6}");
		actual = sort(sData.configs6);
		assertTrue(TestUtil.equalList(expected, actual));

		// 7
		expected = toList("{A7,C7~B7}");
		actual = sort(sData.configs7);
		assertTrue(TestUtil.equalList(expected, actual));
	}

	@Test
	public void testSortTree() {
		// 8
		List<List<IndexerConfiguration>> expected = toList("{B8,C8,D8~A8}");
		List<List<IndexerConfiguration>> actual = sort(sData.configs8);
		assertTrue(TestUtil.equalList(expected, actual));
	}

	@Test
	public void testSortComplex() {
		// 9
		List<List<IndexerConfiguration>> expected = toList("{B9~A9,C9,E9~D9}");
		List<List<IndexerConfiguration>> actual = sort(sData.configs9);
		assertTrue(TestUtil.equalList(expected, actual));

		// 10
		expected = toList("{A10~B10~C10~D10}");
		actual = sort(sData.configs10);
		assertTrue(TestUtil.equalList(expected, actual));

		// 11
		expected = toList("{A11~B11~C11}");
		actual = sort(sData.configs11);
		assertTrue(TestUtil.equalList(expected, actual));

		// 12
		expected = toList("{B12,C12~E12~D12,F12~A12}");
		actual = sort(sData.configs12);
		assertTrue(TestUtil.equalList(expected, actual));

		// 13
		expected = toList("{B13,E13~D13~F13~C13~J13~A13,G13~H13~K13~I13}");
		actual = sort(sData.configs13);
		assertTrue(TestUtil.equalList(expected, actual));
	}

	private List<List<IndexerConfiguration>> toList(String string) {
		return TestUtil.toIndexerConfigList(string);
	}

	private List<List<IndexerConfiguration>> sort(
			List<IndexerConfiguration> configs) {
		return sData.indexerSorterInst.sort(configs);
	}
}
