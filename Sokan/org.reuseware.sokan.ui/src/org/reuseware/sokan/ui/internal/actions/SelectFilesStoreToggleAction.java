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
