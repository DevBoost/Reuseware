package es.tid.cim.diagram.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;

import es.tid.cim.diagram.edit.policies.SystemSystemDevicesItemSemanticEditPolicy;

/**
 * @generated
 */
public class SystemSystemDevicesEditPart extends ConnectionNodeEditPart
		implements ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4037;

	/**
	 * @generated
	 */
	public SystemSystemDevicesEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new SystemSystemDevicesItemSemanticEditPolicy());
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof WrappingLabel131EditPart) {
			((WrappingLabel131EditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureLinkSystemDevicesNameFigure());
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
		return new LinkSystemDevicesNameFigure();
	}

	/**
	 * @generated
	 */
	public LinkSystemDevicesNameFigure getPrimaryShape() {
		return (LinkSystemDevicesNameFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class LinkSystemDevicesNameFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureLinkSystemDevicesNameFigure;

		/**
		 * @generated
		 */
		public LinkSystemDevicesNameFigure() {

			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureLinkSystemDevicesNameFigure = new WrappingLabel();
			fFigureLinkSystemDevicesNameFigure.setText("< SystemDevices >");

			this.add(fFigureLinkSystemDevicesNameFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLinkSystemDevicesNameFigure() {
			return fFigureLinkSystemDevicesNameFigure;
		}

	}

}
