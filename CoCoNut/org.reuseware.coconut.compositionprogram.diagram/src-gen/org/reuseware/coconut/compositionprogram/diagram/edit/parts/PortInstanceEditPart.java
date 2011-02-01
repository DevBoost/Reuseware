/*******************************************************************************
 * Copyright (c) 2006-2010
 * Software Technology Group, Dresden University of Technology
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Software Technology Group - TU Dresden, Germany
 *      - initial API and implementation
 ******************************************************************************/
package org.reuseware.coconut.compositionprogram.diagram.edit.parts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Ellipse;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.editpolicies.ResizableEditPolicy;
import org.eclipse.gef.handles.MoveHandle;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.ui.editparts.BorderedBorderItemEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IBorderItemEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.BorderItemSelectionEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.figures.BorderItemLocator;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;
import org.reuseware.coconut.compositionprogram.DerivedCompositionProgram;
import org.reuseware.coconut.compositionprogram.FragmentInstance;
import org.reuseware.coconut.compositionprogram.PortInstance;
import org.reuseware.coconut.compositionprogram.diagram.edit.policies.PortInstanceItemSemanticEditPolicy;
import org.reuseware.coconut.compositionprogram.diagram.part.CompositionprogramVisualIDRegistry;
import org.reuseware.coconut.compositionprogram.diagram.providers.CompositionprogramElementTypes;

/**
 * @generated
 */
