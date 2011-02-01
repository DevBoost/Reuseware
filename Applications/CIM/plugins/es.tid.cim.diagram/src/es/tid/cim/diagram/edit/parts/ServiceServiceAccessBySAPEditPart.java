package es.tid.cim.diagram.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;

import es.tid.cim.diagram.edit.policies.ServiceServiceAccessBySAPItemSemanticEditPolicy;

/**
 * @generated
 */
public class ServiceServiceAccessBySAPEditPart extends ConnectionNodeEditPart
		implements ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4030;

	/**
	 * @generated
	 */
	public ServiceServiceAccessBySAPEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new ServiceServiceAccessBySAPItemSemanticEditPolicy());
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof WrappingLabel124EditPart) {
			((WrappingLabel124EditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureLinkServiceAccessBySAPNameFigure());
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
		return new LinkServiceAccessBySAPNameFigure();
	}

	/**
	 * @generated
	 */
	public LinkServiceAccessBySAPNameFigure getPrimaryShape() {
		return (LinkServiceAccessBySAPNameFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class LinkServiceAccessBySAPNameFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureLinkServiceAccessBySAPNameFigure;

		/**
		 * @generated
		 */
		public LinkServiceAccessBySAPNameFigure() {

			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureLinkServiceAccessBySAPNameFigure = new WrappingLabel();
			fFigureLinkServiceAccessBySAPNameFigure
					.setText("< ServiceAccessBySAP >");

			this.add(fFigureLinkServiceAccessBySAPNameFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLinkServiceAccessBySAPNameFigure() {
			return fFigureLinkServiceAccessBySAPNameFigure;
		}

	}

}
