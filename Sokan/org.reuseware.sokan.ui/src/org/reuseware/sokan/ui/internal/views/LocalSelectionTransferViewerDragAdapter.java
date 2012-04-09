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
package org.reuseware.sokan.ui.internal.views;

import org.eclipse.jface.util.LocalSelectionTransfer;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.dnd.DragSourceEvent;
import org.eclipse.swt.dnd.DragSourceListener;

/**
 * Drag adapter for dragging artifacts from the repository view.
 */
public class LocalSelectionTransferViewerDragAdapter implements
		DragSourceListener {

	protected Viewer viewer;
	protected ISelection selection;

	/**
	 * Constructs a new LocalSelectionTransferViewerDragAdapter.
	 * 
	 * @param viewer the viewer of the repository view
	 */
	public LocalSelectionTransferViewerDragAdapter(Viewer viewer) {
		super();
		this.viewer = viewer;
	}

	/**
	 * Sets the current selection as drag data.
	 * 
	 * @param event the information associated with the drag set data event
	 */
	public void dragSetData(DragSourceEvent event) {
		if (LocalSelectionTransfer.getTransfer()
				.isSupportedType(event.dataType)) {
			event.data = selection;
			LocalSelectionTransfer.getTransfer().setSelection(selection);
		}
	}

	/**
	 * Clears the current selection.
	 * 
	 * @param event the information associated with the drag finished event
	 */
	public void dragFinished(DragSourceEvent event) {
		selection = null;
		LocalSelectionTransfer.getTransfer().setSelection(null);
	}

	/**
	 * Obtains the current selection from the viewer.
	 * 
	 * @param event the information associated with the drag start event
	 */
	public void dragStart(DragSourceEvent event) {
		selection = viewer.getSelection();
	}
}
