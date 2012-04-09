/*******************************************************************************
 * Copyright (c) 2006-2012
 * Software Technology Group, Dresden University of Technology
 * DevBoost GmbH, Berlin, Amtsgericht Charlottenburg, HRB 140026
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *   Software Technology Group - TU Dresden, Germany;
 *   DevBoost GmbH - Berlin, Germany
 *      - initial API and implementation
 ******************************************************************************/
package org.reuseware.coconut.test;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;

import static org.junit.Assert.*;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.compare.diff.metamodel.AttributeChange;
import org.eclipse.emf.compare.diff.metamodel.DiffGroup;
import org.eclipse.emf.compare.diff.metamodel.DiffModel;
import org.eclipse.emf.compare.diff.metamodel.ReferenceChange;
import org.eclipse.emf.compare.diff.metamodel.ReferenceChangeLeftTarget;
import org.eclipse.emf.compare.diff.metamodel.ReferenceChangeRightTarget;
import org.eclipse.emf.compare.diff.metamodel.ReferenceOrderChange;
import org.eclipse.emf.compare.diff.service.DiffService;
import org.eclipse.emf.compare.match.MatchOptions;
import org.eclipse.emf.compare.match.metamodel.MatchModel;
import org.eclipse.emf.compare.match.service.MatchService;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.junit.After;
import org.junit.Before;
import org.reuseware.coconut.compositionprogram.CompositionLink;
import org.reuseware.coconut.compositionprogram.CompositionProgram;
import org.reuseware.coconut.compositionprogram.CompositionprogramPackage;
import org.reuseware.coconut.compositionprogram.FragmentInstance;
import org.reuseware.coconut.compositionprogram.resource.UCLResourceFactory;
import org.reuseware.coconut.fracol.resource.fracol.mopp.FracolResourceFactory;
import org.reuseware.coconut.fragment.Fragment;
import org.reuseware.coconut.fragment.PhysicalFragment;
import org.reuseware.coconut.resource.ReuseResources;
import org.reuseware.coconut.resource.util.ReuseResourcesUtil;
import org.reuseware.coconut.reuseextension.evaluator.EvaluatorUtil;
import org.reuseware.coconut.reuseextension.evaluator.ocl.EnhancedOCLEvaluator;
import org.reuseware.coconut.reuseextension.evaluator.ocl.PlainOCLEvaluator;
import org.reuseware.coconut.reuseextension.resource.rex.mopp.RexResourceFactory;
import org.reuseware.coconut.reuseextensionactivator.resource.rexactivator.mopp.Rex_activatorResourceFactory;

public abstract class AbstractReusewareCompositionTestCase {
	public static final String TEMP_STORE_URI = "out";
	
	public static Map<?,?> getLoadOption() {
		return Collections.emptyMap();
	}
	
	abstract public AbstractReusewareTestHelper getTestHelper();
	protected AbstractReusewareTestHelper testHelper = null;
	
	protected ReuseResources reuseResources = ReuseResources.INSTANCE;
	protected boolean doOutput = true;
	protected ResourceSet resourceSet = null;

	protected void assertRegisterFragmentStore(String exampleID, String folder, String[] fileExtensions, boolean allowErrorsInRexActivators) throws Exception {
		testHelper.addStore(exampleID, folder, fileExtensions, allowErrorsInRexActivators);
		update();
	}	
	
	protected void assertRegisterFragmentStore(String exampleID, String folder, String[] fileExtensions) throws Exception {
		testHelper.addStore(exampleID, folder, fileExtensions, false);
		update();
	}	
	
	protected void assertFragmentExists(List<String> UFI) {
		ResourceSet tempResourceSet = resourceSet;
		Fragment fragment = reuseResources.getFragment(UFI, tempResourceSet);
		
		assertTrue("Fragment '" + UFI + "' does not exist", 
				fragment != null);
	}
	
	protected Fragment getFragment(String[] ufiArray) {
		List<String> UFI = Arrays.asList(ufiArray);
		
		ResourceSet tempResourceSet = resourceSet;
		Fragment fragment = reuseResources.getFragment(UFI, tempResourceSet);
		
		assertTrue("Fragment '" + UFI + "' does not exist", 
				fragment != null);
		
		return fragment;
	}
	
