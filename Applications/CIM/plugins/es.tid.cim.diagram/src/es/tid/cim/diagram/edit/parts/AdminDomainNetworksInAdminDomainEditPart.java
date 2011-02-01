package es.tid.cim.diagram.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;

import es.tid.cim.diagram.edit.policies.AdminDomainNetworksInAdminDomainItemSemanticEditPolicy;

/**
 * @generated
 */
public class AdminDomainNetworksInAdminDomainEditPart extends
		ConnectionNodeEditPart implements ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4059;

	/**
	 * @generated
	 */
	public AdminDomainNetworksInAdminDomainEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new AdminDomainNetworksInAdminDomainItemSemanticEditPolicy());
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof WrappingLabel153EditPart) {
			((WrappingLabel153EditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureLinkNetworksInAdminDomainNameFigure());
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
		return new LinkNetworksInAdminDomainNameFigure();
	}

	/**
	 * @generated
	 */
	public LinkNetworksInAdminDomainNameFigure getPrimaryShape() {
		return (LinkNetworksInAdminDomainNameFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class LinkNetworksInAdminDomainNameFigure extends
			PolylineConnectionEx {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureLinkNetworksInAdminDomainNameFigure;

		/**
		 * @generated
		 */
		public LinkNetworksInAdminDomainNameFigure() {

			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureLinkNetworksInAdminDomainNameFigure = new WrappingLabel();
			fFigureLinkNetworksInAdminDomainNameFigure
					.setText("< NetworksInAdminDomain >");

			this.add(fFigureLinkNetworksInAdminDomainNameFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLinkNetworksInAdminDomainNameFigure() {
			return fFigureLinkNetworksInAdminDomainNameFigure;
		}

	}

}
