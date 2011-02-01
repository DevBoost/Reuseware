package es.tid.cim.diagram.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;

import es.tid.cim.diagram.edit.policies.QoSServiceQoSSubServiceItemSemanticEditPolicy;

/**
 * @generated
 */
public class QoSServiceQoSSubServiceEditPart extends ConnectionNodeEditPart
		implements ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4041;

	/**
	 * @generated
	 */
	public QoSServiceQoSSubServiceEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new QoSServiceQoSSubServiceItemSemanticEditPolicy());
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof WrappingLabel135EditPart) {
			((WrappingLabel135EditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureLinkQoSSubServiceNameFigure());
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
		return new LinkQoSSubServiceNameFigure();
	}

	/**
	 * @generated
	 */
	public LinkQoSSubServiceNameFigure getPrimaryShape() {
		return (LinkQoSSubServiceNameFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class LinkQoSSubServiceNameFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureLinkQoSSubServiceNameFigure;

		/**
		 * @generated
		 */
		public LinkQoSSubServiceNameFigure() {

			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureLinkQoSSubServiceNameFigure = new WrappingLabel();
			fFigureLinkQoSSubServiceNameFigure.setText("< QoSSubService >");

			this.add(fFigureLinkQoSSubServiceNameFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLinkQoSSubServiceNameFigure() {
			return fFigureLinkQoSSubServiceNameFigure;
		}

	}

}
