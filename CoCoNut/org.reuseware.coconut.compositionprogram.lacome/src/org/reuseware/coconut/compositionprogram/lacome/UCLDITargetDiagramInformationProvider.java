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
package org.reuseware.coconut.compositionprogram.lacome;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.LayoutConstraint;
import org.eclipse.gmf.runtime.notation.Location;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.Size;
import org.reuseware.coconut.compositionprogram.CompositionProgram;
import org.reuseware.coconut.compositionprogram.FragmentInstance;
import org.reuseware.coconut.compositionprogram.PhysicalCompositionProgram;
import org.reuseware.coconut.fragment.Fragment;
import org.reuseware.coconut.resource.ReuseResources;
import org.reuseware.lacome.DiagramDescription;
import org.reuseware.lacome.provider.TargetDiagramInformationProvider;

/**
 * Target information provider for GMF-based UCL diagrams.
 */
public class UCLDITargetDiagramInformationProvider implements
		TargetDiagramInformationProvider {

	/**
	 * @param diagram the diagram to compute information for.
	 * 
	 * @return true if the context object of the given diagram is a
	 *              fragment instance contained in a physical 
	 *              composition program
	 */
	public boolean canProvide(DiagramDescription diagram) {
		EObject context = diagram.getContext();
		if (context instanceof FragmentInstance) {
			CompositionProgram cp = ((FragmentInstance) context)
					.getCompositionProgram();
			if (!(cp instanceof PhysicalCompositionProgram)) {
				return false;
			}
		}

		return !findUCLDIDiagram(context).isEmpty();
	}

	/**
	 * Computes the target bounds information for the given diagram.
	 * The context object of the given diagram must be a fragment instance.
	 * The position and size of the fragment instance are extracted as 
	 * target bounds.
	 * 
	 * @param diagram the diagram to compute information from
	 */
	public void provideBounds(DiagramDescription diagram) {
		EObject context = diagram.getContext();
		for (EObject root : findUCLDIDiagram(context)) {
			for (Iterator<EObject> i = root.eAllContents(); i.hasNext();) {
				EObject next = i.next();
				if (next instanceof Node) {
					Node node = (Node) next;
					if (node.getElement().equals(context)) {
						LayoutConstraint layout = node.getLayoutConstraint();
						if (layout instanceof Location) {
							diagram.getTargetBounds().setX(
									((Location) layout).getX());
							diagram.getTargetBounds().setY(
									((Location) layout).getY());
						}
						if (layout instanceof Size) {
							diagram.getTargetBounds().setWidth(
									((Size) layout).getWidth());
							diagram.getTargetBounds().setHeight(
									((Size) layout).getHeight());
						}
						diagram.getTargetBounds().setMeasurementUnit(
								node.getDiagram().getMeasurementUnit().getValue());
					}
				}
			}
			if (root instanceof Diagram) {
				int mu = ((Diagram) root).getMeasurementUnit().getValue();
				diagram.getTargetBounds().setMeasurementUnit(mu);
			}
		}
	}

	private List<EObject> findUCLDIDiagram(EObject context) {
		if (context instanceof FragmentInstance) {
			FragmentInstance fragmentInstance = (FragmentInstance) context;
			Fragment cpAsFragment = ReuseResources.INSTANCE.getFragment(
					fragmentInstance.getCompositionProgram().getUCPI(), fragmentInstance.eResource().getResourceSet());
			if (cpAsFragment != null) {
				return cpAsFragment.getDiagrams();	
			}
		}
		return Collections.emptyList();
	}

}
