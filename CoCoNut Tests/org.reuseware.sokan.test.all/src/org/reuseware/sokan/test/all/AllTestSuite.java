package org.reuseware.sokan.test.all;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.reuseware.sokan.test.index.tests.DependencyManagerTest;
import org.reuseware.sokan.test.index.tests.IndexNotifyDeltaTest;
import org.reuseware.sokan.test.index.tests.IndexUtilTest;
import org.reuseware.sokan.test.index.tests.MultiValueTest;
import org.reuseware.sokan.test.indexer.tests.IndexerSorterTest;
import org.reuseware.sokan.test.indexer.tests.MultiPhaseCommitTest;
import org.reuseware.sokan.test.misc.cases.IDContainmentTest;
import org.reuseware.sokan.test.misc.cases.IndexNotifyTest;
import org.reuseware.sokan.test.misc.cases.ResourceCacheTest;

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
}
