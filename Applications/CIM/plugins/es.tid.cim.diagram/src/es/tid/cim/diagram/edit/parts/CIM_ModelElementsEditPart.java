package es.tid.cim.diagram.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;

import es.tid.cim.diagram.edit.policies.CIM_ModelElementsItemSemanticEditPolicy;

/**
 * @generated
 */
public class CIM_ModelElementsEditPart extends ConnectionNodeEditPart implements
		ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4048;

	/**
	 * @generated
	 */
	public CIM_ModelElementsEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new CIM_ModelElementsItemSemanticEditPolicy());
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof WrappingLabel142EditPart) {
			((WrappingLabel142EditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureLinkElementsNameFigure());
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
		return new LinkElementsNameFigure();
	}

	/**
	 * @generated
	 */
	public LinkElementsNameFigure getPrimaryShape() {
		return (LinkElementsNameFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class LinkElementsNameFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureLinkElementsNameFigure;

		/**
		 * @generated
		 */
		public LinkElementsNameFigure() {

			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureLinkElementsNameFigure = new WrappingLabel();
			fFigureLinkElementsNameFigure.setText("< Elements >");

			this.add(fFigureLinkElementsNameFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLinkElementsNameFigure() {
			return fFigureLinkElementsNameFigure;
		}

	}

}
