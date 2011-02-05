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
package org.reuseware.sokan.ui.internal.actions;

import java.net.URL;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.window.Window;
import org.reuseware.sokan.ui.SokanUIPlugin;
import org.reuseware.sokan.ui.internal.filters.ArtifactFilter;
import org.reuseware.sokan.ui.internal.filters.FiltersDialog;
import org.reuseware.sokan.ui.views.BasicRepositoryView;

/**
 * Action that allows users to define a filter for the artifacts
 * displayed in the view.
 */
public class FiltersAction extends BasicRepositoryViewAction {

	private static ImageDescriptor filterImage;
	static {
		URL url = null;
		url = SokanUIPlugin.getDefault().getBundle().getResource("icons/filter.gif");
		filterImage = ImageDescriptor.createFromURL(url);
	}
	
	/**
	 * Constructs a new action for the given repository view.
	 * 
	 * @param view the repository view
	 */
	public FiltersAction(BasicRepositoryView view) {
		super(view);
		this.setText("Filter Artifacts");
		this.setToolTipText("Configure Filters");
		this.setImageDescriptor(filterImage);
	}
	
	@Override
	public void run() {
		FiltersDialog dialog = new FiltersDialog(getShell());
		ArtifactFilter filter = getBasicRepositoryView().getFilter();
		dialog.setFilter(filter);
		int result = dialog.open();
		if (result == Window.OK) {
			getBasicRepositoryView().filterChanged();
		}
	}

}
