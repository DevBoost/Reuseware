package es.tid.cim.diagram.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;

import es.tid.cim.diagram.edit.policies.LogicalDeviceDeviceConnectionItemSemanticEditPolicy;

/**
 * @generated
 */
public class LogicalDeviceDeviceConnectionEditPart extends
		ConnectionNodeEditPart implements ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4014;

	/**
	 * @generated
	 */
	public LogicalDeviceDeviceConnectionEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new LogicalDeviceDeviceConnectionItemSemanticEditPolicy());
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof WrappingLabel108EditPart) {
			((WrappingLabel108EditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureLinkDeviceConnectionNameFigure());
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
		return new LinkDeviceConnectionNameFigure();
	}

	/**
	 * @generated
	 */
	public LinkDeviceConnectionNameFigure getPrimaryShape() {
		return (LinkDeviceConnectionNameFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class LinkDeviceConnectionNameFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureLinkDeviceConnectionNameFigure;

		/**
		 * @generated
		 */
		public LinkDeviceConnectionNameFigure() {

			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureLinkDeviceConnectionNameFigure = new WrappingLabel();
			fFigureLinkDeviceConnectionNameFigure
					.setText("< DeviceConnection >");

			this.add(fFigureLinkDeviceConnectionNameFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLinkDeviceConnectionNameFigure() {
			return fFigureLinkDeviceConnectionNameFigure;
		}

	}

}
