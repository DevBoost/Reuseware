/*******************************************************************************
 * Copyright (c) 2006-2009
 * Software Technology Group, Dresden University of Technology
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Software Technology Group - TU Dresden, Germany
 *      - initial API and implementation
 ******************************************************************************/
package org.reuseware.coconut.roundtrip.test;

import java.io.IOException;
import java.util.Collections;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.junit.Assert;
import org.reuseware.coconut.compositionprogram.CompositionLink;
import org.reuseware.coconut.compositionprogram.CompositionProgram;
import org.reuseware.coconut.compositionprogram.CompositionprogramFactory;
import org.reuseware.coconut.compositionprogram.FragmentInstance;
import org.reuseware.coconut.compositionprogram.PhysicalCompositionProgram;
import org.reuseware.coconut.compositionprogram.PortInstance;
import org.reuseware.coconut.compositionprogram.util.CompositionProgramUtil;
import org.reuseware.coconut.fragment.Fragment;
import org.reuseware.coconut.fragment.FragmentFactory;
import org.reuseware.coconut.repository.resource.ReuseResources;

public class ComponentsCreator {

	public static final String PATH_TO_INPUT_DIR = "./input/";
	public static final String PATH_TO_COMPARE_DIR = PATH_TO_INPUT_DIR + "compare/";
	public static final String WORKING_DIR_NAME = "work";
	public static final String OUTPUT_DIR_NAME = "out";
	public static final String PATH_TO_WORKING_DIR = "./" + WORKING_DIR_NAME + "/";
	public static final String PATH_TO_OUTPUT_DIR = "./" + OUTPUT_DIR_NAME + "/";
	public static final String PATH_TO_WORKING_REPOSITORY_DIR = PATH_TO_WORKING_DIR + "repository/";
	public static final String PATH_TO_OUTPUT_REPOSITORY_DIR = PATH_TO_OUTPUT_DIR + "repository/";
	
	public static final String REPOSITORY_UFI = "repository";
	
	public static final String JAVA_TARGET_1 = "Target1.java";
	public static final String JAVA_TARGET_2 = "Target2.java";

	private static final String COMPOSED = "composed";
	public static final String UFI_TARGET1 = REPOSITORY_UFI + "/" + JAVA_TARGET_1;
	public static final String UFI_TARGET2 = REPOSITORY_UFI + "/" + JAVA_TARGET_2;
	
	public static final String JAVA_COMPOSED_1 = "Composed1.java";
	public static final String JAVA_COMPOSED_2 = "Composed2.java";

	private static final String COMPOSED_UFI = REPOSITORY_UFI + "/" + COMPOSED;
	
	public static final String UFI_COMPOSED_1 = COMPOSED_UFI + "/" + JAVA_COMPOSED_1;
	public static final String UFI_COMPOSED_2 = COMPOSED_UFI + "/" + JAVA_COMPOSED_2;

	public static final String JAVA_SOURCE_1 = "Source1.java";
	public static final String JAVA_SOURCE_2 = "Source2.java";
	public static final String JAVA_SOURCE_3 = "Source3.java";
	public static final String JAVA_SOURCE_4 = "Source4.java";

	public static final String UFI_SOURCE_1 = REPOSITORY_UFI + "/" + JAVA_SOURCE_1;
	public static final String UFI_SOURCE_2 = REPOSITORY_UFI + "/" + JAVA_SOURCE_2;
	public static final String UFI_SOURCE_3 = REPOSITORY_UFI + "/" + JAVA_SOURCE_3;
	
	private static final String REUSEWARE = ReuseResources.REUSEWARE_SCHEME;
	
	public static final String REUSEWARE_UFI_SOURCE_1 = REUSEWARE + REPOSITORY_UFI + "/" + JAVA_SOURCE_1;
	public static final String REUSEWARE_UFI_SOURCE_2 = REUSEWARE + REPOSITORY_UFI + "/" + JAVA_SOURCE_2;
	public static final String REUSEWARE_UFI_SOURCE_3 = REUSEWARE + REPOSITORY_UFI + "/" + JAVA_SOURCE_3;
	
