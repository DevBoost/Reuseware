package es.tid.cim.diagram.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;

import es.tid.cim.diagram.edit.policies.QoSServiceQoSConditioningSubServiceItemSemanticEditPolicy;

/**
 * @generated
 */
public class QoSServiceQoSConditioningSubServiceEditPart extends
		ConnectionNodeEditPart implements ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4040;

	/**
	 * @generated
	 */
	public QoSServiceQoSConditioningSubServiceEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new QoSServiceQoSConditioningSubServiceItemSemanticEditPolicy());
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof WrappingLabel134EditPart) {
			((WrappingLabel134EditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureLinkQoSConditioningSubServiceNameFigure());
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
		return new LinkQoSConditioningSubServiceNameFigure();
	}

	/**
	 * @generated
	 */
	public LinkQoSConditioningSubServiceNameFigure getPrimaryShape() {
		return (LinkQoSConditioningSubServiceNameFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class LinkQoSConditioningSubServiceNameFigure extends
			PolylineConnectionEx {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureLinkQoSConditioningSubServiceNameFigure;

		/**
		 * @generated
		 */
		public LinkQoSConditioningSubServiceNameFigure() {

			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureLinkQoSConditioningSubServiceNameFigure = new WrappingLabel();
			fFigureLinkQoSConditioningSubServiceNameFigure
					.setText("< QoSConditioningSubService >");

			this.add(fFigureLinkQoSConditioningSubServiceNameFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLinkQoSConditioningSubServiceNameFigure() {
			return fFigureLinkQoSConditioningSubServiceNameFigure;
		}

	}

}
