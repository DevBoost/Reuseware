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
package org.reuseware.coconut.description.classify.views.describe;

import org.eclipse.core.resources.IFile;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.jface.viewers.ViewerSorter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.events.ControlAdapter;
import org.eclipse.swt.events.ControlEvent;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.IPerspectiveDescriptor;
import org.eclipse.ui.IPerspectiveListener;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.internal.WorkbenchWindow;
import org.eclipse.ui.part.ViewPart;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.reuseware.coconut.description.Facet;
import org.reuseware.coconut.description.FragmentDescription;
import org.reuseware.coconut.description.classify.DescriptionManager;
import org.reuseware.coconut.description.classify.UtilityProvider;
import org.reuseware.coconut.description.classify.views.facet.FacetViewManager;
import org.reuseware.coconut.repository.resource.ReuseResources;
import org.reuseware.coconut.ui.eclipse.resource.WorkspaceFragmentStoreManager;

@SuppressWarnings("restriction")
public class FragmentDescriptionView extends ViewPart implements IPerspectiveListener {

	public static final String VIEW_ID = "org.reuseware.coconut.description.classify.views.FragmentDescription";
	private static final ImageDescriptor IMG_NEW = AbstractUIPlugin.imageDescriptorFromPlugin(
			"org.reuseware.coconut.description.classify", "icons/actions/new.gif");
	private FragmentDescription context;

	private IWorkbenchPage page;
	private Shell shell;
	private String dialogTitle;

	private FacetViewManager fvManager;

	private TableViewer viewFacet;
	private TableViewerColumn colFacetTypes;
	private FacetSorter facetSorter;

	private TableViewer viewProperties;

	private Action aCreate;
	private Button btnCreateFacet;
	private Button btnEditFacet;
	private Button btnDelete;
	private Button btnClear;

	class NameSorter extends ViewerSorter {	}

	private class FacetEditListener implements IDoubleClickListener, Listener {

		public void doubleClick(DoubleClickEvent event) {
			performEdit();
		}

		public void handleEvent(Event event) {
			performEdit();
		}

		private void performEdit() {
			IStructuredSelection selection = (IStructuredSelection) viewFacet
					.getSelection();
			Facet selectedFacet = (Facet) selection.getFirstElement();
			if (DescriptionManager.isDummyFacet(selectedFacet))
				return;

			fvManager.editFacet(selectedFacet, context);
		}

	}

	public void createPartControl(Composite parent) {
		page = this.getSite().getPage();
		shell = this.getSite().getShell();
		dialogTitle = getTitle();
		fvManager = new FacetViewManager(getSite());

//		fvManager.testTheBest();
		
		// register listeners
		DescriptionViewListener listener = new DescriptionViewListener(this);
		page.addPartListener(listener);
		ReuseResources.INSTANCE.getRootPackage().eAdapters().add(listener);
		((WorkbenchWindow) PlatformUI.getWorkbench().getActiveWorkbenchWindow())
		.addPerspectiveListener(this);

		createLayout(parent);
		createActions();
		contributeToActionBars();
	}

	private void createLayout(Composite parent) {
		FillLayout fLayout = new FillLayout();
		fLayout.marginHeight = 3;
		fLayout.marginWidth = 3;
		parent.setLayout(fLayout);

		SashForm sashForm = new SashForm(parent, SWT.HORIZONTAL | SWT.SMOOTH);

		Group grProperties = new Group(sashForm, SWT.NONE);
		grProperties.setText("Properties");

		Group grFacet = new Group(sashForm, SWT.NONE);
		grFacet.setText("Facets");

		sashForm.setWeights(new int[] { 25, 40 });

		createPropertiesPane(grProperties);
		createFacetPane(grFacet);
	}

