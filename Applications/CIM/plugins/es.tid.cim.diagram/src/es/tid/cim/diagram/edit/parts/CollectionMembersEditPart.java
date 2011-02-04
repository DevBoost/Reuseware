package es.tid.cim.diagram.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;

import es.tid.cim.diagram.edit.policies.CollectionMembersItemSemanticEditPolicy;

/**
 * @generated
 */
public class CollectionMembersEditPart extends ConnectionNodeEditPart implements
		ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4042;

	/**
	 * @generated
	 */
	public CollectionMembersEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new CollectionMembersItemSemanticEditPolicy());
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof WrappingLabel136EditPart) {
			((WrappingLabel136EditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureLinkMembersNameFigure());
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
		return new LinkMembersNameFigure();
	}

	/**
	 * @generated
	 */
	public LinkMembersNameFigure getPrimaryShape() {
		return (LinkMembersNameFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class LinkMembersNameFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureLinkMembersNameFigure;

		/**
		 * @generated
		 */
		public LinkMembersNameFigure() {

			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureLinkMembersNameFigure = new WrappingLabel();
			fFigureLinkMembersNameFigure.setText("< Members >");

			this.add(fFigureLinkMembersNameFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLinkMembersNameFigure() {
			return fFigureLinkMembersNameFigure;
		}

	}

}