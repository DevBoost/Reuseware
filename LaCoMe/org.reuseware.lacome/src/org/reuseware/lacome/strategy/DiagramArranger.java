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
package org.reuseware.lacome.strategy;

import org.reuseware.lacome.DiagramDescription;

/**
 * Arranges the diagrams using a specific algorithm. Ideally, an implementation should not depend on a 
 * specific layout language (i.e., types of <code>FragmentDiagram.getDiagramRoots()</code>
 * do not need to be inspected). An implementation may modify <code>FragmentDiagram.getTargetBounds()</code>
 * 
 * @param <SourceType> type of contributing diagrams
 */
public interface DiagramArranger<SourceType> {
	
	/**
	 * This method performs the arranging oh nodes in the combined diagrams. 
	 * It should implement a strategy that remove overlaps of nodes while
	 * preserving the principle layout of the diagram
	 * 
	 * @param contributingDiagram diagram with additional nodes
	 * @param receivingDiagram extended diagram
	 */
	void arrange(
			SourceType contributingDiagram, 
			DiagramDescription receivingDiagram);
	
	/**
	 * @param comparator comparator for ordering diagrams in cases where more 
	 *        than two diagrams are combined
	 */
	void setComparator(
			DiagramComparator comparator);
	
	/**
	 * @return the current comparator used by this arranger
	 */
	DiagramComparator getComparator();

}
