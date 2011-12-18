package org.reuseware.sokan.test.all;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.util.List;

import org.junit.Test;
import org.reuseware.sokan.IndexRow;
import org.reuseware.sokan.index.emodeler.EModeler;
import org.reuseware.sokan.index.emodeler.EModelerManager;
import org.reuseware.sokan.index.indexer.Indexer;
import org.reuseware.sokan.index.indexer.IndexerConfiguration;
import org.reuseware.sokan.index.util.IndexUtil;
import org.reuseware.sokan.test.index.emodeler.FacetInstEModeler;
import org.reuseware.sokan.test.index.emodeler.FacetOtherEModeler;
import org.reuseware.sokan.test.index.indexer.DependencyIndexer;
import org.reuseware.sokan.test.index.indexer.FacetColorIndexer;
import org.reuseware.sokan.test.index.indexer.FacetSizeIndexer;
import org.reuseware.sokan.test.index.indexer.FacetTypeIndexer;
import org.reuseware.sokan.test.indexer.complex.A10Indexer;
import org.reuseware.sokan.test.indexer.complex.A11Indexer;
import org.reuseware.sokan.test.indexer.complex.A12Indexer;
import org.reuseware.sokan.test.indexer.complex.A13Indexer;
import org.reuseware.sokan.test.indexer.complex.A9Indexer;
import org.reuseware.sokan.test.indexer.complex.B10Indexer;
import org.reuseware.sokan.test.indexer.complex.B11Indexer;
import org.reuseware.sokan.test.indexer.complex.B12Indexer;
import org.reuseware.sokan.test.indexer.complex.B13Indexer;
import org.reuseware.sokan.test.indexer.complex.B9Indexer;
import org.reuseware.sokan.test.indexer.complex.C10Indexer;
import org.reuseware.sokan.test.indexer.complex.C11Indexer;
import org.reuseware.sokan.test.indexer.complex.C12Indexer;
import org.reuseware.sokan.test.indexer.complex.C13Indexer;
import org.reuseware.sokan.test.indexer.complex.C9Indexer;
import org.reuseware.sokan.test.indexer.complex.D10Indexer;
import org.reuseware.sokan.test.indexer.complex.D12Indexer;
import org.reuseware.sokan.test.indexer.complex.D13Indexer;
import org.reuseware.sokan.test.indexer.complex.D9Indexer;
import org.reuseware.sokan.test.indexer.complex.E13Indexer;
import org.reuseware.sokan.test.indexer.complex.F13Indexer;
import org.reuseware.sokan.test.indexer.complex.G13Indexer;
import org.reuseware.sokan.test.indexer.complex.H13Indexer;
import org.reuseware.sokan.test.indexer.complex.I13Indexer;
import org.reuseware.sokan.test.indexer.complex.J13Indexer;
import org.reuseware.sokan.test.indexer.complex.K13Indexer;
import org.reuseware.sokan.test.indexer.list.A3Indexer;
import org.reuseware.sokan.test.indexer.list.A4Indexer;
import org.reuseware.sokan.test.indexer.list.A5Indexer;
import org.reuseware.sokan.test.indexer.list.A6Indexer;
import org.reuseware.sokan.test.indexer.list.A7Indexer;
import org.reuseware.sokan.test.indexer.list.B3Indexer;
import org.reuseware.sokan.test.indexer.list.B4Indexer;
import org.reuseware.sokan.test.indexer.list.B5Indexer;
import org.reuseware.sokan.test.indexer.list.B6Indexer;
import org.reuseware.sokan.test.indexer.list.B7Indexer;
import org.reuseware.sokan.test.indexer.list.C6Indexer;
import org.reuseware.sokan.test.indexer.list.C7Indexer;
import org.reuseware.sokan.test.indexer.loop.CreateIndexLoopIndexer;
import org.reuseware.sokan.test.indexer.tree.A8Indexer;
import org.reuseware.sokan.test.indexer.tree.B8Indexer;
import org.reuseware.sokan.test.indexer.tree.C8Indexer;
import org.reuseware.sokan.test.indexer.trivial.A1Indexer;
import org.reuseware.sokan.test.indexer.trivial.A2Indexer;
import org.reuseware.sokan.test.util.SorterData;

public class PreconditionTestCase {
	private static final SorterData sData = SorterData.INSTANCE;
	
	@Test
	public void preDependencyManagerTest() {
		assertTrue("The DependencyIndexer is not registered!",
				indexerIsRegistered(DependencyIndexer.class));
		assertFalse("Index was not filled correctly!", indexIsEmpty());
	}

	@Test
	public void preIndexerUtilTest() throws IOException {
		assertTrue("The ColorIndexer is not registered!",
				indexerIsRegistered(FacetColorIndexer.class));
		assertTrue("The LevelIndexer is not registered!",
				indexerIsRegistered(FacetSizeIndexer.class));
		assertTrue("The NumberTypeIndexer is not registered!",
				indexerIsRegistered(FacetTypeIndexer.class));

		assertTrue("The FacetInstEModeler is not registered!",
				eModelerIsRegistered(FacetInstEModeler.class));
		assertTrue("The FacetOtherEModeler is not registered!",
				eModelerIsRegistered(FacetOtherEModeler.class));

		//ID id = ResourceUtil.idFrom(URI.createFileURI(data.b17.getCanonicalPath()));
		//IndexRow row = IndexUtil.INSTANCE.getIndex(id);
	}

