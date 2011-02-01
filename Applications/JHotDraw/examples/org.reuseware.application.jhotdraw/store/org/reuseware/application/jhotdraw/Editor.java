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

import java.awt.geom.*;
import javax.swing.*;
import org.jhotdraw.draw.*;
import org.jhotdraw.geom.*;

/**
 * Simple editor core application.
 */
public class NAME_HOOK {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                Drawing drawing = new DefaultDrawing();
                
                STATEMENT_HOOK : ;
                
                // Create a frame with a drawing view and a drawing editor
                JFrame f = new JFrame("My Drawing");
                f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                f.setSize(800,600);
                DrawingView view = new DefaultDrawingView();
                view.setDrawing(drawing);
                f.getContentPane().add(view.getComponent());
                DrawingEditor editor = new DefaultDrawingEditor();
                editor.add(view);
                editor.setTool(new DelegationSelectionTool());
                f.setVisible(true);
            }
        });
    }
}
