package es.tid.cim.diagram.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;

import es.tid.cim.diagram.edit.policies.OperatingSystemOperatingSystemSoftwareFeatureItemSemanticEditPolicy;

/**
 * @generated
 */
public class OperatingSystemOperatingSystemSoftwareFeatureEditPart extends
		ConnectionNodeEditPart implements ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4002;

	/**
	 * @generated
	 */
	public OperatingSystemOperatingSystemSoftwareFeatureEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new OperatingSystemOperatingSystemSoftwareFeatureItemSemanticEditPolicy());
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof WrappingLabel96EditPart) {
			((WrappingLabel96EditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureLinkOpperatingSystemSoftwareFeatureNameFigure());
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
		return new LinkOpperatingSystemSoftwareFeatureNameFigure();
	}

	/**
	 * @generated
	 */
	public LinkOpperatingSystemSoftwareFeatureNameFigure getPrimaryShape() {
		return (LinkOpperatingSystemSoftwareFeatureNameFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class LinkOpperatingSystemSoftwareFeatureNameFigure extends
			PolylineConnectionEx {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureLinkOpperatingSystemSoftwareFeatureNameFigure;

		/**
		 * @generated
		 */
		public LinkOpperatingSystemSoftwareFeatureNameFigure() {

			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureLinkOpperatingSystemSoftwareFeatureNameFigure = new WrappingLabel();
			fFigureLinkOpperatingSystemSoftwareFeatureNameFigure
					.setText("< OpperatingSystemSoftwareFeature >");

			this.add(fFigureLinkOpperatingSystemSoftwareFeatureNameFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLinkOpperatingSystemSoftwareFeatureNameFigure() {
			return fFigureLinkOpperatingSystemSoftwareFeatureNameFigure;
		}

	}

}
