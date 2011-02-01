package org.reuseware.coconut.compositionprogram.diagram.providers;

import org.reuseware.coconut.compositionprogram.diagram.part.CompositionprogramDiagramEditorPlugin;

/**
 * @generated
 */
public class ElementInitializers {

	protected ElementInitializers() {
		// use #getInstance to access cached instance
	}

	/**
	 * @generated
	 */
	public static ElementInitializers getInstance() {
		ElementInitializers cached = CompositionprogramDiagramEditorPlugin
				.getInstance().getElementInitializers();
		if (cached == null) {
			CompositionprogramDiagramEditorPlugin.getInstance()
					.setElementInitializers(cached = new ElementInitializers());
		}
		return cached;
	}
}
