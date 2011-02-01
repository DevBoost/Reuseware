package es.tid.cim.diagram.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;

import es.tid.cim.diagram.edit.policies.AutonomousSystemRoutingProtocolDomainInASItemSemanticEditPolicy;

/**
 * @generated
 */
public class AutonomousSystemRoutingProtocolDomainInASEditPart extends
		ConnectionNodeEditPart implements ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4066;

	/**
	 * @generated
	 */
	public AutonomousSystemRoutingProtocolDomainInASEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new AutonomousSystemRoutingProtocolDomainInASItemSemanticEditPolicy());
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof WrappingLabel160EditPart) {
			((WrappingLabel160EditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureLinkRoutingProtocolDomainInASNameFigure());
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
		return new LinkRoutingProtocolDomainInASNameFigure();
	}

	/**
	 * @generated
	 */
	public LinkRoutingProtocolDomainInASNameFigure getPrimaryShape() {
		return (LinkRoutingProtocolDomainInASNameFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class LinkRoutingProtocolDomainInASNameFigure extends
			PolylineConnectionEx {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureLinkRoutingProtocolDomainInASNameFigure;

		/**
		 * @generated
		 */
		public LinkRoutingProtocolDomainInASNameFigure() {

			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureLinkRoutingProtocolDomainInASNameFigure = new WrappingLabel();
			fFigureLinkRoutingProtocolDomainInASNameFigure
					.setText("< RoutingProtocolDomainInAS >");

			this.add(fFigureLinkRoutingProtocolDomainInASNameFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLinkRoutingProtocolDomainInASNameFigure() {
			return fFigureLinkRoutingProtocolDomainInASNameFigure;
		}

	}

}
