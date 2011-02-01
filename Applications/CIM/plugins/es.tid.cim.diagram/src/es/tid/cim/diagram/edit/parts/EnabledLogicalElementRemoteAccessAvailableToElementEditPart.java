package es.tid.cim.diagram.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;

import es.tid.cim.diagram.edit.policies.EnabledLogicalElementRemoteAccessAvailableToElementItemSemanticEditPolicy;

/**
 * @generated
 */
public class EnabledLogicalElementRemoteAccessAvailableToElementEditPart extends
		ConnectionNodeEditPart implements ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4027;

	/**
	 * @generated
	 */
	public EnabledLogicalElementRemoteAccessAvailableToElementEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new EnabledLogicalElementRemoteAccessAvailableToElementItemSemanticEditPolicy());
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof WrappingLabel121EditPart) {
			((WrappingLabel121EditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureLinkRemoteAccessAvailableToElementNameFigure());
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
		return new LinkRemoteAccessAvailableToElementNameFigure();
	}

	/**
	 * @generated
	 */
	public LinkRemoteAccessAvailableToElementNameFigure getPrimaryShape() {
		return (LinkRemoteAccessAvailableToElementNameFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class LinkRemoteAccessAvailableToElementNameFigure extends
			PolylineConnectionEx {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureLinkRemoteAccessAvailableToElementNameFigure;

		/**
		 * @generated
		 */
		public LinkRemoteAccessAvailableToElementNameFigure() {

			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureLinkRemoteAccessAvailableToElementNameFigure = new WrappingLabel();
			fFigureLinkRemoteAccessAvailableToElementNameFigure
					.setText("< RemoteAccessAvailableToElement >");

			this.add(fFigureLinkRemoteAccessAvailableToElementNameFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLinkRemoteAccessAvailableToElementNameFigure() {
			return fFigureLinkRemoteAccessAvailableToElementNameFigure;
		}

	}

}
