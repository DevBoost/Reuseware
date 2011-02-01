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

import java.util.Iterator;
import java.util.List;

import org.reuseware.lacome.DiagramDescription;
import org.reuseware.lacome.strategy.DiagramComparator;
import org.reuseware.lacome.strategy.MultiSourceDiagramArranger;

/**
 * This arranger moves diagrams horizontally until nodes do not overlap anymore.
 * It considers all diagrams of one composition step together when calculating
 * the ideal way of horizontal movement.
 */
public class MultiHorizontalArranger implements MultiSourceDiagramArranger {

	/**
	 * @param contributingDiagram diagrams with additional nodes
	 * @param receivingDiagram extended diagram
	 */
	public void arrange(List<DiagramDescription> contributingDiagram,
			DiagramDescription receivingDiagram) {
		
		int overlap = getOverlap(contributingDiagram);
		if (overlap > 0) {
			sortHorizontally(contributingDiagram, overlap);
		}
	}
	
	/**
	 * This methods sorts the diagrams horizontally adding some space between the
	 * single fragments.
	 * 
	 * @param diagram list of diagrams to be sorted
	 * @param overlap the mean of all overlaps
	 */
	private void sortHorizontally(
			List<DiagramDescription> diagram,
			int overlap) {
		
		Iterator<DiagramDescription> fragit = diagram.iterator();
		//the factor for the overlap. if one fragment
		//has been moved, the next has to be moved by that amount
		//plus its own overlap
		int act = 0;
		
		if (fragit.hasNext()) {
			//skip the first diagram
			fragit.next();
			while (fragit.hasNext()) {
				act++;
				DiagramDescription diag2 = fragit.next();
				//setting the same space between two fragments
				//in the result that was set in the target info
				int oldx = diag2.getTargetBounds().getX();
				if (oldx <= 5) {
					oldx = oldx * 5;
				}
				diag2.getTargetBounds().setX((oldx + (act * overlap)));
			}
			
		}
	}

	/**
	 * This method traverses the single fragments and finds the mean of all overlaps.
	 * 
	 * @param diagramList list of diagrams to be checked for overlaps
	 * @return mean overlap as an int value
	 */
	private int getOverlap(List<DiagramDescription> diagramList) {
		Iterator<DiagramDescription> fragit = diagramList.iterator();
		int overlap = 0;
		int actDiag = 0;
		
		while (fragit.hasNext()) {
			actDiag++;
			DiagramDescription source1 = fragit.next();
			for (int i = actDiag; i < diagramList.size(); i++) {
				DiagramDescription source2 = diagramList.get(i);
				
				//definition of the center points of the involved nodes
				double source1x = (source1.getTargetBounds().getX() + (source1.getSourceBounds().getWidth() / 2)); 
				double source1y = (source1.getTargetBounds().getY() + (source1.getSourceBounds().getHeight() / 2));
				double source2x = (source2.getTargetBounds().getX() + (source2.getSourceBounds().getWidth() / 2));
				double source2y = (source2.getTargetBounds().getY() + (source2.getSourceBounds().getHeight() / 2));
				
				double absolutex = Math.abs(source1x - source2x);
				double width = (source1.getSourceBounds().getWidth() + source2.getSourceBounds().getWidth()) / 2;
				double absolutey = Math.abs(source1y - source2y);
				double height = (source1.getSourceBounds().getHeight() + source2.getSourceBounds().getHeight()) / 2;
				
				int over = (source1.getTargetBounds().getX() + source1.getSourceBounds().getWidth())
								- source2.getTargetBounds().getX();
				
				//two fragment diagrams do not overlap if
				//|x1-x2|>=(w1+w2)/2 or |y1-y2|>=(h1+h2)/2
				if (absolutex < width && absolutey < height) {
					if (overlap < (width - absolutex)) {
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
