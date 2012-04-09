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
package org.reuseware.coconut.description.browse.views;

import org.eclipse.ui.IFolderLayout;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;
import org.reuseware.coconut.description.browse.MainBrowserManager;
import org.reuseware.coconut.description.browse.views.additionalfacets.AdditionalFacetsView;
import org.reuseware.coconut.description.browse.views.content.ContentView;
import org.reuseware.coconut.description.browse.views.groupsort.GroupSortView;
import org.reuseware.coconut.description.browse.views.search.SearchView;
import org.reuseware.coconut.description.browse.views.selectedfacets.SelectedFacetsView;

public class BrowserPerspectiveFactory implements IPerspectiveFactory {
	public static final String PERSPECTIVE_ID = "org.reuseware.coconut.description.browse.perspective";

	private static final String VIEW_FACET = "org.reuseware.coconut.description.facetview.*";
	private static final String VIEW_CONTENT = ContentView.VIEW_ID;
	private static final String VIEW_ADDITIONAL_FACETS = AdditionalFacetsView.VIEW_ID;
	private static final String VIEW_SELECTED_FACETS = SelectedFacetsView.VIEW_ID;
	private static final String VIEW_SEARCH = SearchView.VIEW_ID;
	private static final String VIEW_GROUP_SORT = GroupSortView.VIEW_ID;

	private static final String LEFT_TOP = "leftTop";
	private static final String LEFT_MIDDLE = "leftMiddle";
	private static final String LEFT_BOTTOM = "leftBottom";

	private static final String CENTER_TOP = "centerTop";
	private static final String CENTER_BOTTOM = "centerBottom";

	private static final String RIGHT_TOP = "rightTop";
	private static final String RIGHT_MIDDLE = "rightMiddle";
	private static final String RIGHT_BOTTOM = "rightBottom";

	public void createInitialLayout(IPageLayout myLayout) {
		defineActions(myLayout);
		defineLayout(myLayout);
		start();
	}
	
	private void defineActions(IPageLayout myLayout) {
		// Add "show views".
		myLayout.addShowViewShortcut(VIEW_CONTENT);
		myLayout.addShowViewShortcut(VIEW_ADDITIONAL_FACETS);
		myLayout.addShowViewShortcut(VIEW_SELECTED_FACETS);	
		myLayout.addShowViewShortcut(VIEW_SEARCH);
		myLayout.addShowViewShortcut(VIEW_GROUP_SORT);
	}
	
	private void defineLayout(IPageLayout myLayout) {
		String editArea = myLayout.getEditorArea();
		myLayout.setEditorAreaVisible(false);

		// left side
		IFolderLayout leftTop = myLayout.createFolder(LEFT_TOP, IPageLayout.LEFT, 0.25f, editArea);
		leftTop.addPlaceholder(VIEW_FACET + ":0");

		IFolderLayout leftMiddle = myLayout.createFolder(LEFT_MIDDLE, IPageLayout.BOTTOM,
				0.333333f, LEFT_TOP);
		leftMiddle.addPlaceholder(VIEW_FACET + ":1");

		IFolderLayout leftBottwom = myLayout.createFolder(LEFT_BOTTOM, IPageLayout.BOTTOM, 0.5f,
				LEFT_MIDDLE);
		leftBottwom.addPlaceholder(VIEW_FACET + ":2");

		// right side
		IFolderLayout topRight = myLayout.createFolder(RIGHT_TOP, IPageLayout.RIGHT, 0.66f,
				editArea);
		topRight.addPlaceholder(VIEW_FACET + ":3");

		IFolderLayout rightMiddle = myLayout.createFolder(RIGHT_MIDDLE, IPageLayout.BOTTOM,
				0.333333f, RIGHT_TOP);
		rightMiddle.addPlaceholder(VIEW_FACET + ":4");

		IFolderLayout bottomRight = myLayout.createFolder(RIGHT_BOTTOM, IPageLayout.BOTTOM, 0.5f,
				RIGHT_MIDDLE);
		bottomRight.addPlaceholder(VIEW_FACET + ":5");
		// bottomRight.addView(FragmentBrowserView.VIEW_ID);

		// center
		IFolderLayout centerTop = myLayout.createFolder(CENTER_TOP, IPageLayout.TOP, 0.85f,
				editArea);
		centerTop.addView(VIEW_CONTENT);

		IFolderLayout centerBottom = myLayout.createFolder(CENTER_BOTTOM, IPageLayout.BOTTOM,
				0.666667f, CENTER_TOP);
		centerBottom.addView(VIEW_ADDITIONAL_FACETS);
		centerBottom.addView(VIEW_SELECTED_FACETS);
		centerBottom.addView(VIEW_SEARCH);
		centerBottom.addView(VIEW_GROUP_SORT);
	}
	
	private void start() {
		// start browser's main controller
		MainBrowserManager mbm = MainBrowserManager.getInstance();
		mbm.isNewPerspective(true);
	}

}
