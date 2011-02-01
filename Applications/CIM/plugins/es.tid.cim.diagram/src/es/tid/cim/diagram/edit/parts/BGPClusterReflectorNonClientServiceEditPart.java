package es.tid.cim.diagram.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;

import es.tid.cim.diagram.edit.policies.BGPClusterReflectorNonClientServiceItemSemanticEditPolicy;

/**
 * @generated
 */
public class BGPClusterReflectorNonClientServiceEditPart extends
		ConnectionNodeEditPart implements ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4008;

	/**
	 * @generated
	 */
	public BGPClusterReflectorNonClientServiceEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new BGPClusterReflectorNonClientServiceItemSemanticEditPolicy());
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof WrappingLabel102EditPart) {
			((WrappingLabel102EditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureLinkReflectorNonClientServiceNameFigure());
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
		return new LinkReflectorNonClientServiceNameFigure();
	}

	/**
	 * @generated
	 */
	public LinkReflectorNonClientServiceNameFigure getPrimaryShape() {
		return (LinkReflectorNonClientServiceNameFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class LinkReflectorNonClientServiceNameFigure extends
			PolylineConnectionEx {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureLinkReflectorNonClientServiceNameFigure;

		/**
		 * @generated
		 */
		public LinkReflectorNonClientServiceNameFigure() {

			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureLinkReflectorNonClientServiceNameFigure = new WrappingLabel();
			fFigureLinkReflectorNonClientServiceNameFigure
					.setText("< ReflectorNonClientService >");

			this.add(fFigureLinkReflectorNonClientServiceNameFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLinkReflectorNonClientServiceNameFigure() {
			return fFigureLinkReflectorNonClientServiceNameFigure;
		}

	}

}
