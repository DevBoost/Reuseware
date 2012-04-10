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
 * @(#)HorizontalLayouter.java  2.2  2008-05-28
 *
 * Copyright (c) 1996-2008 by the original authors of JHotDraw
 * and all its contributors.
 * All rights reserved.
 *
 * The copyright of this software is owned by the authors and  
 * contributors of the JHotDraw project ("the copyright holders").  
 * You may not use, copy or modify this software, except in  
 * accordance with the license agreement you entered into with  
 * the copyright holders. For details see accompanying license terms. 
 */
package org.jhotdraw.draw;

import org.jhotdraw.util.*;
import java.awt.*;
import java.awt.geom.*;
import java.util.*;
import org.jhotdraw.geom.*;
import static org.jhotdraw.draw.AttributeKeys.*;

/**
 * A layouter which lays out all children of a CompositeFigure in vertical
 * direction. The preferredSize of the figures is used to determine the layout.
 * This may cause some figures to resize.
 * <p>
 * The HorizontalLayouter honors the LAYOUT_INSETS and the COMPOSITE_ALIGNMENT
 * AttributeKey when laying out a CompositeFigure.
 * <p>
 * If COMPOSITE_ALIGNMENT is not set on the composite figure, 
 * the layout assigns the same height to all figures.
 * 
 * 
 * @author Werner Randelshofer
 * @version 3.0 2008-05-28 Added support for alignment. 
 * <br>2.0 2006-01-14 Changed to support double precision coordinates.
 * <br>1.0 1. Dezember 2003  Created.
 */
public class HorizontalLayouter extends AbstractLayouter {

    public Rectangle2D.Double calculateLayout(CompositeFigure compositeFigure, Point2D.Double anchor, Point2D.Double lead) {
        Insets2D.Double layoutInsets = LAYOUT_INSETS.get(compositeFigure);

        Rectangle2D.Double layoutBounds = new Rectangle2D.Double(anchor.x, anchor.y, 0, 0);
        for (Figure child : compositeFigure.getChildren()) {
            if (child.isVisible()) {
                Dimension2DDouble preferredSize = child.getPreferredSize();
                Insets2D.Double ins = getInsets(child);
                layoutBounds.height = Math.max(layoutBounds.height, preferredSize.height + ins.top + ins.bottom);
                layoutBounds.width += preferredSize.width + ins.left + ins.right;
            }
        }
        layoutBounds.width += layoutInsets.left + layoutInsets.right;
        layoutBounds.height += layoutInsets.top + layoutInsets.bottom;

        return layoutBounds;
    }

    public Rectangle2D.Double layout(CompositeFigure compositeFigure, Point2D.Double anchor, Point2D.Double lead) {
        Insets2D.Double layoutInsets = LAYOUT_INSETS.get(compositeFigure);
        Alignment compositeAlignment = COMPOSITE_ALIGNMENT.get(compositeFigure);

        Rectangle2D.Double layoutBounds = calculateLayout(compositeFigure, anchor, lead);
        double x = layoutBounds.x + layoutInsets.left;
        for (Figure child : compositeFigure.getChildren()) {
            if (child.isVisible()) {
                Insets2D.Double insets = getInsets(child);
                double width = child.getPreferredSize().width;
                double height = child.getPreferredSize().height;
                //--
                switch (compositeAlignment) {
                    case LEADING:
                        child.setBounds(
                                new Point2D.Double(
                                x + insets.left,
                                layoutBounds.y + layoutInsets.top + insets.top),
                                new Point2D.Double(
                                x + insets.left + width,
                                layoutBounds.y + layoutInsets.top + insets.top + height));
                        break;
                    case TRAILING:
                        child.setBounds(
                                new Point2D.Double(
                                x + insets.left,
                                layoutBounds.y + layoutBounds.height - layoutInsets.bottom - insets.bottom - height),
                                new Point2D.Double(
                                x + insets.left + width,
                                layoutBounds.y + layoutBounds.height - layoutInsets.bottom - insets.bottom));
                        break;
                    case CENTER:
                        child.setBounds(
                                new Point2D.Double(
                                x + insets.left,
                                layoutBounds.y + layoutInsets.top + (layoutBounds.height - height) / 2d),
                                new Point2D.Double(
                                x + insets.left + width,
                                layoutBounds.y + layoutInsets.top + (layoutBounds.height + height) / 2d));
                        break;
                    case BLOCK:
                    default:
                        child.setBounds(
                                new Point2D.Double(
                                x + insets.left,
                                layoutBounds.y + layoutInsets.top + insets.top),
                                new Point2D.Double(
                                x + insets.left + width,
                                layoutBounds.y + layoutBounds.height - layoutInsets.bottom - insets.bottom));
                        break;
                }
                //---
                x += width + insets.left + insets.right;
            }
        }

        return layoutBounds;
    }
}
