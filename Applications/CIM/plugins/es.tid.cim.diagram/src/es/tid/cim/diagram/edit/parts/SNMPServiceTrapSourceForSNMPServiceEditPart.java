package es.tid.cim.diagram.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;

import es.tid.cim.diagram.edit.policies.SNMPServiceTrapSourceForSNMPServiceItemSemanticEditPolicy;

/**
 * @generated
 */
public class SNMPServiceTrapSourceForSNMPServiceEditPart extends
		ConnectionNodeEditPart implements ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4070;

	/**
	 * @generated
	 */
	public SNMPServiceTrapSourceForSNMPServiceEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new SNMPServiceTrapSourceForSNMPServiceItemSemanticEditPolicy());
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof WrappingLabel164EditPart) {
			((WrappingLabel164EditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureLinkTrapSourceForSNMPServiceNameFigure());
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
		return new LinkTrapSourceForSNMPServiceNameFigure();
	}

	/**
	 * @generated
	 */
	public LinkTrapSourceForSNMPServiceNameFigure getPrimaryShape() {
		return (LinkTrapSourceForSNMPServiceNameFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class LinkTrapSourceForSNMPServiceNameFigure extends
			PolylineConnectionEx {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureLinkTrapSourceForSNMPServiceNameFigure;

		/**
		 * @generated
		 */
		public LinkTrapSourceForSNMPServiceNameFigure() {

			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureLinkTrapSourceForSNMPServiceNameFigure = new WrappingLabel();
			fFigureLinkTrapSourceForSNMPServiceNameFigure
					.setText("< TrapSourceForSNMPService >");

			this.add(fFigureLinkTrapSourceForSNMPServiceNameFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLinkTrapSourceForSNMPServiceNameFigure() {
			return fFigureLinkTrapSourceForSNMPServiceNameFigure;
		}

	}

}
