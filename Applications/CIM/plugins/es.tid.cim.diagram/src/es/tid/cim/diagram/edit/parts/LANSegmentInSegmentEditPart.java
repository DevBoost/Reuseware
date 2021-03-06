package es.tid.cim.diagram.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;

import es.tid.cim.diagram.edit.policies.LANSegmentInSegmentItemSemanticEditPolicy;

/**
 * @generated
 */
public class LANSegmentInSegmentEditPart extends ConnectionNodeEditPart
		implements ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4057;

	/**
	 * @generated
	 */
	public LANSegmentInSegmentEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new LANSegmentInSegmentItemSemanticEditPolicy());
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof WrappingLabel151EditPart) {
			((WrappingLabel151EditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureLinkInSegmentNameFigure());
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
		return new LinkInSegmentNameFigure();
	}

	/**
	 * @generated
	 */
	public LinkInSegmentNameFigure getPrimaryShape() {
		return (LinkInSegmentNameFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class LinkInSegmentNameFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureLinkInSegmentNameFigure;

		/**
		 * @generated
		 */
		public LinkInSegmentNameFigure() {

			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureLinkInSegmentNameFigure = new WrappingLabel();
			fFigureLinkInSegmentNameFigure.setText("< InSegment >");

			this.add(fFigureLinkInSegmentNameFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLinkInSegmentNameFigure() {
			return fFigureLinkInSegmentNameFigure;
		}

	}

}
