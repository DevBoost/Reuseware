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

import org.eclipse.gmf.runtime.notation.Diagram;
import org.reuseware.lacome.DiagramDescription;
import org.reuseware.lacome.strategy.DiagramAligner;

/**
 * Diagram aligner for GMF diagrams.
 */
public class GMFAligner implements DiagramAligner {

	/**
	 * @param diagram diagram to align
	 * @return true if the first element in the receiving diagram is an instance of
	 *              org.eclipse.gmf.runtime.notation.Diagram.
	 */
	public boolean canAlign(DiagramDescription diagram) {
		if (!diagram.getDiagramRoots().isEmpty()) {
			return diagram.getDiagramRoots().get(0) instanceof Diagram;
		}
		
		return false;
	}
	
	/**
	 * Currently not implemented.
	 * 
	 * @param newDiagram new version of composed diagram
	 * @param oldDiagram old version of composed diagram
	 */
	public void align(DiagramDescription newDiagram, DiagramDescription oldDiagram) {
		//TODO #1473: implement this GMF specific
		
		/*
		EList<EObject> newDiagrams = newDiagram.getDiagramRoots();
		EList<EObject> oldDiagrams = oldDiagram.getDiagramRoots();
		
		for(EObject newRoot : newDiagrams) {
			for(EObject oldRoot : oldDiagrams) {
				compareAndAlign(newRoot, oldRoot);
				
				for(TreeIterator<EObject> newElementIt = newRoot.eAllContents(); newElementIt.hasNext(); ) {
					EObject newElement = newElementIt.next();

					for(TreeIterator<EObject> oldElementIt = oldRoot.eAllContents(); oldElementIt.hasNext(); ) {
						EObject oldElement = oldElementIt.next();

						if(compareAndAlign(newElement, oldElement)) {
							break;
						}
					}				

				}
			}
		}
		*/
	}

	/*
	private EObject findSematicModelElement(EObject diagramElement) {
		EObject element = null;
		//TOPCASED
		EStructuralFeature feature = diagramElement.eClass().getEStructuralFeature("semanticModel");
		if (feature instanceof EReference) {
			EObject bridge = (EObject) diagramElement.eGet(feature);
			element = (EObject) bridge.eGet(bridge.eClass().getEStructuralFeature("element"));
		}
		//GMF
		
		if (feature == null && !diagramElement.eClass().getName().equals("EMFSemanticModelBridge")) {
			feature = diagramElement.eClass().getEStructuralFeature("element");
			if (feature instanceof EReference) {
				element = (EObject) diagramElement.eGet(feature);
			}
		}
		return element;
	}
	
	@SuppressWarnings("unchecked")
	private boolean compareAndAlign(EObject newDiagramElement, EObject oldDiagramElement) {
		//diagram type check
		if (!newDiagramElement.eClass().equals(oldDiagramElement.eClass())) {
			return false;
		}
		
		EObject newModelElement = findSematicModelElement(newDiagramElement);
		EObject oldModelElement = findSematicModelElement(oldDiagramElement);
		
		if (newModelElement == null || oldModelElement == null) {
			return false;
		}
		
		//semantic model element type check
		if (!newModelElement.eClass().equals(oldModelElement.eClass())) {
			return false;
		}
		
		//compare features of model element: compare attributes and attributes of next neighbors
		if (!compareAttributes(newModelElement, oldModelElement)) {
			return false;
		}
		
		for (EStructuralFeature feature : newModelElement.eClass().getEAllStructuralFeatures()) {
			if (!feature.isDerived()) {
				if (feature instanceof EReference)  {
					Object newNeighbor = newModelElement.eGet(feature);
					Object oldNeighbor = oldModelElement.eGet(feature);
					
					if (newNeighbor == null || oldNeighbor == null) {
						if (oldNeighbor != null) {
							return false;
						}
						if (newNeighbor != null) {
							return false;
						}
					} else if (newNeighbor instanceof EList) {
						EList<EObject> newNeighborList = (EList<EObject>) newNeighbor;
						EList<EObject> oldNeighborList = (EList<EObject>) oldNeighbor;
						
						if (newNeighborList.size() != oldNeighborList.size()) {
							return false;
						}
						
						for (int i = 0; i < newNeighborList.size(); i++) {
							if (!compareAttributes(newNeighborList.get(i), oldNeighborList.get(i))) {
								return false;
							}
						}
					} else { 	
						if (!compareAttributes((EObject) newNeighbor, (EObject) oldNeighbor)) {
							return false;
						}
					}
				}
			}
		}
		
		//align features of diagram element
		for (EStructuralFeature feature : newDiagramElement.eClass().getEAllStructuralFeatures()) {
			if (!feature.isDerived() && !feature.isTransient()
					                    //below: references that concern the structure depend on
					                    //       the semantic model and are not considered here
					//TOPCASED
					&& !feature.getName().equals("semanticModel")
					&& !feature.getName().equals("anchorage")
					&& !feature.getName().equals("contained")
					//GMF
					&& !feature.getName().equals("element")
					&& !feature.getName().equals("children")
					&& !feature.getName().equals("type")) {
				
				if (true) { //holdsOnlyAttributes(oldDiagramElement, feature)
					try {
						Object oldValue =  oldDiagramElement.eGet(feature);
						if (oldValue instanceof EList) {
							EList<Object> oldValueList = (EList<Object>) oldValue;
							//even if a list is empty, setting it (addAll) does something 
							//(which is not desired -> effect can be seen for instance in TOPCASED UML Class Diagrams)
							//probably because of some notifier that is triggered
							if (!oldValueList.isEmpty()) {
								EList<Object> newValueList = (EList<Object>) newDiagramElement.eGet(feature);
								newValueList.clear();
								newValueList.addAll(oldValueList);
							}
						} else {
							newDiagramElement.eSet(feature, oldValue);
						}
					} catch (UnsupportedOperationException e) {
						//catch exception if not possible (thrown e.g. by Diagram.setMeasurementUnit() of GMF)
					}
				}
			}
		}
		return true;
	}
	
	private boolean compareAttributes(EObject newModelElement,
			EObject oldModelElement) {

		for (EStructuralFeature feature : newModelElement.eClass().getEAllStructuralFeatures()) {
			if (feature instanceof EAttribute)  {
				Object value1 = newModelElement.eGet(feature);
				Object value2 = oldModelElement.eGet(feature);
				if (value1 == null && value2 != null) {
					return false;
				} else if (value1 != null && value2 == null) {
					return false;
				} else if (value1 != null && value2 != null) {				
					if (!newModelElement.eGet(feature).equals(oldModelElement.eGet(feature))) {
						return false;
					}
				}
			}
			
		}
		
		return true;
	}


	private boolean holdsOnlyAttributes(EObject element, EStructuralFeature feature) {
		if(feature instanceof EAttribute) {
			return true;
		}
		
		Object value = element.eGet(feature);
		
		if(value == null) {
			for(EReference childReference : ((EClass)feature.getEType()).getEAllReferences()) {
				if(childReference instanceof EReference) {
					return false;
				}
			}
			return true;
		}
		
		if(value instanceof EList) {
			@SuppressWarnings("unchecked")
			EList<EObject> valueList = (EList<EObject>)value;
			for(EObject listElement : valueList) {
				for(EReference childReference : listElement.eClass().getEAllReferences()) {
					if(childReference instanceof EReference) {
						return false;
					}
				}	
			}
		}
		else {
			for(EReference childReference : ((EObject)value).eClass().getEAllReferences()) {
				if(childReference instanceof EReference) {
					return false;
				}
			}
		}
		
		return true;
	}
	*/

}
