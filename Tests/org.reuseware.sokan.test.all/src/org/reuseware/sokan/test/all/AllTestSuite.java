package org.reuseware.sokan.test.all;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.reuseware.sokan.index.emodeler.EModeler;
import org.reuseware.sokan.index.emodeler.EModelerManager;
import org.reuseware.sokan.index.indexer.Indexer;
import org.reuseware.sokan.index.indexer.IndexerConfiguration;
import org.reuseware.sokan.index.persister.PersistencyManager;
import org.reuseware.sokan.index.solr.SolrPersister;
import org.reuseware.sokan.index.util.IndexUtil;
import org.reuseware.sokan.test.exampleindexer.emodeler.TestEModeler;
import org.reuseware.sokan.test.exampleindexer.indexer.DependentIndexer;
import org.reuseware.sokan.test.exampleindexer.indexer.FacetIndexer;
import org.reuseware.sokan.test.exampleindexer.indexer.GeneratingIndexer;
import org.reuseware.sokan.test.exampleindexer.indexer.ReuseIndexer;
import org.reuseware.sokan.test.index.emodeler.FacetInstEModeler;
import org.reuseware.sokan.test.index.emodeler.FacetOtherEModeler;
import org.reuseware.sokan.test.index.indexer.DependencyIndexer;
import org.reuseware.sokan.test.index.indexer.FacetColorIndexer;
import org.reuseware.sokan.test.index.indexer.FacetSizeIndexer;
import org.reuseware.sokan.test.index.indexer.FacetTypeIndexer;
import org.reuseware.sokan.test.index.indexer.MultiValueIndexer;
import org.reuseware.sokan.test.index.tests.DependencyManagerTest;
import org.reuseware.sokan.test.index.tests.IndexNotifyDeltaTest;
import org.reuseware.sokan.test.index.tests.IndexUtilTest;
import org.reuseware.sokan.test.index.tests.MultiValueTest;
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
import org.reuseware.sokan.test.indexer.complex.E12Indexer;
import org.reuseware.sokan.test.indexer.complex.E13Indexer;
import org.reuseware.sokan.test.indexer.complex.E9Indexer;
import org.reuseware.sokan.test.indexer.complex.F12Indexer;
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
import org.reuseware.sokan.test.indexer.loop.DependencyLoopIndexer;
import org.reuseware.sokan.test.indexer.tests.IndexerSorterTest;
import org.reuseware.sokan.test.indexer.tests.MultiPhaseCommitTest;
import org.reuseware.sokan.test.indexer.tree.A8Indexer;
import org.reuseware.sokan.test.indexer.tree.B8Indexer;
import org.reuseware.sokan.test.indexer.tree.C8Indexer;
import org.reuseware.sokan.test.indexer.tree.D8Indexer;
import org.reuseware.sokan.test.indexer.trivial.A1Indexer;
import org.reuseware.sokan.test.indexer.trivial.A2Indexer;
import org.reuseware.sokan.test.misc.cases.IDContainmentTest;
import org.reuseware.sokan.test.misc.cases.IndexNotifyTest;
import org.reuseware.sokan.test.misc.cases.ResourceCacheTest;
import org.reuseware.sokan.test.util.SorterDataBuilder;
import org.reuseware.sokan.test.util.TestData;
import org.reuseware.sokan.test.util.TestDataBuilder;



@RunWith(Suite.class)
@Suite.SuiteClasses( { 
//	SolrSchemaTest.class,
	PreconditionTest.class, 
	IDContainmentTest.class,
	DependencyManagerTest.class, 
	IndexerSorterTest.class, 
	ResourceCacheTest.class,
	IndexUtilTest.class,
	MultiPhaseCommitTest.class, 
	MultiValueTest.class,
	IndexNotifyTest.class, 
	IndexNotifyDeltaTest.class 
	})
public class AllTestSuite {

	@BeforeClass
	public static void setUp() throws IOException {
		deleteDirectory(new File("tmp"));
		deleteDirectory(new File(".metadata"));
		
		IndexUtil.INSTANCE.setPersistencyManager(
				new PersistencyManager(new SolrPersister()));		
		
		pluginXMLExampleIndexer();
		pluginXMLIndex();
		pluginXMLIndexer();
		
		TestDataBuilder.INSTANCE.build();
		SorterDataBuilder.INSTANCE.build();
	}
	
