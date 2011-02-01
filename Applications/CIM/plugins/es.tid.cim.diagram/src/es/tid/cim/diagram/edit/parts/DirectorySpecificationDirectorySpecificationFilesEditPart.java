package es.tid.cim.diagram.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;

import es.tid.cim.diagram.edit.policies.DirectorySpecificationDirectorySpecificationFilesItemSemanticEditPolicy;

/**
 * @generated
 */
public class DirectorySpecificationDirectorySpecificationFilesEditPart extends
		ConnectionNodeEditPart implements ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4001;

	/**
	 * @generated
	 */
	public DirectorySpecificationDirectorySpecificationFilesEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new DirectorySpecificationDirectorySpecificationFilesItemSemanticEditPolicy());
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof WrappingLabel95EditPart) {
			((WrappingLabel95EditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureLinkDirectorySpecificationFilesNameFigure());
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
		return new LinkDirectorySpecificationFilesNameFigure();
	}

	/**
	 * @generated
	 */
	public LinkDirectorySpecificationFilesNameFigure getPrimaryShape() {
		return (LinkDirectorySpecificationFilesNameFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class LinkDirectorySpecificationFilesNameFigure extends
			PolylineConnectionEx {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureLinkDirectorySpecificationFilesNameFigure;

		/**
		 * @generated
		 */
		public LinkDirectorySpecificationFilesNameFigure() {

			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureLinkDirectorySpecificationFilesNameFigure = new WrappingLabel();
			fFigureLinkDirectorySpecificationFilesNameFigure
					.setText("< DirectorySpecificationFiles >");

			this.add(fFigureLinkDirectorySpecificationFilesNameFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLinkDirectorySpecificationFilesNameFigure() {
			return fFigureLinkDirectorySpecificationFilesNameFigure;
		}

	}

}
