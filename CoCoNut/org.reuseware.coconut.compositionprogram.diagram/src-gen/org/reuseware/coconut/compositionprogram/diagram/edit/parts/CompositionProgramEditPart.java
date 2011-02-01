package org.reuseware.coconut.compositionprogram.diagram.edit.parts;

import java.util.Collections;
import java.util.List;

import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.handles.MoveHandle;
import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.reuseware.coconut.compositionprogram.CompositionProgram;
import org.reuseware.coconut.compositionprogram.DerivedCompositionProgram;
import org.reuseware.coconut.compositionprogram.diagram.edit.policies.CompositionProgramCanonicalEditPolicy;
import org.reuseware.coconut.compositionprogram.diagram.edit.policies.CompositionProgramItemSemanticEditPolicy;
import org.reuseware.coconut.compositionprogram.diagram.edit.policies.UFIDragDropEditPolicy;

/**
 * @generated
 */
public class CompositionProgramEditPart extends DiagramEditPart {

	/**
	 * @generated
	 */
	public final static String MODEL_ID = "Compositionprogram"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 1000;

	/**
	 * @generated
	 */
	public CompositionProgramEditPart(View view) {
		super(view);
	}

	/**
	 * @generated NOT
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new CompositionProgramItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE,
				new CompositionProgramCanonicalEditPolicy());
		// !BEGIN MODIFICATION	
		removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.POPUPBAR_ROLE);
		installEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE,
				new UFIDragDropEditPolicy());	
		CompositionProgram compositionProgram = (CompositionProgram) ((Diagram)getModel()).getElement();
		if (compositionProgram instanceof DerivedCompositionProgram) {
			removeEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE);
		}
		// !END MODIFICATION
	}

	/**
	 * @generated
	 */
	/* package-local */static class NodeLabelDragPolicy extends
			NonResizableEditPolicy {

		/**
		 * @generated
		 */
		@SuppressWarnings("rawtypes")
		protected List createSelectionHandles() {
			MoveHandle h = new MoveHandle((GraphicalEditPart) getHost());
			h.setBorder(null);
			return Collections.singletonList(h);
		}

		/**
		 * @generated
		 */
		public Command getCommand(Request request) {
			return null;
		}

		/**
		 * @generated
		 */
		public boolean understandsRequest(Request request) {
			return false;
		}
	}

}
