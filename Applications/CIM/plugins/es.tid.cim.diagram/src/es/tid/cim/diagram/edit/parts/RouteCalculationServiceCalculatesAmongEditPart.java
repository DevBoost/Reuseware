package es.tid.cim.diagram.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;

import es.tid.cim.diagram.edit.policies.RouteCalculationServiceCalculatesAmongItemSemanticEditPolicy;

/**
 * @generated
 */
public class RouteCalculationServiceCalculatesAmongEditPart extends
		ConnectionNodeEditPart implements ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4046;

	/**
	 * @generated
	 */
	public RouteCalculationServiceCalculatesAmongEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new RouteCalculationServiceCalculatesAmongItemSemanticEditPolicy());
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof WrappingLabel140EditPart) {
			((WrappingLabel140EditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureLinkCalculatesAmongNameFigure());
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
		return new LinkCalculatesAmongNameFigure();
	}

	/**
	 * @generated
	 */
	public LinkCalculatesAmongNameFigure getPrimaryShape() {
		return (LinkCalculatesAmongNameFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class LinkCalculatesAmongNameFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureLinkCalculatesAmongNameFigure;

		/**
		 * @generated
		 */
		public LinkCalculatesAmongNameFigure() {

			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureLinkCalculatesAmongNameFigure = new WrappingLabel();
			fFigureLinkCalculatesAmongNameFigure.setText("< CalculatesAmong >");

			this.add(fFigureLinkCalculatesAmongNameFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLinkCalculatesAmongNameFigure() {
			return fFigureLinkCalculatesAmongNameFigure;
		}

	}

}
