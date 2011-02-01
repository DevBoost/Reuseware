package org.reuseware.air.language.abstractsyntax.ui.popup.actions;

import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.reuseware.air.language.abstractsyntax.AbstractSyntax;
import org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsResource;

import org.eclipse.m2m.qvt.oml.runtime.util.QvtoTransformationHelper;
import org.eclipse.m2m.qvt.oml.runtime.util.QvtoTransformationHelper.TransfExecutionResult;
//import org.reuseware.air.language.abstractsyntax.AbstractSyntax;
//import org.reuseware.air.language.abstractsyntax.resource.as.AsResource;

public class TransformAction implements IObjectActionDelegate {
	
	@SuppressWarnings("unused")
	private ISelection selection=null;
    private IFile selectedFile=null;
    @SuppressWarnings("unused")
	private IWorkbenchPart part;

    /**
     * Run action
     * 
     */

	public void run(IAction action) {
    	if(selectedFile!=null){
    		IPath asPath = selectedFile.getFullPath();
            IPath ecorePath = selectedFile.getFullPath().removeFileExtension().addFileExtension("ecore");
            ResourceSet resourceSet = new ResourceSetImpl();
            Resource asResource = resourceSet.getResource(URI.createPlatformResourceURI(asPath.toString(),true),true);   		
         
            if(asResource instanceof AsResource){ 
            	String errorMessage = null;
            	try {
            		Resource ecoreResource = resourceSet.createResource(URI.createPlatformResourceURI(ecorePath.toString(),true));
            		//this call is needed directly before load!
            		EcoreUtil.resolveAll(asResource);
            		asResource.load(Collections.emptyMap());
            		AbstractSyntax as = (AbstractSyntax)asResource.getContents().get(0);
            		URI transformationURI = URI.createPlatformPluginURI("/org.reuseware.air.language.abstractsyntax/transformation/abstractsyntax2ecore.qvto", false);
                  	List<EObject> inList = new LinkedList<EObject>();
            		inList.add(as);
    				TransfExecutionResult execResult = new QvtoTransformationHelper(transformationURI).executeTransformation(inList, Collections.<String, Object>emptyMap(),resourceSet);
					EPackage pck = (EPackage)execResult.getOutModelExtents().get(0).getAllRootElements().get(0);
					ecoreResource.getContents().clear();
					ecoreResource.getContents().add(pck);
					ecoreResource.save(Collections.emptyMap());
            	} catch (CoreException e) {				
					errorMessage = e.getCause()!=null?e.getCause().getMessage():e.getMessage();
            		e.printStackTrace();
				} catch (IOException e) {
					errorMessage = e.getMessage();
					e.printStackTrace();
				} catch (Exception e){
					errorMessage = e.getMessage();
					e.printStackTrace();
				}
				
				if(errorMessage!=null){
					Shell shell = new Shell();
					MessageDialog.openError(shell,"Mapping Error.",errorMessage);
					return;
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
		if (selection instanceof IStructuredSelection) {
            if(!((IStructuredSelection)selection).isEmpty()){
            	Object first = ((IStructuredSelection)selection).getFirstElement();
            	if(first instanceof IFile){
            		selectedFile = (IFile)first;
            		return;
            	}
            }
		}
		selectedFile=null;
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

