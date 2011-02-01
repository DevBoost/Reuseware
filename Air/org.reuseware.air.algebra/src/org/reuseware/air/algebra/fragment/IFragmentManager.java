package org.reuseware.air.algebra.fragment;

import java.util.List;
import java.io.IOException;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.reuseware.air.core.cm.IFragment;

public interface IFragmentManager {
	
	public IFragment loadFragment(EClass fragmentType, URI location) throws IOException;
	
	public IFragment loadFragment(EClass fragmenType, String location) throws IOException;
	
	public void storeFragment(IFragment fragment, URI location) throws IOException;
	
	public void storeFragment(IFragment fragment, String location) throws IOException;
	
	public boolean setSourceFolder(IFolder folder);
	
	public IFolder getSourceFolder();
	
	public URI getSourceURI();
	
	public boolean setPrintFolder(IFolder folder);
	
	public IFolder getPrintFolder();
	
	public URI getPrintURI();
	
	//public IProject getProject();
	
	public List<IFragmentManager> getRelatedManagers();
		
}
