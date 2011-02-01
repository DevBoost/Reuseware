package org.reuseware.sokan.test.util;

import java.util.List;

import org.reuseware.sokan.index.indexer.IndexerConfiguration;
import org.reuseware.sokan.index.indexer.IndexerSorter;
import org.reuseware.sokan.index.util.IndexUtil;

public class SorterData extends AbstractData {
	public static final SorterData INSTANCE = getInstance();
	public static final String ID_SUFFIX = "Indexer";

	// public test data
	public final IndexerSorter indexerSorterInst = new IndexerSorter();

	// trivial indexer dependencies
	public List<IndexerConfiguration> configs0;
	public List<IndexerConfiguration> configs1;
	public List<IndexerConfiguration> configs2;

	// list indexer dependencies
	public List<IndexerConfiguration> configs3;
	public List<IndexerConfiguration> configs4;
	public List<IndexerConfiguration> configs5;
	public List<IndexerConfiguration> configs6;
	public List<IndexerConfiguration> configs7;

	// tree indexer dependencies
	public List<IndexerConfiguration> configs8;
	public List<IndexerConfiguration> configs9;

	// complex indexer dependencies
	public List<IndexerConfiguration> configs10;
	public List<IndexerConfiguration> configs11;
	public List<IndexerConfiguration> configs12;
	public List<IndexerConfiguration> configs13;

	// issue indexer dependencies
	public List<IndexerConfiguration> configs14;
	public List<IndexerConfiguration> configs15;
	public List<IndexerConfiguration> configs16;

	// the single instance
	private static SorterData instance;
	private static final TestData data = TestData.INSTANCE;

	private SorterData() {
	}

	private static SorterData getInstance() {
		if (instance == null)
			instance = new SorterData();
		return instance;
	}

	public String getCase(int number) {
		switch (number) {
		case 0:
			return null;
		case 1:
			return data.getCase(number);
		case 2:
			return data.getCase(number);
		case 3:
			return "B3,A3";
		case 4:
			return data.getCase(number);
		case 5:
			return data.getCase(number);
		case 6:
			return "B6,C6,A6";
		case 7:
			return data.getCase(number);
		case 8:
			return "A8,D8,B8,C8";
		case 9:
			return "D9,C9,E9,A9,B9";
		case 10:
			return "A10,D10,B10,C10";
		case 11:
			return "A11,C11,B11";
		case 12:
			return "D12,A12,E12,F12,C12,B12";
		case 13:
			return "E13,C13,G13,I13,B13,J13,K13,D13,F13,A13,H13";
		default:
			return null;
		}
	}

	public IndexerConfiguration getConfig(String indexerName) {
		for (IndexerConfiguration conf : IndexUtil.INSTANCE.getIndexerConfigurations()) {
			if (conf.getId().endsWith(indexerName + ID_SUFFIX)) {
				return conf;
			}
		}

		throw new IllegalArgumentException("Non indexer registered: " + indexerName + ID_SUFFIX);
	}

	// public List<IndexerConfiguration> getCase(int number) {
	// Object obj = get("configs" + number);
	// if (obj == null)
	// return null;
	//
	// List<IndexerConfiguration> back = (List<IndexerConfiguration>) obj;
	// return back;
	// }
}