	private void createPropertiesPane(Group grProperties) {
		grProperties.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false,
				false));
		grProperties.setLayout(new GridLayout(1, false));

		// create facet table
		viewProperties = new TableViewer(grProperties, SWT.SINGLE
				| SWT.H_SCROLL | SWT.V_SCROLL | SWT.FULL_SELECTION);

		// build table
		String[] head = { "Property", "Value" };
		Table table = viewProperties.getTable();
		table.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		table.setLinesVisible(true);
		table.setHeaderVisible(true);
		for (int i = 0; i < head.length; i++) {
			TableViewerColumn column = new TableViewerColumn(viewProperties,
					SWT.LEFT);
			column.getColumn().setText(head[i]);
			column.getColumn().setResizable(true);
			column.getColumn().setMoveable(true);
			column.setEditingSupport(new PropertyEditingSupport(viewProperties,
					i));
		}
		addResizeSupport(table);

		viewProperties.setContentProvider(new PropertyContentProvider());
		viewProperties.setLabelProvider(new PropertyLabelProvider());
		viewProperties.setSorter(new NameSorter());
		viewProperties.setInput(context);
	}

	private void createFacetPane(Group grFacet) {
		grFacet.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		grFacet.setLayout(new GridLayout(2, false));

		// create facet viewer
		Composite compTable = new Composite(grFacet, SWT.NONE);
		compTable.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

		viewFacet = new TableViewer(compTable, SWT.SINGLE | SWT.H_SCROLL
				| SWT.V_SCROLL | SWT.FULL_SELECTION);

		// build table
		createFacetTable();

		viewFacet.setContentProvider(new FacetContentProvider());
		viewFacet.setLabelProvider(new FacetLabelProvider());
		facetSorter = new FacetSorter();
		viewFacet.setSorter(facetSorter);
		viewFacet.addDoubleClickListener(new FacetEditListener());
		viewFacet.setInput(context);

		// ***************************************************************
		// create facet buttons
		Composite compFacetButtons = new Composite(grFacet, SWT.NONE);
		compFacetButtons.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false,
				false));
		compFacetButtons.setLayout(new GridLayout(1, true));

		btnCreateFacet = new Button(compFacetButtons, SWT.PUSH);
		btnCreateFacet.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false,
				false));
		btnCreateFacet.setText("Create");
		btnCreateFacet.setToolTipText("Create new facet type");
		btnCreateFacet.addListener(SWT.Selection, new Listener() {
			public void handleEvent(Event event) {
				aCreate.run();
				
				//showMessage("Create a new Facet using some sort of fancy dialog.");
				//TestDataFactory.createDirectDerivableFacets();
				//System.out.println("    New Facet Definition Created!");
			}
		});

		new Label(compFacetButtons, SWT.SEPARATOR | SWT.HORIZONTAL)
				.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER, false,
						false));

		btnEditFacet = new Button(compFacetButtons, SWT.PUSH);
		btnEditFacet.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false,
				false));
		btnEditFacet.setText("Edit");
		btnEditFacet.setToolTipText("Edit seleted facet");
		btnEditFacet.addListener(SWT.Selection, new FacetEditListener());

		btnDelete = new Button(compFacetButtons, SWT.PUSH);
		btnDelete
				.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false));
		btnDelete.setText("Delete");
		btnDelete.setToolTipText("Delete seleted facet");
		btnDelete.addListener(SWT.Selection, new Listener() {
			public void handleEvent(Event event) {
				IStructuredSelection selection = (IStructuredSelection) viewFacet
						.getSelection();
				Facet selectedFacet = (Facet) selection.getFirstElement();
				DescriptionManager.removeFacet(context, selectedFacet);
			}
		});

		btnClear = new Button(compFacetButtons, SWT.PUSH);
		btnClear
				.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false));
		btnClear.setText("Clear");
		btnClear.setToolTipText("Delete whole list of facets");
		btnClear.addListener(SWT.Selection, new Listener() {
			public void handleEvent(Event event) {
				Object[] content = ((FacetContentProvider) viewFacet
						.getContentProvider())
						.getElements(viewFacet.getInput());

				// There is only the DummyFacet in the list?
				if (content.length == 1)
					return;

				if (!MessageDialog
						.openQuestion(shell, dialogTitle,
								"Do you really want to delete all facets in this description?"))
					return;
				for (Object object : content)
					DescriptionManager.removeFacet(context, (Facet) object);

				// showMessage("Remove all entries from the list!");
			}
		});

	}

	private void createFacetTable() {
		String[] head = { "Facet", "Value(s)" };
		Table facetTable = viewFacet.getTable();
		facetTable.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		facetTable.setLinesVisible(true);
		facetTable.setHeaderVisible(true);
		for (int i = 0; i < head.length; i++) {
			TableViewerColumn column = new TableViewerColumn(viewFacet,
					SWT.LEFT);
			column.getColumn().setText(head[i]);
			column.getColumn().setResizable(true);
			column.getColumn().setMoveable(true);
			column.setEditingSupport(new FacetEditingSupport(viewFacet, i,
					fvManager));

			if (i == 0) {
				colFacetTypes = column;
				// add sorting behavior
				// colFacetTypes.getColumn().addSelectionListener(
				// new SelectionAdapter() {
				// @Override
				// public void widgetSelected(SelectionEvent e) {
				// TableColumn column = (TableColumn) e.widget;
				//
				// facetSorter.setColumn(0);
				// int dir = viewFacet.getTable()
				// .getSortDirection();
				// if (viewFacet.getTable().getSortColumn() == column) {
				// dir = (dir == SWT.UP) ? SWT.DOWN : SWT.UP;
				// } else {
				// dir = SWT.DOWN;
				// }
				// viewFacet.getTable().setSortDirection(dir);
				// viewFacet.getTable().setSortColumn(column);
				// viewFacet.refresh();
				// }
				// });
			}
		}
		facetTable.setToolTipText("Click "
				+ DescriptionManager.DUMMY_FACET_TYPE
				+ " to add a new facet \nto the description of the fragement.");
		addResizeSupport(facetTable);
	}

	private void addResizeSupport(Table table) {
		table.getParent().addControlListener(new ControlAdapter() {
			public void controlResized(ControlEvent e) {
				if (!(e.getSource() instanceof Composite))
					return;
				Composite parent = (Composite) e.getSource();
				Table table = null;
				for (Control control : parent.getChildren()) {
					if (control instanceof Table) {
						table = (Table) control;
					}
				}
				if (table == null)
					return;

				Rectangle area = parent.getClientArea();
				Point preferredSize = table.computeSize(SWT.DEFAULT,
						SWT.DEFAULT);
				int width = area.width - 2 * table.getBorderWidth() - 13;
				if (preferredSize.y > area.height + table.getHeaderHeight()) {
					// Subtract the scrollbar width from the total column width
					// if a vertical scrollbar will be required
					width -= table.getVerticalBar().getSize().x;
				}
				Point oldSize = table.getSize();
				TableColumn column1 = table.getColumn(0);
				TableColumn column2 = table.getColumn(1);
				if (oldSize.x > area.width) {
					// table is getting smaller so make the columns
					// smaller first and then resize the table to
					// match the client area width
					column1.setWidth(width / 4);
					column2.setWidth(width - column1.getWidth());
					table.setSize(area.width, area.height);
				} else {
					// table is getting bigger so make the table
					// bigger first and then make the columns wider
					// to match the client area width
					table.setSize(area.width, area.height);
					column1.setWidth(width / 4);
					column2.setWidth(width - column1.getWidth());
				}
			}
		});
	}

	private void createActions() {
		aCreate = new Action() {
			public void run() {
				FragmentDescription newContext = DescriptionManager
						.createDescription(UtilityProvider.getFragmentFile());
				updateContent(newContext);
				if (context != null) {
					btnCreateFacet.setEnabled(false);
					aCreate.setEnabled(false);
				}

				// openFacetView(TestDataFactory.getJobFacet());
			}
		};
		aCreate.setText("Create");
		aCreate.setToolTipText("Create Fragment Description");
		aCreate.setImageDescriptor(IMG_NEW);
		aCreate.setEnabled(false);
//		aCreate.setImageDescriptor(PlatformUI.getWorkbench().getSharedImages()
//				.getImageDescriptor(ISharedImages.IMG_TOOL_NEW_WIZARD));
	}

	private void contributeToActionBars() {
		IActionBars bars = getViewSite().getActionBars();
		IToolBarManager manager = bars.getToolBarManager();
		manager.add(aCreate);
	}

	private void updateContent(FragmentDescription newContext) {
		if (!contextHasChanged(newContext))
			return;

		context = newContext;
		System.out.println("New Context: " + context);

		// update properties view
		viewProperties.setInput(context);

		// update facet view
		viewFacet.setInput(context);
		colFacetTypes.setEditingSupport(new FacetEditingSupport(viewFacet, 0,
				fvManager));

		if (context == null) {
//			btnCreateFacet.setEnabled(false);
			btnClear.setEnabled(false);
			btnDelete.setEnabled(false);
			btnEditFacet.setEnabled(false);
		} else {
//			btnCreateFacet.setEnabled(true);
			btnClear.setEnabled(true);
			btnDelete.setEnabled(true);
			btnEditFacet.setEnabled(true);
		}
	}

	private boolean contextHasChanged(FragmentDescription newContext) {
		if (context == null && newContext == null)
			return false;
		if (context != null && context.equals(newContext))
			return false;

		return true;
	}

	// *********************************************************************************************************

	public void reactOnPartActivated() {
		if (!page.isPartVisible(this))
			return;
		
		IFile file = UtilityProvider.getFragmentFile();
		boolean notInStore = !UtilityProvider.isInStore(file);
		if (file == null || notInStore) {
			FragmentDescription newContext = null;
			btnCreateFacet.setEnabled(false);
			aCreate.setEnabled(false);
			updateContent(newContext);
			return;
		}
		
		FragmentDescription newContext;

		if (file != null) {
			newContext = DescriptionManager.open(file);
			if (newContext == null) {
				btnCreateFacet.setEnabled(true);
				aCreate.setEnabled(true);
			}
			else {
				aCreate.setEnabled(false);
			}
		} else {
			btnCreateFacet.setEnabled(false);
			aCreate.setEnabled(false);
			newContext = null;
		}

		if (!contextHasChanged(newContext))
			return;

		System.out.println("");
		System.out.println("** Part Activated");
		updateContent(newContext);
	}

	public void reactOnContentChange(FragmentDescription potentialContext) {
		if (potentialContext == null && contextHasChanged(null)) {
			System.out.println();
			System.out.println("** Content Lost!");
			updateContent(null);
			return;
		}

		if (!page.isPartVisible(this))
			return;

		IFile file = UtilityProvider.getFragmentFile();
		if (file == null)
			return;

		if (!WorkspaceFragmentStoreManager.isFragment(file))
			return;

		if (DescriptionManager.belongTogether(file, potentialContext)) {
			if (!contextHasChanged(potentialContext))
				return;

			System.out.println();
			System.out.println("** Content Changed");
			DescriptionManager.loadDescription(potentialContext);

			// update GUI
			updateContent(potentialContext);
		}
	}

	public void reactOnContentChange(FragmentDescription potentialContext,
			boolean force) {
		if (force)
			context = null;
		reactOnContentChange(potentialContext);
	}

	public void reactOnFacetTypesChanged() {
		colFacetTypes.setEditingSupport(new FacetEditingSupport(viewFacet, 0,
				fvManager));
	}

	public void showMessage(String message) {
		MessageDialog.openInformation(shell, "Fragment Description", message);
	}

	/**
	 * Passing the focus request to the viewer's control.
	 */
	@Override
	public void setFocus() {
	}
	

	/************************************************************************************
	 * IPerspectiveListener methods
	 */
	public void perspectiveActivated(IWorkbenchPage page, IPerspectiveDescriptor perspective) {
		FacetViewManager.hideFastFacetView();
	}

	public void perspectiveChanged(IWorkbenchPage page, IPerspectiveDescriptor perspective,
			String changeId) {
	}
}
