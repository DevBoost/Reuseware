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
package org.reuseware.coconut.compositionprogram.diagram.edit.policies;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.OpenEditPolicy;
import org.eclipse.gmf.runtime.notation.View;
import org.reuseware.coconut.compositionprogram.FragmentInstance;
import org.reuseware.coconut.compositionprogram.diagram.edit.parts.FragmentInstanceNameEditPart;
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
 * Policy for double-clicking a fragment instance in the UCL editor. 
 * The policy produces a command that opens the fragment of the clicked
 * fragment instance in a new editor using the <code>OpenEditorUtil</code>.
 * If the fragment is a composed fragment, the composition program responsible
 * for creating the fragment is opened instead. In hierarchical composition
 * scenarios, this allows an easy navigation down the hierarchy by double-clicking
 * only.
 */
public class FragmentInstanceDoubleClickEditPolicy extends OpenEditPolicy {
	
	/**
     * @param request the request (not used)
     * @return command that opens a new editor when executed
	 */
	@Override
	protected Command getOpenCommand(Request request) {
		
		return new Command() {
			public void execute() {
				EditPart host = getHost();
				if (host instanceof FragmentInstanceNameEditPart) {
					host = host.getParent();
				}
				
				EObject element = ((View) host.getModel()).getElement();
				
				if (element instanceof FragmentInstance) {
					FragmentInstance fragmentInstance = (FragmentInstance) element;
					Fragment fragment = fragmentInstance.getFragment();
					if (fragment instanceof ComposedFragment) {
						List<Constraint> constraints = FacetUtil.buildConstraints(
								IndexConstants.COLUMN_COMPOSED_FRAGMENT,
								ResourceUtil.idString(fragmentInstance.getUFI()));
						FacetedRequest request  = FacetUtil.buildFacetedRequest(constraints);
						for (IndexRow row : IndexUtil.INSTANCE.getIndex(request)) {
							Fragment cpFragment = ReuseResources.INSTANCE.getFragment(
									row.getArtifactID().getSegments(),
									fragmentInstance.eResource().getResourceSet());
							OpenEditorUtil.openEditor(cpFragment);			
						}
					} else {
						OpenEditorUtil.openEditor(fragment);	
					}
				}
			}

			@Override
			public boolean canUndo() {
				return false;
			}
		};
	}
	
}
