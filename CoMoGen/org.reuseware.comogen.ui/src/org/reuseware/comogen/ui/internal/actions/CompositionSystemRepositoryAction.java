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
