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
package org.reuseware.coconut.compositionprogram.diagram.part;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.actions.WorkspaceModifyOperation;

/**
 * @generated
 */
public class CompositionprogramCreationWizard extends Wizard implements
		INewWizard {

	/**
	 * @generated
	 */
	private IWorkbench workbench;

	/**
	 * @generated
	 */
	protected IStructuredSelection selection;

	/**
	 * @generated
	 */
	protected CompositionprogramCreationWizardPage diagramModelFilePage;

	/**
	 * @generated
	 */
	protected CompositionprogramCreationWizardPage domainModelFilePage;

	/**
	 * @generated
	 */
	protected Resource diagram;

	/**
	 * @generated
	 */
	private boolean openNewlyCreatedDiagramEditor = true;

	/**
	 * @generated
	 */
	public IWorkbench getWorkbench() {
		return workbench;
	}

	/**
	 * @generated
	 */
	public IStructuredSelection getSelection() {
		return selection;
	}

	/**
	 * @generated
	 */
	public final Resource getDiagram() {
		return diagram;
	}

	/**
	 * @generated
	 */
	public final boolean isOpenNewlyCreatedDiagramEditor() {
		return openNewlyCreatedDiagramEditor;
	}

	/**
	 * @generated
	 */
	public void setOpenNewlyCreatedDiagramEditor(
			boolean openNewlyCreatedDiagramEditor) {
		this.openNewlyCreatedDiagramEditor = openNewlyCreatedDiagramEditor;
	}

	/**
	 * @generated
	 */
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.workbench = workbench;
		this.selection = selection;
		setWindowTitle(Messages.CompositionprogramCreationWizardTitle);
		setDefaultPageImageDescriptor(CompositionprogramDiagramEditorPlugin
				.getBundledImageDescriptor("icons/wizban/NewCompositionprogramWizard.gif")); //$NON-NLS-1$
		setNeedsProgressMonitor(true);
	}

	/**
	 * Modified: removed separate diagram page
	 * 
	 * @generated NOT
	 */
	public void addPages() {
		//!BEGIN MODIFICATION
		/*
		diagramModelFilePage = new CompositionprogramCreationWizardPage(
				"DiagramModelFile", getSelection(), "ucldi"); //$NON-NLS-1$ //$NON-NLS-2$
		diagramModelFilePage
				.setTitle(Messages.CompositionprogramCreationWizard_DiagramModelFilePageTitle);
		diagramModelFilePage
				.setDescription(Messages.CompositionprogramCreationWizard_DiagramModelFilePageDescription);
		addPage(diagramModelFilePage);
		 */
		//!END MODIFICATION

		domainModelFilePage = new CompositionprogramCreationWizardPage(
				"DomainModelFile", getSelection(), "ucl") { //$NON-NLS-1$ //$NON-NLS-2$

			public void setVisible(boolean visible) {
				if (visible) {
					//!BEGIN MODIFICATION
					/*
					String fileName = diagramModelFilePage.getFileName();
					fileName = fileName.substring(0, fileName.length()
							- ".ucldi".length()); //$NON-NLS-1$
					 */
					String fileName = "composition";
					//!END MODIFICATION
					setFileName(CompositionprogramDiagramEditorUtil
							.getUniqueFileName(getContainerFullPath(),
									fileName, "ucl")); //$NON-NLS-1$
				}
				super.setVisible(visible);
			}
		};
		domainModelFilePage
				.setTitle(Messages.CompositionprogramCreationWizard_DomainModelFilePageTitle);
		domainModelFilePage
				.setDescription(Messages.CompositionprogramCreationWizard_DomainModelFilePageDescription);
		addPage(domainModelFilePage);
	}

	/**
	 * Modified: removed separate diagram page and to handle syntax parameters
	 * 
	 * @generated NOT
	 */
	public boolean performFinish() {
		IRunnableWithProgress op = new WorkspaceModifyOperation(null) {

			protected void execute(IProgressMonitor monitor)
					throws CoreException, InterruptedException {
				//!BEGIN MODIFICATION
				/*diagram = CompositionprogramDiagramEditorUtil.createDiagram(
						diagramModelFilePage.getURI(), domainModelFilePage
								.getURI(), monitor);*/

				diagram = CompositionprogramDiagramEditorUtil.createDiagram(
						domainModelFilePage.getURI().trimFileExtension()
								.appendFileExtension("ucldi"),
						domainModelFilePage.getURI(), monitor);
				//!END MODIFICATION
				if (isOpenNewlyCreatedDiagramEditor() && diagram != null) {
					try {
						CompositionprogramDiagramEditorUtil
								.openDiagram(diagram);
					} catch (PartInitException e) {
						ErrorDialog
								.openError(
										getContainer().getShell(),
										Messages.CompositionprogramCreationWizardOpenEditorError,
										null, e.getStatus());
					}
				}
			}
		};
		try {
			getContainer().run(false, true, op);
		} catch (InterruptedException e) {
			return false;
		} catch (InvocationTargetException e) {
			if (e.getTargetException() instanceof CoreException) {
				ErrorDialog.openError(getContainer().getShell(),
						Messages.CompositionprogramCreationWizardCreationError,
						null,
						((CoreException) e.getTargetException()).getStatus());
			} else {
				CompositionprogramDiagramEditorPlugin.getInstance().logError(
						"Error creating diagram", e.getTargetException()); //$NON-NLS-1$
			}
			return false;
		}
		return diagram != null;
	}
}