	private static boolean deleteDirectory(File path) {
		if (path.exists()) {
			File[] files = path.listFiles();
			for (int i = 0; i < files.length; i++) {
				if (files[i].isDirectory()) {
					deleteDirectory(files[i]);
				} else {
					files[i].delete();
				}
			}
		}
		return (path.delete());
	}
	
	private static void newIndexer(
			Indexer indexer, Indexer[] dependencies) {
		String id = indexer.getClass().getCanonicalName();
		List<String> depIDs = new ArrayList<String>();
		for(Indexer depIndexer : dependencies) {
			String depID = null;
			if (depIndexer == null) {
				depID = "Foo";
			}
			else {
				depID = depIndexer.getClass().getCanonicalName();
			}
			depIDs.add(depID);
		}
		TestData.INSTANCE.addIndexer(
				new IndexerConfiguration(indexer, id, depIDs));
	}
	
	private static void newEModeler(EModeler modeler) {
		EModelerManager.getEModelers().add(modeler);
	}
	
	private static void pluginXMLExampleIndexer() {
		Indexer facetIndexer = new FacetIndexer();
		Indexer depIndexer = new DependentIndexer();
		Indexer reuseIndexer = new ReuseIndexer();
		Indexer genIndexer = new GeneratingIndexer();
		
		EModeler testEModeler = new TestEModeler();
		
		newIndexer(facetIndexer, new Indexer[]{depIndexer});
		newIndexer(reuseIndexer, new Indexer[]{});
		newIndexer(depIndexer, new Indexer[]{reuseIndexer});
		newIndexer(genIndexer, new Indexer[]{});
		
		newEModeler(testEModeler);
	}
	
	private static void pluginXMLIndex() {
		Indexer depIndexer = new DependencyIndexer();
		Indexer colorIndexer = new FacetColorIndexer();
		Indexer sizeIndexer = new FacetSizeIndexer();
		Indexer typeIndexer = new FacetTypeIndexer();
		Indexer multiValueIndexer = new MultiValueIndexer();
		
		EModeler instEModeler = new FacetInstEModeler();
		EModeler otheEModeler = new FacetOtherEModeler();
		
		newIndexer(depIndexer, new Indexer[]{});
		newIndexer(colorIndexer, new Indexer[]{});
		newIndexer(sizeIndexer, new Indexer[]{});
		newIndexer(typeIndexer, new Indexer[]{});
		newIndexer(multiValueIndexer, new Indexer[]{});
		
		newEModeler(instEModeler);
		newEModeler(otheEModeler);
	}
	
