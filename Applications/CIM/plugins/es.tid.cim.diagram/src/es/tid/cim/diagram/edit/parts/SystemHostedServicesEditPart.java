package es.tid.cim.diagram.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;

import es.tid.cim.diagram.edit.policies.SystemHostedServicesItemSemanticEditPolicy;

/**
 * @generated
 */
public class SystemHostedServicesEditPart extends ConnectionNodeEditPart
		implements ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4023;

	/**
	 * @generated
	 */
	public SystemHostedServicesEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new SystemHostedServicesItemSemanticEditPolicy());
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof WrappingLabel117EditPart) {
			((WrappingLabel117EditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureLinkHostedServicesNameFigure());
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
		return new LinkHostedServicesNameFigure();
	}

	/**
	 * @generated
	 */
	public LinkHostedServicesNameFigure getPrimaryShape() {
		return (LinkHostedServicesNameFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class LinkHostedServicesNameFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureLinkHostedServicesNameFigure;

		/**
		 * @generated
		 */
		public LinkHostedServicesNameFigure() {

			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureLinkHostedServicesNameFigure = new WrappingLabel();
			fFigureLinkHostedServicesNameFigure.setText("< HostedServices >");

			this.add(fFigureLinkHostedServicesNameFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLinkHostedServicesNameFigure() {
			return fFigureLinkHostedServicesNameFigure;
		}

	}

}
