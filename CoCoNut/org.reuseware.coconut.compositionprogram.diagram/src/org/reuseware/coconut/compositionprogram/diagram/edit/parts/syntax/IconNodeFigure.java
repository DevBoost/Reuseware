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
package org.reuseware.coconut.compositionprogram.diagram.edit.parts.syntax;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.FlowLayout;
import org.eclipse.draw2d.RectangleFigure;

/**
 * A basic figure for a node that is used to represent a fragment instances
 * and which is overlayed with an additional icon.
 */
public class IconNodeFigure extends RectangleFigure {

	/**
	 * The figure constructor.
	 */
	public IconNodeFigure() {

		FlowLayout layoutThis = new FlowLayout();
		layoutThis.setStretchMinorAxis(false);
		layoutThis.setMinorAlignment(FlowLayout.ALIGN_LEFTTOP);
		layoutThis.setMajorAlignment(FlowLayout.ALIGN_CENTER);
		layoutThis.setMajorSpacing(5);
		layoutThis.setMinorSpacing(5);
		layoutThis.setHorizontal(true);

		this.setLayoutManager(layoutThis);

		this.setForegroundColor(ColorConstants.black);
		this.setOutline(true);
		this.setLineWidth(1);
	}
}
