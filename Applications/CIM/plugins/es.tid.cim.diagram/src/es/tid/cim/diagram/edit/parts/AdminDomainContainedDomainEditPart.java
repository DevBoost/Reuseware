package es.tid.cim.diagram.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;

import es.tid.cim.diagram.edit.policies.AdminDomainContainedDomainItemSemanticEditPolicy;

/**
 * @generated
 */
public class AdminDomainContainedDomainEditPart extends ConnectionNodeEditPart
		implements ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4012;

	/**
	 * @generated
	 */
	public AdminDomainContainedDomainEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new AdminDomainContainedDomainItemSemanticEditPolicy());
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof WrappingLabel106EditPart) {
			((WrappingLabel106EditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureLinkContainedDomainNameFigure());
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
		return new LinkContainedDomainNameFigure();
	}

	/**
	 * @generated
	 */
	public LinkContainedDomainNameFigure getPrimaryShape() {
		return (LinkContainedDomainNameFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class LinkContainedDomainNameFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureLinkContainedDomainNameFigure;

		/**
		 * @generated
		 */
		public LinkContainedDomainNameFigure() {

			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureLinkContainedDomainNameFigure = new WrappingLabel();
			fFigureLinkContainedDomainNameFigure.setText("< ContainedDomain >");

			this.add(fFigureLinkContainedDomainNameFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLinkContainedDomainNameFigure() {
			return fFigureLinkContainedDomainNameFigure;
		}

	}

}
