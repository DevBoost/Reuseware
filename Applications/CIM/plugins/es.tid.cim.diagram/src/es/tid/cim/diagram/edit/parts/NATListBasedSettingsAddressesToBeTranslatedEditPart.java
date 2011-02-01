package es.tid.cim.diagram.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;

import es.tid.cim.diagram.edit.policies.NATListBasedSettingsAddressesToBeTranslatedItemSemanticEditPolicy;

/**
 * @generated
 */
public class NATListBasedSettingsAddressesToBeTranslatedEditPart extends
		ConnectionNodeEditPart implements ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4043;

	/**
	 * @generated
	 */
	public NATListBasedSettingsAddressesToBeTranslatedEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new NATListBasedSettingsAddressesToBeTranslatedItemSemanticEditPolicy());
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof WrappingLabel137EditPart) {
			((WrappingLabel137EditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureLinkAddressesToBeTranslatedNameFigure());
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
		return new LinkAddressesToBeTranslatedNameFigure();
	}

	/**
	 * @generated
	 */
	public LinkAddressesToBeTranslatedNameFigure getPrimaryShape() {
		return (LinkAddressesToBeTranslatedNameFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class LinkAddressesToBeTranslatedNameFigure extends
			PolylineConnectionEx {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureLinkAddressesToBeTranslatedNameFigure;

		/**
		 * @generated
		 */
		public LinkAddressesToBeTranslatedNameFigure() {

			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureLinkAddressesToBeTranslatedNameFigure = new WrappingLabel();
			fFigureLinkAddressesToBeTranslatedNameFigure
					.setText("< AddressesToBeTranslated >");

			this.add(fFigureLinkAddressesToBeTranslatedNameFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLinkAddressesToBeTranslatedNameFigure() {
			return fFigureLinkAddressesToBeTranslatedNameFigure;
		}

	}

}
