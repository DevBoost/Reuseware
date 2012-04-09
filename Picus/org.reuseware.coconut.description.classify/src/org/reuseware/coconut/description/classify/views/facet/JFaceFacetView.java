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
package org.reuseware.coconut.description.classify.views.facet;

import org.eclipse.jface.viewers.ContentViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.reuseware.coconut.description.Facet;
import org.reuseware.coconut.description.FacetTypeDecorator;
import org.reuseware.coconut.description.FragmentDescription;

public abstract class JFaceFacetView extends FacetView {

	protected Composite compButtons;
	protected Composite compViewer;

	protected abstract ContentViewer buildViewer(boolean isMultiValue);

	protected abstract ContentViewer getViewer();

	protected abstract void setContentProvider(boolean isMultiValue);

	@Override
	public void createPartControl(Composite parent) {
		super.createPartControl(parent);

		createButtonComposite();
		createViewerComposite();
	}

	private void createButtonComposite() {
		if (compCustom == null || compCustom.isDisposed())
			buildCustomComposite();
		compButtons = new Composite(compCustom, SWT.NONE);
		compButtons.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));
		GridLayout gridLayout = new GridLayout(1, false);
		gridLayout.marginWidth = 0;
		gridLayout.marginHeight = 0;
		gridLayout.verticalSpacing = 5;
		gridLayout.horizontalSpacing = 5;
		compButtons.setLayout(gridLayout);
	}

	private void createViewerComposite() {
		if (compCustom == null || compCustom.isDisposed())
			buildCustomComposite();
		compViewer = new Composite(compCustom, SWT.NONE);
		compViewer.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		GridLayout gridLayout = new GridLayout(1, false);
		gridLayout.marginWidth = 0;
		gridLayout.marginHeight = 0;
		gridLayout.verticalSpacing = 5;
		gridLayout.horizontalSpacing = 5;
		compViewer.setLayout(gridLayout);
	}

	@Override
	public void setContext(FacetTypeDecorator context, FragmentDescription description) {
		if (context == null)
			return;

		// clean view if needed
		if (compButtons != null && compButtons.getChildren().length != 0) {
			compButtons.dispose();
			compViewer.dispose();

			createButtonComposite();
			createViewerComposite();
		}

		// create buttons
		if (browserMode)
			addResetAndSetButton(compButtons);
		else
			addSetButton(compButtons);

		// create jFace viewer
		Viewer viewer = buildViewer(context.getDecoratee().isMultiValue());
		viewer.setInput(context);

		super.setContext(context, description);
	}

	private void renewView() {
		if (compButtons == null || compViewer == null || compButtons.isDisposed()
				|| compViewer.isDisposed()) {
			// create Composites
			createButtonComposite();
			createViewerComposite();
			
			// create buttons
			if (browserMode)
				addResetAndSetButton(compButtons);
			else
				addSetButton(compButtons);
		}
	}

	@Override
	public void refreshContext(FacetTypeDecorator context, Facet select) {
		if (context == null)
			return;

		// update the viewer
		ContentViewer viewer = getViewer();
		if (viewer != null) {
			if (viewer.getControl().isDisposed() || viewer.getContentProvider() == null) {
				renewView();
				setContentProvider(context.getDecoratee().isMultiValue());
			}
			viewer.setInput(context);
		}

		// if there were an old selection, set viewer's selection
		if (select != null)
			supportEdit(select);

		super.refreshContext(context, select);
	}
}
