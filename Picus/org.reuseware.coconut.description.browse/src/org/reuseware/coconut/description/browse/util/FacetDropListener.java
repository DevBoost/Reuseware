/*******************************************************************************
 * Copyright (c) 2006-2009
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
package org.reuseware.coconut.description.browse.util;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.swt.dnd.DropTargetAdapter;
import org.eclipse.swt.dnd.DropTargetEvent;
import org.reuseware.coconut.description.FacetTypeDecorator;
import org.reuseware.coconut.description.browse.BrowserStateManager;
import org.reuseware.coconut.description.browse.MainBrowserManager;
import org.reuseware.coconut.description.classify.views.facet.FacetView;
import org.reuseware.coconut.repository.ID;
import org.reuseware.coconut.repository.RepositoryFactory;

/**
 * 
 * @author Matthias Schmidt
 * 
 */
public class FacetDropListener extends DropTargetAdapter {

	private FacetView view;

	public FacetDropListener(FacetView view) {
		this.view = view;
	}

	@Override
	public void drop(DropTargetEvent event) {
		// extract facet type ID
		String[] split = ((String) event.data).split("/");
		List<String> facetTypeID = new ArrayList<String>(split.length);
		for (String string : split)
			facetTypeID.add(string);

		// set view's replacement decorator
		BrowserStateManager stateManager = MainBrowserManager.getInstance()
				.getBrowserStateManager();
		ID typeID = RepositoryFactory.eINSTANCE.createID();
		typeID.getSegments().addAll(facetTypeID);
		FacetTypeDecorator tDecor = stateManager.getDecoratorBy(typeID);

		DynamicDecorationManager.refresh(tDecor);

		// FacetType type = FacetManager.getInstance().getTypeByID(facetTypeID);
		// FacetTypeDecorator tDecor =
		// DecorationManager.buildFacetTypeDecorator(type);

		view.setReplaceContext(tDecor);

		// close this view
		Runnable r = new Runnable() {
			public void run() {
				view.getSite().getPage().hideView(view);
			}
		};
		try {
			view.getSite().getShell().getDisplay().asyncExec(r);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