	public void saveCompositionProgram(CompositionProgram cp,
			String location) {

		ResourceSet resourceSet = new ResourceSetImpl();
		Resource newFile = resourceSet.createResource(URI
				.createFileURI(location));

		newFile.getContents().clear();
		newFile.getContents().add(cp);
		try {
			newFile.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public CompositionProgram createCompositionProgram1() {

		PhysicalCompositionProgram cp = CompositionprogramFactory.eINSTANCE
				.createPhysicalCompositionProgram();

		FragmentInstance source1 = CompositionProgramUtil
		.createFragmentInstance(createSource(JAVA_SOURCE_1, UFI_SOURCE_1,
				"Prototype_Fragment1"), cp);
		
		FragmentInstance source2 = CompositionProgramUtil
		.createFragmentInstance(createSource(JAVA_SOURCE_2, UFI_SOURCE_2,
				"Prototype_Fragment2"), cp);

		FragmentInstance targetFragment = CompositionProgramUtil
				.createFragmentInstance(createTarget(JAVA_TARGET_1, UFI_TARGET1,
						"Hook_Fragment1", "Hook_Fragment2"), cp);
		targetFragment.setTarget(true);
		targetFragment.setTargetUFIAsString(UFI_COMPOSED_1);

		EList<PortInstance> ports1 = source1.getPortInstances();
		Assert.assertEquals(1, ports1.size());
		EList<PortInstance> ports2 = source2.getPortInstances();
		Assert.assertEquals(1, ports2.size());
		EList<PortInstance> targetPorts = targetFragment.getPortInstances();
		Assert.assertEquals(2, targetPorts.size());

		createCompositionLink(cp, ports1.get(0), targetPorts.get(0));
		createCompositionLink(cp, ports2.get(0), targetPorts.get(1));

		return cp;
	}

	public CompositionProgram createCompositionProgram2() {

		PhysicalCompositionProgram cp = CompositionprogramFactory.eINSTANCE
				.createPhysicalCompositionProgram();

		FragmentInstance targetFragment = org.reuseware.coconut.compositionprogram.util.CompositionProgramUtil
				.createFragmentInstance(createTarget(JAVA_TARGET_2,
						UFI_TARGET2, "Hook_Fragment1",
						"Hook_Fragment2"), cp);

		targetFragment.setTarget(true);
		targetFragment.setTargetUFIAsString(UFI_COMPOSED_2);

		FragmentInstance source1 = org.reuseware.coconut.compositionprogram.util.CompositionProgramUtil
				.createFragmentInstance(createSource(JAVA_SOURCE_3, UFI_SOURCE_3,
						"Prototype_Fragment1"), cp);
		FragmentInstance source2 = org.reuseware.coconut.compositionprogram.util.CompositionProgramUtil
				.createFragmentInstance(createSource(JAVA_SOURCE_2, UFI_SOURCE_2,
						"Prototype_Fragment2"), cp);

		EList<PortInstance> source1Ports = source1.getPortInstances();
		EList<PortInstance> source2Ports = source2.getPortInstances();
		EList<PortInstance> targetPorts = targetFragment.getPortInstances();
		
		createCompositionLink(cp, source1Ports.get(0), targetPorts.get(0));
		createCompositionLink(cp, source2Ports.get(0), targetPorts.get(1));

		cp.getFragmentInstances().add(targetFragment);
		cp.getFragmentInstances().add(source1);
		cp.getFragmentInstances().add(source2);

		return cp;
	}

	private void createCompositionLink(CompositionProgram cp, PortInstance p1,
			PortInstance s1p) {

		CompositionLink l1 = CompositionprogramFactory.eINSTANCE.createCompositionLink();

		l1.setSource(p1);
		l1.setTarget(s1p);
		l1.match();

		cp.getCompositionLinks().add(l1);
	}

	private Fragment createTarget(String name, String ufi, 
			String portname1, String portname2) {

		Fragment target = FragmentFactory.eINSTANCE.createPhysicalFragment();
		target.setIDAsString(ufi);

		return target;
	}

	private Fragment createSource(String name, String ufi,
			String PortInstancename) {

		Fragment sourceFragment = FragmentFactory.eINSTANCE
				.createPhysicalFragment();
		sourceFragment.setIDAsString(ufi);

		return sourceFragment;
	}
}
