/*******************************************************************************
 * Copyright (c) 2006-2010
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
package org.reuseware.lacome.strategy;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.reuseware.lacome.DiagramDescription;

/**
 * Diagram merger can merge two diagrams physically, after
 * the two semantic models (fragments) have been composed by Reuseware.
 */
public interface DiagramMerger {

	/**
	 * @param receivingDiagram the diagram to be extended
	 * @return true if this merger can handle the given type of diagram
	 */
	boolean canMerge(
			DiagramDescription receivingDiagram);
	
	/**
	 * Composes the source into the target diagram. The composition
	 * is performed by modifying the target diagram with information 
	 * from the source diagram
	 * 
	 * @param contributingDiagrams the diagrams of the contributing fragments
	 * @param receivingDiagram     the diagram of the receiving fragment 
	 * @param additionalDiagrams   other diagrams that are processed in another composition
	 *                             step of the same composition program execution
	 */
	void merge(
			List<DiagramDescription> contributingDiagrams, 
			DiagramDescription receivingDiagram, List<DiagramDescription> additionalDiagrams);

	/**
	 * Perform additional cleanup operations to an element if a given reference (identified by
	 * feature and old value) was removed during cleanup.
	 * 
	 * @param element the element that was target of a cleanup
	 * @param feature the feature modified during cleanup
	 * @param removedValue the old value of the feature before cleanup
	 * @return true if the containment hierarchy of the diagram to which the element belongs was modified
	 */
	boolean cleanup(
			EObject element, EStructuralFeature feature, EObject removedValue);
	
}