	private static void pluginXMLIndexer() {
		Indexer a1Indexer = new A1Indexer();
		Indexer a2Indexer = new A2Indexer();
		
		newIndexer(a1Indexer, new Indexer[]{});
		newIndexer(a2Indexer, new Indexer[]{a2Indexer});
		
		Indexer a3Indexer = new A3Indexer();
		Indexer b3Indexer = new B3Indexer();
		
		newIndexer(a3Indexer, new Indexer[]{});
		newIndexer(b3Indexer, new Indexer[]{a3Indexer});
		
		Indexer a4Indexer = new A4Indexer();
		Indexer b4Indexer = new B4Indexer();
		
		newIndexer(a4Indexer, new Indexer[]{b4Indexer,b4Indexer});
		newIndexer(b4Indexer, new Indexer[]{});
		
		Indexer a5Indexer = new A5Indexer();
		Indexer b5Indexer = new B5Indexer();
		
		newIndexer(a5Indexer, new Indexer[]{b5Indexer});
		newIndexer(b5Indexer, new Indexer[]{a5Indexer});
		
		Indexer a6Indexer = new A6Indexer();
		Indexer b6Indexer = new B6Indexer();
		Indexer c6Indexer = new C6Indexer();
		
		newIndexer(a6Indexer, new Indexer[]{c6Indexer});
		newIndexer(b6Indexer, new Indexer[]{c6Indexer});
		newIndexer(c6Indexer, new Indexer[]{b6Indexer});
		
		Indexer a7Indexer = new A7Indexer();
		Indexer b7Indexer = new B7Indexer();
		Indexer c7Indexer = new C7Indexer();
		
		newIndexer(a7Indexer, new Indexer[]{b7Indexer});
		newIndexer(b7Indexer, new Indexer[]{a7Indexer,c7Indexer});
		newIndexer(c7Indexer, new Indexer[]{b6Indexer});
		
		Indexer a8Indexer = new A8Indexer();
		Indexer b8Indexer = new B8Indexer();
		Indexer c8Indexer = new C8Indexer();
		Indexer d8Indexer = new D8Indexer();
		
		newIndexer(a8Indexer, new Indexer[]{d8Indexer,b8Indexer,c8Indexer});
		newIndexer(b8Indexer, new Indexer[]{});
		newIndexer(c8Indexer, new Indexer[]{});
		newIndexer(d8Indexer, new Indexer[]{});
		
		Indexer a9Indexer = new A9Indexer();
		Indexer b9Indexer = new B9Indexer();
		Indexer c9Indexer = new C9Indexer();
		Indexer d9Indexer = new D9Indexer();
		Indexer e9Indexer = new E9Indexer();
		
		newIndexer(a9Indexer, new Indexer[]{b9Indexer});
		newIndexer(b9Indexer, new Indexer[]{});
		newIndexer(c9Indexer, new Indexer[]{b9Indexer});
		newIndexer(d9Indexer, new Indexer[]{c9Indexer,e9Indexer,a9Indexer});
		newIndexer(e9Indexer, new Indexer[]{b9Indexer});
		
		Indexer a10Indexer = new A10Indexer();
		Indexer b10Indexer = new B10Indexer();
		Indexer c10Indexer = new C10Indexer();
		Indexer d10Indexer = new D10Indexer();
		
		newIndexer(a10Indexer, new Indexer[]{b10Indexer});
		newIndexer(b10Indexer, new Indexer[]{a10Indexer});
		newIndexer(c10Indexer, new Indexer[]{b10Indexer,d10Indexer});
		newIndexer(d10Indexer, new Indexer[]{c10Indexer});
		
		Indexer a11Indexer = new A11Indexer();
		Indexer b11Indexer = new B11Indexer();
		Indexer c11Indexer = new C11Indexer();
		
		newIndexer(a11Indexer, new Indexer[]{b11Indexer,c11Indexer});
		newIndexer(b11Indexer, new Indexer[]{a11Indexer,c11Indexer});
		newIndexer(c11Indexer, new Indexer[]{b11Indexer,a11Indexer});
		
		Indexer a12Indexer = new A12Indexer();
		Indexer b12Indexer = new B12Indexer();
		Indexer c12Indexer = new C12Indexer();
		Indexer d12Indexer = new D12Indexer();
		Indexer e12Indexer = new E12Indexer();
		Indexer f12Indexer = new F12Indexer();
		
		newIndexer(a12Indexer, new Indexer[]{f12Indexer});
		newIndexer(b12Indexer, new Indexer[]{});
		newIndexer(c12Indexer, new Indexer[]{d12Indexer});
		newIndexer(d12Indexer, new Indexer[]{e12Indexer});
		newIndexer(e12Indexer, new Indexer[]{c12Indexer,b12Indexer});
		newIndexer(f12Indexer, new Indexer[]{e12Indexer});
		
		Indexer a13Indexer = new A13Indexer();
		Indexer b13Indexer = new B13Indexer();
		Indexer c13Indexer = new C13Indexer();
		Indexer d13Indexer = new D13Indexer();
		Indexer e13Indexer = new E13Indexer();
		Indexer f13Indexer = new F13Indexer();
		Indexer g13Indexer = new G13Indexer();
		Indexer h13Indexer = new H13Indexer();
		Indexer i13Indexer = new I13Indexer();
		Indexer j13Indexer = new J13Indexer();
		Indexer k13Indexer = new K13Indexer();
		
		newIndexer(a13Indexer, new Indexer[]{j13Indexer});
		newIndexer(b13Indexer, new Indexer[]{j13Indexer});
		newIndexer(c13Indexer, new Indexer[]{f13Indexer});
		newIndexer(d13Indexer, new Indexer[]{b13Indexer});
		newIndexer(e13Indexer, new Indexer[]{null});
		newIndexer(f13Indexer, new Indexer[]{b13Indexer,d13Indexer});
		newIndexer(g13Indexer, new Indexer[]{j13Indexer});
		newIndexer(h13Indexer, new Indexer[]{a13Indexer});
		newIndexer(i13Indexer, new Indexer[]{k13Indexer});
		newIndexer(j13Indexer, new Indexer[]{c13Indexer});
		newIndexer(k13Indexer, new Indexer[]{h13Indexer,a13Indexer});
		
		Indexer createLoopIndexer = new CreateIndexLoopIndexer();
		Indexer dependLoopIndexer = new DependencyLoopIndexer();
		
		newIndexer(createLoopIndexer, new Indexer[]{});
		newIndexer(dependLoopIndexer, new Indexer[]{});
	}

}
