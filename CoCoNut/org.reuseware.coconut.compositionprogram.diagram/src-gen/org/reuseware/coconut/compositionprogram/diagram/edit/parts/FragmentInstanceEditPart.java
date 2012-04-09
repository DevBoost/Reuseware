/*******************************************************************************
 * Copyright (c) 2006-2012
 * Software Technology Group, Dresden University of Technology
 * DevBoost GmbH, Berlin, Amtsgericht Charlottenburg, HRB 140026
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *   Software Technology Group - TU Dresden, Germany;
 *   DevBoost GmbH - Berlin, Germany
 *      - initial API and implementation
 ******************************************************************************/
package org.reuseware.coconut.compositionprogram.diagram.edit.parts;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.RoundedRectangle;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.ui.editparts.AbstractBorderedShapeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IBorderItemEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.BorderItemSelectionEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CreationEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.DragDropEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.figures.BorderItemLocator;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.widgets.Display;
import org.reuseware.coconut.compositionprogram.DerivedCompositionProgram;
import org.reuseware.coconut.compositionprogram.FragmentInstance;
import org.reuseware.coconut.compositionprogram.diagram.edit.parts.syntax.SyntaxManager;
import org.reuseware.coconut.compositionprogram.diagram.edit.policies.FragmentInstanceCanonicalEditPolicy;
import org.reuseware.coconut.compositionprogram.diagram.edit.policies.FragmentInstanceDoubleClickEditPolicy;
import org.reuseware.coconut.compositionprogram.diagram.edit.policies.FragmentInstanceItemSemanticEditPolicy;
import org.reuseware.coconut.compositionprogram.diagram.edit.policies.UFIDragDropEditPolicy;
import org.reuseware.coconut.compositionprogram.diagram.part.CompositionprogramVisualIDRegistry;

/**
 * @generated
 */
