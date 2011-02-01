package es.tid.cim.diagram.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;

import es.tid.cim.diagram.edit.policies.ManagedElementElementSettingDataItemSemanticEditPolicy;

/**
 * @generated
 */
public class ManagedElementElementSettingDataEditPart extends
		ConnectionNodeEditPart implements ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4018;

	/**
	 * @generated
	 */
	public ManagedElementElementSettingDataEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new ManagedElementElementSettingDataItemSemanticEditPolicy());
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof WrappingLabel112EditPart) {
			((WrappingLabel112EditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureLinkElementSettingDataNameFigure());
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
		return new LinkElementSettingDataNameFigure();
	}

	/**
	 * @generated
	 */
	public LinkElementSettingDataNameFigure getPrimaryShape() {
		return (LinkElementSettingDataNameFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class LinkElementSettingDataNameFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureLinkElementSettingDataNameFigure;

		/**
		 * @generated
		 */
		public LinkElementSettingDataNameFigure() {

			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureLinkElementSettingDataNameFigure = new WrappingLabel();
			fFigureLinkElementSettingDataNameFigure
					.setText("< ElementSettingData >");

			this.add(fFigureLinkElementSettingDataNameFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLinkElementSettingDataNameFigure() {
			return fFigureLinkElementSettingDataNameFigure;
		}

	}

}
