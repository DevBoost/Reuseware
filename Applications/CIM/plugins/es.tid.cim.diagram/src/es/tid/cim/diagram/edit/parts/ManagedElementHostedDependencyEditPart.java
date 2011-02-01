package es.tid.cim.diagram.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;

import es.tid.cim.diagram.edit.policies.ManagedElementHostedDependencyItemSemanticEditPolicy;

/**
 * @generated
 */
public class ManagedElementHostedDependencyEditPart extends
		ConnectionNodeEditPart implements ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4022;

	/**
	 * @generated
	 */
	public ManagedElementHostedDependencyEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new ManagedElementHostedDependencyItemSemanticEditPolicy());
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof WrappingLabel116EditPart) {
			((WrappingLabel116EditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureLinkHostedDependenciesNameFigure());
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
		return new LinkHostedDependenciesNameFigure();
	}

	/**
	 * @generated
	 */
	public LinkHostedDependenciesNameFigure getPrimaryShape() {
		return (LinkHostedDependenciesNameFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class LinkHostedDependenciesNameFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureLinkHostedDependenciesNameFigure;

		/**
		 * @generated
		 */
		public LinkHostedDependenciesNameFigure() {

			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureLinkHostedDependenciesNameFigure = new WrappingLabel();
			fFigureLinkHostedDependenciesNameFigure
					.setText("< HostedDependencies >");

			this.add(fFigureLinkHostedDependenciesNameFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLinkHostedDependenciesNameFigure() {
			return fFigureLinkHostedDependenciesNameFigure;
		}

	}

}
