package es.tid.cim.diagram.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;

import es.tid.cim.diagram.edit.policies.BGPServiceBGPPeerGroupServicesItemSemanticEditPolicy;

/**
 * @generated
 */
public class BGPServiceBGPPeerGroupServicesEditPart extends
		ConnectionNodeEditPart implements ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4006;

	/**
	 * @generated
	 */
	public BGPServiceBGPPeerGroupServicesEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new BGPServiceBGPPeerGroupServicesItemSemanticEditPolicy());
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof WrappingLabel100EditPart) {
			((WrappingLabel100EditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureLinkBGPPeerGroupServicesNameFigure());
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
		return new LinkBGPPeerGroupServicesNameFigure();
	}

	/**
	 * @generated
	 */
	public LinkBGPPeerGroupServicesNameFigure getPrimaryShape() {
		return (LinkBGPPeerGroupServicesNameFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class LinkBGPPeerGroupServicesNameFigure extends
			PolylineConnectionEx {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureLinkBGPPeerGroupServicesNameFigure;

		/**
		 * @generated
		 */
		public LinkBGPPeerGroupServicesNameFigure() {

			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureLinkBGPPeerGroupServicesNameFigure = new WrappingLabel();
			fFigureLinkBGPPeerGroupServicesNameFigure
					.setText("< BGPPeerGroupServices >");

			this.add(fFigureLinkBGPPeerGroupServicesNameFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLinkBGPPeerGroupServicesNameFigure() {
			return fFigureLinkBGPPeerGroupServicesNameFigure;
		}

	}

}
