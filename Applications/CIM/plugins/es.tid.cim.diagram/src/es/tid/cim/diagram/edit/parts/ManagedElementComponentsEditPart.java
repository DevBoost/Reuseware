package es.tid.cim.diagram.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;

import es.tid.cim.diagram.edit.policies.ManagedElementComponentsItemSemanticEditPolicy;

/**
 * @generated
 */
public class ManagedElementComponentsEditPart extends ConnectionNodeEditPart
		implements ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4011;

	/**
	 * @generated
	 */
	public ManagedElementComponentsEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new ManagedElementComponentsItemSemanticEditPolicy());
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof WrappingLabel105EditPart) {
			((WrappingLabel105EditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureLinkComponentsNameFigure());
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
		return new LinkComponentsNameFigure();
	}

	/**
	 * @generated
	 */
	public LinkComponentsNameFigure getPrimaryShape() {
		return (LinkComponentsNameFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class LinkComponentsNameFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureLinkComponentsNameFigure;

		/**
		 * @generated
		 */
		public LinkComponentsNameFigure() {

			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureLinkComponentsNameFigure = new WrappingLabel();
			fFigureLinkComponentsNameFigure.setText("< Components >");

			this.add(fFigureLinkComponentsNameFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLinkComponentsNameFigure() {
			return fFigureLinkComponentsNameFigure;
		}

	}

}
