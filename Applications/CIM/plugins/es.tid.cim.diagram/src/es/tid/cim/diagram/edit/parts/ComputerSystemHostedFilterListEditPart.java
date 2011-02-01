package es.tid.cim.diagram.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;

import es.tid.cim.diagram.edit.policies.ComputerSystemHostedFilterListItemSemanticEditPolicy;

/**
 * @generated
 */
public class ComputerSystemHostedFilterListEditPart extends
		ConnectionNodeEditPart implements ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4051;

	/**
	 * @generated
	 */
	public ComputerSystemHostedFilterListEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new ComputerSystemHostedFilterListItemSemanticEditPolicy());
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof WrappingLabel145EditPart) {
			((WrappingLabel145EditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureLinkHostedFilterListNameFigure());
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
		return new LinkHostedFilterListNameFigure();
	}

	/**
	 * @generated
	 */
	public LinkHostedFilterListNameFigure getPrimaryShape() {
		return (LinkHostedFilterListNameFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class LinkHostedFilterListNameFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureLinkHostedFilterListNameFigure;

		/**
		 * @generated
		 */
		public LinkHostedFilterListNameFigure() {

			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureLinkHostedFilterListNameFigure = new WrappingLabel();
			fFigureLinkHostedFilterListNameFigure
					.setText("< HostedFilterList >");

			this.add(fFigureLinkHostedFilterListNameFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLinkHostedFilterListNameFigure() {
			return fFigureLinkHostedFilterListNameFigure;
		}

	}

}
