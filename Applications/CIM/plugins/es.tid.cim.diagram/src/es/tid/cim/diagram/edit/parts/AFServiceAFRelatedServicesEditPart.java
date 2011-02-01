package es.tid.cim.diagram.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;

import es.tid.cim.diagram.edit.policies.AFServiceAFRelatedServicesItemSemanticEditPolicy;

/**
 * @generated
 */
public class AFServiceAFRelatedServicesEditPart extends ConnectionNodeEditPart
		implements ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4039;

	/**
	 * @generated
	 */
	public AFServiceAFRelatedServicesEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new AFServiceAFRelatedServicesItemSemanticEditPolicy());
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof WrappingLabel133EditPart) {
			((WrappingLabel133EditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureLinkAFRelatedServicesNameFigure());
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
		return new LinkAFRelatedServicesNameFigure();
	}

	/**
	 * @generated
	 */
	public LinkAFRelatedServicesNameFigure getPrimaryShape() {
		return (LinkAFRelatedServicesNameFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class LinkAFRelatedServicesNameFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureLinkAFRelatedServicesNameFigure;

		/**
		 * @generated
		 */
		public LinkAFRelatedServicesNameFigure() {

			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureLinkAFRelatedServicesNameFigure = new WrappingLabel();
			fFigureLinkAFRelatedServicesNameFigure
					.setText("< AFRelatedServices >");

			this.add(fFigureLinkAFRelatedServicesNameFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLinkAFRelatedServicesNameFigure() {
			return fFigureLinkAFRelatedServicesNameFigure;
		}

	}

}
