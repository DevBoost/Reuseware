package org.reuseware.air.ui.eclipse.actions;

import java.util.Iterator;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
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



public class GeneratePluginsAction implements IObjectActionDelegate {

	private ISelection selection;
	private IWorkbenchPart part; 

	private void process(final IFile file) {

		/**
		 * Generate extended language model
		 * 
		 */
		
		GenerateReuseLanguageModelAction extendedModelAction =
			new GenerateReuseLanguageModelAction(); 
		
		// simulate the action 
		extendedModelAction.process(file); 
		
		/**
		 * Generate base language plugin
		 * 
		 */
		
		IExtensionContext context = null;
		try {
			context = new ExtensionContext((ExtensionProgram)CMSLSpecificationLoader.parseCMSLSpecification(file).getUnit());
		} catch (FileProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String baseLanguageModelName = context.getBaseLanguageName() + ".ecore";
		
		GenerateLanguagePluginAction generatePluginAction =
			new GenerateLanguagePluginAction();
		
		// get the base language model file 
		IFile baseModelFile = getFile(file.getParent(), baseLanguageModelName);
		
		// simulate the action
		if (baseModelFile != null)
			generatePluginAction.process(baseModelFile, part);

		
		/**
		 * Generate reuse language plugin
		 * 
		 */
		
		String reuseLanguageModelName = context.getReuseLanguageName() + ".ecore";

		// get the base language model file 
		IFile reuseModelFile = getFile(file.getParent(), reuseLanguageModelName); 

		// simulate the action
		if (baseModelFile != null)
			generatePluginAction.process(reuseModelFile, part); 

		
		/**
		 * Generate component model plugin 
		 * 
		 */
		
		GenerateComponentModelAction generateComponentModelAction = 
			new GenerateComponentModelAction(); 
		
		generateComponentModelAction.process(file, part); 

		return; 
	}


	/**
	 * Retrieves a file, regardless if contained in IFolder or IProject 
	 * 
	 * @param parent
	 * @param fileName
	 * @return
	 */
	private IFile getFile(IResource parent, String fileName) { 
		
		IFile file = null; 
		
		// get the reuse language model file 
		if (parent instanceof IFolder) {
			IFolder folder = (IFolder)parent; 
			file = folder.getFile(fileName);
		} else if (parent instanceof IProject) {
			IProject folder = (IProject) parent; 
			file = folder.getFile(fileName);
		}

		return file; 
	}
	
	/**
	 * Run 
	 * 
	 */
	@SuppressWarnings("unchecked")
	public void run(IAction action) {

		if (selection instanceof IStructuredSelection) {
			for (Iterator i = ((IStructuredSelection)selection).iterator(); i.hasNext(); ) {
				Object o = i.next();
				if (o instanceof IFile) {
					IFile file = (IFile) o;

					process(file);
				}
			}

		}

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
