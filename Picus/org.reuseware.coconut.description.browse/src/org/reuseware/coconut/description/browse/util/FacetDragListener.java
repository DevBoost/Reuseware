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

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.dnd.DragSourceAdapter;
import org.eclipse.swt.dnd.DragSourceEvent;
import org.reuseware.coconut.description.Facet;
import org.reuseware.coconut.description.FacetTypeDecorator;
import org.reuseware.coconut.description.browse.MainBrowserManager;
import org.reuseware.coconut.description.classify.FacetManager;
import org.reuseware.coconut.repository.ID;

/**
 * 
 * @author Matthias Schmidt
 *
 */
public class FacetDragListener extends DragSourceAdapter {

	private TableViewer viewer;

	public FacetDragListener(TableViewer viewer) {
		this.viewer = viewer;
	}

	@Override
	public void dragSetData(DragSourceEvent event) {
		FacetTypeDecorator tDecor = null;
		Object selected = ((IStructuredSelection) viewer.getSelection()).getFirstElement();
		
		// drag source is a viewer with Facet in it
		if (selected instanceof Facet) {
			Facet facet = (Facet) selected;
			tDecor = DynamicDecorationManager.buildFacetTypeDecorator(facet.getType());
			MainBrowserManager.getInstance().setTransientFacet(facet);
		}

		// drag source is a view with FacetTypeDecorator in it
		if (selected instanceof FacetTypeDecorator)
			tDecor = (FacetTypeDecorator) selected;

		if (tDecor == null)
			event.doit = false;
		else
			event.data = pack(tDecor);
	}

	private String pack(FacetTypeDecorator tDecor) {
		ID id = FacetManager.getTypeID(tDecor.getDecoratee());
		String transferSting = "";

		for (String string : id.getSegments()) {
			transferSting += string + "/";
		}
		transferSting = transferSting.substring(0, transferSting.lastIndexOf('/'));

		return transferSting;
	}

	@Override
	public void dragStart(DragSourceEvent event) {
		event.doit = !viewer.getSelection().isEmpty();
	}

	@Override
	public void dragFinished(DragSourceEvent event) {
		System.err.println("Drag-N-Drop");
	}
}
