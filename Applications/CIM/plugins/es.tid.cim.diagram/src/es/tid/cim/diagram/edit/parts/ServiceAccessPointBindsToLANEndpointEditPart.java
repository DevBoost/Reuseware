package es.tid.cim.diagram.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;

import es.tid.cim.diagram.edit.policies.ServiceAccessPointBindsToLANEndpointItemSemanticEditPolicy;

/**
 * @generated
 */
public class ServiceAccessPointBindsToLANEndpointEditPart extends
		ConnectionNodeEditPart implements ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4045;

	/**
	 * @generated
	 */
	public ServiceAccessPointBindsToLANEndpointEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new ServiceAccessPointBindsToLANEndpointItemSemanticEditPolicy());
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof WrappingLabel139EditPart) {
			((WrappingLabel139EditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureLinkBindsToLANEndpointNameFigure());
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
		return new LinkBindsToLANEndpointNameFigure();
	}

	/**
	 * @generated
	 */
	public LinkBindsToLANEndpointNameFigure getPrimaryShape() {
		return (LinkBindsToLANEndpointNameFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class LinkBindsToLANEndpointNameFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureLinkBindsToLANEndpointNameFigure;

		/**
		 * @generated
		 */
		public LinkBindsToLANEndpointNameFigure() {

			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureLinkBindsToLANEndpointNameFigure = new WrappingLabel();
			fFigureLinkBindsToLANEndpointNameFigure
					.setText("< BindsToLANEndpoint >");

			this.add(fFigureLinkBindsToLANEndpointNameFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLinkBindsToLANEndpointNameFigure() {
			return fFigureLinkBindsToLANEndpointNameFigure;
		}

	}

}
