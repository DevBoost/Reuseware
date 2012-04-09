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
package org.reuseware.lacome.layoutlanguage.topcased;

import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.reuseware.lacome.DiagramDescription;
import org.reuseware.lacome.provider.SourceDiagramInformationProvider;
import org.topcased.modeler.di.model.GraphNode;
import org.topcased.modeler.diagrams.model.Diagrams;

/**
 * Source information provider for Topcased diagrams.
 */
public class TopcasedSourceDiagramInformationProvider implements SourceDiagramInformationProvider {

	/**
	 * @param diagram diagram to analyze
	 * @return true if the first element in the receiving diagram is an instance of
	 *              <code>org.topcased.modeler.diagrams.model.Diagrams</code>.
	 */
	public boolean canProvide(DiagramDescription diagram) {
		if (!diagram.getDiagramRoots().isEmpty()) {
			return diagram.getDiagramRoots().get(0) instanceof Diagrams;
		}
		return false;
	}

	/**
	 * Compute the bounds of the given Topcased diagram.
	 * 
	 * @param diagram the diagram to compute information from
	 */
	public void provideBounds(DiagramDescription diagram) {
		for (EObject source : diagram.getDiagramRoots()) {
			diagram.getSourceBounds().setX(findMinX(source));
			diagram.getSourceBounds().setY(findMinY(source));
			if ((-(findMinX(source) - findMaxX(source))) == -1) {
				diagram.getSourceBounds().setWidth(20);
			} else {
				diagram.getSourceBounds().setWidth(-(findMinX(source) - findMaxX(source)));
			}
			if ((-(findMinY(source) - findMaxY(source))) == -1) {
				diagram.getSourceBounds().setHeight(10);
			} else {
				diagram.getSourceBounds().setHeight(-(findMinY(source) - findMaxY(source)));
			}
		}
	}
	
	/**
	 * This method finds the minimum x value of the Topcased diagram.
	 * @param diagram the diagram for which the minimum x value has to be computed
	 * @return min    minimum x value
	 */
	private int findMinX(EObject diagram) {
		TreeIterator<EObject> treeIterator = diagram.eAllContents();
		int min = 0;
		
		boolean first = true;

		while (treeIterator.hasNext()) {
			EObject nodes = treeIterator.next();
			if (nodes instanceof GraphNode) {
				Point location = ((GraphNode) nodes).getPosition();
				if (location != null && (location.x > 0 || location.y > 0)) {
					if (first || location.x < min) {
						min = location.x;
						first = false;
					}
					treeIterator.prune();
				}
			}
		}
		return min;
	}
	
	/**
	 * This method finds the maximum x value of the Topcased diagram.
	 * 
	 * @param diagram the diagram for which the maximum x value has to be computed
	 * @return max    maximum x value
	 */
	private int findMaxX(EObject diagram) {
		TreeIterator<EObject> treeIterator = diagram.eAllContents();
		int max = 0;
		boolean first = true;
		
		while (treeIterator.hasNext()) {
			EObject nodes = treeIterator.next();
			if (nodes instanceof GraphNode) {
				Point location = ((GraphNode) nodes).getPosition();
				Dimension size = ((GraphNode) nodes).getSize();
				if (location != null && (location.x > 0 || location.y > 0)) {
					int width = size.width;
					if (width == -1) {
						width = 50;
					}
					if (first || location.x + width > max) {
						max = location.x + width;
						first = false;
					}
					treeIterator.prune();
				}
				
			}
		}
		return max;
	}
	
	/**
	 * This method finds the minimum y value of the Topcased diagram.
	 * 
	 * @param diagram the diagram for which the minimum y value has to be computed
	 * @return min    minimum y value
	 */
	private int findMinY(EObject diagram) {
		TreeIterator<EObject> treeIterator = diagram.eAllContents();
		int min = 0;
		boolean first = true;

		while (treeIterator.hasNext()) {
			EObject nodes = treeIterator.next();
			if (nodes instanceof GraphNode) {
				Point location = ((GraphNode) nodes).getPosition();
				if (location != null && (location.x > 0 || location.y > 0)) {
					if (first || location.y < min) {
						min = location.y;
						first = false;
					}
					treeIterator.prune();
				}
			}
		}
		return min;
	}
	
	/**
	 * This method finds the maximum y value of the Topcased diagram.
	 * 
	 * @param diagram the diagram for which the maximum y value has to be computed
	 * @return max    maximum y value
	 */
	private int findMaxY(EObject diagram) {
		TreeIterator<EObject> treeIterator = diagram.eAllContents();
		int max = 0;
		boolean first = true;
		
		while (treeIterator.hasNext()) {
			EObject nodes = treeIterator.next();
			if (nodes instanceof GraphNode) {
				Point location = ((GraphNode) nodes).getPosition();
				Dimension size = ((GraphNode) nodes).getSize();
				if (location != null && (location.x > 0 || location.y > 0)) {
					int height = size.height;
					if (height == -1) {
						height = 40;
					}
					if (first || location.y + height > max) {
						max = location.y + height;
						first = false;
					}
					treeIterator.prune();
				}
			}
		}
		return max;
	}

}
