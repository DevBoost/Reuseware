package org.reuseware.coconut.compositionprogram.diagram.providers;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.notation.View;
import org.reuseware.coconut.compositionprogram.diagram.edit.parts.CompositionProgramEditPart;
import org.reuseware.coconut.compositionprogram.diagram.part.CompositionprogramDiagramEditorPlugin;
import org.reuseware.coconut.compositionprogram.diagram.part.CompositionprogramVisualIDRegistry;

/**
 * @generated
 */
public class CompositionprogramValidationProvider {

	/**
	 * @generated
	 */
	private static boolean constraintsActive = false;

	/**
	 * @generated
	 */
	public static boolean shouldConstraintsBePrivate() {
		return false;
	}

	/**
	 * @generated
	 */
	public static void runWithConstraints(
			TransactionalEditingDomain editingDomain, Runnable operation) {
		final Runnable op = operation;
		Runnable task = new Runnable() {
			public void run() {
				try {
					constraintsActive = true;
					op.run();
				} finally {
					constraintsActive = false;
				}
			}
		};
		if (editingDomain != null) {
			try {
				editingDomain.runExclusive(task);
			} catch (Exception e) {
				CompositionprogramDiagramEditorPlugin.getInstance().logError(
						"Validation failed", e); //$NON-NLS-1$
			}
		} else {
			task.run();
		}
	}

	/**
	 * @generated
	 */
	static boolean isInDefaultEditorContext(Object object) {
		if (shouldConstraintsBePrivate() && !constraintsActive) {
			return false;
		}
		if (object instanceof View) {
			return constraintsActive
					&& CompositionProgramEditPart.MODEL_ID
							.equals(CompositionprogramVisualIDRegistry
									.getModelID((View) object));
		}
		return true;
	}

}
