package es.tid.cim.diagram.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;

import es.tid.cim.diagram.edit.policies.ServiceAccessPointBindsToItemSemanticEditPolicy;

/**
 * @generated
 */
public class ServiceAccessPointBindsToEditPart extends ConnectionNodeEditPart
		implements ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4010;

	/**
	 * @generated
	 */
	public ServiceAccessPointBindsToEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new ServiceAccessPointBindsToItemSemanticEditPolicy());
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof WrappingLabel104EditPart) {
			((WrappingLabel104EditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureLinkBindsToNameFigure());
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
		return new LinkBindsToNameFigure();
	}

	/**
	 * @generated
	 */
	public LinkBindsToNameFigure getPrimaryShape() {
		return (LinkBindsToNameFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class LinkBindsToNameFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureLinkBindsToNameFigure;

		/**
		 * @generated
		 */
		public LinkBindsToNameFigure() {

			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureLinkBindsToNameFigure = new WrappingLabel();
			fFigureLinkBindsToNameFigure.setText("< BindsTo >");

			this.add(fFigureLinkBindsToNameFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLinkBindsToNameFigure() {
			return fFigureLinkBindsToNameFigure;
		}

	}

}
