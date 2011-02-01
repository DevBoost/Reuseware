package es.tid.cim.diagram.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;

import es.tid.cim.diagram.edit.policies.LogicalModuleModulePortItemSemanticEditPolicy;

/**
 * @generated
 */
public class LogicalModuleModulePortEditPart extends ConnectionNodeEditPart
		implements ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4038;

	/**
	 * @generated
	 */
	public LogicalModuleModulePortEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new LogicalModuleModulePortItemSemanticEditPolicy());
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof WrappingLabel132EditPart) {
			((WrappingLabel132EditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureLinkModulePortNameFigure());
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
		return new LinkModulePortNameFigure();
	}

	/**
	 * @generated
	 */
	public LinkModulePortNameFigure getPrimaryShape() {
		return (LinkModulePortNameFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class LinkModulePortNameFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureLinkModulePortNameFigure;

		/**
		 * @generated
		 */
		public LinkModulePortNameFigure() {

			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureLinkModulePortNameFigure = new WrappingLabel();
			fFigureLinkModulePortNameFigure.setText("< ModulePort >");

			this.add(fFigureLinkModulePortNameFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLinkModulePortNameFigure() {
			return fFigureLinkModulePortNameFigure;
		}

	}

}
