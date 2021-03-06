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
import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.PolylineDecoration;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.notation.View;
import org.reuseware.coconut.compositionprogram.CompositionLink;
import org.reuseware.coconut.compositionprogram.diagram.edit.policies.CompositionLinkItemSemanticEditPolicy;
import org.reuseware.coconut.fracol.CompositionAssociation;
import org.reuseware.coconut.fracol.Contribution;

/**
 * @generated
 */
public class CompositionLinkEditPart extends ConnectionNodeEditPart implements
		ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4001;

	/**
	 * @generated
	 */
	public CompositionLinkEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new CompositionLinkItemSemanticEditPolicy());
	}

	/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model
	 * so you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * <p>
	 * 
	 * Modified to create markers.
	 * 
	 * @generated NOT
	 */

	protected Connection createConnectionFigure() {
		//!BEGIN MODIFICATION
		LinkFigure linkFigure = new LinkFigure();
		updateFace(linkFigure);
		return linkFigure;
		//return new LinkFigure();
		//!END MODIFICATION
	}

	/**
	 * @generated
	 */
	public LinkFigure getPrimaryShape() {
		return (LinkFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class LinkFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		public LinkFigure() {
			this.setLineWidth(2);
			this.setForegroundColor(ColorConstants.black);

		}

	}

	//!BEGIN MODIFICATION
	@Override
	public void notifyChanged(Notification notification) {
		if (notification.getNotifier() instanceof CompositionLink) {
			updateFace((PolylineConnectionEx) figure);
		}
	}

	private PolylineDecoration contributingLinkArrow = null;

	public void updateFace(PolylineConnectionEx figure) {
		CompositionLink link = (CompositionLink) ((View) getModel())
				.getElement();

		if (link == null) {
			return;
		}

		CompositionAssociation compAssoc = link.compositionAssociation();
		if (figure != null) {
			figure.setTargetDecoration(null);
		}

		if (compAssoc instanceof Contribution) {
			if (figure != null) {
				if (contributingLinkArrow == null) {
					contributingLinkArrow = new PolylineDecoration();
					contributingLinkArrow.setLineWidth(3);
				}
				contributingLinkArrow.setForegroundColor(ColorConstants.black);
				figure.setTargetDecoration(contributingLinkArrow);
			}
		}

	}
	//!END MODIFICATION
}
