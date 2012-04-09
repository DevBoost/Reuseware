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

import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.osgi.util.NLS;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;

/**
 * @generated
 */
public class CompositionprogramCreationWizardPage extends
		WizardNewFileCreationPage {

	/**
	 * @generated
	 */
	private final String fileExtension;

	/**
	 * @generated
	 */
	public CompositionprogramCreationWizardPage(String pageName,
			IStructuredSelection selection, String fileExtension) {
		super(pageName, selection);
		this.fileExtension = fileExtension;
	}

	/**
	 * Override to create files with this extension.
	 * 
	 * @generated
	 */
	protected String getExtension() {
		return fileExtension;
	}

	/**
	 * @generated
	 */
	public URI getURI() {
		return URI.createPlatformResourceURI(getFilePath().toString(), false);
	}

	/**
	 * @generated
	 */
	protected IPath getFilePath() {
		IPath path = getContainerFullPath();
		if (path == null) {
			path = new Path(""); //$NON-NLS-1$
		}
		String fileName = getFileName();
		if (fileName != null) {
			path = path.append(fileName);
		}
		return path;
	}

	/**
	 * Modified to define additional controls.
	 * 
	 * @generated NOT
	 */
	public void createControl(Composite parent) {
		super.createControl(parent);

		//!BEGIN MODIFICATION
		//createAdditionalControls(parent);
		//!END MODIFICATION

		setFileName(CompositionprogramDiagramEditorUtil.getUniqueFileName(
				getContainerFullPath(), getFileName(), getExtension()));
		setPageComplete(validatePage());
	}

	/**
	 * @generated
	 */
	protected boolean validatePage() {
		if (!super.validatePage()) {
			return false;
		}
		String extension = getExtension();
		if (extension != null
				&& !getFilePath().toString().endsWith("." + extension)) {
			setErrorMessage(NLS
					.bind(Messages.CompositionprogramCreationWizardPageExtensionError,
							extension));
			return false;
		}
		return true;
	}

	//!BEGIN MODIFICATION
	/*
	private List<String> cpSyntaxID = null;
	private String targetUFI = null;

	public CompositionLanguageSpecification getCLSyntax() {
		ReuseExtension rex = ReuseResourcesUtil.getReuseExtension(
				cpSyntaxID, new ResourceSetImpl());
		if (rex instanceof CompositionLanguageSpecification) {
			return (CompositionLanguageSpecification) rex;
		}
		return null;
	}

	public String getTargetUFI() {
		if (targetUFI == null)
			return null;
		return targetUFI;
	}

	private void createAdditionalControls(Composite parent) {
		Composite topLevel = (Composite) parent.getChildren()[1];

		//TEMPLATE SELECTION
		Composite templateGroup = new Composite(topLevel, SWT.NONE);
		GridLayout layout = new GridLayout();
		layout.numColumns = 2;
		layout.marginWidth = 0;
		templateGroup.setLayout(layout);
		templateGroup.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_FILL
				| GridData.GRAB_HORIZONTAL));
		templateGroup.setFont(topLevel.getFont());

		Label label = new Label(templateGroup, SWT.NONE);
		label.setText("Template:");
		label.setFont(topLevel.getFont());

		Combo templateSelection = new Combo(templateGroup, SWT.DROP_DOWN);
		templateSelection.setFont(topLevel.getFont());

		templateSelection.add("<no template>");
		templateSelection.setText("<no template>");

		final List<List<String>> completeSyntaxList = 
			new ArrayList<List<String>>();
		
		for(List<String> cpSyntaxID : ReuseResources.INSTANCE.getAllCompositionProgramSyntaxIDs()) {
			completeSyntaxList.add(cpSyntaxID);
			templateSelection.add(cpSyntaxID.get(cpSyntaxID.size()-1));	
		}

		//TARGET UFI
		Composite targetUFIGroup = new Composite(topLevel, SWT.NONE);
		layout = new GridLayout();
		layout.numColumns = 2;
		layout.marginWidth = 0;
		targetUFIGroup.setLayout(layout);
		targetUFIGroup.setLayoutData(new GridData(
				GridData.HORIZONTAL_ALIGN_FILL | GridData.GRAB_HORIZONTAL));
		targetUFIGroup.setFont(topLevel.getFont());

		label = new Label(targetUFIGroup, SWT.NONE);
		label.setText("Target UFI:");
		label.setFont(topLevel.getFont());

		final Text targetUFIField = new Text(targetUFIGroup, SWT.BORDER);
		targetUFIField.setEnabled(false);
		targetUFIField.addListener(SWT.Modify, this);
		targetUFIField.addFocusListener(new FocusAdapter() {
			public void focusLost(FocusEvent e) {
				targetUFI = ((Text) e.getSource()).getText();
			}
		});
		GridData data = new GridData(GridData.HORIZONTAL_ALIGN_FILL
				| GridData.GRAB_HORIZONTAL);
		data.widthHint = 250;
		targetUFIField.setLayoutData(data);
		targetUFIField.setFont(topLevel.getFont());

		//LISTENER

		templateSelection.addSelectionListener(new SelectionListener() {

			public void widgetDefaultSelected(SelectionEvent e) {
				// nothing				
			}

			public void widgetSelected(SelectionEvent e) {
				int selectedIdx = ((Combo) e.getSource()).getSelectionIndex();

				if (selectedIdx == -1 || selectedIdx == 0) {
					cpSyntaxID = null;
					targetUFIField.setEnabled(false);
				} else {
					cpSyntaxID = completeSyntaxList.get(selectedIdx - 1);
					targetUFIField.setText(getCLSyntax().getBaseTargetUFI());
					targetUFIField.setEnabled(true);
				}
			}

		});

	}
	 */
	//!END MODIFICATION
}
