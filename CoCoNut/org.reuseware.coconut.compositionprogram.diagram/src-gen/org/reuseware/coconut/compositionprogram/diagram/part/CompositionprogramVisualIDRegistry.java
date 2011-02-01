package org.reuseware.coconut.compositionprogram.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.reuseware.coconut.compositionprogram.CompositionLink;
import org.reuseware.coconut.compositionprogram.CompositionProgram;
import org.reuseware.coconut.compositionprogram.CompositionprogramPackage;
import org.reuseware.coconut.compositionprogram.FragmentInstance;
import org.reuseware.coconut.compositionprogram.PortInstance;
import org.reuseware.coconut.compositionprogram.diagram.edit.parts.CompositionLinkEditPart;
import org.reuseware.coconut.compositionprogram.diagram.edit.parts.CompositionProgramEditPart;
import org.reuseware.coconut.compositionprogram.diagram.edit.parts.FragmentInstanceEditPart;
import org.reuseware.coconut.compositionprogram.diagram.edit.parts.FragmentInstanceNameEditPart;
import org.reuseware.coconut.compositionprogram.diagram.edit.parts.PortInstanceEditPart;
import org.reuseware.coconut.compositionprogram.diagram.edit.parts.PortInstancePortNameEditPart;
import org.reuseware.coconut.compositionprogram.diagram.edit.parts.syntax.SyntaxManager;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class CompositionprogramVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "org.reuseware.coconut.compositionprogram.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (CompositionProgramEditPart.MODEL_ID.equals(view.getType())) {
				return CompositionProgramEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return org.reuseware.coconut.compositionprogram.diagram.part.CompositionprogramVisualIDRegistry
				.getVisualID(view.getType());
	}

	/**
	 * @generated
	 */
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	 * @generated
	 */
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(
					Platform.getDebugOption(DEBUG_KEY))) {
				CompositionprogramDiagramEditorPlugin.getInstance().logError(
						"Unable to parse view type as a visualID number: "
								+ type);
			}
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	 * @generated
	 */
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (CompositionprogramPackage.eINSTANCE.getCompositionProgram()
				.isSuperTypeOf(domainElement.eClass())
				&& isDiagram((CompositionProgram) domainElement)) {
			return CompositionProgramEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * Modified to hide certain elements. Probably not the best place...
	 * 
	 * @generated NOT
	 */
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = org.reuseware.coconut.compositionprogram.diagram.part.CompositionprogramVisualIDRegistry
				.getModelID(containerView);
		if (!CompositionProgramEditPart.MODEL_ID.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (CompositionProgramEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = org.reuseware.coconut.compositionprogram.diagram.part.CompositionprogramVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = CompositionProgramEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case FragmentInstanceEditPart.VISUAL_ID:
			if (CompositionprogramPackage.eINSTANCE.getPortInstance()
					.isSuperTypeOf(domainElement.eClass())) {

				//!BEGIN MODFIFICATION
				PortInstance port = (PortInstance) domainElement;
				if (!SyntaxManager.INSTANCE.showPort(port)
						|| !SyntaxManager.INSTANCE.showFragment(port
								.getFragmentInstance())) {
					return -1;
				}
				//!END MODFIFICATION

				return PortInstanceEditPart.VISUAL_ID;
			}
			break;
		case CompositionProgramEditPart.VISUAL_ID:
			if (CompositionprogramPackage.eINSTANCE.getFragmentInstance()
					.isSuperTypeOf(domainElement.eClass())) {

				//!BEGIN MODFIFICATION
				if (!SyntaxManager.INSTANCE
						.showFragment((FragmentInstance) domainElement)) {
					return -1;
				}
				//!END MODFIFICATION

				return FragmentInstanceEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = org.reuseware.coconut.compositionprogram.diagram.part.CompositionprogramVisualIDRegistry
				.getModelID(containerView);
		if (!CompositionProgramEditPart.MODEL_ID.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (CompositionProgramEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = org.reuseware.coconut.compositionprogram.diagram.part.CompositionprogramVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = CompositionProgramEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case CompositionProgramEditPart.VISUAL_ID:
			if (FragmentInstanceEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case FragmentInstanceEditPart.VISUAL_ID:
			if (FragmentInstanceNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PortInstanceEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PortInstanceEditPart.VISUAL_ID:
			if (PortInstancePortNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	 * Modified to hide certain elements. Probably not the best place...
	 * 
	 * @generated NOT
	 */
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (CompositionprogramPackage.eINSTANCE.getCompositionLink()
				.isSuperTypeOf(domainElement.eClass())) {

			//!BEGIN MODFIFICATION
			CompositionLink link = (CompositionLink) domainElement;
			if (!SyntaxManager.INSTANCE.showPort(link.getSource())
					|| !SyntaxManager.INSTANCE.showPort(link.getTarget())
					|| !SyntaxManager.INSTANCE.showFragment(link.getSource()
							.getFragmentInstance())
					|| !SyntaxManager.INSTANCE.showFragment(link.getTarget()
							.getFragmentInstance())) {
				return -1;
			}
			//!END MODFIFICATION

			return CompositionLinkEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(CompositionProgram element) {
		return true;
	}

}
