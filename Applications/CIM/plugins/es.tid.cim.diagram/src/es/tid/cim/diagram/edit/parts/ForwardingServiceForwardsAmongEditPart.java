package es.tid.cim.diagram.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;

import es.tid.cim.diagram.edit.policies.ForwardingServiceForwardsAmongItemSemanticEditPolicy;

/**
 * @generated
 */
public class ForwardingServiceForwardsAmongEditPart extends
		ConnectionNodeEditPart implements ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4050;

	/**
	 * @generated
	 */
	public ForwardingServiceForwardsAmongEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new ForwardingServiceForwardsAmongItemSemanticEditPolicy());
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof WrappingLabel144EditPart) {
			((WrappingLabel144EditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureLinkForwardsAmongNameFigure());
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
		return new LinkForwardsAmongNameFigure();
	}

	/**
	 * @generated
	 */
	public LinkForwardsAmongNameFigure getPrimaryShape() {
		return (LinkForwardsAmongNameFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class LinkForwardsAmongNameFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureLinkForwardsAmongNameFigure;

		/**
		 * @generated
		 */
		public LinkForwardsAmongNameFigure() {

			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureLinkForwardsAmongNameFigure = new WrappingLabel();
			fFigureLinkForwardsAmongNameFigure.setText("< ForwardsAmong >");

			this.add(fFigureLinkForwardsAmongNameFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLinkForwardsAmongNameFigure() {
			return fFigureLinkForwardsAmongNameFigure;
		}

	}

}
