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
package org.reuseware.lacome;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;


/**
 * Information about a fragment diagram.
 */
public class DiagramDescription {

	/**
	 * ID of the default layout adjustment strategy.
	 */
	public static final String DEFAULT_STRATEGY_ID = "default";
	
	protected EList<EObject> contents;
	protected EList<EObject> diagramRoots;

	protected EObject context;
	
	protected Bounds sourceBounds;
	protected Bounds targetBounds;
	
	protected String strategy;
	
	/**
	 * Constructs a new diagram description.
	 * 
	 * @param contents     the semantic model behind the diagram 
	 * @param diagramRoots the diagram (i.e., the layout information)
	 * @param context      a context object that relates diagram and model to a
	 *                     target to which the layout should be adjusted
	 * @param strategy     a layout adjustment strategy
	 */
	public DiagramDescription(
			EList<EObject> contents, 
			EList<EObject> diagramRoots, 
			EObject context, 
			String strategy) {
		if (strategy == null || "".equals(strategy)) {
			strategy = DEFAULT_STRATEGY_ID;
		}
		this.contents     = contents;
		this.diagramRoots = diagramRoots;
		this.context = context;
		this.strategy = strategy;
		this.sourceBounds = new Bounds();
		this.targetBounds = new Bounds();
	}
	
	/**
	 * @return the semantic model
	 */
	public EList<EObject> getContents() {
		return contents;
	}
	
	/**
	 * @return the diagram information for the model
	 */
	public EList<EObject> getDiagramRoots() {
		return diagramRoots;
	}
	
	
	/**
	 * @return context object that provides the target information
	 */
	public EObject getContext() {
		return context;
	}

	/**
	 * @return The the source diagrams bounding box as computed from the diagram
	 */
	public Bounds getSourceBounds() {
		return sourceBounds;
	}

	/**
	 * @return The the target diagrams bounding box (e.g., fragment instance in a composition program diagram)
	 */
	public Bounds getTargetBounds() {
		return targetBounds;
	}

	/** 
	 * @return The layout asjustment strategy for this diagram
	 */
	public String getStrategy() {
		return strategy;
	}
	
}
