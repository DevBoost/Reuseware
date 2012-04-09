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
package org.reuseware.lacome.provider;

import org.reuseware.lacome.DiagramDescription;

/**
 * Provides or computes additional information from a fragment diagram that is not 
 * directly contained in the diagram itself.
 * An implementation should initialize <code>FragmentDiagram.getSourceBounds()</code>
 * <p>
 * An implementation may depends on a specific layout language (e.g. GMF)
 */
public interface SourceDiagramInformationProvider {

	/**
	 * @param diagram the diagram to compute information from
	 * 
	 * @return true if this information provider can handle the given type of diagram
	 */
	boolean canProvide(DiagramDescription diagram);
	
	/**
	 * Compute the bounds of the given diagram.
	 * 
	 * @param diagram the diagram to compute information from
	 */
	void provideBounds(DiagramDescription diagram);
	
}
