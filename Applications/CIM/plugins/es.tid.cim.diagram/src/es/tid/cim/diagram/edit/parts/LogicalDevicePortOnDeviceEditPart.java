package es.tid.cim.diagram.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;

import es.tid.cim.diagram.edit.policies.LogicalDevicePortOnDeviceItemSemanticEditPolicy;

/**
 * @generated
 */
public class LogicalDevicePortOnDeviceEditPart extends ConnectionNodeEditPart
		implements ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4061;

	/**
	 * @generated
	 */
	public LogicalDevicePortOnDeviceEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new LogicalDevicePortOnDeviceItemSemanticEditPolicy());
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof WrappingLabel155EditPart) {
			((WrappingLabel155EditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureLinkPortOnDeviceNameFigure());
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
		return new LinkPortOnDeviceNameFigure();
	}

	/**
	 * @generated
	 */
	public LinkPortOnDeviceNameFigure getPrimaryShape() {
		return (LinkPortOnDeviceNameFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class LinkPortOnDeviceNameFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureLinkPortOnDeviceNameFigure;

		/**
		 * @generated
		 */
		public LinkPortOnDeviceNameFigure() {

			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureLinkPortOnDeviceNameFigure = new WrappingLabel();
			fFigureLinkPortOnDeviceNameFigure.setText("< PortOnDevice >");

			this.add(fFigureLinkPortOnDeviceNameFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLinkPortOnDeviceNameFigure() {
			return fFigureLinkPortOnDeviceNameFigure;
		}

	}

}
