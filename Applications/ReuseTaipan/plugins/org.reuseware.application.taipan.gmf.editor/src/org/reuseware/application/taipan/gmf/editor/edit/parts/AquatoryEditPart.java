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
/*
 * Copyright (c) 2006 Borland Software Corporation
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Dmitry Stadnik (Borland) - initial API and implementation
 */
package org.reuseware.application.taipan.gmf.editor.edit.parts;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.draw2d.BorderLayout;
import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.FreeformLayer;
import org.eclipse.draw2d.FreeformLayeredPane;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.geometry.Insets;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.DiagramDragDropEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.DropObjectsRequest;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.JFaceResources;
import org.reuseware.application.taipan.figures.BottomRightLayout;
import org.reuseware.application.taipan.figures.RoseFigure;
import org.reuseware.application.taipan.gmf.editor.edit.commands.TaiPanCreateShortcutDecorationsCommand;
import org.reuseware.application.taipan.gmf.editor.edit.policies.AquatoryCanonicalEditPolicy;
import org.reuseware.application.taipan.gmf.editor.edit.policies.AquatoryItemSemanticEditPolicy;

/**
 * @generated
 */
public class AquatoryEditPart extends DiagramEditPart {

	/**
	 * @generated
	 */
	public static final String MODEL_ID = "TaiPan"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 1000;

	private IFigure contentPane;

	/**
	 * @generated
	 */
	public AquatoryEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new AquatoryItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE,
				new AquatoryCanonicalEditPolicy());
		installEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE,
				new DiagramDragDropEditPolicy() {
					public Command getDropObjectsCommand(
							DropObjectsRequest dropRequest) {
						List viewDescriptors = new ArrayList();
						for (Iterator it = dropRequest.getObjects().iterator(); it
								.hasNext();) {
							Object nextObject = it.next();
							if (false == nextObject instanceof EObject) {
								continue;
							}
							viewDescriptors
									.add(new CreateViewRequest.ViewDescriptor(
											new EObjectAdapter(
													(EObject) nextObject),
											Node.class, null,
											getDiagramPreferencesHint()));
						}
						return createShortcutsCommand(dropRequest,
								viewDescriptors);
					}

					private Command createShortcutsCommand(
							DropObjectsRequest dropRequest, List viewDescriptors) {
						Command command = createViewsAndArrangeCommand(
								dropRequest, viewDescriptors);
						if (command != null) {
							return command
									.chain(new ICommandProxy(
											new TaiPanCreateShortcutDecorationsCommand(
													getEditingDomain(),
													(View) getModel(),
													viewDescriptors)));
						}
						return null;
					}
				});
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.POPUPBAR_ROLE);
	}

	/**
	 * Replaces default figure with layered pane. Lower layer for decorations, upper is original figure.
	 */
	protected IFigure createFigure() {
		FreeformLayeredPane pane = new FreeformLayeredPane();
		FreeformLayer roseLayer = new FreeformLayer() {

			public Rectangle getFreeformExtent() {
				// Do not count children; they are decorations that should not interfere with diagram contents.
				Insets insets = getInsets();
				return new Rectangle(0, 0, insets.getWidth(), insets
						.getHeight());
			}
		};
		roseLayer.setLayoutManager(new BottomRightLayout());
		roseLayer.setBorder(new MarginBorder(10));
		pane.add(roseLayer);
		roseLayer.add(createRoseFigure());
		pane.add(contentPane = super.createFigure());
		return pane;
	}

	protected IFigure createRoseFigure() {
		IFigure composite = new Figure();
		composite.setLayoutManager(new BorderLayout());
		RoseFigure rose = new RoseFigure();
		rose.setBorder(new MarginBorder(5));
		composite.add(rose, BorderLayout.CENTER);
		composite.add(createRoseLetter("N"), BorderLayout.TOP); //$NON-NLS-1$
		composite.add(createRoseLetter("S"), BorderLayout.BOTTOM); //$NON-NLS-1$
		composite.add(createRoseLetter("W"), BorderLayout.LEFT); //$NON-NLS-1$
		composite.add(createRoseLetter("E"), BorderLayout.RIGHT); //$NON-NLS-1$
		return composite;
	}

	protected Label createRoseLetter(String letter) {
		Label label = new Label(letter);
		label.setFont(JFaceResources.getHeaderFont());
		return label;
	}

	public IFigure getContentPane() {
		return contentPane;
	}
}
