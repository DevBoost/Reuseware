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
package org.reuseware.coconut.ui.internal.actions;

import java.net.URL;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.jface.resource.ImageDescriptor;
import org.reuseware.coconut.resource.sokan.IndexConstants;
import org.reuseware.coconut.ui.CoCoNutUIPlugin;
import org.reuseware.coconut.ui.views.FragmentRepositoryView;
import org.reuseware.sokan.Constraint;
import org.reuseware.sokan.FacetedRequest;
import org.reuseware.sokan.ID;
import org.reuseware.sokan.IndexRow;
import org.reuseware.sokan.index.util.FacetUtil;
import org.reuseware.sokan.index.util.IndexUtil;
import org.reuseware.sokan.index.util.ResourceUtil;

/**
 * Action that opens the composition program responsible for composing
 * the selected composed fragment.
 */
public class OpenCompositionProgramAction extends FragmentRepositoryAction {

	private static ImageDescriptor composeImage;
	
	static {
		URL url = null;
		url = CoCoNutUIPlugin.getDefault().getBundle().getResource(
				"icons/Compose.gif");
		composeImage = ImageDescriptor.createFromURL(url);
	}
	
	/**
	 * Constructs a new action for the given fragment repository view.
	 * 
	 * @param view the fragment repository view
	 */
	public OpenCompositionProgramAction(FragmentRepositoryView view) {
		super(view);
		this.setText("Open Composition Program");
		this.setToolTipText("Open Composition Program");
		this.setImageDescriptor(composeImage);
		this.setEnabled(false);
	}
	
	@Override
	public void run() {
		for (EObject element : getFragmentRepositoryView().getSelectedElements()) {
			IndexRow cpRow = getComposingCompositionProgramRow(element);
			ResourceSet rs = getFragmentRepositoryView().getResourceSet();
			Resource cpResource = rs.getResource(URI.createURI(cpRow.getPhyURI()), true);
			IFile file = WorkspaceSynchronizer.getFile(cpResource); 
			openEditor(file);
		}
	}
	
	/**
	 * Finds the index row representing the composition program that
	 * composed the fragment to which the given element belongs.
	 * 
	 * @param element an element inside a composed fragment
	 * @return index row representing composition program 
	 */
	public IndexRow getComposingCompositionProgramRow(EObject element) {
		URI uri = getFragmentRepositoryView().getURIForElement(element);
		ID id = ResourceUtil.idFrom(uri);
		if (id == null) {
			return null;
		}
		
		List<Constraint> constraints = FacetUtil.buildConstraints(
				IndexConstants.COLUMN_COMPOSED_FRAGMENT,
				ResourceUtil.idString(id));
		FacetedRequest request  = FacetUtil.buildFacetedRequest(constraints);
		List<IndexRow> response = IndexUtil.INSTANCE.getIndex(request);
		
		if (response.isEmpty()) {
			return null;
		}
		
		return response.get(0);
	}

}
