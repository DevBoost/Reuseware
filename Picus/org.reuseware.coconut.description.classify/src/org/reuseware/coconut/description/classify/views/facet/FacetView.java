/*******************************************************************************
 * Copyright (c) 2006-2009
 * Software Technology Group, Dresden University of Technology
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Software Technology Group - TU Dresden, Germany
 *      - initial API and implementation
 ******************************************************************************/
package org.reuseware.coconut.description.classify.views.facet;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StackLayout;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.ui.part.ViewPart;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.reuseware.coconut.description.DescriptionFactory;
import org.reuseware.coconut.description.Facet;
import org.reuseware.coconut.description.FacetTypeDecorator;
import org.reuseware.coconut.description.FacetValue;
import org.reuseware.coconut.description.FacetValueDecorator;
import org.reuseware.coconut.description.FragmentDescription;
import org.reuseware.coconut.description.classify.DecorationManager;
import org.reuseware.coconut.description.classify.DescriptionManager;
import org.reuseware.coconut.description.classify.UtilityProvider;

public abstract class FacetView extends ViewPart {

	public String VIEW_ID = this.getClass().getName();
	public boolean browserMode = false;
	public int place = 0;

	protected Composite compCustom;

	protected FacetTypeDecorator context;
	protected Facet editContext;

	protected FacetTypeDecorator replaceContext;
	protected Facet replaceSelection;

	protected EList<FacetValueDecorator> selection;
	protected Label lblInfo;

	private FragmentDescription fDesc;

	private Color green;
	private Color black;
	private ZoomListener zoomer;
	private Composite mainComposite;
	private Button btnReset;

	protected abstract EList<FacetValueDecorator> fillSelection();

	public abstract void print();

	public abstract void supportReset();

