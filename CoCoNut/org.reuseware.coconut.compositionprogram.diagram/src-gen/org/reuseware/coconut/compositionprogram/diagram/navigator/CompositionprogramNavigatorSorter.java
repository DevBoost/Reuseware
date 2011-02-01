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
