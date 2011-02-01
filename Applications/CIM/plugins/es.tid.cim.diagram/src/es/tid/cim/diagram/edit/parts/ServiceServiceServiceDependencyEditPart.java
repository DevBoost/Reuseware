package es.tid.cim.diagram.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;

import es.tid.cim.diagram.edit.policies.ServiceServiceServiceDependencyItemSemanticEditPolicy;

/**
 * @generated
 */
public class ServiceServiceServiceDependencyEditPart extends
		ConnectionNodeEditPart implements ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4032;

	/**
	 * @generated
	 */
	public ServiceServiceServiceDependencyEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new ServiceServiceServiceDependencyItemSemanticEditPolicy());
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof WrappingLabel126EditPart) {
			((WrappingLabel126EditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureLinkServiceServiceDependencyNameFigure());
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
		return new LinkServiceServiceDependencyNameFigure();
	}

	/**
	 * @generated
	 */
	public LinkServiceServiceDependencyNameFigure getPrimaryShape() {
		return (LinkServiceServiceDependencyNameFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class LinkServiceServiceDependencyNameFigure extends
			PolylineConnectionEx {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureLinkServiceServiceDependencyNameFigure;

		/**
		 * @generated
		 */
		public LinkServiceServiceDependencyNameFigure() {

			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureLinkServiceServiceDependencyNameFigure = new WrappingLabel();
			fFigureLinkServiceServiceDependencyNameFigure
					.setText("< ServiceServiceDependency >");

			this.add(fFigureLinkServiceServiceDependencyNameFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLinkServiceServiceDependencyNameFigure() {
			return fFigureLinkServiceServiceDependencyNameFigure;
		}

	}

}
