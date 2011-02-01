package es.tid.cim.diagram.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;

import es.tid.cim.diagram.edit.policies.ElementSoftwareIdentityManagedElementItemSemanticEditPolicy;

/**
 * @generated
 */
public class ElementSoftwareIdentityManagedElementEditPart extends
		ConnectionNodeEditPart implements ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4024;

	/**
	 * @generated
	 */
	public ElementSoftwareIdentityManagedElementEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new ElementSoftwareIdentityManagedElementItemSemanticEditPolicy());
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof WrappingLabel118EditPart) {
			((WrappingLabel118EditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureLinkManagedElementNameFigure());
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
		return new LinkManagedElementNameFigure();
	}

	/**
	 * @generated
	 */
	public LinkManagedElementNameFigure getPrimaryShape() {
		return (LinkManagedElementNameFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class LinkManagedElementNameFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureLinkManagedElementNameFigure;

		/**
		 * @generated
		 */
		public LinkManagedElementNameFigure() {

			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureLinkManagedElementNameFigure = new WrappingLabel();
			fFigureLinkManagedElementNameFigure.setText("< ManagedElement >");

			this.add(fFigureLinkManagedElementNameFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLinkManagedElementNameFigure() {
			return fFigureLinkManagedElementNameFigure;
		}

	}

}
