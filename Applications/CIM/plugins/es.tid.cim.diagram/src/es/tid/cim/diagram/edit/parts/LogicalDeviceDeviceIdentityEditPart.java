package es.tid.cim.diagram.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;

import es.tid.cim.diagram.edit.policies.LogicalDeviceDeviceIdentityItemSemanticEditPolicy;

/**
 * @generated
 */
public class LogicalDeviceDeviceIdentityEditPart extends ConnectionNodeEditPart
		implements ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4015;

	/**
	 * @generated
	 */
	public LogicalDeviceDeviceIdentityEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new LogicalDeviceDeviceIdentityItemSemanticEditPolicy());
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof WrappingLabel109EditPart) {
			((WrappingLabel109EditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureLinkDeviceIdentityNameFigure());
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
		return new LinkDeviceIdentityNameFigure();
	}

	/**
	 * @generated
	 */
	public LinkDeviceIdentityNameFigure getPrimaryShape() {
		return (LinkDeviceIdentityNameFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class LinkDeviceIdentityNameFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureLinkDeviceIdentityNameFigure;

		/**
		 * @generated
		 */
		public LinkDeviceIdentityNameFigure() {

			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureLinkDeviceIdentityNameFigure = new WrappingLabel();
			fFigureLinkDeviceIdentityNameFigure.setText("< DeviceIdentity >");

			this.add(fFigureLinkDeviceIdentityNameFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLinkDeviceIdentityNameFigure() {
			return fFigureLinkDeviceIdentityNameFigure;
		}

	}

}
