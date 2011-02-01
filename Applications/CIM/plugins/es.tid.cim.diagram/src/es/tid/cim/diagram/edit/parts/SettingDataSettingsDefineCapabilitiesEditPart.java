package es.tid.cim.diagram.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;

import es.tid.cim.diagram.edit.policies.SettingDataSettingsDefineCapabilitiesItemSemanticEditPolicy;

/**
 * @generated
 */
public class SettingDataSettingsDefineCapabilitiesEditPart extends
		ConnectionNodeEditPart implements ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4034;

	/**
	 * @generated
	 */
	public SettingDataSettingsDefineCapabilitiesEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new SettingDataSettingsDefineCapabilitiesItemSemanticEditPolicy());
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof WrappingLabel128EditPart) {
			((WrappingLabel128EditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureLinkSettingsDefineCapabilitiesNameFigure());
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
		return new LinkSettingsDefineCapabilitiesNameFigure();
	}

	/**
	 * @generated
	 */
	public LinkSettingsDefineCapabilitiesNameFigure getPrimaryShape() {
		return (LinkSettingsDefineCapabilitiesNameFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class LinkSettingsDefineCapabilitiesNameFigure extends
			PolylineConnectionEx {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureLinkSettingsDefineCapabilitiesNameFigure;

		/**
		 * @generated
		 */
		public LinkSettingsDefineCapabilitiesNameFigure() {

			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureLinkSettingsDefineCapabilitiesNameFigure = new WrappingLabel();
			fFigureLinkSettingsDefineCapabilitiesNameFigure
					.setText("< SettingsDefineCapabilities >");

			this.add(fFigureLinkSettingsDefineCapabilitiesNameFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLinkSettingsDefineCapabilitiesNameFigure() {
			return fFigureLinkSettingsDefineCapabilitiesNameFigure;
		}

	}

}
