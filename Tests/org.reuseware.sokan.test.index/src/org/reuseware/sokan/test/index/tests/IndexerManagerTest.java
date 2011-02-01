package org.reuseware.sokan.test.index.tests;

public class IndexerManagerTest {
	// private static final ResourceUtil resUtil = ResourceUtil.INSTANCE;
	// private static final TestData data = TestData.INSTANCE;

	// @Test
	// public void testCreateIndexRowID() {
	// // not existing file
	// ID idNotExist = resUtil.idFrom(data.notExistFile.getName());
	// assertNotNull(idNotExist);
	// IndexRow rowNotExist = data.indexerManagerInst.createIndexRow(
	// idNotExist, null, null);
	// assertNull(rowNotExist);
	//
	// // file indexed as artifact
	// ID idA3 = resUtil.idFrom(data.a3);
	// assertNotNull(idA3);
	// IndexRow rowA3 = data.indexerManagerInst.createIndexRow(idA3, null,
	// null);
	// assertNotNull(rowA3);
	// assertTrue(rowA3.getDirty().size() == 0);
	// assertTrue(rowA3.getArtifactID().equals(resUtil.idFrom("A3")));
	// }

	// @Test
	// public void testCreateIndexRowIResource() {
	// // not existing file
	// IFile fileNotExist = data.notExistFile;
	// assertNotNull(fileNotExist);
	// assertFalse(fileNotExist.exists());
	// IndexRow rowNotExists = data.indexerManagerInst
	// .createIndexRow(fileNotExist);
	// assertNull(rowNotExists);
	//
	// // file in workspace but not indexed
	// IFile notInStoreFile = data.notinstorefile;
	// assertTrue(notInStoreFile.exists());
	// assertFalse(StoreUtil.INSTANCE.isInStore(notInStoreFile));
	// IndexRow notStoreRow = data.indexerManagerInst
	// .createIndexRow(notInStoreFile);
	// assertNull(notStoreRow);
	//
	// // file indexed as artifact
	// IFile file = data.a3;
	// assertNotNull(file);
	// assertTrue(file.exists());
	// assertTrue(IndexUtil.INSTANCE.isArtifact(file));
	//
	// IndexRow rowA3 = data.indexerManagerInst.createIndexRow(file);
	// assertNotNull(rowA3);
	// assertTrue(rowA3.getDirty().size() == 0);
	// assertTrue(rowA3.getArtifactID().equals(resUtil.idFrom("A3")));
	// }
}
