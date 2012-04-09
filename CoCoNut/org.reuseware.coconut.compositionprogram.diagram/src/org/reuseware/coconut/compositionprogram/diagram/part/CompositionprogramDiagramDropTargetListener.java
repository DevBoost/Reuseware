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
package org.reuseware.coconut.compositionprogram.diagram.part;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.gef.EditPartViewer;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramDropTargetListener;
import org.eclipse.jface.util.LocalSelectionTransfer;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.dnd.Transfer;
import org.reuseware.sokan.ID;
import org.reuseware.sokan.index.util.ResourceUtil;

/**
 * A drop target listener to support drag and drop of files as fragment instantiations
 * into the UCL editor.
 */
public class CompositionprogramDiagramDropTargetListener extends DiagramDropTargetListener {

	/**
     * Constructor taken from superclass.
     * 
	 * @param viewer current viewer
	 */
	public CompositionprogramDiagramDropTargetListener(EditPartViewer viewer) {
		super(viewer);
	}
	
	/**
     * Constructor taken from superclass.
     * 
     * @param viewer current viewer
     * @param xfer current drop transfer
	 */
	public CompositionprogramDiagramDropTargetListener(EditPartViewer viewer, Transfer xfer) {
		super(viewer, xfer);
	}
	@Override
	protected List<?> getObjectsBeingDropped() {
		ISelection selection = ((LocalSelectionTransfer) getTransfer()).getSelection();
		List<List<String>> ufiList = new ArrayList<List<String>>();
		if (selection instanceof StructuredSelection) {
			Iterator<?> selectionIterator = ((StructuredSelection) selection).iterator();
			while (selectionIterator.hasNext()) {
				Object next = selectionIterator.next();
				if (next instanceof IFile) {
					ID id = ResourceUtil.idFrom((IFile) next);
					if (id == null) {
						//try plugin URI
						id = ResourceUtil.idFrom(URI.createPlatformPluginURI(
								((IFile) next).getFullPath().toString(), false));
					} 
					if (id != null) {
						ufiList.add(id.getSegments());
					}

				}
			}
		}
		return ufiList;
	}

}