public class PortInstanceEditPart extends BorderedBorderItemEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 3001;

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
	public PortInstanceEditPart(View view) {
		super(view);
	}

	/**
	 * @generated NOT
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE,
				getPrimaryDragEditPolicy());
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new PortInstanceItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());

		PortInstance portInstance = (PortInstance) ((Node) getModel()).getElement();
		FragmentInstance fragmentInstance = portInstance.getFragmentInstance();
		if (fragmentInstance != null && fragmentInstance.getCompositionProgram() instanceof DerivedCompositionProgram) {
			removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);
			removeEditPolicy(EditPolicyRoles.SEMANTIC_ROLE);
			removeEditPolicy(EditPolicyRoles.CREATION_ROLE);
			removeEditPolicy(EditPolicy.COMPONENT_ROLE);
		}
		if (portInstance.port() != null) {
			removeEditPolicy(EditPolicyRoles.CREATION_ROLE);
			removeEditPolicy(EditPolicy.COMPONENT_ROLE);
		}
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
				case PortInstancePortNameEditPart.VISUAL_ID:
					return new BorderItemSelectionEditPolicy() {

						protected List createSelectionHandles() {
							MoveHandle mh = new MoveHandle(
									(GraphicalEditPart) getHost());
							mh.setBorder(null);
							return Collections.singletonList(mh);
						}
					};
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
		return primaryShape = new PortInstanceFigure();
	}

	/**
	 * @generated
	 */
	public PortInstanceFigure getPrimaryShape() {
		return (PortInstanceFigure) primaryShape;
	}

	/**
	 * Modified to correct item offset
	 * 
	 * @generated NOT
	 */
	protected void addBorderItem(IFigure borderItemContainer,
			IBorderItemEditPart borderItemEditPart) {
		if (borderItemEditPart instanceof PortInstancePortNameEditPart) {
			BorderItemLocator locator = new BorderItemLocator(getMainFigure(),
					PositionConstants.SOUTH);
			//!BEGIN MODIFICATION
			locator.setBorderItemOffset(new Dimension(-4, -4));
			//!END MODIFICATION
			borderItemContainer.add(borderItemEditPart.getFigure(), locator);
		} else {
			super.addBorderItem(borderItemContainer, borderItemEditPart);
		}
	}

	/**
	 * @generated
	 */
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(20, 20);


		result.getBounds().setSize(result.getPreferredSize());
		return result;
	}

	/**
	 * @generated
	 */
	public EditPolicy getPrimaryDragEditPolicy() {
		EditPolicy result = super.getPrimaryDragEditPolicy();
		if (result instanceof ResizableEditPolicy) {
			ResizableEditPolicy ep = (ResizableEditPolicy) result;
			ep.setResizeDirections(PositionConstants.NONE);
		}
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
	 * Modified to support hiding
	 * 
	 * @generated NOT
	 */
	protected NodeFigure createMainFigure() {
		NodeFigure figure = createNodePlate();
		figure.setLayoutManager(new StackLayout());
		IFigure shape = createNodeShape();
		figure.add(shape);
		contentPane = setupContentPane(shape);

		//!BEGIN MODFIFICATION
		updateFace();
		//!END MODIFICATION
		return figure;
	}

	/**
	 * Default implementation treats passed figure as content pane.
	 * Respects layout one may have set for generated figure.
	 * @param nodeShape instance of generated figure class
	 * @generated
	 */
	protected IFigure setupContentPane(IFigure nodeShape) {
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
	 * @generated
	 */
	protected void setBackgroundColor(Color color) {
		if (primaryShape != null) {
			PortInstance port = (PortInstance) ((Node) getModel()).getElement();
			
			if (port.canContribute()) {
				primaryShape.setBackgroundColor(ColorConstants.black);
			} else if (port.canReceive()) {
				primaryShape.setBackgroundColor(color);
			} else /*configuring*/{
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
				.getType(PortInstancePortNameEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSource() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(1);
		types.add(CompositionprogramElementTypes.CompositionLink_4001);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSourceAndTarget(
			IGraphicalEditPart targetEditPart) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof org.reuseware.coconut.compositionprogram.diagram.edit.parts.PortInstanceEditPart) {
			types.add(CompositionprogramElementTypes.CompositionLink_4001);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForTarget(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == CompositionprogramElementTypes.CompositionLink_4001) {
			types.add(CompositionprogramElementTypes.PortInstance_3001);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnTarget() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(1);
		types.add(CompositionprogramElementTypes.CompositionLink_4001);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForSource(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == CompositionprogramElementTypes.CompositionLink_4001) {
			types.add(CompositionprogramElementTypes.PortInstance_3001);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public class PortInstanceFigure extends Ellipse {

		/**
		 * @generated
		 */
		public PortInstanceFigure() {
			this.setLineWidth(3);
			this.setLineStyle(Graphics.LINE_DOT);
			this.setForegroundColor(ColorConstants.black);
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

	}

	//!BEGIN MODIFICATION
	public void updateFace() {
		if (!primaryShape.isVisible()) {
			return;
		}

		PortInstance port = (PortInstance) ((Node) getModel()).getElement();
		
		if (port == null)
			return;

		if (getPrimaryShape() == null)
			return;

		setColors(getPrimaryShape());
	}
	
	private void setColors(IFigure shape) {
		setBackgroundColor(ColorConstants.white);
		
		if (!(shape instanceof PortInstanceFigure)) {
			return;
		}
		PortInstanceFigure figure = (PortInstanceFigure) shape;
		PortInstance port = (PortInstance) ((Node) getModel()).getElement();
		if (port.canContribute()) {
			figure.setForegroundColor(ColorConstants.black);
			figure.setLineStyle(Graphics.LINE_SOLID);
		} else if (port.canReceive()) {
			figure.setForegroundColor(ColorConstants.black);
			figure.setLineStyle(Graphics.LINE_SOLID);
		} else /*configuring*/{
			figure.setForegroundColor(ColorConstants.black);
			figure.setLineStyle(Graphics.LINE_DOT);
		}

		if (port.port() == null) {
			figure.setForegroundColor(ColorConstants.darkGray);
		}
	}

	protected void handleNotificationEvent(Notification event) {
		if (event.getNotifier() instanceof PortInstance) {
			updateFace();
		}
		super.handleNotificationEvent(event);
	}
	//!END MODIFICATION
}
