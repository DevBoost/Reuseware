package org.reuseware.comogen.ui.internal.actions;

import org.eclipse.jface.action.Action;
import org.reuseware.comogen.ui.views.CompositionSystemRepositoryView;

/**
 * Common base class for actions associated with the
 * composition system repository view.
 */
public abstract class CompositionSystemRepositoryAction extends Action {
	private CompositionSystemRepositoryView compositionSystemRepositoryView;
	
	/**
	 * Constructs a new action.
	 * 
	 * @param view the associated <code>CompositionSystemRepositoryView</code>
	 */
	public CompositionSystemRepositoryAction(CompositionSystemRepositoryView view) {
		this.compositionSystemRepositoryView = view;
	}
	
	/**
	 * @return the associated <code>CompositionSystemRepositoryView</code>
	 */
	public CompositionSystemRepositoryView getCompositionSystemRepositoryView() {
		return compositionSystemRepositoryView;
	}
}
