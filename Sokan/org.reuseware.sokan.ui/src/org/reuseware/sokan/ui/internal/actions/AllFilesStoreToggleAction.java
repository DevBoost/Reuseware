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

import java.util.Collections;

import org.eclipse.core.resources.IContainer;
import org.reuseware.sokan.Store;
import org.reuseware.sokan.index.util.StoreUtil;

/**
 * Store toggle action that adds all files in the store to the repository.
 */
public class AllFilesStoreToggleAction extends AbstractStoreToggleAction {

	@Override
	protected Store getStore(IContainer container) {
		return StoreUtil.INSTANCE.buildStore(
				Collections.singletonList("*.*"), container);
	}

	@Override
	protected String getFilterName() {
		return " (All Files)";
	}

	@Override
	protected boolean supportsUnMark() {
		return true;
	}
}
