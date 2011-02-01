package es.tid.cim.diagram.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;

import es.tid.cim.diagram.edit.policies.ComputerSystemHostedForwardingServicesItemSemanticEditPolicy;

/**
 * @generated
 */
public class ComputerSystemHostedForwardingServicesEditPart extends
		ConnectionNodeEditPart implements ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4052;

	/**
	 * @generated
	 */
	public ComputerSystemHostedForwardingServicesEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new ComputerSystemHostedForwardingServicesItemSemanticEditPolicy());
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof WrappingLabel146EditPart) {
			((WrappingLabel146EditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureLinkHostedForwardingServicesNameFigure());
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
		return new LinkHostedForwardingServicesNameFigure();
	}

	/**
	 * @generated
	 */
	public LinkHostedForwardingServicesNameFigure getPrimaryShape() {
		return (LinkHostedForwardingServicesNameFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class LinkHostedForwardingServicesNameFigure extends
			PolylineConnectionEx {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureLinkHostedForwardingServicesNameFigure;

		/**
		 * @generated
		 */
		public LinkHostedForwardingServicesNameFigure() {

			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureLinkHostedForwardingServicesNameFigure = new WrappingLabel();
			fFigureLinkHostedForwardingServicesNameFigure
					.setText("< HostedForwardingServices >");

			this.add(fFigureLinkHostedForwardingServicesNameFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLinkHostedForwardingServicesNameFigure() {
			return fFigureLinkHostedForwardingServicesNameFigure;
		}

	}

}
