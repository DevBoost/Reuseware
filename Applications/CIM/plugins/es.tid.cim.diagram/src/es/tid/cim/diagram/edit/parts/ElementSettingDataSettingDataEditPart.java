package es.tid.cim.diagram.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;

import es.tid.cim.diagram.edit.policies.ElementSettingDataSettingDataItemSemanticEditPolicy;

/**
 * @generated
 */
public class ElementSettingDataSettingDataEditPart extends
		ConnectionNodeEditPart implements ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4033;

	/**
	 * @generated
	 */
	public ElementSettingDataSettingDataEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new ElementSettingDataSettingDataItemSemanticEditPolicy());
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof WrappingLabel127EditPart) {
			((WrappingLabel127EditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureLinkSettingDataNameFigure());
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
		return new LinkSettingDataNameFigure();
	}

	/**
	 * @generated
	 */
	public LinkSettingDataNameFigure getPrimaryShape() {
		return (LinkSettingDataNameFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class LinkSettingDataNameFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureLinkSettingDataNameFigure;

		/**
		 * @generated
		 */
		public LinkSettingDataNameFigure() {

			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureLinkSettingDataNameFigure = new WrappingLabel();
			fFigureLinkSettingDataNameFigure.setText("< SettingData >");

			this.add(fFigureLinkSettingDataNameFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLinkSettingDataNameFigure() {
			return fFigureLinkSettingDataNameFigure;
		}

	}

}
