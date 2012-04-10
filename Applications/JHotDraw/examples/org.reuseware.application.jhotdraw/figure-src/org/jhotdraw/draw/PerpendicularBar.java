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
 * @(#)PerpendicularBar.java  1.0  2007-11-11
 *
 * Copyright (c) 2007 by the original authors of JHotDraw
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

import java.awt.geom.GeneralPath;

import org.jhotdraw.xml.DOMInput;
import org.jhotdraw.xml.DOMOutput;
import org.jhotdraw.xml.DOMStorable;

/**
 * A perpendicular line decoration.
 *
 * @author Huw Jones
 */
public class PerpendicularBar extends AbstractLineDecoration implements DOMStorable {
	private double height;
	
    /**
     * Constructs a perpendicular line with a height of 10.
     */
	public PerpendicularBar() {
		this(10);
	}

    /**
     * Constructs a perpendicular line with the given height.
     */
	public PerpendicularBar(double height) {
		super(false, true, false);
		
		this.height = height;
	}
	
    /**
     * Calculates the path of the decorator...a simple line
     * perpendicular to the figure.
     */
    protected GeneralPath getDecoratorPath(Figure f) {
        GeneralPath path = new GeneralPath();
        double halfHeight = height / 2;
        
        path.moveTo((float) +halfHeight, 0);
        path.lineTo((float) -halfHeight, 0);
        
        return path;
    }
    
    /**
     * Calculates the radius of the decorator path.
     */
    protected double getDecoratorPathRadius(Figure f) {
    	return 0.5;
    }
    
    public void read(DOMInput in) {
        height = in.getAttribute("height", 10);
    }
    
    public void write(DOMOutput out) {
        out.addAttribute("height", height);
    }
}
