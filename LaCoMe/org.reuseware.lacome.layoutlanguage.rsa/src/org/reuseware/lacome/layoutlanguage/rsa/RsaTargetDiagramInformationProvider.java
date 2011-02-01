/*******************************************************************************
 * Copyright (c) 2006-2009
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
package org.reuseware.lacome.layoutlanguage.rsa;

import java.util.Iterator;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.LayoutConstraint;
import org.eclipse.gmf.runtime.notation.Location;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.Size;
import org.reuseware.lacome.CompositionDiagramUtil;
import org.reuseware.lacome.DiagramDescription;
import org.reuseware.lacome.provider.TargetDiagramInformationProvider;

/**
 * Target diagram information provider specialized for 
 * Rational Software Architect (RSA). In RSA, GMF diagrams
 * are stored in annotations in RSA UML (*.emx) model files.
 * This information provider reads this information.
 */
public class RsaTargetDiagramInformationProvider implements
		TargetDiagramInformationProvider {

	/**
	 * @param diagram the RSA model with diagram annotations (@uml2.diagrams)
	 * @return true if GMF annotations are found in the diagram
	 */
	public boolean canProvide(DiagramDescription diagram) {
		EObject context = diagram.getContext();
		return null != findNode(context);
	}
	
	/**
	 * @param diagram the RSA model with diagram annotations (@uml2.diagrams)
	 */
	public void provideBounds(DiagramDescription diagram) {
		EObject context = diagram.getContext();
		Node node = findNode(context);
		if (node != null) {
			LayoutConstraint layout = node.getLayoutConstraint();
			if (layout instanceof Location) {
				diagram.getTargetBounds().setX(((Location) layout).getX());
				diagram.getTargetBounds().setY(((Location) layout).getY());
			}
			if (layout instanceof Size) {
				diagram.getTargetBounds().setWidth(((Size) layout).getWidth());
				diagram.getTargetBounds().setHeight(((Size) layout).getHeight());
			}
			diagram.getTargetBounds().setMeasurementUnit(
					node.getDiagram().getMeasurementUnit().getValue());
		}
	}
	
	private Node findNode(EObject context) {
		if (!CompositionDiagramUtil.getDerivedFrom(context).isEmpty()) {
			EObject semanticElement = CompositionDiagramUtil.getDerivedFrom(context).get(0);
			if (!(semanticElement instanceof EModelElement)) {
				return null;
			}
			EModelElement container = (EModelElement) semanticElement;
			Diagram diagram = null;
			while (container != null && diagram == null) {
				EAnnotation diagramAnnotation = container.getEAnnotation("uml2.diagrams");
				if (diagramAnnotation != null && !diagramAnnotation.getContents().isEmpty()) {
					diagram = (Diagram) diagramAnnotation.getContents().get(0);
				}
				container = (EModelElement) container.eContainer();
			}
			
			if (diagram != null) {
				for (Iterator<EObject> i = diagram.eAllContents(); i.hasNext();) {
					EObject next = i.next();
					if (next instanceof Node) {
						Node node = (Node) next;
						if (node.getElement().equals(semanticElement)) {
							return node;
						}
					}
				}
			}
		}
		return null;
	}

}
