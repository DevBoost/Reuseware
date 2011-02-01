/*******************************************************************************
 * Copyright (c) 2006-2010
 * Software Technology Group, Dresden University of Technology
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Software Technology Group - TU Dresden, Germany
 *      - initial API and implementation
 ******************************************************************************/
package org.reuseware.coconut.compositionprogram.diagram.actions;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.action.IAction;
import org.reuseware.coconut.compositionprogram.diagram.util.OpenEditorUtil;

/**
 * Action that is only applicable for fragment instances in a derived
 * composition program.
 * <p>
 * The action that opens the fragment that contains the element from 
 * which the fragment instance was derived.
 */
public class OpenDeclaringFragmentAction extends FragmentInstanceAction {

	/**
     * @param action the action proxy that handles the presentation portion of the
     *   action
     *   
     * @see IActionDelegat#run(IAction)
	 */
	public void run(IAction action) {
		for (EObject derivedFrom : selectedFragmentInstance.getDerivedFrom()) {
			OpenEditorUtil.openEditor(derivedFrom);
		}
	}
	
	@Override
	protected boolean isEnabled() {
		return !selectedFragmentInstance.getDerivedFrom().isEmpty();
	}

}