	protected CompositionProgram getCompositionProgram(String[] ufiArray) {
		List<String> UCPI = Arrays.asList(ufiArray);
		
		ResourceSet tempResourceSet = resourceSet;
		CompositionProgram compositionProgram = ReuseResourcesUtil.getCompositionProgram(UCPI, tempResourceSet);
		
		assertTrue("Composition program '" + UCPI + "' does not exist", 
				compositionProgram != null);
		
		for(FragmentInstance fi : compositionProgram.getFragmentInstances()) {
			assertFragmentInstanceValid(fi);
		}
		boolean result = true;
		for(CompositionLink link : compositionProgram.getCompositionLinks()) {
			link.match();
			result = result && isLinkValid(link);
		}
		assertTrue("Invalid links in " + compositionProgram.getUCPI(), result);
		return compositionProgram;
	}
	
	protected void assertNotFragmentExists(String[] ufiArray) {
		List<String> UFI = Arrays.asList(ufiArray);

		ResourceSet tempResourceSet = resourceSet;
		Fragment fragment = reuseResources.getFragment(UFI, tempResourceSet);
		
		assertFalse("Fragment '" + UFI + "' does not exist", 
				fragment instanceof PhysicalFragment);
	}

	protected boolean isLinkValid(CompositionLink link) { 
		if(!link.isValid()) {
			System.out.println("  Can not match: " +
					link.getSource().getFragmentRoleName() + "." + link.getSource().getPortName() + " ----> " +
					link.getTarget().getFragmentRoleName() + "." + link.getTarget().getPortName());
			return false;
		}
		if(link.isEmpty()) {
			System.out.println("  Empty link: " +
					link.getSource().getFragmentRoleName() + "." + link.getSource().getPortName() + " ----> " +
					link.getTarget().getFragmentRoleName() + "." + link.getTarget().getPortName());
			return false;
		}
		System.out.println("  Link ok: "
				+ link.getSource().getFragmentRoleName() + "."
				+ link.getSource().getPortName() + " ----> "
				+ link.getTarget().getFragmentRoleName() + "."
				+ link.getTarget().getPortName());
		return true;
	}
	
	protected void assertFragmentInstanceValid(FragmentInstance fragmentInst) {
		assertNotNull("Fragment " + fragmentInst.getUFI() + 
				" not registered but used in cp", fragmentInst.getFragment());
	}
	
	protected void assertFragmentsEqual(List<String> UFI1, List<String> UFI2, String[] attributesToIgnore) throws InterruptedException {
		ResourceSet tempResourceSet = resourceSet;
		
		assertFragmentExists(UFI1);
		Fragment fragment1 = reuseResources.getFragment(UFI1, tempResourceSet);
		
		assertFragmentExists(UFI2);
		Fragment fragment2 = reuseResources.getFragment(UFI2, tempResourceSet);
		
		assertFalse(UFI1 + " is empty", fragment1.getContents().isEmpty());
		assertFalse(UFI2 + " is empty", fragment2.getContents().isEmpty());
		
		// Compare reference with output
		Map<String, Object> options = new HashMap<String, Object>();
		options.put(MatchOptions.OPTION_IGNORE_XMI_ID, true);
		options.put(MatchOptions.OPTION_IGNORE_ID, true);
		
		Resource model1Resource = null;
		for(EObject aRoot : fragment1.getContents()) {
			if(model1Resource == null) {
				model1Resource = aRoot.eResource();
				continue;
			}
			if(model1Resource != aRoot.eResource()) {
				//elements from different resources
				model1Resource = null;
				break;
			}
		}
		Resource model2Resource = null;
		for(EObject aRoot : fragment2.getContents()) {
			if(model2Resource == null) {
				model2Resource = aRoot.eResource();
				continue;
			}
			if(model2Resource != aRoot.eResource()) {
				model2Resource = null;
				break;
			}
		}
		
		//due to a bug in EMFCompare, each model needs to be in a resource 
		//+ EMFCompare needs a resource when a list should be compared
		if (model1Resource == null) {
			model1Resource = new ResourceImpl(URI.createURI("temp1.ecore"));
			model1Resource.getContents().addAll(fragment1.getContents());
		}
		if (model2Resource == null) {
			model2Resource = new ResourceImpl(URI.createURI("temp2.ecore"));
			model2Resource.getContents().addAll(fragment2.getContents());
		}
				
		MatchModel inputMatch = MatchService.doResourceMatch(model1Resource,
				model2Resource, options);
		DiffModel inputDiff = DiffService.doDiff(inputMatch);
		
		for(Iterator<EObject> diffIt = inputDiff.eAllContents(); diffIt.hasNext(); ) {
			EObject localDiff = diffIt.next();
			if (localDiff instanceof DiffGroup) {
				continue;
			}
			if (localDiff instanceof ReferenceOrderChange) {
				//ignore reference order changes
				continue;
			}
			if (localDiff instanceof ReferenceChangeLeftTarget || localDiff instanceof ReferenceChangeRightTarget) {
				if (((ReferenceChange) localDiff).getLeftElement() instanceof EAnnotation && 
						((ReferenceChange) localDiff).getRightElement() instanceof EAnnotation) {
					//in the 'ReuseUML' example there is a change in EAnnotation.references, 
					//although there is only one element in references
					continue;
				}
			}
			
			if (localDiff instanceof AttributeChange) {
				if (Arrays.asList(attributesToIgnore).contains(
						((AttributeChange)localDiff).getAttribute().getName())) {
					continue;
				}
			}
			
			System.err.println("Model diff:" + localDiff);
			
			assertTrue(UFI1 + " and " + UFI2 + " are not equal. Check in DiffView.", false);
		}
		

	}
	
