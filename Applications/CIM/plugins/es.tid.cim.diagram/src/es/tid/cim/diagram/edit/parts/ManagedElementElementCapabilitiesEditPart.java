package es.tid.cim.diagram.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;

import es.tid.cim.diagram.edit.policies.ManagedElementElementCapabilitiesItemSemanticEditPolicy;

/**
 * @generated
 */
public class ManagedElementElementCapabilitiesEditPart extends
		ConnectionNodeEditPart implements ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4017;

	/**
	 * @generated
	 */
	public ManagedElementElementCapabilitiesEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new ManagedElementElementCapabilitiesItemSemanticEditPolicy());
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof WrappingLabel111EditPart) {
			((WrappingLabel111EditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureLinkElementCapabilitiesNameFigure());
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
		return new LinkElementCapabilitiesNameFigure();
	}

	/**
	 * @generated
	 */
	public LinkElementCapabilitiesNameFigure getPrimaryShape() {
		return (LinkElementCapabilitiesNameFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class LinkElementCapabilitiesNameFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureLinkElementCapabilitiesNameFigure;

		/**
		 * @generated
		 */
		public LinkElementCapabilitiesNameFigure() {

			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureLinkElementCapabilitiesNameFigure = new WrappingLabel();
			fFigureLinkElementCapabilitiesNameFigure
					.setText("< ElementCapabilities >");

			this.add(fFigureLinkElementCapabilitiesNameFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLinkElementCapabilitiesNameFigure() {
			return fFigureLinkElementCapabilitiesNameFigure;
		}

	}

}
