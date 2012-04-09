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
package org.reuseware.sokan.ui.internal.actions;

import org.eclipse.core.resources.IContainer;
import org.reuseware.sokan.Store;
import org.reuseware.sokan.ui.internal.dialogs.NewStoreDialog;

/**
 * Store toggle action that adds only files that match a given pattern 
 * to the repository.
 */
public class SelectFilesStoreToggleAction extends AbstractStoreToggleAction {

	@Override
	protected Store getStore(IContainer container) {
		NewStoreDialog dialog = new NewStoreDialog(shell, container);
		dialog.open();
		return dialog.getStore();
	}
	
	@Override
	protected String getFilterName() {
		return "...";
	}

	@Override
	protected boolean supportsUnMark() {
		return false;
	}

}
