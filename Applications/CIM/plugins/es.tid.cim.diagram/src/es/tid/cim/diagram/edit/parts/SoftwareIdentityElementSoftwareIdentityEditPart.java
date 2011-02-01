package es.tid.cim.diagram.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;

import es.tid.cim.diagram.edit.policies.SoftwareIdentityElementSoftwareIdentityItemSemanticEditPolicy;

/**
 * @generated
 */
public class SoftwareIdentityElementSoftwareIdentityEditPart extends
		ConnectionNodeEditPart implements ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4019;

	/**
	 * @generated
	 */
	public SoftwareIdentityElementSoftwareIdentityEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new SoftwareIdentityElementSoftwareIdentityItemSemanticEditPolicy());
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof WrappingLabel113EditPart) {
			((WrappingLabel113EditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureLinkElementSoftwareIdentityNameFigure());
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
		return new LinkElementSoftwareIdentityNameFigure();
	}

	/**
	 * @generated
	 */
	public LinkElementSoftwareIdentityNameFigure getPrimaryShape() {
		return (LinkElementSoftwareIdentityNameFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class LinkElementSoftwareIdentityNameFigure extends
			PolylineConnectionEx {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureLinkElementSoftwareIdentityNameFigure;

		/**
		 * @generated
		 */
		public LinkElementSoftwareIdentityNameFigure() {

			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureLinkElementSoftwareIdentityNameFigure = new WrappingLabel();
			fFigureLinkElementSoftwareIdentityNameFigure
					.setText("< ElementSoftwareIdentity >");

			this.add(fFigureLinkElementSoftwareIdentityNameFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLinkElementSoftwareIdentityNameFigure() {
			return fFigureLinkElementSoftwareIdentityNameFigure;
		}

	}

}