public class FragmentInstanceEditPart extends AbstractBorderedShapeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2001;

	/**
	 * @generated
	 */
	protected IFigure contentPane;

	/**
	 * @generated
	 */
	protected IFigure primaryShape;

	/**
	 * @generated
	 */
	public FragmentInstanceEditPart(View view) {
		super(view);
	}

	/**
	 * @generated NOT
	 */
	protected void createDefaultEditPolicies() {
		installEditPolicy(EditPolicyRoles.CREATION_ROLE,
				new CreationEditPolicy());
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new FragmentInstanceItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE,
				new DragDropEditPolicy());
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE,
				new FragmentInstanceCanonicalEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());

		//!BEGIN MODIFICATION
		removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.POPUPBAR_ROLE);
		removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);
		installEditPolicy(EditPolicyRoles.OPEN_ROLE,
				new FragmentInstanceDoubleClickEditPolicy());

		FragmentInstance fragmentInstance = (FragmentInstance) ((Node) getModel())
				.getElement();
		if (fragmentInstance.getCompositionProgram() instanceof DerivedCompositionProgram) {
			removeEditPolicy(EditPolicyRoles.SEMANTIC_ROLE);
			removeEditPolicy(EditPolicyRoles.CREATION_ROLE);
			removeEditPolicy(EditPolicy.COMPONENT_ROLE);
		}
		else {
			installEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE,
					new UFIDragDropEditPolicy());
		}
		//!END MODIFICATION
	}

	/**
	 * @generated
	 */
	protected LayoutEditPolicy createLayoutEditPolicy() {
		org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy lep = new org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy() {

			protected EditPolicy createChildEditPolicy(EditPart child) {
				View childView = (View) child.getModel();
				switch (CompositionprogramVisualIDRegistry
						.getVisualID(childView)) {
				case PortInstanceEditPart.VISUAL_ID:
					return new BorderItemSelectionEditPolicy();
				}
				EditPolicy result = child
						.getEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE);
				if (result == null) {
					result = new NonResizableEditPolicy();
				}
				return result;
			}

			protected Command getMoveChildrenCommand(Request request) {
				return null;
			}

			protected Command getCreateCommand(CreateRequest request) {
				return null;
			}
		};
		return lep;
	}

	/**
	 * @generated
	 */
	protected IFigure createNodeShape() {
		return primaryShape = new FragmentInstanceFigure();
	}

	/**
	 * Modified to allow arbitrary figures.
	 * 
	 * @generated NOT
	 */
	public IFigure getPrimaryShape() {
		//!BEGIN MODIFICATION
		return primaryShape;
		//return (FragmentInstanceFigure) primaryShape;
		//!END MODIFICATION
	}

	/**
	 * Modified to handle custom figures.
	 * 
	 * @generated NOT
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof FragmentInstanceNameEditPart) {
			//!BEGIN MODIFICATION
			if (getPrimaryShape() instanceof FragmentInstanceFigure) {
				((FragmentInstanceNameEditPart) childEditPart)
						.setLabel(((FragmentInstanceFigure) getPrimaryShape())
								.getFigureFragmentInstanceLabelFigure());
			} else {
				((FragmentInstanceNameEditPart) childEditPart)
						.setLabel(fFigureFragmentInstanceLabelFigure);
			}

			/*((FragmentInstanceNameEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureFragmentInstanceLabelFigure());
			return true;*/
			//!END MODIFICATION
		}
		if (childEditPart instanceof PortInstanceEditPart) {
			BorderItemLocator locator = new BorderItemLocator(getMainFigure(),
			//!BEGIN MODIFICATION
			// PositionConstants.NONE);			
					PositionConstants.EAST);
			//!END MODIFICATION
			getBorderedFigure().getBorderItemContainer()
					.add(((PortInstanceEditPart) childEditPart).getFigure(),
							locator);
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof FragmentInstanceNameEditPart) {
			return true;
		}
		if (childEditPart instanceof PortInstanceEditPart) {
			getBorderedFigure().getBorderItemContainer().remove(
					((PortInstanceEditPart) childEditPart).getFigure());
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
	 * @generated
	 */
	protected void removeChildVisual(EditPart childEditPart) {
		if (removeFixedChild(childEditPart)) {
			return;
		}
		super.removeChildVisual(childEditPart);
	}

	/**
	 * @generated
	 */
	protected IFigure getContentPaneFor(IGraphicalEditPart editPart) {
		if (editPart instanceof IBorderItemEditPart) {
			return getBorderedFigure().getBorderItemContainer();
		}
		return getContentPane();
	}

	/**
	 * @generated
	 */
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(50, 80);
		return result;
	}

	/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model
	 * so you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * <p>
	 * 
	 * Modified to consider custom figures defined in a composition program syntax.
	 * 
	 * @generated NOT
	 */
	protected NodeFigure createMainFigure() {
		//!BEGIN MODIFICATION
		NodeFigure customFigure = createCustomFigure();
		if (customFigure != null) {
			return customFigure;
		}
		//!END MODIFICATION

		NodeFigure figure = createNodePlate();
		figure.setLayoutManager(new StackLayout());
		IFigure shape = createNodeShape();

		//!BEGIN MODIFICATION
		setColors(shape);
		//!END MODIFICATION

		figure.add(shape);
		contentPane = setupContentPane(shape);
		figure.repaint();
		return figure;
	}

	/**
	 * Default implementation treats passed figure as content pane.
	 * Respects layout one may have set for generated figure.
	 * @param nodeShape instance of generated figure class
	 * @generated
	 */
	protected IFigure setupContentPane(IFigure nodeShape) {
		if (nodeShape.getLayoutManager() == null) {
			ConstrainedToolbarLayout layout = new ConstrainedToolbarLayout();
			layout.setSpacing(5);
			nodeShape.setLayoutManager(layout);
		}
		return nodeShape; // use nodeShape itself as contentPane
	}

	/**
	 * @generated
	 */
	public IFigure getContentPane() {
		if (contentPane != null) {
			return contentPane;
		}
		return super.getContentPane();
	}

	/**
	 * @generated
	 */
	protected void setForegroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setForegroundColor(color);
		}
	}

	/**
	 * Modified to dynamically modify the bg color
	 * 
	 * @generated NOT
	 */
	protected void setBackgroundColor(Color color) {
		if (primaryShape != null) {
			FragmentInstance fInstance = (FragmentInstance) ((Node) getModel()).getElement();
			if (fInstance.isTarget()) {
				primaryShape.setBackgroundColor(ColorConstants.lightGray);
			} else {
				primaryShape.setBackgroundColor(color);
			}
		}
	}

	/**
	 * @generated
	 */
	protected void setLineWidth(int width) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineWidth(width);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineType(int style) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineStyle(style);
		}
	}

	/**
	 * @generated
	 */
	public EditPart getPrimaryChildEditPart() {
		return getChildBySemanticHint(CompositionprogramVisualIDRegistry
				.getType(FragmentInstanceNameEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public class FragmentInstanceFigure extends RoundedRectangle {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureFragmentInstanceLabelFigure;

		/**
		 * @generated
		 */
		public FragmentInstanceFigure() {
			this.setCornerDimensions(new Dimension(getMapMode().DPtoLP(8),
					getMapMode().DPtoLP(8)));
			this.setLineWidth(3);
			this.setForegroundColor(ColorConstants.black);

			this.setBorder(new MarginBorder(getMapMode().DPtoLP(3),
					getMapMode().DPtoLP(8), getMapMode().DPtoLP(3),
					getMapMode().DPtoLP(8)));
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureFragmentInstanceLabelFigure = new WrappingLabel();
			fFigureFragmentInstanceLabelFigure.setText("");

			fFigureFragmentInstanceLabelFigure
					.setFont(FFIGUREFRAGMENTINSTANCELABELFIGURE_FONT);

			this.add(fFigureFragmentInstanceLabelFigure);

		}

		/**
		 * @generated
		 */
		private boolean myUseLocalCoordinates = false;

		/**
		 * @generated
		 */
		protected boolean useLocalCoordinates() {
			return myUseLocalCoordinates;
		}

		/**
		 * @generated
		 */
		protected void setUseLocalCoordinates(boolean useLocalCoordinates) {
			myUseLocalCoordinates = useLocalCoordinates;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureFragmentInstanceLabelFigure() {
			return fFigureFragmentInstanceLabelFigure;
		}

	}

	/**
	 * @generated
	 */
	static final Font FFIGUREFRAGMENTINSTANCELABELFIGURE_FONT = new Font(
			Display.getCurrent(), Display.getDefault().getSystemFont()
					.getFontData()[0].getName(), 12, SWT.BOLD);

	//!BEGIN MODIFICATION
	private Color bgColor = ColorConstants.white;

	protected NodeFigure createCustomFigure() {
		SyntaxManager sm = SyntaxManager.INSTANCE;
		FragmentInstance fragment = (FragmentInstance) ((Node) getModel())
				.getElement();

		NodeFigure figure;

		figure = sm.createFragmentInstanceFigure(fragment, getMapMode());

		if (figure != null) {
			primaryShape = figure;
			bgColor = ((IFigure) figure.getChildren().get(0))
					.getBackgroundColor();

			createNodeContents();

			if (!figure.getChildren().isEmpty()) {
				contentPane = setupContentPane((IFigure) figure.getChildren()
						.get(0));
			}

			setFigure(figure);

			if (!sm.showFragment(fragment)) {
				figure.setVisible(false);
			}

			updateFace();
		}

		return figure;
	}

	private WrappingLabel fFigureFragmentInstanceLabelFigure;

	private void createNodeContents() {
		if (!primaryShape.getChildren().isEmpty()) {
			fFigureFragmentInstanceLabelFigure = new WrappingLabel();
			fFigureFragmentInstanceLabelFigure.setText("");

			fFigureFragmentInstanceLabelFigure
					.setFont(FFIGUREFRAGMENTINSTANCELABELFIGURE_FONT);

			((IFigure) primaryShape.getChildren().get(0))
					.add(fFigureFragmentInstanceLabelFigure);
		}
	}

	public void updateFace() {
		if (!primaryShape.isVisible()) {
			return;
		}

		if (primaryShape != null) {
			setColors(primaryShape);
		}

		//update port faces
		for (Object child : getChildren()) {
			if (child instanceof PortInstanceEditPart) {
				((PortInstanceEditPart) child).updateFace();
			}

		}
	}

	private void setColors(IFigure shape) {
		setBackgroundColor(bgColor);
		
		FragmentInstance fInstance = (FragmentInstance) ((Node) getModel()).getElement();	
		if (shape instanceof Shape) {
			if (fInstance.isReference()) {
				((Shape) shape).setLineStyle(Graphics.LINE_DASH);
			} else {
				((Shape) shape).setLineStyle(Graphics.LINE_SOLID);
			}
		}

		if (fInstance.getFragment() == null) {
			shape.setForegroundColor(ColorConstants.lightGray);
		} else {
			shape.setForegroundColor(ColorConstants.black);
		}
	}

	protected void handleNotificationEvent(Notification event) {
		if (event.getNotifier() instanceof FragmentInstance) {
			updateFace();
		}
		super.handleNotificationEvent(event);
	}
	//!END MODIFICATION

}
