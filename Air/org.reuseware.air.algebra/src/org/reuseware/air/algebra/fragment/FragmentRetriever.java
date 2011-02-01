package org.reuseware.air.algebra.fragment;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

@Deprecated
public class FragmentRetriever {

	/**
	 * Constructor
	 */
	private FragmentRetriever() {

	}

	private static class SingletonHolder { 
		private final static FragmentRetriever __INSTANCE = new FragmentRetriever();
	}

	public static FragmentRetriever getInstance() {

		return SingletonHolder.__INSTANCE;
	}


	/**
	 * Loads a fragment from a IResource
	 * 
	 * @param grammar
	 * @param type
	 * @param fragmentsFolder
	 * @param fragment
	 * @return
	 * @throws CoreException
	 */
	//	public List<EObject> 
	//	loadFragmentFromLocation(String grammar, String type, IResource fragmentsFolder, String fragment) 
	//	{
	//
	//		try {
	//
	//			IResource file = null;
	//			
	//			// find the fragment 
	//			if (fragmentsFolder instanceof IFolder) {
	//				IFolder folder = (IFolder)fragmentsFolder;
	//				file = folder.findMember(fragment);
	//			} else if (fragmentsFolder instanceof IProject) {
	//				IProject prj = (IProject)fragmentsFolder;
	//				file = prj.findMember(fragment);
	//			}
	//
	//			if (file != null)
	//				return loadFragmentFromLocation(grammar, type, ((IFile)file).getContents(), fragment);
	//
	//		} catch (CoreException e) {
	//
	//			System.err.println("Core exception: " + e.getMessage());
	//		}
	//
	//		return null;
	//		}

	public List<EObject> loadFragmentFromString(String grammar, String type, String fragment)  {
		
	    return loadFragmentFromLocation(grammar, type, 
	    		new ByteArrayInputStream(fragment.getBytes()), null);
	    
	}

	/**
	 * Loads a fragment from file 
	 * 
	 * @param grammar
	 * @param type
	 * @param fragmentsFolder
	 * @param fragmentLocation
	 * @return
	 * @throws FileNotFoundException
	 */
	public List<EObject> 
	loadFragmentFromLocation(String grammar, String type, String fragmentsFolder, String fragmentLocation)
	throws FileNotFoundException 
	{

		// TODO: make general (using some fragment store system) 
		String fragName = 
			fragmentLocation.substring(fragmentLocation.indexOf("file:") + "file:".length());
		File file = new File(fragmentsFolder + "/" + fragName);

		if (!file.exists()) {
			System.err.println("File '" + file.getName() + "'does not exists!");
			return null;
		}

		InputStream inputStream = new FileInputStream(file); 

		return loadFragmentFromLocation(grammar, type, inputStream, fragmentLocation);

	}


	/**
	 * TODO: Documentation needed
	 * 
	 * 
	 */
	public List<EObject> 
	loadFragmentFromLocation(String grammar, String type, InputStream inputStream, String fragmentLocation)
	{

			try {
			ResourceSet resourceSet = new ResourceSetImpl();
			Resource fragments = resourceSet.getResource(URI.createPlatformResourceURI(fragmentLocation,true),true);
			fragments.load(inputStream,Collections.EMPTY_MAP);
			return fragments.getContents();
			// create the parser and parse the file
		/*	IParser parser = parserFactory.createParser(inputStream, fragmentLocation);  

			// 'type' is the type of the sentence being parsed
			EObject lc = parser.parseString(type);  
			
			// loop to parse several instances of the same construct (sentence)
			while (lc != null) {
				result.add(lc);
				lc = parser.parseString(type);
			}

*/
			// TODO: do proper error handling 
		} catch (IOException e) { e.printStackTrace(); } 

		return null;
	}

}