	protected void assertCompositionCorrect(String[] IDArray, String[] referenceIDArray) throws InterruptedException {
		assertCompositionCorrect(IDArray, referenceIDArray, new String[] {});
	}
	
	protected CompositionProgram getCompositionProgramForComposedFragment(List<String> composedUFI) {
		CompositionProgram result = null;
		
		for(List<String> UCPI : reuseResources.getAllCompositionProgramIDs()) {
			ResourceSet tempResourceSet = newResourceSet();
			CompositionProgram compositionProgram = ReuseResourcesUtil.getCompositionProgram(UCPI, tempResourceSet);
			if (compositionProgram != null) {
				for(FragmentInstance fi : compositionProgram.getFragmentInstances()) {
					if (fi.isTarget() && composedUFI.equals(fi.getTargetUFI())) {
						assertFragmentInstanceValid(fi);
						assertNull(composedUFI + " is composed by more than one target fragment instances.", result);
						result = compositionProgram;
					}
				}
			}
		}
		return result;
	}
	
	protected void assertCompositionCorrect(String[] UFIArray, String[] referenceUFIArray, String[] attributesToIgnore) throws InterruptedException {
		List<String> UFI = Arrays.asList(UFIArray);
		List<String> referenceUFI = Arrays.asList(referenceUFIArray);
		
		CompositionProgram compositionProgram = getCompositionProgramForComposedFragment(UFI);
		
		assertNotNull(UFI + " is not a composed fragment.", compositionProgram);

		for(FragmentInstance fragmentInst : compositionProgram.getFragmentInstances()) {
			assertFragmentInstanceValid(fragmentInst);
		}
		
		System.out.println("Checking Composition Program: " + compositionProgram.getUCPI());
		
		boolean result = true;
		for(CompositionLink link : compositionProgram.getCompositionLinks()) {
			link.match();
			result = isLinkValid(link) && result;
		}
		assertTrue("Invalid links in " + compositionProgram.getUCPI(), result);
		
		assertFragmentsEqual(UFI, referenceUFI, attributesToIgnore);
	}
	
	protected void updateArtifact(EObject elementInArtifact) throws IOException {
		assertNotNull(elementInArtifact.eResource());
		elementInArtifact.eResource().save(resourceSet.getLoadOptions());
		testHelper.registerArtifact(elementInArtifact.eResource().getURI());
	}

	
	protected void update() {
		testHelper.update();
	}

