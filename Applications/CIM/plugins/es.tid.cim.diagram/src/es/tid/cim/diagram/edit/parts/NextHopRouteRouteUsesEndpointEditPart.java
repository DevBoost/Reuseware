package es.tid.cim.diagram.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;

import es.tid.cim.diagram.edit.policies.NextHopRouteRouteUsesEndpointItemSemanticEditPolicy;

/**
 * @generated
 */
public class NextHopRouteRouteUsesEndpointEditPart extends
		ConnectionNodeEditPart implements ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4065;

	/**
	 * @generated
	 */
	public NextHopRouteRouteUsesEndpointEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new NextHopRouteRouteUsesEndpointItemSemanticEditPolicy());
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof WrappingLabel159EditPart) {
			((WrappingLabel159EditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureLinkRouteUsesEndpointNameFigure());
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
		return new LinkRouteUsesEndpointNameFigure();
	}

	/**
	 * @generated
	 */
	public LinkRouteUsesEndpointNameFigure getPrimaryShape() {
		return (LinkRouteUsesEndpointNameFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class LinkRouteUsesEndpointNameFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureLinkRouteUsesEndpointNameFigure;

		/**
		 * @generated
		 */
		public LinkRouteUsesEndpointNameFigure() {

			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureLinkRouteUsesEndpointNameFigure = new WrappingLabel();
			fFigureLinkRouteUsesEndpointNameFigure
					.setText("< RouteUsesEndpoint >");

			this.add(fFigureLinkRouteUsesEndpointNameFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLinkRouteUsesEndpointNameFigure() {
			return fFigureLinkRouteUsesEndpointNameFigure;
		}

	}

}
