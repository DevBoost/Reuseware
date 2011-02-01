package org.reuseware.sokan.test.util;

import java.io.File;
import java.io.IOException;

import org.reuseware.sokan.index.util.IndexUtil;


public class TestDataBuilder {
	public static final TestDataBuilder INSTANCE = new TestDataBuilder();

	private static final TestData data = TestData.INSTANCE;

	private static boolean dataIsBuild;
	private static File testDataProject;

	private TestDataBuilder() {
		dataIsBuild = false;
	}

	public void build() throws IOException {
		if (dataIsBuild)
			return;

		buildWorkspace();
		createOthers();

		dataIsBuild = true;
	}

	private void buildWorkspace() throws IOException {
		// create the main project
		testDataProject = TestUtil.createProject("TestDataProject");

		// create some parent folders
		File single = TestUtil.createFolder("single", testDataProject, null);
		File dual = TestUtil.createFolder("dual", testDataProject, null);

		// create some store folders
		File trivial = TestUtil.createFolder("trivial", single, data);
		File list = TestUtil.createFolder("list", single, data);
		File binaryList = TestUtil.createFolder("binaryList", single, data);
		File binaryTree = TestUtil.createFolder("binaryTree", single, data);
		File complexPos = TestUtil.createFolder("complexPos", single, data);
		File complexNeg = TestUtil.createFolder("complexNeg", single, data);

		File dualTrivial = TestUtil.createFolder("dualTrivial", dual, data);
		File dualNormal = TestUtil.createFolder("dualNormal", dual, data);
		File dualComplex = TestUtil.createFolder("dualComplex", dual, data);

		File multi = TestUtil.createFolder("multi", testDataProject, data);
		
		// mark folders as store
		File[] stores = { trivial, list, binaryList, binaryTree, complexPos,
				complexNeg, dualTrivial, dualNormal, dualComplex, multi };
		TestUtil.mark(stores);

		// create the artifact files
		TestUtil.createArtifactFile(data.getCase(1), trivial, data);
		TestUtil.createArtifactFile(data.getCase(2), trivial, data);

		TestUtil.createArtifactFile(data.getCase(3), list, data);
		TestUtil.createArtifactFile(data.getCase(4), list, data);
		TestUtil.createArtifactFile(data.getCase(5), list, data);
		TestUtil.createArtifactFile(data.getCase(6), list, data);
		TestUtil.createArtifactFile(data.getCase(7), list, data);
		TestUtil.createArtifactFile(data.getCase(8), list, data);
		TestUtil.createArtifactFile(data.getCase(9), list, data);

		TestUtil.createArtifactFile(data.getCase(10), binaryList, data);
		TestUtil.createArtifactFile(data.getCase(11), binaryList, data);
		TestUtil.createArtifactFile(data.getCase(12), binaryList, data);
		TestUtil.createArtifactFile(data.getCase(13), binaryList, data);
		TestUtil.createArtifactFile(data.getCase(14), binaryList, data);
		TestUtil.createArtifactFile(data.getCase(15), binaryList, data);
		TestUtil.createArtifactFile(data.getCase(16), binaryList, data);

		TestUtil.createArtifactFile(data.getCase(17), binaryTree, data);
		TestUtil.createArtifactFile(data.getCase(18), binaryTree, data);
		TestUtil.createArtifactFile(data.getCase(19), binaryTree, data);
		TestUtil.createArtifactFile(data.getCase(20), binaryTree, data);
		TestUtil.createArtifactFile(data.getCase(21), binaryTree, data);
		TestUtil.createArtifactFile(data.getCase(22), binaryTree, data);
		TestUtil.createArtifactFile(data.getCase(23), binaryTree, data);
		TestUtil.createArtifactFile(data.getCase(24), binaryTree, data);

		TestUtil.createArtifactFile(data.getCase(25), complexPos, data);
		TestUtil.createArtifactFile(data.getCase(26), complexPos, data);
		TestUtil.createArtifactFile(data.getCase(27), complexPos, data);
		TestUtil.createArtifactFile(data.getCase(28), complexPos, data);
		TestUtil.createArtifactFile(data.getCase(29), complexPos, data);
		TestUtil.createArtifactFile(data.getCase(30), complexPos, data);
		TestUtil.createArtifactFile(data.getCase(31), complexPos, data);

		TestUtil.createArtifactFile(data.getCase(32), complexNeg, data);
		TestUtil.createArtifactFile(data.getCase(33), complexNeg, data);
		TestUtil.createArtifactFile(data.getCase(34), complexNeg, data);
		TestUtil.createArtifactFile(data.getCase(35), complexNeg, data);

		TestUtil.createArtifactFile(data.getCase(36), dualTrivial, data);
		TestUtil.createArtifactFile(data.getCase(37), dualTrivial, data);
		TestUtil.createArtifactFile(data.getCase(38), dualTrivial, data);

		TestUtil.createArtifactFile(data.getCase(39), dualNormal, data);
		TestUtil.createArtifactFile(data.getCase(40), dualNormal, data);
		TestUtil.createArtifactFile(data.getCase(41), dualNormal, data);
		TestUtil.createArtifactFile(data.getCase(42), dualNormal, data);
		TestUtil.createArtifactFile(data.getCase(43), dualNormal, data);
		TestUtil.createArtifactFile(data.getCase(44), dualNormal, data);
		TestUtil.createArtifactFile(data.getCase(45), dualNormal, data);

		TestUtil.createArtifactFile(data.getCase(46), dualComplex, data);
		TestUtil.createArtifactFile(data.getCase(47), dualComplex, data);
		TestUtil.createArtifactFile(data.getCase(48), dualComplex, data);

		TestUtil.createArtifactFile(data.getCase(49), multi, data);
		TestUtil.createArtifactFile(data.getCase(50), multi, data);

		IndexUtil.INSTANCE.commitIndex();
	}

	private void createOthers() throws IOException {
		data.noStore = TestUtil.createFolder("noStore", testDataProject, null);
		data.notExistFile = new File(data.noStore + "/notExistFile");
		TestUtil.createArtifactFile("notInStoreFile", data.noStore, data);
		IndexUtil.INSTANCE.commitIndex();
		data.updateFlag = false;
	}
	
}