	protected ResourceSet newResourceSet() {
		ResourceSet resourceSet = new ResourceSetImpl();
		
		EPackage.Registry.INSTANCE.put(
				CompositionprogramPackage.eNS_URI, CompositionprogramPackage.eINSTANCE);
		
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(
				Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(
				"ecore", new EcoreResourceFactoryImpl());
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(
				"fracol", new FracolResourceFactory());
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(
				"rex", new RexResourceFactory());
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(
				"rex_activator", new Rex_activatorResourceFactory());
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(
				"ucl", new UCLResourceFactory());
		
		resourceSet.getLoadOptions().putAll(getLoadOption());
				
		return resourceSet;
	}

	protected void assertFolderStructureContainedIn(
			String project1ID, String folder1Name,
			String project2ID, String folder2Name,
			boolean ignoreLineOrder) throws Exception {
		
		File folder1 = new File(".." + File.separator + project1ID + File.separator + folder1Name);
		File folder2 = new File(".." + File.separator + project2ID + File.separator + folder2Name);
		
		assertFolderStructureContainedIn(folder1, folder2, ignoreLineOrder);
	}
	
	
	protected void assertFolderStructureContainedIn(File containedFolder, File containingFolder, boolean ignoreLineOrder) throws Exception {
		
		File[] containedFileList = containedFolder.listFiles();
		File[] containingFileList = containingFolder.listFiles();
		
		for (int i = 0; i < containedFileList.length; i++) {
			File containedFile = containedFileList[i];
			//do not check hidden files (e.g., .store)
			if (containedFile.getName().startsWith(".")) {
				continue;
			}
			boolean found = false;
			for (int j = 0; j < containingFileList.length; j++) {
				File containingFile = containingFileList[j];
				
				if (containedFile.isDirectory() == containingFile.isDirectory()) {
					if (containedFile.getName().equals(containingFile.getName())) {
						found = true;
						if (containedFile.isDirectory()) {
							assertFolderStructureContainedIn(containedFile, containingFile, ignoreLineOrder);
						}
						else {
							//compare file content
						    byte[] buffer1 = new byte[(int) containedFile.length()];
						    BufferedInputStream is1 = new BufferedInputStream(new FileInputStream(containedFile));
						    is1.read(buffer1);
						    byte[] buffer2 = new byte[(int) containingFile.length()];
						    BufferedInputStream is2 = new BufferedInputStream(new FileInputStream(containingFile));
						    is2.read(buffer2);
						    
						    String s1 = new String(buffer1);
						    String s2 = new String(buffer2);
						    
						    if (ignoreLineOrder) {
						    	SortedSet<String> s1LineList = new TreeSet<String>(Arrays.asList(s1.split("\n")));
						    	SortedSet<String> s2LineList = new TreeSet<String>(Arrays.asList(s2.split("\n")));
						    	Iterator<String> s1Iterator = s1LineList.iterator();
						    	Iterator<String> s2Iterator = s2LineList.iterator();
						    	while (s1Iterator.hasNext() && s2Iterator.hasNext()) {
							    	assertEquals("File content differs: " + containingFile.getName(), s1Iterator.next(), s2Iterator.next());
						    	}
						    }
						    else {
							    //because in some exercises files get extended, we only compare
							    //the beginning of the file and cut the last character (which should be "}")
							    if (s1.length() < s2.length() ) {
							    	s1 = s1.substring(0, s1.length() - 1);
							    	s2 = s2.substring(0, s1.length());
							    }
							    assertEquals("File content differs: " + containingFile.getName(), s1, s2);
						    }
						}
					}
				}
			}
			assertTrue("No equivalent file found: " + containedFile, found);
		}
	}
	
	@Before
	public void setUp() throws Exception {
		testHelper = getTestHelper();
		testHelper.setTest(this);
		testHelper.initReuseResources();
		
		EvaluatorUtil.addEvaluator(new EnhancedOCLEvaluator());
		EvaluatorUtil.addEvaluator(new PlainOCLEvaluator());

		resourceSet = newResourceSet();
	}
	
	@After
	public void tearDown() throws Exception {
		reuseResources.shutDown();
		resourceSet = null;
		testHelper = null;
	}

	public void setDoOutput(boolean doOutput) {
		this.doOutput = doOutput;
	}
}
