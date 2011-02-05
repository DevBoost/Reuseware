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

import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature.Setting;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.reuseware.lacome.CompositionDiagramUtil;
import org.reuseware.lacome.DiagramDescription;
import org.reuseware.lacome.strategy.DiagramComparator;
import org.reuseware.lacome.strategy.MultiSourceDiagramArranger;

/**
 * This arranger modifies lists of the actual model if the order of 
 * elements in these lists does not have semantic impact. The order
 * in these lists can however have impact on the presentation 
 * (e.g., in textual models).
 */
public class ModelArranger implements MultiSourceDiagramArranger {
	
	protected DiagramComparator comparator = null;

	/**
	 * This method rearranges the position of elements in a model. It 
	 * exploits the model position attribute of the given diagram descriptions.
	 * 
	 * @param contributingDiagram diagram with additional nodes
	 * @param receivingDiagram extended diagram
	 */
	public void arrange(List<DiagramDescription> contributingDiagram,
			DiagramDescription receivingDiagram) {
		
		for (DiagramDescription sourceDiagram : contributingDiagram) {
			for (EObject sRootElement : sourceDiagram.getDiagramRoots()) {
				for (EObject tRootElement : receivingDiagram.getContents()) {
					arrangeModel(sRootElement, tRootElement,
							sourceDiagram.getTargetBounds().getModelPosition());
				}
			}
		}

	}
	/**
	 * This method rearranges the position of elements in a model.
	 * 
	 * @param sRootElement The source element required for comparison purposes
	 * @param tRootElement The target element which is rearranged
	 * @param modelPosition Position value the target element is moved to
	 */
	private void arrangeModel(EObject sRootElement, EObject tRootElement,
			int modelPosition) {
		TreeIterator<EObject> iterate = EcoreUtil.getAllContents(Collections.singletonList(sRootElement));
		while (iterate.hasNext()) {
			EObject sourceNext = iterate.next();
			TreeIterator<EObject> targetit = tRootElement.eAllContents();
			while (targetit.hasNext()) {
				EObject tnext = targetit.next();
				Setting sourceSetting = CompositionDiagramUtil.getRemovedFromSetting(tnext);
				if (sourceSetting != null) {
					if (sourceNext.equals(sourceSetting.getEObject())) {
						EReference tnextRef = tnext.eContainmentFeature();
						if (tnextRef.isMany()) {
							@SuppressWarnings("unchecked")
							EList<EObject> containerlist = (EList<EObject>) tnext.eContainer().eGet(tnextRef);
							containerlist.move(modelPosition, tnext);
							iterate.prune();
							break;
						}
					}	
				}
			}
		}		
	}

	/**
	 * @param comparator comparator for ordering diagrams in cases where more 
	 *        than two diagrams are combined
	 */
	public void setComparator(DiagramComparator comparator) {
		this.comparator = comparator;
	}
	
	/**
	 * @return the current comparator used by this arranger
	 */
	public DiagramComparator getComparator() {
		return comparator;
	}
}