	protected void addSetButton(Composite compButton) {
		Composite compSet = new Composite(compButton, SWT.NONE);
		compSet.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));
		GridLayout gridLayout = new GridLayout(2, false);
		gridLayout.marginWidth = 0;
		gridLayout.marginHeight = 0;
		gridLayout.verticalSpacing = 5;
		gridLayout.horizontalSpacing = 5;
		compSet.setLayout(gridLayout);

		// System.out.println();
		// if (context != null)
		// if (context.getDescription() != null
		// && !context.getDescription().equals("")) {
		// Group grDescription = new Group(compSet, SWT.NONE);
		// grDescription.setLayoutData(new GridData(SWT.FILL, SWT.FILL,
		// true, false));
		// grDescription.setText("Description");
		// GridData gData = new GridData(SWT.FILL, SWT.FILL, true, false);
		// gData.widthHint = SWT.DEFAULT;
		// gData.heightHint = SWT.DEFAULT;
		// gData.horizontalSpan = 2;
		// grDescription.setLayoutData(gData);
		//
		// Label lblDesc = new Label(grDescription, SWT.NONE);
		// lblDesc.setText(context.getDescription());
		// }

		buildSetButton(compSet);
		buildInfoLabel(compSet);

		compButton.pack(true);
	}

	protected void addResetAndSetButton(Composite compButton) {
		Composite compSet = new Composite(compButton, SWT.NONE);
		compSet.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));
		GridLayout gridLayout = new GridLayout(3, false);
		gridLayout.marginWidth = 0;
		gridLayout.marginHeight = 0;
		gridLayout.verticalSpacing = 5;
		gridLayout.horizontalSpacing = 5;
		compSet.setLayout(gridLayout);

		buildSetButton(compSet);
		buildResetButton(compSet);
		buildInfoLabel(compSet);

		// compCustom.pack(true);
	}

	private void buildSetButton(Composite compSet) {
		Button btnSet = new Button(compSet, SWT.PUSH);
		btnSet.setLayoutData(new GridData(SWT.BEGINNING, SWT.CENTER, false, false));
		btnSet.setText("Set");
		btnSet.setToolTipText("Save And Close.");
		btnSet.addListener(SWT.Selection, new Listener() {
			public void handleEvent(Event event) {
				handleSetButton();
			}
		});
	}

	private void buildResetButton(Composite compSet) {
		btnReset = new Button(compSet, SWT.PUSH);
		btnReset.setLayoutData(new GridData(SWT.BEGINNING, SWT.CENTER, false, false));
		btnReset.setText("Reset");
		btnReset.setToolTipText("Clear Selection");
		btnReset.addListener(SWT.Selection, new Listener() {
			public void handleEvent(Event event) {
				supportReset();
				tellUserToSelect();
			}
		});
	}

	private void buildInfoLabel(Composite compSet) {
		lblInfo = new Label(compSet, SWT.NONE);
		lblInfo.setLayoutData(new GridData(SWT.BEGINNING, SWT.CENTER, false, false));
		lblInfo.setText("Please select (at least) one entry below and hit Set.");

		Label lblSeperator = new Label(compSet, SWT.SEPARATOR | SWT.HORIZONTAL);
		GridData gridData = new GridData(SWT.FILL, SWT.FILL, true, false);
		gridData.widthHint = SWT.DEFAULT;
		gridData.heightHint = SWT.DEFAULT;
		gridData.horizontalSpan = 3;
		lblSeperator.setLayoutData(gridData);
	}

	protected void buildCustomComposite() {
		if (mainComposite == null || mainComposite.isDisposed())
			getSite().getPage().hideView(this);

		compCustom = new Composite(mainComposite, SWT.NONE);
		compCustom.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		compCustom.setLayout(new GridLayout(1, false));
	}

	@Override
	public void createPartControl(Composite parent) {
		this.selection = null;
		this.mainComposite = parent;
		Display disp = getSite().getShell().getDisplay();
		this.green = disp.getSystemColor(SWT.COLOR_DARK_GREEN);
		this.black = disp.getSystemColor(SWT.COLOR_BLACK);

		// do some layout stuff
		buildCustomComposite();

		Composite compDefault = new Composite(mainComposite, SWT.NONE);
		compDefault.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		compDefault.setLayout(new GridLayout(1, false));

		StackLayout sLayout = new StackLayout();
		sLayout.topControl = compDefault;
		mainComposite.setLayout(sLayout);

		// show a message
		Label lblMessage = new Label(compDefault, SWT.WRAP);
		lblMessage.setLayoutData(new GridData(SWT.BEGINNING, SWT.CENTER, true, false));
		lblMessage.setText("Sorry, this view needs to be opened in the "
				+ "context of a FacetType presented by the view " + "Fragement Description");

		// offer exit button
		Button btnClose = new Button(compDefault, SWT.PUSH);
		btnClose.setLayoutData(new GridData(SWT.BEGINNING, SWT.CENTER, false, false));
		btnClose.setText("Exit");
		btnClose.addListener(SWT.Selection, new Listener() {
			public void handleEvent(Event event) {
				handleSetButton();
			}
		});
		GridData gData = new GridData(SWT.BEGINNING, SWT.FILL, true, false);
		gData.widthHint = SWT.DEFAULT;
		gData.heightHint = SWT.DEFAULT;
		btnClose.setLayoutData(gData);
	}

	public FacetTypeDecorator getContext() {
		return context;
	}

	public FacetTypeDecorator getReplaceContext() {
		return replaceContext;
	}

	public void setReplaceContext(FacetTypeDecorator replacement) {
		this.replaceContext = replacement;
	}

	/**
	 * @return the replaceSelection
	 */
	public Facet getReplaceSelection() {
		return replaceSelection;
	}

	/**
	 * @param replaceSelection
	 *            the replaceSelection to set
	 */
	public void setReplaceSelection(Facet replaceSelection) {
		this.replaceSelection = replaceSelection;
	}

	public EList<FacetValueDecorator> getSelection() {
		return selection;
	}

	public EList<FacetValueDecorator> getSelection(boolean refresh) {
		if (refresh)
			selection = fillSelection();
		return selection;
	}

	protected void handleSetButton() {
		// get view's selection
		selection = fillSelection();
		if (selection == null || selection.size() == 0)
			return;

		// update FragmentDescription
		EList<FacetValueDecorator> oldSelection = new BasicEList<FacetValueDecorator>();
		if (editContext != null) {
			for (FacetValue fValue : editContext.getValues()) {
				oldSelection.add(DecorationManager.buildFacetValueDecorator(fValue));
			}
		}
		if (fDesc != null && selection != null && selection.size() != 0
				&& !selection.equals(oldSelection)) {

			EList<FacetValue> selectedValues = new BasicEList<FacetValue>(selection.size());
			for (FacetValueDecorator vDecor : selection) {
				selectedValues.add(vDecor.getDecoratee());
			}

			if (editContext != null) {
				// look on the multiValue flag
				if (context.getDecoratee().isMultiValue()) // do we need this?
					// multiValue check?
					DescriptionManager.editFacet(fDesc, editContext, selectedValues);
				else {
					BasicEList<FacetValue> selected = new BasicEList<FacetValue>(1);
					selected.add(selection.get(0).getDecoratee());
					DescriptionManager.editFacet(fDesc, editContext, selected);
				}
			} else {
				// look on the multiValue flag
				if (context.getDecoratee().isMultiValue())
					DescriptionManager.addFacet(fDesc, context.getDecoratee(), selectedValues);
				else {
					BasicEList<FacetValue> selected = new BasicEList<FacetValue>(1);
					selected.add(selection.get(0).getDecoratee());
					DescriptionManager.addFacet(fDesc, context.getDecoratee(), selected);
				}
			}
		}

		// hide the facet view
		getSite().getPage().hideView(this);
	}

	@SuppressWarnings("unchecked")
	public void setContext(FacetTypeDecorator context, FragmentDescription description) {
		this.context = context;
		this.fDesc = description;
		selection = null;

		if (context == null)
			return;

		((StackLayout) mainComposite.getLayout()).topControl = compCustom;
		compCustom.pack();
		mainComposite.layout();

		if (browserMode) {
			tellUserToSelect();
		}

		setTitleToolTip(context.getDecoratee().getDescription());
		setPartName(context.getDecoratee().getName());

		Class[] interfaces = context.getDecoratee().getClass().getInterfaces();
		if (interfaces == null || interfaces.length == 0)
			return;
		String type = interfaces[0].getSimpleName();
		Image icon = AbstractUIPlugin.imageDescriptorFromPlugin(
				"org.reuseware.coconut.description.edit", "icons/full/obj16/" + type + ".gif")
				.createImage();

		if (icon != null)
			setTitleImage(icon);
	}

	protected void tellUserToSelect() {
		if (lblInfo == null || lblInfo.isDisposed())
			return;

		if (context.getDecoratee().isMultiValue())
			lblInfo.setText("Select at least one entry.");
		else
			lblInfo.setText("Select one entry.");
		lblInfo.setForeground(black);
	}

	protected void tellUserToHitSet() {
		if (!browserMode)
			return;

		if (lblInfo != null && !lblInfo.isDisposed()) {
			lblInfo.setText("To close view hit Set.");
			lblInfo.setForeground(green);
		}
	}

	protected void performZoom() {
		if (!browserMode)
			return;

		// check whether selection has changed
		EList<FacetValueDecorator> oldSelection = selection;
		selection = fillSelection();
		if (UtilityProvider.equal(oldSelection, selection))
			return;

		// Show a message
		tellUserToHitSet();

		// perform zoom-in / zoom-out
		if (zoomer != null) {
			EList<FacetValue> selectedValues = new BasicEList<FacetValue>(selection.size());
			for (FacetValueDecorator vDecor : selection) {
				selectedValues.add(vDecor.getDecoratee());
			}
			zoomer.zoom(DescriptionManager.buildFacet(context.getDecoratee(), selectedValues),
					false);
		}
	}

	public void setZoomListener(ZoomListener zoomer) {
		this.zoomer = zoomer;
	}

	@Override
	public void setFocus() {
		// do nothing
	}

	public void supportEdit(Facet facet) {
		editContext = facet;
		selection = fillSelection();
		tellUserToHitSet();
	}

	public void refreshContext(FacetTypeDecorator context, Facet select) {
		// TODO BUG FacetView refresh doesn't work if we drag'n'drop or
		// doubleclick
		if (context != null)
			this.context = context;

		if (select != null)
			supportEdit(select);
	}

	/**
	 * Cleans the view and sets the selection to an empty list.
	 */
	public void clean(FacetTypeDecorator newContext) {
		// there is an empty edit Context
		if (editContext != null && editContext.getType() == null)
			return;

		// there is a null edit Context but no selection stored.
		// if (editContext == null && (selection==null||selection.size()==0))
		// return;

		// perform the clean up
		Facet empty = DescriptionFactory.eINSTANCE.createFacet();
		if (newContext == null)
			refreshContext(context, empty);
		else
			refreshContext(newContext, empty);
		tellUserToSelect();
	}
}
