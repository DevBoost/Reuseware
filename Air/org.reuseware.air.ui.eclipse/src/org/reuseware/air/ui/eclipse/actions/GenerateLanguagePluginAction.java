package org.reuseware.air.ui.eclipse.actions;

import java.io.IOException;
import java.util.Iterator;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IWorkspaceDescription;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.reuseware.air.comogen.ExtensionContext;
import org.reuseware.air.comogen.IExtensionContext;
import org.reuseware.air.comogen.util.CMSLSpecificationLoader;
import org.reuseware.air.language.cmsl.ExtensionProgram;
import org.reuseware.air.util.FileProcessingException;
import org.reuseware.air.comogen.CompositionSystemGenerator;

public class GenerateLanguagePluginAction implements IObjectActionDelegate {

	private ISelection selection;
	private IWorkbenchPart part;

	/**
	 * Process the file (use own workbench part)
	 * 
	 * @param file
	 */
	public void process(final IFile file) {
        
		process(file, part); 
    }
	
	/**
	 * Process the file (use given workbench part) 
	 * 
	 * @param file
	 * @param part
	 */
	public void process(final IFile file, IWorkbenchPart part) {
		IExtensionContext extensionContext;
		try {
			extensionContext = new ExtensionContext((ExtensionProgram)CMSLSpecificationLoader.parseCMSLSpecification(file).getUnit());
			//GenerateLanguagePlugin genPlugin = new GenerateLanguagePlugin(); 
		
		CompositionSystemGenerator.processLanguageExtension(extensionContext);
		try {
			CompositionSystemGenerator.generateEcoreFile(extensionContext);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		CompositionSystemGenerator.createGenModel(extensionContext);
		} catch (FileProcessingException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		
	}

	/**
	 * Run action 
	 * 
	 */
	@SuppressWarnings("unchecked")
	public void run(IAction action) {
		
	    boolean autoBuildState = isAutoBuilding();
	    setAutoBuilding(false);
	    
		if (selection instanceof IStructuredSelection) {
	        for (Iterator i = ((IStructuredSelection)selection).iterator(); i.hasNext(); ) {
	            Object o = i.next();
	            if (o instanceof IFile) {
	                IFile file = (IFile) o;
	                
	                process(file);
	            }
	        }
	
	    }
	    
	    setAutoBuilding(autoBuildState);
	}

	/**
	 * 
	 * @param state
	 */
    private void setAutoBuilding(boolean state) {
        IWorkspaceDescription workspaceDesc = ResourcesPlugin.getWorkspace().getDescription();
        workspaceDesc.setAutoBuilding(state);
        try {
            ResourcesPlugin.getWorkspace().setDescription(workspaceDesc);
        } catch (CoreException ex) {
      }
    }
    
    /**
     * 
     * @return
     */
    private boolean isAutoBuilding() {
        return ResourcesPlugin.getWorkspace().getDescription().isAutoBuilding();
    }

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.IActionDelegate#selectionChanged(org.eclipse.jface.action.IAction,
	 *      org.eclipse.jface.viewers.ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {
		this.selection = selection;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.IObjectActionDelegate#setActivePart(org.eclipse.jface.action.IAction,
	 *      org.eclipse.ui.IWorkbenchPart)
	 */
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		this.part = targetPart; 
	}
    

}
