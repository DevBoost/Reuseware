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
 * @(#)FigureSelectionEvent.java  2.0  2007-05-14
 *
 * Copyright (c) 1996-2007 by the original authors of JHotDraw
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

import java.util.*;

/**
 * FigureSelectionEvent.
 *
 * @author Werner Randelshofer
 * @version 2.0 2007-05-14 Added getters for newValue and oldValue. 
 * <br>1.0 2003-12-01 Derived from JHotDraw 5.4b1.
 */
public class FigureSelectionEvent extends java.util.EventObject {
private Set<Figure> oldValue;
private Set<Figure> newValue;

    /** Creates a new instance. */
    public FigureSelectionEvent(DrawingView source, Set<Figure> oldValue, Set<Figure> newValue) {
        super(source);
        this.oldValue = oldValue;
        this.newValue = newValue;
    }
    
    public DrawingView getView() {
        return (DrawingView) source;
    }
    
    public Set<Figure> getOldSelection() {
        return oldValue;
    }
    public Set<Figure> getNewSelection() {
        return newValue;
    }
}
