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
package org.reuseware.coconut.description.browse.views;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.eclipse.ui.PlatformUI;
import org.reuseware.coconut.description.BrowserState;
import org.reuseware.coconut.description.FacetDefinition;
import org.reuseware.coconut.description.FragmentDescription;
import org.reuseware.coconut.description.browse.BrowserStateManager;
import org.reuseware.coconut.description.classify.DescriptionManager;

public class BrowserStateListener extends EContentAdapter {

	private FragmentDescription fDesc;
	private BrowserStateManager stateManager;
	private FacetDefinition facetDef;

	public BrowserStateListener(BrowserStateManager stateManager) {
		this.stateManager = stateManager;
	}

	@Override
	public void notifyChanged(Notification notification) {
		// TODO BUG IMPORTING NEW FACETS OR FRAGMENTS LEADS TO MAJOR BUGS!
		super.notifyChanged(notification);

		if (notification.getNotifier() instanceof FragmentDescription) {
			fDesc = (FragmentDescription) notification.getNotifier();
		} else if (notification.getNewValue() instanceof FragmentDescription) {
			// new fragment descriptions where added
			fDesc = (FragmentDescription) notification.getNewValue();
			addDescription();
		} else if (notification.getNewValue() instanceof FacetDefinition) {
			// new facet types where added
			facetDef = (FacetDefinition) notification.getNewValue();
			updateFacets();
		} else if (notification.getNotifier() instanceof FacetDefinition) {
			// facet types where changed - properly removed
			facetDef = (FacetDefinition) notification.getNotifier();
			updateFacets();
		}
	}

	private void addDescription() {
		if (fDesc == null)
			return;

		Runnable run = new Runnable() {
			public void run() {
				// build FragmentDescription's inner structur
				fDesc = DescriptionManager.build(fDesc);
				
				// update state
				BrowserState state = stateManager.getState();
				state.getFilteredContent().add(fDesc);
				stateManager.setState(state);
			}
		};
		try {
			PlatformUI.getWorkbench().getDisplay().syncExec(run);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void updateFacets() {
		if (facetDef == null)
			return;

		Runnable run = new Runnable() {
			public void run() {
				BrowserState state = stateManager.updateFacets();
				stateManager.setState(state);
			}
		};
		try {
			PlatformUI.getWorkbench().getDisplay().syncExec(run);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
