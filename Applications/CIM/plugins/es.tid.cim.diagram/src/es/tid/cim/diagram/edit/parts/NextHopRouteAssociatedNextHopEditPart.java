package es.tid.cim.diagram.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;

import es.tid.cim.diagram.edit.policies.NextHopRouteAssociatedNextHopItemSemanticEditPolicy;

/**
 * @generated
 */
public class NextHopRouteAssociatedNextHopEditPart extends
		ConnectionNodeEditPart implements ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4071;

	/**
	 * @generated
	 */
	public NextHopRouteAssociatedNextHopEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new NextHopRouteAssociatedNextHopItemSemanticEditPolicy());
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof WrappingLabel165EditPart) {
			((WrappingLabel165EditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureLinkAssociatedNextHopNameFigure());
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
		return new LinkAssociatedNextHopNameFigure();
	}

	/**
	 * @generated
	 */
	public LinkAssociatedNextHopNameFigure getPrimaryShape() {
		return (LinkAssociatedNextHopNameFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class LinkAssociatedNextHopNameFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureLinkAssociatedNextHopNameFigure;

		/**
		 * @generated
		 */
		public LinkAssociatedNextHopNameFigure() {

			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureLinkAssociatedNextHopNameFigure = new WrappingLabel();
			fFigureLinkAssociatedNextHopNameFigure
					.setText("< AssociatedNextHop >");

			this.add(fFigureLinkAssociatedNextHopNameFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLinkAssociatedNextHopNameFigure() {
			return fFigureLinkAssociatedNextHopNameFigure;
		}

	}

}
