/*******************************************************************************
 * Copyright (c) 2006-2011
 * Software Technology Group, Dresden University of Technology
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0 
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *   Software Technology Group - TU Dresden, Germany 
 *      - initial API and implementation
 ******************************************************************************/
package org.reuseware.coconut.compositionprogram.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;
import org.reuseware.coconut.compositionprogram.diagram.part.CompositionprogramVisualIDRegistry;

/**
 * @generated
 */
public class CompositionprogramNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 4003;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof CompositionprogramNavigatorItem) {
			CompositionprogramNavigatorItem item = (CompositionprogramNavigatorItem) element;
			return CompositionprogramVisualIDRegistry.getVisualID(item
					.getView());
		}
		return GROUP_CATEGORY;
	}

}
