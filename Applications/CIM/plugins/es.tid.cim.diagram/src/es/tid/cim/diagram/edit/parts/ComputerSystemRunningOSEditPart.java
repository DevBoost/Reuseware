package es.tid.cim.diagram.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;

import es.tid.cim.diagram.edit.policies.ComputerSystemRunningOSItemSemanticEditPolicy;

/**
 * @generated
 */
public class ComputerSystemRunningOSEditPart extends ConnectionNodeEditPart
		implements ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4067;

	/**
	 * @generated
	 */
	public ComputerSystemRunningOSEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new ComputerSystemRunningOSItemSemanticEditPolicy());
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof WrappingLabel161EditPart) {
			((WrappingLabel161EditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureLinkRunningOSNameFigure());
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
		return new LinkRunningOSNameFigure();
	}

	/**
	 * @generated
	 */
	public LinkRunningOSNameFigure getPrimaryShape() {
		return (LinkRunningOSNameFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class LinkRunningOSNameFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureLinkRunningOSNameFigure;

		/**
		 * @generated
		 */
		public LinkRunningOSNameFigure() {

			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureLinkRunningOSNameFigure = new WrappingLabel();
			fFigureLinkRunningOSNameFigure.setText("< RunningOS >");

			this.add(fFigureLinkRunningOSNameFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLinkRunningOSNameFigure() {
			return fFigureLinkRunningOSNameFigure;
		}

	}

}
