package es.tid.cim.diagram.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;

import es.tid.cim.diagram.edit.policies.ForwardingServiceForwardedRoutesItemSemanticEditPolicy;

/**
 * @generated
 */
public class ForwardingServiceForwardedRoutesEditPart extends
		ConnectionNodeEditPart implements ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4049;

	/**
	 * @generated
	 */
	public ForwardingServiceForwardedRoutesEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new ForwardingServiceForwardedRoutesItemSemanticEditPolicy());
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof WrappingLabel143EditPart) {
			((WrappingLabel143EditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureLinkForwardedRoutesNameFigure());
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
		return new LinkForwardedRoutesNameFigure();
	}

	/**
	 * @generated
	 */
	public LinkForwardedRoutesNameFigure getPrimaryShape() {
		return (LinkForwardedRoutesNameFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class LinkForwardedRoutesNameFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureLinkForwardedRoutesNameFigure;

		/**
		 * @generated
		 */
		public LinkForwardedRoutesNameFigure() {

			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureLinkForwardedRoutesNameFigure = new WrappingLabel();
			fFigureLinkForwardedRoutesNameFigure.setText("< ForwardedRoutes >");

			this.add(fFigureLinkForwardedRoutesNameFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLinkForwardedRoutesNameFigure() {
			return fFigureLinkForwardedRoutesNameFigure;
		}

	}

}
