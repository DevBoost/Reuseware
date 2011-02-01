package es.tid.cim.diagram.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;

import es.tid.cim.diagram.edit.policies.ComputerSystemHostedRoutingPolicyItemSemanticEditPolicy;

/**
 * @generated
 */
public class ComputerSystemHostedRoutingPolicyEditPart extends
		ConnectionNodeEditPart implements ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4054;

	/**
	 * @generated
	 */
	public ComputerSystemHostedRoutingPolicyEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new ComputerSystemHostedRoutingPolicyItemSemanticEditPolicy());
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof WrappingLabel148EditPart) {
			((WrappingLabel148EditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureLinkHostedRoutingPolicyNameFigure());
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
		return new LinkHostedRoutingPolicyNameFigure();
	}

	/**
	 * @generated
	 */
	public LinkHostedRoutingPolicyNameFigure getPrimaryShape() {
		return (LinkHostedRoutingPolicyNameFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class LinkHostedRoutingPolicyNameFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureLinkHostedRoutingPolicyNameFigure;

		/**
		 * @generated
		 */
		public LinkHostedRoutingPolicyNameFigure() {

			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureLinkHostedRoutingPolicyNameFigure = new WrappingLabel();
			fFigureLinkHostedRoutingPolicyNameFigure
					.setText("< HostedRoutingPolicy >");

			this.add(fFigureLinkHostedRoutingPolicyNameFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLinkHostedRoutingPolicyNameFigure() {
			return fFigureLinkHostedRoutingPolicyNameFigure;
		}

	}

}
