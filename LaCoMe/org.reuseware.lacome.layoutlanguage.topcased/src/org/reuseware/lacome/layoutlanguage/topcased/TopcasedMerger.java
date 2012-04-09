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

import java.util.Iterator;
import java.util.List;

import org.eclipse.draw2d.geometry.Point;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.reuseware.lacome.CompositionDiagramUtil;
import org.reuseware.lacome.DiagramDescription;
import org.reuseware.lacome.strategy.DiagramMerger;
import org.topcased.modeler.di.model.DiagramElement;
import org.topcased.modeler.di.model.DiagramInterchangePackage;
import org.topcased.modeler.di.model.EMFSemanticModelBridge;
import org.topcased.modeler.di.model.GraphConnector;
import org.topcased.modeler.di.model.GraphEdge;
import org.topcased.modeler.di.model.GraphElement;
import org.topcased.modeler.di.model.GraphNode;
import org.topcased.modeler.di.model.SemanticModelBridge;
import org.topcased.modeler.diagrams.model.Diagrams;

/**
 * Diagram merger that can handle Topcased diagrams.
 */
public class TopcasedMerger implements DiagramMerger {

	/**
	 * @param receivingDiagram the diagram to be extended
	 * @return true if the first element in the receiving diagram is an instance of
	 *              <code>org.topcased.modeler.diagrams.model.Diagrams</code>.
	 */
	public boolean canMerge(DiagramDescription receivingDiagram) {
		if (!receivingDiagram.getDiagramRoots().isEmpty()) {
			return receivingDiagram.getDiagramRoots().get(0) instanceof Diagrams;
		}
		
		return false;
	}

	/**
	 * Universal implementation of merge for all Topcased diagrams.
	 * 
	 * @param contributingDiagrams the Topcased diagrams of the contributing fragments
	 * @param receivingDiagram     the Topcased diagram of the receiving fragment 
	 * @param additionalDiagrams   other Topcased diagrams that are processed in another composition
	 *                             step of the same composition program execution
	 */
	public void merge(List<DiagramDescription> contributingDiagrams,
			DiagramDescription receivingDiagram, List<DiagramDescription> additionalDiagrams) {
			
			for (DiagramDescription contributingDiagram : contributingDiagrams) {
				int offsetx = contributingDiagram.getSourceBounds().getX();
				int offsety = contributingDiagram.getSourceBounds().getY();

				moveElements(contributingDiagram.getDiagramRoots(), receivingDiagram.getContents(), 
						contributingDiagram.getTargetBounds().getX() - offsetx,
						contributingDiagram.getTargetBounds().getY() - offsety);
			}

			EList<EObject> contributingLayout   = new BasicEList<EObject>();
			EList<EObject> contributingContents = new BasicEList<EObject>();
			EList<EObject> additionalLayout   = new BasicEList<EObject>();
			for (DiagramDescription contributingDiagram : contributingDiagrams) {
				contributingLayout.addAll(contributingDiagram.getDiagramRoots());
				contributingContents.addAll(contributingDiagram.getContents());
			}
			for (DiagramDescription additionalDiagram : additionalDiagrams) {
				additionalLayout.addAll(additionalDiagram.getDiagramRoots());
			}
			
			EList<EObject> receivingContents = receivingDiagram.getContents();
			rerouteDiagram(receivingDiagram.getDiagramRoots(), contributingLayout,  additionalLayout);
			mergeDiagrams(contributingLayout, receivingDiagram.getDiagramRoots(),  receivingContents);			
	}
	
	/**
	 * Removes a view (node or edge) if its semantic element was removed or if another
	 * graphical element to which it connected was removed.
	 * 
	 * @param element the element that was target of a cleanup
	 * @param feature the feature modified during cleanup
	 * @param removedValue the old value of the feature before cleanup
	 * @return true if element was removed from diagram
	 */
	public boolean cleanup(EObject element, EStructuralFeature feature,
			EObject removedValue) {
		if (element instanceof SemanticModelBridge) {
			//dead nodes
			SemanticModelBridge bridge = (SemanticModelBridge) element;
			EcoreUtil.remove(bridge.getGraphElement());
			return true;
		}
		if (element instanceof GraphEdge && DiagramInterchangePackage.Literals.GRAPH_EDGE__ANCHOR.equals(feature)) {
			//edges pointing into nowhere
			EcoreUtil.remove(element);
			return true;
		}
		return false;
	}
	
	private void moveElements(EList<EObject> contributingDiagrams, EList<EObject> receivingContents,
			int boundingBoxX, int boundingBoxY) {
		TreeIterator<EObject> treeIterator = EcoreUtil.getAllContents(contributingDiagrams);

		while (treeIterator.hasNext()) {
			EObject node = treeIterator.next();
			
			if (node instanceof GraphNode) {
				EObject element = findSematicModelElement(node);
				for (EObject receivingRootElement : receivingContents) {
					//skip all outer elements which are the old parents
					if (EcoreUtil.isAncestor(receivingRootElement, element)) {
						Point pos =  ((GraphNode) node).getPosition();
						if (pos != null) {
							int x = pos.x + boundingBoxX;
							int y = pos.y + boundingBoxY;
							pos = new Point(x, y);
							((GraphNode) node).setPosition(pos);	
							//children nodes have relative positions and do not need to be moved
							treeIterator.prune();
							break;
						}
					}
				}
			}
		}
	}
	
