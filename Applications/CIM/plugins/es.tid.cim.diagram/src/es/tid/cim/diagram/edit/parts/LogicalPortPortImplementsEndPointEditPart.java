package es.tid.cim.diagram.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;

import es.tid.cim.diagram.edit.policies.LogicalPortPortImplementsEndPointItemSemanticEditPolicy;

/**
 * @generated
 */
public class LogicalPortPortImplementsEndPointEditPart extends
		ConnectionNodeEditPart implements ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4060;

	/**
	 * @generated
	 */
	public LogicalPortPortImplementsEndPointEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new LogicalPortPortImplementsEndPointItemSemanticEditPolicy());
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof WrappingLabel154EditPart) {
			((WrappingLabel154EditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureLinkPortImplementsEndPointNameFigure());
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
		return new LinkPortImplementsEndPointNameFigure();
	}

	/**
	 * @generated
	 */
	public LinkPortImplementsEndPointNameFigure getPrimaryShape() {
		return (LinkPortImplementsEndPointNameFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class LinkPortImplementsEndPointNameFigure extends
			PolylineConnectionEx {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureLinkPortImplementsEndPointNameFigure;

		/**
		 * @generated
		 */
		public LinkPortImplementsEndPointNameFigure() {

			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureLinkPortImplementsEndPointNameFigure = new WrappingLabel();
			fFigureLinkPortImplementsEndPointNameFigure
					.setText("< PortImplementsEndPoint >");

			this.add(fFigureLinkPortImplementsEndPointNameFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLinkPortImplementsEndPointNameFigure() {
			return fFigureLinkPortImplementsEndPointNameFigure;
		}

	}

}
