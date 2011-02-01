package es.tid.cim.diagram.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;

import es.tid.cim.diagram.edit.policies.SoftwareElementSoftwareElementChecksItemSemanticEditPolicy;

/**
 * @generated
 */
public class SoftwareElementSoftwareElementChecksEditPart extends
		ConnectionNodeEditPart implements ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4004;

	/**
	 * @generated
	 */
	public SoftwareElementSoftwareElementChecksEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new SoftwareElementSoftwareElementChecksItemSemanticEditPolicy());
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof WrappingLabel98EditPart) {
			((WrappingLabel98EditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureLinkSoftwareElementChecksNameFigure());
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
		return new LinkSoftwareElementChecksNameFigure();
	}

	/**
	 * @generated
	 */
	public LinkSoftwareElementChecksNameFigure getPrimaryShape() {
		return (LinkSoftwareElementChecksNameFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class LinkSoftwareElementChecksNameFigure extends
			PolylineConnectionEx {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureLinkSoftwareElementChecksNameFigure;

		/**
		 * @generated
		 */
		public LinkSoftwareElementChecksNameFigure() {

			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureLinkSoftwareElementChecksNameFigure = new WrappingLabel();
			fFigureLinkSoftwareElementChecksNameFigure
					.setText("< SoftwareElementChecks >");

			this.add(fFigureLinkSoftwareElementChecksNameFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLinkSoftwareElementChecksNameFigure() {
			return fFigureLinkSoftwareElementChecksNameFigure;
		}

	}

}
