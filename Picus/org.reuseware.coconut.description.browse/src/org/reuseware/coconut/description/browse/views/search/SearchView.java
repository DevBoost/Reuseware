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
package org.reuseware.coconut.description.browse.views.search;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Text;
import org.reuseware.coconut.description.browse.views.AbstractBrowserView;

public class SearchView extends AbstractBrowserView {

	public static final String VIEW_ID = "org.reuseware.coconut.description.browse.views.search.SearchView";

	@Override
	public void createPartControl(Composite parent) {
		// group box

		GridLayout gLayout = new GridLayout(3, false);
		parent.setLayout(gLayout);

		// text input
		Text txtSearchInput = new Text(parent, SWT.SINGLE | SWT.BORDER);
		txtSearchInput.setText("text");
		GridData gd = new GridData(GridData.FILL_HORIZONTAL);
		gd.horizontalSpan = 2;
		txtSearchInput.setLayoutData(gd);

		// start button
		Button btnGo = new Button(parent, SWT.PUSH);
		btnGo.setText("Search");
		btnGo.addListener(SWT.Selection, new Listener() {
			public void handleEvent(Event event) {
				System.out.println("SEARCH pressed");
			}
		});

		// search hole repository
		Button rBtnAllItems = new Button(parent, SWT.RADIO);
		rBtnAllItems.setText("all items");

		// just search current result set
		Button rBtnCurrentItems = new Button(parent, SWT.RADIO);
		rBtnCurrentItems.setText("current result");

		// start button
		Button btnRefresh = new Button(parent, SWT.PUSH);
		btnRefresh.setText("Refresh");
		btnRefresh.addListener(SWT.Selection, new Listener() {
			public void handleEvent(Event event) {
				System.out.println("REFRESH pressed");
			}
		});
	}

	@Override
	public void update() {
		// do nothing
	}

}
