package org.reuseware.sokan.test.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.reuseware.sokan.index.indexer.IndexerConfiguration;
import org.reuseware.sokan.index.util.CoreUtil;

public class SorterDataBuilder {
	public static final SorterDataBuilder INSTANCE = new SorterDataBuilder();

	private static final SorterData sData = SorterData.INSTANCE;

	private static boolean dataIsBuild;

	private SorterDataBuilder() {
		dataIsBuild = false;
	}

	public void build() {
		if (dataIsBuild)
			return;

		// build indexer configs
		for (int i = 0; i < 14; i++)
			sData.set("configs" + String.valueOf(i), create(sData.getCase(i)));

		dataIsBuild = true;
	}

	private List<IndexerConfiguration> create(String nameListStr) {
		if (nameListStr == null)
			return Collections.emptyList();
		List<String> nameList = CoreUtil.toList(nameListStr, ",");

		List<IndexerConfiguration> configList = new ArrayList<IndexerConfiguration>(
				nameList.size());
		for (String indexerName : nameList) {
			configList.add(sData.getConfig(indexerName));
		}

		return configList;
	}
}
