package es.tid.cim.diagram.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;

import es.tid.cim.diagram.edit.policies.ManagedElementDependenciesItemSemanticEditPolicy;

/**
 * @generated
 */
public class ManagedElementDependenciesEditPart extends ConnectionNodeEditPart
		implements ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4013;

	/**
	 * @generated
	 */
	public ManagedElementDependenciesEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new ManagedElementDependenciesItemSemanticEditPolicy());
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof WrappingLabel107EditPart) {
			((WrappingLabel107EditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureLinkDependenciesNameFigure());
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
		return new LinkDependenciesNameFigure();
	}

	/**
	 * @generated
	 */
	public LinkDependenciesNameFigure getPrimaryShape() {
		return (LinkDependenciesNameFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class LinkDependenciesNameFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureLinkDependenciesNameFigure;

		/**
		 * @generated
		 */
		public LinkDependenciesNameFigure() {

			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureLinkDependenciesNameFigure = new WrappingLabel();
			fFigureLinkDependenciesNameFigure.setText("< Dependencies >");

			this.add(fFigureLinkDependenciesNameFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLinkDependenciesNameFigure() {
			return fFigureLinkDependenciesNameFigure;
		}

	}

}
