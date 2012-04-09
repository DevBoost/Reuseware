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
package org.reuseware.sokan.ui.internal.filters;

import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.TrayDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

/**
 * Dialog to define a filter for artifact IDs.
 */
public class FiltersDialog extends TrayDialog {
	
	private final class LabelComboTextGroup {
		private Label label;

		private Combo combo;

		private Text text;

		private LabelComboTextGroup(Composite parent, String labelText,
				String[] comboStrings, String initialText, int widthHint) {
			Font font = parent.getFont();
			Composite group = new Composite(parent, SWT.NONE);
			GridLayout layout = new GridLayout();
			layout.numColumns = 3;
			// Set the margin width to 0 in order to line up with other
			// items
			layout.marginWidth = 0;
			group.setLayout(layout);
			group.setFont(font);
			label = new Label(group, SWT.NONE);
			label.setText(labelText);
			label.setFont(font);
			combo = createCombo(group, comboStrings, 0);
			text = new Text(parent, SWT.SINGLE | SWT.BORDER);
			GridData gridData = new GridData(GridData.FILL_HORIZONTAL);
			gridData.widthHint = widthHint;
			text.setLayoutData(gridData);
			text.setFont(font);
			text.setText(initialText);
		}
	}
	
	private static final int RESET_ID = IDialogConstants.CLIENT_ID;
	
	private static final int SELECT_ID = IDialogConstants.CLIENT_ID + 1;
	
	private static final String FRAGMENT_CONTAINS_SUBSTRING = "contains";
	
	private static final String FRAGMENT_DOES_NOT_CONTAIN_SUBSTRING = "does not contain";
	
	private static final String DESCRIPTION_LABEL_TEXT = "description";
	
	private static final String RESET = "Reset";
	
	private ArtifactFilter filter;
	
	private LabelComboTextGroup descriptionGroup;
	
	/**
	 * Creates a new filter dialog instance.
	 * 
	 * @param shell the parent shell, or <code>null</code> to create a top-level shell
	 */
	public FiltersDialog(Shell shell) {
		super(shell);
	}
	
	protected void configureShell(Shell newShell) {
		super.configureShell(newShell);
		newShell.setText("Filters");
	}
	
	protected Control createDialogArea(Composite parent) {
		Composite composite = (Composite) super.createDialogArea(parent);
		//createMarkerLimitArea(composite);
		//createTypesArea(composite);
		//createResourceArea(composite);
		createAttributesArea(composite);
		createResetArea(composite);
		createSeparatorLine(composite);
		
		updateUIFromFilter(getFilter());

		return composite;
	}
	
	Combo createCombo(Composite parent, String[] items, int selectionIndex) {
		Combo combo = new Combo(parent, SWT.DROP_DOWN | SWT.READ_ONLY);
		combo.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		combo.setFont(parent.getFont());
		combo.setItems(items);
		combo.select(selectionIndex);
		return combo;
	}
	
	void createAttributesArea(Composite parent) {
		Composite composite = new Composite(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		layout.numColumns = 2;
		composite.setLayout(layout);
		composite.setFont(parent.getFont());

		String[] filters = {FRAGMENT_CONTAINS_SUBSTRING,
				FRAGMENT_DOES_NOT_CONTAIN_SUBSTRING };
		descriptionGroup = new LabelComboTextGroup(composite,
				DESCRIPTION_LABEL_TEXT, filters, "", 200);
	}
	
	void createResetArea(Composite parent) {
		Composite composite = new Composite(parent, SWT.NONE);
		composite.setFont(parent.getFont());
		composite.setLayout(new GridLayout());
		composite.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_END));

		Button reset = new Button(composite, SWT.PUSH);
		reset.setText(RESET);
		reset.setData(new Integer(RESET_ID));
		reset.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent event) {
				buttonPressed(((Integer) event.widget.getData()).intValue());
			}
		});

		reset.setFont(composite.getFont());
		setButtonLayoutData(reset);
	}
	
	void createSeparatorLine(Composite parent) {
		// Build the separator line
		Label separator = new Label(parent, SWT.HORIZONTAL | SWT.SEPARATOR);
		GridData gd = new GridData(GridData.FILL_HORIZONTAL);
		gd.horizontalSpan = 1;
		separator.setLayoutData(gd);
	}
	
	
	protected void buttonPressed(int buttonId) {
		if (RESET_ID == buttonId) {
			resetPressed();
		} else if (SELECT_ID == buttonId) {
			//do nothing
		} else {
			super.buttonPressed(buttonId);
		}
	}
	
	void resetPressed() {
		updateUIFromFilter(new ArtifactFilter());
	}
	
	protected void okPressed() {
		updateFilterFromUI(getFilter());
		super.okPressed();
		
	}
	
	void updateEnabledState() { }
	
	private void updateFilterFromUI(ArtifactFilter filter) {
		filter.setDescriptionFilterKind(descriptionGroup.combo.getSelectionIndex());
		filter.setDescriptionFilter(descriptionGroup.text.getText());
		filter.setFilterOnDescription(!filter.getDescriptionFilter().equals(""));	
	}
	
	void updateUIFromFilter(ArtifactFilter fragmentsFilter) {
		descriptionGroup.combo.select(fragmentsFilter.getDescriptionFilterKind());
		descriptionGroup.text.setText(fragmentsFilter.getDescriptionFilter());

		updateEnabledState();
	}
	
	/**
	 * Sets the current artifact filter.
	 * 
	 * @param filter the artifact filter
	 */
	public void setFilter(ArtifactFilter filter) {
		this.filter = filter;
	}
	
	/**
	 * @return the artifact filter
	 */
	public ArtifactFilter getFilter() {
		if (filter == null) {
			filter = new ArtifactFilter();
		}
		return filter;
	}
}
