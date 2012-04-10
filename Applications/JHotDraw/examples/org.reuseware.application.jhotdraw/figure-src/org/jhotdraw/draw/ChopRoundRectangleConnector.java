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
 * @(#)ChopRoundRectangleConnector.java  2.1  2006-12-23
 *
 * Copyright (c) 1996-2006 by the original authors of JHotDraw
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
import static org.jhotdraw.draw.AttributeKeys.*;
import org.jhotdraw.geom.*;
/**
 * A ChopRoundRectangleConnector locates a connection Point2D.Double by
 * chopping the connection at the horizontal and vertica lines defined by the
 * display box of a RoundRectangleFigure.
 *
 * @author  Werner Randelshofer
 * @version 2.2 2006-12-23 Renamed from ChopRoundRectConnector to 
 * ChopRoundRectangleConnector.
 * <br>2.0 2006-01-14 Changed to support double precison coordinates.
 * <br>1.0  2004-03-02  Derived from class ShortestDistanceConnector of
 * JHotDraw 6.0b1.
 */
public class ChopRoundRectangleConnector extends ChopRectangleConnector {
    
    /**
     * Only used for DOMStorable input.
     */
    public ChopRoundRectangleConnector() {
    }
    
    public ChopRoundRectangleConnector(Figure owner) {
        super(owner);
    }
       
    protected Point2D.Double chop(Figure target, Point2D.Double from) {
        target =  getConnectorTarget(target);
        RoundRectangleFigure rrf = (RoundRectangleFigure) target;
        Rectangle2D.Double outer = rrf.getBounds();

        double grow;
        switch (STROKE_PLACEMENT.get(target)) {
            case CENTER :
            default :
                grow = AttributeKeys.getStrokeTotalWidth(target) / 2d;
                break;
            case OUTSIDE :
                grow = AttributeKeys.getStrokeTotalWidth(target);
                break;
            case INSIDE :
                grow = 0;
                break;
        }
        Geom.grow(outer, grow, grow);
        
        
        
        Rectangle2D.Double inner = (Rectangle2D.Double) outer.clone();
        double gw = -(rrf.getArcWidth() + grow * 2) / 2;
        double gh = -(rrf.getArcHeight() + grow *2) / 2;
        inner.x -= gw;
        inner.y -= gh;
        inner.width += gw * 2;
        inner.height += gh * 2;
        
        double angle = Geom.pointToAngle(outer, from);
        Point2D.Double p = Geom.angleToPoint(outer, Geom.pointToAngle(outer, from));
        
        if (p.x == outer.x
        || p.x == outer.x + outer.width) {
            p.y = Math.min(Math.max(p.y, inner.y), inner.y + inner.height);
        } else {
            p.x = Math.min(Math.max(p.x, inner.x), inner.x + inner.width);
        }
        return p;
    }
}
