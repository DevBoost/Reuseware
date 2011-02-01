package es.tid.cim.diagram.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;

import es.tid.cim.diagram.edit.policies.BGPClusterRoutersInBGPClusterItemSemanticEditPolicy;

/**
 * @generated
 */
public class BGPClusterRoutersInBGPClusterEditPart extends
		ConnectionNodeEditPart implements ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4064;

	/**
	 * @generated
	 */
	public BGPClusterRoutersInBGPClusterEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new BGPClusterRoutersInBGPClusterItemSemanticEditPolicy());
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof WrappingLabel158EditPart) {
			((WrappingLabel158EditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureLinkRoutersInBGPClusterNameFigure());
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
		return new LinkRoutersInBGPClusterNameFigure();
	}

	/**
	 * @generated
	 */
	public LinkRoutersInBGPClusterNameFigure getPrimaryShape() {
		return (LinkRoutersInBGPClusterNameFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class LinkRoutersInBGPClusterNameFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureLinkRoutersInBGPClusterNameFigure;

		/**
		 * @generated
		 */
		public LinkRoutersInBGPClusterNameFigure() {

			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureLinkRoutersInBGPClusterNameFigure = new WrappingLabel();
			fFigureLinkRoutersInBGPClusterNameFigure
					.setText("< RoutersInBGPCluster >");

			this.add(fFigureLinkRoutersInBGPClusterNameFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLinkRoutersInBGPClusterNameFigure() {
			return fFigureLinkRoutersInBGPClusterNameFigure;
		}

	}

}
