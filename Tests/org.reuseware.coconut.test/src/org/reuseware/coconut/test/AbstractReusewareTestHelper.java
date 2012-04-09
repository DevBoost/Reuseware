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

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import junit.framework.TestCase;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource.Diagnostic;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.reuseware.coconut.compositionprogram.CompositionProgram;
import org.reuseware.coconut.fracol.FragmentCollaboration;
import org.reuseware.coconut.fragment.Fragment;
import org.reuseware.coconut.fragment.PhysicalFragment;
import org.reuseware.coconut.resource.ReuseResourceAccess;
import org.reuseware.coconut.resource.util.ReuseResourcesUtil;
import org.reuseware.coconut.reuseextension.ComponentModelSpecification;
import org.reuseware.coconut.reuseextension.CompositionLanguageSpecification;
import org.reuseware.coconut.reuseextension.ReuseExtension;
import org.reuseware.coconut.reuseextensionactivator.ReuseExtensionActivatorList;

public abstract class AbstractReusewareTestHelper {
	
	protected ReuseResourceAccess access;
	protected AbstractReusewareCompositionTestCase test;
	
	public void setAccess(ReuseResourceAccess access) {
		this.access = access;
	}
	public void setTest(AbstractReusewareCompositionTestCase test) {
		this.test = test;
	}
	
	public static void deleteDirectory(File path, boolean deleteMyself, boolean deleteHidden) {
		if (path.exists()) {
			File[] files = path.listFiles();
			for (int i = 0; i < files.length; i++) {
				if (deleteHidden || !files[i].getName().startsWith(".")) {
					if (files[i].isDirectory()) {
						deleteDirectory(files[i], true, deleteHidden);
					} else {
						files[i].delete();
					}	
				}
			}
		}
		if (deleteMyself) {
			path.delete();
		}
	}
	
	protected void addStore(String exampleID, String folder, String[] fileExtensions, boolean allowErrorsInRexActivators) throws IOException {
		String storeFolderPath = "../" + exampleID + "/" + folder;
		File storeFolder = new File(storeFolderPath);
		TestCase.assertTrue("Folder " + storeFolder + " should exist.", storeFolder.exists());
		
		String tempFolderPath = "../" + exampleID + "/" + AbstractReusewareCompositionTestCase.TEMP_STORE_URI;
		File tempFolder = new File(tempFolderPath);
		
		URI storeFolderURI   = createURI(storeFolder.getCanonicalPath()); 
		URI tempStoreBaseURI = createURI(tempFolder.getCanonicalPath());
		
		registerStore(storeFolderURI);
		
		assertRegisterCompositionSystems(storeFolder, tempStoreBaseURI);
		assertRegisterReuseExtensions(storeFolder, tempStoreBaseURI);
		assertRegisterReuseExtensionActivators(storeFolder, tempStoreBaseURI, allowErrorsInRexActivators);
		assertRegisterFragments(storeFolder, tempStoreBaseURI, fileExtensions);
		assertRegisterCompositionPrograms(storeFolder, tempStoreBaseURI);
	}
	
	protected URI createURI(String path) throws IOException {
		File file = new File(path);
		return URI.createFileURI(file.getCanonicalPath());
	}
	
	protected void assertRegisterCompositionSystems(File folder, URI tempStoreBaseURI) throws IOException {
		for(File file : listFilesOrdered(folder)) {
			if(file.isDirectory()) {
				assertRegisterCompositionSystems(file, tempStoreBaseURI);
			}
			else {
				if ("fracol".equals(getFileExtension(file))) {
					assertRegisterFragmentCollaboration(file.getCanonicalPath(), tempStoreBaseURI);
				}
			}
		}
	}
	
	protected void assertRegisterReuseExtensions(File folder, URI tempStoreBaseURI) throws IOException {
		for(File file : listFilesOrdered(folder)) {
			if(file.isDirectory()) {
				assertRegisterReuseExtensions(file, tempStoreBaseURI);
			}
			else {
				if ("rex".equals(getFileExtension(file))) {
					assertRegisterReuseExtension(file.getCanonicalPath(), tempStoreBaseURI);
				}
			}
		}
	}
	
