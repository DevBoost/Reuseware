package es.tid.cim.diagram.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;

import es.tid.cim.diagram.edit.policies.SystemSystemComponentsItemSemanticEditPolicy;

/**
 * @generated
 */
public class SystemSystemComponentsEditPart extends ConnectionNodeEditPart
		implements ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4036;

	/**
	 * @generated
	 */
	public SystemSystemComponentsEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new SystemSystemComponentsItemSemanticEditPolicy());
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof WrappingLabel130EditPart) {
			((WrappingLabel130EditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureLinkSystemComponentsNameFigure());
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
		return new LinkSystemComponentsNameFigure();
	}

	/**
	 * @generated
	 */
	public LinkSystemComponentsNameFigure getPrimaryShape() {
		return (LinkSystemComponentsNameFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class LinkSystemComponentsNameFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureLinkSystemComponentsNameFigure;

		/**
		 * @generated
		 */
		public LinkSystemComponentsNameFigure() {

			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureLinkSystemComponentsNameFigure = new WrappingLabel();
			fFigureLinkSystemComponentsNameFigure
					.setText("< SystemComponents >");

			this.add(fFigureLinkSystemComponentsNameFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLinkSystemComponentsNameFigure() {
			return fFigureLinkSystemComponentsNameFigure;
		}

	}

}