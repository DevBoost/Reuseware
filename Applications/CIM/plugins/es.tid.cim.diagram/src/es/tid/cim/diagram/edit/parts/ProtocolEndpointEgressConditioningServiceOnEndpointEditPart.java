package es.tid.cim.diagram.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;

import es.tid.cim.diagram.edit.policies.ProtocolEndpointEgressConditioningServiceOnEndpointItemSemanticEditPolicy;

/**
 * @generated
 */
public class ProtocolEndpointEgressConditioningServiceOnEndpointEditPart extends
		ConnectionNodeEditPart implements ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4047;

	/**
	 * @generated
	 */
	public ProtocolEndpointEgressConditioningServiceOnEndpointEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new ProtocolEndpointEgressConditioningServiceOnEndpointItemSemanticEditPolicy());
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof WrappingLabel141EditPart) {
			((WrappingLabel141EditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureLinkEgressConditioningServiceOnEndpointNameFigure());
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
		return new LinkEgressConditioningServiceOnEndpointNameFigure();
	}

	/**
	 * @generated
	 */
	public LinkEgressConditioningServiceOnEndpointNameFigure getPrimaryShape() {
		return (LinkEgressConditioningServiceOnEndpointNameFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class LinkEgressConditioningServiceOnEndpointNameFigure extends
			PolylineConnectionEx {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureLinkEgressConditioningServiceOnEndpointNameFigure;

		/**
		 * @generated
		 */
		public LinkEgressConditioningServiceOnEndpointNameFigure() {

			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureLinkEgressConditioningServiceOnEndpointNameFigure = new WrappingLabel();
			fFigureLinkEgressConditioningServiceOnEndpointNameFigure
					.setText("< EgressConditioningServiceOnEndpoint >");

			this.add(fFigureLinkEgressConditioningServiceOnEndpointNameFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLinkEgressConditioningServiceOnEndpointNameFigure() {
			return fFigureLinkEgressConditioningServiceOnEndpointNameFigure;
		}

	}

}
