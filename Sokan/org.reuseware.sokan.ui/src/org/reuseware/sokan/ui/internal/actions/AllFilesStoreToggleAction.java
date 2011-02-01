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
