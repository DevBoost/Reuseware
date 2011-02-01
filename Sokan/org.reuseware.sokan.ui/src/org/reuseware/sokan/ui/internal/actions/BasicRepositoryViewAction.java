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
