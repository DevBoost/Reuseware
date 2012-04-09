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
package org.reuseware.application.taipan.figures;

import java.util.List;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Rectangle;

/**
 * Layout that places it's children in bottom-right corner of the parent figure.
 * Typically used in containers with one child.
 * 
 * @author dstadnik
 */
public class BottomRightLayout extends StackLayout {

	public void layout(IFigure figure) {
		Rectangle r = figure.getClientArea();
		List<?> children = figure.getChildren();
		IFigure child;
		for (int i = 0; i < children.size(); i++) {
			child = (IFigure) children.get(i);
			Dimension size = child.getPreferredSize();
			int x = r.x + r.width - size.width;
			if (x < r.x) {
				x = r.x;
			}
			int y = r.y + r.height - size.height;
			if (y < r.y) {
				y = r.y;
			}
			child.setBounds(new Rectangle(x, y, size.width, size.height));
		}
	}
}
