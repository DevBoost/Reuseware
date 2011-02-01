package es.tid.cim.diagram.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;

import es.tid.cim.diagram.edit.policies.SystemHostedRouteItemSemanticEditPolicy;

/**
 * @generated
 */
public class SystemHostedRouteEditPart extends ConnectionNodeEditPart implements
		ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4053;

	/**
	 * @generated
	 */
	public SystemHostedRouteEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new SystemHostedRouteItemSemanticEditPolicy());
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof WrappingLabel147EditPart) {
			((WrappingLabel147EditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureLinkHostedRouteNameFigure());
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
		return new LinkHostedRouteNameFigure();
	}

	/**
	 * @generated
	 */
	public LinkHostedRouteNameFigure getPrimaryShape() {
		return (LinkHostedRouteNameFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class LinkHostedRouteNameFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureLinkHostedRouteNameFigure;

		/**
		 * @generated
		 */
		public LinkHostedRouteNameFigure() {

			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureLinkHostedRouteNameFigure = new WrappingLabel();
			fFigureLinkHostedRouteNameFigure.setText("< HostedRoute >");

			this.add(fFigureLinkHostedRouteNameFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLinkHostedRouteNameFigure() {
			return fFigureLinkHostedRouteNameFigure;
		}

	}

}
