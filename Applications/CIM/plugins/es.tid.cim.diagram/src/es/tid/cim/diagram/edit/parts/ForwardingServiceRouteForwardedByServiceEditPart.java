package es.tid.cim.diagram.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;

import es.tid.cim.diagram.edit.policies.ForwardingServiceRouteForwardedByServiceItemSemanticEditPolicy;

/**
 * @generated
 */
public class ForwardingServiceRouteForwardedByServiceEditPart extends
		ConnectionNodeEditPart implements ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4062;

	/**
	 * @generated
	 */
	public ForwardingServiceRouteForwardedByServiceEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new ForwardingServiceRouteForwardedByServiceItemSemanticEditPolicy());
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof WrappingLabel156EditPart) {
			((WrappingLabel156EditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureLinkRouteForwardedByServiceNameFigure());
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
		return new LinkRouteForwardedByServiceNameFigure();
	}

	/**
	 * @generated
	 */
	public LinkRouteForwardedByServiceNameFigure getPrimaryShape() {
		return (LinkRouteForwardedByServiceNameFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class LinkRouteForwardedByServiceNameFigure extends
			PolylineConnectionEx {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureLinkRouteForwardedByServiceNameFigure;

		/**
		 * @generated
		 */
		public LinkRouteForwardedByServiceNameFigure() {

			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureLinkRouteForwardedByServiceNameFigure = new WrappingLabel();
			fFigureLinkRouteForwardedByServiceNameFigure
					.setText("< RouteForwardedByService >");

			this.add(fFigureLinkRouteForwardedByServiceNameFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLinkRouteForwardedByServiceNameFigure() {
			return fFigureLinkRouteForwardedByServiceNameFigure;
		}

	}

}
