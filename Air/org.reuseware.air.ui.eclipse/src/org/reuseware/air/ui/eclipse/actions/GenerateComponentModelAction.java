package org.reuseware.air.ui.eclipse.actions;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IWorkspaceDescription;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.reuseware.air.comogen.CompositionSystemGenerator;
import org.reuseware.air.comogen.ExtensionContext;
import org.reuseware.air.comogen.ICompositionSystemContext;
import org.reuseware.air.comogen.CompositionSystemContext;
import org.reuseware.air.comogen.IExtensionContext;
import org.reuseware.air.comogen.util.CMSLSpecificationLoader;
import org.reuseware.air.ui.eclipse.resource.FileMarker;
import org.reuseware.air.util.FileProcessingException;

import org.reuseware.air.language.cmsl.ExtensionProgram;
import org.reuseware.air.language.cmsl.ExtensionStatement;
import org.reuseware.air.language.cmsl.GrammarExtension;


public class GenerateComponentModelAction implements IObjectActionDelegate {

	private ISelection selection;
	private IWorkbenchPart part; 

	/**
	 * Process the file
	 * 
	 * ... using a different IWorkbenchPart 
	 * 
	 * @param file
	 */
	public void process(final IFile file, final IWorkbenchPart part) {

		final ProgressMonitorDialog pmDialog = 
			new ProgressMonitorDialog(part.getSite().getShell());

		try {
			pmDialog.run(true, false,
					new IRunnableWithProgress(){

				public void run(IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {

					monitor.beginTask("Generating Component model ", 10);
					monitor.worked(1);
					
				
					try {
						IExtensionContext extensionContext = new ExtensionContext((ExtensionProgram)CMSLSpecificationLoader.parseCMSLSpecification(file).getUnit());
						ICompositionSystemContext systemContext = new CompositionSystemContext(extensionContext);
						CompositionSystemGenerator.processAll(systemContext, extensionContext);
					} catch (FileProcessingException e) {
						
						try {
                            FileMarker.mark(e,file.getProject());  
                        } catch (CoreException e1) {
                            // TODO remove later...
                            e1.printStackTrace();
                        }
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (CoreException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					monitor.worked(1);
					monitor.done(); 
				}
			});
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 

		return;
	}
	
	/**
	 * Process the file 
	 * 
	 * ...using the own IWorkbenchPart 
	 * 
	 * @param file
	 * @param part
	 */
	public void process(final IFile file) {
		
		process(file, part); 
	}

	/**
	 * Run 
	 * 
	 */
	@SuppressWarnings("unchecked")
	public void run(IAction action) {
		boolean autoBuildState = getAutoBuildingState();
		setAutoBuildingState(false);

		if (selection instanceof IStructuredSelection) {
			for (Iterator i = ((IStructuredSelection)selection).iterator(); i.hasNext(); ) {
				Object o = i.next();
				if (o instanceof IFile) {
					IFile file = (IFile) o;

					process(file);
				}
			}

		}

		setAutoBuildingState(autoBuildState);
	}

	/**
	 * 
	 * @param state
	 */
	private void setAutoBuildingState(boolean state) {
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
	private boolean getAutoBuildingState() {
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
