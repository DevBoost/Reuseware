package es.tid.cim.diagram.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;

import es.tid.cim.diagram.edit.policies.ProductProductProductDependencyItemSemanticEditPolicy;

/**
 * @generated
 */
public class ProductProductProductDependencyEditPart extends
		ConnectionNodeEditPart implements ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4025;

	/**
	 * @generated
	 */
	public ProductProductProductDependencyEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new ProductProductProductDependencyItemSemanticEditPolicy());
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof WrappingLabel119EditPart) {
			((WrappingLabel119EditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureLinkProductProductDependencyNameFigure());
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
		return new LinkProductProductDependencyNameFigure();
	}

	/**
	 * @generated
	 */
	public LinkProductProductDependencyNameFigure getPrimaryShape() {
		return (LinkProductProductDependencyNameFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class LinkProductProductDependencyNameFigure extends
			PolylineConnectionEx {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureLinkProductProductDependencyNameFigure;

		/**
		 * @generated
		 */
		public LinkProductProductDependencyNameFigure() {

			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureLinkProductProductDependencyNameFigure = new WrappingLabel();
			fFigureLinkProductProductDependencyNameFigure
					.setText("< ProductProductDependency >");

			this.add(fFigureLinkProductProductDependencyNameFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLinkProductProductDependencyNameFigure() {
			return fFigureLinkProductProductDependencyNameFigure;
		}

	}

}
