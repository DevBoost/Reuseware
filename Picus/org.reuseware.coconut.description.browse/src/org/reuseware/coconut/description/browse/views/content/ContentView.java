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
package org.reuseware.coconut.description.browse.views.content;

import java.net.URL;
import java.util.List;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.jface.viewers.ViewerSorter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Table;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.reuseware.coconut.description.FragmentDescription;
import org.reuseware.coconut.description.browse.views.AbstractBrowserView;
import org.reuseware.coconut.description.classify.DescriptionManager;
import org.reuseware.coconut.description.classify.UtilityProvider;
import org.reuseware.coconut.ui.eclipse.CoCoNutUIPlugin;

public class ContentView extends AbstractBrowserView {

	public static final String VIEW_ID = "org.reuseware.coconut.description.browse.views.content.ContentView";
	private static final ImageDescriptor IMG_RESTART = AbstractUIPlugin.imageDescriptorFromPlugin(
			"org.reuseware.coconut.description.browse", "icons/actions/restart.gif");

	private ContentController myController;
	private TableViewer contentViewer;
	private Action aRestart;
	private Action reuseAction;

	
	class NameSorter extends ViewerSorter {
	}
	
	@Override
	public void createPartControl(Composite parent) {
		myController = new ContentController(this);
		controller = myController;
		createActions();
		contributeToActionBars();
		
		parent.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		GridLayout gridLayout = new GridLayout(1, false);
		gridLayout.marginWidth = 0;
		gridLayout.marginHeight = 0;
		parent.setLayout(gridLayout);
		
		// create facet table
		contentViewer = new TableViewer(parent, SWT.SINGLE | SWT.H_SCROLL
				| SWT.V_SCROLL | SWT.FULL_SELECTION);

		// build table
		String[] head = DescriptionManager.PROPERTY_TYPES;
		int[] widthPercent = { 30, 15, 10, 45 };
		Table table = contentViewer.getTable();
		table.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		table.setLinesVisible(true);
		table.setHeaderVisible(true);
		table.setToolTipText("Double click an entry to add the \nfragment to a composition program.");
		for (int i = 0; i < head.length; i++) {
			TableViewerColumn column = new TableViewerColumn(contentViewer, SWT.LEFT);
			column.getColumn().setText(head[i]);
			column.getColumn().setResizable(true);
			column.getColumn().setMoveable(true);
		}
		UtilityProvider.addResizeSupportToTable(table, widthPercent, 17);

		contentViewer.setContentProvider(new BrowserContentProvider());
		contentViewer.setLabelProvider(new BrowserLabelProvider());
		contentViewer.addDoubleClickListener(new IDoubleClickListener() {
			public void doubleClick(DoubleClickEvent event) {
				IStructuredSelection selection = (IStructuredSelection) event.getSelection();
				myController.select((FragmentDescription) selection.getFirstElement(), getSite());
				myController.test((FragmentDescription) selection.getFirstElement());
			}
		});
		
		contentViewer.setSorter(new NameSorter(){});
		
		update();
	}

	private void createActions() {
		aRestart = new Action() {
			public void run() {
				myController.restartBrowser();
			}
		};
		aRestart.setText("Restart");
		aRestart.setToolTipText("Restart Fragment Browser");
		aRestart.setImageDescriptor(IMG_RESTART);
//		aRestart.setImageDescriptor(PlatformUI.getWorkbench().getSharedImages()
//				.getImageDescriptor(ISharedImages.IMG_ETOOL_HOME_NAV));
		
		reuseAction = new Action() {
			public void run() {
				IStructuredSelection selection = (IStructuredSelection) contentViewer.getSelection();
				FragmentDescription element = (FragmentDescription) selection.getFirstElement();
				
				myController.select(element, getSite());
			}
		};
		reuseAction.setText("Reuse Fragment");
		reuseAction.setToolTipText("Reuse the selected fragment");
		reuseAction.setImageDescriptor(useFragmentImage);
		reuseAction.setEnabled(true);
	}
	
	private void contributeToActionBars() {
		IActionBars bars = getViewSite().getActionBars();
		IToolBarManager manager = bars.getToolBarManager();
		manager.add(reuseAction);
		manager.add(aRestart);
	}
	
	@Override
	public void update() {		
		if (contentViewer.getContentProvider() == null)
			contentViewer.setContentProvider(new BrowserContentProvider());
		
		if (contentViewer.getControl().isDisposed())
			return;
		
		contentViewer.setInput(myController.getFilteredContent());
		updateContentDescription();
	}
	
	@SuppressWarnings("unchecked")
	private void updateContentDescription() {
		int count = ((List) contentViewer.getInput()).size();
		setContentDescription("There are " + count + " fragments in this list!");
	}

	public void enableRestartAction(boolean enabled) {
		if (aRestart != null)
			aRestart.setEnabled(enabled);
	}
	
	private static ImageDescriptor useFragmentImage;
	static {
		URL url = null;
		url = CoCoNutUIPlugin.getDefault().getBundle().getResource("icons/UseFragment.gif");
		useFragmentImage = ImageDescriptor.createFromURL(url);
	}
}
