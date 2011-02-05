/*******************************************************************************
 * Copyright (c) 2006-2011
 * Software Technology Group, Dresden University of Technology
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0 
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *   Software Technology Group - TU Dresden, Germany 
 *      - initial API and implementation
 ******************************************************************************/
package org.reuseware.sokan.ui.internal.dialogs;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.IMessageProvider;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.reuseware.sokan.Store;
import org.reuseware.sokan.index.util.StoreUtil;

/**
 * Dialog to define patterns for a <code>SelectFilesStoreToggleAction</code>.
 */
public class NewStoreDialog extends TitleAreaDialog {

	private static final String PATTERN_ALL = "*.*";
	private IContainer container;
	private Store store;

	private Text txtCustom;
	private Button btnAll;
	private Button btnEnding;
	private Button btnCustom;
	private Group grEnding;

	private Button[] endBtns;

	/**
	 * Creates a <code>NewStoreDialog</code>.
	 * @param parentShell the parent SWT shell
	 * @param container the container (folder or project) that is marked as store
	 */
	public NewStoreDialog(Shell parentShell, IContainer container) {
		super(parentShell);
		this.container = container;
	}

	/**
	 * @return the created store
	 */
	public Store getStore() {
		return store;
	}

	protected Control createContents(Composite parent) {
		Control contents = super.createContents(parent);

		// Set dialog head title
		parent.getShell()
				.setText("Mark '" + container.getName() + "' as store");
		// Set the title
		setTitle("Choose which filters should be applied to files in the folder.");
		// Set the message
		setMessage("Please select one below.", IMessageProvider.INFORMATION);
		return contents;
	}

	@Override
	protected Control createDialogArea(Composite parent) {
		GridLayout layout = new GridLayout(1, false);
		parent.setLayout(layout);

		Label lblSepTop = new Label(parent, SWT.SEPARATOR | SWT.HORIZONTAL);
		GridData ldSep = new GridData(SWT.FILL, SWT.FILL, true, false);
		ldSep.verticalIndent = -5;
		ldSep.horizontalSpan = 2;
		lblSepTop.setLayoutData(ldSep);

		btnAll = new Button(parent, SWT.RADIO);
		btnAll
				.setLayoutData(new GridData(SWT.BEGINNING, SWT.TOP, false,
						false));
		btnAll.setText("All files (i.e. '*.*')");
		btnAll.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				super.widgetSelected(e);
				if (btnAll.getSelection()) {
					String cont = "container";
					if (container instanceof IFolder) {
						cont = "folder";
					} else if (container instanceof IProject) {
						cont = "project";
					}
					setMessage("All files in this " + cont
							+ " and its subfolders are seen as artifacts.",
							IMessageProvider.INFORMATION);
				}
			}
		});

		// Text txtSpace = new Text(parent, SWT.BORDER);
		// txtSpace.setVisible(false);

		btnEnding = new Button(parent, SWT.RADIO);
		btnEnding.setLayoutData(new GridData(SWT.BEGINNING, SWT.TOP, false,
				false));
		btnEnding.setText("Files by ending (e.g. '*.txt')");
		btnEnding.addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				super.widgetSelected(e);
				grEnding.setEnabled(btnEnding.getSelection());
				for (Button endButton : endBtns) {
					endButton.setEnabled(btnEnding.getSelection());
				}

				if (btnEnding.getSelection()) {
					if (endBtns.length < 1) {
						setMessage("There are no files in the store yet.",
								IMessageProvider.WARNING);
					} else {
						setMessage(
								"Select a number of file extension to specify artifacts.",
								IMessageProvider.INFORMATION);
					}
				}
			}
		});

		grEnding = new Group(parent, SWT.NONE);
		grEnding.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		grEnding.setLayout(new GridLayout(6, false));
		grEnding.setEnabled(false);

		String[] endings = StoreUtil.INSTANCE.grabFileEndings(container);
		endBtns = new Button[endings.length];
		for (int i = 0; i < endings.length; i++) {

			Button btnEnding = new Button(grEnding, SWT.CHECK);
			btnEnding.setLayoutData(new GridData(SWT.BEGINNING, SWT.CENTER,
					false, false));
			btnEnding.setText("*." + endings[i]);
			btnEnding.setEnabled(false);
			endBtns[i] = btnEnding;
		}

		btnCustom = new Button(parent, SWT.RADIO);
		btnCustom.setLayoutData(new GridData(SWT.BEGINNING, SWT.TOP, false,
				false));
		btnCustom.setText("Files by custom pattern (e.g. '*test?.java')");
		btnCustom.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				super.widgetSelected(e);
				txtCustom.setEnabled(btnCustom.getSelection());

				if (btnCustom.getSelection()) {
					setMessage(
							"Specify your own filter pattern. Use wildcards:\n "
									+ "'?' = any character, '*' = any string.",
							IMessageProvider.INFORMATION);
				}
			}
		});
		btnCustom.setEnabled(false);

		txtCustom = new Text(parent, SWT.SINGLE | SWT.LEAD | SWT.BORDER);
		txtCustom
				.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));
		txtCustom.setEnabled(false);

		Label lblSepBottom = new Label(parent, SWT.SEPARATOR | SWT.HORIZONTAL);
		GridData ldSep2 = new GridData(SWT.FILL, SWT.FILL, false, false);
		ldSep2.horizontalSpan = 2;
		ldSep2.verticalIndent = 10;

		lblSepBottom.setLayoutData(ldSep2);

		return parent;
	}

	@Override
	protected void createButtonsForButtonBar(Composite parent) {
		createOkButton(parent, IDialogConstants.OK_ID,
				IDialogConstants.OK_LABEL, true);
		createButton(parent, IDialogConstants.CANCEL_ID,
				IDialogConstants.CANCEL_LABEL, false);
	}

	protected Button createOkButton(Composite parent, int id, String label,
			boolean defaultButton) {
		// increment the number of columns in the button bar
		((GridLayout) parent.getLayout()).numColumns++;
		Button button = new Button(parent, SWT.PUSH);
		button.setText(label);
		button.setFont(JFaceResources.getDialogFont());
		button.setData(new Integer(id));
		button.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent event) {
				if (btnEnding.getSelection()) {
					if (endBtns.length < 1) {
						setMessage("There are no files in the store yet.",
								IMessageProvider.ERROR);
						return;
					}

					boolean nothingSelected = true;
					for (Button btn : endBtns) {
						if (btn.getSelection()) {
							nothingSelected = false;
							break;
						}
					}
					if (nothingSelected) {
						setMessage(
								"Please select at least one file extension.",
								IMessageProvider.ERROR);
						return;
					}
				}
				if (btnCustom.getSelection()
						&& txtCustom.getText().length() == 0) {
					setMessage("Please specify a filter pattern",
							IMessageProvider.ERROR);
					return;
				}

				createStore();
				buttonPressed(((Integer) event.widget.getData()).intValue());
			}
		});
		if (defaultButton) {
			Shell shell = parent.getShell();
			if (shell != null) {
				shell.setDefaultButton(button);
			}
		}
		setButtonLayoutData(button);
		return button;
	}

	private void createStore() {
		List<String> patterns = new ArrayList<String>(1);

		if (btnAll.getSelection()) {
			patterns.add(PATTERN_ALL);
		} else if (btnCustom.getSelection()) {
			patterns.add(txtCustom.getText());
		} else if (btnEnding.getSelection()) {
			for (Button btn : endBtns) {
				if (btn.getSelection()) {
					patterns.add(btn.getText());
				}
			}
		}
		store = StoreUtil.INSTANCE.buildStore(patterns, container);
	}
}
