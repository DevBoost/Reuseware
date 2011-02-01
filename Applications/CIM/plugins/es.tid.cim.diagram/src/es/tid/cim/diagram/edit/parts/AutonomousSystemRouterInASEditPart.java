package es.tid.cim.diagram.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;

import es.tid.cim.diagram.edit.policies.AutonomousSystemRouterInASItemSemanticEditPolicy;

/**
 * @generated
 */
public class AutonomousSystemRouterInASEditPart extends ConnectionNodeEditPart
		implements ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4063;

	/**
	 * @generated
	 */
	public AutonomousSystemRouterInASEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new AutonomousSystemRouterInASItemSemanticEditPolicy());
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof WrappingLabel157EditPart) {
			((WrappingLabel157EditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureLinkRouterInASNameFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected void addChildVisual(EditPart childEditPart, int index) {
		if (addFixedChild(childEditPart)) {
			return;
		}
		super.addChildVisual(childEditPart, -1);
	}

	/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model
	 * so you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated
	 */

	protected Connection createConnectionFigure() {
		return new LinkRouterInASNameFigure();
	}

	/**
	 * @generated
	 */
	public LinkRouterInASNameFigure getPrimaryShape() {
		return (LinkRouterInASNameFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class LinkRouterInASNameFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureLinkRouterInASNameFigure;

		/**
		 * @generated
		 */
		public LinkRouterInASNameFigure() {

			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureLinkRouterInASNameFigure = new WrappingLabel();
			fFigureLinkRouterInASNameFigure.setText("< RouterInAS >");

			this.add(fFigureLinkRouterInASNameFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLinkRouterInASNameFigure() {
			return fFigureLinkRouterInASNameFigure;
		}

	}

}
