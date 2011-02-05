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

import org.eclipse.jface.action.Action;
import org.eclipse.swt.widgets.Shell;
import org.reuseware.sokan.ui.views.BasicRepositoryView;

/**
 * Common base implementation for actions associated with a
 * repository view.
 */
public abstract class BasicRepositoryViewAction extends Action {

	private BasicRepositoryView basicRepositoryView;

	/**
	 * Constructs a new action for the given repository view.
	 * 
	 * @param view the repository view
	 */
	public BasicRepositoryViewAction(BasicRepositoryView view) {
		this.basicRepositoryView = view;
	}
	
	protected Shell getShell() {
		return basicRepositoryView.getSite().getShell();
	}
	
	protected BasicRepositoryView getBasicRepositoryView() {
		return basicRepositoryView;
	}
}