	private boolean mergeDiagrams(EList<EObject> contributingDiagramRoot, EList<EObject> receivingDiagramRoot, EList<EObject> receivingContentRoot) {	
		boolean result = false;
		boolean change = true;
		
		while (change) {
			change = false;
			TreeIterator<EObject> diagramElIt = EcoreUtil.getAllContents(contributingDiagramRoot);
			while (diagramElIt.hasNext()) {
				EObject next = diagramElIt.next();
				
				if (next instanceof DiagramElement) {
					DiagramElement diagramEl = (DiagramElement) next;
					EObject element = findSematicModelElement(diagramEl);
					if (element == null) {
						continue;
					}
					
					EObject container = element.eContainer();
					if (!(diagramEl.eContainer() instanceof Diagrams)) {
						while (container != null
								&& !container.eClass().equals(findSematicModelElement(diagramEl.eContainer()).eClass())) {
							//maybe the diagram element is contained in the diagram element for a container further up
							container = container.eContainer();
						}
					}
					
					if (receivingContentRoot.contains(EcoreUtil.getRootContainer(element))) {
						for (Iterator<EObject> tDiagramElIt = EcoreUtil.getAllContents(receivingDiagramRoot); tDiagramElIt.hasNext();) {
							EObject tNext = tDiagramElIt.next();
							if (tNext instanceof GraphElement) {
								GraphElement tDiagramEl = (GraphElement) tNext;
								EObject tElement = findSematicModelElement(tDiagramEl);
								if (container != null && container.equals(tElement) 
										//some elements have several representations: do not add to node, what was in diagram before
										&& diagramEl.eContainer().eClass().equals(tDiagramEl.eClass())) {
									addToSuitableReference(tDiagramEl, diagramEl);
									change = true;
									result = true;
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
		return result;
	}
	
	private void rerouteDiagram(EList<EObject> diagramWithOldElements, EList<EObject> diagramWithNewElements,
			EList<EObject> additionalDiagrams) {
		
		EList<EObject> allDiagrams = new BasicEList<EObject>(diagramWithNewElements);
		allDiagrams.addAll(diagramWithOldElements);
		allDiagrams.addAll(additionalDiagrams);
		
		for (TreeIterator<EObject> diagramElIt = EcoreUtil.getAllContents(allDiagrams); diagramElIt.hasNext();) {
			EObject next = diagramElIt.next();
			
			if (next instanceof GraphElement) {
				GraphElement diagramEl = (GraphElement) next;
				EObject element = findSematicModelElement(diagramEl);
				if (element == null) {
					continue;
				}
				
				//look for anchored replacements
				List<EObject> replacedValues = CompositionDiagramUtil.getReplacedValues(element);

				for (EObject replacedValue : replacedValues) {
					//find diagram element of reference
					for (Iterator<EObject> replacedDiagramElIt = EcoreUtil.getAllContents(allDiagrams); replacedDiagramElIt.hasNext();) {
						EObject replacedNext = replacedDiagramElIt.next();
						if (replacedNext instanceof GraphElement) {
							GraphElement replacedDiagramEl = (GraphElement) replacedNext;
							if (diagramEl.eClass().equals(replacedDiagramEl.eClass())) {
								EObject replacedElementCand = findSematicModelElement(replacedDiagramEl);
								
								//EObject originalReplacedElementCand = CompositionDiagramUtil.getOriginal(replacedElementCand);
								//EObject originalReplacedValue       = CompositionDiagramUtil.getOriginal(replacedValue);
								
								if (replacedValue.equals(replacedElementCand)) {
									diagramEl.getAnchorage().addAll(replacedDiagramEl.getAnchorage());
									break;
								}								
							}
						}
					}
				}
				
				//look for anchored containers
				GraphElement container = null;
				for (Iterator<EObject> replacedDiagramElIt = EcoreUtil.getAllContents(diagramWithNewElements); replacedDiagramElIt.hasNext();) {
					EObject otherNext = replacedDiagramElIt.next();
					if (otherNext instanceof GraphElement) {
						GraphElement otherDiagramEl = (GraphElement) otherNext;
						if (element.eContainer() != null && element.eContainer().equals(findSematicModelElement(otherDiagramEl))) {
							container = otherDiagramEl;
						}
					}
				}
			
				if (container != null) {
					for (Iterator<EObject> replacedDiagramElIt = EcoreUtil.getAllContents(diagramWithOldElements); replacedDiagramElIt.hasNext();) {
						EObject otherNext = replacedDiagramElIt.next();
						if (otherNext instanceof GraphElement) {
							GraphElement otherDiagramEl = (GraphElement) otherNext;
							if (otherDiagramEl.eClass().equals(container.eClass())) {
								EObject otherSematicModelElement = findSematicModelElement(otherDiagramEl);
								EObject sematicModelElement = findSematicModelElement(container);
								if (sematicModelElement != null && otherSematicModelElement != null
										&& otherSematicModelElement.eClass().equals(sematicModelElement.eClass())) {
									for (GraphConnector connector : new BasicEList<GraphConnector>(otherDiagramEl.getAnchorage())) {
										if (connector.getGraphEdge().contains(diagramEl)) {
											container.getAnchorage().add(connector);
										}
									}
								}
							}
						}
					}
				}
			}			
		}
	}
	
	private void addToSuitableReference(GraphElement container, DiagramElement value) {
		container.getContained().add(value);
	}
	
	private EObject findSematicModelElement(EObject diagramElement) {
		EObject element = null;
		
		if (diagramElement instanceof GraphElement) {
			GraphElement ge = (GraphElement) diagramElement;
			SemanticModelBridge bridge = ge.getSemanticModel();
			if (bridge instanceof EMFSemanticModelBridge) {
				element = ((EMFSemanticModelBridge) bridge).getElement();
			}
		}
		return element;
	}

}
