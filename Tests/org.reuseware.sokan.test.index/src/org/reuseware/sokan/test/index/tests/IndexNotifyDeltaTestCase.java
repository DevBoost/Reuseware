package org.reuseware.sokan.test.index.tests;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.util.Set;

import org.eclipse.emf.common.util.URI;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.reuseware.sokan.ID;
import org.reuseware.sokan.IndexRow;
import org.reuseware.sokan.index.util.IndexUtil;
import org.reuseware.sokan.index.util.ResourceUtil;
import org.reuseware.sokan.test.index.notify.TestIndexListener;
import org.reuseware.sokan.test.util.TestData;
import org.reuseware.sokan.test.util.TestUtil;

/**
 * @author Matthias Schmidt
 * 
 */
public class IndexNotifyDeltaTestCase {

	private static final TestData DATA = TestData.INSTANCE;
	private static final IndexUtil INDEX = IndexUtil.INSTANCE;

	private ID idH50;
	private ID idRem;
	private TestIndexListener listener;

	@Before
	public void setUp() throws IOException {
		idH50 = ResourceUtil.idFrom(TestUtil.fileAsURI(DATA.h50));
		TestUtil.createArtifactFile("deltaTestREMOVE", DATA.multi, DATA);
		IndexUtil.INSTANCE.commitIndex();
		idRem = ResourceUtil.idFrom(TestUtil.fileAsURI(DATA.deltaTestREMOVE));

		listener = new TestIndexListener();
		INDEX.addListener(listener);

		listener.setMyDelta(null);
		TestUtil.change(DATA.h50);
		IndexUtil.INSTANCE.commitIndex();
		sleep();
	}

	@After
	public void cleanUp() {
		INDEX.removeListener(listener);
	}

	@Test
	public void testAdd() throws IOException {
		listener.setMyDelta(null);
		ID idAdd = ResourceUtil.idFrom("deltaTestADD");
		TestUtil.createArtifactFile("deltaTestADD", DATA.multi, DATA);
		IndexUtil.INSTANCE.commitIndex();
		sleep();
		Set<ID> delta = listener.getMyDelta();
		assertNotNull(delta);
		assertTrue(delta.contains(idAdd));
	}

	@Test
	public void testUpdate() throws IOException {
		listener.setMyDelta(null);
		//IndexRow oldRow = INDEX.getIndex(idH50);
		TestUtil.change(DATA.h50);
		IndexUtil.INSTANCE.commitIndex();
		sleep();
		Set<ID> delta = listener.getMyDelta();
		assertNotNull(delta);
		IndexRow currentRow = INDEX.getIndex(idH50);
		assertTrue(delta.contains(currentRow.getArtifactID()));
	}

	@Test
	public void testRemove() throws IOException {
		listener.setMyDelta(null);
		IndexRow oldRow = INDEX.getIndex(idRem);
		DATA.deltaTestREMOVE.delete();
		IndexUtil.INSTANCE.removeArtifact(URI.createFileURI(
				DATA.deltaTestREMOVE.getCanonicalPath()));
		IndexUtil.INSTANCE.commitIndex();
		sleep();
		Set<ID> delta = listener.getMyDelta();
		assertNotNull(delta);
		assertTrue(delta.contains(oldRow.getArtifactID()));
	}

	private void sleep() {
		TestUtil.waitForIndexingToFinish();
	}
}
