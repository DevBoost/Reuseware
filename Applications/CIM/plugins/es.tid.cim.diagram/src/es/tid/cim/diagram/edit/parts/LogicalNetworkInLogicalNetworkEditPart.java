package es.tid.cim.diagram.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;

import es.tid.cim.diagram.edit.policies.LogicalNetworkInLogicalNetworkItemSemanticEditPolicy;

/**
 * @generated
 */
public class LogicalNetworkInLogicalNetworkEditPart extends
		ConnectionNodeEditPart implements ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4056;

	/**
	 * @generated
	 */
	public LogicalNetworkInLogicalNetworkEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new LogicalNetworkInLogicalNetworkItemSemanticEditPolicy());
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof WrappingLabel150EditPart) {
			((WrappingLabel150EditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureLinkInLogicalNetworkNameFigure());
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
		return new LinkInLogicalNetworkNameFigure();
	}

	/**
	 * @generated
	 */
	public LinkInLogicalNetworkNameFigure getPrimaryShape() {
		return (LinkInLogicalNetworkNameFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class LinkInLogicalNetworkNameFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureLinkInLogicalNetworkNameFigure;

		/**
		 * @generated
		 */
		public LinkInLogicalNetworkNameFigure() {

			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureLinkInLogicalNetworkNameFigure = new WrappingLabel();
			fFigureLinkInLogicalNetworkNameFigure
					.setText("< InLogicalNetwork >");

			this.add(fFigureLinkInLogicalNetworkNameFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLinkInLogicalNetworkNameFigure() {
			return fFigureLinkInLogicalNetworkNameFigure;
		}

	}

}
