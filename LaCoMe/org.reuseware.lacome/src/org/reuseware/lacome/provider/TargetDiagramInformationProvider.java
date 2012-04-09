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
 * Provides or computes additional information for a composed diagram 
 * that is not available from the composed target fragment alone.
 * An implementation should initialize <code>FragmentDiagram.getTargetBounds()</code>
 */
public interface TargetDiagramInformationProvider {
	
	/**
	 * @param diagram the diagram to compute information for.
	 * 
	 * @return true if this information provider can handle the given type of diagram
	 */
	boolean canProvide(DiagramDescription diagram);
	
	/**
	 * Computes the target bounds for the given diagram.
	 * 
	 * @param diagram the diagram to compute information for
	 */
	void provideBounds(DiagramDescription diagram);
}