	protected void assertRegisterReuseExtensionActivators(File folder, URI tempStoreBaseURI, boolean allowErrors) throws IOException {
		for(File file : listFilesOrdered(folder)) {
			if(file.isDirectory()) {
				assertRegisterReuseExtensionActivators(file, tempStoreBaseURI, allowErrors);
			}
			else {
				if ("rex_activator".equals(getFileExtension(file))) {
					assertRegisterReuseExtensionActivatorList(file.getCanonicalPath(), tempStoreBaseURI, allowErrors);
				}
			}
		}
	}
	
	protected void assertRegisterFragments(File folder, URI tempStoreBaseURI, String [] fileExtensions) throws IOException {
		for(File file : listFilesOrdered(folder)) {
			if(file.isDirectory()) {
				assertRegisterFragments(file, tempStoreBaseURI, fileExtensions);
			}
			else {
				if (Arrays.asList(fileExtensions).contains(getFileExtension(file))) {
					assertRegisterFragment(file.getCanonicalPath(), tempStoreBaseURI);
				}
			}
		}
	}
	
	protected void assertRegisterCompositionPrograms(File folder, URI tempStoreBaseURI) throws IOException {
		for(File file : listFilesOrdered(folder)) {
			if(file.isDirectory()) {
				assertRegisterCompositionPrograms(file, tempStoreBaseURI);
			}
			else {
				if ("ucl".equals(getFileExtension(file))) {
					assertRegisterCompositionProgram(file.getCanonicalPath(), tempStoreBaseURI);
				}
			}
		}
	}
	
	protected void assertRegisterFragmentCollaboration(String file, URI tempStoreBaseURI) throws IOException  {
		URI uri = createURI(file);
		boolean registered = registerArtifact(uri);
		assertTrue("Registration fracol '" + uri + "' failed", registered);

		ResourceSet tempResourceSet = test.resourceSet;
		List<String> csysID = test.reuseResources.getID(uri);
		FragmentCollaboration fracol = ReuseResourcesUtil.getFragmentCollaboration(csysID, tempResourceSet);
		
		assertTrue("Registration of fracol '" + csysID + "' failed", 
				fracol != null);
		
		EcoreUtil.resolveAll(fracol.eResource());
		
		List<String> fracolID = new ArrayList<String>();
		fracolID.addAll(fracol.getFracolNamespace());
		fracolID.add(fracol.getFracolName());
		
		for(Diagnostic error : fracol.eResource().getErrors()) {
			System.out.println("Error in " + fracolID + ": " + error.getMessage() );
		}
		
		assertTrue("Errors found in " + fracolID, fracol.eResource().getErrors().isEmpty());
		
		if (test.doOutput) {
			System.out.println("Registered fracol: " + fracolID);		
		}
	}
	
	protected void assertRegisterReuseExtension(String file, URI tempStoreBaseURI) throws IOException  {
		URI uri = createURI(file);
		boolean registered =  registerArtifact(uri);
		assertTrue("Registration of REX '" + uri + "' failed", registered);
		
		ResourceSet tempResourceSet = test.resourceSet;
		List<String> rexID = test.reuseResources.getID(uri);
		ReuseExtension reuseExtension = ReuseResourcesUtil.getReuseExtension(rexID, tempResourceSet);
		
		assertTrue("Registration of REX '" + rexID + "' failed", 
				reuseExtension != null);
		
		EcoreUtil.resolveAll(reuseExtension.eResource());
		
		rexID = new ArrayList<String>();
		rexID.addAll(reuseExtension.getRexNamespace());
		rexID.add(reuseExtension.getRexName());
		
		for(Diagnostic error : reuseExtension.eResource().getErrors()) {
			System.out.println("Error in " + rexID + ": " + error.getMessage() );
		}
		
		assertTrue("Errors found in " + rexID, reuseExtension.eResource().getErrors().isEmpty());

		if (test.doOutput && reuseExtension instanceof ComponentModelSpecification) {
			System.out.println("Registered REX_cm: " + rexID);
		}
		if (test.doOutput && reuseExtension instanceof CompositionLanguageSpecification) {
			System.out.println("Registered REX_cl: " + rexID);
		}
	}
	
