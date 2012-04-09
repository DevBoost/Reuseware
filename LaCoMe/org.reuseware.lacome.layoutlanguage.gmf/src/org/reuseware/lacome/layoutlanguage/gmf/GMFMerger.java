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
package org.reuseware.lacome.layoutlanguage.gmf;

import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.draw2d.ui.mapmode.MapModeUtil;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.LayoutConstraint;
import org.eclipse.gmf.runtime.notation.Location;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.NotationFactory;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.Size;
import org.eclipse.gmf.runtime.notation.View;
import org.reuseware.lacome.Bounds;
import org.reuseware.lacome.CompositionDiagramUtil;
import org.reuseware.lacome.DiagramDescription;
import org.reuseware.lacome.strategy.DiagramMerger;

/**
 * Diagram merger that can handle GMF diagrams.
 */
public class GMFMerger implements DiagramMerger {
	
	/**
	 * @param receivingDiagram the diagram to be extended
	 * @return true if the first element in the receiving diagram is an instance of
	 *              org.eclipse.gmf.runtime.notation.Diagram.
	 */
	public boolean canMerge(DiagramDescription receivingDiagram) {
		
		if (!receivingDiagram.getDiagramRoots().isEmpty()) {
			return receivingDiagram.getDiagramRoots().get(0) instanceof Diagram;
		}
		
		return false;
	}
	
	/**
	 * Universal implementation of merge for all GMF diagrams.
	 * 
	 * @param contributingDiagrams the GMF diagrams of the contributing fragments
	 * @param receivingDiagram     the GMF diagram of the receiving fragment 
	 * @param additionalDiagrams   other GMF diagrams that are processed in another composition
	 *                             step of the same composition program execution
	 */
	public void merge(List<DiagramDescription> contributingDiagrams,
			DiagramDescription receivingDiagram, List<DiagramDescription> additionalDiagrams) {
		
		
		EList<EObject> allDiagrams = new BasicEList<EObject>();
		allDiagrams.addAll(receivingDiagram.getDiagramRoots());
		for (DiagramDescription contributingDiagram : contributingDiagrams) {
			allDiagrams.addAll(contributingDiagram.getDiagramRoots());
		}
		
		//diagram composition
		for (DiagramDescription sourceDiagram : contributingDiagrams) {
			updateCoordinatesOfAllNodes(sourceDiagram);
			
			for (EObject sDiagram : sourceDiagram.getDiagramRoots()) {
				for (EObject tDiagram : receivingDiagram.getDiagramRoots()) {
					mergeDiagrams(sDiagram, tDiagram, receivingDiagram.getContents(), allDiagrams);
					break;
				}
			}
		}
	}
	
	/**
	 * Removes a view if its semantic element was removed.
	 * 
	 * @param element the element that was target of a cleanup
	 * @param feature the feature modified during cleanup
	 * @param removedValue the old value of the feature before cleanup
	 * @return true if element was removed from diagram
	 */
	public boolean cleanup(EObject element, EStructuralFeature feature,
			EObject removedValue) {
		if (NotationPackage.Literals.VIEW__ELEMENT.equals(feature)) {
			EcoreUtil.remove(element);
			return true;
		}
		return false;
	}
	
	/**
	 * This method updates the <tt>Location</tt> of the GMF nodes.
	 */
	private void updateCoordinatesOfAllNodes(DiagramDescription diagram) {
		int xsource = diagram.getSourceBounds().getX();
		int ysource = diagram.getSourceBounds().getY();
		
		int xtarget = diagram.getTargetBounds().getX();
		int ytarget = diagram.getTargetBounds().getY();
		
		int sourceMU = diagram.getSourceBounds().getMeasurementUnit();
		int targetMU = diagram.getTargetBounds().getMeasurementUnit();
		
		//convert source diagram units to target diagram units
		if (targetMU != Bounds.MU_NULL) {
			if (sourceMU != Bounds.MU_NULL) {
				if (sourceMU != targetMU) {
					if (sourceMU == Bounds.MU_PIXEL) {
						xsource = MapModeUtil.getMapMode().LPtoDP(xsource);
						ysource = MapModeUtil.getMapMode().LPtoDP(ysource);
					} else if (sourceMU == Bounds.MU_HIMETRIC) {
						xsource = MapModeUtil.getMapMode().DPtoLP(xsource);
						ysource = MapModeUtil.getMapMode().DPtoLP(ysource);
					}
				}
			}
		}
		
		//set location attributes of all nodes
		for (EObject gmfDiagram : diagram.getDiagramRoots()) {
			TreeIterator<EObject> treeIterator = gmfDiagram.eAllContents();

			while (treeIterator.hasNext()) {
				EObject next = treeIterator.next();
				
				if (next instanceof Node) {
					Node node = (Node) next;
					LayoutConstraint location = node.getLayoutConstraint();
					LayoutConstraint size = node.getLayoutConstraint();
					
					if (location instanceof Location && size instanceof Size) {
						org.eclipse.gmf.runtime.notation.Bounds bounds = 
							NotationFactory.eINSTANCE.createBounds();
						
						int xold = ((Location) location).getX();
						int yold = ((Location) location).getY();
						
						//keeps the original size of the node
						bounds.setHeight(((Size) size).getHeight());
						bounds.setWidth(((Size) size).getWidth());
						
						//sets the new coordinates
						bounds.setX(xtarget + xold - xsource);
						bounds.setY(ytarget + yold - ysource);
						
						node.setLayoutConstraint(bounds);
					}
					treeIterator.prune();
				}
			}
		}
	}
	
