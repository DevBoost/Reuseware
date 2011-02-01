package es.tid.cim.diagram.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;

import es.tid.cim.diagram.edit.policies.SystemHostedCollectionItemSemanticEditPolicy;

/**
 * @generated
 */
public class SystemHostedCollectionEditPart extends ConnectionNodeEditPart
		implements ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4021;

	/**
	 * @generated
	 */
	public SystemHostedCollectionEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new SystemHostedCollectionItemSemanticEditPolicy());
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof WrappingLabel115EditPart) {
			((WrappingLabel115EditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureLinkHostedCollectionNameFigure());
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
		return new LinkHostedCollectionNameFigure();
	}

	/**
	 * @generated
	 */
	public LinkHostedCollectionNameFigure getPrimaryShape() {
		return (LinkHostedCollectionNameFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class LinkHostedCollectionNameFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureLinkHostedCollectionNameFigure;

		/**
		 * @generated
		 */
		public LinkHostedCollectionNameFigure() {

			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureLinkHostedCollectionNameFigure = new WrappingLabel();
			fFigureLinkHostedCollectionNameFigure
					.setText("< HostedCollection >");

			this.add(fFigureLinkHostedCollectionNameFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLinkHostedCollectionNameFigure() {
			return fFigureLinkHostedCollectionNameFigure;
		}

	}

}