	@Test
	public void preIndexerSorterTest() {
		assertNotNull(sData.indexerSorterInst);

		// trivial dependency indexers
		assertTrue("The A1Indexer is not registered!",
				indexerIsRegistered(A1Indexer.class));
		assertTrue("The A2Indexer is not registered!",
				indexerIsRegistered(A2Indexer.class));

		// list dependency indexers
		assertTrue("The A3Indexer is not registered!",
				indexerIsRegistered(A3Indexer.class));
		assertTrue("The B3Indexer is not registered!",
				indexerIsRegistered(B3Indexer.class));
		assertTrue("The A4Indexer is not registered!",
				indexerIsRegistered(A4Indexer.class));
		assertTrue("The B4Indexer is not registered!",
				indexerIsRegistered(B4Indexer.class));
		assertTrue("The A5Indexer is not registered!",
				indexerIsRegistered(A5Indexer.class));
		assertTrue("The B5Indexer is not registered!",
				indexerIsRegistered(B5Indexer.class));
		assertTrue("The A6Indexer is not registered!",
				indexerIsRegistered(A6Indexer.class));
		assertTrue("The B6Indexer is not registered!",
				indexerIsRegistered(B6Indexer.class));
		assertTrue("The C6Indexer is not registered!",
				indexerIsRegistered(C6Indexer.class));
		assertTrue("The A7Indexer is not registered!",
				indexerIsRegistered(A7Indexer.class));
		assertTrue("The B7Indexer is not registered!",
				indexerIsRegistered(B7Indexer.class));
		assertTrue("The C7Indexer is not registered!",
				indexerIsRegistered(C7Indexer.class));

		// tree dependency indexers
		assertTrue("The A8Indexer is not registered!",
				indexerIsRegistered(A8Indexer.class));
		assertTrue("The B8Indexer is not registered!",
				indexerIsRegistered(B8Indexer.class));
		assertTrue("The C8Indexer is not registered!",
				indexerIsRegistered(C8Indexer.class));

		// complex dependency indexers
		assertTrue("The A9Indexer is not registered!",
				indexerIsRegistered(A9Indexer.class));
		assertTrue("The B9Indexer is not registered!",
				indexerIsRegistered(B9Indexer.class));
		assertTrue("The C9Indexer is not registered!",
				indexerIsRegistered(C9Indexer.class));
		assertTrue("The D9Indexer is not registered!",
				indexerIsRegistered(D9Indexer.class));

		assertTrue("The A10Indexer is not registered!",
				indexerIsRegistered(A10Indexer.class));
		assertTrue("The B10Indexer is not registered!",
				indexerIsRegistered(B10Indexer.class));
		assertTrue("The C10Indexer is not registered!",
				indexerIsRegistered(C10Indexer.class));
		assertTrue("The D10Indexer is not registered!",
				indexerIsRegistered(D10Indexer.class));

		assertTrue("The A11Indexer is not registered!",
				indexerIsRegistered(A11Indexer.class));
		assertTrue("The B11Indexer is not registered!",
				indexerIsRegistered(B11Indexer.class));
		assertTrue("The C11Indexer is not registered!",
				indexerIsRegistered(C11Indexer.class));

		assertTrue("The A12Indexer is not registered!",
				indexerIsRegistered(A12Indexer.class));
		assertTrue("The B12Indexer is not registered!",
				indexerIsRegistered(B12Indexer.class));
		assertTrue("The C12Indexer is not registered!",
				indexerIsRegistered(C12Indexer.class));
		assertTrue("The D12Indexer is not registered!",
				indexerIsRegistered(D12Indexer.class));
		assertTrue("The E12Indexer is not registered!",
				indexerIsRegistered(C12Indexer.class));
		assertTrue("The F12Indexer is not registered!",
				indexerIsRegistered(D12Indexer.class));

		assertTrue("The A13Indexer is not registered!",
				indexerIsRegistered(A13Indexer.class));
		assertTrue("The B13Indexer is not registered!",
				indexerIsRegistered(B13Indexer.class));
		assertTrue("The C13Indexer is not registered!",
				indexerIsRegistered(C13Indexer.class));
		assertTrue("The D13Indexer is not registered!",
				indexerIsRegistered(D13Indexer.class));
		assertTrue("The E13Indexer is not registered!",
				indexerIsRegistered(E13Indexer.class));
		assertTrue("The F13Indexer is not registered!",
				indexerIsRegistered(F13Indexer.class));
		assertTrue("The G13Indexer is not registered!",
				indexerIsRegistered(G13Indexer.class));
		assertTrue("The H13Indexer is not registered!",
				indexerIsRegistered(H13Indexer.class));
		assertTrue("The I13Indexer is not registered!",
				indexerIsRegistered(I13Indexer.class));
		assertTrue("The J13Indexer is not registered!",
				indexerIsRegistered(J13Indexer.class));
		assertTrue("The K13Indexer is not registered!",
				indexerIsRegistered(K13Indexer.class));
	}

	@Test
	public void loopBreakerTest() {
		assertTrue("The CreateIndexLoopIndexer is not registered!",
				indexerIsRegistered(CreateIndexLoopIndexer.class));
	}
	
	private boolean indexIsEmpty() {
		List<IndexRow> index = IndexUtil.INSTANCE.getIndex();
		boolean empty = index == null || index.size() == 0;
		System.out.println("[INFO] index size is: "
				+ (empty ? "0" : index.size()));
		return empty;
	}

	private boolean indexerIsRegistered(Class<? extends Indexer> indexerClass) {
		for (IndexerConfiguration indexer : IndexUtil.INSTANCE.getIndexerConfigurations()) {
			if (indexer.getId().equals(indexerClass.getCanonicalName()))
				return true;
		}
		return false;
	}

	private boolean eModelerIsRegistered(Class<? extends EModeler> eModelerClass) {
		for(EModeler modeler : EModelerManager.getEModelers()) {
			if (modeler.getClass().equals(eModelerClass)) {
				return true;
			}
		}
		return false;
	}

}
