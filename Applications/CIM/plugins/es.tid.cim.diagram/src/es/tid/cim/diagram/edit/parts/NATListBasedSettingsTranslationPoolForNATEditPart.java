package es.tid.cim.diagram.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;

import es.tid.cim.diagram.edit.policies.NATListBasedSettingsTranslationPoolForNATItemSemanticEditPolicy;

/**
 * @generated
 */
public class NATListBasedSettingsTranslationPoolForNATEditPart extends
		ConnectionNodeEditPart implements ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4069;

	/**
	 * @generated
	 */
	public NATListBasedSettingsTranslationPoolForNATEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new NATListBasedSettingsTranslationPoolForNATItemSemanticEditPolicy());
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof WrappingLabel163EditPart) {
			((WrappingLabel163EditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureLinkTranslationPoolForNATNameFigure());
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
		return new LinkTranslationPoolForNATNameFigure();
	}

	/**
	 * @generated
	 */
	public LinkTranslationPoolForNATNameFigure getPrimaryShape() {
		return (LinkTranslationPoolForNATNameFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class LinkTranslationPoolForNATNameFigure extends
			PolylineConnectionEx {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureLinkTranslationPoolForNATNameFigure;

		/**
		 * @generated
		 */
		public LinkTranslationPoolForNATNameFigure() {

			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureLinkTranslationPoolForNATNameFigure = new WrappingLabel();
			fFigureLinkTranslationPoolForNATNameFigure
					.setText("< TranslationPoolForNAT >");

			this.add(fFigureLinkTranslationPoolForNATNameFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLinkTranslationPoolForNATNameFigure() {
			return fFigureLinkTranslationPoolForNATNameFigure;
		}

	}

}
