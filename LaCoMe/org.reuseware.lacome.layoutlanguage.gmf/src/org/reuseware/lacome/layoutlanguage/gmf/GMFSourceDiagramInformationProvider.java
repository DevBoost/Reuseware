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
package org.reuseware.lacome.layoutlanguage.gmf;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.LayoutConstraint;
import org.eclipse.gmf.runtime.notation.Location;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.Size;
import org.eclipse.gmf.runtime.notation.View;
import org.reuseware.lacome.DiagramDescription;
import org.reuseware.lacome.provider.SourceDiagramInformationProvider;

/**
 * Source information provider for GMF diagrams.
 */
public class GMFSourceDiagramInformationProvider implements
		SourceDiagramInformationProvider {

	/**
	 * @param diagram diagram to analyze
	 * @return true if the first element in the receiving diagram is an instance of
	 *              org.eclipse.gmf.runtime.notation.Diagram.
	 */
	public boolean canProvide(DiagramDescription diagram) {
		if (!diagram.getDiagramRoots().isEmpty()) {
			return diagram.getDiagramRoots().get(0) instanceof Diagram;
		}
		return false;
	}

	/**
	 * Compute the bounds of the given GMF diagram.
	 * 
	 * @param diagram the diagram to compute information from
	 */
	public void provideBounds(DiagramDescription diagram) {
				
		for (EObject source : diagram.getDiagramRoots()) {		
			int minX = findMinX(source);
			int maxX = findMaxX(source);
			int minY = findMinY(source);
			int maxY = findMaxY(source);
			
			int width = maxX - minX;
			int height = maxY - minY;
			
			diagram.getSourceBounds().setX(minX);
			diagram.getSourceBounds().setY(minY);
			
			if (width == -1) {
				diagram.getSourceBounds().setWidth(20);
			} else {
				diagram.getSourceBounds().setWidth(width);
			}
			
			if (height == -1) { 
				diagram.getSourceBounds().setHeight(10);
			} else {
				diagram.getSourceBounds().setHeight(height);
			}
		}
		
		int measurementUnit = 
			((Diagram) diagram.getDiagramRoots().get(0)).getMeasurementUnit().getValue();
		
		diagram.getSourceBounds().setMeasurementUnit(measurementUnit);
	}
	
	private int findMinX(EObject diagram) {
		TreeIterator<EObject> treeIterator = diagram.eAllContents();
		int min = Integer.MAX_VALUE;

		while (treeIterator.hasNext()) {
			EObject next = treeIterator.next();
			if (!(next instanceof Node)) {
				continue;
			}
			Node node = (Node) next;
 			EObject element = findSematicModelElement(node);
 			
 			if (element != null || node.getType().equals("Note")) {
				LayoutConstraint location = node.getLayoutConstraint();
				if (location instanceof Location) {
					if ((((Location) location).getX()) < min) {
						min = ((Location) location).getX();
					}
				}
				treeIterator.prune();
 			}
		}
		
		return min == Integer.MAX_VALUE ? 0 : min;
	}

	private int findMaxX(EObject diagram) {
		TreeIterator<EObject> treeIterator = diagram.eAllContents();
		int max = 0;
		
		while (treeIterator.hasNext()) {
			EObject next = treeIterator.next();
			if (!(next instanceof Node)) {
				continue;
			}
			Node node = (Node) next;
 			EObject element = findSematicModelElement(node);
 			
 			if (element != null || node.getType().equals("Note")) {
				LayoutConstraint location = node.getLayoutConstraint();
				LayoutConstraint size     = node.getLayoutConstraint();
				if (location instanceof Location && size instanceof Size) {
					if ((((Location) location).getX() + ((Size) size).getWidth()) > max) {
						max = ((Location) location).getX() + ((Size) size).getWidth();
					}
				}
				treeIterator.prune();
 			}
		}
		return max;
	}

	private int findMinY(EObject diagram) {
		TreeIterator<EObject> treeIterator = diagram.eAllContents();
		int min = Integer.MAX_VALUE;
		
		while (treeIterator.hasNext()) {
			EObject next = treeIterator.next();
			if (!(next instanceof Node)) {
				continue;
			}
			Node node = (Node) next;
 			EObject element = findSematicModelElement(node);
 			
 			if (element != null || node.getType().equals("Note")) {
				LayoutConstraint location = node.getLayoutConstraint();
				if (location instanceof Location) {
					if ((((Location) location).getY()) < min) {
						min = ((Location) location).getY();
					}
				}
				treeIterator.prune();
 			}
		}
		return min == Integer.MAX_VALUE ? 0 : min;
	}

	private int findMaxY(EObject diagram) {
		TreeIterator<EObject> treeIterator = diagram.eAllContents();
		int max = 0;
			
		while (treeIterator.hasNext()) {
			EObject next = treeIterator.next();
			if (!(next instanceof Node)) {
				continue;
			}
			Node node = (Node) next;
 			EObject element = findSematicModelElement(node);
 			
 			if (element != null || node.getType().equals("Note")) {
				LayoutConstraint location = node.getLayoutConstraint();
				LayoutConstraint size     = node.getLayoutConstraint();
				if (location instanceof Location && size instanceof Size) {
					if ((((Location) location).getY() + ((Size) size).getHeight()) > max) {
						max = ((Location) location).getY() + ((Size) size).getHeight();
					}
				}
				treeIterator.prune();
 			}
		}
		
		return max;
	}
	
	private EObject findSematicModelElement(View view) {
		return view.getElement();
	}

}
