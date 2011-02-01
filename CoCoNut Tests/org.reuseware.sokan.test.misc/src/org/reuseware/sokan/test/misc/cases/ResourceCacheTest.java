package org.reuseware.sokan.test.misc.cases;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.reuseware.sokan.ID;
import org.reuseware.sokan.index.CommitCache;
import org.reuseware.sokan.index.util.StoreUtil;
import org.reuseware.sokan.test.util.ResourceCacheData;
import org.reuseware.sokan.test.util.TestUtil;

/**
 * @author Matthias Schmidt
 *
 */
public class ResourceCacheTest {
	private ResourceCacheData data = new ResourceCacheData();

	@Before
	public void setUp() throws Exception {
		data.project = TestUtil.createProject(this.getClass().getSimpleName());
		TestUtil.createFolder("dir1", data.project, data);
		TestUtil.createFolder("dir2", data.project, data);

		TestUtil.createArtifactFile("r1", data.dir1, data);
		TestUtil.createArtifactFile("u1", data.dir2, data);

		TestUtil.mark(new File[] { data.dir1, data.dir2 });

		data.cache1 = new CommitCache();
		data.cache2 = new CommitCache();
	}

	@Test
	public void testExtractUpdAndNewIDs() throws IOException {
		assertTrue(data.u1.exists());
		assertTrue(StoreUtil.INSTANCE.isInStore(TestUtil.fileAsURI(data.u1)));

		assertTrue(data.a1 == null);

		// update
		String s = "Some New Content";
		FileWriter writer = new FileWriter(data.u1);
		writer.append(s);
		writer.flush();
		writer.close();

		// add
		TestUtil.createArtifactFile("a1", data.dir2, data);

		assertTrue(data.u1.exists());
		assertTrue(StoreUtil.INSTANCE.isInStore(TestUtil.fileAsURI(data.u1)));
		assertTrue(data.a1.exists());
		assertTrue(StoreUtil.INSTANCE.isInStore(TestUtil.fileAsURI(data.a1)));

		data.cache2.getUpdatedResources().add(TestUtil.fileAsURI(data.u1));
		data.cache2.getNewResources().add(TestUtil.fileAsURI(data.a1));
		List<ID> ids = new LinkedList<ID>(data.cache2.extractUpdAndNewIDs());
		assertFalse(ids.size() == 0);
		assertEquals(data.a1.getName(), ids.get(0).getSegments().get(0));
		assertEquals(data.u1.getName(), ids.get(1).getSegments().get(0));
	}

	@Test
	public void testExtractAllIDs() throws IOException {
		assertTrue(data.r1.exists());
		assertTrue(StoreUtil.INSTANCE.isInStore(TestUtil.fileAsURI(data.r1)));

		// remove
		data.r1.delete();


		assertFalse(data.r1.exists());
		assertTrue(StoreUtil.INSTANCE.isInStore(TestUtil.fileAsURI(data.r1)));

		data.cache1.getDeletedResources().add(TestUtil.fileAsURI(data.r1));
		List<ID> ids = new LinkedList<ID>(data.cache1.extractAllIDs());
		assertFalse(ids.size() == 0);
		assertEquals(data.r1.getName(), ids.get(0).getSegments().get(0));
	}

}
