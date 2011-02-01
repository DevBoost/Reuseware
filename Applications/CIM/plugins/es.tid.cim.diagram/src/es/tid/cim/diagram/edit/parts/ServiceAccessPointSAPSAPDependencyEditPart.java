package es.tid.cim.diagram.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;

import es.tid.cim.diagram.edit.policies.ServiceAccessPointSAPSAPDependencyItemSemanticEditPolicy;

/**
 * @generated
 */
public class ServiceAccessPointSAPSAPDependencyEditPart extends
		ConnectionNodeEditPart implements ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4029;

	/**
	 * @generated
	 */
	public ServiceAccessPointSAPSAPDependencyEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new ServiceAccessPointSAPSAPDependencyItemSemanticEditPolicy());
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof WrappingLabel123EditPart) {
			((WrappingLabel123EditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureLinkSAPSAPDependencyNameFigure());
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
		return new LinkSAPSAPDependencyNameFigure();
	}

	/**
	 * @generated
	 */
	public LinkSAPSAPDependencyNameFigure getPrimaryShape() {
		return (LinkSAPSAPDependencyNameFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class LinkSAPSAPDependencyNameFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureLinkSAPSAPDependencyNameFigure;

		/**
		 * @generated
		 */
		public LinkSAPSAPDependencyNameFigure() {

			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureLinkSAPSAPDependencyNameFigure = new WrappingLabel();
			fFigureLinkSAPSAPDependencyNameFigure
					.setText("< SAPSAPDependency >");

			this.add(fFigureLinkSAPSAPDependencyNameFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLinkSAPSAPDependencyNameFigure() {
			return fFigureLinkSAPSAPDependencyNameFigure;
		}

	}

}