	protected void assertRegisterReuseExtensionActivatorList(String file, URI tempStoreBaseURI, boolean allowErrors) throws IOException  {
		URI uri = createURI(file);
		boolean registered =  registerArtifact(uri);
		assertTrue("Registration of REX Activator'" + uri + "' failed", registered);
		
		ResourceSet tempResourceSet = test.resourceSet;
		List<String> rexActivatorListID = test.reuseResources.getID(uri);
		ReuseExtensionActivatorList rexActivatorList = 
			ReuseResourcesUtil.getReuseExtensionActivatorList(rexActivatorListID, tempResourceSet);
		
		assertTrue("Registration of REX Activator'" + rexActivatorListID + "' failed", 
				rexActivatorList != null);
		
		EcoreUtil.resolveAll(rexActivatorList.eResource());
		
		if (!allowErrors) {
			for(Diagnostic error : rexActivatorList.eResource().getErrors()) {
				System.out.println("Error in " + rexActivatorListID + ": " + error.getMessage() );
			}
			
			assertTrue("Errors found in " + rexActivatorListID, rexActivatorList.eResource().getErrors().isEmpty());
		}
		if (test.doOutput) {
			System.out.println("Registered REX Activator: " + rexActivatorListID);
		}
	}
	
	protected void assertRegisterFragment(String file, URI tempStoreBaseURI) throws IOException  {
		URI uri = createURI(file);
		boolean registered = registerArtifact(uri);
		assertTrue("Registration of fragment '" + uri + "' failed", registered);

		ResourceSet tempResourceSet = test.resourceSet;
		List<String> UFI =test.reuseResources.getID(uri);
		Fragment fragment  = test.reuseResources.getFragment(UFI, tempResourceSet);
		
		assertTrue("Registration of fragment '" + UFI + "' failed", 
				fragment instanceof PhysicalFragment);
		
		if (test.doOutput) {
			System.out.println("Registered Fragment: " + fragment.getUFI());
		}
	}
	
	protected void assertRegisterCompositionProgram(String file, URI tempStoreBaseURI) throws IOException {
		URI uri = createURI(file);
		boolean registered = registerArtifact(uri);
		assertTrue("Registration of composition program '" + uri + "' failed", registered);
		
		ResourceSet tempResourceSet = test.resourceSet;
		List<String> UCPI = test.reuseResources.getID(uri);
		CompositionProgram compositionProgram  = ReuseResourcesUtil.getCompositionProgram(UCPI, tempResourceSet);
		
		if (compositionProgram == null) {
			//try to load to get XML parser exceptions			
			new ResourceSetImpl().getResource(uri, true);
			fail("Registration of composition program '" + UCPI + "' failed");
		}
		
		if (test.doOutput) {
			System.out.println("Registered Composition Program: " + compositionProgram.getUCPI());
		}
	}
	
	private String getFileExtension(File file) {
		if(!file.getName().contains(".")) {
			return "";
		}
		else {
			String ext = file.getName().substring(file.getName().lastIndexOf(".") + 1);
			return ext;
		}	
	}
	
	private Set<File> listFilesOrdered(File parent) {
		Set<File> result = new TreeSet<File>(new Comparator<File>() {
	
			public int compare(File f1, File f2) {
				if (!f1.isDirectory() && f2.isDirectory()) {
					//directories first, files second
					return 1;
				}
				if (f1.isDirectory() && !f2.isDirectory()) {
					//directories first, files second
					return -1;
				}
				return f1.getName().compareTo(f2.getName());
			}
		});
		
		result.addAll(Arrays.asList(parent.listFiles()));
		
		return result;
	}
	
	abstract protected void initReuseResources() throws IOException;
	
	abstract protected void registerStore(URI storeFolderURI);
		
	abstract protected boolean registerArtifact(URI uri);
	
	abstract protected void update();
}
