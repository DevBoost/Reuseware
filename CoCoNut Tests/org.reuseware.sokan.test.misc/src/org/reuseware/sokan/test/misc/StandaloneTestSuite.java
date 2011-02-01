package org.reuseware.sokan.test.misc;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.reuseware.sokan.test.misc.cases.IDContainmentTest;
import org.reuseware.sokan.test.misc.cases.IndexNotifyTest;
import org.reuseware.sokan.test.misc.cases.ResourceCacheTest;
import org.reuseware.sokan.test.misc.cases.SolrSchemaTest;

@RunWith(Suite.class)
@Suite.SuiteClasses( {
	SolrSchemaTest.class,
	IDContainmentTest.class,
	ResourceCacheTest.class,
	IndexNotifyTest.class
	})
public class StandaloneTestSuite {
}
