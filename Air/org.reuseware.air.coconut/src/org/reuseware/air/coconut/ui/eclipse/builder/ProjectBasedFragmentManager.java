package org.reuseware.air.coconut.ui.eclipse.builder;

import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.QualifiedName;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.reuseware.air.algebra.fragment.IFragmentManager;
import org.reuseware.air.coconut.plugin.ProjectPreferenceConstants;
import org.reuseware.air.core.cm.IFragment;
import org.reuseware.air.coconut.IFragmentRetriever;
import org.reuseware.air.util.FileProcessingException;
import org.reuseware.air.util.FileProcessingProblem;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

public class ProjectBasedFragmentManager implements IFragmentManager,IFragmentRetriever {
	
	private IProject managedProject;
	private IFolder printFolder;
	private IFolder sourceFolder;
	private List<IFragmentManager> relatedManagers;	
	
	public ProjectBasedFragmentManager(IProject project) throws CoreException{
		managedProject = project;
		initialise();
	}
	
	private void initialise() throws CoreException{
        IFolder  src      = managedProject.getFolder(managedProject.getPersistentProperty(new QualifiedName("de.tudresden.reuseware.coconut.ui.eclipse",
        		ProjectPreferenceConstants.FOLDER_CP)));
        IFolder  comp     = managedProject.getFolder(managedProject.getPersistentProperty(new QualifiedName("de.tudresden.reuseware.coconut.ui.eclipse",
        		ProjectPreferenceConstants.FOLDER_COMP)));
        IFolder  out      = managedProject.getFolder(managedProject.getPersistentProperty(new QualifiedName("de.tudresden.reuseware.coconut.ui.eclipse",
        		ProjectPreferenceConstants.FOLDER_PB)));
        
        initializeFolder(src);
        initializeFolder(comp);
        initializeFolder(out);
        
        sourceFolder = src;
        printFolder = out;
	}
	
	public IFolder getPrintFolder() {
		return printFolder;
	}

	public URI getPrintURI() {
		if(printFolder==null)
			return null;
		else{
			return URI.createURI(printFolder.getLocationURI().toString());
		}
	}

	public IProject getProject() {
		return managedProject;
	}

	public List<IFragmentManager> getRelatedManagers() {
		return relatedManagers;
	}

	public IFolder getSourceFolder() {
		return sourceFolder;
	}

	public URI getSourceURI() {
		if(sourceFolder==null)
			return null;
		else{
			return URI.createURI(sourceFolder.getLocationURI().toString());
		}
	}

	public IFragment loadFragment(EClass fragmentType, URI location) throws IOException {
		if(location==null)
			throw new IllegalArgumentException("Location must not be null.");
		if(!location.isRelative())
			throw new IllegalArgumentException("Location <" + location.toString() + "> must be relative.");
		if(!location.isFile())
			throw new IllegalArgumentException("Location <" + location.toString() +"> must point to a File.");
		return null;
	}

	public IFragment loadFragment(EClass fragmentType, String location) throws IOException {
		if(location==null)
			throw new IllegalArgumentException("Location must not be null.");
		URI locationURI =  URI.createURI(location);
		return loadFragment(fragmentType, locationURI);
	}

	public boolean setPrintFolder(IFolder folder) {
		if(folder==null||!folder.getProject().equals(managedProject))
			return false;
		else{
			printFolder = folder;		
			return true;
		}
	}

	public boolean setSourceFolder(IFolder folder) {
		if(folder==null||!folder.getProject().equals(managedProject))
			return false;
		else{
			sourceFolder = folder;
			return true;
		}
	}

	public void storeFragment(IFragment fragment, URI location)
			throws IOException {
		// TODO Auto-generated method stub

	}

	public void storeFragment(IFragment fragment, String location)
			throws IOException {
		// TODO Auto-generated method stub

	}
	
	private void initializeFolder(IFolder folder) throws CoreException{
		if(!folder.exists()){
			if(folder.getParent()!=null&&(folder.getParent() instanceof IFolder)){
				IFolder parentFolder = (IFolder)folder.getParent();
				initializeFolder(parentFolder);
			}
			folder.create(false,false,new NullProgressMonitor());
		}
	}
/////////////////////////////////Old Fragment Retriever Methods//////////////////////////
	
	public List<EObject> getFragmentFromContent(Object content,
			String extension, EClass type, EObject loadFragment)
			throws FileProcessingException {
		// TODO Auto-generated method stub
		return null;
	}

	public List<EObject> getFragmentFromLocation(String location, EClass type,
			EObject loadConstruct) throws FileProcessingException {
		return getFragmentFromLocation(location,null,type,loadConstruct);
	}


	public List<EObject> getFragmentFromLocation(String location,
			InputStream content, EClass type, EObject loadConstruct) throws FileProcessingException {
	   
		//TODO: type must be used for fragment parsing in emftext resources
		ResourceSet resourceSet = new ResourceSetImpl();
		Resource resource = resourceSet.getResource(URI.createURI(location),false);
		
		try {
			if(content==null)
				resource.load(Collections.EMPTY_MAP);
			else
				resource.load(content,Collections.EMPTY_MAP);
		} catch (IOException e) {
			//TODO change to IOException
			throw new FileProcessingException(new FileProcessingProblem(loadConstruct,e.getMessage()));
		}
	    EcoreUtil.resolveAll(resource);
	    List<EObject> result = resource.getContents();
	    //TODO for emftext resources this can be checked by emftext
	    for(EObject o:result){
	    	if(!o.eClass().equals(type))
	    		throw new FileProcessingException(new FileProcessingProblem(loadConstruct,"Unexpected fragment type"));
	    }
	    return result;
		
	}

	public Object printFragments(String path, List<EObject> fragments,
			EObject printFragment) throws FileProcessingException {
		// TODO Auto-generated method stub
		return null;
	}

	public Object printFragmentsToLocation(String path,
			List<EObject> fragments, EObject printFragment)
			throws FileProcessingException {
		// TODO Auto-generated method stub
		return null;
	}

}
