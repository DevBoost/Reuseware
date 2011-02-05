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
package org.reuseware.lacome.layoutlanguage.odt;


import java.util.Iterator;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.oasisopen.names.tc.opendocument.xmlns.text.SpanType;
import org.reuseware.lacome.Bounds;
import org.reuseware.lacome.CompositionDiagramUtil;
import org.reuseware.lacome.DiagramDescription;
import org.reuseware.lacome.provider.TargetDiagramInformationProvider;

/**
 * Provides information about the order of text fragments enclosed
 * by span type elements in a ODT model/document.
 */
public class ODTTargetDiagramInformationProvider implements
		TargetDiagramInformationProvider {

	
	/**
	 * @param diagram the diagram description
	 * 
	 * @return true if the context of the given diagram links to an ODT model
	 */
	public boolean canProvide(DiagramDescription diagram) {
		EObject context = diagram.getContext();
		return findOdt(context) != -1;
	}

	/**
	 * provides a position in the ODT test as model position
	 * attribute of the given diagram description.
	 * 
	 * @param diagram the diagram description
	 */
	public void provideBounds(DiagramDescription diagram) {
		EObject context = diagram.getContext();
		
		int spans = findOdt(context);
		
		if (spans != -1) {
			diagram.getTargetBounds().setY(spans * 20);
			diagram.getTargetBounds().setX(spans * 20);
			diagram.getTargetBounds().setModelPosition(spans);		
		}
		diagram.getTargetBounds().setMeasurementUnit(Bounds.MU_NULL);
	}
	
	/**
	 * Returns the position of a <code>SpanType</code> element
	 * taken from the ODT model referred to by the given context.
	 * 
	 * @param context the context
	 * @return position
	 */
	private int findOdt(EObject context) {
		if (!CompositionDiagramUtil.getDerivedFrom(context).isEmpty()) {
			
			EObject semanticElement = CompositionDiagramUtil.getDerivedFrom(context).get(0);
			
			if (!(semanticElement instanceof SpanType)) {	
				return -1;
			}
			EObject container = EcoreUtil.getRootContainer(semanticElement);
			
			EList<SpanType> spanList = new BasicEList<SpanType>();
			
			for (Iterator<EObject> i = container.eAllContents(); i.hasNext();) {
				EObject nextEl = i.next();
				
				if (nextEl instanceof SpanType) {
					SpanType span = (SpanType) nextEl;
					spanList.add(span);					
				}
			}
			return spanList.indexOf(semanticElement);
		}
		return -1;
	}

}
