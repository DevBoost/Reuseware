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
package org.reuseware.sokan.ui.internal.views;

import java.util.Set;

import org.eclipse.ui.PlatformUI;
import org.reuseware.sokan.ID;
import org.reuseware.sokan.index.notify.IndexListener;
import org.reuseware.sokan.ui.views.BasicRepositoryView;

/**
 * Listener that updates the fragment repository view's model according
 * to changes in the Sokan repository.
 */
public class BasicRepositoryIndexListener implements IndexListener {
	
	private BasicRepositoryView basicRepositoryView;
	
	/**
	 * Create a new listener for the given repository view.
	 * 
	 * @param basicRepositoryView the repository view
	 */
	public BasicRepositoryIndexListener(BasicRepositoryView basicRepositoryView) {
		this.basicRepositoryView = basicRepositoryView;
	}

	/**
	 * Updates the repository view according to index changes.
	 * 
	 * @param delta IDs of the artifacts to update
	 */
	public void indexChanged(final Set<ID> delta) {
		PlatformUI.getWorkbench().getDisplay().asyncExec(new Runnable() {	
			public void run() {
				basicRepositoryView.updateViewModel(delta);
			}
		});
	}
}
