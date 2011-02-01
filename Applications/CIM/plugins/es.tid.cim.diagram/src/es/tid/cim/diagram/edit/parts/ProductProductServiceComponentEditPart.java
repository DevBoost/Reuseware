package es.tid.cim.diagram.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;

import es.tid.cim.diagram.edit.policies.ProductProductServiceComponentItemSemanticEditPolicy;

/**
 * @generated
 */
public class ProductProductServiceComponentEditPart extends
		ConnectionNodeEditPart implements ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4026;

	/**
	 * @generated
	 */
	public ProductProductServiceComponentEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new ProductProductServiceComponentItemSemanticEditPolicy());
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof WrappingLabel120EditPart) {
			((WrappingLabel120EditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureLinkProductServiceComponentNameFigure());
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
		return new LinkProductServiceComponentNameFigure();
	}

	/**
	 * @generated
	 */
	public LinkProductServiceComponentNameFigure getPrimaryShape() {
		return (LinkProductServiceComponentNameFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class LinkProductServiceComponentNameFigure extends
			PolylineConnectionEx {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureLinkProductServiceComponentNameFigure;

		/**
		 * @generated
		 */
		public LinkProductServiceComponentNameFigure() {

			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureLinkProductServiceComponentNameFigure = new WrappingLabel();
			fFigureLinkProductServiceComponentNameFigure
					.setText("< ProductServiceComponent >");

			this.add(fFigureLinkProductServiceComponentNameFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLinkProductServiceComponentNameFigure() {
			return fFigureLinkProductServiceComponentNameFigure;
		}

	}

}
