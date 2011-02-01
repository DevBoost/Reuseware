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
package org.reuseware.coconut.description.browse.views.content;

import java.util.List;

import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.Viewer;
import org.reuseware.coconut.description.FragmentDescription;

public class BrowserContentProvider implements IStructuredContentProvider {

	@SuppressWarnings("unchecked")
	public Object[] getElements(Object inputElement) {
		if (inputElement == null || !(inputElement instanceof List)) {
			List list = (List) inputElement;
			if (list.size() == 0 || !(list.get(0) instanceof FragmentDescription))
				return new FragmentDescription[] {};
		}
		
		return ((List)inputElement).toArray();
	}

	public void dispose() {
	}

	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
	}

}
