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
 * @(#)EditorSample.java   1.0  March 8, 2007
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
package org.reuseware.applications.samples.jhotdraw;

import java.awt.geom.*;
import javax.swing.*;
import org.jhotdraw.draw.*;
import org.jhotdraw.geom.*;

public class PLACEHOLDER implements Drawing {

    private void PLACEHOLDER(PLACEHOLDER SLOT_drawing) {
        // Create a figure
        Figure NAME_HOOK = new SLOT_figures_type();
        NAME_HOOK.setBounds(new Point2D.Double(777,888),new Point2D.Double(777+100,888+100));
        SLOT_drawing.add(NAME_HOOK);
    }
    
    private abstract class SLOT_figures_type implements Figure{}
}