	private void mergeDiagrams(EObject contributingDiagramRoot, EObject receivingDiagramRoot, 
			EList<EObject> receivingContentRoot, EList<EObject> allDiagrams) {
		boolean change = true;
		
		while (change) {
			TreeIterator<EObject> diagramElIt = contributingDiagramRoot.eAllContents();
			if (!diagramElIt.hasNext()) {
				change = false;
			} else {
				while (diagramElIt.hasNext()) {
					change = false;
					
					EObject diagramEl = diagramElIt.next();
					EObject element = findSematicModelElement(diagramEl);
					List<EObject> replacedElements = CompositionDiagramUtil.getReplacedValues(element);
					
					//for comments (Notes) without semantic element (GMF)
					if (element == null && diagramEl instanceof Node) {
						Node node = (Node) diagramEl;
						if (node.getType().equals("Note")) {
							addToSuitableReference(
									(View) receivingDiagramRoot, node, replacedElements);	
							change = true;
						}
					}
					
					//for nodes with semantic model element
					if (receivingContentRoot.contains(EcoreUtil.getRootContainer(element))) {
						//is the root the container's view?
						if (element.eContainer().equals(findSematicModelElement(receivingDiagramRoot))) {
							addToSuitableReference(
									(View) receivingDiagramRoot, 
									(View) diagramEl, replacedElements);
							change = true;
						} else {	
							//or is it another element?
							for (Iterator<EObject> tDiagramElIt = EcoreUtil.getAllContents(allDiagrams); tDiagramElIt.hasNext();) {
								EObject tDiagramEl = tDiagramElIt.next();
								EObject tElement = findSematicModelElement(tDiagramEl);
								
								EObject container = element.eContainer();
								
								if (diagramEl instanceof Node) {
									Node node = (Node) diagramEl;
									if (container.equals(tElement)) {
										addToSuitableReference((Node) tDiagramEl, node, replacedElements);
										change = true;
										break;
									}
								}
							}
						}
					}
					if (change) {
						break;
					}
				}
			}
		}
	}
	
	private EObject findSematicModelElement(EObject diagramElement) {
		EObject element = null;
		if (diagramElement instanceof View) {
			element = ((View) diagramElement).getElement();
		}
		return element;
	}
	
	private void addToSuitableReference(View container, View value, List<EObject> replacedElements) {
		EObject parent = findSematicModelElement(container);
		if (parent != null) {
			for (Object childView : container.getChildren()) {
				EObject child = findSematicModelElement((EObject) childView);
				//go into children if required - for compartments (see TaiPan example)
				if (/*childView instanceof BasicCompartment && */ parent.equals(child)) {
					container = (Node) childView;
					break;
				}			
			}
		}

		if (value instanceof Node) {
			@SuppressWarnings("unchecked")
			EList<Node> persistedChildren = container.getPersistedChildren();
			persistedChildren.add((Node) value);
		} else if (value instanceof Edge) {
			while (!(container instanceof Diagram)) {
				container = (View) container.eContainer();
				if (container == null) {
					return;
				}
			}
			@SuppressWarnings("unchecked")
			EList<Edge> persistedEdges = ((Diagram) container).getPersistedEdges();
			persistedEdges.add((Edge) value);
		} else {
			return;
		}
	}
	


}
