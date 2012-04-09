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
package org.reuseware.lacome.adjustment.arranger;

import java.util.List;
import java.util.Iterator;

import org.reuseware.lacome.DiagramDescription;
import org.reuseware.lacome.strategy.DiagramComparator;
import org.reuseware.lacome.strategy.MultiSourceDiagramArranger;

/**
 * This arranger moves diagrams vertically until nodes do not overlap anymore.
 * It considers all diagrams of one composition step together when calculating
 * the ideal way of horizontal movement.
 */
public class MultiVerticalArranger implements MultiSourceDiagramArranger {

	/**
	 * @param contributingDiagram diagrams with additional nodes
	 * @param receivingDiagram extended diagram
	 */
	public void arrange(List<DiagramDescription> contributingDiagram,
			DiagramDescription receivingDiagram) {
		
		int overlap = isOverlap(contributingDiagram);
		if (overlap > 0) {
			
			sortVertically(contributingDiagram, overlap);
		}

	}
	
	/**
	 * This methods sorts the diagrams vertically adding some space between the
	 * single fragments.
	 * 
	 * @param diagram list of diagrams to be sorted
	 * @param overlap the mean of all overlaps
	 */
	private void sortVertically(List<DiagramDescription> diagram, int overlap) {
		Iterator<DiagramDescription> diagramIterator = diagram.iterator();
		//the factor for the overlap. if one fragment
		//has been moved, the next has to be moved by that amount
		//plus its own overlap
		int act = 0;
		
		if (diagramIterator.hasNext()) {
			while (diagramIterator.hasNext()) {
				act++;
				DiagramDescription diag2 = diagramIterator.next();
				//setting the same space between two fragments
				//in the result that was set in the target info
				int oldy = diag2.getTargetBounds().getY();
				if (oldy <= 5) {
					oldy *= 5;
				}
				diag2.getTargetBounds().setY((oldy + (act * overlap)));
			}	
			
		}
		
	}
	
	/**
	 * This method traverses the single diagram and finds the mean of all overlaps.
	 * 
	 * @param diagram list of diagrams to be checked for overlaps
	 * @return mean overlap as an int value
	 */
	private int isOverlap(List<DiagramDescription> diagram) {
		Iterator<DiagramDescription> diagramIterator = diagram.iterator();
		int overlap = 0;
		int actDiag = 0;
		
		while (diagramIterator.hasNext()) {
			actDiag++;
			DiagramDescription source1 = diagramIterator.next();
			for (int i = actDiag; i < diagram.size(); i++) {
				DiagramDescription source2 = diagram.get(i);
				
				//definition of the center points of the involved nodes
				double source1x = (source1.getTargetBounds().getX() + source1.getSourceBounds().getWidth() / 2); 
				double source1y = (source1.getTargetBounds().getY() + source1.getSourceBounds().getHeight() / 2);
				double source2x = (source2.getTargetBounds().getX() + source2.getSourceBounds().getWidth() / 2);
				double source2y = (source2.getTargetBounds().getY() + source2.getSourceBounds().getHeight() / 2);
				
				double absolutex = Math.abs(source1x - source2x);
				double width = (source1.getSourceBounds().getWidth() + source2.getSourceBounds().getWidth()) / 2;
				double absolutey = Math.abs(source1y - source2y);
				double height = (source1.getSourceBounds().getHeight() + source2.getSourceBounds().getHeight()) / 2;
				
				int over = (source1.getTargetBounds().getY() + source1.getSourceBounds().getHeight())
								- source2.getTargetBounds().getY();
				
				//two fragment diagrams do not overlap if
				//|x1-x2|>=(w1+w2)/2 or |y1-y2|>=(h1+h2)/2
				if (absolutex < width && absolutey < height) {
					if (overlap < (height - absolutey)) {
						overlap = over;
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
