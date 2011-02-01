package org.reuseware.air.coconut.ui.eclipse.builder;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.resources.IResourceVisitor;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.reuseware.air.coconut.IFragmentRetriever;
import org.reuseware.air.coconut.InterpreterSystem;
import org.reuseware.air.util.FileMarker;
import org.reuseware.air.util.FileProcessingException;
import org.reuseware.air.util.FileProcessingProblem;
import org.reuseware.air.util.FragmentFileMap;

import org.reuseware.air.coconut.util.FragmentUtil;
/**
 * The builder for Reuseware projects.
 * 
 * @author Jendrik Johannes
 */
public class ReusewareBuilder extends IncrementalProjectBuilder {
	

	
    public static final String BUILDER_ID = "org.reuseware.coconut.plugin.builder";

	protected IProject[] build(int kind, Map args, IProgressMonitor monitor)
			throws CoreException {
        
        IProject project = getProject();
        ProjectBasedFragmentManager fragmentManager = new ProjectBasedFragmentManager(project);
        
        //InterpreterSystem.getInstance().setFragmentRetriever(new ProjectBasedFragmentManager(project));
  
        fragmentManager.getSourceFolder().accept(new ComponentVisitor());
        
        fragmentManager.getSourceFolder().accept(new CompositionProgramVisitor(fragmentManager));
        
        FragmentFileMap.get().clear();

		return null;
    }
	
////////////////////////////ResourceVisitors///////////////////////////////////////
	private static class ComponentVisitor implements IResourceVisitor{
		
		public boolean visit(IResource resource) throws CoreException {	      
	        if (resource instanceof IFile) {
	            FileMarker.unmark((IFile)resource);
	            return false;
	        }
	        return true;
		}
		
	}
	
	/**
	 * A file visitor which parses the file, passes the result to
	 * the CompositionExecutor and prints-back the result to the
	 * print-back-folder.
	 * 
	 * @author Jendrik Johannes
	 */
	private class CompositionProgramVisitor implements IResourceVisitor {
	    
		private ProjectBasedFragmentManager manager;
		
		public CompositionProgramVisitor(ProjectBasedFragmentManager manager){
			this.manager = manager;
		}
		
		
		public boolean visit(IResource resource) throws CoreException {
	        
	        if (!(resource instanceof IFile)) {
	            return true;
	        }
	        
	        IFile file = (IFile) resource;
	        
	        if (file.getFileExtension() == null) 
	            return true;
	        
	        
	        IProject project = resource.getProject();
	        IFile outFile = null;
	        String extension = file.getFileExtension();
	        
	        // TODO: motivate this check
	        if (extension.startsWith("r") || extension.startsWith("m") || 
	        		extension.startsWith("reuse") || extension.startsWith("e")) {
	        	if (extension.startsWith("reuse")) 
	        		extension = extension.substring(5);
	        	else if (extension.startsWith("r")) 
	        		extension = extension.substring(1);
	        	else if (extension.startsWith("m")) 
	        		extension = extension.substring(1);
	            
	            outFile = 
	            	manager.getPrintFolder().getFile(file.getFullPath().removeFirstSegments(2).removeFileExtension().addFileExtension(extension));
	        }
	        
	        
	        try {
	            IFragmentRetriever fr = manager;
	            
	            FileMarker.unmark(file);
	            
	            List<EObject> programs = 
	            	fr.getFragmentFromLocation(file.getFullPath().toString(), file.getContents(), null, null);
	            
	            List<FileProcessingProblem> problems = new ArrayList<FileProcessingProblem>();
	            
	            // go through fragments in the composition program 
	            for(EObject program : programs) {
	                Map<String,List<EObject>>   env      = new HashMap<String,List<EObject>>();
	                Map<String,EClass>          envTypes = new HashMap<String, EClass>();
	                InterpreterSystem.getInstance().interpret(program, env, envTypes, problems);
	            }

	            if (!problems.isEmpty()) 
	            	throw new FileProcessingException(problems);
	            
	            
	            if (outFile != null) {

	            	// check for unbound slots 
	            	for (EObject fragment : programs) {
	            		String name =
	            			FragmentUtil.containsSlot(fragment);
	                	if (name != null) {
	                    	problems.add(new FileProcessingProblem(fragment,
	                    			"File " + file.toString() + " contains unbound slot '" + name + "'"));
	                		throw new FileProcessingException(problems);
	                	}
	            	}
		                StringBuffer output = 
	                	(StringBuffer) fr.printFragments(outFile.getFullPath().removeFirstSegments(2).toString(), programs, null);
	                if (outFile.exists()) 
	                	outFile.delete(true, new NullProgressMonitor());
	                outFile.create(new ByteArrayInputStream(output.toString().getBytes()), true, new NullProgressMonitor());
	            }
	            
	        } catch (FileProcessingException e) {
	            FileMarker.mark(e, project);
	        } 
	        
	        return true;

	    }

	}
	
}


