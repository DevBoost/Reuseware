/*******************************************************************************
 * Copyright (c) 2006-2011
 * Software Technology Group, Dresden University of Technology
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0 
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *   Software Technology Group - TU Dresden, Germany 
 *      - initial API and implementation
 ******************************************************************************/
package org.reuseware.lacome.adjustment.arranger;

import org.reuseware.lacome.DiagramDescription;
import org.reuseware.lacome.strategy.DiagramComparator;
import org.reuseware.lacome.strategy.SingleSourceDiagramArranger;

/**
 * This arranger moves diagrams vertically until nodes do not overlap anymore.
 * It only considers the composition of two diagrams.
 */
public class VerticalArranger implements SingleSourceDiagramArranger {
	
	/**
	 * @param contributingDiagram diagram with additional nodes
	 * @param receivingDiagram extended diagram
	 */
	public void arrange(DiagramDescription contributingDiagram,
			DiagramDescription receivingDiagram) {
		
		if (isOverlap(contributingDiagram, receivingDiagram)) {
			sortVertically(contributingDiagram, receivingDiagram);
		} else {
			contributingDiagram.getTargetBounds().setX(contributingDiagram.getTargetBounds().getX());
			contributingDiagram.getTargetBounds().setY(contributingDiagram.getTargetBounds().getY());
		}
	}
	
	private void sortVertically(DiagramDescription contributingDiagram,
			DiagramDescription receivingDiagram) {
		
		if (receivingDiagram.getSourceBounds().getWidth() <= 0) {
			contributingDiagram.getTargetBounds().setY(contributingDiagram.getTargetBounds().getY());
		} else {
			contributingDiagram.getTargetBounds().setY(receivingDiagram.getSourceBounds().getHeight() + receivingDiagram.getSourceBounds().getY());
			
		}
		contributingDiagram.getTargetBounds().setX(contributingDiagram.getTargetBounds().getX());
		
	}

	/**
	 * This method performs the overlap check for contributing and receiving diagrams.
	 * 
	 * @param contributingDiagram	diagram that is the next source diagram for the composition
	 * @param receivingDiagram	the target diagram containing all source diagrams of the previous steps
	 * @return true if the source diagram overlaps the bounding box of the target diagram, false if that is not the case 
	 */
	private static boolean isOverlap(
			DiagramDescription contributingDiagram, 
			DiagramDescription receivingDiagram) {
		
		int targety  = receivingDiagram.getSourceBounds().getY();
		int tawidth  = receivingDiagram.getSourceBounds().getWidth() + receivingDiagram.getSourceBounds().getX();
		int taheight = receivingDiagram.getSourceBounds().getHeight();
		
		int sourcex  = contributingDiagram.getTargetBounds().getX();
		int sourcey  = contributingDiagram.getTargetBounds().getY();
		int soheight = contributingDiagram.getSourceBounds().getHeight();
		
		boolean overlap = false;
		
		
		if (sourcex < tawidth
				&& sourcey >= targety 
				&& sourcey < (targety + taheight)) {
			//S(sourcex,sourcey) within the bounding box of the target
			overlap = true;
		} else {
			if (sourcex < tawidth
					 && (sourcey + soheight) >= targety
					 && (sourcey + soheight) < (targety + taheight)) {
				//S(sourcex,(sourcey+soheight)) within the bounding box of the target
				overlap = true;
			} else {
				if (sourcex < tawidth
						 && sourcey < targety
						 && (sourcey + soheight) >= (targety + taheight)) {
					//S(sourcex,receivingDiagramy), S(sourcex,(sourcey+soheight)) NOT within the bounds
					//but (sourcex > targetx) and (sourcex < (targetx+tawidth))
					overlap = true;
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
