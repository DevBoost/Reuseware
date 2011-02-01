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

import java.util.List;

import org.eclipse.jface.action.IAction;
import org.reuseware.coconut.compositionprogram.diagram.util.OpenEditorUtil;
import org.reuseware.coconut.fragment.ComposedFragment;
import org.reuseware.coconut.fragment.Fragment;
import org.reuseware.coconut.resource.ReuseResources;
import org.reuseware.coconut.resource.sokan.IndexConstants;
import org.reuseware.sokan.Constraint;
import org.reuseware.sokan.FacetedRequest;
import org.reuseware.sokan.IndexRow;
import org.reuseware.sokan.index.util.FacetUtil;
import org.reuseware.sokan.index.util.IndexUtil;
import org.reuseware.sokan.index.util.ResourceUtil;

/**
 * Action that is only applicable if the selected fragment instance refers 
 * to a composed fragment.
 * <p>
 * The action opens the composition program responsible for composing
 * the fragment referred to by the selected fragment instance.
 */
public class OpenCompositionProgramAction extends FragmentInstanceAction {

	/**
     * @param action the action proxy that handles the presentation portion of the
     *   action
     *   
     * @see IActionDelegat#run(IAction)
	 */
	public void run(IAction action) {
		List<Constraint> constraints = FacetUtil.buildConstraints(
				IndexConstants.COLUMN_COMPOSED_FRAGMENT,
				ResourceUtil.idString(selectedFragmentInstance.getUFI()));
		FacetedRequest request  = FacetUtil.buildFacetedRequest(constraints);
		for (IndexRow row : IndexUtil.INSTANCE.getIndex(request)) {
			Fragment cpFragment = ReuseResources.INSTANCE.getFragment(
					row.getArtifactID().getSegments(),
					selectedFragmentInstance.eResource().getResourceSet());
			OpenEditorUtil.openEditor(cpFragment);			
		}
	}
	
	@Override
	protected boolean isEnabled() {
		return selectedFragmentInstance.getFragment() instanceof ComposedFragment;
	}

}
