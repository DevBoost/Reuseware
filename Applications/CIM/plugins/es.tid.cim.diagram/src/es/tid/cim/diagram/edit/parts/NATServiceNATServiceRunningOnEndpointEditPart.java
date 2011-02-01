package es.tid.cim.diagram.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;

import es.tid.cim.diagram.edit.policies.NATServiceNATServiceRunningOnEndpointItemSemanticEditPolicy;

/**
 * @generated
 */
public class NATServiceNATServiceRunningOnEndpointEditPart extends
		ConnectionNodeEditPart implements ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4058;

	/**
	 * @generated
	 */
	public NATServiceNATServiceRunningOnEndpointEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new NATServiceNATServiceRunningOnEndpointItemSemanticEditPolicy());
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof WrappingLabel152EditPart) {
			((WrappingLabel152EditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureLinkNATServiceRunningOnEndpointNameFigure());
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
		return new LinkNATServiceRunningOnEndpointNameFigure();
	}

	/**
	 * @generated
	 */
	public LinkNATServiceRunningOnEndpointNameFigure getPrimaryShape() {
		return (LinkNATServiceRunningOnEndpointNameFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class LinkNATServiceRunningOnEndpointNameFigure extends
			PolylineConnectionEx {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureLinkNATServiceRunningOnEndpointNameFigure;

		/**
		 * @generated
		 */
		public LinkNATServiceRunningOnEndpointNameFigure() {

			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureLinkNATServiceRunningOnEndpointNameFigure = new WrappingLabel();
			fFigureLinkNATServiceRunningOnEndpointNameFigure
					.setText("< NATServiceRunningOnEndpoint >");

			this.add(fFigureLinkNATServiceRunningOnEndpointNameFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLinkNATServiceRunningOnEndpointNameFigure() {
			return fFigureLinkNATServiceRunningOnEndpointNameFigure;
		}

	}

}
