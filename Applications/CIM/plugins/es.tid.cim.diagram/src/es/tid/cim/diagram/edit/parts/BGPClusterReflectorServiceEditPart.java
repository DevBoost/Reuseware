package es.tid.cim.diagram.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;

import es.tid.cim.diagram.edit.policies.BGPClusterReflectorServiceItemSemanticEditPolicy;

/**
 * @generated
 */
public class BGPClusterReflectorServiceEditPart extends ConnectionNodeEditPart
		implements ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4009;

	/**
	 * @generated
	 */
	public BGPClusterReflectorServiceEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new BGPClusterReflectorServiceItemSemanticEditPolicy());
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof WrappingLabel103EditPart) {
			((WrappingLabel103EditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureLinkReflectorServiceNameFigure());
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
		return new LinkReflectorServiceNameFigure();
	}

	/**
	 * @generated
	 */
	public LinkReflectorServiceNameFigure getPrimaryShape() {
		return (LinkReflectorServiceNameFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class LinkReflectorServiceNameFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureLinkReflectorServiceNameFigure;

		/**
		 * @generated
		 */
		public LinkReflectorServiceNameFigure() {

			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureLinkReflectorServiceNameFigure = new WrappingLabel();
			fFigureLinkReflectorServiceNameFigure
					.setText("< ReflectorService >");

			this.add(fFigureLinkReflectorServiceNameFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLinkReflectorServiceNameFigure() {
			return fFigureLinkReflectorServiceNameFigure;
		}

	}

}
