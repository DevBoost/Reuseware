package es.tid.cim.diagram.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;

import es.tid.cim.diagram.edit.policies.LogicalDeviceDeviceSAPImplementationItemSemanticEditPolicy;

/**
 * @generated
 */
public class LogicalDeviceDeviceSAPImplementationEditPart extends
		ConnectionNodeEditPart implements ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4016;

	/**
	 * @generated
	 */
	public LogicalDeviceDeviceSAPImplementationEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new LogicalDeviceDeviceSAPImplementationItemSemanticEditPolicy());
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof WrappingLabel110EditPart) {
			((WrappingLabel110EditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureLinkDevicesSAPImplementationNameFigure());
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
		return new LinkDevicesSAPImplementationNameFigure();
	}

	/**
	 * @generated
	 */
	public LinkDevicesSAPImplementationNameFigure getPrimaryShape() {
		return (LinkDevicesSAPImplementationNameFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class LinkDevicesSAPImplementationNameFigure extends
			PolylineConnectionEx {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureLinkDevicesSAPImplementationNameFigure;

		/**
		 * @generated
		 */
		public LinkDevicesSAPImplementationNameFigure() {

			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureLinkDevicesSAPImplementationNameFigure = new WrappingLabel();
			fFigureLinkDevicesSAPImplementationNameFigure
					.setText("< DevicesSAPImplementation >");

			this.add(fFigureLinkDevicesSAPImplementationNameFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLinkDevicesSAPImplementationNameFigure() {
			return fFigureLinkDevicesSAPImplementationNameFigure;
		}

	}

}
