/*******************************************************************************
 * Copyright (c) 2006-2009
 * Software Technology Group, Dresden University of Technology
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Software Technology Group - TU Dresden, Germany
 *      - initial API and implementation
 ******************************************************************************/
package org.reuseware.lacome.adjustment.arranger;

import java.util.List;
import java.util.Iterator;

import org.reuseware.lacome.DiagramDescription;
import org.reuseware.lacome.strategy.DiagramComparator;
import org.reuseware.lacome.strategy.MultiSourceDiagramArranger;

/**
 * This arranger moves diagrams uniformly outwards from a center point.
 * This approach is called <i>uniform scaling</i>. This arranger considers 
 * all diagrams of one composition step together.
 */
public class UniformScalingArranger implements MultiSourceDiagramArranger {

	/**
	 * @param contributingDiagrams diagrams with additional nodes
	 * @param receivingDiagram extended diagram
	 */
	public void arrange(List<DiagramDescription> contributingDiagrams,
			DiagramDescription receivingDiagram) {
		
		fcdiArrange(contributingDiagrams);
		
		int counter = 1;
		//in some cases the algorithm has to run
		//several times.
		while (isOverlap(contributingDiagrams) && counter <= 10) {
			counter++;
			int centerx = findCenterX(contributingDiagrams);
			int centery = findCenterY(contributingDiagrams);
			scaleUnified(contributingDiagrams, centerx, centery);
		}	
	}
	
	/**
	 * This method arranges the source diagrams according to the x and y values given by the 
	 * composition program. This is the first step towards UnifiedScaling since the center point
	 * for the approach can be computed after this.
	 * 
	 * @param diagram given diagram that has to be moved
	 */
	private static void fcdiArrange(List<DiagramDescription> diagram) {
		Iterator<DiagramDescription> diagramIterator = diagram.iterator();
		while (diagramIterator.hasNext()) {
			DiagramDescription diag = diagramIterator.next();
			diag.getTargetBounds().setX(diag.getTargetBounds().getX());
			diag.getTargetBounds().setY(diag.getTargetBounds().getY());
			
		}
	}
	
	/**
	 * This method computes the new x and y values for the diagrams according to UnifiedScaling.
	 * This algorithm expands the diagram in all directions from a center point (x,y) using a
	 * scale factor s.
	 * 
	 * @param diagrams List of diagrams being the source diagrams the new values should be assigned to
	 * @param centerx  the x value for the center point
	 * @param centery  the y value for the center point
	 */
	private static void scaleUnified(List<DiagramDescription> diagrams, int centerx, int centery) {
		//(a+s(x-a),b+s(y-b))
		int scaleFactor = 2;
		int oldx = 0;
		int oldy = 0;
		
		Iterator<DiagramDescription> fragit = diagrams.iterator();
		while (fragit.hasNext()) {
			DiagramDescription diag = fragit.next();
			oldx = diag.getTargetBounds().getX();
			oldy = diag.getTargetBounds().getY();
			
			diag.getTargetBounds().setX(centerx + scaleFactor * (oldx - centerx));
			diag.getTargetBounds().setY(centery + scaleFactor * (oldy - centery));
			
		}
	}
	/**
	 * This method finds the x value of the center point.
	 * 
	 * @param diagram list of diagrams being the source diagrams of a composition step
	 * @return the x value of the center point
	 */
	private static int findCenterX(List<DiagramDescription> diagram) {
		Iterator<DiagramDescription> diagramIterator = diagram.iterator();
		int x = 0;
		int x1 = 2000;
		
		while (diagramIterator.hasNext()) {
			DiagramDescription diag = diagramIterator.next();
			
			//find the biggest x value, starting at x=0
			if ((diag.getTargetBounds().getX() + diag.getSourceBounds().getWidth()) > x) {
				x = diag.getTargetBounds().getX() + diag.getSourceBounds().getWidth();
			}
			
			//usually the first fragment does not start at x=0
			//so you have to add the white space again for
			//a correct computation
			if (diag.getTargetBounds().getX() < x1) {
				x1 = diag.getTargetBounds().getX();
			}
		}
		return (x1 + x) / 2;
	}
	
	/**
	 * This method finds the y value of the center point.
	 * 
	 * @param diagrams list of diagrams being the source diagrams of a composition step
	 * @return the y value of the center point
	 */
	private static int findCenterY(List<DiagramDescription> diagrams) {
		Iterator<DiagramDescription> diagramIterator = diagrams.iterator();
		int y = 0;
		int y1 = 2000;
		
		while (diagramIterator.hasNext()) {
			DiagramDescription diag = diagramIterator.next();
			
			//find the biggest y value, starting at y=0
			if ((diag.getTargetBounds().getY() + diag.getSourceBounds().getHeight()) > y) {
				y = diag.getTargetBounds().getY() + diag.getSourceBounds().getHeight();
				
			}
			
			//usually the first fragment does not start at y=0
			//so you have to add the white space again for
			//a correct computation
			if (diag.getTargetBounds().getY() < y1) {
				y1 = diag.getTargetBounds().getY();
			}		
		}
		return (y1 + y) / 2;
	}
	
	/**
	 * This method performs the overlap check for the list of contributing fragments
	 * involved in the composition.
	 * 
	 * @param diagrams list of diagrams
	 * @return true if two diagrams of the list overlap
	 */
	private static boolean isOverlap(List<DiagramDescription> diagrams) {
		Iterator<DiagramDescription> diagramIterator = diagrams.iterator();
		
		boolean overlap = false;
		int actDiag = 0;
		
		//Fragments are already sorted by XYPositionComparator!!
		//from second contributing diagram (index=1) on
		//each one has to be compared to it's predecessors
		while (diagramIterator.hasNext()) {
			actDiag++;
			DiagramDescription source1 = diagramIterator.next();
			for (int i = actDiag; i < diagrams.size(); i++) {
				DiagramDescription source2 = diagrams.get(i);
				int source1x1 = source1.getTargetBounds().getX() + source1.getSourceBounds().getWidth();
				int source1y1 = source1.getTargetBounds().getY();
				int source1y2 = source1y1 + source1.getSourceBounds().getHeight();
				int source2x1 = source2.getTargetBounds().getX();
				int source2y1 = source2.getTargetBounds().getY();
				int source2y2 = source2y1 + source2.getSourceBounds().getHeight();
				
				//only two options for overlaps because the
				//others are eliminated by the sorting
				if ((source1x1 > source2x1) && (source1y2 > source2y1) && (source2y2 > source1y1)) {
					overlap = true;
				} else {
					if ((source1x1 > source2x1) && (source1y1 > source2y1) && (source2y2 > source1y1)) {
						overlap = true;
					}
				}
			}
		}
		
		return overlap;
	}
	
	protected DiagramComparator comparator;

	/**
	 * @return the current comparator used by this arranger
	 */
	public DiagramComparator getComparator() {
		return comparator;
	}

	/**
	 * @param comparator the comparator for this arranger
	 */
	public void setComparator(DiagramComparator comparator) {
		this.comparator = comparator;
	}
}
